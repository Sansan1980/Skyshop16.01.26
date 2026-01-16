package org.skypro.skyshop.model.search;


import java.util.UUID;

public interface Searchable {
    String searchTerm();

    String returnsNameTipContent();

    String getStringRepresentation();

    UUID getId();
}
