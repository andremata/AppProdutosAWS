package com.andremata.apiproduto.service;

import java.util.List;
import com.andremata.apiproduto.entity.Produto;

public interface ProdutoService {

	List<Produto> obterProdutos();
	
	Produto salvar(Produto produto);
	
	void deletar(Long id);
}
