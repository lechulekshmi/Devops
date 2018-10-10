package com.devops.project.devproject;

import org.junit.*;

public class NumberWordsTests {
	private NumberWords numberWords ;
	private NumberWordsApplication nu;
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
		nu=new NumberWordsApplication();
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "NUMBER OUT OF RANGE", nu.execute(55555 ) ) ;
	}
	@Test
	public void numberOne() {
		Assert.assertEquals( "Result", "ONE", numberWords.toWords(1) ) ;
	}
	@Test
	public void numberTwo() {
		Assert.assertEquals( "Result", "TWO", numberWords.toWords(2) ) ;
	}
	@Test
	public void numberThree() {
		Assert.assertEquals( "Result", "THREE", numberWords.toWords(3) ) ;
	}
	@Test
	public void numberFour() {
		Assert.assertEquals( "Result", "FOUR", numberWords.toWords(4) ) ;
	}
	@Test
	public void numberFive() {
		Assert.assertEquals( "Result", "FIVE", numberWords.toWords(5) ) ;
	}
	@Test
	public void numberSix() {
		Assert.assertEquals( "Result", "SIX", numberWords.toWords(6) ) ;
	}
	@Test
	public void numberSeven() {
		Assert.assertEquals( "Result", "SEVEN", numberWords.toWords(7) ) ;
	}
	@Test
	public void numberEight() {
		Assert.assertEquals( "Result", "EIGHT", numberWords.toWords(8) ) ;
	}
	@Test
	public void numberNine() {
		Assert.assertEquals( "Result", "NINE", numberWords.toWords(9) ) ;
	}
	@Test
	public void numberTen() {
		Assert.assertEquals( "Result", "TEN", numberWords.toWords(10) ) ;
	}
	@Test
	public void numberEleven() {
		Assert.assertEquals( "Result", "ELEVEN", numberWords.toWords(11) ) ;
	}
	@Test
	public void numberTwelve() {
		Assert.assertEquals( "Result", "TWELVE", numberWords.toWords(12) ) ;
	}
	public void numberThirteen() {
		Assert.assertEquals( "Result", "THIRTEEN", numberWords.toWords(13) ) ;
	}
	@Test
	public void numberFourteen() {
		Assert.assertEquals( "Result", "FOURTEEN", numberWords.toWords(14) ) ;
	}
	@Test
	public void numberFifteen() {
		Assert.assertEquals( "Result", "FIFTEEN", numberWords.toWords(15) ) ;
	}
	@Test
	public void numberSixteen() {
		Assert.assertEquals( "Result", "SIXTEEN", numberWords.toWords(16) ) ;
		
	}
	@Test
	public void numberOneSeventeen() {
		Assert.assertEquals( "Result", "SEVENTEEN", numberWords.toWords(17 ) ) ;

	}
	@Test
	public void numberEighteen() {
		Assert.assertEquals( "Result", "EIGHTEEN", numberWords.toWords(18) ) ;

	}
	@Test
	public void numberNineteen() {
		Assert.assertEquals( "Result", "NINETEEN", numberWords.toWords(19) ) ;

	}
	@Test
	public void numberTwenty() {
		Assert.assertEquals( "Result", "TWENTY", numberWords.toWords(20) ) ;
				}
	@Test
	public void numberThirty() {
		Assert.assertEquals( "Result", "THIRTY", numberWords.toWords(30 ) ) ;
		
			
	
	}
	@Test
	public void numberFourty() {
		Assert.assertEquals( "Result", "FOURTY", numberWords.toWords(40 ) ) ;
		
	}
	@Test
	public void numberFifty() {
		Assert.assertEquals( "Result", "FIFTY", numberWords.toWords(50 ) ) ;
	}
	@Test
	public void numberSixty() {
		Assert.assertEquals( "Result", "SIXTY", numberWords.toWords(60 ) ) ;
	}
	@Test
	public void numberSeventy() {
		Assert.assertEquals( "Result", "SEVENTY", numberWords.toWords(70 ) ) ;
	}
	@Test
	public void numberEighty() {
		Assert.assertEquals( "Result", "EIGHTY", numberWords.toWords(80) ) ;
	}
	@Test
	public void numberNinety() {
		Assert.assertEquals( "Result", "NINETY", numberWords.toWords(90) ) ;
	}
	
	
		
}
	


