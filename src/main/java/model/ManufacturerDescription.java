package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the manufacturer_description database table.
 * 
 */
@Entity
@Table(name="manufacturer_description")
@NamedQuery(name="ManufacturerDescription.findAll", query="SELECT m FROM ManufacturerDescription m")
public class ManufacturerDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DESCRIPTION_ID")
	private String descriptionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_LAST_CLICK")
	private Date dateLastClick;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Lob
	private String description;

	@Column(name="MANUFACTURERS_URL")
	private String manufacturersUrl;

	private String name;

	private String title;

	@Column(name="UPDT_ID")
	private String updtId;

	@Column(name="URL_CLICKED")
	private int urlClicked;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	//bi-directional many-to-one association to Manufacturer
	@ManyToOne
	@JoinColumn(name="MANUFACTURER_ID")
	private Manufacturer manufacturer;

	public ManufacturerDescription() {
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

	public Date getDateLastClick() {
		return this.dateLastClick;
	}

	public void setDateLastClick(Date dateLastClick) {
		this.dateLastClick = dateLastClick;
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

	public String getManufacturersUrl() {
		return this.manufacturersUrl;
	}

	public void setManufacturersUrl(String manufacturersUrl) {
		this.manufacturersUrl = manufacturersUrl;
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

	public int getUrlClicked() {
		return this.urlClicked;
	}

	public void setUrlClicked(int urlClicked) {
		this.urlClicked = urlClicked;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

}