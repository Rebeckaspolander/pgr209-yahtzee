public enum Value {
    NUMBER_1, NUMBER_3, NUMBER_4, NUMBER_5;

    public int toIntegerValue(){
        return switch(this){
            case NUMBER_1 -> 1;
            case NUMBER_3 -> 3;
            case NUMBER_4 -> 4;
            case NUMBER_5 -> 5;
        };
    }

}
