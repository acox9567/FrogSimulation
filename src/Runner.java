//Alexander Cox
//Monday, November 19, 2018

public class Runner {

    public static void main(String[] args)
    {
        ForgSimulation forg1 = new ForgSimulation(30, 5);
        ForgSimulation forg2 = new ForgSimulation(50, 10);
        ForgSimulation forg3 = new ForgSimulation(15, 2);

        System.out.println("Forg 1 Success Rate: " + forg1.runSimulations(5));
        System.out.println("Forg 2 Success Rate: " + forg2.runSimulations(5));
        System.out.println("Forg 3 Success Rate: " + forg3.runSimulations(5));
    }
}
