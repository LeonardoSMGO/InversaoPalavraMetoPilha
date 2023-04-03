import java.util.Stack;

public class InversaoPalavra {
    public static void main(String[] args) {
    String frase1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
    String fraseInvertida1 = inverterFrase(frase1);
    System.out.println("Frase invertida: " + fraseInvertida1);

    String frase2 = "ESARF ATERCES ODALERAHCAB ME SAICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
    String fraseCorrigida2 = inverterFrase(frase2);
    System.out.println("Frase corrigida: " + fraseCorrigida2);
}

private static String inverterFrase(String frase) {
    Stack<Character> pilha = new Stack<>();
    StringBuilder palavraInvertida = new StringBuilder();
    StringBuilder fraseInvertida = new StringBuilder();

    for (int i = 0; i < frase.length(); i++) {
        char caractere = frase.charAt(i);

        if (caractere != ' ') {
            pilha.push(caractere);
        } else {
            while (!pilha.empty()) {
                palavraInvertida.append(pilha.pop());
            }
            palavraInvertida.append(" ");
        }
    }
    while (!pilha.empty()) {
        palavraInvertida.append(pilha.pop());
    }
    
    fraseInvertida.append(palavraInvertida.toString().trim());

    pilha.clear();

    return fraseInvertida.toString();
}
}