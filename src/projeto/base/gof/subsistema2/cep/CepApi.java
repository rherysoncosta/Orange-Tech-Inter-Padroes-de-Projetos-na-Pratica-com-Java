package projeto.base.gof.subsistema2.cep;

import projeto.base.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi() {

        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep) {
        return "Goiania";

    }
    public String recuperarEstado(String cep) {
        return "Goias";

    }

}
