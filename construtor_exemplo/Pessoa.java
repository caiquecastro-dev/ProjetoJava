package construtor_exemplo;

import java.util.Random;

    public class Pessoa {
        private String nome;
        private final double codigo_identificador;
        private final Random aleatorio;

        public Pessoa(String nome) {
            aleatorio = new Random();
            this.nome = nome;
            this.codigo_identificador = aleatorio.nextDouble();
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome () {
            return this.nome;
        }
        public double getCodigoIdentificador () {
            return this.codigo_identificador;
        }
        public static void main(String args []) {
        Pessoa p1 = new Pessoa("Teste A");
        System.out.println("Pessoa 1: " + p1.getNome());
        System.out.println("Código Identificador: " + p1.getCodigoIdentificador());
        }
    }