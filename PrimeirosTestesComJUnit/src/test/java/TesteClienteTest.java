package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");

        Assert.assertEquals("Rodrigo", cli.getNome());
    }
}
