package ch.bs.frederikweber.adressverwaltung.gui;

import ch.bs.frederikweber.adressverwaltung.persistence.DataManager;
import ch.bs.frederikweber.adressverwaltung.persistence.DataManagerFactory;
import ch.bs.frederikweber.adressverwaltung.tools.Person;
import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @author Frederik Weber
 */
public class MainGui {
    private DataManager dataManager;

    public MainGui() {
        this.dataManager = DataManagerFactory.getInstance().getDataManager(DataManagerFactory.DataManagerType.LOCAL);
        while (true) {
            this.printWelcome();
            String result = this.readFromConsole();
            this.analyse(result);
        }
    }

    private void printWelcome() {
        System.out.println("Adressverwaltung");
        System.out.println("---------------------------------");
        System.out.println("1 - Alle Adressen anzeigen");
        System.out.println("2 - Eine Adresse anzeigen");
        System.out.println("3 - Neue Adresse");
        System.out.println("4 - Adresse löschen");
        System.out.println();
        System.out.println("x - Programm beenden");
    }

    private String readFromConsole() {
        InputStream inputStream = new BufferedInputStream(System.in);
        byte[] inputBuffer = new byte[500];
        int length = 0;
        try {
            length = inputStream.read(inputBuffer);
            length--;
        } catch (IOException e) {
            //TODO: Logger hinzufügen
            e.printStackTrace();
        }
        String input = new String(inputBuffer, Charset.defaultCharset());
        input = input.substring(0, length);
        return input;
    }

    private void analyse(String input) {
        if (input.equals("1")) {
            for (Person actual : this.dataManager.loadAll()) {
                System.out.println(actual.toString());
            }
        } else if (input.equals("2")) {
            System.out.println("ID:");
            String id = this.readFromConsole();
            System.out.println(this.dataManager.load(new Long(id)));
        } else if (input.equals("3")) {
            System.out.println("Name:");
            String name = this.readFromConsole();
            System.out.println("Vorname:");
            String vorname = this.readFromConsole();
            System.out.println("Strasse:");
            String strasse = this.readFromConsole();
            System.out.println("Ort:");
            String ort = this.readFromConsole();
            System.out.println("PLZ:");
            String plz = this.readFromConsole();
            this.dataManager.save(new Person(name, vorname, strasse, plz, ort));
        } else if (input.equals("4")) {
            System.out.println("ID:");
            String id = this.readFromConsole();
            this.dataManager.delete(this.dataManager.load(new Long(id)));
        } else if (input.equals("x")) {
            System.exit(0);
        }
    }


}
