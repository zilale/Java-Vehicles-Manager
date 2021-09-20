package Classes;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class VehiclesInformation extends javax.swing.JFrame {

    String help = "0";//temporary ID converted to String format
    String names[] = new String[100];
    Boolean q = false;//for determening whether a vehicle is new or just old from the list. In other words, whether the information
    //about the vehicle is being inserted or being eddited
    int KelintasGeneralInt;//uniqueID
    SqliteDB db = new SqliteDB();//Database
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//Date conversion

    static void main() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public VehiclesInformation(Object a) {
        help = (String) a;
        int ID = Integer.parseInt(help);
        initComponents();
        if (a != "0") {
            try {
                UpdateGeneralInformation(ID);
                UpdateInspectionInformation(ID);
                UpdateMaintananceInformation(ID);
                UpdateRepairInformation(ID);
                UpdateAdditionalInformation(ID);
                UpdateAccidentsInformation(ID);
                UpdateTiresInformation(ID);
                UpdateInsuranceInformation(ID);
                UpdateRegistrationInformation(ID);
                UpdateLeaseInformation(ID);
                UpdateIncomeInformation(ID);
                UpdateInformation(ID);
            } catch (ParseException ex) {
                Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ID = db.returnMaxID() + 1;//Max ID for a new insertion
            System.out.println(ID);
            help = Integer.toString(ID);
            q = true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertPhotos = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        GeneralWhen6 = new javax.swing.JLabel();
        AdditionalProblemsDate2 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Information = new javax.swing.JPanel();
        InformationPanel = new javax.swing.JPanel();
        GeneralTitle = new javax.swing.JLabel();
        InspectionTitle = new javax.swing.JLabel();
        Maintanance = new javax.swing.JLabel();
        AdditionalSpendingsTitle = new javax.swing.JLabel();
        RepairTitle = new javax.swing.JLabel();
        RegistrationTitle = new javax.swing.JLabel();
        AccidentsTitle2 = new javax.swing.JLabel();
        Income = new javax.swing.JLabel();
        GeneralAnswer = new javax.swing.JLabel();
        InspectionAnswer = new javax.swing.JLabel();
        MaintananceAnswer = new javax.swing.JLabel();
        RepairAnswer = new javax.swing.JLabel();
        AdditionalAnswer = new javax.swing.JLabel();
        AccidentsAnswer = new javax.swing.JLabel();
        IncomeAnswer = new javax.swing.JLabel();
        RegistrationAnswer = new javax.swing.JLabel();
        InformationUpdateButton = new javax.swing.JButton();
        Gerenal = new javax.swing.JPanel();
        GeneralInformationPanel = new javax.swing.JPanel();
        GeneralBrand = new javax.swing.JTextField();
        GeneralModel = new javax.swing.JTextField();
        GeneralEngine = new javax.swing.JTextField();
        GeneralBodyType = new javax.swing.JTextField();
        GeneralEnginePower = new javax.swing.JTextField();
        GeneralGearbox = new javax.swing.JTextField();
        GeneralFuel = new javax.swing.JTextField();
        GeneralVIN = new javax.swing.JTextField();
        GeneralSeats = new javax.swing.JTextField();
        GeneralMaintanancePeriod = new javax.swing.JTextField();
        GeneralRun = new javax.swing.JTextField();
        GeneralWarranty = new javax.swing.JTextField();
        GeneralPlace = new javax.swing.JTextField();
        GeneralPurchaseDate = new com.toedter.calendar.JDateChooser();
        GeneralPrice = new javax.swing.JTextField();
        GeneralDate = new com.toedter.calendar.JDateChooser();
        GeneralRegistration = new javax.swing.JLabel();
        GeneralSave = new javax.swing.JButton();
        GeneralNumber = new javax.swing.JTextField();
        ModelTitle = new javax.swing.JLabel();
        GearBoxTitle = new javax.swing.JLabel();
        BrandTitle = new javax.swing.JLabel();
        EngineTitle = new javax.swing.JLabel();
        GeneralWhen4 = new javax.swing.JLabel();
        NumberTitle = new javax.swing.JLabel();
        BodyTypeTitle = new javax.swing.JLabel();
        EnginePowerTitle = new javax.swing.JLabel();
        PlaceTitle = new javax.swing.JLabel();
        WarrantyTitle = new javax.swing.JLabel();
        RunTitle = new javax.swing.JLabel();
        MaintananceTitle = new javax.swing.JLabel();
        SeatsTitle = new javax.swing.JLabel();
        PriceTitle = new javax.swing.JLabel();
        VINTitle = new javax.swing.JLabel();
        FuelTitle = new javax.swing.JLabel();
        GeneralAfterSellingPanel = new javax.swing.JPanel();
        AftersellingPrice = new javax.swing.JTextField();
        AftersellingRun = new javax.swing.JTextField();
        AftersellingBuyer = new javax.swing.JTextField();
        AftersellingDate = new com.toedter.calendar.JDateChooser();
        AfterSellingSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GeneralPhotoFrame = new javax.swing.JDesktopPane();
        GeneralPhotoLabel = new javax.swing.JLabel();
        GeneralButtonText = new javax.swing.JTextField();
        GeneralInsertPhoto = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        InspectionAndMaintanance = new javax.swing.JPanel();
        CheckupPanel = new javax.swing.JPanel();
        CheckupRun = new javax.swing.JTextField();
        CheckupDescribtion = new javax.swing.JTextField();
        CheckupPrice = new javax.swing.JTextField();
        CheckupLabourPrice = new javax.swing.JTextField();
        CheckupDate = new com.toedter.calendar.JDateChooser();
        InspectionDateTitle = new javax.swing.JLabel();
        InspectionDateTitle1 = new javax.swing.JLabel();
        InspectionSaveButton = new javax.swing.JButton();
        InspectionRunTitle = new javax.swing.JLabel();
        InspectionDateTitle3 = new javax.swing.JLabel();
        InspectionMPriceTitle = new javax.swing.JLabel();
        MaintananceImportance1 = new javax.swing.JLabel();
        InspectionNote = new javax.swing.JLabel();
        InspectionUpdate = new javax.swing.JButton();
        MaintanancePanel = new javax.swing.JPanel();
        MaintananceDate = new com.toedter.calendar.JDateChooser();
        MaintananceRun = new javax.swing.JTextField();
        MaintananceLocation = new javax.swing.JTextField();
        MaintananceOil = new javax.swing.JTextField();
        MaintananceAmount1 = new javax.swing.JTextField();
        MaintananceFilter = new javax.swing.JTextField();
        MaintananceLabourCosts = new javax.swing.JTextField();
        MaintananceFilterCosts = new javax.swing.JTextField();
        MaintananceOilCosts = new javax.swing.JTextField();
        MaintananceOtherCosts = new javax.swing.JTextField();
        MaintananceSaveButton = new javax.swing.JButton();
        MaintananceDateTitle = new javax.swing.JLabel();
        MaintananceRunTitle = new javax.swing.JLabel();
        MaintananceLocationTitle = new javax.swing.JLabel();
        MaintananceOilTypeTitle = new javax.swing.JLabel();
        MaintananceAmountTitle = new javax.swing.JLabel();
        MaintananceFilterTitle = new javax.swing.JLabel();
        MaintananceFCostsTitle = new javax.swing.JLabel();
        MaintananceLCostsTitle = new javax.swing.JLabel();
        MaintananceOilCostsTitle = new javax.swing.JLabel();
        MaintananceOCostsTitle = new javax.swing.JLabel();
        MaintananceUpdateButton = new javax.swing.JButton();
        AdditionalNote2 = new javax.swing.JLabel();
        MaintananceImportance = new javax.swing.JLabel();
        HomeButton2 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        InspectionTable = new javax.swing.JTable();
        InspectionTableTitle = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        MaintananceTable = new javax.swing.JTable();
        InspectionTableTitle1 = new javax.swing.JLabel();
        RepairAndAdditionalProblems = new javax.swing.JPanel();
        RepairPanel = new javax.swing.JPanel();
        RepairDate = new com.toedter.calendar.JDateChooser();
        RepairRun = new javax.swing.JTextField();
        RepairPerson = new javax.swing.JTextField();
        RepairPlace = new javax.swing.JTextField();
        RepairMaterialPrice = new javax.swing.JTextField();
        RepairLabourCosts = new javax.swing.JTextField();
        RepairSaveButton = new javax.swing.JButton();
        RepairDateTitle = new javax.swing.JLabel();
        RepairRunTitle = new javax.swing.JLabel();
        RepairPlaceTitle = new javax.swing.JLabel();
        RepairMCostsTitle = new javax.swing.JLabel();
        RepairExplanationTitle = new javax.swing.JLabel();
        RepairLCostsTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RepairDescribtion = new javax.swing.JTextArea();
        RepairDateTitle7 = new javax.swing.JLabel();
        AdditionalProblemsImportance1 = new javax.swing.JLabel();
        AdditionalNote1 = new javax.swing.JLabel();
        RepairUpdateButton = new javax.swing.JButton();
        AdditionalPanel = new javax.swing.JPanel();
        AdditionalDate = new com.toedter.calendar.JDateChooser();
        AdditionalRun = new javax.swing.JTextField();
        AdditionalCompany = new javax.swing.JTextField();
        AdditionalMaterialCosts = new javax.swing.JTextField();
        AdditionalLabourCosts = new javax.swing.JTextField();
        AdditionalProblemsSaveButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        AdditionalDescribtion = new javax.swing.JTextArea();
        AdditionalDateTitle = new javax.swing.JLabel();
        AdditionalRunTitle = new javax.swing.JLabel();
        AdditionalMCostsTitle = new javax.swing.JLabel();
        AdditionalLCostsTitle = new javax.swing.JLabel();
        AdditionalCompanyTitle = new javax.swing.JLabel();
        AdditionalExplanationTitle = new javax.swing.JLabel();
        AdditionalProblemsImportance = new javax.swing.JLabel();
        AdditionalNote = new javax.swing.JLabel();
        AdditionalUpdateButton = new javax.swing.JButton();
        HomeButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RepairTable = new javax.swing.JTable();
        RepairTableTitle = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AdditionalProblemsTable = new javax.swing.JTable();
        RepairTableTitle1 = new javax.swing.JLabel();
        Accidents = new javax.swing.JPanel();
        AccidentsPanelClientsPart = new javax.swing.JPanel();
        AccidentsResponsibility = new javax.swing.JTextField();
        AccidentsContactNumber = new javax.swing.JTextField();
        AccidentsAdditionalIncome = new javax.swing.JTextField();
        AccidentsClientsPartSaveButton = new javax.swing.JButton();
        AccidentClientsExplanationTitle = new javax.swing.JLabel();
        AccidentsClientResponsibilityTitle = new javax.swing.JLabel();
        AccidentsClientNumberTitle = new javax.swing.JLabel();
        AccidentsClientIncomeTitle = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        AccidentsDescribtion = new javax.swing.JTextArea();
        ClientsNote1 = new javax.swing.JLabel();
        AccidentsClientsPartUpdateButton = new javax.swing.JButton();
        ClientsNote3 = new javax.swing.JLabel();
        ClientsImportance1 = new javax.swing.JLabel();
        AccidentsPanelCompanysPart = new javax.swing.JPanel();
        AccidentsDate = new com.toedter.calendar.JDateChooser();
        AccidentsPerson = new javax.swing.JTextField();
        AccidentsItems = new javax.swing.JTextField();
        AccidentsCompany = new javax.swing.JTextField();
        AccidentsLabourCosts = new javax.swing.JTextField();
        AccidentsServicesCosts = new javax.swing.JTextField();
        AccidentsCompanySaveButton = new javax.swing.JButton();
        AccidentsCompanysExplanationTitle = new javax.swing.JLabel();
        AccidentsCompanySCostsTitle = new javax.swing.JLabel();
        AccidentsCompanyDateTitle = new javax.swing.JLabel();
        AccidentsCompanyPersonTitle = new javax.swing.JLabel();
        AccidentsCompanyItemsTitle = new javax.swing.JLabel();
        AccidentsCompanyCompanyTitle = new javax.swing.JLabel();
        AccidentsCompanyLCostsTitle = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        AccidentsDescribtion2 = new javax.swing.JTextArea();
        AccidentsCompanyPartUpdateButton = new javax.swing.JButton();
        ClientsNote4 = new javax.swing.JLabel();
        CompanyImportance = new javax.swing.JLabel();
        AccidentsInsertPhotos = new javax.swing.JButton();
        AccidentsPhotoFrame = new javax.swing.JDesktopPane();
        AccidentsPhotosLabel = new javax.swing.JLabel();
        AccidentsPhotoLocationText = new javax.swing.JTextField();
        HomeButton4 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        AccidentsClientTable = new javax.swing.JTable();
        AccidentsCompanyTitle = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        AccidentsCompanyTable = new javax.swing.JTable();
        AccidentsClientsTableTitle = new javax.swing.JLabel();
        TiresAndInsurance = new javax.swing.JPanel();
        NewTiresPanel = new javax.swing.JPanel();
        TiresNewDate = new com.toedter.calendar.JDateChooser();
        TiresPerson = new javax.swing.JTextField();
        TiresNewItems = new javax.swing.JTextField();
        TiresNewCompany = new javax.swing.JTextField();
        TiresServicesCosts = new javax.swing.JTextField();
        TiresLabourCosts = new javax.swing.JTextField();
        NewTiresLCostsTitle = new javax.swing.JLabel();
        TiresNewSave = new javax.swing.JButton();
        NewTiresDateTitle = new javax.swing.JLabel();
        NewTiresPersonTitle = new javax.swing.JLabel();
        NewTiresDescribtionTitle = new javax.swing.JLabel();
        NewTiresCompanyTitle = new javax.swing.JLabel();
        NewTiresSCostsTitle = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TiresNewDescribtion = new javax.swing.JTextArea();
        NewTiresLabel6 = new javax.swing.JLabel();
        NewTiresUpdateButton = new javax.swing.JButton();
        NewTiresImportance = new javax.swing.JLabel();
        NewTiresNote = new javax.swing.JLabel();
        TiresServicePanel = new javax.swing.JPanel();
        TiresServiceCompany = new javax.swing.JTextField();
        TiresServiceAmount = new javax.swing.JTextField();
        TiresServicePrice = new javax.swing.JTextField();
        TiresServiceDate = new com.toedter.calendar.JDateChooser();
        ServiceDateLabel = new javax.swing.JLabel();
        TiresServiceSave = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        TiresServiceDescribtion = new javax.swing.JTextArea();
        ServiceDateLabel1 = new javax.swing.JLabel();
        ServiceDateLabel2 = new javax.swing.JLabel();
        ServiceDateLabel3 = new javax.swing.JLabel();
        ServiceDateLabel4 = new javax.swing.JLabel();
        ServiceTiresImportance = new javax.swing.JLabel();
        NewTiresNote1 = new javax.swing.JLabel();
        TiresServiceUpdateButton = new javax.swing.JButton();
        InsurancePanel = new javax.swing.JPanel();
        InsurancePeriod = new javax.swing.JTextField();
        InsuranceCosts = new javax.swing.JTextField();
        InsuranceType = new javax.swing.JComboBox<>();
        InsuranceSave = new javax.swing.JButton();
        InsuranceIncome = new javax.swing.JTextField();
        InsuranceTypeTitle = new javax.swing.JLabel();
        InsurancePeriodTitle = new javax.swing.JLabel();
        InsuranceCostsTitle = new javax.swing.JLabel();
        InsuranceIncomeTitle = new javax.swing.JLabel();
        HomeButton5 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        TiresServiceTable = new javax.swing.JTable();
        RecordInsuranceTitle = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        NewTiresTable = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        InsuranceTable = new javax.swing.JTable();
        TiresServiceRecordTitle1 = new javax.swing.JLabel();
        TiresNewRecordTitle = new javax.swing.JLabel();
        RegistrationAndLeaseAndIncome = new javax.swing.JPanel();
        RegistrationPanel = new javax.swing.JPanel();
        RegistrationAmount = new javax.swing.JTextField();
        RegistrationPrice = new javax.swing.JTextField();
        RegistrationDate = new com.toedter.calendar.JDateChooser();
        RegistrationDescribtion = new javax.swing.JTextField();
        RegistrationDescribtionTitle = new javax.swing.JLabel();
        RegistrationPriceTitle = new javax.swing.JLabel();
        VehiclesRegistrationSaveButton = new javax.swing.JButton();
        RegistrationDateTitle = new javax.swing.JLabel();
        RegistrationAmountTitlee = new javax.swing.JLabel();
        LeasePanel = new javax.swing.JPanel();
        LeasePeriod = new javax.swing.JTextField();
        LeaseSpendings = new javax.swing.JTextField();
        LeaseCompany = new javax.swing.JTextField();
        LeaseDate = new com.toedter.calendar.JDateChooser();
        RegistrationLabel = new javax.swing.JLabel();
        LeaseDescribtionTitle = new javax.swing.JLabel();
        LeaseSaveButton = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        LeaseDescribtion = new javax.swing.JTextArea();
        RegistrationLabel1 = new javax.swing.JLabel();
        RegistrationLabel2 = new javax.swing.JLabel();
        RegistrationLabel3 = new javax.swing.JLabel();
        LeaseUpdateButton = new javax.swing.JButton();
        LeaseImportance = new javax.swing.JLabel();
        LeaseNote = new javax.swing.JLabel();
        HomeButton7 = new javax.swing.JButton();
        IncomePanel = new javax.swing.JPanel();
        IncomeRentTitle = new javax.swing.JLabel();
        IncomeRentText = new javax.swing.JTextField();
        IncomePeriodTitlee = new javax.swing.JLabel();
        IncomePeriodText = new javax.swing.JTextField();
        IncomeInsuranceTitle = new javax.swing.JLabel();
        IncomeInsuranceEuro = new javax.swing.JLabel();
        IncomeInsuranceText = new javax.swing.JTextField();
        IncomeSaveButton = new javax.swing.JButton();
        TotalIncomeRentTitle = new javax.swing.JLabel();
        TotalPeriodTitle = new javax.swing.JLabel();
        TotalIncomeFromInsuranceTitle = new javax.swing.JLabel();
        TotalIncomeInsuranceAnswer = new javax.swing.JLabel();
        TotalIncomeAnswer = new javax.swing.JLabel();
        TotalPeriodAnswer = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        LeaseTable = new javax.swing.JTable();
        RecordLeaseTitle = new javax.swing.JLabel();
        Economy = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EconomyTextArea = new javax.swing.JTextArea();
        EconomyUpdateButton = new javax.swing.JButton();
        EconomyHomeButton = new javax.swing.JButton();

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InsertPhotosLayout = new javax.swing.GroupLayout(InsertPhotos.getContentPane());
        InsertPhotos.getContentPane().setLayout(InsertPhotosLayout);
        InsertPhotosLayout.setHorizontalGroup(
            InsertPhotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsertPhotosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );
        InsertPhotosLayout.setVerticalGroup(
            InsertPhotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        GeneralWhen6.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GeneralWhen6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GeneralWhen6.setText("When was bought");

        AdditionalProblemsDate2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalProblemsDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdditionalProblemsDate2.setText(" Date:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane12.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicles' Information");
        setName("InsertFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setToolTipText("");

        InformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        GeneralTitle.setText("General");

        InspectionTitle.setText("Inspection");

        Maintanance.setText("Maintanance");

        AdditionalSpendingsTitle.setText("Additional spendings");

        RepairTitle.setText("Repair");

        RegistrationTitle.setText("Registration");

        AccidentsTitle2.setText("Accidents");

        Income.setText("Income from rent:");

        GeneralAnswer.setText("-");

        InspectionAnswer.setText("-");

        MaintananceAnswer.setText("-");

        RepairAnswer.setText("-");

        AdditionalAnswer.setText("-");

        AccidentsAnswer.setText("-");

        IncomeAnswer.setText("-");

        RegistrationAnswer.setText("-");

        InformationUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/RefreshIcon2.png"))); // NOI18N
        InformationUpdateButton.setText("Update the transcript");
        InformationUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InformationPanelLayout = new javax.swing.GroupLayout(InformationPanel);
        InformationPanel.setLayout(InformationPanelLayout);
        InformationPanelLayout.setHorizontalGroup(
            InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InformationPanelLayout.createSequentialGroup()
                        .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GeneralTitle)
                            .addComponent(InspectionTitle)
                            .addComponent(Maintanance)
                            .addComponent(RepairTitle))
                        .addGap(18, 18, 18)
                        .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RepairAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GeneralAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InspectionAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(MaintananceAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformationPanelLayout.createSequentialGroup()
                                    .addComponent(AccidentsTitle2)
                                    .addGap(97, 97, 97))
                                .addGroup(InformationPanelLayout.createSequentialGroup()
                                    .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RegistrationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Income))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(InformationPanelLayout.createSequentialGroup()
                                .addComponent(AdditionalSpendingsTitle)
                                .addGap(25, 25, 25))))
                    .addGroup(InformationPanelLayout.createSequentialGroup()
                        .addComponent(InformationUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegistrationAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InformationPanelLayout.createSequentialGroup()
                        .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdditionalAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccidentsAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IncomeAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InformationPanelLayout.setVerticalGroup(
            InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformationPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GeneralTitle)
                    .addComponent(GeneralAnswer)
                    .addComponent(AdditionalSpendingsTitle)
                    .addComponent(AdditionalAnswer))
                .addGap(14, 14, 14)
                .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InspectionTitle)
                    .addComponent(InspectionAnswer)
                    .addComponent(AccidentsTitle2)
                    .addComponent(AccidentsAnswer))
                .addGap(12, 12, 12)
                .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Maintanance)
                    .addComponent(RegistrationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaintananceAnswer)
                    .addComponent(RegistrationAnswer))
                .addGap(10, 10, 10)
                .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepairTitle)
                    .addComponent(RepairAnswer)
                    .addComponent(Income, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncomeAnswer))
                .addGap(28, 28, 28)
                .addComponent(InformationUpdateButton)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout InformationLayout = new javax.swing.GroupLayout(Information);
        Information.setLayout(InformationLayout);
        InformationLayout.setHorizontalGroup(
            InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(InformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        InformationLayout.setVerticalGroup(
            InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(InformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Information", Information);

        Gerenal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GeneralInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        GeneralInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GeneralBrand.setText("Brand");
        GeneralBrand.setToolTipText("");
        GeneralBrand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralBrandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralBrandFocusLost(evt);
            }
        });
        GeneralBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralBrandActionPerformed(evt);
            }
        });
        GeneralBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GeneralBrandKeyPressed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 116, -1));

        GeneralModel.setText("Model");
        GeneralModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralModelFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 116, -1));

        GeneralEngine.setText("Engine");
        GeneralEngine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralEngineFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralEngineFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralEngine, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 116, -1));

        GeneralBodyType.setText("Body type");
        GeneralBodyType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralBodyTypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralBodyTypeFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralBodyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 116, -1));

        GeneralEnginePower.setText("Engine power");
        GeneralEnginePower.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralEnginePowerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralEnginePowerFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralEnginePower, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 116, -1));

        GeneralGearbox.setText("Gearbox");
        GeneralGearbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralGearboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralGearboxFocusLost(evt);
            }
        });
        GeneralGearbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralGearboxActionPerformed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralGearbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 116, -1));

        GeneralFuel.setText("Fuel");
        GeneralFuel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralFuelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralFuelFocusLost(evt);
            }
        });
        GeneralFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralFuelActionPerformed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralFuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 116, -1));

        GeneralVIN.setText("VIN number");
        GeneralVIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralVINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralVINFocusLost(evt);
            }
        });
        GeneralVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralVINActionPerformed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralVIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 116, -1));

        GeneralSeats.setText("Seats");
        GeneralSeats.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralSeatsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralSeatsFocusLost(evt);
            }
        });
        GeneralSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralSeatsActionPerformed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 133, -1));

        GeneralMaintanancePeriod.setText("Maintanance period");
        GeneralMaintanancePeriod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralMaintanancePeriodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralMaintanancePeriodFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralMaintanancePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        GeneralRun.setText("0");
        GeneralRun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralRunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralRunFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 133, -1));

        GeneralWarranty.setText("Warranty");
        GeneralWarranty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralWarrantyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralWarrantyFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralWarranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 133, -1));

        GeneralPlace.setText("Place");
        GeneralPlace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralPlaceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralPlaceFocusLost(evt);
            }
        });
        GeneralPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralPlaceActionPerformed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 133, -1));
        GeneralInformationPanel.add(GeneralPurchaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        GeneralPrice.setText("0");
        GeneralPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralPriceFocusLost(evt);
            }
        });
        GeneralPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralPriceActionPerformed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 116, -1));
        GeneralInformationPanel.add(GeneralDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        GeneralRegistration.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GeneralRegistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GeneralRegistration.setText("Registration date");
        GeneralInformationPanel.add(GeneralRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 122, 11));

        GeneralSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        GeneralSave.setText("Save information");
        GeneralSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeneralSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralSaveActionPerformed(evt);
            }
        });
        GeneralInformationPanel.add(GeneralSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 155, -1));

        GeneralNumber.setText("Registration number");
        GeneralNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GeneralNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GeneralNumberFocusLost(evt);
            }
        });
        GeneralInformationPanel.add(GeneralNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, -1));

        ModelTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ModelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModelTitle.setText("Model:");
        GeneralInformationPanel.add(ModelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 11));

        GearBoxTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GearBoxTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GearBoxTitle.setText("Gearbox:");
        GeneralInformationPanel.add(GearBoxTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 11));

        BrandTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        BrandTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BrandTitle.setText("Brand:");
        GeneralInformationPanel.add(BrandTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 11));

        EngineTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        EngineTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EngineTitle.setText("Engine:");
        GeneralInformationPanel.add(EngineTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 11));

        GeneralWhen4.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        GeneralWhen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GeneralWhen4.setText("When was bought");
        GeneralInformationPanel.add(GeneralWhen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 180, 110, 11));

        NumberTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NumberTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumberTitle.setText("Registration number:");
        GeneralInformationPanel.add(NumberTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 122, 11));

        BodyTypeTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        BodyTypeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BodyTypeTitle.setText("Body type:");
        GeneralInformationPanel.add(BodyTypeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 11));

        EnginePowerTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        EnginePowerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnginePowerTitle.setText("Engine power:");
        GeneralInformationPanel.add(EnginePowerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 11));

        PlaceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        PlaceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlaceTitle.setText("Place:");
        GeneralInformationPanel.add(PlaceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, 11));

        WarrantyTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        WarrantyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WarrantyTitle.setText("Warranty company:");
        GeneralInformationPanel.add(WarrantyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 11));

        RunTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RunTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RunTitle.setText("Run (km):");
        GeneralInformationPanel.add(RunTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 100, 11));

        MaintananceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaintananceTitle.setText("Maintanance period:");
        GeneralInformationPanel.add(MaintananceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 11));

        SeatsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        SeatsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeatsTitle.setText("Number of seats:");
        GeneralInformationPanel.add(SeatsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 100, 11));

        PriceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        PriceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceTitle.setText("Price (€):");
        GeneralInformationPanel.add(PriceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 11));

        VINTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        VINTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VINTitle.setText("VIN number:");
        GeneralInformationPanel.add(VINTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 11));

        FuelTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        FuelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FuelTitle.setText("Type of a fuel:");
        GeneralInformationPanel.add(FuelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 90, 11));

        Gerenal.add(GeneralInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 330, 540));

        GeneralAfterSellingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fill in after selling", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        GeneralAfterSellingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AftersellingPrice.setText("0");
        AftersellingPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AftersellingPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AftersellingPriceFocusLost(evt);
            }
        });
        AftersellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AftersellingPriceActionPerformed(evt);
            }
        });
        GeneralAfterSellingPanel.add(AftersellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 114, -1));

        AftersellingRun.setText("Run");
        AftersellingRun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AftersellingRunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AftersellingRunFocusLost(evt);
            }
        });
        AftersellingRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AftersellingRunActionPerformed(evt);
            }
        });
        GeneralAfterSellingPanel.add(AftersellingRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 114, -1));

        AftersellingBuyer.setText("Buyer");
        AftersellingBuyer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AftersellingBuyerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AftersellingBuyerFocusLost(evt);
            }
        });
        AftersellingBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AftersellingBuyerActionPerformed(evt);
            }
        });
        GeneralAfterSellingPanel.add(AftersellingBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 114, -1));
        GeneralAfterSellingPanel.add(AftersellingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 114, -1));

        AfterSellingSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        AfterSellingSave.setText("Save information");
        AfterSellingSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AfterSellingSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfterSellingSaveActionPerformed(evt);
            }
        });
        GeneralAfterSellingPanel.add(AfterSellingSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel1.setText(" Date:");
        GeneralAfterSellingPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel2.setText(" Price (€):");
        GeneralAfterSellingPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel3.setText(" Run:");
        GeneralAfterSellingPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel4.setText(" Buyer:");
        GeneralAfterSellingPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        Gerenal.add(GeneralAfterSellingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 220, 290));

        GeneralPhotoFrame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        GeneralPhotoFrame.setFont(new java.awt.Font("Telugu MN", 0, 13)); // NOI18N
        GeneralPhotoFrame.setMaximumSize(new java.awt.Dimension(226, 226));
        GeneralPhotoFrame.setPreferredSize(new java.awt.Dimension(238, 226));
        GeneralPhotoFrame.setRequestFocusEnabled(false);
        GeneralPhotoFrame.setVerifyInputWhenFocusTarget(false);

        GeneralPhotoFrame.setLayer(GeneralPhotoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout GeneralPhotoFrameLayout = new javax.swing.GroupLayout(GeneralPhotoFrame);
        GeneralPhotoFrame.setLayout(GeneralPhotoFrameLayout);
        GeneralPhotoFrameLayout.setHorizontalGroup(
            GeneralPhotoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GeneralPhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        GeneralPhotoFrameLayout.setVerticalGroup(
            GeneralPhotoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GeneralPhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        Gerenal.add(GeneralPhotoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 470, 330));

        GeneralButtonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralButtonTextActionPerformed(evt);
            }
        });
        Gerenal.add(GeneralButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 310, -1));

        GeneralInsertPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CameraIcon.png"))); // NOI18N
        GeneralInsertPhoto.setText("Insert a photo");
        GeneralInsertPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeneralInsertPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralInsertPhotoActionPerformed(evt);
            }
        });
        Gerenal.add(GeneralInsertPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 140, -1));

        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HomeIcon.png"))); // NOI18N
        HomeButton.setText("Cars' record");
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        Gerenal.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 122, -1));

        jTabbedPane1.addTab("General", Gerenal);

        InspectionAndMaintanance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CheckupPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inspection", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        CheckupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CheckupRun.setText("0");
        CheckupRun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CheckupRunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CheckupRunFocusLost(evt);
            }
        });
        CheckupRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckupRunActionPerformed(evt);
            }
        });
        CheckupPanel.add(CheckupRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 119, -1));

        CheckupDescribtion.setText("Company");
        CheckupDescribtion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CheckupDescribtionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CheckupDescribtionFocusLost(evt);
            }
        });
        CheckupDescribtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckupDescribtionActionPerformed(evt);
            }
        });
        CheckupPanel.add(CheckupDescribtion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 119, -1));

        CheckupPrice.setText("0");
        CheckupPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CheckupPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CheckupPriceFocusLost(evt);
            }
        });
        CheckupPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckupPriceActionPerformed(evt);
            }
        });
        CheckupPanel.add(CheckupPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 119, -1));

        CheckupLabourPrice.setText("0");
        CheckupLabourPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CheckupLabourPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CheckupLabourPriceFocusLost(evt);
            }
        });
        CheckupLabourPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckupLabourPriceActionPerformed(evt);
            }
        });
        CheckupPanel.add(CheckupLabourPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 119, -1));
        CheckupPanel.add(CheckupDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 123, -1));
        CheckupDate.getAccessibleContext().setAccessibleName("When?");

        InspectionDateTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InspectionDateTitle.setText(" Labour price (€):");
        CheckupPanel.add(InspectionDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        InspectionDateTitle1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InspectionDateTitle1.setText(" Inspection date:");
        CheckupPanel.add(InspectionDateTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        InspectionSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        InspectionSaveButton.setText("Add a new row");
        InspectionSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InspectionSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InspectionSaveButtonActionPerformed(evt);
            }
        });
        CheckupPanel.add(InspectionSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 170, -1));

        InspectionRunTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InspectionRunTitle.setText("Run (km):");
        CheckupPanel.add(InspectionRunTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 90, 60, -1));

        InspectionDateTitle3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InspectionDateTitle3.setText(" Company:");
        CheckupPanel.add(InspectionDateTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, 10));

        InspectionMPriceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InspectionMPriceTitle.setText(" Material price (€):");
        CheckupPanel.add(InspectionMPriceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        MaintananceImportance1.setText(" *");
        CheckupPanel.add(MaintananceImportance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 20, 20));

        InspectionNote.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InspectionNote.setText("  * - must be filled (while adding) and cannot be updated");
        CheckupPanel.add(InspectionNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 290, 20));

        InspectionUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        InspectionUpdate.setText("Update selected row");
        InspectionUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InspectionUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InspectionUpdateActionPerformed(evt);
            }
        });
        CheckupPanel.add(InspectionUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, -1));

        InspectionAndMaintanance.add(CheckupPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 410, 300));

        MaintanancePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Maintanance", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        MaintanancePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MaintanancePanel.add(MaintananceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 42, 120, -1));

        MaintananceRun.setText("0");
        MaintananceRun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceRunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceRunFocusLost(evt);
            }
        });
        MaintananceRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceRunActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));

        MaintananceLocation.setText("Location");
        MaintananceLocation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceLocationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceLocationFocusLost(evt);
            }
        });
        MaintananceLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceLocationActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        MaintananceOil.setText("Oil");
        MaintananceOil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceOilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceOilFocusLost(evt);
            }
        });
        MaintanancePanel.add(MaintananceOil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        MaintananceAmount1.setText("0");
        MaintananceAmount1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceAmount1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceAmount1FocusLost(evt);
            }
        });
        MaintanancePanel.add(MaintananceAmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 110, -1));

        MaintananceFilter.setText("Filter");
        MaintananceFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceFilterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceFilterFocusLost(evt);
            }
        });
        MaintanancePanel.add(MaintananceFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 110, -1));

        MaintananceLabourCosts.setText("0");
        MaintananceLabourCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceLabourCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceLabourCostsFocusLost(evt);
            }
        });
        MaintananceLabourCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceLabourCostsActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceLabourCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 110, -1));

        MaintananceFilterCosts.setText("0");
        MaintananceFilterCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceFilterCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceFilterCostsFocusLost(evt);
            }
        });
        MaintananceFilterCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceFilterCostsActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceFilterCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, -1));

        MaintananceOilCosts.setText("0");
        MaintananceOilCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceOilCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceOilCostsFocusLost(evt);
            }
        });
        MaintananceOilCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceOilCostsActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceOilCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 110, -1));

        MaintananceOtherCosts.setText("0");
        MaintananceOtherCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaintananceOtherCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaintananceOtherCostsFocusLost(evt);
            }
        });
        MaintananceOtherCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceOtherCostsActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceOtherCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 100, -1));

        MaintananceSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        MaintananceSaveButton.setText("Add a new row");
        MaintananceSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaintananceSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceSaveButtonActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 170, -1));

        MaintananceDateTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceDateTitle.setText("Maintanance date:");
        MaintanancePanel.add(MaintananceDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 33, -1, 10));

        MaintananceRunTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceRunTitle.setText(" Run (km):");
        MaintanancePanel.add(MaintananceRunTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 10));

        MaintananceLocationTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceLocationTitle.setText(" Where:");
        MaintanancePanel.add(MaintananceLocationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 10));

        MaintananceOilTypeTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceOilTypeTitle.setText(" Type of oil:");
        MaintanancePanel.add(MaintananceOilTypeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 10));

        MaintananceAmountTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceAmountTitle.setText(" Amount of oil (L):");
        MaintanancePanel.add(MaintananceAmountTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 10));

        MaintananceFilterTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceFilterTitle.setText(" Filter used:");
        MaintanancePanel.add(MaintananceFilterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 10));

        MaintananceFCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceFCostsTitle.setText(" Filter costs (€):");
        MaintanancePanel.add(MaintananceFCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 10));

        MaintananceLCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceLCostsTitle.setText(" Labour costs (€):");
        MaintanancePanel.add(MaintananceLCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, 10));

        MaintananceOilCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceOilCostsTitle.setText(" Costs for oil (€):");
        MaintanancePanel.add(MaintananceOilCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, 10));

        MaintananceOCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        MaintananceOCostsTitle.setText(" Other costs(€):");
        MaintanancePanel.add(MaintananceOCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, 10));

        MaintananceUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        MaintananceUpdateButton.setText("Update selected row");
        MaintananceUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaintananceUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintananceUpdateButtonActionPerformed(evt);
            }
        });
        MaintanancePanel.add(MaintananceUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 170, -1));

        AdditionalNote2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalNote2.setText("  * - must be filled (while adding) and cannot be updated");
        MaintanancePanel.add(AdditionalNote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 290, 20));

        MaintananceImportance.setText("*");
        MaintanancePanel.add(MaintananceImportance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 20, 20));

        InspectionAndMaintanance.add(MaintanancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 530, 340));

        HomeButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HomeIcon.png"))); // NOI18N
        HomeButton2.setText("Cars' record");
        HomeButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton2ActionPerformed(evt);
            }
        });
        InspectionAndMaintanance.add(HomeButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 122, -1));

        InspectionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Run", "Company", "Total costs"
            }
        ));
        InspectionTable.getTableHeader().setReorderingAllowed(false);
        InspectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InspectionTableMousePressed(evt);
            }
        });
        InspectionTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InspectionTableKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(InspectionTable);

        InspectionAndMaintanance.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 510, 250));

        InspectionTableTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        InspectionTableTitle.setText("Record of maintanances");
        InspectionAndMaintanance.add(InspectionTableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, -1, -1));

        MaintananceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Run", "Location", "Type of oil", "Oil amount", "Filter", "Total costs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MaintananceTable.setColumnSelectionAllowed(true);
        MaintananceTable.getTableHeader().setReorderingAllowed(false);
        MaintananceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MaintananceTableMousePressed(evt);
            }
        });
        MaintananceTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MaintananceTableKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(MaintananceTable);
        MaintananceTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (MaintananceTable.getColumnModel().getColumnCount() > 0) {
            MaintananceTable.getColumnModel().getColumn(0).setResizable(false);
            MaintananceTable.getColumnModel().getColumn(1).setResizable(false);
            MaintananceTable.getColumnModel().getColumn(2).setResizable(false);
            MaintananceTable.getColumnModel().getColumn(3).setResizable(false);
            MaintananceTable.getColumnModel().getColumn(4).setResizable(false);
            MaintananceTable.getColumnModel().getColumn(5).setResizable(false);
            MaintananceTable.getColumnModel().getColumn(6).setResizable(false);
        }

        InspectionAndMaintanance.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 690, 250));

        InspectionTableTitle1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        InspectionTableTitle1.setText("History of Inspections");
        InspectionAndMaintanance.add(InspectionTableTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jTabbedPane1.addTab("Inspection and Maintanance", InspectionAndMaintanance);

        RepairAndAdditionalProblems.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RepairPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Repair", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        RepairPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        RepairPanel.add(RepairDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 56, 130, 20));

        RepairRun.setText("0");
        RepairRun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RepairRunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RepairRunFocusLost(evt);
            }
        });
        RepairRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairRunActionPerformed(evt);
            }
        });
        RepairPanel.add(RepairRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, -1));

        RepairPerson.setText("Responsible");
        RepairPerson.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RepairPersonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RepairPersonFocusLost(evt);
            }
        });
        RepairPanel.add(RepairPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 120, -1));

        RepairPlace.setText("Place");
        RepairPlace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RepairPlaceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RepairPlaceFocusLost(evt);
            }
        });
        RepairPanel.add(RepairPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));

        RepairMaterialPrice.setText("0");
        RepairMaterialPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RepairMaterialPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RepairMaterialPriceFocusLost(evt);
            }
        });
        RepairPanel.add(RepairMaterialPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, -1));

        RepairLabourCosts.setText("0");
        RepairLabourCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RepairLabourCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RepairLabourCostsFocusLost(evt);
            }
        });
        RepairLabourCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairLabourCostsActionPerformed(evt);
            }
        });
        RepairPanel.add(RepairLabourCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, -1));

        RepairSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        RepairSaveButton.setText("Add a new row");
        RepairSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RepairSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairSaveButtonActionPerformed(evt);
            }
        });
        RepairPanel.add(RepairSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 173, -1));

        RepairDateTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RepairDateTitle.setText(" Repair date:");
        RepairPanel.add(RepairDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        RepairRunTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RepairRunTitle.setText(" Run (km):");
        RepairPanel.add(RepairRunTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        RepairPlaceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RepairPlaceTitle.setText(" Where rapair was done:");
        RepairPanel.add(RepairPlaceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        RepairMCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RepairMCostsTitle.setText(" Material costs (€):");
        RepairPanel.add(RepairMCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        RepairExplanationTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RepairExplanationTitle.setText("Explanation:");
        RepairPanel.add(RepairExplanationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        RepairLCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RepairLCostsTitle.setText(" Labour costs (€):");
        RepairPanel.add(RepairLCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        RepairDescribtion.setColumns(20);
        RepairDescribtion.setRows(5);
        jScrollPane2.setViewportView(RepairDescribtion);

        RepairPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 440, 60));

        RepairDateTitle7.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RepairDateTitle7.setText(" Repair was done by:");
        RepairPanel.add(RepairDateTitle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        AdditionalProblemsImportance1.setText("*");
        RepairPanel.add(AdditionalProblemsImportance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 20, 20));

        AdditionalNote1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalNote1.setText("  * - must be filled (while adding) and cannot be updated");
        RepairPanel.add(AdditionalNote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 290, 20));

        RepairUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        RepairUpdateButton.setText("Update selected row");
        RepairUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RepairUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairUpdateButtonActionPerformed(evt);
            }
        });
        RepairPanel.add(RepairUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, -1));

        RepairAndAdditionalProblems.add(RepairPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 534, 340));

        AdditionalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Additional problems", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        AdditionalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AdditionalPanel.add(AdditionalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 160, -1));

        AdditionalRun.setText("0");
        AdditionalRun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdditionalRunAdditionalRunFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdditionalRunAdditionalRunFocusLost(evt);
            }
        });
        AdditionalRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionalRunAdditionalRunActionPerformed(evt);
            }
        });
        AdditionalPanel.add(AdditionalRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, -1));

        AdditionalCompany.setText("Company");
        AdditionalCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdditionalCompanyAdditionalCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdditionalCompanyAdditionalCompanyFocusLost(evt);
            }
        });
        AdditionalPanel.add(AdditionalCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        AdditionalMaterialCosts.setText("0");
        AdditionalMaterialCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdditionalMaterialCostsAdditionalMaterialCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdditionalMaterialCostsAdditionalMaterialCostsFocusLost(evt);
            }
        });
        AdditionalPanel.add(AdditionalMaterialCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));

        AdditionalLabourCosts.setText("0");
        AdditionalLabourCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdditionalLabourCostsAdditionalLabourCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdditionalLabourCostsAdditionalLabourCostsFocusLost(evt);
            }
        });
        AdditionalPanel.add(AdditionalLabourCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        AdditionalProblemsSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        AdditionalProblemsSaveButton.setText("Add a new row");
        AdditionalProblemsSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdditionalProblemsSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionalProblemsSaveButtonActionPerformed(evt);
            }
        });
        AdditionalPanel.add(AdditionalProblemsSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 170, -1));

        AdditionalDescribtion.setColumns(20);
        AdditionalDescribtion.setRows(5);
        jScrollPane4.setViewportView(AdditionalDescribtion);

        AdditionalPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, 100));

        AdditionalDateTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalDateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdditionalDateTitle.setText(" Date:");
        AdditionalPanel.add(AdditionalDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        AdditionalRunTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalRunTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdditionalRunTitle.setText(" Run (km):");
        AdditionalPanel.add(AdditionalRunTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        AdditionalMCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalMCostsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdditionalMCostsTitle.setText(" Material costs (€):");
        AdditionalPanel.add(AdditionalMCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        AdditionalLCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalLCostsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdditionalLCostsTitle.setText(" Labour costs (€):");
        AdditionalPanel.add(AdditionalLCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        AdditionalCompanyTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalCompanyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdditionalCompanyTitle.setText(" Company:");
        AdditionalPanel.add(AdditionalCompanyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        AdditionalExplanationTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalExplanationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdditionalExplanationTitle.setText("Explanation:");
        AdditionalPanel.add(AdditionalExplanationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        AdditionalProblemsImportance.setText("*");
        AdditionalPanel.add(AdditionalProblemsImportance, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 20, 20));

        AdditionalNote.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AdditionalNote.setText("  * - must be filled (while adding) and cannot be updated");
        AdditionalPanel.add(AdditionalNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 290, 20));

        AdditionalUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        AdditionalUpdateButton.setText("Update selected row");
        AdditionalUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdditionalUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionalUpdateButtonActionPerformed(evt);
            }
        });
        AdditionalPanel.add(AdditionalUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 170, -1));

        RepairAndAdditionalProblems.add(AdditionalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 420, 350));

        HomeButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HomeIcon.png"))); // NOI18N
        HomeButton3.setText("Cars' record");
        HomeButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton3ActionPerformed(evt);
            }
        });
        RepairAndAdditionalProblems.add(HomeButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 122, -1));

        RepairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Run", "Place", "Resp. Person", "Explanation", "Total costs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RepairTable.getTableHeader().setReorderingAllowed(false);
        RepairTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RepairTableMousePressed(evt);
            }
        });
        RepairTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RepairTableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(RepairTable);

        RepairAndAdditionalProblems.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 640, 220));

        RepairTableTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        RepairTableTitle.setText("History of additional problems");
        RepairAndAdditionalProblems.add(RepairTableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, -1, -1));

        AdditionalProblemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Run (km)", "Company", "Explanation", "Total costs"
            }
        ));
        AdditionalProblemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdditionalProblemsTableMousePressed(evt);
            }
        });
        AdditionalProblemsTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdditionalProblemsTableKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(AdditionalProblemsTable);

        RepairAndAdditionalProblems.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 560, 220));

        RepairTableTitle1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        RepairTableTitle1.setText("Record of repairs");
        RepairAndAdditionalProblems.add(RepairTableTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jTabbedPane1.addTab("Repair and Additional spendings", RepairAndAdditionalProblems);

        Accidents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccidentsPanelClientsPart.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client's part", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        AccidentsPanelClientsPart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccidentsResponsibility.setText("Responsibility");
        AccidentsResponsibility.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsResponsibilityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsResponsibilityFocusLost(evt);
            }
        });
        AccidentsResponsibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsResponsibilityActionPerformed(evt);
            }
        });
        AccidentsPanelClientsPart.add(AccidentsResponsibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 125, -1));

        AccidentsContactNumber.setText("Contract number");
        AccidentsContactNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsContactNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsContactNumberFocusLost(evt);
            }
        });
        AccidentsContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsContactNumberActionPerformed(evt);
            }
        });
        AccidentsPanelClientsPart.add(AccidentsContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, -1));

        AccidentsAdditionalIncome.setText("0");
        AccidentsAdditionalIncome.setAutoscrolls(false);
        AccidentsAdditionalIncome.setDragEnabled(false);
        AccidentsAdditionalIncome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsAdditionalIncomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsAdditionalIncomeFocusLost(evt);
            }
        });
        AccidentsAdditionalIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsAdditionalIncomeActionPerformed(evt);
            }
        });
        AccidentsPanelClientsPart.add(AccidentsAdditionalIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, -1));

        AccidentsClientsPartSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        AccidentsClientsPartSaveButton.setText("Add new row ");
        AccidentsClientsPartSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccidentsClientsPartSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsClientsPartSaveButtonActionPerformed(evt);
            }
        });
        AccidentsPanelClientsPart.add(AccidentsClientsPartSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, -1));

        AccidentClientsExplanationTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentClientsExplanationTitle.setText(" What happened?");
        AccidentsPanelClientsPart.add(AccidentClientsExplanationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        AccidentsClientResponsibilityTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsClientResponsibilityTitle.setText(" Who is responsible?");
        AccidentsPanelClientsPart.add(AccidentsClientResponsibilityTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        AccidentsClientNumberTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsClientNumberTitle.setText(" Contract number:");
        AccidentsPanelClientsPart.add(AccidentsClientNumberTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        AccidentsClientIncomeTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsClientIncomeTitle.setText(" Income from client (€):");
        AccidentsPanelClientsPart.add(AccidentsClientIncomeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jScrollPane8.setMinimumSize(new java.awt.Dimension(15, 15));

        AccidentsDescribtion.setColumns(20);
        AccidentsDescribtion.setRows(5);
        jScrollPane8.setViewportView(AccidentsDescribtion);

        AccidentsPanelClientsPart.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 60));

        ClientsNote1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ClientsNote1.setText("  * - must be filled (while adding)");
        AccidentsPanelClientsPart.add(ClientsNote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 180, 20));

        AccidentsClientsPartUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        AccidentsClientsPartUpdateButton.setText("Update selected row");
        AccidentsClientsPartUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccidentsClientsPartUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsClientsPartUpdateButtonActionPerformed(evt);
            }
        });
        AccidentsPanelClientsPart.add(AccidentsClientsPartUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, -1));

        ClientsNote3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ClientsNote3.setText("and cannot be updated");
        AccidentsPanelClientsPart.add(ClientsNote3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, 30));

        ClientsImportance1.setText("  *");
        AccidentsPanelClientsPart.add(ClientsImportance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 20));

        Accidents.add(AccidentsPanelClientsPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 430));

        AccidentsPanelCompanysPart.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Company's part", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        AccidentsPanelCompanysPart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AccidentsPanelCompanysPart.add(AccidentsDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 121, -1));

        AccidentsPerson.setText("Person");
        AccidentsPerson.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsPersonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsPersonFocusLost(evt);
            }
        });
        AccidentsPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsPersonActionPerformed(evt);
            }
        });
        AccidentsPanelCompanysPart.add(AccidentsPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 121, -1));

        AccidentsItems.setText("Items");
        AccidentsItems.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsItemsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsItemsFocusLost(evt);
            }
        });
        AccidentsItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsItemsActionPerformed(evt);
            }
        });
        AccidentsPanelCompanysPart.add(AccidentsItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 121, -1));

        AccidentsCompany.setText("Company");
        AccidentsCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsCompanyFocusLost(evt);
            }
        });
        AccidentsPanelCompanysPart.add(AccidentsCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 121, -1));

        AccidentsLabourCosts.setText("0");
        AccidentsLabourCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsLabourCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsLabourCostsFocusLost(evt);
            }
        });
        AccidentsLabourCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsLabourCostsActionPerformed(evt);
            }
        });
        AccidentsPanelCompanysPart.add(AccidentsLabourCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 121, -1));

        AccidentsServicesCosts.setText("0");
        AccidentsServicesCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccidentsServicesCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccidentsServicesCostsFocusLost(evt);
            }
        });
        AccidentsPanelCompanysPart.add(AccidentsServicesCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 121, -1));

        AccidentsCompanySaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        AccidentsCompanySaveButton.setText("Save information");
        AccidentsCompanySaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccidentsCompanySaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsCompanySaveButtonActionPerformed(evt);
            }
        });
        AccidentsPanelCompanysPart.add(AccidentsCompanySaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 170, -1));

        AccidentsCompanysExplanationTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsCompanysExplanationTitle.setText(" Explanation:");
        AccidentsPanelCompanysPart.add(AccidentsCompanysExplanationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 89, -1));

        AccidentsCompanySCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsCompanySCostsTitle.setText(" Services costs (€):");
        AccidentsPanelCompanysPart.add(AccidentsCompanySCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        AccidentsCompanyDateTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsCompanyDateTitle.setText(" Date it was fixed:");
        AccidentsPanelCompanysPart.add(AccidentsCompanyDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        AccidentsCompanyPersonTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsCompanyPersonTitle.setText(" Person (took care of):");
        AccidentsPanelCompanysPart.add(AccidentsCompanyPersonTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        AccidentsCompanyItemsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsCompanyItemsTitle.setText(" Items that were bought:");
        AccidentsPanelCompanysPart.add(AccidentsCompanyItemsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        AccidentsCompanyCompanyTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsCompanyCompanyTitle.setText(" Company (which fixed):");
        AccidentsPanelCompanysPart.add(AccidentsCompanyCompanyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        AccidentsCompanyLCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        AccidentsCompanyLCostsTitle.setText(" Labour costs (€):");
        AccidentsPanelCompanysPart.add(AccidentsCompanyLCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        AccidentsDescribtion2.setColumns(20);
        AccidentsDescribtion2.setRows(5);
        jScrollPane9.setViewportView(AccidentsDescribtion2);

        AccidentsPanelCompanysPart.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 270, -1));

        AccidentsCompanyPartUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        AccidentsCompanyPartUpdateButton.setText("Update selected row");
        AccidentsCompanyPartUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccidentsCompanyPartUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsCompanyPartUpdateButtonActionPerformed(evt);
            }
        });
        AccidentsPanelCompanysPart.add(AccidentsCompanyPartUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, -1));

        ClientsNote4.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ClientsNote4.setText("  * - must be filled (while adding) and cannot be updated");
        AccidentsPanelCompanysPart.add(ClientsNote4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 290, 20));

        CompanyImportance.setText("*");
        AccidentsPanelCompanysPart.add(CompanyImportance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 20, 20));

        Accidents.add(AccidentsPanelCompanysPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 340, 440));

        AccidentsInsertPhotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CameraIcon.png"))); // NOI18N
        AccidentsInsertPhotos.setText("Insert a photo");
        AccidentsInsertPhotos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccidentsInsertPhotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsInsertPhotosActionPerformed(evt);
            }
        });
        Accidents.add(AccidentsInsertPhotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, 160, 29));

        AccidentsPhotoFrame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        AccidentsPhotoFrame.setFont(new java.awt.Font("Telugu MN", 0, 13)); // NOI18N
        AccidentsPhotoFrame.setMaximumSize(new java.awt.Dimension(226, 226));
        AccidentsPhotoFrame.setPreferredSize(new java.awt.Dimension(238, 226));
        AccidentsPhotoFrame.setRequestFocusEnabled(false);
        AccidentsPhotoFrame.setVerifyInputWhenFocusTarget(false);

        AccidentsPhotoFrame.setLayer(AccidentsPhotosLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AccidentsPhotoFrameLayout = new javax.swing.GroupLayout(AccidentsPhotoFrame);
        AccidentsPhotoFrame.setLayout(AccidentsPhotoFrameLayout);
        AccidentsPhotoFrameLayout.setHorizontalGroup(
            AccidentsPhotoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccidentsPhotosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        AccidentsPhotoFrameLayout.setVerticalGroup(
            AccidentsPhotoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccidentsPhotosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        Accidents.add(AccidentsPhotoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 490, 340));

        AccidentsPhotoLocationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccidentsPhotoLocationTextActionPerformed(evt);
            }
        });
        Accidents.add(AccidentsPhotoLocationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 310, -1));

        HomeButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HomeIcon.png"))); // NOI18N
        HomeButton4.setText("Cars' record");
        HomeButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton4ActionPerformed(evt);
            }
        });
        Accidents.add(HomeButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 122, -1));

        jScrollPane10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jScrollPane10MouseExited(evt);
            }
        });

        AccidentsClientTable.setAutoCreateRowSorter(true);
        AccidentsClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Responsibility", "Number", "Explanation", "Income"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AccidentsClientTable.getTableHeader().setReorderingAllowed(false);
        AccidentsClientTable.setVerifyInputWhenFocusTarget(false);
        AccidentsClientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AccidentsClientTableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AccidentsClientTableMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccidentsClientTableMouseExited(evt);
            }
        });
        AccidentsClientTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                AccidentsClientTableInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        AccidentsClientTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AccidentsClientTableKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(AccidentsClientTable);
        if (AccidentsClientTable.getColumnModel().getColumnCount() > 0) {
            AccidentsClientTable.getColumnModel().getColumn(0).setResizable(false);
            AccidentsClientTable.getColumnModel().getColumn(1).setResizable(false);
            AccidentsClientTable.getColumnModel().getColumn(2).setResizable(false);
            AccidentsClientTable.getColumnModel().getColumn(3).setResizable(false);
        }

        Accidents.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 440, 170));

        AccidentsCompanyTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        AccidentsCompanyTitle.setText("Record of accidents (Company's part)");
        Accidents.add(AccidentsCompanyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, -1, -1));

        AccidentsCompanyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date (fixed)", "Person (took care)", "Items", "Company (fixed)", "Explanation how:", "Total costs", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AccidentsCompanyTable.getTableHeader().setReorderingAllowed(false);
        AccidentsCompanyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AccidentsCompanyTableMousePressed(evt);
            }
        });
        AccidentsCompanyTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AccidentsCompanyTableKeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(AccidentsCompanyTable);

        Accidents.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 840, 170));

        AccidentsClientsTableTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        AccidentsClientsTableTitle.setText("Record of accidents (Client's part)");
        Accidents.add(AccidentsClientsTableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jTabbedPane1.addTab("Accidents", Accidents);

        TiresAndInsurance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewTiresPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New tires", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        NewTiresPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        NewTiresPanel.add(TiresNewDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        TiresPerson.setText("Person");
        TiresPerson.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresPersonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresPersonFocusLost(evt);
            }
        });
        TiresPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresPersonActionPerformed(evt);
            }
        });
        NewTiresPanel.add(TiresPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        TiresNewItems.setText("Items");
        TiresNewItems.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresNewItemsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresNewItemsFocusLost(evt);
            }
        });
        NewTiresPanel.add(TiresNewItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, -1));

        TiresNewCompany.setText("Company");
        TiresNewCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresNewCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresNewCompanyFocusLost(evt);
            }
        });
        NewTiresPanel.add(TiresNewCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 120, -1));

        TiresServicesCosts.setText("0");
        TiresServicesCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresServicesCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresServicesCostsFocusLost(evt);
            }
        });
        TiresServicesCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresServicesCostsActionPerformed(evt);
            }
        });
        NewTiresPanel.add(TiresServicesCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 120, -1));

        TiresLabourCosts.setText("0");
        TiresLabourCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresLabourCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresLabourCostsFocusLost(evt);
            }
        });
        TiresLabourCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresLabourCostsActionPerformed(evt);
            }
        });
        NewTiresPanel.add(TiresLabourCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, -1));

        NewTiresLCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresLCostsTitle.setText(" Labour costs (€):");
        NewTiresPanel.add(NewTiresLCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, -1));

        TiresNewSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        TiresNewSave.setText("Add a new row");
        TiresNewSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TiresNewSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresNewSaveActionPerformed(evt);
            }
        });
        NewTiresPanel.add(TiresNewSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 170, -1));

        NewTiresDateTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresDateTitle.setText(" Date:");
        NewTiresPanel.add(NewTiresDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, -1));

        NewTiresPersonTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresPersonTitle.setText(" Person:");
        NewTiresPanel.add(NewTiresPersonTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, -1));

        NewTiresDescribtionTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresDescribtionTitle.setText("Describtion (Brand, dimensions, type):");
        NewTiresPanel.add(NewTiresDescribtionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, -1));

        NewTiresCompanyTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresCompanyTitle.setText(" Company");
        NewTiresPanel.add(NewTiresCompanyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));

        NewTiresSCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresSCostsTitle.setText(" Services costs (€):");
        NewTiresPanel.add(NewTiresSCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, -1));

        TiresNewDescribtion.setColumns(20);
        TiresNewDescribtion.setRows(5);
        jScrollPane14.setViewportView(TiresNewDescribtion);

        NewTiresPanel.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 280, 90));

        NewTiresLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresLabel6.setText(" Items needed:");
        NewTiresPanel.add(NewTiresLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, -1));

        NewTiresUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        NewTiresUpdateButton.setText("Update selected row");
        NewTiresUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewTiresUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTiresUpdateButtonActionPerformed(evt);
            }
        });
        NewTiresPanel.add(NewTiresUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, -1));

        NewTiresImportance.setText("*");
        NewTiresPanel.add(NewTiresImportance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 20, 20));

        NewTiresNote.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresNote.setText("  * - must be filled (while adding) and cannot be updated");
        NewTiresPanel.add(NewTiresNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 290, 20));

        TiresAndInsurance.add(NewTiresPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 350, 430));

        TiresServicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tires' service", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        TiresServicePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TiresServiceCompany.setText("Company");
        TiresServiceCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresServiceCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresServiceCompanyFocusLost(evt);
            }
        });
        TiresServiceCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresServiceCompanyActionPerformed(evt);
            }
        });
        TiresServicePanel.add(TiresServiceCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 119, -1));

        TiresServiceAmount.setText("0");
        TiresServiceAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresServiceAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresServiceAmountFocusLost(evt);
            }
        });
        TiresServiceAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresServiceAmountActionPerformed(evt);
            }
        });
        TiresServicePanel.add(TiresServiceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 119, -1));

        TiresServicePrice.setText("0");
        TiresServicePrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TiresServicePriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TiresServicePriceFocusLost(evt);
            }
        });
        TiresServicePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresServicePriceActionPerformed(evt);
            }
        });
        TiresServicePanel.add(TiresServicePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 119, -1));
        TiresServicePanel.add(TiresServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 123, -1));

        ServiceDateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ServiceDateLabel.setText("Describtion (Brand, dimensions, characteristics):");
        TiresServicePanel.add(ServiceDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        TiresServiceSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        TiresServiceSave.setText("Add a new row");
        TiresServiceSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TiresServiceSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresServiceSaveActionPerformed(evt);
            }
        });
        TiresServicePanel.add(TiresServiceSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 170, -1));

        TiresServiceDescribtion.setColumns(20);
        TiresServiceDescribtion.setRows(5);
        jScrollPane13.setViewportView(TiresServiceDescribtion);

        TiresServicePanel.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, 90));

        ServiceDateLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ServiceDateLabel1.setText(" Service date:");
        TiresServicePanel.add(ServiceDateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        ServiceDateLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ServiceDateLabel2.setText(" Company:");
        TiresServicePanel.add(ServiceDateLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        ServiceDateLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ServiceDateLabel3.setText(" Amount: ");
        TiresServicePanel.add(ServiceDateLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        ServiceDateLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ServiceDateLabel4.setText(" Price (€, 1 tire):");
        TiresServicePanel.add(ServiceDateLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        ServiceTiresImportance.setText(" *");
        TiresServicePanel.add(ServiceTiresImportance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 20, 20));

        NewTiresNote1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        NewTiresNote1.setText("  * - must be filled (while adding) and cannot be updated");
        TiresServicePanel.add(NewTiresNote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 290, 20));

        TiresServiceUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        TiresServiceUpdateButton.setText("Update selected row");
        TiresServiceUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TiresServiceUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiresServiceUpdateButtonActionPerformed(evt);
            }
        });
        TiresServicePanel.add(TiresServiceUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 170, -1));

        TiresAndInsurance.add(TiresServicePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 350, 400));

        InsurancePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insurance", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        InsurancePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InsurancePeriod.setText("Period");
        InsurancePeriod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InsurancePeriodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InsurancePeriodFocusLost(evt);
            }
        });
        InsurancePeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsurancePeriodActionPerformed(evt);
            }
        });
        InsurancePanel.add(InsurancePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 125, -1));

        InsuranceCosts.setText("0");
        InsuranceCosts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InsuranceCostsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InsuranceCostsFocusLost(evt);
            }
        });
        InsuranceCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceCostsActionPerformed(evt);
            }
        });
        InsurancePanel.add(InsuranceCosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 125, -1));

        InsuranceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasko", "Liability", "Passanger" }));
        InsuranceType.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                InsuranceTypeComponentAdded(evt);
            }
        });
        InsuranceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceTypeActionPerformed(evt);
            }
        });
        InsurancePanel.add(InsuranceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 125, -1));

        InsuranceSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        InsuranceSave.setText("Add a new row");
        InsuranceSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InsuranceSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceSaveActionPerformed(evt);
            }
        });
        InsurancePanel.add(InsuranceSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, -1));

        InsuranceIncome.setText("Income");
        InsuranceIncome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InsuranceIncomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InsuranceIncomeFocusLost(evt);
            }
        });
        InsurancePanel.add(InsuranceIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 125, -1));

        InsuranceTypeTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InsuranceTypeTitle.setText("  Type of insurance:");
        InsurancePanel.add(InsuranceTypeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        InsurancePeriodTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InsurancePeriodTitle.setText(" Period:");
        InsurancePanel.add(InsurancePeriodTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        InsuranceCostsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InsuranceCostsTitle.setText(" How much did it cost (€)?");
        InsurancePanel.add(InsuranceCostsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        InsuranceIncomeTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        InsuranceIncomeTitle.setText(" Income (€):");
        InsurancePanel.add(InsuranceIncomeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        TiresAndInsurance.add(InsurancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 210, 300));

        HomeButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HomeIcon.png"))); // NOI18N
        HomeButton5.setText("Cars' record");
        HomeButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton5ActionPerformed(evt);
            }
        });
        TiresAndInsurance.add(HomeButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 122, -1));

        TiresServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Company", "Describtion", "Amount", "Total costs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TiresServiceTable.getTableHeader().setReorderingAllowed(false);
        TiresServiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TiresServiceTableMousePressed(evt);
            }
        });
        TiresServiceTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TiresServiceTableKeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(TiresServiceTable);

        TiresAndInsurance.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 450, 170));

        RecordInsuranceTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        RecordInsuranceTitle.setText("Record of Insurance");
        TiresAndInsurance.add(RecordInsuranceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, 140, -1));

        NewTiresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Describtion", "Person", "Items", "Company", "TotalCosts"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NewTiresTable.getTableHeader().setReorderingAllowed(false);
        NewTiresTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewTiresTableMousePressed(evt);
            }
        });
        NewTiresTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NewTiresTableKeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(NewTiresTable);

        TiresAndInsurance.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 500, 170));

        InsuranceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Type of ins.", "Period", "Costs", "Income"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InsuranceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane17.setViewportView(InsuranceTable);

        TiresAndInsurance.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, 320, 300));

        TiresServiceRecordTitle1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        TiresServiceRecordTitle1.setText("Record of tires' service");
        TiresAndInsurance.add(TiresServiceRecordTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 160, -1));

        TiresNewRecordTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        TiresNewRecordTitle.setText("Record of buying new tires");
        TiresAndInsurance.add(TiresNewRecordTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 200, -1));

        jTabbedPane1.addTab("Tires and Insurance", TiresAndInsurance);

        RegistrationAndLeaseAndIncome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicles' registration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        RegistrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrationAmount.setText("0");
        RegistrationAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegistrationAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegistrationAmountFocusLost(evt);
            }
        });
        RegistrationAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationAmountActionPerformed(evt);
            }
        });
        RegistrationPanel.add(RegistrationAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, -1));

        RegistrationPrice.setText("0");
        RegistrationPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegistrationPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegistrationPriceFocusLost(evt);
            }
        });
        RegistrationPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationPriceActionPerformed(evt);
            }
        });
        RegistrationPanel.add(RegistrationPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, -1));
        RegistrationPanel.add(RegistrationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));

        RegistrationDescribtion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegistrationDescribtionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegistrationDescribtionFocusLost(evt);
            }
        });
        RegistrationDescribtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationDescribtionActionPerformed(evt);
            }
        });
        RegistrationPanel.add(RegistrationDescribtion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 181, 58));

        RegistrationDescribtionTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationDescribtionTitle.setText(" Describtion:");
        RegistrationPanel.add(RegistrationDescribtionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        RegistrationPriceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationPriceTitle.setText(" Price (€):");
        RegistrationPanel.add(RegistrationPriceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        VehiclesRegistrationSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        VehiclesRegistrationSaveButton.setText("Save information");
        VehiclesRegistrationSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiclesRegistrationSaveButtonActionPerformed(evt);
            }
        });
        RegistrationPanel.add(VehiclesRegistrationSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, -1));

        RegistrationDateTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationDateTitle.setText(" Date:");
        RegistrationPanel.add(RegistrationDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        RegistrationAmountTitlee.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationAmountTitlee.setText(" Amount:");
        RegistrationPanel.add(RegistrationAmountTitlee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        RegistrationAndLeaseAndIncome.add(RegistrationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, 320));

        LeasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lease", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        LeasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeasePeriod.setText("Period");
        LeasePeriod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LeasePeriodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LeasePeriodFocusLost(evt);
            }
        });
        LeasePeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeasePeriodActionPerformed(evt);
            }
        });
        LeasePanel.add(LeasePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 116, -1));

        LeaseSpendings.setText("0");
        LeaseSpendings.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LeaseSpendingsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LeaseSpendingsFocusLost(evt);
            }
        });
        LeaseSpendings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaseSpendingsActionPerformed(evt);
            }
        });
        LeasePanel.add(LeaseSpendings, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 116, -1));

        LeaseCompany.setText("Company");
        LeaseCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LeaseCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LeaseCompanyFocusLost(evt);
            }
        });
        LeaseCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaseCompanyActionPerformed(evt);
            }
        });
        LeasePanel.add(LeaseCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 116, -1));
        LeasePanel.add(LeaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, -1));

        RegistrationLabel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationLabel.setText(" Spendings:");
        LeasePanel.add(RegistrationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        LeaseDescribtionTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        LeaseDescribtionTitle.setText(" Describtion:");
        LeasePanel.add(LeaseDescribtionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        LeaseSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        LeaseSaveButton.setText("Add a new row");
        LeaseSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaseSaveButtonActionPerformed(evt);
            }
        });
        LeasePanel.add(LeaseSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 170, -1));

        LeaseDescribtion.setColumns(20);
        LeaseDescribtion.setRows(5);
        jScrollPane18.setViewportView(LeaseDescribtion);

        LeasePanel.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 280, 90));

        RegistrationLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationLabel1.setText(" Date:");
        LeasePanel.add(RegistrationLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        RegistrationLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationLabel2.setText(" Company:");
        LeasePanel.add(RegistrationLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        RegistrationLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RegistrationLabel3.setText(" Period:");
        LeasePanel.add(RegistrationLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        LeaseUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EditIcon.png"))); // NOI18N
        LeaseUpdateButton.setText("Update selected row");
        LeaseUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LeaseUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaseUpdateButtonActionPerformed(evt);
            }
        });
        LeasePanel.add(LeaseUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, -1));

        LeaseImportance.setText("*");
        LeasePanel.add(LeaseImportance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 20, 20));

        LeaseNote.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        LeaseNote.setText("  * - must be filled (while adding) and cannot be updated");
        LeasePanel.add(LeaseNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 290, 20));

        RegistrationAndLeaseAndIncome.add(LeasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 360, 370));

        HomeButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HomeIcon.png"))); // NOI18N
        HomeButton7.setText("Cars' record");
        HomeButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton7ActionPerformed(evt);
            }
        });
        RegistrationAndLeaseAndIncome.add(HomeButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 122, -1));

        IncomePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Income", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        IncomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IncomeRentTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        IncomeRentTitle.setText("  Income from rent (€):");
        IncomePanel.add(IncomeRentTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        IncomeRentText.setText("0");
        IncomeRentText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IncomeRentTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IncomeRentTextFocusLost(evt);
            }
        });
        IncomePanel.add(IncomeRentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, -1));

        IncomePeriodTitlee.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        IncomePeriodTitlee.setText(" Period (days):");
        IncomePanel.add(IncomePeriodTitlee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        IncomePeriodText.setText("0");
        IncomePeriodText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IncomePeriodTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IncomePeriodTextFocusLost(evt);
            }
        });
        IncomePanel.add(IncomePeriodText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, -1));

        IncomeInsuranceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        IncomeInsuranceTitle.setText("Income from insurance (€):");
        IncomePanel.add(IncomeInsuranceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 10));
        IncomePanel.add(IncomeInsuranceEuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 121, 17, -1));

        IncomeInsuranceText.setText("0");
        IncomeInsuranceText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IncomeInsuranceTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IncomeInsuranceTextFocusLost(evt);
            }
        });
        IncomePanel.add(IncomeInsuranceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, -1));

        IncomeSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SaveIcon.png"))); // NOI18N
        IncomeSaveButton.setText("Save information");
        IncomeSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeSaveButtonActionPerformed(evt);
            }
        });
        IncomePanel.add(IncomeSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, -1));

        TotalIncomeRentTitle.setText("Total Income from rent:");
        IncomePanel.add(TotalIncomeRentTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        TotalPeriodTitle.setText("Total period:");
        IncomePanel.add(TotalPeriodTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        TotalIncomeFromInsuranceTitle.setText("Total income from Insurance:");
        IncomePanel.add(TotalIncomeFromInsuranceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        TotalIncomeInsuranceAnswer.setText("0€");
        IncomePanel.add(TotalIncomeInsuranceAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 20));

        TotalIncomeAnswer.setText("0€");
        IncomePanel.add(TotalIncomeAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 20));

        TotalPeriodAnswer.setText("0 days");
        IncomePanel.add(TotalPeriodAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 20));

        RegistrationAndLeaseAndIncome.add(IncomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 320, 380));

        LeaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Company", "Period", "Spendings", "Describtion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LeaseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LeaseTableMousePressed(evt);
            }
        });
        LeaseTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LeaseTableKeyPressed(evt);
            }
        });
        jScrollPane19.setViewportView(LeaseTable);

        RegistrationAndLeaseAndIncome.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 570, 240));

        RecordLeaseTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        RecordLeaseTitle.setText("Record of lease");
        RegistrationAndLeaseAndIncome.add(RecordLeaseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jTabbedPane1.addTab("Registration, Lease and Income", RegistrationAndLeaseAndIncome);

        EconomyTextArea.setEditable(false);
        EconomyTextArea.setColumns(20);
        EconomyTextArea.setRows(5);
        EconomyTextArea.setText("Car's general information: \n\nAutomobile: \nRegistration number:\nVIN number: \nPeriod of having this car:\n=====================================================================================\nCar's spendings:\n\nSpendings  on registration:\nSpendings on maintanance:\nSpendings on inspection:\nSpendings on repair:\nSpendings on accidents:\nSpendings on tires (TOTAL):\nSpendings on insurance:\nSpendings on additional problems:\nSpendings on lease:\n\nTotal spendings:\n======================================================================================\nCar's income:\n\nIncome from rent:\nIncome from insurance:\nIncome from clients because of accidents:\nIncome from selling this car:\n\nTotal income: \n======================================================================================\nProfit/Losses:");
        jScrollPane1.setViewportView(EconomyTextArea);

        EconomyUpdateButton.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        EconomyUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/RefreshIcon2.png"))); // NOI18N
        EconomyUpdateButton.setText("Update the transcript");
        EconomyUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EconomyUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EconomyUpdateButtonActionPerformed(evt);
            }
        });

        EconomyHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HomeIcon.png"))); // NOI18N
        EconomyHomeButton.setText("Cars' record");
        EconomyHomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EconomyHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EconomyHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EconomyLayout = new javax.swing.GroupLayout(Economy);
        Economy.setLayout(EconomyLayout);
        EconomyLayout.setHorizontalGroup(
            EconomyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EconomyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EconomyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1387, Short.MAX_VALUE)
                    .addGroup(EconomyLayout.createSequentialGroup()
                        .addComponent(EconomyHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EconomyUpdateButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EconomyLayout.setVerticalGroup(
            EconomyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EconomyLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(EconomyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EconomyHomeButton)
                    .addComponent(EconomyUpdateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Economy", Economy);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed

    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void LeaseCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaseCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LeaseCompanyActionPerformed

    private void LeaseCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LeaseCompanyFocusLost
        if (LeaseCompany.getText().equals("")) {
            LeaseCompany.setText("Company");
        }
    }//GEN-LAST:event_LeaseCompanyFocusLost

    private void LeaseCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LeaseCompanyFocusGained
        if (LeaseCompany.getText().equals("Company")) {
            LeaseCompany.setText("");
        }
    }//GEN-LAST:event_LeaseCompanyFocusGained

    private void LeaseSpendingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaseSpendingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LeaseSpendingsActionPerformed

    private void LeaseSpendingsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LeaseSpendingsFocusLost
        if (LeaseSpendings.getText().equals("")) {
            LeaseSpendings.setText("0");
        }
    }//GEN-LAST:event_LeaseSpendingsFocusLost

    private void LeaseSpendingsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LeaseSpendingsFocusGained
        if (LeaseSpendings.getText().equals("0")) {
            LeaseSpendings.setText("");
        }
    }//GEN-LAST:event_LeaseSpendingsFocusGained

    private void LeasePeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeasePeriodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LeasePeriodActionPerformed

    private void LeasePeriodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LeasePeriodFocusLost
        if (LeasePeriod.getText().equals("")) {
            LeasePeriod.setText("Period");
        }
    }//GEN-LAST:event_LeasePeriodFocusLost

    private void LeasePeriodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LeasePeriodFocusGained
        if (LeasePeriod.getText().equals("Period")) {
            LeasePeriod.setText("");
        }
    }//GEN-LAST:event_LeasePeriodFocusGained

    private void RegistrationPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrationPriceActionPerformed

    private void RegistrationPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegistrationPriceFocusLost
        if (RegistrationPrice.getText().equals("")) {
            RegistrationPrice.setText("0");
        }
    }//GEN-LAST:event_RegistrationPriceFocusLost

    private void RegistrationPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegistrationPriceFocusGained
        if (RegistrationPrice.getText().equals("0")) {
            RegistrationPrice.setText("");
        }
    }//GEN-LAST:event_RegistrationPriceFocusGained

    private void RegistrationAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrationAmountActionPerformed

    private void RegistrationAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegistrationAmountFocusLost
        if (RegistrationAmount.getText().equals("")) {
            RegistrationAmount.setText("0");
        }
    }//GEN-LAST:event_RegistrationAmountFocusLost

    private void RegistrationAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegistrationAmountFocusGained
        if (RegistrationAmount.getText().equals("0")) {
            RegistrationAmount.setText("");
        }
    }//GEN-LAST:event_RegistrationAmountFocusGained

    private void RegistrationDescribtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationDescribtionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrationDescribtionActionPerformed

    private void RegistrationDescribtionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegistrationDescribtionFocusLost

    }//GEN-LAST:event_RegistrationDescribtionFocusLost

    private void RegistrationDescribtionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegistrationDescribtionFocusGained

    }//GEN-LAST:event_RegistrationDescribtionFocusGained

    private void InsuranceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsuranceTypeActionPerformed

    private void InsuranceTypeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_InsuranceTypeComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_InsuranceTypeComponentAdded

    private void InsuranceCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsuranceCostsActionPerformed

    private void InsuranceCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsuranceCostsFocusLost
        if (InsuranceCosts.getText().equals("")) {
            InsuranceCosts.setText("0");
        }
    }//GEN-LAST:event_InsuranceCostsFocusLost

    private void InsuranceCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsuranceCostsFocusGained
        if (InsuranceCosts.getText().equals("0")) {
            InsuranceCosts.setText("");
        }
    }//GEN-LAST:event_InsuranceCostsFocusGained

    private void InsurancePeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsurancePeriodActionPerformed

    }//GEN-LAST:event_InsurancePeriodActionPerformed

    private void InsurancePeriodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsurancePeriodFocusLost
        if (InsurancePeriod.getText().equals("")) {
            InsurancePeriod.setText("Period");
        }
    }//GEN-LAST:event_InsurancePeriodFocusLost

    private void InsurancePeriodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsurancePeriodFocusGained
        if (InsurancePeriod.getText().equals("Period")) {
            InsurancePeriod.setText("");
        }
    }//GEN-LAST:event_InsurancePeriodFocusGained

    private void TiresServicePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresServicePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiresServicePriceActionPerformed

    private void TiresServicePriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServicePriceFocusLost
        if (TiresServicePrice.getText().equals("")) {
            TiresServicePrice.setText("0");
        }
    }//GEN-LAST:event_TiresServicePriceFocusLost

    private void TiresServicePriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServicePriceFocusGained
        if (TiresServicePrice.getText().equals("0")) {
            TiresServicePrice.setText("");
        }
    }//GEN-LAST:event_TiresServicePriceFocusGained

    private void TiresServiceAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresServiceAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiresServiceAmountActionPerformed

    private void TiresServiceAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServiceAmountFocusLost
        if (TiresServiceAmount.getText().equals("")) {
            TiresServiceAmount.setText("0");
        }
    }//GEN-LAST:event_TiresServiceAmountFocusLost

    private void TiresServiceAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServiceAmountFocusGained
        if (TiresServiceAmount.getText().equals("0")) {
            TiresServiceAmount.setText("");
        }
    }//GEN-LAST:event_TiresServiceAmountFocusGained

    private void TiresServiceCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresServiceCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiresServiceCompanyActionPerformed

    private void TiresServiceCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServiceCompanyFocusLost
        if (TiresServiceCompany.getText().equals("")) {
            TiresServiceCompany.setText("Company");
        }
    }//GEN-LAST:event_TiresServiceCompanyFocusLost

    private void TiresServiceCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServiceCompanyFocusGained
        if (TiresServiceCompany.getText().equals("Company")) {
            TiresServiceCompany.setText("");
        }
    }//GEN-LAST:event_TiresServiceCompanyFocusGained

    private void TiresLabourCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresLabourCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiresLabourCostsActionPerformed

    private void TiresLabourCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresLabourCostsFocusLost
        if (TiresLabourCosts.getText().equals("")) {
            TiresLabourCosts.setText("0");
        }
    }//GEN-LAST:event_TiresLabourCostsFocusLost

    private void TiresLabourCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresLabourCostsFocusGained
        if (TiresLabourCosts.getText().equals("0")) {
            TiresLabourCosts.setText("");
        }
    }//GEN-LAST:event_TiresLabourCostsFocusGained

    private void TiresServicesCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServicesCostsFocusLost
        if (TiresServicesCosts.getText().equals("")) {
            TiresServicesCosts.setText("0");
        }
    }//GEN-LAST:event_TiresServicesCostsFocusLost

    private void TiresServicesCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresServicesCostsFocusGained
        if (TiresServicesCosts.getText().equals("0")) {
            TiresServicesCosts.setText("");
        }
    }//GEN-LAST:event_TiresServicesCostsFocusGained

    private void TiresNewCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresNewCompanyFocusLost
        if (TiresNewCompany.getText().equals("")) {
            TiresNewCompany.setText("Company");
        }
    }//GEN-LAST:event_TiresNewCompanyFocusLost

    private void TiresNewCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresNewCompanyFocusGained
        if (TiresNewCompany.getText().equals("Company")) {
            TiresNewCompany.setText("");
        }
    }//GEN-LAST:event_TiresNewCompanyFocusGained

    private void TiresNewItemsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresNewItemsFocusLost
        if (TiresNewItems.getText().equals("")) {
            TiresNewItems.setText("Items");
        }
    }//GEN-LAST:event_TiresNewItemsFocusLost

    private void TiresNewItemsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresNewItemsFocusGained
        if (TiresNewItems.getText().equals("Items")) {
            TiresNewItems.setText("");
        }
    }//GEN-LAST:event_TiresNewItemsFocusGained

    private void TiresPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiresPersonActionPerformed

    private void TiresPersonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresPersonFocusLost
        if (TiresPerson.getText().equals("")) {
            TiresPerson.setText("Person");
        }
    }//GEN-LAST:event_TiresPersonFocusLost

    private void TiresPersonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TiresPersonFocusGained
        if (TiresPerson.getText().equals("Person")) {
            TiresPerson.setText("");
        }
    }//GEN-LAST:event_TiresPersonFocusGained

    private void AccidentsInsertPhotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsInsertPhotosActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        BufferedImage img = null;
        BufferedImage scaled = null;
        try {
            img = ImageIO.read(f);
            scaled = resizeImage(img, 470, 330);
        } catch (IOException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon ii = new ImageIcon(scaled);
        AccidentsPhotosLabel.setIcon(ii);
        filename = f.getAbsolutePath();
        AccidentsPhotosLabel.setText(filename);
        AccidentsPhotoLocationText.setText(filename);
        int row = AccidentsCompanyTable.getSelectedRow();
        Object a = AccidentsCompanyTable.getValueAt(row, 0);
        String query = "UPDATE AccidentCompany SET Photo = '" + filename + "' WHERE date = '" + (String) a + "'";
        db.executeUpdate(query);
        UpdateAccidentsInformation(Integer.parseInt(help));
    }//GEN-LAST:event_AccidentsInsertPhotosActionPerformed

    private void AccidentsServicesCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsServicesCostsFocusLost
        if (AccidentsServicesCosts.getText().equals("")) {
            AccidentsServicesCosts.setText("0");
        }
    }//GEN-LAST:event_AccidentsServicesCostsFocusLost

    private void AccidentsServicesCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsServicesCostsFocusGained
        if (AccidentsServicesCosts.getText().equals("0")) {
            AccidentsServicesCosts.setText("");
        }
    }//GEN-LAST:event_AccidentsServicesCostsFocusGained

    private void AccidentsLabourCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsLabourCostsActionPerformed

    }//GEN-LAST:event_AccidentsLabourCostsActionPerformed

    private void AccidentsLabourCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsLabourCostsFocusLost
        if (AccidentsLabourCosts.getText().equals("")) {
            AccidentsLabourCosts.setText("0");
        }
    }//GEN-LAST:event_AccidentsLabourCostsFocusLost

    private void AccidentsLabourCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsLabourCostsFocusGained
        if (AccidentsLabourCosts.getText().equals("0")) {
            AccidentsLabourCosts.setText("");
        }
    }//GEN-LAST:event_AccidentsLabourCostsFocusGained

    private void AccidentsCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsCompanyFocusLost
        if (AccidentsCompany.getText().equals("")) {
            AccidentsCompany.setText("Company");
        }
    }//GEN-LAST:event_AccidentsCompanyFocusLost

    private void AccidentsCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsCompanyFocusGained
        if (AccidentsCompany.getText().equals("Company")) {
            AccidentsCompany.setText("");
        }
    }//GEN-LAST:event_AccidentsCompanyFocusGained

    private void AccidentsItemsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsItemsFocusLost
        if (AccidentsItems.getText().equals("")) {
            AccidentsItems.setText("Items");
        }
    }//GEN-LAST:event_AccidentsItemsFocusLost

    private void AccidentsItemsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsItemsFocusGained
        if (AccidentsItems.getText().equals("Items")) {
            AccidentsItems.setText("");
        }
    }//GEN-LAST:event_AccidentsItemsFocusGained

    private void AccidentsPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccidentsPersonActionPerformed

    private void AccidentsPersonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsPersonFocusLost
        if (AccidentsPerson.getText().equals("")) {
            AccidentsPerson.setText("Person");
        }
    }//GEN-LAST:event_AccidentsPersonFocusLost

    private void AccidentsPersonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsPersonFocusGained
        if (AccidentsPerson.getText().equals("Person")) {
            AccidentsPerson.setText("");
        }
    }//GEN-LAST:event_AccidentsPersonFocusGained

    private void AccidentsAdditionalIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsAdditionalIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccidentsAdditionalIncomeActionPerformed

    private void AccidentsAdditionalIncomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsAdditionalIncomeFocusLost
        if (AccidentsAdditionalIncome.getText().equals("")) {
            AccidentsAdditionalIncome.setText("0");
        }
    }//GEN-LAST:event_AccidentsAdditionalIncomeFocusLost

    private void AccidentsAdditionalIncomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsAdditionalIncomeFocusGained
        if (AccidentsAdditionalIncome.getText().equals("0")) {
            AccidentsAdditionalIncome.setText("");
        }
    }//GEN-LAST:event_AccidentsAdditionalIncomeFocusGained

    private void AccidentsContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccidentsContactNumberActionPerformed

    private void AccidentsContactNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsContactNumberFocusLost
        if (AccidentsContactNumber.getText().equals("")) {
            AccidentsContactNumber.setText("Contract number");
        }
    }//GEN-LAST:event_AccidentsContactNumberFocusLost

    private void AccidentsContactNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsContactNumberFocusGained
        if (AccidentsContactNumber.getText().equals("Contract number")) {
            AccidentsContactNumber.setText("");
        }
    }//GEN-LAST:event_AccidentsContactNumberFocusGained

    private void AccidentsResponsibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsResponsibilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccidentsResponsibilityActionPerformed

    private void AccidentsResponsibilityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsResponsibilityFocusLost
        if (AccidentsResponsibility.getText().equals("")) {
            AccidentsResponsibility.setText("Responsibility");
        }
    }//GEN-LAST:event_AccidentsResponsibilityFocusLost

    private void AccidentsResponsibilityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccidentsResponsibilityFocusGained
        if (AccidentsResponsibility.getText().equals("Responsibility")) {
            AccidentsResponsibility.setText("");
        }
    }//GEN-LAST:event_AccidentsResponsibilityFocusGained

    private void RepairLabourCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairLabourCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepairLabourCostsActionPerformed

    private void RepairLabourCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairLabourCostsFocusLost
        if (RepairLabourCosts.getText().equals("")) {
            RepairLabourCosts.setText("0");
        }
    }//GEN-LAST:event_RepairLabourCostsFocusLost

    private void RepairLabourCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairLabourCostsFocusGained
        if (RepairLabourCosts.getText().equals("0")) {
            RepairLabourCosts.setText("");
        }
    }//GEN-LAST:event_RepairLabourCostsFocusGained

    private void RepairMaterialPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairMaterialPriceFocusLost
        if (RepairMaterialPrice.getText().equals("")) {
            RepairMaterialPrice.setText("0");
        }
    }//GEN-LAST:event_RepairMaterialPriceFocusLost

    private void RepairMaterialPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairMaterialPriceFocusGained
        if (RepairMaterialPrice.getText().equals("0")) {
            RepairMaterialPrice.setText("");
        }
    }//GEN-LAST:event_RepairMaterialPriceFocusGained

    private void RepairPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairPlaceFocusLost
        if (RepairPlace.getText().equals("")) {
            RepairPlace.setText("Place");
        }
    }//GEN-LAST:event_RepairPlaceFocusLost

    private void RepairPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairPlaceFocusGained
        if (RepairPlace.getText().equals("Place")) {
            RepairPlace.setText("");
        }
    }//GEN-LAST:event_RepairPlaceFocusGained

    private void RepairPersonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairPersonFocusLost
        if (RepairPerson.getText().equals("")) {
            RepairPerson.setText("Responsible");
        }
    }//GEN-LAST:event_RepairPersonFocusLost

    private void RepairPersonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairPersonFocusGained
        if (RepairPerson.getText().equals("Responsible")) {
            RepairPerson.setText("");
        }
    }//GEN-LAST:event_RepairPersonFocusGained

    private void RepairRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepairRunActionPerformed

    private void RepairRunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairRunFocusLost
        if (RepairRun.getText().equals("")) {
            RepairRun.setText("0");
        }
    }//GEN-LAST:event_RepairRunFocusLost

    private void RepairRunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RepairRunFocusGained
        if (RepairRun.getText().equals("0")) {
            RepairRun.setText("");
        }
    }//GEN-LAST:event_RepairRunFocusGained

    private void MaintananceOtherCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceOtherCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaintananceOtherCostsActionPerformed

    private void MaintananceOtherCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceOtherCostsFocusLost
        if (MaintananceOtherCosts.getText().equals("")) {
            MaintananceOtherCosts.setText("0");
        }
    }//GEN-LAST:event_MaintananceOtherCostsFocusLost

    private void MaintananceOtherCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceOtherCostsFocusGained
        if (MaintananceOtherCosts.getText().equals("0")) {
            MaintananceOtherCosts.setText("");
        }
    }//GEN-LAST:event_MaintananceOtherCostsFocusGained

    private void MaintananceOilCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceOilCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaintananceOilCostsActionPerformed

    private void MaintananceOilCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceOilCostsFocusLost
        if (MaintananceOilCosts.getText().equals("")) {
            MaintananceOilCosts.setText("0");
        }
    }//GEN-LAST:event_MaintananceOilCostsFocusLost

    private void MaintananceOilCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceOilCostsFocusGained
        if (MaintananceOilCosts.getText().equals("0")) {
            MaintananceOilCosts.setText("");
        }
    }//GEN-LAST:event_MaintananceOilCostsFocusGained

    private void MaintananceFilterCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceFilterCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaintananceFilterCostsActionPerformed

    private void MaintananceFilterCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceFilterCostsFocusLost
        if (MaintananceFilterCosts.getText().equals("")) {
            MaintananceFilterCosts.setText("0");
        }
    }//GEN-LAST:event_MaintananceFilterCostsFocusLost

    private void MaintananceFilterCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceFilterCostsFocusGained
        if (MaintananceFilterCosts.getText().equals("0")) {
            MaintananceFilterCosts.setText("");
        }
    }//GEN-LAST:event_MaintananceFilterCostsFocusGained

    private void MaintananceLabourCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceLabourCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaintananceLabourCostsActionPerformed

    private void MaintananceLabourCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceLabourCostsFocusLost
        if (MaintananceLabourCosts.getText().equals("")) {
            MaintananceLabourCosts.setText("0");
        }
    }//GEN-LAST:event_MaintananceLabourCostsFocusLost

    private void MaintananceLabourCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceLabourCostsFocusGained
        if (MaintananceLabourCosts.getText().equals("0")) {
            MaintananceLabourCosts.setText("");
        }
    }//GEN-LAST:event_MaintananceLabourCostsFocusGained

    private void MaintananceFilterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceFilterFocusLost
        if (MaintananceFilter.getText().equals("")) {
            MaintananceFilter.setText("Filter");
        }
    }//GEN-LAST:event_MaintananceFilterFocusLost

    private void MaintananceFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceFilterFocusGained
        if (MaintananceFilter.getText().equals("Filter")) {
            MaintananceFilter.setText("");
        }
    }//GEN-LAST:event_MaintananceFilterFocusGained

    private void MaintananceAmount1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceAmount1FocusLost
        if (MaintananceAmount1.getText().equals("")) {
            MaintananceAmount1.setText("0");
        }
    }//GEN-LAST:event_MaintananceAmount1FocusLost

    private void MaintananceAmount1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceAmount1FocusGained
        if (MaintananceAmount1.getText().equals("0")) {
            MaintananceAmount1.setText("");
        }
    }//GEN-LAST:event_MaintananceAmount1FocusGained

    private void MaintananceOilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceOilFocusLost
        if (MaintananceOil.getText().equals("")) {
            MaintananceOil.setText("Oil");
        }
    }//GEN-LAST:event_MaintananceOilFocusLost

    private void MaintananceOilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceOilFocusGained
        if (MaintananceOil.getText().equals("Oil")) {
            MaintananceOil.setText("");
        }
    }//GEN-LAST:event_MaintananceOilFocusGained

    private void MaintananceLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaintananceLocationActionPerformed

    private void MaintananceLocationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceLocationFocusLost
        if (MaintananceLocation.getText().equals("")) {
            MaintananceLocation.setText("Location");
        }
    }//GEN-LAST:event_MaintananceLocationFocusLost

    private void MaintananceLocationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceLocationFocusGained
        if (MaintananceLocation.getText().equals("Location")) {
            MaintananceLocation.setText("");
        }
    }//GEN-LAST:event_MaintananceLocationFocusGained

    private void MaintananceRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaintananceRunActionPerformed

    private void MaintananceRunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceRunFocusLost
        if (MaintananceRun.getText().equals("")) {
            MaintananceRun.setText("0");
        }
    }//GEN-LAST:event_MaintananceRunFocusLost

    private void MaintananceRunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaintananceRunFocusGained
        if (MaintananceRun.getText().equals("0")) {
            MaintananceRun.setText("");
        }
    }//GEN-LAST:event_MaintananceRunFocusGained

    private void CheckupLabourPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckupLabourPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckupLabourPriceActionPerformed

    private void CheckupLabourPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupLabourPriceFocusLost
        if (CheckupLabourPrice.getText().equals("")) {
            CheckupLabourPrice.setText("0");
        }
    }//GEN-LAST:event_CheckupLabourPriceFocusLost

    private void CheckupLabourPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupLabourPriceFocusGained
        if (CheckupLabourPrice.getText().equals("0")) {
            CheckupLabourPrice.setText("");
        }
    }//GEN-LAST:event_CheckupLabourPriceFocusGained

    private void CheckupPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckupPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckupPriceActionPerformed

    private void CheckupPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupPriceFocusLost
        if (CheckupPrice.getText().equals("")) {
            CheckupPrice.setText("0");
        }
    }//GEN-LAST:event_CheckupPriceFocusLost

    private void CheckupPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupPriceFocusGained
        if (CheckupPrice.getText().equals("0")) {
            CheckupPrice.setText("");
        }
    }//GEN-LAST:event_CheckupPriceFocusGained

    private void CheckupDescribtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckupDescribtionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckupDescribtionActionPerformed

    private void CheckupDescribtionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupDescribtionFocusLost
        if (CheckupDescribtion.getText().equals("")) {
            CheckupDescribtion.setText("Company");
        }
    }//GEN-LAST:event_CheckupDescribtionFocusLost

    private void CheckupDescribtionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupDescribtionFocusGained
        if (CheckupDescribtion.getText().equals("Company")) {
            CheckupDescribtion.setText("");
        }
    }//GEN-LAST:event_CheckupDescribtionFocusGained

    private void CheckupRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckupRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckupRunActionPerformed

    private void CheckupRunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupRunFocusLost
        if (CheckupRun.getText().equals("")) {
            CheckupRun.setText("0");
        }
    }//GEN-LAST:event_CheckupRunFocusLost

    private void CheckupRunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CheckupRunFocusGained
        if (CheckupRun.getText().equals("0")) {
            CheckupRun.setText("");
        }
    }//GEN-LAST:event_CheckupRunFocusGained
    public static BufferedImage resizeImage(BufferedImage image, int width, int height) {
        double p = (double) width / height;
        double p2 = (double) image.getWidth() / image.getHeight();
        if (p2 < p) {
            width = image.getWidth() * height / image.getHeight();
        } else {
            height = image.getHeight() * width / image.getWidth();
        }
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        return bufferedImage;
    }
    private void AdditionalRunAdditionalRunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalRunAdditionalRunFocusGained
        if (AdditionalRun.getText().equals("0")) {
            AdditionalRun.setText("");
        }
    }//GEN-LAST:event_AdditionalRunAdditionalRunFocusGained

    private void AdditionalRunAdditionalRunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalRunAdditionalRunFocusLost
        if (AdditionalRun.getText().equals("")) {
            AdditionalRun.setText("0");
        }
    }//GEN-LAST:event_AdditionalRunAdditionalRunFocusLost

    private void AdditionalRunAdditionalRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionalRunAdditionalRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdditionalRunAdditionalRunActionPerformed

    private void AdditionalCompanyAdditionalCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalCompanyAdditionalCompanyFocusGained
        if (AdditionalCompany.getText().equals("Company")) {
            AdditionalCompany.setText("");
        }
    }//GEN-LAST:event_AdditionalCompanyAdditionalCompanyFocusGained

    private void AdditionalCompanyAdditionalCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalCompanyAdditionalCompanyFocusLost
        if (AdditionalCompany.getText().equals("")) {
            AdditionalCompany.setText("Company");
        }
    }//GEN-LAST:event_AdditionalCompanyAdditionalCompanyFocusLost

    private void AdditionalMaterialCostsAdditionalMaterialCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalMaterialCostsAdditionalMaterialCostsFocusGained
        if (AdditionalMaterialCosts.getText().equals("0")) {
            AdditionalMaterialCosts.setText("");
        }
    }//GEN-LAST:event_AdditionalMaterialCostsAdditionalMaterialCostsFocusGained

    private void AdditionalMaterialCostsAdditionalMaterialCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalMaterialCostsAdditionalMaterialCostsFocusLost
        if (AdditionalMaterialCosts.getText().equals("")) {
            AdditionalMaterialCosts.setText("0");
        }
    }//GEN-LAST:event_AdditionalMaterialCostsAdditionalMaterialCostsFocusLost

    private void AdditionalLabourCostsAdditionalLabourCostsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalLabourCostsAdditionalLabourCostsFocusGained
        if (AdditionalLabourCosts.getText().equals("0")) {
            AdditionalLabourCosts.setText("");
        }
    }//GEN-LAST:event_AdditionalLabourCostsAdditionalLabourCostsFocusGained

    private void AdditionalLabourCostsAdditionalLabourCostsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdditionalLabourCostsAdditionalLabourCostsFocusLost
        if (AdditionalLabourCosts.getText().equals("")) {
            AdditionalLabourCosts.setText("0");
        }
    }//GEN-LAST:event_AdditionalLabourCostsAdditionalLabourCostsFocusLost

    private void AccidentsItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccidentsItemsActionPerformed

    private void AccidentsCompanySaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsCompanySaveButtonActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(AccidentsLabourCosts.getText()) && isInteger(AccidentsServicesCosts.getText())) {
                String ConvertedAccidentsCompanyDate = dateFormat.format(AccidentsDate.getDate());
                db.executeUpdate("INSERT INTO AccidentCompany (ID, Date, Person, Items, Company, LabourCosts, ServicesCosts, Describtion) VALUES "
                        + "('" + help + "', '" + ConvertedAccidentsCompanyDate + "', '" + AccidentsPerson.getText() + "', '" + AccidentsItems.getText() + "', '"
                        + "" + AccidentsCompany.getText() + "', '" + AccidentsLabourCosts.getText() + "', '" + AccidentsServicesCosts.getText() + ""
                        + "', '" + AccidentsDescribtion2.getText() + "')");
                UpdateAccidentsInformation(Integer.parseInt(help));
            } else {
                JOptionPane.showMessageDialog(null, "Costs should be inserted as numeric data");
                undergo = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_AccidentsCompanySaveButtonActionPerformed

    private void AccidentsClientsPartSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsClientsPartSaveButtonActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(AccidentsAdditionalIncome.getText())) {
                db.executeUpdate("INSERT INTO AccidentClient (ID, Describtion, Responsibilty, ContactNumber, AdditionalIncome) VALUES "
                        + "('" + help + "', '" + AccidentsDescribtion.getText() + "', '" + AccidentsResponsibility.getText() + "', '"
                        + "" + AccidentsContactNumber.getText() + "', '" + AccidentsAdditionalIncome.getText() + "')");
                UpdateAccidentsInformation(Integer.parseInt(help));
            } else {
                JOptionPane.showMessageDialog(null, "Income should be inserted as a numeric data");
                undergo = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_AccidentsClientsPartSaveButtonActionPerformed

    private void AccidentsPhotoLocationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsPhotoLocationTextActionPerformed

    }//GEN-LAST:event_AccidentsPhotoLocationTextActionPerformed

    private void MaintananceSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceSaveButtonActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(MaintananceLabourCosts.getText()) && isInteger(MaintananceOtherCosts.getText())
                    && isInteger(MaintananceOilCosts.getText()) && isInteger(MaintananceFilterCosts.getText())) {
                String ConvertedMaintananceDate = dateFormat.format(MaintananceDate.getDate());
                db.executeUpdate("INSERT INTO Maintanance (ID, Date, Run, Location, Oil, Amount, Filter, LabourCosts, OilCosts, FilterCosts, OtherCosts) VALUES "
                        + "('" + help + "', '" + ConvertedMaintananceDate + "', '" + MaintananceRun.getText() + "', '"
                        + "" + MaintananceLocation.getText() + "', '" + MaintananceOil.getText() + "', '" + MaintananceAmount1.getText() + ""
                        + "', '" + MaintananceFilter.getText() + "', '" + MaintananceLabourCosts.getText() + "', '" + MaintananceOilCosts.getText()
                        + "', '" + MaintananceFilterCosts.getText() + "', '" + MaintananceOtherCosts.getText() + "')");
                UpdateMaintananceInformation(Integer.parseInt(help));
            } else {
                JOptionPane.showMessageDialog(null, "Price should be inserted as numeric data");
                undergo = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_MaintananceSaveButtonActionPerformed

    private void VehiclesRegistrationSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiclesRegistrationSaveButtonActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(RegistrationAmount.getText()) && isInteger(RegistrationPrice.getText())) {
                String KelintasString = Integer.toString(KelintasGeneralInt);
                String ConvertedRegistrationDate = dateFormat.format(RegistrationDate.getDate());
                UpdateDatabaseRow("Registration", "Date", ConvertedRegistrationDate, help);
                UpdateDatabaseRow("Registration", "Amount", RegistrationAmount.getText(), help);
                UpdateDatabaseRow("Registration", "Price", RegistrationPrice.getText(), help);
                UpdateDatabaseRow("Registration", "Describtion", RegistrationDescribtion.getText(), help);
            } else {
                undergo = false;
                JOptionPane.showMessageDialog(null, "Price and amount should be inserted as numeric data");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_VehiclesRegistrationSaveButtonActionPerformed

    private void LeaseSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaseSaveButtonActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(LeaseSpendings.getText())) {
                String KelintasString = Integer.toString(KelintasGeneralInt);
                String ConvertedLeaseDate = dateFormat.format(LeaseDate.getDate());
                db.executeUpdate("INSERT INTO Lease (ID, Date, Company, Period, Spendings, Describtion) VALUES ('" + help + "', '" + ConvertedLeaseDate + "', '" + LeaseCompany.getText() + "', '" + LeasePeriod.getText() + "', '" + LeaseSpendings.getText() + "', '" + LeaseDescribtion.getText() + "')");
                UpdateLeaseInformation(Integer.parseInt(help));
            } else {
                undergo = false;
                JOptionPane.showMessageDialog(null, "Spendings should be inserted as numeric data");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_LeaseSaveButtonActionPerformed

    private void TiresNewSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresNewSaveActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(TiresServicesCosts.getText()) && isInteger(TiresLabourCosts.getText())) {
                String KelintasString = Integer.toString(KelintasGeneralInt);
                String ConvertedTiresNewDate = dateFormat.format(TiresNewDate.getDate());
                db.executeUpdate("INSERT INTO TiresNew (ID, Date, Describtion, Person, Items, Company, ServicesCosts, LabourCosts) VALUES ("
                        + "'" + help + "', '" + ConvertedTiresNewDate + "', '" + TiresNewDescribtion.getText() + "', "
                        + "'" + TiresPerson.getText() + "', '" + TiresNewItems.getText() + "', '" + TiresNewCompany.getText() + ""
                        + "', '" + TiresServicesCosts.getText() + "', '" + TiresLabourCosts.getText() + "')");
                UpdateTiresInformation(Integer.parseInt(help));
            } else {
                undergo = false;
                JOptionPane.showMessageDialog(null, "Costs should be inserted as numeric data");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_TiresNewSaveActionPerformed

    private void InsuranceSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceSaveActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(InsuranceCosts.getText())) {
                String KelintasString = Integer.toString(KelintasGeneralInt);
                String convertedToString = String.valueOf(InsuranceType.getSelectedItem());
                db.executeUpdate("INSERT INTO Insurance (ID, Type, Period, Costs, Income) VALUES ('" + help + "', '" + convertedToString + "', '" + InsurancePeriod.getText() + "', '" + InsuranceCosts.getText() + "', '" + InsuranceIncome.getText() + "')");
                UpdateInsuranceInformation(Integer.parseInt(help));
            } else {
                undergo = false;
                JOptionPane.showMessageDialog(null, "Costs should be insereted as numeric data");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
        }
    }//GEN-LAST:event_InsuranceSaveActionPerformed

    private void TiresServiceSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresServiceSaveActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(TiresServiceAmount.getText()) && isInteger(TiresServicePrice.getText())) {
                String KelintasString = Integer.toString(KelintasGeneralInt);
                String ConvertedTiresServiceDate = dateFormat.format(TiresServiceDate.getDate());
                db.executeUpdate("INSERT INTO TiresService (ID, Date, Company, Describtion, Amount, Price) VALUES ('" + help + ""
                        + "', '" + ConvertedTiresServiceDate + "', '" + TiresServiceCompany.getText() + "', '" + TiresServiceDescribtion.getText() + ""
                        + "', '" + TiresServiceAmount.getText() + "', '" + TiresServicePrice.getText() + "')");
                UpdateTiresInformation(Integer.parseInt(help));
            } else {
                undergo = false;
                JOptionPane.showMessageDialog(null, "Price and amount should be inserted as numeric data");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_TiresServiceSaveActionPerformed

    private void RepairSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairSaveButtonActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(RepairMaterialPrice.getText()) && isInteger(RepairLabourCosts.getText())) {
                UpdateMaintananceInformation(Integer.parseInt(help));
                String ConvertedRepairDate = dateFormat.format(RepairDate.getDate());
                db.executeUpdate("INSERT INTO Repair (ID, Date, Run, Describtion, Person, Place, MaterialPrice, LabourCosts) VALUES "
                        + "('" + help + "', '" + ConvertedRepairDate + "', '" + RepairRun.getText() + "', '" + RepairDescribtion.getText() + ""
                        + "', '" + RepairPerson.getText() + "', '" + RepairPlace.getText() + "', '" + RepairMaterialPrice.getText() + "', '" + RepairLabourCosts.getText() + "')");
                UpdateRepairInformation(Integer.parseInt(help));
            } else {
                JOptionPane.showMessageDialog(null, "Price should be inserted as numeric data");
                undergo = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_RepairSaveButtonActionPerformed

    private void AdditionalProblemsSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionalProblemsSaveButtonActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(AdditionalMaterialCosts.getText()) && isInteger(AdditionalLabourCosts.getText())) {
                String ConvertedAdditionalDate = dateFormat.format(AdditionalDate.getDate());
                db.executeUpdate("INSERT INTO AdditionalProblems (ID, Date, Run, Describtion, Company, MaterialCosts, LabourCosts) VALUES "
                        + "('" + help + "', '" + ConvertedAdditionalDate + "', '" + AdditionalRun.getText() + "', '" + AdditionalDescribtion.getText() + ""
                        + "', '" + AdditionalCompany.getText() + "', '" + AdditionalMaterialCosts.getText() + "', '" + AdditionalLabourCosts.getText() + "')");
                UpdateAdditionalInformation(Integer.parseInt(help));
            } else {
                undergo = false;
                JOptionPane.showMessageDialog(null, "Price should be inserted as a numeric value");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_AdditionalProblemsSaveButtonActionPerformed

    private void HomeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton2ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "DO NOT FORGET TO SAVE INFORMATION \n Do you want to continue the action?", "Cars' record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
            new ListOfVehicles().setVisible(true);
        }
    }//GEN-LAST:event_HomeButton2ActionPerformed

    private void HomeButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton3ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "DO NOT FORGET TO SAVE INFORMATION \n Do you want to continue the action?", "Cars' record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
            new ListOfVehicles().setVisible(true);
        }
    }//GEN-LAST:event_HomeButton3ActionPerformed

    private void HomeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton4ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "DO NOT FORGET TO SAVE INFORMATION \n Do you want to continue the action?", "Cars' record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
            new ListOfVehicles().setVisible(true);
        }
    }//GEN-LAST:event_HomeButton4ActionPerformed

    private void HomeButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton5ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "DO NOT FORGET TO SAVE INFORMATION \n Do you want to continue the action?", "Cars' record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
            new ListOfVehicles().setVisible(true);
        }
    }//GEN-LAST:event_HomeButton5ActionPerformed

    private void HomeButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton7ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "DO NOT FORGET TO SAVE INFORMATION \n Do you want to continue the action?", "Cars' record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
            new ListOfVehicles().setVisible(true);
        }
    }//GEN-LAST:event_HomeButton7ActionPerformed

    private void EconomyHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EconomyHomeButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "DO NOT FORGET TO SAVE INFORMATION \n Do you want to continue the action?", "Cars' record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
            new ListOfVehicles().setVisible(true);
        }
    }//GEN-LAST:event_EconomyHomeButtonActionPerformed

    private void EconomyUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EconomyUpdateButtonActionPerformed
        EconomyTextArea.setText("");
        Object data[] = new Object[2];
        int ID = Integer.parseInt(help);
        data = db.listFinances(ID);
        Integer[] dataInt = new Integer[21];
        for (int i = 5; i <= 23; i++) {
            dataInt[i - 5] = Integer.parseInt((String) data[i]);
        }
        dataInt[20] = Integer.parseInt((String) data[25]);
        //Receiving data

        int IncomeRent;
        int IncomeInsurance;
        IncomeRent = Integer.parseInt((String) data[26]);
        IncomeInsurance = Integer.parseInt((String) data[27]);
        int SpendingsMaintanance = dataInt[1] + dataInt[2] + dataInt[3] + dataInt[4];
        int SpendingsInspection = dataInt[5] + dataInt[6];
        int SpendingsRepair = dataInt[7] + dataInt[8];
        int SpendingsAccidents = dataInt[9] + dataInt[10];
        int SpendingsTires = dataInt[13] + dataInt[11] + dataInt[12];
        int SpendingsAdditional = dataInt[18] + dataInt[17];
        int SpendingsTotal = SpendingsMaintanance
                + SpendingsInspection + SpendingsRepair + SpendingsAccidents
                + SpendingsTires + SpendingsAdditional
                + dataInt[13] + dataInt[0] + dataInt[15] + dataInt[14];
        //Arithmetic opperations

        if (data[28] == null) {
            data[28] = 0;
        }
        //Avoiding calculation errors
        int IncomeTotal = IncomeRent + IncomeInsurance + dataInt[16] + (int) data[28];
        int ProfitTotal = IncomeTotal - SpendingsTotal;
        //Arithmetic operatioons
        EconomyTextArea.append("Car's general information: "
                + "\n"
                + "\nAutomobile: " + data[0] + " " + data[1]
                + "\nRegistration number: " + data[2]
                + "\nVIN number: " + data[3]
                + "\nPeriod of having this car: " + data[4] + "-" + data[24]
                + "\n======================================================================================="
                + "\nCar's spendings: \n"
                + "\nSpendings on registration: " + data[5] + "€"
                + "\nSpendings on maintanance: (labour) " + data[6] + "€ + (oil) " + data[7] + "€ + (filter) " + data[8] + "€ + (other) " + data[9] + "€ = " + SpendingsMaintanance + "€"
                + "\nSpendings on inspection: (material) " + data[10] + "€ + (labour) " + data[11] + "€ = " + SpendingsInspection + "€"
                + "\nSpendings on repair: (material) " + data[12] + "€ + (labour) " + data[13] + "€ = " + SpendingsRepair + "€"
                + "\nSpendings on accidents: (service) " + data[14] + "€ + (labour) " + data[15] + "€ = " + SpendingsAccidents + "€"
                + "\nSpendings on tires (TOTAL): (new tires' service) " + data[16] + "€ + (new tires' labour) " + data[17] + "€ + (current tires' service) " + data[18] + "€ = " + SpendingsTires + "€"
                + "\nSpendings on insurance: " + data[19] + "€"
                + "\nSpendings on additional problems: (material) " + data[22] + "€ + (labour) " + data[23] + "€ = " + SpendingsAdditional + "€"
                + "\nSpendings on lease: " + data[20] + "€"
                + "\n\nTotal spendings: " + SpendingsTotal + "€"
                + "\n======================================================================================="
                + "\nCar's income: \n"
                + "\nIncome from rent: " + IncomeRent + "€"
                + "\nIncome from insurance: " + IncomeInsurance + "€"
                + "\nIncome from clients because of accidents: " + data[21] + "€"
                + "\nIncome from selling this car: " + data[28] + "€"
                + "\n\nTotal income: " + IncomeTotal + "€"
                + "\n======================================================================================="
                + "\nProfit/Losses: " + ProfitTotal + "€"
                + "");//Outputing
    }//GEN-LAST:event_EconomyUpdateButtonActionPerformed

    private void InsuranceIncomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsuranceIncomeFocusGained
        if (InsuranceIncome.getText().equals("0")) {
            InsuranceIncome.setText("");
        }
    }//GEN-LAST:event_InsuranceIncomeFocusGained

    private void InsuranceIncomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsuranceIncomeFocusLost
        if (InsuranceIncome.getText().equals("")) {
            InsuranceIncome.setText("0");
        }
    }//GEN-LAST:event_InsuranceIncomeFocusLost

    private void IncomeSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeSaveButtonActionPerformed
        Object data[] = new Object[3];
        int ID;
        ID = Integer.parseInt(help);
        data = db.listIncome(ID);
        for (int i = 0; i < 3; i++) {
            if (data[i] == null) {
                data[i] = 0;
            }
        }
        int income1, period, income2;
        income1 = Integer.parseInt(IncomeRentText.getText());
        period = Integer.parseInt(IncomePeriodText.getText());
        income2 = Integer.parseInt(IncomeInsuranceText.getText());
        income1 += (int) data[0];
        period += (int) data[1];
        income2 += (int) data[2];
        String stringincome1 = Integer.toString(income1);
        String stringperiod = Integer.toString(period);
        String stringincome2 = Integer.toString(income2);
        try {
            if (isInteger(IncomeRentText.getText()) && isInteger(IncomePeriodText.getText()) && isInteger(IncomeInsuranceText.getText())) {
                String KelintasString = Integer.toString(KelintasGeneralInt);
                UpdateDatabaseRow("Income", "Incomefromrent", stringincome1, help);
                UpdateDatabaseRow("Income", "Period", stringperiod, help);
                UpdateDatabaseRow("Income", "Incomefrominsurance", stringincome2, help);
                UpdateIncomeInformation(ID);
            } else {
                JOptionPane.showMessageDialog(null, "Income should be inserted as numeric value");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_IncomeSaveButtonActionPerformed

    private void InformationUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationUpdateButtonActionPerformed
        int help2 = Integer.parseInt((String) help);
        int check[] = new int[4];
        System.out.println(help);
        Object check3[] = new Object[4];
        check3 = db.listInformation2(help2);
        check = db.listInformation(help2);
        String check2[] = new String[4];
        for (int i = 0; i < 4; i++) {
            check2[i] = String.valueOf(check[i]);
        }
        if (help == "0") {
        } else {
            UpdateInformation(help2);
        }
    }//GEN-LAST:event_InformationUpdateButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "DO NOT FORGET TO SAVE INFORMATION \n Do you want to continue the action?", "Cars' record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            this.dispose();
            new ListOfVehicles().setVisible(true);
        }
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void GeneralInsertPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralInsertPhotoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        BufferedImage img = null;
        BufferedImage scaled = null;
        try {
            img = ImageIO.read(f);
            scaled = resizeImage(img, 470, 330);
            //resizing the image to fit it in the box in the application

        } catch (IOException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon ii = new ImageIcon(scaled);
        GeneralPhotoLabel.setIcon(ii);
        filename = f.getAbsolutePath();
        GeneralPhotoLabel.setText(filename);
        GeneralButtonText.setText(filename);
        //Inserting a picture into the box and directory into textfield in the application

        UpdateDatabaseRow("General", "Image", filename, help);
        //Inserting picture into database
    }//GEN-LAST:event_GeneralInsertPhotoActionPerformed

    private void GeneralButtonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralButtonTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneralButtonTextActionPerformed

    private void AftersellingBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AftersellingBuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AftersellingBuyerActionPerformed

    private void AftersellingBuyerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AftersellingBuyerFocusLost
        if (AftersellingBuyer.getText().equals("")) {
            AftersellingBuyer.setText("Buyer");
        }
    }//GEN-LAST:event_AftersellingBuyerFocusLost

    private void AftersellingBuyerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AftersellingBuyerFocusGained
        if (AftersellingBuyer.getText().equals("Buyer")) {
            AftersellingBuyer.setText("");
        }
    }//GEN-LAST:event_AftersellingBuyerFocusGained

    private void AftersellingRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AftersellingRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AftersellingRunActionPerformed

    private void AftersellingRunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AftersellingRunFocusLost
        if (AftersellingRun.getText().equals("")) {
            AftersellingRun.setText("0");
        }
    }//GEN-LAST:event_AftersellingRunFocusLost

    private void AftersellingRunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AftersellingRunFocusGained
        if (AftersellingRun.getText().equals("0")) {
            AftersellingRun.setText("");
        }
    }//GEN-LAST:event_AftersellingRunFocusGained

    private void AftersellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AftersellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AftersellingPriceActionPerformed

    private void AftersellingPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AftersellingPriceFocusLost
        if (AftersellingPrice.getText().equals("")) {
            AftersellingPrice.setText("0");
        }
    }//GEN-LAST:event_AftersellingPriceFocusLost

    private void AftersellingPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AftersellingPriceFocusGained
        if (AftersellingPrice.getText().equals("0")) {
            AftersellingPrice.setText("");
        }
    }//GEN-LAST:event_AftersellingPriceFocusGained

    private void GeneralNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralNumberFocusLost
        if (GeneralNumber.getText().equals("")) {
            GeneralNumber.setText("Registration number");
        }
    }//GEN-LAST:event_GeneralNumberFocusLost

    private void GeneralNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralNumberFocusGained
        if (GeneralNumber.getText().equals("Registration number")) {
            GeneralNumber.setText("");
        }
    }//GEN-LAST:event_GeneralNumberFocusGained

    private void GeneralSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralSaveActionPerformed
        boolean undergo = true;
        try {
            String ConvertedGeneralPurchaseDate = dateFormat.format(GeneralPurchaseDate.getDate());
            String ConvertedGeneralDate = dateFormat.format(GeneralDate.getDate());
            //Converting date to String for input
            int maxID = db.returnMaxID();
            //return unique last ID
            names[1] = "Brand";
            names[2] = "Model";
            names[3] = "Engine";
            names[4] = "Body";
            names[5] = "Enginepower";
            names[6] = "Gearbox";
            names[7] = "Fuel";
            names[8] = "VIN";
            names[9] = "Registrationdate";
            names[10] = "Price";
            names[11] = "Purchasedate";
            names[12] = "Place";
            names[13] = "Warranty";
            names[14] = "Run";
            names[15] = "Maintananceperiod";
            names[16] = "Seats";
            names[17] = GeneralBrand.getText();
            names[18] = GeneralModel.getText();
            names[19] = GeneralEngine.getText();
            names[20] = GeneralBodyType.getText();
            names[21] = GeneralEnginePower.getText();
            names[22] = GeneralGearbox.getText();
            names[23] = GeneralFuel.getText();
            names[24] = GeneralVIN.getText();
            names[25] = ConvertedGeneralDate;
            names[26] = GeneralPrice.getText();
            names[27] = ConvertedGeneralPurchaseDate;
            names[28] = GeneralPlace.getText();
            names[29] = GeneralWarranty.getText();
            names[30] = GeneralRun.getText();
            names[31] = GeneralMaintanancePeriod.getText();
            names[32] = GeneralSeats.getText();
            names[33] = GeneralNumber.getText();
            //saving the variables
            if (q) {
                CreateDatabaseRow("Income", "ID", help);
                CreateDatabaseRow("GENERAL", "ID", help);
                CreateDatabaseRow("GeneralAfterSelling", "ID", help);
                CreateDatabaseRow("Registration", "ID", help);
            }
            //creating new rows for all tables with the same unique ID
            System.out.println(help);
            for (int i = 1; i < 17; i++) {
                UpdateDatabaseRow("General", names[i], names[i + 16], help);
            }
            UpdateDatabaseRow("General", "RegistrationNumber", GeneralNumber.getText(), help);
            //updating the General table

            //db.closeConnection();
            //closing the database connection
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_GeneralSaveActionPerformed

    private void GeneralPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralPriceFocusLost
        if (GeneralPrice.getText().equals("")) {
            GeneralPrice.setText("0");
        }
    }//GEN-LAST:event_GeneralPriceFocusLost

    private void GeneralPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralPriceFocusGained
        if (GeneralPrice.getText().equals("0")) {
            GeneralPrice.setText("");
        }
    }//GEN-LAST:event_GeneralPriceFocusGained

    private void GeneralPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralPlaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneralPlaceActionPerformed

    private void GeneralPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralPlaceFocusLost
        if (GeneralPlace.getText().equals("")) {
            GeneralPlace.setText("Place");
        }
    }//GEN-LAST:event_GeneralPlaceFocusLost

    private void GeneralPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralPlaceFocusGained
        if (GeneralPlace.getText().equals("Place")) {
            GeneralPlace.setText("");
        }
    }//GEN-LAST:event_GeneralPlaceFocusGained

    private void GeneralWarrantyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralWarrantyFocusLost
        if (GeneralWarranty.getText().equals("")) {
            GeneralWarranty.setText("Warranty");
        }
    }//GEN-LAST:event_GeneralWarrantyFocusLost

    private void GeneralWarrantyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralWarrantyFocusGained
        if (GeneralWarranty.getText().equals("Warranty")) {
            GeneralWarranty.setText("");
        }
    }//GEN-LAST:event_GeneralWarrantyFocusGained

    private void GeneralRunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralRunFocusLost
        if (GeneralRun.getText().equals("")) {
            GeneralRun.setText("0");
        }
    }//GEN-LAST:event_GeneralRunFocusLost

    private void GeneralRunFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralRunFocusGained
        if (GeneralRun.getText().equals("0")) {
            GeneralRun.setText("");
        }
    }//GEN-LAST:event_GeneralRunFocusGained

    private void GeneralMaintanancePeriodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralMaintanancePeriodFocusLost
        if (GeneralMaintanancePeriod.getText().equals("")) {
            GeneralMaintanancePeriod.setText("Maintanance period");
        }
    }//GEN-LAST:event_GeneralMaintanancePeriodFocusLost

    private void GeneralMaintanancePeriodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralMaintanancePeriodFocusGained
        if (GeneralMaintanancePeriod.getText().equals("Maintanance period")) {
            GeneralMaintanancePeriod.setText("");
        }
    }//GEN-LAST:event_GeneralMaintanancePeriodFocusGained

    private void GeneralSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneralSeatsActionPerformed

    private void GeneralSeatsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralSeatsFocusLost
        if (GeneralSeats.getText().equals("")) {
            GeneralSeats.setText("Seats");
        }
    }//GEN-LAST:event_GeneralSeatsFocusLost

    private void GeneralSeatsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralSeatsFocusGained
        if (GeneralSeats.getText().equals("Seats")) {
            GeneralSeats.setText("");
        }
    }//GEN-LAST:event_GeneralSeatsFocusGained

    private void GeneralVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneralVINActionPerformed

    private void GeneralVINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralVINFocusLost
        if (GeneralVIN.getText().equals("")) {
            GeneralVIN.setText("VIN number");
        }
    }//GEN-LAST:event_GeneralVINFocusLost

    private void GeneralVINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralVINFocusGained
        if (GeneralVIN.getText().equals("VIN number")) {
            GeneralVIN.setText("");
        }
    }//GEN-LAST:event_GeneralVINFocusGained

    private void GeneralFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralFuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneralFuelActionPerformed

    private void GeneralFuelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralFuelFocusLost
        if (GeneralFuel.getText().equals("")) {
            GeneralFuel.setText("Fuel");
        }
    }//GEN-LAST:event_GeneralFuelFocusLost

    private void GeneralFuelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralFuelFocusGained
        if (GeneralFuel.getText().equals("Fuel")) {
            GeneralFuel.setText("");
        }
    }//GEN-LAST:event_GeneralFuelFocusGained

    private void GeneralGearboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralGearboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneralGearboxActionPerformed

    private void GeneralGearboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralGearboxFocusLost
        if (GeneralGearbox.getText().equals("")) {
            GeneralGearbox.setText("Gearbox");
        }
    }//GEN-LAST:event_GeneralGearboxFocusLost

    private void GeneralGearboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralGearboxFocusGained
        if (GeneralGearbox.getText().equals("Gearbox")) {
            GeneralGearbox.setText("");
        }
    }//GEN-LAST:event_GeneralGearboxFocusGained

    private void GeneralEnginePowerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralEnginePowerFocusLost
        if (GeneralEnginePower.getText().equals("")) {
            GeneralEnginePower.setText("Engine power");
        }
    }//GEN-LAST:event_GeneralEnginePowerFocusLost

    private void GeneralEnginePowerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralEnginePowerFocusGained
        if (GeneralEnginePower.getText().equals("Engine power")) {
            GeneralEnginePower.setText("");
        }
    }//GEN-LAST:event_GeneralEnginePowerFocusGained

    private void GeneralBodyTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralBodyTypeFocusLost
        if (GeneralBodyType.getText().equals("")) {
            GeneralBodyType.setText("Body type");
        }
    }//GEN-LAST:event_GeneralBodyTypeFocusLost

    private void GeneralBodyTypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralBodyTypeFocusGained
        if (GeneralBodyType.getText().equals("Body type")) {
            GeneralBodyType.setText("");
        }
    }//GEN-LAST:event_GeneralBodyTypeFocusGained

    private void GeneralEngineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralEngineFocusLost
        if (GeneralEngine.getText().equals("")) {
            GeneralEngine.setText("Engine");
        }
    }//GEN-LAST:event_GeneralEngineFocusLost

    private void GeneralEngineFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralEngineFocusGained
        if (GeneralEngine.getText().equals("Engine")) {
            GeneralEngine.setText("");
        }
    }//GEN-LAST:event_GeneralEngineFocusGained

    private void GeneralModelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralModelFocusLost
        if (GeneralModel.getText().equals("")) {
            GeneralModel.setText("Model");
        }
    }//GEN-LAST:event_GeneralModelFocusLost

    private void GeneralModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralModelFocusGained
        if (GeneralModel.getText().equals("Model")) {
            GeneralModel.setText("");
        }
    }//GEN-LAST:event_GeneralModelFocusGained

    private void GeneralBrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GeneralBrandKeyPressed

    }//GEN-LAST:event_GeneralBrandKeyPressed

    private void GeneralBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralBrandActionPerformed

    }//GEN-LAST:event_GeneralBrandActionPerformed

    private void GeneralBrandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralBrandFocusLost
        if (GeneralBrand.getText().equals("")) {
            GeneralBrand.setText("Brand");
        }
    }//GEN-LAST:event_GeneralBrandFocusLost

    private void GeneralBrandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GeneralBrandFocusGained
        if (GeneralBrand.getText().equals("Brand")) {
            GeneralBrand.setText("");
        }
    }//GEN-LAST:event_GeneralBrandFocusGained

    private void GeneralPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneralPriceActionPerformed

    private void TiresServicesCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresServicesCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiresServicesCostsActionPerformed

    private void AccidentsCompanyTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccidentsCompanyTableMousePressed
        try {
            int row = AccidentsCompanyTable.getSelectedRow();
            Object a = AccidentsCompanyTable.getValueAt(row, 6);

            File b = new File((String) a);
            BufferedImage img = null;
            BufferedImage scaled = null;
            try {
                img = ImageIO.read(b);
                scaled = resizeImage(img, 470, 330);
            } catch (IOException ex) {
                Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon ii = new ImageIcon(scaled);
            AccidentsPhotosLabel.setIcon(ii); //Adding picture into fram
            AccidentsPhotosLabel.setText((String) a); //
            AccidentsPhotosLabel.setText((String) a);
            AccidentsPhotoLocationText.setText((String) a);

            Object c = AccidentsCompanyTable.getValueAt(row, 0);
            Object data[] = new Object[7];
            data = db.listAccidentsCompanyData((String) c);
            Date date1 = dateFormat.parse((String) c);
            AccidentsDate.setDate(date1);
            AccidentsDate.setEnabled(false);//to lock date
            AccidentsPerson.setText((String) data[1]);
            AccidentsItems.setText((String) data[2]);
            AccidentsCompany.setText((String) data[3]);
            AccidentsDescribtion2.setText((String) data[4]);
            AccidentsLabourCosts.setText((String) data[5]);
            AccidentsServicesCosts.setText((String) data[6]);
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AccidentsCompanyTableMousePressed

    private void InspectionTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InspectionTableMousePressed
        try {
            int row = InspectionTable.getSelectedRow();
            Object c = InspectionTable.getValueAt(row, 0);
            Object data[] = new Object[5];
            data = db.listInspectionData((String) c);
            Date date1 = dateFormat.parse((String) c);
            CheckupDate.setDate(date1);
            CheckupDate.setEnabled(false);//locking the date
            CheckupRun.setText((String) data[1]);
            CheckupDescribtion.setText((String) data[2]);
            CheckupPrice.setText((String) data[3]);
            CheckupLabourPrice.setText((String) data[4]);
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InspectionTableMousePressed

    private void AccidentsClientTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccidentsClientTableMousePressed
        int row = AccidentsClientTable.getSelectedRow();
        Object a = AccidentsClientTable.getValueAt(row, 0);
        Object b = AccidentsClientTable.getValueAt(row, 1);
        Object c = AccidentsClientTable.getValueAt(row, 2);
        Object d = AccidentsClientTable.getValueAt(row, 3);
        AccidentsResponsibility.setText((String) a);
        AccidentsContactNumber.setText((String) b);
        AccidentsContactNumber.setEditable(false);
        AccidentsDescribtion.setText((String) c);
        AccidentsAdditionalIncome.setText((String) d);
    }//GEN-LAST:event_AccidentsClientTableMousePressed

    private void jScrollPane10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane10MouseExited

    }//GEN-LAST:event_jScrollPane10MouseExited

    private void AccidentsClientTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccidentsClientTableMouseReleased

    }//GEN-LAST:event_AccidentsClientTableMouseReleased

    private void AccidentsClientTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccidentsClientTableMouseExited

    }//GEN-LAST:event_AccidentsClientTableMouseExited

    private void AccidentsClientTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_AccidentsClientTableInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_AccidentsClientTableInputMethodTextChanged

    private void AccidentsClientTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccidentsClientTableKeyReleased
        AccidentsContactNumber.setEditable(true);
        AccidentsResponsibility.setText("");
        AccidentsContactNumber.setText("");
        AccidentsDescribtion.setText("");
        AccidentsAdditionalIncome.setText("");
    }//GEN-LAST:event_AccidentsClientTableKeyReleased

    private void AccidentsCompanyPartUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsCompanyPartUpdateButtonActionPerformed
        int row = AccidentsCompanyTable.getSelectedRow();
        Object b = AccidentsCompanyTable.getValueAt(row, 0);
        if (isInteger(AccidentsLabourCosts.getText()) && isInteger(AccidentsServicesCosts.getText())) {
            db.executeUpdate("UPDATE AccidentCompany SET Person = '" + AccidentsPerson.getText() + "' WHERE Date = '" + (String) b + "'");
            db.executeUpdate("UPDATE AccidentCompany SET Items = '" + AccidentsItems.getText() + "' WHERE Date = '" + (String) b + "'");
            db.executeUpdate("UPDATE AccidentCompany SET Company = '" + AccidentsCompany.getText() + "' WHERE Date = '" + (String) b + "'");
            db.executeUpdate("UPDATE AccidentCompany SET LabourCosts = '" + AccidentsLabourCosts.getText() + "' WHERE Date = '" + (String) b + "'");
            db.executeUpdate("UPDATE AccidentCompany SET ServicesCosts = '" + AccidentsServicesCosts.getText() + "' WHERE Date = '" + (String) b + "'");
            db.executeUpdate("UPDATE AccidentCompany SET Describtion = '" + AccidentsDescribtion2.getText() + "' WHERE Date = '" + (String) b + "'");
            UpdateAccidentsInformation(Integer.parseInt(help));
        } else {
            JOptionPane.showMessageDialog(null, "Costs should be inserted as numeric data");
        }
    }//GEN-LAST:event_AccidentsCompanyPartUpdateButtonActionPerformed

    private void AccidentsClientsPartUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccidentsClientsPartUpdateButtonActionPerformed
        int row = AccidentsClientTable.getSelectedRow();
        Object b = AccidentsClientTable.getValueAt(row, 1);
        if (isInteger(AccidentsAdditionalIncome.getText())) {

            db.executeUpdate("UPDATE AccidentClient SET Responsibilty = '" + AccidentsResponsibility.getText() + "' WHERE ContactNumber = '" + (String) b + "'");
            db.executeUpdate("UPDATE AccidentClient SET Describtion = '" + AccidentsDescribtion.getText() + "' WHERE ContactNumber = '" + (String) b + "'");
            db.executeUpdate("UPDATE AccidentClient SET AdditionalIncome = '" + AccidentsAdditionalIncome.getText() + "' WHERE ContactNumber = '" + (String) b + "'");
            UpdateAccidentsInformation(Integer.parseInt(help));
        } else {
            JOptionPane.showMessageDialog(null, "Income should be inserted as a numeric data");
        }
    }//GEN-LAST:event_AccidentsClientsPartUpdateButtonActionPerformed

    private void AccidentsCompanyTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccidentsCompanyTableKeyPressed
        AccidentsPerson.setText("");
        AccidentsItems.setText("");
        AccidentsCompany.setText("");
        AccidentsDescribtion2.setText("");
        AccidentsLabourCosts.setText("");
        AccidentsServicesCosts.setText("");
    }//GEN-LAST:event_AccidentsCompanyTableKeyPressed

    private void LeaseTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaseTableMousePressed
        try {
            int row = LeaseTable.getSelectedRow();
            Object a = LeaseTable.getValueAt(row, 0);
            Object b = LeaseTable.getValueAt(row, 1);
            Object c = LeaseTable.getValueAt(row, 2);
            Object d = LeaseTable.getValueAt(row, 3);
            Object e = LeaseTable.getValueAt(row, 4);

            Date date1 = dateFormat.parse((String) a);
            LeaseDate.setDate(date1);
            LeaseDate.setEnabled(false);
            LeaseCompany.setText((String) b);
            LeasePeriod.setText((String) c);
            LeaseSpendings.setText((String) d);
            LeaseDescribtion.setText((String) e);
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LeaseTableMousePressed

    private void LeaseTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LeaseTableKeyPressed

        LeaseDate.setEnabled(true);
        LeaseCompany.setText("");
        LeasePeriod.setText("");
        LeaseSpendings.setText("");
        LeaseDescribtion.setText("");

    }//GEN-LAST:event_LeaseTableKeyPressed

    private void LeaseUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaseUpdateButtonActionPerformed
        int row = LeaseTable.getSelectedRow();
        Object b = LeaseTable.getValueAt(row, 0);
        if (isInteger(LeaseSpendings.getText())) {
            String ConvertedLeaseDate = dateFormat.format(LeaseDate.getDate());
            db.executeUpdate("UPDATE Lease SET Company = '" + LeaseCompany.getText() + "' WHERE Date = '" + ConvertedLeaseDate + "'");
            db.executeUpdate("UPDATE Lease SET Period = '" + LeasePeriod.getText() + "' WHERE Date = '" + ConvertedLeaseDate + "'");
            db.executeUpdate("UPDATE Lease SET Spendings = '" + LeaseSpendings.getText() + "' WHERE Date = '" + ConvertedLeaseDate + "'");
            db.executeUpdate("UPDATE Lease SET Describtion = '" + LeaseDescribtion.getText() + "' WHERE Date = '" + ConvertedLeaseDate + "'");
            UpdateLeaseInformation(Integer.parseInt(help));
        } else {
            JOptionPane.showMessageDialog(null, "Spendings should be inserted as numeric data");
        }
    }//GEN-LAST:event_LeaseUpdateButtonActionPerformed

    private void NewTiresUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTiresUpdateButtonActionPerformed
        int row = NewTiresTable.getSelectedRow();
        Object a = NewTiresTable.getValueAt(row, 0);
        if (isInteger(TiresServicesCosts.getText()) && isInteger(TiresLabourCosts.getText())) {
            db.executeUpdate("UPDATE TiresNew SET Describtion = '" + TiresNewDescribtion.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresNew SET Person = '" + TiresPerson.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresNew SET Items = '" + TiresNewItems.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresNew SET Company = '" + TiresNewCompany.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresNew SET ServicesCosts = '" + TiresServicesCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresNew SET LabourCosts = '" + TiresLabourCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            UpdateTiresInformation(Integer.parseInt(help));
        } else {
            JOptionPane.showMessageDialog(null, "Costs should be inserted as numeric data");
        }
    }//GEN-LAST:event_NewTiresUpdateButtonActionPerformed

    private void NewTiresTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewTiresTableKeyPressed
        TiresNewDate.setEnabled(true);
        TiresPerson.setText("");
        TiresNewDescribtion.setText("");
        TiresNewItems.setText("");
        TiresNewCompany.setText("");
        TiresServicesCosts.setText("");
        TiresLabourCosts.setText("");
    }//GEN-LAST:event_NewTiresTableKeyPressed

    private void TiresServiceUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiresServiceUpdateButtonActionPerformed
        int row = NewTiresTable.getSelectedRow();
        Object a = NewTiresTable.getValueAt(row, 0);
        if (isInteger(TiresServiceAmount.getText()) && isInteger(TiresServicePrice.getText())) {
            db.executeUpdate("UPDATE TiresService SET Describtion = '" + TiresServiceDescribtion.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresService SET Company = '" + TiresServiceCompany.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresService SET Amount = '" + TiresServiceAmount.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE TiresService SET Price = '" + TiresServicePrice.getText() + "' WHERE Date = '" + (String) a + "'");
            UpdateTiresInformation(Integer.parseInt(help));
        } else {
            JOptionPane.showMessageDialog(null, "Price and amount should be inserted as numeric data");
        }
    }//GEN-LAST:event_TiresServiceUpdateButtonActionPerformed

    private void NewTiresTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTiresTableMousePressed
        try {
            int row = NewTiresTable.getSelectedRow();
            Object data[] = new Object[7];
            Object a = NewTiresTable.getValueAt(row, 0);
            data = db.listTiresNewData((String) a);
            Date date1 = dateFormat.parse((String) a);
            TiresNewDate.setDate(date1);
            TiresNewDate.setEnabled(false);
            TiresPerson.setText((String) data[2]);
            TiresNewDescribtion.setText((String) data[1]);
            TiresNewItems.setText((String) data[3]);
            TiresNewCompany.setText((String) data[4]);
            TiresServicesCosts.setText((String) data[5]);
            TiresLabourCosts.setText((String) data[6]);

        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NewTiresTableMousePressed

    private void TiresServiceTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiresServiceTableMousePressed
        try {
            int row = TiresServiceTable.getSelectedRow();
            Object a = TiresServiceTable.getValueAt(row, 0);
            Object b = TiresServiceTable.getValueAt(row, 1);
            Object c = TiresServiceTable.getValueAt(row, 2);
            Object d = TiresServiceTable.getValueAt(row, 3);
            Object e = TiresServiceTable.getValueAt(row, 4);
            //int f;
            //int f1,f2;
            //f1 = Integer.parseInt((String) e);
            //f2 = Integer.parseInt((String) d);
            //f = f1+f2;
            Date date1 = dateFormat.parse((String) a);
            TiresServiceDate.setDate(date1);
            TiresServiceDate.setEnabled(false);//locking the Date for the user
            TiresServiceCompany.setText((String) b);
            TiresServiceAmount.setText((String) d);
            //TiresServicePrice.setText(Integer.toString(f));
            TiresServiceDescribtion.setText((String) c);
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TiresServiceTableMousePressed

    private void TiresServiceTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TiresServiceTableKeyPressed
        TiresServiceDate.setEnabled(true);//allowing to change date in order to let the user add new row to the table
        TiresServiceCompany.setText("");
        TiresServiceAmount.setText("");
        TiresServicePrice.setText("");
        TiresServiceDescribtion.setText("");
    }//GEN-LAST:event_TiresServiceTableKeyPressed

    private void AdditionalUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionalUpdateButtonActionPerformed
        int row = AdditionalProblemsTable.getSelectedRow();
        Object a = AdditionalProblemsTable.getValueAt(row, 0);
        if (isInteger(AdditionalMaterialCosts.getText()) && isInteger(AdditionalLabourCosts.getText())) {
            db.executeUpdate("UPDATE AdditionalProblems SET Run = '" + AdditionalRun.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE AdditionalProblems SET Company = '" + AdditionalCompany.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE AdditionalProblems SET Describtion = '" + AdditionalDescribtion.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE AdditionalProblems SET MaterialCosts = '" + AdditionalMaterialCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE AdditionalProblems SET LabourCosts = '" + AdditionalLabourCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            UpdateAdditionalInformation(Integer.parseInt(help));
        } else {
            JOptionPane.showMessageDialog(null, "Price should be inserted as a numeric value");
        }
    }//GEN-LAST:event_AdditionalUpdateButtonActionPerformed

    private void AdditionalProblemsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdditionalProblemsTableMousePressed
        try {
            Object[] data = new Object[6];
            int row = AdditionalProblemsTable.getSelectedRow();
            Object a = AdditionalProblemsTable.getValueAt(row, 0);
            data = db.listAdditionalProblemsData((String) a);
            Date date1 = dateFormat.parse((String) a);
            AdditionalDate.setDate(date1);
            AdditionalDate.setEnabled(false);
            AdditionalRun.setText((String) data[1]);
            AdditionalCompany.setText((String) data[2]);
            AdditionalDescribtion.setText((String) data[3]);
            AdditionalMaterialCosts.setText((String) data[4]);
            AdditionalLabourCosts.setText((String) data[5]);
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AdditionalProblemsTableMousePressed

    private void AdditionalProblemsTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdditionalProblemsTableKeyPressed
        AdditionalDate.setEnabled(true);
        AdditionalRun.setText("");
        AdditionalCompany.setText("");
        AdditionalDescribtion.setText("");
        AdditionalMaterialCosts.setText("");
        AdditionalLabourCosts.setText("");
    }//GEN-LAST:event_AdditionalProblemsTableKeyPressed

    private void RepairTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepairTableMousePressed
        try {
            Object data[] = new Object[7];
            int row = RepairTable.getSelectedRow();
            Object a = RepairTable.getValueAt(row, 0);
            data = db.listRepairData((String) a);
            Date date1 = dateFormat.parse((String) a);
            RepairDate.setDate(date1);
            RepairDate.setEnabled(false);
            RepairRun.setText((String) data[1]);
            RepairPerson.setText((String) data[3]);
            RepairPlace.setText((String) data[2]);
            RepairDescribtion.setText((String) data[4]);
            RepairMaterialPrice.setText((String) data[5]);
            RepairLabourCosts.setText((String) data[6]);
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RepairTableMousePressed

    private void RepairTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RepairTableKeyReleased
        RepairDate.setEnabled(true);
        RepairRun.setText("");
        RepairPerson.setText("");
        RepairPlace.setText("");
        RepairDescribtion.setText("");
        RepairMaterialPrice.setText("");
        RepairLabourCosts.setText("");
    }//GEN-LAST:event_RepairTableKeyReleased

    private void RepairUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairUpdateButtonActionPerformed
        int row = RepairTable.getSelectedRow();
        Object a = RepairTable.getValueAt(row, 0);
        if (isInteger(RepairMaterialPrice.getText()) && isInteger(RepairLabourCosts.getText())) {

            db.executeUpdate("UPDATE Repair SET Run = '" + RepairRun.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Repair SET Describtion = '" + RepairDescribtion.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Repair SET Person = '" + RepairPerson.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Repair SET Place = '" + RepairPlace.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Repair SET MaterialPrice = '" + RepairMaterialPrice.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Repair SET LabourCosts = '" + RepairLabourCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            UpdateRepairInformation(Integer.parseInt(help));
        } else {
            JOptionPane.showMessageDialog(null, "Price should be inserted as numeric data");
        }
    }//GEN-LAST:event_RepairUpdateButtonActionPerformed

    private void MaintananceUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintananceUpdateButtonActionPerformed
        int row = MaintananceTable.getSelectedRow();
        Object a = MaintananceTable.getValueAt(row, 0);
        if (isInteger(MaintananceLabourCosts.getText()) && isInteger(MaintananceOtherCosts.getText())
                && isInteger(MaintananceOilCosts.getText()) && isInteger(MaintananceFilterCosts.getText())) {
            db.executeUpdate("UPDATE Maintanance SET Run = '" + MaintananceRun.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET Location = '" + MaintananceLocation.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET Oil = '" + MaintananceOil.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET Amount = '" + MaintananceAmount1.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET Filter = '" + MaintananceFilter.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET LabourCosts = '" + MaintananceLabourCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET OilCosts = '" + MaintananceOilCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET FilterCosts = '" + MaintananceFilterCosts.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Maintanance SET OtherCosts = '" + MaintananceOtherCosts.getText() + "' WHERE Date = '" + (String) a + "'");
        } else {
            JOptionPane.showMessageDialog(null, "Price should be inserted as numeric data");
        }
        UpdateMaintananceInformation(Integer.parseInt(help));
    }//GEN-LAST:event_MaintananceUpdateButtonActionPerformed

    private void MaintananceTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaintananceTableMousePressed
        try {
            Object[] data = new Object[10];
            int row = MaintananceTable.getSelectedRow();
            Object a = MaintananceTable.getValueAt(row, 0);
            data = db.listMaintananceData((String) a);
            Date date1 = dateFormat.parse((String) a);
            MaintananceDate.setDate(date1);
            MaintananceDate.setEnabled(false);
            MaintananceRun.setText((String) data[1]);
            MaintananceLocation.setText((String) data[2]);
            MaintananceOil.setText((String) data[3]);
            MaintananceAmount1.setText((String) data[4]);
            MaintananceFilter.setText((String) data[5]);
            MaintananceLabourCosts.setText((String) data[6]);
            MaintananceOilCosts.setText((String) data[7]);
            MaintananceFilterCosts.setText((String) data[8]);
            MaintananceOtherCosts.setText((String) data[9]);

        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MaintananceTableMousePressed

    private void MaintananceTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MaintananceTableKeyPressed
        MaintananceDate.setEnabled(true);
        MaintananceRun.setText("");
        MaintananceLocation.setText("");
        MaintananceOil.setText("");
        MaintananceAmount1.setText("");
        MaintananceFilter.setText("");
        MaintananceLabourCosts.setText("");
        MaintananceOilCosts.setText("");
        MaintananceFilterCosts.setText("");
        MaintananceOtherCosts.setText("");
    }//GEN-LAST:event_MaintananceTableKeyPressed

    private void InspectionTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InspectionTableKeyPressed
        CheckupDate.setEnabled(true);//locking the date
        CheckupRun.setText("");
        CheckupDescribtion.setText("");
        CheckupPrice.setText("");
        CheckupLabourPrice.setText("");
    }//GEN-LAST:event_InspectionTableKeyPressed

    private void InspectionUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InspectionUpdateActionPerformed
        boolean undergoPrice = true;
        if (isInteger(CheckupPrice.getText()) && isInteger(CheckupLabourPrice.getText())) {
            int row = InspectionTable.getSelectedRow();
            Object a = InspectionTable.getValueAt(row, 0);
            db.executeUpdate("UPDATE Inspection SET Run = '" + CheckupRun.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Inspection SET Describtion = '" + CheckupDescribtion.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Inspection SET MaterialPrice = '" + CheckupPrice.getText() + "' WHERE Date = '" + (String) a + "'");
            db.executeUpdate("UPDATE Inspection SET LabourPrice = '" + CheckupLabourPrice.getText() + "' WHERE Date = '" + (String) a + "'");
        } else {
            JOptionPane.showMessageDialog(null, "Price should be inserted as an integer value");
            undergoPrice = false;
        }
        try {
            UpdateInspectionInformation(Integer.parseInt(help));
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InspectionUpdateActionPerformed

    private void AfterSellingSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfterSellingSaveActionPerformed
        boolean undergo = true;
        try {
            if (isInteger(AftersellingPrice.getText())) {
                int maxID = db.returnMaxID();
                String KelintasString = Integer.toString(KelintasGeneralInt);
                //getting unique ID

                String ConvertedGeneralSOLDDate = dateFormat.format(AftersellingDate.getDate());
                //Converting date to String

                UpdateDatabaseRow("GeneralAfterSelling", "Price", AftersellingPrice.getText(), help);
                UpdateDatabaseRow("GeneralAfterSelling", "Run", AftersellingRun.getText(), help);
                UpdateDatabaseRow("GeneralAfterSelling", "SellingDate", ConvertedGeneralSOLDDate, help);
                UpdateDatabaseRow("GeneralAfterSelling", "Buyer", AftersellingBuyer.getText(), help);
                //updating table
            } else {
                undergo = false;
                JOptionPane.showMessageDialog(null, "Price shoold be inserted as numeric data");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergo = false;
        }
        if (undergo) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
        }
    }//GEN-LAST:event_AfterSellingSaveActionPerformed

    private void InspectionSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InspectionSaveButtonActionPerformed
        boolean undergoRun = true;
        boolean undergoPrice = true;
        try {
            if (isInteger(CheckupPrice.getText()) && isInteger(CheckupLabourPrice.getText()) && isInteger(CheckupRun.getText())) {
                db.executeUpdate("INSERT INTO Inspection (ID, Date, Run, Descr"
                        + "ibtion, MaterialPrice, LabourPrice) VALUES ('" + help + "', "
                        + "'" + dateFormat.format(CheckupDate.getDate()) + "', '" + CheckupRun.getText() + "', '"
                        + "" + CheckupDescribtion.getText() + "', '" + CheckupPrice.getText() + "', "
                        + "'" + CheckupLabourPrice.getText() + "')");
                //Inserting information into database

                UpdateInspectionInformation(Integer.parseInt(help));
                //Updating inspection table
            } else if (isInteger(CheckupPrice.getText()) && isInteger(CheckupLabourPrice.getText())) {
                undergoRun = false;
                JOptionPane.showMessageDialog(null, "Run must be inserted as numeric data");
                //Informing the user about the occured problem

            } else {
                undergoPrice = false;
                JOptionPane.showMessageDialog(null, "Price must be inserted as numeric data");
                //Informing the user about the occured problem
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            undergoPrice = false;
        }
        if (undergoPrice && undergoRun) {
            JOptionPane.showMessageDialog(null, "Information Saved Succesfully");
            //informing the user whether information was saved succesfully
        }
    }//GEN-LAST:event_InspectionSaveButtonActionPerformed

    private void IncomeRentTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IncomeRentTextFocusGained
        if (IncomeRentText.getText().equals("0")) {
            IncomeRentText.setText("");
        }
    }//GEN-LAST:event_IncomeRentTextFocusGained

    private void IncomeRentTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IncomeRentTextFocusLost
        if (IncomeRentText.getText().equals("")) {
            IncomeRentText.setText("0");
        }
    }//GEN-LAST:event_IncomeRentTextFocusLost

    private void IncomePeriodTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IncomePeriodTextFocusGained
        if (IncomePeriodText.getText().equals("0")) {
            IncomePeriodText.setText("");
        }
    }//GEN-LAST:event_IncomePeriodTextFocusGained

    private void IncomePeriodTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IncomePeriodTextFocusLost
        if (IncomePeriodText.getText().equals("")) {
            IncomePeriodText.setText("0");
        }            // TODO add your handling code here:
    }//GEN-LAST:event_IncomePeriodTextFocusLost

    private void IncomeInsuranceTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IncomeInsuranceTextFocusGained
        if (IncomeInsuranceText.getText().equals("0")) {
            IncomeInsuranceText.setText("");
        }            // TODO add your handling code here:
    }//GEN-LAST:event_IncomeInsuranceTextFocusGained

    private void IncomeInsuranceTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IncomeInsuranceTextFocusLost
        if (IncomeInsuranceText.getText().equals("")) {
            IncomeInsuranceText.setText("0");
        }            // TODO add your handling code here:
    }//GEN-LAST:event_IncomeInsuranceTextFocusLost

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VehiclesInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiclesInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiclesInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiclesInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehiclesInformation(0).setVisible(true);
            }
        });

    }

    private void CreateDatabaseRow(String lentele, String lokacija, String pavadinimas) {
        String query = "INSERT INTO " + lentele + " (" + lokacija + ") VALUES ('" + pavadinimas + "')";
        db.executeUpdate(query);
    }

    private void UpdateDatabaseRow(String lentele, String lokacija, String pavadinimas, String kelintas) {
        String query = "UPDATE " + lentele + " SET " + lokacija + " = '" + pavadinimas + "' WHERE ID = '" + kelintas + "'";
        db.executeUpdate(query);
    }

    private void UpdateGeneralInformation(int ID) throws ParseException {
        try {
            Object[] data = new Object[18]; //
            Object data2[] = new Object[4];
            File location;
            data2 = db.listGeneralAfterSelling(ID);
            data = db.listGeneral(ID);
            Date date1 = dateFormat.parse((String) data[9]);
            Date date2 = dateFormat.parse((String) data[11]);
            if (data2[1] != null) {
                Date date3 = dateFormat.parse((String) data2[1]);
                AftersellingDate.setDate(date3);
            }
            GeneralBrand.setText((String) data[0]);
            GeneralModel.setText((String) data[1]);
            GeneralEngine.setText((String) data[2]);
            GeneralBodyType.setText((String) data[3]);
            GeneralEnginePower.setText((String) data[4]);
            GeneralGearbox.setText((String) data[5]);
            GeneralFuel.setText((String) data[6]);
            GeneralVIN.setText((String) data[7]);
            GeneralNumber.setText((String) data[8]);
            GeneralDate.setDate(date1);
            GeneralPrice.setText((String) data[10]);
            GeneralPurchaseDate.setDate(date2);
            GeneralPlace.setText((String) data[12]);
            GeneralWarranty.setText((String) data[13]);
            GeneralRun.setText((String) data[14]);
            GeneralMaintanancePeriod.setText((String) data[15]);
            GeneralSeats.setText((String) data[16]);
            GeneralPhotoLabel.setText((String) data[17]);
            GeneralButtonText.setText((String) data[17]);
            AftersellingPrice.setText((String) data2[0]);
            AftersellingRun.setText((String) data2[2]);
            AftersellingBuyer.setText((String) data2[3]);
            if (data[17] != null) {
                location = new File((String) data[17]);
                BufferedImage img = null;
                BufferedImage scaled = null;
                try {
                    img = ImageIO.read(location);
                    scaled = resizeImage(img, 470, 330);
                } catch (IOException ex) {
                    Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
                ImageIcon ii = new ImageIcon(scaled);
                GeneralPhotoLabel.setIcon(ii);
            }
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void UpdateInspectionInformation(int ID) throws ParseException {
        Object data[] = new Object[5];
        if (data[0] != null) {
            Date date = dateFormat.parse((String) data[0]);
            CheckupDate.setDate(date);
        }
        CheckupRun.setText((String) data[1]);
        CheckupDescribtion.setText((String) data[2]);
        CheckupPrice.setText((String) data[3]);
        CheckupLabourPrice.setText((String) data[4]);
        InspectionTable.setModel(db.listInspection(ID));
    }

    public void UpdateMaintananceInformation(int ID) {
        MaintananceTable.setModel(db.listMaintanance(ID));
    }

    public void UpdateRepairInformation(int ID) {
        RepairTable.setModel(db.listRepair(ID));
    }

    public void UpdateAdditionalInformation(int ID) {
        AdditionalProblemsTable.setModel(db.listAdditionalProblems(ID));
    }

    public void UpdateAccidentsInformation(int ID) {
        AccidentsClientTable.setModel(db.listAccidentsClient(ID));
        AccidentsCompanyTable.setModel(db.listAccidentsCompany(ID));

    }

    public void UpdateTiresInformation(int ID) {
        TiresServiceTable.setModel(db.listTiresService(ID));
        NewTiresTable.setModel(db.listTiresNew(ID));
    }

    public void UpdateInsuranceInformation(int ID) {
        InsuranceTable.setModel(db.listInsurance(ID));
    }

    public void UpdateRegistrationInformation(int ID) {
        try {
            Object[] data = new Object[4];
            data = db.listRegistration(ID);
            if (data[0] != null) {
                Date date1 = dateFormat.parse((String) data[0]);
                RegistrationDate.setDate(date1);
            }
            RegistrationAmount.setText((String) data[1]);
            RegistrationPrice.setText((String) data[2]);
            RegistrationDescribtion.setText((String) data[3]);
        } catch (ParseException ex) {
            Logger.getLogger(VehiclesInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UpdateLeaseInformation(int ID) {
        LeaseTable.setModel(db.listLease(ID));
    }

    public void UpdateIncomeInformation(int ID) {
        Object[] data = new Object[3];
        data = db.listIncome(ID);
        TotalIncomeAnswer.setText(Integer.toString((int) data[0]) + "€");
        TotalPeriodAnswer.setText(Integer.toString((int) data[1]) + " days");
        TotalIncomeInsuranceAnswer.setText(Integer.toString((int) data[2]) + "€");
    }

    public void UpdateInformation(int ID) {
        int help2 = Integer.parseInt((String) help);
        int check[] = new int[4];
        Object check3[] = new Object[4];
        check3 = db.listInformation2(ID);
        check = db.listInformation(ID);
        String check2[] = new String[4];
        for (int i = 0; i < 4; i++) {
            check2[i] = String.valueOf(check[i]);
        }
        GeneralAnswer.setText("+");
        RepairAnswer.setText(check2[0]);
        AccidentsAnswer.setText(check2[1]);
        AdditionalAnswer.setText(check2[2]);
        IncomeAnswer.setText(check2[3]);
        InspectionAnswer.setText("Last date: " + check3[1]);
        MaintananceAnswer.setText("Last date: " + check3[2]);
        RegistrationAnswer.setText("Registration date: " + check3[0]);

    }

    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccidentClientsExplanationTitle;
    private javax.swing.JPanel Accidents;
    private javax.swing.JTextField AccidentsAdditionalIncome;
    private javax.swing.JLabel AccidentsAnswer;
    private javax.swing.JLabel AccidentsClientIncomeTitle;
    private javax.swing.JLabel AccidentsClientNumberTitle;
    private javax.swing.JLabel AccidentsClientResponsibilityTitle;
    private javax.swing.JTable AccidentsClientTable;
    private javax.swing.JButton AccidentsClientsPartSaveButton;
    private javax.swing.JButton AccidentsClientsPartUpdateButton;
    private javax.swing.JLabel AccidentsClientsTableTitle;
    private javax.swing.JTextField AccidentsCompany;
    private javax.swing.JLabel AccidentsCompanyCompanyTitle;
    private javax.swing.JLabel AccidentsCompanyDateTitle;
    private javax.swing.JLabel AccidentsCompanyItemsTitle;
    private javax.swing.JLabel AccidentsCompanyLCostsTitle;
    private javax.swing.JButton AccidentsCompanyPartUpdateButton;
    private javax.swing.JLabel AccidentsCompanyPersonTitle;
    private javax.swing.JLabel AccidentsCompanySCostsTitle;
    private javax.swing.JButton AccidentsCompanySaveButton;
    private javax.swing.JTable AccidentsCompanyTable;
    private javax.swing.JLabel AccidentsCompanyTitle;
    private javax.swing.JLabel AccidentsCompanysExplanationTitle;
    private javax.swing.JTextField AccidentsContactNumber;
    private com.toedter.calendar.JDateChooser AccidentsDate;
    private javax.swing.JTextArea AccidentsDescribtion;
    private javax.swing.JTextArea AccidentsDescribtion2;
    private javax.swing.JButton AccidentsInsertPhotos;
    private javax.swing.JTextField AccidentsItems;
    private javax.swing.JTextField AccidentsLabourCosts;
    private javax.swing.JPanel AccidentsPanelClientsPart;
    private javax.swing.JPanel AccidentsPanelCompanysPart;
    private javax.swing.JTextField AccidentsPerson;
    private javax.swing.JDesktopPane AccidentsPhotoFrame;
    private javax.swing.JTextField AccidentsPhotoLocationText;
    private javax.swing.JLabel AccidentsPhotosLabel;
    private javax.swing.JTextField AccidentsResponsibility;
    private javax.swing.JTextField AccidentsServicesCosts;
    private javax.swing.JLabel AccidentsTitle2;
    private javax.swing.JLabel AdditionalAnswer;
    private javax.swing.JTextField AdditionalCompany;
    private javax.swing.JLabel AdditionalCompanyTitle;
    private com.toedter.calendar.JDateChooser AdditionalDate;
    private javax.swing.JLabel AdditionalDateTitle;
    private javax.swing.JTextArea AdditionalDescribtion;
    private javax.swing.JLabel AdditionalExplanationTitle;
    private javax.swing.JLabel AdditionalLCostsTitle;
    private javax.swing.JTextField AdditionalLabourCosts;
    private javax.swing.JLabel AdditionalMCostsTitle;
    private javax.swing.JTextField AdditionalMaterialCosts;
    private javax.swing.JLabel AdditionalNote;
    private javax.swing.JLabel AdditionalNote1;
    private javax.swing.JLabel AdditionalNote2;
    private javax.swing.JPanel AdditionalPanel;
    private javax.swing.JLabel AdditionalProblemsDate2;
    private javax.swing.JLabel AdditionalProblemsImportance;
    private javax.swing.JLabel AdditionalProblemsImportance1;
    private javax.swing.JButton AdditionalProblemsSaveButton;
    private javax.swing.JTable AdditionalProblemsTable;
    private javax.swing.JTextField AdditionalRun;
    private javax.swing.JLabel AdditionalRunTitle;
    private javax.swing.JLabel AdditionalSpendingsTitle;
    private javax.swing.JButton AdditionalUpdateButton;
    private javax.swing.JButton AfterSellingSave;
    private javax.swing.JTextField AftersellingBuyer;
    private com.toedter.calendar.JDateChooser AftersellingDate;
    private javax.swing.JTextField AftersellingPrice;
    private javax.swing.JTextField AftersellingRun;
    private javax.swing.JLabel BodyTypeTitle;
    private javax.swing.JLabel BrandTitle;
    private com.toedter.calendar.JDateChooser CheckupDate;
    private javax.swing.JTextField CheckupDescribtion;
    private javax.swing.JTextField CheckupLabourPrice;
    private javax.swing.JPanel CheckupPanel;
    private javax.swing.JTextField CheckupPrice;
    private javax.swing.JTextField CheckupRun;
    private javax.swing.JLabel ClientsImportance1;
    private javax.swing.JLabel ClientsNote1;
    private javax.swing.JLabel ClientsNote3;
    private javax.swing.JLabel ClientsNote4;
    private javax.swing.JLabel CompanyImportance;
    private javax.swing.JPanel Economy;
    private javax.swing.JButton EconomyHomeButton;
    private javax.swing.JTextArea EconomyTextArea;
    private javax.swing.JButton EconomyUpdateButton;
    private javax.swing.JLabel EnginePowerTitle;
    private javax.swing.JLabel EngineTitle;
    private javax.swing.JLabel FuelTitle;
    private javax.swing.JLabel GearBoxTitle;
    private javax.swing.JPanel GeneralAfterSellingPanel;
    private javax.swing.JLabel GeneralAnswer;
    private javax.swing.JTextField GeneralBodyType;
    private javax.swing.JTextField GeneralBrand;
    private javax.swing.JTextField GeneralButtonText;
    private com.toedter.calendar.JDateChooser GeneralDate;
    private javax.swing.JTextField GeneralEngine;
    private javax.swing.JTextField GeneralEnginePower;
    private javax.swing.JTextField GeneralFuel;
    private javax.swing.JTextField GeneralGearbox;
    private javax.swing.JPanel GeneralInformationPanel;
    private javax.swing.JButton GeneralInsertPhoto;
    private javax.swing.JTextField GeneralMaintanancePeriod;
    private javax.swing.JTextField GeneralModel;
    private javax.swing.JTextField GeneralNumber;
    private javax.swing.JDesktopPane GeneralPhotoFrame;
    private javax.swing.JLabel GeneralPhotoLabel;
    private javax.swing.JTextField GeneralPlace;
    private javax.swing.JTextField GeneralPrice;
    private com.toedter.calendar.JDateChooser GeneralPurchaseDate;
    private javax.swing.JLabel GeneralRegistration;
    private javax.swing.JTextField GeneralRun;
    private javax.swing.JButton GeneralSave;
    private javax.swing.JTextField GeneralSeats;
    private javax.swing.JLabel GeneralTitle;
    private javax.swing.JTextField GeneralVIN;
    private javax.swing.JTextField GeneralWarranty;
    private javax.swing.JLabel GeneralWhen4;
    private javax.swing.JLabel GeneralWhen6;
    private javax.swing.JPanel Gerenal;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton HomeButton2;
    private javax.swing.JButton HomeButton3;
    private javax.swing.JButton HomeButton4;
    private javax.swing.JButton HomeButton5;
    private javax.swing.JButton HomeButton7;
    private javax.swing.JLabel Income;
    private javax.swing.JLabel IncomeAnswer;
    private javax.swing.JLabel IncomeInsuranceEuro;
    private javax.swing.JTextField IncomeInsuranceText;
    private javax.swing.JLabel IncomeInsuranceTitle;
    private javax.swing.JPanel IncomePanel;
    private javax.swing.JTextField IncomePeriodText;
    private javax.swing.JLabel IncomePeriodTitlee;
    private javax.swing.JTextField IncomeRentText;
    private javax.swing.JLabel IncomeRentTitle;
    private javax.swing.JButton IncomeSaveButton;
    private javax.swing.JPanel Information;
    private javax.swing.JPanel InformationPanel;
    private javax.swing.JButton InformationUpdateButton;
    private javax.swing.JFrame InsertPhotos;
    private javax.swing.JPanel InspectionAndMaintanance;
    private javax.swing.JLabel InspectionAnswer;
    private javax.swing.JLabel InspectionDateTitle;
    private javax.swing.JLabel InspectionDateTitle1;
    private javax.swing.JLabel InspectionDateTitle3;
    private javax.swing.JLabel InspectionMPriceTitle;
    private javax.swing.JLabel InspectionNote;
    private javax.swing.JLabel InspectionRunTitle;
    private javax.swing.JButton InspectionSaveButton;
    private javax.swing.JTable InspectionTable;
    private javax.swing.JLabel InspectionTableTitle;
    private javax.swing.JLabel InspectionTableTitle1;
    private javax.swing.JLabel InspectionTitle;
    private javax.swing.JButton InspectionUpdate;
    private javax.swing.JTextField InsuranceCosts;
    private javax.swing.JLabel InsuranceCostsTitle;
    private javax.swing.JTextField InsuranceIncome;
    private javax.swing.JLabel InsuranceIncomeTitle;
    private javax.swing.JPanel InsurancePanel;
    private javax.swing.JTextField InsurancePeriod;
    private javax.swing.JLabel InsurancePeriodTitle;
    private javax.swing.JButton InsuranceSave;
    private javax.swing.JTable InsuranceTable;
    private javax.swing.JComboBox<String> InsuranceType;
    private javax.swing.JLabel InsuranceTypeTitle;
    private javax.swing.JTextField LeaseCompany;
    private com.toedter.calendar.JDateChooser LeaseDate;
    private javax.swing.JTextArea LeaseDescribtion;
    private javax.swing.JLabel LeaseDescribtionTitle;
    private javax.swing.JLabel LeaseImportance;
    private javax.swing.JLabel LeaseNote;
    private javax.swing.JPanel LeasePanel;
    private javax.swing.JTextField LeasePeriod;
    private javax.swing.JButton LeaseSaveButton;
    private javax.swing.JTextField LeaseSpendings;
    private javax.swing.JTable LeaseTable;
    private javax.swing.JButton LeaseUpdateButton;
    private javax.swing.JLabel Maintanance;
    private javax.swing.JTextField MaintananceAmount1;
    private javax.swing.JLabel MaintananceAmountTitle;
    private javax.swing.JLabel MaintananceAnswer;
    private com.toedter.calendar.JDateChooser MaintananceDate;
    private javax.swing.JLabel MaintananceDateTitle;
    private javax.swing.JLabel MaintananceFCostsTitle;
    private javax.swing.JTextField MaintananceFilter;
    private javax.swing.JTextField MaintananceFilterCosts;
    private javax.swing.JLabel MaintananceFilterTitle;
    private javax.swing.JLabel MaintananceImportance;
    private javax.swing.JLabel MaintananceImportance1;
    private javax.swing.JLabel MaintananceLCostsTitle;
    private javax.swing.JTextField MaintananceLabourCosts;
    private javax.swing.JTextField MaintananceLocation;
    private javax.swing.JLabel MaintananceLocationTitle;
    private javax.swing.JLabel MaintananceOCostsTitle;
    private javax.swing.JTextField MaintananceOil;
    private javax.swing.JTextField MaintananceOilCosts;
    private javax.swing.JLabel MaintananceOilCostsTitle;
    private javax.swing.JLabel MaintananceOilTypeTitle;
    private javax.swing.JTextField MaintananceOtherCosts;
    private javax.swing.JPanel MaintanancePanel;
    private javax.swing.JTextField MaintananceRun;
    private javax.swing.JLabel MaintananceRunTitle;
    private javax.swing.JButton MaintananceSaveButton;
    private javax.swing.JTable MaintananceTable;
    private javax.swing.JLabel MaintananceTitle;
    private javax.swing.JButton MaintananceUpdateButton;
    private javax.swing.JLabel ModelTitle;
    private javax.swing.JLabel NewTiresCompanyTitle;
    private javax.swing.JLabel NewTiresDateTitle;
    private javax.swing.JLabel NewTiresDescribtionTitle;
    private javax.swing.JLabel NewTiresImportance;
    private javax.swing.JLabel NewTiresLCostsTitle;
    private javax.swing.JLabel NewTiresLabel6;
    private javax.swing.JLabel NewTiresNote;
    private javax.swing.JLabel NewTiresNote1;
    private javax.swing.JPanel NewTiresPanel;
    private javax.swing.JLabel NewTiresPersonTitle;
    private javax.swing.JLabel NewTiresSCostsTitle;
    private javax.swing.JTable NewTiresTable;
    private javax.swing.JButton NewTiresUpdateButton;
    private javax.swing.JLabel NumberTitle;
    private javax.swing.JLabel PlaceTitle;
    private javax.swing.JLabel PriceTitle;
    private javax.swing.JLabel RecordInsuranceTitle;
    private javax.swing.JLabel RecordLeaseTitle;
    private javax.swing.JTextField RegistrationAmount;
    private javax.swing.JLabel RegistrationAmountTitlee;
    private javax.swing.JPanel RegistrationAndLeaseAndIncome;
    private javax.swing.JLabel RegistrationAnswer;
    private com.toedter.calendar.JDateChooser RegistrationDate;
    private javax.swing.JLabel RegistrationDateTitle;
    private javax.swing.JTextField RegistrationDescribtion;
    private javax.swing.JLabel RegistrationDescribtionTitle;
    private javax.swing.JLabel RegistrationLabel;
    private javax.swing.JLabel RegistrationLabel1;
    private javax.swing.JLabel RegistrationLabel2;
    private javax.swing.JLabel RegistrationLabel3;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JTextField RegistrationPrice;
    private javax.swing.JLabel RegistrationPriceTitle;
    private javax.swing.JLabel RegistrationTitle;
    private javax.swing.JPanel RepairAndAdditionalProblems;
    private javax.swing.JLabel RepairAnswer;
    private com.toedter.calendar.JDateChooser RepairDate;
    private javax.swing.JLabel RepairDateTitle;
    private javax.swing.JLabel RepairDateTitle7;
    private javax.swing.JTextArea RepairDescribtion;
    private javax.swing.JLabel RepairExplanationTitle;
    private javax.swing.JLabel RepairLCostsTitle;
    private javax.swing.JTextField RepairLabourCosts;
    private javax.swing.JLabel RepairMCostsTitle;
    private javax.swing.JTextField RepairMaterialPrice;
    private javax.swing.JPanel RepairPanel;
    private javax.swing.JTextField RepairPerson;
    private javax.swing.JTextField RepairPlace;
    private javax.swing.JLabel RepairPlaceTitle;
    private javax.swing.JTextField RepairRun;
    private javax.swing.JLabel RepairRunTitle;
    private javax.swing.JButton RepairSaveButton;
    private javax.swing.JTable RepairTable;
    private javax.swing.JLabel RepairTableTitle;
    private javax.swing.JLabel RepairTableTitle1;
    private javax.swing.JLabel RepairTitle;
    private javax.swing.JButton RepairUpdateButton;
    private javax.swing.JLabel RunTitle;
    private javax.swing.JLabel SeatsTitle;
    private javax.swing.JLabel ServiceDateLabel;
    private javax.swing.JLabel ServiceDateLabel1;
    private javax.swing.JLabel ServiceDateLabel2;
    private javax.swing.JLabel ServiceDateLabel3;
    private javax.swing.JLabel ServiceDateLabel4;
    private javax.swing.JLabel ServiceTiresImportance;
    private javax.swing.JPanel TiresAndInsurance;
    private javax.swing.JTextField TiresLabourCosts;
    private javax.swing.JTextField TiresNewCompany;
    private com.toedter.calendar.JDateChooser TiresNewDate;
    private javax.swing.JTextArea TiresNewDescribtion;
    private javax.swing.JTextField TiresNewItems;
    private javax.swing.JLabel TiresNewRecordTitle;
    private javax.swing.JButton TiresNewSave;
    private javax.swing.JTextField TiresPerson;
    private javax.swing.JTextField TiresServiceAmount;
    private javax.swing.JTextField TiresServiceCompany;
    private com.toedter.calendar.JDateChooser TiresServiceDate;
    private javax.swing.JTextArea TiresServiceDescribtion;
    private javax.swing.JPanel TiresServicePanel;
    private javax.swing.JTextField TiresServicePrice;
    private javax.swing.JLabel TiresServiceRecordTitle1;
    private javax.swing.JButton TiresServiceSave;
    private javax.swing.JTable TiresServiceTable;
    private javax.swing.JButton TiresServiceUpdateButton;
    private javax.swing.JTextField TiresServicesCosts;
    private javax.swing.JLabel TotalIncomeAnswer;
    private javax.swing.JLabel TotalIncomeFromInsuranceTitle;
    private javax.swing.JLabel TotalIncomeInsuranceAnswer;
    private javax.swing.JLabel TotalIncomeRentTitle;
    private javax.swing.JLabel TotalPeriodAnswer;
    private javax.swing.JLabel TotalPeriodTitle;
    private javax.swing.JLabel VINTitle;
    private javax.swing.JButton VehiclesRegistrationSaveButton;
    private javax.swing.JLabel WarrantyTitle;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    byte[] photo = null;
    String filename = null;

}
