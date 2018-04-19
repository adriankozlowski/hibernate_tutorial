package pl.sda;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Main manage = new Main();

        //Dodaj kilku pracowników do bazy danych
        Integer empID1 = manage.addEmployee("Zara", "Ali", 1000);
        Integer empID2 = manage.addEmployee("Daisy", "Das", 5000);
        Integer empID3 = manage.addEmployee("John", "Paul", 10000);

        //wypisz wszystkich pracowników
        manage.listEmployees();

        //zaktualizuj jeden rekord
        manage.updateEmployee(empID1, 5000);

        //usuñ pracownika z bazy danych
        manage.deleteEmployee(empID2);

        //wypisz wysztkich pracowników po zmianach
        manage.listEmployees();
    }

    public Integer addEmployee(String fname, String lname, int salary) {
        //utwórz sesję
        //utwórz transakcję
        //rozpocznij transakcję
        //utwórz nowy obiekt typu Employee
        //zapisz obiekt typu Employee, przechowuj jego id
        //zrób commit transakcji
        Integer employeeID = null;

        return employeeID;
    }

    public void listEmployees() {
        //utwórz sesję
        //utwórz transakcję
        //rozpocznij transakcję
        //wykonaj zapytanie u¿ywaj¹c createQuery
        //wypisz do konsoli wszystkich u¿ytkowników
        //zakoñcz transakcję
    }

    public void updateEmployee(Integer EmployeeID, int salary) {
        //utwórz sesję
        //utwórz transakcję
        //rozpocznij transakcję
        //pobierz z sesji u¿ytkownika po podanym id
        //ustaw u¿ytkownikowi now¹ wartoœæ wynagrodzenia
        //zrób commit transakcji
    }

    public void deleteEmployee(Integer EmployeeID) {
        //utwórz sesję
        //utwórz transakcję
        //rozpocznij transakcję
        //pobierz z sesji u¿ytkownika po podanym id
        //usuñ u¿ytkownika
        //zrób commit transakcji
    }
}
