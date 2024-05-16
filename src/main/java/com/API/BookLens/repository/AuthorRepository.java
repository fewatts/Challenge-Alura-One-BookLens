package com.API.BookLens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.API.BookLens.model.Author;

/**
 * This interface represents a repository for managing Author entities.
 * It extends JpaRepository, providing the basic CRUD operations for Author
 * entities.
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {}