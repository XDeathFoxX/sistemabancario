package com.sistema;

public class CriarConta implements ContaPf {
    private int numConta;
    private String nomeConta;
    private String senhaConta;
    private String cpfConta;
    private String cnpjConta;
    private float saldoConta;

    public CriarConta() {
        this.numConta = 001;
        this.nomeConta = "Jubileu";
        this.senhaConta = "apsdw";
        this.cpfConta = "22808508000";
        this.cnpjConta = "";
        this.saldoConta = 100;
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
        
    }

    @Override
    public void transferirSaldo() {
        
    }

    @Override
    public void depositarDinheiro() {
        
    }

    


    
}
