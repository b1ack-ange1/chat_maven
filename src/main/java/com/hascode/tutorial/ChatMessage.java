package com.hascode.tutorial;

import java.util.Date;

public class ChatMessage {
	private String message;
	private String sender;
	private String received;

	public final String getMessage() {
		return message;
	}

	public final void setMessage(final String message) {
		this.message = message;
	}

	public final String getSender() {
		return sender;
	}

	public final void setSender(final String sender) {
		this.sender = sender;
	}

	public final String getReceived() {
		return received;
	}

	public final void setReceived(final String received) {
		this.received = received;
	}

	@Override
	public String toString() {
		return "ChatMessage [message=" + message + ", sender=" + sender
				+ ", received=" + received + "]";
	}
}
