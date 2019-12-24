package chain_of_responsability;

public class YoutubeHandler implements HandlerVideo {
    HandlerVideo handlerVideo;
    @Override
    public void handler(Video v)
    {
        if(v.getLink().contains("youtube"))
            System.out.println("i can handle this Link:: "+v.getLink());
        else {
            System.err.println("i can't handle this Link");
            handlerVideo.handler(v);
        }

    }
    @Override
    public void setNextHandle(HandlerVideo handlerVideo) {
        this.handlerVideo=handlerVideo;
    }
}
