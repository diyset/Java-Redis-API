package id.co.pegadaian.redis.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_penjualan")
public class TblPenjualan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3785716545108991162L;
	private String id, bulan;
	private Integer penjualan;
	
	protected TblPenjualan() {
		super();
	}

	protected TblPenjualan(String id, String bulan, Integer penjualan) {
		super();
		this.id = id;
		this.bulan = bulan;
		this.penjualan = penjualan;
	}
	
	@Id
	@Column(name = "id", nullable = false, length = 3)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "bulan", length = 20)
	public String getBulan() {
		return bulan;
	}

	public void setBulan(String bulan) {
		this.bulan = bulan;
	}

	@Column(name = "penjualan", length = 20)
	public Integer getPenjualan() {
		return penjualan;
	}

	public void setPenjualan(Integer penjualan) {
		this.penjualan = penjualan;
	}
}
