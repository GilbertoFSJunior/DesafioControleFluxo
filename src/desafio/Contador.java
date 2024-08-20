package desafio;

public class Contador {

    public static void main(String[] args) {
        try {
            // Verifica se dois argumentos foram passados
            if (args.length != 2) {
                throw new IllegalArgumentException("Dois parâmetros inteiros devem ser passados.");
            }

            int parametro1 = Integer.parseInt(args[0]);
            int parametro2 = Integer.parseInt(args[1]);

            // Chama o método para contar os números
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 1; i <= (parametro2 - parametro1); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}


//Execute o programa com os argumentos 12 e 30. O que acontece?

//java -cp bin desafio.Contador 12 30
