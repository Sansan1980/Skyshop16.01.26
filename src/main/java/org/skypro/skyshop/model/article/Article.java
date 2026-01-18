package org.skypro.skyshop.model.article;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public class Article implements Searchable {
    private final UUID id;
    private String nameArticle;

    private String textArticle;

    public Article(UUID id, String nameArticle, String textArticle) {
        this.id = id;
        this.nameArticle = nameArticle;
        this.textArticle = textArticle;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public String getTextArticle() {
        return textArticle;
    }

    @Override
    @JsonIgnore
    public String searchTerm() {
        return getNameArticle() + getTextArticle();
    }

    @Override
    @JsonIgnore
    public String returnsNameTipContent() {
        return "ARTICLE";
    }

    @Override
    public String getStringRepresentation() {// почему-то ошибка когда default
        return "Имя объекта - " + getNameArticle() +
                ", Тип объекта - " + returnsNameTipContent();
    }

    @Override
    public String toString() {
        return "Id продукта  = " + getId() +
                "Название статьи - " + getNameArticle() +
                ", Текст статьи - " + getTextArticle();
    }


}



