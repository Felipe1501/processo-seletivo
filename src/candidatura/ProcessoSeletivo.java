package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("PROCESSO SELETIVO");
        selecaoCandidatos();
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
