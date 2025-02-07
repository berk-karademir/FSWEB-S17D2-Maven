package com.workintech.s17d2;

import com.workintech.s17d2.model.Developer;
import com.workintech.s17d2.model.JuniorDeveloper;
import com.workintech.s17d2.tax.TaxRateType;

public class Main {
private static Developer berk;
    public static void main(String[] args) {
        System.out.println(TaxRateType.SIMPLE_TAX_RATE.getTaxRate());
        System.out.println(TaxRateType.MIDDLE_TAX_RATE.getTaxRate());
        System.out.println(TaxRateType.UPPER_TAX_RATE.getTaxRate());

        berk = new JuniorDeveloper(1, "Berk",10.0);
    }

}
