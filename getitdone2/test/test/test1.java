package test;

import java.util.List;

import models.Category;
import models.Task;
import models.User;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.api.libs.ws.WS;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import static org.junit.Assert.*;

public class test1 {

	
	// 1
	/**
	 * This function tests the task creation, the user "find by name" and the "task find by category"
	 */
	@Test
	public void findBycategoryID() {
	    running(fakeApplication(inMemoryDatabase()), new Runnable() {
	       public void run() {
	       	
	       	Task t1 = new Task("title", 
	       			false, 
	       			"descr", 
	       			1, 
	       			"zip", 
	       			"20.02" , 
	       			"1234-12-12", 
	       			User.findByName("Loremipsum"));
	       	t1.create(t1, 1);
	       	List <Task> cat = Task.findByCategory(1);
	       	assertTrue(cat.size()>0);
	       }
	    });
	}
	
	
	
	
	// 2
	/**
	 * This makes sure that task creation works and the function "mark as done" (for the task) behaves correctly
	 */
	@Test
	public void markAsDone() {
	    running(fakeApplication(inMemoryDatabase()), new Runnable() {
	       public void run() {
	    		Task t1 = new Task("Change lightbulb", true, "Change lightbulb description", 1, "11111", "20.00", "2014-11-18", User.findByName("Loremipsum"));
	    		t1 = Task.create(t1,1);
	    		t1.markAsDone(1,true);
	    		assertTrue(t1.done);
	       }
	    });
	}
	
	
	// 3
	/**
	 * This function makes sure that the server works accordingly and that the main page is really the main page
	 */
	@Test
	public void runInBrowser() {
	    running(testServer(9000), HTMLUNIT, new Callback<TestBrowser>() {
	        public void invoke(TestBrowser browser) {
	           browser.goTo("http://127.0.0.1:9000"); 
	           assertTrue(browser
	        		   .$("title")
	        		   .first()
	        		   .getText()
	        		   .equals("Welcome to GetItDone"));
	        }
	    });
	}
	
	
	// 4 
	/**
	 * This test creates a category and later on looks for the correct modification of the table category on the database
	 */
	@Test
	public void findOutCategory() {
	    running(fakeApplication(inMemoryDatabase()), new Runnable() {
	       public void run() {
	    	   Category c1 = new Category();
	    	   c1.set(c1, "DogWalking", "walking dog around");
    		   List <Category> c2 = Category.findAll();
    		   boolean found = false;
    		   for(int i = 0; i< c2.size() && !found; ++i){
    			   if(c2.get(i).name.equals(c1.name)) found = true;
    		   }
    		   assertTrue(found);
	       }
	    });
	}
	
	
	// 5
	/**
	 * This test asks the view to render a template and makes sure that has the search bar as specified
	 */
	@Test
    public void renderTemplate() {
      Content html = views.html.main.render("Welcome to GetItDone", "Create a Task", "", 0);
      assertThat(contentType(html)).isEqualTo("text/html");
      assertThat(contentAsString(html)).contains("search");
    }

};