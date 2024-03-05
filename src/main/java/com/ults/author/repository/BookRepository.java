package com.ults.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ults.author.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
