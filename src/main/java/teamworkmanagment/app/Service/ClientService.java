package teamworkmanagment.app.Service;

import teamworkmanagment.app.Entity.Client;
import teamworkmanagment.app.Repository.ClientRepository;

import java.util.Optional;

public class ClientService implements ClientRepository {

    @Override
    public <S extends Client> S save(S s) {
        return null;
    }

    @Override
    public <S extends Client> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Client> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Client> findAll() {
        return null;
    }

    @Override
    public Iterable<Client> findAllById(Iterable<Integer> iterable) {
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
    public void delete(Client client) {

    }

    @Override
    public void deleteAll(Iterable<? extends Client> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
