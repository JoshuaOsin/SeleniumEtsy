package com.etsy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchEtsy {

    public static void searchItem (WebDriver driver, String item){

        // locate search box element

        // using locator
        WebElement searchInputBox = driver.findElement(By.id("global-enhancements-search-query"));

        //Using cssSelector
        WebElement searchInputBox2 = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));

        //Using xPath
        WebElement searchInputBox3 = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));


        // send given item value to search box and hit Enter
        searchInputBox3.sendKeys(item + Keys.ENTER);

    }
}
