package com.nttdata.steps;

import com.nttdata.page.CarritoPage;
import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CarritoSteps {

    private WebDriver driver;

    //constructor
    public CarritoSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Hacer click en el addCart
     */
    public void PressCar(){
        this.driver.findElement(CarritoPage.addCartButton).click();
    }
    /**
     *  Hacer click en el carrito
     **/
    public void PressIrACarrito(){
        this.driver.findElement(CarritoPage.carritoButton).click();
    }

    /**
     *Obtengo el nombre del item de productos
     * @return el valor del nombre del item carrito de productos
     */
    public String getItemName(){
        return this.driver.findElement(CarritoPage.nameItem).getText();
    }



    /**
     * Retornar la cantidad de items del carrito
     * @return la cantidad de items del carrito
     */
    public int getItemTamaño(){
        List<WebElement> items = this.driver.findElements(CarritoPage.itemsCarrito);
        return items.size();
    }

}
