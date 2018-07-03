package br.com.tonipimentel.restapi.repository;

import br.com.tonipimentel.restapi.model.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface VooRepository extends JpaRepository<Voo, Long> {

    List<Voo> findAll();

    Voo findByVooID(final Long VooID);
}
