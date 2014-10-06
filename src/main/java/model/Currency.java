package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the currency database table.
 * 
 */
@Entity
@NamedQuery(name="Currency.findAll", query="SELECT c FROM Currency c")
public class Currency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CURRENCY_ID")
	private String currencyId;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CURRENCY_CURRENCY_CODE")
	private String currencyCurrencyCode;

	@Column(name="CURRENCY_NAME")
	private String currencyName;

	@Column(name="CURRENCY_SUPPORTED")
	private byte currencySupported;

	//bi-directional many-to-one association to MerchantStore
	@OneToMany(mappedBy="currency")
	private List<MerchantStore> merchantStores;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="currency")
	private List<Order> orders;

	public Currency() {
	}

	public String getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCurrencyCode() {
		return this.currencyCurrencyCode;
	}

	public void setCurrencyCurrencyCode(String currencyCurrencyCode) {
		this.currencyCurrencyCode = currencyCurrencyCode;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public byte getCurrencySupported() {
		return this.currencySupported;
	}

	public void setCurrencySupported(byte currencySupported) {
		this.currencySupported = currencySupported;
	}

	public List<MerchantStore> getMerchantStores() {
		return this.merchantStores;
	}

	public void setMerchantStores(List<MerchantStore> merchantStores) {
		this.merchantStores = merchantStores;
	}

	public MerchantStore addMerchantStore(MerchantStore merchantStore) {
		getMerchantStores().add(merchantStore);
		merchantStore.setCurrency(this);

		return merchantStore;
	}

	public MerchantStore removeMerchantStore(MerchantStore merchantStore) {
		getMerchantStores().remove(merchantStore);
		merchantStore.setCurrency(null);

		return merchantStore;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setCurrency(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setCurrency(null);

		return order;
	}

}