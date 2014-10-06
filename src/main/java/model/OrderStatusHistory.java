package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the order_status_history database table.
 * 
 */
@Entity
@Table(name="order_status_history")
@NamedQuery(name="OrderStatusHistory.findAll", query="SELECT o FROM OrderStatusHistory o")
public class OrderStatusHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_STATUS_HISTORY_ID")
	private String orderStatusHistoryId;

	@Lob
	private String comments;

	@Column(name="CUSTOMER_NOTIFIED")
	private int customerNotified;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_ADDED")
	private Date dateAdded;

	private String status;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;

	public OrderStatusHistory() {
	}

	public String getOrderStatusHistoryId() {
		return this.orderStatusHistoryId;
	}

	public void setOrderStatusHistoryId(String orderStatusHistoryId) {
		this.orderStatusHistoryId = orderStatusHistoryId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getCustomerNotified() {
		return this.customerNotified;
	}

	public void setCustomerNotified(int customerNotified) {
		this.customerNotified = customerNotified;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}