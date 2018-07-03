package br.com.tonipimentel.restapi.web.api.v1.aviao.mapper;

import br.com.tonipimentel.restapi.mapper.BaseMapper;
import br.com.tonipimentel.restapi.model.Aviao;
import br.com.tonipimentel.restapi.web.api.v1.aviao.AviaoResponse;

public class AviaoResponseMapper implements BaseMapper<AviaoResponse, Aviao> {

    @Override
    public AviaoResponse map(final Aviao Aviao) {
        final AviaoResponse AviaoResponse = new AviaoResponse();
        if (Aviao != null) {
            AviaoResponse.setAviaoID(Aviao.getAviaoID());
            AviaoResponse.setModelo(Aviao.getModelo());
        }
        return AviaoResponse;
    }
}
