package tableau;

public class main {

	public static void main(String[] args) {
		Tableau tab1= new Tableau(10);
		tab1.remplir();
		tab1.affiche();
		System.out.println(tab1.somme_tableau());
		System.out.println(tab1.taille_tableau());
		System.out.println("moyenne du tablaeu = "+tab1.moyenne(tab1.somme_tableau(),tab1.taille_tableau()));
		System.out.println("le plus grand valeur dans le tableau est:"+tab1.maximum());
		System.out.println("le plus petit valeur dans le tableau est:"+tab1.minimum());
		
	}

}
