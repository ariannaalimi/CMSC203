import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	
	@Test
	public void testGetAverage() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}
	
	@Test
	public void testGetTotal() {
		assertEquals(45.0,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}
	
	@Test
	public void testGetHighestInArray(){
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
	}
	
	@Test
	public void testGetLowestInArray(){
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	}
	
	@Test
	public void testGetColumnTotal() {
		
		assertEquals(14.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,1),.001);
	}
	
	@Test
	public void testGetHighestInRow() {
		
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInRow() {
		
		assertEquals(4.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1,1),.001);
	}
	
	@Test
	public void testGethHighestInColumn() {
		
		assertEquals(7.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInColumn() {
		
		assertEquals(2.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,1),.001);
	}
	
	@Test
	public void testGetHighestInRowIndex() {
		
		assertEquals(1.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInRowIndex() {
		
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,1),.001);
	}
	
	@Test
	public void testGetHighestInColumnIndex() {
		
		assertEquals(2.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInColumnIndex() {
		
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,1),.001);
	}
	
	
	
}
