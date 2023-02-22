public class Test {

    public static void main(String[] args) {

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Joao", "03009000");


    }

}
