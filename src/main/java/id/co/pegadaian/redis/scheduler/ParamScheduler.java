package id.co.pegadaian.redis.scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import id.co.pegadaian.redis.entity.TblParam;
import id.co.pegadaian.redis.repo.ParamService;
import id.co.pegadaian.redis.repo.ParamServiceImpl;
import id.co.pegadaian.redis.repo.RedisParamRepository;

@Component
public class ParamScheduler {
	private static final Logger logger = LoggerFactory.getLogger(ParamScheduler.class);
	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	private static final String KEY = "TblParam";

	@Autowired
	RedisParamRepository redisParamRepo;
	
	@Autowired
	ParamService paramRepo;

	// @Scheduled(cron = "0 * * * * ?")
	public void scheduleTaskWithCronExpression() {
		logger.info("Cron Task Scheduler TblParam :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
	}

	@Scheduled(fixedRate = 100000)
	public void scheduleTaskWithFixedRate() {
		List<TblParam> listTest = paramRepo.findAll();
		for (TblParam param : listTest) {
			redisParamRepo.save(param);
		}

		logger.info("Fixed Rate Task Scheduler TblParam :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
	}

	public void scheduleTaskWithFixedDelay() {
	}

	public void scheduleTaskWithInitialDelay() {
	}
}
