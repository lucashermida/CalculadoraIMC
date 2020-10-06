package calculadora.imc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaCalculadora {

	CalculadoraImc calc;

	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}

	@Test
	public void testeAdultoBaixoPesoMuitoGraveMaximo() {
		Assert.assertEquals("Baixo peso muito grave", calc.CalcularImc(54.72, 1.85, 31, "F"));
	}

	@Test
	public void testeAdultoBaixoPesoGraveMinimo() {
		Assert.assertEquals("Baixo peso grave", calc.CalcularImc(77.00, 2.193, 64, "F"));

	}

	@Test
	public void testeAdultoBaixoPesoGraveMaximo() {
		Assert.assertEquals("Baixo peso grave", calc.CalcularImc(64, 1.941, 64, "M"));

	}

	@Test
	public void testeAdultoBaixoPesoMinimo() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(55.00, 1.798, 24, "M"));

	}

	@Test
	public void testeAdultoPesoBaixoMaximo() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(65.34, 1.88, 54, "F"));

	}

	@Test
	public void testeAdultoPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(71.00, 1.959, 21, "F"));
	}

	@Test
	public void testeAdultoPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(99.00, 1.9905, 40, "M"));
	}

	@Test
	public void testeAdultoSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(97.04, 1.97, 40, "M"));
	}

	@Test
	public void testeAdultoSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(82.63, 1.66, 45, "M"));
	}

	@Test
	public void testeObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(106.00, 1.87, 25, "F"));
	}

	@Test
	public void testeObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(117.00, 1.8287, 55, "M"));
	}

	@Test
	public void testeObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(78.00, 1.49, 23, "M"));
	}

	@Test
	public void testeObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(159, 1.9941, 30, "F"));
	}

	@Test
	public void testeObesidadeGrauIIIMinimo() {
		Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.CalcularImc(160, 2, 30, "M"));

	}

	@Test
	public void testeIdosoBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(55, 1.65, 69, "M"));

	}

	@Test
	public void testeIdosoPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(59.90, 1.65, 70, "M"));
	}

	@Test
	public void testeIdosoPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(87, 1.8001, 90, "M"));
	}

	@Test
	public void testeIdosoBaixoSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(89, 1.80, 80, "M"));
	}

	@Test
	public void testeIsodoSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(86, 1.70, 75, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(88, 1.70, 90, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(85, 1.60, 100, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(110, 1.69, 77, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(99, 1.60, 85, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIIIMaximo() {
		Assert.assertEquals("Obesidade grau III", calc.CalcularImc(130, 1.60, 95, "M"));
	}

	@Test
	public void testeIdosaBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(58, 1.64, 90, "F"));

	}

	@Test
	public void testeIdosaPesaNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(59.90, 1.65, 90, "F"));
	}

	@Test
	public void testeIdosaPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(87, 1.8001, 70, "F"));
	}

	@Test
	public void testeIdosaSobrePesoMinimo() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(86, 1.80, 100, "F"));
	}

	@Test
	public void testeIdosaBaixoSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(81, 1.60, 76, "F"));
	}

	@Test
	public void testeIdosaObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(83, 1.60, 86, "F"));
	}

	@Test
	public void testeIdosaObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(102, 1.70, 97, "F"));
	}

	@Test
	public void testeIdosaObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(110, 1.70, 89, "F"));

	}
	
	@Test
	public void testeIdosaObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(120, 1.70, 89, "F"));
	}
	@Test
	public void testeIdosaObesidadeGrauIIImaximo() {
		Assert.assertEquals("Obesidade grau III", calc.CalcularImc(125, 1.70, 89, "F"));
	}

	@Test
	public void testeMenina2anosBaixoPeso() {
		Assert.assertEquals("Baixo Peso", calc.CalcularImc(14.5, 1, 2, "F"));
	}

	@Test
	public void testeMenina2anosPesoNormalMinimo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(15, 1, 2, "F"));
	}

	@Test
	public void testeMenina2anosPesoNormalMaximo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(11.5, 0.8, 2, "F"));
	}

	@Test
	public void testeMenina2anosSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(12, 0.8, 2, "F"));
	}

	@Test
	public void testeMenina2anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(12.7, 0.8, 2, "F"));
	}

	@Test
	public void testeMenina2anosObesidade() {
		Assert.assertEquals("Obesidade", calc.CalcularImc(13, 0.8, 2, "F"));
	}

	@Test
	public void testeMenino2anosBaixoPeso() {
		Assert.assertEquals("Baixo Peso", calc.CalcularImc(15, 1, 2, "M"));
	}

	@Test
	public void testeMenino2anosPesoNormalMinimo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(15.1, 1, 2, "M"));
	}

	@Test
	public void testeMenino2anosPesoNormalMaximo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(18, 1, 2, "M"));
	}

	@Test
	public void testeMenino2anosSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(11.6, 0.8, 2, "M"));
	}

	@Test
	public void testeMenino2anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(12.2, 0.8, 2, "M"));
	}

	@Test
	public void testeMenino2anosObesidade() {
		Assert.assertEquals("Obesidade", calc.CalcularImc(13, 0.8, 2, "M"));

	}

	@Test
	public void testeMenina19anosBaixoPeso() {
		Assert.assertEquals("Baixo Peso", calc.CalcularImc(46.5, 1.6, 19, "F"));
	}

	@Test
	public void testeMenina19anosPesoNormalMinimo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(50, 1.6, 19, "F"));
	}

	@Test
	public void testeMenina19anosPesoNormalMaximo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(65, 1.6, 19, "F"));
	}

	@Test
	public void testeMenina19anosSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(77, 1.7, 19, "F"));
	}

	@Test
	public void testeMenina19anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(90, 1.7, 19, "F"));
	}

	@Test
	public void testeMenina19anosObesidade() {
		Assert.assertEquals("Obesidade", calc.CalcularImc(92, 1.7, 19, "F"));
	}

	@Test
	public void testeMenino19anosBaixoPeso() {
		Assert.assertEquals("Baixo Peso", calc.CalcularImc(56, 1.7, 19, "M"));
	}

	@Test
	public void testeMenino19anosPesoNormalMinimo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(59, 1.7, 19, "M"));
	}

	@Test
	public void testeMenino19anosPesoNormalMaximo() {
		Assert.assertEquals("Peso Normal", calc.CalcularImc(75, 1.7, 19, "M"));
	}

	@Test
	public void testeMenino19anosSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(80, 1.7, 19, "M"));
	}

	@Test
	public void testeMenino19anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(87, 1.7, 19, "M"));
	}

	@Test
	public void testeMenino19anosObesidade() {
		Assert.assertEquals("Obesidade", calc.CalcularImc(90, 1.7, 19, "M"));

	}

}