package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.Message;

public interface MessagesRepository extends CrudRepository<Message,Integer> {
}
