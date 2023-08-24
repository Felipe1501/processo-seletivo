package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("PROCESSO SELETIVO");
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "YURI ALBERTO", "RENATO AUGUSTO", "GIL"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº" + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação foreach");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "YURI ALBERTO", "RENATO AUGUSTO", "GIL", "MATIAS ROJAS", "FAGNER", "MOSCARDO", "MAICON"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretentido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretentido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO PARA CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
            
    }
}
