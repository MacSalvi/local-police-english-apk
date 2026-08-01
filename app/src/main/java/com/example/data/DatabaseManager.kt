package com.example.data

import android.content.Context
import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

object DatabaseManager {
    private const val FILE_NAME = "database.json"

    fun getDatabaseFile(context: Context): File {
        return File(context.filesDir, FILE_NAME)
    }

    fun loadDatabase(context: Context): List<Module> {
        val file = getDatabaseFile(context)
        if (file.exists()) {
            try {
                val jsonString = file.readText()
                val parsed = parseJson(jsonString)
                if (parsed.isNotEmpty()) {
                    return parsed
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return getHardcodedModules()
    }

    fun getHardcodedModules(): List<Module> {
        return listOf(
            Module(
                moduleId = 1,
                moduleName = "Módulo I: Identificación e Intervención Inicial",
                lessons = listOf(
                    Lesson(
                        lessonId = 101,
                        lessonTitle = "Initial contact and vehicle stop",
                        vocabulary = listOf(
                            VocabularyItem("Police officer", "Police officer"),
                            VocabularyItem("Driver", "Driver"),
                            VocabularyItem("Passenger", "Passenger"),
                            VocabularyItem("Vehicle", "Vehicle"),
                            VocabularyItem("Engine", "Engine"),
                            VocabularyItem("ID", "ID"),
                            VocabularyItem("Driving licence", "Driving licence"),
                            VocabularyItem("Insurance", "Insurance"),
                            VocabularyItem("Documents", "Documents"),
                            VocabularyItem("Hands", "Hands"),
                            VocabularyItem("Pockets", "Pockets"),
                            VocabularyItem("Calm", "Calm"),
                            VocabularyItem("Cooperation", "Cooperation"),
                            VocabularyItem("Morning", "Morning"),
                            VocabularyItem("Evening", "Evening"),
                            VocabularyItem("Sir", "Sir"),
                            VocabularyItem("Ma'am", "Ma'am"),
                            VocabularyItem("Please", "Please")
                        ),
                        phrases = listOf(
                            PhraseItem("Good morning, Sir. Local Police.", "Good morning, Sir. Local Police."),
                            PhraseItem("Good evening, Ma'am. Local Police.", "Good evening, Ma'am. Local Police."),
                            PhraseItem("Please stay where you are.", "Please stay where you are."),
                            PhraseItem("Please do not move.", "Please do not move."),
                            PhraseItem("Please turn off the engine.", "Please turn off the engine."),
                            PhraseItem("Please step out of the vehicle.", "Please step out of the vehicle."),
                            PhraseItem("Please show me your hands.", "Please show me your hands."),
                            PhraseItem("Please take your hands out of your pockets.", "Please take your hands out of your pockets."),
                            PhraseItem("Please keep your hands where I can see them.", "Please keep your hands where I can see them."),
                            PhraseItem("Please stay calm.", "Please stay calm."),
                            PhraseItem("Everything is OK.", "Everything is OK."),
                            PhraseItem("This is a routine police check.", "This is a routine police check."),
                            PhraseItem("I need to speak with you.", "I need to speak with you."),
                            PhraseItem("Please listen carefully.", "Please listen carefully."),
                            PhraseItem("Please do not make sudden movements.", "Please do not make sudden movements."),
                            PhraseItem("Thank you for your cooperation.", "Thank you for your cooperation."),
                            PhraseItem("Please wait here.", "Please wait here."),
                            PhraseItem("Everything is in order, thank you.", "Everything is in order, thank you.")
                        ),
                        tips = listOf(
                            "Hands visibility: For safety, ask the citizen to show their hands. 'Please show me your hands' is polite and keeps you in control.",
                            "Use of titles: Addressing the citizen as 'Sir' or 'Ma'am' is professional and often helps reduce tension.",
                            "De-escalation: If the driver is nervous, use 'Please stay calm'. Your calm tone is usually mirrored by the citizen.",
                            "Imperatives: Use short, direct instructions. 'Please stay where you are' is more effective than long explanations.",
                            "Vehicle safety: Always ensure the engine is off before approaching the driver's door to avoid sudden movements."
                        )
                    ),
                    Lesson(
                        lessonId = 102,
                        lessonTitle = "Identification procedures",
                        vocabulary = listOf(
                            VocabularyItem("ID", "ID"),
                            VocabularyItem("Passport", "Passport"),
                            VocabularyItem("Driving licence", "Driving licence"),
                            VocabularyItem("Vehicle registration", "Vehicle registration"),
                            VocabularyItem("Insurance", "Insurance"),
                            VocabularyItem("Details", "Details"),
                            VocabularyItem("Verify", "Verify"),
                            VocabularyItem("Police station", "Police station"),
                            VocabularyItem("Valid", "Valid"),
                            VocabularyItem("Documentation", "Documentation"),
                            VocabularyItem("Photocopy", "Photocopy"),
                            VocabularyItem("Signature", "Signature"),
                            VocabularyItem("Citizen", "Citizen"),
                            VocabularyItem("Address", "Address"),
                            VocabularyItem("Original", "Original"),
                            VocabularyItem("Name", "Name"),
                            VocabularyItem("Surname", "Surname"),
                            VocabularyItem("Date of birth", "Date of birth")
                        ),
                        phrases = listOf(
                            PhraseItem("Please show me your ID.", "Please show me your ID."),
                            PhraseItem("Do you have your driving licence?", "Do you have your driving licence?"),
                            PhraseItem("Under Spanish law, I need to see your ID.", "Under Spanish law, I need to see your ID."),
                            PhraseItem("This is a routine ID check.", "This is a routine ID check."),
                            PhraseItem("Please let me see the document.", "Please let me see the document."),
                            PhraseItem("Is this document valid in Spain?", "Is this document valid in Spain?"),
                            PhraseItem("What is your current address?", "What is your current address?"),
                            PhraseItem("Please turn the document over.", "Please turn the document over."),
                            PhraseItem("I just need to verify your details.", "I just need to verify your details."),
                            PhraseItem("Everything is OK, this will be quick.", "Everything is OK, this will be quick."),
                            PhraseItem("Is this your original passport?", "Is this your original passport?"),
                            PhraseItem("I'm going to check your details.", "I'm going to check your details."),
                            PhraseItem("One moment, please.", "One moment, please."),
                            PhraseItem("Here is your ID, thank you.", "Here is your ID, thank you."),
                            PhraseItem("If you don't have ID, you must come with us.", "If you don't have ID, you must come with us."),
                            PhraseItem("We can go to the police station to verify your ID.", "We can go to the police station to verify your ID."),
                            PhraseItem("Thank you for your cooperation.", "Thank you for your cooperation.")
                        ),
                        tips = listOf(
                            "Legal requirement: Reference 'Spanish law' to explain why ID is required. It clarifies that the request is not arbitrary.",
                            "Reassurance: Use 'This is a routine check' to ease the citizen's mind if they seem worried.",
                            "Original documents: Clarify that copies are often not enough: 'I need the original document, please'.",
                            "Officer safety: While checking details, keep the citizen in your line of sight. Avoid turning your back.",
                            "Station verification: Many tourists leave passports at their hotel. Under Spanish law, you may need to escort them to the station to verify their ID."
                        )
                    ),
                    Lesson(
                        lessonId = 103,
                        lessonTitle = "Security search",
                        vocabulary = listOf(
                            VocabularyItem("Search", "Search"),
                            VocabularyItem("Pat-down", "Pat-down"),
                            VocabularyItem("Dangerous object", "Dangerous object"),
                            VocabularyItem("Knife", "Knife"),
                            VocabularyItem("Prohibited", "Prohibited"),
                            VocabularyItem("Pockets", "Pockets"),
                            VocabularyItem("Jacket", "Jacket"),
                            VocabularyItem("Bag", "Bag"),
                            VocabularyItem("Safety", "Safety"),
                            VocabularyItem("Cooperate", "Cooperate"),
                            VocabularyItem("Procedure", "Procedure"),
                            VocabularyItem("Threat", "Threat"),
                            VocabularyItem("Compliance", "Compliance"),
                            VocabularyItem("Item", "Item"),
                            VocabularyItem("Seize", "Seize"),
                            VocabularyItem("Calm", "Calm"),
                            VocabularyItem("Vehicle", "Vehicle"),
                            VocabularyItem("Wait", "Wait")
                        ),
                        phrases = listOf(
                            PhraseItem("I need to perform a security search.", "I need to perform a security search."),
                            PhraseItem("Please stand against the vehicle.", "Please stand against the vehicle."),
                            PhraseItem("Please put your hands on the vehicle.", "Please put your hands on the vehicle."),
                            PhraseItem("Please keep your hands where I can see them.", "Please keep your hands where I can see them."),
                            PhraseItem("Do you have any dangerous objects?", "Do you have any dangerous objects?"),
                            PhraseItem("Please empty your pockets.", "Please empty your pockets."),
                            PhraseItem("I am going to perform a pat-down for safety.", "I am going to perform a pat-down for safety."),
                            PhraseItem("This is a standard security procedure.", "This is a standard security procedure."),
                            PhraseItem("Please do not put your hands in your pockets.", "Please do not put your hands in your pockets."),
                            PhraseItem("Please open your jacket.", "Please open your jacket."),
                            PhraseItem("May I check this bag?", "May I check this bag?"),
                            PhraseItem("It is for your safety and mine.", "It is for your safety and mine."),
                            PhraseItem("This object is prohibited.", "This object is prohibited."),
                            PhraseItem("You cannot carry this with you.", "You cannot carry this with you."),
                            PhraseItem("We must seize this item.", "We must seize this item."),
                            PhraseItem("Please stay calm.", "Please stay calm."),
                            PhraseItem("Thank you for your cooperation.", "Thank you for your cooperation."),
                            PhraseItem("You are free to go now.", "You are free to go now.")
                        ),
                        tips = listOf(
                            "Legal basis: Explain the reason for the search clearly: 'Due to safety reasons'. This helps the citizen understand the necessity.",
                            "Physical safety: Maintain a safe posture and keep your dominant hand free. Never put yourself in a vulnerable position.",
                            "Communication: A search can feel intrusive. Using 'It is for your safety and mine' creates a shared understanding.",
                            "Procedure: British citizens may be familiar with 'Stop and Search'. If they ask, explain it is a standard police procedure in Spain.",
                            "Prohibited items: If you find a prohibited item, be firm and calm: 'This object is prohibited under Spanish law, we must seize it'."
                        )
                    )
                )
            ),
            Module(
                moduleId = 2,
                moduleName = "Módulo II: Detención y Custodia",
                lessons = listOf(
                    Lesson(
                        lessonId = 201,
                        lessonTitle = "Arrest and rights",
                        vocabulary = listOf(
                            VocabularyItem("Arrest", "Arrest"),
                            VocabularyItem("Rights", "Rights"),
                            VocabularyItem("Custody", "Custody"),
                            VocabularyItem("Solicitor", "Solicitor"),
                            VocabularyItem("Interpreter", "Interpreter"),
                            VocabularyItem("Silence", "Silence"),
                            VocabularyItem("Charges", "Charges"),
                            VocabularyItem("Handcuffs", "Handcuffs"),
                            VocabularyItem("Offence", "Offence"),
                            VocabularyItem("Detainee", "Detainee"),
                            VocabularyItem("Legal counsel", "Legal counsel"),
                            VocabularyItem("Statement", "Statement"),
                            VocabularyItem("Procedure", "Procedure"),
                            VocabularyItem("Consulate", "Consulate"),
                            VocabularyItem("Duty solicitor", "Duty solicitor"),
                            VocabularyItem("Sign", "Sign"),
                            VocabularyItem("Explanation", "Explanation"),
                            VocabularyItem("Calm", "Calm")
                        ),
                        phrases = listOf(
                            PhraseItem("You are under arrest.", "You are under arrest."),
                            PhraseItem("These are your legal rights.", "These are your legal rights."),
                            PhraseItem("You have the right to remain silent.", "You have the right to remain silent."),
                            PhraseItem("Anything you say may be used against you.", "Anything you say may be used against you."),
                            PhraseItem("You have the right to a solicitor.", "You have the right to a solicitor."),
                            PhraseItem("You have the right to an interpreter.", "You have the right to an interpreter."),
                            PhraseItem("You are under arrest for this offence.", "You are under arrest for this offence."),
                            PhraseItem("I am going to handcuff you.", "I am going to handcuff you."),
                            PhraseItem("Please put your hands behind your back.", "Please put your hands behind your back."),
                            PhraseItem("Please do not resist.", "Please do not resist."),
                            PhraseItem("Your rights will be read at the police station.", "Your rights will be read at the police station."),
                            PhraseItem("Do you understand your rights?", "Do you understand your rights?"),
                            PhraseItem("I wish to request a duty solicitor.", "I wish to request a duty solicitor."),
                            PhraseItem("You may contact your consulate.", "You may contact your consulate."),
                            PhraseItem("Please stay calm.", "Please stay calm."),
                            PhraseItem("You are in police custody.", "You are in police custody."),
                            PhraseItem("Please sign the notice of rights here.", "Please sign the notice of rights here."),
                            PhraseItem("I will explain the process in a moment.", "I will explain the process in a moment.")
                        ),
                        tips = listOf(
                            "Legal protocol: Adhere strictly to the reading of rights as per the Spanish Code of Criminal Procedure (LECrim).",
                            "Clarity: Use 'You are under arrest' to avoid ambiguity; the citizen must know their liberty has ceased immediately.",
                            "Handcuffs: Before applying handcuffs, briefly explain: 'I am going to handcuff you for safety reasons'.",
                            "Solicitor request: If the detainee requests a 'duty solicitor', note the exact time of the request. This is critical for procedural guarantees.",
                            "Interpreter: If the citizen struggles with English, always offer the right to a professional interpreter to ensure their rights are protected."
                        )
                    ),
                    Lesson(
                        lessonId = 202,
                        lessonTitle = "Disobedience and resistance",
                        vocabulary = listOf(
                            VocabularyItem("Disobedience", "Disobedience"),
                            VocabularyItem("Resistance", "Resistance"),
                            VocabularyItem("Passive", "Passive"),
                            VocabularyItem("Active", "Active"),
                            VocabularyItem("Aggression", "Aggression"),
                            VocabularyItem("Warning", "Warning"),
                            VocabularyItem("Compliance", "Compliance"),
                            VocabularyItem("Force", "Force"),
                            VocabularyItem("Proportional", "Proportional"),
                            VocabularyItem("Officer safety", "Officer safety"),
                            VocabularyItem("Threat", "Threat"),
                            VocabularyItem("Restrain", "Restrain"),
                            VocabularyItem("Order", "Order"),
                            VocabularyItem("Refusal", "Refusal"),
                            VocabularyItem("Calm down", "Calm down"),
                            VocabularyItem("Disturbance", "Disturbance"),
                            VocabularyItem("Criminal offence", "Criminal offence"),
                            VocabularyItem("Police officer", "Police officer")
                        ),
                        phrases = listOf(
                            PhraseItem("Please stop immediately.", "Please stop immediately."),
                            PhraseItem("This is a lawful order.", "This is a lawful order."),
                            PhraseItem("You are disobeying the authority.", "You are disobeying the authority."),
                            PhraseItem("You are resisting arrest.", "You are resisting arrest."),
                            PhraseItem("Please comply with the order.", "Please comply with the order."),
                            PhraseItem("If you continue to resist, I will use force.", "If you continue to resist, I will use force."),
                            PhraseItem("The use of force will be proportional.", "The use of force will be proportional."),
                            PhraseItem("Do not move or I will have to restrain you.", "Do not move or I will have to restrain you."),
                            PhraseItem("Please calm down right now!", "Please calm down right now!"),
                            PhraseItem("Do not try to assault the police officer.", "Do not try to assault the police officer."),
                            PhraseItem("Your refusal is making the situation worse.", "Your refusal is making the situation worse."),
                            PhraseItem("This behaviour is a criminal offence.", "This behaviour is a criminal offence."),
                            PhraseItem("Please drop the object immediately.", "Please drop the object immediately."),
                            PhraseItem("Please keep a safe distance.", "Please keep a safe distance."),
                            PhraseItem("I am warning you for the last time.", "I am warning you for the last time."),
                            PhraseItem("Please cooperate, avoid the use of force.", "Please cooperate, avoid the use of force."),
                            PhraseItem("You are disturbing the public order.", "You are disturbing the public order."),
                            PhraseItem("The force used was the minimum necessary.", "The force used was the minimum necessary.")
                        ),
                        tips = listOf(
                            "Warnings: A clear warning ('I am warning you for the last time') is essential. It must be clear that dialogue has been exhausted.",
                            "Proportionality: Emphasise that force is a last resort: 'Avoid the use of force'. This shows your intention is to restore order.",
                            "Documentation: If resistance occurs, document each warning you gave. It is powerful evidence of your professionalism.",
                            "Safety: If an individual becomes violent, prioritise distance. 'Please keep a safe distance' is an instruction for the citizen and bystanders.",
                            "Assertiveness: If there is active resistance, move from 'please' to direct, assertive commands. Safety takes priority."
                        )
                    ),
                    Lesson(
                        lessonId = 203,
                        lessonTitle = "Transfer to custody",
                        vocabulary = listOf(
                            VocabularyItem("Transfer", "Transfer"),
                            VocabularyItem("Police station", "Police station"),
                            VocabularyItem("Custody", "Custody"),
                            VocabularyItem("Police van", "Police van"),
                            VocabularyItem("Booking-in", "Booking-in"),
                            VocabularyItem("Cell", "Cell"),
                            VocabularyItem("Belongings", "Belongings"),
                            VocabularyItem("Search", "Search"),
                            VocabularyItem("Paperwork", "Paperwork"),
                            VocabularyItem("Statement", "Statement"),
                            VocabularyItem("Medical assistance", "Medical assistance"),
                            VocabularyItem("Duty solicitor", "Duty solicitor"),
                            VocabularyItem("Transport", "Transport"),
                            VocabularyItem("Security", "Security"),
                            VocabularyItem("Procedure", "Procedure"),
                            VocabularyItem("Behaviour", "Behaviour"),
                            VocabularyItem("Doctor", "Doctor"),
                            VocabularyItem("Instructions", "Instructions")
                        ),
                        phrases = listOf(
                            PhraseItem("We are taking you to the police station.", "We are taking you to the police station."),
                            PhraseItem("Please get into the police vehicle.", "Please get into the police vehicle."),
                            PhraseItem("You will remain in custody temporarily.", "You will remain in custody temporarily."),
                            PhraseItem("Upon arrival, we will follow the procedures.", "Upon arrival, we will follow the procedures."),
                            PhraseItem("We will inform you of the booking-in process.", "We will inform you of the booking-in process."),
                            PhraseItem("All your belongings will be searched.", "All your belongings will be searched."),
                            PhraseItem("Your personal belongings will be stored.", "Your personal belongings will be stored."),
                            PhraseItem("If you feel unwell, you can request a doctor.", "If you feel unwell, you can request a doctor."),
                            PhraseItem("Do you need any medical assistance now?", "Do you need any medical assistance now?"),
                            PhraseItem("This is where you will give your statement.", "This is where you will give your statement."),
                            PhraseItem("Your solicitor will see you shortly.", "Your solicitor will see you shortly."),
                            PhraseItem("Please maintain proper behaviour.", "Please maintain proper behaviour."),
                            PhraseItem("This is a standard security process.", "This is a standard security process."),
                            PhraseItem("Do not attempt to damage the facilities.", "Do not attempt to damage the facilities."),
                            PhraseItem("You will be moved to the cell area.", "You will be moved to the cell area."),
                            PhraseItem("Do you understand the procedure?", "Do you understand the procedure?"),
                            PhraseItem("Thank you for following instructions.", "Thank you for following instructions."),
                            PhraseItem("The transport has arrived, let's go.", "The transport has arrived, let's go.")
                        ),
                        tips = listOf(
                            "Transport safety: Ensure the detainee is properly secured before departing. This is a moment of high vulnerability.",
                            "Anxiety reduction: Citizens often worry during transfer ('Where are you taking me?'). Explain: 'We are taking you to the police station for standard procedures'.",
                            "Chain of custody: Be methodical with belongings. Explain: 'Your belongings will be stored safely'.",
                            "Medical assistance: Proactively ask 'Do you need any medical assistance?'. If they claim an ailment, protocol requires an evaluation before cell entry.",
                            "Behaviour: Some detainees try to damage facilities. Warn clearly: 'Do not attempt to damage the facilities'."
                        )
                    )
                )
            ),
            Module(
                moduleId = 3,
                moduleName = "Módulo III: Atención a Víctimas",
                lessons = listOf(
                    Lesson(
                        lessonId = 301,
                        lessonTitle = "Initial victim support",
                        vocabulary = listOf(
                            VocabularyItem("Victim", "Victim"),
                            VocabularyItem("Report", "Report"),
                            VocabularyItem("Support", "Support"),
                            VocabularyItem("Safety", "Safety"),
                            VocabularyItem("Calm", "Calm"),
                            VocabularyItem("Medical", "Medical"),
                            VocabularyItem("Witness", "Witness"),
                            VocabularyItem("Facts", "Facts"),
                            VocabularyItem("Assistance", "Assistance"),
                            VocabularyItem("Emergency", "Emergency"),
                            VocabularyItem("Police station", "Police station"),
                            VocabularyItem("Statement", "Statement"),
                            VocabularyItem("Rights", "Rights"),
                            VocabularyItem("Interpreter", "Interpreter"),
                            VocabularyItem("Confidentiality", "Confidentiality"),
                            VocabularyItem("Help", "Help"),
                            VocabularyItem("Safe", "Safe"),
                            VocabularyItem("Paperwork", "Paperwork")
                        ),
                        phrases = listOf(
                            PhraseItem("I am here to help you.", "I am here to help you."),
                            PhraseItem("Please sit down and calm down.", "Please sit down and calm down."),
                            PhraseItem("Do you need medical assistance now?", "Do you need medical assistance now?"),
                            PhraseItem("I am listening. What happened?", "I am listening. What happened?"),
                            PhraseItem("Take your time, please.", "Take your time, please."),
                            PhraseItem("You are in a safe place.", "You are in a safe place."),
                            PhraseItem("We are going to take your personal details.", "We are going to take your personal details."),
                            PhraseItem("Would you like us to call someone?", "Would you like us to call someone?"),
                            PhraseItem("You have the right to an interpreter.", "You have the right to an interpreter."),
                            PhraseItem("We are going to proceed with the report.", "We are going to proceed with the report."),
                            PhraseItem("Can you describe the person?", "Can you describe the person?"),
                            PhraseItem("Are there any witnesses?", "Are there any witnesses?"),
                            PhraseItem("This is confidential.", "This is confidential."),
                            PhraseItem("I understand this is difficult.", "I understand this is difficult."),
                            PhraseItem("Do not worry about the paperwork now.", "Do not worry about the paperwork now."),
                            PhraseItem("We will explain the whole process.", "We will explain the whole process."),
                            PhraseItem("Your safety is our priority.", "Your safety is our priority."),
                            PhraseItem("Thank you for trusting us.", "Thank you for trusting us.")
                        ),
                        tips = listOf(
                            "Emotional first aid: A victim in shock cannot process complex info. Keep phrases brief: 'You are in a safe place'.",
                            "Emotional validation: Using 'I understand this is difficult' helps build trust.",
                            "Witnesses: Separate witnesses from the victim to avoid story contamination, but ensure the victim feels protected.",
                            "Physical safety: Ensure the victim is not in immediate danger before starting paperwork.",
                            "Expectations: Don't speculate. Focus on the procedure: 'We are going to proceed with the report'."
                        )
                    ),
                    Lesson(
                        lessonId = 302,
                        lessonTitle = "Reporting a theft",
                        vocabulary = listOf(
                            VocabularyItem("Theft", "Theft"),
                            VocabularyItem("Wallet", "Wallet"),
                            VocabularyItem("Mobile phone", "Mobile phone"),
                            VocabularyItem("Documents", "Documents"),
                            VocabularyItem("Description", "Description"),
                            VocabularyItem("Location", "Location"),
                            VocabularyItem("Time", "Time"),
                            VocabularyItem("Serial number", "Serial number"),
                            VocabularyItem("Insurance", "Insurance"),
                            VocabularyItem("Suspect", "Suspect"),
                            VocabularyItem("Clothing", "Clothing"),
                            VocabularyItem("Copy", "Copy"),
                            VocabularyItem("File number", "File number"),
                            VocabularyItem("Processing", "Processing"),
                            VocabularyItem("Sign", "Sign"),
                            VocabularyItem("Declaration", "Declaration"),
                            VocabularyItem("Cards", "Cards"),
                            VocabularyItem("Updates", "Updates")
                        ),
                        phrases = listOf(
                            PhraseItem("What items have been stolen?", "What items have been stolen?"),
                            PhraseItem("Where did the theft take place?", "Where did the theft take place?"),
                            PhraseItem("What time did it happen?", "What time did it happen?"),
                            PhraseItem("Can you describe the suspect?", "Can you describe the suspect?"),
                            PhraseItem("What clothing was he/she wearing?", "What clothing was he/she wearing?"),
                            PhraseItem("Do you remember the serial number?", "Do you remember the serial number?"),
                            PhraseItem("We need this for the insurance.", "We need this for the insurance."),
                            PhraseItem("Please sign this statement.", "Please sign this statement."),
                            PhraseItem("Here is a copy of the report.", "Here is a copy of the report."),
                            PhraseItem("Keep this file number.", "Keep this file number."),
                            PhraseItem("Have you seen anyone suspicious?", "Have you seen anyone suspicious?"),
                            PhraseItem("Did he/she have any distinctive sign?", "Did he/she have any distinctive sign?"),
                            PhraseItem("The report has been processed.", "The report has been processed."),
                            PhraseItem("Do you need the report in English?", "Do you need the report in English?"),
                            PhraseItem("This will be sent to the court.", "This will be sent to the court."),
                            PhraseItem("Thank you for your description.", "Thank you for your description."),
                            PhraseItem("Do not forget to cancel your cards.", "Do not forget to cancel your cards."),
                            PhraseItem("We will inform you of any updates.", "We will inform you of any updates.")
                        ),
                        tips = listOf(
                            "Precision: If the description is vague, guide them: 'Can you describe the height, hair colour or clothing?'.",
                            "Insurance: Many tourists report only for insurance purposes. Explain: 'Keep this file number, you will need it for the insurance'.",
                            "Documents in English: Provide an informative note in English, but clarify that the valid legal document is in Spanish.",
                            "Data custody: If it's a mobile phone, obtain the IMEI immediately if possible: 'Do you know the serial number or IMEI?'.",
                            "Closing the report: Ensure they understand their part is done: 'The report has been processed'."
                        )
                    ),
                    Lesson(
                        lessonId = 303,
                        lessonTitle = "Post-report follow-up",
                        vocabulary = listOf(
                            VocabularyItem("Follow-up", "Follow-up"),
                            VocabularyItem("Court", "Court"),
                            VocabularyItem("Solicitor", "Solicitor"),
                            VocabularyItem("Notification", "Notification"),
                            VocabularyItem("Victim support", "Victim support"),
                            VocabularyItem("Help", "Help"),
                            VocabularyItem("Mobile phone", "Mobile phone"),
                            VocabularyItem("Status", "Status"),
                            VocabularyItem("Investigation", "Investigation"),
                            VocabularyItem("Procedure", "Procedure"),
                            VocabularyItem("Information", "Information"),
                            VocabularyItem("Contact", "Contact"),
                            VocabularyItem("Security", "Security"),
                            VocabularyItem("Call", "Call"),
                            VocabularyItem("Address", "Address"),
                            VocabularyItem("Justice", "Justice"),
                            VocabularyItem("Case", "Case"),
                            VocabularyItem("Day", "Day")
                        ),
                        phrases = listOf(
                            PhraseItem("Do you have any questions about the process?", "Do you have any questions about the process?"),
                            PhraseItem("You will receive a notification from the court.", "You will receive a notification from the court."),
                            PhraseItem("The court will summon you if necessary.", "The court will summon you if necessary."),
                            PhraseItem("Here is the contact for the victim support office.", "Here is the contact for the victim support office."),
                            PhraseItem("You can check the status online.", "You can check the status online."),
                            PhraseItem("The investigation is open.", "The investigation is open."),
                            PhraseItem("Your presence is not required now.", "Your presence is not required now."),
                            PhraseItem("If you have new information, please call us.", "If you have new information, please call us."),
                            PhraseItem("We will send a letter to your address.", "We will send a letter to your address."),
                            PhraseItem("Please keep your mobile phone active.", "Please keep your mobile phone active."),
                            PhraseItem("Do you have a solicitor in Spain?", "Do you have a solicitor in Spain?"),
                            PhraseItem("We will notify you of any progress.", "We will notify you of any progress."),
                            PhraseItem("Thank you for cooperating with justice.", "Thank you for cooperating with justice."),
                            PhraseItem("Do you feel safe returning to your hotel?", "Do you feel safe returning to your hotel?"),
                            PhraseItem("If there are any problems, please call 092.", "If there are any problems, please call 092."),
                            PhraseItem("Your role is very important to us.", "Your role is very important to us."),
                            PhraseItem("We are working on your case.", "We are working on your case."),
                            PhraseItem("Have a good day.", "Have a good day.")
                        ),
                        tips = listOf(
                            "Expectations: Judicial processes can be slow. Explain: 'You will receive a notification from the court' to manage expectations.",
                            "Contact: Ensure you have a valid contact address or email. 'Please keep your mobile phone active' is vital.",
                            "Safety: If the victim is vulnerable, always ask: 'Do you feel safe returning to your hotel?'.",
                            "Support resources: Provide the contact for 'Victim support office'. Many tourists are unaware of these services.",
                            "Cooperation: Finish with: 'Your role is very important to us' to conclude on a positive note."
                        )
                    )
                )
            ),
            Module(
                moduleId = 4,
                moduleName = "Módulo IV: Emergencias",
                lessons = listOf(
                    Lesson(
                        lessonId = 401,
                        lessonTitle = "Medical emergencies",
                        vocabulary = listOf(
                            VocabularyItem("Emergency", "Emergency"),
                            VocabularyItem("Ambulance", "Ambulance"),
                            VocabularyItem("Paramedic", "Paramedic"),
                            VocabularyItem("Injured", "Injured"),
                            VocabularyItem("Unconscious", "Unconscious"),
                            VocabularyItem("Breathing", "Breathing"),
                            VocabularyItem("Bleeding", "Bleeding"),
                            VocabularyItem("Pain", "Pain"),
                            VocabularyItem("Heart", "Heart"),
                            VocabularyItem("CPR", "CPR"),
                            VocabularyItem("Location", "Location"),
                            VocabularyItem("Transfer", "Transfer"),
                            VocabularyItem("Urgent", "Urgent"),
                            VocabularyItem("Assistance", "Assistance"),
                            VocabularyItem("Protocol", "Protocol"),
                            VocabularyItem("Doctor", "Doctor"),
                            VocabularyItem("Area", "Area"),
                            VocabularyItem("Help", "Help")
                        ),
                        phrases = listOf(
                            PhraseItem("We need an ambulance urgently.", "We need an ambulance urgently."),
                            PhraseItem("What is your exact location?", "What is your exact location?"),
                            PhraseItem("The person is unconscious.", "The person is unconscious."),
                            PhraseItem("Is he/she breathing?", "Is he/she breathing?"),
                            PhraseItem("He/she has severe bleeding.", "He/she has severe bleeding."),
                            PhraseItem("Please keep calm.", "Please keep calm."),
                            PhraseItem("Do not move the injured person.", "Do not move the injured person."),
                            PhraseItem("Medical help is on the way.", "Medical help is on the way."),
                            PhraseItem("Can you hear me?", "Can you hear me?"),
                            PhraseItem("Where do you feel the pain?", "Where do you feel the pain?"),
                            PhraseItem("We are going to perform CPR.", "We are going to perform CPR."),
                            PhraseItem("Is there a doctor here?", "Is there a doctor here?"),
                            PhraseItem("Please keep the area clear.", "Please keep the area clear."),
                            PhraseItem("Please facilitate access for the ambulance.", "Please facilitate access for the ambulance."),
                            PhraseItem("Please cooperate with the paramedics.", "Please cooperate with the paramedics."),
                            PhraseItem("We are in contact with 112.", "We are in contact with 112."),
                            PhraseItem("Please follow the paramedic's instructions.", "Please follow the paramedic's instructions."),
                            PhraseItem("Thank you for waiting, help is arriving.", "Thank you for waiting, help is arriving.")
                        ),
                        tips = listOf(
                            "112 Protocol: In critical situations, be clear and authoritative. Use 'Please keep the area clear' so paramedics can work.",
                            "Critical info: Use the METHANE acronym (Major incident, Exact location, Type, Hazards, Access, Number of casualties, Emergency services required).",
                            "Patient safety: Do not move an injured person if spinal injury is suspected. 'Do not move the injured person' is vital.",
                            "Scene control: Keep your calm. If witnesses are nervous, give them a task: 'Please stand back' or 'You, help me keep people away'.",
                            "Handover: When paramedics arrive, provide brief essential info: 'Patient is unconscious, breathing is shallow'."
                        )
                    ),
                    Lesson(
                        lessonId = 402,
                        lessonTitle = "Fire and public safety",
                        vocabulary = listOf(
                            VocabularyItem("Fire", "Fire"),
                            VocabularyItem("Smoke", "Smoke"),
                            VocabularyItem("Evacuation", "Evacuation"),
                            VocabularyItem("Perimeter", "Perimeter"),
                            VocabularyItem("Firefighters", "Firefighters"),
                            VocabularyItem("Danger", "Danger"),
                            VocabularyItem("Exit", "Exit"),
                            VocabularyItem("Safety", "Safety"),
                            VocabularyItem("Gas", "Gas"),
                            VocabularyItem("Leak", "Leak"),
                            VocabularyItem("Safe zone", "Safe zone"),
                            VocabularyItem("Clear", "Clear"),
                            VocabularyItem("Building", "Building"),
                            VocabularyItem("Distance", "Distance"),
                            VocabularyItem("Vehicle", "Vehicle"),
                            VocabularyItem("Flames", "Flames"),
                            VocabularyItem("Order", "Order"),
                            VocabularyItem("Access", "Access")
                        ),
                        phrases = listOf(
                            PhraseItem("Please evacuate the building immediately.", "Please evacuate the building immediately."),
                            PhraseItem("Fire! Get away from the area.", "Fire! Get away from the area."),
                            PhraseItem("Please stay outside the perimeter.", "Please stay outside the perimeter."),
                            PhraseItem("Do not use the elevator.", "Do not use the elevator."),
                            PhraseItem("Please follow the exit signs.", "Please follow the exit signs."),
                            PhraseItem("There is a lot of smoke inside.", "There is a lot of smoke inside."),
                            PhraseItem("The firefighters are on their way.", "The firefighters are on their way."),
                            PhraseItem("Is there anyone inside the building?", "Is there anyone inside the building?"),
                            PhraseItem("Please go to the safe zone.", "Please go to the safe zone."),
                            PhraseItem("Please close the doors behind you.", "Please close the doors behind you."),
                            PhraseItem("It is a gas leak, danger.", "It is a gas leak, danger."),
                            PhraseItem("Do not light any flames.", "Do not light any flames."),
                            PhraseItem("Can you see the source of the fire?", "Can you see the source of the fire?"),
                            PhraseItem("Please keep a safe distance.", "Please keep a safe distance."),
                            PhraseItem("Do not block the vehicles' access.", "Do not block the vehicles' access."),
                            PhraseItem("The area is not safe right now.", "The area is not safe right now."),
                            PhraseItem("Thank you for following orders.", "Thank you for following orders."),
                            PhraseItem("Everyone out, now.", "Everyone out, now.")
                        ),
                        tips = listOf(
                            "Priority: In fires, time is vital. Use direct imperatives: 'Please evacuate the building immediately'.",
                            "Bystanders: Keep a wide perimeter: 'Please stay outside the perimeter'. This is non-negotiable.",
                            "Vital info: Always ask 'Is there anyone inside?' to report immediately to the Fire Commander.",
                            "Access: Keep access routes clear. 'Do not block the vehicles' access' prevents critical delays.",
                            "Safe zone: Define clearly where evacuees should gather: 'Please go to the safe zone'."
                        )
                    ),
                    Lesson(
                        lessonId = 403,
                        lessonTitle = "Missing persons",
                        vocabulary = listOf(
                            VocabularyItem("Missing person", "Missing person"),
                            VocabularyItem("Search", "Search"),
                            VocabularyItem("Description", "Description"),
                            VocabularyItem("Clothing", "Clothing"),
                            VocabularyItem("Last seen", "Last seen"),
                            VocabularyItem("Photograph", "Photograph"),
                            VocabularyItem("Age", "Age"),
                            VocabularyItem("Height", "Height"),
                            VocabularyItem("Name", "Name"),
                            VocabularyItem("Location", "Location"),
                            VocabularyItem("Route", "Route"),
                            VocabularyItem("Witness", "Witness"),
                            VocabularyItem("Emergency", "Emergency"),
                            VocabularyItem("Danger", "Danger"),
                            VocabularyItem("Information", "Information"),
                            VocabularyItem("Contact", "Contact"),
                            VocabularyItem("Cooperation", "Cooperation"),
                            VocabularyItem("Medical condition", "Medical condition")
                        ),
                        phrases = listOf(
                            PhraseItem("Who is missing?", "Who is missing?"),
                            PhraseItem("When was the last time you saw him/her?", "When was the last time you saw him/her?"),
                            PhraseItem("Where was he/she last seen?", "Where was he/she last seen?"),
                            PhraseItem("Please describe the person to me.", "Please describe the person to me."),
                            PhraseItem("What clothes was he/she wearing?", "What clothes was he/she wearing?"),
                            PhraseItem("Do you have a recent photograph?", "Do you have a recent photograph?"),
                            PhraseItem("What is his/her age and height?", "What is his/her age and height?"),
                            PhraseItem("Does he/she have any distinctive features?", "Does he/she have any distinctive features?"),
                            PhraseItem("Do you know what route he/she usually took?", "Do you know what route he/she usually took?"),
                            PhraseItem("We are organizing a search.", "We are organizing a search."),
                            PhraseItem("Please provide us with a contact.", "Please provide us with a contact."),
                            PhraseItem("Does he/she have any serious medical condition?", "Does he/she have any serious medical condition?"),
                            PhraseItem("Is he/she taking any medication?", "Is he/she taking any medication?"),
                            PhraseItem("Any detail is important.", "Any detail is important."),
                            PhraseItem("Do not touch anything in the area.", "Do not touch anything in the area."),
                            PhraseItem("Please keep your mobile phone on.", "Please keep your mobile phone on."),
                            PhraseItem("We will inform you immediately.", "We will inform you immediately."),
                            PhraseItem("Thank you for your cooperation.", "Thank you for your cooperation.")
                        ),
                        tips = listOf(
                            "Reaction time: The first hours are critical. An accurate description ('What clothes was he/she wearing?') allows for quick checks.",
                            "Medical info: It is vital to ask: 'Does he/she have any serious medical condition?'.",
                            "Evidence: If foul play is suspected, the location is a crime scene. 'Do not touch anything in the area'.",
                            "Managing relatives: Be empathetic but focused on concrete data. Use 'Any detail is important'.",
                            "Communication: Ensure a direct contact: 'Please keep your mobile phone on'."
                        )
                    )
                )
            ),
            Module(
                moduleId = 5,
                moduleName = "Módulo V: Atención al Turista",
                lessons = listOf(
                    Lesson(
                        lessonId = 501,
                        lessonTitle = "Tourist information",
                        vocabulary = listOf(
                            VocabularyItem("Tourism", "Tourism"),
                            VocabularyItem("Tourist office", "Tourist office"),
                            VocabularyItem("City centre", "City centre"),
                            VocabularyItem("Beach", "Beach"),
                            VocabularyItem("Taxi", "Taxi"),
                            VocabularyItem("Bus", "Bus"),
                            VocabularyItem("Schedule", "Schedule"),
                            VocabularyItem("ATM", "ATM"),
                            VocabularyItem("Currency exchange", "Currency exchange"),
                            VocabularyItem("Hospital", "Hospital"),
                            VocabularyItem("Pharmacy", "Pharmacy"),
                            VocabularyItem("Restaurant", "Restaurant"),
                            VocabularyItem("Map", "Map"),
                            VocabularyItem("Direction", "Direction"),
                            VocabularyItem("Walk", "Walk"),
                            VocabularyItem("Near", "Near"),
                            VocabularyItem("Far", "Far"),
                            VocabularyItem("Information", "Information")
                        ),
                        phrases = listOf(
                            PhraseItem("How can I get to the city centre?", "How can I get to the city centre?"),
                            PhraseItem("The tourist office is on that street.", "The tourist office is on that street."),
                            PhraseItem("You can walk, it is very close.", "You can walk, it is very close."),
                            PhraseItem("There is an ATM on the corner.", "There is an ATM on the corner."),
                            PhraseItem("The bus schedule is here.", "The bus schedule is here."),
                            PhraseItem("You can take a taxi at the rank.", "You can take a taxi at the rank."),
                            PhraseItem("The pharmacy is open 24 hours.", "The pharmacy is open 24 hours."),
                            PhraseItem("I need a hospital nearby.", "I need a hospital nearby."),
                            PhraseItem("Where can I exchange currency?", "Where can I exchange currency?"),
                            PhraseItem("Follow this direction straight ahead.", "Follow this direction straight ahead."),
                            PhraseItem("It is a good place to eat.", "It is a good place to eat."),
                            PhraseItem("The beach is a ten-minute walk.", "The beach is a ten-minute walk."),
                            PhraseItem("I recommend you check the map.", "I recommend you check the map."),
                            PhraseItem("Do you need any more information?", "Do you need any more information?"),
                            PhraseItem("Here is a city map.", "Here is a city map."),
                            PhraseItem("Please be careful with your belongings.", "Please be careful with your belongings."),
                            PhraseItem("Enjoy your stay in Marbella.", "Enjoy your stay in Marbella."),
                            PhraseItem("We are here to help you.", "We are here to help you.")
                        ),
                        tips = listOf(
                            "Image: Be friendly and helpful ('Enjoy your stay'). You are a reference for the city.",
                            "Preventive security: Remind citizens: 'Please be careful with your belongings' in busy areas.",
                            "Directions: Use visual references: 'Go straight', 'Turn left', 'Next to the plaza'.",
                            "Resources: If you don't know an exact address, suggest: 'I am not sure, but the tourist office will help you'.",
                            "Basics: Know the locations of essential services like the Costa del Sol Hospital or emergency pharmacies."
                        )
                    ),
                    Lesson(
                        lessonId = 502,
                        lessonTitle = "Transport and traffic",
                        vocabulary = listOf(
                            VocabularyItem("Transport", "Transport"),
                            VocabularyItem("Parking", "Parking"),
                            VocabularyItem("No parking", "No parking"),
                            VocabularyItem("Tow truck", "Tow truck"),
                            VocabularyItem("Blue zone", "Blue zone"),
                            VocabularyItem("Fine", "Fine"),
                            VocabularyItem("Traffic", "Traffic"),
                            VocabularyItem("Pedestrian", "Pedestrian"),
                            VocabularyItem("Cycle lane", "Cycle lane"),
                            VocabularyItem("Seat belt", "Seat belt"),
                            VocabularyItem("Speed", "Speed"),
                            VocabularyItem("Documents", "Documents"),
                            VocabularyItem("Insurance", "Insurance"),
                            VocabularyItem("Taxi", "Taxi"),
                            VocabularyItem("Taxi rank", "Taxi rank"),
                            VocabularyItem("Transfer", "Transfer"),
                            VocabularyItem("Reservation", "Reservation"),
                            VocabularyItem("Driving licence", "Driving licence")
                        ),
                        phrases = listOf(
                            PhraseItem("Parking is prohibited here.", "Parking is prohibited here."),
                            PhraseItem("Your car has been towed away.", "Your car has been towed away."),
                            PhraseItem("You must pay the fine at the office.", "You must pay the fine at the office."),
                            PhraseItem("This is a pedestrian zone.", "This is a pedestrian zone."),
                            PhraseItem("Please move your vehicle.", "Please move your vehicle."),
                            PhraseItem("Do you have your driving licence?", "Do you have your driving licence?"),
                            PhraseItem("The blue zone requires a ticket.", "The blue zone requires a ticket."),
                            PhraseItem("Do not block garage exits.", "Do not block garage exits."),
                            PhraseItem("Traffic is closed due to roadworks.", "Traffic is closed due to roadworks."),
                            PhraseItem("You can park in this public car park.", "You can park in this public car park."),
                            PhraseItem("Taxis have a rank here.", "Taxis have a rank here."),
                            PhraseItem("I need to see your documentation.", "I need to see your documentation."),
                            PhraseItem("Seat belt use is mandatory.", "Seat belt use is mandatory."),
                            PhraseItem("You are driving the wrong way.", "You are driving the wrong way."),
                            PhraseItem("Please slow down.", "Please slow down."),
                            PhraseItem("Do not use your mobile phone while driving.", "Do not use your mobile phone while driving."),
                            PhraseItem("Thank you for your compliance.", "Thank you for your compliance."),
                            PhraseItem("Have a safe trip.", "Have a safe trip.")
                        ),
                        tips = listOf(
                            "Administrative: Be calm and clear about fines: 'You must pay the fine at the office'. Avoid debating the rule.",
                            "Prevention: Educate on blue zones: 'The blue zone requires a ticket'.",
                            "Safety: Enforce rules that risk others (pedestrian zones). 'This is a pedestrian zone' is final.",
                            "Clarity: Use short phrases. 'Parking is prohibited here' is sufficient.",
                            "Towing: If the car was towed, give the exact address where they can collect it."
                        )
                    ),
                    Lesson(
                        lessonId = 503,
                        lessonTitle = "Mediation in minor conflicts",
                        vocabulary = listOf(
                            VocabularyItem("Conflict", "Conflict"),
                            VocabularyItem("Mediation", "Mediation"),
                            VocabularyItem("Dispute", "Dispute"),
                            VocabularyItem("Fare", "Fare"),
                            VocabularyItem("Bill", "Bill"),
                            VocabularyItem("Service", "Service"),
                            VocabularyItem("Misunderstanding", "Misunderstanding"),
                            VocabularyItem("Noise", "Noise"),
                            VocabularyItem("Complaint", "Complaint"),
                            VocabularyItem("Agreement", "Agreement"),
                            VocabularyItem("Courtesy", "Courtesy"),
                            VocabularyItem("Respect", "Respect"),
                            VocabularyItem("Solution", "Solution"),
                            VocabularyItem("Shopkeeper", "Shopkeeper"),
                            VocabularyItem("Customer", "Customer"),
                            VocabularyItem("Prices", "Prices"),
                            VocabularyItem("Refund", "Refund"),
                            VocabularyItem("Calm", "Calm")
                        ),
                        phrases = listOf(
                            PhraseItem("Please calm down, both of you.", "Please calm down, both of you."),
                            PhraseItem("What is the problem?", "What is the problem?"),
                            PhraseItem("Let's reach an agreement.", "Let's reach an agreement."),
                            PhraseItem("It is a misunderstanding.", "It is a misunderstanding."),
                            PhraseItem("The fare is the official one.", "The fare is the official one."),
                            PhraseItem("Did you ask for the bill?", "Did you ask for the bill?"),
                            PhraseItem("The shopkeeper has their rules.", "The shopkeeper has their rules."),
                            PhraseItem("Please show respect.", "Please show respect."),
                            PhraseItem("Do not shout, please.", "Do not shout, please."),
                            PhraseItem("Can we find a solution?", "Can we find a solution?"),
                            PhraseItem("This is a civil matter.", "This is a civil matter."),
                            PhraseItem("I cannot force a refund.", "I cannot force a refund."),
                            PhraseItem("Contact the consumer office.", "Contact the consumer office."),
                            PhraseItem("The noise is disturbing the neighbours.", "The noise is disturbing the neighbours."),
                            PhraseItem("Please lower the volume.", "Please lower the volume."),
                            PhraseItem("Thank you for your cooperation.", "Thank you for your cooperation."),
                            PhraseItem("I hope it gets solved.", "I hope it gets solved."),
                            PhraseItem("Good afternoon and keep calm.", "Good afternoon and keep calm.")
                        ),
                        tips = listOf(
                            "Neutrality: Never take sides. Your role is mediation: 'Let's reach an agreement'.",
                            "Civil matters: If it's a civil issue (e.g., refunds), clarify: 'I cannot force a refund'. Direct them to the consumer office.",
                            "Environment: Shouting increases tension. 'Do not shout, please' is essential for order.",
                            "De-escalation: For noise complaints, appeal to community: 'The noise is disturbing the neighbours'.",
                            "Closing: Always finish with a positive wish: 'I hope it gets solved'."
                        )
                    )
                )
            )
        )
    }

    fun saveDatabase(context: Context, modules: List<Module>) {
        val jsonString = serializeModules(modules)
        try {
            getDatabaseFile(context).writeText(jsonString)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun parseJson(jsonString: String): List<Module> {
        val modules = mutableListOf<Module>()
        try {
            val jsonArray = JSONArray(jsonString)
            for (i in 0 until jsonArray.length()) {
                val moduleObj = jsonArray.getJSONObject(i)
                val moduleId = if (moduleObj.has("moduleId")) {
                    moduleObj.getInt("moduleId")
                } else {
                    moduleObj.optInt("id", i + 1)
                }
                val moduleName = if (moduleObj.has("moduleName")) {
                    moduleObj.getString("moduleName")
                } else {
                    moduleObj.optString("title", "Módulo $moduleId")
                }
                val lessonsArray = moduleObj.optJSONArray("lessons") ?: JSONArray()
                val lessons = mutableListOf<Lesson>()

                for (j in 0 until lessonsArray.length()) {
                    val lessonObj = lessonsArray.getJSONObject(j)
                    val lessonId = if (lessonObj.has("lessonId")) {
                        lessonObj.getInt("lessonId")
                    } else {
                        lessonObj.optInt("id", (moduleId * 100) + j + 1)
                    }
                    val lessonTitle = if (lessonObj.has("lessonTitle")) {
                        lessonObj.getString("lessonTitle")
                    } else {
                        lessonObj.optString("title", "Lección")
                    }
                    
                    // Parse Vocabulary
                    val vocabularyArray = lessonObj.optJSONArray("vocabulary") ?: JSONArray()
                    val vocabulary = mutableListOf<VocabularyItem>()
                    for (k in 0 until vocabularyArray.length()) {
                        val itemObj = vocabularyArray.getJSONObject(k)
                        val es = itemObj.optString("es", "")
                        val en = itemObj.optString("en", "")
                        vocabulary.add(VocabularyItem(es = es, en = en))
                    }

                    // Parse Phrases
                    val phrasesArray = lessonObj.optJSONArray("phrases") ?: JSONArray()
                    val phrases = mutableListOf<PhraseItem>()
                    for (k in 0 until phrasesArray.length()) {
                        val phraseObj = phrasesArray.getJSONObject(k)
                        val es = phraseObj.optString("es", "")
                        val en = phraseObj.optString("en", "")
                        phrases.add(PhraseItem(es = es, en = en))
                    }

                    // Parse Tips
                    val tipsArray = lessonObj.optJSONArray("tips") ?: JSONArray()
                    val tips = mutableListOf<String>()
                    for (k in 0 until tipsArray.length()) {
                        tips.add(tipsArray.optString(k, ""))
                    }

                    lessons.add(
                        Lesson(
                            lessonId = lessonId,
                            lessonTitle = lessonTitle,
                            vocabulary = vocabulary,
                            phrases = phrases,
                            tips = tips
                        )
                    )
                }
                modules.add(Module(moduleId = moduleId, moduleName = moduleName, lessons = lessons))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return modules
    }

    fun serializeModules(modules: List<Module>): String {
        val jsonArray = JSONArray()
        for (module in modules) {
            val moduleObj = JSONObject()
            moduleObj.put("moduleId", module.moduleId)
            moduleObj.put("moduleName", module.moduleName)

            val lessonsArray = JSONArray()
            for (lesson in module.lessons) {
                val lessonObj = JSONObject()
                lessonObj.put("lessonId", lesson.lessonId)
                lessonObj.put("lessonTitle", lesson.lessonTitle)

                // Serialize Vocabulary
                val vocabularyArray = JSONArray()
                for (vocab in lesson.vocabulary) {
                    val itemObj = JSONObject()
                    itemObj.put("es", vocab.es)
                    itemObj.put("en", vocab.en)
                    vocabularyArray.put(itemObj)
                }
                lessonObj.put("vocabulary", vocabularyArray)

                // Serialize Phrases
                val phrasesArray = JSONArray()
                for (phrase in lesson.phrases) {
                    val phraseObj = JSONObject()
                    phraseObj.put("es", phrase.es)
                    phraseObj.put("en", phrase.en)
                    phrasesArray.put(phraseObj)
                }
                lessonObj.put("phrases", phrasesArray)

                // Serialize Tips
                val tipsArray = JSONArray()
                for (tip in lesson.tips) {
                    tipsArray.put(tip)
                }
                lessonObj.put("tips", tipsArray)

                lessonsArray.put(lessonObj)
            }
            moduleObj.put("lessons", lessonsArray)
            jsonArray.put(moduleObj)
        }
        return jsonArray.toString(2)
    }
}
