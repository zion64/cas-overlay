package com.zeiv.authentication;

import org.jasig.cas.authentication.LdapAuthenticationHandler;
import org.ldaptive.auth.Authenticator;

public class EnhanceLdapAuthenticationhandle extends LdapAuthenticationHandler {

	public EnhanceLdapAuthenticationhandle(Authenticator authenticator) {
		super(authenticator);
	}
}
