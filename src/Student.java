public class Student {
    private String name;
    private int age;
    private Content content;
    
    public Student(String name, int age, Content content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getContent() {

        return "Pergunta: " + content.getQuestion()+ "Resposta " + content.getAnswer();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setContent(Content content) {
        this.content = content;
    }
    
}
