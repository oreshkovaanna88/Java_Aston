public class Main
{
    public static void main(String[] args)
 {
    Park park = new Park();
    Park.Attractions first_attraction = new Park.Attractions("Калипсо", "12:00-21:00", "5,50 руб.");
    System.out.println("Перечень аттракционов:");
    System.out.println(first_attraction.getName());
     System.out.println(first_attraction.getTimeOfWork());
     System.out.println(first_attraction.getCost());
}
}

public class Park {

    public static class Attractions {
        private String name;
        private String timeOfWork;
        private String cost;


        public Attractions(String name, String timeOfWork, String cost) {
            this.name = name;
            this.timeOfWork = timeOfWork;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }
        public String getTimeOfWork() {
            return timeOfWork;
        }
        public String getCost() {
            return cost;
        }
        public void setName (String name){
            this.name = name;
        }
        public void setTimeOfWork (String timeOfWork){
            this.timeOfWork = timeOfWork;
        }
        public void setCost (String cost){
            this.cost = cost;
        }
    }
}

