public class Usuario {
    public static void main(String[] args) throws Exception {
        
        // Criando uma classe para ilustrar a interação dos métodos.
        SmartTv smartTv = new SmartTv();

        // Ver se a smartTv está ligada
        System.out.println("Is the TV on? " + smartTv.turnedOn);

        //Verificar em qual canal está sintonizada
        System.out.println("Current channel: " + smartTv.channel);

        // Consultar qual o volume
        System.out.println("Current volume: "+ smartTv.volume);

        // utilizando o método ligar
        smartTv.turnOn();

        System.out.println("News status: is the TV on? " + smartTv.turnedOn);

        // utilizando o método aumentar volume
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();

        System.out.println("Current Volume: "+ smartTv.volume);

        // mudando de canal através dos métodos

        System.out.println("Current channel: " + smartTv.channel);

        smartTv.changeChannel(23);

        System.out.println("Current channel: " + smartTv.channel);

        smartTv.upChannel();

        System.out.println("Current channel: " + smartTv.channel);
    }
}
