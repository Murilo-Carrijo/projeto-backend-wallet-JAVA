package com.wallet;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWord {

	@Test
	@DisplayName("Verifica se os testes estão rodando")
	public void testHelloWorld() {
		assertEquals(1, 1);
	}
}
