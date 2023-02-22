public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

        private Holder() {
            super();
        }

        public static SingletonLazyHolder getInstancia() {
            return Holder.instancia;
        }
    }
}
