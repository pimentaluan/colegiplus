package br.edu.ifpb.pweb2.colegiplus.model;

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
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table (name = "processo")
public class Processo {

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

    @ManyToOne
    @JoinColumn(name = "assunto_id")
    private Assunto assunto;

    @ManyToOne
    @JoinColumn(name = "interessado_id")
    private Aluno interessado;

    @ManyToOne
    @JoinColumn(name = "relator_id")
    private Professor relator;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    } 

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataRecepcao() {
        return dataRecepcao;
    }

    public void setDataRecepcao(Date dataRecepcao) {
        this.dataRecepcao = dataRecepcao;
    }

    public Date getDataDistribuicao() {
        return dataDistribuicao;
    }

    public void setDataDistribuicao(Date dataDistribuicao) {
        this.dataDistribuicao = dataDistribuicao;
    }

    public Date getDataParecer() {
        return dataParecer;
    }

    public void setDataParecer(Date dataParecer) {
        this.dataParecer = dataParecer;
    }

    public byte[] getParecer() {
        return parecer;
    }

    public void setParecer(byte[] parecer) {
        this.parecer = parecer;
    }

    public TipoDecisao getDecisaoRelator() {
        return decisaoRelator;
    }

    public void setDecisaoRelator(TipoDecisao decisaoRelator) {
        this.decisaoRelator = decisaoRelator;
    }   
     

}
