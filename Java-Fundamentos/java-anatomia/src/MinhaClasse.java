public class MinhaClasse {  

    public static void main (String[] args){

        String primeirNome="Pedro";
        String segundoNome="Barbosa";
        
        String nomeCOmpleto = nomeCompleto(primeirNome, segundoNome);
        System.out.println(nomeCOmpleto);
    }

    public static String nomeCompleto (String primeiroNome,String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }


    //   PCM   PSVMSA
    
}
