package com.formacaoandroidstudio.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Links de estudos:
     * https://developer.android.com/guide/practices/screens_support.html?hl=pt-br
     * https://developer.android.com/training/multiscreen/screensizes?hl=pt-br
     * https://developer.android.com/training/multiscreen/screendensities?hl=pt-br
     *
     * Aprendendo a usar o Constrant na tela:
     *
     * Por exemplo, um componente (ou elemento) button, ao arrastá-lo surgirá quatro círculos no componente button,
     * ao clicar e segurar é possível arrastar uma reta (mola) que dita a posição do componente que você quer
     * deixar na tela. Para retirar uma essa mola, basta segurar o ctrl e apertar o botão esquerdo do mouse
     * (vai ficar vermelho a mola).
     *
     * Para remover todas as regras de layouts constraints, pode clicar no botão "Clear all Constraints" ou
     * com o botão direito do mouse em cima do elemento clicar em "Clear Constraints of Selection". Que irá
     * remover apenas as contraints desse elemento.
     *
     * É possível criar as contraints de forma automatica ao clicar "Infer Constraints". Porém, para layouts mais
     * complexos o 'infer constraints' não vai ser de muita ajuda. Logo o essencial vai ser você criar do zero
     * as suas regras de layouts.
     *
     * É possível selecionar o Design da área (Select Design Surface). Com a área blueprint facilita a criação
     * do layout. Blueprint é bom usar para layouts mais complexos.
     *
     * Também é possível alinhar um elemento baseado no outro elemento.
     *
     * Na aba attributes na seção Layouts:
     * Na aba de Attributes na seção de 'Layouts' é possível visualizar quatro conexões das constraints (constraint widget),
     * representado por um quadrado e suas quatro conexões.
     * É possível remover a constraints pela seção 'Layouts' - o simbolo 'x' remove a constraint.
     * É possível também adicionar a constraint apertando o '+', também é possível colocar o valor do espaçamento entre
     * as bordas. Lembrando que a constraint vai se iniciar a partir do valor do espaçamento estipulado (vai estar
     * o valor desse espaçamento no design).
     * A 'Horizontal Bias' e 'Vertical Bias' são marcadores que é possível posicionar o elemento com suas constraints
     * conectadas.
     *
     * Outra funcionalidade através dos simbolos (>>) e (<<) (Wrap Content) que define que o elemento irá ficar no tamanho
     * do espaço do seu conteúdo. Por exemplo, se você escrever o text do botão você verá que o botão irá se adaptar a
     * esse texto.
     *
     * Ao clicar no >> ele irá fixar (fixed), usará o símbolo (|-|). O valor do tamanho do elemento estará no atributo 'layout_width'.
     * Que tem uma unidade de medida de 'dp' (independência de densidade).
     *
     * Também tem o 'Match Constraints' que define o componente a preencher todo o espaço das molas.
     * Portanto, sao três opções: (1) Wrap Constraints (2) Fixed (3) Match Constraints
     *
     * OBS. Ainda sobre a unidade de medida dp:
     * Tamanhos da Tela: Tamanho fisico real, medido como a diagonal da tela.
     *
     * Densidade da tela: A quantidade de pixels em uma área física da tela, geralmente chamada de dpi (pontos por polegadas).
     * Quanto mais pixel estiver na área melhor vai ser a qualidade da imagem. Podemos dizer que pixel são quadradinhos.
     * Pesquise por dpi.
     *
     * Orientação: A orientação da tela no ponto de vista do usuário. As opções de retrato ou paisagem, o que significa que a
     * taxa de proporção da tela é larga ou alta, respectivamente.
     *
     * Para terminar vamos falar da aba "Component Tree". Essa aba vai mostrar o componente numa estrutura de árvore. Os
     * componentes estarão um abaixo do outro. Contudo, existe componentes que podem colocar um dentro do outro. Por exemplo,
     * o button e o text view estão dentro do ConstraintLayout. Essa aba facilita a visualização para casos de layouts complexas.
     * */
}
