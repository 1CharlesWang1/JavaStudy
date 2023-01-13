package Demos.InnerClass_demo;

public class People {

    private int heartbeat=150;
    public class Heart{
        private int heartbeat=110;
        public void show(){
            int heartbeat=88;
            System.out.println(heartbeat);//88
            System.out.println(this.heartbeat);//110
            System.out.println(People.this.heartbeat);//150
        }
    }

}
