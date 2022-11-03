package tableau;

import java.util.Random;

public class Tableau {
	int tab[];

	public Tableau(int n) {
		tab= new int[n];

	}
	
	
	
void remplir() {
	 Random rand=new Random();
	 for(int i=0 ; i<tab.length ; i++) {   
	 tab[i]	=rand.nextInt(100);		 
	 }
}


void affiche() {
	for(int i=0;i<tab.length;i++) {
		System.out.println(tab[i]);
	}
}


int somme_tableau(){
	int s=0;
	int i;
		for(i=0;i<tab.length;i++) {
			s+=tab[i];
	}
		return s;
	}

int taille_tableau(){
	int t=0;
	int i;
		for(i=0;i<tab.length;i++) {
			t+=tab[i];
	}
		return t;

	}
	
float moyenne(int s, int t) {
	
	  return s/t;
}


int maximum() {
int max=0;
for(int i=0; i<tab.length;i++) {
	if(tab[i]>max){
		max=tab[i];
}	
}
return max;

}


int minimum() {
int min=100;
for(int i=0; i<tab.length;i++) {
	if(tab[i]<min){
		min=tab[i];
}	
}
return min;
}


}