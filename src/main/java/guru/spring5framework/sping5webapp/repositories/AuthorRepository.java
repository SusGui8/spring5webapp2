package guru.spring5framework.sping5webapp.repositories;

import guru.spring5framework.sping5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author, Long> {

}
