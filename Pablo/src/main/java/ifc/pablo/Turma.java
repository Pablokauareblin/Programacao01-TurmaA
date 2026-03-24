/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.pablo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {
    String nome = "INFO25A";
    int anoEntrada = 2025;
    String curso = "Informatica";
    Turma professor = new Turma();
    Set <Turma> Discentes = new HashSet<Turma>();
    
}
