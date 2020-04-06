package com.bb.rest.client.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "cotacao-api")
public interface CotacaoDolarService {
	@GET
	@Path("CotacaoDolarDia(dataCotacao='04-01-2020')")
    @Consumes(MediaType.APPLICATION_JSON)
	Response getByDataCotacao(@Context String dataCotacao);
}
