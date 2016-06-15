package pages;

import utils.WebDriverWrapper;

public class AccountTypes extends AbstractPage {
    AccountTypes(WebDriverWrapper driverWrapper){
        super(driverWrapper);
    }
    public void clickAccountTypesMob() {
        web.moveToElementAndClick("navi", "navi");
        web.moveToElementAndClick("accountsMob", "accountsMob");
        web.moveToElementAndClick("accountTypesMob", "accountTypesMob");
    }
    public boolean isMiniAccContentPresent() {
        return web.isElementPresent("miniAccContent");
    }
    public void clickStandardAccount() {
        web.moveToElementAndClick("standardAccount", "standardAccount");
    }
    public boolean isStandardAccContentPresent() {
        return web.isElementPresent("standardAccContent");
    }
    public void clickExecutiveAccount() {
        web.moveToElementAndClick("executiveAccount", "executiveAccount");
    }
    public boolean isExecutiveAccContentPresent() {
        return web.isElementPresent("executiveAccContent");
    }
    public void clickVipAccount() {
        web.moveToElementAndClick("vipAccount", "vipAccount");
    }
    public boolean isVipAccContentPresent() {
        return web.isElementPresent("vipAccContent");
    }
    public void clickAccountTypesDesktop() throws InterruptedException {
        web.moveToElementAndClick("accounts", "accountTypes");
    }
    public boolean isAccountTypesContentDesktopPresent() {
        return web.isElementPresent("accountTypesContent");
    }

}
