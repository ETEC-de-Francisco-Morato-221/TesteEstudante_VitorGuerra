/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
import java.text.DecimalFormat;

/**
 *
 * @author Vítor Guerra
 */
public class Estudante {
    //Atributos
    int registroAluno;
    String nome;
    char nota; //['B'] | 'R' | 'I']
    double frequencia;
    boolean matriculaTrancada;
    DecimalFormat formatador = new DecimalFormat("0.0");
    
    public void apresentarEstudante(){
        System.out.println("Registro do Aluno: " + registroAluno);
        System.out.println("Nome Estudante: " + nome);  
        System.out.println("Menção: " + nota); 
        System.out.println("Frequencia: " + formatador.format(frequencia) + "h/aula."); 
        System.out.println("Ativo: " + matriculaTrancada);
        
    }


    public void responderChamada(){
    
            frequencia = frequencia + 1.25;
       
    }
    
}
