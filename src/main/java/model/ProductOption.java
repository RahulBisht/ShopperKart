package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the product_option database table.
 * 
 */
@Entity
@Table(name="product_option")
@NamedQuery(name="ProductOption.findAll", query="SELECT p FROM ProductOption p")
public class ProductOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_OPTION_ID")
	private String productOptionId;

	@Column(name="PRODUCT_OPTION_CODE")
	private String productOptionCode;

	@Column(name="PRODUCT_OPTION_READ")
	private byte productOptionRead;

	@Column(name="PRODUCT_OPTION_SORT_ORD")
	private int productOptionSortOrd;

	@Column(name="PRODUCT_OPTION_TYPE")
	private String productOptionType;

	//bi-directional many-to-one association to ProductAttribute
	@OneToMany(mappedBy="productOption")
	private List<ProductAttribute> productAttributes;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to ProductOptionDesc
	@OneToMany(mappedBy="productOption")
	private List<ProductOptionDesc> productOptionDescs;

	public ProductOption() {
	}

	public String getProductOptionId() {
		return this.productOptionId;
	}

	public void setProductOptionId(String productOptionId) {
		this.productOptionId = productOptionId;
	}

	public String getProductOptionCode() {
		return this.productOptionCode;
	}

	public void setProductOptionCode(String productOptionCode) {
		this.productOptionCode = productOptionCode;
	}

	public byte getProductOptionRead() {
		return this.productOptionRead;
	}

	public void setProductOptionRead(byte productOptionRead) {
		this.productOptionRead = productOptionRead;
	}

	public int getProductOptionSortOrd() {
		return this.productOptionSortOrd;
	}

	public void setProductOptionSortOrd(int productOptionSortOrd) {
		this.productOptionSortOrd = productOptionSortOrd;
	}

	public String getProductOptionType() {
		return this.productOptionType;
	}

	public void setProductOptionType(String productOptionType) {
		this.productOptionType = productOptionType;
	}

	public List<ProductAttribute> getProductAttributes() {
		return this.productAttributes;
	}

	public void setProductAttributes(List<ProductAttribute> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public ProductAttribute addProductAttribute(ProductAttribute productAttribute) {
		getProductAttributes().add(productAttribute);
		productAttribute.setProductOption(this);

		return productAttribute;
	}

	public ProductAttribute removeProductAttribute(ProductAttribute productAttribute) {
		getProductAttributes().remove(productAttribute);
		productAttribute.setProductOption(null);

		return productAttribute;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public List<ProductOptionDesc> getProductOptionDescs() {
		return this.productOptionDescs;
	}

	public void setProductOptionDescs(List<ProductOptionDesc> productOptionDescs) {
		this.productOptionDescs = productOptionDescs;
	}

	public ProductOptionDesc addProductOptionDesc(ProductOptionDesc productOptionDesc) {
		getProductOptionDescs().add(productOptionDesc);
		productOptionDesc.setProductOption(this);

		return productOptionDesc;
	}

	public ProductOptionDesc removeProductOptionDesc(ProductOptionDesc productOptionDesc) {
		getProductOptionDescs().remove(productOptionDesc);
		productOptionDesc.setProductOption(null);

		return productOptionDesc;
	}

}