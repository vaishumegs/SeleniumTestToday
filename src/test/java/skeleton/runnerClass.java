package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,features="Feature",
		plugin = {"html:target/Destination"}	
)                            

public class runnerClass {

}
