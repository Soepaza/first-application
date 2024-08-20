package com.api_vendinha.api.controle;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "Ola mundo";
    }

    @GetMapping("/media")
    public Float media(){
        Float nota1 = 7.3F;
        Float nota2 = 7.3F;
        Float nota3 = 7.3F;

        return (nota1+nota2+nota3)/3;

    }

    @GetMapping("/user/{id}")

    public Integer findUserById(@PathVariable("id") Integer id){

        return id;
    }

    @GetMapping("user-name")
    public String findUserByName(@RequestParam("name") String name){
        return name;
    }

    @GetMapping("/soma/{v1}/{v2}")
    public Integer soma(@PathVariable("v1") Integer v1,
                      @PathVariable ("v2") Integer v2
    ){
        Integer valor1 = v1;
        Integer valor2 = v2;
        return (valor1+valor2);
    }
}
