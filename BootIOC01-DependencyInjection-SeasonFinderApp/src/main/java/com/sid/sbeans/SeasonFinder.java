package com.sid.sbeans;

import java.time.LocalDate;

public class SeasonFinder {
	
	private LocalDate date;
	
	public String showSeason() {
	int month=date.getMonthValue();
	if(month>=3 && month<=7) 
		return "Summer Season";

	else if(month>=7 && month<=9)
		return "Rainy Season";

	else
		return "Winter Season";
}
}