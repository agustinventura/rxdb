package com.digitalsingular.rxdb.enclosure;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface EnclosureRepository extends CrudRepository<Enclosure, Integer>{

	Set<Enclosure> findByPlot(int plot);
}
