package dat3.car.config;

import dat3.car.entity.Car;
import dat3.car.entity.Member;
import dat3.car.repositories.CarRepository;
import dat3.car.repositories.MemberRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.ArrayList;
import java.util.List;

public class DeveloperData implements ApplicationRunner {

    CarRepository carRepository;
    MemberRepository memberRepository;

    public DeveloperData(CarRepository carRepository, MemberRepository memberRepository) {
        this.carRepository = carRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    private void createCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ferrari", "LaFerrari"));
        cars.add(new Car("Lamborghini", "Aventador"));
        cars.add(new Car("Bugatti", "Chiron"));
        cars.add(new Car("Rolls-Royce", "Phantom"));
        cars.add(new Car("Porsche", "911 Turbo S"));
        cars.add(new Car("McLaren", "P1"));
        cars.add(new Car("Aston Martin", "DBS Superleggera"));
        cars.add(new Car("Bentley", "Continental GT"));
        cars.add(new Car("Mercedes-Benz", "S-Class Maybach"));
        cars.add(new Car("Lexus", "LC 500"));


        carRepository.saveAll(cars);
    }

    public void createMembers() {
        List<Member> members = new ArrayList<>();
        members.add(new Member("elonmusk", "spacex123", "elon@musk.com", "Elon", "Musk", "1 Rocket Road", "Los Angeles", "12345"));
        members.add(new Member("oprah", "ownnetwork", "oprah@winfrey.com", "Oprah", "Winfrey", "123 Success Lane", "Chicago", "67890"));
        members.add(new Member("billgates", "microsoft123", "bill@gates.com", "Bill", "Gates", "1 Windows Way", "Seattle", "54321"));
        members.add(new Member("angelinajolie", "hollywood123", "angelina@jolie.com", "Angelina", "Jolie", "456 Fame Street", "Los Angeles", "98765"));
        members.add(new Member("barackobama", "president123", "barack@obama.com", "Barack", "Obama", "1600 Pennsylvania Ave NW", "Washington, D.C.", "12345"));


        memberRepository.saveAll(members);
    }

}
