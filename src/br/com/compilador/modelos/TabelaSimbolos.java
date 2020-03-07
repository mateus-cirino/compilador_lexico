/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compilador.modelos;

import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author Aluno
 */
public class TabelaSimbolos {
    private List<Token> listaTokens;
    private Map<String, Token> mapTokens;
    private final Pattern variavelRegex = Pattern.compile("[A-Za-z]([A-Za-z]|[0-9]|_)*");
    private final Pattern digitolRegex = Pattern.compile("[0-9]+(.[0-9]+)?");
    private final Pattern atribuicaoRegex = Pattern.compile("[=]");
    private final Pattern finalizadorRegex = Pattern.compile("[;]");
    
    public TabelaSimbolos() {
        this.mapTokens = new HashMap<>();
        this.listaTokens = new LinkedList<>();
    }

    public Token retornaToken(String lexema) {

        if(!this.mapTokens.containsKey(lexema)){
            if(this.variavelRegex.matcher(lexema).matches()){
                Token tokenVar = new Token("variavel", lexema);
                this.listaTokens.add(tokenVar);
                this.mapTokens.put(lexema, tokenVar);
                return tokenVar;
            }else if(this.digitolRegex.matcher(lexema).matches()){
                Token tokenDig = new Token("digito", lexema);
                this.listaTokens.add(tokenDig);
                this.mapTokens.put(lexema, tokenDig);
                return tokenDig;
            }else if(this.atribuicaoRegex.matcher(lexema).matches()){
                Token tokenAtrib = new Token("atribuicao", lexema);
                this.listaTokens.add(tokenAtrib);
                this.mapTokens.put(lexema, tokenAtrib);
                return tokenAtrib;
            }else if(this.finalizadorRegex.matcher(lexema).matches()){
                Token tokenFinaliz = new Token("finalizador", lexema);
                this.listaTokens.add(tokenFinaliz);
                this.mapTokens.put(lexema, tokenFinaliz);
                return tokenFinaliz;
            }else{
                System.out.println(lexema);
                throw new RuntimeException("lexema inválido");
            }
        }
        return this.mapTokens.get(lexema);
    }
}
