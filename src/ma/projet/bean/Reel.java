package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Reel implements IOperation, IAffichage {
	    private double x;

	    public Reel(double x) {
	        this.setX(x);
	    }
        
	    public double getX() {
			return x;
		}



		public void setX(double x) {
			this.x = x;
		}
	    
		@Override
		public String affiche() {
			// TODO Auto-generated method stub
			return String.valueOf(x);
		}

		@Override
		public Object plus(Object obj) {
			// TODO Auto-generated method stub
			if (obj instanceof Reel) {
	            Reel r = (Reel) obj;
	            return new Reel(this.x + r.x);
	        }
	        return null;
		}

		@Override
		public Object moins(Object obj) {
			// TODO Auto-generated method stub
			if (obj instanceof Reel) {
	            Reel r = (Reel) obj;
	            return new Reel(this.x - r.x);
	        }
	        return null;
		}
		public double plus(double x) {
	        return this.x + x;
	    }

	    public double moins(double x) {
	        return this.x-(x);

	    }

		
	    

	
}
