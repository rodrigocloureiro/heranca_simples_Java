public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao();
        Gato gato = new Gato();

        System.out.println("Área do leão");
        System.out.println(leao.respirar());
        System.out.println(leao.comer());
        System.out.println(leao.rugir());

        System.out.println("\nÁrea do gato");
        System.out.println(gato.respirar());
        System.out.println(gato.comer());
        System.out.println(gato.ronronar());
    }
}
