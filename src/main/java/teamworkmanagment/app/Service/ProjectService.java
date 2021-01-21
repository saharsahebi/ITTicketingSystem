package teamworkmanagment.app.Service;

import teamworkmanagment.app.Entity.Project;
import teamworkmanagment.app.Repository.ProjectRepository;

import java.util.Optional;

public class ProjectService implements ProjectRepository {
    @Override
    public <S extends Project> S save(S s) {
        return null;
    }

    @Override
    public <S extends Project> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Project> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Project> findAll() {
        return null;
    }

    @Override
    public Iterable<Project> findAllById(Iterable<Integer> iterable) {
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
    public void delete(Project project) {

    }

    @Override
    public void deleteAll(Iterable<? extends Project> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
