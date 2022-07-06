package br.edu.infnet.appendereco.model.service;

import br.edu.infnet.appendereco.client.EstadoClient;
import br.edu.infnet.appendereco.client.ViaCepClient;
import br.edu.infnet.appendereco.model.domain.Endereco;
import br.edu.infnet.appendereco.model.domain.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    EstadoClient estadoClient;

    public List<Estado> obterLista() {
        return estadoClient.obterEstados();
    }
}
