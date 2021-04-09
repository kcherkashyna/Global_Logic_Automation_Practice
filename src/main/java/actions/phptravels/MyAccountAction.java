package actions.phptravels;

import pages.phptravels.MyAccountPage;

import static com.codeborne.selenide.Condition.text;

public class MyAccountAction {

    private MyAccountPage myAccountPage;

    public MyAccountAction(){
        myAccountPage = new MyAccountPage();
    }

    public void checkMyAccountName() {
        myAccountPage.getAccountName().shouldHave(text("John"));
    }
}
