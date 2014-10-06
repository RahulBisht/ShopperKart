package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * The persistent class for the order_product_attribute database table.
 * 
 */
@Entity
@Table(name="order_product_attribute")
@NamedQuery(name="OrderProductAttribute.findAll", query="SELECT o FROM OrderProductAttribute o")
public class OrderProductAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_PRODUCT_ATTRIBUTE_ID")
	private String orderProductAttributeId;

	@Column(name="PRODUCT_ATTRIBUTE_IS_FREE")
	private byte productAttributeIsFree;

	@Column(name="PRODUCT_ATTRIBUTE_NAME")
	private String productAttributeName;

	@Column(name="PRODUCT_ATTRIBUTE_PRICE")
	private BigDecimal productAttributePrice;

	@Column(name="PRODUCT_ATTRIBUTE_VAL_NAME")
	private String productAttributeValName;

	@Column(name="PRODUCT_ATTRIBUTE_WEIGHT")
	private BigDecimal productAttributeWeight;

	@Column(name="PRODUCT_OPTION_ID")
	private BigInteger productOptionId;

	@Column(name="PRODUCT_OPTION_VALUE_ID")
	private BigInteger productOptionValueId;

	//bi-directional many-to-one association to OrderProduct
	@ManyToOne
	@JoinColumn(name="ORDER_PRODUCT_ID")
	private OrderProduct orderProduct;

	public OrderProductAttribute() {
	}

	public String getOrderProductAttributeId() {
		return this.orderProductAttributeId;
	}

	public void setOrderProductAttributeId(String orderProductAttributeId) {
		this.orderProductAttributeId = orderProductAttributeId;
	}

	public byte getProductAttributeIsFree() {
		return this.productAttributeIsFree;
	}

	public void setProductAttributeIsFree(byte productAttributeIsFree) {
		this.productAttributeIsFree = productAttributeIsFree;
	}

	public String getProductAttributeName() {
		return this.productAttributeName;
	}

	public void setProductAttributeName(String productAttributeName) {
		this.productAttributeName = productAttributeName;
	}

	public BigDecimal getProductAttributePrice() {
		return this.productAttributePrice;
	}

	public void setProductAttributePrice(BigDecimal productAttributePrice) {
		this.productAttributePrice = productAttributePrice;
	}

	public String getProductAttributeValName() {
		return this.productAttributeValName;
	}

	public void setProductAttributeValName(String productAttributeValName) {
		this.productAttributeValName = productAttributeValName;
	}

	public BigDecimal getProductAttributeWeight() {
		return this.productAttributeWeight;
	}

	public void setProductAttributeWeight(BigDecimal productAttributeWeight) {
		this.productAttributeWeight = productAttributeWeight;
	}

	public BigInteger getProductOptionId() {
		return this.productOptionId;
	}

	public void setProductOptionId(BigInteger productOptionId) {
		this.productOptionId = productOptionId;
	}

	public BigInteger getProductOptionValueId() {
		return this.productOptionValueId;
	}

	public void setProductOptionValueId(BigInteger productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
	}

	public OrderProduct getOrderProduct() {
		return this.orderProduct;
	}

	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}

}