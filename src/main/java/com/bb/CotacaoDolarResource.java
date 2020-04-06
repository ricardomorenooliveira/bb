package com.bb;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.bb.rest.client.service.CotacaoDolarService;

@Path("/cotacaoDolar")
@RegisterRestClient(configKey = "cotacao-api")
public class CotacaoDolarResource {

	@Inject
	@RestClient
	CotacaoDolarService cotacaoDolarService;
    
    @GET
    @Path("/comercial/dataCotacao/{dataCotacao}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCotacaoDolarComercial(@PathParam String dataCotacao) {
    	return cotacaoDolarService.getByDataCotacao(dataCotacao);
    }
    
}