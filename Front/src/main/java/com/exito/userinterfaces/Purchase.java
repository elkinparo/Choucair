package com.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Random;


public class Purchase
{

    public static final Target BUTTON = Target.the("BUTTON").located(By.xpath("//div[@class" +
            "='exito-category-menu-3-x-button']"));
    public static final Target LIST = Target.the("LIST").located(By.xpath("//div[@class=" +
            "'exito-category-menu-3-x-categoryList']//ul[@class='exito-category-menu-3-x-categoryListD']//following::li[1]"));
    public static final Target CATEGORIES = Target.the("CATEGORIES").located(By.xpath("//div[@c" +
            "lass='exito-category-menu-3-x-itemSideMenu'][1]//a[5]"));
    public static final Target PRODUCTS = Target.the("PRODUCTS").located(By.xpath("//div" +
            "[@class='vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal " +
            "vtex-search-result-3-x-galleryItem--default pa4'][3]"));
    public static final Target ADD = Target.the("ADD").located(By.xpath("//div[@class=" +
            "'exito-product-details-3-x-classForMainOffer']//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-" +
            "0-x-flexRow--row-buy-button']//div[@class='exito-vtex-components-4-x-mainBuyButton']"));
    public static final Target ADD_LIST = Target.the("ADD_LIST").located(By.xpath("//div[@" +
            "class='false bg-base w-100']//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--row-" +
            "buy-button']//div[@class='vtex-button__label flex items-center justify-center h-100 ph6 w-100 border-box ']"));
    public static final Target EMAIL = Target.the("EMAIL").located(By.xpath("//input[@id='client-pre-email']"));
    public static final Target NEXT = Target.the("NEXT").located(By.xpath("//button[@id='btn-client-pre-email']"));
    public static final Target EXITO = Target.the("EXITO").located(By.xpath("//div[@class='headerLogoDesktop']"));
    public static final Target NAME = Target.the("NAME").located(By.xpath(" "));
    public static final Target AMOUNT = Target.the("AMOUNT").located(By.xpath("//div[@clas" +
            "s='exito-vtex-components-4-x-stepperContainerQty']"));

    public static final Target CAR = Target.the("CAR").located(By.xpath("//div[@class=" +
            "'exito-header-3-x-minicartContainer ']"));

}
