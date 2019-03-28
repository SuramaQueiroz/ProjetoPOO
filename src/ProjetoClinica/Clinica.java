package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
        Paciente paciente = new Paciente();
        paciente.nome = "Surama";
        paciente.rua = "Portel";
        paciente.planodesaude = "Unimed";

        Medico medico = new Medico();
        medico.nome = "Arthur";
        medico.CRM = "25425";
        medico.especialidade = "Neurlogia";


    }


}
