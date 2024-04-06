package com.lcwd.orm;

import com.lcwd.orm.entities.*;
import com.lcwd.orm.repositories.CategoryRepo;
import com.lcwd.orm.repositories.ProductRepo;
import com.lcwd.orm.repositories.StudentRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(LearnSpringOrmApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringOrmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Ankit");
//        user.setCity("Delhi");
//        user.setAge(34);
//        User savedUser = userService.saveUser(user);
//        System.out.println(savedUser);

        //get single user
//        List<User> users =userService.getAllUser();
//        logger.info("user size is {} ",users.size());
//        logger.info("Users : {} ",users);

//        User user = userService.getUser(20);
//        logger.info("user is {} ",user);
//
//        User user=new User();
//        user.setName("Ankit Tiwari");
//        user.setAge(30);
//        user.setCity("DELHI");
//        User updatedUser = userService.updateUser(user, 1);
//        logger.info("updated user details : {} ",updatedUser);
//        userService.deleteUser(2);

//        ONE TO ONE MAPPING
//
//        Student student = new Student();
//        student.setStudentName("Ankit Tiwari");
//        student.setAbout("I am software engineer");
//        student.setStudentId(14);
//
//
//        Laptop laptop=new Laptop();
//        laptop.setModelNumber("14314");
//        laptop.setBrand("DELL");
//        laptop.setLaptopId(1231);
//
//        //important
//        laptop.setStudent(student);
//
//        student.setLaptop(laptop);
//
//
//
//
//
//        //manully laptop save:
//        //laptop repository
//
//        Student save = studentRepository.save(student);
//
//        logger.info("saved student : {}",save.getStudentName());

//        Student student = studentRepository.findById(14).get();
//        logger.info("Name is {} ",student.getStudentName());
//
//        Laptop laptop = student.getLaptop();
//        logger.info("Laptop {},{}",laptop.getBrand(),laptop.getModelNumber());

//        ONE TO MANY

//        Student student = new Student();
//        student.setStudentName("Ravi Tiwari");
//        student.setAbout("I am software engineer");
//        student.setStudentId(15);
//
//        Address a1=new Address();
//        a1.setAddressId(131);
//        a1.setStreet("235/235");
//        a1.setCity("LKO");
//        a1.setCountry("IND");
//        a1.setStudent(student);
//
//        Address a2=new Address();
//        a2.setAddressId(133);
//        a2.setStreet("421/235");
//        a2.setCity("DELHI");
//        a2.setCountry("IND");
//        a2.setStudent(student);
//
//        List<Address> addressList = new ArrayList<>();
//        addressList.add(a1);
//        addressList.add(a2);
//
//        student.setAddressList(addressList);
//        Student save = studentRepository.save(student);
//        logger.info("Student created : with address ");


//        Product product1 = new Product();
//        product1.setpId("pid1");
//        product1.setProductName("Iphone 14 max pro");
//
//        Product product2 = new Product();
//        product2.setpId("pid2");
//        product2.setProductName("Samsung s22 ultra");
//
//        Product product3 = new Product();
//        product3.setpId("pid3");
//        product3.setProductName("Samsung TV12341");
//
//        Category category1 = new Category();
//        category1.setcId("cid1");
//        category1.setTitle("Electronics");
//
//        Category category2=new Category();
//        category2.setTitle("Mobile Phone");
//        category2.setcId("cid2");
//
//        List<Product> category1Products = category1.getProducts();
//        category1Products.add(product1);
//        category1Products.add(product2);
//        category1Products.add(product3);
//
//        List<Product> category2Products = category2.getProducts();
//        category2Products.add(product1);
//        category2Products.add(product2);
//
//        categoryRepo.save(category1);
//        categoryRepo.save(category2);

//        Category category = categoryRepo.findById("cid1").get();
//        System.out.println(category.getProducts().size());
//
//        Category category2 = categoryRepo.findById("cid2").get();
//        System.out.println(category2.getProducts().size());

//
//        Product product = productRepo.findById("pid1").get();
//        System.out.println(product.getCategories().size());

//        Optional<Product> byProductName = productRepo.findByProductName("Iphone 14 max pro");
//        System.out.println(byProductName.isPresent());
//        System.out.println(byProductName.get().getProductName());
//
//        System.out.println("++++++++++++++++++++++++++++++++++++");
//        List<Product> tra = productRepo.findByProductNameEndingWith("tra");
//        tra.forEach(product -> {
//            System.out.println(product.getProductName());
//        });
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
//        List<Product> sung = productRepo.findByProductNameContaining("sung");
//        sung.forEach(product -> System.out.println(product.getProductName()));
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//        List<Product> samsung_s22_ultra = productRepo.findByProductNameIn(Arrays.asList("Iphone 14 max pro", "Samsung s22 ultra"));
//        samsung_s22_ultra.forEach(product -> System.out.println(product.getProductName()));


        List<Product> allProductWhileLearningJPA = productRepo.getAllProductWhileLearningJPA();
        allProductWhileLearningJPA.forEach(product -> System.out.println(product.getProductName()));

        productRepo.getAllActiveProducts().forEach(product -> System.out.println(product.getProductName()));

    }

    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private ProductRepo productRepo;
}
