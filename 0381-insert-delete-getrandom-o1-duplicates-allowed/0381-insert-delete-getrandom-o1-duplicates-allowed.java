
class RandomizedCollection {

    private List<Integer> values;
    private Map<Integer, List<Integer>> indices;

    public RandomizedCollection() {
        values = new ArrayList<>();
        indices = new HashMap<>();
    }

    public boolean insert(int val) {
        boolean alreadyExists = indices.containsKey(val);

        if (!alreadyExists) {
            indices.put(val, new ArrayList<>());
        }

        indices.get(val).add(values.size());
        values.add(val);

        return !alreadyExists;
    }

    public boolean remove(int val) {
        if (indices.containsKey(val)) {
            List<Integer> valIndices = indices.get(val);
            int indexToRemove = valIndices.remove(valIndices.size() - 1);

            if (valIndices.isEmpty()) {
                indices.remove(val);
            }

            if (indexToRemove != values.size() - 1) {
                int lastValue = values.get(values.size() - 1);
                values.set(indexToRemove, lastValue);

                List<Integer> lastValueIndices = indices.get(lastValue);
                lastValueIndices.remove(lastValueIndices.indexOf(values.size() - 1));
                lastValueIndices.add(indexToRemove);
            }

            values.remove(values.size() - 1);
            return true;
        }

        return false;
    }

    public int getRandom() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(values.size());
        return values.get(randomIndex);
    }
}
