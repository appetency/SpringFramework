package config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {
}
/*
AbstractSecurityWebApplicationInitializer实现了WebApplication-Initializer，
        因此Spring会发现它，并用它在Web容器中注册
        DelegatingFilterProxy。尽管我们可以重载它的appendFilters()
        或insertFilters()方法来注册自己选择的Filter，但是要注册
        DelegatingFilterProxy的话，我们并不需要重载任何方法。*/
