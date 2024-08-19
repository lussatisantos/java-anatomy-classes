package edu.lussatisantos.segundasemana;

public class SistemaSmartTv {
        boolean ligado = false;
        int volume = 1;
        int canal = 1;

        public void ligar() {
            ligado = true;
        }

        public void desligar() {
            ligado = false;
        }

        public void aumentarVolume() {
                volume++;
                System.out.println("Aumentando volume em " + volume);
        }

        public void diminuirVolume() {
                volume--;
                System.out.println("Diminuindo volume em " + volume);
        }

        public void aumentarCanal() {
                canal++;
                System.out.println("Aumentando canal em " + canal);
        }

        public void diminuirCanal() {
                canal--;
                System.out.println("Diminuindo canal em " + canal);
        }

        public void mudarCanal(int novoCanal) {
            System.out.println("Canal anterior: " + canal);
            canal = novoCanal;
            System.out.println("Mudando canal para " + canal);
        }
    }