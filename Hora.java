import java.util.Scanner;

//Aluno: Lucas Gomes dos Santos

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora() {
        setHor();
        setMin();
        setSeg();
    }

    public Hora(int h, int m, int s) {
        hora = h;
        min = m;
        seg = s;
    }

    public void setHor(int h) {
        if (h >= 0 && h <= 23) {
            hora = h;
        } else {
            System.out.println("Hora inválida. Digite novamente.");
            setHor();
        }
    }

    public void setMin(int m) {
        if (m >= 0 && m <= 59) {
            min = m;
        } else {
            System.out.println("Minutos inválidos. Digite novamente.");
            setMin();
        }
    }

    public void setSeg(int s) {
        if (s >= 0 && s <= 59) {
            seg = s;
        } else {
            System.out.println("Segundos inválidos. Digite novamente.");
            setSeg();
        }
    }

    public void setHor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int h = scanner.nextInt();
        setHor(h);
    }

    public void setMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os minutos: ");
        int m = scanner.nextInt();
        setMin(m);
    }

    public void setSeg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os segundos: ");
        int s = scanner.nextInt();
        setSeg(s);
    }

    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        return formatoHora(hora) + ":" + formatoHora(min) + ":" + formatoHora(seg);
    }

    public String getHora2() {
        String periodo = "AM";
        int horaFormatada = hora;
        if (hora == 0) {
            horaFormatada = 12;
        } else if (hora >= 12) {
            periodo = "PM";
            if (hora > 12) {
                horaFormatada = hora - 12;
            }
        }
        return formatoHora(horaFormatada) + ":" + formatoHora(min) + ":" + formatoHora(seg) + " " + periodo;
    }
    

    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }

    private String formatoHora(int valor) {
        return String.format("%02d", valor);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Hora

        // Criando um objeto Hora com valores fornecidos pelo usuário
        Hora horario1 = new Hora();
        System.out.println("Hora 1: " + horario1.getHora1());

        // Criando um objeto Hora com valores específicos
        Hora horario2 = new Hora(10, 30, 45);
        System.out.println("Hora 2: " + horario2.getHora2());

        // Alterando os valores do horário 2
        horario2.setHor(20);
        horario2.setMin(15);
        horario2.setSeg(0);
        System.out.println("Hora 2 atualizada: " + horario2.getHora2());

        // Obtendo a quantidade de segundos do horário 2
        int segundos = horario2.getSegundos();
        System.out.println("Segundos: " + segundos);
    }
}
