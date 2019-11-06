public class Person {
    private int num1;
    private int num2;

    private ExportStratergy stratergy;

    public Person(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setStratergy(ExportStratergy stratergy){
        this.stratergy =   stratergy ;
    }

    public int export(){
        return stratergy.export(num1,num2);
    }
}
