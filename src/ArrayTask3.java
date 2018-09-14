public class ArrayTask3 {
    public static void main(String[] args) {
        int count = 1;
        String[] strArray = new String[]
                {"Array for project", "Task for tests", "Project for work",
                        "Class with program", "Project for work", "Junior well done!",
                        "Junior well done", "Java learning", "New employee", "Experience well", "Newbie well ", "Junior well done"};
        for (int i = 0; i < strArray.length; i++) {
            for (int j = count; j < strArray.length; j++) {
                    if (strArray[i].equals(strArray[j]))
                        System.out.println("Duplicates: index [" + i + "] & [" + j + "] " + "(" + strArray[i] + ")");
                        //for ( int q = j + 1; q < strArray.length; q++) {
                        //if (strArray[i].equals(strArray[q])) {
                        //System.out.println("Duplicates: index [" + i + "] and index [" + q + "] " + "(" + strArray[i] + ")");
                    /*System.out.println("Duplicates: index[" + i + "] with value [" + strArray[i] +"] and index [" + j + "]
                     with value [" +strArray [j] + "]" );  */
                  }count = count + 1;
                }
            }
        }

