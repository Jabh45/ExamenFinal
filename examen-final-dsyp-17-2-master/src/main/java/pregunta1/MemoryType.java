package pregunta1;

public enum MemoryType {
    DDR3 {
        public String toString() {
            return "DDR3";
        }
    },

    LPDDR3 {
        public String toString() {
            return "LPDDR3";
        }
    }
}
