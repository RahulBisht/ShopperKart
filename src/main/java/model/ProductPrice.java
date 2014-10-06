package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the product_price database table.
 * 
 */
@Entity
@Table(name="product_price")
@NamedQuery(name="ProductPrice.findAll", query="SELECT p FROM ProductPrice p")
public class ProductPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_PRICE_ID")
	private String productPriceId;

	@Column(name="DEFAULT_PRICE")
	private byte defaultPrice;

	@Column(name="PRODUCT_PRICE_AMOUNT")
	private BigDecimal productPriceAmount;

	@Column(name="PRODUCT_PRICE_CODE")
	private String productPriceCode;

	@Column(name="PRODUCT_PRICE_SPECIAL_AMOUNT")
	private BigDecimal productPriceSpecialAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="PRODUCT_PRICE_SPECIAL_END_DATE")
	private Date productPriceSpecialEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PRODUCT_PRICE_SPECIAL_ST_DATE")
	private Date productPriceSpecialStDate;

	@Column(name="PRODUCT_PRICE_TYPE")
	private String productPriceType;

	//bi-directional many-to-one association to ProductAvailability
	@ManyToOne
	@JoinColumn(name="PRODUCT_AVAIL_ID")
	private ProductAvailability productAvailability;

	//bi-directional many-to-one association to ProductPriceDescription
	@OneToMany(mappedBy="productPrice")
	private List<ProductPriceDescription> productPriceDescriptions;

	public ProductPrice() {
	}

	public String getProductPriceId() {
		return this.productPriceId;
	}

	public void setProductPriceId(String productPriceId) {
		this.productPriceId = productPriceId;
	}

	public byte getDefaultPrice() {
		return this.defaultPrice;
	}

	public void setDefaultPrice(byte defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public BigDecimal getProductPriceAmount() {
		return this.productPriceAmount;
	}

	public void setProductPriceAmount(BigDecimal productPriceAmount) {
		this.productPriceAmount = productPriceAmount;
	}

	public String getProductPriceCode() {
		return this.productPriceCode;
	}

	public void setProductPriceCode(String productPriceCode) {
		this.productPriceCode = productPriceCode;
	}

	public BigDecimal getProductPriceSpecialAmount() {
		return this.productPriceSpecialAmount;
	}

	public void setProductPriceSpecialAmount(BigDecimal productPriceSpecialAmount) {
		this.productPriceSpecialAmount = productPriceSpecialAmount;
	}

	public Date getProductPriceSpecialEndDate() {
		return this.productPriceSpecialEndDate;
	}

	public void setProductPriceSpecialEndDate(Date productPriceSpecialEndDate) {
		this.productPriceSpecialEndDate = productPriceSpecialEndDate;
	}

	public Date getProductPriceSpecialStDate() {
		return this.productPriceSpecialStDate;
	}

	public void setProductPriceSpecialStDate(Date productPriceSpecialStDate) {
		this.productPriceSpecialStDate = productPriceSpecialStDate;
	}

	public String getProductPriceType() {
		return this.productPriceType;
	}

	public void setProductPriceType(String productPriceType) {
		this.productPriceType = productPriceType;
	}

	public ProductAvailability getProductAvailability() {
		return this.productAvailability;
	}

	public void setProductAvailability(ProductAvailability productAvailability) {
		this.productAvailability = productAvailability;
	}

	public List<ProductPriceDescription> getProductPriceDescriptions() {
		return this.productPriceDescriptions;
	}

	public void setProductPriceDescriptions(List<ProductPriceDescription> productPriceDescriptions) {
		this.productPriceDescriptions = productPriceDescriptions;
	}

	public ProductPriceDescription addProductPriceDescription(ProductPriceDescription productPriceDescription) {
		getProductPriceDescriptions().add(productPriceDescription);
		productPriceDescription.setProductPrice(this);

		return productPriceDescription;
	}

	public ProductPriceDescription removeProductPriceDescription(ProductPriceDescription productPriceDescription) {
		getProductPriceDescriptions().remove(productPriceDescription);
		productPriceDescription.setProductPrice(null);

		return productPriceDescription;
	}

}