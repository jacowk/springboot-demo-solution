package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.Entity;

@Entity
public class BugCategory extends AbstractLookupEntity {

    public BugCategory() {
    }

    public BugCategory(long id, String description) {
        super(id, description);
    }

}
