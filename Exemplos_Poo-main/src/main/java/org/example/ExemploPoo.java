package org.example;

public class ExemploPoo {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "BIC";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.modelo = "Faber";
        c2.ponta = 0.7f;
        c2.destampar();
        c2.status();
        c2.rabiscar();

        Escritorio e1 = new Escritorio();
        e1.Area = 60;
        e1.Andar = 10;
        e1.Disponivel();
        e1.status2();
        e1.local();

        Escritorio e2 = new Escritorio();
        e2.Area = 120;
        e2.Andar = 15;
        e2.Disponivel();
        e2.status2();
        e2.local();

        Escritorio e3 = new Escritorio();
        e3.Area = 100;
        e3.Andar = 6;
        e3.Disponivel();
        e3.status2();
        e3.local();
    }
}
