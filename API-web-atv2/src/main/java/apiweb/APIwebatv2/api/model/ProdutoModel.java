package apiweb.APIwebatv2.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "produto")
public class ProdutoModel {
    @Id
    public Integer codigoproduto;

    @Column(nullable = false, length = 140)
    public String nomeproduto;
    @Column(nullable = false, length = 10)
    public String quantidadeproduto;
    @Column(nullable = false, length = 140)
    public  String descricaoproduto;
    @Column(nullable = false, length = 10)
    public  double pesoproduto;
    @Column(nullable = false, length = 10)
    public  double valorproduto;

    public Integer getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(Integer codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getQuantidadeproduto() {
        return quantidadeproduto;
    }

    public void setQuantidadeproduto(String quantidadeproduto) {
        this.quantidadeproduto = quantidadeproduto;
    }

    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    public void setDescricaoproduto(String descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    public double getPesoproduto() {
        return pesoproduto;
    }

    public void setPesoproduto(double pesoproduto) {
        this.pesoproduto = pesoproduto;
    }

    public double getValorproduto() {
        return valorproduto;
    }

    public void setValorproduto(double valorproduto) {
        this.valorproduto = valorproduto;
    }
}
