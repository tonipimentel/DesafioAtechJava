package br.com.tonipimentel.restapi.web.api.v1.statusvoo.mapper;

import br.com.tonipimentel.restapi.mapper.BaseMapper;
import br.com.tonipimentel.restapi.model.StatusVoo;
import br.com.tonipimentel.restapi.web.api.v1.statusvoo.StatusVooResponse;

public class StatusVooResponseMapper implements BaseMapper<StatusVooResponse, StatusVoo> {

    @Override
    public StatusVooResponse map(final StatusVoo StatusVoo) {
        final StatusVooResponse StatusVooResponse = new StatusVooResponse();
        if (StatusVoo != null) {
            StatusVooResponse.setStatusVooID(StatusVoo.getStatusVooID());
            StatusVooResponse.setNome(StatusVoo.getNome());
        }
        return StatusVooResponse;
    }
}
