package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the product_type database table.
 * 
 */
@Entity
@Table(name="product_type")
@NamedQuery(name="ProductType.findAll", query="SELECT p FROM ProductType p")
public class ProductType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_TYPE_ID")
	private String productTypeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="PRD_TYPE_ADD_TO_CART")
	private byte prdTypeAddToCart;

	@Column(name="PRD_TYPE_CODE")
	private String prdTypeCode;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="productType")
	private List<Product> products;

	public ProductType() {
	}

	public String getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
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

	public byte getPrdTypeAddToCart() {
		return this.prdTypeAddToCart;
	}

	public void setPrdTypeAddToCart(byte prdTypeAddToCart) {
		this.prdTypeAddToCart = prdTypeAddToCart;
	}

	public String getPrdTypeCode() {
		return this.prdTypeCode;
	}

	public void setPrdTypeCode(String prdTypeCode) {
		this.prdTypeCode = prdTypeCode;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setProductType(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setProductType(null);

		return product;
	}

}