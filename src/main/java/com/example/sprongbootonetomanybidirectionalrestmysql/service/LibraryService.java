package com.example.sprongbootonetomanybidirectionalrestmysql.service;

import com.example.sprongbootonetomanybidirectionalrestmysql.jpa.Library;
import org.springframework.data.domain.Page;

import java.util.List;
public interface LibraryService {
    List<Library> listLibrary();
    Library getLibraryById(int library_id);
    boolean saveLibrary(Library library);
    boolean deleteLibrary(int library_id);
    boolean updateLibrary(Library library);
}
