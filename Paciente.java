import java.sql.Date;

public class Paciente {
    private int id;
    private static int nextId = 1;
    private String unidadeSUS;
    private String nome;
    private Date dataNasc;
    private String endereco;
    private String telefone;

    //Construtor padrão
    public Paciente() {
        this.id = nextId++;
    }

    //Getters e setters para todos os campos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnidadeSUS() {
        return unidadeSUS;
    }

    public void setUnidadeSUS(String unidadeSUS) {
        this.unidadeSUS = unidadeSUS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private NivelUrgencia nivelUrgencia;

    public NivelUrgencia getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public enum NivelUrgencia {
        EMERGENCIA,
        MUITO_URGENTE,
        URGENTE,
        POUCO_URGENTE,
        NAO_URGENTE
    }
}