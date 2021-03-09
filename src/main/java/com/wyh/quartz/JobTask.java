package com.wyh.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobTask {
	private static Logger log= LoggerFactory.getLogger(JobTask.class);
	//@Scheduled(cron="0/30 * * * * ?")
	public static void Task1(){
		log.info("Task任务调度: "+new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss").format(new Date()));
	}
}
