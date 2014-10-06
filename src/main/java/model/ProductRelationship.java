package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product_relationship database table.
 * 
 */
@Entity
@Table(name="product_relationship")
@NamedQuery(name="ProductRelationship.findAll", query="SELECT p FROM ProductRelationship p")
public class ProductRelationship implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_RELATIONSHIP_ID")
	private String productRelationshipId;

	private byte active;

	private String code;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product1;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="RELATED_PRODUCT_ID")
	private Product product2;

	public ProductRelationship() {
	}

	public String getProductRelationshipId() {
		return this.productRelationshipId;
	}

	public void setProductRelationshipId(String productRelationshipId) {
		this.productRelationshipId = productRelationshipId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public Product getProduct1() {
		return this.product1;
	}

	public void setProduct1(Product product1) {
		this.product1 = product1;
	}

	public Product getProduct2() {
		return this.product2;
	}

	public void setProduct2(Product product2) {
		this.product2 = product2;
	}

}