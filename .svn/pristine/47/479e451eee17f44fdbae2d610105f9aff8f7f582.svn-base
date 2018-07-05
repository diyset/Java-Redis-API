package id.co.pegadaian.redis.loader;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties.Jedis;

import id.co.pegadaian.redis.entity.TblParam;

public class ParamLoader {
//	
//	private final static Logger log = Logger.getLogger(ParamLoader.class);
//	private final static String ipServer = "10.254.1.94";
//	private final static int port = 6379;
////	private final static int expireTime = 30; // expire time in seconds
//	static Jedis jedis = new Jedis(ipServer, port);
//	private static String strClassName = TblParam.class.getName();
//	
//	@SuppressWarnings("unchecked")
//	public static void load() throws Exception {
//		ISession session = null;
//		try {
//			session = M24PersistentPlugin.getSessionFactory().openSession();
//			List<TblParam> list = session.createCriteria(TblParam.class).list();
//			for (TblParam param : list) {
//				String jsonParam = new Gson().toJson(param);
//				jedis.set(param.getKey() + strClassName, jsonParam);
////				jedis.expire(param.getKey() + strClassName, expireTime); // set time to live
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//			if ((session != null) && (session.isOpen()))
//				session.close();
//		}
//	}
//	
//	public static String getParam(String key) {
//		String value = jedis.get(key + strClassName);
//		if (value == null) {
//			TblParam param = getTblParamFromDb(key);
//			if (param != null) {
//				return param.getValue();
//			} else {
//				return null;
//			}
//		} else {
//			TblParam param = new Gson().fromJson(value, TblParam.class);
//			return param.getValue();
//		}
//	}
//	
//	public static TblParam getTblParam(String key) {
//		String value = jedis.get(key + strClassName);
//		if (value == null) {
//			TblParam param = getTblParamFromDb(key);
//			if (param != null) {
//				return param;
//			} else {
//				return null;
//			}
//		} else {
//			TblParam param = new Gson().fromJson(value, TblParam.class);
//			return param;
//		}
//	}
//	
//	public static String getParam(ISession session, String key) {
//		try {
//			TblParam param = getTblParam(session, key);
//			if (param != null)
//				return param.getValue();
//		} catch (Exception e) {
//			log.error(e, e);
//		}
//		return null;
//	}
//
//	public static TblParam getTblParamFromDb(String key) {
//		ISession session = null;
//		try {
//			session = M24PersistentPlugin.getSessionFactory().openSession();
//			TblParam param = (TblParam) session.get(TblParam.class, key);
//			String jsonParam = new Gson().toJson(param);
//			jedis.set(param.getKey() + strClassName, jsonParam);
////			jedis.expire(param.getKey() + strClassName, expireTime); // set time to live
//			return param;
//		} catch (Exception e) {
//			log.error(e, e);
//		} finally {
//			if (session != null && session.isOpen())
//				session.close();
//		}
//		return null;
//	}
//
//	public static TblParam getTblParam(ISession session, String key) {
//		String value = jedis.get(key + strClassName);
//		if (value == null) {
//			TblParam param = (TblParam) session.get(TblParam.class, key);
//			String jsonParam = new Gson().toJson(param);
//			jedis.set(param.getKey() + strClassName, jsonParam);
////			jedis.expire(param.getKey() + strClassName, expireTime);// set time to live
//			return param;
//		} else {
//			TblParam param = new Gson().fromJson(value, TblParam.class);
//			return param;
//		}
//	}
//	
//	public static void replace(String key, String value) {
//		ISession session = null;
//		ITransaction trx = null;
//		try {
//			session = M24PersistentPlugin.getSessionFactory().openSession();
//			trx = session.beginTransaction();
//			TblParam param = (TblParam) session.getAndLock(TblParam.class, key);
//			param.setValue(value);
//			param.setUpdateDate(new Date());
//			session.update(param);
//			trx.commit();
//
//			String jsonParam = new Gson().toJson(param);
//			jedis.set(param.getKey() + strClassName, jsonParam);
////			jedis.expire(param.getKey() + strClassName, expireTime); // set time to live
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (trx != null)
//				trx.rollback();
//		} finally {
//			if (session != null && session.isOpen())
//				session.close();
//		}
//	}
//
//	public static void replace(String key, String value, String description) {
//		ISession session = null;
//		ITransaction trx = null;
//		try {
//			session = M24PersistentPlugin.getSessionFactory().openSession();
//			trx = session.beginTransaction();
//			TblParam param = (TblParam) session.getAndLock(TblParam.class, key);
//			param.setValue(value);
//			param.setDescription(description);
//			param.setUpdateDate(new Date());
//			session.update(param);
//			trx.commit();
//
//			String jsonParam = new Gson().toJson(param);
//			jedis.set(param.getKey() + strClassName, jsonParam);
////			jedis.expire(param.getKey() + strClassName, expireTime); // set time to live
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (trx != null)
//				trx.rollback();
//		} finally {
//			if (session != null && session.isOpen())
//				session.close();
//		}
//	}

}
