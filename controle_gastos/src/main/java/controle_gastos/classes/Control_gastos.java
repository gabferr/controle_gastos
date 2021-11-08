/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_gastos.classes;

/**
 *
 * @author Gabri
 */
public class Control_gastos {

    private int id;
    private String produto;
    private String local_compra;
    private int valor;
    private int Data_compra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getLocal_compra() {
        return local_compra;
    }

    public void setLocal_compra(String local_compra) {
        this.local_compra = local_compra;
    }

    public int getvalor() {
        return valor;
    }

    public void setvalor(int numero) {
        this.valor = numero;
    }

    public int getData_compra() {
        return Data_compra;
    }

    public void setData_compra(int Data_compra) {
        this.Data_compra = Data_compra;
    }

}
