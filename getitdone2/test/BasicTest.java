

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class BasicTest {

    @Test 
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }
    
    @Test
    public void renderTemplate() {
      Content html = views.html.main.render("Welcome to GetItDone", "Create a Task","", 0);
      assertThat(contentType(html)).isEqualTo("text/html");
      assertThat(contentAsString(html)).contains("Welcome");
    }
    
    
}
