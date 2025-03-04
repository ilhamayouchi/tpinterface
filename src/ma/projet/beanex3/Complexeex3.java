package ma.projet.beanex3;

import ma.projet.abst.Affichage;
import ma.projet.inter.IOperation;

public class Complexeex3 extends Affichage implements IOperation {

	    private double re;
	    private double im;

	    public Complexeex3(double re, double im) {
	        this.re = re;
	        this.im = im;
	    }

	    @Override
	    public Object plus(Object obj) {
	        if (obj instanceof Complexeex3) {
	            Complexeex3 c = (Complexeex3) obj;
	            return new Complexeex3(this.re + c.re, this.im + c.im);
	        }
	        return null;
	    }

	    @Override
	    public Object moins(Object obj) {
	        if (obj instanceof Complexeex3) {
	            Complexeex3 c = (Complexeex3) obj;
	            return new Complexeex3(this.re - c.re, this.im - c.im);
	        }
			return null;
	      
	    }

	    @Override
	    public String affiche() {
	        return re + " + " + im + "i";
	    }
	}



