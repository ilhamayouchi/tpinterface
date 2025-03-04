package Test;

import ma.projet.bean.Complexe;
import ma.projet.bean.Reel;

public class Testprogramme2 {
	    public static void main(String[] args) {
	       
	        Complexe c1 = new Complexe(4, 3);
	        Complexe c2 = new Complexe(2, 1);

	        Complexe sommeComplexe = (Complexe) c1.plus(c2);
	        Complexe differenceComplexe = (Complexe) c1.moins(c2);

	        System.out.println("Complexe 1 = " + c1.affiche());
	        System.out.println("Complexe 2 = " + c2.affiche());
	        System.out.println("Addition de complexes = " + sommeComplexe.affiche());
	        System.out.println("Soustraction de complexes = " + differenceComplexe.affiche());

	        
	        Reel r1 = new Reel(5);
	        Reel r2 = new Reel(2);

	        Reel sommeReel = (Reel) r1.plus(r2);
	        Reel differenceReel = (Reel) r1.moins(r2);

	        System.out.println("R1 =" + r1.affiche());
	        System.out.println("R2 = " + r2.affiche());
	        System.out.println("Addition de rels= " + sommeReel.affiche());
	        System.out.println("Soustraction de réels= " + differenceReel.affiche());

	        
	        
	        System.out.println("Addition de réel (surcharge R1) = " + r1.plus(4.5));
	        System.out.println("Soustraction de réel (surcharge R1) = " + r1.moins(2.5));
	    }
	}



