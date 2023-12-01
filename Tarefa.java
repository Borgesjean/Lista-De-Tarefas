import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tarefa {
    private String responsavel;
    private String status;
    private String descricao;

    public Tarefa(String responsavel, String status, String descricao) {
        this.responsavel = responsavel;
        this.status = status;
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }
}