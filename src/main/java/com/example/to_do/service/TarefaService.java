package com.example.to_do.service;

import com.example.to_do.model.StatusTarefa;
import com.example.to_do.model.TarefaModel;
import com.example.to_do.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository){
        this.tarefaRepository = tarefaRepository;
    }

    public List<TarefaModel> listarTodos(){
        return tarefaRepository.findAll();
    }

    public Optional<TarefaModel> buscarPorId(Long id){
        return tarefaRepository.findById(id);
    }

    public TarefaModel salvar(TarefaModel tarefa){
        return tarefaRepository.save(tarefa);
    }

    public void deletar(Long id){
        tarefaRepository.deleteById(id);
    }

    public List<TarefaModel> listarPorStatus(String status){
        return tarefaRepository.findByStatus(status.toUpperCase());
    }

    public List<TarefaModel> listarPorPrioridade(String prioridade){
        return tarefaRepository.findByPrioridade(prioridade.toUpperCase());
    }
}
