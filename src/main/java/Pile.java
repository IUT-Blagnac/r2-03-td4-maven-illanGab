/* Classe permettant d'utliser une Pile d'entiers 
 *
 * @author Illan GABARRA 1A
 */
public class Pile {

	private int[] laPile;
	private int indiceSommet;

	/*
	 * Conctructeur de la Classe Pile, Permet de créer une pile vide d'entier de taille pfTaille
	 * 
	 * @param IN pfTaille : Taille de la pile à créer
	 */
	public Pile(int pfTaille) {
		laPile = new int[pfTaille];
		indiceSommet = -1;
	}
	/*
	 * Permet de savoir si la pile est vide
	 * 
	 * @return true si vide false sinon
	 * 
	 * @see Pile#est_Pleine()
	 */
	public boolean est_vide() {
		if (indiceSommet == -1) {
			return true;
			}
		return false;
	}
	/*
	 * Permet de savoir si la pile est pleine
	 * 
	 * @return true si pleine false sinon
	 * 
	 * @see Pile#est_vide()
	 */
	public boolean est_Pleine() {
		if (laPile.length > indiceSommet +2 ){
			return false;
			}
		return true;
	}

	/*
	 * Permet d'enpiler un entier si la pile n'est pas pleine
	 * 
	 * @param IN pfEntier : Entier à empiler
	 * 
	 * @see Pile#depiler()
	 * @see Pile#est_Pleine()
	 * 
	 * @throws IndexOutOfBoundsException si la pile est pleine
	 */
	public void empiler(int pfEntier) throws IndexOutOfBoundsException{
		if (! est_Pleine() ) {

			laPile[indiceSommet+1] = pfEntier;
			indiceSommet++;
		}
		else {
			throw new IndexOutOfBoundsException("La pile est pleine");
		}
	}
	/*
	 * Permet de dépiler un entier si la pile n'est pas vide
	 * 
	 * @return Entier dépiler
	 * 
	 * @see Pile#empiler()
	 * @see Pile#est_vide()
	 * 
	 * @throws IndexOutOfBoundsException si la pile est vide
	 */
	public int depiler() throws IndexOutOfBoundsException{
		if (!est_vide() ) {
			indiceSommet--;
			return laPile[indiceSommet+1];
		}
		throw new IndexOutOfBoundsException("La pile est vide");

	}
	/* Permet de récupérer l'entier au sommet de la pile si la pile n'est pas vide
	 * 
	 * @return Entier correspondant au dernier élément empiler
	 * 
	 * @see Pile#est_vide()
	 * @throws IndexOutOfBoundsException si la pile est vide
	 */
	public int sommet () throws IndexOutOfBoundsException{
		if (!est_vide() ) {
			return laPile[indiceSommet];
		}
		throw new IndexOutOfBoundsException("La pile est vide");
	}

	/* Permet de vider entièrement la pile
	 * 
	 */
	public void vider () {
		for (int i = 0 ; i <= indiceSommet  ; i++ ) {
			depiler();
		}
	}
	/* Permet d'empiler pfNbFois fois le même pfElement
	 * 
	 * @param IN pfNbFois : Nombre d'éléments pfElement à empiler
	 * @param IN pfElement : Élément à empiler
	 * 
	 * @throws IndexOutOfBoundsException si la pile est pleine
	 * 
	 * @see Pile#empiler()
	 */
	public void empilerPlusieursFois(int pfNbFois , int pfElement) throws IndexOutOfBoundsException{
		for (int i = 0 ; i < pfNbFois | est_vide() ; i++) {
			this.empiler(pfElement);
		}
	}
	
	/*
	 * Permet de dupliquer la pile courante en créant une nouvelle pile et en copiant les
	 * éléments de la pile courante dans la nouvelle pile
	 * 
	 * @return Pile pile copiée
	 */
	public Pile dupliquerPile() {
		
		Pile duplicatePile = new Pile(this.laPile.length);
		for (int i = 0 ; i <= indiceSommet; i++) {
			duplicatePile.empiler(this.laPile[i]);
		}
		return duplicatePile;
		
	}
}
