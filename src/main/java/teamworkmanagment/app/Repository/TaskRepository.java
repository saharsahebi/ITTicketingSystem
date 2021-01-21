package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.Task;

public interface TaskRepository extends CrudRepository<Task,Integer> {
}
