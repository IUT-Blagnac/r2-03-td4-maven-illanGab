
public class Pile {

	private int[] laPile;
	private int indiceSommet;

	public Pile(int pfTaille) {
		laPile = new int[pfTaille];
		indiceSommet = -1;
	}

	public boolean est_vide() {
		if (indiceSommet == -1) {
			return true;
			}
		return false;
	}

	public void empiler(int pfEntier) throws IndexOutOfBoundsException{
		if (laPile.length > indiceSommet +2 ) {

			laPile[indiceSommet+1] = pfEntier;
			indiceSommet++;
		}
		else {
			throw new IndexOutOfBoundsException("La pile est pleine");
		}
	}

	public int depiler() throws IndexOutOfBoundsException{
		if (!est_vide() ) {
			indiceSommet--;
			return laPile[indiceSommet+1];
		}
		throw new IndexOutOfBoundsException("La pile est vide");

	}

	public int sommet () {
		return laPile[indiceSommet];
	}

	public void vider () {
		for (int i = 0 ; i <= indiceSommet  ; i++ ) {
			depiler();
		}
	}
	public void empilerPlusieursFois(int pfNbFois , int pfElement) {
		for (int i = 0 ; i < pfNbFois ; i++) {
			this.empiler(pfElement);
		}
	}
	
	public Pile dupliquerPile() {
		
		Pile duplicatePile = new Pile(this.laPile.length);
		for (int i = 0 ; i <= indiceSommet; i++) {
			duplicatePile.empiler(this.laPile[i]);
		}
		return duplicatePile;
		
	}
}
