package org.skypro.skyshop.service;

import org.skypro.skyshop.model.search.SearchResult;
import org.skypro.skyshop.model.search.Searchable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class SearchService {
    private final StorageService storageService;

    public SearchService(StorageService storageService) {
        this.storageService = storageService;
    }

    public Collection<SearchResult> searchPattern(String pattern) {
        return storageService.sharedRepositoryOfProductsAndArticles().stream()
                .filter((searchable) -> searchable.searchTerm().toLowerCase().contains(pattern.toLowerCase()))
                .map((Searchable searchable) -> SearchResult.fromSearchable(searchable))
                .collect(Collectors.toList());
    }

}
