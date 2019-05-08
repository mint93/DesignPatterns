package structural.decorator.pattern;

import org.apache.commons.lang.StringEscapeUtils;

import structural.decorator.domain.Message;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml(msg.getContent());
	}

}
