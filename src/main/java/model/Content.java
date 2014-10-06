package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the content database table.
 * 
 */
@Entity
@NamedQuery(name="Content.findAll", query="SELECT c FROM Content c")
public class Content implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CONTENT_ID")
	private String contentId;

	private String code;

	@Column(name="CONTENT_POSITION")
	private String contentPosition;

	@Column(name="CONTENT_TYPE")
	private String contentType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	@Column(name="UPDT_ID")
	private String updtId;

	private byte visible;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to ContentDescription
	@OneToMany(mappedBy="content")
	private List<ContentDescription> contentDescriptions;

	public Content() {
	}

	public String getContentId() {
		return this.contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContentPosition() {
		return this.contentPosition;
	}

	public void setContentPosition(String contentPosition) {
		this.contentPosition = contentPosition;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
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

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public List<ContentDescription> getContentDescriptions() {
		return this.contentDescriptions;
	}

	public void setContentDescriptions(List<ContentDescription> contentDescriptions) {
		this.contentDescriptions = contentDescriptions;
	}

	public ContentDescription addContentDescription(ContentDescription contentDescription) {
		getContentDescriptions().add(contentDescription);
		contentDescription.setContent(this);

		return contentDescription;
	}

	public ContentDescription removeContentDescription(ContentDescription contentDescription) {
		getContentDescriptions().remove(contentDescription);
		contentDescription.setContent(null);

		return contentDescription;
	}

}