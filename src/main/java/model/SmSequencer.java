package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sm_sequencer database table.
 * 
 */
@Entity
@Table(name="sm_sequencer")
@NamedQuery(name="SmSequencer.findAll", query="SELECT s FROM SmSequencer s")
public class SmSequencer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="SEQ_COUNT")
	private int seqCount;

	@Column(name="SEQ_NAME")
	private String seqName;

	public SmSequencer() {
	}

	public int getSeqCount() {
		return this.seqCount;
	}

	public void setSeqCount(int seqCount) {
		this.seqCount = seqCount;
	}

	public String getSeqName() {
		return this.seqName;
	}

	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

}