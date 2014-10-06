package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_option_set database table.
 * 
 */
@Entity
@Table(name="customer_option_set")
@NamedQuery(name="CustomerOptionSet.findAll", query="SELECT c FROM CustomerOptionSet c")
public class CustomerOptionSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_OPTIONSET_ID")
	private String customerOptionsetId;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	//bi-directional many-to-one association to CustomerOptionValue
	@ManyToOne
	@JoinColumn(name="CUSTOMER_OPTION_VALUE_ID")
	private CustomerOptionValue customerOptionValue;

	//bi-directional many-to-one association to CustomerOption
	@ManyToOne
	@JoinColumn(name="CUSTOMER_OPTION_ID")
	private CustomerOption customerOption;

	public CustomerOptionSet() {
	}

	public String getCustomerOptionsetId() {
		return this.customerOptionsetId;
	}

	public void setCustomerOptionsetId(String customerOptionsetId) {
		this.customerOptionsetId = customerOptionsetId;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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