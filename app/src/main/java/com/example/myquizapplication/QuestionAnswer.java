package com.example.myquizapplication;

public class QuestionAnswer {
    public  static  String questions[] ={
            "Comment arrêter les services dans Android ?",
            "Lequel des éléments suivants convertit le byte code Java en byte code Dalvik ?",
            "ADB signifie _____ ______ ______",
            "Sur lequel des éléments suivants les développeurs peuvent-ils tester l’application, pendant le développement des applications android ?",
            "Lequel des noyaux suivants est utilisé dans Android ?",
            "Laquelle des méthodes suivantes est la première méthode callback invoquée par le système au cours du cycle de vie d’une activité ?",
            "Lequel des éléments suivants n’est pas une méthode callback du cycle de vie d’une activité ?",
            "Nous avons besoin d’un AVD pour créer un émulateur. Que signifie AVD ?",
            "Android supporte-t-il d’autres langages que Java ?",
            "Quelle est l’utilité du fournisseur de contenu(ContentProvider) dans Android?"

    };
    public  static String choices [][]={
            {"En utilisant la méthode stopSelf() et stopService()","En utilisant la méthode finish()","En utilisant la méthode system.exit()","Aucune de ces méthodes"},
            {"Compilateur Dex","Le convertisseur Dalvik","Android Studio","Compilateur MIC" },
            {" Android Debug Bridge"," Android Delete Bridge","Android Destroy Bridge","Aucune de ces réponses"},
            {"Les émulateurs tiers","Emulateur inclus dans Android SDK","Téléphone androïde physique","Toutes les réponses sont vraies"},
            {"MAC","Windows","Linux"," Redhat"},
            {"Méthode onRestart()","Méthode onStart()","Méthode onCreate()","Méthode onClick()"},
            {"Méthode onClick()","Méthode onCreate()","Méthode onStart()","Méthode onBackPressed()" },
            {"Android Virtual Display","Android Virtual Device","Active Virtual Device","Active Virtual Display"},
            {"Oui","Non","Peut être","je ne sais pas!"},
            {"Pour stocker les données dans la base de données","Pour partager les données entre les applications","Pour envoyer les données d’une application à une autre application","Aucune de ces réponses"}


    };
    public  static  String correctAnswers[] ={
            "En utilisant la méthode stopSelf() et stopService()",
            "Compilateur Dex",
            "Android Debug Bridge",
            "Toutes les réponses sont vraies",
            "Linux",
            "Méthode onCreate()",
            "Méthode onBackPressed()",
            "Android Virtual Device",
            "Oui",
            "Pour stocker les données dans la base de données"


    };


}

