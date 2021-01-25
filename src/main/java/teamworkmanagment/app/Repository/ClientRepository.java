package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import teamworkmanagment.app.Entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
