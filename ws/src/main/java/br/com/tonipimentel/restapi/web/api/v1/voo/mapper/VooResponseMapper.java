package br.com.tonipimentel.restapi.web.api.v1.voo.mapper;

import br.com.tonipimentel.restapi.mapper.BaseMapper;
import br.com.tonipimentel.restapi.mapper.CollectionBaseMapper;
import br.com.tonipimentel.restapi.model.Voo;
import br.com.tonipimentel.restapi.web.api.v1.aviao.mapper.AviaoResponseMapper;
import br.com.tonipimentel.restapi.web.api.v1.statusvoo.mapper.StatusVooResponseMapper;
import br.com.tonipimentel.restapi.web.api.v1.voo.VooResponse;
import br.com.tonipimentel.restapi.web.api.v1.cidade.mapper.CidadeResponseMapper;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;

public class VooResponseMapper implements BaseMapper<VooResponse, Voo>, 
        CollectionBaseMapper<VooResponse, Voo> {

    private StatusVooResponseMapper StatusVooResponseMapper = new StatusVooResponseMapper();
    private AviaoResponseMapper AviaoResponseMapper = new AviaoResponseMapper();
    private CidadeResponseMapper CidadeResponseMapperOrigem = new CidadeResponseMapper();
    private CidadeResponseMapper CidadeResponseMapperDestino = new CidadeResponseMapper();

    @Override
    public VooResponse map(final Voo Voo) {
        final VooResponse VooResponse = new VooResponse();

        if (Voo != null) {
            VooResponse.setVooID(Voo.getVooID());
            VooResponse.setStatusVooResponse(StatusVooResponseMapper.map(Voo.getStatusVoo()));
            VooResponse.setAviaoResponse(AviaoResponseMapper.map(Voo.getAviao()));
            VooResponse.setPartida(Voo.getPartida());
            VooResponse.setChegada(Voo.getChegada());
            VooResponse.setCidadeResponseOrigem(CidadeResponseMapperOrigem.map(Voo.getCidadeOrigem()));
            VooResponse.setCidadeResponseDestino(CidadeResponseMapperDestino.map(Voo.getCidadeDestino()));
        }

        return VooResponse;
    }

    @Override
    public Collection<VooResponse> mapToCollection(final Collection<Voo> Voos) {
        final Collection<VooResponse> VooResponses = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(Voos)) {
            Voos.forEach(Voo -> VooResponses.add(map(Voo)));
        }

        return VooResponses;
    }
}
