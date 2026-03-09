/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.pablo;

import java.util.Date;

public class Estudante {

    private String nome;
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
    public String getNome(){
        return this.nome;
    }
    public void setNome(String _nome){
        this.nome = _nome;
    }
    public char obterGenero(){
        return this.genero;
    }
}
