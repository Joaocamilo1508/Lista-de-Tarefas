package com.example.to_do.repository;

import com.example.to_do.model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {

    List<TarefaModel> findByStatus(String status);
    List<TarefaModel> findByPrioridade(String prioridade);
}
