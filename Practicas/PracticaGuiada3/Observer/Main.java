
public class Main {

    public static void main(String[] args) {
        //Observers
        YoutubeObserver keyloor = new YoutubeObserver();
        InstagramObserver rafa = new InstagramObserver();

        //Creamos los subjects 
        InstagramSubject instagramSubject = new InstagramSubject();
        YoutubeSubject youtubeSubject = new YoutubeSubject();

        //Guardamos los observers
        instagramSubject.addObserver(rafa);
        youtubeSubject.addObserver(keyloor);

        //Probamos
        instagramSubject.newReel("New reel uploaded.");
        youtubeSubject.newVideo("New video uploaded.");
    }

}
