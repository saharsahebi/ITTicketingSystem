package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
