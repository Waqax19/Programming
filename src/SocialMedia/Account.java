package SocialMedia;

import java.util.Map;

public class Account {
    private int id;
    private String handle;

    public Account(int id, String handle) {
        this.id = id;
        this.handle = handle;
    }

    public Account(int nextAccountId, String handle2, String description) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return id;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Handle: " + handle;
    }

	public int getEndorsementPosts() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Map<Integer, Account> getEndorsements() {
		// TODO Auto-generated method stub
		return null;
	}

	public Post[] getPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	public void addPost(Post post) {
		// TODO Auto-generated method stub
		
	}

	public Post getPost(int id2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addEndorsement(Endorsement endorsement) {
		// TODO Auto-generated method stub
		
	}

	 void addComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	public int getOriginalPosts() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxEndorsedPost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
