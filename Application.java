public class Application {
    public static void main(String[] args) {

        Personagem Antonio = new Personagem();
        Antonio.setName("Antonio Carlos Cajueiro de Campos Bisneto");
        Antonio.setLevel(1);
        System.out.println(Antonio);
        Antonio.levelUp(10);
        System.out.println(Antonio);
        
    }
}
