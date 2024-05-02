package service;

import domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repository.RoleRepository;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class RoleImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Optional<Role> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public Role save(Role entity) throws Exception {
        return null;
    }

    @Override
    public Role update(Role entity) throws Exception {
        return null;
    }

    @Override
    public void delete(Role entity) throws Exception {

    }

    @Override
    public void deleteById(Integer integer) throws Exception {

    }

    @Override
    public void validate(Role entity) throws Exception {

    }

    @Override
    public Long count() {
        return 0L;
    }
}
