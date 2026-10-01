package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 3 : 500 questions bilingues */
object QuestionsBilingualGenerated_3 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 4141, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur de 'Harry Potter' ?", listOf("J.K. Rowling", "Philip Pullman", "Roald Dahl", "Terry Pratchett"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'Harry Potter'?", listOf("J.K. Rowling", "Philip Pullman", "Roald Dahl", "Terry Pratchett"), "Culture", ""),
            zh = LocalizedContent("《哈利·波特》的作者是谁？", listOf("J.K.罗琳", "菲利普·普尔曼", "罗尔德·达尔", "特里·普拉切特"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'Harry Potter'?", listOf("J.K. Rowling", "Philip Pullman", "Roald Dahl", "Terry Pratchett"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4142, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur colombien a écrit 'Cent ans de solitude' ?", listOf("Gabriel García Márquez", "Jorge Amado", "Pablo Neruda", "Mario Vargas Llosa"), "Culture", ""),
            en = LocalizedContent("Which Colombian author wrote 'One Hundred Years of Solitude'?", listOf("Gabriel García Márquez", "Jorge Amado", "Pablo Neruda", "Mario Vargas Llosa"), "Culture", ""),
            zh = LocalizedContent("哪位哥伦比亚作家写了《百年孤独》？", listOf("加夫列尔·加西亚·马尔克斯", "若热·亚马多", "巴勃罗·聂鲁达", "马里奥·巴尔加斯·略萨"), "文化", ""),
            es = LocalizedContent("¿Qué autor colombiano escribió 'Cien años de soledad'?", listOf("Gabriel García Márquez", "Jorge Amado", "Pablo Neruda", "Mario Vargas Llosa"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4143, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Les Raisins de la colère' ?", listOf("John Steinbeck", "Ernest Hemingway", "William Faulkner", "Theodore Dreiser"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Grapes of Wrath'?", listOf("John Steinbeck", "Ernest Hemingway", "William Faulkner", "Theodore Dreiser"), "Culture", ""),
            zh = LocalizedContent("《愤怒的葡萄》是谁写的？", listOf("约翰·斯坦贝克", "欧内斯特·海明威", "威廉·福克纳", "西奥多·德莱塞"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Las uvas de la ira'?", listOf("John Steinbeck", "Ernest Hemingway", "William Faulkner", "Theodore Dreiser"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4144, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'Le Rouge et le Noir' ?", listOf("Stendhal", "Honoré de Balzac", "Victor Hugo", "Gustave Flaubert"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'The Red and the Black'?", listOf("Stendhal", "Honoré de Balzac", "Victor Hugo", "Gustave Flaubert"), "Culture", ""),
            zh = LocalizedContent("《红与黑》是哪位作家写的？", listOf("司汤达", "奥诺雷·德·巴尔扎克", "维克多·雨果", "古斯塔夫·福楼拜"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Rojo y negro'?", listOf("Stendhal", "Honoré de Balzac", "Victor Hugo", "Gustave Flaubert"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4145, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Dracula' ?", listOf("Bram Stoker", "Mary Shelley", "Edgar Allan Poe", "H.P. Lovecraft"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Dracula'?", listOf("Bram Stoker", "Mary Shelley", "Edgar Allan Poe", "H.P. Lovecraft"), "Culture", ""),
            zh = LocalizedContent("《德古拉》是谁写的？", listOf("布拉姆·斯托克", "玛丽·雪莱", "埃德加·爱伦·坡", "H.P.洛夫克拉夫特"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Drácula'?", listOf("Bram Stoker", "Mary Shelley", "Edgar Allan Poe", "H.P. Lovecraft"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4146, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel auteur français a reçu le Prix Nobel de littérature en 2014 ?", listOf("Patrick Modiano", "J.M.G. Le Clézio", "Michel Houellebecq", "Pascal Quignard"), "Culture", ""),
            en = LocalizedContent("Which French author received the Nobel Prize in Literature in 2014?", listOf("Patrick Modiano", "J.M.G. Le Clézio", "Michel Houellebecq", "Pascal Quignard"), "Culture", ""),
            zh = LocalizedContent("哪位法国作家在2014年获得了诺贝尔文学奖？", listOf("帕特里克·莫迪亚诺", "J.M.G.勒克莱齐奥", "米歇尔·维勒贝克", "帕斯卡·基尼亚尔"), "文化", ""),
            es = LocalizedContent("¿Qué autor francés recibió el Premio Nobel de Literatura en 2014?", listOf("Patrick Modiano", "J.M.G. Le Clézio", "Michel Houellebecq", "Pascal Quignard"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4147, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Le Père Goriot' ?", listOf("Honoré de Balzac", "Victor Hugo", "Gustave Flaubert", "Stendhal"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Le Père Goriot'?", listOf("Honoré de Balzac", "Victor Hugo", "Gustave Flaubert", "Stendhal"), "Culture", ""),
            zh = LocalizedContent("《高老头》是谁写的？", listOf("奥诺雷·德·巴尔扎克", "维克多·雨果", "古斯塔夫·福楼拜", "司汤达"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Papá Goriot'?", listOf("Honoré de Balzac", "Victor Hugo", "Gustave Flaubert", "Stendhal"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4148, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'Moby Dick' ?", listOf("Herman Melville", "Mark Twain", "Nathaniel Hawthorne", "James Fenimore Cooper"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Moby Dick'?", listOf("Herman Melville", "Mark Twain", "Nathaniel Hawthorne", "James Fenimore Cooper"), "Culture", ""),
            zh = LocalizedContent("《白鲸》是哪位作家写的？", listOf("赫尔曼·梅尔维尔", "马克·吐温", "纳撒尼尔·霍桑", "詹姆斯·费尼莫尔·库珀"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Moby Dick'?", listOf("Herman Melville", "Mark Twain", "Nathaniel Hawthorne", "James Fenimore Cooper"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4149, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de 'L'Éducation sentimentale' ?", listOf("Gustave Flaubert", "Émile Zola", "Stendhal", "Victor Hugo"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'Sentimental Education'?", listOf("Gustave Flaubert", "Émile Zola", "Stendhal", "Victor Hugo"), "Culture", ""),
            zh = LocalizedContent("《情感教育》的作者是谁？", listOf("古斯塔夫·福楼拜", "埃米尔·左拉", "司汤达", "维克多·雨果"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'La educación sentimental'?", listOf("Gustave Flaubert", "Émile Zola", "Stendhal", "Victor Hugo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4150, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'La Divine Comédie' ?", listOf("Dante Alighieri", "Francesco Petrarca", "Giovanni Boccaccio", "Virgile"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'The Divine Comedy'?", listOf("Dante Alighieri", "Francesco Petrarca", "Giovanni Boccaccio", "Virgil"), "Culture", ""),
            zh = LocalizedContent("《神曲》是哪位作家写的？", listOf("但丁·阿利吉耶里", "弗朗切斯科·彼特拉克", "乔万尼·薄伽丘", "维吉尔"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'La Divina Comedia'?", listOf("Dante Alighieri", "Francesco Petrarca", "Giovanni Boccaccio", "Virgilio"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4151, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Frankenstein' ?", listOf("Mary Shelley", "Bram Stoker", "Edgar Allan Poe", "H.G. Wells"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Frankenstein'?", listOf("Mary Shelley", "Bram Stoker", "Edgar Allan Poe", "H.G. Wells"), "Culture", ""),
            zh = LocalizedContent("谁写了《弗兰肯斯坦》？", listOf("玛丽·雪莱", "布拉姆·斯托克", "埃德加·爱伦·坡", "H.G.威尔斯"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Frankenstein'?", listOf("Mary Shelley", "Bram Stoker", "Edgar Allan Poe", "H.G. Wells"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4152, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel auteur est connu pour la série 'La Roue du Temps' ?", listOf("Robert Jordan", "Brandon Sanderson", "Terry Goodkind", "David Eddings"), "Culture", ""),
            en = LocalizedContent("Which author is known for the 'Wheel of Time' series?", listOf("Robert Jordan", "Brandon Sanderson", "Terry Goodkind", "David Eddings"), "Culture", ""),
            zh = LocalizedContent("哪位作者以《时光之轮》系列闻名？", listOf("罗伯特·乔丹", "布兰登·桑德森", "特里·古德金", "大卫·艾丁斯"), "文化", ""),
            es = LocalizedContent("¿Qué autor es conocido por la serie 'La Rueda del Tiempo'?", listOf("Robert Jordan", "Brandon Sanderson", "Terry Goodkind", "David Eddings"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4153, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'L'Attrape-cœurs' ?", listOf("J.D. Salinger", "Jack Kerouac", "Allen Ginsberg", "William Burroughs"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Catcher in the Rye'?", listOf("J.D. Salinger", "Jack Kerouac", "Allen Ginsberg", "William Burroughs"), "Culture", ""),
            zh = LocalizedContent("谁写了《麦田里的守望者》？", listOf("J.D.塞林格", "杰克·凯鲁亚克", "艾伦·金斯堡", "威廉·巴勒斯"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'El guardián entre el centeno'?", listOf("J.D. Salinger", "Jack Kerouac", "Allen Ginsberg", "William Burroughs"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4154, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'Les Voyages de Gulliver' ?", listOf("Jonathan Swift", "Daniel Defoe", "Henry Fielding", "Samuel Richardson"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Gulliver's Travels'?", listOf("Jonathan Swift", "Daniel Defoe", "Henry Fielding", "Samuel Richardson"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《格列佛游记》？", listOf("乔纳森·斯威夫特", "丹尼尔·笛福", "亨利·菲尔丁", "塞缪尔·理查森"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Los viajes de Gulliver'?", listOf("Jonathan Swift", "Daniel Defoe", "Henry Fielding", "Samuel Richardson"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4155, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que HTML ?", listOf("Langage de balisage pour créer des pages web", "Langage de programmation", "Base de données web", "Protocole réseau"), "Tech", ""),
            en = LocalizedContent("What is HTML?", listOf("Markup language for creating web pages", "Programming language", "Web database", "Network protocol"), "Technology", ""),
            zh = LocalizedContent("什么是HTML？", listOf("用于创建网页的标记语言", "编程语言", "网络数据库", "网络协议"), "科技", ""),
            es = LocalizedContent("¿Qué es HTML?", listOf("Lenguaje de marcado para crear páginas web", "Lenguaje de programación", "Base de datos web", "Protocolo de red"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4156, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que JavaScript ?", listOf("Langage de programmation dynamique pour le web", "Langage Java simplifié", "Script Java côté serveur", "Langage de base de données"), "Tech", ""),
            en = LocalizedContent("What is JavaScript?", listOf("Dynamic programming language for the web", "Simplified Java language", "Server-side Java script", "Database language"), "Technology", ""),
            zh = LocalizedContent("什么是JavaScript？", listOf("用于网络的动态编程语言", "简化的Java语言", "服务器端Java脚本", "数据库语言"), "科技", ""),
            es = LocalizedContent("¿Qué es JavaScript?", listOf("Lenguaje de programación dinámico para la web", "Lenguaje Java simplificado", "Script Java del lado del servidor", "Lenguaje de base de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4157, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un framework ?", listOf("Cadre de travail pour développer des applications plus efficacement", "Langage de programmation", "Base de données", "Serveur web"), "Tech", ""),
            en = LocalizedContent("What is a framework?", listOf("Work framework for developing applications more efficiently", "Programming language", "Database", "Web server"), "Technology", ""),
            zh = LocalizedContent("什么是框架？", listOf("用于更高效开发应用程序的工作框架", "编程语言", "数据库", "网络服务器"), "科技", ""),
            es = LocalizedContent("¿Qué es un framework?", listOf("Marco de trabajo para desarrollar aplicaciones de manera más eficiente", "Lenguaje de programación", "Base de datos", "Servidor web"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4158, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que React ?", listOf("Bibliothèque JavaScript pour interfaces utilisateur", "Framework backend", "Langage de programmation", "Base de données NoSQL"), "Tech", ""),
            en = LocalizedContent("What is React?", listOf("JavaScript library for user interfaces", "Backend framework", "Programming language", "NoSQL database"), "Technology", ""),
            zh = LocalizedContent("什么是React？", listOf("用于用户界面的JavaScript库", "后端框架", "编程语言", "NoSQL数据库"), "科技", ""),
            es = LocalizedContent("¿Qué es React?", listOf("Biblioteca de JavaScript para interfaces de usuario", "Framework backend", "Lenguaje de programación", "Base de datos NoSQL"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4159, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que Node.js ?", listOf("Environnement d'exécution JavaScript côté serveur", "Framework frontend", "Serveur web Apache", "Base de données JavaScript"), "Tech", ""),
            en = LocalizedContent("What is Node.js?", listOf("Server-side JavaScript runtime environment", "Frontend framework", "Apache web server", "JavaScript database"), "Technology", ""),
            zh = LocalizedContent("什么是Node.js？", listOf("服务器端JavaScript运行环境", "前端框架", "Apache网络服务器", "JavaScript数据库"), "科技", ""),
            es = LocalizedContent("¿Qué es Node.js?", listOf("Entorno de ejecución de JavaScript del lado del servidor", "Framework frontend", "Servidor web Apache", "Base de datos JavaScript"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4160, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que Git ?", listOf("Système de contrôle de version distribué", "Langage de programmation", "Serveur de déploiement", "Base de données"), "Tech", ""),
            en = LocalizedContent("What is Git?", listOf("Distributed version control system", "Programming language", "Deployment server", "Database"), "Technology", ""),
            zh = LocalizedContent("什么是Git？", listOf("分布式版本控制系统", "编程语言", "部署服务器", "数据库"), "科技", ""),
            es = LocalizedContent("¿Qué es Git?", listOf("Sistema de control de versiones distribuido", "Lenguaje de programación", "Servidor de despliegue", "Base de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4161, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que GitHub ?", listOf("Plateforme d'hébergement de code avec Git", "Alternative à Git", "Serveur cloud d'Amazon", "IDE de programmation"), "Tech", ""),
            en = LocalizedContent("What is GitHub?", listOf("Code hosting platform with Git", "Alternative to Git", "Amazon cloud server", "Programming IDE"), "Technology", ""),
            zh = LocalizedContent("什么是 GitHub？", listOf("基于 Git 的代码托管平台", "Git 的替代品", "亚马逊云服务器", "编程集成开发环境"), "科技", ""),
            es = LocalizedContent("¿Qué es GitHub?", listOf("Plataforma de alojamiento de código con Git", "Alternativa a Git", "Servidor en la nube de Amazon", "IDE de programación"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4162, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que Python Django ?", listOf("Framework web Python haut niveau", "Langage de programmation dérivé de Python", "Base de données Python", "Bibliothèque de visualisation"), "Tech", ""),
            en = LocalizedContent("What is Python Django?", listOf("High-level Python web framework", "Programming language derived from Python", "Python database", "Visualization library"), "Technology", ""),
            zh = LocalizedContent("什么是 Python Django？", listOf("高级 Python Web 框架", "从 Python 派生的编程语言", "Python 数据库", "可视化库"), "科技", ""),
            es = LocalizedContent("¿Qué es Python Django?", listOf("Framework web de alto nivel para Python", "Lenguaje de programación derivado de Python", "Base de datos de Python", "Biblioteca de visualización"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4163, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que REST API ?", listOf("Interface utilisant protocoles HTTP pour communication client-serveur", "Base de données relationnelle", "Framework JavaScript", "Protocole de sécurité"), "Tech", ""),
            en = LocalizedContent("What is REST API?", listOf("Interface using HTTP protocols for client-server communication", "Relational database", "JavaScript framework", "Security protocol"), "Technology", ""),
            zh = LocalizedContent("什么是 REST API？", listOf("使用 HTTP 协议进行客户端-服务器通信的接口", "关系型数据库", "JavaScript 框架", "安全协议"), "科技", ""),
            es = LocalizedContent("¿Qué es REST API?", listOf("Interfaz que utiliza protocolos HTTP para comunicación cliente-servidor", "Base de datos relacional", "Framework de JavaScript", "Protocolo de seguridad"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4164, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle de npm ?", listOf("Gestionnaire de paquets pour Node.js", "Navigateur pour Node.js", "Protocole réseau Microsoft", "Base de données NoSQL"), "Tech", ""),
            en = LocalizedContent("What is the role of npm?", listOf("Package manager for Node.js", "Browser for Node.js", "Microsoft network protocol", "NoSQL database"), "Technology", ""),
            zh = LocalizedContent("npm 的作用是什么？", listOf("Node.js 的包管理器", "Node.js 的浏览器", "微软网络协议", "NoSQL 数据库"), "科技", ""),
            es = LocalizedContent("¿Cuál es el rol de npm?", listOf("Gestor de paquetes para Node.js", "Navegador para Node.js", "Protocolo de red de Microsoft", "Base de datos NoSQL"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4165, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que TypeScript ?", listOf("Surcouche typée de JavaScript", "Nouveau langage indépendant", "Framework JavaScript", "Bibliothèque d'animation"), "Tech", ""),
            en = LocalizedContent("What is TypeScript?", listOf("Typed superset of JavaScript", "New independent language", "JavaScript framework", "Animation library"), "Technology", ""),
            zh = LocalizedContent("什么是 TypeScript？", listOf("JavaScript 的类型化超集", "新的独立语言", "JavaScript 框架", "动画库"), "科技", ""),
            es = LocalizedContent("¿Qué es TypeScript?", listOf("Superconjunto tipado de JavaScript", "Nuevo lenguaje independiente", "Framework de JavaScript", "Biblioteca de animación"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4166, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que MongoDB ?", listOf("Base de données NoSQL orientée documents", "Base de données relationnelle", "Framework web", "Serveur de cache"), "Tech", ""),
            en = LocalizedContent("What is MongoDB?", listOf("Document-oriented NoSQL database", "Relational database", "Web framework", "Cache server"), "Technology", ""),
            zh = LocalizedContent("什么是 MongoDB？", listOf("面向文档的 NoSQL 数据库", "关系型数据库", "Web 框架", "缓存服务器"), "科技", ""),
            es = LocalizedContent("¿Qué es MongoDB?", listOf("Base de datos NoSQL orientada a documentos", "Base de datos relacional", "Framework web", "Servidor de caché"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4167, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que Kotlin ?", listOf("Langage de programmation moderne pour JVM et Android", "Langage de script Java", "Framework Java", "Langage de requête"), "Tech", ""),
            en = LocalizedContent("What is Kotlin?", listOf("Modern programming language for JVM and Android", "Java scripting language", "Java framework", "Query language"), "Technology", ""),
            zh = LocalizedContent("什么是 Kotlin？", listOf("用于 JVM 和 Android 的现代编程语言", "Java 脚本语言", "Java 框架", "查询语言"), "科技", ""),
            es = LocalizedContent("¿Qué es Kotlin?", listOf("Lenguaje de programación moderno para JVM y Android", "Lenguaje de scripting de Java", "Framework de Java", "Lenguaje de consulta"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4168, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que Swift ?", listOf("Langage de programmation Apple pour iOS/macOS", "Framework Android", "Langage de script web", "Protocole réseau rapide"), "Tech", ""),
            en = LocalizedContent("What is Swift?", listOf("Apple programming language for iOS/macOS", "Android framework", "Web scripting language", "Fast network protocol"), "Technology", ""),
            zh = LocalizedContent("什么是 Swift？", listOf("苹果用于 iOS/macOS 的编程语言", "Android 框架", "Web 脚本语言", "快速网络协议"), "科技", ""),
            es = LocalizedContent("¿Qué es Swift?", listOf("Lenguaje de programación de Apple para iOS/macOS", "Framework de Android", "Lenguaje de scripting web", "Protocolo de red rápido"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4169, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que GraphQL ?", listOf("Langage de requête pour APIs plus flexible que REST", "Base de données graphique", "Moteur de requête SQL", "Framework pour graphiques"), "Tech", ""),
            en = LocalizedContent("What is GraphQL?", listOf("Query language for APIs more flexible than REST", "Graph database", "SQL query engine", "Framework for graphs"), "Technology", ""),
            zh = LocalizedContent("什么是 GraphQL？", listOf("比 REST 更灵活的 API 查询语言", "图形数据库", "SQL 查询引擎", "图形框架"), "科技", ""),
            es = LocalizedContent("¿Qué es GraphQL?", listOf("Lenguaje de consulta para APIs más flexible que REST", "Base de datos de grafos", "Motor de consultas SQL", "Framework para gráficos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 4170, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a dit 'Je pense donc je suis' (Cogito ergo sum) ?", listOf("René Descartes", "Platon", "Aristote", "Immanuel Kant"), "Philosophie", ""),
            en = LocalizedContent("Who said 'I think, therefore I am' (Cogito ergo sum)?", listOf("René Descartes", "Plato", "Aristotle", "Immanuel Kant"), "Philosophy", ""),
            zh = LocalizedContent("谁说过‘我思故我在’（Cogito ergo sum）？", listOf("勒内·笛卡尔", "柏拉图", "亚里士多德", "伊曼努尔·康德"), "哲学", ""),
            es = LocalizedContent("¿Quién dijo 'Pienso, luego existo' (Cogito ergo sum)?", listOf("René Descartes", "Platón", "Aristóteles", "Immanuel Kant"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4171, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe est à l'origine de l'allégorie de la caverne ?", listOf("Platon", "Aristote", "Socrate", "Épicure"), "Philosophie", ""),
            en = LocalizedContent("Which philosopher is the origin of the allegory of the cave?", listOf("Plato", "Aristotle", "Socrates", "Epicurus"), "Philosophy", ""),
            zh = LocalizedContent("哪位哲学家提出了洞穴寓言？", listOf("柏拉图", "亚里士多德", "苏格拉底", "伊壁鸠鲁"), "哲学", ""),
            es = LocalizedContent("¿Qué filósofo es el origen de la alegoría de la caverna?", listOf("Platón", "Aristóteles", "Sócrates", "Epicuro"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4172, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'empirisme ?", listOf("Philosophie selon laquelle la connaissance vient de l'expérience", "Philosophie rationnaliste", "Philosophie idéaliste", "Doctrine morale"), "Philosophie", ""),
            en = LocalizedContent("What is empiricism?", listOf("Philosophy according to which knowledge comes from experience", "Rationalist philosophy", "Idealist philosophy", "Moral doctrine"), "Philosophy", ""),
            zh = LocalizedContent("什么是经验主义？", listOf("认为知识来源于经验的哲学", "理性主义哲学", "唯心主义哲学", "道德学说"), "哲学", ""),
            es = LocalizedContent("¿Qué es el empirismo?", listOf("Filosofía según la cual el conocimiento proviene de la experiencia", "Filosofía racionalista", "Filosofía idealista", "Doctrina moral"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4173, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'La Critique de la raison pure' ?", listOf("Immanuel Kant", "Friedrich Hegel", "Arthur Schopenhauer", "David Hume"), "Philosophie", ""),
            en = LocalizedContent("Who wrote 'Critique of Pure Reason'?", listOf("Immanuel Kant", "Friedrich Hegel", "Arthur Schopenhauer", "David Hume"), "Philosophy", ""),
            zh = LocalizedContent("谁写了《纯粹理性批判》？", listOf("伊曼努尔·康德", "弗里德里希·黑格尔", "亚瑟·叔本华", "大卫·休谟"), "哲学", ""),
            es = LocalizedContent("¿Quién escribió 'Crítica de la razón pura'?", listOf("Immanuel Kant", "Friedrich Hegel", "Arthur Schopenhauer", "David Hume"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4174, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de l'utilitarisme ?", listOf("Maximiser le bonheur du plus grand nombre", "Respecter la loi morale universelle", "Accomplir son devoir", "Poursuivre la vertu"), "Philosophie", ""),
            en = LocalizedContent("What is the principle of utilitarianism?", listOf("Maximize the happiness of the greatest number", "Respect the universal moral law", "Fulfill one's duty", "Pursue virtue"), "Philosophy", ""),
            zh = LocalizedContent("功利主义的原则是什么？", listOf("最大化最大多数人的幸福", "遵守普遍的道德法则", "履行自己的义务", "追求美德"), "哲学", ""),
            es = LocalizedContent("¿Cuál es el principio del utilitarismo?", listOf("Maximizar la felicidad del mayor número", "Respetar la ley moral universal", "Cumplir con el deber", "Perseguir la virtud"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4175, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le fondateur de la philosophie analytique moderne ?", listOf("Bertrand Russell et Gottlob Frege", "Ludwig Wittgenstein", "Karl Popper", "Willard Quine"), "Philosophie", ""),
            en = LocalizedContent("Who is the founder of modern analytic philosophy?", listOf("Bertrand Russell and Gottlob Frege", "Ludwig Wittgenstein", "Karl Popper", "Willard Quine"), "Philosophy", ""),
            zh = LocalizedContent("谁是现代分析哲学的奠基人？", listOf("伯特兰·罗素和戈特洛布·弗雷格", "路德维希·维特根斯坦", "卡尔·波普尔", "威拉德·奎因"), "哲学", ""),
            es = LocalizedContent("¿Quién es el fundador de la filosofía analítica moderna?", listOf("Bertrand Russell y Gottlob Frege", "Ludwig Wittgenstein", "Karl Popper", "Willard Quine"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4176, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le relativisme moral ?", listOf("La morale dépend du contexte culturel", "La morale est universelle", "La morale est innée", "La morale se définit par la loi"), "Philosophie", ""),
            en = LocalizedContent("What is moral relativism?", listOf("Morality depends on cultural context", "Morality is universal", "Morality is innate", "Morality is defined by law"), "Philosophy", ""),
            zh = LocalizedContent("什么是道德相对主义？", listOf("道德取决于文化背景", "道德是普遍的", "道德是天生的", "道德由法律定义"), "哲学", ""),
            es = LocalizedContent("¿Qué es el relativismo moral?", listOf("La moral depende del contexto cultural", "La moral es universal", "La moral es innata", "La moral se define por la ley"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4177, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a théorisé le 'surhomme' (Übermensch) ?", listOf("Friedrich Nietzsche", "Martin Heidegger", "Arthur Schopenhauer", "Georg Hegel"), "Philosophie", ""),
            en = LocalizedContent("Which philosopher theorized the 'Übermensch' (Overman)?", listOf("Friedrich Nietzsche", "Martin Heidegger", "Arthur Schopenhauer", "Georg Hegel"), "Philosophy", ""),
            zh = LocalizedContent("哪位哲学家提出了'超人'（Übermensch）理论？", listOf("弗里德里希·尼采", "马丁·海德格尔", "亚瑟·叔本华", "格奥尔格·黑格尔"), "哲学", ""),
            es = LocalizedContent("¿Qué filósofo teorizó el 'superhombre' (Übermensch)?", listOf("Friedrich Nietzsche", "Martin Heidegger", "Arthur Schopenhauer", "Georg Hegel"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4178, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'existentialisme ?", listOf("L'existence précède l'essence : l'homme se définit par ses choix", "L'essence précède l'existence", "La matière est première", "L'âme est immortelle"), "Philosophie", ""),
            en = LocalizedContent("What is existentialism?", listOf("Existence precedes essence: man defines himself by his choices", "Essence precedes existence", "Matter is primary", "The soul is immortal"), "Philosophy", ""),
            zh = LocalizedContent("什么是存在主义？", listOf("存在先于本质：人通过自己的选择定义自己", "本质先于存在", "物质是第一性的", "灵魂是不朽的"), "哲学", ""),
            es = LocalizedContent("¿Qué es el existencialismo?", listOf("La existencia precede a la esencia: el hombre se define por sus elecciones", "La esencia precede a la existencia", "La materia es primaria", "El alma es inmortal"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4179, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a écrit 'L'Être et le Néant' ?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Philosophie", ""),
            en = LocalizedContent("Which philosopher wrote 'Being and Nothingness'?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Philosophy", ""),
            zh = LocalizedContent("哪位哲学家写了《存在与虚无》？", listOf("让-保罗·萨特", "阿尔贝·加缪", "西蒙娜·德·波伏娃", "莫里斯·梅洛-庞蒂"), "哲学", ""),
            es = LocalizedContent("¿Qué filósofo escribió 'El ser y la nada'?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 4180, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le dieu suprême dans la mythologie grecque ?", listOf("Zeus", "Poséidon", "Hadès", "Héphaïstos"), "Mythologie", ""),
            en = LocalizedContent("Who is the supreme god in Greek mythology?", listOf("Zeus", "Poseidon", "Hades", "Hephaestus"), "Mythology", ""),
            zh = LocalizedContent("希腊神话中的至高神是谁？", listOf("宙斯", "波塞冬", "哈迪斯", "赫菲斯托斯"), "神话", ""),
            es = LocalizedContent("¿Quién es el dios supremo en la mitología griega?", listOf("Zeus", "Poseidón", "Hades", "Hefesto"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4181, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel héros grec a tué le Minotaure ?", listOf("Thésée", "Hercule", "Persée", "Achille"), "Mythologie", ""),
            en = LocalizedContent("Which Greek hero killed the Minotaur?", listOf("Theseus", "Hercules", "Perseus", "Achilles"), "Mythology", ""),
            zh = LocalizedContent("哪位希腊英雄杀死了米诺陶？", listOf("忒修斯", "赫拉克勒斯", "珀尔修斯", "阿喀琉斯"), "神话", ""),
            es = LocalizedContent("¿Qué héroe griego mató al Minotauro?", listOf("Teseo", "Hércules", "Perseo", "Aquiles"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4182, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le dieu de la mer dans la mythologie romaine ?", listOf("Neptune", "Pluton", "Jupiter", "Mars"), "Mythologie", ""),
            en = LocalizedContent("Who is the god of the sea in Roman mythology?", listOf("Neptune", "Pluto", "Jupiter", "Mars"), "Mythology", ""),
            zh = LocalizedContent("罗马神话中的海神是谁？", listOf("尼普顿", "普路托", "朱庇特", "马尔斯"), "神话", ""),
            es = LocalizedContent("¿Quién es el dios del mar en la mitología romana?", listOf("Neptuno", "Plutón", "Júpiter", "Marte"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4183, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal a nourri Romulus et Rémus selon la légende romaine ?", listOf("Une louve", "Une jument", "Un aigle", "Une biche"), "Mythologie", ""),
            en = LocalizedContent("Which animal nursed Romulus and Remus according to Roman legend?", listOf("A she-wolf", "A mare", "An eagle", "A doe"), "Mythology", ""),
            zh = LocalizedContent("根据罗马传说，哪只动物哺育了罗慕路斯和雷穆斯？", listOf("母狼", "母马", "鹰", "母鹿"), "神话", ""),
            es = LocalizedContent("¿Qué animal amamantó a Rómulo y Remo según la leyenda romana?", listOf("Una loba", "Una yegua", "Un águila", "Una cierva"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4184, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est Prométhée dans la mythologie grecque ?", listOf("Titan ayant volé le feu aux dieux pour le donner aux hommes", "Dieu de la forge", "Fils de Zeus", "Messager des dieux"), "Mythologie", ""),
            en = LocalizedContent("Who is Prometheus in Greek mythology?", listOf("Titan who stole fire from the gods to give to humans", "God of the forge", "Son of Zeus", "Messenger of the gods"), "Mythology", ""),
            zh = LocalizedContent("希腊神话中的普罗米修斯是谁？", listOf("从众神那里偷火给人类的泰坦", "锻造之神", "宙斯之子", "众神的信使"), "神话", ""),
            es = LocalizedContent("¿Quién es Prometeo en la mitología griega?", listOf("Titán que robó el fuego de los dioses para dárselo a los humanos", "Dios de la forja", "Hijo de Zeus", "Mensajero de los dioses"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4185, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel monstre avait des serpents à la place des cheveux ?", listOf("Méduse", "Chimère", "Hydre de Lerne", "Gorgone de Phorcys"), "Mythologie", ""),
            en = LocalizedContent("Which monster had snakes instead of hair?", listOf("Medusa", "Chimera", "Lernaean Hydra", "Phorcys' Gorgon"), "Mythology", ""),
            zh = LocalizedContent("哪个怪物头上长着蛇而不是头发？", listOf("美杜莎", "喀迈拉", "勒拿九头蛇", "福耳库斯的戈耳工"), "神话", ""),
            es = LocalizedContent("¿Qué monstruo tenía serpientes en lugar de cabello?", listOf("Medusa", "Quimera", "Hidra de Lerna", "Gorgona de Forcis"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4186, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est Loki dans la mythologie nordique ?", listOf("Dieu de la tromperie et du changement de forme", "Dieu du tonnerre", "Dieu de la sagesse", "Gardien du Valhalla"), "Mythologie", ""),
            en = LocalizedContent("Who is Loki in Norse mythology?", listOf("God of trickery and shape-shifting", "God of thunder", "God of wisdom", "Guardian of Valhalla"), "Mythology", ""),
            zh = LocalizedContent("北欧神话中的洛基是谁？", listOf("诡计与变形之神", "雷神", "智慧之神", "瓦尔哈拉的守护者"), "神话", ""),
            es = LocalizedContent("¿Quién es Loki en la mitología nórdica?", listOf("Dios del engaño y el cambio de forma", "Dios del trueno", "Dios de la sabiduría", "Guardián del Valhalla"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4187, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du cheval ailé de la mythologie grecque ?", listOf("Pégase", "Bucéphale", "Centaure", "Arion"), "Mythologie", ""),
            en = LocalizedContent("What is the name of the winged horse in Greek mythology?", listOf("Pegasus", "Bucephalus", "Centaur", "Arion"), "Mythology", ""),
            zh = LocalizedContent("希腊神话中的飞马叫什么名字？", listOf("珀伽索斯", "布塞弗勒斯", "半人马", "阿里翁"), "神话", ""),
            es = LocalizedContent("¿Cuál es el nombre del caballo alado en la mitología griega?", listOf("Pegaso", "Bucéfalo", "Centauro", "Arión"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4188, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est Anubis dans la mythologie égyptienne ?", listOf("Dieu des morts à tête de chacal", "Dieu du soleil", "Dieu de la sagesse", "Dieu de la guerre"), "Mythologie", ""),
            en = LocalizedContent("Who is Anubis in Egyptian mythology?", listOf("God of the dead with a jackal head", "God of the sun", "God of wisdom", "God of war"), "Mythology", ""),
            zh = LocalizedContent("埃及神话中的阿努比斯是谁？", listOf("胡狼头死神", "太阳神", "智慧之神", "战争之神"), "神话", ""),
            es = LocalizedContent("¿Quién es Anubis en la mitología egipcia?", listOf("Dios de los muertos con cabeza de chacal", "Dios del sol", "Dios de la sabiduría", "Dios de la guerra"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4189, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel héros grec a effectué les 12 travaux ?", listOf("Hercule (Héraclès)", "Achille", "Ulysse", "Thésée"), "Mythologie", ""),
            en = LocalizedContent("Which Greek hero performed the 12 labors?", listOf("Hercules (Heracles)", "Achilles", "Odysseus", "Theseus"), "Mythology", ""),
            zh = LocalizedContent("哪位希腊英雄完成了十二项任务？", listOf("赫拉克勒斯", "阿喀琉斯", "奥德修斯", "忒修斯"), "神话", ""),
            es = LocalizedContent("¿Qué héroe griego realizó los 12 trabajos?", listOf("Hércules (Heracles)", "Aquiles", "Ulises", "Teseo"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4190, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du fleuve des enfers dans la mythologie grecque ?", listOf("Le Styx", "L'Achéron", "Le Léthé", "Le Cocyte"), "Mythologie", ""),
            en = LocalizedContent("What is the name of the river of the underworld in Greek mythology?", listOf("Styx", "Acheron", "Lethe", "Cocytus"), "Mythology", ""),
            zh = LocalizedContent("希腊神话中冥界的河流叫什么名字？", listOf("斯提克斯", "阿刻戎", "勒忒", "科库托斯"), "神话", ""),
            es = LocalizedContent("¿Cuál es el nombre del río del inframundo en la mitología griega?", listOf("Estigia", "Aqueronte", "Lete", "Cócito"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 4191, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est Odin dans la mythologie nordique ?", listOf("Dieu suprême de la sagesse et de la guerre", "Dieu du tonnerre", "Dieu des morts", "Dieu de la mer"), "Mythologie", ""),
            en = LocalizedContent("Who is Odin in Norse mythology?", listOf("Supreme god of wisdom and war", "God of thunder", "God of the dead", "God of the sea"), "Mythology", ""),
            zh = LocalizedContent("在挪威神话中，奥丁是谁？", listOf("智慧与战争的至高神", "雷神", "死神", "海神"), "神话", ""),
            es = LocalizedContent("¿Quién es Odín en la mitología nórdica?", listOf("Dios supremo de la sabiduría y la guerra", "Dios del trueno", "Dios de los muertos", "Dios del mar"), "Mitologia", "")
        ),
        BilingualQuestion(
            id = 4192, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le palais des dieux grecs situé sur un mont ?", listOf("L'Olympe", "L'Élysée", "L'Hadès", "Le Tartare"), "Mythologie", ""),
            en = LocalizedContent("What is the palace of the Greek gods located on a mountain?", listOf("Mount Olympus", "Elysium", "Hades", "Tartarus"), "Mythology", ""),
            zh = LocalizedContent("希腊诸神位于山上的宫殿是什么？", listOf("奥林匹斯山", "极乐世界", "冥界", "塔尔塔罗斯"), "神话", ""),
            es = LocalizedContent("¿Cuál es el palacio de los dioses griegos situado en una montaña?", listOf("El Olimpo", "El Elíseo", "El Hades", "El Tártaro"), "Mitologia", "")
        ),
        BilingualQuestion(
            id = 4193, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est Isis dans la mythologie égyptienne ?", listOf("Déesse de la magie et de la maternité", "Déesse de la mort", "Déesse de la guerre", "Déesse de la sagesse"), "Mythologie", ""),
            en = LocalizedContent("Who is Isis in Egyptian mythology?", listOf("Goddess of magic and motherhood", "Goddess of death", "Goddess of war", "Goddess of wisdom"), "Mythology", ""),
            zh = LocalizedContent("在埃及神话中，伊西斯是谁？", listOf("魔法与母性女神", "死亡女神", "战争女神", "智慧女神"), "神话", ""),
            es = LocalizedContent("¿Quién es Isis en la mitología egipcia?", listOf("Diosa de la magia y la maternidad", "Diosa de la muerte", "Diosa de la guerra", "Diosa de la sabiduría"), "Mitologia", "")
        ),
        BilingualQuestion(
            id = 4194, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel héros a fondé Troie selon la mythologie ?", listOf("Ilus (descendant de Dardanos)", "Priam", "Hector", "Énée"), "Mythologie", ""),
            en = LocalizedContent("Which hero founded Troy according to mythology?", listOf("Ilus (descendant of Dardanus)", "Priam", "Hector", "Aeneas"), "Mythology", ""),
            zh = LocalizedContent("根据神话，哪位英雄建立了特洛伊？", listOf("伊洛斯（达耳达诺斯后裔）", "普里阿摩斯", "赫克托耳", "埃涅阿斯"), "神话", ""),
            es = LocalizedContent("¿Qué héroe fundó Troya según la mitología?", listOf("Ilo (descendiente de Dárdano)", "Príamo", "Héctor", "Eneas"), "Mitologia", "")
        ),
        BilingualQuestion(
            id = 4195, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la technique de la 'cuisson sous vide' ?", listOf("Cuisson longue à basse température dans un emballage hermétique", "Cuisson dans une huile chaude", "Cuisson à la vapeur", "Cuisson à feu vif"), "Gastronomie", ""),
            en = LocalizedContent("What is the 'sous-vide' cooking technique?", listOf("Long cooking at low temperature in a sealed package", "Cooking in hot oil", "Steam cooking", "High-heat cooking"), "Gastronomy", ""),
            zh = LocalizedContent("什么是“真空低温烹饪”技术？", listOf("在密封包装中低温长时间烹饪", "在热油中烹饪", "蒸汽烹饪", "高温烹饪"), "美食", ""),
            es = LocalizedContent("¿Qué es la técnica de cocción 'sous-vide'?", listOf("Cocción larga a baja temperatura en un envase hermético", "Cocción en aceite caliente", "Cocción al vapor", "Cocción a fuego vivo"), "Gastronomia", "")
        ),
        BilingualQuestion(
            id = 4196, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'ingrédient clé du soufflé qui lui permet de lever ?", listOf("Les blancs d'œufs montés en neige", "La levure chimique", "Le bicarbonate de soude", "La farine"), "Gastronomie", ""),
            en = LocalizedContent("What is the key ingredient in soufflé that makes it rise?", listOf("Egg whites beaten to stiff peaks", "Baking powder", "Baking soda", "Flour"), "Gastronomy", ""),
            zh = LocalizedContent("舒芙蕾膨胀的关键成分是什么？", listOf("打发的蛋白", "泡打粉", "小苏打", "面粉"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente clave del soufflé que lo hace subir?", listOf("Las claras de huevo montadas a punto de nieve", "La levadura química", "El bicarbonato de sodio", "La harina"), "Gastronomia", "")
        ),
        BilingualQuestion(
            id = 4197, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le 'umami' ?", listOf("Cinquième saveur : goût savoureux (glutamate)", "Mélange de sucré-salé", "Goût piquant", "Saveur métallique"), "Gastronomie", ""),
            en = LocalizedContent("What is 'umami'?", listOf("Fifth taste: savory flavor (glutamate)", "Sweet-salty mix", "Spicy taste", "Metallic flavor"), "Gastronomy", ""),
            zh = LocalizedContent("什么是“鲜味”？", listOf("第五种味道：鲜味（谷氨酸）", "甜咸混合", "辣味", "金属味"), "美食", ""),
            es = LocalizedContent("¿Qué es el 'umami'?", listOf("Quinto sabor: gusto sabroso (glutamato)", "Mezcla de dulce y salado", "Sabor picante", "Sabor metálico"), "Gastronomia", "")
        ),
        BilingualQuestion(
            id = 4198, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a inventé la cuisine fusion ?", listOf("Californie (États-Unis) dans les années 1970-80", "France", "Japon", "Thaïlande"), "Gastronomie", ""),
            en = LocalizedContent("Which country invented fusion cuisine?", listOf("California (USA) in the 1970s-80s", "France", "Japan", "Thailand"), "Gastronomy", ""),
            zh = LocalizedContent("哪个国家发明了融合菜？", listOf("加利福尼亚（美国）在1970-80年代", "法国", "日本", "泰国"), "美食", ""),
            es = LocalizedContent("¿Qué país inventó la cocina fusión?", listOf("California (EE. UU.) en los años 1970-80", "Francia", "Japón", "Tailandia"), "Gastronomia", "")
        ),
        BilingualQuestion(
            id = 4199, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la fermentation du lait en yaourt provoque ?", listOf("Transformation du lactose en acide lactique par des bactéries", "Coagulation des protéines par la chaleur", "Émulsification des graisses", "Dénaturation des enzymes"), "Gastronomie", ""),
            en = LocalizedContent("What does the fermentation of milk into yogurt cause?", listOf("Conversion of lactose into lactic acid by bacteria", "Coagulation of proteins by heat", "Emulsification of fats", "Denaturation of enzymes"), "Gastronomy", ""),
            zh = LocalizedContent("牛奶发酵成酸奶会引起什么？", listOf("细菌将乳糖转化为乳酸", "蛋白质受热凝固", "脂肪乳化", "酶变性"), "美食", ""),
            es = LocalizedContent("¿Qué provoca la fermentación de la leche en yogur?", listOf("Transformación de la lactosa en ácido láctico por bacterias", "Coagulación de las proteínas por el calor", "Emulsificación de las grasas", "Desnaturalización de las enzimas"), "Gastronomia", "")
        ),
        BilingualQuestion(
            id = 4200, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la technique de cuisson en papier sulfurisé ?", listOf("Cuisson en papillote", "Cuisson à la broche", "Cuisson à l'étuvée", "Cuisson à la meunière"), "Gastronomie", ""),
            en = LocalizedContent("What is the name of the cooking technique using parchment paper?", listOf("En papillote", "Spit-roasting", "Stewing", "Meunière"), "Gastronomy", ""),
            zh = LocalizedContent("用烘焙纸烹饪的技术叫什么？", listOf("纸包烹饪", "旋转烧烤", "炖煮", "面拖煎鱼"), "美食", ""),
            es = LocalizedContent("¿Cuál es el nombre de la técnica de cocción en papel sulfurizado?", listOf("Cocción en papillote", "Cocción al asador", "Cocción estofada", "Cocción a la meunière"), "Gastronomia", "")
        ),
        BilingualQuestion(
            id = 4201, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le 'roux' en cuisine ?", listOf("Mélange de farine et matière grasse cuit", "Sauce tomate", "Bouillon concentré", "Fumet de poisson"), "Gastronomie", ""),
            en = LocalizedContent("What is 'roux' in cooking?", listOf("Cooked mixture of flour and fat", "Tomato sauce", "Concentrated broth", "Fish stock"), "Gastronomy", ""),
            zh = LocalizedContent("烹饪中的'roux'是什么？", listOf("面粉和油脂的熟混合物", "番茄酱", "浓缩高汤", "鱼汤"), "美食", ""),
            es = LocalizedContent("¿Qué es el 'roux' en cocina?", listOf("Mezcla cocida de harina y grasa", "Salsa de tomate", "Caldo concentrado", "Fumet de pescado"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 4202, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat traditionnel du Réveillon en France ?", listOf("Huîtres, foie gras, saumon fumé (variable)", "Bœuf bourguignon", "Cassoulet", "Bouillabaisse"), "Gastronomie", ""),
            en = LocalizedContent("What is the traditional Christmas Eve dish in France?", listOf("Oysters, foie gras, smoked salmon (variable)", "Beef bourguignon", "Cassoulet", "Bouillabaisse"), "Gastronomy", ""),
            zh = LocalizedContent("法国传统的圣诞夜菜肴是什么？", listOf("牡蛎、鹅肝、烟熏三文鱼（可变）", "勃艮第牛肉", "卡酥来砂锅", "马赛鱼汤"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato tradicional de Nochebuena en Francia?", listOf("Ostras, foie gras, salmón ahumado (variable)", "Boeuf bourguignon", "Cassoulet", "Bouillabaisse"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 4203, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la 'blanquette' en cuisine française ?", listOf("Ragoût de viande blanche en sauce crème", "Soufflé à la vanille", "Soupe froide", "Terrine en croûte"), "Gastronomie", ""),
            en = LocalizedContent("What is 'blanquette' in French cuisine?", listOf("White meat stew in cream sauce", "Vanilla soufflé", "Cold soup", "Pâté en croûte"), "Gastronomy", ""),
            zh = LocalizedContent("法国菜中的'blanquette'是什么？", listOf("奶油酱白肉炖菜", "香草舒芙蕾", "冷汤", "酥皮肉酱"), "美食", ""),
            es = LocalizedContent("¿Qué es la 'blanquette' en la cocina francesa?", listOf("Guiso de carne blanca en salsa cremosa", "Soufflé de vainilla", "Sopa fría", "Terrina en costra"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 4204, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fromage grec à base de lait de brebis saumure ?", listOf("Feta", "Halloumi", "Kasseri", "Mizithra"), "Gastronomie", ""),
            en = LocalizedContent("What is the Greek cheese made from brine-cured sheep's milk?", listOf("Feta", "Halloumi", "Kasseri", "Mizithra"), "Gastronomy", ""),
            zh = LocalizedContent("哪种希腊奶酪是用盐水腌制的羊奶制成的？", listOf("菲达奶酪", "哈鲁米奶酪", "卡塞里奶酪", "米齐特拉奶酪"), "美食", ""),
            es = LocalizedContent("¿Cuál es el queso griego elaborado con leche de oveja en salmuera?", listOf("Feta", "Halloumi", "Kasseri", "Mizithra"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 4205, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la psychologie cognitive ?", listOf("Étude des processus mentaux : mémoire, attention, raisonnement", "Étude du comportement animal", "Analyse des névroses", "Thérapie comportementale"), "Sciences Humaines", ""),
            en = LocalizedContent("What is cognitive psychology?", listOf("Study of mental processes: memory, attention, reasoning", "Study of animal behavior", "Analysis of neuroses", "Behavioral therapy"), "Human Sciences", ""),
            zh = LocalizedContent("什么是认知心理学？", listOf("研究心理过程：记忆、注意、推理", "研究动物行为", "分析神经症", "行为疗法"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la psicología cognitiva?", listOf("Estudio de los procesos mentales: memoria, atención, razonamiento", "Estudio del comportamiento animal", "Análisis de las neurosis", "Terapia conductual"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 4206, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la sociologie ?", listOf("Étude scientifique des sociétés et des comportements collectifs", "Étude de la psyché individuelle", "Étude de la politique", "Étude de l'économie"), "Sciences Humaines", ""),
            en = LocalizedContent("What is sociology?", listOf("Scientific study of societies and collective behaviors", "Study of the individual psyche", "Study of politics", "Study of economics"), "Human Sciences", ""),
            zh = LocalizedContent("什么是社会学？", listOf("科学地研究社会和集体行为", "研究个体心理", "研究政治", "研究经济"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la sociología?", listOf("Estudio científico de las sociedades y los comportamientos colectivos", "Estudio de la psique individual", "Estudio de la política", "Estudio de la economía"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 4207, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel psychologue a développé la hiérarchie des besoins ?", listOf("Abraham Maslow", "Sigmund Freud", "Carl Jung", "Alfred Adler"), "Sciences Humaines", ""),
            en = LocalizedContent("Which psychologist developed the hierarchy of needs?", listOf("Abraham Maslow", "Sigmund Freud", "Carl Jung", "Alfred Adler"), "Human Sciences", ""),
            zh = LocalizedContent("哪位心理学家提出了需求层次理论？", listOf("亚伯拉罕·马斯洛", "西格蒙德·弗洛伊德", "卡尔·荣格", "阿尔弗雷德·阿德勒"), "人文科学", ""),
            es = LocalizedContent("¿Qué psicólogo desarrolló la jerarquía de necesidades?", listOf("Abraham Maslow", "Sigmund Freud", "Carl Jung", "Alfred Adler"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 4208, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le biais de confirmation ?", listOf("Tendance à favoriser les informations confirmant nos croyances", "Biais de mémoire sélective", "Erreur de raisonnement logique", "Biais culturel"), "Sciences Humaines", ""),
            en = LocalizedContent("What is confirmation bias?", listOf("Tendency to favor information that confirms our beliefs", "Selective memory bias", "Logical reasoning error", "Cultural bias"), "Human Sciences", ""),
            zh = LocalizedContent("什么是确认偏误？", listOf("倾向于支持我们信念的信息", "选择性记忆偏差", "逻辑推理错误", "文化偏见"), "人文科学", ""),
            es = LocalizedContent("¿Qué es el sesgo de confirmación?", listOf("Tendencia a favorecer información que confirma nuestras creencias", "Sesgo de memoria selectiva", "Error de razonamiento lógico", "Sesgo cultural"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 4209, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé la psychanalyse ?", listOf("Sigmund Freud", "Carl Jung", "Alfred Adler", "Wilhelm Wundt"), "Sciences Humaines", ""),
            en = LocalizedContent("Who founded psychoanalysis?", listOf("Sigmund Freud", "Carl Jung", "Alfred Adler", "Wilhelm Wundt"), "Human Sciences", ""),
            zh = LocalizedContent("谁创立了精神分析学？", listOf("西格蒙德·弗洛伊德", "卡尔·荣格", "阿尔弗雷德·阿德勒", "威廉·冯特"), "人文科学", ""),
            es = LocalizedContent("¿Quién fundó el psicoanálisis?", listOf("Sigmund Freud", "Carl Jung", "Alfred Adler", "Wilhelm Wundt"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 4210, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'anthropologie culturelle ?", listOf("Étude comparative des cultures humaines", "Étude de l'évolution biologique humaine", "Étude des os et fossiles", "Étude des langues"), "Sciences Humaines", ""),
            en = LocalizedContent("What is cultural anthropology?", listOf("Comparative study of human cultures", "Study of human biological evolution", "Study of bones and fossils", "Study of languages"), "Human Sciences", ""),
            zh = LocalizedContent("什么是文化人类学？", listOf("比较研究人类文化", "研究人类生物进化", "研究骨骼和化石", "研究语言"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la antropología cultural?", listOf("Estudio comparativo de las culturas humanas", "Estudio de la evolución biológica humana", "Estudio de huesos y fósiles", "Estudio de las lenguas"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 4211, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la linguistique ?", listOf("Science du langage humain", "Apprentissage des langues", "Traduction", "Étude de la grammaire"), "Sciences Humaines", ""),
            en = LocalizedContent("What is linguistics?", listOf("Science of human language", "Language learning", "Translation", "Study of grammar"), "Humanities", ""),
            zh = LocalizedContent("什么是语言学？", listOf("人类语言科学", "语言学习", "翻译", "语法研究"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la lingüística?", listOf("Ciencia del lenguaje humano", "Aprendizaje de idiomas", "Traducción", "Estudio de la gramática"), "Humanidades", "")
        ),
        BilingualQuestion(
            id = 4212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de 'dissonance cognitive' ?", listOf("Tension psychologique entre croyances contradictoires", "Perte de mémoire", "Confusion mentale", "Stress post-traumatique"), "Sciences Humaines", ""),
            en = LocalizedContent("What is the concept of 'cognitive dissonance'?", listOf("Psychological tension between contradictory beliefs", "Memory loss", "Mental confusion", "Post-traumatic stress"), "Humanities", ""),
            zh = LocalizedContent("什么是“认知失调”的概念？", listOf("矛盾信念之间的心理紧张", "记忆丧失", "精神混乱", "创伤后应激"), "人文科学", ""),
            es = LocalizedContent("¿Cuál es el concepto de 'disonancia cognitiva'?", listOf("Tensión psicológica entre creencias contradictorias", "Pérdida de memoria", "Confusión mental", "Estrés postraumático"), "Humanidades", "")
        ),
        BilingualQuestion(
            id = 4213, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'ethnologie ?", listOf("Étude comparée des civilisations et cultures", "Étude des races humaines", "Anthropologie physique", "Étude des langues mortes"), "Sciences Humaines", ""),
            en = LocalizedContent("What is ethnology?", listOf("Comparative study of civilizations and cultures", "Study of human races", "Physical anthropology", "Study of dead languages"), "Humanities", ""),
            zh = LocalizedContent("什么是民族学？", listOf("文明与文化的比较研究", "人种研究", "体质人类学", "死语言研究"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la etnología?", listOf("Estudio comparado de civilizaciones y culturas", "Estudio de las razas humanas", "Antropología física", "Estudio de lenguas muertas"), "Humanidades", "")
        ),
        BilingualQuestion(
            id = 4214, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a théorisé l'inconscient collectif ?", listOf("Carl Gustav Jung", "Sigmund Freud", "Alfred Adler", "Wilhelm Reich"), "Sciences Humaines", ""),
            en = LocalizedContent("Who theorized the collective unconscious?", listOf("Carl Gustav Jung", "Sigmund Freud", "Alfred Adler", "Wilhelm Reich"), "Humanities", ""),
            zh = LocalizedContent("谁提出了集体无意识理论？", listOf("卡尔·古斯塔夫·荣格", "西格蒙德·弗洛伊德", "阿尔弗雷德·阿德勒", "威廉·赖希"), "人文科学", ""),
            es = LocalizedContent("¿Quién teorizó el inconsciente colectivo?", listOf("Carl Gustav Jung", "Sigmund Freud", "Alfred Adler", "Wilhelm Reich"), "Humanidades", "")
        ),
        BilingualQuestion(
            id = 5000, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'effet Hall ?", listOf("Tension transversale dans un conducteur sous champ magnétique", "Résistance électrique anormale", "Conductivité thermique des métaux", "Effet de chaleur magnétique"), "Science", ""),
            en = LocalizedContent("What is the Hall effect?", listOf("Transverse voltage in a conductor under magnetic field", "Abnormal electrical resistance", "Thermal conductivity of metals", "Magnetic heat effect"), "Science", ""),
            zh = LocalizedContent("什么是霍尔效应？", listOf("导体在磁场中产生的横向电压", "异常电阻", "金属的热导率", "磁热效应"), "科学", ""),
            es = LocalizedContent("¿Qué es el efecto Hall?", listOf("Tensión transversal en un conductor bajo campo magnético", "Resistencia eléctrica anormal", "Conductividad térmica de los metales", "Efecto de calor magnético"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5001, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est l'unité du couple en physique ?", listOf("Newton-mètre (N·m)", "Joule (J)", "Watt (W)", "Pascal (Pa)"), "Science", ""),
            en = LocalizedContent("What is the unit of torque in physics?", listOf("Newton-meter (N·m)", "Joule (J)", "Watt (W)", "Pascal (Pa)"), "Science", ""),
            zh = LocalizedContent("物理学中扭矩的单位是什么？", listOf("牛顿米（N·m）", "焦耳（J）", "瓦特（W）", "帕斯卡（Pa）"), "科学", ""),
            es = LocalizedContent("¿Cuál es la unidad del par en física?", listOf("Newton-metro (N·m)", "Julio (J)", "Vatio (W)", "Pascal (Pa)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5002, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un électron de valence ?", listOf("Électron de la couche externe d'un atome", "Électron du noyau", "Électron libre dans un métal", "Électron chargé positivement"), "Science", ""),
            en = LocalizedContent("What is a valence electron?", listOf("Electron in the outermost shell of an atom", "Electron in the nucleus", "Free electron in a metal", "Positively charged electron"), "Science", ""),
            zh = LocalizedContent("什么是价电子？", listOf("原子最外层的电子", "原子核中的电子", "金属中的自由电子", "带正电的电子"), "科学", ""),
            es = LocalizedContent("¿Qué es un electrón de valencia?", listOf("Electrón de la capa externa de un átomo", "Electrón del núcleo", "Electrón libre en un metal", "Electrón cargado positivamente"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5003, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la loi de Snell-Descartes ?", listOf("Loi de la réfraction de la lumière", "Loi de la réflexion", "Loi de diffraction", "Loi de polarisation"), "Science", ""),
            en = LocalizedContent("What is Snell's law?", listOf("Law of refraction of light", "Law of reflection", "Law of diffraction", "Law of polarization"), "Science", ""),
            zh = LocalizedContent("什么是斯涅尔定律？", listOf("光的折射定律", "反射定律", "衍射定律", "偏振定律"), "科学", ""),
            es = LocalizedContent("¿Qué es la ley de Snell?", listOf("Ley de refracción de la luz", "Ley de reflexión", "Ley de difracción", "Ley de polarización"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5004, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le phénomène derrière l'arc-en-ciel ?", listOf("Réfraction, dispersion et réflexion de la lumière dans les gouttes d'eau", "Diffraction de la lumière", "Interférence de la lumière", "Polarisation de la lumière"), "Science", ""),
            en = LocalizedContent("What phenomenon is behind the rainbow?", listOf("Refraction, dispersion and reflection of light in water droplets", "Diffraction of light", "Interference of light", "Polarization of light"), "Science", ""),
            zh = LocalizedContent("彩虹背后的现象是什么？", listOf("光在水滴中的折射、色散和反射", "光的衍射", "光的干涉", "光的偏振"), "科学", ""),
            es = LocalizedContent("¿Qué fenómeno está detrás del arcoíris?", listOf("Refracción, dispersión y reflexión de la luz en las gotas de agua", "Difracción de la luz", "Interferencia de la luz", "Polarización de la luz"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5005, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la mécanique quantique décrit ?", listOf("Comportement de la matière à l'échelle atomique et subatomique", "Mouvement des objets macroscopiques", "Forces gravitationnelles", "Thermodynamique des gaz"), "Science", ""),
            en = LocalizedContent("What does quantum mechanics describe?", listOf("Behavior of matter at atomic and subatomic scales", "Motion of macroscopic objects", "Gravitational forces", "Thermodynamics of gases"), "Science", ""),
            zh = LocalizedContent("量子力学描述什么？", listOf("原子和亚原子尺度上物质的行为", "宏观物体的运动", "引力", "气体热力学"), "科学", ""),
            es = LocalizedContent("¿Qué describe la mecánica cuántica?", listOf("Comportamiento de la materia a escala atómica y subatómica", "Movimiento de objetos macroscópicos", "Fuerzas gravitacionales", "Termodinámica de los gases"), "Ciencia", "")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 5006, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle force est responsable de la cohésion du noyau atomique ?", listOf("La force nucléaire forte", "La force électromagnétique", "La force de gravité", "La force nucléaire faible"), "Science", ""),
            en = LocalizedContent("Which force is responsible for the cohesion of the atomic nucleus?", listOf("Strong nuclear force", "Electromagnetic force", "Gravity", "Weak nuclear force"), "Science", ""),
            zh = LocalizedContent("哪种力负责原子核的凝聚力？", listOf("强核力", "电磁力", "重力", "弱核力"), "科学", ""),
            es = LocalizedContent("¿Qué fuerza es responsable de la cohesión del núcleo atómico?", listOf("La fuerza nuclear fuerte", "La fuerza electromagnética", "La gravedad", "La fuerza nuclear débil"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5007, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un photon ?", listOf("Quantum de lumière sans masse au repos", "Électron de haute énergie", "Particule radioactive", "Noyau d'hélium"), "Science", ""),
            en = LocalizedContent("What is a photon?", listOf("Quantum of light with zero rest mass", "High-energy electron", "Radioactive particle", "Helium nucleus"), "Science", ""),
            zh = LocalizedContent("什么是光子？", listOf("静止质量为零的光量子", "高能电子", "放射性粒子", "氦原子核"), "科学", ""),
            es = LocalizedContent("¿Qué es un fotón?", listOf("Cuantos de luz sin masa en reposo", "Electrón de alta energía", "Partícula radiactiva", "Núcleo de helio"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5008, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le principe de conservation de l'énergie ?", listOf("L'énergie totale d'un système isolé reste constante", "L'énergie se crée et se détruit", "La chaleur dissipée est récupérable", "L'énergie cinétique est toujours conservée"), "Science", ""),
            en = LocalizedContent("What is the principle of conservation of energy?", listOf("The total energy of an isolated system remains constant", "Energy is created and destroyed", "Dissipated heat is recoverable", "Kinetic energy is always conserved"), "Science", ""),
            zh = LocalizedContent("什么是能量守恒原理？", listOf("孤立系统的总能量保持不变", "能量可以被创造和毁灭", "耗散的热量可以回收", "动能总是守恒的"), "科学", ""),
            es = LocalizedContent("¿Qué es el principio de conservación de la energía?", listOf("La energía total de un sistema aislado permanece constante", "La energía se crea y se destruye", "El calor disipado es recuperable", "La energía cinética siempre se conserva"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5009, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la conductivité thermique ?", listOf("Aptitude d'un matériau à transmettre la chaleur", "Résistance électrique", "Chaleur spécifique", "Dilatation thermique"), "Science", ""),
            en = LocalizedContent("What is thermal conductivity?", listOf("Ability of a material to transmit heat", "Electrical resistance", "Specific heat", "Thermal expansion"), "Science", ""),
            zh = LocalizedContent("什么是热导率？", listOf("材料传递热量的能力", "电阻", "比热容", "热膨胀"), "科学", ""),
            es = LocalizedContent("¿Qué es la conductividad térmica?", listOf("Capacidad de un material para transmitir calor", "Resistencia eléctrica", "Calor específico", "Dilatación térmica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5010, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de masse d'un atome ?", listOf("Nombre de protons + neutrons", "Nombre d'électrons", "Nombre de protons", "Nombre de neutrons"), "Science", ""),
            en = LocalizedContent("What is the mass number of an atom?", listOf("Number of protons + neutrons", "Number of electrons", "Number of protons", "Number of neutrons"), "Science", ""),
            zh = LocalizedContent("原子的质量数是什么？", listOf("质子数 + 中子数", "电子数", "质子数", "中子数"), "科学", ""),
            es = LocalizedContent("¿Cuál es el número de masa de un átomo?", listOf("Número de protones + neutrones", "Número de electrones", "Número de protones", "Número de neutrones"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5011, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le tableau périodique classe les éléments selon ?", listOf("Numéro atomique croissant (protons)", "Masse atomique", "Réactivité chimique", "État physique à 25°C"), "Science", ""),
            en = LocalizedContent("What does the periodic table classify elements by?", listOf("Increasing atomic number (protons)", "Atomic mass", "Chemical reactivity", "Physical state at 25°C"), "Science", ""),
            zh = LocalizedContent("元素周期表按什么对元素进行分类？", listOf("原子序数递增（质子数）", "原子质量", "化学反应活性", "25°C时的物理状态"), "科学", ""),
            es = LocalizedContent("¿Según qué clasifica la tabla periódica los elementos?", listOf("Número atómico creciente (protones)", "Masa atómica", "Reactividad química", "Estado físico a 25°C"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un sel en chimie ?", listOf("Composé ionique formé d'un acide et d'une base", "Substance au goût salé", "Composé de sodium", "Mélange d'ions"), "Science", ""),
            en = LocalizedContent("What is a salt in chemistry?", listOf("Ionic compound formed from an acid and a base", "Substance with a salty taste", "Sodium compound", "Mixture of ions"), "Science", ""),
            zh = LocalizedContent("化学中的盐是什么？", listOf("由酸和碱形成的离子化合物", "有咸味的物质", "钠的化合物", "离子的混合物"), "科学", ""),
            es = LocalizedContent("¿Qué es una sal en química?", listOf("Compuesto iónico formado por un ácido y una base", "Sustancia de sabor salado", "Compuesto de sodio", "Mezcla de iones"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5014, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'enthalpie de réaction ?", listOf("Chaleur échangée à pression constante", "Entropie du système", "Énergie libre de Gibbs", "Travail effectué"), "Science", ""),
            en = LocalizedContent("What is the enthalpy of reaction?", listOf("Heat exchanged at constant pressure", "Entropy of the system", "Gibbs free energy", "Work done"), "Science", ""),
            zh = LocalizedContent("什么是反应焓？", listOf("恒压下交换的热量", "系统的熵", "吉布斯自由能", "所做的功"), "科学", ""),
            es = LocalizedContent("¿Qué es la entalpía de reacción?", listOf("Calor intercambiado a presión constante", "Entropía del sistema", "Energía libre de Gibbs", "Trabajo realizado"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5015, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un polymère thermoplastique ?", listOf("Polymère pouvant être fondu et moulé plusieurs fois", "Polymère qui durcit à la chaleur", "Polymère biodégradable", "Polymère naturel"), "Science", ""),
            en = LocalizedContent("What is a thermoplastic polymer?", listOf("Polymer that can be melted and molded multiple times", "Polymer that hardens with heat", "Biodegradable polymer", "Natural polymer"), "Science", ""),
            zh = LocalizedContent("什么是热塑性聚合物？", listOf("可以多次熔化和成型的聚合物", "遇热硬化的聚合物", "可生物降解的聚合物", "天然聚合物"), "科学", ""),
            es = LocalizedContent("¿Qué es un polímero termoplástico?", listOf("Polímero que puede fundirse y moldearse varias veces", "Polímero que se endurece con el calor", "Polímero biodegradable", "Polímero natural"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5016, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule du hydroxyde de sodium ?", listOf("NaOH", "NaCl", "Na₂O", "Na₂SO₄"), "Science", ""),
            en = LocalizedContent("What is the formula of sodium hydroxide?", listOf("NaOH", "NaCl", "Na₂O", "Na₂SO₄"), "Science", ""),
            zh = LocalizedContent("氢氧化钠的化学式是什么？", listOf("NaOH", "NaCl", "Na₂O", "Na₂SO₄"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula del hidróxido de sodio?", listOf("NaOH", "NaCl", "Na₂O", "Na₂SO₄"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5017, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la liaison hydrogène ?", listOf("Interaction entre H lié à O/N/F et autre atome O/N/F", "Liaison entre deux atomes d'hydrogène", "Liaison ionique avec H", "Liaison covalente polaire"), "Science", ""),
            en = LocalizedContent("What is a hydrogen bond?", listOf("Interaction between H bonded to O/N/F and another O/N/F atom", "Bond between two hydrogen atoms", "Ionic bond with H", "Polar covalent bond"), "Science", ""),
            zh = LocalizedContent("什么是氢键？", listOf("与O/N/F相连的H与另一个O/N/F原子之间的相互作用", "两个氢原子之间的键", "与H的离子键", "极性共价键"), "科学", ""),
            es = LocalizedContent("¿Qué es un enlace de hidrógeno?", listOf("Interacción entre H unido a O/N/F y otro átomo O/N/F", "Enlace entre dos átomos de hidrógeno", "Enlace iónico con H", "Enlace covalente polar"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5018, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le gaz produit lors de la photosynthèse ?", listOf("Oxygène (O₂)", "CO₂", "Azote", "Méthane"), "Science", ""),
            en = LocalizedContent("What gas is produced during photosynthesis?", listOf("Oxygen (O₂)", "CO₂", "Nitrogen", "Methane"), "Science", ""),
            zh = LocalizedContent("光合作用产生什么气体？", listOf("氧气（O₂）", "二氧化碳", "氮气", "甲烷"), "科学", ""),
            es = LocalizedContent("¿Qué gas se produce durante la fotosíntesis?", listOf("Oxígeno (O₂)", "CO₂", "Nitrógeno", "Metano"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5019, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un acide aminé ?", listOf("Molécule organique avec groupe amine et groupe carboxyle", "Acide gras", "Glucide simple", "Nucléotide"), "Science", ""),
            en = LocalizedContent("What is an amino acid?", listOf("Organic molecule with an amino group and a carboxyl group", "Fatty acid", "Simple carbohydrate", "Nucleotide"), "Science", ""),
            zh = LocalizedContent("什么是氨基酸？", listOf("具有氨基和羧基的有机分子", "脂肪酸", "简单碳水化合物", "核苷酸"), "科学", ""),
            es = LocalizedContent("¿Qué es un aminoácido?", listOf("Molécula orgánica con grupo amino y grupo carboxilo", "Ácido graso", "Glúcido simple", "Nucleótido"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5020, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'ADN mitochondrial ?", listOf("ADN circulaire transmis par la mère", "ADN des noyaux cellulaires", "ADN recombiné", "ADN bactérien"), "Science", ""),
            en = LocalizedContent("What is mitochondrial DNA?", listOf("Circular DNA inherited from the mother", "DNA from cell nuclei", "Recombinant DNA", "Bacterial DNA"), "Science", ""),
            zh = LocalizedContent("什么是线粒体DNA？", listOf("母系遗传的环状DNA", "细胞核中的DNA", "重组DNA", "细菌DNA"), "科学", ""),
            es = LocalizedContent("¿Qué es el ADN mitocondrial?", listOf("ADN circular heredado de la madre", "ADN de los núcleos celulares", "ADN recombinado", "ADN bacteriano"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5021, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel organe humain se régénère complètement ?", listOf("Le foie", "Le cerveau", "Les os de la jambe", "Le cœur"), "Science", ""),
            en = LocalizedContent("Which human organ regenerates completely?", listOf("The liver", "The brain", "Leg bones", "The heart"), "Science", ""),
            zh = LocalizedContent("哪个人体器官能完全再生？", listOf("肝脏", "大脑", "腿骨", "心脏"), "科学", ""),
            es = LocalizedContent("¿Qué órgano humano se regenera completamente?", listOf("El hígado", "El cerebro", "Los huesos de la pierna", "El corazón"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le système immunitaire inné ?", listOf("Défense non spécifique présente dès la naissance", "Défense après vaccination", "Anticorps produits après infection", "Lymphocytes T spécialisés"), "Science", ""),
            en = LocalizedContent("What is the innate immune system?", listOf("Non-specific defense present from birth", "Defense after vaccination", "Antibodies produced after infection", "Specialized T lymphocytes"), "Science", ""),
            zh = LocalizedContent("什么是先天免疫系统？", listOf("出生时就存在的非特异性防御", "接种疫苗后的防御", "感染后产生的抗体", "特化的T淋巴细胞"), "科学", ""),
            es = LocalizedContent("¿Qué es el sistema inmunitario innato?", listOf("Defensa no específica presente desde el nacimiento", "Defensa después de la vacunación", "Anticuerpos producidos tras la infección", "Linfocitos T especializados"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5023, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la transfusion sanguine ABO nécessite ?", listOf("Compatibilité du groupe sanguin", "Même rhésus uniquement", "Même ethnie", "Même sexe"), "Science", ""),
            en = LocalizedContent("What does ABO blood transfusion require?", listOf("Blood group compatibility", "Same Rh factor only", "Same ethnicity", "Same sex"), "Science", ""),
            zh = LocalizedContent("ABO血型输血需要什么？", listOf("血型相容性", "仅相同Rh因子", "相同种族", "相同性别"), "科学", ""),
            es = LocalizedContent("¿Qué requiere la transfusión sanguínea ABO?", listOf("Compatibilidad del grupo sanguíneo", "Mismo factor Rh únicamente", "Misma etnia", "Mismo sexo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5024, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel hormone régule le cycle du sommeil ?", listOf("Mélatonine", "Cortisol", "Dopamine", "Sérotonine"), "Science", ""),
            en = LocalizedContent("Which hormone regulates the sleep cycle?", listOf("Melatonin", "Cortisol", "Dopamine", "Serotonin"), "Science", ""),
            zh = LocalizedContent("哪种激素调节睡眠周期？", listOf("褪黑素", "皮质醇", "多巴胺", "血清素"), "科学", ""),
            es = LocalizedContent("¿Qué hormona regula el ciclo del sueño?", listOf("Melatonina", "Cortisol", "Dopamina", "Serotonina"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5025, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la digestion protéique commence dans ?", listOf("L'estomac (pepsine)", "La bouche", "L'intestin grêle", "Le côlon"), "Science", ""),
            en = LocalizedContent("Where does protein digestion begin?", listOf("The stomach (pepsin)", "The mouth", "The small intestine", "The colon"), "Science", ""),
            zh = LocalizedContent("蛋白质消化从哪里开始？", listOf("胃（胃蛋白酶）", "口腔", "小肠", "结肠"), "科学", ""),
            es = LocalizedContent("¿Dónde comienza la digestión de proteínas?", listOf("El estómago (pepsina)", "La boca", "El intestino delgado", "El colon"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5026, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la mucoviscidose ?", listOf("Maladie génétique affectant les mucus dans les poumons", "Maladie auto-immune", "Maladie infectieuse", "Maladie cardiovasculaire"), "Science", ""),
            en = LocalizedContent("What is cystic fibrosis?", listOf("Genetic disease affecting mucus in the lungs", "Autoimmune disease", "Infectious disease", "Cardiovascular disease"), "Science", ""),
            zh = LocalizedContent("什么是囊性纤维化？", listOf("影响肺部黏液的遗传病", "自身免疫性疾病", "传染病", "心血管疾病"), "科学", ""),
            es = LocalizedContent("¿Qué es la fibrosis quística?", listOf("Enfermedad genética que afecta el moco en los pulmones", "Enfermedad autoinmune", "Enfermedad infecciosa", "Enfermedad cardiovascular"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5027, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la fonction des reins ?", listOf("Filtrer le sang et produire l'urine", "Produire des hormones sexuelles", "Stocker le glycogène", "Synthétiser les protéines"), "Science", ""),
            en = LocalizedContent("What is the function of the kidneys?", listOf("Filter blood and produce urine", "Produce sex hormones", "Store glycogen", "Synthesize proteins"), "Science", ""),
            zh = LocalizedContent("肾脏的功能是什么？", listOf("过滤血液并产生尿液", "产生性激素", "储存糖原", "合成蛋白质"), "科学", ""),
            es = LocalizedContent("¿Cuál es la función de los riñones?", listOf("Filtrar la sangre y producir orina", "Producir hormonas sexuales", "Almacenar glucógeno", "Sintetizar proteínas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5028, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la sympatèse nerveuse ?", listOf("Division du système nerveux autonome contrôlant la réaction de stress", "Système nerveux central", "Réponse parasympathique", "Système nerveux périphérique"), "Science", ""),
            en = LocalizedContent("What is the sympathetic nervous system?", listOf("Division of the autonomic nervous system controlling the stress response", "Central nervous system", "Parasympathetic response", "Peripheral nervous system"), "Science", ""),
            zh = LocalizedContent("什么是交感神经系统？", listOf("自主神经系统中控制应激反应的分支", "中枢神经系统", "副交感反应", "周围神经系统"), "科学", ""),
            es = LocalizedContent("¿Qué es el sistema nervioso simpático?", listOf("División del sistema nervioso autónomo que controla la reacción de estrés", "Sistema nervioso central", "Respuesta parasimpática", "Sistema nervioso periférico"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5029, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le rôle du thymus ?", listOf("Maturation des lymphocytes T", "Production d'hormones sexuelles", "Filtration du sang", "Production d'insuline"), "Science", ""),
            en = LocalizedContent("What is the role of the thymus?", listOf("Maturation of T lymphocytes", "Production of sex hormones", "Blood filtration", "Insulin production"), "Science", ""),
            zh = LocalizedContent("胸腺的作用是什么？", listOf("T淋巴细胞的成熟", "产生性激素", "过滤血液", "产生胰岛素"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel del timo?", listOf("Maduración de los linfocitos T", "Producción de hormonas sexuales", "Filtración de la sangre", "Producción de insulina"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5030, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle civilisation a créé les hiéroglyphes ?", listOf("Égypte ancienne", "Mésopotamie", "Grèce antique", "Phénicie"), "Histoire", ""),
            en = LocalizedContent("Which civilization created hieroglyphs?", listOf("Ancient Egypt", "Mesopotamia", "Ancient Greece", "Phoenicia"), "History", ""),
            zh = LocalizedContent("哪个文明创造了象形文字？", listOf("古埃及", "美索不达米亚", "古希腊", "腓尼基"), "历史", ""),
            es = LocalizedContent("¿Qué civilización creó los jeroglíficos?", listOf("Antiguo Egipto", "Mesopotamia", "Antigua Grecia", "Fenicia"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5031, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire était le plus grand de l'Antiquité ?", listOf("Empire perse achéménide ou Empire romain (débat)", "Empire romain uniquement", "Empire alexandrin", "Empire mongol"), "Histoire", ""),
            en = LocalizedContent("Which empire was the largest in antiquity?", listOf("Achaemenid Persian Empire or Roman Empire (debate)", "Roman Empire only", "Alexandrian Empire", "Mongol Empire"), "History", ""),
            zh = LocalizedContent("古代最大的帝国是哪个？", listOf("阿契美尼德波斯帝国或罗马帝国（有争议）", "仅罗马帝国", "亚历山大帝国", "蒙古帝国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio fue el más grande de la Antigüedad?", listOf("Imperio persa aqueménida o Imperio romano (debate)", "Solo el Imperio romano", "Imperio alejandrino", "Imperio mongol"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5032, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Jules César fut-il assassiné ?", listOf("44 av. J.-C.", "48 av. J.-C.", "27 av. J.-C.", "100 av. J.-C."), "Histoire", ""),
            en = LocalizedContent("In what year was Julius Caesar assassinated?", listOf("44 BC", "48 BC", "27 BC", "100 BC"), "History", ""),
            zh = LocalizedContent("尤利乌斯·凯撒在哪年被刺杀？", listOf("公元前44年", "公元前48年", "公元前27年", "公元前100年"), "历史", ""),
            es = LocalizedContent("¿En qué año fue asesinado Julio César?", listOf("44 a.C.", "48 a.C.", "27 a.C.", "100 a.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 5033, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pharaon est associé à l'hérésie religieuse du culte d'Aton ?", listOf("Akhenaton", "Ramsès II", "Toutânkhamon", "Thoutmosis III"), "Histoire", ""),
            en = LocalizedContent("Which pharaoh is associated with the religious heresy of the cult of Aten?", listOf("Akhenaten", "Ramesses II", "Tutankhamun", "Thutmose III"), "History", ""),
            zh = LocalizedContent("哪位法老与阿吞崇拜的宗教异端有关？", listOf("阿肯那顿", "拉美西斯二世", "图坦卡蒙", "图特摩斯三世"), "历史", ""),
            es = LocalizedContent("¿Qué faraón está asociado con la herejía religiosa del culto a Atón?", listOf("Akenatón", "Ramsés II", "Tutankamón", "Tutmosis III"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5034, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le premier roi de Rome légendaire ?", listOf("Romulus", "Rémus", "Numa Pompilius", "Ancus Marcius"), "Histoire", ""),
            en = LocalizedContent("Who was the legendary first king of Rome?", listOf("Romulus", "Remus", "Numa Pompilius", "Ancus Marcius"), "History", ""),
            zh = LocalizedContent("传说中罗马的第一位国王是谁？", listOf("罗慕路斯", "雷穆斯", "努马·庞皮利乌斯", "安库斯·马尔基乌斯"), "历史", ""),
            es = LocalizedContent("¿Quién fue el legendario primer rey de Roma?", listOf("Rómulo", "Remo", "Numa Pompilio", "Anco Marcio"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5035, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle guerre opposa Athènes et Sparte au Ve siècle av. J.-C. ?", listOf("Guerre du Péloponnèse", "Guerres médiques", "Guerre de Troie", "Guerre sacrée"), "Histoire", ""),
            en = LocalizedContent("Which war opposed Athens and Sparta in the 5th century BC?", listOf("Peloponnesian War", "Persian Wars", "Trojan War", "Sacred War"), "History", ""),
            zh = LocalizedContent("公元前5世纪雅典和斯巴达之间发生了哪场战争？", listOf("伯罗奔尼撒战争", "希波战争", "特洛伊战争", "神圣战争"), "历史", ""),
            es = LocalizedContent("¿Qué guerra enfrentó a Atenas y Esparta en el siglo V a.C.?", listOf("Guerra del Peloponeso", "Guerras Médicas", "Guerra de Troya", "Guerra Sagrada"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5036, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la date traditionnelle de la fondation de Rome ?", listOf("753 av. J.-C.", "509 av. J.-C.", "476 av. J.-C.", "264 av. J.-C."), "Histoire", ""),
            en = LocalizedContent("What is the traditional date of the founding of Rome?", listOf("753 BC", "509 BC", "476 BC", "264 BC"), "History", ""),
            zh = LocalizedContent("罗马建城的传统日期是哪一年？", listOf("公元前753年", "公元前509年", "公元前476年", "公元前264年"), "历史", ""),
            es = LocalizedContent("¿Cuál es la fecha tradicional de la fundación de Roma?", listOf("753 a.C.", "509 a.C.", "476 a.C.", "264 a.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 5037, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peuple a inventé l'alphabet phonétique moderne ?", listOf("Les Phéniciens", "Les Grecs", "Les Romains", "Les Sumériens"), "Histoire", ""),
            en = LocalizedContent("Which people invented the modern phonetic alphabet?", listOf("The Phoenicians", "The Greeks", "The Romans", "The Sumerians"), "History", ""),
            zh = LocalizedContent("哪个民族发明了现代音标字母？", listOf("腓尼基人", "希腊人", "罗马人", "苏美尔人"), "历史", ""),
            es = LocalizedContent("¿Qué pueblo inventó el alfabeto fonético moderno?", listOf("Los fenicios", "Los griegos", "Los romanos", "Los sumerios"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5038, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom du sénat de l'ancienne Athènes ?", listOf("La Boulè", "L'Aréopage", "L'Ekklesia", "Le Prytanée"), "Histoire", ""),
            en = LocalizedContent("What was the name of the senate in ancient Athens?", listOf("The Boule", "The Areopagus", "The Ekklesia", "The Prytaneion"), "History", ""),
            zh = LocalizedContent("古雅典的元老院叫什么？", listOf("五百人议事会", "战神山议事会", "公民大会", "主席团"), "历史", ""),
            es = LocalizedContent("¿Cuál era el nombre del senado en la antigua Atenas?", listOf("La Bulé", "El Areópago", "La Ekklesía", "El Pritaneo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5039, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est Alexandre le Grand ?", listOf("Roi de Macédoine ayant créé un empire de la Grèce à l'Inde", "Général romain", "Roi persan", "Pharaon égyptien"), "Histoire", ""),
            en = LocalizedContent("Who was Alexander the Great?", listOf("King of Macedon who created an empire from Greece to India", "Roman general", "Persian king", "Egyptian pharaoh"), "History", ""),
            zh = LocalizedContent("亚历山大大帝是谁？", listOf("马其顿国王，建立了从希腊到印度的帝国", "罗马将军", "波斯国王", "埃及法老"), "历史", ""),
            es = LocalizedContent("¿Quién fue Alejandro Magno?", listOf("Rey de Macedonia que creó un imperio desde Grecia hasta la India", "General romano", "Rey persa", "Faraón egipcio"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5040, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la forme de gouvernement d'Athènes au Ve siècle ?", listOf("Démocratie directe", "Oligarchie", "Tyrannie", "République"), "Histoire", ""),
            en = LocalizedContent("What is the name of the form of government in Athens in the 5th century?", listOf("Direct democracy", "Oligarchy", "Tyranny", "Republic"), "History", ""),
            zh = LocalizedContent("公元前5世纪雅典的政府形式叫什么？", listOf("直接民主制", "寡头制", "僭主制", "共和制"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre de la forma de gobierno en Atenas en el siglo V?", listOf("Democracia directa", "Oligarquía", "Tiranía", "República"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5041, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'Empire romain d'Occident est-il tombé ?", listOf("476 ap. J.-C.", "410 ap. J.-C.", "455 ap. J.-C.", "500 ap. J.-C."), "Histoire", ""),
            en = LocalizedContent("In which year did the Western Roman Empire fall?", listOf("476 AD", "410 AD", "455 AD", "500 AD"), "History", ""),
            zh = LocalizedContent("西罗马帝国在哪一年灭亡？", listOf("公元476年", "公元410年", "公元455年", "公元500年"), "历史", ""),
            es = LocalizedContent("¿En qué año cayó el Imperio romano de Occidente?", listOf("476 d.C.", "410 d.C.", "455 d.C.", "500 d.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 5042, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Hannibal Barca ?", listOf("Général carthaginois ayant traversé les Alpes avec des éléphants", "Roi de Carthage", "Général romain", "Philosophe grec"), "Histoire", ""),
            en = LocalizedContent("Who was Hannibal Barca?", listOf("Carthaginian general who crossed the Alps with elephants", "King of Carthage", "Roman general", "Greek philosopher"), "History", ""),
            zh = LocalizedContent("汉尼拔·巴卡是谁？", listOf("迦太基将军，曾率大象翻越阿尔卑斯山", "迦太基国王", "罗马将军", "希腊哲学家"), "历史", ""),
            es = LocalizedContent("¿Quién fue Aníbal Barca?", listOf("General cartaginés que cruzó los Alpes con elefantes", "Rey de Cartago", "General romano", "Filósofo griego"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5043, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la première croisade ?", listOf("Croisade de 1096 (Première Croisade)", "Croisade des Albigeois", "Croisade des enfants", "Croisade de 1147"), "Histoire", ""),
            en = LocalizedContent("What is the name of the first crusade?", listOf("Crusade of 1096 (First Crusade)", "Albigensian Crusade", "Children's Crusade", "Crusade of 1147"), "History", ""),
            zh = LocalizedContent("第一次十字军东征叫什么？", listOf("1096年十字军东征（第一次十字军东征）", "阿尔比十字军", "儿童十字军", "1147年十字军东征"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre de la primera cruzada?", listOf("Cruzada de 1096 (Primera Cruzada)", "Cruzada albigense", "Cruzada de los niños", "Cruzada de 1147"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5045, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la plus ancienne université d'Europe ?", listOf("Université de Bologne (1088)", "Université de Paris (1150)", "Université d'Oxford (1167)", "Université de Salerne"), "Histoire", ""),
            en = LocalizedContent("What is the oldest university in Europe?", listOf("University of Bologna (1088)", "University of Paris (1150)", "University of Oxford (1167)", "University of Salerno"), "History", ""),
            zh = LocalizedContent("欧洲最古老的大学是哪所？", listOf("博洛尼亚大学（1088年）", "巴黎大学（1150年）", "牛津大学（1167年）", "萨莱诺大学"), "历史", ""),
            es = LocalizedContent("¿Cuál es la universidad más antigua de Europa?", listOf("Universidad de Bolonia (1088)", "Universidad de París (1150)", "Universidad de Oxford (1167)", "Universidad de Salerno"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5046, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la Magna Carta (1215) ?", listOf("Charte limitant le pouvoir royal en Angleterre", "Constitution anglaise", "Traité de paix franco-anglais", "Code de lois médiéval"), "Histoire", ""),
            en = LocalizedContent("What is the Magna Carta (1215)?", listOf("Charter limiting royal power in England", "English constitution", "Franco-English peace treaty", "Medieval law code"), "History", ""),
            zh = LocalizedContent("《大宪章》（1215年）是什么？", listOf("限制英国王权的宪章", "英国宪法", "法英和平条约", "中世纪法典"), "历史", ""),
            es = LocalizedContent("¿Qué es la Carta Magna (1215)?", listOf("Carta que limita el poder real en Inglaterra", "Constitución inglesa", "Tratado de paz franco-inglés", "Código de leyes medieval"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5047, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel saint est le patron de la France ?", listOf("Saint Denis", "Saint Michel", "Saint Louis", "Sainte Jeanne d'Arc"), "Histoire", ""),
            en = LocalizedContent("Which saint is the patron saint of France?", listOf("Saint Denis", "Saint Michael", "Saint Louis", "Saint Joan of Arc"), "History", ""),
            zh = LocalizedContent("哪位圣人是法国的守护圣徒？", listOf("圣德尼", "圣米歇尔", "圣路易", "圣女贞德"), "历史", ""),
            es = LocalizedContent("¿Qué santo es el patrón de Francia?", listOf("San Dionisio", "San Miguel", "San Luis", "Santa Juana de Arco"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5048, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a débuté la Guerre de Cent Ans ?", listOf("1337", "1300", "1350", "1415"), "Histoire", ""),
            en = LocalizedContent("In which year did the Hundred Years' War begin?", listOf("1337", "1300", "1350", "1415"), "History", ""),
            zh = LocalizedContent("百年战争始于哪一年？", listOf("1337", "1300", "1350", "1415"), "历史", ""),
            es = LocalizedContent("¿En qué año comenzó la Guerra de los Cien Años?", listOf("1337", "1300", "1350", "1415"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5049, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est Tamerlan ?", listOf("Conquérant turc-mongol du XIVe-XVe siècle", "Khan mongol successeur de Gengis", "Sultan ottoman", "Shah de Perse"), "Histoire", ""),
            en = LocalizedContent("Who is Tamerlane?", listOf("Turco-Mongol conqueror of the 14th-15th century", "Mongol khan successor of Genghis", "Ottoman sultan", "Shah of Persia"), "History", ""),
            zh = LocalizedContent("帖木儿是谁？", listOf("14-15世纪的突厥-蒙古征服者", "成吉思汗的继承者蒙古可汗", "奥斯曼苏丹", "波斯沙阿"), "历史", ""),
            es = LocalizedContent("¿Quién es Tamerlán?", listOf("Conquistador turco-mongol del siglo XIV-XV", "Kan mongol sucesor de Gengis", "Sultán otomano", "Sha de Persia"), "Historia", "")
        ),
        BilingualQuestion(
            id = 5050, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle ville est le centre financier mondial (selon l'Indice) ?", listOf("New York, Londres, Hong Kong (selon les années)", "New York uniquement", "Tokyo", "Zurich"), "Géographie", ""),
            en = LocalizedContent("Which city is the world's financial center (according to the Index)?", listOf("New York, London, Hong Kong (depending on the year)", "New York only", "Tokyo", "Zurich"), "Geography", ""),
            zh = LocalizedContent("根据指数，哪个城市是世界金融中心？", listOf("纽约、伦敦、香港（视年份而定）", "仅纽约", "东京", "苏黎世"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es el centro financiero mundial (según el Índice)?", listOf("Nueva York, Londres, Hong Kong (según el año)", "Solo Nueva York", "Tokio", "Zúrich"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5051, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand producteur de pétrole au monde ?", listOf("États-Unis (depuis 2018)", "Arabie Saoudite", "Russie", "Irak"), "Géographie", ""),
            en = LocalizedContent("Who is the world's largest oil producer?", listOf("United States (since 2018)", "Saudi Arabia", "Russia", "Iraq"), "Geography", ""),
            zh = LocalizedContent("世界上最大的石油生产国是哪个？", listOf("美国（自2018年起）", "沙特阿拉伯", "俄罗斯", "伊拉克"), "地理", ""),
            es = LocalizedContent("¿Quién es el mayor productor de petróleo del mundo?", listOf("Estados Unidos (desde 2018)", "Arabia Saudita", "Rusia", "Irak"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5052, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays possède les plus grandes réserves d'eau douce ?", listOf("Brésil", "Russie", "Canada", "Chine"), "Géographie", ""),
            en = LocalizedContent("Which country has the largest freshwater reserves?", listOf("Brazil", "Russia", "Canada", "China"), "Geography", ""),
            zh = LocalizedContent("哪个国家拥有最大的淡水储量？", listOf("巴西", "俄罗斯", "加拿大", "中国"), "地理", ""),
            es = LocalizedContent("¿Qué país posee las mayores reservas de agua dulce?", listOf("Brasil", "Rusia", "Canadá", "China"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5053, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la plus grande zone de libre-échange du monde ?", listOf("ZLECAF (Afrique, 2021) ou RCEP (Asie-Pacifique, 2022)", "UE", "ALENA/USMCA", "ASEAN"), "Géographie", ""),
            en = LocalizedContent("What is the world's largest free trade area?", listOf("AfCFTA (Africa, 2021) or RCEP (Asia-Pacific, 2022)", "EU", "NAFTA/USMCA", "ASEAN"), "Geography", ""),
            zh = LocalizedContent("世界上最大的自由贸易区是哪个？", listOf("非洲大陆自由贸易区（2021年）或区域全面经济伙伴关系协定（2022年）", "欧盟", "北美自由贸易协定/美墨加协定", "东盟"), "地理", ""),
            es = LocalizedContent("¿Cuál es la zona de libre comercio más grande del mundo?", listOf("ZLECAF (África, 2021) o RCEP (Asia-Pacífico, 2022)", "UE", "TLCAN/USMCA", "ASEAN"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5054, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est le plus grand producteur de café ?", listOf("Brésil", "Vietnam", "Colombie", "Éthiopie"), "Géographie", ""),
            en = LocalizedContent("Which country is the largest coffee producer?", listOf("Brazil", "Vietnam", "Colombia", "Ethiopia"), "Geography", ""),
            zh = LocalizedContent("哪个国家是最大的咖啡生产国？", listOf("巴西", "越南", "哥伦比亚", "埃塞俄比亚"), "地理", ""),
            es = LocalizedContent("¿Qué país es el mayor productor de café?", listOf("Brasil", "Vietnam", "Colombia", "Etiopía"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5055, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays est le plus grand exportateur de blé ?", listOf("Russie (depuis 2021)", "États-Unis", "Canada", "Australie"), "Géographie", ""),
            en = LocalizedContent("Which country is the largest wheat exporter?", listOf("Russia (since 2021)", "United States", "Canada", "Australia"), "Geography", ""),
            zh = LocalizedContent("哪个国家是最大的小麦出口国？", listOf("俄罗斯（自2021年起）", "美国", "加拿大", "澳大利亚"), "地理", ""),
            es = LocalizedContent("¿Qué país es el mayor exportador de trigo?", listOf("Rusia (desde 2021)", "Estados Unidos", "Canadá", "Australia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5056, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la monnaie du Japon ?", listOf("Yen", "Won", "Yuan", "Dollar de Singapour"), "Géographie", ""),
            en = LocalizedContent("What is the currency of Japan?", listOf("Yen", "Won", "Yuan", "Singapore Dollar"), "Geography", ""),
            zh = LocalizedContent("日本的货币是什么？", listOf("日元", "韩元", "人民币", "新加坡元"), "地理", ""),
            es = LocalizedContent("¿Cuál es la moneda de Japón?", listOf("Yen", "Won", "Yuan", "Dólar de Singapur"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5057, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays est le plus grand producteur d'acier ?", listOf("Chine (environ 50% du monde)", "Inde", "Japon", "États-Unis"), "Géographie", ""),
            en = LocalizedContent("Which country is the largest steel producer?", listOf("China (about 50% of the world)", "India", "Japan", "United States"), "Geography", ""),
            zh = LocalizedContent("哪个国家是最大的钢铁生产国？", listOf("中国（约占世界50%）", "印度", "日本", "美国"), "地理", ""),
            es = LocalizedContent("¿Qué país es el mayor productor de acero?", listOf("China (aproximadamente el 50% del mundo)", "India", "Japón", "Estados Unidos"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5058, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la plus grande bourse du monde par capitalisation ?", listOf("NYSE (New York Stock Exchange)", "NASDAQ", "London Stock Exchange", "Tokyo Stock Exchange"), "Géographie", ""),
            en = LocalizedContent("What is the largest stock exchange in the world by market capitalization?", listOf("NYSE (New York Stock Exchange)", "NASDAQ", "London Stock Exchange", "Tokyo Stock Exchange"), "Geography", ""),
            zh = LocalizedContent("按市值计算，世界上最大的证券交易所是哪个？", listOf("纽约证券交易所", "纳斯达克", "伦敦证券交易所", "东京证券交易所"), "地理", ""),
            es = LocalizedContent("¿Cuál es la bolsa de valores más grande del mundo por capitalización?", listOf("NYSE (Bolsa de Nueva York)", "NASDAQ", "Bolsa de Londres", "Bolsa de Tokio"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5059, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus pauvre du monde selon l'IDH ?", listOf("Niger ou Sud Soudan (selon les années)", "Érythrée", "République centrafricaine", "Burundi"), "Géographie", ""),
            en = LocalizedContent("What is the poorest country in the world according to the HDI?", listOf("Niger or South Sudan (depending on the year)", "Eritrea", "Central African Republic", "Burundi"), "Geography", ""),
            zh = LocalizedContent("根据人类发展指数，世界上最贫穷的国家是哪个？", listOf("尼日尔或南苏丹（视年份而定）", "厄立特里亚", "中非共和国", "布隆迪"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más pobre del mundo según el IDH?", listOf("Níger o Sudán del Sur (según el año)", "Eritrea", "República Centroafricana", "Burundi"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5060, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle ville est le principal hub aérien d'Asie ?", listOf("Dubai (DXB) ou Hong Kong (selon les années)", "Singapour", "Tokyo", "Shanghai"), "Géographie", ""),
            en = LocalizedContent("Which city is the main air hub in Asia?", listOf("Dubai (DXB) or Hong Kong (depending on the year)", "Singapore", "Tokyo", "Shanghai"), "Geography", ""),
            zh = LocalizedContent("哪个城市是亚洲的主要航空枢纽？", listOf("迪拜（DXB）或香港（视年份而定）", "新加坡", "东京", "上海"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es el principal centro aéreo de Asia?", listOf("Dubái (DXB) o Hong Kong (según el año)", "Singapur", "Tokio", "Shanghái"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5061, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus grand réseau ferroviaire ?", listOf("États-Unis", "Russie", "Chine", "Inde"), "Géographie", ""),
            en = LocalizedContent("Which country has the largest railway network?", listOf("United States", "Russia", "China", "India"), "Geography", ""),
            zh = LocalizedContent("哪个国家拥有最大的铁路网络？", listOf("美国", "俄罗斯", "中国", "印度"), "地理", ""),
            es = LocalizedContent("¿Qué país tiene la red ferroviaria más grande?", listOf("Estados Unidos", "Rusia", "China", "India"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5062, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays produit le plus d'énergie solaire ?", listOf("Chine", "Allemagne", "États-Unis", "Inde"), "Géographie", ""),
            en = LocalizedContent("Which country produces the most solar energy?", listOf("China", "Germany", "United States", "India"), "Geography", ""),
            zh = LocalizedContent("哪个国家生产的太阳能最多？", listOf("中国", "德国", "美国", "印度"), "地理", ""),
            es = LocalizedContent("¿Qué país produce más energía solar?", listOf("China", "Alemania", "Estados Unidos", "India"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5063, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la devise européenne commune ?", listOf("L'euro (€)", "Le franc suisse", "La livre sterling", "La couronne"), "Géographie", ""),
            en = LocalizedContent("What is the common European currency?", listOf("Euro (€)", "Swiss franc", "Pound sterling", "Krona"), "Geography", ""),
            zh = LocalizedContent("欧洲的共同货币是什么？", listOf("欧元（€）", "瑞士法郎", "英镑", "克朗"), "地理", ""),
            es = LocalizedContent("¿Cuál es la moneda común europea?", listOf("Euro (€)", "Franco suizo", "Libra esterlina", "Corona"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5064, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le principal port de conteneurs au monde ?", listOf("Shanghai (Chine)", "Singapour", "Rotterdam", "Los Angeles"), "Géographie", ""),
            en = LocalizedContent("What is the main container port in the world?", listOf("Shanghai (China)", "Singapore", "Rotterdam", "Los Angeles"), "Geography", ""),
            zh = LocalizedContent("世界上主要的集装箱港口是哪个？", listOf("上海（中国）", "新加坡", "鹿特丹", "洛杉矶"), "地理", ""),
            es = LocalizedContent("¿Cuál es el principal puerto de contenedores del mundo?", listOf("Shanghái (China)", "Singapur", "Róterdam", "Los Ángeles"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 5065, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle série télévisée met en scène 'Les Stark' et 'Les Lannister' ?", listOf("Game of Thrones", "Vikings", "The Last Kingdom", "Rome"), "Culture", ""),
            en = LocalizedContent("Which TV series features 'The Starks' and 'The Lannisters'?", listOf("Game of Thrones", "Vikings", "The Last Kingdom", "Rome"), "Culture", ""),
            zh = LocalizedContent("哪部电视剧中有'史塔克家族'和'兰尼斯特家族'？", listOf("权力的游戏", "维京传奇", "孤国春秋", "罗马"), "文化", ""),
            es = LocalizedContent("¿Qué serie de televisión presenta a 'Los Stark' y 'Los Lannister'?", listOf("Game of Thrones", "Vikingos", "The Last Kingdom", "Roma"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5066, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel personnage de bande dessinée habite à Mos Eisley ?", listOf("Aucun - c'est dans Star Wars", "Han Solo", "Luke Skywalker", "Obi-Wan Kenobi"), "Culture", ""),
            en = LocalizedContent("Which comic book character lives in Mos Eisley?", listOf("None - it's from Star Wars", "Han Solo", "Luke Skywalker", "Obi-Wan Kenobi"), "Culture", ""),
            zh = LocalizedContent("哪个漫画人物住在莫斯艾斯利？", listOf("没有——这是星球大战里的", "汉·索罗", "卢克·天行者", "欧比旺·克诺比"), "文化", ""),
            es = LocalizedContent("¿Qué personaje de cómic vive en Mos Eisley?", listOf("Ninguno - es de Star Wars", "Han Solo", "Luke Skywalker", "Obi-Wan Kenobi"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5067, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu vidéo se déroule dans la ville fictive de 'Liberty City' ?", listOf("Grand Theft Auto (GTA IV)", "GTA San Andreas", "GTA V", "Red Dead Redemption"), "Culture", ""),
            en = LocalizedContent("Which video game is set in the fictional city of 'Liberty City'?", listOf("Grand Theft Auto (GTA IV)", "GTA San Andreas", "GTA V", "Red Dead Redemption"), "Culture", ""),
            zh = LocalizedContent("哪款电子游戏设定在虚构城市'自由城'？", listOf("侠盗猎车手（GTA IV）", "侠盗猎车手：圣安地列斯", "侠盗猎车手V", "荒野大镖客：救赎"), "文化", ""),
            es = LocalizedContent("¿Qué videojuego se desarrolla en la ciudad ficticia de 'Liberty City'?", listOf("Grand Theft Auto (GTA IV)", "GTA San Andreas", "GTA V", "Red Dead Redemption"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5068, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle série les personnages vivent-ils dans 'Westeros' ?", listOf("Game of Thrones / House of the Dragon", "The Witcher", "The Wheel of Time", "Foundation"), "Culture", ""),
            en = LocalizedContent("In which series do the characters live in 'Westeros'?", listOf("Game of Thrones / House of the Dragon", "The Witcher", "The Wheel of Time", "Foundation"), "Culture", ""),
            zh = LocalizedContent("在哪个系列中，角色们生活在'维斯特洛'？", listOf("权力的游戏 / 龙之家族", "猎魔人", "时光之轮", "基地"), "文化", ""),
            es = LocalizedContent("¿En qué serie viven los personajes en 'Poniente'?", listOf("Juego de Tronos / La Casa del Dragón", "The Witcher", "La Rueda del Tiempo", "Fundación"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5069, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel super-héros est surnommé 'L'Homme d'Acier' ?", listOf("Superman", "Iron Man", "Captain America", "Thor"), "Culture", ""),
            en = LocalizedContent("Which superhero is nicknamed 'The Man of Steel'?", listOf("Superman", "Iron Man", "Captain America", "Thor"), "Culture", ""),
            zh = LocalizedContent("哪个超级英雄被称为'钢铁之躯'？", listOf("超人", "钢铁侠", "美国队长", "雷神"), "文化", ""),
            es = LocalizedContent("¿Qué superhéroe es apodado 'El Hombre de Acero'?", listOf("Superman", "Iron Man", "Capitán América", "Thor"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5070, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel anime les héros utilisent-ils le 'chakra' pour se battre ?", listOf("Naruto", "Dragon Ball Z", "Bleach", "One Piece"), "Culture", ""),
            en = LocalizedContent("In which anime do the heroes use 'chakra' to fight?", listOf("Naruto", "Dragon Ball Z", "Bleach", "One Piece"), "Culture", ""),
            zh = LocalizedContent("在哪部动漫中，英雄们使用'查克拉'战斗？", listOf("火影忍者", "龙珠Z", "死神", "海贼王"), "文化", ""),
            es = LocalizedContent("¿En qué anime los héroes usan 'chakra' para luchar?", listOf("Naruto", "Dragon Ball Z", "Bleach", "One Piece"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5071, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel personnage de Disney dit 'Hakuna Matata' ?", listOf("Timon et Pumbaa (Le Roi Lion)", "Baloo (Le Livre de la Jungle)", "Lumière (La Belle et la Bête)", "Genie (Aladdin)"), "Culture", ""),
            en = LocalizedContent("Which Disney character says 'Hakuna Matata'?", listOf("Timon and Pumbaa (The Lion King)", "Baloo (The Jungle Book)", "Lumière (Beauty and the Beast)", "Genie (Aladdin)"), "Culture", ""),
            zh = LocalizedContent("哪个迪士尼角色说'Hakuna Matata'？", listOf("丁满和彭彭（狮子王）", "巴鲁（森林王子）", "卢米埃（美女与野兽）", "精灵（阿拉丁）"), "文化", ""),
            es = LocalizedContent("¿Qué personaje de Disney dice 'Hakuna Matata'?", listOf("Timón y Pumba (El Rey León)", "Baloo (El Libro de la Selva)", "Lumière (La Bella y la Bestia)", "Genio (Aladdín)"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5072, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle franchise de jeux vidéo met en scène un plombier qui sauve une princesse ?", listOf("Super Mario Bros (Nintendo)", "Donkey Kong", "Banjo-Kazooie", "Spyro"), "Culture", ""),
            en = LocalizedContent("Which video game franchise features a plumber who saves a princess?", listOf("Super Mario Bros (Nintendo)", "Donkey Kong", "Banjo-Kazooie", "Spyro"), "Culture", ""),
            zh = LocalizedContent("哪个电子游戏系列讲述了一个水管工拯救公主的故事？", listOf("超级马里奥兄弟（任天堂）", "大金刚", "班卓熊", "斯派罗"), "文化", ""),
            es = LocalizedContent("¿Qué franquicia de videojuegos presenta a un fontanero que salva a una princesa?", listOf("Super Mario Bros (Nintendo)", "Donkey Kong", "Banjo-Kazooie", "Spyro"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5073, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle de Walter White dans 'Breaking Bad' ?", listOf("Bryan Cranston", "Aaron Paul", "Bob Odenkirk", "Dean Norris"), "Culture", ""),
            en = LocalizedContent("Who plays the role of Walter White in 'Breaking Bad'?", listOf("Bryan Cranston", "Aaron Paul", "Bob Odenkirk", "Dean Norris"), "Culture", ""),
            zh = LocalizedContent("谁在《绝命毒师》中饰演沃尔特·怀特？", listOf("布莱恩·克兰斯顿", "亚伦·保尔", "鲍勃·奥登科克", "迪恩·诺里斯"), "文化", ""),
            es = LocalizedContent("¿Quién interpreta a Walter White en 'Breaking Bad'?", listOf("Bryan Cranston", "Aaron Paul", "Bob Odenkirk", "Dean Norris"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5074, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle série les zombies sont appelés 'Marcheurs' ?", listOf("The Walking Dead", "Z Nation", "Fear the Walking Dead", "Day Zero"), "Culture", ""),
            en = LocalizedContent("In which series are zombies called 'Walkers'?", listOf("The Walking Dead", "Z Nation", "Fear the Walking Dead", "Day Zero"), "Culture", ""),
            zh = LocalizedContent("在哪部系列中，僵尸被称为'行尸'？", listOf("行尸走肉", "僵尸国度", "行尸之惧", "零日"), "文化", ""),
            es = LocalizedContent("¿En qué serie los zombis se llaman 'Caminantes'?", listOf("The Walking Dead", "Z Nation", "Fear the Walking Dead", "Day Zero"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5075, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel personnage de manga est le 'Roi des Pirates' dans son monde ?", listOf("Monkey D. Luffy (One Piece)", "Naruto Uzumaki", "Ichigo Kurosaki (Bleach)", "Goku (Dragon Ball)"), "Culture", ""),
            en = LocalizedContent("Which manga character is the 'King of the Pirates' in his world?", listOf("Monkey D. Luffy (One Piece)", "Naruto Uzumaki", "Ichigo Kurosaki (Bleach)", "Goku (Dragon Ball)"), "Culture", ""),
            zh = LocalizedContent("哪个漫画角色是他世界中的'海贼王'？", listOf("蒙奇·D·路飞（海贼王）", "漩涡鸣人", "黑崎一护（死神）", "孙悟空（龙珠）"), "文化", ""),
            es = LocalizedContent("¿Qué personaje de manga es el 'Rey de los Piratas' en su mundo?", listOf("Monkey D. Luffy (One Piece)", "Naruto Uzumaki", "Ichigo Kurosaki (Bleach)", "Goku (Dragon Ball)"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5076, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu de société met les joueurs à construire des chemins de fer ?", listOf("Les Aventuriers du Rail", "Catan", "Ticket to Ride", "Ce sont les deux noms du même jeu"), "Culture", ""),
            en = LocalizedContent("Which board game has players building railroads?", listOf("Ticket to Ride", "Catan", "Ticket to Ride", "Both are names of the same game"), "Culture", ""),
            zh = LocalizedContent("哪个桌游让玩家建造铁路？", listOf("车票之旅", "卡坦岛", "车票之旅", "两者是同一游戏的两个名称"), "文化", ""),
            es = LocalizedContent("¿Qué juego de mesa hace que los jugadores construyan ferrocarriles?", listOf("Ticket to Ride", "Catan", "Ticket to Ride", "Ambos son nombres del mismo juego"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5077, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel film/série Netflix des enfants enquêtent dans l'Upside Down ?", listOf("Stranger Things", "Dark", "The OA", "Lost in Space"), "Culture", ""),
            en = LocalizedContent("In which Netflix film/series do children investigate in the Upside Down?", listOf("Stranger Things", "Dark", "The OA", "Lost in Space"), "Culture", ""),
            zh = LocalizedContent("在哪部Netflix电影/系列中，孩子们在颠倒世界进行调查？", listOf("怪奇物语", "暗黑", "OA", "迷失太空"), "文化", ""),
            es = LocalizedContent("¿En qué película/serie de Netflix los niños investigan en el Upside Down?", listOf("Stranger Things", "Dark", "The OA", "Lost in Space"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5078, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la console de jeux la plus vendue de l'histoire ?", listOf("PlayStation 2 (~155 millions)", "Nintendo DS", "Game Boy", "PS4"), "Culture", ""),
            en = LocalizedContent("What is the best-selling video game console in history?", listOf("PlayStation 2 (~155 million)", "Nintendo DS", "Game Boy", "PS4"), "Culture", ""),
            zh = LocalizedContent("历史上最畅销的游戏机是什么？", listOf("PlayStation 2（约1.55亿台）", "任天堂DS", "Game Boy", "PS4"), "文化", ""),
            es = LocalizedContent("¿Cuál es la consola de videojuegos más vendida de la historia?", listOf("PlayStation 2 (~155 millones)", "Nintendo DS", "Game Boy", "PS4"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5079, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue Tony Soprano dans 'Les Sopranos' ?", listOf("James Gandolfini", "Ray Liotta", "Joe Pesci", "Robert De Niro"), "Culture", ""),
            en = LocalizedContent("Which actor plays Tony Soprano in 'The Sopranos'?", listOf("James Gandolfini", "Ray Liotta", "Joe Pesci", "Robert De Niro"), "Culture", ""),
            zh = LocalizedContent("哪位演员在《黑道家族》中饰演托尼·索普拉诺？", listOf("詹姆斯·甘多菲尼", "雷·利奥塔", "乔·佩西", "罗伯特·德尼罗"), "文化", ""),
            es = LocalizedContent("¿Qué actor interpreta a Tony Soprano en 'Los Soprano'?", listOf("James Gandolfini", "Ray Liotta", "Joe Pesci", "Robert De Niro"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5080, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dessin animé se déroule dans une ananas sous la mer ?", listOf("Bob l'éponge", "Patrick l'étoile", "Boucan d'enfer", "Cendrillon des mers"), "Culture", ""),
            en = LocalizedContent("Which cartoon takes place in a pineapple under the sea?", listOf("SpongeBob SquarePants", "Patrick Star", "Hell's Kitchen", "Cinderella of the Sea"), "Culture", ""),
            zh = LocalizedContent("哪部动画片的故事发生在一个海底菠萝屋里？", listOf("海绵宝宝", "派大星", "地狱厨房", "海的灰姑娘"), "文化", ""),
            es = LocalizedContent("¿Qué dibujo animado transcurre en una piña bajo el mar?", listOf("Bob Esponja", "Patricio Estrella", "Cocina infernal", "Cenicienta del mar"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5081, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle franchise de jeux a pour personnage principal 'Master Chief' ?", listOf("Halo", "Gears of War", "Call of Duty", "Doom"), "Culture", ""),
            en = LocalizedContent("Which game franchise features 'Master Chief' as the main character?", listOf("Halo", "Gears of War", "Call of Duty", "Doom"), "Culture", ""),
            zh = LocalizedContent("哪个游戏系列的主角是“士官长”？", listOf("光环", "战争机器", "使命召唤", "毁灭战士"), "文化", ""),
            es = LocalizedContent("¿Qué franquicia de videojuegos tiene como personaje principal a 'Master Chief'?", listOf("Halo", "Gears of War", "Call of Duty", "Doom"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5082, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle ville fictive Batman opère-t-il ?", listOf("Gotham City", "Metropolis", "Star City", "Central City"), "Culture", ""),
            en = LocalizedContent("In which fictional city does Batman operate?", listOf("Gotham City", "Metropolis", "Star City", "Central City"), "Culture", ""),
            zh = LocalizedContent("蝙蝠侠在哪个虚构城市活动？", listOf("哥谭市", "大都会", "星城", "中心城"), "文化", ""),
            es = LocalizedContent("¿En qué ciudad ficticia opera Batman?", listOf("Ciudad Gótica", "Metrópolis", "Ciudad Estelar", "Ciudad Central"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5083, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du robot compagnon dans Star Wars (astromec) ?", listOf("R2-D2", "C-3PO", "BB-8", "K-2SO"), "Culture", ""),
            en = LocalizedContent("What is the name of the astromech droid companion in Star Wars?", listOf("R2-D2", "C-3PO", "BB-8", "K-2SO"), "Culture", ""),
            zh = LocalizedContent("《星球大战》中宇航技工机器人伙伴的名字是什么？", listOf("R2-D2", "C-3PO", "BB-8", "K-2SO"), "文化", ""),
            es = LocalizedContent("¿Cuál es el nombre del droide astromecánico compañero en Star Wars?", listOf("R2-D2", "C-3PO", "BB-8", "K-2SO"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5084, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel manga le personnage Goku peut se transformer en 'Super Saiyan' ?", listOf("Dragon Ball Z", "Naruto", "One Piece", "Fullmetal Alchemist"), "Culture", ""),
            en = LocalizedContent("In which manga can the character Goku transform into 'Super Saiyan'?", listOf("Dragon Ball Z", "Naruto", "One Piece", "Fullmetal Alchemist"), "Culture", ""),
            zh = LocalizedContent("在哪部漫画中，角色悟空可以变身成“超级赛亚人”？", listOf("龙珠Z", "火影忍者", "海贼王", "钢之炼金术师"), "文化", ""),
            es = LocalizedContent("¿En qué manga el personaje Goku puede transformarse en 'Super Saiyan'?", listOf("Dragon Ball Z", "Naruto", "One Piece", "Fullmetal Alchemist"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5085, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la Constitution française de la Ve République date de ?", listOf("1958", "1946", "1875", "1870"), "Politique", ""),
            en = LocalizedContent("What year does the French Constitution of the Fifth Republic date from?", listOf("1958", "1946", "1875", "1870"), "Politics", ""),
            zh = LocalizedContent("法国第五共和国宪法是哪一年颁布的？", listOf("1958年", "1946年", "1875年", "1870年"), "政治", ""),
            es = LocalizedContent("¿De qué año data la Constitución francesa de la Quinta República?", listOf("1958", "1946", "1875", "1870"), "Política", "")
        ),
        BilingualQuestion(
            id = 5086, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'habeas corpus garantit ?", listOf("Droit à ne pas être détenu arbitrairement", "Droit à un procès équitable", "Droit au silence", "Droit à un avocat"), "Politique", ""),
            en = LocalizedContent("What does habeas corpus guarantee?", listOf("Right not to be arbitrarily detained", "Right to a fair trial", "Right to remain silent", "Right to a lawyer"), "Politics", ""),
            zh = LocalizedContent("人身保护令保障什么？", listOf("不被任意拘留的权利", "获得公平审判的权利", "保持沉默的权利", "获得律师的权利"), "政治", ""),
            es = LocalizedContent("¿Qué garantiza el habeas corpus?", listOf("Derecho a no ser detenido arbitrariamente", "Derecho a un juicio justo", "Derecho a guardar silencio", "Derecho a un abogado"), "Política", "")
        ),
        BilingualQuestion(
            id = 5087, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la présomption d'innocence ?", listOf("Toute personne est innocente jusqu'à preuve du contraire", "L'accusé doit prouver son innocence", "Le juge décide de la culpabilité dès l'inculpation", "La victime a toujours raison"), "Politique", ""),
            en = LocalizedContent("What is the presumption of innocence?", listOf("Everyone is innocent until proven guilty", "The accused must prove their innocence", "The judge decides guilt from the moment of indictment", "The victim is always right"), "Politics", ""),
            zh = LocalizedContent("什么是无罪推定？", listOf("任何人在被证明有罪之前都是无辜的", "被告必须证明自己无罪", "法官在起诉时就决定有罪", "受害者永远是对的"), "政治", ""),
            es = LocalizedContent("¿Qué es la presunción de inocencia?", listOf("Toda persona es inocente hasta que se demuestre lo contrario", "El acusado debe probar su inocencia", "El juez decide la culpabilidad desde la imputación", "La víctima siempre tiene la razón"), "Política", "")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 5088, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel tribunal français juge les crimes les plus graves ?", listOf("La Cour d'assises", "Le Tribunal correctionnel", "Le Tribunal de grande instance", "Le Conseil d'État"), "Politique", ""),
            en = LocalizedContent("Which French court judges the most serious crimes?", listOf("Cour d'assises", "Correctional court", "High Court", "Council of State"), "Politics", ""),
            zh = LocalizedContent("哪个法国法院审判最严重的罪行？", listOf("重罪法院", "轻罪法院", "大审法院", "最高行政法院"), "政治", ""),
            es = LocalizedContent("¿Qué tribunal francés juzga los crímenes más graves?", listOf("Tribunal de lo Penal", "Tribunal Correccional", "Tribunal de Gran Instancia", "Consejo de Estado"), "Política", "")
        ),
        BilingualQuestion(
            id = 5089, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le droit international humanitaire ?", listOf("Règles limitant les effets des conflits armés", "Droit des immigrés", "Traités de commerce", "Droit diplomatique"), "Politique", ""),
            en = LocalizedContent("What is international humanitarian law?", listOf("Rules limiting the effects of armed conflicts", "Immigration law", "Trade treaties", "Diplomatic law"), "Politics", ""),
            zh = LocalizedContent("什么是国际人道法？", listOf("限制武装冲突影响的规则", "移民法", "贸易条约", "外交法"), "政治", ""),
            es = LocalizedContent("¿Qué es el derecho internacional humanitario?", listOf("Normas que limitan los efectos de los conflictos armados", "Derecho de inmigración", "Tratados comerciales", "Derecho diplomático"), "Política", "")
        ),
        BilingualQuestion(
            id = 5090, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle convention internationale protège les droits de l'enfant ?", listOf("Convention des droits de l'enfant (ONU, 1989)", "Déclaration de Genève (1924)", "Charte sociale européenne", "Traité de Lisbonne"), "Politique", ""),
            en = LocalizedContent("Which international convention protects children's rights?", listOf("Convention on the Rights of the Child (UN, 1989)", "Geneva Declaration (1924)", "European Social Charter", "Treaty of Lisbon"), "Politics", ""),
            zh = LocalizedContent("哪项国际公约保护儿童权利？", listOf("《儿童权利公约》（联合国，1989年）", "《日内瓦宣言》（1924年）", "《欧洲社会宪章》", "《里斯本条约》"), "政治", ""),
            es = LocalizedContent("¿Qué convenio internacional protege los derechos del niño?", listOf("Convención sobre los Derechos del Niño (ONU, 1989)", "Declaración de Ginebra (1924)", "Carta Social Europea", "Tratado de Lisboa"), "Política", "")
        ),
        BilingualQuestion(
            id = 5091, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la CEDH ?", listOf("Cour européenne des droits de l'homme", "Commission européenne des droits humains", "Conseil européen des droits humanitaires", "Chambre européenne de droit humain"), "Politique", ""),
            en = LocalizedContent("What is the ECHR?", listOf("European Court of Human Rights", "European Commission of Human Rights", "European Council of Humanitarian Rights", "European Chamber of Human Rights"), "Politics", ""),
            zh = LocalizedContent("什么是ECHR？", listOf("欧洲人权法院", "欧洲人权委员会", "欧洲人道权利理事会", "欧洲人权法庭"), "政治", ""),
            es = LocalizedContent("¿Qué es el TEDH?", listOf("Tribunal Europeo de Derechos Humanos", "Comisión Europea de Derechos Humanos", "Consejo Europeo de Derechos Humanitarios", "Cámara Europea de Derechos Humanos"), "Política", "")
        ),
        BilingualQuestion(
            id = 5092, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un contrat en droit civil ?", listOf("Accord de volontés créant des obligations", "Document notarié obligatoire", "Promesse unilatérale", "Acte d'État"), "Politique", ""),
            en = LocalizedContent("What is a contract in civil law?", listOf("Agreement of wills creating obligations", "Mandatory notarized document", "Unilateral promise", "State act"), "Politics", ""),
            zh = LocalizedContent("民法中的合同是什么？", listOf("产生义务的意思表示一致", "强制性公证文件", "单方承诺", "国家行为"), "政治", ""),
            es = LocalizedContent("¿Qué es un contrato en derecho civil?", listOf("Acuerdo de voluntades que crea obligaciones", "Documento notarial obligatorio", "Promesa unilateral", "Acto del Estado"), "Política", "")
        ),
        BilingualQuestion(
            id = 5093, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de proportionnalité en droit ?", listOf("Les mesures prises doivent être adaptées à l'objectif poursuivi", "Chaque infraction a une peine fixe", "Toutes les parties ont les mêmes droits", "La loi s'applique également à tous"), "Politique", ""),
            en = LocalizedContent("What is the principle of proportionality in law?", listOf("Measures taken must be adapted to the objective pursued", "Each offense has a fixed penalty", "All parties have the same rights", "The law applies equally to all"), "Politics", ""),
            zh = LocalizedContent("法律中的比例原则是什么？", listOf("采取的措施必须与追求的目标相适应", "每项罪行都有固定刑罚", "所有当事方享有同等权利", "法律平等适用于所有人"), "政治", ""),
            es = LocalizedContent("¿Cuál es el principio de proporcionalidad en derecho?", listOf("Las medidas adoptadas deben ser adecuadas al objetivo perseguido", "Cada infracción tiene una pena fija", "Todas las partes tienen los mismos derechos", "La ley se aplica por igual a todos"), "Política", "")
        ),
        BilingualQuestion(
            id = 5094, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la force majeure en droit des contrats ?", listOf("Événement imprévisible, irrésistible et extérieur exonérant de responsabilité", "Clause de résiliation", "Garantie contractuelle", "Force exécutoire d'un jugement"), "Politique", ""),
            en = LocalizedContent("What is force majeure in contract law?", listOf("Unforeseeable, irresistible, and external event exempting from liability", "Termination clause", "Contractual guarantee", "Enforceable force of a judgment"), "Politics", ""),
            zh = LocalizedContent("合同法中的不可抗力是什么？", listOf("不可预见、不可抗拒且外部的免责事件", "终止条款", "合同担保", "判决的强制执行效力"), "政治", ""),
            es = LocalizedContent("¿Qué es la fuerza mayor en derecho contractual?", listOf("Evento imprevisible, irresistible y externo que exime de responsabilidad", "Cláusula de rescisión", "Garantía contractual", "Fuerza ejecutiva de una sentencia"), "Política", "")
        ),
        BilingualQuestion(
            id = 5095, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le premier vaccin créé dans l'histoire ?", listOf("Vaccin contre la variole (Edward Jenner, 1796)", "Vaccin contre la rage (Pasteur, 1885)", "Vaccin contre la polio (Salk, 1955)", "Vaccin contre la tuberculose (BCG, 1921)"), "Science", ""),
            en = LocalizedContent("What was the first vaccine created in history?", listOf("Smallpox vaccine (Edward Jenner, 1796)", "Rabies vaccine (Pasteur, 1885)", "Polio vaccine (Salk, 1955)", "Tuberculosis vaccine (BCG, 1921)"), "Science", ""),
            zh = LocalizedContent("历史上第一种疫苗是什么？", listOf("天花疫苗（爱德华·詹纳，1796年）", "狂犬病疫苗（巴斯德，1885年）", "脊髓灰质炎疫苗（索尔克，1955年）", "结核病疫苗（卡介苗，1921年）"), "科学", ""),
            es = LocalizedContent("¿Cuál fue la primera vacuna creada en la historia?", listOf("Vacuna contra la viruela (Edward Jenner, 1796)", "Vacuna contra la rabia (Pasteur, 1885)", "Vacuna contra la polio (Salk, 1955)", "Vacuna contra la tuberculosis (BCG, 1921)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5096, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'antibiothérapie ?", listOf("Traitement par antibiotiques contre infections bactériennes", "Traitement antiviral", "Traitement antifongique", "Immunothérapie"), "Science", ""),
            en = LocalizedContent("What is antibiotic therapy?", listOf("Treatment with antibiotics against bacterial infections", "Antiviral treatment", "Antifungal treatment", "Immunotherapy"), "Science", ""),
            zh = LocalizedContent("什么是抗生素疗法？", listOf("使用抗生素治疗细菌感染", "抗病毒治疗", "抗真菌治疗", "免疫疗法"), "科学", ""),
            es = LocalizedContent("¿Qué es la antibioticoterapia?", listOf("Tratamiento con antibióticos contra infecciones bacterianas", "Tratamiento antiviral", "Tratamiento antifúngico", "Inmunoterapia"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5097, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le groupe sanguin universel donneur ?", listOf("O négatif", "AB positif", "A positif", "O positif"), "Science", ""),
            en = LocalizedContent("What is the universal donor blood type?", listOf("O negative", "AB positive", "A positive", "O positive"), "Science", ""),
            zh = LocalizedContent("哪种血型是万能供血者？", listOf("O型阴性", "AB型阳性", "A型阳性", "O型阳性"), "科学", ""),
            es = LocalizedContent("¿Cuál es el grupo sanguíneo donante universal?", listOf("O negativo", "AB positivo", "A positivo", "O positivo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5098, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une maladie auto-immune ?", listOf("Système immunitaire attaquant ses propres tissus", "Allergie grave", "Maladie infectieuse chronique", "Carence en vitamines"), "Science", ""),
            en = LocalizedContent("What is an autoimmune disease?", listOf("Immune system attacking its own tissues", "Severe allergy", "Chronic infectious disease", "Vitamin deficiency"), "Science", ""),
            zh = LocalizedContent("什么是自身免疫性疾病？", listOf("免疫系统攻击自身组织", "严重过敏", "慢性传染病", "维生素缺乏"), "科学", ""),
            es = LocalizedContent("¿Qué es una enfermedad autoinmune?", listOf("El sistema inmunitario ataca sus propios tejidos", "Alergia grave", "Enfermedad infecciosa crónica", "Deficiencia vitamínica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5100, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'IRM mesure dans le cerveau ?", listOf("Activité et structure cérébrale via champ magnétique", "Activité électrique du cerveau", "Pression intracrânienne", "Débit sanguin uniquement"), "Science", ""),
            en = LocalizedContent("What does MRI measure in the brain?", listOf("Brain activity and structure via magnetic field", "Electrical activity of the brain", "Intracranial pressure", "Blood flow only"), "Science", ""),
            zh = LocalizedContent("MRI在大脑中测量什么？", listOf("通过磁场测量大脑活动和结构", "大脑电活动", "颅内压", "仅血流量"), "科学", ""),
            es = LocalizedContent("¿Qué mide la resonancia magnética en el cerebro?", listOf("Actividad y estructura cerebral mediante campo magnético", "Actividad eléctrica del cerebro", "Presión intracraneal", "Solo flujo sanguíneo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5101, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le diabète de type 2 ?", listOf("Résistance à l'insuline causant hyperglycémie chronique", "Absence totale d'insuline", "Allergie au glucose", "Maladie infectieuse du pancréas"), "Science", ""),
            en = LocalizedContent("What is type 2 diabetes?", listOf("Insulin resistance causing chronic hyperglycemia", "Total lack of insulin", "Glucose allergy", "Infectious disease of the pancreas"), "Science", ""),
            zh = LocalizedContent("什么是2型糖尿病？", listOf("胰岛素抵抗导致慢性高血糖", "完全缺乏胰岛素", "葡萄糖过敏", "胰腺传染病"), "科学", ""),
            es = LocalizedContent("¿Qué es la diabetes tipo 2?", listOf("Resistencia a la insulina que causa hiperglucemia crónica", "Ausencia total de insulina", "Alergia a la glucosa", "Enfermedad infecciosa del páncreas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5102, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le principal facteur de risque du cancer du poumon ?", listOf("Le tabagisme", "La pollution atmosphérique", "L'amiante", "La génétique"), "Science", ""),
            en = LocalizedContent("What is the main risk factor for lung cancer?", listOf("Smoking", "Air pollution", "Asbestos", "Genetics"), "Science", ""),
            zh = LocalizedContent("肺癌的主要风险因素是什么？", listOf("吸烟", "空气污染", "石棉", "遗传"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principal factor de riesgo del cáncer de pulmón?", listOf("El tabaquismo", "La contaminación atmosférica", "El amianto", "La genética"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5103, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la tension artérielle normale ?", listOf("Environ 120/80 mmHg", "150/90 mmHg", "100/60 mmHg", "180/100 mmHg"), "Science", ""),
            en = LocalizedContent("What is normal blood pressure?", listOf("Around 120/80 mmHg", "150/90 mmHg", "100/60 mmHg", "180/100 mmHg"), "Science", ""),
            zh = LocalizedContent("正常血压是多少？", listOf("约120/80 mmHg", "150/90 mmHg", "100/60 mmHg", "180/100 mmHg"), "科学", ""),
            es = LocalizedContent("¿Cuál es la tensión arterial normal?", listOf("Alrededor de 120/80 mmHg", "150/90 mmHg", "100/60 mmHg", "180/100 mmHg"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5104, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la thérapie génique ?", listOf("Introduction de gènes pour traiter des maladies", "Clonage humain", "Greffe d'organes génétiquement modifiés", "Vaccination génétique"), "Science", ""),
            en = LocalizedContent("What is gene therapy?", listOf("Introduction of genes to treat diseases", "Human cloning", "Transplant of genetically modified organs", "Genetic vaccination"), "Science", ""),
            zh = LocalizedContent("什么是基因治疗？", listOf("引入基因以治疗疾病", "人类克隆", "基因改造器官移植", "基因疫苗接种"), "科学", ""),
            es = LocalizedContent("¿Qué es la terapia génica?", listOf("Introducción de genes para tratar enfermedades", "Clonación humana", "Trasplante de órganos genéticamente modificados", "Vacunación genética"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5105, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le traitement principal de l'infarctus du myocarde ?", listOf("Désobstruction rapide de l'artère coronaire", "Traitement médicamenteux seul", "Repos strict au lit", "Chirurgie à cœur ouvert uniquement"), "Science", ""),
            en = LocalizedContent("What is the main treatment for myocardial infarction?", listOf("Rapid unblocking of the coronary artery", "Medication alone", "Strict bed rest", "Open heart surgery only"), "Science", ""),
            zh = LocalizedContent("心肌梗死的主要治疗方法是什么？", listOf("快速疏通冠状动脉", "仅药物治疗", "严格卧床休息", "仅开胸手术"), "科学", ""),
            es = LocalizedContent("¿Cuál es el tratamiento principal del infarto de miocardio?", listOf("Desobstrucción rápida de la arteria coronaria", "Tratamiento farmacológico solo", "Reposo estricto en cama", "Cirugía a corazón abierto únicamente"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5106, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la maladie d'Alzheimer affecte en premier ?", listOf("La mémoire récente (hippocampe)", "La motricité", "La vision", "Le langage"), "Science", ""),
            en = LocalizedContent("What does Alzheimer's disease affect first?", listOf("Recent memory (hippocampus)", "Motor skills", "Vision", "Language"), "Science", ""),
            zh = LocalizedContent("阿尔茨海默病首先影响什么？", listOf("近期记忆（海马体）", "运动技能", "视力", "语言"), "科学", ""),
            es = LocalizedContent("¿Qué afecta primero la enfermedad de Alzheimer?", listOf("La memoria reciente (hipocampo)", "La motricidad", "La visión", "El lenguaje"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5107, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le syndrome de Down (trisomie 21) ?", listOf("Présence d'un chromosome 21 supplémentaire", "Mutation du chromosome X", "Absence d'un chromosome", "Délétion chromosomique"), "Science", ""),
            en = LocalizedContent("What is Down syndrome (trisomy 21)?", listOf("Presence of an extra chromosome 21", "Mutation of the X chromosome", "Absence of a chromosome", "Chromosomal deletion"), "Science", ""),
            zh = LocalizedContent("什么是唐氏综合征（21三体）？", listOf("存在额外的21号染色体", "X染色体突变", "缺少一条染色体", "染色体缺失"), "科学", ""),
            es = LocalizedContent("¿Qué es el síndrome de Down (trisomía 21)?", listOf("Presencia de un cromosoma 21 adicional", "Mutación del cromosoma X", "Ausencia de un cromosoma", "Deleción cromosómica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5108, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle des globules rouges ?", listOf("Transporter l'oxygène grâce à l'hémoglobine", "Défendre contre les infections", "Coaguler le sang", "Produire des anticorps"), "Science", ""),
            en = LocalizedContent("What is the role of red blood cells?", listOf("Transport oxygen via hemoglobin", "Defend against infections", "Clot blood", "Produce antibodies"), "Science", ""),
            zh = LocalizedContent("红细胞的作用是什么？", listOf("通过血红蛋白运输氧气", "防御感染", "凝血", "产生抗体"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel de los glóbulos rojos?", listOf("Transportar oxígeno gracias a la hemoglobina", "Defender contra infecciones", "Coagular la sangre", "Producir anticuerpos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5109, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la pneumonie ?", listOf("Infection pulmonaire causant inflammation des alvéoles", "Maladie cardiaque", "Infection des sinus", "Bronchite chronique"), "Science", ""),
            en = LocalizedContent("What is pneumonia?", listOf("Lung infection causing inflammation of the alveoli", "Heart disease", "Sinus infection", "Chronic bronchitis"), "Science", ""),
            zh = LocalizedContent("什么是肺炎？", listOf("肺部感染导致肺泡发炎", "心脏病", "鼻窦感染", "慢性支气管炎"), "科学", ""),
            es = LocalizedContent("¿Qué es la neumonía?", listOf("Infección pulmonar que causa inflamación de los alvéolos", "Enfermedad cardíaca", "Infección de los senos paranasales", "Bronquitis crónica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5110, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel style architectural est construite la Tour Eiffel ?", listOf("Structure en fer forgé (style industriel 1889)", "Art nouveau", "Néo-gothique", "Baroque"), "Culture", ""),
            en = LocalizedContent("In which architectural style is the Eiffel Tower built?", listOf("Wrought iron structure (industrial style 1889)", "Art Nouveau", "Neo-Gothic", "Baroque"), "Culture", ""),
            zh = LocalizedContent("埃菲尔铁塔采用哪种建筑风格建造？", listOf("锻铁结构（1889年工业风格）", "新艺术运动", "新哥特式", "巴洛克"), "文化", ""),
            es = LocalizedContent("¿En qué estilo arquitectónico está construida la Torre Eiffel?", listOf("Estructura de hierro forjado (estilo industrial 1889)", "Art Nouveau", "Neogótico", "Barroco"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5111, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a conçu le Colisée de Rome ?", listOf("Architectes romains sous Vespasien (69-79 ap. J.-C.)", "Michel-Ange", "Léonard de Vinci", "Jules César"), "Culture", ""),
            en = LocalizedContent("Who designed the Colosseum in Rome?", listOf("Roman architects under Vespasian (69-79 AD)", "Michelangelo", "Leonardo da Vinci", "Julius Caesar"), "Culture", ""),
            zh = LocalizedContent("谁设计了罗马斗兽场？", listOf("韦斯帕芗统治下的罗马建筑师（公元69-79年）", "米开朗基罗", "列奥纳多·达·芬奇", "尤利乌斯·凯撒"), "文化", ""),
            es = LocalizedContent("¿Quién diseñó el Coliseo de Roma?", listOf("Arquitectos romanos bajo Vespasiano (69-79 d.C.)", "Miguel Ángel", "Leonardo da Vinci", "Julio César"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5112, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le Baroque en architecture ?", listOf("Style ornemental 17e-18e siècle avec mouvement et exubérance", "Style épuré et rationnel", "Style gothique tardif", "Style néoclassique"), "Culture", ""),
            en = LocalizedContent("What is Baroque in architecture?", listOf("Ornamental style 17th-18th century with movement and exuberance", "Sleek and rational style", "Late Gothic style", "Neoclassical style"), "Culture", ""),
            zh = LocalizedContent("建筑中的巴洛克风格是什么？", listOf("17-18世纪装饰性风格，充满动感和奢华", "简洁理性的风格", "晚期哥特式风格", "新古典主义风格"), "文化", ""),
            es = LocalizedContent("¿Qué es el Barroco en arquitectura?", listOf("Estilo ornamental de los siglos XVII-XVIII con movimiento y exuberancia", "Estilo elegante y racional", "Estilo gótico tardío", "Estilo neoclásico"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a conçu la Sagrada Familia à Barcelone ?", listOf("Antoni Gaudí", "Santiago Calatrava", "Oscar Niemeyer", "Renzo Piano"), "Culture", ""),
            en = LocalizedContent("Who designed the Sagrada Familia in Barcelona?", listOf("Antoni Gaudí", "Santiago Calatrava", "Oscar Niemeyer", "Renzo Piano"), "Culture", ""),
            zh = LocalizedContent("谁设计了巴塞罗那的圣家堂？", listOf("安东尼·高迪", "圣地亚哥·卡拉特拉瓦", "奥斯卡·尼迈耶", "伦佐·皮亚诺"), "文化", ""),
            es = LocalizedContent("¿Quién diseñó la Sagrada Familia en Barcelona?", listOf("Antoni Gaudí", "Santiago Calatrava", "Oscar Niemeyer", "Renzo Piano"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5114, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le Parthénon ?", listOf("Temple grec sur l'Acropole d'Athènes dédié à Athéna", "Palais royal de l'Empire romain", "Sénat de la République romaine", "Bibliothèque d'Alexandrie"), "Culture", ""),
            en = LocalizedContent("What is the Parthenon?", listOf("Greek temple on the Acropolis of Athens dedicated to Athena", "Royal palace of the Roman Empire", "Senate of the Roman Republic", "Library of Alexandria"), "Culture", ""),
            zh = LocalizedContent("什么是帕特农神庙？", listOf("雅典卫城上供奉雅典娜的希腊神庙", "罗马帝国的皇宫", "罗马共和国的元老院", "亚历山大图书馆"), "文化", ""),
            es = LocalizedContent("¿Qué es el Partenón?", listOf("Templo griego en la Acrópolis de Atenas dedicado a Atenea", "Palacio real del Imperio Romano", "Senado de la República Romana", "Biblioteca de Alejandría"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5115, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la particularité du style gothique en architecture ?", listOf("Arc brisé, voûtes en ogive et vitraux colorés", "Colonnes corinthiennes et toits plats", "Coupoles dorées et minarets", "Bois et paille traditionnels"), "Culture", ""),
            en = LocalizedContent("What is the characteristic of Gothic style in architecture?", listOf("Pointed arch, ribbed vaults and stained glass windows", "Corinthian columns and flat roofs", "Golden domes and minarets", "Traditional wood and thatch"), "Culture", ""),
            zh = LocalizedContent("哥特式建筑风格的特点是什么？", listOf("尖拱、肋拱顶和彩色玻璃窗", "科林斯柱和平顶", "金色穹顶和宣礼塔", "传统木材和茅草"), "文化", ""),
            es = LocalizedContent("¿Cuál es la característica del estilo gótico en arquitectura?", listOf("Arco apuntado, bóvedas de crucería y vidrieras de colores", "Columnas corintias y techos planos", "Cúpulas doradas y minaretes", "Madera y paja tradicionales"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5116, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a conçu le musée du Louvre (sa pyramide) ?", listOf("Ieoh Ming Pei (I.M. Pei)", "Renzo Piano", "Richard Rogers", "Jean Nouvel"), "Culture", ""),
            en = LocalizedContent("Who designed the Louvre Museum (its pyramid)?", listOf("Ieoh Ming Pei (I.M. Pei)", "Renzo Piano", "Richard Rogers", "Jean Nouvel"), "Culture", ""),
            zh = LocalizedContent("谁设计了卢浮宫（其金字塔）？", listOf("贝聿铭", "伦佐·皮亚诺", "理查德·罗杰斯", "让·努维尔"), "文化", ""),
            es = LocalizedContent("¿Quién diseñó el Museo del Louvre (su pirámide)?", listOf("Ieoh Ming Pei (I.M. Pei)", "Renzo Piano", "Richard Rogers", "Jean Nouvel"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5117, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'architecture Art Déco ?", listOf("Style des années 1920-30 avec formes géométriques et luxe", "Style médiéval", "Style industriel", "Style minimaliste"), "Culture", ""),
            en = LocalizedContent("What is Art Deco architecture?", listOf("Style of the 1920s-30s with geometric forms and luxury", "Medieval style", "Industrial style", "Minimalist style"), "Culture", ""),
            zh = LocalizedContent("什么是装饰艺术建筑？", listOf("1920-30年代风格，几何形状和奢华", "中世纪风格", "工业风格", "极简主义风格"), "文化", ""),
            es = LocalizedContent("¿Qué es la arquitectura Art Déco?", listOf("Estilo de las décadas de 1920-30 con formas geométricas y lujo", "Estilo medieval", "Estilo industrial", "Estilo minimalista"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5118, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel bâtiment est le plus grand du monde par superficie de plancher ?", listOf("Le Pentagone ou le Palais du Parlement roumain", "Tour Burj Khalifa", "Empire State Building", "Grande Pyramide de Gizeh"), "Culture", ""),
            en = LocalizedContent("Which building is the largest in the world by floor area?", listOf("The Pentagon or the Romanian Parliament Palace", "Burj Khalifa", "Empire State Building", "Great Pyramid of Giza"), "Culture", ""),
            zh = LocalizedContent("按建筑面积计算，世界上最大的建筑是哪个？", listOf("五角大楼或罗马尼亚议会宫", "哈利法塔", "帝国大厦", "吉萨大金字塔"), "文化", ""),
            es = LocalizedContent("¿Qué edificio es el más grande del mundo por superficie de suelo?", listOf("El Pentágono o el Palacio del Parlamento rumano", "Torre Burj Khalifa", "Empire State Building", "Gran Pirámide de Guiza"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5119, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le Bauhaus ?", listOf("École d'art et de design allemande (1919-1933)", "Style architectural français", "Mouvement artistique américain", "Courant pictural russe"), "Culture", ""),
            en = LocalizedContent("What is the Bauhaus?", listOf("German art and design school (1919-1933)", "French architectural style", "American artistic movement", "Russian pictorial movement"), "Culture", ""),
            zh = LocalizedContent("什么是包豪斯？", listOf("德国艺术与设计学校（1919-1933）", "法国建筑风格", "美国艺术运动", "俄罗斯绘画运动"), "文化", ""),
            es = LocalizedContent("¿Qué es la Bauhaus?", listOf("Escuela alemana de arte y diseño (1919-1933)", "Estilo arquitectónico francés", "Movimiento artístico estadounidense", "Corriente pictórica rusa"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5120, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la plus grande entreprise du monde par capitalisation boursière en 2024 ?", listOf("Microsoft ou Apple (selon les jours)", "Amazon", "Tesla", "Alphabet (Google)"), "Économie", ""),
            en = LocalizedContent("What is the largest company in the world by market capitalization in 2024?", listOf("Microsoft or Apple (depending on the day)", "Amazon", "Tesla", "Alphabet (Google)"), "Economy", ""),
            zh = LocalizedContent("2024年全球市值最大的公司是哪家？", listOf("微软或苹果（视当天情况而定）", "亚马逊", "特斯拉", "Alphabet（谷歌）"), "经济", ""),
            es = LocalizedContent("¿Cuál es la empresa más grande del mundo por capitalización bursátil en 2024?", listOf("Microsoft o Apple (según el día)", "Amazon", "Tesla", "Alphabet (Google)"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5121, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé Amazon ?", listOf("Jeff Bezos (1994)", "Elon Musk", "Mark Zuckerberg", "Bill Gates"), "Économie", ""),
            en = LocalizedContent("Who founded Amazon?", listOf("Jeff Bezos (1994)", "Elon Musk", "Mark Zuckerberg", "Bill Gates"), "Economy", ""),
            zh = LocalizedContent("谁创立了亚马逊？", listOf("杰夫·贝佐斯（1994年）", "埃隆·马斯克", "马克·扎克伯格", "比尔·盖茨"), "经济", ""),
            es = LocalizedContent("¿Quién fundó Amazon?", listOf("Jeff Bezos (1994)", "Elon Musk", "Mark Zuckerberg", "Bill Gates"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a le plus grand nombre de milliardaires ?", listOf("États-Unis", "Chine", "Inde", "Russie"), "Économie", ""),
            en = LocalizedContent("Which country has the largest number of billionaires?", listOf("United States", "China", "India", "Russia"), "Economy", ""),
            zh = LocalizedContent("哪个国家的亿万富翁数量最多？", listOf("美国", "中国", "印度", "俄罗斯"), "经济", ""),
            es = LocalizedContent("¿Qué país tiene el mayor número de multimillonarios?", listOf("Estados Unidos", "China", "India", "Rusia"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5123, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la valeur du Bitcoin lors de son introduction initiale ?", listOf("Moins de 1 centime (2009)", "1 dollar", "100 dollars", "1000 dollars"), "Économie", ""),
            en = LocalizedContent("What was the value of Bitcoin at its initial introduction?", listOf("Less than 1 cent (2009)", "1 dollar", "100 dollars", "1000 dollars"), "Economy", ""),
            zh = LocalizedContent("比特币最初推出时的价值是多少？", listOf("不到1美分（2009年）", "1美元", "100美元", "1000美元"), "经济", ""),
            es = LocalizedContent("¿Cuál fue el valor de Bitcoin en su introducción inicial?", listOf("Menos de 1 centavo (2009)", "1 dólar", "100 dólares", "1000 dólares"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5124, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a fondé Tesla Motors ?", listOf("Elon Musk, Martin Eberhard et Marc Tarpenning", "Elon Musk seul", "Nikola Tesla (posthume)", "Henry Ford"), "Économie", ""),
            en = LocalizedContent("Who founded Tesla Motors?", listOf("Elon Musk, Martin Eberhard and Marc Tarpenning", "Elon Musk alone", "Nikola Tesla (posthumously)", "Henry Ford"), "Economy", ""),
            zh = LocalizedContent("谁创立了特斯拉汽车？", listOf("埃隆·马斯克、马丁·艾伯哈德和马克·塔彭宁", "仅埃隆·马斯克", "尼古拉·特斯拉（追授）", "亨利·福特"), "经济", ""),
            es = LocalizedContent("¿Quién fundó Tesla Motors?", listOf("Elon Musk, Martin Eberhard y Marc Tarpenning", "Solo Elon Musk", "Nikola Tesla (póstumamente)", "Henry Ford"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5125, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le CAC 40 ?", listOf("Indice des 40 plus grandes capitalisations boursières françaises", "Cotation annuelle des 40 meilleures entreprises mondiales", "Chambre de commerce française", "Indice européen"), "Économie", ""),
            en = LocalizedContent("What is the CAC 40?", listOf("Index of the 40 largest French stock market capitalizations", "Annual listing of the 40 best global companies", "French Chamber of Commerce", "European index"), "Economy", ""),
            zh = LocalizedContent("什么是CAC 40？", listOf("法国40家最大市值公司指数", "全球40家最佳公司年度榜单", "法国商会", "欧洲指数"), "经济", ""),
            es = LocalizedContent("¿Qué es el CAC 40?", listOf("Índice de las 40 mayores capitalizaciones bursátiles francesas", "Cotización anual de las 40 mejores empresas mundiales", "Cámara de Comercio francesa", "Índice europeo"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5127, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle entreprise produit les puces M1/M2 ?", listOf("Apple", "Intel", "AMD", "Qualcomm"), "Économie", ""),
            en = LocalizedContent("Which company produces the M1/M2 chips?", listOf("Apple", "Intel", "AMD", "Qualcomm"), "Economy", ""),
            zh = LocalizedContent("哪家公司生产M1/M2芯片？", listOf("苹果", "英特尔", "AMD", "高通"), "经济", ""),
            es = LocalizedContent("¿Qué empresa produce los chips M1/M2?", listOf("Apple", "Intel", "AMD", "Qualcomm"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le GAFA ?", listOf("Google, Apple, Facebook (Meta), Amazon", "Google, Alibaba, Facebook, Airbnb", "Microsoft, Apple, Facebook, Amazon", "Google, Apple, Foxconn, Alibaba"), "Économie", ""),
            en = LocalizedContent("What is GAFA?", listOf("Google, Apple, Facebook (Meta), Amazon", "Google, Alibaba, Facebook, Airbnb", "Microsoft, Apple, Facebook, Amazon", "Google, Apple, Foxconn, Alibaba"), "Economy", ""),
            zh = LocalizedContent("什么是GAFA？", listOf("谷歌、苹果、脸书（Meta）、亚马逊", "谷歌、阿里巴巴、脸书、爱彼迎", "微软、苹果、脸书、亚马逊", "谷歌、苹果、富士康、阿里巴巴"), "经济", ""),
            es = LocalizedContent("¿Qué es GAFA?", listOf("Google, Apple, Facebook (Meta), Amazon", "Google, Alibaba, Facebook, Airbnb", "Microsoft, Apple, Facebook, Amazon", "Google, Apple, Foxconn, Alibaba"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5129, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le principe du 'lean management' ?", listOf("Élimination des gaspillages pour maximiser la valeur", "Management hiérarchique strict", "Production en masse", "Externalisation maximale"), "Économie", ""),
            en = LocalizedContent("What is the principle of 'lean management'?", listOf("Elimination of waste to maximize value", "Strict hierarchical management", "Mass production", "Maximum outsourcing"), "Economy", ""),
            zh = LocalizedContent("“精益管理”的原则是什么？", listOf("消除浪费以最大化价值", "严格的层级管理", "大规模生产", "最大程度外包"), "经济", ""),
            es = LocalizedContent("¿Cuál es el principio del 'lean management'?", listOf("Eliminación de desperdicios para maximizar el valor", "Gestión jerárquica estricta", "Producción en masa", "Externalización máxima"), "Economía", "")
        ),
        BilingualQuestion(
            id = 5130, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la langue la plus parlée dans le monde (locuteurs natifs) ?", listOf("Mandarin chinois (~920 millions)", "Espagnol", "Anglais", "Hindi"), "Culture", ""),
            en = LocalizedContent("What is the most spoken language in the world (native speakers)?", listOf("Mandarin Chinese (~920 million)", "Spanish", "English", "Hindi"), "Culture", ""),
            zh = LocalizedContent("世界上使用人数最多的语言（母语者）是什么？", listOf("汉语普通话（约9.2亿）", "西班牙语", "英语", "印地语"), "文化", ""),
            es = LocalizedContent("¿Cuál es el idioma más hablado del mundo (hablantes nativos)?", listOf("Chino mandarín (~920 millones)", "Español", "Inglés", "Hindi"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5131, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de langues officielles l'ONU a-t-elle ?", listOf("6 (arabe, chinois, anglais, français, russe, espagnol)", "4", "5", "7"), "Culture", ""),
            en = LocalizedContent("How many official languages does the UN have?", listOf("6 (Arabic, Chinese, English, French, Russian, Spanish)", "4", "5", "7"), "Culture", ""),
            zh = LocalizedContent("联合国有多少种官方语言？", listOf("6种（阿拉伯语、汉语、英语、法语、俄语、西班牙语）", "4种", "5种", "7种"), "文化", ""),
            es = LocalizedContent("¿Cuántos idiomas oficiales tiene la ONU?", listOf("6 (árabe, chino, inglés, francés, ruso, español)", "4", "5", "7"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5132, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une langue morte ?", listOf("Langue qui n'a plus de locuteurs natifs vivants", "Langue ancienne non déchiffrée", "Langue régionale menacée", "Langue artificielle"), "Culture", ""),
            en = LocalizedContent("What is a dead language?", listOf("A language with no living native speakers", "An ancient undeciphered language", "An endangered regional language", "An artificial language"), "Culture", ""),
            zh = LocalizedContent("什么是死语言？", listOf("没有活着的母语者的语言", "未被破译的古代语言", "濒危的区域语言", "人工语言"), "文化", ""),
            es = LocalizedContent("¿Qué es una lengua muerta?", listOf("Lengua que no tiene hablantes nativos vivos", "Lengua antigua no descifrada", "Lengua regional amenazada", "Lengua artificial"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5133, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le pays avec le plus de langues officielles ?", listOf("Zimbabwe (16 langues officielles)", "Inde (22 langues officielles)", "Suisse (4 langues)", "Afrique du Sud (11 langues)"), "Culture", ""),
            en = LocalizedContent("Which country has the most official languages?", listOf("Zimbabwe (16 official languages)", "India (22 official languages)", "Switzerland (4 languages)", "South Africa (11 languages)"), "Culture", ""),
            zh = LocalizedContent("哪个国家的官方语言最多？", listOf("津巴布韦（16种官方语言）", "印度（22种官方语言）", "瑞士（4种语言）", "南非（11种语言）"), "文化", ""),
            es = LocalizedContent("¿Qué país tiene más idiomas oficiales?", listOf("Zimbabue (16 idiomas oficiales)", "India (22 idiomas oficiales)", "Suiza (4 idiomas)", "Sudáfrica (11 idiomas)"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5134, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'espéranto ?", listOf("Langue construite internationale créée en 1887 par Zamenhof", "Langue romane disparue", "Dialecte ibérique", "Langue artificielle militaire"), "Culture", ""),
            en = LocalizedContent("What is Esperanto?", listOf("An international constructed language created in 1887 by Zamenhof", "A disappeared Romance language", "An Iberian dialect", "A military artificial language"), "Culture", ""),
            zh = LocalizedContent("什么是世界语？", listOf("由柴门霍夫于1887年创造的国际人造语言", "一种已消失的罗曼语", "一种伊比利亚方言", "一种军事人造语言"), "文化", ""),
            es = LocalizedContent("¿Qué es el esperanto?", listOf("Lengua construida internacional creada en 1887 por Zamenhof", "Lengua romance desaparecida", "Dialecto ibérico", "Lengua artificial militar"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5135, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le script le plus utilisé dans le monde ?", listOf("L'écriture latine", "L'écriture arabe", "L'écriture cyrillique", "Les idéogrammes chinois"), "Culture", ""),
            en = LocalizedContent("What is the most widely used script in the world?", listOf("Latin script", "Arabic script", "Cyrillic script", "Chinese characters"), "Culture", ""),
            zh = LocalizedContent("世界上使用最广泛的文字是什么？", listOf("拉丁字母", "阿拉伯字母", "西里尔字母", "汉字"), "文化", ""),
            es = LocalizedContent("¿Cuál es la escritura más utilizada en el mundo?", listOf("Escritura latina", "Escritura árabe", "Escritura cirílica", "Ideogramas chinos"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5136, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une langue agglutinante ?", listOf("Langue formant des mots par ajout de suffixes/préfixes fonctionnels", "Langue sans flexion", "Langue à tons", "Langue isolante"), "Culture", ""),
            en = LocalizedContent("What is an agglutinative language?", listOf("A language forming words by adding functional suffixes/prefixes", "A language without inflection", "A tonal language", "An isolating language"), "Culture", ""),
            zh = LocalizedContent("什么是黏着语？", listOf("通过添加功能性后缀/前缀构成词的语言", "没有屈折变化的语言", "声调语言", "孤立语"), "文化", ""),
            es = LocalizedContent("¿Qué es una lengua aglutinante?", listOf("Lengua que forma palabras añadiendo sufijos/prefijos funcionales", "Lengua sin flexión", "Lengua tonal", "Lengua aislante"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5137, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays parle-t-on swahili comme langue principale ?", listOf("Tanzanie, Kenya, Ouganda (langue véhiculaire)", "Seulement la Tanzanie", "Seulement le Kenya", "Mozambique"), "Culture", ""),
            en = LocalizedContent("In which country is Swahili spoken as a main language?", listOf("Tanzania, Kenya, Uganda (lingua franca)", "Only Tanzania", "Only Kenya", "Mozambique"), "Culture", ""),
            zh = LocalizedContent("哪个国家以斯瓦希里语为主要语言？", listOf("坦桑尼亚、肯尼亚、乌干达（通用语）", "仅坦桑尼亚", "仅肯尼亚", "莫桑比克"), "文化", ""),
            es = LocalizedContent("¿En qué país se habla suajili como lengua principal?", listOf("Tanzania, Kenia, Uganda (lengua vehicular)", "Solo Tanzania", "Solo Kenia", "Mozambique"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5138, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la glottophobie ?", listOf("Discrimination basée sur la façon de parler ou l'accent", "Peur des langues étrangères", "Mutisme sélectif", "Bégaiement social"), "Culture", ""),
            en = LocalizedContent("What is glottophobia?", listOf("Discrimination based on the way of speaking or accent", "Fear of foreign languages", "Selective mutism", "Social stuttering"), "Culture", ""),
            zh = LocalizedContent("什么是语言恐惧症？", listOf("基于说话方式或口音的歧视", "对外语的恐惧", "选择性缄默症", "社交口吃"), "文化", ""),
            es = LocalizedContent("¿Qué es la glotofobia?", listOf("Discriminación basada en la forma de hablar o el acento", "Miedo a las lenguas extranjeras", "Mutismo selectivo", "Tartamudez social"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 5140, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une exoplanète ?", listOf("Planète orbitant autour d'une étoile autre que le Soleil", "Planète hors du système solaire sans étoile", "Lune d'une autre planète", "Planète naine"), "Science", ""),
            en = LocalizedContent("What is an exoplanet?", listOf("A planet orbiting a star other than the Sun", "A planet outside the solar system without a star", "A moon of another planet", "A dwarf planet"), "Science", ""),
            zh = LocalizedContent("什么是系外行星？", listOf("围绕太阳以外的恒星运行的行星", "太阳系外没有恒星的行星", "另一颗行星的卫星", "矮行星"), "科学", ""),
            es = LocalizedContent("¿Qué es un exoplaneta?", listOf("Planeta que orbita alrededor de una estrella distinta al Sol", "Planeta fuera del sistema solar sin estrella", "Luna de otro planeta", "Planeta enano"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5141, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une étoile à neutrons ?", listOf("Résidu stellaire ultra-dense composé de neutrons", "Étoile sans protons", "Étoile froide", "Jeune étoile en formation"), "Science", ""),
            en = LocalizedContent("What is a neutron star?", listOf("Ultra-dense stellar remnant composed of neutrons", "Star without protons", "Cold star", "Young star in formation"), "Science", ""),
            zh = LocalizedContent("什么是中子星？", listOf("由中子组成的超致密恒星残骸", "没有质子的恒星", "冷星", "正在形成的年轻恒星"), "科学", ""),
            es = LocalizedContent("¿Qué es una estrella de neutrones?", listOf("Remanente estelar ultradenso compuesto de neutrones", "Estrella sin protones", "Estrella fría", "Estrella joven en formación"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5142, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la théorie de l'univers en expansion ?", listOf("Big Bang", "Big Crunch", "État stationnaire", "Théorie de cordes"), "Science", ""),
            en = LocalizedContent("What is the name of the theory of the expanding universe?", listOf("Big Bang", "Big Crunch", "Steady State", "String Theory"), "Science", ""),
            zh = LocalizedContent("宇宙膨胀理论的名称是什么？", listOf("大爆炸", "大坍缩", "稳态理论", "弦理论"), "科学", ""),
            es = LocalizedContent("¿Cuál es el nombre de la teoría del universo en expansión?", listOf("Big Bang", "Big Crunch", "Estado estacionario", "Teoría de cuerdas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5143, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la période de rotation de la Terre autour du Soleil ?", listOf("365,25 jours (1 année)", "365 jours exactement", "360 jours", "366 jours"), "Science", ""),
            en = LocalizedContent("What is the rotation period of the Earth around the Sun?", listOf("365.25 days (1 year)", "Exactly 365 days", "360 days", "366 days"), "Science", ""),
            zh = LocalizedContent("地球绕太阳公转的周期是多少？", listOf("365.25天（1年）", "正好365天", "360天", "366天"), "科学", ""),
            es = LocalizedContent("¿Cuál es el período de rotación de la Tierra alrededor del Sol?", listOf("365,25 días (1 año)", "365 días exactamente", "360 días", "366 días"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5144, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une éclipse totale de Lune ?", listOf("La Terre passe entre le Soleil et la Lune", "La Lune passe entre la Terre et le Soleil", "Le Soleil disparaît derrière la Lune", "La Lune disparaît dans l'ombre de Mars"), "Science", ""),
            en = LocalizedContent("What is a total lunar eclipse?", listOf("The Earth passes between the Sun and the Moon", "The Moon passes between the Earth and the Sun", "The Sun disappears behind the Moon", "The Moon disappears into the shadow of Mars"), "Science", ""),
            zh = LocalizedContent("什么是月全食？", listOf("地球运行到太阳和月球之间", "月球运行到地球和太阳之间", "太阳消失在月球后面", "月球消失在火星的阴影中"), "科学", ""),
            es = LocalizedContent("¿Qué es un eclipse total de Luna?", listOf("La Tierra pasa entre el Sol y la Luna", "La Luna pasa entre la Tierra y el Sol", "El Sol desaparece detrás de la Luna", "La Luna desaparece en la sombra de Marte"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5145, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'objet astronomique le plus dense connu ?", listOf("Les trous noirs", "Les étoiles à neutrons", "Les naines blanches", "Les pulsars"), "Science", ""),
            en = LocalizedContent("What is the densest known astronomical object?", listOf("Black holes", "Neutron stars", "White dwarfs", "Pulsars"), "Science", ""),
            zh = LocalizedContent("已知最致密的天体是什么？", listOf("黑洞", "中子星", "白矮星", "脉冲星"), "科学", ""),
            es = LocalizedContent("¿Cuál es el objeto astronómico más denso conocido?", listOf("Agujeros negros", "Estrellas de neutrones", "Enanas blancas", "Púlsares"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5146, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la magnitude apparente d'une étoile ?", listOf("Sa luminosité telle qu'observée depuis la Terre", "Sa luminosité intrinsèque réelle", "Sa distance par rapport à la Terre", "Sa température de surface"), "Science", ""),
            en = LocalizedContent("What is the apparent magnitude of a star?", listOf("Its brightness as observed from Earth", "Its intrinsic real brightness", "Its distance from Earth", "Its surface temperature"), "Science", ""),
            zh = LocalizedContent("什么是恒星的视星等？", listOf("从地球观测到的亮度", "其内在的真实亮度", "与地球的距离", "表面温度"), "科学", ""),
            es = LocalizedContent("¿Qué es la magnitud aparente de una estrella?", listOf("Su brillo observado desde la Tierra", "Su brillo intrínseco real", "Su distancia a la Tierra", "Su temperatura superficial"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5148, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la Zone Habitable ?", listOf("Zone autour d'une étoile où l'eau liquide peut exister", "Zone sans rayonnements nocifs", "Zone de formation planétaire", "Zone d'orbite stable"), "Science", ""),
            en = LocalizedContent("What is the Habitable Zone?", listOf("Zone around a star where liquid water can exist", "Zone without harmful radiation", "Planet formation zone", "Stable orbit zone"), "Science", ""),
            zh = LocalizedContent("什么是宜居带？", listOf("恒星周围液态水可以存在的区域", "没有有害辐射的区域", "行星形成区域", "稳定轨道区域"), "科学", ""),
            es = LocalizedContent("¿Qué es la Zona Habitable?", listOf("Zona alrededor de una estrella donde puede existir agua líquida", "Zona sin radiación dañina", "Zona de formación planetaria", "Zona de órbita estable"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 5149, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le diamètre approximatif du Soleil ?", listOf("1 392 000 km", "140 000 km", "13 920 000 km", "696 000 km"), "Science", ""),
            en = LocalizedContent("What is the approximate diameter of the Sun?", listOf("1,392,000 km", "140,000 km", "13,920,000 km", "696,000 km"), "Science", ""),
            zh = LocalizedContent("太阳的直径大约是多少？", listOf("1,392,000公里", "140,000公里", "13,920,000公里", "696,000公里"), "科学", ""),
            es = LocalizedContent("¿Cuál es el diámetro aproximado del Sol?", listOf("1 392 000 km", "140 000 km", "13 920 000 km", "696 000 km"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6000, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année les Jeux olympiques modernes ont-ils été créés ?", listOf("1896 (Athènes)", "1900 (Paris)", "1904 (Saint-Louis)", "1892"), "Sport", ""),
            en = LocalizedContent("In which year were the modern Olympic Games created?", listOf("1896 (Athens)", "1900 (Paris)", "1904 (St. Louis)", "1892"), "Sports", ""),
            zh = LocalizedContent("现代奥运会是在哪一年创立的？", listOf("1896年（雅典）", "1900年（巴黎）", "1904年（圣路易斯）", "1892年"), "体育", ""),
            es = LocalizedContent("¿En qué año se crearon los Juegos Olímpicos modernos?", listOf("1896 (Atenas)", "1900 (París)", "1904 (San Luis)", "1892"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6001, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a remporté la Coupe du monde de football en 2018 ?", listOf("France", "Croatie", "Belgique", "Angleterre"), "Sport", ""),
            en = LocalizedContent("Which country won the FIFA World Cup in 2018?", listOf("France", "Croatia", "Belgium", "England"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得了2018年世界杯足球赛？", listOf("法国", "克罗地亚", "比利时", "英格兰"), "体育", ""),
            es = LocalizedContent("¿Qué país ganó la Copa Mundial de Fútbol en 2018?", listOf("Francia", "Croacia", "Bélgica", "Inglaterra"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6002, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur de basketball a popularisé le 'Skybook' ?", listOf("Kareem Abdul-Jabbar", "Wilt Chamberlain", "Bill Russell", "Oscar Robertson"), "Sport", ""),
            en = LocalizedContent("Which basketball player popularized the 'Skyhook'?", listOf("Kareem Abdul-Jabbar", "Wilt Chamberlain", "Bill Russell", "Oscar Robertson"), "Sports", ""),
            zh = LocalizedContent("哪位篮球运动员推广了‘天勾’？", listOf("卡里姆·阿卜杜尔-贾巴尔", "威尔特·张伯伦", "比尔·拉塞尔", "奥斯卡·罗伯特森"), "体育", ""),
            es = LocalizedContent("¿Qué jugador de baloncesto popularizó el 'Skyhook'?", listOf("Kareem Abdul-Jabbar", "Wilt Chamberlain", "Bill Russell", "Oscar Robertson"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6003, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle nation domine le cyclisme sur route historiquement ?", listOf("France, Belgique, Italie et Espagne", "Seulement la France", "Pays-Bas et Allemagne", "Royaume-Uni"), "Sport", ""),
            en = LocalizedContent("Which nation dominates road cycling historically?", listOf("France, Belgium, Italy and Spain", "Only France", "Netherlands and Germany", "United Kingdom"), "Sports", ""),
            zh = LocalizedContent("历史上哪个国家主导公路自行车运动？", listOf("法国、比利时、意大利和西班牙", "只有法国", "荷兰和德国", "英国"), "体育", ""),
            es = LocalizedContent("¿Qué nación domina el ciclismo en ruta históricamente?", listOf("Francia, Bélgica, Italia y España", "Solo Francia", "Países Bajos y Alemania", "Reino Unido"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6004, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'Fosbury Flop' ?", listOf("Saut en hauteur", "Saut en longueur", "Saut à la perche", "Triple saut"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'Fosbury Flop' practiced?", listOf("High jump", "Long jump", "Pole vault", "Triple jump"), "Sports", ""),
            zh = LocalizedContent("在哪个运动中采用‘背越式跳高’？", listOf("跳高", "跳远", "撑杆跳高", "三级跳远"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'Fosbury Flop'?", listOf("Salto de altura", "Salto de longitud", "Salto con pértiga", "Triple salto"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6005, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle distance représente un kilomètre en natation compétitive ?", listOf("20 longueurs dans une piscine de 50m", "10 longueurs", "40 longueurs dans une piscine de 25m", "Les deux sont corrects"), "Sport", ""),
            en = LocalizedContent("What distance does one kilometer represent in competitive swimming?", listOf("20 lengths in a 50m pool", "10 lengths", "40 lengths in a 25m pool", "Both are correct"), "Sports", ""),
            zh = LocalizedContent("在竞技游泳中，一公里相当于多少距离？", listOf("在50米泳池中游20个来回", "10个来回", "在25米泳池中游40个来回", "两者都正确"), "体育", ""),
            es = LocalizedContent("¿Qué distancia representa un kilómetro en natación competitiva?", listOf("20 largos en una piscina de 50m", "10 largos", "40 largos en una piscina de 25m", "Ambas son correctas"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6006, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel fut le premier pays africain à participer à une Coupe du monde ?", listOf("Égypte (1934)", "Maroc (1970)", "Tunisie (1978)", "Zaïre (1974)"), "Sport", ""),
            en = LocalizedContent("Which was the first African country to participate in a World Cup?", listOf("Egypt (1934)", "Morocco (1970)", "Tunisia (1978)", "Zaire (1974)"), "Sports", ""),
            zh = LocalizedContent("第一个参加世界杯的非洲国家是哪个？", listOf("埃及（1934年）", "摩洛哥（1970年）", "突尼斯（1978年）", "扎伊尔（1974年）"), "体育", ""),
            es = LocalizedContent("¿Cuál fue el primer país africano en participar en una Copa del Mundo?", listOf("Egipto (1934)", "Marruecos (1970)", "Túnez (1978)", "Zaire (1974)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6007, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En escrime, quelle arme permet d'attaquer uniquement avec la pointe ?", listOf("Fleuret et épée", "Sabre uniquement", "Fleuret uniquement", "Épée uniquement"), "Sport", ""),
            en = LocalizedContent("In fencing, which weapon allows attacking only with the point?", listOf("Foil and épée", "Sabre only", "Foil only", "Épée only"), "Sports", ""),
            zh = LocalizedContent("在击剑中，哪种武器只允许用剑尖攻击？", listOf("花剑和重剑", "仅佩剑", "仅花剑", "仅重剑"), "体育", ""),
            es = LocalizedContent("En esgrima, ¿qué arma permite atacar solo con la punta?", listOf("Florete y espada", "Sable solo", "Florete solo", "Espada solo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6009, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de frappes constituent un 'Turkey' au bowling ?", listOf("3 strikes consécutifs", "2 strikes", "5 strikes", "Toutes les quilles en une frappes"), "Sport", ""),
            en = LocalizedContent("How many strikes constitute a 'Turkey' in bowling?", listOf("3 consecutive strikes", "2 strikes", "5 strikes", "All pins in one strike"), "Sports", ""),
            zh = LocalizedContent("在保龄球中，多少连续全中称为‘火鸡’？", listOf("3次连续全中", "2次全中", "5次全中", "一次全中所有球瓶"), "体育", ""),
            es = LocalizedContent("¿Cuántos strikes constituyen un 'Turkey' en bolos?", listOf("3 strikes consecutivos", "2 strikes", "5 strikes", "Todos los bolos en un strike"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a remporté le plus de Ballon d'Or dans l'histoire ?", listOf("Lionel Messi (8 en 2024)", "Cristiano Ronaldo (5)", "Ronaldo (2)", "Zinédine Zidane (1)"), "Sport", ""),
            en = LocalizedContent("Who has won the most Ballon d'Or in history?", listOf("Lionel Messi (8 as of 2024)", "Cristiano Ronaldo (5)", "Ronaldo (2)", "Zinedine Zidane (1)"), "Sports", ""),
            zh = LocalizedContent("历史上谁赢得了最多的金球奖？", listOf("莱昂内尔·梅西（截至2024年8次）", "克里斯蒂亚诺·罗纳尔多（5次）", "罗纳尔多（2次）", "齐内丁·齐达内（1次）"), "体育", ""),
            es = LocalizedContent("¿Quién ha ganado más Balones de Oro en la historia?", listOf("Lionel Messi (8 en 2024)", "Cristiano Ronaldo (5)", "Ronaldo (2)", "Zinedine Zidane (1)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6011, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel sport est décerné le trophée des Ryder Cup ?", listOf("Golf", "Tennis", "Polo", "Cricket"), "Sport", ""),
            en = LocalizedContent("In which sport is the Ryder Cup trophy awarded?", listOf("Golf", "Tennis", "Polo", "Cricket"), "Sports", ""),
            zh = LocalizedContent("莱德杯奖杯颁发给哪个运动？", listOf("高尔夫", "网球", "马球", "板球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se otorga el trofeo de la Ryder Cup?", listOf("Golf", "Tenis", "Polo", "Críquet"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle nageuse française a remporté plusieurs médailles olympiques ?", listOf("Laure Manaudou", "Malia Metella", "Camille Muffat", "Charlotte Bonnet"), "Sport", ""),
            en = LocalizedContent("Which French swimmer has won multiple Olympic medals?", listOf("Laure Manaudou", "Malia Metella", "Camille Muffat", "Charlotte Bonnet"), "Sports", ""),
            zh = LocalizedContent("哪位法国游泳运动员赢得了多枚奥运奖牌？", listOf("洛尔·马纳多", "马利亚·梅特拉", "卡米耶·穆法", "夏洛特·博内"), "体育", ""),
            es = LocalizedContent("¿Qué nadadora francesa ha ganado múltiples medallas olímpicas?", listOf("Laure Manaudou", "Malia Metella", "Camille Muffat", "Charlotte Bonnet"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6013, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs par equipe compte la variante rapide du rugby disputee aux JO ?", listOf("7", "8", "6", "10"), "Sport", ""),
            en = LocalizedContent("How many players per team in the rugby sevens variant played at the Olympics?", listOf("7", "8", "6", "10"), "Sports", ""),
            zh = LocalizedContent("奥运会七人制橄榄球每队有多少名球员？", listOf("7", "8", "6", "10"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores por equipo tiene la variante rápida de rugby disputada en los JJ.OO.?", listOf("7", "8", "6", "10"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6014, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le poids d'un ballon de volleyball officiel ?", listOf("260-280 grammes", "200-230 grammes", "300-350 grammes", "400-450 grammes"), "Sport", ""),
            en = LocalizedContent("What is the weight of an official volleyball?", listOf("260-280 grams", "200-230 grams", "300-350 grams", "400-450 grams"), "Sports", ""),
            zh = LocalizedContent("官方排球的重量是多少？", listOf("260-280克", "200-230克", "300-350克", "400-450克"), "体育", ""),
            es = LocalizedContent("¿Cuál es el peso de un balón de voleibol oficial?", listOf("260-280 gramos", "200-230 gramos", "300-350 gramos", "400-450 gramos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6015, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a inventé le cricket ?", listOf("Angleterre", "Inde", "Australie", "Pakistan"), "Sport", ""),
            en = LocalizedContent("Which country invented cricket?", listOf("England", "India", "Australia", "Pakistan"), "Sports", ""),
            zh = LocalizedContent("哪个国家发明了板球？", listOf("英格兰", "印度", "澳大利亚", "巴基斯坦"), "体育", ""),
            es = LocalizedContent("¿Qué país inventó el críquet?", listOf("Inglaterra", "India", "Australia", "Pakistán"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6016, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport Teddy Riner est-il champion olympique ?", listOf("Judo (-100 kg puis +100 kg)", "Lutte", "Boxe", "Jiu-jitsu brésilien"), "Sport", ""),
            en = LocalizedContent("In which sport is Teddy Riner an Olympic champion?", listOf("Judo (-100 kg then +100 kg)", "Wrestling", "Boxing", "Brazilian Jiu-Jitsu"), "Sports", ""),
            zh = LocalizedContent("泰迪·里内是哪个项目的奥运冠军？", listOf("柔道（-100公斤级及+100公斤级）", "摔跤", "拳击", "巴西柔术"), "体育", ""),
            es = LocalizedContent("¿En qué deporte Teddy Riner es campeón olímpico?", listOf("Judo (-100 kg luego +100 kg)", "Lucha", "Boxeo", "Jiu-jitsu brasileño"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6017, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la longueur d'un terrain de football (FIFA) ?", listOf("90-120 mètres", "100 mètres fixes", "110 mètres", "105 mètres fixes"), "Sport", ""),
            en = LocalizedContent("What is the length of a football (soccer) field (FIFA)?", listOf("90-120 meters", "Fixed 100 meters", "110 meters", "Fixed 105 meters"), "Sports", ""),
            zh = LocalizedContent("足球场（FIFA标准）的长度是多少？", listOf("90-120米", "固定100米", "110米", "固定105米"), "体育", ""),
            es = LocalizedContent("¿Cuál es la longitud de un campo de fútbol (FIFA)?", listOf("90-120 metros", "100 metros fijos", "110 metros", "105 metros fijos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6018, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel athlète jamaïcain est triple champion olympique du 100m ?", listOf("Usain Bolt (2008, 2012, 2016)", "Yohan Blake", "Asafa Powell", "Shelly-Ann Fraser-Pryce"), "Sport", ""),
            en = LocalizedContent("Which Jamaican athlete is a triple Olympic champion in the 100m?", listOf("Usain Bolt (2008, 2012, 2016)", "Yohan Blake", "Asafa Powell", "Shelly-Ann Fraser-Pryce"), "Sports", ""),
            zh = LocalizedContent("哪位牙买加运动员是100米三届奥运冠军？", listOf("尤塞恩·博尔特（2008、2012、2016）", "约安·布雷克", "阿萨法·鲍威尔", "谢莉-安·弗雷泽-普赖斯"), "体育", ""),
            es = LocalizedContent("¿Qué atleta jamaicano es triple campeón olímpico de 100m?", listOf("Usain Bolt (2008, 2012, 2016)", "Yohan Blake", "Asafa Powell", "Shelly-Ann Fraser-Pryce"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6019, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de points vaut un home run au baseball ?", listOf("1 point minimum (plus coureurs sur les bases)", "2 points toujours", "4 points toujours", "1 point fixe"), "Sport", ""),
            en = LocalizedContent("How many points is a home run worth in baseball?", listOf("At least 1 point (plus runners on base)", "Always 2 points", "Always 4 points", "Fixed 1 point"), "Sports", ""),
            zh = LocalizedContent("棒球中一个本垒打值多少分？", listOf("至少1分（加上垒上跑者）", "总是2分", "总是4分", "固定1分"), "体育", ""),
            es = LocalizedContent("¿Cuántos puntos vale un jonrón en el béisbol?", listOf("1 punto mínimo (más corredores en base)", "Siempre 2 puntos", "Siempre 4 puntos", "1 punto fijo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6020, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel club de football a remporté le plus de Champions Leagues ?", listOf("Real Madrid (15 titres)", "Liverpool (6)", "Bayern Munich (6)", "AC Milan (7)"), "Sport", ""),
            en = LocalizedContent("Which football club has won the most Champions Leagues?", listOf("Real Madrid (15 titles)", "Liverpool (6)", "Bayern Munich (6)", "AC Milan (7)"), "Sports", ""),
            zh = LocalizedContent("哪家足球俱乐部赢得欧冠次数最多？", listOf("皇家马德里（15次）", "利物浦（6次）", "拜仁慕尼黑（6次）", "AC米兰（7次）"), "体育", ""),
            es = LocalizedContent("¿Qué club de fútbol ha ganado más Champions Leagues?", listOf("Real Madrid (15 títulos)", "Liverpool (6)", "Bayern Múnich (6)", "AC Milan (7)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6021, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on l'esquive et le footwork ?", listOf("Boxe et tous les sports de combat debout", "Seulement la boxe", "Arts martiaux mixtes", "Escrime"), "Sport", ""),
            en = LocalizedContent("In which sport is dodging and footwork practiced?", listOf("Boxing and all standing combat sports", "Only boxing", "Mixed martial arts", "Fencing"), "Sports", ""),
            zh = LocalizedContent("哪项运动需要练习闪避和步法？", listOf("拳击及所有站立格斗运动", "仅拳击", "综合格斗", "击剑"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica la esquiva y el juego de pies?", listOf("Boxeo y todos los deportes de combate de pie", "Solo el boxeo", "Artes marciales mixtas", "Esgrima"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6022, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la hauteur d'un filet de volleyball ?", listOf("2,43 m pour les hommes, 2,24 m pour les femmes", "2 m pour tous", "2,50 m", "2,35 m"), "Sport", ""),
            en = LocalizedContent("What is the height of a volleyball net?", listOf("2.43 m for men, 2.24 m for women", "2 m for all", "2.50 m", "2.35 m"), "Sports", ""),
            zh = LocalizedContent("排球网的高度是多少？", listOf("男子2.43米，女子2.24米", "所有人2米", "2.50米", "2.35米"), "体育", ""),
            es = LocalizedContent("¿Cuál es la altura de una red de voleibol?", listOf("2,43 m para hombres, 2,24 m para mujeres", "2 m para todos", "2,50 m", "2,35 m"), "Deportes", "")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 6023, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel tennisman a le plus de semaines en tête du classement mondial ATP ?", listOf("Novak Djokovic", "Roger Federer", "Pete Sampras", "Ivan Lendl"), "Sport", ""),
            en = LocalizedContent("Which tennis player has the most weeks at number one in the ATP rankings?", listOf("Novak Djokovic", "Roger Federer", "Pete Sampras", "Ivan Lendl"), "Sports", ""),
            zh = LocalizedContent("哪位网球运动员在ATP世界排名第一的周数最多？", listOf("诺瓦克·德约科维奇", "罗杰·费德勒", "皮特·桑普拉斯", "伊万·伦德尔"), "体育", ""),
            es = LocalizedContent("¿Qué tenista tiene más semanas como número uno del ranking ATP?", listOf("Novak Djokovic", "Roger Federer", "Pete Sampras", "Ivan Lendl"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6024, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de rounds dure un combat de boxe professionnel (titre mondial) ?", listOf("12 rounds", "10 rounds", "15 rounds", "8 rounds"), "Sport", ""),
            en = LocalizedContent("How many rounds does a professional boxing match (world title) last?", listOf("12 rounds", "10 rounds", "15 rounds", "8 rounds"), "Sports", ""),
            zh = LocalizedContent("职业拳击比赛（世界冠军赛）有多少回合？", listOf("12回合", "10回合", "15回合", "8回合"), "体育", ""),
            es = LocalizedContent("¿Cuántos asaltos dura un combate de boxeo profesional (título mundial)?", listOf("12 asaltos", "10 asaltos", "15 asaltos", "8 asaltos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 6025, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 2010 met en scène une extraction de rêves par Cobb ?", listOf("Inception", "The Dark Knight", "Interstellar", "Memento"), "Cinéma", ""),
            en = LocalizedContent("Which 2010 film features an extraction of dreams by Cobb?", listOf("Inception", "The Dark Knight", "Interstellar", "Memento"), "Cinema", ""),
            zh = LocalizedContent("哪部2010年的电影讲述了柯布进行梦境提取的故事？", listOf("盗梦空间", "黑暗骑士", "星际穿越", "记忆碎片"), "电影", ""),
            es = LocalizedContent("¿Qué película de 2010 presenta una extracción de sueños por Cobb?", listOf("Inception", "The Dark Knight", "Interstellar", "Memento"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6026, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui réalise la saga 'Mission Impossible' ?", listOf("Brian De Palma (1), puis plusieurs réalisateurs", "Tom Cruise", "J.J. Abrams", "Christopher McQuarrie"), "Cinéma", ""),
            en = LocalizedContent("Who directed the 'Mission: Impossible' saga?", listOf("Brian De Palma (1), then several directors", "Tom Cruise", "J.J. Abrams", "Christopher McQuarrie"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《碟中谍》系列电影？", listOf("布莱恩·德·帕尔玛（第一部），随后多位导演", "汤姆·克鲁斯", "J·J·艾布拉姆斯", "克里斯托弗·麦奎里"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió la saga 'Misión: Imposible'?", listOf("Brian De Palma (1), luego varios directores", "Tom Cruise", "J.J. Abrams", "Christopher McQuarrie"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6027, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de 2003 remporte 11 Oscars y compris Meilleur Film ?", listOf("Le Retour du Roi (LOTR)", "Mystic River", "Lost in Translation", "Master and Commander"), "Cinéma", ""),
            en = LocalizedContent("Which 2003 film won 11 Oscars including Best Picture?", listOf("The Return of the King (LOTR)", "Mystic River", "Lost in Translation", "Master and Commander"), "Cinema", ""),
            zh = LocalizedContent("哪部2003年的电影获得了包括最佳影片在内的11项奥斯卡奖？", listOf("《指环王：王者归来》", "《神秘河》", "《迷失东京》", "《怒海争锋》"), "电影", ""),
            es = LocalizedContent("¿Qué película de 2003 ganó 11 premios Oscar, incluyendo Mejor Película?", listOf("El Retorno del Rey (LOTR)", "Mystic River", "Lost in Translation", "Master and Commander"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6028, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle principal dans 'Philadelphia' (1993) ?", listOf("Tom Hanks", "Denzel Washington", "Antonio Banderas", "Tom Cruise"), "Cinéma", ""),
            en = LocalizedContent("Who plays the lead role in 'Philadelphia' (1993)?", listOf("Tom Hanks", "Denzel Washington", "Antonio Banderas", "Tom Cruise"), "Cinema", ""),
            zh = LocalizedContent("谁在1993年的电影《费城故事》中扮演主角？", listOf("汤姆·汉克斯", "丹泽尔·华盛顿", "安东尼奥·班德拉斯", "汤姆·克鲁斯"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta el papel principal en 'Philadelphia' (1993)?", listOf("Tom Hanks", "Denzel Washington", "Antonio Banderas", "Tom Cruise"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6029, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Lasse Hallström met en scène des enfants suédois ?", listOf("Mon Vie de Chien", "L'Automne de la vie", "Casanova", "What's Eating Gilbert Grape"), "Cinéma", ""),
            en = LocalizedContent("Which Lasse Hallström film features Swedish children?", listOf("My Life as a Dog", "The Autumn of Life", "Casanova", "What's Eating Gilbert Grape"), "Cinema", ""),
            zh = LocalizedContent("哪部莱塞·霍尔斯道姆的电影以瑞典儿童为主角？", listOf("《狗脸的岁月》", "《生命的秋天》", "《卡萨诺瓦》", "《不一样的天空》"), "电影", ""),
            es = LocalizedContent("¿Qué película de Lasse Hallström presenta niños suecos?", listOf("Mi vida como un perro", "El otoño de la vida", "Casanova", "¿Qué está comiendo Gilbert Grape?"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6030, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel film Russell Crowe joue-t-il un général romain devenu gladiateur ?", listOf("Gladiator", "Ben-Hur", "Troie", "Alexandre"), "Cinéma", ""),
            en = LocalizedContent("In which film does Russell Crowe play a Roman general turned gladiator?", listOf("Gladiator", "Ben-Hur", "Troy", "Alexander"), "Cinema", ""),
            zh = LocalizedContent("在哪部电影中，罗素·克劳饰演一位成为角斗士的罗马将军？", listOf("《角斗士》", "《宾虚》", "《特洛伊》", "《亚历山大大帝》"), "电影", ""),
            es = LocalizedContent("¿En qué película Russell Crowe interpreta a un general romano convertido en gladiador?", listOf("Gladiator", "Ben-Hur", "Troya", "Alejandro"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue le rôle de Batman dans la trilogie de Christopher Nolan ?", listOf("Christian Bale", "Michael Keaton", "Val Kilmer", "George Clooney"), "Cinéma", ""),
            en = LocalizedContent("Which actor plays Batman in Christopher Nolan's trilogy?", listOf("Christian Bale", "Michael Keaton", "Val Kilmer", "George Clooney"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在克里斯托弗·诺兰的三部曲中扮演蝙蝠侠？", listOf("克里斯蒂安·贝尔", "迈克尔·基顿", "瓦尔·基尔默", "乔治·克鲁尼"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpreta a Batman en la trilogía de Christopher Nolan?", listOf("Christian Bale", "Michael Keaton", "Val Kilmer", "George Clooney"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6032, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1994 présente une valise mystérieuse et plusieurs histoires ?", listOf("Pulp Fiction", "Reservoir Dogs", "Four Rooms", "Natural Born Killers"), "Cinéma", ""),
            en = LocalizedContent("Which 1994 film features a mysterious briefcase and multiple storylines?", listOf("Pulp Fiction", "Reservoir Dogs", "Four Rooms", "Natural Born Killers"), "Cinema", ""),
            zh = LocalizedContent("哪部1994年的电影包含一个神秘的手提箱和多个故事线？", listOf("《低俗小说》", "《落水狗》", "《四个房间》", "《天生杀人狂》"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1994 presenta un maletín misterioso y múltiples historias?", listOf("Pulp Fiction", "Reservoir Dogs", "Four Rooms", "Natural Born Killers"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6033, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle de Clarice Starling dans 'Le Silence des agneaux' ?", listOf("Jodie Foster", "Meryl Streep", "Sigourney Weaver", "Susan Sarandon"), "Cinéma", ""),
            en = LocalizedContent("Who plays the role of Clarice Starling in 'The Silence of the Lambs'?", listOf("Jodie Foster", "Meryl Streep", "Sigourney Weaver", "Susan Sarandon"), "Cinema", ""),
            zh = LocalizedContent("谁在《沉默的羔羊》中饰演克拉丽斯·斯塔林？", listOf("朱迪·福斯特", "梅丽尔·斯特里普", "西格妮·韦弗", "苏珊·萨兰登"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta a Clarice Starling en 'El silencio de los corderos'?", listOf("Jodie Foster", "Meryl Streep", "Sigourney Weaver", "Susan Sarandon"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6034, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur est connu pour ses plans séquences et longues scènes ?", listOf("Stanley Kubrick et Alfonso Cuarón", "Spielberg", "Scorsese", "Nolan"), "Cinéma", ""),
            en = LocalizedContent("Which director is known for their long takes and extended scenes?", listOf("Stanley Kubrick and Alfonso Cuarón", "Spielberg", "Scorsese", "Nolan"), "Cinema", ""),
            zh = LocalizedContent("哪位导演以其长镜头和长时间场景而闻名？", listOf("斯坦利·库布里克和阿方索·卡隆", "斯皮尔伯格", "斯科塞斯", "诺兰"), "电影", ""),
            es = LocalizedContent("¿Qué director es conocido por sus planos secuencia y escenas largas?", listOf("Stanley Kubrick y Alfonso Cuarón", "Spielberg", "Scorsese", "Nolan"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6035, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 2014 met en scène des astronautes cherchant une planète habitable ?", listOf("Interstellar", "The Martian", "Gravity", "Ad Astra"), "Cinéma", ""),
            en = LocalizedContent("Which 2014 film features astronauts searching for a habitable planet?", listOf("Interstellar", "The Martian", "Gravity", "Ad Astra"), "Cinema", ""),
            zh = LocalizedContent("哪部2014年的电影讲述了宇航员寻找宜居行星的故事？", listOf("星际穿越", "火星救援", "地心引力", "星际探索"), "电影", ""),
            es = LocalizedContent("¿Qué película de 2014 muestra astronautas buscando un planeta habitable?", listOf("Interstellar", "The Martian", "Gravity", "Ad Astra"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6036, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel film les acteurs jouent-ils des marionnettes ?", listOf("Team America: World Police", "The Muppets", "Anomalisa", "Being John Malkovich"), "Cinéma", ""),
            en = LocalizedContent("In which film do actors play puppets?", listOf("Team America: World Police", "The Muppets", "Anomalisa", "Being John Malkovich"), "Cinema", ""),
            zh = LocalizedContent("在哪部电影中演员扮演木偶？", listOf("美国战队：世界警察", "布偶大电影", "失常", "成为约翰·马尔科维奇"), "电影", ""),
            es = LocalizedContent("¿En qué película los actores interpretan marionetas?", listOf("Team America: World Police", "The Muppets", "Anomalisa", "Being John Malkovich"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6037, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le film le plus long jamais réalisé de manière commerciale ?", listOf("Various : Shoah (9h30) ou Intolerance...", "The Irishman (3h30)", "Titanic (3h14)", "Lord of the Rings Extended (11h)"), "Cinéma", ""),
            en = LocalizedContent("What is the longest commercially released film ever made?", listOf("Various: Shoah (9h30) or Intolerance...", "The Irishman (3h30)", "Titanic (3h14)", "Lord of the Rings Extended (11h)"), "Cinema", ""),
            zh = LocalizedContent("有史以来商业发行的最长电影是哪一部？", listOf("多种：《浩劫》（9小时30分）或《党同伐异》...", "《爱尔兰人》（3小时30分）", "《泰坦尼克号》（3小时14分）", "《指环王》加长版（11小时）"), "电影", ""),
            es = LocalizedContent("¿Cuál es la película más larga jamás estrenada comercialmente?", listOf("Varias: Shoah (9h30) o Intolerancia...", "The Irishman (3h30)", "Titanic (3h14)", "El Señor de los Anillos extendida (11h)"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6038, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui réalise 'Parasite' (Palme d'or 2019) ?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Parasite' (Palme d'Or 2019)?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《寄生虫》（2019年金棕榈奖）？", listOf("奉俊昊", "朴赞郁", "李沧东", "洪常秀"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Parásitos' (Palma de Oro 2019)?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6039, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel acteur américain est connu pour ses rôles dans 'La Mort aux trousses' et 'James Bond' ?", listOf("Cary Grant (pas Bond)", "Sean Connery", "Roger Moore", "Pierce Brosnan"), "Cinéma", ""),
            en = LocalizedContent("Which American actor is known for roles in 'North by Northwest' and 'James Bond'?", listOf("Cary Grant (not Bond)", "Sean Connery", "Roger Moore", "Pierce Brosnan"), "Cinema", ""),
            zh = LocalizedContent("哪位美国演员因在《西北偏北》和詹姆斯·邦德中的角色而闻名？", listOf("加里·格兰特（不是邦德）", "肖恩·康纳利", "罗杰·摩尔", "皮尔斯·布鲁斯南"), "电影", ""),
            es = LocalizedContent("¿Qué actor estadounidense es conocido por sus papeles en 'Con la muerte en los talones' y 'James Bond'?", listOf("Cary Grant (no Bond)", "Sean Connery", "Roger Moore", "Pierce Brosnan"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6040, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel film Meryl Streep joue-t-elle une rédactrice en chef exigeante ?", listOf("Le Diable s'habille en Prada", "Kramer vs. Kramer", "Sophie's Choice", "The Post"), "Cinéma", ""),
            en = LocalizedContent("In which film does Meryl Streep play a demanding editor-in-chief?", listOf("The Devil Wears Prada", "Kramer vs. Kramer", "Sophie's Choice", "The Post"), "Cinema", ""),
            zh = LocalizedContent("梅丽尔·斯特里普在哪部电影中饰演一位要求苛刻的主编？", listOf("穿普拉达的女王", "克莱默夫妇", "苏菲的抉择", "华盛顿邮报"), "电影", ""),
            es = LocalizedContent("¿En qué película Meryl Streep interpreta a una exigente editora jefe?", listOf("El diablo viste de Prada", "Kramer vs. Kramer", "La decisión de Sophie", "The Post"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1977 de Lucas lance la saga Star Wars ?", listOf("Un Nouvel Espoir (Épisode IV)", "L'Empire contre-attaque", "Le Retour du Jedi", "La Menace Fantôme"), "Cinéma", ""),
            en = LocalizedContent("Which 1977 film by Lucas launched the Star Wars saga?", listOf("A New Hope (Episode IV)", "The Empire Strikes Back", "Return of the Jedi", "The Phantom Menace"), "Cinema", ""),
            zh = LocalizedContent("卢卡斯1977年的哪部电影开启了星球大战系列？", listOf("新希望（第四部）", "帝国反击战", "绝地归来", "幽灵的威胁"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1977 de Lucas lanzó la saga Star Wars?", listOf("Una nueva esperanza (Episodio IV)", "El Imperio contraataca", "El retorno del Jedi", "La amenaza fantasma"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6042, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Vertigo' (1958) ?", listOf("Alfred Hitchcock", "Billy Wilder", "John Ford", "Howard Hawks"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Vertigo' (1958)?", listOf("Alfred Hitchcock", "Billy Wilder", "John Ford", "Howard Hawks"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《迷魂记》（1958年）？", listOf("阿尔弗雷德·希区柯克", "比利·怀尔德", "约翰·福特", "霍华德·霍克斯"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Vértigo' (1958)?", listOf("Alfred Hitchcock", "Billy Wilder", "John Ford", "Howard Hawks"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6043, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel film Daniel Day-Lewis joue un peintre irlandais avec une paralysie ?", listOf("Mon pied gauche", "There Will Be Blood", "Gangs of New York", "Lincoln"), "Cinéma", ""),
            en = LocalizedContent("In which film does Daniel Day-Lewis play an Irish painter with paralysis?", listOf("My Left Foot", "There Will Be Blood", "Gangs of New York", "Lincoln"), "Cinema", ""),
            zh = LocalizedContent("丹尼尔·戴-刘易斯在哪部电影中饰演一位瘫痪的爱尔兰画家？", listOf("我的左脚", "血色将至", "纽约黑帮", "林肯"), "电影", ""),
            es = LocalizedContent("¿En qué película Daniel Day-Lewis interpreta a un pintor irlandés con parálisis?", listOf("Mi pie izquierdo", "Pozos de ambición", "Gangs of New York", "Lincoln"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6044, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué Aragorn dans 'Le Seigneur des Anneaux' ?", listOf("Viggo Mortensen", "Orlando Bloom", "Sean Bean", "Elijah Wood"), "Cinéma", ""),
            en = LocalizedContent("Which actor played Aragorn in 'The Lord of the Rings'?", listOf("Viggo Mortensen", "Orlando Bloom", "Sean Bean", "Elijah Wood"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在《指环王》中饰演阿拉贡？", listOf("维果·莫滕森", "奥兰多·布鲁姆", "肖恩·宾", "伊利亚·伍德"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó a Aragorn en 'El Señor de los Anillos'?", listOf("Viggo Mortensen", "Orlando Bloom", "Sean Bean", "Elijah Wood"), "Cine", "")
        ),
        BilingualQuestion(
            id = 6045, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe est connu pour l'album 'Abbey Road' ?", listOf("Les Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Musique", ""),
            en = LocalizedContent("Which band is known for the album 'Abbey Road'?", listOf("The Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Music", ""),
            zh = LocalizedContent("哪个乐队以专辑《Abbey Road》闻名？", listOf("披头士", "滚石乐队", "谁人乐队", "齐柏林飞艇"), "音乐", ""),
            es = LocalizedContent("¿Qué banda es conocida por el álbum 'Abbey Road'?", listOf("The Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Música", "")
        ),
        BilingualQuestion(
            id = 6046, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle chanteuse est connue pour 'Roxanne' et 'Englishman in New York' ?", listOf("Sting (The Police puis solo)", "David Bowie", "Peter Gabriel", "Phil Collins"), "Musique", ""),
            en = LocalizedContent("Which singer is known for 'Roxanne' and 'Englishman in New York'?", listOf("Sting (The Police then solo)", "David Bowie", "Peter Gabriel", "Phil Collins"), "Music", ""),
            zh = LocalizedContent("哪位歌手以《Roxanne》和《Englishman in New York》闻名？", listOf("斯汀（警察乐队后单飞）", "大卫·鲍伊", "彼得·盖布瑞尔", "菲尔·柯林斯"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante es conocido por 'Roxanne' y 'Englishman in New York'?", listOf("Sting (The Police y luego solista)", "David Bowie", "Peter Gabriel", "Phil Collins"), "Música", "")
        ),
        BilingualQuestion(
            id = 6047, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur classique est connu pour ses 'Nocturnes' pour piano ?", listOf("Frédéric Chopin", "Franz Liszt", "Robert Schumann", "Felix Mendelssohn"), "Musique", ""),
            en = LocalizedContent("Which classical composer is known for his 'Nocturnes' for piano?", listOf("Frédéric Chopin", "Franz Liszt", "Robert Schumann", "Felix Mendelssohn"), "Music", ""),
            zh = LocalizedContent("哪位古典作曲家以其钢琴《夜曲》闻名？", listOf("弗雷德里克·肖邦", "弗朗茨·李斯特", "罗伯特·舒曼", "费利克斯·门德尔松"), "音乐", ""),
            es = LocalizedContent("¿Qué compositor clásico es conocido por sus 'Nocturnos' para piano?", listOf("Frédéric Chopin", "Franz Liszt", "Robert Schumann", "Felix Mendelssohn"), "Música", "")
        ),
        BilingualQuestion(
            id = 6048, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe français de électro a sorti 'Around the World' ?", listOf("Daft Punk", "Air", "Cassius", "Modjo"), "Musique", ""),
            en = LocalizedContent("Which French electronic group released 'Around the World'?", listOf("Daft Punk", "Air", "Cassius", "Modjo"), "Music", ""),
            zh = LocalizedContent("哪个法国电子乐队发行了《Around the World》？", listOf("蠢朋克", "空气", "卡修斯", "莫乔"), "音乐", ""),
            es = LocalizedContent("¿Qué grupo francés de música electrónica lanzó 'Around the World'?", listOf("Daft Punk", "Air", "Cassius", "Modjo"), "Música", "")
        ),
        BilingualQuestion(
            id = 6049, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de l'opéra 'La Bohème' ?", listOf("Giacomo Puccini", "Giuseppe Verdi", "Gaetano Donizetti", "Gioachino Rossini"), "Musique", ""),
            en = LocalizedContent("Who is the composer of the opera 'La Bohème'?", listOf("Giacomo Puccini", "Giuseppe Verdi", "Gaetano Donizetti", "Gioachino Rossini"), "Music", ""),
            zh = LocalizedContent("歌剧《波西米亚人》的作曲者是谁？", listOf("贾科莫·普契尼", "朱塞佩·威尔第", "盖塔诺·多尼采蒂", "焦阿基诺·罗西尼"), "音乐", ""),
            es = LocalizedContent("¿Quién es el compositor de la ópera 'La Bohème'?", listOf("Giacomo Puccini", "Giuseppe Verdi", "Gaetano Donizetti", "Gioachino Rossini"), "Música", "")
        ),
        BilingualQuestion(
            id = 6050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle artiste est connue pour ses albums 'Lemonade' et 'Renaissance' ?", listOf("Beyoncé", "Rihanna", "Taylor Swift", "Alicia Keys"), "Musique", ""),
            en = LocalizedContent("Which artist is known for her albums 'Lemonade' and 'Renaissance'?", listOf("Beyoncé", "Rihanna", "Taylor Swift", "Alicia Keys"), "Music", ""),
            zh = LocalizedContent("哪位艺人以专辑《Lemonade》和《Renaissance》闻名？", listOf("碧昂丝", "蕾哈娜", "泰勒·斯威夫特", "艾丽西亚·凯斯"), "音乐", ""),
            es = LocalizedContent("¿Qué artista es conocida por sus álbumes 'Lemonade' y 'Renaissance'?", listOf("Beyoncé", "Rihanna", "Taylor Swift", "Alicia Keys"), "Música", "")
        ),
        BilingualQuestion(
            id = 6051, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe de rock a sorti 'Paint It Black' et 'Sympathy for the Devil' ?", listOf("The Rolling Stones", "The Beatles", "The Doors", "Led Zeppelin"), "Musique", ""),
            en = LocalizedContent("Which rock band released 'Paint It Black' and 'Sympathy for the Devil'?", listOf("The Rolling Stones", "The Beatles", "The Doors", "Led Zeppelin"), "Music", ""),
            zh = LocalizedContent("哪个摇滚乐队发行了《Paint It Black》和《Sympathy for the Devil》？", listOf("滚石乐队", "披头士", "大门乐队", "齐柏林飞艇"), "音乐", ""),
            es = LocalizedContent("¿Qué banda de rock lanzó 'Paint It Black' y 'Sympathy for the Devil'?", listOf("The Rolling Stones", "The Beatles", "The Doors", "Led Zeppelin"), "Música", "")
        ),
        BilingualQuestion(
            id = 6052, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit la 'Marseillaise' ?", listOf("Claude Joseph Rouget de Lisle (1792)", "Hector Berlioz", "Gabriel Fauré", "Camille Saint-Saëns"), "Musique", ""),
            en = LocalizedContent("Who composed 'La Marseillaise'?", listOf("Claude Joseph Rouget de Lisle (1792)", "Hector Berlioz", "Gabriel Fauré", "Camille Saint-Saëns"), "Music", ""),
            zh = LocalizedContent("谁创作了《马赛曲》？", listOf("克洛德·约瑟夫·鲁热·德·利尔（1792年）", "埃克托·柏辽兹", "加布里埃尔·福雷", "卡米耶·圣桑"), "音乐", ""),
            es = LocalizedContent("¿Quién compuso 'La Marsellesa'?", listOf("Claude Joseph Rouget de Lisle (1792)", "Hector Berlioz", "Gabriel Fauré", "Camille Saint-Saëns"), "Música", "")
        ),
        BilingualQuestion(
            id = 6053, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien est associé au style 'Bebop' ?", listOf("Charlie Parker et Dizzy Gillespie", "Louis Armstrong", "Duke Ellington", "Miles Davis"), "Musique", ""),
            en = LocalizedContent("Which musician is associated with the 'Bebop' style?", listOf("Charlie Parker and Dizzy Gillespie", "Louis Armstrong", "Duke Ellington", "Miles Davis"), "Music", ""),
            zh = LocalizedContent("哪位音乐家与'比波普'风格相关？", listOf("查理·帕克和迪齐·吉莱斯皮", "路易斯·阿姆斯特朗", "艾灵顿公爵", "迈尔斯·戴维斯"), "音乐", ""),
            es = LocalizedContent("¿Qué músico está asociado con el estilo 'Bebop'?", listOf("Charlie Parker y Dizzy Gillespie", "Louis Armstrong", "Duke Ellington", "Miles Davis"), "Musica", "")
        ),
        BilingualQuestion(
            id = 6054, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe britannique est connu pour 'Under Pressure' avec David Bowie ?", listOf("Queen", "Led Zeppelin", "The Police", "Genesis"), "Musique", ""),
            en = LocalizedContent("Which British band is known for 'Under Pressure' with David Bowie?", listOf("Queen", "Led Zeppelin", "The Police", "Genesis"), "Music", ""),
            zh = LocalizedContent("哪个英国乐队因与大卫·鲍伊合作《Under Pressure》而闻名？", listOf("皇后乐队", "齐柏林飞艇", "警察乐队", "创世纪乐队"), "音乐", ""),
            es = LocalizedContent("¿Qué banda británica es conocida por 'Under Pressure' con David Bowie?", listOf("Queen", "Led Zeppelin", "The Police", "Genesis"), "Musica", "")
        ),
        BilingualQuestion(
            id = 6055, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé 'La Traviata', 'Rigoletto' et 'Aïda' ?", listOf("Giuseppe Verdi", "Giacomo Puccini", "Gioachino Rossini", "Gaetano Donizetti"), "Musique", ""),
            en = LocalizedContent("Who composed 'La Traviata', 'Rigoletto' and 'Aida'?", listOf("Giuseppe Verdi", "Giacomo Puccini", "Gioachino Rossini", "Gaetano Donizetti"), "Music", ""),
            zh = LocalizedContent("谁创作了《茶花女》、《弄臣》和《阿依达》？", listOf("朱塞佩·威尔第", "贾科莫·普契尼", "焦阿基诺·罗西尼", "盖塔诺·多尼采蒂"), "音乐", ""),
            es = LocalizedContent("¿Quién compuso 'La Traviata', 'Rigoletto' y 'Aida'?", listOf("Giuseppe Verdi", "Giacomo Puccini", "Gioachino Rossini", "Gaetano Donizetti"), "Musica", "")
        ),
        BilingualQuestion(
            id = 6056, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mouvement musical est apparu à New York dans les années 1970 ?", listOf("Hip-hop", "Punk", "Disco", "New Wave"), "Musique", ""),
            en = LocalizedContent("Which musical movement emerged in New York in the 1970s?", listOf("Hip-hop", "Punk", "Disco", "New Wave"), "Music", ""),
            zh = LocalizedContent("哪个音乐运动于20世纪70年代在纽约兴起？", listOf("嘻哈", "朋克", "迪斯科", "新浪潮"), "音乐", ""),
            es = LocalizedContent("¿Qué movimiento musical surgió en Nueva York en la década de 1970?", listOf("Hip-hop", "Punk", "Disco", "New Wave"), "Musica", "")
        ),
        BilingualQuestion(
            id = 6057, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur est connu pour 'Purple Rain' et 'When Doves Cry' ?", listOf("Prince", "Michael Jackson", "David Bowie", "James Brown"), "Musique", ""),
            en = LocalizedContent("Which singer is known for 'Purple Rain' and 'When Doves Cry'?", listOf("Prince", "Michael Jackson", "David Bowie", "James Brown"), "Music", ""),
            zh = LocalizedContent("哪位歌手因《紫雨》和《当鸽子哭泣时》而闻名？", listOf("王子", "迈克尔·杰克逊", "大卫·鲍伊", "詹姆斯·布朗"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante es conocido por 'Purple Rain' y 'When Doves Cry'?", listOf("Prince", "Michael Jackson", "David Bowie", "James Brown"), "Musica", "")
        ),
        BilingualQuestion(
            id = 6058, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument traditionnel argentin est associé au tango ?", listOf("Le bandonéon", "L'accordéon", "Le violon", "La guitare"), "Musique", ""),
            en = LocalizedContent("Which traditional Argentine instrument is associated with tango?", listOf("Bandoneon", "Accordion", "Violin", "Guitar"), "Music", ""),
            zh = LocalizedContent("哪种阿根廷传统乐器与探戈相关？", listOf("班多钮手风琴", "手风琴", "小提琴", "吉他"), "音乐", ""),
            es = LocalizedContent("¿Qué instrumento tradicional argentino está asociado con el tango?", listOf("El bandoneón", "El acordeón", "El violín", "La guitarra"), "Musica", "")
        ),
        BilingualQuestion(
            id = 6059, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe de hip-hop américain a sorti 'The Chronic' ?", listOf("Dr. Dre (et Snoop Dogg)", "Ice Cube", "Tupac", "N.W.A"), "Musique", ""),
            en = LocalizedContent("Which American hip-hop group released 'The Chronic'?", listOf("Dr. Dre (and Snoop Dogg)", "Ice Cube", "Tupac", "N.W.A"), "Music", ""),
            zh = LocalizedContent("哪个美国嘻哈团体发行了《The Chronic》？", listOf("德瑞博士（和史努比狗狗）", "冰立方", "图帕克", "N.W.A"), "音乐", ""),
            es = LocalizedContent("¿Qué grupo de hip-hop estadounidense lanzó 'The Chronic'?", listOf("Dr. Dre (y Snoop Dogg)", "Ice Cube", "Tupac", "N.W.A"), "Musica", "")
        ),
        BilingualQuestion(
            id = 6060, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a organisé les Jeux olympiques d'été de 2008 ?", listOf("Chine (Pékin)", "Russie", "Corée du Sud", "Japon"), "Histoire", ""),
            en = LocalizedContent("Which country hosted the 2008 Summer Olympics?", listOf("China (Beijing)", "Russia", "South Korea", "Japan"), "History", ""),
            zh = LocalizedContent("哪个国家举办了2008年夏季奥运会？", listOf("中国（北京）", "俄罗斯", "韩国", "日本"), "历史", ""),
            es = LocalizedContent("¿Qué país organizó los Juegos Olímpicos de Verano de 2008?", listOf("China (Pekín)", "Rusia", "Corea del Sur", "Japón"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6061, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a eu lieu l'attentat du World Trade Center ?", listOf("2001", "1993", "2003", "1998"), "Histoire", ""),
            en = LocalizedContent("In which year did the World Trade Center attack occur?", listOf("2001", "1993", "2003", "1998"), "History", ""),
            zh = LocalizedContent("世界贸易中心袭击发生在哪一年？", listOf("2001", "1993", "2003", "1998"), "历史", ""),
            es = LocalizedContent("¿En qué año ocurrió el atentado del World Trade Center?", listOf("2001", "1993", "2003", "1998"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6062, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le premier dirigeant élu de l'Afrique du Sud après l'apartheid ?", listOf("Nelson Mandela", "F.W. de Klerk", "Thabo Mbeki", "Desmond Tutu"), "Histoire", ""),
            en = LocalizedContent("Who is the first elected leader of South Africa after apartheid?", listOf("Nelson Mandela", "F.W. de Klerk", "Thabo Mbeki", "Desmond Tutu"), "History", ""),
            zh = LocalizedContent("谁是南非种族隔离后的第一位民选领导人？", listOf("纳尔逊·曼德拉", "弗雷德里克·威廉·德克勒克", "塔博·姆贝基", "德斯蒙德·图图"), "历史", ""),
            es = LocalizedContent("¿Quién es el primer líder elegido de Sudáfrica después del apartheid?", listOf("Nelson Mandela", "F.W. de Klerk", "Thabo Mbeki", "Desmond Tutu"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6063, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est l'année de l'effondrement des Accords de Bretton Woods ?", listOf("1971 (Nixon suspend la convertibilité or)", "1944 (création)", "1973 (fin complète)", "1968"), "Histoire", ""),
            en = LocalizedContent("What year did the Bretton Woods system collapse?", listOf("1971 (Nixon suspends gold convertibility)", "1944 (creation)", "1973 (complete end)", "1968"), "History", ""),
            zh = LocalizedContent("布雷顿森林体系在哪一年崩溃？", listOf("1971年（尼克松暂停黄金兑换）", "1944年（创建）", "1973年（完全结束）", "1968年"), "历史", ""),
            es = LocalizedContent("¿En qué año colapsó el sistema de Bretton Woods?", listOf("1971 (Nixon suspende la convertibilidad del oro)", "1944 (creación)", "1973 (fin completo)", "1968"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6064, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel conflit a opposé Israël et les pays arabes en 1967 ?", listOf("Guerre des Six Jours", "Guerre du Kippour", "Guerre des 1948", "Guerre du Golfe"), "Histoire", ""),
            en = LocalizedContent("Which conflict opposed Israel and Arab countries in 1967?", listOf("Six-Day War", "Yom Kippur War", "1948 War", "Gulf War"), "History", ""),
            zh = LocalizedContent("1967年以色列与阿拉伯国家之间发生了哪场冲突？", listOf("六日战争", "赎罪日战争", "1948年战争", "海湾战争"), "历史", ""),
            es = LocalizedContent("¿Qué conflicto enfrentó a Israel y los países árabes en 1967?", listOf("Guerra de los Seis Días", "Guerra de Yom Kipur", "Guerra de 1948", "Guerra del Golfo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6065, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Hong Kong a-t-il été rétrocédé à la Chine ?", listOf("1997", "1999", "1984", "2000"), "Histoire", ""),
            en = LocalizedContent("In what year was Hong Kong returned to China?", listOf("1997", "1999", "1984", "2000"), "History", ""),
            zh = LocalizedContent("香港在哪一年回归中国？", listOf("1997年", "1999年", "1984年", "2000年"), "历史", ""),
            es = LocalizedContent("¿En qué año fue devuelto Hong Kong a China?", listOf("1997", "1999", "1984", "2000"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6066, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel accord a créé l'Organisation Mondiale du Commerce (OMC) ?", listOf("Accords de Marrakech (1994)", "Accords du GATT (1947)", "Traité de Maastricht (1992)", "Accords de Bretton Woods (1944)"), "Histoire", ""),
            en = LocalizedContent("Which agreement created the World Trade Organization (WTO)?", listOf("Marrakesh Agreement (1994)", "GATT Agreement (1947)", "Maastricht Treaty (1992)", "Bretton Woods Agreement (1944)"), "History", ""),
            zh = LocalizedContent("哪个协议创建了世界贸易组织（WTO）？", listOf("马拉喀什协议（1994年）", "关贸总协定（1947年）", "马斯特里赫特条约（1992年）", "布雷顿森林协议（1944年）"), "历史", ""),
            es = LocalizedContent("¿Qué acuerdo creó la Organización Mundial del Comercio (OMC)?", listOf("Acuerdos de Marrakech (1994)", "Acuerdos del GATT (1947)", "Tratado de Maastricht (1992)", "Acuerdos de Bretton Woods (1944)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6067, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le Traité de Lisbonne a-t-il réformé l'UE ?", listOf("2007 (signé) / 2009 (en vigueur)", "2004", "2012", "2015"), "Histoire", ""),
            en = LocalizedContent("In what year did the Treaty of Lisbon reform the EU?", listOf("2007 (signed) / 2009 (in force)", "2004", "2012", "2015"), "History", ""),
            zh = LocalizedContent("里斯本条约在哪一年改革了欧盟？", listOf("2007年（签署）/ 2009年（生效）", "2004年", "2012年", "2015年"), "历史", ""),
            es = LocalizedContent("¿En qué año reformó el Tratado de Lisboa la UE?", listOf("2007 (firmado) / 2009 (en vigor)", "2004", "2012", "2015"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6068, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a subi une grave crise économique en 2001 avec le 'Corralito' ?", listOf("Argentine", "Brésil", "Venezuela", "Mexique"), "Histoire", ""),
            en = LocalizedContent("Which country suffered a severe economic crisis in 2001 with the 'Corralito'?", listOf("Argentina", "Brazil", "Venezuela", "Mexico"), "History", ""),
            zh = LocalizedContent("哪个国家在2001年因“科拉利托”遭受严重经济危机？", listOf("阿根廷", "巴西", "委内瑞拉", "墨西哥"), "历史", ""),
            es = LocalizedContent("¿Qué país sufrió una grave crisis económica en 2001 con el 'Corralito'?", listOf("Argentina", "Brasil", "Venezuela", "México"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6069, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle révolution a renversé le Shah d'Iran en 1979 ?", listOf("Révolution islamique (Khomeini)", "Révolution communiste", "Révolution démocratique", "Révolution nationaliste"), "Histoire", ""),
            en = LocalizedContent("Which revolution overthrew the Shah of Iran in 1979?", listOf("Islamic Revolution (Khomeini)", "Communist Revolution", "Democratic Revolution", "Nationalist Revolution"), "History", ""),
            zh = LocalizedContent("哪场革命在1979年推翻了伊朗国王？", listOf("伊斯兰革命（霍梅尼）", "共产主义革命", "民主革命", "民族主义革命"), "历史", ""),
            es = LocalizedContent("¿Qué revolución derrocó al Sha de Irán en 1979?", listOf("Revolución Islámica (Jomeini)", "Revolución Comunista", "Revolución Democrática", "Revolución Nacionalista"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6071, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année les États-Unis ont-ils envahi l'Irak ?", listOf("2003", "2001", "1991", "1998"), "Histoire", ""),
            en = LocalizedContent("In what year did the United States invade Iraq?", listOf("2003", "2001", "1991", "1998"), "History", ""),
            zh = LocalizedContent("美国在哪一年入侵伊拉克？", listOf("2003年", "2001年", "1991年", "1998年"), "历史", ""),
            es = LocalizedContent("¿En qué año invadió Estados Unidos Irak?", listOf("2003", "2001", "1991", "1998"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6072, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement de 1986 a failli déclencher une guerre nucléaire ?", listOf("Aucun - mais Tchernobyl a menacé", "Accident de Tchernobyl", "Accident de Three Mile Island", "Essai nucléaire soviétique"), "Histoire", ""),
            en = LocalizedContent("Which 1986 event nearly triggered a nuclear war?", listOf("None - but Chernobyl threatened", "Chernobyl accident", "Three Mile Island accident", "Soviet nuclear test"), "History", ""),
            zh = LocalizedContent("1986年的哪个事件差点引发核战争？", listOf("没有——但切尔诺贝利构成威胁", "切尔诺贝利事故", "三哩岛事故", "苏联核试验"), "历史", ""),
            es = LocalizedContent("¿Qué evento de 1986 casi desencadena una guerra nuclear?", listOf("Ninguno - pero Chernóbil amenazó", "Accidente de Chernóbil", "Accidente de Three Mile Island", "Prueba nuclear soviética"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6073, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été le premier président de la Russie post-soviétique ?", listOf("Boris Eltsine", "Vladimir Poutine", "Mikhaïl Gorbatchev", "Dmitri Medvedev"), "Histoire", ""),
            en = LocalizedContent("Who was the first president of post-Soviet Russia?", listOf("Boris Yeltsin", "Vladimir Putin", "Mikhail Gorbachev", "Dmitry Medvedev"), "History", ""),
            zh = LocalizedContent("谁是后苏联时代俄罗斯的第一任总统？", listOf("鲍里斯·叶利钦", "弗拉基米尔·普京", "米哈伊尔·戈尔巴乔夫", "德米特里·梅德韦杰夫"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer presidente de la Rusia postsoviética?", listOf("Boris Yeltsin", "Vladimir Putin", "Mijaíl Gorbachov", "Dmitri Medvédev"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6074, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel conflit des années 1990 a dévasté la Yougoslavie ?", listOf("Guerres de Yougoslavie (Bosnie, Kosovo)", "Guerre du Golfe", "Guerre d'Afghanistan", "Guerre civile albanaise"), "Histoire", ""),
            en = LocalizedContent("Which conflict of the 1990s devastated Yugoslavia?", listOf("Yugoslav Wars (Bosnia, Kosovo)", "Gulf War", "War in Afghanistan", "Albanian Civil War"), "History", ""),
            zh = LocalizedContent("20世纪90年代哪场冲突摧毁了南斯拉夫？", listOf("南斯拉夫战争（波斯尼亚、科索沃）", "海湾战争", "阿富汗战争", "阿尔巴尼亚内战"), "历史", ""),
            es = LocalizedContent("¿Qué conflicto de los años 1990 devastó Yugoslavia?", listOf("Guerras yugoslavas (Bosnia, Kosovo)", "Guerra del Golfo", "Guerra de Afganistán", "Guerra civil albanesa"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6075, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le Traité de Maastricht a-t-il officiellement créé l'UE ?", listOf("1992 (signé) / 1993 (en vigueur)", "1957", "1985", "1997"), "Histoire", ""),
            en = LocalizedContent("In which year did the Maastricht Treaty officially create the EU?", listOf("1992 (signed) / 1993 (in force)", "1957", "1985", "1997"), "History", ""),
            zh = LocalizedContent("《马斯特里赫特条约》在哪一年正式创立了欧盟？", listOf("1992年（签署）/ 1993年（生效）", "1957年", "1985年", "1997年"), "历史", ""),
            es = LocalizedContent("¿En qué año el Tratado de Maastricht creó oficialmente la UE?", listOf("1992 (firmado) / 1993 (en vigor)", "1957", "1985", "1997"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6076, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a connu la 'Révolution orange' en 2004 ?", listOf("Ukraine", "Russie", "Géorgie", "Biélorussie"), "Histoire", ""),
            en = LocalizedContent("Which country experienced the 'Orange Revolution' in 2004?", listOf("Ukraine", "Russia", "Georgia", "Belarus"), "History", ""),
            zh = LocalizedContent("哪个国家在2004年经历了“橙色革命”？", listOf("乌克兰", "俄罗斯", "格鲁吉亚", "白俄罗斯"), "历史", ""),
            es = LocalizedContent("¿Qué país experimentó la 'Revolución Naranja' en 2004?", listOf("Ucrania", "Rusia", "Georgia", "Bielorrusia"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6077, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle crise a débuté en 2008 avec la faillite de Lehman Brothers ?", listOf("Crise financière mondiale", "Crise de la dette européenne", "Récession américaine", "Crise des subprimes uniquement"), "Histoire", ""),
            en = LocalizedContent("Which crisis began in 2008 with the bankruptcy of Lehman Brothers?", listOf("Global financial crisis", "European debt crisis", "American recession", "Subprime crisis only"), "History", ""),
            zh = LocalizedContent("哪场危机始于2008年雷曼兄弟破产？", listOf("全球金融危机", "欧洲债务危机", "美国经济衰退", "仅次贷危机"), "历史", ""),
            es = LocalizedContent("¿Qué crisis comenzó en 2008 con la quiebra de Lehman Brothers?", listOf("Crisis financiera mundial", "Crisis de deuda europea", "Recesión estadounidense", "Solo crisis de las subprime"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6078, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'Espagne a-t-elle rejoint la CEE (future UE) ?", listOf("1986", "1973", "1992", "1980"), "Histoire", ""),
            en = LocalizedContent("In which year did Spain join the EEC (future EU)?", listOf("1986", "1973", "1992", "1980"), "History", ""),
            zh = LocalizedContent("西班牙在哪一年加入欧洲经济共同体（后来的欧盟）？", listOf("1986年", "1973年", "1992年", "1980年"), "历史", ""),
            es = LocalizedContent("¿En qué año se unió España a la CEE (futura UE)?", listOf("1986", "1973", "1992", "1980"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6079, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a fondé le mouvement 'Solidarność' en Pologne ?", listOf("Lech Wałęsa", "John Paul II (Jean-Paul II)", "Tadeusz Mazowiecki", "Adam Michnik"), "Histoire", ""),
            en = LocalizedContent("Who founded the 'Solidarity' movement in Poland?", listOf("Lech Wałęsa", "John Paul II", "Tadeusz Mazowiecki", "Adam Michnik"), "History", ""),
            zh = LocalizedContent("谁在波兰创立了“团结工会”运动？", listOf("莱赫·瓦文萨", "约翰·保罗二世", "塔德乌什·马佐维耶茨基", "亚当·米奇尼克"), "历史", ""),
            es = LocalizedContent("¿Quién fundó el movimiento 'Solidaridad' en Polonia?", listOf("Lech Wałęsa", "Juan Pablo II", "Tadeusz Mazowiecki", "Adam Michnik"), "Historia", "")
        ),
        BilingualQuestion(
            id = 6080, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la bioluminescence ?", listOf("Production de lumière par des organismes vivants", "Fluorescence sous UV", "Reflet de la lumière solaire", "Réaction chimique avec l'oxygène uniquement"), "Science", ""),
            en = LocalizedContent("What is bioluminescence?", listOf("Production of light by living organisms", "Fluorescence under UV", "Reflection of sunlight", "Chemical reaction with oxygen only"), "Science", ""),
            zh = LocalizedContent("什么是生物发光？", listOf("生物体产生光", "紫外线下的荧光", "太阳光的反射", "仅与氧气的化学反应"), "科学", ""),
            es = LocalizedContent("¿Qué es la bioluminiscencia?", listOf("Producción de luz por organismos vivos", "Fluorescencia bajo UV", "Reflejo de la luz solar", "Reacción química solo con oxígeno"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6081, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le métal le plus conducteur électriquement ?", listOf("Argent", "Cuivre", "Or", "Aluminium"), "Science", ""),
            en = LocalizedContent("Which metal is the most electrically conductive?", listOf("Silver", "Copper", "Gold", "Aluminum"), "Science", ""),
            zh = LocalizedContent("哪种金属导电性最强？", listOf("银", "铜", "金", "铝"), "科学", ""),
            es = LocalizedContent("¿Qué metal es el más conductor eléctricamente?", listOf("Plata", "Cobre", "Oro", "Aluminio"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6082, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un neutrino ?", listOf("Particule élémentaire de très faible masse qui interagit peu", "Anti-électron", "Noyau d'hélium", "Photon de faible énergie"), "Science", ""),
            en = LocalizedContent("What is a neutrino?", listOf("Elementary particle with very low mass that interacts weakly", "Anti-electron", "Helium nucleus", "Low-energy photon"), "Science", ""),
            zh = LocalizedContent("什么是中微子？", listOf("质量极低、相互作用极弱的基本粒子", "反电子", "氦原子核", "低能光子"), "科学", ""),
            es = LocalizedContent("¿Qué es un neutrino?", listOf("Partícula elemental de masa muy baja que interactúa débilmente", "Antielectrón", "Núcleo de helio", "Fotón de baja energía"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6083, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la résonance magnétique ?", listOf("Absorption d'énergie radio par noyaux atomiques dans champ magnétique", "Vibration mécanique", "Résonance des ondes sonores", "Interaction électromagnétique"), "Science", ""),
            en = LocalizedContent("What is magnetic resonance?", listOf("Absorption of radio energy by atomic nuclei in a magnetic field", "Mechanical vibration", "Resonance of sound waves", "Electromagnetic interaction"), "Science", ""),
            zh = LocalizedContent("什么是磁共振？", listOf("原子核在磁场中吸收射频能量", "机械振动", "声波共振", "电磁相互作用"), "科学", ""),
            es = LocalizedContent("¿Qué es la resonancia magnética?", listOf("Absorción de energía de radio por núcleos atómicos en un campo magnético", "Vibración mecánica", "Resonancia de ondas sonoras", "Interacción electromagnética"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6084, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la pression osmotique ?", listOf("Pression nécessaire pour empêcher l'osmose à travers une membrane", "Pression atmosphérique en altitude", "Pression dans les vaisseaux sanguins", "Pression de vapeur saturante"), "Science", ""),
            en = LocalizedContent("What is osmotic pressure?", listOf("Pressure needed to prevent osmosis across a membrane", "Atmospheric pressure at altitude", "Pressure in blood vessels", "Vapor pressure"), "Science", ""),
            zh = LocalizedContent("什么是渗透压？", listOf("阻止跨膜渗透所需的压力", "高海拔处的大气压", "血管内的压力", "饱和蒸气压"), "科学", ""),
            es = LocalizedContent("¿Qué es la presión osmótica?", listOf("Presión necesaria para evitar la ósmosis a través de una membrana", "Presión atmosférica en altitud", "Presión en los vasos sanguíneos", "Presión de vapor saturado"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6085, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la différence entre ADN et ARN ?", listOf("L'ARN est simple brin avec uracile, l'ADN est double brin avec thymine", "Ce sont des synonymes", "L'ARN est dans le noyau, l'ADN dans le cytoplasme", "L'ADN est simple brin"), "Science", ""),
            en = LocalizedContent("What is the difference between DNA and RNA?", listOf("RNA is single-stranded with uracil, DNA is double-stranded with thymine", "They are synonyms", "RNA is in the nucleus, DNA in the cytoplasm", "DNA is single-stranded"), "Science", ""),
            zh = LocalizedContent("DNA和RNA有什么区别？", listOf("RNA是单链含尿嘧啶，DNA是双链含胸腺嘧啶", "它们是同义词", "RNA在细胞核中，DNA在细胞质中", "DNA是单链"), "科学", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre ADN y ARN?", listOf("El ARN es monocatenario con uracilo, el ADN es bicatenario con timina", "Son sinónimos", "El ARN está en el núcleo, el ADN en el citoplasma", "El ADN es monocatenario"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6086, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la chimioluminescence ?", listOf("Émission de lumière lors d'une réaction chimique", "Éclat dû à la chaleur", "Phosphorescence après exposition lumineuse", "Fluorescence sous UV"), "Science", ""),
            en = LocalizedContent("What is chemiluminescence?", listOf("Emission of light during a chemical reaction", "Glow due to heat", "Phosphorescence after light exposure", "Fluorescence under UV"), "Science", ""),
            zh = LocalizedContent("什么是化学发光？", listOf("化学反应过程中发出的光", "因热产生的辉光", "光照后的磷光", "紫外光下的荧光"), "科学", ""),
            es = LocalizedContent("¿Qué es la quimioluminiscencia?", listOf("Emisión de luz durante una reacción química", "Brillo debido al calor", "Fosforescencia tras exposición a la luz", "Fluorescencia bajo UV"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6087, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle des lysosomes dans la cellule ?", listOf("Digérer déchets cellulaires (recyclage intracellulaire)", "Produire de l'énergie", "Synthétiser des protéines", "Réguler le noyau"), "Science", ""),
            en = LocalizedContent("What is the role of lysosomes in the cell?", listOf("Digest cellular waste (intracellular recycling)", "Produce energy", "Synthesize proteins", "Regulate the nucleus"), "Science", ""),
            zh = LocalizedContent("溶酶体在细胞中的作用是什么？", listOf("消化细胞废物（细胞内回收）", "产生能量", "合成蛋白质", "调节细胞核"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel de los lisosomas en la célula?", listOf("Digieren desechos celulares (reciclaje intracelular)", "Producen energía", "Sintetizan proteínas", "Regulan el núcleo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6088, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'homeostasie ?", listOf("Maintien de l'équilibre interne de l'organisme", "Régulation de la pression sanguine uniquement", "Contrôle de la température uniquement", "Équilibre acido-basique"), "Science", ""),
            en = LocalizedContent("What is homeostasis?", listOf("Maintenance of the internal balance of the organism", "Regulation of blood pressure only", "Temperature control only", "Acid-base balance"), "Science", ""),
            zh = LocalizedContent("什么是稳态？", listOf("维持生物体内环境的平衡", "仅调节血压", "仅控制温度", "酸碱平衡"), "科学", ""),
            es = LocalizedContent("¿Qué es la homeostasis?", listOf("Mantenimiento del equilibrio interno del organismo", "Regulación de la presión sanguínea únicamente", "Control de la temperatura únicamente", "Equilibrio ácido-base"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6089, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'élément chimique le plus abondant dans la croûte terrestre ?", listOf("Oxygène (46,6%)", "Silicium (27,7%)", "Aluminium (8,1%)", "Fer (5%)"), "Science", ""),
            en = LocalizedContent("What is the most abundant chemical element in the Earth's crust?", listOf("Oxygen (46.6%)", "Silicon (27.7%)", "Aluminum (8.1%)", "Iron (5%)"), "Science", ""),
            zh = LocalizedContent("地壳中含量最丰富的化学元素是什么？", listOf("氧（46.6%）", "硅（27.7%）", "铝（8.1%）", "铁（5%）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el elemento químico más abundante en la corteza terrestre?", listOf("Oxígeno (46.6%)", "Silicio (27.7%)", "Aluminio (8.1%)", "Hierro (5%)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6090, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un catalyseur biologique ?", listOf("Une enzyme", "Une hormone", "Un anticorps", "Un coenzyme"), "Science", ""),
            en = LocalizedContent("What is a biological catalyst?", listOf("An enzyme", "A hormone", "An antibody", "A coenzyme"), "Science", ""),
            zh = LocalizedContent("什么是生物催化剂？", listOf("酶", "激素", "抗体", "辅酶"), "科学", ""),
            es = LocalizedContent("¿Qué es un catalizador biológico?", listOf("Una enzima", "Una hormona", "Un anticuerpo", "Una coenzima"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6091, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le principe de la chromatographie sur couche mince ?", listOf("Séparation de composés selon leur affinité pour une phase mobile/stationnaire", "Centrifugation de molécules", "Électrophorèse en gel", "Distillation moléculaire"), "Science", ""),
            en = LocalizedContent("What is the principle of thin-layer chromatography?", listOf("Separation of compounds based on their affinity for a mobile/stationary phase", "Centrifugation of molecules", "Gel electrophoresis", "Molecular distillation"), "Science", ""),
            zh = LocalizedContent("薄层色谱法的原理是什么？", listOf("根据化合物对流动相/固定相的亲和力进行分离", "分子离心", "凝胶电泳", "分子蒸馏"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principio de la cromatografía en capa fina?", listOf("Separación de compuestos según su afinidad por una fase móvil/estacionaria", "Centrifugación de moléculas", "Electroforesis en gel", "Destilación molecular"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6092, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un isotope radioactif ?", listOf("Noyau instable émettant un rayonnement en se désintégrant", "Atome avec nombre anormal d'électrons", "Molécule instable", "Ion fortement chargé"), "Science", ""),
            en = LocalizedContent("What is a radioactive isotope?", listOf("Unstable nucleus emitting radiation as it decays", "Atom with an abnormal number of electrons", "Unstable molecule", "Highly charged ion"), "Science", ""),
            zh = LocalizedContent("什么是放射性同位素？", listOf("不稳定的原子核在衰变时发出辐射", "电子数异常的原子", "不稳定的分子", "高电荷离子"), "科学", ""),
            es = LocalizedContent("¿Qué es un isótopo radiactivo?", listOf("Núcleo inestable que emite radiación al desintegrarse", "Átomo con un número anormal de electrones", "Molécula inestable", "Ión fuertemente cargado"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6093, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz protège la Terre des UV et est une forme d'oxygène ?", listOf("L'ozone (O₃)", "Le dioxyde de carbone (CO₂)", "L'hélium (He)", "L'oxygène (O₂)"), "Science", ""),
            en = LocalizedContent("Which gas protects the Earth from UV and is a form of oxygen?", listOf("Ozone (O₃)", "Carbon dioxide (CO₂)", "Helium (He)", "Oxygen (O₂)"), "Science", ""),
            zh = LocalizedContent("哪种气体保护地球免受紫外线伤害并且是氧气的一种形式？", listOf("臭氧（O₃）", "二氧化碳（CO₂）", "氦气（He）", "氧气（O₂）"), "科学", ""),
            es = LocalizedContent("¿Qué gas protege la Tierra de los rayos UV y es una forma de oxígeno?", listOf("Ozono (O₃)", "Dióxido de carbono (CO₂)", "Helio (He)", "Oxígeno (O₂)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6094, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la mécanique newtonienne ne peut pas décrire ?", listOf("Les vitesses proches de la lumière et les phénomènes quantiques", "Le mouvement des planètes", "La chute des corps", "Les ondes sonores"), "Science", ""),
            en = LocalizedContent("What can Newtonian mechanics not describe?", listOf("Speeds close to light and quantum phenomena", "Planetary motion", "Falling bodies", "Sound waves"), "Science", ""),
            zh = LocalizedContent("牛顿力学无法描述什么？", listOf("接近光速的速度和量子现象", "行星运动", "物体下落", "声波"), "科学", ""),
            es = LocalizedContent("¿Qué no puede describir la mecánica newtoniana?", listOf("Velocidades cercanas a la luz y fenómenos cuánticos", "El movimiento de los planetas", "La caída de los cuerpos", "Las ondas sonoras"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6095, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays le plus visité au monde ?", listOf("France (environ 90 millions de visiteurs/an)", "États-Unis", "Espagne", "Chine"), "Géographie", ""),
            en = LocalizedContent("What is the most visited country in the world?", listOf("France (about 90 million visitors/year)", "United States", "Spain", "China"), "Geography", ""),
            zh = LocalizedContent("世界上访问量最大的国家是哪个？", listOf("法国（每年约9000万游客）", "美国", "西班牙", "中国"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más visitado del mundo?", listOf("Francia (aproximadamente 90 millones de visitantes/año)", "Estados Unidos", "España", "China"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6096, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel monument symbolise la liberté aux États-Unis depuis 1886 ?", listOf("La Statue de la Liberté", "Le Monument de Washington", "La Maison Blanche", "L'Empire State Building"), "Géographie", ""),
            en = LocalizedContent("What monument has symbolized freedom in the United States since 1886?", listOf("The Statue of Liberty", "The Washington Monument", "The White House", "The Empire State Building"), "Geography", ""),
            zh = LocalizedContent("自1886年以来，哪个纪念碑象征着美国的自由？", listOf("自由女神像", "华盛顿纪念碑", "白宫", "帝国大厦"), "地理", ""),
            es = LocalizedContent("¿Qué monumento simboliza la libertad en Estados Unidos desde 1886?", listOf("La Estatua de la Libertad", "El Monumento a Washington", "La Casa Blanca", "El Empire State Building"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6097, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel site est surnommé 'La Ville rose' ?", listOf("Toulouse", "Montpellier", "Bordeaux", "Lyon"), "Géographie", ""),
            en = LocalizedContent("Which site is nicknamed 'The Pink City'?", listOf("Toulouse", "Montpellier", "Bordeaux", "Lyon"), "Geography", ""),
            zh = LocalizedContent("哪个地方被称为“玫瑰之城”？", listOf("图卢兹", "蒙彼利埃", "波尔多", "里昂"), "地理", ""),
            es = LocalizedContent("¿Qué sitio es apodado 'La Ciudad Rosa'?", listOf("Toulouse", "Montpellier", "Burdeos", "Lyon"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6099, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle ville est connue comme la 'Venise du Nord' ?", listOf("Amsterdam ou Bruges (selon les pays)", "Hambourg", "Stockholm", "Copenhague"), "Géographie", ""),
            en = LocalizedContent("Which city is known as the 'Venice of the North'?", listOf("Amsterdam or Bruges (depending on country)", "Hamburg", "Stockholm", "Copenhagen"), "Geography", ""),
            zh = LocalizedContent("哪个城市被称为“北方威尼斯”？", listOf("阿姆斯特丹或布鲁日（因国家而异）", "汉堡", "斯德哥尔摩", "哥本哈根"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es conocida como la 'Venecia del Norte'?", listOf("Ámsterdam o Brujas (según el país)", "Hamburgo", "Estocolmo", "Copenhague"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6100, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le site de Stonehenge ?", listOf("Angleterre (Royaume-Uni)", "Irlande", "Écosse", "Pays de Galles"), "Géographie", ""),
            en = LocalizedContent("In which country is Stonehenge located?", listOf("England (United Kingdom)", "Ireland", "Scotland", "Wales"), "Geography", ""),
            zh = LocalizedContent("巨石阵位于哪个国家？", listOf("英格兰（英国）", "爱尔兰", "苏格兰", "威尔士"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra Stonehenge?", listOf("Inglaterra (Reino Unido)", "Irlanda", "Escocia", "Gales"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6101, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du palais impérial de Pékin ?", listOf("Cité interdite", "Palais d'Été", "Temple du Ciel", "Palais de l'Harmonie"), "Géographie", ""),
            en = LocalizedContent("What is the name of the imperial palace in Beijing?", listOf("Forbidden City", "Summer Palace", "Temple of Heaven", "Palace of Harmony"), "Geography", ""),
            zh = LocalizedContent("北京的皇宫叫什么名字？", listOf("紫禁城", "颐和园", "天坛", "太和殿"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del palacio imperial en Pekín?", listOf("Ciudad Prohibida", "Palacio de Verano", "Templo del Cielo", "Palacio de la Armonía"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6103, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle ville accueille chaque année le Carnaval le plus célèbre du monde ?", listOf("Rio de Janeiro", "Venise", "New Orleans", "Trinidad"), "Géographie", ""),
            en = LocalizedContent("Which city hosts the most famous carnival in the world each year?", listOf("Rio de Janeiro", "Venice", "New Orleans", "Trinidad"), "Geography", ""),
            zh = LocalizedContent("哪个城市每年举办世界上最著名的狂欢节？", listOf("里约热内卢", "威尼斯", "新奥尔良", "特立尼达"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad acoge cada año el carnaval más famoso del mundo?", listOf("Río de Janeiro", "Venecia", "Nueva Orleans", "Trinidad"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6104, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la Sagrada Familia ?", listOf("Espagne (Barcelone)", "Portugal", "Italie", "France"), "Géographie", ""),
            en = LocalizedContent("In which country is the Sagrada Familia located?", listOf("Spain (Barcelona)", "Portugal", "Italy", "France"), "Geography", ""),
            zh = LocalizedContent("圣家堂位于哪个国家？", listOf("西班牙（巴塞罗那）", "葡萄牙", "意大利", "法国"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la Sagrada Familia?", listOf("España (Barcelona)", "Portugal", "Italia", "Francia"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 6105, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville est surnommée 'la capitale mondiale du jazz' ?", listOf("La Nouvelle-Orléans", "New York", "Chicago", "Memphis"), "Géographie", ""),
            en = LocalizedContent("Which city is nicknamed 'the jazz capital of the world'?", listOf("New Orleans", "New York", "Chicago", "Memphis"), "Geography", ""),
            zh = LocalizedContent("哪个城市被称为“世界爵士之都”？", listOf("新奥尔良", "纽约", "芝加哥", "孟菲斯"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es apodada 'la capital mundial del jazz'?", listOf("Nueva Orleans", "Nueva York", "Chicago", "Memphis"), "Geografía", "")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 6106, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le Colisée de Rome ?", listOf("Italie", "Grèce", "Vatican", "Espagne"), "Géographie", ""),
            en = LocalizedContent("In which country is the Colosseum of Rome located?", listOf("Italy", "Greece", "Vatican", "Spain"), "Geography", ""),
            zh = LocalizedContent("罗马斗兽场位于哪个国家？", listOf("意大利", "希腊", "梵蒂冈", "西班牙"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el Coliseo de Roma?", listOf("Italia", "Grecia", "Vaticano", "España"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 6107, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville est connue comme 'Le Sphinx et les Pyramides' ?", listOf("Gizeh (près du Caire, Égypte)", "Louxor", "Alexandrie", "Assouan"), "Géographie", ""),
            en = LocalizedContent("Which city is known as 'The Sphinx and the Pyramids'?", listOf("Giza (near Cairo, Egypt)", "Luxor", "Alexandria", "Aswan"), "Geography", ""),
            zh = LocalizedContent("哪个城市以“狮身人面像和金字塔”闻名？", listOf("吉萨（埃及开罗附近）", "卢克索", "亚历山大", "阿斯旺"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es conocida como 'La Esfinge y las Pirámides'?", listOf("Guiza (cerca de El Cairo, Egipto)", "Luxor", "Alejandría", "Asuán"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 6108, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le site archéologique de Pompéi ?", listOf("Italie", "Grèce", "Turquie", "Espagne"), "Géographie", ""),
            en = LocalizedContent("In which country is the archaeological site of Pompeii located?", listOf("Italy", "Greece", "Turkey", "Spain"), "Geography", ""),
            zh = LocalizedContent("庞贝古城遗址位于哪个国家？", listOf("意大利", "希腊", "土耳其", "西班牙"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el sitio arqueológico de Pompeya?", listOf("Italia", "Grecia", "Turquía", "España"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 6109, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle ville est la plus haute capitale mondiale (hors débat) ?", listOf("Quito (Équateur, 2 850 m) ou La Paz (Bolivie, 3 640 m pour siège gouvernement)", "La Paz", "Bogotá", "Addis-Abeba"), "Géographie", ""),
            en = LocalizedContent("Which city is the highest capital in the world (excluding debate)?", listOf("Quito (Ecuador, 2,850 m) or La Paz (Bolivia, 3,640 m for government seat)", "La Paz", "Bogotá", "Addis Ababa"), "Geography", ""),
            zh = LocalizedContent("哪个城市是世界上海拔最高的首都（排除争议）？", listOf("基多（厄瓜多尔，2850米）或拉巴斯（玻利维亚，政府所在地3640米）", "拉巴斯", "波哥大", "亚的斯亚贝巴"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es la capital más alta del mundo (sin debate)?", listOf("Quito (Ecuador, 2 850 m) o La Paz (Bolivia, 3 640 m para sede gubernamental)", "La Paz", "Bogotá", "Adís Abeba"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 6110, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel écrivain français est connu pour 'Le Père Goriot' et 'La Comédie humaine' ?", listOf("Honoré de Balzac", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Culture", ""),
            en = LocalizedContent("Which French writer is known for 'Le Père Goriot' and 'La Comédie humaine'?", listOf("Honoré de Balzac", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Culture", ""),
            zh = LocalizedContent("哪位法国作家以《高老头》和《人间喜剧》闻名？", listOf("奥诺雷·德·巴尔扎克", "维克多·雨果", "埃米尔·左拉", "古斯塔夫·福楼拜"), "文化", ""),
            es = LocalizedContent("¿Qué escritor francés es conocido por 'Le Père Goriot' y 'La Comédie humaine'?", listOf("Honoré de Balzac", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6111, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel poète symboliste a écrit 'Le Bateau ivre' ?", listOf("Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé", "Charles Baudelaire"), "Culture", ""),
            en = LocalizedContent("Which symbolist poet wrote 'Le Bateau ivre'?", listOf("Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé", "Charles Baudelaire"), "Culture", ""),
            zh = LocalizedContent("哪位象征主义诗人写了《醉舟》？", listOf("阿蒂尔·兰波", "保罗·魏尔伦", "斯特凡·马拉美", "夏尔·波德莱尔"), "文化", ""),
            es = LocalizedContent("¿Qué poeta simbolista escribió 'Le Bateau ivre'?", listOf("Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé", "Charles Baudelaire"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6112, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint 'Le Déjeuner sur l'herbe' (1863) ?", listOf("Édouard Manet", "Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas"), "Culture", ""),
            en = LocalizedContent("Who painted 'Le Déjeuner sur l'herbe' (1863)?", listOf("Édouard Manet", "Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas"), "Culture", ""),
            zh = LocalizedContent("谁画了《草地上的午餐》（1863年）？", listOf("爱德华·马奈", "克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "埃德加·德加"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'Le Déjeuner sur l'herbe' (1863)?", listOf("Édouard Manet", "Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6113, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel architecte français est connu pour son style 'Beaux-Arts' ?", listOf("Charles Garnier (Opéra de Paris)", "Gustave Eiffel", "Le Corbusier", "Auguste Perret"), "Culture", ""),
            en = LocalizedContent("Which French architect is known for his 'Beaux-Arts' style?", listOf("Charles Garnier (Paris Opera)", "Gustave Eiffel", "Le Corbusier", "Auguste Perret"), "Culture", ""),
            zh = LocalizedContent("哪位法国建筑师以其“布杂艺术”风格闻名？", listOf("夏尔·加尼叶（巴黎歌剧院）", "古斯塔夫·埃菲尔", "勒·柯布西耶", "奥古斯特·佩雷"), "文化", ""),
            es = LocalizedContent("¿Qué arquitecto francés es conocido por su estilo 'Beaux-Arts'?", listOf("Charles Garnier (Ópera de París)", "Gustave Eiffel", "Le Corbusier", "Auguste Perret"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6114, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a écrit 'Les Trois Mousquetaires' ?", listOf("Alexandre Dumas (père)", "Victor Hugo", "Jules Verne", "Honoré de Balzac"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'The Three Musketeers'?", listOf("Alexandre Dumas (father)", "Victor Hugo", "Jules Verne", "Honoré de Balzac"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《三个火枪手》？", listOf("大仲马", "维克多·雨果", "儒勒·凡尔纳", "奥诺雷·德·巴尔扎克"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Los tres mosqueteros'?", listOf("Alexandre Dumas (padre)", "Victor Hugo", "Jules Verne", "Honoré de Balzac"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6115, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'inventeur du cinématographe ?", listOf("Frères Lumière (Auguste et Louis)", "Georges Méliès", "Thomas Edison", "Nikola Tesla"), "Culture", ""),
            en = LocalizedContent("Who invented the cinematograph?", listOf("Lumière brothers (Auguste and Louis)", "Georges Méliès", "Thomas Edison", "Nikola Tesla"), "Culture", ""),
            zh = LocalizedContent("谁发明了电影放映机？", listOf("卢米埃尔兄弟（奥古斯特和路易）", "乔治·梅里爱", "托马斯·爱迪生", "尼古拉·特斯拉"), "文化", ""),
            es = LocalizedContent("¿Quién inventó el cinematógrafo?", listOf("Hermanos Lumière (Auguste y Louis)", "Georges Méliès", "Thomas Edison", "Nikola Tesla"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6116, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre français est associé aux nénuphars et à Giverny ?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas", "Paul Cézanne"), "Culture", ""),
            en = LocalizedContent("Which French painter is associated with water lilies and Giverny?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas", "Paul Cézanne"), "Culture", ""),
            zh = LocalizedContent("哪位法国画家与睡莲和吉维尼有关？", listOf("克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "埃德加·德加", "保罗·塞尚"), "文化", ""),
            es = LocalizedContent("¿Qué pintor francés está asociado con los nenúfares y Giverny?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas", "Paul Cézanne"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6117, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Germinal' et 'Nana' ?", listOf("Émile Zola", "Gustave Flaubert", "Guy de Maupassant", "Victor Hugo"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Germinal' and 'Nana'?", listOf("Émile Zola", "Gustave Flaubert", "Guy de Maupassant", "Victor Hugo"), "Culture", ""),
            zh = LocalizedContent("谁写了《萌芽》和《娜娜》？", listOf("埃米尔·左拉", "古斯塔夫·福楼拜", "居伊·德·莫泊桑", "维克多·雨果"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Germinal' y 'Nana'?", listOf("Émile Zola", "Gustave Flaubert", "Guy de Maupassant", "Victor Hugo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6118, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe français a cofondé le Café de Flore comme lieu de réunion intellectuelle ?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Albert Cohen"), "Culture", ""),
            en = LocalizedContent("Which French philosopher co-founded the Café de Flore as an intellectual meeting place?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Albert Cohen"), "Culture", ""),
            zh = LocalizedContent("哪位法国哲学家共同创立了花神咖啡馆作为知识分子聚会场所？", listOf("让-保罗·萨特", "阿尔贝·加缪", "西蒙娜·德·波伏娃", "阿尔贝·科恩"), "文化", ""),
            es = LocalizedContent("¿Qué filósofo francés cofundó el Café de Flore como lugar de reunión intelectual?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Albert Cohen"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6119, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur est connu pour 'À bout de souffle' et la Nouvelle Vague ?", listOf("Jean-Luc Godard", "François Truffaut", "Claude Chabrol", "Jacques Rivette"), "Culture", ""),
            en = LocalizedContent("Which director is known for 'Breathless' and the French New Wave?", listOf("Jean-Luc Godard", "François Truffaut", "Claude Chabrol", "Jacques Rivette"), "Culture", ""),
            zh = LocalizedContent("哪位导演以《筋疲力尽》和法国新浪潮闻名？", listOf("让-吕克·戈达尔", "弗朗索瓦·特吕弗", "克洛德·夏布洛尔", "雅克·里维特"), "文化", ""),
            es = LocalizedContent("¿Qué director es conocido por 'Al final de la escapada' y la Nouvelle Vague?", listOf("Jean-Luc Godard", "François Truffaut", "Claude Chabrol", "Jacques Rivette"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6120, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le festival de cinéma le plus célèbre au monde ?", listOf("Festival de Cannes", "Mostra de Venise", "Berlinale", "Sundance"), "Culture", ""),
            en = LocalizedContent("What is the most famous film festival in the world?", listOf("Cannes Film Festival", "Venice Film Festival", "Berlin International Film Festival", "Sundance Film Festival"), "Culture", ""),
            zh = LocalizedContent("世界上最著名的电影节是什么？", listOf("戛纳电影节", "威尼斯电影节", "柏林国际电影节", "圣丹斯电影节"), "文化", ""),
            es = LocalizedContent("¿Cuál es el festival de cine más famoso del mundo?", listOf("Festival de Cannes", "Mostra de Venecia", "Berlinale", "Sundance"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6121, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel courant artistique du XIXe siècle est associé à Monet et Renoir ?", listOf("L'Impressionnisme", "Le Pointillisme", "Le Fauvisme", "Le Symbolisme"), "Culture", ""),
            en = LocalizedContent("Which 19th-century artistic movement is associated with Monet and Renoir?", listOf("Impressionism", "Pointillism", "Fauvism", "Symbolism"), "Culture", ""),
            zh = LocalizedContent("哪个19世纪艺术运动与莫奈和雷诺阿有关？", listOf("印象派", "点彩派", "野兽派", "象征主义"), "文化", ""),
            es = LocalizedContent("¿Qué movimiento artístico del siglo XIX está asociado con Monet y Renoir?", listOf("El Impresionismo", "El Puntillismo", "El Fauvismo", "El Simbolismo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'Cyrano de Bergerac' (1897) ?", listOf("Edmond Rostand", "Victor Hugo", "Alfred de Musset", "Théophile Gautier"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Cyrano de Bergerac' (1897)?", listOf("Edmond Rostand", "Victor Hugo", "Alfred de Musset", "Théophile Gautier"), "Culture", ""),
            zh = LocalizedContent("哪位作家写了《西哈诺·德·贝热拉克》（1897年）？", listOf("埃德蒙·罗斯坦", "维克多·雨果", "阿尔弗雷德·德·缪塞", "泰奥菲尔·戈蒂埃"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Cyrano de Bergerac' (1897)?", listOf("Edmond Rostand", "Victor Hugo", "Alfred de Musset", "Théophile Gautier"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6123, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de 'Bonjour Tristesse' ?", listOf("Françoise Sagan", "Simone de Beauvoir", "Marguerite Yourcenar", "Colette"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'Bonjour Tristesse'?", listOf("Françoise Sagan", "Simone de Beauvoir", "Marguerite Yourcenar", "Colette"), "Culture", ""),
            zh = LocalizedContent("《你好，忧愁》的作者是谁？", listOf("弗朗索瓦丝·萨冈", "西蒙娜·德·波伏娃", "玛格丽特·尤瑟纳尔", "科莱特"), "文化", ""),
            es = LocalizedContent("¿Quién es la autora de 'Buenos días, tristeza'?", listOf("Françoise Sagan", "Simone de Beauvoir", "Marguerite Yourcenar", "Colette"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6124, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel monument parisien est surnommé 'La Dame de Fer' ?", listOf("La Tour Eiffel", "Notre-Dame", "L'Arc de Triomphe", "L'Opéra Garnier"), "Culture", ""),
            en = LocalizedContent("Which Parisian monument is nicknamed 'The Iron Lady'?", listOf("The Eiffel Tower", "Notre-Dame", "The Arc de Triomphe", "The Palais Garnier"), "Culture", ""),
            zh = LocalizedContent("哪个巴黎纪念碑被称为“铁娘子”？", listOf("埃菲尔铁塔", "巴黎圣母院", "凯旋门", "巴黎歌剧院"), "文化", ""),
            es = LocalizedContent("¿Qué monumento parisino es apodado 'La Dama de Hierro'?", listOf("La Torre Eiffel", "Notre-Dame", "El Arco de Triunfo", "La Ópera Garnier"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 6125, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la phylogénétique ?", listOf("Étude des relations évolutives entre espèces", "Étude de la génétique des plantes", "Classification des espèces actuelles", "Étude des fossiles"), "Science", ""),
            en = LocalizedContent("What is phylogenetics?", listOf("Study of evolutionary relationships among species", "Study of plant genetics", "Classification of current species", "Study of fossils"), "Science", ""),
            zh = LocalizedContent("什么是系统发育学？", listOf("研究物种间的进化关系", "植物遗传学研究", "现存物种的分类", "化石研究"), "科学", ""),
            es = LocalizedContent("¿Qué es la filogenética?", listOf("Estudio de las relaciones evolutivas entre especies", "Estudio de la genética de las plantas", "Clasificación de las especies actuales", "Estudio de los fósiles"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6126, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la plasticité synaptique ?", listOf("Capacité des synapses à se modifier avec l'expérience", "Formation de nouvelles synapses", "Disparition de neurones", "Communication chimique entre neurones"), "Science", ""),
            en = LocalizedContent("What is synaptic plasticity?", listOf("Ability of synapses to change with experience", "Formation of new synapses", "Loss of neurons", "Chemical communication between neurons"), "Science", ""),
            zh = LocalizedContent("什么是突触可塑性？", listOf("突触根据经验改变的能力", "新突触的形成", "神经元的消失", "神经元之间的化学通讯"), "科学", ""),
            es = LocalizedContent("¿Qué es la plasticidad sináptica?", listOf("Capacidad de las sinapsis para modificarse con la experiencia", "Formación de nuevas sinapsis", "Desaparición de neuronas", "Comunicación química entre neuronas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6127, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le rôle de l'ARN de transfert (ARNt) ?", listOf("Transporter les acides aminés vers le ribosome", "Copier l'ADN", "Réguler les gènes", "Synthétiser les protéines directement"), "Science", ""),
            en = LocalizedContent("What is the role of transfer RNA (tRNA)?", listOf("Transport amino acids to the ribosome", "Copy DNA", "Regulate genes", "Synthesize proteins directly"), "Science", ""),
            zh = LocalizedContent("转移RNA（tRNA）的作用是什么？", listOf("将氨基酸转运至核糖体", "复制DNA", "调控基因", "直接合成蛋白质"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel del ARN de transferencia (ARNt)?", listOf("Transportar los aminoácidos al ribosoma", "Copiar el ADN", "Regular los genes", "Sintetizar proteínas directamente"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6128, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'immunité adaptative ?", listOf("Réponse immunitaire spécifique aux antigènes (lymphocytes B et T)", "Réponse immunitaire non spécifique", "Système de vaccination", "Barrières physiques de l'organisme"), "Science", ""),
            en = LocalizedContent("What is adaptive immunity?", listOf("Specific immune response to antigens (B and T lymphocytes)", "Non-specific immune response", "Vaccination system", "Physical barriers of the body"), "Science", ""),
            zh = LocalizedContent("什么是适应性免疫？", listOf("针对抗原的特异性免疫反应（B淋巴细胞和T淋巴细胞）", "非特异性免疫反应", "疫苗接种系统", "身体的物理屏障"), "科学", ""),
            es = LocalizedContent("¿Qué es la inmunidad adaptativa?", listOf("Respuesta inmunitaria específica a antígenos (linfocitos B y T)", "Respuesta inmunitaria inespecífica", "Sistema de vacunación", "Barreras físicas del organismo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le CRISPR-Cas9 ?", listOf("Outil d'édition génétique permettant de couper et modifier l'ADN", "Vaccin génétique", "Technique de clonage", "Séquençage du génome"), "Science", ""),
            en = LocalizedContent("What is CRISPR-Cas9?", listOf("Genetic editing tool that can cut and modify DNA", "Genetic vaccine", "Cloning technique", "Genome sequencing"), "Science", ""),
            zh = LocalizedContent("什么是CRISPR-Cas9？", listOf("能够切割和修改DNA的基因编辑工具", "基因疫苗", "克隆技术", "基因组测序"), "科学", ""),
            es = LocalizedContent("¿Qué es CRISPR-Cas9?", listOf("Herramienta de edición genética que permite cortar y modificar el ADN", "Vacuna genética", "Técnica de clonación", "Secuenciación del genoma"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6130, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la chimiotaxie ?", listOf("Mouvement d'un organisme dirigé par un gradient chimique", "Réaction chimique dans les cellules", "Digestion par voie chimique", "Transport chimique dans le sang"), "Science", ""),
            en = LocalizedContent("What is chemotaxis?", listOf("Movement of an organism directed by a chemical gradient", "Chemical reaction in cells", "Digestion by chemical means", "Chemical transport in blood"), "Science", ""),
            zh = LocalizedContent("什么是趋化性？", listOf("生物体受化学梯度引导的运动", "细胞内的化学反应", "化学消化", "血液中的化学运输"), "科学", ""),
            es = LocalizedContent("¿Qué es la quimiotaxis?", listOf("Movimiento de un organismo dirigido por un gradiente químico", "Reacción química en las células", "Digestión por vía química", "Transporte químico en la sangre"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6131, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle du corps calleux dans le cerveau ?", listOf("Relier les deux hémisphères cérébraux", "Contrôler les émotions", "Gérer la mémoire à long terme", "Réguler la respiration"), "Science", ""),
            en = LocalizedContent("What is the role of the corpus callosum in the brain?", listOf("Connect the two cerebral hemispheres", "Control emotions", "Manage long-term memory", "Regulate breathing"), "Science", ""),
            zh = LocalizedContent("胼胝体在大脑中的作用是什么？", listOf("连接左右大脑半球", "控制情绪", "管理长期记忆", "调节呼吸"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel del cuerpo calloso en el cerebro?", listOf("Conectar los dos hemisferios cerebrales", "Controlar las emociones", "Gestionar la memoria a largo plazo", "Regular la respiración"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6132, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la sénescence cellulaire ?", listOf("Arrêt permanent de la division cellulaire avec vieillissement", "Mort cellulaire programmée", "Division incontrôlée des cellules", "Transformation en cellule souche"), "Science", ""),
            en = LocalizedContent("What is cellular senescence?", listOf("Permanent arrest of cell division with aging", "Programmed cell death", "Uncontrolled cell division", "Transformation into stem cell"), "Science", ""),
            zh = LocalizedContent("什么是细胞衰老？", listOf("细胞分裂永久停止并伴随老化", "程序性细胞死亡", "细胞不受控制的增殖", "转化为干细胞"), "科学", ""),
            es = LocalizedContent("¿Qué es la senescencia celular?", listOf("Detención permanente de la división celular con envejecimiento", "Muerte celular programada", "División incontrolada de las células", "Transformación en célula madre"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6133, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le rôle des protéines chaperonnes ?", listOf("Aider au repliement correct des protéines", "Dégrader les protéines défectueuses", "Transporter les protéines", "Synthétiser les acides aminés"), "Science", ""),
            en = LocalizedContent("What is the role of chaperone proteins?", listOf("Help in correct protein folding", "Degrade defective proteins", "Transport proteins", "Synthesize amino acids"), "Science", ""),
            zh = LocalizedContent("分子伴侣蛋白的作用是什么？", listOf("帮助蛋白质正确折叠", "降解有缺陷的蛋白质", "运输蛋白质", "合成氨基酸"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel de las proteínas chaperonas?", listOf("Ayudar al plegamiento correcto de las proteínas", "Degradar las proteínas defectuosas", "Transportar las proteínas", "Sintetizar los aminoácidos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6134, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le microbiome humain ?", listOf("Ensemble des micro-organismes vivant dans et sur notre corps", "Génome humain complet", "Système immunitaire inné", "Flore intestinale uniquement"), "Science", ""),
            en = LocalizedContent("What is the human microbiome?", listOf("All microorganisms living in and on our body", "Complete human genome", "Innate immune system", "Intestinal flora only"), "Science", ""),
            zh = LocalizedContent("什么是人体微生物组？", listOf("生活在人体内和体表的所有微生物", "完整的人类基因组", "先天免疫系统", "仅肠道菌群"), "科学", ""),
            es = LocalizedContent("¿Qué es el microbioma humano?", listOf("Conjunto de microorganismos que viven dentro y sobre nuestro cuerpo", "Genoma humano completo", "Sistema inmunitario innato", "Solo flora intestinal"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 6135, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le contrat social selon Rousseau ?", listOf("Accord implicite par lequel les individus cèdent certaines libertés pour vivre en société", "Contrat entre l'État et les citoyens", "Accord commercial entre nations", "Pacte entre dirigeants"), "Philosophie", ""),
            en = LocalizedContent("What is the social contract according to Rousseau?", listOf("Implicit agreement by which individuals give up certain freedoms to live in society", "Contract between the state and citizens", "Commercial agreement between nations", "Pact between leaders"), "Philosophy", ""),
            zh = LocalizedContent("根据卢梭，什么是社会契约？", listOf("个体为在社会中生活而放弃某些自由的隐含协议", "国家与公民之间的契约", "国家间的商业协议", "领导人之间的协议"), "哲学", ""),
            es = LocalizedContent("¿Qué es el contrato social según Rousseau?", listOf("Acuerdo implícito por el cual los individuos ceden ciertas libertades para vivir en sociedad", "Contrato entre el Estado y los ciudadanos", "Acuerdo comercial entre naciones", "Pacto entre dirigentes"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6136, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'éthique de la vertu (Aristote) ?", listOf("Développer des vertus morales comme le courage et la sagesse", "Respecter des règles universelles", "Maximiser le bonheur collectif", "Obéir à l'État"), "Philosophie", ""),
            en = LocalizedContent("What is virtue ethics (Aristotle)?", listOf("Developing moral virtues like courage and wisdom", "Respecting universal rules", "Maximizing collective happiness", "Obeying the state"), "Philosophy", ""),
            zh = LocalizedContent("什么是美德伦理学（亚里士多德）？", listOf("培养道德美德，如勇气和智慧", "遵守普遍规则", "最大化集体幸福", "服从国家"), "哲学", ""),
            es = LocalizedContent("¿Qué es la ética de la virtud (Aristóteles)?", listOf("Desarrollar virtudes morales como el coraje y la sabiduría", "Respetar reglas universales", "Maximizar la felicidad colectiva", "Obedecer al Estado"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6137, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a dit 'L'enfer, c'est les autres' ?", listOf("Jean-Paul Sartre (Huis clos)", "Albert Camus", "Simone de Beauvoir", "Friedrich Nietzsche"), "Philosophie", ""),
            en = LocalizedContent("Who said 'Hell is other people'?", listOf("Jean-Paul Sartre (No Exit)", "Albert Camus", "Simone de Beauvoir", "Friedrich Nietzsche"), "Philosophy", ""),
            zh = LocalizedContent("谁说过'他人即地狱'？", listOf("让-保罗·萨特（《禁闭》）", "阿尔贝·加缪", "西蒙娜·德·波伏娃", "弗里德里希·尼采"), "哲学", ""),
            es = LocalizedContent("¿Quién dijo 'El infierno son los otros'?", listOf("Jean-Paul Sartre (A puerta cerrada)", "Albert Camus", "Simone de Beauvoir", "Friedrich Nietzsche"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6138, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'impératif catégorique de Kant ?", listOf("Agis selon une maxime que tu pourrais vouloir universelle", "Fais le bien et évite le mal", "Maximise le bonheur", "Respecte la loi"), "Philosophie", ""),
            en = LocalizedContent("What is Kant's categorical imperative?", listOf("Act according to a maxim that you could will to be universal", "Do good and avoid evil", "Maximize happiness", "Respect the law"), "Philosophy", ""),
            zh = LocalizedContent("什么是康德的绝对命令？", listOf("按照你能同时意愿它成为普遍法则的准则行动", "行善避恶", "最大化幸福", "遵守法律"), "哲学", ""),
            es = LocalizedContent("¿Qué es el imperativo categórico de Kant?", listOf("Actúa según una máxima que puedas querer que sea universal", "Haz el bien y evita el mal", "Maximiza la felicidad", "Respeta la ley"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6139, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le stoïcisme ?", listOf("Philosophie prônant l'acceptation de ce qu'on ne peut contrôler", "Philosophie du plaisir", "Cynisme philosophique", "Matérialisme dialectique"), "Philosophie", ""),
            en = LocalizedContent("What is Stoicism?", listOf("Philosophy advocating acceptance of what one cannot control", "Philosophy of pleasure", "Philosophical cynicism", "Dialectical materialism"), "Philosophy", ""),
            zh = LocalizedContent("什么是斯多葛主义？", listOf("主张接受无法控制之事的哲学", "享乐主义哲学", "哲学犬儒主义", "辩证唯物主义"), "哲学", ""),
            es = LocalizedContent("¿Qué es el estoicismo?", listOf("Filosofía que aboga por la aceptación de lo que no se puede controlar", "Filosofía del placer", "Cinismo filosófico", "Materialismo dialéctico"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6140, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le fondateur de l'académie de Platon à Athènes ?", listOf("Platon lui-même (387 av. J.-C.)", "Aristote", "Socrate", "Pythagore"), "Philosophie", ""),
            en = LocalizedContent("Who founded Plato's Academy in Athens?", listOf("Plato himself (387 BC)", "Aristotle", "Socrates", "Pythagoras"), "Philosophy", ""),
            zh = LocalizedContent("谁在雅典创立了柏拉图学园？", listOf("柏拉图本人（公元前387年）", "亚里士多德", "苏格拉底", "毕达哥拉斯"), "哲学", ""),
            es = LocalizedContent("¿Quién fundó la Academia de Platón en Atenas?", listOf("El propio Platón (387 a.C.)", "Aristóteles", "Sócrates", "Pitágoras"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6141, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'éthique conséquentialiste ?", listOf("Les actions sont jugées selon leurs conséquences", "Les actions sont jugées selon leur conformité à des règles", "Les actions sont jugées selon les vertus", "Les actions sont jugées selon l'intention"), "Philosophie", ""),
            en = LocalizedContent("What is consequentialist ethics?", listOf("Actions are judged by their consequences", "Actions are judged by their conformity to rules", "Actions are judged by virtues", "Actions are judged by intention"), "Philosophy", ""),
            zh = LocalizedContent("什么是后果主义伦理学？", listOf("根据行为的后果判断行为", "根据行为是否符合规则判断", "根据美德判断行为", "根据意图判断行为"), "哲学", ""),
            es = LocalizedContent("¿Qué es la ética consecuencialista?", listOf("Las acciones se juzgan por sus consecuencias", "Las acciones se juzgan por su conformidad con las reglas", "Las acciones se juzgan por las virtudes", "Las acciones se juzgan por la intención"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6142, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a développé la théorie de la justice comme équité ?", listOf("John Rawls", "Robert Nozick", "Amartya Sen", "Michael Sandel"), "Philosophie", ""),
            en = LocalizedContent("Who developed the theory of justice as fairness?", listOf("John Rawls", "Robert Nozick", "Amartya Sen", "Michael Sandel"), "Philosophy", ""),
            zh = LocalizedContent("谁提出了作为公平的正义理论？", listOf("约翰·罗尔斯", "罗伯特·诺齐克", "阿马蒂亚·森", "迈克尔·桑德尔"), "哲学", ""),
            es = LocalizedContent("¿Quién desarrolló la teoría de la justicia como equidad?", listOf("John Rawls", "Robert Nozick", "Amartya Sen", "Michael Sandel"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6143, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le nihilisme ?", listOf("Rejet des valeurs et croyances fondamentales", "Philosophie du plaisir", "Acceptation totale de la vie", "Doctrine de l'inaction"), "Philosophie", ""),
            en = LocalizedContent("What is nihilism?", listOf("Rejection of fundamental values and beliefs", "Philosophy of pleasure", "Total acceptance of life", "Doctrine of inaction"), "Philosophy", ""),
            zh = LocalizedContent("什么是虚无主义？", listOf("拒绝基本价值观和信仰", "享乐主义哲学", "完全接受生活", "无为主义"), "哲学", ""),
            es = LocalizedContent("¿Qué es el nihilismo?", listOf("Rechazo de valores y creencias fundamentales", "Filosofía del placer", "Aceptación total de la vida", "Doctrina de la inacción"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6144, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la philosophie bouddhiste de l'impermanence ?", listOf("Tout est en changement constant, rien n'est permanent", "La souffrance est inévitable", "La méditation libère de la souffrance", "Le nirvana est le but ultime"), "Philosophie", ""),
            en = LocalizedContent("What is the Buddhist philosophy of impermanence?", listOf("Everything is in constant change, nothing is permanent", "Suffering is inevitable", "Meditation liberates from suffering", "Nirvana is the ultimate goal"), "Philosophy", ""),
            zh = LocalizedContent("什么是佛教的无常哲学？", listOf("一切都在不断变化，没有什么是永恒的", "痛苦是不可避免的", "冥想能解脱痛苦", "涅槃是终极目标"), "哲学", ""),
            es = LocalizedContent("¿Qué es la filosofía budista de la impermanencia?", listOf("Todo está en constante cambio, nada es permanente", "El sufrimiento es inevitable", "La meditación libera del sufrimiento", "El nirvana es la meta última"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 6145, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le WebAssembly ?", listOf("Bytecode portable pour le web permettant des performances natives", "Nouveau langage de programmation web", "Protocole de communication web", "API JavaScript avancée"), "Tech", ""),
            en = LocalizedContent("What is WebAssembly?", listOf("Portable bytecode for the web enabling native-like performance", "New web programming language", "Web communication protocol", "Advanced JavaScript API"), "Technology", ""),
            zh = LocalizedContent("什么是WebAssembly？", listOf("用于Web的可移植字节码，实现接近原生的性能", "新的Web编程语言", "Web通信协议", "高级JavaScript API"), "科技", ""),
            es = LocalizedContent("¿Qué es WebAssembly?", listOf("Bytecode portátil para la web que permite rendimiento nativo", "Nuevo lenguaje de programación web", "Protocolo de comunicación web", "API avanzada de JavaScript"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6146, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le edge computing ?", listOf("Traitement des données proche de la source (périphérie)", "Cloud computing décentralisé", "Réseau 5G avancé", "Serveur de cache distant"), "Tech", ""),
            en = LocalizedContent("What is edge computing?", listOf("Data processing close to the source (edge)", "Decentralized cloud computing", "Advanced 5G network", "Remote cache server"), "Technology", ""),
            zh = LocalizedContent("什么是边缘计算？", listOf("在数据源附近（边缘）处理数据", "去中心化云计算", "高级5G网络", "远程缓存服务器"), "科技", ""),
            es = LocalizedContent("¿Qué es la computación en el borde?", listOf("Procesamiento de datos cerca de la fuente (borde)", "Computación en la nube descentralizada", "Red 5G avanzada", "Servidor de caché remoto"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6148, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel protocole sécurise les emails avec chiffrement de bout en bout ?", listOf("PGP (Pretty Good Privacy) / S/MIME", "SMTP", "IMAP", "POP3"), "Tech", ""),
            en = LocalizedContent("Which protocol secures emails with end-to-end encryption?", listOf("PGP (Pretty Good Privacy) / S/MIME", "SMTP", "IMAP", "POP3"), "Technology", ""),
            zh = LocalizedContent("哪个协议使用端到端加密保护电子邮件？", listOf("PGP（Pretty Good Privacy）/ S/MIME", "SMTP", "IMAP", "POP3"), "科技", ""),
            es = LocalizedContent("¿Qué protocolo asegura los correos electrónicos con cifrado de extremo a extremo?", listOf("PGP (Pretty Good Privacy) / S/MIME", "SMTP", "IMAP", "POP3"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6149, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'ingénierie logicielle agile ?", listOf("Développement itératif avec feedbacks réguliers du client", "Développement en cascade planifié", "Programmation sans documentation", "Développement open-source"), "Tech", ""),
            en = LocalizedContent("What is agile software engineering?", listOf("Iterative development with regular customer feedback", "Planned waterfall development", "Programming without documentation", "Open-source development"), "Technology", ""),
            zh = LocalizedContent("什么是敏捷软件工程？", listOf("迭代开发，定期获取客户反馈", "计划性瀑布开发", "无文档编程", "开源开发"), "科技", ""),
            es = LocalizedContent("¿Qué es la ingeniería de software ágil?", listOf("Desarrollo iterativo con retroalimentación regular del cliente", "Desarrollo en cascada planificado", "Programación sin documentación", "Desarrollo de código abierto"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6150, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le machine learning supervisé ?", listOf("Apprentissage avec des données étiquetées", "Apprentissage sans données", "Apprentissage par récompenses", "Apprentissage non structuré"), "Tech", ""),
            en = LocalizedContent("What is supervised machine learning?", listOf("Learning with labeled data", "Learning without data", "Learning by rewards", "Unstructured learning"), "Technology", ""),
            zh = LocalizedContent("什么是监督式机器学习？", listOf("使用标记数据学习", "无数据学习", "通过奖励学习", "非结构化学习"), "科技", ""),
            es = LocalizedContent("¿Qué es el aprendizaje automático supervisado?", listOf("Aprendizaje con datos etiquetados", "Aprendizaje sin datos", "Aprendizaje por recompensas", "Aprendizaje no estructurado"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6151, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la virtualisation ?", listOf("Création de versions virtuelles de ressources informatiques", "Simulation 3D", "Réalité virtuelle", "Partage de ressources réseau"), "Tech", ""),
            en = LocalizedContent("What is virtualization?", listOf("Creation of virtual versions of computing resources", "3D simulation", "Virtual reality", "Network resource sharing"), "Technology", ""),
            zh = LocalizedContent("什么是虚拟化？", listOf("创建计算资源的虚拟版本", "3D模拟", "虚拟现实", "网络资源共享"), "科技", ""),
            es = LocalizedContent("¿Qué es la virtualización?", listOf("Creación de versiones virtuales de recursos informáticos", "Simulación 3D", "Realidad virtual", "Compartición de recursos de red"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6152, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un algorithme de tri rapide (Quicksort) ?", listOf("Algorithme divisant récursivement autour d'un pivot", "Algorithme comparant paires adjacentes", "Algorithme de fusion de listes", "Algorithme de recherche binaire"), "Tech", ""),
            en = LocalizedContent("What is the Quicksort algorithm?", listOf("Algorithm that recursively divides around a pivot", "Algorithm comparing adjacent pairs", "Algorithm merging lists", "Binary search algorithm"), "Technology", ""),
            zh = LocalizedContent("什么是快速排序算法？", listOf("围绕枢轴递归划分的算法", "比较相邻对的算法", "合并列表的算法", "二分查找算法"), "科技", ""),
            es = LocalizedContent("¿Qué es el algoritmo de ordenamiento rápido (Quicksort)?", listOf("Algoritmo que divide recursivamente alrededor de un pivote", "Algoritmo que compara pares adyacentes", "Algoritmo de fusión de listas", "Algoritmo de búsqueda binaria"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6153, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le hachage cryptographique ?", listOf("Fonction transformant données en empreinte fixe irréversible", "Chiffrement des données", "Compression des fichiers", "Signature numérique"), "Tech", ""),
            en = LocalizedContent("What is cryptographic hashing?", listOf("Function that transforms data into a fixed irreversible fingerprint", "Data encryption", "File compression", "Digital signature"), "Technology", ""),
            zh = LocalizedContent("什么是密码学哈希？", listOf("将数据转换为固定不可逆指纹的函数", "数据加密", "文件压缩", "数字签名"), "科技", ""),
            es = LocalizedContent("¿Qué es el hash criptográfico?", listOf("Función que transforma datos en una huella fija irreversible", "Cifrado de datos", "Compresión de archivos", "Firma digital"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 6154, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que Terraform ?", listOf("Outil d'infrastructure as code pour provisionner des ressources cloud", "Langage de programmation", "Base de données", "Framework web"), "Tech", ""),
            en = LocalizedContent("What is Terraform?", listOf("Infrastructure as code tool for provisioning cloud resources", "Programming language", "Database", "Web framework"), "Technology", ""),
            zh = LocalizedContent("什么是Terraform？", listOf("用于配置云资源的基础设施即代码工具", "编程语言", "数据库", "Web框架"), "科技", ""),
            es = LocalizedContent("¿Qué es Terraform?", listOf("Herramienta de infraestructura como código para aprovisionar recursos en la nube", "Lenguaje de programación", "Base de datos", "Framework web"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7000, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la constante de Boltzmann ?", listOf("Constante reliant température et énergie thermique (1,38×10⁻²³ J/K)", "Vitesse de la lumière", "Constante de gravitation", "Charge de l'électron"), "Science", ""),
            en = LocalizedContent("What is the Boltzmann constant?", listOf("Constant relating temperature and thermal energy (1.38×10⁻²³ J/K)", "Speed of light", "Gravitational constant", "Electron charge"), "Science", ""),
            zh = LocalizedContent("什么是玻尔兹曼常数？", listOf("联系温度和热能的常数（1.38×10⁻²³ J/K）", "光速", "引力常数", "电子电荷"), "科学", ""),
            es = LocalizedContent("¿Qué es la constante de Boltzmann?", listOf("Constante que relaciona temperatura y energía térmica (1,38×10⁻²³ J/K)", "Velocidad de la luz", "Constante de gravitación", "Carga del electrón"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7001, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le type de radiation le plus pénétrant ?", listOf("Rayonnement gamma", "Rayonnement alpha", "Rayonnement bêta", "Rayonnement X"), "Science", ""),
            en = LocalizedContent("Which type of radiation is the most penetrating?", listOf("Gamma radiation", "Alpha radiation", "Beta radiation", "X-ray radiation"), "Science", ""),
            zh = LocalizedContent("哪种辐射穿透力最强？", listOf("伽马辐射", "阿尔法辐射", "贝塔辐射", "X射线辐射"), "科学", ""),
            es = LocalizedContent("¿Qué tipo de radiación es la más penetrante?", listOf("Radiación gamma", "Radiación alfa", "Radiación beta", "Radiación X"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7002, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la dialyse médicale imite ?", listOf("La fonction des reins (filtration du sang)", "La fonction du foie", "La fonction des poumons", "La fonction du cœur"), "Science", ""),
            en = LocalizedContent("What does medical dialysis imitate?", listOf("The function of the kidneys (blood filtration)", "The function of the liver", "The function of the lungs", "The function of the heart"), "Science", ""),
            zh = LocalizedContent("医疗透析模仿的是什么功能？", listOf("肾脏的功能（血液过滤）", "肝脏的功能", "肺的功能", "心脏的功能"), "科学", ""),
            es = LocalizedContent("¿Qué imita la diálisis médica?", listOf("La función de los riñones (filtración de la sangre)", "La función del hígado", "La función de los pulmones", "La función del corazón"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7003, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pH du coca-cola ?", listOf("Environ 2,5-3,5 (acide)", "7 (neutre)", "5-6", "8-9 (basique)"), "Science", ""),
            en = LocalizedContent("What is the pH of Coca-Cola?", listOf("About 2.5-3.5 (acidic)", "7 (neutral)", "5-6", "8-9 (basic)"), "Science", ""),
            zh = LocalizedContent("可口可乐的pH值是多少？", listOf("约2.5-3.5（酸性）", "7（中性）", "5-6", "8-9（碱性）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el pH de la Coca-Cola?", listOf("Alrededor de 2.5-3.5 (ácido)", "7 (neutro)", "5-6", "8-9 (básico)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7004, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la photonique ?", listOf("Science des photons et de la lumière pour transmettre l'information", "Étude de la photosynthèse", "Physique des particules subatomiques", "Optique géométrique classique"), "Science", ""),
            en = LocalizedContent("What is photonics?", listOf("Science of photons and light for transmitting information", "Study of photosynthesis", "Physics of subatomic particles", "Classical geometric optics"), "Science", ""),
            zh = LocalizedContent("什么是光子学？", listOf("研究光子和光传输信息的科学", "光合作用研究", "亚原子粒子物理学", "经典几何光学"), "科学", ""),
            es = LocalizedContent("¿Qué es la fotónica?", listOf("Ciencia de los fotones y la luz para transmitir información", "Estudio de la fotosíntesis", "Física de partículas subatómicas", "Óptica geométrica clásica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7005, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel médicament est utilisé en cas de réaction allergique grave ?", listOf("Adrénaline (épinéphrine)", "Antihistaminique", "Cortisone", "Aspirine"), "Science", ""),
            en = LocalizedContent("Which medication is used in case of a severe allergic reaction?", listOf("Adrenaline (epinephrine)", "Antihistamine", "Cortisone", "Aspirin"), "Science", ""),
            zh = LocalizedContent("严重过敏反应时使用哪种药物？", listOf("肾上腺素", "抗组胺药", "可的松", "阿司匹林"), "科学", ""),
            es = LocalizedContent("¿Qué medicamento se usa en caso de una reacción alérgica grave?", listOf("Adrenalina (epinefrina)", "Antihistamínico", "Cortisona", "Aspirina"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7006, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la théorie de la relativité générale décrit ?", listOf("La gravitation comme courbure de l'espace-temps", "La physique des particules", "Les forces électromagnétiques", "La mécanique des fluides"), "Science", ""),
            en = LocalizedContent("What does the theory of general relativity describe?", listOf("Gravitation as curvature of spacetime", "Particle physics", "Electromagnetic forces", "Fluid mechanics"), "Science", ""),
            zh = LocalizedContent("广义相对论描述了什么？", listOf("引力作为时空弯曲", "粒子物理学", "电磁力", "流体力学"), "科学", ""),
            es = LocalizedContent("¿Qué describe la teoría de la relatividad general?", listOf("La gravitación como curvatura del espacio-tiempo", "La física de partículas", "Las fuerzas electromagnéticas", "La mecánica de fluidos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7007, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le noyau d'un atome d'hydrogène ?", listOf("Un seul proton", "Un proton + un neutron", "Un proton + un électron", "Deux protons"), "Science", ""),
            en = LocalizedContent("What is the nucleus of a hydrogen atom?", listOf("A single proton", "A proton + a neutron", "A proton + an electron", "Two protons"), "Science", ""),
            zh = LocalizedContent("氢原子的原子核是什么？", listOf("单个质子", "一个质子加一个中子", "一个质子加一个电子", "两个质子"), "科学", ""),
            es = LocalizedContent("¿Cuál es el núcleo de un átomo de hidrógeno?", listOf("Un solo protón", "Un protón + un neutrón", "Un protón + un electrón", "Dos protones"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7008, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la densité d'un matériau ?", listOf("Masse par unité de volume (kg/m³)", "Poids divisé par gravité", "Volume par unité de masse", "Résistance à la compression"), "Science", ""),
            en = LocalizedContent("What is the density of a material?", listOf("Mass per unit volume (kg/m³)", "Weight divided by gravity", "Volume per unit mass", "Compressive strength"), "Science", ""),
            zh = LocalizedContent("材料的密度是什么？", listOf("单位体积的质量（kg/m³）", "重量除以重力", "单位质量的体积", "抗压强度"), "科学", ""),
            es = LocalizedContent("¿Qué es la densidad de un material?", listOf("Masa por unidad de volumen (kg/m³)", "Peso dividido por gravedad", "Volumen por unidad de masa", "Resistencia a la compresión"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7009, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'organe le plus grand du corps humain ?", listOf("La peau", "Le foie", "Les poumons", "L'intestin grêle"), "Science", ""),
            en = LocalizedContent("What is the largest organ of the human body?", listOf("The skin", "The liver", "The lungs", "The small intestine"), "Science", ""),
            zh = LocalizedContent("人体最大的器官是什么？", listOf("皮肤", "肝脏", "肺", "小肠"), "科学", ""),
            es = LocalizedContent("¿Cuál es el órgano más grande del cuerpo humano?", listOf("La piel", "El hígado", "Los pulmones", "El intestino delgado"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la biomécanique ?", listOf("Application des principes mécaniques aux systèmes biologiques", "Biologie des machines", "Mécanique des micro-organismes", "Robotique biologique"), "Science", ""),
            en = LocalizedContent("What is biomechanics?", listOf("Application of mechanical principles to biological systems", "Biology of machines", "Mechanics of microorganisms", "Biological robotics"), "Science", ""),
            zh = LocalizedContent("什么是生物力学？", listOf("将力学原理应用于生物系统", "机器生物学", "微生物力学", "生物机器人学"), "科学", ""),
            es = LocalizedContent("¿Qué es la biomecánica?", listOf("Aplicación de principios mecánicos a sistemas biológicos", "Biología de las máquinas", "Mecánica de microorganismos", "Robótica biológica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7011, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel gaz cause l'effet de serre avec le plus de pouvoir réchauffant sur 100 ans ?", listOf("SF₆ (hexafluorure de soufre)", "CO₂", "Méthane", "N₂O"), "Science", ""),
            en = LocalizedContent("Which gas causes the greenhouse effect with the greatest warming power over 100 years?", listOf("SF₆ (sulfur hexafluoride)", "CO₂", "Methane", "N₂O"), "Science", ""),
            zh = LocalizedContent("哪种气体在100年内具有最强的温室效应增温能力？", listOf("六氟化硫（SF₆）", "二氧化碳", "甲烷", "一氧化二氮"), "科学", ""),
            es = LocalizedContent("¿Qué gas causa el efecto invernadero con el mayor poder de calentamiento en 100 años?", listOf("SF₆ (hexafluoruro de azufre)", "CO₂", "Metano", "N₂O"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la génomique ?", listOf("Étude de l'ensemble du génome d'un organisme", "Étude d'un gène particulier", "Modification génétique", "Hérédité mendélienne"), "Science", ""),
            en = LocalizedContent("What is genomics?", listOf("Study of the entire genome of an organism", "Study of a particular gene", "Genetic modification", "Mendelian inheritance"), "Science", ""),
            zh = LocalizedContent("什么是基因组学？", listOf("研究生物体的整个基因组", "研究特定基因", "基因改造", "孟德尔遗传"), "科学", ""),
            es = LocalizedContent("¿Qué es la genómica?", listOf("Estudio del genoma completo de un organismo", "Estudio de un gen particular", "Modificación genética", "Herencia mendeliana"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7013, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a formulé les équations de Maxwell ?", listOf("James Clerk Maxwell", "Michael Faraday", "Heinrich Hertz", "André-Marie Ampère"), "Science", ""),
            en = LocalizedContent("Which scientist formulated Maxwell's equations?", listOf("James Clerk Maxwell", "Michael Faraday", "Heinrich Hertz", "André-Marie Ampère"), "Science", ""),
            zh = LocalizedContent("哪位科学家提出了麦克斯韦方程组？", listOf("詹姆斯·克拉克·麦克斯韦", "迈克尔·法拉第", "海因里希·赫兹", "安德烈-玛丽·安培"), "科学", ""),
            es = LocalizedContent("¿Qué científico formuló las ecuaciones de Maxwell?", listOf("James Clerk Maxwell", "Michael Faraday", "Heinrich Hertz", "André-Marie Ampère"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7014, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'épigénétique ?", listOf("Modifications de l'expression des gènes sans changement de l'ADN", "Mutations génétiques", "Hérédité chromosomique", "Recombinaison génétique"), "Science", ""),
            en = LocalizedContent("What is epigenetics?", listOf("Modifications in gene expression without DNA change", "Genetic mutations", "Chromosomal inheritance", "Genetic recombination"), "Science", ""),
            zh = LocalizedContent("什么是表观遗传学？", listOf("不改变DNA的基因表达修饰", "基因突变", "染色体遗传", "基因重组"), "科学", ""),
            es = LocalizedContent("¿Qué es la epigenética?", listOf("Modificaciones en la expresión génica sin cambio en el ADN", "Mutaciones genéticas", "Herencia cromosómica", "Recombinación genética"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7015, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle planète a la rotation la plus rapide ?", listOf("Jupiter (10 heures)", "Saturne (11 heures)", "Mars (24 heures)", "Mercure (59 jours)"), "Science", ""),
            en = LocalizedContent("Which planet has the fastest rotation?", listOf("Jupiter (10 hours)", "Saturn (11 hours)", "Mars (24 hours)", "Mercury (59 days)"), "Science", ""),
            zh = LocalizedContent("哪颗行星自转最快？", listOf("木星（10小时）", "土星（11小时）", "火星（24小时）", "水星（59天）"), "科学", ""),
            es = LocalizedContent("¿Qué planeta tiene la rotación más rápida?", listOf("Júpiter (10 horas)", "Saturno (11 horas)", "Marte (24 horas)", "Mercurio (59 días)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7016, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la loi de la gravitation universelle ?", listOf("F = G(m₁×m₂)/r² (Newton)", "F = ma", "E = mc²", "F = kq₁q₂/r²"), "Science", ""),
            en = LocalizedContent("What is the law of universal gravitation?", listOf("F = G(m₁×m₂)/r² (Newton)", "F = ma", "E = mc²", "F = kq₁q₂/r²"), "Science", ""),
            zh = LocalizedContent("什么是万有引力定律？", listOf("F = G(m₁×m₂)/r²（牛顿）", "F = ma", "E = mc²", "F = kq₁q₂/r²"), "科学", ""),
            es = LocalizedContent("¿Qué es la ley de la gravitación universal?", listOf("F = G(m₁×m₂)/r² (Newton)", "F = ma", "E = mc²", "F = kq₁q₂/r²"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7017, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'effet de la pression sur le point d'ébullition de l'eau ?", listOf("Plus la pression est haute, plus le point d'ébullition est élevé", "Aucun effet", "Plus la pression est haute, plus il est bas", "Cela dépend du sel dissous"), "Science", ""),
            en = LocalizedContent("What is the effect of pressure on the boiling point of water?", listOf("Higher pressure raises the boiling point", "No effect", "Higher pressure lowers it", "It depends on dissolved salt"), "Science", ""),
            zh = LocalizedContent("压力对水的沸点有什么影响？", listOf("压力越高，沸点越高", "没有影响", "压力越高，沸点越低", "取决于溶解的盐"), "科学", ""),
            es = LocalizedContent("¿Cuál es el efecto de la presión sobre el punto de ebullición del agua?", listOf("A mayor presión, mayor punto de ebullición", "Ningún efecto", "A mayor presión, menor punto de ebullición", "Depende de la sal disuelta"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7018, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la bioinformatique ?", listOf("Utilisation de l'informatique pour analyser données biologiques", "Informatique pour robotique médicale", "Simulation de systèmes biologiques", "Intelligence artificielle médicale"), "Science", ""),
            en = LocalizedContent("What is bioinformatics?", listOf("Use of computing to analyze biological data", "Computing for medical robotics", "Simulation of biological systems", "Medical artificial intelligence"), "Science", ""),
            zh = LocalizedContent("什么是生物信息学？", listOf("利用计算机分析生物数据", "医疗机器人计算", "生物系统模拟", "医学人工智能"), "科学", ""),
            es = LocalizedContent("¿Qué es la bioinformática?", listOf("Uso de la informática para analizar datos biológicos", "Informática para robótica médica", "Simulación de sistemas biológicos", "Inteligencia artificial médica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7019, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le processus par lequel les plantes perdent de l'eau ?", listOf("La transpiration (via les stomates)", "L'évaporation directe", "La respiration", "La guttation (seulement gouttes)"), "Science", ""),
            en = LocalizedContent("What is the process by which plants lose water?", listOf("Transpiration (via stomata)", "Direct evaporation", "Respiration", "Guttation (only droplets)"), "Science", ""),
            zh = LocalizedContent("植物通过什么过程失去水分？", listOf("蒸腾作用（通过气孔）", "直接蒸发", "呼吸作用", "吐水作用（仅水滴）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el proceso por el cual las plantas pierden agua?", listOf("Transpiración (a través de los estomas)", "Evaporación directa", "Respiración", "Gutación (solo gotas)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 7020, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a découvert la circulation sanguine au XVIIe siècle ?", listOf("William Harvey (1628)", "Galien", "Vésale", "Paracelse"), "Histoire", ""),
            en = LocalizedContent("Who discovered blood circulation in the 17th century?", listOf("William Harvey (1628)", "Galen", "Vesalius", "Paracelsus"), "History", ""),
            zh = LocalizedContent("17世纪谁发现了血液循环？", listOf("威廉·哈维（1628年）", "盖伦", "维萨里", "帕拉塞尔苏斯"), "历史", ""),
            es = LocalizedContent("¿Quién descubrió la circulación sanguínea en el siglo XVII?", listOf("William Harvey (1628)", "Galeno", "Vesalio", "Paracelso"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7021, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi de France est surnommé le 'Roi Soleil' ?", listOf("Louis XIV", "Louis XIII", "Louis XV", "Louis XVI"), "Histoire", ""),
            en = LocalizedContent("Which French king is nicknamed the 'Sun King'?", listOf("Louis XIV", "Louis XIII", "Louis XV", "Louis XVI"), "History", ""),
            zh = LocalizedContent("哪位法国国王被称为“太阳王”？", listOf("路易十四", "路易十三", "路易十五", "路易十六"), "历史", ""),
            es = LocalizedContent("¿Qué rey de Francia es apodado el 'Rey Sol'?", listOf("Luis XIV", "Luis XIII", "Luis XV", "Luis XVI"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est l'année de la prise de Constantinople par les Ottomans ?", listOf("1453", "1402", "1389", "1481"), "Histoire", ""),
            en = LocalizedContent("What year did the Ottomans conquer Constantinople?", listOf("1453", "1402", "1389", "1481"), "History", ""),
            zh = LocalizedContent("奥斯曼帝国攻占君士坦丁堡是哪一年？", listOf("1453", "1402", "1389", "1481"), "历史", ""),
            es = LocalizedContent("¿En qué año los otomanos conquistaron Constantinopla?", listOf("1453", "1402", "1389", "1481"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7023, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était l'impératrice d'Autriche connue comme 'Sissi' ?", listOf("Élisabeth de Bavière", "Marie-Antoinette", "Maria Theresa", "Sophie de Habsbourg"), "Histoire", ""),
            en = LocalizedContent("Who was the Empress of Austria known as 'Sissi'?", listOf("Elisabeth of Bavaria", "Marie Antoinette", "Maria Theresa", "Sophie of Habsburg"), "History", ""),
            zh = LocalizedContent("被称为“茜茜”的奥地利皇后是谁？", listOf("巴伐利亚的伊丽莎白", "玛丽·安托瓦内特", "玛丽亚·特蕾莎", "哈布斯堡的索菲"), "历史", ""),
            es = LocalizedContent("¿Quién fue la emperatriz de Austria conocida como 'Sissi'?", listOf("Isabel de Baviera", "María Antonieta", "María Teresa", "Sofía de Habsburgo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7024, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle grande peste a tué un tiers de la population européenne au XIVe siècle ?", listOf("La Peste noire (1347-1351)", "La Grande Peste de Londres (1665)", "La Peste de Justinien", "La Fièvre des marais"), "Histoire", ""),
            en = LocalizedContent("Which great plague killed a third of Europe's population in the 14th century?", listOf("The Black Death (1347-1351)", "The Great Plague of London (1665)", "The Plague of Justinian", "The Marsh Fever"), "History", ""),
            zh = LocalizedContent("14世纪哪场大瘟疫杀死了欧洲三分之一的人口？", listOf("黑死病（1347-1351）", "伦敦大瘟疫（1665）", "查士丁尼瘟疫", "沼泽热"), "历史", ""),
            es = LocalizedContent("¿Qué gran plaga mató a un tercio de la población europea en el siglo XIV?", listOf("La Peste Negra (1347-1351)", "La Gran Peste de Londres (1665)", "La Peste de Justiniano", "La Fiebre de los Pantanos"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7025, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le dernier tsar de Russie ?", listOf("Nicolas II", "Alexandre III", "Nicolas Ier", "Alexandre II"), "Histoire", ""),
            en = LocalizedContent("Who was the last Tsar of Russia?", listOf("Nicholas II", "Alexander III", "Nicholas I", "Alexander II"), "History", ""),
            zh = LocalizedContent("俄罗斯最后一位沙皇是谁？", listOf("尼古拉二世", "亚历山大三世", "尼古拉一世", "亚历山大二世"), "历史", ""),
            es = LocalizedContent("¿Quién fue el último zar de Rusia?", listOf("Nicolás II", "Alejandro III", "Nicolás I", "Alejandro II"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7026, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Première Guerre mondiale a-t-elle commencé ?", listOf("1914", "1915", "1912", "1916"), "Histoire", ""),
            en = LocalizedContent("In what year did World War I begin?", listOf("1914", "1915", "1912", "1916"), "History", ""),
            zh = LocalizedContent("第一次世界大战在哪一年开始？", listOf("1914", "1915", "1912", "1916"), "历史", ""),
            es = LocalizedContent("¿En qué año comenzó la Primera Guerra Mundial?", listOf("1914", "1915", "1912", "1916"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7027, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a subi le siège de Leningrad pendant la Seconde Guerre mondiale ?", listOf("URSS (Russie, ville de Leningrad/Saint-Pétersbourg)", "Pologne", "Ukraine", "Finlande"), "Histoire", ""),
            en = LocalizedContent("Which country endured the Siege of Leningrad during World War II?", listOf("USSR (Russia, city of Leningrad/Saint Petersburg)", "Poland", "Ukraine", "Finland"), "History", ""),
            zh = LocalizedContent("二战期间哪个国家经历了列宁格勒围城战？", listOf("苏联（俄罗斯，列宁格勒/圣彼得堡）", "波兰", "乌克兰", "芬兰"), "历史", ""),
            es = LocalizedContent("¿Qué país sufrió el asedio de Leningrado durante la Segunda Guerra Mundial?", listOf("URSS (Rusia, ciudad de Leningrado/San Petersburgo)", "Polonia", "Ucrania", "Finlandia"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7028, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a officiellement créé la République de Weimar ?", listOf("Constitution de Weimar (1919)", "Traité de Versailles", "Armistice de 1918", "Paix de Versailles"), "Histoire", ""),
            en = LocalizedContent("Which treaty officially created the Weimar Republic?", listOf("Weimar Constitution (1919)", "Treaty of Versailles", "Armistice of 1918", "Peace of Versailles"), "History", ""),
            zh = LocalizedContent("哪项条约正式建立了魏玛共和国？", listOf("魏玛宪法（1919）", "凡尔赛条约", "1918年停战协定", "凡尔赛和约"), "历史", ""),
            es = LocalizedContent("¿Qué tratado creó oficialmente la República de Weimar?", listOf("Constitución de Weimar (1919)", "Tratado de Versalles", "Armisticio de 1918", "Paz de Versalles"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7029, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a commandé les forces alliées lors du débarquement de Normandie ?", listOf("Dwight Eisenhower", "Bernard Montgomery", "Omar Bradley", "George Patton"), "Histoire", ""),
            en = LocalizedContent("Who commanded the Allied forces during the Normandy landings?", listOf("Dwight Eisenhower", "Bernard Montgomery", "Omar Bradley", "George Patton"), "History", ""),
            zh = LocalizedContent("诺曼底登陆期间谁指挥了盟军？", listOf("德怀特·艾森豪威尔", "伯纳德·蒙哥马利", "奥马尔·布拉德利", "乔治·巴顿"), "历史", ""),
            es = LocalizedContent("¿Quién comandó las fuerzas aliadas durante el desembarco de Normandía?", listOf("Dwight Eisenhower", "Bernard Montgomery", "Omar Bradley", "George Patton"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7030, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mouvement artistique fut lié à la Révolution russe de 1917 ?", listOf("Le Constructivisme", "Le Suprématisme", "Le Réalisme socialiste", "Le Futurisme"), "Histoire", ""),
            en = LocalizedContent("Which artistic movement was linked to the Russian Revolution of 1917?", listOf("Constructivism", "Suprematism", "Socialist Realism", "Futurism"), "History", ""),
            zh = LocalizedContent("哪个艺术运动与1917年俄国革命有关？", listOf("构成主义", "至上主义", "社会主义现实主义", "未来主义"), "历史", ""),
            es = LocalizedContent("¿Qué movimiento artístico estuvo vinculado a la Revolución Rusa de 1917?", listOf("Constructivismo", "Suprematismo", "Realismo socialista", "Futurismo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le mur de Berlin a-t-il été construit ?", listOf("1961", "1949", "1968", "1955"), "Histoire", ""),
            en = LocalizedContent("In what year was the Berlin Wall built?", listOf("1961", "1949", "1968", "1955"), "History", ""),
            zh = LocalizedContent("柏林墙是哪一年修建的？", listOf("1961", "1949", "1968", "1955"), "历史", ""),
            es = LocalizedContent("¿En qué año se construyó el Muro de Berlín?", listOf("1961", "1949", "1968", "1955"), "Historia", "")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 7032, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a utilisé en premier la guerre chimique pendant la Première Guerre mondiale ?", listOf("Allemagne (chlore à Ypres, 1915)", "France", "Royaume-Uni", "Belgique"), "Histoire", ""),
            en = LocalizedContent("Which country first used chemical warfare during World War I?", listOf("Germany (chlorine at Ypres, 1915)", "France", "United Kingdom", "Belgium"), "History", ""),
            zh = LocalizedContent("第一次世界大战中哪个国家首先使用了化学战？", listOf("德国（1915年在伊普尔使用氯气）", "法国", "英国", "比利时"), "历史", ""),
            es = LocalizedContent("¿Qué país utilizó por primera vez la guerra química durante la Primera Guerra Mundial?", listOf("Alemania (cloro en Ypres, 1915)", "Francia", "Reino Unido", "Bélgica"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7033, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le chef du gouvernement fasciste en Italie ?", listOf("Benito Mussolini", "Umberto II", "Victor Emmanuel III", "Italo Balbo"), "Histoire", ""),
            en = LocalizedContent("Who was the head of the fascist government in Italy?", listOf("Benito Mussolini", "Umberto II", "Victor Emmanuel III", "Italo Balbo"), "History", ""),
            zh = LocalizedContent("意大利法西斯政府的领导人是谁？", listOf("贝尼托·墨索里尼", "翁贝托二世", "维托里奥·埃马努埃莱三世", "伊塔洛·巴尔博"), "历史", ""),
            es = LocalizedContent("¿Quién fue el jefe del gobierno fascista en Italia?", listOf("Benito Mussolini", "Humberto II", "Víctor Manuel III", "Italo Balbo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7034, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle bataille a stoppé l'avance arabe en France au VIIIe siècle ?", listOf("Bataille de Poitiers/Tours (732, Charles Martel)", "Bataille de Roncevaux (778)", "Bataille de Tours (507)", "Bataille de Tolbiac"), "Histoire", ""),
            en = LocalizedContent("Which battle stopped the Arab advance in France in the 8th century?", listOf("Battle of Poitiers/Tours (732, Charles Martel)", "Battle of Roncevaux (778)", "Battle of Tours (507)", "Battle of Tolbiac"), "History", ""),
            zh = LocalizedContent("哪场战役在8世纪阻止了阿拉伯人在法国的推进？", listOf("普瓦捷/图尔战役（732年，查理·马特）", "龙塞斯瓦耶斯战役（778年）", "图尔战役（507年）", "托尔比亚克战役"), "历史", ""),
            es = LocalizedContent("¿Qué batalla detuvo el avance árabe en Francia en el siglo VIII?", listOf("Batalla de Poitiers/Tours (732, Carlos Martel)", "Batalla de Roncesvalles (778)", "Batalla de Tours (507)", "Batalla de Tolbiac"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7035, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire a existé de 27 av. J.-C. à 476 ap. J.-C. ?", listOf("L'Empire romain", "L'Empire grec", "L'Empire byzantin", "L'Empire carthaginois"), "Histoire", ""),
            en = LocalizedContent("Which empire existed from 27 BC to 476 AD?", listOf("Roman Empire", "Greek Empire", "Byzantine Empire", "Carthaginian Empire"), "History", ""),
            zh = LocalizedContent("哪个帝国存在于公元前27年至公元476年？", listOf("罗马帝国", "希腊帝国", "拜占庭帝国", "迦太基帝国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio existió desde el 27 a.C. hasta el 476 d.C.?", listOf("Imperio romano", "Imperio griego", "Imperio bizantino", "Imperio cartaginés"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7036, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le fondateur de l'Empire perse achéménide ?", listOf("Cyrus le Grand", "Darius Ier", "Xerxès Ier", "Cambyse II"), "Histoire", ""),
            en = LocalizedContent("Who was the founder of the Achaemenid Persian Empire?", listOf("Cyrus the Great", "Darius I", "Xerxes I", "Cambyses II"), "History", ""),
            zh = LocalizedContent("谁建立了阿契美尼德波斯帝国？", listOf("居鲁士大帝", "大流士一世", "薛西斯一世", "冈比西斯二世"), "历史", ""),
            es = LocalizedContent("¿Quién fue el fundador del Imperio persa aqueménida?", listOf("Ciro el Grande", "Darío I", "Jerjes I", "Cambises II"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7037, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi anglais a eu 6 femmes ?", listOf("Henri VIII", "Henri VII", "Richard III", "Édouard IV"), "Histoire", ""),
            en = LocalizedContent("Which English king had 6 wives?", listOf("Henry VIII", "Henry VII", "Richard III", "Edward IV"), "History", ""),
            zh = LocalizedContent("哪位英国国王有六位妻子？", listOf("亨利八世", "亨利七世", "理查三世", "爱德华四世"), "历史", ""),
            es = LocalizedContent("¿Qué rey inglés tuvo 6 esposas?", listOf("Enrique VIII", "Enrique VII", "Ricardo III", "Eduardo IV"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7038, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la date de la Révolution américaine (Déclaration d'Indépendance) ?", listOf("4 juillet 1776", "4 juillet 1775", "17 septembre 1787", "1er janvier 1776"), "Histoire", ""),
            en = LocalizedContent("What is the date of the American Revolution (Declaration of Independence)?", listOf("July 4, 1776", "July 4, 1775", "September 17, 1787", "January 1, 1776"), "History", ""),
            zh = LocalizedContent("美国革命（独立宣言）的日期是什么？", listOf("1776年7月4日", "1775年7月4日", "1787年9月17日", "1776年1月1日"), "历史", ""),
            es = LocalizedContent("¿Cuál es la fecha de la Revolución Americana (Declaración de Independencia)?", listOf("4 de julio de 1776", "4 de julio de 1775", "17 de septiembre de 1787", "1 de enero de 1776"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7039, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le premier évêque de Rome (premier pape) ?", listOf("Saint Pierre (Apôtre)", "Saint Paul", "Saint Clément", "Saint Linus"), "Histoire", ""),
            en = LocalizedContent("Who was the first bishop of Rome (first pope)?", listOf("Saint Peter (Apostle)", "Saint Paul", "Saint Clement", "Saint Linus"), "History", ""),
            zh = LocalizedContent("谁是第一位罗马主教（第一位教皇）？", listOf("圣彼得（使徒）", "圣保罗", "圣克莱门特", "圣利努斯"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer obispo de Roma (primer papa)?", listOf("San Pedro (Apóstol)", "San Pablo", "San Clemente", "San Lino"), "Historia", "")
        ),
        BilingualQuestion(
            id = 7040, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long pont du monde ?", listOf("Pont de Danyang-Kunshan (Chine, 164 km)", "Pont de la Confédération (Canada)", "Pont de Millau (France)", "Viaduc de l'Øresund"), "Géographie", ""),
            en = LocalizedContent("What is the longest bridge in the world?", listOf("Danyang–Kunshan Grand Bridge (China, 164 km)", "Confederation Bridge (Canada)", "Millau Viaduct (France)", "Øresund Bridge"), "Geography", ""),
            zh = LocalizedContent("世界上最长的桥是什么？", listOf("丹阳-昆山特大桥（中国，164公里）", "联邦大桥（加拿大）", "米约高架桥（法国）", "厄勒海峡大桥"), "地理", ""),
            es = LocalizedContent("¿Cuál es el puente más largo del mundo?", listOf("Puente de Danyang-Kunshan (China, 164 km)", "Puente de la Confederación (Canadá)", "Viaducto de Millau (Francia)", "Puente de Øresund"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 7041, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel océan borde la côte ouest de l'Amérique du Sud ?", listOf("Océan Atlantique", "Océan Indien", "Océan Arctique", "Océan Pacifique"), "Geographie", "La côte ouest de l'Amérique du Sud est bordée par l'océan Pacifique, le plus grand océan du monde, qui s'étend jusqu'à l'Asie et l'Océanie."),
            en = LocalizedContent("Which ocean borders the west coast of South America?", listOf("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"), "Geography", "The west coast of South America is bordered by the Pacific Ocean, the largest ocean in the world, which extends to Asia and Oceania."),
            zh = LocalizedContent("哪个大洋濒临南美洲西海岸？", listOf("大西洋", "印度洋", "北冰洋", "太平洋"), "地理", "南美洲西海岸濒临太平洋，太平洋是世界上最大的大洋，延伸至亚洲和大洋洲。"),
            es = LocalizedContent("¿Qué océano bordea la costa oeste de América del Sur?", listOf("Océano Atlántico", "Océano Índico", "Océano Ártico", "Océano Pacífico"), "Geografía", "La costa oeste de América del Sur está bordeada por el océano Pacífico, el océano más grande del mundo, que se extiende hasta Asia y Oceanía.")
        ),
        BilingualQuestion(
            id = 7042, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fleuve qui traverse Paris ?", listOf("La Seine", "La Loire", "La Marne", "La Garonne"), "Géographie", ""),
            en = LocalizedContent("Which river flows through Paris?", listOf("The Seine", "The Loire", "The Marne", "The Garonne"), "Geography", ""),
            zh = LocalizedContent("哪条河流经巴黎？", listOf("塞纳河", "卢瓦尔河", "马恩河", "加龙河"), "地理", ""),
            es = LocalizedContent("¿Qué río atraviesa París?", listOf("El Sena", "El Loira", "El Marne", "El Garona"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7043, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel continent se trouve l'Éthiopie ?", listOf("Afrique", "Moyen-Orient", "Asie du Sud", "Afrique de l'Est"), "Géographie", ""),
            en = LocalizedContent("In which continent is Ethiopia located?", listOf("Africa", "Middle East", "South Asia", "East Africa"), "Geography", ""),
            zh = LocalizedContent("埃塞俄比亚位于哪个洲？", listOf("非洲", "中东", "南亚", "东非"), "地理", ""),
            es = LocalizedContent("¿En qué continente se encuentra Etiopía?", listOf("África", "Oriente Medio", "Asia del Sur", "África Oriental"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7044, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la frontière naturelle entre la France et l'Espagne ?", listOf("Les Pyrénées", "Les Alpes", "Le Rhin", "La Méditerranée"), "Géographie", ""),
            en = LocalizedContent("What is the natural border between France and Spain?", listOf("The Pyrenees", "The Alps", "The Rhine", "The Mediterranean"), "Geography", ""),
            zh = LocalizedContent("法国和西班牙之间的自然边界是什么？", listOf("比利牛斯山脉", "阿尔卑斯山脉", "莱茵河", "地中海"), "地理", ""),
            es = LocalizedContent("¿Cuál es la frontera natural entre Francia y España?", listOf("Los Pirineos", "Los Alpes", "El Rin", "El Mediterráneo"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7045, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays du monde par superficie ?", listOf("Russie (17,1 millions km²)", "Canada (10 millions km²)", "États-Unis (9,8 millions km²)", "Chine (9,6 millions km²)"), "Géographie", ""),
            en = LocalizedContent("What is the largest country in the world by area?", listOf("Russia (17.1 million km²)", "Canada (10 million km²)", "United States (9.8 million km²)", "China (9.6 million km²)"), "Geography", ""),
            zh = LocalizedContent("世界上面积最大的国家是哪个？", listOf("俄罗斯（1710万平方公里）", "加拿大（1000万平方公里）", "美国（980万平方公里）", "中国（960万平方公里）"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más grande del mundo por superficie?", listOf("Rusia (17,1 millones km²)", "Canadá (10 millones km²)", "Estados Unidos (9,8 millones km²)", "China (9,6 millones km²)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7046, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle ville est à la fois sur deux continents (Europe et Asie) ?", listOf("Istanbul (Turquie)", "Suez (Égypte)", "Aqaba (Jordanie)", "Eilat (Israël)"), "Géographie", ""),
            en = LocalizedContent("Which city is located on two continents (Europe and Asia)?", listOf("Istanbul (Turkey)", "Suez (Egypt)", "Aqaba (Jordan)", "Eilat (Israel)"), "Geography", ""),
            zh = LocalizedContent("哪座城市横跨两大洲（欧洲和亚洲）？", listOf("伊斯坦布尔（土耳其）", "苏伊士（埃及）", "亚喀巴（约旦）", "埃拉特（以色列）"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad está en dos continentes (Europa y Asia)?", listOf("Estambul (Turquía)", "Suez (Egipto)", "Aqaba (Jordania)", "Eilat (Israel)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7047, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nom du volcan actif le plus haut du monde ?", listOf("Ojos del Salado (6 893 m, Andes)", "Etna (3 357 m)", "Fuji (3 776 m)", "Kilimandjaro (5 895 m)"), "Géographie", ""),
            en = LocalizedContent("What is the name of the highest active volcano in the world?", listOf("Ojos del Salado (6,893 m, Andes)", "Etna (3,357 m)", "Fuji (3,776 m)", "Kilimanjaro (5,895 m)"), "Geography", ""),
            zh = LocalizedContent("世界上最高的活火山叫什么名字？", listOf("奥霍斯德尔萨拉多山（6893米，安第斯山脉）", "埃特纳火山（3357米）", "富士山（3776米）", "乞力马扎罗山（5895米）"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del volcán activo más alto del mundo?", listOf("Ojos del Salado (6.893 m, Andes)", "Etna (3.357 m)", "Fuji (3.776 m)", "Kilimanjaro (5.895 m)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7048, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de l'Indonésie ?", listOf("Jakarta (bientôt Nusantara)", "Bali", "Surabaya", "Bandung"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Indonesia?", listOf("Jakarta (soon Nusantara)", "Bali", "Surabaya", "Bandung"), "Geography", ""),
            zh = LocalizedContent("印度尼西亚的首都是哪里？", listOf("雅加达（即将迁都努桑塔拉）", "巴厘岛", "泗水", "万隆"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Indonesia?", listOf("Yakarta (pronto Nusantara)", "Bali", "Surabaya", "Bandung"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7049, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays partage la frontière la plus longue au monde avec la Russie ?", listOf("Kazakhstan (7 644 km)", "Chine", "Mongolie", "Finlande"), "Géographie", ""),
            en = LocalizedContent("Which country shares the longest land border with Russia?", listOf("Kazakhstan (7,644 km)", "China", "Mongolia", "Finland"), "Geography", ""),
            zh = LocalizedContent("哪个国家与俄罗斯的陆地边界最长？", listOf("哈萨克斯坦（7644公里）", "中国", "蒙古", "芬兰"), "地理", ""),
            es = LocalizedContent("¿Qué país comparte la frontera terrestre más larga con Rusia?", listOf("Kazajistán (7.644 km)", "China", "Mongolia", "Finlandia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle mer se trouve entre la Grèce et la Turquie ?", listOf("La mer Égée", "La mer Noire", "La mer Ionienne", "La Méditerranée orientale"), "Géographie", ""),
            en = LocalizedContent("Which sea lies between Greece and Turkey?", listOf("The Aegean Sea", "The Black Sea", "The Ionian Sea", "The Eastern Mediterranean"), "Geography", ""),
            zh = LocalizedContent("希腊和土耳其之间是什么海？", listOf("爱琴海", "黑海", "爱奥尼亚海", "东地中海"), "地理", ""),
            es = LocalizedContent("¿Qué mar se encuentra entre Grecia y Turquía?", listOf("El mar Egeo", "El mar Negro", "El mar Jónico", "El Mediterráneo oriental"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7051, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac naturel d'Amérique du Nord ?", listOf("Lac Supérieur", "Lac Michigan", "Lac Huron", "Grand Lac des Esclaves"), "Géographie", ""),
            en = LocalizedContent("What is the largest natural lake in North America?", listOf("Lake Superior", "Lake Michigan", "Lake Huron", "Great Slave Lake"), "Geography", ""),
            zh = LocalizedContent("北美最大的天然湖泊是哪个？", listOf("苏必利尔湖", "密歇根湖", "休伦湖", "大奴湖"), "地理", ""),
            es = LocalizedContent("¿Cuál es el lago natural más grande de América del Norte?", listOf("Lago Superior", "Lago Míchigan", "Lago Hurón", "Gran Lago del Esclavo"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7052, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la capitale Manille ?", listOf("Philippines", "Indonésie", "Vietnam", "Thaïlande"), "Géographie", ""),
            en = LocalizedContent("In which country is the capital Manila located?", listOf("Philippines", "Indonesia", "Vietnam", "Thailand"), "Geography", ""),
            zh = LocalizedContent("首都马尼拉位于哪个国家？", listOf("菲律宾", "印度尼西亚", "越南", "泰国"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la capital Manila?", listOf("Filipinas", "Indonesia", "Vietnam", "Tailandia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7053, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de l'île la plus grande du monde ?", listOf("Groenland", "Nouvelle-Guinée", "Bornéo", "Madagascar"), "Géographie", ""),
            en = LocalizedContent("What is the name of the largest island in the world?", listOf("Greenland", "New Guinea", "Borneo", "Madagascar"), "Geography", ""),
            zh = LocalizedContent("世界上最大的岛屿叫什么名字？", listOf("格陵兰", "新几内亚", "婆罗洲", "马达加斯加"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre de la isla más grande del mundo?", listOf("Groenlandia", "Nueva Guinea", "Borneo", "Madagascar"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7054, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle ville est la capitale économique du Nigéria ?", listOf("Lagos", "Abuja (capitale officielle)", "Kano", "Ibadan"), "Géographie", ""),
            en = LocalizedContent("Which city is the economic capital of Nigeria?", listOf("Lagos", "Abuja (official capital)", "Kano", "Ibadan"), "Geography", ""),
            zh = LocalizedContent("哪个城市是尼日利亚的经济首都？", listOf("拉各斯", "阿布贾（官方首都）", "卡诺", "伊巴丹"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es la capital económica de Nigeria?", listOf("Lagos", "Abuya (capital oficial)", "Kano", "Ibadán"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7055, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle chaîne de montagnes sépare la Russie européenne de la Russie asiatique ?", listOf("L'Oural", "Le Caucase", "L'Altaï", "Le Tian Shan"), "Géographie", ""),
            en = LocalizedContent("Which mountain range separates European Russia from Asian Russia?", listOf("The Urals", "The Caucasus", "The Altai", "The Tian Shan"), "Geography", ""),
            zh = LocalizedContent("哪条山脉分隔了欧洲俄罗斯和亚洲俄罗斯？", listOf("乌拉尔山脉", "高加索山脉", "阿尔泰山脉", "天山山脉"), "地理", ""),
            es = LocalizedContent("¿Qué cadena montañosa separa la Rusia europea de la Rusia asiática?", listOf("Los Urales", "El Cáucaso", "El Altái", "El Tian Shan"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7056, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu vidéo de stratégie en temps réel propose des batailles entre races comme les Terrans et les Protoss ?", listOf("Age of Empires", "Warcraft", "StarCraft", "Command & Conquer"), "Culture", "StarCraft, développé par Blizzard Entertainment, met en scène trois factions distinctes : les Terrans, les Protoss et les Zergs, dans un conflit de science-fiction."),
            en = LocalizedContent("Which real-time strategy video game features battles between races like the Terrans and the Protoss?", listOf("Age of Empires", "Warcraft", "StarCraft", "Command & Conquer"), "Culture", "StarCraft, developed by Blizzard Entertainment, features three distinct factions: the Terrans, the Protoss, and the Zerg, in a science-fiction conflict."),
            zh = LocalizedContent("哪款即时战略游戏包含人类和神族等种族之间的战斗？", listOf("帝国时代", "魔兽争霸", "星际争霸", "命令与征服"), "文化", "《星际争霸》由暴雪娱乐开发，以三个截然不同的阵营为特色：人类、神族和虫族，展开科幻冲突。"),
            es = LocalizedContent("¿Qué videojuego de estrategia en tiempo real presenta batallas entre razas como los Terran y los Protoss?", listOf("Age of Empires", "Warcraft", "StarCraft", "Command & Conquer"), "Cultura", "StarCraft, desarrollado por Blizzard Entertainment, presenta tres facciones distintas: los Terran, los Protoss y los Zerg, en un conflicto de ciencia ficción.")
        ),
        BilingualQuestion(
            id = 7057, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est connu pour ses peintures de nénuphars ?", listOf("Paul Cézanne", "Claude Monet", "Pierre-Auguste Renoir", "Édouard Manet"), "Culture", "Claude Monet, figure majeure de l'impressionnisme, a peint sa célèbre série des Nymphéas à Giverny, où il a représenté son jardin d'eau et ses nénuphars."),
            en = LocalizedContent("Which artist is known for his paintings of water lilies?", listOf("Paul Cézanne", "Claude Monet", "Pierre-Auguste Renoir", "Édouard Manet"), "Culture", "Claude Monet, a major figure of Impressionism, painted his famous Water Lilies series at Giverny, where he depicted his water garden and its water lilies."),
            zh = LocalizedContent("哪位艺术家以睡莲画作闻名？", listOf("保罗·塞尚", "克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "爱德华·马奈"), "文化", "克劳德·莫奈，印象派的重要人物，在吉维尼创作了他著名的《睡莲》系列，描绘了他的水园和睡莲。"),
            es = LocalizedContent("¿Qué artista es conocido por sus pinturas de nenúfares?", listOf("Paul Cézanne", "Claude Monet", "Pierre-Auguste Renoir", "Édouard Manet"), "Cultura", "Claude Monet, figura principal del impresionismo, pintó su famosa serie de Nenúfares en Giverny, donde representó su jardín acuático y sus nenúfares.")
        ),
        BilingualQuestion(
            id = 7058, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le mont Olympe ?", listOf("Grèce", "Turquie", "Macédoine du Nord", "Albanie"), "Géographie", ""),
            en = LocalizedContent("In which country is Mount Olympus located?", listOf("Greece", "Turkey", "North Macedonia", "Albania"), "Geography", ""),
            zh = LocalizedContent("奥林匹斯山位于哪个国家？", listOf("希腊", "土耳其", "北马其顿", "阿尔巴尼亚"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el monte Olimpo?", listOf("Grecia", "Turquía", "Macedonia del Norte", "Albania"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 7059, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit la symphonie 'Du Nouveau Monde' ?", listOf("Antonín Dvořák", "Pyotr Ilyich Tchaikovsky", "Johannes Brahms", "Gustav Mahler"), "Culture", "Antonín Dvořák, compositeur tchèque, a composé cette symphonie en 1893 lors de son séjour aux États-Unis, d'où son nom inspiré par la culture américaine."),
            en = LocalizedContent("Which composer wrote the symphony 'From the New World'?", listOf("Antonín Dvořák", "Pyotr Ilyich Tchaikovsky", "Johannes Brahms", "Gustav Mahler"), "Culture", "Antonín Dvořák, a Czech composer, composed this symphony in 1893 during his stay in the United States, hence its name inspired by American culture."),
            zh = LocalizedContent("哪位作曲家创作了《自新大陆》交响曲？", listOf("安东宁·德沃夏克", "彼得·伊里奇·柴可夫斯基", "约翰内斯·勃拉姆斯", "古斯塔夫·马勒"), "文化", "捷克作曲家安东宁·德沃夏克于1893年在美国期间创作了这部交响曲，其名称受美国文化启发。"),
            es = LocalizedContent("¿Qué compositor escribió la sinfonía 'Del Nuevo Mundo'?", listOf("Antonín Dvořák", "Pyotr Ilyich Tchaikovsky", "Johannes Brahms", "Gustav Mahler"), "Cultura", "Antonín Dvořák, compositor checo, compuso esta sinfonía en 1893 durante su estancia en Estados Unidos, de ahí su nombre inspirado en la cultura americana.")
        ),
        BilingualQuestion(
            id = 7060, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a peint 'Le Cri' (1893) ?", listOf("Edvard Munch", "Gustav Klimt", "Ernst Ludwig Kirchner", "Egon Schiele"), "Culture", ""),
            en = LocalizedContent("Who painted 'The Scream' (1893)?", listOf("Edvard Munch", "Gustav Klimt", "Ernst Ludwig Kirchner", "Egon Schiele"), "Culture", ""),
            zh = LocalizedContent("谁画了《呐喊》（1893年）？", listOf("爱德华·蒙克", "古斯塔夫·克里姆特", "恩斯特·路德维希·基希纳", "埃贡·席勒"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'El grito' (1893)?", listOf("Edvard Munch", "Gustav Klimt", "Ernst Ludwig Kirchner", "Egon Schiele"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7061, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur de 'L'Étranger' (1942) ?", listOf("Albert Camus", "Jean-Paul Sartre", "André Malraux", "Simone de Beauvoir"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'The Stranger' (1942)?", listOf("Albert Camus", "Jean-Paul Sartre", "André Malraux", "Simone de Beauvoir"), "Culture", ""),
            zh = LocalizedContent("《局外人》（1942年）的作者是谁？", listOf("阿尔贝·加缪", "让-保罗·萨特", "安德烈·马尔罗", "西蒙娜·德·波伏娃"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'El extranjero' (1942)?", listOf("Albert Camus", "Jean-Paul Sartre", "André Malraux", "Simone de Beauvoir"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7062, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel prix littéraire suédois est le plus prestigieux au monde ?", listOf("Prix Nobel de littérature", "Prix Booker", "Prix Goncourt", "Prix Pulitzer"), "Culture", ""),
            en = LocalizedContent("Which Swedish literary prize is the most prestigious in the world?", listOf("Nobel Prize in Literature", "Booker Prize", "Goncourt Prize", "Pulitzer Prize"), "Culture", ""),
            zh = LocalizedContent("哪个瑞典文学奖是世界上最负盛名的？", listOf("诺贝尔文学奖", "布克奖", "龚古尔奖", "普利策奖"), "文化", ""),
            es = LocalizedContent("¿Qué premio literario sueco es el más prestigioso del mundo?", listOf("Premio Nobel de Literatura", "Premio Booker", "Premio Goncourt", "Premio Pulitzer"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7063, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a vendu 'Portrait de l'Artiste' le plus cher jamais pour un autoportrait ?", listOf("Vincent van Gogh", "Rembrandt", "Egon Schiele", "Pablo Picasso"), "Culture", ""),
            en = LocalizedContent("Which painter sold 'Portrait of the Artist' for the highest price ever for a self-portrait?", listOf("Vincent van Gogh", "Rembrandt", "Egon Schiele", "Pablo Picasso"), "Culture", ""),
            zh = LocalizedContent("哪位画家的《艺术家肖像》以自画像最高价格售出？", listOf("文森特·梵高", "伦勃朗", "埃贡·席勒", "巴勃罗·毕加索"), "文化", ""),
            es = LocalizedContent("¿Qué pintor vendió 'Retrato del artista' al precio más alto jamás alcanzado por un autorretrato?", listOf("Vincent van Gogh", "Rembrandt", "Egon Schiele", "Pablo Picasso"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7064, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé 'Le Requiem' inachevé (1791) ?", listOf("Wolfgang Amadeus Mozart", "Johannes Brahms", "Hector Berlioz", "Gabriel Fauré"), "Culture", ""),
            en = LocalizedContent("Who composed the unfinished 'Requiem' (1791)?", listOf("Wolfgang Amadeus Mozart", "Johannes Brahms", "Hector Berlioz", "Gabriel Fauré"), "Culture", ""),
            zh = LocalizedContent("谁创作了未完成的《安魂曲》（1791年）？", listOf("沃尔夫冈·阿马德乌斯·莫扎特", "约翰内斯·勃拉姆斯", "埃克托·柏辽兹", "加布里埃尔·福雷"), "文化", ""),
            es = LocalizedContent("¿Quién compuso el 'Réquiem' inacabado (1791)?", listOf("Wolfgang Amadeus Mozart", "Johannes Brahms", "Hector Berlioz", "Gabriel Fauré"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7065, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est l'œuvre la plus connue de Léonard de Vinci ?", listOf("La Joconde (Mona Lisa)", "La Cène", "L'Homme de Vitruve", "La Vierge aux rochers"), "Culture", ""),
            en = LocalizedContent("What is Leonardo da Vinci's most famous work?", listOf("Mona Lisa", "The Last Supper", "Vitruvian Man", "Virgin of the Rocks"), "Culture", ""),
            zh = LocalizedContent("列奥纳多·达·芬奇最著名的作品是什么？", listOf("蒙娜丽莎", "最后的晚餐", "维特鲁威人", "岩间圣母"), "文化", ""),
            es = LocalizedContent("¿Cuál es la obra más famosa de Leonardo da Vinci?", listOf("La Mona Lisa", "La Última Cena", "El Hombre de Vitruvio", "La Virgen de las Rocas"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7066, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur de 'Les Fleurs du mal' (1857) ?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Victor Hugo"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'Les Fleurs du mal' (1857)?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Victor Hugo"), "Culture", ""),
            zh = LocalizedContent("《恶之花》（1857年）的作者是谁？", listOf("夏尔·波德莱尔", "阿蒂尔·兰波", "保罗·魏尔伦", "维克多·雨果"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'Las flores del mal' (1857)?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Victor Hugo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7067, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel opéra de Verdi est basé sur une pièce de Shakespeare ?", listOf("Otello", "La Traviata", "Rigoletto", "Aïda"), "Culture", ""),
            en = LocalizedContent("Which Verdi opera is based on a Shakespeare play?", listOf("Otello", "La Traviata", "Rigoletto", "Aida"), "Culture", ""),
            zh = LocalizedContent("威尔第的哪部歌剧基于莎士比亚的戏剧？", listOf("奥赛罗", "茶花女", "弄臣", "阿依达"), "文化", ""),
            es = LocalizedContent("¿Qué ópera de Verdi está basada en una obra de Shakespeare?", listOf("Otello", "La Traviata", "Rigoletto", "Aida"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7068, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste anglais est connu pour ses peintures de Campbell's Soup Cans ?", listOf("Andy Warhol (Américain)", "Roy Lichtenstein", "David Hockney", "Damien Hirst"), "Culture", ""),
            en = LocalizedContent("Which English artist is known for his paintings of Campbell's Soup Cans?", listOf("Andy Warhol (American)", "Roy Lichtenstein", "David Hockney", "Damien Hirst"), "Culture", ""),
            zh = LocalizedContent("哪位英国艺术家以金宝汤罐头画作闻名？", listOf("安迪·沃霍尔（美国人）", "罗伊·利希滕斯坦", "大卫·霍克尼", "达米恩·赫斯特"), "文化", ""),
            es = LocalizedContent("¿Qué artista inglés es conocido por sus pinturas de latas de sopa Campbell's?", listOf("Andy Warhol (estadounidense)", "Roy Lichtenstein", "David Hockney", "Damien Hirst"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7069, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Le Deuxième Sexe' ?", listOf("Simone de Beauvoir", "Simone Veil", "Virginia Woolf", "Betty Friedan"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Second Sex'?", listOf("Simone de Beauvoir", "Simone Veil", "Virginia Woolf", "Betty Friedan"), "Culture", ""),
            zh = LocalizedContent("《第二性》的作者是谁？", listOf("西蒙娜·德·波伏娃", "西蒙娜·韦伊", "弗吉尼亚·伍尔夫", "贝蒂·弗里丹"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'El segundo sexo'?", listOf("Simone de Beauvoir", "Simone Veil", "Virginia Woolf", "Betty Friedan"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7070, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style musical est né dans les années 1970 en Jamaïque ?", listOf("Le reggae (fondé par Bob Marley et autres)", "Le ska", "Le rocksteady", "Le dub"), "Culture", ""),
            en = LocalizedContent("Which musical style was born in the 1970s in Jamaica?", listOf("Reggae (founded by Bob Marley and others)", "Ska", "Rocksteady", "Dub"), "Culture", ""),
            zh = LocalizedContent("哪种音乐风格于20世纪70年代在牙买加诞生？", listOf("雷鬼（由鲍勃·马利等人创立）", "斯卡", "洛克斯代迪", "配音"), "文化", ""),
            es = LocalizedContent("¿Qué estilo musical nació en la década de 1970 en Jamaica?", listOf("Reggae (fundado por Bob Marley y otros)", "Ska", "Rocksteady", "Dub"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7071, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur des 'Fables' classiques françaises ?", listOf("Jean de La Fontaine", "Charles Perrault", "Molière", "Corneille"), "Culture", ""),
            en = LocalizedContent("Who is the author of the classic French 'Fables'?", listOf("Jean de La Fontaine", "Charles Perrault", "Molière", "Corneille"), "Culture", ""),
            zh = LocalizedContent("经典法国《寓言诗》的作者是谁？", listOf("让·德·拉封丹", "夏尔·佩罗", "莫里哀", "高乃依"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de las clásicas 'Fábulas' francesas?", listOf("Jean de La Fontaine", "Charles Perrault", "Molière", "Corneille"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7072, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel tableau de Vermeer représente une femme lisant une lettre ?", listOf("La Liseuse en bleu (ou La Femme à la lettre)", "La Jeune Fille à la perle", "La Dentellière", "Vue de Delft"), "Culture", ""),
            en = LocalizedContent("Which painting by Vermeer depicts a woman reading a letter?", listOf("Woman in Blue Reading a Letter", "Girl with a Pearl Earring", "The Lacemaker", "View of Delft"), "Culture", ""),
            zh = LocalizedContent("维米尔哪幅画描绘了一位正在读信的女子？", listOf("读信的蓝衣女子", "戴珍珠耳环的少女", "蕾丝花边女工", "代尔夫特风景"), "文化", ""),
            es = LocalizedContent("¿Qué cuadro de Vermeer representa a una mujer leyendo una carta?", listOf("Mujer leyendo una carta", "La joven de la perla", "La encajera", "Vista de Delft"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7073, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Don Juan' (pièce de théâtre française) ?", listOf("Molière", "Corneille", "Racine", "Victor Hugo"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Don Juan' (French play)?", listOf("Molière", "Corneille", "Racine", "Victor Hugo"), "Culture", ""),
            zh = LocalizedContent("谁写了《唐璜》（法国戏剧）？", listOf("莫里哀", "高乃依", "拉辛", "维克多·雨果"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Don Juan' (obra de teatro francesa)?", listOf("Molière", "Corneille", "Racine", "Victor Hugo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7074, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la langue principale de l'opéra historiquement ?", listOf("L'italien", "Le latin", "Le français", "L'allemand"), "Culture", ""),
            en = LocalizedContent("What is the historical main language of opera?", listOf("Italian", "Latin", "French", "German"), "Culture", ""),
            zh = LocalizedContent("历史上歌剧的主要语言是什么？", listOf("意大利语", "拉丁语", "法语", "德语"), "文化", ""),
            es = LocalizedContent("¿Cuál es el idioma principal histórico de la ópera?", listOf("Italiano", "Latín", "Francés", "Alemán"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7075, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur du 'Conte de deux villes' (A Tale of Two Cities) ?", listOf("Charles Dickens", "Thomas Hardy", "William Thackeray", "George Eliot"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'A Tale of Two Cities'?", listOf("Charles Dickens", "Thomas Hardy", "William Thackeray", "George Eliot"), "Culture", ""),
            zh = LocalizedContent("《双城记》的作者是谁？", listOf("查尔斯·狄更斯", "托马斯·哈代", "威廉·萨克雷", "乔治·艾略特"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'Historia de dos ciudades'?", listOf("Charles Dickens", "Thomas Hardy", "William Thackeray", "George Eliot"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7076, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre espagnol est connu pour ses 'Peintures noires' et sa 'Maja' ?", listOf("Francisco Goya", "El Greco", "Bartolomé Murillo", "Diego Velázquez"), "Culture", ""),
            en = LocalizedContent("Which Spanish painter is known for his 'Black Paintings' and 'Maja'?", listOf("Francisco Goya", "El Greco", "Bartolomé Murillo", "Diego Velázquez"), "Culture", ""),
            zh = LocalizedContent("哪位西班牙画家以《黑色绘画》和《玛哈》闻名？", listOf("弗朗西斯科·戈雅", "埃尔·格列柯", "巴托洛梅·穆里略", "迭戈·委拉斯开兹"), "文化", ""),
            es = LocalizedContent("¿Qué pintor español es conocido por sus 'Pinturas negras' y su 'Maja'?", listOf("Francisco Goya", "El Greco", "Bartolomé Murillo", "Diego Velázquez"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7077, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du style artistique extrême japonais avec yeux grands et couleurs vives ?", listOf("Manga / Anime", "Kawaii", "Otaku", "J-Pop"), "Culture", ""),
            en = LocalizedContent("What is the name of the extreme Japanese artistic style with big eyes and bright colors?", listOf("Manga / Anime", "Kawaii", "Otaku", "J-Pop"), "Culture", ""),
            zh = LocalizedContent("那种大眼睛、色彩鲜艳的极端日本艺术风格叫什么？", listOf("漫画/动漫", "可爱", "御宅族", "J-Pop"), "文化", ""),
            es = LocalizedContent("¿Cuál es el nombre del estilo artístico japonés extremo con ojos grandes y colores brillantes?", listOf("Manga / Anime", "Kawaii", "Otaku", "J-Pop"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7078, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'La Métamorphose' (1915) ?", listOf("Franz Kafka", "Stefan Zweig", "Arthur Schnitzler", "Robert Musil"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Metamorphosis' (1915)?", listOf("Franz Kafka", "Stefan Zweig", "Arthur Schnitzler", "Robert Musil"), "Culture", ""),
            zh = LocalizedContent("谁写了《变形记》（1915年）？", listOf("弗朗茨·卡夫卡", "斯特凡·茨威格", "阿图尔·施尼茨勒", "罗伯特·穆齐尔"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'La metamorfosis' (1915)?", listOf("Franz Kafka", "Stefan Zweig", "Arthur Schnitzler", "Robert Musil"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7079, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre est connu pour les 'Nymphéas' et le jardin de Giverny ?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Alfred Sisley", "Camille Pissarro"), "Culture", ""),
            en = LocalizedContent("Which painter is known for the 'Water Lilies' and the garden at Giverny?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Alfred Sisley", "Camille Pissarro"), "Culture", ""),
            zh = LocalizedContent("哪位画家以《睡莲》和吉维尼花园闻名？", listOf("克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "阿尔弗雷德·西斯莱", "卡米耶·毕沙罗"), "文化", ""),
            es = LocalizedContent("¿Qué pintor es conocido por los 'Nenúfares' y el jardín de Giverny?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Alfred Sisley", "Camille Pissarro"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 7080, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le protocole TCP/IP ?", listOf("Protocoles fondamentaux d'internet gérant la transmission de données", "Protocole de sécurité", "Protocole email", "Protocole web uniquement"), "Tech", ""),
            en = LocalizedContent("What is the TCP/IP protocol?", listOf("Fundamental internet protocols managing data transmission", "Security protocol", "Email protocol", "Web-only protocol"), "Technology", ""),
            zh = LocalizedContent("什么是TCP/IP协议？", listOf("管理数据传输的互联网基础协议", "安全协议", "电子邮件协议", "仅用于网页的协议"), "科技", ""),
            es = LocalizedContent("¿Qué es el protocolo TCP/IP?", listOf("Protocolos fundamentales de internet que gestionan la transmisión de datos", "Protocolo de seguridad", "Protocolo de correo electrónico", "Protocolo solo web"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7081, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle du DNS ?", listOf("Convertir les noms de domaine en adresses IP", "Sécuriser les communications", "Gérer la bande passante", "Filtrer le contenu web"), "Tech", ""),
            en = LocalizedContent("What is the role of DNS?", listOf("Convert domain names into IP addresses", "Secure communications", "Manage bandwidth", "Filter web content"), "Technology", ""),
            zh = LocalizedContent("DNS的作用是什么？", listOf("将域名转换为IP地址", "保护通信安全", "管理带宽", "过滤网页内容"), "科技", ""),
            es = LocalizedContent("¿Cuál es el papel del DNS?", listOf("Convertir nombres de dominio en direcciones IP", "Asegurar las comunicaciones", "Gestionar el ancho de banda", "Filtrar contenido web"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7082, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que le zero-knowledge proof ?", listOf("Preuve cryptographique sans révéler l'information elle-même", "Preuve de connaissance nulle", "Anonymisation complète", "Protocole de consensus blockchain"), "Tech", ""),
            en = LocalizedContent("What is a zero-knowledge proof?", listOf("Cryptographic proof without revealing the information itself", "Proof of zero knowledge", "Complete anonymization", "Blockchain consensus protocol"), "Technology", ""),
            zh = LocalizedContent("什么是零知识证明？", listOf("不泄露信息本身的加密证明", "零知识证明", "完全匿名化", "区块链共识协议"), "科技", ""),
            es = LocalizedContent("¿Qué es la prueba de conocimiento cero?", listOf("Prueba criptográfica sin revelar la información en sí", "Prueba de conocimiento nulo", "Anonimización completa", "Protocolo de consenso blockchain"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7083, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une architecture microservices ?", listOf("Application décomposée en services indépendants communiquant via API", "Application monolithique modulaire", "Architecture client-serveur", "Architecture en couches"), "Tech", ""),
            en = LocalizedContent("What is a microservices architecture?", listOf("Application decomposed into independent services communicating via API", "Modular monolithic application", "Client-server architecture", "Layered architecture"), "Technology", ""),
            zh = LocalizedContent("什么是微服务架构？", listOf("将应用分解为通过API通信的独立服务", "模块化单体应用", "客户端-服务器架构", "分层架构"), "科技", ""),
            es = LocalizedContent("¿Qué es una arquitectura de microservicios?", listOf("Aplicación descompuesta en servicios independientes que se comunican mediante API", "Aplicación monolítica modular", "Arquitectura cliente-servidor", "Arquitectura en capas"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7084, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation de Go (Golang) ?", listOf("Langage compilé développé par Google, concurrent et performant", "Langage de script", "Framework Python", "Variante de JavaScript"), "Tech", ""),
            en = LocalizedContent("What is the programming language Go (Golang)?", listOf("Compiled language developed by Google, concurrent and performant", "Scripting language", "Python framework", "JavaScript variant"), "Technology", ""),
            zh = LocalizedContent("Go（Golang）是什么编程语言？", listOf("由Google开发的编译型语言，支持并发且性能高", "脚本语言", "Python框架", "JavaScript变体"), "科技", ""),
            es = LocalizedContent("¿Qué es el lenguaje de programación Go (Golang)?", listOf("Lenguaje compilado desarrollado por Google, concurrente y de alto rendimiento", "Lenguaje de script", "Framework de Python", "Variante de JavaScript"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7085, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le CI/CD ?", listOf("Intégration continue / Déploiement continu", "Centre d'innovation / Conception digitale", "Chiffrement intégré / Contrôle distribué", "Interface de commande / Débogage continu"), "Tech", ""),
            en = LocalizedContent("What is CI/CD?", listOf("Continuous Integration / Continuous Deployment", "Center of Innovation / Digital Design", "Integrated Encryption / Distributed Control", "Command Interface / Continuous Debugging"), "Technology", ""),
            zh = LocalizedContent("什么是CI/CD？", listOf("持续集成/持续部署", "创新中心/数字设计", "集成加密/分布式控制", "命令接口/持续调试"), "科技", ""),
            es = LocalizedContent("¿Qué es CI/CD?", listOf("Integración Continua / Despliegue Continuo", "Centro de Innovación / Diseño Digital", "Cifrado Integrado / Control Distribuido", "Interfaz de Comandos / Depuración Continua"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7086, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le rôle d'un reverse proxy ?", listOf("Intercepter les requêtes client pour les rediriger vers des serveurs backend", "Accélérer les requêtes sortantes", "Filtrer les emails", "Gérer les bases de données"), "Tech", ""),
            en = LocalizedContent("What is the role of a reverse proxy?", listOf("Intercept client requests to redirect them to backend servers", "Accelerate outgoing requests", "Filter emails", "Manage databases"), "Technology", ""),
            zh = LocalizedContent("反向代理的作用是什么？", listOf("拦截客户端请求并将其重定向到后端服务器", "加速出站请求", "过滤电子邮件", "管理数据库"), "科技", ""),
            es = LocalizedContent("¿Cuál es el rol de un proxy inverso?", listOf("Interceptar solicitudes de clientes para redirigirlas a servidores backend", "Acelerar solicitudes salientes", "Filtrar correos electrónicos", "Gestionar bases de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7087, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la complexité algorithmique O(n log n) ?", listOf("Complexité de la plupart des algorithmes de tri efficaces", "Complexité linéaire", "Complexité quadratique", "Complexité exponentielle"), "Tech", ""),
            en = LocalizedContent("What is algorithmic complexity O(n log n)?", listOf("Complexity of most efficient sorting algorithms", "Linear complexity", "Quadratic complexity", "Exponential complexity"), "Technology", ""),
            zh = LocalizedContent("什么是算法复杂度O(n log n)？", listOf("大多数高效排序算法的复杂度", "线性复杂度", "二次复杂度", "指数复杂度"), "科技", ""),
            es = LocalizedContent("¿Qué es la complejidad algorítmica O(n log n)?", listOf("Complejidad de la mayoría de los algoritmos de ordenamiento eficientes", "Complejidad lineal", "Complejidad cuadrática", "Complejidad exponencial"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7088, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel outil permet de gérer les dépendances en Python ?", listOf("pip (et Poetry, conda)", "npm", "Maven", "Gradle"), "Tech", ""),
            en = LocalizedContent("Which tool manages dependencies in Python?", listOf("pip (and Poetry, conda)", "npm", "Maven", "Gradle"), "Technology", ""),
            zh = LocalizedContent("哪个工具用于管理Python中的依赖？", listOf("pip（以及Poetry、conda）", "npm", "Maven", "Gradle"), "科技", ""),
            es = LocalizedContent("¿Qué herramienta gestiona las dependencias en Python?", listOf("pip (y Poetry, conda)", "npm", "Maven", "Gradle"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7089, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le SSO (Single Sign-On) ?", listOf("Authentification unique permettant d'accéder à plusieurs services", "Signature numérique unique", "Serveur sécurisé centralisé", "Session sécurisée unique"), "Tech", ""),
            en = LocalizedContent("What is SSO (Single Sign-On)?", listOf("Single authentication to access multiple services", "Unique digital signature", "Centralized secure server", "Unique secure session"), "Technology", ""),
            zh = LocalizedContent("什么是SSO（单点登录）？", listOf("单一认证即可访问多个服务", "唯一数字签名", "集中式安全服务器", "唯一安全会话"), "科技", ""),
            es = LocalizedContent("¿Qué es SSO (Single Sign-On)?", listOf("Autenticación única para acceder a múltiples servicios", "Firma digital única", "Servidor seguro centralizado", "Sesión segura única"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7090, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le format de sérialisation de données créé par Douglas Crockford ?", listOf("JSON (JavaScript Object Notation)", "XML", "YAML", "CSV"), "Tech", ""),
            en = LocalizedContent("What is the data serialization format created by Douglas Crockford?", listOf("JSON (JavaScript Object Notation)", "XML", "YAML", "CSV"), "Technology", ""),
            zh = LocalizedContent("Douglas Crockford创建的数据序列化格式是什么？", listOf("JSON（JavaScript对象表示法）", "XML", "YAML", "CSV"), "科技", ""),
            es = LocalizedContent("¿Cuál es el formato de serialización de datos creado por Douglas Crockford?", listOf("JSON (JavaScript Object Notation)", "XML", "YAML", "CSV"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7091, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le garbage collection ?", listOf("Récupération automatique de la mémoire non utilisée", "Nettoyage des fichiers temporaires", "Suppression des processus inutiles", "Optimisation de la base de données"), "Tech", ""),
            en = LocalizedContent("What is garbage collection?", listOf("Automatic reclamation of unused memory", "Cleaning temporary files", "Removing unnecessary processes", "Database optimization"), "Technology", ""),
            zh = LocalizedContent("什么是垃圾回收？", listOf("自动回收未使用的内存", "清理临时文件", "删除不必要的进程", "数据库优化"), "科技", ""),
            es = LocalizedContent("¿Qué es la recolección de basura?", listOf("Recuperación automática de memoria no utilizada", "Limpieza de archivos temporales", "Eliminación de procesos innecesarios", "Optimización de base de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7092, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une API RESTful sans état ?", listOf("Chaque requête contient toutes les infos nécessaires, sans contexte serveur", "API avec historique de session", "API sécurisée par token persistant", "API avec base de données intégrée"), "Tech", ""),
            en = LocalizedContent("What is a stateless RESTful API?", listOf("Each request contains all necessary information, no server context", "API with session history", "API secured by persistent token", "API with integrated database"), "Technology", ""),
            zh = LocalizedContent("什么是无状态RESTful API？", listOf("每个请求包含所有必要信息，无服务器上下文", "具有会话历史的API", "通过持久令牌保护的API", "集成数据库的API"), "科技", ""),
            es = LocalizedContent("¿Qué es una API RESTful sin estado?", listOf("Cada solicitud contiene toda la información necesaria, sin contexto del servidor", "API con historial de sesión", "API asegurada por token persistente", "API con base de datos integrada"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7093, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel framework JavaScript est développé par Meta (Facebook) ?", listOf("React", "Angular", "Vue.js", "Svelte"), "Tech", ""),
            en = LocalizedContent("Which JavaScript framework is developed by Meta (Facebook)?", listOf("React", "Angular", "Vue.js", "Svelte"), "Technology", ""),
            zh = LocalizedContent("哪个JavaScript框架由Meta（Facebook）开发？", listOf("React", "Angular", "Vue.js", "Svelte"), "科技", ""),
            es = LocalizedContent("¿Qué framework JavaScript es desarrollado por Meta (Facebook)?", listOf("React", "Angular", "Vue.js", "Svelte"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7094, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le pair programming ?", listOf("Deux développeurs travaillant simultanément sur le même code", "Revue de code par un pair", "Tests en parallèle", "Développement en binôme à distance"), "Tech", ""),
            en = LocalizedContent("What is pair programming?", listOf("Two developers working simultaneously on the same code", "Code review by a peer", "Parallel testing", "Remote pair development"), "Technology", ""),
            zh = LocalizedContent("什么是结对编程？", listOf("两名开发人员同时处理同一代码", "同行代码审查", "并行测试", "远程结对开发"), "科技", ""),
            es = LocalizedContent("¿Qué es la programación en pareja?", listOf("Dos desarrolladores trabajando simultáneamente en el mismo código", "Revisión de código por un compañero", "Pruebas en paralelo", "Desarrollo en pareja remoto"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7095, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le langage principal utilisé pour les scripts système Linux ?", listOf("Bash", "Python", "Perl", "Ruby"), "Tech", ""),
            en = LocalizedContent("What is the primary language used for Linux system scripts?", listOf("Bash", "Python", "Perl", "Ruby"), "Technology", ""),
            zh = LocalizedContent("Linux系统脚本主要使用哪种语言？", listOf("Bash", "Python", "Perl", "Ruby"), "科技", ""),
            es = LocalizedContent("¿Cuál es el lenguaje principal utilizado para los scripts del sistema Linux?", listOf("Bash", "Python", "Perl", "Ruby"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7096, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le modèle OSI ?", listOf("Modèle en 7 couches pour standardiser les communications réseau", "Protocole internet", "Architecture de sécurité", "Modèle de base de données"), "Tech", ""),
            en = LocalizedContent("What is the OSI model?", listOf("7-layer model to standardize network communications", "Internet protocol", "Security architecture", "Database model"), "Technology", ""),
            zh = LocalizedContent("什么是OSI模型？", listOf("7层模型，用于标准化网络通信", "互联网协议", "安全架构", "数据库模型"), "科技", ""),
            es = LocalizedContent("¿Qué es el modelo OSI?", listOf("Modelo de 7 capas para estandarizar las comunicaciones de red", "Protocolo de internet", "Arquitectura de seguridad", "Modelo de base de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7097, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle de HTTPS par rapport à HTTP ?", listOf("Ajoute le chiffrement SSL/TLS pour sécuriser les communications", "Augmente la vitesse", "Compresse les données", "Réduit la latence"), "Tech", ""),
            en = LocalizedContent("What is the role of HTTPS compared to HTTP?", listOf("Adds SSL/TLS encryption to secure communications", "Increases speed", "Compresses data", "Reduces latency"), "Technology", ""),
            zh = LocalizedContent("与HTTP相比，HTTPS的作用是什么？", listOf("添加SSL/TLS加密以保护通信安全", "提高速度", "压缩数据", "减少延迟"), "科技", ""),
            es = LocalizedContent("¿Cuál es el papel de HTTPS en comparación con HTTP?", listOf("Añade cifrado SSL/TLS para asegurar las comunicaciones", "Aumenta la velocidad", "Comprime los datos", "Reduce la latencia"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7098, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'Open Source ?", listOf("Code source librement disponible et modifiable", "Logiciel gratuit uniquement", "Logiciel sans garantie", "Logiciel collaboratif"), "Tech", ""),
            en = LocalizedContent("What is Open Source?", listOf("Source code freely available and modifiable", "Only free software", "Software without warranty", "Collaborative software"), "Technology", ""),
            zh = LocalizedContent("什么是开源？", listOf("源代码可自由获取和修改", "仅免费软件", "无保修软件", "协作软件"), "科技", ""),
            es = LocalizedContent("¿Qué es el Código Abierto?", listOf("Código fuente disponible y modificable libremente", "Software gratuito únicamente", "Software sin garantía", "Software colaborativo"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7099, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel système de fichiers est utilisé par macOS ?", listOf("APFS (Apple File System) depuis 2017 / HFS+", "NTFS", "ext4", "FAT32"), "Tech", ""),
            en = LocalizedContent("Which file system is used by macOS?", listOf("APFS (Apple File System) since 2017 / HFS+", "NTFS", "ext4", "FAT32"), "Technology", ""),
            zh = LocalizedContent("macOS使用哪种文件系统？", listOf("自2017年起使用APFS（Apple文件系统）/ HFS+", "NTFS", "ext4", "FAT32"), "科技", ""),
            es = LocalizedContent("¿Qué sistema de archivos utiliza macOS?", listOf("APFS (Apple File System) desde 2017 / HFS+", "NTFS", "ext4", "FAT32"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 7100, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du trophée de la Ligue des Champions de football ?", listOf("La Coupe aux grandes oreilles", "Le Trophée européen", "La Coupe d'Europe", "Le Bouclier européen"), "Sport", ""),
            en = LocalizedContent("What is the name of the UEFA Champions League trophy?", listOf("The Big Ears Cup", "The European Trophy", "The European Cup", "The European Shield"), "Sports", ""),
            zh = LocalizedContent("欧洲冠军联赛奖杯的名称是什么？", listOf("大耳朵杯", "欧洲奖杯", "欧洲杯", "欧洲盾牌"), "体育", ""),
            es = LocalizedContent("¿Cuál es el nombre del trofeo de la Liga de Campeones de la UEFA?", listOf("La Copa de las Orejas Grandes", "El Trofeo Europeo", "La Copa de Europa", "El Escudo Europeo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7101, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays est né le sumo ?", listOf("Japon", "Corée du Sud", "Chine", "Mongolie"), "Sport", ""),
            en = LocalizedContent("In which country was sumo born?", listOf("Japan", "South Korea", "China", "Mongolia"), "Sports", ""),
            zh = LocalizedContent("相扑起源于哪个国家？", listOf("日本", "韩国", "中国", "蒙古"), "体育", ""),
            es = LocalizedContent("¿En qué país nació el sumo?", listOf("Japón", "Corea del Sur", "China", "Mongolia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7102, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel nombre maximum de sets peut-on jouer en tennis Grand Chelem masculin ?", listOf("5 sets", "3 sets", "7 sets", "4 sets"), "Sport", ""),
            en = LocalizedContent("What is the maximum number of sets that can be played in men's Grand Slam tennis?", listOf("5 sets", "3 sets", "7 sets", "4 sets"), "Sports", ""),
            zh = LocalizedContent("男子网球大满贯比赛中最多可以打多少盘？", listOf("5盘", "3盘", "7盘", "4盘"), "体育", ""),
            es = LocalizedContent("¿Cuál es el número máximo de sets que se pueden jugar en el tenis masculino de Grand Slam?", listOf("5 sets", "3 sets", "7 sets", "4 sets"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7103, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le meilleur joueur de pétanque au monde ?", listOf("Le titre est disputé lors du championnat du monde (France domine)", "Stéphane Robineau", "Marco Foyot", "Henry Lacroix"), "Sport", ""),
            en = LocalizedContent("Who is the best pétanque player in the world?", listOf("The title is contested at the World Championship (France dominates)", "Stéphane Robineau", "Marco Foyot", "Henry Lacroix"), "Sports", ""),
            zh = LocalizedContent("谁是世界上最好的法式滚球运动员？", listOf("该头衔在世界锦标赛上争夺（法国占主导地位）", "斯特凡·罗比诺", "马可·福约", "亨利·拉克鲁瓦"), "体育", ""),
            es = LocalizedContent("¿Quién es el mejor jugador de petanca del mundo?", listOf("El título se disputa en el campeonato mundial (Francia domina)", "Stéphane Robineau", "Marco Foyot", "Henry Lacroix"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7104, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la distance d'un 400 mètres haies ?", listOf("400 mètres avec 10 haies", "400 mètres avec 8 haies", "400 mètres avec 12 haies", "440 mètres avec 10 haies"), "Sport", ""),
            en = LocalizedContent("What is the distance of a 400 meters hurdles?", listOf("400 meters with 10 hurdles", "400 meters with 8 hurdles", "400 meters with 12 hurdles", "440 meters with 10 hurdles"), "Sports", ""),
            zh = LocalizedContent("400米跨栏的距离是多少？", listOf("400米，10个栏架", "400米，8个栏架", "400米，12个栏架", "440米，10个栏架"), "体育", ""),
            es = LocalizedContent("¿Cuál es la distancia de los 400 metros vallas?", listOf("400 metros con 10 vallas", "400 metros con 8 vallas", "400 metros con 12 vallas", "440 metros con 10 vallas"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7105, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de fois la Coupe Davis en tennis ?", listOf("États-Unis (32 fois)", "Espagne", "Australie", "France"), "Sport", ""),
            en = LocalizedContent("Which country has won the Davis Cup in tennis the most times?", listOf("United States (32 times)", "Spain", "Australia", "France"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得网球戴维斯杯次数最多？", listOf("美国（32次）", "西班牙", "澳大利亚", "法国"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado la Copa Davis de tenis más veces?", listOf("Estados Unidos (32 veces)", "España", "Australia", "Francia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7106, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'hang time' ?", listOf("Basketball (temps en l'air lors d'un saut)", "Football américain", "Volleyball", "Saut en hauteur"), "Sport", ""),
            en = LocalizedContent("In which sport is 'hang time' practiced?", listOf("Basketball (time in the air during a jump)", "American football", "Volleyball", "High jump"), "Sports", ""),
            zh = LocalizedContent("哪项运动中有“滞空时间”的概念？", listOf("篮球（跳跃时在空中停留的时间）", "美式橄榄球", "排球", "跳高"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'hang time'?", listOf("Baloncesto (tiempo en el aire durante un salto)", "Fútbol americano", "Voleibol", "Salto de altura"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7107, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel nageur a remporté 8 médailles d'or aux JO 2008 ?", listOf("Michael Phelps", "Ryan Lochte", "Ian Thorpe", "Grant Hackett"), "Sport", ""),
            en = LocalizedContent("Which swimmer won 8 gold medals at the 2008 Olympics?", listOf("Michael Phelps", "Ryan Lochte", "Ian Thorpe", "Grant Hackett"), "Sports", ""),
            zh = LocalizedContent("哪位游泳运动员在2008年奥运会上获得了8枚金牌？", listOf("迈克尔·菲尔普斯", "瑞安·洛赫特", "伊恩·索普", "格兰特·哈克特"), "体育", ""),
            es = LocalizedContent("¿Qué nadador ganó 8 medallas de oro en los Juegos Olímpicos de 2008?", listOf("Michael Phelps", "Ryan Lochte", "Ian Thorpe", "Grant Hackett"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7108, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de kilomètres fait le Tour d'Italie (Giro) ?", listOf("Environ 3 500 km sur 21 étapes", "2 000 km", "4 500 km", "5 000 km"), "Sport", ""),
            en = LocalizedContent("How many kilometers is the Tour of Italy (Giro)?", listOf("About 3,500 km over 21 stages", "2,000 km", "4,500 km", "5,000 km"), "Sports", ""),
            zh = LocalizedContent("环意大利自行车赛（Giro）全程多少公里？", listOf("约3500公里，共21个赛段", "2000公里", "4500公里", "5000公里"), "体育", ""),
            es = LocalizedContent("¿Cuántos kilómetros tiene el Tour de Italia (Giro)?", listOf("Aproximadamente 3.500 km en 21 etapas", "2.000 km", "4.500 km", "5.000 km"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7109, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel équipement protège la tête au cricket ?", listOf("Un casque et des jambières", "Un masque intégral", "Un bonnet de protection", "Une visière uniquement"), "Sport", ""),
            en = LocalizedContent("What equipment protects the head in cricket?", listOf("A helmet and leg pads", "A full-face mask", "A protective cap", "A visor only"), "Sports", ""),
            zh = LocalizedContent("板球运动中什么装备保护头部？", listOf("头盔和护腿", "全面罩", "防护帽", "仅面罩"), "体育", ""),
            es = LocalizedContent("¿Qué equipo protege la cabeza en el críquet?", listOf("Un casco y espinilleras", "Una máscara integral", "Un gorro protector", "Solo una visera"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7110, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le sport le plus dangereux au monde selon les statistiques ?", listOf("BASE jump / Alpinisme extrême", "Football américain", "Rugby", "Course automobile"), "Sport", ""),
            en = LocalizedContent("What is the most dangerous sport in the world according to statistics?", listOf("BASE jump / Extreme mountaineering", "American football", "Rugby", "Auto racing"), "Sports", ""),
            zh = LocalizedContent("根据统计数据，世界上最危险的运动是什么？", listOf("定点跳伞/极限登山", "美式橄榄球", "橄榄球", "赛车"), "体育", ""),
            es = LocalizedContent("¿Cuál es el deporte más peligroso del mundo según las estadísticas?", listOf("Salto BASE / Montañismo extremo", "Fútbol americano", "Rugby", "Automovilismo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7111, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a remporté le plus de médailles aux JO d'hiver ?", listOf("Norvège", "États-Unis", "Allemagne", "Autriche"), "Sport", ""),
            en = LocalizedContent("Which country has won the most medals at the Winter Olympics?", listOf("Norway", "United States", "Germany", "Austria"), "Sports", ""),
            zh = LocalizedContent("哪个国家在冬季奥运会上获得奖牌最多？", listOf("挪威", "美国", "德国", "奥地利"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más medallas en los Juegos Olímpicos de Invierno?", listOf("Noruega", "Estados Unidos", "Alemania", "Austria"), "Deportes", "")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 7112, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le football féminin a-t-il été introduit aux JO ?", listOf("1996 (Atlanta)", "1984", "2000", "1988"), "Sport", ""),
            en = LocalizedContent("In which year was women's football introduced to the Olympics?", listOf("1996 (Atlanta)", "1984", "2000", "1988"), "Sports", ""),
            zh = LocalizedContent("女子足球在哪一年被引入奥运会？", listOf("1996年（亚特兰大）", "1984年", "2000年", "1988年"), "体育", ""),
            es = LocalizedContent("¿En qué año se introdujo el fútbol femenino en los Juegos Olímpicos?", listOf("1996 (Atlanta)", "1984", "2000", "1988"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7113, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le record de but sur une saison en NBA ?", listOf("Wilt Chamberlain (4 029 points en 1961-62)", "Michael Jordan", "Kareem Abdul-Jabbar", "LeBron James"), "Sport", ""),
            en = LocalizedContent("What is the record for most points in a single NBA season?", listOf("Wilt Chamberlain (4,029 points in 1961-62)", "Michael Jordan", "Kareem Abdul-Jabbar", "LeBron James"), "Sports", ""),
            zh = LocalizedContent("NBA单赛季得分纪录是多少？", listOf("威尔特·张伯伦（1961-62赛季4029分）", "迈克尔·乔丹", "卡里姆·阿卜杜尔-贾巴尔", "勒布朗·詹姆斯"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord de puntos en una temporada de la NBA?", listOf("Wilt Chamberlain (4,029 puntos en 1961-62)", "Michael Jordan", "Kareem Abdul-Jabbar", "LeBron James"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7114, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'Grand Prix' en dressage ?", listOf("Équitation", "Formule 1", "Cyclisme", "Athlétisme"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'Grand Prix' dressage performed?", listOf("Equestrian", "Formula 1", "Cycling", "Athletics"), "Sports", ""),
            zh = LocalizedContent("在哪个运动项目中会进行盛装舞步的'大奖赛'？", listOf("马术", "一级方程式赛车", "自行车", "田径"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'Grand Prix' de doma clásica?", listOf("Equitación", "Fórmula 1", "Ciclismo", "Atletismo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 7115, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle equipe nationale a remporte la Coupe du Monde de football 2018 ?", listOf("Croatie", "Bresil", "France", "Allemagne"), "Sport", "L'équipe de France a battu la Croatie 4-2 en finale le 15 juillet 2018 à Moscou, remportant ainsi son deuxième titre mondial après 1998."),
            en = LocalizedContent("Which national team won the 2018 FIFA World Cup?", listOf("Croatia", "Brazil", "France", "Germany"), "Sports", "The French team beat Croatia 4-2 in the final on July 15, 2018 in Moscow, winning their second world title after 1998."),
            zh = LocalizedContent("哪支国家队赢得了2018年国际足联世界杯？", listOf("克罗地亚", "巴西", "法国", "德国"), "体育", "法国队于2018年7月15日在莫斯科以4-2击败克罗地亚，赢得了自1998年后的第二个世界冠军。"),
            es = LocalizedContent("¿Qué selección nacional ganó la Copa Mundial de la FIFA 2018?", listOf("Croacia", "Brasil", "Francia", "Alemania"), "Deportes", "La selección francesa venció a Croacia 4-2 en la final el 15 de julio de 2018 en Moscú, obteniendo su segundo título mundial después de 1998.")
        ),
        BilingualQuestion(
            id = 7116, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fruit est utilisé pour faire le guacamole ?", listOf("Avocat", "Poire", "Kiwi", "Papaye"), "Gastronomie", ""),
            en = LocalizedContent("Which fruit is used to make guacamole?", listOf("Avocado", "Pear", "Kiwi", "Papaya"), "Gastronomy", ""),
            zh = LocalizedContent("哪种水果用于制作鳄梨酱？", listOf("鳄梨", "梨", "猕猴桃", "木瓜"), "美食", ""),
            es = LocalizedContent("¿Qué fruta se usa para hacer guacamole?", listOf("Aguacate", "Pera", "Kiwi", "Papaya"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7117, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la lacto-fermentation ?", listOf("Fermentation par bactéries lactiques produisant acide lactique", "Fermentation alcoolique du lait", "Pasteurisation du lait", "Acidification chimique"), "Gastronomie", ""),
            en = LocalizedContent("What is lacto-fermentation?", listOf("Fermentation by lactic acid bacteria producing lactic acid", "Alcoholic fermentation of milk", "Pasteurization of milk", "Chemical acidification"), "Gastronomy", ""),
            zh = LocalizedContent("什么是乳酸发酵？", listOf("由乳酸菌发酵产生乳酸", "牛奶的酒精发酵", "牛奶的巴氏杀菌", "化学酸化"), "美食", ""),
            es = LocalizedContent("¿Qué es la lactofermentación?", listOf("Fermentación por bacterias lácticas que producen ácido láctico", "Fermentación alcohólica de la leche", "Pasteurización de la leche", "Acidificación química"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7118, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principal ingrédient des sushis ?", listOf("Riz vinaigré (shari)", "Poisson cru uniquement", "Algue nori", "Sauce soja"), "Gastronomie", ""),
            en = LocalizedContent("What is the main ingredient of sushi?", listOf("Vinegared rice (shari)", "Raw fish only", "Nori seaweed", "Soy sauce"), "Gastronomy", ""),
            zh = LocalizedContent("寿司的主要成分是什么？", listOf("醋饭（舍利）", "仅生鱼片", "海苔", "酱油"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente principal del sushi?", listOf("Arroz avinagrado (shari)", "Solo pescado crudo", "Alga nori", "Salsa de soja"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7119, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a inventé la fondue au fromage ?", listOf("Suisse", "France", "Savoie (France)", "Italie"), "Gastronomie", ""),
            en = LocalizedContent("Which country invented cheese fondue?", listOf("Switzerland", "France", "Savoie (France)", "Italy"), "Gastronomy", ""),
            zh = LocalizedContent("哪个国家发明了奶酪火锅？", listOf("瑞士", "法国", "萨瓦（法国）", "意大利"), "美食", ""),
            es = LocalizedContent("¿Qué país inventó la fondue de queso?", listOf("Suiza", "Francia", "Saboya (Francia)", "Italia"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7120, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le zaatar ?", listOf("Mélange d'épices du Moyen-Orient (thym, sumac, sésame)", "Sauce pimentée", "Fromage arabe", "Pain plat"), "Gastronomie", ""),
            en = LocalizedContent("What is za'atar?", listOf("Middle Eastern spice blend (thyme, sumac, sesame)", "Spicy sauce", "Arab cheese", "Flatbread"), "Gastronomy", ""),
            zh = LocalizedContent("什么是扎阿塔尔？", listOf("中东香料混合物（百里香、漆树、芝麻）", "辣酱", "阿拉伯奶酪", "扁面包"), "美食", ""),
            es = LocalizedContent("¿Qué es el zaatar?", listOf("Mezcla de especias de Oriente Medio (tomillo, zumaque, sésamo)", "Salsa picante", "Queso árabe", "Pan plano"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7121, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la différence entre café arabica et robusta ?", listOf("Arabica : doux et complexe, moins caféine ; Robusta : fort et amer, plus caféine", "Arabica a plus de caféine", "Robusta est plus cher", "Ce sont des méthodes de torréfaction"), "Gastronomie", ""),
            en = LocalizedContent("What is the difference between Arabica and Robusta coffee?", listOf("Arabica: smooth and complex, less caffeine; Robusta: strong and bitter, more caffeine", "Arabica has more caffeine", "Robusta is more expensive", "They are roasting methods"), "Gastronomy", ""),
            zh = LocalizedContent("阿拉比卡咖啡和罗布斯塔咖啡有什么区别？", listOf("阿拉比卡：口感顺滑复杂，咖啡因较少；罗布斯塔：口感强烈苦涩，咖啡因较多", "阿拉比卡咖啡因更多", "罗布斯塔更贵", "它们是烘焙方法"), "美食", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre el café arábica y el robusta?", listOf("Arábica: suave y complejo, menos cafeína; Robusta: fuerte y amargo, más cafeína", "Arábica tiene más cafeína", "Robusta es más caro", "Son métodos de tostado"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat symbolique de la cuisine mexicaine avec de la viande marinée ?", listOf("Tacos al pastor", "Burrito", "Quesadilla", "Enchiladas"), "Gastronomie", ""),
            en = LocalizedContent("What is the symbolic dish of Mexican cuisine with marinated meat?", listOf("Tacos al pastor", "Burrito", "Quesadilla", "Enchiladas"), "Gastronomy", ""),
            zh = LocalizedContent("墨西哥菜中带有腌制肉的标志性菜肴是什么？", listOf("牧师玉米卷", "卷饼", "墨西哥芝士馅饼", "辣酱玉米卷饼"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato simbólico de la cocina mexicana con carne marinada?", listOf("Tacos al pastor", "Burrito", "Quesadilla", "Enchiladas"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7123, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le ghee ?", listOf("Beurre clarifié de la cuisine indienne", "Huile de noix de coco", "Graisse de porc épurée", "Lait fermenté"), "Gastronomie", ""),
            en = LocalizedContent("What is ghee?", listOf("Clarified butter from Indian cuisine", "Coconut oil", "Refined pork fat", "Fermented milk"), "Gastronomy", ""),
            zh = LocalizedContent("什么是酥油？", listOf("印度菜中的澄清黄油", "椰子油", "精炼猪油", "发酵牛奶"), "美食", ""),
            es = LocalizedContent("¿Qué es el ghee?", listOf("Mantequilla clarificada de la cocina india", "Aceite de coco", "Grasa de cerdo refinada", "Leche fermentada"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7124, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fromage le plus consommé dans le monde ?", listOf("La mozzarella", "Le cheddar", "L'emmental", "Le brie"), "Gastronomie", ""),
            en = LocalizedContent("What is the most consumed cheese in the world?", listOf("Mozzarella", "Cheddar", "Emmental", "Brie"), "Gastronomy", ""),
            zh = LocalizedContent("世界上消费最多的奶酪是什么？", listOf("马苏里拉奶酪", "切达奶酪", "埃曼塔尔奶酪", "布里奶酪"), "美食", ""),
            es = LocalizedContent("¿Cuál es el queso más consumido del mundo?", listOf("Mozzarella", "Cheddar", "Emmental", "Brie"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7125, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel condiment japonais est fabriqué à partir de graines de soja fermentées ?", listOf("Le miso (pâte) ou la sauce soja (shoyu)", "Le sake", "Le mirin", "Le dashi"), "Gastronomie", ""),
            en = LocalizedContent("Which Japanese condiment is made from fermented soybeans?", listOf("Miso (paste) or soy sauce (shoyu)", "Sake", "Mirin", "Dashi"), "Gastronomy", ""),
            zh = LocalizedContent("哪种日本调味品由发酵大豆制成？", listOf("味噌（酱）或酱油", "清酒", "味醂", "高汤"), "美食", ""),
            es = LocalizedContent("¿Qué condimento japonés se elabora a partir de soja fermentada?", listOf("Miso (pasta) o salsa de soja (shoyu)", "Sake", "Mirin", "Dashi"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7126, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la cuisine 'farm to table' ?", listOf("Cuisine privilégiant produits locaux directs du producteur", "Cuisine végétarienne uniquement", "Cuisine gastronomique haut de gamme", "Cuisine industrielle artisanale"), "Gastronomie", ""),
            en = LocalizedContent("What is 'farm to table' cuisine?", listOf("Cuisine prioritizing local products directly from the producer", "Vegetarian cuisine only", "High-end gastronomic cuisine", "Artisanal industrial cuisine"), "Gastronomy", ""),
            zh = LocalizedContent("什么是“从农场到餐桌”的烹饪方式？", listOf("优先使用直接来自生产者的本地产品的烹饪方式", "仅限素食烹饪", "高端美食烹饪", "手工工业烹饪"), "美食", ""),
            es = LocalizedContent("¿Qué es la cocina 'de la granja a la mesa'?", listOf("Cocina que prioriza productos locales directos del productor", "Cocina vegetariana únicamente", "Cocina gastronómica de alta gama", "Cocina industrial artesanal"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7127, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'ingrédient secret traditionnel du coq au vin ?", listOf("Le vin rouge (Bourgogne traditionnellement)", "La crème fraîche", "La moutarde", "Le cognac"), "Gastronomie", ""),
            en = LocalizedContent("What is the traditional secret ingredient of coq au vin?", listOf("Red wine (traditionally Burgundy)", "Crème fraîche", "Mustard", "Cognac"), "Gastronomy", ""),
            zh = LocalizedContent("红酒炖鸡的传统秘密配料是什么？", listOf("红葡萄酒（传统上用勃艮第）", "鲜奶油", "芥末", "干邑"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente secreto tradicional del coq au vin?", listOf("Vino tinto (tradicionalmente de Borgoña)", "Crème fraîche", "Mostaza", "Cognac"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le dessert traditionnel autrichien à base de pâte fine feuilletée ?", listOf("Strudel aux pommes", "Sachertorte", "Linzer Torte", "Kaiserschmarrn"), "Gastronomie", ""),
            en = LocalizedContent("What is the traditional Austrian dessert made of thin flaky pastry?", listOf("Apple strudel", "Sachertorte", "Linzer Torte", "Kaiserschmarrn"), "Gastronomy", ""),
            zh = LocalizedContent("哪种传统的奥地利甜点由薄酥皮制成？", listOf("苹果卷", "萨赫蛋糕", "林茨蛋糕", "皇帝煎饼"), "美食", ""),
            es = LocalizedContent("¿Cuál es el postre tradicional austriaco hecho de masa fina y hojaldrada?", listOf("Strudel de manzana", "Sachertorte", "Linzer Torte", "Kaiserschmarrn"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7129, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la boisson nationale du Mexique (fermentée) ?", listOf("Le pulque (agave), puis la tequila et le mezcal (distillés)", "La tequila uniquement", "Le mezcal", "La cerveza"), "Gastronomie", ""),
            en = LocalizedContent("What is the national fermented drink of Mexico?", listOf("Pulque (agave), then tequila and mezcal (distilled)", "Tequila only", "Mezcal", "Cerveza"), "Gastronomy", ""),
            zh = LocalizedContent("墨西哥的国饮（发酵饮料）是什么？", listOf("龙舌兰酒（普尔克），然后是特基拉和梅斯卡尔（蒸馏酒）", "仅特基拉", "梅斯卡尔", "啤酒"), "美食", ""),
            es = LocalizedContent("¿Cuál es la bebida nacional fermentada de México?", listOf("Pulque (agave), luego tequila y mezcal (destilados)", "Solo tequila", "Mezcal", "Cerveza"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 7201, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de chromosomes possede une cellule humaine normale ?", listOf("23", "44", "46", "48"), "Science", "Chaque cellule humaine normale contient 23 paires de chromosomes, soit 46 au total, héritées des deux parents."),
            en = LocalizedContent("How many chromosomes does a normal human cell have?", listOf("23", "44", "46", "48"), "Science", "Each normal human cell contains 23 pairs of chromosomes, totaling 46, inherited from both parents."),
            zh = LocalizedContent("正常人体细胞有多少条染色体？", listOf("23", "44", "46", "48"), "科学", "每个正常人体细胞含有23对染色体，共46条，遗传自父母双方。"),
            es = LocalizedContent("¿Cuántos cromosomas tiene una célula humana normal?", listOf("23", "44", "46", "48"), "Ciencia", "Cada célula humana normal contiene 23 pares de cromosomas, 46 en total, heredados de ambos padres.")
        ),
        BilingualQuestion(
            id = 7202, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel metal est le meilleur conducteur electrique ?", listOf("Or", "Cuivre", "Argent", "Aluminium"), "Science", "L'argent possède la plus haute conductivité électrique de tous les métaux à température ambiante, ce qui le rend idéal pour les contacts électriques et les circuits haute performance."),
            en = LocalizedContent("Which metal is the best electrical conductor?", listOf("Gold", "Copper", "Silver", "Aluminum"), "Science", "Silver has the highest electrical conductivity of all metals at room temperature, making it ideal for electrical contacts and high-performance circuits."),
            zh = LocalizedContent("哪种金属是最好的电导体？", listOf("金", "铜", "银", "铝"), "科学", "银在室温下具有所有金属中最高的电导率，使其成为电触点和高性能电路的理想选择。"),
            es = LocalizedContent("¿Qué metal es el mejor conductor eléctrico?", listOf("Oro", "Cobre", "Plata", "Aluminio"), "Ciencia", "La plata posee la mayor conductividad eléctrica de todos los metales a temperatura ambiente, lo que la hace ideal para contactos eléctricos y circuitos de alto rendimiento.")
        ),
    )
}
