package com.digitalsingular.rxdb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.digitalsingular.rxdb.enclosure.EnclosureRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RxdbApplicationTests {

	@Autowired
	private EnclosureRepository repository;

	@Test
    public void someBenchmarkMethod() {
        long startTime = System.currentTimeMillis();
        repository.findByPlot(1);
        long endTime = System.currentTimeMillis();
        System.out.println("Ha tardado " + (endTime - startTime));
    }

}
