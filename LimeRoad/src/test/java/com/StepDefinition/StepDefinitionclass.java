package com.StepDefinition;

import com.LimeRoadBase.Base_Lime;
import com.LimeRoadPom.PageObjManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class StepDefinitionclass extends Base_Lime{
//    public WebDriver driver = RunnerClass.driver;
    
	PageObjManager pg = new PageObjManager();
	
	@Given("To launch the url {string}")
	public void to_launch_the_url(String string) {
	    browserLaunch(string);
	}
	@When("User click on shop men")
	public void user_click_on_shop_men() throws InterruptedException {
		Thread.sleep(3000);
	  pg.getLogin().getClick_ShopMen().click();
}
	@Given("User click the kids")
	public void user_click_the_kids() {
	   pg.getSp().getClick_Kids().click();
	}
	@Given("User select the Tshirt")
	public void user_select_the_tshirt() {
	  pg.getSp().getClick_Tshirt().click(); 
	}
	@Given("User select the blue Tshirt")
	public void user_select_the_blue_tshirt() {
	 pg.getSp().getSelect_ImageShirt().click();   
	}
	@Given("User click the shirt size")
	public void user_click_the_shirt_size() {
	pg.getSp().getSelect_Shirt_Size().click();    
	}
	@Given("User click the addToCard")
	public void user_click_the_add_to_card() {
	   pg.getSp().getClick_AddToCart().click();
	}
}