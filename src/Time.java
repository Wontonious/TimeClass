public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        }
        this.minute = minute;
        if (minute > 59) {
            this.minute=0;
            this.hour++;
        }
        if (minute < 0) {
            this.minute = 0;
        }
        this.second = second;
        for(int i=0;i<20;i++) {
            if (second > 59) {
                this.second = second - 60;
                second = second-60;
                this.minute++;
            }
            if(this.minute>59){
                this.minute = this.minute-60;
                this.hour++;
            }
            if(this.hour>23){
                this.hour=0;
            }
        }
        if (second < 0) {
            this.second = 0;
        }

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if(hour>23||hour<0){
            this.hour=0;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (minute > 59) {
            hour++;
            this.minute=0;
        }
        if (minute < 0) {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        this.second = second;
        if (second > 59) {
            this.minute++;
            this.second=0;
            if(this.minute>59){
                this.minute=0;
                this.hour++;
                if(this.hour>23){
                    this.hour=00;
                    this.minute=00;
                    this.second=00;
                }
            }
        }
    }
        public void setTime(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        public String toString () {
            return ""+this.hour + ":" + this.minute + ":" + this.second;
        }
        public Time nextSecond () {
            second++;
            if(second>59){
                this.second = 0;
                this.minute++;
                if(this.minute>59){
                    this.minute=0;
                    hour++;
                    if(hour>23){
                        hour=0;
                    }
                }
            }

            return new Time(this.hour, this.minute, this.second);
        }
        public Time previousSecond () {
            this.second--;
            if(this.second<0) {
                this.second = 0;
            }
            return new Time(this.hour, this.minute, this.second);
        }
    }

