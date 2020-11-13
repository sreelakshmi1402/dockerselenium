package runner;

import org.junit.runner.RunWith;



import io.cucumber.junit.*;


@RunWith(Cucumber.class)

@CucumberOptions
(
		features="src/test/resources/Feature",
		glue={"classpath:"
				+ "src/test/java/steps"} ,
		tags= {"@first"}
)
public class TestRunner {

}
