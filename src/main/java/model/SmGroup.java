package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sm_group database table.
 * 
 */
@Entity
@Table(name="sm_group")
@NamedQuery(name="SmGroup.findAll", query="SELECT s FROM SmGroup s")
public class SmGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GROUP_ID")
	private int groupId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="GROUP_NAME")
	private String groupName;

	@Column(name="GROUP_TYPE")
	private String groupType;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-many association to Customer
	@ManyToMany
	@JoinTable(
		name="customer_group"
		, joinColumns={
			@JoinColumn(name="GROUP_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CUSTOMER_ID")
			}
		)
	private List<Customer> customers;

	//bi-directional many-to-many association to Permission
	@ManyToMany
	@JoinTable(
		name="permission_group"
		, joinColumns={
			@JoinColumn(name="GROUP_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="PERMISSION_ID")
			}
		)
	private List<Permission> permissions;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(
		name="user_group"
		, joinColumns={
			@JoinColumn(name="GROUP_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="USER_ID")
			}
		)
	private List<User> users;

	public SmGroup() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
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

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupType() {
		return this.groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}