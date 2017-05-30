package com.ejemplo.json.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

import com.ejemplo.json.model.Programa;

public class JacksonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programa programa = new Programa();
		programa.setCodigo(2452);
		programa.setNombre("Java Architec Application  Developer");
		programa.setModulos(new ArrayList<String>(){
			{add("Fundamentos de comunicacion");
			add("Arquitectura de web services");
			}
		});
		programa.setFechaInicio(new Date());
		programa.setFechaFin(new Date());
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.configure(Feature.INDENT_OUTPUT, true);
			//mapper.writeValue(new File, value);
			System.out.println(mapper.writeValueAsString(programa));
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		}
		catch (JsonMappingException ex) {
			ex.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
