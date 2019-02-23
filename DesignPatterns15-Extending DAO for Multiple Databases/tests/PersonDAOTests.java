import java.util.List;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.jaceksysiak.designpatterns.demo1.model.MySQLDAOFactory;
import pl.jaceksysiak.designpatterns.demo1.model.Database;
import pl.jaceksysiak.designpatterns.demo1.model.Person;
import pl.jaceksysiak.designpatterns.demo1.model.PersonDAO;

import junit.framework.Assert;


public class PersonDAOTests {  /*

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		Database.getInstance().connect();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("tear down after class");
		Database.getInstance().disconnect();
	}
 
	@Before
	public void setUp() throws Exception {
		
		System.out.println("set up");
		
		PersonDAO dao = MySQLDAOFactory.getPersonDAO();
		dao.deleteAll();
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("tear down");
	}

	@Test
	public void testDemo() {
		//Assert.fail("Not yet implemented");
		int value = 7;
		value += 2;
		System.out.println("Running demo test");
		
		Assert.assertEquals("Check that arithmetic works in Java", 9, value);
		
	}
	
	@Test
	public void testCreate() throws SQLException{
		
		PersonDAO dao = MySQLDAOFactory.getPersonDAO();
		
		Person person1 = new Person ("jacek", "pss1");
		Person person2 = new Person ("kajtek", "pss2");
		
		dao.addPerson(person1);
		dao.addPerson(person2);
		
		List<Person> people = dao.getPeople();
		
		Assert.assertEquals("Should be two people in a database", 2, people.size());
		Assert.assertEquals("These two people shold be the same", person1, people.get(0));
		Assert.assertEquals("These two people shold be the same", person2, people.get(1));
	}
	
	*/

}





























