package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.airbnbexample.models.auth.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}