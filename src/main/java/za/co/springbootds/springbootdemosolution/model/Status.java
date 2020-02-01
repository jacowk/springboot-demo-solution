package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.Entity;

@Entity
public class Status extends AbstractLookupEntity {

    public Status() {
    }

    public Status(long id, String description) {
        super(id, description);
    }

}
