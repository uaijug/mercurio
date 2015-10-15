package br.com.uaijug.mercurio.service;

import java.io.StringWriter;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.uaijug.mercurio.model.domain.MailSendLog;
import br.com.uaijug.mercurio.model.domain.MailTO;
import br.com.uaijug.mercurio.model.repository.MailSendLogRepository;

@Service
public class SendMailService {

	private static final Logger log = LoggerFactory.getLogger(SendMailService.class);

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private VelocityEngine velocityEngine;

	@Autowired
	private MailSendLogRepository mailSendLogRepository;

	public boolean sendHtmlMail(MailTO mailTO) throws MessagingException {
		boolean send = false;
		MimeMessage message = javaMailSender.createMimeMessage();
		mailTO.setTemplateName("emailtemplate.vm");
		message.setSubject("[\"UaiJUG\"] - Agradecimento.");
		MimeMessageHelper helper;
		helper = new MimeMessageHelper(message, true);
		helper.setFrom(mailTO.getFrom());
		helper.setTo(mailTO.getTo());

		StringWriter stringWriter = getMailTemplate(mailTO);
		helper.setText(stringWriter.toString(), true);
		javaMailSender.send(message);

		MailSendLog mailSendLog = mailSendLogRepository.save(new MailSendLog(mailTO.getFrom(), new Date()));
		if (mailSendLog != null) {
			log.info("Insert -> " + mailTO.toString());
			send = true;
		}
		return send;
	}

	private StringWriter getMailTemplate(MailTO mailTO) {
		Template template = velocityEngine.getTemplate("./templates/" + mailTO.getTemplateName());

		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("name", mailTO.getToName());
		velocityContext.put("email", mailTO.getTo());
		velocityContext.put("activeCode", mailTO.getActiveCode());

		velocityContext.put("event", mailTO.getEvent());
		velocityContext.put("form_link", mailTO.getFormLink());
		velocityContext.put("email_contact", mailTO.getEmailContact());
		velocityContext.put("link_facebook", mailTO.getLinkFacebook());
		velocityContext.put("link_twitter", mailTO.getLinkTwitter());
		velocityContext.put("link_googleplus", mailTO.getLinkGoogleplus());
		velocityContext.put("link_unsubscribe", mailTO.getLinkUnsubscribe());
		velocityContext.put("link_terms", mailTO.getLinkTerms());

		StringWriter stringWriter = new StringWriter();

		template.merge(velocityContext, stringWriter);
		return stringWriter;
	}
}
