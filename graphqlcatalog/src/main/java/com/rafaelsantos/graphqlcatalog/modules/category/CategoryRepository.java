package com.rafaelsantos.graphqlcatalog.modules.category;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<CategoryEntity, UUID> {
}
