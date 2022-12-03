package proxy;


public class Main {
    public static void main(String[] args) {
        ProxyImage realImage = new ProxyImage("img.png");
        realImage.display();
    }
}