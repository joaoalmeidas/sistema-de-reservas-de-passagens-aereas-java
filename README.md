# sistema-de-reservas-de-passagens-aereas-java
Exercicio 7.19 do livro Java: Como Programar


(Sistema de reservas de passagens aéreas) Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema
automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada
voo da companhia aérea (capacidade: 10 assentos).
Seu aplicativo deve exibir as seguintes alternativas: Please type 1 for First Class e Please type 2 for Economy. [Por
favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]. Se o usuário digitar 1, seu aplicativo deve atribuir
assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, seu aplicativo deve atribuir um assento na classe econômica (poltronas
6 a 10). Seu aplicativo deve exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na
classe econômica.
Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. À medida que cada assento é atribuído, configure o
elemento correspondente do array como true para indicar que o assento não está mais disponível.
Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada. Quando a classe econômica estiver lotada, seu aplicativo deve
perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a mensagem "Next flight leaves in 3 hours" [O próximo voo parte em 3 horas].
