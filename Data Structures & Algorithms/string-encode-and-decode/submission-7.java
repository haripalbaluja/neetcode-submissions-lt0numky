class Solution {
    //private List<String> strs;

    public String encode(List<String> strs) {
        if(strs.isEmpty()) {
            return "";
        }
        List<Integer> sizes = new ArrayList<>();
        for(String str : strs) {
            sizes.add(str.length());
        }
        StringBuilder res = new StringBuilder();
        for(Integer size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for(String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;
        while(str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;

        for(int size : sizes) {
            result.add(str.substring(i,i+size));
            i += size;
        }
        return result;
    }
}
