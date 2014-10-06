package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the product_availability database table.
 * 
 */
@Entity
@Table(name="product_availability")
@NamedQuery(name="ProductAvailability.findAll", query="SELECT p FROM ProductAvailability p")
public class ProductAvailability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_AVAIL_ID")
	private String productAvailId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_AVAILABLE")
	private Date dateAvailable;

	@Column(name="FREE_SHIPPING")
	private byte freeShipping;

	private int quantity;

	@Column(name="QUANTITY_ORD_MAX")
	private int quantityOrdMax;

	@Column(name="QUANTITY_ORD_MIN")
	private int quantityOrdMin;

	private String region;

	@Column(name="REGION_VARIANT")
	private String regionVariant;

	private byte status;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	//bi-directional many-to-one association to ProductPrice
	@OneToMany(mappedBy="productAvailability")
	private List<ProductPrice> productPrices;

	public ProductAvailability() {
	}

	public String getProductAvailId() {
		return this.productAvailId;
	}

	public void setProductAvailId(String productAvailId) {
		this.productAvailId = productAvailId;
	}

	public Date getDateAvailable() {
		return this.dateAvailable;
	}

	public void setDateAvailable(Date dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public byte getFreeShipping() {
		return this.freeShipping;
	}

	public void setFreeShipping(byte freeShipping) {
		this.freeShipping = freeShipping;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantityOrdMax() {
		return this.quantityOrdMax;
	}

	public void setQuantityOrdMax(int quantityOrdMax) {
		this.quantityOrdMax = quantityOrdMax;
	}

	public int getQuantityOrdMin() {
		return this.quantityOrdMin;
	}

	public void setQuantityOrdMin(int quantityOrdMin) {
		this.quantityOrdMin = quantityOrdMin;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegionVariant() {
		return this.regionVariant;
	}

	public void setRegionVariant(String regionVariant) {
		this.regionVariant = regionVariant;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<ProductPrice> getProductPrices() {
		return this.productPrices;
	}

	public void setProductPrices(List<ProductPrice> productPrices) {
		this.productPrices = productPrices;
	}

	public ProductPrice addProductPrice(ProductPrice productPrice) {
		getProductPrices().add(productPrice);
		productPrice.setProductAvailability(this);

		return productPrice;
	}

	public ProductPrice removeProductPrice(ProductPrice productPrice) {
		getProductPrices().remove(productPrice);
		productPrice.setProductAvailability(null);

		return productPrice;
	}

}