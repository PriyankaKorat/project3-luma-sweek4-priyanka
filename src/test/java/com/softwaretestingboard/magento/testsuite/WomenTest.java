package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends TestBase {
    WomenPage womenPage = new WomenPage();

    public void selectMenu(String menuName) {
        // Click on element
        womenPage.clickOnMenu(menuName);
    }

    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse Hover on Women Menu and Mouse Hover on Tops
        String menuName = "Women"; // Example menu item
        selectMenu(menuName);
        //Select Sort By filter “Product Name”
        womenPage.selectOption();
        //verify product display in alphabetical order
        List<String> actualProductNames = womenPage.verifyOrder();
        List<String> expectedProductNames = womenPage.reverseProductOrder(actualProductNames);
        Assert.assertEquals(actualProductNames, expectedProductNames);

    }

    @Test
    public void verifyTheSortByPriceFilter() {
        //Mouse Hover on Women Menu and Mouse Hover on Tops
        String menuName = "Women"; // Example menu item
        selectMenu(menuName);
        // Select Sort By filter “Price”
        womenPage.selectOptionPrice();
        //Verify the products price display in Low to High
        List<Double> actualProductPrice = womenPage.verifyOrderByPrice();
        List<Double> expectedProductPrice = womenPage.lowToHigh(actualProductPrice);
        Assert.assertEquals(actualProductPrice, expectedProductPrice);


    }

}


