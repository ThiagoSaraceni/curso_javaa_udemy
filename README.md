pacote = agrupamento logico de classes relacionadas.
na minha aplicação posso ter varias classes, como classes que representam entidades, como produtos, pedido, cliente.. as classes que são entidades eu posso criar um pacote somente para elas como entidades, para assim agrupar e organizar minha aplicação
posso criar outro pacote de serviços, como email, serviço de pedidos e logs
outro pra repositorios, que é as classes para acessar os dados

Modulo(foi criado a partir do java 9) = Agrupamento lógico de pacotes relacionados.
Runtime= agrupamento físico.
No caso um modulo financeiro, são seus pacotes todos em um pacote só(Pelo que eu entendi) um pacote financeiro por exemplo, tem suas entidades e serviços e repositos porem somente do financeiro.
-----------------------
Para formatar um número em java que é float ou dobro nós mostramos na saida assim
System.out.printf("%.2f%n", x);
Acima é com duas casas decimais, %.2f é para dizer que vai ser duas casas decimais e o %n é a quebra de linhas, ou pode ser \n no final também.

System.out.printf("%.4f%n", x);
Agora é com 4 casas decimais

Se o seu windows for com idioma portugues os numeros irão ficar com virgulas, para mudar isso basta colocar abaixo do public static void main(String[] args) {
Locale.setDefault(Locale.US); 
e importar a classe java.util.locale
------------------------------------------
Para concatenar vários elementos em um mesmo comando de escrita
Regra geral para print e println
elemento1 + elemento2 + elemento3 + .... elementoN

System.out.println("RESULTADO = " + x + " METROS");

Para concatenar vários elementos em um mesmo comando de escrita
Regra geral para printf
"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2

System.out.printf("RESULTADO = %.2f metros%n", x);

E SE QUISERMOS USAR STRINGS, INTEIROS E FLOATs?
exemplo:
String nome = "Maria";
int idade = 31;
double renda = 4000.0;
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

marcadores de variaveis:
%f = ponto flutuante
%d = inteiro
%s = texto
%n = quebra de linha
-----------------------------------------
Sempre indique o tipo do número, se a expressão for de ponto flutuante(não inteira).

Para double use:
.0

Para float use:
f

exemplos

a = 6.0; DOUBLE
b = 6f; FLOAT
----------------------------------------
Casting

se eu tenho uma variavel double e for dividir dois numeros inteiros, ele me trará uma resposta inteira em formato flutuante, porém não a correta
exemplo:
int a,b;
double resultado;

a = 5;
b = 2;

resultado = a / b;
o resultado será 2.0 e era para ser 2.5

então para deixarmos claro para o java que voce quer um valor double coloque um double entre parensenteses antes da operação, exeplo

resultado = (double) a / b;

Outra maneira de usar o casting é se você tem um valor double e quer transformar ele em int, terá que colocar o (int) antes da variavel. Exemplo:

double a;
int b;

a = 5.0;
b = (int) a;

assim a variável b recebe o valor inteiro
--------------------------------------
ENTRADA DE DADOS

Para receber o comando de entrada ler no java, nós utilizamos a classe
Scanner nomeVariavel = new Scanner(System.in);

e em cima precisa importar java.util.Scanner;

Após isso para ler uma String você pode criar uma variavel String x, e colocar
x = nomeVariavel.next();

Assim o que você digitar irá armazenar em x.
--
Mas se você quiser ler um número inteiro é
int y;
y = nomeVariavel.nextInt();
--
para ler um número com ponto flutuante é a mesma coisa

x = nomeVariavel.nextDouble();
LEMBRANDO o nextDouble usa a localidade do sistema, se seu computador está em português precisara digitar o número com virgula, caso queira digitar o número com ponto precisar fazer um Locale.setDefault(Locale.US);
--
para ler um caractere
x = nomeVariavel.next().charAt(0);
o charAt(0) pega o primeiro caractere do String, até se digitar mais de um caractere ele pega o primeiro.
--

Para ler vários dados na mesma linha
String x;
int y;
double z;

x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();

agora Para ler um texto ATÉ A QUEBRA DE LINHA
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();
por exemplo
s1 = "bom dia"
s2 = "boa tarde"
s3 = "boa noite"

no momento que eu apertasse o espaço após o bom ele já teria pulado para o s2, se fosse com o next somente.


ATENÇÃO: quebra de linha pendente
Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão. Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
Solução: Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.

EXEMPLO:
x = sc.nextInt();
sc.nextLine();
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("DADOS DIGITADOS:");
System.out.println(x);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

------------
Convenções
Camel Case: lastName
	°pacotes
	°atributos
	°métodos
	°variáveis e parâmetros

Pascal Case: ProductService
	°Classe
	
----------
Funções interessantes para String
• Formatar: toLowerCase(), toUpperCase(), trim()
	toLowerCase(): deixar a string inteira em letra minuscula
	toUpperCase(): deixar a string inteira em letra maiscula
	trim(): retirar os espaços do inicio e do fim da string

• Recortar: substring(inicio), substring(inicio, fim)
	substring(2): coloquei 2 mas voce coloca o numero que quiser, e é apaga as primeiras quantidades de caracteres que voce escolheu, no meu caso 2
	substring(2,9):  mesma coisa porem agora com data de fim, se coloquei nove começa no caractere dois e termina no 9
	
• Substituir: Replace(char, char), Replace(string, string)
	replace('a', 'x'): usei como exemplo o valor a minusculo, tudo que for a minusculo irá virar x, nesse jeito como é uma letra só eu usei aspas simples, se for mais que uma é aspas duplas no caso do debaixo
	replace("abc", "xy"): usei aspas duplas e o que for abc irá virar xy
	
• Buscar: IndexOf, LastIndexOf
	o comando IndexOf a variavel que for usar ele tem que ser inteira, porque ele pegará o primeiro valor que encontrar e te retornar em que posição está, por exemplo vou procurar original.indexOf("bc"); o bc começa na posição 2, então me retornará 2
	o comando LastIndexOf  a diferença para o IndexOf é que no LastIndexOf ele pega o ultimo valor já o IndeoxOf pega o primeiro.
	
• str.Split(" ")
Split serve para criar um vetor de cada palavra e voce ve como separa, se eu usar o espaço a cada espaço que tiver ele vai separar um vetor 
exemplo:
String s = "potato apple lemon";
String[] vect = s.split(" ");
System.out.println(vect[0]);
saida vai ser: potato
System.out.println(vect[1]);
saida vai ser: apple
System.out.println(vect[2]);
saida vai ser: lemon

-----------------
comentarários em java
comentario em uma linha só //
// calculo xxxx

comentario de bloco
/*
texto alalalala
*/

-----------------
Classe
• É um tipo estruturado que pode conter (membros):
• Atributos (dados / campos)
• Métodos (funções / operações)

• A classe também pode prover muitos outros recursos, tais como:
• Construtores
• Sobrecarga
• Encapsulamento
• Herança
• Polimorfismo

• Exemplos:
• Entidades: Produto, Cliente, Triangulo
• Serviços: ProdutoService, ClienteService, EmailService, StorageService
• Controladores: ProdutoController, ClienteController
• Utilitários: Calculadora, Compactador
• Outros (views, repositórios, gerenciadores, etc.)
---
Classes, objetos, atributos
• Classe: é a definição do tipo
• Objetos: são instâncias da classe
----
Construtor
• É uma operação especial da classe, que executa no momento da
instanciação do objeto
• Usos comuns:
• Iniciar valores dos atributos
• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua
instanciação (injeção de dependência)
• Se um construtor customizado não for especificado, a classe disponibiliza o
construtor padrão:
Product p = new Product();
• É possível especificar mais de um construtor na mesma classe (sobrecarga)
----
Palavra this
• É uma referência para o próprio objeto
• Usos comuns:
• Diferenciar atributos de variáveis locais
• Passar o próprio objeto como argumento na chamada de um método ou
construtor
----
Sobrecarga
• É um recurso que uma classe possui de oferecer mais de uma
operação com o mesmo nome, porém com diferentes listas de
parâmetros.
--------------------------------------------------------------------------------------------
Declarando vetor em java
tipo do vetor [] nomeDaVariavelVetor = new tipoElementodoVetor[quantidadeDeElementosVetor];
double [] vect = new double[n];

criando vetor com poo
Products[] vect = new Products[n];
-----
Declarando lista em java

List <TipoDaLista> nomeVarLista = new ArrayList<>();
o motivo do = new ArrayList é porque a lista é uma interface então inteface não podemos instaciar, temos que instanciar uma classe completa e a classe que instanciamos é a ArrayList, então só colocar dessa maneira que está


List<Employee> list = new ArrayList<>();
-----
Declarando matriz em java

int [][] matriz = new int[line][colum];
tipo [][] nome_da_matriz = new tipo[valor_inteiro_da_linha][valor_inteiro_da_coluna]

for (int i=0; i<matriz.length; i++) {
	for(int j=0; j<matriz[i].length; j++) {
		System.out.print("Digite o valor na posição [" + i + "][" + j + "]: ");
		matriz[i][j] = sc.nextInt();
	}
}
		
-----------------------------------------------------------------------

Conceitos de DATA em JAVA

Conceitos importantes
• Data-[hora] local: 
ano-mês-dia-[hora] sem fuso horário
[hora] opcional 

• Data-hora global: 
ano-mês-dia-hora com fuso horário

Quando usar?
• Data-[hora] local: 
Quando o momento exato não interessa a pessoas de outro fuso horário.
	Uso comum: sistemas de região única, Excel.
	Data de nascimento: "15/06/2001"
	Data-hora da venda: "13/08/2022 às 15:32" (presumindo não interessar fuso horário) 

• Data-hora global: 
Quando o momento exato interessa a pessoas de outro fuso horário.
Uso comum: sistemas multi-região, web.
Quando será o sorteio? "21/08/2022 às 20h (horário de São Paulo)"
Quando o comentário foi postado? "há 17 minutos"
Quando foi realizada a venda? "13/08/2022 às 15:32 (horário de São Paulo)"
Início e fim do evento? "21/08/2022 às 14h até 16h (horário de São Paulo


Timezone (fuso horário) • GMT - Greenwich Mean Time
GMT e o Horario padrao de Londres, os outros horario são usados a GMT +alguma hora que significa tantas horas pra frente de londres ou tantas horas  anterior a londres
GTM - Greenwich Mean Time
	• Horário de Londres
	• Horário do padrão UTC - Coordinated Universal Time
	• Também chamado de "Z" time, ou Zulu time
	
	
Outros fuso horários são relativos ao GMT/UTC: • São Paulo: GMT-3
	• São Paulo: GMT -3
	• Manaus: GMT-4
	• Portugal: GMT+1
	

Muitas linguagens/tecnologias usam nomes para as timezones:
• "US/Pacific"
• "America/Sao_Paulo"
• etc


---
O padrão para importar horas em banco de dados, api web, etc é o Padrão ISO 8601

Padrão ISO 8601

Data-[hora] local:
	2022-07-21(ano,mes, dia)
	2022-07-21T14:52(ano, mes, dia, hora, minuto)
	2022-07-22T14:52:09(ano, mes, dia, hora, minuto, segundo)
	2022-07-22T14:52:09.4073((ano, mes, dia, hora, minuto,segundo, fração de segundo)
	
Data-hora global:
	2022-07-23T14:52:09Z(ano,mes,dia,hora,minuto,segundo(Z significa o horario gmtou horario padrao de londres)
	2022-07-23T14:52:09.254935Z(ano,mes,dia,hora,minuto,segundo, fracao de segundo em horario gmt)
	2022-07-23T14:52:09-03:00(ano mes, dia, hora, minuto, segundo, horario gmt -3horas)
	
LocalDate = SOMENTE DATA SEM HORA E MIN
LocalDateTIME = Data com horas min e segundo
Instat  =  Data com hora minuto e segundo no formato GMT

-------
Calculos com data e hora
DATA HORA EM JAVA SAO OBJETOS IMUTAVEIS, se voce quiser subtrair ou somar uma data hora preciso criar um novo objeto de maneira alterada.

----
ENUMERAÇÕES

Os enum são estados ou um processo de algo
por exemplo um pedido tem 4 estados
1) pendente de aprovação
2) processando
3) enviando
4) entregue

Em java usamos os enums  para informar em que processo estamos.

Conversão de String para enum

usar o valueOf

----
eu tava  com dificuldade na associacaooooo
o product é só eu criar um objeto do tipo product
exemplo
Product product1 = new Product(TV, 1200.00);
criei a variavel produto1 do tipo product
ja passei os valores por meio de um construtorrr
e minha dificuldade era associar
na classe order item
mas é literalmente na order item, eu criar  uma variavel do tipo product e importar o product1
era tao simples
so precisava entender isso

se eu for dar um getProduct().getPrice()
assim consigo verificar.
