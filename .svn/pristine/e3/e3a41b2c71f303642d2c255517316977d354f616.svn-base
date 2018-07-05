package id.co.pegadaian.redis.repo;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import id.co.pegadaian.redis.entity.TblParam;

@Transactional
public interface RedisParamRepository {

	void save(TblParam param);

	TblParam find(String id);

	Map<String, TblParam> findAll();

	void update(TblParam param);

	void delete(String id);

}