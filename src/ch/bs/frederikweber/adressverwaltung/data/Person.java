package ch.bs.frederikweber.adressverwaltung.data;

/**
 * @author Frederik Weber
 */
public class Person {
    private long id;
    private String name;
    private String vorname;
    private String strasse;
    private String plz;
    private String ort;

    public Person() {
        this.id = (long) Math.random();
    }

    public Person(String name, String vorname, String strasse, String plz, String ort) {
        this.id = (long) Math.random();
        this.name = name;
        this.vorname = vorname;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return this.plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return this.ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
