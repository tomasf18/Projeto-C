# Tema **AGL**, grupo **agl-gg08**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | Participação |
|:---:|:---|:---:|
| 113384 | DANILO MICAEL GREGÓRIO SILVA | 20.0% |
| 113682 | GABRIEL VIEIRA DOS SANTOS | 20.0% |
| 103442 | HENRIQUE MIGUEL ESCUDEIRO CRUZ | 20.0% |
| 114514 | JOÃO PAULO MENDES GASPAR | 20.0% |
| 112981 | TOMÁS SANTOS FERNANDES | 20.0% |

## Relatório

#### Nota: Uma explicação mais detalhada sobre a estrutura e objetivos do trabalho encontra-se na pasta `doc`, no ficheiro `Report.md`.

### Objetivos concretizados:

#### Nível Mínimo (100%):
  - Suporte para comentários, de linha e de bloco, tal como ilustrado nos exemplos. ✔️

  - Instanciação de uma vista (View) sobre a área de desenho (canvas). As vistas devem suportar as as ações de move, refresh, wait e close. ✔️

  - Instanciação dos modelos gráficos base Dot, Line, Rectangle, Ellipse, Text, Arc, ArcChord, e PieSlice. Possuem um ponto de referência indicada na sua instanciação e suportam a ação move. É também possível alterar as suas prioridades em tempo de execução. ✔️

  - Suporte dos tipos de dados Integer, Number, Point, Vector, String e Time e da instanciação de variáveis desses tipos. Suporte de expressões envolvendo estes tipos de dados. ✔️

  - Suporte da construção with. ✔️

  - Uma construção gramatical repetitiva for, para iterar sobre uma sequência de valores. ✔️

  - Verificação semântica no uso de variáveis e de expressões e na manipulação de propriedades. ✔️
  
  - Definição e implementação de uma linguagem secundária. ✔️

#### Nivel Desejável (88%):
 - Instanciação dos modelos gráficos base Polyline, Spline, Polygon e Blob. Possuem um ponto de referência indicada na sua instanciação e suportam a ação move. É também possível alterar as suas prioridades em tempo de execução. ✔️

 - Tipo de dados Boolean e manipulação de expressões booleanas. ✔️

 - Construção gramatical condicional. ✔️

 - Uma construção gramatical repetitiva baseada em predicado. ✔️
 
 - Suporte para a especificação de vetores (Vector) em coordenadas polares. ✔️
 
 - Possibilidade de definição de novos modelos ✘
   * Implementado na gramática ✔️
   * Realizado verificações semânticas ✔️
   * Implementado no compilador ✘
 
 - Suporte para estrutura de dados iterável (array, lista, ...) e de mecanismos de instanciação, acesso e manipulação dos seus elementos. ✔️
 
 - Possibilidade de aplicar as ações move, refresh e close diretamente a uma lista de objetos. ✔️
  
  
#### Nivel Adicional (0%):
Devido ao facto de não termos completado na totalidade o nível anterior (nível desejável), e considerando que o nível adicional não seria avaliado caso o anterior não estivesse completo, optámos por não implementar este nível.


### Síntese:

- O que é o AGL:
  O AGL é uma linguagem que permite a definição de figuras 2D, e a sua visualização e interação.2D
- O que é o xAGL:
  O xAGL é uma linguagem secundária que vai servir para a execução de scripts em runtime da linguagem principal. O interpreter desta foi desenvolvido em Python, a linguagem destino. Com ela é-nos permitido auxiliar a linguage principal.2D
- Passos:
  - Definimos uma gramática principal 
  - Definimos um visitor semântico da mesma ( Para verificação de erros e coesão da linguagem )
  - Definimos o String template ( Ter modelos de código na linguagem destino para simplificar a geração de código )
  - Construimos um compilador ( Traduzir os statements da gramática AGL gerando o código para a linguagem destino )
  - Gramática secundária
  - Interpretador da gramática secundária ( Verificação semântica e intrepretação dos códigos de scripts da linguagem xAGL atuando sobre os objetos definidos na linguagem principal )
  ( Com a realização do interpretador da gramática secundária, foi necessária a alteração do compiler, para permitir imports por exemplo )
- Realização de testes:
  - Foram realizados testes sobre os scripts fornecidos pelo professor, porém, para além dos exemplos, desenvolvemos os próprios ficheiros para testar todas as funcionalidades de ambas as gramáticas, analisador semântico e compilador, de modo a garantir um resultado mais fiável.

## Contribuições

  Todos os elementos participaram de forma ativa em todos os blocos de código, em todas as reuniões establecidas e todos os membros mostraram o seu espírito crítico, expondo opiniões e dando ideias.

### Contribuições Individuais
Todos os elementos do grupo contribuiram também para todas as classes, funções, ficheiros, etc, que tivessem sido desenvolvidos, pois era necessária comunicação em todas as vertentes e para isso seria necessário os elementos do grupo estarem todos na mesma página, mas ao mesmo tempo e visto que houve também uma divisão de tarefas para tentar manter a resolução do trabalho minimamente ordenada, houve quem participasse ativamente mais em certas partes do código do que noutras, como vai ser referido a seguir.
  - Paricipações:
  - Report -> Todos;
  - Gramática -> Todos;
  - Exemplos de teste -> Todos
  - STG -> Maioritariamente Tomás Santos;
  - Analisador Semântico -> Maioritariamente João Gaspar;
  - Gramática secundária -> Maioritariamente Henrique e Gabriel
  - Interpretador -> Maioritariamente Henrique e Gabriel
  - Compiler -> Maioritariamente Danilo e Tomás;
  

## Como utilizar o Programa

#### Clonar Repositório
```bash
git clone https://github.com/detiuaveiro/agl-gg08.git
``` 

#### Alterar o diretório atual para agl-gg08/
```bash 
cd agl-gg08/
```

#### Instalar dependência
```bash 
pip install -r requirements.txt
```

#### Alterar o diretório atual para src/
```bash 
cd src/
```

#### Antlr4 Build 
```bash 
antlr4-build agl
```

```bash 
cat <filename>.agl | antlr4-run
```


- No caso de se querer testar um programa agl e xagl já feitos, executar o seguinte comando: 

```bash 
cat ./agl/tests/xaglScripts/s3.2.agl | antlr4-run
```

#### Executar o programa
```bash
python3 Output.py
```