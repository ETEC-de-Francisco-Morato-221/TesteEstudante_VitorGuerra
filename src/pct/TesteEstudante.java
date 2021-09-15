/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Vítor Guerra
 */
public class TesteEstudante {
    public static void main(String[] args) {
      
        //Criação e instância do objeto da classe Estudante
        Estudante alunoEtec = new Estudante();
        
        //Construção do objeto
        alunoEtec.registroAluno = 01;
        alunoEtec.nome = "Vitor Bueno";
        alunoEtec.nota = 'B';
        alunoEtec.frequencia = .40;
        alunoEtec.matriculaTrancada = true;
        
        //Exibindo o aluno da Etec
        System.out.println("\n\t\t\t -- Aluno Etec --\n");
        alunoEtec.apresentarEstudante();
        
        //Respondendo a chamada
        alunoEtec.responderChamada();
                
        //Exibindo o aluno da Etec após a chamada
        System.out.println("\n\t\t\t -- Aluno Etec após a chamada--\n");
        alunoEtec.apresentarEstudante();
    }
}
