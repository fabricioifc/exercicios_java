package br.edu.ifc.poo.aula10.prova;

public class EntradaNaAgenda extends DataHora {

    private final String evento;

    public EntradaNaAgenda(int d, int m, int a, int hor, int min, int seg, String ev) {
//        super(d, m, a);
        super(d, m, a, hor, min, seg);
        evento = ev;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + super.toString() + " -> " + evento;
    }

    public static void main(String[] args) {
        EntradaNaAgenda agenda = new EntradaNaAgenda(23, 3, 2019, 10, 29, 20, "Criando tarefas em Java!");

        System.out.println(agenda.toString());
    }
}

class Data {

    private final int dia;
    private final int mes;
    private final int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

class Hora {

    private final int hora, minuto, segundo;

    public Hora(int h, int m, int s) {
        hora = h;
        minuto = m;
        segundo = s;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}

class DataHora extends Data {

    private final Hora hora;

    public DataHora(int d, int m, int a, int hor, int min, int seg) {
        super(d, m, a);
        hora = new Hora(hor, min, seg);
    }

    @Override
    public String toString() {
        return super.toString() + " " + hora.toString();
    }
}
