package Domain;

public class Student {

    private String name;
    private String id;
    private int age;
    private String birthday;

    public Student(String name, String id, int age, String birthday) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.birthday = birthday;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return "Student{name = " + name + ", id = " + id + ", age = " + age + ", birthday = " + birthday + "}";
    }
}
