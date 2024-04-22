package SocialMedia;

public class Endorsement {
    private Account account;
    private Post post;
    private int id;

    public Endorsement(Account account, Post post) {
        this.account = account;
        this.post = post;
        this.id = generateId();
    }

    private int generateId() {
		return id;
        // implementation to generate unique ID for each endorsement
    }

    public Account getAccount() {
        return account;
    }

    public Post getPost() {
        return post;
    }

    public int getId() {
        return id;
    }
}
