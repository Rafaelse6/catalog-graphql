package com.rafaelsantos.graphqlcatalog.modules.product;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}
