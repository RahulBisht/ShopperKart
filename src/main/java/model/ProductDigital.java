package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product_digital database table.
 * 
 */
@Entity
@Table(name="product_digital")
@NamedQuery(name="ProductDigital.findAll", query="SELECT p FROM ProductDigital p")
public class ProductDigital implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_DIGITAL_ID")
	private String productDigitalId;

	@Column(name="FILE_NAME")
	private String fileName;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	public ProductDigital() {
	}

	public String getProductDigitalId() {
		return this.productDigitalId;
	}

	public void setProductDigitalId(String productDigitalId) {
		this.productDigitalId = productDigitalId;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}