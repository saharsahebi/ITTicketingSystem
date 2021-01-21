package teamworkmanagment.app.Service;

import teamworkmanagment.app.Entity.DevTeams;
import teamworkmanagment.app.Repository.DevTeamMembersRepository;
import teamworkmanagment.app.Repository.DevTeamRepository;

import java.util.Optional;

public class DevTeamService implements DevTeamRepository {
    @Override
    public <S extends DevTeams> S save(S s) {
        return null;
    }

    @Override
    public <S extends DevTeams> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<DevTeams> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<DevTeams> findAll() {
        return null;
    }

    @Override
    public Iterable<DevTeams> findAllById(Iterable<Integer> iterable) {
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
    public void delete(DevTeams devTeams) {

    }

    @Override
    public void deleteAll(Iterable<? extends DevTeams> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
