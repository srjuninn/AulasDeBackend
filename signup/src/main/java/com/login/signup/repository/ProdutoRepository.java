package com.login.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.signup.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
