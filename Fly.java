
public interface Fly {

	    void takeOff();

	    int descend(int meters);

	    int ascend(int meters);
	    
	    void land();
	    
	    default void glide() {
	        System.out.println("It glides into the air.");
	    }
	}

