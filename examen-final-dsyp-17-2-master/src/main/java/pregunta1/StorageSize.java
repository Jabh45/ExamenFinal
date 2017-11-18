package pregunta1;

public enum StorageSize {
    Small {
        public String toString() {
            return "512GB";
        }
    },

    Medium {
        public String toString() {
            return "1TB";
        }
    },
    
    Huge {
        public String toString() {
            return "2TB";
        }
    }
}
