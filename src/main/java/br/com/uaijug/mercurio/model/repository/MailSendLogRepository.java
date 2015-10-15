package br.com.uaijug.mercurio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uaijug.mercurio.model.domain.MailSendLog;

public interface MailSendLogRepository extends JpaRepository<MailSendLog, Long> {

}
