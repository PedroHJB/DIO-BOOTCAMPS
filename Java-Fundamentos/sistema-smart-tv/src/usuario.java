

public class usuario {
    public static void main(String[] args) {
        smartTV smartTV = new smartTV();

        smartTV.ligar();
        smartTV.mudarCanal(13);
        System.out.println("TV ligada ?: " + smartTV.ligada);
        System.out.println("Canal Atual:  " + smartTV.canal);
        System.out.println("volume Atual: " + smartTV.volume);

        




    }
}
