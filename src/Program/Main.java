package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Funcionarios> funcionarios = new ArrayList<>();
        //
        for (int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i+1) + ": ");

            int id;
            while(true){
                System.out.print("ID: ");
                id = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                // Verificar se já existe funcionário com esse ID
                boolean idExiste = false;
                for(Funcionarios f : funcionarios) {
                    if(f.getId() == id) {
                        idExiste = true;
                        System.out.println("ID JÁ EXISTE! DIGITE OUTRO.");
                        break;
                    }
                }

                if (!idExiste) {
                    break;
                }
            }

            System.out.print("NOME: ");
            String nome = scanner.nextLine();

            System.out.print("SALARIO: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer

            Funcionarios func = new Funcionarios(id, nome, salario);
            funcionarios.add(func);
        }

        System.out.println();
        System.out.println("Insira o ID do funcionário que receberá o aumento salarial: ");
        int procurarID = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        // Procurar funciónario pelo ID
        Funcionarios encontrado = null;
        for(Funcionarios f : funcionarios) {
            if(f.getId() == procurarID) {
                encontrado = f;
                break;
            }
        }

        if(encontrado == null) {
            System.out.println();
            System.out.println("Esse ID não existe!");
        } else {
            System.out.println();
            System.out.println("Insira a porcentagem de aumento: ");
            double porcentagem = scanner.nextDouble();
            encontrado.aumentarSalario(porcentagem);
        }

        System.out.println("\n--- Lista atualizada de funcionários ---");
        for (Funcionarios f : funcionarios) {
            System.out.println(f);
        }


        scanner.close();
    }
}
