public class Adapter extends Iphone implements TypeC {
    private static final int fullCharge = 100;
    @Override
    public void chargeTypeC(int percent) {
        chargeIphone();
        int time = fullCharge - percent;
        if(percent==100){
            System.out.println("ALready charged.");
        }else {
            System.out.println("The iPhone is charging for " + time + " minute until fully charged.");
        }


    }
}
