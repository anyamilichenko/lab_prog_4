public enum Times {
    THEN("потом");
    private String name;
    Times(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";

    }
}