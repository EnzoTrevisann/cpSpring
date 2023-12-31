package br.com.fiap.cp.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "Pedido")
@Table(name = "pedido")
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;


  private String nomeProduto;
  private BigDecimal valorNegociado;
  private LocalDate dataDaEntrega;
  private String urlProduto;
  private String urlImagem;
  private String descricao;
  private String componentes;

  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public BigDecimal getValorNegociado() {
    return valorNegociado;
  }

  public void setValorNegociado(BigDecimal valorNegociado) {
    this.valorNegociado = valorNegociado;
  }

  public LocalDate getDataDaEntrega() {
    return dataDaEntrega;
  }

  public void setDataDaEntrega(LocalDate dataDaEntrega) {
    this.dataDaEntrega = dataDaEntrega;
  }

  public String getUrlProduto() {
    return urlProduto;
  }

  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }

  public String getUrlImagem() {
    return urlImagem;
  }

  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

    public String getComponentes() {
    return componentes;
  }

  public void setComponentes(String componentes) {
    this.componentes = componentes;
  }
}

//ENZO TREVISAN 
//RM94745
