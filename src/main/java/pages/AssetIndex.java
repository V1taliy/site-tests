package pages;

import utils.WebDriverWrapper;

public class AssetIndex extends AbstractPage {
    AssetIndex(WebDriverWrapper driverWrapper) {
        super(driverWrapper);
    }
    public void clickAssetIndex() {
        web.moveToElementAndClick("marketAnalysis", "assetIndex");
    }
    public boolean isAssetIndexSpotPresent() {
        return web.isElementPresent("assetIndexSpot");
    }

}
