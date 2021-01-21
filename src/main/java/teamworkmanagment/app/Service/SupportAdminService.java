package teamworkmanagment.app.Service;

import teamworkmanagment.app.Entity.SupportAdmin;
import teamworkmanagment.app.Repository.SupportAdminRepository;

import java.util.Optional;

public class SupportAdminService implements SupportAdminRepository {
    @Override
    public <S extends SupportAdmin> S save(S s) {
        return null;
    }

    @Override
    public <S extends SupportAdmin> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<SupportAdmin> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<SupportAdmin> findAll() {
        return null;
    }

    @Override
    public Iterable<SupportAdmin> findAllById(Iterable<Integer> iterable) {
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
    public void delete(SupportAdmin supportAdmin) {

    }

    @Override
    public void deleteAll(Iterable<? extends SupportAdmin> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
