package ch.bs.frederikweber.adressverwaltung.persistence;

import ch.bs.frederikweber.adressverwaltung.tools.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frederik Weber
 */
public class Local implements DataManager {
    private List<Person> dataList;

    protected Local() {
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
        for(Person actual:persons){
            this.save(actual);
        }
    }

    public void save(Person person) {
        person.setId(this.dataList.size());
        this.dataList.add(person);
    }

    public void delete(Person person){
        this.dataList.remove(person);
    }
}
