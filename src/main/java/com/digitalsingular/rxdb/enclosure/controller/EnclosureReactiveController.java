package com.digitalsingular.rxdb.enclosure.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalsingular.rxdb.enclosure.Enclosure;
import com.digitalsingular.rxdb.enclosure.EnclosureRepository;

@RestController
public class EnclosureReactiveController {
	
	private EnclosureRepository repository;

	public EnclosureReactiveController(EnclosureRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/enclosures")
    public Page<Enclosure> getQuoteFlux(final @RequestParam(name = "page") int page,
                                    final @RequestParam(name = "size") int size) {
        return repository.findAll(PageRequest.of(page, size));
    }
}
