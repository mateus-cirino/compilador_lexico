/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compilador.modelos;

import java.util.*;

/**
 *
 * @author Aluno
 */
public class TabelaSimbolos {
    private List<Token> listaTokens;
    private Map<Character, Token> mapTokens;
    
    public TabelaSimbolos() {
        this.mapTokens = new HashMap<>();
        this.listaTokens = new LinkedList<>();

        //tokens permitidos: [(,),+,*,1,2,3,4,5]
        Character abr_parenteseLex = '(';
        Token abr_parenteseToken = new Token(0, abr_parenteseLex);

        Character fec_parenteseLex = ')';
        Token fec_parenteseToken = new Token(1, fec_parenteseLex);

        Character somaLex = '+';
        Token somaToken = new Token(2, somaLex);

        Character multLex = '*';
        Token multToken = new Token(3, multLex);

        Character umLex = '1';
        Token umToken = new Token(4, umLex);

        Character doisLex = '2';
        Token doisToken = new Token(5, doisLex);

        Character tresLex = '3';
        Token tresToken = new Token(6, tresLex);

        Character quatroLex = '4';
        Token quatroToken = new Token(7, quatroLex);

        Character cincoLex = '5';
        Token cincoToken = new Token(8, cincoLex);

        //adiciona os tokens permitidos da linguagem na lista
        this.listaTokens.add(abr_parenteseToken);
        this.listaTokens.add(fec_parenteseToken);
        this.listaTokens.add(somaToken);
        this.listaTokens.add(multToken);
        this.listaTokens.add(umToken);
        this.listaTokens.add(doisToken);
        this.listaTokens.add(tresToken);
        this.listaTokens.add(quatroToken);
        this.listaTokens.add(cincoToken);

        //adiciona os tokens no map, para que possa ser possível
        //receber um caracter e devolver um token
        this.mapTokens.put(abr_parenteseToken.getCaracter(), abr_parenteseToken);
        this.mapTokens.put(fec_parenteseToken.getCaracter(), fec_parenteseToken);
        this.mapTokens.put(somaToken.getCaracter(), somaToken);
        this.mapTokens.put(multToken.getCaracter(), multToken);
        this.mapTokens.put(umToken.getCaracter(), umToken);
        this.mapTokens.put(doisToken.getCaracter(), doisToken);
        this.mapTokens.put(tresToken.getCaracter(), tresToken);
        this.mapTokens.put(quatroToken.getCaracter(), quatroToken);
        this.mapTokens.put(cincoToken.getCaracter(), cincoToken);
    }

    public Token retornaToken(Character c) {
        if(!this.mapTokens.containsKey(c)) {
            throw new RuntimeException("Nao existe esse caracter na minha linguagem");
        }
        return this.mapTokens.get(c);
    }
}
