package edu.lussatisantos.segundasemana;

public class SmartTv {
    public static void main(String[] args) {
        SistemaSmartTv smartTv = new SistemaSmartTv();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();

        System.out.println("Ligado: " + smartTv.ligado);
        System.out.println("Canal actual: " + smartTv.canal);
        System.out.println("Volume actual: " + smartTv.volume);
    }
}


