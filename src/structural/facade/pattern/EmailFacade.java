package structural.facade.pattern;

import structural.facade.domain.email.Email;
import structural.facade.domain.mailer.Mailer;
import structural.facade.domain.order.Order;
import structural.facade.domain.stationery.Stationary;
import structural.facade.domain.stationery.StationaryFactory;
import structural.facade.domain.template.Template;
import structural.facade.domain.template.TemplateFactory;
import structural.facade.domain.template.Template.TemplateType;

//Facade provides simple methods for client to use
public class EmailFacade {
	
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
	
}
