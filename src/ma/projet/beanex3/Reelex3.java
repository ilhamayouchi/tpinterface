package ma.projet.beanex3;
import ma.projet.abst.Affichage;
import ma.projet.inter.IOperation;
public class Reelex3 extends Affichage implements IOperation {
		    private double x;

		    public Reelex3(double x) {
		        this.x = x;
		    }

		    @Override
		    public Object plus(Object obj) {
		        if (obj instanceof Reelex3) {
		            Reelex3 r = (Reelex3) obj;
		            return new Reelex3(this.x + r.x);
		        }
		        return null;
		    }

		    @Override
		    public Object moins(Object obj) {
		        if (obj instanceof Reelex3) {
		            Reelex3 r = (Reelex3) obj;
		            return new Reelex3(this.x - r.x);
		        }
		        return null;
		    }

		    @Override
		    public String affiche() {
		        return String.valueOf(x);
		    }
		





}
