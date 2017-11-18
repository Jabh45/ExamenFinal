package pregunta1;

public enum MemorySpeed {
    Fast {
        public String toString() {
            return "1400MHz";
        }
    },

    Turbo {
        public String toString() {
            return "1600MHz";
        }
    }
}
