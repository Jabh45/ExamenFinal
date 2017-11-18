package pregunta1;

public enum MemorySize {
    Basic {
        public String toString() {
            return "8GB";
        }
    },

    Medium {
        public String toString() {
            return "16GB";
        }
    },
    
    Pro {
        public String toString() {
            return "32GB";
        }
    }
}
