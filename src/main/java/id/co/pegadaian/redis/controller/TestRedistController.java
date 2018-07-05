package id.co.pegadaian.redis.controller;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import id.co.pegadaian.redis.dto.SalesDto;
import id.co.pegadaian.redis.entity.TblParam;
import id.co.pegadaian.redis.entity.TblPenjualan;
import id.co.pegadaian.redis.repo.ParamService;
import id.co.pegadaian.redis.repo.RedisParamRepository;
import id.co.pegadaian.redis.repo.RedisSalesRepository;

@RestController
@RequestMapping("/redis")
public class TestRedistController {

	@Autowired
	RedisParamRepository redisParamRepo;
	
	@Autowired
	ParamService paramRepo;
	
	@Autowired
	RedisSalesRepository redisSalesRepo;

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/findparam", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String findAllParam() {
		String result = "";
		Map<String, TblParam> mapParams = redisParamRepo.findAll();

		for (Iterator ite = mapParams.keySet().iterator(); ite.hasNext();) {
			String key = (String) ite.next();
			TblParam param = mapParams.get(key);

			result += param.getKey() + "\n";
		}

		return result;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/findAllSales", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public SalesDto getAllSales() {
		SalesDto sales = null;
		
		LinkedList<Integer> chartdata = new LinkedList<>();
		LinkedList<String> labels = new LinkedList<>();
		Map<String, TblPenjualan> mapSales = redisSalesRepo.findAll();
		TreeMap<String, TblPenjualan> treeSales = new TreeMap<String, TblPenjualan>();
		treeSales.putAll(mapSales);
		if (treeSales.size() > 0) {
			for (Iterator ite = treeSales.keySet().iterator(); ite.hasNext();) {
				String key = (String) ite.next();
				TblPenjualan sale = treeSales.get(key);
				chartdata.add(sale.getPenjualan());
				labels.add(sale.getBulan());
			}
			
			if (chartdata.size() > 0 && labels.size() > 0) {
				sales = new SalesDto();
				sales.setLabel("Monthly Sales");
				sales.setChartData(chartdata);
				sales.setLabels(labels);
			}
		}
		
		return sales;
	}

	@RequestMapping(value = "/findparam2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String findAllParam2() {
		String result = "";
		List<TblParam> listParam = paramRepo.findAll();
		
		for (TblParam param : listParam) {
			result += param.getKey() + "\n";
		}

		return result;
	}
}
