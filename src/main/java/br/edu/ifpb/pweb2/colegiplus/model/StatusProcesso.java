package br.edu.ifpb.pweb2.colegiplus.model;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter 
@AllArgsConstructor
public enum StatusProcesso {
    CRIADO(1), 
    DISTRIBUIDO(2),
    EM_PAUTA(3),
    DISPONIVEL(4),
    JULGADO(5); 

    private final int codigo; 
}