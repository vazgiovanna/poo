/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giovanna.vaz
 */
public class Produto {
    public String nome;
    public String codigo;
    private String marca;
    private double preco;

// método acessor - get 
// método modificador - post

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void setCodigo(String codigo){
    this.codigo = nome;
}

public String getCodigo(){
    return this.codigo;
}

public void setMarca(String marca){
    this.marca = marca;
}

public String getMarca(){
    return this.marca;
}

public void setPreco(double preco){
    if(preco > 0){
    this.preco = preco;
}else{
        this.preco = 10.0;
    }
}

public double getPreco(){
    return this.preco;
}

}