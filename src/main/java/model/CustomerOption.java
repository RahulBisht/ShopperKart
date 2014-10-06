package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the customer_option database table.
 * 
 */
@Entity
@Table(name="customer_option")
@NamedQuery(name="CustomerOption.findAll", query="SELECT c FROM CustomerOption c")
public class CustomerOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_OPTION_ID")
	private String customerOptionId;

	@Column(name="CUSTOMER_OPT_ACTIVE")
	private byte customerOptActive;

	@Column(name="CUSTOMER_OPT_CODE")
	private String customerOptCode;

	@Column(name="CUSTOMER_OPT_PUBLIC")
	private byte customerOptPublic;

	@Column(name="CUSTOMER_OPTION_TYPE")
	private String customerOptionType;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	//bi-directional many-to-one association to CustomerAttribute
	@OneToMany(mappedBy="customerOption")
	private List<CustomerAttribute> customerAttributes;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to CustomerOptionDesc
	@OneToMany(mappedBy="customerOption")
	private List<CustomerOptionDesc> customerOptionDescs;

	//bi-directional many-to-one association to CustomerOptionSet
	@OneToMany(mappedBy="customerOption")
	private List<CustomerOptionSet> customerOptionSets;

	public CustomerOption() {
	}

	public String getCustomerOptionId() {
		return this.customerOptionId;
	}

	public void setCustomerOptionId(String customerOptionId) {
		this.customerOptionId = customerOptionId;
	}

	public byte getCustomerOptActive() {
		return this.customerOptActive;
	}

	public void setCustomerOptActive(byte customerOptActive) {
		this.customerOptActive = customerOptActive;
	}

	public String getCustomerOptCode() {
		return this.customerOptCode;
	}

	public void setCustomerOptCode(String customerOptCode) {
		this.customerOptCode = customerOptCode;
	}

	public byte getCustomerOptPublic() {
		return this.customerOptPublic;
	}

	public void setCustomerOptPublic(byte customerOptPublic) {
		this.customerOptPublic = customerOptPublic;
	}

	public String getCustomerOptionType() {
		return this.customerOptionType;
	}

	public void setCustomerOptionType(String customerOptionType) {
		this.customerOptionType = customerOptionType;
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
		customerAttribute.setCustomerOption(this);

		return customerAttribute;
	}

	public CustomerAttribute removeCustomerAttribute(CustomerAttribute customerAttribute) {
		getCustomerAttributes().remove(customerAttribute);
		customerAttribute.setCustomerOption(null);

		return customerAttribute;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public List<CustomerOptionDesc> getCustomerOptionDescs() {
		return this.customerOptionDescs;
	}

	public void setCustomerOptionDescs(List<CustomerOptionDesc> customerOptionDescs) {
		this.customerOptionDescs = customerOptionDescs;
	}

	public CustomerOptionDesc addCustomerOptionDesc(CustomerOptionDesc customerOptionDesc) {
		getCustomerOptionDescs().add(customerOptionDesc);
		customerOptionDesc.setCustomerOption(this);

		return customerOptionDesc;
	}

	public CustomerOptionDesc removeCustomerOptionDesc(CustomerOptionDesc customerOptionDesc) {
		getCustomerOptionDescs().remove(customerOptionDesc);
		customerOptionDesc.setCustomerOption(null);

		return customerOptionDesc;
	}

	public List<CustomerOptionSet> getCustomerOptionSets() {
		return this.customerOptionSets;
	}

	public void setCustomerOptionSets(List<CustomerOptionSet> customerOptionSets) {
		this.customerOptionSets = customerOptionSets;
	}

	public CustomerOptionSet addCustomerOptionSet(CustomerOptionSet customerOptionSet) {
		getCustomerOptionSets().add(customerOptionSet);
		customerOptionSet.setCustomerOption(this);

		return customerOptionSet;
	}

	public CustomerOptionSet removeCustomerOptionSet(CustomerOptionSet customerOptionSet) {
		getCustomerOptionSets().remove(customerOptionSet);
		customerOptionSet.setCustomerOption(null);

		return customerOptionSet;
	}

}