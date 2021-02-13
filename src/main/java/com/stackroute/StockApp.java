package com.stackroute;

import com.stackroute.exception.InvalidDateException;
import com.stackroute.exception.StockRecordNotFoundException;

public class StockApp {
	static String pathToFile = "C:\\Users\\mybea\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\java-hackathon\\files\\CIPLA_SAMPLE.csv";
	static String toDate = "02/02/1999";
	static String fromDate = "02/02/1998";
	public static void main(String[] args) {
	   
	  StockAnalyzer sa = new StockAnalyzer(pathToFile);
	  double returnAmt = (Double) 00.0;
// Find the net return percentage for the stock
       try {
		returnAmt =  sa.findNetReturn();
	} catch (StockRecordNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println("Net Return" + returnAmt);
    
     //  Find closing stock price for the given date
      try {
    	  returnAmt = sa.findClosingStockPrice(toDate);
	} catch (StockRecordNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidDateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("Closing Price" + returnAmt);
     // Find net return percentage between two dates given
      try {
		returnAmt = sa.findNetReturn(fromDate, toDate);
	} catch (StockRecordNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidDateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("Net Return" + returnAmt);
     // Provide the value of one's investment on a particular date. 
      try {
		returnAmt = sa.findInvestmentValue(0, toDate, fromDate);
	} catch (InvalidDateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (StockRecordNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("Invemntment" + returnAmt);
     // Find the highest price for the stock for the available range of dates
     returnAmt =   sa.findHighestClosingStockPrice();
     System.out.println("Highest Closing=" + returnAmt);
     // Find the daily average return of the stock. 
    returnAmt = sa.findAvgDailyReturn() ;
    System.out.println("Daily Return=" + returnAmt);
     
} 

}


