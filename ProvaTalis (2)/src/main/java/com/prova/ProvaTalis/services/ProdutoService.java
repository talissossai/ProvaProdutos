package com.prova.ProvaTalis.services;


import com.prova.ProvaTalis.models.ProdutoModel;
import com.prova.ProvaTalis.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarPeloId(Long id){
        return produtoRepository.findById(id);
    }

    public ProdutoModel criar(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel atualizar(ProdutoModel produtoAtualizado){
        return produtoRepository.save(produtoAtualizado);
    }
    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }

}
