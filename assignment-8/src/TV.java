class TV {
    public void accept(ChannelVisitor visitor) {
        visitor.visit(this);
    }
}