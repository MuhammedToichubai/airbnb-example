package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.airbnbexample.models.auth.User;

public interface UserRepository extends JpaRepository<User, Long> {
}