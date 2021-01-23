package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum () {
        theUsersList.add(new ForumUser(1, "John90", 'M',
                1990, 8, 17,33));
        theUsersList.add(new ForumUser(2, "Focus", 'M',
                2005, 9, 27,114));
        theUsersList.add(new ForumUser(3, "Aline94", 'F',
                1966, 11, 4,13));
        theUsersList.add(new ForumUser(4, "Catty4", 'F',
                1999, 4, 11,489));
        theUsersList.add(new ForumUser(5, "J4", 'F',
                2002, 1, 1,1));
        theUsersList.add(new ForumUser(6, "Joseph", 'M',
                1968, 3, 17,47));
        theUsersList.add(new ForumUser(7, "Kangooroo", 'M',
                1978, 7, 22,313));
        theUsersList.add(new ForumUser(8, "007FemaleAgent", 'F',
                2004, 10, 11,133));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUsersList);
    }

}
