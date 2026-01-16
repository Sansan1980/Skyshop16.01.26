package org.skypro.skyshop.model.product;


import org.skypro.skyshop.exeption.IllegalProductNameArgumentException;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public abstract class Product implements Searchable {
    private final UUID id;
    private String nameProduct;


    public Product(UUID id, String nameProduct) throws IllegalProductNameArgumentException {
        this.id = id;
        chekNameProduct(nameProduct);
        this.nameProduct = nameProduct;

    }

    @Override
    public UUID getId() {
        return id;
    }

    public abstract boolean isSpecial();

    public String getNameProduct() {
        return nameProduct;
    }

    public String searchTerm() {
        return getNameProduct() + "PRODUCT";
    }


    public abstract int getPrice();

    public void chekNameProduct(String nameProduct) throws IllegalProductNameArgumentException {
        if (nameProduct.isBlank() || nameProduct == null) {
            throw new IllegalProductNameArgumentException("Введенное имя isBlank или null");
        }
    }

}





