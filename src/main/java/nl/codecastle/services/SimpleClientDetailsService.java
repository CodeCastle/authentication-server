package nl.codecastle.services;

import nl.codecastle.configuration.BasicClientDetails;
import nl.codecastle.models.Client;
import nl.codecastle.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

@Service
public class SimpleClientDetailsService implements ClientDetailsService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientDetails loadClientByClientId(String clientName) throws ClientRegistrationException {
        Client client = clientRepository.findByName(clientName);
        return new BasicClientDetails(client);
    }
}
