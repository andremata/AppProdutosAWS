package com.andremata.apiproduto.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.andremata.apiproduto.entity.Produto;
import com.andremata.apiproduto.repository.ProdutoRepository;
import com.andremata.apiproduto.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	private final ProdutoRepository produtoRepository;
	
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	@Override
	public List<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public void deletar(Long id) {
		try {
			produtoRepository.deleteById(id);
			
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao excluir o produto!");
		}
		
	}
}
