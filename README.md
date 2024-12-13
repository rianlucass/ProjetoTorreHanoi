<h1>Torre de Hanói em Java</h1>
    <p>
        Este projeto implementa o jogo clássico da Torre de Hanói em Java, utilizando a estrutura de dados 
        <strong>pilha (Stack)</strong> para gerenciar os discos. O jogo segue as regras tradicionais, adicionando 
        um limite de movimentos para aumentar o desafio.
    </p>

    <h2>Funcionalidades</h2>
    <ul>
        <li><strong>Regras tradicionais da Torre de Hanói:</strong>
            <ul>
                <li>Um disco maior nunca pode ser colocado sobre um menor.</li>
                <li>O objetivo é mover todos os discos da pilha inicial (Pilha A) para a pilha final (Pilha C).</li>
            </ul>
        </li>
        <li><strong>Controle de movimentos:</strong>
            <ul>
                <li>O número máximo de movimentos é limitado a 7. Se o jogador exceder esse limite, o jogo termina com uma mensagem de derrota.</li>
            </ul>
        </li>
        <li><strong>Exibição no console:</strong>
            <ul>
                <li>O estado atual das pilhas é exibido após cada movimento, mostrando visualmente os discos empilhados.</li>
            </ul>
        </li>
        <li><strong>Validação de movimentos:</strong>
            <ul>
                <li>Garante que apenas movimentos válidos sejam executados, respeitando as regras do jogo.</li>
            </ul>
        </li>
    </ul>

    <h2>Estrutura do Projeto</h2>
    <ul>
        <li><strong>hanoi.model:</strong>
            <ul>
                <li><code>Stack</code>: Implementa a pilha usada para gerenciar os discos.</li>
                <li><code>Node</code>: Representa cada nó na pilha.</li>
            </ul>
        </li>
        <li><strong>hanoi.service:</strong>
            <ul>
                <li><code>GameManager</code>: Gerencia o estado do jogo, valida os movimentos e controla o limite de movimentos.</li>
            </ul>
        </li>
        <li><strong>hanoi.ui:</strong>
            <ul>
                <li>Pode ser expandido para implementar interfaces interativas no futuro (atualmente, a interface é baseada no console).</li>
            </ul>
        </li>
    </ul>

    <h2>Requisitos</h2>
    <ul>
        <li>Java 8 ou superior.</li>
    </ul>

    <h2>Como Jogar</h2>
    <ol>
        <li>Clone o repositório e compile os arquivos no diretório <code>src</code>.</li>
        <li>Execute a classe <code>Main</code> para iniciar o jogo.</li>
        <li>Siga as instruções no console para mover os discos entre as pilhas.</li>
        <li>Tente transferir todos os discos para a Pilha C dentro do limite de movimentos!</li>
    </ol>
