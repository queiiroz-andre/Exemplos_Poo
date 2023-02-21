package org.example;

public class Escritorio {

    int Area;
    int Andar;
    boolean Alugado;

    void status2(){
        System.out.println("Área: " + this.Area);
        System.out.println("Qual andar? " + this.Andar);
        System.out.println("Está vago? " + this.Alugado);
    }

    void local(){
        if(this.Alugado == false){
            System.out.println("ERRO! o Escritório está alugado! ");
        }else {
            System.out.println("O escritório está disponível ");
        }
    }
    void Disponivel(){
        this.Alugado = true;
    }
    void Indisponível(){
        this.Alugado = false;
    }

}
