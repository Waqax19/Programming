package ObjectOrientation;

public class Message
{
    /*
    A constructor that takes the sender and recipient
• A method append that appends a line of text to the message body
• A method toString that makes the message into one long string like this: "From:­
Harry­Morgan\nTo:­Rudolf­Reindeer\n­.­.­
     */

    private String recipient;
    private String sender;

    private String message;

    public Message(String recipient, String sender)
    {
        this.recipient = recipient;
        this.sender = sender;
    }

    public void append(String message)
    {
        if(this.message == null)
        {
            this.message = message;
        }

        else
        {
            this.message += message;
        }

    }

    @Override
    public String toString()
    {
        return "From: " + sender + "\nTo : " + recipient +"\nMessage :\n " + message;
    }

    public static void main(String[] args)
    {
        Message myObj = new Message("Jacob" , "Joseph");
        myObj.append("Hello Jacob , how are you doing ?");
        myObj.append("Hope you are doing well");

        Message myObj2 = new Message("Jospeh" ,"Jacob");

        myObj2.append("Hello Joseph , i am fine , thanks for asking..");

        //print the result

        System.out.println("Message 1 : ");
        System.out.println(myObj);


        System.out.println("Message 2 : ");
        System.out.println(myObj2);
    }

}
