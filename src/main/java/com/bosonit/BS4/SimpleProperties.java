package com.bosonit.BS4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my")
public class SimpleProperties {
    @Value("${VAR1:default_value}")
    private String var1;
    private Integer var2;
    @Value("${VAR3:var3 no tiene valor}")
    private String var3;

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public void setVar2(Integer var2) {
        this.var2 = var2;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }

    public String getVar1() {
        return var1;
    }

    public Integer getVar2() {
        return var2;
    }

    public String getVar3() {
        return var3;
    }
}
