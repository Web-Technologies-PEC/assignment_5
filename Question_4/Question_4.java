package Question_4;

public class Question_4 {
    static int var = 20;

    Question_4() {
        var++;
    }

    void m1() {
        var++;
        System.out.println(var);
    }

    public static void main(String[] args) {
        Question_4 obj = new Question_4();
        Question_4 obj2 = new Question_4();
        Question_4 obj3 = new Question_4();
        obj3.m1();
    }
}

// YES the output will be 24 as 'var' is a static variable so each time an
// object is crated
// the constructor is called and as static variables are properties of class and
// not the object
// it is not set to 20 each time but is incremented from its previous value
// hence it is incremented
// by a total of 4 times.