package br.edu.ifpb.pweb2.colegiplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.pweb2.colegiplus.model.Assunto;

@Repository
public interface AssuntoRepository extends JpaRepository<Assunto, Long> {

}