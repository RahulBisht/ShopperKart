package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private String userId;

	private byte active;

	@Column(name="ADMIN_A1")
	private String adminA1;

	@Column(name="ADMIN_A2")
	private String adminA2;

	@Column(name="ADMIN_A3")
	private String adminA3;

	@Column(name="ADMIN_EMAIL")
	private String adminEmail;

	@Column(name="ADMIN_FIRST_NAME")
	private String adminFirstName;

	@Column(name="ADMIN_LAST_NAME")
	private String adminLastName;

	@Column(name="ADMIN_NAME")
	private String adminName;

	@Column(name="ADMIN_PASSWORD")
	private String adminPassword;

	@Column(name="ADMIN_Q1")
	private String adminQ1;

	@Column(name="ADMIN_Q2")
	private String adminQ2;

	@Column(name="ADMIN_Q3")
	private String adminQ3;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_ACCESS")
	private Date lastAccess;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOGIN_ACCESS")
	private Date loginAccess;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to SystemNotification
	@OneToMany(mappedBy="user")
	private List<SystemNotification> systemNotifications;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="LANGUAGE_ID")
	private Language language;

	//bi-directional many-to-many association to SmGroup
	@ManyToMany(mappedBy="users")
	private List<SmGroup> smGroups;

	public User() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getAdminA1() {
		return this.adminA1;
	}

	public void setAdminA1(String adminA1) {
		this.adminA1 = adminA1;
	}

	public String getAdminA2() {
		return this.adminA2;
	}

	public void setAdminA2(String adminA2) {
		this.adminA2 = adminA2;
	}

	public String getAdminA3() {
		return this.adminA3;
	}

	public void setAdminA3(String adminA3) {
		this.adminA3 = adminA3;
	}

	public String getAdminEmail() {
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminFirstName() {
		return this.adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return this.adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminQ1() {
		return this.adminQ1;
	}

	public void setAdminQ1(String adminQ1) {
		this.adminQ1 = adminQ1;
	}

	public String getAdminQ2() {
		return this.adminQ2;
	}

	public void setAdminQ2(String adminQ2) {
		this.adminQ2 = adminQ2;
	}

	public String getAdminQ3() {
		return this.adminQ3;
	}

	public void setAdminQ3(String adminQ3) {
		this.adminQ3 = adminQ3;
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

	public Date getLastAccess() {
		return this.lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}

	public Date getLoginAccess() {
		return this.loginAccess;
	}

	public void setLoginAccess(Date loginAccess) {
		this.loginAccess = loginAccess;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public List<SystemNotification> getSystemNotifications() {
		return this.systemNotifications;
	}

	public void setSystemNotifications(List<SystemNotification> systemNotifications) {
		this.systemNotifications = systemNotifications;
	}

	public SystemNotification addSystemNotification(SystemNotification systemNotification) {
		getSystemNotifications().add(systemNotification);
		systemNotification.setUser(this);

		return systemNotification;
	}

	public SystemNotification removeSystemNotification(SystemNotification systemNotification) {
		getSystemNotifications().remove(systemNotification);
		systemNotification.setUser(null);

		return systemNotification;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public List<SmGroup> getSmGroups() {
		return this.smGroups;
	}

	public void setSmGroups(List<SmGroup> smGroups) {
		this.smGroups = smGroups;
	}

}