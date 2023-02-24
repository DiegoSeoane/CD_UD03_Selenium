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

    WebDriver driver ;
    @Before
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "/media/a22diegosg/a22diegosg_documentos/ContornosDesenvolvemento/2ºTrimestre/CD_UD03_Selenium1/driver/chromedriver");
        driver = new ChromeDriver();  
        driver.get("https://siciliainbocca.es/web_wp/santiago");             
    }
    @Test
    public void testCPF2(){
        WebElement a = driver.findElement(By.id("menu-item-1953"));
        a.click(); 
        WebElement b = driver.findElement(By.linkText("https://siciliainbocca.es/web_wp/producto/margheritapizza"));
        b.click();
    }

    /*
    @Test
    public void testCombo(){
         

        WebElement a = driver.findElement(By.name("pinha"));
        WebElement b = driver.findElement(By.name("sin_pinha"));
        
        a.click();
        b.click();
        
        assertEquals(true, !a.isSelected());
        assertEquals(true, b.isSelected());
        
    }

    @Test
    public void testRadio(){

        WebElement masaFina = driver.findElement(By.cssSelector("[name='boton' value='1']"));
        masaFina.click();
        WebElement masaGruesa = driver.findElement(By.xpath("//input[@name='boton' and @value='2']"));
        masaGruesa.click();
    }
    @Test
    public void testComo(){

        Select menu = new Select(driver.findElement(By.name("menu")));
        menu.selectByIndex(0);        
        menu.selectByValue("2");
        menu.selectByVisibleText("Tres");
    }*/
}