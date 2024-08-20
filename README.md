## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

Desafio Controle de Fluxo (ClaroBootcamp DIO)

CONTROLE DE FLUXO - DESAFIO

Vamos exercitar todo o conteudo apresentado no módulo de controle de fluxo codificando o seguinte cenario.

O sistema deverá receber dois parametros via terminal que representarão dois numeros inteiros, com estes dois numeros você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.printl) dos numeros incrementados, exemplo:

- Se voce passar os numeros 12 e 30, logo termos uma interação (for) com ocorrências para imprimir os números, exemplo: "imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

- Se o primeiro parâmetro for MAIOR que o segundoparâmetro, você deverá lançar a exceção customizada chamada de "ParametrosInvalidosException" com a segunda mensagem: "O segundo Parâmetro deve ser maior que o primeiro"

1 - Crie o projeto "DesafioControleFluxo"
2 - Dentro do projeto, crie a classe "Contador.java" para realizar toda a codificação do nosso programa.
3 - Dentro do projeto, crie a classe "ParametrosInvalidosException" que representará a exceção de negócio no sistema.
