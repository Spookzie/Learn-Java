public class Student extends Person 
{
    private int creditCount;

    
    public Student(String name, String address)
    {
        super(name, address);
        this.creditCount = 0;
    }
    

    public void Study() {   this.creditCount++; }


    @Override
    public String toString()
    {
        return super.toString() + "\n\tStudy credits " + this.creditCount;
    }
}
