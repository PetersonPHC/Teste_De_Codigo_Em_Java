package calculofaturamento.view;

import com.fasterxml.jackson.databind.ObjectMapper;

import calculofaturamento.model.FaturamentoMensal;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
        	FaturamentoMensal faturamentoMensal = objectMapper.readValue(new File("src/main/resources/faturamento.json"), FaturamentoMensal.class);
            
            double[] valores = faturamentoMensal.getFaturamento();
            
            double menorValor = Arrays.stream(valores).filter(valor -> valor > 0).min().orElse(0);
            double maiorValor = Arrays.stream(valores).max().orElse(0);
            
            double somaDoFaturamentoMensal = Arrays.stream(valores).filter(v -> v > 0).sum();
            int diasComFaturamento = (int) Arrays.stream(valores).filter(v -> v > 0).count();
            double mediaMensaldeFaturamento = somaDoFaturamentoMensal / diasComFaturamento;
            
            long diasFaturamentoAcimaDaMedia = Arrays.stream(valores).filter(v -> v > mediaMensaldeFaturamento).count();

            System.out.println("Menor Valor de Faturamento Neste Mês: " + menorValor);
            System.out.println("Maior Valor de Faturamento Neste Mês: " + maiorValor);
            System.out.println("Dias com faturamento acima da média: " + diasFaturamentoAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
