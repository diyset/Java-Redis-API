package id.co.pegadaian.redis.repo;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import id.co.pegadaian.redis.entity.TblPenjualan;

@Repository
public class RedisSalesRepositoryImpl implements RedisSalesRepository {

	private static final String KEY = "TblPenjualan";
	private RedisTemplate<String, Object> redisTemplate;
	private HashOperations<String, String, TblPenjualan> hashOperations;

	@Autowired
	public RedisSalesRepositoryImpl(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(TblPenjualan sale) {
		hashOperations.put(KEY, sale.getId() + KEY, sale);
	}

	@Override
	public TblPenjualan find(String id) {
		return hashOperations.get(KEY, id);
	}

	@Override
	public Map<String, TblPenjualan> findAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public void update(TblPenjualan sale) {
		hashOperations.put(KEY, sale.getId() + KEY, sale);
	}

	@Override
	public void delete(String id) {
		hashOperations.delete(KEY, id);
	}

}
