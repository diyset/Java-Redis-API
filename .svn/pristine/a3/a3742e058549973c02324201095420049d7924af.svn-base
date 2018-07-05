package id.co.pegadaian.redis.scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import id.co.pegadaian.redis.entity.TblPenjualan;
import id.co.pegadaian.redis.repo.RedisSalesRepository;
import id.co.pegadaian.redis.repo.SalesService;

@Component
public class SalesScheduler {
	private static final Logger logger = LoggerFactory.getLogger(SalesScheduler.class);
	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	private static final String KEY = "TblPenjualan";

	@Autowired
	RedisSalesRepository redisSalesRepo;
	
	@Autowired
	SalesService salesRepo;

	// @Scheduled(cron = "0 * * * * ?")
	public void scheduleTaskWithCronExpression() {
		logger.info("Cron Task Scheduler TblPenjualan :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
	}

	@Scheduled(fixedRate = 10000)
	public void scheduleTaskWithFixedRate() {
		List<TblPenjualan> listTest = salesRepo.findAll();
		for (TblPenjualan sale : listTest) {
			redisSalesRepo.save(sale);
		}

		logger.info("Fixed Rate Task Scheduler TblPenjualan :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
	}

	public void scheduleTaskWithFixedDelay() {
	}

	public void scheduleTaskWithInitialDelay() {
	}
}
