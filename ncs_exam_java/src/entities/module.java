package entities;

import java.util.ArrayList;

public class module {
    private int id;
    private String nom;

    ArrayList<module> moduleList=new ArrayList<>();

    public ArrayList<module> getModuleList() {
        return moduleList;
    }
    public void setModuleList(ArrayList<module> moduleList) {
        this.moduleList = moduleList;
    } 

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
