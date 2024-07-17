package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTableStepDefinition {
	@Given("I have opened the  browser")
	public void i_have_opened_the_browser() {
	  System.out.println("The user is on the registration page ");
	}

	@When("I enter the following details in the respective fields")
	public void i_enter_the_following_details_in_the_respective_fields(DataTable dataTable) {
	     List<Map<String,String>> listMap=dataTable.asMaps(String.class,String.class);
	     for(Map<String,String> e:listMap)
	     {
	    	  System.out.println(e.get("FirstName"));
	    	  System.out.println(e.get("LastName"));
	    	  System.out.println(e.get("Phone"));
	    	  System.out.println(e.get("City"));
	    	  System.out.println(e.get("Email"));
	     }
	   
	    
	}


}
