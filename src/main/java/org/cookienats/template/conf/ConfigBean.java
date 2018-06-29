package org.cookienats.template.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties(prefix = "com.cookienats.template")
public class ConfigBean {
    private String name;
    private String value;
    private String randUuid;

    public String getRandUuid() {
        return randUuid;
    }

    public void setRandUuid(String randUuid) {
        this.randUuid = randUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
