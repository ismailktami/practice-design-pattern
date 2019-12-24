package chain_of_responsability;

public class Main {


    public static void main(String[] args) {
        Video v=new Video("https://www.youtube.com/watch?v=rTWzswSVjbo&list=RD3egagRvougI&index=3");
        HandlerVideo handelr2=new FacebookHandler();
        HandlerVideo handelr1=new YoutubeHandler();
        HandlerVideo handelr3=new InstagramHandler();



        handelr2.setNextHandle(handelr3);
        handelr3.setNextHandle(handelr1);
        handelr1.setNextHandle(handelr2);
        handelr2.handler(v);
    }


}
