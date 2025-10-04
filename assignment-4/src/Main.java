public class Main {
    public static void main(String[] args) {
        MP3 iPodJazz = new iPod(new Jazz());
        iPodJazz.play();

        MP3 SonyRock = new Sony(new Rock());
        SonyRock.play();

    }
}