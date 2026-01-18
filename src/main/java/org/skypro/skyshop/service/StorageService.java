package org.skypro.skyshop.service;

import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.FixPriceProduct;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.product.SimpleProduct;
import org.skypro.skyshop.model.search.Searchable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StorageService {
    private final Map<UUID, Product> productReposirory;
    private final Map<UUID, Article> articleRepository;


    //public StorageService(Searchable product) {
    public StorageService() {
        this.productReposirory = new HashMap<>();
        this.articleRepository = new HashMap<>();
        fillingInData();
       // fillingInData(product);
    }

    public Map<UUID, Product> getProductReposirory() {
        return productReposirory;
    }

    public Map<UUID, Article> getArticleRepository() {
        return articleRepository;
    }

    public List<Searchable> sharedRepositoryOfProductsAndArticles() {
        Collection<Product> productList = getProductReposirory().values();
        Collection<Article> articleList = getArticleRepository().values();
        List<Searchable> searchableList = new ArrayList<>();
        searchableList.addAll(productList);
        searchableList.addAll(articleList);
                return searchableList;
    }


    private void fillingInData() {
   // private void fillingInData(Searchable product) {
//        UUID id = UUID.randomUUID();
//        if (product.returnsNameTipContent().contains("PRODUCT") ) {
//            getProductReposirory().put(id, (Product) product);
//        }
//        if (product.returnsNameTipContent().contains("Article") ) {
//            getArticleRepository().put(id, (Article) product);
//        }
        Article articleHleb = new Article(UUID.randomUUID(), "Описание товара", "хлеб ручной работы");
        Article articleStul = new Article(UUID.randomUUID(), "Описание товара", "стул деревянный");
        Article articleStol = new Article(UUID.randomUUID(), "Описание товара", "стол деревянный");
        Product tetrad = new FixPriceProduct(UUID.randomUUID(), "тетрадь");
        Product lampa = new SimpleProduct(UUID.randomUUID(), "лампа", 969);
        Product stul = new SimpleProduct(UUID.randomUUID(), "стул", 159);
        Product lampa2 = new SimpleProduct(UUID.randomUUID(), "лампа", 23);
        Product stul2 = new SimpleProduct(UUID.randomUUID(), "стул", 159);
        Product lampa3 = new SimpleProduct(UUID.randomUUID(), "лампа", 45);
        Product stul3 = new SimpleProduct(UUID.randomUUID(),"стул", 159);
        Product lampa4 = new SimpleProduct(UUID.randomUUID(), "лампа", 567);
        Product stul4 = new SimpleProduct(UUID.randomUUID(), "стул", 159);
        Product lampa5 = new SimpleProduct(UUID.randomUUID(), "лампа", 3);
        Product stul5 = new SimpleProduct(UUID.randomUUID(), "стул", 159);
        Product blocknot = new FixPriceProduct(UUID.randomUUID(), "блокнот");
        Product bra = new SimpleProduct(UUID.randomUUID(), "бра", 100);

        this.articleRepository.put(articleHleb.getId(), articleHleb);
        this.articleRepository.put(articleStul.getId(), articleStul);
        this.articleRepository.put(articleStol.getId(), articleStol);
        this.productReposirory.put(tetrad.getId(), tetrad);
        this.productReposirory.put(lampa.getId(), lampa);
        this.productReposirory.put(stul.getId(), stul);
        this.productReposirory.put(lampa2.getId(), lampa2);
        this.productReposirory.put(stul2.getId(), stul2);
        this.productReposirory.put(lampa3.getId(), lampa3);
        this.productReposirory.put(stul3.getId(), stul3);
        this.productReposirory.put(lampa4.getId(), lampa4);
        this.productReposirory.put(stul4.getId(), stul4);
        this.productReposirory.put(lampa5.getId(), lampa5);
        this.productReposirory.put(stul5.getId(), stul5);
        this.productReposirory.put(blocknot.getId(), blocknot);
        this.productReposirory.put(bra.getId(), bra);

    }

}
