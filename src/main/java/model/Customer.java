package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="BILLING_CITY")
	private String billingCity;

	@Column(name="BILLING_COMPANY")
	private String billingCompany;

	@Column(name="BILLING_FIRST_NAME")
	private String billingFirstName;

	@Column(name="BILLING_LAST_NAME")
	private String billingLastName;

	@Column(name="BILLING_POSTCODE")
	private String billingPostcode;

	@Column(name="BILLING_STATE")
	private String billingState;

	@Column(name="BILLING_STREET_ADDRESS")
	private String billingStreetAddress;

	@Column(name="BILLING_TELEPHONE")
	private String billingTelephone;

	@Column(name="CUSTOMER_ANONYMOUS")
	private byte customerAnonymous;

	@Column(name="CUSTOMER_COMPANY")
	private String customerCompany;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CUSTOMER_DOB")
	private Date customerDob;

	@Column(name="CUSTOMER_EMAIL_ADDRESS")
	private String customerEmailAddress;

	@Column(name="CUSTOMER_GENDER")
	private String customerGender;

	@Column(name="CUSTOMER_NICK")
	private String customerNick;

	@Column(name="CUSTOMER_PASSWORD")
	private String customerPassword;

	@Column(name="DELIVERY_CITY")
	private String deliveryCity;

	@Column(name="DELIVERY_COMPANY")
	private String deliveryCompany;

	@Column(name="DELIVERY_FIRST_NAME")
	private String deliveryFirstName;

	@Column(name="DELIVERY_LAST_NAME")
	private String deliveryLastName;

	@Column(name="DELIVERY_POSTCODE")
	private String deliveryPostcode;

	@Column(name="DELIVERY_STATE")
	private String deliveryState;

	@Column(name="DELIVERY_STREET_ADDRESS")
	private String deliveryStreetAddress;

	@Column(name="DELIVERY_TELEPHONE")
	private String deliveryTelephone;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="BILLING_COUNTRY_ID")
	private Country country1;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="DELIVERY_COUNTRY_ID")
	private Country country2;

	//bi-directional many-to-one association to Zone
	@ManyToOne
	@JoinColumn(name="BILLING_ZONE_ID")
	private Zone zone1;

	//bi-directional many-to-one association to Zone
	@ManyToOne
	@JoinColumn(name="DELIVERY_ZONE_ID")
	private Zone zone2;

	//bi-directional many-to-one association to CustomerAttribute
	@OneToMany(mappedBy="customer")
	private List<CustomerAttribute> customerAttributes;

	//bi-directional many-to-many association to SmGroup
	@ManyToMany(mappedBy="customers")
	private List<SmGroup> smGroups;

	//bi-directional many-to-one association to ProductReview
	@OneToMany(mappedBy="customer")
	private List<ProductReview> productReviews;

	public Customer() {
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBillingCity() {
		return this.billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingCompany() {
		return this.billingCompany;
	}

	public void setBillingCompany(String billingCompany) {
		this.billingCompany = billingCompany;
	}

	public String getBillingFirstName() {
		return this.billingFirstName;
	}

	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}

	public String getBillingLastName() {
		return this.billingLastName;
	}

	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}

	public String getBillingPostcode() {
		return this.billingPostcode;
	}

	public void setBillingPostcode(String billingPostcode) {
		this.billingPostcode = billingPostcode;
	}

	public String getBillingState() {
		return this.billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingStreetAddress() {
		return this.billingStreetAddress;
	}

	public void setBillingStreetAddress(String billingStreetAddress) {
		this.billingStreetAddress = billingStreetAddress;
	}

	public String getBillingTelephone() {
		return this.billingTelephone;
	}

	public void setBillingTelephone(String billingTelephone) {
		this.billingTelephone = billingTelephone;
	}

	public byte getCustomerAnonymous() {
		return this.customerAnonymous;
	}

	public void setCustomerAnonymous(byte customerAnonymous) {
		this.customerAnonymous = customerAnonymous;
	}

	public String getCustomerCompany() {
		return this.customerCompany;
	}

	public void setCustomerCompany(String customerCompany) {
		this.customerCompany = customerCompany;
	}

	public Date getCustomerDob() {
		return this.customerDob;
	}

	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}

	public String getCustomerEmailAddress() {
		return this.customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerGender() {
		return this.customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerNick() {
		return this.customerNick;
	}

	public void setCustomerNick(String customerNick) {
		this.customerNick = customerNick;
	}

	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getDeliveryCity() {
		return this.deliveryCity;
	}

	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}

	public String getDeliveryCompany() {
		return this.deliveryCompany;
	}

	public void setDeliveryCompany(String deliveryCompany) {
		this.deliveryCompany = deliveryCompany;
	}

	public String getDeliveryFirstName() {
		return this.deliveryFirstName;
	}

	public void setDeliveryFirstName(String deliveryFirstName) {
		this.deliveryFirstName = deliveryFirstName;
	}

	public String getDeliveryLastName() {
		return this.deliveryLastName;
	}

	public void setDeliveryLastName(String deliveryLastName) {
		this.deliveryLastName = deliveryLastName;
	}

	public String getDeliveryPostcode() {
		return this.deliveryPostcode;
	}

	public void setDeliveryPostcode(String deliveryPostcode) {
		this.deliveryPostcode = deliveryPostcode;
	}

	public String getDeliveryState() {
		return this.deliveryState;
	}

	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}

	public String getDeliveryStreetAddress() {
		return this.deliveryStreetAddress;
	}

	public void setDeliveryStreetAddress(String deliveryStreetAddress) {
		this.deliveryStreetAddress = deliveryStreetAddress;
	}

	public String getDeliveryTelephone() {
		return this.deliveryTelephone;
	}

	public void setDeliveryTelephone(String deliveryTelephone) {
		this.deliveryTelephone = deliveryTelephone;
	}

	public Country getCountry1() {
		return this.country1;
	}

	public void setCountry1(Country country1) {
		this.country1 = country1;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Country getCountry2() {
		return this.country2;
	}

	public void setCountry2(Country country2) {
		this.country2 = country2;
	}

	public Zone getZone1() {
		return this.zone1;
	}

	public void setZone1(Zone zone1) {
		this.zone1 = zone1;
	}

	public Zone getZone2() {
		return this.zone2;
	}

	public void setZone2(Zone zone2) {
		this.zone2 = zone2;
	}

	public List<CustomerAttribute> getCustomerAttributes() {
		return this.customerAttributes;
	}

	public void setCustomerAttributes(List<CustomerAttribute> customerAttributes) {
		this.customerAttributes = customerAttributes;
	}

	public CustomerAttribute addCustomerAttribute(CustomerAttribute customerAttribute) {
		getCustomerAttributes().add(customerAttribute);
		customerAttribute.setCustomer(this);

		return customerAttribute;
	}

	public CustomerAttribute removeCustomerAttribute(CustomerAttribute customerAttribute) {
		getCustomerAttributes().remove(customerAttribute);
		customerAttribute.setCustomer(null);

		return customerAttribute;
	}

	public List<SmGroup> getSmGroups() {
		return this.smGroups;
	}

	public void setSmGroups(List<SmGroup> smGroups) {
		this.smGroups = smGroups;
	}

	public List<ProductReview> getProductReviews() {
		return this.productReviews;
	}

	public void setProductReviews(List<ProductReview> productReviews) {
		this.productReviews = productReviews;
	}

	public ProductReview addProductReview(ProductReview productReview) {
		getProductReviews().add(productReview);
		productReview.setCustomer(this);

		return productReview;
	}

	public ProductReview removeProductReview(ProductReview productReview) {
		getProductReviews().remove(productReview);
		productReview.setCustomer(null);

		return productReview;
	}

}