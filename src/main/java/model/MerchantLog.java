package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the merchant_log database table.
 * 
 */
@Entity
@Table(name="merchant_log")
@NamedQuery(name="MerchantLog.findAll", query="SELECT m FROM MerchantLog m")
public class MerchantLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MERCHANT_LOG_ID")
	private String merchantLogId;

	@Lob
	private String log;

	private String module;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	public MerchantLog() {
	}

	public String getMerchantLogId() {
		return this.merchantLogId;
	}

	public void setMerchantLogId(String merchantLogId) {
		this.merchantLogId = merchantLogId;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

}