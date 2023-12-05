public class SmartTv {
    
    // 1 - Ela tenha as características: ligada (boolean), canal (int) e volume (int)
    boolean turnedOn = false;
    int channel = 1;
    int volume = 25;

    // Criando métodos para manipulação dos estados
    // 2 - Nossa TV poderá ligar e desligar e assim mudar o estado ligada
    public void turnOn (){
        turnedOn = true;
    }
    public void turnOff (){
        turnedOn = false;
    }
    // 3 - Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
    public void increaseVolume (){
        volume++;
        System.out.println("Increasing the volume to: " + volume);
    }
    public void decreaseVolume (){
        volume--;
        System.out.println("Decreasing the volume to: " + volume);
    }
    // 4 - Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
    // necessário aplicar o parâmetro em changeChannel
    public void changeChannel(int newChannel ){
        channel = newChannel;
    }
    public void upChannel (){
        channel++;
    }
    public void downChannel (){
        channel--;
    }
}