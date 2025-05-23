package br.fatecrl.mvcdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Perifericos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String cor;
    private String marca;
    private String imagem;
    private float preco;
    private float peso;

    public Perifericos() {}

    public Perifericos(String nome, String descricao, String cor, String marca, String imagem, float preco, float peso) {
        this.nome = nome;
        this.descricao = descricao;
        this.cor = cor;
        this.marca = marca;
        this.imagem = imagem;
        this.preco = preco;
        this.peso = peso;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getImagem() { return imagem; }

    public void setImagem(String imagem) { this.imagem = imagem; }

    public float getPreco() { return preco; }

    public void setPreco(float preco) { this.preco = preco; }

    public float getPeso() { return peso; }

    public void setPeso(float peso) { this.peso = peso; }
}
