package br.com.uaijug.mercurio.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.uaijug.mercurio.model.domain.MailTO;
import br.com.uaijug.mercurio.service.SendMailService;

@RestController
public class MailSubmissionController {

	@Autowired
	private SendMailService sendMailService;

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/mail", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody MailTO mailTO) throws MessagingException {
		sendMailService.sendHtmlMail(mailTO);
	}
}
