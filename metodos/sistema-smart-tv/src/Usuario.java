public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada?" + smartTv.ligada);
        System.out.println("Canal atual?" + smartTv.canal);
        System.out.println("Volume atual?" + smartTv.volume);

        smartTv.ligar();;
        System.out.println ("Novo Staus -> Tv Ligada? "+ smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);
    }
}
