abstract class MP3 {
    protected Music music;

    public MP3(Music music) {
        this.music = music;
    }

    public abstract void play();
}

class iPod extends MP3 {
    public iPod(Music music) {
        super(music);
    }

    @Override
    public void play() {
        System.out.println("iPod playing " + music.getMusic() );
    }
}

class Sony extends MP3 {
    public Sony(Music music) {
        super(music);
    }

    @Override
    public void play() {
        System.out.println("Sony playing " + music.getMusic() );
    }
}