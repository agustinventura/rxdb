package com.digitalsingular.rxdb.enclosure;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EnclosureRepository extends ReactiveCrudRepository<Enclosure, Integer> {

	Flux<Enclosure> findByPlot(int plot);
}
