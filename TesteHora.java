import java.util.Scanner;

public class TesteHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Hora com valores fornecidos pelo usuário
        System.out.print("Digite a hora do horário 1: ");
        int hora1 = scanner.nextInt();
        System.out.print("Digite os minutos do horário 1: ");
        int min1 = scanner.nextInt();
        System.out.print("Digite os segundos do horário 1: ");
        int seg1 = scanner.nextInt();

        Hora horario1 = new Hora(hora1, min1, seg1);
        System.out.println("Hora 1: " + horario1.getHora1());

        // Convertendo o valor do horário 1 para AM/PM e atribuindo ao horário 2
        int hora2 = horario1.getHor();
        if (hora2 >= 12) {
            hora2 = hora2 - 12;
        }
        System.out.println("Hora 2: " + formatoHora(hora2) + ":" + formatoHora(min1) + ":" + formatoHora(seg1) + " " + (horario1.getHor() >= 12 ? "AM" : "AM"));

        // Criando um objeto Hora com valores do horário 1 para o horário 3
        Hora horario3 = new Hora(horario1.getHor(), horario1.getMin(), horario1.getSeg());
        System.out.println("Hora 3: " + formatoHora(horario3.getHor()) + ":" + formatoHora(horario3.getMin()) + ":" + formatoHora(horario3.getSeg()) + " " + (horario3.getHor() >= 12 ? "PM" : "PM"));

        // Calculando os segundos do horário 1
        int segundosHorario1 = horario1.getSegundos();
        System.out.println("Segundos do horário 1: " + segundosHorario1);

        scanner.close();
    }

    private static String formatoHora(int valor) {
        if (valor < 10) {
            return "0" + valor;
        } else {
            return String.valueOf(valor);
        }
    }
}
