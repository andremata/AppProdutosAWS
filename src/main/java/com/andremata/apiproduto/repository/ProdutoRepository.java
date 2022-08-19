package com.andremata.apiproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.andremata.apiproduto.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}	
