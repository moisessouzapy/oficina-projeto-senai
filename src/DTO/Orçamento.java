/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Orçamento {
    
    private String CpfCliente;
    private String CpfMecanico;
    private Double valor;
    private String serviços;

    /*public Orçamento(String CpfCliente, String CpfMecanico, Double valor, String serviços) {
        this.CpfCliente = CpfCliente;
        this.CpfMecanico = CpfMecanico;
        this.valor = valor;
        this.serviços = serviços;
    }*/

    public String getCpfCliente() {
        return CpfCliente;
    }

    public void setCpfCliente(String CpfCliente) {
        this.CpfCliente = CpfCliente;
    }

    public String getCpfMecanico() {
        return CpfMecanico;
    }

    public void setCpfMecanico(String CpfMecanico) {
        this.CpfMecanico = CpfMecanico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getServiços() {
        return serviços;
    }

    public void setServiços(String serviços) {
        this.serviços = serviços;
    }
    
    
    
    
    
}
