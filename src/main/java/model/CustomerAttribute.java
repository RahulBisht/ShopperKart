package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_attribute database table.
 * 
 */
@Entity
@Table(name="customer_attribute")
@NamedQuery(name="CustomerAttribute.findAll", query="SELECT c FROM CustomerAttribute c")
public class CustomerAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ATTRIBUTE_ID")
	private String customerAttributeId;

	@Column(name="CUSTOMER_ATTR_TXT_VAL")
	private String customerAttrTxtVal;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;

	//bi-directional many-to-one association to CustomerOptionValue
	@ManyToOne
	@JoinColumn(name="OPTION_VALUE_ID")
	private CustomerOptionValue customerOptionValue;

	//bi-directional many-to-one association to CustomerOption
	@ManyToOne
	@JoinColumn(name="OPTION_ID")
	private CustomerOption customerOption;

	public CustomerAttribute() {
	}

	public String getCustomerAttributeId() {
		return this.customerAttributeId;
	}

	public void setCustomerAttributeId(String customerAttributeId) {
		this.customerAttributeId = customerAttributeId;
	}

	public String getCustomerAttrTxtVal() {
		return this.customerAttrTxtVal;
	}

	public void setCustomerAttrTxtVal(String customerAttrTxtVal) {
		this.customerAttrTxtVal = customerAttrTxtVal;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerOptionValue getCustomerOptionValue() {
		return this.customerOptionValue;
	}

	public void setCustomerOptionValue(CustomerOptionValue customerOptionValue) {
		this.customerOptionValue = customerOptionValue;
	}

	public CustomerOption getCustomerOption() {
		return this.customerOption;
	}

	public void setCustomerOption(CustomerOption customerOption) {
		this.customerOption = customerOption;
	}

}