package nl.codecastle.repositories;

import nl.codecastle.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link Client} objects.
 */
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    Client findById(Long id);

    Client findByName(String clientName);
}
