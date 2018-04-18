package pl.sda;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import pl.sda.model.*;

public class HbnConfig {
    private static SessionFactory sessionFactory;

    public static SessionFactory getInstance() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Cabin.class);
            configuration.addAnnotatedClass(Customer.class);
            configuration.addAnnotatedClass(Reservation.class);
            configuration.addAnnotatedClass(Ship.class);
            configuration.addAnnotatedClass(Cruise.class);
            configuration.configure();
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }

}
