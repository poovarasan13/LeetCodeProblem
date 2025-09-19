class Spreadsheet {

    private int rows;
    private Map<String,Integer> map; 
    public Spreadsheet(int rows) {
          this.rows=rows;
        this.map=new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
      map.put(cell,value);
    }
    
    public void resetCell(String cell) {
        map.remove(cell);
    }
    
     public int getValue(String formula) {
        String[] parts = formula.substring(1).split("\\+");
        return get(parts[0]) + get(parts[1]);
    }

    private int get(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return map.getOrDefault(s, 0);
        }
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */