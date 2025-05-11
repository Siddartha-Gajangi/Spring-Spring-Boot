package com.sid.sbeans;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
@Autowired
private LocalDate date;
public WeekDayFinder() {
	
}
public String showMessage(String user) {
	int wno=date.getDayOfWeek().getValue();
	if(wno<1 && wno>=5)
		return "Work Hard "+user;
	else
		return "Relaxx "+user; 
}
}
