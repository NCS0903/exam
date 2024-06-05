import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1-Ajouter un module");
            System.out.println("2-Lister les modules"); 
            System.out.println("3-Creer un Cours");
            System.out.println("4-Lister Toutes les Cours"); 
            System.out.println("5-Lister les cours d'un module"); 
            System.out.println("5-Lister les cours d'un professeur");
            System.out.println("10-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
        }
    }
}
