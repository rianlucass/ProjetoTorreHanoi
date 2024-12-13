<h1>Torre de Hanói em Java</h1>
Este projeto implementa o jogo clássico da Torre de Hanói em Java, utilizando a estrutura de dados pilha (Stack) para gerenciar os discos. O jogo segue as regras tradicionais, adicionando um limite de movimentos para aumentar o desafio.

<h2>Funcionalidades</h2>
Regras tradicionais da Torre de Hanói:

Um disco maior nunca pode ser colocado sobre um menor.
O objetivo é mover todos os discos da pilha inicial (Pilha A) para a pilha final (Pilha C).
Controle de movimentos:

O número máximo de movimentos é limitado a 7. Se o jogador exceder esse limite, o jogo termina com uma mensagem de derrota.
Exibição no console:

O estado atual das pilhas é exibido após cada movimento, mostrando visualmente os discos empilhados.
Validação de movimentos:

Garante que apenas movimentos válidos sejam executados, respeitando as regras do jogo.

<h2>Estrutura do Projeto</h2>
hanoi.model:
Contém as classes relacionadas à estrutura de dados:

Stack: Implementa a pilha usada para gerenciar os discos.
Node: Representa cada nó na pilha.
hanoi.service:
Contém a lógica principal do jogo:

GameManager: Gerencia o estado do jogo, valida os movimentos e controla o limite de movimentos.
hanoi.ui:
Pode ser expandido para implementar interfaces interativas no futuro (atualmente, a interface é baseada no console).

<h2>Como Jogar</h2>
Clone o repositório e compile os arquivos no diretório src.
Execute a classe Main para iniciar o jogo.
Siga as instruções no console para mover os discos entre as pilhas.
Tente transferir todos os discos para a Pilha C dentro do limite de movimentos!
