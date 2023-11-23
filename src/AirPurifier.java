public class AirPurifier {
    public String model;
    public int price;
    public String colour;
    private boolean turnOn = false;
    private int fanspeed = 0;
    private int temperature = 0;

    public AirPurifier(String model, int price, String colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getFanspeed() {
        return fanspeed;
    }

    public void setFanspeed(int fanspeed) {
        if (turnOn == true) {
            if (fanspeed >= 1 && fanspeed <= 5) {
                this.fanspeed = fanspeed;
            } else if ((fanspeed % 5) == 1) {
                this.fanspeed = 1;
            } else if ((fanspeed % 5) == 2) {
                this.fanspeed = 2;
            } else if ((fanspeed % 5) == 3) {
                this.fanspeed = 3;
            } else if ((fanspeed % 5) == 4) {
                this.fanspeed = 4;
            } else if ((fanspeed % 5) == 0) {
                this.fanspeed = 5;
            }
        } else if (turnOn == false) {
            this.fanspeed = 0;
        }
    }

    @Override
    public String toString() {
        return "AirPurifier[" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", turnOn=" + turnOn +
                ", fanspeed=" + fanspeed +
                ", temperature=" + temperature +
                ']';
    }

    public boolean isTurnOn(boolean b) {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        if (turnOn == true) {
            this.turnOn = true;
            fanspeed = 3;
            temperature = 25;
        } else if (turnOn == false) {
            this.turnOn = false;
            fanspeed = 0;
            temperature = 0;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (turnOn == true) {
            if (temperature >= 15 && temperature <= 35) {
                this.temperature = temperature;
            } else if (temperature < 15) {
                this.temperature = 15;
            } else if (temperature > 35) {
                this.temperature = 35;
            }
        } else if (turnOn == false) {
            this.temperature = 0;
        }
    }

    public void manual() {
        System.out.println("This air conditioner can adjust the fan to 5 levels from 1-5");
        System.out.println("The highest temperature can be adjusted to 35 degrees and the lowest temperature can be adjusted to 15 degrees");
        System.out.println("If the temperature is adjusted more than 35 degrees, the system will set the temperature to 35 degrees");
        System.out.println("If the temperature is lower than 15 degrees, the system will set the temperature to 15 degrees");
    }
}
