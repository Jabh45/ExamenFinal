package pregunta1;

public enum ProcessorFrequency {
    Low {
        public String toString() {
            return "1.4GHz";
        }
    },

    Fast {
        public String toString() {
            return "2.4GHz";
        }
    },
    
    Turbo {
        public String toString() {
            return "3.2GHz";
        }
    }
}
