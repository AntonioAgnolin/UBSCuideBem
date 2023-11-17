import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cria uma lista para armazenar os pacientes
        List<Paciente> listaPacientes = new ArrayList<>();

        //Cria pacientes
        Paciente paciente1 = new Paciente();
        paciente1.setNome("John");
        paciente1.setNivelUrgencia(Paciente.NivelUrgencia.POUCO_URGENTE);

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Rosângela");
        paciente2.setNivelUrgencia(Paciente.NivelUrgencia.NAO_URGENTE);

        //Adiciona os pacientes à lista
        listaPacientes.add(paciente1);
        listaPacientes.add(paciente2);

        //Imprime os pacientes antes da atualização
        System.out.println("Lista de Pacientes (Antes da Atualização):");
        imprimirListaPacientes(listaPacientes);

        //Atualiza o nome do primeiro paciente
        paciente1.setNome("João Silva");

        //Imprime os pacientes após a atualização
        System.out.println("\nLista de Pacientes (Após Atualização):");
        imprimirListaPacientes(listaPacientes);

        //Remove o segundo paciente da lista
        listaPacientes.remove(paciente2);

        //Imprime os pacientes após a remoção
        System.out.println("\nLista de Pacientes (Após Remoção):");
        imprimirListaPacientes(listaPacientes);
    }

    //Método auxiliar para imprimir a lista de pacientes
    private static void imprimirListaPacientes(List<Paciente> pacientes) {
        for (Paciente paciente : pacientes) {
            System.out.println("ID: " + paciente.getId() +
                    ", Nome: " + paciente.getNome() +
                    ", Nível de Urgência: " + paciente.getNivelUrgencia());
        }
    }
}
