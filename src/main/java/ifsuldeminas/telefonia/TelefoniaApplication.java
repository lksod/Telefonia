package ifsuldeminas.telefonia;

import ifsuldeminas.telefonia.model.entity.telefonia.comercial.Celular;
import ifsuldeminas.telefonia.model.entity.telefonia.comercial.Plano;
import ifsuldeminas.telefonia.model.entity.telefonia.pessoal.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class TelefoniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelefoniaApplication.class, args);
	}

}

