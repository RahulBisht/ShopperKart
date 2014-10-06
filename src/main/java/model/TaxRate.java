package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tax_rate database table.
 * 
 */
@Entity
@Table(name="tax_rate")
@NamedQuery(name="TaxRate.findAll", query="SELECT t FROM TaxRate t")
public class TaxRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TAX_RATE_ID")
	private String taxRateId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	private byte piggyback;

	@Column(name="STORE_STATE_PROV")
	private String storeStateProv;

	@Column(name="TAX_CODE")
	private String taxCode;

	@Column(name="TAX_PRIORITY")
	private int taxPriority;

	@Column(name="TAX_RATE")
	private BigDecimal taxRate;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to TaxRate
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	private TaxRate taxRateBean;

	//bi-directional many-to-one association to TaxRate
	@OneToMany(mappedBy="taxRateBean")
	private List<TaxRate> taxRates;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to Zone
	@ManyToOne
	@JoinColumn(name="ZONE_ID")
	private Zone zone;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID")
	private Country country;

	//bi-directional many-to-one association to TaxClass
	@ManyToOne
	@JoinColumn(name="TAX_CLASS_ID")
	private TaxClass taxClass;

	//bi-directional many-to-one association to TaxRateDescription
	@OneToMany(mappedBy="taxRate")
	private List<TaxRateDescription> taxRateDescriptions;

	public TaxRate() {
	}

	public String getTaxRateId() {
		return this.taxRateId;
	}

	public void setTaxRateId(String taxRateId) {
		this.taxRateId = taxRateId;
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

	public byte getPiggyback() {
		return this.piggyback;
	}

	public void setPiggyback(byte piggyback) {
		this.piggyback = piggyback;
	}

	public String getStoreStateProv() {
		return this.storeStateProv;
	}

	public void setStoreStateProv(String storeStateProv) {
		this.storeStateProv = storeStateProv;
	}

	public String getTaxCode() {
		return this.taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public int getTaxPriority() {
		return this.taxPriority;
	}

	public void setTaxPriority(int taxPriority) {
		this.taxPriority = taxPriority;
	}

	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public TaxRate getTaxRateBean() {
		return this.taxRateBean;
	}

	public void setTaxRateBean(TaxRate taxRateBean) {
		this.taxRateBean = taxRateBean;
	}

	public List<TaxRate> getTaxRates() {
		return this.taxRates;
	}

	public void setTaxRates(List<TaxRate> taxRates) {
		this.taxRates = taxRates;
	}

	public TaxRate addTaxRate(TaxRate taxRate) {
		getTaxRates().add(taxRate);
		taxRate.setTaxRateBean(this);

		return taxRate;
	}

	public TaxRate removeTaxRate(TaxRate taxRate) {
		getTaxRates().remove(taxRate);
		taxRate.setTaxRateBean(null);

		return taxRate;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public Zone getZone() {
		return this.zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public TaxClass getTaxClass() {
		return this.taxClass;
	}

	public void setTaxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
	}

	public List<TaxRateDescription> getTaxRateDescriptions() {
		return this.taxRateDescriptions;
	}

	public void setTaxRateDescriptions(List<TaxRateDescription> taxRateDescriptions) {
		this.taxRateDescriptions = taxRateDescriptions;
	}

	public TaxRateDescription addTaxRateDescription(TaxRateDescription taxRateDescription) {
		getTaxRateDescriptions().add(taxRateDescription);
		taxRateDescription.setTaxRate(this);

		return taxRateDescription;
	}

	public TaxRateDescription removeTaxRateDescription(TaxRateDescription taxRateDescription) {
		getTaxRateDescriptions().remove(taxRateDescription);
		taxRateDescription.setTaxRate(null);

		return taxRateDescription;
	}

}