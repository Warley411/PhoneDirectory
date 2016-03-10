import java.io.IOException;

public class myDriver {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PhoneDirectory directory = new PhoneDirectory();
		directory.getNumber("Samson1");      //add to directory
		directory.changeEntry("Samson1", "4433659867");  //change directory
	}

}
