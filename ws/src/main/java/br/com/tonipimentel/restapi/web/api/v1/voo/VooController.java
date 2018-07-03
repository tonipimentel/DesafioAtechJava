package br.com.tonipimentel.restapi.web.api.v1.voo;

import br.com.tonipimentel.restapi.model.Voo;
import br.com.tonipimentel.restapi.web.api.v1.voo.mapper.VooResponseMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import br.com.tonipimentel.restapi.service.VooService;

@RestController
@RequestMapping("api/v1/voos")
public class VooController {

    private static final ResponseEntity NO_CONTENT_RESPONSE = new ResponseEntity<>(HttpStatus.NO_CONTENT);

    @Autowired
    private VooService VooService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<VooResponse>> findVoos() {
        ResponseEntity responseEntity = NO_CONTENT_RESPONSE;

        Collection<Voo> Voos = VooService.findAll();

        if (CollectionUtils.isNotEmpty(Voos)) {
            responseEntity = new ResponseEntity<>(new VooResponseMapper().mapToCollection(Voos), HttpStatus.OK);
        }

        return responseEntity;
    }

    @CrossOrigin
    @RequestMapping(value = "/{VooID}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Voo> findFlightByFlightId(@PathVariable("VooID") final Long VooID) {
        ResponseEntity responseEntity = NO_CONTENT_RESPONSE;
        Voo flight = VooService.findByVooID(VooID);

        if (flight != null) {
            responseEntity = new ResponseEntity<>(new VooResponseMapper().map(flight), HttpStatus.OK);
        }

        return responseEntity;
    }
}
