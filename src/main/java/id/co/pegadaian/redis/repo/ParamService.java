package id.co.pegadaian.redis.repo;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import id.co.pegadaian.redis.entity.TblParam;

@Transactional
public interface ParamService {

	public abstract TblParam findParamByKey(String key);

	public abstract void save(TblParam param);

	public abstract void update(TblParam param);

	public abstract void delete(String key);

	public abstract List<TblParam> findAll();
}
