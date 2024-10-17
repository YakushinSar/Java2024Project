package lesson9_1;

public class Person {

    public int age;

    //    доступен только в том классе где прописан из-за private
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // виден только в наследуемых классам, извне не виден
//        protected String name;
}
