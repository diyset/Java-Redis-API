package id.co.pegadaian.redis.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import id.co.pegadaian.redis.entity.TblPenjualan;

@Repository
public class SalesServiceImpl implements SalesService {

	@Autowired SalesRepository salesRepo;
	
	@Override
	public TblPenjualan findSaleById(String id) {
		return salesRepo.getOne(id);
	}

	@Override
	public void save(TblPenjualan sale) {
		salesRepo.save(sale);
	}

	@Override
	public void update(TblPenjualan sale) {
		salesRepo.save(sale);
	}

	@Override
	public void delete(String key) {
		salesRepo.deleteById(key);
	}

	@Override
	public List<TblPenjualan> findAll() {
		return  salesRepo.findAll();
	}

}
