# cars

**The idea with, and reasons for why to use, an ORM-mapper**:
Brug af en ORM-mapper tillader objekt-orienteret arbejde med databaser, mindsker SQL-kode, og forenkler udvikling.

**The meaning of the terms JPA, Hibernate, and Spring Data JPA and how they are connected**:
JPA er en standard, Hibernate er dens implementering, og Spring Data JPA udvider det med ekstra funktioner.

**How to create simple Java entities and map them to a database via the Spring Data API**:
Definér Java-klasser med annotations som @Entity, @Id, og @Column for at kortlægge dem til databaser via Spring Data API.

**How to control the mapping between individual fields in an Entity class and their matching columns in the database**:
Brug annotations som @Column til at styre, hvordan felter i en Entity-klasse kortlægges til databasens kolonner.

**How to auto generate IDs, and how to ensure we are using a specific database's preferred way of doing it (Auto Increment in our case for MySQL)**:
Brug @GeneratedValue og indstil "strategy" til GenerationType.IDENTITY for at auto-generere IDs, især Auto Increment i MySQL.

**How to use and define repositories and relevant query methods using Spring Data JPA's repository pattern**:
Definér interfaces, udvid fra JpaRepository, og følg navngivningskonventioner for at bruge og definere repositories og forespørgselsmetoder.

**How to write simple "integration" tests, using H2 as a mock-database instead of MySQL**:
Konfigurér H2 som in-memory database for integrationstests for at simulere MySQL, uden at påvirke den faktiske database.

**How to add (dev) connection details for your local MySQL database**:
Konfigurér database-URL, brugernavn og adgangskode i applikationskonfigurationsfilerne for at etablere forbindelse til din lokale MySQL-database under udvikling.
