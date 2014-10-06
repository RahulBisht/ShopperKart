package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the zone database table.
 * 
 */
@Entity
@NamedQuery(name="Zone.findAll", query="SELECT z FROM Zone z")
public class Zone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ZONE_ID")
	private String zoneId;

	@Column(name="ZONE_CODE")
	private String zoneCode;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="zone1")
	private List<Customer> customers1;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="zone2")
	private List<Customer> customers2;

	//bi-directional many-to-one association to MerchantStore
	@OneToMany(mappedBy="zone")
	private List<MerchantStore> merchantStores;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="zone1")
	private List<Order> orders1;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="zone2")
	private List<Order> orders2;

	//bi-directional many-to-one association to TaxRate
	@OneToMany(mappedBy="zone")
	private List<TaxRate> taxRates;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID")
	private Country country;

	//bi-directional many-to-one association to ZoneDescription
	@OneToMany(mappedBy="zone")
	private List<ZoneDescription> zoneDescriptions;

	public Zone() {
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneCode() {
		return this.zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public List<Customer> getCustomers1() {
		return this.customers1;
	}

	public void setCustomers1(List<Customer> customers1) {
		this.customers1 = customers1;
	}

	public Customer addCustomers1(Customer customers1) {
		getCustomers1().add(customers1);
		customers1.setZone1(this);

		return customers1;
	}

	public Customer removeCustomers1(Customer customers1) {
		getCustomers1().remove(customers1);
		customers1.setZone1(null);

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
		customers2.setZone2(this);

		return customers2;
	}

	public Customer removeCustomers2(Customer customers2) {
		getCustomers2().remove(customers2);
		customers2.setZone2(null);

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
		merchantStore.setZone(this);

		return merchantStore;
	}

	public MerchantStore removeMerchantStore(MerchantStore merchantStore) {
		getMerchantStores().remove(merchantStore);
		merchantStore.setZone(null);

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
		orders1.setZone1(this);

		return orders1;
	}

	public Order removeOrders1(Order orders1) {
		getOrders1().remove(orders1);
		orders1.setZone1(null);

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
		orders2.setZone2(this);

		return orders2;
	}

	public Order removeOrders2(Order orders2) {
		getOrders2().remove(orders2);
		orders2.setZone2(null);

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
		taxRate.setZone(this);

		return taxRate;
	}

	public TaxRate removeTaxRate(TaxRate taxRate) {
		getTaxRates().remove(taxRate);
		taxRate.setZone(null);

		return taxRate;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<ZoneDescription> getZoneDescriptions() {
		return this.zoneDescriptions;
	}

	public void setZoneDescriptions(List<ZoneDescription> zoneDescriptions) {
		this.zoneDescriptions = zoneDescriptions;
	}

	public ZoneDescription addZoneDescription(ZoneDescription zoneDescription) {
		getZoneDescriptions().add(zoneDescription);
		zoneDescription.setZone(this);

		return zoneDescription;
	}

	public ZoneDescription removeZoneDescription(ZoneDescription zoneDescription) {
		getZoneDescriptions().remove(zoneDescription);
		zoneDescription.setZone(null);

		return zoneDescription;
	}

}