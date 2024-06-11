package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottom = By.xpath("//a[@id='ui-id-18']");
    By pant = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By product = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("(//div[@class='swatch-option text'])[1]");
    By color = By.xpath("(//div[@class='swatch-option color'])[1]");
    By productName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    public By addToCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    public By shoppingCartText = By.xpath("//span[@class='base']");
    public By pantText = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    public By pantSize = By.xpath("//dd[contains(text(),'32')]");
    public By pantColor = By.xpath("//dd[contains(text(),'Black')]");



    public void mouseOverToMenAndClickOnPant() {
        mouseHoverToElement(menMenu);
        mouseHoverToElement(bottom);
        mouseHoverToElementAndClick(pant);
    }

    public void mouseoverToProductAndClickOnSize() {
        mouseHoverToElement(product);
        mouseHoverToElementAndClick(size);

    }
    public void clickOnBlack(){
        mouseHoverToElementAndClick(color);
    }

    public void mouseOverAndAddToCartButton() {
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCart);
    }
    public String verifyText(By by) throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(by);
    }


}
