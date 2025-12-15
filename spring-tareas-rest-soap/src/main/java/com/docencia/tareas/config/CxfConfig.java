package com.docencia.tareas.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.docencia.tareas.soap.AlumnoSoapService;
import com.docencia.tareas.soap.TareaSoapService;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    private final Bus bus;
    private final TareaSoapService tareaSoapEndpoint;
    private final AlumnoSoapService alumnoSoapService;

    public CxfConfig(Bus bus, TareaSoapService tareaSoapEndpoint,AlumnoSoapService alumnoSoapService) {
        this.bus = bus;
        this.tareaSoapEndpoint = tareaSoapEndpoint;
        this.alumnoSoapService = alumnoSoapService;
    }
    
=======

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.docencia.tareas.soap.ITareaSoapEndpoint;

import jakarta.xml.ws.Endpoint;


@Configuration
public class CxfConfig {

    private final Bus bus;
    private final ITareaSoapEndpoint tareaSoapEndpoint;

    public CxfConfig(Bus bus, ITareaSoapEndpoint tareaSoapEndpoint) {
        this.bus = bus;
        this.tareaSoapEndpoint = tareaSoapEndpoint;
    }

>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
    @Bean
    public Endpoint tareaEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, tareaSoapEndpoint);
        endpoint.publish("/tareas");
        return endpoint;
    }
<<<<<<< HEAD

    @Bean
    public Endpoint alumnoEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, alumnoSoapService);
        endpoint.publish("/alumnos");
        return endpoint;
    }
}
=======
}
>>>>>>> a2f869cb6a9fb532c7c471e4a91b93055d80e409
