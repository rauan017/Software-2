interface ChannelVisitor {
    void visit(TV tv);
}

class NewsChannel implements ChannelVisitor {
    @Override
    public void visit(TV tv) {
        System.out.println("TV shows: Breaking News on NewsChannel!");
    }
}

class SportsChannel implements ChannelVisitor {
    @Override
    public void visit(TV tv) {
        System.out.println("TV shows: Live Football Match on SportsChannel!");
    }
}

class MusicChannel implements ChannelVisitor {
    @Override
    public void visit(TV tv) {
        System.out.println("TV plays: Music Videos on MusicChannel!");
    }
}
