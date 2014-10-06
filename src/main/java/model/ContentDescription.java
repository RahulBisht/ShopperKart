package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the content_description database table.
 * 
 */
@Entity
@Table(name="content_description")
@NamedQuery(name="ContentDescription.findAll", query="SELECT c FROM ContentDescription c")
public class ContentDescription implements Serializable {
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

	@Column(name="META_DESCRIPTION")
	private String metaDescription;

	@Column(name="META_KEYWORDS")
	private String metaKeywords;

	@Column(name="META_TITLE")
	private String metaTitle;

	private String name;

	@Column(name="SEF_URL")
	private String sefUrl;

	private String title;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to Content
	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private Content content;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	public ContentDescription() {
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

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}