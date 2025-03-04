package Test;
import java.util.Date;
import ma.projet.bean.*;
import java.text.SimpleDateFormat;

public class Testprogramme {
	public static void main(String[] args) {
		    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		   
		    Profil profilDirecteur = new Profil(1, "D01", "directeur");
			Date dateNaissance = new Date(70, 5, 2); 

		    
		    Personne directeur = new Personne(1, "Ayouchi", "ilhame", dateNaissance, 20000, profilDirecteur);
		    directeur.affiche();
		    System.out.println("Salaire après augmentation : " + directeur.calculerSalaire() + "dh");
		    System.out.println("\n");
		    Profil profilEmploye = new Profil(2, "E01", "employé");
		    Date dateNaissance2 = new Date(85, 7, 15); 
		    Personne employe = new Personne(2, "Thami", "mohammed", dateNaissance2, 10000, profilEmploye);
		    employe.affiche();
		    System.out.println("Salaire après augmentation : " + employe.calculerSalaire() + "dh");
		}

	}



