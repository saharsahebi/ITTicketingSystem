package teamworkmanagment.app.Service;

import teamworkmanagment.app.Entity.DevTeamMember;
import teamworkmanagment.app.Repository.DevTeamMembersRepository;

import java.util.Optional;

public class DevTeamMemberService implements DevTeamMembersRepository {
    @Override
    public <S extends DevTeamMember> S save(S s) {
        return null;
    }

    @Override
    public <S extends DevTeamMember> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<DevTeamMember> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<DevTeamMember> findAll() {
        return null;
    }

    @Override
    public Iterable<DevTeamMember> findAllById(Iterable<Integer> iterable) {
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
    public void delete(DevTeamMember devTeamMember) {

    }

    @Override
    public void deleteAll(Iterable<? extends DevTeamMember> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
