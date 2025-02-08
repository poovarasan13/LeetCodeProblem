class NumberContainers {
      HashMap<Integer,PriorityQueue<Integer>> map;
    HashMap<Integer,Integer> indexmap;
    public NumberContainers() {
        map=new HashMap<>();
        indexmap=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indexmap.containsKey(index)){
            int num = indexmap.get(index);
            if(num == number){
                return ;
            }

            map.get(num).remove(index);
        }

        map.computeIfAbsent(number, k-> new PriorityQueue<>()).offer(index);
        indexmap.put(index, number);

    }
    
    public int find(int number) {
    PriorityQueue<Integer> pq = map.getOrDefault(number, new PriorityQueue<>());
        if(pq.size() == 0)
        {
            return -1;
        }
        return pq.peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */