package pl.sda.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Reservation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//
    @ManyToMany
    @JoinTable(name = "reservation_customer"
            , joinColumns = { @JoinColumn(name = "reservation_id") }
            , inverseJoinColumns = { @JoinColumn(name = "customer_id") })
    private Set<Customer> customers;

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
