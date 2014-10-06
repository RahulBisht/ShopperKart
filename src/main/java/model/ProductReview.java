package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the product_review database table.
 * 
 */
@Entity
@Table(name="product_review")
@NamedQuery(name="ProductReview.findAll", query="SELECT p FROM ProductReview p")
public class ProductReview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_REVIEW_ID")
	private String productReviewId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REVIEW_DATE")
	private Date reviewDate;

	@Column(name="REVIEWS_RATING")
	private double reviewsRating;

	@Column(name="REVIEWS_READ")
	private BigInteger reviewsRead;

	private int status;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="CUSTOMERS_ID")
	private Customer customer;

	//bi-directional many-to-one association to ProductReviewDescription
	@OneToMany(mappedBy="productReview")
	private List<ProductReviewDescription> productReviewDescriptions;

	public ProductReview() {
	}

	public String getProductReviewId() {
		return this.productReviewId;
	}

	public void setProductReviewId(String productReviewId) {
		this.productReviewId = productReviewId;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Date getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public double getReviewsRating() {
		return this.reviewsRating;
	}

	public void setReviewsRating(double reviewsRating) {
		this.reviewsRating = reviewsRating;
	}

	public BigInteger getReviewsRead() {
		return this.reviewsRead;
	}

	public void setReviewsRead(BigInteger reviewsRead) {
		this.reviewsRead = reviewsRead;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<ProductReviewDescription> getProductReviewDescriptions() {
		return this.productReviewDescriptions;
	}

	public void setProductReviewDescriptions(List<ProductReviewDescription> productReviewDescriptions) {
		this.productReviewDescriptions = productReviewDescriptions;
	}

	public ProductReviewDescription addProductReviewDescription(ProductReviewDescription productReviewDescription) {
		getProductReviewDescriptions().add(productReviewDescription);
		productReviewDescription.setProductReview(this);

		return productReviewDescription;
	}

	public ProductReviewDescription removeProductReviewDescription(ProductReviewDescription productReviewDescription) {
		getProductReviewDescriptions().remove(productReviewDescription);
		productReviewDescription.setProductReview(null);

		return productReviewDescription;
	}

}