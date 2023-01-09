
package Test;


import isbn.ISBN;
import static org.junit.Assert.*;

import org.junit.Test;

public class isbnTest {
    
	private ISBN isbn = new ISBN();

	@Test
  public void test1() {
    assertEquals("Valid", isbn.isbn13("9780316066525"));
  }
	
	@Test
  public void test2() {
    assertEquals("Valid", isbn.isbn13("9783866155237"));
  }
	
	@Test
  public void test3() {
    assertEquals("Valid", isbn.isbn13("9780345453747"));
  }
	
	@Test
  public void test4() {
    assertEquals("Invalid", isbn.isbn13("031606652X"));
  }
	
	@Test
  public void test5() {
    assertEquals("Invalid", isbn.isbn13("9783876155237"));
  }
	
	@Test
  public void test6() {
    assertEquals("Invalid", isbn.isbn13("0345453747"));
  }
	
	@Test
  public void test7() {
    assertEquals("9780316066525", isbn.isbn13("0316066524"));
  }
	
	@Test
  public void test8() {
    assertEquals("9783866155237", isbn.isbn13("3866155239"));
  }
	
	@Test
  public void test9() {
    assertEquals("9788174504944", isbn.isbn13("817450494X"));
  }

}