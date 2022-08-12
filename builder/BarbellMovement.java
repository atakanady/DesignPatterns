package builder;

public class BarbellMovement{
    //gereklis
    private final String Barbell;
    
    //değişebilen
    private String BarbellPush;
    private String BarbellRow;
    
    public static class Builder{
    
        private String Barbell;
        private String BarbellPush;
        private String BarbellRow;
        
        public Builder (String Barbell){
            super();
            this.Barbell = Barbell;
        }
        public Builder BarbellGroup(String BarbellP){
        BarbellPush = BarbellP;
        return this;
        }
        public Builder BarbellGroupRow(String BarbellR){
        BarbellRow = BarbellR;
        return this;
        }
        public BarbellMovement build(){
            return new BarbellMovement(this);
        }
    
    }
    
    public BarbellMovement(Builder builder){
        Barbell = builder.Barbell;
        BarbellPush = builder.BarbellPush;
        BarbellRow = builder.BarbellRow;
    }


    @Override
    public String toString() {
        return "BarbellMovement [Barbell=" + Barbell + ", BarbellPush=" + BarbellPush + ", BarbellRow=" + BarbellRow
                + "]";
    }

    
    

    

}
