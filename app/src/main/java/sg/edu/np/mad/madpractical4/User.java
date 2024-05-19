package sg.edu.np.mad.madpractical4;

public class User {
    public String name;
    public String description;
    public boolean followed;
    public User(String name, String description, boolean followed){
        this.name = name;
        this.description = description;
        this.followed = followed;
    }
    public String getName(){
        return name;
    }



    public String getDescription() {
        return description;
    }

    public boolean getFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

}
