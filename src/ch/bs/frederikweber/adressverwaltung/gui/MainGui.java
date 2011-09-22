package ch.bs.frederikweber.adressverwaltung.gui;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @author Frederik Weber
 */
public class MainGui {
    public MainGui() {
        this.printWelcome();
        String result = this.readFromConsole();
        this.analyse(result);
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
        byte[] buffer = new byte[200];
        int length = 0;
        try {
            length = System.in.read(buffer);
        } catch (IOException e) {
            //TODO: Logger hinzufügen
        }
        String input = new String(buffer, Charset.defaultCharset());
        input = input.substring(0, length);
        return input;
    }

    private void analyse(String input) {
        if (input.equals("1")) {

        } else if (input.equals("2")) {

        } else if (input.equals("3")) {

        } else if (input.equals("4")) {

        } else if (input.equals("x")) {
            System.exit(0);
        }
    }


}
