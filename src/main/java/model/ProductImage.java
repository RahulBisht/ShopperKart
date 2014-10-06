package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the product_image database table.
 * 
 */
@Entity
@Table(name="product_image")
@NamedQuery(name="ProductImage.findAll", query="SELECT p FROM ProductImage p")
public class ProductImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_IMAGE_ID")
	private String productImageId;

	@Column(name="DEFAULT_IMAGE")
	private byte defaultImage;

	@Column(name="IMAGE_CROP")
	private byte imageCrop;

	@Column(name="IMAGE_TYPE")
	private int imageType;

	@Column(name="PRODUCT_IMAGE")
	private String productImage;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	//bi-directional many-to-one association to ProductImageDescription
	@OneToMany(mappedBy="productImage")
	private List<ProductImageDescription> productImageDescriptions;

	public ProductImage() {
	}

	public String getProductImageId() {
		return this.productImageId;
	}

	public void setProductImageId(String productImageId) {
		this.productImageId = productImageId;
	}

	public byte getDefaultImage() {
		return this.defaultImage;
	}

	public void setDefaultImage(byte defaultImage) {
		this.defaultImage = defaultImage;
	}

	public byte getImageCrop() {
		return this.imageCrop;
	}

	public void setImageCrop(byte imageCrop) {
		this.imageCrop = imageCrop;
	}

	public int getImageType() {
		return this.imageType;
	}

	public void setImageType(int imageType) {
		this.imageType = imageType;
	}

	public String getProductImage() {
		return this.productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<ProductImageDescription> getProductImageDescriptions() {
		return this.productImageDescriptions;
	}

	public void setProductImageDescriptions(List<ProductImageDescription> productImageDescriptions) {
		this.productImageDescriptions = productImageDescriptions;
	}

	public ProductImageDescription addProductImageDescription(ProductImageDescription productImageDescription) {
		getProductImageDescriptions().add(productImageDescription);
		productImageDescription.setProductImage(this);

		return productImageDescription;
	}

	public ProductImageDescription removeProductImageDescription(ProductImageDescription productImageDescription) {
		getProductImageDescriptions().remove(productImageDescription);
		productImageDescription.setProductImage(null);

		return productImageDescription;
	}

}