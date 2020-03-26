public class CleanCode {

}

class User {

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public boolean passwordMatched(String password) {
        return false;
    }
}

class Session {
}


class SessionService1 {

    public Session login(User user, String password) {
        if (user.getSession() != null) {
            return user.getSession();
        } else if (user.passwordMatched(password)) {
            Session session = new Session();
            user.setSession(session);
            return session;
        }
        return null;
    }
}


class SessionService2 {

    public boolean isLogin(User user) {
        return user.getSession() != null;
    }

    public void login(User user, String password) {
        if (user.passwordMatched(password)) {
            user.setSession(new Session());
        }
    }
}
