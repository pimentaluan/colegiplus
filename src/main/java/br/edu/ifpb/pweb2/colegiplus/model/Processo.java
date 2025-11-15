package br.edu.ifpb.pweb2.colegiplus.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Processo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotBlank
    private String numero;

    @Temporal(TemporalType.DATE)
    private Date dataRecepcao;

    @Temporal(TemporalType.DATE)
    private Date dataDistribuicao;

    @Temporal(TemporalType.DATE)
    private Date dataParecer;

    @Lob
    private byte[] parecer;

    @Enumerated(EnumType.STRING)
    private TipoDecisao decisaoRelator;

    @Enumerated(EnumType.STRING)
    private StatusProcesso status;

    @ManyToOne
    @JoinColumn(name = "assunto_id")
    private Assunto assunto;

    @ManyToOne
    @JoinColumn(name = "aluno_interessado_id")
    private Aluno interessado;

    @ManyToOne
    @JoinColumn(name = "professor_relator_id")
    private Professor relator;

    @Column(length = 1000)
    private String textoRequerimento;

}
