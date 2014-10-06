package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the customer_option_value database table.
 * 
 */
@Entity
@Table(name="customer_option_value")
@NamedQuery(name="CustomerOptionValue.findAll", query="SELECT c FROM CustomerOptionValue c")
public class CustomerOptionValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_OPTION_VALUE_ID")
	private String customerOptionValueId;

	@Column(name="CUSTOMER_OPT_VAL_CODE")
	private String customerOptValCode;

	@Column(name="CUSTOMER_OPT_VAL_IMAGE")
	private String customerOptValImage;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	//bi-directional many-to-one association to CustomerAttribute
	@OneToMany(mappedBy="customerOptionValue")
	private List<CustomerAttribute> customerAttributes;

	//bi-directional many-to-one association to CustomerOptValDescription
	@OneToMany(mappedBy="customerOptionValue")
	private List<CustomerOptValDescription> customerOptValDescriptions;

	//bi-directional many-to-one association to CustomerOptionSet
	@OneToMany(mappedBy="customerOptionValue")
	private List<CustomerOptionSet> customerOptionSets;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	public CustomerOptionValue() {
	}

	public String getCustomerOptionValueId() {
		return this.customerOptionValueId;
	}

	public void setCustomerOptionValueId(String customerOptionValueId) {
		this.customerOptionValueId = customerOptionValueId;
	}

	public String getCustomerOptValCode() {
		return this.customerOptValCode;
	}

	public void setCustomerOptValCode(String customerOptValCode) {
		this.customerOptValCode = customerOptValCode;
	}

	public String getCustomerOptValImage() {
		return this.customerOptValImage;
	}

	public void setCustomerOptValImage(String customerOptValImage) {
		this.customerOptValImage = customerOptValImage;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public List<CustomerAttribute> getCustomerAttributes() {
		return this.customerAttributes;
	}

	public void setCustomerAttributes(List<CustomerAttribute> customerAttributes) {
		this.customerAttributes = customerAttributes;
	}

	public CustomerAttribute addCustomerAttribute(CustomerAttribute customerAttribute) {
		getCustomerAttributes().add(customerAttribute);
		customerAttribute.setCustomerOptionValue(this);

		return customerAttribute;
	}

	public CustomerAttribute removeCustomerAttribute(CustomerAttribute customerAttribute) {
		getCustomerAttributes().remove(customerAttribute);
		customerAttribute.setCustomerOptionValue(null);

		return customerAttribute;
	}

	public List<CustomerOptValDescription> getCustomerOptValDescriptions() {
		return this.customerOptValDescriptions;
	}

	public void setCustomerOptValDescriptions(List<CustomerOptValDescription> customerOptValDescriptions) {
		this.customerOptValDescriptions = customerOptValDescriptions;
	}

	public CustomerOptValDescription addCustomerOptValDescription(CustomerOptValDescription customerOptValDescription) {
		getCustomerOptValDescriptions().add(customerOptValDescription);
		customerOptValDescription.setCustomerOptionValue(this);

		return customerOptValDescription;
	}

	public CustomerOptValDescription removeCustomerOptValDescription(CustomerOptValDescription customerOptValDescription) {
		getCustomerOptValDescriptions().remove(customerOptValDescription);
		customerOptValDescription.setCustomerOptionValue(null);

		return customerOptValDescription;
	}

	public List<CustomerOptionSet> getCustomerOptionSets() {
		return this.customerOptionSets;
	}

	public void setCustomerOptionSets(List<CustomerOptionSet> customerOptionSets) {
		this.customerOptionSets = customerOptionSets;
	}

	public CustomerOptionSet addCustomerOptionSet(CustomerOptionSet customerOptionSet) {
		getCustomerOptionSets().add(customerOptionSet);
		customerOptionSet.setCustomerOptionValue(this);

		return customerOptionSet;
	}

	public CustomerOptionSet removeCustomerOptionSet(CustomerOptionSet customerOptionSet) {
		getCustomerOptionSets().remove(customerOptionSet);
		customerOptionSet.setCustomerOptionValue(null);

		return customerOptionSet;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

}