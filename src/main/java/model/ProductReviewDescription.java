package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the product_review_description database table.
 * 
 */
@Entity
@Table(name="product_review_description")
@NamedQuery(name="ProductReviewDescription.findAll", query="SELECT p FROM ProductReviewDescription p")
public class ProductReviewDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DESCRIPTION_ID")
	private String descriptionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Lob
	private String description;

	private String name;

	private String title;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to ProductReview
	@ManyToOne
	@JoinColumn(name="PRODUCT_REVIEW_ID")
	private ProductReview productReview;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	public ProductReviewDescription() {
	}

	public String getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(String descriptionId) {
		this.descriptionId = descriptionId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public ProductReview getProductReview() {
		return this.productReview;
	}

	public void setProductReview(ProductReview productReview) {
		this.productReview = productReview;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}