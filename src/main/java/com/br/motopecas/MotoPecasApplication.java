package com.br.motopecas;

import com.br.motopecas.dto.CategoriaDTO;
import com.br.motopecas.dto.EstadoDTO;
import com.br.motopecas.service.CategoriaService;
import com.br.motopecas.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MotoPecasApplication implements CommandLineRunner {

    @Autowired
    private EstadoService estadoService;
    private CategoriaService  categoriaService;


    public static void main(String[] args) {
        SpringApplication.run(MotoPecasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*EstadoDTO dto = new EstadoDTO();
        dto.setNome("São Paulo");
        EstadoDTO dto2 = new EstadoDTO();
        dto2.setNome("Rio de Janeiro");

        estadoService.save(dto);
        estadoService.save(dto2);
*/
        CategoriaDTO dto = new CategoriaDTO();
        dto.setNome("Esportiva");
        CategoriaDTO dto2 = new CategoriaDTO();
        dto2.setNome("Fantasia");

        categoriaService.save(dto);
    }
}
