package org.id.customerservice.projections;

import org.id.customerservice.entities.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullcustomer", types = Customer.class)
public interface CustomerProjection extends Projection {
    public Long getId();
    public String getName();
    public String GetEmail();
}
