package com.example.sprongbootonetomanybidirectionalrestmysql.repository;

import com.example.sprongbootonetomanybidirectionalrestmysql.jpa.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
