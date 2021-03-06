package com.github.hi_fi.statusupdater.utils;

public class Logger {
	
	public static void logImage(String imagePath) {
		logHTML("<a href='"+imagePath+"' target='_blank'><img src='"+imagePath+"' style='width:80%; height: auto;'/></a>");
	}
	
	public static void logHTML(Object log) {
		System.out.println("*HTML* "+log);
	}
	
	public static void logError(Object log) {
		System.out.println("*ERROR* "+log);
	}
	
	public static void logDebug(Object log) {
		String logLevel = Robot.getRobotVariable("LOG LEVEL");
		if (logLevel.equals("DEBUG") || logLevel.equals("TRACE")) {		
			System.out.println("*DEBUG* "+log);
		}
	}
	
	public static void logTrace(Object log) {
		String logLevel = Robot.getRobotVariable("LOG LEVEL");
		if (logLevel.equals("TRACE")) {		
			System.out.println("*TRACE* "+log);
		}
	}
	
	public static void log(Object log) {
		System.out.println("*INFO* "+log);
	}

}
