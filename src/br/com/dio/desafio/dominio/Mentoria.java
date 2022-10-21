package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

     private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO +20d;
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data.format(formatters) +
                '}';
    }
}
