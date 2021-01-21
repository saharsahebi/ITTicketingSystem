package teamworkmanagment.app.Service;

import teamworkmanagment.app.Entity.Ticket;
import teamworkmanagment.app.Repository.TicketRepository;

import java.util.Optional;

public class TicketService  implements TicketRepository {

    @Override
    public <S extends Ticket> S save(S s) {

        return null;
    }

    @Override
    public <S extends Ticket> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Ticket> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Ticket> findAll() {
        return null;
    }

    @Override
    public Iterable<Ticket> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Ticket ticket) {

    }

    @Override
    public void deleteAll(Iterable<? extends Ticket> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
