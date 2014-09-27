package com.darcstarsolutions.website.repositories;

import com.darcstarsolutions.website.beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {

}