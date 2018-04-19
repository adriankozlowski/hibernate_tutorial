package pl.sda.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Cruise {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "cruises")
    private Collection<Reservation> reservations;

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }

    @ManyToOne(optional = false)
    private Ship ships;

    public Ship getShips() {
        return ships;
    }

    public void setShips(Ship ships) {
        this.ships = ships;
    }
}
