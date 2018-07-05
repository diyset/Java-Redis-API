package id.co.pegadaian.redis.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import id.co.pegadaian.redis.entity.TblParam;

@Repository
public class ParamServiceImpl implements ParamService {

	@Autowired ParamRepository paramRepo;
	
	@Override
	public TblParam findParamByKey(String key) {
		return paramRepo.getOne(key);
	}

	@Override
	public void save(TblParam param) {
		paramRepo.save(param);
	}

	@Override
	public void update(TblParam param) {
		paramRepo.save(param);
	}

	@Override
	public void delete(String key) {
		paramRepo.deleteById(key);
	}

	@Override
	public List<TblParam> findAll() {
		return paramRepo.findAll();
	}

}
