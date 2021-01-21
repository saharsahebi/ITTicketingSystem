package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.DevTeams;

public interface DevTeamRepository extends CrudRepository<DevTeams,Integer> {
}
