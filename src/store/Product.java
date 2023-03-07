package store;

import java.time.LocalDate;

public abstract class Product {
        private int id;
        private String name;
        private String companyName;
        private LocalDate localdate;


        public Product(int id, String name, String companyName, LocalDate localdate) {
            this.id = id;
            this.name = name;
            this.companyName = companyName;
            this.localdate = localdate;
        }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public LocalDate getLocaldate() {
            return localdate;
        }

        public void setLocaldate(LocalDate localdate) {
            this.localdate = localdate;
        }

        @Override
        public String toString() {
            return "store.productStore.Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", companyName='" + companyName + '\'' +
                    ", localdate=" + localdate +
                    '}';
        }
    }


