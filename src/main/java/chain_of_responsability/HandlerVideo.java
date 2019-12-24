package chain_of_responsability;

public interface HandlerVideo {

    public void handler(Video v);
    public void setNextHandle(HandlerVideo handlerVideo);
}
