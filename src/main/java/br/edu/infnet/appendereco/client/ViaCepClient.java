package br.edu.infnet.appendereco.client;

import br.edu.infnet.appendereco.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "viacep.com.br/ws", name = "viaCepClient")
public interface ViaCepClient {

    @GetMapping(value = "/{cep}/json/")
    Endereco obterPorCep(@PathVariable String cep);
}
