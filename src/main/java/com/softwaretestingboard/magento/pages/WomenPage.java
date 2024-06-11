package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    public By sortBy = By.id("sorter");
    By productName = By.xpath("//strong[@class='product name product-item-name']//a");
    By priceList = By.xpath("//span[@class='price-wrapper ']//span");


    public By generateMenuLink(String menu) {
        mouseHoverToElement(By.xpath("//span[normalize-space()='" + menu + "']"));
        mouseHoverToElement(By.id("ui-id-9"));
        By menuLink = By.id("ui-id-11");
        return menuLink;
    }

    public void clickOnMenu(String menuName) {
        By menuLink = generateMenuLink(menuName);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        clickOnElement(menuLink);
    }

    public void selectOption() {
        selectByVisibleTextFromDropDown(sortBy, "Product Name");

    }

    public void selectOptionPrice() {
        selectByVisibleTextFromDropDown(sortBy, "Price");

    }

    public List<String> verifyOrder() {
        List<String> actualProductNames = new ArrayList<>();
        for (WebElement product : ListOfWebElements(productName)) {
            actualProductNames.add(product.getText());
        }
        System.out.println(actualProductNames);
        return actualProductNames;
    }

    public List<String> reverseProductOrder(List<String> actualProductNames) {
        List<String> expectedProducts = new ArrayList<>(actualProductNames);
        expectedProducts.sort(Collections.reverseOrder());
        actualProductNames.sort(Collections.reverseOrder());
        return expectedProducts;
    }

    public List<Double> verifyOrderByPrice() {
        List<Double> actualProductNamesByPrice = new ArrayList<>();
        for (WebElement price : ListOfWebElements(priceList)) {
            actualProductNamesByPrice.add(Double.valueOf(price.getText().replace("$", "")));
        }
        System.out.println(actualProductNamesByPrice);
        return actualProductNamesByPrice;
    }

    public List<Double> lowToHigh(List<Double> actualProductNames) {
        List<Double> expectedProducts = new ArrayList<>(actualProductNames);
        expectedProducts.sort(Collections.reverseOrder());
        actualProductNames.sort(Collections.reverseOrder());
        return expectedProducts;
    }
}

