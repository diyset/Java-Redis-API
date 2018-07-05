package id.co.pegadaian.redis.repo;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import id.co.pegadaian.redis.entity.TblPenjualan;

@Transactional
public interface RedisSalesRepository {

	void save(TblPenjualan sale);

	TblPenjualan find(String id);

	Map<String, TblPenjualan> findAll();

	void update(TblPenjualan sale);

	void delete(String id);

}