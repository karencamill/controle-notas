package entities;

public class Divida {

    private Cliente cliente;
    private String descricao;
    private double valor;
    private String data;
    private boolean pago;

    public Divida() {
    }

    public Divida(Cliente cliente, String descricao, double valor, String data) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.pago = false;
    }

    public Divida(Cliente cliente, String descricao, double valor, String data, boolean pago) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.pago = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
