package offcieHours.Practice_05_17_2021;

public class Rectangle {

        double height;
        double width;
        double area;

        public void setDimensions (double recHeight, double recWidth ){
            height = recHeight;
            width = recWidth;
            area = height * width;
        }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }

    public double getArea(){
            area = height * width;
            return area;


        }
    }
