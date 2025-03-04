package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Complexe implements IOperation, IAffichage {
	    private double re;
	    private double im;
		public Complexe(double re, double im) {
			super();
			this.re = re;
			this.im = im;
		}
		@Override
		public String affiche() {
			// TODO Auto-generated method stub
			 return re + "+" + im + "i";
		}
		@Override
		public Object plus(Object obj) {
			// TODO Auto-generated method stub
			 if (obj instanceof Complexe) {
		            Complexe c = (Complexe) obj;
		            return new Complexe(this.re + c.re, this.im + c.im);
		        }
		        return null;
		    }
		@Override
		public Object moins(Object obj) {
			// TODO Auto-generated method stub
			 if (obj instanceof Complexe) {
		            Complexe c = (Complexe) obj;
		            return new Complexe(this.re - c.re, this.im - c.im);
		        }
		        return null;
		    }

	    

	  


}
