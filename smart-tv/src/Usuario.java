public class Usuario {

    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.err.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();
        smartTv.ligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.mudarCanal(5);
        smartTv.mudarCanal(12);

        smartTv.desligar();

    }
}
