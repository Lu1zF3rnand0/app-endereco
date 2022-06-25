package br.edu.infnet.appendereco.client;

import br.edu.infnet.appendereco.model.domain.Municipio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados", name = "distritoClient")
public interface MunicipioClient {

    @GetMapping(value = "/{id}/municipios")
    List<Municipio> obterMunicipios(@PathVariable Integer id);
}
