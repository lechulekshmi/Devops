package com.devops.project.devproject;

public class NumberWords {

	String result="";
	

	 public  String toWords(int num) {
		 int num1=num;
		 String val="";
		 String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
         };
         String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
         
		 if(num>=100)
		 {
			 result="";
			 num=(num / 100) % 10;
			 val=" HUNDRED";
			 if (num > 19) {
	        	  result=result+" "+tens[num / 10] + " " + ones[num % 10];
	         } else {
	        	 result=result+" "+ones[num];
	         }
	         if (num > 0) {
	        	 result=result+" "+val;
	         }
	         num1=(num1 % 100);
			 val=" ";
			 if (num1 > 19) {
	        	  result=result+" "+tens[num1 / 10] + " " + ones[num1 % 10];
	         } else {
	        	 result=result+" "+ones[num1];
	         }
	         if (num1 > 0) {
	        	 result=result+" "+val;
	         }
		 }
		 else {
			 result="";
			 num=(num % 100);
			 val=" ";
			 if (num > 19) {
	        	  result=result+" "+tens[num / 10] + " " + ones[num % 10];
	         } else {
	        	 result=result+" "+ones[num];
	         }
	         if (num > 0) {
	        	 result=result+" "+val;
	         }
		 }
		 
         
         return result.trim();
     }

}
