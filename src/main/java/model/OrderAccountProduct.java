package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the order_account_product database table.
 * 
 */
@Entity
@Table(name="order_account_product")
@NamedQuery(name="OrderAccountProduct.findAll", query="SELECT o FROM OrderAccountProduct o")
public class OrderAccountProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ACCOUNT_PRODUCT_ID")
	private String orderAccountProductId;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_ACCOUNT_PRODUCT_ACCNT_DT")
	private Date orderAccountProductAccntDt;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_ACCOUNT_PRODUCT_END_DT")
	private Date orderAccountProductEndDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ORDER_ACCOUNT_PRODUCT_EOT")
	private Date orderAccountProductEot;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ORDER_ACCOUNT_PRODUCT_L_ST_DT")
	private Date orderAccountProductLStDt;

	@Column(name="ORDER_ACCOUNT_PRODUCT_L_TRX_ST")
	private int orderAccountProductLTrxSt;

	@Column(name="ORDER_ACCOUNT_PRODUCT_PM_FR_TY")
	private int orderAccountProductPmFrTy;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_ACCOUNT_PRODUCT_ST_DT")
	private Date orderAccountProductStDt;

	@Column(name="ORDER_ACCOUNT_PRODUCT_STATUS")
	private int orderAccountProductStatus;

	//bi-directional many-to-one association to OrderAccount
	@ManyToOne
	@JoinColumn(name="ORDER_ACCOUNT_ID")
	private OrderAccount orderAccount;

	//bi-directional many-to-one association to OrderProduct
	@ManyToOne
	@JoinColumn(name="ORDER_PRODUCT_ID")
	private OrderProduct orderProduct;

	public OrderAccountProduct() {
	}

	public String getOrderAccountProductId() {
		return this.orderAccountProductId;
	}

	public void setOrderAccountProductId(String orderAccountProductId) {
		this.orderAccountProductId = orderAccountProductId;
	}

	public Date getOrderAccountProductAccntDt() {
		return this.orderAccountProductAccntDt;
	}

	public void setOrderAccountProductAccntDt(Date orderAccountProductAccntDt) {
		this.orderAccountProductAccntDt = orderAccountProductAccntDt;
	}

	public Date getOrderAccountProductEndDt() {
		return this.orderAccountProductEndDt;
	}

	public void setOrderAccountProductEndDt(Date orderAccountProductEndDt) {
		this.orderAccountProductEndDt = orderAccountProductEndDt;
	}

	public Date getOrderAccountProductEot() {
		return this.orderAccountProductEot;
	}

	public void setOrderAccountProductEot(Date orderAccountProductEot) {
		this.orderAccountProductEot = orderAccountProductEot;
	}

	public Date getOrderAccountProductLStDt() {
		return this.orderAccountProductLStDt;
	}

	public void setOrderAccountProductLStDt(Date orderAccountProductLStDt) {
		this.orderAccountProductLStDt = orderAccountProductLStDt;
	}

	public int getOrderAccountProductLTrxSt() {
		return this.orderAccountProductLTrxSt;
	}

	public void setOrderAccountProductLTrxSt(int orderAccountProductLTrxSt) {
		this.orderAccountProductLTrxSt = orderAccountProductLTrxSt;
	}

	public int getOrderAccountProductPmFrTy() {
		return this.orderAccountProductPmFrTy;
	}

	public void setOrderAccountProductPmFrTy(int orderAccountProductPmFrTy) {
		this.orderAccountProductPmFrTy = orderAccountProductPmFrTy;
	}

	public Date getOrderAccountProductStDt() {
		return this.orderAccountProductStDt;
	}

	public void setOrderAccountProductStDt(Date orderAccountProductStDt) {
		this.orderAccountProductStDt = orderAccountProductStDt;
	}

	public int getOrderAccountProductStatus() {
		return this.orderAccountProductStatus;
	}

	public void setOrderAccountProductStatus(int orderAccountProductStatus) {
		this.orderAccountProductStatus = orderAccountProductStatus;
	}

	public OrderAccount getOrderAccount() {
		return this.orderAccount;
	}

	public void setOrderAccount(OrderAccount orderAccount) {
		this.orderAccount = orderAccount;
	}

	public OrderProduct getOrderProduct() {
		return this.orderProduct;
	}

	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}

}