package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COUNTRY_ID")
	private int countryId;

	@Column(name="COUNTRY_ISOCODE")
	private String countryIsocode;

	@Column(name="COUNTRY_SUPPORTED")
	private byte countrySupported;

	//bi-directional many-to-one association to Geozone
	@ManyToOne
	@JoinColumn(name="GEOZONE_ID")
	private Geozone geozone;

	//bi-directional many-to-one association to CountryDescription
	@OneToMany(mappedBy="country")
	private List<CountryDescription> countryDescriptions;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="country1")
	private List<Customer> customers1;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="country2")
	private List<Customer> customers2;

	//bi-directional many-to-one association to MerchantStore
	@OneToMany(mappedBy="country")
	private List<MerchantStore> merchantStores;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="country1")
	private List<Order> orders1;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="country2")
	private List<Order> orders2;

	//bi-directional many-to-one association to TaxRate
	@OneToMany(mappedBy="country")
	private List<TaxRate> taxRates;

	//bi-directional many-to-one association to Zone
	@OneToMany(mappedBy="country")
	private List<Zone> zones;

	public Country() {
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryIsocode() {
		return this.countryIsocode;
	}

	public void setCountryIsocode(String countryIsocode) {
		this.countryIsocode = countryIsocode;
	}

	public byte getCountrySupported() {
		return this.countrySupported;
	}

	public void setCountrySupported(byte countrySupported) {
		this.countrySupported = countrySupported;
	}

	public Geozone getGeozone() {
		return this.geozone;
	}

	public void setGeozone(Geozone geozone) {
		this.geozone = geozone;
	}

	public List<CountryDescription> getCountryDescriptions() {
		return this.countryDescriptions;
	}

	public void setCountryDescriptions(List<CountryDescription> countryDescriptions) {
		this.countryDescriptions = countryDescriptions;
	}

	public CountryDescription addCountryDescription(CountryDescription countryDescription) {
		getCountryDescriptions().add(countryDescription);
		countryDescription.setCountry(this);

		return countryDescription;
	}

	public CountryDescription removeCountryDescription(CountryDescription countryDescription) {
		getCountryDescriptions().remove(countryDescription);
		countryDescription.setCountry(null);

		return countryDescription;
	}

	public List<Customer> getCustomers1() {
		return this.customers1;
	}

	public void setCustomers1(List<Customer> customers1) {
		this.customers1 = customers1;
	}

	public Customer addCustomers1(Customer customers1) {
		getCustomers1().add(customers1);
		customers1.setCountry1(this);

		return customers1;
	}

	public Customer removeCustomers1(Customer customers1) {
		getCustomers1().remove(customers1);
		customers1.setCountry1(null);

		return customers1;
	}

	public List<Customer> getCustomers2() {
		return this.customers2;
	}

	public void setCustomers2(List<Customer> customers2) {
		this.customers2 = customers2;
	}

	public Customer addCustomers2(Customer customers2) {
		getCustomers2().add(customers2);
		customers2.setCountry2(this);

		return customers2;
	}

	public Customer removeCustomers2(Customer customers2) {
		getCustomers2().remove(customers2);
		customers2.setCountry2(null);

		return customers2;
	}

	public List<MerchantStore> getMerchantStores() {
		return this.merchantStores;
	}

	public void setMerchantStores(List<MerchantStore> merchantStores) {
		this.merchantStores = merchantStores;
	}

	public MerchantStore addMerchantStore(MerchantStore merchantStore) {
		getMerchantStores().add(merchantStore);
		merchantStore.setCountry(this);

		return merchantStore;
	}

	public MerchantStore removeMerchantStore(MerchantStore merchantStore) {
		getMerchantStores().remove(merchantStore);
		merchantStore.setCountry(null);

		return merchantStore;
	}

	public List<Order> getOrders1() {
		return this.orders1;
	}

	public void setOrders1(List<Order> orders1) {
		this.orders1 = orders1;
	}

	public Order addOrders1(Order orders1) {
		getOrders1().add(orders1);
		orders1.setCountry1(this);

		return orders1;
	}

	public Order removeOrders1(Order orders1) {
		getOrders1().remove(orders1);
		orders1.setCountry1(null);

		return orders1;
	}

	public List<Order> getOrders2() {
		return this.orders2;
	}

	public void setOrders2(List<Order> orders2) {
		this.orders2 = orders2;
	}

	public Order addOrders2(Order orders2) {
		getOrders2().add(orders2);
		orders2.setCountry2(this);

		return orders2;
	}

	public Order removeOrders2(Order orders2) {
		getOrders2().remove(orders2);
		orders2.setCountry2(null);

		return orders2;
	}

	public List<TaxRate> getTaxRates() {
		return this.taxRates;
	}

	public void setTaxRates(List<TaxRate> taxRates) {
		this.taxRates = taxRates;
	}

	public TaxRate addTaxRate(TaxRate taxRate) {
		getTaxRates().add(taxRate);
		taxRate.setCountry(this);

		return taxRate;
	}

	public TaxRate removeTaxRate(TaxRate taxRate) {
		getTaxRates().remove(taxRate);
		taxRate.setCountry(null);

		return taxRate;
	}

	public List<Zone> getZones() {
		return this.zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public Zone addZone(Zone zone) {
		getZones().add(zone);
		zone.setCountry(this);

		return zone;
	}

	public Zone removeZone(Zone zone) {
		getZones().remove(zone);
		zone.setCountry(null);

		return zone;
	}

}