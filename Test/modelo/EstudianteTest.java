package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstudianteTest {
	private Estudiante estudiante;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando pruebas de estudiante");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Termiando pruebas de estudiante");
	}

	@BeforeEach
	void setUp() throws Exception {
		estudiante = new Estudiante();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetMatriculaCP1() throws Exception{
		estudiante.setMatricula("180030773");
	}
	
	@Test
	void testSetMatriculaCP2() throws Exception{
		estudiante.setMatricula("022001234");
	}
	
	@Test
	void testSetMatriculaCP3() throws Exception{
		estudiante.setMatricula("Hola mundo");
	}
	
	@Test
	void testSetMatriculaCP4() throws Exception{
		estudiante.setMatricula("9");
	}
	
	@Test
	void testSetMatriculaCP5() throws Exception{
		estudiante.setMatricula("100028437");
	}

	@Test
	void testSetNombre() throws Exception{
		estudiante.setNombre("Carlos Alberto");
	}
	@Test
	void testSetNombre2() throws Exception{
		estudiante.setNombre("1672");
	}

	@Test
	void testSetApellidos() throws Exception{
		estudiante.setApellidos("Ahorca Ganzo");
	}
	@Test
	void testSetApellidos2() throws Exception{
		estudiante.setApellidos("1267 16271");
	}

	@Test
	void testSetEdad() throws Exception{
		estudiante.setEdad(78);
	}
	
	@Test
	void testSetEdad2() throws Exception{
		estudiante.setEdad(-78);
	}

}
