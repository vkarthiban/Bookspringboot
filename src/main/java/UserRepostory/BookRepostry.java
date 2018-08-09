package UserRepostory;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Book;

public interface BookRepostry extends JpaRepository<Book, Long>{

}
