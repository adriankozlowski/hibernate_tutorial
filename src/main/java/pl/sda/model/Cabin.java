package pl.sda.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Cabin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(optional = false)
    private Ship cabin;

    public Ship getCabin() {
        return cabin;
    }

    public void setCabin(Ship cabin) {
        this.cabin = cabin;
    }

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "cabins")
    private Collection<Reservation> Reservations;

    public Collection<Reservation> getReservations() {
        return Reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        Reservations = reservations;
    }
}
