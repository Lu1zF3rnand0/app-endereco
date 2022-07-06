package br.edu.infnet.appendereco.model.service;

import br.edu.infnet.appendereco.client.MunicipioClient;
import br.edu.infnet.appendereco.model.domain.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioService {

    @Autowired
    MunicipioClient municipioClient;

    public List<Municipio> obterLista(Integer id) {
        return municipioClient.obterMunicipios(id);
    }
}
