package com.devops.project.devproject;


import java.util.Scanner;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;

	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		
	}
	
	public String execute(int n)  {
		 String s="";
		
			try {
				if(n==0)
					System.exit(0);
				if(n>=0 && n<=999){
		            
	                 System.out.print("NUMBER AFTER CONVERSION:\t");
	                 s=numberWords.toWords(n);
				} else{
	             s="NUMBER OUT OF RANGE";
				}
				
			} catch ( NumberFormatException  e ) {
				System.out.println( "Invalid number" ) ;
			}
			return s;
	}

	public static void main(String[] args)   {
		Scanner sc=new Scanner(System.in);
		while(true) {
			
				System.out.println("Enter the number you want to convert(0 for exit)");
				String value = sc.next() ;
				int number = Integer.parseInt( value ) ;
				
		String m=new NumberWordsApplication().execute(number) ;
		System.out.print(m);
	}

}}
