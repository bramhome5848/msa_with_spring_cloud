package com.lkj.catalogservice.service;

import com.lkj.catalogservice.repository.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
