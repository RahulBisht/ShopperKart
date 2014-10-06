package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the merchant_store database table.
 * 
 */
@Entity
@Table(name="merchant_store")
@NamedQuery(name="MerchantStore.findAll", query="SELECT m FROM MerchantStore m")
public class MerchantStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MERCHANT_ID")
	private int merchantId;

	private String continueshoppingurl;

	@Column(name="CURRENCY_FORMAT_NATIONAL")
	private byte currencyFormatNational;

	@Column(name="DOMAIN_NAME")
	private String domainName;

	@Temporal(TemporalType.DATE)
	@Column(name="IN_BUSINESS_SINCE")
	private Date inBusinessSince;

	@Column(name="INVOICE_TEMPLATE")
	private String invoiceTemplate;

	private String seizeunitcode;

	@Column(name="STORE_ADDRESS")
	private String storeAddress;

	@Column(name="STORE_CITY")
	private String storeCity;

	@Column(name="STORE_CODE")
	private String storeCode;

	@Column(name="STORE_EMAIL")
	private String storeEmail;

	@Column(name="STORE_LOGO")
	private String storeLogo;

	@Column(name="STORE_NAME")
	private String storeName;

	@Column(name="STORE_PHONE")
	private String storePhone;

	@Column(name="STORE_POSTAL_CODE")
	private String storePostalCode;

	@Column(name="STORE_STATE_PROV")
	private String storeStateProv;

	@Column(name="STORE_TEMPLATE")
	private String storeTemplate;

	@Column(name="USE_CACHE")
	private byte useCache;

	private String weightunitcode;

	//bi-directional many-to-one association to Category
	@OneToMany(mappedBy="merchantStore")
	private List<Category> categories;

	//bi-directional many-to-one association to Content
	@OneToMany(mappedBy="merchantStore")
	private List<Content> contents;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="merchantStore")
	private List<Customer> customers;

	//bi-directional many-to-one association to CustomerOption
	@OneToMany(mappedBy="merchantStore")
	private List<CustomerOption> customerOptions;

	//bi-directional many-to-one association to CustomerOptionValue
	@OneToMany(mappedBy="merchantStore")
	private List<CustomerOptionValue> customerOptionValues;

	//bi-directional many-to-one association to FileHistory
	@OneToMany(mappedBy="merchantStore")
	private List<FileHistory> fileHistories;

	//bi-directional many-to-one association to Manufacturer
	@OneToMany(mappedBy="merchantStore")
	private List<Manufacturer> manufacturers;

	//bi-directional many-to-one association to MerchantConfiguration
	@OneToMany(mappedBy="merchantStore")
	private List<MerchantConfiguration> merchantConfigurations;

	//bi-directional many-to-many association to Language
	@ManyToMany(mappedBy="merchantStores1")
	private List<Language> languages;

	//bi-directional many-to-one association to MerchantLog
	@OneToMany(mappedBy="merchantStore")
	private List<MerchantLog> merchantLogs;

	//bi-directional many-to-one association to Currency
	@ManyToOne
	@JoinColumn(name="CURRENCY_ID")
	private Currency currency;

	//bi-directional many-to-one association to Zone
	@ManyToOne
	@JoinColumn(name="ZONE_ID")
	private Zone zone;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID")
	private Country country;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="merchantStore")
	private List<Order> orders;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="merchantStore")
	private List<Product> products;

	//bi-directional many-to-one association to ProductOption
	@OneToMany(mappedBy="merchantStore")
	private List<ProductOption> productOptions;

	//bi-directional many-to-one association to ProductOptionValue
	@OneToMany(mappedBy="merchantStore")
	private List<ProductOptionValue> productOptionValues;

	//bi-directional many-to-one association to ProductRelationship
	@OneToMany(mappedBy="merchantStore")
	private List<ProductRelationship> productRelationships;

	//bi-directional many-to-one association to ShoppingCart
	@OneToMany(mappedBy="merchantStore")
	private List<ShoppingCart> shoppingCarts;

	//bi-directional many-to-one association to SystemNotification
	@OneToMany(mappedBy="merchantStore")
	private List<SystemNotification> systemNotifications;

	//bi-directional many-to-one association to TaxClass
	@OneToMany(mappedBy="merchantStore")
	private List<TaxClass> taxClasses;

	//bi-directional many-to-one association to TaxRate
	@OneToMany(mappedBy="merchantStore")
	private List<TaxRate> taxRates;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="merchantStore")
	private List<User> users;

	public MerchantStore() {
	}

	public int getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getContinueshoppingurl() {
		return this.continueshoppingurl;
	}

	public void setContinueshoppingurl(String continueshoppingurl) {
		this.continueshoppingurl = continueshoppingurl;
	}

	public byte getCurrencyFormatNational() {
		return this.currencyFormatNational;
	}

	public void setCurrencyFormatNational(byte currencyFormatNational) {
		this.currencyFormatNational = currencyFormatNational;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public Date getInBusinessSince() {
		return this.inBusinessSince;
	}

	public void setInBusinessSince(Date inBusinessSince) {
		this.inBusinessSince = inBusinessSince;
	}

	public String getInvoiceTemplate() {
		return this.invoiceTemplate;
	}

	public void setInvoiceTemplate(String invoiceTemplate) {
		this.invoiceTemplate = invoiceTemplate;
	}

	public String getSeizeunitcode() {
		return this.seizeunitcode;
	}

	public void setSeizeunitcode(String seizeunitcode) {
		this.seizeunitcode = seizeunitcode;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreCity() {
		return this.storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreEmail() {
		return this.storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public String getStoreLogo() {
		return this.storeLogo;
	}

	public void setStoreLogo(String storeLogo) {
		this.storeLogo = storeLogo;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStorePhone() {
		return this.storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

	public String getStorePostalCode() {
		return this.storePostalCode;
	}

	public void setStorePostalCode(String storePostalCode) {
		this.storePostalCode = storePostalCode;
	}

	public String getStoreStateProv() {
		return this.storeStateProv;
	}

	public void setStoreStateProv(String storeStateProv) {
		this.storeStateProv = storeStateProv;
	}

	public String getStoreTemplate() {
		return this.storeTemplate;
	}

	public void setStoreTemplate(String storeTemplate) {
		this.storeTemplate = storeTemplate;
	}

	public byte getUseCache() {
		return this.useCache;
	}

	public void setUseCache(byte useCache) {
		this.useCache = useCache;
	}

	public String getWeightunitcode() {
		return this.weightunitcode;
	}

	public void setWeightunitcode(String weightunitcode) {
		this.weightunitcode = weightunitcode;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category addCategory(Category category) {
		getCategories().add(category);
		category.setMerchantStore(this);

		return category;
	}

	public Category removeCategory(Category category) {
		getCategories().remove(category);
		category.setMerchantStore(null);

		return category;
	}

	public List<Content> getContents() {
		return this.contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public Content addContent(Content content) {
		getContents().add(content);
		content.setMerchantStore(this);

		return content;
	}

	public Content removeContent(Content content) {
		getContents().remove(content);
		content.setMerchantStore(null);

		return content;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setMerchantStore(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setMerchantStore(null);

		return customer;
	}

	public List<CustomerOption> getCustomerOptions() {
		return this.customerOptions;
	}

	public void setCustomerOptions(List<CustomerOption> customerOptions) {
		this.customerOptions = customerOptions;
	}

	public CustomerOption addCustomerOption(CustomerOption customerOption) {
		getCustomerOptions().add(customerOption);
		customerOption.setMerchantStore(this);

		return customerOption;
	}

	public CustomerOption removeCustomerOption(CustomerOption customerOption) {
		getCustomerOptions().remove(customerOption);
		customerOption.setMerchantStore(null);

		return customerOption;
	}

	public List<CustomerOptionValue> getCustomerOptionValues() {
		return this.customerOptionValues;
	}

	public void setCustomerOptionValues(List<CustomerOptionValue> customerOptionValues) {
		this.customerOptionValues = customerOptionValues;
	}

	public CustomerOptionValue addCustomerOptionValue(CustomerOptionValue customerOptionValue) {
		getCustomerOptionValues().add(customerOptionValue);
		customerOptionValue.setMerchantStore(this);

		return customerOptionValue;
	}

	public CustomerOptionValue removeCustomerOptionValue(CustomerOptionValue customerOptionValue) {
		getCustomerOptionValues().remove(customerOptionValue);
		customerOptionValue.setMerchantStore(null);

		return customerOptionValue;
	}

	public List<FileHistory> getFileHistories() {
		return this.fileHistories;
	}

	public void setFileHistories(List<FileHistory> fileHistories) {
		this.fileHistories = fileHistories;
	}

	public FileHistory addFileHistory(FileHistory fileHistory) {
		getFileHistories().add(fileHistory);
		fileHistory.setMerchantStore(this);

		return fileHistory;
	}

	public FileHistory removeFileHistory(FileHistory fileHistory) {
		getFileHistories().remove(fileHistory);
		fileHistory.setMerchantStore(null);

		return fileHistory;
	}

	public List<Manufacturer> getManufacturers() {
		return this.manufacturers;
	}

	public void setManufacturers(List<Manufacturer> manufacturers) {
		this.manufacturers = manufacturers;
	}

	public Manufacturer addManufacturer(Manufacturer manufacturer) {
		getManufacturers().add(manufacturer);
		manufacturer.setMerchantStore(this);

		return manufacturer;
	}

	public Manufacturer removeManufacturer(Manufacturer manufacturer) {
		getManufacturers().remove(manufacturer);
		manufacturer.setMerchantStore(null);

		return manufacturer;
	}

	public List<MerchantConfiguration> getMerchantConfigurations() {
		return this.merchantConfigurations;
	}

	public void setMerchantConfigurations(List<MerchantConfiguration> merchantConfigurations) {
		this.merchantConfigurations = merchantConfigurations;
	}

	public MerchantConfiguration addMerchantConfiguration(MerchantConfiguration merchantConfiguration) {
		getMerchantConfigurations().add(merchantConfiguration);
		merchantConfiguration.setMerchantStore(this);

		return merchantConfiguration;
	}

	public MerchantConfiguration removeMerchantConfiguration(MerchantConfiguration merchantConfiguration) {
		getMerchantConfigurations().remove(merchantConfiguration);
		merchantConfiguration.setMerchantStore(null);

		return merchantConfiguration;
	}

	public List<Language> getLanguages() {
		return this.languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<MerchantLog> getMerchantLogs() {
		return this.merchantLogs;
	}

	public void setMerchantLogs(List<MerchantLog> merchantLogs) {
		this.merchantLogs = merchantLogs;
	}

	public MerchantLog addMerchantLog(MerchantLog merchantLog) {
		getMerchantLogs().add(merchantLog);
		merchantLog.setMerchantStore(this);

		return merchantLog;
	}

	public MerchantLog removeMerchantLog(MerchantLog merchantLog) {
		getMerchantLogs().remove(merchantLog);
		merchantLog.setMerchantStore(null);

		return merchantLog;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Zone getZone() {
		return this.zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setMerchantStore(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setMerchantStore(null);

		return order;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setMerchantStore(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setMerchantStore(null);

		return product;
	}

	public List<ProductOption> getProductOptions() {
		return this.productOptions;
	}

	public void setProductOptions(List<ProductOption> productOptions) {
		this.productOptions = productOptions;
	}

	public ProductOption addProductOption(ProductOption productOption) {
		getProductOptions().add(productOption);
		productOption.setMerchantStore(this);

		return productOption;
	}

	public ProductOption removeProductOption(ProductOption productOption) {
		getProductOptions().remove(productOption);
		productOption.setMerchantStore(null);

		return productOption;
	}

	public List<ProductOptionValue> getProductOptionValues() {
		return this.productOptionValues;
	}

	public void setProductOptionValues(List<ProductOptionValue> productOptionValues) {
		this.productOptionValues = productOptionValues;
	}

	public ProductOptionValue addProductOptionValue(ProductOptionValue productOptionValue) {
		getProductOptionValues().add(productOptionValue);
		productOptionValue.setMerchantStore(this);

		return productOptionValue;
	}

	public ProductOptionValue removeProductOptionValue(ProductOptionValue productOptionValue) {
		getProductOptionValues().remove(productOptionValue);
		productOptionValue.setMerchantStore(null);

		return productOptionValue;
	}

	public List<ProductRelationship> getProductRelationships() {
		return this.productRelationships;
	}

	public void setProductRelationships(List<ProductRelationship> productRelationships) {
		this.productRelationships = productRelationships;
	}

	public ProductRelationship addProductRelationship(ProductRelationship productRelationship) {
		getProductRelationships().add(productRelationship);
		productRelationship.setMerchantStore(this);

		return productRelationship;
	}

	public ProductRelationship removeProductRelationship(ProductRelationship productRelationship) {
		getProductRelationships().remove(productRelationship);
		productRelationship.setMerchantStore(null);

		return productRelationship;
	}

	public List<ShoppingCart> getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(List<ShoppingCart> shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

	public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {
		getShoppingCarts().add(shoppingCart);
		shoppingCart.setMerchantStore(this);

		return shoppingCart;
	}

	public ShoppingCart removeShoppingCart(ShoppingCart shoppingCart) {
		getShoppingCarts().remove(shoppingCart);
		shoppingCart.setMerchantStore(null);

		return shoppingCart;
	}

	public List<SystemNotification> getSystemNotifications() {
		return this.systemNotifications;
	}

	public void setSystemNotifications(List<SystemNotification> systemNotifications) {
		this.systemNotifications = systemNotifications;
	}

	public SystemNotification addSystemNotification(SystemNotification systemNotification) {
		getSystemNotifications().add(systemNotification);
		systemNotification.setMerchantStore(this);

		return systemNotification;
	}

	public SystemNotification removeSystemNotification(SystemNotification systemNotification) {
		getSystemNotifications().remove(systemNotification);
		systemNotification.setMerchantStore(null);

		return systemNotification;
	}

	public List<TaxClass> getTaxClasses() {
		return this.taxClasses;
	}

	public void setTaxClasses(List<TaxClass> taxClasses) {
		this.taxClasses = taxClasses;
	}

	public TaxClass addTaxClass(TaxClass taxClass) {
		getTaxClasses().add(taxClass);
		taxClass.setMerchantStore(this);

		return taxClass;
	}

	public TaxClass removeTaxClass(TaxClass taxClass) {
		getTaxClasses().remove(taxClass);
		taxClass.setMerchantStore(null);

		return taxClass;
	}

	public List<TaxRate> getTaxRates() {
		return this.taxRates;
	}

	public void setTaxRates(List<TaxRate> taxRates) {
		this.taxRates = taxRates;
	}

	public TaxRate addTaxRate(TaxRate taxRate) {
		getTaxRates().add(taxRate);
		taxRate.setMerchantStore(this);

		return taxRate;
	}

	public TaxRate removeTaxRate(TaxRate taxRate) {
		getTaxRates().remove(taxRate);
		taxRate.setMerchantStore(null);

		return taxRate;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setMerchantStore(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setMerchantStore(null);

		return user;
	}

}