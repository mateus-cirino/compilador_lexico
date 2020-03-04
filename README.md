#Compilador léxico
##Dividi em três classes (L�exico, Token e Tabela de Simbolos)
###Classe Token
Esta classe representa informações a respeito do token, ainda não foi implementado mas futuramente irá guardar inclusive a 
linha e coluna que ele foi encontrado no código fonte.
###Classe Tabela de Simbolos
Esta classe é responsável por iniciar os simbolos permitidos na linguagem[(,),+,*,1,2,3,4,5]` criando os tokens de cada 
simbolo e adicionando-o na lista de tokens permitidos, além disso ela também faz um mapeamento em que recebe um 
caractverifica se ele existe no mapeamento e retorna o token correspondente.
###Classe Lexico
Esta classe é responsável por retirar os espaços em branco, comentarios e etc, al�ém de ir coletando cada token e inserindo 
em uma pilha de tokens.
