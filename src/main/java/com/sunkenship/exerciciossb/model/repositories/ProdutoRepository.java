package com.sunkenship.exerciciossb.model.repositories;

import com.sunkenship.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
