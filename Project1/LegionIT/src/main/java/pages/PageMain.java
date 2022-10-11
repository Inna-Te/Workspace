package pages;

import java.net.URI;
import java.net.URL;

public class PageMain {
    public static void main(String[] args) {

//        Page loginScreen = new Page("Login", 1, "www.legionIT.com/login");
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login Page";
//        loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//        Page aboutScreen = new Page();
//      aboutScreen.setPageId(2);
//        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("Exit");
//        aboutScreen.closePage();

//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("Loginpage");
//        loginPage.setURL("http//...");
//
//        loginPage.openPage();
//        loginPage.setUserName("name");
//        loginPage.setPassword("12345");
//        loginPage.populateCredentials();

//        Page page = new Page();
//        page.getDeveloperName();

        LoginPage loginPage = new LoginPage();
        loginPage.getDeveloperName();
        loginPage.setPageId(1);
        loginPage.setPageName("login");

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();


    }
}
