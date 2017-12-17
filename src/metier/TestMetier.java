package metier;

import java.util.Iterator;

public class TestMetier {

	public static void main(String[] args) {
		Operation op = new Operation();
		//Produit p = new Produit();
		op.add(new Produit(new Long(1), "HP 250", "PC neuf et performant", 3300, 1));
		op.add(new Produit(new Long(2), "ASUS R500A", "PC neuf et tr�s performant", 6000, 1));
		op.add(new Produit(new Long(3), "Nokia 6700", "Un tr�s bon t�l�phone portable", 600, 0));
		op.add(new Produit(new Long(4), "Stallion", "Tendeuse neuve", 100, 1));
		op.add(new Produit(new Long(5), "Sharp L56", "T�l�vision neuve", 2400, 1));
		
		Iterator<Produit> prds = op.getProduits().iterator();
		while(prds.hasNext()){
			Produit pr = prds.next();
			pr.afficherProduit();
		}
	}

}
