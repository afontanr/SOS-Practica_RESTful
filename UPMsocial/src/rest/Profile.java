package rest;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


public class Profile {
	private User user;
	private Status lastStatus;
	private int friendsNumber;
	private ArrayList<Status> friendStatus;
	
	public Profile() {
        this.friendStatus = new ArrayList<Status>();
    }
	
	@XmlAttribute(required=false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(Status lastStatus) {
        this.lastStatus = lastStatus;
    }
    
    public int getFriendsNumber() {
        return friendsNumber;
    }

    public void setFriendsNumber(int friendsNumber) {
        this.friendsNumber = friendsNumber;
    }
    

    @XmlElementWrapper(name="friendsStatus")
    @XmlElement(name="status") 
    //@XmlTransient
    public ArrayList<Status> getFriendStatus() {
        return friendStatus;
    }

    public void setFriendStatus(ArrayList<Status> friendStatus) {
        this.friendStatus = friendStatus;
    }
    
    public Profile(User user, Status lastStatus, int friendsNumber) {
        super();
        this.user = user;
        this.lastStatus = lastStatus;
        this.friendsNumber = friendsNumber;
        this.friendStatus = new ArrayList<Status>();
    }
}
