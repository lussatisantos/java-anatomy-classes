package edu.lussatisantos.segundasemana;

public class boletimEstudantil {
        public static void main (String [] args){
            int mediaFinal = 5;
            
            if(mediaFinal < 6){
                System.out.println("Reprovado!");
            } else if (mediaFinal == 6){
                System.out.println("Recurso!");
            } else {
                System.out.println("Aprovado!");
            }
    }
}
