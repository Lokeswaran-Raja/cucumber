package com.step;

import com.base.Base_class;
import com.pom.Pom2;
import com.pom.Pom3;
import com.pom.Pom4;
import com.pom.Pom_class;
import com.runner.Runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StepDef extends Base_class {

        public static WebDriver driver= Runner.driver;

        Pom_class pc = new Pom_class(driver);


        @Given("launch URL")
        public void launchURL() {
                url(driver,"https://adactinhotelapp.com/");
                maxi(driver);
        }

        @When("Enter username")
        public void enterUsername() {
                input(pc.getUsername(),"LokeshRahul");
        }

        @And("Enter password")
        public void enterPassword() {
                input(pc.getPass(),"873380");
        }

        @Then("After login it redirect to next page")
        public void afterLoginItRedirectToNextPage() throws IOException {
                screenshot(driver,"login.png");
                tab(pc.getLoginBtn());
        }


        Pom2 pc2 = new Pom2(driver);

        @When("select location")
        public void selectLocation() {
                selectIndex(pc2.getLocation(), 5);
        }

        @And("select hotels")
        public void selectHotels() {
                selectIndex(pc2.getSelectHotels(), 3);
        }

        @And("select room type")
        public void selectRoomType() {
                selectIndex(pc2.getRoomType(),4);
        }

        @And("select no of rooms")
        public void selectNoOfRooms() {
                selectIndex(pc2.getRoomNos(), 2);
        }

        @And("fill checkin date")
        public void fillCheckinDate() {
                input(pc2.getCheckIn(), "06/11/2023");
        }

        @And("fill checkout date")
        public void fillCheckoutDate() {
                input(pc2.getCheckOut(), "07/11/2023");
        }

        @And("select no of persons")
        public void selectNoOfPersons() {
                selectIndex(pc2.getAdultsNos(),4);
        }

//        @And("select no of children")
//        public void selectNoOfChildren() {
//                selectIndex(pc2.getChildNos(), 2);
//        }

        @When("select no of childrens")
        public void select_no_of_childrens() {
               selectIndex(pc2.getChildNos(), 2);
        }
        @Then("click search to view results")
        public void clickSearch() {

                tab(pc2.getSearchBtn());

        }

        Pom3 hotelConfirm = new Pom3(driver);

        @When("select radio button")
        public void select_radio_button() {
                tab(hotelConfirm.getRadioBtn());
        }
        @Then("click search to view next page")
        public void click_search_to_view_next_page() {
                tab(hotelConfirm.getContinueBtn());
        }

        Pom4 fillPayment = new Pom4(driver);

        @When("fill first name")
        public void fill_first_name() {
                input(fillPayment.getFirstName(),"Ashok");
        }
        @When("fill last name")
        public void fill_last_name() {
                input(fillPayment.getLastName(),"kumar");

        }
        @When("fill address")
        public void fill_address() {
                input(fillPayment.getBillAddress(),"vadapalani, Chennai, 600026");

        }
        @When("enter credit card no")
        public void enter_credit_card_no() {
                input(fillPayment.getCreditCardNo(),"1234 4567 7890 2023");

        }
        @When("enter card type")
        public void enter_card_type() {
                selectIndex(fillPayment.getCardType(),2);

        }
        @And("select expiry date year")
        public void selectExpiryDateYear() {

                selectIndex(fillPayment.getExpiryDateMnth(),5);

        }

        @And("select expiry date month")
        public void selectExpiryDateMonth() {
                selectIndex(fillPayment.getExpiryDateYear(),15);
        }
        @When("enter CVV no")
        public void enter_cvv_no() {
                input(fillPayment.getCvvNo(), "999");

        }
        @Then("click book now button")
        public void click_book_now_button() {
                tab(fillPayment.getBookNo());

        }

}
