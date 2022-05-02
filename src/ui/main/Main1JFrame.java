package ui.main;

import db.DbUtils;
import java.util.List;
import javax.swing.JOptionPane;
import model.RS_HallBooking;
import model.RS_BC_Events;
import model.RS_Client;
import model.RS_BusinessCatalogue;
import model.RS_BC_Entertainment;
import model.RS_BC_Resort;
import model.RS_Supervisor;
import model.RS_ServiceLocation;
import model.RS_BC_Catering;
import model.RS_Administrator;
import ui.ClientRole.RS_AddServiceJPanel;
import ui.ClientRole.RS_ServiceBookEventJPanel;
import ui.ClientRole.RS_ResortBookingServicesJPanel;
import ui.ClientRole.RS_ClientJPanel;
import ui.ClientRole.RS_EntertainmentServicesJPanel;
import ui.ClientRole.RS_OtherServicePanel;
import ui.ClientRole.RS_ManageBooking;
import ui.ClientRole.RS_CateringServicePanel;
import ui.ClientRole.RS_ReportServiceDetailsPanel;
import ui.EventManagerRole.RS_EventSupervisorPanel;
import ui.EventManagerRole.RS_SuperviseAdminEventOrganisation;
import ui.EventManagerRole.RS_SuperviseEventOrg;
import ui.EventManagerRole.RS_DisplayEventPanel;
import ui.EntertainmentsupervisorRole.RS_DisplayDashboardPanel;
import ui.EntertainmentsupervisorRole.RS_EntertainmentSupervisorPanel;
import ui.CateringManagerRole.RS_ManageOrgPanelForCatering;
import ui.EntertainmentsupervisorRole.RS_OrganizationAdminPanel;
import ui.EntertainmentsupervisorRole.RS_SuperviseOrganizationPanel;
import ui.ResortManagerRole.RS_ResortMainPanel;
import ui.ResortManagerRole.RS_SuperviseAdminOrgForResort;
import ui.ResortManagerRole.RS_SuperviseOrgForResort;
import ui.ResortManagerRole.RS_SuperviseRoomPanel;
import ui.ResortManagerRole.RS_DisplayOrderForResort;
import ui.CateringManagerRole.RS_AddOrderJPanel;
import ui.CateringManagerRole.RS_ManageOrgAdminForCatering;
import ui.CateringManagerRole.RS_CateringMainPanel;
import ui.CateringManagerRole.RS_ViewTaskPanelCatering;
import ui.EventPlannerAdminRole.RS_ManageClientJPanel;
import ui.EventPlannerAdminRole.RS_BusinessCatalogueJPanel;
import ui.EventPlannerAdminRole.RS_BusinessCatalogueSupervisorJPanel;
import ui.EventPlannerAdminRole.RS_ServiceLocationsJPanel;
import ui.EventPlannerAdminRole.RS_EventsPlannerAdminJPanel;
import ui.confirm.RS_WorkRequestsForEventPanel;


public class Main1JFrame extends javax.swing.JFrame {

    private RS_Administrator EPAdmin;
    private String userName;
    private String password;

