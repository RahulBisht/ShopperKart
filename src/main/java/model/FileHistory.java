package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the file_history database table.
 * 
 */
@Entity
@Table(name="file_history")
@NamedQuery(name="FileHistory.findAll", query="SELECT f FROM FileHistory f")
public class FileHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FILE_HISTORY_ID")
	private String fileHistoryId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ACCOUNTED_DATE")
	private Date accountedDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_ADDED")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_DELETED")
	private Date dateDeleted;

	@Column(name="DOWNLOAD_COUNT")
	private int downloadCount;

	@Column(name="FILE_ID")
	private BigInteger fileId;

	private int filesize;

	//bi-directional many-to-one association to MerchantStore
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private MerchantStore merchantStore;

	public FileHistory() {
	}

	public String getFileHistoryId() {
		return this.fileHistoryId;
	}

	public void setFileHistoryId(String fileHistoryId) {
		this.fileHistoryId = fileHistoryId;
	}

	public Date getAccountedDate() {
		return this.accountedDate;
	}

	public void setAccountedDate(Date accountedDate) {
		this.accountedDate = accountedDate;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateDeleted() {
		return this.dateDeleted;
	}

	public void setDateDeleted(Date dateDeleted) {
		this.dateDeleted = dateDeleted;
	}

	public int getDownloadCount() {
		return this.downloadCount;
	}

	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}

	public BigInteger getFileId() {
		return this.fileId;
	}

	public void setFileId(BigInteger fileId) {
		this.fileId = fileId;
	}

	public int getFilesize() {
		return this.filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public MerchantStore getMerchantStore() {
		return this.merchantStore;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

}