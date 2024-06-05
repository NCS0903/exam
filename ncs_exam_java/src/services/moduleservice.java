package services;

import java.util.List;

import entities.module;

public class moduleservice {
    private Imodule modulerepository;
    
    public moduleservice(Imodule modulerepository) {
       this.modulerepository = modulerepository;
    }
    public List<module> listermodule(){
      return modulerepository.selectAll();
   }
   public module listermodule(String nom){
    return modulerepository.selectByNom(nom);
   }
   public void ajoutermodule(module module){
    modulerepository.insert(module);
   }
}
