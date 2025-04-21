package com.sistema;

import java.util.Scanner;

public class CriarConta extends App implements ContaPf {
    private int numConta;
    private String nomeConta;
    private String senhaConta;
    private String cpfConta;
    private String cnpjConta;
    private float saldoConta;
    public  float valorSaque;
    public float valorDeposito;
    public int opcao;

    Scanner userinput = new Scanner(System.in);


    public CriarConta() {
        this.numConta = 001;
        this.nomeConta = "Jubileu";
        this.senhaConta = "apsdw";
        this.cpfConta = "22808508000";
        this.cnpjConta = "";
        this.saldoConta = 100;
        this.valorSaque = 0;
        this.valorDeposito = 0;
        this.opcao = 0;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public float getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(float valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public float getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(float valorSaque) {
        this.valorSaque = valorSaque;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getSenhaConta() {
        return senhaConta;
    }

    public void setSenhaConta(String senhaConta) {
        this.senhaConta = senhaConta;
    }

    public String getCpfConta() {
        return cpfConta;
    }

    public void setCpfConta(String cpfConta) {
        this.cpfConta = cpfConta;
    }

    public String getCnpjConta() {
        return cnpjConta;
    }

    public void setCnpjConta(String cnpjConta) {
        this.cnpjConta = cnpjConta;
    }

    @Override
    public void verificarSaldo() {
        System.out.println("");
        System.out.printf("O saldo atual da sua conta é R$ %.2f %n" , this.getSaldoConta());
        System.out.println("");

    }

    @Override
    public void sacarSaldo() {
        System.out.println("");
        System.out.println("Qual valor deseja sacar da sua conta?");
        System.out.println("");
    }

    @Override
    public void transferirSaldo() {
        
    }

    @Override
    public void depositarDinheiro() {
        System.out.println("");
        System.out.println("Qual valor deseja depositar em sua conta?");
        System.out.println("");
    }

    @Override
    public void sacandoSaldo() {
        if (valorSaque > saldoConta){
            System.out.println("");
            System.out.println("Não é possível realizar o saque, valor acima do saldo disponível");
        }else{
            setSaldoConta(saldoConta - valorSaque);
            System.out.println("");
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("");
            verificarSaldo();
        }
        
    }

    @Override
    public void depositandoDinheiro() {
        if(valorDeposito < 0){
            System.out.println("");
            System.out.println("Não é possível realizar o depósito, valor negativo");
            System.out.println("");
        }else{
            setSaldoConta(saldoConta + valorDeposito);
            System.out.println("");
            System.out.println("Depósito efetuado com sucesso!");
            System.out.println("");
            verificarSaldo();
        }
    }

    @Override
    public void dadosConta() {
        System.out.println("");
        System.out.println("Nome da conta :" + getNomeConta());
        System.out.println("Número da conta : " + getNumConta());
        System.out.println("");
    }
 
    public void menu() {
        System.out.println("Digite a opção desejada:");
        System.out.println("");
        System.out.println("1 - Dados da Conta ");
        System.out.println("2 - Sacar Saldo");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Verificar Saldo");
        this.opcao = userinput.nextInt();
        opcoesmenu();
        }

    public void reset() {
        System.out.println("");
        System.out.println("Deseja sair do sistema ou retornar ao menu?");
        System.out.println("");
        System.out.println("1 - Menu");
        System.out.println("2 - Sair");
        System.out.println("");
        this.opcao = userinput.nextInt();
        switch(opcao){
            case 1:
                menu();
                break;

            case 2:
                break;

            default:
                System.out.println("Opção inválida, tente novamente");
                reset();
                break;
        }
    }
    
    public void opcoesmenu(){
        switch (opcao) {
            case 1:
                dadosConta();
                reset();
                break;
            case 2:
                sacarSaldo();
                this.valorSaque = userinput.nextInt();
                sacandoSaldo();
                reset();
                break;
            case 3:
                depositarDinheiro();
                this.valorDeposito = userinput.nextInt();
                depositandoDinheiro();
                reset();
                break;
            case 4:
                verificarSaldo();
                reset();
                break;
            }
}}
