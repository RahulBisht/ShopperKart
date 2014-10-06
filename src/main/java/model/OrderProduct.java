package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the order_product database table.
 * 
 */
@Entity
@Table(name="order_product")
@NamedQuery(name="OrderProduct.findAll", query="SELECT o FROM OrderProduct o")
public class OrderProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_PRODUCT_ID")
	private String orderProductId;

	@Column(name="ONETIME_CHARGE")
	private BigDecimal onetimeCharge;

	@Column(name="PRODUCT_NAME")
	private String productName;

	@Column(name="PRODUCT_QUANTITY")
	private int productQuantity;

	@Column(name="PRODUCT_SKU")
	private String productSku;

	//bi-directional many-to-one association to OrderAccountProduct
	@OneToMany(mappedBy="orderProduct")
	private List<OrderAccountProduct> orderAccountProducts;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;

	//bi-directional many-to-one association to OrderProductAttribute
	@OneToMany(mappedBy="orderProduct")
	private List<OrderProductAttribute> orderProductAttributes;

	//bi-directional many-to-one association to OrderProductDownload
	@OneToMany(mappedBy="orderProduct")
	private List<OrderProductDownload> orderProductDownloads;

	//bi-directional many-to-one association to OrderProductPrice
	@OneToMany(mappedBy="orderProduct")
	private List<OrderProductPrice> orderProductPrices;

	public OrderProduct() {
	}

	public String getOrderProductId() {
		return this.orderProductId;
	}

	public void setOrderProductId(String orderProductId) {
		this.orderProductId = orderProductId;
	}

	public BigDecimal getOnetimeCharge() {
		return this.onetimeCharge;
	}

	public void setOnetimeCharge(BigDecimal onetimeCharge) {
		this.onetimeCharge = onetimeCharge;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductSku() {
		return this.productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

	public List<OrderAccountProduct> getOrderAccountProducts() {
		return this.orderAccountProducts;
	}

	public void setOrderAccountProducts(List<OrderAccountProduct> orderAccountProducts) {
		this.orderAccountProducts = orderAccountProducts;
	}

	public OrderAccountProduct addOrderAccountProduct(OrderAccountProduct orderAccountProduct) {
		getOrderAccountProducts().add(orderAccountProduct);
		orderAccountProduct.setOrderProduct(this);

		return orderAccountProduct;
	}

	public OrderAccountProduct removeOrderAccountProduct(OrderAccountProduct orderAccountProduct) {
		getOrderAccountProducts().remove(orderAccountProduct);
		orderAccountProduct.setOrderProduct(null);

		return orderAccountProduct;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<OrderProductAttribute> getOrderProductAttributes() {
		return this.orderProductAttributes;
	}

	public void setOrderProductAttributes(List<OrderProductAttribute> orderProductAttributes) {
		this.orderProductAttributes = orderProductAttributes;
	}

	public OrderProductAttribute addOrderProductAttribute(OrderProductAttribute orderProductAttribute) {
		getOrderProductAttributes().add(orderProductAttribute);
		orderProductAttribute.setOrderProduct(this);

		return orderProductAttribute;
	}

	public OrderProductAttribute removeOrderProductAttribute(OrderProductAttribute orderProductAttribute) {
		getOrderProductAttributes().remove(orderProductAttribute);
		orderProductAttribute.setOrderProduct(null);

		return orderProductAttribute;
	}

	public List<OrderProductDownload> getOrderProductDownloads() {
		return this.orderProductDownloads;
	}

	public void setOrderProductDownloads(List<OrderProductDownload> orderProductDownloads) {
		this.orderProductDownloads = orderProductDownloads;
	}

	public OrderProductDownload addOrderProductDownload(OrderProductDownload orderProductDownload) {
		getOrderProductDownloads().add(orderProductDownload);
		orderProductDownload.setOrderProduct(this);

		return orderProductDownload;
	}

	public OrderProductDownload removeOrderProductDownload(OrderProductDownload orderProductDownload) {
		getOrderProductDownloads().remove(orderProductDownload);
		orderProductDownload.setOrderProduct(null);

		return orderProductDownload;
	}

	public List<OrderProductPrice> getOrderProductPrices() {
		return this.orderProductPrices;
	}

	public void setOrderProductPrices(List<OrderProductPrice> orderProductPrices) {
		this.orderProductPrices = orderProductPrices;
	}

	public OrderProductPrice addOrderProductPrice(OrderProductPrice orderProductPrice) {
		getOrderProductPrices().add(orderProductPrice);
		orderProductPrice.setOrderProduct(this);

		return orderProductPrice;
	}

	public OrderProductPrice removeOrderProductPrice(OrderProductPrice orderProductPrice) {
		getOrderProductPrices().remove(orderProductPrice);
		orderProductPrice.setOrderProduct(null);

		return orderProductPrice;
	}

}