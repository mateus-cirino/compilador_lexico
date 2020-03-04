/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compilador.testes;

import br.com.compilador.modelos.Lexico;

/**
 *
 * @author Aluno
 */
public class TesteLexico {
    public static void main(String[] args) {
        Lexico lexico = new Lexico();
        System.out.println(lexico.retornaListTokens());
    }
}
