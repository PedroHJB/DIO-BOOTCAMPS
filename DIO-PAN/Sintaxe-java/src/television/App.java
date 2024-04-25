package television;

public class App {
	public static void main(String[] args) {
		
		
		SmartTV smartTV = new SmartTV();
		
		System.out.println("A TV está ligada ? "+ smartTV.ligada);
		System.out.println("Canal: "+ smartTV.canal);
		System.out.println("Volume: " + smartTV.volume);
		
		smartTV.ligar();
		smartTV.aumentarVolume();
		smartTV.mudarCanal(25);
		System.out.println("Novo Status: "+ smartTV.ligada);
		System.out.println("Canal: "+ smartTV.canal);
		System.out.println("Volume: " + smartTV.volume);
	}
}
