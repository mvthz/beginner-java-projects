public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Informe dois números inteiros como argumentos.");
            return;
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if (num1 > num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            for (int i = num1; i <= num2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os parâmetros informados não são números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

