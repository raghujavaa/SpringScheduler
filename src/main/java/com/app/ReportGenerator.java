package com.app;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {

	// @Scheduled(fixedDelay=2000)
	// @Scheduled(fixedRate=2000)
	@Scheduled(cron = "00 * * * * ?")
	
	// <second> <minute> <hour> <day-of-month> <month> <day-of-week>
	// s m h d m w
	// 0-59 0-59 0-23 1-31 1-12
	// * no specific value
	// */x means every x
	// ? used for day/week only , no specific value
	// - range
	public void doWork() {
		System.out.println(new Date(System.currentTimeMillis()));
	}
}
