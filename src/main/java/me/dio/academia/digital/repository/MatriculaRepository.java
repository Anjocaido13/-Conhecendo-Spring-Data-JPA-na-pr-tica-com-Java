package me.dio.academia.digital.repository;

import java.util.List;

import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository {

    List<Matricula> findByAlunoBairro(String bairro);
}
