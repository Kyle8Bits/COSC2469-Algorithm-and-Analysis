package W5;

public class p2SeparateChaining {
    public static void main(String[] args) {
        HashTableCollectionChaining collection = new HashTableCollectionChaining(10);

        RMITStudentNode stu1 = new RMITStudentNode(new RMITStudent("s3974876", "Mai Dang Khoa", "SSET", 3.7));
        RMITStudentNode stu2 = new RMITStudentNode(new RMITStudent("s4011796", "Dinh Pham Tuong Vy", "TBS", 3.9));
        RMITStudentNode stu3 = new RMITStudentNode(new RMITStudent("s3974523", "John", "SCD", 3.6));
        RMITStudentNode stu4 = new RMITStudentNode(new RMITStudent("s1234567", "Alice", "IT", 3.5));
        RMITStudentNode stu5 = new RMITStudentNode(new RMITStudent("s2345678", "Bob", "Engineering", 3.8));
        RMITStudentNode stu6 = new RMITStudentNode(new RMITStudent("s3456789", "Eve", "Business", 3.9));
        RMITStudentNode stu7 = new RMITStudentNode(new RMITStudent("s4567890", "Charlie", "Computer Science", 3.7));
        RMITStudentNode stu8 = new RMITStudentNode(new RMITStudent("s5678901", "Grace", "Mathematics", 3.6));
        RMITStudentNode stu9 = new RMITStudentNode(new RMITStudent("s6789012", "David", "Physics", 3.9));
        RMITStudentNode stu10 = new RMITStudentNode(new RMITStudent("s7890123", "Sophia", "Chemistry", 3.5));

        collection.put(stu1.data);
        collection.put(stu2.data);
        collection.put(stu3.data);
        collection.put(stu4.data);
        collection.put(stu5.data);
        collection.put(stu6.data);
        collection.put(stu7.data);
        collection.put(stu8.data);
        collection.put(stu9.data);
        collection.put(stu10.data);


        System.out.println("The student name with id s3974876: " + collection.get("s3974876").fullName);

        collection.displayCollection();

        System.out.println("After remove s3974876");

        collection.remove("s4011796");

        collection.displayCollection();
    }
}

class HashTableCollectionChaining {
    int N;
    RMITStudentLinkList[] hashtable;

    public HashTableCollectionChaining(int size){
        this.N = size;
        hashtable = new RMITStudentLinkList[N];
        for (int i = 0; i < N; i++) {
            hashtable[i] = new RMITStudentLinkList();
        } 
    }

    int hashCharacter(char c) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        return str.indexOf(c);
    }

    int hashString(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += hashCharacter(s.charAt(i));
        }
        return res % N;
    }

    boolean put(RMITStudent student){
        int hash = hashString(student.studentId);
        return hashtable[hash].insert(student);
    }
    
    RMITStudent get(String studentID){
        int index = hashString(studentID);

        if (hashtable[index] == null){
            return null;
        }
        else{
            RMITStudentNode current = hashtable[index].head;
            while(current != null){
                if(current.data.studentId.equals(studentID)){
                    return current.data;
                }
                current = current.next;
            }
            return null;
        }

    }

    boolean remove(String studentId){
        int index = hashString(studentId);

        if (hashtable[index] == null){
            return false;
        }
        else{
            RMITStudentNode current = hashtable[index].head;
            while(current != null){
                if(current.data.studentId.equals(studentId)){
                    hashtable[index].remove(current);
                }
                current = current.next;
            }
            return true;
        }
    }

    void displayCollection(){
        for (int i = 0; i < N; i++){
            if(hashtable[i].head == null){
                continue;
            }
            else{
                System.out.print("Table " + i +" : ");
                hashtable[i].displayList();
                System.out.print("\n");
            }
        }
    }

}

class RMITStudent {
    String studentId;
    String fullName;
    String major;
    double GPA;

    public RMITStudent(String studentId, String fullName, String major, double GPA) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return studentId + ", " + fullName;
    }
}
//===================================
class RMITStudentNode{
    RMITStudent data;
    RMITStudentNode next;

    public RMITStudentNode(RMITStudent student) {
        this.data = student;
        next = null;
    }
}

class RMITStudentLinkList {
    RMITStudentNode head;
    int size;

    RMITStudentLinkList() {
        head = null;
        size = 0;
    }

    public boolean insert(RMITStudent student) {
        if (head == null) {
            head = new RMITStudentNode(student);
            size = 1;
            return true;
        }
            RMITStudentNode parent = null;
            RMITStudentNode current = head;
        while (current != null) {
            if (current.data.studentId.equals(student.studentId)) {
                return false;
            }
            parent = current;
            current = current.next;
        }
        parent.next = new RMITStudentNode(student);
        size++;
        return true;  
    }

    void displayList(){
        RMITStudentNode current = head;
        while(current != null){
            System.out.print(current.data.fullName + " => ");
            current = current.next;
        }
    }

    public void remove(RMITStudentNode node) {
        // Case 1: If the list is empty
        if (head == null)
            return;

        // Case 2: If the node to be removed is the head node
        if (head == node) {
            head = head.next;
            return;
        }

        // Case 3: If the node to be removed is in the middle of the list
        RMITStudentNode current = head;
        RMITStudentNode prev = null;
        while (current != null && current != node) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
        }

        // Case 4: If the node to be removed is the last node (not handled explicitly)
    }
}