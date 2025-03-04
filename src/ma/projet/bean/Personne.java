package ma.projet.bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import ma.projet.inter.IPersonne;

public class Personne  implements IPersonne {
	    private int id;
	    private String nom;
	    private String prenom;
	    private Date dateNais;
	    private double salaire;
	    private Profil profil;
	    private static int comp=0;
		public Personne(int id, String nom, String prenom, Date dateNais, double salaire, Profil profil) {
			
			this.id = comp++;
			this.nom = nom;
			this.prenom = prenom;
			this.dateNais = dateNais;
			this.salaire = salaire;
			this.profil = profil;
		}
		 public void affiche() {
			 SimpleDateFormat formatD = new SimpleDateFormat("dd MMM yyyy");
			    String dNformat = formatD.format(dateNais);
			    String Affichage = "je suis " + profil.getLibelle() + " " + nom.toUpperCase() + " " + prenom +
	                     "né le " + dNformat + ". mon salaire est de " + salaire + " dh.";
			    System.out.println(Affichage);
		 }
	    
		public double calculerSalaire() {
			double augmentation = profil.getLibelle().equalsIgnoreCase("directeur") ? 0.2 : 0.1;
		    return salaire * (1.0 + augmentation);
			
		}
        
}
