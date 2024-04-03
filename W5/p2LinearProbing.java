package W5;

public class p2LinearProbing{
    public static void main(String[] args) {
        HashtableLinearProbing collection = new HashtableLinearProbing(15);

        RMITStudent stu1 = new RMITStudent("s3974876", "Mai Dang Khoa", "SSET", 3.7);
        RMITStudent stu2 = new RMITStudent("s4011796", "Dinh Pham Tuong Vy", "TBS", 3.9);
        RMITStudent stu3 = new RMITStudent("s3974523", "John", "SCD", 3.6);
        RMITStudent stu4 = new RMITStudent("s1234567", "Alice", "IT", 3.5);
        RMITStudent stu5 = new RMITStudent("s2345678", "Bob", "Engineering", 3.8);
        RMITStudent stu6 = new RMITStudent("s3456789", "Eve", "Business", 3.9);
        RMITStudent stu7 = new RMITStudent("s4567890", "Charlie", "Computer Science", 3.7);
        RMITStudent stu8 = new RMITStudent("s5678901", "Grace", "Mathematics", 3.6);
        RMITStudent stu9 = new RMITStudent("s6789012", "David", "Physics", 3.9);
        RMITStudent stu10 = new RMITStudent("s7890123", "Sophia", "Chemistry", 3.5);

        collection.put(stu1);
        collection.put(stu2);
        collection.put(stu3);
        collection.put(stu4);
        collection.put(stu5);
        collection.put(stu6);
        collection.put(stu7);
        collection.put(stu8);
        collection.put(stu9);
        collection.put(stu10);


        collection.displayCollection();
        System.out.println(collection.hashTable[1].fullName);
    }
}

class HashtableLinearProbing{
    int N;
    int size;
    RMITStudent[] hashTable;

    public int getSize(){
        return size;
    }

    public HashtableLinearProbing(int N){
        this.N = N;
        size = 0;
        hashTable = new RMITStudent[N];
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
        if (size == N){
            return false;
        }
        int hash = hashString(student.studentId);
        while (hashTable[hash] != null){
            hash = (hash + 1) % N;
        }
        hashTable[hash] = student;
        size++; 
        return true;
    }

    public void displayCollection(){
        for(int i = 0; i < N; i ++){
            System.out.print("Index " + i + " : ");
            System.out.println(hashTable[i] == null ? " null" : hashTable[i].toString());
        }
    }
}