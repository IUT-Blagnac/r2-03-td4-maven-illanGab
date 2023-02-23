
public class Main {
	public static void main(String[] args) {
		
		Pile maPile = new Pile(10);
		if (!maPile.est_vide()) System.out.println("NOK");

		maPile.empiler(5);
		if (maPile.est_vide())System.out.println("NOK");

		if (maPile.sommet() != 5)System.out.println("NOK");

		int element = maPile.depiler();
		if (!maPile.est_vide()) System.out.println("NOK");

		if (element != 5) System.out.println("NOK");

		maPile.empilerPlusieursFois(5, 15);

		Pile duplicatePile = maPile.dupliquerPile();
		for (int i = 0; i < 5; i++) {
			
			if (duplicatePile.depiler() != maPile.depiler()) {
				System.out.println("NOK");
			}
			

		}
		maPile.empilerPlusieursFois(5, 18);
		
		maPile.vider();
		
		if (maPile.est_vide()) System.out.println("NOK");

	}
}





















