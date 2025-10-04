interface Music {
    String getMusic();
}

class Jazz implements Music {
    @Override
    public String getMusic() {
        return "Jazz";
    }
}

class Rock implements Music {
    @Override
    public String getMusic() {
        return "Rock";
    }
}