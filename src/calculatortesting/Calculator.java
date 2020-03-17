/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatortesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author aster
 */
public class Calculator {

    public static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aster\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https:\\calculator.com");
        driver.manage().window().maximize();

    }

    //2+9=
    public static void sumTwoNumbers() {
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='9']")).click();
        driver.findElement(By.xpath("//*[@id=\"equals_btn\"]")).click();

    }

    //Check if the result of the test 2+9 is right
    public static void checkResultSum() {
        String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/table/tbody/tr/td/div/div[5]/div[2]/input[1]")).getAttribute("value");

        System.out.println("result: " + result);
        if (result.equals("11")) {
            System.out.println("Test successful");
        } else {
            System.out.println("Something goes wrong");
        }
    }

    public static void clearAll() {
        driver.findElement(By.xpath("//input[@title='clear all']")).click();
    }

    //Select trigonometric buttons
    public static void trigonometricSelection() {
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[1]/div/button")).click();
        driver.findElement(By.id("trig")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[1]/div/button")).click();
    }

    //Find cos(180)
    public static void cosCompute() {
        driver.findElement(By.xpath("//span[contains(text(),'DEG')]")).click();
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//input[@value='8']")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[9]/input[18]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'cos')]")).click();
    }

    //Check if the result of the test cos(180) is right
    public static void checkResultCos() {
        String result2 = driver.findElement(By.xpath("//*[@id=\"fld_4\"]")).getAttribute("value");

        System.out.println("result2: " + result2);
        if (result2.equals("-1")) {
            System.out.println("Test successful");
        } else {
            System.out.println("Something goes wrong");
        }
    }
    
    public static void divideTwoNumbers() {
        driver.findElement(By.xpath("//input[@value='8']")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[9]/input[9]")).click();
        driver.findElement(By.xpath("//input[@value='4']")).click();
        driver.findElement(By.xpath("//*[@id=\"equals_btn\"]")).click();
    }

    public static void currencyCalculator() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[3]/a")).click();
    }

    public static void findCurrency() {
        driver.findElement(By.xpath("//*[@id=\"calcform\"]/table/tbody/tr[1]/td[2]/input")).click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.DELETE).build().perform();
        driver.findElement(By.xpath("//*[@id=\"calcform\"]/table/tbody/tr[1]/td[2]/input")).sendKeys("1126.5");
    }

    public static void closeChrome() {
        driver.quit();
        System.out.println("Break a leg!");
    }
}
