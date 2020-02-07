public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
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
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        for(int i=0;i<this.second+this.minute+this.hour;i++) {
            if (this.second > 59) {

                this.second = this.second - 60;
                this.minute++;
            }
            if (this.minute > 59) {
                this.minute = this.minute - 60;
                hour++;
            }
            if (this.hour > 23) {
                this.hour = 0;
                this.minute = 0;
                this.second = 0;
            }
        }
        String formatHour = String.format("%02d",this.hour);
        String formatMinute = String.format("%02d",this.minute);
        String formatSecond = String.format("%02d",this.second);
        return formatHour+":"+formatMinute+":"+formatSecond;
    }
    public Time nextSecond(){
        this.second++;
        return new Time(this.hour,this.minute,this.second);
    }
    public Time previousSecond() {
        this.second--;
        return new Time(this.hour, this.minute, this.second);
    }
}