class TimeMap {

    private Map<String, List<Pair>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keyStore.containsKey(key)) {
            keyStore.put(key, new ArrayList<>());
        }

        List<Pair> values = keyStore.get(key);
        values.add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> values = keyStore.getOrDefault(key, new ArrayList<>());

        int low = 0;
        int high = values.size()-1;
        String result = "";

        while(low <= high) {
            int mid = (low+high)/2;
            if(values.get(mid).getKey() <= timestamp) {
                result = values.get(mid).getValue();
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    private static class Pair {
        private Integer key;
        private String value;

        public Pair(Integer key, String value) {
            this.key = key;
            this.value = value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
