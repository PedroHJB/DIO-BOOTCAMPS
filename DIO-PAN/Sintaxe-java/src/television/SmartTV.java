package television;

public class SmartTV {
	
	boolean ligada = false ;
	int canal = 1;
	int volume = 13;
	
	public void ligar () {
		ligada = true;
	}
	
	public void deligar () {
		ligada = false;
	}
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	public void mudarCanal(int canalPretendido) {
		
		canal = canalPretendido;
		
	}
	
}
