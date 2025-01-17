package com.test.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
