package ch.bs.frederikweber.adressverwaltung.persistence;

import ch.bs.frederikweber.adressverwaltung.data.Person;

import java.util.List;

/**
 * @author Frederik Weber
 */
public interface DataManager {
    public List<Person> loadAll();
    public Person load(long id);
    public void saveAll(List<Person> persons);
    public void save(Person person);
}
