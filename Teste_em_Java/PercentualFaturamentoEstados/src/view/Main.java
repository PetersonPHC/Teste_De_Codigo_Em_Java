package view;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String []args) {
		
		Map<String, Double> faturamentoDosEstados = new HashMap<>();
		
		faturamentoDosEstados.put("SP", 67836.43);
        faturamentoDosEstados.put("RJ", 36678.66);
        faturamentoDosEstados.put("MG", 29229.88);
        faturamentoDosEstados.put("ES", 27165.48);
        faturamentoDosEstados.put("Outros", 19849.53);
		
        double totalFaturamento = faturamentoDosEstados.values().stream().mapToDouble(valorDouble -> valorDouble).sum();
	
        faturamentoDosEstados.forEach((estado, faturamentoPorEstado) -> {
        	double percentual = (faturamentoPorEstado / totalFaturamento);
        	System.out.printf("O Estado: %s Teve um Percentual de Representação de %.2f%s \n", estado, (percentual*100),"%" );
        });
	
	}

}
