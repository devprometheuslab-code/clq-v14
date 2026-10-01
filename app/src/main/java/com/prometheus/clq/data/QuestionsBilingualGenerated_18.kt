package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 18 : 500 questions bilingues */
object QuestionsBilingualGenerated_18 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51138, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Inception'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cinéma", "Hans Zimmer a composé la musique d'Inception, marquée par l'utilisation emblématique du morceau \"Non, Je Ne Regrette Rien\" d'Édith Piaf ralenti."),
            en = LocalizedContent("Who composed the music for 'Inception'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cinema", "Hans Zimmer composed the music for Inception, marked by the iconic use of Édith Piaf's slowed-down track \"Non, Je Ne Regrette Rien\"."),
            zh = LocalizedContent("谁为《盗梦空间》创作了音乐？", listOf("汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内", "杰里·戈德史密斯"), "电影", "汉斯·季默为《盗梦空间》创作了音乐，其标志性特点是使用了伊迪丝·琵雅芙的歌曲《Non, Je Ne Regrette Rien》的慢速版本。"),
            es = LocalizedContent("¿Quién compuso la música de 'Inception'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cine", "Hans Zimmer compuso la música de Inception, marcada por el uso icónico del tema \"Non, Je Ne Regrette Rien\" de Édith Piaf en cámara lenta.")
        ),
        BilingualQuestion(
            id = 51139, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film Netflix original le plus regardé?", listOf("Stranger Things", "Bridgerton", "Wednesday", "Don't Look Up"), "Cinéma", "Wednesday a cumulé plus d'1,7 milliard d'heures de visionnage lors de sa première saison, devenant ainsi le record absolu de la plateforme."),
            en = LocalizedContent("What is the most-watched original Netflix film?", listOf("Stranger Things", "Bridgerton", "Wednesday", "Don't Look Up"), "Cinema", "Wednesday accumulated over 1.7 billion hours of viewing in its first season, becoming the absolute record on the platform."),
            zh = LocalizedContent("Netflix原创电影中观看量最高的是哪一部？", listOf("怪奇物语", "布里奇顿", "星期三", "不要抬头"), "电影", "《星期三》第一季累计观看时长超过17亿小时，成为该平台的绝对纪录。"),
            es = LocalizedContent("¿Cuál es la película original de Netflix más vista?", listOf("Stranger Things", "Bridgerton", "Wednesday", "Don't Look Up"), "Cine", "Wednesday acumuló más de 1.700 millones de horas de visualización en su primera temporada, convirtiéndose en el récord absoluto de la plataforma.")
        ),
        BilingualQuestion(
            id = 51140, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur asiatique a remporté l'Oscar du meilleur réalisateur?", listOf("Bong Joon-ho", "Ang Lee", "Park Chan-wook", "Wong Kar-wai"), "Cinéma", "Ang Lee a remporté l'Oscar du meilleur réalisateur pour Brokeback Mountain en 2006, puis pour Life of Pi en 2013, étant le premier réalisateur asiatique à obtenir cette récompense."),
            en = LocalizedContent("Which Asian director won the Oscar for Best Director?", listOf("Bong Joon-ho", "Ang Lee", "Park Chan-wook", "Wong Kar-wai"), "Cinema", "Ang Lee won the Oscar for Best Director for Brokeback Mountain in 2006 and later for Life of Pi in 2013, being the first Asian director to receive this award."),
            zh = LocalizedContent("哪位亚洲导演获得了奥斯卡最佳导演奖？", listOf("奉俊昊", "李安", "朴赞郁", "王家卫"), "电影", "李安凭借《断背山》于2006年获得奥斯卡最佳导演奖，后又凭借《少年派的奇幻漂流》于2013年获奖，是首位获得该奖项的亚洲导演。"),
            es = LocalizedContent("¿Qué director asiático ganó el Oscar al mejor director?", listOf("Bong Joon-ho", "Ang Lee", "Park Chan-wook", "Wong Kar-wai"), "Cine", "Ang Lee ganó el Oscar al mejor director por Brokeback Mountain en 2006 y luego por Life of Pi en 2013, siendo el primer director asiático en recibir este premio.")
        ),
        BilingualQuestion(
            id = 51141, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film d'horreur classique a été réalisé par Alfred Hitchcock?", listOf("Psycho", "The Birds", "Vertigo", "Tous les trois"), "Cinéma", "Alfred Hitchcock a réalisé plusieurs films d'horreur classiques, dont Psychose, Les Oiseaux et Sueurs froides, ce qui rend la réponse \"Tous les trois\" correcte."),
            en = LocalizedContent("Which classic horror film was directed by Alfred Hitchcock?", listOf("Psycho", "The Birds", "Vertigo", "All three"), "Cinema", "Alfred Hitchcock directed several classic horror films, including Psycho, The Birds, and Vertigo, making 'All three' the correct answer."),
            zh = LocalizedContent("哪部经典恐怖片是由阿尔弗雷德·希区柯克执导的？", listOf("惊魂记", "群鸟", "迷魂记", "以上全部"), "电影", "阿尔弗雷德·希区柯克执导了多部经典恐怖片，包括《惊魂记》、《群鸟》和《迷魂记》，因此“以上全部”是正确答案。"),
            es = LocalizedContent("¿Qué película de terror clásica fue dirigida por Alfred Hitchcock?", listOf("Psicosis", "Los pájaros", "Vértigo", "Las tres"), "Cine", "Alfred Hitchcock dirigió varias películas de terror clásicas, incluyendo Psicosis, Los pájaros y Vértigo, por lo que 'Las tres' es la respuesta correcta.")
        ),
        BilingualQuestion(
            id = 51142, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Oldboy'?", listOf("Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong", "Hong Sang-soo"), "Cinéma", "Park Chan-wook, réalisateur sud-coréen, a réalisé Oldboy en 2003, deuxième volet de sa trilogie de la vengeance."),
            en = LocalizedContent("Who directed 'Oldboy'?", listOf("Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong", "Hong Sang-soo"), "Cinema", "Park Chan-wook, a South Korean director, directed Oldboy in 2003, the second installment of his Vengeance Trilogy."),
            zh = LocalizedContent("谁执导了《老男孩》？", listOf("朴赞郁", "奉俊昊", "李沧东", "洪常秀"), "电影", "韩国导演朴赞郁于2003年执导了《老男孩》，这是他复仇三部曲的第二部。"),
            es = LocalizedContent("¿Quién dirigió 'Oldboy'?", listOf("Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong", "Hong Sang-soo"), "Cine", "Park Chan-wook, director surcoreano, dirigió Oldboy en 2003, la segunda entrega de su trilogía de la venganza.")
        ),
        BilingualQuestion(
            id = 51143, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film animé a remporté l'Oscar du meilleur film d'animation en 2020?", listOf("Toy Story 4", "Klaus", "Missing Link", "I Lost My Body"), "Cinéma", "Klaus a remporté l'Oscar du meilleur film d'animation en 2020, devenant le premier film non produit par un grand studio américain à gagner dans cette catégorie."),
            en = LocalizedContent("Which animated film won the Oscar for Best Animated Feature in 2020?", listOf("Toy Story 4", "Klaus", "Missing Link", "I Lost My Body"), "Cinema", "Klaus won the Oscar for Best Animated Feature in 2020, becoming the first film not produced by a major American studio to win in this category."),
            zh = LocalizedContent("哪部动画电影在2020年获得了奥斯卡最佳动画长片奖？", listOf("玩具总动员4", "克劳斯：圣诞节的秘密", "遗失的环节", "我失去了身体"), "电影", "《克劳斯：圣诞节的秘密》在2020年获得了奥斯卡最佳动画长片奖，成为首部非美国大型制片厂制作的获奖影片。"),
            es = LocalizedContent("¿Qué película animada ganó el Oscar a la mejor película de animación en 2020?", listOf("Toy Story 4", "Klaus", "Missing Link", "I Lost My Body"), "Cine", "Klaus ganó el Oscar a la mejor película de animación en 2020, convirtiéndose en la primera película no producida por un gran estudio estadounidense en ganar en esta categoría.")
        ),
        BilingualQuestion(
            id = 51144, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé la musique de 'Forrest Gump'?", listOf("Alan Silvestri", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cinéma", "Alan Silvestri a composé la bande originale de Forrest Gump, créant un thème emblématique qui accompagne les moments clés du film."),
            en = LocalizedContent("Who composed the music for 'Forrest Gump'?", listOf("Alan Silvestri", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cinema", "Alan Silvestri composed the soundtrack for Forrest Gump, creating an iconic theme that accompanies key moments of the film."),
            zh = LocalizedContent("谁为《阿甘正传》创作了音乐？", listOf("艾伦·西尔维斯特里", "约翰·威廉姆斯", "汉斯·季默", "埃尼奥·莫里康内"), "电影", "艾伦·西尔维斯特里为《阿甘正传》创作了原声带，其标志性主题曲伴随了电影的关键时刻。"),
            es = LocalizedContent("¿Quién compuso la música de 'Forrest Gump'?", listOf("Alan Silvestri", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cine", "Alan Silvestri compuso la banda sonora de Forrest Gump, creando un tema icónico que acompaña los momentos clave de la película.")
        ),
        BilingualQuestion(
            id = 51145, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film Netflix le plus cher jamais produit?", listOf("Red Notice", "The Gray Man", "Don't Look Up", "Glass Onion"), "Cinéma", "Avec un budget de plus de 200 millions de dollars, The Gray Man a dépassé les coûts de production des précédents records de Netflix comme Red Notice et 6 Underground."),
            en = LocalizedContent("What is the most expensive Netflix film ever produced?", listOf("Red Notice", "The Gray Man", "Don't Look Up", "Glass Onion"), "Cinema", "With a budget of over $200 million, The Gray Man surpassed the production costs of previous Netflix records like Red Notice and 6 Underground."),
            zh = LocalizedContent("Netflix有史以来制作成本最高的电影是哪一部？", listOf("红色通缉令", "灰影人", "不要抬头", "利刃出鞘2"), "电影", "《灰影人》预算超过2亿美元，超过了Netflix此前纪录如《红色通缉令》和《地下6号》的制作成本。"),
            es = LocalizedContent("¿Cuál es la película de Netflix más cara jamás producida?", listOf("Red Notice", "The Gray Man", "Don't Look Up", "Glass Onion"), "Cine", "Con un presupuesto de más de 200 millones de dólares, The Gray Man superó los costes de producción de los récords anteriores de Netflix como Red Notice y 6 Underground.")
        ),
        BilingualQuestion(
            id = 51146, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a réalisé 'The Handmaiden'?", listOf("Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong", "Hong Sang-soo"), "Cinéma", "Park Chan-wook est un réalisateur sud-coréen reconnu pour son style visuel distinctif et ses thrillers psychologiques. The Handmaiden (2016) est son adaptation du roman britannique Finger Smith, transposée dans la Corée des années 1930."),
            en = LocalizedContent("Which director directed 'The Handmaiden'?", listOf("Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong", "Hong Sang-soo"), "Cinema", "Park Chan-wook is a South Korean director known for his distinctive visual style and psychological thrillers. The Handmaiden (2016) is his adaptation of the British novel Fingersmith, set in 1930s Korea."),
            zh = LocalizedContent("哪位导演执导了《小姐》？", listOf("朴赞郁", "奉俊昊", "李沧东", "洪常秀"), "电影", "朴赞郁是韩国导演，以其独特的视觉风格和心理惊悚片而闻名。《小姐》（2016）是他对英国小说《指匠情挑》的改编，背景设定在1930年代的韩国。"),
            es = LocalizedContent("¿Qué director dirigió 'The Handmaiden'?", listOf("Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong", "Hong Sang-soo"), "Cine", "Park Chan-wook es un director surcoreano conocido por su estilo visual distintivo y sus thrillers psicológicos. The Handmaiden (2016) es su adaptación de la novela británica Fingersmith, ambientada en la Corea de los años 30.")
        ),
        BilingualQuestion(
            id = 51147, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par David Fincher?", listOf("Gone Girl", "Se7en", "The Girl with the Dragon Tattoo", "Tous les trois"), "Cinéma", "David Fincher a réalisé trois films d'horreur : Se7en, Fight Club (souvent classé thriller horrifique) et Panic Room."),
            en = LocalizedContent("Which horror film was directed by David Fincher?", listOf("Gone Girl", "Se7en", "The Girl with the Dragon Tattoo", "All three"), "Cinema", "David Fincher directed three horror films: Se7en, Fight Club (often classified as a horror thriller) and Panic Room."),
            zh = LocalizedContent("哪部恐怖片是由大卫·芬奇执导的？", listOf("消失的爱人", "七宗罪", "龙纹身的女孩", "以上全部"), "电影", "大卫·芬奇执导了三部恐怖片：《七宗罪》、《搏击俱乐部》（常被归类为恐怖惊悚片）和《战栗空间》。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por David Fincher?", listOf("Perdida", "Seven", "La chica del dragón tatuado", "Las tres"), "Cine", "David Fincher dirigió tres películas de terror: Seven, El club de la lucha (a menudo clasificada como thriller de terror) y La habitación del pánico.")
        ),
        BilingualQuestion(
            id = 51148, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'The Avengers'?", listOf("Alan Silvestri", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cinéma", "Alan Silvestri a composé la musique du film 'The Avengers' (2012), marquant son entrée dans l'univers cinématographique Marvel."),
            en = LocalizedContent("Who composed the music for 'The Avengers'?", listOf("Alan Silvestri", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cinema", "Alan Silvestri composed the music for the film 'The Avengers' (2012), marking his entry into the Marvel Cinematic Universe."),
            zh = LocalizedContent("谁为《复仇者联盟》创作了音乐？", listOf("艾伦·西尔维斯特里", "约翰·威廉姆斯", "汉斯·季默", "埃尼奥·莫里康内"), "电影", "艾伦·西尔维斯特里为电影《复仇者联盟》（2012）创作了音乐，标志着他进入漫威电影宇宙。"),
            es = LocalizedContent("¿Quién compuso la música de 'The Avengers'?", listOf("Alan Silvestri", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cine", "Alan Silvestri compuso la música de la película 'The Avengers' (2012), marcando su entrada en el universo cinematográfico de Marvel.")
        ),
        BilingualQuestion(
            id = 51149, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film asiatique a remporté le Golden Globe du meilleur film étranger?", listOf("Parasite", "Drive My Car", "Memoria", "Everything Everywhere All at Once"), "Cinéma", "Parasite, réalisé par Bong Joon-ho, a remporté le Golden Globe du meilleur film étranger en 2020, devenant le premier film sud-coréen à obtenir cette récompense."),
            en = LocalizedContent("Which Asian film won the Golden Globe for Best Foreign Language Film?", listOf("Parasite", "Drive My Car", "Memoria", "Everything Everywhere All at Once"), "Cinema", "Parasite, directed by Bong Joon-ho, won the Golden Globe for Best Foreign Language Film in 2020, becoming the first South Korean film to receive this award."),
            zh = LocalizedContent("哪部亚洲电影获得了金球奖最佳外语片？", listOf("寄生虫", "驾驶我的车", "记忆", "瞬息全宇宙"), "电影", "奉俊昊执导的《寄生虫》在2020年获得了金球奖最佳外语片，成为首部获得该奖项的韩国电影。"),
            es = LocalizedContent("¿Qué película asiática ganó el Globo de Oro a la mejor película extranjera?", listOf("Parasite", "Drive My Car", "Memoria", "Everything Everywhere All at Once"), "Cine", "Parasite, dirigida por Bong Joon-ho, ganó el Globo de Oro a la mejor película extranjera en 2020, convirtiéndose en la primera película surcoreana en recibir este premio.")
        ),
        BilingualQuestion(
            id = 51150, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Burning'?", listOf("Lee Chang-dong", "Park Chan-wook", "Bong Joon-ho", "Hong Sang-soo"), "Cinéma", "Lee Chang-dong a réalisé 'Burning' en 2018, un thriller psychologique sud-coréen adapté d'une nouvelle de Haruki Murakami."),
            en = LocalizedContent("Which director directed 'Burning'?", listOf("Lee Chang-dong", "Park Chan-wook", "Bong Joon-ho", "Hong Sang-soo"), "Cinema", "Lee Chang-dong directed 'Burning' in 2018, a South Korean psychological thriller adapted from a short story by Haruki Murakami."),
            zh = LocalizedContent("哪位导演执导了《燃烧》？", listOf("李沧东", "朴赞郁", "奉俊昊", "洪常秀"), "电影", "李沧东在2018年执导了《燃烧》，这是一部改编自村上春树短篇小说的韩国心理惊悚片。"),
            es = LocalizedContent("¿Qué director dirigió 'Burning'?", listOf("Lee Chang-dong", "Park Chan-wook", "Bong Joon-ho", "Hong Sang-soo"), "Cine", "Lee Chang-dong dirigió 'Burning' en 2018, un thriller psicológico surcoreano adaptado de un cuento de Haruki Murakami.")
        ),
        BilingualQuestion(
            id = 51151, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par James Wan?", listOf("The Conjuring", "Insidious", "Saw", "Tous les trois"), "Cinéma", "James Wan a réalisé les trois premiers films de la saga Saw, ainsi que d'autres films d'horreur comme Insidious et Conjuring."),
            en = LocalizedContent("Which horror film was directed by James Wan?", listOf("The Conjuring", "Insidious", "Saw", "All three"), "Cinema", "James Wan directed the first three films of the Saw franchise, as well as other horror films like Insidious and The Conjuring."),
            zh = LocalizedContent("哪部恐怖片是由詹姆斯·温执导的？", listOf("招魂", "潜伏", "电锯惊魂", "以上全部"), "电影", "詹姆斯·温执导了《电锯惊魂》系列的前三部，以及《潜伏》和《招魂》等其他恐怖片。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por James Wan?", listOf("The Conjuring", "Insidious", "Saw", "Las tres"), "Cine", "James Wan dirigió las tres primeras películas de la saga Saw, así como otras películas de terror como Insidious y The Conjuring.")
        ),
        BilingualQuestion(
            id = 51152, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a composé la musique de 'Oppenheimer'?", listOf("Ludwig Göransson", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinéma", "Ludwig Göransson a composé la bande originale du film 'Oppenheimer' de Christopher Nolan, sorti en 2023."),
            en = LocalizedContent("Who composed the music for 'Oppenheimer'?", listOf("Ludwig Göransson", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinema", "Ludwig Göransson composed the soundtrack for Christopher Nolan's film 'Oppenheimer', released in 2023."),
            zh = LocalizedContent("谁为《奥本海默》创作了音乐？", listOf("路德维希·戈兰松", "汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内"), "电影", "路德维希·戈兰松为克里斯托弗·诺兰的电影《奥本海默》（2023年上映）创作了配乐。"),
            es = LocalizedContent("¿Quién compuso la música de 'Oppenheimer'?", listOf("Ludwig Göransson", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cine", "Ludwig Göransson compuso la banda sonora de la película 'Oppenheimer' de Christopher Nolan, estrenada en 2023.")
        ),
        BilingualQuestion(
            id = 51153, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film Netflix original a remporté le plus de nominations aux BAFTA?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cinéma", "The Power of the Dog a reçu huit nominations aux BAFTA 2022, un record pour un film Netflix original."),
            en = LocalizedContent("Which Netflix original film received the most BAFTA nominations?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cinema", "The Power of the Dog received eight BAFTA nominations in 2022, a record for a Netflix original film."),
            zh = LocalizedContent("哪部Netflix原创电影获得了最多的BAFTA提名？", listOf("爱尔兰人", "罗马", "犬之力", "不要抬头"), "电影", "《犬之力》在2022年获得了八项BAFTA提名，创下了Netflix原创电影的纪录。"),
            es = LocalizedContent("¿Qué película original de Netflix recibió más nominaciones a los BAFTA?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cine", "The Power of the Dog recibió ocho nominaciones a los BAFTA en 2022, un récord para una película original de Netflix.")
        ),
        BilingualQuestion(
            id = 51154, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur indien a remporté la Palme d'Or?", listOf("Eidem Satyajit Ray", "Aucun", "Mani Ratnam", "Rajkumar Hirani"), "Cinéma", "Aucun réalisateur indien n'a remporté la Palme d'Or à Cannes. Le film le plus proche fut \"Pather Panchali\" de Satyajit Ray, qui a reçu le prix du Meilleur Document Humain en 1955."),
            en = LocalizedContent("Which Indian director won the Palme d'Or?", listOf("Satyajit Ray", "None", "Mani Ratnam", "Rajkumar Hirani"), "Cinema", "No Indian director has won the Palme d'Or at Cannes. The closest was Satyajit Ray's 'Pather Panchali', which won Best Human Document in 1955."),
            zh = LocalizedContent("哪位印度导演获得了金棕榈奖？", listOf("萨蒂亚吉特·雷伊", "没有", "马尼·拉特纳姆", "拉吉库马尔·希拉尼"), "电影", "没有印度导演获得过戛纳金棕榈奖。最接近的是萨蒂亚吉特·雷伊的《大地之歌》，在1955年获得了最佳人文纪录片奖。"),
            es = LocalizedContent("¿Qué director indio ganó la Palma de Oro?", listOf("Satyajit Ray", "Ninguno", "Mani Ratnam", "Rajkumar Hirani"), "Cine", "Ningún director indio ha ganado la Palma de Oro en Cannes. Lo más cercano fue 'Pather Panchali' de Satyajit Ray, que ganó el premio al Mejor Documental Humano en 1955.")
        ),
        BilingualQuestion(
            id = 51155, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur coréen a remporté le prix du public à Cannes?", listOf("The Wailing", "Gonjiam: Haunted Asylum", "Shutter", "Tale of Two Sisters"), "Cinéma", "The Wailing a reçu le prix du public dans la section Semaine de la critique à Cannes en 2016, un honneur rare pour un film d'horreur asiatique."),
            en = LocalizedContent("Which Korean horror film won the Audience Award at Cannes?", listOf("The Wailing", "Gonjiam: Haunted Asylum", "Shutter", "A Tale of Two Sisters"), "Cinema", "The Wailing received the Audience Award in the Critics' Week section at Cannes in 2016, a rare honor for an Asian horror film."),
            zh = LocalizedContent("哪部韩国恐怖片在戛纳获得了观众奖？", listOf("哭声", "昆池岩", "鬼影", "蔷花红莲"), "电影", "《哭声》在2016年戛纳电影节影评人周单元获得了观众奖，这是亚洲恐怖片罕见的荣誉。"),
            es = LocalizedContent("¿Qué película de terror coreana ganó el Premio del Público en Cannes?", listOf("The Wailing", "Gonjiam: Haunted Asylum", "Shutter", "A Tale of Two Sisters"), "Cine", "The Wailing recibió el Premio del Público en la sección Semana de la Crítica en Cannes en 2016, un honor poco común para una película de terror asiática.")
        ),
        BilingualQuestion(
            id = 51156, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'The Dark Knight'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Alan Silvestri"), "Cinéma", "Hans Zimmer a composé la musique de 'The Dark Knight', collaborant avec Christopher Nolan pour créer une bande-son emblématique du film."),
            en = LocalizedContent("Who composed the music for 'The Dark Knight'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Alan Silvestri"), "Cinema", "Hans Zimmer composed the music for 'The Dark Knight', collaborating with Christopher Nolan to create an iconic soundtrack for the film."),
            zh = LocalizedContent("谁为《黑暗骑士》创作了音乐？", listOf("汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内", "艾伦·西尔维斯特里"), "电影", "汉斯·季默为《黑暗骑士》创作了音乐，与克里斯托弗·诺兰合作，为电影打造了标志性的配乐。"),
            es = LocalizedContent("¿Quién compuso la música de 'The Dark Knight'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Alan Silvestri"), "Cine", "Hans Zimmer compuso la música de 'The Dark Knight', colaborando con Christopher Nolan para crear una banda sonora icónica para la película.")
        ),
        BilingualQuestion(
            id = 51157, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film d'animation le plus cher jamais produit?", listOf("Treasure Planet", "Tangled", "Moana", "Encanto"), "Cinéma", "Avec un budget de production estimé à 150 millions de dollars, Moana est l'un des films d'animation les plus coûteux, dépassant des classiques comme Toy Story 3 ou La Reine des Neiges."),
            en = LocalizedContent("What is the most expensive animated film ever produced?", listOf("Treasure Planet", "Tangled", "Moana", "Encanto"), "Cinema", "With an estimated production budget of $150 million, Moana is one of the most expensive animated films, surpassing classics like Toy Story 3 or Frozen."),
            zh = LocalizedContent("有史以来制作成本最高的动画电影是哪一部？", listOf("星银岛", "魔发奇缘", "海洋奇缘", "魔法满屋"), "电影", "《海洋奇缘》的制作预算估计为1.5亿美元，是最昂贵的动画电影之一，超过了《玩具总动员3》或《冰雪奇缘》等经典作品。"),
            es = LocalizedContent("¿Cuál es la película animada más cara jamás producida?", listOf("Treasure Planet", "Tangled", "Moana", "Encanto"), "Cine", "Con un presupuesto de producción estimado de 150 millones de dólares, Moana es una de las películas animadas más caras, superando a clásicos como Toy Story 3 o Frozen.")
        ),
        BilingualQuestion(
            id = 51158, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'In the Mood for Love'?", listOf("Wong Kar-wai", "John Woo", "Jackie Chan", "Tsui Hark"), "Cinéma", "Wong Kar-wai est le réalisateur hongkongais de ce film romantique de 2000, connu pour son esthétique visuelle et sa bande-son."),
            en = LocalizedContent("Which director directed 'In the Mood for Love'?", listOf("Wong Kar-wai", "John Woo", "Jackie Chan", "Tsui Hark"), "Cinema", "Wong Kar-wai is the Hong Kong director of this 2000 romantic film, known for its visual aesthetics and soundtrack."),
            zh = LocalizedContent("哪位导演执导了《花样年华》？", listOf("王家卫", "吴宇森", "成龙", "徐克"), "电影", "王家卫是这部2000年浪漫电影的香港导演，以其视觉美学和配乐而闻名。"),
            es = LocalizedContent("¿Qué director dirigió 'Deseando amar'?", listOf("Wong Kar-wai", "John Woo", "Jackie Chan", "Tsui Hark"), "Cine", "Wong Kar-wai es el director hongkonés de esta película romántica de 2000, conocida por su estética visual y banda sonora.")
        ),
        BilingualQuestion(
            id = 51159, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par John Carpenter?", listOf("Halloween", "The Thing", "The Fog", "Tous les trois"), "Cinéma", "John Carpenter a réalisé Halloween, The Thing et Christine, trois films d'horreur emblématiques."),
            en = LocalizedContent("Which horror film was directed by John Carpenter?", listOf("Halloween", "The Thing", "The Fog", "All three"), "Cinema", "John Carpenter directed Halloween, The Thing, and Christine, three iconic horror films."),
            zh = LocalizedContent("哪部恐怖片是由约翰·卡朋特执导的？", listOf("《月光光心慌慌》", "《怪形》", "《夜雾杀机》", "以上全部"), "电影", "约翰·卡朋特执导了《月光光心慌慌》、《怪形》和《克莉丝汀》，三部标志性的恐怖片。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por John Carpenter?", listOf("Halloween", "La cosa", "La niebla", "Las tres"), "Cine", "John Carpenter dirigió Halloween, La cosa y Christine, tres películas de terror icónicas.")
        ),
        BilingualQuestion(
            id = 51160, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Interstellar'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Alan Silvestri"), "Cinéma", "Hans Zimmer a composé la musique d'Interstellar, collaborant avec Christopher Nolan pour créer une bande-son emblématique mêlant orgue et cordes."),
            en = LocalizedContent("Who composed the music for 'Interstellar'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Alan Silvestri"), "Cinema", "Hans Zimmer composed the music for Interstellar, collaborating with Christopher Nolan to create an iconic soundtrack blending organ and strings."),
            zh = LocalizedContent("谁为《星际穿越》创作了音乐？", listOf("汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内", "艾伦·西尔维斯特里"), "电影", "汉斯·季默为《星际穿越》创作了音乐，与克里斯托弗·诺兰合作，打造了融合管风琴和弦乐的标志性配乐。"),
            es = LocalizedContent("¿Quién compuso la música de 'Interstellar'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Alan Silvestri"), "Cine", "Hans Zimmer compuso la música de Interstellar, colaborando con Christopher Nolan para crear una banda sonora icónica que combina órgano y cuerdas.")
        ),
        BilingualQuestion(
            id = 51161, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film asiatique a remporté le Golden Lion à Venise?", listOf("Drive My Car", "Under the Skin", "A Brighter Summer Day", "Chungking Express"), "Cinéma", "Drive My Car, réalisé par Ryusuke Hamaguchi, a remporté le Lion d'or à la Mostra de Venise en 2021, devenant le premier film japonais à obtenir cette récompense depuis 1958."),
            en = LocalizedContent("Which Asian film won the Golden Lion at Venice?", listOf("Drive My Car", "Under the Skin", "A Brighter Summer Day", "Chungking Express"), "Cinema", "Drive My Car, directed by Ryusuke Hamaguchi, won the Golden Lion at the Venice Film Festival in 2021, becoming the first Japanese film to win this award since 1958."),
            zh = LocalizedContent("哪部亚洲电影获得了威尼斯金狮奖？", listOf("《驾驶我的车》", "《皮囊之下》", "《牯岭街少年杀人事件》", "《重庆森林》"), "电影", "《驾驶我的车》由滨口龙介执导，在2021年威尼斯电影节上获得金狮奖，成为自1958年以来首部获得该奖项的日本电影。"),
            es = LocalizedContent("¿Qué película asiática ganó el León de Oro en Venecia?", listOf("Drive My Car", "Under the Skin", "A Brighter Summer Day", "Chungking Express"), "Cine", "Drive My Car, dirigida por Ryusuke Hamaguchi, ganó el León de Oro en el Festival de Cine de Venecia en 2021, convirtiéndose en la primera película japonesa en ganar este premio desde 1958.")
        ),
        BilingualQuestion(
            id = 51162, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Chungking Express'?", listOf("Wong Kar-wai", "John Woo", "Jackie Chan", "Tsui Hark"), "Cinéma", "Wong Kar-wai est un réalisateur hongkongais reconnu pour son style visuel distinctif et ses récits fragmentés. Il a réalisé 'Chungking Express' en 1994, un film emblématique du cinéma hongkongais."),
            en = LocalizedContent("Which director directed 'Chungking Express'?", listOf("Wong Kar-wai", "John Woo", "Jackie Chan", "Tsui Hark"), "Cinema", "Wong Kar-wai is a Hong Kong director recognized for his distinctive visual style and fragmented narratives. He directed 'Chungking Express' in 1994, an iconic film of Hong Kong cinema."),
            zh = LocalizedContent("哪位导演执导了《重庆森林》？", listOf("王家卫", "吴宇森", "成龙", "徐克"), "电影", "王家卫是一位香港导演，以其独特的视觉风格和碎片化叙事而闻名。他于1994年执导了《重庆森林》，这是香港电影的一部标志性作品。"),
            es = LocalizedContent("¿Qué director dirigió 'Chungking Express'?", listOf("Wong Kar-wai", "John Woo", "Jackie Chan", "Tsui Hark"), "Cine", "Wong Kar-wai es un director hongkonés reconocido por su estilo visual distintivo y narrativas fragmentadas. Dirigió 'Chungking Express' en 1994, una película icónica del cine hongkonés.")
        ),
        BilingualQuestion(
            id = 51163, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par George A. Romero?", listOf("Night of the Living Dead", "Dawn of the Dead", "The Crazies", "Tous les trois"), "Cinéma", "George A. Romero est surtout connu pour avoir réalisé la trilogie originale des morts-vivants, incluant La Nuit des morts-vivants, Zombie et Le Jour des morts-vivants."),
            en = LocalizedContent("Which horror film was directed by George A. Romero?", listOf("Night of the Living Dead", "Dawn of the Dead", "The Crazies", "All three"), "Cinema", "George A. Romero is best known for directing the original living dead trilogy, including Night of the Living Dead, Dawn of the Dead, and Day of the Dead."),
            zh = LocalizedContent("哪部恐怖片是由乔治·A·罗梅罗执导的？", listOf("《活死人之夜》", "《活死人黎明》", "《疯狂》", "以上全部"), "电影", "乔治·A·罗梅罗最著名的是执导了最初的活死人三部曲，包括《活死人之夜》、《活死人黎明》和《活死人之日》。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por George A. Romero?", listOf("La noche de los muertos vivientes", "El amanecer de los muertos", "The Crazies", "Las tres"), "Cine", "George A. Romero es conocido principalmente por dirigir la trilogía original de los muertos vivientes, incluyendo La noche de los muertos vivientes, El amanecer de los muertos y El día de los muertos.")
        ),
        BilingualQuestion(
            id = 51164, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Gladiator'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cinéma", "Hans Zimmer a composé la musique de Gladiator, collaborant avec Lisa Gerrard pour créer une bande originale emblématique qui a remporté un Golden Globe."),
            en = LocalizedContent("Who composed the music for 'Gladiator'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cinema", "Hans Zimmer composed the music for Gladiator, collaborating with Lisa Gerrard to create an iconic soundtrack that won a Golden Globe."),
            zh = LocalizedContent("谁为《角斗士》创作了音乐？", listOf("汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内", "杰里·戈德史密斯"), "电影", "汉斯·季默为《角斗士》创作了音乐，与丽莎·杰拉德合作，打造了获得金球奖的标志性配乐。"),
            es = LocalizedContent("¿Quién compuso la música de 'Gladiator'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cine", "Hans Zimmer compuso la música de Gladiator, colaborando con Lisa Gerrard para crear una banda sonora icónica que ganó un Globo de Oro.")
        ),
        BilingualQuestion(
            id = 51165, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film coréen a été nommé pour l'Oscar du meilleur film en langue étrangère?", listOf("Parasite", "A Tale of Two Sisters", "Burning", "Everything Everywhere All at Once"), "Cinéma", "Parasite de Bong Joon-ho a remporté l'Oscar du meilleur film en 2020, une première pour un film non anglophone, après avoir été nommé dans la catégorie du meilleur film en langue étrangère."),
            en = LocalizedContent("Which Korean film was nominated for the Oscar for Best Foreign Language Film?", listOf("Parasite", "A Tale of Two Sisters", "Burning", "Everything Everywhere All at Once"), "Cinema", "Parasite by Bong Joon-ho won the Oscar for Best Picture in 2020, a first for a non-English film, after being nominated in the Best Foreign Language Film category."),
            zh = LocalizedContent("哪部韩国电影获得了奥斯卡最佳外语片提名？", listOf("《寄生虫》", "《蔷花红莲》", "《燃烧》", "《瞬息全宇宙》"), "电影", "奉俊昊的《寄生虫》在2020年获得了奥斯卡最佳影片奖，这是非英语电影首次获得该奖项，此前它曾获得最佳外语片提名。"),
            es = LocalizedContent("¿Qué película coreana fue nominada al Oscar a la mejor película en lengua extranjera?", listOf("Parásitos", "A Tale of Two Sisters", "Burning", "Everything Everywhere All at Once"), "Cine", "Parásitos de Bong Joon-ho ganó el Oscar a la mejor película en 2020, una primicia para una película no inglesa, después de ser nominada en la categoría de mejor película en lengua extranjera.")
        ),
        BilingualQuestion(
            id = 51166, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Hard Boiled'?", listOf("John Woo", "Jackie Chan", "Wong Kar-wai", "Tsui Hark"), "Cinéma", "John Woo, réalisateur hongkongais, a réalisé 'Hard Boiled' en 1992, un film d'action emblématique pour ses scènes de fusillades chorégraphiées."),
            en = LocalizedContent("Which director directed 'Hard Boiled'?", listOf("John Woo", "Jackie Chan", "Wong Kar-wai", "Tsui Hark"), "Cinema", "John Woo, a Hong Kong director, directed 'Hard Boiled' in 1992, an action film iconic for its choreographed shootout scenes."),
            zh = LocalizedContent("哪位导演执导了《辣手神探》？", listOf("吴宇森", "成龙", "王家卫", "徐克"), "电影", "吴宇森，一位香港导演，于1992年执导了《辣手神探》，这部动作片以其精心编排的枪战场面而成为经典。"),
            es = LocalizedContent("¿Qué director dirigió 'Hard Boiled'?", listOf("John Woo", "Jackie Chan", "Wong Kar-wai", "Tsui Hark"), "Cine", "John Woo, un director hongkonés, dirigió 'Hard Boiled' en 1992, una película de acción icónica por sus escenas de tiroteos coreografiados.")
        ),
        BilingualQuestion(
            id = 51167, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Dario Argento?", listOf("Suspiria", "Tenebrae", "Inferno", "Tous les trois"), "Cinéma", "Dario Argento a réalisé les trois films Suspiria (1977), Les Frissons de l'angoisse (1975) et Le Chat à neuf queues (1971), tous classés dans le genre horreur."),
            en = LocalizedContent("Which horror film was directed by Dario Argento?", listOf("Suspiria", "Tenebrae", "Inferno", "All three"), "Cinema", "Dario Argento directed the three films Suspiria (1977), Tenebrae (1982), and Inferno (1980), all classified in the horror genre."),
            zh = LocalizedContent("哪部恐怖片是由达里奥·阿基多执导的？", listOf("《阴风阵阵》", "《暗夜》", "《地狱》", "以上全部"), "电影", "达里奥·阿基多执导了《阴风阵阵》（1977）、《暗夜》（1982）和《地狱》（1980）三部电影，均属于恐怖类型。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Dario Argento?", listOf("Suspiria", "Tenebrae", "Inferno", "Las tres"), "Cine", "Dario Argento dirigió las tres películas Suspiria (1977), Tenebrae (1982) e Inferno (1980), todas clasificadas en el género de terror.")
        ),
        BilingualQuestion(
            id = 51168, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé la musique de 'Pirates des Caraïbes'?", listOf("Klaus Badelt", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinéma", "Hans Zimmer a composé la bande originale de la franchise Pirates des Caraïbes, notamment pour le premier film, La Malédiction du Black Pearl, sorti en 2003."),
            en = LocalizedContent("Who composed the music for 'Pirates of the Caribbean'?", listOf("Klaus Badelt", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinema", "Hans Zimmer composed the soundtrack for the Pirates of the Caribbean franchise, notably for the first film, The Curse of the Black Pearl, released in 2003."),
            zh = LocalizedContent("谁为《加勒比海盗》创作了音乐？", listOf("克劳斯·巴德尔特", "汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内"), "电影", "汉斯·季默为《加勒比海盗》系列创作了原声带，尤其是2003年上映的第一部《黑珍珠号的诅咒》。"),
            es = LocalizedContent("¿Quién compuso la música de 'Piratas del Caribe'?", listOf("Klaus Badelt", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cine", "Hans Zimmer compuso la banda sonora de la franquicia Piratas del Caribe, especialmente para la primera película, La maldición del Perla Negra, estrenada en 2003.")
        ),
        BilingualQuestion(
            id = 51169, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film asiatique a remporté le plus grand nombre d'Oscars?", listOf("Parasite", "Everything Everywhere All at Once", "Oppenheimer", "Nomadland"), "Cinéma", "Everything Everywhere All at Once a remporté sept Oscars en 2023, dont celui du meilleur film, établissant un record pour un film asiatique."),
            en = LocalizedContent("Which Asian film has won the most Oscars?", listOf("Parasite", "Everything Everywhere All at Once", "Oppenheimer", "Nomadland"), "Cinema", "Everything Everywhere All at Once won seven Oscars in 2023, including Best Picture, setting a record for an Asian film."),
            zh = LocalizedContent("哪部亚洲电影获得了最多的奥斯卡奖？", listOf("寄生虫", "瞬息全宇宙", "奥本海默", "无依之地"), "电影", "《瞬息全宇宙》在2023年获得了七项奥斯卡奖，包括最佳影片，创下了亚洲电影的纪录。"),
            es = LocalizedContent("¿Qué película asiática ha ganado más premios Óscar?", listOf("Parásitos", "Todo a la vez en todas partes", "Oppenheimer", "Nomadland"), "Cine", "Todo a la vez en todas partes ganó siete premios Óscar en 2023, incluyendo Mejor Película, estableciendo un récord para una película asiática.")
        ),
        BilingualQuestion(
            id = 51170, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'The Killer'?", listOf("David Fincher", "Christopher Nolan", "Quentin Tarantino", "Spike Lee"), "Cinéma", "David Fincher a réalisé le thriller d'action 'The Killer' en 2023, adapté du roman graphique français, avec Michael Fassbender dans le rôle-titre."),
            en = LocalizedContent("Which director directed 'The Killer'?", listOf("David Fincher", "Christopher Nolan", "Quentin Tarantino", "Spike Lee"), "Cinema", "David Fincher directed the action thriller 'The Killer' in 2023, adapted from the French graphic novel, with Michael Fassbender in the title role."),
            zh = LocalizedContent("哪位导演执导了《杀手》？", listOf("大卫·芬奇", "克里斯托弗·诺兰", "昆汀·塔伦蒂诺", "斯派克·李"), "电影", "大卫·芬奇在2023年执导了动作惊悚片《杀手》，改编自法国图像小说，迈克尔·法斯宾德主演。"),
            es = LocalizedContent("¿Qué director dirigió 'El asesino'?", listOf("David Fincher", "Christopher Nolan", "Quentin Tarantino", "Spike Lee"), "Cine", "David Fincher dirigió el thriller de acción 'El asesino' en 2023, adaptado de la novela gráfica francesa, con Michael Fassbender en el papel principal.")
        ),
        BilingualQuestion(
            id = 51171, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Tobe Hooper?", listOf("The Texas Chain Saw Massacre", "Poltergeist", "Lifeforce", "Tous les trois"), "Cinéma", "Tobe Hooper a réalisé Massacre à la tronçonneuse (1974), Poltergeist (1982) et Le Crocodile de la mort (1977), tous des films d'horreur."),
            en = LocalizedContent("Which horror film was directed by Tobe Hooper?", listOf("The Texas Chain Saw Massacre", "Poltergeist", "Lifeforce", "All three"), "Cinema", "Tobe Hooper directed The Texas Chain Saw Massacre (1974), Poltergeist (1982), and Lifeforce (1985), all horror films."),
            zh = LocalizedContent("哪部恐怖片是由托比·霍珀执导的？", listOf("德州电锯杀人狂", "鬼驱人", "生命之力", "以上全部"), "电影", "托比·霍珀执导了《德州电锯杀人狂》（1974）、《鬼驱人》（1982）和《生命之力》（1985），均为恐怖片。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Tobe Hooper?", listOf("La matanza de Texas", "Poltergeist", "Lifeforce", "Las tres"), "Cine", "Tobe Hooper dirigió La matanza de Texas (1974), Poltergeist (1982) y Lifeforce (1985), todas películas de terror.")
        ),
        BilingualQuestion(
            id = 51172, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Avatar'?", listOf("James Horner", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinéma", "James Horner a composé la bande originale du film Avatar de James Cameron, sorti en 2009. Il a également travaillé sur d'autres films célèbres comme Titanic."),
            en = LocalizedContent("Who composed the music for 'Avatar'?", listOf("James Horner", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinema", "James Horner composed the soundtrack for James Cameron's film Avatar, released in 2009. He also worked on other famous films like Titanic."),
            zh = LocalizedContent("谁为《阿凡达》创作了音乐？", listOf("詹姆斯·霍纳", "汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内"), "电影", "詹姆斯·霍纳为詹姆斯·卡梅隆2009年上映的电影《阿凡达》创作了原声带。他还为《泰坦尼克号》等其他著名电影配乐。"),
            es = LocalizedContent("¿Quién compuso la música de 'Avatar'?", listOf("James Horner", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cine", "James Horner compuso la banda sonora de la película Avatar de James Cameron, estrenada en 2009. También trabajó en otras películas famosas como Titanic.")
        ),
        BilingualQuestion(
            id = 51173, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film coréen a remporté l'Oscar du meilleur film?", listOf("Parasite", "Minari", "Everything Everywhere All at Once", "Drive My Car"), "Cinéma", "Parasite de Bong Joon-ho a été le premier film non anglophone à remporter l'Oscar du meilleur film en 2020, marquant une étape historique pour le cinéma international."),
            en = LocalizedContent("Which Korean film won the Oscar for Best Picture?", listOf("Parasite", "Minari", "Everything Everywhere All at Once", "Drive My Car"), "Cinema", "Parasite by Bong Joon-ho was the first non-English language film to win the Oscar for Best Picture in 2020, marking a historic milestone for international cinema."),
            zh = LocalizedContent("哪部韩国电影获得了奥斯卡最佳影片奖？", listOf("寄生虫", "米纳里", "瞬息全宇宙", "驾驶我的车"), "电影", "奉俊昊执导的《寄生虫》是2020年第一部获得奥斯卡最佳影片的非英语电影，标志着国际电影的历史性里程碑。"),
            es = LocalizedContent("¿Qué película coreana ganó el Óscar a la Mejor Película?", listOf("Parásitos", "Minari", "Todo a la vez en todas partes", "Drive My Car"), "Cine", "Parásitos de Bong Joon-ho fue la primera película en un idioma no inglés en ganar el Óscar a la Mejor Película en 2020, marcando un hito histórico para el cine internacional.")
        ),
        BilingualQuestion(
            id = 51174, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Memories of Murder'?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinéma", "Bong Joon-ho a réalisé ce film sud-coréen en 2003, avant ses succès internationaux comme Parasite."),
            en = LocalizedContent("Which director directed 'Memories of Murder'?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinema", "Bong Joon-ho directed this South Korean film in 2003, before his international successes like Parasite."),
            zh = LocalizedContent("哪位导演执导了《杀人回忆》？", listOf("奉俊昊", "朴赞郁", "李沧东", "洪常秀"), "电影", "奉俊昊在2003年执导了这部韩国电影，早于他后来的国际成功作品如《寄生虫》。"),
            es = LocalizedContent("¿Qué director dirigió 'Memories of Murder'?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cine", "Bong Joon-ho dirigió esta película surcoreana en 2003, antes de sus éxitos internacionales como Parásitos.")
        ),
        BilingualQuestion(
            id = 51175, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Wes Craven?", listOf("Scream", "A Nightmare on Elm Street", "The Last House on the Left", "Tous les trois"), "Cinéma", "Wes Craven a réalisé les trois films Scream, Freddy : Les Griffes de la nuit et L’Emprise des ténèbres."),
            en = LocalizedContent("Which horror film was directed by Wes Craven?", listOf("Scream", "A Nightmare on Elm Street", "The Last House on the Left", "All three"), "Cinema", "Wes Craven directed all three films: Scream, A Nightmare on Elm Street, and The Last House on the Left."),
            zh = LocalizedContent("哪部恐怖片是由韦斯·克雷文执导的？", listOf("惊声尖叫", "猛鬼街", "左边最后一栋房子", "以上全部"), "电影", "韦斯·克雷文执导了这三部电影：《惊声尖叫》、《猛鬼街》和《左边最后一栋房子》。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Wes Craven?", listOf("Scream", "Pesadilla en Elm Street", "La última casa a la izquierda", "Las tres"), "Cine", "Wes Craven dirigió las tres películas: Scream, Pesadilla en Elm Street y La última casa a la izquierda.")
        ),
        BilingualQuestion(
            id = 51176, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Jurassic Park'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cinéma", "John Williams, compositeur attitré de Steven Spielberg, a signé la bande originale de Jurassic Park, dont le célèbre thème principal est devenu l'un des plus reconnaissables du cinéma."),
            en = LocalizedContent("Who composed the music for 'Jurassic Park'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cinema", "John Williams, Steven Spielberg's regular composer, scored the soundtrack for Jurassic Park, whose famous main theme has become one of the most recognizable in cinema."),
            zh = LocalizedContent("谁为《侏罗纪公园》创作了音乐？", listOf("约翰·威廉姆斯", "汉斯·季默", "埃尼奥·莫里康内", "杰里·戈德史密斯"), "电影", "约翰·威廉姆斯，史蒂文·斯皮尔伯格的御用作曲家，为《侏罗纪公园》创作了原声带，其著名的主旋律已成为电影中最具辨识度的音乐之一。"),
            es = LocalizedContent("¿Quién compuso la música de 'Parque Jurásico'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cine", "John Williams, compositor habitual de Steven Spielberg, creó la banda sonora de Parque Jurásico, cuyo famoso tema principal se ha convertido en uno de los más reconocibles del cine.")
        ),
        BilingualQuestion(
            id = 51177, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film japonais a remporté le Lion d'Or à Venise?", listOf("Crows Zero", "Battle Royale", "Departures", "Shall We Dance"), "Cinéma", "Le film Departures, réalisé par Yôjirô Takita, a remporté le Lion d'Or en 2008, devenant le premier film japonais à gagner ce prix depuis 1958."),
            en = LocalizedContent("Which Japanese film won the Golden Lion at Venice?", listOf("Crows Zero", "Battle Royale", "Departures", "Shall We Dance"), "Cinema", "The film Departures, directed by Yôjirô Takita, won the Golden Lion in 2008, becoming the first Japanese film to win this award since 1958."),
            zh = LocalizedContent("哪部日本电影获得了威尼斯金狮奖？", listOf("热血高校", "大逃杀", "入殓师", "谈谈情跳跳舞"), "电影", "由泷田洋二郎执导的电影《入殓师》在2008年获得了金狮奖，成为自1958年以来首部获得该奖项的日本电影。"),
            es = LocalizedContent("¿Qué película japonesa ganó el León de Oro en Venecia?", listOf("Crows Zero", "Battle Royale", "Departures", "Shall We Dance"), "Cine", "La película Departures, dirigida por Yôjirô Takita, ganó el León de Oro en 2008, convirtiéndose en la primera película japonesa en ganar este premio desde 1958.")
        ),
        BilingualQuestion(
            id = 51178, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'All About Lily Chou-Chou'?", listOf("Shunji Iwai", "Hirokazu Koreeda", "Takeshi Kitano", "Isao Takahata"), "Cinéma", "Shunji Iwai est un réalisateur japonais connu pour ses films poétiques et mélancoliques. 'All About Lily Chou-Chou' (2001) explore l'adolescence et la culture internet au Japon."),
            en = LocalizedContent("Which director directed 'All About Lily Chou-Chou'?", listOf("Shunji Iwai", "Hirokazu Koreeda", "Takeshi Kitano", "Isao Takahata"), "Cinema", "Shunji Iwai is a Japanese director known for his poetic and melancholic films. 'All About Lily Chou-Chou' (2001) explores adolescence and internet culture in Japan."),
            zh = LocalizedContent("哪位导演执导了《关于莉莉周的一切》？", listOf("岩井俊二", "是枝裕和", "北野武", "高畑勋"), "电影", "岩井俊二是日本导演，以其诗意忧郁的电影闻名。《关于莉莉周的一切》（2001）探讨了日本的青少年和网络文化。"),
            es = LocalizedContent("¿Qué director dirigió 'All About Lily Chou-Chou'?", listOf("Shunji Iwai", "Hirokazu Koreeda", "Takeshi Kitano", "Isao Takahata"), "Cine", "Shunji Iwai es un director japonés conocido por sus películas poéticas y melancólicas. 'All About Lily Chou-Chou' (2001) explora la adolescencia y la cultura de internet en Japón.")
        ),
        BilingualQuestion(
            id = 51179, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Lucio Fulci?", listOf("City of the Living Dead", "The House by the Cemetery", "The Black Cat", "Tous les trois"), "Cinéma", "Lucio Fulci a réalisé L'Au-delà, Frayeurs et La Maison près du cimetière, trois films d'horreur cultes italiens des années 1980."),
            en = LocalizedContent("Which horror film was directed by Lucio Fulci?", listOf("City of the Living Dead", "The House by the Cemetery", "The Black Cat", "All three"), "Cinema", "Lucio Fulci directed City of the Living Dead, The House by the Cemetery, and The Black Cat, three cult Italian horror films from the 1980s."),
            zh = LocalizedContent("哪部恐怖片是由卢西奥·弗尔奇执导的？", listOf("《生人回避》", "《墓地之屋》", "《黑猫》", "以上全部"), "电影", "卢西奥·弗尔奇执导了《生人回避》、《墓地之屋》和《黑猫》，这三部是20世纪80年代意大利邪典恐怖片。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Lucio Fulci?", listOf("City of the Living Dead", "The House by the Cemetery", "The Black Cat", "Las tres"), "Cine", "Lucio Fulci dirigió City of the Living Dead, The House by the Cemetery y The Black Cat, tres películas de terror italianas de culto de los años 80.")
        ),
        BilingualQuestion(
            id = 51180, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Titanic'?", listOf("James Horner", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinéma", "James Horner a composé la musique du film Titanic, sorti en 1997, dont la bande originale est devenue l'une des plus vendues de l'histoire du cinéma."),
            en = LocalizedContent("Who composed the music for 'Titanic'?", listOf("James Horner", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinema", "James Horner composed the music for the film Titanic, released in 1997, whose soundtrack became one of the best-selling in cinema history."),
            zh = LocalizedContent("谁为《泰坦尼克号》创作了音乐？", listOf("詹姆斯·霍纳", "汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内"), "电影", "詹姆斯·霍纳为1997年上映的电影《泰坦尼克号》创作了音乐，其原声带成为电影史上最畅销的之一。"),
            es = LocalizedContent("¿Quién compuso la música de 'Titanic'?", listOf("James Horner", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cine", "James Horner compuso la música de la película Titanic, estrenada en 1997, cuya banda sonora se convirtió en una de las más vendidas de la historia del cine.")
        ),
        BilingualQuestion(
            id = 51181, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film thaïlandais a remporté la Caméra d'Or à Cannes?", listOf("Apichatpong Weerasethakul", "Aucun", "In the Mood for Love", "Memories of Murder"), "Cinéma", "La Caméra d'Or récompense le meilleur premier film de la sélection cannoise, mais aucun film thaïlandais ne l'a jamais remportée. Le cinéma thaïlandais n'a pas encore été distingué par ce prix."),
            en = LocalizedContent("Which Thai film won the Caméra d'Or at Cannes?", listOf("Apichatpong Weerasethakul", "None", "In the Mood for Love", "Memories of Murder"), "Cinema", "The Caméra d'Or awards the best first film in the Cannes selection, but no Thai film has ever won it. Thai cinema has not yet been distinguished by this prize."),
            zh = LocalizedContent("哪部泰国电影获得了戛纳金摄影机奖？", listOf("阿彼察邦·韦拉斯哈古", "没有", "《花样年华》", "《杀人回忆》"), "电影", "金摄影机奖颁发给戛纳电影节最佳首部电影，但从未有泰国电影获奖。泰国电影尚未获得此奖项。"),
            es = LocalizedContent("¿Qué película tailandesa ganó la Cámara de Oro en Cannes?", listOf("Apichatpong Weerasethakul", "Ninguna", "In the Mood for Love", "Memories of Murder"), "Cine", "La Cámara de Oro premia la mejor primera película de la selección de Cannes, pero ninguna película tailandesa la ha ganado. El cine tailandés aún no ha sido distinguido con este premio.")
        ),
        BilingualQuestion(
            id = 51182, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Synecdoche, New York'?", listOf("Charlie Kaufman", "David Fincher", "Christopher Nolan", "Spike Jonze"), "Cinéma", "Charlie Kaufman a réalisé son premier film en tant que metteur en scène avec Synecdoche, New York en 2008, après avoir écrit des scénarios comme Eternal Sunshine of the Spotless Mind."),
            en = LocalizedContent("Which director directed 'Synecdoche, New York'?", listOf("Charlie Kaufman", "David Fincher", "Christopher Nolan", "Spike Jonze"), "Cinema", "Charlie Kaufman made his directorial debut with Synecdoche, New York in 2008, after writing screenplays like Eternal Sunshine of the Spotless Mind."),
            zh = LocalizedContent("哪位导演执导了《纽约提喻法》？", listOf("查理·考夫曼", "大卫·芬奇", "克里斯托弗·诺兰", "斯派克·琼斯"), "电影", "查理·考夫曼在2008年执导了他的导演处女作《纽约提喻法》，此前他创作了《暖暖内含光》等剧本。"),
            es = LocalizedContent("¿Qué director dirigió 'Synecdoche, New York'?", listOf("Charlie Kaufman", "David Fincher", "Christopher Nolan", "Spike Jonze"), "Cine", "Charlie Kaufman debutó como director con Synecdoche, New York en 2008, después de escribir guiones como Eternal Sunshine of the Spotless Mind.")
        ),
        BilingualQuestion(
            id = 51183, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Body Repulsion?", listOf("Cronenberg", "Videodrome", "The Fly", "Tous les trois"), "Cinéma", "Body Repulsion est le pseudonyme collectif d'un groupe de réalisateurs ayant signé trois films d'horreur distincts, d'où la réponse \"Tous les trois\"."),
            en = LocalizedContent("Which horror film was directed by Body Repulsion?", listOf("Cronenberg", "Videodrome", "The Fly", "All three"), "Cinema", "Body Repulsion is the collective pseudonym of a group of directors who signed three distinct horror films, hence the answer 'All three'."),
            zh = LocalizedContent("哪部恐怖片是由“身体排斥”执导的？", listOf("《柯南伯格》", "《录像带谋杀案》", "《变蝇人》", "以上全部"), "电影", "“身体排斥”是一组导演的集体化名，他们共同署名了三部不同的恐怖片，因此答案是“以上全部”。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Body Repulsion?", listOf("Cronenberg", "Videodrome", "The Fly", "Las tres"), "Cine", "Body Repulsion es el seudónimo colectivo de un grupo de directores que firmaron tres películas de terror distintas, de ahí la respuesta 'Las tres'.")
        ),
        BilingualQuestion(
            id = 51184, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Schindler's List'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cinéma", "John Williams a composé la musique de Schindler's List, remportant l'Oscar de la meilleure musique de film pour cette partition émouvante en 1994."),
            en = LocalizedContent("Who composed the music for 'Schindler's List'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cinema", "John Williams composed the music for Schindler's List, winning the Oscar for Best Original Score for this moving score in 1994."),
            zh = LocalizedContent("谁为《辛德勒的名单》创作了音乐？", listOf("约翰·威廉姆斯", "汉斯·季默", "埃尼奥·莫里康内", "杰里·戈德史密斯"), "电影", "约翰·威廉姆斯为《辛德勒的名单》创作了音乐，并于1994年凭借这一感人配乐获得了奥斯卡最佳原创配乐奖。"),
            es = LocalizedContent("¿Quién compuso la música de 'Schindler's List'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cine", "John Williams compuso la música de Schindler's List, ganando el Oscar a la mejor banda sonora original por esta conmovedora partitura en 1994.")
        ),
        BilingualQuestion(
            id = 51185, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film philippin a remporté le prix du jury à Cannes?", listOf("Abad Santos", "Ilo Ilo", "Batang West Side", "Memories of Murder"), "Cinéma", "Le film singapourien Ilo Ilo, réalisé par Anthony Chen, a reçu la Caméra d'Or au Festival de Cannes 2013, et non le prix du jury."),
            en = LocalizedContent("Which Philippine film won the Jury Prize at Cannes?", listOf("Abad Santos", "Ilo Ilo", "Batang West Side", "Memories of Murder"), "Cinema", "The Singaporean film Ilo Ilo, directed by Anthony Chen, won the Caméra d'Or at the 2013 Cannes Film Festival, not the Jury Prize."),
            zh = LocalizedContent("哪部菲律宾电影获得了戛纳评审团奖？", listOf("阿巴德·桑托斯", "《爸妈不在家》", "《西区少年》", "《杀人回忆》"), "电影", "新加坡电影《爸妈不在家》，由陈哲艺执导，在2013年戛纳电影节获得了金摄影机奖，而非评审团奖。"),
            es = LocalizedContent("¿Qué película filipina ganó el Premio del Jurado en Cannes?", listOf("Abad Santos", "Ilo Ilo", "Batang West Side", "Memories of Murder"), "Cine", "La película singapurense Ilo Ilo, dirigida por Anthony Chen, ganó la Cámara de Oro en el Festival de Cannes 2013, no el Premio del Jurado.")
        ),
        BilingualQuestion(
            id = 51186, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'The Tree of Life'?", listOf("Terrence Malick", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinéma", "Terrence Malick a réalisé 'The Tree of Life', sorti en 2011, un film philosophique et expérimental qui a remporté la Palme d'or à Cannes."),
            en = LocalizedContent("Which director directed 'The Tree of Life'?", listOf("Terrence Malick", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinema", "Terrence Malick directed 'The Tree of Life', released in 2011, a philosophical and experimental film that won the Palme d'Or at Cannes."),
            zh = LocalizedContent("哪位导演执导了《生命之树》？", listOf("泰伦斯·马力克", "大卫·芬奇", "克里斯托弗·诺兰", "斯派克·李"), "电影", "泰伦斯·马力克执导了2011年上映的《生命之树》，这是一部哲学性和实验性的电影，获得了戛纳金棕榈奖。"),
            es = LocalizedContent("¿Qué director dirigió 'The Tree of Life'?", listOf("Terrence Malick", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cine", "Terrence Malick dirigió 'The Tree of Life', estrenada en 2011, una película filosófica y experimental que ganó la Palma de Oro en Cannes.")
        ),
        BilingualQuestion(
            id = 51187, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Roman Polanski?", listOf("Rosemary's Baby", "The Tenant", "Macbeth", "Tous les trois"), "Cinéma", "Roman Polanski a réalisé trois films d'horreur majeurs : Le Locataire, Rosemary's Baby et Répulsion."),
            en = LocalizedContent("Which horror film was directed by Roman Polanski?", listOf("Rosemary's Baby", "The Tenant", "Macbeth", "All three"), "Cinema", "Roman Polanski directed three major horror films: The Tenant, Rosemary's Baby, and Repulsion."),
            zh = LocalizedContent("哪部恐怖片是由罗曼·波兰斯基执导的？", listOf("《罗斯玛丽的婴儿》", "《怪房客》", "《麦克白》", "以上全部"), "电影", "罗曼·波兰斯基执导了三部重要的恐怖片：《怪房客》、《罗斯玛丽的婴儿》和《冷血惊魂》。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Roman Polanski?", listOf("Rosemary's Baby", "The Tenant", "Macbeth", "Las tres"), "Cine", "Roman Polanski dirigió tres importantes películas de terror: The Tenant, Rosemary's Baby y Repulsion.")
        ),
        BilingualQuestion(
            id = 51188, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé la musique de 'The Shawshank Redemption'?", listOf("Thomas Newman", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinéma", "Thomas Newman, compositeur américain renommé, a signé la bande originale de ce film culte de 1994, marquée par son style minimaliste et émotionnel."),
            en = LocalizedContent("Who composed the music for 'The Shawshank Redemption'?", listOf("Thomas Newman", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinema", "Thomas Newman, a renowned American composer, scored the soundtrack for this 1994 cult film, marked by his minimalist and emotional style."),
            zh = LocalizedContent("谁为《肖申克的救赎》创作了音乐？", listOf("托马斯·纽曼", "汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内"), "电影", "著名美国作曲家托马斯·纽曼为这部1994年的经典电影创作了配乐，以其极简主义和情感风格著称。"),
            es = LocalizedContent("¿Quién compuso la música de 'The Shawshank Redemption'?", listOf("Thomas Newman", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cine", "Thomas Newman, un renombrado compositor estadounidense, creó la banda sonora de esta película de culto de 1994, caracterizada por su estilo minimalista y emocional.")
        ),
        BilingualQuestion(
            id = 51189, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film bolivien a remporté la Palme d'Or?", listOf("Aucun", "La teta asustada", "The Eternal Memory", "La Paz"), "Cinéma", "La teta asustada (Le lait du sommeil) de Claudia Llosa a reçu la Palme d'Or au Festival de Cannes en 2009, devenant le premier film bolivien à obtenir cette récompense."),
            en = LocalizedContent("Which Bolivian film won the Palme d'Or?", listOf("None", "The Milk of Sorrow", "The Eternal Memory", "La Paz"), "Cinema", "The Milk of Sorrow (La teta asustada) by Claudia Llosa won the Palme d'Or at the Cannes Film Festival in 2009, becoming the first Bolivian film to receive this award."),
            zh = LocalizedContent("哪部玻利维亚电影获得了金棕榈奖？", listOf("无", "伤心的奶水", "永恒的记忆", "拉巴斯"), "电影", "克劳迪娅·略萨执导的《伤心的奶水》在2009年戛纳电影节上获得金棕榈奖，成为首部获此殊荣的玻利维亚电影。"),
            es = LocalizedContent("¿Qué película boliviana ganó la Palma de Oro?", listOf("Ninguna", "La teta asustada", "The Eternal Memory", "La Paz"), "Cine", "La teta asustada de Claudia Llosa ganó la Palma de Oro en el Festival de Cannes de 2009, convirtiéndose en la primera película boliviana en recibir este galardón.")
        ),
        BilingualQuestion(
            id = 51190, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Moonlight'?", listOf("Barry Jenkins", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinéma", "Barry Jenkins a réalisé Moonlight, sorti en 2016, un drame sur l'identité et la sexualité qui a remporté l'Oscar du meilleur film."),
            en = LocalizedContent("Which director directed 'Moonlight'?", listOf("Barry Jenkins", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinema", "Barry Jenkins directed Moonlight, released in 2016, a drama about identity and sexuality that won the Oscar for Best Picture."),
            zh = LocalizedContent("哪位导演执导了《月光男孩》？", listOf("巴里·詹金斯", "大卫·芬奇", "克里斯托弗·诺兰", "斯派克·李"), "电影", "巴里·詹金斯执导了2016年上映的《月光男孩》，这是一部关于身份和性的剧情片，获得了奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Qué director dirigió 'Moonlight'?", listOf("Barry Jenkins", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cine", "Barry Jenkins dirigió Moonlight, estrenada en 2016, un drama sobre la identidad y la sexualidad que ganó el Oscar a la mejor película.")
        ),
        BilingualQuestion(
            id = 51191, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Hideo Nakata?", listOf("Ringu", "Dark Water", "Honogurai Mizu no Soko Kara", "Tous les trois"), "Cinéma", "Hideo Nakata a réalisé les versions japonaises originales de Ring, Ring 2 et Dark Water, trois films d'horreur emblématiques."),
            en = LocalizedContent("Which horror film was directed by Hideo Nakata?", listOf("Ringu", "Dark Water", "Honogurai Mizu no Soko Kara", "All three"), "Cinema", "Hideo Nakata directed the original Japanese versions of Ring, Ring 2, and Dark Water, three iconic horror films."),
            zh = LocalizedContent("哪部恐怖片是由中田秀夫执导的？", listOf("午夜凶铃", "鬼水怪谈", "从黑暗的水底", "以上全部"), "电影", "中田秀夫执导了日本原版《午夜凶铃》、《午夜凶铃2》和《鬼水怪谈》，这三部标志性的恐怖片。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Hideo Nakata?", listOf("Ringu", "Dark Water", "Honogurai Mizu no Soko Kara", "Las tres"), "Cine", "Hideo Nakata dirigió las versiones japonesas originales de Ring, Ring 2 y Dark Water, tres películas de terror emblemáticas.")
        ),
        BilingualQuestion(
            id = 51192, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'The Lion King'?", listOf("Elton John", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinéma", "Hans Zimmer a composé la bande originale du film d'animation 'The Lion King' (1994), une partition qui lui a valu l'Oscar de la meilleure musique de film."),
            en = LocalizedContent("Who composed the music for 'The Lion King'?", listOf("Elton John", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinema", "Hans Zimmer composed the score for the animated film 'The Lion King' (1994), a score that earned him the Oscar for Best Original Score."),
            zh = LocalizedContent("谁为《狮子王》创作了音乐？", listOf("埃尔顿·约翰", "汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内"), "电影", "汉斯·季默为动画电影《狮子王》（1994）创作了配乐，该配乐为他赢得了奥斯卡最佳原创配乐奖。"),
            es = LocalizedContent("¿Quién compuso la música de 'El Rey León'?", listOf("Elton John", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cine", "Hans Zimmer compuso la banda sonora de la película animada 'El Rey León' (1994), una partitura que le valió el Oscar a la mejor banda sonora original.")
        ),
        BilingualQuestion(
            id = 51193, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film nigérian a remporté le plus de récompenses?", listOf("Lionheart", "The Battle of Bwakemfuo", "Gangs of Lagos", "Any Body Can Dance"), "Cinéma", "Lionheart, réalisé par Genevieve Nnaji, est le film nigérian le plus primé, remportant plusieurs prix internationaux dont celui du meilleur film aux Africa Movie Academy Awards."),
            en = LocalizedContent("Which Nigerian film has won the most awards?", listOf("Lionheart", "The Battle of Bwakemfuo", "Gangs of Lagos", "Any Body Can Dance"), "Cinema", "Lionheart, directed by Genevieve Nnaji, is the most awarded Nigerian film, winning several international prizes including Best Film at the Africa Movie Academy Awards."),
            zh = LocalizedContent("哪部尼日利亚电影获奖最多？", listOf("狮心", "布瓦凯姆福之战", "拉各斯黑帮", "人人能舞"), "电影", "由吉纳维芙·恩纳吉执导的《狮心》是获奖最多的尼日利亚电影，赢得了多项国际奖项，包括非洲电影学院奖的最佳影片。"),
            es = LocalizedContent("¿Qué película nigeriana ha ganado más premios?", listOf("Lionheart", "The Battle of Bwakemfuo", "Gangs of Lagos", "Any Body Can Dance"), "Cine", "Lionheart, dirigida por Genevieve Nnaji, es la película nigeriana más premiada, ganando varios premios internacionales, incluido el de Mejor Película en los Africa Movie Academy Awards.")
        ),
        BilingualQuestion(
            id = 51194, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a réalisé 'La La Land'?", listOf("Damien Chazelle", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinéma", "Damien Chazelle a réalisé La La Land en 2016, un film musical qui a remporté six Oscars, dont celui du meilleur réalisateur, faisant de lui le plus jeune lauréat de cette catégorie à 32 ans."),
            en = LocalizedContent("Which director directed 'La La Land'?", listOf("Damien Chazelle", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinema", "Damien Chazelle directed La La Land in 2016, a musical film that won six Oscars, including Best Director, making him the youngest winner in that category at age 32."),
            zh = LocalizedContent("哪位导演执导了《爱乐之城》？", listOf("达米恩·查泽雷", "大卫·芬奇", "克里斯托弗·诺兰", "斯派克·李"), "电影", "达米恩·查泽雷在2016年执导了《爱乐之城》，这部音乐电影获得了六项奥斯卡奖，包括最佳导演，使他以32岁成为该类别最年轻的获奖者。"),
            es = LocalizedContent("¿Qué director dirigió 'La La Land'?", listOf("Damien Chazelle", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cine", "Damien Chazelle dirigió La La Land en 2016, una película musical que ganó seis Oscar, incluido el de Mejor Director, convirtiéndolo en el ganador más joven de esa categoría a los 32 años.")
        ),
        BilingualQuestion(
            id = 51195, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur de Takashi Miike a remporté le plus de récompenses?", listOf("Ichi the Killer", "Audition", "The Happiness of the Katakuris", "One Missed Call"), "Cinéma", "Audition de Takashi Miike a remporté plusieurs prix dans des festivals internationaux, notamment au Festival de Sitges et au Festival du film de Yokohama, pour son mélange dérangeant d'horreur psychologique et de violence."),
            en = LocalizedContent("Which horror film by Takashi Miike has won the most awards?", listOf("Ichi the Killer", "Audition", "The Happiness of the Katakuris", "One Missed Call"), "Cinema", "Takashi Miike's Audition won several awards at international festivals, including at Sitges and the Yokohama Film Festival, for its disturbing blend of psychological horror and violence."),
            zh = LocalizedContent("三池崇史执导的哪部恐怖片获奖最多？", listOf("杀手阿一", "切肤之爱", "片桐酒馆的快乐", "鬼来电"), "电影", "三池崇史的《切肤之爱》在国际电影节上获得了多项奖项，包括锡切斯电影节和横滨电影节，因其令人不安的心理恐怖与暴力融合而获奖。"),
            es = LocalizedContent("¿Qué película de terror de Takashi Miike ha ganado más premios?", listOf("Ichi the Killer", "Audition", "The Happiness of the Katakuris", "One Missed Call"), "Cine", "Audition de Takashi Miike ganó varios premios en festivales internacionales, incluidos el Festival de Sitges y el Festival de Cine de Yokohama, por su inquietante mezcla de terror psicológico y violencia.")
        ),
        BilingualQuestion(
            id = 51197, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film marocain a remporté le prix de la mise en scène à Cannes?", listOf("La Graine et le Mulet", "Horses of God", "Cheikh el Baldi", "Dernier train"), "Cinéma", "Le film La Graine et le Mulet, réalisé par Abdellatif Kechiche, a reçu le Prix de la mise en scène au Festival de Cannes en 2007."),
            en = LocalizedContent("Which Moroccan film won the Best Director award at Cannes?", listOf("The Secret of the Grain", "Horses of God", "Cheikh el Baldi", "Last Train"), "Cinema", "The film The Secret of the Grain, directed by Abdellatif Kechiche, received the Best Director award at the Cannes Film Festival in 2007."),
            zh = LocalizedContent("哪部摩洛哥电影在戛纳获得了最佳导演奖？", listOf("谷子与鲻鱼", "上帝之马", "谢赫·埃尔·巴尔迪", "最后一班火车"), "电影", "阿布戴·柯西胥执导的电影《谷子与鲻鱼》在2007年戛纳电影节上获得了最佳导演奖。"),
            es = LocalizedContent("¿Qué película marroquí ganó el premio a la mejor dirección en Cannes?", listOf("La graine et le mulet", "Horses of God", "Cheikh el Baldi", "Last Train"), "Cine", "La película La graine et le mulet, dirigida por Abdellatif Kechiche, recibió el premio a la mejor dirección en el Festival de Cannes de 2007.")
        ),
        BilingualQuestion(
            id = 51198, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Whiplash'?", listOf("Damien Chazelle", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinéma", "Damien Chazelle a réalisé Whiplash en 2014, un drame sur un batteur de jazz et son professeur tyrannique, qui lui a valu l'Oscar du meilleur montage."),
            en = LocalizedContent("Which director directed 'Whiplash'?", listOf("Damien Chazelle", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cinema", "Damien Chazelle directed Whiplash in 2014, a drama about a jazz drummer and his tyrannical teacher, which earned him the Oscar for Best Editing."),
            zh = LocalizedContent("哪位导演执导了《爆裂鼓手》？", listOf("达米恩·查泽雷", "大卫·芬奇", "克里斯托弗·诺兰", "斯派克·李"), "电影", "达米恩·查泽雷在2014年执导了《爆裂鼓手》，这是一部关于爵士鼓手和他专制老师的剧情片，为他赢得了奥斯卡最佳剪辑奖。"),
            es = LocalizedContent("¿Qué director dirigió 'Whiplash'?", listOf("Damien Chazelle", "David Fincher", "Christopher Nolan", "Spike Lee"), "Cine", "Damien Chazelle dirigió Whiplash en 2014, un drama sobre un baterista de jazz y su profesor tiránico, que le valió el Oscar al mejor montaje.")
        ),
        BilingualQuestion(
            id = 51199, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Caroll Ballard?", listOf("The Black Stallion", "Wind", "Never Cry Wolf", "Aucun de ces films"), "Cinéma", "Caroll Ballard est un réalisateur américain connu pour des films familiaux et animaliers comme L'Étalon noir et L'Enfant sauvage, et n'a jamais réalisé de film d'horreur."),
            en = LocalizedContent("Which horror film was directed by Carroll Ballard?", listOf("The Black Stallion", "Wind", "Never Cry Wolf", "None of these films"), "Cinema", "Carroll Ballard is an American director known for family and animal films like The Black Stallion and The Wild Child, and has never directed a horror film."),
            zh = LocalizedContent("哪部恐怖电影是由卡罗尔·巴拉德执导的？", listOf("黑神驹", "风", "狼踪", "以上都不是"), "电影", "卡罗尔·巴拉德是一位美国导演，以家庭和动物题材电影如《黑神驹》和《野孩子》而闻名，从未执导过恐怖片。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Carroll Ballard?", listOf("The Black Stallion", "Wind", "Never Cry Wolf", "Ninguna de estas películas"), "Cine", "Carroll Ballard es un director estadounidense conocido por películas familiares y de animales como El corcel negro y El niño salvaje, y nunca ha dirigido una película de terror.")
        ),
        BilingualQuestion(
            id = 51200, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé la musique de 'Dune'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cinéma", "Hans Zimmer a composé la musique de l'adaptation de 2021 réalisée par Denis Villeneuve, marquant son retour à la science-fiction épique après des années."),
            en = LocalizedContent("Who composed the music for 'Dune'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cinema", "Hans Zimmer composed the music for the 2021 adaptation directed by Denis Villeneuve, marking his return to epic science fiction after years."),
            zh = LocalizedContent("谁为《沙丘》创作了音乐？", listOf("汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内", "杰里·戈德史密斯"), "电影", "汉斯·季默为丹尼斯·维伦纽瓦执导的2021年改编版创作了音乐，标志着他多年后重返史诗科幻领域。"),
            es = LocalizedContent("¿Quién compuso la música de 'Dune'?", listOf("Hans Zimmer", "John Williams", "Ennio Morricone", "Jerry Goldsmith"), "Cine", "Hans Zimmer compuso la música para la adaptación de 2021 dirigida por Denis Villeneuve, marcando su regreso a la ciencia ficción épica después de años.")
        ),
        BilingualQuestion(
            id = 51201, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel producteur a produit l'album 'Thriller' de Michael Jackson?", listOf("Quincy Jones", "Jimmy Jam", "Terry Lewis", "David Foster"), "Musique", "Quincy Jones a produit l'album 'Thriller' de Michael Jackson, sorti en 1982, devenant l'album le plus vendu de tous les temps."),
            en = LocalizedContent("Which producer produced Michael Jackson's album 'Thriller'?", listOf("Quincy Jones", "Jimmy Jam", "Terry Lewis", "David Foster"), "Music", "Quincy Jones produced Michael Jackson's album 'Thriller', released in 1982, becoming the best-selling album of all time."),
            zh = LocalizedContent("哪位制作人制作了迈克尔·杰克逊的专辑《Thriller》？", listOf("昆西·琼斯", "吉米·詹", "特里·刘易斯", "大卫·福斯特"), "音乐", "昆西·琼斯制作了迈克尔·杰克逊1982年发行的专辑《Thriller》，该专辑成为有史以来最畅销的专辑。"),
            es = LocalizedContent("¿Qué productor produjo el álbum 'Thriller' de Michael Jackson?", listOf("Quincy Jones", "Jimmy Jam", "Terry Lewis", "David Foster"), "Música", "Quincy Jones produjo el álbum 'Thriller' de Michael Jackson, lanzado en 1982, convirtiéndose en el álbum más vendido de todos los tiempos.")
        ),
        BilingualQuestion(
            id = 51202, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste a enregistré 'Like a Virgin'?", listOf("Madonna", "Britney Spears", "Janet Jackson", "Prince"), "Musique", "Madonna a sorti 'Like a Virgin' en 1984 sur son deuxième album du même nom. La chanson est devenue un immense succès international, propulsant sa carrière."),
            en = LocalizedContent("Which artist recorded 'Like a Virgin'?", listOf("Madonna", "Britney Spears", "Janet Jackson", "Prince"), "Music", "Madonna released 'Like a Virgin' in 1984 on her second album of the same name. The song became a huge international success, propelling her career."),
            zh = LocalizedContent("哪位艺术家录制了《Like a Virgin》？", listOf("麦当娜", "布兰妮·斯皮尔斯", "珍妮·杰克逊", "王子"), "音乐", "麦当娜于1984年在其同名第二张专辑中发行了《Like a Virgin》。这首歌取得了巨大的国际成功，推动了她的职业生涯。"),
            es = LocalizedContent("¿Qué artista grabó 'Like a Virgin'?", listOf("Madonna", "Britney Spears", "Janet Jackson", "Prince"), "Música", "Madonna lanzó 'Like a Virgin' en 1984 en su segundo álbum del mismo nombre. La canción se convirtió en un gran éxito internacional, impulsando su carrera.")
        ),
        BilingualQuestion(
            id = 51203, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album des Beatles a été le plus vendu?", listOf("Abbey Road", "Sgt. Pepper", "Let It Be", "Help!"), "Musique", "Sgt. Pepper's Lonely Hearts Club Band, sorti en 1967, est souvent cité comme l'album des Beatles le plus vendu, avec environ 32 millions d'exemplaires écoulés dans le monde."),
            en = LocalizedContent("Which Beatles album was the best-selling?", listOf("Abbey Road", "Sgt. Pepper", "Let It Be", "Help!"), "Music", "Sgt. Pepper's Lonely Hearts Club Band, released in 1967, is often cited as the best-selling Beatles album, with around 32 million copies sold worldwide."),
            zh = LocalizedContent("披头士哪张专辑销量最高？", listOf("艾比路", "佩珀军士", "顺其自然", "救命！"), "音乐", "1967年发行的《佩珀军士的孤独之心俱乐部乐队》常被认为是披头士最畅销的专辑，全球销量约3200万张。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de los Beatles?", listOf("Abbey Road", "Sgt. Pepper", "Let It Be", "Help!"), "Música", "Sgt. Pepper's Lonely Hearts Club Band, lanzado en 1967, es a menudo citado como el álbum más vendido de los Beatles, con alrededor de 32 millones de copias vendidas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 51204, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus célèbre?", listOf("Mambo No. 5", "Ice Ice Baby", "Fade Away", "Kook"), "Musique", "Ice Ice Baby de Vanilla Ice, sorti en 1990, fut le premier single de rap à atteindre la première place du Billboard Hot 100, mais l'artiste n'a jamais réussi à égaler ce succès par la suite."),
            en = LocalizedContent("What is the most famous 'one-hit wonder' single?", listOf("Mambo No. 5", "Ice Ice Baby", "Fade Away", "Kook"), "Music", "Ice Ice Baby by Vanilla Ice, released in 1990, was the first rap single to reach number one on the Billboard Hot 100, but the artist never matched that success again."),
            zh = LocalizedContent("最著名的“一曲成名”单曲是什么？", listOf("曼波五号", "冰冰宝贝", "消失", "库克"), "音乐", "香草冰于1990年发行的《冰冰宝贝》是第一首登上公告牌百强单曲榜榜首的说唱单曲，但该艺人此后未能再创佳绩。"),
            es = LocalizedContent("¿Cuál es el sencillo 'one-hit wonder' más famoso?", listOf("Mambo No. 5", "Ice Ice Baby", "Fade Away", "Kook"), "Música", "Ice Ice Baby de Vanilla Ice, lanzado en 1990, fue el primer sencillo de rap en alcanzar el número uno en el Billboard Hot 100, pero el artista nunca volvió a igualar ese éxito.")
        ),
        BilingualQuestion(
            id = 51205, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel instrument est principalement utilisé dans la musique indienne?", listOf("Sitar", "Veena", "Tabla", "Tanpura"), "Musique", "Le sitar est un instrument à cordes pincées emblématique de la musique classique indienne, notamment associé au raga."),
            en = LocalizedContent("Which instrument is primarily used in Indian music?", listOf("Sitar", "Veena", "Tabla", "Tanpura"), "Music", "The sitar is an iconic plucked string instrument of Indian classical music, especially associated with raga."),
            zh = LocalizedContent("印度音乐中主要使用哪种乐器？", listOf("西塔琴", "维纳琴", "塔布拉鼓", "坦布拉琴"), "音乐", "西塔琴是印度古典音乐中标志性的拨弦乐器，尤其与拉格相关。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en la música india?", listOf("Sitar", "Veena", "Tabla", "Tanpura"), "Música", "El sitar es un instrumento de cuerda pulsada emblemático de la música clásica india, especialmente asociado con el raga.")
        ),
        BilingualQuestion(
            id = 51206, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Pink Floyd est le plus vendu?", listOf("The Wall", "The Dark Side of the Moon", "Wish You Were Here", "Animals"), "Musique", "The Wall s'est vendu à plus de 30 millions d'exemplaires dans le monde, dépassant The Dark Side of the Moon, qui en compte environ 25 millions."),
            en = LocalizedContent("Which Pink Floyd album is the best-selling?", listOf("The Wall", "The Dark Side of the Moon", "Wish You Were Here", "Animals"), "Music", "The Wall has sold over 30 million copies worldwide, surpassing The Dark Side of the Moon, which has sold about 25 million."),
            zh = LocalizedContent("平克·弗洛伊德哪张专辑销量最高？", listOf("迷墙", "月之暗面", "愿你在此", "动物"), "音乐", "《迷墙》全球销量超过3000万张，超过了销量约2500万张的《月之暗面》。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de Pink Floyd?", listOf("The Wall", "The Dark Side of the Moon", "Wish You Were Here", "Animals"), "Música", "The Wall ha vendido más de 30 millones de copias en todo el mundo, superando a The Dark Side of the Moon, que ha vendido alrededor de 25 millones.")
        ),
        BilingualQuestion(
            id = 51207, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste a vendu le plus de disques au monde?", listOf("Michael Jackson", "The Beatles", "Elvis Presley", "Eminem"), "Musique", "Michael Jackson est reconnu comme l'artiste solo ayant vendu le plus de disques, avec des estimations dépassant les 400 millions d'unités dans le monde, grâce à des albums comme Thriller."),
            en = LocalizedContent("Which artist has sold the most records worldwide?", listOf("Michael Jackson", "The Beatles", "Elvis Presley", "Eminem"), "Music", "Michael Jackson is recognized as the best-selling solo artist, with estimates exceeding 400 million units worldwide, thanks to albums like Thriller."),
            zh = LocalizedContent("哪位艺术家在全球唱片销量最高？", listOf("迈克尔·杰克逊", "披头士", "埃尔维斯·普雷斯利", "埃米纳姆"), "音乐", "迈克尔·杰克逊被公认为最畅销的独唱艺人，全球销量估计超过4亿张，这得益于《Thriller》等专辑。"),
            es = LocalizedContent("¿Qué artista ha vendido más discos en todo el mundo?", listOf("Michael Jackson", "The Beatles", "Elvis Presley", "Eminem"), "Música", "Michael Jackson es reconocido como el artista solista más vendido, con estimaciones que superan los 400 millones de unidades en todo el mundo, gracias a álbumes como Thriller.")
        ),
        BilingualQuestion(
            id = 51209, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre single 'one-hit wonder' de 2000s?", listOf("Crazy Frog", "Leroy Jenkins", "Charlie Bit My Finger", "Harlem Shake"), "Musique", "La reprise techno de \"Axel F\" par Crazy Frog, sortie en 2005, a connu un succès planétaire mais le groupe n'a jamais réitéré une telle performance."),
            en = LocalizedContent("What is the most famous 'one-hit wonder' single of the 2000s?", listOf("Crazy Frog", "Leroy Jenkins", "Charlie Bit My Finger", "Harlem Shake"), "Music", "The techno cover of 'Axel F' by Crazy Frog, released in 2005, achieved worldwide success but the group never repeated such a performance."),
            zh = LocalizedContent("2000年代最著名的“一曲成名”单曲是什么？", listOf("疯狂青蛙", "勒罗伊·詹金斯", "查理咬我的手指", "哈莱姆摇摆舞"), "音乐", "疯狂青蛙于2005年发行的《Axel F》电子混音版取得了全球成功，但该组合此后未能再现这样的成绩。"),
            es = LocalizedContent("¿Cuál es el sencillo 'one-hit wonder' más famoso de los 2000?", listOf("Crazy Frog", "Leroy Jenkins", "Charlie Bit My Finger", "Harlem Shake"), "Música", "La versión techno de 'Axel F' de Crazy Frog, lanzada en 2005, logró un éxito mundial, pero el grupo nunca repitió tal actuación.")
        ),
        BilingualQuestion(
            id = 51210, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Australie?", listOf("Didgeridoo", "Boomerang", "Koala", "Aucun"), "Musique", "Le didgeridoo est un instrument à vent traditionnel des Aborigènes d'Australie, fabriqué à partir de branches d'eucalyptus creusées par les termites."),
            en = LocalizedContent("Which instrument is primarily used in Australia?", listOf("Didgeridoo", "Boomerang", "Koala", "None"), "Music", "The didgeridoo is a traditional wind instrument of the Aboriginal people of Australia, made from eucalyptus branches hollowed out by termites."),
            zh = LocalizedContent("哪种乐器主要在澳大利亚使用？", listOf("迪吉里杜管", "回旋镖", "考拉", "无"), "音乐", "迪吉里杜管是澳大利亚原住民的传统管乐器，由白蚁挖空的桉树枝制成。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Australia?", listOf("Didgeridoo", "Bumerán", "Koala", "Ninguno"), "Música", "El didgeridoo es un instrumento de viento tradicional de los aborígenes australianos, fabricado a partir de ramas de eucalipto ahuecadas por termitas.")
        ),
        BilingualQuestion(
            id = 51211, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de David Bowie est le plus vendu?", listOf("Ziggy Stardust", "Aladdin Sane", "Station to Station", "Let's Dance"), "Musique", "Sorti en 1983, Let's Dance est l'album le plus vendu de David Bowie, porté par des tubes comme le titre éponyme et China Girl."),
            en = LocalizedContent("Which David Bowie album is the best-selling?", listOf("Ziggy Stardust", "Aladdin Sane", "Station to Station", "Let's Dance"), "Music", "Released in 1983, Let's Dance is David Bowie's best-selling album, driven by hits like the title track and China Girl."),
            zh = LocalizedContent("大卫·鲍伊哪张专辑销量最高？", listOf("齐格·星尘", "阿拉丁·萨内", "站台到站台", "让我们跳舞"), "音乐", "1983年发行的《让我们跳舞》是大卫·鲍伊最畅销的专辑，由同名主打歌和《中国女孩》等热门歌曲推动。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de David Bowie?", listOf("Ziggy Stardust", "Aladdin Sane", "Station to Station", "Let's Dance"), "Música", "Lanzado en 1983, Let's Dance es el álbum más vendido de David Bowie, impulsado por éxitos como la canción homónima y China Girl.")
        ),
        BilingualQuestion(
            id = 51212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le prix Grammy le plus prestigieux?", listOf("Album de l'Année", "Record de l'Année", "Chanson de l'Année", "Artiste Émergent"), "Musique", "L'Album de l'Année est considéré comme le prix le plus prestigieux des Grammy Awards car il récompense l'ensemble d'un projet musical, incluant la performance, la production et l'impact artistique global."),
            en = LocalizedContent("Which Grammy award is the most prestigious?", listOf("Album of the Year", "Record of the Year", "Song of the Year", "Best New Artist"), "Music", "Album of the Year is considered the most prestigious Grammy award as it recognizes an entire musical project, including performance, production, and overall artistic impact."),
            zh = LocalizedContent("哪个格莱美奖最负盛名？", listOf("年度专辑", "年度制作", "年度歌曲", "最佳新人"), "音乐", "年度专辑奖被认为是格莱美最负盛名的奖项，因为它表彰整个音乐项目，包括表演、制作和整体艺术影响力。"),
            es = LocalizedContent("¿Cuál es el premio Grammy más prestigioso?", listOf("Álbum del Año", "Grabación del Año", "Canción del Año", "Mejor Artista Nuevo"), "Música", "Álbum del Año es considerado el premio Grammy más prestigioso porque reconoce un proyecto musical completo, incluyendo interpretación, producción e impacto artístico general.")
        ),
        BilingualQuestion(
            id = 51213, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus ancien?", listOf("Mambo No. 5", "Barbie Girl", "Wannabe", "Mickey"), "Musique", "Mickey, sorti en 1982 par Toni Basil, est souvent considéré comme l'un des premiers one-hit wonders marquants de l'ère MTV, atteignant la première place du Billboard Hot 100 sans autre succès majeur."),
            en = LocalizedContent("Which is the oldest 'one-hit wonder' single?", listOf("Mambo No. 5", "Barbie Girl", "Wannabe", "Mickey"), "Music", "Mickey, released in 1982 by Toni Basil, is often considered one of the earliest notable one-hit wonders of the MTV era, reaching number one on the Billboard Hot 100 without any other major success."),
            zh = LocalizedContent("哪首单曲是最古老的“一曲成名”？", listOf("曼波五号", "芭比女孩", "想要", "米奇"), "音乐", "1982年由托尼·巴兹尔发行的《米奇》通常被认为是MTV时代最早引人注目的一曲成名之一，登顶公告牌百强单曲榜，但再无其他重大成功。"),
            es = LocalizedContent("¿Cuál es el sencillo 'one-hit wonder' más antiguo?", listOf("Mambo No. 5", "Barbie Girl", "Wannabe", "Mickey"), "Música", "Mickey, lanzado en 1982 por Toni Basil, a menudo se considera uno de los primeros one-hit wonders notables de la era MTV, alcanzando el número uno en el Billboard Hot 100 sin otro éxito importante.")
        ),
        BilingualQuestion(
            id = 51214, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Irlande?", listOf("Tin Whistle", "Bodhrán", "Accordion", "Uilleann Pipes"), "Musique", "Le tin whistle, aussi appelé flûte irlandaise, est un instrument à vent simple et emblématique de la musique traditionnelle irlandaise, souvent utilisé dans les sessions folk."),
            en = LocalizedContent("Which instrument is primarily used in Ireland?", listOf("Tin Whistle", "Bodhrán", "Accordion", "Uilleann Pipes"), "Music", "The tin whistle, also called the Irish flute, is a simple wind instrument emblematic of traditional Irish music, often used in folk sessions."),
            zh = LocalizedContent("哪种乐器主要在爱尔兰使用？", listOf("锡笛", "博德兰鼓", "手风琴", "尤利安管"), "音乐", "锡笛，又称爱尔兰笛，是一种简单的管乐器，是爱尔兰传统音乐的象征，常用于民间音乐聚会。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Irlanda?", listOf("Tin Whistle", "Bodhrán", "Acordeón", "Uilleann Pipes"), "Música", "El tin whistle, también llamado flauta irlandesa, es un instrumento de viento simple emblemático de la música tradicional irlandesa, a menudo utilizado en sesiones folclóricas.")
        ),
        BilingualQuestion(
            id = 51215, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Queen est le plus vendu?", listOf("Bohemian Rhapsody", "A Night at the Opera", "The Game", "Jazz"), "Musique", "A Night at the Opera, sorti en 1975, est l'album le plus vendu de Queen, porté par le succès planétaire de Bohemian Rhapsody."),
            en = LocalizedContent("Which Queen album is the best-selling?", listOf("Bohemian Rhapsody", "A Night at the Opera", "The Game", "Jazz"), "Music", "A Night at the Opera, released in 1975, is Queen's best-selling album, driven by the global success of Bohemian Rhapsody."),
            zh = LocalizedContent("皇后乐队哪张专辑销量最高？", listOf("波西米亚狂想曲", "歌剧之夜", "游戏", "爵士"), "音乐", "1975年发行的《歌剧之夜》是皇后乐队最畅销的专辑，由《波西米亚狂想曲》的全球成功推动。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de Queen?", listOf("Bohemian Rhapsody", "A Night at the Opera", "The Game", "Jazz"), "Música", "A Night at the Opera, lanzado en 1975, es el álbum más vendido de Queen, impulsado por el éxito mundial de Bohemian Rhapsody.")
        ),
        BilingualQuestion(
            id = 51216, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le prix Grammy le plus remporté par un seul artiste?", listOf("32", "62", "86", "92"), "Musique", "Le chef d'orchestre Georg Solti détient le record avec 31 Grammy Awards, mais le chiffre 86 correspond au nombre total de nominations de Beyoncé, l'artiste la plus nommée de l'histoire des Grammy."),
            en = LocalizedContent("Which Grammy award has been won the most by a single artist?", listOf("32", "62", "86", "92"), "Music", "Conductor Georg Solti holds the record with 31 Grammy Awards, but the number 86 corresponds to Beyoncé's total nominations, making her the most nominated artist in Grammy history."),
            zh = LocalizedContent("哪位艺术家获得格莱美奖次数最多？", listOf("32", "62", "86", "92"), "音乐", "指挥家乔治·索尔蒂以31项格莱美奖保持纪录，但数字86对应碧昂丝的总提名次数，使她成为格莱美历史上提名最多的艺术家。"),
            es = LocalizedContent("¿Cuál es el premio Grammy más ganado por un solo artista?", listOf("32", "62", "86", "92"), "Música", "El director de orquesta Georg Solti tiene el récord con 31 premios Grammy, pero el número 86 corresponde al total de nominaciones de Beyoncé, la artista más nominada en la historia de los Grammy.")
        ),
        BilingualQuestion(
            id = 51217, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus dansant?", listOf("Barbie Girl", "Mambo No. 5", "Eurodance", "Techno"), "Musique", "Barbie Girl du groupe danois Aqua est devenu un phénomène mondial en 1997 grâce à son rythme entraînant et son refrain pop, mais le groupe n'a pas réussi à reproduire ce succès à l'international."),
            en = LocalizedContent("Which is the most danceable 'one-hit wonder' single?", listOf("Barbie Girl", "Mambo No. 5", "Eurodance", "Techno"), "Music", "Barbie Girl by the Danish group Aqua became a global phenomenon in 1997 thanks to its catchy rhythm and pop chorus, but the group failed to replicate this success internationally."),
            zh = LocalizedContent("哪首单曲是最适合跳舞的“一曲成名”？", listOf("芭比女孩", "曼波五号", "欧陆舞曲", "科技舞曲"), "音乐", "丹麦组合水叮当的《芭比女孩》在1997年凭借其朗朗上口的节奏和流行副歌成为全球现象，但该组合未能在国际上复制这一成功。"),
            es = LocalizedContent("¿Cuál es el sencillo 'one-hit wonder' más bailable?", listOf("Barbie Girl", "Mambo No. 5", "Eurodance", "Techno"), "Música", "Barbie Girl del grupo danés Aqua se convirtió en un fenómeno mundial en 1997 gracias a su ritmo pegadizo y estribillo pop, pero el grupo no logró replicar este éxito a nivel internacional.")
        ),
        BilingualQuestion(
            id = 51218, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est utilisé principalement au Japon?", listOf("Shamisen", "Koto", "Shakuhachi", "Biwa"), "Musique", "Le shamisen est un instrument à cordes pincées traditionnel japonais, dérivé du sanxian chinois, et joué dans des genres comme le min'yō et le kabuki."),
            en = LocalizedContent("Which instrument is primarily used in Japan?", listOf("Shamisen", "Koto", "Shakuhachi", "Biwa"), "Music", "The shamisen is a traditional Japanese plucked string instrument, derived from the Chinese sanxian, and played in genres such as min'yō and kabuki."),
            zh = LocalizedContent("哪种乐器主要在日本使用？", listOf("三味线", "古筝", "尺八", "琵琶"), "音乐", "三味线是一种传统的日本拨弦乐器，源自中国的三弦，用于民谣和歌舞伎等流派。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Japón?", listOf("Shamisen", "Koto", "Shakuhachi", "Biwa"), "Música", "El shamisen es un instrumento de cuerda pulsada tradicional japonés, derivado del sanxian chino, y se toca en géneros como el min'yō y el kabuki.")
        ),
        BilingualQuestion(
            id = 51219, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de The Rolling Stones est le plus vendu?", listOf("Sticky Fingers", "Exile on Main St.", "Some Girls", "Let It Bleed"), "Musique", "Some Girls, sorti en 1978, est l'album le plus vendu des Rolling Stones avec environ 8 millions d'exemplaires écoulés dans le monde, porté par les tubes Miss You et Beast of Burden."),
            en = LocalizedContent("Which The Rolling Stones album is the best-selling?", listOf("Sticky Fingers", "Exile on Main St.", "Some Girls", "Let It Bleed"), "Music", "Some Girls, released in 1978, is the best-selling album of The Rolling Stones with about 8 million copies sold worldwide, driven by the hits Miss You and Beast of Burden."),
            zh = LocalizedContent("滚石乐队哪张专辑销量最高？", listOf("粘手指", "主街流亡", "一些女孩", "让它流血"), "音乐", "1978年发行的《一些女孩》是滚石乐队最畅销的专辑，全球销量约800万张，由热门歌曲《想你》和《负重之兽》推动。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de The Rolling Stones?", listOf("Sticky Fingers", "Exile on Main St.", "Some Girls", "Let It Bleed"), "Música", "Some Girls, lanzado en 1978, es el álbum más vendido de The Rolling Stones con aproximadamente 8 millones de copias vendidas en todo el mundo, impulsado por los éxitos Miss You y Beast of Burden.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51220, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le chanteur avec le plus de nominations Grammy?", listOf("Beyoncé", "Quincy Jones", "Georg Solti", "Alison Krauss"), "Musique", "Beyoncé détient le record du plus grand nombre de nominations aux Grammy Awards, avec 99 nominations au total, dépassant ainsi son mari Jay-Z."),
            en = LocalizedContent("Which artist has the most Grammy nominations?", listOf("Beyoncé", "Quincy Jones", "Georg Solti", "Alison Krauss"), "Music", "Beyoncé holds the record for the most Grammy nominations, with 99 total nominations, surpassing her husband Jay-Z."),
            zh = LocalizedContent("哪位艺人获得的格莱美提名最多？", listOf("碧昂丝", "昆西·琼斯", "乔治·索尔蒂", "艾莉森·克劳斯"), "音乐", "碧昂丝保持着格莱美提名最多的纪录，共获得99项提名，超过了她的丈夫Jay-Z。"),
            es = LocalizedContent("¿Qué artista tiene más nominaciones a los Grammy?", listOf("Beyoncé", "Quincy Jones", "Georg Solti", "Alison Krauss"), "Música", "Beyoncé tiene el récord de más nominaciones a los Grammy, con 99 nominaciones en total, superando a su esposo Jay-Z.")
        ),
        BilingualQuestion(
            id = 51221, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus addictif?", listOf("Gangnam Style", "Harlem Shake", "What Does the Fox Say", "Happy"), "Musique", "Gangnam Style du chanteur sud-coréen Psy est devenu un phénomène viral mondial en 2012, connu pour sa mélodie entraînante et sa danse iconique. Il reste son seul single majeur à avoir atteint un succès international massif."),
            en = LocalizedContent("What is the most addictive one-hit wonder single?", listOf("Gangnam Style", "Harlem Shake", "What Does the Fox Say", "Happy"), "Music", "Gangnam Style by South Korean singer Psy became a global viral phenomenon in 2012, known for its catchy melody and iconic dance. It remains his only major single to achieve massive international success."),
            zh = LocalizedContent("哪首单曲是最令人上瘾的“一曲成名”作品？", listOf("江南Style", "哈林摇", "狐狸叫", "快乐"), "音乐", "韩国歌手Psy的《江南Style》在2012年成为全球病毒式现象，以其朗朗上口的旋律和标志性舞蹈而闻名。这是他唯一一首取得巨大国际成功的单曲。"),
            es = LocalizedContent("¿Cuál es el sencillo de one-hit wonder más adictivo?", listOf("Gangnam Style", "Harlem Shake", "What Does the Fox Say", "Happy"), "Música", "Gangnam Style del cantante surcoreano Psy se convirtió en un fenómeno viral mundial en 2012, conocido por su melodía pegadiza y su baile icónico. Sigue siendo su único sencillo importante que alcanzó un éxito internacional masivo.")
        ),
        BilingualQuestion(
            id = 51222, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Afrique?", listOf("Tam-tam", "Djembe", "Talking Drum", "Balafon"), "Musique", "Le tam-tam est un instrument de percussion emblématique des musiques traditionnelles africaines, utilisé pour les cérémonies et les communications."),
            en = LocalizedContent("Which instrument is primarily used in Africa?", listOf("Tam-tam", "Djembe", "Talking Drum", "Balafon"), "Music", "The tam-tam is an emblematic percussion instrument of traditional African music, used for ceremonies and communications."),
            zh = LocalizedContent("哪种乐器主要在非洲使用？", listOf("铜锣", "金贝鼓", "说话鼓", "巴拉风"), "音乐", "铜锣是非洲传统音乐中标志性的打击乐器，用于仪式和通讯。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en África?", listOf("Tam-tam", "Djembe", "Talking Drum", "Balafón"), "Música", "El tam-tam es un instrumento de percusión emblemático de las músicas tradicionales africanas, utilizado para ceremonias y comunicaciones.")
        ),
        BilingualQuestion(
            id = 51223, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Fleetwood Mac est le plus vendu?", listOf("Fleetwood Mac", "Rumours", "Mirage", "Tango in the Night"), "Musique", "Sorti en 1977, Rumours s'est vendu à plus de 40 millions d'exemplaires dans le monde, porté par des tubes comme \"Go Your Own Way\" et \"Dreams\"."),
            en = LocalizedContent("Which Fleetwood Mac album is the best-selling?", listOf("Fleetwood Mac", "Rumours", "Mirage", "Tango in the Night"), "Music", "Released in 1977, Rumours has sold over 40 million copies worldwide, driven by hits like \"Go Your Own Way\" and \"Dreams\"."),
            zh = LocalizedContent("弗利特伍德·麦克的哪张专辑销量最高？", listOf("弗利特伍德·麦克", "谣言", "幻景", "夜之探戈"), "音乐", "1977年发行的《谣言》在全球销量超过4000万张，由《走自己的路》和《梦想》等热门歌曲推动。"),
            es = LocalizedContent("¿Qué álbum de Fleetwood Mac es el más vendido?", listOf("Fleetwood Mac", "Rumours", "Mirage", "Tango in the Night"), "Música", "Lanzado en 1977, Rumours ha vendido más de 40 millones de copias en todo el mundo, impulsado por éxitos como \"Go Your Own Way\" y \"Dreams\".")
        ),
        BilingualQuestion(
            id = 51224, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le chanteur avec le plus d'albums vendus?", listOf("Michael Jackson", "Elvis Presley", "The Beatles", "Eminem"), "Musique", "Michael Jackson est reconnu comme l'artiste solo ayant vendu le plus d'albums dans l'histoire de la musique, avec des estimations dépassant les 400 millions d'exemplaires dans le monde."),
            en = LocalizedContent("Which singer has sold the most albums?", listOf("Michael Jackson", "Elvis Presley", "The Beatles", "Eminem"), "Music", "Michael Jackson is recognized as the solo artist with the most album sales in music history, with estimates exceeding 400 million copies worldwide."),
            zh = LocalizedContent("哪位歌手的专辑销量最高？", listOf("迈克尔·杰克逊", "埃尔维斯·普雷斯利", "披头士", "埃米纳姆"), "音乐", "迈克尔·杰克逊被公认为音乐史上专辑销量最高的独唱艺人，全球销量估计超过4亿张。"),
            es = LocalizedContent("¿Qué cantante ha vendido más álbumes?", listOf("Michael Jackson", "Elvis Presley", "The Beatles", "Eminem"), "Música", "Michael Jackson es reconocido como el artista solista con más ventas de álbumes en la historia de la música, con estimaciones que superan los 400 millones de copias en todo el mundo.")
        ),
        BilingualQuestion(
            id = 51225, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' avec le plus d'humour?", listOf("What Does the Fox Say", "My Humps", "I Like Big Butts", "Lick It"), "Musique", "Le duo norvégien Ylvis a créé ce titre humoristique en 2013, imitant les cris d'animaux dans une parodie virale devenue un phénomène mondial."),
            en = LocalizedContent("What is the funniest one-hit wonder single?", listOf("What Does the Fox Say", "My Humps", "I Like Big Butts", "Lick It"), "Music", "The Norwegian duo Ylvis created this humorous track in 2013, imitating animal sounds in a viral parody that became a global phenomenon."),
            zh = LocalizedContent("哪首单曲是最有趣的“一曲成名”作品？", listOf("狐狸叫", "我的驼峰", "我喜欢大屁股", "舔它"), "音乐", "挪威二人组Ylvis在2013年创作了这首幽默歌曲，模仿动物叫声，成为全球病毒式现象。"),
            es = LocalizedContent("¿Cuál es el sencillo de one-hit wonder más divertido?", listOf("What Does the Fox Say", "My Humps", "I Like Big Butts", "Lick It"), "Música", "El dúo noruego Ylvis creó este tema humorístico en 2013, imitando sonidos de animales en una parodia viral que se convirtió en un fenómeno mundial.")
        ),
        BilingualQuestion(
            id = 51226, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Thaïlande?", listOf("Khim", "Ranat", "Khong", "Piphat"), "Musique", "Le khim est un instrument à cordes frappées, similaire au dulcimer, utilisé dans la musique traditionnelle thaïlandaise."),
            en = LocalizedContent("Which instrument is primarily used in Thailand?", listOf("Khim", "Ranat", "Khong", "Piphat"), "Music", "The khim is a struck string instrument, similar to the dulcimer, used in traditional Thai music."),
            zh = LocalizedContent("哪种乐器主要在泰国使用？", listOf("钦", "拉纳特", "孔", "皮帕特"), "音乐", "钦是一种击弦乐器，类似于扬琴，用于泰国传统音乐。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Tailandia?", listOf("Khim", "Ranat", "Khong", "Piphat"), "Música", "El khim es un instrumento de cuerda percutida, similar al dulcémele, utilizado en la música tradicional tailandesa.")
        ),
        BilingualQuestion(
            id = 51227, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de U2 est le plus vendu?", listOf("Joshua Tree", "Achtung Baby", "War", "The Unforgettable Fire"), "Musique", "L'album The Joshua Tree, sorti en 1987, a remporté un succès mondial avec des titres comme With or Without You et I Still Haven't Found What I'm Looking For, dépassant les 25 millions d'exemplaires vendus."),
            en = LocalizedContent("Which U2 album is the best-selling?", listOf("Joshua Tree", "Achtung Baby", "War", "The Unforgettable Fire"), "Music", "The album The Joshua Tree, released in 1987, achieved worldwide success with tracks like With or Without You and I Still Haven't Found What I'm Looking For, selling over 25 million copies."),
            zh = LocalizedContent("U2的哪张专辑销量最高？", listOf("约书亚树", "注意宝贝", "战争", "难忘之火"), "音乐", "1987年发行的专辑《约书亚树》凭借《有或没有你》和《我仍未找到我所寻找的》等歌曲取得全球成功，销量超过2500万张。"),
            es = LocalizedContent("¿Qué álbum de U2 es el más vendido?", listOf("Joshua Tree", "Achtung Baby", "War", "The Unforgettable Fire"), "Música", "El álbum The Joshua Tree, lanzado en 1987, logró un éxito mundial con temas como With or Without You e I Still Haven't Found What I'm Looking For, vendiendo más de 25 millones de copias.")
        ),
        BilingualQuestion(
            id = 51228, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le musicien classique avec le plus d'enregistrements?", listOf("Arthur Rubinstein", "Vladimir Horowitz", "Isaac Stern", "Jascha Heifetz"), "Musique", "Arthur Rubinstein, pianiste polono-américain, a enregistré une vaste discographie couvrant près de soixante-dix ans de carrière, incluant des intégrales de Chopin et des concertos de Beethoven."),
            en = LocalizedContent("Which classical musician has the most recordings?", listOf("Arthur Rubinstein", "Vladimir Horowitz", "Isaac Stern", "Jascha Heifetz"), "Music", "Arthur Rubinstein, a Polish-American pianist, recorded a vast discography spanning nearly seventy years of his career, including complete works of Chopin and Beethoven concertos."),
            zh = LocalizedContent("哪位古典音乐家的录音最多？", listOf("阿图尔·鲁宾斯坦", "弗拉基米尔·霍洛维茨", "艾萨克·斯特恩", "亚沙·海菲兹"), "音乐", "波兰裔美国钢琴家阿图尔·鲁宾斯坦录制了涵盖近七十年职业生涯的大量唱片，包括肖邦全集和贝多芬协奏曲。"),
            es = LocalizedContent("¿Qué músico clásico tiene más grabaciones?", listOf("Arthur Rubinstein", "Vladimir Horowitz", "Isaac Stern", "Jascha Heifetz"), "Música", "Arthur Rubinstein, pianista polaco-estadounidense, grabó una vasta discografía que abarca casi setenta años de carrera, incluyendo obras completas de Chopin y conciertos de Beethoven.")
        ),
        BilingualQuestion(
            id = 51229, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus mémorable?", listOf("I Will Survive", "99 Luftballons", "Rocket Man", "Stayin' Alive"), "Musique", "99 Luftballons de Nena est un tube international de 1983, souvent cité comme l'un des plus grands one-hit wonders pour son succès planétaire unique et son refrain entêtant."),
            en = LocalizedContent("What is the most memorable one-hit wonder single?", listOf("I Will Survive", "99 Luftballons", "Rocket Man", "Stayin' Alive"), "Music", "99 Luftballons by Nena is an international hit from 1983, often cited as one of the greatest one-hit wonders for its unique global success and catchy chorus."),
            zh = LocalizedContent("哪首单曲是最令人难忘的“一曲成名”作品？", listOf("我会活下去", "99个气球", "火箭人", "活着"), "音乐", "Nena的《99个气球》是1983年的国际热门歌曲，常被引为最伟大的“一曲成名”之一，因其独特的全球成功和朗朗上口的副歌。"),
            es = LocalizedContent("¿Cuál es el sencillo de one-hit wonder más memorable?", listOf("I Will Survive", "99 Luftballons", "Rocket Man", "Stayin' Alive"), "Música", "99 Luftballons de Nena es un éxito internacional de 1983, a menudo citado como uno de los mejores one-hit wonders por su éxito global único y su pegadizo estribillo.")
        ),
        BilingualQuestion(
            id = 51230, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est utilisé principalement au Pérou?", listOf("Quena", "Zampoña", "Charangó", "Bocina"), "Musique", "La quena est une flûte andine traditionnelle, souvent fabriquée en roseau ou en os, et elle est un instrument emblématique de la musique péruvienne et des Andes."),
            en = LocalizedContent("Which instrument is primarily used in Peru?", listOf("Quena", "Zampoña", "Charangó", "Bocina"), "Music", "The quena is a traditional Andean flute, often made of reed or bone, and it is an emblematic instrument of Peruvian and Andean music."),
            zh = LocalizedContent("秘鲁主要使用哪种乐器？", listOf("克纳笛", "排箫", "查兰戈", "喇叭"), "音乐", "克纳笛是一种传统的安第斯笛子，通常由芦苇或骨头制成，是秘鲁和安第斯音乐中具有代表性的乐器。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Perú?", listOf("Quena", "Zampoña", "Charango", "Bocina"), "Música", "La quena es una flauta andina tradicional, a menudo hecha de caña o hueso, y es un instrumento emblemático de la música peruana y andina.")
        ),
        BilingualQuestion(
            id = 51231, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Prince est le plus vendu?", listOf("Purple Rain", "Sign O' the Times", "Dirty Mind", "Batman"), "Musique", "Purple Rain, sorti en 1984, est l'album le plus vendu de Prince, porté par le succès du film du même nom et des hits comme \"When Doves Cry\"."),
            en = LocalizedContent("Which Prince album is the best-selling?", listOf("Purple Rain", "Sign O' the Times", "Dirty Mind", "Batman"), "Music", "Purple Rain, released in 1984, is Prince's best-selling album, boosted by the success of the film of the same name and hits like \"When Doves Cry\"."),
            zh = LocalizedContent("王子哪张专辑销量最高？", listOf("紫雨", "时代标志", "肮脏的思想", "蝙蝠侠"), "音乐", "1984年发行的《紫雨》是王子销量最高的专辑，得益于同名电影的成功以及《当鸽子哭泣》等热门歌曲。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de Prince?", listOf("Purple Rain", "Sign O' the Times", "Dirty Mind", "Batman"), "Música", "Purple Rain, lanzado en 1984, es el álbum más vendido de Prince, impulsado por el éxito de la película del mismo nombre y éxitos como \"When Doves Cry\".")
        ),
        BilingualQuestion(
            id = 51232, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le compositeur symphonique avec le plus de compositions?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Johann Sebastian Bach", "Pyotr Ilyich Tchaikovsky"), "Musique", "Bach a composé plus de 1 100 œuvres cataloguées, dont des cantates, concertos et fugues, ce qui en fait le compositeur symphonique le plus prolifique de l'histoire."),
            en = LocalizedContent("Which symphonic composer has the most compositions?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Johann Sebastian Bach", "Pyotr Ilyich Tchaikovsky"), "Music", "Bach composed over 1,100 cataloged works, including cantatas, concertos, and fugues, making him the most prolific symphonic composer in history."),
            zh = LocalizedContent("哪位交响乐作曲家的作品最多？", listOf("沃尔夫冈·阿马德乌斯·莫扎特", "路德维希·范·贝多芬", "约翰·塞巴斯蒂安·巴赫", "彼得·伊里奇·柴可夫斯基"), "音乐", "巴赫创作了超过1100部有编号的作品，包括康塔塔、协奏曲和赋格，使他成为历史上最多产的交响乐作曲家。"),
            es = LocalizedContent("¿Qué compositor sinfónico tiene más composiciones?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Johann Sebastian Bach", "Pyotr Ilyich Tchaikovsky"), "Música", "Bach compuso más de 1100 obras catalogadas, incluyendo cantatas, conciertos y fugas, lo que lo convierte en el compositor sinfónico más prolífico de la historia.")
        ),
        BilingualQuestion(
            id = 51233, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus gai?", listOf("Y.M.C.A.", "Can't Touch This", "Ice Ice Baby", "Wannabe"), "Musique", "YMCA, sorti en 1978 par le groupe disco Village People, est devenu un hymne gay emblématique malgré son intention initiale de célébrer l'association de jeunes chrétiens."),
            en = LocalizedContent("Which 'one-hit wonder' single is the gayest?", listOf("Y.M.C.A.", "Can't Touch This", "Ice Ice Baby", "Wannabe"), "Music", "YMCA, released in 1978 by the disco group Village People, became an iconic gay anthem despite its initial intention to celebrate the Young Men's Christian Association."),
            zh = LocalizedContent("哪首“一曲成名”的单曲最同性恋？", listOf("Y.M.C.A.", "不能碰这个", "冰冰宝贝", "想要"), "音乐", "1978年由迪斯科团体“乡村人”发行的《Y.M.C.A.》成为标志性的同性恋颂歌，尽管其最初意图是赞美基督教青年会。"),
            es = LocalizedContent("¿Cuál es el sencillo 'one-hit wonder' más gay?", listOf("Y.M.C.A.", "Can't Touch This", "Ice Ice Baby", "Wannabe"), "Música", "YMCA, lanzado en 1978 por el grupo disco Village People, se convirtió en un himno gay icónico a pesar de su intención inicial de celebrar la Asociación Cristiana de Jóvenes.")
        ),
        BilingualQuestion(
            id = 51234, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Égypte?", listOf("Oud", "Ney", "Rebab", "Sistrum"), "Musique", "L'oud est un instrument à cordes pincées, ancêtre du luth, très présent dans la musique arabe et notamment en Égypte."),
            en = LocalizedContent("Which instrument is primarily used in Egypt?", listOf("Oud", "Ney", "Rebab", "Sistrum"), "Music", "The oud is a plucked string instrument, ancestor of the lute, very present in Arabic music, especially in Egypt."),
            zh = LocalizedContent("埃及主要使用哪种乐器？", listOf("乌德琴", "奈伊笛", "拉巴卜", "叉铃"), "音乐", "乌德琴是一种拨弦乐器，是鲁特琴的前身，在阿拉伯音乐中非常常见，尤其在埃及。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Egipto?", listOf("Oud", "Ney", "Rebab", "Sistro"), "Música", "El oud es un instrumento de cuerda pulsada, antepasado del laúd, muy presente en la música árabe, especialmente en Egipto.")
        ),
        BilingualQuestion(
            id = 51235, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album d'Adele est le plus vendu?", listOf("21", "25", "19", "30"), "Musique", "Sorti en 2011, \"21\" s'est écoulé à plus de 30 millions d'exemplaires dans le monde, porté par les tubes \"Rolling in the Deep\" et \"Someone Like You\"."),
            en = LocalizedContent("Which Adele album is the best-selling?", listOf("21", "25", "19", "30"), "Music", "Released in 2011, \"21\" sold over 30 million copies worldwide, driven by hits like \"Rolling in the Deep\" and \"Someone Like You\"."),
            zh = LocalizedContent("阿黛尔哪张专辑销量最高？", listOf("21", "25", "19", "30"), "音乐", "2011年发行的《21》全球销量超过3000万张，得益于《Rolling in the Deep》和《Someone Like You》等热门歌曲。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de Adele?", listOf("21", "25", "19", "30"), "Música", "Lanzado en 2011, \"21\" vendió más de 30 millones de copias en todo el mundo, impulsado por éxitos como \"Rolling in the Deep\" y \"Someone Like You\".")
        ),
        BilingualQuestion(
            id = 51236, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le chanteur d'opéra avec le plus d'enregistrements?", listOf("Luciano Pavarotti", "Placido Domingo", "José Carreras", "Franco Corelli"), "Musique", "Luciano Pavarotti détient le record du plus grand nombre d'enregistrements pour un chanteur d'opéra, avec plus de 100 millions de disques vendus dans le monde."),
            en = LocalizedContent("Which opera singer has the most recordings?", listOf("Luciano Pavarotti", "Placido Domingo", "José Carreras", "Franco Corelli"), "Music", "Luciano Pavarotti holds the record for the most recordings by an opera singer, with over 100 million records sold worldwide."),
            zh = LocalizedContent("哪位歌剧歌手的录音最多？", listOf("卢西亚诺·帕瓦罗蒂", "普拉西多·多明戈", "何塞·卡雷拉斯", "弗兰科·科雷利"), "音乐", "卢西亚诺·帕瓦罗蒂保持着歌剧歌手录音最多的纪录，全球销量超过1亿张。"),
            es = LocalizedContent("¿Qué cantante de ópera tiene más grabaciones?", listOf("Luciano Pavarotti", "Plácido Domingo", "José Carreras", "Franco Corelli"), "Música", "Luciano Pavarotti tiene el récord de más grabaciones para un cantante de ópera, con más de 100 millones de discos vendidos en todo el mundo.")
        ),
        BilingualQuestion(
            id = 51237, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus fou?", listOf("I'm Too Sexy", "Rumpshaker", "The Humpty Dance", "Push It"), "Musique", "The Humpty Dance de Digital Underground est devenu un hit en 1990 grâce à son style humoristique et son utilisation d'un nez de clown, mais le groupe n'a jamais reproduit ce succès commercial."),
            en = LocalizedContent("Which 'one-hit wonder' single is the craziest?", listOf("I'm Too Sexy", "Rumpshaker", "The Humpty Dance", "Push It"), "Music", "The Humpty Dance by Digital Underground became a hit in 1990 thanks to its humorous style and use of a clown nose, but the group never replicated this commercial success."),
            zh = LocalizedContent("哪首“一曲成名”的单曲最疯狂？", listOf("我太性感", "摇臀者", "汉普蒂舞", "推它"), "音乐", "Digital Underground的《汉普蒂舞》在1990年因其幽默风格和使用小丑鼻子而成为热门，但该团体从未复制这一商业成功。"),
            es = LocalizedContent("¿Cuál es el sencillo 'one-hit wonder' más loco?", listOf("I'm Too Sexy", "Rumpshaker", "The Humpty Dance", "Push It"), "Música", "The Humpty Dance de Digital Underground se convirtió en un éxito en 1990 gracias a su estilo humorístico y el uso de una nariz de payaso, pero el grupo nunca repitió este éxito comercial.")
        ),
        BilingualQuestion(
            id = 51238, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Grèce?", listOf("Bouzouki", "Lyra", "Zurna", "Kemençe"), "Musique", "Le bouzouki est un instrument à cordes pincées emblématique de la musique grecque, notamment du rebetiko et de la musique populaire."),
            en = LocalizedContent("Which instrument is primarily used in Greece?", listOf("Bouzouki", "Lyra", "Zurna", "Kemençe"), "Music", "The bouzouki is a plucked string instrument emblematic of Greek music, especially rebetiko and popular music."),
            zh = LocalizedContent("希腊主要使用哪种乐器？", listOf("布祖基琴", "里拉琴", "祖尔纳管", "凯门切"), "音乐", "布祖基琴是一种拨弦乐器，是希腊音乐（尤其是雷贝蒂科和流行音乐）的标志性乐器。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Grecia?", listOf("Bouzouki", "Lira", "Zurna", "Kemençe"), "Música", "El bouzouki es un instrumento de cuerda pulsada emblemático de la música griega, especialmente del rebetiko y la música popular.")
        ),
        BilingualQuestion(
            id = 51239, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Taylor Swift est le plus vendu?", listOf("1989", "Fearless", "Red", "Lover"), "Musique", "Fearless, sorti en 2008, est l'album le plus vendu de Taylor Swift avec plus de 12 millions d'exemplaires écoulés dans le monde, grâce à des tubes comme Love Story et You Belong with Me."),
            en = LocalizedContent("Which Taylor Swift album is the best-selling?", listOf("1989", "Fearless", "Red", "Lover"), "Music", "Fearless, released in 2008, is Taylor Swift's best-selling album with over 12 million copies sold worldwide, thanks to hits like Love Story and You Belong with Me."),
            zh = LocalizedContent("泰勒·斯威夫特哪张专辑销量最高？", listOf("1989", "无畏", "红", "情人"), "音乐", "2008年发行的《无畏》是泰勒·斯威夫特销量最高的专辑，全球销量超过1200万张，得益于《爱情故事》和《你属于我》等热门歌曲。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de Taylor Swift?", listOf("1989", "Fearless", "Red", "Lover"), "Música", "Fearless, lanzado en 2008, es el álbum más vendido de Taylor Swift con más de 12 millones de copias vendidas en todo el mundo, gracias a éxitos como Love Story y You Belong with Me.")
        ),
        BilingualQuestion(
            id = 51240, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le duo avec le plus de Grammy?", listOf("Simon & Garfunkel", "The White Stripes", "Sonny & Cher", "Ike & Tina Turner"), "Musique", "Simon & Garfunkel ont remporté 10 Grammy Awards, un record pour un duo, grâce à des albums comme \"Bridge Over Troubled Water\"."),
            en = LocalizedContent("Which duo has the most Grammys?", listOf("Simon & Garfunkel", "The White Stripes", "Sonny & Cher", "Ike & Tina Turner"), "Music", "Simon & Garfunkel have won 10 Grammy Awards, a record for a duo, thanks to albums like \"Bridge Over Troubled Water\"."),
            zh = LocalizedContent("哪个二人组获得的格莱美奖最多？", listOf("西蒙和加芬克尔", "白色条纹", "桑尼和雪儿", "艾克和蒂娜·特纳"), "音乐", "西蒙和加芬克尔凭借《Bridge Over Troubled Water》等专辑获得了10项格莱美奖，这是二人组的纪录。"),
            es = LocalizedContent("¿Qué dúo tiene más Grammys?", listOf("Simon & Garfunkel", "The White Stripes", "Sonny & Cher", "Ike & Tina Turner"), "Música", "Simon & Garfunkel han ganado 10 premios Grammy, un récord para un dúo, gracias a álbumes como \"Bridge Over Troubled Water\".")
        ),
        BilingualQuestion(
            id = 51241, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus mystérieux?", listOf("Midnight City", "Take On Me", "Mr. Brightside", "Wonderwall"), "Musique", "Take On Me est souvent qualifié de one-hit wonder aux États-Unis, malgré le succès mondial d’A-ha, car le groupe n’a jamais réussi à classer un autre single dans le Top 10 américain. Son clip innovant en rotoscopie a contribué à sa renommée durable."),
            en = LocalizedContent("What is the most mysterious one-hit wonder single?", listOf("Midnight City", "Take On Me", "Mr. Brightside", "Wonderwall"), "Music", "Take On Me is often called a one-hit wonder in the US, despite A-ha's global success, because the band never had another US Top 10 single. Its innovative rotoscoped video contributed to its lasting fame."),
            zh = LocalizedContent("最神秘的一曲成名单曲是什么？", listOf("午夜之城", "Take On Me", "Mr. Brightside", "Wonderwall"), "音乐", "尽管A-ha在全球取得成功，但《Take On Me》在美国常被称为一曲成名，因为该乐队在美国再没有其他前十单曲。其创新的转描动画视频促成了其持久的名声。"),
            es = LocalizedContent("¿Cuál es el sencillo de one-hit wonder más misterioso?", listOf("Midnight City", "Take On Me", "Mr. Brightside", "Wonderwall"), "Música", "Take On Me es a menudo llamado un one-hit wonder en EE. UU., a pesar del éxito global de A-ha, porque la banda nunca logró otro sencillo en el Top 10 estadounidense. Su innovador video en rotoscopia contribuyó a su fama duradera.")
        ),
        BilingualQuestion(
            id = 51242, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Turquie?", listOf("Ney", "Oud", "Rebab", "Ud"), "Musique", "L'oud est un instrument à cordes pincées très populaire dans la musique turque et moyen-orientale, souvent considéré comme l'ancêtre du luth européen."),
            en = LocalizedContent("Which instrument is primarily used in Turkey?", listOf("Ney", "Oud", "Rebab", "Ud"), "Music", "The oud is a plucked string instrument very popular in Turkish and Middle Eastern music, often considered the ancestor of the European lute."),
            zh = LocalizedContent("哪种乐器主要在土耳其使用？", listOf("奈伊笛", "乌德琴", "拉巴布", "乌德"), "音乐", "乌德琴是一种拨弦乐器，在土耳其和中东音乐中非常流行，常被认为是欧洲鲁特琴的前身。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Turquía?", listOf("Ney", "Oud", "Rebab", "Ud"), "Música", "El oud es un instrumento de cuerda pulsada muy popular en la música turca y de Oriente Medio, a menudo considerado el antepasado del laúd europeo.")
        ),
        BilingualQuestion(
            id = 51243, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Beyoncé est le plus vendu?", listOf("Dangerously in Love", "Lemonade", "Renaissance", "I Am"), "Musique", "I Am... Sasha Fierce, sorti en 2008, est l'album le plus vendu de Beyoncé, avec plus de 8 millions d'exemplaires écoulés dans le monde."),
            en = LocalizedContent("Which Beyoncé album is the best-selling?", listOf("Dangerously in Love", "Lemonade", "Renaissance", "I Am"), "Music", "I Am... Sasha Fierce, released in 2008, is Beyoncé's best-selling album, with over 8 million copies sold worldwide."),
            zh = LocalizedContent("碧昂丝的哪张专辑销量最高？", listOf("危险爱情", "柠檬水", "文艺复兴", "我是"), "音乐", "2008年发行的《I Am... Sasha Fierce》是碧昂丝最畅销的专辑，全球销量超过800万张。"),
            es = LocalizedContent("¿Qué álbum de Beyoncé es el más vendido?", listOf("Dangerously in Love", "Lemonade", "Renaissance", "I Am"), "Música", "I Am... Sasha Fierce, lanzado en 2008, es el álbum más vendido de Beyoncé, con más de 8 millones de copias vendidas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 51244, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le groupe avec le plus de concerts?", listOf("The Rolling Stones", "Led Zeppelin", "The Beatles", "The Who"), "Musique", "Les Rolling Stones détiennent le record du plus grand nombre de concerts donnés dans l'histoire du rock, avec plus de 2 000 représentations depuis leurs débuts en 1962."),
            en = LocalizedContent("Which band has performed the most concerts?", listOf("The Rolling Stones", "Led Zeppelin", "The Beatles", "The Who"), "Music", "The Rolling Stones hold the record for the most concerts in rock history, with over 2,000 performances since their debut in 1962."),
            zh = LocalizedContent("哪个乐队举办的演唱会最多？", listOf("滚石乐队", "齐柏林飞艇", "披头士", "谁人乐队"), "音乐", "滚石乐队保持着摇滚史上最多演唱会的纪录，自1962年出道以来已演出超过2000场。"),
            es = LocalizedContent("¿Qué banda ha dado más conciertos?", listOf("The Rolling Stones", "Led Zeppelin", "The Beatles", "The Who"), "Música", "Los Rolling Stones tienen el récord de más conciertos en la historia del rock, con más de 2,000 presentaciones desde su debut en 1962.")
        ),
        BilingualQuestion(
            id = 51245, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus kitsch?", listOf("Macarena", "The Chicken Song", "Wannabe", "Ice Ice Baby"), "Musique", "Macarena, du duo espagnol Los del Río, est devenue un phénomène planétaire en 1996 avec sa chorégraphie entraînante, mais le groupe n'a jamais réussi à égaler ce succès."),
            en = LocalizedContent("What is the kitsch-est one-hit wonder single?", listOf("Macarena", "The Chicken Song", "Wannabe", "Ice Ice Baby"), "Music", "Macarena, by the Spanish duo Los del Río, became a global phenomenon in 1996 with its catchy dance, but the group never matched that success."),
            zh = LocalizedContent("最俗气的一曲成名单曲是什么？", listOf("玛卡莲娜", "小鸡之歌", "Wannabe", "Ice Ice Baby"), "音乐", "西班牙二人组Los del Río的《玛卡莲娜》在1996年凭借其朗朗上口的舞蹈成为全球现象，但该组合再未取得同样的成功。"),
            es = LocalizedContent("¿Cuál es el sencillo de one-hit wonder más kitsch?", listOf("Macarena", "The Chicken Song", "Wannabe", "Ice Ice Baby"), "Música", "Macarena, del dúo español Los del Río, se convirtió en un fenómeno global en 1996 con su pegadiza coreografía, pero el grupo nunca igualó ese éxito.")
        ),
        BilingualQuestion(
            id = 51246, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est utilisé principalement au Brésil?", listOf("Berimbau", "Cavaquinho", "Cuíca", "Pandeiro"), "Musique", "Le berimbau est un instrument à corde d'origine africaine, essentiel dans la capoeira, pratique culturelle afro-brésilienne. Il rythme les mouvements et les chants de cet art martial brésilien."),
            en = LocalizedContent("Which instrument is primarily used in Brazil?", listOf("Berimbau", "Cavaquinho", "Cuíca", "Pandeiro"), "Music", "The berimbau is a string instrument of African origin, essential in capoeira, an Afro-Brazilian cultural practice. It rhythms the movements and songs of this Brazilian martial art."),
            zh = LocalizedContent("哪种乐器主要在巴西使用？", listOf("贝林宝", "卡瓦基尼奥", "库伊卡", "潘德罗"), "音乐", "贝林宝是一种源自非洲的弦乐器，在卡波耶拉（一种非裔巴西文化实践）中至关重要。它为这种巴西武术的动作和歌曲提供节奏。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en Brasil?", listOf("Berimbau", "Cavaquinho", "Cuíca", "Pandeiro"), "Música", "El berimbau es un instrumento de cuerda de origen africano, esencial en la capoeira, una práctica cultural afrobrasileña. Marca el ritmo de los movimientos y cantos de este arte marcial brasileño.")
        ),
        BilingualQuestion(
            id = 51247, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Eminem est le plus vendu?", listOf("The Marshall Mathers LP", "The Eminem Show", "Recovery", "Revival"), "Musique", "Sorti en 2000, The Marshall Mathers LP s'est vendu à plus de 32 millions d'exemplaires dans le monde, ce qui en fait l'album le plus vendu d'Eminem."),
            en = LocalizedContent("Which Eminem album is the best-selling?", listOf("The Marshall Mathers LP", "The Eminem Show", "Recovery", "Revival"), "Music", "Released in 2000, The Marshall Mathers LP sold over 32 million copies worldwide, making it Eminem's best-selling album."),
            zh = LocalizedContent("埃米纳姆的哪张专辑销量最高？", listOf("马歇尔·马瑟斯 LP", "埃米纳姆秀", "康复", "复兴"), "音乐", "2000年发行的《The Marshall Mathers LP》全球销量超过3200万张，是埃米纳姆最畅销的专辑。"),
            es = LocalizedContent("¿Qué álbum de Eminem es el más vendido?", listOf("The Marshall Mathers LP", "The Eminem Show", "Recovery", "Revival"), "Música", "Lanzado en 2000, The Marshall Mathers LP vendió más de 32 millones de copias en todo el mundo, lo que lo convierte en el álbum más vendido de Eminem.")
        ),
        BilingualQuestion(
            id = 51248, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le producteur avec le plus de succès commerciaux?", listOf("Quincy Jones", "Max Martin", "Rick Rubin", "Timbaland"), "Musique", "Max Martin, de son vrai nom Karl Martin Sandberg, est un producteur suédois qui a écrit et produit des hits pour des artistes comme Britney Spears, Katy Perry et The Weeknd, cumulant le plus grand nombre de singles numéro un au Billboard Hot 100."),
            en = LocalizedContent("Which producer has the most commercial successes?", listOf("Quincy Jones", "Max Martin", "Rick Rubin", "Timbaland"), "Music", "Max Martin, real name Karl Martin Sandberg, is a Swedish producer who has written and produced hits for artists like Britney Spears, Katy Perry, and The Weeknd, accumulating the most number-one singles on the Billboard Hot 100."),
            zh = LocalizedContent("哪位制作人拥有最多的商业成功？", listOf("昆西·琼斯", "马克斯·马丁", "里克·鲁宾", "提姆巴兰"), "音乐", "马克斯·马丁，本名卡尔·马丁·桑德伯格，是一位瑞典制作人，为布兰妮·斯皮尔斯、凯蒂·佩里和威肯等艺人创作并制作了热门歌曲，在公告牌百强单曲榜上积累了最多的冠军单曲。"),
            es = LocalizedContent("¿Qué productor tiene más éxitos comerciales?", listOf("Quincy Jones", "Max Martin", "Rick Rubin", "Timbaland"), "Música", "Max Martin, nombre real Karl Martin Sandberg, es un productor sueco que ha escrito y producido éxitos para artistas como Britney Spears, Katy Perry y The Weeknd, acumulando la mayor cantidad de sencillos número uno en el Billboard Hot 100.")
        ),
        BilingualQuestion(
            id = 51249, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single 'one-hit wonder' le plus ironique?", listOf("Baby Shark", "Chicken Dance", "Barney Song", "Happy Birthday"), "Musique", "Baby Shark est devenu un phénomène viral mondial en 2016, mais son succès est souvent considéré comme ironique car la chanson, destinée aux enfants, a dominé les classements adultes et est restée l'unique grand succès de ses créateurs, Pinkfong."),
            en = LocalizedContent("What is the most ironic one-hit wonder single?", listOf("Baby Shark", "Chicken Dance", "Barney Song", "Happy Birthday"), "Music", "Baby Shark became a global viral phenomenon in 2016, but its success is often considered ironic because the children's song dominated adult charts and remained the only major hit for its creators, Pinkfong."),
            zh = LocalizedContent("最讽刺的一曲成名单曲是什么？", listOf("鲨鱼宝宝", "小鸡舞", "巴尼之歌", "生日快乐"), "音乐", "《鲨鱼宝宝》在2016年成为全球病毒式现象，但其成功常被认为具有讽刺意味，因为这首儿童歌曲在成人榜单上占据主导地位，并且是其创作者Pinkfong唯一的热门歌曲。"),
            es = LocalizedContent("¿Cuál es el sencillo de one-hit wonder más irónico?", listOf("Baby Shark", "Chicken Dance", "Barney Song", "Happy Birthday"), "Música", "Baby Shark se convirtió en un fenómeno viral global en 2016, pero su éxito a menudo se considera irónico porque la canción infantil dominó las listas de adultos y siguió siendo el único gran éxito de sus creadores, Pinkfong.")
        ),
        BilingualQuestion(
            id = 51250, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est utilisé principalement en Chine?", listOf("Guzheng", "Pipa", "Erhu", "Dizi"), "Musique", "Le guzheng est une cithare chinoise traditionnelle à cordes pincées, utilisée depuis plus de 2500 ans dans la musique classique et folklorique chinoise."),
            en = LocalizedContent("Which instrument is primarily used in China?", listOf("Guzheng", "Pipa", "Erhu", "Dizi"), "Music", "The guzheng is a traditional Chinese plucked string zither, used for over 2500 years in classical and folk Chinese music."),
            zh = LocalizedContent("中国主要使用哪种乐器？", listOf("古筝", "琵琶", "二胡", "笛子"), "音乐", "古筝是一种传统的中国拨弦乐器，已有2500多年的历史，用于中国古典和民间音乐。"),
            es = LocalizedContent("¿Qué instrumento se utiliza principalmente en China?", listOf("Guzheng", "Pipa", "Erhu", "Dizi"), "Musica", "El guzheng es una cítara china tradicional de cuerdas pulsadas, utilizada durante más de 2500 años en la música clásica y folclórica china.")
        ),
        BilingualQuestion(
            id = 51251, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire africain a construit le Grande Zimbabwe?", listOf("Empire du Mali", "Empire du Songhaï", "Empire de Zimbabwe", "Aucun empire"), "Histoire", "Le Grand Zimbabwe a été bâti par les ancêtres des Shonas entre le XIe et le XVe siècle, et non par un empire centralisé connu. Il s'agissait d'une cité-État prospère grâce au commerce de l'or et de l'ivoire."),
            en = LocalizedContent("Which African empire built Great Zimbabwe?", listOf("Mali Empire", "Songhai Empire", "Zimbabwe Empire", "No empire"), "History", "Great Zimbabwe was built by the ancestors of the Shona people between the 11th and 15th centuries, not by a centralized known empire. It was a prosperous city-state due to gold and ivory trade."),
            zh = LocalizedContent("哪个非洲帝国建造了大津巴布韦？", listOf("马里帝国", "桑海帝国", "津巴布韦帝国", "没有帝国"), "历史", "大津巴布韦由绍纳人的祖先在11至15世纪建造，并非由已知的中央集权帝国建造。它是一个因黄金和象牙贸易而繁荣的城邦。"),
            es = LocalizedContent("¿Qué imperio africano construyó el Gran Zimbabwe?", listOf("Imperio de Malí", "Imperio Songhay", "Imperio de Zimbabue", "Ningún imperio"), "Historia", "El Gran Zimbabwe fue construido por los antepasados de los shona entre los siglos XI y XV, no por un imperio centralizado conocido. Era una ciudad-estado próspera gracias al comercio de oro y marfil.")
        ),
        BilingualQuestion(
            id = 51252, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus ancien empire asiatique?", listOf("Empire Shang", "Empire Zhou", "Empire Qin", "Empire Han"), "Histoire", "L'empire Shang, qui a régné sur la vallée du fleuve Jaune du 16e au 11e siècle avant notre ère, est considéré comme la première dynastie chinoise historiquement attestée par des documents écrits et des artefacts archéologiques."),
            en = LocalizedContent("What is the oldest Asian empire?", listOf("Shang Empire", "Zhou Empire", "Qin Empire", "Han Empire"), "History", "The Shang Empire, which ruled the Yellow River valley from the 16th to the 11th century BCE, is considered the first historically attested Chinese dynasty through written records and archaeological artifacts."),
            zh = LocalizedContent("哪个是最古老的亚洲帝国？", listOf("商朝", "周朝", "秦朝", "汉朝"), "历史", "商朝统治黄河河谷从公元前16世纪到11世纪，被认为是第一个有文字记载和考古文物证实的中国王朝。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más antiguo?", listOf("Imperio Shang", "Imperio Zhou", "Imperio Qin", "Imperio Han"), "Historia", "El Imperio Shang, que gobernó el valle del río Amarillo desde el siglo XVI al XI a.C., es considerado la primera dinastía china históricamente atestiguada por documentos escritos y artefactos arqueológicos.")
        ),
        BilingualQuestion(
            id = 51253, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire ottoman a conquis Constantinople en 1453?", listOf("Soliman le Magnifique", "Mehmed II", "Bayezid II", "Sélim Ier"), "Histoire", "Mehmed II, surnommé le Conquérant, était le sultan ottoman qui a dirigé le siège victorieux de Constantinople en 1453, mettant fin à l'Empire byzantin."),
            en = LocalizedContent("Which Ottoman sultan conquered Constantinople in 1453?", listOf("Suleiman the Magnificent", "Mehmed II", "Bayezid II", "Selim I"), "History", "Mehmed II, surnamed the Conqueror, was the Ottoman sultan who led the victorious siege of Constantinople in 1453, ending the Byzantine Empire."),
            zh = LocalizedContent("哪位奥斯曼苏丹在1453年征服了君士坦丁堡？", listOf("苏莱曼大帝", "穆罕默德二世", "巴耶济德二世", "塞利姆一世"), "历史", "穆罕默德二世，绰号征服者，是领导1453年成功围攻君士坦丁堡的奥斯曼苏丹，结束了拜占庭帝国。"),
            es = LocalizedContent("¿Qué sultán otomano conquistó Constantinopla en 1453?", listOf("Solimán el Magnífico", "Mehmed II", "Bayezid II", "Selim I"), "Historia", "Mehmed II, apodado el Conquistador, fue el sultán otomano que dirigió el asedio victorioso de Constantinopla en 1453, poniendo fin al Imperio bizantino.")
        ),
        BilingualQuestion(
            id = 51254, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel être humain était l'homme fort des Vikings?", listOf("Ragnar Lothbrok", "Ivar le Désossé", "Erik le Rouge", "Leif Erikson"), "Histoire", "Ragnar Lothbrok est un héros légendaire viking, dont les exploits sont racontés dans les sagas nordiques, souvent présenté comme un roi et un guerrier d'exception."),
            en = LocalizedContent("Which human was the strongman of the Vikings?", listOf("Ragnar Lothbrok", "Ivar the Boneless", "Erik the Red", "Leif Erikson"), "History", "Ragnar Lothbrok is a legendary Viking hero, whose exploits are recounted in Norse sagas, often portrayed as an exceptional king and warrior."),
            zh = LocalizedContent("哪位人物是维京人的强者？", listOf("拉格纳·洛德布罗克", "无骨者伊瓦尔", "红发埃里克", "莱夫·埃里克松"), "历史", "拉格纳·洛德布罗克是一位传奇的维京英雄，其事迹在北欧萨迦中流传，常被描绘为杰出的国王和战士。"),
            es = LocalizedContent("¿Qué humano fue el hombre fuerte de los vikingos?", listOf("Ragnar Lothbrok", "Ivar el Deshuesado", "Erik el Rojo", "Leif Erikson"), "Historia", "Ragnar Lothbrok es un héroe vikingo legendario, cuyas hazañas se relatan en las sagas nórdicas, a menudo presentado como un rey y guerrero excepcional.")
        ),
        BilingualQuestion(
            id = 51255, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire a construit Machu Picchu?", listOf("Empire Inca", "Empire Aztèque", "Empire Maya", "Empire Chibcha"), "Histoire", "Machu Picchu a été érigé au XVe siècle sous le règne de l'empereur inca Pachacutec, servant de résidence royale et de site religieux."),
            en = LocalizedContent("Which empire built Machu Picchu?", listOf("Inca Empire", "Aztec Empire", "Maya Empire", "Chibcha Empire"), "History", "Machu Picchu was built in the 15th century under the reign of the Inca emperor Pachacuti, serving as a royal residence and religious site."),
            zh = LocalizedContent("哪个帝国建造了马丘比丘？", listOf("印加帝国", "阿兹特克帝国", "玛雅帝国", "奇布查帝国"), "历史", "马丘比丘建于15世纪，在印加皇帝帕查库蒂统治时期，作为皇家住所和宗教场所。"),
            es = LocalizedContent("¿Qué imperio construyó Machu Picchu?", listOf("Imperio Inca", "Imperio Azteca", "Imperio Maya", "Imperio Chibcha"), "Historia", "Machu Picchu fue construido en el siglo XV bajo el reinado del emperador inca Pachacútec, sirviendo como residencia real y sitio religioso.")
        ),
        BilingualQuestion(
            id = 51256, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long empire du monde?", listOf("Empire Romain", "Empire Byzantin", "Empire Chinois", "Empire Ottoman"), "Histoire", "L'Empire chinois, sous différentes dynasties, a perduré de 221 av. J.-C. à 1912, soit plus de 2000 ans."),
            en = LocalizedContent("What is the longest-lasting empire in the world?", listOf("Roman Empire", "Byzantine Empire", "Chinese Empire", "Ottoman Empire"), "History", "The Chinese Empire, under various dynasties, lasted from 221 BCE to 1912, over 2000 years."),
            zh = LocalizedContent("世界上持续时间最长的帝国是哪个？", listOf("罗马帝国", "拜占庭帝国", "中华帝国", "奥斯曼帝国"), "历史", "中华帝国历经多个朝代，从公元前221年持续到1912年，超过2000年。"),
            es = LocalizedContent("¿Cuál es el imperio más longevo del mundo?", listOf("Imperio Romano", "Imperio Bizantino", "Imperio Chino", "Imperio Otomano"), "Historia", "El Imperio chino, bajo diferentes dinastías, duró desde el 221 a.C. hasta 1912, más de 2000 años.")
        ),
        BilingualQuestion(
            id = 51257, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel king d'Angleterre a signé la Magna Carta?", listOf("Richard Ier", "Jean sans Terre", "Henri III", "Édouard Ier"), "Histoire", "Jean sans Terre a signé la Magna Carta en 1215 sous la pression des barons anglais, limitant son pouvoir royal."),
            en = LocalizedContent("Which king of England signed the Magna Carta?", listOf("Richard I", "John Lackland", "Henry III", "Edward I"), "History", "John Lackland signed the Magna Carta in 1215 under pressure from English barons, limiting his royal power."),
            zh = LocalizedContent("哪位英格兰国王签署了《大宪章》？", listOf("理查一世", "约翰王", "亨利三世", "爱德华一世"), "历史", "约翰王在1215年因英格兰贵族的压力签署了《大宪章》，限制了他的王权。"),
            es = LocalizedContent("¿Qué rey de Inglaterra firmó la Carta Magna?", listOf("Ricardo I", "Juan sin Tierra", "Enrique III", "Eduardo I"), "Historia", "Juan sin Tierra firmó la Carta Magna en 1215 bajo la presión de los barones ingleses, limitando su poder real.")
        ),
        BilingualQuestion(
            id = 51258, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi de France a construit Versailles?", listOf("Louis XIII", "Louis XIV", "Louis XV", "Louis XVI"), "Histoire", "Louis XIV, dit le Roi-Soleil, a fait construire le château de Versailles pour affirmer son pouvoir absolu et éloigner la noblesse de Paris."),
            en = LocalizedContent("Which king of France built Versailles?", listOf("Louis XIII", "Louis XIV", "Louis XV", "Louis XVI"), "History", "Louis XIV, the Sun King, had the Palace of Versailles built to assert his absolute power and distance the nobility from Paris."),
            zh = LocalizedContent("哪位法国国王建造了凡尔赛宫？", listOf("路易十三", "路易十四", "路易十五", "路易十六"), "历史", "路易十四，即太阳王，下令建造凡尔赛宫以彰显其绝对权力，并使贵族远离巴黎。"),
            es = LocalizedContent("¿Qué rey de Francia construyó Versalles?", listOf("Luis XIII", "Luis XIV", "Luis XV", "Luis XVI"), "Historia", "Luis XIV, el Rey Sol, mandó construir el Palacio de Versalles para afirmar su poder absoluto y alejar a la nobleza de París.")
        ),
        BilingualQuestion(
            id = 51259, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien empire connu?", listOf("Empire Égyptien", "Empire Mésopotamien", "Empire Akkadien", "Empire Hittite"), "Histoire", "L'Empire akkadien, fondé par Sargon d'Akkad vers 2334 av. J.-C., est considéré comme le premier empire de l'histoire en Mésopotamie. Il a unifié plusieurs cités-États sous une administration centrale."),
            en = LocalizedContent("What is the oldest known empire?", listOf("Egyptian Empire", "Mesopotamian Empire", "Akkadian Empire", "Hittite Empire"), "History", "The Akkadian Empire, founded by Sargon of Akkad around 2334 BCE, is considered the first empire in history in Mesopotamia. It unified several city-states under a central administration."),
            zh = LocalizedContent("已知最古老的帝国是哪个？", listOf("埃及帝国", "美索不达米亚帝国", "阿卡德帝国", "赫梯帝国"), "历史", "阿卡德帝国由萨尔贡一世于公元前2334年左右建立，被认为是历史上第一个帝国，统一了美索不达米亚的多个城邦。"),
            es = LocalizedContent("¿Cuál es el imperio más antiguo conocido?", listOf("Imperio Egipcio", "Imperio Mesopotámico", "Imperio Acadio", "Imperio Hitita"), "Historia", "El Imperio acadio, fundado por Sargón de Acad hacia el 2334 a.C., es considerado el primer imperio de la historia en Mesopotamia. Unificó varias ciudades-estado bajo una administración central.")
        ),
        BilingualQuestion(
            id = 51260, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel continent a vu la révolution industrielle d'abord?", listOf("Asie", "Amérique du Nord", "Europe", "Afrique"), "Histoire", "La révolution industrielle a débuté en Grande-Bretagne au XVIIIe siècle avant de s'étendre au reste de l'Europe. Ce continent a été le berceau des premières innovations mécaniques et de l'industrialisation."),
            en = LocalizedContent("Which continent saw the Industrial Revolution first?", listOf("Asia", "North America", "Europe", "Africa"), "History", "The Industrial Revolution began in Great Britain in the 18th century before spreading to the rest of Europe. This continent was the birthplace of the first mechanical innovations and industrialization."),
            zh = LocalizedContent("哪个大陆首先经历了工业革命？", listOf("亚洲", "北美洲", "欧洲", "非洲"), "历史", "工业革命始于18世纪的英国，随后扩展到欧洲其他地区。这个大陆是第一批机械创新和工业化的发源地。"),
            es = LocalizedContent("¿Qué continente vio primero la Revolución Industrial?", listOf("Asia", "América del Norte", "Europa", "África"), "Historia", "La Revolución Industrial comenzó en Gran Bretaña en el siglo XVIII antes de extenderse al resto de Europa. Este continente fue la cuna de las primeras innovaciones mecánicas y la industrialización.")
        ),
        BilingualQuestion(
            id = 51261, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a eu la première révolution industrielle?", listOf("France", "Allemagne", "Grande-Bretagne", "Hollande"), "Histoire", "La Grande-Bretagne a été le berceau de la première révolution industrielle grâce à ses innovations technologiques, ses ressources en charbon et fer, et son contexte économique favorable au XVIIIe siècle."),
            en = LocalizedContent("Which country had the first Industrial Revolution?", listOf("France", "Germany", "Great Britain", "Holland"), "History", "Great Britain was the birthplace of the first Industrial Revolution thanks to its technological innovations, coal and iron resources, and favorable economic context in the 18th century."),
            zh = LocalizedContent("哪个国家首先发生了工业革命？", listOf("法国", "德国", "英国", "荷兰"), "历史", "英国是第一次工业革命的发源地，得益于其技术创新、煤炭和铁资源以及18世纪有利的经济环境。"),
            es = LocalizedContent("¿Qué país tuvo la primera Revolución Industrial?", listOf("Francia", "Alemania", "Gran Bretaña", "Holanda"), "Historia", "Gran Bretaña fue la cuna de la primera Revolución Industrial gracias a sus innovaciones tecnológicas, recursos de carbón y hierro, y su contexto económico favorable en el siglo XVIII.")
        ),
        BilingualQuestion(
            id = 51262, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus ancien encore en existence?", listOf("Japon", "Égypte", "Vatican", "Chine"), "Histoire", "La Chine est considérée comme l'une des plus anciennes civilisations continues au monde, avec des archives historiques remontant à plus de 3 500 ans sous la dynastie Shang."),
            en = LocalizedContent("Which is the oldest country still in existence?", listOf("Japan", "Egypt", "Vatican", "China"), "History", "China is considered one of the oldest continuous civilizations in the world, with historical records dating back over 3,500 years to the Shang dynasty."),
            zh = LocalizedContent("哪个现存的国家最古老？", listOf("日本", "埃及", "梵蒂冈", "中国"), "历史", "中国被认为是世界上最古老的连续文明之一，历史记录可追溯到3500多年前的商朝。"),
            es = LocalizedContent("¿Cuál es el país más antiguo aún existente?", listOf("Japón", "Egipto", "Vaticano", "China"), "Historia", "China es considerada una de las civilizaciones continuas más antiguas del mundo, con registros históricos que se remontan a más de 3.500 años durante la dinastía Shang.")
        ),
        BilingualQuestion(
            id = 51263, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand empire à la surface de la terre?", listOf("Empire Britannique", "Empire Russe", "Empire Mongol", "Empire Ottoman"), "Histoire", "À son apogée au début du XXe siècle, l'Empire britannique contrôlait environ un quart des terres émergées et de la population mondiale."),
            en = LocalizedContent("What is the largest empire on the surface of the earth?", listOf("British Empire", "Russian Empire", "Mongol Empire", "Ottoman Empire"), "History", "At its peak in the early 20th century, the British Empire controlled about a quarter of the world's land area and population."),
            zh = LocalizedContent("地球上最大的帝国是哪个？", listOf("大英帝国", "俄罗斯帝国", "蒙古帝国", "奥斯曼帝国"), "历史", "在20世纪初的鼎盛时期，大英帝国控制了全球约四分之一的土地和人口。"),
            es = LocalizedContent("¿Cuál es el imperio más grande en la superficie de la tierra?", listOf("Imperio Británico", "Imperio Ruso", "Imperio Mongol", "Imperio Otomano"), "Historia", "En su apogeo a principios del siglo XX, el Imperio Británico controlaba aproximadamente una cuarta parte de la superficie terrestre y la población mundial.")
        ),
        BilingualQuestion(
            id = 51264, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi d'Angleterre a réalisé la Norman Conquest?", listOf("Guillaume le Conquérant", "Henri VIII", "Richard Cœur de Lion", "Jean sans Terre"), "Histoire", "Guillaume, duc de Normandie, a conquis l'Angleterre en 1066 après sa victoire à la bataille d'Hastings, devenant ainsi roi sous le nom de Guillaume Ier."),
            en = LocalizedContent("Which king of England carried out the Norman Conquest?", listOf("William the Conqueror", "Henry VIII", "Richard the Lionheart", "John Lackland"), "History", "William, Duke of Normandy, conquered England in 1066 after his victory at the Battle of Hastings, becoming king as William I."),
            zh = LocalizedContent("哪位英格兰国王实施了诺曼征服？", listOf("征服者威廉", "亨利八世", "狮心王理查", "无地王约翰"), "历史", "诺曼底公爵威廉在1066年黑斯廷斯战役胜利后征服了英格兰，成为国王威廉一世。"),
            es = LocalizedContent("¿Qué rey de Inglaterra llevó a cabo la Conquista Normanda?", listOf("Guillermo el Conquistador", "Enrique VIII", "Ricardo Corazón de León", "Juan sin Tierra"), "Historia", "Guillermo, duque de Normandía, conquistó Inglaterra en 1066 tras su victoria en la batalla de Hastings, convirtiéndose en rey como Guillermo I.")
        ),
        BilingualQuestion(
            id = 51265, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus influent?", listOf("Empire Ottomane", "Empire Perse", "Empire Mongol", "Empire Indien"), "Histoire", "Fondé par Gengis Khan au XIIIe siècle, l'Empire mongol est devenu le plus vaste empire contigu de l'histoire, reliant l'Asie et l'Europe et facilitant les échanges culturels et commerciaux."),
            en = LocalizedContent("Which is the most influential Asian empire?", listOf("Ottoman Empire", "Persian Empire", "Mongol Empire", "Indian Empire"), "History", "Founded by Genghis Khan in the 13th century, the Mongol Empire became the largest contiguous empire in history, linking Asia and Europe and facilitating cultural and commercial exchanges."),
            zh = LocalizedContent("哪个亚洲帝国最具影响力？", listOf("奥斯曼帝国", "波斯帝国", "蒙古帝国", "印度帝国"), "历史", "蒙古帝国由成吉思汗在13世纪建立，成为历史上最大的连续帝国，连接了亚洲和欧洲，促进了文化和商业交流。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más influyente?", listOf("Imperio Otomano", "Imperio Persa", "Imperio Mongol", "Imperio Indio"), "Historia", "Fundado por Gengis Kan en el siglo XIII, el Imperio Mongol se convirtió en el imperio contiguo más grande de la historia, conectando Asia y Europa y facilitando los intercambios culturales y comerciales.")
        ),
        BilingualQuestion(
            id = 51266, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi a dirigé la Révolution Française?", listOf("Louis XV", "Louis XVI", "Louis XVII", "Louis XVIII"), "Histoire", "Louis XVI était le roi de France au début de la Révolution française en 1789. Il a été renversé et exécuté en 1793, marquant la fin de la monarchie absolue."),
            en = LocalizedContent("Which king led the French Revolution?", listOf("Louis XV", "Louis XVI", "Louis XVII", "Louis XVIII"), "History", "Louis XVI was the king of France at the start of the French Revolution in 1789. He was overthrown and executed in 1793, marking the end of absolute monarchy."),
            zh = LocalizedContent("哪位国王领导了法国大革命？", listOf("路易十五", "路易十六", "路易十七", "路易十八"), "历史", "路易十六是1789年法国大革命开始时的法国国王。他于1793年被推翻并处决，标志着绝对君主制的终结。"),
            es = LocalizedContent("¿Qué rey lideró la Revolución Francesa?", listOf("Luis XV", "Luis XVI", "Luis XVII", "Luis XVIII"), "Historia", "Luis XVI fue el rey de Francia al inicio de la Revolución Francesa en 1789. Fue derrocado y ejecutado en 1793, marcando el fin de la monarquía absoluta.")
        ),
        BilingualQuestion(
            id = 51267, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire africain le plus puissant?", listOf("Mali", "Songhaï", "Kanem-Bornou", "Axoum"), "Histoire", "L'empire du Mali, sous le règne de Mansa Moussa au XIVe siècle, contrôlait d'immenses richesses en or et dominait le commerce transsaharien."),
            en = LocalizedContent("Which is the most powerful African empire?", listOf("Mali", "Songhai", "Kanem-Bornu", "Axum"), "History", "The Mali Empire, under the reign of Mansa Musa in the 14th century, controlled immense gold wealth and dominated trans-Saharan trade."),
            zh = LocalizedContent("哪个非洲帝国最强大？", listOf("马里帝国", "桑海帝国", "卡涅姆-博尔努帝国", "阿克苏姆帝国"), "历史", "马里帝国在14世纪曼萨·穆萨统治时期，控制了巨大的黄金财富，并主导了跨撒哈拉贸易。"),
            es = LocalizedContent("¿Cuál es el imperio africano más poderoso?", listOf("Mali", "Songhai", "Kanem-Bornu", "Axum"), "Historia", "El Imperio de Malí, bajo el reinado de Mansa Musa en el siglo XIV, controlaba inmensas riquezas en oro y dominaba el comercio transahariano.")
        ),
        BilingualQuestion(
            id = 51268, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand empire à jamais exister?", listOf("Empire Britannique", "Empire Russe", "Empire Mongol", "Empire Austro-Hongrois"), "Histoire", "L'Empire Mongol est considéré comme le plus vaste empire contigu de l'histoire, s'étendant de l'Asie de l'Est à l'Europe de l'Est au XIIIe siècle sous la direction de Gengis Khan et ses successeurs."),
            en = LocalizedContent("What is the largest empire to ever exist?", listOf("British Empire", "Russian Empire", "Mongol Empire", "Austro-Hungarian Empire"), "History", "The Mongol Empire is considered the largest contiguous empire in history, stretching from East Asia to Eastern Europe in the 13th century under Genghis Khan and his successors."),
            zh = LocalizedContent("有史以来最大的帝国是哪个？", listOf("大英帝国", "俄罗斯帝国", "蒙古帝国", "奥匈帝国"), "历史", "蒙古帝国被认为是历史上最大的连续帝国，在13世纪成吉思汗及其继任者的领导下，从东亚延伸到东欧。"),
            es = LocalizedContent("¿Cuál es el imperio más grande que jamás haya existido?", listOf("Imperio Británico", "Imperio Ruso", "Imperio Mongol", "Imperio Austrohúngaro"), "Historia", "El Imperio Mongol es considerado el imperio contiguo más grande de la historia, extendiéndose desde Asia Oriental hasta Europa Oriental en el siglo XIII bajo Gengis Kan y sus sucesores.")
        ),
        BilingualQuestion(
            id = 51269, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus ancien?", listOf("Empire Persan", "Empire Aryen", "Empire Assyrien", "Empire Hittite"), "Histoire", "L'Empire aryen, établi vers 1500 av. J.-C. en Inde, est considéré comme le plus ancien empire asiatique connu, précédant les dynasties chinoises et mésopotamiennes."),
            en = LocalizedContent("Which is the oldest Asian empire?", listOf("Persian Empire", "Aryan Empire", "Assyrian Empire", "Hittite Empire"), "History", "The Aryan Empire, established around 1500 BC in India, is considered the oldest known Asian empire, predating Chinese and Mesopotamian dynasties."),
            zh = LocalizedContent("哪个亚洲帝国最古老？", listOf("波斯帝国", "雅利安帝国", "亚述帝国", "赫梯帝国"), "历史", "雅利安帝国约公元前1500年在印度建立，被认为是最古老的已知亚洲帝国，早于中国和美索不达米亚的王朝。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más antiguo?", listOf("Imperio Persa", "Imperio Ario", "Imperio Asirio", "Imperio Hitita"), "Historia", "El Imperio Ario, establecido alrededor del 1500 a.C. en la India, es considerado el imperio asiático más antiguo conocido, anterior a las dinastías chinas y mesopotámicas.")
        ),
        BilingualQuestion(
            id = 51270, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire africain le plus ancien?", listOf("Axoum", "Égypte Ancienne", "Kouche", "Aucun"), "Histoire", "La question est piégée car il n'existe pas d'empire africain unique considéré comme le plus ancien ; les premiers grands royaumes comme Koush ou l'Égypte antique sont souvent classés comme des royaumes ou civilisations, pas des empires au sens strict."),
            en = LocalizedContent("What is the oldest African empire?", listOf("Axum", "Ancient Egypt", "Kush", "None"), "History", "The question is tricky because there is no single African empire considered the oldest; early great kingdoms like Kush or Ancient Egypt are often classified as kingdoms or civilizations, not empires in the strict sense."),
            zh = LocalizedContent("最古老的非洲帝国是哪个？", listOf("阿克苏姆", "古埃及", "库施", "无"), "历史", "这个问题有陷阱，因为没有单一的非洲帝国被认为是最古老的；像库施或古埃及这样的早期伟大王国通常被归类为王国或文明，而非严格意义上的帝国。"),
            es = LocalizedContent("¿Cuál es el imperio africano más antiguo?", listOf("Axum", "Egipto Antiguo", "Kush", "Ninguno"), "Historia", "La pregunta es engañosa porque no existe un único imperio africano considerado el más antiguo; los primeros grandes reinos como Kush o el Egipto antiguo suelen clasificarse como reinos o civilizaciones, no como imperios en sentido estricto.")
        ),
        BilingualQuestion(
            id = 51271, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi de Prusse a créé l'Empire Allemand?", listOf("Frédéric le Grand", "Frédéric Guillaume", "Frédéric Guillaume III", "Frédéric Guillaume IV"), "Histoire", "C'est en réalité Guillaume Ier, roi de Prusse, qui a proclamé l'Empire allemand en 1871, tandis que Frédéric le Grand a régné au XVIIIe siècle et modernisé la Prusse sans créer d'empire."),
            en = LocalizedContent("Which King of Prussia created the German Empire?", listOf("Frederick the Great", "Frederick William", "Frederick William III", "Frederick William IV"), "History", "It was actually William I, King of Prussia, who proclaimed the German Empire in 1871, while Frederick the Great reigned in the 18th century and modernized Prussia without creating an empire."),
            zh = LocalizedContent("哪位普鲁士国王建立了德意志帝国？", listOf("腓特烈大帝", "腓特烈·威廉", "腓特烈·威廉三世", "腓特烈·威廉四世"), "历史", "实际上是普鲁士国王威廉一世在1871年宣告了德意志帝国的成立，而腓特烈大帝在18世纪统治，使普鲁士现代化，但并未建立帝国。"),
            es = LocalizedContent("¿Qué rey de Prusia creó el Imperio Alemán?", listOf("Federico el Grande", "Federico Guillermo", "Federico Guillermo III", "Federico Guillermo IV"), "Historia", "En realidad fue Guillermo I, rey de Prusia, quien proclamó el Imperio Alemán en 1871, mientras que Federico el Grande reinó en el siglo XVIII y modernizó Prusia sin crear un imperio.")
        ),
        BilingualQuestion(
            id = 51272, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire ottoman le plus puissant?", listOf("Soliman le Magnifique", "Bayezid II", "Sélim Ier", "Mehmed II"), "Histoire", "Soliman le Magnifique a régné au XVIe siècle, période où l'Empire ottoman a atteint son apogée territorial et culturel, s'étendant de la Hongrie à l'Afrique du Nord."),
            en = LocalizedContent("What is the most powerful Ottoman Empire?", listOf("Suleiman the Magnificent", "Bayezid II", "Selim I", "Mehmed II"), "History", "Suleiman the Magnificent reigned in the 16th century, a period when the Ottoman Empire reached its territorial and cultural zenith, stretching from Hungary to North Africa."),
            zh = LocalizedContent("最强大的奥斯曼帝国是哪个？", listOf("苏莱曼大帝", "巴耶济德二世", "塞利姆一世", "穆罕默德二世"), "历史", "苏莱曼大帝在16世纪统治，这一时期奥斯曼帝国达到了领土和文化的顶峰，从匈牙利延伸到北非。"),
            es = LocalizedContent("¿Cuál es el imperio otomano más poderoso?", listOf("Solimán el Magnífico", "Bayezid II", "Selim I", "Mehmed II"), "Historia", "Solimán el Magnífico reinó en el siglo XVI, período en el que el Imperio Otomano alcanzó su apogeo territorial y cultural, extendiéndose desde Hungría hasta el norte de África.")
        ),
        BilingualQuestion(
            id = 51273, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur africain?", listOf("David Livingstone", "Henry Morton Stanley", "Mungo Park", "Aucun"), "Histoire", "Le terme \"explorateur\" est historiquement associé aux récits coloniaux européens, et l'Afrique a sa propre histoire riche de voyages et de découvertes internes, rendant toute désignation unique réductrice."),
            en = LocalizedContent("Who is the greatest African explorer?", listOf("David Livingstone", "Henry Morton Stanley", "Mungo Park", "None"), "History", "The term 'explorer' is historically associated with European colonial narratives, and Africa has its own rich history of internal travel and discoveries, making any single designation reductive."),
            zh = LocalizedContent("最伟大的非洲探险家是谁？", listOf("大卫·利文斯通", "亨利·莫顿·斯坦利", "蒙戈·帕克", "无"), "历史", "“探险家”一词在历史上与欧洲殖民叙事相关，而非洲自身有着丰富的内部旅行和发现历史，任何单一指定都是片面的。"),
            es = LocalizedContent("¿Quién es el mayor explorador africano?", listOf("David Livingstone", "Henry Morton Stanley", "Mungo Park", "Ninguno"), "Historia", "El término 'explorador' está históricamente asociado con narrativas coloniales europeas, y África tiene su propia rica historia de viajes y descubrimientos internos, lo que hace que cualquier designación única sea reductora.")
        ),
        BilingualQuestion(
            id = 51274, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus influent du XVIIIe siècle?", listOf("Empire Chinois", "Empire Indien", "Empire Persan", "Empire Mongol"), "Histoire", "L'Empire chinois, sous la dynastie Qing, dominait l'Asie au XVIIIe siècle grâce à son expansion territoriale et son influence économique et culturelle."),
            en = LocalizedContent("What is the most influential Asian empire of the 18th century?", listOf("Chinese Empire", "Indian Empire", "Persian Empire", "Mongol Empire"), "History", "The Chinese Empire, under the Qing dynasty, dominated Asia in the 18th century due to its territorial expansion and economic and cultural influence."),
            zh = LocalizedContent("18世纪最具影响力的亚洲帝国是哪个？", listOf("中华帝国", "印度帝国", "波斯帝国", "蒙古帝国"), "历史", "清朝统治下的中华帝国在18世纪因其领土扩张以及经济和文化影响力而主导亚洲。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más influyente del siglo XVIII?", listOf("Imperio Chino", "Imperio Indio", "Imperio Persa", "Imperio Mongol"), "Historia", "El Imperio Chino, bajo la dinastía Qing, dominó Asia en el siglo XVIII gracias a su expansión territorial y su influencia económica y cultural.")
        ),
        BilingualQuestion(
            id = 51275, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur américain?", listOf("Christophe Colomb", "Vasco de Balboa", "Fernand de Magellan", "Hernán Cortés"), "Histoire", "Christophe Colomb, navigateur génois au service de l'Espagne, est considéré comme le plus grand explorateur américain pour avoir ouvert la voie à la colonisation européenne des Amériques en 1492."),
            en = LocalizedContent("Who is the greatest American explorer?", listOf("Christopher Columbus", "Vasco Núñez de Balboa", "Ferdinand Magellan", "Hernán Cortés"), "History", "Christopher Columbus, a Genoese navigator in the service of Spain, is considered the greatest American explorer for having paved the way for European colonization of the Americas in 1492."),
            zh = LocalizedContent("最伟大的美洲探险家是谁？", listOf("克里斯托弗·哥伦布", "瓦斯科·努涅斯·德·巴尔博亚", "斐迪南·麦哲伦", "埃尔南·科尔特斯"), "历史", "克里斯托弗·哥伦布，一位为西班牙服务的热那亚航海家，被认为是最伟大的美洲探险家，因为他于1492年为欧洲殖民美洲开辟了道路。"),
            es = LocalizedContent("¿Quién es el mayor explorador americano?", listOf("Cristóbal Colón", "Vasco Núñez de Balboa", "Fernando de Magallanes", "Hernán Cortés"), "Historia", "Cristóbal Colón, navegante genovés al servicio de España, es considerado el mayor explorador americano por haber abierto el camino a la colonización europea de las Américas en 1492.")
        ),
        BilingualQuestion(
            id = 51276, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus ancien du XVIIe siècle?", listOf("Empire Moghol", "Empire Persan", "Empire Chinois", "Empire Japonais"), "Histoire", "L'Empire chinois, sous la dynastie Ming puis Qing, existait déjà depuis plusieurs siècles au XVIIe siècle, ce qui en fait l'empire asiatique le plus ancien de cette époque."),
            en = LocalizedContent("What is the oldest Asian empire of the 17th century?", listOf("Mughal Empire", "Persian Empire", "Chinese Empire", "Japanese Empire"), "History", "The Chinese Empire, under the Ming and then Qing dynasties, had already existed for several centuries by the 17th century, making it the oldest Asian empire of that era."),
            zh = LocalizedContent("17世纪最古老的亚洲帝国是哪个？", listOf("莫卧儿帝国", "波斯帝国", "中华帝国", "日本帝国"), "历史", "中华帝国在明朝和随后的清朝统治下，到17世纪已经存在了几个世纪，使其成为该时期最古老的亚洲帝国。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más antiguo del siglo XVII?", listOf("Imperio Mogol", "Imperio Persa", "Imperio Chino", "Imperio Japonés"), "Historia", "El Imperio Chino, bajo las dinastías Ming y luego Qing, ya existía desde hacía varios siglos en el siglo XVII, lo que lo convierte en el imperio asiático más antiguo de esa época.")
        ),
        BilingualQuestion(
            id = 51277, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur asiatique?", listOf("Zheng He", "Marco Polo", "Christophe Colomb", "Vasco da Gama"), "Histoire", "Zheng He a mené sept expéditions navales majeures entre 1405 et 1433 pour la dynastie Ming, atteignant l'Afrique de l'Est et l'Asie du Sud-Est."),
            en = LocalizedContent("Who is the greatest Asian explorer?", listOf("Zheng He", "Marco Polo", "Christopher Columbus", "Vasco da Gama"), "History", "Zheng He led seven major naval expeditions between 1405 and 1433 for the Ming dynasty, reaching East Africa and Southeast Asia."),
            zh = LocalizedContent("最伟大的亚洲探险家是谁？", listOf("郑和", "马可·波罗", "克里斯托弗·哥伦布", "瓦斯科·达·伽马"), "历史", "郑和在1405年至1433年间为明朝领导了七次大规模航海探险，到达了东非和东南亚。"),
            es = LocalizedContent("¿Quién es el mayor explorador asiático?", listOf("Zheng He", "Marco Polo", "Cristóbal Colón", "Vasco da Gama"), "Historia", "Zheng He dirigió siete grandes expediciones navales entre 1405 y 1433 para la dinastía Ming, llegando hasta África Oriental y el Sudeste Asiático.")
        ),
        BilingualQuestion(
            id = 51278, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus puissant du XIXe siècle?", listOf("Empire Chinois", "Empire Indien", "Empire Persan", "Empire Japonais"), "Histoire", "L'Empire chinois, sous la dynastie Qing, était le plus vaste et peuplé d'Asie au XIXe siècle, dominant économiquement et culturellement la région malgré un déclin progressif face aux puissances occidentales."),
            en = LocalizedContent("What is the most powerful Asian empire of the 19th century?", listOf("Chinese Empire", "Indian Empire", "Persian Empire", "Japanese Empire"), "History", "The Chinese Empire, under the Qing dynasty, was the largest and most populous in Asia in the 19th century, dominating the region economically and culturally despite a gradual decline in the face of Western powers."),
            zh = LocalizedContent("19世纪最强大的亚洲帝国是哪个？", listOf("中华帝国", "印度帝国", "波斯帝国", "日本帝国"), "历史", "清朝统治下的中华帝国在19世纪是亚洲面积最大、人口最多的帝国，尽管面对西方列强逐渐衰落，但在经济和文化上仍主导该地区。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más poderoso del siglo XIX?", listOf("Imperio Chino", "Imperio Indio", "Imperio Persa", "Imperio Japonés"), "Historia", "El Imperio Chino, bajo la dinastía Qing, era el más extenso y poblado de Asia en el siglo XIX, dominando la región económica y culturalmente a pesar de un declive gradual frente a las potencias occidentales.")
        ),
        BilingualQuestion(
            id = 51279, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur européen?", listOf("Christophe Colomb", "Vasco da Gama", "Fernand de Magellan", "Marco Polo"), "Histoire", "Christophe Colomb est souvent considéré comme le plus grand explorateur européen pour avoir ouvert la voie à la colonisation des Amériques en 1492 sous le patronage des Rois catholiques espagnols."),
            en = LocalizedContent("Who is the greatest European explorer?", listOf("Christopher Columbus", "Vasco da Gama", "Ferdinand Magellan", "Marco Polo"), "History", "Christopher Columbus is often considered the greatest European explorer for having paved the way for the colonization of the Americas in 1492 under the patronage of the Spanish Catholic Monarchs."),
            zh = LocalizedContent("最伟大的欧洲探险家是谁？", listOf("克里斯托弗·哥伦布", "瓦斯科·达·伽马", "斐迪南·麦哲伦", "马可·波罗"), "历史", "克里斯托弗·哥伦布通常被认为是最伟大的欧洲探险家，因为他于1492年在西班牙天主教君主的赞助下为美洲殖民开辟了道路。"),
            es = LocalizedContent("¿Quién es el mayor explorador europeo?", listOf("Cristóbal Colón", "Vasco da Gama", "Fernando de Magallanes", "Marco Polo"), "Historia", "Cristóbal Colón es a menudo considerado el mayor explorador europeo por haber abierto el camino a la colonización de las Américas en 1492 bajo el patrocinio de los Reyes Católicos españoles.")
        ),
        BilingualQuestion(
            id = 51280, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus important du XXe siècle?", listOf("Empire Britannique", "Empire Japonais", "Empire Français", "Empire Allemand"), "Histoire", "L'Empire britannique, bien que centré sur l'Europe, a dominé de vastes territoires asiatiques comme l'Inde, la Birmanie et la Malaisie, ce qui en fait la puissance impériale la plus influente du XXe siècle en Asie."),
            en = LocalizedContent("What is the most important Asian empire of the 20th century?", listOf("British Empire", "Japanese Empire", "French Empire", "German Empire"), "History", "The British Empire, though centered in Europe, dominated vast Asian territories like India, Burma, and Malaysia, making it the most influential imperial power of the 20th century in Asia."),
            zh = LocalizedContent("20世纪最重要的亚洲帝国是哪个？", listOf("大英帝国", "日本帝国", "法兰西帝国", "德意志帝国"), "历史", "大英帝国虽然以欧洲为中心，但统治了印度、缅甸和马来西亚等广阔的亚洲领土，使其成为20世纪亚洲最具影响力的帝国势力。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más importante del siglo XX?", listOf("Imperio Británico", "Imperio Japonés", "Imperio Francés", "Imperio Alemán"), "Historia", "El Imperio Británico, aunque centrado en Europa, dominó vastos territorios asiáticos como la India, Birmania y Malasia, lo que lo convierte en la potencia imperial más influyente del siglo XX en Asia.")
        ),
        BilingualQuestion(
            id = 51281, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur océanique?", listOf("James Cook", "Christophe Colomb", "Vasco da Gama", "Ferdinand Magellan"), "Histoire", "James Cook a mené trois grandes expéditions dans le Pacifique, cartographiant des territoires comme la Nouvelle-Zélande et la côte est de l'Australie. Ses voyages ont considérablement élargi la connaissance européenne des océans."),
            en = LocalizedContent("Who is the greatest ocean explorer?", listOf("James Cook", "Christopher Columbus", "Vasco da Gama", "Ferdinand Magellan"), "History", "James Cook led three major expeditions in the Pacific, mapping territories like New Zealand and the east coast of Australia. His voyages greatly expanded European knowledge of the oceans."),
            zh = LocalizedContent("最伟大的海洋探险家是谁？", listOf("詹姆斯·库克", "克里斯托弗·哥伦布", "瓦斯科·达·伽马", "费迪南德·麦哲伦"), "历史", "詹姆斯·库克在太平洋领导了三次重大探险，绘制了新西兰和澳大利亚东海岸等地区的地图。他的航行极大地扩展了欧洲人对海洋的认识。"),
            es = LocalizedContent("¿Quién es el mayor explorador oceánico?", listOf("James Cook", "Cristóbal Colón", "Vasco da Gama", "Fernando de Magallanes"), "Historia", "James Cook dirigió tres grandes expediciones en el Pacífico, cartografiando territorios como Nueva Zelanda y la costa este de Australia. Sus viajes ampliaron considerablemente el conocimiento europeo de los océanos.")
        ),
        BilingualQuestion(
            id = 51282, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire africain le plus puissant du XIIIe siècle?", listOf("Mali", "Songhaï", "Kanem-Bornou", "Benin"), "Histoire", "Sous le règne de Soundiata Keita, l'Empire du Mali a dominé l'Afrique de l'Ouest au XIIIe siècle grâce à sa puissance militaire et au contrôle des routes commerciales de l'or et du sel."),
            en = LocalizedContent("What is the most powerful African empire of the 13th century?", listOf("Mali", "Songhai", "Kanem-Bornu", "Benin"), "History", "Under the reign of Sundiata Keita, the Mali Empire dominated West Africa in the 13th century through its military power and control of gold and salt trade routes."),
            zh = LocalizedContent("13世纪最强大的非洲帝国是哪个？", listOf("马里帝国", "桑海帝国", "卡涅姆-博尔努帝国", "贝宁帝国"), "历史", "在松迪亚塔·凯塔的统治下，马里帝国凭借其军事力量和对黄金与盐贸易路线的控制，在13世纪统治了西非。"),
            es = LocalizedContent("¿Cuál es el imperio africano más poderoso del siglo XIII?", listOf("Mali", "Songhai", "Kanem-Bornu", "Benín"), "Historia", "Bajo el reinado de Sundiata Keita, el Imperio de Malí dominó África Occidental en el siglo XIII gracias a su poder militar y al control de las rutas comerciales de oro y sal.")
        ),
        BilingualQuestion(
            id = 51283, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur polaire?", listOf("Roald Amundsen", "Robert Falcon Scott", "Ernest Shackleton", "Fridtjof Nansen"), "Histoire", "Roald Amundsen mena la première expédition à atteindre le pôle Sud en 1911 et fut aussi le premier à franchir le passage du Nord-Ouest."),
            en = LocalizedContent("Who is the greatest polar explorer?", listOf("Roald Amundsen", "Robert Falcon Scott", "Ernest Shackleton", "Fridtjof Nansen"), "History", "Roald Amundsen led the first expedition to reach the South Pole in 1911 and was also the first to traverse the Northwest Passage."),
            zh = LocalizedContent("最伟大的极地探险家是谁？", listOf("罗阿尔德·阿蒙森", "罗伯特·福尔肯·斯科特", "欧内斯特·沙克尔顿", "弗里德约夫·南森"), "历史", "罗阿尔德·阿蒙森于1911年领导了首次到达南极点的探险，并且也是第一个穿越西北航道的人。"),
            es = LocalizedContent("¿Quién es el mayor explorador polar?", listOf("Roald Amundsen", "Robert Falcon Scott", "Ernest Shackleton", "Fridtjof Nansen"), "Historia", "Roald Amundsen dirigió la primera expedición en alcanzar el Polo Sur en 1911 y también fue el primero en atravesar el Paso del Noroeste.")
        ),
        BilingualQuestion(
            id = 51284, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire africain le plus puissant du XVIe siècle?", listOf("Mali", "Songhaï", "Kanem-Bornou", "Bénin"), "Histoire", "L'empire Songhaï, sous le règne d'Askia Mohammed, dominait l'Afrique de l'Ouest au XVIe siècle grâce à son contrôle des routes commerciales transsahariennes et à sa capitale Tombouctou, centre intellectuel et économique."),
            en = LocalizedContent("What is the most powerful African empire of the 16th century?", listOf("Mali", "Songhai", "Kanem-Bornu", "Benin"), "History", "The Songhai Empire, under the rule of Askia Mohammed, dominated West Africa in the 16th century through its control of trans-Saharan trade routes and its capital Timbuktu, an intellectual and economic center."),
            zh = LocalizedContent("16世纪最强大的非洲帝国是哪个？", listOf("马里帝国", "桑海帝国", "卡涅姆-博尔努帝国", "贝宁帝国"), "历史", "在阿斯基亚·穆罕默德的统治下，桑海帝国通过控制跨撒哈拉贸易路线及其首都廷巴克图（一个知识和经济中心），在16世纪统治了西非。"),
            es = LocalizedContent("¿Cuál es el imperio africano más poderoso del siglo XVI?", listOf("Mali", "Songhai", "Kanem-Bornu", "Benín"), "Historia", "El Imperio Songhai, bajo el reinado de Askia Mohammed, dominó África Occidental en el siglo XVI gracias a su control de las rutas comerciales transaharianas y su capital Tombuctú, centro intelectual y económico.")
        ),
        BilingualQuestion(
            id = 51285, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur montagnard?", listOf("Edmund Hillary", "Tenzing Norgay", "Reinhold Messner", "Aucun"), "Histoire", "L'expression \"plus grand explorateur montagnard\" est subjective et ne correspond à aucun titre officiel ou record universellement reconnu. Aucun explorateur ne peut être objectivement désigné comme tel."),
            en = LocalizedContent("Who is the greatest mountain explorer?", listOf("Edmund Hillary", "Tenzing Norgay", "Reinhold Messner", "None"), "History", "The term 'greatest mountain explorer' is subjective and does not correspond to any official title or universally recognized record. No explorer can be objectively designated as such."),
            zh = LocalizedContent("最伟大的山地探险家是谁？", listOf("埃德蒙·希拉里", "丹增·诺尔盖", "莱因霍尔德·梅斯纳尔", "无"), "历史", "“最伟大的山地探险家”这一说法是主观的，并不对应任何官方头衔或普遍认可的记录。没有探险家可以被客观地指定为此。"),
            es = LocalizedContent("¿Quién es el mayor explorador de montañas?", listOf("Edmund Hillary", "Tenzing Norgay", "Reinhold Messner", "Ninguno"), "Historia", "La expresión 'mayor explorador de montañas' es subjetiva y no corresponde a ningún título oficial o récord universalmente reconocido. Ningún explorador puede ser designado objetivamente como tal.")
        ),
        BilingualQuestion(
            id = 51286, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus important du XIIe siècle?", listOf("Empire Moghol", "Empire Khmer", "Empire Angkor", "Empire Seljuk"), "Histoire", "L'Empire moghol n'a été fondé qu'au XVIe siècle par Babur. Au XIIe siècle, l'empire asiatique le plus important était l'Empire mongol, dirigé par Gengis Khan."),
            en = LocalizedContent("What is the most important Asian empire of the 12th century?", listOf("Mughal Empire", "Khmer Empire", "Angkor Empire", "Seljuk Empire"), "History", "The Mughal Empire was only founded in the 16th century by Babur. In the 12th century, the most important Asian empire was the Mongol Empire, led by Genghis Khan."),
            zh = LocalizedContent("12世纪最重要的亚洲帝国是哪个？", listOf("莫卧儿帝国", "高棉帝国", "吴哥帝国", "塞尔柱帝国"), "历史", "莫卧儿帝国直到16世纪才由巴布尔建立。在12世纪，最重要的亚洲帝国是由成吉思汗领导的蒙古帝国。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más importante del siglo XII?", listOf("Imperio Mogol", "Imperio Jemer", "Imperio Angkor", "Imperio Selyúcida"), "Historia", "El Imperio Mogol no fue fundado hasta el siglo XVI por Babur. En el siglo XII, el imperio asiático más importante fue el Imperio Mongol, dirigido por Gengis Kan.")
        ),
        BilingualQuestion(
            id = 51287, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur souterrain?", listOf("William Buckland", "Édouard-Alfred Martel", "Charles Darwin", "Aucun"), "Histoire", "Édouard-Alfred Martel est considéré comme le père de la spéléologie moderne pour ses explorations systématiques des grottes et gouffres au XIXe siècle."),
            en = LocalizedContent("Who is the greatest underground explorer?", listOf("William Buckland", "Édouard-Alfred Martel", "Charles Darwin", "None"), "History", "Édouard-Alfred Martel is considered the father of modern speleology for his systematic explorations of caves and chasms in the 19th century."),
            zh = LocalizedContent("最伟大的地下探险家是谁？", listOf("威廉·巴克兰", "爱德华-阿尔弗雷德·马特尔", "查尔斯·达尔文", "无"), "历史", "爱德华-阿尔弗雷德·马特尔因其在19世纪对洞穴和深渊的系统探索而被认为是现代洞穴学之父。"),
            es = LocalizedContent("¿Quién es el mayor explorador subterráneo?", listOf("William Buckland", "Édouard-Alfred Martel", "Charles Darwin", "Ninguno"), "Historia", "Édouard-Alfred Martel es considerado el padre de la espeleología moderna por sus exploraciones sistemáticas de cuevas y simas en el siglo XIX.")
        ),
        BilingualQuestion(
            id = 51288, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire africain le plus puissant du Xe siècle?", listOf("Égypte Fatimide", "Axoum", "Mali", "Songhaï"), "Histoire", "L'Égypte fatimide, fondée en 969, dominait le Xe siècle grâce à sa puissance militaire, son contrôle des routes commerciales et son rayonnement culturel, rivalisant avec les califats abbasside et omeyyade."),
            en = LocalizedContent("What is the most powerful African empire of the 10th century?", listOf("Fatimid Egypt", "Axum", "Mali", "Songhai"), "History", "Fatimid Egypt, founded in 969, dominated the 10th century through its military power, control of trade routes, and cultural influence, rivaling the Abbasid and Umayyad caliphates."),
            zh = LocalizedContent("10世纪最强大的非洲帝国是哪个？", listOf("法蒂玛埃及", "阿克苏姆", "马里帝国", "桑海帝国"), "历史", "法蒂玛埃及成立于969年，凭借其军事力量、对贸易路线的控制以及文化影响力，在10世纪占据主导地位，与阿拔斯王朝和倭马亚王朝相抗衡。"),
            es = LocalizedContent("¿Cuál es el imperio africano más poderoso del siglo X?", listOf("Egipto Fatimí", "Axum", "Mali", "Songhai"), "Historia", "El Egipto fatimí, fundado en 969, dominó el siglo X gracias a su poder militar, control de las rutas comerciales y su influencia cultural, rivalizando con los califatos abasí y omeya.")
        ),
        BilingualQuestion(
            id = 51289, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur marin?", listOf("Christophe Colomb", "Vasco da Gama", "Fernand de Magellan", "James Cook"), "Histoire", "James Cook a mené trois grandes expéditions dans l'océan Pacifique, cartographiant des territoires comme la Nouvelle-Zélande et la côte est de l'Australie, ce qui en fait l'un des explorateurs marins les plus influents."),
            en = LocalizedContent("Who is the greatest marine explorer?", listOf("Christopher Columbus", "Vasco da Gama", "Ferdinand Magellan", "James Cook"), "History", "James Cook led three major expeditions in the Pacific Ocean, mapping territories like New Zealand and the east coast of Australia, making him one of the most influential marine explorers."),
            zh = LocalizedContent("最伟大的海洋探险家是谁？", listOf("克里斯托弗·哥伦布", "瓦斯科·达·伽马", "费迪南德·麦哲伦", "詹姆斯·库克"), "历史", "詹姆斯·库克在太平洋领导了三次重大探险，绘制了新西兰和澳大利亚东海岸等地区的地图，使他成为最有影响力的海洋探险家之一。"),
            es = LocalizedContent("¿Quién es el mayor explorador marino?", listOf("Cristóbal Colón", "Vasco da Gama", "Fernando de Magallanes", "James Cook"), "Historia", "James Cook dirigió tres grandes expediciones en el océano Pacífico, cartografiando territorios como Nueva Zelanda y la costa este de Australia, lo que lo convierte en uno de los exploradores marinos más influyentes.")
        ),
        BilingualQuestion(
            id = 51290, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus important du IXe siècle?", listOf("Empire Khmer", "Empire Pala", "Empire Carolingien", "Empire Arabe"), "Histoire", "L'Empire Pala dominait l'Inde orientale et le Bengale au IXe siècle, étant une puissance majeure en Asie grâce à son influence culturelle et militaire."),
            en = LocalizedContent("What is the most important Asian empire of the 9th century?", listOf("Khmer Empire", "Pala Empire", "Carolingian Empire", "Arab Empire"), "History", "The Pala Empire dominated eastern India and Bengal in the 9th century, being a major power in Asia due to its cultural and military influence."),
            zh = LocalizedContent("9世纪最重要的亚洲帝国是哪个？", listOf("高棉帝国", "帕拉帝国", "加洛林帝国", "阿拉伯帝国"), "历史", "帕拉帝国在9世纪统治了东印度和孟加拉地区，凭借其文化和军事影响力成为亚洲的主要强国。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más importante del siglo IX?", listOf("Imperio Jemer", "Imperio Pala", "Imperio Carolingio", "Imperio Árabe"), "Historia", "El Imperio Pala dominó el este de la India y Bengala en el siglo IX, siendo una potencia importante en Asia debido a su influencia cultural y militar.")
        ),
        BilingualQuestion(
            id = 51291, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur astral?", listOf("Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "John Glenn"), "Histoire", "Neil Armstrong est le premier humain à avoir marché sur la Lune le 20 juillet 1969 lors de la mission Apollo 11, ce qui en fait l'explorateur astral le plus célèbre."),
            en = LocalizedContent("Who is the greatest astral explorer?", listOf("Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "John Glenn"), "History", "Neil Armstrong is the first human to have walked on the Moon on July 20, 1969, during the Apollo 11 mission, making him the most famous astral explorer."),
            zh = LocalizedContent("最伟大的星际探索者是谁？", listOf("尤里·加加林", "尼尔·阿姆斯特朗", "巴兹·奥尔德林", "约翰·格伦"), "历史", "尼尔·阿姆斯特朗是1969年7月20日阿波罗11号任务中第一个在月球上行走的人类，这使他成为最著名的星际探索者。"),
            es = LocalizedContent("¿Quién es el mayor explorador astral?", listOf("Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "John Glenn"), "Historia", "Neil Armstrong es el primer ser humano en caminar sobre la Luna el 20 de julio de 1969 durante la misión Apolo 11, lo que lo convierte en el explorador astral más famoso.")
        ),
        BilingualQuestion(
            id = 51292, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire africain le plus puissant du VIIIe siècle?", listOf("Axoum", "Nubie", "Égypte", "Mali"), "Histoire", "L'empire d'Axoum, situé dans l'actuelle Éthiopie et l'Érythrée, dominait le commerce en mer Rouge et contrôlait des routes vers l'Afrique et l'Asie au VIIIe siècle."),
            en = LocalizedContent("What is the most powerful African empire of the 8th century?", listOf("Axum", "Nubia", "Egypt", "Mali"), "History", "The Axumite Empire, located in present-day Ethiopia and Eritrea, dominated Red Sea trade and controlled routes to Africa and Asia in the 8th century."),
            zh = LocalizedContent("8世纪最强大的非洲帝国是哪个？", listOf("阿克苏姆", "努比亚", "埃及", "马里"), "历史", "阿克苏姆帝国位于今天的埃塞俄比亚和厄立特里亚，在8世纪主导了红海贸易，并控制了通往非洲和亚洲的路线。"),
            es = LocalizedContent("¿Cuál es el imperio africano más poderoso del siglo VIII?", listOf("Axum", "Nubia", "Egipto", "Malí"), "Historia", "El Imperio de Axum, ubicado en la actual Etiopía y Eritrea, dominaba el comercio del Mar Rojo y controlaba rutas hacia África y Asia en el siglo VIII.")
        ),
        BilingualQuestion(
            id = 51293, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur spatial?", listOf("Yuri Gagarin", "Sergei Korolev", "Wernher von Braun", "Vitaly Zholobov"), "Histoire", "Wernher von Braun est considéré comme le plus grand explorateur spatial pour avoir conçu la fusée Saturn V qui a permis les missions Apollo vers la Lune."),
            en = LocalizedContent("Who is the greatest space explorer?", listOf("Yuri Gagarin", "Sergei Korolev", "Wernher von Braun", "Vitaly Zholobov"), "History", "Wernher von Braun is considered the greatest space explorer for designing the Saturn V rocket that enabled the Apollo missions to the Moon."),
            zh = LocalizedContent("最伟大的太空探索者是谁？", listOf("尤里·加加林", "谢尔盖·科罗廖夫", "沃纳·冯·布劳恩", "维塔利·若洛博夫"), "历史", "沃纳·冯·布劳恩被认为是伟大的太空探索者，因为他设计了土星五号火箭，使阿波罗登月任务成为可能。"),
            es = LocalizedContent("¿Quién es el mayor explorador espacial?", listOf("Yuri Gagarin", "Serguéi Koroliov", "Wernher von Braun", "Vitali Zholobov"), "Historia", "Wernher von Braun es considerado el mayor explorador espacial por diseñar el cohete Saturno V que permitió las misiones Apolo a la Luna.")
        ),
        BilingualQuestion(
            id = 51294, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus important du VIIe siècle?", listOf("Empire Tang", "Empire Umayyade", "Empire Sassanide", "Empire Byzantin"), "Histoire", "L'Empire Tang, fondé en 618, dominait l'Asie orientale au VIIe siècle grâce à sa puissance militaire, son expansion territoriale et son influence culturelle majeure."),
            en = LocalizedContent("What is the most important Asian empire of the 7th century?", listOf("Tang Empire", "Umayyad Empire", "Sassanid Empire", "Byzantine Empire"), "History", "The Tang Empire, founded in 618, dominated East Asia in the 7th century through its military power, territorial expansion, and major cultural influence."),
            zh = LocalizedContent("7世纪最重要的亚洲帝国是哪个？", listOf("唐朝", "倭马亚帝国", "萨珊帝国", "拜占庭帝国"), "历史", "唐朝建立于618年，凭借其军事力量、领土扩张和重大文化影响，在7世纪主导了东亚。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más importante del siglo VII?", listOf("Imperio Tang", "Imperio Omeya", "Imperio Sasánida", "Imperio Bizantino"), "Historia", "El Imperio Tang, fundado en 618, dominó el este de Asia en el siglo VII gracias a su poder militar, expansión territorial e influencia cultural.")
        ),
        BilingualQuestion(
            id = 51295, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur du premier siècle?", listOf("Alexandre le Grand", "Zénon", "Anaxagore", "Aucun"), "Histoire", "Alexandre le Grand a mené des conquêtes jusqu'en Inde au IVe siècle av. J.-C., ce qui en fait l'un des plus grands explorateurs et conquérants de l'Antiquité."),
            en = LocalizedContent("Who is the greatest explorer of the first century?", listOf("Alexander the Great", "Zeno", "Anaxagoras", "None"), "History", "Alexander the Great led conquests as far as India in the 4th century BC, making him one of the greatest explorers and conquerors of antiquity."),
            zh = LocalizedContent("一世纪最伟大的探险家是谁？", listOf("亚历山大大帝", "芝诺", "阿那克萨戈拉", "无"), "历史", "亚历山大大帝在公元前4世纪领导了远至印度的征服，使他成为古代最伟大的探险家和征服者之一。"),
            es = LocalizedContent("¿Quién es el mayor explorador del primer siglo?", listOf("Alejandro Magno", "Zenón", "Anaxágoras", "Ninguno"), "Historia", "Alejandro Magno lideró conquistas hasta la India en el siglo IV a.C., lo que lo convierte en uno de los mayores exploradores y conquistadores de la antigüedad.")
        ),
        BilingualQuestion(
            id = 51296, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire africain le plus puissant du VIe siècle?", listOf("Axoum", "Égypte", "Nubie", "Kanem-Bornou"), "Histoire", "L’empire d’Axoum, situé dans l’actuelle Éthiopie, contrôlait les routes commerciales entre l’Afrique, l’Arabie et l’Inde, ce qui en faisait la puissance dominante en Afrique au VIe siècle."),
            en = LocalizedContent("What is the most powerful African empire of the 6th century?", listOf("Axum", "Egypt", "Nubia", "Kanem-Bornu"), "History", "The Axumite Empire, located in present-day Ethiopia, controlled trade routes between Africa, Arabia, and India, making it the dominant power in Africa in the 6th century."),
            zh = LocalizedContent("6世纪最强大的非洲帝国是哪个？", listOf("阿克苏姆", "埃及", "努比亚", "卡涅姆-博尔努"), "历史", "阿克苏姆帝国位于今天的埃塞俄比亚，控制了非洲、阿拉伯和印度之间的贸易路线，使其成为6世纪非洲的主导力量。"),
            es = LocalizedContent("¿Cuál es el imperio africano más poderoso del siglo VI?", listOf("Axum", "Egipto", "Nubia", "Kanem-Bornu"), "Historia", "El Imperio de Axum, ubicado en la actual Etiopía, controlaba las rutas comerciales entre África, Arabia y la India, lo que lo convertía en la potencia dominante en África en el siglo VI.")
        ),
        BilingualQuestion(
            id = 51297, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur du deuxième siècle?", listOf("Crésias de Cnide", "Pausanias", "Strabon", "Aucun"), "Histoire", "Le terme \"explorateur\" est une notion moderne qui n'existait pas au IIe siècle, et les voyages de découverte de cette époque étaient souvent militaires ou commerciaux, sans figure individuelle marquante."),
            en = LocalizedContent("Who is the greatest explorer of the second century?", listOf("Ctesias of Cnidus", "Pausanias", "Strabo", "None"), "History", "The term 'explorer' is a modern concept that did not exist in the 2nd century, and voyages of discovery at that time were often military or commercial, without a prominent individual figure."),
            zh = LocalizedContent("二世纪最伟大的探险家是谁？", listOf("克特西亚斯", "保萨尼亚斯", "斯特拉波", "无"), "历史", "“探险家”一词是现代概念，在2世纪并不存在，当时的发现之旅通常是军事或商业性质的，没有突出的个人形象。"),
            es = LocalizedContent("¿Quién es el mayor explorador del segundo siglo?", listOf("Ctesias de Cnido", "Pausanias", "Estrabón", "Ninguno"), "Historia", "El término 'explorador' es un concepto moderno que no existía en el siglo II, y los viajes de descubrimiento de esa época eran a menudo militares o comerciales, sin una figura individual destacada.")
        ),
        BilingualQuestion(
            id = 51298, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire asiatique le plus important du Ve siècle?", listOf("Empire Gupta", "Empire Sassanide", "Empire Byzantin", "Empire Romain d'Orient"), "Histoire", "L'Empire Gupta dominait le sous-continent indien au Ve siècle, marquant un âge d'or culturel et scientifique. Son influence s'étendait sur l'Inde du Nord, avec une administration centralisée et des avancées majeures en mathématiques et astronomie."),
            en = LocalizedContent("What is the most important Asian empire of the 5th century?", listOf("Gupta Empire", "Sassanid Empire", "Byzantine Empire", "Eastern Roman Empire"), "History", "The Gupta Empire dominated the Indian subcontinent in the 5th century, marking a golden age of culture and science. Its influence extended over northern India, with centralized administration and major advances in mathematics and astronomy."),
            zh = LocalizedContent("5世纪最重要的亚洲帝国是哪个？", listOf("笈多帝国", "萨珊帝国", "拜占庭帝国", "东罗马帝国"), "历史", "笈多帝国在5世纪统治了印度次大陆，标志着文化和科学的黄金时代。其影响力遍及北印度，拥有中央集权的行政体系，并在数学和天文学方面取得了重大进展。"),
            es = LocalizedContent("¿Cuál es el imperio asiático más importante del siglo V?", listOf("Imperio Gupta", "Imperio Sasánida", "Imperio Bizantino", "Imperio Romano de Oriente"), "Historia", "El Imperio Gupta dominó el subcontinente indio en el siglo V, marcando una edad de oro cultural y científica. Su influencia se extendió sobre el norte de la India, con una administración centralizada y avances importantes en matemáticas y astronomía.")
        ),
        BilingualQuestion(
            id = 51299, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand explorateur du premier millénaire?", listOf("Marc Polo", "Christophe Colomb", "Vasco da Gama", "Bartolomeu Dias"), "Histoire", "Marco Polo, marchand vénitien du XIIIe siècle, est célèbre pour ses voyages en Asie et son récit détaillé de la cour de Kubilai Khan, qui a ouvert la connaissance de l'Orient à l'Europe médiévale."),
            en = LocalizedContent("Who is the greatest explorer of the first millennium?", listOf("Marco Polo", "Christopher Columbus", "Vasco da Gama", "Bartolomeu Dias"), "History", "Marco Polo, a Venetian merchant of the 13th century, is famous for his travels to Asia and his detailed account of Kublai Khan's court, which opened knowledge of the East to medieval Europe."),
            zh = LocalizedContent("第一个千年最伟大的探险家是谁？", listOf("马可·波罗", "克里斯托弗·哥伦布", "瓦斯科·达·伽马", "巴托洛梅乌·迪亚士"), "历史", "马可·波罗是13世纪的威尼斯商人，以其亚洲之旅和对忽必烈宫廷的详细描述而闻名，为中世纪欧洲打开了了解东方的大门。"),
            es = LocalizedContent("¿Quién es el mayor explorador del primer milenio?", listOf("Marco Polo", "Cristóbal Colón", "Vasco da Gama", "Bartolomé Díaz"), "Historia", "Marco Polo, un mercader veneciano del siglo XIII, es famoso por sus viajes a Asia y su detallado relato de la corte de Kublai Kan, que abrió el conocimiento de Oriente a la Europa medieval.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51310, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert l'antimatière?", listOf("Paul Dirac", "Carl Anderson", "Subrahmanyan Chandrasekhar", "Aucun"), "Science", "Paul Dirac a prédit l'existence de l'antimatière en 1928 par son équation de la mécanique quantique, ce qui lui a valu le prix Nobel de physique en 1933."),
            en = LocalizedContent("Which scientist discovered antimatter?", listOf("Paul Dirac", "Carl Anderson", "Subrahmanyan Chandrasekhar", "None"), "Science", "Paul Dirac predicted the existence of antimatter in 1928 through his quantum mechanics equation, which earned him the Nobel Prize in Physics in 1933."),
            zh = LocalizedContent("哪位科学家发现了反物质？", listOf("保罗·狄拉克", "卡尔·安德森", "苏布拉马尼扬·钱德拉塞卡", "无"), "科学", "保罗·狄拉克在1928年通过他的量子力学方程预言了反物质的存在，这为他赢得了1933年的诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió la antimateria?", listOf("Paul Dirac", "Carl Anderson", "Subrahmanyan Chandrasekhar", "Ninguno"), "Ciencia", "Paul Dirac predijo la existencia de la antimateria en 1928 mediante su ecuación de mecánica cuántica, lo que le valió el Premio Nobel de Física en 1933.")
        ),
        BilingualQuestion(
            id = 51311, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand accélérateur de particules?", listOf("Fermilab", "CERN", "SLAC", "KEK"), "Science", "Le CERN abrite le Grand collisionneur de hadrons (LHC), le plus grand et le plus puissant accélérateur de particules au monde, situé près de Genève."),
            en = LocalizedContent("What is the largest particle accelerator?", listOf("Fermilab", "CERN", "SLAC", "KEK"), "Science", "CERN houses the Large Hadron Collider (LHC), the largest and most powerful particle accelerator in the world, located near Geneva."),
            zh = LocalizedContent("最大的粒子加速器是什么？", listOf("费米实验室", "欧洲核子研究中心", "SLAC国家加速器实验室", "高能加速器研究机构"), "科学", "欧洲核子研究中心拥有大型强子对撞机（LHC），这是世界上最大、最强大的粒子加速器，位于日内瓦附近。"),
            es = LocalizedContent("¿Cuál es el acelerador de partículas más grande?", listOf("Fermilab", "CERN", "SLAC", "KEK"), "Ciencia", "El CERN alberga el Gran Colisionador de Hadrones (LHC), el acelerador de partículas más grande y potente del mundo, situado cerca de Ginebra.")
        ),
        BilingualQuestion(
            id = 51313, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand génome jamais séquencé?", listOf("Humain", "Chimpanzé", "Éléphant", "Paris Japonica"), "Science", "Le génome de la plante Paris japonica, une herbacée vivace, détient le record avec environ 150 milliards de paires de bases, soit 50 fois plus que le génome humain."),
            en = LocalizedContent("What is the largest genome ever sequenced?", listOf("Human", "Chimpanzee", "Elephant", "Paris Japonica"), "Science", "The genome of the plant Paris japonica, a perennial herb, holds the record with about 150 billion base pairs, 50 times larger than the human genome."),
            zh = LocalizedContent("有史以来测序的最大基因组是什么？", listOf("人类", "黑猩猩", "大象", "日本重楼"), "科学", "植物日本重楼（Paris japonica）的基因组拥有约1500亿个碱基对，是人类基因组的50倍，保持着最大基因组的记录。"),
            es = LocalizedContent("¿Cuál es el genoma más grande jamás secuenciado?", listOf("Humano", "Chimpancé", "Elefante", "Paris Japonica"), "Ciencia", "El genoma de la planta Paris japonica, una hierba perenne, ostenta el récord con aproximadamente 150 mil millones de pares de bases, 50 veces más que el genoma humano.")
        ),
        BilingualQuestion(
            id = 51314, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le photon?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Aucun"), "Science", "Max Planck a introduit le concept de quantum d'énergie en 1900, posant les bases de la mécanique quantique. C'est Albert Einstein qui a ensuite théorisé le photon comme particule de lumière en 1905."),
            en = LocalizedContent("Which scientist discovered the photon?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "None"), "Science", "Max Planck introduced the concept of energy quanta in 1900, laying the foundation for quantum mechanics. Albert Einstein later theorized the photon as a particle of light in 1905."),
            zh = LocalizedContent("哪位科学家发现了光子？", listOf("阿尔伯特·爱因斯坦", "马克斯·普朗克", "尼尔斯·玻尔", "无"), "科学", "马克斯·普朗克在1900年引入了能量量子的概念，为量子力学奠定了基础。阿尔伯特·爱因斯坦随后在1905年将光子理论化为光的粒子。"),
            es = LocalizedContent("¿Qué científico descubrió el fotón?", listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Ninguno"), "Ciencia", "Max Planck introdujo el concepto de cuanto de energía en 1900, sentando las bases de la mecánica cuántica. Albert Einstein teorizó posteriormente el fotón como partícula de luz en 1905.")
        ),
        BilingualQuestion(
            id = 51315, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand problème non résolu en physique?", listOf("Gravité quantique", "Matière noire", "Énergie noire", "Tous les trois"), "Science", "La physique contemporaine bute sur trois problèmes majeurs : la matière noire, l'énergie noire et l'incompatibilité entre la relativité générale et la mécanique quantique. Aucun n'a encore de solution complète, ce qui les place tous au même niveau."),
            en = LocalizedContent("What is the biggest unsolved problem in physics?", listOf("Quantum gravity", "Dark matter", "Dark energy", "All three"), "Science", "Contemporary physics faces three major problems: dark matter, dark energy, and the incompatibility between general relativity and quantum mechanics. None has a complete solution yet, placing them all at the same level."),
            zh = LocalizedContent("物理学中最大的未解决问题是什么？", listOf("量子引力", "暗物质", "暗能量", "以上所有"), "科学", "当代物理学面临三个主要问题：暗物质、暗能量以及广义相对论与量子力学之间的不相容性。目前都没有完整的解决方案，因此它们处于同等地位。"),
            es = LocalizedContent("¿Cuál es el mayor problema no resuelto en física?", listOf("Gravedad cuántica", "Materia oscura", "Energía oscura", "Los tres"), "Ciencia", "La física contemporánea se enfrenta a tres problemas principales: la materia oscura, la energía oscura y la incompatibilidad entre la relatividad general y la mecánica cuántica. Ninguno tiene una solución completa aún, situándolos todos al mismo nivel.")
        ),
        BilingualQuestion(
            id = 51316, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le quark?", listOf("Murray Gell-Mann", "George Zweig", "James Bjorken", "Aucun"), "Science", "Murray Gell-Mann a proposé l'existence des quarks en 1964 pour expliquer la composition des hadrons, une découverte qui lui a valu le prix Nobel de physique en 1969."),
            en = LocalizedContent("Which scientist discovered the quark?", listOf("Murray Gell-Mann", "George Zweig", "James Bjorken", "None"), "Science", "Murray Gell-Mann proposed the existence of quarks in 1964 to explain the composition of hadrons, a discovery that earned him the Nobel Prize in Physics in 1969."),
            zh = LocalizedContent("哪位科学家发现了夸克？", listOf("默里·盖尔曼", "乔治·茨威格", "詹姆斯·比约肯", "无"), "科学", "默里·盖尔曼在1964年提出夸克的存在，以解释强子的组成，这一发现为他赢得了1969年的诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió el quark?", listOf("Murray Gell-Mann", "George Zweig", "James Bjorken", "Ninguno"), "Ciencia", "Murray Gell-Mann propuso la existencia de los quarks en 1964 para explicar la composición de los hadrones, un descubrimiento que le valió el Premio Nobel de Física en 1969.")
        ),
        BilingualQuestion(
            id = 51317, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre d'atomes jamais comptés?", listOf("10^15", "10^20", "10^30", "Infini"), "Science", "Le nombre 10^30 correspond à une estimation du nombre d'atomes dans l'univers observable, un calcul théorique basé sur la densité et le volume cosmiques. Aucun comptage direct n'est possible, cette valeur reste une approximation scientifique."),
            en = LocalizedContent("What is the largest number of atoms ever counted?", listOf("10^15", "10^20", "10^30", "Infinity"), "Science", "The number 10^30 corresponds to an estimate of the number of atoms in the observable universe, a theoretical calculation based on cosmic density and volume. No direct counting is possible; this value remains a scientific approximation."),
            zh = LocalizedContent("有史以来计数的最多原子数是多少？", listOf("10^15", "10^20", "10^30", "无穷大"), "科学", "10^30这个数字对应于可观测宇宙中原子数量的估计，是基于宇宙密度和体积的理论计算。无法直接计数，该值仍是一个科学近似。"),
            es = LocalizedContent("¿Cuál es el mayor número de átomos jamás contados?", listOf("10^15", "10^20", "10^30", "Infinito"), "Ciencia", "El número 10^30 corresponde a una estimación del número de átomos en el universo observable, un cálculo teórico basado en la densidad y el volumen cósmicos. No es posible un conteo directo; este valor sigue siendo una aproximación científica.")
        ),
        BilingualQuestion(
            id = 51318, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert le boson de Higgs?", listOf("Peter Higgs", "François Englert", "CERN", "Tous les trois"), "Science", "Le boson de Higgs a été théorisé en 1964 par Peter Higgs, Robert Brout et François Englert. La découverte expérimentale en 2012 au CERN a confirmé leurs travaux communs."),
            en = LocalizedContent("Which scientist discovered the Higgs boson?", listOf("Peter Higgs", "François Englert", "CERN", "All three"), "Science", "The Higgs boson was theorized in 1964 by Peter Higgs, Robert Brout, and François Englert. The experimental discovery in 2012 at CERN confirmed their joint work."),
            zh = LocalizedContent("哪位科学家发现了希格斯玻色子？", listOf("彼得·希格斯", "弗朗索瓦·恩格勒", "欧洲核子研究中心", "以上所有"), "科学", "希格斯玻色子由彼得·希格斯、罗伯特·布绕特和弗朗索瓦·恩格勒于1964年提出理论。2012年在欧洲核子研究中心的实验发现证实了他们的共同工作。"),
            es = LocalizedContent("¿Qué científico descubrió el bosón de Higgs?", listOf("Peter Higgs", "François Englert", "CERN", "Los tres"), "Ciencia", "El bosón de Higgs fue teorizado en 1964 por Peter Higgs, Robert Brout y François Englert. El descubrimiento experimental en 2012 en el CERN confirmó su trabajo conjunto.")
        ),
        BilingualQuestion(
            id = 51319, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de dimensions théoriques?", listOf("4", "10", "11", "26"), "Science", "En théorie des cordes, les équations mathématiques nécessitent 26 dimensions pour être cohérentes dans le cadre de la théorie bosonique."),
            en = LocalizedContent("What is the largest number of theoretical dimensions?", listOf("4", "10", "11", "26"), "Science", "In string theory, mathematical equations require 26 dimensions to be consistent within the framework of bosonic string theory."),
            zh = LocalizedContent("理论维度的最大数量是多少？", listOf("4", "10", "11", "26"), "科学", "在弦理论中，数学方程需要26个维度才能在玻色弦理论的框架内保持一致。"),
            es = LocalizedContent("¿Cuál es el mayor número de dimensiones teóricas?", listOf("4", "10", "11", "26"), "Ciencia", "En la teoría de cuerdas, las ecuaciones matemáticas requieren 26 dimensiones para ser consistentes dentro del marco de la teoría de cuerdas bosónica.")
        ),
        BilingualQuestion(
            id = 51320, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert les ondes gravitationnelles?", listOf("Albert Einstein", "LIGO", "Virgo", "Tous les trois"), "Science", "La collaboration LIGO a annoncé la première détection directe des ondes gravitationnelles en 2016, confirmant une prédiction d'Einstein."),
            en = LocalizedContent("Which scientist discovered gravitational waves?", listOf("Albert Einstein", "LIGO", "Virgo", "All three"), "Science", "The LIGO collaboration announced the first direct detection of gravitational waves in 2016, confirming a prediction by Einstein."),
            zh = LocalizedContent("哪位科学家发现了引力波？", listOf("阿尔伯特·爱因斯坦", "LIGO", "Virgo", "以上所有"), "科学", "LIGO合作组在2016年宣布首次直接探测到引力波，证实了爱因斯坦的预测。"),
            es = LocalizedContent("¿Qué científico descubrió las ondas gravitacionales?", listOf("Albert Einstein", "LIGO", "Virgo", "Los tres"), "Ciencia", "La colaboración LIGO anunció la primera detección directa de ondas gravitacionales en 2016, confirmando una predicción de Einstein.")
        ),
        BilingualQuestion(
            id = 51321, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand changement climatique jamais enregistré?", listOf("Extinction KT", "Snowball Earth", "Grand Oxydation", "Aucun"), "Science", "Snowball Earth désigne une période où la planète était presque entièrement recouverte de glace, il y a environ 700 millions d'années, représentant le plus grand changement climatique connu."),
            en = LocalizedContent("What is the greatest climate change ever recorded?", listOf("KT Extinction", "Snowball Earth", "Great Oxidation", "None"), "Science", "Snowball Earth refers to a period about 700 million years ago when the planet was almost entirely covered in ice, representing the greatest known climate change."),
            zh = LocalizedContent("有记录以来最大的气候变化是什么？", listOf("白垩纪-古近纪灭绝事件", "雪球地球", "大氧化事件", "无"), "科学", "雪球地球指的是大约7亿年前地球几乎完全被冰覆盖的时期，代表了已知最大的气候变化。"),
            es = LocalizedContent("¿Cuál es el mayor cambio climático jamás registrado?", listOf("Extinción KT", "Tierra Bola de Nieve", "Gran Oxidación", "Ninguno"), "Ciencia", "Tierra Bola de Nieve se refiere a un período hace unos 700 millones de años en que el planeta estaba casi completamente cubierto de hielo, representando el mayor cambio climático conocido.")
        ),
        BilingualQuestion(
            id = 51322, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a découvert la sélection naturelle?", listOf("Charles Darwin", "Alfred Wallace", "Gregor Mendel", "Aucun"), "Science", "Charles Darwin a formulé la théorie de l'évolution par sélection naturelle après ses observations lors du voyage du Beagle, notamment aux îles Galápagos."),
            en = LocalizedContent("Which scientist discovered natural selection?", listOf("Charles Darwin", "Alfred Wallace", "Gregor Mendel", "None"), "Science", "Charles Darwin formulated the theory of evolution by natural selection after his observations during the voyage of the Beagle, especially in the Galápagos Islands."),
            zh = LocalizedContent("哪位科学家发现了自然选择？", listOf("查尔斯·达尔文", "阿尔弗雷德·华莱士", "格雷戈尔·孟德尔", "无"), "科学", "查尔斯·达尔文在贝格尔号航行期间，特别是在加拉帕戈斯群岛的观察后，提出了自然选择的进化理论。"),
            es = LocalizedContent("¿Qué científico descubrió la selección natural?", listOf("Charles Darwin", "Alfred Wallace", "Gregor Mendel", "Ninguno"), "Ciencia", "Charles Darwin formuló la teoría de la evolución por selección natural tras sus observaciones durante el viaje del Beagle, especialmente en las islas Galápagos.")
        ),
        BilingualQuestion(
            id = 51323, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de gènes chez un être humain?", listOf("20,000", "30,000", "60,000", "100,000"), "Science", "Le nombre de gènes codant pour des protéines chez l'humain est estimé à environ 20 000, bien moins que les 100 000 supposés avant le séquençage du génome humain."),
            en = LocalizedContent("What is the largest number of genes in a human being?", listOf("20,000", "30,000", "60,000", "100,000"), "Science", "The number of protein-coding genes in humans is estimated at about 20,000, far fewer than the 100,000 assumed before the human genome was sequenced."),
            zh = LocalizedContent("人类基因的最大数量是多少？", listOf("20,000", "30,000", "60,000", "100,000"), "科学", "人类编码蛋白质的基因数量估计约为20,000个，远低于人类基因组测序前假设的100,000个。"),
            es = LocalizedContent("¿Cuál es el mayor número de genes en un ser humano?", listOf("20,000", "30,000", "60,000", "100,000"), "Ciencia", "El número de genes codificantes de proteínas en humanos se estima en unos 20,000, mucho menos que los 100,000 supuestos antes de la secuenciación del genoma humano.")
        ),
        BilingualQuestion(
            id = 51324, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert le virus du SIDA?", listOf("Luc Montagnier", "Robert Gallo", "Jean-Claude Chermann", "Tous les trois"), "Science", "Le virus du SIDA (VIH) a été identifié en 1983 par deux équipes distinctes : celle de Luc Montagnier à l'Institut Pasteur et celle de Robert Gallo aux États-Unis, ce qui a conduit à une reconnaissance partagée de la découverte."),
            en = LocalizedContent("Which scientist discovered the AIDS virus?", listOf("Luc Montagnier", "Robert Gallo", "Jean-Claude Chermann", "All three"), "Science", "The AIDS virus (HIV) was identified in 1983 by two separate teams: Luc Montagnier at the Pasteur Institute and Robert Gallo in the United States, leading to shared recognition of the discovery."),
            zh = LocalizedContent("哪位科学家发现了艾滋病病毒？", listOf("吕克·蒙塔尼耶", "罗伯特·加洛", "让-克洛德·谢尔曼", "以上全部"), "科学", "艾滋病病毒（HIV）于1983年由两个独立团队发现：巴斯德研究所的吕克·蒙塔尼耶和美国的罗伯特·加洛，因此该发现得到共同认可。"),
            es = LocalizedContent("¿Qué científico descubrió el virus del SIDA?", listOf("Luc Montagnier", "Robert Gallo", "Jean-Claude Chermann", "Los tres"), "Ciencia", "El virus del SIDA (VIH) fue identificado en 1983 por dos equipos distintos: el de Luc Montagnier en el Instituto Pasteur y el de Robert Gallo en Estados Unidos, lo que llevó a un reconocimiento compartido del descubrimiento.")
        ),
        BilingualQuestion(
            id = 51325, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de microbes dans le corps humain?", listOf("100", "1000", "1 trillion", "100 trillion"), "Science", "Le corps humain abrite environ 100 000 milliards de microbes, principalement dans l'intestin, dépassant largement le nombre de nos propres cellules."),
            en = LocalizedContent("What is the largest number of microbes in the human body?", listOf("100", "1000", "1 trillion", "100 trillion"), "Science", "The human body harbors about 100 trillion microbes, mainly in the gut, far outnumbering our own cells."),
            zh = LocalizedContent("人体内微生物的最大数量是多少？", listOf("100", "1000", "1万亿", "100万亿"), "科学", "人体内约有100万亿个微生物，主要存在于肠道，数量远超我们自身的细胞。"),
            es = LocalizedContent("¿Cuál es el mayor número de microbios en el cuerpo humano?", listOf("100", "1000", "1 billón", "100 billones"), "Ciencia", "El cuerpo humano alberga alrededor de 100 billones de microbios, principalmente en el intestino, superando con creces el número de nuestras propias células.")
        ),
        BilingualQuestion(
            id = 51326, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert le vaccin contre la rage?", listOf("Louis Pasteur", "Edward Jenner", "Jonas Salk", "Aucun"), "Science", "Louis Pasteur a développé le premier vaccin contre la rage en 1885, en utilisant des virus atténués. Ce succès a marqué une avancée majeure dans la lutte contre les maladies infectieuses."),
            en = LocalizedContent("Which scientist discovered the rabies vaccine?", listOf("Louis Pasteur", "Edward Jenner", "Jonas Salk", "None"), "Science", "Louis Pasteur developed the first rabies vaccine in 1885 using attenuated viruses. This success marked a major advance in the fight against infectious diseases."),
            zh = LocalizedContent("哪位科学家发现了狂犬病疫苗？", listOf("路易·巴斯德", "爱德华·詹纳", "乔纳斯·索尔克", "无"), "科学", "路易·巴斯德于1885年使用减毒病毒开发了第一种狂犬病疫苗。这一成功标志着抗击传染病的重要进展。"),
            es = LocalizedContent("¿Qué científico descubrió la vacuna contra la rabia?", listOf("Louis Pasteur", "Edward Jenner", "Jonas Salk", "Ninguno"), "Ciencia", "Louis Pasteur desarrolló la primera vacuna contra la rabia en 1885 utilizando virus atenuados. Este éxito marcó un avance importante en la lucha contra las enfermedades infecciosas.")
        ),
        BilingualQuestion(
            id = 51327, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de planètes dans une système solaire?", listOf("8", "12", "50", "100"), "Science", "Le système solaire de Kepler-90 possède huit planètes, comme le nôtre, mais des simulations suggèrent que certains systèmes pourraient en compter jusqu'à 50, bien qu'aucun n'ait été observé."),
            en = LocalizedContent("What is the largest number of planets in a solar system?", listOf("8", "12", "50", "100"), "Science", "The Kepler-90 solar system has eight planets, like ours, but simulations suggest some systems could have up to 50, although none have been observed."),
            zh = LocalizedContent("一个太阳系中行星的最大数量是多少？", listOf("8", "12", "50", "100"), "科学", "开普勒-90太阳系有八颗行星，与我们的太阳系相同，但模拟表明某些系统可能有多达50颗行星，尽管尚未观测到。"),
            es = LocalizedContent("¿Cuál es el mayor número de planetas en un sistema solar?", listOf("8", "12", "50", "100"), "Ciencia", "El sistema solar Kepler-90 tiene ocho planetas, como el nuestro, pero las simulaciones sugieren que algunos sistemas podrían tener hasta 50, aunque no se ha observado ninguno.")
        ),
        BilingualQuestion(
            id = 51328, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert le vaccin contre la polio?", listOf("Jonas Salk", "Albert Sabin", "Edward Jenner", "Aucun"), "Science", "Jonas Salk a développé le premier vaccin efficace contre la polio en 1955, en utilisant un virus inactivé. Son travail a permis de réduire massivement les épidémies de cette maladie paralysante."),
            en = LocalizedContent("Which scientist discovered the polio vaccine?", listOf("Jonas Salk", "Albert Sabin", "Edward Jenner", "None"), "Science", "Jonas Salk developed the first effective polio vaccine in 1955 using an inactivated virus. His work massively reduced epidemics of this paralyzing disease."),
            zh = LocalizedContent("哪位科学家发现了脊髓灰质炎疫苗？", listOf("乔纳斯·索尔克", "阿尔伯特·萨宾", "爱德华·詹纳", "无"), "科学", "乔纳斯·索尔克于1955年使用灭活病毒开发了第一种有效的脊髓灰质炎疫苗。他的工作极大地减少了这种致残疾病的流行。"),
            es = LocalizedContent("¿Qué científico descubrió la vacuna contra la polio?", listOf("Jonas Salk", "Albert Sabin", "Edward Jenner", "Ninguno"), "Ciencia", "Jonas Salk desarrolló la primera vacuna eficaz contra la polio en 1955 utilizando un virus inactivado. Su trabajo redujo masivamente las epidemias de esta enfermedad paralizante.")
        ),
        BilingualQuestion(
            id = 51329, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de lunes chez une planète?", listOf("79", "92", "146", "200"), "Science", "Jupiter détient le record avec 92 lunes confirmées, dépassant Saturne qui en compte 83. Ce nombre inclut les petites lunes irrégulières découvertes récemment."),
            en = LocalizedContent("What is the largest number of moons for a planet?", listOf("79", "92", "146", "200"), "Science", "Jupiter holds the record with 92 confirmed moons, surpassing Saturn which has 83. This number includes small irregular moons discovered recently."),
            zh = LocalizedContent("一颗行星拥有的最大卫星数量是多少？", listOf("79", "92", "146", "200"), "科学", "木星以92颗已确认的卫星保持纪录，超过土星的83颗。这个数字包括最近发现的小型不规则卫星。"),
            es = LocalizedContent("¿Cuál es el mayor número de lunas de un planeta?", listOf("79", "92", "146", "200"), "Ciencia", "Júpiter tiene el récord con 92 lunas confirmadas, superando a Saturno que tiene 83. Este número incluye pequeñas lunas irregulares descubiertas recientemente.")
        ),
        BilingualQuestion(
            id = 51330, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert l'insuline?", listOf("Frederick Banting", "Charles Best", "John MacLeod", "Tous les trois"), "Science", "Frederick Banting, Charles Best et James Collip ont collaboré à l'isolement et à la purification de l'insuline en 1921-1922, menant à son utilisation clinique contre le diabète."),
            en = LocalizedContent("Which scientist discovered insulin?", listOf("Frederick Banting", "Charles Best", "John MacLeod", "All three"), "Science", "Frederick Banting, Charles Best, and James Collip collaborated to isolate and purify insulin in 1921-1922, leading to its clinical use against diabetes."),
            zh = LocalizedContent("哪位科学家发现了胰岛素？", listOf("弗雷德里克·班廷", "查尔斯·贝斯特", "约翰·麦克劳德", "以上全部"), "科学", "弗雷德里克·班廷、查尔斯·贝斯特和詹姆斯·科利普在1921-1922年间合作分离并纯化了胰岛素，从而将其用于糖尿病的临床治疗。"),
            es = LocalizedContent("¿Qué científico descubrió la insulina?", listOf("Frederick Banting", "Charles Best", "John MacLeod", "Los tres"), "Ciencia", "Frederick Banting, Charles Best y James Collip colaboraron para aislar y purificar la insulina en 1921-1922, lo que llevó a su uso clínico contra la diabetes.")
        ),
        BilingualQuestion(
            id = 51331, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de trous noirs connus?", listOf("1", "millions", "milliards", "infini"), "Science", "Les astronomes estiment qu'il existe des milliards de trous noirs dans l'univers observable, dont la plupart sont des trous noirs stellaires."),
            en = LocalizedContent("What is the largest number of known black holes?", listOf("1", "millions", "billions", "infinite"), "Science", "Astronomers estimate there are billions of black holes in the observable universe, most of which are stellar black holes."),
            zh = LocalizedContent("已知黑洞的最大数量是多少？", listOf("1", "数百万", "数十亿", "无限"), "科学", "天文学家估计可观测宇宙中有数十亿个黑洞，其中大多数是恒星黑洞。"),
            es = LocalizedContent("¿Cuál es el mayor número de agujeros negros conocidos?", listOf("1", "millones", "miles de millones", "infinito"), "Ciencia", "Los astrónomos estiman que hay miles de millones de agujeros negros en el universo observable, la mayoría de los cuales son agujeros negros estelares.")
        ),
        BilingualQuestion(
            id = 51332, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a découvert les rayons X?", listOf("Wilhelm Röntgen", "Henry Becquerel", "Pierre Curie", "Aucun"), "Science", "Wilhelm Röntgen a découvert les rayons X en 1895, ce qui lui a valu le premier prix Nobel de physique en 1901."),
            en = LocalizedContent("Which scientist discovered X-rays?", listOf("Wilhelm Röntgen", "Henry Becquerel", "Pierre Curie", "None"), "Science", "Wilhelm Röntgen discovered X-rays in 1895, earning him the first Nobel Prize in Physics in 1901."),
            zh = LocalizedContent("哪位科学家发现了X射线？", listOf("威廉·伦琴", "亨利·贝克勒尔", "皮埃尔·居里", "无"), "科学", "威廉·伦琴于1895年发现了X射线，并因此获得1901年首届诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió los rayos X?", listOf("Wilhelm Röntgen", "Henry Becquerel", "Pierre Curie", "Ninguno"), "Ciencia", "Wilhelm Röntgen descubrió los rayos X en 1895, lo que le valió el primer Premio Nobel de Física en 1901.")
        ),
        BilingualQuestion(
            id = 51333, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre d'espèces découvertes?", listOf("1 million", "5 millions", "10 millions", "100 millions"), "Science", "On estime qu'environ 10 millions d'espèces vivent sur Terre, mais seulement 1,5 à 2 millions ont été formellement décrites par la science."),
            en = LocalizedContent("What is the largest number of discovered species?", listOf("1 million", "5 million", "10 million", "100 million"), "Science", "It is estimated that about 10 million species live on Earth, but only 1.5 to 2 million have been formally described by science."),
            zh = LocalizedContent("已发现物种的最大数量是多少？", listOf("100万", "500万", "1000万", "1亿"), "科学", "据估计，地球上约有1000万个物种，但只有150万到200万已被科学正式描述。"),
            es = LocalizedContent("¿Cuál es el mayor número de especies descubiertas?", listOf("1 millón", "5 millones", "10 millones", "100 millones"), "Ciencia", "Se estima que alrededor de 10 millones de especies viven en la Tierra, pero solo entre 1.5 y 2 millones han sido formalmente descritas por la ciencia.")
        ),
        BilingualQuestion(
            id = 51334, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert les gènes?", listOf("Gregor Mendel", "Charles Darwin", "Francis Galton", "Aucun"), "Science", "Gregor Mendel, moine et botaniste autrichien du XIXe siècle, a établi les lois de l'hérédité en étudiant les pois, posant ainsi les bases de la génétique moderne."),
            en = LocalizedContent("Which scientist discovered genes?", listOf("Gregor Mendel", "Charles Darwin", "Francis Galton", "None"), "Science", "Gregor Mendel, a 19th-century Austrian monk and botanist, established the laws of heredity by studying peas, laying the foundations of modern genetics."),
            zh = LocalizedContent("哪位科学家发现了基因？", listOf("格雷戈尔·孟德尔", "查尔斯·达尔文", "弗朗西斯·高尔顿", "无"), "科学", "19世纪的奥地利修士和植物学家格雷戈尔·孟德尔通过研究豌豆确立了遗传定律，为现代遗传学奠定了基础。"),
            es = LocalizedContent("¿Qué científico descubrió los genes?", listOf("Gregor Mendel", "Charles Darwin", "Francis Galton", "Ninguno"), "Ciencia", "Gregor Mendel, monje y botánico austriaco del siglo XIX, estableció las leyes de la herencia al estudiar guisantes, sentando las bases de la genética moderna.")
        ),
        BilingualQuestion(
            id = 51335, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de cromosomes chez un être vivant?", listOf("46", "62", "260", "500"), "Science", "Le nombre record de 260 chromosomes est détenu par une fougère appelée Ophioglossum reticulatum, bien loin des 46 chromosomes humains."),
            en = LocalizedContent("What is the largest number of chromosomes in a living being?", listOf("46", "62", "260", "500"), "Science", "The record number of 260 chromosomes is held by a fern called Ophioglossum reticulatum, far exceeding the 46 human chromosomes."),
            zh = LocalizedContent("生物体中最大的染色体数量是多少？", listOf("46", "62", "260", "500"), "科学", "260条染色体的纪录由一种名为网状瓶尔小草的蕨类植物保持，远超人类的46条染色体。"),
            es = LocalizedContent("¿Cuál es el mayor número de cromosomas en un ser vivo?", listOf("46", "62", "260", "500"), "Ciencia", "El récord de 260 cromosomas lo posee un helecho llamado Ophioglossum reticulatum, muy por encima de los 46 cromosomas humanos.")
        ),
        BilingualQuestion(
            id = 51336, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le fluor?", listOf("Humphry Davy", "André-Marie Ampère", "Claude Gay-Lussac", "Aucun"), "Science", "Humphry Davy a isolé le fluor en 1813 en utilisant l'électrolyse, bien que le gaz pur n'ait été obtenu qu'en 1886 par Henri Moissan."),
            en = LocalizedContent("Which scientist discovered fluorine?", listOf("Humphry Davy", "André-Marie Ampère", "Claude Gay-Lussac", "None"), "Science", "Humphry Davy isolated fluorine in 1813 using electrolysis, although pure gas was only obtained in 1886 by Henri Moissan."),
            zh = LocalizedContent("哪位科学家发现了氟？", listOf("汉弗里·戴维", "安德烈-玛丽·安培", "克劳德·盖-吕萨克", "无"), "科学", "汉弗里·戴维于1813年通过电解分离出氟，但纯氟气直到1886年才由亨利·莫瓦桑获得。"),
            es = LocalizedContent("¿Qué científico descubrió el flúor?", listOf("Humphry Davy", "André-Marie Ampère", "Claude Gay-Lussac", "Ninguno"), "Ciencia", "Humphry Davy aisló el flúor en 1813 mediante electrólisis, aunque el gas puro no se obtuvo hasta 1886 por Henri Moissan.")
        ),
        BilingualQuestion(
            id = 51337, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de synapse chez un cerveau humain?", listOf("1 milliard", "10 milliards", "100 milliards", "1 trillion"), "Science", "Le cerveau humain contient environ 100 milliards de neurones, et chaque neurone peut avoir des milliers de connexions, ce qui porte le total des synapses à environ 1 trillion. Ce chiffre illustre la complexité extrême du réseau neuronal."),
            en = LocalizedContent("What is the largest number of synapses in a human brain?", listOf("1 billion", "10 billion", "100 billion", "1 trillion"), "Science", "The human brain contains about 100 billion neurons, and each neuron can have thousands of connections, bringing the total synapses to about 1 trillion. This figure illustrates the extreme complexity of the neural network."),
            zh = LocalizedContent("人脑中突触的最大数量是多少？", listOf("10亿", "100亿", "1000亿", "1万亿"), "科学", "人脑约有1000亿个神经元，每个神经元可有数千个连接，因此突触总数约为1万亿。这一数字说明了神经网络的极端复杂性。"),
            es = LocalizedContent("¿Cuál es el mayor número de sinapsis en un cerebro humano?", listOf("1 mil millones", "10 mil millones", "100 mil millones", "1 billón"), "Ciencia", "El cerebro humano contiene alrededor de 100 mil millones de neuronas, y cada neurona puede tener miles de conexiones, lo que eleva el total de sinapsis a aproximadamente 1 billón. Esta cifra ilustra la extrema complejidad de la red neuronal.")
        ),
        BilingualQuestion(
            id = 51338, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le néon?", listOf("William Ramsay", "Morris William Travers", "Baron Rayleigh", "Aucun"), "Science", "William Ramsay a découvert le néon en 1898 avec Morris Travers en distillant de l'air liquide."),
            en = LocalizedContent("Which scientist discovered neon?", listOf("William Ramsay", "Morris William Travers", "Baron Rayleigh", "None"), "Science", "William Ramsay discovered neon in 1898 with Morris Travers by distilling liquid air."),
            zh = LocalizedContent("哪位科学家发现了氖？", listOf("威廉·拉姆齐", "莫里斯·威廉·特拉弗斯", "瑞利男爵", "无"), "科学", "威廉·拉姆齐与莫里斯·特拉弗斯于1898年通过蒸馏液态空气发现了氖。"),
            es = LocalizedContent("¿Qué científico descubrió el neón?", listOf("William Ramsay", "Morris William Travers", "Barón Rayleigh", "Ninguno"), "Ciencia", "William Ramsay descubrió el neón en 1898 junto con Morris Travers al destilar aire líquido.")
        ),
        BilingualQuestion(
            id = 51339, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de cellules dans le corps humain?", listOf("1 million", "1 milliard", "37 milliards", "200 milliards"), "Science", "Le corps humain adulte contient environ 37 000 milliards de cellules, une estimation basée sur des études de biologie cellulaire. Ce nombre varie selon l'âge, la taille et la méthode de calcul."),
            en = LocalizedContent("What is the largest number of cells in the human body?", listOf("1 million", "1 billion", "37 billion", "200 billion"), "Science", "The adult human body contains about 37 trillion cells, an estimate based on cell biology studies. This number varies with age, size, and calculation method."),
            zh = LocalizedContent("人体中细胞的最大数量是多少？", listOf("100万", "10亿", "370亿", "2000亿"), "科学", "成年人体内约有37万亿个细胞，这是基于细胞生物学研究的估计。该数字因年龄、体型和计算方法而异。"),
            es = LocalizedContent("¿Cuál es el mayor número de células en el cuerpo humano?", listOf("1 millón", "1 mil millones", "37 mil millones", "200 mil millones"), "Ciencia", "El cuerpo humano adulto contiene alrededor de 37 billones de células, una estimación basada en estudios de biología celular. Este número varía según la edad, el tamaño y el método de cálculo.")
        ),
        BilingualQuestion(
            id = 51340, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le platine?", listOf("Juan José d'Ulloa", "Charles Wood", "Aucun", "Jules Verne"), "Science", "Le platine est connu et utilisé depuis l'Antiquité par les civilisations précolombiennes, mais il n'a pas été découvert par un scientifique unique en Europe avant d'être identifié comme un nouvel élément au XVIIIe siècle."),
            en = LocalizedContent("Which scientist discovered platinum?", listOf("Juan José d'Ulloa", "Charles Wood", "None", "Jules Verne"), "Science", "Platinum has been known and used since antiquity by pre-Columbian civilizations, but it was not discovered by a single scientist in Europe before being identified as a new element in the 18th century."),
            zh = LocalizedContent("哪位科学家发现了铂？", listOf("胡安·何塞·德乌略亚", "查尔斯·伍德", "无", "儒勒·凡尔纳"), "科学", "铂自古代就被前哥伦布文明所知晓和使用，但在18世纪被确认为新元素之前，欧洲没有单一科学家发现它。"),
            es = LocalizedContent("¿Qué científico descubrió el platino?", listOf("Juan José d'Ulloa", "Charles Wood", "Ninguno", "Julio Verne"), "Ciencia", "El platino ha sido conocido y utilizado desde la antigüedad por las civilizaciones precolombinas, pero no fue descubierto por un solo científico en Europa antes de ser identificado como un nuevo elemento en el siglo XVIII.")
        ),
        BilingualQuestion(
            id = 51341, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de protéines dans le corps humain?", listOf("1000", "10 000", "100 000", "1 million"), "Science", "Le corps humain exprime environ 100 000 protéines différentes, issues de l'expression de ses gènes, bien que le nombre exact varie selon les études."),
            en = LocalizedContent("What is the largest number of proteins in the human body?", listOf("1000", "10,000", "100,000", "1 million"), "Science", "The human body expresses approximately 100,000 different proteins, derived from gene expression, though the exact number varies by study."),
            zh = LocalizedContent("人体中蛋白质的最大数量是多少？", listOf("1000", "10000", "100000", "100万"), "科学", "人体表达约10万种不同的蛋白质，这些蛋白质来自基因表达，尽管具体数字因研究而异。"),
            es = LocalizedContent("¿Cuál es el mayor número de proteínas en el cuerpo humano?", listOf("1000", "10 000", "100 000", "1 millón"), "Ciencia", "El cuerpo humano expresa aproximadamente 100 000 proteínas diferentes, derivadas de la expresión génica, aunque el número exacto varía según los estudios.")
        ),
        BilingualQuestion(
            id = 51342, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le carbonne?", listOf("Antoine Lavoisier", "Aucun", "Johannes Döbereiner", "Humphry Davy"), "Science", "Le carbone est un élément connu depuis l'Antiquité, notamment sous forme de charbon et de diamant, et n'a donc pas été « découvert » par un scientifique spécifique."),
            en = LocalizedContent("Which scientist discovered carbon?", listOf("Antoine Lavoisier", "None", "Johannes Döbereiner", "Humphry Davy"), "Science", "Carbon has been known since antiquity, especially as charcoal and diamond, so it was not 'discovered' by a specific scientist."),
            zh = LocalizedContent("哪位科学家发现了碳？", listOf("安托万·拉瓦锡", "无", "约翰·德贝赖纳", "汉弗里·戴维"), "科学", "碳自古以来就被人类所知，尤其是以木炭和钻石的形式，因此并非由某位特定科学家“发现”。"),
            es = LocalizedContent("¿Qué científico descubrió el carbono?", listOf("Antoine Lavoisier", "Ninguno", "Johannes Döbereiner", "Humphry Davy"), "Ciencia", "El carbono se conoce desde la antigüedad, especialmente como carbón y diamante, por lo que no fue 'descubierto' por un científico específico.")
        ),
        BilingualQuestion(
            id = 51343, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de bactéries dans le corps humain?", listOf("1 million", "1 milliard", "100 milliards", "100 trillions"), "Science", "Le corps humain abrite environ 100 000 milliards de bactéries, principalement dans l'intestin, ce qui dépasse largement le nombre de nos propres cellules."),
            en = LocalizedContent("What is the largest number of bacteria in the human body?", listOf("1 million", "1 billion", "100 billion", "100 trillion"), "Science", "The human body hosts about 100 trillion bacteria, mainly in the gut, far exceeding the number of our own cells."),
            zh = LocalizedContent("人体中细菌的最大数量是多少？", listOf("100万", "10亿", "1000亿", "100万亿"), "科学", "人体内约有100万亿个细菌，主要存在于肠道，远超我们自身细胞的数量。"),
            es = LocalizedContent("¿Cuál es el mayor número de bacterias en el cuerpo humano?", listOf("1 millón", "1 billón", "100 billones", "100 trillones"), "Ciencia", "El cuerpo humano alberga alrededor de 100 billones de bacterias, principalmente en el intestino, superando con creces el número de nuestras propias células.")
        ),
        BilingualQuestion(
            id = 51344, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert l'azote?", listOf("Daniel Rutherford", "Carl Wilhelm Scheele", "Joseph Priestley", "Aucun"), "Science", "Daniel Rutherford, médecin et chimiste écossais, isola l'azote en 1772 en retirant l'oxygène et le dioxyde de carbone de l'air."),
            en = LocalizedContent("Which scientist discovered nitrogen?", listOf("Daniel Rutherford", "Carl Wilhelm Scheele", "Joseph Priestley", "None"), "Science", "Daniel Rutherford, a Scottish physician and chemist, isolated nitrogen in 1772 by removing oxygen and carbon dioxide from air."),
            zh = LocalizedContent("哪位科学家发现了氮？", listOf("丹尼尔·卢瑟福", "卡尔·威廉·舍勒", "约瑟夫·普里斯特利", "无"), "科学", "苏格兰医生兼化学家丹尼尔·卢瑟福于1772年通过从空气中去除氧气和二氧化碳分离出氮气。"),
            es = LocalizedContent("¿Qué científico descubrió el nitrógeno?", listOf("Daniel Rutherford", "Carl Wilhelm Scheele", "Joseph Priestley", "Ninguno"), "Ciencia", "Daniel Rutherford, médico y químico escocés, aisló el nitrógeno en 1772 al eliminar el oxígeno y el dióxido de carbono del aire.")
        ),
        BilingualQuestion(
            id = 51345, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de virus dans le corps humain?", listOf("1000", "1 million", "100 milliards", "1 trillion"), "Science", "Le corps humain abrite environ 100 milliards de virus, principalement dans le microbiome intestinal, où ils jouent un rôle dans la régulation des bactéries et du système immunitaire."),
            en = LocalizedContent("What is the largest number of viruses in the human body?", listOf("1000", "1 million", "100 billion", "1 trillion"), "Science", "The human body hosts about 100 billion viruses, mainly in the gut microbiome, where they play a role in regulating bacteria and the immune system."),
            zh = LocalizedContent("人体中病毒的最大数量是多少？", listOf("1000", "100万", "1000亿", "1万亿"), "科学", "人体内约有1000亿个病毒，主要存在于肠道微生物组中，它们在调节细菌和免疫系统方面发挥作用。"),
            es = LocalizedContent("¿Cuál es el mayor número de virus en el cuerpo humano?", listOf("1000", "1 millón", "100 billones", "1 trillón"), "Ciencia", "El cuerpo humano alberga alrededor de 100 billones de virus, principalmente en el microbioma intestinal, donde desempeñan un papel en la regulación de las bacterias y el sistema inmunológico.")
        ),
        BilingualQuestion(
            id = 51346, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert l'oxygène?", listOf("Joseph Priestley", "Carl Wilhelm Scheele", "Antoine Lavoisier", "Aucun"), "Science", "Antoine Lavoisier a identifié et nommé l'oxygène en 1778, démontrant son rôle dans la combustion et la respiration, ce qui a révolutionné la chimie en renversant la théorie du phlogistique."),
            en = LocalizedContent("Which scientist discovered oxygen?", listOf("Joseph Priestley", "Carl Wilhelm Scheele", "Antoine Lavoisier", "None"), "Science", "Antoine Lavoisier identified and named oxygen in 1778, demonstrating its role in combustion and respiration, revolutionizing chemistry by overturning the phlogiston theory."),
            zh = LocalizedContent("哪位科学家发现了氧气？", listOf("约瑟夫·普里斯特利", "卡尔·威廉·舍勒", "安托万·拉瓦锡", "无"), "科学", "安托万·拉瓦锡于1778年识别并命名了氧气，证明了其在燃烧和呼吸中的作用，推翻了燃素说，彻底改变了化学。"),
            es = LocalizedContent("¿Qué científico descubrió el oxígeno?", listOf("Joseph Priestley", "Carl Wilhelm Scheele", "Antoine Lavoisier", "Ninguno"), "Ciencia", "Antoine Lavoisier identificó y nombró el oxígeno en 1778, demostrando su papel en la combustión y la respiración, revolucionando la química al derrocar la teoría del flogisto.")
        ),
        BilingualQuestion(
            id = 51347, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de mitochondries dans une cellule?", listOf("10", "100", "1000", "10 000"), "Science", "Les cellules ayant les plus forts besoins énergétiques, comme les cellules musculaires ou hépatiques, peuvent contenir jusqu'à 10 000 mitochondries."),
            en = LocalizedContent("What is the largest number of mitochondria in a cell?", listOf("10", "100", "1000", "10,000"), "Science", "Cells with the highest energy demands, such as muscle or liver cells, can contain up to 10,000 mitochondria."),
            zh = LocalizedContent("一个细胞中线粒体的最大数量是多少？", listOf("10", "100", "1000", "10000"), "科学", "能量需求最高的细胞，如肌肉细胞或肝细胞，可含有多达10000个线粒体。"),
            es = LocalizedContent("¿Cuál es el mayor número de mitocondrias en una célula?", listOf("10", "100", "1000", "10 000"), "Ciencia", "Las células con mayores demandas energéticas, como las células musculares o hepáticas, pueden contener hasta 10 000 mitocondrias.")
        ),
        BilingualQuestion(
            id = 51348, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert l'hydrogène?", listOf("Henry Cavendish", "Carl Wilhelm Scheele", "Joseph Priestley", "Aucun"), "Science", "Henry Cavendish a isolé et identifié l'hydrogène en 1766 lors d'expériences sur des métaux et des acides, le nommant \"air inflammable\"."),
            en = LocalizedContent("Which scientist discovered hydrogen?", listOf("Henry Cavendish", "Carl Wilhelm Scheele", "Joseph Priestley", "None"), "Science", "Henry Cavendish isolated and identified hydrogen in 1766 during experiments with metals and acids, naming it 'inflammable air'."),
            zh = LocalizedContent("哪位科学家发现了氢气？", listOf("亨利·卡文迪什", "卡尔·威廉·舍勒", "约瑟夫·普里斯特利", "无"), "科学", "亨利·卡文迪什于1766年在金属与酸的实验中分离并识别出氢气，将其命名为“可燃空气”。"),
            es = LocalizedContent("¿Qué científico descubrió el hidrógeno?", listOf("Henry Cavendish", "Carl Wilhelm Scheele", "Joseph Priestley", "Ninguno"), "Ciencia", "Henry Cavendish aisló e identificó el hidrógeno en 1766 durante experimentos con metales y ácidos, nombrándolo 'aire inflamable'.")
        ),
        BilingualQuestion(
            id = 51349, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de ribosomes dans une cellule?", listOf("100", "1000", "10 000", "100 000"), "Science", "Les ribosomes sont des organites essentiels à la synthèse des protéines, et une cellule peut en contenir jusqu'à 10 000, notamment dans les cellules très actives comme les hépatocytes."),
            en = LocalizedContent("What is the largest number of ribosomes in a cell?", listOf("100", "1000", "10,000", "100,000"), "Science", "Ribosomes are essential organelles for protein synthesis, and a cell can contain up to 10,000, especially in highly active cells like hepatocytes."),
            zh = LocalizedContent("一个细胞中核糖体的最大数量是多少？", listOf("100", "1000", "10000", "100000"), "科学", "核糖体是蛋白质合成所必需的细胞器，一个细胞可含有多达10000个，尤其是在高度活跃的细胞如肝细胞中。"),
            es = LocalizedContent("¿Cuál es el mayor número de ribosomas en una célula?", listOf("100", "1000", "10 000", "100 000"), "Ciencia", "Los ribosomas son orgánulos esenciales para la síntesis de proteínas, y una célula puede contener hasta 10 000, especialmente en células muy activas como los hepatocitos.")
        ),
        BilingualQuestion(
            id = 51350, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert le cuivre?", listOf("Aucun (naturel)", "Johannes Döbereiner", "Humphry Davy", "Antoine Lavoisier"), "Science", "Le cuivre est connu et utilisé par l'humanité depuis la préhistoire, bien avant l'émergence de la science moderne, donc aucun scientifique spécifique n'en est le découvreur."),
            en = LocalizedContent("Which scientist discovered copper?", listOf("None (natural)", "Johannes Döbereiner", "Humphry Davy", "Antoine Lavoisier"), "Science", "Copper has been known and used by humanity since prehistoric times, long before the emergence of modern science, so no specific scientist discovered it."),
            zh = LocalizedContent("哪位科学家发现了铜？", listOf("无（天然存在）", "约翰·德贝赖纳", "汉弗里·戴维", "安托万·拉瓦锡"), "科学", "铜自史前时代就已被人类认识和使用，远在现代科学出现之前，因此没有特定的科学家发现它。"),
            es = LocalizedContent("¿Qué científico descubrió el cobre?", listOf("Ninguno (natural)", "Johannes Döbereiner", "Humphry Davy", "Antoine Lavoisier"), "Ciencia", "El cobre se conoce y utiliza desde tiempos prehistóricos, mucho antes del surgimiento de la ciencia moderna, por lo que ningún científico específico lo descubrió.")
        ),
        BilingualQuestion(
            id = 51351, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays d'Afrique?", listOf("Égypte", "Algérie", "Nigeria", "Soudan"), "Géographie", "L'Algérie est le plus grand pays d'Afrique avec une superficie d'environ 2,38 millions de kilomètres carrés, dépassant la République démocratique du Congo et le Soudan."),
            en = LocalizedContent("What is the largest country in Africa?", listOf("Egypt", "Algeria", "Nigeria", "Sudan"), "Geography", "Algeria is the largest country in Africa with an area of about 2.38 million square kilometers, surpassing the Democratic Republic of the Congo and Sudan."),
            zh = LocalizedContent("非洲最大的国家是哪个？", listOf("埃及", "阿尔及利亚", "尼日利亚", "苏丹"), "地理", "阿尔及利亚是非洲最大的国家，面积约238万平方公里，超过刚果民主共和国和苏丹。"),
            es = LocalizedContent("¿Cuál es el país más grande de África?", listOf("Egipto", "Argelia", "Nigeria", "Sudán"), "Geografía", "Argelia es el país más grande de África con una superficie de aproximadamente 2,38 millones de kilómetros cuadrados, superando a la República Democrática del Congo y Sudán.")
        ),
        BilingualQuestion(
            id = 51353, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays d'Asie?", listOf("Russie", "Chine", "Inde", "Kazakhstan"), "Géographie", "La Russie est le plus grand pays du monde, et sa partie asiatique, la Sibérie, représente environ 77% de son territoire, ce qui en fait le plus grand pays d'Asie."),
            en = LocalizedContent("What is the largest country in Asia?", listOf("Russia", "China", "India", "Kazakhstan"), "Geography", "Russia is the largest country in the world, and its Asian part, Siberia, accounts for about 77% of its territory, making it the largest country in Asia."),
            zh = LocalizedContent("亚洲最大的国家是哪个？", listOf("俄罗斯", "中国", "印度", "哈萨克斯坦"), "地理", "俄罗斯是世界上最大的国家，其亚洲部分西伯利亚约占其领土的77%，使其成为亚洲最大的国家。"),
            es = LocalizedContent("¿Cuál es el país más grande de Asia?", listOf("Rusia", "China", "India", "Kazajistán"), "Geografía", "Rusia es el país más grande del mundo, y su parte asiática, Siberia, representa aproximadamente el 77% de su territorio, lo que lo convierte en el país más grande de Asia.")
        ),
        BilingualQuestion(
            id = 51354, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays africain le plus peuplé?", listOf("Égypte", "Éthiopie", "Nigeria", "Congo"), "Géographie", "Le Nigeria est le pays le plus peuplé d'Afrique avec plus de 200 millions d'habitants, dépassant largement l'Éthiopie et l'Égypte."),
            en = LocalizedContent("What is the most populous African country?", listOf("Egypt", "Ethiopia", "Nigeria", "Congo"), "Geography", "Nigeria is the most populous country in Africa with over 200 million inhabitants, far surpassing Ethiopia and Egypt."),
            zh = LocalizedContent("非洲人口最多的国家是哪个？", listOf("埃及", "埃塞俄比亚", "尼日利亚", "刚果"), "地理", "尼日利亚是非洲人口最多的国家，拥有超过2亿居民，远超埃塞俄比亚和埃及。"),
            es = LocalizedContent("¿Cuál es el país africano más poblado?", listOf("Egipto", "Etiopía", "Nigeria", "Congo"), "Geografía", "Nigeria es el país más poblado de África con más de 200 millones de habitantes, superando ampliamente a Etiopía y Egipto.")
        ),
        BilingualQuestion(
            id = 51355, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand océan?", listOf("Atlantique", "Indien", "Pacifique", "Arctique"), "Géographie", "L'océan Pacifique est le plus vaste et le plus profond des océans, couvrant environ un tiers de la surface terrestre."),
            en = LocalizedContent("What is the largest ocean?", listOf("Atlantic", "Indian", "Pacific", "Arctic"), "Geography", "The Pacific Ocean is the largest and deepest ocean, covering about one-third of the Earth's surface."),
            zh = LocalizedContent("最大的海洋是哪个？", listOf("大西洋", "印度洋", "太平洋", "北冰洋"), "地理", "太平洋是最大、最深的海洋，覆盖了地球表面约三分之一。"),
            es = LocalizedContent("¿Cuál es el océano más grande?", listOf("Atlántico", "Índico", "Pacífico", "Ártico"), "Geografía", "El océano Pacífico es el más grande y profundo, cubriendo aproximadamente un tercio de la superficie terrestre.")
        ),
        BilingualQuestion(
            id = 51356, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet d'Afrique?", listOf("Mont Kenya", "Kilimandjaro", "Atlas", "Rwenzori"), "Géographie", "Le Kilimandjaro, situé en Tanzanie, culmine à 5 895 mètres, ce qui en fait le point le plus élevé du continent africain."),
            en = LocalizedContent("What is the highest peak in Africa?", listOf("Mount Kenya", "Kilimanjaro", "Atlas", "Rwenzori"), "Geography", "Kilimanjaro, located in Tanzania, rises to 5,895 meters, making it the highest point on the African continent."),
            zh = LocalizedContent("非洲最高的山峰是哪个？", listOf("肯尼亚山", "乞力马扎罗山", "阿特拉斯山", "鲁文佐里山"), "地理", "乞力马扎罗山位于坦桑尼亚，海拔5895米，是非洲大陆的最高点。"),
            es = LocalizedContent("¿Cuál es el pico más alto de África?", listOf("Monte Kenia", "Kilimanjaro", "Atlas", "Rwenzori"), "Geografía", "El Kilimanjaro, ubicado en Tanzania, alcanza los 5.895 metros, lo que lo convierte en el punto más alto del continente africano.")
        ),
        BilingualQuestion(
            id = 51359, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays sans accès à la mer?", listOf("Bolivie", "Lesotho", "Ouganda", "Tous les trois"), "Géographie", "Les trois pays proposés dans la question (par exemple l'Ouzbékistan, le Liechtenstein et le Paraguay) sont tous des États enclavés, sans accès direct à un océan."),
            en = LocalizedContent("Which country is landlocked?", listOf("Bolivia", "Lesotho", "Uganda", "All three"), "Geography", "All three countries listed in the question (e.g., Uzbekistan, Liechtenstein, and Paraguay) are landlocked states without direct access to an ocean."),
            zh = LocalizedContent("哪个国家是内陆国？", listOf("玻利维亚", "莱索托", "乌干达", "以上都是"), "地理", "问题中列出的三个国家（例如乌兹别克斯坦、列支敦士登和巴拉圭）都是内陆国，没有直接出海口。"),
            es = LocalizedContent("¿Qué país no tiene salida al mar?", listOf("Bolivia", "Lesoto", "Uganda", "Los tres"), "Geografía", "Los tres países propuestos en la pregunta (por ejemplo, Uzbekistán, Liechtenstein y Paraguay) son estados sin litoral, sin acceso directo a un océano.")
        ),
        BilingualQuestion(
            id = 51361, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays île le plus grand d'Afrique?", listOf("Madagascar", "Zanzibar", "Île Maurice", "Seychelles"), "Géographie", "Madagascar est la plus grande île d'Afrique et la quatrième du monde, située dans l'océan Indien au large de la côte mozambicaine."),
            en = LocalizedContent("What is the largest island country in Africa?", listOf("Madagascar", "Zanzibar", "Mauritius", "Seychelles"), "Geography", "Madagascar is the largest island in Africa and the fourth largest in the world, located in the Indian Ocean off the coast of Mozambique."),
            zh = LocalizedContent("非洲最大的岛国是哪个？", listOf("马达加斯加", "桑给巴尔", "毛里求斯", "塞舌尔"), "地理", "马达加斯加是非洲最大的岛屿，世界第四大岛，位于印度洋，莫桑比克海岸外。"),
            es = LocalizedContent("¿Cuál es el país insular más grande de África?", listOf("Madagascar", "Zanzíbar", "Mauricio", "Seychelles"), "Geografía", "Madagascar es la isla más grande de África y la cuarta del mundo, situada en el océano Índico frente a la costa de Mozambique.")
        ),
        BilingualQuestion(
            id = 51366, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le désert le plus grand d'Afrique?", listOf("Sahara", "Kalahari", "Namib", "Tanami"), "Géographie", "Le Sahara s'étend sur environ 9,2 millions de kilomètres carrés, couvrant une grande partie de l'Afrique du Nord, ce qui en fait le plus vaste désert chaud du continent et du monde."),
            en = LocalizedContent("What is the largest desert in Africa?", listOf("Sahara", "Kalahari", "Namib", "Tanami"), "Geography", "The Sahara covers about 9.2 million square kilometers, spanning much of North Africa, making it the largest hot desert on the continent and in the world."),
            zh = LocalizedContent("非洲最大的沙漠是哪个？", listOf("撒哈拉沙漠", "卡拉哈里沙漠", "纳米布沙漠", "塔纳米沙漠"), "地理", "撒哈拉沙漠面积约920万平方公里，覆盖北非大部分地区，是非洲和世界上最大的热带沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de África?", listOf("Sáhara", "Kalahari", "Namib", "Tanami"), "Geografía", "El Sáhara se extiende sobre unos 9,2 millones de kilómetros cuadrados, cubriendo gran parte del norte de África, lo que lo convierte en el desierto cálido más grande del continente y del mundo.")
        ),
        BilingualQuestion(
            id = 51368, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet d'Asie?", listOf("Everest", "K2", "Kangchenjunga", "Makalu"), "Géographie", "L'Everest, culminant à 8 848 mètres, est le plus haut sommet du monde et se situe dans la chaîne de l'Himalaya, à la frontière entre le Népal et le Tibet."),
            en = LocalizedContent("What is the highest peak in Asia?", listOf("Everest", "K2", "Kangchenjunga", "Makalu"), "Geography", "Mount Everest, at 8,848 meters, is the highest peak in the world and is located in the Himalayas on the border between Nepal and Tibet."),
            zh = LocalizedContent("亚洲最高的山峰是哪个？", listOf("珠穆朗玛峰", "乔戈里峰", "干城章嘉峰", "马卡鲁峰"), "地理", "珠穆朗玛峰海拔8848米，是世界最高峰，位于喜马拉雅山脉，尼泊尔和西藏边界。"),
            es = LocalizedContent("¿Cuál es el pico más alto de Asia?", listOf("Everest", "K2", "Kangchenjunga", "Makalu"), "Geografía", "El Everest, con 8.848 metros, es el pico más alto del mundo y se encuentra en la cordillera del Himalaya, en la frontera entre Nepal y el Tíbet.")
        ),
        BilingualQuestion(
            id = 51369, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Asie?", listOf("Yangtze", "Mékong", "Gange", "Amour"), "Géographie", "Le Yangtze, long de 6 300 km, traverse la Chine du Tibet à Shanghai, ce qui en fait le plus long fleuve d'Asie et le troisième au monde."),
            en = LocalizedContent("What is the longest river in Asia?", listOf("Yangtze", "Mekong", "Ganges", "Amur"), "Geography", "The Yangtze River, 6,300 km long, flows through China from Tibet to Shanghai, making it the longest river in Asia and the third longest in the world."),
            zh = LocalizedContent("亚洲最长的河流是哪个？", listOf("长江", "湄公河", "恒河", "黑龙江"), "地理", "长江全长6300公里，从西藏流经中国至上海，是亚洲最长的河流，世界第三长。"),
            es = LocalizedContent("¿Cuál es el río más largo de Asia?", listOf("Yangtsé", "Mekong", "Ganges", "Amur"), "Geografía", "El río Yangtsé, de 6.300 km de longitud, atraviesa China desde el Tíbet hasta Shanghái, lo que lo convierte en el río más largo de Asia y el tercero del mundo.")
        ),
        BilingualQuestion(
            id = 51370, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus large détroit du monde?", listOf("Détroit de Béring", "Détroit de Malacca", "Détroit du Bosphore", "Détroit de Magellan"), "Géographie", "Le détroit de Béring, entre la Russie et l'Alaska, est le plus large du monde avec environ 82 kilomètres à son point le plus étroit."),
            en = LocalizedContent("What is the widest strait in the world?", listOf("Bering Strait", "Strait of Malacca", "Bosphorus Strait", "Strait of Magellan"), "Geography", "The Bering Strait, between Russia and Alaska, is the widest in the world, approximately 82 kilometers at its narrowest point."),
            zh = LocalizedContent("世界上最宽的海峡是哪个？", listOf("白令海峡", "马六甲海峡", "博斯普鲁斯海峡", "麦哲伦海峡"), "地理", "白令海峡位于俄罗斯和阿拉斯加之间，最窄处约82公里，是世界上最宽的海峡。"),
            es = LocalizedContent("¿Cuál es el estrecho más ancho del mundo?", listOf("Estrecho de Bering", "Estrecho de Malaca", "Estrecho del Bósforo", "Estrecho de Magallanes"), "Geografía", "El estrecho de Bering, entre Rusia y Alaska, es el más ancho del mundo, con aproximadamente 82 kilómetros en su punto más estrecho.")
        ),
        BilingualQuestion(
            id = 51371, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus haut sommet des Amériques?", listOf("Aconcagua", "Denali", "Popocatépetl", "Chimborazo"), "Géographie", "L'Aconcagua culmine à 6 961 mètres dans la cordillère des Andes, en Argentine. Il est le plus haut sommet des Amériques et de l'hémisphère sud."),
            en = LocalizedContent("What is the highest peak in the Americas?", listOf("Aconcagua", "Denali", "Popocatépetl", "Chimborazo"), "Geography", "Aconcagua rises to 6,961 meters in the Andes mountain range in Argentina. It is the highest peak in the Americas and the Southern Hemisphere."),
            zh = LocalizedContent("美洲最高的山峰是哪座？", listOf("阿空加瓜山", "德纳里山", "波波卡特佩特火山", "钦博拉索山"), "地理", "阿空加瓜山位于阿根廷安第斯山脉，海拔6961米，是美洲和南半球的最高峰。"),
            es = LocalizedContent("¿Cuál es la cumbre más alta de las Américas?", listOf("Aconcagua", "Denali", "Popocatépetl", "Chimborazo"), "Geografía", "El Aconcagua se eleva a 6.961 metros en la cordillera de los Andes, en Argentina. Es la cumbre más alta de las Américas y del hemisferio sur.")
        ),
        BilingualQuestion(
            id = 51372, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve des Amériques?", listOf("Amazone", "Mississippi", "Rio Grande", "Mackenzie"), "Géographie", "L'Amazone est considéré comme le plus grand fleuve des Amériques en volume d'eau et en longueur, traversant le Pérou, la Colombie et le Brésil avant de se jeter dans l'océan Atlantique."),
            en = LocalizedContent("What is the largest river in the Americas?", listOf("Amazon", "Mississippi", "Rio Grande", "Mackenzie"), "Geography", "The Amazon is considered the largest river in the Americas by water volume and length, flowing through Peru, Colombia, and Brazil before emptying into the Atlantic Ocean."),
            zh = LocalizedContent("美洲最大的河流是哪条？", listOf("亚马逊河", "密西西比河", "格兰德河", "马更些河"), "地理", "亚马逊河按水量和长度被认为是美洲最大的河流，流经秘鲁、哥伦比亚和巴西，注入大西洋。"),
            es = LocalizedContent("¿Cuál es el río más grande de las Américas?", listOf("Amazonas", "Misisipi", "Río Grande", "Mackenzie"), "Geografía", "El Amazonas es considerado el río más grande de las Américas en volumen de agua y longitud, atravesando Perú, Colombia y Brasil antes de desembocar en el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 51373, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert d'Asie?", listOf("Sahara", "Gobi", "Kyzylkoum", "Kalahari"), "Géographie", "Le désert de Gobi s'étend sur le nord de la Chine et le sud de la Mongolie, couvrant environ 1,3 million de kilomètres carrés, ce qui en fait le plus vaste désert d'Asie."),
            en = LocalizedContent("What is the largest desert in Asia?", listOf("Sahara", "Gobi", "Kyzylkum", "Kalahari"), "Geography", "The Gobi Desert stretches across northern China and southern Mongolia, covering about 1.3 million square kilometers, making it the largest desert in Asia."),
            zh = LocalizedContent("亚洲最大的沙漠是哪个？", listOf("撒哈拉沙漠", "戈壁沙漠", "克孜勒库姆沙漠", "卡拉哈里沙漠"), "地理", "戈壁沙漠横跨中国北部和蒙古南部，面积约130万平方公里，是亚洲最大的沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de Asia?", listOf("Sáhara", "Gobi", "Kyzylkum", "Kalahari"), "Geografía", "El desierto de Gobi se extiende por el norte de China y el sur de Mongolia, cubriendo aproximadamente 1,3 millones de kilómetros cuadrados, lo que lo convierte en el desierto más grande de Asia.")
        ),
        BilingualQuestion(
            id = 51376, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus haut sommet d'Europe?", listOf("Mont Blanc", "Mont Rosa", "Dom", "Elbrus"), "Géographie", "Le mont Elbrouz, situé dans le Caucase en Russie, culmine à 5 642 mètres, ce qui en fait le plus haut sommet d'Europe. Son altitude dépasse celle du mont Blanc, souvent considéré à tort comme le point culminant du continent."),
            en = LocalizedContent("What is the highest peak in Europe?", listOf("Mont Blanc", "Monte Rosa", "Dom", "Elbrus"), "Geography", "Mount Elbrus, located in the Caucasus in Russia, rises to 5,642 meters, making it the highest peak in Europe. Its altitude exceeds that of Mont Blanc, often mistakenly considered the continent's highest point."),
            zh = LocalizedContent("欧洲最高的山峰是哪座？", listOf("勃朗峰", "罗莎峰", "多姆峰", "厄尔布鲁士山"), "地理", "厄尔布鲁士山位于俄罗斯高加索地区，海拔5642米，是欧洲最高峰。其高度超过了常被误认为欧洲最高点的勃朗峰。"),
            es = LocalizedContent("¿Cuál es la cumbre más alta de Europa?", listOf("Mont Blanc", "Monte Rosa", "Dom", "Elbrus"), "Geografía", "El monte Elbrus, situado en el Cáucaso en Rusia, se eleva a 5.642 metros, lo que lo convierte en la cumbre más alta de Europa. Su altitud supera la del Mont Blanc, a menudo considerado erróneamente el punto más alto del continente.")
        ),
        BilingualQuestion(
            id = 51377, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'Europe?", listOf("Lac Baïkal", "Lacs des Grands Lacs", "Ladoga", "Onega"), "Géographie", "Le lac Ladoga, situé en Russie, est le plus grand lac d'Europe avec une superficie d'environ 17 700 km². Il se trouve près de Saint-Pétersbourg et est relié à la mer Baltique par la Neva."),
            en = LocalizedContent("What is the largest lake in Europe?", listOf("Lake Baikal", "Great Lakes", "Ladoga", "Onega"), "Geography", "Lake Ladoga, located in Russia, is the largest lake in Europe with an area of about 17,700 km². It is near Saint Petersburg and connected to the Baltic Sea by the Neva River."),
            zh = LocalizedContent("欧洲最大的湖泊是哪个？", listOf("贝加尔湖", "五大湖", "拉多加湖", "奥涅加湖"), "地理", "拉多加湖位于俄罗斯，面积约17700平方公里，是欧洲最大的湖泊。它靠近圣彼得堡，通过涅瓦河与波罗的海相连。"),
            es = LocalizedContent("¿Cuál es el lago más grande de Europa?", listOf("Lago Baikal", "Grandes Lagos", "Ládoga", "Onega"), "Geografía", "El lago Ládoga, situado en Rusia, es el lago más grande de Europa con una superficie de aproximadamente 17.700 km². Se encuentra cerca de San Petersburgo y está conectado con el mar Báltico a través del río Nevá.")
        ),
        BilingualQuestion(
            id = 51378, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert d'Australie?", listOf("Simpson", "Tanami", "Grande Victoria", "Sturt"), "Géographie", "Le désert de Grande Victoria s'étend sur plus de 420 000 km² dans le sud-ouest de l'Australie, ce qui en fait le plus vaste du pays."),
            en = LocalizedContent("What is the largest desert in Australia?", listOf("Simpson", "Tanami", "Great Victoria", "Sturt"), "Geography", "The Great Victoria Desert covers over 420,000 km² in southwestern Australia, making it the largest desert in the country."),
            zh = LocalizedContent("澳大利亚最大的沙漠是哪个？", listOf("辛普森沙漠", "塔纳米沙漠", "大维多利亚沙漠", "斯特尔特沙漠"), "地理", "大维多利亚沙漠位于澳大利亚西南部，面积超过42万平方公里，是该国最大的沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de Australia?", listOf("Simpson", "Tanami", "Gran Victoria", "Sturt"), "Geografía", "El desierto de Gran Victoria cubre más de 420.000 km² en el suroeste de Australia, lo que lo convierte en el desierto más grande del país.")
        ),
        BilingualQuestion(
            id = 51379, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'Australie?", listOf("Torrens", "Gairdner", "Frome", "Baïkal"), "Géographie", "Le lac Torrens est le plus grand lac d'Australie, mais il est souvent à sec, formant une vaste saline endoréique dans le sud du pays."),
            en = LocalizedContent("What is the largest lake in Australia?", listOf("Torrens", "Gairdner", "Frome", "Baikal"), "Geography", "Lake Torrens is the largest lake in Australia, but it is often dry, forming a vast endorheic salt flat in the south of the country."),
            zh = LocalizedContent("澳大利亚最大的湖泊是哪个？", listOf("托伦斯湖", "盖尔德纳湖", "弗罗姆湖", "贝加尔湖"), "地理", "托伦斯湖是澳大利亚最大的湖泊，但经常干涸，在南部形成广阔的內流盐滩。"),
            es = LocalizedContent("¿Cuál es el lago más grande de Australia?", listOf("Torrens", "Gairdner", "Frome", "Baikal"), "Geografía", "El lago Torrens es el lago más grande de Australia, pero a menudo está seco, formando una vasta llanura salina endorreica en el sur del país.")
        ),
        BilingualQuestion(
            id = 51380, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Australie?", listOf("Murray", "Darling", "Swan", "Yarra"), "Géographie", "Le Murray, long de 2 508 km, est le plus grand fleuve d'Australie en termes de débit et de longueur, formant le principal cours d'eau du bassin Murray-Darling."),
            en = LocalizedContent("What is the largest river in Australia?", listOf("Murray", "Darling", "Swan", "Yarra"), "Geography", "The Murray, 2,508 km long, is the largest river in Australia in terms of flow and length, forming the main watercourse of the Murray-Darling basin."),
            zh = LocalizedContent("澳大利亚最大的河流是哪条？", listOf("墨累河", "达令河", "斯旺河", "亚拉河"), "地理", "墨累河长2508公里，按流量和长度是澳大利亚最大的河流，构成墨累-达令盆地的主要水道。"),
            es = LocalizedContent("¿Cuál es el río más grande de Australia?", listOf("Murray", "Darling", "Swan", "Yarra"), "Geografía", "El Murray, de 2.508 km de longitud, es el río más grande de Australia en caudal y longitud, formando el curso de agua principal de la cuenca Murray-Darling.")
        ),
        BilingualQuestion(
            id = 51381, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut sommet d'Australie?", listOf("Mont Kosciuszko", "Mont Townsend", "Mont Twynam", "Mont Bogong"), "Géographie", "Le mont Kosciuszko, situé dans les Alpes australiennes, culmine à 2 228 mètres d'altitude, ce qui en fait le point culminant du continent australien."),
            en = LocalizedContent("What is the highest peak in Australia?", listOf("Mount Kosciuszko", "Mount Townsend", "Mount Twynam", "Mount Bogong"), "Geography", "Mount Kosciuszko, located in the Australian Alps, rises to 2,228 meters above sea level, making it the highest point on the Australian continent."),
            zh = LocalizedContent("澳大利亚最高的山峰是哪座？", listOf("科修斯科山", "汤森山", "特怀纳姆山", "博贡山"), "地理", "科修斯科山位于澳大利亚阿尔卑斯山脉，海拔2228米，是澳大利亚大陆的最高点。"),
            es = LocalizedContent("¿Cuál es la cumbre más alta de Australia?", listOf("Monte Kosciuszko", "Monte Townsend", "Monte Twynam", "Monte Bogong"), "Geografía", "El monte Kosciuszko, situado en los Alpes australianos, se eleva a 2.228 metros sobre el nivel del mar, lo que lo convierte en el punto más alto del continente australiano.")
        ),
        BilingualQuestion(
            id = 51382, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pays d'Europe?", listOf("Russie", "France", "Ukraine", "Espagne"), "Géographie", "La Russie est le plus grand pays du monde en superficie, et sa partie européenne s'étend jusqu'à l'Oural, ce qui en fait le plus grand pays d'Europe."),
            en = LocalizedContent("What is the largest country in Europe?", listOf("Russia", "France", "Ukraine", "Spain"), "Geography", "Russia is the largest country in the world by area, and its European part extends to the Urals, making it the largest country in Europe."),
            zh = LocalizedContent("欧洲最大的国家是哪个？", listOf("俄罗斯", "法国", "乌克兰", "西班牙"), "地理", "俄罗斯是世界上面积最大的国家，其欧洲部分延伸至乌拉尔山脉，因此是欧洲最大的国家。"),
            es = LocalizedContent("¿Cuál es el país más grande de Europa?", listOf("Rusia", "Francia", "Ucrania", "España"), "Geografia", "Rusia es el país más grande del mundo en superficie, y su parte europea se extiende hasta los Urales, lo que lo convierte en el país más grande de Europa.")
        ),
        BilingualQuestion(
            id = 51383, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit pays d'Europe?", listOf("Liechtenstein", "Luxembourg", "Vatican", "Monaco"), "Géographie", "Le Vatican, enclavé dans Rome, est le plus petit État indépendant du monde avec une superficie de 0,44 km²."),
            en = LocalizedContent("What is the smallest country in Europe?", listOf("Liechtenstein", "Luxembourg", "Vatican City", "Monaco"), "Geography", "Vatican City, enclaved within Rome, is the smallest independent state in the world with an area of 0.44 km²."),
            zh = LocalizedContent("欧洲最小的国家是哪个？", listOf("列支敦士登", "卢森堡", "梵蒂冈", "摩纳哥"), "地理", "梵蒂冈位于罗马城内，是世界上最小的独立国家，面积仅0.44平方公里。"),
            es = LocalizedContent("¿Cuál es el país más pequeño de Europa?", listOf("Liechtenstein", "Luxemburgo", "Ciudad del Vaticano", "Mónaco"), "Geografia", "La Ciudad del Vaticano, enclavada en Roma, es el estado independiente más pequeño del mundo con una superficie de 0,44 km².")
        ),
        BilingualQuestion(
            id = 51384, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays d'Océanie?", listOf("Australie", "Nouvelle-Zélande", "Fidji", "Papouasie"), "Géographie", "L'Australie est le plus grand pays d'Océanie, avec une superficie d'environ 7,7 millions de kilomètres carrés, dominant largement la région."),
            en = LocalizedContent("What is the largest country in Oceania?", listOf("Australia", "New Zealand", "Fiji", "Papua New Guinea"), "Geography", "Australia is the largest country in Oceania, with an area of about 7.7 million square kilometers, dominating the region."),
            zh = LocalizedContent("大洋洲最大的国家是哪个？", listOf("澳大利亚", "新西兰", "斐济", "巴布亚新几内亚"), "地理", "澳大利亚是大洋洲最大的国家，面积约770万平方公里，在该地区占据主导地位。"),
            es = LocalizedContent("¿Cuál es el país más grande de Oceanía?", listOf("Australia", "Nueva Zelanda", "Fiyi", "Papúa Nueva Guinea"), "Geografia", "Australia es el país más grande de Oceanía, con una superficie de aproximadamente 7,7 millones de kilómetros cuadrados, dominando la región.")
        ),
        BilingualQuestion(
            id = 51385, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit pays d'Océanie?", listOf("Nauru", "Tuvalu", "Palaos", "Kiribati"), "Géographie", "Nauru est une île de 21 km², ce qui en fait le plus petit État d'Océanie en superficie, devant les îles Marshall et les Palaos."),
            en = LocalizedContent("What is the smallest country in Oceania?", listOf("Nauru", "Tuvalu", "Palau", "Kiribati"), "Geography", "Nauru is an island of 21 km², making it the smallest state in Oceania by area, ahead of the Marshall Islands and Palau."),
            zh = LocalizedContent("大洋洲最小的国家是哪个？", listOf("瑙鲁", "图瓦卢", "帕劳", "基里巴斯"), "地理", "瑙鲁是一个面积21平方公里的岛屿，是大洋洲面积最小的国家，小于马绍尔群岛和帕劳。"),
            es = LocalizedContent("¿Cuál es el país más pequeño de Oceanía?", listOf("Nauru", "Tuvalu", "Palaos", "Kiribati"), "Geografia", "Nauru es una isla de 21 km², lo que lo convierte en el estado más pequeño de Oceanía en superficie, por delante de las Islas Marshall y Palaos.")
        ),
        BilingualQuestion(
            id = 51386, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pays des Amériques?", listOf("Canada", "États-Unis", "Brésil", "Mexique"), "Géographie", "Le Brésil est le plus grand pays des Amériques avec une superficie d'environ 8,5 millions de km², dépassant le Canada et les États-Unis."),
            en = LocalizedContent("What is the largest country in the Americas?", listOf("Canada", "United States", "Brazil", "Mexico"), "Geography", "Brazil is the largest country in the Americas with an area of about 8.5 million km², surpassing Canada and the United States."),
            zh = LocalizedContent("美洲最大的国家是哪个？", listOf("加拿大", "美国", "巴西", "墨西哥"), "地理", "巴西是美洲最大的国家，面积约850万平方公里，超过加拿大和美国。"),
            es = LocalizedContent("¿Cuál es el país más grande de las Américas?", listOf("Canadá", "Estados Unidos", "Brasil", "México"), "Geografia", "Brasil es el país más grande de las Américas con una superficie de aproximadamente 8,5 millones de km², superando a Canadá y Estados Unidos.")
        ),
        BilingualQuestion(
            id = 51387, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit pays des Amériques?", listOf("Bélize", "El Salvador", "Costa Rica", "Panama"), "Géographie", "El Salvador, avec ses 21 041 km², est le plus petit pays d'Amérique continentale, mais Saint-Christophe-et-Niévès (261 km²) est le plus petit du continent américain."),
            en = LocalizedContent("What is the smallest country in the Americas?", listOf("Belize", "El Salvador", "Costa Rica", "Panama"), "Geography", "El Salvador, with its 21,041 km², is the smallest country in mainland America, but Saint Kitts and Nevis (261 km²) is the smallest in the American continent."),
            zh = LocalizedContent("美洲最小的国家是哪个？", listOf("伯利兹", "萨尔瓦多", "哥斯达黎加", "巴拿马"), "地理", "萨尔瓦多面积21,041平方公里，是美洲大陆最小的国家，但圣基茨和尼维斯（261平方公里）是美洲最小的国家。"),
            es = LocalizedContent("¿Cuál es el país más pequeño de las Américas?", listOf("Belice", "El Salvador", "Costa Rica", "Panamá"), "Geografia", "El Salvador, con sus 21.041 km², es el país más pequeño de América continental, pero San Cristóbal y Nieves (261 km²) es el más pequeño del continente americano.")
        ),
        BilingualQuestion(
            id = 51389, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de frontières?", listOf("France", "Russie", "Chine", "Canada"), "Géographie", "La Chine partage des frontières terrestres avec 14 pays voisins, incluant la Russie, l'Inde et le Vietnam. Ce nombre élevé s'explique par sa vaste superficie et sa position centrale en Asie."),
            en = LocalizedContent("Which country has the most borders?", listOf("France", "Russia", "China", "Canada"), "Geography", "China shares land borders with 14 neighboring countries, including Russia, India, and Vietnam. This high number is due to its vast area and central position in Asia."),
            zh = LocalizedContent("哪个国家的边境线最多？", listOf("法国", "俄罗斯", "中国", "加拿大"), "地理", "中国与14个邻国接壤，包括俄罗斯、印度和越南。这一高数量源于其广阔的领土和亚洲的中心位置。"),
            es = LocalizedContent("¿Qué país tiene más fronteras?", listOf("Francia", "Rusia", "China", "Canadá"), "Geografia", "China comparte fronteras terrestres con 14 países vecinos, incluyendo Rusia, India y Vietnam. Este alto número se debe a su vasta superficie y posición central en Asia.")
        ),
        BilingualQuestion(
            id = 51391, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus profond endroit du monde?", listOf("Mariana", "Challenger", "Acapulco", "Kuril"), "Géographie", "La fosse des Mariannes, située dans l'océan Pacifique, est l'endroit le plus profond connu sur Terre, avec son point le plus bas, le Challenger Deep, descendant à environ 11 000 mètres."),
            en = LocalizedContent("What is the deepest place in the world?", listOf("Mariana", "Challenger", "Acapulco", "Kuril"), "Geography", "The Mariana Trench, located in the Pacific Ocean, is the deepest known place on Earth, with its lowest point, the Challenger Deep, descending to about 11,000 meters."),
            zh = LocalizedContent("世界上最深的地方是哪里？", listOf("马里亚纳", "挑战者", "阿卡普尔科", "千岛"), "地理", "马里亚纳海沟位于太平洋，是地球上已知最深的地方，其最深处挑战者深渊深约11,000米。"),
            es = LocalizedContent("¿Cuál es el lugar más profundo del mundo?", listOf("Mariana", "Challenger", "Acapulco", "Kuril"), "Geografia", "La fosa de las Marianas, situada en el océano Pacífico, es el lugar más profundo conocido en la Tierra, con su punto más bajo, el Abismo Challenger, descendiendo a unos 11.000 metros.")
        ),
        BilingualQuestion(
            id = 51392, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand récif corallien du monde?", listOf("Belize", "Australie", "Hawaii", "Polynésie"), "Géographie", "La Grande Barrière de corail, située au large de la côte nord-est de l'Australie, est le plus grand système récifal corallien du monde, s'étendant sur plus de 2 300 kilomètres."),
            en = LocalizedContent("What is the largest coral reef in the world?", listOf("Belize", "Australia", "Hawaii", "Polynesia"), "Geography", "The Great Barrier Reef, located off the northeast coast of Australia, is the largest coral reef system in the world, stretching over 2,300 kilometers."),
            zh = LocalizedContent("世界上最大的珊瑚礁是哪个？", listOf("伯利兹", "澳大利亚", "夏威夷", "波利尼西亚"), "地理", "大堡礁位于澳大利亚东北海岸外，是世界上最大的珊瑚礁系统，绵延超过2,300公里。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande del mundo?", listOf("Belice", "Australia", "Hawái", "Polinesia"), "Geografia", "La Gran Barrera de Coral, situada frente a la costa noreste de Australia, es el sistema de arrecifes de coral más grande del mundo, extendiéndose por más de 2.300 kilómetros.")
        ),
        BilingualQuestion(
            id = 51393, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand fleuve du Brésil?", listOf("Amazone", "São Francisco", "Rio Grande", "Negro"), "Géographie", "L'Amazone, bien qu'il traverse plusieurs pays d'Amérique du Sud, a la majeure partie de son bassin au Brésil, ce qui en fait le plus grand fleuve du pays."),
            en = LocalizedContent("What is the largest river in Brazil?", listOf("Amazon", "São Francisco", "Rio Grande", "Negro"), "Geography", "The Amazon, although it flows through several South American countries, has most of its basin in Brazil, making it the largest river in the country."),
            zh = LocalizedContent("巴西最大的河流是哪条？", listOf("亚马逊河", "圣弗朗西斯科河", "格兰德河", "内格罗河"), "地理", "亚马逊河虽然流经多个南美国家，但其大部分流域位于巴西，因此是巴西最大的河流。"),
            es = LocalizedContent("¿Cuál es el río más grande de Brasil?", listOf("Amazonas", "São Francisco", "Río Grande", "Negro"), "Geografia", "El Amazonas, aunque atraviesa varios países sudamericanos, tiene la mayor parte de su cuenca en Brasil, lo que lo convierte en el río más grande del país.")
        ),
        BilingualQuestion(
            id = 51394, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand fleuve de la Chine?", listOf("Yangtze", "Jaune", "Perlé", "Amour"), "Géographie", "Le Yangtze, long de 6 300 km, traverse la Chine d'ouest en est avant de se jeter dans la mer de Chine orientale. C'est le plus long fleuve d'Asie et le troisième du monde."),
            en = LocalizedContent("What is the longest river in China?", listOf("Yangtze", "Yellow", "Pearl", "Amur"), "Geography", "The Yangtze, 6,300 km long, flows across China from west to east before emptying into the East China Sea. It is the longest river in Asia and the third longest in the world."),
            zh = LocalizedContent("中国最长的河流是哪条？", listOf("长江", "黄河", "珠江", "黑龙江"), "地理", "长江全长6300公里，自西向东横贯中国，注入东海。它是亚洲最长的河流，世界第三长河。"),
            es = LocalizedContent("¿Cuál es el río más largo de China?", listOf("Yangtsé", "Amarillo", "Perla", "Amur"), "Geografía", "El Yangtsé, de 6.300 km de longitud, atraviesa China de oeste a este antes de desembocar en el mar de China Oriental. Es el río más largo de Asia y el tercero del mundo.")
        ),
        BilingualQuestion(
            id = 51395, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays insulaire?", listOf("Madagascar", "Philippines", "Indonésie", "Japon"), "Géographie", "L'Indonésie est le plus grand pays insulaire du monde avec plus de 17 000 îles, dépassant en superficie totale Madagascar, le Japon ou les Philippines."),
            en = LocalizedContent("What is the largest island country?", listOf("Madagascar", "Philippines", "Indonesia", "Japan"), "Geography", "Indonesia is the largest island country in the world with over 17,000 islands, surpassing in total area Madagascar, Japan, or the Philippines."),
            zh = LocalizedContent("最大的岛国是哪个？", listOf("马达加斯加", "菲律宾", "印度尼西亚", "日本"), "地理", "印度尼西亚是世界上最大的岛国，拥有超过17000个岛屿，总面积超过马达加斯加、日本或菲律宾。"),
            es = LocalizedContent("¿Cuál es el país insular más grande?", listOf("Madagascar", "Filipinas", "Indonesia", "Japón"), "Geografía", "Indonesia es el país insular más grande del mundo con más de 17.000 islas, superando en superficie total a Madagascar, Japón o Filipinas.")
        ),
        BilingualQuestion(
            id = 51396, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert froid du monde?", listOf("Gobi", "Sahara", "Antarctique", "Arabie"), "Géographie", "L'Antarctique est considéré comme le plus grand désert froid car il reçoit très peu de précipitations, moins de 50 mm par an, et ses températures extrêmes en font un désert de glace."),
            en = LocalizedContent("What is the largest cold desert in the world?", listOf("Gobi", "Sahara", "Antarctic", "Arabian"), "Geography", "Antarctica is considered the largest cold desert because it receives very little precipitation, less than 50 mm per year, and its extreme temperatures make it an ice desert."),
            zh = LocalizedContent("世界上最大的冷沙漠是哪个？", listOf("戈壁", "撒哈拉", "南极洲", "阿拉伯"), "地理", "南极洲被认为是最大的冷沙漠，因为其年降水量极少，不足50毫米，极端低温使其成为冰沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto frío más grande del mundo?", listOf("Gobi", "Sáhara", "Antártida", "Arábigo"), "Geografía", "La Antártida es considerada el desierto frío más grande porque recibe muy poca precipitación, menos de 50 mm al año, y sus temperaturas extremas la convierten en un desierto de hielo.")
        ),
        BilingualQuestion(
            id = 51398, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan du monde?", listOf("Mauna Kea", "Mont Blanc", "Mauna Loa", "Cotopaxi"), "Géographie", "Le Mauna Loa, à Hawaï, est le plus grand volcan du monde en volume et en superficie, culminant à plus de 9 000 mètres depuis sa base sous-marine."),
            en = LocalizedContent("What is the largest volcano in the world?", listOf("Mauna Kea", "Mont Blanc", "Mauna Loa", "Cotopaxi"), "Geography", "Mauna Loa, in Hawaii, is the largest volcano in the world by volume and area, rising over 9,000 meters from its underwater base."),
            zh = LocalizedContent("世界上最大的火山是哪座？", listOf("莫纳克亚山", "勃朗峰", "莫纳罗亚山", "科托帕希"), "地理", "夏威夷的莫纳罗亚山是世界上体积和面积最大的火山，从海底基部算起高度超过9000米。"),
            es = LocalizedContent("¿Cuál es el volcán más grande del mundo?", listOf("Mauna Kea", "Mont Blanc", "Mauna Loa", "Cotopaxi"), "Geografía", "El Mauna Loa, en Hawái, es el volcán más grande del mundo en volumen y superficie, elevándose más de 9.000 metros desde su base submarina.")
        ),
        BilingualQuestion(
            id = 51399, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long pont du monde?", listOf("Golden Gate", "Vasco da Gama", "Jiaozhou Bay", "Qingdao Haiwan"), "Géographie", "Le pont Qingdao Haiwan, en Chine, s'étend sur 41,58 km à travers la baie de Jiaozhou, ce qui en fait le plus long pont maritime du monde."),
            en = LocalizedContent("What is the longest bridge in the world?", listOf("Golden Gate", "Vasco da Gama", "Jiaozhou Bay", "Qingdao Haiwan"), "Geography", "The Qingdao Haiwan Bridge in China spans 41.58 km across Jiaozhou Bay, making it the longest sea bridge in the world."),
            zh = LocalizedContent("世界上最长的桥是哪座？", listOf("金门大桥", "瓦斯科·达伽马大桥", "胶州湾大桥", "青岛海湾大桥"), "地理", "中国的青岛海湾大桥横跨胶州湾，全长41.58公里，是世界上最长的跨海大桥。"),
            es = LocalizedContent("¿Cuál es el puente más largo del mundo?", listOf("Golden Gate", "Vasco da Gama", "Bahía de Jiaozhou", "Qingdao Haiwan"), "Geografía", "El puente Qingdao Haiwan en China se extiende 41,58 km a través de la bahía de Jiaozhou, lo que lo convierte en el puente marítimo más largo del mundo.")
        ),
        BilingualQuestion(
            id = 51401, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand aéroport du monde?", listOf("Atlanta", "Dubaï", "Los Angeles", "Denver"), "Géographie", "L'aéroport international Hartsfield-Jackson d'Atlanta est le plus fréquenté au monde en nombre de passagers depuis 1998, grâce à son rôle de hub majeur pour Delta Air Lines."),
            en = LocalizedContent("What is the largest airport in the world?", listOf("Atlanta", "Dubai", "Los Angeles", "Denver"), "Geography", "Hartsfield-Jackson Atlanta International Airport has been the busiest airport in the world by passenger traffic since 1998, thanks to its role as a major hub for Delta Air Lines."),
            zh = LocalizedContent("世界上最大的机场是哪个？", listOf("亚特兰大", "迪拜", "洛杉矶", "丹佛"), "地理", "哈茨菲尔德-杰克逊亚特兰大国际机场自1998年以来一直是全球客运量最繁忙的机场，这得益于其作为达美航空主要枢纽的地位。"),
            es = LocalizedContent("¿Cuál es el aeropuerto más grande del mundo?", listOf("Atlanta", "Dubái", "Los Ángeles", "Denver"), "Geografía", "El Aeropuerto Internacional Hartsfield-Jackson de Atlanta ha sido el más transitado del mundo en número de pasajeros desde 1998, gracias a su papel como centro principal de Delta Air Lines.")
        ),
        BilingualQuestion(
            id = 51406, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien pays du monde?", listOf("Japon", "Égypte", "Vaticán", "Chine"), "Géographie", "Le Vatican est considéré comme le plus ancien pays du monde car il a été fondé en 1929 avec les Accords du Latran, ce qui en fait un État souverain reconnu internationalement depuis cette date."),
            en = LocalizedContent("What is the oldest country in the world?", listOf("Japan", "Egypt", "Vatican City", "China"), "Geography", "Vatican City is considered the oldest country in the world because it was founded in 1929 with the Lateran Treaty, making it a sovereign state recognized internationally since that date."),
            zh = LocalizedContent("世界上最古老的国家是哪个？", listOf("日本", "埃及", "梵蒂冈", "中国"), "地理", "梵蒂冈被认为是世界上最古老的国家，因为它于1929年根据《拉特兰条约》成立，自此成为国际公认的主权国家。"),
            es = LocalizedContent("¿Cuál es el país más antiguo del mundo?", listOf("Japón", "Egipto", "Ciudad del Vaticano", "China"), "Geografía", "La Ciudad del Vaticano es considerada el país más antiguo del mundo porque fue fundada en 1929 con los Pactos de Letrán, convirtiéndose en un estado soberano reconocido internacionalmente desde esa fecha.")
        ),
        BilingualQuestion(
            id = 51408, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de forêts?", listOf("Brésil", "Russie", "Canada", "Chine"), "Géographie", "La Russie possède la plus grande superficie forestière du monde, couvrant environ 8,1 millions de km², soit près de 20% des forêts mondiales."),
            en = LocalizedContent("Which country has the most forests?", listOf("Brazil", "Russia", "Canada", "China"), "Geography", "Russia has the largest forest area in the world, covering about 8.1 million km², nearly 20% of the world's forests."),
            zh = LocalizedContent("哪个国家的森林最多？", listOf("巴西", "俄罗斯", "加拿大", "中国"), "地理", "俄罗斯拥有世界上最大的森林面积，约810万平方公里，占全球森林的近20%。"),
            es = LocalizedContent("¿Qué país tiene más bosques?", listOf("Brasil", "Rusia", "Canadá", "China"), "Geografía", "Rusia posee la mayor superficie forestal del mundo, cubriendo aproximadamente 8,1 millones de km², casi el 20% de los bosques mundiales.")
        ),
        BilingualQuestion(
            id = 51409, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de savanes?", listOf("Afrique du Sud", "Kenya", "Tanzanie", "Botswana"), "Géographie", "Le Kenya possède de vastes étendues de savanes, notamment dans le parc national du Serengeti et la réserve nationale du Maasai Mara, qui abritent une faune emblématique."),
            en = LocalizedContent("Which country has the most savannas?", listOf("South Africa", "Kenya", "Tanzania", "Botswana"), "Geography", "Kenya has vast expanses of savannas, notably in Serengeti National Park and Maasai Mara National Reserve, which host iconic wildlife."),
            zh = LocalizedContent("哪个国家的热带草原最多？", listOf("南非", "肯尼亚", "坦桑尼亚", "博茨瓦纳"), "地理", "肯尼亚拥有广阔的热带草原，特别是在塞伦盖蒂国家公园和马赛马拉国家保护区，那里栖息着标志性的野生动物。"),
            es = LocalizedContent("¿Qué país tiene más sabanas?", listOf("Sudáfrica", "Kenia", "Tanzania", "Botsuana"), "Geografía", "Kenia posee vastas extensiones de sabanas, especialmente en el Parque Nacional Serengeti y la Reserva Nacional Maasai Mara, que albergan una fauna emblemática.")
        ),
        BilingualQuestion(
            id = 51410, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de tundras?", listOf("Russie", "Canada", "Groenland", "Islande"), "Géographie", "La Russie possède la plus vaste superficie de toundra au monde, couvrant une grande partie de sa côte arctique et de la Sibérie."),
            en = LocalizedContent("Which country has the most tundra?", listOf("Russia", "Canada", "Greenland", "Iceland"), "Geography", "Russia has the largest area of tundra in the world, covering much of its Arctic coast and Siberia."),
            zh = LocalizedContent("哪个国家的苔原最多？", listOf("俄罗斯", "加拿大", "格陵兰", "冰岛"), "地理", "俄罗斯拥有世界上最大的苔原面积，覆盖了其大部分北极海岸和西伯利亚地区。"),
            es = LocalizedContent("¿Qué país tiene más tundra?", listOf("Rusia", "Canadá", "Groenlandia", "Islandia"), "Geografía", "Rusia tiene la mayor superficie de tundra del mundo, cubriendo gran parte de su costa ártica y Siberia.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51411, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc naturel du monde?", listOf("Parc de Yellowstone", "Serengeti", "Pétrifiés Forest", "Everglades"), "Géographie", "Le parc national du Serengeti en Tanzanie est le plus grand parc naturel du monde, s'étendant sur environ 30 000 km². Il est célèbre pour sa vaste savane et la grande migration annuelle des gnous et des zèbres."),
            en = LocalizedContent("What is the largest natural park in the world?", listOf("Yellowstone Park", "Serengeti", "Petrified Forest", "Everglades"), "Geography", "Serengeti National Park in Tanzania is the largest natural park in the world, covering about 30,000 km². It is famous for its vast savanna and the annual great migration of wildebeest and zebras."),
            zh = LocalizedContent("世界上最大的自然公园是哪个？", listOf("黄石公园", "塞伦盖蒂", "石化森林", "大沼泽地"), "地理", "坦桑尼亚的塞伦盖蒂国家公园是世界上最大的自然公园，面积约3万平方公里。它以广阔的稀树草原和每年角马与斑马的大迁徙而闻名。"),
            es = LocalizedContent("¿Cuál es el parque natural más grande del mundo?", listOf("Parque de Yellowstone", "Serengeti", "Bosque Petrificado", "Everglades"), "Geografía", "El Parque Nacional Serengeti en Tanzania es el parque natural más grande del mundo, con una extensión de aproximadamente 30.000 km². Es famoso por su vasta sabana y la gran migración anual de ñus y cebras.")
        ),
        BilingualQuestion(
            id = 51412, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand zoo du monde?", listOf("San Diego Zoo", "Bronx Zoo", "San Antonio Zoo", "Toledo Zoo"), "Géographie", "Le San Antonio Zoo, au Texas, est reconnu comme le plus grand zoo du monde en termes de superficie, avec plus de 35 hectares dédiés à la conservation animale."),
            en = LocalizedContent("What is the largest zoo in the world?", listOf("San Diego Zoo", "Bronx Zoo", "San Antonio Zoo", "Toledo Zoo"), "Geography", "San Antonio Zoo in Texas is recognized as the largest zoo in the world in terms of area, with over 35 hectares dedicated to animal conservation."),
            zh = LocalizedContent("世界上最大的动物园是哪个？", listOf("圣地亚哥动物园", "布朗克斯动物园", "圣安东尼奥动物园", "托莱多动物园"), "地理", "德克萨斯州的圣安东尼奥动物园被认为是世界上面积最大的动物园，占地超过35公顷，致力于动物保护。"),
            es = LocalizedContent("¿Cuál es el zoológico más grande del mundo?", listOf("Zoológico de San Diego", "Zoológico del Bronx", "Zoológico de San Antonio", "Zoológico de Toledo"), "Geografía", "El Zoológico de San Antonio en Texas es reconocido como el zoológico más grande del mundo en términos de superficie, con más de 35 hectáreas dedicadas a la conservación animal.")
        ),
        BilingualQuestion(
            id = 51413, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand aquarium du monde?", listOf("Georgia Aquarium", "Dubai Mall", "Okinawa Churaumi", "Shanghai Ocean"), "Géographie", "Le Georgia Aquarium à Atlanta, États-Unis, détient le record du plus grand aquarium du monde avec plus de 30 millions de litres d'eau."),
            en = LocalizedContent("What is the largest aquarium in the world?", listOf("Georgia Aquarium", "Dubai Mall", "Okinawa Churaumi", "Shanghai Ocean"), "Geography", "The Georgia Aquarium in Atlanta, USA, holds the record for the largest aquarium in the world with over 30 million liters of water."),
            zh = LocalizedContent("世界上最大的水族馆是哪个？", listOf("乔治亚水族馆", "迪拜购物中心", "冲绳美丽海水族馆", "上海海洋水族馆"), "地理", "美国亚特兰大的乔治亚水族馆拥有超过3000万升水，保持着世界上最大水族馆的纪录。"),
            es = LocalizedContent("¿Cuál es el acuario más grande del mundo?", listOf("Acuario de Georgia", "Dubai Mall", "Okinawa Churaumi", "Shanghai Ocean"), "Geografía", "El Acuario de Georgia en Atlanta, EE. UU., ostenta el récord del acuario más grande del mundo con más de 30 millones de litros de agua.")
        ),
        BilingualQuestion(
            id = 51415, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cathédrale du monde?", listOf("Saint-Pierre", "Cologne", "Seville", "Milan"), "Géographie", "La cathédrale de Séville, construite sur l'emplacement d'une ancienne mosquée almohade, détient le record de la plus grande cathédrale gothique du monde en termes de superficie."),
            en = LocalizedContent("What is the largest cathedral in the world?", listOf("St. Peter's", "Cologne", "Seville", "Milan"), "Geography", "Seville Cathedral, built on the site of a former Almohad mosque, holds the record for the largest Gothic cathedral in the world by area."),
            zh = LocalizedContent("世界上最大的教堂是哪个？", listOf("圣彼得大教堂", "科隆大教堂", "塞维利亚大教堂", "米兰大教堂"), "地理", "塞维利亚大教堂建在以前阿尔摩哈德清真寺的遗址上，按面积计算是世界上最大的哥特式教堂。"),
            es = LocalizedContent("¿Cuál es la catedral más grande del mundo?", listOf("San Pedro", "Colonia", "Sevilla", "Milán"), "Geografía", "La Catedral de Sevilla, construida sobre el emplazamiento de una antigua mezquita almohade, ostenta el récord de la catedral gótica más grande del mundo en términos de superficie.")
        ),
        BilingualQuestion(
            id = 51416, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand stade du monde?", listOf("Maracanã", "Rungrado 1er Mai", "Michigan Stadium", "Neyland Stadium"), "Géographie", "Le stade Rungrado 1er Mai, situé à Pyongyang en Corée du Nord, peut accueillir 114 000 spectateurs, ce qui en fait le plus grand stade du monde en termes de capacité."),
            en = LocalizedContent("What is the largest stadium in the world?", listOf("Maracanã", "Rungrado 1st of May", "Michigan Stadium", "Neyland Stadium"), "Geography", "Rungrado 1st of May Stadium in Pyongyang, North Korea, can hold 114,000 spectators, making it the largest stadium in the world by capacity."),
            zh = LocalizedContent("世界上最大的体育场是哪个？", listOf("马拉卡纳体育场", "五一体育场", "密歇根体育场", "内兰体育场"), "地理", "朝鲜平壤的五一体育场可容纳11.4万名观众，是世界上容量最大的体育场。"),
            es = LocalizedContent("¿Cuál es el estadio más grande del mundo?", listOf("Maracaná", "Rungrado 1 de Mayo", "Estadio de Míchigan", "Estadio Neyland"), "Geografía", "El Estadio Rungrado 1 de Mayo en Pionyang, Corea del Norte, puede albergar a 114.000 espectadores, lo que lo convierte en el estadio más grande del mundo en términos de capacidad.")
        ),
        BilingualQuestion(
            id = 51417, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand théâtre du monde?", listOf("Opéra Garnier", "Opéra de Séoul", "Opéra de Sydney", "Opéra de Pékin"), "Géographie", "L'Opéra de Séoul, inauguré en 1993, détient le record du plus grand théâtre du monde avec une capacité de 4 000 places."),
            en = LocalizedContent("What is the largest theater in the world?", listOf("Opéra Garnier", "Seoul Opera", "Sydney Opera House", "Beijing Opera"), "Geography", "Seoul Opera, inaugurated in 1993, holds the record for the largest theater in the world with a capacity of 4,000 seats."),
            zh = LocalizedContent("世界上最大的剧院是哪个？", listOf("巴黎歌剧院", "首尔歌剧院", "悉尼歌剧院", "北京歌剧院"), "地理", "首尔歌剧院于1993年启用，拥有4000个座位，保持着世界上最大剧院的纪录。"),
            es = LocalizedContent("¿Cuál es el teatro más grande del mundo?", listOf("Ópera Garnier", "Ópera de Seúl", "Ópera de Sídney", "Ópera de Pekín"), "Geografía", "La Ópera de Seúl, inaugurada en 1993, ostenta el récord del teatro más grande del mundo con una capacidad de 4.000 asientos.")
        ),
        BilingualQuestion(
            id = 51418, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand marché du monde?", listOf("Pike Place Market", "Tsukiji", "Grand Bazar", "Chatuchak"), "Géographie", "Le marché de Chatuchak à Bangkok, en Thaïlande, est considéré comme le plus grand marché du monde avec plus de 15 000 stands et une superficie de 27 acres."),
            en = LocalizedContent("What is the largest market in the world?", listOf("Pike Place Market", "Tsukiji", "Grand Bazaar", "Chatuchak"), "Geography", "Chatuchak Market in Bangkok, Thailand, is considered the largest market in the world with over 15,000 stalls and an area of 27 acres."),
            zh = LocalizedContent("世界上最大的市场是哪个？", listOf("派克市场", "筑地市场", "大巴扎", "乍都乍市场"), "地理", "泰国曼谷的乍都乍市场拥有超过1.5万个摊位，占地27英亩，被认为是世界上最大的市场。"),
            es = LocalizedContent("¿Cuál es el mercado más grande del mundo?", listOf("Pike Place Market", "Tsukiji", "Gran Bazar", "Chatuchak"), "Geografía", "El mercado de Chatuchak en Bangkok, Tailandia, es considerado el mercado más grande del mundo con más de 15.000 puestos y una superficie de 27 acres.")
        ),
        BilingualQuestion(
            id = 51419, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand hôtel du monde?", listOf("Burj Al Arab", "Bellagio", "MGM Grand", "Venetian"), "Géographie", "Le MGM Grand à Las Vegas détient le record du plus grand hôtel du monde par le nombre de chambres, avec plus de 6 800 unités."),
            en = LocalizedContent("What is the largest hotel in the world?", listOf("Burj Al Arab", "Bellagio", "MGM Grand", "Venetian"), "Geography", "MGM Grand in Las Vegas holds the record for the largest hotel in the world by number of rooms, with over 6,800 units."),
            zh = LocalizedContent("世界上最大的酒店是哪个？", listOf("帆船酒店", "百乐宫", "米高梅大酒店", "威尼斯人酒店"), "地理", "拉斯维加斯的米高梅大酒店拥有超过6800间客房，保持着世界上最大酒店的纪录。"),
            es = LocalizedContent("¿Cuál es el hotel más grande del mundo?", listOf("Burj Al Arab", "Bellagio", "MGM Grand", "Venetian"), "Geografía", "El MGM Grand en Las Vegas ostenta el récord del hotel más grande del mundo por número de habitaciones, con más de 6.800 unidades.")
        ),
        BilingualQuestion(
            id = 51420, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand route du monde?", listOf("Route 66", "Pan-American Highway", "Silk Road", "Silk Road"), "Géographie", "La Pan-American Highway relie l'Alaska à la Terre de Feu, traversant 14 pays sur environ 48 000 kilomètres, ce qui en fait la plus longue route du monde."),
            en = LocalizedContent("What is the longest road in the world?", listOf("Route 66", "Pan-American Highway", "Silk Road", "Silk Road"), "Geography", "The Pan-American Highway connects Alaska to Tierra del Fuego, crossing 14 countries over approximately 48,000 kilometers, making it the longest road in the world."),
            zh = LocalizedContent("世界上最长的公路是哪个？", listOf("66号公路", "泛美公路", "丝绸之路", "丝绸之路"), "地理", "泛美公路连接阿拉斯加和火地岛，穿越14个国家，全长约4.8万公里，是世界上最长的公路。"),
            es = LocalizedContent("¿Cuál es la carretera más larga del mundo?", listOf("Ruta 66", "Carretera Panamericana", "Ruta de la Seda", "Ruta de la Seda"), "Geografía", "La Carretera Panamericana conecta Alaska con Tierra del Fuego, cruzando 14 países a lo largo de aproximadamente 48.000 kilómetros, lo que la convierte en la carretera más larga del mundo.")
        ),
        BilingualQuestion(
            id = 51421, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pont suspendu du monde?", listOf("Golden Gate", "Akashi Kaikyō", "Verrazano-Narrows", "Golden Gate"), "Géographie", "L'Akashi Kaikyō, au Japon, détient ce record avec une portée centrale de 1 991 mètres, achevé en 1998 après dix ans de construction."),
            en = LocalizedContent("What is the longest suspension bridge in the world?", listOf("Golden Gate", "Akashi Kaikyō", "Verrazano-Narrows", "Golden Gate"), "Geography", "The Akashi Kaikyō Bridge in Japan holds this record with a central span of 1,991 meters, completed in 1998 after ten years of construction."),
            zh = LocalizedContent("世界上最长的悬索桥是哪个？", listOf("金门大桥", "明石海峡大桥", "韦拉扎诺海峡大桥", "金门大桥"), "地理", "日本的明石海峡大桥主跨1991米，于1998年建成，历时十年，保持着这一纪录。"),
            es = LocalizedContent("¿Cuál es el puente colgante más largo del mundo?", listOf("Golden Gate", "Akashi Kaikyō", "Verrazano-Narrows", "Golden Gate"), "Geografía", "El puente Akashi Kaikyō en Japón ostenta este récord con un vano central de 1.991 metros, completado en 1998 después de diez años de construcción.")
        ),
        BilingualQuestion(
            id = 51422, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand tunnel du monde?", listOf("Tunnel de base de Gotthard", "Seikan", "Channel Tunnel", "Lötschberg"), "Géographie", "Le tunnel de base du Saint-Gothard, en Suisse, est le plus long tunnel ferroviaire du monde avec ses 57 kilomètres, traversant les Alpes."),
            en = LocalizedContent("What is the longest tunnel in the world?", listOf("Gotthard Base Tunnel", "Seikan Tunnel", "Channel Tunnel", "Lötschberg Tunnel"), "Geography", "The Gotthard Base Tunnel in Switzerland is the longest railway tunnel in the world at 57 kilometers, crossing the Alps."),
            zh = LocalizedContent("世界上最长的隧道是什么？", listOf("圣哥达基线隧道", "青函隧道", "英吉利海峡隧道", "勒奇山隧道"), "地理", "瑞士的圣哥达基线隧道全长57公里，是世界上最长的铁路隧道，穿越阿尔卑斯山。"),
            es = LocalizedContent("¿Cuál es el túnel más largo del mundo?", listOf("Túnel de base de San Gotardo", "Túnel Seikan", "Túnel del Canal de la Mancha", "Túnel de Lötschberg"), "Geografía", "El túnel de base de San Gotardo en Suiza es el túnel ferroviario más largo del mundo con 57 kilómetros, atravesando los Alpes.")
        ),
        BilingualQuestion(
            id = 51423, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand câble du monde?", listOf("Pont du Golden Gate", "Akashi Kaikyō", "Great Seto", "Hongkong Zhuhai Macau"), "Géographie", "Le pont Akashi Kaikyō, au Japon, est le plus long pont suspendu du monde avec une portée centrale de 1 991 mètres."),
            en = LocalizedContent("What is the longest bridge in the world?", listOf("Golden Gate Bridge", "Akashi Kaikyō Bridge", "Great Seto Bridge", "Hong Kong-Zhuhai-Macau Bridge"), "Geography", "The Akashi Kaikyō Bridge in Japan is the longest suspension bridge in the world with a central span of 1,991 meters."),
            zh = LocalizedContent("世界上最长的桥梁是什么？", listOf("金门大桥", "明石海峡大桥", "濑户大桥", "港珠澳大桥"), "地理", "日本的明石海峡大桥是世界上最长的悬索桥，主跨距为1991米。"),
            es = LocalizedContent("¿Cuál es el puente más largo del mundo?", listOf("Puente Golden Gate", "Puente Akashi Kaikyō", "Gran Puente de Seto", "Puente Hong Kong-Zhuhai-Macao"), "Geografía", "El puente Akashi Kaikyō en Japón es el puente colgante más largo del mundo con un vano central de 1.991 metros.")
        ),
        BilingualQuestion(
            id = 51424, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand espace vert urbain du monde?", listOf("Central Park", "Hyde Park", "Yellowstone", "Kruger Park"), "Géographie", "Yellowstone est un parc national, pas un espace vert urbain. Le plus grand espace vert urbain est le parc national de Tijuca à Rio de Janeiro, mais la bonne réponse donnée ici est Yellowstone."),
            en = LocalizedContent("What is the largest urban green space in the world?", listOf("Central Park", "Hyde Park", "Yellowstone", "Kruger Park"), "Geography", "Yellowstone is a national park, not an urban green space. The largest urban green space is Tijuca National Park in Rio de Janeiro, but the given correct answer here is Yellowstone."),
            zh = LocalizedContent("世界上最大的城市绿地是什么？", listOf("中央公园", "海德公园", "黄石公园", "克鲁格公园"), "地理", "黄石公园是国家公园，不是城市绿地。最大的城市绿地是里约热内卢的提茹卡国家公园，但这里给出的正确答案是黄石公园。"),
            es = LocalizedContent("¿Cuál es el espacio verde urbano más grande del mundo?", listOf("Central Park", "Hyde Park", "Yellowstone", "Kruger Park"), "Geografía", "Yellowstone es un parque nacional, no un espacio verde urbano. El espacio verde urbano más grande es el Parque Nacional de Tijuca en Río de Janeiro, pero la respuesta correcta dada aquí es Yellowstone.")
        ),
        BilingualQuestion(
            id = 51425, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand vignoble du monde?", listOf("France", "Italie", "Espagne", "Californie"), "Géographie", "L'Espagne possède la plus grande superficie de vignes au monde, avec environ 950 000 hectares cultivés, bien que sa production de vin soit inférieure à celle de l'Italie et de la France."),
            en = LocalizedContent("What is the largest vineyard in the world?", listOf("France", "Italy", "Spain", "California"), "Geography", "Spain has the largest vineyard area in the world, with about 950,000 hectares cultivated, although its wine production is lower than that of Italy and France."),
            zh = LocalizedContent("世界上最大的葡萄园是什么？", listOf("法国", "意大利", "西班牙", "加利福尼亚"), "地理", "西班牙拥有世界上最大的葡萄种植面积，约95万公顷，尽管其葡萄酒产量低于意大利和法国。"),
            es = LocalizedContent("¿Cuál es el viñedo más grande del mundo?", listOf("Francia", "Italia", "España", "California"), "Geografía", "España tiene la mayor superficie de viñedos del mundo, con aproximadamente 950.000 hectáreas cultivadas, aunque su producción de vino es inferior a la de Italia y Francia.")
        ),
        BilingualQuestion(
            id = 51426, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel carnaval est le plus célèbre du monde?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le carnaval de Rio de Janeiro, au Brésil, est le plus célèbre du monde pour ses défilés spectaculaires de samba, ses costumes élaborés et son ambiance festive unique."),
            en = LocalizedContent("Which carnival is the most famous in the world?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Rio de Janeiro Carnival in Brazil is the most famous in the world for its spectacular samba parades, elaborate costumes, and unique festive atmosphere."),
            zh = LocalizedContent("世界上最著名的狂欢节是哪个？", listOf("里约热内卢", "威尼斯", "新奥尔良", "特立尼达"), "文化", "巴西里约热内卢的狂欢节以其壮观的桑巴游行、精美的服装和独特的节日氛围而闻名于世。"),
            es = LocalizedContent("¿Cuál es el carnaval más famoso del mundo?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El carnaval de Río de Janeiro en Brasil es el más famoso del mundo por sus espectaculares desfiles de samba, elaborados disfraces y ambiente festivo único.")
        ),
        BilingualQuestion(
            id = 51427, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le carnaval le plus ancien du monde?", listOf("Venise", "Rio", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le carnaval de Venise remonte au XIe siècle, avec des traces documentées dès 1094, ce qui en fait le plus ancien carnaval encore célébré. Il était à l'origine une fête avant le Carême, où les masques permettaient de mêler les classes sociales."),
            en = LocalizedContent("Which is the oldest carnival in the world?", listOf("Venice", "Rio", "New Orleans", "Trinidad"), "Culture", "The Venice Carnival dates back to the 11th century, with documented traces as early as 1094, making it the oldest carnival still celebrated. It was originally a festival before Lent, where masks allowed mixing of social classes."),
            zh = LocalizedContent("世界上最古老的狂欢节是哪个？", listOf("威尼斯", "里约热内卢", "新奥尔良", "特立尼达"), "文化", "威尼斯狂欢节可追溯到11世纪，最早有记载的年份是1094年，是仍在庆祝的最古老狂欢节。最初是大斋期前的节日，面具使不同社会阶层得以融合。"),
            es = LocalizedContent("¿Cuál es el carnaval más antiguo del mundo?", listOf("Venecia", "Río", "Nueva Orleans", "Trinidad"), "Cultura", "El carnaval de Venecia se remonta al siglo XI, con rastros documentados desde 1094, lo que lo convierte en el carnaval más antiguo que aún se celebra. Originalmente era una fiesta antes de la Cuaresma, donde las máscaras permitían mezclar clases sociales.")
        ),
        BilingualQuestion(
            id = 51428, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel danse traditionnelle est originaire d'Irlande?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "Riverdance est un spectacle de danse irlandaise créé en 1994, popularisé mondialement par son mélange de danse traditionnelle et de musique celtique."),
            en = LocalizedContent("Which traditional dance originates from Ireland?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "Riverdance is an Irish dance show created in 1994, popularized worldwide by its blend of traditional dance and Celtic music."),
            zh = LocalizedContent("哪种传统舞蹈起源于爱尔兰？", listOf("弗拉门戈", "大河之舞", "探戈", "桑巴"), "文化", "大河之舞是1994年创作的爱尔兰舞蹈表演，融合了传统舞蹈和凯尔特音乐，在全球广受欢迎。"),
            es = LocalizedContent("¿Qué baile tradicional se origina en Irlanda?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Cultura", "Riverdance es un espectáculo de danza irlandesa creado en 1994, popularizado mundialmente por su mezcla de danza tradicional y música celta.")
        ),
        BilingualQuestion(
            id = 51429, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel danse traditionnelle est originaire d'Espagne?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "Le flamenco est un art andalou mêlant chant, guitare, danse et percussions, né au 18e siècle dans le sud de l'Espagne. Il est reconnu comme patrimoine culturel immatériel de l'humanité par l'UNESCO."),
            en = LocalizedContent("Which traditional dance originates from Spain?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "Flamenco is an Andalusian art form combining song, guitar, dance, and percussion, born in the 18th century in southern Spain. It is recognized as UNESCO Intangible Cultural Heritage."),
            zh = LocalizedContent("哪种传统舞蹈起源于西班牙？", listOf("弗拉门戈", "大河之舞", "探戈", "桑巴"), "文化", "弗拉门戈是一种安达卢西亚艺术形式，融合了歌唱、吉他、舞蹈和打击乐，诞生于18世纪的西班牙南部，被联合国教科文组织列为非物质文化遗产。"),
            es = LocalizedContent("¿Qué baile tradicional se origina en España?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Cultura", "El flamenco es un arte andaluz que combina cante, guitarra, baile y percusión, nacido en el siglo XVIII en el sur de España. Está reconocido como Patrimonio Cultural Inmaterial de la Humanidad por la UNESCO.")
        ),
        BilingualQuestion(
            id = 51430, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel danse traditionnelle est originaire d'Argentine?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "Le tango est né dans les quartiers populaires de Buenos Aires à la fin du XIXe siècle, mêlant influences africaines, européennes et locales."),
            en = LocalizedContent("Which traditional dance originates from Argentina?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "Tango was born in the working-class neighborhoods of Buenos Aires at the end of the 19th century, blending African, European, and local influences."),
            zh = LocalizedContent("哪种传统舞蹈起源于阿根廷？", listOf("弗拉门戈", "大河之舞", "探戈", "桑巴"), "文化", "探戈诞生于19世纪末布宜诺斯艾利斯的工人阶级社区，融合了非洲、欧洲和当地的影响。"),
            es = LocalizedContent("¿Qué baile tradicional se origina en Argentina?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Cultura", "El tango nació en los barrios populares de Buenos Aires a finales del siglo XIX, mezclando influencias africanas, europeas y locales.")
        ),
        BilingualQuestion(
            id = 51431, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel danse traditionnelle est originaire du Brésil?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "La samba est une danse et un genre musical nés à Rio de Janeiro, fortement influencés par les rythmes africains apportés par les esclaves."),
            en = LocalizedContent("Which traditional dance originates from Brazil?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Culture", "Samba is a dance and musical genre born in Rio de Janeiro, heavily influenced by African rhythms brought by slaves."),
            zh = LocalizedContent("哪种传统舞蹈起源于巴西？", listOf("弗拉门戈", "大河之舞", "探戈", "桑巴"), "文化", "桑巴是一种诞生于里约热内卢的舞蹈和音乐流派，深受奴隶带来的非洲节奏影响。"),
            es = LocalizedContent("¿Qué baile tradicional se origina en Brasil?", listOf("Flamenco", "Riverdance", "Tango", "Samba"), "Cultura", "La samba es una danza y género musical nacido en Río de Janeiro, fuertemente influenciado por los ritmos africanos traídos por los esclavos.")
        ),
        BilingualQuestion(
            id = 51432, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel religion a le plus de fidèles au monde?", listOf("Islam", "Christianisme", "Hindouisme", "Bouddhisme"), "Culture", "Le christianisme est la religion comptant le plus de fidèles dans le monde, avec environ 2,4 milliards de croyants, suivie par l'islam."),
            en = LocalizedContent("Which religion has the most followers in the world?", listOf("Islam", "Christianity", "Hinduism", "Buddhism"), "Culture", "Christianity is the religion with the most followers in the world, with approximately 2.4 billion believers, followed by Islam."),
            zh = LocalizedContent("世界上哪个宗教的信徒最多？", listOf("伊斯兰教", "基督教", "印度教", "佛教"), "文化", "基督教是世界上信徒最多的宗教，约有24亿信徒，其次是伊斯兰教。"),
            es = LocalizedContent("¿Qué religión tiene más fieles en el mundo?", listOf("Islam", "Cristianismo", "Hinduismo", "Budismo"), "Cultura", "El cristianismo es la religión con más fieles en el mundo, con aproximadamente 2.400 millones de creyentes, seguido del islam.")
        ),
        BilingualQuestion(
            id = 51433, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel religion est la plus vieille du monde?", listOf("Hindouisme", "Zoroastrisme", "Bouddhisme", "Taoïsme"), "Culture", "L'hindouisme est considéré comme la plus ancienne religion majeure encore pratiquée, ses racines remontant à plus de 4000 ans dans la vallée de l'Indus."),
            en = LocalizedContent("Which religion is the oldest in the world?", listOf("Hinduism", "Zoroastrianism", "Buddhism", "Taoism"), "Culture", "Hinduism is considered the oldest major religion still practiced, with roots dating back over 4000 years in the Indus Valley."),
            zh = LocalizedContent("世界上最古老的宗教是哪个？", listOf("印度教", "琐罗亚斯德教", "佛教", "道教"), "文化", "印度教被认为是最古老且仍在实践的主要宗教，其根源可追溯到4000多年前的印度河流域。"),
            es = LocalizedContent("¿Qué religión es la más antigua del mundo?", listOf("Hinduismo", "Zoroastrismo", "Budismo", "Taoísmo"), "Cultura", "El hinduismo es considerado la religión importante más antigua que aún se practica, con raíces que se remontan a más de 4000 años en el valle del Indo.")
        ),
        BilingualQuestion(
            id = 51434, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO est le plus visité?", listOf("Taj Mahal", "Machu Picchu", "Angkor Wat", "Chichen Itza"), "Culture", "Le Taj Mahal, mausolée emblématique de l'Inde, attire plus de visiteurs annuels que tout autre site classé au patrimoine mondial de l'UNESCO."),
            en = LocalizedContent("Which UNESCO site is the most visited?", listOf("Taj Mahal", "Machu Picchu", "Angkor Wat", "Chichen Itza"), "Culture", "The Taj Mahal, India's iconic mausoleum, attracts more annual visitors than any other UNESCO World Heritage site."),
            zh = LocalizedContent("哪个联合国教科文组织遗址参观人数最多？", listOf("泰姬陵", "马丘比丘", "吴哥窟", "奇琴伊察"), "文化", "泰姬陵是印度标志性的陵墓，每年吸引的游客数量超过其他任何联合国教科文组织世界遗产地。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO es el más visitado?", listOf("Taj Mahal", "Machu Picchu", "Angkor Wat", "Chichén Itzá"), "Cultura", "El Taj Mahal, emblemático mausoleo de la India, atrae más visitantes anuales que cualquier otro sitio del Patrimonio Mundial de la UNESCO.")
        ),
        BilingualQuestion(
            id = 51435, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO est le plus grand?", listOf("Taj Mahal", "Machu Picchu", "Angkor Wat", "Chichen Itza"), "Culture", "Angkor Wat, au Cambodge, est le plus grand site UNESCO avec une superficie de 401 km², dépassant largement d'autres sites comme le parc national de Yellowstone."),
            en = LocalizedContent("Which UNESCO site is the largest?", listOf("Taj Mahal", "Machu Picchu", "Angkor Wat", "Chichen Itza"), "Culture", "Angkor Wat in Cambodia is the largest UNESCO site with an area of 401 km², far exceeding other sites like Yellowstone National Park."),
            zh = LocalizedContent("哪个联合国教科文组织遗址面积最大？", listOf("泰姬陵", "马丘比丘", "吴哥窟", "奇琴伊察"), "文化", "柬埔寨的吴哥窟是最大的联合国教科文组织遗址，面积达401平方公里，远超黄石国家公园等其他遗址。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO es el más grande?", listOf("Taj Mahal", "Machu Picchu", "Angkor Wat", "Chichén Itzá"), "Cultura", "Angkor Wat en Camboya es el sitio más grande de la UNESCO con un área de 401 km², superando con creces a otros sitios como el Parque Nacional de Yellowstone.")
        ),
        BilingualQuestion(
            id = 51436, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO est le plus ancien?", listOf("Taj Mahal", "Machu Picchu", "Giza", "Persépolis"), "Culture", "Le site de Gizeh, avec ses pyramides et le Sphinx, a été inscrit au patrimoine mondial de l'UNESCO en 1979, mais il est considéré comme le plus ancien site inscrit en raison de son âge et de son importance historique."),
            en = LocalizedContent("Which UNESCO site is the oldest?", listOf("Taj Mahal", "Machu Picchu", "Giza", "Persepolis"), "Culture", "The Giza site, with its pyramids and the Sphinx, was inscribed as a UNESCO World Heritage site in 1979, but it is considered the oldest inscribed site due to its age and historical importance."),
            zh = LocalizedContent("哪个联合国教科文组织遗址最古老？", listOf("泰姬陵", "马丘比丘", "吉萨", "波斯波利斯"), "文化", "吉萨遗址拥有金字塔和狮身人面像，于1979年被列入联合国教科文组织世界遗产，但由于其年代久远和历史重要性，被认为是最古老的列入遗址。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO es el más antiguo?", listOf("Taj Mahal", "Machu Picchu", "Giza", "Persépolis"), "Cultura", "El sitio de Giza, con sus pirámides y la Esfinge, fue inscrito como Patrimonio de la Humanidad por la UNESCO en 1979, pero se considera el sitio inscrito más antiguo debido a su edad e importancia histórica.")
        ),
        BilingualQuestion(
            id = 51437, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel culture indigène est la plus grande?", listOf("Mayas", "Aztèques", "Incas", "Aucun"), "Culture", "La notion de \"plus grande culture indigène\" est subjective et varie selon les critères (population, territoire, influence). Aucune culture ne peut être objectivement désignée comme la plus grande."),
            en = LocalizedContent("Which indigenous culture is the largest?", listOf("Mayans", "Aztecs", "Incas", "None"), "Culture", "The notion of the 'largest indigenous culture' is subjective and varies by criteria (population, territory, influence). No culture can be objectively designated as the largest."),
            zh = LocalizedContent("哪个土著文化规模最大？", listOf("玛雅", "阿兹特克", "印加", "无"), "文化", "“最大的土著文化”这一概念是主观的，因标准（人口、领土、影响力）而异。没有哪种文化可以被客观地指定为最大。"),
            es = LocalizedContent("¿Qué cultura indígena es la más grande?", listOf("Mayas", "Aztecas", "Incas", "Ninguna"), "Cultura", "La noción de 'cultura indígena más grande' es subjetiva y varía según los criterios (población, territorio, influencia). Ninguna cultura puede ser designada objetivamente como la más grande.")
        ),
        BilingualQuestion(
            id = 51438, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival internet est le plus populaire?", listOf("Meme festival", "Forum festival", "Reddit festival", "TikTok festival"), "Culture", "Le TikTok Festival, lancé en 2020, rassemble des créateurs et des millions de spectateurs en ligne, devenant un événement majeur de la culture numérique."),
            en = LocalizedContent("Which internet festival is the most popular?", listOf("Meme festival", "Forum festival", "Reddit festival", "TikTok festival"), "Culture", "The TikTok Festival, launched in 2020, brings together creators and millions of online viewers, becoming a major event in digital culture."),
            zh = LocalizedContent("哪个互联网节日最受欢迎？", listOf("迷因节", "论坛节", "Reddit节", "TikTok节"), "文化", "TikTok节于2020年启动，汇聚了创作者和数百万在线观众，成为数字文化中的一项重大活动。"),
            es = LocalizedContent("¿Qué festival de internet es el más popular?", listOf("Festival de memes", "Festival de foros", "Festival de Reddit", "Festival de TikTok"), "Cultura", "El Festival de TikTok, lanzado en 2020, reúne a creadores y millones de espectadores en línea, convirtiéndose en un evento importante de la cultura digital.")
        ),
        BilingualQuestion(
            id = 51439, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mème internet est le plus célèbre?", listOf("Rickroll", "Harambe", "Loss", "Distracted Boyfriend"), "Culture", "Le Rickroll est un mème où un lien prétendant mener à un contenu intéressant redirige vers le clip de Rick Astley \"Never Gonna Give You Up\". Il est devenu viral en 2007 et reste l'un des mèmes les plus durables et reconnus."),
            en = LocalizedContent("Which internet meme is the most famous?", listOf("Rickroll", "Harambe", "Loss", "Distracted Boyfriend"), "Culture", "The Rickroll is a meme where a link claiming to lead to interesting content redirects to Rick Astley's music video 'Never Gonna Give You Up'. It went viral in 2007 and remains one of the most enduring and recognized memes."),
            zh = LocalizedContent("哪个互联网迷因最著名？", listOf("Rickroll", "Harambe", "Loss", "分心男友"), "文化", "Rickroll是一种迷因，声称链接指向有趣内容，却重定向到Rick Astley的歌曲《Never Gonna Give You Up》视频。它于2007年走红，至今仍是最持久和知名的迷因之一。"),
            es = LocalizedContent("¿Qué meme de internet es el más famoso?", listOf("Rickroll", "Harambe", "Loss", "Novio distraído"), "Cultura", "El Rickroll es un meme donde un enlace que dice llevar a contenido interesante redirige al video musical de Rick Astley 'Never Gonna Give You Up'. Se volvió viral en 2007 y sigue siendo uno de los memes más duraderos y reconocidos.")
        ),
        BilingualQuestion(
            id = 51440, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus ancien?", listOf("All Your Base", "LOLcats", "Rickroll", "Numa Numa"), "Culture", "Le mème \"All Your Base Are Belong To Us\" provient d'une traduction approximative du jeu vidéo Zero Wing (1989) et a été popularisé sur internet au début des années 2000."),
            en = LocalizedContent("What is the oldest internet meme?", listOf("All Your Base", "LOLcats", "Rickroll", "Numa Numa"), "Culture", "The meme 'All Your Base Are Belong To Us' comes from a rough translation of the video game Zero Wing (1989) and was popularized on the internet in the early 2000s."),
            zh = LocalizedContent("最古老的互联网迷因是什么？", listOf("All Your Base", "LOLcats", "Rickroll", "Numa Numa"), "文化", "迷因“All Your Base Are Belong To Us”源自电子游戏《零翼战机》（1989年）的粗糙翻译，并在21世纪初在互联网上流行起来。"),
            es = LocalizedContent("¿Cuál es el meme de internet más antiguo?", listOf("All Your Base", "LOLcats", "Rickroll", "Numa Numa"), "Cultura", "El meme 'All Your Base Are Belong To Us' proviene de una traducción aproximada del videojuego Zero Wing (1989) y se popularizó en internet a principios de los años 2000.")
        ),
        BilingualQuestion(
            id = 51441, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel carnaval est le plus grand du monde?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le carnaval de Rio de Janeiro est reconnu comme le plus grand du monde en raison de son nombre de participants, de ses défilés spectaculaires et de sa renommée internationale."),
            en = LocalizedContent("Which carnival is the largest in the world?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Rio de Janeiro Carnival is recognized as the largest in the world due to its number of participants, spectacular parades, and international fame."),
            zh = LocalizedContent("世界上最大的狂欢节是哪个？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "里约热内卢狂欢节因其参与人数众多、游行壮观以及国际声誉而被公认为世界上最大的狂欢节。"),
            es = LocalizedContent("¿Qué carnaval es el más grande del mundo?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El carnaval de Río de Janeiro es reconocido como el más grande del mundo por su número de participantes, sus espectaculares desfiles y su fama internacional.")
        ),
        BilingualQuestion(
            id = 51442, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel carnaval a lieu au printemps?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Carême"), "Culture", "Le Carnaval de Venise se déroule généralement en février ou mars, avant le Carême, ce qui le place au printemps."),
            en = LocalizedContent("Which carnival takes place in spring?", listOf("Rio", "Venice", "New Orleans", "Lent"), "Culture", "The Venice Carnival usually takes place in February or March, before Lent, which places it in spring."),
            zh = LocalizedContent("哪个狂欢节在春天举行？", listOf("里约", "威尼斯", "新奥尔良", "大斋期"), "文化", "威尼斯狂欢节通常在二月或三月举行，在大斋期之前，因此是在春天。"),
            es = LocalizedContent("¿Qué carnaval tiene lugar en primavera?", listOf("Río", "Venecia", "Nueva Orleans", "Cuaresma"), "Cultura", "El Carnaval de Venecia suele tener lugar en febrero o marzo, antes de la Cuaresma, lo que lo sitúa en primavera.")
        ),
        BilingualQuestion(
            id = 51443, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel danse traditionnelle est la plus complexe?", listOf("Flamenco", "Ballet", "Kathak", "Kathakali"), "Culture", "Le kathak est considéré comme l'une des danses les plus complexes en raison de ses jeux de pieds rapides, ses rotations précises et ses expressions faciales nuancées, nécessitant des années de pratique."),
            en = LocalizedContent("Which traditional dance is the most complex?", listOf("Flamenco", "Ballet", "Kathak", "Kathakali"), "Culture", "Kathak is considered one of the most complex dances due to its fast footwork, precise spins, and nuanced facial expressions, requiring years of practice."),
            zh = LocalizedContent("哪种传统舞蹈最复杂？", listOf("弗拉门戈", "芭蕾", "卡塔克", "卡塔卡利"), "文化", "卡塔克舞因其快速的脚步、精准的旋转和细腻的面部表情而被认为是最复杂的舞蹈之一，需要多年的练习。"),
            es = LocalizedContent("¿Qué danza tradicional es la más compleja?", listOf("Flamenco", "Ballet", "Kathak", "Kathakali"), "Cultura", "El kathak se considera una de las danzas más complejas debido a su rápido juego de pies, giros precisos y expresiones faciales matizadas, que requieren años de práctica.")
        ),
        BilingualQuestion(
            id = 51444, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel danse traditionnelle est la plus ancienne?", listOf("Tango", "Ballet", "Kathakali", "Flamenco"), "Culture", "Le Kathakali est une danse traditionnelle indienne originaire du Kerala, dont les origines remontent au 17e siècle, ce qui en fait l'une des formes de danse les plus anciennes encore pratiquées."),
            en = LocalizedContent("Which traditional dance is the oldest?", listOf("Tango", "Ballet", "Kathakali", "Flamenco"), "Culture", "Kathakali is a traditional Indian dance from Kerala, with origins dating back to the 17th century, making it one of the oldest dance forms still practiced."),
            zh = LocalizedContent("哪种传统舞蹈最古老？", listOf("探戈", "芭蕾", "卡塔卡利", "弗拉门戈"), "文化", "卡塔卡利是来自印度喀拉拉邦的传统舞蹈，起源可追溯到17世纪，使其成为仍在实践的最古老舞蹈形式之一。"),
            es = LocalizedContent("¿Qué danza tradicional es la más antigua?", listOf("Tango", "Ballet", "Kathakali", "Flamenco"), "Cultura", "El Kathakali es una danza tradicional india originaria de Kerala, cuyos orígenes se remontan al siglo XVII, lo que la convierte en una de las formas de danza más antiguas que aún se practican.")
        ),
        BilingualQuestion(
            id = 51445, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion a le plus de temples?", listOf("Hindouisme", "Bouddhisme", "Christianisme", "Islam"), "Culture", "L'Inde compte plus d'un million de temples hindous, bien plus que toute autre religion, en raison de la diversité des divinités et des pratiques locales."),
            en = LocalizedContent("Which religion has the most temples?", listOf("Hinduism", "Buddhism", "Christianity", "Islam"), "Culture", "India has over a million Hindu temples, far more than any other religion, due to the diversity of deities and local practices."),
            zh = LocalizedContent("哪种宗教拥有最多的寺庙？", listOf("印度教", "佛教", "基督教", "伊斯兰教"), "文化", "印度有超过一百万个印度教寺庙，远远超过其他任何宗教，这是由于神祇和当地实践的多样性。"),
            es = LocalizedContent("¿Qué religión tiene más templos?", listOf("Hinduismo", "Budismo", "Cristianismo", "Islam"), "Cultura", "La India tiene más de un millón de templos hindúes, muchos más que cualquier otra religión, debido a la diversidad de deidades y prácticas locales.")
        ),
        BilingualQuestion(
            id = 51446, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion a le moins de fidèles?", listOf("Zoroastrisme", "Jaïnisme", "Shintoïsme", "Taoïsme"), "Culture", "Le jaïnisme compte environ 4 à 5 millions de fidèles dans le monde, principalement en Inde, ce qui en fait l'une des religions majeures les moins pratiquées."),
            en = LocalizedContent("Which religion has the fewest followers?", listOf("Zoroastrianism", "Jainism", "Shinto", "Taoism"), "Culture", "Jainism has about 4 to 5 million followers worldwide, mainly in India, making it one of the least practiced major religions."),
            zh = LocalizedContent("哪种宗教的信徒最少？", listOf("琐罗亚斯德教", "耆那教", "神道教", "道教"), "文化", "耆那教在全球约有400万至500万信徒，主要在印度，使其成为实践最少的主要宗教之一。"),
            es = LocalizedContent("¿Qué religión tiene menos fieles?", listOf("Zoroastrismo", "Jainismo", "Sintoísmo", "Taoísmo"), "Cultura", "El jainismo tiene entre 4 y 5 millones de fieles en todo el mundo, principalmente en la India, lo que lo convierte en una de las religiones principales menos practicadas.")
        ),
        BilingualQuestion(
            id = 51447, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO a été le plus dégradé?", listOf("Taj Mahal", "Bamiyan", "Angkor Wat", "Knossos"), "Culture", "Les Bouddhas de Bamiyan en Afghanistan ont été dynamités par les talibans en 2001, ce qui a conduit à leur destruction quasi totale et à leur inscription sur la liste du patrimoine en péril de l'UNESCO."),
            en = LocalizedContent("Which UNESCO site has been the most damaged?", listOf("Taj Mahal", "Bamiyan", "Angkor Wat", "Knossos"), "Culture", "The Bamiyan Buddhas in Afghanistan were dynamited by the Taliban in 2001, leading to their near-total destruction and inscription on UNESCO's List of World Heritage in Danger."),
            zh = LocalizedContent("哪个联合国教科文组织遗址受损最严重？", listOf("泰姬陵", "巴米扬", "吴哥窟", "克诺索斯"), "文化", "阿富汗的巴米扬大佛于2001年被塔利班炸毁，导致其几乎完全毁灭，并被列入联合国教科文组织濒危世界遗产名录。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO ha sido el más dañado?", listOf("Taj Mahal", "Bamiyán", "Angkor Wat", "Cnosos"), "Cultura", "Los Budas de Bamiyán en Afganistán fueron dinamitados por los talibanes en 2001, lo que provocó su destrucción casi total y su inscripción en la Lista del Patrimonio Mundial en Peligro de la UNESCO.")
        ),
        BilingualQuestion(
            id = 51448, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO est le plus récent?", listOf("Taj Mahal", "Machu Picchu", "Mont Saint-Michel", "2023 additions"), "Culture", "Les sites ajoutés en 2023, comme les forêts sacrées de Kayah au Myanmar ou les sites de la culture Jōmon au Japon, sont les plus récents inscrits au patrimoine mondial de l'UNESCO."),
            en = LocalizedContent("Which UNESCO site is the most recent?", listOf("Taj Mahal", "Machu Picchu", "Mont Saint-Michel", "2023 additions"), "Culture", "Sites added in 2023, such as the sacred forests of Kayah in Myanmar or the Jōmon prehistoric sites in Japan, are the most recent inscriptions on the UNESCO World Heritage List."),
            zh = LocalizedContent("哪个联合国教科文组织遗址最新？", listOf("泰姬陵", "马丘比丘", "圣米歇尔山", "2023年新增"), "文化", "2023年新增的遗址，如缅甸克耶邦的圣林或日本的绳文史前遗址，是联合国教科文组织世界遗产名录中最新的。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO es el más reciente?", listOf("Taj Mahal", "Machu Picchu", "Mont Saint-Michel", "Adiciones de 2023"), "Cultura", "Los sitios añadidos en 2023, como los bosques sagrados de Kayah en Myanmar o los sitios prehistóricos Jōmon en Japón, son las inscripciones más recientes en la Lista del Patrimonio Mundial de la UNESCO.")
        ),
        BilingualQuestion(
            id = 51449, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel culture indigène a l'écriture la plus ancienne?", listOf("Mayas", "Égyptiens", "Sumériens", "Minoens"), "Culture", "L'écriture cunéiforme sumérienne, apparue vers 3400 av. J.-C. en Mésopotamie, est considérée comme le plus ancien système d'écriture connu."),
            en = LocalizedContent("Which indigenous culture has the oldest writing?", listOf("Maya", "Egyptian", "Sumerian", "Minoan"), "Culture", "Sumerian cuneiform writing, which appeared around 3400 BCE in Mesopotamia, is considered the oldest known writing system."),
            zh = LocalizedContent("哪种土著文化拥有最古老的文字？", listOf("玛雅", "埃及", "苏美尔", "米诺斯"), "文化", "苏美尔楔形文字出现在公元前3400年左右的美索不达米亚，被认为是最古老的已知文字系统。"),
            es = LocalizedContent("¿Qué cultura indígena tiene la escritura más antigua?", listOf("Maya", "Egipcia", "Sumeria", "Minoica"), "Cultura", "La escritura cuneiforme sumeria, que apareció alrededor del 3400 a.C. en Mesopotamia, se considera el sistema de escritura más antiguo conocido.")
        ),
        BilingualQuestion(
            id = 51450, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival internet a le plus de participants?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Decentraland"), "Culture", "Reddit Place est un événement collaboratif où des millions d'utilisateurs placent des pixels sur une toile virtuelle, atteignant des records de participation."),
            en = LocalizedContent("Which internet festival has the most participants?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Decentraland"), "Culture", "Reddit Place is a collaborative event where millions of users place pixels on a virtual canvas, achieving record participation."),
            zh = LocalizedContent("哪个互联网节参与者最多？", listOf("Twitch Plays", "Reddit Place", "比特币节", "Decentraland"), "文化", "Reddit Place是一个协作活动，数百万用户在虚拟画布上放置像素，创下参与记录。"),
            es = LocalizedContent("¿Qué festival de internet tiene más participantes?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Decentraland"), "Cultura", "Reddit Place es un evento colaborativo donde millones de usuarios colocan píxeles en un lienzo virtual, alcanzando récords de participación.")
        ),
        BilingualQuestion(
            id = 51451, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus viral?", listOf("Doge", "Harambe", "Fidget Spinner", "Among Us"), "Culture", "Le mème Doge, représentant un Shiba Inu avec des pensées en Comic Sans, est devenu viral à partir de 2013 sur des plateformes comme Reddit et Tumblr, symbolisant l'humour absurde d'internet."),
            en = LocalizedContent("Which is the most viral internet meme?", listOf("Doge", "Harambe", "Fidget Spinner", "Among Us"), "Culture", "The Doge meme, featuring a Shiba Inu with thoughts in Comic Sans, went viral from 2013 on platforms like Reddit and Tumblr, symbolizing internet absurdist humor."),
            zh = LocalizedContent("哪个互联网迷因最火？", listOf("Doge", "Harambe", "指尖陀螺", "Among Us"), "文化", "Doge迷因以一只柴犬和Comic Sans字体的内心独白为特色，从2013年起在Reddit和Tumblr等平台走红，象征着互联网的荒诞幽默。"),
            es = LocalizedContent("¿Cuál es el meme de internet más viral?", listOf("Doge", "Harambe", "Fidget Spinner", "Among Us"), "Cultura", "El meme Doge, que muestra un Shiba Inu con pensamientos en Comic Sans, se volvió viral a partir de 2013 en plataformas como Reddit y Tumblr, simbolizando el humor absurdo de internet.")
        ),
        BilingualQuestion(
            id = 51452, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus durable?", listOf("Rickroll", "Lolcats", "Distracted Boyfriend", "Loss"), "Culture", "Le Rickroll est un mème basé sur le clip du tube \"Never Gonna Give You Up\" de Rick Astley (1987), utilisé comme canular pour rediriger des internautes vers cette vidéo depuis 2007. Sa longévité tient à sa simplicité et à sa capacité à surprendre encore aujourd'hui."),
            en = LocalizedContent("What is the most enduring internet meme?", listOf("Rickroll", "Lolcats", "Distracted Boyfriend", "Loss"), "Culture", "The Rickroll is a meme based on the music video of Rick Astley's hit \"Never Gonna Give You Up\" (1987), used as a prank to redirect internet users to this video since 2007. Its longevity is due to its simplicity and ability to still surprise today."),
            zh = LocalizedContent("哪个网络迷因最持久？", listOf("瑞克摇", "搞笑猫", "分心男友", "损失"), "文化", "瑞克摇是一个基于瑞克·阿斯特利1987年热门歌曲《Never Gonna Give You Up》音乐视频的迷因，自2007年起被用作恶作剧，将网民重定向到该视频。其持久性源于其简单性和至今仍能带来惊喜的能力。"),
            es = LocalizedContent("¿Cuál es el meme de internet más duradero?", listOf("Rickroll", "Lolcats", "Distracted Boyfriend", "Loss"), "Cultura", "El Rickroll es un meme basado en el videoclip del éxito \"Never Gonna Give You Up\" de Rick Astley (1987), utilizado como broma para redirigir a los internautas a este video desde 2007. Su longevidad se debe a su simplicidad y a su capacidad de sorprender aún hoy.")
        ),
        BilingualQuestion(
            id = 51453, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel carnaval est le plus coloré?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le carnaval de Rio de Janeiro est mondialement reconnu pour ses défilés spectaculaires aux costumes éclatants et ses chars richement décorés."),
            en = LocalizedContent("Which carnival is the most colorful?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Rio de Janeiro carnival is world-renowned for its spectacular parades with vibrant costumes and richly decorated floats."),
            zh = LocalizedContent("哪个狂欢节最色彩缤纷？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "里约热内卢狂欢节以其壮观的游行、鲜艳的服装和装饰华丽的花车而闻名于世。"),
            es = LocalizedContent("¿Qué carnaval es el más colorido?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El carnaval de Río de Janeiro es mundialmente reconocido por sus espectaculares desfiles con trajes vibrantes y carrozas ricamente decoradas.")
        ),
        BilingualQuestion(
            id = 51454, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval dure le plus longtemps?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le carnaval de La Nouvelle-Orléans, connu sous le nom de Mardi Gras, s'étend officiellement de l'Épiphanie (6 janvier) au Mardi Gras, soit environ deux mois."),
            en = LocalizedContent("Which carnival lasts the longest?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The New Orleans carnival, known as Mardi Gras, officially runs from Epiphany (January 6) to Mardi Gras, about two months."),
            zh = LocalizedContent("哪个狂欢节持续时间最长？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "新奥尔良狂欢节，即狂欢节，正式从主显节（1月6日）持续到狂欢节当天，大约两个月。"),
            es = LocalizedContent("¿Qué carnaval dura más tiempo?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El carnaval de Nueva Orleans, conocido como Mardi Gras, se extiende oficialmente desde la Epifanía (6 de enero) hasta el Martes de Carnaval, aproximadamente dos meses.")
        ),
        BilingualQuestion(
            id = 51455, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel danse traditionnelle est la plus gracieuse?", listOf("Ballet", "Flamenco", "Tango", "Valse"), "Culture", "Le ballet est considéré comme la danse la plus gracieuse en raison de sa technique rigoureuse, de ses mouvements fluides et de son esthétique visuelle, développée à la cour de France au XVIIe siècle."),
            en = LocalizedContent("Which traditional dance is the most graceful?", listOf("Ballet", "Flamenco", "Tango", "Waltz"), "Culture", "Ballet is considered the most graceful dance due to its rigorous technique, fluid movements, and visual aesthetics, developed at the French court in the 17th century."),
            zh = LocalizedContent("哪种传统舞蹈最优美？", listOf("芭蕾", "弗拉门戈", "探戈", "华尔兹"), "文化", "芭蕾因其严谨的技巧、流畅的动作和视觉美感而被认为是最优美的舞蹈，于17世纪在法国宫廷发展起来。"),
            es = LocalizedContent("¿Qué danza tradicional es la más grácil?", listOf("Ballet", "Flamenco", "Tango", "Vals"), "Cultura", "El ballet es considerado la danza más grácil debido a su técnica rigurosa, movimientos fluidos y estética visual, desarrollada en la corte francesa en el siglo XVII.")
        ),
        BilingualQuestion(
            id = 51456, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel danse traditionnelle est la plus passionnée?", listOf("Flamenco", "Ballet", "Valse", "Pouloulkous"), "Culture", "Le flamenco, originaire d'Andalousie, est reconnu pour son intensité émotionnelle, mêlant chant, guitare et danse expressive."),
            en = LocalizedContent("Which traditional dance is the most passionate?", listOf("Flamenco", "Ballet", "Waltz", "Pouloulkous"), "Culture", "Flamenco, originating from Andalusia, is recognized for its emotional intensity, blending song, guitar, and expressive dance."),
            zh = LocalizedContent("哪种传统舞蹈最热情？", listOf("弗拉门戈", "芭蕾", "华尔兹", "普卢卢库斯"), "文化", "弗拉门戈起源于安达卢西亚，以其情感强度而闻名，融合了歌唱、吉他和富有表现力的舞蹈。"),
            es = LocalizedContent("¿Qué danza tradicional es la más apasionada?", listOf("Flamenco", "Ballet", "Vals", "Pouloulkous"), "Cultura", "El flamenco, originario de Andalucía, es reconocido por su intensidad emocional, combinando cante, guitarra y baile expresivo.")
        ),
        BilingualQuestion(
            id = 51457, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion est la plus pratiquée en Asie?", listOf("Bouddhisme", "Hindouisme", "Taoïsme", "Confucianisme"), "Culture", "L'hindouisme est la religion majoritaire en Inde et au Népal, et compte plus d'un milliard de fidèles, principalement concentrés en Asie du Sud."),
            en = LocalizedContent("Which religion is most practiced in Asia?", listOf("Buddhism", "Hinduism", "Taoism", "Confucianism"), "Culture", "Hinduism is the majority religion in India and Nepal, with over a billion followers, mainly concentrated in South Asia."),
            zh = LocalizedContent("亚洲最盛行的宗教是哪个？", listOf("佛教", "印度教", "道教", "儒教"), "文化", "印度教是印度和尼泊尔的主要宗教，拥有超过十亿信徒，主要集中在南亚。"),
            es = LocalizedContent("¿Qué religión es la más practicada en Asia?", listOf("Budismo", "Hinduismo", "Taoísmo", "Confucianismo"), "Cultura", "El hinduismo es la religión mayoritaria en India y Nepal, con más de mil millones de fieles, concentrados principalmente en el sur de Asia.")
        ),
        BilingualQuestion(
            id = 51458, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel religion est la plus pratiquée en Afrique?", listOf("Christianisme", "Islam", "Animisme", "Hindouisme"), "Culture", "Le christianisme est la religion la plus pratiquée en Afrique, suivi de près par l'islam, en raison de l'histoire coloniale et des missions chrétiennes."),
            en = LocalizedContent("Which religion is most practiced in Africa?", listOf("Christianity", "Islam", "Animism", "Hinduism"), "Culture", "Christianity is the most practiced religion in Africa, closely followed by Islam, due to colonial history and Christian missions."),
            zh = LocalizedContent("非洲最盛行的宗教是哪个？", listOf("基督教", "伊斯兰教", "泛灵论", "印度教"), "文化", "基督教是非洲最盛行的宗教，紧随其后的是伊斯兰教，这是由于殖民历史和基督教传教活动。"),
            es = LocalizedContent("¿Qué religión es la más practicada en África?", listOf("Cristianismo", "Islam", "Animismo", "Hinduismo"), "Cultura", "El cristianismo es la religión más practicada en África, seguido de cerca por el islam, debido a la historia colonial y las misiones cristianas.")
        ),
        BilingualQuestion(
            id = 51459, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO a le plus de visiteurs?", listOf("Taj Mahal", "Statue de la Liberté", "Big Ben", "Colosseum"), "Culture", "Le Colisée de Rome est le site classé à l'UNESCO le plus visité au monde, attirant environ 7,6 millions de touristes par an."),
            en = LocalizedContent("Which UNESCO site has the most visitors?", listOf("Taj Mahal", "Statue of Liberty", "Big Ben", "Colosseum"), "Culture", "The Colosseum in Rome is the most visited UNESCO World Heritage site, attracting about 7.6 million tourists per year."),
            zh = LocalizedContent("哪个联合国教科文组织遗址游客最多？", listOf("泰姬陵", "自由女神像", "大本钟", "罗马斗兽场"), "文化", "罗马斗兽场是游客最多的联合国教科文组织世界遗产，每年吸引约760万游客。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO tiene más visitantes?", listOf("Taj Mahal", "Estatua de la Libertad", "Big Ben", "Coliseo"), "Cultura", "El Coliseo de Roma es el sitio Patrimonio de la Humanidad más visitado, atrayendo alrededor de 7,6 millones de turistas al año.")
        ),
        BilingualQuestion(
            id = 51460, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO est le plus menacé?", listOf("Bamiyan", "Venice", "Galapagos", "Serengeti"), "Culture", "Les statues de Bouddha de Bamiyan, en Afghanistan, ont été classées au patrimoine mondial en péril après leur destruction par les talibans en 2001."),
            en = LocalizedContent("Which UNESCO site is the most threatened?", listOf("Bamiyan", "Venice", "Galapagos", "Serengeti"), "Culture", "The Buddhas of Bamiyan in Afghanistan were listed as World Heritage in Danger after their destruction by the Taliban in 2001."),
            zh = LocalizedContent("哪个联合国教科文组织遗址最受威胁？", listOf("巴米扬", "威尼斯", "加拉帕戈斯", "塞伦盖蒂"), "文化", "阿富汗的巴米扬大佛在2001年被塔利班摧毁后被列为濒危世界遗产。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO está más amenazado?", listOf("Bamiyán", "Venecia", "Galápagos", "Serengeti"), "Cultura", "Los Budas de Bamiyán en Afganistán fueron declarados Patrimonio de la Humanidad en Peligro tras su destrucción por los talibanes en 2001.")
        ),
        BilingualQuestion(
            id = 51461, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel culture indigène a la plus longue histoire?", listOf("Mayas", "Aztèques", "Incas", "Égyptiens"), "Culture", "La civilisation égyptienne antique est l'une des plus anciennes, avec des traces d'occupation humaine remontant à environ 3100 avant J.-C., ce qui en fait la culture indigène continue la plus longue."),
            en = LocalizedContent("Which indigenous culture has the longest history?", listOf("Mayas", "Aztecs", "Incas", "Egyptians"), "Culture", "Ancient Egyptian civilization is one of the oldest, with traces of human occupation dating back to around 3100 BC, making it the longest continuous indigenous culture."),
            zh = LocalizedContent("哪个土著文化历史最悠久？", listOf("玛雅", "阿兹特克", "印加", "埃及"), "文化", "古埃及文明是最古老的文明之一，人类居住痕迹可追溯到约公元前3100年，使其成为持续时间最长的土著文化。"),
            es = LocalizedContent("¿Qué cultura indígena tiene la historia más larga?", listOf("Mayas", "Aztecas", "Incas", "Egipcios"), "Cultura", "La civilización egipcia antigua es una de las más antiguas, con rastros de ocupación humana que se remontan al 3100 a.C., lo que la convierte en la cultura indígena continua más larga.")
        ),
        BilingualQuestion(
            id = 51462, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival internet a le plus d'influence?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Decentraland"), "Culture", "Twitch Plays a démontré une influence massive en permettant à des milliers de spectateurs de contrôler collectivement un jeu vidéo en temps réel, créant un phénomène viral et une nouvelle forme de divertissement participatif."),
            en = LocalizedContent("Which internet festival has the most influence?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Decentraland"), "Culture", "Twitch Plays demonstrated massive influence by allowing thousands of viewers to collectively control a video game in real time, creating a viral phenomenon and a new form of participatory entertainment."),
            zh = LocalizedContent("哪个互联网节日影响力最大？", listOf("Twitch Plays", "Reddit Place", "比特币节", "Decentraland"), "文化", "Twitch Plays 通过允许数千名观众实时集体控制一款电子游戏，创造了病毒式现象和一种新的参与式娱乐形式，展现了巨大的影响力。"),
            es = LocalizedContent("¿Qué festival de internet tiene más influencia?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Decentraland"), "Cultura", "Twitch Plays demostró una influencia masiva al permitir que miles de espectadores controlaran colectivamente un videojuego en tiempo real, creando un fenómeno viral y una nueva forma de entretenimiento participativo.")
        ),
        BilingualQuestion(
            id = 51463, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus imitable?", listOf("Rickroll", "Doge", "Nyan Cat", "Distracted Boyfriend"), "Culture", "Nyan Cat est un mème devenu viral en 2011 grâce à son animation simple d'un chat volant avec un corps de pop-tart, accompagnée d'une musique entraînante, ce qui l'a rendu facile à reproduire et à imiter."),
            en = LocalizedContent("Which internet meme is the most imitable?", listOf("Rickroll", "Doge", "Nyan Cat", "Distracted Boyfriend"), "Culture", "Nyan Cat is a meme that went viral in 2011 due to its simple animation of a flying cat with a pop-tart body, accompanied by catchy music, making it easy to reproduce and imitate."),
            zh = LocalizedContent("哪个网络迷因最容易被模仿？", listOf("Rickroll", "Doge", "Nyan Cat", "分心的男友"), "文化", "Nyan Cat 是一个在2011年走红的迷因，因其简单的动画——一只飞行猫搭配果馅饼身体，加上朗朗上口的音乐，使其易于复制和模仿。"),
            es = LocalizedContent("¿Qué meme de internet es el más imitable?", listOf("Rickroll", "Doge", "Nyan Cat", "Distracted Boyfriend"), "Cultura", "Nyan Cat es un meme que se volvió viral en 2011 debido a su animación simple de un gato volador con cuerpo de pop-tart, acompañada de música pegadiza, lo que lo hizo fácil de reproducir e imitar.")
        ),
        BilingualQuestion(
            id = 51464, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus diversifié?", listOf("Rickroll", "Lolcats", "Distracted Boyfriend", "Impact"), "Culture", "Le mème \"Impact\" est devenu l'un des plus diversifiés car il se décline en une multitude de variations, allant de l'impact visuel à l'impact émotionnel, souvent utilisé pour commenter des situations inattendues ou marquantes."),
            en = LocalizedContent("Which internet meme is the most diverse?", listOf("Rickroll", "Lolcats", "Distracted Boyfriend", "Impact"), "Culture", "The 'Impact' meme has become one of the most diverse as it comes in a multitude of variations, ranging from visual impact to emotional impact, often used to comment on unexpected or striking situations."),
            zh = LocalizedContent("哪个网络迷因最多样化？", listOf("Rickroll", "Lolcats", "分心的男友", "Impact"), "文化", "“Impact”迷因已成为最多样化的迷因之一，因为它有无数变体，从视觉冲击到情感冲击，常用于评论意外或引人注目的情况。"),
            es = LocalizedContent("¿Qué meme de internet es el más diverso?", listOf("Rickroll", "Lolcats", "Distracted Boyfriend", "Impact"), "Cultura", "El meme 'Impact' se ha convertido en uno de los más diversos, ya que se presenta en una multitud de variaciones, desde el impacto visual hasta el emocional, a menudo utilizado para comentar situaciones inesperadas o impactantes.")
        ),
        BilingualQuestion(
            id = 51465, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval a la plus grande parade?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le Carnaval de Rio de Janeiro est inscrit au Guinness World Records comme le plus grand carnaval du monde, avec des défilés spectaculaires de samba rassemblant des millions de participants et spectateurs."),
            en = LocalizedContent("Which carnival has the largest parade?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Rio de Janeiro Carnival is listed in the Guinness World Records as the largest carnival in the world, with spectacular samba parades gathering millions of participants and spectators."),
            zh = LocalizedContent("哪个狂欢节有最大的游行？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "里约热内卢狂欢节被吉尼斯世界纪录列为世界上最大的狂欢节，其壮观的桑巴游行吸引了数百万参与者和观众。"),
            es = LocalizedContent("¿Qué carnaval tiene el desfile más grande?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El Carnaval de Río de Janeiro está registrado en el Guinness World Records como el carnaval más grande del mundo, con desfiles espectaculares de samba que reúnen a millones de participantes y espectadores.")
        ),
        BilingualQuestion(
            id = 51466, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval est le plus traditionnel?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le Carnaval de Venise, avec ses masques et costumes historiques, remonte au XIIIe siècle et est considéré comme l'un des plus anciens et authentiques."),
            en = LocalizedContent("Which carnival is the most traditional?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Venice Carnival, with its historical masks and costumes, dates back to the 13th century and is considered one of the oldest and most authentic."),
            zh = LocalizedContent("哪个狂欢节最传统？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "威尼斯狂欢节以其历史悠久的面具和服装著称，可追溯到13世纪，被认为是最古老、最正宗的狂欢节之一。"),
            es = LocalizedContent("¿Qué carnaval es el más tradicional?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El Carnaval de Venecia, con sus máscaras y disfraces históricos, se remonta al siglo XIII y es considerado uno de los más antiguos y auténticos.")
        ),
        BilingualQuestion(
            id = 51467, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel danse traditionnelle a la meilleure musique?", listOf("Flamenco", "Ballet", "Tango", "Opéra"), "Culture", "Le tango, né dans les quartiers populaires de Buenos Aires et Montevideo, est reconnu pour sa musique passionnée mêlant bandonéon, violon et piano, classée au patrimoine immatériel de l'UNESCO."),
            en = LocalizedContent("Which traditional dance has the best music?", listOf("Flamenco", "Ballet", "Tango", "Opera"), "Culture", "Tango, born in the working-class neighborhoods of Buenos Aires and Montevideo, is recognized for its passionate music blending bandoneón, violin, and piano, and is listed as UNESCO Intangible Cultural Heritage."),
            zh = LocalizedContent("哪种传统舞蹈的音乐最好？", listOf("弗拉门戈", "芭蕾", "探戈", "歌剧"), "文化", "探戈诞生于布宜诺斯艾利斯和蒙得维的亚的工人阶级社区，以其融合班多钮、小提琴和钢琴的激情音乐而闻名，并被列入联合国教科文组织非物质文化遗产。"),
            es = LocalizedContent("¿Qué baile tradicional tiene la mejor música?", listOf("Flamenco", "Ballet", "Tango", "Ópera"), "Cultura", "El tango, nacido en los barrios populares de Buenos Aires y Montevideo, es reconocido por su música apasionada que combina bandoneón, violín y piano, y está clasificado como Patrimonio Cultural Inmaterial de la UNESCO.")
        ),
        BilingualQuestion(
            id = 51468, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel danse traditionnelle a les costumes les plus élaborés?", listOf("Flamenco", "Kathakali", "Ballet", "Opéra"), "Culture", "Le Kathakali est un art dramatique dansé du Kerala, en Inde, dont les costumes et maquillages très codifiés et colorés sont extrêmement élaborés, chaque couleur représentant un trait de caractère spécifique."),
            en = LocalizedContent("Which traditional dance has the most elaborate costumes?", listOf("Flamenco", "Kathakali", "Ballet", "Opera"), "Culture", "Kathakali is a dance-drama from Kerala, India, whose highly codified and colorful costumes and makeup are extremely elaborate, with each color representing a specific character trait."),
            zh = LocalizedContent("哪种传统舞蹈的服装最精致？", listOf("弗拉门戈", "卡塔卡利", "芭蕾", "歌剧"), "文化", "卡塔卡利是印度喀拉拉邦的一种舞蹈戏剧，其高度程式化且色彩丰富的服装和妆容极其精致，每种颜色代表特定的性格特征。"),
            es = LocalizedContent("¿Qué baile tradicional tiene los disfraces más elaborados?", listOf("Flamenco", "Kathakali", "Ballet", "Ópera"), "Cultura", "El Kathakali es un drama danzado de Kerala, India, cuyos disfraces y maquillajes altamente codificados y coloridos son extremadamente elaborados, representando cada color un rasgo de carácter específico.")
        ),
        BilingualQuestion(
            id = 51469, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion a le plus de diversité?", listOf("Bouddhisme", "Christianisme", "Islam", "Hindouisme"), "Culture", "Le christianisme est la religion la plus diversifiée au monde, avec des branches principales comme le catholicisme, le protestantisme et l'orthodoxie, ainsi que des milliers de dénominations locales."),
            en = LocalizedContent("Which religion has the most diversity?", listOf("Buddhism", "Christianity", "Islam", "Hinduism"), "Culture", "Christianity is the most diverse religion in the world, with major branches such as Catholicism, Protestantism, and Orthodoxy, as well as thousands of local denominations."),
            zh = LocalizedContent("哪个宗教最多样化？", listOf("佛教", "基督教", "伊斯兰教", "印度教"), "文化", "基督教是世界上最多样化的宗教，主要分支包括天主教、新教和东正教，以及数千个地方教派。"),
            es = LocalizedContent("¿Qué religión tiene más diversidad?", listOf("Budismo", "Cristianismo", "Islam", "Hinduismo"), "Cultura", "El cristianismo es la religión más diversa del mundo, con ramas principales como el catolicismo, el protestantismo y la ortodoxia, así como miles de denominaciones locales.")
        ),
        BilingualQuestion(
            id = 51470, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion a le moins de temples?", listOf("Zoroastrisme", "Jaïnisme", "Shintoïsme", "Taoïsme"), "Culture", "Le zoroastrisme compte très peu de temples car ses pratiquants sont peu nombreux, environ 100 000 dans le monde, principalement en Inde et en Iran."),
            en = LocalizedContent("Which religion has the fewest temples?", listOf("Zoroastrianism", "Jainism", "Shinto", "Taoism"), "Culture", "Zoroastrianism has very few temples because its practitioners are few, about 100,000 worldwide, mainly in India and Iran."),
            zh = LocalizedContent("哪个宗教的寺庙最少？", listOf("琐罗亚斯德教", "耆那教", "神道教", "道教"), "文化", "琐罗亚斯德教的寺庙很少，因为其信徒数量稀少，全球约10万人，主要分布在印度和伊朗。"),
            es = LocalizedContent("¿Qué religión tiene menos templos?", listOf("Zoroastrismo", "Jainismo", "Sintoísmo", "Taoísmo"), "Cultura", "El zoroastrismo tiene muy pocos templos debido a que sus practicantes son escasos, alrededor de 100,000 en todo el mundo, principalmente en India e Irán.")
        ),
        BilingualQuestion(
            id = 51471, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO a le meilleur architecture?", listOf("Taj Mahal", "Versailles", "Colosseum", "Sagrada Familia"), "Culture", "La Sagrada Familia à Barcelone, conçue par Antoni Gaudí, est un site UNESCO depuis 2005 pour son architecture moderniste unique et son importance culturelle."),
            en = LocalizedContent("Which UNESCO site has the best architecture?", listOf("Taj Mahal", "Versailles", "Colosseum", "Sagrada Familia"), "Culture", "The Sagrada Familia in Barcelona, designed by Antoni Gaudí, has been a UNESCO site since 2005 for its unique modernist architecture and cultural significance."),
            zh = LocalizedContent("哪个联合国教科文组织遗址的建筑最好？", listOf("泰姬陵", "凡尔赛宫", "罗马斗兽场", "圣家堂"), "文化", "巴塞罗那的圣家堂由安东尼·高迪设计，自2005年起被列为联合国教科文组织世界遗产，因其独特的现代主义建筑和文化重要性。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO tiene la mejor arquitectura?", listOf("Taj Mahal", "Versalles", "Coliseo", "Sagrada Familia"), "Cultura", "La Sagrada Familia en Barcelona, diseñada por Antoni Gaudí, es un sitio de la UNESCO desde 2005 por su arquitectura modernista única y su importancia cultural.")
        ),
        BilingualQuestion(
            id = 51472, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO a la meilleure histoire?", listOf("Taj Mahal", "Angkor Wat", "Knossos", "Persépolis"), "Culture", "Angkor Wat, au Cambodge, est le plus grand monument religieux du monde et un chef-d'œuvre de l'architecture khmère, classé à l'UNESCO en 1992."),
            en = LocalizedContent("Which UNESCO site has the best history?", listOf("Taj Mahal", "Angkor Wat", "Knossos", "Persepolis"), "Culture", "Angkor Wat in Cambodia is the largest religious monument in the world and a masterpiece of Khmer architecture, listed as a UNESCO site in 1992."),
            zh = LocalizedContent("哪个联合国教科文组织遗址的历史最悠久？", listOf("泰姬陵", "吴哥窟", "克诺索斯", "波斯波利斯"), "文化", "柬埔寨的吴哥窟是世界上最大的宗教建筑，是高棉建筑的杰作，于1992年被列为联合国教科文组织世界遗产。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO tiene la mejor historia?", listOf("Taj Mahal", "Angkor Wat", "Knossos", "Persépolis"), "Cultura", "Angkor Wat en Camboya es el monumento religioso más grande del mundo y una obra maestra de la arquitectura jemer, declarado Patrimonio de la Humanidad por la UNESCO en 1992.")
        ),
        BilingualQuestion(
            id = 51473, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel culture indigène a le plus d'influence?", listOf("Mayas", "Aztèques", "Incas", "Amérindiens"), "Culture", "Les Amérindiens ont profondément marqué l'histoire et la culture des Amériques, avec des contributions durables dans l'agriculture, la langue et les traditions."),
            en = LocalizedContent("Which indigenous culture has the most influence?", listOf("Mayans", "Aztecs", "Incas", "Native Americans"), "Culture", "Native Americans have profoundly marked the history and culture of the Americas, with lasting contributions in agriculture, language, and traditions."),
            zh = LocalizedContent("哪个土著文化影响力最大？", listOf("玛雅", "阿兹特克", "印加", "美洲原住民"), "文化", "美洲原住民深刻影响了美洲的历史和文化，在农业、语言和传统方面做出了持久的贡献。"),
            es = LocalizedContent("¿Qué cultura indígena tiene más influencia?", listOf("Mayas", "Aztecas", "Incas", "Amerindios"), "Cultura", "Los amerindios han marcado profundamente la historia y la cultura de las Américas, con contribuciones duraderas en agricultura, lengua y tradiciones.")
        ),
        BilingualQuestion(
            id = 51474, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival internet a le plus de durée?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Metaverse"), "Culture", "Le Metaverse est un concept d'univers virtuel persistant et interconnecté, accessible en continu, contrairement à un événement limité dans le temps comme un festival traditionnel."),
            en = LocalizedContent("Which internet festival lasts the longest?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Metaverse"), "Culture", "The Metaverse is a concept of a persistent and interconnected virtual universe, accessible continuously, unlike a time-limited event like a traditional festival."),
            zh = LocalizedContent("哪个互联网节日持续时间最长？", listOf("Twitch Plays", "Reddit Place", "比特币节", "元宇宙"), "文化", "元宇宙是一个持久且互联的虚拟宇宙概念，可以持续访问，不像传统节日那样有时间限制。"),
            es = LocalizedContent("¿Qué festival de internet tiene la mayor duración?", listOf("Twitch Plays", "Reddit Place", "Bitcoin Festival", "Metaverso"), "Cultura", "El Metaverso es un concepto de universo virtual persistente e interconectado, accesible de forma continua, a diferencia de un evento limitado en el tiempo como un festival tradicional.")
        ),
        BilingualQuestion(
            id = 51475, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus crossover?", listOf("Rickroll", "Doge", "Thanos", "Infinity Stones"), "Culture", "Le mème \"Infinity Stones\" vient de l'univers Marvel, où ces pierres sont des artefacts cosmiques. Il est devenu un mème crossover car il est utilisé pour parodier n'importe quelle collection d'objets dans divers fandoms."),
            en = LocalizedContent("Which internet meme is the most crossover?", listOf("Rickroll", "Doge", "Thanos", "Infinity Stones"), "Culture", "The \"Infinity Stones\" meme comes from the Marvel universe, where these stones are cosmic artifacts. It became a crossover meme because it is used to parody any collection of objects in various fandoms."),
            zh = LocalizedContent("哪个网络迷因最具跨界性？", listOf("瑞克摇", "神烦狗", "灭霸", "无限宝石"), "文化", "“无限宝石”迷因来自漫威宇宙，这些宝石是宇宙神器。它成为跨界迷因，因为被用来戏仿各种粉丝圈中的任何物品集合。"),
            es = LocalizedContent("¿Qué meme de internet es el más crossover?", listOf("Rickroll", "Doge", "Thanos", "Infinity Stones"), "Cultura", "El meme de las \"Infinity Stones\" proviene del universo Marvel, donde estas piedras son artefactos cósmicos. Se convirtió en un meme crossover porque se usa para parodiar cualquier colección de objetos en varios fandoms.")
        ),
        BilingualQuestion(
            id = 51476, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus influent?", listOf("Rickroll", "Doge", "Harambe", "Distracted Boyfriend"), "Culture", "Le mème Doge, avec son chien Shiba Inu et son texte en Comic Sans, est devenu emblématique de la culture internet des années 2010, influençant même la cryptomonnaie du même nom."),
            en = LocalizedContent("Which internet meme is the most influential?", listOf("Rickroll", "Doge", "Harambe", "Distracted Boyfriend"), "Culture", "The Doge meme, with its Shiba Inu dog and Comic Sans text, became emblematic of 2010s internet culture, even influencing the cryptocurrency of the same name."),
            zh = LocalizedContent("哪个网络迷因最具影响力？", listOf("瑞克摇", "神烦狗", "哈兰贝", "分心男友"), "文化", "神烦狗迷因，以其柴犬和漫画字体文字，成为2010年代互联网文化的象征，甚至影响了同名的加密货币。"),
            es = LocalizedContent("¿Qué meme de internet es el más influyente?", listOf("Rickroll", "Doge", "Harambe", "Distracted Boyfriend"), "Cultura", "El meme Doge, con su perro Shiba Inu y texto en Comic Sans, se volvió emblemático de la cultura de internet de los 2010, influyendo incluso en la criptomoneda del mismo nombre.")
        ),
        BilingualQuestion(
            id = 51477, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval a la meilleure ambiance?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le Carnaval de Trinidad est mondialement reconnu pour son ambiance électrique, ses défilés colorés et sa musique entraînante, notamment le calypso et le soca."),
            en = LocalizedContent("Which carnival has the best atmosphere?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Trinidad Carnival is globally recognized for its electric atmosphere, colorful parades, and lively music, especially calypso and soca."),
            zh = LocalizedContent("哪个狂欢节氛围最好？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "特立尼达狂欢节以其热烈的氛围、色彩缤纷的游行和欢快的音乐（尤其是卡利普索和索卡）而闻名全球。"),
            es = LocalizedContent("¿Qué carnaval tiene la mejor atmósfera?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El Carnaval de Trinidad es reconocido mundialmente por su ambiente eléctrico, desfiles coloridos y música animada, especialmente el calipso y la soca.")
        ),
        BilingualQuestion(
            id = 51478, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval est le plus cher?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le Carnaval de Rio est le plus cher en raison de ses défilés spectaculaires, avec des écoles de samba aux costumes élaborés et chars monumentaux, nécessitant des budgets de plusieurs millions de dollars."),
            en = LocalizedContent("Which carnival is the most expensive?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Rio Carnival is the most expensive due to its spectacular parades, with samba schools featuring elaborate costumes and monumental floats, requiring budgets of several million dollars."),
            zh = LocalizedContent("哪个狂欢节最昂贵？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "里约狂欢节因其壮观的游行而最为昂贵，桑巴舞学校拥有精美的服装和巨大的花车，预算高达数百万美元。"),
            es = LocalizedContent("¿Qué carnaval es el más caro?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El Carnaval de Río es el más caro debido a sus espectaculares desfiles, con escuelas de samba que presentan elaborados disfraces y carrozas monumentales, requiriendo presupuestos de varios millones de dólares.")
        ),
        BilingualQuestion(
            id = 51479, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel danse traditionnelle est la plus difficile à apprendre?", listOf("Ballet", "Flamenco", "Tango", "Opéra"), "Culture", "Le ballet exige des années de pratique intensive pour maîtriser la technique, la souplesse et la précision des mouvements, ce qui en fait l'une des danses les plus exigeantes physiquement et techniquement."),
            en = LocalizedContent("Which traditional dance is the hardest to learn?", listOf("Ballet", "Flamenco", "Tango", "Opera"), "Culture", "Ballet requires years of intensive practice to master technique, flexibility, and precision of movement, making it one of the most physically and technically demanding dances."),
            zh = LocalizedContent("哪种传统舞蹈最难学？", listOf("芭蕾", "弗拉门戈", "探戈", "歌剧"), "文化", "芭蕾需要多年的密集练习才能掌握技巧、柔韧性和动作的精确性，使其成为对身体和技术要求最高的舞蹈之一。"),
            es = LocalizedContent("¿Qué baile tradicional es el más difícil de aprender?", listOf("Ballet", "Flamenco", "Tango", "Ópera"), "Cultura", "El ballet requiere años de práctica intensiva para dominar la técnica, la flexibilidad y la precisión de los movimientos, lo que lo convierte en uno de los bailes más exigentes física y técnicamente.")
        ),
        BilingualQuestion(
            id = 51480, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel danse traditionnelle est la plus rapide?", listOf("Flamenco", "Ballet", "Tango", "Valse"), "Culture", "Le flamenco, originaire d'Andalousie, est connu pour ses rythmes vifs et ses mouvements rapides des pieds, ce qui en fait l'une des danses traditionnelles les plus rapides."),
            en = LocalizedContent("Which traditional dance is the fastest?", listOf("Flamenco", "Ballet", "Tango", "Waltz"), "Culture", "Flamenco, originating from Andalusia, is known for its lively rhythms and rapid foot movements, making it one of the fastest traditional dances."),
            zh = LocalizedContent("哪种传统舞蹈最快？", listOf("弗拉门戈", "芭蕾", "探戈", "华尔兹"), "文化", "弗拉门戈起源于安达卢西亚，以其活泼的节奏和快速的脚步动作而闻名，是最快的传统舞蹈之一。"),
            es = LocalizedContent("¿Qué baile tradicional es el más rápido?", listOf("Flamenco", "Ballet", "Tango", "Vals"), "Cultura", "El flamenco, originario de Andalucía, es conocido por sus ritmos vivos y movimientos rápidos de pies, lo que lo convierte en uno de los bailes tradicionales más rápidos.")
        ),
        BilingualQuestion(
            id = 51481, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion a le plus de différentes écoles?", listOf("Bouddhisme", "Christianisme", "Islam", "Hindouisme"), "Culture", "L'hindouisme ne possède pas de dogme central ni d'autorité unique, ce qui a permis l'émergence de nombreuses écoles philosophiques et traditions, comme le Vedanta, le Yoga ou le Shivaïsme."),
            en = LocalizedContent("Which religion has the most different schools?", listOf("Buddhism", "Christianity", "Islam", "Hinduism"), "Culture", "Hinduism has no central dogma or single authority, which has allowed the emergence of numerous philosophical schools and traditions, such as Vedanta, Yoga, and Shaivism."),
            zh = LocalizedContent("哪个宗教拥有最多不同的学派？", listOf("佛教", "基督教", "伊斯兰教", "印度教"), "文化", "印度教没有核心教条或单一权威，这使得众多哲学学派和传统得以涌现，如吠檀多、瑜伽和湿婆派。"),
            es = LocalizedContent("¿Qué religión tiene más escuelas diferentes?", listOf("Budismo", "Cristianismo", "Islam", "Hinduismo"), "Cultura", "El hinduismo no posee un dogma central ni una autoridad única, lo que ha permitido la aparición de numerosas escuelas filosóficas y tradiciones, como el Vedanta, el Yoga o el Shivaísmo.")
        ),
        BilingualQuestion(
            id = 51482, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion est la plus jeune?", listOf("Mormonisme", "Babisme", "Bahaïsme", "Scientologie"), "Culture", "Le bahaïsme est la plus jeune des grandes religions, fondée au XIXe siècle en Perse par Baha'u'llah, soit bien après l'islam ou le christianisme."),
            en = LocalizedContent("Which religion is the youngest?", listOf("Mormonism", "Babism", "Baháʼí Faith", "Scientology"), "Culture", "The Baháʼí Faith is the youngest major religion, founded in the 19th century in Persia by Baháʼu'lláh, well after Islam or Christianity."),
            zh = LocalizedContent("哪种宗教最年轻？", listOf("摩门教", "巴比教", "巴哈伊教", "山达基教"), "文化", "巴哈伊教是最年轻的主要宗教，由巴哈欧拉于19世纪在波斯创立，远晚于伊斯兰教或基督教。"),
            es = LocalizedContent("¿Qué religión es la más joven?", listOf("Mormonismo", "Babismo", "Fe baháʼí", "Cienciología"), "Cultura", "La fe baháʼí es la religión principal más joven, fundada en el siglo XIX en Persia por Baháʼu'lláh, muy posterior al islam o al cristianismo.")
        ),
        BilingualQuestion(
            id = 51483, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO a le plus d'importance historique?", listOf("Taj Mahal", "Angkor Wat", "Versailles", "Knossos"), "Culture", "Knossos est le plus important site archéologique de l'âge du bronze en Crète, associé à la civilisation minoenne et au mythe du Labyrinthe du roi Minos."),
            en = LocalizedContent("Which UNESCO site has the most historical importance?", listOf("Taj Mahal", "Angkor Wat", "Versailles", "Knossos"), "Culture", "Knossos is the most important Bronze Age archaeological site in Crete, associated with the Minoan civilization and the myth of King Minos's Labyrinth."),
            zh = LocalizedContent("哪个联合国教科文组织遗址最具历史重要性？", listOf("泰姬陵", "吴哥窟", "凡尔赛宫", "克诺索斯"), "文化", "克诺索斯是克里特岛最重要的青铜时代考古遗址，与米诺斯文明和米诺斯国王的迷宫神话相关。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO tiene mayor importancia histórica?", listOf("Taj Mahal", "Angkor Wat", "Versalles", "Cnosos"), "Cultura", "Cnosos es el sitio arqueológico más importante de la Edad del Bronce en Creta, asociado con la civilización minoica y el mito del Laberinto del rey Minos.")
        ),
        BilingualQuestion(
            id = 51484, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO est le plus unique?", listOf("Taj Mahal", "Galapagos", "Machu Picchu", "Stonehenge"), "Culture", "Les îles Galápagos sont un site UNESCO unique car leur isolement a permis l'évolution d'espèces endémiques, comme les tortues géantes et les iguanes marins, qui ont inspiré la théorie de l'évolution de Darwin."),
            en = LocalizedContent("Which UNESCO site is the most unique?", listOf("Taj Mahal", "Galapagos", "Machu Picchu", "Stonehenge"), "Culture", "The Galápagos Islands are a unique UNESCO site because their isolation allowed the evolution of endemic species, such as giant tortoises and marine iguanas, which inspired Darwin's theory of evolution."),
            zh = LocalizedContent("哪个联合国教科文组织遗址最独特？", listOf("泰姬陵", "加拉帕戈斯群岛", "马丘比丘", "巨石阵"), "文化", "加拉帕戈斯群岛是一个独特的联合国教科文组织遗址，因为其隔离性使得特有物种得以进化，如巨龟和海鬣蜥，这些启发了达尔文的进化论。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO es el más singular?", listOf("Taj Mahal", "Galápagos", "Machu Picchu", "Stonehenge"), "Cultura", "Las islas Galápagos son un sitio único de la UNESCO porque su aislamiento permitió la evolución de especies endémicas, como las tortugas gigantes y las iguanas marinas, que inspiraron la teoría de la evolución de Darwin.")
        ),
        BilingualQuestion(
            id = 51485, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel culture indigène a la plus grande population actuelle?", listOf("Mayas", "Aztèques", "Incas", "Amérindiens"), "Culture", "Les Amérindiens regroupent de nombreux peuples autochtones des Amériques, et leur population totale estimée à plus de 60 millions de personnes en fait la culture indigène la plus nombreuse aujourd'hui."),
            en = LocalizedContent("Which indigenous culture has the largest current population?", listOf("Mayas", "Aztecs", "Incas", "Native Americans"), "Culture", "Native Americans encompass many indigenous peoples of the Americas, and their total estimated population of over 60 million makes them the most numerous indigenous culture today."),
            zh = LocalizedContent("哪种土著文化目前人口最多？", listOf("玛雅人", "阿兹特克人", "印加人", "美洲原住民"), "文化", "美洲原住民包括美洲的许多土著民族，其总人口估计超过6000万，使他们成为当今人数最多的土著文化。"),
            es = LocalizedContent("¿Qué cultura indígena tiene la población actual más grande?", listOf("Mayas", "Aztecas", "Incas", "Nativos americanos"), "Cultura", "Los nativos americanos abarcan muchos pueblos indígenas de las Américas, y su población total estimada de más de 60 millones los convierte en la cultura indígena más numerosa en la actualidad.")
        ),
        BilingualQuestion(
            id = 51486, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival internet a le plus grand impact sociétal?", listOf("Twitch Plays", "Reddit Place", "April Fools", "Metaverse"), "Culture", "Le April Fools Day, ou Poisson d'Avril, est un événement mondial où les internautes et grandes entreprises créent des canulars, influençant massivement les tendances et discussions en ligne."),
            en = LocalizedContent("Which internet festival has the greatest societal impact?", listOf("Twitch Plays", "Reddit Place", "April Fools", "Metaverse"), "Culture", "April Fools' Day is a global event where internet users and large companies create hoaxes, massively influencing online trends and discussions."),
            zh = LocalizedContent("哪个互联网节日对社会影响最大？", listOf("Twitch Plays", "Reddit Place", "愚人节", "元宇宙"), "文化", "愚人节是一个全球性事件，互联网用户和大公司会制造恶作剧，极大地影响在线趋势和讨论。"),
            es = LocalizedContent("¿Qué festival de internet tiene el mayor impacto social?", listOf("Twitch Plays", "Reddit Place", "Día de los Inocentes", "Metaverso"), "Cultura", "El Día de los Inocentes es un evento global donde los usuarios de internet y las grandes empresas crean bromas, influyendo masivamente en las tendencias y discusiones en línea.")
        ),
        BilingualQuestion(
            id = 51487, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus politique?", listOf("Rickroll", "Doge", "Political Compass", "Wojak"), "Culture", "Wojak est devenu un mème politique car son visage générique et triste est utilisé pour représenter diverses positions idéologiques, souvent dans des dialogues satiriques en ligne."),
            en = LocalizedContent("Which internet meme is the most political?", listOf("Rickroll", "Doge", "Political Compass", "Wojak"), "Culture", "Wojak has become a political meme because its generic, sad face is used to represent various ideological positions, often in satirical online dialogues."),
            zh = LocalizedContent("哪个互联网迷因最具政治性？", listOf("Rickroll", "Doge", "政治罗盘", "Wojak"), "文化", "Wojak已成为一个政治迷因，因为它那张普通而悲伤的脸被用来代表各种意识形态立场，常用于讽刺性的在线对话中。"),
            es = LocalizedContent("¿Qué meme de internet es el más político?", listOf("Rickroll", "Doge", "Brújula política", "Wojak"), "Cultura", "Wojak se ha convertido en un meme político porque su rostro genérico y triste se utiliza para representar diversas posiciones ideológicas, a menudo en diálogos satíricos en línea.")
        ),
        BilingualQuestion(
            id = 51488, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus philosophique?", listOf("Rickroll", "Doge", "Existential Dread", "Deep Lore"), "Culture", "Le mème \"Existential Dread\" représente un chien husky dont les propos absurdes et angoissés reflètent des questionnements philosophiques sur le sens de la vie, devenant viral pour son humour noir et son introspection."),
            en = LocalizedContent("Which internet meme is the most philosophical?", listOf("Rickroll", "Doge", "Existential Dread", "Deep Lore"), "Culture", "The \"Existential Dread\" meme features a husky dog whose absurd and anxious remarks reflect philosophical questions about the meaning of life, going viral for its dark humor and introspection."),
            zh = LocalizedContent("哪个互联网迷因最具哲学性？", listOf("Rickroll", "Doge", "存在主义恐惧", "Deep Lore"), "文化", "“存在主义恐惧”迷因以一只哈士奇狗为特色，其荒谬而焦虑的言论反映了关于生命意义的哲学问题，因其黑色幽默和内省而走红。"),
            es = LocalizedContent("¿Qué meme de internet es el más filosófico?", listOf("Rickroll", "Doge", "Angustia existencial", "Deep Lore"), "Cultura", "El meme \"Angustia existencial\" presenta un perro husky cuyos comentarios absurdos y ansiosos reflejan cuestionamientos filosóficos sobre el sentido de la vida, volviéndose viral por su humor negro e introspección.")
        ),
        BilingualQuestion(
            id = 51489, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval a le plus de masques?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le Carnaval de Venise est célèbre dans le monde entier pour ses masques élaborés et son atmosphère historique, attirant des milliers de participants costumés."),
            en = LocalizedContent("Which carnival has the most masks?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Carnival of Venice is world-famous for its elaborate masks and historical atmosphere, attracting thousands of costumed participants."),
            zh = LocalizedContent("哪个狂欢节面具最多？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "威尼斯狂欢节以其精美的面具和历史氛围闻名于世，吸引了成千上万的盛装参与者。"),
            es = LocalizedContent("¿Qué carnaval tiene más máscaras?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El Carnaval de Venecia es famoso en todo el mundo por sus elaboradas máscaras y su ambiente histórico, atrayendo a miles de participantes disfrazados.")
        ),
        BilingualQuestion(
            id = 51490, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval dépense le plus d'argent?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le carnaval de Rio de Janeiro est le plus dépensier au monde, avec des investissements massifs des écoles de samba et de la ville pour les défilés, chars et costumes."),
            en = LocalizedContent("Which carnival spends the most money?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Rio de Janeiro carnival is the most expensive in the world, with massive investments by samba schools and the city in parades, floats, and costumes."),
            zh = LocalizedContent("哪个狂欢节花费最多？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "里约热内卢狂欢节是世界上最昂贵的狂欢节，桑巴舞学校和市政府在游行、花车和服装上投入巨资。"),
            es = LocalizedContent("¿Qué carnaval gasta más dinero?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El carnaval de Río de Janeiro es el más costoso del mundo, con inversiones masivas de las escuelas de samba y la ciudad en desfiles, carrozas y disfraces.")
        ),
        BilingualQuestion(
            id = 51491, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel danse traditionnelle représente l'amour?", listOf("Ballet", "Flamenco", "Tango", "Valse"), "Culture", "Le tango est né dans les quartiers populaires de Buenos Aires et Montevideo, où il exprimait la passion et la nostalgie des immigrants, devenant un symbole universel de l'amour et de la séduction à travers sa gestuelle intime et sensuelle."),
            en = LocalizedContent("Which traditional dance represents love?", listOf("Ballet", "Flamenco", "Tango", "Waltz"), "Culture", "Tango originated in the working-class neighborhoods of Buenos Aires and Montevideo, where it expressed the passion and nostalgia of immigrants, becoming a universal symbol of love and seduction through its intimate and sensual gestures."),
            zh = LocalizedContent("哪种传统舞蹈代表爱情？", listOf("芭蕾", "弗拉门戈", "探戈", "华尔兹"), "文化", "探戈起源于布宜诺斯艾利斯和蒙得维的亚的工人阶级社区，表达了移民的激情和怀旧，通过其亲密而感性的动作成为爱情和诱惑的普遍象征。"),
            es = LocalizedContent("¿Qué baile tradicional representa el amor?", listOf("Ballet", "Flamenco", "Tango", "Vals"), "Cultura", "El tango nació en los barrios populares de Buenos Aires y Montevideo, donde expresaba la pasión y la nostalgia de los inmigrantes, convirtiéndose en un símbolo universal del amor y la seducción a través de su gestualidad íntima y sensual.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51492, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel danse traditionnelle représente la colère?", listOf("Flamenco", "Ballet", "Tango", "Opéra"), "Culture", "Le flamenco, originaire d'Andalousie, exprime des émotions intenses comme la colère à travers ses mouvements brusques et son jeu de pieds percutant."),
            en = LocalizedContent("Which traditional dance represents anger?", listOf("Flamenco", "Ballet", "Tango", "Opera"), "Culture", "Flamenco, originating from Andalusia, expresses intense emotions like anger through its sharp movements and percussive footwork."),
            zh = LocalizedContent("哪种传统舞蹈代表愤怒？", listOf("弗拉门戈", "芭蕾", "探戈", "歌剧"), "文化", "弗拉门戈起源于安达卢西亚，通过其激烈的动作和有力的脚步表达愤怒等强烈情感。"),
            es = LocalizedContent("¿Qué danza tradicional representa la ira?", listOf("Flamenco", "Ballet", "Tango", "Ópera"), "Cultura", "El flamenco, originario de Andalucía, expresa emociones intensas como la ira a través de sus movimientos bruscos y su zapateado percusivo.")
        ),
        BilingualQuestion(
            id = 51493, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion est la plus universelle?", listOf("Bouddhisme", "Christianisme", "Islam", "Hindouisme"), "Culture", "Le christianisme est considéré comme la religion la plus universelle car elle est pratiquée sur tous les continents et compte environ 2,4 milliards de fidèles dans le monde."),
            en = LocalizedContent("Which religion is the most universal?", listOf("Buddhism", "Christianity", "Islam", "Hinduism"), "Culture", "Christianity is considered the most universal religion as it is practiced on all continents and has about 2.4 billion followers worldwide."),
            zh = LocalizedContent("哪种宗教最具有普遍性？", listOf("佛教", "基督教", "伊斯兰教", "印度教"), "文化", "基督教被认为是最具普遍性的宗教，因为它遍布各大洲，全球约有24亿信徒。"),
            es = LocalizedContent("¿Qué religión es la más universal?", listOf("Budismo", "Cristianismo", "Islam", "Hinduismo"), "Cultura", "El cristianismo es considerado la religión más universal, ya que se practica en todos los continentes y cuenta con aproximadamente 2.400 millones de fieles en todo el mundo.")
        ),
        BilingualQuestion(
            id = 51494, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel religion est la plus fermée?", listOf("Jaïnisme", "Zoroastrisme", "Shintoïsme", "Judaïsme"), "Culture", "Le judaïsme est souvent considéré comme la religion la plus fermée car il ne cherche pas activement à convertir les non-juifs et l'appartenance se transmet principalement par la naissance ou une conversion stricte."),
            en = LocalizedContent("Which religion is the most closed?", listOf("Jainism", "Zoroastrianism", "Shinto", "Judaism"), "Culture", "Judaism is often considered the most closed religion because it does not actively seek to convert non-Jews, and membership is primarily passed through birth or strict conversion."),
            zh = LocalizedContent("哪种宗教最封闭？", listOf("耆那教", "琐罗亚斯德教", "神道教", "犹太教"), "文化", "犹太教常被认为是最封闭的宗教，因为它不积极寻求改变非犹太人，成员身份主要通过出生或严格的皈依传承。"),
            es = LocalizedContent("¿Qué religión es la más cerrada?", listOf("Jainismo", "Zoroastrismo", "Sintoísmo", "Judaísmo"), "Cultura", "El judaísmo suele considerarse la religión más cerrada porque no busca activamente convertir a los no judíos, y la pertenencia se transmite principalmente por nacimiento o mediante una conversión estricta.")
        ),
        BilingualQuestion(
            id = 51495, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO a le meilleur accès?", listOf("Taj Mahal", "Big Ben", "Statue de la Liberté", "Colosseum"), "Culture", "Le Colisée de Rome bénéficie d'un accès privilégié grâce à sa situation en centre-ville et à un système de réservation en ligne très efficace."),
            en = LocalizedContent("Which UNESCO site has the best access?", listOf("Taj Mahal", "Big Ben", "Statue of Liberty", "Colosseum"), "Culture", "The Colosseum in Rome benefits from privileged access due to its central location and a very efficient online reservation system."),
            zh = LocalizedContent("哪个联合国教科文组织遗址交通最便利？", listOf("泰姬陵", "大本钟", "自由女神像", "罗马斗兽场"), "文化", "罗马斗兽场因其市中心位置和高效的在线预订系统而享有便利的交通。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO tiene el mejor acceso?", listOf("Taj Mahal", "Big Ben", "Estatua de la Libertad", "Coliseo"), "Cultura", "El Coliseo de Roma goza de un acceso privilegiado gracias a su ubicación céntrica y a un sistema de reservas en línea muy eficiente.")
        ),
        BilingualQuestion(
            id = 51496, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel site UNESCO est le plus difficile d'accès?", listOf("Machu Picchu", "Bamiyan", "Knossos", "Angkor Wat"), "Culture", "Perché à 2 430 mètres d'altitude dans les Andes péruviennes, le Machu Picchu n'est accessible qu'après une randonnée de plusieurs jours ou un trajet en train puis en bus. Son isolement géographique en fait le site UNESCO le plus difficile d'accès."),
            en = LocalizedContent("Which UNESCO site is the most difficult to access?", listOf("Machu Picchu", "Bamiyan", "Knossos", "Angkor Wat"), "Culture", "Perched at 2,430 meters altitude in the Peruvian Andes, Machu Picchu is only accessible after a multi-day hike or a train and bus journey. Its geographic isolation makes it the most difficult UNESCO site to access."),
            zh = LocalizedContent("哪个联合国教科文组织遗址最难到达？", listOf("马丘比丘", "巴米扬", "克诺索斯", "吴哥窟"), "文化", "马丘比丘坐落在秘鲁安第斯山脉海拔2430米处，只能通过多日徒步或火车加巴士到达。其地理隔离使其成为最难到达的联合国教科文组织遗址。"),
            es = LocalizedContent("¿Qué sitio de la UNESCO es el más difícil de acceder?", listOf("Machu Picchu", "Bamiyán", "Cnosos", "Angkor Wat"), "Cultura", "Situado a 2.430 metros de altitud en los Andes peruanos, Machu Picchu solo es accesible tras una caminata de varios días o un viaje en tren y autobús. Su aislamiento geográfico lo convierte en el sitio de la UNESCO más difícil de acceder.")
        ),
        BilingualQuestion(
            id = 51497, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel culture indigène a la plus longue tradition?", listOf("Mayas", "Égyptiens", "Australiens Aborigènes", "Chinois"), "Culture", "Les Australiens Aborigènes possèdent la plus longue tradition culturelle continue au monde, avec des preuves archéologiques remontant à plus de 65 000 ans."),
            en = LocalizedContent("Which indigenous culture has the longest tradition?", listOf("Mayans", "Egyptians", "Australian Aborigines", "Chinese"), "Culture", "Australian Aborigines possess the longest continuous cultural tradition in the world, with archaeological evidence dating back over 65,000 years."),
            zh = LocalizedContent("哪种土著文化传统最悠久？", listOf("玛雅人", "埃及人", "澳大利亚原住民", "中国人"), "文化", "澳大利亚原住民拥有世界上最长的连续文化传统，考古证据可追溯到65000多年前。"),
            es = LocalizedContent("¿Qué cultura indígena tiene la tradición más larga?", listOf("Mayas", "Egipcios", "Aborígenes australianos", "Chinos"), "Cultura", "Los aborígenes australianos poseen la tradición cultural continua más larga del mundo, con evidencia arqueológica que se remonta a más de 65.000 años.")
        ),
        BilingualQuestion(
            id = 51498, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival internet a le plus de documentation?", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Decentraland"), "Culture", "Les raids de 4chan, notamment les opérations coordonnées sur d'autres sites, ont généré une vaste documentation en raison de leur impact médiatique et de leur analyse académique."),
            en = LocalizedContent("Which internet festival has the most documentation?", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Decentraland"), "Culture", "4chan raids, especially coordinated operations on other sites, have generated extensive documentation due to their media impact and academic analysis."),
            zh = LocalizedContent("哪个互联网节日记录最多？", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Decentraland"), "文化", "4chan的突袭活动，尤其是在其他网站上的协调行动，因其媒体影响和学术分析而产生了大量记录。"),
            es = LocalizedContent("¿Qué festival de internet tiene más documentación?", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Decentraland"), "Cultura", "Las incursiones de 4chan, especialmente las operaciones coordinadas en otros sitios, han generado una amplia documentación debido a su impacto mediático y análisis académico.")
        ),
        BilingualQuestion(
            id = 51499, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus sympathique?", listOf("Rickroll", "Doge", "Wholesome", "Good Boy"), "Culture", "Wholesome désigne en anglais ce qui est sain, réconfortant et positif. Sur internet, ce terme qualifie les mèmes et contenus bienveillants qui diffusent de la bonne humeur."),
            en = LocalizedContent("What is the friendliest internet meme?", listOf("Rickroll", "Doge", "Wholesome", "Good Boy"), "Culture", "Wholesome in English means healthy, comforting, and positive. On the internet, this term describes memes and content that are kind and spread good vibes."),
            zh = LocalizedContent("哪个互联网迷因最友好？", listOf("Rickroll", "Doge", "Wholesome", "Good Boy"), "文化", "Wholesome在英语中意为健康、舒适和积极。在互联网上，这个词用来描述那些善良、传播正能量的迷因和内容。"),
            es = LocalizedContent("¿Cuál es el meme de internet más amigable?", listOf("Rickroll", "Doge", "Wholesome", "Good Boy"), "Cultura", "Wholesome en inglés significa saludable, reconfortante y positivo. En internet, este término califica los memes y contenidos bondadosos que difunden buen humor.")
        ),
        BilingualQuestion(
            id = 51500, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème internet le plus triste?", listOf("Rickroll", "Doge", "Loss", "F in Chat"), "Culture", "F in Chat vient du jeu Call of Duty: Advanced Warfare, où un personnage demande de rendre hommage lors d’un enterrement, et le joueur doit appuyer sur la touche F. Cela est devenu un mème pour exprimer du respect ou de la tristesse."),
            en = LocalizedContent("What is the saddest internet meme?", listOf("Rickroll", "Doge", "Loss", "F in Chat"), "Culture", "F in Chat comes from the game Call of Duty: Advanced Warfare, where a character asks to pay respects at a funeral, and the player must press the F key. This became a meme to express respect or sadness."),
            zh = LocalizedContent("哪个互联网迷因最悲伤？", listOf("Rickroll", "Doge", "Loss", "F in Chat"), "文化", "F in Chat源自游戏《使命召唤：高级战争》，其中一名角色要求在葬礼上致敬，玩家必须按F键。这成为一个表达尊重或悲伤的迷因。"),
            es = LocalizedContent("¿Cuál es el meme de internet más triste?", listOf("Rickroll", "Doge", "Loss", "F in Chat"), "Cultura", "F in Chat proviene del juego Call of Duty: Advanced Warfare, donde un personaje pide rendir homenaje en un funeral, y el jugador debe presionar la tecla F. Esto se convirtió en un meme para expresar respeto o tristeza.")
        ),
        BilingualQuestion(
            id = 51501, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Megan Rapinoe a-t-elle remporté son premier Ballon d'Or féminin?", listOf("2019", "2020", "2021", "2022"), "Sport", "Megan Rapinoe a remporté son premier Ballon d'Or féminin en 2019, une année marquée par sa performance décisive lors de la Coupe du monde féminine de football."),
            en = LocalizedContent("In which year did Megan Rapinoe win her first Women's Ballon d'Or?", listOf("2019", "2020", "2021", "2022"), "Sports", "Megan Rapinoe won her first Women's Ballon d'Or in 2019, a year marked by her decisive performance at the Women's World Cup."),
            zh = LocalizedContent("梅根·拉皮诺在哪一年赢得了她的第一个女足金球奖？", listOf("2019", "2020", "2021", "2022"), "体育", "梅根·拉皮诺在2019年赢得了她的第一个女足金球奖，这一年她在女足世界杯上的决定性表现令人瞩目。"),
            es = LocalizedContent("¿En qué año ganó Megan Rapinoe su primer Balón de Oro femenino?", listOf("2019", "2020", "2021", "2022"), "Deportes", "Megan Rapinoe ganó su primer Balón de Oro femenino en 2019, un año marcado por su actuación decisiva en la Copa Mundial Femenina de Fútbol.")
        ),
        BilingualQuestion(
            id = 51502, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de médailles d'or en escrime olympique?", listOf("5", "6", "7", "8"), "Sport", "Le record de médailles d'or en escrime olympique est détenu par le Hongrois Aladár Gerevich, avec 7 titres obtenus entre 1932 et 1960."),
            en = LocalizedContent("What is the highest number of gold medals in Olympic fencing?", listOf("5", "6", "7", "8"), "Sports", "The record for most gold medals in Olympic fencing is held by Hungarian Aladár Gerevich, with 7 titles won between 1932 and 1960."),
            zh = LocalizedContent("奥运击剑项目中获得金牌最多的是多少枚？", listOf("5", "6", "7", "8"), "体育", "奥运击剑金牌纪录由匈牙利选手阿拉达尔·格雷维奇保持，他在1932年至1960年间共获得7枚金牌。"),
            es = LocalizedContent("¿Cuál es el mayor número de medallas de oro en esgrima olímpica?", listOf("5", "6", "7", "8"), "Deportes", "El récord de medallas de oro en esgrima olímpica lo ostenta el húngaro Aladár Gerevich, con 7 títulos obtenidos entre 1932 y 1960.")
        ),
        BilingualQuestion(
            id = 51503, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Anastasia Pavlenko a-t-elle remporté le plus de Grammys en tant que sportive?", listOf("2018", "2019", "2020", "2021"), "Sport", "Anastasia Pavlenko est une joueuse de tennis ukrainienne, et non une musicienne. L'information sur les Grammys est erronée, car ce prix récompense l'industrie musicale, non le sport."),
            en = LocalizedContent("In which year did Anastasia Pavlenko win the most Grammys as an athlete?", listOf("2018", "2019", "2020", "2021"), "Sports", "Anastasia Pavlenko is a Ukrainian tennis player, not a musician. The information about Grammys is incorrect, as this award honors the music industry, not sports."),
            zh = LocalizedContent("安娜斯塔西娅·帕夫连科在哪一年作为运动员赢得了最多的格莱美奖？", listOf("2018", "2019", "2020", "2021"), "体育", "安娜斯塔西娅·帕夫连科是一名乌克兰网球运动员，而非音乐人。关于格莱美奖的信息有误，因为该奖项表彰音乐产业，而非体育。"),
            es = LocalizedContent("¿En qué año Anastasia Pavlenko ganó más Grammys como deportista?", listOf("2018", "2019", "2020", "2021"), "Deportes", "Anastasia Pavlenko es una tenista ucraniana, no una música. La información sobre los Grammys es incorrecta, ya que este premio reconoce a la industria musical, no al deporte.")
        ),
        BilingualQuestion(
            id = 51504, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde d'apnée?", listOf("9:00", "10:00", "11:00", "12:00"), "Sport", "Le record du monde d'apnée statique (immobile) est détenu par Stéphane Mifsud avec 11 minutes et 35 secondes, établi en 2009. La performance de 11 minutes correspond à un temps proche de ce record officiel."),
            en = LocalizedContent("What is the world record for freediving?", listOf("9:00", "10:00", "11:00", "12:00"), "Sports", "The world record for static apnea (motionless) is held by Stéphane Mifsud with 11 minutes and 35 seconds, set in 2009. The performance of 11 minutes is close to this official record."),
            zh = LocalizedContent("自由潜水世界纪录是多少？", listOf("9:00", "10:00", "11:00", "12:00"), "体育", "静态闭气（静止不动）世界纪录由斯特凡·米夫苏德保持，时间为11分35秒，于2009年创造。11分钟的成绩接近这一官方纪录。"),
            es = LocalizedContent("¿Cuál es el récord mundial de apnea?", listOf("9:00", "10:00", "11:00", "12:00"), "Deportes", "El récord mundial de apnea estática (inmóvil) lo ostenta Stéphane Mifsud con 11 minutos y 35 segundos, establecido en 2009. La marca de 11 minutos se acerca a este récord oficial.")
        ),
        BilingualQuestion(
            id = 51505, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Katie Ledecky a-t-elle remporté ses premiers Olympiques?", listOf("2012", "2016", "2020", "2024"), "Sport", "Katie Ledecky a participé à ses premiers Jeux olympiques en 2012 à Londres, où elle a remporté l'or sur 800 mètres nage libre à seulement 15 ans."),
            en = LocalizedContent("In which year did Katie Ledecky win her first Olympics?", listOf("2012", "2016", "2020", "2024"), "Sports", "Katie Ledecky participated in her first Olympic Games in 2012 in London, where she won gold in the 800-meter freestyle at just 15 years old."),
            zh = LocalizedContent("凯蒂·莱德基在哪一年赢得了她的第一届奥运会？", listOf("2012", "2016", "2020", "2024"), "体育", "凯蒂·莱德基在2012年伦敦奥运会上首次参赛，当时年仅15岁的她赢得了800米自由泳金牌。"),
            es = LocalizedContent("¿En qué año Katie Ledecky ganó sus primeros Juegos Olímpicos?", listOf("2012", "2016", "2020", "2024"), "Deportes", "Katie Ledecky participó en sus primeros Juegos Olímpicos en 2012 en Londres, donde ganó el oro en los 800 metros libres con solo 15 años.")
        ),
        BilingualQuestion(
            id = 51506, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de motocross?", listOf("70 points", "80 points", "90 points", "100 points"), "Sport", "Le record du monde de motocross en termes de points marqués en une saison est détenu par Stefan Everts, qui a accumulé 80 points lors de la saison 2006 du championnat du monde MX1."),
            en = LocalizedContent("What is the world record in motocross?", listOf("70 points", "80 points", "90 points", "100 points"), "Sports", "The world record for most points scored in a motocross season is held by Stefan Everts, who accumulated 80 points during the 2006 MX1 World Championship season."),
            zh = LocalizedContent("摩托车越野赛的世界纪录是多少？", listOf("70分", "80分", "90分", "100分"), "体育", "摩托车越野赛单赛季最高积分纪录由斯特凡·埃弗茨保持，他在2006年MX1世界锦标赛赛季中累计获得80分。"),
            es = LocalizedContent("¿Cuál es el récord mundial de motocross?", listOf("70 puntos", "80 puntos", "90 puntos", "100 puntos"), "Deportes", "El récord mundial de puntos en una temporada de motocross lo ostenta Stefan Everts, quien acumuló 80 puntos durante la temporada 2006 del Campeonato Mundial MX1.")
        ),
        BilingualQuestion(
            id = 51507, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Serena Williams a-t-elle annoncé sa retraite?", listOf("2021", "2022", "2023", "2024"), "Sport", "Serena Williams a annoncé sa retraite du tennis professionnel en 2023, après une carrière légendaire de 23 titres du Grand Chelem en simple."),
            en = LocalizedContent("In which year did Serena Williams announce her retirement?", listOf("2021", "2022", "2023", "2024"), "Sports", "Serena Williams announced her retirement from professional tennis in 2023, after a legendary career with 23 Grand Slam singles titles."),
            zh = LocalizedContent("塞雷娜·威廉姆斯在哪一年宣布退役？", listOf("2021", "2022", "2023", "2024"), "体育", "塞雷娜·威廉姆斯于2023年宣布从职业网坛退役，她拥有23个大满贯单打冠军的传奇职业生涯。"),
            es = LocalizedContent("¿En qué año Serena Williams anunció su retiro?", listOf("2021", "2022", "2023", "2024"), "Deportes", "Serena Williams anunció su retiro del tenis profesional en 2023, tras una carrera legendaria con 23 títulos de Grand Slam en individuales.")
        ),
        BilingualQuestion(
            id = 51508, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires au tennis féminin?", listOf("64", "72", "86", "100"), "Sport", "Martina Navratilova détient le record du nombre de victoires en simple sur le circuit WTA avec 86 titres, un total inégalé dans le tennis féminin."),
            en = LocalizedContent("What is the record for the most wins in women's tennis?", listOf("64", "72", "86", "100"), "Sports", "Martina Navratilova holds the record for the most singles titles on the WTA tour with 86 titles, an unmatched total in women's tennis."),
            zh = LocalizedContent("女子网球最多胜场纪录是多少？", listOf("64", "72", "86", "100"), "体育", "玛蒂娜·纳芙拉蒂洛娃保持着WTA巡回赛单打冠军最多的纪录，共86个冠军，这一总数在女子网坛无人能及。"),
            es = LocalizedContent("¿Cuál es el récord de más victorias en el tenis femenino?", listOf("64", "72", "86", "100"), "Deportes", "Martina Navratilova ostenta el récord de más títulos individuales en el circuito WTA con 86 títulos, un total inigualable en el tenis femenino.")
        ),
        BilingualQuestion(
            id = 51509, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Roger Federer a-t-il remporté Wimbledon 8 fois?", listOf("2010", "2012", "2017", "2019"), "Sport", "Roger Federer a remporté son huitième titre à Wimbledon en 2017, battant Marin Čilić en finale. Ce record faisait de lui le joueur le plus titré de l'histoire du tournoi."),
            en = LocalizedContent("In which year did Roger Federer win Wimbledon 8 times?", listOf("2010", "2012", "2017", "2019"), "Sports", "Roger Federer won his eighth Wimbledon title in 2017, defeating Marin Čilić in the final. This record made him the most successful player in the tournament's history."),
            zh = LocalizedContent("罗杰·费德勒在哪一年第八次赢得温布尔登冠军？", listOf("2010", "2012", "2017", "2019"), "体育", "罗杰·费德勒在2017年第八次赢得温布尔登冠军，决赛中击败了马林·西里奇。这一纪录使他成为该赛事历史上最成功的选手。"),
            es = LocalizedContent("¿En qué año Roger Federer ganó Wimbledon 8 veces?", listOf("2010", "2012", "2017", "2019"), "Deportes", "Roger Federer ganó su octavo título de Wimbledon en 2017, venciendo a Marin Čilić en la final. Este récord lo convirtió en el jugador más exitoso en la historia del torneo.")
        ),
        BilingualQuestion(
            id = 51510, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de saut à ski?", listOf("253m", "263m", "273m", "283m"), "Sport", "Le record du monde de saut à ski est détenu par Stefan Kraft avec un saut de 253,5 mètres, mais le record officiel le plus long est de 273 mètres, réalisé par Daniel-André Tande en 2015."),
            en = LocalizedContent("What is the world record in ski jumping?", listOf("253m", "263m", "273m", "283m"), "Sports", "The world record in ski jumping is held by Stefan Kraft with a jump of 253.5 meters, but the longest official record is 273 meters, achieved by Daniel-André Tande in 2015."),
            zh = LocalizedContent("跳台滑雪的世界纪录是多少？", listOf("253米", "263米", "273米", "283米"), "体育", "跳台滑雪世界纪录由斯特凡·克拉夫特保持，成绩为253.5米，但官方最长纪录是273米，由丹尼尔-安德烈·坦德在2015年创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto de esquí?", listOf("253m", "263m", "273m", "283m"), "Deportes", "El récord mundial de salto de esquí lo ostenta Stefan Kraft con un salto de 253.5 metros, pero el récord oficial más largo es de 273 metros, logrado por Daniel-André Tande en 2015.")
        ),
        BilingualQuestion(
            id = 51511, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a remporté l'Oscar du meilleur réalisateur pour 'Everything Everywhere All at Once'?", listOf("Paul Thomas Anderson", "Daniel Kwan et Daniel Scheinert", "Bong Joon-ho", "Quentin Tarantino"), "Cinéma", "Le duo connu sous le nom de Daniels a remporté l'Oscar du meilleur réalisateur en 2023 pour ce film, marquant la première fois qu'un duo remporte ce prix."),
            en = LocalizedContent("Which director won the Oscar for Best Director for 'Everything Everywhere All at Once'?", listOf("Paul Thomas Anderson", "Daniel Kwan and Daniel Scheinert", "Bong Joon-ho", "Quentin Tarantino"), "Cinema", "The duo known as Daniels won the Oscar for Best Director in 2023 for this film, marking the first time a duo won this award."),
            zh = LocalizedContent("哪位导演凭借《瞬息全宇宙》获得了奥斯卡最佳导演奖？", listOf("保罗·托马斯·安德森", "关家永和丹尼尔·施纳特", "奉俊昊", "昆汀·塔伦蒂诺"), "电影", "被称为“丹尼尔斯”的二人组在2023年凭借该片获得奥斯卡最佳导演奖，这是首次有二人组获得该奖项。"),
            es = LocalizedContent("¿Qué director ganó el Oscar al Mejor Director por 'Everything Everywhere All at Once'?", listOf("Paul Thomas Anderson", "Daniel Kwan y Daniel Scheinert", "Bong Joon-ho", "Quentin Tarantino"), "Cine", "El dúo conocido como Daniels ganó el Oscar al Mejor Director en 2023 por esta película, marcando la primera vez que un dúo gana este premio.")
        ),
        BilingualQuestion(
            id = 51512, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté le Golden Lion à Venise en 2023?", listOf("Past Lives", "The Iron Claw", "The Iron Claw", "The History of Light"), "Cinéma", "Past Lives, réalisé par Celine Song, a reçu le Lion d'or à la 80e Mostra de Venise en 2023, distinguant ce drame romantique sur les choix de vie et les amours perdus."),
            en = LocalizedContent("Which film won the Golden Lion at Venice in 2023?", listOf("Past Lives", "The Iron Claw", "The Iron Claw", "The History of Light"), "Cinema", "Past Lives, directed by Celine Song, received the Golden Lion at the 80th Venice Film Festival in 2023, distinguishing this romantic drama about life choices and lost loves."),
            zh = LocalizedContent("哪部电影在2023年威尼斯电影节获得了金狮奖？", listOf("过往人生", "铁爪", "铁爪", "光之历史"), "电影", "《过往人生》由席琳·宋执导，在2023年第80届威尼斯电影节获得金狮奖，这部浪漫剧情片探讨了人生选择和逝去的爱情。"),
            es = LocalizedContent("¿Qué película ganó el León de Oro en Venecia en 2023?", listOf("Past Lives", "The Iron Claw", "The Iron Claw", "The History of Light"), "Cine", "Past Lives, dirigida por Celine Song, recibió el León de Oro en la 80ª Mostra de Venecia en 2023, distinguiendo este drama romántico sobre las elecciones de vida y los amores perdidos.")
        ),
        BilingualQuestion(
            id = 51513, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a créé la musique de 'The Creator'?", listOf("Hans Zimmer", "Volker Bertelmann", "Volker Bertelmann", "Ludwig Göransson"), "Cinéma", "Volker Bertelmann, également connu sous le nom de Hauschka, a composé la bande originale de ce film de science-fiction de 2023 réalisé par Gareth Edwards."),
            en = LocalizedContent("Which composer created the music for 'The Creator'?", listOf("Hans Zimmer", "Volker Bertelmann", "Volker Bertelmann", "Ludwig Göransson"), "Cinema", "Volker Bertelmann, also known as Hauschka, composed the soundtrack for this 2023 science fiction film directed by Gareth Edwards."),
            zh = LocalizedContent("哪位作曲家为《AI创世者》创作了音乐？", listOf("汉斯·季默", "福尔克·贝特尔曼", "福尔克·贝特尔曼", "路德维希·格兰森"), "电影", "福尔克·贝特尔曼，又名豪施卡，为这部2023年由加雷斯·爱德华兹执导的科幻电影创作了配乐。"),
            es = LocalizedContent("¿Qué compositor creó la música de 'The Creator'?", listOf("Hans Zimmer", "Volker Bertelmann", "Volker Bertelmann", "Ludwig Göransson"), "Cine", "Volker Bertelmann, también conocido como Hauschka, compuso la banda sonora de esta película de ciencia ficción de 2023 dirigida por Gareth Edwards.")
        ),
        BilingualQuestion(
            id = 51514, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film le plus cher jamais produit?", listOf("Avatar 2", "Avengers: Endgame", "Pirates des Caraïbes: On Stranger Tides", "Tous les trois"), "Cinéma", "Avec un budget estimé à 378,5 millions de dollars, ce quatrième volet de la franchise a détrôné le précédent record détenu par un autre film de la série."),
            en = LocalizedContent("What is the most expensive film ever produced?", listOf("Avatar 2", "Avengers: Endgame", "Pirates of the Caribbean: On Stranger Tides", "All three"), "Cinema", "With an estimated budget of $378.5 million, this fourth installment of the franchise dethroned the previous record held by another film in the series."),
            zh = LocalizedContent("有史以来制作成本最高的电影是哪一部？", listOf("阿凡达2", "复仇者联盟4：终局之战", "加勒比海盗4：惊涛怪浪", "以上都是"), "电影", "这部系列第四部预算估计为3.785亿美元，打破了该系列另一部电影此前保持的纪录。"),
            es = LocalizedContent("¿Cuál es la película más cara jamás producida?", listOf("Avatar 2", "Avengers: Endgame", "Pirates of the Caribbean: On Stranger Tides", "Todas las anteriores"), "Cine", "Con un presupuesto estimado de 378,5 millones de dólares, esta cuarta entrega de la franquicia destronó el récord anterior que ostentaba otra película de la serie.")
        ),
        BilingualQuestion(
            id = 51515, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a réalisé 'Killers of the Flower Moon'?", listOf("Martin Scorsese", "David Fincher", "Christopher Nolan", "Quentin Tarantino"), "Cinéma", "Scorsese a adapté le livre-enquête de David Grann sur les meurtres des Osages dans les années 1920, avec une distribution comprenant Leonardo DiCaprio et Robert De Niro."),
            en = LocalizedContent("Which director directed 'Killers of the Flower Moon'?", listOf("Martin Scorsese", "David Fincher", "Christopher Nolan", "Quentin Tarantino"), "Cinema", "Scorsese adapted David Grann's investigative book about the murders of the Osage in the 1920s, with a cast including Leonardo DiCaprio and Robert De Niro."),
            zh = LocalizedContent("哪位导演执导了《花月杀手》？", listOf("马丁·斯科塞斯", "大卫·芬奇", "克里斯托弗·诺兰", "昆汀·塔伦蒂诺"), "电影", "斯科塞斯改编了大卫·格兰关于1920年代奥塞奇族谋杀案的调查书籍，演员阵容包括莱昂纳多·迪卡普里奥和罗伯特·德尼罗。"),
            es = LocalizedContent("¿Qué director dirigió 'Killers of the Flower Moon'?", listOf("Martin Scorsese", "David Fincher", "Christopher Nolan", "Quentin Tarantino"), "Cine", "Scorsese adaptó el libro de investigación de David Grann sobre los asesinatos de los Osage en la década de 1920, con un reparto que incluye a Leonardo DiCaprio y Robert De Niro.")
        ),
        BilingualQuestion(
            id = 51516, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a créé la musique d'Oppenheimer?", listOf("Ludwig Göransson", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinéma", "Ludwig Göransson a composé la bande originale d'Oppenheimer, réalisé par Christopher Nolan, avec qui il collabore régulièrement depuis Tenet."),
            en = LocalizedContent("Which composer created the music for Oppenheimer?", listOf("Ludwig Göransson", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cinema", "Ludwig Göransson composed the soundtrack for Oppenheimer, directed by Christopher Nolan, with whom he has regularly collaborated since Tenet."),
            zh = LocalizedContent("哪位作曲家为《奥本海默》创作了音乐？", listOf("路德维希·格兰森", "汉斯·季默", "约翰·威廉姆斯", "埃尼奥·莫里康内"), "电影", "路德维希·格兰森为克里斯托弗·诺兰执导的《奥本海默》创作了配乐，自《信条》以来他与诺兰经常合作。"),
            es = LocalizedContent("¿Qué compositor creó la música de Oppenheimer?", listOf("Ludwig Göransson", "Hans Zimmer", "John Williams", "Ennio Morricone"), "Cine", "Ludwig Göransson compuso la banda sonora de Oppenheimer, dirigida por Christopher Nolan, con quien colabora regularmente desde Tenet.")
        ),
        BilingualQuestion(
            id = 51517, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Taylor Swift a remporté le plus de Grammys?", listOf("Folklore", "Evermore", "Fearless (Taylor's Version)", "Midnights"), "Musique", "Midnights a remporté quatre Grammy Awards, dont celui de l'Album de l'année en 2024, ce qui en fait l'album le plus récompensé de Taylor Swift aux Grammys."),
            en = LocalizedContent("Which Taylor Swift album has won the most Grammys?", listOf("Folklore", "Evermore", "Fearless (Taylor's Version)", "Midnights"), "Music", "Midnights won four Grammy Awards, including Album of the Year in 2024, making it Taylor Swift's most awarded album at the Grammys."),
            zh = LocalizedContent("泰勒·斯威夫特的哪张专辑获得了最多格莱美奖？", listOf("民间传说", "永恒", "无畏（泰勒版）", "午夜"), "音乐", "《午夜》赢得了四项格莱美奖，包括2024年的年度专辑，使其成为泰勒·斯威夫特在格莱美获奖最多的专辑。"),
            es = LocalizedContent("¿Qué álbum de Taylor Swift ha ganado más Grammys?", listOf("Folklore", "Evermore", "Fearless (Taylor's Version)", "Midnights"), "Música", "Midnights ganó cuatro premios Grammy, incluido el de Álbum del Año en 2024, lo que lo convierte en el álbum más premiado de Taylor Swift en los Grammys.")
        ),
        BilingualQuestion(
            id = 51518, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le single le plus écouté au monde?", listOf("Blinding Lights", "Shape of You", "Someone Like You", "Uptown Funk"), "Musique", "Blinding Lights de The Weeknd est le single le plus écouté sur Spotify, cumulant plus de 4 milliards de streams depuis sa sortie en 2019."),
            en = LocalizedContent("What is the most streamed single in the world?", listOf("Blinding Lights", "Shape of You", "Someone Like You", "Uptown Funk"), "Music", "Blinding Lights by The Weeknd is the most streamed single on Spotify, accumulating over 4 billion streams since its release in 2019."),
            zh = LocalizedContent("全球播放量最高的单曲是哪首？", listOf("Blinding Lights", "Shape of You", "Someone Like You", "Uptown Funk"), "音乐", "威肯的《Blinding Lights》是Spotify上播放量最高的单曲，自2019年发行以来累计超过40亿次播放。"),
            es = LocalizedContent("¿Cuál es el single más escuchado del mundo?", listOf("Blinding Lights", "Shape of You", "Someone Like You", "Uptown Funk"), "Música", "Blinding Lights de The Weeknd es el single más escuchado en Spotify, acumulando más de 4 mil millones de reproducciones desde su lanzamiento en 2019.")
        ),
        BilingualQuestion(
            id = 51519, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste a le plus d'écoutes sur Spotify?", listOf("The Weeknd", "Ed Sheeran", "Dua Lipa", "Billie Eilish"), "Musique", "The Weeknd est l'artiste le plus écouté sur Spotify grâce au succès massif de ses titres comme Blinding Lights et Save Your Tears, cumulant plus de 100 millions d'auditeurs mensuels."),
            en = LocalizedContent("Which artist has the most streams on Spotify?", listOf("The Weeknd", "Ed Sheeran", "Dua Lipa", "Billie Eilish"), "Music", "The Weeknd is the most streamed artist on Spotify thanks to the massive success of his tracks like Blinding Lights and Save Your Tears, accumulating over 100 million monthly listeners."),
            zh = LocalizedContent("哪位艺术家在Spotify上播放量最高？", listOf("威肯", "艾德·希兰", "杜阿·利帕", "比莉·艾利什"), "音乐", "威肯是Spotify上播放量最高的艺术家，得益于《Blinding Lights》和《Save Your Tears》等歌曲的巨大成功，每月听众超过1亿。"),
            es = LocalizedContent("¿Qué artista tiene más reproducciones en Spotify?", listOf("The Weeknd", "Ed Sheeran", "Dua Lipa", "Billie Eilish"), "Música", "The Weeknd es el artista más escuchado en Spotify gracias al éxito masivo de sus temas como Blinding Lights y Save Your Tears, acumulando más de 100 millones de oyentes mensuales.")
        ),
        BilingualQuestion(
            id = 51520, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le prix Grammy remporté le plus de fois?", listOf("Meilleur Album", "Meilleur Disque", "Meilleure Chanson", "Artiste Révélation"), "Musique", "Le Grammy du Meilleur Album est la catégorie la plus prestigieuse des Grammy Awards, récompensant l'ensemble d'un album. Des artistes comme Stevie Wonder, Paul Simon ou Taylor Swift l'ont remporté plusieurs fois."),
            en = LocalizedContent("Which Grammy award has been won the most times?", listOf("Best Album", "Best Record", "Best Song", "Best New Artist"), "Music", "The Grammy for Best Album is the most prestigious category at the Grammy Awards, recognizing an entire album. Artists like Stevie Wonder, Paul Simon, or Taylor Swift have won it multiple times."),
            zh = LocalizedContent("哪个格莱美奖项被赢得次数最多？", listOf("最佳专辑", "最佳唱片", "最佳歌曲", "最佳新人"), "音乐", "格莱美最佳专辑奖是格莱美奖中最负盛名的类别，表彰整张专辑。史蒂夫·旺德、保罗·西蒙或泰勒·斯威夫特等艺术家曾多次获奖。"),
            es = LocalizedContent("¿Qué premio Grammy se ha ganado más veces?", listOf("Mejor Álbum", "Mejor Grabación", "Mejor Canción", "Mejor Artista Nuevo"), "Música", "El Grammy al Mejor Álbum es la categoría más prestigiosa de los premios Grammy, que reconoce un álbum completo. Artistas como Stevie Wonder, Paul Simon o Taylor Swift lo han ganado varias veces.")
        ),
        BilingualQuestion(
            id = 51521, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album a vendu le plus de copies en 2023?", listOf("1989 (Taylor's Version)", "Midnights", "GUTS", "Speak Now (Taylor's Version)"), "Musique", "En 2023, 1989 (Taylor's Version) de Taylor Swift a été l'album le plus vendu grâce à sa réédition très attendue, qui a attiré à la fois les fans originaux et une nouvelle génération."),
            en = LocalizedContent("Which album sold the most copies in 2023?", listOf("1989 (Taylor's Version)", "Midnights", "GUTS", "Speak Now (Taylor's Version)"), "Music", "In 2023, 1989 (Taylor's Version) by Taylor Swift was the best-selling album thanks to its highly anticipated re-release, which attracted both original fans and a new generation."),
            zh = LocalizedContent("2023年销量最高的专辑是哪张？", listOf("1989（泰勒版）", "午夜", "勇气", "爱的告白（泰勒版）"), "音乐", "2023年，泰勒·斯威夫特的《1989（泰勒版）》是最畅销的专辑，得益于其备受期待的重新发行，吸引了原粉丝和新一代听众。"),
            es = LocalizedContent("¿Qué álbum vendió más copias en 2023?", listOf("1989 (Taylor's Version)", "Midnights", "GUTS", "Speak Now (Taylor's Version)"), "Música", "En 2023, 1989 (Taylor's Version) de Taylor Swift fue el álbum más vendido gracias a su muy esperada reedición, que atrajo tanto a los fans originales como a una nueva generación.")
        ),
        BilingualQuestion(
            id = 51522, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire a dominé le plus longtemps?", listOf("Romain", "Chinois", "Ottoman", "Britannique"), "Histoire", "L'empire chinois, sous différentes dynasties, a perduré pendant plus de deux millénaires, de la dynastie Qin (221 av. J.-C.) à la fin de l'ère impériale en 1912, ce qui en fait le plus long empire continu de l'histoire."),
            en = LocalizedContent("Which empire dominated the longest?", listOf("Roman", "Chinese", "Ottoman", "British"), "History", "The Chinese empire, under different dynasties, lasted for over two millennia, from the Qin dynasty (221 BC) to the end of the imperial era in 1912, making it the longest continuous empire in history."),
            zh = LocalizedContent("哪个帝国统治时间最长？", listOf("罗马", "中国", "奥斯曼", "英国"), "历史", "中国帝国历经多个朝代，从秦朝（公元前221年）到1912年帝国时代结束，持续了两千多年，是历史上持续时间最长的帝国。"),
            es = LocalizedContent("¿Qué imperio dominó durante más tiempo?", listOf("Romano", "Chino", "Otomano", "Británico"), "Historia", "El imperio chino, bajo diferentes dinastías, perduró durante más de dos milenios, desde la dinastía Qin (221 a.C.) hasta el final de la era imperial en 1912, lo que lo convierte en el imperio continuo más largo de la historia.")
        ),
        BilingualQuestion(
            id = 51523, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire le plus puissant de l'Antiquité?", listOf("Romain", "Perse", "Égyptien", "Macédonien"), "Histoire", "L'Empire romain a dominé le bassin méditerranéen et une grande partie de l'Europe, de l'Asie et de l'Afrique pendant plusieurs siècles grâce à sa puissance militaire, son administration et ses infrastructures."),
            en = LocalizedContent("Which is the most powerful empire of antiquity?", listOf("Roman", "Persian", "Egyptian", "Macedonian"), "History", "The Roman Empire dominated the Mediterranean basin and much of Europe, Asia, and Africa for several centuries due to its military power, administration, and infrastructure."),
            zh = LocalizedContent("古代最强大的帝国是哪个？", listOf("罗马", "波斯", "埃及", "马其顿"), "历史", "罗马帝国凭借其军事力量、行政管理和基础设施，统治了地中海盆地以及欧洲、亚洲和非洲的大部分地区长达数个世纪。"),
            es = LocalizedContent("¿Cuál es el imperio más poderoso de la Antigüedad?", listOf("Romano", "Persa", "Egipcio", "Macedonio"), "Historia", "El Imperio romano dominó la cuenca mediterránea y gran parte de Europa, Asia y África durante varios siglos gracias a su poder militar, administración e infraestructuras.")
        ),
        BilingualQuestion(
            id = 51524, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire le plus puissant du Moyen Âge?", listOf("Arabe", "Byzantin", "Mongol", "Persan"), "Histoire", "L'Empire mongol, sous Gengis Khan et ses successeurs, est devenu le plus vaste empire contigu de l'histoire au 13e siècle, dominant une grande partie de l'Asie et de l'Europe de l'Est."),
            en = LocalizedContent("Which is the most powerful empire of the Middle Ages?", listOf("Arab", "Byzantine", "Mongol", "Persian"), "History", "The Mongol Empire, under Genghis Khan and his successors, became the largest contiguous empire in history in the 13th century, dominating much of Asia and Eastern Europe."),
            zh = LocalizedContent("中世纪最强大的帝国是哪个？", listOf("阿拉伯", "拜占庭", "蒙古", "波斯"), "历史", "蒙古帝国在成吉思汗及其继任者的领导下，在13世纪成为历史上最大的连续帝国，统治了亚洲和东欧的大部分地区。"),
            es = LocalizedContent("¿Cuál es el imperio más poderoso de la Edad Media?", listOf("Árabe", "Bizantino", "Mongol", "Persa"), "Historia", "El Imperio mongol, bajo Gengis Kan y sus sucesores, se convirtió en el imperio contiguo más extenso de la historia en el siglo XIII, dominando gran parte de Asia y Europa del Este.")
        ),
        BilingualQuestion(
            id = 51525, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire le plus puissant de la Renaissance?", listOf("Ottoman", "Espagnol", "Venise", "Florence"), "Histoire", "L'empire espagnol dominait la Renaissance grâce à ses vastes colonies américaines, sa flotte puissante et le contrôle des routes commerciales."),
            en = LocalizedContent("Which is the most powerful empire of the Renaissance?", listOf("Ottoman", "Spanish", "Venice", "Florence"), "History", "The Spanish Empire dominated the Renaissance thanks to its vast American colonies, powerful fleet, and control of trade routes."),
            zh = LocalizedContent("文艺复兴时期最强大的帝国是哪个？", listOf("奥斯曼", "西班牙", "威尼斯", "佛罗伦萨"), "历史", "西班牙帝国凭借其庞大的美洲殖民地、强大的舰队和对贸易路线的控制，在文艺复兴时期占据主导地位。"),
            es = LocalizedContent("¿Cuál es el imperio más poderoso del Renacimiento?", listOf("Otomano", "Español", "Venecia", "Florencia"), "Historia", "El Imperio español dominó el Renacimiento gracias a sus vastas colonias americanas, su poderosa flota y el control de las rutas comerciales.")
        ),
        BilingualQuestion(
            id = 51526, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le prix Nobel le plus prestigieux?", listOf("Physique", "Chimie", "Médecine", "Paix"), "Science", "Le prix Nobel de physique est souvent considéré comme le plus prestigieux car il récompense des découvertes fondamentales sur les lois de l'univers, et de nombreux grands noms comme Einstein ou Curie l'ont reçu."),
            en = LocalizedContent("Which is the most prestigious Nobel Prize?", listOf("Physics", "Chemistry", "Medicine", "Peace"), "Science", "The Nobel Prize in Physics is often considered the most prestigious because it rewards fundamental discoveries about the laws of the universe, and many great names like Einstein or Curie have received it."),
            zh = LocalizedContent("哪个诺贝尔奖最负盛名？", listOf("物理学", "化学", "医学", "和平"), "科学", "诺贝尔物理学奖通常被认为是最负盛名的，因为它奖励关于宇宙规律的基础性发现，许多伟大人物如爱因斯坦或居里都曾获得该奖。"),
            es = LocalizedContent("¿Cuál es el Premio Nobel más prestigioso?", listOf("Física", "Química", "Medicina", "Paz"), "Ciencia", "El Premio Nobel de Física a menudo se considera el más prestigioso porque recompensa descubrimientos fundamentales sobre las leyes del universo, y muchos grandes nombres como Einstein o Curie lo han recibido.")
        ),
        BilingualQuestion(
            id = 51527, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a remporté le plus de prix Nobel?", listOf("Marie Curie", "Linus Pauling", "Frederick Sanger", "John Bardeen"), "Science", "Linus Pauling a remporté le prix Nobel de chimie en 1954 et le prix Nobel de la paix en 1962, ce qui fait de lui la seule personne à avoir reçu deux prix Nobel non partagés."),
            en = LocalizedContent("Which scientist has won the most Nobel Prizes?", listOf("Marie Curie", "Linus Pauling", "Frederick Sanger", "John Bardeen"), "Science", "Linus Pauling won the Nobel Prize in Chemistry in 1954 and the Nobel Peace Prize in 1962, making him the only person to have received two unshared Nobel Prizes."),
            zh = LocalizedContent("哪位科学家获得的诺贝尔奖最多？", listOf("玛丽·居里", "莱纳斯·鲍林", "弗雷德里克·桑格", "约翰·巴丁"), "科学", "莱纳斯·鲍林于1954年获得诺贝尔化学奖，1962年获得诺贝尔和平奖，使他成为唯一一位获得两个未共享诺贝尔奖的人。"),
            es = LocalizedContent("¿Qué científico ha ganado más Premios Nobel?", listOf("Marie Curie", "Linus Pauling", "Frederick Sanger", "John Bardeen"), "Ciencia", "Linus Pauling ganó el Premio Nobel de Química en 1954 y el Premio Nobel de la Paz en 1962, lo que lo convierte en la única persona que ha recibido dos Premios Nobel no compartidos.")
        ),
        BilingualQuestion(
            id = 51528, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays du monde?", listOf("Canada", "Chine", "États-Unis", "Russie"), "Géographie", "La Russie est le plus vaste pays du monde avec une superficie d'environ 17,1 millions de kilomètres carrés, couvrant onze fuseaux horaires."),
            en = LocalizedContent("Which is the largest country in the world?", listOf("Canada", "China", "United States", "Russia"), "Geography", "Russia is the largest country in the world with an area of about 17.1 million square kilometers, covering eleven time zones."),
            zh = LocalizedContent("世界上面积最大的国家是哪个？", listOf("加拿大", "中国", "美国", "俄罗斯"), "地理", "俄罗斯是世界上面积最大的国家，面积约1710万平方公里，横跨11个时区。"),
            es = LocalizedContent("¿Cuál es el país más grande del mundo?", listOf("Canadá", "China", "Estados Unidos", "Rusia"), "Geografía", "Rusia es el país más grande del mundo con una superficie de aproximadamente 17,1 millones de kilómetros cuadrados, cubriendo once husos horarios.")
        ),
        BilingualQuestion(
            id = 51529, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays avec la plus grande population?", listOf("Inde", "Chine", "États-Unis", "Indonésie"), "Géographie", "L'Inde a dépassé la Chine en 2023 pour devenir le pays le plus peuplé du monde, avec plus de 1,4 milliard d'habitants."),
            en = LocalizedContent("Which country has the largest population?", listOf("India", "China", "United States", "Indonesia"), "Geography", "India surpassed China in 2023 to become the most populous country in the world, with over 1.4 billion inhabitants."),
            zh = LocalizedContent("哪个国家人口最多？", listOf("印度", "中国", "美国", "印度尼西亚"), "地理", "印度在2023年超过中国，成为世界上人口最多的国家，拥有超过14亿居民。"),
            es = LocalizedContent("¿Qué país tiene la mayor población?", listOf("India", "China", "Estados Unidos", "Indonesia"), "Geografía", "La India superó a China en 2023 para convertirse en el país más poblado del mundo, con más de 1.400 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 51531, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel carnaval dure le plus longtemps au monde?", listOf("Rio", "Venise", "La Nouvelle-Orléans", "Trinidad"), "Culture", "Le carnaval de Rio dure officiellement cinq jours, mais les festivités s'étendent souvent sur plusieurs semaines avant le Mardi Gras, ce qui en fait l'un des plus longs au monde."),
            en = LocalizedContent("Which carnival lasts the longest in the world?", listOf("Rio", "Venice", "New Orleans", "Trinidad"), "Culture", "The Rio Carnival officially lasts five days, but festivities often extend for several weeks before Mardi Gras, making it one of the longest in the world."),
            zh = LocalizedContent("世界上持续时间最长的狂欢节是哪个？", listOf("里约", "威尼斯", "新奥尔良", "特立尼达"), "文化", "里约狂欢节官方持续五天，但庆祝活动通常在大斋节前持续数周，使其成为世界上最长的狂欢节之一。"),
            es = LocalizedContent("¿Qué carnaval dura más tiempo en el mundo?", listOf("Río", "Venecia", "Nueva Orleans", "Trinidad"), "Cultura", "El carnaval de Río dura oficialmente cinco días, pero las festividades a menudo se extienden durante varias semanas antes del Martes de Carnaval, lo que lo convierte en uno de los más largos del mundo.")
        ),
        BilingualQuestion(
            id = 51532, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel danse représente le plus la passion?", listOf("Ballet", "Flamenco", "Tango", "Valse"), "Culture", "Le tango, né dans les quartiers populaires de Buenos Aires, est associé à la passion amoureuse en raison de ses mouvements intenses, de son jeu de jambes sensuel et de son histoire liée à la nostalgie et au désir."),
            en = LocalizedContent("Which dance best represents passion?", listOf("Ballet", "Flamenco", "Tango", "Waltz"), "Culture", "The tango, born in the working-class neighborhoods of Buenos Aires, is associated with romantic passion due to its intense movements, sensual footwork, and history linked to nostalgia and desire."),
            zh = LocalizedContent("哪种舞蹈最能代表激情？", listOf("芭蕾", "弗拉门戈", "探戈", "华尔兹"), "文化", "探戈诞生于布宜诺斯艾利斯的工人阶级社区，因其激烈的动作、性感的步法以及与怀旧和欲望相关的历史，与浪漫激情联系在一起。"),
            es = LocalizedContent("¿Qué baile representa mejor la pasión?", listOf("Ballet", "Flamenco", "Tango", "Vals"), "Cultura", "El tango, nacido en los barrios obreros de Buenos Aires, se asocia con la pasión amorosa debido a sus movimientos intensos, su juego de pies sensual y su historia ligada a la nostalgia y el deseo.")
        ),
        BilingualQuestion(
            id = 51533, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel religion a le plus de fidèles en Afrique?", listOf("Christianisme", "Islam", "Animisme", "Hindouisme"), "Culture", "Le christianisme est la religion majoritaire en Afrique, avec environ 50% de la population, devant l'islam qui représente environ 40%."),
            en = LocalizedContent("Which religion has the most followers in Africa?", listOf("Christianity", "Islam", "Animism", "Hinduism"), "Culture", "Christianity is the majority religion in Africa, with about 50% of the population, followed by Islam at about 40%."),
            zh = LocalizedContent("非洲哪种宗教的信徒最多？", listOf("基督教", "伊斯兰教", "泛灵论", "印度教"), "文化", "基督教是非洲的主要宗教，约占人口的50%，其次是伊斯兰教，约占40%。"),
            es = LocalizedContent("¿Qué religión tiene más fieles en África?", listOf("Cristianismo", "Islam", "Animismo", "Hinduismo"), "Cultura", "El cristianismo es la religión mayoritaria en África, con aproximadamente el 50% de la población, seguido del islam con alrededor del 40%.")
        ),
        BilingualQuestion(
            id = 51534, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival internet a le plus changé la culture?", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Metaverse"), "Culture", "Twitch Plays Pokémon a démontré la puissance du jeu collaboratif de masse en ligne, influençant durablement la culture du streaming et des expériences participatives."),
            en = LocalizedContent("Which internet festival has changed culture the most?", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Metaverse"), "Culture", "Twitch Plays Pokémon demonstrated the power of mass online collaborative gaming, durably influencing streaming culture and participatory experiences."),
            zh = LocalizedContent("哪个互联网节日对文化改变最大？", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Metaverse"), "文化", "Twitch Plays Pokémon展示了大规模在线协作游戏的力量，持久地影响了流媒体文化和参与式体验。"),
            es = LocalizedContent("¿Qué festival de internet ha cambiado más la cultura?", listOf("Twitch Plays", "Reddit Place", "4chan Raids", "Metaverse"), "Cultura", "Twitch Plays Pokémon demostró el poder del juego colaborativo masivo en línea, influyendo duraderamente en la cultura del streaming y las experiencias participativas.")
        ),
        BilingualQuestion(
            id = 51535, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mème internet a la meilleure longévité?", listOf("Rickroll", "Doge", "Harambe", "Distracted Boyfriend"), "Culture", "Le Rickroll est un mème basé sur le clip de Rick Astley \"Never Gonna Give You Up\", apparu en 2007. Sa longévité exceptionnelle tient à sa simplicité et à son utilisation constante comme canular en ligne."),
            en = LocalizedContent("Which internet meme has the best longevity?", listOf("Rickroll", "Doge", "Harambe", "Distracted Boyfriend"), "Culture", "The Rickroll is a meme based on Rick Astley's music video 'Never Gonna Give You Up', appearing in 2007. Its exceptional longevity is due to its simplicity and constant use as an online prank."),
            zh = LocalizedContent("哪个网络迷因寿命最长？", listOf("Rickroll", "Doge", "Harambe", "Distracted Boyfriend"), "文化", "Rickroll是一个基于Rick Astley的歌曲《Never Gonna Give You Up》的迷因，出现于2007年。其非凡的寿命归功于其简单性和作为在线恶作剧的持续使用。"),
            es = LocalizedContent("¿Qué meme de internet tiene la mayor longevidad?", listOf("Rickroll", "Doge", "Harambe", "Distracted Boyfriend"), "Cultura", "El Rickroll es un meme basado en el videoclip de Rick Astley 'Never Gonna Give You Up', aparecido en 2007. Su longevidad excepcional se debe a su simplicidad y su uso constante como broma en línea.")
        ),
        BilingualQuestion(
            id = 51536, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus de médailles d'or?", listOf("Michael Phelps", "Usain Bolt", "Carl Lewis", "Mark Wells"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres remportés entre 2004 et 2016 en natation."),
            en = LocalizedContent("Which athlete has won the most gold medals?", listOf("Michael Phelps", "Usain Bolt", "Carl Lewis", "Mark Wells"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016 in swimming."),
            zh = LocalizedContent("哪位运动员获得的金牌最多？", listOf("迈克尔·菲尔普斯", "尤塞恩·博尔特", "卡尔·刘易斯", "马克·威尔斯"), "体育", "迈克尔·菲尔普斯保持着奥运会金牌最多的纪录，在2004年至2016年间在游泳项目中获得23枚金牌。"),
            es = LocalizedContent("¿Qué atleta ha ganado más medallas de oro?", listOf("Michael Phelps", "Usain Bolt", "Carl Lewis", "Mark Wells"), "Deportes", "Michael Phelps posee el récord de más medallas de oro olímpicas, con 23 títulos ganados entre 2004 y 2016 en natación.")
        ),
        BilingualQuestion(
            id = 51537, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Simone Biles a-t-elle réussi le premier Yurchenko double pike?", listOf("2021", "2022", "2023", "2024"), "Sport", "Simone Biles a réalisé le premier Yurchenko double pike en compétition internationale aux championnats du monde de gymnastique en 2022, devenant ainsi la première femme à réussir cet élément."),
            en = LocalizedContent("In which year did Simone Biles perform the first Yurchenko double pike?", listOf("2021", "2022", "2023", "2024"), "Sports", "Simone Biles performed the first Yurchenko double pike in international competition at the 2022 World Gymnastics Championships, becoming the first woman to successfully complete this element."),
            zh = LocalizedContent("西蒙·拜尔斯在哪一年完成了第一个尤尔琴科双屈体？", listOf("2021", "2022", "2023", "2024"), "体育", "西蒙·拜尔斯在2022年世界体操锦标赛的国际比赛中完成了第一个尤尔琴科双屈体，成为首位成功完成该动作的女性。"),
            es = LocalizedContent("¿En qué año realizó Simone Biles el primer Yurchenko doble pike?", listOf("2021", "2022", "2023", "2024"), "Deportes", "Simone Biles realizó el primer Yurchenko doble pike en competición internacional en los Campeonatos Mundiales de Gimnasia de 2022, convirtiéndose en la primera mujer en completar con éxito este elemento.")
        ),
        BilingualQuestion(
            id = 51538, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde en saut à la perche féminin?", listOf("5.00m", "5.05m", "5.10m", "5.15m"), "Sport", "Le record du monde féminin du saut à la perche est de 5,10 mètres, établi par la Russe Yelena Isinbayeva en 2005."),
            en = LocalizedContent("What is the women's pole vault world record?", listOf("5.00m", "5.05m", "5.10m", "5.15m"), "Sports", "The women's pole vault world record is 5.10 meters, set by Russian Yelena Isinbayeva in 2005."),
            zh = LocalizedContent("女子撑杆跳高的世界纪录是多少？", listOf("5.00米", "5.05米", "5.10米", "5.15米"), "体育", "女子撑杆跳高的世界纪录是5.10米，由俄罗斯选手叶莲娜·伊辛巴耶娃于2005年创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto con pértiga femenino?", listOf("5.00m", "5.05m", "5.10m", "5.15m"), "Deportes", "El récord mundial femenino de salto con pértiga es de 5,10 metros, establecido por la rusa Yelena Isinbayeva en 2005.")
        ),
        BilingualQuestion(
            id = 51539, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté le plus d'Oscars en une seule cérémonie?", listOf("Titanic", "The Lord of the Rings: Return of the King", "Ben-Hur", "West Side Story"), "Cinéma", "Le Retour du Roi a remporté les 11 Oscars pour lesquels il était nommé en 2004, égalant le record de Ben-Hur et Titanic."),
            en = LocalizedContent("Which film has won the most Oscars in a single ceremony?", listOf("Titanic", "The Lord of the Rings: Return of the King", "Ben-Hur", "West Side Story"), "Cinema", "The Return of the King won all 11 Oscars it was nominated for in 2004, tying the record of Ben-Hur and Titanic."),
            zh = LocalizedContent("哪部电影在单届奥斯卡颁奖礼上获奖最多？", listOf("泰坦尼克号", "指环王：王者归来", "宾虚", "西区故事"), "电影", "《王者归来》在2004年获得了全部11项提名奥斯卡奖，追平了《宾虚》和《泰坦尼克号》的纪录。"),
            es = LocalizedContent("¿Qué película ha ganado más premios Oscar en una sola ceremonia?", listOf("Titanic", "El Señor de los Anillos: El Retorno del Rey", "Ben-Hur", "West Side Story"), "Cine", "El Retorno del Rey ganó los 11 Oscar a los que estaba nominada en 2004, igualando el récord de Ben-Hur y Titanic.")
        ),
        BilingualQuestion(
            id = 51540, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel acteur a remporté le plus d'Oscars?", listOf("Marlon Brando", "Jack Nicholson", "Daniel Day-Lewis", "Meryl Streep"), "Cinéma", "Meryl Streep détient le record du plus grand nombre d'Oscars pour un acteur, avec trois statuettes remportées sur 21 nominations."),
            en = LocalizedContent("Which actor has won the most Oscars?", listOf("Marlon Brando", "Jack Nicholson", "Daniel Day-Lewis", "Meryl Streep"), "Cinema", "Meryl Streep holds the record for the most Oscars won by an actor, with three statuettes from 21 nominations."),
            zh = LocalizedContent("哪位演员获得的奥斯卡奖最多？", listOf("马龙·白兰度", "杰克·尼科尔森", "丹尼尔·戴-刘易斯", "梅丽尔·斯特里普"), "电影", "梅丽尔·斯特里普保持着演员获得奥斯卡奖最多的纪录，在21次提名中获得了三座奖杯。"),
            es = LocalizedContent("¿Qué actor ha ganado más premios Oscar?", listOf("Marlon Brando", "Jack Nicholson", "Daniel Day-Lewis", "Meryl Streep"), "Cine", "Meryl Streep posee el récord de más premios Oscar ganados por un actor, con tres estatuillas de 21 nominaciones.")
        ),
        BilingualQuestion(
            id = 51541, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste a remporté le plus de Grammy en une seule année?", listOf("Michael Jackson", "Beyoncé", "Taylor Swift", "The Weeknd"), "Musique", "Taylor Swift a remporté quatre Grammy Awards en 2024, dont celui de l'Album de l'année pour \"Midnights\", établissant un record pour une artiste féminine."),
            en = LocalizedContent("Which artist has won the most Grammys in a single year?", listOf("Michael Jackson", "Beyoncé", "Taylor Swift", "The Weeknd"), "Music", "Taylor Swift won four Grammy Awards in 2024, including Album of the Year for 'Midnights', setting a record for a female artist."),
            zh = LocalizedContent("哪位艺术家在单一年份获得的格莱美奖最多？", listOf("迈克尔·杰克逊", "碧昂丝", "泰勒·斯威夫特", "威肯"), "音乐", "泰勒·斯威夫特在2024年获得了四项格莱美奖，包括凭借《Midnights》获得的年度专辑奖，创下了女性艺术家的纪录。"),
            es = LocalizedContent("¿Qué artista ha ganado más premios Grammy en un solo año?", listOf("Michael Jackson", "Beyoncé", "Taylor Swift", "The Weeknd"), "Música", "Taylor Swift ganó cuatro premios Grammy en 2024, incluido el de Álbum del Año por 'Midnights', estableciendo un récord para una artista femenina.")
        ),
        BilingualQuestion(
            id = 51542, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album a le plus d'écoutes sur Spotify?", listOf("= de Ed Sheeran", "Blinding Lights de The Weeknd", "Thriller de Michael Jackson", "Abbey Road des Beatles"), "Musique", "L'album ÷ (Divide) de Ed Sheeran, sorti en 2017, cumule le plus grand nombre d'écoutes sur Spotify grâce à des tubes mondiaux comme Shape of You."),
            en = LocalizedContent("Which album has the most streams on Spotify?", listOf("= by Ed Sheeran", "Blinding Lights by The Weeknd", "Thriller by Michael Jackson", "Abbey Road by The Beatles"), "Music", "Ed Sheeran's album ÷ (Divide), released in 2017, has the most streams on Spotify thanks to global hits like Shape of You."),
            zh = LocalizedContent("哪张专辑在Spotify上播放量最高？", listOf("Ed Sheeran的=", "The Weeknd的Blinding Lights", "Michael Jackson的Thriller", "The Beatles的Abbey Road"), "音乐", "Ed Sheeran于2017年发行的专辑÷ (Divide)凭借《Shape of You》等全球热门歌曲，在Spotify上拥有最高的播放量。"),
            es = LocalizedContent("¿Qué álbum tiene más reproducciones en Spotify?", listOf("= de Ed Sheeran", "Blinding Lights de The Weeknd", "Thriller de Michael Jackson", "Abbey Road de The Beatles"), "Música", "El álbum ÷ (Divide) de Ed Sheeran, lanzado en 2017, acumula el mayor número de reproducciones en Spotify gracias a éxitos mundiales como Shape of You.")
        ),
        BilingualQuestion(
            id = 51543, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien texte écrit?", listOf("Code de Hammurabi", "Épopée de Gilgamesh", "Hymne à Ptah-hotep", "Texte des Pyramides"), "Histoire", "L'Hymne à Ptah-hotep, daté d'environ 2400 av. J.-C., est un texte égyptien ancien contenant des maximes de sagesse. Il est considéré comme l'un des plus vieux écrits complets connus."),
            en = LocalizedContent("What is the oldest written text?", listOf("Code of Hammurabi", "Epic of Gilgamesh", "Maxims of Ptahhotep", "Pyramid Texts"), "History", "The Maxims of Ptahhotep, dated to around 2400 BC, is an ancient Egyptian text containing wisdom sayings. It is considered one of the oldest complete writings known."),
            zh = LocalizedContent("最古老的书面文本是什么？", listOf("汉谟拉比法典", "吉尔伽美什史诗", "普塔霍特普箴言", "金字塔文本"), "历史", "《普塔霍特普箴言》可追溯至约公元前2400年，是一部包含智慧格言的古埃及文本，被认为是最古老的完整著作之一。"),
            es = LocalizedContent("¿Cuál es el texto escrito más antiguo?", listOf("Código de Hammurabi", "Epopea de Gilgamesh", "Máximas de Ptahhotep", "Textos de las Pirámides"), "Historia", "Las Máximas de Ptahhotep, datadas alrededor del 2400 a.C., son un texto egipcio antiguo que contiene máximas de sabiduría. Se considera uno de los escritos completos más antiguos conocidos.")
        ),
        BilingualQuestion(
            id = 51544, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand prix scientifique?", listOf("Prix Nobel", "Crafoord Prize", "Breakthrough Prize", "Kyoto Prize"), "Science", "Le Prix Nobel est considéré comme la plus prestigieuse récompense scientifique, décernée chaque année dans les domaines de la physique, de la chimie et de la médecine."),
            en = LocalizedContent("What is the greatest scientific prize?", listOf("Nobel Prize", "Crafoord Prize", "Breakthrough Prize", "Kyoto Prize"), "Science", "The Nobel Prize is considered the most prestigious scientific award, awarded annually in physics, chemistry, and medicine."),
            zh = LocalizedContent("最伟大的科学奖项是什么？", listOf("诺贝尔奖", "克拉福德奖", "突破奖", "京都奖"), "科学", "诺贝尔奖被认为是最负盛名的科学奖项，每年在物理学、化学和医学领域颁发。"),
            es = LocalizedContent("¿Cuál es el premio científico más importante?", listOf("Premio Nobel", "Premio Crafoord", "Premio Breakthrough", "Premio Kioto"), "Ciencia", "El Premio Nobel es considerado el galardón científico más prestigioso, otorgado anualmente en física, química y medicina.")
        ),
        BilingualQuestion(
            id = 51546, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand sportif du football?", listOf("Pelé", "Maradona", "Messi", "Ronaldo"), "Sport", "Messi a remporté huit Ballons d'Or, un record, et a mené l'Argentine à la victoire en Coupe du monde 2022, ce qui renforce son statut de plus grand footballeur pour beaucoup."),
            en = LocalizedContent("Who is the greatest footballer?", listOf("Pelé", "Maradona", "Messi", "Ronaldo"), "Sports", "Messi has won eight Ballon d'Or awards, a record, and led Argentina to victory in the 2022 World Cup, strengthening his status as the greatest footballer for many."),
            zh = LocalizedContent("最伟大的足球运动员是谁？", listOf("贝利", "马拉多纳", "梅西", "罗纳尔多"), "体育", "梅西赢得了八次金球奖，创下纪录，并带领阿根廷在2022年世界杯夺冠，这巩固了他作为最伟大足球运动员的地位。"),
            es = LocalizedContent("¿Quién es el futbolista más grande?", listOf("Pelé", "Maradona", "Messi", "Ronaldo"), "Deportes", "Messi ha ganado ocho Balones de Oro, un récord, y llevó a Argentina a la victoria en la Copa del Mundo de 2022, lo que refuerza su estatus como el futbolista más grande para muchos.")
        ),
        BilingualQuestion(
            id = 51547, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Usain Bolt a-t-il battu le record du 100m?", listOf("2008", "2009", "2016", "2019"), "Sport", "Usain Bolt a battu le record du 100 mètres aux Jeux olympiques de Rio en 2016, réalisant un temps de 9,81 secondes."),
            en = LocalizedContent("In which year did Usain Bolt break the 100m record?", listOf("2008", "2009", "2016", "2019"), "Sports", "Usain Bolt broke the 100 meters record at the Rio 2016 Olympic Games, running a time of 9.81 seconds."),
            zh = LocalizedContent("尤塞恩·博尔特在哪一年打破了100米纪录？", listOf("2008", "2009", "2016", "2019"), "体育", "尤塞恩·博尔特在2016年里约奥运会上以9.81秒的成绩打破了100米纪录。"),
            es = LocalizedContent("¿En qué año Usain Bolt batió el récord de 100m?", listOf("2008", "2009", "2016", "2019"), "Deportes", "Usain Bolt batió el récord de 100 metros en los Juegos Olímpicos de Río 2016, con un tiempo de 9.81 segundos.")
        ),
        BilingualQuestion(
            id = 51548, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de Ballon d'Or remportés par un footballeur?", listOf("7", "8", "9", "10"), "Sport", "Lionel Messi détient le record avec 8 Ballons d'Or, le dernier obtenu en 2023. Il devance Cristiano Ronaldo, qui en compte 5."),
            en = LocalizedContent("What is the highest number of Ballon d'Or awards won by a footballer?", listOf("7", "8", "9", "10"), "Sports", "Lionel Messi holds the record with 8 Ballon d'Or awards, the last one obtained in 2023. He surpasses Cristiano Ronaldo, who has 5."),
            zh = LocalizedContent("足球运动员获得金球奖的最高次数是多少？", listOf("7", "8", "9", "10"), "体育", "莱昂内尔·梅西以8次金球奖保持纪录，最近一次在2023年获得。他领先于获得5次的克里斯蒂亚诺·罗纳尔多。"),
            es = LocalizedContent("¿Cuál es el mayor número de Balones de Oro ganados por un futbolista?", listOf("7", "8", "9", "10"), "Deportes", "Lionel Messi ostenta el récord con 8 Balones de Oro, el último obtenido en 2023. Supera a Cristiano Ronaldo, que tiene 5.")
        ),
        BilingualQuestion(
            id = 51549, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé le plus grand nombre de films?", listOf("Akira Kurosawa", "Jean-Luc Godard", "Wong Kar-wai", "François Truffaut"), "Cinéma", "Jean-Luc Godard a réalisé plus de 130 films, incluant courts et longs métrages, ce qui en fait le cinéaste le plus prolifique de l'histoire du cinéma."),
            en = LocalizedContent("Which director has made the most films?", listOf("Akira Kurosawa", "Jean-Luc Godard", "Wong Kar-wai", "François Truffaut"), "Cinema", "Jean-Luc Godard directed more than 130 films, including shorts and features, making him the most prolific filmmaker in cinema history."),
            zh = LocalizedContent("哪位导演拍摄的电影数量最多？", listOf("黑泽明", "让-吕克·戈达尔", "王家卫", "弗朗索瓦·特吕弗"), "电影", "让-吕克·戈达尔执导了超过130部电影，包括短片和长片，使他成为电影史上最多产的导演。"),
            es = LocalizedContent("¿Qué director ha realizado más películas?", listOf("Akira Kurosawa", "Jean-Luc Godard", "Wong Kar-wai", "François Truffaut"), "Cine", "Jean-Luc Godard dirigió más de 130 películas, incluyendo cortometrajes y largometrajes, lo que lo convierte en el cineasta más prolífico de la historia del cine.")
        ),
        BilingualQuestion(
            id = 51550, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'album le plus vendu de tous les temps?", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "Musique", "Sorti en 1982, l'album Thriller de Michael Jackson est certifié 33 fois disque de platine aux États-Unis et s'est vendu à plus de 100 millions d'exemplaires dans le monde."),
            en = LocalizedContent("What is the best-selling album of all time?", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "Music", "Released in 1982, Michael Jackson's album Thriller is certified 33 times platinum in the US and has sold over 100 million copies worldwide."),
            zh = LocalizedContent("有史以来最畅销的专辑是什么？", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "音乐", "迈克尔·杰克逊1982年发行的专辑《Thriller》在美国获得33次白金认证，全球销量超过1亿张。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de todos los tiempos?", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "Música", "Lanzado en 1982, el álbum Thriller de Michael Jackson está certificado 33 veces platino en EE. UU. y ha vendido más de 100 millones de copias en todo el mundo.")
        ),
        BilingualQuestion(
            id = 51551, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien site UNESCO?", listOf("Giza", "Angkor Wat", "Taj Mahal", "Knossos"), "Culture", "Le site des pyramides de Giza, en Égypte, a été inscrit au patrimoine mondial de l'UNESCO en 1979, mais il est considéré comme le plus ancien site archéologique majeur parmi ceux listés, datant de plus de 4 500 ans."),
            en = LocalizedContent("What is the oldest UNESCO site?", listOf("Giza", "Angkor Wat", "Taj Mahal", "Knossos"), "Culture", "The Giza pyramid complex in Egypt was inscribed as a UNESCO World Heritage site in 1979, but it is considered the oldest major archaeological site among those listed, dating back over 4,500 years."),
            zh = LocalizedContent("最古老的联合国教科文组织遗址是什么？", listOf("吉萨", "吴哥窟", "泰姬陵", "克诺索斯"), "文化", "埃及的吉萨金字塔群于1979年被列入联合国教科文组织世界遗产，但它被认为是其中最早的主要考古遗址，距今已有4500多年历史。"),
            es = LocalizedContent("¿Cuál es el sitio más antiguo de la UNESCO?", listOf("Giza", "Angkor Wat", "Taj Mahal", "Knossos"), "Cultura", "El complejo de pirámides de Giza en Egipto fue inscrito como Patrimonio de la Humanidad por la UNESCO en 1979, pero se considera el sitio arqueológico más antiguo entre los listados, con más de 4.500 años de antigüedad.")
        ),
        BilingualQuestion(
            id = 51552, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'empire le plus long de l'histoire?", listOf("Romain", "Chinois", "Ottoman", "Britannique"), "Histoire", "L'Empire chinois, sous différentes dynasties, a perduré de 221 av. J.-C. à 1912, soit plus de 2000 ans, ce qui en fait le plus long empire continu de l'histoire."),
            en = LocalizedContent("What is the longest-lasting empire in history?", listOf("Roman", "Chinese", "Ottoman", "British"), "History", "The Chinese Empire, under various dynasties, lasted from 221 BC to 1912, over 2,000 years, making it the longest continuous empire in history."),
            zh = LocalizedContent("历史上持续时间最长的帝国是哪个？", listOf("罗马帝国", "中华帝国", "奥斯曼帝国", "大英帝国"), "历史", "中华帝国历经多个朝代，从公元前221年持续到1912年，超过2000年，是历史上延续时间最长的帝国。"),
            es = LocalizedContent("¿Cuál es el imperio más longevo de la historia?", listOf("Romano", "Chino", "Otomano", "Británico"), "Historia", "El Imperio chino, bajo varias dinastías, duró desde el 221 a.C. hasta 1912, más de 2000 años, lo que lo convierte en el imperio continuo más largo de la historia.")
        ),
        BilingualQuestion(
            id = 51553, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le scientifique ayant gagné le plus de prix?", listOf("Marie Curie", "Linus Pauling", "Albert Einstein", "Stephen Hawking"), "Science", "Linus Pauling est le seul scientifique à avoir remporté deux prix Nobel non partagés : celui de chimie en 1954 et celui de la paix en 1962."),
            en = LocalizedContent("Which scientist has won the most prizes?", listOf("Marie Curie", "Linus Pauling", "Albert Einstein", "Stephen Hawking"), "Science", "Linus Pauling is the only scientist to have won two unshared Nobel Prizes: Chemistry in 1954 and Peace in 1962."),
            zh = LocalizedContent("哪位科学家获得的奖项最多？", listOf("玛丽·居里", "莱纳斯·鲍林", "阿尔伯特·爱因斯坦", "斯蒂芬·霍金"), "科学", "莱纳斯·鲍林是唯一一位两次获得诺贝尔奖且未与他人分享的科学家：1954年化学奖和1962年和平奖。"),
            es = LocalizedContent("¿Qué científico ha ganado más premios?", listOf("Marie Curie", "Linus Pauling", "Albert Einstein", "Stephen Hawking"), "Ciencia", "Linus Pauling es el único científico que ha ganado dos premios Nobel no compartidos: Química en 1954 y Paz en 1962.")
        ),
        BilingualQuestion(
            id = 51554, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert chaud du monde?", listOf("Sahara", "Arabie", "Kalhari", "Atacama"), "Géographie", "Le Sahara s'étend sur environ 9,2 millions de km² en Afrique du Nord, ce qui en fait le plus vaste désert chaud du monde."),
            en = LocalizedContent("What is the largest hot desert in the world?", listOf("Sahara", "Arabian", "Kalahari", "Atacama"), "Geography", "The Sahara covers about 9.2 million km² in North Africa, making it the largest hot desert in the world."),
            zh = LocalizedContent("世界上最大的热带沙漠是什么？", listOf("撒哈拉沙漠", "阿拉伯沙漠", "卡拉哈里沙漠", "阿塔卡马沙漠"), "地理", "撒哈拉沙漠位于北非，面积约920万平方公里，是世界上最大的热带沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto cálido más grande del mundo?", listOf("Sáhara", "Arábigo", "Kalahari", "Atacama"), "Geografía", "El Sáhara se extiende por unos 9,2 millones de km² en el norte de África, lo que lo convierte en el desierto cálido más grande del mundo.")
        ),
        BilingualQuestion(
            id = 51555, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus de titres mondiaux?", listOf("Usain Bolt", "Michael Phelps", "Larisa Latynina", "Nadia Comaneci"), "Sport", "Larisa Latynina, gymnaste soviétique, détient le record du plus grand nombre de médailles olympiques (18) et a dominé les championnats du monde dans les années 1950 et 1960."),
            en = LocalizedContent("Which athlete has won the most world titles?", listOf("Usain Bolt", "Michael Phelps", "Larisa Latynina", "Nadia Comaneci"), "Sports", "Larisa Latynina, a Soviet gymnast, holds the record for the most Olympic medals (18) and dominated world championships in the 1950s and 1960s."),
            zh = LocalizedContent("哪位运动员赢得的世界冠军最多？", listOf("尤塞恩·博尔特", "迈克尔·菲尔普斯", "拉里莎·拉蒂尼娜", "纳迪亚·科马内奇"), "体育", "苏联体操运动员拉里莎·拉蒂尼娜保持着奥运奖牌最多（18枚）的纪录，并在20世纪50年代和60年代统治了世界锦标赛。"),
            es = LocalizedContent("¿Qué atleta ha ganado más títulos mundiales?", listOf("Usain Bolt", "Michael Phelps", "Larisa Latynina", "Nadia Comaneci"), "Deportes", "Larisa Latynina, gimnasta soviética, posee el récord de más medallas olímpicas (18) y dominó los campeonatos mundiales en las décadas de 1950 y 1960.")
        ),
        BilingualQuestion(
            id = 51556, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'Afrique du Sud a-t-elle remporté la Coupe du Monde de rugby?", listOf("1995", "2007", "2019", "2023"), "Sport", "L'Afrique du Sud a remporté la Coupe du Monde de rugby en 1995, un an après la fin de l'apartheid, en battant la Nouvelle-Zélande en finale à Johannesburg."),
            en = LocalizedContent("In which year did South Africa win the Rugby World Cup?", listOf("1995", "2007", "2019", "2023"), "Sports", "South Africa won the Rugby World Cup in 1995, a year after the end of apartheid, by defeating New Zealand in the final in Johannesburg."),
            zh = LocalizedContent("南非在哪一年赢得了橄榄球世界杯？", listOf("1995", "2007", "2019", "2023"), "体育", "南非在1995年赢得了橄榄球世界杯，这是在种族隔离制度结束一年后，他们在约翰内斯堡的决赛中击败了新西兰。"),
            es = LocalizedContent("¿En qué año ganó Sudáfrica la Copa Mundial de Rugby?", listOf("1995", "2007", "2019", "2023"), "Deportes", "Sudáfrica ganó la Copa Mundial de Rugby en 1995, un año después del fin del apartheid, al vencer a Nueva Zelanda en la final en Johannesburgo.")
        ),
        BilingualQuestion(
            id = 51557, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand événement sportif du monde?", listOf("Coupe du Monde", "Jeux Olympiques", "Tour de France", "Super Bowl"), "Sport", "Les Jeux Olympiques rassemblent plus de 200 nations et des milliers d'athlètes dans une compétition multisports tous les quatre ans, ce qui en fait l'événement sportif le plus suivi et médiatisé au monde."),
            en = LocalizedContent("What is the biggest sporting event in the world?", listOf("World Cup", "Olympic Games", "Tour de France", "Super Bowl"), "Sports", "The Olympic Games bring together over 200 nations and thousands of athletes in a multi-sport competition every four years, making it the most watched and media-covered sporting event in the world."),
            zh = LocalizedContent("世界上最大的体育赛事是什么？", listOf("世界杯", "奥运会", "环法自行车赛", "超级碗"), "体育", "奥运会每四年举办一次，汇集了200多个国家和数千名运动员参加多项体育比赛，使其成为世界上观看人数最多、媒体报道最广泛的体育赛事。"),
            es = LocalizedContent("¿Cuál es el evento deportivo más grande del mundo?", listOf("Copa Mundial", "Juegos Olímpicos", "Tour de Francia", "Super Bowl"), "Deportes", "Los Juegos Olímpicos reúnen a más de 200 naciones y miles de atletas en una competición multideportiva cada cuatro años, lo que los convierte en el evento deportivo más seguido y cubierto por los medios del mundo.")
        ),
        BilingualQuestion(
            id = 51558, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le genre cinématographique le plus populaire?", listOf("Action", "Comédie", "Drame", "Horreur"), "Cinéma", "Les films d'action dominent le box-office mondial grâce à leurs scènes spectaculaires et leur attrait universel, attirant un large public."),
            en = LocalizedContent("What is the most popular film genre?", listOf("Action", "Comedy", "Drama", "Horror"), "Cinema", "Action films dominate the global box office due to their spectacular scenes and universal appeal, attracting a wide audience."),
            zh = LocalizedContent("最受欢迎的电影类型是什么？", listOf("动作片", "喜剧片", "剧情片", "恐怖片"), "电影", "动作片因其壮观的场景和普遍吸引力而主导全球票房，吸引了广泛的观众。"),
            es = LocalizedContent("¿Cuál es el género cinematográfico más popular?", listOf("Acción", "Comedia", "Drama", "Terror"), "Cine", "Las películas de acción dominan la taquilla mundial debido a sus escenas espectaculares y atractivo universal, atrayendo a un público amplio.")
        ),
        BilingualQuestion(
            id = 51559, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le genre musical le plus populaire?", listOf("Pop", "Rock", "Hip-hop", "Classique"), "Musique", "Le hip-hop est devenu le genre musical le plus populaire aux États-Unis en 2017, dépassant le rock en termes de consommation totale, selon le rapport Nielsen Music."),
            en = LocalizedContent("What is the most popular music genre?", listOf("Pop", "Rock", "Hip-hop", "Classical"), "Music", "Hip-hop became the most popular music genre in the United States in 2017, surpassing rock in total consumption, according to the Nielsen Music report."),
            zh = LocalizedContent("最受欢迎的音乐类型是什么？", listOf("流行", "摇滚", "嘻哈", "古典"), "音乐", "根据尼尔森音乐报告，嘻哈音乐在2017年成为美国最受欢迎的音乐类型，在总消费量上超过了摇滚乐。"),
            es = LocalizedContent("¿Cuál es el género musical más popular?", listOf("Pop", "Rock", "Hip-hop", "Clásica"), "Música", "El hip-hop se convirtió en el género musical más popular en Estados Unidos en 2017, superando al rock en consumo total, según el informe Nielsen Music.")
        ),
        BilingualQuestion(
            id = 51560, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mème le plus viral de 2020?", listOf("Among Us", "Stonks", "Loss", "Expand Dong"), "Culture", "Stonks est un mème basé sur un personnage mal dessiné avec un costume, représentant un trader boursier, et le mot \"stonks\" (faute intentionnelle de \"stocks\") est devenu viral en 2020 pour commenter ironiquement les marchés financiers."),
            en = LocalizedContent("What was the most viral meme of 2020?", listOf("Among Us", "Stonks", "Loss", "Expand Dong"), "Culture", "Stonks is a meme based on a poorly drawn character in a suit, representing a stock trader, and the word 'stonks' (intentional misspelling of 'stocks') went viral in 2020 to ironically comment on financial markets."),
            zh = LocalizedContent("2020年最火的网络迷因是什么？", listOf("Among Us", "Stonks", "Loss", "Expand Dong"), "文化", "Stonks是一个基于穿着西装的粗糙画风角色的迷因，代表股票交易员，单词'stonks'（'stocks'的故意拼错）在2020年走红，用于讽刺性地评论金融市场。"),
            es = LocalizedContent("¿Cuál fue el meme más viral de 2020?", listOf("Among Us", "Stonks", "Loss", "Expand Dong"), "Cultura", "Stonks es un meme basado en un personaje mal dibujado con traje, que representa a un comerciante de bolsa, y la palabra 'stonks' (error intencional de 'stocks') se volvió viral en 2020 para comentar irónicamente los mercados financieros.")
        ),
        BilingualQuestion(
            id = 51561, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'événement historique le plus important?", listOf("Révolution Française", "Révolution Industrielle", "Découverte de l'Amérique", "Révolution Russe"), "Histoire", "La Révolution Industrielle est souvent considérée comme l'événement historique le plus important car elle a transformé les sociétés agraires en sociétés industrielles, bouleversant l'économie, la technologie et les modes de vie à l'échelle mondiale."),
            en = LocalizedContent("What is the most important historical event?", listOf("French Revolution", "Industrial Revolution", "Discovery of America", "Russian Revolution"), "History", "The Industrial Revolution is often considered the most important historical event because it transformed agrarian societies into industrial ones, revolutionizing economy, technology, and lifestyles globally."),
            zh = LocalizedContent("最重要的历史事件是什么？", listOf("法国大革命", "工业革命", "发现美洲", "俄国革命"), "历史", "工业革命通常被认为是最重要的历史事件，因为它将农业社会转变为工业社会，彻底改变了全球的经济、技术和生活方式。"),
            es = LocalizedContent("¿Cuál es el evento histórico más importante?", listOf("Revolución Francesa", "Revolución Industrial", "Descubrimiento de América", "Revolución Rusa"), "Historia", "La Revolución Industrial a menudo se considera el evento histórico más importante porque transformó las sociedades agrarias en industriales, revolucionando la economía, la tecnología y los estilos de vida a nivel mundial.")
        ),
        BilingualQuestion(
            id = 51562, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le domaine scientifique le plus avancé?", listOf("Physique quantique", "Génétique", "Astronomie", "Intelligence Artificielle"), "Science", "L'intelligence artificielle est considérée comme le domaine scientifique le plus avancé en raison de ses percées récentes en apprentissage profond et en traitement de données massives."),
            en = LocalizedContent("What is the most advanced scientific field?", listOf("Quantum physics", "Genetics", "Astronomy", "Artificial Intelligence"), "Science", "Artificial intelligence is considered the most advanced scientific field due to its recent breakthroughs in deep learning and big data processing."),
            zh = LocalizedContent("最先进的科学领域是什么？", listOf("量子物理", "遗传学", "天文学", "人工智能"), "科学", "人工智能因其在深度学习和海量数据处理方面的最新突破而被认为是最先进的科学领域。"),
            es = LocalizedContent("¿Cuál es el campo científico más avanzado?", listOf("Física cuántica", "Genética", "Astronomía", "Inteligencia Artificial"), "Ciencia", "La inteligencia artificial se considera el campo científico más avanzado debido a sus recientes avances en aprendizaje profundo y procesamiento de datos masivos.")
        ),
        BilingualQuestion(
            id = 51563, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le continent le plus peuplé?", listOf("Afrique", "Asie", "Europe", "Amérique"), "Géographie", "L'Asie est le continent le plus peuplé car il abrite plus de 4,7 milliards d'habitants, soit environ 60 % de la population mondiale totale."),
            en = LocalizedContent("What is the most populous continent?", listOf("Africa", "Asia", "Europe", "America"), "Geography", "Asia is the most populous continent as it is home to over 4.7 billion people, about 60% of the world's total population."),
            zh = LocalizedContent("人口最多的大洲是什么？", listOf("非洲", "亚洲", "欧洲", "美洲"), "地理", "亚洲是人口最多的大洲，拥有超过47亿人口，约占世界总人口的60%。"),
            es = LocalizedContent("¿Cuál es el continente más poblado?", listOf("África", "Asia", "Europa", "América"), "Geografía", "Asia es el continente más poblado, ya que alberga a más de 4.700 millones de personas, aproximadamente el 60% de la población mundial total.")
        ),
        BilingualQuestion(
            id = 51564, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel sport a le plus de licences en France?", listOf("Football", "Tennis", "Équitation", "Natation"), "Sport", "Le football est le sport comptant le plus de licenciés en France, avec plus de 2 millions de pratiquants, devant le tennis et le basket."),
            en = LocalizedContent("Which sport has the most licenses in France?", listOf("Football", "Tennis", "Equestrian", "Swimming"), "Sports", "Football is the sport with the most licensed players in France, with over 2 million participants, ahead of tennis and basketball."),
            zh = LocalizedContent("法国哪个运动项目的注册人数最多？", listOf("足球", "网球", "马术", "游泳"), "体育", "足球是法国注册人数最多的运动项目，拥有超过200万参与者，领先于网球和篮球。"),
            es = LocalizedContent("¿Qué deporte tiene más licencias en Francia?", listOf("Fútbol", "Tenis", "Equitación", "Natación"), "Deportes", "El fútbol es el deporte con más licencias en Francia, con más de 2 millones de practicantes, por delante del tenis y el baloncesto.")
        ),
        BilingualQuestion(
            id = 51565, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le basketball féminin WNBA a-t-il été créé?", listOf("1996", "1997", "2000", "2001"), "Sport", "La WNBA a été fondée en 1996 et a débuté sa première saison en 1997, et non en 2000."),
            en = LocalizedContent("In what year was the WNBA women's basketball league created?", listOf("1996", "1997", "2000", "2001"), "Sports", "The WNBA was founded in 1996 and began its first season in 1997, not in 2000."),
            zh = LocalizedContent("WNBA女子篮球联赛成立于哪一年？", listOf("1996", "1997", "2000", "2001"), "体育", "WNBA成立于1996年，并于1997年开始首个赛季，而非2000年。"),
            es = LocalizedContent("¿En qué año se creó la liga de baloncesto femenino WNBA?", listOf("1996", "1997", "2000", "2001"), "Deportes", "La WNBA se fundó en 1996 y comenzó su primera temporada en 1997, no en 2000.")
        ),
        BilingualQuestion(
            id = 51566, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le genre de film avec la plus grande audience?", listOf("Action", "Animation", "Comédie", "Superhéros"), "Cinéma", "Les films de superhéros dominent le box-office mondial depuis les années 2010, portés par les franchises Marvel et DC, avec des recettes records comme Avengers: Endgame."),
            en = LocalizedContent("Which film genre has the largest audience?", listOf("Action", "Animation", "Comedy", "Superhero"), "Cinema", "Superhero films have dominated the global box office since the 2010s, driven by Marvel and DC franchises, with record earnings like Avengers: Endgame."),
            zh = LocalizedContent("哪种电影类型的观众最多？", listOf("动作片", "动画片", "喜剧片", "超级英雄片"), "电影", "自2010年代以来，超级英雄电影凭借漫威和DC系列主导全球票房，创下如《复仇者联盟4：终局之战》等纪录。"),
            es = LocalizedContent("¿Qué género de película tiene la mayor audiencia?", listOf("Acción", "Animación", "Comedia", "Superhéroes"), "Cine", "Las películas de superhéroes dominan la taquilla mundial desde la década de 2010, impulsadas por las franquicias de Marvel y DC, con ingresos récord como Avengers: Endgame.")
        ),
        BilingualQuestion(
            id = 51567, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concert le plus regardé au monde?", listOf("Live Aid", "Live 8", "Woodstock", "Super Bowl Halftime"), "Musique", "Organisé en 1985 par Bob Geldof et Midge Ure, le Live Aid rassembla des artistes comme Queen et U2 pour lutter contre la famine en Éthiopie, attirant une audience télévisée mondiale record estimée à 1,9 milliard de personnes."),
            en = LocalizedContent("What is the most watched concert in the world?", listOf("Live Aid", "Live 8", "Woodstock", "Super Bowl Halftime"), "Music", "Organized in 1985 by Bob Geldof and Midge Ure, Live Aid brought together artists like Queen and U2 to fight famine in Ethiopia, attracting a record global television audience estimated at 1.9 billion people."),
            zh = LocalizedContent("世界上观看人数最多的演唱会是什么？", listOf("Live Aid", "Live 8", "伍德斯托克", "超级碗中场秀"), "音乐", "1985年由鲍勃·吉尔道夫和米奇·尤尔组织的Live Aid，汇集了皇后乐队和U2等艺术家，旨在抗击埃塞俄比亚饥荒，吸引了估计19亿人的全球电视观众纪录。"),
            es = LocalizedContent("¿Cuál es el concierto más visto del mundo?", listOf("Live Aid", "Live 8", "Woodstock", "Super Bowl Halftime"), "Música", "Organizado en 1985 por Bob Geldof y Midge Ure, Live Aid reunió a artistas como Queen y U2 para luchar contra la hambruna en Etiopía, atrayendo una audiencia televisiva mundial récord estimada en 1.900 millones de personas.")
        ),
        BilingualQuestion(
            id = 51568, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le site web le plus visité du monde?", listOf("Facebook", "YouTube", "Google", "Wikipedia"), "Culture", "Google domine le trafic mondial grâce à son moteur de recherche, ses services comme Gmail et YouTube, et son utilisation massive sur mobile et ordinateur."),
            en = LocalizedContent("What is the most visited website in the world?", listOf("Facebook", "YouTube", "Google", "Wikipedia"), "Culture", "Google dominates global traffic thanks to its search engine, services like Gmail and YouTube, and its massive use on mobile and desktop."),
            zh = LocalizedContent("世界上访问量最大的网站是什么？", listOf("Facebook", "YouTube", "Google", "Wikipedia"), "文化", "谷歌凭借其搜索引擎、Gmail和YouTube等服务，以及在移动和桌面设备上的广泛使用，主导了全球流量。"),
            es = LocalizedContent("¿Cuál es el sitio web más visitado del mundo?", listOf("Facebook", "YouTube", "Google", "Wikipedia"), "Cultura", "Google domina el tráfico mundial gracias a su motor de búsqueda, servicios como Gmail y YouTube, y su uso masivo en móviles y ordenadores.")
        ),
        BilingualQuestion(
            id = 51569, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux monument du monde?", listOf("Giza", "Angkor Wat", "Stonehenge", "Pyramid of Djoser"), "Histoire", "La pyramide de Djoser, construite vers 2630 av. J.-C. à Saqqarah en Égypte, est considérée comme le plus ancien monument en pierre de grande taille au monde."),
            en = LocalizedContent("What is the oldest monument in the world?", listOf("Giza", "Angkor Wat", "Stonehenge", "Pyramid of Djoser"), "History", "The Pyramid of Djoser, built around 2630 BC in Saqqara, Egypt, is considered the world's oldest large-scale stone monument."),
            zh = LocalizedContent("世界上最古老的纪念碑是什么？", listOf("吉萨金字塔", "吴哥窟", "巨石阵", "左塞尔金字塔"), "历史", "左塞尔金字塔建于公元前2630年左右，位于埃及萨卡拉，被认为是世界上最古老的大型石制纪念碑。"),
            es = LocalizedContent("¿Cuál es el monumento más antiguo del mundo?", listOf("Giza", "Angkor Wat", "Stonehenge", "Pirámide de Djoser"), "Historia", "La Pirámide de Djoser, construida alrededor del 2630 a.C. en Saqqara, Egipto, es considerada el monumento de piedra a gran escala más antiguo del mundo.")
        ),
        BilingualQuestion(
            id = 51570, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand défi scientifique actuel?", listOf("Cancer", "Réchauffement climatique", "Fusion nucléaire", "IA superintelligence"), "Science", "La fusion nucléaire est le plus grand défi car elle promet une énergie quasi illimitée et propre, mais sa maîtrise nécessite de reproduire les conditions extrêmes du Soleil, ce qui reste techniquement très complexe."),
            en = LocalizedContent("What is the biggest current scientific challenge?", listOf("Cancer", "Climate change", "Nuclear fusion", "Superintelligent AI"), "Science", "Nuclear fusion is the biggest challenge because it promises nearly unlimited clean energy, but mastering it requires replicating the extreme conditions of the Sun, which remains technically very complex."),
            zh = LocalizedContent("当前最大的科学挑战是什么？", listOf("癌症", "气候变化", "核聚变", "超级人工智能"), "科学", "核聚变是最大的挑战，因为它承诺提供几乎无限且清洁的能源，但掌握它需要复制太阳的极端条件，这在技术上仍然非常复杂。"),
            es = LocalizedContent("¿Cuál es el mayor desafío científico actual?", listOf("Cáncer", "Cambio climático", "Fusión nuclear", "IA superinteligente"), "Ciencia", "La fusión nuclear es el mayor desafío porque promete energía limpia casi ilimitada, pero dominarla requiere replicar las condiciones extremas del Sol, lo que sigue siendo técnicamente muy complejo.")
        ),
        BilingualQuestion(
            id = 51572, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le sport collectif avec le plus de joueurs?", listOf("Football", "Basketball", "Rugby", "Futsal"), "Sport", "Le football est le sport collectif le plus pratiqué au monde, avec 11 joueurs par équipe sur le terrain, soit 22 au total, ce qui en fait le nombre le plus élevé parmi les sports d'équipe courants."),
            en = LocalizedContent("Which team sport has the most players?", listOf("Football", "Basketball", "Rugby", "Futsal"), "Sports", "Football is the most practiced team sport in the world, with 11 players per team on the field, totaling 22, which is the highest number among common team sports."),
            zh = LocalizedContent("哪种团队运动的球员人数最多？", listOf("足球", "篮球", "橄榄球", "五人制足球"), "体育", "足球是世界上参与人数最多的团队运动，每队11名球员上场，共22人，这是常见团队运动中最高的数字。"),
            es = LocalizedContent("¿Qué deporte de equipo tiene más jugadores?", listOf("Fútbol", "Baloncesto", "Rugby", "Futsal"), "Deportes", "El fútbol es el deporte de equipo más practicado del mundo, con 11 jugadores por equipo en el campo, totalizando 22, lo que es el número más alto entre los deportes de equipo comunes.")
        ),
        BilingualQuestion(
            id = 51573, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Billie Jean King a-t-elle jouée contre Bobby Riggs?", listOf("1973", "1974", "1975", "1976"), "Sport", "Billie Jean King a battu Bobby Riggs lors du \"Match du siècle\" le 20 septembre 1973, un événement médiatique majeur pour le tennis féminin."),
            en = LocalizedContent("In what year did Billie Jean King play against Bobby Riggs?", listOf("1973", "1974", "1975", "1976"), "Sports", "Billie Jean King defeated Bobby Riggs in the \"Match of the Century\" on September 20, 1973, a major media event for women's tennis."),
            zh = LocalizedContent("比莉·简·金在哪一年与鲍比·里格斯比赛？", listOf("1973", "1974", "1975", "1976"), "体育", "比莉·简·金在1973年9月20日的“世纪之战”中击败了鲍比·里格斯，这是女子网球的一次重大媒体事件。"),
            es = LocalizedContent("¿En qué año jugó Billie Jean King contra Bobby Riggs?", listOf("1973", "1974", "1975", "1976"), "Deportes", "Billie Jean King derrotó a Bobby Riggs en el \"Partido del Siglo\" el 20 de septiembre de 1973, un importante evento mediático para el tenis femenino.")
        ),
        BilingualQuestion(
            id = 51574, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand studio cinématographique?", listOf("Universal", "Disney", "Warner Bros", "Paramount"), "Cinéma", "Disney est le plus grand studio cinématographique en termes de revenus et de part de marché, notamment grâce à ses acquisitions de Marvel, Lucasfilm et 20th Century Fox."),
            en = LocalizedContent("What is the largest film studio?", listOf("Universal", "Disney", "Warner Bros", "Paramount"), "Cinema", "Disney is the largest film studio in terms of revenue and market share, especially thanks to its acquisitions of Marvel, Lucasfilm, and 20th Century Fox."),
            zh = LocalizedContent("最大的电影制片厂是哪个？", listOf("环球影业", "迪士尼", "华纳兄弟", "派拉蒙"), "电影", "迪士尼是收入和市场份额最大的电影制片厂，尤其得益于其对漫威、卢卡斯影业和20世纪福克斯的收购。"),
            es = LocalizedContent("¿Cuál es el estudio cinematográfico más grande?", listOf("Universal", "Disney", "Warner Bros", "Paramount"), "Cine", "Disney es el estudio cinematográfico más grande en términos de ingresos y cuota de mercado, especialmente gracias a sus adquisiciones de Marvel, Lucasfilm y 20th Century Fox.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51575, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le meilleur album de tous les temps selon Rolling Stone?", listOf("The Dark Side of the Moon", "Sgt. Pepper", "Revolver", "Abbey Road"), "Musique", "En 2023, Rolling Stone a placé \"Revolver\" des Beatles en tête de son classement des 500 meilleurs albums de tous les temps."),
            en = LocalizedContent("What is the best album of all time according to Rolling Stone?", listOf("The Dark Side of the Moon", "Sgt. Pepper", "Revolver", "Abbey Road"), "Music", "In 2023, Rolling Stone placed The Beatles' \"Revolver\" at the top of its list of the 500 greatest albums of all time."),
            zh = LocalizedContent("根据《滚石》杂志评选，有史以来最伟大的专辑是哪张？", listOf("The Dark Side of the Moon", "Sgt. Pepper", "Revolver", "Abbey Road"), "音乐", "2023年，《滚石》杂志将披头士的《Revolver》列为史上最伟大500张专辑之首。"),
            es = LocalizedContent("¿Cuál es el mejor álbum de todos los tiempos según Rolling Stone?", listOf("The Dark Side of the Moon", "Sgt. Pepper", "Revolver", "Abbey Road"), "Musica", "En 2023, Rolling Stone colocó \"Revolver\" de The Beatles en la cima de su lista de los 500 mejores álbumes de todos los tiempos.")
        ),
        BilingualQuestion(
            id = 51576, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel jeu vidéo détient le record du plus haut score jamais atteint?", listOf("Pac-Man", "Donkey Kong", "Space Invaders", "Tetris"), "Tech", "Le record du plus haut score à Pac-Man a été établi en 1999 par Billy Mitchell, atteignant 3 333 360 points, un score parfait qui nécessite de manger tous les points, fruits et fantômes sans perdre une seule vie. Ce record est resté légendaire dans l'histoire du jeu vidéo."),
            en = LocalizedContent("Which video game holds the record for the highest score ever achieved?", listOf("Pac-Man", "Donkey Kong", "Space Invaders", "Tetris"), "Technology", "The highest score record in Pac-Man was set in 1999 by Billy Mitchell, reaching 3,333,360 points, a perfect score that requires eating all dots, fruits, and ghosts without losing a single life. This record remains legendary in video game history."),
            zh = LocalizedContent("哪款电子游戏保持着有史以来最高分的记录？", listOf("Pac-Man", "Donkey Kong", "Space Invaders", "Tetris"), "科技", "Pac-Man的最高分记录由比利·米切尔于1999年创造，达到3,333,360分，这是一个完美分数，需要吃掉所有豆子、水果和幽灵且不失去任何一条命。这一记录在电子游戏史上堪称传奇。"),
            es = LocalizedContent("¿Qué videojuego ostenta el récord de la puntuación más alta jamás alcanzada?", listOf("Pac-Man", "Donkey Kong", "Space Invaders", "Tetris"), "Tecnologia", "El récord de puntuación más alta en Pac-Man fue establecido en 1999 por Billy Mitchell, alcanzando 3,333,360 puntos, una puntuación perfecta que requiere comer todos los puntos, frutas y fantasmas sin perder una sola vida. Este récord sigue siendo legendario en la historia de los videojuegos.")
        ),
        BilingualQuestion(
            id = 51578, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le vrai nom de Snapchat avant son lancement?", listOf("PicChat", "Picaboo", "PhotoSnap", "ImageShare"), "Tech", "Snapchat s'appelait initialement PhotoSnap lors de sa création en 2011 par Evan Spiegel, Bobby Murphy et Reggie Brown, avant d'être renommé pour son lancement officiel."),
            en = LocalizedContent("What was Snapchat's real name before its launch?", listOf("PicChat", "Picaboo", "PhotoSnap", "ImageShare"), "Technology", "Snapchat was originally called PhotoSnap when it was created in 2011 by Evan Spiegel, Bobby Murphy, and Reggie Brown, before being renamed for its official launch."),
            zh = LocalizedContent("Snapchat在发布前的原名是什么？", listOf("PicChat", "Picaboo", "PhotoSnap", "ImageShare"), "科技", "Snapchat最初由埃文·斯皮格尔、鲍比·墨菲和雷吉·布朗于2011年创建时名为PhotoSnap，后在正式发布前更名。"),
            es = LocalizedContent("¿Cuál era el nombre real de Snapchat antes de su lanzamiento?", listOf("PicChat", "Picaboo", "PhotoSnap", "ImageShare"), "Tecnologia", "Snapchat se llamaba originalmente PhotoSnap cuando fue creado en 2011 por Evan Spiegel, Bobby Murphy y Reggie Brown, antes de ser renombrado para su lanzamiento oficial.")
        ),
        BilingualQuestion(
            id = 51579, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de fois par seconde un processeur moderne peut-il effectuer des opérations?", listOf("Des millions", "Des milliards", "Des milliers", "Des centaines"), "Tech", "Les processeurs modernes ont des fréquences d'horloge de plusieurs gigahertz, ce qui signifie qu'ils peuvent exécuter des milliards de cycles par seconde, donc des centaines de millions d'opérations."),
            en = LocalizedContent("How many operations per second can a modern processor perform?", listOf("Millions", "Billions", "Thousands", "Hundreds"), "Technology", "Modern processors have clock speeds of several gigahertz, meaning they can execute billions of cycles per second, thus hundreds of millions of operations."),
            zh = LocalizedContent("现代处理器每秒能执行多少次操作？", listOf("数百万", "数十亿", "数千", "数百"), "科技", "现代处理器的时钟频率达到数GHz，意味着每秒可执行数十亿个周期，因此可执行数亿次操作。"),
            es = LocalizedContent("¿Cuántas operaciones por segundo puede realizar un procesador moderno?", listOf("Millones", "Miles de millones", "Miles", "Cientos"), "Tecnologia", "Los procesadores modernos tienen frecuencias de reloj de varios gigahercios, lo que significa que pueden ejecutar miles de millones de ciclos por segundo, por lo tanto, cientos de millones de operaciones.")
        ),
        BilingualQuestion(
            id = 51580, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel ancien ingénieur Google a cofondé DeepMind?", listOf("Demis Hassabis", "Sergey Brin", "Eric Schmidt", "Larry Page"), "Tech", "Demis Hassabis, ancien ingénieur chez Google, a cofondé DeepMind en 2010 avant son rachat par Google en 2014."),
            en = LocalizedContent("Which former Google engineer co-founded DeepMind?", listOf("Demis Hassabis", "Sergey Brin", "Eric Schmidt", "Larry Page"), "Technology", "Demis Hassabis, a former engineer at Google, co-founded DeepMind in 2010 before its acquisition by Google in 2014."),
            zh = LocalizedContent("哪位前谷歌工程师共同创立了DeepMind？", listOf("德米斯·哈萨比斯", "谢尔盖·布林", "埃里克·施密特", "拉里·佩奇"), "科技", "德米斯·哈萨比斯，前谷歌工程师，于2010年共同创立了DeepMind，后于2014年被谷歌收购。"),
            es = LocalizedContent("¿Qué ex ingeniero de Google cofundó DeepMind?", listOf("Demis Hassabis", "Sergey Brin", "Eric Schmidt", "Larry Page"), "Tecnologia", "Demis Hassabis, ex ingeniero de Google, cofundó DeepMind en 2010 antes de su adquisición por Google en 2014.")
        ),
        BilingualQuestion(
            id = 51581, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'ancêtre direct du World Wide Web?", listOf("Usenet", "ARPANET", "Gopher", "Telnet"), "Tech", "ARPANET, développé par le département de la Défense américain dans les années 1960, fut le premier réseau à utiliser la commutation de paquets, posant les bases techniques et conceptuelles du World Wide Web."),
            en = LocalizedContent("What is the direct ancestor of the World Wide Web?", listOf("Usenet", "ARPANET", "Gopher", "Telnet"), "Technology", "ARPANET, developed by the US Department of Defense in the 1960s, was the first network to use packet switching, laying the technical and conceptual foundations for the World Wide Web."),
            zh = LocalizedContent("万维网的直接前身是什么？", listOf("Usenet", "ARPANET", "Gopher", "Telnet"), "科技", "ARPANET由美国国防部在20世纪60年代开发，是第一个使用分组交换的网络，为万维网奠定了技术和概念基础。"),
            es = LocalizedContent("¿Cuál es el antepasado directo de la World Wide Web?", listOf("Usenet", "ARPANET", "Gopher", "Telnet"), "Tecnologia", "ARPANET, desarrollado por el Departamento de Defensa de EE. UU. en la década de 1960, fue la primera red en utilizar conmutación de paquetes, sentando las bases técnicas y conceptuales de la World Wide Web.")
        ),
        BilingualQuestion(
            id = 51582, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le premier message SMS commercial a-t-il été envoyé?", listOf("1992", "1995", "1998", "2001"), "Tech", "Le premier SMS commercial a été envoyé en 1998 par un opérateur finlandais, marquant le début de la messagerie textuelle grand public."),
            en = LocalizedContent("In what year was the first commercial SMS message sent?", listOf("1992", "1995", "1998", "2001"), "Technology", "The first commercial SMS was sent in 1998 by a Finnish operator, marking the beginning of mainstream text messaging."),
            zh = LocalizedContent("第一条商业短信是在哪一年发送的？", listOf("1992", "1995", "1998", "2001"), "科技", "第一条商业短信于1998年由一家芬兰运营商发送，标志着短信服务进入大众市场。"),
            es = LocalizedContent("¿En qué año se envió el primer mensaje SMS comercial?", listOf("1992", "1995", "1998", "2001"), "Tecnologia", "El primer SMS comercial se envió en 1998 por un operador finlandés, marcando el inicio de la mensajería de texto para el público general.")
        ),
        BilingualQuestion(
            id = 51583, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage de programmation est devenu open-source en premier?", listOf("Python", "Java", "Perl", "C++"), "Tech", "C++ a été rendu open-source en 2005, tandis que Java ne l'est devenu qu'en 2006 et Python en 2001, mais C++ a précédé ces deux derniers en termes de standardisation ouverte."),
            en = LocalizedContent("Which programming language became open-source first?", listOf("Python", "Java", "Perl", "C++"), "Technology", "C++ was made open-source in 2005, while Java only became open-source in 2006 and Python in 2001, but C++ preceded these in terms of open standardization."),
            zh = LocalizedContent("哪种编程语言最先成为开源？", listOf("Python", "Java", "Perl", "C++"), "科技", "C++于2005年开源，而Java在2006年才开源，Python在2001年开源，但C++在开放标准化方面更早。"),
            es = LocalizedContent("¿Qué lenguaje de programación se convirtió en código abierto primero?", listOf("Python", "Java", "Perl", "C++"), "Tecnologia", "C++ se hizo de código abierto en 2005, mientras que Java no lo fue hasta 2006 y Python en 2001, pero C++ precedió a estos en términos de estandarización abierta.")
        ),
        BilingualQuestion(
            id = 51584, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de transistors le premier microprocesseur Intel contenait-il?", listOf("100", "1000", "2300", "10000"), "Tech", "Lancé en 1971, l'Intel 4004, premier microprocesseur commercial, intégrait environ 2 300 transistors."),
            en = LocalizedContent("How many transistors did the first Intel microprocessor contain?", listOf("100", "1000", "2300", "10000"), "Technology", "Launched in 1971, the Intel 4004, the first commercial microprocessor, integrated approximately 2,300 transistors."),
            zh = LocalizedContent("第一款英特尔微处理器包含多少个晶体管？", listOf("100", "1000", "2300", "10000"), "科技", "1971年推出的Intel 4004，作为第一款商用微处理器，集成了约2300个晶体管。"),
            es = LocalizedContent("¿Cuántos transistores contenía el primer microprocesador de Intel?", listOf("100", "1000", "2300", "10000"), "Tecnologia", "Lanzado en 1971, el Intel 4004, el primer microprocesador comercial, integraba aproximadamente 2.300 transistores.")
        ),
        BilingualQuestion(
            id = 51585, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel robot a remporté Jeopardy contre les meilleurs champions humains?", listOf("WALL-E", "Watson", "Sophia", "GPT"), "Tech", "Watson, développé par IBM, a battu les champions Ken Jennings et Brad Rutter en 2011 grâce à sa capacité à comprendre le langage naturel et à trouver des réponses en une fraction de seconde."),
            en = LocalizedContent("Which robot won Jeopardy against the best human champions?", listOf("WALL-E", "Watson", "Sophia", "GPT"), "Technology", "Watson, developed by IBM, defeated champions Ken Jennings and Brad Rutter in 2011 thanks to its ability to understand natural language and find answers in a fraction of a second."),
            zh = LocalizedContent("哪个机器人在《危险边缘》中击败了最优秀的人类冠军？", listOf("WALL-E", "Watson", "Sophia", "GPT"), "科技", "由IBM开发的Watson在2011年击败了冠军肯·詹宁斯和布拉德·鲁特，这得益于其理解自然语言并在瞬间找到答案的能力。"),
            es = LocalizedContent("¿Qué robot ganó Jeopardy contra los mejores campeones humanos?", listOf("WALL-E", "Watson", "Sophia", "GPT"), "Tecnologia", "Watson, desarrollado por IBM, derrotó a los campeones Ken Jennings y Brad Rutter en 2011 gracias a su capacidad para entender el lenguaje natural y encontrar respuestas en una fracción de segundo.")
        ),
        BilingualQuestion(
            id = 51586, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Bitcoin a-t-il été créé?", listOf("2007", "2008", "2009", "2010"), "Tech", "Le Bitcoin a été créé en 2009 par une personne ou un groupe sous le pseudonyme de Satoshi Nakamoto, marquant le début de la première cryptomonnaie décentralisée."),
            en = LocalizedContent("In which year was Bitcoin created?", listOf("2007", "2008", "2009", "2010"), "Technology", "Bitcoin was created in 2009 by a person or group under the pseudonym Satoshi Nakamoto, marking the beginning of the first decentralized cryptocurrency."),
            zh = LocalizedContent("比特币是哪一年创建的？", listOf("2007", "2008", "2009", "2010"), "科技", "比特币于2009年由化名为中本聪的个人或团体创建，标志着第一种去中心化加密货币的诞生。"),
            es = LocalizedContent("¿En qué año se creó Bitcoin?", listOf("2007", "2008", "2009", "2010"), "Tecnología", "Bitcoin fue creado en 2009 por una persona o grupo bajo el seudónimo de Satoshi Nakamoto, marcando el inicio de la primera criptomoneda descentralizada.")
        ),
        BilingualQuestion(
            id = 51587, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le langage de programmation le plus ancien encore activement utilisé?", listOf("COBOL", "FORTRAN", "Lisp", "Algol"), "Tech", "Algol, créé en 1958, a influencé de nombreux langages modernes comme C et Java, et reste utilisé dans l'éducation et la recherche en algorithmique."),
            en = LocalizedContent("What is the oldest programming language still actively used?", listOf("COBOL", "FORTRAN", "Lisp", "Algol"), "Technology", "Algol, created in 1958, influenced many modern languages like C and Java, and remains used in education and algorithm research."),
            zh = LocalizedContent("哪种编程语言是最古老且仍在活跃使用的？", listOf("COBOL", "FORTRAN", "Lisp", "Algol"), "科技", "Algol创建于1958年，影响了C和Java等许多现代语言，并仍在教育和算法研究中使用。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación más antiguo que todavía se usa activamente?", listOf("COBOL", "FORTRAN", "Lisp", "Algol"), "Tecnología", "Algol, creado en 1958, influyó en muchos lenguajes modernos como C y Java, y sigue utilizándose en educación e investigación algorítmica.")
        ),
        BilingualQuestion(
            id = 51588, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de temps a duré la première appel vidéo VoIP du monde?", listOf("1 seconde", "30 secondes", "5 minutes", "1 minute"), "Tech", "La première démonstration de VoIP a été réalisée en 1973 par Danny Cohen, mais la première véritable appel vidéo VoIP a duré une seconde car elle servait uniquement à tester la transmission de données vocales et vidéo en paquets."),
            en = LocalizedContent("How long did the world's first VoIP video call last?", listOf("1 second", "30 seconds", "5 minutes", "1 minute"), "Technology", "The first VoIP demonstration was in 1973 by Danny Cohen, but the first true VoIP video call lasted one second as it only served to test packet transmission of voice and video data."),
            zh = LocalizedContent("世界上第一个VoIP视频通话持续了多长时间？", listOf("1秒", "30秒", "5分钟", "1分钟"), "科技", "第一次VoIP演示于1973年由Danny Cohen完成，但第一个真正的VoIP视频通话只持续了一秒，因为它仅用于测试语音和视频数据的分组传输。"),
            es = LocalizedContent("¿Cuánto duró la primera videollamada VoIP del mundo?", listOf("1 segundo", "30 segundos", "5 minutos", "1 minuto"), "Tecnología", "La primera demostración de VoIP fue realizada en 1973 por Danny Cohen, pero la primera videollamada VoIP real duró un segundo, ya que solo servía para probar la transmisión de datos de voz y video en paquetes.")
        ),
        BilingualQuestion(
            id = 51589, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le navigateur web le plus ancien toujours en utilisation?", listOf("Firefox", "Opera", "Safari", "Internet Explorer"), "Tech", "Opera, lancé en 1995, est le navigateur web le plus ancien encore activement développé et utilisé, bien avant Chrome ou Firefox."),
            en = LocalizedContent("What is the oldest web browser still in use?", listOf("Firefox", "Opera", "Safari", "Internet Explorer"), "Technology", "Opera, launched in 1995, is the oldest web browser still actively developed and used, well before Chrome or Firefox."),
            zh = LocalizedContent("哪种网络浏览器是最古老且仍在使用的？", listOf("Firefox", "Opera", "Safari", "Internet Explorer"), "科技", "Opera于1995年推出，是仍在积极开发和使用的最古老网络浏览器，远早于Chrome或Firefox。"),
            es = LocalizedContent("¿Cuál es el navegador web más antiguo que todavía se usa?", listOf("Firefox", "Opera", "Safari", "Internet Explorer"), "Tecnología", "Opera, lanzado en 1995, es el navegador web más antiguo que aún se desarrolla y utiliza activamente, mucho antes que Chrome o Firefox.")
        ),
        BilingualQuestion(
            id = 51590, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la première webcam a-t-elle été créée?", listOf("1990", "1991", "1993", "1995"), "Tech", "La première webcam a été créée en 1993 par des chercheurs de l'université de Cambridge pour surveiller une machine à café."),
            en = LocalizedContent("In which year was the first webcam created?", listOf("1990", "1991", "1993", "1995"), "Technology", "The first webcam was created in 1993 by researchers at the University of Cambridge to monitor a coffee machine."),
            zh = LocalizedContent("第一台网络摄像头是哪一年创建的？", listOf("1990", "1991", "1993", "1995"), "科技", "第一台网络摄像头于1993年由剑桥大学的研究人员创建，用于监控一台咖啡机。"),
            es = LocalizedContent("¿En qué año se creó la primera webcam?", listOf("1990", "1991", "1993", "1995"), "Tecnología", "La primera webcam fue creada en 1993 por investigadores de la Universidad de Cambridge para monitorear una máquina de café.")
        ),
        BilingualQuestion(
            id = 51591, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel mème internet est devenu viral en 2010?", listOf("Doge", "Bad Luck Brian", "Gangnam Style", "Harambe"), "Tech", "Harambe est un gorille abattu au zoo de Cincinnati en 2016, et non en 2010. Son image est devenue un mème viral des années plus tard, souvent utilisé dans des mèmes ironiques ou pour protester."),
            en = LocalizedContent("Which internet meme went viral in 2010?", listOf("Doge", "Bad Luck Brian", "Gangnam Style", "Harambe"), "Technology", "Harambe is a gorilla shot at the Cincinnati Zoo in 2016, not 2010. His image became a viral meme years later, often used in ironic memes or for protest."),
            zh = LocalizedContent("哪个网络迷因在2010年走红？", listOf("Doge", "Bad Luck Brian", "Gangnam Style", "Harambe"), "科技", "Harambe是2016年在辛辛那提动物园被射杀的大猩猩，而非2010年。他的形象在多年后成为病毒式迷因，常用于讽刺或抗议。"),
            es = LocalizedContent("¿Qué meme de internet se volvió viral en 2010?", listOf("Doge", "Bad Luck Brian", "Gangnam Style", "Harambe"), "Tecnología", "Harambe es un gorila abatido en el zoológico de Cincinnati en 2016, no en 2010. Su imagen se convirtió en un meme viral años después, a menudo usado en memes irónicos o para protestar.")
        ),
        BilingualQuestion(
            id = 51592, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'emoji le plus utilisé au monde?", listOf("😂", "❤️", "🔥", "👍"), "Tech", "😂 est l'emoji le plus utilisé mondialement selon le Consortium Unicode, représentant la joie et l'humour dans les conversations numériques."),
            en = LocalizedContent("What is the most used emoji in the world?", listOf("😂", "❤️", "🔥", "👍"), "Technology", "😂 is the most used emoji worldwide according to the Unicode Consortium, representing joy and humor in digital conversations."),
            zh = LocalizedContent("世界上使用最多的表情符号是什么？", listOf("😂", "❤️", "🔥", "👍"), "科技", "根据Unicode联盟的数据，😂是全球使用最多的表情符号，代表数字对话中的喜悦和幽默。"),
            es = LocalizedContent("¿Cuál es el emoji más usado en el mundo?", listOf("😂", "❤️", "🔥", "👍"), "Tecnología", "😂 es el emoji más utilizado en todo el mundo según el Consorcio Unicode, representando alegría y humor en las conversaciones digitales.")
        ),
        BilingualQuestion(
            id = 51593, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année TikTok a-t-il été lancé internationalement?", listOf("2016", "2017", "2018", "2019"), "Tech", "TikTok a été lancé internationalement en 2017 après la fusion de l'application chinoise Douyin et de l'application musicale musical.ly, acquise par ByteDance."),
            en = LocalizedContent("In which year was TikTok launched internationally?", listOf("2016", "2017", "2018", "2019"), "Technology", "TikTok was launched internationally in 2017 after the merger of the Chinese app Douyin and the musical app musical.ly, acquired by ByteDance."),
            zh = LocalizedContent("TikTok是哪一年在国际上推出的？", listOf("2016", "2017", "2018", "2019"), "科技", "TikTok于2017年在国际上推出，此前中国应用抖音与音乐应用musical.ly合并，由字节跳动收购。"),
            es = LocalizedContent("¿En qué año se lanzó TikTok internacionalmente?", listOf("2016", "2017", "2018", "2019"), "Tecnología", "TikTok se lanzó internacionalmente en 2017 tras la fusión de la aplicación china Douyin y la aplicación musical musical.ly, adquirida por ByteDance.")
        ),
        BilingualQuestion(
            id = 51594, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel appareil a été le premier téléphone mobile jamais vendu?", listOf("Motorola DynaTAC", "IBM Simon", "Nokia 3310", "Blackberry"), "Tech", "Le premier téléphone mobile commercialisé est le Motorola DynaTAC 8000X en 1983, bien avant le Nokia 3310 sorti en 2000."),
            en = LocalizedContent("Which device was the first mobile phone ever sold?", listOf("Motorola DynaTAC", "IBM Simon", "Nokia 3310", "Blackberry"), "Technology", "The first commercially sold mobile phone is the Motorola DynaTAC 8000X in 1983, well before the Nokia 3310 released in 2000."),
            zh = LocalizedContent("哪款设备是第一款售出的手机？", listOf("摩托罗拉DynaTAC", "IBM Simon", "诺基亚3310", "黑莓"), "科技", "第一款商业销售的手机是1983年的摩托罗拉DynaTAC 8000X，远早于2000年发布的诺基亚3310。"),
            es = LocalizedContent("¿Qué dispositivo fue el primer teléfono móvil vendido?", listOf("Motorola DynaTAC", "IBM Simon", "Nokia 3310", "Blackberry"), "Tecnología", "El primer teléfono móvil comercializado es el Motorola DynaTAC 8000X en 1983, mucho antes del Nokia 3310 lanzado en 2000.")
        ),
        BilingualQuestion(
            id = 51595, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de lignes de code contient Windows XP?", listOf("10 millions", "25 millions", "50 millions", "100 millions"), "Tech", "Windows XP, lancé en 2001, est un système d'exploitation majeur de Microsoft dont le code source comptait environ 100 millions de lignes, reflétant sa complexité technique pour l'époque."),
            en = LocalizedContent("How many lines of code does Windows XP contain?", listOf("10 million", "25 million", "50 million", "100 million"), "Technology", "Windows XP, launched in 2001, is a major Microsoft operating system whose source code had about 100 million lines, reflecting its technical complexity at the time."),
            zh = LocalizedContent("Windows XP包含多少行代码？", listOf("1000万", "2500万", "5000万", "1亿"), "科技", "Windows XP于2001年推出，是微软的主要操作系统，其源代码约有1亿行，反映了当时的技术复杂性。"),
            es = LocalizedContent("¿Cuántas líneas de código contiene Windows XP?", listOf("10 millones", "25 millones", "50 millones", "100 millones"), "Tecnología", "Windows XP, lanzado en 2001, es un sistema operativo importante de Microsoft cuyo código fuente tenía alrededor de 100 millones de líneas, reflejando su complejidad técnica en ese momento.")
        ),
        BilingualQuestion(
            id = 51596, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de pixels de la résolution 4K?", listOf("2160x1440", "4096x2160", "3840x2160", "5120x2880"), "Tech", "La résolution 4K standard est de 3840x2160 pixels. La réponse donnée (2160x1440) correspond en fait à la résolution QHD, souvent confondue avec la 4K."),
            en = LocalizedContent("What is the pixel count of 4K resolution?", listOf("2160x1440", "4096x2160", "3840x2160", "5120x2880"), "Technology", "The standard 4K resolution is 3840x2160 pixels. The given answer (2160x1440) actually corresponds to QHD resolution, often confused with 4K."),
            zh = LocalizedContent("4K分辨率有多少像素？", listOf("2160x1440", "4096x2160", "3840x2160", "5120x2880"), "科技", "标准4K分辨率为3840x2160像素。给出的答案（2160x1440）实际上对应的是QHD分辨率，常与4K混淆。"),
            es = LocalizedContent("¿Cuál es el número de píxeles de la resolución 4K?", listOf("2160x1440", "4096x2160", "3840x2160", "5120x2880"), "Tecnología", "La resolución 4K estándar es de 3840x2160 píxeles. La respuesta dada (2160x1440) corresponde en realidad a la resolución QHD, a menudo confundida con 4K.")
        ),
        BilingualQuestion(
            id = 51597, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Google a-t-il été fondé?", listOf("1996", "1997", "1998", "1999"), "Tech", "Google a été fondé en 1997 par Larry Page et Sergey Brin alors qu'ils étaient doctorants à l'université Stanford."),
            en = LocalizedContent("In what year was Google founded?", listOf("1996", "1997", "1998", "1999"), "Technology", "Google was founded in 1997 by Larry Page and Sergey Brin while they were PhD students at Stanford University."),
            zh = LocalizedContent("谷歌成立于哪一年？", listOf("1996", "1997", "1998", "1999"), "科技", "谷歌由拉里·佩奇和谢尔盖·布林于1997年创立，当时他们是斯坦福大学的博士生。"),
            es = LocalizedContent("¿En qué año se fundó Google?", listOf("1996", "1997", "1998", "1999"), "Tecnología", "Google fue fundado en 1997 por Larry Page y Sergey Brin mientras eran estudiantes de doctorado en la Universidad de Stanford.")
        ),
        BilingualQuestion(
            id = 51598, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le record du monde du Tetris?", listOf("999999", "6144137", "2147483647", "9999999"), "Tech", "Le score maximal de Tetris est limité par un bug de débordement d'entier signé 32 bits, bloquant le compteur à 2 147 483 647 points."),
            en = LocalizedContent("What is the world record score for Tetris?", listOf("999999", "6144137", "2147483647", "9999999"), "Technology", "The maximum Tetris score is limited by a signed 32-bit integer overflow bug, capping the counter at 2,147,483,647 points."),
            zh = LocalizedContent("俄罗斯方块的世界纪录分数是多少？", listOf("999999", "6144137", "2147483647", "9999999"), "科技", "俄罗斯方块的最高分受限于有符号32位整数溢出错误，计数器上限为2,147,483,647分。"),
            es = LocalizedContent("¿Cuál es el récord mundial de puntuación en Tetris?", listOf("999999", "6144137", "2147483647", "9999999"), "Tecnología", "La puntuación máxima de Tetris está limitada por un error de desbordamiento de entero con signo de 32 bits, que fija el contador en 2.147.483.647 puntos.")
        ),
        BilingualQuestion(
            id = 51599, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel inventeur a créé le Wi-Fi?", listOf("Steve Jobs", "Hedy Lamarr", "Nikola Tesla", "Albert Einstein"), "Tech", "Albert Einstein n'a pas créé le Wi-Fi. La technologie Wi-Fi a été développée par Hedy Lamarr et George Antheil, puis standardisée par l'IEEE."),
            en = LocalizedContent("Which inventor created Wi-Fi?", listOf("Steve Jobs", "Hedy Lamarr", "Nikola Tesla", "Albert Einstein"), "Technology", "Albert Einstein did not create Wi-Fi. Wi-Fi technology was developed by Hedy Lamarr and George Antheil, then standardized by the IEEE."),
            zh = LocalizedContent("哪位发明家创造了Wi-Fi？", listOf("史蒂夫·乔布斯", "海蒂·拉玛", "尼古拉·特斯拉", "阿尔伯特·爱因斯坦"), "科技", "阿尔伯特·爱因斯坦没有创造Wi-Fi。Wi-Fi技术由海蒂·拉玛和乔治·安塞尔开发，随后由IEEE标准化。"),
            es = LocalizedContent("¿Qué inventor creó el Wi-Fi?", listOf("Steve Jobs", "Hedy Lamarr", "Nikola Tesla", "Albert Einstein"), "Tecnología", "Albert Einstein no creó el Wi-Fi. La tecnología Wi-Fi fue desarrollada por Hedy Lamarr y George Antheil, y luego estandarizada por el IEEE.")
        ),
        BilingualQuestion(
            id = 51600, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a été inventé le code-barres?", listOf("1952", "1966", "1974", "1982"), "Tech", "Le code-barres a été inventé en 1952 par Norman Woodland et Bernard Silver, qui ont déposé un brevet pour un système de lecture de motifs linéaires."),
            en = LocalizedContent("In what year was the barcode invented?", listOf("1952", "1966", "1974", "1982"), "Technology", "The barcode was invented in 1952 by Norman Woodland and Bernard Silver, who filed a patent for a system of reading linear patterns."),
            zh = LocalizedContent("条形码是哪一年发明的？", listOf("1952", "1966", "1974", "1982"), "科技", "条形码由诺曼·伍德兰和伯纳德·西尔弗于1952年发明，他们为一种读取线性图案的系统申请了专利。"),
            es = LocalizedContent("¿En qué año se inventó el código de barras?", listOf("1952", "1966", "1974", "1982"), "Tecnología", "El código de barras fue inventado en 1952 por Norman Woodland y Bernard Silver, quienes presentaron una patente para un sistema de lectura de patrones lineales.")
        ),
        BilingualQuestion(
            id = 51601, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus vieux jeu vidéo jamais créé?", listOf("Pong", "Tennis for Two", "OXO", "Spacewar"), "Tech", "Tennis for Two, créé en 1958 par le physicien William Higinbotham, est considéré comme le premier jeu vidéo interactif, utilisant un oscilloscope pour afficher un match de tennis simplifié."),
            en = LocalizedContent("What is the oldest video game ever created?", listOf("Pong", "Tennis for Two", "OXO", "Spacewar"), "Technology", "Tennis for Two, created in 1958 by physicist William Higinbotham, is considered the first interactive video game, using an oscilloscope to display a simplified tennis match."),
            zh = LocalizedContent("有史以来最古老的电子游戏是什么？", listOf("Pong", "双人网球", "OXO", "太空战争"), "科技", "《双人网球》由物理学家威廉·希金博特姆于1958年创建，被认为是第一款交互式电子游戏，使用示波器显示简化的网球比赛。"),
            es = LocalizedContent("¿Cuál es el videojuego más antiguo jamás creado?", listOf("Pong", "Tennis for Two", "OXO", "Spacewar"), "Tecnología", "Tennis for Two, creado en 1958 por el físico William Higinbotham, es considerado el primer videojuego interactivo, utilizando un osciloscopio para mostrar un partido de tenis simplificado.")
        ),
        BilingualQuestion(
            id = 51602, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fichiers cloud sont téléchargés par seconde mondialement?", listOf("Des millions", "Des milliers", "Des centaines", "Des dizaines"), "Tech", "Le volume de données téléchargées depuis le cloud atteint plusieurs centaines de fichiers par seconde à l'échelle mondiale, en raison de l'usage massif des services de stockage et de streaming."),
            en = LocalizedContent("How many cloud files are downloaded per second worldwide?", listOf("Millions", "Thousands", "Hundreds", "Tens"), "Technology", "The volume of data downloaded from the cloud reaches several hundred files per second globally, due to the massive use of storage and streaming services."),
            zh = LocalizedContent("全球每秒下载多少云文件？", listOf("数百万", "数千", "数百", "数十"), "科技", "由于存储和流媒体服务的大量使用，全球每秒从云端下载的数据量达到数百个文件。"),
            es = LocalizedContent("¿Cuántos archivos en la nube se descargan por segundo a nivel mundial?", listOf("Millones", "Miles", "Cientos", "Decenas"), "Tecnología", "El volumen de datos descargados desde la nube alcanza varios cientos de archivos por segundo a nivel mundial, debido al uso masivo de servicios de almacenamiento y streaming.")
        ),
        BilingualQuestion(
            id = 51603, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du premier bot de chat AI grand public?", listOf("Eliza", "PARRY", "Racter", "A.L.I.C.E"), "Tech", "A.L.I.C.E. (Artificial Linguistic Internet Computer Entity) a été créée par Richard Wallace en 1995 et a remporté le prix Loebner à trois reprises, devenant l'un des premiers chatbots AI largement accessibles au public."),
            en = LocalizedContent("What is the name of the first mainstream AI chatbot?", listOf("Eliza", "PARRY", "Racter", "A.L.I.C.E"), "Technology", "A.L.I.C.E. (Artificial Linguistic Internet Computer Entity) was created by Richard Wallace in 1995 and won the Loebner Prize three times, becoming one of the first widely accessible AI chatbots."),
            zh = LocalizedContent("第一个主流AI聊天机器人叫什么名字？", listOf("Eliza", "PARRY", "Racter", "A.L.I.C.E"), "科技", "A.L.I.C.E.（人工语言互联网计算机实体）由理查德·华莱士于1995年创建，并三次获得勒布纳奖，成为最早广泛使用的AI聊天机器人之一。"),
            es = LocalizedContent("¿Cuál es el nombre del primer chatbot de IA convencional?", listOf("Eliza", "PARRY", "Racter", "A.L.I.C.E"), "Tecnología", "A.L.I.C.E. (Artificial Linguistic Internet Computer Entity) fue creada por Richard Wallace en 1995 y ganó el Premio Loebner tres veces, convirtiéndose en uno de los primeros chatbots de IA ampliamente accesibles.")
        ),
        BilingualQuestion(
            id = 51604, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la première photo en couleur a-t-elle été prise?", listOf("1861", "1882", "1903", "1920"), "Tech", "La première photographie en couleur durable a été réalisée en 1861 par le physicien James Clerk Maxwell, utilisant la méthode de la trichromie."),
            en = LocalizedContent("In what year was the first color photograph taken?", listOf("1861", "1882", "1903", "1920"), "Technology", "The first durable color photograph was taken in 1861 by physicist James Clerk Maxwell, using the trichrome method."),
            zh = LocalizedContent("第一张彩色照片是哪一年拍摄的？", listOf("1861", "1882", "1903", "1920"), "科技", "第一张持久的彩色照片由物理学家詹姆斯·克拉克·麦克斯韦于1861年使用三色法拍摄。"),
            es = LocalizedContent("¿En qué año se tomó la primera fotografía en color?", listOf("1861", "1882", "1903", "1920"), "Tecnología", "La primera fotografía en color duradera fue tomada en 1861 por el físico James Clerk Maxwell, utilizando el método de la tricromía.")
        ),
        BilingualQuestion(
            id = 51606, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de milliards de dollars coûte une fabrication de puce semi-conducteur moderne?", listOf("1", "5", "10", "20"), "Tech", "La construction d'une usine de fabrication de puces semi-conducteurs modernes, comme une fonderie de pointe, nécessite un investissement d'environ 10 milliards de dollars en raison des équipements sophistiqués et des salles blanches nécessaires."),
            en = LocalizedContent("How many billion dollars does it cost to manufacture a modern semiconductor chip?", listOf("1", "5", "10", "20"), "Technology", "Building a modern semiconductor chip fabrication plant, such as a leading-edge foundry, requires an investment of about 10 billion dollars due to sophisticated equipment and clean rooms."),
            zh = LocalizedContent("制造现代半导体芯片需要多少亿美元？", listOf("1", "5", "10", "20"), "科技", "建造现代半导体芯片制造厂（如先进代工厂）需要约100亿美元的投资，因为需要精密设备和洁净室。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares cuesta fabricar un chip semiconductor moderno?", listOf("1", "5", "10", "20"), "Tecnología", "Construir una planta de fabricación de chips semiconductores moderna, como una fundición de vanguardia, requiere una inversión de aproximadamente 10 mil millones de dólares debido a los equipos sofisticados y las salas blancas necesarias.")
        ),
        BilingualQuestion(
            id = 51607, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le téléphone mobile le plus cher jamais vendu?", listOf("iPhone 14 Pro Max", "Samsung Galaxy S22 Ultra", "Solarin", "Sirocco Gold"), "Tech", "Le Sirocco Gold, un iPhone 4S recouvert d'or et incrusté de diamants, a été vendu pour plus de 8 millions de dollars en 2013, dépassant tout autre téléphone par son prix."),
            en = LocalizedContent("What is the most expensive mobile phone ever sold?", listOf("iPhone 14 Pro Max", "Samsung Galaxy S22 Ultra", "Solarin", "Sirocco Gold"), "Technology", "The Sirocco Gold, an iPhone 4S covered in gold and encrusted with diamonds, was sold for over $8 million in 2013, surpassing any other phone in price."),
            zh = LocalizedContent("有史以来最贵的手机是什么？", listOf("iPhone 14 Pro Max", "Samsung Galaxy S22 Ultra", "Solarin", "Sirocco Gold"), "科技", "Sirocco Gold 是一款镶金嵌钻的 iPhone 4S，2013 年以超过 800 万美元的价格售出，远超其他手机。"),
            es = LocalizedContent("¿Cuál es el teléfono móvil más caro jamás vendido?", listOf("iPhone 14 Pro Max", "Samsung Galaxy S22 Ultra", "Solarin", "Sirocco Gold"), "Tecnología", "El Sirocco Gold, un iPhone 4S recubierto de oro y con incrustaciones de diamantes, se vendió por más de 8 millones de dólares en 2013, superando a cualquier otro teléfono en precio.")
        ),
        BilingualQuestion(
            id = 51608, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Amazon a-t-il été fondé?", listOf("1992", "1994", "1996", "1998"), "Tech", "Amazon a été fondé par Jeff Bezos en 1994, initialement comme librairie en ligne, et non en 1992."),
            en = LocalizedContent("In what year was Amazon founded?", listOf("1992", "1994", "1996", "1998"), "Technology", "Amazon was founded by Jeff Bezos in 1994, initially as an online bookstore, not in 1992."),
            zh = LocalizedContent("亚马逊成立于哪一年？", listOf("1992", "1994", "1996", "1998"), "科技", "亚马逊由杰夫·贝佐斯于 1994 年创立，最初是一家在线书店，而非 1992 年。"),
            es = LocalizedContent("¿En qué año se fundó Amazon?", listOf("1992", "1994", "1996", "1998"), "Tecnología", "Amazon fue fundada por Jeff Bezos en 1994, inicialmente como una librería en línea, no en 1992.")
        ),
        BilingualQuestion(
            id = 51609, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand centre de données au monde?", listOf("Google Cloud", "AWS", "Microsoft Azure", "Meta"), "Tech", "Le plus grand centre de données au monde, le campus AWS à Ashburn, en Virginie, s'étend sur plus de 600 000 mètres carrés. Il est exploité par Amazon Web Services, leader mondial du cloud computing."),
            en = LocalizedContent("What is the largest data center in the world?", listOf("Google Cloud", "AWS", "Microsoft Azure", "Meta"), "Technology", "The largest data center in the world, the AWS campus in Ashburn, Virginia, spans over 600,000 square meters. It is operated by Amazon Web Services, the global leader in cloud computing."),
            zh = LocalizedContent("世界上最大的数据中心是什么？", listOf("Google Cloud", "AWS", "Microsoft Azure", "Meta"), "科技", "世界上最大的数据中心是位于弗吉尼亚州阿什本的 AWS 园区，占地面积超过 60 万平方米，由亚马逊云服务运营，是全球云计算领导者。"),
            es = LocalizedContent("¿Cuál es el centro de datos más grande del mundo?", listOf("Google Cloud", "AWS", "Microsoft Azure", "Meta"), "Tecnología", "El centro de datos más grande del mundo, el campus de AWS en Ashburn, Virginia, se extiende sobre más de 600,000 metros cuadrados. Es operado por Amazon Web Services, líder mundial en computación en la nube.")
        ),
        BilingualQuestion(
            id = 51610, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de secondes dure le chargement moyen d'une page web?", listOf("1-2", "3-4", "5-8", "10+"), "Tech", "Des études de performance web montrent que la majorité des utilisateurs abandonnent une page si elle ne se charge pas en 5 à 8 secondes, ce qui correspond au seuil de patience moyen."),
            en = LocalizedContent("How many seconds does the average web page load take?", listOf("1-2", "3-4", "5-8", "10+"), "Technology", "Web performance studies show that the majority of users abandon a page if it does not load within 5 to 8 seconds, which corresponds to the average patience threshold."),
            zh = LocalizedContent("网页平均加载时间是多少秒？", listOf("1-2", "3-4", "5-8", "10+"), "科技", "网页性能研究表明，大多数用户会在页面加载超过 5 到 8 秒时放弃，这对应了平均耐心阈值。"),
            es = LocalizedContent("¿Cuántos segundos dura la carga promedio de una página web?", listOf("1-2", "3-4", "5-8", "10+"), "Tecnología", "Los estudios de rendimiento web muestran que la mayoría de los usuarios abandonan una página si no se carga en 5 a 8 segundos, lo que corresponde al umbral de paciencia promedio.")
        ),
        BilingualQuestion(
            id = 51611, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du premier système d'exploitation pour ordinateur?", listOf("Unix", "DOS", "CP/M", "TOPS-20"), "Tech", "Le TOPS-20, développé par Digital Equipment Corporation, fut l'un des premiers systèmes d'exploitation à interface utilisateur interactive pour ordinateurs, lancé en 1976."),
            en = LocalizedContent("What is the name of the first computer operating system?", listOf("Unix", "DOS", "CP/M", "TOPS-20"), "Technology", "TOPS-20, developed by Digital Equipment Corporation, was one of the first operating systems with an interactive user interface for computers, launched in 1976."),
            zh = LocalizedContent("第一个计算机操作系统的名称是什么？", listOf("Unix", "DOS", "CP/M", "TOPS-20"), "科技", "TOPS-20 由数字设备公司开发，是首批具有交互式用户界面的操作系统之一，于 1976 年推出。"),
            es = LocalizedContent("¿Cuál es el nombre del primer sistema operativo para computadoras?", listOf("Unix", "DOS", "CP/M", "TOPS-20"), "Tecnología", "TOPS-20, desarrollado por Digital Equipment Corporation, fue uno de los primeros sistemas operativos con interfaz de usuario interactiva para computadoras, lanzado en 1976.")
        ),
        BilingualQuestion(
            id = 51612, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le first deep learning convolutional network a-t-il été créé?", listOf("1998", "2006", "2012", "2016"), "Tech", "Le réseau LeNet-5, considéré comme le premier réseau convolutif profond, a été développé par Yann LeCun et ses collègues en 1998 pour la reconnaissance de chiffres manuscrits."),
            en = LocalizedContent("In what year was the first deep learning convolutional network created?", listOf("1998", "2006", "2012", "2016"), "Technology", "The LeNet-5 network, considered the first deep convolutional network, was developed by Yann LeCun and his colleagues in 1998 for handwritten digit recognition."),
            zh = LocalizedContent("第一个深度学习卷积网络创建于哪一年？", listOf("1998", "2006", "2012", "2016"), "科技", "LeNet-5 网络被认为是第一个深度卷积网络，由 Yann LeCun 及其同事于 1998 年开发，用于手写数字识别。"),
            es = LocalizedContent("¿En qué año se creó la primera red convolucional de aprendizaje profundo?", listOf("1998", "2006", "2012", "2016"), "Tecnología", "La red LeNet-5, considerada la primera red convolucional profunda, fue desarrollada por Yann LeCun y sus colegas en 1998 para el reconocimiento de dígitos manuscritos.")
        ),
        BilingualQuestion(
            id = 51613, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus vieux domaine .com toujours actif?", listOf("google.com", "symbolics.com", "apple.com", "microsoft.com"), "Tech", "Symbolics.com a été enregistré le 15 mars 1985 par la société Symbolics, un fabricant d'ordinateurs, et il est toujours actif, ce qui en fait le plus ancien domaine .com existant."),
            en = LocalizedContent("What is the oldest .com domain still active?", listOf("google.com", "symbolics.com", "apple.com", "microsoft.com"), "Technology", "Symbolics.com was registered on March 15, 1985 by the company Symbolics, a computer manufacturer, and it is still active, making it the oldest existing .com domain."),
            zh = LocalizedContent("仍然活跃的最古老的 .com 域名是什么？", listOf("google.com", "symbolics.com", "apple.com", "microsoft.com"), "科技", "Symbolics.com 于 1985 年 3 月 15 日由计算机制造商 Symbolics 公司注册，至今仍在使用，是现存最古老的 .com 域名。"),
            es = LocalizedContent("¿Cuál es el dominio .com más antiguo aún activo?", listOf("google.com", "symbolics.com", "apple.com", "microsoft.com"), "Tecnología", "Symbolics.com fue registrado el 15 de marzo de 1985 por la empresa Symbolics, un fabricante de computadoras, y sigue activo, lo que lo convierte en el dominio .com más antiguo existente.")
        ),
        BilingualQuestion(
            id = 51614, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de millions d'utilisateurs avait MySpace à son apogée?", listOf("50", "100", "200", "500"), "Tech", "MySpace a atteint environ 200 millions d'utilisateurs en 2008, avant d'être dépassé par Facebook. C'était le réseau social dominant au milieu des années 2000."),
            en = LocalizedContent("How many millions of users did MySpace have at its peak?", listOf("50", "100", "200", "500"), "Technology", "MySpace reached about 200 million users in 2008, before being overtaken by Facebook. It was the dominant social network in the mid-2000s."),
            zh = LocalizedContent("MySpace 在巅峰时期有多少百万用户？", listOf("50", "100", "200", "500"), "科技", "MySpace 在 2008 年达到约 2 亿用户，之后被 Facebook 超越。它是 2000 年代中期占主导地位的社交网络。"),
            es = LocalizedContent("¿Cuántos millones de usuarios tenía MySpace en su apogeo?", listOf("50", "100", "200", "500"), "Tecnología", "MySpace alcanzó unos 200 millones de usuarios en 2008, antes de ser superado por Facebook. Fue la red social dominante a mediados de los 2000.")
        ),
        BilingualQuestion(
            id = 51615, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre d'utilisateurs actifs de Facebook en 2024?", listOf("1 milliard", "2 milliards", "3 milliards", "4 milliards"), "Tech", "Facebook a franchi la barre des 4 milliards d'utilisateurs actifs mensuels en 2024, confirmant sa position de premier réseau social mondial."),
            en = LocalizedContent("What is the number of active Facebook users in 2024?", listOf("1 billion", "2 billion", "3 billion", "4 billion"), "Technology", "Facebook surpassed 4 billion monthly active users in 2024, confirming its position as the world's leading social network."),
            zh = LocalizedContent("2024 年 Facebook 的活跃用户数量是多少？", listOf("10亿", "20亿", "30亿", "40亿"), "科技", "Facebook 在 2024 年突破了 40 亿月活跃用户，巩固了其全球领先社交网络的地位。"),
            es = LocalizedContent("¿Cuál es el número de usuarios activos de Facebook en 2024?", listOf("1 billón", "2 billones", "3 billones", "4 billones"), "Tecnología", "Facebook superó los 4 mil millones de usuarios activos mensuales en 2024, confirmando su posición como la red social líder en el mundo.")
        ),
        BilingualQuestion(
            id = 51616, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier film a été streamé légalement sur internet?", listOf("2001", "2005", "2007", "2010"), "Tech", "Le premier film streamé légalement sur internet fut \"The Matrix\" en 2001, via le service CinemaNow, marquant le début de la distribution numérique légale."),
            en = LocalizedContent("In what year was the first movie legally streamed on the internet?", listOf("2001", "2005", "2007", "2010"), "Technology", "The first movie legally streamed on the internet was \"The Matrix\" in 2001, via the CinemaNow service, marking the beginning of legal digital distribution."),
            zh = LocalizedContent("第一部合法在互联网上播放的电影是在哪一年？", listOf("2001", "2005", "2007", "2010"), "科技", "第一部合法在互联网上播放的电影是 2001 年的《黑客帝国》，通过 CinemaNow 服务播放，标志着合法数字发行的开始。"),
            es = LocalizedContent("¿En qué año se transmitió legalmente la primera película por internet?", listOf("2001", "2005", "2007", "2010"), "Tecnología", "La primera película transmitida legalmente por internet fue \"The Matrix\" en 2001, a través del servicio CinemaNow, marcando el inicio de la distribución digital legal.")
        ),
        BilingualQuestion(
            id = 51617, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le codec vidéo le plus utilisé actuellement?", listOf("H.264", "H.265", "VP9", "AV1"), "Tech", "H.265, aussi appelé HEVC, est le successeur du H.264 et offre une meilleure compression pour les vidéos haute définition, ce qui le rend standard pour le streaming 4K et les plateformes comme YouTube."),
            en = LocalizedContent("What is the most widely used video codec currently?", listOf("H.264", "H.265", "VP9", "AV1"), "Technology", "H.265, also known as HEVC, is the successor to H.264 and offers better compression for high-definition videos, making it standard for 4K streaming and platforms like YouTube."),
            zh = LocalizedContent("目前使用最广泛的视频编解码器是什么？", listOf("H.264", "H.265", "VP9", "AV1"), "科技", "H.265，也称为HEVC，是H.264的继任者，为高清视频提供更好的压缩，使其成为4K流媒体和YouTube等平台的标准。"),
            es = LocalizedContent("¿Cuál es el códec de video más utilizado actualmente?", listOf("H.264", "H.265", "VP9", "AV1"), "Tecnología", "H.265, también conocido como HEVC, es el sucesor de H.264 y ofrece una mejor compresión para videos de alta definición, lo que lo convierte en estándar para streaming 4K y plataformas como YouTube.")
        ),
        BilingualQuestion(
            id = 51618, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de millions de dollars vaut le marché des jeux vidéo en 2024?", listOf("100", "150", "200", "300"), "Tech", "Le marché mondial du jeu vidéo a généré environ 200 milliards de dollars en 2024, selon les estimations de Newzoo, porté par la croissance des jeux mobiles et des services d'abonnement."),
            en = LocalizedContent("How many million dollars is the video game market worth in 2024?", listOf("100", "150", "200", "300"), "Technology", "The global video game market generated approximately 200 billion dollars in 2024, according to Newzoo estimates, driven by the growth of mobile games and subscription services."),
            zh = LocalizedContent("2024年视频游戏市场价值多少百万美元？", listOf("100", "150", "200", "300"), "科技", "根据Newzoo的估计，全球视频游戏市场在2024年产生了约2000亿美元，得益于手机游戏和订阅服务的增长。"),
            es = LocalizedContent("¿Cuántos millones de dólares vale el mercado de videojuegos en 2024?", listOf("100", "150", "200", "300"), "Tecnología", "El mercado mundial de videojuegos generó aproximadamente 200 mil millones de dólares en 2024, según estimaciones de Newzoo, impulsado por el crecimiento de los juegos móviles y los servicios de suscripción.")
        ),
        BilingualQuestion(
            id = 51619, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fabricant de puces électroniques?", listOf("Intel", "AMD", "TSMC", "Samsung"), "Tech", "Samsung a dépassé Intel en 2017 pour devenir le premier fabricant mondial de semi-conducteurs en termes de chiffre d'affaires, grâce à sa domination dans la production de mémoires DRAM et NAND."),
            en = LocalizedContent("What is the largest chip manufacturer?", listOf("Intel", "AMD", "TSMC", "Samsung"), "Technology", "Samsung surpassed Intel in 2017 to become the world's largest semiconductor manufacturer in terms of revenue, thanks to its dominance in DRAM and NAND memory production."),
            zh = LocalizedContent("最大的芯片制造商是哪家？", listOf("英特尔", "AMD", "台积电", "三星"), "科技", "三星在2017年超越英特尔，成为全球收入最高的半导体制造商，这得益于其在DRAM和NAND内存生产中的主导地位。"),
            es = LocalizedContent("¿Cuál es el mayor fabricante de chips?", listOf("Intel", "AMD", "TSMC", "Samsung"), "Tecnología", "Samsung superó a Intel en 2017 para convertirse en el mayor fabricante mundial de semiconductores en términos de ingresos, gracias a su dominio en la producción de memorias DRAM y NAND.")
        ),
        BilingualQuestion(
            id = 51620, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier streaming vidéo a-t-il été possible?", listOf("1995", "2000", "2005", "2010"), "Tech", "Le premier streaming vidéo en direct a eu lieu en 1995 avec la diffusion d'un match de baseball entre les Yankees et les Mariners via RealAudio et RealVideo."),
            en = LocalizedContent("In what year was the first video streaming possible?", listOf("1995", "2000", "2005", "2010"), "Technology", "The first live video streaming took place in 1995 with the broadcast of a baseball game between the Yankees and the Mariners via RealAudio and RealVideo."),
            zh = LocalizedContent("第一次视频流媒体是在哪一年实现的？", listOf("1995", "2000", "2005", "2010"), "科技", "第一次实时视频流媒体发生在1995年，通过RealAudio和RealVideo直播了洋基队和水手队之间的棒球比赛。"),
            es = LocalizedContent("¿En qué año fue posible la primera transmisión de video en streaming?", listOf("1995", "2000", "2005", "2010"), "Tecnología", "La primera transmisión de video en vivo tuvo lugar en 1995 con la difusión de un partido de béisbol entre los Yankees y los Marineros a través de RealAudio y RealVideo.")
        ),
        BilingualQuestion(
            id = 51621, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation le plus difficile à apprendre?", listOf("Brainfuck", "INTERCAL", "Malbolge", "Whitespace"), "Tech", "INTERCAL a été conçu en 1972 comme un langage parodique, avec des syntaxes volontairement absurdes et contre-intuitives, ce qui le rend extrêmement difficile à maîtriser."),
            en = LocalizedContent("What is the hardest programming language to learn?", listOf("Brainfuck", "INTERCAL", "Malbolge", "Whitespace"), "Technology", "INTERCAL was designed in 1972 as a parody language, with deliberately absurd and counterintuitive syntax, making it extremely difficult to master."),
            zh = LocalizedContent("最难学的编程语言是什么？", listOf("Brainfuck", "INTERCAL", "Malbolge", "Whitespace"), "科技", "INTERCAL于1972年被设计为一种恶搞语言，语法故意荒谬且反直觉，使其极难掌握。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación más difícil de aprender?", listOf("Brainfuck", "INTERCAL", "Malbolge", "Whitespace"), "Tecnología", "INTERCAL fue diseñado en 1972 como un lenguaje paródico, con sintaxis deliberadamente absurdas y contraintuitivas, lo que lo hace extremadamente difícil de dominar.")
        ),
        BilingualQuestion(
            id = 51622, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de millions de lignes de code contient le noyau Linux?", listOf("5", "10", "20", "50"), "Tech", "Le noyau Linux, un des plus grands projets open source, comptait environ 20 millions de lignes de code dans sa version 5.13 en 2021, reflétant sa complexité et son support pour de nombreux matériels."),
            en = LocalizedContent("How many million lines of code does the Linux kernel contain?", listOf("5", "10", "20", "50"), "Technology", "The Linux kernel, one of the largest open-source projects, contained about 20 million lines of code in version 5.13 in 2021, reflecting its complexity and support for many hardware devices."),
            zh = LocalizedContent("Linux内核包含多少百万行代码？", listOf("5", "10", "20", "50"), "科技", "Linux内核是最大的开源项目之一，在2021年的5.13版本中约有2000万行代码，反映了其复杂性和对众多硬件设备的支持。"),
            es = LocalizedContent("¿Cuántos millones de líneas de código contiene el kernel de Linux?", listOf("5", "10", "20", "50"), "Tecnología", "El kernel de Linux, uno de los proyectos de código abierto más grandes, contenía aproximadamente 20 millones de líneas de código en su versión 5.13 en 2021, reflejando su complejidad y soporte para muchos dispositivos.")
        ),
        BilingualQuestion(
            id = 51623, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du créateur de Linux?", listOf("Richard Stallman", "Linus Torvalds", "Eric Raymond", "Mark Shuttleworth"), "Tech", "Mark Shuttleworth a fondé la société Canonical et a créé la distribution Ubuntu, basée sur Linux."),
            en = LocalizedContent("What is the name of the creator of Linux?", listOf("Richard Stallman", "Linus Torvalds", "Eric Raymond", "Mark Shuttleworth"), "Technology", "Mark Shuttleworth founded the company Canonical and created the Ubuntu distribution, based on Linux."),
            zh = LocalizedContent("Linux的创造者叫什么名字？", listOf("理查德·斯托曼", "林纳斯·托瓦兹", "埃里克·雷蒙", "马克·沙特尔沃思"), "科技", "马克·沙特尔沃思创立了Canonical公司，并创建了基于Linux的Ubuntu发行版。"),
            es = LocalizedContent("¿Cuál es el nombre del creador de Linux?", listOf("Richard Stallman", "Linus Torvalds", "Eric Raymond", "Mark Shuttleworth"), "Tecnología", "Mark Shuttleworth fundó la empresa Canonical y creó la distribución Ubuntu, basada en Linux.")
        ),
        BilingualQuestion(
            id = 51624, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année GitHub a-t-il été fondé?", listOf("2006", "2007", "2008", "2009"), "Tech", "GitHub a été fondé en 2006 par Tom Preston-Werner, Chris Wanstrath et PJ Hyett pour simplifier l'hébergement et le partage de code via Git."),
            en = LocalizedContent("In what year was GitHub founded?", listOf("2006", "2007", "2008", "2009"), "Technology", "GitHub was founded in 2006 by Tom Preston-Werner, Chris Wanstrath, and PJ Hyett to simplify code hosting and sharing via Git."),
            zh = LocalizedContent("GitHub是哪一年成立的？", listOf("2006", "2007", "2008", "2009"), "科技", "GitHub于2006年由Tom Preston-Werner、Chris Wanstrath和PJ Hyett创立，旨在通过Git简化代码托管和共享。"),
            es = LocalizedContent("¿En qué año se fundó GitHub?", listOf("2006", "2007", "2008", "2009"), "Tecnología", "GitHub fue fundado en 2006 por Tom Preston-Werner, Chris Wanstrath y PJ Hyett para simplificar el alojamiento y el intercambio de código a través de Git.")
        ),
        BilingualQuestion(
            id = 51625, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de serveurs que Google utilise globalement?", listOf("1 million", "5 millions", "10 millions", "50 millions"), "Tech", "Google ne divulgue pas officiellement ce chiffre, mais les estimations des experts en infrastructure placent le nombre de ses serveurs dans le monde autour de 5 millions."),
            en = LocalizedContent("How many servers does Google use globally?", listOf("1 million", "5 million", "10 million", "50 million"), "Technology", "Google does not officially disclose this figure, but infrastructure expert estimates place the number of its servers worldwide at around 5 million."),
            zh = LocalizedContent("谷歌在全球使用多少台服务器？", listOf("100万", "500万", "1000万", "5000万"), "科技", "谷歌没有正式公布这个数字，但基础设施专家的估计将其全球服务器数量定在约500万台。"),
            es = LocalizedContent("¿Cuántos servidores utiliza Google a nivel mundial?", listOf("1 millón", "5 millones", "10 millones", "50 millones"), "Tecnología", "Google no divulga oficialmente esta cifra, pero las estimaciones de expertos en infraestructura sitúan el número de sus servidores en todo el mundo alrededor de 5 millones.")
        ),
        BilingualQuestion(
            id = 51626, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de milliards de requêtes Google sont effectuées par jour?", listOf("1", "5", "10", "20"), "Tech", "Google traite environ 8,5 milliards de recherches par jour, un chiffre souvent arrondi à 10 milliards dans les estimations récentes."),
            en = LocalizedContent("How many billion Google searches are performed per day?", listOf("1", "5", "10", "20"), "Technology", "Google processes about 8.5 billion searches per day, a figure often rounded to 10 billion in recent estimates."),
            zh = LocalizedContent("谷歌每天处理多少亿次搜索？", listOf("1", "5", "10", "20"), "科技", "谷歌每天处理约85亿次搜索，这个数字在最近的估计中常被四舍五入到100亿。"),
            es = LocalizedContent("¿Cuántos miles de millones de búsquedas realiza Google al día?", listOf("1", "5", "10", "20"), "Tecnología", "Google procesa aproximadamente 8.5 mil millones de búsquedas al día, una cifra que a menudo se redondea a 10 mil millones en estimaciones recientes.")
        ),
        BilingualQuestion(
            id = 51627, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux meme internet connu?", listOf("Lolcat", "Dancing Baby", "Hamster Dance", "Badger Badger"), "Tech", "Badger Badger, une animation flash de 2003 avec des champignons et un blaireau, est considéré comme l’un des premiers mèmes viraux d’internet."),
            en = LocalizedContent("What is the oldest known internet meme?", listOf("Lolcat", "Dancing Baby", "Hamster Dance", "Badger Badger"), "Technology", "Badger Badger, a 2003 flash animation with mushrooms and a badger, is considered one of the first viral internet memes."),
            zh = LocalizedContent("已知最古老的网络迷因是什么？", listOf("Lolcat", "跳舞婴儿", "仓鼠舞", "Badger Badger"), "科技", "Badger Badger，一个2003年的Flash动画，包含蘑菇和一只獾，被认为是最早的病毒式网络迷因之一。"),
            es = LocalizedContent("¿Cuál es el meme de internet más antiguo conocido?", listOf("Lolcat", "Dancing Baby", "Hamster Dance", "Badger Badger"), "Tecnología", "Badger Badger, una animación flash de 2003 con setas y un tejón, es considerado uno de los primeros memes virales de internet.")
        ),
        BilingualQuestion(
            id = 51628, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier email a-t-il été envoyé?", listOf("1971", "1978", "1985", "1992"), "Tech", "Le premier email a été envoyé en 1971 par l'ingénieur Ray Tomlinson, qui a également introduit le symbole @ pour séparer le nom de l'utilisateur du nom de la machine."),
            en = LocalizedContent("In what year was the first email sent?", listOf("1971", "1978", "1985", "1992"), "Technology", "The first email was sent in 1971 by engineer Ray Tomlinson, who also introduced the @ symbol to separate the user name from the machine name."),
            zh = LocalizedContent("第一封电子邮件是在哪一年发送的？", listOf("1971", "1978", "1985", "1992"), "科技", "第一封电子邮件于1971年由工程师雷·汤姆林森发送，他还引入了@符号来分隔用户名和机器名。"),
            es = LocalizedContent("¿En qué año se envió el primer correo electrónico?", listOf("1971", "1978", "1985", "1992"), "Tecnología", "El primer correo electrónico fue enviado en 1971 por el ingeniero Ray Tomlinson, quien también introdujo el símbolo @ para separar el nombre del usuario del nombre de la máquina.")
        ),
        BilingualQuestion(
            id = 51629, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du premier virus informatique?", listOf("Melissa", "ILOVEYOU", "Creeper", "Morris"), "Tech", "Le virus ILOVEYOU, apparu en 2000, se propageait via un fichier joint dans un email avec l'objet \"ILOVEYOU\". Il a infecté des millions d'ordinateurs en exploitant la crédulité des utilisateurs."),
            en = LocalizedContent("What is the name of the first computer virus?", listOf("Melissa", "ILOVEYOU", "Creeper", "Morris"), "Technology", "The ILOVEYOU virus, which appeared in 2000, spread via an attached file in an email with the subject \"ILOVEYOU\". It infected millions of computers by exploiting user gullibility."),
            zh = LocalizedContent("第一个计算机病毒叫什么名字？", listOf("梅丽莎", "我爱你", "爬行者", "莫里斯"), "科技", "ILOVEYOU病毒于2000年出现，通过电子邮件附件传播，主题为“ILOVEYOU”。它利用用户的轻信感染了数百万台计算机。"),
            es = LocalizedContent("¿Cuál es el nombre del primer virus informático?", listOf("Melissa", "ILOVEYOU", "Creeper", "Morris"), "Tecnología", "El virus ILOVEYOU, que apareció en 2000, se propagaba mediante un archivo adjunto en un correo electrónico con el asunto \"ILOVEYOU\". Infectó millones de ordenadores explotando la credulidad de los usuarios.")
        ),
        BilingualQuestion(
            id = 51630, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de temps a duré le plus long marathon de gaming?", listOf("24 heures", "48 heures", "100 heures", "200 heures"), "Tech", "Le record du plus long marathon de gaming a été établi à 100 heures en 2012 par le joueur polonais Krystian \"Krycha\" Kaczmarek sur Call of Duty: Modern Warfare 3."),
            en = LocalizedContent("How long did the longest gaming marathon last?", listOf("24 hours", "48 hours", "100 hours", "200 hours"), "Technology", "The record for the longest gaming marathon was set at 100 hours in 2012 by Polish player Krystian \"Krycha\" Kaczmarek on Call of Duty: Modern Warfare 3."),
            zh = LocalizedContent("最长的游戏马拉松持续了多长时间？", listOf("24小时", "48小时", "100小时", "200小时"), "科技", "最长游戏马拉松的记录是在2012年由波兰玩家Krystian \"Krycha\" Kaczmarek在《使命召唤：现代战争3》上创造的100小时。"),
            es = LocalizedContent("¿Cuánto duró la maratón de videojuegos más larga?", listOf("24 horas", "48 horas", "100 horas", "200 horas"), "Tecnología", "El récord de la maratón de videojuegos más larga se estableció en 100 horas en 2012 por el jugador polaco Krystian \"Krycha\" Kaczmarek en Call of Duty: Modern Warfare 3.")
        ),
        BilingualQuestion(
            id = 51631, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le jeu vidéo ayant généré le plus de revenus?", listOf("Fortnite", "PUBG", "Minecraft", "Candy Crush"), "Tech", "Candy Crush Saga, lancé en 2012, a généré plus de 20 milliards de dollars grâce à ses microtransactions et sa large base de joueurs mobiles, dépassant des titres comme Fortnite ou GTA V."),
            en = LocalizedContent("Which video game has generated the most revenue?", listOf("Fortnite", "PUBG", "Minecraft", "Candy Crush"), "Technology", "Candy Crush Saga, launched in 2012, has generated over $20 billion through its microtransactions and large mobile player base, surpassing titles like Fortnite or GTA V."),
            zh = LocalizedContent("哪款视频游戏创造了最高收入？", listOf("堡垒之夜", "绝地求生", "我的世界", "糖果粉碎传奇"), "科技", "《糖果粉碎传奇》于2012年推出，通过其微交易和庞大的移动玩家基础创造了超过200亿美元的收入，超过了《堡垒之夜》或《GTA V》等游戏。"),
            es = LocalizedContent("¿Qué videojuego ha generado más ingresos?", listOf("Fortnite", "PUBG", "Minecraft", "Candy Crush"), "Tecnología", "Candy Crush Saga, lanzado en 2012, ha generado más de 20 mil millones de dólares gracias a sus microtransacciones y su amplia base de jugadores móviles, superando títulos como Fortnite o GTA V.")
        ),
        BilingualQuestion(
            id = 51632, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier drone civil a-t-il été commercialisé?", listOf("2005", "2010", "2013", "2015"), "Tech", "Le premier drone civil grand public, le Parrot AR.Drone, a été commercialisé en 2010. L'année 2005 correspond plutôt au lancement de drones militaires comme le Predator."),
            en = LocalizedContent("In what year was the first civilian drone commercialized?", listOf("2005", "2010", "2013", "2015"), "Technology", "The first consumer civilian drone, the Parrot AR.Drone, was commercialized in 2010. The year 2005 corresponds more to the launch of military drones like the Predator."),
            zh = LocalizedContent("第一架民用无人机是在哪一年商业化的？", listOf("2005", "2010", "2013", "2015"), "科技", "第一款消费级民用无人机Parrot AR.Drone于2010年商业化。2005年更对应的是像捕食者这样的军用无人机的推出。"),
            es = LocalizedContent("¿En qué año se comercializó el primer dron civil?", listOf("2005", "2010", "2013", "2015"), "Tecnología", "El primer dron civil de consumo, el Parrot AR.Drone, se comercializó en 2010. El año 2005 corresponde más al lanzamiento de drones militares como el Predator.")
        ),
        BilingualQuestion(
            id = 51633, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le processeur le plus puissant jamais créé?", listOf("Intel Core i9", "AMD Ryzen", "Apple M1", "Fujitsu A64FX"), "Tech", "Le titre de processeur le plus puissant est disputé, mais l'AMD Ryzen Threadripper 3990X détient le record du plus grand nombre de cœurs dans un processeur grand public."),
            en = LocalizedContent("What is the most powerful processor ever created?", listOf("Intel Core i9", "AMD Ryzen", "Apple M1", "Fujitsu A64FX"), "Technology", "The title of most powerful processor is disputed, but the AMD Ryzen Threadripper 3990X holds the record for the highest number of cores in a consumer processor."),
            zh = LocalizedContent("有史以来最强大的处理器是什么？", listOf("英特尔酷睿i9", "AMD锐龙", "苹果M1", "富士通A64FX"), "科技", "最强大处理器的称号存在争议，但AMD锐龙Threadripper 3990X在消费级处理器中拥有最多的核心数。"),
            es = LocalizedContent("¿Cuál es el procesador más potente jamás creado?", listOf("Intel Core i9", "AMD Ryzen", "Apple M1", "Fujitsu A64FX"), "Tecnología", "El título del procesador más potente está en disputa, pero el AMD Ryzen Threadripper 3990X tiene el récord del mayor número de núcleos en un procesador de consumo.")
        ),
        BilingualQuestion(
            id = 51634, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de milliards de transistors contient un processeur moderne?", listOf("1", "5", "10", "50"), "Tech", "Les processeurs grand public actuels, comme les Apple M3 ou les AMD Ryzen, intègrent environ 10 à 20 milliards de transistors, grâce à des finesses de gravure de 3 à 5 nanomètres."),
            en = LocalizedContent("How many billions of transistors does a modern processor contain?", listOf("1", "5", "10", "50"), "Technology", "Current consumer processors, like the Apple M3 or AMD Ryzen, integrate about 10 to 20 billion transistors, thanks to manufacturing processes of 3 to 5 nanometers."),
            zh = LocalizedContent("现代处理器包含多少亿个晶体管？", listOf("1", "5", "10", "50"), "科技", "当前的消费级处理器，如苹果M3或AMD锐龙，集成了大约100亿到200亿个晶体管，这得益于3到5纳米的制造工艺。"),
            es = LocalizedContent("¿Cuántos miles de millones de transistores contiene un procesador moderno?", listOf("1", "5", "10", "50"), "Tecnología", "Los procesadores de consumo actuales, como el Apple M3 o el AMD Ryzen, integran alrededor de 10 a 20 mil millones de transistores, gracias a procesos de fabricación de 3 a 5 nanómetros.")
        ),
        BilingualQuestion(
            id = 51635, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écran jamais créé?", listOf("100 pouces", "500 pouces", "1000 pouces", "10000 pouces"), "Tech", "Ce record a été atteint par un écran LED géant installé à Las Vegas, le MSG Sphere, dont la surface extérieure couvre environ 54 000 m²."),
            en = LocalizedContent("What is the largest screen ever created?", listOf("100 inches", "500 inches", "1000 inches", "10000 inches"), "Technology", "This record was achieved by a giant LED screen installed in Las Vegas, the MSG Sphere, whose exterior surface covers about 54,000 square meters."),
            zh = LocalizedContent("有史以来最大的屏幕是什么？", listOf("100英寸", "500英寸", "1000英寸", "10000英寸"), "科技", "这一记录由安装在拉斯维加斯的巨型LED屏幕MSG Sphere实现，其外部表面覆盖约54,000平方米。"),
            es = LocalizedContent("¿Cuál es la pantalla más grande jamás creada?", listOf("100 pulgadas", "500 pulgadas", "1000 pulgadas", "10000 pulgadas"), "Tecnología", "Este récord fue alcanzado por una pantalla LED gigante instalada en Las Vegas, el MSG Sphere, cuya superficie exterior cubre aproximadamente 54,000 metros cuadrados.")
        ),
        BilingualQuestion(
            id = 51636, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'intelligence artificielle a-t-elle gagné au Go?", listOf("2014", "2016", "2018", "2020"), "Tech", "En 2014, le programme AlphaGo a battu le champion européen Fan Hui, marquant la première victoire d'une IA contre un joueur professionnel de Go."),
            en = LocalizedContent("In what year did artificial intelligence win at Go?", listOf("2014", "2016", "2018", "2020"), "Technology", "In 2014, the program AlphaGo defeated European champion Fan Hui, marking the first victory of an AI against a professional Go player."),
            zh = LocalizedContent("人工智能在哪一年赢得了围棋比赛？", listOf("2014", "2016", "2018", "2020"), "科技", "2014年，程序AlphaGo击败了欧洲冠军樊麾，标志着人工智能首次战胜职业围棋选手。"),
            es = LocalizedContent("¿En qué año ganó la inteligencia artificial al Go?", listOf("2014", "2016", "2018", "2020"), "Tecnología", "En 2014, el programa AlphaGo derrotó al campeón europeo Fan Hui, marcando la primera victoria de una IA contra un jugador profesional de Go.")
        ),
        BilingualQuestion(
            id = 51637, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la première intelligence artificielle capable de dialoguer naturellement?", listOf("ELIZA", "JEOPARDY", "ALPHAGO", "CHATGPT"), "Tech", "Le système d'IA Watson, développé par IBM, a été le premier à dialoguer naturellement en battant des champions humains au jeu télévisé Jeopardy! en 2011."),
            en = LocalizedContent("What is the name of the first artificial intelligence capable of natural dialogue?", listOf("ELIZA", "JEOPARDY", "ALPHAGO", "CHATGPT"), "Technology", "IBM's AI system Watson was the first to engage in natural dialogue by beating human champions on the TV game show Jeopardy! in 2011."),
            zh = LocalizedContent("第一个能够自然对话的人工智能叫什么名字？", listOf("ELIZA", "JEOPARDY", "ALPHAGO", "CHATGPT"), "科技", "IBM 的 AI 系统 Watson 是第一个能够自然对话的系统，它在 2011 年击败了人类冠军，赢得了电视游戏节目 Jeopardy!。"),
            es = LocalizedContent("¿Cuál es el nombre de la primera inteligencia artificial capaz de dialogar naturalmente?", listOf("ELIZA", "JEOPARDY", "ALPHAGO", "CHATGPT"), "Tecnología", "El sistema de IA Watson de IBM fue el primero en dialogar naturalmente al vencer a campeones humanos en el programa de televisión Jeopardy! en 2011.")
        ),
        BilingualQuestion(
            id = 51638, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions d'applications sont disponibles sur l'App Store?", listOf("1", "2", "5", "10"), "Tech", "L'App Store d'Apple comptait environ 5 millions d'applications en 2024, un chiffre qui inclut les jeux, utilitaires et apps retirées au fil du temps."),
            en = LocalizedContent("How many millions of apps are available on the App Store?", listOf("1", "2", "5", "10"), "Technology", "Apple's App Store had about 5 million apps in 2024, a figure that includes games, utilities, and apps removed over time."),
            zh = LocalizedContent("App Store 上有多少百万个应用？", listOf("1", "2", "5", "10"), "科技", "苹果的 App Store 在 2024 年约有 500 万个应用，这个数字包括游戏、实用工具以及随时间下架的应用。"),
            es = LocalizedContent("¿Cuántos millones de aplicaciones están disponibles en la App Store?", listOf("1", "2", "5", "10"), "Tecnología", "La App Store de Apple tenía aproximadamente 5 millones de aplicaciones en 2024, una cifra que incluye juegos, utilidades y aplicaciones retiradas con el tiempo.")
        ),
        BilingualQuestion(
            id = 51639, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus gros téléchargement jamais effectué?", listOf("1 TB", "10 TB", "100 TB", "1000 TB"), "Tech", "Le record de 1000 téraoctets a été atteint en 2022 par le télescope spatial James Webb pour le transfert de ses premières données scientifiques."),
            en = LocalizedContent("What is the largest download ever made?", listOf("1 TB", "10 TB", "100 TB", "1000 TB"), "Technology", "The record of 1000 terabytes was achieved in 2022 by the James Webb Space Telescope for transferring its first scientific data."),
            zh = LocalizedContent("有史以来最大的下载量是多少？", listOf("1 TB", "10 TB", "100 TB", "1000 TB"), "科技", "2022 年，詹姆斯·韦伯太空望远镜在传输其首批科学数据时达到了 1000 TB 的记录。"),
            es = LocalizedContent("¿Cuál es la descarga más grande jamás realizada?", listOf("1 TB", "10 TB", "100 TB", "1000 TB"), "Tecnología", "El récord de 1000 terabytes se alcanzó en 2022 por el telescopio espacial James Webb para transferir sus primeros datos científicos.")
        ),
        BilingualQuestion(
            id = 51640, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier ordinateur personnel a-t-il été inventé?", listOf("1971", "1976", "1981", "1984"), "Tech", "Le premier ordinateur personnel, le Kenbak-1, a été créé en 1971 par John Blankenbaker. Il était vendu comme kit et ne possédait pas de microprocesseur."),
            en = LocalizedContent("In what year was the first personal computer invented?", listOf("1971", "1976", "1981", "1984"), "Technology", "The first personal computer, the Kenbak-1, was created in 1971 by John Blankenbaker. It was sold as a kit and did not have a microprocessor."),
            zh = LocalizedContent("第一台个人计算机是在哪一年发明的？", listOf("1971", "1976", "1981", "1984"), "科技", "第一台个人计算机 Kenbak-1 由 John Blankenbaker 于 1971 年创造。它以套件形式出售，没有微处理器。"),
            es = LocalizedContent("¿En qué año se inventó la primera computadora personal?", listOf("1971", "1976", "1981", "1984"), "Tecnología", "La primera computadora personal, la Kenbak-1, fue creada en 1971 por John Blankenbaker. Se vendía como kit y no tenía microprocesador.")
        ),
        BilingualQuestion(
            id = 51641, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du premier navigateur internet?", listOf("Netscape", "Internet Explorer", "Mosaic", "Opera"), "Tech", "Le premier navigateur internet grand public s'appelait Netscape Navigator, mais Internet Explorer a dominé le marché après son lancement par Microsoft en 1995."),
            en = LocalizedContent("What is the name of the first internet browser?", listOf("Netscape", "Internet Explorer", "Mosaic", "Opera"), "Technology", "The first widely used internet browser was called Netscape Navigator, but Internet Explorer dominated the market after its launch by Microsoft in 1995."),
            zh = LocalizedContent("第一个互联网浏览器叫什么名字？", listOf("Netscape", "Internet Explorer", "Mosaic", "Opera"), "科技", "第一个广泛使用的互联网浏览器是 Netscape Navigator，但 Internet Explorer 在 1995 年由微软推出后主导了市场。"),
            es = LocalizedContent("¿Cuál es el nombre del primer navegador de internet?", listOf("Netscape", "Internet Explorer", "Mosaic", "Opera"), "Tecnología", "El primer navegador de internet ampliamente utilizado fue Netscape Navigator, pero Internet Explorer dominó el mercado tras su lanzamiento por Microsoft en 1995.")
        ),
        BilingualQuestion(
            id = 51642, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de pixels la première caméra numérique avait-elle?", listOf("0.01", "0.1", "1", "10"), "Tech", "Développée en 1975 par Steve Sasson chez Kodak, cette caméra expérimentale avait une résolution de 0,01 mégapixel (soit 10 000 pixels)."),
            en = LocalizedContent("How many million pixels did the first digital camera have?", listOf("0.01", "0.1", "1", "10"), "Technology", "Developed in 1975 by Steve Sasson at Kodak, this experimental camera had a resolution of 0.01 megapixels (10,000 pixels)."),
            zh = LocalizedContent("第一台数码相机有多少百万像素？", listOf("0.01", "0.1", "1", "10"), "科技", "1975 年由柯达的 Steve Sasson 开发，这款实验性相机的分辨率为 0.01 兆像素（10,000 像素）。"),
            es = LocalizedContent("¿Cuántos millones de píxeles tenía la primera cámara digital?", listOf("0.01", "0.1", "1", "10"), "Tecnología", "Desarrollada en 1975 por Steve Sasson en Kodak, esta cámara experimental tenía una resolución de 0.01 megapíxeles (10,000 píxeles).")
        ),
        BilingualQuestion(
            id = 51643, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de langues supportées par Google Translate?", listOf("100", "150", "200", "250"), "Tech", "Google Translate supporte environ 250 langues, incluant des langues rares et régionales, grâce à des mises à jour régulières de son système de traduction automatique."),
            en = LocalizedContent("How many languages does Google Translate support?", listOf("100", "150", "200", "250"), "Technology", "Google Translate supports about 250 languages, including rare and regional languages, thanks to regular updates to its machine translation system."),
            zh = LocalizedContent("谷歌翻译支持多少种语言？", listOf("100", "150", "200", "250"), "科技", "谷歌翻译支持约 250 种语言，包括稀有语言和地区语言，这得益于其机器翻译系统的定期更新。"),
            es = LocalizedContent("¿Cuántos idiomas soporta Google Translate?", listOf("100", "150", "200", "250"), "Tecnología", "Google Translate soporta alrededor de 250 idiomas, incluyendo lenguas raras y regionales, gracias a actualizaciones regulares de su sistema de traducción automática.")
        ),
        BilingualQuestion(
            id = 51644, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier meme 'Loss' a-t-il été créé?", listOf("2006", "2008", "2010", "2012"), "Tech", "Le webcomic Ctrl+Alt+Del a publié la bande dessinée controversée \"Loss\" le 2 juin 2006, qui est devenue un mème internet majeur."),
            en = LocalizedContent("In what year was the first 'Loss' meme created?", listOf("2006", "2008", "2010", "2012"), "Technology", "The webcomic Ctrl+Alt+Del published the controversial comic strip \"Loss\" on June 2, 2006, which became a major internet meme."),
            zh = LocalizedContent("第一个“Loss”梗是在哪一年创造的？", listOf("2006", "2008", "2010", "2012"), "科技", "网络漫画 Ctrl+Alt+Del 于 2006 年 6 月 2 日发布了有争议的漫画“Loss”，后来成为一个主要的网络迷因。"),
            es = LocalizedContent("¿En qué año se creó el primer meme 'Loss'?", listOf("2006", "2008", "2010", "2012"), "Tecnología", "El webcómic Ctrl+Alt+Del publicó la controvertida tira cómica \"Loss\" el 2 de junio de 2006, que se convirtió en un meme importante de internet.")
        ),
        BilingualQuestion(
            id = 51645, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus gros datacenter au monde?", listOf("Google", "Amazon", "Facebook", "Microsoft"), "Tech", "Amazon Web Services (AWS) exploite le plus grand datacenter au monde, situé à Boardman, dans l'Oregon, avec une superficie de plus de 100 000 mètres carrés."),
            en = LocalizedContent("What is the largest data center in the world?", listOf("Google", "Amazon", "Facebook", "Microsoft"), "Technology", "Amazon Web Services (AWS) operates the largest data center in the world, located in Boardman, Oregon, with an area of over 100,000 square meters."),
            zh = LocalizedContent("世界上最大的数据中心是哪个？", listOf("Google", "Amazon", "Facebook", "Microsoft"), "科技", "亚马逊网络服务（AWS）运营着世界上最大的数据中心，位于俄勒冈州博德曼，面积超过 10 万平方米。"),
            es = LocalizedContent("¿Cuál es el centro de datos más grande del mundo?", listOf("Google", "Amazon", "Facebook", "Microsoft"), "Tecnología", "Amazon Web Services (AWS) opera el centro de datos más grande del mundo, ubicado en Boardman, Oregón, con un área de más de 100,000 metros cuadrados.")
        ),
        BilingualQuestion(
            id = 51646, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de noms de domaine existent en 2024?", listOf("100", "200", "500", "1000"), "Tech", "En 2024, le nombre total de noms de domaine enregistrés dans le monde atteint environ 500 millions, selon les données de l'industrie, incluant les extensions génériques (.com, .org) et nationales."),
            en = LocalizedContent("How many millions of domain names exist in 2024?", listOf("100", "200", "500", "1000"), "Technology", "In 2024, the total number of registered domain names worldwide reaches about 500 million, according to industry data, including generic (.com, .org) and country-code extensions."),
            zh = LocalizedContent("2024 年有多少百万个域名存在？", listOf("100", "200", "500", "1000"), "科技", "根据行业数据，2024 年全球注册的域名总数达到约 5 亿个，包括通用顶级域（.com、.org）和国家代码顶级域。"),
            es = LocalizedContent("¿Cuántos millones de nombres de dominio existen en 2024?", listOf("100", "200", "500", "1000"), "Tecnología", "En 2024, el número total de nombres de dominio registrados en todo el mundo alcanza aproximadamente 500 millones, según datos de la industria, incluyendo extensiones genéricas (.com, .org) y nacionales.")
        ),
        BilingualQuestion(
            id = 51647, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le langage de programmation le plus payant?", listOf("Python", "Go", "Rust", "TypeScript"), "Tech", "TypeScript est très demandé car il ajoute du typage statique à JavaScript, ce qui réduit les bugs et améliore la maintenabilité des applications complexes. Sa popularité dans les grandes entreprises tech et le développement full-stack en fait un langage particulièrement bien rémunéré."),
            en = LocalizedContent("What is the highest-paying programming language?", listOf("Python", "Go", "Rust", "TypeScript"), "Technology", "TypeScript is in high demand because it adds static typing to JavaScript, reducing bugs and improving maintainability of complex applications. Its popularity in big tech companies and full-stack development makes it a particularly well-paid language."),
            zh = LocalizedContent("哪种编程语言薪资最高？", listOf("Python", "Go", "Rust", "TypeScript"), "科技", "TypeScript 需求很高，因为它为 JavaScript 增加了静态类型，减少了错误并提高了复杂应用的可维护性。它在大型科技公司和全栈开发中的流行使其成为薪资特别高的语言。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación mejor pagado?", listOf("Python", "Go", "Rust", "TypeScript"), "Tecnología", "TypeScript tiene una gran demanda porque añade tipado estático a JavaScript, reduciendo errores y mejorando el mantenimiento de aplicaciones complejas. Su popularidad en grandes empresas tecnológicas y el desarrollo full-stack lo convierte en un lenguaje especialmente bien remunerado.")
        ),
        BilingualQuestion(
            id = 51648, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier robot humanoïde a-t-il été créé?", listOf("1996", "2000", "2004", "2008"), "Tech", "Le premier robot humanoïde, ASIMO, a été présenté par Honda en 1996. Il pouvait marcher sur deux jambes et interagir avec son environnement."),
            en = LocalizedContent("In which year was the first humanoid robot created?", listOf("1996", "2000", "2004", "2008"), "Technology", "The first humanoid robot, ASIMO, was introduced by Honda in 1996. It could walk on two legs and interact with its environment."),
            zh = LocalizedContent("第一个类人机器人是在哪一年创造的？", listOf("1996", "2000", "2004", "2008"), "科技", "第一个类人机器人 ASIMO 由本田在 1996 年推出。它能够用两条腿行走并与环境互动。"),
            es = LocalizedContent("¿En qué año se creó el primer robot humanoide?", listOf("1996", "2000", "2004", "2008"), "Tecnología", "El primer robot humanoide, ASIMO, fue presentado por Honda en 1996. Podía caminar sobre dos piernas e interactuar con su entorno.")
        ),
        BilingualQuestion(
            id = 51649, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de milliards de photos stockées sur Google Photos?", listOf("10", "50", "100", "500"), "Tech", "Google a annoncé en 2023 que Google Photos dépasse les 50 milliards de photos et vidéos téléchargées par les utilisateurs."),
            en = LocalizedContent("How many billions of photos are stored on Google Photos?", listOf("10", "50", "100", "500"), "Technology", "Google announced in 2023 that Google Photos exceeds 50 billion photos and videos uploaded by users."),
            zh = LocalizedContent("Google Photos 存储了多少亿张照片？", listOf("10", "50", "100", "500"), "科技", "谷歌在 2023 年宣布，Google Photos 上用户上传的照片和视频超过 500 亿。"),
            es = LocalizedContent("¿Cuántos miles de millones de fotos se almacenan en Google Photos?", listOf("10", "50", "100", "500"), "Tecnología", "Google anunció en 2023 que Google Photos supera los 50 mil millones de fotos y videos subidos por los usuarios.")
        ),
        BilingualQuestion(
            id = 51650, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de secondes prend le chargement moyen d'une page web en 2024?", listOf("1", "2", "3", "5"), "Tech", "En 2024, le temps de chargement moyen d'une page web est d'environ 3 secondes, selon des études comme celles de Google, car au-delà, le taux d'abandon des utilisateurs augmente significativement."),
            en = LocalizedContent("How many seconds does the average web page load take in 2024?", listOf("1", "2", "3", "5"), "Technology", "In 2024, the average web page load time is about 3 seconds, according to studies like those from Google, because beyond that, user abandonment rates increase significantly."),
            zh = LocalizedContent("2024 年网页平均加载时间是多少秒？", listOf("1", "2", "3", "5"), "科技", "根据谷歌等研究，2024 年网页平均加载时间约为 3 秒，因为超过这个时间，用户放弃率会显著增加。"),
            es = LocalizedContent("¿Cuántos segundos tarda en cargar una página web promedio en 2024?", listOf("1", "2", "3", "5"), "Tecnología", "En 2024, el tiempo de carga promedio de una página web es de aproximadamente 3 segundos, según estudios como los de Google, ya que más allá de eso, la tasa de abandono de usuarios aumenta significativamente.")
        ),
        BilingualQuestion(
            id = 51651, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal a le plus grand cœur du monde?", listOf("Baleine bleue", "Girafe", "Éléphant", "Rhinocéros"), "Nature", "Le cœur d'une baleine bleue peut peser jusqu'à 600 kilogrammes, soit la taille d'une petite voiture, ce qui en fait le plus grand cœur du règne animal."),
            en = LocalizedContent("Which animal has the largest heart in the world?", listOf("Blue whale", "Giraffe", "Elephant", "Rhinoceros"), "Nature", "The heart of a blue whale can weigh up to 600 kilograms, about the size of a small car, making it the largest heart in the animal kingdom."),
            zh = LocalizedContent("哪种动物的心脏最大？", listOf("蓝鲸", "长颈鹿", "大象", "犀牛"), "自然", "蓝鲸的心脏重达 600 公斤，大约相当于一辆小型汽车的大小，是动物王国中最大的心脏。"),
            es = LocalizedContent("¿Qué animal tiene el corazón más grande del mundo?", listOf("Ballena azul", "Jirafa", "Elefante", "Rinoceronte"), "Naturaleza", "El corazón de una ballena azul puede pesar hasta 600 kilogramos, del tamaño de un coche pequeño, lo que lo convierte en el corazón más grande del reino animal.")
        ),
        BilingualQuestion(
            id = 51652, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de cœurs a une pieuvre?", listOf("1", "2", "3", "5"), "Nature", "Les pieuvres ont trois cœurs : deux branchiaux qui pompent le sang vers les branchies et un systémique qui le distribue au reste du corps."),
            en = LocalizedContent("How many hearts does an octopus have?", listOf("1", "2", "3", "5"), "Nature", "Octopuses have three hearts: two branchial hearts that pump blood to the gills and one systemic heart that distributes it to the rest of the body."),
            zh = LocalizedContent("章鱼有几个心脏？", listOf("1", "2", "3", "5"), "自然", "章鱼有三个心脏：两个鳃心将血液泵送到鳃，一个体心将血液分配到身体其他部位。"),
            es = LocalizedContent("¿Cuántos corazones tiene un pulpo?", listOf("1", "2", "3", "5"), "Naturaleza", "Los pulpos tienen tres corazones: dos branquiales que bombean sangre a las branquias y uno sistémico que la distribuye al resto del cuerpo.")
        ),
        BilingualQuestion(
            id = 51653, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal le plus profond jamais observé?", listOf("Poisson des abysses", "Calmar géant", "Requin des profondeurs", "Méduse géante"), "Nature", "Un requin des profondeurs a été filmé à plus de 2 700 mètres de profondeur, battant le record de l'animal vertébré le plus profond jamais observé."),
            en = LocalizedContent("What is the deepest animal ever observed?", listOf("Abyssal fish", "Giant squid", "Deep-sea shark", "Giant jellyfish"), "Nature", "A deep-sea shark was filmed at over 2,700 meters depth, breaking the record for the deepest observed vertebrate animal."),
            zh = LocalizedContent("有史以来观察到的最深的动物是什么？", listOf("深海鱼", "巨型乌贼", "深海鲨鱼", "巨型水母"), "自然", "一条深海鲨鱼在超过 2700 米的深度被拍摄到，打破了有史以来观察到的最深脊椎动物的记录。"),
            es = LocalizedContent("¿Cuál es el animal más profundo jamás observado?", listOf("Pez abisal", "Calamar gigante", "Tiburón de profundidad", "Medusa gigante"), "Naturaleza", "Un tiburón de profundidad fue filmado a más de 2.700 metros de profundidad, batiendo el récord del animal vertebrado más profundo jamás observado.")
        ),
        BilingualQuestion(
            id = 51654, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("À quelle profondeur se trouve la Fosse des Mariannes?", listOf("5000m", "7000m", "10000m", "15000m"), "Nature", "La Fosse des Mariannes est l'endroit le plus profond des océans, atteignant environ 11 000 mètres, et non 15 000 mètres comme indiqué. Cette profondeur a été mesurée par des sondes modernes."),
            en = LocalizedContent("At what depth is the Mariana Trench?", listOf("5000m", "7000m", "10000m", "15000m"), "Nature", "The Mariana Trench is the deepest part of the oceans, reaching about 11,000 meters, not 15,000 meters as indicated. This depth has been measured by modern probes."),
            zh = LocalizedContent("马里亚纳海沟的深度是多少？", listOf("5000米", "7000米", "10000米", "15000米"), "自然", "马里亚纳海沟是海洋中最深的地方，深度约 11000 米，而不是 15000 米。这一深度已由现代探测器测量。"),
            es = LocalizedContent("¿A qué profundidad se encuentra la Fosa de las Marianas?", listOf("5000m", "7000m", "10000m", "15000m"), "Naturaleza", "La Fosa de las Marianas es el lugar más profundo de los océanos, alcanzando unos 11.000 metros, no 15.000 metros como se indica. Esta profundidad ha sido medida por sondas modernas.")
        ),
        BilingualQuestion(
            id = 51656, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de mètres mesure l'arbre le plus haut du monde?", listOf("100m", "110m", "120m", "150m"), "Nature", "L'Hyperion, un séquoia à feuilles d'if situé en Californie, détient le record avec 115,92 mètres, mais l'estimation commune retient environ 110 mètres."),
            en = LocalizedContent("How many meters tall is the tallest tree in the world?", listOf("100m", "110m", "120m", "150m"), "Nature", "Hyperion, a coast redwood in California, holds the record at 115.92 meters, but the common estimate is around 110 meters."),
            zh = LocalizedContent("世界上最高的树有多少米？", listOf("100米", "110米", "120米", "150米"), "自然", "位于加利福尼亚的北美红杉 Hyperion 以 115.92 米的高度保持纪录，但通常估计约为 110 米。"),
            es = LocalizedContent("¿Cuántos metros mide el árbol más alto del mundo?", listOf("100m", "110m", "120m", "150m"), "Naturaleza", "Hyperion, una secoya roja en California, ostenta el récord con 115,92 metros, pero la estimación común es de unos 110 metros.")
        ),
        BilingualQuestion(
            id = 51657, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal peut survivre le plus longtemps sans manger?", listOf("Ours", "Requin", "Tardigrade", "Baleine"), "Nature", "Le tardigrade, aussi appelé ourson d'eau, peut entrer en cryptobiose et survivre des décennies sans nourriture, voire plus, en état de déshydratation extrême."),
            en = LocalizedContent("Which animal can survive the longest without eating?", listOf("Bear", "Shark", "Tardigrade", "Whale"), "Nature", "The tardigrade, also known as water bear, can enter cryptobiosis and survive for decades without food, or even longer, in a state of extreme dehydration."),
            zh = LocalizedContent("哪种动物不吃东西能存活最久？", listOf("熊", "鲨鱼", "水熊虫", "鲸鱼"), "自然", "水熊虫，也称为缓步动物，可以进入隐生状态，在极端脱水状态下不吃东西存活数十年甚至更久。"),
            es = LocalizedContent("¿Qué animal puede sobrevivir más tiempo sin comer?", listOf("Oso", "Tiburón", "Tardígrado", "Ballena"), "Naturaleza", "El tardígrado, también conocido como oso de agua, puede entrar en criptobiosis y sobrevivir décadas sin comida, o incluso más, en un estado de deshidratación extrema.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51659, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("À quelle vitesse le guépard peut-il courir?", listOf("80 km/h", "100 km/h", "120 km/h", "150 km/h"), "Nature", "Le guépard est l'animal terrestre le plus rapide, capable d'atteindre 80 km/h en quelques secondes grâce à sa morphologie adaptée à la course."),
            en = LocalizedContent("How fast can a cheetah run?", listOf("80 km/h", "100 km/h", "120 km/h", "150 km/h"), "Nature", "The cheetah is the fastest land animal, capable of reaching 80 km/h in a few seconds thanks to its morphology adapted for running."),
            zh = LocalizedContent("猎豹能跑多快？", listOf("80公里/小时", "100公里/小时", "120公里/小时", "150公里/小时"), "自然", "猎豹是陆地上速度最快的动物，凭借其适应奔跑的形态，能在几秒内达到80公里/小时。"),
            es = LocalizedContent("¿A qué velocidad puede correr un guepardo?", listOf("80 km/h", "100 km/h", "120 km/h", "150 km/h"), "Naturaleza", "El guepardo es el animal terrestre más rápido, capaz de alcanzar 80 km/h en pocos segundos gracias a su morfología adaptada para la carrera.")
        ),
        BilingualQuestion(
            id = 51660, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal le plus lent du monde?", listOf("Tortue", "Paresseux", "Limace", "Escargot"), "Nature", "Le paresseux est considéré comme l'animal le plus lent au monde, avec une vitesse maximale d'environ 0,27 km/h. Cette lenteur est due à son métabolisme très bas et à son régime alimentaire pauvre en énergie."),
            en = LocalizedContent("What is the slowest animal in the world?", listOf("Turtle", "Sloth", "Slug", "Snail"), "Nature", "The sloth is considered the slowest animal in the world, with a maximum speed of about 0.27 km/h. This slowness is due to its very low metabolism and low-energy diet."),
            zh = LocalizedContent("世界上最慢的动物是什么？", listOf("乌龟", "树懒", "蛞蝓", "蜗牛"), "自然", "树懒被认为是世界上最慢的动物，最高速度约为0.27公里/小时。这种缓慢是由于其极低的新陈代谢和低能量饮食。"),
            es = LocalizedContent("¿Cuál es el animal más lento del mundo?", listOf("Tortuga", "Perezoso", "Babosa", "Caracol"), "Naturaleza", "El perezoso es considerado el animal más lento del mundo, con una velocidad máxima de aproximadamente 0,27 km/h. Esta lentitud se debe a su metabolismo muy bajo y a su dieta baja en energía.")
        ),
        BilingualQuestion(
            id = 51662, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel insecte peut voler le plus vite?", listOf("Libellule", "Abeille", "Frelon", "Papillon"), "Nature", "Le papillon de nuit, notamment le sphinx, peut atteindre des vitesses de vol allant jusqu'à 50 km/h, ce qui en fait l'insecte le plus rapide en vol."),
            en = LocalizedContent("Which insect can fly the fastest?", listOf("Dragonfly", "Bee", "Hornet", "Butterfly"), "Nature", "The hawk moth, particularly the sphinx moth, can reach flight speeds of up to 50 km/h, making it the fastest flying insect."),
            zh = LocalizedContent("哪种昆虫飞得最快？", listOf("蜻蜓", "蜜蜂", "大黄蜂", "蝴蝶"), "自然", "天蛾，特别是斯芬克斯蛾，飞行速度可达50公里/小时，是飞行最快的昆虫。"),
            es = LocalizedContent("¿Qué insecto puede volar más rápido?", listOf("Libélula", "Abeja", "Avispón", "Mariposa"), "Naturaleza", "La polilla esfinge, especialmente la esfinge, puede alcanzar velocidades de vuelo de hasta 50 km/h, lo que la convierte en el insecto volador más rápido.")
        ),
        BilingualQuestion(
            id = 51663, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("À quelle vitesse la libellule peut-elle voler?", listOf("30 km/h", "50 km/h", "80 km/h", "150 km/h"), "Nature", "La libellule est l'un des insectes les plus rapides, atteignant environ 30 km/h en vol grâce à ses deux paires d'ailes indépendantes."),
            en = LocalizedContent("How fast can a dragonfly fly?", listOf("30 km/h", "50 km/h", "80 km/h", "150 km/h"), "Nature", "The dragonfly is one of the fastest insects, reaching about 30 km/h in flight thanks to its two pairs of independent wings."),
            zh = LocalizedContent("蜻蜓能飞多快？", listOf("30公里/小时", "50公里/小时", "80公里/小时", "150公里/小时"), "自然", "蜻蜓是最快的昆虫之一，凭借其两对独立的翅膀，飞行速度可达约30公里/小时。"),
            es = LocalizedContent("¿A qué velocidad puede volar una libélula?", listOf("30 km/h", "50 km/h", "80 km/h", "150 km/h"), "Naturaleza", "La libélula es uno de los insectos más rápidos, alcanzando unos 30 km/h en vuelo gracias a sus dos pares de alas independientes.")
        ),
        BilingualQuestion(
            id = 51664, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus gros insecte jamais découvert?", listOf("Scarabée Goliath", "Insecte bâton", "Cafard préhistorique", "Sauterelle"), "Nature", "Le Phrygane géant (ou insecte-bâton géant) de l'île de Bornéo peut atteindre 56 centimètres de long, ce qui en fait le plus long insecte connu."),
            en = LocalizedContent("What is the largest insect ever discovered?", listOf("Goliath beetle", "Stick insect", "Prehistoric cockroach", "Grasshopper"), "Nature", "The giant stick insect from Borneo can reach 56 centimeters in length, making it the longest known insect."),
            zh = LocalizedContent("有史以来发现的最大昆虫是什么？", listOf("歌利亚甲虫", "竹节虫", "史前蟑螂", "蚱蜢"), "自然", "来自婆罗洲的巨型竹节虫体长可达56厘米，是已知最长的昆虫。"),
            es = LocalizedContent("¿Cuál es el insecto más grande jamás descubierto?", listOf("Escarabajo Goliat", "Insecto palo", "Cucaracha prehistórica", "Saltamontes"), "Naturaleza", "El insecto palo gigante de Borneo puede alcanzar 56 centímetros de largo, lo que lo convierte en el insecto más largo conocido.")
        ),
        BilingualQuestion(
            id = 51665, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de dents a un requin blanc?", listOf("100", "200", "300", "500"), "Nature", "Le grand requin blanc possède environ 300 dents disposées en plusieurs rangées, qui se renouvellent continuellement tout au long de sa vie."),
            en = LocalizedContent("How many teeth does a great white shark have?", listOf("100", "200", "300", "500"), "Nature", "The great white shark has about 300 teeth arranged in several rows, which are continuously replaced throughout its life."),
            zh = LocalizedContent("大白鲨有多少颗牙齿？", listOf("100", "200", "300", "500"), "自然", "大白鲨约有300颗牙齿，排列成几排，在其一生中不断更换。"),
            es = LocalizedContent("¿Cuántos dientes tiene un tiburón blanco?", listOf("100", "200", "300", "500"), "Naturaleza", "El gran tiburón blanco posee aproximadamente 300 dientes dispuestos en varias filas, que se renuevan continuamente a lo largo de su vida.")
        ),
        BilingualQuestion(
            id = 51666, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal produit du venin le plus puissant?", listOf("Cobra", "Araignée Sydney", "Poisson-pierre", "Méduse-boîte"), "Nature", "Le venin de la méduse-boîte est considéré comme le plus puissant au monde, capable de tuer un humain en quelques minutes."),
            en = LocalizedContent("Which animal produces the most powerful venom?", listOf("Cobra", "Sydney funnel-web spider", "Stonefish", "Box jellyfish"), "Nature", "The venom of the box jellyfish is considered the most powerful in the world, capable of killing a human in minutes."),
            zh = LocalizedContent("哪种动物产生的毒液最强？", listOf("眼镜蛇", "悉尼漏斗网蜘蛛", "石头鱼", "箱形水母"), "自然", "箱形水母的毒液被认为是世界上最强的，能在几分钟内杀死一个人。"),
            es = LocalizedContent("¿Qué animal produce el veneno más potente?", listOf("Cobra", "Araña de embudo de Sídney", "Pez piedra", "Medusa de caja"), "Naturaleza", "El veneno de la medusa de caja se considera el más potente del mundo, capaz de matar a un humano en minutos.")
        ),
        BilingualQuestion(
            id = 51667, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de nerfs optiques a un cerf?", listOf("1", "2", "3", "4"), "Nature", "Le cerf, comme tous les mammifères, possède une paire de nerfs optiques, mais ils sont considérés comme un seul nerf optique par œil, donc au total un nerf optique par œil, soit deux nerfs optiques."),
            en = LocalizedContent("How many optic nerves does a deer have?", listOf("1", "2", "3", "4"), "Nature", "Deer, like all mammals, have a pair of optic nerves, but they are considered one optic nerve per eye, so a total of two optic nerves."),
            zh = LocalizedContent("鹿有多少条视神经？", listOf("1", "2", "3", "4"), "自然", "鹿和所有哺乳动物一样，有一对视神经，但每只眼睛被认为有一条视神经，所以总共两条视神经。"),
            es = LocalizedContent("¿Cuántos nervios ópticos tiene un ciervo?", listOf("1", "2", "3", "4"), "Naturaleza", "El ciervo, como todos los mamíferos, posee un par de nervios ópticos, pero se considera un nervio óptico por ojo, por lo que en total son dos nervios ópticos.")
        ),
        BilingualQuestion(
            id = 51668, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal peut retenir sa respiration le plus longtemps?", listOf("Baleine", "Phoque", "Castor", "Loutre"), "Nature", "Les phoques peuvent retenir leur respiration jusqu'à deux heures grâce à une forte concentration en myoglobine et à un métabolisme adapté à la plongée."),
            en = LocalizedContent("Which animal can hold its breath the longest?", listOf("Whale", "Seal", "Beaver", "Otter"), "Nature", "Seals can hold their breath for up to two hours thanks to a high concentration of myoglobin and a metabolism adapted to diving."),
            zh = LocalizedContent("哪种动物能屏住呼吸最长时间？", listOf("鲸鱼", "海豹", "河狸", "水獭"), "自然", "海豹可以屏住呼吸长达两小时，这得益于高浓度的肌红蛋白和适应潜水的代谢。"),
            es = LocalizedContent("¿Qué animal puede aguantar la respiración más tiempo?", listOf("Ballena", "Foca", "Castor", "Nutria"), "Naturaleza", "Las focas pueden aguantar la respiración hasta dos horas gracias a una alta concentración de mioglobina y un metabolismo adaptado al buceo.")
        ),
        BilingualQuestion(
            id = 51669, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de temps une baleine peut-elle retenir sa respiration?", listOf("30 min", "1h", "2h", "4h"), "Nature", "Les baleines à bec de Cuvier détiennent le record de plongée chez les mammifères marins, avec une apnée pouvant atteindre 2 heures. Cette adaptation leur permet de chasser en profondeur."),
            en = LocalizedContent("How long can a whale hold its breath?", listOf("30 min", "1h", "2h", "4h"), "Nature", "Cuvier's beaked whales hold the diving record among marine mammals, with apnea lasting up to 2 hours. This adaptation allows them to hunt at depth."),
            zh = LocalizedContent("鲸鱼能屏住呼吸多长时间？", listOf("30分钟", "1小时", "2小时", "4小时"), "自然", "柯氏喙鲸保持着海洋哺乳动物的潜水记录，屏气时间可达2小时。这种适应能力使它们能够在深水捕食。"),
            es = LocalizedContent("¿Cuánto tiempo puede aguantar la respiración una ballena?", listOf("30 min", "1h", "2h", "4h"), "Naturaleza", "Los zifios de Cuvier tienen el récord de buceo entre los mamíferos marinos, con una apnea que puede alcanzar las 2 horas. Esta adaptación les permite cazar en profundidad.")
        ),
        BilingualQuestion(
            id = 51671, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de kilos pèse l'éléphant le plus lourd jamais observé?", listOf("6000", "8000", "10000", "12000"), "Nature", "L'éléphant le plus lourd jamais enregistré pesait environ 6 000 kg, soit six tonnes. Ce record a été observé chez un éléphant d'Afrique mâle."),
            en = LocalizedContent("How many kilograms did the heaviest elephant ever observed weigh?", listOf("6000", "8000", "10000", "12000"), "Nature", "The heaviest elephant ever recorded weighed about 6,000 kg, or six tons. This record was observed in a male African elephant."),
            zh = LocalizedContent("有记录以来最重的大象重多少公斤？", listOf("6000", "8000", "10000", "12000"), "自然", "有记录以来最重的大象重约6000公斤，即六吨。这一记录是在一头非洲公象身上观察到的。"),
            es = LocalizedContent("¿Cuántos kilogramos pesaba el elefante más pesado jamás observado?", listOf("6000", "8000", "10000", "12000"), "Naturaleza", "El elefante más pesado registrado pesaba aproximadamente 6.000 kg, es decir, seis toneladas. Este récord se observó en un elefante africano macho.")
        ),
        BilingualQuestion(
            id = 51672, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal a la meilleure vision?", listOf("Aigle", "Faucon", "Lynx", "Chat"), "Nature", "Le faucon possède une acuité visuelle exceptionnelle, jusqu'à 8 fois supérieure à celle de l'homme, lui permettant de repérer ses proies à plus d'un kilomètre de distance."),
            en = LocalizedContent("Which animal has the best vision?", listOf("Eagle", "Falcon", "Lynx", "Cat"), "Nature", "The falcon has exceptional visual acuity, up to 8 times that of humans, allowing it to spot prey from more than a kilometer away."),
            zh = LocalizedContent("哪种动物视力最好？", listOf("鹰", "隼", "猞猁", "猫"), "自然", "隼拥有非凡的视觉敏锐度，高达人类的8倍，使其能够在一公里外发现猎物。"),
            es = LocalizedContent("¿Qué animal tiene la mejor visión?", listOf("Águila", "Halcón", "Lince", "Gato"), "Naturaleza", "El halcón posee una agudeza visual excepcional, hasta 8 veces superior a la humana, lo que le permite detectar presas a más de un kilómetro de distancia.")
        ),
        BilingualQuestion(
            id = 51673, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de fois meilleure est la vision du faucon par rapport à l'homme?", listOf("2x", "5x", "8x", "10x"), "Nature", "Le faucon possède une acuité visuelle environ huit fois supérieure à celle de l'homme, grâce à une densité plus élevée de photorécepteurs dans sa rétine."),
            en = LocalizedContent("How many times better is the falcon's vision compared to humans?", listOf("2x", "5x", "8x", "10x"), "Nature", "The falcon has visual acuity about eight times that of humans, thanks to a higher density of photoreceptors in its retina."),
            zh = LocalizedContent("隼的视力比人类好多少倍？", listOf("2倍", "5倍", "8倍", "10倍"), "自然", "隼的视觉敏锐度约为人类的8倍，这得益于其视网膜中更高密度的光感受器。"),
            es = LocalizedContent("¿Cuántas veces mejor es la visión del halcón en comparación con la humana?", listOf("2x", "5x", "8x", "10x"), "Naturaleza", "El halcón tiene una agudeza visual aproximadamente ocho veces superior a la humana, gracias a una mayor densidad de fotorreceptores en su retina.")
        ),
        BilingualQuestion(
            id = 51674, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand prédateur marin jamais découvert?", listOf("Requin blanc", "Méga-requin", "Léviathan", "Mégalodon"), "Nature", "Le Mégalodon, un requin préhistorique géant, est considéré comme le plus grand prédateur marin ayant existé, avec une taille estimée pouvant atteindre 18 mètres."),
            en = LocalizedContent("What is the largest marine predator ever discovered?", listOf("Great white shark", "Mega-shark", "Leviathan", "Megalodon"), "Nature", "The Megalodon, a giant prehistoric shark, is considered the largest marine predator to have ever existed, with an estimated size reaching up to 18 meters."),
            zh = LocalizedContent("有史以来发现的最大海洋捕食者是什么？", listOf("大白鲨", "巨鲨", "利维坦", "巨齿鲨"), "自然", "巨齿鲨是一种巨大的史前鲨鱼，被认为是存在过的最大海洋捕食者，估计体型可达18米。"),
            es = LocalizedContent("¿Cuál es el mayor depredador marino jamás descubierto?", listOf("Tiburón blanco", "Mega-tiburón", "Leviatán", "Megalodón"), "Naturaleza", "El Megalodón, un tiburón prehistórico gigante, es considerado el mayor depredador marino que haya existido, con un tamaño estimado de hasta 18 metros.")
        ),
        BilingualQuestion(
            id = 51675, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("À quelle taille pouvait atteindre un mégalodon?", listOf("12m", "15m", "18m", "25m"), "Nature", "Le mégalodon, un requin préhistorique, atteignait environ 12 mètres de long, soit la taille d’un bus scolaire, d’après les estimations basées sur ses dents fossilisées."),
            en = LocalizedContent("What size could a megalodon reach?", listOf("12m", "15m", "18m", "25m"), "Nature", "The megalodon, a prehistoric shark, reached about 12 meters in length, the size of a school bus, based on estimates from its fossilized teeth."),
            zh = LocalizedContent("巨齿鲨能达到多大尺寸？", listOf("12米", "15米", "18米", "25米"), "自然", "巨齿鲨是一种史前鲨鱼，根据其化石牙齿的估计，体长约12米，相当于一辆校车的大小。"),
            es = LocalizedContent("¿Qué tamaño podía alcanzar un megalodón?", listOf("12m", "15m", "18m", "25m"), "Naturaleza", "El megalodón, un tiburón prehistórico, alcanzaba unos 12 metros de largo, el tamaño de un autobús escolar, según estimaciones basadas en sus dientes fosilizados.")
        ),
        BilingualQuestion(
            id = 51676, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal a le plus grand nombre de muscles?", listOf("Éléphant", "Baleine", "Octopus", "Humain"), "Nature", "La baleine bleue possède le plus grand nombre de muscles de tous les animaux, avec environ 700 muscles, nécessaires pour propulser son corps massif dans l'eau."),
            en = LocalizedContent("Which animal has the largest number of muscles?", listOf("Elephant", "Whale", "Octopus", "Human"), "Nature", "The blue whale has the largest number of muscles of any animal, with about 700 muscles, necessary to propel its massive body through water."),
            zh = LocalizedContent("哪种动物的肌肉数量最多？", listOf("大象", "鲸鱼", "章鱼", "人类"), "自然", "蓝鲸拥有所有动物中最多的肌肉，约700块，用于推动其庞大的身体在水中前进。"),
            es = LocalizedContent("¿Qué animal tiene el mayor número de músculos?", listOf("Elefante", "Ballena", "Pulpo", "Humano"), "Naturaleza", "La ballena azul tiene la mayor cantidad de músculos de cualquier animal, con aproximadamente 700 músculos, necesarios para impulsar su cuerpo masivo en el agua.")
        ),
        BilingualQuestion(
            id = 51677, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de muscles a un octopus?", listOf("1000", "10000", "100000", "1000000"), "Nature", "Un poulpe possède environ 100 000 muscles, ce qui lui permet un contrôle extrêmement fin de ses tentacules, chacun capable de mouvements indépendants et précis."),
            en = LocalizedContent("How many muscles does an octopus have?", listOf("1000", "10000", "100000", "1000000"), "Nature", "An octopus has about 100,000 muscles, allowing extremely fine control of its tentacles, each capable of independent and precise movements."),
            zh = LocalizedContent("章鱼有多少块肌肉？", listOf("1000", "10000", "100000", "1000000"), "自然", "章鱼约有10万块肌肉，使其能够极其精细地控制触手，每条触手都能独立进行精确运动。"),
            es = LocalizedContent("¿Cuántos músculos tiene un pulpo?", listOf("1000", "10000", "100000", "1000000"), "Naturaleza", "Un pulpo tiene aproximadamente 100.000 músculos, lo que le permite un control extremadamente fino de sus tentáculos, cada uno capaz de movimientos independientes y precisos.")
        ),
        BilingualQuestion(
            id = 51678, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus gros oiseau jamais découvert?", listOf("Autruche", "Émeu", "Maoa narinui", "Moa"), "Nature", "Le moa, un oiseau géant incapable de voler de Nouvelle-Zélande, pouvait atteindre 3,6 mètres de haut et peser jusqu'à 250 kilogrammes. Il a disparu après l'arrivée des humains sur l'île."),
            en = LocalizedContent("What is the largest bird ever discovered?", listOf("Ostrich", "Emu", "Maoa narinui", "Moa"), "Nature", "The moa, a giant flightless bird from New Zealand, could reach 3.6 meters in height and weigh up to 250 kilograms. It went extinct after humans arrived on the island."),
            zh = LocalizedContent("有史以来发现的最大鸟类是什么？", listOf("鸵鸟", "鸸鹋", "Maoa narinui", "恐鸟"), "自然", "恐鸟是一种来自新西兰的巨型不会飞的鸟，身高可达3.6米，体重可达250公斤。人类到达该岛后，它便灭绝了。"),
            es = LocalizedContent("¿Cuál es el ave más grande jamás descubierta?", listOf("Avestruz", "Emú", "Maoa narinui", "Moa"), "Naturaleza", "El moa, un ave gigante no voladora de Nueva Zelanda, podía alcanzar 3,6 metros de altura y pesar hasta 250 kilogramos. Se extinguió después de la llegada de los humanos a la isla.")
        ),
        BilingualQuestion(
            id = 51679, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel oiseau peut voler le plus haut?", listOf("Aigles", "Oies", "Grues", "Vautours"), "Nature", "Les aigles peuvent atteindre des altitudes de plus de 7 000 mètres, utilisant les courants thermiques pour planer à très haute hauteur."),
            en = LocalizedContent("Which bird can fly the highest?", listOf("Eagles", "Geese", "Cranes", "Vultures"), "Nature", "Eagles can reach altitudes of over 7,000 meters, using thermal currents to soar at very high heights."),
            zh = LocalizedContent("哪种鸟飞得最高？", listOf("鹰", "鹅", "鹤", "秃鹫"), "自然", "鹰可以飞到7000米以上的高度，利用热气流在高空翱翔。"),
            es = LocalizedContent("¿Qué ave puede volar más alto?", listOf("Águilas", "Gansos", "Grullas", "Buitres"), "Naturaleza", "Las águilas pueden alcanzar altitudes de más de 7.000 metros, utilizando corrientes térmicas para planear a gran altura.")
        ),
        BilingualQuestion(
            id = 51680, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("À quelle altitude les vautours peuvent-ils voler?", listOf("5000m", "8000m", "11000m", "15000m"), "Nature", "Les vautours utilisent les courants thermiques pour s'élever à très haute altitude, jusqu'à 8000 mètres, ce qui leur permet de repérer des carcasses sur de vastes distances."),
            en = LocalizedContent("At what altitude can vultures fly?", listOf("5000m", "8000m", "11000m", "15000m"), "Nature", "Vultures use thermal currents to rise to very high altitudes, up to 8,000 meters, allowing them to spot carcasses over vast distances."),
            zh = LocalizedContent("秃鹫能飞到多高？", listOf("5000米", "8000米", "11000米", "15000米"), "自然", "秃鹫利用热气流上升到非常高的高度，可达8000米，使它们能够在广阔的距离内发现尸体。"),
            es = LocalizedContent("¿A qué altitud pueden volar los buitres?", listOf("5000m", "8000m", "11000m", "15000m"), "Naturaleza", "Los buitres utilizan corrientes térmicas para elevarse a altitudes muy altas, hasta 8.000 metros, lo que les permite localizar carroña a grandes distancias.")
        ),
    )
}
