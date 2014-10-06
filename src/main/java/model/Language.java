package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the language database table.
 * 
 */
@Entity
@NamedQuery(name="Language.findAll", query="SELECT l FROM Language l")
public class Language implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LANGUAGE_ID")
	private int languageId;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to CategoryDescription
	@OneToMany(mappedBy="language")
	private List<CategoryDescription> categoryDescriptions;

	//bi-directional many-to-one association to ContentDescription
	@OneToMany(mappedBy="language")
	private List<ContentDescription> contentDescriptions;

	//bi-directional many-to-one association to CountryDescription
	@OneToMany(mappedBy="language")
	private List<CountryDescription> countryDescriptions;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="language")
	private List<Customer> customers;

	//bi-directional many-to-one association to CustomerOptValDescription
	@OneToMany(mappedBy="language")
	private List<CustomerOptValDescription> customerOptValDescriptions;

	//bi-directional many-to-one association to CustomerOptionDesc
	@OneToMany(mappedBy="language")
	private List<CustomerOptionDesc> customerOptionDescs;

	//bi-directional many-to-one association to GeozoneDescription
	@OneToMany(mappedBy="language")
	private List<GeozoneDescription> geozoneDescriptions;

	//bi-directional many-to-one association to ManufacturerDescription
	@OneToMany(mappedBy="language")
	private List<ManufacturerDescription> manufacturerDescriptions;

	//bi-directional many-to-many association to MerchantStore
	@ManyToMany
	@JoinTable(
		name="merchant_language"
		, joinColumns={
			@JoinColumn(name="languages_LANGUAGE_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="stores_MERCHANT_ID")
			}
		)
	private List<MerchantStore> merchantStores1;

	//bi-directional many-to-one association to MerchantStore
	@OneToMany(mappedBy="language")
	private List<MerchantStore> merchantStores2;

	//bi-directional many-to-one association to ProductDescription
	@OneToMany(mappedBy="language")
	private List<ProductDescription> productDescriptions;

	//bi-directional many-to-one association to ProductImageDescription
	@OneToMany(mappedBy="language")
	private List<ProductImageDescription> productImageDescriptions;

	//bi-directional many-to-one association to ProductOptionDesc
	@OneToMany(mappedBy="language")
	private List<ProductOptionDesc> productOptionDescs;

	//bi-directional many-to-one association to ProductOptionValueDescription
	@OneToMany(mappedBy="language")
	private List<ProductOptionValueDescription> productOptionValueDescriptions;

	//bi-directional many-to-one association to ProductPriceDescription
	@OneToMany(mappedBy="language")
	private List<ProductPriceDescription> productPriceDescriptions;

	//bi-directional many-to-one association to ProductReviewDescription
	@OneToMany(mappedBy="language")
	private List<ProductReviewDescription> productReviewDescriptions;

	//bi-directional many-to-one association to TaxRateDescription
	@OneToMany(mappedBy="language")
	private List<TaxRateDescription> taxRateDescriptions;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="language")
	private List<User> users;

	//bi-directional many-to-one association to ZoneDescription
	@OneToMany(mappedBy="language")
	private List<ZoneDescription> zoneDescriptions;

	public Language() {
	}

	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public List<CategoryDescription> getCategoryDescriptions() {
		return this.categoryDescriptions;
	}

	public void setCategoryDescriptions(List<CategoryDescription> categoryDescriptions) {
		this.categoryDescriptions = categoryDescriptions;
	}

	public CategoryDescription addCategoryDescription(CategoryDescription categoryDescription) {
		getCategoryDescriptions().add(categoryDescription);
		categoryDescription.setLanguage(this);

		return categoryDescription;
	}

	public CategoryDescription removeCategoryDescription(CategoryDescription categoryDescription) {
		getCategoryDescriptions().remove(categoryDescription);
		categoryDescription.setLanguage(null);

		return categoryDescription;
	}

	public List<ContentDescription> getContentDescriptions() {
		return this.contentDescriptions;
	}

	public void setContentDescriptions(List<ContentDescription> contentDescriptions) {
		this.contentDescriptions = contentDescriptions;
	}

	public ContentDescription addContentDescription(ContentDescription contentDescription) {
		getContentDescriptions().add(contentDescription);
		contentDescription.setLanguage(this);

		return contentDescription;
	}

	public ContentDescription removeContentDescription(ContentDescription contentDescription) {
		getContentDescriptions().remove(contentDescription);
		contentDescription.setLanguage(null);

		return contentDescription;
	}

	public List<CountryDescription> getCountryDescriptions() {
		return this.countryDescriptions;
	}

	public void setCountryDescriptions(List<CountryDescription> countryDescriptions) {
		this.countryDescriptions = countryDescriptions;
	}

	public CountryDescription addCountryDescription(CountryDescription countryDescription) {
		getCountryDescriptions().add(countryDescription);
		countryDescription.setLanguage(this);

		return countryDescription;
	}

	public CountryDescription removeCountryDescription(CountryDescription countryDescription) {
		getCountryDescriptions().remove(countryDescription);
		countryDescription.setLanguage(null);

		return countryDescription;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setLanguage(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setLanguage(null);

		return customer;
	}

	public List<CustomerOptValDescription> getCustomerOptValDescriptions() {
		return this.customerOptValDescriptions;
	}

	public void setCustomerOptValDescriptions(List<CustomerOptValDescription> customerOptValDescriptions) {
		this.customerOptValDescriptions = customerOptValDescriptions;
	}

	public CustomerOptValDescription addCustomerOptValDescription(CustomerOptValDescription customerOptValDescription) {
		getCustomerOptValDescriptions().add(customerOptValDescription);
		customerOptValDescription.setLanguage(this);

		return customerOptValDescription;
	}

	public CustomerOptValDescription removeCustomerOptValDescription(CustomerOptValDescription customerOptValDescription) {
		getCustomerOptValDescriptions().remove(customerOptValDescription);
		customerOptValDescription.setLanguage(null);

		return customerOptValDescription;
	}

	public List<CustomerOptionDesc> getCustomerOptionDescs() {
		return this.customerOptionDescs;
	}

	public void setCustomerOptionDescs(List<CustomerOptionDesc> customerOptionDescs) {
		this.customerOptionDescs = customerOptionDescs;
	}

	public CustomerOptionDesc addCustomerOptionDesc(CustomerOptionDesc customerOptionDesc) {
		getCustomerOptionDescs().add(customerOptionDesc);
		customerOptionDesc.setLanguage(this);

		return customerOptionDesc;
	}

	public CustomerOptionDesc removeCustomerOptionDesc(CustomerOptionDesc customerOptionDesc) {
		getCustomerOptionDescs().remove(customerOptionDesc);
		customerOptionDesc.setLanguage(null);

		return customerOptionDesc;
	}

	public List<GeozoneDescription> getGeozoneDescriptions() {
		return this.geozoneDescriptions;
	}

	public void setGeozoneDescriptions(List<GeozoneDescription> geozoneDescriptions) {
		this.geozoneDescriptions = geozoneDescriptions;
	}

	public GeozoneDescription addGeozoneDescription(GeozoneDescription geozoneDescription) {
		getGeozoneDescriptions().add(geozoneDescription);
		geozoneDescription.setLanguage(this);

		return geozoneDescription;
	}

	public GeozoneDescription removeGeozoneDescription(GeozoneDescription geozoneDescription) {
		getGeozoneDescriptions().remove(geozoneDescription);
		geozoneDescription.setLanguage(null);

		return geozoneDescription;
	}

	public List<ManufacturerDescription> getManufacturerDescriptions() {
		return this.manufacturerDescriptions;
	}

	public void setManufacturerDescriptions(List<ManufacturerDescription> manufacturerDescriptions) {
		this.manufacturerDescriptions = manufacturerDescriptions;
	}

	public ManufacturerDescription addManufacturerDescription(ManufacturerDescription manufacturerDescription) {
		getManufacturerDescriptions().add(manufacturerDescription);
		manufacturerDescription.setLanguage(this);

		return manufacturerDescription;
	}

	public ManufacturerDescription removeManufacturerDescription(ManufacturerDescription manufacturerDescription) {
		getManufacturerDescriptions().remove(manufacturerDescription);
		manufacturerDescription.setLanguage(null);

		return manufacturerDescription;
	}

	public List<MerchantStore> getMerchantStores1() {
		return this.merchantStores1;
	}

	public void setMerchantStores1(List<MerchantStore> merchantStores1) {
		this.merchantStores1 = merchantStores1;
	}

	public List<MerchantStore> getMerchantStores2() {
		return this.merchantStores2;
	}

	public void setMerchantStores2(List<MerchantStore> merchantStores2) {
		this.merchantStores2 = merchantStores2;
	}

	public MerchantStore addMerchantStores2(MerchantStore merchantStores2) {
		getMerchantStores2().add(merchantStores2);
		merchantStores2.setLanguage(this);

		return merchantStores2;
	}

	public MerchantStore removeMerchantStores2(MerchantStore merchantStores2) {
		getMerchantStores2().remove(merchantStores2);
		merchantStores2.setLanguage(null);

		return merchantStores2;
	}

	public List<ProductDescription> getProductDescriptions() {
		return this.productDescriptions;
	}

	public void setProductDescriptions(List<ProductDescription> productDescriptions) {
		this.productDescriptions = productDescriptions;
	}

	public ProductDescription addProductDescription(ProductDescription productDescription) {
		getProductDescriptions().add(productDescription);
		productDescription.setLanguage(this);

		return productDescription;
	}

	public ProductDescription removeProductDescription(ProductDescription productDescription) {
		getProductDescriptions().remove(productDescription);
		productDescription.setLanguage(null);

		return productDescription;
	}

	public List<ProductImageDescription> getProductImageDescriptions() {
		return this.productImageDescriptions;
	}

	public void setProductImageDescriptions(List<ProductImageDescription> productImageDescriptions) {
		this.productImageDescriptions = productImageDescriptions;
	}

	public ProductImageDescription addProductImageDescription(ProductImageDescription productImageDescription) {
		getProductImageDescriptions().add(productImageDescription);
		productImageDescription.setLanguage(this);

		return productImageDescription;
	}

	public ProductImageDescription removeProductImageDescription(ProductImageDescription productImageDescription) {
		getProductImageDescriptions().remove(productImageDescription);
		productImageDescription.setLanguage(null);

		return productImageDescription;
	}

	public List<ProductOptionDesc> getProductOptionDescs() {
		return this.productOptionDescs;
	}

	public void setProductOptionDescs(List<ProductOptionDesc> productOptionDescs) {
		this.productOptionDescs = productOptionDescs;
	}

	public ProductOptionDesc addProductOptionDesc(ProductOptionDesc productOptionDesc) {
		getProductOptionDescs().add(productOptionDesc);
		productOptionDesc.setLanguage(this);

		return productOptionDesc;
	}

	public ProductOptionDesc removeProductOptionDesc(ProductOptionDesc productOptionDesc) {
		getProductOptionDescs().remove(productOptionDesc);
		productOptionDesc.setLanguage(null);

		return productOptionDesc;
	}

	public List<ProductOptionValueDescription> getProductOptionValueDescriptions() {
		return this.productOptionValueDescriptions;
	}

	public void setProductOptionValueDescriptions(List<ProductOptionValueDescription> productOptionValueDescriptions) {
		this.productOptionValueDescriptions = productOptionValueDescriptions;
	}

	public ProductOptionValueDescription addProductOptionValueDescription(ProductOptionValueDescription productOptionValueDescription) {
		getProductOptionValueDescriptions().add(productOptionValueDescription);
		productOptionValueDescription.setLanguage(this);

		return productOptionValueDescription;
	}

	public ProductOptionValueDescription removeProductOptionValueDescription(ProductOptionValueDescription productOptionValueDescription) {
		getProductOptionValueDescriptions().remove(productOptionValueDescription);
		productOptionValueDescription.setLanguage(null);

		return productOptionValueDescription;
	}

	public List<ProductPriceDescription> getProductPriceDescriptions() {
		return this.productPriceDescriptions;
	}

	public void setProductPriceDescriptions(List<ProductPriceDescription> productPriceDescriptions) {
		this.productPriceDescriptions = productPriceDescriptions;
	}

	public ProductPriceDescription addProductPriceDescription(ProductPriceDescription productPriceDescription) {
		getProductPriceDescriptions().add(productPriceDescription);
		productPriceDescription.setLanguage(this);

		return productPriceDescription;
	}

	public ProductPriceDescription removeProductPriceDescription(ProductPriceDescription productPriceDescription) {
		getProductPriceDescriptions().remove(productPriceDescription);
		productPriceDescription.setLanguage(null);

		return productPriceDescription;
	}

	public List<ProductReviewDescription> getProductReviewDescriptions() {
		return this.productReviewDescriptions;
	}

	public void setProductReviewDescriptions(List<ProductReviewDescription> productReviewDescriptions) {
		this.productReviewDescriptions = productReviewDescriptions;
	}

	public ProductReviewDescription addProductReviewDescription(ProductReviewDescription productReviewDescription) {
		getProductReviewDescriptions().add(productReviewDescription);
		productReviewDescription.setLanguage(this);

		return productReviewDescription;
	}

	public ProductReviewDescription removeProductReviewDescription(ProductReviewDescription productReviewDescription) {
		getProductReviewDescriptions().remove(productReviewDescription);
		productReviewDescription.setLanguage(null);

		return productReviewDescription;
	}

	public List<TaxRateDescription> getTaxRateDescriptions() {
		return this.taxRateDescriptions;
	}

	public void setTaxRateDescriptions(List<TaxRateDescription> taxRateDescriptions) {
		this.taxRateDescriptions = taxRateDescriptions;
	}

	public TaxRateDescription addTaxRateDescription(TaxRateDescription taxRateDescription) {
		getTaxRateDescriptions().add(taxRateDescription);
		taxRateDescription.setLanguage(this);

		return taxRateDescription;
	}

	public TaxRateDescription removeTaxRateDescription(TaxRateDescription taxRateDescription) {
		getTaxRateDescriptions().remove(taxRateDescription);
		taxRateDescription.setLanguage(null);

		return taxRateDescription;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setLanguage(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setLanguage(null);

		return user;
	}

	public List<ZoneDescription> getZoneDescriptions() {
		return this.zoneDescriptions;
	}

	public void setZoneDescriptions(List<ZoneDescription> zoneDescriptions) {
		this.zoneDescriptions = zoneDescriptions;
	}

	public ZoneDescription addZoneDescription(ZoneDescription zoneDescription) {
		getZoneDescriptions().add(zoneDescription);
		zoneDescription.setLanguage(this);

		return zoneDescription;
	}

	public ZoneDescription removeZoneDescription(ZoneDescription zoneDescription) {
		getZoneDescriptions().remove(zoneDescription);
		zoneDescription.setLanguage(null);

		return zoneDescription;
	}

}