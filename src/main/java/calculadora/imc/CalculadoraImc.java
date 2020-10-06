package calculadora.imc;

import java.lang.Math;

public class CalculadoraImc {

	double imc;

	public String CalcularImc(double peso, double altura, int idade, String sexo) {

		imc = peso / Math.pow(altura, 2);

		if (idade > 20 && idade < 65) {
			if (imc < 16) {
				return "Baixo peso muito grave";
			} else if ((imc >= 16) && (imc <= 16.99)) {
				return "Baixo peso grave";
			} else if ((imc >= 17) && (imc <= 18.49)) {
				return "Baixo peso";
			} else if ((imc >= 18.50) && (imc <= 24.99)) {
				return "Peso normal";
			} else if ((imc >= 25) && (imc <= 29.99)) {
				return "Sobrepeso";
			} else if ((imc >= 30) && (imc <= 34.99)) {
				return "Obesidade grau I";
			} else if ((imc >= 35) && (imc <= 39.99)) {
				return "Obesidade grau II";
			} else if (imc >= 40) {

				return "Obesidade grau III (obesidade mórbida)";
			}
		}
		if (idade > 65 && sexo.equals("F")) {
			if (imc <= 21.9) {
				return "Baixo peso";
			} else if ((imc >= 22) && (imc <= 27)) {
				return "Peso normal";
			} else if ((imc >= 27.1) && (imc <= 32)) {
				return "Sobrepeso";
			} else if ((imc >= 32.1) && (imc <= 37)) {
				return "Obesidade grau I";
			} else if ((imc >= 37.1) && (imc <= 41.9)) {
				return "Obesidade grau II";
			} else if (imc >= 42) {
				return "Obesidade grau III";
			}

		}
		if (idade > 65 && sexo.equals("M")) {
			if (imc <= 21.9) {
				return "Baixo peso";
			} else if ((imc >= 22) && (imc <= 27)) {
				return "Peso normal";
			} else if ((imc >= 27.1) && (imc <= 30)) {
				return "Sobrepeso";
			} else if ((imc >= 30.1) && (imc <= 35)) {
				return "Obesidade grau I";
			} else if ((imc >= 35.1) && (imc <= 39.9)) {
				return "Obesidade grau II";
			} else if (imc >= 40) {
				return "Obesidade grau III";
			}
		}

		if (idade == 19 && sexo.equals("M")) {
			if (imc <= 19.9) {
				return "Baixo Peso";
			} else if ((imc >= 20) && (imc <= 26.99)) {
				return "Peso Normal";
			} else if ((imc >= 27) && (imc <= 30.4)) {
				return "Sobrepeso";
			} else if (imc >= 30.5) {
				return "Obesidade";
			}
		}

		if (idade == 19 && sexo.equals("F")) {
			if (imc <= 18.5) {
				return "Baixo Peso";
			} else if ((imc >= 18.6) && (imc <= 26.4)) {
				return "Peso Normal";
			} else if ((imc >= 26.5) && (imc <= 31.4)) {
				return "Sobrepeso";
			} else if (imc >= 31.5) {
				return "Obesidade";
			}
		}

		if (idade == 2 && sexo.equals("M")) {
			if (imc <= 15) {
				return "Baixo Peso";
			} else if ((imc >= 15.1) && (imc <= 18)) {
				return "Peso Normal";
			} else if ((imc >= 18.1) && (imc <= 19.2)) {
				return "Sobrepeso";
			} else if (imc >= 19.3) {
				return "Obesidade";
			}
		}

		if (idade == 2 && sexo.equals("F")) {
			if (imc <= 14.9) {
				return "Baixo Peso";
			} else if ((imc >= 15) && (imc <= 18)) {
				return "Peso Normal";
			} else if ((imc >= 18.1) && (imc <= 20)) {
				return "Sobrepeso";
			} else if (imc >= 20.1) {
				return "Obesidade";
			}
		}

		return null;
	}
}