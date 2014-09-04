


public class RoomDimension 
{

    private int length = 0;
    private int width = 0;

    public void roomLength(int length) 
    {
        this.length = length;
    }

    public void roomWidth(int width) 
    {
        this.width = width;
    }

    public int getArea() 
    {
        return length*width;
    }
    
    
    }
   