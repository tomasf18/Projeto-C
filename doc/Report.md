# AGL Grupo 8

Para facilitar a compreensão do trabalho que foi desenvolvido, criou-se este documento, onde especificamos todos os objectivos alcançados 
(bem como aqueles que pretenderíamos ainda alcançar, caso o tempo e a quantidade de erros o permitissem).

Deste modo, aqui pode ser encontrada uma ajuda extra para a análise do código fonte e para o modo de utilização do mesmo.

Todos os requisitos implementados foram devidamente testados com exemplos que podem ser encontrados na pasta `examples`. Estes foram
usados para testar a gramática, quanto à criaçáo da àrvore sintática, o compilador, quanto à geração de código, o analisador semântico, 
quanto à deteção de erros semânticos em AGL e o interpretador e gramática secundária, quanto à injeção de código/ações em runtime.

Em termos de requisitos, todos os mínimos foram implementados e, `tirando aquilo que envolvia a criação de um Model`, todos os restantes 
desejáveis também foram implementados.

Abaixo, passamos mais em detalhe um por um.

Antes disso deixamos aqui uma pequena ajuda para a orientação no sistema de ficheiros do projeto submetido:


-- README.md
-- agl.pdf
-- requirements.txt

- doc
    -- Report.md

- src
    - professor_examples (Exemplos dados pelo professor testados apenas com o interpretador semântico e gramática principal)
        -- ex04.agl
        -- ex05.agl
        -- ex06.agl
        -- s0.xagl
        -- s1.xagl
        -- s2.xagl
        -- s3.xagl
    - tests
        - minimum (Testes relativos aos requisitos minimos)
            -- ex01.agl
            -- ex02.agl
            -- ex03.agl
            -- ex04.agl
            -- ex05.agl
            -- ex06.agl
        - desirable (Testes relativos aos requisitos desejáveis)
            -- ex01.agl
            -- ex02.agl
            -- ex03.agl
        - semanticErrors (Testes relativos ao analisador semântico)
            -- ex01.agl
            -- ex02.agl
        - xaglScripts (Testes relativos à gramática secundária e interpretador)
            -- ex01.agl
            -- s1.xagl
            -- ex02.agl
            -- s2.xagl
            -- ex3_1.agl
            -- s3_1.xagl
            -- ex3_2.agl
            -- s3_2.xagl
            -- ex04.xagl
    -- agl.g4                   (gramática principal)
    -- xagl.g4                  (gramática secundária)
    -- AGLCompiler.java         (compilador)
    -- AGLMain.java             (programa principal)
    -- Objects.py               (ficheiro com as classes a serem importadas para o programa gerado)
    -- Output.py                (ficheiro destino, para o qual vai ser gerado todo o código)
    -- SemanticVisitor.java     (analisador semântico)
    -- tkinter.stg              (ficheiro com o String Template)
    -- interpretador.py         (interpretador)
    -- xaglLexer.py
    -- xaglListener.py
    -- xaglMain.py
    -- xaglParser.py
    -- xaglVisitor.py


Como é possível de se observar acima, foram desenvolvidas as ferramentas desejadas (pedidas no enunciado) para a implementação deste trabalho:
    - Gramática principal `agl.g4`
    - Analisador Semântico
    - Compilador
    - String Template `tkinter.stg`
    - Gramática secundária `xagl.g4`
    - Interprertador que permite fazer o parsing de descrições xAGL


## Requisitos Mínimos

Todos os requisitos mínimos foram implementados com sucesso, tendo sido testados com todos os exemplos fornecidos, bem como com vários outros
que considerámos importantes, de modo a garantir que todo funcionava como esperado.

1. Suporte para comentários, de linha e de bloco, tal como ilustrado no exemplos.

É possível criar comentários em linha e em bloco, como ilustra o seguinte exemplo:

``` agl
#(
    Este é um bloco
    de
    comentários multi-linha
#)

(...)

refresh view after 100 ms;  # update view every 100 milliseconds
```

2. Instanciação de uma vista (View) sobre a área de desenho (canvas). As vistas devem suportar as ações de move, refresh, wait e close. Neste nível 
(mínimo), pode considerar que há apenas uma vista.

