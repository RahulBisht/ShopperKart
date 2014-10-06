package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the order_account database table.
 * 
 */
@Entity
@Table(name="order_account")
@NamedQuery(name="OrderAccount.findAll", query="SELECT o FROM OrderAccount o")
public class OrderAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ACCOUNT_ID")
	private String orderAccountId;

	@Column(name="ORDER_ACCOUNT_BILL_DAY")
	private int orderAccountBillDay;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_ACCOUNT_END_DATE")
	private Date orderAccountEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_ACCOUNT_START_DATE")
	private Date orderAccountStartDate;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;

	//bi-directional many-to-one association to OrderAccountProduct
	@OneToMany(mappedBy="orderAccount")
	private List<OrderAccountProduct> orderAccountProducts;

	public OrderAccount() {
	}

	public String getOrderAccountId() {
		return this.orderAccountId;
	}

	public void setOrderAccountId(String orderAccountId) {
		this.orderAccountId = orderAccountId;
	}

	public int getOrderAccountBillDay() {
		return this.orderAccountBillDay;
	}

	public void setOrderAccountBillDay(int orderAccountBillDay) {
		this.orderAccountBillDay = orderAccountBillDay;
	}

	public Date getOrderAccountEndDate() {
		return this.orderAccountEndDate;
	}

	public void setOrderAccountEndDate(Date orderAccountEndDate) {
		this.orderAccountEndDate = orderAccountEndDate;
	}

	public Date getOrderAccountStartDate() {
		return this.orderAccountStartDate;
	}

	public void setOrderAccountStartDate(Date orderAccountStartDate) {
		this.orderAccountStartDate = orderAccountStartDate;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<OrderAccountProduct> getOrderAccountProducts() {
		return this.orderAccountProducts;
	}

	public void setOrderAccountProducts(List<OrderAccountProduct> orderAccountProducts) {
		this.orderAccountProducts = orderAccountProducts;
	}

	public OrderAccountProduct addOrderAccountProduct(OrderAccountProduct orderAccountProduct) {
		getOrderAccountProducts().add(orderAccountProduct);
		orderAccountProduct.setOrderAccount(this);

		return orderAccountProduct;
	}

	public OrderAccountProduct removeOrderAccountProduct(OrderAccountProduct orderAccountProduct) {
		getOrderAccountProducts().remove(orderAccountProduct);
		orderAccountProduct.setOrderAccount(null);

		return orderAccountProduct;
	}

}