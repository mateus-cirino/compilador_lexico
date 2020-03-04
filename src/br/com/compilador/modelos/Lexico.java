/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compilador.modelos;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Aluno
 */
public class Lexico {
    private Stack<Token> pilhaTokens;
    private TabelaSimbolos tabela;

    public Lexico() {
        this.tabela = new TabelaSimbolos();
    }

    //recebo o arquivo
    public void tiraEspacoBranco(FileInputStream fis) {
       //retiro o espaco em branco
    }

    //recebo o arquivo
    public void leituraCodigoFonte(FileInputStream fis) {
        //enquanto tiver caracter no arquivo eu vou adicionando na pilha de tokens
        /*
        while(fis.has){
        try{
            Token token = retornaToken(fis.next);
            pilhaTokens.push(token);
        }catch(Exception e){
        //trato a execao aqui, pego a linha e a coluna e o caracter do erro
        }

        }
         */
    }
}
