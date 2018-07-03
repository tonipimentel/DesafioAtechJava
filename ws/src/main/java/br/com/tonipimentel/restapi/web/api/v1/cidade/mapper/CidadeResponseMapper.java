package br.com.tonipimentel.restapi.web.api.v1.cidade.mapper;

import br.com.tonipimentel.restapi.mapper.BaseMapper;
import br.com.tonipimentel.restapi.model.Cidade;
import br.com.tonipimentel.restapi.web.api.v1.estado.mapper.EstadoResponseMapper;
import br.com.tonipimentel.restapi.web.api.v1.cidade.CidadeResponse;

public class CidadeResponseMapper implements BaseMapper<CidadeResponse, Cidade> {

    private EstadoResponseMapper EstadoResponseMapper = new EstadoResponseMapper();

    @Override
    public CidadeResponse map(final Cidade Cidade) {
        final CidadeResponse CidadeResponse = new CidadeResponse();

        if (Cidade != null) {
            CidadeResponse.setCidadeID(Cidade.getCidadeID());
            CidadeResponse.setNome(Cidade.getNome());
            CidadeResponse.setEstadoResponse(EstadoResponseMapper.map(Cidade.getEstado()));
        }

        return CidadeResponse;
    }
}
