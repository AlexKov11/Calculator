public enum Converter {
    I(1), IV(4), V(5), IX(9), X(10), L(50), C(100);
    private int arabToInt;
    Converter(int arabToInt){
        this.arabToInt = arabToInt;
    }

    public int getArabToInt() {
        return arabToInt;
    }
}
