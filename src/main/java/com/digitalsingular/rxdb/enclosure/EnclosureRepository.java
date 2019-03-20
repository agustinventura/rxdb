package com.digitalsingular.rxdb.enclosure;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.query.Query;

import reactor.core.publisher.Flux;

public interface EnclosureRepository extends R2dbcRepository<Enclosure, Integer>{

	@Query("Select * from SIGPAC19D_RECINTOS where cd_parcela = $1")
	Flux<Enclosure> findByPlot(int plot);
}
