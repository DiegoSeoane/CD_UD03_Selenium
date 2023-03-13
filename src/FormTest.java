import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest {

    WebDriver driver;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver",
                "D:/_Clase/A22_Contornos/SelJun/CD_UD03_Selenium1/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://siciliainbocca.es/web_wp/santiago");
    }

    @Test
    public void testCPF1() throws InterruptedException {
        WebElement aDomicilio = driver.findElement(By.id("menu-item-1954"));
        aDomicilio.click();
        Thread.sleep(2000);

        WebElement carnes = driver.findElement(By.id("ul1917"));
        carnes.click();
        Thread.sleep(2000);

        WebElement codillo = driver.findElement(By.id("an1917")).findElement(By.className("cpTexto"));
        codillo.click();
        Thread.sleep(5000);

        WebElement realizarPedido = driver.findElement(By.id("btnPedido"));
        realizarPedido.click();
        Thread.sleep(2000);
        /* falta metodo de pago */
    }

    @Test
    public void testCPF2() throws InterruptedException {
        WebElement carta = driver.findElement(By.id("menu-item-1953"));
        carta.click();
        Thread.sleep(2000);

        WebElement pizza = driver.findElement(By.className("vincent_prod_list_item"));
        pizza.click();
        Thread.sleep(2000);

    }

    @Test
    public void testCPF3() throws InterruptedException {
        WebElement visitanos = driver.findElement(By.id("menu-item-1961"));
        visitanos.click();
        Thread.sleep(2000);

        WebElement galeria = driver.findElement( // Esto non funciona
                By.className("vc_gitem-zone-mini"));// hai que arreglalo
        galeria.click();

    }

    @Test
    public void testCPF5() throws InterruptedException {
        WebElement aDomicilio = driver.findElement(By.id("menu-item-1954"));
        aDomicilio.click();
        Thread.sleep(2000);

        WebElement carnes = driver.findElement(By.id("ul1917"));
        carnes.click();
        Thread.sleep(2000);

        WebElement codillo = driver.findElement(By.id("an1917")).findElement(By.className("cpTexto"));
        codillo.click();
        Thread.sleep(5000);

        WebElement realizarPedido = driver.findElement(By.id("btnPedido"));
        realizarPedido.click();
        Thread.sleep(2000);

        Select boton = new Select(driver.findElement(By.id("icon-plus btInput")));
        /* falta o boton */
    }

    /*
     * @Test
     * public void testCombo(){
     * 
     * 
     * WebElement a = driver.findElement(By.name("pinha"));
     * WebElement b = driver.findElement(By.name("sin_pinha"));
     * 
     * a.click();
     * b.click();
     * 
     * assertEquals(true, !a.isSelected());
     * assertEquals(true, b.isSelected());
     * 
     * }
     * 
     * @Test
     * public void testRadio(){
     * 
     * WebElement masaFina =
     * driver.findElement(By.cssSelector("[name='boton' value='1']"));
     * masaFina.click();
     * WebElement masaGruesa =
     * driver.findElement(By.xpath("//input[@name='boton' and @value='2']"));
     * masaGruesa.click();
     * }
     * 
     * @Test
     * public void testComo(){
     * 
     * Select menu = new Select(driver.findElement(By.name("menu")));
     * menu.selectByIndex(0);
     * menu.selectByValue("2");
     * menu.selectByVisibleText("Tres");
     * }
     */
}