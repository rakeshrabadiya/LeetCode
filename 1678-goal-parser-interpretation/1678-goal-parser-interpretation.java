class Solution {
    public String interpret(String command) {
        int n = command.length();
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}