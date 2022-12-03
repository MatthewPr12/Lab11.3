package proxy;

public class ProxyImage implements MyImage{
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(this.filename);
        }
        realImage.display();
    }
}
