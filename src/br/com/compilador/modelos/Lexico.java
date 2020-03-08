/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compilador.modelos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
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
        pilhaTokens = new Stack<>();
    }

    //recebo o arquivo
    public void tiraEspacoBranco(FileInputStream fis) {
       //retiro o espaco em branco
    }

    //recebo o caminho do arquivo
    public void leituraCodigoFonte(String path) {
        Scanner scanner;
        try{
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("arquivo nao encontrado");
        }
        while (scanner.hasNext()){
            String lexema = scanner.next();
            if(!lexema.equals(";")  && lexema.charAt(lexema.length() - 1) == ';'){
                String new_lexema = lexema.substring(0, lexema.length() - 1);
                String finalizador = ";";

                this.pilhaTokens.push(this.tabela.retornaToken(new_lexema));
                this.pilhaTokens.push(this.tabela.retornaToken(finalizador));
            }else if(!lexema.equals("=")  && lexema.charAt(lexema.length() - 1) == '='){
                String new_lexema = lexema.substring(0, lexema.length() - 1);
                String atribuicao = "=";

                this.pilhaTokens.push(this.tabela.retornaToken(new_lexema));
                this.pilhaTokens.push(this.tabela.retornaToken(atribuicao));
            }else{
                this.pilhaTokens.push(this.tabela.retornaToken(lexema));
            }
        }
        System.out.println(this.pilhaTokens);
    }
}
