package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tax_class database table.
 * 
 */
@Entity
@Table(name="tax_class")
@NamedQuery(name="TaxClass.findAll", query="SELECT t FROM TaxClass t")
public class TaxClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TAX_CLASS_ID")
	private String taxClassId;

	@Column(name="TAX_CLASS_CODE")
	private String taxClassCode;

	@Column(name="TAX_CLASS_TITLE")
	private String taxClassTitle;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="taxClass")
	private List<Product> products;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to TaxRate
	@OneToMany(mappedBy="taxClass")
	private List<TaxRate> taxRates;

	public TaxClass() {
	}

	public String getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(String taxClassId) {
		this.taxClassId = taxClassId;
	}

	public String getTaxClassCode() {
		return this.taxClassCode;
	}

	public void setTaxClassCode(String taxClassCode) {
		this.taxClassCode = taxClassCode;
	}

	public String getTaxClassTitle() {
		return this.taxClassTitle;
	}

	public void setTaxClassTitle(String taxClassTitle) {
		this.taxClassTitle = taxClassTitle;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setTaxClass(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setTaxClass(null);

		return product;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public List<TaxRate> getTaxRates() {
		return this.taxRates;
	}

	public void setTaxRates(List<TaxRate> taxRates) {
		this.taxRates = taxRates;
	}

	public TaxRate addTaxRate(TaxRate taxRate) {
		getTaxRates().add(taxRate);
		taxRate.setTaxClass(this);

		return taxRate;
	}

	public TaxRate removeTaxRate(TaxRate taxRate) {
		getTaxRates().remove(taxRate);
		taxRate.setTaxClass(null);

		return taxRate;
	}

}