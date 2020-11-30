
package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Cadastro {

    private static String pessoas[];
    private static String nome[];
    private static String matricula[];
    private static String situacao[];       
    private static float av01[];
    private static float av02[];
    
    private static int QTDE = 100;
    
    private static void Imprimir(int id){
           
        System.out.printf(" Matricula ={%d} %s - ::  Situacao = (%s)\n", 
                            id, pessoas[id], situacao[id]);
   }
 
    private static void imprimir() {
		for (int i = 0; i < QTDE; i++) {
			if(pessoas[i] != null) {
				Imprimir(i);
			}
		}
	}    
    
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoas = new String[QTDE];
        situacao = new String[QTDE];
        av01   = new float[QTDE];
        av02   = new float[QTDE];
        Integer[] menu = {1,2,3,4};
        int opcao;
        int i = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("-------------------- MENU -------------------");
            System.out.println("[1] Cadastrar professor");
            System.out.println("[2] cadastrar aluno");
            System.out.println("[3] Consultar situação de um docente/discente");
            System.out.println("[4] Sair");
            System.out.println("-> Selecione a opcao desejada:");

            opcao = entrada.nextInt();
            
            if (Arrays.asList(menu).contains(opcao)) {
                if (opcao == 1) {
        
                    try {System.out.println("Informe o nome do aluno:");
                        if (i < QTDE) {
                            pessoas[i] = entrada.next();
                            pessoa.setNome(pessoas[i]);

                            situacao[i] = "Aluno";
                            pessoa.setSituacao(situacao[i]);  

                            pessoa.setMatricula(i);

                            i++;    
                        } else {
                        throw new LimiteBanco();
                        }
                    } catch (Erros e) {
                        System.err.println(e.getMessage());
                    }

                } else if(opcao == 2){
                    
                    try {System.out.println("Informe o nome do professor:");
                        if (i < QTDE) {
                            pessoas[i] = entrada.next();
                            pessoa.setNome(pessoas[i]);

                            situacao[i] = "Professor";
                            pessoa.setSituacao(situacao[i]);  

                            pessoa.setMatricula(i);

                            i++;    
                        } else {
                        throw new LimiteBanco();
                        }
                    } catch (Erros e) {
                        System.err.println(e.getMessage());
                    }

                } else if(opcao == 3) {
                        imprimir();                      
                }                
            }
                       
        } while (opcao != 4);
            System.out.println("Sistema finalizado com sucesso!");
            entrada.close();      
    }
    
}
