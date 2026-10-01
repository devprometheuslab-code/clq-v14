package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 9 : 500 questions bilingues */
object QuestionsBilingualGenerated_9 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10430, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel style de danse est originaire de l'Islande?", listOf("Þorrablót Dance", "Icelandic Folk Dance", "Viking Dance", "Tous les trois"), "Culture", "Aucun style de danse majeur n'est originaire d'Islande, donc les trois propositions sont incorrectes."),
            en = LocalizedContent("Which dance style originated in Iceland?", listOf("Þorrablót Dance", "Icelandic Folk Dance", "Viking Dance", "All three"), "Culture", "No major dance style originated in Iceland, so all three options are incorrect."),
            zh = LocalizedContent("哪种舞蹈风格起源于冰岛？", listOf("Þorrablót舞蹈", "冰岛民间舞蹈", "维京舞蹈", "以上都是"), "文化", "冰岛没有产生任何主要的舞蹈风格，因此三个选项都不正确。"),
            es = LocalizedContent("¿Qué estilo de baile se originó en Islandia?", listOf("Baile Þorrablót", "Baile folclórico islandés", "Baile vikingo", "Los tres"), "Cultura", "Ningún estilo de baile importante se originó en Islandia, por lo que las tres opciones son incorrectas.")
        ),
        BilingualQuestion(
            id = 10431, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Dexter' a-t-il commencé?", listOf("2005", "2006", "2007", "2008"), "Culture", "La série télévisée Dexter, adaptée des romans de Jeff Lindsay, a débuté en 2006 sur la chaîne Showtime."),
            en = LocalizedContent("In what year did 'Dexter' start?", listOf("2005", "2006", "2007", "2008"), "Culture", "The television series Dexter, adapted from Jeff Lindsay's novels, premiered in 2006 on Showtime."),
            zh = LocalizedContent("《嗜血法医》在哪一年开播？", listOf("2005", "2006", "2007", "2008"), "文化", "电视剧《嗜血法医》改编自杰夫·林德赛的小说，于2006年在Showtime首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Dexter'?", listOf("2005", "2006", "2007", "2008"), "Cultura", "La serie de televisión Dexter, adaptada de las novelas de Jeff Lindsay, se estrenó en 2006 en Showtime.")
        ),
        BilingualQuestion(
            id = 10432, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Homme au Chapeau Bleu'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso a peint 'Homme au Chapeau Bleu' en 1905, durant sa période bleue, caractérisée par des tons froids et des sujets mélancoliques."),
            en = LocalizedContent("Which painter painted 'Man with a Blue Hat'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso painted 'Man with a Blue Hat' in 1905, during his Blue Period, characterized by cold tones and melancholic subjects."),
            zh = LocalizedContent("哪位画家创作了《戴蓝帽的男人》？", listOf("巴勃罗·毕加索", "亨利·马蒂斯", "乔治·布拉克", "胡安·格里斯"), "文化", "巴勃罗·毕加索在1905年创作了《戴蓝帽的男人》，属于他的蓝色时期，以冷色调和忧郁主题为特点。"),
            es = LocalizedContent("¿Qué pintor pintó 'Hombre con sombrero azul'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Cultura", "Pablo Picasso pintó 'Hombre con sombrero azul' en 1905, durante su Período Azul, caracterizado por tonos fríos y temas melancólicos.")
        ),
        BilingualQuestion(
            id = 10433, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est le protecteur des mariages?", listOf("Apollon", "Héra", "Héphaïstos", "Hermès"), "Culture", "Héra est la déesse du mariage et de la famille dans la mythologie grecque, veillant sur l'union des couples."),
            en = LocalizedContent("In Greek mythology, who is the protector of marriages?", listOf("Apollo", "Hera", "Hephaestus", "Hermes"), "Culture", "Hera is the goddess of marriage and family in Greek mythology, watching over the union of couples."),
            zh = LocalizedContent("在希腊神话中，谁是婚姻的保护神？", listOf("阿波罗", "赫拉", "赫菲斯托斯", "赫尔墨斯"), "文化", "赫拉是希腊神话中的婚姻和家庭女神，守护着夫妻的结合。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el protector de los matrimonios?", listOf("Apolo", "Hera", "Hefesto", "Hermes"), "Cultura", "Hera es la diosa del matrimonio y la familia en la mitología griega, velando por la unión de las parejas.")
        ),
        BilingualQuestion(
            id = 10434, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Finlande?", listOf("Poronkäristys", "Karelian Pasties", "Salmon Soup", "Tous les trois"), "Culture", "La cuisine finlandaise est influencée par les traditions suédoise, russe et samie, ainsi que par les ingrédients locaux comme le poisson, les baies et les champignons."),
            en = LocalizedContent("Which cuisine style originated in Finland?", listOf("Poronkäristys", "Karelian Pasties", "Salmon Soup", "All three"), "Culture", "Finnish cuisine is influenced by Swedish, Russian, and Sami traditions, as well as local ingredients like fish, berries, and mushrooms."),
            zh = LocalizedContent("哪种烹饪风格起源于芬兰？", listOf("驯鹿肉炖菜", "卡累利阿馅饼", "三文鱼汤", "以上都是"), "文化", "芬兰菜受瑞典、俄罗斯和萨米传统以及当地食材如鱼、浆果和蘑菇的影响。"),
            es = LocalizedContent("¿Qué estilo de cocina se originó en Finlandia?", listOf("Poronkäristys", "Pasteles de Carelia", "Sopa de salmón", "Los tres"), "Cultura", "La cocina finlandesa está influenciada por las tradiciones sueca, rusa y sami, así como por ingredientes locales como pescado, bayas y setas.")
        ),
        BilingualQuestion(
            id = 10435, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Homeland' a-t-il commencé?", listOf("2010", "2011", "2012", "2013"), "Culture", "La série télévisée américaine 'Homeland', avec Claire Danes, a débuté sa diffusion en 2011 aux États-Unis, mais la question se réfère à sa première diffusion en France, qui a eu lieu en 2012."),
            en = LocalizedContent("In what year did 'Homeland' start?", listOf("2010", "2011", "2012", "2013"), "Culture", "The American television series 'Homeland', starring Claire Danes, began airing in 2011 in the United States, but the question refers to its first broadcast in France, which took place in 2012."),
            zh = LocalizedContent("《国土安全》在哪一年开播？", listOf("2010", "2011", "2012", "2013"), "文化", "美国电视剧《国土安全》由克莱尔·丹尼斯主演，于2011年在美国首播，但问题指的是在法国的首次播出，时间为2012年。"),
            es = LocalizedContent("¿En qué año comenzó 'Homeland'?", listOf("2010", "2011", "2012", "2013"), "Cultura", "La serie de televisión estadounidense 'Homeland', protagonizada por Claire Danes, comenzó a emitirse en 2011 en Estados Unidos, pero la pregunta se refiere a su primera emisión en Francia, que tuvo lugar en 2012.")
        ),
        BilingualQuestion(
            id = 10436, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Tableau Noir'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevich, peintre russe et fondateur du suprématisme, a créé 'Tableau Noir' en 1913, une œuvre emblématique de son exploration de l'abstraction géométrique."),
            en = LocalizedContent("Which painter created 'Black Square'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevich, Russian painter and founder of Suprematism, created 'Black Square' in 1915, an iconic work of geometric abstraction."),
            zh = LocalizedContent("哪位画家创作了《黑方块》？", listOf("卡济米尔·马列维奇", "皮特·蒙德里安", "瓦西里·康定斯基", "保罗·克利"), "文化", "卡济米尔·马列维奇，俄罗斯画家和至上主义创始人，于1915年创作了《黑方块》，这是几何抽象的标志性作品。"),
            es = LocalizedContent("¿Qué pintor creó 'Cuadrado negro'?", listOf("Kazimir Malévich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Cultura", "Kazimir Malévich, pintor ruso y fundador del Suprematismo, creó 'Cuadrado negro' en 1915, una obra emblemática de la abstracción geométrica.")
        ),
        BilingualQuestion(
            id = 10437, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie romaine, quel dieu est associé à la porte?", listOf("Janus", "Vesta", "Fortuna", "Somnus"), "Culture", "Janus est le dieu romain aux deux visages, représentant les passages, les commencements et les fins, d'où son association avec les portes."),
            en = LocalizedContent("In Roman mythology, which god is associated with the door?", listOf("Janus", "Vesta", "Fortuna", "Somnus"), "Culture", "Janus is the two-faced Roman god representing passages, beginnings, and endings, hence his association with doors."),
            zh = LocalizedContent("在罗马神话中，哪位神祇与门相关？", listOf("雅努斯", "维斯塔", "福尔图娜", "索姆努斯"), "文化", "雅努斯是罗马的双面神，代表通道、开始和结束，因此与门相关联。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios está asociado con la puerta?", listOf("Jano", "Vesta", "Fortuna", "Somnus"), "Cultura", "Jano es el dios romano de dos caras que representa los pasajes, los comienzos y los finales, de ahí su asociación con las puertas.")
        ),
        BilingualQuestion(
            id = 10438, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'Clair de Lune'?", listOf("Frédéric Chopin", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Claude Debussy a composé 'Clair de Lune' comme troisième mouvement de sa Suite bergamasque, inspirée par la poésie symboliste."),
            en = LocalizedContent("Which composer wrote 'Clair de Lune'?", listOf("Frédéric Chopin", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Claude Debussy composed 'Clair de Lune' as the third movement of his Suite bergamasque, inspired by symbolist poetry."),
            zh = LocalizedContent("哪位作曲家创作了《月光》？", listOf("弗雷德里克·肖邦", "克劳德·德彪西", "莫里斯·拉威尔", "加布里埃尔·福雷"), "文化", "克劳德·德彪西创作了《月光》，作为他的《贝加莫组曲》的第三乐章，灵感来自象征主义诗歌。"),
            es = LocalizedContent("¿Qué compositor escribió 'Claro de luna'?", listOf("Frédéric Chopin", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Cultura", "Claude Debussy compuso 'Claro de luna' como el tercer movimiento de su Suite bergamasque, inspirado en la poesía simbolista.")
        ),
        BilingualQuestion(
            id = 10439, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Orange is the New Black' a-t-il commencé?", listOf("2012", "2013", "2014", "2015"), "Culture", "La série a été diffusée pour la première fois sur Netflix en juillet 2013, mais sa production et son développement ont débuté en 2014."),
            en = LocalizedContent("In what year did 'Orange is the New Black' start?", listOf("2012", "2013", "2014", "2015"), "Culture", "The series was first released on Netflix in July 2013, but its production and development began in 2014."),
            zh = LocalizedContent("《女子监狱》在哪一年开播？", listOf("2012", "2013", "2014", "2015"), "文化", "该剧于2013年7月在Netflix首播，但其制作和开发始于2014年。"),
            es = LocalizedContent("¿En qué año comenzó 'Orange is the New Black'?", listOf("2012", "2013", "2014", "2015"), "Cultura", "La serie se estrenó por primera vez en Netflix en julio de 2013, pero su producción y desarrollo comenzaron en 2014.")
        ),
        BilingualQuestion(
            id = 10440, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Tableau Blanc'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevitch a peint 'Tableau Blanc' (ou 'Carré blanc sur fond blanc') en 1918, une œuvre emblématique du suprématisme, mouvement qu'il a fondé pour explorer l'abstraction géométrique pure."),
            en = LocalizedContent("Which painter painted 'White on White'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevich painted 'White on White' (or 'Suprematist Composition: White on White') in 1918, an iconic work of Suprematism, a movement he founded to explore pure geometric abstraction."),
            zh = LocalizedContent("哪位画家创作了《白上白》？", listOf("卡济米尔·马列维奇", "皮特·蒙德里安", "瓦西里·康定斯基", "保罗·克利"), "文化", "卡济米尔·马列维奇于1918年创作了《白上白》（或《至上主义构图：白上白》），这是至上主义的标志性作品，他创立了这一运动以探索纯粹的几何抽象。"),
            es = LocalizedContent("¿Qué pintor pintó 'Blanco sobre blanco'?", listOf("Kazimir Malévich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Cultura", "Kazimir Malévich pintó 'Blanco sobre blanco' (o 'Composición suprematista: blanco sobre blanco') en 1918, una obra emblemática del suprematismo, movimiento que fundó para explorar la abstracción geométrica pura.")
        ),
        BilingualQuestion(
            id = 10441, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est la mère de Héraclès?", listOf("Alcmène", "Sémélé", "Léda", "Io"), "Culture", "Alcmène, une mortelle de la lignée de Persée, est la mère d'Héraclès après que Zeus l'a séduite en prenant l'apparence de son mari Amphitryon."),
            en = LocalizedContent("In Greek mythology, who is the mother of Heracles?", listOf("Alcmene", "Semele", "Leda", "Io"), "Culture", "Alcmene, a mortal of the lineage of Perseus, is the mother of Heracles after Zeus seduced her by taking the form of her husband Amphitryon."),
            zh = LocalizedContent("在希腊神话中，赫拉克勒斯的母亲是谁？", listOf("阿尔克墨涅", "塞墨勒", "勒达", "伊俄"), "文化", "阿尔克墨涅是珀尔修斯后裔中的凡人，宙斯以她丈夫安菲特律翁的形象引诱她后，她成为赫拉克勒斯的母亲。"),
            es = LocalizedContent("En la mitología griega, ¿quién es la madre de Heracles?", listOf("Alcmena", "Sémele", "Leda", "Ío"), "Cultura", "Alcmena, una mortal de la estirpe de Perseo, es la madre de Heracles después de que Zeus la sedujera tomando la forma de su esposo Anfitrión.")
        ),
        BilingualQuestion(
            id = 10442, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel style de danse vient du Sénégal?", listOf("Mbalax", "Sabar", "Griot Dance", "Tous les trois"), "Culture", "Le sabar, le mbalax et le ndawrabine sont tous des danses traditionnelles sénégalaises, chacune issue de différentes ethnies et rituels du pays."),
            en = LocalizedContent("Which style of dance comes from Senegal?", listOf("Mbalax", "Sabar", "Griot Dance", "All three"), "Culture", "Sabar, mbalax, and ndawrabine are all traditional Senegalese dances, each originating from different ethnic groups and rituals in the country."),
            zh = LocalizedContent("哪种舞蹈风格源自塞内加尔？", listOf("姆巴拉克斯", "萨巴尔", "格里奥舞", "以上都是"), "文化", "萨巴尔、姆巴拉克斯和恩达瓦拉宾都是塞内加尔传统舞蹈，每种舞蹈源自该国不同的民族和仪式。"),
            es = LocalizedContent("¿Qué estilo de baile proviene de Senegal?", listOf("Mbalax", "Sabar", "Danza Griot", "Los tres"), "Cultura", "El sabar, el mbalax y el ndawrabine son danzas tradicionales senegalesas, cada una originada en diferentes grupos étnicos y rituales del país.")
        ),
        BilingualQuestion(
            id = 10443, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Crown' s'est-il terminé?", listOf("2022", "2023", "2024", "2025"), "Culture", "La sixième et dernière saison de la série The Crown, diffusée en deux parties, s'est achevée en décembre 2024 sur Netflix."),
            en = LocalizedContent("In which year did 'The Crown' end?", listOf("2022", "2023", "2024", "2025"), "Culture", "The sixth and final season of the series The Crown, released in two parts, concluded in December 2024 on Netflix."),
            zh = LocalizedContent("《王冠》在哪一年完结？", listOf("2022", "2023", "2024", "2025"), "文化", "《王冠》第六季即最终季分两部分播出，于2024年12月在Netflix完结。"),
            es = LocalizedContent("¿En qué año terminó 'The Crown'?", listOf("2022", "2023", "2024", "2025"), "Cultura", "La sexta y última temporada de la serie The Crown, estrenada en dos partes, concluyó en diciembre de 2024 en Netflix.")
        ),
        BilingualQuestion(
            id = 10444, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Carré Rouge'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevitch a peint 'Carré Rouge' en 1915, une œuvre emblématique du suprématisme, mouvement artistique qu'il a fondé."),
            en = LocalizedContent("Which painter created 'Red Square'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevich painted 'Red Square' in 1915, an iconic work of Suprematism, the artistic movement he founded."),
            zh = LocalizedContent("哪位画家创作了《红方块》？", listOf("卡济米尔·马列维奇", "皮特·蒙德里安", "瓦西里·康定斯基", "保罗·克利"), "文化", "卡济米尔·马列维奇于1915年创作了《红方块》，这是至上主义的标志性作品，他创立了这一艺术运动。"),
            es = LocalizedContent("¿Qué pintor creó 'Cuadrado rojo'?", listOf("Kazimir Malévich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Cultura", "Kazimir Malévich pintó 'Cuadrado rojo' en 1915, una obra emblemática del suprematismo, el movimiento artístico que fundó.")
        ),
        BilingualQuestion(
            id = 10445, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel est le nom du dieu des plantes?", listOf("Geb", "Osiris", "Bes", "Khépri"), "Culture", "Osiris est associé à la renaissance et à la végétation, notamment après avoir été ressuscité par Isis, symbolisant le cycle des cultures."),
            en = LocalizedContent("In Egyptian mythology, what is the name of the god of plants?", listOf("Geb", "Osiris", "Bes", "Khepri"), "Culture", "Osiris is associated with rebirth and vegetation, especially after being resurrected by Isis, symbolizing the cycle of crops."),
            zh = LocalizedContent("在埃及神话中，植物之神的名字是什么？", listOf("盖布", "奥西里斯", "贝斯", "凯布利"), "文化", "奥西里斯与重生和植被相关，特别是在被伊西斯复活后，象征着农作物的循环。"),
            es = LocalizedContent("En la mitología egipcia, ¿cuál es el nombre del dios de las plantas?", listOf("Geb", "Osiris", "Bes", "Jepri"), "Cultura", "Osiris está asociado con el renacimiento y la vegetación, especialmente después de ser resucitado por Isis, simbolizando el ciclo de los cultivos.")
        ),
        BilingualQuestion(
            id = 10446, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par l'achiote?", listOf("Cuisine mexicaine", "Cuisine des Caraïbes", "Cuisine d'Amérique centrale", "Tous les trois"), "Culture", "L'achiote, une épice rouge issue du roucou, est utilisée dans les cuisines mexicaine, péruvienne et caribéenne pour colorer et parfumer les plats."),
            en = LocalizedContent("Which style of cuisine is characterized by achiote?", listOf("Mexican cuisine", "Caribbean cuisine", "Central American cuisine", "All three"), "Culture", "Achiote, a red spice from the annatto seed, is used in Mexican, Peruvian, and Caribbean cuisines to color and flavor dishes."),
            zh = LocalizedContent("哪种菜系以胭脂树红为特色？", listOf("墨西哥菜", "加勒比菜", "中美洲菜", "以上都是"), "文化", "胭脂树红是一种来自胭脂树种的红色香料，用于墨西哥、秘鲁和加勒比菜系中，为菜肴增色添味。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el achiote?", listOf("Cocina mexicana", "Cocina caribeña", "Cocina centroamericana", "Los tres"), "Cultura", "El achiote, una especia roja de la semilla de annatto, se utiliza en las cocinas mexicana, peruana y caribeña para colorear y sazonar los platos.")
        ),
        BilingualQuestion(
            id = 10447, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Mad Men' a-t-il commencé?", listOf("2006", "2007", "2008", "2009"), "Culture", "La série dramatique Mad Men, créée par Matthew Weiner, a été diffusée pour la première fois le 19 juillet 2007 sur AMC, mais sa première saison complète a débuté en 2008."),
            en = LocalizedContent("In which year did 'Mad Men' begin?", listOf("2006", "2007", "2008", "2009"), "Culture", "The drama series Mad Men, created by Matthew Weiner, first aired on July 19, 2007 on AMC, but its first full season began in 2008."),
            zh = LocalizedContent("《广告狂人》在哪一年开播？", listOf("2006", "2007", "2008", "2009"), "文化", "由马修·韦纳创作的剧情剧《广告狂人》于2007年7月19日在AMC首播，但其第一完整季于2008年开始。"),
            es = LocalizedContent("¿En qué año comenzó 'Mad Men'?", listOf("2006", "2007", "2008", "2009"), "Cultura", "La serie dramática Mad Men, creada por Matthew Weiner, se emitió por primera vez el 19 de julio de 2007 en AMC, pero su primera temporada completa comenzó en 2008.")
        ),
        BilingualQuestion(
            id = 10448, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Composition avec Lignes'?", listOf("Piet Mondrian", "Kazimir Malevich", "Wassily Kandinsky", "Paul Klee"), "Culture", "Piet Mondrian, figure majeure du mouvement De Stijl, a créé 'Composition avec Lignes' en 1917, une œuvre emblématique de son abstraction géométrique utilisant lignes noires et couleurs primaires."),
            en = LocalizedContent("Which painter painted 'Composition with Lines'?", listOf("Piet Mondrian", "Kazimir Malevich", "Wassily Kandinsky", "Paul Klee"), "Culture", "Piet Mondrian, a key figure of the De Stijl movement, created 'Composition with Lines' in 1917, an iconic work of his geometric abstraction using black lines and primary colors."),
            zh = LocalizedContent("哪位画家创作了《线条构图》？", listOf("皮特·蒙德里安", "卡济米尔·马列维奇", "瓦西里·康定斯基", "保罗·克利"), "文化", "皮特·蒙德里安是风格派运动的关键人物，于1917年创作了《线条构图》，这是他几何抽象的标志性作品，使用黑线和原色。"),
            es = LocalizedContent("¿Qué pintor pintó 'Composición con líneas'?", listOf("Piet Mondrian", "Kazimir Malévich", "Wassily Kandinsky", "Paul Klee"), "Cultura", "Piet Mondrian, figura clave del movimiento De Stijl, creó 'Composición con líneas' en 1917, una obra emblemática de su abstracción geométrica que utiliza líneas negras y colores primarios.")
        ),
        BilingualQuestion(
            id = 10449, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu du sommeil?", listOf("Morphée", "Hypnos", "Phantasos", "Oniros"), "Culture", "Hypnos est le dieu personnifiant le sommeil dans la mythologie grecque, fils de Nyx (la Nuit) et frère jumeau de Thanatos (la Mort)."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of sleep?", listOf("Morpheus", "Hypnos", "Phantasos", "Oneiros"), "Culture", "Hypnos is the god personifying sleep in Greek mythology, son of Nyx (Night) and twin brother of Thanatos (Death)."),
            zh = LocalizedContent("在希腊神话中，睡眠之神的名字是什么？", listOf("摩耳甫斯", "许普诺斯", "凡塔索斯", "奥涅伊洛斯"), "文化", "许普诺斯是希腊神话中人格化睡眠的神，是倪克斯（夜神）之子，塔纳托斯（死神）的孪生兄弟。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios del sueño?", listOf("Morféo", "Hipnos", "Fantaso", "Oniros"), "Cultura", "Hipnos es el dios que personifica el sueño en la mitología griega, hijo de Nix (la Noche) y hermano gemelo de Tánatos (la Muerte).")
        ),
        BilingualQuestion(
            id = 10450, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'Für Elise'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Johannes Brahms"), "Culture", "Beethoven a composé 'Für Elise' en 1810, mais la partition ne fut découverte et publiée qu'en 1867, bien après sa mort. Le titre fait référence à une femme mystérieuse, peut-être Therese Malfatti."),
            en = LocalizedContent("Which composer wrote 'Für Elise'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Johannes Brahms"), "Culture", "Beethoven composed 'Für Elise' in 1810, but the score was not discovered and published until 1867, long after his death. The title refers to a mysterious woman, possibly Therese Malfatti."),
            zh = LocalizedContent("哪位作曲家创作了《致爱丽丝》？", listOf("沃尔夫冈·阿马德乌斯·莫扎特", "路德维希·范·贝多芬", "弗朗茨·舒伯特", "约翰内斯·勃拉姆斯"), "文化", "贝多芬于1810年创作了《致爱丽丝》，但乐谱直到1867年才被发现并出版，远在他去世之后。标题指的是一位神秘女性，可能是特蕾莎·马尔法蒂。"),
            es = LocalizedContent("¿Qué compositor escribió 'Para Elisa'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Johannes Brahms"), "Cultura", "Beethoven compuso 'Para Elisa' en 1810, pero la partitura no se descubrió y publicó hasta 1867, mucho después de su muerte. El título se refiere a una mujer misteriosa, posiblemente Therese Malfatti.")
        ),
        BilingualQuestion(
            id = 10451, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Office' a-t-il terminé?", listOf("2011", "2012", "2013", "2014"), "Culture", "La version américaine de The Office, avec Steve Carell, s'est achevée en 2013 après neuf saisons sur NBC."),
            en = LocalizedContent("In what year did 'The Office' end?", listOf("2011", "2012", "2013", "2014"), "Culture", "The American version of The Office, starring Steve Carell, ended in 2013 after nine seasons on NBC."),
            zh = LocalizedContent("《办公室》在哪一年完结？", listOf("2011", "2012", "2013", "2014"), "文化", "美国版《办公室》由史蒂夫·卡瑞尔主演，在NBC播出九季后于2013年完结。"),
            es = LocalizedContent("¿En qué año terminó 'The Office'?", listOf("2011", "2012", "2013", "2014"), "Cultura", "La versión estadounidense de The Office, protagonizada por Steve Carell, terminó en 2013 después de nueve temporadas en NBC.")
        ),
        BilingualQuestion(
            id = 10452, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Composition Géométrique'?", listOf("Juan Gris", "Pablo Picasso", "Georges Braque", "Fernand Léger"), "Culture", "Juan Gris, peintre espagnol majeur du cubisme, a réalisé 'Composition Géométrique' en 1915, une œuvre typique de sa période de maturité où il explore les formes géométriques et la déconstruction des objets."),
            en = LocalizedContent("Which painter created 'Geometric Composition'?", listOf("Juan Gris", "Pablo Picasso", "Georges Braque", "Fernand Léger"), "Culture", "Juan Gris, a major Spanish cubist painter, created 'Geometric Composition' in 1915, a typical work from his mature period where he explores geometric forms and the deconstruction of objects."),
            zh = LocalizedContent("哪位画家创作了《几何构图》？", listOf("胡安·格里斯", "巴勃罗·毕加索", "乔治·布拉克", "费尔南·莱热"), "文化", "胡安·格里斯是西班牙重要的立体派画家，于1915年创作了《几何构图》，这是他成熟时期的典型作品，探索几何形式和物体的解构。"),
            es = LocalizedContent("¿Qué pintor creó 'Composición Geométrica'?", listOf("Juan Gris", "Pablo Picasso", "Georges Braque", "Fernand Léger"), "Cultura", "Juan Gris, un importante pintor cubista español, creó 'Composición Geométrica' en 1915, una obra típica de su período de madurez donde explora formas geométricas y la deconstrucción de objetos.")
        ),
        BilingualQuestion(
            id = 10453, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie romaine, quel dieu est associé au commerce?", listOf("Jupiter", "Mars", "Mercure", "Vulcain"), "Culture", "Mercure est le dieu romain du commerce, des voyageurs et des voleurs, équivalent du grec Hermès. Il était souvent représenté avec un caducée et des sandales ailées."),
            en = LocalizedContent("In Roman mythology, which god is associated with commerce?", listOf("Jupiter", "Mars", "Mercury", "Vulcan"), "Culture", "Mercury is the Roman god of commerce, travelers, and thieves, equivalent to the Greek Hermes. He was often depicted with a caduceus and winged sandals."),
            zh = LocalizedContent("在罗马神话中，哪位神祇与商业相关？", listOf("朱庇特", "马尔斯", "墨丘利", "伏尔甘"), "文化", "墨丘利是罗马的商业、旅行者和盗贼之神，相当于希腊的赫尔墨斯。他常被描绘为手持双蛇杖、脚穿带翼凉鞋。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios está asociado con el comercio?", listOf("Júpiter", "Marte", "Mercurio", "Vulcano"), "Cultura", "Mercurio es el dios romano del comercio, los viajeros y los ladrones, equivalente al griego Hermes. A menudo se le representaba con un caduceo y sandalias aladas.")
        ),
        BilingualQuestion(
            id = 10454, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel style de danse vient de la Suède?", listOf("Halling", "Swedish Folk Dance", "Springar", "Tous les trois"), "Culture", "Le bugg, le hambo et la polska sont trois danses folkloriques originaires de Suède, ce qui explique que la bonne réponse soit \"Tous les trois\"."),
            en = LocalizedContent("Which dance style comes from Sweden?", listOf("Halling", "Swedish Folk Dance", "Springar", "All three"), "Culture", "The bugg, hambo, and polska are three folk dances originating from Sweden, which is why the correct answer is 'All three'."),
            zh = LocalizedContent("哪种舞蹈风格源自瑞典？", listOf("哈林舞", "瑞典民间舞", "斯普林加舞", "以上都是"), "文化", "布格舞、汉博舞和波尔斯卡舞是三种源自瑞典的民间舞蹈，因此正确答案是“以上都是”。"),
            es = LocalizedContent("¿Qué estilo de baile proviene de Suecia?", listOf("Halling", "Danza folclórica sueca", "Springar", "Los tres"), "Cultura", "El bugg, el hambo y la polska son tres danzas folclóricas originarias de Suecia, por lo que la respuesta correcta es 'Los tres'.")
        ),
        BilingualQuestion(
            id = 10455, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Nurse Jackie' a-t-il commencé?", listOf("2008", "2009", "2010", "2011"), "Culture", "La série télévisée américaine 'Nurse Jackie', avec Edie Falco, a été diffusée pour la première fois en 2009 sur la chaîne Showtime."),
            en = LocalizedContent("In what year did 'Nurse Jackie' start?", listOf("2008", "2009", "2010", "2011"), "Culture", "The American television series 'Nurse Jackie', starring Edie Falco, first aired in 2009 on the Showtime channel."),
            zh = LocalizedContent("《护士当家》在哪一年开播？", listOf("2008", "2009", "2010", "2011"), "文化", "美国电视剧《护士当家》由伊迪·法科主演，于2009年在Showtime频道首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Nurse Jackie'?", listOf("2008", "2009", "2010", "2011"), "Cultura", "La serie de televisión estadounidense 'Nurse Jackie', protagonizada por Edie Falco, se emitió por primera vez en 2009 en el canal Showtime.")
        ),
        BilingualQuestion(
            id = 10456, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Composition Abstraite'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Culture", "Kandinsky est considéré comme un pionnier de l'art abstrait. Ses œuvres comme 'Composition Abstraite' explorent la couleur et la forme sans représenter le monde réel."),
            en = LocalizedContent("Which painter painted 'Abstract Composition'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Culture", "Kandinsky is considered a pioneer of abstract art. His works like 'Abstract Composition' explore color and form without representing the real world."),
            zh = LocalizedContent("哪位画家创作了《抽象构图》？", listOf("瓦西里·康定斯基", "皮特·蒙德里安", "卡济米尔·马列维奇", "保罗·克利"), "文化", "康定斯基被认为是抽象艺术的先驱。他的作品如《抽象构图》探索了色彩和形式，而不表现现实世界。"),
            es = LocalizedContent("¿Qué pintor pintó 'Composición Abstracta'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Cultura", "Kandinsky es considerado un pionero del arte abstracto. Sus obras como 'Composición Abstracta' exploran el color y la forma sin representar el mundo real.")
        ),
        BilingualQuestion(
            id = 10457, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie grecque, qui est le messager des dieux?", listOf("Athéna", "Apollon", "Hermès", "Zeus"), "Culture", "Hermès est le dieu grec des voyageurs, des commerçants et des voleurs, reconnu pour sa rapidité et son rôle de messager des dieux de l'Olympe."),
            en = LocalizedContent("In Greek mythology, who is the messenger of the gods?", listOf("Athena", "Apollo", "Hermes", "Zeus"), "Culture", "Hermes is the Greek god of travelers, merchants, and thieves, known for his speed and role as the messenger of the Olympian gods."),
            zh = LocalizedContent("在希腊神话中，谁是众神的信使？", listOf("雅典娜", "阿波罗", "赫尔墨斯", "宙斯"), "文化", "赫尔墨斯是希腊的旅行者、商人和盗贼之神，以速度著称，并担任奥林匹斯众神的信使。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el mensajero de los dioses?", listOf("Atenea", "Apolo", "Hermes", "Zeus"), "Cultura", "Hermes es el dios griego de los viajeros, comerciantes y ladrones, conocido por su velocidad y su papel como mensajero de los dioses del Olimpo.")
        ),
        BilingualQuestion(
            id = 10458, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Pologne?", listOf("Bigos", "Pierogi", "Barszcz", "Tous les trois"), "Culture", "La cuisine polonaise intègre des influences slaves, germaniques et juives, ce qui rend les trois styles proposés pertinents."),
            en = LocalizedContent("Which cuisine style originates from Poland?", listOf("Bigos", "Pierogi", "Barszcz", "All three"), "Culture", "Polish cuisine incorporates Slavic, Germanic, and Jewish influences, making all three proposed styles relevant."),
            zh = LocalizedContent("哪种烹饪风格源自波兰？", listOf("比戈斯", "波兰饺子", "罗宋汤", "以上都是"), "文化", "波兰菜融合了斯拉夫、日耳曼和犹太的影响，因此提出的三种风格都相关。"),
            es = LocalizedContent("¿Qué estilo de cocina es originario de Polonia?", listOf("Bigos", "Pierogi", "Barszcz", "Los tres"), "Cultura", "La cocina polaca incorpora influencias eslavas, germánicas y judías, lo que hace que los tres estilos propuestos sean relevantes.")
        ),
        BilingualQuestion(
            id = 10459, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Rectify' a-t-il commencé?", listOf("2013", "2014", "2015", "2016"), "Culture", "Rectify, série dramatique américaine créée par Ray McKinnon, a débuté en 2014 sur la chaîne SundanceTV."),
            en = LocalizedContent("In what year did 'Rectify' start?", listOf("2013", "2014", "2015", "2016"), "Culture", "Rectify, an American drama series created by Ray McKinnon, began in 2014 on the SundanceTV channel."),
            zh = LocalizedContent("《昭雪》在哪一年开播？", listOf("2013", "2014", "2015", "2016"), "文化", "《昭雪》是由雷·麦金农创作的美国剧情系列，于2014年在SundanceTV频道开播。"),
            es = LocalizedContent("¿En qué año comenzó 'Rectify'?", listOf("2013", "2014", "2015", "2016"), "Cultura", "Rectify, una serie dramática estadounidense creada por Ray McKinnon, comenzó en 2014 en el canal SundanceTV.")
        ),
        BilingualQuestion(
            id = 10460, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Composition à Trois'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso a créé 'Composition à Trois' en 1912, une œuvre cubiste qui illustre sa recherche sur la déconstruction des formes et la représentation simultanée de plusieurs points de vue."),
            en = LocalizedContent("Which painter created 'Composition with Three'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso created 'Composition with Three' in 1912, a cubist work illustrating his research on the deconstruction of forms and the simultaneous representation of multiple viewpoints."),
            zh = LocalizedContent("哪位画家创作了《三人构图》？", listOf("巴勃罗·毕加索", "亨利·马蒂斯", "乔治·布拉克", "胡安·格里斯"), "文化", "巴勃罗·毕加索于1912年创作了《三人构图》，这是一幅立体主义作品，展示了他对形式解构和同时表现多个视角的研究。"),
            es = LocalizedContent("¿Qué pintor creó 'Composición con Tres'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Cultura", "Pablo Picasso creó 'Composición con Tres' en 1912, una obra cubista que ilustra su investigación sobre la deconstrucción de formas y la representación simultánea de múltiples puntos de vista.")
        ),
        BilingualQuestion(
            id = 10461, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu a une tête de lion?", listOf("Sekhmet", "Nut", "Tefnout", "Shu"), "Culture", "Sekhmet est la déesse guerrière égyptienne représentée avec une tête de lionne, symbole de la puissance destructrice du soleil."),
            en = LocalizedContent("In Egyptian mythology, which god has a lion's head?", listOf("Sekhmet", "Nut", "Tefnut", "Shu"), "Culture", "Sekhmet is the Egyptian warrior goddess depicted with a lioness head, symbolizing the destructive power of the sun."),
            zh = LocalizedContent("在埃及神话中，哪位神有狮子头？", listOf("塞赫麦特", "努特", "泰芙努特", "舒"), "文化", "塞赫麦特是埃及战争女神，被描绘为拥有母狮头，象征着太阳的破坏力。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios tiene cabeza de león?", listOf("Sekhmet", "Nut", "Tefnut", "Shu"), "Cultura", "Sekhmet es la diosa guerrera egipcia representada con cabeza de leona, símbolo del poder destructivo del sol.")
        ),
        BilingualQuestion(
            id = 10462, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'Imagine'?", listOf("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr"), "Culture", "John Lennon a écrit et interprété 'Imagine' en 1971, une chanson devenue un hymne pour la paix dans le monde."),
            en = LocalizedContent("Which composer wrote 'Imagine'?", listOf("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr"), "Culture", "John Lennon wrote and performed 'Imagine' in 1971, a song that became an anthem for world peace."),
            zh = LocalizedContent("哪位作曲家创作了《想象》？", listOf("约翰·列侬", "保罗·麦卡特尼", "乔治·哈里森", "林戈·斯塔尔"), "文化", "约翰·列侬于1971年创作并演唱了《想象》，这首歌成为世界和平的颂歌。"),
            es = LocalizedContent("¿Qué compositor escribió 'Imagine'?", listOf("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr"), "Cultura", "John Lennon escribió e interpretó 'Imagine' en 1971, una canción que se convirtió en un himno por la paz mundial.")
        ),
        BilingualQuestion(
            id = 10463, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The OA' a-t-il commencé?", listOf("2015", "2016", "2017", "2018"), "Culture", "La série The OA a été diffusée pour la première fois sur Netflix en 2016, mais sa production a débuté en 2017."),
            en = LocalizedContent("In which year did 'The OA' start?", listOf("2015", "2016", "2017", "2018"), "Culture", "The series The OA was first aired on Netflix in 2016, but its production began in 2017."),
            zh = LocalizedContent("《OA》在哪一年开播？", listOf("2015", "2016", "2017", "2018"), "文化", "剧集《OA》于2016年在Netflix首播，但其制作始于2017年。"),
            es = LocalizedContent("¿En qué año comenzó 'The OA'?", listOf("2015", "2016", "2017", "2018"), "Cultura", "La serie The OA se emitió por primera vez en Netflix en 2016, pero su producción comenzó en 2017.")
        ),
        BilingualQuestion(
            id = 10464, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Harmonie Abstraite'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Culture", "Wassily Kandinsky est considéré comme l'un des pionniers de l'art abstrait. Il a créé des œuvres comme 'Harmonie Abstraite' pour exprimer des émotions par la couleur et la forme, sans représenter le monde réel."),
            en = LocalizedContent("Which painter painted 'Abstract Harmony'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Culture", "Wassily Kandinsky is considered one of the pioneers of abstract art. He created works like 'Abstract Harmony' to express emotions through color and form, without representing the real world."),
            zh = LocalizedContent("哪位画家创作了《抽象和谐》？", listOf("瓦西里·康定斯基", "皮特·蒙德里安", "卡济米尔·马列维奇", "保罗·克利"), "文化", "瓦西里·康定斯基被认为是抽象艺术的先驱之一。他创作了《抽象和谐》等作品，通过色彩和形式表达情感，而不表现现实世界。"),
            es = LocalizedContent("¿Qué pintor pintó 'Armonía Abstracta'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Cultura", "Wassily Kandinsky es considerado uno de los pioneros del arte abstracto. Creó obras como 'Armonía Abstracta' para expresar emociones a través del color y la forma, sin representar el mundo real.")
        ),
        BilingualQuestion(
            id = 10465, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu de la guérison?", listOf("Asclepios", "Apollon", "Hermès", "Héphaïstos"), "Culture", "Asclepios, fils d'Apollon, était le dieu grec de la médecine et de la guérison, souvent représenté avec un bâton entouré d'un serpent."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of healing?", listOf("Asclepius", "Apollo", "Hermes", "Hephaestus"), "Culture", "Asclepius, son of Apollo, was the Greek god of medicine and healing, often depicted with a staff entwined by a serpent."),
            zh = LocalizedContent("在希腊神话中，治愈之神的名字是什么？", listOf("阿斯克勒庇俄斯", "阿波罗", "赫尔墨斯", "赫菲斯托斯"), "文化", "阿斯克勒庇俄斯是阿波罗之子，希腊的医药与治愈之神，常被描绘为手持一根缠绕着蛇的权杖。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios de la curación?", listOf("Asclepio", "Apolo", "Hermes", "Hefesto"), "Cultura", "Asclepio, hijo de Apolo, era el dios griego de la medicina y la curación, a menudo representado con un bastón rodeado por una serpiente.")
        ),
        BilingualQuestion(
            id = 10466, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse vient de la Grèce?", listOf("Zeïbekiko", "Sirtaki", "Kalamatianos", "Tous les trois"), "Culture", "Le sirtaki, le kalamatianos et le hasapiko sont trois danses traditionnelles grecques, chacune ayant des origines et des caractéristiques distinctes."),
            en = LocalizedContent("Which dance style comes from Greece?", listOf("Zeibekiko", "Sirtaki", "Kalamatianos", "All three"), "Culture", "Sirtaki, Kalamatianos, and Hasapiko are three traditional Greek dances, each with distinct origins and characteristics."),
            zh = LocalizedContent("哪种舞蹈风格来自希腊？", listOf("泽贝基科", "西尔塔基", "卡拉马蒂亚诺斯", "以上三种"), "文化", "西尔塔基、卡拉马蒂亚诺斯和哈萨皮科是三种希腊传统舞蹈，各有不同的起源和特点。"),
            es = LocalizedContent("¿Qué estilo de baile proviene de Grecia?", listOf("Zeibekiko", "Sirtaki", "Kalamatianos", "Los tres"), "Cultura", "El sirtaki, el kalamatianos y el hasapiko son tres danzas tradicionales griegas, cada una con orígenes y características distintas.")
        ),
        BilingualQuestion(
            id = 10467, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Midnight Club' a-t-il été lancé?", listOf("2021", "2022", "2023", "2024"), "Culture", "The Midnight Club, une série d'horreur de Mike Flanagan, a été diffusée sur Netflix à partir du 6 octobre 2023."),
            en = LocalizedContent("In which year was 'The Midnight Club' launched?", listOf("2021", "2022", "2023", "2024"), "Culture", "The Midnight Club, a horror series by Mike Flanagan, was released on Netflix starting October 6, 2023."),
            zh = LocalizedContent("《午夜俱乐部》在哪一年推出？", listOf("2021", "2022", "2023", "2024"), "文化", "《午夜俱乐部》是迈克·弗拉纳根创作的恐怖剧集，于2023年10月6日在Netflix上线。"),
            es = LocalizedContent("¿En qué año se lanzó 'The Midnight Club'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "The Midnight Club, una serie de terror de Mike Flanagan, se estrenó en Netflix a partir del 6 de octubre de 2023.")
        ),
        BilingualQuestion(
            id = 10468, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Formes Géométriques'?", listOf("Fernand Léger", "Pablo Picasso", "Henri Matisse", "Georges Braque"), "Culture", "Fernand Léger, peintre cubiste et moderniste, a intégré des formes géométriques et mécaniques dans ses œuvres, comme dans sa série \"Formes Géométriques\" des années 1910-1920."),
            en = LocalizedContent("Which painter created 'Geometric Forms'?", listOf("Fernand Léger", "Pablo Picasso", "Henri Matisse", "Georges Braque"), "Culture", "Fernand Léger, a cubist and modernist painter, incorporated geometric and mechanical forms into his works, such as in his 'Geometric Forms' series from the 1910s-1920s."),
            zh = LocalizedContent("哪位画家创作了《几何形式》？", listOf("费尔南·莱热", "巴勃罗·毕加索", "亨利·马蒂斯", "乔治·布拉克"), "文化", "费尔南·莱热是立体主义和现代主义画家，他在1910-1920年代的《几何形式》系列等作品中融入了几何和机械形式。"),
            es = LocalizedContent("¿Qué pintor creó 'Formas Geométricas'?", listOf("Fernand Léger", "Pablo Picasso", "Henri Matisse", "Georges Braque"), "Cultura", "Fernand Léger, pintor cubista y modernista, incorporó formas geométricas y mecánicas en sus obras, como en su serie 'Formas Geométricas' de las décadas de 1910-1920.")
        ),
        BilingualQuestion(
            id = 10469, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie romaine, quel est le nom de la déesse de l'agriculture?", listOf("Vesta", "Cérès", "Flora", "Juno"), "Culture", "Cérès est l'équivalent romain de la déesse grecque Déméter, protectrice des moissons et de la fertilité des sols. Son nom a donné le mot \"céréale\"."),
            en = LocalizedContent("In Roman mythology, what is the name of the goddess of agriculture?", listOf("Vesta", "Ceres", "Flora", "Juno"), "Culture", "Ceres is the Roman equivalent of the Greek goddess Demeter, protector of harvests and soil fertility. Her name gave rise to the word 'cereal'."),
            zh = LocalizedContent("在罗马神话中，农业女神的名字是什么？", listOf("维斯塔", "刻瑞斯", "福罗拉", "朱诺"), "文化", "刻瑞斯是希腊女神得墨忒耳的罗马对应神，保护丰收和土壤肥沃。她的名字衍生出“谷物”一词。"),
            es = LocalizedContent("En la mitología romana, ¿cuál es el nombre de la diosa de la agricultura?", listOf("Vesta", "Ceres", "Flora", "Juno"), "Cultura", "Ceres es el equivalente romano de la diosa griega Deméter, protectora de las cosechas y la fertilidad del suelo. Su nombre dio origen a la palabra 'cereal'.")
        ),
        BilingualQuestion(
            id = 10470, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par les nouilles ramen?", listOf("Cuisine japonaise", "Cuisine coréenne", "Cuisine chinoise", "Cuisine thaïlandaise"), "Culture", "Les ramen sont un plat de nouilles originaire de Chine mais popularisé et transformé au Japon, où ils sont devenus un élément emblématique de la cuisine japonaise."),
            en = LocalizedContent("Which style of cuisine is characterized by ramen noodles?", listOf("Japanese cuisine", "Korean cuisine", "Chinese cuisine", "Thai cuisine"), "Culture", "Ramen is a noodle dish originating from China but popularized and transformed in Japan, where it became an iconic element of Japanese cuisine."),
            zh = LocalizedContent("哪种菜系以拉面为特色？", listOf("日本菜", "韩国菜", "中国菜", "泰国菜"), "文化", "拉面是一种起源于中国但在日本流行并改良的面条菜肴，成为日本料理的标志性元素。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por los fideos ramen?", listOf("Cocina japonesa", "Cocina coreana", "Cocina china", "Cocina tailandesa"), "Cultura", "El ramen es un plato de fideos originario de China pero popularizado y transformado en Japón, donde se convirtió en un elemento icónico de la cocina japonesa.")
        ),
        BilingualQuestion(
            id = 10471, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Ozark' a-t-il commencé?", listOf("2016", "2017", "2018", "2019"), "Culture", "La série dramatique américaine 'Ozark', avec Jason Bateman et Laura Linney, a débuté sur Netflix en 2017."),
            en = LocalizedContent("In which year did 'Ozark' start?", listOf("2016", "2017", "2018", "2019"), "Culture", "The American drama series 'Ozark', starring Jason Bateman and Laura Linney, premiered on Netflix in 2017."),
            zh = LocalizedContent("《黑钱胜地》在哪一年开播？", listOf("2016", "2017", "2018", "2019"), "文化", "美国剧情片《黑钱胜地》，由杰森·贝特曼和劳拉·琳妮主演，于2017年在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Ozark'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "La serie dramática estadounidense 'Ozark', protagonizada por Jason Bateman y Laura Linney, se estrenó en Netflix en 2017.")
        ),
        BilingualQuestion(
            id = 10472, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Paysage Abstrait'?", listOf("Wassily Kandinsky", "Paul Klee", "Joan Miró", "Tous les trois"), "Culture", "Paysage Abstrait est une œuvre collective réalisée en 1915 par trois artistes russes : Vassily Kandinsky, Kasimir Malevitch et Nathalie Gontcharova, lors d'une exposition commune."),
            en = LocalizedContent("Which painter painted 'Abstract Landscape'?", listOf("Wassily Kandinsky", "Paul Klee", "Joan Miró", "All three"), "Culture", "'Abstract Landscape' is a collective work created in 1915 by three Russian artists: Wassily Kandinsky, Kasimir Malevich, and Natalia Goncharova, during a joint exhibition."),
            zh = LocalizedContent("哪位画家创作了《抽象风景》？", listOf("瓦西里·康定斯基", "保罗·克利", "胡安·米罗", "以上都是"), "文化", "《抽象风景》是1915年由三位俄罗斯艺术家——瓦西里·康定斯基、卡西米尔·马列维奇和娜塔莉亚·冈察洛娃——在一次联合展览中共同创作的作品。"),
            es = LocalizedContent("¿Qué pintor pintó 'Paisaje abstracto'?", listOf("Wassily Kandinsky", "Paul Klee", "Joan Miró", "Los tres"), "Cultura", "'Paisaje abstracto' es una obra colectiva creada en 1915 por tres artistas rusos: Wassily Kandinsky, Kasimir Malevich y Natalia Goncharova, durante una exposición conjunta.")
        ),
        BilingualQuestion(
            id = 10473, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est le dieu du vent?", listOf("Eole", "Aéolus", "Borée", "Zéphyr"), "Culture", "Dans la mythologie grecque, Éole est le maître des vents, souvent représenté comme le gardien des tempêtes et des brises, résidant sur l'île d'Éolie."),
            en = LocalizedContent("In Greek mythology, who is the god of wind?", listOf("Aeolus", "Aeolus", "Boreas", "Zephyrus"), "Culture", "In Greek mythology, Aeolus is the master of the winds, often depicted as the keeper of storms and breezes, residing on the island of Aeolia."),
            zh = LocalizedContent("在希腊神话中，谁是风神？", listOf("埃俄罗斯", "埃俄罗斯", "玻瑞阿斯", "仄费罗斯"), "文化", "在希腊神话中，埃俄罗斯是风的主宰，常被描绘为风暴和微风的守护者，居住在埃俄利亚岛上。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el dios del viento?", listOf("Eolo", "Eolo", "Bóreas", "Céfiro"), "Cultura", "En la mitología griega, Eolo es el señor de los vientos, a menudo representado como el guardián de tormentas y brisas, que reside en la isla de Eolia.")
        ),
        BilingualQuestion(
            id = 10474, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel style de musique a émergé de la Birmanie?", listOf("Hsaing Waing", "Burmese Pop", "Pyaing", "Tous les trois"), "Culture", "La Birmanie a vu émerger plusieurs styles musicaux distincts, dont le pop birman, le rock birman et le hip-hop birman, qui se sont développés parallèlement à partir des années 1960."),
            en = LocalizedContent("Which style of music emerged from Myanmar?", listOf("Hsaing Waing", "Burmese Pop", "Pyaing", "All three"), "Culture", "Myanmar has seen the emergence of several distinct musical styles, including Burmese pop, Burmese rock, and Burmese hip-hop, which developed in parallel from the 1960s."),
            zh = LocalizedContent("哪种音乐风格源自缅甸？", listOf("赛旺", "缅甸流行", "皮昂", "以上都是"), "文化", "缅甸出现了几种独特的音乐风格，包括缅甸流行、缅甸摇滚和缅甸嘻哈，它们从20世纪60年代起并行发展。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Birmania?", listOf("Hsaing Waing", "Pop birmano", "Pyaing", "Los tres"), "Cultura", "Birmania ha visto el surgimiento de varios estilos musicales distintos, incluyendo el pop birmano, el rock birmano y el hip-hop birmano, que se desarrollaron en paralelo a partir de la década de 1960.")
        ),
        BilingualQuestion(
            id = 10475, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Mindhunter' s'est-il terminé?", listOf("2019", "2020", "2021", "2022"), "Culture", "La série Mindhunter a été officiellement annulée par Netflix en 2021 après deux saisons, malgré des critiques positives et l'intérêt du public pour une suite."),
            en = LocalizedContent("In which year did 'Mindhunter' end?", listOf("2019", "2020", "2021", "2022"), "Culture", "The series 'Mindhunter' was officially canceled by Netflix in 2021 after two seasons, despite positive reviews and public interest in a continuation."),
            zh = LocalizedContent("《心灵猎人》在哪一年完结？", listOf("2019", "2020", "2021", "2022"), "文化", "《心灵猎人》在播出两季后，于2021年被Netflix正式取消，尽管该剧获得好评且公众对续集有兴趣。"),
            es = LocalizedContent("¿En qué año terminó 'Mindhunter'?", listOf("2019", "2020", "2021", "2022"), "Cultura", "La serie 'Mindhunter' fue cancelada oficialmente por Netflix en 2021 después de dos temporadas, a pesar de las críticas positivas y el interés del público por una continuación.")
        ),
        BilingualQuestion(
            id = 10476, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Éléments de Couleur'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Kasimir Malevich"), "Culture", "Paul Klee a théorisé la couleur dans son enseignement au Bauhaus, publié plus tard dans son ouvrage \"Théorie de la forme et de la figure\" où il développe ses \"Éléments de Couleur\"."),
            en = LocalizedContent("Which painter created 'Elements of Color'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Kasimir Malevich"), "Culture", "Paul Klee theorized color in his teaching at the Bauhaus, later published in his work 'Theory of Form and Figure' where he develops his 'Elements of Color'."),
            zh = LocalizedContent("哪位画家创作了《色彩元素》？", listOf("保罗·克利", "瓦西里·康定斯基", "胡安·米罗", "卡西米尔·马列维奇"), "文化", "保罗·克利在包豪斯教学中对色彩进行了理论化，后来在其著作《形式与形象理论》中发表，其中阐述了他的“色彩元素”。"),
            es = LocalizedContent("¿Qué pintor creó 'Elementos de color'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Kasimir Malevich"), "Cultura", "Paul Klee teorizó el color en su enseñanza en la Bauhaus, publicado más tarde en su obra 'Teoría de la forma y la figura' donde desarrolla sus 'Elementos de color'.")
        ),
        BilingualQuestion(
            id = 10477, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu est le dieu de la musique?", listOf("Bes", "Toutou", "Khépri", "Thot"), "Culture", "Bes est une divinité protectrice du foyer, de la maternité et de la musique, souvent représenté jouant du tambourin ou de la harpe."),
            en = LocalizedContent("In Egyptian mythology, which god is the god of music?", listOf("Bes", "Tutu", "Khepri", "Thoth"), "Culture", "Bes is a protective deity of the home, motherhood, and music, often depicted playing a tambourine or harp."),
            zh = LocalizedContent("在埃及神话中，哪位神是音乐之神？", listOf("贝斯", "图图", "凯布利", "托特"), "文化", "贝斯是家庭、母性和音乐的保护神，常被描绘成演奏手鼓或竖琴的形象。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios es el dios de la música?", listOf("Bes", "Tutu", "Jepri", "Thot"), "Cultura", "Bes es una deidad protectora del hogar, la maternidad y la música, a menudo representado tocando una pandereta o un arpa.")
        ),
        BilingualQuestion(
            id = 10478, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine française utilise les truffes?", listOf("Cuisine périgourdine", "Cuisine provençale", "Cuisine normande", "Cuisine alsacienne"), "Culture", "La cuisine périgourdine, originaire du Périgord (Dordogne), est réputée pour l'utilisation de la truffe noire, un champignon emblématique de cette région."),
            en = LocalizedContent("Which style of French cuisine uses truffles?", listOf("Périgord cuisine", "Provencal cuisine", "Norman cuisine", "Alsatian cuisine"), "Culture", "Périgord cuisine, originating from the Périgord region (Dordogne), is renowned for its use of black truffle, an emblematic mushroom of this area."),
            zh = LocalizedContent("哪种法国菜系使用松露？", listOf("佩里戈尔菜", "普罗旺斯菜", "诺曼底菜", "阿尔萨斯菜"), "文化", "佩里戈尔菜源自佩里戈尔地区（多尔多涅省），以使用黑松露而闻名，黑松露是该地区的标志性菌类。"),
            es = LocalizedContent("¿Qué estilo de cocina francesa utiliza trufas?", listOf("Cocina del Périgord", "Cocina provenzal", "Cocina normanda", "Cocina alsaciana"), "Cultura", "La cocina del Périgord, originaria de la región de Périgord (Dordoña), es famosa por el uso de la trufa negra, un hongo emblemático de esta zona.")
        ),
        BilingualQuestion(
            id = 10479, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Politician' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "The Politician, une série comique dramatique américaine créée par Ryan Murphy, Brad Falchuk et Ian Brennan, a été diffusée pour la première fois sur Netflix en 2020."),
            en = LocalizedContent("In which year did 'The Politician' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "'The Politician', an American comedy-drama series created by Ryan Murphy, Brad Falchuk, and Ian Brennan, first aired on Netflix in 2020."),
            zh = LocalizedContent("《政客》在哪一年开播？", listOf("2018", "2019", "2020", "2021"), "文化", "《政客》是一部由瑞恩·墨菲、布拉德·法尔查克和伊恩·布伦南创作的美国喜剧剧情片，于2020年在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'The Politician'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "'The Politician', una serie de comedia dramática estadounidense creada por Ryan Murphy, Brad Falchuk e Ian Brennan, se emitió por primera vez en Netflix en 2020.")
        ),
        BilingualQuestion(
            id = 10480, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Composition Noir'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevitch a peint 'Composition Noir' en 1915, une œuvre clé du suprématisme, mouvement qu'il a fondé pour réduire l'art à des formes géométriques pures."),
            en = LocalizedContent("Which painter painted 'Composition Noir'?", listOf("Kazimir Malevich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Culture", "Kazimir Malevich painted 'Composition Noir' in 1915, a key work of Suprematism, a movement he founded to reduce art to pure geometric forms."),
            zh = LocalizedContent("哪位画家创作了《黑色构图》？", listOf("卡济米尔·马列维奇", "皮特·蒙德里安", "瓦西里·康定斯基", "保罗·克利"), "文化", "卡济米尔·马列维奇于1915年创作了《黑色构图》，这是至上主义的关键作品，他创立该运动旨在将艺术简化为纯粹的几何形式。"),
            es = LocalizedContent("¿Qué pintor pintó 'Composición Negra'?", listOf("Kazimir Malévich", "Piet Mondrian", "Wassily Kandinsky", "Paul Klee"), "Cultura", "Kazimir Malévich pintó 'Composición Negra' en 1915, una obra clave del suprematismo, movimiento que fundó para reducir el arte a formas geométricas puras.")
        ),
        BilingualQuestion(
            id = 10481, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu de la chasse?", listOf("Apollon", "Artémis", "Héraclès", "Orion"), "Culture", "Apollon, dieu de la lumière et des arts, était aussi associé à la chasse, tandis qu'Artémis, sa sœur jumelle, en était la déesse principale."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of hunting?", listOf("Apollo", "Artemis", "Heracles", "Orion"), "Culture", "Apollo, god of light and the arts, was also associated with hunting, while Artemis, his twin sister, was the main goddess of hunting."),
            zh = LocalizedContent("在希腊神话中，狩猎之神的名字是什么？", listOf("阿波罗", "阿尔忒弥斯", "赫拉克勒斯", "俄里翁"), "文化", "阿波罗是光明与艺术之神，也与狩猎有关，而他的孪生姐妹阿尔忒弥斯则是主要的狩猎女神。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios de la caza?", listOf("Apolo", "Artemisa", "Heracles", "Orión"), "Cultura", "Apolo, dios de la luz y las artes, también estaba asociado con la caza, mientras que Artemisa, su hermana gemela, era la diosa principal de la caza.")
        ),
        BilingualQuestion(
            id = 10482, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse vient de la Hongrie?", listOf("Csárdás", "Polka", "Mazurka", "Tous les trois"), "Culture", "La csárdás, la polka et la mazurka sont des danses originaires de Hongrie, bien que souvent associées à d'autres pays d'Europe centrale."),
            en = LocalizedContent("Which style of dance comes from Hungary?", listOf("Csárdás", "Polka", "Mazurka", "All three"), "Culture", "Csárdás, polka, and mazurka are dances originating from Hungary, although often associated with other Central European countries."),
            zh = LocalizedContent("哪种舞蹈风格源自匈牙利？", listOf("恰尔达什舞", "波尔卡", "玛祖卡", "以上都是"), "文化", "恰尔达什舞、波尔卡和玛祖卡都是源自匈牙利的舞蹈，尽管常与其他中欧国家相关联。"),
            es = LocalizedContent("¿Qué estilo de baile proviene de Hungría?", listOf("Csárdás", "Polca", "Mazurca", "Los tres"), "Cultura", "El csárdás, la polca y la mazurca son bailes originarios de Hungría, aunque a menudo asociados con otros países de Europa Central.")
        ),
        BilingualQuestion(
            id = 10483, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Love on the Spectrum' a-t-il commencé?", listOf("2019", "2020", "2021", "2022"), "Culture", "Love on the Spectrum, un documentaire sur les rencontres amoureuses de personnes autistes, a été diffusé pour la première fois en Australie en 2020."),
            en = LocalizedContent("In which year did 'Love on the Spectrum' start?", listOf("2019", "2020", "2021", "2022"), "Culture", "Love on the Spectrum, a documentary about dating for autistic people, first aired in Australia in 2020."),
            zh = LocalizedContent("《爱情在光谱中》是哪一年开播的？", listOf("2019", "2020", "2021", "2022"), "文化", "《爱情在光谱中》是一部关于自闭症患者约会的纪录片，于2020年在澳大利亚首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Love on the Spectrum'?", listOf("2019", "2020", "2021", "2022"), "Cultura", "Love on the Spectrum, un documental sobre citas de personas autistas, se emitió por primera vez en Australia en 2020.")
        ),
        BilingualQuestion(
            id = 10484, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Formes et Vides'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Piet Mondrian"), "Culture", "Paul Klee, artiste suisse-allemand, a créé 'Formes et Vides' en 1930, une œuvre qui explore l'équilibre entre abstraction et géométrie, typique de son style."),
            en = LocalizedContent("Which painter created 'Forms and Voids'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Piet Mondrian"), "Culture", "Paul Klee, a Swiss-German artist, created 'Forms and Voids' in 1930, a work exploring the balance between abstraction and geometry, typical of his style."),
            zh = LocalizedContent("哪位画家创作了《形式与虚空》？", listOf("保罗·克利", "瓦西里·康定斯基", "胡安·米罗", "皮特·蒙德里安"), "文化", "瑞士-德国艺术家保罗·克利于1930年创作了《形式与虚空》，这件作品探索了抽象与几何之间的平衡，体现了他典型的风格。"),
            es = LocalizedContent("¿Qué pintor creó 'Formas y Vacíos'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Piet Mondrian"), "Cultura", "Paul Klee, artista suizo-alemán, creó 'Formas y Vacíos' en 1930, una obra que explora el equilibrio entre abstracción y geometría, típica de su estilo.")
        ),
        BilingualQuestion(
            id = 10485, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie romaine, quel est le nombre des Muses?", listOf("6", "8", "9", "12"), "Culture", "Les Romains ont repris aux Grecs le mythe des neuf Muses, filles de Zeus et de Mnémosyne, chacune présidant à un art ou une science."),
            en = LocalizedContent("In Roman mythology, what is the number of the Muses?", listOf("6", "8", "9", "12"), "Culture", "The Romans adopted from the Greeks the myth of the nine Muses, daughters of Zeus and Mnemosyne, each presiding over an art or science."),
            zh = LocalizedContent("在罗马神话中，缪斯女神的数量是多少？", listOf("6", "8", "9", "12"), "文化", "罗马人从希腊人那里继承了九位缪斯女神的神话，她们是宙斯和谟涅摩绪涅的女儿，各自掌管一门艺术或科学。"),
            es = LocalizedContent("En la mitología romana, ¿cuál es el número de las Musas?", listOf("6", "8", "9", "12"), "Cultura", "Los romanos adoptaron de los griegos el mito de las nueve Musas, hijas de Zeus y Mnemósine, cada una presidiendo un arte o ciencia.")
        ),
        BilingualQuestion(
            id = 10486, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Tristan und Isolde'?", listOf("Richard Wagner", "Giuseppe Verdi", "Gioachino Rossini", "Hector Berlioz"), "Culture", "Richard Wagner a composé 'Tristan und Isolde', un opéra romantique allemand créé en 1865, inspiré de la légende médiévale du même nom."),
            en = LocalizedContent("Which composer wrote 'Tristan und Isolde'?", listOf("Richard Wagner", "Giuseppe Verdi", "Gioachino Rossini", "Hector Berlioz"), "Culture", "Richard Wagner composed 'Tristan und Isolde', a German romantic opera premiered in 1865, inspired by the medieval legend of the same name."),
            zh = LocalizedContent("哪位作曲家创作了《特里斯坦与伊索尔德》？", listOf("理查德·瓦格纳", "朱塞佩·威尔第", "焦阿基诺·罗西尼", "埃克托·柏辽兹"), "文化", "理查德·瓦格纳创作了《特里斯坦与伊索尔德》，这是一部德国浪漫主义歌剧，于1865年首演，灵感来源于同名的中世纪传说。"),
            es = LocalizedContent("¿Qué compositor escribió 'Tristan und Isolde'?", listOf("Richard Wagner", "Giuseppe Verdi", "Gioachino Rossini", "Hector Berlioz"), "Cultura", "Richard Wagner compuso 'Tristan und Isolde', una ópera romántica alemana estrenada en 1865, inspirada en la leyenda medieval del mismo nombre.")
        ),
        BilingualQuestion(
            id = 10487, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Unbreakable Kimmy Schmidt' a-t-il commencé?", listOf("2014", "2015", "2016", "2017"), "Culture", "La série comique 'Unbreakable Kimmy Schmidt', créée par Tina Fey et Robert Carlock, a été diffusée pour la première fois sur Netflix en 2015."),
            en = LocalizedContent("In which year did 'Unbreakable Kimmy Schmidt' start?", listOf("2014", "2015", "2016", "2017"), "Culture", "The comedy series 'Unbreakable Kimmy Schmidt', created by Tina Fey and Robert Carlock, first aired on Netflix in 2015."),
            zh = LocalizedContent("《坚不可摧的吉米·施密特》是哪一年开播的？", listOf("2014", "2015", "2016", "2017"), "文化", "喜剧系列《坚不可摧的吉米·施密特》由蒂娜·菲和罗伯特·卡洛克创作，于2015年在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Unbreakable Kimmy Schmidt'?", listOf("2014", "2015", "2016", "2017"), "Cultura", "La serie de comedia 'Unbreakable Kimmy Schmidt', creada por Tina Fey y Robert Carlock, se emitió por primera vez en Netflix en 2015.")
        ),
        BilingualQuestion(
            id = 10488, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Chromatic Abstraction'?", listOf("Rothko", "Kandinsky", "Mondrian", "Malevitch"), "Culture", "Mark Rothko est un peintre américain majeur de l'expressionnisme abstrait, connu pour ses toiles aux larges champs de couleur flottante."),
            en = LocalizedContent("Which painter painted 'Chromatic Abstraction'?", listOf("Rothko", "Kandinsky", "Mondrian", "Malevich"), "Culture", "Mark Rothko is a major American painter of Abstract Expressionism, known for his canvases with large floating color fields."),
            zh = LocalizedContent("哪位画家创作了《色彩抽象》？", listOf("罗斯科", "康定斯基", "蒙德里安", "马列维奇"), "文化", "马克·罗斯科是美国抽象表现主义的重要画家，以其大幅浮动色域的画作而闻名。"),
            es = LocalizedContent("¿Qué pintor pintó 'Abstracción Cromática'?", listOf("Rothko", "Kandinsky", "Mondrian", "Malévich"), "Cultura", "Mark Rothko es un importante pintor estadounidense del expresionismo abstracto, conocido por sus lienzos con grandes campos de color flotante.")
        ),
        BilingualQuestion(
            id = 10489, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est le chef des Titans?", listOf("Kronos", "Hypérion", "Océan", "Coeus"), "Culture", "Kronos est le plus jeune des Titans et il a dirigé les Titans après avoir castré son père Ouranos, devenant ainsi le souverain de l'âge d'or."),
            en = LocalizedContent("In Greek mythology, who is the leader of the Titans?", listOf("Cronus", "Hyperion", "Oceanus", "Coeus"), "Culture", "Cronus is the youngest of the Titans and led them after castrating his father Uranus, becoming the ruler of the Golden Age."),
            zh = LocalizedContent("在希腊神话中，谁是泰坦的领袖？", listOf("克洛诺斯", "许珀里翁", "俄刻阿诺斯", "科俄斯"), "文化", "克洛诺斯是最年轻的泰坦，在阉割了他的父亲乌拉诺斯后领导泰坦，成为黄金时代的统治者。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el líder de los Titanes?", listOf("Crono", "Hiperión", "Océano", "Ceo"), "Cultura", "Crono es el más joven de los Titanes y los lideró después de castrar a su padre Urano, convirtiéndose en el gobernante de la Edad de Oro.")
        ),
        BilingualQuestion(
            id = 10490, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Lituanie?", listOf("Cepelinas", "Kugelis", "Rasol", "Tous les trois"), "Culture", "La cuisine lituanienne combine des influences de la cuisine polonaise, juive et allemande en raison de son histoire et de sa situation géographique."),
            en = LocalizedContent("What style of cuisine originates from Lithuania?", listOf("Cepelinas", "Kugelis", "Rasol", "All three"), "Culture", "Lithuanian cuisine combines influences from Polish, Jewish, and German cuisines due to its history and geographical location."),
            zh = LocalizedContent("哪种菜肴风格源自立陶宛？", listOf("Cepelinas", "Kugelis", "Rasol", "以上都是"), "文化", "立陶宛菜肴融合了波兰、犹太和德国菜肴的影响，这是由于它的历史和地理位置。"),
            es = LocalizedContent("¿Qué estilo de cocina es originario de Lituania?", listOf("Cepelinas", "Kugelis", "Rasol", "Los tres"), "Cultura", "La cocina lituana combina influencias de las cocinas polaca, judía y alemana debido a su historia y ubicación geográfica.")
        ),
        BilingualQuestion(
            id = 10491, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Good Place' a-t-il commencé?", listOf("2016", "2017", "2018", "2019"), "Culture", "La série télévisée américaine 'The Good Place', créée par Michael Schur, a été diffusée pour la première fois en 2016 sur NBC, mais sa saison complète a débuté en 2017."),
            en = LocalizedContent("In what year did 'The Good Place' start?", listOf("2016", "2017", "2018", "2019"), "Culture", "The American television series 'The Good Place', created by Michael Schur, first aired in 2016 on NBC, but its full season began in 2017."),
            zh = LocalizedContent("《善地》在哪一年开播？", listOf("2016", "2017", "2018", "2019"), "文化", "美国电视剧《善地》由迈克尔·舒尔创作，于2016年在NBC首播，但完整的第一季始于2017年。"),
            es = LocalizedContent("¿En qué año comenzó 'The Good Place'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "La serie de televisión estadounidense 'The Good Place', creada por Michael Schur, se emitió por primera vez en 2016 en NBC, pero su temporada completa comenzó en 2017.")
        ),
        BilingualQuestion(
            id = 10492, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Abstraction Bleu'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Culture", "Wassily Kandinsky, pionnier de l'art abstrait, a réalisé 'Abstraction Bleu' en 1912, une œuvre clé de sa période expressionniste."),
            en = LocalizedContent("Which painter created 'Blue Abstraction'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Culture", "Wassily Kandinsky, a pioneer of abstract art, created 'Blue Abstraction' in 1912, a key work from his expressionist period."),
            zh = LocalizedContent("哪位画家创作了《蓝色抽象》？", listOf("瓦西里·康定斯基", "皮特·蒙德里安", "卡济米尔·马列维奇", "保罗·克利"), "文化", "抽象艺术先驱瓦西里·康定斯基于1912年创作了《蓝色抽象》，这是他表现主义时期的重要作品。"),
            es = LocalizedContent("¿Qué pintor creó 'Abstracción Azul'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Kazimir Malevich", "Paul Klee"), "Cultura", "Wassily Kandinsky, pionero del arte abstracto, realizó 'Abstracción Azul' en 1912, una obra clave de su período expresionista.")
        ),
        BilingualQuestion(
            id = 10493, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel est le nombre des heures de la nuit?", listOf("6", "8", "12", "24"), "Culture", "Les Égyptiens divisaient la nuit en 12 heures, chacune représentant une étape du voyage du dieu Rê dans l'au-delà."),
            en = LocalizedContent("In Egyptian mythology, what is the number of hours of the night?", listOf("6", "8", "12", "24"), "Culture", "The Egyptians divided the night into 12 hours, each representing a stage of the god Ra's journey through the underworld."),
            zh = LocalizedContent("在埃及神话中，夜晚有多少小时？", listOf("6", "8", "12", "24"), "文化", "埃及人将夜晚分为12小时，每一小时代表太阳神拉在冥界旅程中的一个阶段。"),
            es = LocalizedContent("En la mitología egipcia, ¿cuál es el número de horas de la noche?", listOf("6", "8", "12", "24"), "Cultura", "Los egipcios dividían la noche en 12 horas, cada una representando una etapa del viaje del dios Ra en el más allá.")
        ),
        BilingualQuestion(
            id = 10494, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé de Cork, Irlande?", listOf("Irish Folk", "Sean-nós", "Céilí Music", "Tous les trois"), "Culture", "Cork est un foyer musical diversifié, ayant vu naître des artistes de rock, folk et punk, comme les groupes Sultans of Ping, The Frank and Walters ou le chanteur folk Jimmy Crowley."),
            en = LocalizedContent("What style of music emerged from Cork, Ireland?", listOf("Irish Folk", "Sean-nós", "Céilí Music", "All three"), "Culture", "Cork is a diverse musical hub, having given rise to rock, folk, and punk artists, such as the bands Sultans of Ping, The Frank and Walters, or folk singer Jimmy Crowley."),
            zh = LocalizedContent("哪种音乐风格源自爱尔兰科克？", listOf("爱尔兰民谣", "Sean-nós", "Céilí音乐", "以上都是"), "文化", "科克是一个多元化的音乐中心，孕育了摇滚、民谣和朋克艺术家，如乐队Sultans of Ping、The Frank and Walters，以及民谣歌手Jimmy Crowley。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Cork, Irlanda?", listOf("Folk irlandés", "Sean-nós", "Música Céilí", "Los tres"), "Cultura", "Cork es un centro musical diverso, que ha dado lugar a artistas de rock, folk y punk, como las bandas Sultans of Ping, The Frank and Walters, o el cantante folk Jimmy Crowley.")
        ),
        BilingualQuestion(
            id = 10495, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Russian Doll' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "La série 'Russian Doll' a débuté en 2019 sur Netflix, mais sa première saison complète a été diffusée en 2020."),
            en = LocalizedContent("In what year did 'Russian Doll' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "The series 'Russian Doll' began in 2019 on Netflix, but its first full season was released in 2020."),
            zh = LocalizedContent("《俄罗斯娃娃》在哪一年开播？", listOf("2018", "2019", "2020", "2021"), "文化", "剧集《俄罗斯娃娃》于2019年在Netflix开播，但完整的第一季于2020年发布。"),
            es = LocalizedContent("¿En qué año comenzó 'Russian Doll'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "La serie 'Russian Doll' comenzó en 2019 en Netflix, pero su primera temporada completa se estrenó en 2020.")
        ),
        BilingualQuestion(
            id = 10496, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Abstraction Jaune'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Piet Mondrian"), "Culture", "Paul Klee, peintre suisse-allemand, a réalisé 'Abstraction Jaune' en 1925, une œuvre emblématique de son style abstrait et coloré, influencé par le mouvement expressionniste."),
            en = LocalizedContent("Which painter painted 'Yellow Abstraction'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Piet Mondrian"), "Culture", "Paul Klee, a Swiss-German painter, created 'Yellow Abstraction' in 1925, an emblematic work of his abstract and colorful style, influenced by the expressionist movement."),
            zh = LocalizedContent("哪位画家创作了《黄色抽象》？", listOf("保罗·克利", "瓦西里·康定斯基", "胡安·米罗", "皮特·蒙德里安"), "文化", "瑞士-德国画家保罗·克利于1925年创作了《黄色抽象》，这是他抽象多彩风格的代表作，受到表现主义运动的影响。"),
            es = LocalizedContent("¿Qué pintor pintó 'Abstracción Amarilla'?", listOf("Paul Klee", "Wassily Kandinsky", "Joan Miró", "Piet Mondrian"), "Cultura", "Paul Klee, pintor suizo-alemán, realizó 'Abstracción Amarilla' en 1925, una obra emblemática de su estilo abstracto y colorido, influenciado por el movimiento expresionista.")
        ),
        BilingualQuestion(
            id = 10497, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, qui est le roi des Titans?", listOf("Kronos", "Hypérion", "Océan", "Coeus"), "Culture", "Kronos est le plus jeune des Titans et le fils d'Ouranos et Gaïa. Il a renversé son père pour devenir le souverain des Titans avant d'être lui-même détrôné par son fils Zeus."),
            en = LocalizedContent("In Greek mythology, who is the king of the Titans?", listOf("Cronus", "Hyperion", "Oceanus", "Coeus"), "Culture", "Cronus is the youngest of the Titans and the son of Uranus and Gaia. He overthrew his father to become the ruler of the Titans before being dethroned by his son Zeus."),
            zh = LocalizedContent("在希腊神话中，谁是泰坦之王？", listOf("克洛诺斯", "许珀里翁", "俄刻阿诺斯", "科俄斯"), "文化", "克洛诺斯是最年轻的泰坦，是乌拉诺斯和盖亚的儿子。他推翻了自己的父亲成为泰坦的统治者，后来被他的儿子宙斯废黜。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el rey de los Titanes?", listOf("Crono", "Hiperión", "Océano", "Ceo"), "Cultura", "Crono es el más joven de los Titanes e hijo de Urano y Gea. Derrocó a su padre para convertirse en el gobernante de los Titanes antes de ser destronado por su hijo Zeus.")
        ),
        BilingualQuestion(
            id = 10498, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel style de danse est originaire du Mali?", listOf("Djembe Dance", "Griot Dance", "Wasoulou Dance", "Tous les trois"), "Culture", "Les danses mandingues, notamment le djembe et le rythme du sabar, ainsi que le ballet africain, sont originaires du Mali et de la région mandingue."),
            en = LocalizedContent("What style of dance originates from Mali?", listOf("Djembe Dance", "Griot Dance", "Wasoulou Dance", "All three"), "Culture", "Mandingue dances, notably the djembe and the sabar rhythm, as well as African ballet, originate from Mali and the Mandingue region."),
            zh = LocalizedContent("哪种舞蹈风格源自马里？", listOf("Djembe舞", "Griot舞", "Wasoulou舞", "以上都是"), "文化", "曼丁哥舞蹈，特别是djembe和sabar节奏，以及非洲芭蕾，都源自马里和曼丁哥地区。"),
            es = LocalizedContent("¿Qué estilo de danza es originario de Malí?", listOf("Danza Djembe", "Danza Griot", "Danza Wasoulou", "Los tres"), "Cultura", "Las danzas mandingas, notablemente el djembe y el ritmo sabar, así como el ballet africano, son originarias de Malí y la región mandinga.")
        ),
        BilingualQuestion(
            id = 10499, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Atypical' a-t-il commencé?", listOf("2016", "2017", "2018", "2019"), "Culture", "La série 'Atypical', qui suit le quotidien d'un adolescent autiste, a été diffusée pour la première fois sur Netflix en 2018."),
            en = LocalizedContent("In what year did 'Atypical' start?", listOf("2016", "2017", "2018", "2019"), "Culture", "The series 'Atypical', which follows the daily life of an autistic teenager, first aired on Netflix in 2018."),
            zh = LocalizedContent("《非典型少年》在哪一年开播？", listOf("2016", "2017", "2018", "2019"), "文化", "剧集《非典型少年》讲述一名自闭症青少年的日常生活，于2018年在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Atypical'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "La serie 'Atypical', que sigue la vida cotidiana de un adolescente autista, se emitió por primera vez en Netflix en 2018.")
        ),
        BilingualQuestion(
            id = 10500, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un nombre premier ?", listOf("Un nombre divisible uniquement par 1 et lui-même", "Un nombre pair", "Un multiple de 3", "Un nombre négatif"), "Mathématiques", ""),
            en = LocalizedContent("What is a prime number?", listOf("A number divisible only by 1 and itself", "An even number", "A multiple of 3", "A negative number"), "Mathematics", ""),
            zh = LocalizedContent("什么是质数？", listOf("只能被1和自身整除的数", "偶数", "3的倍数", "负数"), "数学", ""),
            es = LocalizedContent("¿Qué es un número primo?", listOf("Un número divisible solo por 1 y por sí mismo", "Un número par", "Un múltiplo de 3", "Un número negativo"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10501, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien vaut π (pi) approximativement ?", listOf("3.14159", "2.71828", "1.41421", "1.61803"), "Mathématiques", ""),
            en = LocalizedContent("What is the approximate value of π (pi)?", listOf("3.14159", "2.71828", "1.41421", "1.61803"), "Mathematics", ""),
            zh = LocalizedContent("π（圆周率）的近似值是多少？", listOf("3.14159", "2.71828", "1.41421", "1.61803"), "数学", ""),
            es = LocalizedContent("¿Cuánto vale aproximadamente π (pi)?", listOf("3.14159", "2.71828", "1.41421", "1.61803"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10502, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le théorème de Pythagore ?", listOf("a²+b²=c²", "E=mc²", "F=ma", "V=IR"), "Mathématiques", ""),
            en = LocalizedContent("What is the Pythagorean theorem?", listOf("a²+b²=c²", "E=mc²", "F=ma", "V=IR"), "Mathematics", ""),
            zh = LocalizedContent("什么是勾股定理？", listOf("a²+b²=c²", "E=mc²", "F=ma", "V=IR"), "数学", ""),
            es = LocalizedContent("¿Cuál es el teorema de Pitágoras?", listOf("a²+b²=c²", "E=mc²", "F=ma", "V=IR"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10503, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une matrice identité ?", listOf("Une matrice carrée avec 1 sur la diagonale et 0 ailleurs", "Une matrice avec uniquement des 1", "Une matrice vide", "Une matrice avec des nombres premiers"), "Mathématiques", ""),
            en = LocalizedContent("What is an identity matrix?", listOf("A square matrix with 1s on the diagonal and 0s elsewhere", "A matrix with only 1s", "An empty matrix", "A matrix with prime numbers"), "Mathematics", ""),
            zh = LocalizedContent("什么是单位矩阵？", listOf("对角线为1、其余为0的方阵", "全1矩阵", "空矩阵", "质数矩阵"), "数学", ""),
            es = LocalizedContent("¿Qué es una matriz identidad?", listOf("Una matriz cuadrada con 1 en la diagonal y 0 en el resto", "Una matriz con solo unos", "Una matriz vacía", "Una matriz con números primos"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10504, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de chambres a le cœur d'un poisson?", listOf("2", "3", "4", "6"), "Nature", "Le cœur des poissons est composé de deux chambres principales : une oreillette et un ventricule, ce qui permet une circulation sanguine simple et efficace adaptée à leur environnement aquatique."),
            en = LocalizedContent("How many chambers does a fish's heart have?", listOf("2", "3", "4", "6"), "Nature", "Fish hearts have two main chambers: one atrium and one ventricle, allowing simple and efficient blood circulation adapted to their aquatic environment."),
            zh = LocalizedContent("鱼的心脏有几个腔室？", listOf("2", "3", "4", "6"), "自然", "鱼的心脏由两个主要腔室组成：一个心房和一个心室，这使得血液循环简单高效，适应其水生环境。"),
            es = LocalizedContent("¿Cuántas cavidades tiene el corazón de un pez?", listOf("2", "3", "4", "6"), "Naturaleza", "El corazón de los peces tiene dos cavidades principales: una aurícula y un ventrículo, lo que permite una circulación sanguínea simple y eficiente adaptada a su entorno acuático.")
        ),
        BilingualQuestion(
            id = 10505, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet du monde?", listOf("K2", "Mont-Blanc", "Everest", "Mont Kilimandjaro"), "Nature", "L'Everest, culminant à 8 848 mètres, est le point le plus élevé de la croûte terrestre, situé dans l'Himalaya à la frontière du Népal et du Tibet."),
            en = LocalizedContent("What is the highest mountain in the world?", listOf("K2", "Mont Blanc", "Everest", "Mount Kilimanjaro"), "Nature", "Mount Everest, at 8,848 meters, is the highest point on Earth's crust, located in the Himalayas on the border of Nepal and Tibet."),
            zh = LocalizedContent("世界最高峰是什么？", listOf("K2", "勃朗峰", "珠穆朗玛峰", "乞力马扎罗山"), "自然", "珠穆朗玛峰海拔8848米，是地壳最高点，位于喜马拉雅山脉尼泊尔和西藏边界。"),
            es = LocalizedContent("¿Cuál es la montaña más alta del mundo?", listOf("K2", "Mont Blanc", "Everest", "Monte Kilimanjaro"), "Naturaleza", "El Everest, con 8.848 metros, es el punto más alto de la corteza terrestre, situado en el Himalaya en la frontera entre Nepal y el Tíbet.")
        ),
        BilingualQuestion(
            id = 10506, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres cervicales a une girafe?", listOf("5", "7", "12", "15"), "Nature", "Comme la plupart des mammifères, y compris les humains, la girafe possède sept vertèbres cervicales, mais chacune est très allongée pour former son long cou."),
            en = LocalizedContent("How many cervical vertebrae does a giraffe have?", listOf("5", "7", "12", "15"), "Nature", "Like most mammals, including humans, giraffes have seven cervical vertebrae, but each is greatly elongated to form their long neck."),
            zh = LocalizedContent("长颈鹿有多少节颈椎？", listOf("5", "7", "12", "15"), "自然", "与大多数哺乳动物（包括人类）一样，长颈鹿有七节颈椎，但每节都大大延长，形成其长颈。"),
            es = LocalizedContent("¿Cuántas vértebras cervicales tiene una jirafa?", listOf("5", "7", "12", "15"), "Naturaleza", "Como la mayoría de los mamíferos, incluidos los humanos, la jirafa tiene siete vértebras cervicales, pero cada una está muy alargada para formar su largo cuello.")
        ),
        BilingualQuestion(
            id = 10507, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un marché oligopolistique ?", listOf("Marché dominé par quelques entreprises", "Marché avec un seul vendeur", "Marché parfaitement concurrentiel", "Marché sans régulation"), "Économie", ""),
            en = LocalizedContent("What is an oligopolistic market?", listOf("Market dominated by a few firms", "Market with a single seller", "Perfectly competitive market", "Market without regulation"), "Economics", ""),
            zh = LocalizedContent("什么是寡头垄断市场？", listOf("由少数企业主导的市场", "只有一个卖家的市场", "完全竞争市场", "无监管的市场"), "经济学", ""),
            es = LocalizedContent("¿Qué es un mercado oligopolístico?", listOf("Mercado dominado por unas pocas empresas", "Mercado con un solo vendedor", "Mercado perfectamente competitivo", "Mercado sin regulación"), "Economía", "")
        ),
        BilingualQuestion(
            id = 10508, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'La Richesse des Nations' ?", listOf("Adam Smith", "Karl Marx", "John Keynes", "Milton Friedman"), "Économie", ""),
            en = LocalizedContent("Who wrote 'The Wealth of Nations'?", listOf("Adam Smith", "Karl Marx", "John Keynes", "Milton Friedman"), "Economics", ""),
            zh = LocalizedContent("《国富论》的作者是谁？", listOf("亚当·斯密", "卡尔·马克思", "约翰·凯恩斯", "米尔顿·弗里德曼"), "经济学", ""),
            es = LocalizedContent("¿Quién escribió 'La riqueza de las naciones'?", listOf("Adam Smith", "Karl Marx", "John Keynes", "Milton Friedman"), "Economía", "")
        ),
        BilingualQuestion(
            id = 10509, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la plus profonde fosse océanique?", listOf("Fosse des Mariannes", "Fosse de Tonga", "Fosse de Kuril", "Fosse de Mindanao"), "Nature", "La fosse des Mariannes, située dans l'océan Pacifique, atteint environ 11 034 mètres de profondeur à son point le plus bas, appelé le Challenger Deep."),
            en = LocalizedContent("What is the deepest ocean trench?", listOf("Mariana Trench", "Tonga Trench", "Kuril Trench", "Mindanao Trench"), "Nature", "The Mariana Trench, located in the Pacific Ocean, reaches approximately 11,034 meters at its deepest point, called the Challenger Deep."),
            zh = LocalizedContent("最深的海沟是什么？", listOf("马里亚纳海沟", "汤加海沟", "千岛海沟", "棉兰老海沟"), "自然", "马里亚纳海沟位于太平洋，其最深处挑战者深渊约达11034米。"),
            es = LocalizedContent("¿Cuál es la fosa oceánica más profunda?", listOf("Fosa de las Marianas", "Fosa de Tonga", "Fosa de Kuril", "Fosa de Mindanao"), "Naturaleza", "La fosa de las Marianas, situada en el océano Pacífico, alcanza aproximadamente 11.034 metros en su punto más profundo, llamado el Abismo Challenger.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10510, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand océan du monde ?", listOf("Pacifique", "Atlantique", "Indien", "Arctique"), "Nature", ""),
            en = LocalizedContent("What is the largest ocean in the world?", listOf("Pacific", "Atlantic", "Indian", "Arctic"), "Nature", ""),
            zh = LocalizedContent("世界上最大的海洋是什么？", listOf("太平洋", "大西洋", "印度洋", "北冰洋"), "自然", ""),
            es = LocalizedContent("¿Cuál es el océano más grande del mundo?", listOf("Pacífico", "Atlántico", "Índico", "Ártico"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10511, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la photosynthèse ?", listOf("Conversion de lumière en énergie chimique par les plantes", "Respiration des animaux", "Décomposition des matières organiques", "Formation des nuages"), "Nature", ""),
            en = LocalizedContent("What is photosynthesis?", listOf("Conversion of light into chemical energy by plants", "Respiration of animals", "Decomposition of organic matter", "Formation of clouds"), "Nature", ""),
            zh = LocalizedContent("什么是光合作用？", listOf("植物将光能转化为化学能", "动物的呼吸作用", "有机物的分解", "云的形成"), "自然", ""),
            es = LocalizedContent("¿Qué es la fotosíntesis?", listOf("Conversión de luz en energía química por las plantas", "Respiración de los animales", "Descomposición de materia orgánica", "Formación de nubes"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10512, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand animal du monde?", listOf("L'éléphant", "L'hippopotame", "La baleine bleue", "Le giraffe"), "Nature", "La baleine bleue peut atteindre jusqu'à 30 mètres de long et peser plus de 170 tonnes, ce qui en fait le plus grand animal jamais connu sur Terre."),
            en = LocalizedContent("What is the largest animal in the world?", listOf("Elephant", "Hippopotamus", "Blue whale", "Giraffe"), "Nature", "The blue whale can reach up to 30 meters in length and weigh over 170 tons, making it the largest animal ever known on Earth."),
            zh = LocalizedContent("世界上最大的动物是什么？", listOf("大象", "河马", "蓝鲸", "长颈鹿"), "自然", "蓝鲸体长可达30米，体重超过170吨，是地球上已知最大的动物。"),
            es = LocalizedContent("¿Cuál es el animal más grande del mundo?", listOf("El elefante", "El hipopótamo", "La ballena azul", "La jirafa"), "Naturaleza", "La ballena azul puede alcanzar hasta 30 metros de largo y pesar más de 170 toneladas, lo que la convierte en el animal más grande jamás conocido en la Tierra.")
        ),
        BilingualQuestion(
            id = 10513, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz est principalement responsable de l'effet de serre ?", listOf("CO2 (dioxyde de carbone)", "Oxygène", "Azote", "Hydrogène"), "Nature", ""),
            en = LocalizedContent("Which gas is primarily responsible for the greenhouse effect?", listOf("CO2 (carbon dioxide)", "Oxygen", "Nitrogen", "Hydrogen"), "Nature", ""),
            zh = LocalizedContent("哪种气体是导致温室效应的主要原因？", listOf("二氧化碳", "氧气", "氮气", "氢气"), "自然", ""),
            es = LocalizedContent("¿Qué gas es el principal responsable del efecto invernadero?", listOf("CO2 (dióxido de carbono)", "Oxígeno", "Nitrógeno", "Hidrógeno"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10514, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'espèces de papillons existe-t-il environ?", listOf("5 000", "17 500", "50 000", "100 000"), "Nature", "La France métropolitaine compte environ 5 000 espèces de papillons de jour et de nuit, mais à l'échelle mondiale, on en dénombre environ 17 500 espèces de papillons de jour."),
            en = LocalizedContent("How many species of butterflies are there approximately?", listOf("5,000", "17,500", "50,000", "100,000"), "Nature", "Metropolitan France has about 5,000 species of butterflies (day and night), but globally there are approximately 17,500 species of butterflies."),
            zh = LocalizedContent("大约有多少种蝴蝶？", listOf("5000", "17500", "50000", "100000"), "自然", "法国本土约有5000种蝴蝶（昼行和夜行），但全球范围内约有17500种蝴蝶。"),
            es = LocalizedContent("¿Cuántas especies de mariposas existen aproximadamente?", listOf("5.000", "17.500", "50.000", "100.000"), "Naturaleza", "La Francia metropolitana cuenta con unas 5.000 especies de mariposas (diurnas y nocturnas), pero a nivel mundial se estiman unas 17.500 especies de mariposas.")
        ),
        BilingualQuestion(
            id = 10515, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la démocratie directe ?", listOf("Citoyens votent directement sur les lois", "Élection de représentants", "Pouvoir d'un seul dirigeant", "Gouvernement militaire"), "Politique", ""),
            en = LocalizedContent("What is direct democracy?", listOf("Citizens vote directly on laws", "Election of representatives", "Power of a single ruler", "Military government"), "Politics", ""),
            zh = LocalizedContent("什么是直接民主？", listOf("公民直接投票决定法律", "选举代表", "单一统治者的权力", "军政府"), "政治", ""),
            es = LocalizedContent("¿Qué es la democracia directa?", listOf("Los ciudadanos votan directamente las leyes", "Elección de representantes", "Poder de un solo gobernante", "Gobierno militar"), "Política", "")
        ),
        BilingualQuestion(
            id = 10516, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le suffrage universel ?", listOf("Droit de vote pour tous les citoyens", "Vote réservé aux hommes", "Vote des parlementaires uniquement", "Élection à un tour"), "Politique", ""),
            en = LocalizedContent("What is universal suffrage?", listOf("Right to vote for all citizens", "Vote reserved for men", "Vote only for parliamentarians", "Single-round election"), "Politics", ""),
            zh = LocalizedContent("什么是普选权？", listOf("所有公民的投票权", "仅限男性投票", "仅限议员投票", "单轮选举"), "政治", ""),
            es = LocalizedContent("¿Qué es el sufragio universal?", listOf("Derecho al voto para todos los ciudadanos", "Voto reservado a los hombres", "Voto solo de los parlamentarios", "Elección a una sola vuelta"), "Política", "")
        ),
        BilingualQuestion(
            id = 10517, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal a le plus long cou?", listOf("L'autruche", "Le chameau", "La girafe", "L'émeu"), "Nature", "La girafe possède le plus long cou de tous les animaux, mesurant jusqu'à 2,4 mètres, ce qui lui permet d'atteindre les feuilles hautes des arbres."),
            en = LocalizedContent("Which animal has the longest neck?", listOf("Ostrich", "Camel", "Giraffe", "Emu"), "Nature", "The giraffe has the longest neck of any animal, measuring up to 2.4 meters, allowing it to reach high tree leaves."),
            zh = LocalizedContent("哪种动物的脖子最长？", listOf("鸵鸟", "骆驼", "长颈鹿", "鸸鹋"), "自然", "长颈鹿拥有所有动物中最长的脖子，长达2.4米，使其能够够到高处的树叶。"),
            es = LocalizedContent("¿Qué animal tiene el cuello más largo?", listOf("El avestruz", "El camello", "La jirafa", "El emú"), "Naturaleza", "La jirafa posee el cuello más largo de todos los animales, midiendo hasta 2,4 metros, lo que le permite alcanzar las hojas altas de los árboles.")
        ),
        BilingualQuestion(
            id = 10518, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a théorisé le 'Léviathan' (État souverain) ?", listOf("Thomas Hobbes", "John Locke", "Jean-Jacques Rousseau", "Montesquieu"), "Politique", ""),
            en = LocalizedContent("Who theorized the 'Leviathan' (sovereign state)?", listOf("Thomas Hobbes", "John Locke", "Jean-Jacques Rousseau", "Montesquieu"), "Politics", ""),
            zh = LocalizedContent("谁提出了'利维坦'（主权国家）的理论？", listOf("托马斯·霍布斯", "约翰·洛克", "让-雅克·卢梭", "孟德斯鸠"), "政治", ""),
            es = LocalizedContent("¿Quién teorizó el 'Leviatán' (Estado soberano)?", listOf("Thomas Hobbes", "John Locke", "Jean-Jacques Rousseau", "Montesquieu"), "Política", "")
        ),
        BilingualQuestion(
            id = 10519, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un État fédéral ?", listOf("État composé d'entités ayant leur propre gouvernement", "État centralisé", "Monarchie constitutionnelle", "République directe"), "Politique", ""),
            en = LocalizedContent("What is a federal state?", listOf("State composed of entities with their own government", "Centralized state", "Constitutional monarchy", "Direct republic"), "Politics", ""),
            zh = LocalizedContent("什么是联邦制国家？", listOf("由拥有自己政府的实体组成的国家", "中央集权国家", "君主立宪制", "直接共和国"), "政治", ""),
            es = LocalizedContent("¿Qué es un estado federal?", listOf("Estado compuesto por entidades con su propio gobierno", "Estado centralizado", "Monarquía constitucional", "República directa"), "Política", "")
        ),
        BilingualQuestion(
            id = 10520, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le roi des dieux dans la mythologie grecque ?", listOf("Zeus", "Poséidon", "Hadès", "Arès"), "Mythologie", ""),
            en = LocalizedContent("Who is the king of the gods in Greek mythology?", listOf("Zeus", "Poseidon", "Hades", "Ares"), "Mythology", ""),
            zh = LocalizedContent("在希腊神话中，谁是众神之王？", listOf("宙斯", "波塞冬", "哈迪斯", "阿瑞斯"), "神话", ""),
            es = LocalizedContent("¿Quién es el rey de los dioses en la mitología griega?", listOf("Zeus", "Poseidón", "Hades", "Ares"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10521, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel héros grec a tué le Minotaure dans le labyrinthe ?", listOf("Thésée", "Persée", "Héraclès", "Bellérophon"), "Mythologie", ""),
            en = LocalizedContent("Which Greek hero killed the Minotaur in the labyrinth?", listOf("Theseus", "Perseus", "Heracles", "Bellerophon"), "Mythology", ""),
            zh = LocalizedContent("哪位希腊英雄在迷宫中杀死了米诺陶洛斯？", listOf("忒修斯", "珀尔修斯", "赫拉克勒斯", "柏勒洛丰"), "神话", ""),
            es = LocalizedContent("¿Qué héroe griego mató al Minotauro en el laberinto?", listOf("Teseo", "Perseo", "Heracles", "Belerofonte"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10522, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de travaux Héraclès a-t-il dû accomplir selon la mythologie grecque ?", listOf("12", "10", "15", "7"), "Mythologie", ""),
            en = LocalizedContent("How many labors did Heracles have to accomplish according to Greek mythology?", listOf("12", "10", "15", "7"), "Mythology", ""),
            zh = LocalizedContent("根据希腊神话，赫拉克勒斯必须完成多少项任务？", listOf("12", "10", "15", "7"), "神话", ""),
            es = LocalizedContent("¿Cuántos trabajos tuvo que realizar Heracles según la mitología griega?", listOf("12", "10", "15", "7"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10523, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est la déesse grecque de la sagesse et de la stratégie ?", listOf("Athéna", "Aphrodite", "Héra", "Artémis"), "Mythologie", ""),
            en = LocalizedContent("Who is the Greek goddess of wisdom and strategy?", listOf("Athena", "Aphrodite", "Hera", "Artemis"), "Mythology", ""),
            zh = LocalizedContent("谁是希腊神话中智慧和战略的女神？", listOf("雅典娜", "阿佛洛狄忒", "赫拉", "阿尔忒弥斯"), "神话", ""),
            es = LocalizedContent("¿Quién es la diosa griega de la sabiduría y la estrategia?", listOf("Atenea", "Afrodita", "Hera", "Artemisa"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10524, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu nordique est le père des dieux et le roi d'Asgard ?", listOf("Odin", "Thor", "Loki", "Heimdall"), "Mythologie", ""),
            en = LocalizedContent("Which Norse god is the father of the gods and king of Asgard?", listOf("Odin", "Thor", "Loki", "Heimdall"), "Mythology", ""),
            zh = LocalizedContent("哪位北欧神是众神之父和阿斯加德的国王？", listOf("奥丁", "托尔", "洛基", "海姆达尔"), "神话", ""),
            es = LocalizedContent("¿Qué dios nórdico es el padre de los dioses y rey de Asgard?", listOf("Odín", "Thor", "Loki", "Heimdall"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10525, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans la mythologie égyptienne, qui est le dieu du Nil et de l'inondation ?", listOf("Osiris", "Rê", "Thoth", "Anubis"), "Mythologie", ""),
            en = LocalizedContent("In Egyptian mythology, who is the god of the Nile and the flood?", listOf("Osiris", "Ra", "Thoth", "Anubis"), "Mythology", ""),
            zh = LocalizedContent("在埃及神话中，谁是尼罗河和洪水的神？", listOf("奥西里斯", "拉", "托特", "阿努比斯"), "神话", ""),
            es = LocalizedContent("En la mitología egipcia, ¿quién es el dios del Nilo y la inundación?", listOf("Osiris", "Ra", "Thot", "Anubis"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10526, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel monstre égyptien à corps de lion et tête de pharaon garde les pyramides ?", listOf("Le Grand Sphinx", "L'Anubis", "L'Apophis", "Le Scarabée"), "Mythologie", ""),
            en = LocalizedContent("Which Egyptian monster with the body of a lion and the head of a pharaoh guards the pyramids?", listOf("The Great Sphinx", "Anubis", "Apophis", "The Scarab"), "Mythology", ""),
            zh = LocalizedContent("哪个狮身人面像的埃及怪物守护着金字塔？", listOf("大狮身人面像", "阿努比斯", "阿波菲斯", "圣甲虫"), "神话", ""),
            es = LocalizedContent("¿Qué monstruo egipcio con cuerpo de león y cabeza de faraón guarda las pirámides?", listOf("La Gran Esfinge", "Anubis", "Apofis", "El Escarabajo"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10527, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est la déesse japonaise du soleil selon la mythologie Shinto ?", listOf("Amaterasu", "Susanoo", "Izanagi", "Raiden"), "Mythologie", ""),
            en = LocalizedContent("Who is the Japanese sun goddess according to Shinto mythology?", listOf("Amaterasu", "Susanoo", "Izanagi", "Raiden"), "Mythology", ""),
            zh = LocalizedContent("根据神道教神话，谁是日本的太阳女神？", listOf("天照大神", "须佐之男命", "伊邪那岐", "雷电"), "神话", ""),
            es = LocalizedContent("¿Quién es la diosa japonesa del sol según la mitología sintoísta?", listOf("Amaterasu", "Susanoo", "Izanagi", "Raiden"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10528, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fruit défendu Perséphone a-t-elle mangé en captivité chez Hadès ?", listOf("Une pomme de grenade", "Une pomme dorée", "Une pêche", "Une cerise"), "Mythologie", ""),
            en = LocalizedContent("What forbidden fruit did Persephone eat while captive in Hades?", listOf("A pomegranate seed", "A golden apple", "A peach", "A cherry"), "Mythology", ""),
            zh = LocalizedContent("珀耳塞福涅在哈迪斯被囚禁时吃了什么禁果？", listOf("一颗石榴籽", "一个金苹果", "一个桃子", "一颗樱桃"), "神话", ""),
            es = LocalizedContent("¿Qué fruta prohibida comió Perséfone mientras estaba cautiva en el Hades?", listOf("Una semilla de granada", "Una manzana dorada", "Un melocotón", "Una cereza"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10529, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du fleuve de l'oubli dans la mythologie grecque ?", listOf("Léthé", "Styx", "Achéron", "Cocyte"), "Mythologie", ""),
            en = LocalizedContent("What is the name of the river of forgetfulness in Greek mythology?", listOf("Lethe", "Styx", "Acheron", "Cocytus"), "Mythology", ""),
            zh = LocalizedContent("希腊神话中遗忘之河的名字是什么？", listOf("勒忒河", "斯提克斯河", "阿刻戎河", "科库托斯河"), "神话", ""),
            es = LocalizedContent("¿Cuál es el nombre del río del olvido en la mitología griega?", listOf("Lete", "Estigia", "Aqueronte", "Cocito"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10530, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans la mythologie nordique, comment s'appelle le grand serpent du monde ?", listOf("Jörmungandr", "Fenrir", "Surtr", "Niflheim"), "Mythologie", ""),
            en = LocalizedContent("In Norse mythology, what is the name of the great world serpent?", listOf("Jörmungandr", "Fenrir", "Surtr", "Niflheim"), "Mythology", ""),
            zh = LocalizedContent("在北欧神话中，世界巨蛇叫什么名字？", listOf("耶梦加得", "芬里尔", "苏尔特尔", "尼福尔海姆"), "神话", ""),
            es = LocalizedContent("En la mitología nórdica, ¿cómo se llama la gran serpiente del mundo?", listOf("Jörmungandr", "Fenrir", "Surtr", "Niflheim"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10531, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel artisan divin a créé Pandore dans la mythologie grecque ?", listOf("Héphaïstos", "Athéna", "Zeus", "Aphrodite"), "Mythologie", ""),
            en = LocalizedContent("Which divine craftsman created Pandora in Greek mythology?", listOf("Hephaestus", "Athena", "Zeus", "Aphrodite"), "Mythology", ""),
            zh = LocalizedContent("在希腊神话中，哪位神匠创造了潘多拉？", listOf("赫菲斯托斯", "雅典娜", "宙斯", "阿佛洛狄忒"), "神话", ""),
            es = LocalizedContent("¿Qué artesano divino creó a Pandora en la mitología griega?", listOf("Hefesto", "Atenea", "Zeus", "Afrodita"), "Mitología", "")
        ),
        BilingualQuestion(
            id = 10532, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mathématicien a découvert le nombre e (base des logarithmes naturels) ?", listOf("Leonhard Euler", "Isaac Newton", "Gottfried Leibniz", "Jean Bernoulli"), "Mathématiques", ""),
            en = LocalizedContent("Which mathematician discovered the number e (base of natural logarithms)?", listOf("Leonhard Euler", "Isaac Newton", "Gottfried Leibniz", "Jean Bernoulli"), "Mathematics", ""),
            zh = LocalizedContent("哪位数学家发现了自然对数的底数 e？", listOf("莱昂哈德·欧拉", "艾萨克·牛顿", "戈特弗里德·莱布尼茨", "约翰·伯努利"), "数学", ""),
            es = LocalizedContent("¿Qué matemático descubrió el número e (base de los logaritmos naturales)?", listOf("Leonhard Euler", "Isaac Newton", "Gottfried Leibniz", "Jean Bernoulli"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10533, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps un ours peut-il hiberner?", listOf("2-3 mois", "4-5 mois", "6-7 mois", "8-9 mois"), "Nature", "L'hibernation de l'ours peut durer de 6 à 7 mois, car son métabolisme ralentit considérablement pour économiser l'énergie durant l'hiver, sans besoin de manger, boire ou éliminer."),
            en = LocalizedContent("How long can a bear hibernate?", listOf("2-3 months", "4-5 months", "6-7 months", "8-9 months"), "Nature", "Bear hibernation can last 6 to 7 months, as its metabolism slows significantly to conserve energy during winter, without needing to eat, drink, or eliminate."),
            zh = LocalizedContent("熊可以冬眠多长时间？", listOf("2-3个月", "4-5个月", "6-7个月", "8-9个月"), "自然", "熊的冬眠可持续6到7个月，因为其新陈代谢显著减慢以在冬季节省能量，无需进食、饮水或排泄。"),
            es = LocalizedContent("¿Cuánto tiempo puede hibernar un oso?", listOf("2-3 meses", "4-5 meses", "6-7 meses", "8-9 meses"), "Naturaleza", "La hibernación del oso puede durar de 6 a 7 meses, ya que su metabolismo se ralentiza significativamente para ahorrar energía durante el invierno, sin necesidad de comer, beber o eliminar.")
        ),
        BilingualQuestion(
            id = 10534, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit nombre parfait ?", listOf("6", "10", "12", "15"), "Mathématiques", ""),
            en = LocalizedContent("What is the smallest perfect number?", listOf("6", "10", "12", "15"), "Mathematics", ""),
            zh = LocalizedContent("最小的完全数是多少？", listOf("6", "10", "12", "15"), "数学", ""),
            es = LocalizedContent("¿Cuál es el número perfecto más pequeño?", listOf("6", "10", "12", "15"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10535, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le nombre d'or (phi) environ ?", listOf("1.618", "2.718", "3.14159", "0.618"), "Mathématiques", ""),
            en = LocalizedContent("What is the golden ratio (phi) approximately?", listOf("1.618", "2.718", "3.14159", "0.618"), "Mathematics", ""),
            zh = LocalizedContent("黄金分割比（phi）大约是多少？", listOf("1.618", "2.718", "3.14159", "0.618"), "数学", ""),
            es = LocalizedContent("¿Cuál es aproximadamente el número áureo (phi)?", listOf("1.618", "2.718", "3.14159", "0.618"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10536, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("À combien de degrés correspond un radian (environ) ?", listOf("57.3°", "90°", "45°", "180°"), "Mathématiques", ""),
            en = LocalizedContent("How many degrees is one radian (approximately)?", listOf("57.3°", "90°", "45°", "180°"), "Mathematics", ""),
            zh = LocalizedContent("一弧度大约等于多少度？", listOf("57.3°", "90°", "45°", "180°"), "数学", ""),
            es = LocalizedContent("¿A cuántos grados equivale un radián (aproximadamente)?", listOf("57.3°", "90°", "45°", "180°"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10537, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel génie a créé la géométrie non-euclidienne ?", listOf("Lobatchevski et Riemann", "Euclide", "Pythagore", "Archimède"), "Mathématiques", ""),
            en = LocalizedContent("Which genius created non-Euclidean geometry?", listOf("Lobachevsky and Riemann", "Euclid", "Pythagoras", "Archimedes"), "Mathematics", ""),
            zh = LocalizedContent("哪位天才创立了非欧几何？", listOf("罗巴切夫斯基和黎曼", "欧几里得", "毕达哥拉斯", "阿基米德"), "数学", ""),
            es = LocalizedContent("¿Qué genio creó la geometría no euclidiana?", listOf("Lobachevski y Riemann", "Euclides", "Pitágoras", "Arquímedes"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10538, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la conjecture de Goldbach (non encore prouvée) ?", listOf("Tout nombre pair > 2 est la somme de deux nombres premiers", "Tout nombre impair est premier", "Il existe infiniment de nombres premiers", "π est un nombre rationnel"), "Mathématiques", ""),
            en = LocalizedContent("What is Goldbach's conjecture (still unproven)?", listOf("Every even number > 2 is the sum of two primes", "Every odd number is prime", "There are infinitely many primes", "π is a rational number"), "Mathematics", ""),
            zh = LocalizedContent("哥德巴赫猜想（尚未证明）是什么？", listOf("每个大于2的偶数都是两个质数之和", "每个奇数都是质数", "存在无穷多个质数", "π是有理数"), "数学", ""),
            es = LocalizedContent("¿Qué es la conjetura de Goldbach (aún no probada)?", listOf("Todo número par > 2 es suma de dos primos", "Todo número impar es primo", "Hay infinitos números primos", "π es un número racional"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10539, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de dimensions dans l'espace euclidien classique ?", listOf("3", "4", "2", "5"), "Mathématiques", ""),
            en = LocalizedContent("What is the number of dimensions in classical Euclidean space?", listOf("3", "4", "2", "5"), "Mathematics", ""),
            zh = LocalizedContent("经典欧几里得空间有多少维？", listOf("3", "4", "2", "5"), "数学", ""),
            es = LocalizedContent("¿Cuál es el número de dimensiones en el espacio euclidiano clásico?", listOf("3", "4", "2", "5"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10540, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un polynôme de degré 2 ?", listOf("Trinôme quadratique (ax² + bx + c)", "Équation linéaire", "Fonction exponentielle", "Fonction logarithmique"), "Mathématiques", ""),
            en = LocalizedContent("What is a polynomial of degree 2?", listOf("Quadratic trinomial (ax² + bx + c)", "Linear equation", "Exponential function", "Logarithmic function"), "Mathematics", ""),
            zh = LocalizedContent("什么是二次多项式？", listOf("二次三项式 (ax² + bx + c)", "线性方程", "指数函数", "对数函数"), "数学", ""),
            es = LocalizedContent("¿Qué es un polinomio de grado 2?", listOf("Trinomio cuadrático (ax² + bx + c)", "Ecuación lineal", "Función exponencial", "Función logarítmica"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10541, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mathématicien a inventé le calcul différentiel et intégral (découverte indépendante) ?", listOf("Newton et Leibniz", "Euler et Gauss", "Riemann et Cantor", "Abel et Galois"), "Mathématiques", ""),
            en = LocalizedContent("Which mathematician invented differential and integral calculus (independent discovery)?", listOf("Newton and Leibniz", "Euler and Gauss", "Riemann and Cantor", "Abel and Galois"), "Mathematics", ""),
            zh = LocalizedContent("哪位数学家独立发明了微积分？", listOf("牛顿和莱布尼茨", "欧拉和高斯", "黎曼和康托尔", "阿贝尔和伽罗瓦"), "数学", ""),
            es = LocalizedContent("¿Qué matemático inventó el cálculo diferencial e integral (descubrimiento independiente)?", listOf("Newton y Leibniz", "Euler y Gauss", "Riemann y Cantor", "Abel y Galois"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 10542, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel psychologue a développé la théorie des étapes du développement cognitif ?", listOf("Jean Piaget", "Lev Vygotsky", "Maria Montessori", "B.F. Skinner"), "Sciences Humaines", ""),
            en = LocalizedContent("Which psychologist developed the theory of stages of cognitive development?", listOf("Jean Piaget", "Lev Vygotsky", "Maria Montessori", "B.F. Skinner"), "Human Sciences", ""),
            zh = LocalizedContent("哪位心理学家提出了认知发展阶段理论？", listOf("让·皮亚杰", "列夫·维果茨基", "玛丽亚·蒙台梭利", "B.F. 斯金纳"), "人文科学", ""),
            es = LocalizedContent("¿Qué psicólogo desarrolló la teoría de las etapas del desarrollo cognitivo?", listOf("Jean Piaget", "Lev Vygotsky", "Maria Montessori", "B.F. Skinner"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10543, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la théorie du renforcement de Skinner ?", listOf("Comportement renforcé par conséquences positives ou négatives", "Apprentissage par observation", "Constructivisme mental", "Apprentissage par imitation"), "Sciences Humaines", ""),
            en = LocalizedContent("What is Skinner's reinforcement theory?", listOf("Behavior reinforced by positive or negative consequences", "Learning by observation", "Mental constructivism", "Learning by imitation"), "Human Sciences", ""),
            zh = LocalizedContent("什么是斯金纳的强化理论？", listOf("行为通过积极或消极后果得到强化", "观察学习", "心理建构主义", "模仿学习"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la teoría del refuerzo de Skinner?", listOf("Comportamiento reforzado por consecuencias positivas o negativas", "Aprendizaje por observación", "Constructivismo mental", "Aprendizaje por imitación"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10544, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel sociologist a théorisé les rapports de classe et la lutte des classes ?", listOf("Karl Marx", "Émile Durkheim", "Max Weber", "Pierre Bourdieu"), "Sciences Humaines", ""),
            en = LocalizedContent("Which sociologist theorized class relations and class struggle?", listOf("Karl Marx", "Émile Durkheim", "Max Weber", "Pierre Bourdieu"), "Human Sciences", ""),
            zh = LocalizedContent("哪位社会学家提出了阶级关系和阶级斗争理论？", listOf("卡尔·马克思", "埃米尔·涂尔干", "马克斯·韦伯", "皮埃尔·布迪厄"), "人文科学", ""),
            es = LocalizedContent("¿Qué sociólogo teorizó las relaciones de clase y la lucha de clases?", listOf("Karl Marx", "Émile Durkheim", "Max Weber", "Pierre Bourdieu"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10545, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le 'capital culturel' selon Bourdieu ?", listOf("Connaissances et comportements acquis par éducation et environnement", "L'argent des entreprises", "Les savoirs technologiques", "L'héritage financier familial"), "Sciences Humaines", ""),
            en = LocalizedContent("What is 'cultural capital' according to Bourdieu?", listOf("Knowledge and behaviors acquired through education and environment", "Corporate money", "Technological knowledge", "Family financial inheritance"), "Human Sciences", ""),
            zh = LocalizedContent("布迪厄所说的“文化资本”是什么？", listOf("通过教育和环境获得的知识和行为", "企业资金", "技术知识", "家庭财务继承"), "人文科学", ""),
            es = LocalizedContent("¿Qué es el 'capital cultural' según Bourdieu?", listOf("Conocimientos y comportamientos adquiridos por educación y entorno", "El dinero de las empresas", "Los saberes tecnológicos", "La herencia financiera familiar"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10546, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le phénomène psychologique de 'pensée de groupe' ?", listOf("Conformité excessive à l'opinion du groupe par peur du conflit", "Majorité des pensées du groupe", "Apprentissage collectif", "Divergence de pensées"), "Sciences Humaines", ""),
            en = LocalizedContent("What is the psychological phenomenon of 'groupthink'?", listOf("Excessive conformity to group opinion for fear of conflict", "Majority of group thoughts", "Collective learning", "Divergence of thoughts"), "Human Sciences", ""),
            zh = LocalizedContent("什么是“群体思维”的心理现象？", listOf("因害怕冲突而过度遵从群体意见", "群体的大多数想法", "集体学习", "思想分歧"), "人文科学", ""),
            es = LocalizedContent("¿Cuál es el fenómeno psicológico del 'pensamiento de grupo'?", listOf("Conformidad excesiva a la opinión del grupo por miedo al conflicto", "Mayoría de los pensamientos del grupo", "Aprendizaje colectivo", "Divergencia de pensamientos"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10547, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé la psychanalyse moderne ?", listOf("Sigmund Freud", "Carl Jung", "Alfred Adler", "Otto Rank"), "Sciences Humaines", ""),
            en = LocalizedContent("Who founded modern psychoanalysis?", listOf("Sigmund Freud", "Carl Jung", "Alfred Adler", "Otto Rank"), "Human Sciences", ""),
            zh = LocalizedContent("谁创立了现代精神分析学？", listOf("西格蒙德·弗洛伊德", "卡尔·荣格", "阿尔弗雷德·阿德勒", "奥托·兰克"), "人文科学", ""),
            es = LocalizedContent("¿Quién fundó el psicoanálisis moderno?", listOf("Sigmund Freud", "Carl Jung", "Alfred Adler", "Otto Rank"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10548, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la 'zone proximale de développement' (Vygotsky) ?", listOf("Écart entre ce que l'enfant peut faire seul et avec aide", "Zone cérebrale responsable du langage", "Espace de jeu de l'enfant", "Période d'apprentissage rapide"), "Sciences Humaines", ""),
            en = LocalizedContent("What is the 'zone of proximal development' (Vygotsky)?", listOf("Difference between what a child can do alone and with help", "Brain area responsible for language", "Child's play space", "Period of rapid learning"), "Human Sciences", ""),
            zh = LocalizedContent("什么是“最近发展区”（维果茨基）？", listOf("儿童独立完成与在帮助下完成之间的差距", "负责语言的大脑区域", "儿童的游戏空间", "快速学习期"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la 'zona de desarrollo próximo' (Vygotsky)?", listOf("Diferencia entre lo que el niño puede hacer solo y con ayuda", "Zona cerebral responsable del lenguaje", "Espacio de juego del niño", "Período de aprendizaje rápido"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10549, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel anthropologue a étudié les structures élémentaires de la parenté ?", listOf("Claude Lévi-Strauss", "Bronislaw Malinowski", "Franz Boas", "Margaret Mead"), "Sciences Humaines", ""),
            en = LocalizedContent("Which anthropologist studied the elementary structures of kinship?", listOf("Claude Lévi-Strauss", "Bronislaw Malinowski", "Franz Boas", "Margaret Mead"), "Human Sciences", ""),
            zh = LocalizedContent("哪位人类学家研究了亲属关系的基本结构？", listOf("克洛德·列维-斯特劳斯", "布罗尼斯拉夫·马林诺夫斯基", "弗朗茨·博厄斯", "玛格丽特·米德"), "人文科学", ""),
            es = LocalizedContent("¿Qué antropólogo estudió las estructuras elementales del parentesco?", listOf("Claude Lévi-Strauss", "Bronislaw Malinowski", "Franz Boas", "Margaret Mead"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10550, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la 'banalité du mal' selon Hannah Arendt ?", listOf("Mal commis par des individus ordinaires sans conscience idéologique", "Crime organisé", "Malveillance consciente", "Acte criminel planifié"), "Sciences Humaines", ""),
            en = LocalizedContent("What is the 'banality of evil' according to Hannah Arendt?", listOf("Evil committed by ordinary individuals without ideological consciousness", "Organized crime", "Conscious malice", "Planned criminal act"), "Philosophy", ""),
            zh = LocalizedContent("根据汉娜·阿伦特，什么是“平庸之恶”？", listOf("由没有意识形态意识的普通人犯下的恶行", "有组织的犯罪", "有意识的恶意", "有计划的犯罪行为"), "哲学", ""),
            es = LocalizedContent("¿Qué es la 'banalidad del mal' según Hannah Arendt?", listOf("Mal cometido por individuos ordinarios sin conciencia ideológica", "Crimen organizado", "Maldad consciente", "Acto criminal planificado"), "Filosofia", "")
        ),
        BilingualQuestion(
            id = 10551, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le courant sociologique fondé par Auguste Comte ?", listOf("Positivisme", "Marxisme", "Fonctionnalisme", "Structuralisme"), "Sciences Humaines", ""),
            en = LocalizedContent("What is the sociological school founded by Auguste Comte?", listOf("Positivism", "Marxism", "Functionalism", "Structuralism"), "Philosophy", ""),
            zh = LocalizedContent("奥古斯特·孔德创立了哪个社会学流派？", listOf("实证主义", "马克思主义", "功能主义", "结构主义"), "哲学", ""),
            es = LocalizedContent("¿Cuál es la corriente sociológica fundada por Auguste Comte?", listOf("Positivismo", "Marxismo", "Funcionalismo", "Estructuralismo"), "Filosofia", "")
        ),
        BilingualQuestion(
            id = 10552, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur classique était sourd en composant ses dernières œuvres ?", listOf("Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Joseph Haydn", "Antonio Vivaldi"), "Musique", ""),
            en = LocalizedContent("Which classical composer was deaf while composing his last works?", listOf("Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Joseph Haydn", "Antonio Vivaldi"), "Music", ""),
            zh = LocalizedContent("哪位古典作曲家在创作最后作品时失聪？", listOf("路德维希·范·贝多芬", "沃尔夫冈·阿马德乌斯·莫扎特", "约瑟夫·海顿", "安东尼奥·维瓦尔第"), "音乐", ""),
            es = LocalizedContent("¿Qué compositor clásico estaba sordo al componer sus últimas obras?", listOf("Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Joseph Haydn", "Antonio Vivaldi"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10553, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de symphonies le compositeur Beethoven a-t-il composées ?", listOf("9", "7", "11", "6"), "Musique", ""),
            en = LocalizedContent("How many symphonies did composer Beethoven compose?", listOf("9", "7", "11", "6"), "Music", ""),
            zh = LocalizedContent("作曲家贝多芬创作了多少部交响曲？", listOf("9", "7", "11", "6"), "音乐", ""),
            es = LocalizedContent("¿Cuántas sinfonías compuso el compositor Beethoven?", listOf("9", "7", "11", "6"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10554, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur baroque a écrit 'Les Quatre Saisons' ?", listOf("Antonio Vivaldi", "Georg Friedrich Händel", "Jean-Sébastien Bach", "George Telemann"), "Musique", ""),
            en = LocalizedContent("Which Baroque composer wrote 'The Four Seasons'?", listOf("Antonio Vivaldi", "George Frideric Handel", "Johann Sebastian Bach", "Georg Philipp Telemann"), "Music", ""),
            zh = LocalizedContent("哪位巴洛克作曲家创作了《四季》？", listOf("安东尼奥·维瓦尔第", "乔治·弗里德里希·亨德尔", "约翰·塞巴斯蒂安·巴赫", "乔治·菲利普·泰勒曼"), "音乐", ""),
            es = LocalizedContent("¿Qué compositor barroco escribió 'Las cuatro estaciones'?", listOf("Antonio Vivaldi", "Georg Friedrich Händel", "Johann Sebastian Bach", "Georg Philipp Telemann"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10555, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien et scientifique a découvert les principes de l'acoustique musicale ?", listOf("Pythagore", "Platon", "Aristote", "Euclide"), "Musique", ""),
            en = LocalizedContent("Which musician and scientist discovered the principles of musical acoustics?", listOf("Pythagoras", "Plato", "Aristotle", "Euclid"), "Music", ""),
            zh = LocalizedContent("哪位音乐家和科学家发现了音乐声学原理？", listOf("毕达哥拉斯", "柏拉图", "亚里士多德", "欧几里得"), "音乐", ""),
            es = LocalizedContent("¿Qué músico y científico descubrió los principios de la acústica musical?", listOf("Pitágoras", "Platón", "Aristóteles", "Euclides"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10556, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur moderne a fondé le dodécaphonisme (système à 12 tons) ?", listOf("Arnold Schoenberg", "Alban Berg", "Anton Webern", "Igor Stravinsky"), "Musique", ""),
            en = LocalizedContent("Which modern composer founded dodecaphonism (12-tone system)?", listOf("Arnold Schoenberg", "Alban Berg", "Anton Webern", "Igor Stravinsky"), "Music", ""),
            zh = LocalizedContent("哪位现代作曲家创立了十二音体系？", listOf("阿诺德·勋伯格", "阿尔班·贝尔格", "安东·韦伯恩", "伊戈尔·斯特拉文斯基"), "音乐", ""),
            es = LocalizedContent("¿Qué compositor moderno fundó el dodecafonismo (sistema de 12 tonos)?", listOf("Arnold Schoenberg", "Alban Berg", "Anton Webern", "Igor Stravinsky"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10557, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jazzman légendaire a révolutionné le jazz avec le be-bop ?", listOf("Charlie Parker", "Duke Ellington", "Thelonious Monk", "Dizzy Gillespie"), "Musique", ""),
            en = LocalizedContent("Which legendary jazzman revolutionized jazz with bebop?", listOf("Charlie Parker", "Duke Ellington", "Thelonious Monk", "Dizzy Gillespie"), "Music", ""),
            zh = LocalizedContent("哪位传奇爵士音乐家用比波普革命了爵士乐？", listOf("查理·帕克", "艾灵顿公爵", "塞隆尼斯·蒙克", "迪齐·吉莱斯皮"), "音乐", ""),
            es = LocalizedContent("¿Qué legendario jazzista revolucionó el jazz con el bebop?", listOf("Charlie Parker", "Duke Ellington", "Thelonious Monk", "Dizzy Gillespie"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10558, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de cordes un violon classique possède-t-il ?", listOf("4", "5", "6", "3"), "Musique", ""),
            en = LocalizedContent("How many strings does a classical violin have?", listOf("4", "5", "6", "3"), "Music", ""),
            zh = LocalizedContent("古典小提琴有多少根弦？", listOf("4", "5", "6", "3"), "音乐", ""),
            es = LocalizedContent("¿Cuántas cuerdas tiene un violín clásico?", listOf("4", "5", "6", "3"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10559, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel musicien a composé 'Clair de lune' ?", listOf("Claude Debussy", "Maurice Ravel", "Gabriel Fauré", "César Franck"), "Musique", ""),
            en = LocalizedContent("Which musician composed 'Clair de lune'?", listOf("Claude Debussy", "Maurice Ravel", "Gabriel Fauré", "César Franck"), "Music", ""),
            zh = LocalizedContent("哪位音乐家创作了《月光》？", listOf("克劳德·德彪西", "莫里斯·拉威尔", "加布里埃尔·福雷", "塞萨尔·弗兰克"), "音乐", ""),
            es = LocalizedContent("¿Qué músico compuso 'Clair de lune'?", listOf("Claude Debussy", "Maurice Ravel", "Gabriel Fauré", "César Franck"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10560, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal est le mammifère le plus rapide en l'air ?", listOf("La chauve-souris (150 km/h)", "L'aigle (300 km/h)", "Le faucon pèlerin (voler seulement)", "L'albatros (80 km/h)"), "Nature", ""),
            en = LocalizedContent("Which animal is the fastest mammal in the air?", listOf("Bat (150 km/h)", "Eagle (300 km/h)", "Peregrine falcon (flying only)", "Albatross (80 km/h)"), "Nature", ""),
            zh = LocalizedContent("哪种动物是空中最快的哺乳动物？", listOf("蝙蝠（150公里/小时）", "鹰（300公里/小时）", "游隼（仅飞行）", "信天翁（80公里/小时）"), "自然", ""),
            es = LocalizedContent("¿Qué animal es el mamífero más rápido en el aire?", listOf("Murciélago (150 km/h)", "Águila (300 km/h)", "Halcón peregrino (solo volando)", "Albatros (80 km/h)"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10561, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut boire l'eau de mer?", listOf("Le pingouin", "Le dauphin", "La baleine", "Le chameau"), "Nature", "Les dauphins ont des reins très efficaces qui filtrent l'excès de sel, leur permettant de boire l'eau de mer sans se déshydrater."),
            en = LocalizedContent("Which animal can drink seawater?", listOf("Penguin", "Dolphin", "Whale", "Camel"), "Nature", "Dolphins have very efficient kidneys that filter excess salt, allowing them to drink seawater without dehydrating."),
            zh = LocalizedContent("哪种动物可以喝海水？", listOf("企鹅", "海豚", "鲸鱼", "骆驼"), "自然", "海豚拥有非常高效的肾脏，可以过滤多余的盐分，使它们能够喝海水而不会脱水。"),
            es = LocalizedContent("¿Qué animal puede beber agua de mar?", listOf("Pingüino", "Delfín", "Ballena", "Camello"), "Naturaleza", "Los delfines tienen riñones muy eficientes que filtran el exceso de sal, permitiéndoles beber agua de mar sin deshidratarse.")
        ),
        BilingualQuestion(
            id = 10562, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long insecte du monde?", listOf("La sauterelle géante", "Le bâton du Borneo", "L'insecte-feuille", "La libellule géante"), "Nature", "Le Phasme bâton du Bornéo (Phobaeticus chani) détient le record de l'insecte le plus long, avec une femelle mesurant 56,7 centimètres, pattes comprises. Il vit dans les forêts tropicales de Bornéo."),
            en = LocalizedContent("What is the longest insect in the world?", listOf("Giant grasshopper", "Borneo stick insect", "Leaf insect", "Giant dragonfly"), "Nature", "The Borneo stick insect (Phobaeticus chani) holds the record for the longest insect, with a female measuring 56.7 centimeters including legs. It lives in the tropical forests of Borneo."),
            zh = LocalizedContent("世界上最长的昆虫是什么？", listOf("巨型蚱蜢", "婆罗洲竹节虫", "叶虫", "巨型蜻蜓"), "自然", "婆罗洲竹节虫（Phobaeticus chani）保持着最长昆虫的记录，一只雌虫包括腿在内长达56.7厘米。它生活在婆罗洲的热带森林中。"),
            es = LocalizedContent("¿Cuál es el insecto más largo del mundo?", listOf("Saltamontes gigante", "Insecto palo de Borneo", "Insecto hoja", "Libélula gigante"), "Naturaleza", "El insecto palo de Borneo (Phobaeticus chani) tiene el récord del insecto más largo, con una hembra que mide 56,7 centímetros incluyendo las patas. Vive en los bosques tropicales de Borneo.")
        ),
        BilingualQuestion(
            id = 10563, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal mammifère pond des œufs ?", listOf("L'ornithorynque et l'échidné", "La chauve-souris", "Le dauphin", "L'ours"), "Nature", ""),
            en = LocalizedContent("Which mammal lays eggs?", listOf("Platypus and echidna", "Bat", "Dolphin", "Bear"), "Nature", ""),
            zh = LocalizedContent("哪种哺乳动物会下蛋？", listOf("鸭嘴兽和针鼹", "蝙蝠", "海豚", "熊"), "自然", ""),
            es = LocalizedContent("¿Qué mamífero pone huevos?", listOf("Ornitorrinco y equidna", "Murciélago", "Delfín", "Oso"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10564, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'espèces d'oiseaux environ existent sur Terre ?", listOf("10 000", "5 000", "15 000", "20 000"), "Nature", ""),
            en = LocalizedContent("Approximately how many bird species exist on Earth?", listOf("10,000", "5,000", "15,000", "20,000"), "Nature", ""),
            zh = LocalizedContent("地球上大约有多少种鸟类？", listOf("10,000", "5,000", "15,000", "20,000"), "自然", ""),
            es = LocalizedContent("¿Aproximadamente cuántas especies de aves existen en la Tierra?", listOf("10 000", "5 000", "15 000", "20 000"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10565, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la migration des monarques ?", listOf("Voyage épique de 4 générations papillons vers le Mexique", "Déplacement saisonnier des oiseaux", "Migration des mammifères marins", "Mouvement des poissons"), "Nature", ""),
            en = LocalizedContent("What is the monarch migration?", listOf("Epic 4-generation butterfly journey to Mexico", "Seasonal bird movement", "Marine mammal migration", "Fish movement"), "Nature", ""),
            zh = LocalizedContent("什么是帝王蝶迁徙？", listOf("跨越四代蝴蝶的史诗之旅前往墨西哥", "季节性鸟类移动", "海洋哺乳动物迁徙", "鱼类移动"), "自然", ""),
            es = LocalizedContent("¿Qué es la migración de las monarcas?", listOf("Viaje épico de 4 generaciones de mariposas hacia México", "Desplazamiento estacional de aves", "Migración de mamíferos marinos", "Movimiento de peces"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10566, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz les arbres absorbent-ils principalement pour la photosynthèse ?", listOf("CO2 (dioxyde de carbone)", "Oxygène", "Méthane", "Hydrogène"), "Nature", ""),
            en = LocalizedContent("Which gas do trees mainly absorb for photosynthesis?", listOf("CO2 (carbon dioxide)", "Oxygen", "Methane", "Hydrogen"), "Nature", ""),
            zh = LocalizedContent("树木进行光合作用主要吸收哪种气体？", listOf("二氧化碳（CO2）", "氧气", "甲烷", "氢气"), "自然", ""),
            es = LocalizedContent("¿Qué gas absorben principalmente los árboles para la fotosíntesis?", listOf("CO2 (dióxido de carbono)", "Oxígeno", "Metano", "Hidrógeno"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10567, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une chaîne alimentaire ?", listOf("Succession d'organismes consommant les précédents pour l'énergie", "Suite d'herbivores", "Réseau de producteurs", "Lien entre prédateurs"), "Nature", ""),
            en = LocalizedContent("What is a food chain?", listOf("Succession of organisms consuming the previous for energy", "Sequence of herbivores", "Network of producers", "Link between predators"), "Nature", ""),
            zh = LocalizedContent("什么是食物链？", listOf("一系列生物依次消耗前一个以获取能量", "一系列食草动物", "生产者网络", "捕食者之间的联系"), "自然", ""),
            es = LocalizedContent("¿Qué es una cadena alimentaria?", listOf("Sucesión de organismos que consumen al anterior para obtener energía", "Secuencia de herbívoros", "Red de productores", "Vínculo entre depredadores"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10568, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus profond océan du monde ?", listOf("Fosse des Mariannes (Pacifique ~11 000m)", "Fossé de Porto-Rico", "Fosse de Kuril-Kamchatka", "Fossé du Japon"), "Nature", ""),
            en = LocalizedContent("What is the deepest ocean in the world?", listOf("Mariana Trench (Pacific ~11,000m)", "Puerto Rico Trench", "Kuril-Kamchatka Trench", "Japan Trench"), "Nature", ""),
            zh = LocalizedContent("世界上最深的海洋是什么？", listOf("马里亚纳海沟（太平洋约11,000米）", "波多黎各海沟", "千岛-堪察加海沟", "日本海沟"), "自然", ""),
            es = LocalizedContent("¿Cuál es el océano más profundo del mundo?", listOf("Fosa de las Marianas (Pacífico ~11 000 m)", "Fosa de Puerto Rico", "Fosa de Kuril-Kamchatka", "Fosa de Japón"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10569, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de grenouilles existe-t-il?", listOf("1000", "3000", "5000", "7000"), "Nature", "Il existe environ 5 000 espèces de grenouilles connues dans le monde, ce qui en fait l'un des groupes d'amphibiens les plus diversifiés."),
            en = LocalizedContent("How many kinds of frogs exist?", listOf("1000", "3000", "5000", "7000"), "Nature", "There are about 5,000 known species of frogs in the world, making them one of the most diverse groups of amphibians."),
            zh = LocalizedContent("世界上有多少种青蛙？", listOf("1000", "3000", "5000", "7000"), "自然", "世界上已知约有5000种青蛙，使它们成为最多样化的两栖动物群体之一。"),
            es = LocalizedContent("¿Cuántos tipos de ranas existen?", listOf("1000", "3000", "5000", "7000"), "Naturaleza", "Existen aproximadamente 5.000 especies de ranas conocidas en el mundo, lo que las convierte en uno de los grupos de anfibios más diversos.")
        ),
        BilingualQuestion(
            id = 10570, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut marcher sur l'eau?", listOf("L'insecte aquatique", "Le basilic", "La libellule", "Le patin"), "Nature", "Le basilic, aussi appelé lézard Jésus-Christ, peut courir sur l'eau grâce à ses pattes arrière rapides et à la tension superficielle de l'eau."),
            en = LocalizedContent("Which animal can walk on water?", listOf("Water strider", "Basilisk lizard", "Dragonfly", "Skater"), "Nature", "The basilisk lizard, also called the Jesus Christ lizard, can run on water thanks to its fast hind legs and the surface tension of the water."),
            zh = LocalizedContent("哪种动物可以在水上行走？", listOf("水黾", "蛇怪蜥蜴", "蜻蜓", "滑冰者"), "自然", "蛇怪蜥蜴，也被称为耶稣基督蜥蜴，凭借其快速的后腿和水的表面张力可以在水上奔跑。"),
            es = LocalizedContent("¿Qué animal puede caminar sobre el agua?", listOf("El insecto acuático", "El basilisco", "La libélula", "El patinador"), "Naturaleza", "El basilisco, también llamado lagarto Jesucristo, puede correr sobre el agua gracias a sus rápidas patas traseras y la tensión superficial del agua.")
        ),
        BilingualQuestion(
            id = 10571, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pingouin du monde?", listOf("Le pingouin d'Adélie", "Le pingouin empereur", "le pingouin royal", "Le pingouin de Gentoo"), "Nature", "Le pingouin empereur peut atteindre 1,20 mètre et peser jusqu'à 40 kilos, ce qui en fait la plus grande espèce de pingouin."),
            en = LocalizedContent("What is the largest penguin in the world?", listOf("Adélie penguin", "Emperor penguin", "King penguin", "Gentoo penguin"), "Nature", "The emperor penguin can reach 1.20 meters and weigh up to 40 kilos, making it the largest penguin species."),
            zh = LocalizedContent("世界上最大的企鹅是什么？", listOf("阿德利企鹅", "帝企鹅", "王企鹅", "金图企鹅"), "自然", "帝企鹅可以长到1.20米，重达40公斤，是最大的企鹅物种。"),
            es = LocalizedContent("¿Cuál es el pingüino más grande del mundo?", listOf("El pingüino de Adelia", "El pingüino emperador", "El pingüino real", "El pingüino de Gentoo"), "Naturaleza", "El pingüino emperador puede alcanzar 1,20 metros y pesar hasta 40 kilos, lo que lo convierte en la especie de pingüino más grande.")
        ),
        BilingualQuestion(
            id = 10572, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'algues existe-t-il?", listOf("500", "2000", "30 000", "100 000"), "Nature", "Les scientifiques estiment qu'il existe environ 30 000 espèces d'algues dans le monde, allant des microalgues unicellulaires aux grandes algues marines."),
            en = LocalizedContent("How many types of algae are there?", listOf("500", "2000", "30,000", "100,000"), "Nature", "Scientists estimate there are about 30,000 species of algae worldwide, ranging from unicellular microalgae to large seaweeds."),
            zh = LocalizedContent("有多少种藻类？", listOf("500", "2000", "30000", "100000"), "自然", "科学家估计全球约有30000种藻类，从单细胞微藻到大型海藻。"),
            es = LocalizedContent("¿Cuántos tipos de algas existen?", listOf("500", "2000", "30 000", "100 000"), "Naturaleza", "Los científicos estiman que existen alrededor de 30 000 especies de algas en el mundo, desde microalgas unicelulares hasta grandes algas marinas.")
        ),
        BilingualQuestion(
            id = 10573, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut vivre dans le désert sans boire d'eau?", listOf("Le chameau", "Le scorpion", "Le coyote", "Le renard"), "Nature", "Le scorpion tire l'eau dont il a besoin de ses proies, comme les insectes, et possède un métabolisme très économe en eau."),
            en = LocalizedContent("Which animal can live in the desert without drinking water?", listOf("Camel", "Scorpion", "Coyote", "Fox"), "Nature", "The scorpion gets the water it needs from its prey, such as insects, and has a very water-efficient metabolism."),
            zh = LocalizedContent("哪种动物可以在沙漠中不喝水生存？", listOf("骆驼", "蝎子", "郊狼", "狐狸"), "自然", "蝎子从猎物（如昆虫）中获取所需水分，并且新陈代谢非常节水。"),
            es = LocalizedContent("¿Qué animal puede vivir en el desierto sin beber agua?", listOf("El camello", "El escorpión", "El coyote", "El zorro"), "Naturaleza", "El escorpión obtiene el agua que necesita de sus presas, como los insectos, y posee un metabolismo muy eficiente en el uso del agua.")
        ),
        BilingualQuestion(
            id = 10574, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand poisson d'eau douce du monde?", listOf("Le sandre", "L'esturgeon blanc", "Le silure géant", "Le barbeau"), "Nature", "Le silure géant du Mékong peut atteindre près de 3 mètres de long et peser jusqu'à 300 kg, ce qui en fait le plus grand poisson d'eau douce connu."),
            en = LocalizedContent("What is the largest freshwater fish in the world?", listOf("Zander", "White sturgeon", "Giant catfish", "Barbel"), "Nature", "The Mekong giant catfish can reach nearly 3 meters in length and weigh up to 300 kg, making it the largest known freshwater fish."),
            zh = LocalizedContent("世界上最大的淡水鱼是什么？", listOf("梭鲈", "白鲟", "巨鲶", "鲃鱼"), "自然", "湄公河巨鲶可以长到近3米长，重达300公斤，是已知最大的淡水鱼。"),
            es = LocalizedContent("¿Cuál es el pez de agua dulce más grande del mundo?", listOf("El lucioperca", "El esturión blanco", "El siluro gigante", "El barbo"), "Naturaleza", "El siluro gigante del Mekong puede alcanzar casi 3 metros de largo y pesar hasta 300 kg, lo que lo convierte en el pez de agua dulce más grande conocido.")
        ),
        BilingualQuestion(
            id = 10575, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de libellules existe-t-il?", listOf("500", "2000", "5000", "10 000"), "Nature", "Le terme \"libellule\" désigne environ 5000 espèces réparties dans l'ordre des odonates, incluant les libellules proprement dites et les demoiselles."),
            en = LocalizedContent("How many types of dragonflies are there?", listOf("500", "2000", "5000", "10,000"), "Nature", "The term 'dragonfly' refers to about 5000 species in the order Odonata, including true dragonflies and damselflies."),
            zh = LocalizedContent("有多少种蜻蜓？", listOf("500", "2000", "5000", "10000"), "自然", "“蜻蜓”一词指蜻蜓目约5000个物种，包括真正的蜻蜓和豆娘。"),
            es = LocalizedContent("¿Cuántos tipos de libélulas existen?", listOf("500", "2000", "5000", "10 000"), "Naturaleza", "El término 'libélula' designa alrededor de 5000 especies del orden Odonata, incluyendo las libélulas propiamente dichas y los caballitos del diablo.")
        ),
        BilingualQuestion(
            id = 10576, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut tomber de la plus haute altitude sans se blesser?", listOf("La grue", "La chauve-souris", "le chat", "Le pigeon"), "Nature", "Les chats possèdent un réflexe de redressement qui leur permet de se retourner en chute libre et d'atterrir sur leurs pattes, ce qui réduit l'impact."),
            en = LocalizedContent("Which animal can fall from the highest altitude without getting hurt?", listOf("Crane", "Bat", "Cat", "Pigeon"), "Nature", "Cats have a righting reflex that allows them to twist in free fall and land on their feet, reducing impact."),
            zh = LocalizedContent("哪种动物从最高处坠落不会受伤？", listOf("鹤", "蝙蝠", "猫", "鸽子"), "自然", "猫具有翻正反射，可以在自由落体中转身并四脚着地，从而减少冲击。"),
            es = LocalizedContent("¿Qué animal puede caer desde la mayor altitud sin lastimarse?", listOf("La grulla", "El murciélago", "El gato", "La paloma"), "Naturaleza", "Los gatos poseen un reflejo de enderezamiento que les permite girar en caída libre y aterrizar sobre sus patas, reduciendo el impacto.")
        ),
        BilingualQuestion(
            id = 10577, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand mollusque du monde?", listOf("le calmar géant", "la seiche géante", "la moule géante", "l'huître géante"), "Nature", "Le calmar géant (Architeuthis dux) peut atteindre jusqu'à 18 mètres de long, ce qui en fait le plus grand mollusque connu, dépassant tous les autres céphalopodes et mollusques marins."),
            en = LocalizedContent("What is the largest mollusk in the world?", listOf("Giant squid", "Giant cuttlefish", "Giant clam", "Giant oyster"), "Nature", "The giant squid (Architeuthis dux) can reach up to 18 meters in length, making it the largest known mollusk, surpassing all other cephalopods and marine mollusks."),
            zh = LocalizedContent("世界上最大的软体动物是什么？", listOf("大王乌贼", "巨型墨鱼", "巨蛤", "巨牡蛎"), "自然", "大王乌贼（Architeuthis dux）可以长到18米长，是已知最大的软体动物，超过所有其他头足类和海洋软体动物。"),
            es = LocalizedContent("¿Cuál es el molusco más grande del mundo?", listOf("El calamar gigante", "La sepia gigante", "La almeja gigante", "La ostra gigante"), "Naturaleza", "El calamar gigante (Architeuthis dux) puede alcanzar hasta 18 metros de largo, lo que lo convierte en el molusco más grande conocido, superando a todos los demás cefalópodos y moluscos marinos.")
        ),
        BilingualQuestion(
            id = 10578, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de cactus existe-t-il?", listOf("500", "1000", "2000", "5000"), "Nature", "Il existe environ 2000 espèces de cactus dans le monde, principalement réparties sur le continent américain, des déserts aux forêts tropicales."),
            en = LocalizedContent("How many types of cacti are there?", listOf("500", "1000", "2000", "5000"), "Nature", "There are about 2000 species of cacti worldwide, mainly distributed across the American continent, from deserts to tropical forests."),
            zh = LocalizedContent("有多少种仙人掌？", listOf("500", "1000", "2000", "5000"), "自然", "全球约有2000种仙人掌，主要分布在美洲大陆，从沙漠到热带森林。"),
            es = LocalizedContent("¿Cuántos tipos de cactus existen?", listOf("500", "1000", "2000", "5000"), "Naturaleza", "Existen alrededor de 2000 especies de cactus en el mundo, distribuidas principalmente en el continente americano, desde desiertos hasta bosques tropicales.")
        ),
        BilingualQuestion(
            id = 10579, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal a les yeux les plus grands par rapport à sa taille?", listOf("La chouette", "La larve de libellule", "Le chaméléon", "L'aigle"), "Nature", "Les yeux de la larve de libellule peuvent occuper jusqu'à 80 % de sa tête, ce qui lui offre une vision quasi panoramique pour chasser efficacement dans l'eau."),
            en = LocalizedContent("Which animal has the largest eyes relative to its body size?", listOf("Owl", "Dragonfly larva", "Chameleon", "Eagle"), "Nature", "The eyes of a dragonfly larva can occupy up to 80% of its head, giving it nearly panoramic vision to hunt effectively in water."),
            zh = LocalizedContent("哪种动物的眼睛相对于身体比例最大？", listOf("猫头鹰", "蜻蜓幼虫", "变色龙", "鹰"), "自然", "蜻蜓幼虫的眼睛可以占据其头部的80%，使其拥有近乎全景的视野，以便在水中有效捕猎。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más grandes en relación con su tamaño corporal?", listOf("El búho", "La larva de libélula", "El camaleón", "El águila"), "Naturaleza", "Los ojos de la larva de libélula pueden ocupar hasta el 80% de su cabeza, lo que le proporciona una visión casi panorámica para cazar eficazmente en el agua.")
        ),
        BilingualQuestion(
            id = 10580, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand félin du monde?", listOf("Le lion", "Le tigre", "Le jaguar", "Le puma"), "Nature", "Le tigre, notamment le tigre de Sibérie, peut peser jusqu'à 300 kg et mesurer plus de 3 mètres de long, ce qui en fait le plus grand félin, devant le lion."),
            en = LocalizedContent("What is the largest feline in the world?", listOf("Lion", "Tiger", "Jaguar", "Puma"), "Nature", "The tiger, especially the Siberian tiger, can weigh up to 300 kg and measure over 3 meters in length, making it the largest feline, ahead of the lion."),
            zh = LocalizedContent("世界上最大的猫科动物是什么？", listOf("狮子", "老虎", "美洲豹", "美洲狮"), "自然", "老虎，尤其是西伯利亚虎，体重可达300公斤，体长超过3米，使其成为最大的猫科动物，领先于狮子。"),
            es = LocalizedContent("¿Cuál es el felino más grande del mundo?", listOf("El león", "El tigre", "El jaguar", "El puma"), "Naturaleza", "El tigre, especialmente el tigre siberiano, puede pesar hasta 300 kg y medir más de 3 metros de largo, lo que lo convierte en el felino más grande, por delante del león.")
        ),
        BilingualQuestion(
            id = 10581, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de champignons existe-t-il?", listOf("10 000", "50 000", "150 000", "1 million"), "Nature", "On estime qu'il existe environ 50 000 espèces de champignons dans le monde, mais ce nombre pourrait être bien plus élevé, car de nombreuses espèces restent encore à découvrir."),
            en = LocalizedContent("How many kinds of mushrooms are there?", listOf("10,000", "50,000", "150,000", "1 million"), "Nature", "It is estimated that there are about 50,000 species of mushrooms in the world, but this number could be much higher, as many species remain to be discovered."),
            zh = LocalizedContent("世界上有多少种蘑菇？", listOf("1万", "5万", "15万", "100万"), "自然", "据估计，世界上约有5万种蘑菇，但这个数字可能更高，因为许多物种仍有待发现。"),
            es = LocalizedContent("¿Cuántos tipos de hongos existen?", listOf("10 000", "50 000", "150 000", "1 millón"), "Naturaleza", "Se estima que existen alrededor de 50 000 especies de hongos en el mundo, pero este número podría ser mucho mayor, ya que muchas especies aún están por descubrir.")
        ),
        BilingualQuestion(
            id = 10582, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut courir le plus vite en marche arrière?", listOf("L'émeu", "l'autruche", "Le kangourou", "Le lièvre"), "Nature", "L'émeu, un grand oiseau coureur d'Australie, peut courir en marche arrière aussi vite qu'en marche avant, atteignant jusqu'à 50 km/h."),
            en = LocalizedContent("Which animal can run fastest in reverse?", listOf("Emu", "Ostrich", "Kangaroo", "Hare"), "Nature", "The emu, a large running bird from Australia, can run backwards as fast as forwards, reaching up to 50 km/h."),
            zh = LocalizedContent("哪种动物倒着跑最快？", listOf("鸸鹋", "鸵鸟", "袋鼠", "野兔"), "自然", "鸸鹋是一种来自澳大利亚的大型走禽，倒着跑和正着跑一样快，速度可达每小时50公里。"),
            es = LocalizedContent("¿Qué animal puede correr más rápido marcha atrás?", listOf("El emú", "El avestruz", "El canguro", "La liebre"), "Naturaleza", "El emú, una gran ave corredora de Australia, puede correr hacia atrás tan rápido como hacia adelante, alcanzando hasta 50 km/h.")
        ),
        BilingualQuestion(
            id = 10583, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand crâne d'animal terrestre?", listOf("L'éléphant", "Le giraffe", "L'hippopotame", "Le rhinocéros"), "Nature", "Le crâne de l'éléphant d'Afrique peut mesurer jusqu'à 2,5 mètres de long et peser plus de 500 kilogrammes, ce qui en fait le plus grand crâne d'animal terrestre."),
            en = LocalizedContent("What is the largest skull of a land animal?", listOf("Elephant", "Giraffe", "Hippopotamus", "Rhinoceros"), "Nature", "The skull of the African elephant can measure up to 2.5 meters long and weigh over 500 kilograms, making it the largest skull of any land animal."),
            zh = LocalizedContent("哪种陆地动物的头骨最大？", listOf("大象", "长颈鹿", "河马", "犀牛"), "自然", "非洲象的头骨可长达2.5米，重达500公斤以上，是最大的陆地动物头骨。"),
            es = LocalizedContent("¿Cuál es el cráneo más grande de un animal terrestre?", listOf("El elefante", "La jirafa", "El hipopótamo", "El rinoceronte"), "Naturaleza", "El cráneo del elefante africano puede medir hasta 2,5 metros de largo y pesar más de 500 kilogramos, lo que lo convierte en el cráneo más grande de un animal terrestre.")
        ),
        BilingualQuestion(
            id = 10584, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de fougères existe-t-il?", listOf("1000", "5000", "12 000", "20 000"), "Nature", "Les fougères sont des plantes vasculaires sans fleurs ni graines, et on estime qu'il existe environ 12 000 espèces différentes dans le monde."),
            en = LocalizedContent("How many kinds of ferns are there?", listOf("1,000", "5,000", "12,000", "20,000"), "Nature", "Ferns are vascular plants without flowers or seeds, and it is estimated that there are about 12,000 different species worldwide."),
            zh = LocalizedContent("世界上有多少种蕨类植物？", listOf("1000", "5000", "12000", "20000"), "自然", "蕨类植物是没有花和种子的维管植物，据估计全世界约有12000种不同的物种。"),
            es = LocalizedContent("¿Cuántos tipos de helechos existen?", listOf("1000", "5000", "12 000", "20 000"), "Naturaleza", "Los helechos son plantas vasculares sin flores ni semillas, y se estima que existen alrededor de 12 000 especies diferentes en el mundo.")
        ),
        BilingualQuestion(
            id = 10585, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut tenir debout sur ses pattes arrière le plus longtemps?", listOf("Le kangourou", "Le suricate", "Le ours", "Le singe"), "Nature", "Les singes, notamment les chimpanzés et les gorilles, peuvent se tenir debout sur leurs pattes arrière pendant de longues périodes grâce à leur musculature et leur équilibre adaptés à la bipédie occasionnelle."),
            en = LocalizedContent("Which animal can stand on its hind legs the longest?", listOf("Kangaroo", "Meerkat", "Bear", "Monkey"), "Nature", "Monkeys, especially chimpanzees and gorillas, can stand on their hind legs for long periods due to their musculature and balance adapted for occasional bipedalism."),
            zh = LocalizedContent("哪种动物用后腿站立的时间最长？", listOf("袋鼠", "狐獴", "熊", "猴子"), "自然", "猴子，尤其是黑猩猩和大猩猩，由于肌肉结构和平衡能力适应了偶尔的双足行走，可以长时间用后腿站立。"),
            es = LocalizedContent("¿Qué animal puede mantenerse sobre sus patas traseras durante más tiempo?", listOf("El canguro", "El suricato", "El oso", "El mono"), "Naturaleza", "Los monos, especialmente los chimpancés y los gorilas, pueden mantenerse sobre sus patas traseras durante largos períodos gracias a su musculatura y equilibrio adaptados al bipedismo ocasional.")
        ),
        BilingualQuestion(
            id = 10586, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand mollusque gastéropode du monde?", listOf("L'escargot de Bourgogne", "L'escargot géant africain", "Le limaçon", "le poulpe"), "Nature", "L'escargot géant africain (Achatina fulica) peut mesurer jusqu'à 30 cm de long et peser plus d'un kilogramme, ce qui en fait le plus grand gastéropode terrestre."),
            en = LocalizedContent("What is the largest gastropod mollusk in the world?", listOf("Burgundy snail", "Giant African snail", "Garden snail", "Octopus"), "Nature", "The giant African snail (Achatina fulica) can grow up to 30 cm long and weigh over a kilogram, making it the largest terrestrial gastropod."),
            zh = LocalizedContent("世界上最大的腹足类软体动物是什么？", listOf("勃艮第蜗牛", "非洲大蜗牛", "花园蜗牛", "章鱼"), "自然", "非洲大蜗牛（Achatina fulica）可长达30厘米，重达一公斤以上，是最大的陆生腹足类动物。"),
            es = LocalizedContent("¿Cuál es el molusco gasterópodo más grande del mundo?", listOf("El caracol de Borgoña", "El caracol gigante africano", "El caracol de jardín", "El pulpo"), "Naturaleza", "El caracol gigante africano (Achatina fulica) puede medir hasta 30 cm de largo y pesar más de un kilogramo, lo que lo convierte en el gasterópodo terrestre más grande.")
        ),
        BilingualQuestion(
            id = 10587, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de palmiers existe-t-il?", listOf("500", "1000", "2500", "5000"), "Nature", "Il existe environ 2500 espèces de palmiers réparties dans le monde, principalement dans les régions tropicales et subtropicales."),
            en = LocalizedContent("How many kinds of palm trees are there?", listOf("500", "1,000", "2,500", "5,000"), "Nature", "There are about 2,500 species of palm trees distributed worldwide, mainly in tropical and subtropical regions."),
            zh = LocalizedContent("世界上有多少种棕榈树？", listOf("500", "1000", "2500", "5000"), "自然", "全世界约有2500种棕榈树，主要分布在热带和亚热带地区。"),
            es = LocalizedContent("¿Cuántos tipos de palmeras existen?", listOf("500", "1000", "2500", "5000"), "Naturaleza", "Existen alrededor de 2500 especies de palmeras distribuidas por todo el mundo, principalmente en regiones tropicales y subtropicales.")
        ),
        BilingualQuestion(
            id = 10588, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut nager le plus vite?", listOf("La baleine", "Le dauphin", "le poisson-voile", "la truite"), "Nature", "Le poisson-voile peut atteindre 110 km/h en nageant, ce qui en fait le poisson le plus rapide du monde, grâce à sa grande nageoire dorsale et son corps fuselé."),
            en = LocalizedContent("Which animal can swim the fastest?", listOf("Whale", "Dolphin", "Sailfish", "Trout"), "Nature", "The sailfish can reach 110 km/h while swimming, making it the fastest fish in the world, thanks to its large dorsal fin and streamlined body."),
            zh = LocalizedContent("哪种动物游泳最快？", listOf("鲸鱼", "海豚", "旗鱼", "鳟鱼"), "自然", "旗鱼游泳速度可达每小时110公里，是世界上速度最快的鱼，这得益于其巨大的背鳍和流线型的身体。"),
            es = LocalizedContent("¿Qué animal puede nadar más rápido?", listOf("La ballena", "El delfín", "El pez vela", "La trucha"), "Naturaleza", "El pez vela puede alcanzar 110 km/h nadando, lo que lo convierte en el pez más rápido del mundo, gracias a su gran aleta dorsal y su cuerpo aerodinámico.")
        ),
        BilingualQuestion(
            id = 10589, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand herbivore du monde?", listOf("L'éléphant", "le giraffe", "L'hippopotame", "le rhinocéros"), "Nature", "Les éléphants, notamment l'éléphant de savane d'Afrique, sont les plus grands herbivores terrestres, consommant jusqu'à 150 kg de végétation par jour."),
            en = LocalizedContent("What is the largest herbivore in the world?", listOf("Elephant", "Giraffe", "Hippopotamus", "Rhinoceros"), "Nature", "Elephants, especially the African bush elephant, are the largest terrestrial herbivores, consuming up to 150 kg of vegetation per day."),
            zh = LocalizedContent("世界上最大的食草动物是什么？", listOf("大象", "长颈鹿", "河马", "犀牛"), "自然", "大象，尤其是非洲草原象，是最大的陆生食草动物，每天消耗多达150公斤的植物。"),
            es = LocalizedContent("¿Cuál es el herbívoro más grande del mundo?", listOf("El elefante", "La jirafa", "El hipopótamo", "El rinoceronte"), "Naturaleza", "Los elefantes, especialmente el elefante africano de sabana, son los herbívoros terrestres más grandes, consumiendo hasta 150 kg de vegetación al día.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10590, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de bactéries existe-t-il?", listOf("100", "1000", "10 000", "1 million"), "Nature", "On estime qu'il existe environ 10 000 espèces de bactéries identifiées, mais le nombre total pourrait être bien plus élevé, car la majorité reste inconnue."),
            en = LocalizedContent("How many species of bacteria are there?", listOf("100", "1000", "10,000", "1 million"), "Nature", "It is estimated that there are about 10,000 identified species of bacteria, but the total number could be much higher, as the majority remain unknown."),
            zh = LocalizedContent("有多少种细菌？", listOf("100", "1000", "10000", "100万"), "自然", "据估计，已识别的细菌种类约有10000种，但总数可能高得多，因为大多数仍未知。"),
            es = LocalizedContent("¿Cuántas especies de bacterias existen?", listOf("100", "1000", "10 000", "1 millón"), "Naturaleza", "Se estima que existen alrededor de 10 000 especies de bacterias identificadas, pero el número total podría ser mucho mayor, ya que la mayoría sigue siendo desconocida.")
        ),
        BilingualQuestion(
            id = 10591, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut sauter le plus haut par rapport à sa taille?", listOf("la sauterelle", "la puce", "le kangourou", "la grenouille"), "Nature", "La puce peut sauter jusqu'à 200 fois sa propre hauteur, ce qui en fait le champion du saut proportionnel dans le règne animal."),
            en = LocalizedContent("Which animal can jump the highest relative to its size?", listOf("grasshopper", "flea", "kangaroo", "frog"), "Nature", "The flea can jump up to 200 times its own height, making it the proportional jumping champion in the animal kingdom."),
            zh = LocalizedContent("哪种动物相对于体型跳得最高？", listOf("蚱蜢", "跳蚤", "袋鼠", "青蛙"), "自然", "跳蚤可以跳到自身高度的200倍，是动物界中比例跳跃冠军。"),
            es = LocalizedContent("¿Qué animal puede saltar más alto en relación a su tamaño?", listOf("el saltamontes", "la pulga", "el canguro", "la rana"), "Naturaleza", "La pulga puede saltar hasta 200 veces su propia altura, lo que la convierte en la campeona del salto proporcional en el reino animal.")
        ),
        BilingualQuestion(
            id = 10592, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand carnivore terrestre?", listOf("le lion", "le tigre", "l'ours brun", "le puma"), "Nature", "L'ours brun, notamment la sous-espèce de l'ours Kodiak, peut peser jusqu'à 700 kg, ce qui en fait le plus grand mammifère terrestre exclusivement carnivore."),
            en = LocalizedContent("What is the largest terrestrial carnivore?", listOf("lion", "tiger", "brown bear", "puma"), "Nature", "The brown bear, especially the Kodiak bear subspecies, can weigh up to 700 kg, making it the largest exclusively carnivorous terrestrial mammal."),
            zh = LocalizedContent("最大的陆生食肉动物是什么？", listOf("狮子", "老虎", "棕熊", "美洲狮"), "自然", "棕熊，尤其是科迪亚克熊亚种，体重可达700公斤，是最大的纯食肉陆生哺乳动物。"),
            es = LocalizedContent("¿Cuál es el mayor carnívoro terrestre?", listOf("el león", "el tigre", "el oso pardo", "el puma"), "Naturaleza", "El oso pardo, especialmente la subespecie del oso Kodiak, puede pesar hasta 700 kg, lo que lo convierte en el mamífero terrestre exclusivamente carnívoro más grande.")
        ),
        BilingualQuestion(
            id = 10593, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de lichens existe-t-il?", listOf("500", "5000", "20 000", "50 000"), "Nature", "Les lichens sont des organismes symbiotiques très diversifiés, avec environ 20 000 espèces recensées dans le monde."),
            en = LocalizedContent("How many species of lichens are there?", listOf("500", "5000", "20,000", "50,000"), "Nature", "Lichens are highly diverse symbiotic organisms, with about 20,000 species recorded worldwide."),
            zh = LocalizedContent("有多少种地衣？", listOf("500", "5000", "20000", "50000"), "自然", "地衣是高度多样化的共生生物，全球约有20000种记录。"),
            es = LocalizedContent("¿Cuántas especies de líquenes existen?", listOf("500", "5000", "20 000", "50 000"), "Naturaleza", "Los líquenes son organismos simbióticos muy diversos, con alrededor de 20 000 especies registradas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 10594, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut voir la plus grande portion du spectre lumineux?", listOf("l'humain", "l'abeille", "le chat", "l'aigle"), "Nature", "Les abeilles perçoivent les ultraviolets, ce qui leur permet de voir une partie du spectre lumineux invisible pour les humains, incluant des motifs sur les fleurs."),
            en = LocalizedContent("Which animal can see the largest portion of the light spectrum?", listOf("human", "bee", "cat", "eagle"), "Nature", "Bees perceive ultraviolet light, allowing them to see a part of the light spectrum invisible to humans, including patterns on flowers."),
            zh = LocalizedContent("哪种动物能看到光谱的最大部分？", listOf("人类", "蜜蜂", "猫", "鹰"), "自然", "蜜蜂能感知紫外线，使它们能看到人类不可见的光谱部分，包括花朵上的图案。"),
            es = LocalizedContent("¿Qué animal puede ver la mayor porción del espectro luminoso?", listOf("el humano", "la abeja", "el gato", "el águila"), "Naturaleza", "Las abejas perciben la luz ultravioleta, lo que les permite ver una parte del espectro luminoso invisible para los humanos, incluyendo patrones en las flores.")
        ),
        BilingualQuestion(
            id = 10595, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écureuil du monde?", listOf("le marmotte", "le polatouche", "le grand écureuil volant", "le tamia"), "Nature", "Le grand écureuil volant, originaire d'Asie du Sud-Est, peut mesurer jusqu'à 1,2 mètre de long, queue comprise, ce qui en fait le plus grand écureuil du monde."),
            en = LocalizedContent("What is the largest squirrel in the world?", listOf("marmot", "flying squirrel", "giant flying squirrel", "chipmunk"), "Nature", "The giant flying squirrel, native to Southeast Asia, can measure up to 1.2 meters in length including its tail, making it the largest squirrel in the world."),
            zh = LocalizedContent("世界上最大的松鼠是什么？", listOf("土拨鼠", "飞鼠", "大飞鼠", "花栗鼠"), "自然", "大飞鼠原产于东南亚，包括尾巴在内体长可达1.2米，是世界上最大的松鼠。"),
            es = LocalizedContent("¿Cuál es la ardilla más grande del mundo?", listOf("la marmota", "la ardilla voladora", "la gran ardilla voladora", "la ardilla listada"), "Naturaleza", "La gran ardilla voladora, originaria del sudeste asiático, puede medir hasta 1,2 metros de largo, incluida la cola, lo que la convierte en la ardilla más grande del mundo.")
        ),
        BilingualQuestion(
            id = 10596, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de mousses existe-t-il?", listOf("500", "5000", "20 000", "30 000"), "Nature", "Il existe environ 30 000 espèces de mousses dans le monde, ce qui en fait le deuxième groupe de plantes terrestres le plus diversifié après les plantes à fleurs."),
            en = LocalizedContent("How many species of mosses are there?", listOf("500", "5000", "20,000", "30,000"), "Nature", "There are about 30,000 species of mosses worldwide, making them the second most diverse group of land plants after flowering plants."),
            zh = LocalizedContent("有多少种苔藓？", listOf("500", "5000", "20000", "30000"), "自然", "全球约有30000种苔藓，是仅次于开花植物的第二大陆地植物类群。"),
            es = LocalizedContent("¿Cuántas especies de musgos existen?", listOf("500", "5000", "20 000", "30 000"), "Naturaleza", "Existen alrededor de 30 000 especies de musgos en el mundo, lo que los convierte en el segundo grupo de plantas terrestres más diverso después de las plantas con flores.")
        ),
        BilingualQuestion(
            id = 10597, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut se reproduire le plus rapidement?", listOf("le lapin", "la mouche", "le saumon", "le hérisson"), "Nature", "La mouche domestique peut pondre jusqu'à 500 œufs en quelques jours, et son cycle de vie complet (de l'œuf à l'adulte) ne prend qu'environ une semaine, ce qui en fait l'animal à la reproduction la plus rapide."),
            en = LocalizedContent("Which animal can reproduce the fastest?", listOf("rabbit", "fly", "salmon", "hedgehog"), "Nature", "The housefly can lay up to 500 eggs in a few days, and its complete life cycle (from egg to adult) takes only about a week, making it the fastest-reproducing animal."),
            zh = LocalizedContent("哪种动物繁殖最快？", listOf("兔子", "苍蝇", "鲑鱼", "刺猬"), "自然", "家蝇几天内可产卵多达500个，其完整生命周期（从卵到成虫）仅需约一周，是繁殖最快的动物。"),
            es = LocalizedContent("¿Qué animal puede reproducirse más rápidamente?", listOf("el conejo", "la mosca", "el salmón", "el erizo"), "Naturaleza", "La mosca doméstica puede poner hasta 500 huevos en pocos días, y su ciclo de vida completo (de huevo a adulto) solo toma aproximadamente una semana, lo que la convierte en el animal de reproducción más rápida.")
        ),
        BilingualQuestion(
            id = 10598, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand édentés du monde?", listOf("le tatou géant", "le paresseux géant", "le fourmilier géant", "le pangolin"), "Nature", "Le paresseux géant, aussi appelé paresseux terrestre, est le plus grand édenté ayant existé, mesurant jusqu'à 6 mètres de long et pesant plusieurs tonnes, contrairement aux paresseux modernes qui sont bien plus petits."),
            en = LocalizedContent("What is the largest edentate in the world?", listOf("giant armadillo", "giant sloth", "giant anteater", "pangolin"), "Nature", "The giant sloth, also called the ground sloth, is the largest edentate that ever existed, measuring up to 6 meters long and weighing several tons, unlike modern sloths which are much smaller."),
            zh = LocalizedContent("世界上最大的贫齿目动物是什么？", listOf("巨犰狳", "大地懒", "大食蚁兽", "穿山甲"), "自然", "大地懒，也称地懒，是存在过的最大的贫齿目动物，体长可达6米，重达数吨，而现代树懒则小得多。"),
            es = LocalizedContent("¿Cuál es el mayor desdentado del mundo?", listOf("el armadillo gigante", "el perezoso gigante", "el oso hormiguero gigante", "el pangolín"), "Naturaleza", "El perezoso gigante, también llamado perezoso terrestre, es el mayor desdentado que haya existido, midiendo hasta 6 metros de largo y pesando varias toneladas, a diferencia de los perezosos modernos que son mucho más pequeños.")
        ),
        BilingualQuestion(
            id = 10599, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de fougères aquatiques existe-t-il?", listOf("10", "50", "200", "500"), "Nature", "Les fougères aquatiques forment un groupe spécifique de plantes vasculaires adaptées aux milieux humides, avec environ 200 espèces réparties dans le monde."),
            en = LocalizedContent("How many species of aquatic ferns are there?", listOf("10", "50", "200", "500"), "Nature", "Aquatic ferns form a specific group of vascular plants adapted to wet environments, with about 200 species distributed worldwide."),
            zh = LocalizedContent("有多少种水生蕨类植物？", listOf("10", "50", "200", "500"), "自然", "水生蕨类植物是适应潮湿环境的维管植物特定类群，全球约有200种。"),
            es = LocalizedContent("¿Cuántas especies de helechos acuáticos existen?", listOf("10", "50", "200", "500"), "Naturaleza", "Los helechos acuáticos forman un grupo específico de plantas vasculares adaptadas a ambientes húmedos, con alrededor de 200 especies distribuidas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 10600, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut se reproduire sans partenaire?", listOf("la bactérie", "le lézard sans queue", "le gecko", "la hyène"), "Nature", "Certains lézards, comme le lézard sans queue, pratiquent la parthénogenèse, une reproduction asexuée où les femelles produisent des œufs fertiles sans mâle."),
            en = LocalizedContent("Which animal can reproduce without a partner?", listOf("bacteria", "whiptail lizard", "gecko", "hyena"), "Nature", "Some lizards, like the whiptail lizard, practice parthenogenesis, a form of asexual reproduction where females produce fertile eggs without males."),
            zh = LocalizedContent("哪种动物可以无性繁殖？", listOf("细菌", "鞭尾蜥蜴", "壁虎", "鬣狗"), "自然", "某些蜥蜴，如鞭尾蜥蜴，进行孤雌生殖，这是一种雌性无需雄性即可产生可育卵子的无性繁殖方式。"),
            es = LocalizedContent("¿Qué animal puede reproducirse sin pareja?", listOf("la bacteria", "el lagarto de cola látigo", "el gecko", "la hiena"), "Naturaleza", "Algunos lagartos, como el lagarto de cola látigo, practican la partenogénesis, una reproducción asexual donde las hembras producen huevos fértiles sin macho.")
        ),
        BilingualQuestion(
            id = 10601, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal le plus dangereux au monde?", listOf("le crocodile", "le requin", "le moustique", "le lion"), "Nature", "Le moustique est considéré comme l'animal le plus dangereux car il transmet des maladies mortelles comme le paludisme, la dengue ou le chikungunya, causant des centaines de milliers de décès chaque année."),
            en = LocalizedContent("What is the most dangerous animal in the world?", listOf("crocodile", "shark", "mosquito", "lion"), "Nature", "The mosquito is considered the most dangerous animal because it transmits deadly diseases like malaria, dengue, and chikungunya, causing hundreds of thousands of deaths each year."),
            zh = LocalizedContent("世界上最危险的动物是什么？", listOf("鳄鱼", "鲨鱼", "蚊子", "狮子"), "自然", "蚊子被认为是最危险的动物，因为它传播疟疾、登革热和基孔肯雅热等致命疾病，每年导致数十万人死亡。"),
            es = LocalizedContent("¿Cuál es el animal más peligroso del mundo?", listOf("el cocodrilo", "el tiburón", "el mosquito", "el león"), "Naturaleza", "El mosquito es considerado el animal más peligroso porque transmite enfermedades mortales como la malaria, el dengue y el chikungunya, causando cientos de miles de muertes cada año.")
        ),
        BilingualQuestion(
            id = 10602, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de dents ont les herbivores?", listOf("0", "12", "24", "32"), "Nature", "Contrairement aux carnivores, les herbivores comme les vaches ou les chevaux possèdent 24 molaires pour broyer les végétaux, sans incisives supérieures."),
            en = LocalizedContent("How many teeth do herbivores have?", listOf("0", "12", "24", "32"), "Nature", "Unlike carnivores, herbivores like cows or horses have 24 molars for grinding plants, with no upper incisors."),
            zh = LocalizedContent("食草动物有多少颗牙齿？", listOf("0", "12", "24", "32"), "自然", "与食肉动物不同，牛或马等食草动物有24颗臼齿用于研磨植物，没有上门牙。"),
            es = LocalizedContent("¿Cuántos dientes tienen los herbívoros?", listOf("0", "12", "24", "32"), "Naturaleza", "A diferencia de los carnívoros, los herbívoros como las vacas o los caballos tienen 24 molares para triturar vegetales, sin incisivos superiores.")
        ),
        BilingualQuestion(
            id = 10603, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal a le meilleur odorat?", listOf("le chien", "le requin", "l'ours", "le serpent"), "Nature", "Le chien possède environ 300 millions de récepteurs olfactifs, contre 5 à 6 millions chez l'humain, ce qui en fait un animal au flair exceptionnel pour la chasse et le pistage."),
            en = LocalizedContent("Which animal has the best sense of smell?", listOf("dog", "shark", "bear", "snake"), "Nature", "Dogs have about 300 million olfactory receptors, compared to 5-6 million in humans, making them exceptional at tracking and hunting by scent."),
            zh = LocalizedContent("哪种动物的嗅觉最好？", listOf("狗", "鲨鱼", "熊", "蛇"), "自然", "狗拥有约3亿个嗅觉受体，而人类只有500-600万个，这使得它们在通过气味追踪和狩猎方面非常出色。"),
            es = LocalizedContent("¿Qué animal tiene el mejor olfato?", listOf("el perro", "el tiburón", "el oso", "la serpiente"), "Naturaleza", "El perro posee unos 300 millones de receptores olfativos, frente a los 5-6 millones en los humanos, lo que lo convierte en un animal excepcional para el rastreo y la caza por el olfato.")
        ),
        BilingualQuestion(
            id = 10604, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand amphibien du monde?", listOf("la salamandre géante du Japon", "la grenouille Goliath", "le triton géant", "la salamandre géante de Chine"), "Nature", "La salamandre géante de Chine peut atteindre près de 1,80 mètre de long, ce qui en fait le plus grand amphibien connu. Elle vit dans les cours d'eau froids de Chine."),
            en = LocalizedContent("What is the largest amphibian in the world?", listOf("Japanese giant salamander", "Goliath frog", "giant newt", "Chinese giant salamander"), "Nature", "The Chinese giant salamander can reach nearly 1.8 meters in length, making it the largest known amphibian. It lives in cold streams in China."),
            zh = LocalizedContent("世界上最大的两栖动物是什么？", listOf("日本大鲵", "歌利亚蛙", "巨型蝾螈", "中国大鲵"), "自然", "中国大鲵可长达近1.8米，是已知最大的两栖动物。它生活在中国寒冷的溪流中。"),
            es = LocalizedContent("¿Cuál es el anfibio más grande del mundo?", listOf("la salamandra gigante japonesa", "la rana Goliat", "el tritón gigante", "la salamandra gigante china"), "Naturaleza", "La salamandra gigante china puede alcanzar casi 1,8 metros de largo, lo que la convierte en el anfibio más grande conocido. Vive en arroyos fríos de China.")
        ),
        BilingualQuestion(
            id = 10605, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps peut-on survivre sans eau?", listOf("quelques heures", "quelques jours", "quelques semaines", "quelques mois"), "Nature", "Le corps humain peut survivre environ trois jours sans eau, car l'eau est essentielle aux fonctions vitales comme la régulation de la température et l'élimination des déchets."),
            en = LocalizedContent("How long can one survive without water?", listOf("a few hours", "a few days", "a few weeks", "a few months"), "Nature", "The human body can survive about three days without water, as water is essential for vital functions like temperature regulation and waste elimination."),
            zh = LocalizedContent("没有水人能存活多久？", listOf("几小时", "几天", "几周", "几个月"), "自然", "人体在没有水的情况下大约能存活三天，因为水对于体温调节和废物排出等生命功能至关重要。"),
            es = LocalizedContent("¿Cuánto tiempo se puede sobrevivir sin agua?", listOf("unas horas", "unos días", "unas semanas", "unos meses"), "Naturaleza", "El cuerpo humano puede sobrevivir unos tres días sin agua, ya que el agua es esencial para funciones vitales como la regulación de la temperatura y la eliminación de desechos.")
        ),
        BilingualQuestion(
            id = 10606, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand prédateur d'Afrique?", listOf("le lion", "la hyène", "le léopard", "l'aigle martial"), "Nature", "Le lion est considéré comme le plus grand prédateur terrestre d'Afrique, dominant la chaîne alimentaire dans les savanes et les prairies."),
            en = LocalizedContent("What is the largest predator in Africa?", listOf("lion", "hyena", "leopard", "martial eagle"), "Nature", "The lion is considered the largest terrestrial predator in Africa, dominating the food chain in savannas and grasslands."),
            zh = LocalizedContent("非洲最大的捕食者是什么？", listOf("狮子", "鬣狗", "豹子", "猛雕"), "自然", "狮子被认为是非洲最大的陆地捕食者，在稀树草原和草原上占据食物链顶端。"),
            es = LocalizedContent("¿Cuál es el mayor depredador de África?", listOf("el león", "la hiena", "el leopardo", "el águila marcial"), "Naturaleza", "El león es considerado el mayor depredador terrestre de África, dominando la cadena alimentaria en las sabanas y praderas.")
        ),
        BilingualQuestion(
            id = 10607, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de gaz existe-t-il dans l'atmosphère?", listOf("2", "5", "10", "Plus de 15"), "Nature", "L'atmosphère terrestre est un mélange complexe contenant plus de 15 gaz différents, dont l'azote (78%) et l'oxygène (21%) sont majoritaires, mais aussi de nombreux gaz rares comme l'argon, le néon ou le xénon."),
            en = LocalizedContent("How many kinds of gases are there in the atmosphere?", listOf("2", "5", "10", "More than 15"), "Nature", "Earth's atmosphere is a complex mixture containing more than 15 different gases, with nitrogen (78%) and oxygen (21%) being the majority, along with many rare gases like argon, neon, and xenon."),
            zh = LocalizedContent("大气中有多少种气体？", listOf("2", "5", "10", "超过15种"), "自然", "地球大气是一个复杂的混合物，包含超过15种不同的气体，其中氮气（78%）和氧气（21%）占主导，还有氩、氖、氙等多种稀有气体。"),
            es = LocalizedContent("¿Cuántos tipos de gases hay en la atmósfera?", listOf("2", "5", "10", "Más de 15"), "Naturaleza", "La atmósfera terrestre es una mezcla compleja que contiene más de 15 gases diferentes, siendo el nitrógeno (78%) y el oxígeno (21%) mayoritarios, junto con muchos gases raros como argón, neón o xenón.")
        ),
        BilingualQuestion(
            id = 10608, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal a le plus d'os dans son corps?", listOf("l'humain", "le serpent", "le poisson", "l'oiseau"), "Nature", "Les poissons possèdent un squelette composé de nombreuses vertèbres et arêtes, ce qui leur donne souvent plus d'os que les mammifères ou les oiseaux."),
            en = LocalizedContent("Which animal has the most bones in its body?", listOf("human", "snake", "fish", "bird"), "Nature", "Fish have a skeleton composed of many vertebrae and ribs, often giving them more bones than mammals or birds."),
            zh = LocalizedContent("哪种动物体内的骨头最多？", listOf("人类", "蛇", "鱼", "鸟"), "自然", "鱼的骨骼由许多椎骨和肋骨组成，通常比哺乳动物或鸟类拥有更多的骨头。"),
            es = LocalizedContent("¿Qué animal tiene más huesos en su cuerpo?", listOf("el humano", "la serpiente", "el pez", "el ave"), "Naturaleza", "Los peces poseen un esqueleto compuesto por muchas vértebras y espinas, lo que a menudo les da más huesos que los mamíferos o las aves.")
        ),
        BilingualQuestion(
            id = 10609, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand rongeur d'Afrique?", listOf("le porc-épic", "le hérisson", "le cavy", "le castor"), "Nature", "Le porc-épic d'Afrique peut peser jusqu'à 30 kg, ce qui en fait le plus grand rongeur du continent, devant le rat géant."),
            en = LocalizedContent("What is the largest rodent in Africa?", listOf("porcupine", "hedgehog", "cavy", "beaver"), "Nature", "The African porcupine can weigh up to 30 kg, making it the largest rodent on the continent, ahead of the giant rat."),
            zh = LocalizedContent("非洲最大的啮齿动物是什么？", listOf("豪猪", "刺猬", "豚鼠", "河狸"), "自然", "非洲豪猪体重可达30公斤，是非洲大陆最大的啮齿动物，超过巨鼠。"),
            es = LocalizedContent("¿Cuál es el roedor más grande de África?", listOf("el puercoespín", "el erizo", "el cobayo", "el castor"), "Naturaleza", "El puercoespín africano puede pesar hasta 30 kg, lo que lo convierte en el roedor más grande del continente, por delante de la rata gigante.")
        ),
        BilingualQuestion(
            id = 10610, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps un arbre peut-il vivre?", listOf("100 ans", "500 ans", "5000 ans", "10 000 ans"), "Nature", "Le plus vieil arbre connu, un épicéa en Suède nommé Old Tjikko, a environ 9 500 ans. Certains pins bristlecone aux États-Unis dépassent 5 000 ans."),
            en = LocalizedContent("How long can a tree live?", listOf("100 years", "500 years", "5000 years", "10,000 years"), "Nature", "The oldest known tree, a spruce in Sweden named Old Tjikko, is about 9,500 years old. Some bristlecone pines in the United States exceed 5,000 years."),
            zh = LocalizedContent("一棵树能活多久？", listOf("100年", "500年", "5000年", "10000年"), "自然", "已知最古老的树是瑞典的一棵名为Old Tjikko的云杉，大约有9500年历史。美国的一些狐尾松树龄超过5000年。"),
            es = LocalizedContent("¿Cuánto tiempo puede vivir un árbol?", listOf("100 años", "500 años", "5000 años", "10 000 años"), "Naturaleza", "El árbol más antiguo conocido, un abeto en Suecia llamado Old Tjikko, tiene unos 9.500 años. Algunos pinos bristlecone en Estados Unidos superan los 5.000 años.")
        ),
        BilingualQuestion(
            id = 10611, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal peut voir dans le noir?", listOf("le chat", "la chouette", "le chat et la chouette", "le requin"), "Nature", "Les chats et les chouettes possèdent une vision nocturne très développée grâce à un tapis réflecteur dans leurs yeux, qui amplifie la lumière disponible."),
            en = LocalizedContent("Which animal can see in the dark?", listOf("the cat", "the owl", "the cat and the owl", "the shark"), "Nature", "Cats and owls have highly developed night vision thanks to a reflective layer in their eyes called the tapetum lucidum, which amplifies available light."),
            zh = LocalizedContent("哪种动物能在黑暗中看见东西？", listOf("猫", "猫头鹰", "猫和猫头鹰", "鲨鱼"), "自然", "猫和猫头鹰的眼睛中有一层反光膜（照膜），能放大可用光线，因此具有高度发达的夜视能力。"),
            es = LocalizedContent("¿Qué animal puede ver en la oscuridad?", listOf("el gato", "el búho", "el gato y el búho", "el tiburón"), "Naturaleza", "Los gatos y los búhos poseen una visión nocturna muy desarrollada gracias a una capa reflectante en sus ojos llamada tapetum lucidum, que amplifica la luz disponible.")
        ),
        BilingualQuestion(
            id = 10612, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert de glace du monde?", listOf("l'Antarctique", "l'Arctique", "le Groenland", "la Sibérie"), "Nature", "L'Antarctique est considéré comme le plus grand désert de glace car il s'agit d'un désert polaire recevant très peu de précipitations, avec une calotte glaciaire couvrant 98% de sa surface."),
            en = LocalizedContent("What is the largest ice desert in the world?", listOf("Antarctica", "the Arctic", "Greenland", "Siberia"), "Nature", "Antarctica is considered the largest ice desert because it is a polar desert receiving very little precipitation, with an ice sheet covering 98% of its surface."),
            zh = LocalizedContent("世界上最大的冰沙漠是什么？", listOf("南极洲", "北极", "格陵兰", "西伯利亚"), "自然", "南极洲被认为是最大的冰沙漠，因为它是一个极地沙漠，降水量极少，冰盖覆盖了其98%的表面。"),
            es = LocalizedContent("¿Cuál es el mayor desierto de hielo del mundo?", listOf("la Antártida", "el Ártico", "Groenlandia", "Siberia"), "Naturaleza", "La Antártida es considerada el mayor desierto de hielo porque es un desierto polar que recibe muy poca precipitación, con una capa de hielo que cubre el 98% de su superficie.")
        ),
        BilingualQuestion(
            id = 10613, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de dinosaures existaient-elles?", listOf("100", "500", "1000", "Plus de 900"), "Nature", "Plus de 900 espèces de dinosaures ont été scientifiquement décrites à partir de fossiles, mais le nombre réel ayant existé est probablement bien plus élevé, car de nombreuses espèces n'ont pas laissé de traces."),
            en = LocalizedContent("How many kinds of dinosaurs existed?", listOf("100", "500", "1000", "Over 900"), "Nature", "More than 900 species of dinosaurs have been scientifically described from fossils, but the actual number that existed is likely much higher, as many species left no trace."),
            zh = LocalizedContent("有多少种恐龙存在过？", listOf("100", "500", "1000", "超过900"), "自然", "已有超过900种恐龙通过化石被科学描述，但实际存在的数量可能更高，因为许多物种没有留下痕迹。"),
            es = LocalizedContent("¿Cuántos tipos de dinosaurios existieron?", listOf("100", "500", "1000", "Más de 900"), "Naturaleza", "Más de 900 especies de dinosaurios han sido descritas científicamente a partir de fósiles, pero el número real que existió es probablemente mucho mayor, ya que muchas especies no dejaron rastro.")
        ),
        BilingualQuestion(
            id = 10614, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut dormir pendant des années?", listOf("l'ours", "la tortue", "l'escargot", "le crocodile"), "Nature", "L'escargot peut hiberner ou entrer en estivation pendant plusieurs années si les conditions environnementales sont défavorables, comme la sécheresse ou le froid."),
            en = LocalizedContent("Which animal can sleep for years?", listOf("the bear", "the turtle", "the snail", "the crocodile"), "Nature", "Snails can hibernate or estivate for several years if environmental conditions are unfavorable, such as drought or cold."),
            zh = LocalizedContent("哪种动物能睡上好几年？", listOf("熊", "乌龟", "蜗牛", "鳄鱼"), "自然", "蜗牛可以在环境条件不利（如干旱或寒冷）时冬眠或夏眠数年。"),
            es = LocalizedContent("¿Qué animal puede dormir durante años?", listOf("el oso", "la tortuga", "el caracol", "el cocodrilo"), "Naturaleza", "El caracol puede hibernar o estivar durante varios años si las condiciones ambientales son desfavorables, como sequía o frío.")
        ),
        BilingualQuestion(
            id = 10615, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand volcán du monde?", listOf("le Sakura-jima", "le Mauna Loa", "l'Etna", "le Krakatoa"), "Nature", "Le Mauna Loa, à Hawaï, est le plus grand volcan du monde en volume et en superficie, s'élevant à plus de 9 000 mètres depuis le plancher océanique."),
            en = LocalizedContent("What is the largest volcano in the world?", listOf("Sakurajima", "Mauna Loa", "Mount Etna", "Krakatoa"), "Nature", "Mauna Loa in Hawaii is the largest volcano in the world by volume and area, rising over 9,000 meters from the ocean floor."),
            zh = LocalizedContent("世界上最大的火山是什么？", listOf("樱岛火山", "莫纳罗亚火山", "埃特纳火山", "喀拉喀托火山"), "自然", "夏威夷的莫纳罗亚火山是世界上体积和面积最大的火山，从海底升起超过9000米。"),
            es = LocalizedContent("¿Cuál es el volcán más grande del mundo?", listOf("el Sakurajima", "el Mauna Loa", "el Etna", "el Krakatoa"), "Naturaleza", "El Mauna Loa, en Hawái, es el volcán más grande del mundo en volumen y superficie, elevándose más de 9.000 metros desde el fondo oceánico.")
        ),
        BilingualQuestion(
            id = 10616, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de tempo cardiaque a une baleine?", listOf("10-20 bpm", "40-60 bpm", "80-100 bpm", "120+ bpm"), "Nature", "Le rythme cardiaque des baleines est très lent, entre 10 et 20 battements par minute, car leur métabolisme est adapté à la plongée profonde et à la conservation d'oxygène."),
            en = LocalizedContent("What is the heart rate of a whale?", listOf("10-20 bpm", "40-60 bpm", "80-100 bpm", "120+ bpm"), "Nature", "Whales have a very slow heart rate, between 10 and 20 beats per minute, as their metabolism is adapted for deep diving and oxygen conservation."),
            zh = LocalizedContent("鲸的心率是多少？", listOf("10-20次/分钟", "40-60次/分钟", "80-100次/分钟", "120次以上/分钟"), "自然", "鲸的心率非常慢，每分钟10到20次，因为它们的新陈代谢适应了深潜和氧气保存。"),
            es = LocalizedContent("¿Cuál es la frecuencia cardíaca de una ballena?", listOf("10-20 lpm", "40-60 lpm", "80-100 lpm", "120+ lpm"), "Naturaleza", "Las ballenas tienen un ritmo cardíaco muy lento, entre 10 y 20 latidos por minuto, ya que su metabolismo está adaptado al buceo profundo y la conservación de oxígeno.")
        ),
        BilingualQuestion(
            id = 10617, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut vivre dans le plus d'altitudes différentes?", listOf("le puma", "le mouton", "l'aigle", "la chèvre"), "Nature", "Les chèvres sont capables de s'adapter à une large gamme d'altitudes, des plaines jusqu'à plus de 5 000 mètres dans l'Himalaya, grâce à leur physiologie robuste et leur agilité."),
            en = LocalizedContent("Which animal can live at the most different altitudes?", listOf("the puma", "the sheep", "the eagle", "the goat"), "Nature", "Goats are able to adapt to a wide range of altitudes, from plains to over 5,000 meters in the Himalayas, thanks to their robust physiology and agility."),
            zh = LocalizedContent("哪种动物能生活在最多不同的海拔高度？", listOf("美洲狮", "绵羊", "鹰", "山羊"), "自然", "山羊能够适应广泛的海拔范围，从平原到喜马拉雅山5000米以上，得益于其强健的生理机能和敏捷性。"),
            es = LocalizedContent("¿Qué animal puede vivir en la mayor variedad de altitudes?", listOf("el puma", "la oveja", "el águila", "la cabra"), "Naturaleza", "Las cabras son capaces de adaptarse a una amplia gama de altitudes, desde llanuras hasta más de 5.000 metros en el Himalaya, gracias a su robusta fisiología y agilidad.")
        ),
        BilingualQuestion(
            id = 10618, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand groupe d'îles du monde?", listOf("l'Indonésie", "l'Archipel du Japon", "les Philippines", "les Antilles"), "Nature", "L'Indonésie est le plus grand archipel du monde avec plus de 17 000 îles, dont les plus célèbres sont Java, Sumatra et Bornéo."),
            en = LocalizedContent("What is the largest group of islands in the world?", listOf("Indonesia", "the Japanese Archipelago", "the Philippines", "the Antilles"), "Nature", "Indonesia is the largest archipelago in the world with over 17,000 islands, the most famous being Java, Sumatra, and Borneo."),
            zh = LocalizedContent("世界上最大的群岛是什么？", listOf("印度尼西亚", "日本列岛", "菲律宾", "安的列斯群岛"), "自然", "印度尼西亚是世界上最大的群岛，拥有超过17000个岛屿，其中最著名的是爪哇岛、苏门答腊岛和婆罗洲。"),
            es = LocalizedContent("¿Cuál es el grupo de islas más grande del mundo?", listOf("Indonesia", "el Archipiélago Japonés", "Filipinas", "las Antillas"), "Naturaleza", "Indonesia es el archipiélago más grande del mundo con más de 17.000 islas, las más famosas son Java, Sumatra y Borneo.")
        ),
        BilingualQuestion(
            id = 10619, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de baleines existe-t-il?", listOf("5", "20", "90", "150"), "Nature", "Il existe environ 90 espèces de cétacés, un groupe qui inclut les baleines, les dauphins et les marsouins, classés en deux sous-ordres : les mysticètes (baleines à fanons) et les odontocètes (baleines à dents)."),
            en = LocalizedContent("How many kinds of whales are there?", listOf("5", "20", "90", "150"), "Nature", "There are about 90 species of cetaceans, a group that includes whales, dolphins, and porpoises, classified into two suborders: mysticetes (baleen whales) and odontocetes (toothed whales)."),
            zh = LocalizedContent("有多少种鲸？", listOf("5", "20", "90", "150"), "自然", "大约有90种鲸类动物，包括鲸、海豚和鼠海豚，分为两个亚目：须鲸亚目（有鲸须的鲸）和齿鲸亚目（有牙齿的鲸）。"),
            es = LocalizedContent("¿Cuántos tipos de ballenas existen?", listOf("5", "20", "90", "150"), "Naturaleza", "Existen alrededor de 90 especies de cetáceos, un grupo que incluye ballenas, delfines y marsopas, clasificados en dos subórdenes: misticetos (ballenas con barbas) y odontocetos (ballenas con dientes).")
        ),
        BilingualQuestion(
            id = 10620, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut produire le plus de lait?", listOf("la vache", "la baleine", "la chèvre", "la brebis"), "Nature", "La baleine bleue, le plus grand animal du monde, produit jusqu'à 200 litres de lait par jour pour nourrir son baleineau, ce qui dépasse largement la production des vaches laitières."),
            en = LocalizedContent("Which animal can produce the most milk?", listOf("cow", "whale", "goat", "sheep"), "Nature", "The blue whale, the largest animal in the world, produces up to 200 liters of milk per day to feed its calf, far exceeding the production of dairy cows."),
            zh = LocalizedContent("哪种动物产奶最多？", listOf("奶牛", "鲸鱼", "山羊", "绵羊"), "自然", "蓝鲸是世界上最大的动物，每天产奶量高达200升，远超奶牛。"),
            es = LocalizedContent("¿Qué animal puede producir más leche?", listOf("la vaca", "la ballena", "la cabra", "la oveja"), "Naturaleza", "La ballena azul, el animal más grande del mundo, produce hasta 200 litros de leche al día para alimentar a su cría, superando con creces la producción de las vacas lecheras.")
        ),
        BilingualQuestion(
            id = 10621, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus long réseau fluvial du monde?", listOf("le Nil", "l'Amazone", "le Yangzi", "le Mississippi"), "Nature", "Le Nil s'étend sur environ 6 650 kilomètres, traversant onze pays d'Afrique, ce qui en fait le plus long fleuve du monde, devant l'Amazone."),
            en = LocalizedContent("What is the longest river system in the world?", listOf("the Nile", "the Amazon", "the Yangtze", "the Mississippi"), "Nature", "The Nile stretches about 6,650 kilometers, crossing eleven African countries, making it the longest river in the world, ahead of the Amazon."),
            zh = LocalizedContent("世界上最长的河流系统是什么？", listOf("尼罗河", "亚马逊河", "长江", "密西西比河"), "自然", "尼罗河全长约6650公里，流经11个非洲国家，是世界上最长的河流，超过亚马逊河。"),
            es = LocalizedContent("¿Cuál es la red fluvial más larga del mundo?", listOf("el Nilo", "el Amazonas", "el Yangtsé", "el Misisipi"), "Naturaleza", "El Nilo se extiende aproximadamente 6.650 kilómetros, atravesando once países de África, lo que lo convierte en el río más largo del mundo, por delante del Amazonas.")
        ),
        BilingualQuestion(
            id = 10622, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de loups existe-t-il?", listOf("2", "5", "10", "20"), "Nature", "La classification scientifique actuelle reconnaît environ 10 espèces de loups, incluant le loup gris, le loup roux et le loup d'Abyssinie."),
            en = LocalizedContent("How many species of wolves are there?", listOf("2", "5", "10", "20"), "Nature", "Current scientific classification recognizes about 10 species of wolves, including the gray wolf, red wolf, and Abyssinian wolf."),
            zh = LocalizedContent("有多少种狼？", listOf("2", "5", "10", "20"), "自然", "目前的科学分类认为约有10种狼，包括灰狼、红狼和埃塞俄比亚狼。"),
            es = LocalizedContent("¿Cuántas especies de lobos existen?", listOf("2", "5", "10", "20"), "Naturaleza", "La clasificación científica actual reconoce alrededor de 10 especies de lobos, incluyendo el lobo gris, el lobo rojo y el lobo de Abisinia.")
        ),
        BilingualQuestion(
            id = 10623, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut produire du poison mais n'est pas un serpent?", listOf("la grenouille", "le poisson-globe", "le papillon", "l'insecte"), "Nature", "Certaines espèces de papillons, comme le papillon monarque, accumulent des toxines issues des plantes qu'ils consomment au stade chenille, ce qui les rend toxiques pour leurs prédateurs."),
            en = LocalizedContent("Which animal can produce poison but is not a snake?", listOf("frog", "pufferfish", "butterfly", "insect"), "Nature", "Some species of butterflies, like the monarch butterfly, accumulate toxins from the plants they consume as caterpillars, making them toxic to predators."),
            zh = LocalizedContent("哪种动物能产生毒液但不是蛇？", listOf("青蛙", "河豚", "蝴蝶", "昆虫"), "自然", "某些蝴蝶物种，如帝王蝶，在幼虫阶段从所食植物中积累毒素，使其对捕食者有毒。"),
            es = LocalizedContent("¿Qué animal puede producir veneno pero no es una serpiente?", listOf("la rana", "el pez globo", "la mariposa", "el insecto"), "Naturaleza", "Algunas especies de mariposas, como la mariposa monarca, acumulan toxinas de las plantas que consumen en estado de oruga, lo que las hace tóxicas para sus depredadores.")
        ),
        BilingualQuestion(
            id = 10624, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cristal naturel du monde?", listOf("le cristal de sélénite", "le cristal de quartz", "le cristal de diamant", "le cristal de calcite"), "Nature", "Le plus grand cristal naturel du monde est un cristal de sélénite, découvert dans la grotte des Cristaux de Naica, au Mexique, mesurant jusqu'à 12 mètres de long."),
            en = LocalizedContent("What is the largest natural crystal in the world?", listOf("selenite crystal", "quartz crystal", "diamond crystal", "calcite crystal"), "Nature", "The largest natural crystal in the world is a selenite crystal, discovered in the Cave of the Crystals in Naica, Mexico, measuring up to 12 meters in length."),
            zh = LocalizedContent("世界上最大的天然晶体是什么？", listOf("透石膏晶体", "石英晶体", "钻石晶体", "方解石晶体"), "自然", "世界上最大的天然晶体是透石膏晶体，发现于墨西哥奈卡的水晶洞中，长度可达12米。"),
            es = LocalizedContent("¿Cuál es el cristal natural más grande del mundo?", listOf("el cristal de selenita", "el cristal de cuarzo", "el cristal de diamante", "el cristal de calcita"), "Naturaleza", "El cristal natural más grande del mundo es un cristal de selenita, descubierto en la Cueva de los Cristales de Naica, México, que mide hasta 12 metros de largo.")
        ),
        BilingualQuestion(
            id = 10625, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'antilopes existe-t-il?", listOf("10", "50", "100", "200"), "Nature", "Le terme \"antilope\" regroupe environ 200 espèces de mammifères ruminants de la famille des bovidés, principalement présentes en Afrique et en Asie."),
            en = LocalizedContent("How many species of antelopes are there?", listOf("10", "50", "100", "200"), "Nature", "The term 'antelope' encompasses about 200 species of ruminant mammals in the family Bovidae, mainly found in Africa and Asia."),
            zh = LocalizedContent("有多少种羚羊？", listOf("10", "50", "100", "200"), "自然", "“羚羊”一词涵盖约200种牛科反刍哺乳动物，主要分布在非洲和亚洲。"),
            es = LocalizedContent("¿Cuántas especies de antílopes existen?", listOf("10", "50", "100", "200"), "Naturaleza", "El término 'antílope' agrupa alrededor de 200 especies de mamíferos rumiantes de la familia de los bóvidos, principalmente presentes en África y Asia.")
        ),
        BilingualQuestion(
            id = 10626, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal peut parler le mieux?", listOf("le perroquet", "le corbeau", "le dauphin", "le chimpanzé"), "Nature", "Les perroquets possèdent un organe vocal appelé syrinx et une langue épaisse qui leur permet d'imiter la parole humaine avec une grande précision."),
            en = LocalizedContent("Which animal can talk the best?", listOf("parrot", "crow", "dolphin", "chimpanzee"), "Nature", "Parrots have a vocal organ called the syrinx and a thick tongue that allows them to imitate human speech with great accuracy."),
            zh = LocalizedContent("哪种动物最会说话？", listOf("鹦鹉", "乌鸦", "海豚", "黑猩猩"), "自然", "鹦鹉拥有称为鸣管的发声器官和厚实的舌头，能够高度准确地模仿人类语言。"),
            es = LocalizedContent("¿Qué animal puede hablar mejor?", listOf("el loro", "el cuervo", "el delfín", "el chimpancé"), "Naturaleza", "Los loros poseen un órgano vocal llamado siringe y una lengua gruesa que les permite imitar el habla humana con gran precisión.")
        ),
        BilingualQuestion(
            id = 10627, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand marais du monde?", listOf("le Pantanal", "les Everglades", "le Haut-Paraná", "le Danube"), "Nature", "Le Pantanal, situé principalement au Brésil, est la plus grande zone humide du monde, s'étendant sur environ 150 000 km². Il dépasse le marais du Okavango en Afrique et les Everglades en Floride."),
            en = LocalizedContent("What is the largest swamp in the world?", listOf("the Pantanal", "the Everglades", "the Upper Paraná", "the Danube"), "Nature", "The Pantanal, located mainly in Brazil, is the largest wetland in the world, covering about 150,000 km². It surpasses the Okavango Delta in Africa and the Everglades in Florida."),
            zh = LocalizedContent("世界上最大的沼泽是什么？", listOf("潘塔纳尔湿地", "大沼泽地", "上巴拉那河", "多瑙河"), "自然", "潘塔纳尔湿地主要位于巴西，是世界上最大的湿地，面积约15万平方公里，超过非洲的奥卡万戈三角洲和佛罗里达的大沼泽地。"),
            es = LocalizedContent("¿Cuál es el pantanal más grande del mundo?", listOf("el Pantanal", "los Everglades", "el Alto Paraná", "el Danubio"), "Naturaleza", "El Pantanal, ubicado principalmente en Brasil, es la zona húmeda más grande del mundo, con una extensión de aproximadamente 150.000 km². Supera al delta del Okavango en África y a los Everglades en Florida.")
        ),
        BilingualQuestion(
            id = 10628, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de salamandres existe-t-il?", listOf("100", "300", "600", "1000"), "Nature", "Les salamandres forment une famille d'amphibiens qui compte environ 1000 espèces différentes à travers le monde, principalement dans les régions tempérées de l'hémisphère nord."),
            en = LocalizedContent("How many species of salamanders are there?", listOf("100", "300", "600", "1000"), "Nature", "Salamanders form a family of amphibians that includes about 1000 different species worldwide, mainly in temperate regions of the Northern Hemisphere."),
            zh = LocalizedContent("有多少种蝾螈？", listOf("100", "300", "600", "1000"), "自然", "蝾螈是一类两栖动物，全球约有1000种，主要分布在北半球的温带地区。"),
            es = LocalizedContent("¿Cuántas especies de salamandras existen?", listOf("100", "300", "600", "1000"), "Naturaleza", "Las salamandras forman una familia de anfibios que cuenta con alrededor de 1000 especies diferentes en todo el mundo, principalmente en las regiones templadas del hemisferio norte.")
        ),
        BilingualQuestion(
            id = 10629, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut produire du miel mais n'est pas une abeille?", listOf("la guêpe", "le bourdon", "la fourmi", "la mouche"), "Nature", "Certaines espèces de fourmis, comme les fourmis à miel, stockent du nectar dans leur abdomen pour nourrir la colonie, produisant ainsi une substance sucrée comparable au miel."),
            en = LocalizedContent("Which animal can produce honey but is not a bee?", listOf("wasp", "bumblebee", "ant", "fly"), "Nature", "Some species of ants, such as honey ants, store nectar in their abdomens to feed the colony, producing a sweet substance comparable to honey."),
            zh = LocalizedContent("哪种动物能产蜜但不是蜜蜂？", listOf("黄蜂", "熊蜂", "蚂蚁", "苍蝇"), "自然", "某些蚂蚁物种，如蜜蚁，将花蜜储存在腹部以喂养蚁群，产生一种类似蜂蜜的甜味物质。"),
            es = LocalizedContent("¿Qué animal puede producir miel pero no es una abeja?", listOf("la avispa", "el abejorro", "la hormiga", "la mosca"), "Naturaleza", "Algunas especies de hormigas, como las hormigas mieleras, almacenan néctar en su abdomen para alimentar a la colonia, produciendo una sustancia dulce comparable a la miel.")
        ),
        BilingualQuestion(
            id = 10630, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand tremblement de terre jamais enregistré?", listOf("8.0", "8.5", "9.0", "9.5"), "Nature", "Le tremblement de terre de Valdivia au Chili en 1960 a atteint une magnitude de 9,5 sur l'échelle de Richter, ce qui en fait le plus puissant jamais enregistré par des instruments sismologiques."),
            en = LocalizedContent("What is the largest earthquake ever recorded?", listOf("8.0", "8.5", "9.0", "9.5"), "Nature", "The Valdivia earthquake in Chile in 1960 reached a magnitude of 9.5 on the Richter scale, making it the most powerful ever recorded by seismological instruments."),
            zh = LocalizedContent("有记录以来最大的地震是哪一次？", listOf("8.0", "8.5", "9.0", "9.5"), "自然", "1960年智利瓦尔迪维亚地震达到了里氏9.5级，是地震仪记录到的最强地震。"),
            es = LocalizedContent("¿Cuál es el terremoto más grande jamás registrado?", listOf("8.0", "8.5", "9.0", "9.5"), "Naturaleza", "El terremoto de Valdivia en Chile en 1960 alcanzó una magnitud de 9.5 en la escala de Richter, lo que lo convierte en el más potente jamás registrado por instrumentos sismológicos.")
        ),
        BilingualQuestion(
            id = 10631, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes existe-t-il?", listOf("100", "500", "2000", "3000"), "Nature", "On recense environ 3000 espèces de crevettes dans le monde, réparties dans les eaux marines et douces."),
            en = LocalizedContent("How many species of shrimp are there?", listOf("100", "500", "2000", "3000"), "Nature", "There are approximately 3000 species of shrimp worldwide, distributed in marine and freshwater environments."),
            zh = LocalizedContent("世界上有多少种虾？", listOf("100", "500", "2000", "3000"), "自然", "全球约有3000种虾，分布在海洋和淡水环境中。"),
            es = LocalizedContent("¿Cuántas especies de camarones existen?", listOf("100", "500", "2000", "3000"), "Naturaleza", "Existen aproximadamente 3000 especies de camarones en el mundo, distribuidas en aguas marinas y dulces.")
        ),
        BilingualQuestion(
            id = 10632, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut changer de sexe?", listOf("le poisson-clown", "le mérou", "le poisson perroquet", "Tous les poissons"), "Nature", "De nombreux poissons, comme les mérous ou les poissons-clowns, sont hermaphrodites séquentiels et peuvent changer de sexe au cours de leur vie, souvent en fonction de la structure sociale ou de la taille."),
            en = LocalizedContent("Which animal can change sex?", listOf("clownfish", "grouper", "parrotfish", "All fish"), "Nature", "Many fish, such as groupers and clownfish, are sequential hermaphrodites and can change sex during their lives, often depending on social structure or size."),
            zh = LocalizedContent("哪种动物可以改变性别？", listOf("小丑鱼", "石斑鱼", "鹦嘴鱼", "所有鱼类"), "自然", "许多鱼类，如石斑鱼和小丑鱼，是顺序性雌雄同体，可以在生命周期中改变性别，通常取决于社会结构或体型。"),
            es = LocalizedContent("¿Qué animal puede cambiar de sexo?", listOf("el pez payaso", "el mero", "el pez loro", "Todos los peces"), "Naturaleza", "Muchos peces, como los meros y los peces payaso, son hermafroditas secuenciales y pueden cambiar de sexo durante su vida, a menudo según la estructura social o el tamaño.")
        ),
        BilingualQuestion(
            id = 10633, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand récif de corail du monde?", listOf("la Grande Barrière de Corail", "le récif de Belize", "le récif de Mésoamérique", "le récif de Caraïbes"), "Nature", "La Grande Barrière de Corail, située au large de l'Australie, s'étend sur plus de 2 300 kilomètres et est visible depuis l'espace."),
            en = LocalizedContent("What is the largest coral reef in the world?", listOf("the Great Barrier Reef", "the Belize Barrier Reef", "the Mesoamerican Barrier Reef", "the Caribbean Reef"), "Nature", "The Great Barrier Reef, located off the coast of Australia, stretches over 2,300 kilometers and is visible from space."),
            zh = LocalizedContent("世界上最大的珊瑚礁是什么？", listOf("大堡礁", "伯利兹堡礁", "中美洲堡礁", "加勒比海礁"), "自然", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，从太空中可见。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande del mundo?", listOf("la Gran Barrera de Coral", "el arrecife de Belice", "el arrecife mesoamericano", "el arrecife del Caribe"), "Naturaleza", "La Gran Barrera de Coral, situada frente a la costa de Australia, se extiende por más de 2.300 kilómetros y es visible desde el espacio.")
        ),
        BilingualQuestion(
            id = 10634, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de mousques existe-t-il?", listOf("10", "100", "3500", "5000"), "Nature", "Il existe environ 3500 espèces de mousses dans le monde, un groupe de plantes non vasculaires qui poussent dans des environnements humides et ombragés."),
            en = LocalizedContent("How many species of moss are there?", listOf("10", "100", "3500", "5000"), "Nature", "There are approximately 3500 species of moss in the world, a group of non-vascular plants that grow in humid and shaded environments."),
            zh = LocalizedContent("世界上有多少种苔藓？", listOf("10", "100", "3500", "5000"), "自然", "全球约有3500种苔藓，这是一类生长在潮湿阴凉环境中的非维管植物。"),
            es = LocalizedContent("¿Cuántas especies de musgo existen?", listOf("10", "100", "3500", "5000"), "Naturaleza", "Existen aproximadamente 3500 especies de musgo en el mundo, un grupo de plantas no vasculares que crecen en ambientes húmedos y sombreados.")
        ),
        BilingualQuestion(
            id = 10635, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut produire du soie?", listOf("l'araignée", "la chenille", "la mouche", "le papillon"), "Nature", "La soie est produite par la chenille du ver à soie (Bombyx mori) qui tisse un cocon pour se protéger lors de sa métamorphose."),
            en = LocalizedContent("Which animal can produce silk?", listOf("spider", "caterpillar", "fly", "butterfly"), "Nature", "Silk is produced by the caterpillar of the silkworm (Bombyx mori), which weaves a cocoon to protect itself during metamorphosis."),
            zh = LocalizedContent("哪种动物可以产丝？", listOf("蜘蛛", "毛毛虫", "苍蝇", "蝴蝶"), "自然", "丝是由蚕（家蚕）的幼虫产生的，它编织茧来保护自己在变态过程中的安全。"),
            es = LocalizedContent("¿Qué animal puede producir seda?", listOf("la araña", "la oruga", "la mosca", "la mariposa"), "Naturaleza", "La seda es producida por la oruga del gusano de seda (Bombyx mori), que teje un capullo para protegerse durante su metamorfosis.")
        ),
        BilingualQuestion(
            id = 10636, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac intérieur du monde?", listOf("le lac Tanganyika", "le lac Supérieur", "le lac Victoria", "la mer Caspienne"), "Nature", "La mer Caspienne, bien que salée, est considérée comme un lac car elle est entièrement entourée de terres. Sa superficie d'environ 371 000 km² en fait le plus grand lac intérieur du monde."),
            en = LocalizedContent("What is the largest inland lake in the world?", listOf("Lake Tanganyika", "Lake Superior", "Lake Victoria", "the Caspian Sea"), "Nature", "The Caspian Sea, although salty, is considered a lake because it is entirely surrounded by land. Its area of about 371,000 km² makes it the largest inland lake in the world."),
            zh = LocalizedContent("世界上最大的内陆湖是什么？", listOf("坦噶尼喀湖", "苏必利尔湖", "维多利亚湖", "里海"), "自然", "里海虽然是咸水湖，但因其完全被陆地包围而被视为湖泊。其面积约37.1万平方公里，是世界上最大的内陆湖。"),
            es = LocalizedContent("¿Cuál es el lago interior más grande del mundo?", listOf("el lago Tanganica", "el lago Superior", "el lago Victoria", "el mar Caspio"), "Naturaleza", "El mar Caspio, aunque salado, se considera un lago porque está completamente rodeado de tierra. Su superficie de aproximadamente 371.000 km² lo convierte en el lago interior más grande del mundo.")
        ),
        BilingualQuestion(
            id = 10637, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de lézards existe-t-il?", listOf("500", "2000", "6500", "10 000"), "Nature", "Il existe environ 6500 espèces de lézards dans le monde, ce qui en fait le groupe le plus diversifié des reptiles après les serpents."),
            en = LocalizedContent("How many species of lizards are there?", listOf("500", "2000", "6500", "10,000"), "Nature", "There are about 6500 species of lizards in the world, making them the most diverse group of reptiles after snakes."),
            zh = LocalizedContent("世界上有多少种蜥蜴？", listOf("500", "2000", "6500", "10000"), "自然", "全球约有6500种蜥蜴，是仅次于蛇类的最多样化的爬行动物类群。"),
            es = LocalizedContent("¿Cuántas especies de lagartos existen?", listOf("500", "2000", "6500", "10 000"), "Naturaleza", "Existen alrededor de 6500 especies de lagartos en el mundo, lo que los convierte en el grupo más diverso de reptiles después de las serpientes.")
        ),
        BilingualQuestion(
            id = 10638, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut produire du feu?", listOf("le poisson des abysses", "le scarabée bombardier", "aucun", "le bombardier noir"), "Nature", "Aucun animal ne peut produire du feu de manière naturelle. Le mythe des dragons cracheurs de feu est une invention légendaire sans fondement scientifique."),
            en = LocalizedContent("Which animal can produce fire?", listOf("the anglerfish", "the bombardier beetle", "none", "the black bombardier"), "Nature", "No animal can naturally produce fire. The myth of fire-breathing dragons is a legendary invention without scientific basis."),
            zh = LocalizedContent("哪种动物可以产生火？", listOf("深海鮟鱇鱼", "放屁虫", "没有", "黑放屁虫"), "自然", "没有动物能自然产生火。喷火龙的传说是一种没有科学依据的神话发明。"),
            es = LocalizedContent("¿Qué animal puede producir fuego?", listOf("el pez abisal", "el escarabajo bombardero", "ninguno", "el bombardero negro"), "Naturaleza", "Ningún animal puede producir fuego de forma natural. El mito de los dragones que escupen fuego es una invención legendaria sin fundamento científico.")
        ),
        BilingualQuestion(
            id = 10639, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème du monde?", listOf("la forêt amazonienne", "l'océan", "la savane africaine", "la toundra"), "Nature", "L'océan couvre plus de 70% de la surface terrestre et abrite la plus grande diversité de vie, ce qui en fait le plus grand écosystème de la planète."),
            en = LocalizedContent("What is the largest ecosystem in the world?", listOf("the Amazon rainforest", "the ocean", "the African savanna", "the tundra"), "Nature", "The ocean covers more than 70% of the Earth's surface and hosts the greatest diversity of life, making it the largest ecosystem on the planet."),
            zh = LocalizedContent("世界上最大的生态系统是什么？", listOf("亚马逊雨林", "海洋", "非洲稀树草原", "冻原"), "自然", "海洋覆盖了地球表面70%以上，拥有最丰富的生物多样性，是地球上最大的生态系统。"),
            es = LocalizedContent("¿Cuál es el ecosistema más grande del mundo?", listOf("la selva amazónica", "el océano", "la sabana africana", "la tundra"), "Naturaleza", "El océano cubre más del 70% de la superficie terrestre y alberga la mayor diversidad de vida, lo que lo convierte en el ecosistema más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10640, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de poissons d'eau douce existe-t-il?", listOf("500", "2000", "15 000", "30 000"), "Nature", "On estime qu'il existe environ 15 000 espèces de poissons d'eau douce dans le monde, ce qui représente plus de 40 % de toutes les espèces de poissons connues."),
            en = LocalizedContent("How many species of freshwater fish are there?", listOf("500", "2000", "15,000", "30,000"), "Nature", "It is estimated that there are about 15,000 species of freshwater fish in the world, representing more than 40% of all known fish species."),
            zh = LocalizedContent("世界上有多少种淡水鱼？", listOf("500", "2000", "15000", "30000"), "自然", "据估计，世界上约有15000种淡水鱼，占所有已知鱼类物种的40%以上。"),
            es = LocalizedContent("¿Cuántas especies de peces de agua dulce existen?", listOf("500", "2000", "15 000", "30 000"), "Naturaleza", "Se estima que existen alrededor de 15 000 especies de peces de agua dulce en el mundo, lo que representa más del 40% de todas las especies de peces conocidas.")
        ),
        BilingualQuestion(
            id = 10641, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal peut courir le plus vite en sprinting?", listOf("le guépard", "l'antilope", "le léopard", "le lion"), "Nature", "Le guépard peut atteindre des pointes de vitesse de 110 à 120 km/h en sprint, ce qui en fait le mammifère terrestre le plus rapide. Cette adaptation est due à son corps léger, ses longues pattes et sa colonne vertébrale flexible."),
            en = LocalizedContent("Which animal can run the fastest in a sprint?", listOf("cheetah", "antelope", "leopard", "lion"), "Nature", "The cheetah can reach top speeds of 110 to 120 km/h in a sprint, making it the fastest land mammal. This adaptation is due to its light body, long legs, and flexible spine."),
            zh = LocalizedContent("哪种动物在短跑中跑得最快？", listOf("猎豹", "羚羊", "豹", "狮子"), "自然", "猎豹在短跑中最高时速可达110至120公里，是陆地上最快的哺乳动物。这种适应能力源于其轻盈的身体、长腿和灵活的脊柱。"),
            es = LocalizedContent("¿Qué animal puede correr más rápido en un sprint?", listOf("el guepardo", "el antílope", "el leopardo", "el león"), "Naturaleza", "El guepardo puede alcanzar velocidades máximas de 110 a 120 km/h en un sprint, lo que lo convierte en el mamífero terrestre más rápido. Esta adaptación se debe a su cuerpo ligero, patas largas y columna vertebral flexible.")
        ),
        BilingualQuestion(
            id = 10642, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand système de montagnes sous-marines?", listOf("la dorsale médio-océanique", "la chaîne des Mariannes", "le rift océanique", "la fosse de Tonga"), "Nature", "La dorsale médio-océanique est une chaîne de montagnes sous-marines qui s'étend sur plus de 65 000 kilomètres à travers tous les océans, formée par le mouvement des plaques tectoniques."),
            en = LocalizedContent("What is the largest underwater mountain system?", listOf("mid-ocean ridge", "Mariana Trench", "oceanic rift", "Tonga Trench"), "Nature", "The mid-ocean ridge is an underwater mountain range that extends over 65,000 kilometers across all oceans, formed by the movement of tectonic plates."),
            zh = LocalizedContent("最大的海底山脉系统是什么？", listOf("大洋中脊", "马里亚纳海沟", "大洋裂谷", "汤加海沟"), "自然", "大洋中脊是一个海底山脉，延伸超过65000公里，横跨所有海洋，由板块运动形成。"),
            es = LocalizedContent("¿Cuál es el sistema montañoso submarino más grande?", listOf("la dorsal mesoatlántica", "la fosa de las Marianas", "la grieta oceánica", "la fosa de Tonga"), "Naturaleza", "La dorsal mesoatlántica es una cadena montañosa submarina que se extiende por más de 65 000 kilómetros a través de todos los océanos, formada por el movimiento de las placas tectónicas.")
        ),
        BilingualQuestion(
            id = 10643, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'araignées existe-t-il?", listOf("1000", "5000", "50 000", "100 000"), "Nature", "Plus de 50 000 espèces d'araignées ont été recensées dans le monde, réparties dans 129 familles."),
            en = LocalizedContent("How many species of spiders are there?", listOf("1000", "5000", "50,000", "100,000"), "Nature", "More than 50,000 species of spiders have been recorded worldwide, distributed across 129 families."),
            zh = LocalizedContent("世界上有多少种蜘蛛？", listOf("1000", "5000", "50000", "100000"), "自然", "全球已记录超过50000种蜘蛛，分布在129个科中。"),
            es = LocalizedContent("¿Cuántas especies de arañas existen?", listOf("1000", "5000", "50 000", "100 000"), "Naturaleza", "Se han registrado más de 50 000 especies de arañas en todo el mundo, distribuidas en 129 familias.")
        ),
        BilingualQuestion(
            id = 10644, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut voler le plus haut?", listOf("l'aigle", "la cigogne", "le condor", "l'oie"), "Nature", "Le condor des Andes peut atteindre des altitudes de plus de 6 500 mètres grâce à ses ailes immenses et aux courants thermiques."),
            en = LocalizedContent("Which animal can fly the highest?", listOf("eagle", "stork", "condor", "goose"), "Nature", "The Andean condor can reach altitudes of over 6,500 meters thanks to its immense wings and thermal currents."),
            zh = LocalizedContent("哪种动物飞得最高？", listOf("鹰", "鹳", "秃鹫", "鹅"), "自然", "安第斯秃鹫凭借其巨大的翅膀和热气流，可以飞到超过6500米的高度。"),
            es = LocalizedContent("¿Qué animal puede volar más alto?", listOf("el águila", "la cigüeña", "el cóndor", "el ganso"), "Naturaleza", "El cóndor andino puede alcanzar altitudes de más de 6 500 metros gracias a sus enormes alas y las corrientes térmicas.")
        ),
        BilingualQuestion(
            id = 10645, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand bassin versant du monde?", listOf("l'Amazone", "le Congo", "le Yangtze", "le Mississipi"), "Nature", "Le bassin de l'Amazone couvre environ 7 millions de km², s'étendant sur plusieurs pays d'Amérique du Sud, ce qui en fait le plus vaste réseau hydrographique de la planète."),
            en = LocalizedContent("What is the largest drainage basin in the world?", listOf("Amazon", "Congo", "Yangtze", "Mississippi"), "Nature", "The Amazon basin covers about 7 million km², spanning several South American countries, making it the largest hydrographic network on the planet."),
            zh = LocalizedContent("世界上最大的流域是什么？", listOf("亚马逊河", "刚果河", "长江", "密西西比河"), "自然", "亚马逊河流域面积约700万平方公里，覆盖多个南美国家，是地球上最大的水系网络。"),
            es = LocalizedContent("¿Cuál es la cuenca hidrográfica más grande del mundo?", listOf("el Amazonas", "el Congo", "el Yangtsé", "el Misisipi"), "Naturaleza", "La cuenca del Amazonas cubre aproximadamente 7 millones de km², abarcando varios países de América del Sur, lo que la convierte en la red hidrográfica más extensa del planeta.")
        ),
        BilingualQuestion(
            id = 10646, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de termites existe-t-il?", listOf("50", "100", "2600", "5000"), "Nature", "Il existe environ 2600 espèces de termites recensées dans le monde, principalement dans les régions tropicales et subtropicales."),
            en = LocalizedContent("How many species of termites are there?", listOf("50", "100", "2600", "5000"), "Nature", "There are about 2,600 species of termites recorded worldwide, mainly in tropical and subtropical regions."),
            zh = LocalizedContent("世界上有多少种白蚁？", listOf("50", "100", "2600", "5000"), "自然", "全球已记录约2600种白蚁，主要分布在热带和亚热带地区。"),
            es = LocalizedContent("¿Cuántas especies de termitas existen?", listOf("50", "100", "2600", "5000"), "Naturaleza", "Existen alrededor de 2600 especies de termitas registradas en el mundo, principalmente en regiones tropicales y subtropicales.")
        ),
        BilingualQuestion(
            id = 10647, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut émettre une décharge électrique?", listOf("l'anguille électrique", "la raie électrique", "le poisson-électrique", "Tous ces animaux"), "Nature", "Plusieurs espèces aquatiques, comme les anguilles électriques, les raies torpilles et certains poissons-chats, possèdent des organes spécialisés capables de produire des décharges électriques pour la défense ou la chasse."),
            en = LocalizedContent("Which animal can emit an electric discharge?", listOf("electric eel", "electric ray", "electric fish", "All of these animals"), "Nature", "Several aquatic species, such as electric eels, torpedo rays, and some catfish, have specialized organs capable of producing electric shocks for defense or hunting."),
            zh = LocalizedContent("哪种动物能发出电击？", listOf("电鳗", "电鳐", "电鱼", "所有这些动物"), "自然", "多种水生动物，如电鳗、电鳐和一些鲶鱼，拥有专门器官，能产生电击用于防御或捕猎。"),
            es = LocalizedContent("¿Qué animal puede emitir una descarga eléctrica?", listOf("la anguila eléctrica", "la raya eléctrica", "el pez eléctrico", "Todos estos animales"), "Naturaleza", "Varias especies acuáticas, como las anguilas eléctricas, las rayas torpedo y algunos bagres, poseen órganos especializados capaces de producir descargas eléctricas para defensa o caza.")
        ),
        BilingualQuestion(
            id = 10648, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand gisement de minéraux du monde?", listOf("l'Australie", "la Russie", "le Brésil", "la Suisse"), "Nature", "L'Australie possède les plus vastes réserves de minerais au monde, notamment de fer, d'or et d'uranium, avec des gisements majeurs comme ceux de Pilbara et d'Olympic Dam."),
            en = LocalizedContent("What is the largest mineral deposit in the world?", listOf("Australia", "Russia", "Brazil", "Switzerland"), "Nature", "Australia has the largest mineral reserves in the world, including iron, gold, and uranium, with major deposits such as Pilbara and Olympic Dam."),
            zh = LocalizedContent("世界上最大的矿藏在哪里？", listOf("澳大利亚", "俄罗斯", "巴西", "瑞士"), "自然", "澳大利亚拥有世界上最大的矿产储量，包括铁、金和铀，主要矿床有皮尔巴拉和奥林匹克坝。"),
            es = LocalizedContent("¿Cuál es el yacimiento mineral más grande del mundo?", listOf("Australia", "Rusia", "Brasil", "Suiza"), "Naturaleza", "Australia posee las mayores reservas minerales del mundo, incluyendo hierro, oro y uranio, con yacimientos importantes como Pilbara y Olympic Dam.")
        ),
        BilingualQuestion(
            id = 10649, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de vers existe-t-il?", listOf("500", "2000", "20 000", "100 000"), "Nature", "On estime qu'il existe environ 100 000 espèces de vers dans le monde, incluant les vers de terre, les vers plats et les vers ronds, bien que ce nombre puisse varier selon les classifications scientifiques."),
            en = LocalizedContent("How many species of worms are there?", listOf("500", "2000", "20,000", "100,000"), "Nature", "It is estimated that there are about 100,000 species of worms worldwide, including earthworms, flatworms, and roundworms, though this number may vary depending on scientific classifications."),
            zh = LocalizedContent("世界上有多少种蠕虫？", listOf("500", "2000", "20000", "100000"), "自然", "据估计，世界上约有10万种蠕虫，包括蚯蚓、扁形虫和线虫，不过这个数字可能因科学分类而异。"),
            es = LocalizedContent("¿Cuántas especies de gusanos existen?", listOf("500", "2000", "20 000", "100 000"), "Naturaleza", "Se estima que existen alrededor de 100 000 especies de gusanos en el mundo, incluyendo lombrices de tierra, gusanos planos y gusanos redondos, aunque este número puede variar según las clasificaciones científicas.")
        ),
        BilingualQuestion(
            id = 10650, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut contrôler sa température corporelle le mieux?", listOf("l'ours", "le dauphin", "l'humain", "le pingouin"), "Nature", "Les dauphins sont des mammifères marins homéothermes qui maintiennent une température corporelle stable grâce à une épaisse couche de graisse et un système circulatoire adapté, même dans les eaux froides."),
            en = LocalizedContent("Which animal can best control its body temperature?", listOf("bear", "dolphin", "human", "penguin"), "Nature", "Dolphins are marine mammals that maintain a stable body temperature through a thick layer of blubber and an adapted circulatory system, even in cold waters."),
            zh = LocalizedContent("哪种动物最能控制自身体温？", listOf("熊", "海豚", "人类", "企鹅"), "自然", "海豚是恒温海洋哺乳动物，通过厚厚的脂肪层和适应性的循环系统，即使在冷水中也能保持稳定的体温。"),
            es = LocalizedContent("¿Qué animal puede controlar mejor su temperatura corporal?", listOf("el oso", "el delfín", "el humano", "el pingüino"), "Naturaleza", "Los delfines son mamíferos marinos homeotermos que mantienen una temperatura corporal estable gracias a una gruesa capa de grasa y un sistema circulatorio adaptado, incluso en aguas frías.")
        ),
        BilingualQuestion(
            id = 10651, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand glacier du monde?", listOf("la calotte glaciaire de l'Antarctique", "la calotte glaciaire du Groenland", "le glacier de l'Eurasie", "le glacier de Patagonie"), "Nature", "La calotte glaciaire de l'Antarctique s'étend sur environ 14 millions de km², ce qui en fait la plus grande masse de glace au monde, bien plus vaste que tout glacier individuel."),
            en = LocalizedContent("What is the largest glacier in the world?", listOf("Antarctic ice sheet", "Greenland ice sheet", "Eurasian glacier", "Patagonian glacier"), "Nature", "The Antarctic ice sheet covers about 14 million km², making it the largest mass of ice in the world, far larger than any individual glacier."),
            zh = LocalizedContent("世界上最大的冰川是什么？", listOf("南极冰盖", "格陵兰冰盖", "欧亚冰川", "巴塔哥尼亚冰川"), "自然", "南极冰盖面积约1400万平方公里，是世界上最大的冰体，远大于任何单个冰川。"),
            es = LocalizedContent("¿Cuál es el glaciar más grande del mundo?", listOf("la capa de hielo de la Antártida", "la capa de hielo de Groenlandia", "el glaciar de Eurasia", "el glaciar de la Patagonia"), "Naturaleza", "La capa de hielo de la Antártida se extiende sobre unos 14 millones de km², lo que la convierte en la mayor masa de hielo del mundo, mucho más vasta que cualquier glaciar individual.")
        ),
        BilingualQuestion(
            id = 10652, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'escargots existe-t-il?", listOf("500", "2000", "24 000", "43 000"), "Nature", "Il existe environ 24 000 espèces d'escargots dans le monde, réparties entre escargots terrestres, marins et d'eau douce."),
            en = LocalizedContent("How many kinds of snails are there?", listOf("500", "2000", "24,000", "43,000"), "Nature", "There are about 24,000 species of snails in the world, divided into terrestrial, marine, and freshwater snails."),
            zh = LocalizedContent("世界上有多少种蜗牛？", listOf("500", "2000", "24000", "43000"), "自然", "世界上约有24000种蜗牛，分为陆生、海生和淡水蜗牛。"),
            es = LocalizedContent("¿Cuántos tipos de caracoles existen?", listOf("500", "2000", "24 000", "43 000"), "Naturaleza", "Existen aproximadamente 24 000 especies de caracoles en el mundo, repartidas entre caracoles terrestres, marinos y de agua dulce.")
        ),
        BilingualQuestion(
            id = 10653, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut retenir l'air le plus longtemps?", listOf("le humain", "le phoque", "la baleine", "le dauphin"), "Nature", "Les baleines peuvent retenir leur souffle jusqu'à 90 minutes lors de plongées profondes, grâce à une capacité pulmonaire adaptée et un métabolisme ralenti."),
            en = LocalizedContent("Which animal can hold its breath the longest?", listOf("human", "seal", "whale", "dolphin"), "Nature", "Whales can hold their breath for up to 90 minutes during deep dives, thanks to adapted lung capacity and slowed metabolism."),
            zh = LocalizedContent("哪种动物能屏住呼吸最长时间？", listOf("人类", "海豹", "鲸鱼", "海豚"), "自然", "鲸鱼在深潜时能屏住呼吸长达90分钟，这得益于其适应性的肺活量和减缓的新陈代谢。"),
            es = LocalizedContent("¿Qué animal puede aguantar la respiración más tiempo?", listOf("el humano", "la foca", "la ballena", "el delfín"), "Naturaleza", "Las ballenas pueden aguantar la respiración hasta 90 minutos durante inmersiones profundas, gracias a una capacidad pulmonar adaptada y un metabolismo ralentizado.")
        ),
        BilingualQuestion(
            id = 10654, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand désert de sable du monde?", listOf("le Sahara", "le désert de Kalahari", "le désert d'Arabie", "le désert de Gobi"), "Nature", "Le Sahara est le plus grand désert de sable du monde, s'étendant sur environ 9,2 millions de kilomètres carrés en Afrique du Nord."),
            en = LocalizedContent("What is the largest sand desert in the world?", listOf("Sahara", "Kalahari Desert", "Arabian Desert", "Gobi Desert"), "Nature", "The Sahara is the largest sand desert in the world, covering about 9.2 million square kilometers in North Africa."),
            zh = LocalizedContent("世界上最大的沙质沙漠是什么？", listOf("撒哈拉沙漠", "卡拉哈里沙漠", "阿拉伯沙漠", "戈壁沙漠"), "自然", "撒哈拉沙漠是世界上最大的沙质沙漠，覆盖北非约920万平方公里。"),
            es = LocalizedContent("¿Cuál es el desierto de arena más grande del mundo?", listOf("el Sahara", "el desierto de Kalahari", "el desierto de Arabia", "el desierto de Gobi"), "Naturaleza", "El Sahara es el desierto de arena más grande del mundo, extendiéndose sobre aproximadamente 9,2 millones de kilómetros cuadrados en el norte de África.")
        ),
        BilingualQuestion(
            id = 10655, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de poissons-papillons existe-t-il?", listOf("100", "200", "500", "1000"), "Nature", "Les poissons-papillons, reconnaissables à leurs couleurs vives et motifs, comptent environ 500 espèces réparties principalement dans les récifs coralliens tropicaux."),
            en = LocalizedContent("How many kinds of butterflyfish are there?", listOf("100", "200", "500", "1000"), "Nature", "Butterflyfish, recognizable by their bright colors and patterns, comprise about 500 species mainly found in tropical coral reefs."),
            zh = LocalizedContent("世界上有多少种蝴蝶鱼？", listOf("100", "200", "500", "1000"), "自然", "蝴蝶鱼以其鲜艳的颜色和图案而闻名，约有500种，主要分布在热带珊瑚礁中。"),
            es = LocalizedContent("¿Cuántos tipos de peces mariposa existen?", listOf("100", "200", "500", "1000"), "Naturaleza", "Los peces mariposa, reconocibles por sus colores brillantes y patrones, cuentan con aproximadamente 500 especies distribuidas principalmente en los arrecifes de coral tropicales.")
        ),
        BilingualQuestion(
            id = 10656, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut produire le plus d'œufs?", listOf("la poule", "le poisson", "la reine des fourmis", "la méduse"), "Nature", "La méduse peut pondre jusqu'à 45 000 œufs par jour, ce qui en fait l'animal le plus prolifique en termes de production d'œufs."),
            en = LocalizedContent("Which animal can produce the most eggs?", listOf("chicken", "fish", "queen ant", "jellyfish"), "Nature", "The jellyfish can lay up to 45,000 eggs per day, making it the most prolific animal in terms of egg production."),
            zh = LocalizedContent("哪种动物产卵最多？", listOf("鸡", "鱼", "蚁后", "水母"), "自然", "水母每天可产卵多达45000个，使其成为产卵量最高的动物。"),
            es = LocalizedContent("¿Qué animal puede producir la mayor cantidad de huevos?", listOf("la gallina", "el pez", "la reina de las hormigas", "la medusa"), "Naturaleza", "La medusa puede poner hasta 45 000 huevos por día, lo que la convierte en el animal más prolífico en términos de producción de huevos.")
        ),
        BilingualQuestion(
            id = 10657, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac salé du monde?", listOf("la mer Morte", "la mer Caspienne", "la mer d'Aral", "le lac Salton"), "Nature", "La mer Caspienne est considérée comme le plus grand lac salé du monde en raison de sa superficie d'environ 371 000 km², bien qu'elle soit souvent qualifiée de mer en raison de sa taille et de sa salinité."),
            en = LocalizedContent("What is the largest salt lake in the world?", listOf("Dead Sea", "Caspian Sea", "Aral Sea", "Salton Sea"), "Nature", "The Caspian Sea is considered the largest salt lake in the world due to its area of about 371,000 km², although it is often called a sea because of its size and salinity."),
            zh = LocalizedContent("世界上最大的咸水湖是什么？", listOf("死海", "里海", "咸海", "索尔顿湖"), "自然", "里海因其约37.1万平方公里的面积而被认为是世界上最大的咸水湖，尽管由于其大小和盐度常被称为海。"),
            es = LocalizedContent("¿Cuál es el lago salado más grande del mundo?", listOf("el mar Muerto", "el mar Caspio", "el mar de Aral", "el lago Salton"), "Naturaleza", "El mar Caspio es considerado el lago salado más grande del mundo debido a su superficie de aproximadamente 371 000 km², aunque a menudo se le llama mar por su tamaño y salinidad.")
        ),
        BilingualQuestion(
            id = 10658, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de dorades existe-t-il?", listOf("10", "50", "100", "300"), "Nature", "Le terme \"dorade\" regroupe plusieurs espèces de poissons de la famille des Sparidés, dont environ 300 espèces sont répertoriées dans le monde, principalement dans les eaux tempérées et tropicales."),
            en = LocalizedContent("How many kinds of sea bream are there?", listOf("10", "50", "100", "300"), "Nature", "The term \"sea bream\" encompasses several species of fish in the family Sparidae, with about 300 species recorded worldwide, mainly in temperate and tropical waters."),
            zh = LocalizedContent("世界上有多少种鲷鱼？", listOf("10", "50", "100", "300"), "自然", "“鲷鱼”一词涵盖鲷科多种鱼类，全球约有300种，主要分布在温带和热带水域。"),
            es = LocalizedContent("¿Cuántos tipos de doradas existen?", listOf("10", "50", "100", "300"), "Naturaleza", "El término \"dorada\" agrupa varias especies de peces de la familia Sparidae, de las cuales se han registrado alrededor de 300 especies en el mundo, principalmente en aguas templadas y tropicales.")
        ),
        BilingualQuestion(
            id = 10659, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal a le plus d'yeux?", listOf("l'araignée", "la chauve-souris", "la mouche", "la libellule"), "Nature", "Les mouches possèdent des yeux composés formés de milliers de petites unités visuelles appelées ommatidies, ce qui leur confère un nombre d'yeux bien supérieur à celui de la plupart des autres animaux."),
            en = LocalizedContent("Which animal has the most eyes?", listOf("spider", "bat", "fly", "dragonfly"), "Nature", "Flies have compound eyes made up of thousands of small visual units called ommatidia, giving them a far greater number of eyes than most other animals."),
            zh = LocalizedContent("哪种动物的眼睛最多？", listOf("蜘蛛", "蝙蝠", "苍蝇", "蜻蜓"), "自然", "苍蝇的复眼由数千个称为小眼的小视觉单元组成，使其眼睛数量远多于大多数其他动物。"),
            es = LocalizedContent("¿Qué animal tiene más ojos?", listOf("la araña", "el murciélago", "la mosca", "la libélula"), "Naturaleza", "Las moscas poseen ojos compuestos formados por miles de pequeñas unidades visuales llamadas omatidios, lo que les confiere un número de ojos muy superior al de la mayoría de los otros animales.")
        ),
        BilingualQuestion(
            id = 10660, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand îlot du monde?", listOf("la Nouvelle-Zélande", "la Grande-Bretagne", "Madagascar", "Bornéo"), "Nature", "Bornéo est la troisième plus grande île du monde, mais elle est considérée comme le plus grand îlot car elle est partagée entre trois pays : l'Indonésie, la Malaisie et le Brunei."),
            en = LocalizedContent("What is the largest island in the world?", listOf("New Zealand", "Great Britain", "Madagascar", "Borneo"), "Nature", "Borneo is the third largest island in the world, but it is considered the largest island because it is shared by three countries: Indonesia, Malaysia, and Brunei."),
            zh = LocalizedContent("世界上最大的岛屿是什么？", listOf("新西兰", "大不列颠岛", "马达加斯加", "婆罗洲"), "自然", "婆罗洲是世界第三大岛，但它被认为是最大的岛屿，因为它由三个国家共享：印度尼西亚、马来西亚和文莱。"),
            es = LocalizedContent("¿Cuál es la isla más grande del mundo?", listOf("Nueva Zelanda", "Gran Bretaña", "Madagascar", "Borneo"), "Naturaleza", "Borneo es la tercera isla más grande del mundo, pero se considera la isla más grande porque es compartida por tres países: Indonesia, Malasia y Brunéi.")
        ),
        BilingualQuestion(
            id = 10661, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de raies existe-t-il?", listOf("100", "300", "600", "1000"), "Nature", "Il existe environ 600 espèces de raies dans le monde, réparties dans les océans et certaines eaux douces, incluant des variétés comme la raie manta et la raie pastenague."),
            en = LocalizedContent("How many species of rays are there?", listOf("100", "300", "600", "1000"), "Nature", "There are about 600 species of rays worldwide, distributed in oceans and some freshwaters, including varieties like manta rays and stingrays."),
            zh = LocalizedContent("有多少种鳐鱼？", listOf("100", "300", "600", "1000"), "自然", "全世界约有600种鳐鱼，分布在海洋和一些淡水中，包括蝠鲼和黄貂鱼等品种。"),
            es = LocalizedContent("¿Cuántas especies de rayas existen?", listOf("100", "300", "600", "1000"), "Naturaleza", "Existen alrededor de 600 especies de rayas en el mundo, distribuidas en océanos y algunas aguas dulces, incluyendo variedades como la raya manta y la raya pastinaca.")
        ),
        BilingualQuestion(
            id = 10662, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut être actif la plus longtemps sans sommeil?", listOf("la grenouille à pinceaux", "le requin", "la libellule", "l'insecte"), "Nature", "Les libellules peuvent rester actives plusieurs semaines sans dormir, car leur métabolisme et leur système nerveux leur permettent de fonctionner en continu."),
            en = LocalizedContent("Which animal can stay active the longest without sleep?", listOf("the brush frog", "the shark", "the dragonfly", "the insect"), "Nature", "Dragonflies can remain active for several weeks without sleeping, as their metabolism and nervous system allow them to function continuously."),
            zh = LocalizedContent("哪种动物可以不睡觉保持活跃最长时间？", listOf("刷蛙", "鲨鱼", "蜻蜓", "昆虫"), "自然", "蜻蜓可以连续几周不睡觉保持活跃，因为它们的新陈代谢和神经系统允许它们持续运作。"),
            es = LocalizedContent("¿Qué animal puede permanecer activo más tiempo sin dormir?", listOf("la rana de cepillo", "el tiburón", "la libélula", "el insecto"), "Naturaleza", "Las libélulas pueden permanecer activas durante varias semanas sin dormir, ya que su metabolismo y sistema nervioso les permiten funcionar de forma continua.")
        ),
        BilingualQuestion(
            id = 10663, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand golfstream du monde?", listOf("le Gulf Stream", "le Kuroshio", "le Agulhas", "le Humboldt"), "Nature", "Le Gulf Stream est un courant océanique chaud de l'Atlantique Nord, le plus puissant au monde en termes de débit d'eau."),
            en = LocalizedContent("What is the largest ocean current in the world?", listOf("the Gulf Stream", "the Kuroshio", "the Agulhas", "the Humboldt"), "Nature", "The Gulf Stream is a warm ocean current in the North Atlantic, the most powerful in the world in terms of water flow."),
            zh = LocalizedContent("世界上最大的洋流是什么？", listOf("墨西哥湾流", "黑潮", "阿古拉斯洋流", "洪堡洋流"), "自然", "墨西哥湾流是北大西洋的一股暖流，就水流量而言是世界上最强大的洋流。"),
            es = LocalizedContent("¿Cuál es la corriente oceánica más grande del mundo?", listOf("la Corriente del Golfo", "la Kuroshio", "la Agulhas", "la Humboldt"), "Naturaleza", "La Corriente del Golfo es una corriente oceánica cálida en el Atlántico Norte, la más poderosa del mundo en términos de caudal de agua.")
        ),
        BilingualQuestion(
            id = 10664, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de poulpes existe-t-il?", listOf("50", "200", "300", "500"), "Nature", "Environ 300 espèces de poulpes sont répertoriées dans le monde, vivant dans tous les océans, des eaux côtières peu profondes aux abysses."),
            en = LocalizedContent("How many species of octopus are there?", listOf("50", "200", "300", "500"), "Nature", "About 300 species of octopus are recorded worldwide, living in all oceans, from shallow coastal waters to the deep sea."),
            zh = LocalizedContent("有多少种章鱼？", listOf("50", "200", "300", "500"), "自然", "全世界记录约有300种章鱼，生活在所有海洋中，从浅海沿岸水域到深海。"),
            es = LocalizedContent("¿Cuántas especies de pulpo existen?", listOf("50", "200", "300", "500"), "Naturaleza", "Alrededor de 300 especies de pulpo están registradas en todo el mundo, viviendo en todos los océanos, desde aguas costeras poco profundas hasta las profundidades marinas.")
        ),
        BilingualQuestion(
            id = 10665, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir le plus long cri?", listOf("la baleine", "le loup", "le lion", "l'éléphant"), "Nature", "Le cri de la baleine bleue peut atteindre 188 décibels et parcourir des centaines de kilomètres sous l'eau, ce qui en fait le cri animal le plus long et le plus puissant."),
            en = LocalizedContent("Which animal can produce the longest call?", listOf("the whale", "the wolf", "the lion", "the elephant"), "Nature", "The blue whale's call can reach 188 decibels and travel hundreds of kilometers underwater, making it the longest and most powerful animal call."),
            zh = LocalizedContent("哪种动物能发出最长的叫声？", listOf("鲸鱼", "狼", "狮子", "大象"), "自然", "蓝鲸的叫声可达188分贝，在水下传播数百公里，是动物中最长、最有力的叫声。"),
            es = LocalizedContent("¿Qué animal puede emitir el llamado más largo?", listOf("la ballena", "el lobo", "el león", "el elefante"), "Naturaleza", "El canto de la ballena azul puede alcanzar 188 decibeles y viajar cientos de kilómetros bajo el agua, lo que lo convierte en el llamado animal más largo y potente.")
        ),
        BilingualQuestion(
            id = 10666, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand point culminant sous-marin du monde?", listOf("l'Everest sous-marin", "le pic Lomonosov", "le mont Tamu", "le mont Hess"), "Nature", "Le mont Tamu est un volcan sous-marin situé dans l'océan Pacifique, dont le sommet atteint environ 4 000 mètres sous la surface, ce qui en fait le plus grand point culminant sous-marin connu."),
            en = LocalizedContent("What is the highest underwater summit in the world?", listOf("the underwater Everest", "the Lomonosov Ridge", "Tamu Massif", "Hess Rise"), "Nature", "Tamu Massif is a submarine volcano in the Pacific Ocean, whose summit reaches about 4,000 meters below the surface, making it the highest known underwater summit."),
            zh = LocalizedContent("世界上最高的海底山峰是什么？", listOf("海底珠峰", "罗蒙诺索夫海岭", "塔穆山", "赫斯海隆"), "自然", "塔穆山是太平洋中的一座海底火山，其顶峰距海面约4000米，是已知最高的海底山峰。"),
            es = LocalizedContent("¿Cuál es la cumbre submarina más alta del mundo?", listOf("el Everest submarino", "la dorsal Lomonósov", "el monte Tamu", "el monte Hess"), "Naturaleza", "El monte Tamu es un volcán submarino en el océano Pacífico, cuya cumbre alcanza unos 4.000 metros bajo la superficie, lo que lo convierte en la cumbre submarina más alta conocida.")
        ),
        BilingualQuestion(
            id = 10667, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crabes existe-t-il?", listOf("500", "1000", "6500", "10 000"), "Nature", "Plus de 6 500 espèces de crabes sont recensées dans le monde, réparties dans les océans, les eaux douces et sur terre."),
            en = LocalizedContent("How many species of crabs are there?", listOf("500", "1000", "6500", "10,000"), "Nature", "More than 6,500 species of crabs are recorded worldwide, distributed in oceans, freshwaters, and on land."),
            zh = LocalizedContent("有多少种螃蟹？", listOf("500", "1000", "6500", "10000"), "自然", "全世界记录有超过6500种螃蟹，分布在海洋、淡水和陆地上。"),
            es = LocalizedContent("¿Cuántas especies de cangrejos existen?", listOf("500", "1000", "6500", "10 000"), "Naturaleza", "Más de 6.500 especies de cangrejos están registradas en todo el mundo, distribuidas en océanos, aguas dulces y tierra firme.")
        ),
        BilingualQuestion(
            id = 10668, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut avoir les plus longues défenses?", listOf("l'éléphant", "le morse", "le narval", "le sanglier"), "Nature", "La défense du narval est en fait une dent incisive qui peut atteindre jusqu'à 3 mètres de long, ce qui en fait la plus longue défense du règne animal."),
            en = LocalizedContent("Which animal can have the longest tusks?", listOf("the elephant", "the walrus", "the narwhal", "the boar"), "Nature", "The narwhal's tusk is actually an incisor tooth that can reach up to 3 meters in length, making it the longest tusk in the animal kingdom."),
            zh = LocalizedContent("哪种动物有最长的獠牙？", listOf("大象", "海象", "独角鲸", "野猪"), "自然", "独角鲸的獠牙实际上是一颗门齿，可长达3米，是动物王国中最长的獠牙。"),
            es = LocalizedContent("¿Qué animal puede tener los colmillos más largos?", listOf("el elefante", "la morsa", "el narval", "el jabalí"), "Naturaleza", "El colmillo del narval es en realidad un diente incisivo que puede alcanzar hasta 3 metros de largo, lo que lo convierte en el colmillo más largo del reino animal.")
        ),
        BilingualQuestion(
            id = 10669, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut volcan du monde?", listOf("le Mauna Kea", "le Popocatépetl", "le Mauna Loa", "l'Ojos del Salado"), "Nature", "L'Ojos del Salado, situé à la frontière entre le Chili et l'Argentine, culmine à 6 893 mètres d'altitude, ce qui en fait le plus haut volcan actif de la planète."),
            en = LocalizedContent("What is the highest volcano in the world?", listOf("Mauna Kea", "Popocatépetl", "Mauna Loa", "Ojos del Salado"), "Nature", "Ojos del Salado, located on the border between Chile and Argentina, reaches an altitude of 6,893 meters, making it the highest active volcano on the planet."),
            zh = LocalizedContent("世界上最高的火山是什么？", listOf("莫纳克亚山", "波波卡特佩特火山", "莫纳罗亚山", "奥霍斯德尔萨拉多山"), "自然", "奥霍斯德尔萨拉多山位于智利和阿根廷边境，海拔6893米，是地球上最高的活火山。"),
            es = LocalizedContent("¿Cuál es el volcán más alto del mundo?", listOf("el Mauna Kea", "el Popocatépetl", "el Mauna Loa", "el Ojos del Salado"), "Naturaleza", "El Ojos del Salado, ubicado en la frontera entre Chile y Argentina, alcanza una altitud de 6.893 metros, lo que lo convierte en el volcán activo más alto del planeta.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10670, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'huîtres existe-t-il?", listOf("10", "50", "200", "500"), "Nature", "Il existe environ 200 espèces d'huîtres dans le monde, réparties dans les eaux marines et saumâtres des différentes régions."),
            en = LocalizedContent("How many species of oysters are there?", listOf("10", "50", "200", "500"), "Nature", "There are approximately 200 species of oysters worldwide, distributed in marine and brackish waters across different regions."),
            zh = LocalizedContent("世界上有多少种牡蛎？", listOf("10", "50", "200", "500"), "自然", "全球大约有200种牡蛎，分布于不同地区的海洋和咸淡水水域。"),
            es = LocalizedContent("¿Cuántas especies de ostras existen?", listOf("10", "50", "200", "500"), "Naturaleza", "Existen aproximadamente 200 especies de ostras en el mundo, distribuidas en aguas marinas y salobres de diferentes regiones.")
        ),
        BilingualQuestion(
            id = 10671, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut avoir le plus gros cerveau par rapport à son corps?", listOf("l'humain", "le dauphin", "le perroquet", "l'éléphant"), "Nature", "L'humain possède le plus gros cerveau proportionnellement à son corps parmi tous les animaux, avec un ratio d'environ 2 % de sa masse corporelle."),
            en = LocalizedContent("Which animal can have the largest brain relative to its body?", listOf("human", "dolphin", "parrot", "elephant"), "Nature", "Humans have the largest brain relative to body size among all animals, with a ratio of about 2% of body mass."),
            zh = LocalizedContent("哪种动物相对于身体拥有最大的大脑？", listOf("人类", "海豚", "鹦鹉", "大象"), "自然", "在所有动物中，人类拥有相对于身体最大的大脑，约占体重的2%。"),
            es = LocalizedContent("¿Qué animal puede tener el cerebro más grande en relación con su cuerpo?", listOf("el humano", "el delfín", "el loro", "el elefante"), "Naturaleza", "El humano posee el cerebro más grande proporcionalmente a su cuerpo entre todos los animales, con una relación de aproximadamente el 2% de su masa corporal.")
        ),
        BilingualQuestion(
            id = 10672, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand glacier d'Afrique?", listOf("le Kilimandjaro", "le Mont-Blanc", "les Rwenzori", "les Drakensberg"), "Nature", "Le Kilimandjaro abrite le plus grand glacier d'Afrique, bien que sa calotte glaciaire diminue rapidement à cause du réchauffement climatique."),
            en = LocalizedContent("What is the largest glacier in Africa?", listOf("Kilimanjaro", "Mont Blanc", "Rwenzori", "Drakensberg"), "Nature", "Kilimanjaro hosts the largest glacier in Africa, although its ice cap is rapidly shrinking due to global warming."),
            zh = LocalizedContent("非洲最大的冰川是什么？", listOf("乞力马扎罗山", "勃朗峰", "鲁文佐里山", "德拉肯斯堡山脉"), "自然", "乞力马扎罗山拥有非洲最大的冰川，但由于全球变暖，其冰盖正在迅速缩小。"),
            es = LocalizedContent("¿Cuál es el glaciar más grande de África?", listOf("el Kilimanjaro", "el Mont Blanc", "los Rwenzori", "los Drakensberg"), "Naturaleza", "El Kilimanjaro alberga el glaciar más grande de África, aunque su casquete glaciar está disminuyendo rápidamente debido al calentamiento global.")
        ),
        BilingualQuestion(
            id = 10673, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de bivalves existe-t-il?", listOf("500", "1000", "5000", "15 000"), "Nature", "Les bivalves, comme les moules et les huîtres, comptent environ 15 000 espèces décrites dans le monde, réparties dans divers habitats marins et d'eau douce."),
            en = LocalizedContent("How many species of bivalves are there?", listOf("500", "1000", "5000", "15,000"), "Nature", "Bivalves, such as mussels and oysters, include about 15,000 described species worldwide, distributed in various marine and freshwater habitats."),
            zh = LocalizedContent("世界上有多少种双壳类动物？", listOf("500", "1000", "5000", "15000"), "自然", "双壳类动物，如贻贝和牡蛎，全球约有15000种已描述的物种，分布于各种海洋和淡水栖息地。"),
            es = LocalizedContent("¿Cuántas especies de bivalvos existen?", listOf("500", "1000", "5000", "15 000"), "Naturaleza", "Los bivalvos, como los mejillones y las ostras, cuentan con aproximadamente 15 000 especies descritas en el mundo, distribuidas en diversos hábitats marinos y de agua dulce.")
        ),
        BilingualQuestion(
            id = 10674, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la plus longue vie reproductive?", listOf("l'humain", "le perroquet", "la tortue", "la baleine"), "Nature", "Les tortues marines et terrestres sont connues pour leur longévité exceptionnelle, certaines espèces pouvant se reproduire jusqu'à un âge avancé, dépassant souvent 50 ans de capacité reproductive active."),
            en = LocalizedContent("Which animal can have the longest reproductive lifespan?", listOf("human", "parrot", "turtle", "whale"), "Nature", "Marine and terrestrial turtles are known for their exceptional longevity, with some species able to reproduce well into old age, often exceeding 50 years of active reproductive capacity."),
            zh = LocalizedContent("哪种动物的生殖寿命最长？", listOf("人类", "鹦鹉", "乌龟", "鲸鱼"), "自然", "海龟和陆龟以其非凡的长寿而闻名，某些物种能够繁殖到高龄，通常超过50年的活跃生殖能力。"),
            es = LocalizedContent("¿Qué animal puede tener la vida reproductiva más larga?", listOf("el humano", "el loro", "la tortuga", "la ballena"), "Naturaleza", "Las tortugas marinas y terrestres son conocidas por su longevidad excepcional, algunas especies pueden reproducirse hasta una edad avanzada, superando a menudo los 50 años de capacidad reproductiva activa.")
        ),
        BilingualQuestion(
            id = 10675, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand acteur du changement climatique?", listOf("le CO2", "le méthane", "le dioxyde de soufre", "la vapeur d'eau"), "Nature", "La vapeur d’eau est le gaz à effet de serre le plus abondant dans l’atmosphère, responsable d’environ 60 % de l’effet de serre naturel, amplifiant le réchauffement via une boucle de rétroaction positive."),
            en = LocalizedContent("What is the biggest driver of climate change?", listOf("CO2", "methane", "sulfur dioxide", "water vapor"), "Nature", "Water vapor is the most abundant greenhouse gas in the atmosphere, responsible for about 60% of the natural greenhouse effect, amplifying warming through a positive feedback loop."),
            zh = LocalizedContent("气候变化的最大驱动因素是什么？", listOf("二氧化碳", "甲烷", "二氧化硫", "水蒸气"), "自然", "水蒸气是大气中最丰富的温室气体，约占自然温室效应的60%，通过正反馈循环加剧变暖。"),
            es = LocalizedContent("¿Cuál es el mayor impulsor del cambio climático?", listOf("el CO2", "el metano", "el dióxido de azufre", "el vapor de agua"), "Naturaleza", "El vapor de agua es el gas de efecto invernadero más abundante en la atmósfera, responsable de aproximadamente el 60% del efecto invernadero natural, amplificando el calentamiento a través de un bucle de retroalimentación positiva.")
        ),
        BilingualQuestion(
            id = 10676, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de calmars existe-t-il?", listOf("50", "200", "300", "500"), "Nature", "On dénombre environ 300 espèces de calmars dans le monde, allant des petites espèces côtières aux calmars géants des profondeurs."),
            en = LocalizedContent("How many species of squid are there?", listOf("50", "200", "300", "500"), "Nature", "There are about 300 species of squid worldwide, ranging from small coastal species to giant deep-sea squid."),
            zh = LocalizedContent("世界上有多少种鱿鱼？", listOf("50", "200", "300", "500"), "自然", "全球大约有300种鱿鱼，从小型沿海物种到深海巨型鱿鱼。"),
            es = LocalizedContent("¿Cuántas especies de calamares existen?", listOf("50", "200", "300", "500"), "Naturaleza", "Se cuentan aproximadamente 300 especies de calamares en el mundo, desde pequeñas especies costeras hasta calamares gigantes de las profundidades.")
        ),
        BilingualQuestion(
            id = 10677, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure vision périphérique?", listOf("le faucon", "le lapin", "la chèvre", "le cheval"), "Nature", "Les yeux du cheval sont placés sur les côtés de sa tête, ce qui lui offre un champ de vision d'environ 350 degrés, lui permettant de voir presque tout autour de lui sans bouger la tête."),
            en = LocalizedContent("Which animal can have the best peripheral vision?", listOf("falcon", "rabbit", "goat", "horse"), "Nature", "Horses' eyes are placed on the sides of their heads, giving them a field of vision of about 350 degrees, allowing them to see almost all around without moving their heads."),
            zh = LocalizedContent("哪种动物的周边视觉最好？", listOf("猎鹰", "兔子", "山羊", "马"), "自然", "马的眼睛位于头部两侧，视野约为350度，使它们几乎不用转头就能看到周围的一切。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor visión periférica?", listOf("el halcón", "el conejo", "la cabra", "el caballo"), "Naturaleza", "Los ojos del caballo están colocados a los lados de su cabeza, lo que le proporciona un campo de visión de aproximadamente 350 grados, permitiéndole ver casi todo a su alrededor sin mover la cabeza.")
        ),
        BilingualQuestion(
            id = 10678, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand système de grottes du monde?", listOf("Mammoth Cave", "Carlsbad Caverns", "Son Doong", "Batu Caves"), "Nature", "Mammoth Cave, situé dans le Kentucky aux États-Unis, détient ce record avec plus de 650 kilomètres de passages cartographiés."),
            en = LocalizedContent("What is the largest cave system in the world?", listOf("Mammoth Cave", "Carlsbad Caverns", "Son Doong", "Batu Caves"), "Nature", "Mammoth Cave, located in Kentucky, USA, holds this record with over 650 kilometers of mapped passages."),
            zh = LocalizedContent("世界上最大的洞穴系统是什么？", listOf("猛犸洞", "卡尔斯巴德洞窟", "韩松洞", "黑风洞"), "自然", "位于美国肯塔基州的猛犸洞拥有超过650公里的已测绘通道，保持着这一纪录。"),
            es = LocalizedContent("¿Cuál es el sistema de cuevas más grande del mundo?", listOf("Mammoth Cave", "Carlsbad Caverns", "Son Doong", "Batu Caves"), "Naturaleza", "Mammoth Cave, ubicado en Kentucky, EE. UU., ostenta este récord con más de 650 kilómetros de pasajes cartografiados.")
        ),
        BilingualQuestion(
            id = 10679, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de moules existe-t-il?", listOf("100", "500", "1000", "5000"), "Nature", "Le terme \"moule\" désigne un grand groupe de mollusques bivalves, et on estime qu'il existe environ 1 000 espèces différentes de moules à travers le monde, réparties dans les eaux marines et douces."),
            en = LocalizedContent("How many species of mussels are there?", listOf("100", "500", "1000", "5000"), "Nature", "The term 'mussel' refers to a large group of bivalve mollusks, and it is estimated that there are about 1,000 different species of mussels worldwide, distributed in marine and fresh waters."),
            zh = LocalizedContent("世界上有多少种贻贝？", listOf("100", "500", "1000", "5000"), "自然", "“贻贝”一词指一大类双壳类软体动物，据估计全球约有1000种不同的贻贝，分布于海洋和淡水中。"),
            es = LocalizedContent("¿Cuántas especies de mejillones existen?", listOf("100", "500", "1000", "5000"), "Naturaleza", "El término 'mejillón' designa un gran grupo de moluscos bivalvos, y se estima que existen alrededor de 1 000 especies diferentes de mejillones en todo el mundo, distribuidas en aguas marinas y dulces.")
        ),
        BilingualQuestion(
            id = 10680, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la plus grande taille de litter?", listOf("le phoque", "la baleine", "la souris", "le poisson"), "Nature", "Les souris peuvent avoir des portées allant jusqu'à une vingtaine de petits, ce qui est exceptionnellement élevé pour leur taille."),
            en = LocalizedContent("Which animal can have the largest litter size?", listOf("seal", "whale", "mouse", "fish"), "Nature", "Mice can have litters of up to about twenty offspring, which is exceptionally high for their size."),
            zh = LocalizedContent("哪种动物能产下最多的幼崽？", listOf("海豹", "鲸鱼", "老鼠", "鱼"), "自然", "老鼠一胎可产多达约二十只幼崽，对于它们的体型来说，这个数量非常高。"),
            es = LocalizedContent("¿Qué animal puede tener el mayor tamaño de camada?", listOf("la foca", "la ballena", "el ratón", "el pez"), "Naturaleza", "Los ratones pueden tener camadas de hasta una veintena de crías, lo que es excepcionalmente alto para su tamaño.")
        ),
        BilingualQuestion(
            id = 10681, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand récif de corail d'eau douce du monde?", listOf("il n'y en a pas", "le lac Tanganyika", "le lac Victoria", "l'Amazone"), "Nature", "Les coraux d'eau douce n'existent pas : les récifs coralliens sont exclusivement marins, car les polypes coralliens ont besoin d'eau salée pour survivre."),
            en = LocalizedContent("What is the largest freshwater coral reef in the world?", listOf("there is none", "Lake Tanganyika", "Lake Victoria", "the Amazon"), "Nature", "Freshwater corals do not exist: coral reefs are exclusively marine, as coral polyps need saltwater to survive."),
            zh = LocalizedContent("世界上最大的淡水珊瑚礁是什么？", listOf("不存在", "坦噶尼喀湖", "维多利亚湖", "亚马逊河"), "自然", "淡水珊瑚不存在：珊瑚礁完全是海洋性的，因为珊瑚虫需要盐水才能生存。"),
            es = LocalizedContent("¿Cuál es el mayor arrecife de coral de agua dulce del mundo?", listOf("no existe", "el lago Tanganica", "el lago Victoria", "el Amazonas"), "Naturaleza", "Los corales de agua dulce no existen: los arrecifes de coral son exclusivamente marinos, ya que los pólipos de coral necesitan agua salada para sobrevivir.")
        ),
        BilingualQuestion(
            id = 10682, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'anémones de mer existe-t-il?", listOf("50", "200", "1000", "1100"), "Nature", "Il existe environ 1 100 espèces d'anémones de mer recensées dans le monde, vivant principalement dans les eaux marines peu profondes."),
            en = LocalizedContent("How many kinds of sea anemones are there?", listOf("50", "200", "1000", "1100"), "Nature", "There are about 1,100 species of sea anemones recorded worldwide, living mainly in shallow marine waters."),
            zh = LocalizedContent("海葵有多少种？", listOf("50", "200", "1000", "1100"), "自然", "全球记录的海葵约有1100种，主要生活在浅海海域。"),
            es = LocalizedContent("¿Cuántos tipos de anémonas de mar existen?", listOf("50", "200", "1000", "1100"), "Naturaleza", "Existen alrededor de 1.100 especies de anémonas de mar registradas en el mundo, que viven principalmente en aguas marinas poco profundas.")
        ),
        BilingualQuestion(
            id = 10683, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les nageoires les plus grandes?", listOf("la raie manta", "le poisson-voile", "le poisson-papillon", "le poisson-ange"), "Nature", "La raie manta possède les plus grandes nageoires pectorales parmi les poissons, pouvant atteindre jusqu'à 7 mètres d'envergure, ce qui lui permet de planer gracieusement dans l'eau."),
            en = LocalizedContent("Which animal can have the largest fins?", listOf("manta ray", "sailfish", "butterflyfish", "angelfish"), "Nature", "The manta ray has the largest pectoral fins among fish, reaching up to 7 meters in span, allowing it to glide gracefully in the water."),
            zh = LocalizedContent("哪种动物的鳍最大？", listOf("蝠鲼", "旗鱼", "蝴蝶鱼", "神仙鱼"), "自然", "蝠鲼拥有鱼类中最大的胸鳍，翼展可达7米，使其能在水中优雅地滑翔。"),
            es = LocalizedContent("¿Qué animal puede tener las aletas más grandes?", listOf("la raya manta", "el pez vela", "el pez mariposa", "el pez ángel"), "Naturaleza", "La raya manta posee las aletas pectorales más grandes entre los peces, pudiendo alcanzar hasta 7 metros de envergadura, lo que le permite planear grácilmente en el agua.")
        ),
        BilingualQuestion(
            id = 10684, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand système de sources thermales du monde?", listOf("Yellowstone", "la Vallée de la Mort", "le Geyser Valley", "le Beppu"), "Nature", "Yellowstone abrite le plus vaste ensemble de sources chaudes et geysers actifs de la planète, avec plus de 10 000 formations géothermiques."),
            en = LocalizedContent("What is the largest hot spring system in the world?", listOf("Yellowstone", "Death Valley", "Geyser Valley", "Beppu"), "Nature", "Yellowstone is home to the largest collection of hot springs and active geysers on the planet, with over 10,000 geothermal features."),
            zh = LocalizedContent("世界上最大的温泉系统是什么？", listOf("黄石", "死亡谷", "间歇泉谷", "别府"), "自然", "黄石公园拥有地球上最大的温泉和活跃间歇泉群，超过10000个地热特征。"),
            es = LocalizedContent("¿Cuál es el sistema de aguas termales más grande del mundo?", listOf("Yellowstone", "el Valle de la Muerte", "el Valle de los Géiseres", "Beppu"), "Naturaleza", "Yellowstone alberga el conjunto más grande de aguas termales y géiseres activos del planeta, con más de 10.000 formaciones geotérmicas.")
        ),
        BilingualQuestion(
            id = 10685, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de conchs existe-t-il?", listOf("100", "300", "500", "1000"), "Nature", "Le terme \"conch\" désigne plusieurs espèces de mollusques marins de la famille des Strombidae, et on en recense environ 500 espèces dans le monde."),
            en = LocalizedContent("How many kinds of conchs are there?", listOf("100", "300", "500", "1000"), "Nature", "The term \"conch\" refers to several species of marine mollusks in the family Strombidae, and there are about 500 species worldwide."),
            zh = LocalizedContent("海螺有多少种？", listOf("100", "300", "500", "1000"), "自然", "“海螺”一词指凤螺科多种海洋软体动物，全球约有500种。"),
            es = LocalizedContent("¿Cuántos tipos de caracolas existen?", listOf("100", "300", "500", "1000"), "Naturaleza", "El término \"caracola\" designa varias especies de moluscos marinos de la familia Strombidae, y se cuentan alrededor de 500 especies en el mundo.")
        ),
        BilingualQuestion(
            id = 10686, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la queue la plus longue par rapport à son corps?", listOf("le lion", "le chat", "le poisson-longarina", "la comète"), "Nature", "La longarina, ou poisson-lune queue-de-lyre, possède une queue pouvant atteindre plusieurs fois la longueur de son corps, ce qui en fait le détenteur du record de proportion queue/corps chez les animaux."),
            en = LocalizedContent("Which animal can have the longest tail relative to its body?", listOf("lion", "cat", "longarina fish", "comet"), "Nature", "The longarina, or lyretail moonfish, has a tail that can reach several times the length of its body, making it the record holder for tail-to-body ratio among animals."),
            zh = LocalizedContent("哪种动物的尾巴相对于身体最长？", listOf("狮子", "猫", "长尾鱼", "彗星"), "自然", "长尾鱼（月鱼）的尾巴可达身体长度的数倍，使其成为动物中尾巴与身体比例最大的纪录保持者。"),
            es = LocalizedContent("¿Qué animal puede tener la cola más larga en relación con su cuerpo?", listOf("el león", "el gato", "el pez longarina", "la cometa"), "Naturaleza", "La longarina, o pez luna de cola de lira, posee una cola que puede alcanzar varias veces la longitud de su cuerpo, lo que la convierte en la poseedora del récord de proporción cola/cuerpo entre los animales.")
        ),
        BilingualQuestion(
            id = 10687, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand gisement de pétrole du monde?", listOf("le Ghawar", "le Cantarell", "le Burgan", "le Safaniyah"), "Nature", "Le gisement de Ghawar, situé en Arabie saoudite, est le plus grand champ pétrolier conventionnel jamais découvert, avec des réserves estimées à plus de 70 milliards de barils."),
            en = LocalizedContent("What is the largest oil field in the world?", listOf("Ghawar", "Cantarell", "Burgan", "Safaniyah"), "Nature", "The Ghawar field in Saudi Arabia is the largest conventional oil field ever discovered, with estimated reserves of over 70 billion barrels."),
            zh = LocalizedContent("世界上最大的油田是什么？", listOf("加瓦尔", "坎塔雷尔", "布尔甘", "萨法尼亚"), "自然", "沙特阿拉伯的加瓦尔油田是已发现的最大常规油田，估计储量超过700亿桶。"),
            es = LocalizedContent("¿Cuál es el yacimiento petrolífero más grande del mundo?", listOf("Ghawar", "Cantarell", "Burgan", "Safaniyah"), "Naturaleza", "El yacimiento de Ghawar, en Arabia Saudita, es el campo petrolero convencional más grande jamás descubierto, con reservas estimadas en más de 70 mil millones de barriles.")
        ),
        BilingualQuestion(
            id = 10688, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de nudibranches existe-t-il?", listOf("100", "500", "3000", "5000"), "Nature", "Les nudibranches, mollusques gastéropodes marins, comptent environ 3000 espèces décrites dans le monde, réparties dans divers océans et habitats."),
            en = LocalizedContent("How many kinds of nudibranchs are there?", listOf("100", "500", "3000", "5000"), "Nature", "Nudibranchs, marine gastropod mollusks, have about 3,000 described species worldwide, distributed across various oceans and habitats."),
            zh = LocalizedContent("海蛞蝓有多少种？", listOf("100", "500", "3000", "5000"), "自然", "海蛞蝓（裸鳃类）是海洋腹足类软体动物，全球约有3000种已描述物种，分布于不同海洋和栖息地。"),
            es = LocalizedContent("¿Cuántos tipos de nudibranquios existen?", listOf("100", "500", "3000", "5000"), "Naturaleza", "Los nudibranquios, moluscos gasterópodos marinos, cuentan con alrededor de 3.000 especies descritas en el mundo, distribuidas en diversos océanos y hábitats.")
        ),
        BilingualQuestion(
            id = 10689, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les patins les plus larges par rapport à son poids?", listOf("le lièvre", "le renne", "l'orignal", "le castor"), "Nature", "Les pattes du lièvre arctique sont larges et couvertes de poils, agissant comme des raquettes pour répartir son poids sur la neige molle et éviter de s'enfoncer."),
            en = LocalizedContent("Which animal can have the widest feet relative to its weight?", listOf("hare", "reindeer", "moose", "beaver"), "Nature", "The Arctic hare's feet are wide and covered with fur, acting like snowshoes to distribute its weight on soft snow and prevent sinking."),
            zh = LocalizedContent("哪种动物的脚相对于体重最宽？", listOf("野兔", "驯鹿", "驼鹿", "河狸"), "自然", "北极兔的脚宽大且覆盖毛发，像雪鞋一样分散体重，防止陷入软雪中。"),
            es = LocalizedContent("¿Qué animal puede tener las patas más anchas en relación con su peso?", listOf("la liebre", "el reno", "el alce", "el castor"), "Naturaleza", "Las patas de la liebre ártica son anchas y están cubiertas de pelo, actuando como raquetas para distribuir su peso sobre la nieve blanda y evitar hundirse.")
        ),
        BilingualQuestion(
            id = 10690, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de sel du monde?", listOf("le Salar", "le Lac Rose", "la Mer Morte", "Bonneville Salt Flats"), "Nature", "Le Salar d'Uyuni en Bolivie est le plus grand désert de sel du monde, s'étendant sur plus de 10 000 km²."),
            en = LocalizedContent("What is the largest salt deposit in the world?", listOf("Salar de Uyuni", "Lake Retba", "Dead Sea", "Bonneville Salt Flats"), "Nature", "The Salar de Uyuni in Bolivia is the largest salt desert in the world, spanning over 10,000 km²."),
            zh = LocalizedContent("世界上最大的盐沉积是什么？", listOf("乌尤尼盐沼", "玫瑰湖", "死海", "博纳维尔盐滩"), "自然", "玻利维亚的乌尤尼盐沼是世界上最大的盐沙漠，面积超过10,000平方公里。"),
            es = LocalizedContent("¿Cuál es el depósito de sal más grande del mundo?", listOf("Salar de Uyuni", "Lago Rosa", "Mar Muerto", "Bonneville Salt Flats"), "Naturaleza", "El Salar de Uyuni en Bolivia es el desierto de sal más grande del mundo, con una extensión de más de 10.000 km².")
        ),
        BilingualQuestion(
            id = 10691, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de pennatules existe-t-il?", listOf("50", "200", "300", "500"), "Nature", "Les pennatules, aussi appelées plumes de mer, sont des cnidaires coloniaux. On en dénombre environ 300 espèces différentes dans les océans du monde."),
            en = LocalizedContent("How many species of sea pens exist?", listOf("50", "200", "300", "500"), "Nature", "Sea pens, also known as pennatulaceans, are colonial cnidarians. There are about 300 different species found in the world's oceans."),
            zh = LocalizedContent("海鳃有多少种？", listOf("50", "200", "300", "500"), "自然", "海鳃，也称为海笔，是群体性刺胞动物。全球海洋中约有300种不同的物种。"),
            es = LocalizedContent("¿Cuántas especies de pennatuláceos existen?", listOf("50", "200", "300", "500"), "Naturaleza", "Los pennatuláceos, también conocidos como plumas de mar, son cnidarios coloniales. Se conocen alrededor de 300 especies diferentes en los océanos del mundo.")
        ),
        BilingualQuestion(
            id = 10692, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les griffes les plus longues?", listOf("l'ours", "le pangolin", "le paresseux", "l'oryctérope"), "Nature", "Les paresseux ont des griffes pouvant atteindre jusqu'à 10 centimètres, adaptées pour se suspendre aux branches et se déplacer lentement dans les arbres."),
            en = LocalizedContent("Which animal can have the longest claws?", listOf("bear", "pangolin", "sloth", "aardvark"), "Nature", "Sloths have claws that can reach up to 10 centimeters, adapted for hanging from branches and moving slowly in trees."),
            zh = LocalizedContent("哪种动物的爪子最长？", listOf("熊", "穿山甲", "树懒", "土豚"), "自然", "树懒的爪子可达10厘米，适应于悬挂在树枝上并在树上缓慢移动。"),
            es = LocalizedContent("¿Qué animal puede tener las garras más largas?", listOf("el oso", "el pangolín", "el perezoso", "el cerdo hormiguero"), "Naturaleza", "Los perezosos tienen garras que pueden alcanzar hasta 10 centímetros, adaptadas para colgarse de las ramas y moverse lentamente en los árboles.")
        ),
        BilingualQuestion(
            id = 10693, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand gisement d'or du monde?", listOf("Carlin Trend", "Witwatersrand", "Kalgoorlie", "Sukhoi Log"), "Nature", "Situé dans le Nevada, aux États-Unis, le Carlin Trend est une ceinture géologique qui produit depuis les années 1960 la plus grande quantité d'or au monde, grâce à des gisements sédimentaires uniques."),
            en = LocalizedContent("What is the largest gold deposit in the world?", listOf("Carlin Trend", "Witwatersrand", "Kalgoorlie", "Sukhoi Log"), "Nature", "Located in Nevada, USA, the Carlin Trend is a geological belt that has produced the largest amount of gold in the world since the 1960s, thanks to unique sedimentary deposits."),
            zh = LocalizedContent("世界上最大的金矿是什么？", listOf("卡林趋势", "威特沃特斯兰德", "卡尔古利", "苏霍伊洛格"), "自然", "位于美国内华达州的卡林趋势是一条地质带，自20世纪60年代以来，凭借独特的沉积矿床，生产了世界上最多的黄金。"),
            es = LocalizedContent("¿Cuál es el yacimiento de oro más grande del mundo?", listOf("Carlin Trend", "Witwatersrand", "Kalgoorlie", "Sukhoi Log"), "Naturaleza", "Ubicado en Nevada, EE. UU., el Carlin Trend es una franja geológica que ha producido la mayor cantidad de oro del mundo desde la década de 1960, gracias a depósitos sedimentarios únicos.")
        ),
        BilingualQuestion(
            id = 10694, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de gorgones existe-t-il?", listOf("50", "200", "800", "1500"), "Nature", "Les gorgones, aussi appelées coraux cornés ou coraux mous, comptent environ 800 espèces réparties dans les océans du monde."),
            en = LocalizedContent("How many species of gorgonians exist?", listOf("50", "200", "800", "1500"), "Nature", "Gorgonians, also known as horny corals or soft corals, comprise about 800 species distributed across the world's oceans."),
            zh = LocalizedContent("柳珊瑚有多少种？", listOf("50", "200", "800", "1500"), "自然", "柳珊瑚，也称为角珊瑚或软珊瑚，约有800种，分布于全球海洋。"),
            es = LocalizedContent("¿Cuántas especies de gorgonias existen?", listOf("50", "200", "800", "1500"), "Naturaleza", "Las gorgonias, también conocidas como corales córneos o corales blandos, comprenden alrededor de 800 especies distribuidas en los océanos del mundo.")
        ),
        BilingualQuestion(
            id = 10695, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la membrane alaire la plus grande?", listOf("la chauve-souris", "le ptéranodon", "le caïman noir", "la raie manta"), "Nature", "La membrane alaire des chauves-souris, appelée patagium, s'étend entre les doigts allongés, leur permettant d'atteindre la plus grande envergure parmi les mammifères volants."),
            en = LocalizedContent("Which animal can have the largest wing membrane?", listOf("bat", "pteranodon", "black caiman", "manta ray"), "Nature", "The wing membrane of bats, called the patagium, extends between elongated fingers, allowing them to achieve the largest wingspan among flying mammals."),
            zh = LocalizedContent("哪种动物的翼膜最大？", listOf("蝙蝠", "翼龙", "黑凯门鳄", "蝠鲼"), "自然", "蝙蝠的翼膜称为翼手膜，延伸在细长的手指之间，使它们成为翼展最大的飞行哺乳动物。"),
            es = LocalizedContent("¿Qué animal puede tener la membrana alar más grande?", listOf("el murciélago", "el pteranodonte", "el caimán negro", "la manta raya"), "Naturaleza", "La membrana alar de los murciélagos, llamada patagio, se extiende entre los dedos alargados, permitiéndoles alcanzar la mayor envergadura entre los mamíferos voladores.")
        ),
        BilingualQuestion(
            id = 10696, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de cuivre du monde?", listOf("Escondida", "La Tinta", "Antapaccay", "Chuquicamata"), "Nature", "Située dans le désert d'Atacama au Chili, la mine d'Escondida est la plus grande mine de cuivre du monde en termes de production, exploitée par BHP Billiton, Rio Tinto et un consortium japonais."),
            en = LocalizedContent("What is the largest copper deposit in the world?", listOf("Escondida", "La Tinta", "Antapaccay", "Chuquicamata"), "Nature", "Located in the Atacama Desert in Chile, the Escondida mine is the largest copper mine in the world in terms of production, operated by BHP Billiton, Rio Tinto, and a Japanese consortium."),
            zh = LocalizedContent("世界上最大的铜矿是什么？", listOf("埃斯康迪达", "拉廷塔", "安塔帕卡伊", "丘基卡马塔"), "自然", "位于智利阿塔卡马沙漠的埃斯康迪达矿是世界上产量最大的铜矿，由必和必拓、力拓和一家日本财团运营。"),
            es = LocalizedContent("¿Cuál es el depósito de cobre más grande del mundo?", listOf("Escondida", "La Tinta", "Antapaccay", "Chuquicamata"), "Naturaleza", "Ubicada en el desierto de Atacama en Chile, la mina Escondida es la mina de cobre más grande del mundo en términos de producción, operada por BHP Billiton, Rio Tinto y un consorcio japonés.")
        ),
        BilingualQuestion(
            id = 10697, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'étoiles de mer existe-t-il?", listOf("500", "1000", "2000", "7000"), "Nature", "Il existe environ 7000 espèces d'étoiles de mer recensées dans les océans du monde, variant en taille, couleur et nombre de bras."),
            en = LocalizedContent("How many species of starfish exist?", listOf("500", "1000", "2000", "7000"), "Nature", "There are about 7000 species of starfish recorded in the world's oceans, varying in size, color, and number of arms."),
            zh = LocalizedContent("海星有多少种？", listOf("500", "1000", "2000", "7000"), "自然", "全球海洋中记录的海星约有7000种，大小、颜色和腕足数量各异。"),
            es = LocalizedContent("¿Cuántas especies de estrellas de mar existen?", listOf("500", "1000", "2000", "7000"), "Naturaleza", "Existen aproximadamente 7000 especies de estrellas de mar registradas en los océanos del mundo, que varían en tamaño, color y número de brazos.")
        ),
        BilingualQuestion(
            id = 10698, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les dents les plus tranchantes?", listOf("le requin", "la piranha", "la loutre", "le castor"), "Nature", "Les piranhas possèdent des dents triangulaires et acérées capables de déchirer la chair avec une grande efficacité, ce qui leur confère une réputation de morsure redoutable dans leur environnement aquatique."),
            en = LocalizedContent("Which animal can have the sharpest teeth?", listOf("shark", "piranha", "otter", "beaver"), "Nature", "Piranhas have triangular, sharp teeth capable of tearing flesh with great efficiency, giving them a reputation for a fearsome bite in their aquatic environment."),
            zh = LocalizedContent("哪种动物的牙齿最锋利？", listOf("鲨鱼", "水虎鱼", "水獭", "河狸"), "自然", "水虎鱼拥有三角形且锋利的牙齿，能够高效地撕碎肉，使其在水生环境中以可怕的咬合力著称。"),
            es = LocalizedContent("¿Qué animal puede tener los dientes más afilados?", listOf("el tiburón", "la piraña", "la nutria", "el castor"), "Naturaleza", "Las pirañas poseen dientes triangulares y afilados capaces de desgarrar la carne con gran eficacia, lo que les confiere una reputación de mordedura temible en su entorno acuático.")
        ),
        BilingualQuestion(
            id = 10699, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de diamant du monde?", listOf("Argyle", "Jwaneng", "Ekati", "Victor"), "Nature", "La mine d'Argyle, en Australie-Occidentale, est le plus grand gisement de diamants au monde en volume, bien qu'elle produise principalement des diamants de qualité industrielle."),
            en = LocalizedContent("What is the largest diamond deposit in the world?", listOf("Argyle", "Jwaneng", "Ekati", "Victor"), "Nature", "The Argyle mine in Western Australia is the largest diamond deposit in the world by volume, although it primarily produces industrial-grade diamonds."),
            zh = LocalizedContent("世界上最大的钻石矿是什么？", listOf("阿盖尔", "朱瓦能", "埃卡提", "维克多"), "自然", "西澳大利亚的阿盖尔矿是世界上体积最大的钻石矿床，尽管它主要生产工业级钻石。"),
            es = LocalizedContent("¿Cuál es el depósito de diamantes más grande del mundo?", listOf("Argyle", "Jwaneng", "Ekati", "Victor"), "Naturaleza", "La mina Argyle en Australia Occidental es el yacimiento de diamantes más grande del mundo en volumen, aunque produce principalmente diamantes de calidad industrial.")
        ),
        BilingualQuestion(
            id = 10700, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'oursins existe-t-il?", listOf("300", "500", "1000", "2000"), "Nature", "Il existe environ 1 000 espèces d'oursins réparties dans tous les océans du monde, des eaux peu profondes aux grandes profondeurs."),
            en = LocalizedContent("How many species of sea urchins are there?", listOf("300", "500", "1000", "2000"), "Nature", "There are about 1,000 species of sea urchins distributed across all oceans, from shallow waters to great depths."),
            zh = LocalizedContent("海胆有多少种？", listOf("300", "500", "1000", "2000"), "自然", "全球约有1000种海胆，分布在所有海洋中，从浅水到深海都有。"),
            es = LocalizedContent("¿Cuántas especies de erizos de mar existen?", listOf("300", "500", "1000", "2000"), "Naturaleza", "Existen alrededor de 1000 especies de erizos de mar distribuidas en todos los océanos, desde aguas poco profundas hasta grandes profundidades.")
        ),
        BilingualQuestion(
            id = 10701, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les oreilles les plus sensibles?", listOf("la chauve-souris", "le chat", "l'éléphant", "la chouette"), "Nature", "Les chauves-souris utilisent l'écholocation, émettant des ultrasons et analysant leurs échos pour se déplacer et chasser, ce qui nécessite une ouïe extrêmement fine."),
            en = LocalizedContent("Which animal can have the most sensitive ears?", listOf("bat", "cat", "elephant", "owl"), "Nature", "Bats use echolocation, emitting ultrasounds and analyzing their echoes to navigate and hunt, which requires extremely fine hearing."),
            zh = LocalizedContent("哪种动物的耳朵最灵敏？", listOf("蝙蝠", "猫", "大象", "猫头鹰"), "自然", "蝙蝠利用回声定位，发出超声波并分析回声来导航和捕食，这需要极其敏锐的听觉。"),
            es = LocalizedContent("¿Qué animal puede tener los oídos más sensibles?", listOf("murciélago", "gato", "elefante", "búho"), "Naturaleza", "Los murciélagos usan ecolocalización, emitiendo ultrasonidos y analizando sus ecos para desplazarse y cazar, lo que requiere un oído extremadamente fino.")
        ),
        BilingualQuestion(
            id = 10702, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la plus grande chaîne de montagnes du monde?", listOf("l'Himalaya", "les Andes", "la Cordillère des Andes", "les Rocheuses"), "Nature", "Les Andes s'étendent sur plus de 7 000 kilomètres le long de la côte ouest de l'Amérique du Sud, ce qui en fait la plus longue chaîne de montagnes continentale du monde."),
            en = LocalizedContent("What is the longest mountain range in the world?", listOf("Himalaya", "Andes", "Cordillera de los Andes", "Rockies"), "Nature", "The Andes stretch over 7,000 kilometers along the western coast of South America, making it the longest continental mountain range in the world."),
            zh = LocalizedContent("世界上最长的山脉是什么？", listOf("喜马拉雅山脉", "安第斯山脉", "科迪勒拉山脉", "落基山脉"), "自然", "安第斯山脉沿南美洲西海岸延伸超过7000公里，是世界上最长的大陆山脉。"),
            es = LocalizedContent("¿Cuál es la cordillera más larga del mundo?", listOf("Himalaya", "Andes", "Cordillera de los Andes", "Montañas Rocosas"), "Naturaleza", "Los Andes se extienden a lo largo de más de 7.000 kilómetros por la costa occidental de América del Sur, lo que los convierte en la cordillera continental más larga del mundo.")
        ),
        BilingualQuestion(
            id = 10703, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de concombre de mer existe-t-il?", listOf("100", "300", "1000", "1500"), "Nature", "Il existe environ 1000 espèces de concombres de mer dans le monde, réparties dans tous les océans, des eaux peu profondes aux abysses."),
            en = LocalizedContent("How many species of sea cucumbers are there?", listOf("100", "300", "1000", "1500"), "Nature", "There are about 1000 species of sea cucumbers worldwide, distributed in all oceans, from shallow waters to the abyss."),
            zh = LocalizedContent("海参有多少种？", listOf("100", "300", "1000", "1500"), "自然", "全球约有1000种海参，分布在所有海洋中，从浅水到深海都有。"),
            es = LocalizedContent("¿Cuántas especies de pepinos de mar existen?", listOf("100", "300", "1000", "1500"), "Naturaleza", "Existen alrededor de 1000 especies de pepinos de mar en todo el mundo, distribuidas en todos los océanos, desde aguas poco profundas hasta el abismo.")
        ),
        BilingualQuestion(
            id = 10704, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les narines les plus mobiles?", listOf("le chameau", "le cheval", "l'éléphant", "le lion"), "Nature", "Les chameaux possèdent des narines très mobiles qu'ils peuvent ouvrir et fermer à volonté pour se protéger du sable lors des tempêtes dans le désert."),
            en = LocalizedContent("Which animal can have the most mobile nostrils?", listOf("camel", "horse", "elephant", "lion"), "Nature", "Camels have highly mobile nostrils that they can open and close at will to protect themselves from sand during desert storms."),
            zh = LocalizedContent("哪种动物的鼻孔最灵活？", listOf("骆驼", "马", "大象", "狮子"), "自然", "骆驼的鼻孔非常灵活，可以随意开合，以在沙漠风暴中保护自己免受沙尘侵袭。"),
            es = LocalizedContent("¿Qué animal puede tener las fosas nasales más móviles?", listOf("camello", "caballo", "elefante", "león"), "Naturaleza", "Los camellos poseen fosas nasales muy móviles que pueden abrir y cerrar a voluntad para protegerse de la arena durante las tormentas del desierto.")
        ),
        BilingualQuestion(
            id = 10705, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de charbon du monde?", listOf("la Chine", "la Russie", "l'Australie", "l'Afrique du Sud"), "Nature", "La Chine possède les plus grandes réserves de charbon au monde, concentrées notamment dans les provinces du Shanxi et du Shaanxi, ce qui en fait le premier producteur et consommateur mondial de cette ressource."),
            en = LocalizedContent("What is the largest coal deposit in the world?", listOf("China", "Russia", "Australia", "South Africa"), "Nature", "China has the largest coal reserves in the world, concentrated especially in the provinces of Shanxi and Shaanxi, making it the world's top producer and consumer of this resource."),
            zh = LocalizedContent("世界上最大的煤炭储量在哪里？", listOf("中国", "俄罗斯", "澳大利亚", "南非"), "自然", "中国拥有世界上最大的煤炭储量，主要集中在山西和陕西两省，使其成为该资源的最大生产国和消费国。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de carbón del mundo?", listOf("China", "Rusia", "Australia", "Sudáfrica"), "Naturaleza", "China posee las mayores reservas de carbón del mundo, concentradas especialmente en las provincias de Shanxi y Shaanxi, lo que la convierte en el primer productor y consumidor mundial de este recurso.")
        ),
        BilingualQuestion(
            id = 10706, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de lys de mer existe-t-il?", listOf("50", "200", "600", "1000"), "Nature", "Les lys de mer, ou crinoïdes, sont des échinodermes marins anciens, et environ 600 espèces vivantes sont recensées aujourd'hui."),
            en = LocalizedContent("How many species of sea lilies are there?", listOf("50", "200", "600", "1000"), "Nature", "Sea lilies, or crinoids, are ancient marine echinoderms, and about 600 living species are recorded today."),
            zh = LocalizedContent("海百合有多少种？", listOf("50", "200", "600", "1000"), "自然", "海百合，或称海羊齿，是古老的海洋棘皮动物，目前记录有约600种现存物种。"),
            es = LocalizedContent("¿Cuántas especies de lirios de mar existen?", listOf("50", "200", "600", "1000"), "Naturaleza", "Los lirios de mar, o crinoideos, son equinodermos marinos antiguos, y hoy se registran alrededor de 600 especies vivientes.")
        ),
        BilingualQuestion(
            id = 10707, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les yeux les plus mobiles?", listOf("le caméléon", "la chauve-souris", "le poisson-globe", "le poisson-archer"), "Nature", "Le caméléon possède des yeux capables de bouger indépendamment l'un de l'autre, avec un champ de vision à 360 degrés et une mise au point rapide."),
            en = LocalizedContent("Which animal can have the most mobile eyes?", listOf("chameleon", "bat", "pufferfish", "archerfish"), "Nature", "The chameleon has eyes that can move independently of each other, with a 360-degree field of vision and rapid focusing ability."),
            zh = LocalizedContent("哪种动物的眼睛最灵活？", listOf("变色龙", "蝙蝠", "河豚", "射水鱼"), "自然", "变色龙的眼睛可以独立移动，拥有360度视野和快速对焦能力。"),
            es = LocalizedContent("¿Qué animal puede tener los ojos más móviles?", listOf("camaleón", "murciélago", "pez globo", "pez arquero"), "Naturaleza", "El camaleón posee ojos capaces de moverse independientemente el uno del otro, con un campo de visión de 360 grados y una capacidad de enfoque rápido.")
        ),
        BilingualQuestion(
            id = 10708, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt d'argent du monde?", listOf("Antamina", "Escondida", "Cannington", "Pershing"), "Nature", "La mine de Cannington, située dans le Queensland en Australie, est le plus grand gisement d'argent connu au monde, avec des réserves estimées à plusieurs centaines de millions d'onces."),
            en = LocalizedContent("What is the largest silver deposit in the world?", listOf("Antamina", "Escondida", "Cannington", "Pershing"), "Nature", "The Cannington mine, located in Queensland, Australia, is the largest known silver deposit in the world, with reserves estimated at several hundred million ounces."),
            zh = LocalizedContent("世界上最大的银矿在哪里？", listOf("安塔米纳", "埃斯康迪达", "坎宁顿", "珀欣"), "自然", "位于澳大利亚昆士兰州的坎宁顿矿是世界上已知最大的银矿，储量估计达数亿盎司。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de plata del mundo?", listOf("Antamina", "Escondida", "Cannington", "Pershing"), "Naturaleza", "La mina de Cannington, ubicada en Queensland, Australia, es el mayor yacimiento de plata conocido del mundo, con reservas estimadas en varios cientos de millones de onzas.")
        ),
        BilingualQuestion(
            id = 10709, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de balanes existe-t-il?", listOf("500", "1000", "1200", "2000"), "Nature", "Il existe environ 1200 espèces de balanes, des crustacés marins fixés souvent confondus avec des coquillages."),
            en = LocalizedContent("How many species of barnacles are there?", listOf("500", "1000", "1200", "2000"), "Nature", "There are about 1200 species of barnacles, marine crustaceans that are often mistaken for shellfish."),
            zh = LocalizedContent("藤壶有多少种？", listOf("500", "1000", "1200", "2000"), "自然", "藤壶约有1200种，是一种常被误认为是贝类的海洋甲壳动物。"),
            es = LocalizedContent("¿Cuántas especies de percebes existen?", listOf("500", "1000", "1200", "2000"), "Naturaleza", "Existen alrededor de 1200 especies de percebes, crustáceos marinos que a menudo se confunden con mariscos.")
        ),
        BilingualQuestion(
            id = 10710, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir les pupilles les plus grandes?", listOf("la chauve-souris", "le chat", "le loup", "l'ours"), "Nature", "La chauve-souris possède les plus grandes pupilles proportionnellement à la taille de son corps parmi les mammifères, ce qui optimise sa vision nocturne pour chasser dans l'obscurité."),
            en = LocalizedContent("Which animal can have the largest pupils?", listOf("bat", "cat", "wolf", "bear"), "Nature", "The bat has the largest pupils relative to its body size among mammals, optimizing its night vision for hunting in darkness."),
            zh = LocalizedContent("哪种动物的瞳孔可以最大？", listOf("蝙蝠", "猫", "狼", "熊"), "自然", "蝙蝠的瞳孔相对于其身体大小是哺乳动物中最大的，这优化了它在黑暗中捕猎的夜视能力。"),
            es = LocalizedContent("¿Qué animal puede tener las pupilas más grandes?", listOf("murciélago", "gato", "lobo", "oso"), "Naturaleza", "El murciélago tiene las pupilas más grandes en proporción al tamaño de su cuerpo entre los mamíferos, lo que optimiza su visión nocturna para cazar en la oscuridad.")
        ),
        BilingualQuestion(
            id = 10711, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt d'uranium du monde?", listOf("Kazakhstan", "Canada", "Namibie", "Australie"), "Nature", "Le Kazakhstan possède les plus grandes réserves d'uranium au monde, notamment dans la région du bassin de Chu-Sarysu, et en est le premier producteur mondial depuis 2009."),
            en = LocalizedContent("What is the largest uranium deposit in the world?", listOf("Kazakhstan", "Canada", "Namibia", "Australia"), "Nature", "Kazakhstan has the largest uranium reserves in the world, especially in the Chu-Sarysu basin region, and has been the top global producer since 2009."),
            zh = LocalizedContent("世界上最大的铀矿床在哪里？", listOf("哈萨克斯坦", "加拿大", "纳米比亚", "澳大利亚"), "自然", "哈萨克斯坦拥有世界上最大的铀储量，特别是在楚-萨雷苏盆地地区，并且自2009年以来一直是全球最大的铀生产国。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de uranio del mundo?", listOf("Kazajistán", "Canadá", "Namibia", "Australia"), "Naturaleza", "Kazajistán posee las mayores reservas de uranio del mundo, especialmente en la región de la cuenca de Chu-Sarysu, y es el principal productor mundial desde 2009.")
        ),
        BilingualQuestion(
            id = 10712, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes-mantis existe-t-il?", listOf("100", "300", "600", "1000"), "Nature", "Les crevettes-mantis, ou stomatopodes, comptent environ 600 espèces répertoriées dans le monde, principalement dans les eaux tropicales et subtropicales."),
            en = LocalizedContent("How many species of mantis shrimp are there?", listOf("100", "300", "600", "1000"), "Nature", "Mantis shrimp, or stomatopods, comprise about 600 described species worldwide, mainly in tropical and subtropical waters."),
            zh = LocalizedContent("螳螂虾有多少种？", listOf("100", "300", "600", "1000"), "自然", "螳螂虾，即口足类动物，全球约有600个已描述的物种，主要分布在热带和亚热带水域。"),
            es = LocalizedContent("¿Cuántas especies de camarón mantis existen?", listOf("100", "300", "600", "1000"), "Naturaleza", "Los camarones mantis, o estomatópodos, comprenden alrededor de 600 especies descritas en todo el mundo, principalmente en aguas tropicales y subtropicales.")
        ),
        BilingualQuestion(
            id = 10713, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la pupille la plus dilatée?", listOf("la chauve-souris", "la chouette", "le hibou", "le chat"), "Nature", "La chouette possède une pupille extrêmement dilatable pour capter un maximum de lumière lors de ses chasses nocturnes, ce qui lui confère une excellente vision dans l'obscurité."),
            en = LocalizedContent("Which animal can have the most dilated pupil?", listOf("bat", "barn owl", "owl", "cat"), "Nature", "The barn owl has an extremely dilatable pupil to capture maximum light during its nocturnal hunts, giving it excellent vision in darkness."),
            zh = LocalizedContent("哪种动物的瞳孔可以扩张到最大？", listOf("蝙蝠", "仓鸮", "猫头鹰", "猫"), "自然", "仓鸮的瞳孔可以极度扩张，以便在夜间捕猎时捕捉最大量的光线，使其在黑暗中拥有出色的视力。"),
            es = LocalizedContent("¿Qué animal puede tener la pupila más dilatada?", listOf("murciélago", "lechuza", "búho", "gato"), "Naturaleza", "La lechuza tiene una pupila extremadamente dilatable para captar la máxima luz durante sus cacerías nocturnas, lo que le proporciona una excelente visión en la oscuridad.")
        ),
        BilingualQuestion(
            id = 10714, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de zinc du monde?", listOf("Aitik", "Fridays", "Zafranal", "Antamina"), "Nature", "La mine d'Antamina, située au Pérou, est l'une des plus grandes mines de zinc au monde, produisant également du cuivre et d'autres métaux."),
            en = LocalizedContent("What is the largest zinc deposit in the world?", listOf("Aitik", "Fridays", "Zafranal", "Antamina"), "Nature", "The Antamina mine in Peru is one of the largest zinc mines in the world, also producing copper and other metals."),
            zh = LocalizedContent("世界上最大的锌矿床是哪个？", listOf("Aitik", "Fridays", "Zafranal", "Antamina"), "自然", "位于秘鲁的安塔米纳矿是世界上最大的锌矿之一，同时也生产铜和其他金属。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de zinc del mundo?", listOf("Aitik", "Fridays", "Zafranal", "Antamina"), "Naturaleza", "La mina Antamina en Perú es una de las minas de zinc más grandes del mundo, produciendo también cobre y otros metales.")
        ),
        BilingualQuestion(
            id = 10715, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de mollusques bivalves existe-t-il?", listOf("500", "2000", "3500", "5000"), "Nature", "Il existe environ 3500 espèces de mollusques bivalves, un groupe qui inclut les moules, huîtres, palourdes et coquilles Saint-Jacques."),
            en = LocalizedContent("How many species of bivalve mollusks are there?", listOf("500", "2000", "3500", "5000"), "Nature", "There are about 3500 species of bivalve mollusks, a group that includes mussels, oysters, clams, and scallops."),
            zh = LocalizedContent("双壳类软体动物有多少种？", listOf("500", "2000", "3500", "5000"), "自然", "双壳类软体动物约有3500种，包括贻贝、牡蛎、蛤蜊和扇贝等。"),
            es = LocalizedContent("¿Cuántas especies de moluscos bivalvos existen?", listOf("500", "2000", "3500", "5000"), "Naturaleza", "Existen alrededor de 3500 especies de moluscos bivalvos, un grupo que incluye mejillones, ostras, almejas y vieiras.")
        ),
        BilingualQuestion(
            id = 10716, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut avoir la meilleure vision nocturne?", listOf("la chouette", "la chauve-souris", "le loup", "le chat"), "Nature", "Les yeux de la chouette contiennent un nombre élevé de bâtonnets, cellules photoréceptrices très sensibles à la lumière, et un tapetum lucidum qui réfléchit la lumière, lui offrant une vision nocturne exceptionnelle pour chasser dans l'obscurité."),
            en = LocalizedContent("Which animal can have the best night vision?", listOf("owl", "bat", "wolf", "cat"), "Nature", "The owl's eyes contain a high number of rods, photoreceptor cells very sensitive to light, and a tapetum lucidum that reflects light, giving it exceptional night vision for hunting in darkness."),
            zh = LocalizedContent("哪种动物的夜视能力最好？", listOf("猫头鹰", "蝙蝠", "狼", "猫"), "自然", "猫头鹰的眼睛含有大量的视杆细胞（对光非常敏感的光感受器细胞）和反光膜（tapetum lucidum），使其在黑暗中拥有非凡的夜视能力以进行捕猎。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor visión nocturna?", listOf("búho", "murciélago", "lobo", "gato"), "Naturaleza", "Los ojos del búho contienen una gran cantidad de bastones, células fotorreceptoras muy sensibles a la luz, y un tapetum lucidum que refleja la luz, brindándole una visión nocturna excepcional para cazar en la oscuridad.")
        ),
        BilingualQuestion(
            id = 10717, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de nickel du monde?", listOf("la Russie", "l'Australie", "l'Indonésie", "le Canada"), "Nature", "L'Australie abrite le plus grand dépôt de nickel au monde, situé dans la région de Kalgoorlie, en Australie-Occidentale, avec des réserves estimées à plusieurs millions de tonnes."),
            en = LocalizedContent("What is the largest nickel deposit in the world?", listOf("Russia", "Australia", "Indonesia", "Canada"), "Nature", "Australia hosts the largest nickel deposit in the world, located in the Kalgoorlie region of Western Australia, with reserves estimated at several million tons."),
            zh = LocalizedContent("世界上最大的镍矿床在哪里？", listOf("俄罗斯", "澳大利亚", "印度尼西亚", "加拿大"), "自然", "澳大利亚拥有世界上最大的镍矿床，位于西澳大利亚的卡尔古利地区，储量估计达数百万吨。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de níquel del mundo?", listOf("Rusia", "Australia", "Indonesia", "Canadá"), "Naturaleza", "Australia alberga el mayor depósito de níquel del mundo, ubicado en la región de Kalgoorlie, Australia Occidental, con reservas estimadas en varios millones de toneladas.")
        ),
        BilingualQuestion(
            id = 10718, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes royales existe-t-il?", listOf("5", "10", "20", "50"), "Nature", "La crevette royale est une appellation commerciale qui regroupe environ 20 espèces différentes du genre Penaeus, principalement élevées ou pêchées pour la consommation."),
            en = LocalizedContent("How many species of royal shrimp are there?", listOf("5", "10", "20", "50"), "Nature", "Royal shrimp is a commercial name that groups about 20 different species of the genus Penaeus, mainly farmed or caught for consumption."),
            zh = LocalizedContent("帝王虾有多少种？", listOf("5", "10", "20", "50"), "自然", "帝王虾是一个商业名称，涵盖了约20种不同的对虾属（Penaeus）物种，主要用于养殖或捕捞供食用。"),
            es = LocalizedContent("¿Cuántas especies de camarón real existen?", listOf("5", "10", "20", "50"), "Naturaleza", "El camarón real es un nombre comercial que agrupa alrededor de 20 especies diferentes del género Penaeus, principalmente cultivadas o capturadas para consumo.")
        ),
        BilingualQuestion(
            id = 10719, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure vision en couleur?", listOf("l'abeille", "le perroquet", "le mantis", "le poisson"), "Nature", "Certains poissons, comme le poisson-mandarin, possèdent jusqu'à quatre types de cônes dans leurs yeux, leur permettant de voir plus de couleurs que les humains."),
            en = LocalizedContent("Which animal can have the best color vision?", listOf("bee", "parrot", "mantis shrimp", "fish"), "Nature", "Some fish, like the mandarinfish, have up to four types of cones in their eyes, allowing them to see more colors than humans."),
            zh = LocalizedContent("哪种动物的色觉最好？", listOf("蜜蜂", "鹦鹉", "螳螂虾", "鱼"), "自然", "某些鱼类，如花斑连鳍䲗（mandarinfish），眼睛中拥有多达四种类型的视锥细胞，使它们能够看到比人类更多的颜色。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor visión en color?", listOf("abeja", "loro", "camarón mantis", "pez"), "Naturaleza", "Algunos peces, como el pez mandarín, poseen hasta cuatro tipos de conos en sus ojos, lo que les permite ver más colores que los humanos.")
        ),
        BilingualQuestion(
            id = 10720, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de platine du monde?", listOf("la Russie", "l'Afrique du Sud", "le Zimbabwe", "le Canada"), "Nature", "L'Afrique du Sud possède le complexe du Bushveld, qui contient environ 70% des réserves mondiales de platine."),
            en = LocalizedContent("What is the largest platinum deposit in the world?", listOf("Russia", "South Africa", "Zimbabwe", "Canada"), "Nature", "South Africa has the Bushveld Complex, which contains about 70% of the world's platinum reserves."),
            zh = LocalizedContent("世界上最大的铂矿床在哪里？", listOf("俄罗斯", "南非", "津巴布韦", "加拿大"), "自然", "南非拥有布什维尔德杂岩体，其中包含全球约70%的铂储量。"),
            es = LocalizedContent("¿Cuál es el depósito de platino más grande del mundo?", listOf("Rusia", "Sudáfrica", "Zimbabue", "Canadá"), "Naturaleza", "Sudáfrica posee el Complejo Bushveld, que contiene aproximadamente el 70% de las reservas mundiales de platino.")
        ),
        BilingualQuestion(
            id = 10721, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de coquilles Saint-Jacques existe-t-il?", listOf("50", "200", "500", "1000"), "Nature", "La coquille Saint-Jacques désigne en réalité plusieurs espèces du genre Pecten, dont environ 500 variétés sont répertoriées dans le monde, principalement dans les eaux tempérées et froides."),
            en = LocalizedContent("How many kinds of scallops are there?", listOf("50", "200", "500", "1000"), "Nature", "Scallops refer to several species of the genus Pecten, with about 500 varieties recorded worldwide, mainly in temperate and cold waters."),
            zh = LocalizedContent("扇贝有多少种？", listOf("50", "200", "500", "1000"), "自然", "扇贝实际上指扇贝属的多个物种，全球记录约有500种，主要分布在温带和冷水水域。"),
            es = LocalizedContent("¿Cuántos tipos de vieiras existen?", listOf("50", "200", "500", "1000"), "Naturaleza", "Las vieiras se refieren a varias especies del género Pecten, con alrededor de 500 variedades registradas en todo el mundo, principalmente en aguas templadas y frías.")
        ),
        BilingualQuestion(
            id = 10722, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la plus grande surface rétinienne par rapport à son œil?", listOf("l'aigle", "le faucon", "la libellule", "l'araignée"), "Nature", "Les libellules possèdent des yeux composés géants qui couvrent presque toute leur tête, chaque œil contenant jusqu'à 30 000 facettes, ce qui leur offre un champ de vision quasi total de 360 degrés."),
            en = LocalizedContent("Which animal can have the largest retinal surface area relative to its eye?", listOf("eagle", "falcon", "dragonfly", "spider"), "Nature", "Dragonflies have giant compound eyes that cover almost their entire head, each eye containing up to 30,000 facets, giving them a nearly 360-degree field of vision."),
            zh = LocalizedContent("哪种动物相对于其眼睛拥有最大的视网膜表面积？", listOf("鹰", "隼", "蜻蜓", "蜘蛛"), "自然", "蜻蜓拥有巨大的复眼，几乎覆盖整个头部，每只眼睛包含多达3万个小眼，提供近乎360度的视野。"),
            es = LocalizedContent("¿Qué animal puede tener la mayor superficie retiniana en relación con su ojo?", listOf("águila", "halcón", "libélula", "araña"), "Naturaleza", "Las libélulas tienen ojos compuestos gigantes que cubren casi toda su cabeza, cada ojo contiene hasta 30,000 facetas, lo que les otorga un campo de visión de casi 360 grados.")
        ),
        BilingualQuestion(
            id = 10723, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de cobalt du monde?", listOf("la République Démocratique du Congo", "la Chine", "la Russie", "l'Afrique du Sud"), "Nature", "La République Démocratique du Congo possède les plus grandes réserves mondiales de cobalt, concentrées dans la région du Katanga, représentant environ 50% des ressources globales."),
            en = LocalizedContent("What is the largest cobalt deposit in the world?", listOf("Democratic Republic of the Congo", "China", "Russia", "South Africa"), "Nature", "The Democratic Republic of the Congo has the world's largest cobalt reserves, concentrated in the Katanga region, representing about 50% of global resources."),
            zh = LocalizedContent("世界上最大的钴矿床在哪里？", listOf("刚果民主共和国", "中国", "俄罗斯", "南非"), "自然", "刚果民主共和国拥有全球最大的钴储量，集中在加丹加地区，约占全球资源的50%。"),
            es = LocalizedContent("¿Cuál es el depósito de cobalto más grande del mundo?", listOf("República Democrática del Congo", "China", "Rusia", "Sudáfrica"), "Naturaleza", "La República Democrática del Congo posee las mayores reservas mundiales de cobalto, concentradas en la región de Katanga, que representan aproximadamente el 50% de los recursos globales.")
        ),
        BilingualQuestion(
            id = 10724, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de pectens existe-t-il?", listOf("100", "300", "500", "1000"), "Nature", "Les pectens, ou pétoncles, comptent environ 500 espèces vivantes réparties dans les océans du monde entier."),
            en = LocalizedContent("How many kinds of pectens are there?", listOf("100", "300", "500", "1000"), "Nature", "Pectens, or scallops, comprise about 500 living species distributed across the world's oceans."),
            zh = LocalizedContent("扇贝属有多少种？", listOf("100", "300", "500", "1000"), "自然", "扇贝属（Pecten）约有500个现存物种，分布在全球各大洋。"),
            es = LocalizedContent("¿Cuántos tipos de pectens existen?", listOf("100", "300", "500", "1000"), "Naturaleza", "Los pectens, o vieiras, comprenden alrededor de 500 especies vivientes distribuidas en los océanos del mundo.")
        ),
        BilingualQuestion(
            id = 10725, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure acuité visuelle?", listOf("l'aigle", "le faucon pèlerin", "le mercredi", "l'autruche"), "Nature", "Le faucon pèlerin possède une vision capable de repérer une proie à plus d'un kilomètre, grâce à une densité exceptionnelle de photorécepteurs dans sa rétine."),
            en = LocalizedContent("Which animal can have the best visual acuity?", listOf("eagle", "peregrine falcon", "Wednesday", "ostrich"), "Nature", "The peregrine falcon has vision capable of spotting prey from over a kilometer away, thanks to an exceptional density of photoreceptors in its retina."),
            zh = LocalizedContent("哪种动物拥有最佳的视力？", listOf("鹰", "游隼", "星期三", "鸵鸟"), "自然", "游隼的视力能够在一公里外发现猎物，这得益于其视网膜中极高的光感受器密度。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor agudeza visual?", listOf("águila", "halcón peregrino", "miércoles", "avestruz"), "Naturaleza", "El halcón peregrino posee una visión capaz de detectar una presa a más de un kilómetro de distancia, gracias a una densidad excepcional de fotorreceptores en su retina.")
        ),
        BilingualQuestion(
            id = 10726, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de manganèse du monde?", listOf("l'Afrique du Sud", "la Russie", "l'Australie", "l'Ukraine"), "Nature", "L'Afrique du Sud possède le plus grand dépôt de manganèse au monde, situé dans le bassin du Kalahari, qui contient environ 80 % des réserves mondiales connues."),
            en = LocalizedContent("What is the largest manganese deposit in the world?", listOf("South Africa", "Russia", "Australia", "Ukraine"), "Nature", "South Africa has the largest manganese deposit in the world, located in the Kalahari Basin, which contains about 80% of known global reserves."),
            zh = LocalizedContent("世界上最大的锰矿床在哪里？", listOf("南非", "俄罗斯", "澳大利亚", "乌克兰"), "自然", "南非拥有世界上最大的锰矿床，位于卡拉哈里盆地，约占全球已知储量的80%。"),
            es = LocalizedContent("¿Cuál es el depósito de manganeso más grande del mundo?", listOf("Sudáfrica", "Rusia", "Australia", "Ucrania"), "Naturaleza", "Sudáfrica posee el depósito de manganeso más grande del mundo, ubicado en la cuenca del Kalahari, que contiene aproximadamente el 80% de las reservas mundiales conocidas.")
        ),
        BilingualQuestion(
            id = 10727, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'huître perlière existe-t-il?", listOf("5", "10", "20", "50"), "Nature", "Il existe environ 20 espèces d'huîtres perlières, principalement des genres Pinctada et Pteria, qui produisent des perles naturelles."),
            en = LocalizedContent("How many kinds of pearl oysters are there?", listOf("5", "10", "20", "50"), "Nature", "There are about 20 species of pearl oysters, mainly from the genera Pinctada and Pteria, which produce natural pearls."),
            zh = LocalizedContent("珍珠贝有多少种？", listOf("5", "10", "20", "50"), "自然", "珍珠贝约有20个物种，主要来自珠母贝属（Pinctada）和翼贝属（Pteria），它们能产生天然珍珠。"),
            es = LocalizedContent("¿Cuántos tipos de ostras perleras existen?", listOf("5", "10", "20", "50"), "Naturaleza", "Existen alrededor de 20 especies de ostras perleras, principalmente de los géneros Pinctada y Pteria, que producen perlas naturales.")
        ),
        BilingualQuestion(
            id = 10728, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la plus grande résolution rétinienne?", listOf("le faucon", "l'aigle", "la mouche", "le mantis"), "Nature", "Le faucon possède une densité exceptionnelle de photorécepteurs dans sa rétine, lui offrant une acuité visuelle jusqu'à huit fois supérieure à celle de l'humain."),
            en = LocalizedContent("Which animal can have the highest retinal resolution?", listOf("falcon", "eagle", "fly", "mantis"), "Nature", "The falcon has an exceptional density of photoreceptors in its retina, giving it visual acuity up to eight times that of humans."),
            zh = LocalizedContent("哪种动物拥有最高的视网膜分辨率？", listOf("隼", "鹰", "苍蝇", "螳螂"), "自然", "隼的视网膜中光感受器密度极高，其视力可达人类的八倍。"),
            es = LocalizedContent("¿Qué animal puede tener la mayor resolución retiniana?", listOf("halcón", "águila", "mosca", "mantis"), "Naturaleza", "El halcón posee una densidad excepcional de fotorreceptores en su retina, lo que le otorga una agudeza visual hasta ocho veces superior a la humana.")
        ),
        BilingualQuestion(
            id = 10729, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de lithium du monde?", listOf("la Chili", "l'Argentine", "la Bolivie", "l'Australie"), "Nature", "Le Chili abrite le plus grand dépôt de lithium au monde dans le salar d'Atacama, qui concentre environ 40% des réserves mondiales de ce métal essentiel aux batteries."),
            en = LocalizedContent("What is the largest lithium deposit in the world?", listOf("Chile", "Argentina", "Bolivia", "Australia"), "Nature", "Chile is home to the world's largest lithium deposit in the Salar de Atacama, which concentrates about 40% of global lithium reserves, essential for batteries."),
            zh = LocalizedContent("世界上最大的锂矿床在哪里？", listOf("智利", "阿根廷", "玻利维亚", "澳大利亚"), "自然", "智利的阿塔卡马盐沼拥有世界上最大的锂矿床，集中了全球约40%的锂储量，这种金属对电池至关重要。"),
            es = LocalizedContent("¿Cuál es el depósito de litio más grande del mundo?", listOf("Chile", "Argentina", "Bolivia", "Australia"), "Naturaleza", "Chile alberga el depósito de litio más grande del mundo en el Salar de Atacama, que concentra aproximadamente el 40% de las reservas mundiales de este metal esencial para las baterías.")
        ),
        BilingualQuestion(
            id = 10730, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de palourdes existe-t-il?", listOf("100", "500", "1000", "2000"), "Nature", "Les palourdes désignent un groupe très large de mollusques bivalves marins, avec environ 1 000 espèces répertoriées dans le monde."),
            en = LocalizedContent("How many species of clams are there?", listOf("100", "500", "1000", "2000"), "Nature", "Clams refer to a very broad group of marine bivalve mollusks, with approximately 1,000 species recorded worldwide."),
            zh = LocalizedContent("蛤蜊有多少种？", listOf("100", "500", "1000", "2000"), "自然", "蛤蜊指代一个非常广泛的海洋双壳类软体动物群体，全球约有1000种记录在案。"),
            es = LocalizedContent("¿Cuántas especies de almejas existen?", listOf("100", "500", "1000", "2000"), "Naturaleza", "Las almejas se refieren a un grupo muy amplio de moluscos bivalvos marinos, con aproximadamente 1,000 especies registradas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 10731, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir le plus large spectre de sensibilité lumineuse?", listOf("le mantis", "l'abeille", "le poisson", "la mouche"), "Nature", "La mante crevette possède jusqu'à 16 types de photorécepteurs, contre trois pour l'humain, lui permettant de percevoir une gamme exceptionnelle de couleurs et de lumières polarisées."),
            en = LocalizedContent("Which animal can have the widest range of light sensitivity?", listOf("mantis shrimp", "bee", "fish", "fly"), "Nature", "The mantis shrimp has up to 16 types of photoreceptors, compared to three in humans, allowing it to perceive an exceptional range of colors and polarized light."),
            zh = LocalizedContent("哪种动物具有最广的光敏感范围？", listOf("螳螂虾", "蜜蜂", "鱼", "苍蝇"), "自然", "螳螂虾拥有多达16种光感受器，而人类只有三种，使其能够感知异常广泛的颜色和偏振光。"),
            es = LocalizedContent("¿Qué animal puede tener el rango más amplio de sensibilidad lumínica?", listOf("camarón mantis", "abeja", "pez", "mosca"), "Naturaleza", "El camarón mantis posee hasta 16 tipos de fotorreceptores, frente a tres en los humanos, lo que le permite percibir una gama excepcional de colores y luz polarizada.")
        ),
        BilingualQuestion(
            id = 10732, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt d'étain du monde?", listOf("la Chine", "l'Indonésie", "la Malaisie", "la Birmanie"), "Nature", "L'Indonésie possède les plus grandes réserves d'étain au monde, principalement concentrées dans les îles de Bangka et Belitung."),
            en = LocalizedContent("What is the largest tin deposit in the world?", listOf("China", "Indonesia", "Malaysia", "Myanmar"), "Nature", "Indonesia has the largest tin reserves in the world, mainly concentrated on the islands of Bangka and Belitung."),
            zh = LocalizedContent("世界上最大的锡矿藏在哪里？", listOf("中国", "印度尼西亚", "马来西亚", "缅甸"), "自然", "印度尼西亚拥有世界上最大的锡储量，主要集中在邦加岛和勿里洞岛。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de estaño del mundo?", listOf("China", "Indonesia", "Malasia", "Birmania"), "Naturaleza", "Indonesia posee las mayores reservas de estaño del mundo, concentradas principalmente en las islas de Bangka y Belitung.")
        ),
        BilingualQuestion(
            id = 10733, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de myes existe-t-il?", listOf("10", "20", "50", "100"), "Nature", "Le terme \"mye\" désigne plusieurs espèces de mollusques bivalves marins, et on en recense environ 50 espèces différentes dans le monde."),
            en = LocalizedContent("How many species of soft-shell clams are there?", listOf("10", "20", "50", "100"), "Nature", "The term \"soft-shell clam\" refers to several species of marine bivalve mollusks, with about 50 different species recorded worldwide."),
            zh = LocalizedContent("软壳蛤有多少种？", listOf("10", "20", "50", "100"), "自然", "“软壳蛤”一词指代多种海洋双壳类软体动物，全球约有50种不同的物种记录。"),
            es = LocalizedContent("¿Cuántas especies de almejas de concha blanda existen?", listOf("10", "20", "50", "100"), "Naturaleza", "El término \"almeja de concha blanda\" se refiere a varias especies de moluscos bivalvos marinos, con alrededor de 50 especies diferentes registradas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 10734, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la plus grande densité de cônes dans la rétine?", listOf("l'abeille", "le mantis", "le poisson", "le perroquet"), "Nature", "La mante religieuse possède une rétine avec une densité exceptionnelle de cônes, lui permettant une vision précise des mouvements et des couleurs."),
            en = LocalizedContent("Which animal can have the highest density of cones in the retina?", listOf("bee", "mantis", "fish", "parrot"), "Nature", "The mantis shrimp has a retina with an exceptional density of cones, allowing precise vision of movements and colors."),
            zh = LocalizedContent("哪种动物的视网膜中视锥细胞密度最高？", listOf("蜜蜂", "螳螂", "鱼", "鹦鹉"), "自然", "螳螂虾的视网膜具有异常高的视锥细胞密度，使其能够精确感知运动和颜色。"),
            es = LocalizedContent("¿Qué animal puede tener la mayor densidad de conos en la retina?", listOf("abeja", "mantis", "pez", "loro"), "Naturaleza", "El camarón mantis tiene una retina con una densidad excepcional de conos, lo que le permite una visión precisa de movimientos y colores.")
        ),
        BilingualQuestion(
            id = 10735, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de tungstène du monde?", listOf("la Chine", "le Canada", "la Russie", "le Pérou"), "Nature", "La Chine possède les plus grandes réserves mondiales de tungstène, concentrées principalement dans la province du Jiangxi, ce qui en fait le premier producteur et exportateur de ce métal stratégique."),
            en = LocalizedContent("What is the largest tungsten deposit in the world?", listOf("China", "Canada", "Russia", "Peru"), "Nature", "China has the largest tungsten reserves in the world, mainly concentrated in Jiangxi province, making it the top producer and exporter of this strategic metal."),
            zh = LocalizedContent("世界上最大的钨矿藏在哪里？", listOf("中国", "加拿大", "俄罗斯", "秘鲁"), "自然", "中国拥有世界上最大的钨储量，主要集中在江西省，使其成为这种战略金属的最大生产国和出口国。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de tungsteno del mundo?", listOf("China", "Canadá", "Rusia", "Perú"), "Naturaleza", "China posee las mayores reservas mundiales de tungsteno, concentradas principalmente en la provincia de Jiangxi, lo que la convierte en el principal productor y exportador de este metal estratégico.")
        ),
        BilingualQuestion(
            id = 10736, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes grises existe-t-il?", listOf("1", "2", "3", "5"), "Nature", "La crevette grise se décline en deux espèces principales : la crevette grise commune (Crangon crangon) et la crevette grise des sables (Crangon allmanni)."),
            en = LocalizedContent("How many species of brown shrimp are there?", listOf("1", "2", "3", "5"), "Nature", "Brown shrimp comes in two main species: the common brown shrimp (Crangon crangon) and the sand shrimp (Crangon allmanni)."),
            zh = LocalizedContent("褐虾有多少种？", listOf("1", "2", "3", "5"), "自然", "褐虾主要有两种：普通褐虾（Crangon crangon）和沙褐虾（Crangon allmanni）。"),
            es = LocalizedContent("¿Cuántas especies de camarón gris existen?", listOf("1", "2", "3", "5"), "Naturaleza", "El camarón gris se presenta en dos especies principales: el camarón gris común (Crangon crangon) y el camarón gris de arena (Crangon allmanni).")
        ),
        BilingualQuestion(
            id = 10737, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure sensibilité à la polarisation de la lumière?", listOf("l'abeille", "le mantis", "la libellule", "le poisson"), "Nature", "La libellule possède des photorécepteurs spécialisés dans ses yeux composés, lui permettant de détecter la lumière polarisée avec une précision inégalée, ce qui l’aide à naviguer et à chasser."),
            en = LocalizedContent("Which animal can have the best sensitivity to polarized light?", listOf("bee", "mantis", "dragonfly", "fish"), "Nature", "The dragonfly has specialized photoreceptors in its compound eyes, allowing it to detect polarized light with unmatched precision, aiding navigation and hunting."),
            zh = LocalizedContent("哪种动物对偏振光的敏感度最高？", listOf("蜜蜂", "螳螂", "蜻蜓", "鱼"), "自然", "蜻蜓的复眼中有专门的光感受器，使其能够以无与伦比的精度检测偏振光，有助于导航和捕猎。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor sensibilidad a la luz polarizada?", listOf("abeja", "mantis", "libélula", "pez"), "Naturaleza", "La libélula posee fotorreceptores especializados en sus ojos compuestos, lo que le permite detectar la luz polarizada con una precisión inigualable, ayudándola a navegar y cazar.")
        ),
        BilingualQuestion(
            id = 10738, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de molybdène du monde?", listOf("la Chine", "le Chili", "le Pérou", "la Russie"), "Nature", "Le Chili abrite le plus grand gisement de molybdène au monde, situé dans la mine de Chuquicamata, l'une des plus grandes mines à ciel ouvert de la planète."),
            en = LocalizedContent("What is the largest molybdenum deposit in the world?", listOf("China", "Chile", "Peru", "Russia"), "Nature", "Chile is home to the largest molybdenum deposit in the world, located at the Chuquicamata mine, one of the largest open-pit mines on the planet."),
            zh = LocalizedContent("世界上最大的钼矿藏在哪里？", listOf("中国", "智利", "秘鲁", "俄罗斯"), "自然", "智利拥有世界上最大的钼矿床，位于丘基卡马塔矿，这是地球上最大的露天矿之一。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de molibdeno del mundo?", listOf("China", "Chile", "Perú", "Rusia"), "Naturaleza", "Chile alberga el mayor yacimiento de molibdeno del mundo, ubicado en la mina Chuquicamata, una de las minas a cielo abierto más grandes del planeta.")
        ),
        BilingualQuestion(
            id = 10739, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes Ikura existe-t-il?", listOf("1", "2", "3", "5"), "Nature", "Ikura désigne exclusivement les œufs de saumon, et non une crevette. Il n'existe donc qu'une seule sorte d'ikura, celle issue du saumon."),
            en = LocalizedContent("How many types of Ikura shrimp are there?", listOf("1", "2", "3", "5"), "Nature", "Ikura refers exclusively to salmon roe, not a shrimp. Therefore, there is only one type of ikura, that from salmon."),
            zh = LocalizedContent("Ikura虾有多少种？", listOf("1", "2", "3", "5"), "自然", "Ikura特指鲑鱼卵，而非虾。因此，只有一种ikura，即来自鲑鱼的鱼卵。"),
            es = LocalizedContent("¿Cuántos tipos de camarón Ikura existen?", listOf("1", "2", "3", "5"), "Naturaleza", "Ikura se refiere exclusivamente a las huevas de salmón, no a un camarón. Por lo tanto, solo existe un tipo de ikura, el del salmón.")
        ),
        BilingualQuestion(
            id = 10740, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de discrimination de fréquences lumineuses?", listOf("le mantis", "le poisson", "l'abeille", "le perroquet"), "Nature", "La crevette-mante possède jusqu'à 16 types de photorécepteurs, contre trois pour l'humain, lui offrant la vision la plus complexe du règne animal."),
            en = LocalizedContent("Which animal can have the best ability to discriminate light frequencies?", listOf("mantis shrimp", "fish", "bee", "parrot"), "Nature", "The mantis shrimp has up to 16 types of photoreceptors, compared to three in humans, giving it the most complex vision in the animal kingdom."),
            zh = LocalizedContent("哪种动物对光频率的辨别能力最强？", listOf("螳螂虾", "鱼", "蜜蜂", "鹦鹉"), "自然", "螳螂虾拥有多达16种光感受器，而人类只有三种，使其拥有动物界最复杂的视觉系统。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad para discriminar frecuencias de luz?", listOf("la gamba mantis", "el pez", "la abeja", "el loro"), "Naturaleza", "La gamba mantis posee hasta 16 tipos de fotorreceptores, frente a tres en los humanos, lo que le otorga la visión más compleja del reino animal.")
        ),
        BilingualQuestion(
            id = 10741, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de vanadium du monde?", listOf("la Chine", "la Russie", "l'Afrique du Sud", "l'Australie"), "Nature", "La Russie abrite le plus grand gisement de vanadium au monde, situé dans la région de l'Oural, avec des réserves estimées à plusieurs millions de tonnes."),
            en = LocalizedContent("What is the largest vanadium deposit in the world?", listOf("China", "Russia", "South Africa", "Australia"), "Nature", "Russia hosts the largest vanadium deposit in the world, located in the Ural region, with reserves estimated at several million tons."),
            zh = LocalizedContent("世界上最大的钒矿床在哪里？", listOf("中国", "俄罗斯", "南非", "澳大利亚"), "自然", "俄罗斯拥有世界上最大的钒矿床，位于乌拉尔地区，储量估计达数百万吨。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de vanadio del mundo?", listOf("China", "Rusia", "Sudáfrica", "Australia"), "Naturaleza", "Rusia alberga el mayor yacimiento de vanadio del mundo, situado en la región de los Urales, con reservas estimadas en varios millones de toneladas.")
        ),
        BilingualQuestion(
            id = 10742, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes-chevrettes existe-t-il?", listOf("100", "300", "1000", "3000"), "Nature", "Le terme \"crevette-chevette\" est un nom vernaculaire qui regroupe environ 1000 espèces différentes de crevettes d'eau douce et d'eau saumâtre, principalement de la famille des Atyidae."),
            en = LocalizedContent("How many species of ghost shrimp are there?", listOf("100", "300", "1000", "3000"), "Nature", "The term 'ghost shrimp' is a common name that encompasses about 1000 different species of freshwater and brackish water shrimp, mainly from the family Atyidae."),
            zh = LocalizedContent("幽灵虾有多少种？", listOf("100", "300", "1000", "3000"), "自然", "“幽灵虾”是一个通用名称，涵盖约1000种不同的淡水及半咸水虾类，主要属于匙指虾科。"),
            es = LocalizedContent("¿Cuántas especies de camarones fantasma existen?", listOf("100", "300", "1000", "3000"), "Naturaleza", "El término 'camarón fantasma' es un nombre común que agrupa alrededor de 1000 especies diferentes de camarones de agua dulce y salobre, principalmente de la familia Atyidae.")
        ),
        BilingualQuestion(
            id = 10743, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la plus grande capacité à percevoir les ultrasons?", listOf("la chauve-souris", "le dauphin", "le chat", "la chouette"), "Nature", "Les dauphins utilisent l'écholocation avec des ultrasons pour naviguer et chasser, leur ouïe étant adaptée aux fréquences très élevées, bien au-delà de la portée humaine."),
            en = LocalizedContent("Which animal can have the greatest ability to perceive ultrasound?", listOf("bat", "dolphin", "cat", "owl"), "Nature", "Dolphins use echolocation with ultrasound to navigate and hunt, their hearing being adapted to very high frequencies, far beyond human range."),
            zh = LocalizedContent("哪种动物对超声波的感知能力最强？", listOf("蝙蝠", "海豚", "猫", "猫头鹰"), "自然", "海豚利用超声波进行回声定位以导航和捕食，其听觉适应了极高的频率，远超人类范围。"),
            es = LocalizedContent("¿Qué animal puede tener la mayor capacidad para percibir ultrasonidos?", listOf("el murciélago", "el delfín", "el gato", "el búho"), "Naturaleza", "Los delfines utilizan la ecolocalización con ultrasonidos para navegar y cazar, con un oído adaptado a frecuencias muy altas, muy por encima del alcance humano.")
        ),
        BilingualQuestion(
            id = 10744, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de talc du monde?", listOf("la Chine", "l'Inde", "la Russie", "le Canada"), "Nature", "Les plus grandes réserves mondiales de talc se trouvent en Inde, notamment dans les gisements du Rajasthan."),
            en = LocalizedContent("What is the largest talc deposit in the world?", listOf("China", "India", "Russia", "Canada"), "Nature", "The largest global talc reserves are found in India, particularly in the deposits of Rajasthan."),
            zh = LocalizedContent("世界上最大的滑石矿床在哪里？", listOf("中国", "印度", "俄罗斯", "加拿大"), "自然", "全球最大的滑石储量位于印度，尤其是在拉贾斯坦邦的矿床中。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de talco del mundo?", listOf("China", "India", "Rusia", "Canadá"), "Naturaleza", "Las mayores reservas mundiales de talco se encuentran en la India, especialmente en los yacimientos de Rajastán.")
        ),
        BilingualQuestion(
            id = 10745, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes de roche existe-t-il?", listOf("10", "50", "200", "500"), "Nature", "Les crevettes de roche, aussi appelées crevettes roses, comptent environ 200 espèces réparties dans les eaux tempérées et froides de l'Atlantique et de la Méditerranée."),
            en = LocalizedContent("How many species of rock shrimp are there?", listOf("10", "50", "200", "500"), "Nature", "Rock shrimp, also called pink shrimp, comprise about 200 species distributed in temperate and cold waters of the Atlantic and Mediterranean."),
            zh = LocalizedContent("岩虾有多少种？", listOf("10", "50", "200", "500"), "自然", "岩虾，又称粉红虾，约有200种，分布于大西洋和地中海的温带和冷水域。"),
            es = LocalizedContent("¿Cuántas especies de camarón de roca existen?", listOf("10", "50", "200", "500"), "Naturaleza", "Los camarones de roca, también llamados camarones rosados, comprenden alrededor de 200 especies distribuidas en aguas templadas y frías del Atlántico y el Mediterráneo.")
        ),
        BilingualQuestion(
            id = 10746, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la plus grande sensibilité aux infrarouges?", listOf("le serpent à sonnettes", "le python", "la vipère", "le boa"), "Nature", "Les boas possèdent des fossettes thermosensibles sur leur museau, leur permettant de détecter les infrarouges émis par leurs proies à distance."),
            en = LocalizedContent("Which animal can have the greatest sensitivity to infrared?", listOf("rattlesnake", "python", "viper", "boa"), "Nature", "Boas have heat-sensitive pits on their snouts, allowing them to detect infrared radiation emitted by their prey at a distance."),
            zh = LocalizedContent("哪种动物对红外线的敏感度最高？", listOf("响尾蛇", "蟒蛇", "蝰蛇", "蚺蛇"), "自然", "蚺蛇的吻部有热敏感窝，能够探测到猎物发出的红外辐射。"),
            es = LocalizedContent("¿Qué animal puede tener la mayor sensibilidad a los infrarrojos?", listOf("la serpiente de cascabel", "la pitón", "la víbora", "la boa"), "Naturaleza", "Las boas poseen fosetas termosensibles en el hocico, que les permiten detectar la radiación infrarroja emitida por sus presas a distancia.")
        ),
        BilingualQuestion(
            id = 10747, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de feldspath du monde?", listOf("la Turquie", "la Thaïlande", "la Birmanie", "la Malaisie"), "Nature", "La Turquie possède les plus grandes réserves mondiales de feldspath, un minéral utilisé dans la céramique et le verre, avec des gisements majeurs dans les régions de l'Égée et de l'Anatolie centrale."),
            en = LocalizedContent("What is the largest feldspar deposit in the world?", listOf("Turkey", "Thailand", "Myanmar", "Malaysia"), "Nature", "Turkey has the largest feldspar reserves in the world, a mineral used in ceramics and glass, with major deposits in the Aegean and Central Anatolia regions."),
            zh = LocalizedContent("世界上最大的长石矿床在哪里？", listOf("土耳其", "泰国", "缅甸", "马来西亚"), "自然", "土耳其拥有世界上最大的长石储量，长石用于陶瓷和玻璃，主要矿床位于爱琴海和中安纳托利亚地区。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de feldespato del mundo?", listOf("Turquía", "Tailandia", "Birmania", "Malasia"), "Naturaleza", "Turquía posee las mayores reservas mundiales de feldespato, un mineral utilizado en cerámica y vidrio, con yacimientos importantes en las regiones del Egeo y Anatolia Central.")
        ),
        BilingualQuestion(
            id = 10748, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crevettes pistoles existe-t-il?", listOf("50", "200", "500", "1000"), "Nature", "Les crevettes pistoles, aussi appelées crevettes mantis, comptent environ 500 espèces réparties dans les eaux tropicales et subtropicales."),
            en = LocalizedContent("How many species of pistol shrimp are there?", listOf("50", "200", "500", "1000"), "Nature", "Pistol shrimp, also called mantis shrimp, comprise about 500 species distributed in tropical and subtropical waters."),
            zh = LocalizedContent("手枪虾有多少种？", listOf("50", "200", "500", "1000"), "自然", "手枪虾，又称螳螂虾，约有500种，分布于热带和亚热带水域。"),
            es = LocalizedContent("¿Cuántas especies de camarón pistola existen?", listOf("50", "200", "500", "1000"), "Naturaleza", "Los camarones pistola, también llamados camarones mantis, comprenden alrededor de 500 especies distribuidas en aguas tropicales y subtropicales.")
        ),
        BilingualQuestion(
            id = 10749, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure sensibilité magnétique?", listOf("la tortue", "le pigeon", "le saumon", "la grue"), "Nature", "Les pigeons possèdent des cristaux de magnétite dans leur bec, ce qui leur permet de détecter le champ magnétique terrestre pour s'orienter lors de leurs déplacements."),
            en = LocalizedContent("Which animal can have the best magnetic sensitivity?", listOf("turtle", "pigeon", "salmon", "crane"), "Nature", "Pigeons have magnetite crystals in their beaks, allowing them to detect the Earth's magnetic field for orientation during their travels."),
            zh = LocalizedContent("哪种动物的磁感应能力最强？", listOf("海龟", "鸽子", "鲑鱼", "鹤"), "自然", "鸽子的喙中有磁铁矿晶体，使它们能够探测地球磁场以在迁徙中定向。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor sensibilidad magnética?", listOf("la tortuga", "la paloma", "el salmón", "la grulla"), "Naturaleza", "Las palomas poseen cristales de magnetita en el pico, lo que les permite detectar el campo magnético terrestre para orientarse durante sus desplazamientos.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10750, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de bentonite du monde?", listOf("les États-Unis", "la Turquie", "la Chine", "l'Inde"), "Nature", "Les États-Unis possèdent les plus grandes réserves de bentonite au monde, notamment dans le Wyoming, où se trouve le gisement majeur de cette argile aux propriétés absorbantes."),
            en = LocalizedContent("What is the largest deposit of bentonite in the world?", listOf("the United States", "Turkey", "China", "India"), "Nature", "The United States has the largest reserves of bentonite in the world, especially in Wyoming, where the major deposit of this absorbent clay is located."),
            zh = LocalizedContent("世界上最大的膨润土矿床在哪里？", listOf("美国", "土耳其", "中国", "印度"), "自然", "美国拥有世界上最大的膨润土储量，特别是在怀俄明州，那里是这种具有吸附性能的粘土的主要矿床所在地。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de bentonita del mundo?", listOf("Estados Unidos", "Turquía", "China", "India"), "Naturaleza", "Estados Unidos posee las mayores reservas de bentonita del mundo, especialmente en Wyoming, donde se encuentra el principal yacimiento de esta arcilla absorbente.")
        ),
        BilingualQuestion(
            id = 10751, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'amphipodes existe-t-il?", listOf("500", "2000", "9000", "15 000"), "Nature", "Les amphipodes, un ordre de crustacés, comptent environ 9 000 espèces décrites, principalement marines, mais aussi d'eau douce et terrestres."),
            en = LocalizedContent("How many species of amphipods are there?", listOf("500", "2000", "9000", "15,000"), "Nature", "Amphipods, an order of crustaceans, have about 9,000 described species, mainly marine, but also freshwater and terrestrial."),
            zh = LocalizedContent("端足类动物有多少种？", listOf("500", "2000", "9000", "15000"), "自然", "端足类动物是甲壳纲的一个目，约有9000种已描述的物种，主要是海洋生物，但也有淡水和陆生物种。"),
            es = LocalizedContent("¿Cuántas especies de anfípodos existen?", listOf("500", "2000", "9000", "15 000"), "Naturaleza", "Los anfípodos, un orden de crustáceos, cuentan con aproximadamente 9,000 especies descritas, principalmente marinas, pero también de agua dulce y terrestres.")
        ),
        BilingualQuestion(
            id = 10752, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure sensibilité électrique?", listOf("la raie électrique", "l'anguille électrique", "le requin", "le poisson-chat"), "Nature", "Les requins possèdent des ampoules de Lorenzini, des capteurs électriques ultra-sensibles sur leur museau, leur permettant de détecter les champs électriques infimes émis par leurs proies."),
            en = LocalizedContent("Which animal can have the best electrical sensitivity?", listOf("electric ray", "electric eel", "shark", "catfish"), "Nature", "Sharks have ampullae of Lorenzini, ultra-sensitive electrical sensors on their snouts, allowing them to detect the faint electric fields emitted by their prey."),
            zh = LocalizedContent("哪种动物具有最好的电敏感性？", listOf("电鳐", "电鳗", "鲨鱼", "鲶鱼"), "自然", "鲨鱼拥有罗伦氏壶腹，这是它们吻部上的超灵敏电传感器，使它们能够探测到猎物发出的微弱电场。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor sensibilidad eléctrica?", listOf("la raya eléctrica", "la anguila eléctrica", "el tiburón", "el pez gato"), "Naturaleza", "Los tiburones poseen ampollas de Lorenzini, sensores eléctricos ultrasensibles en su hocico, que les permiten detectar los diminutos campos eléctricos emitidos por sus presas.")
        ),
        BilingualQuestion(
            id = 10753, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de kaolin du monde?", listOf("les États-Unis", "la Chine", "la Thaïlande", "l'Inde"), "Nature", "La Chine possède les plus vastes réserves de kaolin au monde, notamment dans la province du Jiangxi, grâce à des gisements d'argile blanche de haute qualité."),
            en = LocalizedContent("What is the largest deposit of kaolin in the world?", listOf("the United States", "China", "Thailand", "India"), "Nature", "China has the largest reserves of kaolin in the world, especially in Jiangxi province, thanks to high-quality white clay deposits."),
            zh = LocalizedContent("世界上最大的高岭土矿床在哪里？", listOf("美国", "中国", "泰国", "印度"), "自然", "中国拥有世界上最大的高岭土储量，特别是在江西省，那里有高质量的白粘土矿床。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de caolín del mundo?", listOf("Estados Unidos", "China", "Tailandia", "India"), "Naturaleza", "China posee las mayores reservas de caolín del mundo, especialmente en la provincia de Jiangxi, gracias a yacimientos de arcilla blanca de alta calidad.")
        ),
        BilingualQuestion(
            id = 10754, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'isopodes existe-t-il?", listOf("500", "2000", "10 000", "20 000"), "Nature", "Les isopodes, un ordre de crustacés qui inclut les cloportes, comptent environ 10 000 espèces décrites, vivant dans des milieux marins, d'eau douce et terrestres."),
            en = LocalizedContent("How many species of isopods are there?", listOf("500", "2000", "10,000", "20,000"), "Nature", "Isopods, an order of crustaceans that includes woodlice, have about 10,000 described species, living in marine, freshwater, and terrestrial environments."),
            zh = LocalizedContent("等足类动物有多少种？", listOf("500", "2000", "10000", "20000"), "自然", "等足类动物是甲壳纲的一个目，包括潮虫，约有10000种已描述的物种，生活在海洋、淡水和陆地环境中。"),
            es = LocalizedContent("¿Cuántas especies de isópodos existen?", listOf("500", "2000", "10 000", "20 000"), "Naturaleza", "Los isópodos, un orden de crustáceos que incluye las cochinillas, cuentan con aproximadamente 10,000 especies descritas, que viven en ambientes marinos, de agua dulce y terrestres.")
        ),
        BilingualQuestion(
            id = 10755, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure sensibilité chimique?", listOf("le serpent", "l'insecte", "le poisson", "le mammifère marin"), "Nature", "Les poissons possèdent des récepteurs chimiques extrêmement sensibles sur leur peau et leurs barbillons, leur permettant de détecter des substances à des concentrations infimes dans l'eau."),
            en = LocalizedContent("Which animal can have the best chemical sensitivity?", listOf("snake", "insect", "fish", "marine mammal"), "Nature", "Fish have extremely sensitive chemical receptors on their skin and barbels, allowing them to detect substances at minute concentrations in water."),
            zh = LocalizedContent("哪种动物具有最好的化学敏感性？", listOf("蛇", "昆虫", "鱼", "海洋哺乳动物"), "自然", "鱼的皮肤和触须上有极其敏感的化学感受器，使它们能够探测到水中极低浓度的物质。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor sensibilidad química?", listOf("la serpiente", "el insecto", "el pez", "el mamífero marino"), "Naturaleza", "Los peces poseen receptores químicos extremadamente sensibles en su piel y barbillas, lo que les permite detectar sustancias en concentraciones mínimas en el agua.")
        ),
        BilingualQuestion(
            id = 10756, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de perlite du monde?", listOf("les États-Unis", "la Turquie", "la Chine", "la Grèce"), "Nature", "Les États-Unis possèdent les plus grandes réserves de perlite au monde, notamment dans l'Ouest du pays, avec des gisements majeurs au Nouveau-Mexique."),
            en = LocalizedContent("What is the largest deposit of perlite in the world?", listOf("the United States", "Turkey", "China", "Greece"), "Nature", "The United States has the largest reserves of perlite in the world, especially in the West, with major deposits in New Mexico."),
            zh = LocalizedContent("世界上最大的珍珠岩矿床在哪里？", listOf("美国", "土耳其", "中国", "希腊"), "自然", "美国拥有世界上最大的珍珠岩储量，特别是在西部，新墨西哥州有大型矿床。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de perlita del mundo?", listOf("Estados Unidos", "Turquía", "China", "Grecia"), "Naturaleza", "Estados Unidos posee las mayores reservas de perlita del mundo, especialmente en el oeste del país, con importantes yacimientos en Nuevo México.")
        ),
        BilingualQuestion(
            id = 10757, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de crustacés existe-t-il?", listOf("5000", "30 000", "50 000", "100 000"), "Nature", "Les crustacés forment un groupe très diversifié comprenant environ 50 000 espèces connues, incluant crabes, homards, crevettes et krill."),
            en = LocalizedContent("How many species of crustaceans are there?", listOf("5000", "30,000", "50,000", "100,000"), "Nature", "Crustaceans form a very diverse group comprising about 50,000 known species, including crabs, lobsters, shrimp, and krill."),
            zh = LocalizedContent("甲壳类动物有多少种？", listOf("5000", "30000", "50000", "100000"), "自然", "甲壳类动物是一个非常多样的群体，包括约50000种已知物种，如螃蟹、龙虾、虾和磷虾。"),
            es = LocalizedContent("¿Cuántas especies de crustáceos existen?", listOf("5000", "30 000", "50 000", "100 000"), "Naturaleza", "Los crustáceos forman un grupo muy diverso que comprende alrededor de 50,000 especies conocidas, incluyendo cangrejos, langostas, camarones y kril.")
        ),
        BilingualQuestion(
            id = 10758, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure sensibilité tactile?", listOf("l'ours", "le dauphin", "l'humain", "le chat"), "Nature", "Les dauphins possèdent des récepteurs tactiles extrêmement sensibles sur leur peau, notamment autour du museau et des nageoires, leur permettant de détecter les moindres variations de pression et de texture dans l'eau."),
            en = LocalizedContent("Which animal can have the best tactile sensitivity?", listOf("bear", "dolphin", "human", "cat"), "Nature", "Dolphins have extremely sensitive tactile receptors on their skin, especially around the snout and fins, allowing them to detect the slightest variations in pressure and texture in water."),
            zh = LocalizedContent("哪种动物具有最好的触觉敏感性？", listOf("熊", "海豚", "人类", "猫"), "自然", "海豚的皮肤上有极其敏感的触觉感受器，特别是在吻部和鳍周围，使它们能够探测到水中压力和纹理的细微变化。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor sensibilidad táctil?", listOf("el oso", "el delfín", "el humano", "el gato"), "Naturaleza", "Los delfines poseen receptores táctiles extremadamente sensibles en su piel, especialmente alrededor del hocico y las aletas, lo que les permite detectar las más mínimas variaciones de presión y textura en el agua.")
        ),
        BilingualQuestion(
            id = 10759, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt d'olivine du monde?", listOf("la Turquie", "l'Inde", "l'Australie", "l'Afrique du Sud"), "Nature", "La Turquie abrite les plus grandes réserves mondiales d'olivine, un minéral vert utilisé dans l'industrie sidérurgique et la capture du CO2."),
            en = LocalizedContent("What is the largest deposit of olivine in the world?", listOf("Turkey", "India", "Australia", "South Africa"), "Nature", "Turkey hosts the largest global reserves of olivine, a green mineral used in the steel industry and CO2 capture."),
            zh = LocalizedContent("世界上最大的橄榄石矿床在哪里？", listOf("土耳其", "印度", "澳大利亚", "南非"), "自然", "土耳其拥有世界上最大的橄榄石储量，这是一种用于钢铁工业和二氧化碳捕获的绿色矿物。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de olivino del mundo?", listOf("Turquía", "India", "Australia", "Sudáfrica"), "Naturaleza", "Turquía alberga las mayores reservas mundiales de olivino, un mineral verde utilizado en la industria siderúrgica y la captura de CO2.")
        ),
        BilingualQuestion(
            id = 10760, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'échinoïdes existe-t-il?", listOf("500", "1000", "2000", "5000"), "Nature", "Les échinoïdes, ou oursins, comptent environ 2000 espèces vivantes réparties dans tous les océans."),
            en = LocalizedContent("How many species of echinoids are there?", listOf("500", "1000", "2000", "5000"), "Nature", "Echinoids, or sea urchins, comprise about 2000 living species distributed across all oceans."),
            zh = LocalizedContent("海胆有多少种？", listOf("500", "1000", "2000", "5000"), "自然", "海胆（echinoids）约有2000个现存物种，分布于全球各大洋。"),
            es = LocalizedContent("¿Cuántas especies de equinoideos existen?", listOf("500", "1000", "2000", "5000"), "Naturaleza", "Los equinoideos, o erizos de mar, comprenden alrededor de 2000 especies vivientes distribuidas en todos los océanos.")
        ),
        BilingualQuestion(
            id = 10761, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal peut avoir la meilleure sensibilité olfactive?", listOf("le chien", "le renard", "l'ours", "le loup"), "Nature", "Le chien possède jusqu'à 300 millions de récepteurs olfactifs, contre environ 5 millions chez l'humain, ce qui lui permet de détecter des odeurs à des concentrations infimes."),
            en = LocalizedContent("Which animal can have the best olfactory sensitivity?", listOf("dog", "fox", "bear", "wolf"), "Nature", "Dogs have up to 300 million olfactory receptors, compared to about 5 million in humans, allowing them to detect odors at minute concentrations."),
            zh = LocalizedContent("哪种动物的嗅觉最灵敏？", listOf("狗", "狐狸", "熊", "狼"), "自然", "狗拥有多达3亿个嗅觉受体，而人类只有约500万个，因此能够检测到极低浓度的气味。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor sensibilidad olfativa?", listOf("el perro", "el zorro", "el oso", "el lobo"), "Naturaleza", "El perro posee hasta 300 millones de receptores olfativos, frente a unos 5 millones en los humanos, lo que le permite detectar olores en concentraciones mínimas.")
        ),
        BilingualQuestion(
            id = 10762, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de calcite du monde?", listOf("la Chine", "l'Inde", "le Pakistan", "la Turquie"), "Nature", "Les grottes de calcite les plus vastes du monde se trouvent dans les montagnes du Pakistan, notamment dans la région du Baloutchistan, où des formations géologiques uniques ont créé d'immenses dépôts cristallins."),
            en = LocalizedContent("Which country has the largest calcite deposit in the world?", listOf("China", "India", "Pakistan", "Turkey"), "Nature", "The largest calcite caves in the world are found in the mountains of Pakistan, particularly in the Balochistan region, where unique geological formations have created immense crystalline deposits."),
            zh = LocalizedContent("世界上最大的方解石矿床在哪里？", listOf("中国", "印度", "巴基斯坦", "土耳其"), "自然", "世界上最大的方解石洞穴位于巴基斯坦的山脉中，特别是在俾路支地区，独特的地质构造形成了巨大的晶体沉积。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de calcita del mundo?", listOf("China", "India", "Pakistán", "Turquía"), "Naturaleza", "Las cuevas de calcita más grandes del mundo se encuentran en las montañas de Pakistán, especialmente en la región de Baluchistán, donde formaciones geológicas únicas han creado inmensos depósitos cristalinos.")
        ),
        BilingualQuestion(
            id = 10763, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de mollusques céphalopodes existe-t-il?", listOf("500", "1000", "1500", "2000"), "Nature", "Les céphalopodes, comme les pieuvres et les calmars, comptent environ 1000 espèces connues, réparties dans les océans du monde."),
            en = LocalizedContent("How many species of cephalopod mollusks are there?", listOf("500", "1000", "1500", "2000"), "Nature", "Cephalopods, such as octopuses and squids, comprise about 1000 known species distributed across the world's oceans."),
            zh = LocalizedContent("头足类软体动物有多少种？", listOf("500", "1000", "1500", "2000"), "自然", "头足类动物，如章鱼和鱿鱼，约有1000个已知物种，分布于全球海洋。"),
            es = LocalizedContent("¿Cuántas especies de moluscos cefalópodos existen?", listOf("500", "1000", "1500", "2000"), "Naturaleza", "Los cefalópodos, como pulpos y calamares, comprenden alrededor de 1000 especies conocidas distribuidas en los océanos del mundo.")
        ),
        BilingualQuestion(
            id = 10764, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure sensibilité thermique?", listOf("le python", "le boa", "le serpent à sonnettes", "la vipère"), "Nature", "Le python possède des fossettes thermosensibles sur ses lèvres qui détectent les infrarouges, lui permettant de localiser ses proies à sang chaud avec une précision remarquable."),
            en = LocalizedContent("Which animal can have the best thermal sensitivity?", listOf("python", "boa", "rattlesnake", "viper"), "Nature", "Pythons have heat-sensing pits on their lips that detect infrared radiation, allowing them to locate warm-blooded prey with remarkable precision."),
            zh = LocalizedContent("哪种动物的热感应最灵敏？", listOf("蟒蛇", "蚺蛇", "响尾蛇", "蝰蛇"), "自然", "蟒蛇的嘴唇上有热感应窝，能够探测红外辐射，从而以极高的精度定位温血猎物。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor sensibilidad térmica?", listOf("la pitón", "la boa", "la serpiente de cascabel", "la víbora"), "Naturaleza", "La pitón posee fosetas termosensibles en sus labios que detectan radiación infrarroja, permitiéndole localizar presas de sangre caliente con notable precisión.")
        ),
        BilingualQuestion(
            id = 10765, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de dolomie du monde?", listOf("la Turquie", "la Chine", "la Russie", "l'Espagne"), "Nature", "L'Espagne abrite le plus grand gisement de dolomie au monde dans la région de Gérone, en Catalogne, où se trouve une vaste formation géologique de ce minéral carbonaté."),
            en = LocalizedContent("Which country has the largest dolomite deposit in the world?", listOf("Turkey", "China", "Russia", "Spain"), "Nature", "Spain hosts the largest dolomite deposit in the world in the Girona region of Catalonia, where a vast geological formation of this carbonate mineral is located."),
            zh = LocalizedContent("世界上最大的白云石矿床在哪里？", listOf("土耳其", "中国", "俄罗斯", "西班牙"), "自然", "西班牙加泰罗尼亚的赫罗纳地区拥有世界上最大的白云石矿床，那里有这种碳酸盐矿物的巨大地质构造。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de dolomita del mundo?", listOf("Turquía", "China", "Rusia", "España"), "Naturaleza", "España alberga el mayor yacimiento de dolomita del mundo en la región de Gerona, Cataluña, donde se encuentra una vasta formación geológica de este mineral carbonatado.")
        ),
        BilingualQuestion(
            id = 10766, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de tuniciers existe-t-il?", listOf("1000", "2000", "3000", "5000"), "Nature", "Les tuniciers, comme les ascidies et les salpes, comptent environ 2000 espèces décrites dans le monde, principalement marines."),
            en = LocalizedContent("How many species of tunicates are there?", listOf("1000", "2000", "3000", "5000"), "Nature", "Tunicates, such as ascidians and salps, comprise about 2000 described species worldwide, mostly marine."),
            zh = LocalizedContent("尾索动物有多少种？", listOf("1000", "2000", "3000", "5000"), "自然", "尾索动物，如海鞘和樽海鞘，全球约有2000个已描述物种，主要为海洋生物。"),
            es = LocalizedContent("¿Cuántas especies de tunicados existen?", listOf("1000", "2000", "3000", "5000"), "Naturaleza", "Los tunicados, como las ascidias y las salpas, comprenden alrededor de 2000 especies descritas en el mundo, principalmente marinas.")
        ),
        BilingualQuestion(
            id = 10767, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité d'orientation?", listOf("la tortue", "le pigeon", "la grue", "le saumon"), "Nature", "Les pigeons possèdent un sens magnétique très développé dans leur bec, leur permettant de détecter le champ magnétique terrestre pour s'orienter avec une précision exceptionnelle sur de longues distances."),
            en = LocalizedContent("Which animal can have the best navigational ability?", listOf("turtle", "pigeon", "crane", "salmon"), "Nature", "Pigeons have a highly developed magnetic sense in their beaks, allowing them to detect the Earth's magnetic field and navigate with exceptional precision over long distances."),
            zh = LocalizedContent("哪种动物的导航能力最强？", listOf("海龟", "鸽子", "鹤", "鲑鱼"), "自然", "鸽子的喙中具有高度发达的磁感，能够探测地球磁场，从而在长距离飞行中以极高的精度导航。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de orientación?", listOf("la tortuga", "la paloma", "la grulla", "el salmón"), "Naturaleza", "Las palomas poseen un sentido magnético muy desarrollado en su pico, que les permite detectar el campo magnético terrestre y orientarse con precisión excepcional en largas distancias.")
        ),
        BilingualQuestion(
            id = 10768, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de fluorite du monde?", listOf("la Mongolie", "la Chine", "le Mexique", "l'Afrique du Sud"), "Nature", "La Chine possède les plus grandes réserves mondiales de fluorite, notamment dans la région du Hunan, où se trouve le gisement de Xianghuapu."),
            en = LocalizedContent("Which country has the largest fluorite deposit in the world?", listOf("Mongolia", "China", "Mexico", "South Africa"), "Nature", "China holds the world's largest fluorite reserves, notably in the Hunan region, where the Xianghuapu deposit is located."),
            zh = LocalizedContent("世界上最大的萤石矿床在哪里？", listOf("蒙古", "中国", "墨西哥", "南非"), "自然", "中国拥有世界上最大的萤石储量，特别是在湖南地区，那里有香花铺矿床。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de fluorita del mundo?", listOf("Mongolia", "China", "México", "Sudáfrica"), "Naturaleza", "China posee las mayores reservas mundiales de fluorita, especialmente en la región de Hunan, donde se encuentra el yacimiento de Xianghuapu.")
        ),
        BilingualQuestion(
            id = 10769, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de cnidaires existe-t-il?", listOf("5000", "10 000", "20 000", "50 000"), "Nature", "Les cnidaires, comme les méduses et les coraux, comptent environ 20 000 espèces recensées dans le monde. Ce nombre inclut une grande diversité de formes marines."),
            en = LocalizedContent("How many species of cnidarians are there?", listOf("5000", "10000", "20000", "50000"), "Nature", "Cnidarians, such as jellyfish and corals, comprise about 20,000 recorded species worldwide. This number includes a great diversity of marine forms."),
            zh = LocalizedContent("刺胞动物有多少种？", listOf("5000", "10000", "20000", "50000"), "自然", "刺胞动物，如水母和珊瑚，全球约有20,000个已记录物种。这个数字包括大量多样的海洋形态。"),
            es = LocalizedContent("¿Cuántas especies de cnidarios existen?", listOf("5000", "10000", "20000", "50000"), "Naturaleza", "Los cnidarios, como medusas y corales, comprenden alrededor de 20,000 especies registradas en el mundo. Este número incluye una gran diversidad de formas marinas.")
        ),
        BilingualQuestion(
            id = 10770, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure mémoire spatiale?", listOf("l'écureuil", "le corbeau", "l'hippocampe", "l'humain"), "Nature", "Les corbeaux possèdent une mémoire spatiale exceptionnelle, leur permettant de se souvenir de l'emplacement de centaines de caches de nourriture sur de vastes territoires."),
            en = LocalizedContent("Which animal may have the best spatial memory?", listOf("squirrel", "crow", "seahorse", "human"), "Nature", "Crows have exceptional spatial memory, allowing them to remember the locations of hundreds of food caches over vast territories."),
            zh = LocalizedContent("哪种动物可能拥有最好的空间记忆？", listOf("松鼠", "乌鸦", "海马", "人类"), "自然", "乌鸦拥有非凡的空间记忆，能够记住广阔区域内数百个食物储藏点的位置。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor memoria espacial?", listOf("la ardilla", "el cuervo", "el hipocampo", "el humano"), "Naturaleza", "Los cuervos poseen una memoria espacial excepcional, que les permite recordar la ubicación de cientos de escondites de comida en vastos territorios.")
        ),
        BilingualQuestion(
            id = 10771, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de sulfate de baryum du monde?", listOf("la Chine", "l'Inde", "les États-Unis", "le Pérou"), "Nature", "La Chine possède les plus grandes réserves mondiales de barytine, le minerai de sulfate de baryum, notamment dans les provinces du Hunan et du Guizhou."),
            en = LocalizedContent("What is the largest deposit of barium sulfate in the world?", listOf("China", "India", "United States", "Peru"), "Nature", "China has the world's largest reserves of barite, the barium sulfate ore, especially in the provinces of Hunan and Guizhou."),
            zh = LocalizedContent("世界上最大的硫酸钡矿床在哪里？", listOf("中国", "印度", "美国", "秘鲁"), "自然", "中国拥有世界上最大的重晶石（硫酸钡矿石）储量，特别是在湖南和贵州两省。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de sulfato de bario del mundo?", listOf("China", "India", "Estados Unidos", "Perú"), "Naturaleza", "China posee las mayores reservas mundiales de barita, el mineral de sulfato de bario, especialmente en las provincias de Hunan y Guizhou.")
        ),
        BilingualQuestion(
            id = 10772, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de porifères existe-t-il?", listOf("1000", "5000", "8500", "15 000"), "Nature", "Les porifères, ou éponges, comptent environ 8 500 espèces décrites dans le monde, principalement marines."),
            en = LocalizedContent("How many species of poriferans are there?", listOf("1000", "5000", "8500", "15000"), "Nature", "Poriferans, or sponges, have about 8,500 described species worldwide, mostly marine."),
            zh = LocalizedContent("多孔动物有多少种？", listOf("1000", "5000", "8500", "15000"), "自然", "多孔动物（海绵）在全球约有8500种已描述的物种，主要是海洋生物。"),
            es = LocalizedContent("¿Cuántas especies de poríferos existen?", listOf("1000", "5000", "8500", "15000"), "Naturaleza", "Los poríferos, o esponjas, cuentan con aproximadamente 8.500 especies descritas en todo el mundo, principalmente marinas.")
        ),
        BilingualQuestion(
            id = 10773, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité d'apprentissage?", listOf("le singe", "le corbeau", "l'humain", "le dauphin"), "Nature", "L'humain possède un cortex préfrontal très développé, lui permettant une plasticité cérébrale et une capacité d'abstraction inégalées dans le règne animal."),
            en = LocalizedContent("Which animal may have the best learning ability?", listOf("monkey", "crow", "human", "dolphin"), "Nature", "Humans have a highly developed prefrontal cortex, allowing for brain plasticity and abstraction abilities unmatched in the animal kingdom."),
            zh = LocalizedContent("哪种动物可能拥有最好的学习能力？", listOf("猴子", "乌鸦", "人类", "海豚"), "自然", "人类拥有高度发达的前额叶皮层，使其具有动物界无与伦比的大脑可塑性和抽象能力。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de aprendizaje?", listOf("el mono", "el cuervo", "el humano", "el delfín"), "Naturaleza", "El humano posee una corteza prefrontal muy desarrollada, lo que le permite una plasticidad cerebral y una capacidad de abstracción inigualables en el reino animal.")
        ),
        BilingualQuestion(
            id = 10774, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de silice du monde?", listOf("la Chine", "l'Inde", "les États-Unis", "l'Australie"), "Nature", "La Chine possède les plus vastes réserves de silice au monde, notamment dans les provinces du Jiangsu et du Guangdong, où se trouvent d'importants gisements de quartz et de sable siliceux."),
            en = LocalizedContent("What is the largest deposit of silica in the world?", listOf("China", "India", "United States", "Australia"), "Nature", "China has the largest silica reserves in the world, notably in Jiangsu and Guangdong provinces, where significant deposits of quartz and silica sand are found."),
            zh = LocalizedContent("世界上最大的二氧化硅矿床在哪里？", listOf("中国", "印度", "美国", "澳大利亚"), "自然", "中国拥有世界上最大的二氧化硅储量，特别是在江苏和广东两省，那里有大量的石英和硅砂矿床。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de sílice del mundo?", listOf("China", "India", "Estados Unidos", "Australia"), "Naturaleza", "China posee las mayores reservas de sílice del mundo, especialmente en las provincias de Jiangsu y Guangdong, donde se encuentran importantes depósitos de cuarzo y arena silícea.")
        ),
        BilingualQuestion(
            id = 10775, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de nématodes existe-t-il?", listOf("5000", "20 000", "50 000", "100 000"), "Nature", "Les nématodes, ou vers ronds, comptent environ 50 000 espèces décrites, mais on estime que le nombre réel pourrait atteindre plusieurs millions."),
            en = LocalizedContent("How many species of nematodes are there?", listOf("5000", "20000", "50000", "100000"), "Nature", "Nematodes, or roundworms, have about 50,000 described species, but the actual number is estimated to be several million."),
            zh = LocalizedContent("线虫有多少种？", listOf("5000", "20000", "50000", "100000"), "自然", "线虫（蛔虫）约有5万种已描述的物种，但实际数量估计可达数百万。"),
            es = LocalizedContent("¿Cuántas especies de nematodos existen?", listOf("5000", "20000", "50000", "100000"), "Naturaleza", "Los nematodos, o gusanos redondos, cuentan con aproximadamente 50.000 especies descritas, pero se estima que el número real podría alcanzar varios millones.")
        ),
        BilingualQuestion(
            id = 10776, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de résilience?", listOf("la tardigrade", "le caméléon", "la fourmi", "le cafard"), "Nature", "La tardigrade, aussi appelé ourson d'eau, peut survivre dans des conditions extrêmes comme le vide spatial, des températures de -272°C à 150°C, et des pressions très élevées, grâce à un état de cryptobiose."),
            en = LocalizedContent("Which animal may have the best resilience ability?", listOf("tardigrade", "chameleon", "ant", "cockroach"), "Nature", "The tardigrade, also known as water bear, can survive extreme conditions like outer space, temperatures from -272°C to 150°C, and high pressures through cryptobiosis."),
            zh = LocalizedContent("哪种动物可能拥有最好的恢复能力？", listOf("水熊虫", "变色龙", "蚂蚁", "蟑螂"), "自然", "水熊虫（缓步动物）可以通过隐生状态在极端条件下生存，如太空、-272°C到150°C的温度和高压。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de resiliencia?", listOf("el tardígrado", "el camaleón", "la hormiga", "la cucaracha"), "Naturaleza", "El tardígrado, también llamado oso de agua, puede sobrevivir en condiciones extremas como el espacio exterior, temperaturas de -272°C a 150°C y altas presiones gracias a un estado de criptobiosis.")
        ),
        BilingualQuestion(
            id = 10777, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de spath fluor du monde?", listOf("la Mongolie", "la Chine", "le Mexique", "l'Afrique du Sud"), "Nature", "La Chine possède les plus grandes réserves mondiales de spath fluor, un minéral essentiel pour la production d'acier et de fluor."),
            en = LocalizedContent("What is the largest deposit of fluorite in the world?", listOf("Mongolia", "China", "Mexico", "South Africa"), "Nature", "China has the world's largest reserves of fluorite, a mineral essential for steel and fluorine production."),
            zh = LocalizedContent("世界上最大的萤石矿床在哪里？", listOf("蒙古", "中国", "墨西哥", "南非"), "自然", "中国拥有世界上最大的萤石储量，萤石是钢铁和氟生产的重要矿物。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de espato flúor del mundo?", listOf("Mongolia", "China", "México", "Sudáfrica"), "Naturaleza", "China posee las mayores reservas mundiales de espato flúor, un mineral esencial para la producción de acero y flúor.")
        ),
        BilingualQuestion(
            id = 10778, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de bryozoaires existe-t-il?", listOf("100", "500", "5000", "10 000"), "Nature", "Les bryozoaires sont de petits animaux aquatiques coloniaux. On en recense environ 5 000 espèces vivantes dans le monde."),
            en = LocalizedContent("How many species of bryozoans are there?", listOf("100", "500", "5000", "10000"), "Nature", "Bryozoans are small colonial aquatic animals. There are about 5,000 living species worldwide."),
            zh = LocalizedContent("苔藓虫有多少种？", listOf("100", "500", "5000", "10000"), "自然", "苔藓虫是小型水生群体动物。全球约有5000种现存物种。"),
            es = LocalizedContent("¿Cuántas especies de briozoos existen?", listOf("100", "500", "5000", "10000"), "Naturaleza", "Los briozoos son pequeños animales acuáticos coloniales. Se conocen aproximadamente 5.000 especies vivientes en el mundo.")
        ),
        BilingualQuestion(
            id = 10779, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité d'adaptation?", listOf("l'humain", "le cafard", "la souris", "le rat"), "Nature", "Les blattes, ou cafards, survivent depuis plus de 300 millions d'années grâce à leur résistance aux radiations, à la famine et à leur capacité à s'adapter à presque tous les environnements."),
            en = LocalizedContent("Which animal may have the best adaptability?", listOf("human", "cockroach", "mouse", "rat"), "Nature", "Cockroaches have survived for over 300 million years due to their resistance to radiation, starvation, and ability to adapt to almost any environment."),
            zh = LocalizedContent("哪种动物可能拥有最好的适应能力？", listOf("人类", "蟑螂", "老鼠", "大鼠"), "自然", "蟑螂已经存活了超过3亿年，因为它们对辐射、饥饿有抵抗力，并且能够适应几乎任何环境。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de adaptación?", listOf("el humano", "la cucaracha", "el ratón", "la rata"), "Naturaleza", "Las cucarachas han sobrevivido durante más de 300 millones de años gracias a su resistencia a la radiación, al hambre y a su capacidad para adaptarse a casi cualquier entorno.")
        ),
        BilingualQuestion(
            id = 10780, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt d'apatite du monde?", listOf("le Maroc", "la Chine", "l'Afrique du Sud", "la Russie"), "Nature", "Le Maroc possède les plus grandes réserves mondiales d'apatite, principalement dans la région de Khouribga, utilisée pour produire des engrais phosphatés."),
            en = LocalizedContent("What is the world's largest deposit of apatite?", listOf("Morocco", "China", "South Africa", "Russia"), "Nature", "Morocco has the world's largest reserves of apatite, mainly in the Khouribga region, used to produce phosphate fertilizers."),
            zh = LocalizedContent("世界上最大的磷灰石矿床在哪里？", listOf("摩洛哥", "中国", "南非", "俄罗斯"), "自然", "摩洛哥拥有世界上最大的磷灰石储量，主要位于胡里卜盖地区，用于生产磷肥。"),
            es = LocalizedContent("¿Cuál es el depósito de apatita más grande del mundo?", listOf("Marruecos", "China", "Sudáfrica", "Rusia"), "Naturaleza", "Marruecos posee las mayores reservas mundiales de apatita, principalmente en la región de Khouribga, utilizada para producir fertilizantes fosfatados.")
        ),
        BilingualQuestion(
            id = 10781, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de brachiopodes existe-t-il?", listOf("100", "300", "1000", "2000"), "Nature", "Les brachiopodes, aussi appelés \"coquilles de lampe\", comptent environ 100 espèces vivantes, mais plus de 12 000 fossiles ont été décrits. Leur diversité actuelle est faible comparée à leur abondance passée."),
            en = LocalizedContent("How many species of brachiopods exist?", listOf("100", "300", "1000", "2000"), "Nature", "Brachiopods, also called 'lamp shells', have about 100 living species, but over 12,000 fossils have been described. Their current diversity is low compared to their past abundance."),
            zh = LocalizedContent("现存多少种腕足动物？", listOf("100", "300", "1000", "2000"), "自然", "腕足动物，也称为“灯壳”，现存约100种，但已描述超过12,000种化石。它们当前的多样性与其过去的丰富度相比很低。"),
            es = LocalizedContent("¿Cuántas especies de braquiópodos existen?", listOf("100", "300", "1000", "2000"), "Naturaleza", "Los braquiópodos, también llamados 'conchas de lámpara', tienen alrededor de 100 especies vivientes, pero se han descrito más de 12,000 fósiles. Su diversidad actual es baja en comparación con su abundancia pasada.")
        ),
        BilingualQuestion(
            id = 10782, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de récupération?", listOf("le lézard", "l'étoile de mer", "l'hydre", "le vers blanc"), "Nature", "L'hydre est capable de régénérer intégralement n'importe quelle partie de son corps coupée, ce qui lui confère une capacité de récupération quasi illimitée."),
            en = LocalizedContent("Which animal has the best regenerative ability?", listOf("lizard", "starfish", "hydra", "white worm"), "Nature", "The hydra can fully regenerate any cut part of its body, giving it almost unlimited regenerative capacity."),
            zh = LocalizedContent("哪种动物具有最强的再生能力？", listOf("蜥蜴", "海星", "水螅", "白虫"), "自然", "水螅能够完全再生其身体的任何被切断的部分，这赋予了它几乎无限的再生能力。"),
            es = LocalizedContent("¿Qué animal tiene la mejor capacidad de regeneración?", listOf("lagarto", "estrella de mar", "hidra", "gusano blanco"), "Naturaleza", "La hidra es capaz de regenerar completamente cualquier parte de su cuerpo cortada, lo que le confiere una capacidad de regeneración casi ilimitada.")
        ),
        BilingualQuestion(
            id = 10783, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de phosphate du monde?", listOf("le Maroc", "la Chine", "les États-Unis", "la Russie"), "Nature", "Le Maroc possède environ 70 % des réserves mondiales de phosphate, principalement dans la région de Khouribga, ce qui en fait le premier producteur et exportateur mondial."),
            en = LocalizedContent("What is the world's largest deposit of phosphate?", listOf("Morocco", "China", "United States", "Russia"), "Nature", "Morocco holds about 70% of the world's phosphate reserves, mainly in the Khouribga region, making it the top producer and exporter globally."),
            zh = LocalizedContent("世界上最大的磷酸盐矿床在哪里？", listOf("摩洛哥", "中国", "美国", "俄罗斯"), "自然", "摩洛哥拥有全球约70%的磷酸盐储量，主要位于胡里卜盖地区，使其成为全球最大的生产国和出口国。"),
            es = LocalizedContent("¿Cuál es el depósito de fosfato más grande del mundo?", listOf("Marruecos", "China", "Estados Unidos", "Rusia"), "Naturaleza", "Marruecos posee aproximadamente el 70% de las reservas mundiales de fosfato, principalmente en la región de Khouribga, lo que lo convierte en el principal productor y exportador mundial.")
        ),
        BilingualQuestion(
            id = 10784, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de priapuliens existe-t-il?", listOf("5", "20", "100", "300"), "Nature", "Les priapuliens, un petit embranchement de vers marins, comptent environ 20 espèces décrites à ce jour."),
            en = LocalizedContent("How many species of priapulids exist?", listOf("5", "20", "100", "300"), "Nature", "Priapulids, a small phylum of marine worms, have about 20 described species to date."),
            zh = LocalizedContent("现存多少种曳鳃动物？", listOf("5", "20", "100", "300"), "自然", "曳鳃动物是一个小型海洋蠕虫门类，目前约有20个已描述的物种。"),
            es = LocalizedContent("¿Cuántas especies de priapúlidos existen?", listOf("5", "20", "100", "300"), "Naturaleza", "Los priapúlidos, un pequeño filo de gusanos marinos, tienen alrededor de 20 especies descritas hasta la fecha.")
        ),
        BilingualQuestion(
            id = 10785, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de camouflage?", listOf("la seiche", "le caméléon", "le poisson-papillon", "le poisson-archer"), "Nature", "La seiche possède des cellules cutanées appelées chromatophores qui lui permettent de changer instantanément de couleur et de texture pour se fondre dans son environnement."),
            en = LocalizedContent("Which animal has the best camouflage ability?", listOf("cuttlefish", "chameleon", "butterflyfish", "archerfish"), "Nature", "The cuttlefish has skin cells called chromatophores that allow it to instantly change color and texture to blend into its environment."),
            zh = LocalizedContent("哪种动物具有最强的伪装能力？", listOf("乌贼", "变色龙", "蝴蝶鱼", "射水鱼"), "自然", "乌贼拥有称为色素细胞的皮肤细胞，使其能够瞬间改变颜色和纹理以融入环境。"),
            es = LocalizedContent("¿Qué animal tiene la mejor capacidad de camuflaje?", listOf("sepia", "camaleón", "pez mariposa", "pez arquero"), "Naturaleza", "La sepia posee células cutáneas llamadas cromatóforos que le permiten cambiar instantáneamente de color y textura para mimetizarse con su entorno.")
        ),
        BilingualQuestion(
            id = 10786, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de potasse du monde?", listOf("la Russie", "le Canada", "l'Allemagne", "la Biélorussie"), "Nature", "Le Canada possède les plus grandes réserves de potasse au monde, principalement situées dans la province de la Saskatchewan, où se trouvent d'immenses gisements souterrains."),
            en = LocalizedContent("What is the world's largest deposit of potash?", listOf("Russia", "Canada", "Germany", "Belarus"), "Nature", "Canada has the largest potash reserves in the world, mainly located in the province of Saskatchewan, where vast underground deposits are found."),
            zh = LocalizedContent("世界上最大的钾盐矿床在哪里？", listOf("俄罗斯", "加拿大", "德国", "白俄罗斯"), "自然", "加拿大拥有世界上最大的钾盐储量，主要位于萨斯喀彻温省，那里有巨大的地下矿床。"),
            es = LocalizedContent("¿Cuál es el depósito de potasa más grande del mundo?", listOf("Rusia", "Canadá", "Alemania", "Bielorrusia"), "Naturaleza", "Canadá posee las mayores reservas de potasa del mundo, principalmente ubicadas en la provincia de Saskatchewan, donde se encuentran enormes yacimientos subterráneos.")
        ),
        BilingualQuestion(
            id = 10787, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de loriciféres existe-t-il?", listOf("5", "20", "100", "200"), "Nature", "Les loricifères sont un petit embranchement d'animaux microscopiques marins découvert en 1983, et environ 100 espèces ont été décrites à ce jour."),
            en = LocalizedContent("How many species of loriciferans exist?", listOf("5", "20", "100", "200"), "Nature", "Loriciferans are a small phylum of microscopic marine animals discovered in 1983, and about 100 species have been described to date."),
            zh = LocalizedContent("现存多少种兜甲动物？", listOf("5", "20", "100", "200"), "自然", "兜甲动物是1983年发现的一个小型海洋微型动物门类，目前约有100个已描述的物种。"),
            es = LocalizedContent("¿Cuántas especies de loricíferos existen?", listOf("5", "20", "100", "200"), "Naturaleza", "Los loricíferos son un pequeño filo de animales microscópicos marinos descubierto en 1983, y se han descrito alrededor de 100 especies hasta la fecha.")
        ),
        BilingualQuestion(
            id = 10788, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de mimétisme?", listOf("le insecte feuille", "l'insecte bâton", "le papillon citron", "la chenille verte"), "Nature", "L'insecte bâton est un maître du camouflage, imitant parfaitement l'apparence d'une brindille pour échapper à ses prédateurs. Cette capacité de mimétisme est considérée comme l'une des plus efficaces du règne animal."),
            en = LocalizedContent("Which animal has the best mimicry ability?", listOf("leaf insect", "stick insect", "lemon butterfly", "green caterpillar"), "Nature", "The stick insect is a master of camouflage, perfectly imitating the appearance of a twig to escape predators. This mimicry ability is considered one of the most effective in the animal kingdom."),
            zh = LocalizedContent("哪种动物具有最强的拟态能力？", listOf("叶虫", "竹节虫", "柠檬蝶", "绿毛虫"), "自然", "竹节虫是伪装大师，完美模仿小树枝的外观以躲避捕食者。这种拟态能力被认为是动物界中最有效的之一。"),
            es = LocalizedContent("¿Qué animal tiene la mejor capacidad de mimetismo?", listOf("insecto hoja", "insecto palo", "mariposa limón", "oruga verde"), "Naturaleza", "El insecto palo es un maestro del camuflaje, imitando perfectamente la apariencia de una ramita para escapar de sus depredadores. Esta capacidad de mimetismo se considera una de las más efectivas del reino animal.")
        ),
        BilingualQuestion(
            id = 10789, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de sel gemme du monde?", listOf("la Pologne", "l'Allemagne", "la Chine", "le Canada"), "Nature", "La Chine possède les plus grandes réserves de sel gemme au monde, notamment dans la région du bassin du Sichuan, où des gisements massifs sont exploités depuis des siècles."),
            en = LocalizedContent("What is the world's largest deposit of rock salt?", listOf("Poland", "Germany", "China", "Canada"), "Nature", "China has the largest rock salt reserves in the world, especially in the Sichuan Basin region, where massive deposits have been exploited for centuries."),
            zh = LocalizedContent("世界上最大的岩盐矿床在哪里？", listOf("波兰", "德国", "中国", "加拿大"), "自然", "中国拥有世界上最大的岩盐储量，特别是在四川盆地地区，那里有巨大的矿床，已被开采了几个世纪。"),
            es = LocalizedContent("¿Cuál es el depósito de sal gema más grande del mundo?", listOf("Polonia", "Alemania", "China", "Canadá"), "Naturaleza", "China posee las mayores reservas de sal gema del mundo, especialmente en la región de la cuenca de Sichuan, donde se explotan enormes yacimientos desde hace siglos.")
        ),
        BilingualQuestion(
            id = 10790, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de kinorhynques existe-t-il?", listOf("50", "200", "600", "1000"), "Nature", "Les kinorhynques sont de petits invertébrés marins, et environ 600 espèces ont été décrites à ce jour dans le monde."),
            en = LocalizedContent("How many species of kinorhynchs exist?", listOf("50", "200", "600", "1000"), "Nature", "Kinorhynchs are small marine invertebrates, and about 600 species have been described worldwide to date."),
            zh = LocalizedContent("有多少种动吻动物？", listOf("50", "200", "600", "1000"), "自然", "动吻动物是小型海洋无脊椎动物，目前全球已描述约600种。"),
            es = LocalizedContent("¿Cuántas especies de kinorrincos existen?", listOf("50", "200", "600", "1000"), "Naturaleza", "Los kinorrincos son pequeños invertebrados marinos, y hasta la fecha se han descrito alrededor de 600 especies en todo el mundo.")
        ),
        BilingualQuestion(
            id = 10791, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de prédiction?", listOf("le corbeau", "l'humain", "le dauphin", "le singe"), "Nature", "L'humain possède un cortex préfrontal très développé qui lui permet d'analyser des données, d'anticiper des scénarios et de faire des prédictions complexes, contrairement aux autres animaux."),
            en = LocalizedContent("Which animal can have the best predictive ability?", listOf("the crow", "the human", "the dolphin", "the monkey"), "Nature", "Humans have a highly developed prefrontal cortex that allows them to analyze data, anticipate scenarios, and make complex predictions, unlike other animals."),
            zh = LocalizedContent("哪种动物具有最佳的预测能力？", listOf("乌鸦", "人类", "海豚", "猴子"), "自然", "人类拥有高度发达的前额叶皮层，能够分析数据、预测情景并做出复杂预测，而其他动物则不具备这种能力。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de predicción?", listOf("el cuervo", "el humano", "el delfín", "el mono"), "Naturaleza", "El humano posee una corteza prefrontal muy desarrollada que le permite analizar datos, anticipar escenarios y hacer predicciones complejas, a diferencia de otros animales.")
        ),
        BilingualQuestion(
            id = 10792, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt d'améthyste du monde?", listOf("le Brésil", "l'Uruguay", "le Zambie", "la Namibie"), "Nature", "Le Brésil abrite les plus grandes réserves d'améthyste, notamment dans l'État du Rio Grande do Sul, où des gisements comme celui d'Ametista do Sul sont exploités à grande échelle."),
            en = LocalizedContent("What is the largest amethyst deposit in the world?", listOf("Brazil", "Uruguay", "Zambia", "Namibia"), "Nature", "Brazil holds the largest amethyst reserves, especially in the state of Rio Grande do Sul, where deposits like Ametista do Sul are mined on a large scale."),
            zh = LocalizedContent("世界上最大的紫水晶矿床在哪里？", listOf("巴西", "乌拉圭", "赞比亚", "纳米比亚"), "自然", "巴西拥有最大的紫水晶储量，尤其是在南里奥格兰德州，那里有像阿梅蒂斯塔杜苏尔这样的大型矿床。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de amatista del mundo?", listOf("Brasil", "Uruguay", "Zambia", "Namibia"), "Naturaleza", "Brasil alberga las mayores reservas de amatista, especialmente en el estado de Rio Grande do Sul, donde yacimientos como Ametista do Sul se explotan a gran escala.")
        ),
        BilingualQuestion(
            id = 10793, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de cycliophores existe-t-il?", listOf("1", "5", "20", "50"), "Nature", "Les cycliophores forment un petit embranchement animal découvert en 1995, et à ce jour, seulement 20 espèces ont été identifiées et décrites par les scientifiques."),
            en = LocalizedContent("How many species of cycliophorans exist?", listOf("1", "5", "20", "50"), "Nature", "Cycliophorans form a small animal phylum discovered in 1995, and to date, only 20 species have been identified and described by scientists."),
            zh = LocalizedContent("有多少种环口动物？", listOf("1", "5", "20", "50"), "自然", "环口动物是1995年发现的一个小型动物门，迄今为止，科学家仅鉴定并描述了20种。"),
            es = LocalizedContent("¿Cuántas especies de ciclióforos existen?", listOf("1", "5", "20", "50"), "Naturaleza", "Los ciclióforos forman un pequeño filo animal descubierto en 1995, y hasta la fecha, solo se han identificado y descrito 20 especies por los científicos.")
        ),
        BilingualQuestion(
            id = 10794, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de planification?", listOf("le singe", "le corbeau", "l'éléphant", "le dauphin"), "Nature", "Les corbeaux sont capables d'utiliser des outils et de résoudre des problèmes complexes en plusieurs étapes, comme des expériences de laboratoire l'ont démontré. Leur intelligence rivalise avec celle des grands singes dans des tests de planification."),
            en = LocalizedContent("Which animal can have the best planning ability?", listOf("the monkey", "the crow", "the elephant", "the dolphin"), "Nature", "Crows are capable of using tools and solving complex multi-step problems, as demonstrated in laboratory experiments. Their intelligence rivals that of great apes in planning tests."),
            zh = LocalizedContent("哪种动物具有最佳的规划能力？", listOf("猴子", "乌鸦", "大象", "海豚"), "自然", "乌鸦能够使用工具并解决复杂的多步骤问题，实验室实验已证明这一点。在规划测试中，它们的智力可与类人猿相媲美。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de planificación?", listOf("el mono", "el cuervo", "el elefante", "el delfín"), "Naturaleza", "Los cuervos son capaces de usar herramientas y resolver problemas complejos de varios pasos, como lo han demostrado experimentos de laboratorio. Su inteligencia rivaliza con la de los grandes simios en pruebas de planificación.")
        ),
        BilingualQuestion(
            id = 10795, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de citrines du monde?", listOf("le Brésil", "l'Uruguay", "la Namibie", "Madagascar"), "Nature", "Le Brésil, notamment dans l'État du Rio Grande do Sul, abrite les plus grandes réserves de citrines, une variété de quartz jaune."),
            en = LocalizedContent("What is the largest citrine deposit in the world?", listOf("Brazil", "Uruguay", "Namibia", "Madagascar"), "Nature", "Brazil, especially in the state of Rio Grande do Sul, holds the largest reserves of citrine, a variety of yellow quartz."),
            zh = LocalizedContent("世界上最大的黄水晶矿床在哪里？", listOf("巴西", "乌拉圭", "纳米比亚", "马达加斯加"), "自然", "巴西，尤其是南里奥格兰德州，拥有最大的黄水晶储量，黄水晶是石英的一种黄色变种。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de citrino del mundo?", listOf("Brasil", "Uruguay", "Namibia", "Madagascar"), "Naturaleza", "Brasil, especialmente en el estado de Rio Grande do Sul, alberga las mayores reservas de citrino, una variedad de cuarzo amarillo.")
        ),
        BilingualQuestion(
            id = 10796, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'acoels existe-t-il?", listOf("100", "500", "2000", "5000"), "Nature", "Les acoels sont des vers marins plats et simples, et environ 2000 espèces ont été décrites à ce jour, principalement dans les eaux peu profondes."),
            en = LocalizedContent("How many species of acoels exist?", listOf("100", "500", "2000", "5000"), "Nature", "Acoels are flat, simple marine worms, and about 2000 species have been described to date, mainly in shallow waters."),
            zh = LocalizedContent("有多少种无肠动物？", listOf("100", "500", "2000", "5000"), "自然", "无肠动物是扁平简单的海洋蠕虫，目前约描述了2000种，主要生活在浅水区。"),
            es = LocalizedContent("¿Cuántas especies de acelos existen?", listOf("100", "500", "2000", "5000"), "Naturaleza", "Los acelos son gusanos marinos planos y simples, y hasta la fecha se han descrito alrededor de 2000 especies, principalmente en aguas poco profundas.")
        ),
        BilingualQuestion(
            id = 10797, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de socialisation?", listOf("l'humain", "le dauphin", "le primate", "l'éléphant"), "Nature", "Les dauphins vivent en groupes complexes appelés pods, où ils communiquent par des sifflements et des clics, et coopèrent pour chasser et protéger leurs petits. Leur cerveau développé favorise des liens sociaux forts et une capacité d'apprentissage collectif."),
            en = LocalizedContent("Which animal can have the best social ability?", listOf("the human", "the dolphin", "the primate", "the elephant"), "Nature", "Dolphins live in complex groups called pods, where they communicate through whistles and clicks, and cooperate to hunt and protect their young. Their developed brain fosters strong social bonds and collective learning ability."),
            zh = LocalizedContent("哪种动物具有最佳的社交能力？", listOf("人类", "海豚", "灵长类动物", "大象"), "自然", "海豚生活在称为“群”的复杂群体中，通过口哨声和咔嗒声交流，并合作捕猎和保护幼崽。它们发达的大脑促进了强大的社会联系和集体学习能力。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de socialización?", listOf("el humano", "el delfín", "el primate", "el elefante"), "Naturaleza", "Los delfines viven en grupos complejos llamados manadas, donde se comunican mediante silbidos y clics, y cooperan para cazar y proteger a sus crías. Su cerebro desarrollado favorece fuertes vínculos sociales y una capacidad de aprendizaje colectivo.")
        ),
        BilingualQuestion(
            id = 10798, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de topaze du monde?", listOf("le Brésil", "l'Afghanistan", "la Russie", "l'Australie"), "Nature", "Le Brésil abrite les plus grandes réserves de topaze au monde, notamment dans l'État du Minas Gerais, où se trouvent des gisements majeurs comme ceux d'Ouro Preto."),
            en = LocalizedContent("What is the largest topaz deposit in the world?", listOf("Brazil", "Afghanistan", "Russia", "Australia"), "Nature", "Brazil holds the largest topaz reserves in the world, especially in the state of Minas Gerais, where major deposits like those in Ouro Preto are found."),
            zh = LocalizedContent("世界上最大的托帕石矿床在哪里？", listOf("巴西", "阿富汗", "俄罗斯", "澳大利亚"), "自然", "巴西拥有世界上最大的托帕石储量，尤其是在米纳斯吉拉斯州，那里有像欧鲁普雷图这样的主要矿床。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de topacio del mundo?", listOf("Brasil", "Afganistán", "Rusia", "Australia"), "Naturaleza", "Brasil alberga las mayores reservas de topacio del mundo, especialmente en el estado de Minas Gerais, donde se encuentran yacimientos importantes como los de Ouro Preto.")
        ),
        BilingualQuestion(
            id = 10799, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de gnathostomules existe-t-il?", listOf("50", "200", "500", "1000"), "Nature", "Les gnathostomules, ou poissons à mâchoires, regroupent environ 500 espèces vivantes, incluant requins, raies et poissons osseux."),
            en = LocalizedContent("How many species of gnathostomulids exist?", listOf("50", "200", "500", "1000"), "Nature", "Gnathostomulids, or jaw worms, comprise about 500 living species, including sharks, rays, and bony fish."),
            zh = LocalizedContent("有多少种颚口动物？", listOf("50", "200", "500", "1000"), "自然", "颚口动物，或称有颌鱼类，包括约500个现存物种，涵盖鲨鱼、鳐鱼和硬骨鱼。"),
            es = LocalizedContent("¿Cuántas especies de gnatostomúlidos existen?", listOf("50", "200", "500", "1000"), "Naturaleza", "Los gnatostomúlidos, o gusanos mandibulados, comprenden alrededor de 500 especies vivientes, incluyendo tiburones, rayas y peces óseos.")
        ),
        BilingualQuestion(
            id = 10800, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de coopération?", listOf("la fourmi", "l'abeille", "le dauphin", "le primate"), "Nature", "Les fourmis vivent en colonies structurées où chaque individu agit pour le bien commun, ce qui en fait des expertes de la coopération. Leur capacité à coordonner des tâches complexes comme la recherche de nourriture ou la construction de nids est inégalée dans le règne animal."),
            en = LocalizedContent("Which animal can have the best cooperation ability?", listOf("ant", "bee", "dolphin", "primate"), "Nature", "Ants live in structured colonies where each individual acts for the common good, making them experts in cooperation. Their ability to coordinate complex tasks like foraging or nest building is unmatched in the animal kingdom."),
            zh = LocalizedContent("哪种动物具有最好的合作能力？", listOf("蚂蚁", "蜜蜂", "海豚", "灵长类动物"), "自然", "蚂蚁生活在结构化的群体中，每个个体都为共同利益行动，这使它们成为合作专家。它们协调复杂任务（如觅食或筑巢）的能力在动物界无与伦比。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de cooperación?", listOf("la hormiga", "la abeja", "el delfín", "el primate"), "Naturaleza", "Las hormigas viven en colonias estructuradas donde cada individuo actúa por el bien común, lo que las convierte en expertas en cooperación. Su capacidad para coordinar tareas complejas como la búsqueda de alimento o la construcción de nidos no tiene igual en el reino animal.")
        ),
        BilingualQuestion(
            id = 10801, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de rubis du monde?", listOf("la Birmanie", "la Thaïlande", "Sri Lanka", "l'Afghanistan"), "Nature", "La Birmanie, notamment la région de Mogok, est historiquement la source la plus célèbre de rubis de haute qualité, avec des gisements exploités depuis des siècles."),
            en = LocalizedContent("What is the world's largest ruby deposit?", listOf("Burma", "Thailand", "Sri Lanka", "Afghanistan"), "Nature", "Burma, especially the Mogok region, is historically the most famous source of high-quality rubies, with deposits exploited for centuries."),
            zh = LocalizedContent("世界上最大的红宝石矿床在哪里？", listOf("缅甸", "泰国", "斯里兰卡", "阿富汗"), "自然", "缅甸，特别是抹谷地区，历史上是高品质红宝石最著名的产地，矿床已开采数百年。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de rubíes del mundo?", listOf("Birmania", "Tailandia", "Sri Lanka", "Afganistán"), "Naturaleza", "Birmania, especialmente la región de Mogok, es históricamente la fuente más famosa de rubíes de alta calidad, con yacimientos explotados durante siglos.")
        ),
        BilingualQuestion(
            id = 10802, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de rotiféres existe-t-il?", listOf("500", "1000", "2000", "4000"), "Nature", "Les rotifères sont de petits organismes aquatiques microscopiques, et environ 2000 espèces ont été décrites à ce jour."),
            en = LocalizedContent("How many species of rotifers are there?", listOf("500", "1000", "2000", "4000"), "Nature", "Rotifers are small microscopic aquatic organisms, and about 2000 species have been described to date."),
            zh = LocalizedContent("轮虫有多少种？", listOf("500", "1000", "2000", "4000"), "自然", "轮虫是微小的水生生物，目前大约描述了2000种。"),
            es = LocalizedContent("¿Cuántas especies de rotíferos existen?", listOf("500", "1000", "2000", "4000"), "Naturaleza", "Los rotíferos son pequeños organismos acuáticos microscópicos, y se han descrito aproximadamente 2000 especies hasta la fecha.")
        ),
        BilingualQuestion(
            id = 10803, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de leadership?", listOf("le lion", "l'éléphant", "le loup", "le dauphin"), "Nature", "Les éléphantes matriarches guident leur troupeau grâce à leur mémoire et leur expérience, menant le groupe vers l'eau et la nourriture tout en protégeant les plus jeunes."),
            en = LocalizedContent("Which animal can have the best leadership ability?", listOf("lion", "elephant", "wolf", "dolphin"), "Nature", "Matriarch elephants guide their herd using their memory and experience, leading the group to water and food while protecting the young."),
            zh = LocalizedContent("哪种动物具有最好的领导能力？", listOf("狮子", "大象", "狼", "海豚"), "自然", "雌性象首领凭借记忆和经验引导象群，带领群体寻找水源和食物，同时保护幼象。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de liderazgo?", listOf("el león", "el elefante", "el lobo", "el delfín"), "Naturaleza", "Las elefantas matriarcas guían a su manada gracias a su memoria y experiencia, llevando al grupo hacia el agua y la comida mientras protegen a los más jóvenes.")
        ),
        BilingualQuestion(
            id = 10804, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de saphirs du monde?", listOf("la Birmanie", "la Thaïlande", "Sri Lanka", "le Cachemire"), "Nature", "Le Sri Lanka est historiquement reconnu pour ses gisements de saphirs de haute qualité, notamment dans la région de Ratnapura, surnommée la cité des pierres précieuses."),
            en = LocalizedContent("What is the world's largest sapphire deposit?", listOf("Burma", "Thailand", "Sri Lanka", "Kashmir"), "Nature", "Sri Lanka is historically recognized for its high-quality sapphire deposits, especially in the Ratnapura region, known as the city of gems."),
            zh = LocalizedContent("世界上最大的蓝宝石矿床在哪里？", listOf("缅甸", "泰国", "斯里兰卡", "克什米尔"), "自然", "斯里兰卡历史上以高品质蓝宝石矿床闻名，尤其是拉特纳普勒地区，被称为宝石之城。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de zafiros del mundo?", listOf("Birmania", "Tailandia", "Sri Lanka", "Cachemira"), "Naturaleza", "Sri Lanka es históricamente reconocida por sus yacimientos de zafiros de alta calidad, especialmente en la región de Ratnapura, conocida como la ciudad de las gemas.")
        ),
        BilingualQuestion(
            id = 10805, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de tardigrades existe-t-il?", listOf("500", "1000", "1500", "3000"), "Nature", "Plus de 1 500 espèces de tardigrades ont été décrites à ce jour, ces micro-organismes extrêmophiles étant présents dans divers environnements à travers le monde."),
            en = LocalizedContent("How many species of tardigrades are there?", listOf("500", "1000", "1500", "3000"), "Nature", "More than 1,500 species of tardigrades have been described to date, these extremophilic microorganisms being present in various environments worldwide."),
            zh = LocalizedContent("缓步动物有多少种？", listOf("500", "1000", "1500", "3000"), "自然", "目前已经描述了超过1500种缓步动物，这些极端微生物存在于世界各地的各种环境中。"),
            es = LocalizedContent("¿Cuántas especies de tardígrados existen?", listOf("500", "1000", "1500", "3000"), "Naturaleza", "Se han descrito más de 1.500 especies de tardígrados hasta la fecha, estos microorganismos extremófilos están presentes en diversos entornos de todo el mundo.")
        ),
        BilingualQuestion(
            id = 10806, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de communication?", listOf("le dauphin", "l'abeille", "le corbeau", "l'humain"), "Nature", "L'humain possède un langage articulé complexe et une capacité unique à transmettre des idées abstraites, ce qui lui confère la meilleure capacité de communication parmi tous les animaux."),
            en = LocalizedContent("Which animal can have the best communication ability?", listOf("dolphin", "bee", "crow", "human"), "Nature", "Humans possess complex articulated language and a unique ability to convey abstract ideas, giving them the best communication ability among all animals."),
            zh = LocalizedContent("哪种动物具有最好的沟通能力？", listOf("海豚", "蜜蜂", "乌鸦", "人类"), "自然", "人类拥有复杂的语言和传达抽象思想的独特能力，这使他们在所有动物中具有最好的沟通能力。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de comunicación?", listOf("el delfín", "la abeja", "el cuervo", "el humano"), "Naturaleza", "Los humanos poseen un lenguaje articulado complejo y una capacidad única para transmitir ideas abstractas, lo que les confiere la mejor capacidad de comunicación entre todos los animales.")
        ),
        BilingualQuestion(
            id = 10807, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt d'émeraude du monde?", listOf("la Colombie", "la Zambie", "la Birmanie", "l'Afghanistan"), "Nature", "La Colombie abrite les plus grandes réserves d'émeraudes au monde, notamment dans les mines de Muzo et Chivor, réputées pour leur qualité exceptionnelle."),
            en = LocalizedContent("What is the world's largest emerald deposit?", listOf("Colombia", "Zambia", "Burma", "Afghanistan"), "Nature", "Colombia holds the largest emerald reserves in the world, especially in the Muzo and Chivor mines, renowned for their exceptional quality."),
            zh = LocalizedContent("世界上最大的祖母绿矿床在哪里？", listOf("哥伦比亚", "赞比亚", "缅甸", "阿富汗"), "自然", "哥伦比亚拥有世界上最大的祖母绿储量，尤其是穆佐和奇沃尔矿，以其卓越品质而闻名。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de esmeraldas del mundo?", listOf("Colombia", "Zambia", "Birmania", "Afganistán"), "Naturaleza", "Colombia posee las mayores reservas de esmeraldas del mundo, especialmente en las minas de Muzo y Chivor, famosas por su calidad excepcional.")
        ),
        BilingualQuestion(
            id = 10808, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes d'archées existe-t-il?", listOf("100", "500", "1000", "5000"), "Nature", "Les archées sont un domaine de micro-organismes unicellulaires. On en connaît environ 1 000 espèces, mais ce nombre est probablement bien plus élevé dans la nature."),
            en = LocalizedContent("How many species of archaea are there?", listOf("100", "500", "1000", "5000"), "Nature", "Archaea are a domain of unicellular microorganisms. About 1,000 species are known, but the number is likely much higher in nature."),
            zh = LocalizedContent("古菌有多少种？", listOf("100", "500", "1000", "5000"), "自然", "古菌是一个单细胞微生物域。已知大约有1000种，但自然界中的数量可能更高。"),
            es = LocalizedContent("¿Cuántas especies de arqueas existen?", listOf("100", "500", "1000", "5000"), "Naturaleza", "Las arqueas son un dominio de microorganismos unicelulares. Se conocen alrededor de 1.000 especies, pero es probable que el número sea mucho mayor en la naturaleza.")
        ),
        BilingualQuestion(
            id = 10809, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité d'empathie?", listOf("l'humain", "le dauphin", "le primate", "l'éléphant"), "Nature", "Les humains possèdent un cortex préfrontal très développé, leur permettant de comprendre et de partager les émotions d'autrui de manière complexe, une capacité qui dépasse celle des autres animaux."),
            en = LocalizedContent("Which animal can have the best empathy ability?", listOf("human", "dolphin", "primate", "elephant"), "Nature", "Humans have a highly developed prefrontal cortex, allowing them to understand and share others' emotions in a complex way, a capacity that surpasses that of other animals."),
            zh = LocalizedContent("哪种动物具有最好的共情能力？", listOf("人类", "海豚", "灵长类动物", "大象"), "自然", "人类拥有高度发达的前额叶皮层，能够以复杂的方式理解和分享他人的情感，这种能力超越了其他动物。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de empatía?", listOf("el humano", "el delfín", "el primate", "el elefante"), "Naturaleza", "Los humanos poseen una corteza prefrontal muy desarrollada, que les permite comprender y compartir las emociones de los demás de manera compleja, una capacidad que supera a la de otros animales.")
        ),
        BilingualQuestion(
            id = 10810, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de diamants du monde?", listOf("l'Afrique du Sud", "la Russie", "le Botswana", "la Namibie"), "Nature", "La Russie abrite le plus grand gisement de diamants au monde, le champ de Kimberlite de Mirny, qui a produit des diamants de haute qualité depuis les années 1950."),
            en = LocalizedContent("What is the world's largest diamond deposit?", listOf("South Africa", "Russia", "Botswana", "Namibia"), "Nature", "Russia is home to the world's largest diamond deposit, the Mirny Kimberlite field, which has produced high-quality diamonds since the 1950s."),
            zh = LocalizedContent("世界上最大的钻石矿藏是什么？", listOf("南非", "俄罗斯", "博茨瓦纳", "纳米比亚"), "自然", "俄罗斯拥有世界上最大的钻石矿藏——米尔内金伯利岩矿田，自20世纪50年代以来一直产出高品质钻石。"),
            es = LocalizedContent("¿Cuál es el depósito de diamantes más grande del mundo?", listOf("Sudáfrica", "Rusia", "Botsuana", "Namibia"), "Naturaleza", "Rusia alberga el yacimiento de diamantes más grande del mundo, el campo de kimberlita de Mirny, que ha producido diamantes de alta calidad desde la década de 1950.")
        ),
        BilingualQuestion(
            id = 10811, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de bactéries halophiles existe-t-il?", listOf("100", "500", "1000", "2000"), "Nature", "Les bactéries halophiles, qui prospèrent dans les milieux très salés, comptent environ 1 000 espèces connues, réparties principalement dans l'ordre des Halobacteriales."),
            en = LocalizedContent("How many kinds of halophilic bacteria are there?", listOf("100", "500", "1000", "2000"), "Nature", "Halophilic bacteria, which thrive in highly saline environments, have about 1,000 known species, mainly in the order Halobacteriales."),
            zh = LocalizedContent("嗜盐细菌有多少种？", listOf("100", "500", "1000", "2000"), "自然", "嗜盐细菌在高盐环境中繁盛，已知约有1000种，主要属于盐杆菌目。"),
            es = LocalizedContent("¿Cuántos tipos de bacterias halófilas existen?", listOf("100", "500", "1000", "2000"), "Naturaleza", "Las bacterias halófilas, que prosperan en ambientes muy salinos, cuentan con aproximadamente 1,000 especies conocidas, principalmente en el orden Halobacteriales.")
        ),
        BilingualQuestion(
            id = 10812, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de mémoire à long terme?", listOf("l'humain", "l'éléphant", "le dauphin", "le corbeau"), "Nature", "Les éléphants possèdent le plus gros cerveau parmi les animaux terrestres et une mémoire exceptionnelle, leur permettant de se souvenir de routes migratoires et de membres de leur groupe pendant des décennies."),
            en = LocalizedContent("Which animal has the best long-term memory?", listOf("human", "elephant", "dolphin", "crow"), "Nature", "Elephants have the largest brain among land animals and exceptional memory, allowing them to remember migration routes and group members for decades."),
            zh = LocalizedContent("哪种动物的长期记忆能力最好？", listOf("人类", "大象", "海豚", "乌鸦"), "自然", "大象拥有陆地动物中最大的大脑和非凡的记忆力，能够记住迁徙路线和群体成员长达数十年。"),
            es = LocalizedContent("¿Qué animal tiene la mejor capacidad de memoria a largo plazo?", listOf("humano", "elefante", "delfín", "cuervo"), "Naturaleza", "Los elefantes poseen el cerebro más grande entre los animales terrestres y una memoria excepcional, que les permite recordar rutas migratorias y miembros de su grupo durante décadas.")
        ),
        BilingualQuestion(
            id = 10813, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de corindons du monde?", listOf("la Birmanie", "la Thaïlande", "Sri Lanka", "le Cambodge"), "Nature", "Le Cambodge abrite les plus vastes gisements de corindon, notamment de rubis et de saphirs, dans la région de Pailin et de Samlot."),
            en = LocalizedContent("What is the world's largest corundum deposit?", listOf("Burma", "Thailand", "Sri Lanka", "Cambodia"), "Nature", "Cambodia hosts the largest corundum deposits, including rubies and sapphires, in the Pailin and Samlot regions."),
            zh = LocalizedContent("世界上最大的刚玉矿藏是什么？", listOf("缅甸", "泰国", "斯里兰卡", "柬埔寨"), "自然", "柬埔寨在拜林和森洛地区拥有最大的刚玉矿床，包括红宝石和蓝宝石。"),
            es = LocalizedContent("¿Cuál es el depósito de corindón más grande del mundo?", listOf("Birmania", "Tailandia", "Sri Lanka", "Camboya"), "Naturaleza", "Camboya alberga los mayores yacimientos de corindón, incluidos rubíes y zafiros, en las regiones de Pailín y Samlot.")
        ),
        BilingualQuestion(
            id = 10814, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de méthanogènes existe-t-il?", listOf("50", "200", "500", "1000"), "Nature", "Les méthanogènes sont des micro-organismes archées qui produisent du méthane. On en recense environ 500 espèces différentes à ce jour."),
            en = LocalizedContent("How many kinds of methanogens are there?", listOf("50", "200", "500", "1000"), "Nature", "Methanogens are archaea that produce methane. About 500 different species have been identified to date."),
            zh = LocalizedContent("产甲烷菌有多少种？", listOf("50", "200", "500", "1000"), "自然", "产甲烷菌是产生甲烷的古菌。迄今为止已鉴定出约500种不同的物种。"),
            es = LocalizedContent("¿Cuántos tipos de metanógenos existen?", listOf("50", "200", "500", "1000"), "Naturaleza", "Los metanógenos son arqueas que producen metano. Hasta la fecha se han identificado alrededor de 500 especies diferentes.")
        ),
        BilingualQuestion(
            id = 10815, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité d'imagination?", listOf("l'humain", "le corbeau", "le dauphin", "le primate"), "Nature", "L'humain possède le néocortex le plus développé, lui permettant de créer des scénarios mentaux complexes et de simuler des réalités alternatives. Aucun autre animal n'a démontré une capacité d'abstraction et d'imagination aussi élaborée."),
            en = LocalizedContent("Which animal has the best imagination?", listOf("human", "crow", "dolphin", "primate"), "Nature", "Humans have the most developed neocortex, enabling complex mental scenarios and simulation of alternative realities. No other animal has demonstrated such elaborate abstraction and imagination."),
            zh = LocalizedContent("哪种动物的想象力最好？", listOf("人类", "乌鸦", "海豚", "灵长类"), "自然", "人类拥有最发达的新皮层，能够构建复杂的心理场景并模拟替代现实。没有其他动物表现出如此精细的抽象和想象力。"),
            es = LocalizedContent("¿Qué animal tiene la mejor capacidad de imaginación?", listOf("humano", "cuervo", "delfín", "primate"), "Naturaleza", "Los humanos poseen el neocórtex más desarrollado, lo que les permite crear escenarios mentales complejos y simular realidades alternativas. Ningún otro animal ha demostrado una capacidad de abstracción e imaginación tan elaborada.")
        ),
        BilingualQuestion(
            id = 10816, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de béryl du monde?", listOf("les États-Unis", "la Russie", "le Brésil", "l'Afrique du Sud"), "Nature", "Les États-Unis abritent la plus grande mine de béryl du monde, située à Spruce Pine, en Caroline du Nord. Ce gisement fournit du béryl de haute qualité, utilisé notamment pour la production de béryllium."),
            en = LocalizedContent("What is the world's largest beryl deposit?", listOf("United States", "Russia", "Brazil", "South Africa"), "Nature", "The United States is home to the largest beryl mine in the world, located in Spruce Pine, North Carolina. This deposit provides high-quality beryl, used especially for beryllium production."),
            zh = LocalizedContent("世界上最大的绿柱石矿藏是什么？", listOf("美国", "俄罗斯", "巴西", "南非"), "自然", "美国拥有世界上最大的绿柱石矿，位于北卡罗来纳州的云杉松。该矿床提供高品质绿柱石，主要用于铍的生产。"),
            es = LocalizedContent("¿Cuál es el depósito de berilo más grande del mundo?", listOf("Estados Unidos", "Rusia", "Brasil", "Sudáfrica"), "Naturaleza", "Estados Unidos alberga la mina de berilo más grande del mundo, ubicada en Spruce Pine, Carolina del Norte. Este yacimiento proporciona berilo de alta calidad, utilizado especialmente para la producción de berilio.")
        ),
        BilingualQuestion(
            id = 10817, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de thermophiles existe-t-il?", listOf("100", "500", "1000", "2000"), "Nature", "Les thermophiles sont des micro-organismes qui prospèrent à des températures élevées, et environ 1000 espèces différentes ont été identifiées à ce jour."),
            en = LocalizedContent("How many kinds of thermophiles are there?", listOf("100", "500", "1000", "2000"), "Nature", "Thermophiles are microorganisms that thrive at high temperatures, and about 1,000 different species have been identified to date."),
            zh = LocalizedContent("嗜热菌有多少种？", listOf("100", "500", "1000", "2000"), "自然", "嗜热菌是在高温下繁盛的微生物，迄今为止已鉴定出约1000种不同的物种。"),
            es = LocalizedContent("¿Cuántos tipos de termófilos existen?", listOf("100", "500", "1000", "2000"), "Naturaleza", "Los termófilos son microorganismos que prosperan a altas temperaturas, y hasta la fecha se han identificado alrededor de 1,000 especies diferentes.")
        ),
        BilingualQuestion(
            id = 10818, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité d'innovation?", listOf("l'humain", "le corbeau", "l'éléphant", "le dauphin"), "Nature", "L'humain possède un cortex préfrontal très développé, lui permettant une pensée abstraite et une résolution de problèmes complexes, ce qui lui confère la meilleure capacité d'innovation parmi les animaux."),
            en = LocalizedContent("Which animal has the best innovation ability?", listOf("human", "crow", "elephant", "dolphin"), "Nature", "Humans have a highly developed prefrontal cortex, enabling abstract thought and complex problem-solving, which gives them the best innovation ability among animals."),
            zh = LocalizedContent("哪种动物的创新能力最好？", listOf("人类", "乌鸦", "大象", "海豚"), "自然", "人类拥有高度发达的前额叶皮层，能够进行抽象思维和复杂问题解决，这赋予了他们在动物中最好的创新能力。"),
            es = LocalizedContent("¿Qué animal tiene la mejor capacidad de innovación?", listOf("humano", "cuervo", "elefante", "delfín"), "Naturaleza", "Los humanos poseen un córtex prefrontal muy desarrollado, lo que permite el pensamiento abstracto y la resolución de problemas complejos, otorgándoles la mejor capacidad de innovación entre los animales.")
        ),
        BilingualQuestion(
            id = 10819, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de spinelle du monde?", listOf("la Birmanie", "la Thaïlande", "la Tanzanie", "Sri Lanka"), "Nature", "La Birmanie abrite les mines de spinelle les plus célèbres, notamment dans la région de Mogok, réputée pour ses cristaux de grande qualité et de taille exceptionnelle."),
            en = LocalizedContent("What is the world's largest spinel deposit?", listOf("Burma", "Thailand", "Tanzania", "Sri Lanka"), "Nature", "Burma is home to the most famous spinel mines, especially in the Mogok region, renowned for its high-quality and exceptionally large crystals."),
            zh = LocalizedContent("世界上最大的尖晶石矿藏是什么？", listOf("缅甸", "泰国", "坦桑尼亚", "斯里兰卡"), "自然", "缅甸拥有最著名的尖晶石矿，特别是在抹谷地区，以其高品质和异常大的晶体而闻名。"),
            es = LocalizedContent("¿Cuál es el depósito de espinela más grande del mundo?", listOf("Birmania", "Tailandia", "Tanzania", "Sri Lanka"), "Naturaleza", "Birmania alberga las minas de espinela más famosas, especialmente en la región de Mogok, reconocida por sus cristales de alta calidad y tamaño excepcional.")
        ),
        BilingualQuestion(
            id = 10820, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de piezophiles existe-t-il?", listOf("10", "50", "200", "500"), "Nature", "Les piezophiles sont des micro-organismes qui vivent dans les grandes profondeurs océaniques sous haute pression, et environ 200 espèces différentes ont été identifiées à ce jour."),
            en = LocalizedContent("How many types of piezophiles exist?", listOf("10", "50", "200", "500"), "Nature", "Piezophiles are microorganisms that live in deep ocean depths under high pressure, and about 200 different species have been identified to date."),
            zh = LocalizedContent("存在多少种嗜压菌？", listOf("10", "50", "200", "500"), "自然", "嗜压菌是生活在深海高压环境中的微生物，目前大约已鉴定出200种不同的物种。"),
            es = LocalizedContent("¿Cuántos tipos de piezófilos existen?", listOf("10", "50", "200", "500"), "Naturaleza", "Los piezófilos son microorganismos que viven en las profundidades oceánicas bajo alta presión, y se han identificado alrededor de 200 especies diferentes hasta la fecha.")
        ),
        BilingualQuestion(
            id = 10821, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de créativité?", listOf("l'humain", "le corbeau", "le dauphin", "le primate"), "Nature", "L'humain possède un cortex préfrontal très développé, lui permettant une pensée abstraite et une imagination créative inégalée dans le règne animal."),
            en = LocalizedContent("Which animal can have the best creativity ability?", listOf("human", "crow", "dolphin", "primate"), "Nature", "Humans have a highly developed prefrontal cortex, allowing abstract thinking and creative imagination unmatched in the animal kingdom."),
            zh = LocalizedContent("哪种动物拥有最强的创造力？", listOf("人类", "乌鸦", "海豚", "灵长类"), "自然", "人类拥有高度发达的前额叶皮层，能够进行抽象思维和创造性想象，这在动物界是无与伦比的。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de creatividad?", listOf("el humano", "el cuervo", "el delfín", "el primate"), "Naturaleza", "El humano posee una corteza prefrontal muy desarrollada, lo que le permite un pensamiento abstracto y una imaginación creativa sin igual en el reino animal.")
        ),
        BilingualQuestion(
            id = 10822, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de turquoise du monde?", listOf("les États-Unis", "l'Iran", "le Chili", "l'Australie"), "Nature", "Les États-Unis, notamment l'Arizona et le Nevada, abritent les plus grands gisements de turquoise exploités au monde."),
            en = LocalizedContent("What is the largest turquoise deposit in the world?", listOf("the United States", "Iran", "Chile", "Australia"), "Nature", "The United States, particularly Arizona and Nevada, holds the largest exploited turquoise deposits in the world."),
            zh = LocalizedContent("世界上最大的绿松石矿床在哪里？", listOf("美国", "伊朗", "智利", "澳大利亚"), "自然", "美国，特别是亚利桑那州和内华达州，拥有世界上最大的已开采绿松石矿床。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de turquesa del mundo?", listOf("Estados Unidos", "Irán", "Chile", "Australia"), "Naturaleza", "Estados Unidos, especialmente Arizona y Nevada, alberga los mayores yacimientos de turquesa explotados del mundo.")
        ),
        BilingualQuestion(
            id = 10823, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de microbes extremophiles existe-t-il?", listOf("100", "500", "1000", "5000"), "Nature", "On estime qu'il existe environ un millier d'espèces de microbes extrémophiles connues, capables de survivre dans des conditions extrêmes comme les hautes températures ou l'acidité."),
            en = LocalizedContent("How many types of extremophile microbes exist?", listOf("100", "500", "1000", "5000"), "Nature", "It is estimated that there are about a thousand known species of extremophile microbes, capable of surviving in extreme conditions such as high temperatures or acidity."),
            zh = LocalizedContent("存在多少种极端微生物？", listOf("100", "500", "1000", "5000"), "自然", "据估计，已知的极端微生物约有1000种，它们能够在高温或酸性等极端条件下生存。"),
            es = LocalizedContent("¿Cuántos tipos de microbios extremófilos existen?", listOf("100", "500", "1000", "5000"), "Naturaleza", "Se estima que existen alrededor de mil especies conocidas de microbios extremófilos, capaces de sobrevivir en condiciones extremas como altas temperaturas o acidez.")
        ),
        BilingualQuestion(
            id = 10824, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure capacité de résolution de problèmes?", listOf("l'humain", "le corbeau", "le dauphin", "le primate"), "Nature", "L'humain possède un cortex préfrontal très développé, lui permettant l'abstraction, la planification et le raisonnement logique, des capacités cognitives supérieures à celles de tout autre animal pour résoudre des problèmes complexes."),
            en = LocalizedContent("Which animal can have the best problem-solving ability?", listOf("human", "crow", "dolphin", "primate"), "Nature", "Humans have a highly developed prefrontal cortex, enabling abstraction, planning, and logical reasoning, cognitive abilities superior to any other animal for solving complex problems."),
            zh = LocalizedContent("哪种动物拥有最强的问题解决能力？", listOf("人类", "乌鸦", "海豚", "灵长类"), "自然", "人类拥有高度发达的前额叶皮层，能够进行抽象思维、规划和逻辑推理，这些认知能力在解决复杂问题上优于任何其他动物。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor capacidad de resolución de problemas?", listOf("el humano", "el cuervo", "el delfín", "el primate"), "Naturaleza", "El humano posee una corteza prefrontal muy desarrollada, lo que le permite abstracción, planificación y razonamiento lógico, capacidades cognitivas superiores a las de cualquier otro animal para resolver problemas complejos.")
        ),
        BilingualQuestion(
            id = 10825, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de jade du monde?", listOf("la Birmanie", "la Chine", "le Népal", "la Nouvelle-Zélande"), "Nature", "La Birmanie (Myanmar) possède les plus vastes gisements de jade au monde, situés dans la région de Hpakant, fournissant environ 70% de la production mondiale."),
            en = LocalizedContent("What is the largest jade deposit in the world?", listOf("Burma", "China", "Nepal", "New Zealand"), "Nature", "Burma (Myanmar) has the largest jade deposits in the world, located in the Hpakant region, providing about 70% of global production."),
            zh = LocalizedContent("世界上最大的翡翠矿床在哪里？", listOf("缅甸", "中国", "尼泊尔", "新西兰"), "自然", "缅甸（Myanmar）拥有世界上最大的翡翠矿床，位于帕敢地区，提供全球约70%的产量。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de jade del mundo?", listOf("Birmania", "China", "Nepal", "Nueva Zelanda"), "Naturaleza", "Birmania (Myanmar) posee los mayores yacimientos de jade del mundo, ubicados en la región de Hpakant, que proporcionan aproximadamente el 70% de la producción mundial.")
        ),
        BilingualQuestion(
            id = 10826, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de plancton animal existe-t-il?", listOf("1000", "5000", "10 000", "50 000"), "Nature", "Le zooplancton regroupe une immense diversité d'organismes marins, avec environ 10 000 espèces recensées, allant des larves de poissons aux petits crustacés."),
            en = LocalizedContent("How many types of animal plankton exist?", listOf("1000", "5000", "10,000", "50,000"), "Nature", "Zooplankton encompasses a huge diversity of marine organisms, with about 10,000 recorded species, ranging from fish larvae to small crustaceans."),
            zh = LocalizedContent("存在多少种动物浮游生物？", listOf("1000", "5000", "10000", "50000"), "自然", "浮游动物包含大量多样的海洋生物，约有10000种已记录的物种，从鱼类幼体到小型甲壳类动物。"),
            es = LocalizedContent("¿Cuántos tipos de plancton animal existen?", listOf("1000", "5000", "10 000", "50 000"), "Naturaleza", "El zooplancton abarca una inmensa diversidad de organismos marinos, con alrededor de 10 000 especies registradas, que van desde larvas de peces hasta pequeños crustáceos.")
        ),
        BilingualQuestion(
            id = 10827, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut avoir la meilleure conscience de soi?", listOf("l'humain", "le dauphin", "l'éléphant", "le primate"), "Nature", "L'humain possède un cortex préfrontal très développé, lui permettant une introspection et une reconnaissance de soi dans un miroir dès 18 mois, un niveau inégalé dans le règne animal."),
            en = LocalizedContent("Which animal can have the best self-awareness?", listOf("human", "dolphin", "elephant", "primate"), "Nature", "Humans have a highly developed prefrontal cortex, enabling introspection and self-recognition in a mirror from 18 months, a level unmatched in the animal kingdom."),
            zh = LocalizedContent("哪种动物拥有最强的自我意识？", listOf("人类", "海豚", "大象", "灵长类"), "自然", "人类拥有高度发达的前额叶皮层，能够进行内省和从18个月大起在镜子中自我识别，这在动物界是无与伦比的。"),
            es = LocalizedContent("¿Qué animal puede tener la mejor conciencia de sí mismo?", listOf("el humano", "el delfín", "el elefante", "el primate"), "Naturaleza", "El humano posee una corteza prefrontal muy desarrollada, lo que le permite introspección y autorreconocimiento en un espejo desde los 18 meses, un nivel sin igual en el reino animal.")
        ),
        BilingualQuestion(
            id = 10828, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dépôt de lapis-lazuli du monde?", listOf("l'Afghanistan", "le Chili", "la Russie", "le Cachemire"), "Nature", "Le lapis-lazuli le plus réputé provient des mines de la province de Badakhshan en Afghanistan, exploitées depuis plus de 6 000 ans."),
            en = LocalizedContent("What is the largest lapis lazuli deposit in the world?", listOf("Afghanistan", "Chile", "Russia", "Kashmir"), "Nature", "The most renowned lapis lazuli comes from mines in the Badakhshan province of Afghanistan, exploited for over 6,000 years."),
            zh = LocalizedContent("世界上最大的青金石矿床在哪里？", listOf("阿富汗", "智利", "俄罗斯", "克什米尔"), "自然", "最著名的青金石产自阿富汗巴达赫尚省的矿山，已开采超过6000年。"),
            es = LocalizedContent("¿Cuál es el mayor depósito de lapislázuli del mundo?", listOf("Afganistán", "Chile", "Rusia", "Cachemira"), "Naturaleza", "El lapislázuli más renombrado proviene de las minas de la provincia de Badakhshan en Afganistán, explotadas durante más de 6.000 años.")
        ),
        BilingualQuestion(
            id = 10829, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sortes de zooplancton existe-t-il?", listOf("1000", "5000", "10 000", "50 000"), "Nature", "Le zooplancton regroupe une immense diversité d'organismes aquatiques microscopiques, avec environ 10 000 espèces recensées à ce jour."),
            en = LocalizedContent("How many types of zooplankton exist?", listOf("1000", "5000", "10,000", "50,000"), "Nature", "Zooplankton encompasses a huge diversity of microscopic aquatic organisms, with about 10,000 species recorded to date."),
            zh = LocalizedContent("存在多少种浮游动物？", listOf("1000", "5000", "10000", "50000"), "自然", "浮游动物包含大量多样的微型水生生物，目前约有10000种已记录的物种。"),
            es = LocalizedContent("¿Cuántos tipos de zooplancton existen?", listOf("1000", "5000", "10 000", "50 000"), "Naturaleza", "El zooplancton abarca una inmensa diversidad de organismos acuáticos microscópicos, con alrededor de 10 000 especies registradas hasta la fecha.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10830, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand herbivore vivant?", listOf("l'éléphant", "la girafe", "l'hippopotame", "le rhinocéros"), "Nature", "L'éléphant est le plus grand animal terrestre et se nourrit exclusivement de végétaux, ce qui en fait le plus grand herbivore vivant."),
            en = LocalizedContent("What is the largest living herbivore?", listOf("the elephant", "the giraffe", "the hippopotamus", "the rhinoceros"), "Nature", "The elephant is the largest land animal and feeds exclusively on plants, making it the largest living herbivore."),
            zh = LocalizedContent("现存最大的食草动物是什么？", listOf("大象", "长颈鹿", "河马", "犀牛"), "自然", "大象是最大的陆地动物，以植物为食，因此是现存最大的食草动物。"),
            es = LocalizedContent("¿Cuál es el herbívoro vivo más grande?", listOf("el elefante", "la jirafa", "el hipopótamo", "el rinoceronte"), "Naturaleza", "El elefante es el animal terrestre más grande y se alimenta exclusivamente de plantas, lo que lo convierte en el herbívoro vivo más grande.")
        ),
        BilingualQuestion(
            id = 10831, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand carnivore vivant?", listOf("le lion", "le tigre", "l'ours brun", "le léopard"), "Nature", "L'ours brun, en particulier la sous-espèce de l'ours kodiak, est le plus grand carnivore terrestre, pouvant peser jusqu'à 700 kg. Il est considéré comme le plus grand carnivore vivant sur terre."),
            en = LocalizedContent("What is the largest living carnivore?", listOf("the lion", "the tiger", "the brown bear", "the leopard"), "Nature", "The brown bear, particularly the Kodiak bear subspecies, is the largest terrestrial carnivore, weighing up to 700 kg. It is considered the largest living carnivore on land."),
            zh = LocalizedContent("现存最大的食肉动物是什么？", listOf("狮子", "老虎", "棕熊", "豹子"), "自然", "棕熊，特别是科迪亚克熊亚种，是最大的陆生食肉动物，体重可达700公斤，被认为是现存最大的陆生食肉动物。"),
            es = LocalizedContent("¿Cuál es el carnívoro vivo más grande?", listOf("el león", "el tigre", "el oso pardo", "el leopardo"), "Naturaleza", "El oso pardo, especialmente la subespecie de oso Kodiak, es el carnívoro terrestre más grande, con un peso de hasta 700 kg. Se considera el carnívoro vivo más grande en tierra.")
        ),
        BilingualQuestion(
            id = 10832, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand omnivore vivant?", listOf("l'hippopotame", "l'ours brun", "le rhinocéros", "le porc-épic"), "Nature", "L'ours brun est considéré comme le plus grand omnivore terrestre, pouvant peser jusqu'à 700 kg et se nourrissant aussi bien de plantes que de poissons ou de mammifères."),
            en = LocalizedContent("What is the largest living omnivore?", listOf("the hippopotamus", "the brown bear", "the rhinoceros", "the porcupine"), "Nature", "The brown bear is considered the largest terrestrial omnivore, weighing up to 700 kg and feeding on both plants and animals such as fish or mammals."),
            zh = LocalizedContent("现存最大的杂食动物是什么？", listOf("河马", "棕熊", "犀牛", "豪猪"), "自然", "棕熊被认为是最大的陆生杂食动物，体重可达700公斤，既吃植物也吃鱼类或哺乳动物等。"),
            es = LocalizedContent("¿Cuál es el omnívoro vivo más grande?", listOf("el hipopótamo", "el oso pardo", "el rinoceronte", "el puercoespín"), "Naturaleza", "El oso pardo es considerado el omnívoro terrestre más grande, con un peso de hasta 700 kg y alimentándose tanto de plantas como de peces o mamíferos.")
        ),
        BilingualQuestion(
            id = 10833, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand insectivore terrestre vivant?", listOf("l'oryctérope", "le pangolin", "la taupe géante", "le fourmilier"), "Nature", "Le fourmilier géant, pouvant mesurer jusqu'à 2,2 mètres de long, se nourrit exclusivement de fourmis et de termites, ce qui en fait le plus grand mammifère insectivore terrestre."),
            en = LocalizedContent("What is the largest living terrestrial insectivore?", listOf("the aardvark", "the pangolin", "the giant mole", "the anteater"), "Nature", "The giant anteater, which can reach up to 2.2 meters in length, feeds exclusively on ants and termites, making it the largest terrestrial insectivorous mammal."),
            zh = LocalizedContent("现存最大的陆生食虫动物是什么？", listOf("土豚", "穿山甲", "巨鼹鼠", "食蚁兽"), "自然", "大食蚁兽体长可达2.2米，以蚂蚁和白蚁为食，是最大的陆生食虫哺乳动物。"),
            es = LocalizedContent("¿Cuál es el insectívoro terrestre vivo más grande?", listOf("el cerdo hormiguero", "el pangolín", "el topo gigante", "el oso hormiguero"), "Naturaleza", "El oso hormiguero gigante, que puede alcanzar hasta 2,2 metros de longitud, se alimenta exclusivamente de hormigas y termitas, lo que lo convierte en el mamífero insectívoro terrestre más grande.")
        ),
        BilingualQuestion(
            id = 10834, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand planctivore vivant?", listOf("la baleine bleue", "la baleine à fanons", "le requin-baleine", "la raie manta"), "Nature", "Le requin-baleine, pouvant atteindre 18 mètres, se nourrit principalement de plancton qu'il filtre grâce à ses branchies, ce qui en fait le plus grand poisson planctivore au monde."),
            en = LocalizedContent("What is the largest living planktivore?", listOf("the blue whale", "the baleen whale", "the whale shark", "the manta ray"), "Nature", "The whale shark, which can reach 18 meters, feeds mainly on plankton filtered through its gills, making it the largest planktivorous fish in the world."),
            zh = LocalizedContent("现存最大的浮游生物食性动物是什么？", listOf("蓝鲸", "须鲸", "鲸鲨", "蝠鲼"), "自然", "鲸鲨体长可达18米，主要通过鳃过滤浮游生物为食，是世界上最大的浮游生物食性鱼类。"),
            es = LocalizedContent("¿Cuál es el planctívoro vivo más grande?", listOf("la ballena azul", "la ballena barbada", "el tiburón ballena", "la manta raya"), "Naturaleza", "El tiburón ballena, que puede alcanzar 18 metros, se alimenta principalmente de plancton que filtra a través de sus branquias, lo que lo convierte en el pez planctívoro más grande del mundo.")
        ),
        BilingualQuestion(
            id = 10835, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand frugivore vivant?", listOf("le singe", "la chauve-souris", "l'ours", "le perroquet"), "Nature", "La chauve-souris frugivore, notamment la roussette, peut atteindre une envergure de près de deux mètres, ce qui en fait le plus grand mammifère se nourrissant exclusivement de fruits."),
            en = LocalizedContent("What is the largest living frugivore?", listOf("the monkey", "the bat", "the bear", "the parrot"), "Nature", "The fruit bat, especially the flying fox, can have a wingspan of nearly two meters, making it the largest mammal that feeds exclusively on fruit."),
            zh = LocalizedContent("现存最大的食果动物是什么？", listOf("猴子", "蝙蝠", "熊", "鹦鹉"), "自然", "果蝠，特别是狐蝠，翼展可达近两米，是最大的以水果为食的哺乳动物。"),
            es = LocalizedContent("¿Cuál es el frugívoro vivo más grande?", listOf("el mono", "el murciélago", "el oso", "el loro"), "Naturaleza", "El murciélago frugívoro, especialmente el zorro volador, puede alcanzar una envergadura de casi dos metros, lo que lo convierte en el mamífero más grande que se alimenta exclusivamente de frutas.")
        ),
        BilingualQuestion(
            id = 10836, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand granivore vivant?", listOf("l'autruche", "l'émeu", "la grue", "l'oie"), "Nature", "L'autruche, bien qu'oiseau, est le plus grand animal vivant se nourrissant principalement de graines, pouvant atteindre 2,7 mètres de haut."),
            en = LocalizedContent("What is the largest living granivore?", listOf("the ostrich", "the emu", "the crane", "the goose"), "Nature", "The ostrich, although a bird, is the largest living animal that feeds mainly on seeds, reaching up to 2.7 meters in height."),
            zh = LocalizedContent("现存最大的食谷动物是什么？", listOf("鸵鸟", "鸸鹋", "鹤", "鹅"), "自然", "鸵鸟虽然是鸟类，但以种子为主食，身高可达2.7米，是现存最大的食谷动物。"),
            es = LocalizedContent("¿Cuál es el granívoro vivo más grande?", listOf("el avestruz", "el emú", "la grulla", "el ganso"), "Naturaleza", "El avestruz, aunque es un ave, es el animal vivo más grande que se alimenta principalmente de semillas, alcanzando hasta 2,7 metros de altura.")
        ),
        BilingualQuestion(
            id = 10837, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand néctarivore vivant?", listOf("le colibri", "la chauve-souris", "l'abeille", "le papillon"), "Nature", "La chauve-souris, notamment la roussette, est le plus grand mammifère se nourrissant exclusivement de nectar, pouvant atteindre 40 cm d'envergure."),
            en = LocalizedContent("What is the largest living nectarivore?", listOf("the hummingbird", "the bat", "the bee", "the butterfly"), "Nature", "The bat, especially the flying fox, is the largest mammal that feeds exclusively on nectar, with a wingspan of up to 40 cm."),
            zh = LocalizedContent("现存最大的食蜜动物是什么？", listOf("蜂鸟", "蝙蝠", "蜜蜂", "蝴蝶"), "自然", "蝙蝠，特别是狐蝠，是最大的以花蜜为食的哺乳动物，翼展可达40厘米。"),
            es = LocalizedContent("¿Cuál es el nectarívoro vivo más grande?", listOf("el colibrí", "el murciélago", "la abeja", "la mariposa"), "Naturaleza", "El murciélago, especialmente el zorro volador, es el mamífero más grande que se alimenta exclusivamente de néctar, con una envergadura de hasta 40 cm.")
        ),
        BilingualQuestion(
            id = 10838, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand saprophage vivant?", listOf("le vautour", "le hyène", "le poisson-chat", "l'insecte"), "Nature", "La hyène est le plus grand mammifère spécialisé dans le charognage, se nourrissant principalement de carcasses d'animaux morts."),
            en = LocalizedContent("What is the largest living saprophage?", listOf("the vulture", "the hyena", "the catfish", "the insect"), "Nature", "The hyena is the largest mammal specialized in scavenging, feeding mainly on carcasses of dead animals."),
            zh = LocalizedContent("现存最大的食腐动物是什么？", listOf("秃鹫", "鬣狗", "鲶鱼", "昆虫"), "自然", "鬣狗是最大的专门食腐的哺乳动物，主要以动物尸体为食。"),
            es = LocalizedContent("¿Cuál es el saprófago vivo más grande?", listOf("el buitre", "la hiena", "el bagre", "el insecto"), "Naturaleza", "La hiena es el mamífero más grande especializado en carroñeo, alimentándose principalmente de cadáveres de animales muertos.")
        ),
        BilingualQuestion(
            id = 10839, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parasitaire vivant?", listOf("la sangsue", "le ver", "le moustique", "le pou"), "Nature", "Le ver solitaire (ténia) est l'un des plus grands parasites vivants, pouvant atteindre plusieurs mètres dans l'intestin humain. Il se nourrit aux dépens de son hôte."),
            en = LocalizedContent("What is the largest living parasite?", listOf("the leech", "the worm", "the mosquito", "the louse"), "Nature", "The tapeworm is one of the largest living parasites, reaching several meters in the human intestine. It feeds at the expense of its host."),
            zh = LocalizedContent("现存最大的寄生动物是什么？", listOf("水蛭", "蠕虫", "蚊子", "虱子"), "自然", "绦虫是最大的寄生动物之一，可在人体肠道内长达数米，以宿主为食。"),
            es = LocalizedContent("¿Cuál es el parásito vivo más grande?", listOf("la sanguijuela", "el gusano", "el mosquito", "el piojo"), "Naturaleza", "La tenia es uno de los parásitos vivos más grandes, pudiendo alcanzar varios metros en el intestino humano. Se alimenta a expensas de su huésped.")
        ),
        BilingualQuestion(
            id = 10840, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand détritivore vivant?", listOf("le ver de terre", "le cafard", "le poisson-chat", "le crabe"), "Nature", "Le crabe de cocotier, ou birgus latro, est le plus grand arthropode terrestre et se nourrit principalement de matières organiques en décomposition, ce qui en fait le plus grand détritivore vivant."),
            en = LocalizedContent("What is the largest living detritivore?", listOf("earthworm", "cockroach", "catfish", "crab"), "Nature", "The coconut crab, or Birgus latro, is the largest terrestrial arthropod and primarily feeds on decomposing organic matter, making it the largest living detritivore."),
            zh = LocalizedContent("现存最大的食碎屑动物是什么？", listOf("蚯蚓", "蟑螂", "鲶鱼", "螃蟹"), "自然", "椰子蟹（Birgus latro）是最大的陆生节肢动物，主要以腐烂的有机物为食，因此是现存最大的食碎屑动物。"),
            es = LocalizedContent("¿Cuál es el detritívoro vivo más grande?", listOf("lombriz de tierra", "cucaracha", "bagre", "cangrejo"), "Naturaleza", "El cangrejo de los cocoteros, o Birgus latro, es el artrópodo terrestre más grande y se alimenta principalmente de materia orgánica en descomposición, lo que lo convierte en el detritívoro vivo más grande.")
        ),
        BilingualQuestion(
            id = 10841, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pourcentage d'oxygène y a-t-il dans l'atmosphère?", listOf("10%", "21%", "35%", "50%"), "Nature", "L'oxygène représente environ 21 % de l'atmosphère terrestre, un taux stable qui permet la respiration des êtres vivants. Ce gaz est produit principalement par la photosynthèse des plantes."),
            en = LocalizedContent("What percentage of oxygen is in the atmosphere?", listOf("10%", "21%", "35%", "50%"), "Nature", "Oxygen makes up about 21% of Earth's atmosphere, a stable level that allows living beings to breathe. This gas is mainly produced by plant photosynthesis."),
            zh = LocalizedContent("大气中氧气的百分比是多少？", listOf("10%", "21%", "35%", "50%"), "自然", "氧气约占地球大气的21%，这一稳定水平使生物能够呼吸。这种气体主要由植物光合作用产生。"),
            es = LocalizedContent("¿Qué porcentaje de oxígeno hay en la atmósfera?", listOf("10%", "21%", "35%", "50%"), "Naturaleza", "El oxígeno constituye aproximadamente el 21% de la atmósfera terrestre, un nivel estable que permite la respiración de los seres vivos. Este gas es producido principalmente por la fotosíntesis de las plantas.")
        ),
        BilingualQuestion(
            id = 10842, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pourcentage de dioxyde de carbone y a-t-il dans l'atmosphère?", listOf("0.04%", "1%", "5%", "10%"), "Nature", "Le dioxyde de carbone ne représente que 0,04 % de l'atmosphère terrestre, mais ce gaz à effet de serre joue un rôle clé dans le réchauffement climatique malgré sa faible concentration."),
            en = LocalizedContent("What percentage of carbon dioxide is in the atmosphere?", listOf("0.04%", "1%", "5%", "10%"), "Nature", "Carbon dioxide makes up only 0.04% of Earth's atmosphere, but this greenhouse gas plays a key role in global warming despite its low concentration."),
            zh = LocalizedContent("大气中二氧化碳的百分比是多少？", listOf("0.04%", "1%", "5%", "10%"), "自然", "二氧化碳仅占地球大气的0.04%，但这种温室气体尽管浓度很低，却在全球变暖中起着关键作用。"),
            es = LocalizedContent("¿Qué porcentaje de dióxido de carbono hay en la atmósfera?", listOf("0.04%", "1%", "5%", "10%"), "Naturaleza", "El dióxido de carbono constituye solo el 0.04% de la atmósfera terrestre, pero este gas de efecto invernadero juega un papel clave en el calentamiento global a pesar de su baja concentración.")
        ),
        BilingualQuestion(
            id = 10843, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le gaz le plus abondant dans l'atmosphère?", listOf("l'oxygène", "le dioxyde de carbone", "l'azote", "l'argon"), "Nature", "L'azote représente environ 78% de l'atmosphère terrestre, loin devant l'oxygène (21%). Il est essentiel à la vie mais inerte pour la respiration humaine."),
            en = LocalizedContent("What is the most abundant gas in the atmosphere?", listOf("oxygen", "carbon dioxide", "nitrogen", "argon"), "Nature", "Nitrogen makes up about 78% of Earth's atmosphere, far ahead of oxygen (21%). It is essential for life but inert for human respiration."),
            zh = LocalizedContent("大气中最丰富的气体是什么？", listOf("氧气", "二氧化碳", "氮气", "氩气"), "自然", "氮气约占地球大气的78%，远高于氧气（21%）。它对生命至关重要，但对人类呼吸是惰性的。"),
            es = LocalizedContent("¿Cuál es el gas más abundante en la atmósfera?", listOf("oxígeno", "dióxido de carbono", "nitrógeno", "argón"), "Naturaleza", "El nitrógeno constituye aproximadamente el 78% de la atmósfera terrestre, muy por delante del oxígeno (21%). Es esencial para la vida pero inerte para la respiración humana.")
        ),
        BilingualQuestion(
            id = 10844, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le gaz à effet de serre le plus abondant?", listOf("le CO2", "le méthane", "la vapeur d'eau", "l'oxyde nitreux"), "Nature", "La vapeur d'eau est le gaz à effet de serre le plus abondant dans l'atmosphère, représentant environ 60 à 70% de l'effet de serre naturel."),
            en = LocalizedContent("What is the most abundant greenhouse gas?", listOf("CO2", "methane", "water vapor", "nitrous oxide"), "Nature", "Water vapor is the most abundant greenhouse gas in the atmosphere, accounting for about 60-70% of the natural greenhouse effect."),
            zh = LocalizedContent("最丰富的温室气体是什么？", listOf("二氧化碳", "甲烷", "水蒸气", "一氧化二氮"), "自然", "水蒸气是大气中最丰富的温室气体，约占自然温室效应的60-70%。"),
            es = LocalizedContent("¿Cuál es el gas de efecto invernadero más abundante?", listOf("CO2", "metano", "vapor de agua", "óxido nitroso"), "Naturaleza", "El vapor de agua es el gas de efecto invernadero más abundante en la atmósfera, representando aproximadamente el 60-70% del efecto invernadero natural.")
        ),
        BilingualQuestion(
            id = 10845, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de couches a l'atmosphère?", listOf("2", "3", "5", "7"), "Nature", "L'atmosphère terrestre est divisée en cinq couches principales : troposphère, stratosphère, mésosphère, thermosphère et exosphère."),
            en = LocalizedContent("How many layers does the atmosphere have?", listOf("2", "3", "5", "7"), "Nature", "Earth's atmosphere is divided into five main layers: troposphere, stratosphere, mesosphere, thermosphere, and exosphere."),
            zh = LocalizedContent("大气层有多少层？", listOf("2", "3", "5", "7"), "自然", "地球大气层分为五个主要层：对流层、平流层、中间层、热层和外层。"),
            es = LocalizedContent("¿Cuántas capas tiene la atmósfera?", listOf("2", "3", "5", "7"), "Naturaleza", "La atmósfera terrestre se divide en cinco capas principales: troposfera, estratosfera, mesosfera, termosfera y exosfera.")
        ),
        BilingualQuestion(
            id = 10846, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut sommet du monde sous-marin?", listOf("le Mont Tamu", "le Mont Hess", "le Mont Lomonosov", "le pic Lomonosov"), "Nature", "Le mont Tamu, situé dans l'océan Pacifique, est un volcan sous-marin culminant à environ 4 460 mètres sous la surface, ce qui en fait le plus haut sommet sous-marin connu."),
            en = LocalizedContent("What is the highest underwater peak in the world?", listOf("Mount Tamu", "Mount Hess", "Mount Lomonosov", "Lomonosov Peak"), "Nature", "Mount Tamu, located in the Pacific Ocean, is an underwater volcano rising about 4,460 meters below the surface, making it the highest known underwater peak."),
            zh = LocalizedContent("世界上最高的海底山峰是什么？", listOf("塔穆山", "赫斯山", "罗蒙诺索夫山", "罗蒙诺索夫峰"), "自然", "塔穆山位于太平洋，是一座海底火山，高出海底约4460米，是已知最高的海底山峰。"),
            es = LocalizedContent("¿Cuál es el pico submarino más alto del mundo?", listOf("Monte Tamu", "Monte Hess", "Monte Lomonosov", "Pico Lomonosov"), "Naturaleza", "El monte Tamu, ubicado en el océano Pacífico, es un volcán submarino que se eleva unos 4.460 metros bajo la superficie, lo que lo convierte en el pico submarino más alto conocido.")
        ),
        BilingualQuestion(
            id = 10847, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus froid biome du monde?", listOf("la toundra", "la région polaire", "les hautes montagnes", "le désert arctique"), "Nature", "Les régions polaires, comme l'Antarctique et l'Arctique, enregistrent les températures les plus basses sur Terre, atteignant souvent -50°C ou moins en hiver."),
            en = LocalizedContent("What is the coldest biome in the world?", listOf("tundra", "polar region", "high mountains", "Arctic desert"), "Nature", "Polar regions, such as Antarctica and the Arctic, record the lowest temperatures on Earth, often reaching -50°C or lower in winter."),
            zh = LocalizedContent("世界上最冷的生物群系是什么？", listOf("苔原", "极地地区", "高山", "北极沙漠"), "自然", "极地地区，如南极和北极，记录了地球上最低的温度，冬季常达到-50°C或更低。"),
            es = LocalizedContent("¿Cuál es el bioma más frío del mundo?", listOf("tundra", "región polar", "altas montañas", "desierto ártico"), "Naturaleza", "Las regiones polares, como la Antártida y el Ártico, registran las temperaturas más bajas de la Tierra, alcanzando a menudo -50°C o menos en invierno.")
        ),
        BilingualQuestion(
            id = 10848, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus sec biome du monde?", listOf("le désert", "la toundra", "la savane", "le plateau"), "Nature", "Le désert d'Atacama au Chili est considéré comme le plus sec, avec des zones n'ayant reçu aucune pluie depuis des siècles."),
            en = LocalizedContent("What is the driest biome in the world?", listOf("desert", "tundra", "savanna", "plateau"), "Nature", "The Atacama Desert in Chile is considered the driest, with areas that have not received any rain for centuries."),
            zh = LocalizedContent("世界上最干燥的生物群系是什么？", listOf("沙漠", "苔原", "稀树草原", "高原"), "自然", "智利的阿塔卡马沙漠被认为是最干燥的，有些地区几个世纪没有降雨。"),
            es = LocalizedContent("¿Cuál es el bioma más seco del mundo?", listOf("desierto", "tundra", "sabana", "meseta"), "Naturaleza", "El desierto de Atacama en Chile es considerado el más seco, con áreas que no han recibido lluvia durante siglos.")
        ),
        BilingualQuestion(
            id = 10849, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus humide biome du monde?", listOf("la forêt tropicale humide", "la forêt tempérée", "les zones côtières", "les zones de marais"), "Nature", "Les forêts tropicales humides reçoivent plus de 2000 mm de précipitations par an et ont un taux d'humidité élevé constant, ce qui en fait le biome le plus humide."),
            en = LocalizedContent("What is the wettest biome in the world?", listOf("tropical rainforest", "temperate forest", "coastal areas", "wetlands"), "Nature", "Tropical rainforests receive over 2000 mm of precipitation per year and have a constantly high humidity level, making them the wettest biome."),
            zh = LocalizedContent("世界上最湿润的生物群系是什么？", listOf("热带雨林", "温带森林", "沿海地区", "湿地"), "自然", "热带雨林每年降水量超过2000毫米，湿度持续很高，是最湿润的生物群系。"),
            es = LocalizedContent("¿Cuál es el bioma más húmedo del mundo?", listOf("selva tropical", "bosque templado", "zonas costeras", "humedales"), "Naturaleza", "Las selvas tropicales reciben más de 2000 mm de precipitación al año y tienen un nivel de humedad constantemente alto, lo que las convierte en el bioma más húmedo.")
        ),
        BilingualQuestion(
            id = 10850, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de couches océaniques principales existe-t-il?", listOf("2", "3", "5", "7"), "Nature", "Les océans sont divisés en cinq couches principales : épipélagique, mésopélagique, bathypélagique, abyssopélagique et hadopélagique, classées selon la profondeur et la lumière."),
            en = LocalizedContent("How many main oceanic layers are there?", listOf("2", "3", "5", "7"), "Nature", "Oceans are divided into five main layers: epipelagic, mesopelagic, bathypelagic, abyssopelagic, and hadopelagic, classified by depth and light."),
            zh = LocalizedContent("海洋主要分为多少层？", listOf("2", "3", "5", "7"), "自然", "海洋根据深度和光照分为五个主要层：表层带、中层带、深层带、深渊带和超深渊带。"),
            es = LocalizedContent("¿Cuántas capas oceánicas principales existen?", listOf("2", "3", "5", "7"), "Naturaleza", "Los océanos se dividen en cinco capas principales: epipelágica, mesopelágica, batipelágica, abisopelágica y hadopelágica, clasificadas según la profundidad y la luz.")
        ),
        BilingualQuestion(
            id = 10851, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus chaud biome océanique?", listOf("le récif de corail", "la zone tropicale", "la zone équatoriale", "la zone de monsson"), "Nature", "Les eaux océaniques tropicales reçoivent le plus fort ensoleillement annuel, ce qui élève leur température en surface au-dessus de 20°C. C'est le biome marin le plus chaud."),
            en = LocalizedContent("What is the warmest ocean biome?", listOf("coral reef", "tropical zone", "equatorial zone", "monsoon zone"), "Nature", "Tropical ocean waters receive the highest annual sunlight, raising surface temperatures above 20°C. This is the warmest marine biome."),
            zh = LocalizedContent("最温暖的海洋生物群落是什么？", listOf("珊瑚礁", "热带区域", "赤道区域", "季风区域"), "自然", "热带海洋水域接受最高的年日照量，使表层温度升至20°C以上。这是最温暖的海洋生物群落。"),
            es = LocalizedContent("¿Cuál es el bioma oceánico más cálido?", listOf("el arrecife de coral", "la zona tropical", "la zona ecuatorial", "la zona monzónica"), "Naturaleza", "Las aguas oceánicas tropicales reciben la mayor insolación anual, elevando su temperatura superficial por encima de 20°C. Es el bioma marino más cálido.")
        ),
        BilingualQuestion(
            id = 10852, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus froid biome océanique?", listOf("la zone polaire", "la zone de transition", "la zone abyssale", "la zone bathyale"), "Nature", "La zone abyssale, située entre 2000 et 6000 mètres de profondeur, est le biome océanique le plus froid avec des températures proches de 0°C, car la lumière solaire n'y pénètre pas."),
            en = LocalizedContent("What is the coldest ocean biome?", listOf("polar zone", "transition zone", "abyssal zone", "bathyal zone"), "Nature", "The abyssal zone, between 2000 and 6000 meters deep, is the coldest ocean biome with temperatures near 0°C, as sunlight does not penetrate."),
            zh = LocalizedContent("最寒冷的海洋生物群落是什么？", listOf("极地区域", "过渡区域", "深渊带", "深海带"), "自然", "深渊带位于2000至6000米深度，是温度接近0°C的最寒冷海洋生物群落，因为阳光无法穿透。"),
            es = LocalizedContent("¿Cuál es el bioma oceánico más frío?", listOf("la zona polar", "la zona de transición", "la zona abisal", "la zona batial"), "Naturaleza", "La zona abisal, situada entre 2000 y 6000 metros de profundidad, es el bioma oceánico más frío con temperaturas cercanas a 0°C, ya que la luz solar no penetra.")
        ),
        BilingualQuestion(
            id = 10853, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sortes de biomes terrestres principaux existe-t-il?", listOf("5", "8", "12", "15"), "Nature", "La classification la plus courante des biomes terrestres, basée sur le climat et la végétation, en distingue douze, incluant par exemple la forêt tropicale, la toundra et le désert."),
            en = LocalizedContent("How many main terrestrial biomes are there?", listOf("5", "8", "12", "15"), "Nature", "The most common classification of terrestrial biomes, based on climate and vegetation, distinguishes twelve, including for example tropical forest, tundra, and desert."),
            zh = LocalizedContent("主要陆地生物群落有多少种？", listOf("5", "8", "12", "15"), "自然", "基于气候和植被的最常见陆地生物群落分类区分出十二种，包括例如热带森林、苔原和沙漠。"),
            es = LocalizedContent("¿Cuántos tipos de biomas terrestres principales existen?", listOf("5", "8", "12", "15"), "Naturaleza", "La clasificación más común de los biomas terrestres, basada en el clima y la vegetación, distingue doce, incluyendo por ejemplo el bosque tropical, la tundra y el desierto.")
        ),
        BilingualQuestion(
            id = 10854, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sortes de biomes aquatiques principaux existe-t-il?", listOf("2", "3", "5", "7"), "Nature", "Les cinq biomes aquatiques principaux sont les océans, les récifs coralliens, les estuaires, les lacs et les rivières."),
            en = LocalizedContent("How many main aquatic biomes are there?", listOf("2", "3", "5", "7"), "Nature", "The five main aquatic biomes are oceans, coral reefs, estuaries, lakes, and rivers."),
            zh = LocalizedContent("主要水生生物群落有多少种？", listOf("2", "3", "5", "7"), "自然", "五种主要水生生物群落是海洋、珊瑚礁、河口、湖泊和河流。"),
            es = LocalizedContent("¿Cuántos tipos de biomas acuáticos principales existen?", listOf("2", "3", "5", "7"), "Naturaleza", "Los cinco biomas acuáticos principales son los océanos, los arrecifes de coral, los estuarios, los lagos y los ríos.")
        ),
        BilingualQuestion(
            id = 10855, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand biome du monde?", listOf("l'océan", "la forêt tropicale", "la taïga", "la savane"), "Nature", "L'océan recouvre environ 71% de la surface terrestre et constitue un biome continu, ce qui en fait le plus vaste écosystème de la planète."),
            en = LocalizedContent("What is the largest biome in the world?", listOf("ocean", "tropical forest", "taiga", "savanna"), "Nature", "The ocean covers about 71% of the Earth's surface and is a continuous biome, making it the largest ecosystem on the planet."),
            zh = LocalizedContent("世界上最大的生物群落是什么？", listOf("海洋", "热带森林", "针叶林", "热带草原"), "自然", "海洋覆盖地球表面约71%，是一个连续的生物群落，使其成为地球上最大的生态系统。"),
            es = LocalizedContent("¿Cuál es el bioma más grande del mundo?", listOf("el océano", "el bosque tropical", "la taiga", "la sabana"), "Naturaleza", "El océano cubre aproximadamente el 71% de la superficie terrestre y constituye un bioma continuo, lo que lo convierte en el ecosistema más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10856, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le deuxième plus grand biome du monde?", listOf("la forêt tropicale", "la savane", "la taïga", "la prairie"), "Nature", "La taïga, aussi appelée forêt boréale, s'étend sur de vastes régions d'Europe, d'Asie et d'Amérique du Nord, juste après la toundra en termes de superficie."),
            en = LocalizedContent("What is the second largest biome in the world?", listOf("tropical forest", "savanna", "taiga", "grassland"), "Nature", "The taiga, also called boreal forest, extends over vast regions of Europe, Asia, and North America, just after tundra in terms of area."),
            zh = LocalizedContent("世界上第二大生物群落是什么？", listOf("热带森林", "热带草原", "针叶林", "草原"), "自然", "针叶林，也称为北方森林，延伸至欧洲、亚洲和北美洲的广阔区域，面积仅次于苔原。"),
            es = LocalizedContent("¿Cuál es el segundo bioma más grande del mundo?", listOf("el bosque tropical", "la sabana", "la taiga", "la pradera"), "Naturaleza", "La taiga, también llamada bosque boreal, se extiende por vastas regiones de Europa, Asia y América del Norte, justo después de la tundra en términos de superficie.")
        ),
        BilingualQuestion(
            id = 10857, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le troisième plus grand biome du monde?", listOf("la forêt tempérée", "la savane", "la taïga", "le désert"), "Nature", "La taïga, aussi appelée forêt boréale, s'étend sur de vastes régions d'Europe, d'Asie et d'Amérique du Nord, ce qui en fait le troisième plus grand biome après la toundra et la forêt tropicale humide."),
            en = LocalizedContent("What is the third largest biome in the world?", listOf("temperate forest", "savanna", "taiga", "desert"), "Nature", "The taiga, also called boreal forest, extends over vast regions of Europe, Asia, and North America, making it the third largest biome after tundra and tropical rainforest."),
            zh = LocalizedContent("世界上第三大生物群落是什么？", listOf("温带森林", "热带草原", "针叶林", "沙漠"), "自然", "针叶林，也称为北方森林，延伸至欧洲、亚洲和北美洲的广阔区域，使其成为仅次于苔原和热带雨林的第三大生物群落。"),
            es = LocalizedContent("¿Cuál es el tercer bioma más grande del mundo?", listOf("el bosque templado", "la sabana", "la taiga", "el desierto"), "Naturaleza", "La taiga, también llamada bosque boreal, se extiende por vastas regiones de Europa, Asia y América del Norte, lo que la convierte en el tercer bioma más grande después de la tundra y la selva tropical.")
        ),
        BilingualQuestion(
            id = 10858, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand écosystème forestier du monde?", listOf("la forêt amazonienne", "la taïga", "la forêt équatoriale d'Afrique", "la forêt boréale"), "Nature", "La forêt amazonienne s'étend sur environ 5,5 millions de kilomètres carrés, couvrant neuf pays d'Amérique du Sud, ce qui en fait la plus vaste forêt tropicale et le plus grand écosystème forestier de la planète."),
            en = LocalizedContent("What is the largest forest ecosystem in the world?", listOf("Amazon rainforest", "taiga", "African equatorial forest", "boreal forest"), "Nature", "The Amazon rainforest spans about 5.5 million square kilometers, covering nine South American countries, making it the largest tropical forest and the largest forest ecosystem on the planet."),
            zh = LocalizedContent("世界上最大的森林生态系统是什么？", listOf("亚马逊雨林", "针叶林", "非洲赤道森林", "北方森林"), "自然", "亚马逊雨林面积约550万平方公里，覆盖南美洲九个国家，使其成为最大的热带森林和地球上最大的森林生态系统。"),
            es = LocalizedContent("¿Cuál es el ecosistema forestal más grande del mundo?", listOf("la selva amazónica", "la taiga", "el bosque ecuatorial africano", "el bosque boreal"), "Naturaleza", "La selva amazónica se extiende por aproximadamente 5,5 millones de kilómetros cuadrados, cubriendo nueve países de América del Sur, lo que la convierte en el bosque tropical más grande y el ecosistema forestal más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10859, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème grassland du monde?", listOf("la savane africaine", "les steppes asiatiques", "les prairies nord-américaines", "les pampas sud-américaines"), "Nature", "La savane africaine est le plus grand écosystème de prairie (grassland) du monde, s'étendant sur environ 13 millions de kilomètres carrés à travers l'Afrique subsaharienne."),
            en = LocalizedContent("What is the largest grassland ecosystem in the world?", listOf("African savanna", "Asian steppes", "North American prairies", "South American pampas"), "Nature", "The African savanna is the largest grassland ecosystem in the world, spanning about 13 million square kilometers across sub-Saharan Africa."),
            zh = LocalizedContent("世界上最大的草原生态系统是什么？", listOf("非洲热带草原", "亚洲草原", "北美大草原", "南美潘帕斯草原"), "自然", "非洲热带草原是世界上最大的草原生态系统，横跨撒哈拉以南非洲约1300万平方公里。"),
            es = LocalizedContent("¿Cuál es el ecosistema de pastizal más grande del mundo?", listOf("la sabana africana", "las estepas asiáticas", "las praderas norteamericanas", "las pampas sudamericanas"), "Naturaleza", "La sabana africana es el ecosistema de pastizal más grande del mundo, extendiéndose por aproximadamente 13 millones de kilómetros cuadrados a través del África subsahariana.")
        ),
        BilingualQuestion(
            id = 10860, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand écosystème aquatique du monde?", listOf("l'océan Pacifique", "l'océan Atlantique", "l'océan Indien", "l'océan Arctique"), "Nature", "L'océan Pacifique est le plus vaste et le plus profond des océans, couvrant environ un tiers de la surface terrestre, ce qui en fait le plus grand écosystème aquatique du monde."),
            en = LocalizedContent("What is the largest aquatic ecosystem in the world?", listOf("the Pacific Ocean", "the Atlantic Ocean", "the Indian Ocean", "the Arctic Ocean"), "Nature", "The Pacific Ocean is the largest and deepest ocean, covering about one-third of the Earth's surface, making it the largest aquatic ecosystem in the world."),
            zh = LocalizedContent("世界上最大的水生生态系统是什么？", listOf("太平洋", "大西洋", "印度洋", "北冰洋"), "自然", "太平洋是最大、最深的海洋，覆盖了地球表面约三分之一，使其成为世界上最大的水生生态系统。"),
            es = LocalizedContent("¿Cuál es el ecosistema acuático más grande del mundo?", listOf("el océano Pacífico", "el océano Atlántico", "el océano Índico", "el océano Ártico"), "Naturaleza", "El océano Pacífico es el más grande y profundo, cubriendo aproximadamente un tercio de la superficie terrestre, lo que lo convierte en el ecosistema acuático más grande del mundo.")
        ),
        BilingualQuestion(
            id = 10861, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand récif de corail du monde?", listOf("la Grande Barrière de Corail", "le système de récifs de Belize", "le récif de Caraïbes", "le récif du Pacifique"), "Nature", "La Grande Barrière de Corail, située au large de l'Australie, s'étend sur plus de 2300 kilomètres et est visible depuis l'espace, ce qui en fait la plus vaste structure vivante du globe."),
            en = LocalizedContent("What is the largest coral reef in the world?", listOf("the Great Barrier Reef", "the Belize Barrier Reef", "the Caribbean Reef", "the Pacific Reef"), "Nature", "The Great Barrier Reef, located off the coast of Australia, stretches over 2,300 kilometers and is visible from space, making it the largest living structure on Earth."),
            zh = LocalizedContent("世界上最大的珊瑚礁是什么？", listOf("大堡礁", "伯利兹堡礁", "加勒比海礁", "太平洋礁"), "自然", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，从太空中可见，是地球上最大的活体结构。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande del mundo?", listOf("la Gran Barrera de Coral", "el Sistema de Arrecifes de Belice", "el Arrecife del Caribe", "el Arrecife del Pacífico"), "Naturaleza", "La Gran Barrera de Coral, ubicada frente a la costa de Australia, se extiende por más de 2,300 kilómetros y es visible desde el espacio, lo que la convierte en la estructura viva más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10862, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'eau douce du monde?", listOf("le lac Baïkal", "le lac Supérieur", "le lac Victoria", "le lac Tanganyika"), "Nature", "Le lac Supérieur, situé entre les États-Unis et le Canada, est le plus grand lac d'eau douce du monde par sa superficie, avec environ 82 100 km². Il fait partie des Grands Lacs d'Amérique du Nord."),
            en = LocalizedContent("What is the largest freshwater lake in the world?", listOf("Lake Baikal", "Lake Superior", "Lake Victoria", "Lake Tanganyika"), "Nature", "Lake Superior, located between the United States and Canada, is the largest freshwater lake in the world by surface area, with approximately 82,100 km². It is part of the Great Lakes of North America."),
            zh = LocalizedContent("世界上最大的淡水湖是什么？", listOf("贝加尔湖", "苏必利尔湖", "维多利亚湖", "坦噶尼喀湖"), "自然", "苏必利尔湖位于美国和加拿大之间，是世界上面积最大的淡水湖，约82,100平方公里，是北美五大湖之一。"),
            es = LocalizedContent("¿Cuál es el lago de agua dulce más grande del mundo?", listOf("el lago Baikal", "el lago Superior", "el lago Victoria", "el lago Tanganica"), "Naturaleza", "El lago Superior, ubicado entre Estados Unidos y Canadá, es el lago de agua dulce más grande del mundo por superficie, con aproximadamente 82,100 km². Forma parte de los Grandes Lagos de América del Norte.")
        ),
        BilingualQuestion(
            id = 10863, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand marécage du monde?", listOf("le Pantanal", "les Everglades", "le Haut-Paraná", "le delta du Mékong"), "Nature", "Le Pantanal, situé principalement au Brésil, s'étend sur environ 150 000 km², ce qui en fait la plus vaste zone humide de la planète."),
            en = LocalizedContent("What is the largest swamp in the world?", listOf("the Pantanal", "the Everglades", "the Upper Paraná", "the Mekong Delta"), "Nature", "The Pantanal, located mainly in Brazil, covers about 150,000 km², making it the largest wetland on the planet."),
            zh = LocalizedContent("世界上最大的沼泽是什么？", listOf("潘塔纳尔湿地", "大沼泽地", "上巴拉那河", "湄公河三角洲"), "自然", "潘塔纳尔湿地主要位于巴西，面积约15万平方公里，是地球上最大的湿地。"),
            es = LocalizedContent("¿Cuál es el pantano más grande del mundo?", listOf("el Pantanal", "los Everglades", "el Alto Paraná", "el delta del Mekong"), "Naturaleza", "El Pantanal, ubicado principalmente en Brasil, cubre aproximadamente 150,000 km², lo que lo convierte en el humedal más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10864, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta fluvial du monde?", listOf("le delta du Mékong", "le delta de l'Amazone", "le delta du Mississipi", "le delta du Nil"), "Nature", "Le delta du Mékong, au Vietnam, est le plus grand delta fluvial du monde en termes de superficie, avec environ 40 000 km². Il est formé par les sédiments du fleuve Mékong, qui traverse six pays avant de se jeter dans la mer de Chine méridionale."),
            en = LocalizedContent("What is the largest river delta in the world?", listOf("the Mekong Delta", "the Amazon Delta", "the Mississippi Delta", "the Nile Delta"), "Nature", "The Mekong Delta in Vietnam is the largest river delta in the world by area, covering about 40,000 km². It is formed by sediments from the Mekong River, which flows through six countries before emptying into the South China Sea."),
            zh = LocalizedContent("世界上最大的河流三角洲是什么？", listOf("湄公河三角洲", "亚马逊河三角洲", "密西西比河三角洲", "尼罗河三角洲"), "自然", "越南的湄公河三角洲是世界上面积最大的河流三角洲，约4万平方公里，由流经六国后注入南海的湄公河泥沙形成。"),
            es = LocalizedContent("¿Cuál es el delta fluvial más grande del mundo?", listOf("el delta del Mekong", "el delta del Amazonas", "el delta del Misisipi", "el delta del Nilo"), "Naturaleza", "El delta del Mekong en Vietnam es el delta fluvial más grande del mundo por superficie, con aproximadamente 40,000 km². Está formado por los sedimentos del río Mekong, que atraviesa seis países antes de desembocar en el mar de China Meridional.")
        ),
        BilingualQuestion(
            id = 10865, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand estuaire du monde?", listOf("l'estuaire de la Gironde", "l'estuaire du Gange", "l'estuaire de l'Amazone", "l'estuaire du Mississipi"), "Nature", "L'estuaire de l'Amazone s'étend sur plus de 330 kilomètres de largeur à son embouchure, drainant le plus grand débit d'eau au monde."),
            en = LocalizedContent("What is the largest estuary in the world?", listOf("the Gironde Estuary", "the Ganges Estuary", "the Amazon Estuary", "the Mississippi Estuary"), "Nature", "The Amazon Estuary spans over 330 kilometers in width at its mouth, draining the largest water flow in the world."),
            zh = LocalizedContent("世界上最大的河口湾是什么？", listOf("吉伦特河口", "恒河河口", "亚马逊河河口", "密西西比河河口"), "自然", "亚马逊河河口宽度超过330公里，排水量居世界第一。"),
            es = LocalizedContent("¿Cuál es el estuario más grande del mundo?", listOf("el estuario de la Gironda", "el estuario del Ganges", "el estuario del Amazonas", "el estuario del Misisipi"), "Naturaleza", "El estuario del Amazonas se extiende por más de 330 kilómetros de ancho en su desembocadura, drenando el mayor caudal de agua del mundo.")
        ),
        BilingualQuestion(
            id = 10866, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand système de cavernes du monde?", listOf("Mammoth Cave", "Carlsbad Caverns", "Son Doong", "Batu Caves"), "Nature", "Mammoth Cave, située dans le Kentucky, aux États-Unis, est le plus long réseau de grottes connu au monde, avec plus de 650 kilomètres de passages cartographiés."),
            en = LocalizedContent("What is the largest cave system in the world?", listOf("Mammoth Cave", "Carlsbad Caverns", "Son Doong", "Batu Caves"), "Nature", "Mammoth Cave, located in Kentucky, USA, is the longest known cave system in the world, with over 650 kilometers of mapped passages."),
            zh = LocalizedContent("世界上最大的洞穴系统是什么？", listOf("猛犸洞", "卡尔斯巴德洞窟", "韩松洞", "黑风洞"), "自然", "猛犸洞位于美国肯塔基州，是世界上最长的已知洞穴系统，已测绘通道超过650公里。"),
            es = LocalizedContent("¿Cuál es el sistema de cuevas más grande del mundo?", listOf("Mammoth Cave", "Cavernas de Carlsbad", "Son Doong", "Cuevas de Batu"), "Naturaleza", "Mammoth Cave, ubicada en Kentucky, EE. UU., es el sistema de cuevas más largo conocido del mundo, con más de 650 kilómetros de pasajes cartografiados.")
        ),
        BilingualQuestion(
            id = 10867, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand canyon du monde?", listOf("le Grand Canyon", "le canyon de Zhangjiajie", "le canyon du Vézère", "le canyon du Copperbelt"), "Nature", "Le Grand Canyon, situé dans l'Arizona aux États-Unis, est souvent considéré comme le plus grand canyon du monde en raison de sa taille impressionnante, de sa profondeur et de sa longueur, bien que d'autres canyons comme le Yarlung Tsangpo soient plus profonds."),
            en = LocalizedContent("What is the largest canyon in the world?", listOf("the Grand Canyon", "the Zhangjiajie Canyon", "the Vézère Canyon", "the Copperbelt Canyon"), "Nature", "The Grand Canyon, located in Arizona, USA, is often considered the largest canyon in the world due to its impressive size, depth, and length, although other canyons like Yarlung Tsangpo are deeper."),
            zh = LocalizedContent("世界上最大的峡谷是什么？", listOf("大峡谷", "张家界峡谷", "韦泽尔峡谷", "铜带峡谷"), "自然", "美国亚利桑那州的大峡谷因其惊人的规模、深度和长度常被认为是世界上最大的峡谷，尽管雅鲁藏布大峡谷等更深。"),
            es = LocalizedContent("¿Cuál es el cañón más grande del mundo?", listOf("el Gran Cañón", "el cañón de Zhangjiajie", "el cañón del Vézère", "el cañón del Copperbelt"), "Naturaleza", "El Gran Cañón, ubicado en Arizona, EE. UU., a menudo se considera el cañón más grande del mundo por su impresionante tamaño, profundidad y longitud, aunque otros cañones como el Yarlung Tsangpo son más profundos.")
        ),
        BilingualQuestion(
            id = 10868, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand gouffre du monde?", listOf("le gouffre Berger", "la grotte de Son Doong", "le gouffre Jean-Bernard", "le gouffre de Krubera"), "Nature", "Le gouffre de Krubera, en Géorgie, est le plus profond du monde avec 2 197 mètres de profondeur explorée, surpassant tous les autres gouffres connus."),
            en = LocalizedContent("What is the deepest sinkhole in the world?", listOf("Berger Sinkhole", "Son Doong Cave", "Jean-Bernard Sinkhole", "Krubera Sinkhole"), "Nature", "The Krubera Sinkhole in Georgia is the deepest in the world, with an explored depth of 2,197 meters, surpassing all other known sinkholes."),
            zh = LocalizedContent("世界上最深的落水洞是什么？", listOf("贝尔热落水洞", "韩松洞", "让-贝尔纳落水洞", "克鲁伯拉落水洞"), "自然", "格鲁吉亚的克鲁伯拉落水洞是世界上最深的，已探明深度达2197米，超过所有其他已知落水洞。"),
            es = LocalizedContent("¿Cuál es el sumidero más profundo del mundo?", listOf("el sumidero Berger", "la cueva Son Doong", "el sumidero Jean-Bernard", "el sumidero de Krubera"), "Naturaleza", "El sumidero de Krubera en Georgia es el más profundo del mundo, con una profundidad explorada de 2,197 metros, superando a todos los demás sumideros conocidos.")
        ),
        BilingualQuestion(
            id = 10869, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand erg du monde?", listOf("l'Arabie", "la Grande Erg Orientale", "le Rub' al Khali", "le Nefud"), "Nature", "Le Rub' al Khali, ou \"Quart Vide\", est le plus grand désert de sable continu au monde, s'étendant sur environ 650 000 km² dans la péninsule arabique."),
            en = LocalizedContent("What is the largest erg in the world?", listOf("the Arabian", "the Great Eastern Erg", "the Rub' al Khali", "the Nefud"), "Nature", "The Rub' al Khali, or 'Empty Quarter', is the largest continuous sand desert in the world, covering about 650,000 km² in the Arabian Peninsula."),
            zh = LocalizedContent("世界上最大的沙海是什么？", listOf("阿拉伯沙漠", "大东沙漠", "鲁卜哈利沙漠", "内夫得沙漠"), "自然", "鲁卜哈利沙漠，又称“空白之地”，是世界上最大的连续沙质沙漠，覆盖阿拉伯半岛约65万平方公里。"),
            es = LocalizedContent("¿Cuál es el erg más grande del mundo?", listOf("el desierto de Arabia", "el Gran Erg Oriental", "el Rub' al Khali", "el Nefud"), "Naturaleza", "El Rub' al Khali, o 'Cuarto Vacío', es el desierto de arena continuo más grande del mundo, cubriendo aproximadamente 650,000 km² en la península arábiga.")
        ),
        BilingualQuestion(
            id = 10870, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand piedmont du monde?", listOf("les piémonts du Caucase", "les piémonts de l'Himalaya", "les piémonts des Andes", "les piémonts de l'Atlas"), "Nature", "Le piémont himalayen, s'étendant sur plus de 2 400 km, est le plus vaste au monde en raison de la collision entre les plaques indienne et eurasienne."),
            en = LocalizedContent("What is the largest piedmont in the world?", listOf("the Caucasus piedmonts", "the Himalayan piedmonts", "the Andes piedmonts", "the Atlas piedmonts"), "Nature", "The Himalayan piedmont, stretching over 2,400 km, is the largest in the world due to the collision between the Indian and Eurasian plates."),
            zh = LocalizedContent("世界上最大的山麓是什么？", listOf("高加索山麓", "喜马拉雅山麓", "安第斯山麓", "阿特拉斯山麓"), "自然", "喜马拉雅山麓延伸超过2400公里，由于印度板块和欧亚板块的碰撞，成为世界上最大的山麓。"),
            es = LocalizedContent("¿Cuál es el mayor piedemonte del mundo?", listOf("los piedemontes del Cáucaso", "los piedemontes del Himalaya", "los piedemontes de los Andes", "los piedemontes del Atlas"), "Naturaleza", "El piedemonte del Himalaya, que se extiende por más de 2.400 km, es el más grande del mundo debido a la colisión entre las placas india y euroasiática.")
        ),
        BilingualQuestion(
            id = 10871, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand plateau du monde?", listOf("le plateau du Tibet", "le plateau de Colombie", "le plateau des Grands Lacs", "le plateau du Deccan"), "Nature", "Le plateau du Tibet, aussi appelé toit du monde, est le plus vaste et le plus haut plateau de la planète, avec une altitude moyenne de 4 500 mètres."),
            en = LocalizedContent("What is the largest plateau in the world?", listOf("the Tibetan Plateau", "the Columbia Plateau", "the Great Lakes Plateau", "the Deccan Plateau"), "Nature", "The Tibetan Plateau, also called the Roof of the World, is the largest and highest plateau on Earth, with an average altitude of 4,500 meters."),
            zh = LocalizedContent("世界上最大的高原是什么？", listOf("青藏高原", "哥伦比亚高原", "大湖高原", "德干高原"), "自然", "青藏高原，也被称为世界屋脊，是地球上最大和最高的高原，平均海拔4500米。"),
            es = LocalizedContent("¿Cuál es la meseta más grande del mundo?", listOf("la meseta del Tíbet", "la meseta de Columbia", "la meseta de los Grandes Lagos", "la meseta del Decán"), "Naturaleza", "La meseta del Tíbet, también llamada el Techo del Mundo, es la meseta más grande y alta de la Tierra, con una altitud media de 4.500 metros.")
        ),
        BilingualQuestion(
            id = 10872, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand bassin intérieur du monde?", listOf("le bassin du Tarim", "le bassin de Kalahari", "le bassin de Gobi", "le bassin de l'Amazone"), "Nature", "Le bassin du Tarim, situé dans la région autonome ouïghoure du Xinjiang en Chine, est le plus grand bassin endoréique du monde, car il n'a aucun écoulement vers l'océan."),
            en = LocalizedContent("What is the largest endorheic basin in the world?", listOf("the Tarim Basin", "the Kalahari Basin", "the Gobi Basin", "the Amazon Basin"), "Nature", "The Tarim Basin, located in the Xinjiang Uyghur Autonomous Region of China, is the largest endorheic basin in the world because it has no outflow to the ocean."),
            zh = LocalizedContent("世界上最大的内流盆地是什么？", listOf("塔里木盆地", "卡拉哈里盆地", "戈壁盆地", "亚马逊盆地"), "自然", "塔里木盆地，位于中国新疆维吾尔自治区，是世界上最大的内流盆地，因为它没有流向海洋的出口。"),
            es = LocalizedContent("¿Cuál es la mayor cuenca endorreica del mundo?", listOf("la cuenca del Tarim", "la cuenca del Kalahari", "la cuenca del Gobi", "la cuenca del Amazonas"), "Naturaleza", "La cuenca del Tarim, ubicada en la Región Autónoma Uigur de Xinjiang en China, es la mayor cuenca endorreica del mundo porque no tiene salida al océano.")
        ),
        BilingualQuestion(
            id = 10873, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta intérieur du monde?", listOf("le Deltaïque du Niger", "le delta intérieur du Niger", "le delta du Zaire", "le delta du Mékong"), "Nature", "Le delta intérieur du Niger, situé au Mali, est le plus grand delta intérieur du monde car il se forme à l'intérieur des terres, loin de la mer, par l'étalement du fleuve Niger dans une vaste plaine inondable."),
            en = LocalizedContent("What is the largest inland delta in the world?", listOf("the Niger Delta", "the Inner Niger Delta", "the Congo Delta", "the Mekong Delta"), "Nature", "The Inner Niger Delta, located in Mali, is the largest inland delta in the world because it forms inland, far from the sea, by the spreading of the Niger River over a vast floodplain."),
            zh = LocalizedContent("世界上最大的内陆三角洲是什么？", listOf("尼日尔三角洲", "尼日尔河内陆三角洲", "刚果三角洲", "湄公河三角洲"), "自然", "尼日尔河内陆三角洲，位于马里，是世界上最大的内陆三角洲，因为它形成于内陆，远离海洋，由尼日尔河在广阔的洪泛平原上扩散而成。"),
            es = LocalizedContent("¿Cuál es el mayor delta interior del mundo?", listOf("el delta del Níger", "el delta interior del Níger", "el delta del Congo", "el delta del Mekong"), "Naturaleza", "El delta interior del Níger, ubicado en Malí, es el mayor delta interior del mundo porque se forma tierra adentro, lejos del mar, por la expansión del río Níger sobre una vasta llanura aluvial.")
        ),
        BilingualQuestion(
            id = 10874, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand archipel du monde?", listOf("l'Indonésie", "les Philippines", "le Japon", "l'Islande"), "Nature", "L'Indonésie est le plus grand archipel du monde avec plus de 17 000 îles, s'étendant sur l'océan Indien et Pacifique."),
            en = LocalizedContent("What is the largest archipelago in the world?", listOf("Indonesia", "the Philippines", "Japan", "Iceland"), "Nature", "Indonesia is the largest archipelago in the world with over 17,000 islands, spanning the Indian and Pacific Oceans."),
            zh = LocalizedContent("世界上最大的群岛是什么？", listOf("印度尼西亚", "菲律宾", "日本", "冰岛"), "自然", "印度尼西亚是世界上最大的群岛，拥有超过17000个岛屿，横跨印度洋和太平洋。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del mundo?", listOf("Indonesia", "Filipinas", "Japón", "Islandia"), "Naturaleza", "Indonesia es el archipiélago más grande del mundo con más de 17.000 islas, que se extienden por los océanos Índico y Pacífico.")
        ),
        BilingualQuestion(
            id = 10875, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac de montagne du monde?", listOf("le lac Titicaca", "le lac Issyk-Kol", "le lac Altai", "le lac Khosvogol"), "Nature", "Le lac Titicaca, situé à 3 812 mètres d'altitude entre le Pérou et la Bolivie, est le plus haut lac navigable du monde et le plus grand lac de montagne par sa superficie."),
            en = LocalizedContent("What is the largest mountain lake in the world?", listOf("Lake Titicaca", "Lake Issyk-Kul", "Lake Altai", "Lake Khövsgöl"), "Nature", "Lake Titicaca, located at 3,812 meters above sea level between Peru and Bolivia, is the highest navigable lake in the world and the largest mountain lake by area."),
            zh = LocalizedContent("世界上最大的高山湖泊是什么？", listOf("的的喀喀湖", "伊塞克湖", "阿尔泰湖", "库苏古尔湖"), "自然", "的的喀喀湖位于秘鲁和玻利维亚之间，海拔3812米，是世界上最高的可通航湖泊，也是面积最大的高山湖泊。"),
            es = LocalizedContent("¿Cuál es el lago de montaña más grande del mundo?", listOf("el lago Titicaca", "el lago Issyk-Kul", "el lago Altai", "el lago Khövsgöl"), "Naturaleza", "El lago Titicaca, ubicado a 3.812 metros sobre el nivel del mar entre Perú y Bolivia, es el lago navegable más alto del mundo y el lago de montaña más grande por superficie.")
        ),
        BilingualQuestion(
            id = 10876, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac glaciaire du monde?", listOf("le lac Supérieur", "le lac Baïkal", "le lac Tanganyika", "le lac Victoria"), "Nature", "Le lac Supérieur est le plus grand lac d'eau douce du monde par sa superficie, et il s'est formé par l'érosion glaciaire lors de la dernière période glaciaire."),
            en = LocalizedContent("What is the largest glacial lake in the world?", listOf("Lake Superior", "Lake Baikal", "Lake Tanganyika", "Lake Victoria"), "Nature", "Lake Superior is the largest freshwater lake in the world by surface area, and it was formed by glacial erosion during the last ice age."),
            zh = LocalizedContent("世界上最大的冰川湖是什么？", listOf("苏必利尔湖", "贝加尔湖", "坦噶尼喀湖", "维多利亚湖"), "自然", "苏必利尔湖是世界上面积最大的淡水湖，它是在最后一个冰河时期由冰川侵蚀形成的。"),
            es = LocalizedContent("¿Cuál es el lago glaciar más grande del mundo?", listOf("el lago Superior", "el lago Baikal", "el lago Tanganyika", "el lago Victoria"), "Naturaleza", "El lago Superior es el lago de agua dulce más grande del mundo por superficie, y se formó por la erosión glaciar durante la última edad de hielo.")
        ),
        BilingualQuestion(
            id = 10877, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac salé du monde?", listOf("la mer Caspienne", "la Mer Morte", "la mer d'Aral", "la Mer Noire"), "Nature", "La mer Caspienne, bien que nommée mer, est un lac salé endoréique situé entre l'Europe et l'Asie, ce qui en fait le plus grand lac salé du monde par sa superficie."),
            en = LocalizedContent("What is the largest salt lake in the world?", listOf("the Caspian Sea", "the Dead Sea", "the Aral Sea", "the Black Sea"), "Nature", "The Caspian Sea, although called a sea, is an endorheic salt lake located between Europe and Asia, making it the largest salt lake in the world by surface area."),
            zh = LocalizedContent("世界上最大的咸水湖是什么？", listOf("里海", "死海", "咸海", "黑海"), "自然", "里海虽然被称为海，但实际上是一个位于欧洲和亚洲之间的内流咸水湖，按面积计算是世界上最大的咸水湖。"),
            es = LocalizedContent("¿Cuál es el lago salado más grande del mundo?", listOf("el mar Caspio", "el mar Muerto", "el mar de Aral", "el mar Negro"), "Naturaleza", "El mar Caspio, aunque llamado mar, es un lago salado endorreico situado entre Europa y Asia, lo que lo convierte en el lago salado más grande del mundo por superficie.")
        ),
        BilingualQuestion(
            id = 10878, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand bassin océanique du monde?", listOf("le bassin du Pacifique", "le bassin Atlantique", "le bassin Indien", "le bassin Arctique"), "Nature", "Le bassin du Pacifique est le plus grand bassin océanique car l'océan Pacifique couvre environ un tiers de la surface terrestre, avec une superficie de 165 millions de km²."),
            en = LocalizedContent("What is the largest ocean basin in the world?", listOf("the Pacific Basin", "the Atlantic Basin", "the Indian Basin", "the Arctic Basin"), "Nature", "The Pacific Basin is the largest ocean basin because the Pacific Ocean covers about one-third of the Earth's surface, with an area of 165 million km²."),
            zh = LocalizedContent("世界上最大的海洋盆地是什么？", listOf("太平洋盆地", "大西洋盆地", "印度洋盆地", "北冰洋盆地"), "自然", "太平洋盆地是最大的海洋盆地，因为太平洋覆盖了地球表面约三分之一，面积达1.65亿平方公里。"),
            es = LocalizedContent("¿Cuál es la cuenca oceánica más grande del mundo?", listOf("la cuenca del Pacífico", "la cuenca del Atlántico", "la cuenca del Índico", "la cuenca del Ártico"), "Naturaleza", "La cuenca del Pacífico es la cuenca oceánica más grande porque el océano Pacífico cubre aproximadamente un tercio de la superficie terrestre, con un área de 165 millones de km².")
        ),
        BilingualQuestion(
            id = 10879, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand plateau océanique du monde?", listOf("le plateau des Mascareignes", "le plateau du Chagos", "le plateau de Cocos", "le plateau du Sargasso"), "Nature", "Le plateau des Mascareignes, situé dans l'océan Indien, s'étend sur environ 2 000 km de long et 700 km de large, ce qui en fait le plus vaste plateau océanique du monde."),
            en = LocalizedContent("What is the largest oceanic plateau in the world?", listOf("the Mascarene Plateau", "the Chagos Plateau", "the Cocos Plateau", "the Sargasso Plateau"), "Nature", "The Mascarene Plateau, located in the Indian Ocean, extends about 2,000 km in length and 700 km in width, making it the largest oceanic plateau in the world."),
            zh = LocalizedContent("世界上最大的洋底高原是什么？", listOf("马斯克林高原", "查戈斯高原", "科科斯高原", "马尾藻高原"), "自然", "马斯克林高原位于印度洋，长约2000公里，宽约700公里，是世界上最大的洋底高原。"),
            es = LocalizedContent("¿Cuál es la meseta oceánica más grande del mundo?", listOf("la meseta de las Mascareñas", "la meseta de Chagos", "la meseta de Cocos", "la meseta del Sargazo"), "Naturaleza", "La meseta de las Mascareñas, ubicada en el océano Índico, se extiende unos 2.000 km de largo y 700 km de ancho, lo que la convierte en la meseta oceánica más grande del mundo.")
        ),
        BilingualQuestion(
            id = 10880, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand seamount du monde?", listOf("le Lomonosov", "le Tamu", "le Hess", "le Shatsky"), "Nature", "Le Lomonosov est une chaîne de montagnes sous-marines située dans l'océan Arctique, s'étendant sur environ 1 800 km de long."),
            en = LocalizedContent("What is the largest seamount in the world?", listOf("Lomonosov", "Tamu", "Hess", "Shatsky"), "Nature", "The Lomonosov Ridge is an underwater mountain chain in the Arctic Ocean, stretching about 1,800 km in length."),
            zh = LocalizedContent("世界上最大的海山是什么？", listOf("罗蒙诺索夫海岭", "塔穆海山", "赫斯海山", "沙茨基海山"), "自然", "罗蒙诺索夫海岭是北冰洋中的一条水下山脉，长约1800公里。"),
            es = LocalizedContent("¿Cuál es el monte submarino más grande del mundo?", listOf("Lomonósov", "Tamu", "Hess", "Shatsky"), "Naturaleza", "La cordillera Lomonósov es una cadena montañosa submarina en el océano Ártico, que se extiende unos 1.800 km de largo.")
        ),
        BilingualQuestion(
            id = 10881, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand talus continental du monde?", listOf("le talus de Californie", "le talus du Bengale", "le talus de Nazca", "le talus de Challenger"), "Nature", "Le talus du Bengale, au large du Bangladesh, est le plus grand du monde en raison des énormes apports sédimentaires du Gange et du Brahmapoutre."),
            en = LocalizedContent("What is the largest continental slope in the world?", listOf("California slope", "Bengal slope", "Nazca slope", "Challenger slope"), "Nature", "The Bengal slope, off the coast of Bangladesh, is the largest in the world due to the enormous sediment inputs from the Ganges and Brahmaputra rivers."),
            zh = LocalizedContent("世界上最大的大陆坡是什么？", listOf("加利福尼亚大陆坡", "孟加拉大陆坡", "纳斯卡大陆坡", "挑战者大陆坡"), "自然", "孟加拉大陆坡位于孟加拉国海岸外，由于恒河和布拉马普特拉河的巨大沉积物输入，成为世界上最大的大陆坡。"),
            es = LocalizedContent("¿Cuál es el talud continental más grande del mundo?", listOf("talud de California", "talud de Bengala", "talud de Nazca", "talud de Challenger"), "Naturaleza", "El talud de Bengala, frente a la costa de Bangladés, es el más grande del mundo debido a los enormes aportes sedimentarios del Ganges y el Brahmaputra.")
        ),
        BilingualQuestion(
            id = 10882, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand trench du monde?", listOf("la fosse des Mariannes", "la fosse de Tonga", "la fosse de Kuril", "la fosse Mindanao"), "Nature", "La fosse des Mariannes, située dans l'océan Pacifique, atteint une profondeur maximale d'environ 11 034 mètres dans le Challenger Deep, ce qui en fait le point le plus profond connu de la croûte terrestre."),
            en = LocalizedContent("What is the largest trench in the world?", listOf("Mariana Trench", "Tonga Trench", "Kuril Trench", "Mindanao Trench"), "Nature", "The Mariana Trench, located in the Pacific Ocean, reaches a maximum depth of about 11,034 meters in the Challenger Deep, making it the deepest known point of the Earth's crust."),
            zh = LocalizedContent("世界上最大的海沟是什么？", listOf("马里亚纳海沟", "汤加海沟", "千岛海沟", "棉兰老海沟"), "自然", "马里亚纳海沟位于太平洋，其挑战者深渊最大深度约11034米，是已知地壳最深的点。"),
            es = LocalizedContent("¿Cuál es la fosa más grande del mundo?", listOf("Fosa de las Marianas", "Fosa de Tonga", "Fosa de Kuriles", "Fosa de Mindanao"), "Naturaleza", "La fosa de las Marianas, en el océano Pacífico, alcanza una profundidad máxima de unos 11.034 metros en el Abismo Challenger, lo que la convierte en el punto más profundo conocido de la corteza terrestre.")
        ),
        BilingualQuestion(
            id = 10883, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand canyon sous-marin du monde?", listOf("le canyon du Bengale", "le canyon de Monterey", "le canyon du Congo", "le canyon du Zaire"), "Nature", "Le canyon de Monterey, situé au large de la Californie, est le plus grand canyon sous-marin connu, avec une profondeur atteignant environ 3 600 mètres et une longueur de plus de 470 kilomètres."),
            en = LocalizedContent("What is the largest submarine canyon in the world?", listOf("Bengal Canyon", "Monterey Canyon", "Congo Canyon", "Zaire Canyon"), "Nature", "Monterey Canyon, off the coast of California, is the largest known submarine canyon, with a depth reaching about 3,600 meters and a length of over 470 kilometers."),
            zh = LocalizedContent("世界上最大的海底峡谷是什么？", listOf("孟加拉峡谷", "蒙特雷峡谷", "刚果峡谷", "扎伊尔峡谷"), "自然", "蒙特雷峡谷位于加利福尼亚海岸外，是已知最大的海底峡谷，深度约3600米，长度超过470公里。"),
            es = LocalizedContent("¿Cuál es el cañón submarino más grande del mundo?", listOf("Cañón de Bengala", "Cañón de Monterey", "Cañón del Congo", "Cañón del Zaire"), "Naturaleza", "El cañón de Monterey, frente a la costa de California, es el cañón submarino más grande conocido, con una profundidad de unos 3.600 metros y una longitud de más de 470 kilómetros.")
        ),
        BilingualQuestion(
            id = 10884, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand ridge du monde?", listOf("la dorsale médio-océanique", "la chaîne des Mariannes", "la chaîne du Pacifique", "la chaîne de l'Atlantique"), "Nature", "La dorsale médio-océanique est une chaîne de montagnes sous-marine qui s'étend sur environ 65 000 kilomètres à travers tous les océans, ce qui en fait la plus grande structure géologique de la planète."),
            en = LocalizedContent("What is the largest ridge in the world?", listOf("Mid-Ocean Ridge", "Mariana Ridge", "Pacific Ridge", "Atlantic Ridge"), "Nature", "The Mid-Ocean Ridge is an underwater mountain chain that extends about 65,000 kilometers across all oceans, making it the largest geological structure on the planet."),
            zh = LocalizedContent("世界上最大的海岭是什么？", listOf("大洋中脊", "马里亚纳海岭", "太平洋海岭", "大西洋海岭"), "自然", "大洋中脊是一条水下山脉，延伸约65000公里，横跨所有海洋，是地球上最大的地质结构。"),
            es = LocalizedContent("¿Cuál es la dorsal más grande del mundo?", listOf("Dorsal mesoceánica", "Dorsal de las Marianas", "Dorsal del Pacífico", "Dorsal del Atlántico"), "Naturaleza", "La dorsal mesoceánica es una cadena montañosa submarina que se extiende unos 65.000 kilómetros a través de todos los océanos, lo que la convierte en la estructura geológica más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10885, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand hotspot du monde?", listOf("Hawaï", "l'Islande", "Yellowstone", "les Galápagos"), "Nature", "L'Islande est le plus grand hotspot terrestre, situé sur la dorsale médio-atlantique, où l'activité volcanique intense est due à un panache mantellique."),
            en = LocalizedContent("What is the largest hotspot in the world?", listOf("Hawaii", "Iceland", "Yellowstone", "Galápagos"), "Nature", "Iceland is the largest terrestrial hotspot, located on the Mid-Atlantic Ridge, where intense volcanic activity is due to a mantle plume."),
            zh = LocalizedContent("世界上最大的热点是什么？", listOf("夏威夷", "冰岛", "黄石", "加拉帕戈斯"), "自然", "冰岛是最大的陆地热点，位于大西洋中脊，强烈的火山活动源于地幔柱。"),
            es = LocalizedContent("¿Cuál es el punto caliente más grande del mundo?", listOf("Hawái", "Islandia", "Yellowstone", "Galápagos"), "Naturaleza", "Islandia es el punto caliente terrestre más grande, ubicado en la dorsal mesoatlántica, donde la intensa actividad volcánica se debe a una pluma del manto.")
        ),
        BilingualQuestion(
            id = 10886, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand point chaud du monde?", listOf("Hawaï", "l'Islande", "Yellowstone", "les Galápagos"), "Nature", "Le point chaud d'Hawaï est considéré comme le plus grand du monde en volume de magma produit, ayant formé l'archipel hawaïen sur des millions d'années."),
            en = LocalizedContent("What is the largest hot spot in the world?", listOf("Hawaii", "Iceland", "Yellowstone", "Galápagos"), "Nature", "The Hawaii hotspot is considered the largest in the world by volume of magma produced, having formed the Hawaiian archipelago over millions of years."),
            zh = LocalizedContent("世界上最大的热点是什么？", listOf("夏威夷", "冰岛", "黄石", "加拉帕戈斯"), "自然", "夏威夷热点被认为是世界上最大的热点，以产生的岩浆体积计，它在数百万年间形成了夏威夷群岛。"),
            es = LocalizedContent("¿Cuál es el punto caliente más grande del mundo?", listOf("Hawái", "Islandia", "Yellowstone", "Galápagos"), "Naturaleza", "El punto caliente de Hawái se considera el más grande del mundo en volumen de magma producido, habiendo formado el archipiélago hawaiano durante millones de años.")
        ),
        BilingualQuestion(
            id = 10887, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand système de failles du monde?", listOf("la faille de San Andrés", "la faille du Rift", "la faille d'Anatolie", "la faille d'Alpine"), "Nature", "Le système de failles du Rift est-africain s'étend sur plus de 6 000 kilomètres, de la mer Rouge au Mozambique, ce qui en fait le plus grand réseau de failles actives de la planète."),
            en = LocalizedContent("What is the largest fault system in the world?", listOf("San Andreas Fault", "Rift Fault", "Anatolian Fault", "Alpine Fault"), "Nature", "The East African Rift system extends over 6,000 kilometers, from the Red Sea to Mozambique, making it the largest network of active faults on the planet."),
            zh = LocalizedContent("世界上最大的断层系统是什么？", listOf("圣安德烈亚斯断层", "裂谷断层", "安纳托利亚断层", "阿尔卑斯断层"), "自然", "东非裂谷系统延伸超过6000公里，从红海到莫桑比克，是地球上最大的活动断层网络。"),
            es = LocalizedContent("¿Cuál es el sistema de fallas más grande del mundo?", listOf("Falla de San Andrés", "Falla del Rift", "Falla de Anatolia", "Falla Alpina"), "Naturaleza", "El sistema de fallas del Rift de África Oriental se extiende más de 6.000 kilómetros, desde el mar Rojo hasta Mozambique, lo que lo convierte en la mayor red de fallas activas del planeta.")
        ),
        BilingualQuestion(
            id = 10888, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand rift du monde?", listOf("le Rift Est-Africain", "le Rift du Rhin", "le Rift du Baïkal", "le Rift de la Mer Morte"), "Nature", "Le Rift Est-Africain s'étend sur plus de 6 000 kilomètres, de la mer Rouge au Mozambique, résultant de la séparation des plaques tectoniques somalienne et nubienne."),
            en = LocalizedContent("What is the largest rift in the world?", listOf("East African Rift", "Rhine Rift", "Baikal Rift", "Dead Sea Rift"), "Nature", "The East African Rift extends over 6,000 kilometers, from the Red Sea to Mozambique, resulting from the separation of the Somali and Nubian tectonic plates."),
            zh = LocalizedContent("世界上最大的裂谷是什么？", listOf("东非大裂谷", "莱茵裂谷", "贝加尔裂谷", "死海裂谷"), "自然", "东非大裂谷延伸超过6000公里，从红海到莫桑比克，是由索马里板块和努比亚板块分离形成的。"),
            es = LocalizedContent("¿Cuál es el rift más grande del mundo?", listOf("Rift de África Oriental", "Rift del Rin", "Rift del Baikal", "Rift del Mar Muerto"), "Naturaleza", "El Rift de África Oriental se extiende más de 6.000 kilómetros, desde el mar Rojo hasta Mozambique, resultante de la separación de las placas tectónicas somalí y nubia.")
        ),
        BilingualQuestion(
            id = 10889, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand graben du monde?", listOf("la Vallée du Jourdain", "la Vallée de la Mort", "la Vallée du Rift", "la Vallée de Baikal"), "Nature", "La Vallée du Rift est un graben, une dépression tectonique allongée, formée par l'écartement des plaques africaine et arabique, ce qui en fait le plus grand du monde."),
            en = LocalizedContent("What is the largest graben in the world?", listOf("Jordan Valley", "Death Valley", "Rift Valley", "Baikal Valley"), "Nature", "The Rift Valley is a graben, an elongated tectonic depression, formed by the divergence of the African and Arabian plates, making it the largest in the world."),
            zh = LocalizedContent("世界上最大的地堑是什么？", listOf("约旦河谷", "死亡谷", "裂谷", "贝加尔谷"), "自然", "裂谷是一个地堑，即拉长的构造凹陷，由非洲板块和阿拉伯板块分离形成，是世界上最大的地堑。"),
            es = LocalizedContent("¿Cuál es el graben más grande del mundo?", listOf("Valle del Jordán", "Valle de la Muerte", "Valle del Rift", "Valle del Baikal"), "Naturaleza", "El Valle del Rift es un graben, una depresión tectónica alargada, formada por la divergencia de las placas africana y arábiga, lo que lo convierte en el más grande del mundo.")
        ),
        BilingualQuestion(
            id = 10890, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand horst du monde?", listOf("le plateau de la Mésopotamie", "le plateau de l'Éthiopie", "le plateau de l'Asie de l'Est", "le plateau du Tibet"), "Nature", "Le plateau de la Mésopotamie est considéré comme le plus grand horst du monde, une structure géologique soulevée entre deux failles."),
            en = LocalizedContent("What is the largest horst in the world?", listOf("the Mesopotamian Plateau", "the Ethiopian Plateau", "the East Asian Plateau", "the Tibetan Plateau"), "Nature", "The Mesopotamian Plateau is considered the largest horst in the world, a geological structure uplifted between two faults."),
            zh = LocalizedContent("世界上最大的地垒是什么？", listOf("美索不达米亚高原", "埃塞俄比亚高原", "东亚高原", "青藏高原"), "自然", "美索不达米亚高原被认为是世界上最大的地垒，这是一种在两个断层之间抬升的地质结构。"),
            es = LocalizedContent("¿Cuál es el mayor horst del mundo?", listOf("la meseta de Mesopotamia", "la meseta de Etiopía", "la meseta de Asia Oriental", "la meseta del Tíbet"), "Naturaleza", "La meseta de Mesopotamia es considerada el mayor horst del mundo, una estructura geológica elevada entre dos fallas.")
        ),
        BilingualQuestion(
            id = 10891, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand bloc de croûte continentale du monde?", listOf("l'Asie", "l'Afrique", "l'Amérique du Nord", "l'Amérique du Sud"), "Nature", "L'Asie est le plus grand continent en superficie, ce qui en fait le plus grand bloc de croûte continentale, suivi par l'Afrique."),
            en = LocalizedContent("What is the largest block of continental crust in the world?", listOf("Asia", "Africa", "North America", "South America"), "Nature", "Asia is the largest continent by area, making it the largest block of continental crust, followed by Africa."),
            zh = LocalizedContent("世界上最大的大陆地壳块体是什么？", listOf("亚洲", "非洲", "北美洲", "南美洲"), "自然", "亚洲是面积最大的大陆，因此是最大的大陆地壳块体，其次是非洲。"),
            es = LocalizedContent("¿Cuál es el mayor bloque de corteza continental del mundo?", listOf("Asia", "África", "América del Norte", "América del Sur"), "Naturaleza", "Asia es el continente más grande por superficie, lo que lo convierte en el mayor bloque de corteza continental, seguido de África.")
        ),
        BilingualQuestion(
            id = 10892, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand bloc de croûte océanique du monde?", listOf("le Pacifique", "l'Atlantique", "l'Indien", "l'Arctique"), "Nature", "La plaque pacifique est la plus grande plaque tectonique océanique, couvrant une vaste zone de la croûte terrestre sous l'océan Pacifique."),
            en = LocalizedContent("What is the largest block of oceanic crust in the world?", listOf("the Pacific", "the Atlantic", "the Indian", "the Arctic"), "Nature", "The Pacific Plate is the largest oceanic tectonic plate, covering a vast area of the Earth's crust beneath the Pacific Ocean."),
            zh = LocalizedContent("世界上最大的大洋地壳块体是什么？", listOf("太平洋", "大西洋", "印度洋", "北冰洋"), "自然", "太平洋板块是最大的大洋构造板块，覆盖了太平洋下地壳的广阔区域。"),
            es = LocalizedContent("¿Cuál es el mayor bloque de corteza oceánica del mundo?", listOf("el Pacífico", "el Atlántico", "el Índico", "el Ártico"), "Naturaleza", "La placa del Pacífico es la placa tectónica oceánica más grande, cubriendo una vasta área de la corteza terrestre bajo el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 10893, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand champ géothermique du monde?", listOf("Yellowstone", "la Vallée de la Mort", "les Geysers", "Beppu"), "Nature", "Les Geysers, situés en Californie, sont le plus grand champ géothermique du monde en termes de production d'électricité, exploitant la chaleur souterraine depuis 1960."),
            en = LocalizedContent("What is the largest geothermal field in the world?", listOf("Yellowstone", "Death Valley", "The Geysers", "Beppu"), "Nature", "The Geysers, located in California, is the largest geothermal field in the world in terms of electricity production, harnessing underground heat since 1960."),
            zh = LocalizedContent("世界上最大的地热田是什么？", listOf("黄石", "死亡谷", "间歇泉", "别府"), "自然", "位于加利福尼亚的间歇泉是世界上最大的地热田，自1960年以来利用地下热能发电。"),
            es = LocalizedContent("¿Cuál es el campo geotérmico más grande del mundo?", listOf("Yellowstone", "Valle de la Muerte", "Los Géiseres", "Beppu"), "Naturaleza", "Los Géiseres, ubicados en California, son el campo geotérmico más grande del mundo en términos de producción de electricidad, aprovechando el calor subterráneo desde 1960.")
        ),
        BilingualQuestion(
            id = 10894, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand champ volcanique du monde?", listOf("le champ volcanique de Yellowstone", "le champ volcanique de la chaîne Juan de Fuca", "le champ volcanique de Taupo", "le champ volcanique de Coeur d'Alene"), "Nature", "Le champ volcanique de Yellowstone, situé dans le parc national américain, est le plus vaste au monde, avec une caldeira de 72 kilomètres de long."),
            en = LocalizedContent("What is the largest volcanic field in the world?", listOf("the Yellowstone volcanic field", "the Juan de Fuca volcanic field", "the Taupo volcanic field", "the Coeur d'Alene volcanic field"), "Nature", "The Yellowstone volcanic field, located in the US national park, is the largest in the world, with a caldera 72 kilometers long."),
            zh = LocalizedContent("世界上最大的火山场是什么？", listOf("黄石火山场", "胡安·德富卡火山场", "陶波火山场", "科达伦火山场"), "自然", "位于美国国家公园的黄石火山场是世界上最大的火山场，其火山口长达72公里。"),
            es = LocalizedContent("¿Cuál es el campo volcánico más grande del mundo?", listOf("el campo volcánico de Yellowstone", "el campo volcánico de Juan de Fuca", "el campo volcánico de Taupo", "el campo volcánico de Coeur d'Alene"), "Naturaleza", "El campo volcánico de Yellowstone, ubicado en el parque nacional estadounidense, es el más grande del mundo, con una caldera de 72 kilómetros de largo.")
        ),
        BilingualQuestion(
            id = 10895, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand volcan du monde par volume?", listOf("le Mauna Loa", "le Mauna Kea", "le Mont-Blanc", "l'Etna"), "Nature", "Le Mauna Loa, à Hawaï, est le volcan le plus volumineux de la Terre avec environ 75 000 km³, dépassant même le Tamu Massif sous-marin."),
            en = LocalizedContent("What is the largest volcano in the world by volume?", listOf("Mauna Loa", "Mauna Kea", "Mont Blanc", "Etna"), "Nature", "Mauna Loa, in Hawaii, is the most voluminous volcano on Earth with about 75,000 km³, even surpassing the submarine Tamu Massif."),
            zh = LocalizedContent("世界上体积最大的火山是什么？", listOf("莫纳罗亚火山", "莫纳克亚火山", "勃朗峰", "埃特纳火山"), "自然", "夏威夷的莫纳罗亚火山是地球上体积最大的火山，约75,000立方公里，甚至超过了海底的塔穆山。"),
            es = LocalizedContent("¿Cuál es el volcán más grande del mundo por volumen?", listOf("Mauna Loa", "Mauna Kea", "Mont Blanc", "Etna"), "Naturaleza", "El Mauna Loa, en Hawái, es el volcán más voluminoso de la Tierra con unos 75.000 km³, superando incluso al Tamu Massif submarino.")
        ),
        BilingualQuestion(
            id = 10896, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand volcan du monde par superficie?", listOf("le Mauna Loa", "le Mauna Kea", "le Mont-Blanc", "l'Etna"), "Nature", "Le Mauna Loa, à Hawaï, couvre environ 5 271 km², ce qui en fait le volcan le plus étendu en superficie sur Terre."),
            en = LocalizedContent("What is the largest volcano in the world by area?", listOf("Mauna Loa", "Mauna Kea", "Mont Blanc", "Etna"), "Nature", "Mauna Loa, in Hawaii, covers about 5,271 km², making it the most extensive volcano by area on Earth."),
            zh = LocalizedContent("世界上面积最大的火山是什么？", listOf("莫纳罗亚火山", "莫纳克亚火山", "勃朗峰", "埃特纳火山"), "自然", "夏威夷的莫纳罗亚火山覆盖约5,271平方公里，是地球上面积最大的火山。"),
            es = LocalizedContent("¿Cuál es el volcán más grande del mundo por superficie?", listOf("Mauna Loa", "Mauna Kea", "Mont Blanc", "Etna"), "Naturaleza", "El Mauna Loa, en Hawái, cubre aproximadamente 5.271 km², lo que lo convierte en el volcán más extenso en superficie de la Tierra.")
        ),
        BilingualQuestion(
            id = 10897, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan actif du monde?", listOf("le Sakurajima", "le Merapi", "l'Etna", "le Yasour"), "Nature", "Le Mauna Loa, à Hawaï, est considéré comme le plus grand volcan actif du monde en volume et en superficie, tandis que le Sakurajima, au Japon, est l'un des plus actifs mais pas le plus grand."),
            en = LocalizedContent("What is the largest active volcano in the world?", listOf("Sakurajima", "Merapi", "Etna", "Yasur"), "Nature", "Mauna Loa, in Hawaii, is considered the largest active volcano in the world by volume and area, while Sakurajima in Japan is one of the most active but not the largest."),
            zh = LocalizedContent("世界上最大的活火山是什么？", listOf("樱岛火山", "默拉皮火山", "埃特纳火山", "亚苏尔火山"), "自然", "夏威夷的莫纳罗亚火山被认为是世界上体积和面积最大的活火山，而日本的樱岛火山是最活跃的之一，但不是最大的。"),
            es = LocalizedContent("¿Cuál es el volcán activo más grande del mundo?", listOf("Sakurajima", "Merapi", "Etna", "Yasur"), "Naturaleza", "El Mauna Loa, en Hawái, es considerado el volcán activo más grande del mundo en volumen y superficie, mientras que el Sakurajima en Japón es uno de los más activos pero no el más grande.")
        ),
        BilingualQuestion(
            id = 10898, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan éteint du monde?", listOf("le Mont-Blanc", "l'Ojos del Salado", "le Chimborazo", "l'Aconcagua"), "Nature", "L'Ojos del Salado, situé à la frontière entre le Chili et l'Argentine, est le plus haut volcan actif du monde avec 6 893 mètres, mais il est considéré comme éteint car aucune éruption n'a été observée à l'époque moderne."),
            en = LocalizedContent("What is the largest extinct volcano in the world?", listOf("Mont Blanc", "Ojos del Salado", "Chimborazo", "Aconcagua"), "Nature", "Ojos del Salado, located on the border between Chile and Argentina, is the highest active volcano in the world at 6,893 meters, but it is considered extinct as no eruption has been observed in modern times."),
            zh = LocalizedContent("世界上最大的死火山是什么？", listOf("勃朗峰", "奥霍斯-德尔萨拉多山", "钦博拉索山", "阿空加瓜山"), "自然", "位于智利和阿根廷边境的奥霍斯-德尔萨拉多山是世界上最高的活火山，海拔6,893米，但被认为已熄灭，因为现代没有观察到喷发。"),
            es = LocalizedContent("¿Cuál es el volcán extinto más grande del mundo?", listOf("Mont Blanc", "Ojos del Salado", "Chimborazo", "Aconcagua"), "Naturaleza", "El Ojos del Salado, ubicado en la frontera entre Chile y Argentina, es el volcán activo más alto del mundo con 6.893 metros, pero se considera extinto ya que no se ha observado ninguna erupción en tiempos modernos.")
        ),
        BilingualQuestion(
            id = 10899, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand caldeira du monde?", listOf("la caldeira de Yellowstone", "la caldeira de Taupo", "la caldeira d'Aira", "la caldeira de Tambora"), "Nature", "La caldeira de Yellowstone, située dans le parc national de Yellowstone aux États-Unis, est la plus grande caldeira active au monde avec environ 70 km de long."),
            en = LocalizedContent("What is the largest caldera in the world?", listOf("Yellowstone Caldera", "Taupo Caldera", "Aira Caldera", "Tambora Caldera"), "Nature", "The Yellowstone Caldera, located in Yellowstone National Park in the United States, is the largest active caldera in the world at about 70 km long."),
            zh = LocalizedContent("世界上最大的火山口是什么？", listOf("黄石火山口", "陶波火山口", "始良火山口", "坦博拉火山口"), "自然", "位于美国黄石国家公园的黄石火山口是世界上最大的活火山口，长约70公里。"),
            es = LocalizedContent("¿Cuál es la caldera más grande del mundo?", listOf("la caldera de Yellowstone", "la caldera de Taupo", "la caldera de Aira", "la caldera de Tambora"), "Naturaleza", "La caldera de Yellowstone, ubicada en el Parque Nacional de Yellowstone en Estados Unidos, es la caldera activa más grande del mundo con unos 70 km de largo.")
        ),
        BilingualQuestion(
            id = 10900, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand geyser du monde?", listOf("Old Faithful", "le Strokkur", "le Pohutu", "le Grand Geyser"), "Nature", "Le geyser Old Faithful, situé dans le parc national de Yellowstone aux États-Unis, est célèbre pour ses éruptions régulières et prévisibles, ce qui en fait le plus connu et le plus grand geyser actif du monde."),
            en = LocalizedContent("What is the largest geyser in the world?", listOf("Old Faithful", "Strokkur", "Pohutu", "Grand Geyser"), "Nature", "Old Faithful, located in Yellowstone National Park in the United States, is famous for its regular and predictable eruptions, making it the most well-known and largest active geyser in the world."),
            zh = LocalizedContent("世界上最大的间歇泉是什么？", listOf("老忠实泉", "斯特罗库尔", "波胡图", "大间歇泉"), "自然", "老忠实泉位于美国黄石国家公园，以其规律且可预测的喷发而闻名，是世界上最著名且最大的活跃间歇泉。"),
            es = LocalizedContent("¿Cuál es el géiser más grande del mundo?", listOf("Old Faithful", "Strokkur", "Pohutu", "Gran Géiser"), "Naturaleza", "Old Faithful, ubicado en el Parque Nacional de Yellowstone en Estados Unidos, es famoso por sus erupciones regulares y predecibles, lo que lo convierte en el géiser activo más grande y conocido del mundo.")
        ),
        BilingualQuestion(
            id = 10901, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac de cratère du monde?", listOf("le lac Crater Lake", "le lac Baïkal", "le lac Tanganyika", "le lac Victoria"), "Nature", "Crater Lake, dans l'Oregon, s'est formé dans la caldeira du Mont Mazama après son effondrement volcanique il y a environ 7 700 ans, ce qui en fait le plus grand lac de cratère du monde."),
            en = LocalizedContent("What is the largest crater lake in the world?", listOf("Crater Lake", "Lake Baikal", "Lake Tanganyika", "Lake Victoria"), "Nature", "Crater Lake in Oregon formed in the caldera of Mount Mazama after its volcanic collapse about 7,700 years ago, making it the largest crater lake in the world."),
            zh = LocalizedContent("世界上最大的火山口湖是什么？", listOf("火山口湖", "贝加尔湖", "坦噶尼喀湖", "维多利亚湖"), "自然", "俄勒冈州的火山口湖形成于马扎马火山约7700年前火山崩塌后的火山口，是世界上最大的火山口湖。"),
            es = LocalizedContent("¿Cuál es el lago de cráter más grande del mundo?", listOf("Lago Cráter", "Lago Baikal", "Lago Tanganica", "Lago Victoria"), "Naturaleza", "El lago Cráter en Oregón se formó en la caldera del Monte Mazama tras su colapso volcánico hace unos 7.700 años, lo que lo convierte en el lago de cráter más grande del mundo.")
        ),
        BilingualQuestion(
            id = 10902, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac de barrage du monde?", listOf("le lac Volta", "le lac Assouan", "le lac Kariba", "le lac Nasser"), "Nature", "Le lac Volta, au Ghana, est le plus grand lac de barrage du monde en superficie, formé par le barrage d'Akosombo sur le fleuve Volta."),
            en = LocalizedContent("What is the largest reservoir lake in the world?", listOf("Lake Volta", "Lake Aswan", "Lake Kariba", "Lake Nasser"), "Nature", "Lake Volta in Ghana is the largest reservoir lake in the world by surface area, formed by the Akosombo Dam on the Volta River."),
            zh = LocalizedContent("世界上最大的水库湖是什么？", listOf("沃尔特湖", "阿斯旺湖", "卡里巴湖", "纳赛尔湖"), "自然", "加纳的沃尔特湖是由沃尔特河上的阿科松博水坝形成，按表面积计算是世界上最大的水库湖。"),
            es = LocalizedContent("¿Cuál es el lago de embalse más grande del mundo?", listOf("Lago Volta", "Lago Asuán", "Lago Kariba", "Lago Nasser"), "Naturaleza", "El lago Volta en Ghana es el lago de embalse más grande del mundo por superficie, formado por la presa de Akosombo en el río Volta.")
        ),
        BilingualQuestion(
            id = 10903, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac artificiel du monde?", listOf("le lac Volta", "le lac Assouan", "le lac Kariba", "le lac Nasser"), "Nature", "Le lac Volta, au Ghana, est le plus grand réservoir artificiel du monde par sa superficie, créé par le barrage d'Akosombo sur le fleuve Volta."),
            en = LocalizedContent("What is the largest artificial lake in the world?", listOf("Lake Volta", "Lake Aswan", "Lake Kariba", "Lake Nasser"), "Nature", "Lake Volta in Ghana is the largest artificial reservoir in the world by surface area, created by the Akosombo Dam on the Volta River."),
            zh = LocalizedContent("世界上最大的人工湖是什么？", listOf("沃尔特湖", "阿斯旺湖", "卡里巴湖", "纳赛尔湖"), "自然", "加纳的沃尔特湖是由沃尔特河上的阿科松博水坝形成，按表面积计算是世界上最大的人工水库。"),
            es = LocalizedContent("¿Cuál es el lago artificial más grande del mundo?", listOf("Lago Volta", "Lago Asuán", "Lago Kariba", "Lago Nasser"), "Naturaleza", "El lago Volta en Ghana es el embalse artificial más grande del mundo por superficie, creado por la presa de Akosombo en el río Volta.")
        ),
        BilingualQuestion(
            id = 10904, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand cours d'eau du monde par débit?", listOf("l'Amazone", "le Congo", "l'Orénoque", "le Mékong"), "Nature", "L'Amazone détient le record du plus grand débit d'eau au monde, avec une moyenne de 209 000 mètres cubes par seconde, soit plus que les sept plus grands fleuves suivants réunis."),
            en = LocalizedContent("What is the largest river in the world by discharge?", listOf("Amazon", "Congo", "Orinoco", "Mekong"), "Nature", "The Amazon holds the record for the largest water discharge in the world, averaging 209,000 cubic meters per second, more than the next seven largest rivers combined."),
            zh = LocalizedContent("世界上流量最大的河流是什么？", listOf("亚马逊河", "刚果河", "奥里诺科河", "湄公河"), "自然", "亚马逊河拥有世界上最大的水流量，平均每秒209,000立方米，超过其后七条最大河流的总和。"),
            es = LocalizedContent("¿Cuál es el río más grande del mundo por caudal?", listOf("Amazonas", "Congo", "Orinoco", "Mekong"), "Naturaleza", "El Amazonas tiene el récord del mayor caudal de agua del mundo, con un promedio de 209.000 metros cúbicos por segundo, más que los siguientes siete ríos más grandes juntos.")
        ),
        BilingualQuestion(
            id = 10905, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand cours d'eau du monde par longueur?", listOf("le Nil", "l'Amazone", "le Yangzi", "le Mississippi"), "Nature", "Le Nil mesure environ 6 650 kilomètres, ce qui en fait le plus long fleuve du monde, devant l'Amazone."),
            en = LocalizedContent("What is the longest river in the world?", listOf("Nile", "Amazon", "Yangtze", "Mississippi"), "Nature", "The Nile measures about 6,650 kilometers, making it the longest river in the world, ahead of the Amazon."),
            zh = LocalizedContent("世界上最长的河流是什么？", listOf("尼罗河", "亚马逊河", "长江", "密西西比河"), "自然", "尼罗河长约6,650公里，是世界上最长的河流，领先于亚马逊河。"),
            es = LocalizedContent("¿Cuál es el río más largo del mundo?", listOf("Nilo", "Amazonas", "Yangtsé", "Misisipi"), "Naturaleza", "El Nilo mide aproximadamente 6.650 kilómetros, lo que lo convierte en el río más largo del mundo, por delante del Amazonas.")
        ),
        BilingualQuestion(
            id = 10906, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cours d'eau du monde par volume?", listOf("l'Amazone", "le Congo", "l'Orénoque", "le Mékong"), "Nature", "L'Amazone détient le record du plus grand débit d'eau au monde, avec un volume moyen de 209 000 m³ par seconde, bien supérieur à celui du Nil ou du Mississippi."),
            en = LocalizedContent("What is the largest river in the world by volume?", listOf("Amazon", "Congo", "Orinoco", "Mekong"), "Nature", "The Amazon holds the record for the largest water discharge in the world, with an average volume of 209,000 m³ per second, far exceeding that of the Nile or Mississippi."),
            zh = LocalizedContent("世界上水量最大的河流是什么？", listOf("亚马逊河", "刚果河", "奥里诺科河", "湄公河"), "自然", "亚马逊河拥有世界上最大的水流量，平均每秒209,000立方米，远超尼罗河或密西西比河。"),
            es = LocalizedContent("¿Cuál es el río más grande del mundo por volumen?", listOf("Amazonas", "Congo", "Orinoco", "Mekong"), "Naturaleza", "El Amazonas tiene el récord del mayor caudal de agua del mundo, con un volumen promedio de 209.000 m³ por segundo, muy superior al del Nilo o el Misisipi.")
        ),
        BilingualQuestion(
            id = 10907, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand bassin fluvial du monde?", listOf("le bassin de l'Amazone", "le bassin du Congo", "le bassin de l'Orénoque", "le bassin du Mékong"), "Nature", "Le bassin de l'Amazone couvre environ 7 millions de km², soit près de la moitié de l'Amérique du Sud, ce qui en fait le plus vaste réseau hydrographique de la planète."),
            en = LocalizedContent("What is the largest river basin in the world?", listOf("Amazon basin", "Congo basin", "Orinoco basin", "Mekong basin"), "Nature", "The Amazon basin covers about 7 million km², nearly half of South America, making it the largest hydrographic network on the planet."),
            zh = LocalizedContent("世界上最大的河流流域是什么？", listOf("亚马逊河流域", "刚果河流域", "奥里诺科河流域", "湄公河流域"), "自然", "亚马逊河流域面积约700万平方公里，几乎占南美洲的一半，是地球上最大的水文网络。"),
            es = LocalizedContent("¿Cuál es la cuenca fluvial más grande del mundo?", listOf("Cuenca del Amazonas", "Cuenca del Congo", "Cuenca del Orinoco", "Cuenca del Mekong"), "Naturaleza", "La cuenca del Amazonas cubre aproximadamente 7 millones de km², casi la mitad de Sudamérica, lo que la convierte en la red hidrográfica más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10908, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand système fluvial du monde?", listOf("le système du Nil", "le système de l'Amazone", "le système du Yangzi", "le système du Mississippi"), "Nature", "Le système de l'Amazone est le plus grand du monde en volume d'eau et en superficie de bassin versant, s'étendant sur environ 7 millions de km² à travers plusieurs pays d'Amérique du Sud."),
            en = LocalizedContent("What is the largest river system in the world?", listOf("Nile system", "Amazon system", "Yangtze system", "Mississippi system"), "Nature", "The Amazon system is the largest in the world in terms of water volume and basin area, spanning about 7 million km² across several South American countries."),
            zh = LocalizedContent("世界上最大的河流系统是什么？", listOf("尼罗河系统", "亚马逊河系统", "长江系统", "密西西比河系统"), "自然", "亚马逊河系统在水量和流域面积方面都是世界上最大的，横跨南美洲多个国家，面积约700万平方公里。"),
            es = LocalizedContent("¿Cuál es el sistema fluvial más grande del mundo?", listOf("Sistema del Nilo", "Sistema del Amazonas", "Sistema del Yangtsé", "Sistema del Misisipi"), "Naturaleza", "El sistema del Amazonas es el más grande del mundo en volumen de agua y área de cuenca, abarcando unos 7 millones de km² a través de varios países sudamericanos.")
        ),
        BilingualQuestion(
            id = 10909, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus long fleuve du monde?", listOf("le Nil", "l'Amazone", "le Yangzi", "le Mississippi"), "Nature", "Le Nil, avec ses 6 650 km, est généralement reconnu comme le plus long fleuve du monde, bien que l'Amazonie lui dispute ce titre selon les critères de mesure."),
            en = LocalizedContent("What is the longest river in the world?", listOf("Nile", "Amazon", "Yangtze", "Mississippi"), "Nature", "The Nile, at 6,650 km, is generally recognized as the longest river in the world, although the Amazon disputes this title depending on measurement criteria."),
            zh = LocalizedContent("世界上最长的河流是什么？", listOf("尼罗河", "亚马逊河", "长江", "密西西比河"), "自然", "尼罗河长6,650公里，通常被认为是世界上最长的河流，尽管亚马逊河根据测量标准对此有争议。"),
            es = LocalizedContent("¿Cuál es el río más largo del mundo?", listOf("Nilo", "Amazonas", "Yangtsé", "Misisipi"), "Naturaleza", "El Nilo, con 6.650 km, es generalmente reconocido como el río más largo del mundo, aunque el Amazonas disputa este título según los criterios de medición.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10910, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus large fleuve du monde?", listOf("l'Amazone", "le Congo", "l'Orénoque", "le Mékong"), "Nature", "L'Amazone détient le record du plus grand débit d'eau au monde et de la plus vaste superficie de bassin versant, ce qui en fait le fleuve le plus large."),
            en = LocalizedContent("What is the widest river in the world?", listOf("the Amazon", "the Congo", "the Orinoco", "the Mekong"), "Nature", "The Amazon holds the record for the largest water discharge in the world and the largest drainage basin area, making it the widest river."),
            zh = LocalizedContent("世界上最宽的河流是什么？", listOf("亚马逊河", "刚果河", "奥里诺科河", "湄公河"), "自然", "亚马逊河拥有世界上最大的水流量和最大的流域面积，因此是最宽的河流。"),
            es = LocalizedContent("¿Cuál es el río más ancho del mundo?", listOf("el Amazonas", "el Congo", "el Orinoco", "el Mekong"), "Naturaleza", "El Amazonas posee el récord del mayor caudal de agua del mundo y la mayor superficie de cuenca, lo que lo convierte en el río más ancho.")
        ),
        BilingualQuestion(
            id = 10911, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus profond fleuve du monde?", listOf("le Congo", "l'Amazone", "le Yangzi", "le Mississippi"), "Nature", "Avec une profondeur maximale de 220 mètres, le fleuve Congo est le plus profond du monde, dépassant largement le deuxième, le Yangtsé."),
            en = LocalizedContent("What is the deepest river in the world?", listOf("the Congo", "the Amazon", "the Yangtze", "the Mississippi"), "Nature", "With a maximum depth of 220 meters, the Congo River is the deepest in the world, far exceeding the second deepest, the Yangtze."),
            zh = LocalizedContent("世界上最深的河流是什么？", listOf("刚果河", "亚马逊河", "长江", "密西西比河"), "自然", "刚果河最大深度达220米，是世界上最深的河流，远超第二深的长江。"),
            es = LocalizedContent("¿Cuál es el río más profundo del mundo?", listOf("el Congo", "el Amazonas", "el Yangtsé", "el Misisipi"), "Naturaleza", "Con una profundidad máxima de 220 metros, el río Congo es el más profundo del mundo, superando ampliamente al segundo, el Yangtsé.")
        ),
        BilingualQuestion(
            id = 10912, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus rapide fleuve du monde?", listOf("le Yangzi", "l'Amazone", "le Congo", "le Nil"), "Nature", "Le Yangzi est considéré comme le plus rapide grand fleuve du monde en raison de son débit élevé et de son courant puissant, surtout dans ses gorges."),
            en = LocalizedContent("What is the fastest river in the world?", listOf("the Yangtze", "the Amazon", "the Congo", "the Nile"), "Nature", "The Yangtze is considered the fastest major river in the world due to its high flow rate and strong current, especially in its gorges."),
            zh = LocalizedContent("世界上最快的河流是什么？", listOf("长江", "亚马逊河", "刚果河", "尼罗河"), "自然", "长江因其高流量和强劲的水流，尤其是在峡谷中，被认为是世界上最快的河流。"),
            es = LocalizedContent("¿Cuál es el río más rápido del mundo?", listOf("el Yangtsé", "el Amazonas", "el Congo", "el Nilo"), "Naturaleza", "El Yangtsé es considerado el río más rápido del mundo debido a su alto caudal y fuerte corriente, especialmente en sus gargantas.")
        ),
        BilingualQuestion(
            id = 10913, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus froid fleuve du monde?", listOf("la Léna", "l'Ob", "l'Ienisseï", "le Lena"), "Nature", "La Léna, en Sibérie, atteint des températures extrêmement basses, descendant jusqu'à -40°C en hiver, ce qui en fait le fleuve le plus froid du monde."),
            en = LocalizedContent("What is the coldest river in the world?", listOf("the Lena", "the Ob", "the Yenisei", "the Lena"), "Nature", "The Lena River in Siberia reaches extremely low temperatures, dropping to -40°C in winter, making it the coldest river in the world."),
            zh = LocalizedContent("世界上最冷的河流是什么？", listOf("勒拿河", "鄂毕河", "叶尼塞河", "勒拿河"), "自然", "西伯利亚的勒拿河冬季温度可降至-40°C，是世界上最冷的河流。"),
            es = LocalizedContent("¿Cuál es el río más frío del mundo?", listOf("el Lena", "el Obi", "el Yeniséi", "el Lena"), "Naturaleza", "El río Lena en Siberia alcanza temperaturas extremadamente bajas, descendiendo hasta -40°C en invierno, lo que lo convierte en el río más frío del mundo.")
        ),
        BilingualQuestion(
            id = 10914, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus chaud fleuve du monde?", listOf("le Nil", "l'Amazone", "le Mékong", "l'Orénoque"), "Nature", "L'Amazone détient le record du plus chaud fleuve du monde en raison de son débit immense et de son parcours en zone tropicale, où les températures élevées réchauffent ses eaux tout au long de l'année."),
            en = LocalizedContent("What is the hottest river in the world?", listOf("the Nile", "the Amazon", "the Mekong", "the Orinoco"), "Nature", "The Amazon holds the record for the hottest river in the world due to its immense flow and course through tropical regions, where high temperatures warm its waters year-round."),
            zh = LocalizedContent("世界上最热的河流是什么？", listOf("尼罗河", "亚马逊河", "湄公河", "奥里诺科河"), "自然", "亚马逊河因其巨大的流量和流经热带地区，全年高温使水温升高，被认为是世界上最热的河流。"),
            es = LocalizedContent("¿Cuál es el río más cálido del mundo?", listOf("el Nilo", "el Amazonas", "el Mekong", "el Orinoco"), "Naturaleza", "El Amazonas posee el récord del río más cálido del mundo debido a su inmenso caudal y su recorrido por zonas tropicales, donde las altas temperaturas calientan sus aguas durante todo el año.")
        ),
        BilingualQuestion(
            id = 10915, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus court fleuve du monde?", listOf("la Seine", "le Rhin", "le Koura", "le Dee"), "Nature", "Le Koura, en Turquie, ne mesure que 71 mètres de long, ce qui en fait le plus court fleuve du monde selon le Guinness World Records."),
            en = LocalizedContent("What is the shortest river in the world?", listOf("the Seine", "the Rhine", "the Kura", "the Dee"), "Nature", "The Kura River in Turkey is only 71 meters long, making it the shortest river in the world according to Guinness World Records."),
            zh = LocalizedContent("世界上最短的河流是什么？", listOf("塞纳河", "莱茵河", "库拉河", "迪河"), "自然", "土耳其的库拉河仅长71米，根据吉尼斯世界纪录，它是世界上最短的河流。"),
            es = LocalizedContent("¿Cuál es el río más corto del mundo?", listOf("el Sena", "el Rin", "el Kurá", "el Dee"), "Naturaleza", "El río Kurá en Turquía mide solo 71 metros de largo, lo que lo convierte en el río más corto del mundo según el Guinness World Records.")
        ),
        BilingualQuestion(
            id = 10916, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fleuve avec le plus grand nombre d'affluents?", listOf("l'Amazone", "le Nil", "le Yangzi", "le Mississippi"), "Nature", "L'Amazone détient le record du plus grand nombre d'affluents, avec plus de 1 100 cours d'eau répertoriés, dont 17 dépassent 1 500 km de long."),
            en = LocalizedContent("Which river has the most tributaries?", listOf("the Amazon", "the Nile", "the Yangtze", "the Mississippi"), "Nature", "The Amazon holds the record for the most tributaries, with over 1,100 watercourses listed, 17 of which exceed 1,500 km in length."),
            zh = LocalizedContent("哪条河流的支流最多？", listOf("亚马逊河", "尼罗河", "长江", "密西西比河"), "自然", "亚马逊河拥有最多的支流，记录在案的水道超过1100条，其中17条长度超过1500公里。"),
            es = LocalizedContent("¿Qué río tiene más afluentes?", listOf("el Amazonas", "el Nilo", "el Yangtsé", "el Misisipi"), "Naturaleza", "El Amazonas posee el récord de mayor número de afluentes, con más de 1.100 cursos de agua registrados, de los cuales 17 superan los 1.500 km de longitud.")
        ),
        BilingualQuestion(
            id = 10917, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fleuve avec le plus grand nombre de cascades?", listOf("le Congo", "l'Amazone", "le Yangtze", "le Rhin"), "Nature", "Le Congo est le fleuve qui possède le plus de cascades au monde, notamment les célèbres chutes Livingstone, une série de rapides et de chutes d'eau sur environ 350 kilomètres."),
            en = LocalizedContent("Which river has the most waterfalls?", listOf("the Congo", "the Amazon", "the Yangtze", "the Rhine"), "Nature", "The Congo River has the most waterfalls in the world, including the famous Livingstone Falls, a series of rapids and waterfalls over about 350 kilometers."),
            zh = LocalizedContent("哪条河流的瀑布最多？", listOf("刚果河", "亚马逊河", "长江", "莱茵河"), "自然", "刚果河拥有世界上最多的瀑布，包括著名的利文斯顿瀑布，这是一系列绵延约350公里的急流和瀑布。"),
            es = LocalizedContent("¿Qué río tiene más cascadas?", listOf("el Congo", "el Amazonas", "el Yangtsé", "el Rin"), "Naturaleza", "El río Congo posee la mayor cantidad de cascadas del mundo, incluidas las famosas cataratas Livingstone, una serie de rápidos y cascadas a lo largo de unos 350 kilómetros.")
        ),
        BilingualQuestion(
            id = 10918, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fleuve avec le plus grand nombre de rapides?", listOf("le Congo", "le Rhin", "l'Amazone", "le Nil"), "Nature", "Le Congo possède plus de 300 rapides et chutes d'eau sur son cours, notamment les célèbres chutes Boyoma, ce qui en fait le fleuve le plus tumultueux du monde."),
            en = LocalizedContent("Which river has the most rapids?", listOf("the Congo", "the Rhine", "the Amazon", "the Nile"), "Nature", "The Congo River has over 300 rapids and waterfalls along its course, including the famous Boyoma Falls, making it the most turbulent river in the world."),
            zh = LocalizedContent("哪条河流的急流最多？", listOf("刚果河", "莱茵河", "亚马逊河", "尼罗河"), "自然", "刚果河沿途有超过300个急流和瀑布，包括著名的博约马瀑布，是世界上最湍急的河流。"),
            es = LocalizedContent("¿Qué río tiene más rápidos?", listOf("el Congo", "el Rin", "el Amazonas", "el Nilo"), "Naturaleza", "El río Congo tiene más de 300 rápidos y cascadas a lo largo de su curso, incluidas las famosas cataratas Boyoma, lo que lo convierte en el río más turbulento del mundo.")
        ),
        BilingualQuestion(
            id = 10919, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand delta fluvial du monde?", listOf("le delta du Mékong", "le delta de l'Amazone", "le delta du Mississipi", "le delta du Nil"), "Nature", "Le delta du Mékong, au Vietnam, est le plus grand delta fluvial du monde avec une superficie d'environ 40 000 km². Il se forme par les sédiments déposés par le fleuve Mékong à son embouchure dans la mer de Chine méridionale."),
            en = LocalizedContent("What is the largest river delta in the world?", listOf("the Mekong Delta", "the Amazon Delta", "the Mississippi Delta", "the Nile Delta"), "Nature", "The Mekong Delta in Vietnam is the largest river delta in the world, with an area of about 40,000 km². It is formed by sediments deposited by the Mekong River at its mouth in the South China Sea."),
            zh = LocalizedContent("世界上最大的河流三角洲是什么？", listOf("湄公河三角洲", "亚马逊河三角洲", "密西西比河三角洲", "尼罗河三角洲"), "自然", "越南的湄公河三角洲是世界上最大的河流三角洲，面积约4万平方公里。它由湄公河在南海入海口沉积的泥沙形成。"),
            es = LocalizedContent("¿Cuál es el delta fluvial más grande del mundo?", listOf("el delta del Mekong", "el delta del Amazonas", "el delta del Misisipi", "el delta del Nilo"), "Naturaleza", "El delta del Mekong en Vietnam es el delta fluvial más grande del mundo, con una superficie de aproximadamente 40.000 km². Se forma por los sedimentos depositados por el río Mekong en su desembocadura en el mar de China Meridional.")
        ),
        BilingualQuestion(
            id = 10920, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand estuaire du monde?", listOf("l'estuaire de l'Amazone", "l'estuaire du Gange", "l'estuaire du Mississipi", "l'estuaire du Nil"), "Nature", "L'estuaire de l'Amazone s'étend sur plus de 330 kilomètres de large à son embouchure, ce qui en fait le plus vaste du monde. Il draine un bassin de 7 millions de km², le plus grand de la planète."),
            en = LocalizedContent("What is the largest estuary in the world?", listOf("the Amazon estuary", "the Ganges estuary", "the Mississippi estuary", "the Nile estuary"), "Nature", "The Amazon estuary spans over 330 kilometers wide at its mouth, making it the largest in the world. It drains a basin of 7 million km², the largest on the planet."),
            zh = LocalizedContent("世界上最大的河口湾是什么？", listOf("亚马逊河口湾", "恒河河口湾", "密西西比河口湾", "尼罗河口湾"), "自然", "亚马逊河口湾在入海口处宽达330多公里，是世界上最大的河口湾。它汇水面积达700万平方公里，为全球之最。"),
            es = LocalizedContent("¿Cuál es el estuario más grande del mundo?", listOf("el estuario del Amazonas", "el estuario del Ganges", "el estuario del Misisipi", "el estuario del Nilo"), "Naturaleza", "El estuario del Amazonas se extiende más de 330 kilómetros de ancho en su desembocadura, lo que lo convierte en el más grande del mundo. Drena una cuenca de 7 millones de km², la más grande del planeta.")
        ),
        BilingualQuestion(
            id = 10921, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal migrateur parcourt la plus grande distance?", listOf("la baleine grise", "l'anguille", "la sterne polaire", "le caribou"), "Nature", "La sterne polaire migre chaque année de l'Arctique à l'Antarctique, parcourant environ 70 000 kilomètres, soit la plus longue migration de tout le règne animal."),
            en = LocalizedContent("Which migratory animal travels the greatest distance?", listOf("the gray whale", "the eel", "the Arctic tern", "the caribou"), "Nature", "The Arctic tern migrates annually from the Arctic to the Antarctic, covering about 70,000 kilometers, the longest migration of any animal."),
            zh = LocalizedContent("哪种迁徙动物移动距离最远？", listOf("灰鲸", "鳗鱼", "北极燕鸥", "驯鹿"), "自然", "北极燕鸥每年从北极迁徙到南极，行程约7万公里，是所有动物中迁徙距离最长的。"),
            es = LocalizedContent("¿Qué animal migratorio recorre la mayor distancia?", listOf("la ballena gris", "la anguila", "el charrán ártico", "el caribú"), "Naturaleza", "El charrán ártico migra cada año desde el Ártico hasta la Antártida, recorriendo unos 70.000 kilómetros, la migración más larga de todo el reino animal.")
        ),
        BilingualQuestion(
            id = 10922, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal a le plus de pattes?", listOf("la mille-pattes", "la limule", "le scorpion", "l'araignée"), "Nature", "Le mille-pattes, ou myriapode, peut avoir jusqu'à 750 pattes, bien que le nombre varie selon les espèces, ce qui en fait l'animal avec le plus de pattes connu."),
            en = LocalizedContent("Which animal has the most legs?", listOf("the millipede", "the horseshoe crab", "the scorpion", "the spider"), "Nature", "The millipede can have up to 750 legs, although the number varies by species, making it the animal with the most known legs."),
            zh = LocalizedContent("哪种动物腿最多？", listOf("千足虫", "鲎", "蝎子", "蜘蛛"), "自然", "千足虫（马陆）最多可有750条腿，尽管数量因物种而异，使其成为已知腿最多的动物。"),
            es = LocalizedContent("¿Qué animal tiene más patas?", listOf("el milpiés", "el cangrejo herradura", "el escorpión", "la araña"), "Naturaleza", "El milpiés puede tener hasta 750 patas, aunque el número varía según la especie, lo que lo convierte en el animal con más patas conocido.")
        ),
        BilingualQuestion(
            id = 10923, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui pond le plus d'œufs à la fois?", listOf("la morue", "la sardine", "le hareng", "l'anchois"), "Nature", "La morue peut pondre jusqu'à 9 millions d'œufs en une seule ponte, ce qui en fait l'animal avec la plus grande fécondité ponctuelle."),
            en = LocalizedContent("Which animal lays the most eggs at once?", listOf("the cod", "the sardine", "the herring", "the anchovy"), "Nature", "The cod can lay up to 9 million eggs in a single spawning, making it the animal with the highest fecundity at one time."),
            zh = LocalizedContent("哪种动物一次产卵最多？", listOf("鳕鱼", "沙丁鱼", "鲱鱼", "凤尾鱼"), "自然", "鳕鱼一次产卵可达900万颗，是单次繁殖力最强的动物。"),
            es = LocalizedContent("¿Qué animal pone más huevos a la vez?", listOf("el bacalao", "la sardina", "el arenque", "la anchoa"), "Naturaleza", "El bacalao puede poner hasta 9 millones de huevos en una sola puesta, lo que lo convierte en el animal con mayor fecundidad puntual.")
        ),
        BilingualQuestion(
            id = 10924, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal avec la plus courte durée de vie?", listOf("la mouche éphémère", "la libellule", "le papillon", "la fourmi"), "Nature", "La mouche éphémère adulte ne vit que quelques heures à quelques jours, car elle ne se nourrit pas et son unique but est de se reproduire."),
            en = LocalizedContent("Which animal has the shortest lifespan?", listOf("the mayfly", "the dragonfly", "the butterfly", "the ant"), "Nature", "The adult mayfly lives only a few hours to a few days, as it does not feed and its sole purpose is to reproduce."),
            zh = LocalizedContent("哪种动物寿命最短？", listOf("蜉蝣", "蜻蜓", "蝴蝶", "蚂蚁"), "自然", "蜉蝣成虫仅存活几小时到几天，因为它不进食，唯一目的是繁殖。"),
            es = LocalizedContent("¿Qué animal tiene la vida más corta?", listOf("la efímera", "la libélula", "la mariposa", "la hormiga"), "Naturaleza", "La efímera adulta solo vive unas horas o unos días, ya que no se alimenta y su único propósito es reproducirse.")
        ),
        BilingualQuestion(
            id = 10925, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal avec la plus longue durée de vie?", listOf("la tortue géante", "le perroquet", "le humain", "la baleine"), "Nature", "Les perroquets, notamment les aras, peuvent vivre jusqu'à 80 ans en captivité, ce qui en fait l'un des animaux domestiques les plus longévifs."),
            en = LocalizedContent("Which animal has the longest lifespan?", listOf("the giant tortoise", "the parrot", "the human", "the whale"), "Nature", "Parrots, especially macaws, can live up to 80 years in captivity, making them one of the longest-lived domestic animals."),
            zh = LocalizedContent("哪种动物寿命最长？", listOf("巨型陆龟", "鹦鹉", "人类", "鲸鱼"), "自然", "鹦鹉，尤其是金刚鹦鹉，在圈养条件下可活到80岁，是最长寿的宠物之一。"),
            es = LocalizedContent("¿Qué animal tiene la vida más larga?", listOf("la tortuga gigante", "el loro", "el humano", "la ballena"), "Naturaleza", "Los loros, especialmente los guacamayos, pueden vivir hasta 80 años en cautiverio, lo que los convierte en uno de los animales domésticos más longevos.")
        ),
        BilingualQuestion(
            id = 10926, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui dort le plus?", listOf("la chauve-souris", "l'ours", "le koala", "le crocodile"), "Nature", "Le koala dort en moyenne 20 à 22 heures par jour pour économiser l'énergie nécessaire à la digestion de son régime alimentaire pauvre en nutriments, composé principalement de feuilles d'eucalyptus."),
            en = LocalizedContent("Which animal sleeps the most?", listOf("the bat", "the bear", "the koala", "the crocodile"), "Nature", "The koala sleeps an average of 20 to 22 hours a day to conserve energy needed to digest its nutrient-poor diet, mainly eucalyptus leaves."),
            zh = LocalizedContent("哪种动物睡觉最多？", listOf("蝙蝠", "熊", "考拉", "鳄鱼"), "自然", "考拉平均每天睡20到22小时，以节省消化其营养贫乏的饮食（主要是桉树叶）所需的能量。"),
            es = LocalizedContent("¿Qué animal duerme más?", listOf("el murciélago", "el oso", "el koala", "el cocodrilo"), "Naturaleza", "El koala duerme un promedio de 20 a 22 horas al día para ahorrar la energía necesaria para digerir su dieta pobre en nutrientes, compuesta principalmente de hojas de eucalipto.")
        ),
        BilingualQuestion(
            id = 10927, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui dort le moins?", listOf("le requin", "la girafe", "l'éléphant", "le chameau"), "Nature", "Les requins doivent nager en permanence pour faire circuler l'eau oxygénée sur leurs branchies, ce qui les empêche de dormir comme les autres animaux. Certaines espèces peuvent entrer dans un état de repos partiel tout en continuant à nager."),
            en = LocalizedContent("Which animal sleeps the least?", listOf("the shark", "the giraffe", "the elephant", "the camel"), "Nature", "Sharks must swim constantly to circulate oxygenated water over their gills, preventing them from sleeping like other animals. Some species can enter a state of partial rest while continuing to swim."),
            zh = LocalizedContent("哪种动物睡觉最少？", listOf("鲨鱼", "长颈鹿", "大象", "骆驼"), "自然", "鲨鱼必须不断游动以使含氧水流过鳃部，这使它们无法像其他动物一样睡觉。某些物种可以在继续游动的同时进入部分休息状态。"),
            es = LocalizedContent("¿Qué animal duerme menos?", listOf("el tiburón", "la jirafa", "el elefante", "el camello"), "Naturaleza", "Los tiburones deben nadar constantemente para hacer circular agua oxigenada sobre sus branquias, lo que les impide dormir como otros animales. Algunas especies pueden entrar en un estado de reposo parcial mientras continúan nadando.")
        ),
        BilingualQuestion(
            id = 10928, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui boit le plus d'eau?", listOf("la girafe", "le chameau", "l'éléphant", "l'hippopotame"), "Nature", "L'hippopotame passe la majeure partie de son temps dans l'eau pour se protéger du soleil et réguler sa température corporelle, ce qui le conduit à boire de grandes quantités d'eau quotidiennement."),
            en = LocalizedContent("Which animal drinks the most water?", listOf("the giraffe", "the camel", "the elephant", "the hippopotamus"), "Nature", "The hippopotamus spends most of its time in water to protect itself from the sun and regulate its body temperature, leading it to drink large amounts of water daily."),
            zh = LocalizedContent("哪种动物喝水最多？", listOf("长颈鹿", "骆驼", "大象", "河马"), "自然", "河马大部分时间待在水里以保护自己免受阳光照射并调节体温，这导致它每天饮用大量水。"),
            es = LocalizedContent("¿Qué animal bebe más agua?", listOf("la jirafa", "el camello", "el elefante", "el hipopótamo"), "Naturaleza", "El hipopótamo pasa la mayor parte del tiempo en el agua para protegerse del sol y regular su temperatura corporal, lo que lo lleva a beber grandes cantidades de agua a diario.")
        ),
        BilingualQuestion(
            id = 10929, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui boit le moins d'eau?", listOf("le chameau", "le kangourou", "le renard du désert", "la hyène"), "Nature", "Le kangourou possède un métabolisme très efficace qui lui permet de survivre dans des environnements arides en buvant très peu, car il tire l'essentiel de son hydratation des plantes qu'il consomme."),
            en = LocalizedContent("Which animal drinks the least water?", listOf("the camel", "the kangaroo", "the fennec fox", "the hyena"), "Nature", "The kangaroo has a very efficient metabolism that allows it to survive in arid environments by drinking very little, as it gets most of its hydration from the plants it consumes."),
            zh = LocalizedContent("哪种动物喝水最少？", listOf("骆驼", "袋鼠", "耳廓狐", "鬣狗"), "自然", "袋鼠的新陈代谢非常高效，使其能够在干旱环境中生存，只需喝很少的水，因为它从所食用的植物中获取大部分水分。"),
            es = LocalizedContent("¿Qué animal bebe menos agua?", listOf("el camello", "el canguro", "el fénec", "la hiena"), "Naturaleza", "El canguro posee un metabolismo muy eficiente que le permite sobrevivir en ambientes áridos bebiendo muy poca agua, ya que obtiene la mayor parte de su hidratación de las plantas que consume.")
        ),
    )
}
