package guru.spring5framework.sping5webapp.repositories;

import guru.spring5framework.sping5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
