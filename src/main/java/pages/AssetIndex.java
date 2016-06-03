package pages;


import utils.WebDriverWrapper;

public class AssetIndex extends AbstractPage {
    public AssetIndex (WebDriverWrapper driverWrapper) {
        super(driverWrapper);
    }
    public void clickAssetIndex() {
        web.moveToElementAndClick("marketAnalysis", "assetIndex");
    }
    public boolean isAssetIndexSpotPresent() {
        if (web.isElementPresent("assetIndexSpot")) {
            return true;
        }else {
            return false;
        }
    }

}
