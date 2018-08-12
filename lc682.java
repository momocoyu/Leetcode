class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int sum =0;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C"))
                sum -= stack.pop();
        
            else if(ops[i].equals("D")){
                sum+=2*stack.peek();
                stack.push(2*stack.peek());
            }
            
            else if(ops[i].equals("+")){
                int peek = stack.pop();
                int plus = stack.peek()+peek;
                sum += plus;
                stack.push(peek);
                stack.push(plus);
            }
            
            else{
                stack.push(Integer.valueOf(ops[i]));
                sum+=Integer.valueOf(ops[i]);
            }
                
        }
        return sum;
    }
}