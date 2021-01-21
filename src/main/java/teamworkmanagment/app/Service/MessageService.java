package teamworkmanagment.app.Service;

import teamworkmanagment.app.Entity.Message;
import teamworkmanagment.app.Repository.MessagesRepository;

import java.util.Optional;

public class MessageService implements MessagesRepository {
    @Override
    public <S extends Message> S save(S s) {
        return null;
    }

    @Override
    public <S extends Message> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Message> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Message> findAll() {
        return null;
    }

    @Override
    public Iterable<Message> findAllById(Iterable<Integer> iterable) {
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
    public void delete(Message message) {

    }

    @Override
    public void deleteAll(Iterable<? extends Message> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
