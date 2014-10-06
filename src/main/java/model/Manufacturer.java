package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the manufacturer database table.
 * 
 */
@Entity
@NamedQuery(name="Manufacturer.findAll", query="SELECT m FROM Manufacturer m")
public class Manufacturer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MANUFACTURER_ID")
	private String manufacturerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="MANUFACTURER_IMAGE")
	private String manufacturerImage;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to ManufacturerDescription
	@OneToMany(mappedBy="manufacturer")
	private List<ManufacturerDescription> manufacturerDescriptions;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="manufacturer")
	private List<Product> products;

	public Manufacturer() {
	}

	public String getManufacturerId() {
		return this.manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
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

	public String getManufacturerImage() {
		return this.manufacturerImage;
	}

	public void setManufacturerImage(String manufacturerImage) {
		this.manufacturerImage = manufacturerImage;
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

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public List<ManufacturerDescription> getManufacturerDescriptions() {
		return this.manufacturerDescriptions;
	}

	public void setManufacturerDescriptions(List<ManufacturerDescription> manufacturerDescriptions) {
		this.manufacturerDescriptions = manufacturerDescriptions;
	}

	public ManufacturerDescription addManufacturerDescription(ManufacturerDescription manufacturerDescription) {
		getManufacturerDescriptions().add(manufacturerDescription);
		manufacturerDescription.setManufacturer(this);

		return manufacturerDescription;
	}

	public ManufacturerDescription removeManufacturerDescription(ManufacturerDescription manufacturerDescription) {
		getManufacturerDescriptions().remove(manufacturerDescription);
		manufacturerDescription.setManufacturer(null);

		return manufacturerDescription;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setManufacturer(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setManufacturer(null);

		return product;
	}

}