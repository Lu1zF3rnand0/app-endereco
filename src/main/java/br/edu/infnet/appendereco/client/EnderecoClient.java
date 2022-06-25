package br.edu.infnet.appendereco.client;

import br.edu.infnet.appendereco.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "localhost:8080/api", name = "enderecoClient")
public interface EnderecoClient {

    @GetMapping(value = "/endereco")
    List<Endereco> obterLista();

    @PostMapping(value = "/endereco")
    void incluir(@RequestBody Endereco endereco);

    @DeleteMapping(value = "/endereco/{id}")
    void excluir(@PathVariable Integer id);

    @GetMapping(value = "/endereco/{cep}")
    Endereco obterPorCep(@PathVariable String cep);
}