É possível a criação de uma vista em Python, recorrendo à classe "View" (presente em `src/Objects.py`), bem como o uso de ações de 'move', 'refresh', 
'wait' e 'close'. Para mais fácil entendimento, deixamos só a nota que optámos por separar a implementação do evento 'wait mouse click' numa classe 
à parte, de nome "MouseClickEvent".

Quase todas as características deste requisito poderão ser encontradas no ficheiro em `src/tests/minimum/ex03.agl`.
As que faltam, que são os eventos de `wait load` e `wait input` podem ser encontrados na pasta `src/tests/xaglScripts`. 


3. Instanciação dos modelos gráficos base Dot, Line, Rectangle, Ellipse, Text, Arc, ArcChord, e PieSlice. Todos estes modelos têm implicitamente 
um ponto de referência, cuja localização no canvas será indicada aquando da sua instanciação. Todos os objetos gráficos devem suportar a ação de move. 
Todos os objetos gráficos possuem um conjunto de propriedades, que podem ser alteradas em tempo de execução.

É possível instanciar todos os modelos gráficos referidos acima. De modo a facilitar a implementação de todas as funcionalidades associaddas a estes
objetos, foram criadas, no ficheiro `src/Objects.py`, classes que lidam com as características específicas de cada figura. Todas essas classes
herdam da classe abstrata `Object`, dado que todas elas possuem atributos e funcionalidades em comum, embora tenham de ser implementadas de maneira 
diferente.

Deste modo, tornou-se mais simples a implementação da ação de move em todas elas, bem como da possibilidade de alteração das suas propriedades em
tempo de execução. Para efeitos de demonstração, recomenda-se a compilação dos ficheiros `src/tests/minimum/ex03.agl` e `src/tests/minimum/ex05.agl`, 
que visitam todas estas funcionalidades.


4. Suporte dos tipos de dados Integer, Number, Point, Vector, String e Time e da instanciação de variáveis desses tipos. Suporte de expressões 
envolvendo estes tipos de dados.

Algo de destacar neste requisito foi a criação da classe Point, de modo a tornar possível as corretas opreações que podem ser executadas sobre
este tipo de dados. De resto, pode ser encontontrada uma demonstração no ficheiro `src/tests/minimum/ex06.agl`, bem como ao longo de outros 
ficheiros de exemplo, em que intruções com este tipo de dados é necessária e traduzidas de forma correta.


5. Suporte da construção with.

Para ser possível a alteração de atributos de um objeto em tempo de execução, foi implemetada com sucesso a construção "with", que pode ser 
encontrada em ficheiros como o `src/tests/minimum/ex03.agl`.


6. Uma construção gramatical repetitiva for, para iterar sobre uma sequência de valores.

É possível usar uma construção gramatical repetitiva sobre uma sequência de valores (for range), e ficheiros que testam esta funcionalidade
são, entre outros, `src/tests/minimum/ex02.agl` e `src/tests/minimum/ex03.agl`.


7. Verificação semântica no uso de variáveis e de expressões e na manipulação de propriedades.

Para este requisito, foi desenvolvido um analisador semântico (`src/SemanticVisitor.java`) que deteta e sinaliza erros de descrição AGL que
escapam análise sintática. 

O analisador verifica das mais variadas possibilidades de infração à semântica da linguagem AGL. Entre elas, estão:
    - Verificação se as variáveis são declaradas adequadamente antes de serem utilizadas 
    - Verificaçao se as variaveis têm um tipo de dados existente ou criado pelo utilizador (no caso dos modelos)
    - Verificação se as atribuições e operações são válidas e aplicadas apenas aos tipos esperados
    - Verificação se os atributos (propriedades) dos vários modelos gráficos são válidos
    - Verificação se Enum apenas é criado dentro da definição de um modelo
    - Verificação se ações sobre um Enum sao válidas verificando se é um Enum já declarado e se os estados pertencem ao mesmo, assim como se o componente do modelo a ser alterado pertence ao modelo
    - Verificação se apenas propriedades de modelos é editada e para valores válidos
    - Etc.

