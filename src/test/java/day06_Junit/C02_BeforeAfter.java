package day06_Junit;

import org.junit.*;

public class C02_BeforeAfter {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("beforeClass Tüm class'dan önce tek bir sefer çalışır");
    }

    @Before
    public void setup() throws Exception {
        System.out.println("before Her methoddan önce bir kez çalışır");
    }

    @Test
    public void test01() {
        System.out.println("Test01 çalıştı");
    }

    @Test
    public void test02() {
        System.out.println("Test02 çalıştı");
    }

    @Test
    public void test03() {
        System.out.println("Test03 çalıştı");
    }

    @Test
    public void test04() {
        System.out.println("Test04 çalıştı");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("After Her methoddan sonra bir kez calisir");

    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("afterClass Tüm class'dan sonra tek bir sefer çalışır");
    }
    /*
    Bir class ta 4 tane test methodu 1 tane before 1 tane after methodu varsa class ta kac tane method calismistir.
    YANIT: 3 * 4 =12
     */
}