public class Student {
    public int id;
    public String name;
    public int age;
    public String gender;

    public Student(int id1, String name1, int age1, String gender1) {
        id = id1;
        name = name1;
        age = age1;
        gender = gender1;


    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }


}


