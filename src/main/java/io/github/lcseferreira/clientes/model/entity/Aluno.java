package io.github.lcseferreira.clientes.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 150)
    @NotEmpty(message = "Campo Nome é obrigatório")
    private String nome;

    @Column(name = "cpf", length = 11, unique = true)
    @CPF(message = "CPF inválido")
    private String cpf;

    @Column(name = "ra", nullable = false, length = 10)
    @NotEmpty(message = "Campo RA é obrigatório")
    private String ra;

    @Column(name = "data_cadastro", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @Column(name = "data_nascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @Column(name = "sexo")
    @NotEmpty(message = "Campo Sexo é obrigatório")
    private String sexo;

    @Column(name = "nome_da_mae", length = 150)
    @NotEmpty(message = "Campo Nome da Mãe é obrigatório")
    private String nomeMae;

    @Column(name = "cpf_da_mae", length = 11)
    @CPF(message = "CPF inválido")
    private String cpfMae;

    @Column(name = "contato_da_mae1", length = 32)
    private String contatoMae1;

    @Column(name = "contato_da_mae2", length = 32)
    private String contatoMae2;

    @Column(name = "nome_do_pai", length = 150)
    private String nomePai;

    @Column(name = "cpf_do_pai", length = 11)
    @CPF(message = "CPF inválido")
    private String cpfPai;

    @Column(name = "contato_do_pai1", length = 32)
    private String contatoPai1;

    @Column(name = "contato_do_pai2", length = 32)
    private String contatoPai2;

    @Column(name = "nome_do_responsavel", length = 150)
    private String nomeResponsavel;

    @Column(name = "cpf_do_responsavel", length = 11)
    @CPF(message = "CPF inválido")
    private String cpfResponsavel;

    @Column(name = "contato_do_responsavel1", length = 32)
    private String contatoResponsavel1;

    @Column(name = "contato_do_responsavel", length = 32)
    private String contatoResponsavel2;

    @Column(name = "nome_da_escola", length = 150)
    private String nomeEscola;

    @Column(name = "nome_do_professor", length = 150)
    private String nomeProfessor;

    @Column(name = "serie_escolar", length = 40)
    private String serieEscolar;

    @Column(name = "periodo_escolar", length = 40)
    private String periodoEscolar;

    @Column(name = "professor_especial", length = 150)
    private String nomeProfessorEspecial;

    @Column(name = "necessita_cuidador", length = 10)
    private String necessitaCuidador;

    @Column(name = "cuidador", length = 150)
    private String cuidador;

    @Column(name = "deficiencia", length = 150)
    private String deficiencia;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero", length = 10)
    private String numero;

    @Column(name = "bairro", length = 50)
    private String bairro;

    @Column(name = "cidade", length = 50)
    private String cidade;

    @Column(name = "estado", length = 2)
    private String estado;

    @Column(name = "cep", length = 10)
    private String cep;

    @Column(name = "resumo_aluno", columnDefinition = "TEXT")
    private String resumoAluno;

    @Column(name = "outras_infos", columnDefinition = "TEXT")
    private String outrasInfos;

    @Column(name = "relatorio_medico", columnDefinition = "TEXT")
    private String relatorioMedico;

    @Column(name = "relatorio_pedagogico", columnDefinition = "TEXT")
    private String relatorioPedagogico;

    @PrePersist
    public void prePersist() {
        setDataCadastro(LocalDate.now());
    }
}

