public enum Days {

    MONDAY {
        @Override
        public void method() {
            System.out.println("ДУЙШОМБУ КУНУ ЖАВА ОКУЙМ ");

        }
    },
    TUESDAY {
        @Override
        public void method() {
            System.out.println("ШЕЙШЕМБИ КУНУ АНГЛИС ТИЛИ САБАГЫН ОКУЙМ ");

        }
    },
    WEDNESDAY {
        @Override
        public void method() {
            System.out.println("БУГУН ЖАВА ПРАКТИКАЛЫК САБАГЫН ОКУЙМ ");

        }
    };


    public abstract void method();





}
