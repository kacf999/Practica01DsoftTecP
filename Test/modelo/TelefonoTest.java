package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelefonoTest {
	private Telefono telefono;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando Pruebas de Telefono");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Terminando Pruebas de Telefono");
	}

	@BeforeEach
	void setUp() throws Exception {
		telefono = new Telefono();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetNumero() throws Exception{
		telefono.setNumero("5527529715");
		
	}
	@Test
	void testSetNumero2() throws Exception{
		telefono.setNumero("5");

	}
}
