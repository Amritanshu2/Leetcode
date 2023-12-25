class Solution {
    public boolean isValidSerialization(String pi) {
        String[] p = pi.split(",");
        int slots = 1;  // Available slots for children
        for (int i = 0; i < p.length; i++) {
            if (slots == 0) {
                return false;  // No more slots available for nodes
            }
            if (p[i].charAt(0) == '#') {
                slots--;  // Consume a slot for a leaf node
            } else {
                slots++;  // Create two slots for a non-leaf node
            }
        }
        return slots == 0;  // All slots should be consumed if valid
    }
}