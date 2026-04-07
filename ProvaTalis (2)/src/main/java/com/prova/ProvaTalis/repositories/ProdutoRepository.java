package com.prova.ProvaTalis.repositories;

import com.prova.ProvaTalis.models.ProdutoModel;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
