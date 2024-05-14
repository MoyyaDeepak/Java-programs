abstract class Main{
    public String fname="Deepak";
    public int age=19;
    public abstract void study(); //abstract method
}

class Student extends Main{
    public int graduationYear=2019;
    public void study(){
        System.out.println("Studying all day long");
    }
}

class abstractmod{
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println("Name: "+st.fname);
        System.out.println("Age: "+st.age);
        System.out.println("Graduation Year: "+st.graduationYear);
        st.study();

    }
}