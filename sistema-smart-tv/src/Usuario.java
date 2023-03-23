public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();

        System.out.println("Tv ligada? " + SmartTv.ligada);
        System.out.println("Canal atual? " + SmartTv.canal);
        System.out.println("Volume atual? " + SmartTv.volume);

        SmartTv.ligar();
        System.out.println("Novo status: Tv ligada? " + SmartTv.ligada);
        
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();

        SmartTv.mudarCanal(14);
        System.out.println("Canal atualizado: " +SmartTv.canal);

    }
}
