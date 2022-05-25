package com.bosonit.BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @Autowired
    SimpleProperties simpleProperties;
    @GetMapping("/valores")
    public String datosVariables(){
        String var1= simpleProperties.getVar1();
        String var2=Integer.toString(simpleProperties.getVar2());
        return("valor de var1 es:" + var1 + " valor de my.var2 es: " +var2);
    }

    @GetMapping("/var3")
    public String datosVariable3(){
        String var3= simpleProperties.getVar3();
        return("valor de var3 es: " + var3);
    }
}

