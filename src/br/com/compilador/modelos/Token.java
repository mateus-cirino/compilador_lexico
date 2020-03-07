/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compilador.modelos;

/**
 *
 * @author Aluno
 */
public class Token {
    private String type;
    private Integer linha;
    private Integer coluna;
    private String lexema;
    
    public Token(String type, String lexema) {
        this.type = type;
        this.lexema = lexema;
    }

    public String getLexema() {
        return this.lexema;
    }

    @Override
    public String toString() {
        return "[ " + this.type + " " + this.lexema + " ]";
    }
}
