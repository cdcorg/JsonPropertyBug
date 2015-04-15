package demothree.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
//import org.hibernate.annotations.Table;

import javax.persistence.*;

/**
 * Created by Lenovo on 14/04/2015.
 */

@javax.persistence.Entity
@Table(name = "entity")
public class Entity implements java.io.Serializable {
    private Integer id;

    private String name;

    // In Spring Boot: enable @JsonProperty will make it impossible to alter the property(by using HTTP PUT)
    // Without Spring Boot: the bug has been fixed, see https://jira.spring.io/browse/DATAREST-320
    @JsonProperty("family_name")
    private String family;

    public Entity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "family")
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

}
