package id.co.pegadaian.redis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import id.co.pegadaian.redis.entity.TblParam;

public interface ParamRepository extends JpaRepository<TblParam,String>{
	
}
