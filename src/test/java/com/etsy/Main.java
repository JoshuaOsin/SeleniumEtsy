package com.etsy;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TC #1: Search items from etsy.com
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //2- Go to: https://etsy.com
        driver.get("https://etsy.com");


        // 3- Search items
        // only for one item
        //SearchEtsy.searchItem(driver, "Pillow");
        // print title
        //System.out.println(driver.getTitle());


        // go back to search again
        //driver.navigate().back();

        // list of items

        ArrayList<String> itemList = new ArrayList<>();
        itemList.addAll(Arrays.asList("Handbag", "Candles", "Toys", "Containers", "ring", "cake", "decorations", "necklace"));

        for (String item : itemList) {
            SearchEtsy.searchItem(driver, item);

            // print title
            System.out.println(driver.getTitle());

            // go back to search again
            driver.navigate().back();


        }


    }
}