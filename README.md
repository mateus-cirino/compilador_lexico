# Compilador lexico
## Dividi em três classes (Lexico, Token e Tabela de Simbolos)
### Classe Token
Esta classe representa informações a respeito do token, ainda não foi implementado mas futuramente ira guardar inclusive a linha e coluna que ele foi encontrado no código fonte.
### Classe Tabela de Simbolos
Esta classe e responsável por iniciar os simbolos permitidos na linguagem[(,),+,*,1,2,3,4,5]` criando os tokens de cada simbolo e adicionando-o na lista de tokens permitidos, alem disso ela tambem faz um mapeamento em que recebe um caracter e verifica se ele existe no mapeamento e retorna o token correspondente.
### Classe Lexico
Esta classe e responsavel por retirar os espaços em branco, comentarios e etc, alem de ir coletando cada token e inserindo em uma pilha de tokens.
