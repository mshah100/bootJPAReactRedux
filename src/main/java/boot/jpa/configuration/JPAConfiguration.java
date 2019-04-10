package boot.jpa.configuration;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.katharsis.core.internal.boot.TransactionRunner;
import io.katharsis.jpa.JpaModule;
import io.katharsis.spring.jpa.SpringTransactionRunner;


@Configuration
public class JPAConfiguration {
	
	 	@Autowired
	    private EntityManager em;

	    @Autowired
	    private TransactionRunner transactionRunner;

	    @Bean
	    public SpringTransactionRunner transactionRunner() {
	        return new SpringTransactionRunner();
	    }

	    @Bean
	    public JpaModule jpaModule() {
	       final JpaModule module = JpaModule.newServerModule(em, transactionRunner);
	       return module;
	    }

}