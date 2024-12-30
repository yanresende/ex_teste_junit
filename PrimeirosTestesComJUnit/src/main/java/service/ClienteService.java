package main.java.service;

import main.java.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        // clienteDao = new ClienteDao();
        // clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso Salvar";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Sucesso Buscar";
    }

    public String excluir() {
        clienteDao.excluir();
        return "Sucesso Excluir";
    }

    public String atualizar() {
        clienteDao.atualizar();
        return "Sucesso Atualizar";
    }
}
