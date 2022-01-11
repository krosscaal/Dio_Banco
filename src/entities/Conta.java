package entities;

public class Conta {

  protected int agencia;
  protected int conta;
  protected int cod_cliente;
  protected double saldo = 0.0;

  public Conta() {
  }

  public Conta(int agencia, int conta, int cod_cliente, double saldo) {
    this.agencia = agencia;
    this.conta = conta;
    this.cod_cliente = cod_cliente;
    this.saldo = saldo;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getConta() {
    return conta;
  }

  public int getCod_cliente() {
    return cod_cliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
