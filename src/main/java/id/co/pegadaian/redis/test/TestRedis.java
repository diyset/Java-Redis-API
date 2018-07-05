package id.co.pegadaian.redis.test;

import java.util.Map;

import com.google.gson.Gson;

import id.co.pegadaian.redis.entity.TblParam;
import redis.clients.jedis.Jedis;

public class TestRedis {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("10.254.1.94", 6379);
		jedis.auth("foobared");
		String key = "TblParam";

		String data = "BUSINESS.DATE";

//		Map<String, TblParam> mapParam = jedis.hgetAll(key);
//		TblParam param = new Gson().fromJson(value, TblParam.class);
//		System.out.println(param);

		jedis.disconnect();
	}

}
