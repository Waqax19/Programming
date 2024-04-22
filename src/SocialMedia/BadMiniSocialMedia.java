package SocialMedia;

import java.io.*;
import java.util.*;

public class BadMiniSocialMedia implements MiniSocialMediaPlatform {

    private static final long serialVersionUID = 1L;
	private Map<Integer, Account> accounts;
    private Map<Integer, Post> posts;
    private int nextAccountID;
    private int nextPostID;

    public BadMiniSocialMedia() {
        this.accounts = new HashMap<>();
        this.posts = new HashMap<>();
        this.nextAccountID = 1;
        this.nextPostID = 1;
    }

    @Override
    public int createAccount(String handle) throws IllegalHandleException, InvalidHandleException {
        if (handle == null || handle.isEmpty()) {
            throw new InvalidHandleException();
        }

        for (Account account : accounts.values()) {
            if (account.getHandle().equals(handle)) {
                throw new IllegalHandleException();
            }
        }

        int id = nextAccountID++;
        Account account = new Account(id, handle);
        accounts.put(id, account);

        return id;
    }

    @Override
    public void removeAccount(int id) throws AccountIDNotRecognisedException {
        Account account = accounts.get(id);
        if (account == null) {
            throw new AccountIDNotRecognisedException();
        }

        accounts.remove(id);
        for (Post post : posts.values()) {
            post.removeEndorsement(account);
        }
    }

    @Override
    public void changeAccountHandle(String oldHandle, String newHandle)
            throws HandleNotRecognisedException, IllegalHandleException, InvalidHandleException {
        if (newHandle == null || newHandle.isEmpty()) {
            throw new InvalidHandleException();
        }

        Account account = getAccountByHandle(oldHandle);
        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        for (Account otherAccount : accounts.values()) {
            if (otherAccount != account && otherAccount.getHandle().equals(newHandle)) {
                throw new IllegalHandleException();
            }
        }

        account.setHandle(newHandle);
    }

    @Override
    public String showAccount(String handle) throws HandleNotRecognisedException {
        Account account = getAccountByHandle(handle);
        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        return account.toString();
    }

    @Override
    public int createPost(String handle, String message) throws HandleNotRecognisedException, InvalidPostException {
        Account account = getAccountByHandle(handle);
        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        if (message == null || message.isEmpty()) {
            throw new InvalidPostException();
        }

        int id = nextPostID++;
        Post post = new Post(id, account, message);
        posts.put(id, post);

        return id;
    }

    @Override
    public int endorsePost(String handle, int id)
            throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException {
        Account account = getAccountByHandle(handle);
        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        Post post = getPostById(id);
        if (post == null) {
            throw new PostIDNotRecognisedException();
        }

        if (post.getAuthor() == account) {
            throw new NotActionablePostException();
        }

        int numEndorsements = post.getEndorsements().size();
        post.addEndorsement(account);

        return numEndorsements + 1;
    }

    @Override
    public int commentPost(String handle, int id, String message) throws HandleNotRecognisedException,
            PostIDNotRecognisedException, NotActionablePostException, InvalidPostException {

        Account account = getAccountByHandle(handle);
        Post post = getPostById(id);

        if (post.getAuthor() == account) {
            throw new NotActionablePostException();
        }

        Comment comment = new Comment(id, account, message, id, account, message, null, null);
        post.addComment(comment);

        return comment.getId();
    }

    private Account getAccountByHandle(String handle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public void deletePost(int id) throws PostIDNotRecognisedException {
        Post post = getPostById(id);
        List<Post> posts = new ArrayList<>();
     // add some posts to the list...

     Post postToRemove = posts.get(0);
     posts.remove(postToRemove); // Call removePost on the list object

    }

    @Override
    public String showIndividualPost(int id) throws PostIDNotRecognisedException {
        Post post = getPostById(id);
        return post.toString();
    }

    @Override
    public StringBuilder showPostChildrenDetails(int id)
            throws PostIDNotRecognisedException, NotActionablePostException {

        Post post = getPostById(id);
        StringBuilder builder = new StringBuilder();

        if (post instanceof Comment) {
            throw new NotActionablePostException();
        }

        builder.append("Post ID: " + post.getId() + "\n");
        builder.append("Author: " + post.getAuthor().getHandle() + "\n");
        builder.append("Message: " + post.getMessage() + "\n");
        builder.append("Endorsements: " + post.getEndorsements().size() + "\n");
        builder.append("Comments: " + post.getComments().size() + "\n");

        for (Comment comment : post.getComments()) {
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

        return builder;
    }

    private Post getPostById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public int getMostEndorsedPost() {
        int maxEndorsements = 0;
        Post mostEndorsedPost = null;

        for (Account account : accounts.values()) {
            for (Post post : account.getPosts()) {
                int numEndorsements = post.getEndorsements().size();
                if (numEndorsements > maxEndorsements) {
                    maxEndorsements = numEndorsements;
                    mostEndorsedPost = post;
                }
            }
        }

        return mostEndorsedPost.getId();
    }

    @Override
    public int getMostEndorsedAccount() {
        int maxEndorsements = 0;
        Account mostEndorsedAccount = null;

        for (Account account : accounts.values()) {
            int numEndorsements = account.getEndorsements().size();
            if (numEndorsements > maxEndorsements) {
                maxEndorsements = numEndorsements;
                mostEndorsedAccount = account;
            }
        }

        if (mostEndorsedAccount == null) {
            return 0;
        }

        return mostEndorsedAccount.getId();
    }
    @Override
    public void erasePlatform() {
    accounts.clear();
    posts.clear();
    }

    @Override
    public void savePlatform(String filename) throws IOException {
    FileOutputStream fileOut = new FileOutputStream(filename);
    ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
    objectOut.writeObject(accounts);
    objectOut.writeObject(posts);
    objectOut.close();
    fileOut.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void loadPlatform(String filename) throws IOException, ClassNotFoundException {
    FileInputStream fileIn = new FileInputStream(filename);
    ObjectInputStream objectIn = new ObjectInputStream(fileIn);
    accounts = (Map<Integer, Account>) objectIn.readObject();
    posts = (Map<Integer, Post>) objectIn.readObject();
    objectIn.close();
    fileIn.close();
    }
}
        	

