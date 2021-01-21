package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.Project;

public interface ProjectRepository extends CrudRepository<Project,Integer> {
}
