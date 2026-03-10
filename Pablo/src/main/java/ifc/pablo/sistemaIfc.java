/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.pablo;

/**
 *
 * @author aluno
 */
public class sistemaIfc {
    public static void main(String[] args) {
        Estudante pablo = new Estudante();
        Estudante vinicius = new Estudante();
        Estudante joao = new Estudante();
        
        pablo.setNome("Pablo");
        vinicius.setNome("vinicius");
        joao.setNome("joao");
        
        System.out.println(pablo.getNome());
        System.out.println(vinicius.getNome());
        System.out.println(joao.getNome());
    }
}
