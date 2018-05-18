package ClassesProfessor;

import Interfaces.TipoEntregaInterface;
import Strategy.Context;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private TipoEntregaInterface tipoEntrega;

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public int getQuantidadeItens(){
        return itens.size();
    }
    
    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public TipoEntregaInterface getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntregaInterface tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    
    public double getValorEntrega(){
        Context context = new Context(tipoEntrega);
        return context.executeTipoEntregaStrategy(this);
    }
    public double getValorTotal(){
        return getValorEntrega() + getValorPedido();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }
    
    public double calculaPesoTotal(){
        double pesoTotal = 0.0;
        for (ItemPedido iten : itens) {
            pesoTotal += (iten.getQuantidade() * iten.getProduto().getPeso());
        }
        return pesoTotal;
    }
    

}