package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the product_option_value database table.
 * 
 */
@Entity
@Table(name="product_option_value")
@NamedQuery(name="ProductOptionValue.findAll", query="SELECT p FROM ProductOptionValue p")
public class ProductOptionValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_OPTION_VALUE_ID")
	private String productOptionValueId;

	@Column(name="PRODUCT_OPT_FOR_DISP")
	private byte productOptForDisp;

	@Column(name="PRODUCT_OPT_VAL_IMAGE")
	private String productOptValImage;

	@Column(name="PRODUCT_OPT_VAL_SORT_ORD")
	private int productOptValSortOrd;

	@Column(name="PRODUCT_OPTION_VAL_CODE")
	private String productOptionValCode;

	//bi-directional many-to-one association to ProductAttribute
	@OneToMany(mappedBy="productOptionValue")
	private List<ProductAttribute> productAttributes;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to ProductOptionValueDescription
	@OneToMany(mappedBy="productOptionValue")
	private List<ProductOptionValueDescription> productOptionValueDescriptions;

	public ProductOptionValue() {
	}

	public String getProductOptionValueId() {
		return this.productOptionValueId;
	}

	public void setProductOptionValueId(String productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
	}

	public byte getProductOptForDisp() {
		return this.productOptForDisp;
	}

	public void setProductOptForDisp(byte productOptForDisp) {
		this.productOptForDisp = productOptForDisp;
	}

	public String getProductOptValImage() {
		return this.productOptValImage;
	}

	public void setProductOptValImage(String productOptValImage) {
		this.productOptValImage = productOptValImage;
	}

	public int getProductOptValSortOrd() {
		return this.productOptValSortOrd;
	}

	public void setProductOptValSortOrd(int productOptValSortOrd) {
		this.productOptValSortOrd = productOptValSortOrd;
	}

	public String getProductOptionValCode() {
		return this.productOptionValCode;
	}

	public void setProductOptionValCode(String productOptionValCode) {
		this.productOptionValCode = productOptionValCode;
	}

	public List<ProductAttribute> getProductAttributes() {
		return this.productAttributes;
	}

	public void setProductAttributes(List<ProductAttribute> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public ProductAttribute addProductAttribute(ProductAttribute productAttribute) {
		getProductAttributes().add(productAttribute);
		productAttribute.setProductOptionValue(this);

		return productAttribute;
	}

	public ProductAttribute removeProductAttribute(ProductAttribute productAttribute) {
		getProductAttributes().remove(productAttribute);
		productAttribute.setProductOptionValue(null);

		return productAttribute;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public List<ProductOptionValueDescription> getProductOptionValueDescriptions() {
		return this.productOptionValueDescriptions;
	}

	public void setProductOptionValueDescriptions(List<ProductOptionValueDescription> productOptionValueDescriptions) {
		this.productOptionValueDescriptions = productOptionValueDescriptions;
	}

	public ProductOptionValueDescription addProductOptionValueDescription(ProductOptionValueDescription productOptionValueDescription) {
		getProductOptionValueDescriptions().add(productOptionValueDescription);
		productOptionValueDescription.setProductOptionValue(this);

		return productOptionValueDescription;
	}

	public ProductOptionValueDescription removeProductOptionValueDescription(ProductOptionValueDescription productOptionValueDescription) {
		getProductOptionValueDescriptions().remove(productOptionValueDescription);
		productOptionValueDescription.setProductOptionValue(null);

		return productOptionValueDescription;
	}

}