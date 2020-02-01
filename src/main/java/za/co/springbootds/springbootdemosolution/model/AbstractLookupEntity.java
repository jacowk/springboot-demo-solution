package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractLookupEntity {

    @Id
    @GeneratedValue
    private long id;
    private String description;

    public AbstractLookupEntity() {
    }

    public AbstractLookupEntity(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
