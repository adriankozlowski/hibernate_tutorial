package pl.sda;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sda.model.Customer;
import pl.sda.model.Reservation;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SessionFactory instance = HbnConfig.getInstance();
        Session session = instance.openSession();
        Reservation reservation = new Reservation();
        if (reservation.getCustomers() == null) {
            reservation.setCustomers(new HashSet<>());
        }

        Customer customer = new Customer();
        session.save(customer);
        if (customer.getReservation() == null) {
            customer.setReservation(new HashSet<>());
        }
        customer.getReservation().add(reservation);
        reservation.getCustomers().add(customer);
        session.save(reservation); //wtf?!
        session.close();
        instance.close();
    }
}
