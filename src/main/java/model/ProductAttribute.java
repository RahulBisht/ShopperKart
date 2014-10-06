package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the product_attribute database table.
 * 
 */
@Entity
@Table(name="product_attribute")
@NamedQuery(name="ProductAttribute.findAll", query="SELECT p FROM ProductAttribute p")
public class ProductAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_ATTRIBUTE_ID")
	private String productAttributeId;

	@Column(name="PRODUCT_ATRIBUTE_PRICE")
	private BigDecimal productAtributePrice;

	@Column(name="PRODUCT_ATTRIBUTE_DEFAULT")
	private byte productAttributeDefault;

	@Column(name="PRODUCT_ATTRIBUTE_DISCOUNTED")
	private byte productAttributeDiscounted;

	@Column(name="PRODUCT_ATTRIBUTE_FOR_DISP")
	private byte productAttributeForDisp;

	@Column(name="PRODUCT_ATTRIBUTE_FREE")
	private byte productAttributeFree;

	@Column(name="PRODUCT_ATTRIBUTE_REQUIRED")
	private byte productAttributeRequired;

	@Column(name="PRODUCT_ATTRIBUTE_SORT_ORD")
	private int productAttributeSortOrd;

	@Column(name="PRODUCT_ATTRIBUTE_WEIGHT")
	private BigDecimal productAttributeWeight;

	//bi-directional many-to-one association to ProductOptionValue
	@ManyToOne
	@JoinColumn(name="OPTION_VALUE_ID")
	private ProductOptionValue productOptionValue;

	//bi-directional many-to-one association to ProductOption
	@ManyToOne
	@JoinColumn(name="OPTION_ID")
	private ProductOption productOption;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	public ProductAttribute() {
	}

	public String getProductAttributeId() {
		return this.productAttributeId;
	}

	public void setProductAttributeId(String productAttributeId) {
		this.productAttributeId = productAttributeId;
	}

	public BigDecimal getProductAtributePrice() {
		return this.productAtributePrice;
	}

	public void setProductAtributePrice(BigDecimal productAtributePrice) {
		this.productAtributePrice = productAtributePrice;
	}

	public byte getProductAttributeDefault() {
		return this.productAttributeDefault;
	}

	public void setProductAttributeDefault(byte productAttributeDefault) {
		this.productAttributeDefault = productAttributeDefault;
	}

	public byte getProductAttributeDiscounted() {
		return this.productAttributeDiscounted;
	}

	public void setProductAttributeDiscounted(byte productAttributeDiscounted) {
		this.productAttributeDiscounted = productAttributeDiscounted;
	}

	public byte getProductAttributeForDisp() {
		return this.productAttributeForDisp;
	}

	public void setProductAttributeForDisp(byte productAttributeForDisp) {
		this.productAttributeForDisp = productAttributeForDisp;
	}

	public byte getProductAttributeFree() {
		return this.productAttributeFree;
	}

	public void setProductAttributeFree(byte productAttributeFree) {
		this.productAttributeFree = productAttributeFree;
	}

	public byte getProductAttributeRequired() {
		return this.productAttributeRequired;
	}

	public void setProductAttributeRequired(byte productAttributeRequired) {
		this.productAttributeRequired = productAttributeRequired;
	}

	public int getProductAttributeSortOrd() {
		return this.productAttributeSortOrd;
	}

	public void setProductAttributeSortOrd(int productAttributeSortOrd) {
		this.productAttributeSortOrd = productAttributeSortOrd;
	}

	public BigDecimal getProductAttributeWeight() {
		return this.productAttributeWeight;
	}

	public void setProductAttributeWeight(BigDecimal productAttributeWeight) {
		this.productAttributeWeight = productAttributeWeight;
	}

	public ProductOptionValue getProductOptionValue() {
		return this.productOptionValue;
	}

	public void setProductOptionValue(ProductOptionValue productOptionValue) {
		this.productOptionValue = productOptionValue;
	}

	public ProductOption getProductOption() {
		return this.productOption;
	}

	public void setProductOption(ProductOption productOption) {
		this.productOption = productOption;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}