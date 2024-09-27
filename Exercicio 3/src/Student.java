public class Student extends Person{
    protected String program;
    protected int year;
    protected double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address); 

        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }
    
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Student[Person[name= " + name + ",adress= " + address +"],program= " + program + ",year= " + year + ",fee= "+ fee+ "]";
    }
}
