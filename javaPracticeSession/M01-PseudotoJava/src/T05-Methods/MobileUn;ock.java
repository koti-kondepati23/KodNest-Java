
class MobileUnlock {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.unlock(1234);
        m.unlock("abcd");
        Pattern p = new Pattern();
        Face f = new Face();
        Fingerprint fp = new Fingerprint();
        m.unlock(p);
        m.unlock(f);
        m.unlock(fp);
    }
}
