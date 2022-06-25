package br.edu.infnet.appendereco.client;

import br.edu.infnet.appendereco.model.domain.Endereco;
import br.edu.infnet.appendereco.model.domain.Estado;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades", name = "estadoClient")
public interface EstadoClient {

    @GetMapping(value = "/estados")
    List<Estado> obterEstados();
}