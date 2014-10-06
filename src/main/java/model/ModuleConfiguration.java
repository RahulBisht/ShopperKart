package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the module_configuration database table.
 * 
 */
@Entity
@Table(name="module_configuration")
@NamedQuery(name="ModuleConfiguration.findAll", query="SELECT m FROM ModuleConfiguration m")
public class ModuleConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MODULE_CONF_ID")
	private String moduleConfId;

	private String code;

	@Lob
	private String configuration;

	@Column(name="CUSTOM_IND")
	private byte customInd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Lob
	private String details;

	private String image;

	private String module;

	private String regions;

	private String type;

	@Column(name="UPDT_ID")
	private String updtId;

	public ModuleConfiguration() {
	}

	public String getModuleConfId() {
		return this.moduleConfId;
	}

	public void setModuleConfId(String moduleConfId) {
		this.moduleConfId = moduleConfId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public byte getCustomInd() {
		return this.customInd;
	}

	public void setCustomInd(byte customInd) {
		this.customInd = customInd;
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

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

}