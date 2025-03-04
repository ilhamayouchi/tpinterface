package Test;

import ma.projet.beanex3.Complexeex3;
import ma.projet.beanex3.Reelex3;

public class Testex3 {
	    public static void main(String[] args) {
	        
	        
	        Complexeex3 c1 = new Complexeex3(3, 2);
	        Complexeex3 c2 = new Complexeex3(1, 1);

	        Complexeex3 somComplexe = (Complexeex3) c1.plus(c2);
	        Complexeex3 difComplexe = (Complexeex3) c1.moins(c2);

	        System.out.println("Complexe 1 = " + c1.affiche());
	        System.out.println("Complexe 2 = " + c2.affiche());
	        System.out.println("Addition de complexes = " + somComplexe.affiche());
	        System.out.println("Soustraction de complexes =" + difComplexe.affiche());

	        
	        Reelex3 r1 = new Reelex3(10);
	        Reelex3 r2 = new Reelex3(4);

	        Reelex3 somReel = (Reelex3) r1.plus(r2);
	        Reelex3 difReel = (Reelex3) r1.moins(r2);

	        System.out.println("R1= " + r1.affiche());
	        System.out.println("R2= " + r2.affiche());
	        System.out.println("Addition de réels =" + somReel.affiche());
	        System.out.println("Soustraction de réels = " + difReel.affiche());
	    }
	}



