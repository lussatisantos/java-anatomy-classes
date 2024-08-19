package edu.lussatisantos.firstweek;

public class Apps {
    public static void main(String [] args) {
       // System.out.println("Hello World!");
       //  System.out.print ("Ola Mundo!");

       /* */

        String nome = "Lussati";
        String sobrenome = "Santos";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println("Nome completo: " + nomeCompleto);
    }

    public static String nomeCompleto (String nome, String sobreNome){
        return nome.concat(" ").concat(sobreNome);
    }
}
