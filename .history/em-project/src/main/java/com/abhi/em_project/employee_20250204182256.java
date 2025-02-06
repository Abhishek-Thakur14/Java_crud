package com.abhi.em_project;

public class Employee {
    private String name;
    private String phone;
    private String email;

    public String getName(){
        return name;
    }

    ppublic void package;
    
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    
    @Entity
    class entityClassName {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private entityIdType id;
    
        public entityClassName() {
        }
    
        public entityIdType getId() {
            return id;
        }
    
        public void setId(entityIdType id) {
            this.id = id;
        }
    }
    }
}
