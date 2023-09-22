package pageObjects;


import browserControl.WebConnector;



public class AddToCartPage extends WebConnector {


    String addCartXpath="//button[@id='add-to-cart-sauce-labs-backpack']";
     String backPackingXpath="//div[@class='inventory_item_img']";

     String checkOutXpath="//button[@id='checkout']";


    String cartLinkXpath="//div[@id='shopping_cart_container']";

    public void setAddCartXpath(){BasePage.findElementByXpath(10,addCartXpath).click();}
    public void setBackPackingXpath(){
        BasePage.findElementByXpath(10,backPackingXpath).click();
    }
    public void setCheckOutXpath(){
        BasePage.findElementByXpath(10,checkOutXpath).click();
    }
    public void setCartLinkXpath(){
        BasePage.findElementByXpath(10,cartLinkXpath).click();
    }
}
