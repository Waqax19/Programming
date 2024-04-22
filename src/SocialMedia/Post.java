package SocialMedia;

import java.util.*;



public class Post {

    private int id;
    private Account author;
    private String message;
    private List<Account> endorsements;
    private List<Comment> comments;

    public Post(int id, Account author, String message) {
        this.id = id;
        this.author = author;
        this.message = message;
        this.endorsements = new ArrayList<>();
        this.comments = new ArrayList<>();
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

    public List<Comment> getComments() {
        return comments;
    }

    public void addEndorsement(Account account) {
        endorsements.add(account);
    }

    public void removeEndorsement(Account account) {
        endorsements.remove(account);
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Post ID: " + id + "\n");
        builder.append("Author: " + author.getHandle() + "\n");
        builder.append("Message: " + message + "\n");
        builder.append("Endorsements: " + endorsements.size() + "\n");
        builder.append("Comments: " + comments.size() + "\n");

        for (Comment comment : comments) {
            builder.append("Comment ID: " + comment.getId() + "\n");
            builder.append("Author: " + comment.getAuthor().getHandle() + "\n");
            builder.append("Message: " + comment.getMessage() + "\n");
            builder.append("Endorsements: " + comment.getEndorsements().size() + "\n");
            builder.append("Replies: " + comment.getReplies().size() + "\n");

            for (Comment reply : comment.getReplies()) {
                builder.append("Reply ID: " + reply.getId() + "\n");
                builder.append("Author: " + reply.getAuthor().getHandle() + "\n");
                builder.append("Message: " + reply.getMessage() + "\n");
                builder.append("Endorsements: " + reply.getEndorsements().size() + "\n");
            }
        }

        return builder.toString();
    }

    public Object getParent() {
        return null;
    }

    public boolean isActionable() {
        return true;
    }

    public void addAction(Account endorsement) {
        endorsements.add(endorsement);
    }

    public void addAction(Comment comment) {
        comments.add(comment);
    }

    public void delete() {
        for (Comment comment : comments) {
            comment.delete();
        }
    }

	public void addAction(Endorsement endorsement) {
		// TODO Auto-generated method stub
		
	}

}
