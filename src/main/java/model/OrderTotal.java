package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the order_total database table.
 * 
 */
@Entity
@Table(name="order_total")
@NamedQuery(name="OrderTotal.findAll", query="SELECT o FROM OrderTotal o")
public class OrderTotal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ACCOUNT_ID")
	private String orderAccountId;

	private String code;

	private String module;

	@Column(name="ORDER_TOTAL_TYPE")
	private String orderTotalType;

	@Column(name="ORDER_VALUE_TYPE")
	private String orderValueType;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	@Lob
	private String text;

	private String title;

	private BigDecimal value;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;

	public OrderTotal() {
	}

	public String getOrderAccountId() {
		return this.orderAccountId;
	}

	public void setOrderAccountId(String orderAccountId) {
		this.orderAccountId = orderAccountId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getOrderTotalType() {
		return this.orderTotalType;
	}

	public void setOrderTotalType(String orderTotalType) {
		this.orderTotalType = orderTotalType;
	}

	public String getOrderValueType() {
		return this.orderValueType;
	}

	public void setOrderValueType(String orderValueType) {
		this.orderValueType = orderValueType;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}