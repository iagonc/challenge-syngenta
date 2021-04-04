## 🙊 Mensagem Secreta
A imagem possui uma mensagem escondida, descubra qual a mensagem.

## :information_source: Sobre os códigos 
Algoritmo para tentar decifrar uma possível mensagem escondida
###  - Solution One
utilizei a lógica de converter a soma dos valores correspondentes do RGB (considerando apenas pixels verdes e brancos) para binário e logo após convertendo o binário para um caractere da tabela ASCII.
#### Saída
A saída foi alguns caracteres em chinês que significa "Traqueia", "Quadro" e "Engolir"(os dois caracteres juntos)
### - Solution Two
 utilizei a lógica de converter cada pixel verde para o binário 1 e cada pixel branco para o binário 0 e assim verificando em um convertor online se formou alguma frase.
#### Saída
A saída foi alguns caracteres especiais sem sentido e foi constatado que não seria viável tal lógica pelo fato de não conter ruídos nos pixels e serem apenas cores especificas no caso branco, verde e preto.
### - Solution Three
utilizei os conceitos de esteganografia que é uma técnica que consiste em esconder um arquivo dentro do outro, de forma criptografada.
#### Saída
A saída foi alguns caracteres especiais misturados com caracteres em latim sem sentido algum.


## :pencil: Tecnologias usadas. 
Para a realização desse projeto foram utilizadas as seguintes tecnologias: 
- [Java 11](https://docs.oracle.com/en/java/)
- [Junit](https://junit.org/junit5/)
- [Maven](https://docs.oracle.com/en/java/)
- [Design Pattern](https://refactoring.guru/pt-br/design-patterns/strategy) 