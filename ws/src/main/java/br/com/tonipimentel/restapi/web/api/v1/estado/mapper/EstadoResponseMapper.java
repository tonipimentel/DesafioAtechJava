package br.com.tonipimentel.restapi.web.api.v1.estado.mapper;

import br.com.tonipimentel.restapi.mapper.BaseMapper;
import br.com.tonipimentel.restapi.model.Estado;
import br.com.tonipimentel.restapi.web.api.v1.estado.EstadoResponse;

public class EstadoResponseMapper implements BaseMapper<EstadoResponse, Estado> {

    @Override
    public EstadoResponse map(final Estado Estado) {
        final EstadoResponse EstadoResponse = new EstadoResponse();

        if (Estado != null) {
            EstadoResponse.setEstadoID(Estado.getEstadoID());
            EstadoResponse.setNome(Estado.getNome());
            EstadoResponse.setSigla(Estado.getSigla());
        }

        return EstadoResponse;
    }
}
