package br.com.tonipimentel.restapi.service.v1;

import br.com.tonipimentel.restapi.model.Voo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import br.com.tonipimentel.restapi.repository.VooRepository;
import br.com.tonipimentel.restapi.service.VooService;

@Service
public class VooServiceImpl implements VooService {

    @Autowired
    private VooRepository VooRepository;

    @Override
    public Collection<Voo> findAll() {
        return VooRepository.findAll();
    }

    @Override
    public Voo findByVooID(final Long VooID) {
        return VooRepository.findByVooID(VooID);
    }
}
