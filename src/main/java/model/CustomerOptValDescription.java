package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the customer_opt_val_description database table.
 * 
 */
@Entity
@Table(name="customer_opt_val_description")
@NamedQuery(name="CustomerOptValDescription.findAll", query="SELECT c FROM CustomerOptValDescription c")
public class CustomerOptValDescription implements Serializable {
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

	//bi-directional many-to-one association to CustomerOptionValue
	@ManyToOne
	@JoinColumn(name="CUSTOMER_OPT_VAL_ID")
	private CustomerOptionValue customerOptionValue;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	public CustomerOptValDescription() {
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

	public CustomerOptionValue getCustomerOptionValue() {
		return this.customerOptionValue;
	}

	public void setCustomerOptionValue(CustomerOptionValue customerOptionValue) {
		this.customerOptionValue = customerOptionValue;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}