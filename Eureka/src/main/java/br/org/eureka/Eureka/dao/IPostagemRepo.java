package br.org.eureka.Eureka.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.eureka.Eureka.model.Postagem;


public interface IPostagemRepo extends CrudRepository<Postagem, Integer> {

}
