package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the product_description database table.
 * 
 */
@Entity
@Table(name="product_description")
@NamedQuery(name="ProductDescription.findAll", query="SELECT p FROM ProductDescription p")
public class ProductDescription implements Serializable {
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

	@Column(name="DOWNLOAD_LNK")
	private String downloadLnk;

	@Column(name="META_DESCRIPTION")
	private String metaDescription;

	@Column(name="META_KEYWORDS")
	private String metaKeywords;

	@Column(name="META_TITLE")
	private String metaTitle;

	private String name;

	@Column(name="PRODUCT_HIGHLIGHT")
	private String productHighlight;

	@Column(name="SEF_URL")
	private String sefUrl;

	private String title;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	public ProductDescription() {
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

	public String getDownloadLnk() {
		return this.downloadLnk;
	}

	public void setDownloadLnk(String downloadLnk) {
		this.downloadLnk = downloadLnk;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductHighlight() {
		return this.productHighlight;
	}

	public void setProductHighlight(String productHighlight) {
		this.productHighlight = productHighlight;
	}

	public String getSefUrl() {
		return this.sefUrl;
	}

	public void setSefUrl(String sefUrl) {
		this.sefUrl = sefUrl;
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

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}