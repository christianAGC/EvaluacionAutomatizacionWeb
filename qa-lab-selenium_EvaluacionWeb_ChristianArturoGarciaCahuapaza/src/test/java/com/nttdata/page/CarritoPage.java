package com.nttdata.page;

import org.openqa.selenium.By;

public class CarritoPage {

    public static By addCartButton = By.id("add-to-cart-sauce-labs-bike-light");
    public static By itemsCarrito = By.cssSelector("div.cart_item");
    public static By nameItem = By.cssSelector("div.inventory_item_name");

    public static By carritoButton = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");

    ////////////////////

    //public static By removerButton = By.id("remove-sauce-labs-backpack");
    //public static By checkout = By.id("checkout");
}
