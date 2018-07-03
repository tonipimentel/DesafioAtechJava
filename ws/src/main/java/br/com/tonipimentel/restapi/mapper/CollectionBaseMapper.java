package br.com.tonipimentel.restapi.mapper;

import java.util.Collection;

public interface CollectionBaseMapper<OUTPUT, INPUT> {
   Collection<OUTPUT> mapToCollection(Collection<INPUT> inputs);
}
