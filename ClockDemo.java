import java.util.Scanner;

class Clock{
	private int hours = 0, minutes = 0, seconds = 0;
	public String error="";
	
	public Clock(){
		hours=12;
		minutes=0;
		seconds=0;
	}
	public Clock(int h, int m, int s){
		hours=h;
		minutes=m;
		seconds=s;
	}
	public Clock(int second){
		int h,m,s,t;
		
		h=second/3600;
		t=second%3600;
		m=t/60;
		s=second%60;
		hours=h;
		minutes=m;
		seconds=s;
	
}
public void setClock(int seconds){
		int t;
		
		hours=seconds/3600;
		t=seconds%3600;
		minutes=t/60;
		seconds=t%60;
		
}
public int getHours(){
	return hours;
}
public int getMinutes(){
	return minutes;
}
public int getSeconds(){
	return seconds;
}
public void setHours(int h){
	hours=h;
}
public void setMinutes(int m){
	minutes=m;
}
public void setSecond(int s){
	seconds=s;
}
public void tick(){
	seconds++;
	if(seconds>59) {
		minutes++;
		seconds=seconds-60;
	}
	if(minutes>59) {
		hours++;
		minutes=minutes-60;
	}
	
}
public void tickDown(){
	seconds--;
	if(seconds<0) {
		minutes--;
		seconds=60+seconds;
	}
	if(minutes<0) {
		hours--;
		minutes=60+minutes;
	}
	if(hours<0) {
		error="Error";
	}
}
public void addClock(Clock c){
	seconds=seconds+c.getSeconds();
	minutes=minutes+c.getMinutes();
	hours=hours+c.getHours();
	if(seconds>59) {
		minutes++;
		seconds=seconds-60;
	}
	if(minutes>59) {
		hours++;
		minutes=minutes-60;
	}
	
	
}
public Clock subtractClock(Clock c){
	Clock clock=new Clock(0);
	clock.seconds=seconds-c.getSeconds();
	clock.minutes=minutes-c.getMinutes();
	clock.hours=hours-c.getHours();
	
	if(clock.seconds<0) {
		clock.minutes--;
		clock.seconds=60+clock.seconds;
	}
	if(clock.minutes<0) {
		clock.hours--;
		clock.minutes=60+clock.minutes;
	}
	if(clock.hours<0) {
		error="Error";
		clock.error="Error";
	}
	return clock;
	
	
}
public void printTime(){
	if(!error.equals("Error")) {
	System.out.println("Hour : " + hours + "    Minute : " + minutes +"    Second : " + seconds + "\n");
	}
	else {
		System.out.println("Time Error");
	}
}
}
class ClockDemo{
	public static void main(String a[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first clock to how much seconds since midnight obtained : ");
		int x=scanner.nextInt();
		Clock firstClock=new Clock(x);
		System.out.println("First Clock Created");
		System.out.print("First Clock Time : ");
		firstClock.printTime();
		for(int i=0; i<10; i++) {
			firstClock.tick();
			firstClock.printTime();
			if(i==9) {
				System.out.println("-----------------------------------------");
			}
		}
		System.out.print("Enter Hour : " );
		int h=scanner.nextInt();
		System.out.print("Enter Minute : " );
		int m=scanner.nextInt();
		System.out.print("Enter Second : " );
		int s=scanner.nextInt();
		Clock secondClock=new Clock(h,m,s);
		System.out.println("Second Clock Created");
		System.out.print("Second Clock Time : ");
		secondClock.printTime();
		for(int i=0; i<10; i++) {
			secondClock.tick();
			secondClock.printTime();
			
			if(i==9) {
				System.out.println("-----------------------------------------");
			}
		}
		System.out.println("Second Clock add to first Clock.....");
		firstClock.addClock(secondClock);
		System.out.print("First clock + second clock : "); 
		firstClock.printTime();
		System.out.println("---------------------------------------------------");
		System.out.println("first clock - second clock = Save to third Clock : ");
		Clock thirdClock=new Clock(0);
		thirdClock=firstClock.subtractClock(secondClock);
		thirdClock.printTime();
		scanner.close();
	}
}