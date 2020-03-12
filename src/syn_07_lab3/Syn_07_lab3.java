package syn_07_lab3;

public class Syn_07_lab3 {

    public static void main(String[] args) {
        Auto toyota = new Auto();
        toyota.setMark("toyota");
        toyota.setModel("mark II");
        System.out.println(toyota);
        Auto.Wheel twheel = toyota.new Wheel();
        twheel.left();
        System.out.println("");
        Auto mazda = new Auto("mazda", "323f");
        System.out.println(mazda);
        Auto.Wheel mwheel = toyota.new Wheel();
        mwheel.left();
    }

}
