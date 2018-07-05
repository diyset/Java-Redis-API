package id.co.pegadaian.redis.repo;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import id.co.pegadaian.redis.entity.TblPenjualan;

@Transactional
public interface SalesService {

	public abstract TblPenjualan findSaleById(String key);

	public abstract void save(TblPenjualan sale);

	public abstract void update(TblPenjualan sale);

	public abstract void delete(String key);

	public abstract List<TblPenjualan> findAll();
}
