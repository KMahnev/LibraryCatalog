package com.sberbank.librarycatalog.repository;

import com.sberbank.librarycatalog.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Book,Integer> {

    @Query(value = "SELECT DISTINCT * FROM library GROUP BY title", nativeQuery = true)
    List<Book> findAllDistinct();
    @Query("select distinct book FROM Book book WHERE book.title like %?1% group by book.title, book.publishing")
    List<Book> findDistinctByTitleAndPublishingContains(String title);
    @Query("select distinct book FROM Book book WHERE book.titleauthor like %?1% group by book.title, book.publishing")
    List<Book> findDistinctByTitleauthorAndPublishingContains(String titleauthor);
    @Query("select distinct book FROM Book book WHERE book.publishing like %?1% group by book.title")
    List<Book> findDistinctByPublishingContains(String publishing);

    List<Book> findAllByTitleContains(String title);
    List<Book> findAllByTitleAndPublishingContains(String title,String publishing);
    List<Book> findDistinctTopByTitleContains(String title);
    List<Book> findDistinctTopByTitleauthorContains(String titleauthor);
}
