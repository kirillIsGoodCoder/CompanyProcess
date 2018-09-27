public class Task {

    private int type;
    private int hour;
    private int priority;
    private int value;
    private int num;
    protected static int number = 0;

    public Task(int type, int hour, int priority, int value, int num) {
        this.type = type;
        this.hour = hour;
        this.priority = priority;
        this.value = value;
        this.num = num;
        number++;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Task.number = number;
    }

    private String strTaskType (int type)
    {
        String res = "";
        switch (type) {
            case 1:
                res = "писать код";
                break;
            case 2:
                res = "составить отчет";
                break;
            case 3:
                res = "тестировать программу";
                break;
            case 4:
                res = "нарисовать макет";
                break;
            case 5:
                res = "продавать услуги";
        }
        return res;
    }
    @Override
    public String toString() {
        return "Task number " + num + " {"+
                    "type= " + strTaskType(type) +
                    ", hours= " + hour +
                    ", priority= " + priority +
                    ", value= " + value +
                    "}";
    }

}
