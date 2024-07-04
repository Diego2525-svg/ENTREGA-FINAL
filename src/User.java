import java.util.List;

public class User {
    private String name;
    private int age;
    private List<String> interests;
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    // Constructor
    public User(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        this.interests = interests;
    }

    public User(String name, int age, List<String> interests, List<String>friends) {
        this.name = name;
        this.age = age;
        this.interests = interests;
        this.friends= friends;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "Usuario{" +"Nombre='" + name + '\'' +", Edad=" + age +", intereses=" + interests +'}';
    }
}
