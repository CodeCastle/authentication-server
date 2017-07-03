package nl.codecastle.models;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Set;

/**
 * Model of the authentication client.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private String secret;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<AuthorizationGrantTypes> authorizationGrantType;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> scopes;

    /**
     * Empty constructor.
     */
    public Client() {
        // empty
    }

    /**
     * Construct a Client object. The id will be assigned when the client is saved in the database.
     *
     * @param name                    Client name.
     * @param secret                  Client secret.
     * @param authorizationGrantTypes Allowed authorization grant types.
     * @param scopes                  Authentication scopes.
     */
    public Client(String name, String secret, Set<AuthorizationGrantTypes> authorizationGrantTypes,
                  Set<String> scopes) {
        this.name = name;
        this.secret = secret;
        this.authorizationGrantType = authorizationGrantTypes;
        this.scopes = scopes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Set<AuthorizationGrantTypes> getAuthorizationGrantType() {
        return authorizationGrantType;
    }

    public void setAuthorizationGrantType(Set<AuthorizationGrantTypes> authorizationGrantType) {
        this.authorizationGrantType = authorizationGrantType;
    }

    public Set<String> getScopes() {
        return scopes;
    }

    public void setScopes(Set<String> scopes) {
        this.scopes = scopes;
    }
}
