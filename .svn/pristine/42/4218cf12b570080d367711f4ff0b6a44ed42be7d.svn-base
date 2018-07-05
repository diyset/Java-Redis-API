package id.co.pegadaian.redis.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_param")
public class TblParam implements Serializable {
	private static final long serialVersionUID = -8139569582865717033L;
	private String key, value, description;

	protected TblParam() {
	}

	public TblParam(String key, String value, String description) {
		super();
		this.key = key;
		this.value = value;
		this.description = description;
	}

	@Id
	@Column(name = "KEY_", nullable = false, length = 100)
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "VALUE_", nullable = false, length = 600)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "description_", nullable = false, length = 200)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("TblParam[KEY_=%key, VALUE_='%value', description_='%description']", key, value, description);
	}
}
