package br.com.uaijug.mercurio.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mail_send_log")
public class MailSendLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "send_time")
	private Date sendTime;

	public MailSendLog() {
		super();
	}
	
	public MailSendLog(String email, Date sendTime) {
		super();
		this.email = email;
		this.sendTime = sendTime;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	@Override
	public String toString() {
		return "MailSendLog [id=" + id + ", email=" + email + ", sendTime=" + sendTime + "]";
	}

}
