package id.co.pegadaian.redis.repo;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import id.co.pegadaian.redis.entity.TblParam;

@Repository
public class RedisParamRepositoryImpl implements RedisParamRepository {

	private static final String KEY = "TblParam";
	private RedisTemplate<String, Object> redisTemplate;
	private HashOperations<String, String, TblParam> hashOperations;

	@Autowired
	public RedisParamRepositoryImpl(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(TblParam param) {
		hashOperations.put(KEY, param.getKey() + KEY, param);
	}

	@Override
	public TblParam find(String id) {
		return hashOperations.get(KEY, id);
	}

	@Override
	public Map<String, TblParam> findAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public void update(TblParam param) {
		hashOperations.put(KEY, param.getKey() + KEY, param);
	}

	@Override
	public void delete(String id) {
		hashOperations.delete(KEY, id);
	}

}
