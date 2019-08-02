package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ShoutstepDef {
	String ExcpectedResult="Free Coffee!!";
	String ActualResult;
	Person Lucy=new Person();
	Person Sean=new Person();
		
	@Given("^Lucy is (\\d+) meters away from Sean$")
	public void lucy_is_meters_away_from_Sean(int distance) throws Throwable {
	   Sean.setDistance(0);
	   Lucy.setDistance(distance);
	   
		// Write code here that turns the phrase above into concrete actions
	} 
	@When("^Sean shouts \"([^\"]*)\"$")
	public void sean_shouts(String message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ActualResult=message;
	}
	@Then("^Lucy hears Sean's message$")
	public void lucy_hears_Sean_s_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  Assert.assertEquals(ExcpectedResult, ActualResult); 
	}
}
