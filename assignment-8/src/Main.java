public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        ChannelVisitor news = new NewsChannel();
        ChannelVisitor sports = new SportsChannel();
        ChannelVisitor music = new MusicChannel();

        System.out.println("Switching to News:");
        tv.accept(news);

        System.out.println("\nSwitching to Sports");
        tv.accept(sports);

        System.out.println("\nSwitching to Music");
        tv.accept(music);
    }
}