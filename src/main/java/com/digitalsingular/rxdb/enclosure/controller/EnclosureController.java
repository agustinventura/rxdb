package com.digitalsingular.rxdb.enclosure.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalsingular.rxdb.enclosure.Enclosure;
import com.digitalsingular.rxdb.enclosure.EnclosureRepository;

@RestController
public class EnclosureController {
	
	private EnclosureRepository repository;

	public EnclosureController(EnclosureRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/enclosures")
    public Set<Enclosure> getQuoteFlux(final @RequestParam(name = "plot") int plot) {
		return repository.findByPlot(plot);
    }
}
