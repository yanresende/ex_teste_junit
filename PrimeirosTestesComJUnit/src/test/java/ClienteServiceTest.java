package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.dao.ClienteDao;
import main.java.dao.ClienteDaoMock;
import main.java.service.ClienteService;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso Salvar", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso Salvar", retorno);
    }

    @Test
    public void buscarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso Buscar", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso Buscar", retorno);
    }

    @Test
    public void excluirTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso Excluir", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso Excluir", retorno);
    }

    @Test
    public void atualizarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso Atualizar", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso Atualizar", retorno);
    }

}
