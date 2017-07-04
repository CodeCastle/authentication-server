package nl.codecastle.repositories;

import nl.codecastle.models.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository of {@link AppUser} instances.
 */
@Repository
public interface UserRepository extends CrudRepository<AppUser, Long>{

    /**
     * Get user by username.
     *
     * @param userName Username of the client to retrieve.
     * @return The retrieved user.
     */
    AppUser findByUsername(String userName);
}
