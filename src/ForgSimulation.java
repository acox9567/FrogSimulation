//Alexander Cox
//Monday, November 19, 2018

public class ForgSimulation {

    private int goalDistance;
    private int maxHops;

    public ForgSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        double neg = Math.random();
        int distance = (int)(Math.random() * 10);

        if (neg < .2)
            return (distance * -1);

        return  distance;
    }

    public boolean simulate()
    {
        int forgIndex = 0;
        int hopLength = 0;
        System.out.print("Goal : " + this.goalDistance + " Hops:  ");

        for (int h = 0; h < this.maxHops; h++)
        {
            hopLength = hopDistance();
            forgIndex += hopLength;
            System.out.print(hopLength + " ");

            if (forgIndex >=  this.goalDistance)
                return true;

            if (forgIndex < 0) {
                return false;
                System.out.print("    Failed Reached Negative Distance\n")
            }
        }

        return false;
    }

    public double runSimulations(int num)
    {
        double avg = 0;

        for (int i = 0; i < num; i++)
        {
            if (simulate())
                avg += 1;
        }

        return avg/num;
    }
}
