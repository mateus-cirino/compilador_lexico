/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compilador.modelos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

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
            Stream<Character> lexemas = scanner.next()
                    .chars()
                    .mapToObj(c -> (char) c);

            lexemas.forEach(c -> this.pilhaTokens.push(this.tabela.retornaToken(c)));
        }
    }
}
