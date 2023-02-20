# SalarioIdade

Programa em java que peça para o usuário digitar a idade, o salário e o sexo de uma pessoa até que as entradas digitadas sejam válidas.

Idade: entre 0 e 150; Salário: maior que 0; Gênero: M, F ou Outro.

Por último imprima os dados recebidos do usuário.

<h2>Explicação:</h2>

O programa começa por importar a classe Scanner que será utilizada para a leitura dos dados digitados pelo usuário.

Em seguida, são declaradas as variáveis idade, salario e genero.

Utilizando o laço de repetição do-while, o programa pede ao usuário para digitar a idade, o salário e o gênero, respectivamente, e verifica se as entradas são válidas. 

Caso contrário, o programa continua pedindo que o usuário insira os dados corretamente.

Finalmente, após as entradas serem validadas, o programa imprime os dados recebidos do usuário.

Note que na verificação do gênero, foi utilizada a função equalsIgnoreCase() que verifica se a string digitada pelo usuário é igual a "M", "F" ou "Outro" 
independente de estar em caixa alta ou baixa.


------------------------------------------------------------------------

<h2>Sobre  equalsIgnoreCase():</h2>


O método equalsIgnoreCase() é utilizado em Java para comparar duas strings sem considerar diferenças entre maiúsculas e minúsculas (ou seja, sem fazer distinção entre letras maiúsculas e minúsculas).

Por exemplo, se tivermos duas strings "OpenAI" e "openai", o método equals() retornaria false, já que as strings são diferentes devido à diferença de capitalização. No entanto, o método equalsIgnoreCase() retornaria true, já que as strings são consideradas iguais, independentemente de sua capitalização.

Sintaxe: string1.equalsIgnoreCase(string2)

O método retorna um valor booleano true se as strings comparadas forem iguais, independentemente de sua capitalização, e false caso contrário.

-------------------------------------------------------------------------------------------------------------------------------------------------------

<h2>O quê significa a linha de código: </h2>

<h2>} while (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F") && !genero.equalsIgnoreCase("Outro"));</h2>

Essa linha de código é uma expressão booleana que faz parte da estrutura de repetição do-while, usada para garantir que o valor da variável genero seja válido.

Essa expressão verifica se a string armazenada na variável genero é diferente de "M" (não é "M") e ao mesmo tempo é diferente de "F" (não é "F") e diferente de "Outro" (não é "Outro"). Se a condição for verdadeira (ou seja, o valor de genero não é "M", nem "F", nem "Outro"), o bloco de código dentro do do-while é executado novamente, pedindo ao usuário que digite uma entrada válida para genero.

O operador lógico && é usado para combinar as três condições de forma que todas elas devem ser verdadeiras para que a expressão inteira seja verdadeira.

Em resumo, essa expressão garante que o valor de genero seja uma das opções válidas ("M", "F" ou "Outro"), e o do-while só será interrompido quando uma entrada válida for fornecida pelo usuário.




==========================================================================

<h2>Resultado como é apresentado no Console:</h2>

Informe sua idade:
18

 Informe o salário:
1.000

Informe o gênero (M/F/Outro):
F


 ======Impressão de dados: ========
 
 Idade:18
 
 Salário:1000.0
 
 Gênero:F
 
 =================================

