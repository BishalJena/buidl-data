package com.jenahw.bitsassign.repository;

import com.jenahw.bitsassign.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
