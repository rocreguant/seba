package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Task entity managed by Ebean
 */
@Entity
@Table(name="message")
public class Message extends Model{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int message_id;
	
    @Constraints.MaxLength(40)
    @Constraints.Required
    public String title;
    
    @Constraints.MaxLength(500)
    @Constraints.Required
    public String message;
    
    @OneToOne
    @Constraints.Required
    public User sender;
    
    @OneToOne
    @Constraints.Required
    public User receiver;
    
 // -- Queries

    public static Model.Finder<Integer,Message> find = new Model.Finder<Integer,Message>(Integer.class, Message.class);
    
    
    public Message(String title, String message, User sender, User receiver){
    	System.out.println("Csender "+sender+"\n Creceiver "+receiver+"\n");
    	this.title = title;
    	this.message = message;
    	this.sender = sender;
    	this.receiver = receiver;
    }
    
    /**
     * Finds Message by its id
     */
    public static Message findById(String _id) {
    	return find
    			.where()
    			.eq("t0.message_id", Integer.parseInt(_id))
    			.findUnique();

    }
    
    /**
     * Finds Messages by its receiver
     */
    public static List<Message> findByReceiver(User _receiver) {
		return find
    			.where()
    			.eq("t0.message_receiver", _receiver.name)
    			.findList();
    }
    
    /**
     * Finds Messages by its receiver
     */
    //http://localhost:9000/viewmessages?userids=Loremipsum&useridr=Dolorsit
    public static List<Message> findByUser(String sender, String receiver) {
    	List<Message> lm = find
    			.where()
    			.eq("t0.receiver_name", receiver)
    			.findList();
    	System.out.println("sender "+sender+"\n receiver "+receiver+"\n");
    	return lm;
/*    	for(int i =0; i <lm.size(); ++i){
    		//System.out.println("inside "+lm.get(i).sender);
    		if(lm.get(i).sender!= null && !lm.get(i).sender.name.equals(sender)){
    			lm.remove(i);
    		}
    	}
    	return lm;
*/
    }
}
