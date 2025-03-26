
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author giovanna.vaz
 */
public class Main {

    public static void main(String args[]) {
        // usuário insere informações do produto
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do produto: ");
        String nome = sc.nextLine();
        
        System.out.println("Codigo do produto: ");
        String codigo = sc.nextLine();
        
        System.out.println("Marca do produto: ");
        String marca = sc.nextLine();
        
        System.out.println("Preco do produto: ");
        double preco = sc.nextDouble();
        
        // instância da classe para criar um objeto do tipo Produto
        
        Produto prod = new Produto();
        
        prod.nome = "Maria";
        
        prod.setNome(nome);
        prod.setMarca(marca);
        prod.setCodigo(codigo);
        prod.setPreco(preco);
        
        System.out.println("Nome: " +prod.getNome());
        System.out.println("Marca: " +prod.getMarca());
        System.out.println("Codigo: " +prod.getCodigo());
        System.out.println("Preco: " +prod.getPreco());
    }
}
