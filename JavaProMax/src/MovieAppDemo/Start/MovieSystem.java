package MovieAppDemo.Start;

import MovieAppDemo.Bean.Business;
import MovieAppDemo.Bean.Customer;
import MovieAppDemo.Bean.Movie;
import MovieAppDemo.Bean.User;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

public class MovieSystem {

    /**
     * 用户容器集合
     */
    public static final List<User> AllUsers = new ArrayList<>();

    /**
     * 系统与商家集合
     */
    public static final Map<Business, List<Movie>> AllMovies = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

    public static User loginUser;

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger("Test.class");

    //初始化数据
    static {
        Customer c1 = new Customer();
        c1.setUsername("wcl");
        c1.setRealName("王晨乐");
        c1.setPassword("123");
        c1.setSex('男');
        c1.setMoney(10000);
        c1.setPhone("13309263937");
        AllUsers.add(c1);

        Customer c2 = new Customer();
        c2.setUsername("wsy");
        c2.setRealName("王舜宇");
        c2.setPassword("qwe");
        c2.setSex('男');
        c2.setMoney(5000);
        c2.setPhone("189074");
        AllUsers.add(c2);

        Business b1 = new Business();
        b1.setUsername("cyb");
        b1.setRealName("程义镔");
        b1.setPassword("asd");
        b1.setSex('男');
        b1.setMoney(0);
        b1.setPhone("110110");
        b1.setAddress("立丰国际F9");
        b1.setShopName("幸福蓝海");
        AllUsers.add(b1);
        List<Movie> movies1 = new ArrayList<>();
        AllMovies.put(b1, movies1);

        Business b2 = new Business();
        b2.setUsername("cdy");
        b2.setRealName("曹德怡");
        b2.setPassword("zxc");
        b2.setSex('女');
        b2.setMoney(0);
        b2.setPhone("120120");
        b2.setAddress("小寨");
        b2.setShopName("欢乐小马F5");
        AllUsers.add(b2);
        List<Movie> movies2 = new ArrayList<>();
        AllMovies.put(b2, movies2);
    }


    public static void main(String[] args) {

        MainMenu();

    }


