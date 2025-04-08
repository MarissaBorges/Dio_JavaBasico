public class SmartTv {
    boolean ligada = false;
    int canal =1;
    int volume = 25;

    public void ligar(){
        System.out.println("Ligando a Tv");
        ligada = true;
    }
    public void desligar(){
        System.err.println("Desligando a Tv");
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++; //volume = volume +1
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume --; //volume = volume -1
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novocanal){
        canal = novocanal;
        System.err.println("Novo canal definido para: " + canal);
    }
    public void aumentarCanal(){
        canal ++;
        System.out.println("Aumentando o canal para: " + canal);
    }
    public void diminuirCanal(){
        canal --;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    
}
