package br.edu.infnet.appendereco.model.service;

import br.edu.infnet.appendereco.client.EnderecoClient;
import br.edu.infnet.appendereco.client.ViaCepClient;
import br.edu.infnet.appendereco.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class EnderecoService {
    @Autowired
    EnderecoClient enderecoClient;

    @Autowired
    ViaCepClient viaCepClient;

    public List<Endereco> obterLista() {
        return enderecoClient.obterLista();
    }

    public Endereco obterPorCep(String cep) {
        var endereco = viaCepClient.obterPorCep(cep);

        return Objects.requireNonNullElseGet(endereco, () -> new Endereco(cep));
    }

    public void incluir(Endereco endereco) {
        enderecoClient.incluir(endereco);
    }

    public void excluir(Integer id) {
        enderecoClient.excluir(id);
    }
}
