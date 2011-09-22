package ch.bs.frederikweber.adressverwaltung.persistence;

import ch.bs.frederikweber.adressverwaltung.data.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frederik Weber
 */
public class Local implements DataManager {
    private List<Person> dataList;

    public Local() {
        this.dataList = new ArrayList<Person>();
    }

    public List<Person> loadAll() {
        return this.dataList;
    }

    public Person load(long id) {
        for (Person actual : this.dataList) {
            if (actual.getId() == id) {
                return actual;
            }
        }
        return null;
    }

    public void saveAll(List<Person> persons) {
        this.dataList.addAll(persons);
    }

    public void save(Person person) {
        this.dataList.add(person);
    }
}
