package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the order_product_price database table.
 * 
 */
@Entity
@Table(name="order_product_price")
@NamedQuery(name="OrderProductPrice.findAll", query="SELECT o FROM OrderProductPrice o")
public class OrderProductPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_PRODUCT_PRICE_ID")
	private String orderProductPriceId;

	@Column(name="DEFAULT_PRICE")
	private byte defaultPrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PRD_PRICE_SPECIAL_END_DT")
	private Date prdPriceSpecialEndDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PRD_PRICE_SPECIAL_ST_DT")
	private Date prdPriceSpecialStDt;

	@Column(name="PRODUCT_PRICE")
	private BigDecimal productPrice;

	@Column(name="PRODUCT_PRICE_CODE")
	private String productPriceCode;

	@Column(name="PRODUCT_PRICE_NAME")
	private String productPriceName;

	@Column(name="PRODUCT_PRICE_SPECIAL")
	private BigDecimal productPriceSpecial;

	//bi-directional many-to-one association to OrderProduct
	@ManyToOne
	@JoinColumn(name="ORDER_PRODUCT_ID")
	private OrderProduct orderProduct;

	public OrderProductPrice() {
	}

	public String getOrderProductPriceId() {
		return this.orderProductPriceId;
	}

	public void setOrderProductPriceId(String orderProductPriceId) {
		this.orderProductPriceId = orderProductPriceId;
	}

	public byte getDefaultPrice() {
		return this.defaultPrice;
	}

	public void setDefaultPrice(byte defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public Date getPrdPriceSpecialEndDt() {
		return this.prdPriceSpecialEndDt;
	}

	public void setPrdPriceSpecialEndDt(Date prdPriceSpecialEndDt) {
		this.prdPriceSpecialEndDt = prdPriceSpecialEndDt;
	}

	public Date getPrdPriceSpecialStDt() {
		return this.prdPriceSpecialStDt;
	}

	public void setPrdPriceSpecialStDt(Date prdPriceSpecialStDt) {
		this.prdPriceSpecialStDt = prdPriceSpecialStDt;
	}

	public BigDecimal getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductPriceCode() {
		return this.productPriceCode;
	}

	public void setProductPriceCode(String productPriceCode) {
		this.productPriceCode = productPriceCode;
	}

	public String getProductPriceName() {
		return this.productPriceName;
	}

	public void setProductPriceName(String productPriceName) {
		this.productPriceName = productPriceName;
	}

	public BigDecimal getProductPriceSpecial() {
		return this.productPriceSpecial;
	}

	public void setProductPriceSpecial(BigDecimal productPriceSpecial) {
		this.productPriceSpecial = productPriceSpecial;
	}

	public OrderProduct getOrderProduct() {
		return this.orderProduct;
	}

	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}

}