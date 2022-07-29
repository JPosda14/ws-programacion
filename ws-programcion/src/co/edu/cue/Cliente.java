package co.edu.cue;

import javax.swing.plaf.synth.SynthToolTipUI;

public class Cliente {
    private String Document;
    private String TypeDocm;
    private String Name;
    private String Gender;
    private String City;

    public Cliente() {
    }

    public Cliente(String document, String typeDocm, String name, String gender, String city) {
        Document = document;
        TypeDocm = typeDocm;
        Name = name;
        Gender = gender;
        City = city;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public String getTypeDocm() {
        return TypeDocm;
    }

    public void setTypeDocm(String typeDocm) {
        TypeDocm = typeDocm;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
