import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fypms{
    public static String userID;
    public static String inputPassword;
    public static String userPassword = "password";
    public static Scanner sc = new Scanner(System.in);

    static ArrayList<String[]> studentInfo;

    static {
        studentInfo = new ArrayList<>();
        studentInfo.add(new String[]{"YCHERN", "password","null","CHERN","YCHERN@NTU.EDU.SG"});
        studentInfo.add(new String[]{"KOH1", "password","null","KOH","KOH1@NTU.EDU.SG"});
        studentInfo.add(new String[]{"BR015", "password","null","BRANDON","BR015@NTU.EDU.SG"});
        studentInfo.add(new String[]{"CT113", "password","null","CALVIN ","CT113@NTU.EDU.SG"});
        studentInfo.add(new String[]{"YCN019", "password","null","CHAN","YCN019@NTU.EDU.SG"});
        studentInfo.add(new String[]{"DL007", "password","null","DENISE","DL007@NTU.EDU.SG"});
        studentInfo.add(new String[]{"DON84", "password","null","DONG","DON84@NTU.EDU.SG"});
        studentInfo.add(new String[]{"ELI34", "password","null","ERNEST","ELI34@NTU.EDU.SG"});
        studentInfo.add(new String[]{"LE51", "password","null","LEE","LE51@NTU.EDU.SG"});
        studentInfo.add(new String[]{"SL22", "password","null","LIU","SL22@NTU.EDU.SG"});
        studentInfo.add(new String[]{"AKY013", "password","null","RAWAL","AKY013@NTU.EDU.SG"});
    }

    static ArrayList<String[]> supervisorInfo;

    static{
        supervisorInfo = new ArrayList<>();
        supervisorInfo.add(new String[]{"ASMADHUKUMAR", "password", "asmadhukumar@ntu.edu.sg", "A S Madhukumar"});
        supervisorInfo.add(new String[]{"ASSOURIN", "password", "assourin@ntu.edu.sg", "Alexei Sourin"});
        supervisorInfo.add(new String[]{"ANUPAM", "password", "anupam@ntu.edu.sg", "Anupam Chattopadhyay"});
        supervisorInfo.add(new String[]{"ANWITAMAN", "password", "anwitaman@ntu.edu.sg", "Anwitaman Datta"});
        supervisorInfo.add(new String[]{"ARVINDE", "password", "arvind@ntu.edu.sg", "Arvind Easwaran"});
        supervisorInfo.add(new String[]{"BOAN", "password", "boan@ntu.edu.sg", "Bo An"});
        supervisorInfo.add(new String[]{"ASWTCAI", "password", "aswtcai@ntu.edu.sg", "Cai Wentong"});
        supervisorInfo.add(new String[]{"ASTJCHAM", "password", "astjcham@ntu.edu.sg", "Cham Tat Jen"});
        supervisorInfo.add(new String[]{"ASSCHAN", "password", "asschan@ntu.edu.sg", "Chan Syin"});
        supervisorInfo.add(new String[]{"CCLOY", "password", "ccloy@ntu.edu.sg", "Chen Change Loy"});
        supervisorInfo.add(new String[]{"ASLTCHIA", "password", "asltchia@ntu.edu.sg", "Chia Liang Tien"});
        supervisorInfo.add(new String[]{"ASESCHNG", "password", "aseschng@ntu.edu.sg", "Chng Eng Siong"});
        supervisorInfo.add(new String[]{"GAOCONG", "password", "gaocong@ntu.edu.sg", "Cong Gao"});
        supervisorInfo.add(new String[]{"ASDRAJAN", "password", "asdrajan@ntu.edu.sg", "Deepu Rajan"});
        supervisorInfo.add(new String[]{"ASDOUGLAS", "password", "asdouglas@ntu.edu.sg", "Douglas Leslie Maskell"});
        supervisorInfo.add(new String[]{"DNIYATO", "password", "dniyato@ntu.edu.sg", "Dusit Niyato"});
        supervisorInfo.add(new String[]{"CAMBRIA", "password", "cambria@ntu.edu.sg", "Erik Cambria"});
        supervisorInfo.add(new String[]{"xyfan", "password", "xyfan@ntu.edu.sg", "Fan Xiuyi"});           
        supervisorInfo.add(new String[]{"ASWBGOH", "password", "ASWBGOH@ntu.edu.sg", "Goh Wooi Boon"});
        supervisorInfo.add(new String[]{"CTGUAN", "password", "CTGUAN@NTU.EDU.SG", "Guan Cuntai"});
        supervisorInfo.add(new String[]{"YHE", "password", "YHE@NTU.EDU.SG", "He Ying"});
        supervisorInfo.add(new String[]{"ASSYHUANG", "password", "ASSYHUANG@ntu.edu.sg", "Huang Shell Ying"});
        supervisorInfo.add(new String[]{"ASSCHUI", "password", "ASSCHUI@ntu.edu.sg", "Hui Siu Cheung"});
        supervisorInfo.add(new String[]{"SRJOTY", "password", "SRJOTY@NTU.EDU.SG", "Joty Shafiq Rayhan"});
        supervisorInfo.add(new String[]{"YPKE", "password", "YPKE@NTU.EDU.SG", "Ke Yiping, Kelly"});
        supervisorInfo.add(new String[]{"ADAMSKONG", "password", "ADAMSKONG@NTU.EDU.SG", "Kong Wai-Kin Adams"});
        supervisorInfo.add(new String[]{"ASCKKWOH", "password", "ASCKKWOH@ntu.edu.sg", "Kwoh Chee Keong"});
        supervisorInfo.add(new String[]{"ASSKLAM", "password", "ASSKLAM@NTU.EDU.SG", "Lam Siew Kei"});
        supervisorInfo.add(new String[]{"ASCTLAU", "password", "ASCTLAU@NTU.EDU.SG", "Lau Chiew Tong"});
        supervisorInfo.add(new String[]{"EBSLEE", "password", "EBSLEE@ntu.edu.sg", "Lee Bu Sung"});
        supervisorInfo.add(new String[]{"boyang.li", "password", "boyang.li@ntu.edu.sg", "Li Boyang"});
        supervisorInfo.add(new String[]{"ASFLI", "password", "ASFLI@NTU.EDU.SG", "Li Fang"});
        supervisorInfo.add(new String[]{"LIMO", "password", "LIMO@NTU.EDU.SG", "Li Mo"});
        supervisorInfo.add(new String[]{"YI_LI", "password", "YI_LI@NTU.EDU.SG", "Li Yi"});
        supervisorInfo.add(new String[]{"gslin", "password", "gslin@ntu.edu.sg", "Lin Guosheng"});
        supervisorInfo.add(new String[]{"SHANG-WEI.LIN", "password", "SHANG-WEI.LIN@NTU.EDU.SG", "Lin Shang-Wei"});
        supervisorInfo.add(new String[]{"WSLIN", "password", "WSLIN@NTU.EDU.SG", "Lin Weisi"});
        supervisorInfo.add(new String[]{"LIU", "password", "LIU@NTU.EDU.SG", "Liu Weichen"});          
        supervisorInfo.add(new String[]{"YANGLIU", "password", "YANGLIU@NTU.EDU.SG", "Liu Yang"});
        supervisorInfo.add(new String[]{"ziwei.liu", "password", "ziwei.liu@ntu.edu.sg", "Liu Ziwei"});
        supervisorInfo.add(new String[]{"anhtuan.luu", "password", "anhtuan.luu@ntu.edu.sg", "Luu Anh Tuan"});
        supervisorInfo.add(new String[]{"YRLOKE", "password", "YRLOKE@NTU.EDU.SG", "Loke Yuan Ren"});
        supervisorInfo.add(new String[]{"C.LONG", "password", "C.LONG@NTU.EDU.SG", "Long Cheng"});
        supervisorInfo.add(new String[]{"SHIJIAN.LU", "password", "SHIJIAN.LU@NTU.EDU.SG", "Lu Shijian"});
        supervisorInfo.add(new String[]{"JUNLUO", "password", "JUNLUO@NTU.EDU.SG", "Luo Jun"});
        supervisorInfo.add(new String[]{"siqiang.luo", "password", "siqiang.luo@ntu.edu.sg", "Luo Siqiang"});
        supervisorInfo.add(new String[]{"MSABRY", "password", "MSABRY@NTU.EDU.SG", "Mohamed M. Sabry"});
        supervisorInfo.add(new String[]{"AWKNG", "password", "AWKNG@ntu.edu.sg", "Ng Wee Keong"});
        supervisorInfo.add(new String[]{"HLOH", "password", "HLOH@NTU.EDU.SG", "Oh Hong Lye"});
        supervisorInfo.add(new String[]{"ASYSOng", "password", "ASYSOng@ntu.edu.sg", "Ong Yew Soon"});
        supervisorInfo.add(new String[]{"OFERNANDO", "password", "OFERNANDO@NTU.EDU.SG", "Owen Noel Newton Fernando"});
        supervisorInfo.add(new String[]{"SINNOPAN", "password", "SINNOPAN@NTU.EDU.SG", "Pan, Sinno Jialin"});
        supervisorInfo.add(new String[]{"MKMQIAN", "password", "MKMQIAN@NTU.EDU.SG", "Qian Kemao"});
        supervisorInfo.add(new String[]{"ASHCQUEK", "password", "ASHCQUEK@ntu.edu.sg", "Quek Hiok Chai"});
        supervisorInfo.add(new String[]{"ASJAGATH", "password", "ASJAGATH@NTU.EDU.SG", "Rajapakse Jagath Chandana"});
        supervisorInfo.add(new String[]{"ASHSSEAH", "password", "ASHSSEAH@ntu.edu.sg", "Seah Hock Soon"});
        supervisorInfo.add(new String[]{"ZQSHEN", "password", "ZQSHEN@NTU.EDU.SG", "Shen Zhiqi"});
        supervisorInfo.add(new String[]{"SMITHA", "password", "SMITHA@NTU.EDU.SG", "Smitha K G"});
        supervisorInfo.add(new String[]{"ASSOURAV", "password", "ASSOURAV@NTU.EDU.SG", "Sourav Saha Bhowmick"});
        supervisorInfo.add(new String[]{"AXSUN", "password", "AXSUN@NTU.EDU.SG", "Sun Aixin"});
        supervisorInfo.add(new String[]{"cheewei.tan", "password", "cheewei.tan@ntu.edu.sg", "Tan Chee Wei"});
        supervisorInfo.add(new String[]{"TANRUI", "password", "TANRUI@NTU.EDU.SG", "Tan Rui"});
        supervisorInfo.add(new String[]{"ASXYTANG", "password", "ASXYTANG@NTU.EDU.SG", "Tang Xueyan"});
        supervisorInfo.add(new String[]{"kianboon.tay", "password", "kianboon.tay@ntu.edu.sg", "Tay Kian Boon"});
        supervisorInfo.add(new String[]{"ASTSRIKAN", "password", "ASTSRIKAN@ntu.edu.sg", "Thambipillai Srikanthan"});        
        supervisorInfo.add(new String[]{"vidya.sudarshan", "password", "vidya.sudarshan@ntu.edu.sg", "Vidya Sudarshan"});
        supervisorInfo.add(new String[]{"ASCHVUN", "password", "ASCHVUN@ntu.edu.sg", "Vun Chan Hua, Nicholas"});
        supervisorInfo.add(new String[]{"YGWEN", "password", "YGWEN@ntu.edu.sg", "Wen Yonggang"});
        supervisorInfo.add(new String[]{"ASCKYEO", "password", "ASCKYEO@ntu.edu.sg", "Yeo Chai Kiat"});
        supervisorInfo.add(new String[]{"HAN.YU", "password", "HAN.YU@NTU.EDU.SG", "Yu Han"});
        supervisorInfo.add(new String[]{"HANWANGZHANG", "password", "HANWANGZHANG@NTU.EDU.SG", "Zhang Hanwang"});
        supervisorInfo.add(new String[]{"ZHANGJ", "password", "ZHANGJ@NTU.EDU.SG", "Zhang Jie"});
        supervisorInfo.add(new String[]{"tianwei.zhang", "password", "tianwei.zhang@ntu.edu.sg", "Zhang Tianwei"});
        supervisorInfo.add(new String[]{"JUNZHAO", "password", "JUNZHAO@NTU.EDU.SG", "Zhao Jun"});
        supervisorInfo.add(new String[]{"ASJMZHENG", "password", "ASJMZHENG@NTU.EDU.SG", "Zheng Jianmin"});
    }

    static ArrayList<ArrayList<String>> projectList = new ArrayList<ArrayList<String>>();

    static String[][] projects = {
        {"A S Madhukumar", "ASMADHUKUMAR@NTU.EDU.SG", "Machine Learning-based Interference Mitigation in a Multi-tier Networks", "available", "1","","",""},
        {"A S Madhukumar", "ASMADHUKUMAR@NTU.EDU.SG", "Deep Learning-Driven Edge Caching for 5G-and-Beyond Industrial IoT Networks", "available", "2","","",""},
        {"Alexei Sourin", "ASSOURIN@ntu.edu.sg", "Sonification of geometry 1", "available", "3","","",""},
        {"Arvind Easwaran", "ARVINDE@NTU.EDU.SG", "Edge/Cloud Resource Management for Time-Sensitive Applications (2)", "available", "4","","",""},
        {"Bo An", "BOAN@NTU.EDU.SG", "Deep Reinforcement Learning for Complex Environment", "available", "5","","",""},
        {"Bo An", "BOAN@NTU.EDU.SG", "Build Software Agents for Power Trading Agent Competition", "available", "6","","",""},
        {"Bo An", "BOAN@NTU.EDU.SG", "Designing Negotiation Agents to Parcitipate in International Competition", "available", "7","","",""},
        {"Cai Wentong", "ASWTCAI@ntu.edu.sg", "Creation of Meta-model for Agent-based Simulation Using Machine Learning Approach", "available", "8","","",""},
        {"Chen Change Loy", "Not available", "Encoding Images to Text Prompts with CLIP", "available", "9","","",""},
        {"Chia Liang Tien", "CCLOY@NTU.EDU.SG", "Smart Monitor for Studio Photographer", "available", "10","","",""},
        {"Cong Gao", "GAOCONG@NTU.EDU.SG", "Developing a demonstration system for spatial data exploration and visualization", "available", "11","","",""},
        {"Cong Gao", "GAOCONG@NTU.EDU.SG", "Deep Learning Supported Location-aware Keyword Query", "available", "12","","",""},
        {"Douglas Leslie Maskell", "ASDOUGLAS@NTU.EDU.SG", "An AI based Li-ion fast battery charger for power tools", "available", "13","","",""},
        {"Douglas Leslie Maskell", "ASDOUGLAS@NTU.EDU.SG", "A Li-ion fast battery charger", "available", "14","","",""},
        {"Dusit Niyato", "DNIYATO@NTU.EDU.SG", "Metaverse for virtual education 1", "available", "15","","",""},
        {"Ke Yiping, Kelly", "YPKE@NTU.EDU.SG", "Graph-based Deep Models for Image Semantic Segmentation", "available", "16","","",""}
    };

    // flag variable to ensure populateProjectList runs only once
    private static boolean isProjectListPopulated = false;

    // Populate projectList using projects
    public static void populateProjectList() {
        if (!isProjectListPopulated) {
            for (String[] project : projects) {
                projectList.add(new ArrayList<String>(Arrays.asList(project)));
                allProjects.add(new ArrayList<String>(Arrays.asList(project)));
            }
            isProjectListPopulated = true;
        }
    }

    public static int getProjectInfo(String projectID) {
        for (int i = 0; i < projectList.size(); i++) {
            ArrayList<String> project = projectList.get(i);
            if (project.get(4).equals(projectID)) {
                return i;
            }
        }
        return -1; // project not found
    }
    

    public static String[] getStudentInfo(String studentID) {
        for (String[] student : studentInfo) {
            if (student[0].equals(studentID)) {
                return student;
            }
        }
        return null; // If studentID is not found
    }

    public static String[] getSupervisorInfo(int supervisorIndex) {
        if (supervisorIndex < 0 || supervisorIndex >= supervisorInfo.size()) {
            return null;
        }
        return supervisorInfo.get(supervisorIndex);
    }
    

    static ArrayList<ArrayList<String>> requestHistoryStudent = new ArrayList<>();
    // request history for student
    public static void requestHistoryStudent(String studentID) {
        boolean request = false;
        for (ArrayList<String> project : requestHistoryStudent) {
            if (project.get(5).equals(studentID)){
                System.out.println("Project ID: " + project.get(4));
                System.out.println("Supervisor name: " + project.get(0));
                System.out.println("Supervisor email address: " + project.get(1));
                System.out.println("Project title: " + project.get(2));
                System.out.println("Status: " + project.get(3));
                System.out.println("Requested by: " + project.get(5)); // student ID
                System.out.println("Student's name: " + project.get(6));
                System.out.println("Student's email address: " + project.get(7));
                System.out.println();
                request = true;
            }
        }
        if (!request) {
            System.out.println("No project history found for " + studentID);
            return;
        }
    }   

    // request history for coordinator
    private static ArrayList<ArrayList<String>> requestHistoryCoordinator = new ArrayList<>();
    public static void requestHistoryCoordinator() {
        if (requestHistoryCoordinator.size() != 0){
            for (ArrayList<String> project : requestHistoryCoordinator) {
                System.out.println("Project ID: " + project.get(4));
                System.out.println("Supervisor name: " + project.get(0));
                System.out.println("Supervisor email address: " + project.get(1));
                System.out.println("Project title: " + project.get(2));
                System.out.println("Status: " + project.get(3));
                System.out.println("Requested by: " + project.get(5)); //student ID
                System.out.println("Student's name: " + project.get(6));
                System.out.println("Student's email address: " + project.get(7));
                System.out.println();
            }
        } else {
            System.out.println("No project history found.");
            return;
        }
    }   

    // request history for supervisor
    private static ArrayList<ArrayList<String>> requestHistorySupervisor = new ArrayList<>();
    public static void requestHistorySupervisor(int x) {
        String supervisorEmail = getSupervisorInfo(x)[2];
        System.out.println("Choose an option:");
        System.out.println("(1) View incoming requests history");
        System.out.println("(2) View outgoing requests history");
        int option = sc.nextInt();
        sc.nextLine(); // consume newline character
    
        if (option == 2) {
            boolean request = false;
            for (ArrayList<String> project : requestHistorySupervisor) {
                System.out.println(project.get(1));
                System.out.println(supervisorEmail);
                if (project.get(1).equals(supervisorEmail)){ 
                    System.out.println("Project ID: " + project.get(4));
                    System.out.println("Original supervisor name: " + project.get(0));
                    System.out.println("Original supervisor email address: " + project.get(1));
                    System.out.println("Project title: " + project.get(2));
                    System.out.println("Status: " + project.get(3));
                    System.out.println("Requested by: " + project.get(5)); //student ID
                    System.out.println("Student's name: " + project.get(6));
                    System.out.println("Student's email address: " + project.get(7));
                    System.out.println(project.get(8));
                    System.out.println();
                    request = true;
                }
            }
            if (!request) {
                System.out.println("No project history found.");
                return;
            }
        } else if (option == 1) {
            String supervisorName = getSupervisorInfo(x)[3];
            boolean found = false;
            for (ArrayList<String> changeTitle : changeTitleList) {
                if (changeTitle.get(0).equals(supervisorName)) {
                    found = true;
                    System.out.println("Project ID: " + changeTitle.get(4));
                    System.out.println("Requested by: " + changeTitle.get(6));
                    System.out.println("Requested project title: " + changeTitle.get(2));
                    System.out.println("Status: " + changeTitle.get(3));
                }
            }
            if (!found) {
                System.out.println("No project title change requests found for " + supervisorName);
            }
        } else {
            System.out.println("Invalid option selected.");
            return;
        }
    }
    

    private static ArrayList<ArrayList<String>> reservedProjectList = new ArrayList<>();    
    public static void reservedRequest(String projectID, String studentID) {
        int index = -1;
        int index1 = -1;
        for (int i = 0; i < projectList.size(); i++) {
            ArrayList<String> project = projectList.get(i);
            if (project.get(4).equals(projectID)) {
                index = i;
                break;
            }
        }
        for (int j = 0; j < allProjects.size(); j++) {
            ArrayList<String> project = allProjects.get(j);
            if (project.get(4).equals(projectID)) {
                index1 = j;
                break;
            }
        }
        if (index != -1) {
            ArrayList<String> project = projectList.get(index);
            project.set(3, "Reserved");
            project.add(5, studentID); // student ID
            String[] studentInfo = getStudentInfo(studentID);
            project.add(6, studentInfo[3]); // student name
            project.add(7, studentInfo[4]); // student email address
            projectList.remove(index);
            allProjects.remove(index1);
            reservedProjectList.add(project);
            allProjects.add(project);
            requestHistoryStudent.add(new ArrayList<String>(project));
            requestHistoryCoordinator.add(new ArrayList<String>(project));
        }
    }    

    private static String studentID;
    public static boolean viewReserved() {
        if (reservedProjectList.size() != 0){
            for (ArrayList<String> project : reservedProjectList) {
                System.out.println("Request by student ID: " + project.get(5));
            }
        } else {
            System.out.println("No projects pending for approval.");
            return false;
        }
        
        // Ask the user to input the student ID for the project they want to view
        System.out.print("Enter the student ID of the project you want to view: ");
        sc.nextLine();
        studentID = sc.nextLine();
        
        // Find the project with the specified student ID and print out its information
        boolean foundProject = false;
        for (ArrayList<String> project : reservedProjectList) {
            if (project.get(5).equals(studentID)) {
                System.out.println();
                System.out.println("Project ID: " + project.get(4));
                System.out.println("Supervisor name: " + project.get(0));
                System.out.println("Supervisor email address: " + project.get(1));
                System.out.println("Project title: " + project.get(2));
                System.out.println("Status: " + project.get(3));
                System.out.println("Requested by: " + project.get(5));
                System.out.println("Student's name: " + project.get(6));
                System.out.println("Student's email address: " + project.get(7));
                System.out.println();
                foundProject = true;
                return true;
            }
        }
        
        if (!foundProject) {
            System.out.println("Project not found for student ID " + studentID);
            return false;
        } return true;
    }

    public static boolean checkReservedProjects() {
        if (reservedProjectList.size() != 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDeregisterProjects() {
        if (deregisterProjects.size() != 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCoordinator(int x) {
        boolean coordinator = false;
        String coordinatorID = getSupervisorInfo(x)[0];
        if (coordinatorID.equals("ASFLI")){
            coordinator = true;
        } return coordinator;
    }

    private static ArrayList<ArrayList<String>> deregisterProjects = new ArrayList<>();    
    public static void deregisterProject(int projectID) {
        boolean foundProject = false;
        ArrayList<String> projectToRemove = null;
    
        // Find the project in the approvedProjectList
        for (ArrayList<String> project : approvedProjectList) {
            if (project.get(4).equals(Integer.toString(projectID))) {
                foundProject = true;
                projectToRemove = project;
                break;
            }
        }
    
        if (foundProject) {
            // Print out the project info and confirm if user wants to deregister
            System.out.println("Project ID: " + projectToRemove.get(4));
            System.out.println("Supervisor name: " + projectToRemove.get(0));
            System.out.println("Supervisor email: " + projectToRemove.get(1));
            System.out.println("Project Title: " + projectToRemove.get(2));
            System.out.println("Status: " + projectToRemove.get(3));
            System.out.println("Student ID: " + projectToRemove.get(5));

            System.out.print("Do you want to deregister this project? (yes/no) ");
            sc.nextLine();
            String answer = sc.nextLine();
    
            if (answer.equalsIgnoreCase("yes")) {
                // Add the project to the deregisterProjects list
                deregisterProjects.add(projectToRemove);
                System.out.println("Project ID " + projectID + " has been requested to be deregistered.");
            } else {
                System.out.println("Project ID " + projectID + " has not been deregistered.");
            }
        } else {
            System.out.println("Project ID " + projectID + " not found.");
        }
    }

    public static void deregisterProjectApproval() {
        System.out.println("Projects pending for deregistering:\n");
        for (ArrayList<String> project : deregisterProjects) {
            System.out.println("Project ID: " + project.get(4));
            System.out.println("Project Title: " + project.get(0));
            System.out.println("Project Description: " + project.get(1));
            System.out.println("Student ID: " + project.get(5));
            System.out.println("Status: " + project.get(3));
            System.out.println();
        }

        System.out.print("Enter student ID to approve project deregistration: ");
        sc.nextLine();
        String studentID = sc.nextLine();

        boolean foundProject = false;
        for (int i = deregisterProjects.size() - 1; i >= 0; i--) {
            ArrayList<String> project = deregisterProjects.get(i);
            if (project.get(5).equals(studentID)) {
                System.out.println("\nProject to be deregistered:\n");
                System.out.println("Project ID: " + project.get(4));
                System.out.println("Project Title: " + project.get(0));
                System.out.println("Project Description: " + project.get(1));
                System.out.println("Student ID: " + project.get(5));
                System.out.println("Status: " + project.get(3));
                System.out.print("Do you want to approve deregistration of this project? (yes or no): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    // Remove the project from the deregisterProjects list
                    deregisterProjects.remove(i);

                    // Remove the project from the approvedProjectList
                    for (int j = approvedProjectList.size() -1; j >= 0; j--) {
                        ArrayList<String> approvedProject = approvedProjectList.get(j);
                        if (approvedProject.get(5).equals(studentID) && approvedProject.get(4).equals(project.get(4))) {
                            approvedProjectList.remove(j);
                            break;
                        }
                    }

                    // Update project status in allProjects and projectList
                    for (int k = allProjects.size() -1; k >= 0; k--) {
                        ArrayList<String> allProject = allProjects.get(k);
                        if (allProject.get(4).equals(project.get(4))) {
                            requestHistoryStudent.remove(allProject);
                            allProject.set(3, "available");
                            allProject.remove(5);
                            allProject.remove(6);
                            allProject.remove(7);
                            projectList.add(allProject);
                            requestHistoryStudent.add(allProject);
                            requestHistoryCoordinator.add(allProject);
                            break;
                        }                   
                    }

                    // Update studentInfo with deregistration status
                    for (int y = 0; y < studentInfo.size(); y++) {
                        String[] info = studentInfo.get(y);
                        if (info[0].equals(studentID)) {
                            info[2] = "Deregistered";
                            break;
                        }
                    }

                    foundProject = true;
                    System.out.println("\nProject deregistration approved.");
                    break;
                } else {
                    System.out.println("\nProject deregistration not approved.");
                    break;
                }
            }
        }

        if (!foundProject) {
            System.out.println("\nNo project found with student ID " + studentID + ".");
        }
    }   
    
    static ArrayList<ArrayList<String>> approvedProjectList = new ArrayList<>();
    static boolean foundProject = false;

    public static boolean registeredProjects(int projectID) {
        foundProject = false;
        for (int i = 0; i < reservedProjectList.size(); i++) {
            ArrayList<String> project = reservedProjectList.get(i);
            if (project.get(4).equals(Integer.toString(projectID)) && project.get(5).equals(studentID)) {
                project.set(3, "Approved");
                approvedProjectList.add(project);
                reservedProjectList.remove(i);
                System.out.println("Project ID " + projectID + " has been approved and registered.");

                // update allProjects list
                for (int j = 0; j < allProjects.size(); j++) {
                    ArrayList<String> project1 = allProjects.get(j);
                    if (project1.get(4).equals(Integer.toString(projectID))) {
                        allProjects.remove(j);
                        allProjects.add(project);
                    }
                }
                // Find the corresponding student info and change the status to "Allocated"
                String studentID = project.get(5);
                for (int k = 0; k < studentInfo.size(); k++) {
                    if (studentInfo.get(k)[0].equals(studentID)){
                        studentInfo.get(k)[2] = "Allocated";
                    }
                }
                // Change the status of the student's other reserved projects to "available"
                for (int y = reservedProjectList.size() - 1; y >= 0; y--) {
                    ArrayList<String> reservedProject = reservedProjectList.get(y);
                    if (reservedProject.get(5).equals(studentID)) {
                        reservedProject.set(3, "available");
                        projectList.add(reservedProject);
                        reservedProjectList.remove(y);
                    }
                }
                
            // Update request history
            for (ArrayList<String> history : requestHistoryStudent) {
                if (history.get(4).equals(Integer.toString(projectID))) {
                    history.set(3, "Allocated");
                    break;
                }
            }
            for (ArrayList<String> history : requestHistoryCoordinator) {
                if (history.get(4).equals(Integer.toString(projectID))) {
                    history.set(3, "Allocated");
                    break;
                }
            }
                foundProject = true;
                return foundProject;
            } 
        }
        System.out.println("Project ID " + projectID + " not found for student.");
        return foundProject;
    }

    public static void viewRegisteredProjects(String studentID) {
        boolean hasRegisteredProjects = false;
        for (ArrayList<String> project : approvedProjectList) {
            if (project.get(5).equals(studentID)) {
                System.out.println("Project ID: " + project.get(4));
                System.out.println("Supervisor name: " + project.get(0));
                System.out.println("Supervisor email address: " + project.get(1));
                System.out.println("Student name: " + project.get(6));
                System.out.println("Student email address: " + project.get(7));
                System.out.println("Project title: " + project.get(2));
                System.out.println("Status: " + project.get(3));
                System.out.println();
                hasRegisteredProjects = true;
            }
        }
        if (!hasRegisteredProjects) {
            System.out.println("No registered projects found.");
            return;
        } return;
    }    
    
    public static void disapproveRequest(String projectID) {
        for (int i = 0; i < reservedProjectList.size(); i++) {
            ArrayList<String> project = reservedProjectList.get(i);
            if (project.get(4).equals(projectID)) {
                project.set(3, "available");
                project.remove(7); // remove student email
                project.remove(6); // remove student name
                project.remove(5); // remove student ID
                projectList.add(project);
                reservedProjectList.remove(i);
                System.out.println("Project " + projectID + " has been disapproved.");
                foundProject = true;
                for (ArrayList<String> history : requestHistoryCoordinator) {
                    if (history.get(4).equals(projectID)){
                        history.set(3, "Not approved");
                        break;
                    }
                }
                for (ArrayList<String> history : requestHistoryStudent) {
                    if (history.get(4).equals(projectID)){
                        history.set(3, "Not approved");
                        break;
                    }
                } return;
            } 
        }
        if (!foundProject) {
            System.out.println("Project not found.");
            return;
        }
    }

    private static ArrayList<ArrayList<String>> allProjects = new ArrayList<ArrayList<String>>();
    private static int projectCount = 17;
    public static void createProject(int supervisorIndex) {
        sc.nextLine(); // consume new line character left by previous call to nextInt()
        String[] supervisorInfo = getSupervisorInfo(supervisorIndex);
        String supervisorName = supervisorInfo[3];
        String supervisorEmail = supervisorInfo[2];
        System.out.print("Enter project title: ");
        String title = sc.nextLine();
        String status = "available";
        int ID = projectCount;
        projectCount++;
        String[] project = {supervisorName, supervisorEmail, title, status, String.valueOf(ID)};
        projectList.add(new ArrayList<String>(Arrays.asList(project)));
        allProjects.add(new ArrayList<String>(Arrays.asList(project)));
        System.out.println("Project created.");
        return;
    }    

    public static void viewSubmittedProjects(int x) {
        String supervisorEmail = supervisorInfo.get(x)[2];
        ArrayList<ArrayList<String>> matchingProjects = new ArrayList<ArrayList<String>>();
        for (ArrayList<String> project : allProjects) {
            if (project.get(1).equals(supervisorEmail)) {
                matchingProjects.add(project);
            }
        }
        if (matchingProjects.size() == 0) {
            System.out.println("No projects created by you.");
        } else {
            System.out.println("Projects created by you:");
            for (ArrayList<String> project : matchingProjects) {
                System.out.println("Project ID: " + project.get(4));
                System.out.println("Supervisor name: " + project.get(0));
                System.out.println("Supervisor email: " + project.get(1));
                System.out.println("Project title: " + project.get(2));
                System.out.println("Project status: " + project.get(3));
                if (project.size() > 5) {
                    System.out.println("Student ID: " + project.get(5));
                }                
                System.out.println();
            }
        }
    }

    private static ArrayList<ArrayList<String>> changeTitleList = new ArrayList<>();
    public static void changeTitle(int x) {
        System.out.println("Enter project ID: ");
        sc.nextLine();
        String projectID = sc.nextLine();
        boolean found = false;
        for (ArrayList<String> project : approvedProjectList) {
            if (project.get(4).equals(projectID) && project.get(5).equals(studentInfo.get(x)[0])) {
                found = true;
                System.out.println("Enter new project title: ");
                String newTitle = sc.nextLine();
                ArrayList<String> changeTitle = new ArrayList<>();
                changeTitle.add(project.get(0)); // supervisor name
                changeTitle.add(project.get(1)); // supervisor email
                changeTitle.add(newTitle); // new project title
                changeTitle.add(project.get(3)); // status
                changeTitle.add(projectID); // project ID
                changeTitle.add(project.get(6)); // student name
                changeTitle.add(project.get(7)); // student email
                changeTitle.add("Title requested to changed from (" + project.get(2) + ") to (" + newTitle + ")");
                changeTitleList.add(changeTitle);
                System.out.println("Project title change request submitted.");
                requestHistoryStudent.add(changeTitle);
                return;
            }
        }
        if (!found) {
            System.out.println("You are not registered for this project or the project ID is invalid.");
            return;
        }
    }

    public static void changeTitleApproval(int x) {
        String supervisorName = getSupervisorInfo(x)[3];
        boolean foundPendingRequests = false;
        ArrayList<ArrayList<String>> projectsToApprove = new ArrayList<ArrayList<String>>();
        for (ArrayList<String> changeTitle : changeTitleList) {
            if (changeTitle.get(0).equals(supervisorName)) {
                foundPendingRequests = true;
                projectsToApprove.add(changeTitle);
            } else if (supervisorName == "Li Fang"){
                foundPendingRequests = true;
                projectsToApprove.add(changeTitle);
            }
        }
        if (!foundPendingRequests) {
            System.out.println("No pending project title change request.");
            return;
        }
        System.out.println("Projects to approve:");
        for (ArrayList<String> changeTitle : projectsToApprove) {
            System.out.println("Project ID: " + changeTitle.get(4));
            System.out.println("Requested by: " + changeTitle.get(6));
            System.out.println("New project title: " + changeTitle.get(2));
        }
        loop: while (!projectsToApprove.isEmpty()) {
            System.out.println("Enter the project ID you want to approve (or enter 'back' to return to main menu):");
            sc.nextLine();
            String projectID = sc.nextLine();
            if (projectID.equalsIgnoreCase("back")) {
                return;
            }
            boolean foundProjectToApprove = false;
            for (ArrayList<String> changeTitle : projectsToApprove) {
                if (changeTitle.get(4).equals(projectID)) {
                    foundProjectToApprove = true;
                    System.out.println("Do you approve this change? (Y/N)");
                    String approval = sc.nextLine();
                    String approvedProjectID = changeTitle.get(4);
                    if (approval.equalsIgnoreCase("Y")) {
                        for (ArrayList<String> approvedProject : approvedProjectList) {
                            if (approvedProject.get(4).equals(approvedProjectID)) {
                                approvedProject.set(2, changeTitle.get(2));
                                System.out.println("Title change request for project ID " + approvedProjectID + " approved.");
                                projectsToApprove.remove(changeTitle);
                            }
                        }
                        for (ArrayList<String> requestHistory : requestHistoryStudent) {
                            if (requestHistory.get(4).equals(approvedProjectID)) {
                                requestHistory.set(2, changeTitle.get(2));
                                requestHistory.add("Title change request approved");
                            }
                        }
                        changeTitleList.remove(changeTitle);
                        return;
                    } else if (approval.equalsIgnoreCase("N")){
                        System.out.println("Title change request for project ID " + approvedProjectID + " unapproved.");
                        changeTitleList.remove(changeTitle);
                        projectsToApprove.remove(changeTitle);
                        for (ArrayList<String> requestHistory : requestHistoryStudent) {
                            if (requestHistory.get(4).equals(approvedProjectID)) {
                                requestHistory.set(2, changeTitle.get(2));
                                requestHistory.add("Title change request unapproved");
                                return;
                            }
                        }
                        return;
                    } else {
                        System.out.println("Invalid input. Try again.");
                        continue loop;
                    }
                } else {
                    continue;
                }
            }
            if (!foundProjectToApprove) {
            System.out.println("Invalid project ID. Please try again.");
            }
        }
        if ((!projectsToApprove.isEmpty())){
            System.out.println("No more projects for approval. Returning to main menu...");
            return;
        }
    }

    public static boolean checkChangeTitleRequests(int x) {
        String supervisorName = getSupervisorInfo(x)[3];
        for (ArrayList<String> changeTitle : changeTitleList) {
            if (changeTitle.get(0).equals(supervisorName)) {
                return true;
            } else if (supervisorName == "Li Fang" && changeTitleList.size() != 0){
                return true;
            }
        }
        return false;
    }
    
    private static int supervisorLimit = 2;
    private static ArrayList<String> supervisorsOverLimit = new ArrayList<>();
    private static ArrayList<ArrayList<String>> unavailableProjectList = new ArrayList<>();
    
    public static void handleSupervisorProjectLimit() {    
        // loop through each supervisor and check their project count
        for (String[] supervisorArray : supervisorInfo) {
            ArrayList<String> supervisor = new ArrayList<>(Arrays.asList(supervisorArray));
            String supervisorEmail = supervisor.get(2);
            int projectCount = 0;
    
            for (ArrayList<String> approvedProject : approvedProjectList) {
                if (supervisorEmail.equalsIgnoreCase(approvedProject.get(1))) {
                    projectCount++;
                }
            }
    
            // remove any additional projects beyond the limit from projectList
            if (projectCount >= supervisorLimit) {
                for (int i = projectList.size() - 1; i >= 0; i--) {
                    ArrayList<String> project = projectList.get(i);
                    if (supervisorEmail.equalsIgnoreCase(project.get(1))) {
                        allProjects.remove(project);
                        project.set(3, "unavailable");
                        allProjects.add(project);
                        unavailableProjectList.add(project);
                        projectList.remove(i);
                    }
                }
                if(!supervisorsOverLimit.contains(supervisorEmail)) {
                    supervisorsOverLimit.add(supervisorEmail);
                }
                for (int j = reservedProjectList.size() - 1; j >= 0; j--) {
                    ArrayList<String> reservedProject = reservedProjectList.get(j);
                    if (supervisorEmail.equalsIgnoreCase(reservedProject.get(1))){
                        reservedProject.set(3, "unavailable");
                        unavailableProjectList.add(reservedProject);
                        reservedProjectList.remove(j);
                    }
                }
            } else {
                supervisorsOverLimit.remove(supervisorEmail);
            }
        }
        // check if any supervisor is now under the limit and add their unavailable projects back
        for (int i = unavailableProjectList.size() - 1; i >= 0; i--) {
            ArrayList<String> project = unavailableProjectList.get(i);
            String supervisorEmail = project.get(1);
            int projectCount = 0;
            for (ArrayList<String> approvedProject : approvedProjectList) {
                if (supervisorEmail.equalsIgnoreCase(approvedProject.get(1))) {
                    projectCount++;
                }
            }

            if (projectCount < supervisorLimit) {
                allProjects.remove(project);
                project.set(3, "available");
                projectList.add(project);
                allProjects.add(project);
                supervisorsOverLimit.remove(supervisorEmail);
                unavailableProjectList.remove(i);
            }
        }
    }
    
    private static boolean checkChangeSupervisor(){
        if (pendingSupervisorChanges.size() > 0){
            return true;
        }
        return false;
    }
    
    private static ArrayList<ArrayList<String>> pendingSupervisorChanges = new ArrayList<>();
    // Method for a supervisor to request a change of supervisor for a project
    public static void changeSupervisor(int x) {
        String[] supervisor = getSupervisorInfo(x);
        int count = 0;
        for (ArrayList<String> project : approvedProjectList){
            if (project.get(0).equals(supervisor[3])){
                System.out.println("Project ID: " + project.get(4));
                System.out.println("Supervisor name: " + project.get(0));
                System.out.println("Supervisor email: " + project.get(1));
                System.out.println("Project title: " + project.get(2));
                System.out.println("Project status: " + project.get(3));
                System.out.println("Student ID: " + project.get(5));
                System.out.println();
                count ++;
            }
        }
        int projectID = 0;
        if (count !=0){
            try {
                System.out.println("Enter project ID to change supervisor: ");
                projectID = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value for the project ID.");
                sc.next(); // clear the scanner buffer
                return; // handle the error, e.g. return or prompt the user to try again
            }

            sc.nextLine(); // consume the newline character
            System.out.println("Enter replacement supervisor ID: ");
            String newSupervisorID = sc.nextLine(); 

            // Add project to list of projects pending coordinator approval
            ArrayList<String> projectInfo = null;
            for (ArrayList<String> project : approvedProjectList) {
                if (project.get(4).equals(Integer.toString(projectID))) {
                    projectInfo = new ArrayList<>(project); // create a copy of the project info
                    break;
                }
            }

            for (String[] supervisors : supervisorInfo){
                if (supervisors[0].equalsIgnoreCase(newSupervisorID)){
                    int indexOfNewSupervisor = supervisorInfo.indexOf(supervisors);
                    if (projectInfo != null) {
                        requestHistorySupervisor.add(projectInfo);
                        requestHistoryCoordinator.add(projectInfo);
                        projectInfo.set(0, supervisorInfo.get(indexOfNewSupervisor)[3]); // update supervisor name
                        projectInfo.set(1, supervisorInfo.get(indexOfNewSupervisor)[2]); // update supervisor email
                        pendingSupervisorChanges.add(projectInfo);
                        System.out.println("Supervisor change request for project " + projectID + " has been submitted for coordinator approval.");
                    } else {
                        System.out.println("Project ID " + projectID + " not found in approved projects.");
                    }
                }
            }        
        } else {
            System.out.println("No approved projects to make transfer request.");
            return;
        }
    }   

    // Method for coordinator to approve or disapprove pending supervisor change requests
    public static void approveChangeSupervisor() {
        boolean haveRequests = false;
        System.out.println("Pending supervisor change requests:");
        loop: for (int i = pendingSupervisorChanges.size() - 1; i >= 0; i--) {
            ArrayList<String> project = pendingSupervisorChanges.get(i);
            for (ArrayList<String> approvedProject : approvedProjectList) {
                if (approvedProject.get(4).equals(project.get(4))) {
                    System.out.println("Project ID: " + project.get(4) + ", Current Supervisor: " + approvedProject.get(0) + ", New Supervisor: " + project.get(0));
                    System.out.println("Approve change? (yes/no)");
                    sc.nextLine();
                    String approval = sc.nextLine();
                    haveRequests = true;
                    if (approval.equalsIgnoreCase("yes")) {
                        String newSupervisorEmail = project.get(1);    
                        String newSupervisorName = project.get(0);
                        
                        // Check if replacement supervisor has already reached the project limit
                        for (String supervisors : supervisorsOverLimit){
                            if (newSupervisorEmail.equals(supervisors)){
                                System.out.println("The new supervisor has already reached the maximum number of projects.");
                                System.out.println("Do you still want to approve the change? (yes/no)");
                                approval = sc.nextLine();
                                if (!approval.equals("yes")) {
                                    continue loop; // skip to next project in the list
                                }
                            }
                        }

                        // Update project information
                        approvedProject.set(1, newSupervisorEmail);
                        approvedProject.set(0, newSupervisorName);

                        // update allProjects information
                        for (ArrayList<String> allProject : allProjects) {
                            if (allProject.get(4).equals(project.get(4))) {
                                allProject.set(1, newSupervisorEmail);
                                allProject.set(0, newSupervisorName);
                            }
                        }

                        // update requestHistoryCoordinator information
                        for (ArrayList<String> history : requestHistoryCoordinator) {
                            if (history.get(4).equals(project.get(4))) {
                                history.add("Supervisor Change (" + project.get(0) + " -> " + newSupervisorName + ")");
                                break;
                            }
                        }   

                        // update requestHistorySupervisor information
                        for (ArrayList<String> history : requestHistorySupervisor) {
                            if (history.get(4).equals(project.get(4))) {
                                history.add(8, "Supervisor Change (" + project.get(0) + " -> " + newSupervisorName + ")");
                                break;
                            }
                            System.out.println(requestHistorySupervisor);
                        }   

                        // Remove project from list of projects pending coordinator approval
                        pendingSupervisorChanges.remove(i);
                        System.out.println("Supervisor change request for project " + project.get(4) + " has been approved.");
                    } else {
                        // Remove project from list of projects pending coordinator approval
                        pendingSupervisorChanges.remove(i);
                        System.out.println("Supervisor change request for project " + project.get(4) + " has been rejected.");
                        
                        // update requestHistoryCoordinator information
                        for (ArrayList<String> history : requestHistoryCoordinator) {
                            if (history.get(4).equals(project.get(4))) {
                                history.add(8, "Supervisor change request rejected.");
                                break;
                            }
                        }   

                        // update requestHistorySupervisor information
                        for (ArrayList<String> history : requestHistorySupervisor) {
                            if (history.get(4).equals(project.get(4))) {
                                history.add(8, "Supervisor change request rejected.");
                                break;
                            }
                        } 
                    }
                } 
            }
            if (!haveRequests) {
                System.out.println("No pending requests.");
                return;
            }
        }
    }
    
    static int aStudent = 0; 
    static int aSupervisor = 0;

    //student's login interface
    public static void loginStudent(){   
        String userID = "";
        boolean foundUser = false;
        System.out.println("Enter your ID: ");
        while (!foundUser) {
            int aStudent = 0;
            if (!foundUser && userID != ""){
                System.out.println("Invalid input.");
                return;
            }
            userID = sc.nextLine();
            for (String[] Student : studentInfo) {
                if (Student[0].equals(userID)) {
                    System.out.println("Enter password: ");
                    inputPassword = sc.nextLine();
                    if (!inputPassword.equals(Student[1])) {
                        System.out.println("Wrong password!");
                        return;
                    } else {
                        foundUser = true;
                        loginMenuStudent(aStudent);
                        return;
                    }
                } else {
                    aStudent++;
                }
            }
        }
    }

    
    //supervisor's login interface
    public static void loginSupervisor(){   
        String userID = "";
        boolean foundUser = false;
        System.out.println("Enter your ID: ");
        while (!foundUser) {
            int aSupervisor = 0;
            if (!foundUser && userID != ""){
                System.out.println("Invalid input.");
                return;
            }
            userID = sc.nextLine();
            for (String[] supervisor : supervisorInfo) {
                if (supervisor[0].equals(userID)) {
                    System.out.println("Enter password: ");
                    inputPassword = sc.nextLine();
                    if (!inputPassword.equals(supervisor[1])) {
                        System.out.println("Wrong password!");
                        return;
                    } else {
                        foundUser = true;
                        loginMenuSupervisor(aSupervisor);
                        return;
                    }
                } else {
                    aSupervisor++;
                }
            }
        }
    }
              
    public static void changePasswordStudent(int x) {
        System.out.println("Enter your ID: ");
        sc.nextLine();
        String userID = sc.nextLine();
        boolean foundUser = false;
    
        // Check if userID is valid
        for (int i = 0; i < studentInfo.size(); i++) {
            String[] student = studentInfo.get(i);
            if (student[0].equals(userID)) {
                foundUser = true;
                String oldPassword, newPassword;
                int tries = 0;
                do {
                    System.out.println("Enter your old password: ");
                    oldPassword = sc.nextLine();
                    if (!oldPassword.equals(student[1])) {
                        System.out.println("Wrong password!");
                        tries++;
                    } else {
                        System.out.println("Enter new password: ");
                        newPassword = sc.nextLine();
                        student[1] = newPassword;
                        System.out.println("Password changed successfully. Please relogin.");
                        main(null);
                    }
                } while (tries <= 3 && !oldPassword.equals(student[1]));
                break; // Exit the loop if a valid userID is found
            }
        }
    
        if (!foundUser) {
            System.out.println("Invalid ID.");
            while (true) {
                System.out.println("Enter your ID again or enter (back) to exit: ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("back")) {
                    return;
                } else {
                    foundUser = false;
                    for (int i = 0; i < studentInfo.size(); i++) {
                        String[] student = studentInfo.get(i);
                        if (student[0].equals(choice)) {
                            foundUser = true;
                            String oldPassword, newPassword;
                            int tries = 0;
                            do {
                                System.out.println("Enter your old password: ");
                                oldPassword = sc.nextLine();
                                if (!oldPassword.equals(student[1])) {
                                    System.out.println("Wrong password!");
                                    tries++;
                                } else {
                                    System.out.println("Enter new password: ");
                                    newPassword = sc.nextLine();
                                    student[1] = newPassword;
                                    System.out.println("Password changed successfully. Please relogin.");
                                    main(null);
                                }
                            } while (tries <= 3 && !oldPassword.equals(student[1]));
                            break; // Exit the loop if a valid userID is found
                        }
                    }
                    if (foundUser) {
                        break;
                    } else {
                        System.out.println("Invalid ID.");
                    }
                }
            }
        }
    }
    
    
    public static void changePasswordSupervisor(int x) {
        System.out.println("Enter your ID: ");
        sc.nextLine();
        String userID = sc.nextLine();
        boolean foundUser = false;
    
        // Check if userID is valid
        for (int i = 0; i < supervisorInfo.size(); i++) {
            String[] supervisor = supervisorInfo.get(i);
            if (supervisor[0].equals(userID)) {
                foundUser = true;
                String oldPassword, newPassword;
                int tries = 0;
                do {
                    System.out.println("Enter your old password: ");
                    oldPassword = sc.nextLine();
                    if (!oldPassword.equals(supervisor[1])) {
                        System.out.println("Wrong password!");
                        tries++;
                    } else {
                        System.out.println("Enter new password: ");
                        newPassword = sc.nextLine();
                        supervisor[1] = newPassword;
                        System.out.println("Password changed successfully. Please relogin.");
                        main(null);
                    }
                } while (tries <= 3 && !oldPassword.equals(supervisor[1]));
                break; // Exit the loop if a valid userID is found
            }
        }
    
        if (!foundUser) {
            System.out.println("Invalid ID.");
            while (true) {
                System.out.println("Enter your ID again or enter (back) to exit: ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("back")) {
                    return;
                } else {
                    foundUser = false;
                    for (int i = 0; i < supervisorInfo.size(); i++) {
                        String[] supervisor = supervisorInfo.get(i);
                        if (supervisor[0].equals(choice)) {
                            foundUser = true;
                            String oldPassword, newPassword;
                            int tries = 0;
                            do {
                                System.out.println("Enter your old password: ");
                                oldPassword = sc.nextLine();
                                if (!oldPassword.equals(supervisor[1])) {
                                    System.out.println("Wrong password!");
                                    tries++;
                                } else {
                                    System.out.println("Enter new password: ");
                                    newPassword = sc.nextLine();
                                    supervisor[1] = newPassword;
                                    System.out.println("Password changed successfully. Please relogin.");
                                    main(null);
                                }
                            } while (tries <= 3 && !oldPassword.equals(supervisor[1]));
                            break; // Exit the loop if a valid userID is found
                        }
                    }
                    if (foundUser) {
                        break;
                    } else {
                        System.out.println("Invalid ID.");
                    }
                }
            }
        }
    }
    

    public static void loginMenuStudent(int x){
        int choice;
        // for students who hasnt registered for a project
        if (!studentInfo.get(x)[2].equals("Allocated")){
            loop1: while (true){
                System.out.println("(1) View all available projects");
                System.out.println("(2) View registered project and change project title");
                System.out.println("(3) View request history and status");
                System.out.println("(4) Request to deregister FYP");
                System.out.println("(5) Change password");
                System.out.println("(6) Log out");
                choice = sc.nextInt();
                if (choice == 1 && !studentInfo.get(x)[2].equals("Deregistered")){
                    System.out.println("Projects:");
                    for (ArrayList<String> project : projectList) {
                        System.out.println("Project ID: " + project.get(4));
                        System.out.println("Supervisor name: " + project.get(0));
                        System.out.println("Supervisor email address: " + project.get(1));
                        System.out.println("Project title: " + project.get(2));
                        System.out.println("Status: " + project.get(3));
                        System.out.println();
                    }
                    System.out.println("(1) Register for project");
                    System.out.println("(2) Back to main menu");
                    choice = sc.nextInt();
                    if (choice == 1){
                        System.out.println("Input project ID: ");
                        sc.nextLine();
                        String projectID = sc.nextLine();
                        int index = getProjectInfo(projectID);
                        if (index != -1) {
                            ArrayList<String> project = projectList.get(index);
                            System.out.println("Confirm project information:");
                            System.out.println("Project ID: " + project.get(4));
                            System.out.println("Supervisor name: " + project.get(0));
                            System.out.println("Supervisor email address: " + project.get(1));
                            System.out.println("Project title: " + project.get(2));
                            System.out.println("Status: " + project.get(3));
                            System.out.println("Input \"Yes\" to confirm");
                            String confirm = sc.next();
                            if (confirm.equalsIgnoreCase("Yes")) {
                                // submit project registration request using reservedRequest method, return student to new login menu
                                System.out.println("Project registration request submitted.");
                                project.set(3, "Reserved");
                                studentInfo.get(x)[2] = "Reserved";
                                reservedRequest(project.get(4), studentInfo.get(x)[0]);
                                loginMenuStudent(x);
                            }
                            else {
                                System.out.println("Returning back to main menu...");
                                continue loop1;
                            }
                        } else{
                            loginMenuStudent(x);
                        }
                        break;
                    }
                    else if (choice == 2){
                        loginMenuStudent(x);
                    } else {
                        System.out.println("Invalid input. Enter again.");
                        continue loop1;
                    }
                } 
                else if (choice == 1 && studentInfo.get(x)[2].equals("Deregistered")){
                    System.out.println("You are not allowed to make selection again as you deregistered your FYP.");
                    continue;
                }
                else if (choice == 2){
                    System.out.println("You have not registered a project.");
                    continue;
                }
                else if (choice == 3){
                    requestHistoryStudent(studentInfo.get(x)[0]);
                    continue;
                }
                else if (choice == 4){
                    System.out.println("You have not registered a project.");
                }
                else if (choice == 5){
                    changePasswordStudent(x);
                    continue;
                }
                else if (choice == 6){
                    main(null);;
                } else {
                    System.out.println("Invalid input. Enter again.");
                    continue;
                }
            }
        }
        // for students who have registered for a project
        else {
            while (true){
                System.out.println("(1) View all available projects");
                System.out.println("(2) View registered project and change project title");
                System.out.println("(3) View request history and status");
                System.out.println("(4) Request to deregister FYP");
                System.out.println("(5) Change password");
                System.out.println("(6) Log out");
                choice = sc.nextInt();
                if (choice == 1){
                    System.out.println("You are currently allocated to a FYP and do not have access to available project list.");
                    continue;
                }
                else if (choice == 2){
                    viewRegisteredProjects(studentInfo.get(x)[0]);
                    System.out.println("(1) Change project title");
                    System.out.println("(2) Exit");
                    choice = sc.nextInt();
                    if (choice == 1){
                        changeTitle(x);
                    } else if (choice == 2){
                        continue;
                    } else{
                        System.out.println("Invalid input. Enter again.");
                        continue;
                    }
                } 
                else if (choice == 3){
                    requestHistoryStudent(studentInfo.get(x)[0]);
                    continue;
                } 
                else if (choice == 4){
                    viewRegisteredProjects(studentInfo.get(x)[0]);
                    System.out.println("Input project ID to confirm:");
                    int projectID = sc.nextInt();
                    deregisterProject(projectID);
                }
                else if (choice ==5){
                    changePasswordStudent(x);
                    continue;
                }
                else if (choice == 6){
                    main(null);
                } 
                else{
                    System.out.println("Invalid input. Enter again.");
                    continue;
                }
            }
        }
    }

    public static void loginMenuSupervisor(int x) {
        int choice;
        loop: while (true) {
            handleSupervisorProjectLimit();
            boolean coordinator = isCoordinator(x);
            if (coordinator){
                System.out.println("(1) View pending student requests" + (checkChangeTitleRequests(x) || checkReservedProjects() || checkDeregisterProjects() ? " (NEW)" : ""));
                System.out.println("(2) View pending supervisor's transfer student request" + (checkChangeSupervisor() ? " (NEW)" : ""));
            } else{
                System.out.println("(1) View pending project title change request" + (checkChangeTitleRequests(x) ? " (NEW)" : ""));
                System.out.println("(2) Request to transfer student to another supervisor");
            }
            System.out.println("(3) Create/update/view project");
            System.out.println("(4) View incoming/outgoing project request history");
            System.out.println("(5) Change password");
            System.out.println("(6) Log out");
            choice = sc.nextInt();
            if (choice == 1) {
                if (coordinator){ //coordinator
                    System.out.println("(1) View pending project title change request" + (checkChangeTitleRequests(x) ? " (NEW)" : ""));
                    System.out.println("(2) View pending project request" + (checkReservedProjects() ? " (NEW)" : ""));
                    System.out.println("(3) View pending deregister project request" + (checkDeregisterProjects() ? " (NEW)" : ""));
                    choice = sc.nextInt();
                    if (choice == 1){
                        changeTitleApproval(x);
                        continue;
                    } else if (choice ==2){
                        // Check if there are reserved projects for approval
                        boolean foundProject = viewReserved();
                        if (foundProject){
                            System.out.println("(1) Approve pending request");
                            System.out.println("(2) Disapprove pending request");
                            System.out.println("(3) Go back to main menu");
                            choice = sc.nextInt();
                            loop2: if (choice == 1) {
                                System.out.println("Input project ID: ");
                                int projectID = sc.nextInt();
                                registeredProjects(projectID);
                                if (!foundProject) {
                                    break loop2;
                                } else {
                                    continue loop;
                                }
                            } else if (choice == 2) {
                                System.out.println("Input project ID: ");
                                sc.nextLine();
                                String projectID = sc.nextLine();
                                disapproveRequest(projectID);
                                continue loop;
                            } else if (choice == 3) {
                                continue loop;
                            } else {
                                System.out.println("Invalid choice, enter again: ");
                                break loop2;
                            }
                        } else {
                            continue loop;
                        }
                    } else if (choice == 3){
                        deregisterProjectApproval();
                    } else {
                        System.out.println("Invalid input");
                        continue loop;
                    }
                } else { // supervisor
                    changeTitleApproval(x);
                    continue;
                }
            } else if (choice == 2){
                if(coordinator){
                    approveChangeSupervisor();
                } else{
                    changeSupervisor(x);
                }
            } else if (choice == 3) {
                System.out.println("(1) Create new project");
                System.out.println("(2) Update project");
                System.out.println("(3) View project");
                int projectChoice = sc.nextInt();
                if (projectChoice == 1) {
                    createProject(x);
                } else if (projectChoice == 2) {
                    //code to update project title
                    viewSubmittedProjects(x);
                    System.out.println("Enter project ID to update title:");
                    sc.nextLine();
                    String projectID = sc.nextLine();
                    boolean foundProject = false;
                    for (ArrayList<String> project : allProjects) { 
                        if (project.get(4).equals(projectID) && getSupervisorInfo(x)[2].equals(project.get(1))){
                            System.out.println("Enter new project title:");
                            String newTitle = sc.nextLine();
                            project.set(2, newTitle);
                            foundProject = true;
                            System.out.println("Project title updated.");
                            String status = project.get(3);
                            if (status.equalsIgnoreCase("available")){
                                for (ArrayList<String> projectList : projectList) { 
                                    if (projectList.get(4).equals(projectID)){
                                        projectList.set(2, newTitle);
                                    }
                                }
                            } else if (status.equalsIgnoreCase("reserved")){
                                for (ArrayList<String> reservedProject : reservedProjectList) { 
                                    if (reservedProject.get(4).equals(projectID)){
                                        reservedProject.set(2, newTitle);
                                    }
                                }
                            } else if (status.equalsIgnoreCase("unavailable")){
                                for (ArrayList<String> unavailableProject : unavailableProjectList) { 
                                    if (unavailableProject.get(4).equals(projectID)){
                                        unavailableProject.set(2, newTitle);
                                    }
                                }
                            } else if (status.equalsIgnoreCase("allocated")){
                                for (ArrayList<String> approvedProject : approvedProjectList) { 
                                    if (approvedProject.get(4).equals(projectID)){
                                        approvedProject.set(2, newTitle);
                                    }
                                }
                            }
                        }
                    } if (!foundProject){
                        System.out.println("Project ID not found");
                    }
                } else if (projectChoice == 3) {
                    if (!coordinator){
                        viewSubmittedProjects(x);
                    } else{
                        System.out.println("(1) View all projects");
                        System.out.println("(2) View submitted projects");
                        System.out.println("(3) Generate project details report with filters");
                        choice = sc.nextInt();
                        loop3: if (choice == 1){
                            for (ArrayList<String> project : allProjects){
                                System.out.println("Project ID: " + project.get(4));
                                System.out.println("Supervisor name: " + project.get(0));
                                System.out.println("Supervisor email address: " + project.get(1));
                                System.out.println("Student name: " + project.get(6));
                                System.out.println("Student email address: " + project.get(7));
                                System.out.println("Project title: " + project.get(2));
                                System.out.println("Status: " + project.get(3));
                                System.out.println();
                                continue;
                            }
                        } else if (choice == 2) {
                            viewSubmittedProjects(x);
                            continue;
                        } else if (choice == 3) {
                                System.out.println("Choose an option:");
                                System.out.println("(1) View project details by supervisor");
                                System.out.println("(2) View project details by status");
                                System.out.println("(3) View project details by student");
                                System.out.println("(4) Back to main menu");
                                int option = sc.nextInt();
                                sc.nextLine(); // consume the newline character
                            
                                if (option == 1) {
                                    System.out.println("Enter supervisor name: ");
                                    String supervisorName = sc.nextLine();
                                    boolean found = false;
                                    for (ArrayList<String> project : allProjects) {
                                        if (project.get(0).equalsIgnoreCase(supervisorName)) {
                                            System.out.println("Project ID: " + project.get(4));
                                            System.out.println("Supervisor name: " + project.get(0));
                                            System.out.println("Supervisor email address: " + project.get(1));
                                            System.out.println("Project title: " + project.get(2));
                                            System.out.println("Status: " + project.get(3));
                                            System.out.println("Requested by: " + project.get(5)); // student ID
                                            System.out.println("Student's name: " + project.get(6));
                                            System.out.println("Student's email address: " + project.get(7));
                                            System.out.println();
                                            found = true;
                                        }
                                    } if (!found) {
                                        System.out.println("No projects found.");
                                        continue loop;
                                    }
                                } else if (option == 2) {
                                    System.out.println("Enter project status (available, reserved, unavailable or allocated): ");
                                    String status = sc.nextLine();
                                    for (ArrayList<String> project : allProjects) {
                                        if (project.get(3).equalsIgnoreCase(status)) {
                                            System.out.println("Project ID: " + project.get(4));
                                            System.out.println("Supervisor name: " + project.get(0));
                                            System.out.println("Supervisor email address: " + project.get(1));
                                            System.out.println("Project title: " + project.get(2));
                                            System.out.println("Status: " + project.get(3));
                                            System.out.println("Requested by: " + project.get(5)); // student ID
                                            System.out.println("Student's name: " + project.get(6));
                                            System.out.println("Student's email address: " + project.get(7));
                                            System.out.println();
                                        } else {
                                            System.out.println("No " + status + " projects.");
                                            continue loop;
                                        }
                                    }
                                } else if (option == 3) {
                                    System.out.println("Enter student name: ");
                                    String studentName = sc.nextLine();
                                    for (ArrayList<String> project : allProjects) {
                                        if (project.get(6).equalsIgnoreCase(studentName)) {
                                            System.out.println("Project ID: " + project.get(4));
                                            System.out.println("Supervisor name: " + project.get(0));
                                            System.out.println("Supervisor email address: " + project.get(1));
                                            System.out.println("Project title: " + project.get(2));
                                            System.out.println("Status: " + project.get(3));
                                            System.out.println("Requested by: " + project.get(5)); // student ID
                                            System.out.println("Student's name: " + project.get(6));
                                            System.out.println("Student's email address: " + project.get(7));
                                            System.out.println();
                                        } else {
                                            System.out.println(studentName + " is not registered a project.");
                                            continue loop;
                                        }
                                    }
                                } else if (choice == 4) {
                                    continue loop;
                                } else {
                                    System.out.println("Invalid option. Please try again.");
                                    break loop3;
                                }
                            }
                            
                    }
                    
                } else {
                    System.out.println("Invalid choice, enter again.");
                    continue;
                }
            } else if (choice == 4) {
                if (coordinator){
                    requestHistoryCoordinator();
                } else {
                    requestHistorySupervisor(x);
                }
            } else if (choice == 5) {
                changePasswordSupervisor(x);
                continue;
            } else if (choice == 6) {
                main(null);
            } else {
                System.out.println("Invalid input. Enter again.");
                continue;
            }
        }
    }
    
    public static void main(String[] args) {
        populateProjectList();
        handleSupervisorProjectLimit();
        int choice;
        loop: while (true) {
            System.out.println("(1) Login (student)");
            System.out.println("(2) Login (supervisor)");
            System.out.println("(3) Login (coordinator)");
            Scanner sc = new Scanner(System.in);
            try {
                choice = sc.nextInt();
                while (true) {
                    if (choice == 1) {
                        loginStudent();
                        continue loop;
                    } else if (choice == 2) {
                        loginSupervisor();
                        continue loop;
                    } else if (choice == 3){
                        loginSupervisor();
                        continue loop;
                    } else {
                        System.out.println("Invalid input.");
                        continue loop;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1/2/3.");
                sc.nextLine(); // clear scanner buffer
            }
        }
    }
}
