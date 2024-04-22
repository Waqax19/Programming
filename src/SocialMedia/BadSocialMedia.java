package SocialMedia;

import java.io.*;
import java.util.*;

/**
 * BadSocialMedia is a minimally compiling, but non-functioning implementor of
 * the SocialMediaPlatform interface.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 */
public class BadSocialMedia implements SocialMediaPlatform {
    private static final long serialVersionUID = 1L;
	private Map<Integer, Account> accounts;
    private Map<Integer, Post> posts;
    private int nextAccountId;
    private int nextPostId;

    public BadSocialMedia() {
        accounts = new HashMap<>();
        posts = new HashMap<>();
        nextAccountId = 1;
        nextPostId = 1;
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

        Account account = new Account(nextAccountId, handle);
        accounts.put(nextAccountId, account);
        nextAccountId++;

        return account.getId();
    }

    @Override
    public int createAccount(String handle, String description)
            throws IllegalHandleException, InvalidHandleException {
        if (handle == null || handle.isEmpty()) {
            throw new InvalidHandleException();
        }

        for (Account account : accounts.values()) {
            if (account.getHandle().equals(handle)) {
                throw new IllegalHandleException();
            }
        }

        Account account = new Account(nextAccountId, handle, description);
        accounts.put(nextAccountId, account);
        nextAccountId++;

        return account.getId();
    }

    @Override
    public void removeAccount(int id) throws AccountIDNotRecognisedException {
        Account account = accounts.get(id);
        if (account == null) {
            throw new AccountIDNotRecognisedException();
        }

        for (Post post : posts.values()) {
            if (post.getAuthor() == account) {
                posts.remove(post.getId());
            }
            post.removeEndorsement(account);
        }

        accounts.remove(id);
    }

    @Override
    public void removeAccount(String handle) throws HandleNotRecognisedException {
        Account account = null;
        for (Account a : accounts.values()) {
            if (a.getHandle().equals(handle)) {
                account = a;
                break;
            }
        }

        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        try {
			removeAccount(account.getId());
		} catch (AccountIDNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void changeAccountHandle(String oldHandle, String newHandle)
            throws HandleNotRecognisedException, IllegalHandleException, InvalidHandleException {
        Account account = null;
        for (Account a : accounts.values()) {
            if (a.getHandle().equals(oldHandle)) {
                account = a;
                break;
            }
        }

        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        if (newHandle == null || newHandle.isEmpty()) {
            throw new InvalidHandleException();
        }

        for (Account a : accounts.values()) {
            if (a.getHandle().equals(newHandle)) {
                throw new IllegalHandleException();
            }
        }

        account.setHandle(newHandle);
    }

    @Override
    public void updateAccountDescription(String handle, String description) throws HandleNotRecognisedException {
    	Account account = null;
    	for (Account a : accounts.values()) {
    	if (a.getHandle().equals(handle)) {
    	account = a;
    	break;
    	}
    	}
        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        account.setDescription(description);
    }

    @Override
    public String showAccount(String handle) throws HandleNotRecognisedException {
        Account account = null;
        for (Account a : accounts.values()) {
            if (a.getHandle().equals(handle)) {
                account = a;
                break;
            }
        }

        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        return account.toString();
    }

    @Override
    public int createPost(String handle, String message) throws HandleNotRecognisedException, InvalidPostException {
        Account account = null;
        for (Account a : accounts.values()) {
            if (a.getHandle().equals(handle)) {
                account = a;
                break;
            }
        }

        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        Post post = new Post(nextAccountId, account, message);
        account.addPost(post);

        return post.getId();
    }

    @Override
    public int endorsePost(String handle, int id)
            throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException {
        Account account = null;
        for (Account a : accounts.values()) {
            if (a.getHandle().equals(handle)) {
                account = a;
                break;
            }
        }

        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        Post post = account.getPost(id);
        if (post == null) {
            throw new PostIDNotRecognisedException();
        }

        if (!post.isActionable()) {
            throw new NotActionablePostException();
        }

        Endorsement endorsement = new Endorsement(account, post);
        account.addEndorsement(endorsement);
        post.addAction(endorsement);

        return endorsement.getId();
    }

    @Override
    public int commentPost(String handle, int id, String message)
            throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException, InvalidPostException {
        Account account = null;
        for (Account a : accounts.values()) {
            if (a.getHandle().equals(handle)) {
                account = a;
                break;
            }
        }

        if (account == null) {
            throw new HandleNotRecognisedException();
        }

        Post post = account.getPost(id);
        if (post == null) {
            throw new PostIDNotRecognisedException();
        }

        if (!post.isActionable()) {
            throw new NotActionablePostException();
        }

        Comment comment = new Comment(account, post, message);
        account.addComment(comment);
        post.addAction(comment);

        return comment.getId();
    }

    @Override
    public void deletePost(int id) throws PostIDNotRecognisedException {
        Post post = null;
        for (Account account : accounts.values()) {
            post = account.getPost(id);
            if (post != null) {
                break;
            }
        }

        if (post == null) {
            throw new PostIDNotRecognisedException();
        }

        post.delete();
    }

    @Override
    public String showIndividualPost(int id) throws PostIDNotRecognisedException {
        Post post = null;
        for (Account account : accounts.values()) {
            post = account.getPost(id);
            if (post != null) {
                break;
            }
        }

        if (post == null) {
            throw new PostIDNotRecognisedException();
        }

        return post.toString();
    }
    

    @Override
    public int getTotalOriginalPosts() {
    int total = 0;
    for (Account account : accounts.values()) {
    total += account.getOriginalPosts();
    }
    return total;
    }

    @Override
    public int getTotalEndorsmentPosts() {
    int total = 0;
    for (Account account : accounts.values()) {
    total += account.getEndorsementPosts();
    }
    return total;
    }

    @Override
    public int getTotalCommentPosts() {
    int total = 0;
    for (Account account : accounts.values()) {
    total += account.getEndorsementPosts();
    }
    return total;
    }

    @Override
    public int getMostEndorsedPost() {
    int mostEndorsements = 0;
    int postId = 0;
    for (Account account : accounts.values()) {
    int maxEndorsements = account.getMaxEndorsedPost();
    if (maxEndorsements > mostEndorsements) {
    mostEndorsements = maxEndorsements;
    postId = account.getMaxEndorsedPost();
    }
    }
    return postId;
    }

    @Override
    public int getMostEndorsedAccount() {
    int mostEndorsements = 0;
    int accountId = 0;
    for (Account account : accounts.values()) {
    int endorsements = account.getEndorsementPosts();
    if (endorsements > mostEndorsements) {
    mostEndorsements = endorsements;
    accountId = account.getId();
    }
    }
    return accountId;
    }

    @Override
    public void erasePlatform() {
    accounts.clear();
    }

    @Override
    public void savePlatform(String filename) throws IOException {
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
    out.writeObject(accounts);
    }
    }

    @SuppressWarnings("unchecked")
	@Override
    public void loadPlatform(String filename) throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
    accounts = (HashMap<Integer, Account>) in.readObject();
    }
    }

	@Override
	public StringBuilder showPostChildrenDetails(int id)
			throws PostIDNotRecognisedException, NotActionablePostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}
    }

