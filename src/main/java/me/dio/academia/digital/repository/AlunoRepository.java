package me.dio.academia.digital.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.controller.list;
import me.dio.academia.digital.entity.Aluno;
import net.bytebuddy.asm.Advice.Return;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    // @param dataDeNascimento: data de nascimento dos alunos
    // @Return lista com todos os alunos com a data de nascimento passada com
    // parametro da funcao
    List<Aluno> findByNascimento(LocalDate DataDeNascimento);
}
