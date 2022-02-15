public class LogicalFun {
    public static void main(String [] args){
        boolean isRaining = false;
        boolean isWarm = true;
        
        boolean combined = isRaining && isWarm;
        System.out.println("Is it raining and warm?: " + combined);
        
        combined = isRaining || isWarm;
        System.out.println("Is it raining OR warm?: " + combined);
        
        combined = !isRaining;
        System.out.println("Is is NOT raining outside? :" + combined);
    } //end main
}

