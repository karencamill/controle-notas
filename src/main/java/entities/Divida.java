package entities;

import entities.enums.StatusDivida;

public class Divida {

    private Cliente cliente;
    private String descricao;
    private double valor;
    private String data;
    private StatusDivida status;


    public Divida() {
    }

    public Divida(Cliente cliente, String descricao, double valor, String data) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.status = StatusDivida.PENDENTE;
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

    public StatusDivida getStatus() {
        return status;
    }

    public void setStatus(StatusDivida status) {
        this.status = status;
    }
}
