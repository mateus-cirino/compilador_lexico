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
    private Integer codigo;
    private Integer linha;
    private Integer coluna;
    private Character caracter;
    
    public Token(Integer codigo, Character caracter) {
        this.codigo = codigo;
        this.caracter = caracter;
    }

    public Character getCaracter() {
        return this.caracter;
    }

    @Override
    public String toString() {
        return "[ " + Integer.toString(this.codigo) + " " + this.caracter + " ]";
    }
}
