package syn_07_lab3;

class Auto {

    class Wheel { //Вложенный класс

        public void right() {
            System.out.println("Руль справа");
        }

        public void left() {

            System.out.println("Руль слева");
        }
    }

    private String mark;
    private String model;

    public Auto() {
    }

    public Auto(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" + "mark=" + mark + ", model=" + model + '}';
    }
}