Estes são apenas alguns aspetos tratados pela análise semântica, sendo que o analisador é muito mais abrangente, tentando ao máximo garantir que, antes de haver qualquer geração de código, o input dado é válido.

Vários testes a exemplos de erros semânticos podem ser encontrados na pasta `src/tests/semanticErrors` que evidencia os diferentes tipos de deteção de erros semânticos
    
Este visitor é adequadamente chamado no programa principal, `src/aglMain.java`.


8. Definição e implementação de uma linguagem secundária.

O ficheiro `src/xagl.g4` define a linguagem secundária, sobre a qual é possível a criação de descrições de elementos auxiliares
que possam ser importados pela linguagem principal. Estes elementos podem, assim, ser carregados para o programa final. Para a correta
implementação desta funcionalidade foi desenvolvido o interpretador (`src/interpretador.py`) que permite fazer o parsing de descrições xAGL.

Testes a estes elementos do trabalho podes ser encontrados nos ficheiros `src/tests/xaglScripts`. 

A linguagem xagl é um complemento à linguagem principal e é usada passando-lhe scripts.

``` python
with open("./tests/xaglScripts/s3.2.xagl", 'r') as file:
    v43 = file.read()
s3 = v43
v44 = c
v45 = message
v46 = heightContainer
v47 = view
Interpreter(s3, m=v44, t=v45, tn=v46, v=v47)
```


O interpretador para a linguagem secundária, desenvolvida em python.
Com base nos exemplos xagl fornecidos pelo professor em conjunto com a análise da gramática, definimos os q desenvolvemos o interpretador. 

Como a leitura dos tokens que nos eram fornecidas eram feitas através da função ctx.<>.getText(), que retornava uma string, então seria necessário realizar a  conversão  dos dados para o tipo esperado.

``` python 
def visitExprNumber(self, ctx:xaglParser.ExprNumberContext):
        print("visitExprNumber") # Print para debugging
        number = ctx.Number().getText()
        number = float(number)
        if number.is_integer():
            return int(number)
        else: 
            return number 
```
Como podemos observar neste exemplo, vamos buscar o number com "ctx.Number().getText()" -> onde N
mber() está definido na gramática de xagl, apóst isto vamos verificar se esse número é um float ou um integer para depois o retornarmos.

Outro tipo de verificações foi feita, usámos principalmente 2 funções para este fim:

```python
def get_object_by_id(self, id):
        print("get_object_by_id")
        return self.objects.get(id)
        ```
Onde iamos buscar os objetos a partir do seu id, onde seriam posteriormente guardados numa lista.

``` python
def get_number_or_var(self, object):
        print("get_number_or_var")

        if object in self.objects:
            object = self.get_object_by_id(object)   
            if isinstance(object, (int, float, complex)) and not isinstance(object, bool):
                return object 
        else: 
            number = float(object)
            if number.is_integer(): 
                return int(object)
            else: 
                return number
```
Nesta função nós verificávamos se estavamos a obter um número ou uma variável, pois teriamos que conseguir trabalhar com objetos do tipo int / float que a quem tivessem sido atribuidos uma variável, como por exemplo: x = 2.

O interpretador passou em todos os testes criados pelo professor, e decidimos criar os nosso próprios ficheiros de teste para testar todas as funcionalidades do interpretador.

Exemplo:
    Tomando como exemplo o ficheiro Output.py, onde estão definidos objetos da gramática principal, no meio do programa quando queremos executar funciionalidades presentes na gramática secundária, abrimos o ficheiro de exemplo:
    "with open("./agl/tests/xaglScripts/s3.xagl", 'r') as file:
        v22 = file.read()"
    E depois enviamos a leitura desse ficheiro para o interpretador, cuja sua estrutura é a seguinte:
    "def \_\_init\_\_(self, script, **kwargs):"
    Onde script corresponde à leitura do ficheiro, onde é lido como string, e depois temos a porção '**kwargs', para podermos aceitar os argumentos todos necessários, como objetos, views, variáveis, etc...

Uso: 
    - cat agl/tests/minimum/testScript.agl | antlr4-run
    - python3 Output.py


## Requisitos Desejáveis

