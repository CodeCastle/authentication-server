package nl.codecastle.services;

import nl.codecastle.configuration.BasicClientDetails;
import nl.codecastle.models.Client;
import nl.codecastle.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

/**
 * Service for {@link ClientDetails} related operations.
 */
@Service
public class SimpleClientDetailsService implements ClientDetailsService {

    @Autowired
    private ClientRepository clientRepository;

    /**
     * Create a ClientDetails for a client with the given name.
     *
     * @param clientName Name of the client to create.
     * @return The created client details object.
     * @throws ClientRegistrationException in case there was problem creating the client details object from the
     *                                     <br> retrieved {@link Client}.
     */
    @Override
    public ClientDetails loadClientByClientId(String clientName) throws ClientRegistrationException {
        Client client = clientRepository.findByName(clientName);
        return new BasicClientDetails(client);
    }
}
