package pl.sda.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Ship {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cabin")
    private Collection<Cabin> cabins;

    public Collection<Cabin> getCabins() {
        return cabins;
    }

    public void setCabins(Collection<Cabin> cabins) {
        this.cabins = cabins;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "ships")
    private Collection<Cruise> cruises;

    public Collection<Cruise> getCruises() {
        return cruises;
    }

    public void setCruises(Collection<Cruise> cruises) {
        this.cruises = cruises;
    }
}