Quanto à implementação dos requisitos desejáveis, por falta de tempo, apenas faltou o suporte para `A possibilidade de definição de novos modelos (...)`.
Começámos a implementar algumas coisas relacionadas com este ponto, tal como definições na gramática `agl.g4`, templates no ficheiro `tkinter.stg` e até mesmo
funções no visitor compiler.
De resto, foi tudo implementado com sucesso.

1. Instanciação dos modelos gráficos base Polyline, Spline, Polygon e Blob. Todos estes modelos têm implicitamente um ponto de referência, cuja localização 
no canvas será indicada aquando da sua instanciação. Todos os objetos gráficos devem suportar a ação de move. Todos os objetos gráficos possuem um conjunto de 
propriedades, que podem ser alteradas em tempo de execução.

Todos estes modelos gráficos foram corretamente implementados. à semelhança do ponto 3. dos Requisitos Mínimos, foram criadas classes que simplificaram a 
implementação deste requisito (ver em `src/Objects.py`). 

Por exemplo, ficheiro `src/tests/desirable/ex01.agl` contempla testes a estas funcionalidades, passados com sucesso. 

2. O tipo de dados Boolean e a manipulação de expressões booleanas.

O tipo de dados Boolean e a manipulação de exppressões booleanas, com recurso a operadores booleanos, também faz parte da gramática desenvolvida, e é 
suportada por tudo o que envolve a correta compilação de código.

O ficheiro `src/tests/desirable/ex01.agl` mostra bem a capacidade de compilação relacionada com este requisito.

```g4
	| '!' expr														# ExprNotBoolean
	| e1 = expr ('==' | '!=' | '<' | '<=' | '>' | '>=') e2 = expr	# ExprBoolCompare
	| e1 = expr '&&' e2 = expr										# ExprBooleanAND
	| e1 = expr '||' e2 = expr										# ExprBooleanOR
```

3. Uma construção gramatical condicional.

O mesmo ficheiro referido acima também testa esa funcionalidade, aliada à utilização de expressões booleanas.
Existem diferentes utilizações de estruturas condicionais. Procurámos, no nosso trabalho, conseguir abranger todas elas.

```g4
stat:
	'{' stat* '}'

    (...)

if_stat:
	'if' expr 'do' stat												# IfStat
	| 'if' expr 'do' stat 'else' if_stat							# IfElseIf
	| 'if' expr 'do' ifBlock = stat 'else' 'do' elseBlock = stat	# IfElseStat;
```


4. Uma construção gramatical repetitiva baseada em predicado (condição de termo ou de continuação).

Também conseguimos suportar este requisito, ao usar a contrução `while` para converter este tipo de instruções.
O ficheiro `src/tests/desirable/ex01.agl` ta,bém mostra como conseguimos colocar este requisito funcional.

5. Suporte para a especificação de vetores (Vector) em coordenadas polares.

O mesmo ficheiro acima reflete a forma como traduzimos um vetor especificado através de coordenadas polares na linguagem Python.

6. Suporte para estrutura de dados iterável (array, lista, ...) e de mecanismos de instanciação, acesso e manipulação dos seus elementos.

É possível instanciar, aceder e manipular uma esttrutura iterável (tipo Array), bem como iterar sobre a mesma. 
Tanto o ficheiro `src/tests/desirable/ex01.agl` como o `src/tests/desirable/ex02.agl` mostram que isso tudo é possível de ser realizado.

´´´g4
	| ID '[' index = expr ']' '=' value = expr ';'	# AssignmentArray;

(...)

	| '[' (expr (',' expr)*)? ']'									# ExprArray
	| ID '[' index = expr ']'										# ExprArrayAccess;

(...)

	| 'for' ID 'in' expr 'do' stat											# ForEachRange
´´´

7. Possibilidade de aplicar as ações move, refresh e close diretamente a uma lista de objetos

Para implementar esta funcionalidade, precisámos de alterar algumas coisas no String Template e na classe view. Da maneira como está
neste momento, é possível usar uma lista de objetos nas funções de move, refresh e close.

O ficheiro `src/tests/desirable/ex03.agl` permite mostrar a forma como implementámos este requisito.

