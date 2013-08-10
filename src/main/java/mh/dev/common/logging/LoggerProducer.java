package mh.dev.common.logging;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Injects a {@link Logger} into with {@link Inject} annotated attributes. <br>
 * Requires Context and Dependency Injection
 * 
 * @author Mathias Hauser
 * 
 */
public class LoggerProducer {

	/**
	 * Creates a {@link Logger} corresponding to the class in which the attribute is.
	 * 
	 * @param injectionPoint
	 * @return
	 */
	@Produces
	public Logger produceLogger(InjectionPoint injectionPoint) {
		return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
	}
}
