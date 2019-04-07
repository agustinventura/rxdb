package com.digitalsingular.rxdb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.digitalsingular.rxdb.enclosure.Enclosure;
import com.digitalsingular.rxdb.enclosure.EnclosureRepository;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RxdbApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(RxdbApplicationTests.class);
	
	@Autowired
	private EnclosureRepository repository;
	
	@Test
    public void contextLoads() {
		//repository.findByPlot(90140).as(StepVerifier::create).expectNextCount(1L).verifyComplete();
		repository.findByPlot(90140).subscribe(enclosure -> logger.info(enclosure.toString()));
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}

