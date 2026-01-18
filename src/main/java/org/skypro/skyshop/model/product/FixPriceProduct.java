package org.skypro.skyshop.model.product;

import java.util.UUID;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE_PRODUCT = 50; // эх были времена!;


    public FixPriceProduct(UUID id, String name) {
        super(id, name);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getPrice() {
        return FIX_PRICE_PRODUCT;
    }

    @Override
    public String toString() {
        //имя продукта c фиксированной ценой>: Фиксированная цена <значение константы фиксированной цены>
        return "Id продукта  = " + getId() +
                "Имя продукта c фиксированной ценой : " + getNameProduct() +
                ", Фиксированная цена - " + getPrice();
    }


    @Override

    public String returnsNameTipContent() {
        return "FIX_PRICE_PRODUCT";
    }

    @Override
    public String getStringRepresentation() {// почему-то ошибка когда default
        return "Имя объекта - " + getNameProduct() +
                ", Тип объекта - " + returnsNameTipContent();
    }
}
