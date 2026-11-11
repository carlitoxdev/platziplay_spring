package com.platzi.play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de Peliculas PlatziPlay. 
            Usa menos de 120 caracteres y haslo con el estilo de Platzi.
            """)
    String generateGreeting(@V("plataform") String plataform);
}
