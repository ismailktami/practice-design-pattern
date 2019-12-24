package Flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> shapeMap=new HashMap<>();

    public static Shape getShape(String type){
        Shape s=null;

        if(type.equalsIgnoreCase("circle")){

            s=shapeMap.get("circle");
            if(s==null){
                s=new Circle();
                shapeMap.put("circle",s);

            }
        }
        else if(type.equalsIgnoreCase("rectangle")){
            s=shapeMap.get("rectangle");
            if(s==null){
                s=new Rectangle();
                shapeMap.put("rectangle",s);

        }

        }
        else{
            throw new RuntimeException("error type  of Shape");
        }
        return s;
    }

}
