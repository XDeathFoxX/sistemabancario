package com.sistema;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        CriarConta c = new CriarConta();
        Scanner userinput = new Scanner(System.in);
        c.verificarSaldo();
        c.depositarDinheiro();
        c.setValorDeposito(userinput.nextFloat());
        c.depositandoDinheiro();
        c.dadosConta();
        userinput.close();
    }
}
