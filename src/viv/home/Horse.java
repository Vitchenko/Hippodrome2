package viv.home;



/**
 * Created by viv on 12.04.2017.
 */
public class Horse implements Comparable<Horse>{

    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move(){

        distance += speed*Math.random()*10;

    }
    public void print(){

        StringBuffer strDist=new StringBuffer();
        int distance=(int)Math.round(this.distance);

        for(int i=0;i<distance;i++){
            strDist.append(".");
        }
        System.out.println(strDist+this.getName());


    }

    @Override
    public int compareTo(Horse o) {
        return (int)Math.round(this.getDistance()-o.getDistance());
    }
}