    public Main1JFrame() {
        initComponents();
        this.EPAdmin = DbUtils.getInstance().retrieveSystem();
        logoutBtn.setEnabled(false);
        ControlPanel.setBackground(new java.awt.Color(0, 102, 102));
        WorkArea.setBackground(new java.awt.Color(255, 208, 56));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        WorkArea = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBackground(new java.awt.Color(0, 102, 102));
        ControlPanel.setPreferredSize(new java.awt.Dimension(138, 813));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD");

        loginBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(ControlPanel);

        WorkArea.setBackground(new java.awt.Color(255, 208, 56));
        WorkArea.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 1, 75)); // NOI18N
        jLabel3.setText("River Stone Event Planner");
        WorkArea.add(jLabel3);
        jLabel3.setBounds(150, 370, 724, 89);

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        WorkArea.add(jLabel7);
        jLabel7.setBounds(305, 232, 0, 0);

        jLabel12.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel12.setText("Dream Fullfillment...");
        WorkArea.add(jLabel12);
        jLabel12.setBounds(670, 710, 430, 48);
        WorkArea.add(jLabel16);
        jLabel16.setBounds(910, 340, 0, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        WorkArea.add(jLabel4);
        jLabel4.setBounds(380, 160, 290, 150);

        jSplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        System.out.println("Logout called.");
        DbUtils.getInstance().storeSystem(EPAdmin);
        jSplitPane.setRightComponent(WorkArea);
        loginBtn.setEnabled(true);
        logoutBtn.setEnabled(false);
        usernameField.setText("");
        passwordField.setText("");
        System.out.println("Logout success.");
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        this.userName = usernameField.getText();
        this.password = passwordField.getText();

        if (EPAdmin.validateUserNamePassword(userName, password)) {
            String type = EPAdmin.findUserType(userName);

            switch (type) {
                case "admin":
                RS_EventsPlannerAdminJPanel systemAdministration = new RS_EventsPlannerAdminJPanel(EPAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel);
                jSplitPane.setRightComponent(systemAdministration);
                break;

                case "Client":
                renderClient(userName);
                break;

                case "Entertainment":
                renderEntertainmentManager(userName);
                break;

                case "Catering":
                renderCateringManager(userName);
                break;

                case "Resort":
                resortSupervisorPanel();
                break;

                case "Event":
                eventManagerPanel();
                break;
                case "BirthdayParty":
                WorkRequestForEvent();
                break;
                case "Meeting":
                WorkRequestForEvent();
                break;
                case "Wedding":
                WorkRequestForEvent();
                break;
                case "ServiceAgent":
                WorkRequestForEvent();
                break;
                case "TourGuide":
                WorkRequestForEvent();
                break;
                case "CarService":
                WorkRequestForEvent();
                break;
                case "Magician":
                WorkRequestForEvent();
                break;
                case "Singer":
                WorkRequestForEvent();
                break;
                case "Choreographer":
                WorkRequestForEvent();
                break;
                default:
                JOptionPane.showMessageDialog(this, "Type not supported.");
                return;
            }
            usernameField.setText("");
            passwordField.setText("");
            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void renderNetworkPanel() {
        RS_ServiceLocationsJPanel network1 = new RS_ServiceLocationsJPanel(EPAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(network1);
    }

    private void renderEnterprisePanel() {
        RS_BusinessCatalogueJPanel enterprise = new RS_BusinessCatalogueJPanel(EPAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(enterprise);
    }

    private void renderCustomerPanel() {
        RS_ManageClientJPanel customer = new RS_ManageClientJPanel(EPAdmin, this ::renderSystemAdminPanel);
//        RS_ManageClientJPanel client = new RS_ManageClientJPanel(EPAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(customer);
    }

    private void renderManagerPanel() {
        RS_BusinessCatalogueSupervisorJPanel manager = new RS_BusinessCatalogueSupervisorJPanel(EPAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(manager);
    }

    private void renderSystemAdminPanel() {
        jSplitPane.setRightComponent(new RS_EventsPlannerAdminJPanel(EPAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main1JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void renderClient(String username) {
        RS_Client client = EPAdmin.getClientDirectory().findClientUsername(username);
        RS_ClientJPanel clientPanel = new RS_ClientJPanel(EPAdmin, this::renderBookHallRoomPanel, this::manageBooking);
        jSplitPane.setRightComponent(clientPanel);
    }

    private void renderBookHallRoomPanel() {
        RS_ResortBookingServicesJPanel bookrhalloomPanel = new RS_ResortBookingServicesJPanel(EPAdmin, this::manageClientPanel, userName);
        jSplitPane.setRightComponent(bookrhalloomPanel);
    }

    private void manageBooking() {
        RS_ManageBooking manageBookingPanel = new RS_ManageBooking(EPAdmin, this::manageClientPanel, this::addServices, this::viewService, userName);
        jSplitPane.setRightComponent(manageBookingPanel);
    }

    private void manageClientPanel() {
        jSplitPane.setRightComponent(new RS_ClientJPanel(EPAdmin, this::renderBookHallRoomPanel, this::manageBooking));
    }

    private void addServices(RS_HallBooking booking) {
        RS_AddServiceJPanel service = new RS_AddServiceJPanel(EPAdmin, this::bookEvent, this::placeOrder, this::healthPanel,
                this::resortService, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(service);
    }

    private void bookEvent(RS_HallBooking booking) {
        RS_ServiceBookEventJPanel event = new RS_ServiceBookEventJPanel(EPAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(event);
    }

    private void placeOrder(RS_HallBooking booking) {           //customer order from catering
        RS_CateringServicePanel order = new RS_CateringServicePanel(EPAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(order);
    }

    private void healthPanel(RS_HallBooking booking) {             // healthclub panel for client
        RS_EntertainmentServicesJPanel healthClub = new RS_EntertainmentServicesJPanel(EPAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(healthClub);
    }

    private void resortService(RS_HallBooking booking) {    //laundary and transport service panel fpr client
        RS_OtherServicePanel resortPanel = new RS_OtherServicePanel(EPAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(resortPanel);
    }

    private void viewService(RS_HallBooking booking) {
        RS_ReportServiceDetailsPanel viewService = new RS_ReportServiceDetailsPanel(EPAdmin, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(viewService);
    }

    private void renderEntertainmentManager(String username) {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Entertainment> entertainment = location.get(i).getBusinessCatalogueDirectory().getListOfEntertainment();
            for (int j = 0; j < entertainment.size(); j++) {
                List<RS_Supervisor> supervisor = entertainment.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        RS_EntertainmentSupervisorPanel entertainmentSupervisorPanel = new RS_EntertainmentSupervisorPanel(EPAdmin, this::viewTaskPanel, this::createOrganization,
                                this::organizationAdminPanel);
                        jSplitPane.setRightComponent(entertainmentSupervisorPanel);

                    }
                }
            }
        }
    }

    private RS_ServiceLocation findUserNetworkForHealthClub() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Entertainment> entertainment = location.get(i).getBusinessCatalogueDirectory().getListOfEntertainment();
            for (int j = 0; j < entertainment.size(); j++) {
                List<RS_Supervisor> supervisor = entertainment.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return location.get(i);

                    }
                }
            }
        }
        return null;
    }

    private RS_BusinessCatalogue findUserHealthClub() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Entertainment> entertainment = location.get(i).getBusinessCatalogueDirectory().getListOfEntertainment();
            for (int j = 0; j < entertainment.size(); j++) {
                List<RS_Supervisor> supervisor = entertainment.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return entertainment.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void viewTaskPanel() {   //view task for entertainment club
        String type = EPAdmin.findUserType(userName);
        RS_BC_Entertainment entertainment = (RS_BC_Entertainment) findUserHealthClub();
        RS_DisplayDashboardPanel displayDashboard = new RS_DisplayDashboardPanel(EPAdmin, this::healthClubManagerPanel, userName, type, entertainment
        );
        jSplitPane.setRightComponent(displayDashboard);
    }

    private void createOrganization() {
        RS_ServiceLocation location = findUserNetworkForHealthClub();
        RS_SuperviseOrganizationPanel org = new RS_SuperviseOrganizationPanel(EPAdmin, this::healthClubManagerPanel, userName, location);
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {   //create org admin for entertainment club
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location = findUserNetworkForHealthClub();
        RS_OrganizationAdminPanel orgAdmin = new RS_OrganizationAdminPanel(EPAdmin, this::healthClubManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void healthClubManagerPanel() {   //go back to healthclub
        jSplitPane.setRightComponent(new RS_EntertainmentSupervisorPanel(EPAdmin, this::viewTaskPanel, this::createOrganization, this::organizationAdminPanel));
    }

    private void renderCateringManager(String username) {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Catering> catering = location.get(i).getBusinessCatalogueDirectory().getListOfCatering();
            for (int j = 0; j < catering.size(); j++) {
                List<RS_Supervisor> supervisor = catering.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        RS_CateringMainPanel cateringAssign = new RS_CateringMainPanel(EPAdmin, this::renderViewTask1, this::renderCateringOrg, this::renderCateringAdmin, this::addOrderPanel);
                        jSplitPane.setRightComponent(cateringAssign);
                    }
                }
            }
        }
    }

    private RS_ServiceLocation findUserLocationForCatering() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Catering> catering = location.get(i).getBusinessCatalogueDirectory().getListOfCatering();
            for (int j = 0; j < catering.size(); j++) {
                List<RS_Supervisor> supervisor = catering.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return location.get(i);

                    }
                }
            }
        }
        return null;
    }

    private RS_BusinessCatalogue findUserCatering() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Catering> catering = location.get(i).getBusinessCatalogueDirectory().getListOfCatering();
            for (int j = 0; j < catering.size(); j++) {
                List<RS_Supervisor> supervisor = catering.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return catering.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask1() {
        String type = EPAdmin.findUserType(userName);
        RS_BC_Catering catering = (RS_BC_Catering) findUserCatering();
        RS_ViewTaskPanelCatering resMan = new RS_ViewTaskPanelCatering(EPAdmin, this::cateringManagerPanel, userName, type, catering);
        jSplitPane.setRightComponent(resMan);
    }

    private void renderCateringOrg() {
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location = findUserLocationForCatering();
        RS_ManageOrgPanelForCatering org = new RS_ManageOrgPanelForCatering(EPAdmin, this::cateringManagerPanel, userName, type, location
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderCateringAdmin() { //create organisation admin under restauarant
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location = findUserLocationForCatering();
        RS_ManageOrgAdminForCatering orgAdmin = new RS_ManageOrgAdminForCatering(EPAdmin, this::cateringManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void addOrderPanel() {
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location = findUserLocationForCatering();
        RS_AddOrderJPanel order = new RS_AddOrderJPanel(EPAdmin, this::cateringManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(order);
    }

    private void cateringManagerPanel() {
        jSplitPane.setRightComponent(new RS_CateringMainPanel(EPAdmin, this::renderViewTask1, this::renderCateringOrg,
                this::renderCateringAdmin, this::addOrderPanel));
    }

    private void renderResortManager(String username) {   //hotel panel
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Resort> hotel = location.get(i).getBusinessCatalogueDirectory().getListOfResort();
            for (int j = 0; j < hotel.size(); j++) {
                List<RS_Supervisor> supervisor = hotel.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        RS_ResortMainPanel resortPanel = new RS_ResortMainPanel(EPAdmin, this::renderViewTask2, this::renderResortOrg,
                                this::renderResortAdmin, this::renderRoomPanel);
                        jSplitPane.setRightComponent(resortPanel);

                    }
                }
            }
        }
    }

    private RS_ServiceLocation findUserLocationForResort() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Resort> resort = location.get(i).getBusinessCatalogueDirectory().getListOfResort();
            for (int j = 0; j < resort.size(); j++) {
                List<RS_Supervisor> supervisor = resort.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        System.out.println("manager found is " + supervisor.get(k).getUsername() + " and city is " + location.get(i));
                        return location.get(i);
                    }
                }
            }
        }
        return null;
    }

    private RS_BusinessCatalogue findManagerHotel() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Resort> resort = location.get(i).getBusinessCatalogueDirectory().getListOfResort();
            for (int j = 0; j < resort.size(); j++) {
                List<RS_Supervisor> supervisor = resort.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return resort.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask2() {
        String type = EPAdmin.findUserType(userName);
        RS_BC_Resort resort = (RS_BC_Resort) findManagerHotel();
        RS_DisplayOrderForResort resortPanel = new RS_DisplayOrderForResort(EPAdmin, this::resortSupervisorPanel, userName, type, resort);
        jSplitPane.setRightComponent(resortPanel);
    }

    private void renderResortOrg() {
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location1 = findUserLocationForResort();
        RS_SuperviseOrgForResort org = new RS_SuperviseOrgForResort(EPAdmin, this::resortSupervisorPanel, userName, type, location1);
        jSplitPane.setRightComponent(org);
    }

    private void renderResortAdmin() {
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location1 = findUserLocationForResort();

        RS_SuperviseAdminOrgForResort orgAdmin = new RS_SuperviseAdminOrgForResort(EPAdmin, this::resortSupervisorPanel, userName, type, location1);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderRoomPanel() {
        RS_ServiceLocation location = findUserLocationForResort();
        RS_SuperviseRoomPanel room = new RS_SuperviseRoomPanel(EPAdmin, this::resortSupervisorPanel, location, userName);
        jSplitPane.setRightComponent(room);
    }

    private void resortSupervisorPanel() {
        jSplitPane.setRightComponent(new RS_ResortMainPanel(EPAdmin, this::renderViewTask2, this::renderResortOrg, this::renderResortAdmin, this::renderRoomPanel));
    }

    private void renderEventManager(String username) {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Events> event = location.get(i).getBusinessCatalogueDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<RS_Supervisor> supervisor = event.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(username)) {
                        RS_EventSupervisorPanel eventPanel = new RS_EventSupervisorPanel(EPAdmin, this::renderViewTask3, this::renderEventOrg,
                                this::renderEventAdmin);
                        jSplitPane.setRightComponent(eventPanel);

                    }
                }
            }
        }
    }

    private RS_ServiceLocation findUserlocationForEvents() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Events> event = location.get(i).getBusinessCatalogueDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<RS_Supervisor> supervisor = event.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return location.get(i);

                    }
                }
            }
        }
        return null;
    }

    private RS_BusinessCatalogue findUserEnterprise() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        for (int i = 0; i < location.size(); i++) {
            List<RS_BC_Events> event = location.get(i).getBusinessCatalogueDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<RS_Supervisor> supervisor = event.get(j).getListOfSupervisor();
                for (int k = 0; k < supervisor.size(); k++) {
                    if (supervisor.get(k).getUsername().equals(userName)) {
                        return event.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void WorkRequestForEvent() {
        List<RS_ServiceLocation> location = EPAdmin.getListOfServiceLocation();
        String type = EPAdmin.findUserType(userName);
        for (int i = 0; i < location.size(); i++) {
            RS_WorkRequestsForEventPanel workRequest = new RS_WorkRequestsForEventPanel(EPAdmin, userName, type);
            jSplitPane.setRightComponent(workRequest);
        }
    }

    private void renderViewTask3() {     // view Business Event supervisor panel
        String type = EPAdmin.findUserType(userName);
        RS_BC_Events event = (RS_BC_Events) findUserEnterprise();
        RS_DisplayEventPanel eventPanel = new RS_DisplayEventPanel(EPAdmin, this::eventManagerPanel, userName, type, event);
        jSplitPane.setRightComponent(eventPanel);
    }

    private void renderEventOrg() {     // add an organisation for event
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location = findUserlocationForEvents();
        RS_SuperviseEventOrg org = new RS_SuperviseEventOrg(EPAdmin, this::eventManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String type = EPAdmin.findUserType(userName);
        RS_ServiceLocation location = findUserlocationForEvents();
        RS_SuperviseAdminEventOrganisation orgAdmin = new RS_SuperviseAdminEventOrganisation(EPAdmin, this::eventManagerPanel, userName, type, location);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void eventManagerPanel() {    //go back to event supervisor panel
        jSplitPane.setRightComponent(new RS_EventSupervisorPanel(EPAdmin, this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));
    }
}
