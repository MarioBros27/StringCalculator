package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator st = new StringCalculator();
	@Test
	void testEmptyString() {
		//Given
		String input = "";
		int expectedResult = 0;
		//When
		int result = st.add(input);
		
		//Then
		assertEquals(result, expectedResult);
	}
	@Test
	void testSingleValue() {
		//Given
		String input = "1";
		int expectedResult = 1;
		//When
		int result = st.add(input);
		//Then
		assertEquals(result,expectedResult);
	}
	@Test
	void testTwoValues() {
		//Given
		String input = "1,2";
		int expectedResult = 3;
		//When
		int result = st.add(input);
		//Then
		assertEquals(result, expectedResult);
	}
	@Test
	void testMultipleValues() {
		//Given
		String input = "3,5,8";
		int expectedResult = 16;
		//When
		int result = st.add(input);
		//Then
		assertEquals(result, expectedResult);
	}
	@Test
	void newLineSeparator() {
		//Given
		String input = "1\n2,3";
		int expectedResult = 6;
		//When
		int result = st.add(input);
		//Then
		assertEquals(result, expectedResult);
	}
	@Test
	void differentDelimeter() {
		//Given
				String input = "//;\n1;2";
				int expectedResult = 3;
				//When
				int result = st.add(input);
				//Then
				assertEquals(result, expectedResult);
	}
	@Test
	void ifNegativeNumberThenException() {
		//Given
				String input = "-3";
				int expectedResult = 3;
				String expectedMessage = "negatives not allowed -3";
				//When
				try {
					int result = st.add(input);
					//fail("hello world");
				}catch(IllegalArgumentException ill)
				{
					//Then
					assertEquals(ill.getMessage(), expectedMessage);
				}
				
				
	}

}
