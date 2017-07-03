package nl.codecastle.repositories;

import nl.codecastle.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link Client} objects.
 */
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    /**
     * Get client by id.
     *
     * @param id The id of the Client to retrieve.
     * @return The retrieved client.
     */
    Client findById(Long id);

    /**
     * Get Client by name.
     * @param clientName The name of the Client to retrieve.
     * @return The retrieved client.
     */
    Client findByName(String clientName);
}
