package org.skypro.skyshop.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.exeption.IllegalSimpleProductPriceArgumentException;

import java.util.UUID;

public class SimpleProduct extends Product {
    private int praisProduct;

    public SimpleProduct(UUID id, String name, int priceProduct) throws IllegalSimpleProductPriceArgumentException {
        super(id, name);
        checSimpleProductPrice(priceProduct);
        this.praisProduct = priceProduct;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public int getPrice() {
        return praisProduct;
    }

    @Override
    public String toString() {
        return "Id продукта  = " + getId() +
                "Имя продукта - " + getNameProduct() +
                ", Его стоимость - " + getPrice();
    }

    @JsonIgnore
    @Override
    public String returnsNameTipContent() {
        return "SIMPLE_PRODUCT";
    }

    @Override
    public String getStringRepresentation() {// почему-то ошибка когда default
        return "Имя объекта - " + getNameProduct();//+
        //"Тип объекта - " + returnsNameTipContent();
    }

    public void checSimpleProductPrice(int priceProduct) throws IllegalSimpleProductPriceArgumentException {
        if (priceProduct <= 0) {
            throw new IllegalSimpleProductPriceArgumentException("Цена продукта неверна, цена должна быть строго больше ноля. ");
        }
    }
}
