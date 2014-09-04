



public class RoomCarpet 
{
    private RoomDimension thisRoomDimension;
           
    final int carpetCost = 8;

    public void setRoomDimension(RoomDimension thisroomdimension) 
    {
        this.thisRoomDimension = thisroomdimension;
        
    }
   
    public int getAmount()
    {
        
        return thisRoomDimension.getArea()* carpetCost;
        
    }


}
