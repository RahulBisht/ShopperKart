package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private String productId;

	private byte available;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_AVAILABLE")
	private Date dateAvailable;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="PRODUCT_FREE")
	private byte productFree;

	@Column(name="PRODUCT_HEIGHT")
	private BigDecimal productHeight;

	@Column(name="PRODUCT_LENGTH")
	private BigDecimal productLength;

	@Column(name="PRODUCT_SHIP")
	private byte productShip;

	@Column(name="PRODUCT_VIRTUAL")
	private byte productVirtual;

	@Column(name="PRODUCT_WEIGHT")
	private BigDecimal productWeight;

	@Column(name="PRODUCT_WIDTH")
	private BigDecimal productWidth;

	@Column(name="QUANTITY_ORDERED")
	private int quantityOrdered;

	@Column(name="REVIEW_AVG")
	private BigDecimal reviewAvg;

	@Column(name="REVIEW_COUNT")
	private int reviewCount;

	private String sku;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to TaxClass
	@ManyToOne
	@JoinColumn(name="TAX_CLASS_ID")
	private TaxClass taxClass;

	//bi-directional many-to-one association to ProductType
	@ManyToOne
	@JoinColumn(name="PRODUCT_TYPE_ID")
	private ProductType productType;

	//bi-directional many-to-one association to Manufacturer
	@ManyToOne
	@JoinColumn(name="MANUFACTURER_ID")
	private Manufacturer manufacturer;

	//bi-directional many-to-one association to ProductAttribute
	@OneToMany(mappedBy="product")
	private List<ProductAttribute> productAttributes;

	//bi-directional many-to-one association to ProductAvailability
	@OneToMany(mappedBy="product")
	private List<ProductAvailability> productAvailabilities;

	//bi-directional many-to-many association to Category
	@ManyToMany
	@JoinTable(
		name="product_category"
		, joinColumns={
			@JoinColumn(name="PRODUCT_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CATEGORY_ID")
			}
		)
	private List<Category> categories;

	//bi-directional many-to-one association to ProductDescription
	@OneToMany(mappedBy="product")
	private List<ProductDescription> productDescriptions;

	//bi-directional many-to-one association to ProductDigital
	@OneToMany(mappedBy="product")
	private List<ProductDigital> productDigitals;

	//bi-directional many-to-one association to ProductImage
	@OneToMany(mappedBy="product")
	private List<ProductImage> productImages;

	//bi-directional many-to-one association to ProductRelationship
	@OneToMany(mappedBy="product1")
	private List<ProductRelationship> productRelationships1;

	//bi-directional many-to-one association to ProductRelationship
	@OneToMany(mappedBy="product2")
	private List<ProductRelationship> productRelationships2;

	//bi-directional many-to-one association to ProductReview
	@OneToMany(mappedBy="product")
	private List<ProductReview> productReviews;

	public Product() {
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public byte getAvailable() {
		return this.available;
	}

	public void setAvailable(byte available) {
		this.available = available;
	}

	public Date getDateAvailable() {
		return this.dateAvailable;
	}

	public void setDateAvailable(Date dateAvailable) {
		this.dateAvailable = dateAvailable;
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

	public byte getProductFree() {
		return this.productFree;
	}

	public void setProductFree(byte productFree) {
		this.productFree = productFree;
	}

	public BigDecimal getProductHeight() {
		return this.productHeight;
	}

	public void setProductHeight(BigDecimal productHeight) {
		this.productHeight = productHeight;
	}

	public BigDecimal getProductLength() {
		return this.productLength;
	}

	public void setProductLength(BigDecimal productLength) {
		this.productLength = productLength;
	}

	public byte getProductShip() {
		return this.productShip;
	}

	public void setProductShip(byte productShip) {
		this.productShip = productShip;
	}

	public byte getProductVirtual() {
		return this.productVirtual;
	}

	public void setProductVirtual(byte productVirtual) {
		this.productVirtual = productVirtual;
	}

	public BigDecimal getProductWeight() {
		return this.productWeight;
	}

	public void setProductWeight(BigDecimal productWeight) {
		this.productWeight = productWeight;
	}

	public BigDecimal getProductWidth() {
		return this.productWidth;
	}

	public void setProductWidth(BigDecimal productWidth) {
		this.productWidth = productWidth;
	}

	public int getQuantityOrdered() {
		return this.quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public BigDecimal getReviewAvg() {
		return this.reviewAvg;
	}

	public void setReviewAvg(BigDecimal reviewAvg) {
		this.reviewAvg = reviewAvg;
	}

	public int getReviewCount() {
		return this.reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
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

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public TaxClass getTaxClass() {
		return this.taxClass;
	}

	public void setTaxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<ProductAttribute> getProductAttributes() {
		return this.productAttributes;
	}

	public void setProductAttributes(List<ProductAttribute> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public ProductAttribute addProductAttribute(ProductAttribute productAttribute) {
		getProductAttributes().add(productAttribute);
		productAttribute.setProduct(this);

		return productAttribute;
	}

	public ProductAttribute removeProductAttribute(ProductAttribute productAttribute) {
		getProductAttributes().remove(productAttribute);
		productAttribute.setProduct(null);

		return productAttribute;
	}

	public List<ProductAvailability> getProductAvailabilities() {
		return this.productAvailabilities;
	}

	public void setProductAvailabilities(List<ProductAvailability> productAvailabilities) {
		this.productAvailabilities = productAvailabilities;
	}

	public ProductAvailability addProductAvailability(ProductAvailability productAvailability) {
		getProductAvailabilities().add(productAvailability);
		productAvailability.setProduct(this);

		return productAvailability;
	}

	public ProductAvailability removeProductAvailability(ProductAvailability productAvailability) {
		getProductAvailabilities().remove(productAvailability);
		productAvailability.setProduct(null);

		return productAvailability;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<ProductDescription> getProductDescriptions() {
		return this.productDescriptions;
	}

	public void setProductDescriptions(List<ProductDescription> productDescriptions) {
		this.productDescriptions = productDescriptions;
	}

	public ProductDescription addProductDescription(ProductDescription productDescription) {
		getProductDescriptions().add(productDescription);
		productDescription.setProduct(this);

		return productDescription;
	}

	public ProductDescription removeProductDescription(ProductDescription productDescription) {
		getProductDescriptions().remove(productDescription);
		productDescription.setProduct(null);

		return productDescription;
	}

	public List<ProductDigital> getProductDigitals() {
		return this.productDigitals;
	}

	public void setProductDigitals(List<ProductDigital> productDigitals) {
		this.productDigitals = productDigitals;
	}

	public ProductDigital addProductDigital(ProductDigital productDigital) {
		getProductDigitals().add(productDigital);
		productDigital.setProduct(this);

		return productDigital;
	}

	public ProductDigital removeProductDigital(ProductDigital productDigital) {
		getProductDigitals().remove(productDigital);
		productDigital.setProduct(null);

		return productDigital;
	}

	public List<ProductImage> getProductImages() {
		return this.productImages;
	}

	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

	public ProductImage addProductImage(ProductImage productImage) {
		getProductImages().add(productImage);
		productImage.setProduct(this);

		return productImage;
	}

	public ProductImage removeProductImage(ProductImage productImage) {
		getProductImages().remove(productImage);
		productImage.setProduct(null);

		return productImage;
	}

	public List<ProductRelationship> getProductRelationships1() {
		return this.productRelationships1;
	}

	public void setProductRelationships1(List<ProductRelationship> productRelationships1) {
		this.productRelationships1 = productRelationships1;
	}

	public ProductRelationship addProductRelationships1(ProductRelationship productRelationships1) {
		getProductRelationships1().add(productRelationships1);
		productRelationships1.setProduct1(this);

		return productRelationships1;
	}

	public ProductRelationship removeProductRelationships1(ProductRelationship productRelationships1) {
		getProductRelationships1().remove(productRelationships1);
		productRelationships1.setProduct1(null);

		return productRelationships1;
	}

	public List<ProductRelationship> getProductRelationships2() {
		return this.productRelationships2;
	}

	public void setProductRelationships2(List<ProductRelationship> productRelationships2) {
		this.productRelationships2 = productRelationships2;
	}

	public ProductRelationship addProductRelationships2(ProductRelationship productRelationships2) {
		getProductRelationships2().add(productRelationships2);
		productRelationships2.setProduct2(this);

		return productRelationships2;
	}

	public ProductRelationship removeProductRelationships2(ProductRelationship productRelationships2) {
		getProductRelationships2().remove(productRelationships2);
		productRelationships2.setProduct2(null);

		return productRelationships2;
	}

	public List<ProductReview> getProductReviews() {
		return this.productReviews;
	}

	public void setProductReviews(List<ProductReview> productReviews) {
		this.productReviews = productReviews;
	}

	public ProductReview addProductReview(ProductReview productReview) {
		getProductReviews().add(productReview);
		productReview.setProduct(this);

		return productReview;
	}

	public ProductReview removeProductReview(ProductReview productReview) {
		getProductReviews().remove(productReview);
		productReview.setProduct(null);

		return productReview;
	}

}