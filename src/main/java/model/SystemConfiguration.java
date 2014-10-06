package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the system_configuration database table.
 * 
 */
@Entity
@Table(name="system_configuration")
@NamedQuery(name="SystemConfiguration.findAll", query="SELECT s FROM SystemConfiguration s")
public class SystemConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SYSTEM_CONFIG_ID")
	private String systemConfigId;

	@Column(name="CONFIG_KEY")
	private String configKey;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="UPDT_ID")
	private String updtId;

	private String value;

	public SystemConfiguration() {
	}

	public String getSystemConfigId() {
		return this.systemConfigId;
	}

	public void setSystemConfigId(String systemConfigId) {
		this.systemConfigId = systemConfigId;
	}

	public String getConfigKey() {
		return this.configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
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

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}