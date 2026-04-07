package com.prova.ProvaTalis.controllers;


import com.prova.ProvaTalis.models.ProdutoModel;
import com.prova.ProvaTalis.repositories.ProdutoRepository;
import com.prova.ProvaTalis.services.ProdutoService;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> listar(){
        return produtoService.listarProdutos();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> buscarPorId(@PathVariable Long id){
        return produtoService.buscarPeloId(id);
    }

    @PostMapping
    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return produtoService.criar(produtoModel);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(Long id, ProdutoModel produtoModel){
        return produtoService.atualizar(produtoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(Long id){
        produtoService.deletar(id);
    }
}
