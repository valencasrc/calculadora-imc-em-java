public class Principal {
    public static void main(String[] args) {

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        /*calculadoraIMC.altura = 1.77;
        calculadoraIMC.peso = 81;*/

        Paciente lucas = new Paciente();
        lucas.peso = 81;
        lucas.altura = 1.77;

        IndiceMassaCorporal imc = calculadoraIMC.calcular(81,1.77);

        if (imc.estaComObesidade()){
            System.out.printf("CalculadoraIMC com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso );
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }


}
