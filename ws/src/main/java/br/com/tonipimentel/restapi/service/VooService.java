package br.com.tonipimentel.restapi.service;

import br.com.tonipimentel.restapi.model.Voo;

import java.util.Collection;

public interface VooService {

    Collection<Voo> findAll();

    Voo findByVooID(final Long VooID);
}
