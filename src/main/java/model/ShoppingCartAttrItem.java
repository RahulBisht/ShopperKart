package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the shopping_cart_attr_item database table.
 * 
 */
@Entity
@Table(name="shopping_cart_attr_item")
@NamedQuery(name="ShoppingCartAttrItem.findAll", query="SELECT s FROM ShoppingCartAttrItem s")
public class ShoppingCartAttrItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHP_CART_ATTR_ITEM_ID")
	private String shpCartAttrItemId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_MODIFIED")
	private Date dateModified;

	@Column(name="PRODUCT_ATTR_ID")
	private BigInteger productAttrId;

	@Column(name="UPDT_ID")
	private String updtId;

	//bi-directional many-to-one association to ShoppingCartItem
	@ManyToOne
	@JoinColumn(name="SHP_CART_ITEM_ID")
	private ShoppingCartItem shoppingCartItem;

	public ShoppingCartAttrItem() {
	}

	public String getShpCartAttrItemId() {
		return this.shpCartAttrItemId;
	}

	public void setShpCartAttrItemId(String shpCartAttrItemId) {
		this.shpCartAttrItemId = shpCartAttrItemId;
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

	public BigInteger getProductAttrId() {
		return this.productAttrId;
	}

	public void setProductAttrId(BigInteger productAttrId) {
		this.productAttrId = productAttrId;
	}

	public String getUpdtId() {
		return this.updtId;
	}

	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}

	public ShoppingCartItem getShoppingCartItem() {
		return this.shoppingCartItem;
	}

	public void setShoppingCartItem(ShoppingCartItem shoppingCartItem) {
		this.shoppingCartItem = shoppingCartItem;
	}

}