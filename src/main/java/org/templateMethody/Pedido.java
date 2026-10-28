package org.templateMethody;

public abstract class Pedido {

    private int codigo;
    protected String nomeCliente;
    private float valorProdutos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(float valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    public abstract float calcularFrete();

    public String getTipo() {
        return "Pedido";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nomeCliente='" + this.nomeCliente + '\'' +
                ", valorTotal=" + (this.valorProdutos + this.calcularFrete()) +
                '}';
    }
}
