public class App {
    public static void main(String[] args) throws Exception {

        Content math = new Content("Quanto eh 2 + 2?", "4");

        Student student1 = new Student("Manuel", 26, math);
        
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getContent());
    }
}
