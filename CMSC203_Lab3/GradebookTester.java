import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradebookTester
{


	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
		
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(20.0);
		g1.addScore(30.0);
		
		
		
		g2.addScore(10.0);
		g2.addScore(55.0);
		
		
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
		
		g1 = null;
		g2 = null;
	}

	
	@Test
	void testGradeBook()
	{
		
	}
	
	@Test
	void testAddScore() 
	{
	
		assertTrue(g1.toString().equals("20.0 30.0"));
		assertTrue(g2.toString().equals("10.0 55.0"));
		
		int expected = 2;
		
		assertEquals(expected, g1.getScoreSize());
		assertEquals(expected, g2.getScoreSize());
		
	}

	@Test
	void testSum() 
	{
		assertEquals(20.0, 30.0, g1.sum());
		assertEquals(10.0, 55.0, g2.sum());
	}

	@Test
	void testMinimum() 
	{
		assertEquals(20.0, g1.minimum(), .001);
		assertEquals(10.0, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(20.0, 30.0, g1.finalScore());
		assertEquals(10.0, 55.0, g2.finalScore());
		
	}

	
}


