public class Person {

    private boolean[][] plan;
    private int id;
    private boolean is_busy;
    private Task curTask = null;
    private int status = 0;

    public Person()
    {

    }

    public Person (int id) {
        this.plan = createWorkPlan();
        this.id = id;
        this.is_busy = false;
    }
    public int getId () {
        return id;
    }

    public boolean is_busy () {
        return is_busy;
    }

    public void work(Task task) {
        System.out.println("Сотрудник № " + id + "выполняет задачу № " + task.getNum());
        curTask = task;
        status = task.getHour()-1;
    }

    public void stopWork() {
        System.out.println("Выполнение работы приостановлено");
    }

    public void continueWork(Task task) {
        System.out.println("Сотрудник № " + id + "продолжает выполнение задачи  № " + task.getNum());
        status = status - 1;
    }

    public void finishWork() {
        System.out.println("finish my work");
    }

    public void printWorkPlan() {
        System.out.println("print work plan");
    }

    public void getWorkPlan() {
        System.out.println("get work plan");
    }

    public Task getCurTask(){
        return curTask;
    }

    private boolean[][]  createWorkPlan() {
        System.out.println("create work plan");
        boolean flag = true;
        boolean[][] plan = new boolean[7][12];
        int daylimit = 8, limit = 40;
        int dHours = 0, wHours = 0, random;
        while (flag) {
            plan = new boolean[7][12];
            for (int i = 0; i < 7; i++) {
                dHours = 0;
                for (int j = 0; j < 12; j++) {
                    random = (int) (Math.random() * 2);
                    if (random > 0){
                        plan[i][j] = true;
                        dHours++;
                        wHours++;
                    }
                    if (dHours == daylimit) break;
                    if (wHours == limit) break;
                }
                if (wHours == limit) break;
            }
            if (wHours == limit) {
                flag = false;
            } else {
                wHours = 0;
            }
        }
        return plan;
    }


}
