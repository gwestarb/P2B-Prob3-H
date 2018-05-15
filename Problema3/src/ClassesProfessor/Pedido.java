package ClassesProfessor;

import Enum.TipoEntrega;
import Interfaces.TipoEntregaInterface;
import java.util.ArrayList;
import java.util.Date;

public final class Pedido {
    private static final Pedido Instancia = new  Pedido();
    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private Double pesoTotal;
    private TipoEntrega tipoEntrega;
    private Double ValorTotal;

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
    
    private Pedido() {
        this.itens = new ArrayList<>();
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Double getPesoTotal() {
        return pesoTotal;
    }
    
    
    public static Pedido getInstancia(){
        return Instancia;
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
    public void calculaPesoTotal(){
        pesoTotal = 0.0;
        for (ItemPedido iten : itens) {
            pesoTotal += (iten.getQuantidade() * iten.getProduto().getPeso());
        }
    }
    

}
