package com.sistema;

public class CriarConta implements ContaPf {
    private int numConta;
    private String nomeConta;
    private String senhaConta;
    private String cpfConta;
    private String cnpjConta;
    private float saldoConta;
    public  float valorSaque;
    public float valorDeposito;


    public CriarConta() {
        this.numConta = 001;
        this.nomeConta = "Jubileu";
        this.senhaConta = "apsdw";
        this.cpfConta = "22808508000";
        this.cnpjConta = "";
        this.saldoConta = 100;
        this.valorSaque = 0;
        this.valorDeposito = 0;
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
        System.out.printf("O saldo atual da sua conta é R$ %.2f %n" , this.getSaldoConta());
    }

    @Override
    public void sacarSaldo() {
        System.out.println("Qual valor deseja sacar da sua conta?");
    }

    @Override
    public void transferirSaldo() {
        
    }

    @Override
    public void depositarDinheiro() {
        System.out.println("Qual valor deseja depositar em sua conta?");    
    }

    @Override
    public void sacandoSaldo() {
        if (valorSaque > saldoConta){
            System.out.println("Não é possível realizar o saque, valor acima do saldo disponível");
        }else{
            setSaldoConta(saldoConta - valorSaque);
            System.out.println("Saque efetuado com sucesso!");
            verificarSaldo();
        }
        
    }

    @Override
    public void depositandoDinheiro() {
        if (valorDeposito < 0){
            System.out.println("Não é possível realizar o depósito, valor negativo");
        }else{
            setSaldoConta(saldoConta + valorDeposito);
            System.out.println("Depósito efetuado com sucesso!");
            verificarSaldo();
        }
    }

    @Override
    public void dadosConta() {
        System.out.println("Nome da conta : " + getNomeConta());
        System.out.println("Número da conta : " + getNumConta());
    }

}
