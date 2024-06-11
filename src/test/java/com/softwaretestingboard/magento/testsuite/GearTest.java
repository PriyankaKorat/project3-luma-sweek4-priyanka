package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearMenu;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    GearMenu gearMenu = new GearMenu();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        gearMenu.mouseoverToGearAndClickOnBags();
        gearMenu.clickOnElement(gearMenu.productDuffle);
        // Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = menPage.verifyText(gearMenu.productText);
        Assert.assertEquals(actualText, expectedText, "Text not match");
        // Change Qty 3
        gearMenu.changeQtyTo3();
        // Click on ‘Add to Cart’ Button.
        gearMenu.clickOnElement(gearMenu.addToCartButton);
        Thread.sleep(1000);
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        expectedText = "You added Overnight Duffle to your shopping cart.";
        actualText = menPage.verifyText(gearMenu.shoppingCartText);
        Assert.assertEquals(actualText, expectedText, "Product not added");
        // Click on ‘shopping cart’ Link into message
        gearMenu.clickOnElement(gearMenu.shoppingCartLink);
        // Verify the product name ‘Overnight Duffle’
        expectedText = "Overnight Duffle";
        actualText = menPage.verifyText(gearMenu.overnightDuffleText);
        Assert.assertEquals(actualText, expectedText, "text not match");
        //Verify the Qty is ‘3’Thread.sleep(2000);
        Thread.sleep(2000);
        expectedText = "3";
        actualText = getAttributeValue(gearMenu.quantityText, "value");
        Assert.assertEquals(actualText, expectedText, "Value not match");
        // Verify the product price ‘$135.00’
        expectedText = "$135.00";
        actualText = menPage.verifyText(gearMenu.priceText);
        Assert.assertEquals(actualText, expectedText, "price not match");
        // Change Qty to ‘5’
        Thread.sleep(2000);
        gearMenu.changeQtyTo5();
        Thread.sleep(3000);
        // Click on ‘Update Shopping Cart’ button
        clickOnElement(gearMenu.updateShoppingCart);
        Thread.sleep(3000);
        // Verify the product price ‘$225.00’
        expectedText = "$225.00";
        actualText = menPage.verifyText(gearMenu.productPrice);
        Assert.assertEquals(actualText, expectedText, "price not equal");
    }

}
