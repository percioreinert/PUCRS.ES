package POO10;

public class Horario {

    // VARIÁVEIS DE INSTÂNCIA
    private int hora, minuto, segundo;

    // MÉTODOS DE INSTÂNCIA

    // Construtor
    public Horario(int h, int m, int s) {
        if (h >= 0 && h < 24) hora = h;
        else hora = 0;
        if (m >= 0 && m < 60) minuto = m;
        else minuto = 0;
        if (s >= 0 && s <60) segundo = s;
        else segundo = 0;
    }

    // Consulta dos valores atuais das variáveis de instância
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Modificação dos valores atuais das variáveis de instância
    public void setHora(int novaHora) {
        if (novaHora >= 0) hora = novaHora;
    }

    public void setMinuto(int novoMinuto) {
        if (novoMinuto >= 0) minuto = novoMinuto;
    }

    public void setSegundo(int novoSegundo) {
        if (novoSegundo >= 0) segundo = novoSegundo;
    }

    /**
     * Consulta de todos os valores atuais das variáveis de instância
     */
    public String toString() {
        return "A hora atual é " + hora + "h:" + minuto + "m:" + segundo + "s";
    }

    /**
     * Converte o horario atual para segundos
     *
     * @param h hora atual
     * @param m minuto atual
     * @param s atual
     */
    public int convertToSec(int h, int m, int s) {
        int soma = 0;
        soma += h * 3600;
        soma += m * 60;
        soma += s;
        System.out.println("A hora atual, em segundos, é: " + soma);
        return soma;
    }

    /**
     * Converte o horario atual para minutos
     *
     * @param h hora atual
     * @param m minuto atual
     */
    public void convertToMin(int h, int m) {
        int soma = 0;
        soma += h / 60;
        soma += m;
        System.out.println("A hora atual, em minutos, é: " + soma);
    }

    /**
     * Mostra o tempo restante para o dia acabar
     */
    public void timeToFinish() {
        int horaAtual = convertToSec(hora, minuto, segundo);
        int horaFinal = 24 * 3600;
        int difference = horaFinal - horaAtual;
        System.out.println("O tempo que falta até o fim do dia, em segundos, é " + difference);
    }

    /**
     * Atualiza o horario atual com base em um tempo informado em segundos
     *
     * @param seg horário atual em segundos
     */
    public void setNovoHorario (int seg) {
        hora = seg / 3600;
        int resto = seg % 3600;
        minuto = resto / 60;
        segundo = resto % 60;
    }

    /**
     * Calcula a diferença entre os horários de 2 objetos Horário
     *
     * @param h referencia o outro objeto
     */
    public void differenceBetween(Horario h) {
        int horaAtual = convertToSec(hora, minuto, segundo);
        int horaAtual2 = convertToSec(h.hora, h.minuto, h.segundo);
        if (horaAtual > horaAtual2) System.out.println("A diferença entre a hora atual e a hora do outro objeto é " + (horaAtual - horaAtual2));
        else System.out.println("A diferença entre a hora do outro objeto e a hora atual é " + (horaAtual2 - horaAtual));
    }
}