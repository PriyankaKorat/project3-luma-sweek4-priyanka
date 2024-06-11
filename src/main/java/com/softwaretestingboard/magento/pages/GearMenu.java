package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearMenu extends Utility {
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");
    public By productDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    public By productText = By.xpath("//span[@class='base']");
    public By changeQuantity3 = By.xpath("//input[@id='qty']");
    public By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public By shoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    public By overnightDuffleText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    public By quantityText = By.xpath("//input[@title='Qty']");
    public By priceText = By.xpath("(//span[@class='cart-price']//span)[2]");
    public By changeQuantity5 = By.xpath("(//input[@class='input-text qty'])[1]");
    public By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    public By productPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    public By boxText = By.id("qty");
    public By boxText5 = By.xpath("(//input[@class='input-text qty'])[1]");


    public void mouseoverToGearAndClickOnBags() {
        mouseHoverToElement(gearMenu);
        mouseHoverToElementAndClick(bags);

    }
    //Change Qty 3
    public void changeQtyTo3() {
        driver.findElement(boxText).clear();
        sendTextToElement(boxText, "3");
    }
    public void changeQtyTo5() {
        driver.findElement(boxText5).clear();
        sendTextToElement(boxText5, "5");
    }


}
