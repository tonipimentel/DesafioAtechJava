package br.com.tonipimentel.restapi.mapper;

public interface BaseMapper<OUTPUT, INPUT> {
    OUTPUT map(INPUT input);
}
