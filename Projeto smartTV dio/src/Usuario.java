public class Usuario {
    public static void main(String[] args) throws Exception {
        smartTV smartTV = new smartTV(); // forma para criar uma nova smarttv essa é a forma de criar uma classe
                                         // (orientação a objetos)
        // usuário comandando o objeto smartTV

        System.out.println("TV ligada ? " + smartTV.ligada);
        System.out.println("Canal atual : " + smartTV.canal);
        System.out.println("Volume atual :" + smartTV.volume);

        smartTV.diminuirVolume(); // CHAMA O METODO diminiurVolume DA SMARTTV
        smartTV.aumentarVolume(); // CHAMA O METODO aumentarVolume DA SMARTTV

        smartTV.aumentarCanal(); // CHAMA O METODO aumentarCanal DA SMARTTV
        smartTV.diminuirCanal(); // CHAMA O METODO diminuirCanal DA SMARTTV

        System.out.println("Canal atual -> " + smartTV.canal);

        smartTV.mudarCanal(14); // CHAMA O METODO mudarCanal da SMARTTV no caso manda o canal 14

        System.out.println("Volume atual -> " + smartTV.volume);
        System.out.println("Canal atual -> " + smartTV.canal);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTV.ligada);

    }
}
