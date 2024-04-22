package SocialMedia;

import java.util.ArrayList;
import java.util.List;

public class Comment extends Post {

    private static int nextID = 1;

    private static int id;
    private Account author;
    private String message;
    private List<Account> endorsements;
    private List<Comment> replies;

   

    public Comment(int id, Account author, String message, int id2, Account author2, String message2,
			List<Account> endorsements, List<Comment> replies) {
		super(id, author, message);
		id = id2;
		author = author2;
		message = message2;
		this.endorsements = endorsements;
		this.replies = replies;
	}
	public Comment(Account account, Post post, String message2) {
		super(id, account, message2);
	}

	public int getId() {
        return id;
    }

    public Account getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public List<Account> getEndorsements() {
        return endorsements;
    }

    public List<Comment> getReplies() {
        return replies;
    }

    public void addEndorsement(Account account) {
        endorsements.add(account);
    }

    public void addReply(Comment reply) {
        replies.add(reply);
    }

    public void removeEndorsement(Account account) {
        endorsements.remove(account);
    }

    public void removeReply(Comment reply) {
        replies.remove(reply);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Comment ID: " + id + "\n");
        builder.append("Author: " + author.getHandle() + "\n");
        builder.append("Message: " + message + "\n");
        builder.append("Endorsements: " + endorsements.size() + "\n");
        builder.append("Replies: " + replies.size() + "\n");

        for (Comment reply : replies) {
            builder.append(reply.toString());
        }

        return builder.toString();
    }
}
