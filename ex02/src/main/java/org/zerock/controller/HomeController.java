package org.zerock.controller;

@RequestMapping("value = "/", method = RequestMethod.GET")
 public String home(Locale locale, Model model) {
	logger.info("Welcome home! The client locale is {}", locale);
	
	Date date = new Date();
	DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	
	String formattedDate = dateFormat.format(date);
}
