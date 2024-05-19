public class smartTV {
    boolean ligada = false; // VARIAVEL STATUS
    int canal = 1; // VARIAVEL CANAL
    int volume = 25; // VARIAVEL VOLUME

    // ### esse é o objeto

    public int aumentarVolume() { // metodo para aumentar o volume
        volume++; // volume = volume + 1
        System.out.println("Aumentando o volume para :" + volume);
        return volume;
    }

    public int diminuirVolume() { // metodo para diminuir o volume
        volume--;
        System.out.println("Diminuindo o volume para :" + volume);
        return volume;
    }

    public int diminuirCanal() { // metodo para diminuir o canal
        canal--;
        System.out.println("Diminuindo o canal para :" + canal);
        return canal;
    }

    public int mudarCanal(int novoCanal) { // metodo para selecionar o canal
        canal = novoCanal;
        return canal;
    }

    public int aumentarCanal() { // metodo para aumentar o canal
        canal++; // volume = volume + 1
        System.out.println("Aumentando o canal para :" + canal);
        return canal;
    }

    public void ligar() { // metodo para ligar a tv
        ligada = true;
    }

    public void desligar() { // metodo para desligar a tv
        ligada = false;
    }
}
