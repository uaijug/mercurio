package br.com.uaijug.mercurio.model.domain;

public class MailTO {
	private String toName;
	private String to;
	private String replyTo;
	private String from;
	private String subject;
	private String text;
	private String activeCode;
	private String templateName;
	private String contentType;

	private String event;
	private String formLink;
	private String emailContact;
	private String linkFacebook;
	private String linkTwitter;
	private String linkGoogleplus;
	private String linkUnsubscribe;
	private String linkTerms;

	public MailTO() {
		contentType = "text/html";
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public String getTo() {
		return to;
	}

	public String getFrom() {
		return from;
	}

	public String getSubject() {
		return subject;
	}

	public String getText() {
		return text;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getTemplateName() {
		return templateName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getFormLink() {
		return formLink;
	}

	public void setFormLink(String formLink) {
		this.formLink = formLink;
	}

	public String getEmailContact() {
		return emailContact;
	}

	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}

	public String getLinkFacebook() {
		return linkFacebook;
	}

	public void setLinkFacebook(String linkFacebook) {
		this.linkFacebook = linkFacebook;
	}

	public String getLinkTwitter() {
		return linkTwitter;
	}

	public void setLinkTwitter(String linkTwitter) {
		this.linkTwitter = linkTwitter;
	}

	public String getLinkGoogleplus() {
		return linkGoogleplus;
	}

	public void setLinkGoogleplus(String linkGoogleplus) {
		this.linkGoogleplus = linkGoogleplus;
	}

	public String getLinkUnsubscribe() {
		return linkUnsubscribe;
	}

	public void setLinkUnsubscribe(String linkUnsubscribe) {
		this.linkUnsubscribe = linkUnsubscribe;
	}

	public String getLinkTerms() {
		return linkTerms;
	}

	public void setLinkTerms(String linkTerms) {
		this.linkTerms = linkTerms;
	}

}
