package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class cours {
    private int id;
    private LocalDate date; 
    private LocalTime heureDB; 
    private LocalTime heureFIN;

    ArrayList<cours> coursList=new ArrayList<>();

    public ArrayList<cours> getCoursList() {
        return coursList;
    }
    public void setCoursList(ArrayList<cours> coursList) {
        this.coursList = coursList;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getHeureDB() {
        return heureDB;
    }
    public void setHeureDB(LocalTime heureDB) {
        this.heureDB = heureDB;
    }
    public LocalTime getHeureFIN() {
        return heureFIN;
    }
    public void setHeureFIN(LocalTime heureFIN) {
        this.heureFIN = heureFIN;
    } 
    
    
}
