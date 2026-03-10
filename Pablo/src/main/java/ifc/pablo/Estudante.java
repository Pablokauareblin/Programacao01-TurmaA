/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.pablo;

import java.util.Date;

public class Estudante {

    private static String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;

    public Estudante() {
        this.nome = "Nobody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;

        //logica para calcular idade
        return idade;
    }
    public static String getNome(){
        return nome;
    }
    public static void setNome(String _nome){
        nome = _nome;
    }
}
