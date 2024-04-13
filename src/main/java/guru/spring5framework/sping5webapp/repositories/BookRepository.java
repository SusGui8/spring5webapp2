package guru.spring5framework.sping5webapp.repositories;

import guru.spring5framework.sping5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
