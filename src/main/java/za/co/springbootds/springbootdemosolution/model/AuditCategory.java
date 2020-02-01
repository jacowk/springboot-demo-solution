package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.Entity;

@Entity
public class AuditCategory extends AbstractLookupEntity {

    public AuditCategory() {
    }

    public AuditCategory(long id, String description) {
        super(id, description);
    }

}
