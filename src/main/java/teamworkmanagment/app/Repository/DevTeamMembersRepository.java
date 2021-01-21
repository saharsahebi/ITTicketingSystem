package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.DevTeamMember;

public interface DevTeamMembersRepository extends CrudRepository<DevTeamMember,Integer> {
}
