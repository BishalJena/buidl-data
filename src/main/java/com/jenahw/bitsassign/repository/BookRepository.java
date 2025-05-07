package com.jenahw.bitsassign.repository;
import com.jenahw.bitsassign.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

