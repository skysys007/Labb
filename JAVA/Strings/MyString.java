class MyString {
    char[] ch;
    
    MyString(String st) {
        ch = st.toCharArray();   
    }

    int length() {
        int count = 0;
        for (char c : ch) {
            count++;
        }
        return count;
    }

    void replace(char oldChar, char newChar) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == oldChar) {
                ch[i] = newChar;
            }
        }
    }


    char[] trim() {
        int start = 0;
        int end = ch.length - 1;

        while (start <= end && ch[start] == ' ') {
            start++;
        }

        while (end >= start && ch[end] == ' ') {
            end--;
        }

        char[] result = new char[end - start + 1];
        int j = 0;

        for (int i = start; i <= end; i++) {
            result[j++] = ch[i];
        }

        return result;
    }

    void display() {
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();
    }
}