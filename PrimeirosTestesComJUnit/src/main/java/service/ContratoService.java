package main.java.service;

import main.java.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso Salvar";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso Buscar";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso Excluir";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso Atualizar";
    }

}
