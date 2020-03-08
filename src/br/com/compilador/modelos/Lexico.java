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

    //recebo o caminho do arquivo
    public void leituraCodigoFonte(String path) {
        Scanner scanner;
        String linha;
        String lexema = "";
        try{
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("arquivo nao encontrado");
        }

        while(scanner.hasNextLine()){
            linha = scanner.nextLine();
            linha = linha.replaceAll(" ", "");
            if(!linha.startsWith("//", 0) && !linha.startsWith("#", 0)){
                for(int i = 0; i < linha.length(); i++){
                    if(linha.charAt(i) == '='){
                        if(!lexema.equals("")){
                            this.pilhaTokens.push(this.tabela.retornaToken(lexema));
                            lexema = "=";
                            this.pilhaTokens.push(this.tabela.retornaToken(lexema));
                            lexema = "";
                        }else{
                            lexema = "=";
                            this.pilhaTokens.push(this.tabela.retornaToken(lexema));
                            lexema = "";
                        }
                    }else if(linha.charAt(i) == ';'){
                        if(!lexema.equals("")){
                            this.pilhaTokens.push(this.tabela.retornaToken(lexema));
                            lexema = ";";
                            this.pilhaTokens.push(this.tabela.retornaToken(lexema));
                            lexema = "";
                        }else{
                            lexema = ";";
                            this.pilhaTokens.push(this.tabela.retornaToken(lexema));
                            lexema = "";
                        }
                    }else{
                        lexema += Character.toString(linha.charAt(i));
                    }
                }
            }
        }
    }
}
