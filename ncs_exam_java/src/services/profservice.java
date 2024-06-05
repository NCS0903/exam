package services;

import java.util.List;

import repository.profrepository;

public class profservice {
    private profrepository ptofrepository;
   private modulerepository modulerepository;
private profrepository profrepository;

    public profservice(profrepository profrepository) {
       this.profrepository = profrepository;
     }

     

    public profservice(profrepository profrepository, modulerepository modulerepository) {
        this.profrepository = profrepository;
        this.modulerepository = modulerepository;
    }

    
    
}
