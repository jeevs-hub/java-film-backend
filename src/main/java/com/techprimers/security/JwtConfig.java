package com.techprimers.security;

import org.springframework.beans.factory.annotation.Value;

public class JwtConfig {
    @Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;
	
    public void setUri(String uri) {
        Uri = uri;
    }
    
    public String getUri() {
        return Uri;
    }
    
    public void setHeader(String header) {
        this.header = header;
    }
    
    public String getHeader() {
        return header;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public String getPrefix() {
        return prefix;
    }
    
    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }
    
    public int getExpiration() {
        return expiration;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }
    
    public String getSecret() {
        return secret;
    }
    
}
