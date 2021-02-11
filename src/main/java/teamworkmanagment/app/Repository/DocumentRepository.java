package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.Document;

public interface DocumentRepository extends CrudRepository<Document,Long> {
}
