package br.com.uaijug.mercurio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uaijug.mercurio.model.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByUsername(String username);
}
