package heresy.domain.user;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Role {

    public Role(Collection<Privilege> privileges) {
        this.privileges = privileges;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//
//    private String name;
//    @ManyToMany(mappedBy = "roles")
//    private Collection<User> users;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
    private Collection<Privilege> privileges;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Collection<Privilege> privileges) {
        this.privileges = privileges;
    }
}
