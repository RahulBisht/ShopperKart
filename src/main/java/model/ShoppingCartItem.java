package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the shopping_cart_item database table.
 * 
 */
@Entity
@Table(name="shopping_cart_item")
@NamedQuery(name="ShoppingCartItem.findAll", query="SELECT s FROM ShoppingCartItem s")
public class ShoppingCartItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHP_CART_ITEM_ID")
	private String shpCartItemId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="PRODUCT_ID")
	private BigInteger productId;

	private int quantity;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to ShoppingCartAttrItem
	@OneToMany(mappedBy="shoppingCartItem")
	private List<ShoppingCartAttrItem> shoppingCartAttrItems;

	//bi-directional many-to-one association to ShoppingCart
	@ManyToOne
	@JoinColumn(name="SHP_CART_ID")
	private ShoppingCart shoppingCart;

	public ShoppingCartItem() {
	}

	public String getShpCartItemId() {
		return this.shpCartItemId;
	}

	public void setShpCartItemId(String shpCartItemId) {
		this.shpCartItemId = shpCartItemId;
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

	public BigInteger getProductId() {
		return this.productId;
	}

	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public List<ShoppingCartAttrItem> getShoppingCartAttrItems() {
		return this.shoppingCartAttrItems;
	}

	public void setShoppingCartAttrItems(List<ShoppingCartAttrItem> shoppingCartAttrItems) {
		this.shoppingCartAttrItems = shoppingCartAttrItems;
	}

	public ShoppingCartAttrItem addShoppingCartAttrItem(ShoppingCartAttrItem shoppingCartAttrItem) {
		getShoppingCartAttrItems().add(shoppingCartAttrItem);
		shoppingCartAttrItem.setShoppingCartItem(this);

		return shoppingCartAttrItem;
	}

	public ShoppingCartAttrItem removeShoppingCartAttrItem(ShoppingCartAttrItem shoppingCartAttrItem) {
		getShoppingCartAttrItems().remove(shoppingCartAttrItem);
		shoppingCartAttrItem.setShoppingCartItem(null);

		return shoppingCartAttrItem;
	}

	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}