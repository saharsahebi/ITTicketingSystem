package teamworkmanagment.app.Repository;

import org.springframework.data.repository.CrudRepository;
import teamworkmanagment.app.Entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket,Integer> {
}
