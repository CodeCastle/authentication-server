package nl.codecastle.models;

import javax.persistence.*;
import java.util.Set;

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

    public Client() {
    }

    public Client(String name, String secret, Set<AuthorizationGrantTypes> authorizationGrantType,
                  Set<String> scopes) {
        this.name = name;
        this.secret = secret;
        this.authorizationGrantType = authorizationGrantType;
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
