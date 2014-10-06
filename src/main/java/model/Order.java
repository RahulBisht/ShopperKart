package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private String orderId;

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

	@Column(name="CARD_TYPE")
	private String cardType;

	@Column(name="CC_CVV")
	private String ccCvv;

	@Column(name="CC_EXPIRES")
	private String ccExpires;

	@Column(name="CC_NUMBER")
	private String ccNumber;

	@Column(name="CC_OWNER")
	private String ccOwner;

	private String channel;

	@Column(name="CURRENCY_VALUE")
	private BigDecimal currencyValue;

	@Column(name="CUSTOMER_EMAIL_ADDRESS")
	private String customerEmailAddress;

	@Column(name="CUSTOMER_ID")
	private BigInteger customerId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_PURCHASED")
	private Date datePurchased;

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

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_MODIFIED")
	private Date lastModified;

	private String locale;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ORDER_DATE_FINISHED")
	private Date orderDateFinished;

	@Column(name="ORDER_STATUS")
	private String orderStatus;

	@Column(name="ORDER_TOTAL")
	private BigDecimal orderTotal;

	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="PAYMENT_MODULE_CODE")
	private String paymentModuleCode;

	@Column(name="PAYMENT_TYPE")
	private String paymentType;

	@Column(name="SHIPPING_MODULE_CODE")
	private String shippingModuleCode;

	//bi-directional many-to-one association to OrderAccount
	@OneToMany(mappedBy="order")
	private List<OrderAccount> orderAccounts;

	//bi-directional many-to-one association to OrderProduct
	@OneToMany(mappedBy="order")
	private List<OrderProduct> orderProducts;

	//bi-directional many-to-one association to OrderStatusHistory
	@OneToMany(mappedBy="order")
	private List<OrderStatusHistory> orderStatusHistories;

	//bi-directional many-to-one association to OrderTotal
	@OneToMany(mappedBy="order")
	private List<OrderTotal> orderTotals;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANTID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="BILLING_COUNTRY_ID")
	private Country country1;

	//bi-directional many-to-one association to Currency
	@ManyToOne
	@JoinColumn(name="CURRENCY_ID")
	private Currency currency;

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

	//bi-directional many-to-one association to SmTransaction
	@OneToMany(mappedBy="order")
	private List<SmTransaction> smTransactions;

	public Order() {
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCcCvv() {
		return this.ccCvv;
	}

	public void setCcCvv(String ccCvv) {
		this.ccCvv = ccCvv;
	}

	public String getCcExpires() {
		return this.ccExpires;
	}

	public void setCcExpires(String ccExpires) {
		this.ccExpires = ccExpires;
	}

	public String getCcNumber() {
		return this.ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCcOwner() {
		return this.ccOwner;
	}

	public void setCcOwner(String ccOwner) {
		this.ccOwner = ccOwner;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public BigDecimal getCurrencyValue() {
		return this.currencyValue;
	}

	public void setCurrencyValue(BigDecimal currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getCustomerEmailAddress() {
		return this.customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public BigInteger getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(BigInteger customerId) {
		this.customerId = customerId;
	}

	public Date getDatePurchased() {
		return this.datePurchased;
	}

	public void setDatePurchased(Date datePurchased) {
		this.datePurchased = datePurchased;
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

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Date getOrderDateFinished() {
		return this.orderDateFinished;
	}

	public void setOrderDateFinished(Date orderDateFinished) {
		this.orderDateFinished = orderDateFinished;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public BigDecimal getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPaymentModuleCode() {
		return this.paymentModuleCode;
	}

	public void setPaymentModuleCode(String paymentModuleCode) {
		this.paymentModuleCode = paymentModuleCode;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getShippingModuleCode() {
		return this.shippingModuleCode;
	}

	public void setShippingModuleCode(String shippingModuleCode) {
		this.shippingModuleCode = shippingModuleCode;
	}

	public List<OrderAccount> getOrderAccounts() {
		return this.orderAccounts;
	}

	public void setOrderAccounts(List<OrderAccount> orderAccounts) {
		this.orderAccounts = orderAccounts;
	}

	public OrderAccount addOrderAccount(OrderAccount orderAccount) {
		getOrderAccounts().add(orderAccount);
		orderAccount.setOrder(this);

		return orderAccount;
	}

	public OrderAccount removeOrderAccount(OrderAccount orderAccount) {
		getOrderAccounts().remove(orderAccount);
		orderAccount.setOrder(null);

		return orderAccount;
	}

	public List<OrderProduct> getOrderProducts() {
		return this.orderProducts;
	}

	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

	public OrderProduct addOrderProduct(OrderProduct orderProduct) {
		getOrderProducts().add(orderProduct);
		orderProduct.setOrder(this);

		return orderProduct;
	}

	public OrderProduct removeOrderProduct(OrderProduct orderProduct) {
		getOrderProducts().remove(orderProduct);
		orderProduct.setOrder(null);

		return orderProduct;
	}

	public List<OrderStatusHistory> getOrderStatusHistories() {
		return this.orderStatusHistories;
	}

	public void setOrderStatusHistories(List<OrderStatusHistory> orderStatusHistories) {
		this.orderStatusHistories = orderStatusHistories;
	}

	public OrderStatusHistory addOrderStatusHistory(OrderStatusHistory orderStatusHistory) {
		getOrderStatusHistories().add(orderStatusHistory);
		orderStatusHistory.setOrder(this);

		return orderStatusHistory;
	}

	public OrderStatusHistory removeOrderStatusHistory(OrderStatusHistory orderStatusHistory) {
		getOrderStatusHistories().remove(orderStatusHistory);
		orderStatusHistory.setOrder(null);

		return orderStatusHistory;
	}

	public List<OrderTotal> getOrderTotals() {
		return this.orderTotals;
	}

	public void setOrderTotals(List<OrderTotal> orderTotals) {
		this.orderTotals = orderTotals;
	}

	public OrderTotal addOrderTotal(OrderTotal orderTotal) {
		getOrderTotals().add(orderTotal);
		orderTotal.setOrder(this);

		return orderTotal;
	}

	public OrderTotal removeOrderTotal(OrderTotal orderTotal) {
		getOrderTotals().remove(orderTotal);
		orderTotal.setOrder(null);

		return orderTotal;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public Country getCountry1() {
		return this.country1;
	}

	public void setCountry1(Country country1) {
		this.country1 = country1;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
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

	public List<SmTransaction> getSmTransactions() {
		return this.smTransactions;
	}

	public void setSmTransactions(List<SmTransaction> smTransactions) {
		this.smTransactions = smTransactions;
	}

	public SmTransaction addSmTransaction(SmTransaction smTransaction) {
		getSmTransactions().add(smTransaction);
		smTransaction.setOrder(this);

		return smTransaction;
	}

	public SmTransaction removeSmTransaction(SmTransaction smTransaction) {
		getSmTransactions().remove(smTransaction);
		smTransaction.setOrder(null);

		return smTransaction;
	}

}