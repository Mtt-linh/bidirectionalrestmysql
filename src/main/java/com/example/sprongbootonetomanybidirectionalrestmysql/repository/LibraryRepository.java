package com.example.sprongbootonetomanybidirectionalrestmysql.repository;

import com.example.sprongbootonetomanybidirectionalrestmysql.jpa.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
