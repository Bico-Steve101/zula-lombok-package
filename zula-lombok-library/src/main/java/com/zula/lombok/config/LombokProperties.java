package com.zula.lombok.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zula.lombok")
public class LombokProperties {
    private boolean enabled = true;
    private boolean logging = true;

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public boolean isLogging() { return logging; }
    public void setLogging(boolean logging) { this.logging = logging; }
}