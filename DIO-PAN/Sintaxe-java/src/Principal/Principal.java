package Principal;

public class Principal {
	public static void main(String[] args) {
		
		String primeiroNome = "Pedro";
		String segundoNome = "Barbosa";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		
		System.out.println(nomeCompleto);
		
	}
	
	
	
		public static String nomeCompleto (String primeiroNome, String segundoNome) {
		
		
		return primeiroNome.concat(" ").concat(segundoNome);
		
		
	}
	
		
		
		

	
}
