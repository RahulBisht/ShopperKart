package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CATEGORY_ID")
	private String categoryId;

	@Column(name="CATEGORY_IMAGE")
	private String categoryImage;

	@Column(name="CATEGORY_STATUS")
	private byte categoryStatus;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	private int depth;

	private String lineage;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	@Column(name="UPDT_ID")
	private String updtId;

	private byte visible;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	private Category category;

	//bi-directional many-to-one association to Category
	@OneToMany(mappedBy="category")
	private List<Category> categories;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to CategoryDescription
	@OneToMany(mappedBy="category")
	private List<CategoryDescription> categoryDescriptions;

	//bi-directional many-to-many association to Product
	@ManyToMany(mappedBy="categories")
	private List<Product> products;

	public Category() {
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryImage() {
		return this.categoryImage;
	}

	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	public byte getCategoryStatus() {
		return this.categoryStatus;
	}

	public void setCategoryStatus(byte categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public int getDepth() {
		return this.depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getLineage() {
		return this.lineage;
	}

	public void setLineage(String lineage) {
		this.lineage = lineage;
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

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category addCategory(Category category) {
		getCategories().add(category);
		category.setCategory(this);

		return category;
	}

	public Category removeCategory(Category category) {
		getCategories().remove(category);
		category.setCategory(null);

		return category;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public List<CategoryDescription> getCategoryDescriptions() {
		return this.categoryDescriptions;
	}

	public void setCategoryDescriptions(List<CategoryDescription> categoryDescriptions) {
		this.categoryDescriptions = categoryDescriptions;
	}

	public CategoryDescription addCategoryDescription(CategoryDescription categoryDescription) {
		getCategoryDescriptions().add(categoryDescription);
		categoryDescription.setCategory(this);

		return categoryDescription;
	}

	public CategoryDescription removeCategoryDescription(CategoryDescription categoryDescription) {
		getCategoryDescriptions().remove(categoryDescription);
		categoryDescription.setCategory(null);

		return categoryDescription;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}