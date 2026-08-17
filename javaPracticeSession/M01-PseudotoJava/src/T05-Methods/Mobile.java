
class Mobile {

    void unlock(int number) {
        System.out.println("Unlocked using Numbers");
    }

    void unlock(String text) {
        System.out.println("Unlocked using Alphabets");
    }

    void unlock(Pattern p) {
        System.out.println("Unlocked using Pattern");
    }

    void unlock(Face f) {
        System.out.println("Unlocked using Face");
    }

    void unlock(Fingerprint fp) {
        System.out.println("Unlocked using FingerPrint");
    }
}

class Pattern {
}

class Face {
}

class Fingerprint {
}
