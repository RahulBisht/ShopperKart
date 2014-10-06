package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the order_product_download database table.
 * 
 */
@Entity
@Table(name="order_product_download")
@NamedQuery(name="OrderProductDownload.findAll", query="SELECT o FROM OrderProductDownload o")
public class OrderProductDownload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_PRODUCT_DOWNLOAD_ID")
	private String orderProductDownloadId;

	@Column(name="DOWNLOAD_COUNT")
	private int downloadCount;

	@Column(name="DOWNLOAD_MAXDAYS")
	private int downloadMaxdays;

	@Column(name="ORDER_PRODUCT_FILENAME")
	private String orderProductFilename;

	//bi-directional many-to-one association to OrderProduct
	@ManyToOne
	@JoinColumn(name="ORDER_PRODUCT_ID")
	private OrderProduct orderProduct;

	public OrderProductDownload() {
	}

	public String getOrderProductDownloadId() {
		return this.orderProductDownloadId;
	}

	public void setOrderProductDownloadId(String orderProductDownloadId) {
		this.orderProductDownloadId = orderProductDownloadId;
	}

	public int getDownloadCount() {
		return this.downloadCount;
	}

	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}

	public int getDownloadMaxdays() {
		return this.downloadMaxdays;
	}

	public void setDownloadMaxdays(int downloadMaxdays) {
		this.downloadMaxdays = downloadMaxdays;
	}

	public String getOrderProductFilename() {
		return this.orderProductFilename;
	}

	public void setOrderProductFilename(String orderProductFilename) {
		this.orderProductFilename = orderProductFilename;
	}

	public OrderProduct getOrderProduct() {
		return this.orderProduct;
	}

	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}

}