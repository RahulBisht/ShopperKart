package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the shopping_cart database table.
 * 
 */
@Entity
@Table(name="shopping_cart")
@NamedQuery(name="ShoppingCart.findAll", query="SELECT s FROM ShoppingCart s")
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHP_CART_ID")
	private String shpCartId;

	@Column(name="CUSTOMER_ID")
	private BigInteger customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="SHP_CART_CODE")
	private String shpCartCode;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to ShoppingCartItem
	@OneToMany(mappedBy="shoppingCart")
	private List<ShoppingCartItem> shoppingCartItems;

	public ShoppingCart() {
	}

	public String getShpCartId() {
		return this.shpCartId;
	}

	public void setShpCartId(String shpCartId) {
		this.shpCartId = shpCartId;
	}

	public BigInteger getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(BigInteger customerId) {
		this.customerId = customerId;
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

	public String getShpCartCode() {
		return this.shpCartCode;
	}

	public void setShpCartCode(String shpCartCode) {
		this.shpCartCode = shpCartCode;
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

	public List<ShoppingCartItem> getShoppingCartItems() {
		return this.shoppingCartItems;
	}

	public void setShoppingCartItems(List<ShoppingCartItem> shoppingCartItems) {
		this.shoppingCartItems = shoppingCartItems;
	}

	public ShoppingCartItem addShoppingCartItem(ShoppingCartItem shoppingCartItem) {
		getShoppingCartItems().add(shoppingCartItem);
		shoppingCartItem.setShoppingCart(this);

		return shoppingCartItem;
	}

	public ShoppingCartItem removeShoppingCartItem(ShoppingCartItem shoppingCartItem) {
		getShoppingCartItems().remove(shoppingCartItem);
		shoppingCartItem.setShoppingCart(null);

		return shoppingCartItem;
	}

}