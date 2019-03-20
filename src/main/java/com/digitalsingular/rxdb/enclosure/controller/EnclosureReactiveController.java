package com.digitalsingular.rxdb.enclosure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalsingular.rxdb.enclosure.Enclosure;
import com.digitalsingular.rxdb.enclosure.EnclosureRepository;

import reactor.core.publisher.Flux;

@RestController
public class EnclosureReactiveController {
	
	private EnclosureRepository repository;

	public EnclosureReactiveController(EnclosureRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/enclosures")
    public Flux<Enclosure> getQuoteFlux(final @RequestParam(name = "plot") int plot) {
		return repository.findByPlot(plot);
    }
}
