package services;

import java.util.List;

import entities.cours;
import repository.coursrepository;
import repository.modulerepository;

public class courservice {
    private coursrepository coursrepository;
    public courservice(coursrepository coursrepository) {
       this.coursrepository = coursrepository;
     }

     

    public courservice(coursrepository coursrepository, modulerepository modulerepository) {
        this.coursrepository = coursrepository;
    }

    public void ajoutercour(cours cours){
        coursrepository.insert(cours);
    }

    public List<cours> listercours(){
        return coursrepository.selectAll();
    }
}