    /**
     * 主界面
     */
    private static void MainMenu() {
        while (true) {
            Separator("");
            System.out.println("欢迎");
            System.out.println("1.登录");
            System.out.println("2.客户注册");
            System.out.println("3.商家注册");

            System.out.println("输入:");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    login();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                default:
                    System.out.println("输错了!");
            }
        }
    }


    /**
     * 登录页面
     */
    private static void login() {
        System.out.println("用户名:");
        String username = SYS_SC.nextLine();
        System.out.println("密码:");
        String password = SYS_SC.nextLine();

        User u = getUserByUsername(username);

        if (u != null) {
            if (u.getPassword().equals(password)) {
                loginUser = u;
                LOGGER.info(u.getUsername() + "已登录");
                if (u instanceof Customer) {
                    CustomerMain();
                } else {
                    BusinessMain();
                }
            } else {
                System.out.println("密码错误");
            }
        } else {
            System.out.println("用户名错误");
        }
    }


    /**
     * 根据用户名查找对象
     *
     * @param username
     * @return
     */
    private static User getUserByUsername(String username) {
        for (User user : AllUsers) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    /**
     * 客户主页面
     */
    private static void CustomerMain() {
        while (true) {
            System.out.println("-------------客户界面--------------");
            System.out.println(loginUser.getUsername() + (loginUser.getSex() == '男' ? "先生" : "女士") + "欢迎您");
            System.out.println("1.展示全部");
            System.out.println("2.查询电影");
            System.out.println("3.购票");
            System.out.println("4.退出");
            while (true) {
                System.out.println("输入:");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "1":
                        showAllMovies();
                        break;
                    case "2":
                        searchMovie();
                        break;
                    case "3":
                        buyTickets();
                        break;
                    case "4":
                        System.out.println("拜拜");
                        return;
                    default:
                        System.out.println("输错了");
                        break;
                }
            }
        }

    }

    /**
     * 客户购票
     */
    private static void buyTickets() {
        showAllMovies();
        Separator("购票");
        System.out.println("输入门店");
        String shopName = SYS_SC.nextLine();
        List<Movie> movies = getBusinessByShopName(shopName);
        System.out.println("输入电影名");
        String name = SYS_SC.nextLine();
        for (Movie movie : movies) {
            if(movie.getName().equals(name)){
                System.out.println("购买成功");
            }
        }
    }

    /**
     * 根据店名找电影集合
     * @param shopName
     * @return
     */
    private static List<Movie> getBusinessByShopName(String shopName) {
        Set<Business> businesses = AllMovies.keySet();
        for (Business business : businesses) {
            if(business.getShopName().equals(shopName)){
                return AllMovies.get(business);
            }
        }
        return null;
    }

    /**
     * 用户查询所有电影院的电影
     */
    private static void searchMovie() {
        Separator("查询电影信息");
        System.out.println("输入电影名");
        String name = SYS_SC.nextLine();
        AllMovies.forEach((business, movies) -> {
            for (Movie movie : movies) {
                if (movie.getName().equals(name)){
                    System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() +
                            "\t\t地址:" + business.getAddress());
                    System.out.println("片名\t\t主演\t\t时长\t\t票价\t\t余票\t\t放映时间");
                    System.out.println(movie.getName() + "\t\t" + movie.getActor() + "\t\t" + movie.getTime() +
                            "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + movie.getStartTime());
                }
            }
        });
    }

    /**
     * 用户查询所有电影
     */
    private static void showAllMovies() {
        Separator("查询所有电影信息");
        AllMovies.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() +
                    "\t\t地址:" + business.getAddress());
            System.out.println("片名\t\t主演\t\t时长\t\t票价\t\t余票\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t" + movie.getActor() + "\t\t" + movie.getTime() +
                        "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + movie.getStartTime());
            }
        });
    }

    /**
     * 商家界面
     */
    private static void BusinessMain() {
        while (true) {
            System.out.println("-------------商家界面--------------");
            System.out.println(loginUser.getUsername() + (loginUser.getSex() == '男' ? "先生" : "女士") + "欢迎您");
            System.out.println("1.展示全部");
            System.out.println("2.上架电影");
            System.out.println("3.下架电影");
            System.out.println("4.修改电影");
            System.out.println("5.退出");
            while (true) {
                System.out.println("输入:");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "1":
                        showBusinessInfos();
                        break;
                    case "2":
                        addMovie();
                        break;
                    case "3":
                        deleteMovie();
                        break;
                    case "4":
                        updateMovie();
                        break;
                    case "5":
                        System.out.println("拜拜");
                        return;
                    default:
                        System.out.println("输错了");
                        break;
                }
            }
        }
    }


    /**
     * 展示商家影片内容
     */
    private static void showBusinessInfos() {
        Separator("商家详情界面");
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:" + business.getAddress());
        List<Movie> movies = AllMovies.get(business);
        if (movies.size() > 0) {
            System.out.println("片名\t\t主演\t\t时长\t\t票价\t\t余票\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t" + movie.getActor() + "\t\t" + movie.getTime() +
                        "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + movie.getStartTime());
            }
        } else {
            System.out.println("暂无影片");
        }
    }


    /**
     * 商家添加影片
     */
    private static void addMovie() {
        Separator("添加影片");
        Business business = (Business) loginUser;
        List<Movie> movies = AllMovies.get(business);

        System.out.println("片名");
        String name = SYS_SC.nextLine();
        System.out.println("主演");
        String actor = SYS_SC.nextLine();
        System.out.println("时长");
        String time = SYS_SC.nextLine();
        System.out.println("票价");
        String price = SYS_SC.nextLine();
        System.out.println("票数");
        String number = SYS_SC.nextLine();
        while (true) {
            try {
                System.out.println("放映时间yyyy-MM-dd HH:mm:ss");
                String startTime = SYS_SC.nextLine();
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price),
                        Integer.valueOf(number), sdf.parse(startTime));
                movies.add(movie);
                System.out.println("《" + movie.getName() + "》上架成功!");
                return;
            } catch (Exception e) {
                LOGGER.error("时间格式错误");
            }
        }
    }


    /**
     * 商家下架影片
     */
    private static void deleteMovie() {
        Separator("下架影片");
        Business business = (Business) loginUser;
        List<Movie> movies = AllMovies.get(business);

        if (movies.size() == 0) {
            System.out.println("无影片可下架");
            return;
        }

        System.out.println("下架的片名");
        String name = SYS_SC.nextLine();
        Movie movie = getMovieByMovieName(name);
        if (movie != null) {

            movies.remove(movie);
            System.out.println("《" + movie.getName() + "》下架成功!");
            return;
        } else {
            System.out.println("查无此片");
        }
    }


    /**
     * 商家修改影片
     */
    private static void updateMovie() {
        Separator("修改影片");
        Business business = (Business) loginUser;
        List<Movie> movies = AllMovies.get(business);

        if (movies.size() == 0) {
            System.out.println("无影片可下架");
            return;
        }

        System.out.println("修改的片名");
        String name = SYS_SC.nextLine();
        Movie movie = getMovieByMovieName(name);
        if (movie != null) {
            while (true) {
                try {
                    System.out.println("片名");
                    String newName = SYS_SC.nextLine();
                    System.out.println("主演");
                    String actor = SYS_SC.nextLine();
                    System.out.println("时长");
                    String time = SYS_SC.nextLine();
                    System.out.println("票价");
                    String price = SYS_SC.nextLine();
                    System.out.println("票数");
                    String number = SYS_SC.nextLine();
                    System.out.println("放映时间yyyy-MM-dd HH:mm:ss");
                    String startTime = SYS_SC.nextLine();
                    movie.setName(newName);
                    movie.setActor(actor);
                    movie.setTime(Double.valueOf(time));
                    movie.setPrice(Double.valueOf(price));
                    movie.setNumber((Integer.valueOf(number)));
                    movie.setStartTime(sdf.parse(startTime));
                    System.out.println("《" + movie.getName() + "》修改成功!");
                    return;
                } catch (Exception e) {
                    LOGGER.error("格式错误");
                }
            }
        } else {
            System.out.println("查无此片");
        }
    }

    /**
     * 根据电影名寻找电影集合
     * @param name
     * @return
     */
    private static Movie getMovieByMovieName(String name) {
        Business business = (Business) loginUser;
        List<Movie> movies = AllMovies.get(business);
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }



    private static void Separator(String content) {
        System.out.println("--------------" + content + "-------------");
        //2022-08-11 08:08:08
    }
}


















