package com.example.to_do.controller;


import com.example.to_do.model.TarefaModel;
import com.example.to_do.service.TarefaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public List<TarefaModel> listarTodas(){
        return tarefaService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaModel> listarPorId(Long id){
        return tarefaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TarefaModel criarTarefa(@RequestBody TarefaModel tarefa){
        return tarefaService.salvar(tarefa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        if(tarefaService.buscarPorId(id).isPresent()){
            tarefaService.deletar(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/tarefa/{status}")
    public List<TarefaModel> listarPorStatus(@PathVariable String status){
        return tarefaService.listarPorStatus(status);
    }

    @GetMapping("/tarefa/{prioridade}")
    public List<TarefaModel> listarPorPrioridade(@PathVariable String prioridade){
        return tarefaService.listarPorPrioridade(prioridade);
    }

}
