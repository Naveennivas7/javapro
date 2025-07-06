public class vehicle {
    public static void main(String[] args) {
        int vehicle=200;
        int wheels=540;
        int fourWheeler=((wheels-(2*vehicle))/2);
        int twoWheeler=vehicle-fourWheeler;
        System.out.println("twoWheeler = " + twoWheeler);
        System.out.println("fourWheeler = " + fourWheeler);
    }}