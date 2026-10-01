package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 15 : 500 questions bilingues */
object QuestionsBilingualGenerated_15 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 21111, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue Forrest Gump ?", listOf("Tom Hanks", "Robin Williams", "Jim Carrey", "Bill Murray"), "Cinéma", "Tom Hanks a incarné Forrest Gump dans le film éponyme de 1994, réalisé par Robert Zemeckis, et a remporté l'Oscar du meilleur acteur pour ce rôle."),
            en = LocalizedContent("Which actor plays Forrest Gump?", listOf("Tom Hanks", "Robin Williams", "Jim Carrey", "Bill Murray"), "Cinema", "Tom Hanks portrayed Forrest Gump in the 1994 film of the same name, directed by Robert Zemeckis, and won the Academy Award for Best Actor for this role."),
            zh = LocalizedContent("哪位演员饰演阿甘？", listOf("汤姆·汉克斯", "罗宾·威廉姆斯", "金·凯瑞", "比尔·默瑞"), "电影", "汤姆·汉克斯在1994年由罗伯特·泽米吉斯执导的同名电影中饰演阿甘，并凭借此角色获得奥斯卡最佳男主角奖。"),
            es = LocalizedContent("¿Qué actor interpreta a Forrest Gump?", listOf("Tom Hanks", "Robin Williams", "Jim Carrey", "Bill Murray"), "Cine", "Tom Hanks interpretó a Forrest Gump en la película homónima de 1994, dirigida por Robert Zemeckis, y ganó el Óscar al mejor actor por este papel.")
        ),
        BilingualQuestion(
            id = 21112, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur est connu pour ses films de suspense comme 'Psychose' ?", listOf("Alfred Hitchcock", "Stanley Kubrick", "David Lynch", "Roman Polanski"), "Cinéma", "Alfred Hitchcock est surnommé le \"maître du suspense\" pour ses techniques narratives innovantes. Psychose (1960) est l'un de ses films les plus emblématiques, révolutionnant le genre du thriller psychologique."),
            en = LocalizedContent("Which director is known for suspense films like 'Psycho'?", listOf("Alfred Hitchcock", "Stanley Kubrick", "David Lynch", "Roman Polanski"), "Cinema", "Alfred Hitchcock is called the \"master of suspense\" for his innovative narrative techniques. Psycho (1960) is one of his most iconic films, revolutionizing the psychological thriller genre."),
            zh = LocalizedContent("哪位导演以《惊魂记》等悬疑电影闻名？", listOf("阿尔弗雷德·希区柯克", "斯坦利·库布里克", "大卫·林奇", "罗曼·波兰斯基"), "电影", "阿尔弗雷德·希区柯克因其创新的叙事技巧被称为“悬念大师”。《惊魂记》（1960）是他最具标志性的电影之一，革新了心理惊悚片类型。"),
            es = LocalizedContent("¿Qué director es conocido por sus películas de suspense como 'Psicosis'?", listOf("Alfred Hitchcock", "Stanley Kubrick", "David Lynch", "Roman Polanski"), "Cine", "Alfred Hitchcock es apodado el \"maestro del suspense\" por sus innovadoras técnicas narrativas. Psicosis (1960) es una de sus películas más emblemáticas, revolucionando el género del thriller psicológico.")
        ),
        BilingualQuestion(
            id = 21113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de films composent la saga 'Le Seigneur des Anneaux' (trilogie originale) ?", listOf("3", "2", "4", "5"), "Cinéma", "La trilogie originale du Seigneur des Anneaux, réalisée par Peter Jackson, est composée de trois films : La Communauté de l'Anneau, Les Deux Tours et Le Retour du Roi."),
            en = LocalizedContent("How many films make up the original 'The Lord of the Rings' trilogy?", listOf("3", "2", "4", "5"), "Cinema", "The original Lord of the Rings trilogy, directed by Peter Jackson, consists of three films: The Fellowship of the Ring, The Two Towers, and The Return of the King."),
            zh = LocalizedContent("原版《指环王》三部曲由几部电影组成？", listOf("3", "2", "4", "5"), "电影", "由彼得·杰克逊执导的原版《指环王》三部曲包括三部电影：《护戒使者》、《双塔奇兵》和《王者归来》。"),
            es = LocalizedContent("¿Cuántas películas componen la trilogía original de 'El Señor de los Anillos'?", listOf("3", "2", "4", "5"), "Cine", "La trilogía original de El Señor de los Anillos, dirigida por Peter Jackson, consta de tres películas: La Comunidad del Anillo, Las Dos Torres y El Retorno del Rey.")
        ),
        BilingualQuestion(
            id = 21114, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle actrice joue Katniss Everdeen dans 'Hunger Games' ?", listOf("Jennifer Lawrence", "Emma Stone", "Scarlett Johansson", "Shailene Woodley"), "Cinéma", "Jennifer Lawrence a été choisie pour incarner Katniss Everdeen dans l'adaptation cinématographique de la trilogie de Suzanne Collins, un rôle qui a propulsé sa carrière."),
            en = LocalizedContent("Which actress plays Katniss Everdeen in 'The Hunger Games'?", listOf("Jennifer Lawrence", "Emma Stone", "Scarlett Johansson", "Shailene Woodley"), "Cinema", "Jennifer Lawrence was chosen to portray Katniss Everdeen in the film adaptation of Suzanne Collins' trilogy, a role that propelled her career."),
            zh = LocalizedContent("哪位女演员在《饥饿游戏》中饰演凯特尼斯·伊夫狄恩？", listOf("詹妮弗·劳伦斯", "艾玛·斯通", "斯嘉丽·约翰逊", "谢琳·伍德蕾"), "电影", "詹妮弗·劳伦斯被选中在苏珊·柯林斯三部曲的电影改编中饰演凯特尼斯·伊夫狄恩，这个角色推动了她的职业生涯。"),
            es = LocalizedContent("¿Qué actriz interpreta a Katniss Everdeen en 'Los Juegos del Hambre'?", listOf("Jennifer Lawrence", "Emma Stone", "Scarlett Johansson", "Shailene Woodley"), "Cine", "Jennifer Lawrence fue elegida para interpretar a Katniss Everdeen en la adaptación cinematográfica de la trilogía de Suzanne Collins, un papel que impulsó su carrera.")
        ),
        BilingualQuestion(
            id = 21115, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de Kubrick se déroule dans un hôtel hanté ?", listOf("Shining", "2001: L'Odyssée de l'espace", "Orange mécanique", "Eyes Wide Shut"), "Cinéma", "Adapté du roman de Stephen King, ce film de Stanley Kubrick suit l'écrivain Jack Torrance et sa famille, gardiens d'un hôtel isolé dans les montagnes où des phénomènes paranormaux se produisent."),
            en = LocalizedContent("Which Kubrick film is set in a haunted hotel?", listOf("The Shining", "2001: A Space Odyssey", "A Clockwork Orange", "Eyes Wide Shut"), "Cinema", "Adapted from Stephen King's novel, this Stanley Kubrick film follows writer Jack Torrance and his family, caretakers of an isolated mountain hotel where paranormal phenomena occur."),
            zh = LocalizedContent("库布里克的哪部电影以闹鬼酒店为背景？", listOf("《闪灵》", "《2001太空漫游》", "《发条橙》", "《大开眼戒》"), "电影", "改编自斯蒂芬·金的小说，这部斯坦利·库布里克的电影讲述了作家杰克·托伦斯和他的家人，作为一座偏僻山区酒店的看管人，那里发生了超自然现象。"),
            es = LocalizedContent("¿Qué película de Kubrick se desarrolla en un hotel encantado?", listOf("El resplandor", "2001: Una odisea del espacio", "La naranja mecánica", "Eyes Wide Shut"), "Cine", "Adaptada de la novela de Stephen King, esta película de Stanley Kubrick sigue al escritor Jack Torrance y su familia, cuidadores de un hotel aislado en las montañas donde ocurren fenómenos paranormales.")
        ),
        BilingualQuestion(
            id = 21116, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur sud-coréen a remporté l'Oscar du meilleur film avec 'Parasite' ?", listOf("Bong Joon-ho", "Park Chan-wook", "Kim Ki-duk", "Lee Chang-dong"), "Cinéma", "Bong Joon-ho a remporté l'Oscar du meilleur film en 2020 pour Parasite, une première pour un film non anglophone dans l'histoire de la cérémonie."),
            en = LocalizedContent("Which South Korean director won the Oscar for Best Picture with 'Parasite'?", listOf("Bong Joon-ho", "Park Chan-wook", "Kim Ki-duk", "Lee Chang-dong"), "Cinema", "Bong Joon-ho won the Oscar for Best Picture in 2020 for Parasite, a first for a non-English language film in the history of the ceremony."),
            zh = LocalizedContent("哪位韩国导演凭借《寄生虫》获得奥斯卡最佳影片奖？", listOf("奉俊昊", "朴赞郁", "金基德", "李沧东"), "电影", "奉俊昊在2020年凭借《寄生虫》获得奥斯卡最佳影片奖，这是该颁奖典礼历史上首次由非英语电影获得此奖。"),
            es = LocalizedContent("¿Qué director surcoreano ganó el Óscar a la mejor película con 'Parásitos'?", listOf("Bong Joon-ho", "Park Chan-wook", "Kim Ki-duk", "Lee Chang-dong"), "Cine", "Bong Joon-ho ganó el Óscar a la mejor película en 2020 por Parásitos, la primera vez para una película no angloparlante en la historia de la ceremonia.")
        ),
        BilingualQuestion(
            id = 21117, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel personnage Marvel est interprété par Robert Downey Jr. ?", listOf("Iron Man", "Captain America", "Thor", "Hulk"), "Cinéma", "Robert Downey Jr. a incarné Tony Stark, alias Iron Man, dans l'univers cinématographique Marvel à partir de 2008, lançant ainsi la franchise des Avengers."),
            en = LocalizedContent("Which Marvel character is portrayed by Robert Downey Jr.?", listOf("Iron Man", "Captain America", "Thor", "Hulk"), "Cinema", "Robert Downey Jr. portrayed Tony Stark, aka Iron Man, in the Marvel Cinematic Universe starting in 2008, launching the Avengers franchise."),
            zh = LocalizedContent("小罗伯特·唐尼饰演哪个漫威角色？", listOf("钢铁侠", "美国队长", "雷神", "绿巨人"), "电影", "小罗伯特·唐尼从2008年开始在漫威电影宇宙中饰演托尼·斯塔克，即钢铁侠，开启了复仇者联盟系列。"),
            es = LocalizedContent("¿Qué personaje de Marvel es interpretado por Robert Downey Jr.?", listOf("Iron Man", "Capitán América", "Thor", "Hulk"), "Cine", "Robert Downey Jr. interpretó a Tony Stark, alias Iron Man, en el Universo Cinematográfico de Marvel a partir de 2008, lanzando la franquicia de los Vengadores.")
        ),
        BilingualQuestion(
            id = 21118, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel cinéaste italien est célèbre pour ses westerns spaghetti ?", listOf("Sergio Leone", "Federico Fellini", "Pier Paolo Pasolini", "Michelangelo Antonioni"), "Cinéma", "Sergio Leone a révolutionné le western avec ses films au style visuel unique et à la bande-son d'Ennio Morricone, comme \"Le Bon, la Brute et le Truand\"."),
            en = LocalizedContent("Which Italian filmmaker is famous for spaghetti westerns?", listOf("Sergio Leone", "Federico Fellini", "Pier Paolo Pasolini", "Michelangelo Antonioni"), "Cinema", "Sergio Leone revolutionized the western with his films featuring a unique visual style and Ennio Morricone's soundtrack, such as \"The Good, the Bad and the Ugly\"."),
            zh = LocalizedContent("哪位意大利电影人以意大利式西部片闻名？", listOf("赛尔乔·莱昂内", "费德里科·费里尼", "皮埃尔·保罗·帕索里尼", "米开朗基罗·安东尼奥尼"), "电影", "赛尔乔·莱昂内以其独特的视觉风格和埃尼奥·莫里康内的配乐革新了西部片，例如《黄金三镖客》。"),
            es = LocalizedContent("¿Qué cineasta italiano es famoso por sus spaghetti westerns?", listOf("Sergio Leone", "Federico Fellini", "Pier Paolo Pasolini", "Michelangelo Antonioni"), "Cine", "Sergio Leone revolucionó el western con sus películas de estilo visual único y banda sonora de Ennio Morricone, como \"El bueno, el feo y el malo\".")
        ),
        BilingualQuestion(
            id = 21119, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans 'Matrix', quelle pilule choisit Néo ?", listOf("La rouge", "La bleue", "La verte", "La jaune"), "Cinéma", "La pilule rouge symbolise la sortie de l'illusion et la connaissance de la réalité, tandis que la bleue permet de rester dans le monde simulé."),
            en = LocalizedContent("In 'The Matrix', which pill does Neo choose?", listOf("The red one", "The blue one", "The green one", "The yellow one"), "Cinema", "The red pill symbolizes leaving the illusion and knowing reality, while the blue one allows staying in the simulated world."),
            zh = LocalizedContent("在《黑客帝国》中，尼奥选择了哪颗药丸？", listOf("红色", "蓝色", "绿色", "黄色"), "电影", "红色药丸象征着脱离幻象、了解现实，而蓝色药丸则允许留在模拟世界中。"),
            es = LocalizedContent("En 'Matrix', ¿qué píldora elige Neo?", listOf("La roja", "La azul", "La verde", "La amarilla"), "Cine", "La píldora roja simboliza salir de la ilusión y conocer la realidad, mientras que la azul permite permanecer en el mundo simulado.")
        ),
        BilingualQuestion(
            id = 21120, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film français a remporté la Palme d'or en 2008 ?", listOf("Entre les murs", "La Vie d'Adèle", "Amour", "La Classe de neige"), "Cinéma", "Réalisé par Laurent Cantet, Entre les murs a reçu la Palme d'or au Festival de Cannes 2008, devenant le premier film français à obtenir cette récompense depuis 1987."),
            en = LocalizedContent("Which French film won the Palme d'Or in 2008?", listOf("The Class", "Blue Is the Warmest Colour", "Amour", "The Snow Class"), "Cinema", "Directed by Laurent Cantet, The Class won the Palme d'Or at the 2008 Cannes Film Festival, becoming the first French film to receive this award since 1987."),
            zh = LocalizedContent("哪部法国电影在2008年获得了金棕榈奖？", listOf("《墙壁之间》", "《阿黛尔的生活》", "《爱》", "《雪课》"), "电影", "由洛朗·康泰执导的《墙壁之间》在2008年戛纳电影节上获得金棕榈奖，成为自1987年以来首部获得该奖项的法国电影。"),
            es = LocalizedContent("¿Qué película francesa ganó la Palma de Oro en 2008?", listOf("La clase", "La vida de Adèle", "Amor", "La clase de nieve"), "Cine", "Dirigida por Laurent Cantet, La clase ganó la Palma de Oro en el Festival de Cannes de 2008, convirtiéndose en la primera película francesa en recibir este premio desde 1987.")
        ),
        BilingualQuestion(
            id = 21121, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui double la voix de Woody dans Toy Story (VF) ?", listOf("Jean-Philippe Puymartin", "Emmanuel Curtil", "Patrick Poivey", "Richard Darbois"), "Cinéma", "Jean-Philippe Puymartin est la voix française attitrée de Tom Hanks, ce qui lui a valu de doubler Woody dans la saga Toy Story depuis le premier film en 1995."),
            en = LocalizedContent("Who voices Woody in Toy Story (French dub)?", listOf("Jean-Philippe Puymartin", "Emmanuel Curtil", "Patrick Poivey", "Richard Darbois"), "Cinema", "Jean-Philippe Puymartin is the official French voice of Tom Hanks, which led him to dub Woody in the Toy Story saga since the first film in 1995."),
            zh = LocalizedContent("谁为《玩具总动员》中的伍迪配音（法语版）？", listOf("让-菲利普·普伊马丁", "埃马纽埃尔·库尔蒂尔", "帕特里克·普瓦维", "理查德·达布瓦"), "电影", "让-菲利普·普伊马丁是汤姆·汉克斯的官方法语配音演员，因此自1995年第一部电影以来，他一直为《玩具总动员》系列中的伍迪配音。"),
            es = LocalizedContent("¿Quién dobla la voz de Woody en Toy Story (doblaje francés)?", listOf("Jean-Philippe Puymartin", "Emmanuel Curtil", "Patrick Poivey", "Richard Darbois"), "Cine", "Jean-Philippe Puymartin es la voz francesa oficial de Tom Hanks, lo que le llevó a doblar a Woody en la saga Toy Story desde la primera película en 1995.")
        ),
        BilingualQuestion(
            id = 21122, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de James Cameron se passe sur un navire ?", listOf("Titanic", "Avatar", "Abyss", "Aliens"), "Cinéma", "Titanic, sorti en 1997, est le film de James Cameron qui se déroule sur le célèbre paquebot naufragé en 1912."),
            en = LocalizedContent("Which James Cameron film takes place on a ship?", listOf("Titanic", "Avatar", "The Abyss", "Aliens"), "Cinema", "Titanic, released in 1997, is the James Cameron film that takes place on the famous ocean liner that sank in 1912."),
            zh = LocalizedContent("詹姆斯·卡梅隆的哪部电影发生在船上？", listOf("泰坦尼克号", "阿凡达", "深渊", "异形"), "电影", "1997年上映的《泰坦尼克号》是詹姆斯·卡梅隆的电影，故事发生在1912年沉没的著名邮轮上。"),
            es = LocalizedContent("¿Qué película de James Cameron transcurre en un barco?", listOf("Titanic", "Avatar", "Abyss", "Aliens"), "Cine", "Titanic, estrenada en 1997, es la película de James Cameron que se desarrolla en el famoso transatlántico hundido en 1912.")
        ),
        BilingualQuestion(
            id = 21123, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a signé 'La Liste de Schindler' ?", listOf("Steven Spielberg", "Martin Scorsese", "Ridley Scott", "Ron Howard"), "Cinéma", "Steven Spielberg a réalisé ce film historique de 1993, qui lui a valu l'Oscar du meilleur réalisateur et du meilleur film."),
            en = LocalizedContent("Which director made 'Schindler's List'?", listOf("Steven Spielberg", "Martin Scorsese", "Ridley Scott", "Ron Howard"), "Cinema", "Steven Spielberg directed this 1993 historical film, which won him the Oscar for Best Director and Best Picture."),
            zh = LocalizedContent("哪位导演执导了《辛德勒的名单》？", listOf("史蒂文·斯皮尔伯格", "马丁·斯科塞斯", "雷德利·斯科特", "朗·霍华德"), "电影", "史蒂文·斯皮尔伯格执导了这部1993年的历史电影，并因此获得奥斯卡最佳导演和最佳影片奖。"),
            es = LocalizedContent("¿Qué director realizó 'La lista de Schindler'?", listOf("Steven Spielberg", "Martin Scorsese", "Ridley Scott", "Ron Howard"), "Cine", "Steven Spielberg dirigió esta película histórica de 1993, que le valió el Oscar al mejor director y a la mejor película.")
        ),
        BilingualQuestion(
            id = 21124, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier long-métrage d'animation de l'histoire ?", listOf("Blanche-Neige et les Sept Nains (1937)", "Fantasia (1940)", "Pinocchio (1940)", "Bambi (1942)"), "Cinéma", "Produit par Walt Disney, Blanche-Neige et les Sept Nains est sorti en 1937 et est considéré comme le premier long-métrage d'animation au monde, marquant un tournant dans l'histoire du cinéma."),
            en = LocalizedContent("What is the first feature-length animated film in history?", listOf("Snow White and the Seven Dwarfs (1937)", "Fantasia (1940)", "Pinocchio (1940)", "Bambi (1942)"), "Cinema", "Produced by Walt Disney, Snow White and the Seven Dwarfs was released in 1937 and is considered the world's first feature-length animated film, marking a turning point in cinema history."),
            zh = LocalizedContent("历史上第一部动画长片是什么？", listOf("白雪公主和七个小矮人（1937）", "幻想曲（1940）", "木偶奇遇记（1940）", "小鹿斑比（1942）"), "电影", "由华特·迪士尼制作，《白雪公主和七个小矮人》于1937年上映，被认为是世界上第一部动画长片，标志着电影史上的一个转折点。"),
            es = LocalizedContent("¿Cuál es el primer largometraje de animación de la historia?", listOf("Blancanieves y los siete enanitos (1937)", "Fantasía (1940)", "Pinocho (1940)", "Bambi (1942)"), "Cine", "Producida por Walt Disney, Blancanieves y los siete enanitos se estrenó en 1937 y está considerada el primer largometraje de animación del mundo, marcando un hito en la historia del cine.")
        ),
        BilingualQuestion(
            id = 21125, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue le Joker dans 'The Dark Knight' ?", listOf("Heath Ledger", "Jack Nicholson", "Joaquin Phoenix", "Jared Leto"), "Cinéma", "Heath Ledger a remporté un Oscar à titre posthume pour son interprétation du Joker dans The Dark Knight de Christopher Nolan, sorti en 2008."),
            en = LocalizedContent("Which actor plays the Joker in 'The Dark Knight'?", listOf("Heath Ledger", "Jack Nicholson", "Joaquin Phoenix", "Jared Leto"), "Cinema", "Heath Ledger posthumously won an Oscar for his portrayal of the Joker in Christopher Nolan's The Dark Knight, released in 2008."),
            zh = LocalizedContent("哪位演员在《黑暗骑士》中饰演小丑？", listOf("希斯·莱杰", "杰克·尼科尔森", "华金·菲尼克斯", "杰瑞德·莱托"), "电影", "希斯·莱杰在克里斯托弗·诺兰2008年上映的《黑暗骑士》中饰演小丑，并因此追授奥斯卡奖。"),
            es = LocalizedContent("¿Qué actor interpreta al Joker en 'The Dark Knight'?", listOf("Heath Ledger", "Jack Nicholson", "Joaquin Phoenix", "Jared Leto"), "Cine", "Heath Ledger ganó un Oscar póstumo por su interpretación del Joker en The Dark Knight de Christopher Nolan, estrenada en 2008.")
        ),
        BilingualQuestion(
            id = 21126, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film d'horreur met en scène un clown nommé Pennywise ?", listOf("Ça (It)", "Poltergeist", "L'Exorciste", "Halloween"), "Cinéma", "Pennywise est le clown maléfique du roman de Stephen King, adapté au cinéma en 1990 puis en 2017 et 2019 sous le titre Ça (It)."),
            en = LocalizedContent("Which horror movie features a clown named Pennywise?", listOf("It", "Poltergeist", "The Exorcist", "Halloween"), "Cinema", "Pennywise is the evil clown from Stephen King's novel, adapted to film in 1990 and then in 2017 and 2019 under the title It."),
            zh = LocalizedContent("哪部恐怖电影中出现了一个名叫潘尼怀斯的小丑？", listOf("小丑回魂", "鬼驱人", "驱魔人", "万圣节"), "电影", "潘尼怀斯是斯蒂芬·金小说中的邪恶小丑，于1990年改编成电影，随后在2017年和2019年以《小丑回魂》为名再次改编。"),
            es = LocalizedContent("¿Qué película de terror presenta un payaso llamado Pennywise?", listOf("It (Eso)", "Poltergeist", "El exorcista", "Halloween"), "Cine", "Pennywise es el payaso malvado de la novela de Stephen King, adaptada al cine en 1990 y luego en 2017 y 2019 bajo el título It (Eso).")
        ),
        BilingualQuestion(
            id = 21127, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle saga cinématographique met en scène des sorciers à Poudlard ?", listOf("Harry Potter", "Le Seigneur des Anneaux", "Narnia", "Les Animaux Fantastiques"), "Cinéma", "Harry Potter est une série de sept romans adaptée au cinéma, qui suit les aventures du jeune sorcier Harry Potter et ses amis à l'école de sorcellerie Poudlard."),
            en = LocalizedContent("Which film saga features wizards at Hogwarts?", listOf("Harry Potter", "The Lord of the Rings", "Narnia", "Fantastic Beasts"), "Cinema", "Harry Potter is a series of seven novels adapted into film, following the adventures of the young wizard Harry Potter and his friends at the Hogwarts School of Witchcraft and Wizardry."),
            zh = LocalizedContent("哪部电影系列以霍格沃茨的巫师为主角？", listOf("哈利·波特", "指环王", "纳尼亚传奇", "神奇动物在哪里"), "电影", "《哈利·波特》是一系列七部小说改编的电影，讲述了年轻巫师哈利·波特和他的朋友们在霍格沃茨魔法学校的冒险故事。"),
            es = LocalizedContent("¿Qué saga cinematográfica presenta magos en Hogwarts?", listOf("Harry Potter", "El Señor de los Anillos", "Narnia", "Animales Fantásticos"), "Cine", "Harry Potter es una serie de siete novelas adaptadas al cine, que sigue las aventuras del joven mago Harry Potter y sus amigos en el Colegio Hogwarts de Magia y Hechicería.")
        ),
        BilingualQuestion(
            id = 21128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Jurassic Park' ?", listOf("Steven Spielberg", "James Cameron", "George Lucas", "Michael Crichton"), "Cinéma", "Steven Spielberg a réalisé Jurassic Park en 1993, adaptant le roman de Michael Crichton avec des effets spéciaux révolutionnaires en images de synthèse."),
            en = LocalizedContent("Which director created 'Jurassic Park'?", listOf("Steven Spielberg", "James Cameron", "George Lucas", "Michael Crichton"), "Cinema", "Steven Spielberg directed Jurassic Park in 1993, adapting Michael Crichton's novel with revolutionary computer-generated special effects."),
            zh = LocalizedContent("哪位导演创造了《侏罗纪公园》？", listOf("史蒂文·斯皮尔伯格", "詹姆斯·卡梅隆", "乔治·卢卡斯", "迈克尔·克莱顿"), "电影", "史蒂文·斯皮尔伯格于1993年执导了《侏罗纪公园》，改编自迈克尔·克莱顿的小说，采用了革命性的计算机生成特效。"),
            es = LocalizedContent("¿Qué director creó 'Jurassic Park'?", listOf("Steven Spielberg", "James Cameron", "George Lucas", "Michael Crichton"), "Cine", "Steven Spielberg dirigió Jurassic Park en 1993, adaptando la novela de Michael Crichton con efectos especiales revolucionarios generados por computadora.")
        ),
        BilingualQuestion(
            id = 21129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film commence par 'Il était une fois dans l'Ouest' ?", listOf("Il était une fois dans l'Ouest (Sergio Leone)", "Le Bon, la Brute et le Truand", "Django", "Pour une poignée de dollars"), "Cinéma", "Il s'agit du titre original du western de Sergio Leone sorti en 1968, dont la célèbre scène d'ouverture se déroule dans une gare."),
            en = LocalizedContent("Which film begins with 'Once Upon a Time in the West'?", listOf("Once Upon a Time in the West (Sergio Leone)", "The Good, the Bad and the Ugly", "Django", "A Fistful of Dollars"), "Cinema", "This is the original title of Sergio Leone's 1968 western, whose famous opening scene takes place at a train station."),
            zh = LocalizedContent("哪部电影以《西部往事》开头？", listOf("西部往事（赛尔乔·莱昂内）", "黄金三镖客", "被解救的姜戈", "荒野大镖客"), "电影", "这是赛尔乔·莱昂内1968年西部片的原名，其著名的开场场景发生在一个火车站。"),
            es = LocalizedContent("¿Qué película comienza con 'Érase una vez en el Oeste'?", listOf("Érase una vez en el Oeste (Sergio Leone)", "El bueno, el feo y el malo", "Django", "Por un puñado de dólares"), "Cine", "Se trata del título original del western de Sergio Leone de 1968, cuya famosa escena de apertura transcurre en una estación de tren.")
        ),
        BilingualQuestion(
            id = 21130, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a lancé la carrière de Leonardo DiCaprio ?", listOf("Titanic (popularité mondiale)", "Gilbert Grape", "Romeo + Juliet", "Basketball Diaries"), "Cinéma", "Sorti en 1997, Titanic a propulsé Leonardo DiCaprio au rang de superstar mondiale grâce à son rôle de Jack Dawson, un succès phénoménal au box-office."),
            en = LocalizedContent("Which film launched Leonardo DiCaprio's career?", listOf("Titanic (global popularity)", "What's Eating Gilbert Grape", "Romeo + Juliet", "The Basketball Diaries"), "Cinema", "Released in 1997, Titanic propelled Leonardo DiCaprio to global superstardom thanks to his role as Jack Dawson, a phenomenal box-office success."),
            zh = LocalizedContent("哪部电影开启了莱昂纳多·迪卡普里奥的职业生涯？", listOf("泰坦尼克号（全球知名度）", "不一样的天空", "罗密欧与朱丽叶", "篮球日记"), "电影", "1997年上映的《泰坦尼克号》凭借杰克·道森的角色将莱昂纳多·迪卡普里奥推向了全球超级巨星的地位，取得了巨大的票房成功。"),
            es = LocalizedContent("¿Qué película lanzó la carrera de Leonardo DiCaprio?", listOf("Titanic (popularidad mundial)", "¿A quién ama Gilbert Grape?", "Romeo + Juliet", "Diario de un rebelde"), "Cine", "Estrenada en 1997, Titanic impulsó a Leonardo DiCaprio al estrellato mundial gracias a su papel de Jack Dawson, un éxito fenomenal en taquilla.")
        ),
        BilingualQuestion(
            id = 21201, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est le berceau du sushi ?", listOf("Le Japon", "La Chine", "La Corée du Sud", "La Thaïlande"), "Gastronomie", "Le sushi est né au Japon, où il a évolué à partir d'une méthode de conservation du poisson dans du riz fermenté."),
            en = LocalizedContent("Which country is the birthplace of sushi?", listOf("Japan", "China", "South Korea", "Thailand"), "Gastronomy", "Sushi originated in Japan, evolving from a method of preserving fish in fermented rice."),
            zh = LocalizedContent("哪个国家是寿司的发源地？", listOf("日本", "中国", "韩国", "泰国"), "美食", "寿司起源于日本，最初是一种用发酵米饭保存鱼类的方法。"),
            es = LocalizedContent("¿Qué país es la cuna del sushi?", listOf("Japón", "China", "Corea del Sur", "Tailandia"), "Gastronomía", "El sushi nació en Japón, evolucionando a partir de un método de conservación del pescado en arroz fermentado.")
        ),
        BilingualQuestion(
            id = 21202, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fromage est utilisé traditionnellement dans une fondue savoyarde ?", listOf("Beaufort, Comté, Emmental", "Camembert", "Roquefort", "Brie"), "Gastronomie", "La fondue savoyarde traditionnelle mêle ces trois fromages à pâte pressée cuite, typiques des Alpes françaises, pour obtenir une texture fondante et un goût équilibré."),
            en = LocalizedContent("Which cheese is traditionally used in a Savoyard fondue?", listOf("Beaufort, Comté, Emmental", "Camembert", "Roquefort", "Brie"), "Gastronomy", "Traditional Savoyard fondue combines these three cooked pressed cheeses, typical of the French Alps, for a melting texture and balanced flavor."),
            zh = LocalizedContent("哪种奶酪传统上用于萨瓦火锅？", listOf("博福尔、孔泰、埃曼塔尔", "卡门贝尔", "罗克福", "布里"), "美食", "传统萨瓦火锅混合这三种法国阿尔卑斯山典型的熟压奶酪，以获得融化质地和均衡风味。"),
            es = LocalizedContent("¿Qué queso se usa tradicionalmente en una fondue saboyana?", listOf("Beaufort, Comté, Emmental", "Camembert", "Roquefort", "Brie"), "Gastronomía", "La fondue saboyana tradicional combina estos tres quesos de pasta prensada cocida, típicos de los Alpes franceses, para obtener una textura fundente y un sabor equilibrado.")
        ),
        BilingualQuestion(
            id = 21203, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel épice donne sa couleur jaune au curry ?", listOf("Le curcuma", "Le safran", "Le paprika", "Le cumin"), "Gastronomie", "Le curcuma contient de la curcumine, un pigment naturel qui colore les plats en jaune vif. C'est l'ingrédient principal du curry en poudre."),
            en = LocalizedContent("Which spice gives curry its yellow color?", listOf("Turmeric", "Saffron", "Paprika", "Cumin"), "Gastronomy", "Turmeric contains curcumin, a natural pigment that colors dishes bright yellow. It is the main ingredient in curry powder."),
            zh = LocalizedContent("哪种香料赋予咖喱黄色？", listOf("姜黄", "藏红花", "辣椒粉", "孜然"), "美食", "姜黄含有姜黄素，一种天然色素，使菜肴呈现亮黄色。它是咖喱粉的主要成分。"),
            es = LocalizedContent("¿Qué especia da el color amarillo al curry?", listOf("Cúrcuma", "Azafrán", "Pimentón", "Comino"), "Gastronomía", "La cúrcuma contiene curcumina, un pigmento natural que tiñe los platos de amarillo brillante. Es el ingrediente principal del curry en polvo.")
        ),
        BilingualQuestion(
            id = 21205, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est l'épice la plus chère au monde ?", listOf("Le safran", "La vanille", "Le poivre de Kampot", "La cardamome"), "Gastronomie", "Le safran est l'épice la plus chère car sa récolte est entièrement manuelle et nécessite environ 150 000 fleurs de crocus pour obtenir un seul kilo."),
            en = LocalizedContent("What is the most expensive spice in the world?", listOf("Saffron", "Vanilla", "Kampot pepper", "Cardamom"), "Gastronomy", "Saffron is the most expensive spice because its harvest is entirely manual and requires about 150,000 crocus flowers to obtain a single kilogram."),
            zh = LocalizedContent("世界上最昂贵的香料是什么？", listOf("藏红花", "香草", "贡布胡椒", "小豆蔻"), "美食", "藏红花是最昂贵的香料，因为其采摘完全手工，需要大约15万朵番红花才能获得一公斤。"),
            es = LocalizedContent("¿Cuál es la especia más cara del mundo?", listOf("Azafrán", "Vainilla", "Pimienta de Kampot", "Cardamomo"), "Gastronomía", "El azafrán es la especia más cara porque su cosecha es completamente manual y requiere unas 150.000 flores de crocus para obtener un solo kilo.")
        ),
        BilingualQuestion(
            id = 21206, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel vin est produit dans la région de Bordeaux ?", listOf("Du vin rouge principalement", "Uniquement du blanc", "Du rosé", "Du champagne"), "Gastronomie", "Bordeaux est la plus grande région viticole de France en superficie, et le climat océanique y favorise la production de vins rouges, qui représentent environ 85% de sa production totale."),
            en = LocalizedContent("Which wine is produced in the Bordeaux region?", listOf("Mainly red wine", "Only white", "Rosé", "Champagne"), "Gastronomy", "Bordeaux is the largest wine region in France by area, and the oceanic climate favors red wine production, which accounts for about 85% of its total output."),
            zh = LocalizedContent("波尔多地区生产哪种葡萄酒？", listOf("主要是红葡萄酒", "只有白葡萄酒", "桃红葡萄酒", "香槟"), "美食", "波尔多是法国面积最大的葡萄酒产区，海洋性气候有利于红葡萄酒生产，约占其总产量的85%。"),
            es = LocalizedContent("¿Qué vino se produce en la región de Burdeos?", listOf("Principalmente vino tinto", "Solo blanco", "Rosado", "Champán"), "Gastronomía", "Burdeos es la mayor región vinícola de Francia en superficie, y el clima oceánico favorece la producción de vinos tintos, que representan aproximadamente el 85% de su producción total.")
        ),
        BilingualQuestion(
            id = 21207, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel plat italien est fait de pâtes, œufs, fromage et lardons ?", listOf("Carbonara", "Bolognaise", "Amatriciana", "Cacio e Pepe"), "Gastronomie", "La carbonara est une recette romaine traditionnelle dont les ingrédients de base sont les pâtes, les œufs, le pecorino romano et le guanciale (ou lardons)."),
            en = LocalizedContent("Which Italian dish is made with pasta, eggs, cheese, and bacon?", listOf("Carbonara", "Bolognese", "Amatriciana", "Cacio e Pepe"), "Gastronomy", "Carbonara is a traditional Roman recipe whose basic ingredients are pasta, eggs, pecorino romano, and guanciale (or bacon)."),
            zh = LocalizedContent("哪种意大利菜由意面、鸡蛋、奶酪和培根制成？", listOf("卡邦那拉", "博洛尼亚", "阿马特里恰纳", "卡乔佩佩"), "美食", "卡邦那拉是一道传统的罗马食谱，基本原料是意面、鸡蛋、佩科里诺罗马诺奶酪和猪脸颊肉（或培根）。"),
            es = LocalizedContent("¿Qué plato italiano se hace con pasta, huevos, queso y panceta?", listOf("Carbonara", "Boloñesa", "Amatriciana", "Cacio e Pepe"), "Gastronomía", "La carbonara es una receta romana tradicional cuyos ingredientes básicos son pasta, huevos, pecorino romano y guanciale (o panceta).")
        ),
        BilingualQuestion(
            id = 21210, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel plat est considéré comme le plat national du Maroc ?", listOf("Le couscous", "Le tajine", "La pastilla", "La harira"), "Gastronomie", "Le couscous est un plat ancestral à base de semoule de blé, de légumes et de viande, et il est reconnu comme le plat national du Maroc en raison de son importance culturelle et de sa consommation lors des repas familiaux et des fêtes."),
            en = LocalizedContent("Which dish is considered the national dish of Morocco?", listOf("Couscous", "Tajine", "Pastilla", "Harira"), "Gastronomy", "Couscous is an ancient dish made from wheat semolina, vegetables, and meat, and it is recognized as the national dish of Morocco due to its cultural importance and consumption during family meals and festivities."),
            zh = LocalizedContent("哪道菜被认为是摩洛哥的国菜？", listOf("库斯库斯", "塔吉锅", "巴斯提拉", "哈里拉汤"), "美食", "库斯库斯是一种由小麦粗粉、蔬菜和肉类制成的古老菜肴，因其文化重要性以及在家庭聚餐和节日中的消费而被公认为摩洛哥的国菜。"),
            es = LocalizedContent("¿Qué plato se considera el plato nacional de Marruecos?", listOf("Cuscús", "Tayín", "Pastela", "Harira"), "Gastronomía", "El cuscús es un plato ancestral a base de sémola de trigo, verduras y carne, y es reconocido como el plato nacional de Marruecos por su importancia cultural y su consumo en comidas familiares y festividades.")
        ),
        BilingualQuestion(
            id = 21211, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chef français a 32 étoiles Michelin au total ?", listOf("Joël Robuchon", "Paul Bocuse", "Alain Ducasse", "Georges Blanc"), "Gastronomie", "Joël Robuchon est le chef le plus étoilé au monde, avec 32 étoiles Michelin obtenues tout au long de sa carrière dans ses restaurants à travers le globe."),
            en = LocalizedContent("Which French chef has a total of 32 Michelin stars?", listOf("Joël Robuchon", "Paul Bocuse", "Alain Ducasse", "Georges Blanc"), "Gastronomy", "Joël Robuchon is the most starred chef in the world, with 32 Michelin stars earned throughout his career in his restaurants across the globe."),
            zh = LocalizedContent("哪位法国厨师总共拥有32颗米其林星？", listOf("乔尔·侯布雄", "保罗·博古斯", "阿兰·杜卡斯", "乔治·布朗"), "美食", "乔尔·侯布雄是世界上获得米其林星最多的厨师，在其全球餐厅的职业生涯中获得了32颗星。"),
            es = LocalizedContent("¿Qué chef francés tiene un total de 32 estrellas Michelin?", listOf("Joël Robuchon", "Paul Bocuse", "Alain Ducasse", "Georges Blanc"), "Gastronomía", "Joël Robuchon es el chef con más estrellas Michelin del mundo, con 32 estrellas obtenidas a lo largo de su carrera en sus restaurantes de todo el mundo.")
        ),
        BilingualQuestion(
            id = 21212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fruit est utilisé pour faire le calvados ?", listOf("La pomme", "Le raisin", "La poire", "La prune"), "Gastronomie", "Le calvados est une eau-de-vie de cidre obtenue par distillation de pommes, principalement cultivées en Normandie."),
            en = LocalizedContent("Which fruit is used to make Calvados?", listOf("Apple", "Grape", "Pear", "Plum"), "Gastronomy", "Calvados is an apple brandy obtained by distilling cider made from apples, mainly grown in Normandy."),
            zh = LocalizedContent("哪种水果用于制作卡尔瓦多斯？", listOf("苹果", "葡萄", "梨", "李子"), "美食", "卡尔瓦多斯是一种苹果白兰地，通过蒸馏用苹果制成的苹果酒获得，苹果主要产于诺曼底。"),
            es = LocalizedContent("¿Qué fruta se usa para hacer el calvados?", listOf("Manzana", "Uva", "Pera", "Ciruela"), "Gastronomía", "El calvados es un aguardiente de manzana obtenido por destilación de sidra de manzana, cultivada principalmente en Normandía.")
        ),
        BilingualQuestion(
            id = 21214, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays est le plus grand consommateur de bière par habitant ?", listOf("La République tchèque", "L'Allemagne", "La Belgique", "L'Irlande"), "Gastronomie", "La République tchèque détient ce record depuis des années, avec une consommation moyenne de plus de 140 litres par habitant et par an, notamment grâce à la culture de la bière blonde comme la Pilsner."),
            en = LocalizedContent("Which country is the largest consumer of beer per capita?", listOf("Czech Republic", "Germany", "Belgium", "Ireland"), "Gastronomy", "The Czech Republic has held this record for years, with an average consumption of over 140 liters per capita per year, thanks in part to the culture of pale lagers like Pilsner."),
            zh = LocalizedContent("哪个国家是人均啤酒消费量最大的国家？", listOf("捷克共和国", "德国", "比利时", "爱尔兰"), "美食", "捷克共和国多年来一直保持这一记录，人均年消费量超过140升，部分归功于比尔森等淡色拉格啤酒的文化。"),
            es = LocalizedContent("¿Qué país es el mayor consumidor de cerveza per cápita?", listOf("República Checa", "Alemania", "Bélgica", "Irlanda"), "Gastronomía", "La República Checa mantiene este récord desde hace años, con un consumo medio de más de 140 litros por habitante al año, gracias en parte a la cultura de las cervezas rubias como la Pilsner.")
        ),
        BilingualQuestion(
            id = 21215, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'ingrédient de base de la polenta ?", listOf("La semoule de maïs", "La farine de blé", "Le riz", "L'orge"), "Gastronomie", "La polenta est un plat traditionnel italien à base de farine ou de semoule de maïs cuite dans de l'eau ou du bouillon."),
            en = LocalizedContent("What is the basic ingredient of polenta?", listOf("Cornmeal", "Wheat flour", "Rice", "Barley"), "Gastronomy", "Polenta is a traditional Italian dish made from cornmeal cooked in water or broth."),
            zh = LocalizedContent("玉米粥的基本原料是什么？", listOf("玉米粗粉", "小麦粉", "大米", "大麦"), "美食", "玉米粥是一种传统的意大利菜肴，由玉米粗粉在水或高汤中煮熟制成。"),
            es = LocalizedContent("¿Cuál es el ingrediente básico de la polenta?", listOf("Sémola de maíz", "Harina de trigo", "Arroz", "Cebada"), "Gastronomía", "La polenta es un plato tradicional italiano hecho con harina o sémola de maíz cocida en agua o caldo.")
        ),
        BilingualQuestion(
            id = 21216, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel champignon est le plus recherché en gastronomie française ?", listOf("La truffe noire", "Le cèpe", "La morille", "La chanterelle"), "Gastronomie", "La truffe noire, ou Tuber melanosporum, est prisée pour son arôme puissant et sa rareté, ce qui en fait un ingrédient de luxe dans la cuisine française."),
            en = LocalizedContent("Which mushroom is most sought after in French gastronomy?", listOf("Black truffle", "Porcini", "Morel", "Chanterelle"), "Gastronomy", "The black truffle, or Tuber melanosporum, is prized for its powerful aroma and rarity, making it a luxury ingredient in French cuisine."),
            zh = LocalizedContent("哪种蘑菇在法国美食中最受追捧？", listOf("黑松露", "牛肝菌", "羊肚菌", "鸡油菌"), "美食", "黑松露（Tuber melanosporum）因其浓郁的香气和稀有性而备受珍视，是法国美食中的奢侈品原料。"),
            es = LocalizedContent("¿Qué hongo es el más buscado en la gastronomía francesa?", listOf("Trufa negra", "Boleto", "Colmenilla", "Rebozuelo"), "Gastronomía", "La trufa negra, o Tuber melanosporum, es apreciada por su aroma potente y rareza, lo que la convierte en un ingrediente de lujo en la cocina francesa.")
        ),
        BilingualQuestion(
            id = 21217, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("D'où vient le chocolat à l'origine ?", listOf("D'Amérique centrale (Mexique)", "D'Afrique", "D'Asie", "D'Europe"), "Gastronomie", "Le cacaoyer est originaire d'Amérique centrale, où les civilisations maya et aztèque cultivaient déjà le cacao pour préparer une boisson amère, bien avant l'arrivée des Européens."),
            en = LocalizedContent("Where does chocolate originally come from?", listOf("Central America (Mexico)", "Africa", "Asia", "Europe"), "Gastronomy", "The cacao tree is native to Central America, where the Maya and Aztec civilizations cultivated cacao to prepare a bitter drink long before the arrival of Europeans."),
            zh = LocalizedContent("巧克力最初来自哪里？", listOf("中美洲（墨西哥）", "非洲", "亚洲", "欧洲"), "美食", "可可树原产于中美洲，玛雅和阿兹特克文明早在欧洲人到来之前就种植可可并制作苦味饮料。"),
            es = LocalizedContent("¿De dónde proviene originalmente el chocolate?", listOf("América Central (México)", "África", "Asia", "Europa"), "Gastronomía", "El cacao es originario de América Central, donde las civilizaciones maya y azteca cultivaban cacao para preparar una bebida amarga mucho antes de la llegada de los europeos.")
        ),
        BilingualQuestion(
            id = 21218, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel alcool est distillé à partir de la canne à sucre ?", listOf("Le rhum", "La vodka", "Le whisky", "Le gin"), "Gastronomie", "Le rhum est produit par distillation du jus de canne à sucre ou de ses sous-produits, comme la mélasse."),
            en = LocalizedContent("Which alcohol is distilled from sugarcane?", listOf("Rum", "Vodka", "Whisky", "Gin"), "Gastronomy", "Rum is produced by distilling sugarcane juice or its by-products, such as molasses."),
            zh = LocalizedContent("哪种酒是由甘蔗蒸馏而成的？", listOf("朗姆酒", "伏特加", "威士忌", "金酒"), "美食", "朗姆酒是通过蒸馏甘蔗汁或其副产品（如糖蜜）制成的。"),
            es = LocalizedContent("¿Qué alcohol se destila de la caña de azúcar?", listOf("Ron", "Vodka", "Whisky", "Ginebra"), "Gastronomía", "El ron se produce destilando jugo de caña de azúcar o sus subproductos, como la melaza.")
        ),
        BilingualQuestion(
            id = 21219, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de régions viticoles la France compte-t-elle environ ?", listOf("17", "10", "25", "8"), "Gastronomie", "La France compte officiellement 17 régions viticoles, incluant des zones comme Bordeaux, Bourgogne ou Champagne, qui structurent son paysage viticole."),
            en = LocalizedContent("How many wine regions does France have approximately?", listOf("17", "10", "25", "8"), "Gastronomy", "France officially has 17 wine regions, including areas like Bordeaux, Burgundy, and Champagne, which structure its wine landscape."),
            zh = LocalizedContent("法国大约有多少个葡萄酒产区？", listOf("17", "10", "25", "8"), "美食", "法国官方有17个葡萄酒产区，包括波尔多、勃艮第和香槟等地区，构成了其葡萄酒版图。"),
            es = LocalizedContent("¿Cuántas regiones vinícolas tiene Francia aproximadamente?", listOf("17", "10", "25", "8"), "Gastronomía", "Francia cuenta oficialmente con 17 regiones vinícolas, incluyendo zonas como Burdeos, Borgoña y Champaña, que estructuran su paisaje vitivinícola.")
        ),
        BilingualQuestion(
            id = 21220, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel plat japonais est fait de riz vinaigré et de poisson cru ?", listOf("Le sushi", "Le ramen", "Le tempura", "Le gyoza"), "Gastronomie", "Le sushi associe du riz vinaigré à du poisson cru, une combinaison emblématique de la cuisine japonaise."),
            en = LocalizedContent("Which Japanese dish is made of vinegared rice and raw fish?", listOf("Sushi", "Ramen", "Tempura", "Gyoza"), "Gastronomy", "Sushi combines vinegared rice with raw fish, an iconic combination of Japanese cuisine."),
            zh = LocalizedContent("哪种日本料理由醋饭和生鱼制成？", listOf("寿司", "拉面", "天妇罗", "煎饺"), "美食", "寿司将醋饭与生鱼片结合，是日本料理的标志性组合。"),
            es = LocalizedContent("¿Qué plato japonés está hecho de arroz avinagrado y pescado crudo?", listOf("Sushi", "Ramen", "Tempura", "Gyoza"), "Gastronomía", "El sushi combina arroz avinagrado con pescado crudo, una combinación emblemática de la cocina japonesa.")
        ),
        BilingualQuestion(
            id = 21221, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a inventé la pizza ?", listOf("L'Italie", "La Grèce", "Les États-Unis", "La Turquie"), "Gastronomie", "La pizza moderne, telle qu'on la connaît aujourd'hui avec la tomate et la mozzarella, est née à Naples, en Italie, au 18e siècle."),
            en = LocalizedContent("Which country invented pizza?", listOf("Italy", "Greece", "United States", "Turkey"), "Gastronomy", "Modern pizza, as we know it today with tomato and mozzarella, was born in Naples, Italy, in the 18th century."),
            zh = LocalizedContent("哪个国家发明了披萨？", listOf("意大利", "希腊", "美国", "土耳其"), "美食", "现代披萨，即我们今天所知的配有番茄和马苏里拉奶酪的披萨，诞生于18世纪意大利的那不勒斯。"),
            es = LocalizedContent("¿Qué país inventó la pizza?", listOf("Italia", "Grecia", "Estados Unidos", "Turquía"), "Gastronomía", "La pizza moderna, tal como la conocemos hoy con tomate y mozzarella, nació en Nápoles, Italia, en el siglo XVIII.")
        ),
        BilingualQuestion(
            id = 21222, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le wasabi véritable ?", listOf("Une racine de la famille du raifort", "Un algue", "Un piment", "Un champignon"), "Gastronomie", "Le wasabi véritable est fabriqué à partir de la racine d'Eutrema japonicum, une plante de la famille du raifort, contrairement aux pâtes vertes imitant le wasabi."),
            en = LocalizedContent("What is real wasabi?", listOf("A root from the horseradish family", "A seaweed", "A chili pepper", "A mushroom"), "Gastronomy", "Real wasabi is made from the root of Eutrema japonicum, a plant in the horseradish family, unlike the green pastes that imitate wasabi."),
            zh = LocalizedContent("真正的芥末是什么？", listOf("一种辣根家族的根茎", "一种海藻", "一种辣椒", "一种蘑菇"), "美食", "真正的芥末是由山葵（Eutrema japonicum）的根茎制成的，这种植物属于辣根家族，不同于模仿芥末的绿色糊状物。"),
            es = LocalizedContent("¿Qué es el wasabi auténtico?", listOf("Una raíz de la familia del rábano picante", "Un alga", "Un chile", "Un hongo"), "Gastronomía", "El wasabi auténtico se elabora a partir de la raíz de Eutrema japonicum, una planta de la familia del rábano picante, a diferencia de las pastas verdes que imitan el wasabi.")
        ),
        BilingualQuestion(
            id = 21223, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fromage le plus consommé au monde ?", listOf("La mozzarella", "Le cheddar", "Le camembert", "Le gruyère"), "Gastronomie", "La mozzarella est le fromage le plus consommé au monde grâce à son utilisation massive sur les pizzas, un plat populaire à l'échelle planétaire."),
            en = LocalizedContent("Which is the most consumed cheese in the world?", listOf("Mozzarella", "Cheddar", "Camembert", "Gruyère"), "Gastronomy", "Mozzarella is the most consumed cheese in the world due to its massive use on pizzas, a globally popular dish."),
            zh = LocalizedContent("世界上消费量最大的奶酪是什么？", listOf("马苏里拉奶酪", "切达奶酪", "卡门贝尔奶酪", "格鲁耶尔奶酪"), "美食", "马苏里拉奶酪是世界上消费量最大的奶酪，因为它大量用于披萨，而披萨是一种全球流行的菜肴。"),
            es = LocalizedContent("¿Cuál es el queso más consumido del mundo?", listOf("Mozzarella", "Cheddar", "Camembert", "Gruyère"), "Gastronomía", "La mozzarella es el queso más consumido del mundo debido a su uso masivo en pizzas, un plato popular a nivel mundial.")
        ),
        BilingualQuestion(
            id = 21224, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel plat thaïlandais est une soupe épicée aux crevettes ?", listOf("Tom Yam Kung", "Pad Thaï", "Som Tam", "Massaman Curry"), "Gastronomie", "Le Tom Yam Kung est une soupe emblématique de la Thaïlande, reconnaissable à son bouillon épicé et aigre à base de crevettes, de citronnelle et de galanga."),
            en = LocalizedContent("Which Thai dish is a spicy shrimp soup?", listOf("Tom Yum Kung", "Pad Thai", "Som Tam", "Massaman Curry"), "Gastronomy", "Tom Yum Kung is an iconic Thai soup, recognizable by its spicy and sour broth made with shrimp, lemongrass, and galangal."),
            zh = LocalizedContent("哪种泰国菜是辣味虾汤？", listOf("冬阴功汤", "泰式炒河粉", "青木瓜沙拉", "马沙文咖喱"), "美食", "冬阴功汤是泰国标志性的汤品，以其由虾、柠檬草和高良姜制成的辛辣酸汤而闻名。"),
            es = LocalizedContent("¿Qué plato tailandés es una sopa picante de camarones?", listOf("Tom Yam Kung", "Pad Thaï", "Som Tam", "Curry Massaman"), "Gastronomía", "El Tom Yam Kung es una sopa emblemática de Tailandia, reconocible por su caldo picante y agrio a base de camarones, hierba de limón y galanga.")
        ),
        BilingualQuestion(
            id = 21225, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel vin effervescent ne peut s'appeler 'Champagne' que s'il vient de Champagne ?", listOf("Le Champagne (AOC protégée)", "Le Prosecco", "Le Cava", "Le Crémant"), "Gastronomie", "L'appellation Champagne est protégée par une AOC (Appellation d'Origine Contrôlée) qui réserve ce nom aux vins effervescents produits dans la région de Champagne, en France."),
            en = LocalizedContent("Which sparkling wine can only be called 'Champagne' if it comes from Champagne?", listOf("Champagne (protected AOC)", "Prosecco", "Cava", "Crémant"), "Gastronomy", "The name Champagne is protected by an AOC (Appellation d'Origine Contrôlée) which reserves this name for sparkling wines produced in the Champagne region of France."),
            zh = LocalizedContent("哪种起泡酒只有来自香槟地区才能被称为‘香槟’？", listOf("香槟（受保护的原产地命名）", "普罗塞克", "卡瓦", "克雷芒"), "美食", "香槟名称受原产地命名控制（AOC）保护，仅限法国香槟地区生产的起泡酒使用此名称。"),
            es = LocalizedContent("¿Qué vino espumoso solo puede llamarse 'Champán' si proviene de la región de Champaña?", listOf("El Champán (DOP protegida)", "El Prosecco", "El Cava", "El Crémant"), "Gastronomía", "La denominación Champán está protegida por una DOP (Denominación de Origen Protegida) que reserva este nombre para los vinos espumosos producidos en la región de Champaña, en Francia.")
        ),
        BilingualQuestion(
            id = 21226, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fruit est à la base du ketchup ?", listOf("La tomate", "Le poivron", "La betterave", "La cerise"), "Gastronomie", "Le ketchup moderne est principalement fabriqué à partir de tomates, bien que les premières versions chinoises utilisaient une saumure de poisson. La recette à base de tomates s'est popularisée aux États-Unis au XIXe siècle."),
            en = LocalizedContent("Which fruit is the base of ketchup?", listOf("Tomato", "Bell pepper", "Beetroot", "Cherry"), "Gastronomy", "Modern ketchup is primarily made from tomatoes, although early Chinese versions used fish brine. The tomato-based recipe became popular in the United States in the 19th century."),
            zh = LocalizedContent("哪种水果是番茄酱的主要原料？", listOf("番茄", "甜椒", "甜菜", "樱桃"), "美食", "现代番茄酱主要由番茄制成，尽管早期的中国版本使用鱼露。以番茄为基础的配方在19世纪的美国流行起来。"),
            es = LocalizedContent("¿Qué fruta es la base del ketchup?", listOf("El tomate", "El pimiento", "La remolacha", "La cereza"), "Gastronomía", "El ketchup moderno se elabora principalmente con tomates, aunque las primeras versiones chinas usaban salmuera de pescado. La receta a base de tomate se popularizó en Estados Unidos en el siglo XIX.")
        ),
        BilingualQuestion(
            id = 21227, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle cuisine utilise beaucoup le lait de coco ?", listOf("La cuisine thaïlandaise", "La cuisine japonaise", "La cuisine italienne", "La cuisine mexicaine"), "Gastronomie", "Le lait de coco est un ingrédient fondamental de la cuisine thaïlandaise, utilisé dans de nombreux plats comme les currys et les soupes pour sa texture crémeuse et sa saveur douce."),
            en = LocalizedContent("Which cuisine uses a lot of coconut milk?", listOf("Thai cuisine", "Japanese cuisine", "Italian cuisine", "Mexican cuisine"), "Gastronomy", "Coconut milk is a fundamental ingredient in Thai cuisine, used in many dishes like curries and soups for its creamy texture and mild flavor."),
            zh = LocalizedContent("哪种菜系大量使用椰奶？", listOf("泰国菜", "日本菜", "意大利菜", "墨西哥菜"), "美食", "椰奶是泰国菜的基本食材，用于许多菜肴如咖喱和汤品，以增加奶油质地和温和风味。"),
            es = LocalizedContent("¿Qué cocina utiliza mucha leche de coco?", listOf("La cocina tailandesa", "La cocina japonesa", "La cocina italiana", "La cocina mexicana"), "Gastronomía", "La leche de coco es un ingrediente fundamental en la cocina tailandesa, utilizada en muchos platos como currys y sopas por su textura cremosa y sabor suave.")
        ),
        BilingualQuestion(
            id = 21228, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la cuisine moléculaire ?", listOf("L'application de la science à la cuisine", "La cuisine au micro-ondes", "La cuisine végétarienne", "La cuisine industrielle"), "Gastronomie", "La cuisine moléculaire utilise des principes scientifiques comme les réactions chimiques et physiques pour transformer les textures et les saveurs des aliments."),
            en = LocalizedContent("What is molecular gastronomy?", listOf("The application of science to cooking", "Microwave cooking", "Vegetarian cooking", "Industrial cooking"), "Gastronomy", "Molecular gastronomy uses scientific principles like chemical and physical reactions to transform food textures and flavors."),
            zh = LocalizedContent("什么是分子美食？", listOf("将科学应用于烹饪", "微波烹饪", "素食烹饪", "工业烹饪"), "美食", "分子美食利用化学和物理反应等科学原理来改变食物的质地和风味。"),
            es = LocalizedContent("¿Qué es la gastronomía molecular?", listOf("La aplicación de la ciencia a la cocina", "La cocina con microondas", "La cocina vegetariana", "La cocina industrial"), "Gastronomía", "La gastronomía molecular utiliza principios científicos como reacciones químicas y físicas para transformar las texturas y sabores de los alimentos.")
        ),
        BilingualQuestion(
            id = 21229, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pain est typique de la cuisine indienne ?", listOf("Le naan", "La baguette", "Le pain pita", "La tortilla"), "Gastronomie", "Le naan est un pain plat levé, cuit traditionnellement dans un four tandoor, et il accompagne fréquemment les currys et plats en sauce en Inde."),
            en = LocalizedContent("Which bread is typical of Indian cuisine?", listOf("Naan", "Baguette", "Pita bread", "Tortilla"), "Gastronomy", "Naan is a leavened flatbread, traditionally baked in a tandoor oven, and it frequently accompanies curries and saucy dishes in India."),
            zh = LocalizedContent("哪种面包是印度菜的代表？", listOf("馕", "法棍面包", "皮塔饼", "玉米饼"), "美食", "馕是一种发酵的扁平面包，传统上在坦都里烤炉中烤制，常搭配印度的咖喱和带汁菜肴。"),
            es = LocalizedContent("¿Qué pan es típico de la cocina india?", listOf("El naan", "La baguette", "El pan pita", "La tortilla"), "Gastronomía", "El naan es un pan plano leudado, cocido tradicionalmente en un horno tandoor, y acompaña frecuentemente los currys y platos en salsa en la India.")
        ),
        BilingualQuestion(
            id = 21230, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'étoiles maximum un restaurant peut-il recevoir au Guide Michelin ?", listOf("3", "4", "5", "2"), "Gastronomie", "Le Guide Michelin attribue un maximum de trois étoiles, symbole d'une cuisine exceptionnelle qui vaut le détour. C'est la plus haute distinction possible pour un restaurant."),
            en = LocalizedContent("What is the maximum number of stars a restaurant can receive in the Michelin Guide?", listOf("3", "4", "5", "2"), "Gastronomy", "The Michelin Guide awards a maximum of three stars, symbolizing exceptional cuisine worth a special journey. It is the highest possible distinction for a restaurant."),
            zh = LocalizedContent("一家餐厅在米其林指南中最多能获得几颗星？", listOf("3", "4", "5", "2"), "美食", "米其林指南最高授予三颗星，代表值得专程前往的杰出美食。这是餐厅可能获得的最高荣誉。"),
            es = LocalizedContent("¿Cuál es el número máximo de estrellas que un restaurante puede recibir en la Guía Michelin?", listOf("3", "4", "5", "2"), "Gastronomía", "La Guía Michelin otorga un máximo de tres estrellas, símbolo de una cocina excepcional que merece un viaje especial. Es la distinción más alta posible para un restaurante.")
        ),
        BilingualQuestion(
            id = 21303, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de continents y a-t-il ?", listOf("7", "5", "6", "8"), "Géographie", "Le modèle des sept continents (Afrique, Amérique, Antarctique, Asie, Europe, Océanie) est le plus enseigné dans les pays francophones."),
            en = LocalizedContent("How many continents are there?", listOf("7", "5", "6", "8"), "Geography", "The seven-continent model (Africa, America, Antarctica, Asia, Europe, Oceania) is the most taught in French-speaking countries."),
            zh = LocalizedContent("世界上有几个大洲？", listOf("7", "5", "6", "8"), "地理", "七大洲模型（非洲、美洲、南极洲、亚洲、欧洲、大洋洲）在法语国家最为常见。"),
            es = LocalizedContent("¿Cuántos continentes hay?", listOf("7", "5", "6", "8"), "Geografía", "El modelo de siete continentes (África, América, Antártida, Asia, Europa, Oceanía) es el más enseñado en los países francófonos.")
        ),
        BilingualQuestion(
            id = 21304, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la plus haute montagne du monde ?", listOf("L'Everest", "Le K2", "Le Kangchenjunga", "Le Mont Blanc"), "Géographie", "L'Everest, culminant à 8 848 mètres, est le sommet le plus élevé de la planète, situé dans la chaîne de l'Himalaya, à la frontière du Népal et du Tibet."),
            en = LocalizedContent("What is the highest mountain in the world?", listOf("Everest", "K2", "Kangchenjunga", "Mont Blanc"), "Geography", "Mount Everest, at 8,848 meters, is the highest peak on Earth, located in the Himalayas on the border of Nepal and Tibet."),
            zh = LocalizedContent("世界上最高的山是什么？", listOf("珠穆朗玛峰", "乔戈里峰", "干城章嘉峰", "勃朗峰"), "地理", "珠穆朗玛峰海拔8848米，是地球最高峰，位于喜马拉雅山脉，尼泊尔与西藏交界处。"),
            es = LocalizedContent("¿Cuál es la montaña más alta del mundo?", listOf("El Everest", "El K2", "El Kangchenjunga", "El Mont Blanc"), "Geografía", "El Everest, con 8.848 metros, es el pico más alto del planeta, situado en la cordillera del Himalaya, en la frontera entre Nepal y el Tíbet.")
        ),
        BilingualQuestion(
            id = 21305, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel détroit sépare l'Europe de l'Afrique ?", listOf("Le détroit de Gibraltar", "Le Bosphore", "Le détroit de Messine", "Le détroit d'Ormuz"), "Géographie", "Le détroit de Gibraltar relie la mer Méditerranée à l'océan Atlantique, séparant l'Espagne au nord du Maroc au sud."),
            en = LocalizedContent("Which strait separates Europe from Africa?", listOf("Strait of Gibraltar", "Bosphorus", "Strait of Messina", "Strait of Hormuz"), "Geography", "The Strait of Gibraltar connects the Mediterranean Sea to the Atlantic Ocean, separating Spain in the north from Morocco in the south."),
            zh = LocalizedContent("哪个海峡分隔了欧洲和非洲？", listOf("直布罗陀海峡", "博斯普鲁斯海峡", "墨西拿海峡", "霍尔木兹海峡"), "地理", "直布罗陀海峡连接地中海和大西洋，北边是西班牙，南边是摩洛哥。"),
            es = LocalizedContent("¿Qué estrecho separa Europa de África?", listOf("El estrecho de Gibraltar", "El Bósforo", "El estrecho de Mesina", "El estrecho de Ormuz"), "Geografía", "El estrecho de Gibraltar conecta el mar Mediterráneo con el océano Atlántico, separando España al norte de Marruecos al sur.")
        ),
        BilingualQuestion(
            id = 21306, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la ville la plus peuplée du monde ?", listOf("Tokyo", "Shanghai", "New York", "São Paulo"), "Géographie", "Tokyo est l'agglomération la plus peuplée du monde avec environ 37 millions d'habitants, dépassant largement les autres grandes métropoles comme Delhi ou Shanghai."),
            en = LocalizedContent("What is the most populous city in the world?", listOf("Tokyo", "Shanghai", "New York", "São Paulo"), "Geography", "Tokyo is the most populous metropolitan area in the world with about 37 million inhabitants, far exceeding other major cities like Delhi or Shanghai."),
            zh = LocalizedContent("世界上人口最多的城市是哪个？", listOf("东京", "上海", "纽约", "圣保罗"), "地理", "东京是世界上人口最多的大都市区，约有3700万居民，远超德里或上海等其他大城市。"),
            es = LocalizedContent("¿Cuál es la ciudad más poblada del mundo?", listOf("Tokio", "Shanghái", "Nueva York", "São Paulo"), "Geografía", "Tokio es el área metropolitana más poblada del mundo con unos 37 millones de habitantes, superando ampliamente a otras grandes metrópolis como Delhi o Shanghái.")
        ),
        BilingualQuestion(
            id = 21307, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel océan se trouve Madagascar ?", listOf("L'océan Indien", "L'océan Atlantique", "L'océan Pacifique", "L'océan Arctique"), "Géographie", "Madagascar est une île située dans l'océan Indien, au large de la côte sud-est de l'Afrique."),
            en = LocalizedContent("In which ocean is Madagascar located?", listOf("Indian Ocean", "Atlantic Ocean", "Pacific Ocean", "Arctic Ocean"), "Geography", "Madagascar is an island located in the Indian Ocean, off the southeastern coast of Africa."),
            zh = LocalizedContent("马达加斯加位于哪个海洋？", listOf("印度洋", "大西洋", "太平洋", "北冰洋"), "地理", "马达加斯加是一个位于印度洋的岛屿，靠近非洲东南海岸。"),
            es = LocalizedContent("¿En qué océano se encuentra Madagascar?", listOf("Océano Índico", "Océano Atlántico", "Océano Pacífico", "Océano Ártico"), "Geografía", "Madagascar es una isla situada en el océano Índico, frente a la costa sureste de África.")
        ),
        BilingualQuestion(
            id = 21309, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande superficie en Afrique ?", listOf("L'Algérie", "Le Congo", "Le Soudan", "La Libye"), "Géographie", "Depuis le partition du Soudan en 2011, l'Algérie est le plus vaste pays d'Afrique avec une superficie de près de 2,38 millions de km²."),
            en = LocalizedContent("Which country has the largest area in Africa?", listOf("Algeria", "Congo", "Sudan", "Libya"), "Geography", "Since the partition of Sudan in 2011, Algeria is the largest country in Africa with an area of nearly 2.38 million km²."),
            zh = LocalizedContent("非洲面积最大的国家是哪个？", listOf("阿尔及利亚", "刚果", "苏丹", "利比亚"), "地理", "自2011年苏丹分裂后，阿尔及利亚是非洲面积最大的国家，面积近238万平方公里。"),
            es = LocalizedContent("¿Qué país tiene la mayor superficie en África?", listOf("Argelia", "Congo", "Sudán", "Libia"), "Geografía", "Desde la partición de Sudán en 2011, Argelia es el país más grande de África con una superficie de casi 2,38 millones de km².")
        ),
        BilingualQuestion(
            id = 21310, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle mer est la plus salée du monde ?", listOf("La mer Morte", "La mer Rouge", "La mer Caspienne", "La mer Méditerranée"), "Géographie", "La mer Morte est la plus salée du monde en raison de son taux de salinité extrêmement élevé, environ 34 %, dû à une forte évaporation et à l'absence d'exutoire."),
            en = LocalizedContent("Which sea is the saltiest in the world?", listOf("Dead Sea", "Red Sea", "Caspian Sea", "Mediterranean Sea"), "Geography", "The Dead Sea is the saltiest in the world due to its extremely high salinity rate, about 34%, caused by high evaporation and lack of outlet."),
            zh = LocalizedContent("世界上最咸的海是哪个？", listOf("死海", "红海", "里海", "地中海"), "地理", "死海是世界上最咸的海，盐度高达约34%，这是由于高蒸发率和没有出水口所致。"),
            es = LocalizedContent("¿Qué mar es el más salado del mundo?", listOf("Mar Muerto", "Mar Rojo", "Mar Caspio", "Mar Mediterráneo"), "Geografía", "El Mar Muerto es el más salado del mundo debido a su tasa de salinidad extremadamente alta, alrededor del 34%, causada por una alta evaporación y la falta de salida.")
        ),
        BilingualQuestion(
            id = 21311, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pays est traversé par le plus grand nombre de fuseaux horaires ?", listOf("La France (12 fuseaux, outre-mer)", "La Russie (11)", "Les États-Unis (6)", "Le Canada (6)"), "Géographie", "La France possède 12 fuseaux horaires grâce à ses territoires d'outre-mer dispersés dans l'océan Pacifique, l'océan Indien et l'Atlantique."),
            en = LocalizedContent("Which country spans the most time zones?", listOf("France (12 zones, overseas)", "Russia (11)", "United States (6)", "Canada (6)"), "Geography", "France has 12 time zones thanks to its overseas territories scattered across the Pacific, Indian, and Atlantic Oceans."),
            zh = LocalizedContent("哪个国家跨越的时区最多？", listOf("法国（12个时区，包括海外领土）", "俄罗斯（11个）", "美国（6个）", "加拿大（6个）"), "地理", "法国拥有12个时区，这得益于其分布在太平洋、印度洋和大西洋的海外领土。"),
            es = LocalizedContent("¿Qué país abarca la mayor cantidad de husos horarios?", listOf("Francia (12 husos, ultramar)", "Rusia (11)", "Estados Unidos (6)", "Canadá (6)"), "Geografía", "Francia tiene 12 husos horarios gracias a sus territorios de ultramar dispersos en los océanos Pacífico, Índico y Atlántico.")
        ),
        BilingualQuestion(
            id = 21314, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Sur quel continent se trouve le Kilimandjaro ?", listOf("L'Afrique", "L'Asie", "L'Amérique du Sud", "L'Europe"), "Géographie", "Le Kilimandjaro est le plus haut sommet d'Afrique, culminant à 5 895 mètres, et il est situé en Tanzanie, dans l'est du continent africain."),
            en = LocalizedContent("On which continent is Mount Kilimanjaro located?", listOf("Africa", "Asia", "South America", "Europe"), "Geography", "Mount Kilimanjaro is the highest peak in Africa, rising to 5,895 meters, and is located in Tanzania, in eastern Africa."),
            zh = LocalizedContent("乞力马扎罗山位于哪个大陆？", listOf("非洲", "亚洲", "南美洲", "欧洲"), "地理", "乞力马扎罗山是非洲最高峰，海拔5895米，位于坦桑尼亚，在非洲东部。"),
            es = LocalizedContent("¿En qué continente se encuentra el Kilimanjaro?", listOf("África", "Asia", "América del Sur", "Europa"), "Geografía", "El Kilimanjaro es la cumbre más alta de África, con 5.895 metros, y está situado en Tanzania, en el este del continente africano.")
        ),
        BilingualQuestion(
            id = 21315, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fleuve traverse Paris ?", listOf("La Seine", "La Loire", "Le Rhône", "La Garonne"), "Géographie", "La Seine traverse Paris en formant un large méandre qui divise la ville en rive droite et rive gauche."),
            en = LocalizedContent("Which river flows through Paris?", listOf("Seine", "Loire", "Rhône", "Garonne"), "Geography", "The Seine flows through Paris, forming a wide meander that divides the city into the Right Bank and the Left Bank."),
            zh = LocalizedContent("哪条河流经巴黎？", listOf("塞纳河", "卢瓦尔河", "罗讷河", "加龙河"), "地理", "塞纳河流经巴黎，形成一个宽阔的河曲，将城市分为右岸和左岸。"),
            es = LocalizedContent("¿Qué río atraviesa París?", listOf("Sena", "Loire", "Ródano", "Garona"), "Geografía", "El Sena atraviesa París formando un amplio meandro que divide la ciudad en la orilla derecha y la orilla izquierda.")
        ),
        BilingualQuestion(
            id = 21317, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est surnommé 'le pays du Soleil-Levant' ?", listOf("Le Japon", "La Chine", "La Corée du Sud", "La Thaïlande"), "Géographie", "Le Japon est surnommé le pays du Soleil-Levant car il est situé à l'est de l'Asie, et son nom en japonais, Nihon, signifie littéralement origine du soleil."),
            en = LocalizedContent("Which country is called 'the Land of the Rising Sun'?", listOf("Japan", "China", "South Korea", "Thailand"), "Geography", "Japan is called the Land of the Rising Sun because it is located east of Asia, and its name in Japanese, Nihon, literally means origin of the sun."),
            zh = LocalizedContent("哪个国家被称为“日出之国”？", listOf("日本", "中国", "韩国", "泰国"), "地理", "日本被称为日出之国，因为它位于亚洲东部，其日语名称“日本”字面意思是太阳的起源。"),
            es = LocalizedContent("¿Qué país es apodado 'el país del sol naciente'?", listOf("Japón", "China", "Corea del Sur", "Tailandia"), "Geografía", "Japón es apodado el país del sol naciente porque está situado al este de Asia, y su nombre en japonés, Nihon, significa literalmente origen del sol.")
        ),
        BilingualQuestion(
            id = 21319, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est en forme de botte ?", listOf("L'Italie", "La Grèce", "Le Portugal", "La Croatie"), "Géographie", "La péninsule italienne s'étend dans la mer Méditerranée, et sa forme évoque une botte, avec le talon correspondant aux Pouilles et la pointe à la Calabre."),
            en = LocalizedContent("Which country is shaped like a boot?", listOf("Italy", "Greece", "Portugal", "Croatia"), "Geography", "The Italian peninsula extends into the Mediterranean Sea, and its shape resembles a boot, with the heel corresponding to Apulia and the toe to Calabria."),
            zh = LocalizedContent("哪个国家形状像靴子？", listOf("意大利", "希腊", "葡萄牙", "克罗地亚"), "地理", "意大利半岛伸入地中海，其形状像一只靴子，鞋跟对应普利亚，鞋尖对应卡拉布里亚。"),
            es = LocalizedContent("¿Qué país tiene forma de bota?", listOf("Italia", "Grecia", "Portugal", "Croacia"), "Geografía", "La península itálica se extiende en el mar Mediterráneo, y su forma recuerda a una bota, con el talón correspondiente a Apulia y la punta a Calabria.")
        ),
        BilingualQuestion(
            id = 21321, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point le plus bas de la Terre ?", listOf("La mer Morte (-430m)", "La fosse des Mariannes", "Le lac Assal", "Death Valley"), "Géographie", "La mer Morte, située entre Israël, la Jordanie et la Cisjordanie, est le point le plus bas de la surface terrestre avec une altitude de -430 mètres."),
            en = LocalizedContent("What is the lowest point on Earth?", listOf("Dead Sea (-430m)", "Mariana Trench", "Lake Assal", "Death Valley"), "Geography", "The Dead Sea, located between Israel, Jordan, and the West Bank, is the lowest point on Earth's surface at an elevation of -430 meters."),
            zh = LocalizedContent("地球上的最低点是什么？", listOf("死海（-430米）", "马里亚纳海沟", "阿萨勒湖", "死亡谷"), "地理", "死海位于以色列、约旦和约旦河西岸之间，海拔-430米，是地球表面的最低点。"),
            es = LocalizedContent("¿Cuál es el punto más bajo de la Tierra?", listOf("Mar Muerto (-430m)", "Fosa de las Marianas", "Lago Assal", "Valle de la Muerte"), "Geografía", "El Mar Muerto, situado entre Israel, Jordania y Cisjordania, es el punto más bajo de la superficie terrestre con una altitud de -430 metros.")
        ),
        BilingualQuestion(
            id = 21322, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle île est la plus grande du monde ?", listOf("Le Groenland", "Madagascar", "Bornéo", "La Nouvelle-Guinée"), "Géographie", "Le Groenland est une vaste île située dans l'océan Atlantique Nord, territoire autonome du Danemark, dont la superficie de 2,16 millions de km² en fait la plus grande île non continentale du monde."),
            en = LocalizedContent("Which is the largest island in the world?", listOf("Greenland", "Madagascar", "Borneo", "New Guinea"), "Geography", "Greenland is a vast island in the North Atlantic Ocean, an autonomous territory of Denmark, with an area of 2.16 million km², making it the largest non-continental island in the world."),
            zh = LocalizedContent("世界上最大的岛屿是哪个？", listOf("格陵兰", "马达加斯加", "婆罗洲", "新几内亚"), "地理", "格陵兰是北大西洋的一个巨大岛屿，是丹麦的自治领土，面积216万平方公里，是世界上最大的非大陆岛屿。"),
            es = LocalizedContent("¿Cuál es la isla más grande del mundo?", listOf("Groenlandia", "Madagascar", "Borneo", "Nueva Guinea"), "Geografía", "Groenlandia es una vasta isla en el océano Atlántico Norte, territorio autónomo de Dinamarca, con una superficie de 2,16 millones de km², lo que la convierte en la isla no continental más grande del mundo.")
        ),
        BilingualQuestion(
            id = 21324, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pays l'Afrique compte-t-elle ?", listOf("54", "48", "60", "45"), "Géographie", "L'Union africaine reconnaît officiellement 54 États souverains sur le continent, incluant des pays comme le Nigeria et l'Égypte, mais excluant le Sahara occidental (territoire disputé)."),
            en = LocalizedContent("How many countries does Africa have?", listOf("54", "48", "60", "45"), "Geography", "The African Union officially recognizes 54 sovereign states on the continent, including countries like Nigeria and Egypt, but excluding Western Sahara (a disputed territory)."),
            zh = LocalizedContent("非洲有多少个国家？", listOf("54", "48", "60", "45"), "地理", "非洲联盟正式承认非洲大陆有54个主权国家，包括尼日利亚和埃及等国家，但不包括西撒哈拉（争议领土）。"),
            es = LocalizedContent("¿Cuántos países tiene África?", listOf("54", "48", "60", "45"), "Geografia", "La Unión Africana reconoce oficialmente 54 estados soberanos en el continente, incluyendo países como Nigeria y Egipto, pero excluyendo el Sáhara Occidental (territorio en disputa).")
        ),
        BilingualQuestion(
            id = 21325, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays partage la plus longue frontière terrestre avec la France métropolitaine ?", listOf("L'Espagne", "La Belgique", "L'Italie", "L'Allemagne"), "Géographie", "La France métropolitaine partage sa plus longue frontière terrestre avec l'Espagne, longue de 623 km le long des Pyrénées."),
            en = LocalizedContent("Which country shares the longest land border with metropolitan France?", listOf("Spain", "Belgium", "Italy", "Germany"), "Geography", "Metropolitan France shares its longest land border with Spain, stretching 623 km along the Pyrenees."),
            zh = LocalizedContent("哪个国家与法国本土共享最长的陆地边界？", listOf("西班牙", "比利时", "意大利", "德国"), "地理", "法国本土与西班牙共享最长的陆地边界，沿比利牛斯山脉长达623公里。"),
            es = LocalizedContent("¿Qué país comparte la frontera terrestre más larga con la Francia metropolitana?", listOf("España", "Bélgica", "Italia", "Alemania"), "Geografia", "La Francia metropolitana comparte su frontera terrestre más larga con España, de 623 km a lo largo de los Pirineos.")
        ),
        BilingualQuestion(
            id = 21327, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays est un archipel de 17 000 îles ?", listOf("L'Indonésie", "Les Philippines", "Le Japon", "La Grèce"), "Géographie", "L'Indonésie est le plus grand archipel du monde, composé d'environ 17 000 îles, dont les principales sont Java, Sumatra, Bornéo, Sulawesi et la Nouvelle-Guinée."),
            en = LocalizedContent("Which country is an archipelago of 17,000 islands?", listOf("Indonesia", "Philippines", "Japan", "Greece"), "Geography", "Indonesia is the world's largest archipelago, consisting of about 17,000 islands, including Java, Sumatra, Borneo, Sulawesi, and New Guinea."),
            zh = LocalizedContent("哪个国家是一个由17000个岛屿组成的群岛？", listOf("印度尼西亚", "菲律宾", "日本", "希腊"), "地理", "印度尼西亚是世界上最大的群岛国家，由约17000个岛屿组成，包括爪哇岛、苏门答腊岛、加里曼丹岛、苏拉威西岛和新几内亚岛。"),
            es = LocalizedContent("¿Qué país es un archipiélago de 17.000 islas?", listOf("Indonesia", "Filipinas", "Japón", "Grecia"), "Geografia", "Indonesia es el archipiélago más grande del mundo, compuesto por unas 17.000 islas, incluyendo Java, Sumatra, Borneo, Célebes y Nueva Guinea.")
        ),
        BilingualQuestion(
            id = 21328, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Où se trouve le canal de Suez ?", listOf("En Égypte", "Au Panama", "En Turquie", "Au Maroc"), "Géographie", "Le canal de Suez relie la mer Méditerranée à la mer Rouge, et il traverse entièrement le territoire égyptien."),
            en = LocalizedContent("Where is the Suez Canal located?", listOf("In Egypt", "In Panama", "In Turkey", "In Morocco"), "Geography", "The Suez Canal connects the Mediterranean Sea to the Red Sea and runs entirely through Egyptian territory."),
            zh = LocalizedContent("苏伊士运河位于哪里？", listOf("埃及", "巴拿马", "土耳其", "摩洛哥"), "地理", "苏伊士运河连接地中海和红海，完全穿越埃及领土。"),
            es = LocalizedContent("¿Dónde se encuentra el canal de Suez?", listOf("En Egipto", "En Panamá", "En Turquía", "En Marruecos"), "Geografia", "El canal de Suez conecta el mar Mediterráneo con el mar Rojo y atraviesa completamente el territorio egipcio.")
        ),
        BilingualQuestion(
            id = 21329, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville est surnommée 'la Ville éternelle' ?", listOf("Rome", "Athènes", "Paris", "Istanbul"), "Géographie", "Rome est surnommée la Ville éternelle en raison de sa longévité historique et de son influence durable sur la civilisation occidentale, un titre qui remonte à l'Antiquité romaine."),
            en = LocalizedContent("Which city is nicknamed 'the Eternal City'?", listOf("Rome", "Athens", "Paris", "Istanbul"), "Geography", "Rome is called the Eternal City due to its historical longevity and lasting influence on Western civilization, a title dating back to Roman antiquity."),
            zh = LocalizedContent("哪座城市被称为“永恒之城”？", listOf("罗马", "雅典", "巴黎", "伊斯坦布尔"), "地理", "罗马被称为永恒之城，因其悠久的历史和对西方文明的持久影响，这一称号可追溯到古罗马时期。"),
            es = LocalizedContent("¿Qué ciudad es apodada 'la Ciudad Eterna'?", listOf("Roma", "Atenas", "París", "Estambul"), "Geografia", "Roma es llamada la Ciudad Eterna debido a su longevidad histórica y su influencia duradera en la civilización occidental, un título que se remonta a la antigüedad romana.")
        ),
        BilingualQuestion(
            id = 21330, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a le plus d'habitants au monde ?", listOf("L'Inde", "La Chine", "Les États-Unis", "L'Indonésie"), "Géographie", "L'Inde a dépassé la Chine en 2023 pour devenir le pays le plus peuplé du monde, avec environ 1,4 milliard d'habitants."),
            en = LocalizedContent("Which country has the most inhabitants in the world?", listOf("India", "China", "United States", "Indonesia"), "Geography", "India surpassed China in 2023 to become the world's most populous country, with about 1.4 billion inhabitants."),
            zh = LocalizedContent("哪个国家是世界上人口最多的？", listOf("印度", "中国", "美国", "印度尼西亚"), "地理", "印度在2023年超过中国，成为世界上人口最多的国家，约有14亿居民。"),
            es = LocalizedContent("¿Qué país tiene más habitantes del mundo?", listOf("India", "China", "Estados Unidos", "Indonesia"), "Geografia", "India superó a China en 2023 para convertirse en el país más poblado del mundo, con aproximadamente 1.400 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 21401, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage de programmation est surnommé le 'langage du web' ?", listOf("JavaScript", "Python", "Java", "C++"), "Tech", "JavaScript est le langage de programmation principalement utilisé pour rendre les pages web interactives, d'où son surnom de \"langage du web\". Il est exécuté par les navigateurs et permet des fonctionnalités dynamiques comme les animations et les formulaires."),
            en = LocalizedContent("Which programming language is nicknamed the 'language of the web'?", listOf("JavaScript", "Python", "Java", "C++"), "Technology", "JavaScript is the programming language primarily used to make web pages interactive, hence its nickname 'language of the web'. It is executed by browsers and enables dynamic features like animations and forms."),
            zh = LocalizedContent("哪种编程语言被称为“网络语言”？", listOf("JavaScript", "Python", "Java", "C++"), "科技", "JavaScript是主要用于使网页交互的编程语言，因此被称为“网络语言”。它由浏览器执行，支持动画和表单等动态功能。"),
            es = LocalizedContent("¿Qué lenguaje de programación es apodado el 'lenguaje de la web'?", listOf("JavaScript", "Python", "Java", "C++"), "Tecnologia", "JavaScript es el lenguaje de programación utilizado principalmente para hacer páginas web interactivas, de ahí su apodo de 'lenguaje de la web'. Es ejecutado por los navegadores y permite funciones dinámicas como animaciones y formularios.")
        ),
        BilingualQuestion(
            id = 21403, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'IA' ?", listOf("Intelligence Artificielle", "Interface Automatique", "Informatique Avancée", "Intégration Applicative"), "Tech", "L'acronyme IA désigne l'Intelligence Artificielle, un domaine de l'informatique visant à créer des systèmes capables de simuler des capacités cognitives humaines."),
            en = LocalizedContent("What does 'AI' stand for?", listOf("Artificial Intelligence", "Automatic Interface", "Advanced Computing", "Application Integration"), "Technology", "The acronym AI stands for Artificial Intelligence, a field of computer science aimed at creating systems capable of simulating human cognitive abilities."),
            zh = LocalizedContent("“AI”代表什么？", listOf("人工智能", "自动接口", "高级计算", "应用集成"), "科技", "缩写AI代表人工智能，是计算机科学的一个领域，旨在创建能够模拟人类认知能力的系统。"),
            es = LocalizedContent("¿Qué significa 'IA'?", listOf("Inteligencia Artificial", "Interfaz Automática", "Informática Avanzada", "Integración de Aplicaciones"), "Tecnologia", "El acrónimo IA significa Inteligencia Artificial, un campo de la informática que busca crear sistemas capaces de simular capacidades cognitivas humanas.")
        ),
        BilingualQuestion(
            id = 21404, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier iPhone est-il sorti ?", listOf("2007", "2005", "2009", "2010"), "Tech", "Le premier iPhone a été présenté par Steve Jobs le 9 janvier 2007 et mis en vente aux États-Unis le 29 juin de la même année."),
            en = LocalizedContent("In which year was the first iPhone released?", listOf("2007", "2005", "2009", "2010"), "Technology", "The first iPhone was unveiled by Steve Jobs on January 9, 2007, and went on sale in the United States on June 29 of the same year."),
            zh = LocalizedContent("第一代iPhone是哪一年发布的？", listOf("2007", "2005", "2009", "2010"), "科技", "第一代iPhone由史蒂夫·乔布斯于2007年1月9日发布，并于同年6月29日在美国上市。"),
            es = LocalizedContent("¿En qué año se lanzó el primer iPhone?", listOf("2007", "2005", "2009", "2010"), "Tecnologia", "El primer iPhone fue presentado por Steve Jobs el 9 de enero de 2007 y salió a la venta en Estados Unidos el 29 de junio del mismo año.")
        ),
        BilingualQuestion(
            id = 21405, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel protocole est utilisé pour les pages web sécurisées ?", listOf("HTTPS", "FTP", "SSH", "SMTP"), "Tech", "HTTPS (HyperText Transfer Protocol Secure) chiffre les données échangées entre le navigateur et le serveur via TLS/SSL, contrairement au HTTP non sécurisé."),
            en = LocalizedContent("Which protocol is used for secure web pages?", listOf("HTTPS", "FTP", "SSH", "SMTP"), "Technology", "HTTPS (HyperText Transfer Protocol Secure) encrypts data exchanged between the browser and server via TLS/SSL, unlike unsecured HTTP."),
            zh = LocalizedContent("哪种协议用于安全网页？", listOf("HTTPS", "FTP", "SSH", "SMTP"), "科技", "HTTPS（超文本传输安全协议）通过TLS/SSL加密浏览器和服务器之间交换的数据，与不安全的HTTP不同。"),
            es = LocalizedContent("¿Qué protocolo se utiliza para páginas web seguras?", listOf("HTTPS", "FTP", "SSH", "SMTP"), "Tecnologia", "HTTPS (Protocolo Seguro de Transferencia de Hipertexto) cifra los datos intercambiados entre el navegador y el servidor mediante TLS/SSL, a diferencia del HTTP no seguro.")
        ),
        BilingualQuestion(
            id = 21407, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le système d'exploitation mobile le plus utilisé ?", listOf("Android", "iOS", "Windows Phone", "HarmonyOS"), "Tech", "Android domine le marché mondial des smartphones avec plus de 70 % de parts, grâce à son adoption par de nombreux fabricants comme Samsung et Xiaomi."),
            en = LocalizedContent("What is the most used mobile operating system?", listOf("Android", "iOS", "Windows Phone", "HarmonyOS"), "Technology", "Android dominates the global smartphone market with over 70% share, thanks to its adoption by many manufacturers like Samsung and Xiaomi."),
            zh = LocalizedContent("最常用的移动操作系统是什么？", listOf("Android", "iOS", "Windows Phone", "HarmonyOS"), "科技", "Android 凭借三星和小米等众多制造商的采用，在全球智能手机市场占据超过 70% 的份额。"),
            es = LocalizedContent("¿Cuál es el sistema operativo móvil más utilizado?", listOf("Android", "iOS", "Windows Phone", "HarmonyOS"), "Tecnología", "Android domina el mercado mundial de teléfonos inteligentes con más del 70% de cuota, gracias a su adopción por muchos fabricantes como Samsung y Xiaomi.")
        ),
        BilingualQuestion(
            id = 21408, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie l'acronyme 'CPU' ?", listOf("Central Processing Unit", "Computer Power Unit", "Central Program Utility", "Core Process Unit"), "Tech", "Le CPU, ou Central Processing Unit, est le composant principal d'un ordinateur qui exécute les instructions des programmes. Il est souvent appelé le \"cerveau\" de la machine."),
            en = LocalizedContent("What does the acronym 'CPU' stand for?", listOf("Central Processing Unit", "Computer Power Unit", "Central Program Utility", "Core Process Unit"), "Technology", "The CPU, or Central Processing Unit, is the main component of a computer that executes program instructions. It is often called the 'brain' of the machine."),
            zh = LocalizedContent("缩写 'CPU' 代表什么？", listOf("中央处理器", "计算机电源单元", "中央程序实用程序", "核心处理单元"), "科技", "CPU，即中央处理器，是计算机中执行程序指令的主要组件，常被称为机器的“大脑”。"),
            es = LocalizedContent("¿Qué significa el acrónimo 'CPU'?", listOf("Unidad Central de Procesamiento", "Unidad de Potencia del Computador", "Utilidad Central de Programas", "Unidad de Proceso Central"), "Tecnología", "La CPU, o Unidad Central de Procesamiento, es el componente principal de una computadora que ejecuta las instrucciones de los programas. A menudo se le llama el 'cerebro' de la máquina.")
        ),
        BilingualQuestion(
            id = 21409, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réseau social a été fondé par Mark Zuckerberg ?", listOf("Facebook", "Twitter", "LinkedIn", "Instagram"), "Tech", "Mark Zuckerberg a cofondé Facebook en 2004 avec ses camarades de l'université Harvard, Eduardo Saverin, Andrew McCollum, Dustin Moskovitz et Chris Hughes."),
            en = LocalizedContent("Which social network was founded by Mark Zuckerberg?", listOf("Facebook", "Twitter", "LinkedIn", "Instagram"), "Technology", "Mark Zuckerberg co-founded Facebook in 2004 with his Harvard classmates Eduardo Saverin, Andrew McCollum, Dustin Moskovitz, and Chris Hughes."),
            zh = LocalizedContent("哪个社交网络是由马克·扎克伯格创立的？", listOf("Facebook", "Twitter", "LinkedIn", "Instagram"), "科技", "马克·扎克伯格于2004年与哈佛同学爱德华多·萨维林、安德鲁·麦科勒姆、达斯汀·莫斯科维茨和克里斯·休斯共同创立了Facebook。"),
            es = LocalizedContent("¿Qué red social fue fundada por Mark Zuckerberg?", listOf("Facebook", "Twitter", "LinkedIn", "Instagram"), "Tecnología", "Mark Zuckerberg cofundó Facebook en 2004 con sus compañeros de Harvard Eduardo Saverin, Andrew McCollum, Dustin Moskovitz y Chris Hughes.")
        ),
        BilingualQuestion(
            id = 21411, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel algorithme est utilisé pour le chiffrement asymétrique ?", listOf("RSA", "AES", "SHA-256", "MD5"), "Tech", "RSA est un algorithme de chiffrement asymétrique reposant sur la difficulté de factoriser de grands nombres premiers, largement utilisé pour sécuriser les communications en ligne."),
            en = LocalizedContent("Which algorithm is used for asymmetric encryption?", listOf("RSA", "AES", "SHA-256", "MD5"), "Technology", "RSA is an asymmetric encryption algorithm based on the difficulty of factoring large prime numbers, widely used to secure online communications."),
            zh = LocalizedContent("哪种算法用于非对称加密？", listOf("RSA", "AES", "SHA-256", "MD5"), "科技", "RSA 是一种基于大素数分解难度的非对称加密算法，广泛用于保护在线通信。"),
            es = LocalizedContent("¿Qué algoritmo se utiliza para el cifrado asimétrico?", listOf("RSA", "AES", "SHA-256", "MD5"), "Tecnología", "RSA es un algoritmo de cifrado asimétrico basado en la dificultad de factorizar grandes números primos, ampliamente utilizado para asegurar las comunicaciones en línea.")
        ),
        BilingualQuestion(
            id = 21413, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un API ?", listOf("Application Programming Interface", "Automated Process Integration", "Advanced Protocol Internet", "Application Port Identifier"), "Tech", "Une API est un ensemble de règles et de protocoles qui permet à deux applications logicielles de communiquer entre elles, facilitant l'échange de données et de fonctionnalités."),
            en = LocalizedContent("What is an API?", listOf("Application Programming Interface", "Automated Process Integration", "Advanced Protocol Internet", "Application Port Identifier"), "Technology", "An API is a set of rules and protocols that allows two software applications to communicate with each other, facilitating data and functionality exchange."),
            zh = LocalizedContent("什么是 API？", listOf("应用程序编程接口", "自动化流程集成", "高级协议互联网", "应用程序端口标识符"), "科技", "API 是一组规则和协议，允许两个软件应用程序相互通信，促进数据和功能的交换。"),
            es = LocalizedContent("¿Qué es una API?", listOf("Interfaz de Programación de Aplicaciones", "Integración de Procesos Automatizados", "Protocolo Avanzado de Internet", "Identificador de Puerto de Aplicación"), "Tecnología", "Una API es un conjunto de reglas y protocolos que permite que dos aplicaciones de software se comuniquen entre sí, facilitando el intercambio de datos y funcionalidades.")
        ),
        BilingualQuestion(
            id = 21414, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage est utilisé pour le machine learning ?", listOf("Python", "HTML", "CSS", "SQL"), "Tech", "Python est le langage le plus utilisé en machine learning grâce à ses bibliothèques spécialisées comme TensorFlow, PyTorch et scikit-learn, qui simplifient la création et l'entraînement de modèles."),
            en = LocalizedContent("Which language is used for machine learning?", listOf("Python", "HTML", "CSS", "SQL"), "Technology", "Python is the most used language in machine learning thanks to its specialized libraries like TensorFlow, PyTorch, and scikit-learn, which simplify model creation and training."),
            zh = LocalizedContent("哪种语言用于机器学习？", listOf("Python", "HTML", "CSS", "SQL"), "科技", "Python 是机器学习中最常用的语言，因为它有 TensorFlow、PyTorch 和 scikit-learn 等专门库，简化了模型的创建和训练。"),
            es = LocalizedContent("¿Qué lenguaje se utiliza para el aprendizaje automático?", listOf("Python", "HTML", "CSS", "SQL"), "Tecnología", "Python es el lenguaje más utilizado en aprendizaje automático gracias a sus bibliotecas especializadas como TensorFlow, PyTorch y scikit-learn, que simplifican la creación y entrenamiento de modelos.")
        ),
        BilingualQuestion(
            id = 21415, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de bits dans un octet ?", listOf("8", "4", "16", "32"), "Tech", "Un octet est une unité de mesure informatique standard composée de 8 bits, permettant de représenter 256 valeurs différentes (de 0 à 255)."),
            en = LocalizedContent("How many bits are in a byte?", listOf("8", "4", "16", "32"), "Technology", "A byte is a standard unit of digital information consisting of 8 bits, capable of representing 256 different values (from 0 to 255)."),
            zh = LocalizedContent("一个字节中有多少位？", listOf("8", "4", "16", "32"), "科技", "字节是由 8 位组成的标准数字信息单位，能够表示 256 个不同的值（从 0 到 255）。"),
            es = LocalizedContent("¿Cuántos bits hay en un byte?", listOf("8", "4", "16", "32"), "Tecnología", "Un byte es una unidad estándar de información digital compuesta por 8 bits, capaz de representar 256 valores diferentes (de 0 a 255).")
        ),
        BilingualQuestion(
            id = 21417, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel composant stocke les données de manière permanente ?", listOf("Le disque dur (SSD/HDD)", "La RAM", "Le CPU", "La carte graphique"), "Tech", "Contrairement à la mémoire vive (RAM), le disque dur (SSD ou HDD) conserve les données même après l'extinction de l'ordinateur, servant de stockage permanent pour le système d'exploitation et les fichiers."),
            en = LocalizedContent("Which component stores data permanently?", listOf("Hard drive (SSD/HDD)", "RAM", "CPU", "Graphics card"), "Technology", "Unlike RAM, the hard drive (SSD or HDD) retains data even after the computer is turned off, serving as permanent storage for the operating system and files."),
            zh = LocalizedContent("哪个组件永久存储数据？", listOf("硬盘（SSD/HDD）", "内存", "CPU", "显卡"), "科技", "与内存不同，硬盘（SSD 或 HDD）即使在计算机关闭后也能保留数据，作为操作系统和文件的永久存储。"),
            es = LocalizedContent("¿Qué componente almacena datos de forma permanente?", listOf("Disco duro (SSD/HDD)", "RAM", "CPU", "Tarjeta gráfica"), "Tecnología", "A diferencia de la RAM, el disco duro (SSD o HDD) conserva los datos incluso después de apagar la computadora, sirviendo como almacenamiento permanente para el sistema operativo y los archivos.")
        ),
        BilingualQuestion(
            id = 21419, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage principal des bases de données relationnelles ?", listOf("SQL", "Python", "Java", "R"), "Tech", "SQL (Structured Query Language) est le langage standard utilisé pour interroger, manipuler et gérer les données dans les bases de données relationnelles."),
            en = LocalizedContent("What is the main language of relational databases?", listOf("SQL", "Python", "Java", "R"), "Technology", "SQL (Structured Query Language) is the standard language used to query, manipulate, and manage data in relational databases."),
            zh = LocalizedContent("关系数据库的主要语言是什么？", listOf("SQL", "Python", "Java", "R"), "科技", "SQL（结构化查询语言）是用于查询、操作和管理关系数据库中数据的标准语言。"),
            es = LocalizedContent("¿Cuál es el lenguaje principal de las bases de datos relacionales?", listOf("SQL", "Python", "Java", "R"), "Tecnología", "SQL (Lenguaje de Consulta Estructurada) es el lenguaje estándar utilizado para consultar, manipular y gestionar datos en bases de datos relacionales.")
        ),
        BilingualQuestion(
            id = 21420, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un conteneur Docker ?", listOf("Un environnement isolé pour exécuter des applications", "Un type de serveur", "Un protocole réseau", "Un langage de programmation"), "Tech", "Docker utilise des conteneurs pour encapsuler une application et ses dépendances, garantissant qu'elle fonctionne de manière cohérente dans n'importe quel environnement."),
            en = LocalizedContent("What is a Docker container?", listOf("An isolated environment to run applications", "A type of server", "A network protocol", "A programming language"), "Technology", "Docker uses containers to encapsulate an application and its dependencies, ensuring it runs consistently in any environment."),
            zh = LocalizedContent("什么是 Docker 容器？", listOf("用于运行应用程序的隔离环境", "一种服务器类型", "一种网络协议", "一种编程语言"), "科技", "Docker 使用容器来封装应用程序及其依赖项，确保它在任何环境中都能一致运行。"),
            es = LocalizedContent("¿Qué es un contenedor Docker?", listOf("Un entorno aislado para ejecutar aplicaciones", "Un tipo de servidor", "Un protocolo de red", "Un lenguaje de programación"), "Tecnología", "Docker utiliza contenedores para encapsular una aplicación y sus dependencias, garantizando que funcione de manera consistente en cualquier entorno.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 21421, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le principe du modèle TCP/IP ?", listOf("Découper les données en paquets pour les transmettre", "Chiffrer les données", "Compresser les fichiers", "Accélérer le processeur"), "Tech", "Le modèle TCP/IP fragmente les données en paquets pour optimiser leur acheminement sur les réseaux, chaque paquet pouvant emprunter un chemin différent jusqu'à la destination."),
            en = LocalizedContent("What is the principle of the TCP/IP model?", listOf("Dividing data into packets for transmission", "Encrypting data", "Compressing files", "Speeding up the processor"), "Technology", "The TCP/IP model fragments data into packets to optimize their routing over networks, each packet potentially taking a different path to the destination."),
            zh = LocalizedContent("TCP/IP 模型的原理是什么？", listOf("将数据分割成数据包进行传输", "加密数据", "压缩文件", "加速处理器"), "科技", "TCP/IP 模型将数据分割成数据包，以优化其在网络上的传输，每个数据包可能通过不同的路径到达目的地。"),
            es = LocalizedContent("¿Cuál es el principio del modelo TCP/IP?", listOf("Dividir los datos en paquetes para transmitirlos", "Cifrar los datos", "Comprimir archivos", "Acelerar el procesador"), "Tecnología", "El modelo TCP/IP fragmenta los datos en paquetes para optimizar su enrutamiento a través de las redes, pudiendo cada paquete tomar una ruta diferente hasta el destino.")
        ),
        BilingualQuestion(
            id = 21422, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle entreprise a créé ChatGPT ?", listOf("OpenAI", "Google", "Meta", "Microsoft"), "Tech", "OpenAI a développé ChatGPT, un modèle de langage basé sur l'intelligence artificielle, lancé en novembre 2022. L'entreprise a été fondée en 2015 avec une mission de recherche en IA bénéfique."),
            en = LocalizedContent("Which company created ChatGPT?", listOf("OpenAI", "Google", "Meta", "Microsoft"), "Technology", "OpenAI developed ChatGPT, a language model based on artificial intelligence, launched in November 2022. The company was founded in 2015 with a mission of beneficial AI research."),
            zh = LocalizedContent("哪家公司创建了 ChatGPT？", listOf("OpenAI", "谷歌", "Meta", "微软"), "科技", "OpenAI 开发了 ChatGPT，这是一个基于人工智能的语言模型，于 2022 年 11 月推出。该公司成立于 2015 年，致力于有益的 AI 研究。"),
            es = LocalizedContent("¿Qué empresa creó ChatGPT?", listOf("OpenAI", "Google", "Meta", "Microsoft"), "Tecnología", "OpenAI desarrolló ChatGPT, un modelo de lenguaje basado en inteligencia artificial, lanzado en noviembre de 2022. La empresa fue fundada en 2015 con una misión de investigación en IA beneficiosa.")
        ),
        BilingualQuestion(
            id = 21424, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle d'un pare-feu (firewall) ?", listOf("Filtrer le trafic réseau entrant et sortant", "Accélérer Internet", "Stocker les mots de passe", "Compresser les données"), "Tech", "Le pare-feu agit comme une barrière de sécurité en analysant les paquets de données pour bloquer les accès non autorisés tout en autorisant les communications légitimes."),
            en = LocalizedContent("What is the role of a firewall?", listOf("Filtering incoming and outgoing network traffic", "Speeding up the Internet", "Storing passwords", "Compressing data"), "Technology", "The firewall acts as a security barrier by analyzing data packets to block unauthorized access while allowing legitimate communications."),
            zh = LocalizedContent("防火墙的作用是什么？", listOf("过滤进出网络流量", "加速互联网", "存储密码", "压缩数据"), "科技", "防火墙通过分析数据包来充当安全屏障，阻止未经授权的访问，同时允许合法通信。"),
            es = LocalizedContent("¿Cuál es el papel de un cortafuegos (firewall)?", listOf("Filtrar el tráfico de red entrante y saliente", "Acelerar Internet", "Almacenar contraseñas", "Comprimir datos"), "Tecnología", "El cortafuegos actúa como una barrera de seguridad analizando los paquetes de datos para bloquear accesos no autorizados mientras permite comunicaciones legítimas.")
        ),
        BilingualQuestion(
            id = 21425, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la loi de Moore ?", listOf("Le nombre de transistors double tous les ~2 ans", "La vitesse d'Internet double chaque année", "Le prix du stockage baisse de moitié", "La RAM double tous les 5 ans"), "Tech", "Énoncée en 1965 par Gordon Moore, cofondateur d'Intel, cette observation prédisait que la densité des transistors sur une puce doublerait environ tous les deux ans, ce qui a guidé l'innovation technologique pendant des décennies."),
            en = LocalizedContent("What is Moore's law?", listOf("The number of transistors doubles every ~2 years", "Internet speed doubles every year", "Storage price halves", "RAM doubles every 5 years"), "Technology", "Stated in 1965 by Gordon Moore, co-founder of Intel, this observation predicted that transistor density on a chip would double approximately every two years, guiding technological innovation for decades."),
            zh = LocalizedContent("什么是摩尔定律？", listOf("晶体管数量每约两年翻一番", "互联网速度每年翻倍", "存储价格减半", "内存每五年翻倍"), "科技", "1965 年由英特尔联合创始人戈登·摩尔提出，该观察预测芯片上的晶体管密度大约每两年翻一番，几十年来一直指导着技术创新。"),
            es = LocalizedContent("¿Qué es la ley de Moore?", listOf("El número de transistores se duplica cada ~2 años", "La velocidad de Internet se duplica cada año", "El precio del almacenamiento se reduce a la mitad", "La RAM se duplica cada 5 años"), "Tecnología", "Enunciada en 1965 por Gordon Moore, cofundador de Intel, esta observación predecía que la densidad de transistores en un chip se duplicaría aproximadamente cada dos años, guiando la innovación tecnológica durante décadas.")
        ),
        BilingualQuestion(
            id = 21501, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'état de la matière du plasma ?", listOf("Gaz ionisé (4ème état)", "Liquide dense", "Solide chauffé", "Gaz refroidi"), "Science", "Le plasma est un gaz dont les atomes ont été ionisés, perdant ou gagnant des électrons, ce qui le rend conducteur d'électricité et sensible aux champs magnétiques."),
            en = LocalizedContent("What is the state of matter of plasma?", listOf("Ionized gas (4th state)", "Dense liquid", "Heated solid", "Cooled gas"), "Science", "Plasma is a gas whose atoms have been ionized, losing or gaining electrons, making it electrically conductive and sensitive to magnetic fields."),
            zh = LocalizedContent("等离子体是什么物质状态？", listOf("电离气体（第四态）", "稠密液体", "加热的固体", "冷却的气体"), "科学", "等离子体是原子被电离的气体，失去或获得电子，使其具有导电性并对磁场敏感。"),
            es = LocalizedContent("¿Cuál es el estado de la materia del plasma?", listOf("Gas ionizado (4º estado)", "Líquido denso", "Sólido calentado", "Gas enfriado"), "Ciencia", "El plasma es un gas cuyos átomos han sido ionizados, perdiendo o ganando electrones, lo que lo hace conductor de electricidad y sensible a los campos magnéticos.")
        ),
        BilingualQuestion(
            id = 21502, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'ADN ?", listOf("Acide désoxyribonucléique", "Acide dinitrique", "Amine dérivée naturelle", "Agent de neutralisation"), "Science", "L'ADN est l'abréviation d'acide désoxyribonucléique, la molécule qui porte l'information génétique dans toutes les cellules vivantes."),
            en = LocalizedContent("What is DNA?", listOf("Deoxyribonucleic acid", "Dinitric acid", "Natural derived amine", "Neutralizing agent"), "Science", "DNA stands for deoxyribonucleic acid, the molecule that carries genetic information in all living cells."),
            zh = LocalizedContent("DNA 是什么？", listOf("脱氧核糖核酸", "二硝酸", "天然衍生胺", "中和剂"), "科学", "DNA 是脱氧核糖核酸的缩写，是携带所有活细胞遗传信息的分子。"),
            es = LocalizedContent("¿Qué es el ADN?", listOf("Ácido desoxirribonucleico", "Ácido dinitrico", "Amina derivada natural", "Agente neutralizante"), "Ciencia", "ADN significa ácido desoxirribonucleico, la molécula que porta la información genética en todas las células vivas.")
        ),
        BilingualQuestion(
            id = 21503, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le métal le plus conducteur d'électricité ?", listOf("L'argent", "Le cuivre", "L'or", "L'aluminium"), "Science", "L'argent possède la plus haute conductivité électrique de tous les métaux à température ambiante, grâce à sa structure atomique qui permet une circulation très libre des électrons."),
            en = LocalizedContent("Which metal is the best conductor of electricity?", listOf("Silver", "Copper", "Gold", "Aluminum"), "Science", "Silver has the highest electrical conductivity of all metals at room temperature, due to its atomic structure allowing very free electron movement."),
            zh = LocalizedContent("哪种金属导电性最好？", listOf("银", "铜", "金", "铝"), "科学", "银在室温下具有所有金属中最高的导电性，这归因于其原子结构允许电子非常自由地移动。"),
            es = LocalizedContent("¿Cuál es el metal más conductor de electricidad?", listOf("La plata", "El cobre", "El oro", "El aluminio"), "Ciencia", "La plata posee la mayor conductividad eléctrica de todos los metales a temperatura ambiente, gracias a su estructura atómica que permite una circulación muy libre de los electrones.")
        ),
        BilingualQuestion(
            id = 21505, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la couche protectrice de l'atmosphère contre les UV ?", listOf("La couche d'ozone", "La troposphère", "La mésosphère", "La thermosphère"), "Science", "La couche d'ozone, située dans la stratosphère, absorbe la majeure partie des rayons ultraviolets (UV) nocifs du Soleil."),
            en = LocalizedContent("What is the protective layer of the atmosphere against UV?", listOf("The ozone layer", "The troposphere", "The mesosphere", "The thermosphere"), "Science", "The ozone layer, located in the stratosphere, absorbs most of the harmful ultraviolet (UV) rays from the Sun."),
            zh = LocalizedContent("大气中保护我们免受紫外线伤害的层是什么？", listOf("臭氧层", "对流层", "中间层", "热层"), "科学", "臭氧层位于平流层，吸收了太阳发出的大部分有害紫外线（UV）辐射。"),
            es = LocalizedContent("¿Cuál es la capa protectora de la atmósfera contra los rayos UV?", listOf("La capa de ozono", "La troposfera", "La mesosfera", "La termosfera"), "Ciencia", "La capa de ozono, situada en la estratosfera, absorbe la mayor parte de los rayos ultravioleta (UV) nocivos del Sol.")
        ),
        BilingualQuestion(
            id = 21506, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre d'Avogadro ?", listOf("6,022 × 10²³", "3,14159", "2,718", "9,81"), "Science", "Ce nombre correspond au nombre d'entités élémentaires (atomes, molécules, ions) contenues dans une mole d'une substance, une constante fondamentale en chimie."),
            en = LocalizedContent("What is Avogadro's number?", listOf("6.022 × 10²³", "3.14159", "2.718", "9.81"), "Science", "This number corresponds to the number of elementary entities (atoms, molecules, ions) contained in one mole of a substance, a fundamental constant in chemistry."),
            zh = LocalizedContent("阿伏伽德罗常数是多少？", listOf("6.022 × 10²³", "3.14159", "2.718", "9.81"), "科学", "这个数字对应一摩尔物质中所含的基本实体（原子、分子、离子）的数量，是化学中的一个基本常数。"),
            es = LocalizedContent("¿Cuál es el número de Avogadro?", listOf("6,022 × 10²³", "3,14159", "2,718", "9,81"), "Ciencia", "Este número corresponde a la cantidad de entidades elementales (átomos, moléculas, iones) contenidas en un mol de una sustancia, una constante fundamental en química.")
        ),
        BilingualQuestion(
            id = 21508, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel organe filtre le sang ?", listOf("Les reins", "Le foie", "Le cœur", "Les poumons"), "Science", "Les reins filtrent les déchets et l'excès d'eau du sang pour produire l'urine, jouant un rôle clé dans l'équilibre hydrique et l'élimination des toxines."),
            en = LocalizedContent("Which organ filters blood?", listOf("The kidneys", "The liver", "The heart", "The lungs"), "Science", "The kidneys filter waste and excess water from the blood to produce urine, playing a key role in fluid balance and toxin elimination."),
            zh = LocalizedContent("哪个器官过滤血液？", listOf("肾脏", "肝脏", "心脏", "肺"), "科学", "肾脏从血液中过滤废物和多余水分以产生尿液，在体液平衡和毒素清除中起关键作用。"),
            es = LocalizedContent("¿Qué órgano filtra la sangre?", listOf("Los riñones", "El hígado", "El corazón", "Los pulmones"), "Ciencia", "Los riñones filtran los desechos y el exceso de agua de la sangre para producir orina, desempeñando un papel clave en el equilibrio hídrico y la eliminación de toxinas.")
        ),
        BilingualQuestion(
            id = 21509, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la théorie des cordes ?", listOf("Les particules fondamentales sont des cordes vibrantes", "Les planètes sont reliées par des cordes gravitationnelles", "La lumière est composée de filaments", "Les atomes sont liés par des fils"), "Science", "La théorie des cordes postule que les particules élémentaires ne sont pas des points, mais des cordes unidimensionnelles dont les modes de vibration déterminent leurs propriétés."),
            en = LocalizedContent("What is string theory?", listOf("Fundamental particles are vibrating strings", "Planets are connected by gravitational strings", "Light is composed of filaments", "Atoms are linked by threads"), "Science", "String theory postulates that elementary particles are not points but one-dimensional strings whose vibration modes determine their properties."),
            zh = LocalizedContent("什么是弦理论？", listOf("基本粒子是振动的弦", "行星由引力弦连接", "光由细丝组成", "原子由线连接"), "科学", "弦理论假设基本粒子不是点，而是一维弦，其振动模式决定了它们的性质。"),
            es = LocalizedContent("¿Qué es la teoría de cuerdas?", listOf("Las partículas fundamentales son cuerdas vibrantes", "Los planetas están conectados por cuerdas gravitacionales", "La luz está compuesta de filamentos", "Los átomos están unidos por hilos"), "Ciencia", "La teoría de cuerdas postula que las partículas elementales no son puntos, sino cuerdas unidimensionales cuyos modos de vibración determinan sus propiedades.")
        ),
        BilingualQuestion(
            id = 21510, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le gaz noble le plus léger ?", listOf("L'hélium", "Le néon", "L'argon", "Le krypton"), "Science", "L'hélium est le gaz noble le plus léger car il possède la plus faible masse atomique parmi les gaz rares, avec seulement deux protons et deux neutrons dans son noyau."),
            en = LocalizedContent("What is the lightest noble gas?", listOf("Helium", "Neon", "Argon", "Krypton"), "Science", "Helium is the lightest noble gas because it has the lowest atomic mass among the noble gases, with only two protons and two neutrons in its nucleus."),
            zh = LocalizedContent("最轻的稀有气体是什么？", listOf("氦", "氖", "氩", "氪"), "科学", "氦是最轻的稀有气体，因为它在稀有气体中原子质量最小，原子核中只有两个质子和两个中子。"),
            es = LocalizedContent("¿Cuál es el gas noble más ligero?", listOf("Helio", "Neón", "Argón", "Kriptón"), "Ciencia", "El helio es el gas noble más ligero porque tiene la masa atómica más baja entre los gases nobles, con solo dos protones y dos neutrones en su núcleo.")
        ),
        BilingualQuestion(
            id = 21511, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de paires de bases composent le génome humain ?", listOf("3 milliards", "1 million", "10 milliards", "100 millions"), "Science", "Le génome humain est constitué d'environ 3 milliards de paires de bases d'ADN, réparties sur 23 paires de chromosomes."),
            en = LocalizedContent("How many base pairs make up the human genome?", listOf("3 billion", "1 million", "10 billion", "100 million"), "Science", "The human genome consists of about 3 billion base pairs of DNA, distributed across 23 pairs of chromosomes."),
            zh = LocalizedContent("人类基因组由多少碱基对组成？", listOf("30亿", "100万", "100亿", "1亿"), "科学", "人类基因组由约30亿个DNA碱基对组成，分布在23对染色体上。"),
            es = LocalizedContent("¿Cuántos pares de bases componen el genoma humano?", listOf("3 mil millones", "1 millón", "10 mil millones", "100 millones"), "Ciencia", "El genoma humano consta de aproximadamente 3 mil millones de pares de bases de ADN, distribuidos en 23 pares de cromosomas.")
        ),
        BilingualQuestion(
            id = 21513, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel élément chimique a pour symbole 'Na' ?", listOf("Le sodium", "L'azote", "Le nickel", "Le néon"), "Science", "Le symbole Na vient du latin *natrium*. Le sodium est un métal alcalin très réactif, notamment avec l'eau."),
            en = LocalizedContent("Which chemical element has the symbol 'Na'?", listOf("Sodium", "Nitrogen", "Nickel", "Neon"), "Science", "The symbol Na comes from Latin *natrium*. Sodium is a highly reactive alkali metal, especially with water."),
            zh = LocalizedContent("哪种化学元素的符号是'Na'？", listOf("钠", "氮", "镍", "氖"), "科学", "符号Na来自拉丁语*natrium*。钠是一种非常活泼的碱金属，尤其与水反应剧烈。"),
            es = LocalizedContent("¿Qué elemento químico tiene el símbolo 'Na'?", listOf("Sodio", "Nitrógeno", "Níquel", "Neón"), "Ciencia", "El símbolo Na proviene del latín *natrium*. El sodio es un metal alcalino muy reactivo, especialmente con el agua.")
        ),
        BilingualQuestion(
            id = 21514, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la supraconductivité ?", listOf("Résistance électrique nulle à très basse température", "Conductivité très élevée", "Un type d'aimant", "La vitesse maximale d'un courant"), "Science", "Découverte en 1911 par Heike Kamerlingh Onnes, la supraconductivité se produit dans certains matériaux refroidis sous une température critique, où les électrons se déplacent sans perte d'énergie."),
            en = LocalizedContent("What is superconductivity?", listOf("Zero electrical resistance at very low temperature", "Very high conductivity", "A type of magnet", "The maximum speed of a current"), "Science", "Discovered in 1911 by Heike Kamerlingh Onnes, superconductivity occurs in certain materials cooled below a critical temperature, where electrons move without energy loss."),
            zh = LocalizedContent("什么是超导性？", listOf("极低温下电阻为零", "非常高的导电性", "一种磁铁", "电流的最大速度"), "科学", "超导性由海克·卡末林·昂内斯于1911年发现，发生在某些材料冷却到临界温度以下时，电子无能量损失地移动。"),
            es = LocalizedContent("¿Qué es la superconductividad?", listOf("Resistencia eléctrica nula a muy baja temperatura", "Conductividad muy alta", "Un tipo de imán", "La velocidad máxima de una corriente"), "Ciencia", "Descubierta en 1911 por Heike Kamerlingh Onnes, la superconductividad ocurre en ciertos materiales enfriados por debajo de una temperatura crítica, donde los electrones se mueven sin pérdida de energía.")
        ),
        BilingualQuestion(
            id = 21517, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel virus cause le SIDA ?", listOf("Le VIH", "Le VHC", "Le VPH", "Le VRS"), "Science", "Le VIH (virus de l'immunodéficience humaine) attaque le système immunitaire, et sans traitement, il peut évoluer vers le SIDA (syndrome d'immunodéficience acquise)."),
            en = LocalizedContent("Which virus causes AIDS?", listOf("HIV", "HCV", "HPV", "RSV"), "Science", "HIV (human immunodeficiency virus) attacks the immune system, and without treatment, it can progress to AIDS (acquired immunodeficiency syndrome)."),
            zh = LocalizedContent("哪种病毒导致艾滋病？", listOf("HIV", "HCV", "HPV", "RSV"), "科学", "HIV（人类免疫缺陷病毒）攻击免疫系统，如果不治疗，可能发展为艾滋病（获得性免疫缺陷综合征）。"),
            es = LocalizedContent("¿Qué virus causa el SIDA?", listOf("VIH", "VHC", "VPH", "VRS"), "Ciencia", "El VIH (virus de la inmunodeficiencia humana) ataca el sistema inmunitario y, sin tratamiento, puede evolucionar hacia el SIDA (síndrome de inmunodeficiencia adquirida).")
        ),
        BilingualQuestion(
            id = 21518, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps la lumière du Soleil met-elle pour atteindre la Terre ?", listOf("~8 minutes", "~1 seconde", "~30 minutes", "~1 heure"), "Science", "La lumière du Soleil parcourt environ 150 millions de kilomètres à la vitesse de 300 000 km/s, ce qui prend environ 8 minutes et 20 secondes pour atteindre la Terre."),
            en = LocalizedContent("How long does it take for sunlight to reach Earth?", listOf("~8 minutes", "~1 second", "~30 minutes", "~1 hour"), "Science", "Sunlight travels about 150 million kilometers at a speed of 300,000 km/s, taking approximately 8 minutes and 20 seconds to reach Earth."),
            zh = LocalizedContent("太阳光到达地球需要多长时间？", listOf("约8分钟", "约1秒", "约30分钟", "约1小时"), "科学", "太阳光以30万公里/秒的速度传播约1.5亿公里，大约需要8分20秒到达地球。"),
            es = LocalizedContent("¿Cuánto tarda la luz del Sol en llegar a la Tierra?", listOf("~8 minutos", "~1 segundo", "~30 minutos", "~1 hora"), "Ciencia", "La luz del Sol recorre unos 150 millones de kilómetros a una velocidad de 300.000 km/s, lo que toma aproximadamente 8 minutos y 20 segundos para llegar a la Tierra.")
        ),
        BilingualQuestion(
            id = 21519, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que CRISPR-Cas9 ?", listOf("Un outil d'édition génétique", "Un télescope spatial", "Un accélérateur de particules", "Un médicament anticancer"), "Science", "CRISPR-Cas9 est une technologie dérivée d’un système de défense bactérien, permettant de modifier précisément l’ADN d’organismes vivants."),
            en = LocalizedContent("What is CRISPR-Cas9?", listOf("A gene editing tool", "A space telescope", "A particle accelerator", "An anticancer drug"), "Science", "CRISPR-Cas9 is a technology derived from a bacterial defense system, enabling precise modification of DNA in living organisms."),
            zh = LocalizedContent("什么是CRISPR-Cas9？", listOf("一种基因编辑工具", "一种太空望远镜", "一种粒子加速器", "一种抗癌药物"), "科学", "CRISPR-Cas9是一种源自细菌防御系统的技术，能够精确修改生物体的DNA。"),
            es = LocalizedContent("¿Qué es CRISPR-Cas9?", listOf("Una herramienta de edición genética", "Un telescopio espacial", "Un acelerador de partículas", "Un medicamento anticancerígeno"), "Ciencia", "CRISPR-Cas9 es una tecnología derivada de un sistema de defensa bacteriano, que permite modificar con precisión el ADN de organismos vivos.")
        ),
        BilingualQuestion(
            id = 21520, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point de congélation de l'eau en Kelvin ?", listOf("273,15 K", "0 K", "100 K", "373 K"), "Science", "L'eau pure gèle à 0°C, ce qui correspond à 273,15 Kelvin, car le zéro absolu (0 K) est à -273,15°C."),
            en = LocalizedContent("What is the freezing point of water in Kelvin?", listOf("273.15 K", "0 K", "100 K", "373 K"), "Science", "Pure water freezes at 0°C, which corresponds to 273.15 Kelvin, since absolute zero (0 K) is -273.15°C."),
            zh = LocalizedContent("水的冰点是多少开尔文？", listOf("273.15 K", "0 K", "100 K", "373 K"), "科学", "纯水在0°C结冰，对应273.15开尔文，因为绝对零度（0 K）是-273.15°C。"),
            es = LocalizedContent("¿Cuál es el punto de congelación del agua en Kelvin?", listOf("273,15 K", "0 K", "100 K", "373 K"), "Ciencia", "El agua pura se congela a 0°C, lo que corresponde a 273,15 Kelvin, ya que el cero absoluto (0 K) es -273,15°C.")
        ),
        BilingualQuestion(
            id = 21521, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un neutron star (étoile à neutrons) ?", listOf("Le résidu ultra-dense d'une supernova", "Une étoile sans charge", "Un type de trou noir", "Une planète gazeuse"), "Science", "Lorsqu'une étoile massive explose en supernova, son noyau s'effondre sous l'effet de la gravité, formant un objet extrêmement dense composé presque uniquement de neutrons."),
            en = LocalizedContent("What is a neutron star?", listOf("The ultra-dense remnant of a supernova", "A star without charge", "A type of black hole", "A gas planet"), "Science", "When a massive star explodes in a supernova, its core collapses under gravity, forming an extremely dense object composed almost entirely of neutrons."),
            zh = LocalizedContent("什么是中子星？", listOf("超新星爆炸后的超高密度残骸", "一种不带电的恒星", "一种黑洞", "一颗气态行星"), "科学", "当大质量恒星以超新星形式爆炸时，其核心在引力作用下坍缩，形成一个几乎完全由中子组成的极其致密的天体。"),
            es = LocalizedContent("¿Qué es una estrella de neutrones?", listOf("El remanente ultradenso de una supernova", "Una estrella sin carga", "Un tipo de agujero negro", "Un planeta gaseoso"), "Ciencia", "Cuando una estrella masiva explota en una supernova, su núcleo colapsa bajo la gravedad, formando un objeto extremadamente denso compuesto casi exclusivamente de neutrones.")
        ),
        BilingualQuestion(
            id = 21523, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la photosynthèse produit ?", listOf("Du glucose et de l'oxygène", "Du CO2 et de l'eau", "De l'azote", "Du méthane"), "Science", "La photosynthèse utilise l'énergie solaire pour convertir le dioxyde de carbone et l'eau en glucose (source d'énergie pour la plante) et en oxygène, libéré dans l'atmosphère."),
            en = LocalizedContent("What does photosynthesis produce?", listOf("Glucose and oxygen", "CO2 and water", "Nitrogen", "Methane"), "Science", "Photosynthesis uses solar energy to convert carbon dioxide and water into glucose (energy source for the plant) and oxygen, released into the atmosphere."),
            zh = LocalizedContent("光合作用产生什么？", listOf("葡萄糖和氧气", "二氧化碳和水", "氮气", "甲烷"), "科学", "光合作用利用太阳能将二氧化碳和水转化为葡萄糖（植物的能量来源）和氧气，并释放到大气中。"),
            es = LocalizedContent("¿Qué produce la fotosíntesis?", listOf("Glucosa y oxígeno", "CO2 y agua", "Nitrógeno", "Metano"), "Ciencia", "La fotosíntesis utiliza la energía solar para convertir dióxido de carbono y agua en glucosa (fuente de energía para la planta) y oxígeno, liberado a la atmósfera.")
        ),
        BilingualQuestion(
            id = 21524, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert la radioactivité ?", listOf("Henri Becquerel", "Marie Curie", "Ernest Rutherford", "Wilhelm Röntgen"), "Science", "Henri Becquerel a découvert la radioactivité en 1896 par hasard, en observant que des sels d'uranium impressionnaient des plaques photographiques sans exposition à la lumière."),
            en = LocalizedContent("Which scientist discovered radioactivity?", listOf("Henri Becquerel", "Marie Curie", "Ernest Rutherford", "Wilhelm Röntgen"), "Science", "Henri Becquerel discovered radioactivity in 1896 by chance, observing that uranium salts exposed photographic plates without exposure to light."),
            zh = LocalizedContent("哪位科学家发现了放射性？", listOf("亨利·贝克勒尔", "玛丽·居里", "欧内斯特·卢瑟福", "威廉·伦琴"), "科学", "亨利·贝克勒尔于1896年偶然发现放射性，他观察到铀盐在未暴露于光线的情况下使照相底片感光。"),
            es = LocalizedContent("¿Qué científico descubrió la radiactividad?", listOf("Henri Becquerel", "Marie Curie", "Ernest Rutherford", "Wilhelm Röntgen"), "Ciencia", "Henri Becquerel descubrió la radiactividad en 1896 por casualidad, al observar que las sales de uranio impresionaban placas fotográficas sin exposición a la luz.")
        ),
        BilingualQuestion(
            id = 21525, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'états de la matière existe-t-il principalement ?", listOf("4 (solide, liquide, gaz, plasma)", "3", "5", "2"), "Science", "Les quatre états principaux de la matière sont le solide, le liquide, le gaz et le plasma, ce dernier étant un gaz ionisé présent notamment dans les étoiles."),
            en = LocalizedContent("How many states of matter are there primarily?", listOf("4 (solid, liquid, gas, plasma)", "3", "5", "2"), "Science", "The four primary states of matter are solid, liquid, gas, and plasma, the latter being an ionized gas found in stars, among other places."),
            zh = LocalizedContent("物质主要有几种状态？", listOf("4种（固态、液态、气态、等离子态）", "3种", "5种", "2种"), "科学", "物质的四种主要状态是固态、液态、气态和等离子态，等离子态是一种电离气体，存在于恒星等地方。"),
            es = LocalizedContent("¿Cuántos estados de la materia existen principalmente?", listOf("4 (sólido, líquido, gas, plasma)", "3", "5", "2"), "Ciencia", "Los cuatro estados principales de la materia son sólido, líquido, gas y plasma, siendo este último un gas ionizado presente, entre otros, en las estrellas.")
        ),
        BilingualQuestion(
            id = 21601, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a débuté la Première Guerre mondiale ?", listOf("1914", "1912", "1916", "1918"), "Histoire", "La Première Guerre mondiale a débuté en 1914 après l'assassinat de l'archiduc François-Ferdinand d'Autriche en juin, suivi d'une série de déclarations de guerre en août."),
            en = LocalizedContent("In which year did World War I begin?", listOf("1914", "1912", "1916", "1918"), "History", "World War I began in 1914 after the assassination of Archduke Franz Ferdinand of Austria in June, followed by a series of declarations of war in August."),
            zh = LocalizedContent("第一次世界大战在哪一年开始？", listOf("1914年", "1912年", "1916年", "1918年"), "历史", "第一次世界大战于1914年开始，此前奥匈帝国大公弗朗茨·斐迪南于6月遇刺，随后在8月发生一系列宣战。"),
            es = LocalizedContent("¿En qué año comenzó la Primera Guerra Mundial?", listOf("1914", "1912", "1916", "1918"), "Historia", "La Primera Guerra Mundial comenzó en 1914 tras el asesinato del archiduque Francisco Fernando de Austria en junio, seguido de una serie de declaraciones de guerra en agosto.")
        ),
        BilingualQuestion(
            id = 21604, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'esclavage a-t-il été aboli en France ?", listOf("1848", "1794", "1833", "1865"), "Histoire", "L'abolition définitive de l'esclavage en France a été proclamée le 27 avril 1848, sous l'impulsion du gouvernement provisoire de la Deuxième République, notamment grâce à l'action de Victor Schœlcher."),
            en = LocalizedContent("In which year was slavery abolished in France?", listOf("1848", "1794", "1833", "1865"), "History", "The definitive abolition of slavery in France was proclaimed on April 27, 1848, under the impetus of the provisional government of the Second Republic, notably thanks to the action of Victor Schœlcher."),
            zh = LocalizedContent("法国在哪一年废除了奴隶制？", listOf("1848年", "1794年", "1833年", "1865年"), "历史", "法国于1848年4月27日宣布最终废除奴隶制，在第二共和国临时政府的推动下，特别是维克多·舍尔歇的努力。"),
            es = LocalizedContent("¿En qué año se abolió la esclavitud en Francia?", listOf("1848", "1794", "1833", "1865"), "Historia", "La abolición definitiva de la esclavitud en Francia fue proclamada el 27 de abril de 1848, bajo el impulso del gobierno provisional de la Segunda República, gracias especialmente a la acción de Victor Schœlcher.")
        ),
        BilingualQuestion(
            id = 21606, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire a construit le Colisée de Rome ?", listOf("L'Empire romain", "L'Empire grec", "L'Empire perse", "L'Empire byzantin"), "Histoire", "Le Colisée de Rome a été construit sous l'Empire romain, entre 70 et 80 après J.-C., par les empereurs Vespasien et Titus de la dynastie flavienne."),
            en = LocalizedContent("Which empire built the Colosseum in Rome?", listOf("The Roman Empire", "The Greek Empire", "The Persian Empire", "The Byzantine Empire"), "History", "The Colosseum in Rome was built under the Roman Empire, between 70 and 80 AD, by the emperors Vespasian and Titus of the Flavian dynasty."),
            zh = LocalizedContent("哪个帝国建造了罗马斗兽场？", listOf("罗马帝国", "希腊帝国", "波斯帝国", "拜占庭帝国"), "历史", "罗马斗兽场建于罗马帝国时期，公元70年至80年间，由弗拉维王朝的皇帝韦斯巴芗和提图斯建造。"),
            es = LocalizedContent("¿Qué imperio construyó el Coliseo de Roma?", listOf("El Imperio romano", "El Imperio griego", "El Imperio persa", "El Imperio bizantino"), "Historia", "El Coliseo de Roma fue construido bajo el Imperio romano, entre los años 70 y 80 d.C., por los emperadores Vespasiano y Tito de la dinastía Flavia.")
        ),
        BilingualQuestion(
            id = 21607, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a eu lieu le débarquement en Normandie ?", listOf("1944", "1943", "1945", "1942"), "Histoire", "Le débarquement en Normandie, nom de code opération Overlord, a eu lieu le 6 juin 1944, marquant le début de la libération de l'Europe occidentale occupée par l'Allemagne nazie pendant la Seconde Guerre mondiale."),
            en = LocalizedContent("In which year did the Normandy landings take place?", listOf("1944", "1943", "1945", "1942"), "History", "The Normandy landings, code-named Operation Overlord, took place on June 6, 1944, marking the beginning of the liberation of Western Europe occupied by Nazi Germany during World War II."),
            zh = LocalizedContent("诺曼底登陆发生在哪一年？", listOf("1944年", "1943年", "1945年", "1942年"), "历史", "诺曼底登陆，代号霸王行动，于1944年6月6日进行，标志着二战期间被纳粹德国占领的西欧解放的开始。"),
            es = LocalizedContent("¿En qué año tuvo lugar el desembarco de Normandía?", listOf("1944", "1943", "1945", "1942"), "Historia", "El desembarco de Normandía, nombre en clave Operación Overlord, tuvo lugar el 6 de junio de 1944, marcando el inicio de la liberación de Europa Occidental ocupada por la Alemania nazi durante la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 21608, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint le plafond de la chapelle Sixtine ?", listOf("Michel-Ange", "Raphaël", "Léonard de Vinci", "Botticelli"), "Histoire", "Michel-Ange a peint le plafond de la chapelle Sixtine entre 1508 et 1512, sur commande du pape Jules II."),
            en = LocalizedContent("Who painted the ceiling of the Sistine Chapel?", listOf("Michelangelo", "Raphael", "Leonardo da Vinci", "Botticelli"), "History", "Michelangelo painted the ceiling of the Sistine Chapel between 1508 and 1512, commissioned by Pope Julius II."),
            zh = LocalizedContent("谁绘制了西斯廷教堂的天顶画？", listOf("米开朗基罗", "拉斐尔", "列奥纳多·达·芬奇", "波提切利"), "历史", "米开朗基罗在1508年至1512年间绘制了西斯廷教堂的天顶画，受教皇尤利乌斯二世委托。"),
            es = LocalizedContent("¿Quién pintó el techo de la Capilla Sixtina?", listOf("Miguel Ángel", "Rafael", "Leonardo da Vinci", "Botticelli"), "Historia", "Miguel Ángel pintó el techo de la Capilla Sixtina entre 1508 y 1512, por encargo del papa Julio II.")
        ),
        BilingualQuestion(
            id = 21609, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle dynastie a régné le plus longtemps en France ?", listOf("Les Capétiens", "Les Bourbons", "Les Valois", "Les Mérovingiens"), "Histoire", "Les Capétiens ont régné sans interruption de 987 à 1792, puis de 1814 à 1830, soit plus de 800 ans, ce qui en fait la plus longue dynastie de France."),
            en = LocalizedContent("Which dynasty reigned the longest in France?", listOf("The Capetians", "The Bourbons", "The Valois", "The Merovingians"), "History", "The Capetians reigned without interruption from 987 to 1792, then from 1814 to 1830, totaling over 800 years, making them the longest dynasty in France."),
            zh = LocalizedContent("哪个王朝在法国统治时间最长？", listOf("卡佩王朝", "波旁王朝", "瓦卢瓦王朝", "墨洛温王朝"), "历史", "卡佩王朝从987年到1792年不间断统治，然后从1814年到1830年，总计超过800年，是法国最长的王朝。"),
            es = LocalizedContent("¿Qué dinastía reinó más tiempo en Francia?", listOf("Los Capetos", "Los Borbones", "Los Valois", "Los Merovingios"), "Historia", "Los Capetos reinaron sin interrupción desde 987 hasta 1792, y luego desde 1814 hasta 1830, sumando más de 800 años, lo que los convierte en la dinastía más larga de Francia.")
        ),
        BilingualQuestion(
            id = 21610, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'homme a-t-il marché sur la Lune ?", listOf("1969", "1967", "1971", "1965"), "Histoire", "La mission Apollo 11 de la NASA a permis aux astronautes Neil Armstrong et Buzz Aldrin de poser le pied sur la Lune le 20 juillet 1969."),
            en = LocalizedContent("In which year did man walk on the Moon?", listOf("1969", "1967", "1971", "1965"), "History", "NASA's Apollo 11 mission allowed astronauts Neil Armstrong and Buzz Aldrin to set foot on the Moon on July 20, 1969."),
            zh = LocalizedContent("人类在哪一年登上了月球？", listOf("1969年", "1967年", "1971年", "1965年"), "历史", "美国国家航空航天局的阿波罗11号任务使宇航员尼尔·阿姆斯特朗和巴兹·奥尔德林于1969年7月20日踏上月球。"),
            es = LocalizedContent("¿En qué año el hombre caminó sobre la Luna?", listOf("1969", "1967", "1971", "1965"), "Historia", "La misión Apolo 11 de la NASA permitió a los astronautas Neil Armstrong y Buzz Aldrin pisar la Luna el 20 de julio de 1969.")
        ),
        BilingualQuestion(
            id = 21611, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle route commerciale reliait l'Europe à l'Asie ?", listOf("La Route de la Soie", "La Route des Épices", "La Route du Thé", "La Route de l'Or"), "Histoire", "La Route de la Soie était un réseau de routes terrestres et maritimes reliant la Chine à la Méditerranée, permettant les échanges de soie, d'épices et d'autres marchandises entre l'Europe et l'Asie."),
            en = LocalizedContent("Which trade route connected Europe to Asia?", listOf("The Silk Road", "The Spice Route", "The Tea Route", "The Gold Route"), "History", "The Silk Road was a network of land and sea routes linking China to the Mediterranean, enabling the exchange of silk, spices, and other goods between Europe and Asia."),
            zh = LocalizedContent("哪条贸易路线连接了欧洲和亚洲？", listOf("丝绸之路", "香料之路", "茶叶之路", "黄金之路"), "历史", "丝绸之路是一个连接中国和地中海的陆路和海路网络，促进了欧洲和亚洲之间丝绸、香料等商品的交流。"),
            es = LocalizedContent("¿Qué ruta comercial conectaba Europa con Asia?", listOf("La Ruta de la Seda", "La Ruta de las Especias", "La Ruta del Té", "La Ruta del Oro"), "Historia", "La Ruta de la Seda era una red de rutas terrestres y marítimas que unían China con el Mediterráneo, permitiendo el intercambio de seda, especias y otros productos entre Europa y Asia.")
        ),
        BilingualQuestion(
            id = 21614, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'URSS s'est-elle effondrée ?", listOf("1991", "1989", "1993", "1985"), "Histoire", "L'URSS s'est officiellement dissoute le 26 décembre 1991, suite à la démission de Mikhaïl Gorbatchev et à la déclaration d'indépendance de plusieurs républiques."),
            en = LocalizedContent("In which year did the USSR collapse?", listOf("1991", "1989", "1993", "1985"), "History", "The USSR officially dissolved on December 26, 1991, following the resignation of Mikhail Gorbachev and the declaration of independence by several republics."),
            zh = LocalizedContent("苏联在哪一年解体？", listOf("1991年", "1989年", "1993年", "1985年"), "历史", "苏联于1991年12月26日正式解体，此前米哈伊尔·戈尔巴乔夫辞职，多个共和国宣布独立。"),
            es = LocalizedContent("¿En qué año colapsó la URSS?", listOf("1991", "1989", "1993", "1985"), "Historia", "La URSS se disolvió oficialmente el 26 de diciembre de 1991, tras la dimisión de Mijaíl Gorbachov y la declaración de independencia de varias repúblicas.")
        ),
        BilingualQuestion(
            id = 21615, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle invention Gutenberg a-t-il révolutionné ?", listOf("L'imprimerie à caractères mobiles", "La machine à écrire", "Le télégraphe", "Le papier"), "Histoire", "Gutenberg a perfectionné l'imprimerie en Europe en mettant au point des caractères mobiles en métal, permettant une reproduction rapide et économique des textes."),
            en = LocalizedContent("Which invention did Gutenberg revolutionize?", listOf("The printing press with movable type", "The typewriter", "The telegraph", "Paper"), "History", "Gutenberg perfected printing in Europe by developing movable metal type, enabling fast and economical reproduction of texts."),
            zh = LocalizedContent("古腾堡革新了哪项发明？", listOf("活字印刷术", "打字机", "电报", "纸张"), "历史", "古腾堡在欧洲完善了印刷术，发明了金属活字，实现了文本的快速和经济复制。"),
            es = LocalizedContent("¿Qué invención revolucionó Gutenberg?", listOf("La imprenta de tipos móviles", "La máquina de escribir", "El telégrafo", "El papel"), "Historia", "Gutenberg perfeccionó la imprenta en Europa al desarrollar tipos móviles de metal, permitiendo la reproducción rápida y económica de textos.")
        ),
        BilingualQuestion(
            id = 21616, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pharaon a régné le plus longtemps en Égypte ?", listOf("Ramsès II (66 ans)", "Khéops", "Toutankhamon", "Cléopâtre"), "Histoire", "Ramsès II a régné environ 66 ans, de 1279 à 1213 av. J.-C., ce qui en fait le pharaon au règne le plus long de l'histoire égyptienne."),
            en = LocalizedContent("Which pharaoh reigned the longest in Egypt?", listOf("Ramesses II (66 years)", "Khufu", "Tutankhamun", "Cleopatra"), "History", "Ramesses II reigned for about 66 years, from 1279 to 1213 BC, making him the longest-reigning pharaoh in Egyptian history."),
            zh = LocalizedContent("哪位法老在埃及统治时间最长？", listOf("拉美西斯二世（66年）", "胡夫", "图坦卡蒙", "克利奥帕特拉"), "历史", "拉美西斯二世在位约66年，从公元前1279年到公元前1213年，是埃及历史上在位时间最长的法老。"),
            es = LocalizedContent("¿Qué faraón reinó más tiempo en Egipto?", listOf("Ramsés II (66 años)", "Keops", "Tutankamón", "Cleopatra"), "Historia", "Ramsés II reinó aproximadamente 66 años, desde 1279 hasta 1213 a.C., lo que lo convierte en el faraón con el reinado más largo de la historia egipcia.")
        ),
        BilingualQuestion(
            id = 21619, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a été le dernier tsar de Russie ?", listOf("Nicolas II", "Alexandre III", "Pierre le Grand", "Ivan le Terrible"), "Histoire", "Nicolas II a été le dernier empereur de Russie, régnant de 1894 jusqu'à son abdication forcée en 1917 pendant la Révolution de Février."),
            en = LocalizedContent("Who was the last Tsar of Russia?", listOf("Nicholas II", "Alexander III", "Peter the Great", "Ivan the Terrible"), "History", "Nicholas II was the last Emperor of Russia, reigning from 1894 until his forced abdication in 1917 during the February Revolution."),
            zh = LocalizedContent("谁是俄罗斯的最后一位沙皇？", listOf("尼古拉二世", "亚历山大三世", "彼得大帝", "伊凡雷帝"), "历史", "尼古拉二世是俄罗斯的最后一位皇帝，从1894年在位，直到1917年二月革命期间被迫退位。"),
            es = LocalizedContent("¿Quién fue el último zar de Rusia?", listOf("Nicolás II", "Alejandro III", "Pedro el Grande", "Iván el Terrible"), "Historia", "Nicolás II fue el último emperador de Rusia, reinando desde 1894 hasta su abdicación forzada en 1917 durante la Revolución de Febrero.")
        ),
        BilingualQuestion(
            id = 21620, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la bombe atomique a-t-elle été larguée sur Hiroshima ?", listOf("1945", "1944", "1943", "1946"), "Histoire", "Les États-Unis ont largué la bombe atomique sur Hiroshima le 6 août 1945, pendant la Seconde Guerre mondiale, précipitant la capitulation du Japon."),
            en = LocalizedContent("In which year was the atomic bomb dropped on Hiroshima?", listOf("1945", "1944", "1943", "1946"), "History", "The United States dropped the atomic bomb on Hiroshima on August 6, 1945, during World War II, hastening Japan's surrender."),
            zh = LocalizedContent("原子弹在哪一年投放在广岛？", listOf("1945年", "1944年", "1943年", "1946年"), "历史", "美国于1945年8月6日在广岛投下原子弹，当时正值第二次世界大战，加速了日本的投降。"),
            es = LocalizedContent("¿En qué año se lanzó la bomba atómica sobre Hiroshima?", listOf("1945", "1944", "1943", "1946"), "Historia", "Estados Unidos lanzó la bomba atómica sobre Hiroshima el 6 de agosto de 1945, durante la Segunda Guerra Mundial, precipitando la rendición de Japón.")
        ),
        BilingualQuestion(
            id = 21621, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peuple a construit Angkor Wat ?", listOf("Les Khmers", "Les Thaïs", "Les Birmans", "Les Vietnamiens"), "Histoire", "Angkor Wat a été construit au XIIe siècle sous le règne du roi khmer Suryavarman II, servant de temple hindou dédié à Vishnu."),
            en = LocalizedContent("Which people built Angkor Wat?", listOf("The Khmers", "The Thais", "The Burmese", "The Vietnamese"), "History", "Angkor Wat was built in the 12th century under the reign of the Khmer king Suryavarman II, serving as a Hindu temple dedicated to Vishnu."),
            zh = LocalizedContent("哪个民族建造了吴哥窟？", listOf("高棉人", "泰人", "缅甸人", "越南人"), "历史", "吴哥窟建于12世纪，由高棉国王苏利耶跋摩二世统治时期建造，是一座供奉毗湿奴的印度教寺庙。"),
            es = LocalizedContent("¿Qué pueblo construyó Angkor Wat?", listOf("Los jemeres", "Los tailandeses", "Los birmanos", "Los vietnamitas"), "Historia", "Angkor Wat fue construido en el siglo XII bajo el reinado del rey jemer Suryavarman II, sirviendo como templo hindú dedicado a Vishnú.")
        ),
        BilingualQuestion(
            id = 21622, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a unifié l'Italie au XIXe siècle ?", listOf("Giuseppe Garibaldi et Cavour", "Napoléon", "Mazzini seul", "Victor Emmanuel seul"), "Histoire", "Giuseppe Garibaldi et Camillo Cavour ont joué des rôles clés dans le Risorgimento, le mouvement d'unification italienne. Cavour, en tant que Premier ministre du Piémont-Sardaigne, a mené les efforts diplomatiques, tandis que Garibaldi a conquis le sud avec ses Chemises rouges."),
            en = LocalizedContent("Who unified Italy in the 19th century?", listOf("Giuseppe Garibaldi and Cavour", "Napoleon", "Mazzini alone", "Victor Emmanuel alone"), "History", "Giuseppe Garibaldi and Camillo Cavour played key roles in the Risorgimento, the Italian unification movement. Cavour, as Prime Minister of Piedmont-Sardinia, led diplomatic efforts, while Garibaldi conquered the south with his Redshirts."),
            zh = LocalizedContent("谁在19世纪统一了意大利？", listOf("朱塞佩·加里波第和卡米洛·加富尔", "拿破仑", "马志尼独自", "维托里奥·埃马努埃莱独自"), "历史", "朱塞佩·加里波第和卡米洛·加富尔在意大利统一运动复兴运动中发挥了关键作用。加富尔作为皮埃蒙特-撒丁王国首相领导了外交努力，而加里波第则率领红衫军征服了南部。"),
            es = LocalizedContent("¿Quién unificó Italia en el siglo XIX?", listOf("Giuseppe Garibaldi y Cavour", "Napoleón", "Mazzini solo", "Víctor Manuel solo"), "Historia", "Giuseppe Garibaldi y Camilo Cavour desempeñaron papeles clave en el Risorgimento, el movimiento de unificación italiana. Cavour, como primer ministro del Piamonte-Cerdeña, lideró los esfuerzos diplomáticos, mientras que Garibaldi conquistó el sur con sus Camisas Rojas.")
        ),
        BilingualQuestion(
            id = 21623, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle guerre a opposé le Nord et le Sud des États-Unis ?", listOf("La guerre de Sécession (1861-1865)", "La guerre d'Indépendance", "La guerre de 1812", "La guerre hispano-américaine"), "Histoire", "La guerre de Sécession a éclaté en 1861 suite à la sécession des États esclavagistes du Sud, opposés à l'abolition de l'esclavage prônée par le Nord industrialisé."),
            en = LocalizedContent("Which war pitted the North against the South in the United States?", listOf("The Civil War (1861-1865)", "The War of Independence", "The War of 1812", "The Spanish-American War"), "History", "The Civil War broke out in 1861 following the secession of the slave-holding Southern states, opposed to the abolition of slavery advocated by the industrialized North."),
            zh = LocalizedContent("哪场战争使美国北方与南方对立？", listOf("美国内战（1861-1865）", "独立战争", "1812年战争", "美西战争"), "历史", "美国内战于1861年爆发，起因是支持奴隶制的南方各州脱离联邦，反对工业化北方所倡导的废除奴隶制。"),
            es = LocalizedContent("¿Qué guerra enfrentó al Norte y al Sur de Estados Unidos?", listOf("La Guerra Civil (1861-1865)", "La Guerra de Independencia", "La Guerra de 1812", "La Guerra Hispano-Estadounidense"), "Historia", "La Guerra Civil estalló en 1861 tras la secesión de los estados esclavistas del Sur, opuestos a la abolición de la esclavitud defendida por el Norte industrializado.")
        ),
        BilingualQuestion(
            id = 21625, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Déclaration d'indépendance américaine a-t-elle été signée ?", listOf("1776", "1789", "1770", "1783"), "Histoire", "Le 4 juillet 1776, le Second Congrès continental a adopté la Déclaration d'indépendance, proclamant la séparation des treize colonies américaines de la Grande-Bretagne."),
            en = LocalizedContent("In which year was the American Declaration of Independence signed?", listOf("1776", "1789", "1770", "1783"), "History", "On July 4, 1776, the Second Continental Congress adopted the Declaration of Independence, proclaiming the separation of the thirteen American colonies from Great Britain."),
            zh = LocalizedContent("美国《独立宣言》在哪一年签署？", listOf("1776年", "1789年", "1770年", "1783年"), "历史", "1776年7月4日，第二届大陆会议通过了《独立宣言》，宣布北美十三个殖民地脱离英国独立。"),
            es = LocalizedContent("¿En qué año se firmó la Declaración de Independencia de Estados Unidos?", listOf("1776", "1789", "1770", "1783"), "Historia", "El 4 de julio de 1776, el Segundo Congreso Continental adoptó la Declaración de Independencia, proclamando la separación de las trece colonias americanas de Gran Bretaña.")
        ),
        BilingualQuestion(
            id = 21701, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de couleurs a l'arc-en-ciel ?", listOf("7", "5", "6", "8"), "Culture", "L'arc-en-ciel est traditionnellement décrit avec sept couleurs : rouge, orange, jaune, vert, bleu, indigo et violet. Cette classification a été popularisée par Isaac Newton."),
            en = LocalizedContent("How many colors does a rainbow have?", listOf("7", "5", "6", "8"), "Culture", "A rainbow is traditionally described as having seven colors: red, orange, yellow, green, blue, indigo, and violet. This classification was popularized by Isaac Newton."),
            zh = LocalizedContent("彩虹有多少种颜色？", listOf("7", "5", "6", "8"), "文化", "传统上，彩虹被描述为有七种颜色：红、橙、黄、绿、蓝、靛、紫。这种分类由艾萨克·牛顿推广。"),
            es = LocalizedContent("¿Cuántos colores tiene un arcoíris?", listOf("7", "5", "6", "8"), "Cultura", "Tradicionalmente, el arcoíris se describe con siete colores: rojo, naranja, amarillo, verde, azul, añil y violeta. Esta clasificación fue popularizada por Isaac Newton.")
        ),
        BilingualQuestion(
            id = 21702, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole de la paix ?", listOf("La colombe", "L'aigle", "Le lion", "L'ours"), "Culture", "La colombe est devenue un symbole universel de la paix depuis le récit biblique de l'arche de Noé, où elle apporta un rameau d'olivier pour annoncer la fin du déluge."),
            en = LocalizedContent("What is the symbol of peace?", listOf("The dove", "The eagle", "The lion", "The bear"), "Culture", "The dove became a universal symbol of peace since the biblical story of Noah's Ark, where it brought an olive branch to announce the end of the flood."),
            zh = LocalizedContent("和平的象征是什么？", listOf("鸽子", "鹰", "狮子", "熊"), "文化", "自圣经中诺亚方舟的故事以来，鸽子成为和平的普遍象征，它衔着橄榄枝宣布洪水的结束。"),
            es = LocalizedContent("¿Cuál es el símbolo de la paz?", listOf("La paloma", "El águila", "El león", "El oso"), "Cultura", "La paloma se convirtió en un símbolo universal de la paz desde la historia bíblica del Arca de Noé, donde trajo una rama de olivo para anunciar el fin del diluvio.")
        ),
        BilingualQuestion(
            id = 21703, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de merveilles du monde antique existe-t-il ?", listOf("7", "5", "10", "12"), "Culture", "La liste canonique des sept merveilles du monde antique a été établie par des auteurs grecs comme Philon de Byzance, incluant des chefs-d'œuvre comme la pyramide de Khéops ou le phare d'Alexandrie."),
            en = LocalizedContent("How many wonders of the ancient world are there?", listOf("7", "5", "10", "12"), "Culture", "The canonical list of the Seven Wonders of the Ancient World was established by Greek authors like Philo of Byzantium, including masterpieces such as the Pyramid of Khufu or the Lighthouse of Alexandria."),
            zh = LocalizedContent("古代世界有七大奇迹？", listOf("7", "5", "10", "12"), "文化", "古代世界七大奇迹的经典列表由希腊作家如拜占庭的菲洛确立，包括胡夫金字塔和亚历山大灯塔等杰作。"),
            es = LocalizedContent("¿Cuántas maravillas del mundo antiguo existen?", listOf("7", "5", "10", "12"), "Cultura", "La lista canónica de las siete maravillas del mundo antiguo fue establecida por autores griegos como Filón de Bizancio, incluyendo obras maestras como la pirámide de Keops o el faro de Alejandría.")
        ),
        BilingualQuestion(
            id = 21704, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel jeu de société se joue sur un plateau de 64 cases ?", listOf("Les échecs", "Les dames", "Le go", "Le backgammon"), "Culture", "Le plateau de 64 cases est spécifique au jeu d'échecs, qui se joue sur un échiquier de 8 cases sur 8."),
            en = LocalizedContent("Which board game is played on a 64-square board?", listOf("Chess", "Checkers", "Go", "Backgammon"), "Culture", "The 64-square board is specific to chess, which is played on an 8x8 board."),
            zh = LocalizedContent("哪种棋盘游戏在64格棋盘上进行？", listOf("国际象棋", "跳棋", "围棋", "双陆棋"), "文化", "64格棋盘是国际象棋特有的，棋盘为8x8格。"),
            es = LocalizedContent("¿Qué juego de mesa se juega en un tablero de 64 casillas?", listOf("Ajedrez", "Damas", "Go", "Backgammon"), "Cultura", "El tablero de 64 casillas es específico del ajedrez, que se juega en un tablero de 8x8.")
        ),
        BilingualQuestion(
            id = 21705, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle langue est la plus parlée au monde (en nombre de locuteurs natifs) ?", listOf("Le mandarin", "L'anglais", "L'espagnol", "L'hindi"), "Culture", "Le mandarin est la langue maternelle de plus d'un milliard de personnes, principalement en Chine, ce qui en fait la langue la plus parlée au monde en nombre de locuteurs natifs."),
            en = LocalizedContent("Which language is the most spoken in the world (by number of native speakers)?", listOf("Mandarin", "English", "Spanish", "Hindi"), "Culture", "Mandarin is the mother tongue of over a billion people, mainly in China, making it the most spoken language in the world by number of native speakers."),
            zh = LocalizedContent("世界上使用人数最多的语言（以母语者数量计）是什么？", listOf("普通话", "英语", "西班牙语", "印地语"), "文化", "普通话是超过十亿人的母语，主要在中国，使其成为世界上母语者最多的语言。"),
            es = LocalizedContent("¿Qué idioma es el más hablado del mundo (en número de hablantes nativos)?", listOf("Mandarín", "Inglés", "Español", "Hindi"), "Cultura", "El mandarín es la lengua materna de más de mil millones de personas, principalmente en China, lo que lo convierte en el idioma más hablado del mundo en número de hablantes nativos.")
        ),
        BilingualQuestion(
            id = 21706, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre a coupé sa propre oreille ?", listOf("Vincent van Gogh", "Paul Gauguin", "Claude Monet", "Pablo Picasso"), "Culture", "Vincent van Gogh s'est coupé l'oreille gauche en 1888 après une dispute avec Paul Gauguin, un épisode marquant de ses troubles mentaux."),
            en = LocalizedContent("Which painter cut off his own ear?", listOf("Vincent van Gogh", "Paul Gauguin", "Claude Monet", "Pablo Picasso"), "Culture", "Vincent van Gogh cut off his left ear in 1888 after a quarrel with Paul Gauguin, a notable episode of his mental illness."),
            zh = LocalizedContent("哪位画家割掉了自己的耳朵？", listOf("文森特·梵高", "保罗·高更", "克劳德·莫奈", "巴勃罗·毕加索"), "文化", "文森特·梵高于1888年与保罗·高更争吵后割掉了自己的左耳，这是他精神疾病的一个著名事件。"),
            es = LocalizedContent("¿Qué pintor se cortó su propia oreja?", listOf("Vincent van Gogh", "Paul Gauguin", "Claude Monet", "Pablo Picasso"), "Cultura", "Vincent van Gogh se cortó la oreja izquierda en 1888 tras una disputa con Paul Gauguin, un episodio notable de su enfermedad mental.")
        ),
        BilingualQuestion(
            id = 21707, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de signes du zodiaque y a-t-il ?", listOf("12", "10", "8", "14"), "Culture", "Le zodiaque occidental compte 12 signes, correspondant aux 12 constellations traversées par le Soleil au cours de l'année. Cette division remonte à l'astronomie babylonienne antique."),
            en = LocalizedContent("How many zodiac signs are there?", listOf("12", "10", "8", "14"), "Culture", "The Western zodiac has 12 signs, corresponding to the 12 constellations the Sun passes through during the year. This division dates back to ancient Babylonian astronomy."),
            zh = LocalizedContent("有多少个星座？", listOf("12", "10", "8", "14"), "文化", "西方黄道有12个星座，对应太阳一年中经过的12个星座。这种划分可追溯到古代巴比伦天文学。"),
            es = LocalizedContent("¿Cuántos signos del zodiaco hay?", listOf("12", "10", "8", "14"), "Cultura", "El zodiaco occidental tiene 12 signos, correspondientes a las 12 constelaciones que el Sol atraviesa durante el año. Esta división se remonta a la astronomía babilónica antigua.")
        ),
        BilingualQuestion(
            id = 21708, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel monument se trouve à Agra, en Inde ?", listOf("Le Taj Mahal", "Le Lotus Temple", "Le Fort Rouge", "Le Palais des Vents"), "Culture", "Le Taj Mahal est un mausolée de marbre blanc construit au XVIIe siècle par l'empereur moghol Shah Jahan en mémoire de son épouse Mumtaz Mahal. Il est situé à Agra, en Inde."),
            en = LocalizedContent("Which monument is located in Agra, India?", listOf("The Taj Mahal", "The Lotus Temple", "The Red Fort", "The Palace of the Winds"), "Culture", "The Taj Mahal is a white marble mausoleum built in the 17th century by the Mughal emperor Shah Jahan in memory of his wife Mumtaz Mahal. It is located in Agra, India."),
            zh = LocalizedContent("哪座纪念碑位于印度阿格拉？", listOf("泰姬陵", "莲花寺", "红堡", "风之宫殿"), "文化", "泰姬陵是一座白色大理石陵墓，建于17世纪，由莫卧儿皇帝沙贾汗为纪念其妻子穆塔兹·玛哈尔而建。它位于印度阿格拉。"),
            es = LocalizedContent("¿Qué monumento se encuentra en Agra, India?", listOf("El Taj Mahal", "El Templo del Loto", "El Fuerte Rojo", "El Palacio de los Vientos"), "Cultura", "El Taj Mahal es un mausoleo de mármol blanco construido en el siglo XVII por el emperador mogol Shah Jahan en memoria de su esposa Mumtaz Mahal. Está ubicado en Agra, India.")
        ),
        BilingualQuestion(
            id = 21709, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste a peint 'La Nuit étoilée' ?", listOf("Vincent van Gogh", "Claude Monet", "Paul Cézanne", "Pierre-Auguste Renoir"), "Culture", "Vincent van Gogh a peint 'La Nuit étoilée' en 1889 alors qu'il était interné à l'asile de Saint-Rémy-de-Provence, représentant la vue depuis sa fenêtre."),
            en = LocalizedContent("Which artist painted 'The Starry Night'?", listOf("Vincent van Gogh", "Claude Monet", "Paul Cézanne", "Pierre-Auguste Renoir"), "Culture", "Vincent van Gogh painted 'The Starry Night' in 1889 while he was interned at the asylum of Saint-Rémy-de-Provence, depicting the view from his window."),
            zh = LocalizedContent("哪位艺术家画了《星夜》？", listOf("文森特·梵高", "克劳德·莫奈", "保罗·塞尚", "皮埃尔-奥古斯特·雷诺阿"), "文化", "文森特·梵高于1889年在圣雷米普罗旺斯的精神病院期间创作了《星夜》，描绘了他窗外的景色。"),
            es = LocalizedContent("¿Qué artista pintó 'La noche estrellada'?", listOf("Vincent van Gogh", "Claude Monet", "Paul Cézanne", "Pierre-Auguste Renoir"), "Cultura", "Vincent van Gogh pintó 'La noche estrellada' en 1889 mientras estaba internado en el asilo de Saint-Rémy-de-Provence, representando la vista desde su ventana.")
        ),
        BilingualQuestion(
            id = 21710, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'alphabet utilisé en Russie ?", listOf("L'alphabet cyrillique", "L'alphabet latin", "L'alphabet grec", "L'alphabet arabe"), "Culture", "Le cyrillique est l'alphabet officiel de la Russie, dérivé du grec byzantin et créé par les saints Cyrille et Méthode au IXe siècle."),
            en = LocalizedContent("Which alphabet is used in Russia?", listOf("The Cyrillic alphabet", "The Latin alphabet", "The Greek alphabet", "The Arabic alphabet"), "Culture", "Cyrillic is the official alphabet of Russia, derived from Byzantine Greek and created by Saints Cyril and Methodius in the 9th century."),
            zh = LocalizedContent("俄罗斯使用哪种字母？", listOf("西里尔字母", "拉丁字母", "希腊字母", "阿拉伯字母"), "文化", "西里尔字母是俄罗斯的官方字母，源自拜占庭希腊字母，由圣西里尔和美多德在9世纪创造。"),
            es = LocalizedContent("¿Qué alfabeto se usa en Rusia?", listOf("El alfabeto cirílico", "El alfabeto latino", "El alfabeto griego", "El alfabeto árabe"), "Cultura", "El cirílico es el alfabeto oficial de Rusia, derivado del griego bizantino y creado por los santos Cirilo y Metodio en el siglo IX.")
        ),
        BilingualQuestion(
            id = 21711, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de lettres comporte l'alphabet français ?", listOf("26", "24", "28", "30"), "Culture", "L'alphabet français standard compte 26 lettres, comme l'alphabet latin dont il est issu, bien qu'il inclut aussi des lettres diacritées comme le é ou le ç."),
            en = LocalizedContent("How many letters does the French alphabet have?", listOf("26", "24", "28", "30"), "Culture", "The standard French alphabet has 26 letters, like the Latin alphabet from which it derives, although it also includes diacritical letters such as é or ç."),
            zh = LocalizedContent("法语字母表有多少个字母？", listOf("26", "24", "28", "30"), "文化", "标准法语字母表有26个字母，与它所源自的拉丁字母相同，尽管它也包括带变音符号的字母如é或ç。"),
            es = LocalizedContent("¿Cuántas letras tiene el alfabeto francés?", listOf("26", "24", "28", "30"), "Cultura", "El alfabeto francés estándar tiene 26 letras, como el alfabeto latino del que deriva, aunque también incluye letras diacríticas como la é o la ç.")
        ),
        BilingualQuestion(
            id = 21712, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peuple a inventé le zéro ?", listOf("Les Indiens (civilisation indienne)", "Les Arabes", "Les Grecs", "Les Babyloniens"), "Culture", "Le concept du zéro comme nombre et comme chiffre a été développé par les mathématiciens indiens, notamment dans la civilisation de la vallée de l'Indus et les textes védiques."),
            en = LocalizedContent("Which people invented zero?", listOf("The Indians (Indian civilization)", "The Arabs", "The Greeks", "The Babylonians"), "Culture", "The concept of zero as a number and a digit was developed by Indian mathematicians, notably in the Indus Valley civilization and Vedic texts."),
            zh = LocalizedContent("哪个民族发明了零？", listOf("印度人（印度文明）", "阿拉伯人", "希腊人", "巴比伦人"), "文化", "零作为数字和位数的概念是由印度数学家发展的，特别是在印度河流域文明和吠陀文本中。"),
            es = LocalizedContent("¿Qué pueblo inventó el cero?", listOf("Los indios (civilización india)", "Los árabes", "Los griegos", "Los babilonios"), "Cultura", "El concepto del cero como número y dígito fue desarrollado por matemáticos indios, especialmente en la civilización del valle del Indo y los textos védicos.")
        ),
        BilingualQuestion(
            id = 21713, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel instrument mesure les tremblements de terre ?", listOf("Le sismographe", "Le baromètre", "Le thermomètre", "L'anémomètre"), "Culture", "Le sismographe enregistre les mouvements du sol provoqués par les ondes sismiques, permettant ainsi de détecter et de mesurer l'intensité des tremblements de terre."),
            en = LocalizedContent("Which instrument measures earthquakes?", listOf("Seismograph", "Barometer", "Thermometer", "Anemometer"), "Culture", "The seismograph records ground movements caused by seismic waves, thus allowing detection and measurement of earthquake intensity."),
            zh = LocalizedContent("哪种仪器测量地震？", listOf("地震仪", "气压计", "温度计", "风速计"), "文化", "地震仪记录由地震波引起的地面运动，从而能够检测和测量地震的强度。"),
            es = LocalizedContent("¿Qué instrumento mide los terremotos?", listOf("El sismógrafo", "El barómetro", "El termómetro", "El anemómetro"), "Cultura", "El sismógrafo registra los movimientos del suelo provocados por las ondas sísmicas, permitiendo así detectar y medir la intensidad de los terremotos.")
        ),
        BilingualQuestion(
            id = 21714, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel designer a créé la robe 'petite robe noire' iconique ?", listOf("Coco Chanel", "Christian Dior", "Yves Saint Laurent", "Givenchy"), "Culture", "Coco Chanel a révolutionné la mode féminine en 1926 en introduisant la petite robe noire, sobre et élégante, qui contrastait avec les tenues colorées et corsetées de l'époque."),
            en = LocalizedContent("Which designer created the iconic 'little black dress'?", listOf("Coco Chanel", "Christian Dior", "Yves Saint Laurent", "Givenchy"), "Culture", "Coco Chanel revolutionized women's fashion in 1926 by introducing the little black dress, simple and elegant, contrasting with the colorful and corseted outfits of the time."),
            zh = LocalizedContent("哪位设计师创造了标志性的“小黑裙”？", listOf("可可·香奈儿", "克里斯汀·迪奥", "伊夫·圣罗兰", "纪梵希"), "文化", "可可·香奈儿在1926年通过推出简洁优雅的小黑裙彻底改变了女性时尚，与当时色彩鲜艳、紧身胸衣的服装形成对比。"),
            es = LocalizedContent("¿Qué diseñador creó el icónico 'vestido negro'?", listOf("Coco Chanel", "Christian Dior", "Yves Saint Laurent", "Givenchy"), "Cultura", "Coco Chanel revolucionó la moda femenina en 1926 al introducir el pequeño vestido negro, sobrio y elegante, que contrastaba con los atuendos coloridos y con corsé de la época.")
        ),
        BilingualQuestion(
            id = 21715, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cartes contient un jeu de tarot de Marseille ?", listOf("78", "52", "56", "22"), "Culture", "Le tarot de Marseille se compose de 78 cartes : 56 arcanes mineurs (quatre séries de 14 cartes) et 22 arcanes majeurs (atouts)."),
            en = LocalizedContent("How many cards does a Marseille tarot deck contain?", listOf("78", "52", "56", "22"), "Culture", "The Marseille tarot consists of 78 cards: 56 minor arcana (four suits of 14 cards) and 22 major arcana (trumps)."),
            zh = LocalizedContent("一副马赛塔罗牌包含多少张牌？", listOf("78", "52", "56", "22"), "文化", "马赛塔罗牌由78张牌组成：56张小阿尔卡纳（四组花色，每组14张）和22张大阿尔卡纳（王牌）。"),
            es = LocalizedContent("¿Cuántas cartas contiene una baraja de tarot de Marsella?", listOf("78", "52", "56", "22"), "Cultura", "El tarot de Marsella consta de 78 cartas: 56 arcanos menores (cuatro palos de 14 cartas) y 22 arcanos mayores (triunfos).")
        ),
        BilingualQuestion(
            id = 21716, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel architecte a conçu la Sagrada Família ?", listOf("Antoni Gaudí", "Le Corbusier", "Frank Lloyd Wright", "Renzo Piano"), "Culture", "Antoni Gaudí a dirigé la construction de la Sagrada Família à Barcelone à partir de 1883, en y intégrant son style moderniste unique. L'édifice, toujours inachevé, est l'une de ses œuvres les plus emblématiques."),
            en = LocalizedContent("Which architect designed the Sagrada Família?", listOf("Antoni Gaudí", "Le Corbusier", "Frank Lloyd Wright", "Renzo Piano"), "Culture", "Antoni Gaudí directed the construction of the Sagrada Família in Barcelona from 1883, incorporating his unique modernist style. The building, still unfinished, is one of his most iconic works."),
            zh = LocalizedContent("哪位建筑师设计了圣家堂？", listOf("安东尼·高迪", "勒·柯布西耶", "弗兰克·劳埃德·赖特", "伦佐·皮亚诺"), "文化", "安东尼·高迪从1883年开始指导巴塞罗那圣家堂的建设，融入了其独特的现代主义风格。这座建筑至今未完工，是他最具标志性的作品之一。"),
            es = LocalizedContent("¿Qué arquitecto diseñó la Sagrada Familia?", listOf("Antoni Gaudí", "Le Corbusier", "Frank Lloyd Wright", "Renzo Piano"), "Cultura", "Antoni Gaudí dirigió la construcción de la Sagrada Familia en Barcelona a partir de 1883, incorporando su estilo modernista único. El edificio, aún inacabado, es una de sus obras más emblemáticas.")
        ),
        BilingualQuestion(
            id = 21717, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle couleur obtient-on en mélangeant du bleu et du jaune ?", listOf("Du vert", "Du orange", "Du violet", "Du marron"), "Culture", "Le vert est une couleur secondaire obtenue par la synthèse additive ou soustractive du bleu et du jaune, un principe de base en théorie des couleurs."),
            en = LocalizedContent("What color do you get by mixing blue and yellow?", listOf("Green", "Orange", "Purple", "Brown"), "Culture", "Green is a secondary color obtained by additive or subtractive synthesis of blue and yellow, a basic principle in color theory."),
            zh = LocalizedContent("混合蓝色和黄色会得到什么颜色？", listOf("绿色", "橙色", "紫色", "棕色"), "文化", "绿色是通过蓝色和黄色的加色或减色混合得到的二次色，这是色彩理论的基本原理。"),
            es = LocalizedContent("¿Qué color se obtiene al mezclar azul y amarillo?", listOf("Verde", "Naranja", "Violeta", "Marrón"), "Cultura", "El verde es un color secundario obtenido por síntesis aditiva o sustractiva del azul y el amarillo, un principio básico en la teoría del color.")
        ),
        BilingualQuestion(
            id = 21719, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de faces a un dodécaèdre ?", listOf("12", "10", "20", "8"), "Culture", "Le dodécaèdre est un solide géométrique composé de 12 faces pentagonales régulières, d'où son nom issu du grec \"dodeka\" (douze) et \"hedra\" (face)."),
            en = LocalizedContent("How many faces does a dodecahedron have?", listOf("12", "10", "20", "8"), "Culture", "A dodecahedron is a geometric solid composed of 12 regular pentagonal faces, hence its name from Greek 'dodeka' (twelve) and 'hedra' (face)."),
            zh = LocalizedContent("一个十二面体有多少个面？", listOf("12", "10", "20", "8"), "文化", "十二面体是由12个正五边形面组成的几何体，其名称源自希腊语“dodeka”（十二）和“hedra”（面）。"),
            es = LocalizedContent("¿Cuántas caras tiene un dodecaedro?", listOf("12", "10", "20", "8"), "Cultura", "El dodecaedro es un sólido geométrico compuesto por 12 caras pentagonales regulares, de ahí su nombre del griego 'dodeka' (doce) y 'hedra' (cara).")
        ),
        BilingualQuestion(
            id = 21720, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel célèbre tableau est exposé au Louvre derrière une vitre blindée ?", listOf("La Joconde", "La Liberté guidant le peuple", "Le Radeau de la Méduse", "Les Noces de Cana"), "Culture", "La Joconde, peinte par Léonard de Vinci, est protégée par une vitre blindée au Louvre en raison de sa valeur inestimable et pour la préserver des tentatives de vandalisme."),
            en = LocalizedContent("Which famous painting is displayed at the Louvre behind bulletproof glass?", listOf("Mona Lisa", "Liberty Leading the People", "The Raft of the Medusa", "The Wedding at Cana"), "Culture", "The Mona Lisa, painted by Leonardo da Vinci, is protected by bulletproof glass at the Louvre due to its inestimable value and to preserve it from vandalism attempts."),
            zh = LocalizedContent("哪幅著名画作在卢浮宫陈列在防弹玻璃后面？", listOf("蒙娜丽莎", "自由引导人民", "美杜莎之筏", "迦拿的婚礼"), "文化", "列奥纳多·达·芬奇绘制的《蒙娜丽莎》在卢浮宫由防弹玻璃保护，因其价值连城并防止破坏行为。"),
            es = LocalizedContent("¿Qué famoso cuadro se exhibe en el Louvre detrás de un vidrio blindado?", listOf("La Mona Lisa", "La Libertad guiando al pueblo", "La Balsa de la Medusa", "Las Bodas de Caná"), "Cultura", "La Mona Lisa, pintada por Leonardo da Vinci, está protegida por un vidrio blindado en el Louvre debido a su valor incalculable y para preservarla de intentos de vandalismo.")
        ),
        BilingualQuestion(
            id = 21721, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le jour le plus long de l'année dans l'hémisphère nord ?", listOf("Le solstice d'été (~21 juin)", "Le solstice d'hiver", "L'équinoxe de printemps", "L'équinoxe d'automne"), "Culture", "Le solstice d'été marque le moment où l'axe de la Terre est le plus incliné vers le Soleil, offrant ainsi le maximum d'heures d'ensoleillement dans l'hémisphère nord."),
            en = LocalizedContent("What is the longest day of the year in the Northern Hemisphere?", listOf("Summer solstice (~June 21)", "Winter solstice", "Spring equinox", "Autumn equinox"), "Culture", "The summer solstice marks the moment when the Earth's axis is most tilted toward the Sun, thus providing the maximum hours of sunlight in the Northern Hemisphere."),
            zh = LocalizedContent("北半球一年中最长的一天是哪一天？", listOf("夏至（约6月21日）", "冬至", "春分", "秋分"), "文化", "夏至标志着地球轴线最倾斜向太阳的时刻，因此北半球获得最长的日照时间。"),
            es = LocalizedContent("¿Cuál es el día más largo del año en el hemisferio norte?", listOf("Solsticio de verano (~21 de junio)", "Solsticio de invierno", "Equinoccio de primavera", "Equinoccio de otoño"), "Cultura", "El solsticio de verano marca el momento en que el eje de la Tierra está más inclinado hacia el Sol, proporcionando así el máximo de horas de luz solar en el hemisferio norte.")
        ),
        BilingualQuestion(
            id = 21722, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal est le symbole de la France ?", listOf("Le coq", "L'aigle", "Le lion", "L'ours"), "Culture", "Le coq gaulois est un symbole historique de la France, dérivant du jeu de mots latin entre \"gallus\" (coq) et \"Gallus\" (Gaulois). Il figure sur les pièces de monnaie et les maillots de l'équipe de France de football."),
            en = LocalizedContent("Which animal is the symbol of France?", listOf("The rooster", "The eagle", "The lion", "The bear"), "Culture", "The Gallic rooster is a historical symbol of France, derived from the Latin pun between \"gallus\" (rooster) and \"Gallus\" (Gaul). It appears on coins and the shirts of the French national football team."),
            zh = LocalizedContent("哪个动物是法国的象征？", listOf("公鸡", "鹰", "狮子", "熊"), "文化", "高卢公鸡是法国的历史象征，源于拉丁语中“gallus”（公鸡）和“Gallus”（高卢人）的双关语。它出现在硬币和法国国家足球队的球衣上。"),
            es = LocalizedContent("¿Qué animal es el símbolo de Francia?", listOf("El gallo", "El águila", "El león", "El oso"), "Cultura", "El gallo galo es un símbolo histórico de Francia, derivado del juego de palabras latino entre \"gallus\" (gallo) y \"Gallus\" (galo). Aparece en monedas y en las camisetas de la selección francesa de fútbol.")
        ),
        BilingualQuestion(
            id = 21723, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de planètes du système solaire ont des anneaux ?", listOf("4 (Jupiter, Saturne, Uranus, Neptune)", "1 (Saturne)", "2", "3"), "Culture", "Les quatre planètes gazeuses géantes du système solaire possèdent des anneaux : Jupiter, Saturne, Uranus et Neptune. Saturne est la plus célèbre pour ses anneaux visibles, mais les autres ont des systèmes d'anneaux plus fins et moins brillants."),
            en = LocalizedContent("How many planets in the solar system have rings?", listOf("4 (Jupiter, Saturn, Uranus, Neptune)", "1 (Saturn)", "2", "3"), "Culture", "The four gas giant planets in the solar system have rings: Jupiter, Saturn, Uranus, and Neptune. Saturn is the most famous for its visible rings, but the others have fainter and less prominent ring systems."),
            zh = LocalizedContent("太阳系中有多少颗行星有环？", listOf("4颗（木星、土星、天王星、海王星）", "1颗（土星）", "2颗", "3颗"), "文化", "太阳系中的四颗气态巨行星都有环：木星、土星、天王星和海王星。土星因其可见的环最为著名，但其他行星也有更暗淡、不那么突出的环系统。"),
            es = LocalizedContent("¿Cuántos planetas del sistema solar tienen anillos?", listOf("4 (Júpiter, Saturno, Urano, Neptuno)", "1 (Saturno)", "2", "3"), "Cultura", "Los cuatro planetas gigantes gaseosos del sistema solar tienen anillos: Júpiter, Saturno, Urano y Neptuno. Saturno es el más famoso por sus anillos visibles, pero los otros tienen sistemas de anillos más tenues y menos prominentes.")
        ),
        BilingualQuestion(
            id = 21724, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande population musulmane ?", listOf("L'Indonésie", "L'Arabie saoudite", "Le Pakistan", "L'Égypte"), "Culture", "L'Indonésie, avec plus de 230 millions de musulmans, est le pays comptant la plus grande communauté musulmane au monde, bien que l'islam soit né au Moyen-Orient."),
            en = LocalizedContent("Which country has the largest Muslim population?", listOf("Indonesia", "Saudi Arabia", "Pakistan", "Egypt"), "Culture", "Indonesia, with over 230 million Muslims, is the country with the largest Muslim community in the world, although Islam originated in the Middle East."),
            zh = LocalizedContent("哪个国家的穆斯林人口最多？", listOf("印度尼西亚", "沙特阿拉伯", "巴基斯坦", "埃及"), "文化", "印度尼西亚拥有超过2.3亿穆斯林，是世界上穆斯林人口最多的国家，尽管伊斯兰教起源于中东。"),
            es = LocalizedContent("¿Qué país tiene la mayor población musulmana?", listOf("Indonesia", "Arabia Saudita", "Pakistán", "Egipto"), "Cultura", "Indonesia, con más de 230 millones de musulmanes, es el país con la mayor comunidad musulmana del mundo, aunque el islam se originó en Oriente Medio.")
        ),
        BilingualQuestion(
            id = 21725, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux sport connu de l'humanité ?", listOf("La lutte", "La course à pied", "La natation", "Le tir à l'arc"), "Culture", "Des fresques égyptiennes vieilles de 5000 ans représentent déjà des combats de lutte, ce qui en fait le sport le plus ancien dont on ait des traces écrites et visuelles."),
            en = LocalizedContent("What is the oldest known sport in human history?", listOf("Wrestling", "Running", "Swimming", "Archery"), "Culture", "Egyptian frescoes dating back 5000 years already depict wrestling matches, making it the oldest sport with written and visual records."),
            zh = LocalizedContent("人类已知最古老的运动是什么？", listOf("摔跤", "跑步", "游泳", "射箭"), "文化", "5000年前的埃及壁画已经描绘了摔跤比赛，这使其成为有文字和视觉记录的最古老运动。"),
            es = LocalizedContent("¿Cuál es el deporte más antiguo conocido de la humanidad?", listOf("La lucha", "Correr", "La natación", "El tiro con arco"), "Cultura", "Frescos egipcios de hace 5000 años ya representan combates de lucha, lo que la convierte en el deporte más antiguo del que se tienen registros escritos y visuales.")
        ),
        BilingualQuestion(
            id = 21726, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mouvement artistique est associé à Andy Warhol ?", listOf("Le Pop Art", "Le cubisme", "L'impressionnisme", "Le surréalisme"), "Culture", "Andy Warhol est une figure centrale du Pop Art, mouvement qui a émergé dans les années 1950-1960 en utilisant des images de la culture de masse et de la consommation."),
            en = LocalizedContent("Which artistic movement is associated with Andy Warhol?", listOf("Pop Art", "Cubism", "Impressionism", "Surrealism"), "Culture", "Andy Warhol is a central figure of Pop Art, a movement that emerged in the 1950s-1960s using images from mass culture and consumerism."),
            zh = LocalizedContent("安迪·沃霍尔与哪个艺术运动相关？", listOf("波普艺术", "立体主义", "印象派", "超现实主义"), "文化", "安迪·沃霍尔是波普艺术的核心人物，该运动兴起于20世纪50-60年代，利用大众文化和消费主义图像。"),
            es = LocalizedContent("¿Qué movimiento artístico está asociado con Andy Warhol?", listOf("El Pop Art", "El cubismo", "El impresionismo", "El surrealismo"), "Cultura", "Andy Warhol es una figura central del Pop Art, un movimiento que surgió en las décadas de 1950-1960 utilizando imágenes de la cultura de masas y el consumismo.")
        ),
        BilingualQuestion(
            id = 21727, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de dents de lait un enfant a-t-il ?", listOf("20", "24", "16", "28"), "Culture", "Un enfant possède 20 dents de lait, qui commencent généralement à apparaître vers l'âge de 6 mois et tombent progressivement pour laisser place aux dents définitives."),
            en = LocalizedContent("How many baby teeth does a child have?", listOf("20", "24", "16", "28"), "Culture", "A child has 20 baby teeth, which usually begin to appear around 6 months of age and gradually fall out to make way for permanent teeth."),
            zh = LocalizedContent("一个孩子有多少颗乳牙？", listOf("20", "24", "16", "28"), "文化", "一个孩子有20颗乳牙，通常在6个月左右开始萌出，并逐渐脱落，为恒牙腾出空间。"),
            es = LocalizedContent("¿Cuántos dientes de leche tiene un niño?", listOf("20", "24", "16", "28"), "Cultura", "Un niño tiene 20 dientes de leche, que generalmente comienzan a aparecer alrededor de los 6 meses y se caen gradualmente para dar paso a los dientes permanentes.")
        ),
        BilingualQuestion(
            id = 21728, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le métal le plus précieux en joaillerie ?", listOf("Le platine", "L'or", "L'argent", "Le palladium"), "Culture", "Le platine est plus rare que l'or et plus résistant à l'usure, ce qui en fait le métal le plus précieux en joaillerie haut de gamme."),
            en = LocalizedContent("What is the most precious metal in jewelry?", listOf("Platinum", "Gold", "Silver", "Palladium"), "Culture", "Platinum is rarer than gold and more resistant to wear, making it the most precious metal in high-end jewelry."),
            zh = LocalizedContent("珠宝中最贵重的金属是什么？", listOf("铂金", "黄金", "白银", "钯金"), "文化", "铂金比黄金更稀有，且更耐磨，因此是高端珠宝中最贵重的金属。"),
            es = LocalizedContent("¿Cuál es el metal más precioso en joyería?", listOf("El platino", "El oro", "La plata", "El paladio"), "Cultura", "El platino es más raro que el oro y más resistente al desgaste, lo que lo convierte en el metal más precioso en joyería de alta gama.")
        ),
        BilingualQuestion(
            id = 21729, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le signe astrologique du mois de mars ?", listOf("Poissons et Bélier", "Verseau et Poissons", "Bélier et Taureau", "Capricorne et Verseau"), "Culture", "Le mois de mars chevauche deux signes astrologiques : les Poissons jusqu'au 20 mars environ, puis le Bélier à partir du 21 mars."),
            en = LocalizedContent("What are the astrological signs for the month of March?", listOf("Pisces and Aries", "Aquarius and Pisces", "Aries and Taurus", "Capricorn and Aquarius"), "Culture", "The month of March spans two astrological signs: Pisces until about March 20, then Aries from March 21 onward."),
            zh = LocalizedContent("三月份的星座是什么？", listOf("双鱼座和白羊座", "水瓶座和双鱼座", "白羊座和金牛座", "摩羯座和水瓶座"), "文化", "三月份跨越两个星座：双鱼座直到大约3月20日，然后从3月21日起是白羊座。"),
            es = LocalizedContent("¿Cuáles son los signos astrológicos del mes de marzo?", listOf("Piscis y Aries", "Acuario y Piscis", "Aries y Tauro", "Capricornio y Acuario"), "Cultura", "El mes de marzo abarca dos signos astrológicos: Piscis hasta aproximadamente el 20 de marzo, luego Aries a partir del 21 de marzo.")
        ),
        BilingualQuestion(
            id = 21730, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle danse argentine est inscrite au patrimoine immatériel de l'UNESCO ?", listOf("Le tango", "La salsa", "La samba", "Le flamenco"), "Culture", "Le tango argentin a été inscrit en 2009 sur la liste représentative du patrimoine culturel immatériel de l'humanité par l'UNESCO."),
            en = LocalizedContent("Which Argentine dance is inscribed on UNESCO's Intangible Cultural Heritage list?", listOf("Tango", "Salsa", "Samba", "Flamenco"), "Culture", "Argentine tango was inscribed in 2009 on UNESCO's Representative List of the Intangible Cultural Heritage of Humanity."),
            zh = LocalizedContent("哪种阿根廷舞蹈被列入联合国教科文组织非物质文化遗产名录？", listOf("探戈", "萨尔萨", "桑巴", "弗拉门戈"), "文化", "阿根廷探戈于2009年被列入联合国教科文组织人类非物质文化遗产代表作名录。"),
            es = LocalizedContent("¿Qué danza argentina está inscrita en el patrimonio inmaterial de la UNESCO?", listOf("El tango", "La salsa", "La samba", "El flamenco"), "Cultura", "El tango argentino fue inscrito en 2009 en la lista representativa del patrimonio cultural inmaterial de la humanidad por la UNESCO.")
        ),
        BilingualQuestion(
            id = 21801, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien vaut Pi arrondi à 2 décimales ?", listOf("3,14", "3,16", "3,12", "3,18"), "Mathématiques", "Pi est le rapport constant entre la circonférence d'un cercle et son diamètre, et sa valeur tronquée à deux décimales est 3,14."),
            en = LocalizedContent("What is Pi rounded to 2 decimal places?", listOf("3.14", "3.16", "3.12", "3.18"), "Mathematics", "Pi is the constant ratio of a circle's circumference to its diameter, and its value truncated to two decimal places is 3.14."),
            zh = LocalizedContent("圆周率π四舍五入到两位小数是多少？", listOf("3.14", "3.16", "3.12", "3.18"), "数学", "π是圆的周长与直径的恒定比值，截断到两位小数的值是3.14。"),
            es = LocalizedContent("¿Cuánto vale Pi redondeado a 2 decimales?", listOf("3,14", "3,16", "3,12", "3,18"), "Matemáticas", "Pi es la relación constante entre la circunferencia de un círculo y su diámetro, y su valor truncado a dos decimales es 3,14.")
        ),
        BilingualQuestion(
            id = 21803, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien vaut la racine carrée de 144 ?", listOf("12", "14", "11", "13"), "Mathématiques", "12 est la racine carrée de 144 car 12 multiplié par lui-même donne 144."),
            en = LocalizedContent("What is the square root of 144?", listOf("12", "14", "11", "13"), "Mathematics", "12 is the square root of 144 because 12 multiplied by itself equals 144."),
            zh = LocalizedContent("144的平方根是多少？", listOf("12", "14", "11", "13"), "数学", "12是144的平方根，因为12乘以自身等于144。"),
            es = LocalizedContent("¿Cuánto vale la raíz cuadrada de 144?", listOf("12", "14", "11", "13"), "Matemáticas", "12 es la raíz cuadrada de 144 porque 12 multiplicado por sí mismo da 144.")
        ),
        BilingualQuestion(
            id = 21805, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de faces a un cube ?", listOf("6", "4", "8", "12"), "Mathématiques", "Un cube possède 6 faces car c'est un polyèdre régulier composé de six carrés identiques. Chaque face est un côté plat de cette figure géométrique tridimensionnelle."),
            en = LocalizedContent("How many faces does a cube have?", listOf("6", "4", "8", "12"), "Mathematics", "A cube has 6 faces because it is a regular polyhedron composed of six identical squares. Each face is a flat side of this three-dimensional geometric figure."),
            zh = LocalizedContent("一个立方体有多少个面？", listOf("6", "4", "8", "12"), "数学", "立方体有6个面，因为它是由六个相同的正方形组成的正多面体。每个面都是这个三维几何图形的一个平面。"),
            es = LocalizedContent("¿Cuántas caras tiene un cubo?", listOf("6", "4", "8", "12"), "Matemáticas", "Un cubo tiene 6 caras porque es un poliedro regular compuesto por seis cuadrados idénticos. Cada cara es un lado plano de esta figura geométrica tridimensional.")
        ),
        BilingualQuestion(
            id = 21806, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une suite de Fibonacci ?", listOf("Chaque terme est la somme des deux précédents", "Chaque terme double le précédent", "Une suite géométrique", "Une suite de nombres premiers"), "Mathématiques", "Leonardo Fibonacci introduisit cette suite en 1202 dans son ouvrage Liber Abaci. Chaque nombre est obtenu en additionnant les deux précédents, débutant généralement par 0 et 1."),
            en = LocalizedContent("What is a Fibonacci sequence?", listOf("Each term is the sum of the two preceding ones", "Each term doubles the previous one", "A geometric sequence", "A sequence of prime numbers"), "Mathematics", "Leonardo Fibonacci introduced this sequence in 1202 in his work Liber Abaci. Each number is obtained by adding the two preceding ones, typically starting with 0 and 1."),
            zh = LocalizedContent("什么是斐波那契数列？", listOf("每一项是前两项之和", "每一项是前一项的两倍", "一个等比数列", "一个质数数列"), "数学", "莱昂纳多·斐波那契在1202年的著作《计算之书》中引入了这个数列。每个数都是前两个数之和，通常以0和1开始。"),
            es = LocalizedContent("¿Qué es una sucesión de Fibonacci?", listOf("Cada término es la suma de los dos anteriores", "Cada término duplica el anterior", "Una sucesión geométrica", "Una sucesión de números primos"), "Matemáticas", "Leonardo Fibonacci introdujo esta sucesión en 1202 en su obra Liber Abaci. Cada número se obtiene sumando los dos anteriores, comenzando generalmente por 0 y 1.")
        ),
        BilingualQuestion(
            id = 21807, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien vaut 2 puissance 10 ?", listOf("1024", "512", "2048", "256"), "Mathématiques", "2 puissance 10 signifie multiplier 2 par lui-même 10 fois, ce qui donne 1024, une valeur clé en informatique pour le kilooctet."),
            en = LocalizedContent("What is 2 to the power of 10?", listOf("1024", "512", "2048", "256"), "Mathematics", "2 to the power of 10 means multiplying 2 by itself 10 times, resulting in 1024, a key value in computing for the kilobyte."),
            zh = LocalizedContent("2的10次方等于多少？", listOf("1024", "512", "2048", "256"), "数学", "2的10次方表示10个2相乘，结果为1024，这是计算机科学中千字节的关键值。"),
            es = LocalizedContent("¿Cuánto vale 2 elevado a la 10?", listOf("1024", "512", "2048", "256"), "Matemáticas", "2 elevado a 10 significa multiplicar 2 por sí mismo 10 veces, lo que da 1024, un valor clave en informática para el kilobyte.")
        ),
        BilingualQuestion(
            id = 21808, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule de l'aire d'un cercle ?", listOf("π × r²", "2 × π × r", "π × d", "r² × 2"), "Mathématiques", "L'aire d'un cercle se calcule en multipliant le nombre π (environ 3,14) par le carré du rayon (r²). Cette formule découle de la relation entre le rayon et la surface du disque."),
            en = LocalizedContent("What is the formula for the area of a circle?", listOf("π × r²", "2 × π × r", "π × d", "r² × 2"), "Mathematics", "The area of a circle is calculated by multiplying π (approximately 3.14) by the square of the radius (r²). This formula derives from the relationship between the radius and the surface of the disk."),
            zh = LocalizedContent("圆的面积公式是什么？", listOf("π × r²", "2 × π × r", "π × d", "r² × 2"), "数学", "圆的面积通过将π（约3.14）乘以半径的平方（r²）来计算。这个公式源于半径与圆盘面积之间的关系。"),
            es = LocalizedContent("¿Cuál es la fórmula del área de un círculo?", listOf("π × r²", "2 × π × r", "π × d", "r² × 2"), "Matemáticas", "El área de un círculo se calcula multiplicando π (aproximadamente 3,14) por el cuadrado del radio (r²). Esta fórmula deriva de la relación entre el radio y la superficie del disco.")
        ),
        BilingualQuestion(
            id = 21809, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un nombre imaginaire ?", listOf("Un nombre dont le carré est négatif (i² = -1)", "Un nombre très grand", "Un nombre qui n'existe pas", "Un nombre décimal infini"), "Mathématiques", "En mathématiques, les nombres réels ne permettent pas de résoudre des équations comme x² = -1. Les nombres imaginaires, basés sur l'unité i où i² = -1, étendent le système numérique pour inclure ces solutions."),
            en = LocalizedContent("What is an imaginary number?", listOf("A number whose square is negative (i² = -1)", "A very large number", "A number that does not exist", "An infinite decimal number"), "Mathematics", "In mathematics, real numbers cannot solve equations like x² = -1. Imaginary numbers, based on the unit i where i² = -1, extend the number system to include these solutions."),
            zh = LocalizedContent("什么是虚数？", listOf("平方为负数的数（i² = -1）", "非常大的数", "不存在的数", "无限小数"), "数学", "在数学中，实数无法解出像x² = -1这样的方程。虚数基于单位i（i² = -1），扩展了数系以包含这些解。"),
            es = LocalizedContent("¿Qué es un número imaginario?", listOf("Un número cuyo cuadrado es negativo (i² = -1)", "Un número muy grande", "Un número que no existe", "Un número decimal infinito"), "Matemáticas", "En matemáticas, los números reales no permiten resolver ecuaciones como x² = -1. Los números imaginarios, basados en la unidad i donde i² = -1, extienden el sistema numérico para incluir estas soluciones.")
        ),
        BilingualQuestion(
            id = 21810, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien vaut la factorielle de 5 (5!) ?", listOf("120", "60", "24", "720"), "Mathématiques", "5! = 5 × 4 × 3 × 2 × 1 = 120, la factorielle d'un entier positif étant le produit de tous les entiers de 1 à ce nombre."),
            en = LocalizedContent("What is the factorial of 5 (5!)?", listOf("120", "60", "24", "720"), "Mathematics", "5! = 5 × 4 × 3 × 2 × 1 = 120, the factorial of a positive integer being the product of all integers from 1 to that number."),
            zh = LocalizedContent("5的阶乘（5!）等于多少？", listOf("120", "60", "24", "720"), "数学", "5! = 5 × 4 × 3 × 2 × 1 = 120，正整数的阶乘是从1到该数的所有整数的乘积。"),
            es = LocalizedContent("¿Cuánto vale el factorial de 5 (5!)?", listOf("120", "60", "24", "720"), "Matemáticas", "5! = 5 × 4 × 3 × 2 × 1 = 120, el factorial de un entero positivo es el producto de todos los enteros desde 1 hasta ese número.")
        ),
        BilingualQuestion(
            id = 21811, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le nombre d'or ?", listOf("~1,618 (phi)", "~2,718 (e)", "~3,14 (pi)", "~1,414 (√2)"), "Mathématiques", "Le nombre d'or, noté φ (phi), est une constante mathématique irrationnelle approximativement égale à 1,618, souvent retrouvée dans les proportions esthétiques en art et en architecture."),
            en = LocalizedContent("What is the golden ratio?", listOf("~1.618 (phi)", "~2.718 (e)", "~3.14 (pi)", "~1.414 (√2)"), "Mathematics", "The golden ratio, denoted φ (phi), is an irrational mathematical constant approximately equal to 1.618, often found in aesthetic proportions in art and architecture."),
            zh = LocalizedContent("什么是黄金比例？", listOf("~1.618（φ）", "~2.718（e）", "~3.14（π）", "~1.414（√2）"), "数学", "黄金比例，用φ（phi）表示，是一个无理数学常数，约等于1.618，常见于艺术和建筑中的美学比例。"),
            es = LocalizedContent("¿Qué es el número áureo?", listOf("~1,618 (phi)", "~2,718 (e)", "~3,14 (pi)", "~1,414 (√2)"), "Matemáticas", "El número áureo, denotado φ (phi), es una constante matemática irracional aproximadamente igual a 1,618, a menudo encontrada en proporciones estéticas en arte y arquitectura.")
        ),
        BilingualQuestion(
            id = 21812, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mathématicien a inventé la géométrie analytique ?", listOf("René Descartes", "Blaise Pascal", "Pierre de Fermat", "Gottfried Leibniz"), "Mathématiques", "René Descartes a publié en 1637 La Géométrie, où il introduit l'usage des coordonnées pour lier algèbre et géométrie, fondant ainsi la géométrie analytique."),
            en = LocalizedContent("Which mathematician invented analytic geometry?", listOf("René Descartes", "Blaise Pascal", "Pierre de Fermat", "Gottfried Leibniz"), "Mathematics", "René Descartes published La Géométrie in 1637, where he introduced the use of coordinates to link algebra and geometry, thus founding analytic geometry."),
            zh = LocalizedContent("哪位数学家发明了解析几何？", listOf("勒内·笛卡尔", "布莱兹·帕斯卡", "皮埃尔·德·费马", "戈特弗里德·莱布尼茨"), "数学", "勒内·笛卡尔在1637年出版了《几何学》，其中他引入了坐标的使用，将代数和几何联系起来，从而创立了解析几何。"),
            es = LocalizedContent("¿Qué matemático inventó la geometría analítica?", listOf("René Descartes", "Blaise Pascal", "Pierre de Fermat", "Gottfried Leibniz"), "Matemáticas", "René Descartes publicó en 1637 La Géométrie, donde introduce el uso de coordenadas para vincular álgebra y geometría, fundando así la geometría analítica.")
        ),
        BilingualQuestion(
            id = 21813, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de sommets a un icosaèdre ?", listOf("12", "20", "10", "8"), "Mathématiques", "Un icosaèdre est un polyèdre régulier composé de 20 faces triangulaires. Il possède 12 sommets où se rencontrent cinq triangles."),
            en = LocalizedContent("How many vertices does an icosahedron have?", listOf("12", "20", "10", "8"), "Mathematics", "An icosahedron is a regular polyhedron composed of 20 triangular faces. It has 12 vertices where five triangles meet."),
            zh = LocalizedContent("一个二十面体有多少个顶点？", listOf("12", "20", "10", "8"), "数学", "二十面体是由20个三角形面组成的正多面体。它有12个顶点，每个顶点处有五个三角形相交。"),
            es = LocalizedContent("¿Cuántos vértices tiene un icosaedro?", listOf("12", "20", "10", "8"), "Matemáticas", "Un icosaedro es un poliedro regular compuesto por 20 caras triangulares. Tiene 12 vértices donde se encuentran cinco triángulos.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 21814, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une matrice ?", listOf("Un tableau rectangulaire de nombres", "Un type d'équation", "Un graphique", "Un algorithme"), "Mathématiques", "En mathématiques, une matrice est un tableau rectangulaire organisé en lignes et colonnes, utilisé pour représenter des données ou des transformations linéaires."),
            en = LocalizedContent("What is a matrix?", listOf("A rectangular array of numbers", "A type of equation", "A graph", "An algorithm"), "Mathematics", "In mathematics, a matrix is a rectangular array organized in rows and columns, used to represent data or linear transformations."),
            zh = LocalizedContent("什么是矩阵？", listOf("一个矩形的数字阵列", "一种方程", "一个图表", "一种算法"), "数学", "在数学中，矩阵是按行和列组织的矩形阵列，用于表示数据或线性变换。"),
            es = LocalizedContent("¿Qué es una matriz?", listOf("Un arreglo rectangular de números", "Un tipo de ecuación", "Un gráfico", "Un algoritmo"), "Matemáticas", "En matemáticas, una matriz es un arreglo rectangular organizado en filas y columnas, utilizado para representar datos o transformaciones lineales.")
        ),
        BilingualQuestion(
            id = 21815, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit nombre premier ?", listOf("2", "1", "3", "0"), "Mathématiques", "2 est le plus petit nombre premier car il n'est divisible que par 1 et par lui-même, et il est le seul nombre pair à posséder cette propriété."),
            en = LocalizedContent("What is the smallest prime number?", listOf("2", "1", "3", "0"), "Mathematics", "2 is the smallest prime number because it is only divisible by 1 and itself, and it is the only even number with this property."),
            zh = LocalizedContent("最小的质数是什么？", listOf("2", "1", "3", "0"), "数学", "2是最小的质数，因为它只能被1和自身整除，并且它是唯一具有此性质的偶数。"),
            es = LocalizedContent("¿Cuál es el número primo más pequeño?", listOf("2", "1", "3", "0"), "Matemáticas", "2 es el número primo más pequeño porque solo es divisible por 1 y por sí mismo, y es el único número par con esta propiedad.")
        ),
        BilingualQuestion(
            id = 21816, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'intégrale en mathématiques ?", listOf("Le calcul de l'aire sous une courbe", "La pente d'une droite", "La dérivée d'une fonction", "Un type de fraction"), "Mathématiques", "L'intégrale mesure l'aire entre une courbe et l'axe horizontal, en additionnant des surfaces infinitésimales. C'est un outil fondamental du calcul différentiel et intégral."),
            en = LocalizedContent("What is the integral in mathematics?", listOf("The calculation of the area under a curve", "The slope of a line", "The derivative of a function", "A type of fraction"), "Mathematics", "The integral measures the area between a curve and the horizontal axis by summing infinitesimal areas. It is a fundamental tool of differential and integral calculus."),
            zh = LocalizedContent("数学中的积分是什么？", listOf("计算曲线下的面积", "直线的斜率", "函数的导数", "一种分数"), "数学", "积分通过累加无穷小的面积来测量曲线与水平轴之间的面积。它是微积分的基本工具。"),
            es = LocalizedContent("¿Qué es la integral en matemáticas?", listOf("El cálculo del área bajo una curva", "La pendiente de una recta", "La derivada de una función", "Un tipo de fracción"), "Matemáticas", "La integral mide el área entre una curva y el eje horizontal sumando áreas infinitesimales. Es una herramienta fundamental del cálculo diferencial e integral.")
        ),
        BilingualQuestion(
            id = 21817, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien vaut log₁₀(1000) ?", listOf("3", "10", "100", "30"), "Mathématiques", "Le logarithme décimal de 1000 est 3 car 10³ = 1000."),
            en = LocalizedContent("What is log₁₀(1000)?", listOf("3", "10", "100", "30"), "Mathematics", "The base-10 logarithm of 1000 is 3 because 10³ = 1000."),
            zh = LocalizedContent("log₁₀(1000)等于多少？", listOf("3", "10", "100", "30"), "数学", "1000的常用对数是3，因为10³ = 1000。"),
            es = LocalizedContent("¿Cuánto vale log₁₀(1000)?", listOf("3", "10", "100", "30"), "Matemáticas", "El logaritmo en base 10 de 1000 es 3 porque 10³ = 1000.")
        ),
        BilingualQuestion(
            id = 21818, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que le dernier théorème de Fermat ?", listOf("aⁿ + bⁿ = cⁿ n'a pas de solution entière pour n > 2", "La somme des angles = 180°", "Tout nombre pair est somme de deux premiers", "Il existe une infinité de nombres premiers"), "Mathématiques", "Énoncé par Pierre de Fermat au XVIIe siècle, ce théorème affirme qu'aucun triplet d'entiers positifs ne vérifie aⁿ + bⁿ = cⁿ pour n > 2, démontré seulement en 1994 par Andrew Wiles."),
            en = LocalizedContent("What is Fermat's Last Theorem?", listOf("aⁿ + bⁿ = cⁿ has no integer solution for n > 2", "The sum of angles = 180°", "Every even number is the sum of two primes", "There are infinitely many prime numbers"), "Mathematics", "Stated by Pierre de Fermat in the 17th century, this theorem asserts that no three positive integers satisfy aⁿ + bⁿ = cⁿ for n > 2, proven only in 1994 by Andrew Wiles."),
            zh = LocalizedContent("什么是费马大定理？", listOf("aⁿ + bⁿ = cⁿ 当 n > 2 时没有整数解", "三角形内角和为180°", "每个偶数都是两个质数之和", "存在无穷多个质数"), "数学", "由皮埃尔·德·费马在17世纪提出，该定理断言对于 n > 2，不存在三个正整数满足 aⁿ + bⁿ = cⁿ，直到1994年才由安德鲁·怀尔斯证明。"),
            es = LocalizedContent("¿Qué es el Último Teorema de Fermat?", listOf("aⁿ + bⁿ = cⁿ no tiene solución entera para n > 2", "La suma de los ángulos = 180°", "Todo número par es suma de dos primos", "Existen infinitos números primos"), "Matemáticas", "Enunciado por Pierre de Fermat en el siglo XVII, este teorema afirma que ningún triple de enteros positivos satisface aⁿ + bⁿ = cⁿ para n > 2, demostrado solo en 1994 por Andrew Wiles.")
        ),
        BilingualQuestion(
            id = 21819, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le périmètre d'un cercle de rayon r ?", listOf("2πr", "πr²", "πd²", "r²"), "Mathématiques", "Le périmètre d'un cercle, aussi appelé circonférence, se calcule en multipliant le diamètre (2r) par π, ce qui donne 2πr."),
            en = LocalizedContent("What is the perimeter of a circle with radius r?", listOf("2πr", "πr²", "πd²", "r²"), "Mathematics", "The perimeter of a circle, also called circumference, is calculated by multiplying the diameter (2r) by π, giving 2πr."),
            zh = LocalizedContent("半径为r的圆的周长是多少？", listOf("2πr", "πr²", "πd²", "r²"), "数学", "圆的周长（也称为圆周）通过将直径（2r）乘以π来计算，得到2πr。"),
            es = LocalizedContent("¿Cuál es el perímetro de un círculo de radio r?", listOf("2πr", "πr²", "πd²", "r²"), "Matemáticas", "El perímetro de un círculo, también llamado circunferencia, se calcula multiplicando el diámetro (2r) por π, lo que da 2πr.")
        ),
        BilingualQuestion(
            id = 21820, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de diagonales a un hexagone ?", listOf("9", "6", "12", "3"), "Mathématiques", "Un hexagone a 6 sommets. Le nombre de diagonales se calcule par la formule n(n-3)/2, soit 6*3/2 = 9."),
            en = LocalizedContent("How many diagonals does a hexagon have?", listOf("9", "6", "12", "3"), "Mathematics", "A hexagon has 6 vertices. The number of diagonals is calculated by the formula n(n-3)/2, which is 6*3/2 = 9."),
            zh = LocalizedContent("一个六边形有多少条对角线？", listOf("9", "6", "12", "3"), "数学", "六边形有6个顶点。对角线的数量由公式 n(n-3)/2 计算，即 6*3/2 = 9。"),
            es = LocalizedContent("¿Cuántas diagonales tiene un hexágono?", listOf("9", "6", "12", "3"), "Matemáticas", "Un hexágono tiene 6 vértices. El número de diagonales se calcula con la fórmula n(n-3)/2, que es 6*3/2 = 9.")
        ),
        BilingualQuestion(
            id = 21821, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une fonction exponentielle ?", listOf("f(x) = eˣ", "f(x) = x²", "f(x) = ln(x)", "f(x) = 1/x"), "Mathématiques", "La fonction exponentielle f(x) = eˣ est la fonction dont la dérivée est égale à elle-même, et où e est la constante mathématique valant environ 2,718."),
            en = LocalizedContent("What is an exponential function?", listOf("f(x) = eˣ", "f(x) = x²", "f(x) = ln(x)", "f(x) = 1/x"), "Mathematics", "The exponential function f(x) = eˣ is the function whose derivative is equal to itself, where e is the mathematical constant approximately equal to 2.718."),
            zh = LocalizedContent("什么是指数函数？", listOf("f(x) = eˣ", "f(x) = x²", "f(x) = ln(x)", "f(x) = 1/x"), "数学", "指数函数 f(x) = eˣ 是其导数等于自身的函数，其中 e 是约等于2.718的数学常数。"),
            es = LocalizedContent("¿Qué es una función exponencial?", listOf("f(x) = eˣ", "f(x) = x²", "f(x) = ln(x)", "f(x) = 1/x"), "Matemáticas", "La función exponencial f(x) = eˣ es la función cuya derivada es igual a sí misma, donde e es la constante matemática aproximadamente igual a 2.718.")
        ),
        BilingualQuestion(
            id = 21822, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel mathématicien a prouvé le dernier théorème de Fermat en 1995 ?", listOf("Andrew Wiles", "Pierre de Fermat", "Leonhard Euler", "Carl Gauss"), "Mathématiques", "Andrew Wiles a démontré le dernier théorème de Fermat en 1995, résolvant une conjecture vieille de plus de 350 ans grâce à la preuve de la conjecture de Shimura-Taniyama-Weil pour les courbes elliptiques semi-stables."),
            en = LocalizedContent("Which mathematician proved Fermat's Last Theorem in 1995?", listOf("Andrew Wiles", "Pierre de Fermat", "Leonhard Euler", "Carl Gauss"), "Mathematics", "Andrew Wiles proved Fermat's Last Theorem in 1995, solving a conjecture over 350 years old by proving the Shimura-Taniyama-Weil conjecture for semistable elliptic curves."),
            zh = LocalizedContent("哪位数学家在1995年证明了费马大定理？", listOf("安德鲁·怀尔斯", "皮埃尔·德·费马", "莱昂哈德·欧拉", "卡尔·高斯"), "数学", "安德鲁·怀尔斯在1995年证明了费马大定理，通过证明半稳定椭圆曲线的志村-谷山-韦尔猜想，解决了一个超过350年的猜想。"),
            es = LocalizedContent("¿Qué matemático demostró el Último Teorema de Fermat en 1995?", listOf("Andrew Wiles", "Pierre de Fermat", "Leonhard Euler", "Carl Gauss"), "Matemáticas", "Andrew Wiles demostró el Último Teorema de Fermat en 1995, resolviendo una conjetura de más de 350 años al probar la conjetura de Shimura-Taniyama-Weil para curvas elípticas semiestables.")
        ),
        BilingualQuestion(
            id = 21823, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien vaut la somme des angles d'un triangle ?", listOf("180°", "360°", "90°", "270°"), "Mathématiques", "La somme des angles intérieurs d'un triangle dans la géométrie euclidienne est toujours égale à 180 degrés, une propriété démontrée par Euclide."),
            en = LocalizedContent("What is the sum of the angles of a triangle?", listOf("180°", "360°", "90°", "270°"), "Mathematics", "The sum of the interior angles of a triangle in Euclidean geometry is always 180 degrees, a property proven by Euclid."),
            zh = LocalizedContent("三角形的内角和是多少？", listOf("180°", "360°", "90°", "270°"), "数学", "在欧几里得几何中，三角形的内角和总是180度，这是由欧几里得证明的性质。"),
            es = LocalizedContent("¿Cuánto suman los ángulos de un triángulo?", listOf("180°", "360°", "90°", "270°"), "Matemáticas", "La suma de los ángulos interiores de un triángulo en la geometría euclidiana es siempre 180 grados, una propiedad demostrada por Euclides.")
        ),
        BilingualQuestion(
            id = 21824, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un vecteur ?", listOf("Une grandeur ayant direction, sens et norme", "Un nombre négatif", "Un type de matrice", "Une droite infinie"), "Mathématiques", "En mathématiques et en physique, un vecteur modélise une quantité qui ne peut être décrite uniquement par sa valeur numérique, car elle nécessite une orientation dans l'espace, comme une force ou une vitesse."),
            en = LocalizedContent("What is a vector?", listOf("A quantity with direction, sense, and magnitude", "A negative number", "A type of matrix", "An infinite line"), "Mathematics", "In mathematics and physics, a vector models a quantity that cannot be described solely by its numerical value, as it requires orientation in space, such as a force or velocity."),
            zh = LocalizedContent("什么是向量？", listOf("具有方向、指向和大小的量", "一个负数", "一种矩阵", "一条无限直线"), "数学", "在数学和物理学中，向量表示不能仅用数值描述的量，因为它需要空间中的方向，例如力或速度。"),
            es = LocalizedContent("¿Qué es un vector?", listOf("Una magnitud con dirección, sentido y módulo", "Un número negativo", "Un tipo de matriz", "Una recta infinita"), "Matemáticas", "En matemáticas y física, un vector modela una cantidad que no puede describirse solo por su valor numérico, ya que requiere orientación en el espacio, como una fuerza o una velocidad.")
        ),
        BilingualQuestion(
            id = 21825, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le volume d'une sphère ?", listOf("4/3 × π × r³", "π × r²", "2 × π × r", "4 × π × r²"), "Mathématiques", "Cette formule a été établie par Archimède dans l'Antiquité, qui a démontré que le volume d'une sphère équivaut aux deux tiers du volume du cylindre qui la circonscrit."),
            en = LocalizedContent("What is the volume of a sphere?", listOf("4/3 × π × r³", "π × r²", "2 × π × r", "4 × π × r²"), "Mathematics", "This formula was established by Archimedes in antiquity, who demonstrated that the volume of a sphere is two-thirds of the volume of the circumscribing cylinder."),
            zh = LocalizedContent("球体的体积是多少？", listOf("4/3 × π × r³", "π × r²", "2 × π × r", "4 × π × r²"), "数学", "这个公式由古代的阿基米德建立，他证明了球体的体积等于其外接圆柱体体积的三分之二。"),
            es = LocalizedContent("¿Cuál es el volumen de una esfera?", listOf("4/3 × π × r³", "π × r²", "2 × π × r", "4 × π × r²"), "Matemáticas", "Esta fórmula fue establecida por Arquímedes en la antigüedad, quien demostró que el volumen de una esfera equivale a dos tercios del volumen del cilindro que la circunscribe.")
        ),
        BilingualQuestion(
            id = 21826, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la conjecture de Goldbach ?", listOf("Tout nombre pair > 2 est somme de deux nombres premiers", "Il existe une infinité de jumeaux premiers", "P ≠ NP", "π est transcendant"), "Mathématiques", "Formulée en 1742 par Christian Goldbach dans une lettre à Euler, cette conjecture mathématique reste non démontrée à ce jour, bien qu'elle ait été vérifiée pour tous les nombres pairs jusqu'à 4×10^18."),
            en = LocalizedContent("What is Goldbach's conjecture?", listOf("Every even number > 2 is the sum of two primes", "There are infinitely many twin primes", "P ≠ NP", "π is transcendental"), "Mathematics", "Formulated in 1742 by Christian Goldbach in a letter to Euler, this mathematical conjecture remains unproven to this day, although it has been verified for all even numbers up to 4×10^18."),
            zh = LocalizedContent("什么是哥德巴赫猜想？", listOf("每个大于2的偶数都是两个质数之和", "存在无穷多对孪生质数", "P ≠ NP", "π是超越数"), "数学", "该猜想由克里斯蒂安·哥德巴赫在1742年写给欧拉的信中提出，至今仍未证明，尽管已验证了所有不超过4×10^18的偶数。"),
            es = LocalizedContent("¿Qué es la conjetura de Goldbach?", listOf("Todo número par > 2 es suma de dos números primos", "Existen infinitos primos gemelos", "P ≠ NP", "π es trascendente"), "Matemáticas", "Formulada en 1742 por Christian Goldbach en una carta a Euler, esta conjetura matemática sigue sin demostrarse hasta hoy, aunque se ha verificado para todos los números pares hasta 4×10^18.")
        ),
        BilingualQuestion(
            id = 21827, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien vaut cos(0) ?", listOf("1", "0", "-1", "π"), "Mathématiques", "Le cosinus de 0 degré (ou 0 radian) est égal à 1 car, sur le cercle trigonométrique, le point correspondant à cet angle a pour coordonnées (1, 0)."),
            en = LocalizedContent("What is cos(0)?", listOf("1", "0", "-1", "π"), "Mathematics", "The cosine of 0 degrees (or 0 radians) equals 1 because, on the unit circle, the point corresponding to this angle has coordinates (1, 0)."),
            zh = LocalizedContent("cos(0)等于多少？", listOf("1", "0", "-1", "π"), "数学", "0度（或0弧度）的余弦等于1，因为在单位圆上，该角度对应的点坐标为(1, 0)。"),
            es = LocalizedContent("¿Cuánto vale cos(0)?", listOf("1", "0", "-1", "π"), "Matemáticas", "El coseno de 0 grados (o 0 radianes) es igual a 1 porque, en el círculo trigonométrico, el punto correspondiente a este ángulo tiene coordenadas (1, 0).")
        ),
        BilingualQuestion(
            id = 21828, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une asymptote ?", listOf("Une droite dont une courbe se rapproche sans jamais l'atteindre", "Un type de triangle", "Une équation sans solution", "Un nombre irrationnel"), "Mathématiques", "En mathématiques, une asymptote est une droite que la courbe d'une fonction approche indéfiniment sans jamais la toucher, utilisée pour décrire le comportement limite d'une fonction à l'infini ou près d'un point."),
            en = LocalizedContent("What is an asymptote?", listOf("A line that a curve approaches but never reaches", "A type of triangle", "An equation with no solution", "An irrational number"), "Mathematics", "In mathematics, an asymptote is a line that the graph of a function approaches indefinitely without ever touching, used to describe the limiting behavior of a function at infinity or near a point."),
            zh = LocalizedContent("什么是渐近线？", listOf("一条曲线无限接近但永不触及的直线", "一种三角形", "一个无解的方程", "一个无理数"), "数学", "在数学中，渐近线是函数图像无限接近但永不触及的直线，用于描述函数在无穷远处或某点附近的行为。"),
            es = LocalizedContent("¿Qué es una asíntota?", listOf("Una recta a la que una curva se aproxima sin llegar a tocarla", "Un tipo de triángulo", "Una ecuación sin solución", "Un número irracional"), "Matemáticas", "En matemáticas, una asíntota es una recta a la que la gráfica de una función se aproxima indefinidamente sin tocarla, utilizada para describir el comportamiento límite de una función en el infinito o cerca de un punto.")
        ),
        BilingualQuestion(
            id = 21829, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole de l'infini en mathématiques ?", listOf("∞", "Ω", "Σ", "∆"), "Mathématiques", "Le symbole ∞, appelé lemniscate, a été introduit par le mathématicien John Wallis en 1655. Il représente un concept d'une quantité sans limite."),
            en = LocalizedContent("What is the symbol for infinity in mathematics?", listOf("∞", "Ω", "Σ", "∆"), "Mathematics", "The symbol ∞, called the lemniscate, was introduced by mathematician John Wallis in 1655. It represents the concept of a quantity without limit."),
            zh = LocalizedContent("数学中无穷的符号是什么？", listOf("∞", "Ω", "Σ", "∆"), "数学", "符号∞，称为双纽线，由数学家约翰·沃利斯于1655年引入。它代表无限量的概念。"),
            es = LocalizedContent("¿Cuál es el símbolo del infinito en matemáticas?", listOf("∞", "Ω", "Σ", "∆"), "Matemáticas", "El símbolo ∞, llamado lemniscata, fue introducido por el matemático John Wallis en 1655. Representa el concepto de una cantidad sin límite.")
        ),
        BilingualQuestion(
            id = 30001, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est la capitale de la Thaïlande ?", listOf("Chiang Mai", "Bangkok", "Phuket", "Ayutthaya"), "Géographie", "Bangkok est la capitale et la ville la plus peuplée de Thaïlande, située dans le delta du fleuve Chao Phraya."),
            en = LocalizedContent("What is the capital of Thailand?", listOf("Chiang Mai", "Bangkok", "Phuket", "Ayutthaya"), "Geography", "Bangkok is the capital and most populous city of Thailand, located in the Chao Phraya River delta."),
            zh = LocalizedContent("泰国的首都是什么？", listOf("清迈", "曼谷", "普吉", "大城"), "地理", "曼谷是泰国的首都和人口最多的城市，位于湄南河三角洲。"),
            es = LocalizedContent("¿Cuál es la capital de Tailandia?", listOf("Chiang Mai", "Bangkok", "Phuket", "Ayutthaya"), "Geografía", "Bangkok es la capital y la ciudad más poblada de Tailandia, situada en el delta del río Chao Phraya.")
        ),
        BilingualQuestion(
            id = 30002, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel continent se trouve la Namibie ?", listOf("Asie", "Océanie", "Afrique", "Amérique du Sud"), "Géographie", "La Namibie est un pays situé sur la côte sud-ouest de l'Afrique, bordé par l'océan Atlantique."),
            en = LocalizedContent("On which continent is Namibia located?", listOf("Asia", "Oceania", "Africa", "South America"), "Geography", "Namibia is a country on the southwestern coast of Africa, bordered by the Atlantic Ocean."),
            zh = LocalizedContent("纳米比亚位于哪个洲？", listOf("亚洲", "大洋洲", "非洲", "南美洲"), "地理", "纳米比亚是非洲西南海岸的一个国家，濒临大西洋。"),
            es = LocalizedContent("¿En qué continente se encuentra Namibia?", listOf("Asia", "Oceanía", "África", "América del Sur"), "Geografía", "Namibia es un país en la costa suroeste de África, bañado por el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 30003, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel océan sépare l'Afrique de l'Australie ?", listOf("Océan Atlantique", "Océan Indien", "Océan Pacifique", "Océan Arctique"), "Géographie", "L'océan Indien est le troisième plus grand océan du monde et baigne les côtes orientales de l'Afrique ainsi que les côtes occidentales de l'Australie."),
            en = LocalizedContent("Which ocean separates Africa from Australia?", listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"), "Geography", "The Indian Ocean is the third largest ocean in the world and borders the eastern coast of Africa and the western coast of Australia."),
            zh = LocalizedContent("哪个大洋分隔非洲和澳大利亚？", listOf("大西洋", "印度洋", "太平洋", "北冰洋"), "地理", "印度洋是世界第三大洋，濒临非洲东海岸和澳大利亚西海岸。"),
            es = LocalizedContent("¿Qué océano separa África de Australia?", listOf("Océano Atlántico", "Océano Índico", "Océano Pacífico", "Océano Ártico"), "Geografía", "El océano Índico es el tercer océano más grande del mundo y baña las costas orientales de África y las costas occidentales de Australia.")
        ),
        BilingualQuestion(
            id = 30004, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La Nouvelle-Zélande est composée de combien de grandes îles ?", listOf("Une", "Deux", "Trois", "Quatre"), "Géographie", "La Nouvelle-Zélande est principalement constituée de deux grandes îles : l'île du Nord et l'île du Sud, séparées par le détroit de Cook."),
            en = LocalizedContent("How many main islands make up New Zealand?", listOf("One", "Two", "Three", "Four"), "Geography", "New Zealand consists mainly of two large islands: the North Island and the South Island, separated by the Cook Strait."),
            zh = LocalizedContent("新西兰由几个主要岛屿组成？", listOf("一个", "两个", "三个", "四个"), "地理", "新西兰主要由两个大岛组成：北岛和南岛，由库克海峡分隔。"),
            es = LocalizedContent("¿De cuántas islas principales se compone Nueva Zelanda?", listOf("Una", "Dos", "Tres", "Cuatro"), "Geografía", "Nueva Zelanda se compone principalmente de dos grandes islas: la isla del Norte y la isla del Sur, separadas por el estrecho de Cook.")
        ),
        BilingualQuestion(
            id = 30005, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel désert est le plus grand du monde ?", listOf("Kalahari", "Gobi", "Antarctique", "Sahara"), "Géographie", "L'Antarctique est considéré comme le plus grand désert du monde car il reçoit très peu de précipitations, moins de 50 mm par an, ce qui correspond à la définition d'un désert."),
            en = LocalizedContent("Which desert is the largest in the world?", listOf("Kalahari", "Gobi", "Antarctic", "Sahara"), "Geography", "Antarctica is considered the largest desert in the world because it receives very little precipitation, less than 50 mm per year, which fits the definition of a desert."),
            zh = LocalizedContent("世界上最大的沙漠是哪个？", listOf("卡拉哈里沙漠", "戈壁沙漠", "南极洲", "撒哈拉沙漠"), "地理", "南极洲被认为是世界上最大的沙漠，因为它降水量极少，每年不足50毫米，符合沙漠的定义。"),
            es = LocalizedContent("¿Cuál es el desierto más grande del mundo?", listOf("Kalahari", "Gobi", "Antártida", "Sahara"), "Geografía", "La Antártida es considerada el desierto más grande del mundo porque recibe muy poca precipitación, menos de 50 mm al año, lo que corresponde a la definición de desierto.")
        ),
        BilingualQuestion(
            id = 30006, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale des Pays-Bas ?", listOf("Rotterdam", "Amsterdam", "La Haye", "Utrecht"), "Géographie", "Amsterdam est la capitale constitutionnelle des Pays-Bas, bien que le gouvernement et le parlement siègent à La Haye."),
            en = LocalizedContent("What is the capital of the Netherlands?", listOf("Rotterdam", "Amsterdam", "The Hague", "Utrecht"), "Geography", "Amsterdam is the constitutional capital of the Netherlands, although the government and parliament are seated in The Hague."),
            zh = LocalizedContent("荷兰的首都是哪里？", listOf("鹿特丹", "阿姆斯特丹", "海牙", "乌得勒支"), "地理", "阿姆斯特丹是荷兰的宪法首都，尽管政府和议会设在海牙。"),
            es = LocalizedContent("¿Cuál es la capital de los Países Bajos?", listOf("Róterdam", "Ámsterdam", "La Haya", "Utrecht"), "Geografía", "Ámsterdam es la capital constitucional de los Países Bajos, aunque el gobierno y el parlamento tienen su sede en La Haya.")
        ),
        BilingualQuestion(
            id = 30007, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays se trouve le Kilimandjaro ?", listOf("Kenya", "Ouganda", "Tanzanie", "Zambie"), "Géographie", "Le Kilimandjaro, plus haut sommet d'Afrique, est situé dans le nord-est de la Tanzanie, près de la frontière avec le Kenya."),
            en = LocalizedContent("In which country is Mount Kilimanjaro located?", listOf("Kenya", "Uganda", "Tanzania", "Zambia"), "Geography", "Mount Kilimanjaro, the highest peak in Africa, is located in northeastern Tanzania, near the border with Kenya."),
            zh = LocalizedContent("乞力马扎罗山位于哪个国家？", listOf("肯尼亚", "乌干达", "坦桑尼亚", "赞比亚"), "地理", "乞力马扎罗山是非洲最高峰，位于坦桑尼亚东北部，靠近肯尼亚边境。"),
            es = LocalizedContent("¿En qué país se encuentra el Kilimanjaro?", listOf("Kenia", "Uganda", "Tanzania", "Zambia"), "Geografía", "El Kilimanjaro, la cumbre más alta de África, se encuentra en el noreste de Tanzania, cerca de la frontera con Kenia.")
        ),
        BilingualQuestion(
            id = 30009, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le fleuve Zambèze est le plus important de quel continent ?", listOf("Asie", "Afrique", "Amérique du Sud", "Europe"), "Géographie", "Le Zambèze traverse plusieurs pays d'Afrique australe, dont la Zambie et le Zimbabwe, et se jette dans l'océan Indien. C'est le quatrième plus long fleuve du continent."),
            en = LocalizedContent("The Zambezi River is the most important river on which continent?", listOf("Asia", "Africa", "South America", "Europe"), "Geography", "The Zambezi flows through several countries in southern Africa, including Zambia and Zimbabwe, and empties into the Indian Ocean. It is the fourth longest river on the continent."),
            zh = LocalizedContent("赞比西河是哪个大陆最重要的河流？", listOf("亚洲", "非洲", "南美洲", "欧洲"), "地理", "赞比西河流经非洲南部的多个国家，包括赞比亚和津巴布韦，注入印度洋。它是非洲第四长河。"),
            es = LocalizedContent("El río Zambeze es el más importante de ¿qué continente?", listOf("Asia", "África", "América del Sur", "Europa"), "Geografía", "El Zambeze atraviesa varios países del sur de África, incluyendo Zambia y Zimbabue, y desemboca en el océano Índico. Es el cuarto río más largo del continente.")
        ),
        BilingualQuestion(
            id = 30010, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays possède le plus grand nombre de lacs au monde ?", listOf("Suède", "Finlande", "Canada", "Norvège"), "Géographie", "Le Canada compte environ 60 % des lacs mondiaux, soit plus de 2 millions, en raison de son histoire glaciaire et de son vaste territoire."),
            en = LocalizedContent("Which country has the largest number of lakes in the world?", listOf("Sweden", "Finland", "Canada", "Norway"), "Geography", "Canada has about 60% of the world's lakes, over 2 million, due to its glacial history and vast territory."),
            zh = LocalizedContent("哪个国家拥有世界上最多的湖泊？", listOf("瑞典", "芬兰", "加拿大", "挪威"), "地理", "加拿大拥有全球约60%的湖泊，超过200万个，这得益于其冰川历史和广阔领土。"),
            es = LocalizedContent("¿Qué país posee el mayor número de lagos del mundo?", listOf("Suecia", "Finlandia", "Canadá", "Noruega"), "Geografía", "Canadá cuenta con aproximadamente el 60% de los lagos del mundo, más de 2 millones, debido a su historia glacial y su vasto territorio.")
        ),
        BilingualQuestion(
            id = 30011, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année la Singapour s'est-elle indépendante de la Malaisie ?", listOf("1963", "1965", "1967", "1970"), "Géographie", "Singapour a été expulsée de la Malaisie le 9 août 1965, devenant ainsi une république indépendante en raison de divergences politiques et économiques."),
            en = LocalizedContent("In which year did Singapore become independent from Malaysia?", listOf("1963", "1965", "1967", "1970"), "Geography", "Singapore was expelled from Malaysia on August 9, 1965, becoming an independent republic due to political and economic differences."),
            zh = LocalizedContent("新加坡在哪一年脱离马来西亚独立？", listOf("1963", "1965", "1967", "1970"), "地理", "新加坡于1965年8月9日被马来西亚驱逐，因政治和经济分歧而成为独立共和国。"),
            es = LocalizedContent("¿En qué año Singapur se independizó de Malasia?", listOf("1963", "1965", "1967", "1970"), "Geografía", "Singapur fue expulsada de Malasia el 9 de agosto de 1965, convirtiéndose en una república independiente debido a diferencias políticas y económicas.")
        ),
        BilingualQuestion(
            id = 30012, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel détroit sépare l'Espagne du Maroc ?", listOf("Détroit de Béring", "Détroit de Gibraltar", "Canal de Suez", "Détroit de Malacca"), "Géographie", "Le détroit de Gibraltar relie la mer Méditerranée à l'océan Atlantique et marque la frontière naturelle entre l'Europe et l'Afrique, séparant l'Espagne au nord du Maroc au sud."),
            en = LocalizedContent("Which strait separates Spain from Morocco?", listOf("Bering Strait", "Strait of Gibraltar", "Suez Canal", "Strait of Malacca"), "Geography", "The Strait of Gibraltar connects the Mediterranean Sea to the Atlantic Ocean and marks the natural border between Europe and Africa, separating Spain to the north from Morocco to the south."),
            zh = LocalizedContent("哪个海峡分隔了西班牙和摩洛哥？", listOf("白令海峡", "直布罗陀海峡", "苏伊士运河", "马六甲海峡"), "地理", "直布罗陀海峡连接地中海和大西洋，是欧洲和非洲之间的天然边界，北边是西班牙，南边是摩洛哥。"),
            es = LocalizedContent("¿Qué estrecho separa España de Marruecos?", listOf("Estrecho de Bering", "Estrecho de Gibraltar", "Canal de Suez", "Estrecho de Malaca"), "Geografía", "El estrecho de Gibraltar conecta el mar Mediterráneo con el océano Atlántico y marca la frontera natural entre Europa y África, separando España al norte de Marruecos al sur.")
        ),
        BilingualQuestion(
            id = 30013, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le second plus grand désert du monde après l'Antarctique ?", listOf("Sahara", "Arabie", "Atacama", "Gobi"), "Géographie", "Le désert d'Arabie s'étend sur environ 2,3 millions de km², ce qui en fait le deuxième plus grand désert chaud du monde après le Sahara, mais derrière l'Antarctique en termes de superficie totale."),
            en = LocalizedContent("What is the second largest desert in the world after Antarctica?", listOf("Sahara", "Arabian", "Atacama", "Gobi"), "Geography", "The Arabian Desert covers about 2.3 million km², making it the second largest hot desert in the world after the Sahara, but behind Antarctica in total area."),
            zh = LocalizedContent("仅次于南极洲的世界第二大沙漠是什么？", listOf("撒哈拉沙漠", "阿拉伯沙漠", "阿塔卡马沙漠", "戈壁沙漠"), "地理", "阿拉伯沙漠面积约230万平方公里，是世界上第二大热带沙漠，仅次于撒哈拉沙漠，但总面积小于南极洲。"),
            es = LocalizedContent("¿Cuál es el segundo desierto más grande del mundo después de la Antártida?", listOf("Sahara", "Arábigo", "Atacama", "Gobi"), "Geografía", "El desierto de Arabia se extiende sobre aproximadamente 2,3 millones de km², lo que lo convierte en el segundo desierto cálido más grande del mundo después del Sahara, pero detrás de la Antártida en superficie total.")
        ),
        BilingualQuestion(
            id = 30014, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel continent se trouve la Mongolie ?", listOf("Afrique", "Asie", "Europe", "Océanie"), "Géographie", "La Mongolie est située en Asie centrale, entre la Russie et la Chine."),
            en = LocalizedContent("On which continent is Mongolia located?", listOf("Africa", "Asia", "Europe", "Oceania"), "Geography", "Mongolia is located in Central Asia, between Russia and China."),
            zh = LocalizedContent("蒙古位于哪个大陆？", listOf("非洲", "亚洲", "欧洲", "大洋洲"), "地理", "蒙古位于亚洲中部，介于俄罗斯和中国之间。"),
            es = LocalizedContent("¿En qué continente se encuentra Mongolia?", listOf("África", "Asia", "Europa", "Oceanía"), "Geografía", "Mongolia está situada en Asia central, entre Rusia y China.")
        ),
        BilingualQuestion(
            id = 30015, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le fleuve Danube traverse combien de pays ?", listOf("8", "10", "12", "15"), "Géographie", "Le Danube traverse 12 pays d'Europe centrale et orientale, de l'Allemagne à la mer Noire, ce qui en fait le fleuve le plus international du monde."),
            en = LocalizedContent("How many countries does the Danube River flow through?", listOf("8", "10", "12", "15"), "Geography", "The Danube flows through 12 countries in Central and Eastern Europe, from Germany to the Black Sea, making it the most international river in the world."),
            zh = LocalizedContent("多瑙河流经多少个国家？", listOf("8", "10", "12", "15"), "地理", "多瑙河流经中欧和东欧的12个国家，从德国到黑海，是世界上最国际化的河流。"),
            es = LocalizedContent("¿Cuántos países atraviesa el río Danubio?", listOf("8", "10", "12", "15"), "Geografía", "El Danubio atraviesa 12 países de Europa central y oriental, desde Alemania hasta el mar Negro, lo que lo convierte en el río más internacional del mundo.")
        ),
        BilingualQuestion(
            id = 30017, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année les Îles Malouines ont-elles fait l'objet d'une guerre entre l'Argentine et la Royaume-Uni ?", listOf("1980", "1982", "1984", "1986"), "Géographie", "La guerre des Malouines a opposé l'Argentine au Royaume-Uni en 1982, suite à l'invasion argentine de l'archipel le 2 avril, et s'est conclue par la reddition argentine le 14 juin."),
            en = LocalizedContent("In which year did the Falkland Islands become the subject of a war between Argentina and the United Kingdom?", listOf("1980", "1982", "1984", "1986"), "Geography", "The Falklands War was fought between Argentina and the United Kingdom in 1982, following the Argentine invasion of the archipelago on April 2, and ended with the Argentine surrender on June 14."),
            zh = LocalizedContent("福克兰群岛在哪一年成为阿根廷和英国之间战争的对象？", listOf("1980", "1982", "1984", "1986"), "地理", "福克兰群岛战争于1982年在阿根廷和英国之间爆发，起因是阿根廷于4月2日入侵该群岛，最终于6月14日阿根廷投降结束。"),
            es = LocalizedContent("¿En qué año las Islas Malvinas fueron objeto de una guerra entre Argentina y el Reino Unido?", listOf("1980", "1982", "1984", "1986"), "Geografia", "La Guerra de las Malvinas enfrentó a Argentina y el Reino Unido en 1982, tras la invasión argentina del archipiélago el 2 de abril, y concluyó con la rendición argentina el 14 de junio.")
        ),
        BilingualQuestion(
            id = 30019, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Caucase est une chaîne montagneuse partagée par combien de pays ?", listOf("3", "4", "5", "6"), "Géographie", "Le Caucase s'étend sur six pays : la Russie, la Géorgie, l'Arménie, l'Azerbaïdjan, la Turquie et l'Iran."),
            en = LocalizedContent("The Caucasus is a mountain range shared by how many countries?", listOf("3", "4", "5", "6"), "Geography", "The Caucasus spans six countries: Russia, Georgia, Armenia, Azerbaijan, Turkey, and Iran."),
            zh = LocalizedContent("高加索山脉由多少个国家共享？", listOf("3", "4", "5", "6"), "地理", "高加索山脉横跨六个国家：俄罗斯、格鲁吉亚、亚美尼亚、阿塞拜疆、土耳其和伊朗。"),
            es = LocalizedContent("El Cáucaso es una cadena montañosa compartida por ¿cuántos países?", listOf("3", "4", "5", "6"), "Geografia", "El Cáucaso se extiende por seis países: Rusia, Georgia, Armenia, Azerbaiyán, Turquía e Irán.")
        ),
        BilingualQuestion(
            id = 30020, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pays possède les plus long côtes au monde ?", listOf("Suède", "Japon", "Canada", "Finlande"), "Géographie", "Le Canada possède le plus long littoral du monde, s'étendant sur environ 202 080 kilomètres, en raison de ses nombreuses îles et de ses côtes très découpées."),
            en = LocalizedContent("Which country has the longest coastline in the world?", listOf("Sweden", "Japan", "Canada", "Finland"), "Geography", "Canada has the longest coastline in the world, stretching approximately 202,080 kilometers, due to its numerous islands and highly indented coasts."),
            zh = LocalizedContent("哪个国家拥有世界上最长的海岸线？", listOf("瑞典", "日本", "加拿大", "芬兰"), "地理", "加拿大拥有世界上最长的海岸线，长约202,080公里，因其众多岛屿和曲折的海岸线。"),
            es = LocalizedContent("¿Qué país tiene la costa más larga del mundo?", listOf("Suecia", "Japón", "Canadá", "Finlandia"), "Geografia", "Canadá tiene la costa más larga del mundo, con aproximadamente 202,080 kilómetros, debido a sus numerosas islas y costas muy recortadas.")
        ),
        BilingualQuestion(
            id = 30021, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le point de confluence entre le Tigre et l'Euphrate ?", listOf("Bagdad", "Le Chatt-el-Arab", "Ctésiphon", "Samara"), "Géographie", "Le Chatt-el-Arab est le fleuve formé par la réunion du Tigre et de l'Euphrate dans le sud de l'Irak, avant de se jeter dans le golfe Persique."),
            en = LocalizedContent("What is the confluence point of the Tigris and Euphrates?", listOf("Baghdad", "Shatt al-Arab", "Ctesiphon", "Samarra"), "Geography", "The Shatt al-Arab is the river formed by the confluence of the Tigris and Euphrates in southern Iraq, before flowing into the Persian Gulf."),
            zh = LocalizedContent("底格里斯河和幼发拉底河的汇合点是什么？", listOf("巴格达", "阿拉伯河", "泰西封", "萨迈拉"), "地理", "阿拉伯河是由底格里斯河和幼发拉底河在伊拉克南部汇合形成的河流，然后注入波斯湾。"),
            es = LocalizedContent("¿Cuál es el punto de confluencia entre el Tigris y el Éufrates?", listOf("Bagdad", "Shatt al-Arab", "Ctesifonte", "Samarra"), "Geografia", "El Shatt al-Arab es el río formado por la unión del Tigris y el Éufrates en el sur de Irak, antes de desembocar en el golfo Pérsico.")
        ),
        BilingualQuestion(
            id = 30022, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("La Mélanésie comprend quels archipels et pays ?", listOf("Fidji, Vanuatu, Îles Salomon, Papouasie-Nouvelle-Guinée", "Samoa, Tonga, Kiribati", "Palau, Micronésie, Marshalls", "Polynésie française, Cook, Tuvalu"), "Géographie", "La Mélanésie est une région du Pacifique Sud dont le nom signifie « îles noires » en référence à la peau de ses habitants. Elle regroupe notamment la Papouasie-Nouvelle-Guinée, les Îles Salomon, Vanuatu et Fidji."),
            en = LocalizedContent("Melanesia includes which archipelagos and countries?", listOf("Fiji, Vanuatu, Solomon Islands, Papua New Guinea", "Samoa, Tonga, Kiribati", "Palau, Micronesia, Marshall Islands", "French Polynesia, Cook Islands, Tuvalu"), "Geography", "Melanesia is a region in the South Pacific whose name means 'black islands' referring to the skin color of its inhabitants. It notably includes Papua New Guinea, Solomon Islands, Vanuatu, and Fiji."),
            zh = LocalizedContent("美拉尼西亚包括哪些群岛和国家？", listOf("斐济、瓦努阿图、所罗门群岛、巴布亚新几内亚", "萨摩亚、汤加、基里巴斯", "帕劳、密克罗尼西亚、马绍尔群岛", "法属波利尼西亚、库克群岛、图瓦卢"), "地理", "美拉尼西亚是南太平洋的一个地区，其名称意为“黑岛”，指当地居民的肤色。主要包括巴布亚新几内亚、所罗门群岛、瓦努阿图和斐济。"),
            es = LocalizedContent("Melanesia incluye ¿qué archipiélagos y países?", listOf("Fiyi, Vanuatu, Islas Salomón, Papúa Nueva Guinea", "Samoa, Tonga, Kiribati", "Palaos, Micronesia, Islas Marshall", "Polinesia Francesa, Islas Cook, Tuvalu"), "Geografia", "Melanesia es una región del Pacífico Sur cuyo nombre significa 'islas negras' en referencia al color de piel de sus habitantes. Incluye principalmente Papúa Nueva Guinea, Islas Salomón, Vanuatu y Fiyi.")
        ),
        BilingualQuestion(
            id = 30023, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le point le plus profond de l'océan Pacifique ?", listOf("Fosse des Aléoutiennes", "Fosse de Kuril-Kamtchatka", "Fosse de Mariannes", "Fosse du Pérou"), "Géographie", "La fosse des Mariannes, située dans l'ouest de l'océan Pacifique, atteint environ 11 034 mètres de profondeur à son point le plus bas, appelé le Challenger Deep."),
            en = LocalizedContent("What is the deepest point in the Pacific Ocean?", listOf("Aleutian Trench", "Kuril-Kamchatka Trench", "Mariana Trench", "Peru Trench"), "Geography", "The Mariana Trench, located in the western Pacific Ocean, reaches approximately 11,034 meters deep at its lowest point, called the Challenger Deep."),
            zh = LocalizedContent("太平洋最深点是什么？", listOf("阿留申海沟", "千岛-堪察加海沟", "马里亚纳海沟", "秘鲁海沟"), "地理", "马里亚纳海沟位于西太平洋，其最深处挑战者深渊深约11,034米。"),
            es = LocalizedContent("¿Cuál es el punto más profundo del océano Pacífico?", listOf("Fosa de las Aleutianas", "Fosa de Kuril-Kamchatka", "Fosa de las Marianas", "Fosa del Perú"), "Geografia", "La fosa de las Marianas, situada en el oeste del océano Pacífico, alcanza aproximadamente 11,034 metros de profundidad en su punto más bajo, llamado el Abismo Challenger.")
        ),
        BilingualQuestion(
            id = 30024, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année la partition de l'Inde et du Pakistan a-t-elle eu lieu ?", listOf("1945", "1947", "1950", "1952"), "Géographie", "La partition de l'Inde et du Pakistan a eu lieu en 1947, marquant la fin de la domination britannique et la création de deux États indépendants."),
            en = LocalizedContent("In which year did the partition of India and Pakistan take place?", listOf("1945", "1947", "1950", "1952"), "Geography", "The partition of India and Pakistan took place in 1947, marking the end of British rule and the creation of two independent states."),
            zh = LocalizedContent("印度和巴基斯坦的分治发生在哪一年？", listOf("1945", "1947", "1950", "1952"), "地理", "印度和巴基斯坦的分治发生在1947年，标志着英国统治的结束和两个独立国家的建立。"),
            es = LocalizedContent("¿En qué año tuvo lugar la partición de India y Pakistán?", listOf("1945", "1947", "1950", "1952"), "Geografia", "La partición de India y Pakistán tuvo lugar en 1947, marcando el fin del dominio británico y la creación de dos estados independientes.")
        ),
        BilingualQuestion(
            id = 30025, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Le Caucasus est divisé en combien de sous-régions géographiques principales ?", listOf("Deux", "Trois", "Quatre", "Cinq"), "Géographie", "Le Caucase est traditionnellement divisé en trois sous-régions : le Caucase du Nord, le Caucase central et le Caucase du Sud, selon des critères géographiques et culturels."),
            en = LocalizedContent("The Caucasus is divided into how many main geographical sub-regions?", listOf("Two", "Three", "Four", "Five"), "Geography", "The Caucasus is traditionally divided into three sub-regions: the North Caucasus, the Central Caucasus, and the South Caucasus, based on geographical and cultural criteria."),
            zh = LocalizedContent("高加索地区分为多少个主要地理亚区？", listOf("两个", "三个", "四个", "五个"), "地理", "高加索地区传统上分为三个亚区：北高加索、中高加索和南高加索，依据地理和文化标准。"),
            es = LocalizedContent("El Cáucaso se divide en ¿cuántas subregiones geográficas principales?", listOf("Dos", "Tres", "Cuatro", "Cinco"), "Geografia", "El Cáucaso se divide tradicionalmente en tres subregiones: el Cáucaso Norte, el Cáucaso Central y el Cáucaso Sur, según criterios geográficos y culturales.")
        ),
        BilingualQuestion(
            id = 30026, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel sport pratique-t-on le cricket ?", listOf("Tennis", "Baseball", "Cricket est un sport à part entière", "Badminton"), "Sport", "Le cricket est un sport d'équipe avec ses propres règles, originaire d'Angleterre, et non une variante d'un autre sport."),
            en = LocalizedContent("In which sport is cricket played?", listOf("Tennis", "Baseball", "Cricket is a sport in its own right", "Badminton"), "Sports", "Cricket is a team sport with its own rules, originating in England, and not a variant of another sport."),
            zh = LocalizedContent("板球是在哪项运动中进行的？", listOf("网球", "棒球", "板球本身就是一项运动", "羽毛球"), "体育", "板球是一项有自己的规则的团队运动，起源于英格兰，并非其他运动的变体。"),
            es = LocalizedContent("¿En qué deporte se juega al críquet?", listOf("Tenis", "Béisbol", "El críquet es un deporte por derecho propio", "Bádminton"), "Deportes", "El críquet es un deporte de equipo con sus propias reglas, originario de Inglaterra, y no una variante de otro deporte.")
        ),
        BilingualQuestion(
            id = 30027, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a remporté la Coupe du Monde 2022 ?", listOf("France", "Argentine", "Brésil", "Allemagne"), "Sport", "L'Argentine a remporté la Coupe du Monde 2022 au Qatar en battant la France en finale aux tirs au but, offrant à Lionel Messi son premier titre mondial."),
            en = LocalizedContent("Which country won the 2022 World Cup?", listOf("France", "Argentina", "Brazil", "Germany"), "Sports", "Argentina won the 2022 World Cup in Qatar by defeating France in the final on penalties, giving Lionel Messi his first world title."),
            zh = LocalizedContent("哪个国家赢得了2022年世界杯？", listOf("法国", "阿根廷", "巴西", "德国"), "体育", "阿根廷在卡塔尔举行的2022年世界杯决赛中点球击败法国，夺得冠军，这是莱昂内尔·梅西的第一个世界杯冠军。"),
            es = LocalizedContent("¿Qué país ganó la Copa del Mundo 2022?", listOf("Francia", "Argentina", "Brasil", "Alemania"), "Deportes", "Argentina ganó la Copa del Mundo 2022 en Catar al vencer a Francia en la final por penaltis, otorgando a Lionel Messi su primer título mundial.")
        ),
        BilingualQuestion(
            id = 30028, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel année les premiers Jeux Olympiques modernes ont-ils eu lieu ?", listOf("1890", "1896", "1900", "1904"), "Sport", "Organisés par Pierre de Coubertin, les premiers Jeux Olympiques modernes se sont tenus à Athènes en 1896, marquant le renouveau de la tradition antique."),
            en = LocalizedContent("In what year did the first modern Olympic Games take place?", listOf("1890", "1896", "1900", "1904"), "Sports", "Organized by Pierre de Coubertin, the first modern Olympic Games were held in Athens in 1896, marking the revival of the ancient tradition."),
            zh = LocalizedContent("第一届现代奥运会在哪一年举行？", listOf("1890", "1896", "1900", "1904"), "体育", "由皮埃尔·德·顾拜旦组织，第一届现代奥运会于1896年在雅典举行，标志着古代传统的复兴。"),
            es = LocalizedContent("¿En qué año tuvieron lugar los primeros Juegos Olímpicos modernos?", listOf("1890", "1896", "1900", "1904"), "Deportes", "Organizados por Pierre de Coubertin, los primeros Juegos Olímpicos modernos se celebraron en Atenas en 1896, marcando el renacimiento de la tradición antigua.")
        ),
        BilingualQuestion(
            id = 30029, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport martial japonais se joue sur un tatami ?", listOf("Karaté", "Judo", "Kendo", "Taekwondo"), "Sport", "Le judo, comme le karaté ou l'aïkido, se pratique sur un tatami, un tapis de sol traditionnel qui amortit les chutes et délimite l'aire de combat."),
            en = LocalizedContent("Which Japanese martial art is played on a tatami?", listOf("Karate", "Judo", "Kendo", "Taekwondo"), "Sports", "Judo, like karate or aikido, is practiced on a tatami, a traditional floor mat that cushions falls and defines the combat area."),
            zh = LocalizedContent("哪种日本武术在榻榻米上进行？", listOf("空手道", "柔道", "剑道", "跆拳道"), "体育", "柔道，如同空手道或合气道，在榻榻米上进行，这是一种传统地垫，用于缓冲摔倒并界定比赛区域。"),
            es = LocalizedContent("¿Qué arte marcial japonés se practica sobre un tatami?", listOf("Kárate", "Judo", "Kendo", "Taekwondo"), "Deportes", "El judo, al igual que el kárate o el aikido, se practica sobre un tatami, una estera tradicional que amortigua las caídas y delimita el área de combate.")
        ),
        BilingualQuestion(
            id = 30030, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de sets faut-il gagner pour remporter un match de tennis en Grand Chelem ?", listOf("Un", "Deux", "Trois", "Quatre"), "Sport", "Dans les tournois du Grand Chelem, les matchs masculins se jouent au meilleur des cinq sets, tandis que les matchs féminins se jouent au meilleur des trois sets. Il faut donc gagner trois sets pour remporter un match masculin."),
            en = LocalizedContent("How many sets must you win to win a tennis match in a Grand Slam?", listOf("One", "Two", "Three", "Four"), "Sports", "In Grand Slam tournaments, men's matches are best of five sets, while women's matches are best of three sets. Therefore, you need to win three sets to win a men's match."),
            zh = LocalizedContent("在大满贯网球比赛中，需要赢多少盘才能赢得比赛？", listOf("一盘", "两盘", "三盘", "四盘"), "体育", "在大满贯赛事中，男子比赛采用五盘三胜制，而女子比赛采用三盘两胜制。因此，男子比赛需要赢三盘才能获胜。"),
            es = LocalizedContent("¿Cuántos sets hay que ganar para ganar un partido de tenis en un Grand Slam?", listOf("Uno", "Dos", "Tres", "Cuatro"), "Deportes", "En los torneos de Grand Slam, los partidos masculinos se juegan al mejor de cinco sets, mientras que los femeninos al mejor de tres. Por lo tanto, hay que ganar tres sets para ganar un partido masculino.")
        ),
        BilingualQuestion(
            id = 30031, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays se déroule le tournoi de Wimbledon ?", listOf("États-Unis", "France", "Royaume-Uni", "Australie"), "Sport", "Wimbledon se déroule à Londres, au Royaume-Uni, depuis 1877. C'est le plus ancien tournoi de tennis au monde."),
            en = LocalizedContent("In which country does the Wimbledon tournament take place?", listOf("United States", "France", "United Kingdom", "Australia"), "Sports", "Wimbledon takes place in London, United Kingdom, since 1877. It is the oldest tennis tournament in the world."),
            zh = LocalizedContent("温布尔登网球锦标赛在哪个国家举行？", listOf("美国", "法国", "英国", "澳大利亚"), "体育", "温布尔登自1877年起在英国伦敦举行。它是世界上最古老的网球赛事。"),
            es = LocalizedContent("¿En qué país se celebra el torneo de Wimbledon?", listOf("Estados Unidos", "Francia", "Reino Unido", "Australia"), "Deportes", "Wimbledon se celebra en Londres, Reino Unido, desde 1877. Es el torneo de tenis más antiguo del mundo.")
        ),
        BilingualQuestion(
            id = 30032, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport traditionnel japonais met en scène des lutteurs géants appelés rikishi ?", listOf("Karaté", "Sumo", "Kendo", "Judo"), "Sport", "Le sumo est un sport de combat rituel japonais où des lutteurs de très forte corpulence, les rikishi, s'affrontent dans un cercle de terre battue."),
            en = LocalizedContent("Which traditional Japanese sport features giant wrestlers called rikishi?", listOf("Karate", "Sumo", "Kendo", "Judo"), "Sports", "Sumo is a Japanese ritual combat sport where very large wrestlers, called rikishi, compete in a circle of clay."),
            zh = LocalizedContent("哪种日本传统体育项目以被称为力士的巨型摔跤手为特色？", listOf("空手道", "相扑", "剑道", "柔道"), "体育", "相扑是一种日本仪式性格斗运动，体型巨大的摔跤手（称为力士）在一个土俵圈内进行比赛。"),
            es = LocalizedContent("¿Qué deporte tradicional japonés presenta luchadores gigantes llamados rikishi?", listOf("Kárate", "Sumo", "Kendo", "Judo"), "Deportes", "El sumo es un deporte de combate ritual japonés donde luchadores de gran corpulencia, los rikishi, compiten en un círculo de arcilla.")
        ),
        BilingualQuestion(
            id = 30033, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année le football a-t-il été intégré aux Jeux Olympiques modernes ?", listOf("1900", "1908", "1920", "1936"), "Sport", "Le football masculin a été intégré aux Jeux Olympiques modernes en 1900, mais en tant que sport de démonstration. Il est devenu une compétition officielle avec médailles à partir des Jeux d'Anvers en 1920."),
            en = LocalizedContent("In what year was football introduced to the modern Olympic Games?", listOf("1900", "1908", "1920", "1936"), "Sports", "Men's football was introduced to the modern Olympic Games in 1900 as a demonstration sport. It became an official medal event starting with the Antwerp Games in 1920."),
            zh = LocalizedContent("足球在哪一年被引入现代奥运会？", listOf("1900", "1908", "1920", "1936"), "体育", "男子足球于1900年作为表演项目被引入现代奥运会。从1920年安特卫普奥运会开始，它成为正式的奖牌项目。"),
            es = LocalizedContent("¿En qué año se introdujo el fútbol en los Juegos Olímpicos modernos?", listOf("1900", "1908", "1920", "1936"), "Deportes", "El fútbol masculino se introdujo en los Juegos Olímpicos modernos en 1900 como deporte de demostración. Se convirtió en un evento oficial con medallas a partir de los Juegos de Amberes en 1920.")
        ),
        BilingualQuestion(
            id = 30035, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel lutteur de WWE est devenu acteur à Hollywood ?", listOf("John Cena", "Dwayne \"The Rock\" Johnson", "les deux", "Aucun des deux"), "Sport", "Dwayne Johnson (The Rock) et John Cena sont les deux lutteurs WWE les plus célèbres à avoir réussi une carrière d'acteur à Hollywood, avec des rôles majeurs dans des films à succès."),
            en = LocalizedContent("Which WWE wrestler became an actor in Hollywood?", listOf("John Cena", "Dwayne \"The Rock\" Johnson", "Both", "Neither"), "Sports", "Dwayne Johnson (The Rock) and John Cena are the two most famous WWE wrestlers to have successfully pursued acting careers in Hollywood, with major roles in blockbuster films."),
            zh = LocalizedContent("哪位WWE摔跤手成为了好莱坞演员？", listOf("约翰·塞纳", "道恩·强森（\"巨石\"）", "两者都是", "两者都不是"), "体育", "道恩·强森（巨石）和约翰·塞纳是两位最著名的WWE摔跤手，成功在好莱坞发展了演艺事业，并在大片中担任主要角色。"),
            es = LocalizedContent("¿Qué luchador de la WWE se convirtió en actor en Hollywood?", listOf("John Cena", "Dwayne \"The Rock\" Johnson", "Ambos", "Ninguno"), "Deportes", "Dwayne Johnson (The Rock) y John Cena son los dos luchadores de la WWE más famosos que han tenido éxito como actores en Hollywood, con papeles principales en películas taquilleras.")
        ),
        BilingualQuestion(
            id = 30036, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Cristiano Ronaldo a-t-il remporté son cinquième Ballon d'Or ?", listOf("2017", "2018", "2019", "2020"), "Sport", "Cristiano Ronaldo a remporté son cinquième Ballon d'Or en 2019, égalant alors le record de Lionel Messi. Il a été récompensé pour ses performances avec la Juventus et le Portugal."),
            en = LocalizedContent("In what year did Cristiano Ronaldo win his fifth Ballon d'Or?", listOf("2017", "2018", "2019", "2020"), "Sports", "Cristiano Ronaldo won his fifth Ballon d'Or in 2019, equaling Lionel Messi's record at the time. He was awarded for his performances with Juventus and Portugal."),
            zh = LocalizedContent("克里斯蒂亚诺·罗纳尔多在哪一年赢得了他的第五个金球奖？", listOf("2017", "2018", "2019", "2020"), "体育", "克里斯蒂亚诺·罗纳尔多在2019年赢得了他的第五个金球奖，当时追平了莱昂内尔·梅西的纪录。他因在尤文图斯和葡萄牙队的表现而获奖。"),
            es = LocalizedContent("¿En qué año ganó Cristiano Ronaldo su quinto Balón de Oro?", listOf("2017", "2018", "2019", "2020"), "Deportes", "Cristiano Ronaldo ganó su quinto Balón de Oro en 2019, igualando entonces el récord de Lionel Messi. Fue premiado por sus actuaciones con la Juventus y Portugal.")
        ),
        BilingualQuestion(
            id = 30037, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays domine le badminton moderne avec le plus de champions olympiques ?", listOf("Malaisie", "Indonésie", "Chine", "Danemark"), "Sport", "La Chine domine le badminton olympique grâce à un système d'entraînement rigoureux et une culture sportive forte, totalisant le plus grand nombre de médailles d'or dans cette discipline depuis son introduction aux Jeux en 1992."),
            en = LocalizedContent("Which country dominates modern badminton with the most Olympic champions?", listOf("Malaysia", "Indonesia", "China", "Denmark"), "Sports", "China dominates Olympic badminton thanks to a rigorous training system and strong sports culture, holding the most gold medals in this discipline since its introduction to the Games in 1992."),
            zh = LocalizedContent("哪个国家在现代羽毛球项目中拥有最多的奥运冠军？", listOf("马来西亚", "印度尼西亚", "中国", "丹麦"), "体育", "中国凭借严格的训练体系和强大的体育文化主导奥运羽毛球项目，自1992年该项目引入奥运会以来，获得了最多的金牌。"),
            es = LocalizedContent("¿Qué país domina el bádminton moderno con más campeones olímpicos?", listOf("Malasia", "Indonesia", "China", "Dinamarca"), "Deportes", "China domina el bádminton olímpico gracias a un riguroso sistema de entrenamiento y una fuerte cultura deportiva, acumulando la mayor cantidad de medallas de oro en esta disciplina desde su introducción en los Juegos en 1992.")
        ),
        BilingualQuestion(
            id = 30038, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année le premier Grand Prix de Formule 1 a-t-il eu lieu ?", listOf("1946", "1950", "1954", "1960"), "Sport", "Le premier championnat du monde de Formule 1 a été organisé par la FIA en 1950, avec le Grand Prix de Grande-Bretagne à Silverstone comme course inaugurale le 13 mai."),
            en = LocalizedContent("In what year did the first Formula 1 Grand Prix take place?", listOf("1946", "1950", "1954", "1960"), "Sports", "The first Formula 1 World Championship was organized by the FIA in 1950, with the British Grand Prix at Silverstone as the inaugural race on May 13."),
            zh = LocalizedContent("第一届一级方程式大奖赛在哪一年举行？", listOf("1946", "1950", "1954", "1960"), "体育", "第一届一级方程式世界锦标赛由国际汽联于1950年组织，以5月13日在银石赛道举行的英国大奖赛作为首场比赛。"),
            es = LocalizedContent("¿En qué año tuvo lugar el primer Gran Premio de Fórmula 1?", listOf("1946", "1950", "1954", "1960"), "Deportes", "El primer Campeonato Mundial de Fórmula 1 fue organizado por la FIA en 1950, con el Gran Premio de Gran Bretaña en Silverstone como carrera inaugural el 13 de mayo.")
        ),
        BilingualQuestion(
            id = 30039, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel boxeur a changé son nom en Muhammad Ali ?", listOf("Floyd Patterson", "Sonny Liston", "Cassius Clay", "Joe Frazier"), "Sport", "Cassius Clay a changé son nom pour Muhammad Ali après sa conversion à l'islam et son adhésion à la Nation of Islam en 1964."),
            en = LocalizedContent("Which boxer changed his name to Muhammad Ali?", listOf("Floyd Patterson", "Sonny Liston", "Cassius Clay", "Joe Frazier"), "Sports", "Cassius Clay changed his name to Muhammad Ali after his conversion to Islam and joining the Nation of Islam in 1964."),
            zh = LocalizedContent("哪位拳击手将名字改为穆罕默德·阿里？", listOf("弗洛伊德·帕特森", "索尼·利斯顿", "卡修斯·克莱", "乔·弗雷泽"), "体育", "卡修斯·克莱在1964年皈依伊斯兰教并加入伊斯兰民族组织后，将名字改为穆罕默德·阿里。"),
            es = LocalizedContent("¿Qué boxeador cambió su nombre a Muhammad Ali?", listOf("Floyd Patterson", "Sonny Liston", "Cassius Clay", "Joe Frazier"), "Deportes", "Cassius Clay cambió su nombre a Muhammad Ali después de su conversión al islam y su adhesión a la Nación del Islam en 1964.")
        ),
        BilingualQuestion(
            id = 30040, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année LeBron James a-t-il été drafté en NBA ?", listOf("2002", "2003", "2004", "2005"), "Sport", "LeBron James a été sélectionné en première position de la draft NBA en 2003 par les Cleveland Cavaliers, et non en 2004."),
            en = LocalizedContent("In what year was LeBron James drafted into the NBA?", listOf("2002", "2003", "2004", "2005"), "Sports", "LeBron James was selected first overall in the 2003 NBA draft by the Cleveland Cavaliers, not in 2004."),
            zh = LocalizedContent("勒布朗·詹姆斯在哪一年被NBA选中？", listOf("2002", "2003", "2004", "2005"), "体育", "勒布朗·詹姆斯在2003年NBA选秀中被克利夫兰骑士队以第一顺位选中，而非2004年。"),
            es = LocalizedContent("¿En qué año fue seleccionado LeBron James en el draft de la NBA?", listOf("2002", "2003", "2004", "2005"), "Deportes", "LeBron James fue seleccionado en la primera posición del draft de la NBA de 2003 por los Cleveland Cavaliers, no en 2004.")
        ),
        BilingualQuestion(
            id = 30041, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur de cricket indien est connu comme le \"Dieu du Cricket\" ?", listOf("Virat Kohli", "Sachin Tendulkar", "Anil Kumble", "Rohit Sharma"), "Sport", "Sachin Tendulkar est considéré comme le plus grand batteur de l'histoire du cricket, avec des records mondiaux exceptionnels et une carrière de 24 ans."),
            en = LocalizedContent("Which Indian cricketer is known as the \"God of Cricket\"?", listOf("Virat Kohli", "Sachin Tendulkar", "Anil Kumble", "Rohit Sharma"), "Sports", "Sachin Tendulkar is considered the greatest batsman in cricket history, with exceptional world records and a 24-year career."),
            zh = LocalizedContent("哪位印度板球运动员被称为“板球之神”？", listOf("维拉特·科利", "萨钦·坦杜尔卡", "阿尼尔·坎布尔", "罗希特·沙尔马"), "体育", "萨钦·坦杜尔卡被认为是板球史上最伟大的击球手，拥有非凡的世界纪录和24年的职业生涯。"),
            es = LocalizedContent("¿Qué jugador de críquet indio es conocido como el \"Dios del Críquet\"?", listOf("Virat Kohli", "Sachin Tendulkar", "Anil Kumble", "Rohit Sharma"), "Deportes", "Sachin Tendulkar es considerado el mejor bateador en la historia del críquet, con récords mundiales excepcionales y una carrera de 24 años.")
        ),
        BilingualQuestion(
            id = 30042, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année a eu lieu la première Coupe du Monde de cricket ?", listOf("1975", "1979", "1983", "1987"), "Sport", "La première Coupe du Monde de cricket s'est déroulée en Angleterre en 1975, sous le nom de Prudential Cup, avec huit équipes participantes."),
            en = LocalizedContent("In what year was the first Cricket World Cup held?", listOf("1975", "1979", "1983", "1987"), "Sports", "The first Cricket World Cup took place in England in 1975, called the Prudential Cup, with eight participating teams."),
            zh = LocalizedContent("第一届板球世界杯在哪一年举行？", listOf("1975", "1979", "1983", "1987"), "体育", "第一届板球世界杯于1975年在英格兰举行，名为保诚杯，共有八支参赛队伍。"),
            es = LocalizedContent("¿En qué año se celebró la primera Copa Mundial de Críquet?", listOf("1975", "1979", "1983", "1987"), "Deportes", "La primera Copa Mundial de Críquet se celebró en Inglaterra en 1975, bajo el nombre de Prudential Cup, con ocho equipos participantes.")
        ),
        BilingualQuestion(
            id = 30043, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel Grand Chelem de tennis est joué sur court en terre battue rouge ?", listOf("Wimbledon", "Open d'Australie", "Roland-Garros", "US Open"), "Sport", "Roland-Garros, aussi appelé Internationaux de France, est le seul tournoi du Grand Chelem à se disputer sur terre battue, une surface en brique pilée qui ralentit la balle et favorise les échanges longs."),
            en = LocalizedContent("Which tennis Grand Slam is played on red clay courts?", listOf("Wimbledon", "Australian Open", "Roland Garros", "US Open"), "Sports", "Roland Garros, also called the French Open, is the only Grand Slam tournament played on clay, a surface of crushed brick that slows the ball and favors long rallies."),
            zh = LocalizedContent("哪个网球大满贯赛事在红土球场上进行？", listOf("温布尔登", "澳大利亚公开赛", "罗兰·加洛斯", "美国公开赛"), "体育", "罗兰·加洛斯，又称法国网球公开赛，是唯一在红土上举行的大满贯赛事，这种由碎砖制成的表面会减慢球速，有利于长回合对打。"),
            es = LocalizedContent("¿Qué Grand Slam de tenis se juega en canchas de arcilla roja?", listOf("Wimbledon", "Abierto de Australia", "Roland Garros", "Abierto de Estados Unidos"), "Deportes", "Roland Garros, también llamado Abierto de Francia, es el único torneo del Grand Slam que se disputa en tierra batida, una superficie de ladrillo triturado que frena la pelota y favorece los intercambios largos.")
        ),
        BilingualQuestion(
            id = 30044, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année le tournament de Sumo le plus ancien a-t-il commencé ?", listOf("1909", "1925", "1950", "1960"), "Sport", "Le tournoi de sumo le plus ancien, le Grand Tournoi de Printemps à Osaka, a débuté en 1925, marquant le début des compétitions modernes organisées par l'Association japonaise de sumo."),
            en = LocalizedContent("In what year did the oldest sumo tournament begin?", listOf("1909", "1925", "1950", "1960"), "Sports", "The oldest sumo tournament, the Grand Spring Tournament in Osaka, began in 1925, marking the start of modern competitions organized by the Japan Sumo Association."),
            zh = LocalizedContent("最古老的相扑锦标赛在哪一年开始？", listOf("1909", "1925", "1950", "1960"), "体育", "最古老的相扑锦标赛——大阪春季大相扑比赛始于1925年，标志着由日本相扑协会组织的现代比赛的开端。"),
            es = LocalizedContent("¿En qué año comenzó el torneo de sumo más antiguo?", listOf("1909", "1925", "1950", "1960"), "Deportes", "El torneo de sumo más antiguo, el Gran Torneo de Primavera en Osaka, comenzó en 1925, marcando el inicio de las competiciones modernas organizadas por la Asociación Japonesa de Sumo.")
        ),
        BilingualQuestion(
            id = 30045, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel sport d'équipe brésilien est similaire au volleyball mais joué sur sable ?", listOf("Futsal", "Footvolley", "Altinha", "Frescobol"), "Sport", "L'Altinha est un sport brésilien qui se joue sur le sable, souvent sur les plages, avec un ballon de football et sans filet, où les joueurs doivent garder le ballon en l'air en utilisant toutes les parties du corps sauf les mains."),
            en = LocalizedContent("Which Brazilian team sport is similar to volleyball but played on sand?", listOf("Futsal", "Footvolley", "Altinha", "Frescobol"), "Sports", "Altinha is a Brazilian sport played on sand, often on beaches, with a soccer ball and no net, where players must keep the ball in the air using all body parts except hands."),
            zh = LocalizedContent("哪种巴西团队运动类似于排球但在沙滩上进行？", listOf("室内足球", "足排球", "阿尔蒂尼亚", "弗雷斯科博尔"), "体育", "阿尔蒂尼亚是一种巴西运动，在沙滩上进行，通常在海滩，使用足球且没有球网，球员必须用除手以外的所有身体部位保持球在空中。"),
            es = LocalizedContent("¿Qué deporte de equipo brasileño es similar al voleibol pero se juega en arena?", listOf("Futsal", "Footvolley", "Altinha", "Frescobol"), "Deportes", "La Altinha es un deporte brasileño que se juega en la arena, a menudo en las playas, con un balón de fútbol y sin red, donde los jugadores deben mantener el balón en el aire usando todas las partes del cuerpo excepto las manos.")
        ),
        BilingualQuestion(
            id = 30046, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année Usain Bolt a-t-il établi le record du monde du 100m (9.58s) ?", listOf("2008", "2009", "2011", "2012"), "Sport", "Usain Bolt a établi ce record du monde lors des championnats du monde d'athlétisme à Berlin en 2009, et non en 2012."),
            en = LocalizedContent("In what year did Usain Bolt set the 100m world record (9.58s)?", listOf("2008", "2009", "2011", "2012"), "Sports", "Usain Bolt set this world record at the World Athletics Championships in Berlin in 2009, not in 2012."),
            zh = LocalizedContent("尤塞恩·博尔特在哪一年创造了100米世界纪录（9.58秒）？", listOf("2008", "2009", "2011", "2012"), "体育", "尤塞恩·博尔特在2009年柏林世界田径锦标赛上创造了这一世界纪录，而非2012年。"),
            es = LocalizedContent("¿En qué año estableció Usain Bolt el récord mundial de 100m (9.58s)?", listOf("2008", "2009", "2011", "2012"), "Deportes", "Usain Bolt estableció este récord mundial en los Campeonatos Mundiales de Atletismo en Berlín en 2009, no en 2012.")
        ),
        BilingualQuestion(
            id = 30047, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel joueur de cricket australien a pris le plus grand nombre de guichets en test cricket ?", listOf("Shane Warne", "Brett Lee", "Glenn McGrath", "Dennis Lillee"), "Sport", "Shane Warne, légendaire spinner australien, détient le record du plus grand nombre de guichets en test cricket pour son pays, avec 708 wickets entre 1992 et 2007."),
            en = LocalizedContent("Which Australian cricketer has taken the most wickets in test cricket?", listOf("Shane Warne", "Brett Lee", "Glenn McGrath", "Dennis Lillee"), "Sports", "Shane Warne, legendary Australian spinner, holds the record for the most test wickets for his country, with 708 wickets between 1992 and 2007."),
            zh = LocalizedContent("哪位澳大利亚板球运动员在测试赛中获得了最多的三柱门？", listOf("肖恩·沃恩", "布雷特·李", "格伦·麦格拉思", "丹尼斯·利利"), "体育", "传奇澳大利亚旋转投手肖恩·沃恩保持着该国测试赛中最多的三柱门记录，在1992年至2007年间共获得708个三柱门。"),
            es = LocalizedContent("¿Qué jugador de críquet australiano ha tomado la mayor cantidad de wickets en críquet de prueba?", listOf("Shane Warne", "Brett Lee", "Glenn McGrath", "Dennis Lillee"), "Deportes", "Shane Warne, legendario lanzador spinner australiano, tiene el récord de la mayor cantidad de wickets en críquet de prueba para su país, con 708 wickets entre 1992 y 2007.")
        ),
        BilingualQuestion(
            id = 30048, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année la Formule E a-t-elle tenu sa première course officielle ?", listOf("2012", "2013", "2014", "2015"), "Sport", "La FIA a lancé la Formule E en 2014 pour promouvoir les voitures électriques, avec la première course à Pékin en septembre de cette année-là."),
            en = LocalizedContent("In what year did Formula E hold its first official race?", listOf("2012", "2013", "2014", "2015"), "Sports", "The FIA launched Formula E in 2014 to promote electric cars, with the first race in Beijing in September of that year."),
            zh = LocalizedContent("电动方程式在哪一年举办了第一场正式比赛？", listOf("2012", "2013", "2014", "2015"), "体育", "国际汽联于2014年推出电动方程式以推广电动汽车，首场比赛于同年9月在北京举行。"),
            es = LocalizedContent("¿En qué año celebró la Fórmula E su primera carrera oficial?", listOf("2012", "2013", "2014", "2015"), "Deportes", "La FIA lanzó la Fórmula E en 2014 para promover los coches eléctricos, con la primera carrera en Pekín en septiembre de ese año.")
        ),
        BilingualQuestion(
            id = 30049, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel tournoi de tennis est le seul à se jouer sur court en béton poreux aux États-Unis ?", listOf("Roland-Garros", "US Open", "Wimbledon", "Open d'Australie"), "Sport", "L'US Open est le seul tournoi du Grand Chelem à se jouer sur surface dure, et plus précisément sur un revêtement en béton poreux appelé DecoTurf, depuis 1978."),
            en = LocalizedContent("Which tennis tournament is the only one played on a porous concrete court in the United States?", listOf("Roland Garros", "US Open", "Wimbledon", "Australian Open"), "Sports", "The US Open is the only Grand Slam tournament played on a hard court, specifically a porous concrete surface called DecoTurf, since 1978."),
            zh = LocalizedContent("哪个网球锦标赛是唯一在美国的多孔混凝土球场上进行的？", listOf("法国网球公开赛", "美国网球公开赛", "温布尔登网球锦标赛", "澳大利亚网球公开赛"), "体育", "美国网球公开赛是唯一在硬地球场上进行的大满贯赛事，自1978年以来，具体使用的是名为DecoTurf的多孔混凝土表面。"),
            es = LocalizedContent("¿Qué torneo de tenis es el único que se juega en una cancha de hormigón poroso en Estados Unidos?", listOf("Roland Garros", "US Open", "Wimbledon", "Abierto de Australia"), "Deportes", "El US Open es el único torneo del Grand Slam que se juega en superficie dura, concretamente en un revestimiento de hormigón poroso llamado DecoTurf, desde 1978.")
        ),
        BilingualQuestion(
            id = 30050, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année Tiger Woods a-t-il remporté son 15e major de golf ?", listOf("2019", "2020", "2021", "2022"), "Sport", "Tiger Woods a remporté son 15e tournoi majeur au Masters d'Augusta en 2019, mettant fin à une disette de 11 ans sans victoire dans un majeur."),
            en = LocalizedContent("In which year did Tiger Woods win his 15th major golf championship?", listOf("2019", "2020", "2021", "2022"), "Sports", "Tiger Woods won his 15th major tournament at the Masters in Augusta in 2019, ending an 11-year drought without a major victory."),
            zh = LocalizedContent("老虎伍兹在哪一年赢得了他的第15个高尔夫大满贯冠军？", listOf("2019", "2020", "2021", "2022"), "体育", "老虎伍兹在2019年奥古斯塔大师赛上赢得了他的第15个大满贯赛事，结束了11年没有大满贯胜利的干旱期。"),
            es = LocalizedContent("¿En qué año ganó Tiger Woods su 15º major de golf?", listOf("2019", "2020", "2021", "2022"), "Deportes", "Tiger Woods ganó su 15º torneo major en el Masters de Augusta en 2019, poniendo fin a una sequía de 11 años sin victorias en un major.")
        ),
        BilingualQuestion(
            id = 30051, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("De quel pays d'Asie vient le K-pop ?", listOf("Japon", "Corée du Sud", "Thaïlande", "Vietnam"), "Musique", "Le terme K-pop signifie Korean pop, et ce genre musical est originaire de Corée du Sud, où il a émergé dans les années 1990."),
            en = LocalizedContent("Which Asian country does K-pop come from?", listOf("Japan", "South Korea", "Thailand", "Vietnam"), "Music", "The term K-pop stands for Korean pop, and this music genre originated in South Korea, emerging in the 1990s."),
            zh = LocalizedContent("K-pop来自哪个亚洲国家？", listOf("日本", "韩国", "泰国", "越南"), "音乐", "K-pop一词代表韩国流行音乐，这一音乐流派起源于韩国，于20世纪90年代兴起。"),
            es = LocalizedContent("¿De qué país asiático proviene el K-pop?", listOf("Japón", "Corea del Sur", "Tailandia", "Vietnam"), "Música", "El término K-pop significa pop coreano, y este género musical es originario de Corea del Sur, donde surgió en la década de 1990.")
        ),
        BilingualQuestion(
            id = 30052, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le genre musical né à la Jamaïque au milieu du 20e siècle ?", listOf("Reggae", "Calypso", "Dancehall", "Ska"), "Musique", "Le reggae est né en Jamaïque dans les années 1960, issu du ska et du rocksteady, et popularisé mondialement par des artistes comme Bob Marley."),
            en = LocalizedContent("What music genre was born in Jamaica in the mid-20th century?", listOf("Reggae", "Calypso", "Dancehall", "Ska"), "Music", "Reggae was born in Jamaica in the 1960s, evolving from ska and rocksteady, and was popularized worldwide by artists like Bob Marley."),
            zh = LocalizedContent("哪种音乐流派于20世纪中期诞生于牙买加？", listOf("雷鬼", "卡利普索", "舞厅", "斯卡"), "音乐", "雷鬼音乐于20世纪60年代在牙买加诞生，由斯卡和洛克斯代迪演变而来，并由鲍勃·马利等艺术家在全球推广。"),
            es = LocalizedContent("¿Qué género musical nació en Jamaica a mediados del siglo XX?", listOf("Reggae", "Calipso", "Dancehall", "Ska"), "Música", "El reggae nació en Jamaica en la década de 1960, derivado del ska y el rocksteady, y fue popularizado mundialmente por artistas como Bob Marley.")
        ),
        BilingualQuestion(
            id = 30053, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel musicien afrobeat nigérian s'appelle \"Fela\" ?", listOf("Fela Kuti", "Ginger Baker", "Tony Allen", "King Sunny Ade"), "Musique", "Fela Kuti, de son nom complet Fela Anikulapo Kuti, est le pionnier du genre afrobeat dans les années 1970 au Nigeria."),
            en = LocalizedContent("Which Nigerian afrobeat musician is called \"Fela\"?", listOf("Fela Kuti", "Ginger Baker", "Tony Allen", "King Sunny Ade"), "Music", "Fela Kuti, full name Fela Anikulapo Kuti, is the pioneer of the afrobeat genre in the 1970s in Nigeria."),
            zh = LocalizedContent("哪位尼日利亚非洲节拍音乐家被称为\"费拉\"？", listOf("费拉·库蒂", "金格·贝克", "托尼·艾伦", "金桑尼·阿德"), "音乐", "费拉·库蒂，全名费拉·阿尼库拉波·库蒂，是20世纪70年代尼日利亚非洲节拍音乐流派的先驱。"),
            es = LocalizedContent("¿Qué músico nigeriano de afrobeat se llama \"Fela\"?", listOf("Fela Kuti", "Ginger Baker", "Tony Allen", "King Sunny Ade"), "Música", "Fela Kuti, nombre completo Fela Anikulapo Kuti, es el pionero del género afrobeat en la década de 1970 en Nigeria.")
        ),
        BilingualQuestion(
            id = 30054, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("De quel pays d'Asie vient la musique classique indienne traditionnelle ?", listOf("Inde", "Thaïlande", "Indonésie", "Malaisie"), "Musique", "La musique classique indienne traditionnelle, avec ses deux grandes traditions (hindoustanie et carnatique), est originaire du sous-continent indien, aujourd'hui principalement l'Inde."),
            en = LocalizedContent("Which Asian country does traditional Indian classical music come from?", listOf("India", "Thailand", "Indonesia", "Malaysia"), "Music", "Traditional Indian classical music, with its two major traditions (Hindustani and Carnatic), originates from the Indian subcontinent, primarily present-day India."),
            zh = LocalizedContent("传统印度古典音乐来自哪个亚洲国家？", listOf("印度", "泰国", "印度尼西亚", "马来西亚"), "音乐", "传统印度古典音乐，包括两大传统（印度斯坦和卡纳提克），起源于印度次大陆，主要是今天的印度。"),
            es = LocalizedContent("¿De qué país asiático proviene la música clásica india tradicional?", listOf("India", "Tailandia", "Indonesia", "Malasia"), "Música", "La música clásica india tradicional, con sus dos grandes tradiciones (hindustaní y carnática), es originaria del subcontinente indio, hoy principalmente la India.")
        ),
        BilingualQuestion(
            id = 30055, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le genre musical latino-américain caractérisé par un rythme rapide et dansant ?", listOf("Bossa nova", "Reggaeton", "Samba", "Tango"), "Musique", "La samba est un genre musical brésilien né dans les favelas de Rio de Janeiro, connu pour son rythme syncopé et rapide qui accompagne les défilés du carnaval."),
            en = LocalizedContent("What is the Latin American music genre characterized by a fast and danceable rhythm?", listOf("Bossa nova", "Reggaeton", "Samba", "Tango"), "Music", "Samba is a Brazilian music genre born in the favelas of Rio de Janeiro, known for its syncopated and fast rhythm that accompanies carnival parades."),
            zh = LocalizedContent("哪种拉丁美洲音乐流派以快速和适合跳舞的节奏为特点？", listOf("波萨诺瓦", "雷鬼顿", "桑巴", "探戈"), "音乐", "桑巴是一种巴西音乐流派，诞生于里约热内卢的贫民窟，以其切分音和快速节奏而闻名，伴随狂欢节游行。"),
            es = LocalizedContent("¿Cuál es el género musical latinoamericano caracterizado por un ritmo rápido y bailable?", listOf("Bossa nova", "Reguetón", "Samba", "Tango"), "Música", "La samba es un género musical brasileño nacido en las favelas de Río de Janeiro, conocido por su ritmo sincopado y rápido que acompaña los desfiles de carnaval.")
        ),
        BilingualQuestion(
            id = 30056, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays la bossa nova s'est-elle développée ?", listOf("Colombie", "Brésil", "Pérou", "Argentine"), "Musique", "La bossa nova est un genre musical né au Brésil dans les années 1950, mêlant samba et jazz, popularisé par des artistes comme João Gilberto et Antônio Carlos Jobim."),
            en = LocalizedContent("In which country did bossa nova develop?", listOf("Colombia", "Brazil", "Peru", "Argentina"), "Music", "Bossa nova is a music genre born in Brazil in the 1950s, blending samba and jazz, popularized by artists like João Gilberto and Antônio Carlos Jobim."),
            zh = LocalizedContent("波萨诺瓦在哪个国家发展起来？", listOf("哥伦比亚", "巴西", "秘鲁", "阿根廷"), "音乐", "波萨诺瓦是一种于20世纪50年代在巴西诞生的音乐流派，融合了桑巴和爵士乐，由若昂·吉尔伯托和安东尼奥·卡洛斯·若宾等艺术家推广。"),
            es = LocalizedContent("¿En qué país se desarrolló la bossa nova?", listOf("Colombia", "Brasil", "Perú", "Argentina"), "Música", "La bossa nova es un género musical nacido en Brasil en la década de 1950, mezclando samba y jazz, popularizado por artistas como João Gilberto y Antônio Carlos Jobim.")
        ),
        BilingualQuestion(
            id = 30057, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel genre de musique provient d'un mélange de rythmes africains et de mélodies latino-américaines ?", listOf("Afrobeat", "Samba", "Rumba", "Tango"), "Musique", "L'afrobeat est un genre musical né au Nigeria dans les années 1960, créé par Fela Kuti, fusionnant des rythmes traditionnels africains avec des influences de jazz, funk et de musique latino-américaine."),
            en = LocalizedContent("What genre of music comes from a mix of African rhythms and Latin American melodies?", listOf("Afrobeat", "Samba", "Rumba", "Tango"), "Music", "Afrobeat is a music genre born in Nigeria in the 1960s, created by Fela Kuti, fusing traditional African rhythms with influences of jazz, funk, and Latin American music."),
            zh = LocalizedContent("哪种音乐流派来自非洲节奏和拉丁美洲旋律的混合？", listOf("非洲节拍", "桑巴", "伦巴", "探戈"), "音乐", "非洲节拍是一种于20世纪60年代在尼日利亚诞生的音乐流派，由费拉·库蒂创造，融合了传统非洲节奏与爵士、放克和拉丁美洲音乐的影响。"),
            es = LocalizedContent("¿Qué género musical proviene de una mezcla de ritmos africanos y melodías latinoamericanas?", listOf("Afrobeat", "Samba", "Rumba", "Tango"), "Música", "El afrobeat es un género musical nacido en Nigeria en la década de 1960, creado por Fela Kuti, fusionando ritmos tradicionales africanos con influencias de jazz, funk y música latinoamericana.")
        ),
        BilingualQuestion(
            id = 30058, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a produit le plus de hits reggaeton à l'échelle mondiale ?", listOf("Mexique", "Colombie", "Porto Rico", "République Dominicaine"), "Musique", "Porto Rico est considéré comme le berceau et l'épicentre du reggaeton moderne, avec des artistes comme Daddy Yankee, Bad Bunny et Nicky Jam qui dominent les classements mondiaux."),
            en = LocalizedContent("Which country has produced the most reggaeton hits worldwide?", listOf("Mexico", "Colombia", "Puerto Rico", "Dominican Republic"), "Music", "Puerto Rico is considered the birthplace and epicenter of modern reggaeton, with artists like Daddy Yankee, Bad Bunny, and Nicky Jam dominating global charts."),
            zh = LocalizedContent("哪个国家在全球范围内产生了最多的雷鬼顿热门歌曲？", listOf("墨西哥", "哥伦比亚", "波多黎各", "多米尼加共和国"), "音乐", "波多黎各被认为是现代雷鬼顿的诞生地和中心，达迪·扬基、坏兔子和尼基·贾姆等艺术家主导全球排行榜。"),
            es = LocalizedContent("¿Qué país ha producido más éxitos de reguetón a nivel mundial?", listOf("México", "Colombia", "Puerto Rico", "República Dominicana"), "Música", "Puerto Rico es considerado la cuna y el epicentro del reguetón moderno, con artistas como Daddy Yankee, Bad Bunny y Nicky Jam dominando las listas mundiales.")
        ),
        BilingualQuestion(
            id = 30059, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Psy a-t-il lancé \"Gangnam Style\" ?", listOf("2010", "2011", "2012", "2013"), "Musique", "Le tube \"Gangnam Style\" du chanteur sud-coréen Psy est sorti en juillet 2012, devenant un phénomène viral mondial et la première vidéo YouTube à atteindre un milliard de vues."),
            en = LocalizedContent("In what year did Psy release \"Gangnam Style\"?", listOf("2010", "2011", "2012", "2013"), "Music", "The hit \"Gangnam Style\" by South Korean singer Psy was released in July 2012, becoming a global viral phenomenon and the first YouTube video to reach one billion views."),
            zh = LocalizedContent("Psy 在哪一年发布了《江南Style》？", listOf("2010", "2011", "2012", "2013"), "音乐", "韩国歌手Psy的热门歌曲《江南Style》于2012年7月发布，成为全球病毒式现象，也是首个在YouTube上达到十亿次观看的视频。"),
            es = LocalizedContent("¿En qué año lanzó Psy \"Gangnam Style\"?", listOf("2010", "2011", "2012", "2013"), "Musica", "El éxito \"Gangnam Style\" del cantante surcoreano Psy se lanzó en julio de 2012, convirtiéndose en un fenómeno viral mundial y el primer video de YouTube en alcanzar mil millones de visitas.")
        ),
        BilingualQuestion(
            id = 30060, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe de K-pop a remporté l'Award de meilleur groupe à la cérémonie des MTV Video Music Awards 2020 ?", listOf("Blackpink", "BTS", "EXO", "Stray Kids"), "Musique", "BTS a remporté le prix du meilleur groupe aux MTV Video Music Awards 2020 pour leur performance de \"Dynamite\", marquant une reconnaissance majeure de la K-pop aux États-Unis."),
            en = LocalizedContent("Which K-pop group won the Best Group award at the 2020 MTV Video Music Awards?", listOf("Blackpink", "BTS", "EXO", "Stray Kids"), "Music", "BTS won the Best Group award at the 2020 MTV Video Music Awards for their performance of \"Dynamite\", marking a major recognition of K-pop in the United States."),
            zh = LocalizedContent("哪个K-pop组合在2020年MTV音乐录影带大奖上获得了最佳组合奖？", listOf("Blackpink", "BTS", "EXO", "Stray Kids"), "音乐", "BTS凭借《Dynamite》的表演在2020年MTV音乐录影带大奖上获得最佳组合奖，标志着K-pop在美国的重大认可。"),
            es = LocalizedContent("¿Qué grupo de K-pop ganó el premio al Mejor Grupo en los MTV Video Music Awards 2020?", listOf("Blackpink", "BTS", "EXO", "Stray Kids"), "Musica", "BTS ganó el premio al Mejor Grupo en los MTV Video Music Awards 2020 por su interpretación de \"Dynamite\", marcando un gran reconocimiento del K-pop en Estados Unidos.")
        ),
        BilingualQuestion(
            id = 30061, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année la bossa nova s'est-elle popularisée internationalement avec \"Girl from Ipanema\" ?", listOf("1960", "1962", "1964", "1966"), "Musique", "La version de \"Garota de Ipanema\" par Stan Getz et João Gilberto, sortie en 1962, a propulsé la bossa nova sur la scène mondiale."),
            en = LocalizedContent("In what year did bossa nova become internationally popular with \"The Girl from Ipanema\"?", listOf("1960", "1962", "1964", "1966"), "Music", "The version of \"Garota de Ipanema\" by Stan Getz and João Gilberto, released in 1962, propelled bossa nova onto the world stage."),
            zh = LocalizedContent("哪一年，波萨诺瓦凭借《来自伊帕内玛的女孩》在国际上流行起来？", listOf("1960", "1962", "1964", "1966"), "音乐", "Stan Getz和João Gilberto于1962年发行的《Garota de Ipanema》版本将波萨诺瓦推向了世界舞台。"),
            es = LocalizedContent("¿En qué año se popularizó internacionalmente la bossa nova con \"The Girl from Ipanema\"?", listOf("1960", "1962", "1964", "1966"), "Musica", "La versión de \"Garota de Ipanema\" de Stan Getz y João Gilberto, lanzada en 1962, impulsó la bossa nova al escenario mundial.")
        ),
        BilingualQuestion(
            id = 30062, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste afrobeat nigérian a collaboré avec Paul McCartney ?", listOf("Fela Kuti", "King Sunny Ade", "Burna Boy", "Davido"), "Musique", "Fela Kuti, pionnier de l'afrobeat, a collaboré avec Paul McCartney en 1973 sur l'album \"London Scene\", bien que McCartney ait été arrêté avec lui pour possession de cannabis."),
            en = LocalizedContent("Which Nigerian afrobeat artist collaborated with Paul McCartney?", listOf("Fela Kuti", "King Sunny Ade", "Burna Boy", "Davido"), "Music", "Fela Kuti, pioneer of afrobeat, collaborated with Paul McCartney in 1973 on the album \"London Scene\", although McCartney was arrested with him for cannabis possession."),
            zh = LocalizedContent("哪位尼日利亚非洲节拍艺术家与保罗·麦卡特尼合作过？", listOf("费拉·库蒂", "King Sunny Ade", "Burna Boy", "Davido"), "音乐", "非洲节拍先驱费拉·库蒂于1973年与保罗·麦卡特尼合作了专辑《London Scene》，尽管麦卡特尼因持有大麻与他一起被捕。"),
            es = LocalizedContent("¿Qué artista afrobeat nigeriano colaboró con Paul McCartney?", listOf("Fela Kuti", "King Sunny Ade", "Burna Boy", "Davido"), "Musica", "Fela Kuti, pionero del afrobeat, colaboró con Paul McCartney en 1973 en el álbum \"London Scene\", aunque McCartney fue arrestado con él por posesión de cannabis.")
        ),
        BilingualQuestion(
            id = 30063, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est central à la musique classique indienne pour l'imprimerie ?", listOf("Sitar", "Tabla", "Sarod", "Bansuri"), "Musique", "Le sitar est un instrument à cordes pincées emblématique de la musique classique indienne, notamment utilisé dans la tradition hindoustanie du Nord de l'Inde."),
            en = LocalizedContent("Which instrument is central to Indian classical music for printing?", listOf("Sitar", "Tabla", "Sarod", "Bansuri"), "Music", "The sitar is a plucked string instrument emblematic of Indian classical music, especially used in the Hindustani tradition of North India."),
            zh = LocalizedContent("哪种乐器是印度古典音乐中用于印刷的核心乐器？", listOf("西塔琴", "塔布拉鼓", "萨罗德", "班苏里笛"), "音乐", "西塔琴是一种弹拨弦乐器，是印度古典音乐的象征，尤其用于北印度的印度斯坦传统。"),
            es = LocalizedContent("¿Qué instrumento es central en la música clásica india para la impresión?", listOf("Sitar", "Tabla", "Sarod", "Bansuri"), "Musica", "El sitar es un instrumento de cuerda pulsada emblemático de la música clásica india, especialmente utilizado en la tradición hindustani del norte de la India.")
        ),
        BilingualQuestion(
            id = 30064, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("De quel pays provient le reggaeton moderne en tant que genre ?", listOf("Jamaïque", "Trinité-et-Tobago", "Porto Rico", "République Dominicaine"), "Musique", "Le reggaeton moderne est né à Porto Rico dans les années 1990, fusionnant le reggae jamaïcain, le dancehall et le hip-hop avec des rythmes latins."),
            en = LocalizedContent("From which country does modern reggaeton originate as a genre?", listOf("Jamaica", "Trinidad and Tobago", "Puerto Rico", "Dominican Republic"), "Music", "Modern reggaeton was born in Puerto Rico in the 1990s, fusing Jamaican reggae, dancehall, and hip-hop with Latin rhythms."),
            zh = LocalizedContent("现代雷击顿作为一种音乐类型起源于哪个国家？", listOf("牙买加", "特立尼达和多巴哥", "波多黎各", "多米尼加共和国"), "音乐", "现代雷击顿于20世纪90年代在波多黎各诞生，融合了牙买加雷鬼、舞厅和嘻哈音乐以及拉丁节奏。"),
            es = LocalizedContent("¿De qué país se origina el reguetón moderno como género?", listOf("Jamaica", "Trinidad y Tobago", "Puerto Rico", "República Dominicana"), "Musica", "El reguetón moderno nació en Puerto Rico en la década de 1990, fusionando el reggae jamaicano, el dancehall y el hip-hop con ritmos latinos.")
        ),
        BilingualQuestion(
            id = 30065, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien brésilien est connu comme \"O Rei da Bossa Nova\" (Le Roi de la Bossa Nova) ?", listOf("Antônio Carlos Jobim", "João Gilberto", "Stan Getz", "Vinícius de Moraes"), "Musique", "João Gilberto est surnommé \"O Rei da Bossa Nova\" pour avoir révolutionné la musique brésilienne en créant le style bossa nova, notamment avec son album \"Chega de Saudade\" en 1959."),
            en = LocalizedContent("Which Brazilian musician is known as \"O Rei da Bossa Nova\" (The King of Bossa Nova)?", listOf("Antônio Carlos Jobim", "João Gilberto", "Stan Getz", "Vinícius de Moraes"), "Music", "João Gilberto is nicknamed \"O Rei da Bossa Nova\" for revolutionizing Brazilian music by creating the bossa nova style, notably with his album \"Chega de Saudade\" in 1959."),
            zh = LocalizedContent("哪位巴西音乐家被称为“波萨诺瓦之王”？", listOf("安东尼奥·卡洛斯·若宾", "若昂·吉尔伯托", "斯坦·盖茨", "维尼修斯·德·莫赖斯"), "音乐", "若昂·吉尔伯托被称为“波萨诺瓦之王”，因为他通过创造波萨诺瓦风格革新了巴西音乐，尤其是1959年的专辑《Chega de Saudade》。"),
            es = LocalizedContent("¿Qué músico brasileño es conocido como \"O Rei da Bossa Nova\" (El Rey de la Bossa Nova)?", listOf("Antônio Carlos Jobim", "João Gilberto", "Stan Getz", "Vinícius de Moraes"), "Musica", "João Gilberto es apodado \"O Rei da Bossa Nova\" por revolucionar la música brasileña al crear el estilo bossa nova, especialmente con su álbum \"Chega de Saudade\" en 1959.")
        ),
        BilingualQuestion(
            id = 30066, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Bollywood a-t-elle lancé le genre du \"Item Number\" popularisé par danseuses ?", listOf("1960s", "1970s", "1980s", "1990s"), "Musique", "Le terme \"Item Number\" a émergé dans le cinéma indien des années 1970 avec des chansons dansées par des actrices vedettes comme Helen, popularisant ce genre de performance glamour et autonome."),
            en = LocalizedContent("In what decade did Bollywood launch the \"Item Number\" genre popularized by dancers?", listOf("1960s", "1970s", "1980s", "1990s"), "Music", "The term \"Item Number\" emerged in Indian cinema in the 1970s with songs danced by leading actresses like Helen, popularizing this genre of glamorous, standalone performance."),
            zh = LocalizedContent("宝莱坞在哪十年推出了由舞者推广的“Item Number”类型？", listOf("1960年代", "1970年代", "1980年代", "1990年代"), "音乐", "“Item Number”一词在20世纪70年代的印度电影中出现，由海伦等女演员演唱的歌曲舞蹈推广，使这种华丽、独立的表演类型流行起来。"),
            es = LocalizedContent("¿En qué década lanzó Bollywood el género \"Item Number\" popularizado por bailarinas?", listOf("1960s", "1970s", "1980s", "1990s"), "Musica", "El término \"Item Number\" surgió en el cine indio en la década de 1970 con canciones bailadas por actrices principales como Helen, popularizando este género de actuación glamurosa e independiente.")
        ),
        BilingualQuestion(
            id = 30067, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste J-pop s'appelle Utada Hikaru et a remporté plusieurs Grammy Awards ?", listOf("Vrai", "Faux", "Partiellement vrai", "Inconnu"), "Musique", "Utada Hikaru n'a jamais remporté de Grammy Awards, bien qu'elle soit une artiste J-pop célèbre. Ses récompenses incluent des Japan Gold Disc Awards et des MTV Video Music Awards Japan."),
            en = LocalizedContent("Which J-pop artist is named Utada Hikaru and has won multiple Grammy Awards?", listOf("True", "False", "Partially true", "Unknown"), "Music", "Utada Hikaru has never won a Grammy Award, although she is a famous J-pop artist. Her awards include Japan Gold Disc Awards and MTV Video Music Awards Japan."),
            zh = LocalizedContent("哪位J-pop艺人名叫宇多田光，并赢得了多项格莱美奖？", listOf("正确", "错误", "部分正确", "未知"), "音乐", "宇多田光从未赢得过格莱美奖，尽管她是一位著名的J-pop艺人。她的奖项包括日本金唱片大奖和MTV日本音乐录影带大奖。"),
            es = LocalizedContent("¿Qué artista J-pop se llama Utada Hikaru y ha ganado múltiples premios Grammy?", listOf("Verdadero", "Falso", "Parcialmente verdadero", "Desconocido"), "Musica", "Utada Hikaru nunca ha ganado un premio Grammy, aunque es una famosa artista J-pop. Sus premios incluyen Japan Gold Disc Awards y MTV Video Music Awards Japan.")
        ),
        BilingualQuestion(
            id = 30068, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel groupe de hip-hop sud-coréen a révolutionné le genre en Asie avec des lyrics en coréen ?", listOf("Tiger JK", "Epik High", "Jay Park", "Drunken Tiger"), "Musique", "Drunken Tiger, formé en 1999 par Tiger JK, a été le premier groupe de hip-hop sud-coréen à rapper en coréen, ouvrant la voie à la vague K-hip-hop en Asie."),
            en = LocalizedContent("Which South Korean hip-hop group revolutionized the genre in Asia with Korean lyrics?", listOf("Tiger JK", "Epik High", "Jay Park", "Drunken Tiger"), "Music", "Drunken Tiger, formed in 1999 by Tiger JK, was the first South Korean hip-hop group to rap in Korean, paving the way for the K-hip-hop wave in Asia."),
            zh = LocalizedContent("哪个韩国嘻哈组合通过使用韩语歌词革新了亚洲的嘻哈音乐？", listOf("Tiger JK", "Epik High", "Jay Park", "Drunken Tiger"), "音乐", "Drunken Tiger由Tiger JK于1999年组建，是第一个用韩语说唱的韩国嘻哈组合，为亚洲的K-嘻哈浪潮铺平了道路。"),
            es = LocalizedContent("¿Qué grupo de hip-hop surcoreano revolucionó el género en Asia con letras en coreano?", listOf("Tiger JK", "Epik High", "Jay Park", "Drunken Tiger"), "Musica", "Drunken Tiger, formado en 1999 por Tiger JK, fue el primer grupo de hip-hop surcoreano en rapear en coreano, allanando el camino para la ola K-hip-hop en Asia.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 30069, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année les Beatles ont-ils enregistré \"Norwegian Wood\" inspirée par la musique indienne ?", listOf("1964", "1965", "1966", "1967"), "Musique", "Les Beatles ont enregistré \"Norwegian Wood\" en 1965 pour l'album \"Rubber Soul\", mais c'est en 1966 qu'ils ont exploré plus profondément la musique indienne, notamment avec George Harrison jouant du sitar."),
            en = LocalizedContent("In which year did the Beatles record \"Norwegian Wood\" inspired by Indian music?", listOf("1964", "1965", "1966", "1967"), "Music", "The Beatles recorded \"Norwegian Wood\" in 1965 for the album \"Rubber Soul\", but it was in 1966 that they explored Indian music more deeply, notably with George Harrison playing the sitar."),
            zh = LocalizedContent("披头士在哪一年录制了受印度音乐启发的《Norwegian Wood》？", listOf("1964", "1965", "1966", "1967"), "音乐", "披头士于1965年为专辑《Rubber Soul》录制了《Norwegian Wood》，但他们在1966年更深入地探索了印度音乐，尤其是乔治·哈里森演奏西塔琴。"),
            es = LocalizedContent("¿En qué año grabaron los Beatles \"Norwegian Wood\" inspirada por la música india?", listOf("1964", "1965", "1966", "1967"), "Musica", "Los Beatles grabaron \"Norwegian Wood\" en 1965 para el álbum \"Rubber Soul\", pero fue en 1966 cuando exploraron más profundamente la música india, especialmente con George Harrison tocando el sitar.")
        ),
        BilingualQuestion(
            id = 30070, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel maestro sud-africain est connu pour sa fusion entre la musique traditionnelle et le jazz ?", listOf("Miriam Makeba", "Abdullah Ibrahim", "Hugh Masekela", "Caiphus Semenya"), "Musique", "Abdullah Ibrahim, pianiste et compositeur sud-africain, mêle les rythmes traditionnels de son pays, comme le marabi, avec le jazz, notamment sur son album emblématique \"African Marketplace\"."),
            en = LocalizedContent("Which South African maestro is known for his fusion of traditional music and jazz?", listOf("Miriam Makeba", "Abdullah Ibrahim", "Hugh Masekela", "Caiphus Semenya"), "Music", "Abdullah Ibrahim, South African pianist and composer, blends traditional rhythms of his country, such as marabi, with jazz, notably on his iconic album \"African Marketplace\"."),
            zh = LocalizedContent("哪位南非大师以融合传统音乐和爵士乐而闻名？", listOf("米里亚姆·马凯巴", "阿卜杜拉·易卜拉欣", "休·马塞凯拉", "凯弗斯·塞门亚"), "音乐", "阿卜杜拉·易卜拉欣，南非钢琴家和作曲家，将南非传统节奏（如马拉比）与爵士乐融合，代表作包括标志性专辑《African Marketplace》。"),
            es = LocalizedContent("¿Qué maestro sudafricano es conocido por su fusión entre la música tradicional y el jazz?", listOf("Miriam Makeba", "Abdullah Ibrahim", "Hugh Masekela", "Caiphus Semenya"), "Musica", "Abdullah Ibrahim, pianista y compositor sudafricano, combina ritmos tradicionales de su país, como el marabi, con el jazz, especialmente en su emblemático álbum \"African Marketplace\".")
        ),
        BilingualQuestion(
            id = 30071, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année le premier album de BTS \"2 Cool 4 Skool\" a-t-il été lancé ?", listOf("2011", "2012", "2013", "2014"), "Musique", "2 Cool 4 Skool est le premier album du groupe sud-coréen BTS, sorti le 12 juin 2013, marquant leurs débuts officiels dans l'industrie musicale."),
            en = LocalizedContent("In which year was BTS's first album \"2 Cool 4 Skool\" released?", listOf("2011", "2012", "2013", "2014"), "Music", "\"2 Cool 4 Skool\" is the first album by the South Korean group BTS, released on June 12, 2013, marking their official debut in the music industry."),
            zh = LocalizedContent("防弹少年团的第一张专辑《2 Cool 4 Skool》在哪一年发行？", listOf("2011", "2012", "2013", "2014"), "音乐", "《2 Cool 4 Skool》是韩国组合防弹少年团的第一张专辑，于2013年6月12日发行，标志着他们在音乐界的正式出道。"),
            es = LocalizedContent("¿En qué año se lanzó el primer álbum de BTS \"2 Cool 4 Skool\"?", listOf("2011", "2012", "2013", "2014"), "Musica", "\"2 Cool 4 Skool\" es el primer álbum del grupo surcoreano BTS, lanzado el 12 de junio de 2013, marcando su debut oficial en la industria musical.")
        ),
        BilingualQuestion(
            id = 30072, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel compositeur indien a remporté un Oscar pour sa musique de film ?", listOf("Ravi Shankar", "A.R. Rahman", "Anu Malik", "Ilayaraja"), "Musique", "A.R. Rahman a remporté l'Oscar de la meilleure musique de film en 2009 pour la bande originale de Slumdog Millionaire."),
            en = LocalizedContent("Which Indian composer won an Oscar for his film music?", listOf("Ravi Shankar", "A.R. Rahman", "Anu Malik", "Ilayaraja"), "Music", "A.R. Rahman won the Oscar for Best Original Score in 2009 for the soundtrack of Slumdog Millionaire."),
            zh = LocalizedContent("哪位印度作曲家凭借电影音乐获得了奥斯卡奖？", listOf("拉维·香卡", "A.R.拉赫曼", "阿努·马利克", "伊拉亚拉贾"), "音乐", "A.R.拉赫曼凭借《贫民窟的百万富翁》的原声带于2009年获得奥斯卡最佳原创配乐奖。"),
            es = LocalizedContent("¿Qué compositor indio ganó un Oscar por su música de cine?", listOf("Ravi Shankar", "A.R. Rahman", "Anu Malik", "Ilayaraja"), "Musica", "A.R. Rahman ganó el Oscar a la mejor banda sonora en 2009 por la banda sonora de Slumdog Millionaire.")
        ),
        BilingualQuestion(
            id = 30073, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pays produit le plus haut taux de consommation de musique classique arabe par habitant ?", listOf("Liban", "Égypte", "Syrie", "Irak"), "Musique", "Le Liban a une longue tradition de musique classique arabe, avec des figures emblématiques comme Fairuz et des institutions culturelles actives, ce qui en fait le plus grand consommateur par habitant."),
            en = LocalizedContent("Which country has the highest per capita consumption of classical Arabic music?", listOf("Lebanon", "Egypt", "Syria", "Iraq"), "Music", "Lebanon has a long tradition of classical Arabic music, with iconic figures like Fairuz and active cultural institutions, making it the largest consumer per capita."),
            zh = LocalizedContent("哪个国家的人均古典阿拉伯音乐消费量最高？", listOf("黎巴嫩", "埃及", "叙利亚", "伊拉克"), "音乐", "黎巴嫩拥有悠久的古典阿拉伯音乐传统，拥有像费鲁兹这样的标志性人物和活跃的文化机构，使其成为人均消费量最大的国家。"),
            es = LocalizedContent("¿Qué país tiene el mayor consumo per cápita de música clásica árabe?", listOf("Líbano", "Egipto", "Siria", "Irak"), "Musica", "El Líbano tiene una larga tradición de música clásica árabe, con figuras emblemáticas como Fairuz e instituciones culturales activas, lo que lo convierte en el mayor consumidor per cápita.")
        ),
        BilingualQuestion(
            id = 30074, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année Fela Kuti a-t-il enregistré \"Zombie\" critique du régime militaire nigérian ?", listOf("1972", "1974", "1976", "1978"), "Musique", "Fela Kuti a enregistré l'album \"Zombie\" en 1974, une satire féroce des soldats nigérians qu'il comparait à des zombies obéissant aveuglément aux ordres. Cette critique du régime militaire lui a valu des représailles violentes, notamment l'incendie de sa commune par l'armée."),
            en = LocalizedContent("In which year did Fela Kuti record \"Zombie\", a critique of the Nigerian military regime?", listOf("1972", "1974", "1976", "1978"), "Music", "Fela Kuti recorded the album \"Zombie\" in 1974, a fierce satire of Nigerian soldiers whom he compared to zombies blindly obeying orders. This critique of the military regime led to violent reprisals, including the burning of his commune by the army."),
            zh = LocalizedContent("费拉·库蒂在哪一年录制了批评尼日利亚军政府的《Zombie》？", listOf("1972", "1974", "1976", "1978"), "音乐", "费拉·库蒂于1974年录制了专辑《Zombie》，这是一部对尼日利亚士兵的尖锐讽刺，他将他们比作盲目服从命令的僵尸。这种对军政府的批评招致了暴力报复，包括军队焚烧了他的公社。"),
            es = LocalizedContent("¿En qué año grabó Fela Kuti \"Zombie\", una crítica al régimen militar nigeriano?", listOf("1972", "1974", "1976", "1978"), "Musica", "Fela Kuti grabó el álbum \"Zombie\" en 1974, una feroz sátira de los soldados nigerianos a los que comparaba con zombis que obedecían ciegamente las órdenes. Esta crítica al régimen militar le valió represalias violentas, incluido el incendio de su comuna por parte del ejército.")
        ),
        BilingualQuestion(
            id = 30075, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel producteur français a popularisé la \"touch française\" en hip-hop avec Daft Punk et Justice ?", listOf("Rodney Jerkins", "Timbaland", "Neptunes", "Brainfeeder"), "Musique", "Les Neptunes sont un duo de producteurs américains, pas français. La \"touch française\" en hip-hop a été popularisée par des producteurs français comme ceux de Daft Punk et Justice, mais le terme désigne un style électronique français, pas un duo américain."),
            en = LocalizedContent("Which French producer popularized the \"French touch\" in hip-hop with Daft Punk and Justice?", listOf("Rodney Jerkins", "Timbaland", "Neptunes", "Brainfeeder"), "Music", "The Neptunes are an American production duo, not French. The \"French touch\" in hip-hop was popularized by French producers like those of Daft Punk and Justice, but the term refers to a French electronic style, not an American duo."),
            zh = LocalizedContent("哪位法国制作人通过Daft Punk和Justice推广了嘻哈音乐中的“法国触感”？", listOf("罗德尼·杰金斯", "蒂姆巴兰", "海王星", "Brainfeeder"), "音乐", "海王星是美国制作二人组，不是法国人。嘻哈音乐中的“法国触感”是由像Daft Punk和Justice这样的法国制作人推广的，但该术语指的是法国电子风格，而不是美国二人组。"),
            es = LocalizedContent("¿Qué productor francés popularizó el \"toque francés\" en el hip-hop con Daft Punk y Justice?", listOf("Rodney Jerkins", "Timbaland", "Neptunes", "Brainfeeder"), "Musica", "Los Neptunes son un dúo de productores estadounidenses, no franceses. El \"toque francés\" en el hip-hop fue popularizado por productores franceses como los de Daft Punk y Justice, pero el término se refiere a un estilo electrónico francés, no a un dúo estadounidense.")
        ),
        BilingualQuestion(
            id = 30076, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel mois se déroule traditionnellement Diwali en Inde ?", listOf("Août", "Septembre", "Octobre-Novembre", "Décembre"), "Culture", "Diwali, la fête des lumières, suit le calendrier lunaire hindou et tombe généralement entre mi-octobre et mi-novembre, pendant le mois d’Ashvin ou Kartik."),
            en = LocalizedContent("In which month is Diwali traditionally celebrated in India?", listOf("August", "September", "October-November", "December"), "Culture", "Diwali, the festival of lights, follows the Hindu lunar calendar and typically falls between mid-October and mid-November, during the month of Ashvin or Kartik."),
            zh = LocalizedContent("印度传统上在哪个月份庆祝排灯节？", listOf("八月", "九月", "十月至十一月", "十二月"), "文化", "排灯节，即光明节，遵循印度阴历，通常在十月中旬至十一月中旬之间，即阿什温月或卡尔提克月。"),
            es = LocalizedContent("¿En qué mes se celebra tradicionalmente Diwali en la India?", listOf("Agosto", "Septiembre", "Octubre-Noviembre", "Diciembre"), "Cultura", "Diwali, el festival de las luces, sigue el calendario lunar hindú y generalmente cae entre mediados de octubre y mediados de noviembre, durante el mes de Ashvin o Kartik.")
        ),
        BilingualQuestion(
            id = 30077, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du festival des fleurs de cerisier au Japon ?", listOf("Tanabata", "Hanami", "Obon", "Setsubun"), "Culture", "Hanami est le nom donné à la tradition japonaise d'admirer les fleurs de cerisier, qui est aussi un festival printanier célébrant leur floraison éphémère."),
            en = LocalizedContent("What is the name of the cherry blossom festival in Japan?", listOf("Tanabata", "Hanami", "Obon", "Setsubun"), "Culture", "Hanami is the name given to the Japanese tradition of viewing cherry blossoms, which is also a spring festival celebrating their ephemeral bloom."),
            zh = LocalizedContent("日本赏樱节叫什么名字？", listOf("七夕", "花见", "盂兰盆节", "节分"), "文化", "花见是日本观赏樱花的传统名称，也是一个庆祝樱花短暂绽放的春季节日。"),
            es = LocalizedContent("¿Cuál es el nombre del festival de las flores de cerezo en Japón?", listOf("Tanabata", "Hanami", "Obon", "Setsubun"), "Cultura", "Hanami es el nombre que se le da a la tradición japonesa de admirar las flores de cerezo, que también es un festival primaveral que celebra su efímera floración.")
        ),
        BilingualQuestion(
            id = 30078, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays se déroule le Carnaval de Rio ?", listOf("Porto Rico", "Brésil", "Haïti", "Jamaïque"), "Culture", "Le Carnaval de Rio se déroule au Brésil, dans la ville de Rio de Janeiro. C'est l'un des plus grands carnavals du monde, connu pour ses défilés de samba et ses costumes spectaculaires."),
            en = LocalizedContent("In which country does the Rio Carnival take place?", listOf("Puerto Rico", "Brazil", "Haiti", "Jamaica"), "Culture", "The Rio Carnival takes place in Brazil, in the city of Rio de Janeiro. It is one of the largest carnivals in the world, known for its samba parades and spectacular costumes."),
            zh = LocalizedContent("里约狂欢节在哪个国家举行？", listOf("波多黎各", "巴西", "海地", "牙买加"), "文化", "里约狂欢节在巴西里约热内卢举行。它是世界上最大的狂欢节之一，以桑巴舞游行和壮观的服装而闻名。"),
            es = LocalizedContent("¿En qué país se celebra el Carnaval de Río?", listOf("Puerto Rico", "Brasil", "Haití", "Jamaica"), "Cultura", "El Carnaval de Río se celebra en Brasil, en la ciudad de Río de Janeiro. Es uno de los carnavales más grandes del mundo, conocido por sus desfiles de samba y sus espectaculares disfraces.")
        ),
        BilingualQuestion(
            id = 30079, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel festival indien célèbre-t-on avec des poudres colorées et de l'eau ?", listOf("Diwali", "Navratri", "Holi", "Pongal"), "Culture", "Holi est une fête hindoue du printemps qui symbolise la victoire du bien sur le mal. Les participants se jettent des poudres et de l'eau colorées pour célébrer la joie et la renaissance."),
            en = LocalizedContent("Which Indian festival is celebrated with colored powders and water?", listOf("Diwali", "Navratri", "Holi", "Pongal"), "Culture", "Holi is a Hindu spring festival symbolizing the victory of good over evil. Participants throw colored powders and water to celebrate joy and rebirth."),
            zh = LocalizedContent("哪个印度节日用彩色粉末和水庆祝？", listOf("排灯节", "九夜节", "洒红节", "丰收节"), "文化", "洒红节是印度教的春节，象征善良战胜邪恶。参与者互相抛洒彩色粉末和水，庆祝欢乐与重生。"),
            es = LocalizedContent("¿Qué festival indio se celebra con polvos de colores y agua?", listOf("Diwali", "Navratri", "Holi", "Pongal"), "Cultura", "Holi es una fiesta hindú de primavera que simboliza la victoria del bien sobre el mal. Los participantes se arrojan polvos y agua de colores para celebrar la alegría y el renacimiento.")
        ),
        BilingualQuestion(
            id = 30080, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays se célèbre la Fête des Morts (Día de los Muertos) au 1er novembre ?", listOf("Bolivie", "Pérou", "Mexique", "Colombie"), "Culture", "Le Día de los Muertos est une tradition mexicaine qui honore les défunts, mêlant croyances préhispaniques et catholicisme. Elle est célébrée les 1er et 2 novembre, dates correspondant à la Toussaint."),
            en = LocalizedContent("In which country is the Day of the Dead (Día de los Muertos) celebrated on November 1st?", listOf("Bolivia", "Peru", "Mexico", "Colombia"), "Culture", "The Day of the Dead is a Mexican tradition honoring the deceased, blending pre-Hispanic beliefs and Catholicism. It is celebrated on November 1st and 2nd, coinciding with All Saints' Day."),
            zh = LocalizedContent("哪个国家在11月1日庆祝亡灵节？", listOf("玻利维亚", "秘鲁", "墨西哥", "哥伦比亚"), "文化", "亡灵节是墨西哥的传统节日，融合了前西班牙时期的信仰和天主教，纪念逝者。庆祝活动在11月1日和2日，与万圣节同期。"),
            es = LocalizedContent("¿En qué país se celebra el Día de los Muertos el 1 de noviembre?", listOf("Bolivia", "Perú", "México", "Colombia"), "Cultura", "El Día de los Muertos es una tradición mexicana que honra a los difuntos, combinando creencias prehispánicas y catolicismo. Se celebra el 1 y 2 de noviembre, coincidiendo con el Día de Todos los Santos.")
        ),
        BilingualQuestion(
            id = 30081, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel mois célèbre-t-on le Nouvel An chinois (Chinese New Year) ?", listOf("Janvier", "Janvier-Février", "Février", "Mars"), "Culture", "Le Nouvel An chinois suit le calendrier lunaire, dont la date varie entre le 21 janvier et le 20 février. Il commence à la deuxième nouvelle lune après le solstice d'hiver."),
            en = LocalizedContent("In which month is Chinese New Year celebrated?", listOf("January", "January-February", "February", "March"), "Culture", "Chinese New Year follows the lunar calendar, with the date varying between January 21 and February 20. It begins on the second new moon after the winter solstice."),
            zh = LocalizedContent("中国新年在哪个月庆祝？", listOf("一月", "一月-二月", "二月", "三月"), "文化", "中国新年遵循农历，日期在1月21日至2月20日之间变化。它在冬至后的第二个新月开始。"),
            es = LocalizedContent("¿En qué mes se celebra el Año Nuevo chino?", listOf("Enero", "Enero-Febrero", "Febrero", "Marzo"), "Cultura", "El Año Nuevo chino sigue el calendario lunar, con fecha variable entre el 21 de enero y el 20 de febrero. Comienza en la segunda luna nueva después del solsticio de invierno.")
        ),
        BilingualQuestion(
            id = 30082, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays se déroule le festival Oktoberfest ?", listOf("Autriche", "Suisse", "Allemagne", "Belgique"), "Culture", "L'Oktoberfest est une fête populaire traditionnelle qui se tient chaque année à Munich, en Bavière, dans le sud de l'Allemagne."),
            en = LocalizedContent("In which country does the Oktoberfest festival take place?", listOf("Austria", "Switzerland", "Germany", "Belgium"), "Culture", "Oktoberfest is a traditional folk festival held annually in Munich, Bavaria, in southern Germany."),
            zh = LocalizedContent("哪个国家举办啤酒节？", listOf("奥地利", "瑞士", "德国", "比利时"), "文化", "啤酒节是每年在德国南部巴伐利亚州慕尼黑举行的传统民间节日。"),
            es = LocalizedContent("¿En qué país se celebra el festival Oktoberfest?", listOf("Austria", "Suiza", "Alemania", "Bélgica"), "Cultura", "La Oktoberfest es una fiesta popular tradicional que se celebra cada año en Múnich, Baviera, en el sur de Alemania.")
        ),
        BilingualQuestion(
            id = 30083, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel festival africain célèbre la culture et l'unité pan-africaine en Afrique du Sud ?", listOf("Essence Festival", "Africolor", "Afrochella", "Pan-African Film Festival"), "Culture", "Afrochella, organisé au Cap, est un festival de musique et de mode qui célèbre la culture africaine contemporaine et promeut l'unité pan-africaine."),
            en = LocalizedContent("Which African festival celebrates pan-African culture and unity in South Africa?", listOf("Essence Festival", "Africolor", "Afrochella", "Pan-African Film Festival"), "Culture", "Afrochella, held in Cape Town, is a music and fashion festival that celebrates contemporary African culture and promotes pan-African unity."),
            zh = LocalizedContent("哪个非洲节日在南非庆祝泛非文化和团结？", listOf("精华节", "非洲色彩", "Afrochella", "泛非电影节"), "文化", "Afrochella在开普敦举办，是一个音乐和时尚节，庆祝当代非洲文化并促进泛非团结。"),
            es = LocalizedContent("¿Qué festival africano celebra la cultura y la unidad panafricana en Sudáfrica?", listOf("Essence Festival", "Africolor", "Afrochella", "Pan-African Film Festival"), "Cultura", "Afrochella, celebrado en Ciudad del Cabo, es un festival de música y moda que celebra la cultura africana contemporánea y promueve la unidad panafricana.")
        ),
        BilingualQuestion(
            id = 30084, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année le Ramadan a-t-il commencé en tant que mois de jeûne musulman ?", listOf("632 AD", "610 AD", "630 AD", "650 AD"), "Culture", "Le jeûne du Ramadan a été institué en l’an 632 de notre ère, correspondant à la deuxième année de l’Hégire, lorsque le prophète Mahomet a reçu la révélation coranique ordonnant cette pratique."),
            en = LocalizedContent("In which year did Ramadan begin as a month of Muslim fasting?", listOf("632 AD", "610 AD", "630 AD", "650 AD"), "Culture", "The fast of Ramadan was instituted in 632 AD, corresponding to the second year of the Hijra, when the Prophet Muhammad received the Quranic revelation ordering this practice."),
            zh = LocalizedContent("斋月作为穆斯林斋戒月始于哪一年？", listOf("公元632年", "公元610年", "公元630年", "公元650年"), "文化", "斋月斋戒始于公元632年，对应伊斯兰历第二年，当时先知穆罕默德接受了《古兰经》启示，命令实行这一习俗。"),
            es = LocalizedContent("¿En qué año comenzó el Ramadán como mes de ayuno musulmán?", listOf("632 d.C.", "610 d.C.", "630 d.C.", "650 d.C."), "Cultura", "El ayuno del Ramadán fue instituido en el año 632 d.C., correspondiente al segundo año de la Hégira, cuando el profeta Mahoma recibió la revelación coránica que ordenaba esta práctica.")
        ),
        BilingualQuestion(
            id = 30085, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du nouvel an thai célébré en avril ?", listOf("Loy Krathong", "Songkran", "Phimai", "Phanom Rung"), "Culture", "Songkran est le Nouvel An traditionnel thaïlandais, célébré du 13 au 15 avril, marqué par des batailles d'eau symbolisant la purification et le renouveau."),
            en = LocalizedContent("What is the name of the Thai New Year celebrated in April?", listOf("Loy Krathong", "Songkran", "Phimai", "Phanom Rung"), "Culture", "Songkran is the traditional Thai New Year, celebrated from April 13 to 15, marked by water fights symbolizing purification and renewal."),
            zh = LocalizedContent("四月庆祝的泰国新年叫什么？", listOf("水灯节", "宋干节", "披迈节", "帕侬蓝节"), "文化", "宋干节是泰国传统新年，从4月13日到15日庆祝，以泼水活动为标志，象征净化和更新。"),
            es = LocalizedContent("¿Cuál es el nombre del Año Nuevo tailandés que se celebra en abril?", listOf("Loy Krathong", "Songkran", "Phimai", "Phanom Rung"), "Cultura", "Songkran es el Año Nuevo tradicional tailandés, celebrado del 13 al 15 de abril, marcado por batallas de agua que simbolizan la purificación y el renuevo.")
        ),
        BilingualQuestion(
            id = 30086, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel pays se célèbre la fête de Navratri pendant 9 nuits avec danses Garba ?", listOf("Sri Lanka", "Inde", "Népal", "Bhoutan"), "Culture", "Navratri est une fête hindoue majeure célébrée en Inde, où les danses Garba et Dandiya Raas sont exécutées pendant neuf nuits en l'honneur de la déesse Durga."),
            en = LocalizedContent("In which country is the festival of Navratri celebrated for 9 nights with Garba dances?", listOf("Sri Lanka", "India", "Nepal", "Bhutan"), "Culture", "Navratri is a major Hindu festival celebrated in India, where Garba and Dandiya Raas dances are performed for nine nights in honor of the goddess Durga."),
            zh = LocalizedContent("哪个国家庆祝九夜节，连续九晚跳Garba舞？", listOf("斯里兰卡", "印度", "尼泊尔", "不丹"), "文化", "九夜节是印度重要的印度教节日，连续九晚表演Garba和Dandiya Raas舞蹈，以纪念杜尔迦女神。"),
            es = LocalizedContent("¿En qué país se celebra el festival de Navratri durante 9 noches con danzas Garba?", listOf("Sri Lanka", "India", "Nepal", "Bután"), "Cultura", "Navratri es una importante fiesta hindú celebrada en India, donde se realizan danzas Garba y Dandiya Raas durante nueve noches en honor a la diosa Durga.")
        ),
        BilingualQuestion(
            id = 30087, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel festival brésilien célèbre la diversité culturelle et les traditions autochtones ?", listOf("Festa de Santo Antônio", "Festa de São João", "Bumba Meu Boi", "Festa de Nossa Senhora"), "Culture", "Le Bumba Meu Boi est un festival folklorique brésilien du Nordeste qui met en scène des danses, musiques et costumes inspirés des cultures indigènes, africaines et portugaises."),
            en = LocalizedContent("Which Brazilian festival celebrates cultural diversity and indigenous traditions?", listOf("Festa de Santo Antônio", "Festa de São João", "Bumba Meu Boi", "Festa de Nossa Senhora"), "Culture", "Bumba Meu Boi is a Brazilian folk festival from the Northeast that features dances, music, and costumes inspired by indigenous, African, and Portuguese cultures."),
            zh = LocalizedContent("哪个巴西节日庆祝文化多样性和土著传统？", listOf("圣安东尼奥节", "圣若昂节", "Bumba Meu Boi", "圣母节"), "文化", "Bumba Meu Boi是巴西东北部的民间节日，以舞蹈、音乐和服装为特色，灵感来自土著、非洲和葡萄牙文化。"),
            es = LocalizedContent("¿Qué festival brasileño celebra la diversidad cultural y las tradiciones indígenas?", listOf("Festa de Santo Antônio", "Festa de São João", "Bumba Meu Boi", "Festa de Nossa Senhora"), "Cultura", "El Bumba Meu Boi es un festival folclórico brasileño del Nordeste que presenta danzas, música y disfraces inspirados en las culturas indígena, africana y portuguesa.")
        ),
        BilingualQuestion(
            id = 30088, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel mois se déroule Holi, le festival des couleurs en Inde ?", listOf("Décembre", "Janvier", "Février-Mars", "Mai"), "Culture", "Holi est une fête hindoue qui marque l'arrivée du printemps et la victoire du bien sur le mal. Elle a lieu à la pleine lune du mois de Phalguna, qui correspond à février-mars dans le calendrier grégorien."),
            en = LocalizedContent("In which month does Holi, the festival of colors in India, take place?", listOf("December", "January", "February-March", "May"), "Culture", "Holi is a Hindu festival marking the arrival of spring and the victory of good over evil. It occurs on the full moon of the month of Phalguna, which corresponds to February-March in the Gregorian calendar."),
            zh = LocalizedContent("印度的色彩节洒红节在哪个月份举行？", listOf("十二月", "一月", "二月-三月", "五月"), "文化", "洒红节是印度教的节日，标志着春天的到来和善良战胜邪恶。它在Phalguna月的满月日举行，对应公历的二月至三月。"),
            es = LocalizedContent("¿En qué mes se celebra Holi, el festival de los colores en India?", listOf("Diciembre", "Enero", "Febrero-Marzo", "Mayo"), "Cultura", "Holi es una fiesta hindú que marca la llegada de la primavera y la victoria del bien sobre el mal. Tiene lugar en la luna llena del mes de Phalguna, que corresponde a febrero-marzo en el calendario gregoriano.")
        ),
        BilingualQuestion(
            id = 30089, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival sikh signe la récolte et l'arrivée du printemps ?", listOf("Diwali", "Baisakhi", "Lohri", "Hola Mohalla"), "Culture", "Baisakhi est une fête sikh qui marque à la fois la récolte du blé et le début du printemps, célébrée principalement au Pendjab."),
            en = LocalizedContent("Which Sikh festival marks the harvest and the arrival of spring?", listOf("Diwali", "Baisakhi", "Lohri", "Hola Mohalla"), "Culture", "Baisakhi is a Sikh festival that marks both the wheat harvest and the beginning of spring, celebrated mainly in Punjab."),
            zh = LocalizedContent("哪个锡克教节日标志着丰收和春天的到来？", listOf("排灯节", "拜萨基节", "洛赫里节", "霍拉莫哈拉节"), "文化", "拜萨基节是一个锡克教节日，既标志着小麦丰收，也标志着春天的开始，主要在旁遮普地区庆祝。"),
            es = LocalizedContent("¿Qué festival sij marca la cosecha y la llegada de la primavera?", listOf("Diwali", "Baisakhi", "Lohri", "Hola Mohalla"), "Cultura", "Baisakhi es una festividad sij que marca tanto la cosecha de trigo como el comienzo de la primavera, celebrada principalmente en Punjab.")
        ),
        BilingualQuestion(
            id = 30090, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel pays se déroule la Fête de la Musique (\"Fête de la Musique\") le 21 juin ?", listOf("Belgique", "France", "Suisse", "Canada"), "Culture", "La Fête de la Musique a été créée en France en 1982 par le ministère de la Culture, et elle est célébrée chaque 21 juin dans tout le pays."),
            en = LocalizedContent("In which country does the Fête de la Musique (\"Music Day\") take place on June 21?", listOf("Belgium", "France", "Switzerland", "Canada"), "Culture", "The Fête de la Musique was created in France in 1982 by the Ministry of Culture, and it is celebrated every June 21 throughout the country."),
            zh = LocalizedContent("哪个国家在6月21日举办音乐节（\"Fête de la Musique\"）？", listOf("比利时", "法国", "瑞士", "加拿大"), "文化", "音乐节由法国文化部于1982年创立，每年6月21日在全国范围内庆祝。"),
            es = LocalizedContent("¿En qué país se celebra la Fiesta de la Música (\"Fête de la Musique\") el 21 de junio?", listOf("Bélgica", "Francia", "Suiza", "Canadá"), "Cultura", "La Fiesta de la Música fue creada en Francia en 1982 por el Ministerio de Cultura, y se celebra cada 21 de junio en todo el país.")
        ),
        BilingualQuestion(
            id = 30091, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel festival islandais célèbre le solstice d'été avec des concerts et des événements ?", listOf("Reykjavik Blues Festival", "Secret Solstice", "Þjóðlega", "Aldrei for eg Sumar"), "Culture", "Secret Solstice est un festival de musique islandais qui se tient chaque année en juin, profitant du soleil de minuit pour proposer des concerts et événements autour du solstice d'été."),
            en = LocalizedContent("Which Icelandic festival celebrates the summer solstice with concerts and events?", listOf("Reykjavik Blues Festival", "Secret Solstice", "Þjóðlega", "Aldrei for eg Sumar"), "Culture", "Secret Solstice is an Icelandic music festival held annually in June, taking advantage of the midnight sun to offer concerts and events around the summer solstice."),
            zh = LocalizedContent("哪个冰岛节日通过音乐会和活动庆祝夏至？", listOf("雷克雅未克蓝调音乐节", "秘密夏至", "Þjóðlega", "Aldrei for eg Sumar"), "文化", "秘密夏至是一个冰岛音乐节，每年六月举行，利用午夜太阳在夏至前后举办音乐会和活动。"),
            es = LocalizedContent("¿Qué festival islandés celebra el solsticio de verano con conciertos y eventos?", listOf("Reykjavik Blues Festival", "Secret Solstice", "Þjóðlega", "Aldrei for eg Sumar"), "Cultura", "Secret Solstice es un festival de música islandés que se celebra anualmente en junio, aprovechando el sol de medianoche para ofrecer conciertos y eventos en torno al solsticio de verano.")
        ),
        BilingualQuestion(
            id = 30092, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le Festival de Cannes a-t-il commencé pour la première fois ?", listOf("1946", "1948", "1950", "1952"), "Culture", "Le Festival de Cannes devait initialement avoir lieu en 1939, mais a été annulé à cause du déclenchement de la Seconde Guerre mondiale. Il s'est finalement tenu pour la première fois en 1946."),
            en = LocalizedContent("In which year did the Cannes Film Festival first take place?", listOf("1946", "1948", "1950", "1952"), "Culture", "The Cannes Film Festival was initially scheduled for 1939 but was canceled due to the outbreak of World War II. It finally took place for the first time in 1946."),
            zh = LocalizedContent("戛纳电影节首次举办是在哪一年？", listOf("1946", "1948", "1950", "1952"), "文化", "戛纳电影节原定于1939年举行，但因第二次世界大战爆发而取消，最终于1946年首次举办。"),
            es = LocalizedContent("¿En qué año se celebró por primera vez el Festival de Cine de Cannes?", listOf("1946", "1948", "1950", "1952"), "Cultura", "El Festival de Cine de Cannes estaba inicialmente previsto para 1939, pero fue cancelado debido al estallido de la Segunda Guerra Mundial. Finalmente se celebró por primera vez en 1946.")
        ),
        BilingualQuestion(
            id = 30093, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel festival honore les ancêtres morts au Japon pendant l'Obon ?", listOf("Gion Matsuri", "Awa Odori", "Obon Odori", "Takayama Matsuri"), "Culture", "L'Obon est une tradition bouddhiste japonaise pour honorer les esprits des ancêtres, et l'Obon Odori est une danse folklorique exécutée lors de ce festival pour les accueillir."),
            en = LocalizedContent("Which festival honors deceased ancestors in Japan during Obon?", listOf("Gion Matsuri", "Awa Odori", "Obon Odori", "Takayama Matsuri"), "Culture", "Obon is a Japanese Buddhist tradition to honor the spirits of ancestors, and Obon Odori is a folk dance performed during this festival to welcome them."),
            zh = LocalizedContent("哪个节日在日本盂兰盆节期间纪念逝去的祖先？", listOf("祇园祭", "阿波舞", "盂兰盆舞", "高山祭"), "文化", "盂兰盆节是日本佛教纪念祖先灵魂的传统，盂兰盆舞是在此节日期间表演的民间舞蹈，用以欢迎祖先。"),
            es = LocalizedContent("¿Qué festival honra a los antepasados fallecidos en Japón durante el Obon?", listOf("Gion Matsuri", "Awa Odori", "Obon Odori", "Takayama Matsuri"), "Cultura", "Obon es una tradición budista japonesa para honrar a los espíritus de los antepasados, y Obon Odori es una danza folclórica realizada durante este festival para darles la bienvenida.")
        ),
        BilingualQuestion(
            id = 30094, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel pays se déroule la fête de La Tomatina, une bataille de tomates ?", listOf("Italie", "Espagne", "Portugal", "Grèce"), "Culture", "La Tomatina a lieu chaque année à Buñol, en Espagne, depuis 1945. Cette tradition est devenue un événement touristique mondialement connu."),
            en = LocalizedContent("In which country does La Tomatina, a tomato battle, take place?", listOf("Italy", "Spain", "Portugal", "Greece"), "Culture", "La Tomatina takes place annually in Buñol, Spain, since 1945. This tradition has become a world-famous tourist event."),
            zh = LocalizedContent("哪个国家举办番茄大战（La Tomatina）？", listOf("意大利", "西班牙", "葡萄牙", "希腊"), "文化", "番茄大战自1945年起每年在西班牙布尼奥尔举行，这一传统已成为世界闻名的旅游活动。"),
            es = LocalizedContent("¿En qué país se celebra La Tomatina, una batalla de tomates?", listOf("Italia", "España", "Portugal", "Grecia"), "Cultura", "La Tomatina se celebra anualmente en Buñol, España, desde 1945. Esta tradición se ha convertido en un evento turístico mundialmente conocido.")
        ),
        BilingualQuestion(
            id = 30095, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel festival sud-coréen célèbre la culture pop et l'art électronique ?", listOf("Seoul Jazz Festival", "Korea Queer Film Festival", "Busan International Film Festival", "Ultra Music Festival Korea"), "Culture", "Le Busan International Film Festival est un événement majeur dédié au cinéma asiatique et international, mais il ne célèbre pas spécifiquement la culture pop et l'art électronique."),
            en = LocalizedContent("Which South Korean festival celebrates pop culture and electronic art?", listOf("Seoul Jazz Festival", "Korea Queer Film Festival", "Busan International Film Festival", "Ultra Music Festival Korea"), "Culture", "The Busan International Film Festival is a major event dedicated to Asian and international cinema, but it does not specifically celebrate pop culture and electronic art."),
            zh = LocalizedContent("哪个韩国节日庆祝流行文化和电子艺术？", listOf("首尔爵士音乐节", "韩国酷儿电影节", "釜山国际电影节", "韩国超音乐节"), "文化", "釜山国际电影节是一个致力于亚洲和国际电影的重要活动，但并不专门庆祝流行文化和电子艺术。"),
            es = LocalizedContent("¿Qué festival surcoreano celebra la cultura pop y el arte electrónico?", listOf("Seoul Jazz Festival", "Korea Queer Film Festival", "Busan International Film Festival", "Ultra Music Festival Korea"), "Cultura", "El Festival Internacional de Cine de Busan es un evento importante dedicado al cine asiático e internacional, pero no celebra específicamente la cultura pop y el arte electrónico.")
        ),
        BilingualQuestion(
            id = 30096, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel pays célèbre-t-on Beltane, un festival celtique ancien marquant le début de l'été ?", listOf("Irlande", "Écosse", "Pays de Galles", "Angleterre"), "Culture", "Beltane est une fête celtique traditionnellement célébrée en Écosse, ainsi que dans d'autres régions celtiques comme l'Irlande, pour marquer le début de l'été."),
            en = LocalizedContent("In which country is Beltane, an ancient Celtic festival marking the start of summer, celebrated?", listOf("Ireland", "Scotland", "Wales", "England"), "Culture", "Beltane is a traditional Celtic festival celebrated in Scotland, as well as in other Celtic regions like Ireland, to mark the beginning of summer."),
            zh = LocalizedContent("哪个国家庆祝贝尔坦节，一个标志着夏季开始的古老凯尔特节日？", listOf("爱尔兰", "苏格兰", "威尔士", "英格兰"), "文化", "贝尔坦节是一个传统的凯尔特节日，在苏格兰以及爱尔兰等其他凯尔特地区庆祝，标志着夏季的开始。"),
            es = LocalizedContent("¿En qué país se celebra Beltane, un antiguo festival celta que marca el inicio del verano?", listOf("Irlanda", "Escocia", "Gales", "Inglaterra"), "Cultura", "Beltane es una festividad celta tradicional celebrada en Escocia, así como en otras regiones celtas como Irlanda, para marcar el comienzo del verano.")
        ),
        BilingualQuestion(
            id = 30097, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel festival marocain honore les traditions berbères avec musique et danse ?", listOf("Gnaoua World Music", "Timitar", "Festival de Fès", "Moussem de Tanouda"), "Culture", "Timitar, qui signifie \"signes\" en berbère, est un festival annuel à Agadir dédié à la musique et à la danse amazighes, mettant en valeur les traditions berbères du Maroc."),
            en = LocalizedContent("Which Moroccan festival honors Berber traditions with music and dance?", listOf("Gnaoua World Music", "Timitar", "Festival de Fès", "Moussem de Tanouda"), "Culture", "Timitar, meaning \"signs\" in Berber, is an annual festival in Agadir dedicated to Amazigh music and dance, showcasing the Berber traditions of Morocco."),
            zh = LocalizedContent("哪个摩洛哥节日通过音乐和舞蹈纪念柏柏尔传统？", listOf("格纳瓦世界音乐节", "提米塔节", "非斯节", "塔努达集市"), "文化", "提米塔节在柏柏尔语中意为“标志”，是阿加迪尔一年一度的节日，致力于阿马齐格音乐和舞蹈，展示摩洛哥的柏柏尔传统。"),
            es = LocalizedContent("¿Qué festival marroquí honra las tradiciones bereberes con música y danza?", listOf("Gnaoua World Music", "Timitar", "Festival de Fès", "Moussem de Tanouda"), "Cultura", "Timitar, que significa \"señales\" en bereber, es un festival anual en Agadir dedicado a la música y danza amazigh, mostrando las tradiciones bereberes de Marruecos.")
        ),
        BilingualQuestion(
            id = 30098, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année a eu lieu la première édition du Festival de Glastonbury en Angleterre ?", listOf("1970", "1971", "1972", "1973"), "Culture", "Le premier festival de Glastonbury, alors appelé Pilton Pop, Blues & Folk Festival, s'est tenu en 1970, un jour après la mort de Jimi Hendrix, avec environ 1 500 spectateurs."),
            en = LocalizedContent("In which year did the first Glastonbury Festival take place in England?", listOf("1970", "1971", "1972", "1973"), "Culture", "The first Glastonbury Festival, then called the Pilton Pop, Blues & Folk Festival, took place in 1970, one day after the death of Jimi Hendrix, with about 1,500 attendees."),
            zh = LocalizedContent("英国格拉斯顿伯里音乐节首次举办是在哪一年？", listOf("1970", "1971", "1972", "1973"), "文化", "第一届格拉斯顿伯里音乐节当时称为皮尔顿流行、蓝调和民间音乐节，于1970年举行，在吉米·亨德里克斯去世后一天，约有1500名观众。"),
            es = LocalizedContent("¿En qué año tuvo lugar la primera edición del Festival de Glastonbury en Inglaterra?", listOf("1970", "1971", "1972", "1973"), "Cultura", "El primer Festival de Glastonbury, entonces llamado Pilton Pop, Blues & Folk Festival, se celebró en 1970, un día después de la muerte de Jimi Hendrix, con unos 1.500 asistentes.")
        ),
        BilingualQuestion(
            id = 30099, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel festival chinois marque l'anniversaire du Bouddha Goutama avec des processions ?", listOf("Fête du Bateau-Dragon", "Fête des Lanternes", "Fête de la Mid-Autumn", "Vesak"), "Culture", "Vesak, aussi appelé Wesak, est le festival bouddhiste le plus important, célébré en Asie du Sud-Est et en Chine, commémorant la naissance, l'illumination et la mort de Bouddha Goutama. Les processions et lanternes sont des éléments clés de cette fête."),
            en = LocalizedContent("Which Chinese festival marks the anniversary of Buddha Gautama with processions?", listOf("Dragon Boat Festival", "Lantern Festival", "Mid-Autumn Festival", "Vesak"), "Culture", "Vesak, also called Wesak, is the most important Buddhist festival, celebrated in Southeast Asia and China, commemorating the birth, enlightenment, and death of Buddha Gautama. Processions and lanterns are key elements of this festival."),
            zh = LocalizedContent("哪个中国节日以游行纪念佛陀乔达摩的诞辰？", listOf("端午节", "元宵节", "中秋节", "卫塞节"), "文化", "卫塞节，又称 Wesak，是最重要的佛教节日，在东南亚和中国庆祝，纪念佛陀乔达摩的诞生、成道和涅槃。游行和灯笼是这个节日的关键元素。"),
            es = LocalizedContent("¿Qué festival chino marca el aniversario de Buda Gautama con procesiones?", listOf("Festival del Bote del Dragón", "Festival de los Faroles", "Festival del Medio Otoño", "Vesak"), "Cultura", "Vesak, también llamado Wesak, es el festival budista más importante, celebrado en el sudeste asiático y China, que conmemora el nacimiento, la iluminación y la muerte de Buda Gautama. Las procesiones y las linternas son elementos clave de esta festividad.")
        ),
        BilingualQuestion(
            id = 30100, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel pays le Carnival of Trinidad and Tobago est-il célébré avec des costumes colorés ?", listOf("Jamaïque", "Haïti", "Trinidad-et-Tobago", "Barbade"), "Culture", "Le carnaval est une fête nationale à Trinidad-et-Tobago, célèbre pour ses défilés de costumes élaborés et sa musique calypso. Il se déroule juste avant le Carême."),
            en = LocalizedContent("In which country is the Carnival of Trinidad and Tobago celebrated with colorful costumes?", listOf("Jamaica", "Haiti", "Trinidad and Tobago", "Barbados"), "Culture", "The carnival is a national festival in Trinidad and Tobago, famous for its elaborate costume parades and calypso music. It takes place just before Lent."),
            zh = LocalizedContent("哪个国家以色彩缤纷的服装庆祝特立尼达和多巴哥狂欢节？", listOf("牙买加", "海地", "特立尼达和多巴哥", "巴巴多斯"), "文化", "狂欢节是特立尼达和多巴哥的全国性节日，以其精心制作的服装游行和卡利普索音乐而闻名。它在四旬期之前举行。"),
            es = LocalizedContent("¿En qué país se celebra el Carnaval de Trinidad y Tobago con coloridos disfraces?", listOf("Jamaica", "Haití", "Trinidad y Tobago", "Barbados"), "Cultura", "El carnaval es una fiesta nacional en Trinidad y Tobago, famosa por sus elaborados desfiles de disfraces y música calipso. Se celebra justo antes de la Cuaresma.")
        ),
        BilingualQuestion(
            id = 30101, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays le sushi est-il originaire ?", listOf("Chine", "Japon", "Corée", "Thaïlande"), "Gastronomie", "Le sushi est un plat traditionnel japonais à base de riz vinaigré accompagné de poisson cru ou d'autres ingrédients. Ses origines remontent au Japon, où il a évolué à partir de méthodes de conservation du poisson."),
            en = LocalizedContent("In which country did sushi originate?", listOf("China", "Japan", "Korea", "Thailand"), "Gastronomy", "Sushi is a traditional Japanese dish of vinegared rice accompanied by raw fish or other ingredients. Its origins date back to Japan, where it evolved from fish preservation methods."),
            zh = LocalizedContent("寿司起源于哪个国家？", listOf("中国", "日本", "韩国", "泰国"), "美食", "寿司是一种传统的日本料理，由醋饭搭配生鱼或其他食材制成。其起源可追溯到日本，从鱼类保存方法演变而来。"),
            es = LocalizedContent("¿En qué país se originó el sushi?", listOf("China", "Japón", "Corea", "Tailandia"), "Gastronomía", "El sushi es un plato tradicional japonés de arroz avinagrado acompañado de pescado crudo u otros ingredientes. Sus orígenes se remontan a Japón, donde evolucionó a partir de métodos de conservación del pescado.")
        ),
        BilingualQuestion(
            id = 30102, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat brésilien traditionnel fait de haricots noirs et de porc ?", listOf("Moqueca", "Feijoada", "Pão de Queijo", "Brigadeiro"), "Gastronomie", "La feijoada est un ragoût de haricots noirs et de viande de porc, considéré comme le plat national du Brésil, hérité des traditions culinaires portugaises et africaines."),
            en = LocalizedContent("What is the traditional Brazilian dish made of black beans and pork?", listOf("Moqueca", "Feijoada", "Pão de Queijo", "Brigadeiro"), "Gastronomy", "Feijoada is a stew of black beans and pork, considered the national dish of Brazil, inherited from Portuguese and African culinary traditions."),
            zh = LocalizedContent("哪种传统的巴西菜由黑豆和猪肉制成？", listOf("莫克卡", "腓秀雅杂", "奶酪面包", "布里加德罗"), "美食", "腓秀雅杂是一种黑豆和猪肉炖菜，被认为是巴西的国菜，源自葡萄牙和非洲的烹饪传统。"),
            es = LocalizedContent("¿Cuál es el plato tradicional brasileño hecho de frijoles negros y cerdo?", listOf("Moqueca", "Feijoada", "Pão de Queijo", "Brigadeiro"), "Gastronomía", "La feijoada es un guiso de frijoles negros y carne de cerdo, considerado el plato nacional de Brasil, heredado de las tradiciones culinarias portuguesas y africanas.")
        ),
        BilingualQuestion(
            id = 30103, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays le curry est-il un plat traditionnel emblématique ?", listOf("Thaïlande", "Malaisie", "Inde", "Vietnam"), "Gastronomie", "Le curry est un mélange d'épices originaire du sous-continent indien, où il est utilisé dans de nombreux plats traditionnels depuis des siècles."),
            en = LocalizedContent("In which country is curry an emblematic traditional dish?", listOf("Thailand", "Malaysia", "India", "Vietnam"), "Gastronomy", "Curry is a spice blend originating from the Indian subcontinent, where it has been used in many traditional dishes for centuries."),
            zh = LocalizedContent("咖喱是哪个国家的标志性传统菜肴？", listOf("泰国", "马来西亚", "印度", "越南"), "美食", "咖喱是一种起源于印度次大陆的香料混合物，几个世纪以来一直用于许多传统菜肴中。"),
            es = LocalizedContent("¿En qué país es el curry un plato tradicional emblemático?", listOf("Tailandia", "Malasia", "India", "Vietnam"), "Gastronomía", "El curry es una mezcla de especias originaria del subcontinente indio, donde se ha utilizado en muchos platos tradicionales durante siglos.")
        ),
        BilingualQuestion(
            id = 30104, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel aliment mexicain traditionnel est préparé à partir de masa (pâte de maïs) ?", listOf("Enchilada", "Tamales", "Tacos", "Tous les trois"), "Gastronomie", "Les tacos, les tamales et les gorditas sont tous préparés à partir de masa, une pâte de maïs nixtamalisée, ingrédient de base de la cuisine mexicaine."),
            en = LocalizedContent("Which traditional Mexican food is prepared from masa (corn dough)?", listOf("Enchilada", "Tamales", "Tacos", "All three"), "Gastronomy", "Tacos, tamales, and gorditas are all prepared from masa, a nixtamalized corn dough, a staple ingredient in Mexican cuisine."),
            zh = LocalizedContent("哪种传统的墨西哥食物是用马萨（玉米面团）制作的？", listOf("恩奇拉达", "塔马利", "塔可", "以上都是"), "美食", "塔可、塔马利和戈尔迪塔都是用马萨制作的，马萨是一种经过碱法处理的玉米面团，是墨西哥菜的基本食材。"),
            es = LocalizedContent("¿Qué alimento tradicional mexicano se prepara a partir de masa (masa de maíz)?", listOf("Enchilada", "Tamales", "Tacos", "Los tres"), "Gastronomía", "Los tacos, los tamales y las gorditas se preparan todos a partir de masa, una masa de maíz nixtamalizada, ingrediente básico de la cocina mexicana.")
        ),
        BilingualQuestion(
            id = 30105, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays le pho (soupe de nouilles) est-il le plat national ?", listOf("Thaïlande", "Vietnam", "Laos", "Cambodge"), "Gastronomie", "Le pho est une soupe de nouilles emblématique originaire du Nord du Vietnam, devenue un symbole culinaire national et un incontournable de la street food vietnamienne."),
            en = LocalizedContent("In which country is pho (noodle soup) the national dish?", listOf("Thailand", "Vietnam", "Laos", "Cambodia"), "Gastronomy", "Pho is an iconic noodle soup originating from Northern Vietnam, which has become a national culinary symbol and a staple of Vietnamese street food."),
            zh = LocalizedContent("河粉（面条汤）是哪个国家的国菜？", listOf("泰国", "越南", "老挝", "柬埔寨"), "美食", "河粉是一种标志性的面条汤，起源于越南北部，已成为国家烹饪象征和越南街头美食的主打。"),
            es = LocalizedContent("¿En qué país es el pho (sopa de fideos) el plato nacional?", listOf("Tailandia", "Vietnam", "Laos", "Camboya"), "Gastronomía", "El pho es una sopa de fideos emblemática originaria del norte de Vietnam, que se ha convertido en un símbolo culinario nacional y un elemento básico de la comida callejera vietnamita.")
        ),
        BilingualQuestion(
            id = 30106, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le condiment espagnol traditionnel à base de tomates broyées et d'ail ?", listOf("Gazpacho", "Salsa", "Paella", "Tortilla"), "Gastronomie", "Le gazpacho est une soupe froide andalouse traditionnellement préparée avec des tomates broyées, de l'ail, du pain, de l'huile d'olive et du vinaigre."),
            en = LocalizedContent("What is the traditional Spanish condiment made from crushed tomatoes and garlic?", listOf("Gazpacho", "Salsa", "Paella", "Tortilla"), "Gastronomy", "Gazpacho is a cold Andalusian soup traditionally made with crushed tomatoes, garlic, bread, olive oil, and vinegar."),
            zh = LocalizedContent("哪种传统的西班牙调味品由碎番茄和大蒜制成？", listOf("西班牙冷汤", "莎莎酱", "海鲜饭", "西班牙土豆饼"), "美食", "西班牙冷汤是一种安达卢西亚冷汤，传统上用碎番茄、大蒜、面包、橄榄油和醋制成。"),
            es = LocalizedContent("¿Cuál es el condimento tradicional español hecho de tomates triturados y ajo?", listOf("Gazpacho", "Salsa", "Paella", "Tortilla"), "Gastronomía", "El gazpacho es una sopa fría andaluza tradicionalmente preparada con tomates triturados, ajo, pan, aceite de oliva y vinagre.")
        ),
        BilingualQuestion(
            id = 30107, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays les momos (boulettes fourrées) sont-elles un aliment populaire ?", listOf("Inde", "Népal et Tibet", "Japon", "Thaïlande"), "Gastronomie", "Les momos sont originaires du Tibet et du Népal, où ils sont un plat de rue emblématique, souvent farcis de viande ou de légumes et cuits à la vapeur."),
            en = LocalizedContent("In which country are momos (filled dumplings) a popular food?", listOf("India", "Nepal and Tibet", "Japan", "Thailand"), "Gastronomy", "Momos originated in Tibet and Nepal, where they are an iconic street food, often filled with meat or vegetables and steamed."),
            zh = LocalizedContent("哪个国家流行莫莫（带馅的饺子）？", listOf("印度", "尼泊尔和西藏", "日本", "泰国"), "美食", "莫莫起源于西藏和尼泊尔，是一种标志性的街头食品，通常以肉或蔬菜为馅，蒸制而成。"),
            es = LocalizedContent("¿En qué país son populares los momos (empanadillas rellenas)?", listOf("India", "Nepal y Tíbet", "Japón", "Tailandia"), "Gastronomía", "Los momos se originaron en el Tíbet y Nepal, donde son una comida callejera emblemática, a menudo rellenos de carne o verduras y cocidos al vapor.")
        ),
        BilingualQuestion(
            id = 30108, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel plat italien traditionnel est à base de risotto et de safran ?", listOf("Lasagne", "Risotto alla Milanese", "Osso Buco", "Polenta"), "Gastronomie", "Le risotto alla Milanese est un plat typique de Milan, dont la couleur jaune et le goût distinctif viennent du safran, une épice précieuse utilisée dans la cuisine lombarde depuis la Renaissance."),
            en = LocalizedContent("Which traditional Italian dish is based on risotto and saffron?", listOf("Lasagna", "Risotto alla Milanese", "Osso Buco", "Polenta"), "Gastronomy", "Risotto alla Milanese is a typical dish from Milan, whose yellow color and distinctive flavor come from saffron, a precious spice used in Lombard cuisine since the Renaissance."),
            zh = LocalizedContent("哪种传统的意大利菜以意大利调味饭和藏红花为基础？", listOf("千层面", "米兰式意大利调味饭", "炖小牛膝", "玉米粥"), "美食", "米兰式意大利调味饭是米兰的典型菜肴，其黄色和独特风味来自藏红花，这是一种自文艺复兴以来在伦巴第烹饪中使用的珍贵香料。"),
            es = LocalizedContent("¿Qué plato tradicional italiano se basa en risotto y azafrán?", listOf("Lasaña", "Risotto alla Milanese", "Osso Buco", "Polenta"), "Gastronomía", "El risotto alla Milanese es un plato típico de Milán, cuyo color amarillo y sabor distintivo provienen del azafrán, una especia preciosa utilizada en la cocina lombarda desde el Renacimiento.")
        ),
        BilingualQuestion(
            id = 30109, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel pays la paella, un mélange de riz et de fruits de mer, est-elle originaire ?", listOf("Portugal", "Italie", "Espagne", "Grèce"), "Gastronomie", "La paella est un plat traditionnel de la région de Valence, en Espagne, où le riz est cultivé depuis l'époque médiévale."),
            en = LocalizedContent("In which country does paella, a mix of rice and seafood, originate?", listOf("Portugal", "Italy", "Spain", "Greece"), "Gastronomy", "Paella is a traditional dish from the Valencia region in Spain, where rice has been cultivated since medieval times."),
            zh = LocalizedContent("海鲜饭（一种米饭和海鲜的混合菜肴）起源于哪个国家？", listOf("葡萄牙", "意大利", "西班牙", "希腊"), "美食", "海鲜饭是西班牙瓦伦西亚地区的传统菜肴，该地区自中世纪以来就种植水稻。"),
            es = LocalizedContent("¿En qué país se origina la paella, una mezcla de arroz y mariscos?", listOf("Portugal", "Italia", "España", "Grecia"), "Gastronomía", "La paella es un plato tradicional de la región de Valencia, en España, donde se cultiva arroz desde la época medieval.")
        ),
        BilingualQuestion(
            id = 30110, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat éthiopien traditionnel servi sur du pain plat (injera) ?", listOf("Mofongo", "Doro Wat", "Jollof Rice", "Moqueca"), "Gastronomie", "Le Doro Wat est un ragoût de poulet épicé, considéré comme le plat national éthiopien, traditionnellement servi sur une grande crêpe fermentée appelée injera."),
            en = LocalizedContent("What is the traditional Ethiopian dish served on flatbread (injera)?", listOf("Mofongo", "Doro Wat", "Jollof Rice", "Moqueca"), "Gastronomy", "Doro Wat is a spicy chicken stew considered the national dish of Ethiopia, traditionally served on a large fermented crepe called injera."),
            zh = LocalizedContent("哪种传统埃塞俄比亚菜肴是放在薄饼（英吉拉）上食用的？", listOf("莫丰戈", "多罗瓦特", "乔洛夫米饭", "莫克卡"), "美食", "多罗瓦特是一种辛辣的鸡肉炖菜，被认为是埃塞俄比亚的国菜，传统上放在一种叫做英吉拉的大发酵薄饼上食用。"),
            es = LocalizedContent("¿Cuál es el plato tradicional etíope servido sobre pan plano (injera)?", listOf("Mofongo", "Doro Wat", "Jollof Rice", "Moqueca"), "Gastronomía", "El Doro Wat es un guiso de pollo picante considerado el plato nacional de Etiopía, servido tradicionalmente sobre una gran crepe fermentada llamada injera.")
        ),
        BilingualQuestion(
            id = 30111, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel pays le couscous est-il le plat traditionnel principal ?", listOf("Égypte", "Maroc", "Libye", "Irak"), "Gastronomie", "Le couscous est un plat emblématique du Maghreb, et le Maroc en a fait son plat national, bien qu'il soit aussi traditionnel en Algérie et en Tunisie."),
            en = LocalizedContent("In which country is couscous the main traditional dish?", listOf("Egypt", "Morocco", "Libya", "Iraq"), "Gastronomy", "Couscous is an emblematic dish of the Maghreb, and Morocco has made it its national dish, although it is also traditional in Algeria and Tunisia."),
            zh = LocalizedContent("库斯库斯是哪个国家的主要传统菜肴？", listOf("埃及", "摩洛哥", "利比亚", "伊拉克"), "美食", "库斯库斯是马格里布地区的标志性菜肴，摩洛哥将其定为国菜，尽管它在阿尔及利亚和突尼斯也是传统菜肴。"),
            es = LocalizedContent("¿En qué país es el cuscús el plato tradicional principal?", listOf("Egipto", "Marruecos", "Libia", "Irak"), "Gastronomía", "El cuscús es un plato emblemático del Magreb, y Marruecos lo ha hecho su plato nacional, aunque también es tradicional en Argelia y Túnez.")
        ),
        BilingualQuestion(
            id = 30112, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat libanais traditionnel à base de pois chiches et de tahin ?", listOf("Falafel", "Hummus", "Tabbouleh", "Kibbeh"), "Gastronomie", "Le houmous est une purée de pois chiches mélangée à de la crème de sésame (tahin), de l'huile d'olive et du citron, un plat emblématique du Liban et du Moyen-Orient."),
            en = LocalizedContent("What is the traditional Lebanese dish made from chickpeas and tahini?", listOf("Falafel", "Hummus", "Tabbouleh", "Kibbeh"), "Gastronomy", "Hummus is a puree of chickpeas mixed with sesame cream (tahini), olive oil, and lemon, an emblematic dish of Lebanon and the Middle East."),
            zh = LocalizedContent("哪种传统黎巴嫩菜肴是用鹰嘴豆和芝麻酱制成的？", listOf("法拉费", "鹰嘴豆泥", "塔布勒沙拉", "基贝"), "美食", "鹰嘴豆泥是一种鹰嘴豆泥与芝麻酱、橄榄油和柠檬混合而成的泥状菜肴，是黎巴嫩和中东地区的标志性菜肴。"),
            es = LocalizedContent("¿Cuál es el plato tradicional libanés hecho de garbanzos y tahini?", listOf("Falafel", "Hummus", "Tabbouleh", "Kibbeh"), "Gastronomía", "El hummus es un puré de garbanzos mezclado con crema de sésamo (tahini), aceite de oliva y limón, un plato emblemático del Líbano y Oriente Medio.")
        ),
        BilingualQuestion(
            id = 30113, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel pays la kimchi (légumes fermentés) est-elle un accompagnement traditionnel à chaque repas ?", listOf("Japon", "Chine", "Corée du Sud", "Vietnam"), "Gastronomie", "Le kimchi est un plat national sud-coréen, préparé avec du chou fermenté et des épices, servi systématiquement en accompagnement à tous les repas."),
            en = LocalizedContent("In which country is kimchi (fermented vegetables) a traditional side dish at every meal?", listOf("Japan", "China", "South Korea", "Vietnam"), "Gastronomy", "Kimchi is a South Korean national dish, made from fermented cabbage and spices, served systematically as a side dish at all meals."),
            zh = LocalizedContent("泡菜（发酵蔬菜）是哪个国家每餐的传统配菜？", listOf("日本", "中国", "韩国", "越南"), "美食", "泡菜是韩国的国菜，由发酵的卷心菜和香料制成，每餐都作为配菜食用。"),
            es = LocalizedContent("¿En qué país es el kimchi (verduras fermentadas) un acompañamiento tradicional en cada comida?", listOf("Japón", "China", "Corea del Sur", "Vietnam"), "Gastronomía", "El kimchi es un plato nacional de Corea del Sur, preparado con col fermentada y especias, servido sistemáticamente como acompañamiento en todas las comidas.")
        ),
        BilingualQuestion(
            id = 30114, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel plat indien blanc à base de riz, lentilles et épices est populaire dans le sud ?", listOf("Dosa", "Idli", "Uttapam", "Puri"), "Gastronomie", "L'idli est un gâteau de riz et de lentilles fermenté, cuit à la vapeur, originaire du sud de l'Inde où il est un petit-déjeuner courant."),
            en = LocalizedContent("What white Indian dish made from rice, lentils, and spices is popular in the south?", listOf("Dosa", "Idli", "Uttapam", "Puri"), "Gastronomy", "Idli is a steamed cake of fermented rice and lentils, originating from South India where it is a common breakfast."),
            zh = LocalizedContent("哪种用大米、扁豆和香料制成的白色印度菜肴在南方很受欢迎？", listOf("多萨", "伊德利", "乌塔帕姆", "普里"), "美食", "伊德利是一种发酵大米和扁豆蒸制的糕饼，起源于印度南部，是常见的早餐。"),
            es = LocalizedContent("¿Qué plato indio blanco hecho de arroz, lentejas y especias es popular en el sur?", listOf("Dosa", "Idli", "Uttapam", "Puri"), "Gastronomía", "El idli es un pastel de arroz y lentejas fermentado, cocido al vapor, originario del sur de la India, donde es un desayuno común.")
        ),
        BilingualQuestion(
            id = 30115, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel pays le pad thai (nouilles sautées) est-il le plat national ?", listOf("Malaisie", "Vietnam", "Thaïlande", "Laos"), "Gastronomie", "Le pad thai est un plat de nouilles de riz sauté popularisé dans les années 1930-40 en Thaïlande dans le cadre d'une campagne nationaliste, devenant un symbole culinaire du pays."),
            en = LocalizedContent("In which country is pad thai (stir-fried noodles) the national dish?", listOf("Malaysia", "Vietnam", "Thailand", "Laos"), "Gastronomy", "Pad thai is a stir-fried rice noodle dish popularized in the 1930s-40s in Thailand as part of a nationalist campaign, becoming a culinary symbol of the country."),
            zh = LocalizedContent("泰式炒河粉（炒面）是哪个国家的国菜？", listOf("马来西亚", "越南", "泰国", "老挝"), "美食", "泰式炒河粉是一种炒米粉菜肴，在20世纪30-40年代作为民族主义运动的一部分在泰国推广，成为该国的烹饪象征。"),
            es = LocalizedContent("¿En qué país es el pad thai (fideos salteados) el plato nacional?", listOf("Malasia", "Vietnam", "Tailandia", "Laos"), "Gastronomía", "El pad thai es un plato de fideos de arroz salteados popularizado en las décadas de 1930-40 en Tailandia como parte de una campaña nacionalista, convirtiéndose en un símbolo culinario del país.")
        ),
        BilingualQuestion(
            id = 30116, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plat français traditionnel à base de escargots cuisinés avec du beurre, de l'ail et du persil ?", listOf("Crêpes", "Escargots à la Bourguignonne", "Pot-au-feu", "Blanquette"), "Gastronomie", "Les escargots à la Bourguignonne sont une spécialité de la région de Bourgogne, où ils sont préparés avec du beurre, de l'ail et du persil avant d'être cuits au four."),
            en = LocalizedContent("What is the traditional French dish made from snails cooked with butter, garlic, and parsley?", listOf("Crêpes", "Escargots à la Bourguignonne", "Pot-au-feu", "Blanquette"), "Gastronomy", "Escargots à la Bourguignonne are a specialty from the Burgundy region, where they are prepared with butter, garlic, and parsley before being baked in the oven."),
            zh = LocalizedContent("哪种传统法国菜肴是用黄油、大蒜和欧芹烹制的蜗牛？", listOf("可丽饼", "勃艮第蜗牛", "蔬菜牛肉汤", "白汁炖肉"), "美食", "勃艮第蜗牛是勃艮第地区的特色菜，用黄油、大蒜和欧芹调味后烤制而成。"),
            es = LocalizedContent("¿Cuál es el plato tradicional francés hecho de caracoles cocinados con mantequilla, ajo y perejil?", listOf("Crêpes", "Escargots à la Bourguignonne", "Pot-au-feu", "Blanquette"), "Gastronomía", "Los escargots à la Bourguignonne son una especialidad de la región de Borgoña, donde se preparan con mantequilla, ajo y perejil antes de hornearlos.")
        ),
        BilingualQuestion(
            id = 30117, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel pays le jerk chicken (poulet épicé) est-il une spécialité culinaire ?", listOf("Trinité-et-Tobago", "Haïti", "Jamaïque", "Barbade"), "Gastronomie", "Le jerk chicken est originaire de Jamaïque, où il est mariné avec un mélange d'épices appelé jerk, puis grillé traditionnellement sur du bois de piment."),
            en = LocalizedContent("In which country is jerk chicken (spicy chicken) a culinary specialty?", listOf("Trinidad and Tobago", "Haiti", "Jamaica", "Barbados"), "Gastronomy", "Jerk chicken originates from Jamaica, where it is marinated with a spice mixture called jerk and then traditionally grilled over pimento wood."),
            zh = LocalizedContent("牙买加烤鸡（辣味鸡肉）是哪个国家的烹饪特色？", listOf("特立尼达和多巴哥", "海地", "牙买加", "巴巴多斯"), "美食", "牙买加烤鸡起源于牙买加，用名为“jerk”的香料混合物腌制，然后传统上在多香果木上烤制。"),
            es = LocalizedContent("¿En qué país es el jerk chicken (pollo picante) una especialidad culinaria?", listOf("Trinidad y Tobago", "Haití", "Jamaica", "Barbados"), "Gastronomía", "El jerk chicken es originario de Jamaica, donde se marina con una mezcla de especias llamada jerk y luego se asa tradicionalmente sobre madera de pimiento.")
        ),
        BilingualQuestion(
            id = 30118, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plat marocain traditionnel à base de viande, fruits secs et épices cuits lentement ?", listOf("Couscous", "Tajine", "Pastilla", "Msemmen"), "Gastronomie", "Le tajine tire son nom du plat en terre cuite dans lequel il cuit lentement, permettant aux viandes, fruits secs et épices de mijoter pour développer des saveurs riches et complexes."),
            en = LocalizedContent("What is the traditional Moroccan dish made from meat, dried fruits, and spices cooked slowly?", listOf("Couscous", "Tajine", "Pastilla", "Msemmen"), "Gastronomy", "Tajine takes its name from the earthenware pot in which it is slowly cooked, allowing meats, dried fruits, and spices to simmer and develop rich, complex flavors."),
            zh = LocalizedContent("哪种传统摩洛哥菜肴是用肉类、干果和香料慢炖而成的？", listOf("库斯库斯", "塔吉锅", "帕斯蒂拉", "姆塞门"), "美食", "塔吉锅以其使用的陶锅命名，肉类、干果和香料在其中慢炖，形成丰富而复杂的风味。"),
            es = LocalizedContent("¿Cuál es el plato tradicional marroquí hecho de carne, frutos secos y especias cocidos lentamente?", listOf("Cuscús", "Tajine", "Pastilla", "Msemmen"), "Gastronomía", "El tajine toma su nombre de la olla de barro en la que se cocina lentamente, permitiendo que las carnes, frutos secos y especias se cocinen a fuego lento para desarrollar sabores ricos y complejos.")
        ),
        BilingualQuestion(
            id = 30119, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel pays la poutine (frites, sauce brune et fromage) est-elle une spécialité locale ?", listOf("États-Unis", "Canada", "Australie", "Nouvelle-Zélande"), "Gastronomie", "La poutine est originaire du Québec, une province du Canada, où elle a été créée dans les années 1950. Ce plat combine frites, sauce brune et fromage en grains."),
            en = LocalizedContent("In which country is poutine (fries, brown gravy, and cheese curds) a local specialty?", listOf("United States", "Canada", "Australia", "New Zealand"), "Gastronomy", "Poutine originated in Quebec, a province of Canada, where it was created in the 1950s. This dish combines fries, brown gravy, and cheese curds."),
            zh = LocalizedContent("普丁（薯条、棕色肉汁和奶酪凝乳）是哪个国家的当地特色菜？", listOf("美国", "加拿大", "澳大利亚", "新西兰"), "美食", "普丁起源于加拿大魁北克省，于20世纪50年代创造。这道菜结合了薯条、棕色肉汁和奶酪凝乳。"),
            es = LocalizedContent("¿En qué país la poutine (patatas fritas, salsa marrón y queso en grano) es una especialidad local?", listOf("Estados Unidos", "Canadá", "Australia", "Nueva Zelanda"), "Gastronomía", "La poutine es originaria de Quebec, una provincia de Canadá, donde se creó en la década de 1950. Este plato combina patatas fritas, salsa marrón y queso en grano.")
        ),
        BilingualQuestion(
            id = 30120, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plat turc traditionnel à base de viande grillée dans du pain pita ?", listOf("Kebab", "Döner", "Lahmacun", "Tandir"), "Gastronomie", "Le döner est préparé avec de la viande (agneau, bœuf ou poulet) cuite à la verticale sur une broche, puis tranchée finement et servie dans du pain pita."),
            en = LocalizedContent("What is the traditional Turkish dish of grilled meat in pita bread?", listOf("Kebab", "Döner", "Lahmacun", "Tandir"), "Gastronomy", "Döner is prepared with meat (lamb, beef, or chicken) cooked on a vertical spit, then thinly sliced and served in pita bread."),
            zh = LocalizedContent("传统的土耳其烤肉夹饼是什么？", listOf("烤肉串", "土耳其烤肉", "拉赫马琼", "坦迪尔"), "美食", "土耳其烤肉是将肉（羊肉、牛肉或鸡肉）在垂直烤叉上烤制，然后切成薄片，夹在皮塔饼中食用。"),
            es = LocalizedContent("¿Cuál es el plato tradicional turco de carne a la parrilla en pan pita?", listOf("Kebab", "Döner", "Lahmacun", "Tandir"), "Gastronomía", "El döner se prepara con carne (cordero, ternera o pollo) cocinada en un asador vertical, luego se corta finamente y se sirve en pan pita.")
        ),
        BilingualQuestion(
            id = 30121, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel pays la poke (poisson cru dés avec sauce) est-elle originaire ?", listOf("Samoa", "Fidji", "Hawaii", "Nouvelle-Zélande"), "Gastronomie", "La poke est un plat traditionnel hawaïen à base de poisson cru mariné, ancré dans la culture polynésienne de l'archipel."),
            en = LocalizedContent("In which country did poke (diced raw fish with sauce) originate?", listOf("Samoa", "Fiji", "Hawaii", "New Zealand"), "Gastronomy", "Poke is a traditional Hawaiian dish made from marinated raw fish, rooted in the Polynesian culture of the archipelago."),
            zh = LocalizedContent("夏威夷鱼生饭（切块生鱼配酱汁）起源于哪个国家？", listOf("萨摩亚", "斐济", "夏威夷", "新西兰"), "美食", "夏威夷鱼生饭是夏威夷的传统菜肴，由腌制生鱼制成，根植于该群岛的波利尼西亚文化。"),
            es = LocalizedContent("¿En qué país se originó el poke (pescado crudo en dados con salsa)?", listOf("Samoa", "Fiyi", "Hawái", "Nueva Zelanda"), "Gastronomía", "El poke es un plato tradicional hawaiano hecho de pescado crudo marinado, arraigado en la cultura polinesia del archipiélago.")
        ),
        BilingualQuestion(
            id = 30122, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plat sénégalais traditionnel à base de riz et de poisson fumé ?", listOf("Jollof Rice", "Thieboudienne", "Mafe", "Ceebu Jën"), "Gastronomie", "Le mafé est un plat d'origine malienne, à base de riz et de poisson fumé, mais il est souvent associé au Sénégal."),
            en = LocalizedContent("What is the traditional Senegalese dish of rice and smoked fish?", listOf("Jollof Rice", "Thieboudienne", "Mafe", "Ceebu Jën"), "Gastronomy", "Mafe is a dish originally from Mali, made with rice and smoked fish, but it is often associated with Senegal."),
            zh = LocalizedContent("传统的塞内加尔米饭熏鱼菜是什么？", listOf("乔洛夫饭", "蒂布迪恩", "马菲", "杰布詹"), "美食", "马菲是一道源自马里的菜肴，由米饭和熏鱼制成，但常与塞内加尔联系在一起。"),
            es = LocalizedContent("¿Cuál es el plato tradicional senegalés de arroz y pescado ahumado?", listOf("Jollof Rice", "Thieboudienne", "Mafe", "Ceebu Jën"), "Gastronomía", "El mafé es un plato originario de Malí, a base de arroz y pescado ahumado, pero a menudo se asocia con Senegal.")
        ),
        BilingualQuestion(
            id = 30123, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel pays la bouillabaisse (soupe de poisson méditerranéenne) est-elle originaire ?", listOf("Italie", "Espagne", "France (Provence)", "Croatie"), "Gastronomie", "La bouillabaisse est un plat traditionnel de la cuisine provençale, originaire de Marseille, en France."),
            en = LocalizedContent("In which country did bouillabaisse (Mediterranean fish soup) originate?", listOf("Italy", "Spain", "France (Provence)", "Croatia"), "Gastronomy", "Bouillabaisse is a traditional dish of Provencal cuisine, originating from Marseille, France."),
            zh = LocalizedContent("马赛鱼汤（地中海鱼汤）起源于哪个国家？", listOf("意大利", "西班牙", "法国（普罗旺斯）", "克罗地亚"), "美食", "马赛鱼汤是普罗旺斯菜系的传统菜肴，起源于法国马赛。"),
            es = LocalizedContent("¿En qué país se originó la bouillabaisse (sopa de pescado mediterránea)?", listOf("Italia", "España", "Francia (Provenza)", "Croacia"), "Gastronomía", "La bouillabaisse es un plato tradicional de la cocina provenzal, originario de Marsella, Francia.")
        ),
        BilingualQuestion(
            id = 30124, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plat péruvien traditionnel à base de poisson cru mariné dans le citron ?", listOf("Ceviche", "Lomo Saltado", "Causa Limeña", "Aji de Gallina"), "Gastronomie", "Le ceviche est un plat emblématique du Pérou, où le poisson cru est mariné dans du jus de citron vert, ce qui le cuit chimiquement. Il est souvent accompagné d'oignon, de piment et de maïs."),
            en = LocalizedContent("What is the traditional Peruvian dish of raw fish marinated in lime juice?", listOf("Ceviche", "Lomo Saltado", "Causa Limeña", "Aji de Gallina"), "Gastronomy", "Ceviche is an emblematic dish of Peru, where raw fish is marinated in lime juice, which chemically cooks it. It is often accompanied by onion, chili, and corn."),
            zh = LocalizedContent("传统的秘鲁柠檬汁腌生鱼是什么？", listOf("酸橘汁腌鱼", "炒牛肉", "利马土豆泥", "鸡肉辣椒"), "美食", "酸橘汁腌鱼是秘鲁的标志性菜肴，生鱼用青柠汁腌制，通过化学作用使其变熟。通常搭配洋葱、辣椒和玉米。"),
            es = LocalizedContent("¿Cuál es el plato tradicional peruano de pescado crudo marinado en jugo de limón?", listOf("Ceviche", "Lomo Saltado", "Causa Limeña", "Aji de Gallina"), "Gastronomía", "El ceviche es un plato emblemático de Perú, donde el pescado crudo se marina en jugo de limón, lo que lo cocina químicamente. A menudo se acompaña de cebolla, ají y maíz.")
        ),
        BilingualQuestion(
            id = 30125, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel pays le bibimbap (riz mélangé avec légumes et œuf) est-il un plat populaire ?", listOf("Japon", "Corée du Sud", "Chine", "Vietnam"), "Gastronomie", "Le bibimbap est un plat emblématique de la cuisine coréenne, originaire de la Corée du Sud, où il est traditionnellement servi dans un bol de pierre chaude."),
            en = LocalizedContent("In which country is bibimbap (mixed rice with vegetables and egg) a popular dish?", listOf("Japan", "South Korea", "China", "Vietnam"), "Gastronomy", "Bibimbap is an emblematic dish of Korean cuisine, originating from South Korea, where it is traditionally served in a hot stone bowl."),
            zh = LocalizedContent("石锅拌饭（蔬菜和鸡蛋拌饭）是哪个国家的流行菜肴？", listOf("日本", "韩国", "中国", "越南"), "美食", "石锅拌饭是韩国料理的标志性菜肴，起源于韩国，传统上在热石碗中食用。"),
            es = LocalizedContent("¿En qué país el bibimbap (arroz mezclado con verduras y huevo) es un plato popular?", listOf("Japón", "Corea del Sur", "China", "Vietnam"), "Gastronomía", "El bibimbap es un plato emblemático de la cocina coreana, originario de Corea del Sur, donde se sirve tradicionalmente en un cuenco de piedra caliente.")
        ),
        BilingualQuestion(
            id = 30126, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays Bollywood, l'industrie cinématographique majeure, est-elle basée ?", listOf("Pakistan", "Inde", "Bangladesh", "Népal"), "Cinéma", "Bollywood est le nom donné à l'industrie du cinéma en langue hindi, basée à Bombay (Mumbai), en Inde."),
            en = LocalizedContent("In which country is Bollywood, the major film industry, based?", listOf("Pakistan", "India", "Bangladesh", "Nepal"), "Cinema", "Bollywood is the name given to the Hindi-language film industry, based in Bombay (Mumbai), India."),
            zh = LocalizedContent("宝莱坞，这个主要的电影产业，位于哪个国家？", listOf("巴基斯坦", "印度", "孟加拉国", "尼泊尔"), "电影", "宝莱坞是印地语电影产业的名称，总部设在印度孟买。"),
            es = LocalizedContent("¿En qué país tiene su sede Bollywood, la principal industria cinematográfica?", listOf("Pakistán", "India", "Bangladés", "Nepal"), "Cine", "Bollywood es el nombre dado a la industria cinematográfica en hindi, con sede en Bombay (Mumbai), India.")
        ),
        BilingualQuestion(
            id = 30127, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le studio d'animation japonais connu pour \"Le Château Ambulant\" et \"Le Voyage de Chihiro\" ?", listOf("Madhouse", "Kyoto Animation", "Studio Ghibli", "A-1 Pictures"), "Cinéma", "Le Studio Ghibli, fondé par Hayao Miyazaki et Isao Takahata, est célèbre pour ses chefs-d'œuvre d'animation comme \"Le Voyage de Chihiro\" (2001) et \"Le Château Ambulant\" (2004)."),
            en = LocalizedContent("Which Japanese animation studio is known for \"Howl's Moving Castle\" and \"Spirited Away\"?", listOf("Madhouse", "Kyoto Animation", "Studio Ghibli", "A-1 Pictures"), "Cinema", "Studio Ghibli, founded by Hayao Miyazaki and Isao Takahata, is famous for its animated masterpieces such as \"Spirited Away\" (2001) and \"Howl's Moving Castle\" (2004)."),
            zh = LocalizedContent("哪个日本动画工作室以《哈尔的移动城堡》和《千与千寻》闻名？", listOf("疯人院", "京都动画", "吉卜力工作室", "A-1 Pictures"), "电影", "吉卜力工作室由宫崎骏和高畑勋创立，以《千与千寻》（2001年）和《哈尔的移动城堡》（2004年）等动画杰作而闻名。"),
            es = LocalizedContent("¿Qué estudio de animación japonés es conocido por \"El Castillo Ambulante\" y \"El Viaje de Chihiro\"?", listOf("Madhouse", "Kyoto Animation", "Studio Ghibli", "A-1 Pictures"), "Cine", "El Studio Ghibli, fundado por Hayao Miyazaki e Isao Takahata, es famoso por sus obras maestras de animación como \"El Viaje de Chihiro\" (2001) y \"El Castillo Ambulante\" (2004).")
        ),
        BilingualQuestion(
            id = 30128, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays Nollywood, l'industrie cinématographique nigériane, produit-elle des films ?", listOf("Cameroun", "Nigeria", "Ghana", "Kenya"), "Cinéma", "Nollywood est le nom donné à l'industrie cinématographique du Nigeria, par analogie avec Hollywood et Bollywood. Le terme combine \"Nigeria\" et \"Hollywood\"."),
            en = LocalizedContent("In which country does Nollywood, the Nigerian film industry, produce films?", listOf("Cameroon", "Nigeria", "Ghana", "Kenya"), "Cinema", "Nollywood is the name given to the film industry of Nigeria, by analogy with Hollywood and Bollywood. The term combines \"Nigeria\" and \"Hollywood\"."),
            zh = LocalizedContent("诺莱坞，尼日利亚的电影产业，在哪个国家制作电影？", listOf("喀麦隆", "尼日利亚", "加纳", "肯尼亚"), "电影", "诺莱坞是尼日利亚电影产业的名称，类比好莱坞和宝莱坞。这个词结合了“尼日利亚”和“好莱坞”。"),
            es = LocalizedContent("¿En qué país produce películas Nollywood, la industria cinematográfica nigeriana?", listOf("Camerún", "Nigeria", "Ghana", "Kenia"), "Cine", "Nollywood es el nombre dado a la industria cinematográfica de Nigeria, por analogía con Hollywood y Bollywood. El término combina \"Nigeria\" y \"Hollywood\".")
        ),
        BilingualQuestion(
            id = 30129, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur français est connu pour des films comme \"Amélie\" ?", listOf("Luc Besson", "Jean-Pierre Jeunet", "Michel Gondry", "Denis Villeneuve"), "Cinéma", "Jean-Pierre Jeunet a réalisé \"Le Fabuleux Destin d'Amélie Poulain\" en 2001, film emblématique du cinéma français."),
            en = LocalizedContent("Which French director is known for films like \"Amélie\"?", listOf("Luc Besson", "Jean-Pierre Jeunet", "Michel Gondry", "Denis Villeneuve"), "Cinema", "Jean-Pierre Jeunet directed \"Le Fabuleux Destin d'Amélie Poulain\" in 2001, an iconic film of French cinema."),
            zh = LocalizedContent("哪位法国导演以《天使爱美丽》等电影闻名？", listOf("吕克·贝松", "让-皮埃尔·热内", "米歇尔·贡德里", "丹尼斯·维伦纽瓦"), "电影", "让-皮埃尔·热内在2001年执导了《天使爱美丽》，这是法国电影的一部标志性作品。"),
            es = LocalizedContent("¿Qué director francés es conocido por películas como \"Amélie\"?", listOf("Luc Besson", "Jean-Pierre Jeunet", "Michel Gondry", "Denis Villeneuve"), "Cine", "Jean-Pierre Jeunet dirigió \"Le Fabuleux Destin d'Amélie Poulain\" en 2001, una película emblemática del cine francés.")
        ),
        BilingualQuestion(
            id = 30130, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel pays la \"Nouvelle Vague\" (French New Wave) du cinéma a-t-elle pris naissance ?", listOf("Italie", "France", "Allemagne", "Espagne"), "Cinéma", "Le mouvement cinématographique de la Nouvelle Vague est né en France dans les années 1950-1960, porté par des réalisateurs comme François Truffaut et Jean-Luc Godard."),
            en = LocalizedContent("In which country did the \"French New Wave\" of cinema originate?", listOf("Italy", "France", "Germany", "Spain"), "Cinema", "The French New Wave film movement originated in France in the 1950s-1960s, led by directors like François Truffaut and Jean-Luc Godard."),
            zh = LocalizedContent("电影“法国新浪潮”起源于哪个国家？", listOf("意大利", "法国", "德国", "西班牙"), "电影", "法国新浪潮电影运动于20世纪50-60年代在法国兴起，由弗朗索瓦·特吕弗和让-吕克·戈达尔等导演引领。"),
            es = LocalizedContent("¿En qué país se originó la \"Nouvelle Vague\" (Nueva Ola Francesa) del cine?", listOf("Italia", "Francia", "Alemania", "España"), "Cine", "El movimiento cinematográfico de la Nouvelle Vague nació en Francia en las décadas de 1950-1960, impulsado por directores como François Truffaut y Jean-Luc Godard.")
        ),
        BilingualQuestion(
            id = 30131, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur italien est connu pour ses films en noir et blanc comme \"La Dolce Vita\" ?", listOf("Bernardo Bertolucci", "Federico Fellini", "Sergio Leone", "Vittorio de Sica"), "Cinéma", "Federico Fellini est un maître du cinéma italien, célèbre pour son style onirique et ses films en noir et blanc, dont \"La Dolce Vita\" (1960), qui a marqué l'histoire du cinéma."),
            en = LocalizedContent("Which Italian director is known for black-and-white films like \"La Dolce Vita\"?", listOf("Bernardo Bertolucci", "Federico Fellini", "Sergio Leone", "Vittorio de Sica"), "Cinema", "Federico Fellini is a master of Italian cinema, famous for his dreamlike style and black-and-white films, including \"La Dolce Vita\" (1960), which marked film history."),
            zh = LocalizedContent("哪位意大利导演以《甜蜜的生活》等黑白电影闻名？", listOf("贝尔纳多·贝托鲁奇", "费德里科·费里尼", "塞尔吉奥·莱昂内", "维托里奥·德·西卡"), "电影", "费德里科·费里尼是意大利电影大师，以其梦幻风格和黑白电影闻名，包括1960年上映的《甜蜜的生活》，该片在电影史上具有里程碑意义。"),
            es = LocalizedContent("¿Qué director italiano es conocido por películas en blanco y negro como \"La Dolce Vita\"?", listOf("Bernardo Bertolucci", "Federico Fellini", "Sergio Leone", "Vittorio de Sica"), "Cine", "Federico Fellini es un maestro del cine italiano, famoso por su estilo onírico y sus películas en blanco y negro, incluida \"La Dolce Vita\" (1960), que marcó la historia del cine.")
        ),
        BilingualQuestion(
            id = 30132, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est le centre du cinéma d'animation avec des studios prestigieux ?", listOf("Royaume-Uni", "Japon", "Suède", "Pays-Bas"), "Cinéma", "Le Japon est le berceau de studios d'animation de renommée mondiale comme Studio Ghibli, Toei Animation et Madhouse, qui ont produit des œuvres emblématiques du cinéma d'animation."),
            en = LocalizedContent("Which country is the center of animation cinema with prestigious studios?", listOf("United Kingdom", "Japan", "Sweden", "Netherlands"), "Cinema", "Japan is the birthplace of world-renowned animation studios like Studio Ghibli, Toei Animation, and Madhouse, which have produced iconic works of animation cinema."),
            zh = LocalizedContent("哪个国家是动画电影的中心，拥有著名的动画工作室？", listOf("英国", "日本", "瑞典", "荷兰"), "电影", "日本是吉卜力工作室、东映动画和疯人院等世界知名动画工作室的发源地，这些工作室创作了动画电影的经典作品。"),
            es = LocalizedContent("¿Qué país es el centro del cine de animación con estudios prestigiosos?", listOf("Reino Unido", "Japón", "Suecia", "Países Bajos"), "Cine", "Japón es la cuna de estudios de animación de renombre mundial como Studio Ghibli, Toei Animation y Madhouse, que han producido obras emblemáticas del cine de animación.")
        ),
        BilingualQuestion(
            id = 30133, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel cinéaste sud-coréen a remporté la Palme d'Or à Cannes pour \"Parasite\" ?", listOf("Lee Chang-dong", "Bong Joon-ho", "Park Chan-wook", "Hong Sang-soo"), "Cinéma", "Bong Joon-ho a remporté la Palme d'Or en 2019 pour \"Parasite\", devenant ainsi le premier réalisateur sud-coréen à recevoir cette récompense."),
            en = LocalizedContent("Which South Korean filmmaker won the Palme d'Or at Cannes for \"Parasite\"?", listOf("Lee Chang-dong", "Bong Joon-ho", "Park Chan-wook", "Hong Sang-soo"), "Cinema", "Bong Joon-ho won the Palme d'Or in 2019 for \"Parasite\", becoming the first South Korean director to receive this award."),
            zh = LocalizedContent("哪位韩国电影人凭借《寄生虫》获得戛纳金棕榈奖？", listOf("李沧东", "奉俊昊", "朴赞郁", "洪常秀"), "电影", "奉俊昊在2019年凭借《寄生虫》获得金棕榈奖，成为首位获得该奖项的韩国导演。"),
            es = LocalizedContent("¿Qué cineasta surcoreano ganó la Palma de Oro en Cannes por \"Parasite\"?", listOf("Lee Chang-dong", "Bong Joon-ho", "Park Chan-wook", "Hong Sang-soo"), "Cine", "Bong Joon-ho ganó la Palma de Oro en 2019 por \"Parasite\", convirtiéndose en el primer director surcoreano en recibir este premio.")
        ),
        BilingualQuestion(
            id = 30134, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de Bollywood est souvent cité comme un classique absolu avec Shah Rukh Khan ?", listOf("Kabhi Haan Kabhi Naa", "Dilwale Dulhania Le Jayenge", "Dil Se", "Rab Ne Bana Di Jodi"), "Cinéma", "Sorti en 1995, Dilwale Dulhania Le Jayenge a redéfini le cinéma romantique indien et est resté à l'affiche à Bombay pendant plus de 25 ans, un record mondial."),
            en = LocalizedContent("Which Bollywood film is often cited as an absolute classic starring Shah Rukh Khan?", listOf("Kabhi Haan Kabhi Naa", "Dilwale Dulhania Le Jayenge", "Dil Se", "Rab Ne Bana Di Jodi"), "Cinema", "Released in 1995, Dilwale Dulhania Le Jayenge redefined Indian romantic cinema and ran in Mumbai theaters for over 25 years, a world record."),
            zh = LocalizedContent("哪部宝莱坞电影常被引为沙鲁克·汗主演的绝对经典？", listOf("Kabhi Haan Kabhi Naa", "Dilwale Dulhania Le Jayenge", "Dil Se", "Rab Ne Bana Di Jodi"), "电影", "1995年上映的《勇夺芳心》重新定义了印度浪漫电影，并在孟买影院连续放映超过25年，创下世界纪录。"),
            es = LocalizedContent("¿Qué película de Bollywood se cita a menudo como un clásico absoluto protagonizado por Shah Rukh Khan?", listOf("Kabhi Haan Kabhi Naa", "Dilwale Dulhania Le Jayenge", "Dil Se", "Rab Ne Bana Di Jodi"), "Cine", "Estrenada en 1995, Dilwale Dulhania Le Jayenge redefinió el cine romántico indio y se mantuvo en cartelera en Bombay durante más de 25 años, un récord mundial.")
        ),
        BilingualQuestion(
            id = 30135, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année le premier film de Marvel a-t-il été sorti au cinéma ?", listOf("2006", "2008", "2010", "2012"), "Cinéma", "Le premier film de l'univers cinématographique Marvel, *Iron Man*, est sorti en 2008, marquant le début de la franchise interconnectée au cinéma."),
            en = LocalizedContent("In which year was the first Marvel movie released in theaters?", listOf("2006", "2008", "2010", "2012"), "Cinema", "The first film of the Marvel Cinematic Universe, *Iron Man*, was released in 2008, marking the beginning of the interconnected franchise in cinema."),
            zh = LocalizedContent("第一部漫威电影在哪一年上映？", listOf("2006", "2008", "2010", "2012"), "电影", "漫威电影宇宙的第一部电影《钢铁侠》于2008年上映，标志着这一互联电影系列的开端。"),
            es = LocalizedContent("¿En qué año se estrenó la primera película de Marvel en los cines?", listOf("2006", "2008", "2010", "2012"), "Cine", "La primera película del universo cinematográfico de Marvel, *Iron Man*, se estrenó en 2008, marcando el inicio de la franquicia interconectada en el cine.")
        ),
        BilingualQuestion(
            id = 30136, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur mexicain est connu pour \"La Forme de l'Eau\" et \"Pans Labyrinthe\" ?", listOf("Alfonso Cuarón", "Guillermo del Toro", "Alejandro González Iñárritu", "Carlos Reygadas"), "Cinéma", "Guillermo del Toro est un réalisateur mexicain célèbre pour son style mêlant fantastique et horreur, comme dans \"Le Labyrinthe de Pan\" et \"La Forme de l'Eau\", qui a remporté l'Oscar du meilleur film."),
            en = LocalizedContent("Which Mexican director is known for \"The Shape of Water\" and \"Pan's Labyrinth\"?", listOf("Alfonso Cuarón", "Guillermo del Toro", "Alejandro González Iñárritu", "Carlos Reygadas"), "Cinema", "Guillermo del Toro is a Mexican director famous for his style blending fantasy and horror, as in \"Pan's Labyrinth\" and \"The Shape of Water\", which won the Oscar for Best Picture."),
            zh = LocalizedContent("哪位墨西哥导演以《水形物语》和《潘神的迷宫》闻名？", listOf("阿方索·卡隆", "吉尔莫·德尔·托罗", "亚利桑德罗·冈萨雷斯·伊纳里图", "卡洛斯·雷加达斯"), "电影", "吉尔莫·德尔·托罗是一位墨西哥导演，以其融合奇幻与恐怖的风格闻名，如《潘神的迷宫》和获得奥斯卡最佳影片的《水形物语》。"),
            es = LocalizedContent("¿Qué director mexicano es conocido por \"La forma del agua\" y \"El laberinto del fauno\"?", listOf("Alfonso Cuarón", "Guillermo del Toro", "Alejandro González Iñárritu", "Carlos Reygadas"), "Cine", "Guillermo del Toro es un director mexicano famoso por su estilo que mezcla fantasía y terror, como en \"El laberinto del fauno\" y \"La forma del agua\", que ganó el Oscar a la mejor película.")
        ),
        BilingualQuestion(
            id = 30137, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur de Bollywood est connu comme le \"Roi du Cinéma\" indien ?", listOf("Akshay Kumar", "Amitabh Bachchan", "Aamir Khan", "Shah Rukh Khan"), "Cinéma", "Amitabh Bachchan a été surnommé le \"Shahenshah\" (empereur) du cinéma indien pour sa carrière emblématique qui s'étend sur plus de cinq décennies et son statut de superstar incontestée de Bollywood."),
            en = LocalizedContent("Which Bollywood actor is known as the \"King of Indian Cinema\"?", listOf("Akshay Kumar", "Amitabh Bachchan", "Aamir Khan", "Shah Rukh Khan"), "Cinema", "Amitabh Bachchan has been called the \"Shahenshah\" (emperor) of Indian cinema for his iconic career spanning over five decades and his status as an undisputed Bollywood superstar."),
            zh = LocalizedContent("哪位宝莱坞演员被称为“印度电影之王”？", listOf("阿克谢·库玛尔", "阿米塔布·巴强", "阿米尔·汗", "沙鲁克·汗"), "电影", "阿米塔布·巴强因其跨越五十多年的标志性职业生涯和无可争议的宝莱坞超级巨星地位，被称为印度电影的“沙亨沙”（皇帝）。"),
            es = LocalizedContent("¿Qué actor de Bollywood es conocido como el \"Rey del Cine Indio\"?", listOf("Akshay Kumar", "Amitabh Bachchan", "Aamir Khan", "Shah Rukh Khan"), "Cine", "Amitabh Bachchan ha sido apodado el \"Shahenshah\" (emperador) del cine indio por su carrera icónica que abarca más de cinco décadas y su estatus de superestrella indiscutible de Bollywood.")
        ),
        BilingualQuestion(
            id = 30138, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année le Festival de Cannes a-t-il commencé à récompenser le cinéma mondial ?", listOf("1946", "1948", "1950", "1952"), "Cinéma", "Le Festival de Cannes a été créé en 1946, avec sa première édition tenue du 20 mars au 5 avril, pour récompenser le cinéma mondial après l'interruption due à la Seconde Guerre mondiale."),
            en = LocalizedContent("In which year did the Cannes Film Festival begin awarding world cinema?", listOf("1946", "1948", "1950", "1952"), "Cinema", "The Cannes Film Festival was created in 1946, with its first edition held from March 20 to April 5, to award world cinema after the interruption due to World War II."),
            zh = LocalizedContent("戛纳电影节在哪一年开始表彰世界电影？", listOf("1946", "1948", "1950", "1952"), "电影", "戛纳电影节创立于1946年，首届于3月20日至4月5日举行，旨在表彰因第二次世界大战而中断后的世界电影。"),
            es = LocalizedContent("¿En qué año comenzó el Festival de Cannes a premiar el cine mundial?", listOf("1946", "1948", "1950", "1952"), "Cine", "El Festival de Cannes fue creado en 1946, con su primera edición celebrada del 20 de marzo al 5 de abril, para premiar el cine mundial tras la interrupción debida a la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 30139, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur Hong Kong est connu pour \"Chungking Express\" et des films d'action hip ?", listOf("Jackie Chan", "Jet Li", "Wong Kar-wai", "John Woo"), "Cinéma", "Wong Kar-wai est célèbre pour son esthétique visuelle unique et ses récits mélancoliques, comme dans \"Chungking Express\", mais il a aussi réalisé des films d'action stylisés tels que \"Les Cendres du temps\"."),
            en = LocalizedContent("Which Hong Kong director is known for \"Chungking Express\" and hip action films?", listOf("Jackie Chan", "Jet Li", "Wong Kar-wai", "John Woo"), "Cinema", "Wong Kar-wai is famous for his unique visual aesthetic and melancholic narratives, as in \"Chungking Express\", but he also directed stylized action films such as \"Ashes of Time\"."),
            zh = LocalizedContent("哪位香港导演以《重庆森林》和时尚动作片闻名？", listOf("成龙", "李连杰", "王家卫", "吴宇森"), "电影", "王家卫以其独特的视觉美学和忧郁叙事而闻名，如《重庆森林》，但他也执导了风格化的动作片，如《东邪西毒》。"),
            es = LocalizedContent("¿Qué director de Hong Kong es conocido por \"Chungking Express\" y películas de acción modernas?", listOf("Jackie Chan", "Jet Li", "Wong Kar-wai", "John Woo"), "Cine", "Wong Kar-wai es famoso por su estética visual única y narrativas melancólicas, como en \"Chungking Express\", pero también dirigió películas de acción estilizadas como \"Las cenizas del tiempo\".")
        ),
        BilingualQuestion(
            id = 30140, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel cinéaste japonais a remporté plusieurs prix avec \"Tokyo Story\" et \"Godzilla\" ?", listOf("Akira Kurosawa", "Yasujirō Ozu", "Hayao Miyazaki", "Takeshi Kitano"), "Cinéma", "Yasujirō Ozu est le réalisateur de \"Tokyo Story\" (1953), chef-d'œuvre du cinéma japonais, tandis que \"Godzilla\" a été réalisé par Ishirō Honda. La question contient une erreur factuelle."),
            en = LocalizedContent("Which Japanese filmmaker won several awards with \"Tokyo Story\" and \"Godzilla\"?", listOf("Akira Kurosawa", "Yasujirō Ozu", "Hayao Miyazaki", "Takeshi Kitano"), "Cinema", "Yasujirō Ozu directed \"Tokyo Story\" (1953), a masterpiece of Japanese cinema, while \"Godzilla\" was directed by Ishirō Honda. The question contains a factual error."),
            zh = LocalizedContent("哪位日本电影人凭借《东京物语》和《哥斯拉》赢得了多个奖项？", listOf("黑泽明", "小津安二郎", "宫崎骏", "北野武"), "电影", "小津安二郎执导了《东京物语》（1953年），日本电影杰作，而《哥斯拉》由本多猪四郎执导。问题存在事实错误。"),
            es = LocalizedContent("¿Qué cineasta japonés ganó varios premios con \"Cuentos de Tokio\" y \"Godzilla\"?", listOf("Akira Kurosawa", "Yasujirō Ozu", "Hayao Miyazaki", "Takeshi Kitano"), "Cine", "Yasujirō Ozu dirigió \"Cuentos de Tokio\" (1953), obra maestra del cine japonés, mientras que \"Godzilla\" fue dirigida por Ishirō Honda. La pregunta contiene un error fáctico.")
        ),
        BilingualQuestion(
            id = 30141, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le film \"Sangam\", l'un des premiers succès majeurs de Bollywood, a-t-il été lancé ?", listOf("1956", "1960", "1964", "1970"), "Cinéma", "Sorti en 1964, Sangam est un film romantique réalisé par Raj Kapoor, marquant l'un des premiers grands succès de Bollywood à l'international."),
            en = LocalizedContent("In which year was the film \"Sangam\", one of Bollywood's first major successes, released?", listOf("1956", "1960", "1964", "1970"), "Cinema", "Released in 1964, Sangam is a romantic film directed by Raj Kapoor, marking one of Bollywood's first major international successes."),
            zh = LocalizedContent("电影《桑加姆》是宝莱坞首批重大成功之一，于哪一年上映？", listOf("1956", "1960", "1964", "1970"), "电影", "《桑加姆》于1964年上映，是一部由拉杰·卡普尔执导的爱情片，标志着宝莱坞在国际上的首批重大成功之一。"),
            es = LocalizedContent("¿En qué año se estrenó la película \"Sangam\", uno de los primeros grandes éxitos de Bollywood?", listOf("1956", "1960", "1964", "1970"), "Cine", "Estrenada en 1964, Sangam es una película romántica dirigida por Raj Kapoor, marcando uno de los primeros grandes éxitos internacionales de Bollywood.")
        ),
        BilingualQuestion(
            id = 30142, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur français a créé les \"Trois couleurs\" (Bleu, Blanc, Rouge) ?", listOf("Luc Godard", "Krzysztof Kieślowski", "Robert Bresson", "Louis Malle"), "Cinéma", "Krzysztof Kieślowski, réalisateur polonais, a réalisé la trilogie Trois couleurs dans les années 1990, une coproduction française."),
            en = LocalizedContent("Which French director created the \"Three Colors\" (Blue, White, Red)?", listOf("Luc Godard", "Krzysztof Kieślowski", "Robert Bresson", "Louis Malle"), "Cinema", "Krzysztof Kieślowski, a Polish director, made the Three Colors trilogy in the 1990s, a French co-production."),
            zh = LocalizedContent("哪位法国导演创作了《三色》（蓝、白、红）？", listOf("吕克·戈达尔", "克日什托夫·基耶斯洛夫斯基", "罗伯特·布列松", "路易·马勒"), "电影", "克日什托夫·基耶斯洛夫斯基，波兰导演，在1990年代执导了《三色》三部曲，这是一部法国合拍片。"),
            es = LocalizedContent("¿Qué director francés creó \"Tres colores\" (Azul, Blanco, Rojo)?", listOf("Luc Godard", "Krzysztof Kieślowski", "Robert Bresson", "Louis Malle"), "Cine", "Krzysztof Kieślowski, director polaco, realizó la trilogía Tres colores en los años 1990, una coproducción francesa.")
        ),
        BilingualQuestion(
            id = 30143, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le cinéma muet italien a-t-il produit le classique \"Cabiria\" ?", listOf("1912", "1914", "1920", "1925"), "Cinéma", "Cabiria, réalisé par Giovanni Pastrone, est un péplum monumental sorti en 1912, considéré comme un chef-d'œuvre du cinéma muet italien et une influence majeure pour des films comme Intolérance de Griffith."),
            en = LocalizedContent("In which year did Italian silent cinema produce the classic \"Cabiria\"?", listOf("1912", "1914", "1920", "1925"), "Cinema", "Cabiria, directed by Giovanni Pastrone, is a monumental epic released in 1912, considered a masterpiece of Italian silent cinema and a major influence on films like Griffith's Intolerance."),
            zh = LocalizedContent("意大利无声电影在何年制作了经典作品《卡比利亚》？", listOf("1912", "1914", "1920", "1925"), "电影", "《卡比利亚》由乔瓦尼·帕斯特罗内执导，于1912年上映，是一部史诗巨作，被认为是意大利无声电影的杰作，并对格里菲斯的《党同伐异》等影片产生了重大影响。"),
            es = LocalizedContent("¿En qué año el cine mudo italiano produjo el clásico \"Cabiria\"?", listOf("1912", "1914", "1920", "1925"), "Cine", "Cabiria, dirigida por Giovanni Pastrone, es un épico monumental estrenado en 1912, considerado una obra maestra del cine mudo italiano y una influencia importante en películas como Intolerancia de Griffith.")
        ),
        BilingualQuestion(
            id = 30144, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel réalisateur nigérian Nollywood a remporté des prix internationaux pour \"The Wedding Day\" ?", listOf("Kunle Afolayan", "Amos Tutuola", "Nollywood Auteur", "Zainab Omoniyi"), "Cinéma", "Kunle Afolayan est un réalisateur nigérian influent de Nollywood, connu pour ses films acclamés comme \"The Wedding Day\", qui a remporté des prix internationaux."),
            en = LocalizedContent("Which Nigerian Nollywood director won international awards for \"The Wedding Day\"?", listOf("Kunle Afolayan", "Amos Tutuola", "Nollywood Auteur", "Zainab Omoniyi"), "Cinema", "Kunle Afolayan is an influential Nigerian Nollywood director, known for acclaimed films like \"The Wedding Day\", which won international awards."),
            zh = LocalizedContent("哪位尼日利亚诺莱坞导演凭借《婚礼日》赢得了国际奖项？", listOf("昆勒·阿弗拉扬", "阿莫斯·图图奥拉", "诺莱坞作者", "扎伊纳布·奥莫尼伊"), "电影", "昆勒·阿弗拉扬是一位有影响力的尼日利亚诺莱坞导演，以《婚礼日》等获奖影片而闻名，该片赢得了国际奖项。"),
            es = LocalizedContent("¿Qué director nigeriano de Nollywood ganó premios internacionales por \"The Wedding Day\"?", listOf("Kunle Afolayan", "Amos Tutuola", "Nollywood Auteur", "Zainab Omoniyi"), "Cine", "Kunle Afolayan es un influyente director nigeriano de Nollywood, conocido por películas aclamadas como \"The Wedding Day\", que ganó premios internacionales.")
        ),
        BilingualQuestion(
            id = 30145, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année le film sud-coréen \"Oldboy\" de Park Chan-wook a-t-il remporté le Grand Prix à Cannes ?", listOf("2002", "2003", "2004", "2005"), "Cinéma", "Oldboy a reçu le Grand Prix du jury au Festival de Cannes en 2004, l'année de sa présentation en compétition officielle."),
            en = LocalizedContent("In which year did the South Korean film \"Oldboy\" by Park Chan-wook win the Grand Prix at Cannes?", listOf("2002", "2003", "2004", "2005"), "Cinema", "Oldboy received the Grand Prix du jury at the Cannes Film Festival in 2004, the year it was presented in official competition."),
            zh = LocalizedContent("朴赞郁的韩国电影《老男孩》在哪一年获得了戛纳评审团大奖？", listOf("2002", "2003", "2004", "2005"), "电影", "《老男孩》在2004年戛纳电影节上获得评审团大奖，同年该片在官方竞赛单元展映。"),
            es = LocalizedContent("¿En qué año la película surcoreana \"Oldboy\" de Park Chan-wook ganó el Gran Premio en Cannes?", listOf("2002", "2003", "2004", "2005"), "Cine", "Oldboy recibió el Gran Premio del Jurado en el Festival de Cine de Cannes en 2004, el año en que se presentó en competición oficial.")
        ),
        BilingualQuestion(
            id = 30146, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le studio Ghibli qui a produit \"Nausicaä de la Vallée du Vent\" ?", listOf("Faux, ce fut uniquement Hayao Miyazaki", "Vrai, avec Toei Company", "Vrai, c'est un film indépendant", "Vrai, produit par Tokuma Shoten"), "Cinéma", "Nausicaä de la Vallée du Vent est sorti en 1984, avant la fondation officielle du Studio Ghibli en 1985, et a été produit par Topcraft avec Toei Company."),
            en = LocalizedContent("Is Studio Ghibli the studio that produced \"Nausicaä of the Valley of the Wind\"?", listOf("False, it was solely Hayao Miyazaki", "True, with Toei Company", "True, it's an independent film", "True, produced by Tokuma Shoten"), "Cinema", "Nausicaä of the Valley of the Wind was released in 1984, before the official founding of Studio Ghibli in 1985, and was produced by Topcraft with Toei Company."),
            zh = LocalizedContent("吉卜力工作室是制作《风之谷》的工作室吗？", listOf("错误，仅由宫崎骏制作", "正确，与东映公司合作", "正确，这是一部独立电影", "正确，由德间书店制作"), "电影", "《风之谷》于1984年上映，早于1985年吉卜力工作室正式成立，由Topcraft与东映公司联合制作。"),
            es = LocalizedContent("¿Es Studio Ghibli el estudio que produjo \"Nausicaä del Valle del Viento\"?", listOf("Falso, fue únicamente Hayao Miyazaki", "Verdadero, con Toei Company", "Verdadero, es una película independiente", "Verdadero, producida por Tokuma Shoten"), "Cine", "Nausicaä del Valle del Viento se estrenó en 1984, antes de la fundación oficial de Studio Ghibli en 1985, y fue producida por Topcraft con Toei Company.")
        ),
        BilingualQuestion(
            id = 30147, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année le film brésilien \"City of God\" (Cidade de Deus) a-t-il été lancé mondialement ?", listOf("2000", "2001", "2002", "2003"), "Cinéma", "Le film \"City of God\" a été présenté au Festival de Cannes en mai 2002, puis lancé mondialement la même année."),
            en = LocalizedContent("In which year was the Brazilian film \"City of God\" (Cidade de Deus) released worldwide?", listOf("2000", "2001", "2002", "2003"), "Cinema", "The film \"City of God\" was presented at the Cannes Film Festival in May 2002, then released worldwide the same year."),
            zh = LocalizedContent("巴西电影《上帝之城》在哪一年全球上映？", listOf("2000", "2001", "2002", "2003"), "电影", "《上帝之城》于2002年5月在戛纳电影节展映，同年全球上映。"),
            es = LocalizedContent("¿En qué año se estrenó mundialmente la película brasileña \"Ciudad de Dios\" (Cidade de Deus)?", listOf("2000", "2001", "2002", "2003"), "Cine", "La película \"Ciudad de Dios\" se presentó en el Festival de Cannes en mayo de 2002, y se estrenó mundialmente ese mismo año.")
        ),
        BilingualQuestion(
            id = 30148, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel réalisateur taïwanais est connu pour \"Taipei 101\", \"Crouching Tiger, Hidden Dragon\" ?", listOf("Ang Lee", "Hou Hsiao-hsien", "Edward Yang", "Tsai Ming-liang"), "Cinéma", "Ang Lee a réalisé Crouching Tiger, Hidden Dragon, qui a remporté l'Oscar du meilleur film étranger. Taipei 101 est un gratte-ciel, pas un film d'Ang Lee."),
            en = LocalizedContent("Which Taiwanese director is known for \"Taipei 101\", \"Crouching Tiger, Hidden Dragon\"?", listOf("Ang Lee", "Hou Hsiao-hsien", "Edward Yang", "Tsai Ming-liang"), "Cinema", "Ang Lee directed Crouching Tiger, Hidden Dragon, which won the Oscar for Best Foreign Language Film. Taipei 101 is a skyscraper, not a film by Ang Lee."),
            zh = LocalizedContent("哪位台湾导演以《台北101》、《卧虎藏龙》闻名？", listOf("李安", "侯孝贤", "杨德昌", "蔡明亮"), "电影", "李安执导了《卧虎藏龙》，该片获得了奥斯卡最佳外语片奖。台北101是一座摩天大楼，并非李安的电影。"),
            es = LocalizedContent("¿Qué director taiwanés es conocido por \"Taipei 101\", \"Tigre y dragón\"?", listOf("Ang Lee", "Hou Hsiao-hsien", "Edward Yang", "Tsai Ming-liang"), "Cine", "Ang Lee dirigió Tigre y dragón, que ganó el Oscar a la mejor película extranjera. Taipei 101 es un rascacielos, no una película de Ang Lee.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 30149, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quel année le Festival de Venise (Mostra di Venezia) a-t-il été établi comme festival du cinéma ?", listOf("1932", "1934", "1936", "1940"), "Cinéma", "La Mostra di Venezia, créée en 1932, est le plus ancien festival de cinéma du monde, organisé pour la première fois sur la terrasse de l'Hôtel Excelsior au Lido de Venise."),
            en = LocalizedContent("In which year was the Venice Film Festival (Mostra di Venezia) established as a film festival?", listOf("1932", "1934", "1936", "1940"), "Cinema", "The Mostra di Venezia, founded in 1932, is the oldest film festival in the world, first held on the terrace of the Hotel Excelsior on the Lido of Venice."),
            zh = LocalizedContent("威尼斯电影节（Mostra di Venezia）在哪一年作为电影节成立？", listOf("1932", "1934", "1936", "1940"), "电影", "威尼斯电影节成立于1932年，是世界上最古老的电影节，首次在威尼斯丽都的埃克塞尔西奥酒店露台上举办。"),
            es = LocalizedContent("¿En qué año se estableció el Festival de Cine de Venecia (Mostra di Venezia) como festival de cine?", listOf("1932", "1934", "1936", "1940"), "Cine", "La Mostra di Venezia, fundada en 1932, es el festival de cine más antiguo del mundo, celebrado por primera vez en la terraza del Hotel Excelsior en el Lido de Venecia.")
        ),
        BilingualQuestion(
            id = 30150, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel cinéaste finlandais a réalisé \"L'Homme au béret gris\" devenu un classique du cinéma d'Europe du Nord ?", listOf("Aki Kaurismäki", "Clarence Brown", "Lars Von Trier", "Søren Kragh-Jacobsen"), "Cinéma", "Aki Kaurismäki est un réalisateur finlandais renommé, et L'Homme au béret gris (1984) est l'un de ses premiers films, marquant son style minimaliste et son humour noir, devenu un classique du cinéma nordique."),
            en = LocalizedContent("Which Finnish filmmaker directed \"The Man Without a Past\" which became a classic of Northern European cinema?", listOf("Aki Kaurismäki", "Clarence Brown", "Lars Von Trier", "Søren Kragh-Jacobsen"), "Cinema", "Aki Kaurismäki is a renowned Finnish director, and The Man Without a Past (2002) is one of his acclaimed films, winning the Grand Prix at Cannes, known for its minimalist style and deadpan humor, becoming a classic of Nordic cinema."),
            zh = LocalizedContent("哪位芬兰电影人执导了《没有过去的男人》，该片成为北欧电影的经典？", listOf("阿基·考里斯马基", "克拉伦斯·布朗", "拉斯·冯·提尔", "索伦·克拉格-雅各布森"), "电影", "阿基·考里斯马基是著名的芬兰导演，《没有过去的男人》（2002年）是他的代表作之一，荣获戛纳评审团大奖，以其极简风格和冷幽默著称，成为北欧电影的经典。"),
            es = LocalizedContent("¿Qué cineasta finlandés dirigió \"El hombre sin pasado\", que se convirtió en un clásico del cine nórdico?", listOf("Aki Kaurismäki", "Clarence Brown", "Lars Von Trier", "Søren Kragh-Jacobsen"), "Cine", "Aki Kaurismäki es un renombrado director finlandés, y El hombre sin pasado (2002) es una de sus películas aclamadas, ganadora del Gran Premio en Cannes, conocida por su estilo minimalista y humor seco, convirtiéndose en un clásico del cine nórdico.")
        ),
        BilingualQuestion(
            id = 30153, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle plateforme de médias sociaux a été fondée par Mark Zuckerberg ?", listOf("Facebook", "Twitter", "Instagram", "TikTok"), "Tech", "Mark Zuckerberg a cofondé Facebook en 2004 depuis sa chambre d'université à Harvard, initialement comme un réseau social pour les étudiants."),
            en = LocalizedContent("Which social media platform was founded by Mark Zuckerberg?", listOf("Facebook", "Twitter", "Instagram", "TikTok"), "Technology", "Mark Zuckerberg co-founded Facebook in 2004 from his Harvard dorm room, initially as a social network for students."),
            zh = LocalizedContent("哪个社交媒体平台是由马克·扎克伯格创立的？", listOf("Facebook", "Twitter", "Instagram", "TikTok"), "科技", "马克·扎克伯格于2004年在哈佛大学宿舍共同创立了Facebook，最初是作为学生社交网络。"),
            es = LocalizedContent("¿Qué plataforma de redes sociales fue fundada por Mark Zuckerberg?", listOf("Facebook", "Twitter", "Instagram", "TikTok"), "Tecnología", "Mark Zuckerberg cofundó Facebook en 2004 desde su dormitorio en Harvard, inicialmente como una red social para estudiantes.")
        ),
        BilingualQuestion(
            id = 30154, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le premier iPhone a-t-il été lancé ?", listOf("2007", "2005", "2009", "2010"), "Tech", "Steve Jobs a présenté le premier iPhone le 9 janvier 2007, et il a été mis en vente aux États-Unis le 29 juin de la même année."),
            en = LocalizedContent("In which year was the first iPhone launched?", listOf("2007", "2005", "2009", "2010"), "Technology", "Steve Jobs introduced the first iPhone on January 9, 2007, and it went on sale in the United States on June 29 of the same year."),
            zh = LocalizedContent("第一代iPhone是在哪一年发布的？", listOf("2007", "2005", "2009", "2010"), "科技", "史蒂夫·乔布斯于2007年1月9日发布了第一代iPhone，同年6月29日在美国上市。"),
            es = LocalizedContent("¿En qué año se lanzó el primer iPhone?", listOf("2007", "2005", "2009", "2010"), "Tecnología", "Steve Jobs presentó el primer iPhone el 9 de enero de 2007, y salió a la venta en Estados Unidos el 29 de junio del mismo año.")
        ),
        BilingualQuestion(
            id = 30155, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle console de jeu a été créée par Nintendo en 1983 ?", listOf("NES", "SNES", "N64", "GameCube"), "Tech", "La NES (Nintendo Entertainment System) est sortie en 1983 au Japon sous le nom de Famicom, relançant l'industrie du jeu vidéo après le krach de 1983."),
            en = LocalizedContent("Which game console was created by Nintendo in 1983?", listOf("NES", "SNES", "N64", "GameCube"), "Technology", "The NES (Nintendo Entertainment System) was released in 1983 in Japan as the Famicom, revitalizing the video game industry after the 1983 crash."),
            zh = LocalizedContent("任天堂在1983年创造了哪款游戏机？", listOf("NES", "SNES", "N64", "GameCube"), "科技", "NES（任天堂娱乐系统）于1983年在日本以Famicom的名称发布，在1983年游戏业崩溃后重振了视频游戏行业。"),
            es = LocalizedContent("¿Qué consola de juegos fue creada por Nintendo en 1983?", listOf("NES", "SNES", "N64", "GameCube"), "Tecnología", "La NES (Nintendo Entertainment System) se lanzó en 1983 en Japón como Famicom, revitalizando la industria de los videojuegos tras la crisis de 1983.")
        ),
        BilingualQuestion(
            id = 30156, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Que signifie 'GPU' ?", listOf("Unité de Traitement Graphique", "Mise à jour du Traitement Général", "Utilitaire de Plateforme Mondiale", "Unité de Puissance Graphique"), "Tech", "GPU est l'acronyme de Graphics Processing Unit, traduit en français par Unité de Traitement Graphique. Ce composant électronique est spécialisé dans le calcul rapide d'images et d'animations, essentiel pour les jeux vidéo et le rendu 3D."),
            en = LocalizedContent("What does 'GPU' stand for?", listOf("Graphics Processing Unit", "General Processing Update", "Global Platform Utility", "Graphics Power Unit"), "Technology", "GPU stands for Graphics Processing Unit, a specialized electronic circuit designed to rapidly manipulate and alter memory to accelerate the creation of images in a frame buffer intended for output to a display device."),
            zh = LocalizedContent("'GPU'代表什么？", listOf("图形处理单元", "通用处理更新", "全球平台实用程序", "图形电源单元"), "科技", "GPU代表图形处理单元，是一种专门的电子电路，旨在快速操作和改变内存，以加速帧缓冲区中图像的创建，用于输出到显示设备。"),
            es = LocalizedContent("¿Qué significa 'GPU'?", listOf("Unidad de Procesamiento Gráfico", "Actualización de Procesamiento General", "Utilidad de Plataforma Global", "Unidad de Potencia Gráfica"), "Tecnología", "GPU significa Unidad de Procesamiento Gráfico, un circuito electrónico especializado diseñado para manipular y alterar rápidamente la memoria para acelerar la creación de imágenes en un búfer de cuadros destinado a la salida a un dispositivo de visualización.")
        ),
        BilingualQuestion(
            id = 30157, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est connu comme le père de l'intelligence artificielle ?", listOf("Alan Turing", "Geoffrey Hinton", "Yann LeCun", "Yoshua Bengio"), "Tech", "Alan Turing a posé les bases théoriques de l'IA avec son test de Turing et ses travaux sur la machine universelle, publiés dans les années 1950."),
            en = LocalizedContent("Who is known as the father of artificial intelligence?", listOf("Alan Turing", "Geoffrey Hinton", "Yann LeCun", "Yoshua Bengio"), "Technology", "Alan Turing laid the theoretical foundations of AI with his Turing Test and work on the universal machine, published in the 1950s."),
            zh = LocalizedContent("谁被称为人工智能之父？", listOf("艾伦·图灵", "杰弗里·辛顿", "杨立昆", "约书亚·本吉奥"), "科技", "艾伦·图灵通过图灵测试和通用机器的工作奠定了人工智能的理论基础，发表于20世纪50年代。"),
            es = LocalizedContent("¿Quién es conocido como el padre de la inteligencia artificial?", listOf("Alan Turing", "Geoffrey Hinton", "Yann LeCun", "Yoshua Bengio"), "Tecnología", "Alan Turing sentó las bases teóricas de la IA con su Test de Turing y su trabajo sobre la máquina universal, publicados en la década de 1950.")
        ),
        BilingualQuestion(
            id = 30158, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle crypto-monnaie a été créée par Satoshi Nakamoto ?", listOf("Bitcoin", "Ethereum", "Dogecoin", "Ripple"), "Tech", "Bitcoin a été lancé en 2009 par une personne ou un groupe sous le pseudonyme Satoshi Nakamoto, dont l'identité réelle reste inconnue."),
            en = LocalizedContent("Which cryptocurrency was created by Satoshi Nakamoto?", listOf("Bitcoin", "Ethereum", "Dogecoin", "Ripple"), "Technology", "Bitcoin was launched in 2009 by a person or group under the pseudonym Satoshi Nakamoto, whose real identity remains unknown."),
            zh = LocalizedContent("哪种加密货币是由中本聪创建的？", listOf("比特币", "以太坊", "狗狗币", "瑞波币"), "科技", "比特币于2009年由化名中本聪的个人或团体推出，其真实身份至今未知。"),
            es = LocalizedContent("¿Qué criptomoneda fue creada por Satoshi Nakamoto?", listOf("Bitcoin", "Ethereum", "Dogecoin", "Ripple"), "Tecnología", "Bitcoin fue lanzado en 2009 por una persona o grupo bajo el seudónimo Satoshi Nakamoto, cuya identidad real sigue siendo desconocida.")
        ),
        BilingualQuestion(
            id = 30159, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie 'VR' dans les jeux ?", listOf("Réalité Virtuelle", "Rendu Vertical", "Résolution Vectorielle", "Débit Variable"), "Tech", "VR signifie Réalité Virtuelle, une technologie qui plonge l'utilisateur dans un environnement numérique immersif via un casque."),
            en = LocalizedContent("What does 'VR' stand for in gaming?", listOf("Virtual Reality", "Vertical Rendering", "Vector Resolution", "Variable Rate"), "Technology", "VR stands for Virtual Reality, a technology that immerses the user in a digital environment through a headset."),
            zh = LocalizedContent("在游戏中，'VR'代表什么？", listOf("虚拟现实", "垂直渲染", "矢量分辨率", "可变速率"), "科技", "VR代表虚拟现实，一种通过头戴设备让用户沉浸于数字环境的技术。"),
            es = LocalizedContent("¿Qué significa 'VR' en los juegos?", listOf("Realidad Virtual", "Renderizado Vertical", "Resolución Vectorial", "Tasa Variable"), "Tecnología", "VR significa Realidad Virtual, una tecnología que sumerge al usuario en un entorno digital a través de un casco.")
        ),
        BilingualQuestion(
            id = 30160, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle entreprise a popularisé l'écran tactile des smartphones ?", listOf("Apple", "Samsung", "Nokia", "BlackBerry"), "Tech", "Apple a popularisé l'écran tactile capacitif avec l'iPhone en 2007, rendant cette technologie intuitive et accessible au grand public."),
            en = LocalizedContent("Which company popularized the touchscreen on smartphones?", listOf("Apple", "Samsung", "Nokia", "BlackBerry"), "Technology", "Apple popularized the capacitive touchscreen with the iPhone in 2007, making the technology intuitive and accessible to the general public."),
            zh = LocalizedContent("哪家公司普及了智能手机的触摸屏？", listOf("苹果", "三星", "诺基亚", "黑莓"), "科技", "苹果在2007年通过iPhone普及了电容式触摸屏，使该技术变得直观且为大众所接受。"),
            es = LocalizedContent("¿Qué empresa popularizó la pantalla táctil en los teléfonos inteligentes?", listOf("Apple", "Samsung", "Nokia", "BlackBerry"), "Tecnología", "Apple popularizó la pantalla táctil capacitiva con el iPhone en 2007, haciendo que la tecnología fuera intuitiva y accesible para el público en general.")
        ),
        BilingualQuestion(
            id = 30161, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Après quel nom Python (le langage de programmation) a-t-il été nommé ?", listOf("Monty Python", "Une espèce de serpent", "Un concept de programmation", "Une créature mythique"), "Tech", "Guido van Rossum, le créateur de Python, a nommé le langage en hommage à la troupe comique britannique Monty Python, dont il était fan."),
            en = LocalizedContent("After what name was Python (the programming language) named?", listOf("Monty Python", "A species of snake", "A programming concept", "A mythical creature"), "Technology", "Guido van Rossum, the creator of Python, named the language as a tribute to the British comedy troupe Monty Python, of which he was a fan."),
            zh = LocalizedContent("Python（编程语言）是以什么命名的？", listOf("蒙提·派森", "一种蛇", "一个编程概念", "一种神话生物"), "科技", "Python的创造者吉多·范罗苏姆以他喜爱的英国喜剧团体蒙提·派森命名了该语言。"),
            es = LocalizedContent("¿Tras qué nombre se nombró Python (el lenguaje de programación)?", listOf("Monty Python", "Una especie de serpiente", "Un concepto de programación", "Una criatura mítica"), "Tecnología", "Guido van Rossum, el creador de Python, nombró el lenguaje en homenaje al grupo cómico británico Monty Python, del cual era fan.")
        ),
        BilingualQuestion(
            id = 30162, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel géant technologique a acquis Instagram en 2012 ?", listOf("Facebook", "Google", "Amazon", "Microsoft"), "Tech", "Facebook a racheté Instagram en 2012 pour environ 1 milliard de dollars, renforçant ainsi sa présence dans le partage de photos mobiles."),
            en = LocalizedContent("Which tech giant acquired Instagram in 2012?", listOf("Facebook", "Google", "Amazon", "Microsoft"), "Technology", "Facebook bought Instagram in 2012 for about $1 billion, strengthening its presence in mobile photo sharing."),
            zh = LocalizedContent("2012年，哪家科技巨头收购了Instagram？", listOf("Facebook", "谷歌", "亚马逊", "微软"), "科技", "Facebook在2012年以约10亿美元收购了Instagram，从而加强了其在移动照片分享领域的地位。"),
            es = LocalizedContent("¿Qué gigante tecnológico adquirió Instagram en 2012?", listOf("Facebook", "Google", "Amazon", "Microsoft"), "Tecnología", "Facebook compró Instagram en 2012 por aproximadamente mil millones de dólares, fortaleciendo su presencia en el intercambio de fotos móviles.")
        ),
        BilingualQuestion(
            id = 30164, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a développé le World Wide Web ?", listOf("Tim Berners-Lee", "Vint Cerf", "Jon Postel", "Lawrence Roberts"), "Tech", "Tim Berners-Lee a inventé le World Wide Web en 1989 alors qu'il travaillait au CERN, proposant un système de navigation par hyperliens pour partager des informations entre chercheurs."),
            en = LocalizedContent("Who developed the World Wide Web?", listOf("Tim Berners-Lee", "Vint Cerf", "Jon Postel", "Lawrence Roberts"), "Technology", "Tim Berners-Lee invented the World Wide Web in 1989 while working at CERN, proposing a hyperlink navigation system to share information among researchers."),
            zh = LocalizedContent("谁开发了万维网？", listOf("蒂姆·伯纳斯-李", "文特·瑟夫", "乔恩·波斯特尔", "劳伦斯·罗伯茨"), "科技", "蒂姆·伯纳斯-李于1989年在欧洲核子研究中心工作时发明了万维网，提出了一个超链接导航系统，用于研究人员之间共享信息。"),
            es = LocalizedContent("¿Quién desarrolló la World Wide Web?", listOf("Tim Berners-Lee", "Vint Cerf", "Jon Postel", "Lawrence Roberts"), "Tecnología", "Tim Berners-Lee inventó la World Wide Web en 1989 mientras trabajaba en el CERN, proponiendo un sistema de navegación por hipervínculos para compartir información entre investigadores.")
        ),
        BilingualQuestion(
            id = 30165, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'objectif principal de la technologie blockchain ?", listOf("Enregistrement décentralisé des données", "Amélioration de la vitesse Internet", "Refroidissement des ordinateurs", "Optimisation du stockage"), "Tech", "La blockchain est conçue pour stocker des informations de manière décentralisée, répartie sur un réseau d'ordinateurs, garantissant transparence et sécurité sans autorité centrale."),
            en = LocalizedContent("What is the main purpose of blockchain technology?", listOf("Decentralized data recording", "Improving internet speed", "Cooling computers", "Optimizing storage"), "Technology", "Blockchain is designed to store information in a decentralized manner, distributed across a network of computers, ensuring transparency and security without a central authority."),
            zh = LocalizedContent("区块链技术的主要目的是什么？", listOf("去中心化数据记录", "提高互联网速度", "冷却计算机", "优化存储"), "科技", "区块链旨在以去中心化的方式存储信息，分布在计算机网络中，无需中央权威即可确保透明度和安全性。"),
            es = LocalizedContent("¿Cuál es el objetivo principal de la tecnología blockchain?", listOf("Registro descentralizado de datos", "Mejora de la velocidad de Internet", "Enfriamiento de computadoras", "Optimización del almacenamiento"), "Tecnología", "Blockchain está diseñado para almacenar información de manera descentralizada, distribuida en una red de computadoras, garantizando transparencia y seguridad sin una autoridad central.")
        ),
        BilingualQuestion(
            id = 30166, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel jeu esport a les plus grands prix mondiaux ?", listOf("Dota 2", "League of Legends", "Counter-Strike", "Starcraft"), "Tech", "Dota 2 détient le record des plus gros prize pools de l'esport, notamment grâce à son système de financement participatif via le Battle Pass pour The International."),
            en = LocalizedContent("Which esports game has the largest prize pools worldwide?", listOf("Dota 2", "League of Legends", "Counter-Strike", "Starcraft"), "Technology", "Dota 2 holds the record for the largest esports prize pools, thanks to its crowdfunding system via the Battle Pass for The International."),
            zh = LocalizedContent("哪款电子竞技游戏拥有全球最大的奖金池？", listOf("Dota 2", "英雄联盟", "反恐精英", "星际争霸"), "科技", "Dota 2保持着电子竞技最大奖金池的记录，这得益于其通过国际邀请赛勇士令状进行的众筹系统。"),
            es = LocalizedContent("¿Qué juego de esports tiene los mayores premios mundiales?", listOf("Dota 2", "League of Legends", "Counter-Strike", "Starcraft"), "Tecnología", "Dota 2 posee el récord de los mayores premios en esports, gracias a su sistema de financiación colectiva a través del Battle Pass para The International.")
        ),
        BilingualQuestion(
            id = 30167, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Que signifie 'API' en programmation ?", listOf("Interface de Programmation d'Applications", "Intégration de Processus Automatisés", "Interface de Protocole Avancé", "Entrée de Traitement Algorithmique"), "Tech", "API signifie Application Programming Interface, soit Interface de Programmation d'Applications en français. C'est un ensemble de règles qui permet à des logiciels de communiquer entre eux."),
            en = LocalizedContent("What does 'API' stand for in programming?", listOf("Application Programming Interface", "Automated Process Integration", "Advanced Protocol Interface", "Algorithmic Processing Input"), "Technology", "API stands for Application Programming Interface. It is a set of rules that allows software programs to communicate with each other."),
            zh = LocalizedContent("编程中'API'代表什么？", listOf("应用程序编程接口", "自动化流程集成", "高级协议接口", "算法处理输入"), "科技", "API代表应用程序编程接口。它是一组规则，允许软件程序之间相互通信。"),
            es = LocalizedContent("¿Qué significa 'API' en programación?", listOf("Interfaz de Programación de Aplicaciones", "Integración de Procesos Automatizados", "Interfaz de Protocolo Avanzado", "Entrada de Procesamiento Algorítmico"), "Tecnología", "API significa Application Programming Interface (Interfaz de Programación de Aplicaciones). Es un conjunto de reglas que permite que los programas de software se comuniquen entre sí.")
        ),
        BilingualQuestion(
            id = 30168, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle entreprise informatique quantique IBM a-t-elle établie ?", listOf("IBM", "Google", "IonQ", "D-Wave"), "Tech", "IBM a fondé sa propre division d'informatique quantique, nommée IBM Quantum, en 2015 pour développer des ordinateurs quantiques et des services cloud associés."),
            en = LocalizedContent("Which quantum computing company did IBM establish?", listOf("IBM", "Google", "IonQ", "D-Wave"), "Technology", "IBM founded its own quantum computing division, named IBM Quantum, in 2015 to develop quantum computers and associated cloud services."),
            zh = LocalizedContent("IBM建立了哪家量子计算公司？", listOf("IBM", "谷歌", "IonQ", "D-Wave"), "科技", "IBM于2015年成立了其量子计算部门，名为IBM Quantum，以开发量子计算机和相关云服务。"),
            es = LocalizedContent("¿Qué empresa de computación cuántica estableció IBM?", listOf("IBM", "Google", "IonQ", "D-Wave"), "Tecnología", "IBM fundó su propia división de computación cuántica, llamada IBM Quantum, en 2015 para desarrollar ordenadores cuánticos y servicios en la nube asociados.")
        ),
        BilingualQuestion(
            id = 30169, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la première webcam a-t-elle été créée à l'Université Cambridge ?", listOf("1991", "1995", "1998", "2001"), "Tech", "La première webcam fut installée en 1991 à l'Université de Cambridge pour surveiller une machine à café, permettant aux chercheurs de vérifier à distance s'il y avait du café disponible."),
            en = LocalizedContent("In what year was the first webcam created at the University of Cambridge?", listOf("1991", "1995", "1998", "2001"), "Technology", "The first webcam was installed in 1991 at the University of Cambridge to monitor a coffee machine, allowing researchers to remotely check if coffee was available."),
            zh = LocalizedContent("剑桥大学的第一台网络摄像头是在哪一年创造的？", listOf("1991", "1995", "1998", "2001"), "科技", "第一台网络摄像头于1991年安装在剑桥大学，用于监控一台咖啡机，使研究人员能够远程查看是否有咖啡可用。"),
            es = LocalizedContent("¿En qué año se creó la primera webcam en la Universidad de Cambridge?", listOf("1991", "1995", "1998", "2001"), "Tecnología", "La primera webcam se instaló en 1991 en la Universidad de Cambridge para monitorear una máquina de café, permitiendo a los investigadores verificar de forma remota si había café disponible.")
        ),
        BilingualQuestion(
            id = 30170, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel milliardaire de la technologie a fondé SpaceX ?", listOf("Elon Musk", "Jeff Bezos", "Bill Gates", "Mark Zuckerberg"), "Tech", "Elon Musk a fondé SpaceX en 2002 avec l'objectif de réduire les coûts d'accès à l'espace et de permettre la colonisation de Mars."),
            en = LocalizedContent("Which tech billionaire founded SpaceX?", listOf("Elon Musk", "Jeff Bezos", "Bill Gates", "Mark Zuckerberg"), "Technology", "Elon Musk founded SpaceX in 2002 with the goal of reducing space access costs and enabling the colonization of Mars."),
            zh = LocalizedContent("哪位科技亿万富翁创立了SpaceX？", listOf("埃隆·马斯克", "杰夫·贝佐斯", "比尔·盖茨", "马克·扎克伯格"), "科技", "埃隆·马斯克于2002年创立了SpaceX，目标是降低太空访问成本并实现火星殖民。"),
            es = LocalizedContent("¿Qué multimillonario tecnológico fundó SpaceX?", listOf("Elon Musk", "Jeff Bezos", "Bill Gates", "Mark Zuckerberg"), "Tecnología", "Elon Musk fundó SpaceX en 2002 con el objetivo de reducir los costos de acceso al espacio y permitir la colonización de Marte.")
        ),
        BilingualQuestion(
            id = 30171, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Que signifie 'NVIDIA' ?", listOf("Pas d'Architecture d'Affichage Vidéo", "Pas un GPU traditionnel", "Entrée Vidéo Réseau", "Appareil d'Interface Vidéo Suivant"), "Tech", "NVIDIA est un acronyme pour \"Next Video Interface Device\", choisi lors de la création de l'entreprise en 1993 par Jensen Huang, Chris Malachowsky et Curtis Priem."),
            en = LocalizedContent("What does 'NVIDIA' stand for?", listOf("Next Video Interface Device", "Not a GPU", "Network Video Entry", "Next Video Interface Device"), "Technology", "NVIDIA is an acronym for \"Next Video Interface Device\", chosen when the company was founded in 1993 by Jensen Huang, Chris Malachowsky, and Curtis Priem."),
            zh = LocalizedContent("'NVIDIA'代表什么？", listOf("下一代视频接口设备", "不是GPU", "网络视频输入", "下一代视频接口设备"), "科技", "NVIDIA是\"Next Video Interface Device\"的缩写，由黄仁勋、克里斯·马拉科夫斯基和柯蒂斯·普里姆在1993年创立公司时选定。"),
            es = LocalizedContent("¿Qué significa 'NVIDIA'?", listOf("Próximo Dispositivo de Interfaz de Video", "No es una GPU", "Entrada de Video de Red", "Próximo Dispositivo de Interfaz de Video"), "Tecnología", "NVIDIA es un acrónimo de \"Next Video Interface Device\", elegido cuando la empresa fue fundada en 1993 por Jensen Huang, Chris Malachowsky y Curtis Priem.")
        ),
        BilingualQuestion(
            id = 30172, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel framework d'apprentissage profond est maintenu par Facebook AI Research ?", listOf("PyTorch", "TensorFlow", "Keras", "Caffe"), "Tech", "PyTorch est un framework open source d'apprentissage profond développé et maintenu par Facebook AI Research (FAIR), lancé en 2016."),
            en = LocalizedContent("Which deep learning framework is maintained by Facebook AI Research?", listOf("PyTorch", "TensorFlow", "Keras", "Caffe"), "Technology", "PyTorch is an open-source deep learning framework developed and maintained by Facebook AI Research (FAIR), launched in 2016."),
            zh = LocalizedContent("哪个深度学习框架由Facebook AI Research维护？", listOf("PyTorch", "TensorFlow", "Keras", "Caffe"), "科技", "PyTorch是一个由Facebook AI Research（FAIR）开发和维护的开源深度学习框架，于2016年推出。"),
            es = LocalizedContent("¿Qué framework de aprendizaje profundo es mantenido por Facebook AI Research?", listOf("PyTorch", "TensorFlow", "Keras", "Caffe"), "Tecnología", "PyTorch es un framework de aprendizaje profundo de código abierto desarrollado y mantenido por Facebook AI Research (FAIR), lanzado en 2016.")
        ),
        BilingualQuestion(
            id = 30173, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nom du processeur quantique de Google annoncé en 2019 ?", listOf("Sycamore", "Willow", "Bristlecone", "Aspen"), "Tech", "Sycamore est le processeur quantique de Google qui a démontré en 2019 la suprématie quantique en effectuant un calcul spécifique en 200 secondes, là où un supercalculateur classique aurait mis des milliers d'années."),
            en = LocalizedContent("What is the name of Google's quantum processor announced in 2019?", listOf("Sycamore", "Willow", "Bristlecone", "Aspen"), "Technology", "Sycamore is Google's quantum processor that demonstrated quantum supremacy in 2019 by performing a specific calculation in 200 seconds, whereas a classical supercomputer would have taken thousands of years."),
            zh = LocalizedContent("谷歌在2019年宣布的量子处理器叫什么名字？", listOf("Sycamore", "Willow", "Bristlecone", "Aspen"), "科技", "Sycamore是谷歌的量子处理器，于2019年展示了量子霸权，在200秒内完成了一项特定计算，而经典超级计算机需要数千年。"),
            es = LocalizedContent("¿Cuál es el nombre del procesador cuántico de Google anunciado en 2019?", listOf("Sycamore", "Willow", "Bristlecone", "Aspen"), "Tecnología", "Sycamore es el procesador cuántico de Google que demostró la supremacía cuántica en 2019 al realizar un cálculo específico en 200 segundos, mientras que una supercomputadora clásica habría tardado miles de años.")
        ),
        BilingualQuestion(
            id = 30174, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel terme de cybersécurité désigne une vulnérabilité inconnue du fournisseur ?", listOf("Zero-day", "Black-hat", "White-hat", "Red-team"), "Tech", "Le terme zero-day désigne une faille de sécurité qui n'a pas encore été découverte ou corrigée par le développeur, laissant aux attaquants un temps d'avance pour l'exploiter avant qu'un correctif ne soit disponible."),
            en = LocalizedContent("Which cybersecurity term refers to a vulnerability unknown to the vendor?", listOf("Zero-day", "Black-hat", "White-hat", "Red-team"), "Technology", "The term zero-day refers to a security flaw that has not yet been discovered or patched by the developer, giving attackers a head start to exploit it before a fix is available."),
            zh = LocalizedContent("哪个网络安全术语指供应商未知的漏洞？", listOf("零日漏洞", "黑帽", "白帽", "红队"), "科技", "零日漏洞指尚未被开发者发现或修补的安全漏洞，攻击者可在补丁发布前利用它。"),
            es = LocalizedContent("¿Qué término de ciberseguridad se refiere a una vulnerabilidad desconocida para el proveedor?", listOf("Zero-day", "Black-hat", "White-hat", "Red-team"), "Tecnología", "El término zero-day se refiere a una falla de seguridad que aún no ha sido descubierta o corregida por el desarrollador, dando a los atacantes ventaja para explotarla antes de que haya un parche.")
        ),
        BilingualQuestion(
            id = 30175, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la vitesse théorique maximale de l'USB 3.2 ?", listOf("20 Gbps", "10 Gbps", "5 Gbps", "480 Mbps"), "Tech", "L'USB 3.2 Gen 2x2 utilise deux voies de 10 Gbps chacune pour atteindre un débit théorique de 20 Gbps, soit le double de l'USB 3.2 Gen 2."),
            en = LocalizedContent("What is the theoretical maximum speed of USB 3.2?", listOf("20 Gbps", "10 Gbps", "5 Gbps", "480 Mbps"), "Technology", "USB 3.2 Gen 2x2 uses two lanes of 10 Gbps each to achieve a theoretical throughput of 20 Gbps, double that of USB 3.2 Gen 2."),
            zh = LocalizedContent("USB 3.2的理论最大速度是多少？", listOf("20 Gbps", "10 Gbps", "5 Gbps", "480 Mbps"), "科技", "USB 3.2 Gen 2x2使用两条10 Gbps通道，理论吞吐量达到20 Gbps，是USB 3.2 Gen 2的两倍。"),
            es = LocalizedContent("¿Cuál es la velocidad teórica máxima de USB 3.2?", listOf("20 Gbps", "10 Gbps", "5 Gbps", "480 Mbps"), "Tecnología", "USB 3.2 Gen 2x2 utiliza dos carriles de 10 Gbps cada uno para alcanzar un rendimiento teórico de 20 Gbps, el doble de USB 3.2 Gen 2.")
        ),
        BilingualQuestion(
            id = 30176, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand animal du monde ?", listOf("Baleine bleue", "Éléphant d'Afrique", "Girafe", "Hippopotame"), "Nature", "La baleine bleue peut atteindre 30 mètres de long et peser jusqu'à 200 tonnes, ce qui en fait le plus grand animal connu sur Terre."),
            en = LocalizedContent("What is the largest animal in the world?", listOf("Blue whale", "African elephant", "Giraffe", "Hippopotamus"), "Nature", "The blue whale can reach up to 30 meters in length and weigh up to 200 tons, making it the largest known animal on Earth."),
            zh = LocalizedContent("世界上最大的动物是什么？", listOf("蓝鲸", "非洲象", "长颈鹿", "河马"), "自然", "蓝鲸体长可达30米，重达200吨，是地球上已知最大的动物。"),
            es = LocalizedContent("¿Cuál es el animal más grande del mundo?", listOf("Ballena azul", "Elefante africano", "Jirafa", "Hipopótamo"), "Naturaleza", "La ballena azul puede alcanzar hasta 30 metros de longitud y pesar hasta 200 toneladas, lo que la convierte en el animal más grande conocido en la Tierra.")
        ),
        BilingualQuestion(
            id = 30177, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes une pieuvre a-t-elle ?", listOf("8", "6", "10", "12"), "Nature", "Les pieuvres sont des céphalopodes caractérisés par huit bras, d'où leur nom commun de poulpe. Ces bras sont munis de ventouses et leur permettent de se déplacer et de capturer leurs proies."),
            en = LocalizedContent("How many legs does an octopus have?", listOf("8", "6", "10", "12"), "Nature", "Octopuses are cephalopods characterized by eight arms, hence their common name. These arms are equipped with suckers and allow them to move and capture prey."),
            zh = LocalizedContent("章鱼有多少条腿？", listOf("8", "6", "10", "12"), "自然", "章鱼是头足类动物，有八条腕足，因此俗称八爪鱼。这些腕足上有吸盘，用于移动和捕食。"),
            es = LocalizedContent("¿Cuántas patas tiene un pulpo?", listOf("8", "6", "10", "12"), "Naturaleza", "Los pulpos son cefalópodos caracterizados por ocho brazos, de ahí su nombre común. Estos brazos están equipados con ventosas y les permiten moverse y capturar presas.")
        ),
        BilingualQuestion(
            id = 30179, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand océan de la Terre ?", listOf("Pacifique", "Atlantique", "Indien", "Arctique"), "Nature", "L'océan Pacifique est le plus grand océan de la Terre, couvrant environ 165 millions de kilomètres carrés, soit plus du tiers de la surface de la planète."),
            en = LocalizedContent("What is the largest ocean on Earth?", listOf("Pacific", "Atlantic", "Indian", "Arctic"), "Nature", "The Pacific Ocean is the largest ocean on Earth, covering approximately 165 million square kilometers, more than one-third of the planet's surface."),
            zh = LocalizedContent("地球上最大的海洋是什么？", listOf("太平洋", "大西洋", "印度洋", "北冰洋"), "自然", "太平洋是地球上最大的海洋，面积约1.65亿平方公里，占地球表面积的三分之一以上。"),
            es = LocalizedContent("¿Cuál es el océano más grande de la Tierra?", listOf("Pacífico", "Atlántico", "Índico", "Ártico"), "Naturaleza", "El océano Pacífico es el más grande de la Tierra, cubriendo aproximadamente 165 millones de kilómetros cuadrados, más de un tercio de la superficie del planeta.")
        ),
        BilingualQuestion(
            id = 30180, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'espèces de manchots existent ?", listOf("18", "10", "25", "30"), "Nature", "Il existe 18 espèces de manchots reconnues scientifiquement, toutes vivant dans l'hémisphère sud, des côtes de l'Antarctique aux îles tempérées comme les Galápagos."),
            en = LocalizedContent("How many species of penguins exist?", listOf("18", "10", "25", "30"), "Nature", "There are 18 scientifically recognized species of penguins, all living in the Southern Hemisphere, from the Antarctic coast to temperate islands like the Galápagos."),
            zh = LocalizedContent("企鹅有多少种？", listOf("18", "10", "25", "30"), "自然", "科学界公认有18种企鹅，全部生活在南半球，从南极海岸到加拉帕戈斯等温带岛屿。"),
            es = LocalizedContent("¿Cuántas especies de pingüinos existen?", listOf("18", "10", "25", "30"), "Naturaleza", "Existen 18 especies de pingüinos reconocidas científicamente, todas viviendo en el hemisferio sur, desde las costas de la Antártida hasta islas templadas como las Galápagos.")
        ),
        BilingualQuestion(
            id = 30182, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le régime alimentaire principal d'un panda géant ?", listOf("Bambou", "Viande", "Poisson", "Fruit"), "Nature", "Le panda géant est un mammifère herbivore dont l'alimentation est constituée à 99 % de bambou, malgré son appartenance à l'ordre des carnivores."),
            en = LocalizedContent("What is the main diet of a giant panda?", listOf("Bamboo", "Meat", "Fish", "Fruit"), "Nature", "The giant panda is a herbivorous mammal whose diet consists of 99% bamboo, despite belonging to the order Carnivora."),
            zh = LocalizedContent("大熊猫的主要食物是什么？", listOf("竹子", "肉", "鱼", "水果"), "自然", "大熊猫是草食性哺乳动物，尽管属于食肉目，但其食物99%是竹子。"),
            es = LocalizedContent("¿Cuál es la dieta principal de un panda gigante?", listOf("Bambú", "Carne", "Pescado", "Fruta"), "Naturaleza", "El panda gigante es un mamífero herbívoro cuya alimentación consiste en un 99% de bambú, a pesar de pertenecer al orden de los carnívoros.")
        ),
        BilingualQuestion(
            id = 30183, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand volcan actif du monde ?", listOf("Mauna Loa", "Mont Merapi", "Krakatoa", "Popocatépetl"), "Nature", "Le Mauna Loa, situé à Hawaï, est le plus grand volcan actif du monde en volume et en superficie, avec une éruption majeure en 2022."),
            en = LocalizedContent("What is the largest active volcano in the world?", listOf("Mauna Loa", "Mount Merapi", "Krakatoa", "Popocatépetl"), "Nature", "Mauna Loa, located in Hawaii, is the largest active volcano in the world by volume and area, with a major eruption in 2022."),
            zh = LocalizedContent("世界上最大的活火山是什么？", listOf("莫纳罗亚火山", "默拉皮火山", "喀拉喀托火山", "波波卡特佩特火山"), "自然", "莫纳罗亚火山位于夏威夷，是体积和面积最大的活火山，2022年曾发生大规模喷发。"),
            es = LocalizedContent("¿Cuál es el volcán activo más grande del mundo?", listOf("Mauna Loa", "Monte Merapi", "Krakatoa", "Popocatépetl"), "Naturaleza", "El Mauna Loa, ubicado en Hawái, es el volcán activo más grande del mundo en volumen y área, con una erupción importante en 2022.")
        ),
        BilingualQuestion(
            id = 30184, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pourcentage de l'oxygène terrestre est produit par les océans ?", listOf("50-70%", "10-20%", "30-40%", "80-90%"), "Nature", "Le phytoplancton marin, via la photosynthèse, génère entre 50 et 70 % de l'oxygène atmosphérique, ce qui fait des océans le principal poumon de la planète."),
            en = LocalizedContent("What percentage of Earth's oxygen is produced by the oceans?", listOf("50-70%", "10-20%", "30-40%", "80-90%"), "Nature", "Marine phytoplankton, through photosynthesis, generates between 50 and 70% of atmospheric oxygen, making the oceans the planet's main lung."),
            zh = LocalizedContent("地球上的氧气有多少百分比是由海洋产生的？", listOf("50-70%", "10-20%", "30-40%", "80-90%"), "自然", "海洋浮游植物通过光合作用产生大气中50%到70%的氧气，使海洋成为地球的主要肺脏。"),
            es = LocalizedContent("¿Qué porcentaje del oxígeno terrestre es producido por los océanos?", listOf("50-70%", "10-20%", "30-40%", "80-90%"), "Naturaleza", "El fitoplancton marino, mediante la fotosíntesis, genera entre el 50 y el 70% del oxígeno atmosférico, lo que convierte a los océanos en el principal pulmón del planeta.")
        ),
        BilingualQuestion(
            id = 30185, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'espèces reconnues de récifs coralliens existent ?", listOf("Plus de 800", "Plus de 200", "Plus de 1000", "Plus de 500"), "Nature", "Les scientifiques recensent plus de 800 espèces de coraux durs constructeurs de récifs, principalement dans les eaux chaudes et peu profondes des océans tropicaux."),
            en = LocalizedContent("How many recognized species of reef-building corals exist?", listOf("Over 800", "Over 200", "Over 1000", "Over 500"), "Nature", "Scientists have identified over 800 species of hard corals that build reefs, mainly in warm, shallow tropical ocean waters."),
            zh = LocalizedContent("已知的造礁珊瑚物种有多少种？", listOf("超过800种", "超过200种", "超过1000种", "超过500种"), "自然", "科学家已识别出超过800种硬珊瑚，它们主要在热带海洋的温暖浅水中建造礁石。"),
            es = LocalizedContent("¿Cuántas especies reconocidas de corales formadores de arrecifes existen?", listOf("Más de 800", "Más de 200", "Más de 1000", "Más de 500"), "Naturaleza", "Los científicos han identificado más de 800 especies de corales duros que construyen arrecifes, principalmente en aguas cálidas y poco profundas de los océanos tropicales.")
        ),
        BilingualQuestion(
            id = 30186, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal a le cou le plus long de tous les êtres vivants ?", listOf("Girafe", "Autruche", "Lama", "Émeu"), "Nature", "La girafe possède le cou le plus long de tous les animaux vivants, mesurant jusqu'à 2,4 mètres, ce qui lui permet d'atteindre les feuilles hautes des arbres dans la savane africaine."),
            en = LocalizedContent("Which animal has the longest neck of all living beings?", listOf("Giraffe", "Ostrich", "Llama", "Emu"), "Nature", "The giraffe has the longest neck of any living animal, measuring up to 2.4 meters, allowing it to reach high leaves in the African savanna."),
            zh = LocalizedContent("哪种动物的脖子是所有生物中最长的？", listOf("长颈鹿", "鸵鸟", "羊驼", "鸸鹋"), "自然", "长颈鹿拥有所有现存动物中最长的脖子，长达2.4米，使其能够够到非洲稀树草原上的高树叶。"),
            es = LocalizedContent("¿Qué animal tiene el cuello más largo de todos los seres vivos?", listOf("Jirafa", "Avestruz", "Llama", "Emú"), "Naturaleza", "La jirafa posee el cuello más largo de todos los animales vivos, midiendo hasta 2,4 metros, lo que le permite alcanzar las hojas altas de los árboles en la sabana africana.")
        ),
        BilingualQuestion(
            id = 30187, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la partie la plus profonde de l'océan ?", listOf("Fosse des Mariannes", "Fosse de Tonga", "Fosse des Philippines", "Fosse Kourilo-Kamtchatka"), "Nature", "La fosse des Mariannes, située dans l'océan Pacifique, atteint environ 11 034 mètres de profondeur à son point le plus bas, le Challenger Deep."),
            en = LocalizedContent("What is the deepest part of the ocean?", listOf("Mariana Trench", "Tonga Trench", "Philippine Trench", "Kuril–Kamchatka Trench"), "Nature", "The Mariana Trench, located in the Pacific Ocean, reaches approximately 11,034 meters at its deepest point, the Challenger Deep."),
            zh = LocalizedContent("海洋中最深的部分是什么？", listOf("马里亚纳海沟", "汤加海沟", "菲律宾海沟", "千岛-堪察加海沟"), "自然", "马里亚纳海沟位于太平洋，其最深处挑战者深渊约达11034米。"),
            es = LocalizedContent("¿Cuál es la parte más profunda del océano?", listOf("Fosa de las Marianas", "Fosa de Tonga", "Fosa de Filipinas", "Fosa de Kuril-Kamchatka"), "Naturaleza", "La fosa de las Marianas, situada en el océano Pacífico, alcanza aproximadamente 11 034 metros de profundidad en su punto más bajo, el Challenger Deep.")
        ),
        BilingualQuestion(
            id = 30188, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle espèce d'oiseau est la plus grande en poids ?", listOf("Autruche", "Émeu", "Casoar", "Nandou"), "Nature", "L'autruche est l'oiseau le plus lourd au monde, avec un poids pouvant atteindre 150 kg, ce qui la rend incapable de voler mais très rapide à la course."),
            en = LocalizedContent("Which bird species is the heaviest in weight?", listOf("Ostrich", "Emu", "Cassowary", "Rhea"), "Nature", "The ostrich is the heaviest bird in the world, weighing up to 150 kg, making it flightless but very fast in running."),
            zh = LocalizedContent("哪种鸟类的体重最重？", listOf("鸵鸟", "鸸鹋", "食火鸡", "美洲鸵"), "自然", "鸵鸟是世界上最重的鸟类，体重可达150公斤，因此无法飞行但奔跑速度极快。"),
            es = LocalizedContent("¿Qué especie de ave es la más pesada?", listOf("Avestruz", "Emú", "Casuari", "Ñandú"), "Naturaleza", "El avestruz es el ave más pesada del mundo, con un peso de hasta 150 kg, lo que la hace incapaz de volar pero muy rápida al correr.")
        ),
        BilingualQuestion(
            id = 30189, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la cause principale de la déforestation en Amazonie ?", listOf("Élevage de bétail", "Exploitation forestière", "Exploitation minière", "Agriculture"), "Nature", "L'élevage de bétail est la première cause de déforestation en Amazonie, car d'immenses surfaces sont défrichées pour créer des pâturages destinés à l'industrie de la viande."),
            en = LocalizedContent("What is the main cause of deforestation in the Amazon?", listOf("Cattle ranching", "Logging", "Mining", "Agriculture"), "Nature", "Cattle ranching is the leading cause of deforestation in the Amazon, as vast areas are cleared for pasture to support the meat industry."),
            zh = LocalizedContent("亚马逊雨林砍伐的主要原因是什么？", listOf("养牛", "伐木", "采矿", "农业"), "自然", "养牛是亚马逊雨林砍伐的首要原因，因为大片土地被清理用于牧场以支持肉类产业。"),
            es = LocalizedContent("¿Cuál es la causa principal de la deforestación en la Amazonía?", listOf("Ganadería", "Explotación forestal", "Minería", "Agricultura"), "Naturaleza", "La ganadería es la primera causa de deforestación en la Amazonía, ya que se talan inmensas superficies para crear pastizales destinados a la industria de la carne.")
        ),
        BilingualQuestion(
            id = 30190, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'espèces s'éteignent par jour à cause de l'activité humaine ?", listOf("137", "50", "200", "300"), "Nature", "Selon l'Union internationale pour la conservation de la nature, l'activité humaine provoque l'extinction d'environ 137 espèces par jour, principalement à cause de la destruction des habitats et du changement climatique."),
            en = LocalizedContent("How many species go extinct per day due to human activity?", listOf("137", "50", "200", "300"), "Nature", "According to the International Union for Conservation of Nature, human activity causes the extinction of about 137 species per day, mainly due to habitat destruction and climate change."),
            zh = LocalizedContent("由于人类活动，每天有多少物种灭绝？", listOf("137", "50", "200", "300"), "自然", "根据国际自然保护联盟的数据，人类活动每天导致约137个物种灭绝，主要原因是栖息地破坏和气候变化。"),
            es = LocalizedContent("¿Cuántas especies se extinguen al día debido a la actividad humana?", listOf("137", "50", "200", "300"), "Naturaleza", "Según la Unión Internacional para la Conservación de la Naturaleza, la actividad humana provoca la extinción de aproximadamente 137 especies al día, principalmente por la destrucción de hábitats y el cambio climático.")
        ),
        BilingualQuestion(
            id = 30191, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("De quoi est composée la Grande Barrière de Corail ?", listOf("Polypes de corail", "Pierre", "Coquilles", "Algues"), "Nature", "La Grande Barrière de Corail est un vaste écosystème formé par des colonies de polypes de corail, de petits animaux marins qui sécrètent un squelette calcaire."),
            en = LocalizedContent("What is the Great Barrier Reef composed of?", listOf("Coral polyps", "Stone", "Shells", "Algae"), "Nature", "The Great Barrier Reef is a vast ecosystem formed by colonies of coral polyps, small marine animals that secrete a calcium carbonate skeleton."),
            zh = LocalizedContent("大堡礁是由什么组成的？", listOf("珊瑚虫", "石头", "贝壳", "藻类"), "自然", "大堡礁是一个广阔的生态系统，由珊瑚虫群体形成，这些小型海洋动物分泌碳酸钙骨骼。"),
            es = LocalizedContent("¿De qué está compuesta la Gran Barrera de Coral?", listOf("Pólipos de coral", "Piedra", "Conchas", "Algas"), "Naturaleza", "La Gran Barrera de Coral es un vasto ecosistema formado por colonias de pólipos de coral, pequeños animales marinos que secretan un esqueleto calcáreo.")
        ),
        BilingualQuestion(
            id = 30193, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la 'bioluminescence' ?", listOf("Lumière produite par les organismes vivants", "Chaleur des organismes", "Mouvement des organismes", "Changement de couleur des organismes"), "Nature", "La bioluminescence est un phénomène chimique où des êtres vivants, comme les lucioles ou certains poissons des profondeurs, produisent de la lumière grâce à une réaction entre une luciférine et une enzyme."),
            en = LocalizedContent("What is 'bioluminescence'?", listOf("Light produced by living organisms", "Heat from organisms", "Movement of organisms", "Color change of organisms"), "Nature", "Bioluminescence is a chemical phenomenon where living beings, such as fireflies or some deep-sea fish, produce light through a reaction between luciferin and an enzyme."),
            zh = LocalizedContent("什么是“生物发光”？", listOf("生物体产生的光", "生物体的热量", "生物体的运动", "生物体的颜色变化"), "自然", "生物发光是一种化学现象，萤火虫或某些深海鱼类等生物通过荧光素和酶之间的反应产生光。"),
            es = LocalizedContent("¿Qué es la 'bioluminiscencia'?", listOf("Luz producida por organismos vivos", "Calor de los organismos", "Movimiento de los organismos", "Cambio de color de los organismos"), "Naturaleza", "La bioluminiscencia es un fenómeno químico en el que seres vivos, como las luciérnagas o algunos peces de profundidad, producen luz mediante una reacción entre una luciferina y una enzima.")
        ),
        BilingualQuestion(
            id = 30194, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la profondeur de la zone euphotique dans l'océan ?", listOf("200 mètres", "1000 mètres", "500 mètres", "50 mètres"), "Nature", "La zone euphotique, où la lumière solaire pénètre suffisamment pour permettre la photosynthèse, s'étend en moyenne jusqu'à 200 mètres de profondeur dans l'océan."),
            en = LocalizedContent("What is the depth of the euphotic zone in the ocean?", listOf("200 meters", "1000 meters", "500 meters", "50 meters"), "Nature", "The euphotic zone, where sunlight penetrates sufficiently to allow photosynthesis, extends on average to 200 meters depth in the ocean."),
            zh = LocalizedContent("海洋中透光带的深度是多少？", listOf("200米", "1000米", "500米", "50米"), "自然", "透光带是阳光穿透足以进行光合作用的区域，在海洋中平均延伸至200米深度。"),
            es = LocalizedContent("¿Cuál es la profundidad de la zona eufótica en el océano?", listOf("200 metros", "1000 metros", "500 metros", "50 metros"), "Naturaleza", "La zona eufótica, donde la luz solar penetra lo suficiente para permitir la fotosíntesis, se extiende en promedio hasta 200 metros de profundidad en el océano.")
        ),
        BilingualQuestion(
            id = 30195, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'âge estimé du Grand Canyon ?", listOf("6 millions d'années", "2 millions d'années", "10 millions d'années", "1 million d'années"), "Nature", "Le Grand Canyon a commencé à se former il y a environ 6 millions d'années sous l'action érosive du fleuve Colorado. Cette estimation repose sur des datations de roches et de dépôts sédimentaires."),
            en = LocalizedContent("What is the estimated age of the Grand Canyon?", listOf("6 million years", "2 million years", "10 million years", "1 million years"), "Nature", "The Grand Canyon began forming about 6 million years ago due to the erosive action of the Colorado River. This estimate is based on dating of rocks and sedimentary deposits."),
            zh = LocalizedContent("大峡谷的估计年龄是多少？", listOf("600万年", "200万年", "1000万年", "100万年"), "自然", "大峡谷大约在600万年前开始形成，是由于科罗拉多河的侵蚀作用。这一估计基于岩石和沉积物的年代测定。"),
            es = LocalizedContent("¿Cuál es la edad estimada del Gran Cañón?", listOf("6 millones de años", "2 millones de años", "10 millones de años", "1 millón de años"), "Naturaleza", "El Gran Cañón comenzó a formarse hace unos 6 millones de años por la acción erosiva del río Colorado. Esta estimación se basa en dataciones de rocas y depósitos sedimentarios.")
        ),
        BilingualQuestion(
            id = 30196, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel animal a le plus de dents parmi tous les mammifères ?", listOf("Dauphin", "Éléphant", "Baleine", "Hippopotame"), "Nature", "Le dauphin peut avoir jusqu'à 250 dents, ce qui en fait le mammifère avec le plus grand nombre de dents. Ces dents servent principalement à attraper et retenir leurs proies glissantes."),
            en = LocalizedContent("Which animal has the most teeth among all mammals?", listOf("Dolphin", "Elephant", "Whale", "Hippopotamus"), "Nature", "Dolphins can have up to 250 teeth, making them the mammal with the highest number of teeth. These teeth are mainly used to catch and hold slippery prey."),
            zh = LocalizedContent("在所有哺乳动物中，哪种动物的牙齿最多？", listOf("海豚", "大象", "鲸鱼", "河马"), "自然", "海豚最多可有250颗牙齿，是牙齿数量最多的哺乳动物。这些牙齿主要用于捕捉和抓住滑溜的猎物。"),
            es = LocalizedContent("¿Qué animal tiene la mayor cantidad de dientes entre todos los mamíferos?", listOf("Delfín", "Elefante", "Ballena", "Hipopótamo"), "Naturaleza", "El delfín puede tener hasta 250 dientes, lo que lo convierte en el mamífero con mayor número de dientes. Estos dientes se usan principalmente para atrapar y retener presas resbaladizas.")
        ),
        BilingualQuestion(
            id = 30197, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le résultat scientifique de l'équation de photosynthèse CO2+H2O ?", listOf("C6H12O6 + O2", "CH4 + O", "C2H6 + O2", "C3H8 + O"), "Nature", "L'équation de la photosynthèse convertit le dioxyde de carbone et l'eau en glucose (C6H12O6) et en oxygène (O2) grâce à l'énergie lumineuse."),
            en = LocalizedContent("What is the scientific result of the photosynthesis equation CO2 + H2O?", listOf("C6H12O6 + O2", "CH4 + O", "C2H6 + O2", "C3H8 + O"), "Nature", "The photosynthesis equation converts carbon dioxide and water into glucose (C6H12O6) and oxygen (O2) using light energy."),
            zh = LocalizedContent("光合作用方程式CO2+H2O的科学结果是什么？", listOf("C6H12O6 + O2", "CH4 + O", "C2H6 + O2", "C3H8 + O"), "自然", "光合作用方程式利用光能将二氧化碳和水转化为葡萄糖（C6H12O6）和氧气（O2）。"),
            es = LocalizedContent("¿Cuál es el resultado científico de la ecuación de la fotosíntesis CO2 + H2O?", listOf("C6H12O6 + O2", "CH4 + O", "C2H6 + O2", "C3H8 + O"), "Naturaleza", "La ecuación de la fotosíntesis convierte dióxido de carbono y agua en glucosa (C6H12O6) y oxígeno (O2) mediante energía lumínica.")
        ),
        BilingualQuestion(
            id = 30198, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien d'espèces de poissons sont estimées exister dans le monde ?", listOf("30000-35000", "5000-10000", "50000-60000", "100000+"), "Nature", "Les océans et eaux douces abritent entre 30 000 et 35 000 espèces de poissons identifiées, mais les scientifiques estiment que ce nombre pourrait atteindre 40 000 avec les découvertes futures."),
            en = LocalizedContent("How many species of fish are estimated to exist in the world?", listOf("30000-35000", "5000-10000", "50000-60000", "100000+"), "Nature", "Oceans and freshwaters harbor between 30,000 and 35,000 identified fish species, but scientists estimate this number could reach 40,000 with future discoveries."),
            zh = LocalizedContent("世界上估计存在多少种鱼类？", listOf("30000-35000", "5000-10000", "50000-60000", "100000+"), "自然", "海洋和淡水中有3万到3.5万种已识别的鱼类，但科学家估计随着未来发现，这个数字可能达到4万。"),
            es = LocalizedContent("¿Cuántas especies de peces se estima que existen en el mundo?", listOf("30000-35000", "5000-10000", "50000-60000", "100000+"), "Naturaleza", "Los océanos y aguas dulces albergan entre 30 000 y 35 000 especies de peces identificadas, pero los científicos estiman que este número podría alcanzar 40 000 con futuros descubrimientos.")
        ),
        BilingualQuestion(
            id = 30199, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pourcentage de la forêt tropicale amazonienne a été défriché depuis 1970 ?", listOf("17%", "5%", "30%", "50%"), "Nature", "Depuis 1970, environ 17% de la forêt amazonienne a été défriché, principalement à cause de l'expansion agricole et de l'exploitation forestière."),
            en = LocalizedContent("What percentage of the Amazon rainforest has been cleared since 1970?", listOf("17%", "5%", "30%", "50%"), "Nature", "Since 1970, about 17% of the Amazon rainforest has been cleared, mainly due to agricultural expansion and logging."),
            zh = LocalizedContent("自1970年以来，亚马逊雨林有多少百分比被砍伐？", listOf("17%", "5%", "30%", "50%"), "自然", "自1970年以来，约17%的亚马逊雨林被砍伐，主要原因是农业扩张和伐木。"),
            es = LocalizedContent("¿Qué porcentaje de la selva amazónica ha sido deforestado desde 1970?", listOf("17%", "5%", "30%", "50%"), "Naturaleza", "Desde 1970, aproximadamente el 17% de la selva amazónica ha sido deforestado, principalmente debido a la expansión agrícola y la tala.")
        ),
        BilingualQuestion(
            id = 30200, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel organisme a le plus petit ratio cerveau-corps ?", listOf("Baleine bleue", "Éléphant", "Humain", "Pieuvre"), "Nature", "Malgré son cerveau de près de 7 kg, la baleine bleue possède le plus petit ratio cerveau-corps du règne animal, son corps pouvant peser jusqu'à 200 tonnes."),
            en = LocalizedContent("Which organism has the smallest brain-to-body ratio?", listOf("Blue whale", "Elephant", "Human", "Octopus"), "Nature", "Despite its brain weighing nearly 7 kg, the blue whale has the smallest brain-to-body ratio in the animal kingdom, as its body can weigh up to 200 tons."),
            zh = LocalizedContent("哪种生物的脑体比最小？", listOf("蓝鲸", "大象", "人类", "章鱼"), "自然", "尽管蓝鲸的大脑重近7公斤，但它的脑体比在动物王国中最小，因为它的身体可重达200吨。"),
            es = LocalizedContent("¿Qué organismo tiene la menor proporción cerebro-cuerpo?", listOf("Ballena azul", "Elefante", "Humano", "Pulpo"), "Naturaleza", "A pesar de tener un cerebro de casi 7 kg, la ballena azul posee la menor proporción cerebro-cuerpo del reino animal, ya que su cuerpo puede pesar hasta 200 toneladas.")
        ),
        BilingualQuestion(
            id = 30202, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la vitesse de la lumière ?", listOf("300 000 km/s", "150 000 km/s", "500 000 km/s", "100 000 km/s"), "Science", "C'est la valeur approximative de la vitesse de la lumière dans le vide, une constante fondamentale de la physique notée c."),
            en = LocalizedContent("What is the speed of light?", listOf("300,000 km/s", "150,000 km/s", "500,000 km/s", "100,000 km/s"), "Science", "This is the approximate speed of light in a vacuum, a fundamental constant of physics denoted c."),
            zh = LocalizedContent("光速是多少？", listOf("30万公里/秒", "15万公里/秒", "50万公里/秒", "10万公里/秒"), "科学", "这是光在真空中的近似速度，是物理学的基本常数，记为c。"),
            es = LocalizedContent("¿Cuál es la velocidad de la luz?", listOf("300 000 km/s", "150 000 km/s", "500 000 km/s", "100 000 km/s"), "Ciencia", "Este es el valor aproximado de la velocidad de la luz en el vacío, una constante fundamental de la física denotada como c.")
        ),
        BilingualQuestion(
            id = 30203, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'os un corps humain adulte a-t-il ?", listOf("206", "250", "186", "300"), "Science", "Le squelette humain adulte est composé de 206 os, un nombre qui peut varier légèrement selon les individus en raison de la fusion de certains os avec l'âge."),
            en = LocalizedContent("How many bones does an adult human body have?", listOf("206", "250", "186", "300"), "Science", "The adult human skeleton consists of 206 bones, a number that can vary slightly among individuals due to fusion of some bones with age."),
            zh = LocalizedContent("成年人体内有多少块骨头？", listOf("206", "250", "186", "300"), "科学", "成年人的骨骼由206块骨头组成，这个数字可能因个体差异而略有不同，因为有些骨头会随着年龄增长而融合。"),
            es = LocalizedContent("¿Cuántos huesos tiene un cuerpo humano adulto?", listOf("206", "250", "186", "300"), "Ciencia", "El esqueleto humano adulto consta de 206 huesos, número que puede variar ligeramente entre individuos debido a la fusión de algunos huesos con la edad.")
        ),
        BilingualQuestion(
            id = 30204, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'élément le plus abondant de l'univers ?", listOf("Hydrogène", "Hélium", "Carbone", "Oxygène"), "Science", "L'hydrogène est l'élément le plus abondant de l'univers, représentant environ 75% de sa masse baryonique, car il a été le premier élément formé après le Big Bang."),
            en = LocalizedContent("What is the most abundant element in the universe?", listOf("Hydrogen", "Helium", "Carbon", "Oxygen"), "Science", "Hydrogen is the most abundant element in the universe, accounting for about 75% of its baryonic mass, as it was the first element formed after the Big Bang."),
            zh = LocalizedContent("宇宙中最丰富的元素是什么？", listOf("氢", "氦", "碳", "氧"), "科学", "氢是宇宙中最丰富的元素，约占其重子质量的75%，因为它是大爆炸后形成的第一个元素。"),
            es = LocalizedContent("¿Cuál es el elemento más abundante del universo?", listOf("Hidrógeno", "Helio", "Carbono", "Oxígeno"), "Ciencia", "El hidrógeno es el elemento más abundante del universo, representando aproximadamente el 75% de su masa bariónica, ya que fue el primer elemento formado después del Big Bang.")
        ),
        BilingualQuestion(
            id = 30205, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est la centrale énergétique de la cellule ?", listOf("Mitochondrie", "Noyau", "Ribosome", "Appareil de Golgi"), "Science", "Les mitochondries sont les organites cellulaires responsables de la production d'énergie sous forme d'ATP via la respiration cellulaire."),
            en = LocalizedContent("What is the powerhouse of the cell?", listOf("Mitochondria", "Nucleus", "Ribosome", "Golgi apparatus"), "Science", "Mitochondria are the cellular organelles responsible for producing energy in the form of ATP through cellular respiration."),
            zh = LocalizedContent("细胞的能量工厂是什么？", listOf("线粒体", "细胞核", "核糖体", "高尔基体"), "科学", "线粒体是细胞器，负责通过细胞呼吸以ATP形式产生能量。"),
            es = LocalizedContent("¿Cuál es la central energética de la célula?", listOf("Mitocondria", "Núcleo", "Ribosoma", "Aparato de Golgi"), "Ciencia", "Las mitocondrias son los orgánulos celulares responsables de la producción de energía en forma de ATP mediante la respiración celular.")
        ),
        BilingualQuestion(
            id = 30206, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de planètes sont dans notre système solaire ?", listOf("8", "9", "10", "7"), "Science", "En 2006, l'Union astronomique internationale a reclassé Pluton en planète naine, ramenant officiellement le nombre de planètes majeures du système solaire à huit."),
            en = LocalizedContent("How many planets are in our solar system?", listOf("8", "9", "10", "7"), "Science", "In 2006, the International Astronomical Union reclassified Pluto as a dwarf planet, officially reducing the number of major planets in the solar system to eight."),
            zh = LocalizedContent("我们的太阳系中有多少颗行星？", listOf("8", "9", "10", "7"), "科学", "2006年，国际天文学联合会将冥王星重新归类为矮行星，正式将太阳系的主要行星数量减少到八颗。"),
            es = LocalizedContent("¿Cuántos planetas hay en nuestro sistema solar?", listOf("8", "9", "10", "7"), "Ciencia", "En 2006, la Unión Astronómica Internacional reclasificó a Plutón como planeta enano, reduciendo oficialmente el número de planetas mayores del sistema solar a ocho.")
        ),
        BilingualQuestion(
            id = 30207, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a développé la théorie de l'évolution par sélection naturelle ?", listOf("Charles Darwin", "Alfred Wallace", "Jean-Baptiste Lamarck", "Gregor Mendel"), "Science", "Charles Darwin a formulé cette théorie après ses observations lors du voyage du Beagle, notamment aux îles Galápagos. Son ouvrage \"L'Origine des espèces\" (1859) a révolutionné la biologie."),
            en = LocalizedContent("Who developed the theory of evolution by natural selection?", listOf("Charles Darwin", "Alfred Wallace", "Jean-Baptiste Lamarck", "Gregor Mendel"), "Science", "Charles Darwin formulated this theory after his observations during the voyage of the Beagle, especially in the Galápagos Islands. His work \"On the Origin of Species\" (1859) revolutionized biology."),
            zh = LocalizedContent("谁提出了自然选择进化论？", listOf("查尔斯·达尔文", "阿尔弗雷德·华莱士", "让-巴蒂斯特·拉马克", "格雷戈尔·孟德尔"), "科学", "查尔斯·达尔文在贝格尔号航行期间的观察后，特别是在加拉帕戈斯群岛，提出了这一理论。他的著作《物种起源》（1859年）彻底改变了生物学。"),
            es = LocalizedContent("¿Quién desarrolló la teoría de la evolución por selección natural?", listOf("Charles Darwin", "Alfred Wallace", "Jean-Baptiste Lamarck", "Gregor Mendel"), "Ciencia", "Charles Darwin formuló esta teoría tras sus observaciones durante el viaje del Beagle, especialmente en las islas Galápagos. Su obra \"El origen de las especies\" (1859) revolucionó la biología.")
        ),
        BilingualQuestion(
            id = 30208, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom complet de l'ADN ?", listOf("Acide désoxyribonucléique", "Acide déoxynucléique", "Acide désoxyribose", "Acide diribonucléique"), "Science", "L'ADN est l'abréviation d'acide désoxyribonucléique, une molécule qui contient l'information génétique de tous les êtres vivants."),
            en = LocalizedContent("What is the full name of DNA?", listOf("Deoxyribonucleic acid", "Deoxynucleic acid", "Deoxyribose acid", "Diribonucleic acid"), "Science", "DNA stands for deoxyribonucleic acid, a molecule that contains the genetic information of all living organisms."),
            zh = LocalizedContent("DNA的全称是什么？", listOf("脱氧核糖核酸", "脱氧核酸", "脱氧核糖", "二核糖核酸"), "科学", "DNA是脱氧核糖核酸的缩写，是一种包含所有生物遗传信息的分子。"),
            es = LocalizedContent("¿Cuál es el nombre completo del ADN?", listOf("Ácido desoxirribonucleico", "Ácido desoxinucleico", "Ácido desoxirribosa", "Ácido dirribonucleico"), "Ciencia", "ADN significa ácido desoxirribonucleico, una molécula que contiene la información genética de todos los seres vivos.")
        ),
        BilingualQuestion(
            id = 30209, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'éléments sont dans le tableau périodique ?", listOf("118", "100", "90", "150"), "Science", "Le tableau périodique standard contient 118 éléments confirmés, allant de l'hydrogène (1) à l'oganesson (118)."),
            en = LocalizedContent("How many elements are in the periodic table?", listOf("118", "100", "90", "150"), "Science", "The standard periodic table contains 118 confirmed elements, ranging from hydrogen (1) to oganesson (118)."),
            zh = LocalizedContent("元素周期表中有多少种元素？", listOf("118", "100", "90", "150"), "科学", "标准元素周期表包含118种已确认的元素，从氢（1）到奥气（118）。"),
            es = LocalizedContent("¿Cuántos elementos hay en la tabla periódica?", listOf("118", "100", "90", "150"), "Ciencia", "La tabla periódica estándar contiene 118 elementos confirmados, desde el hidrógeno (1) hasta el oganesón (118).")
        ),
        BilingualQuestion(
            id = 30211, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le processus par lequel les plantes convertissent la lumière solaire en énergie ?", listOf("Photosynthèse", "Respiration", "Fermentation", "Transpiration"), "Science", "La photosynthèse est le processus biologique par lequel les plantes, les algues et certaines bactéries utilisent la lumière du soleil pour transformer le dioxyde de carbone et l'eau en glucose et en oxygène."),
            en = LocalizedContent("What is the process by which plants convert sunlight into energy?", listOf("Photosynthesis", "Respiration", "Fermentation", "Transpiration"), "Science", "Photosynthesis is the biological process by which plants, algae, and some bacteria use sunlight to convert carbon dioxide and water into glucose and oxygen."),
            zh = LocalizedContent("植物将阳光转化为能量的过程是什么？", listOf("光合作用", "呼吸作用", "发酵", "蒸腾作用"), "科学", "光合作用是植物、藻类和某些细菌利用阳光将二氧化碳和水转化为葡萄糖和氧气的生物过程。"),
            es = LocalizedContent("¿Cuál es el proceso por el cual las plantas convierten la luz solar en energía?", listOf("Fotosíntesis", "Respiración", "Fermentación", "Transpiración"), "Ciencia", "La fotosíntesis es el proceso biológico mediante el cual las plantas, algas y algunas bacterias utilizan la luz solar para convertir dióxido de carbono y agua en glucosa y oxígeno.")
        ),
        BilingualQuestion(
            id = 30212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de l'étoile la plus proche de la Terre (en dehors du Soleil) ?", listOf("Proxima Centauri", "Alpha Centauri", "Sirius", "Bételgeuse"), "Science", "Proxima Centauri fait partie du système stellaire Alpha Centauri, situé à environ 4,2 années-lumière de la Terre, ce qui en fait l'étoile la plus proche après le Soleil."),
            en = LocalizedContent("What is the name of the closest star to Earth (other than the Sun)?", listOf("Proxima Centauri", "Alpha Centauri", "Sirius", "Betelgeuse"), "Science", "Proxima Centauri is part of the Alpha Centauri star system, located about 4.2 light-years from Earth, making it the closest star after the Sun."),
            zh = LocalizedContent("离地球最近的恒星（除太阳外）叫什么名字？", listOf("比邻星", "半人马座α星", "天狼星", "参宿四"), "科学", "比邻星是半人马座α星系统的一部分，距离地球约4.2光年，是除太阳外最近的恒星。"),
            es = LocalizedContent("¿Cuál es el nombre de la estrella más cercana a la Tierra (aparte del Sol)?", listOf("Próxima Centauri", "Alfa Centauri", "Sirio", "Betelgeuse"), "Ciencia", "Próxima Centauri forma parte del sistema estelar Alfa Centauri, situado a unos 4,2 años luz de la Tierra, lo que la convierte en la estrella más cercana después del Sol.")
        ),
        BilingualQuestion(
            id = 30213, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de globule blanc est responsable de combattre les infections ?", listOf("Globules blancs", "Globules rouges", "Plaquettes", "Lymphocytes"), "Science", "Les globules blancs, ou leucocytes, sont les cellules du système immunitaire qui détectent et détruisent les agents pathogènes comme les bactéries et virus."),
            en = LocalizedContent("Which type of white blood cell is responsible for fighting infections?", listOf("White blood cells", "Red blood cells", "Platelets", "Lymphocytes"), "Science", "White blood cells, or leukocytes, are the cells of the immune system that detect and destroy pathogens such as bacteria and viruses."),
            zh = LocalizedContent("哪种白细胞负责抵抗感染？", listOf("白细胞", "红细胞", "血小板", "淋巴细胞"), "科学", "白细胞，即白血球，是免疫系统的细胞，负责检测和消灭细菌、病毒等病原体。"),
            es = LocalizedContent("¿Qué tipo de glóbulo blanco es responsable de combatir las infecciones?", listOf("Glóbulos blancos", "Glóbulos rojos", "Plaquetas", "Linfocitos"), "Ciencia", "Los glóbulos blancos, o leucocitos, son las células del sistema inmunitario que detectan y destruyen patógenos como bacterias y virus.")
        ),
        BilingualQuestion(
            id = 30214, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point de congélation de l'eau en Celsius ?", listOf("0°C", "-4°C", "4°C", "-273°C"), "Science", "L'eau pure gèle à 0°C sous pression atmosphérique normale, car c'est la température à laquelle ses molécules forment une structure cristalline solide."),
            en = LocalizedContent("What is the freezing point of water in Celsius?", listOf("0°C", "-4°C", "4°C", "-273°C"), "Science", "Pure water freezes at 0°C under normal atmospheric pressure, as this is the temperature at which its molecules form a solid crystalline structure."),
            zh = LocalizedContent("水的冰点是多少摄氏度？", listOf("0°C", "-4°C", "4°C", "-273°C"), "科学", "在标准大气压下，纯水在0°C结冰，因为此时其分子形成固体晶体结构。"),
            es = LocalizedContent("¿Cuál es el punto de congelación del agua en Celsius?", listOf("0°C", "-4°C", "4°C", "-273°C"), "Ciencia", "El agua pura se congela a 0°C bajo presión atmosférica normal, ya que es la temperatura a la que sus moléculas forman una estructura cristalina sólida.")
        ),
        BilingualQuestion(
            id = 30215, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a formulé la théorie de la relativité ?", listOf("Albert Einstein", "Isaac Newton", "Max Planck", "Niels Bohr"), "Science", "Albert Einstein a publié la théorie de la relativité restreinte en 1905, puis la relativité générale en 1915, révolutionnant la compréhension de l'espace, du temps et de la gravitation."),
            en = LocalizedContent("Who formulated the theory of relativity?", listOf("Albert Einstein", "Isaac Newton", "Max Planck", "Niels Bohr"), "Science", "Albert Einstein published the special theory of relativity in 1905, followed by the general theory of relativity in 1915, revolutionizing the understanding of space, time, and gravitation."),
            zh = LocalizedContent("谁提出了相对论？", listOf("阿尔伯特·爱因斯坦", "艾萨克·牛顿", "马克斯·普朗克", "尼尔斯·玻尔"), "科学", "阿尔伯特·爱因斯坦于1905年发表了狭义相对论，随后于1915年发表了广义相对论，彻底改变了对空间、时间和引力的理解。"),
            es = LocalizedContent("¿Quién formuló la teoría de la relatividad?", listOf("Albert Einstein", "Isaac Newton", "Max Planck", "Niels Bohr"), "Ciencia", "Albert Einstein publicó la teoría de la relatividad especial en 1905, seguida de la relatividad general en 1915, revolucionando la comprensión del espacio, el tiempo y la gravitación.")
        ),
        BilingualQuestion(
            id = 30216, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la plus petite unité de matière qui conserve les propriétés chimiques ?", listOf("Atome", "Molécule", "Électron", "Noyau"), "Science", "L'atome est la plus petite unité d'un élément chimique qui conserve ses propriétés, car il est composé d'un noyau et d'électrons."),
            en = LocalizedContent("What is the name of the smallest unit of matter that retains chemical properties?", listOf("Atom", "Molecule", "Electron", "Nucleus"), "Science", "The atom is the smallest unit of a chemical element that retains its properties, as it consists of a nucleus and electrons."),
            zh = LocalizedContent("保持化学性质的最小物质单位是什么？", listOf("原子", "分子", "电子", "原子核"), "科学", "原子是保持元素化学性质的最小单位，因为它由原子核和电子组成。"),
            es = LocalizedContent("¿Cuál es el nombre de la unidad más pequeña de materia que conserva las propiedades químicas?", listOf("Átomo", "Molécula", "Electrón", "Núcleo"), "Ciencia", "El átomo es la unidad más pequeña de un elemento químico que conserva sus propiedades, ya que está compuesto por un núcleo y electrones.")
        ),
        BilingualQuestion(
            id = 30217, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le processus par lequel une étoile devient un trou noir ?", listOf("Effondrement gravitationnel", "Fusion nucléaire", "Explosion de supernova", "Refroidissement de naine blanche"), "Science", "L'effondrement gravitationnel se produit lorsque le noyau d'une étoile massive n'a plus assez d'énergie pour contrer sa propre gravité après l'épuisement de son combustible nucléaire, ce qui la comprime en un point de densité infinie."),
            en = LocalizedContent("What is the process by which a star becomes a black hole?", listOf("Gravitational collapse", "Nuclear fusion", "Supernova explosion", "White dwarf cooling"), "Science", "Gravitational collapse occurs when the core of a massive star no longer has enough energy to counter its own gravity after its nuclear fuel is exhausted, compressing it into a point of infinite density."),
            zh = LocalizedContent("恒星变成黑洞的过程是什么？", listOf("引力坍缩", "核聚变", "超新星爆发", "白矮星冷却"), "科学", "当大质量恒星的核心在核燃料耗尽后没有足够的能量来抵抗自身引力时，就会发生引力坍缩，将其压缩成一个密度无限的点。"),
            es = LocalizedContent("¿Cuál es el proceso por el cual una estrella se convierte en un agujero negro?", listOf("Colapso gravitacional", "Fusión nuclear", "Explosión de supernova", "Enfriamiento de enana blanca"), "Ciencia", "El colapso gravitacional ocurre cuando el núcleo de una estrella masiva ya no tiene suficiente energía para contrarrestar su propia gravedad después de agotar su combustible nuclear, comprimiéndolo en un punto de densidad infinita.")
        ),
        BilingualQuestion(
            id = 30218, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de chambres le cœur humain a-t-il ?", listOf("4", "3", "5", "6"), "Science", "Le cœur humain est divisé en quatre cavités : deux oreillettes et deux ventricules, qui assurent la circulation sanguine dans l'organisme."),
            en = LocalizedContent("How many chambers does the human heart have?", listOf("4", "3", "5", "6"), "Science", "The human heart is divided into four chambers: two atria and two ventricles, which ensure blood circulation throughout the body."),
            zh = LocalizedContent("人类心脏有多少个腔室？", listOf("4", "3", "5", "6"), "科学", "人类心脏分为四个腔室：两个心房和两个心室，它们确保血液在全身循环。"),
            es = LocalizedContent("¿Cuántas cavidades tiene el corazón humano?", listOf("4", "3", "5", "6"), "Ciencia", "El corazón humano está dividido en cuatro cavidades: dos aurículas y dos ventrículos, que aseguran la circulación sanguínea en el organismo.")
        ),
        BilingualQuestion(
            id = 30219, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la demi-vie du Carbone-14 ?", listOf("5 730 ans", "1 000 ans", "10 000 ans", "50 000 ans"), "Science", "Le Carbone-14 est un isotope radioactif du carbone dont la demi-vie, soit le temps nécessaire pour que la moitié des atomes se désintègre, est de 5 730 ans, ce qui permet la datation d'échantillons organiques anciens."),
            en = LocalizedContent("What is the half-life of Carbon-14?", listOf("5,730 years", "1,000 years", "10,000 years", "50,000 years"), "Science", "Carbon-14 is a radioactive isotope of carbon with a half-life of 5,730 years, meaning the time required for half of the atoms to decay, which allows dating of ancient organic samples."),
            zh = LocalizedContent("碳-14的半衰期是多少？", listOf("5730年", "1000年", "10000年", "50000年"), "科学", "碳-14是碳的一种放射性同位素，其半衰期为5730年，即一半原子衰变所需的时间，这使得古代有机样本的测年成为可能。"),
            es = LocalizedContent("¿Cuál es la vida media del Carbono-14?", listOf("5.730 años", "1.000 años", "10.000 años", "50.000 años"), "Ciencia", "El Carbono-14 es un isótopo radiactivo del carbono con una vida media de 5.730 años, es decir, el tiempo necesario para que la mitad de los átomos se desintegre, lo que permite la datación de muestras orgánicas antiguas.")
        ),
        BilingualQuestion(
            id = 30220, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le composant principal du Soleil ?", listOf("Hydrogène", "Hélium", "Oxygène", "Carbone"), "Science", "Le Soleil est une étoile composée à environ 73% d'hydrogène, qui fusionne en hélium dans son noyau pour produire de l'énergie."),
            en = LocalizedContent("What is the main component of the Sun?", listOf("Hydrogen", "Helium", "Oxygen", "Carbon"), "Science", "The Sun is a star composed of about 73% hydrogen, which fuses into helium in its core to produce energy."),
            zh = LocalizedContent("太阳的主要成分是什么？", listOf("氢", "氦", "氧", "碳"), "科学", "太阳是一颗恒星，大约73%由氢组成，氢在其核心聚变成氦以产生能量。"),
            es = LocalizedContent("¿Cuál es el componente principal del Sol?", listOf("Hidrógeno", "Helio", "Oxígeno", "Carbono"), "Ciencia", "El Sol es una estrella compuesta aproximadamente en un 73% de hidrógeno, que se fusiona en helio en su núcleo para producir energía.")
        ),
        BilingualQuestion(
            id = 30221, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("À quoi la constante de Planck est-elle utilisée pour mesurer ?", listOf("Quantum d'action", "Vitesse de la lumière", "Constante gravitationnelle", "Charge électrique"), "Science", "La constante de Planck, notée h, relie l'énergie d'un photon à sa fréquence et définit le quantum d'action, une unité fondamentale en mécanique quantique."),
            en = LocalizedContent("What is Planck's constant used to measure?", listOf("Quantum of action", "Speed of light", "Gravitational constant", "Electric charge"), "Science", "Planck's constant, denoted h, relates the energy of a photon to its frequency and defines the quantum of action, a fundamental unit in quantum mechanics."),
            zh = LocalizedContent("普朗克常数用于测量什么？", listOf("作用量子", "光速", "引力常数", "电荷"), "科学", "普朗克常数（h）将光子的能量与其频率联系起来，并定义了作用量子，这是量子力学中的一个基本单位。"),
            es = LocalizedContent("¿Para qué se utiliza la constante de Planck?", listOf("Cuanto de acción", "Velocidad de la luz", "Constante gravitacional", "Carga eléctrica"), "Ciencia", "La constante de Planck, denotada h, relaciona la energía de un fotón con su frecuencia y define el cuanto de acción, una unidad fundamental en mecánica cuántica.")
        ),
        BilingualQuestion(
            id = 30222, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nom de la première exoplanète découverte autour d'une étoile semblable au Soleil ?", listOf("51 Pegasi b", "Kepler-452b", "TRAPPIST-1e", "HD 209458 b"), "Science", "Découverte en 1995 par Michel Mayor et Didier Queloz, 51 Pegasi b orbite autour de l'étoile 51 Pegasi, une naine jaune similaire au Soleil. Cette détection a révolutionné l'astronomie en prouvant l'existence de planètes hors du système solaire."),
            en = LocalizedContent("What is the name of the first exoplanet discovered around a Sun-like star?", listOf("51 Pegasi b", "Kepler-452b", "TRAPPIST-1e", "HD 209458 b"), "Science", "Discovered in 1995 by Michel Mayor and Didier Queloz, 51 Pegasi b orbits the star 51 Pegasi, a yellow dwarf similar to the Sun. This detection revolutionized astronomy by proving the existence of planets outside the solar system."),
            zh = LocalizedContent("第一颗在类太阳恒星周围发现的系外行星叫什么名字？", listOf("飞马座51b", "开普勒-452b", "TRAPPIST-1e", "HD 209458 b"), "科学", "1995年由米歇尔·迈耶和迪迪埃·奎洛兹发现，飞马座51b围绕飞马座51恒星运行，这是一颗类似于太阳的黄矮星。这一发现证明了太阳系外行星的存在，彻底改变了天文学。"),
            es = LocalizedContent("¿Cuál es el nombre del primer exoplaneta descubierto alrededor de una estrella similar al Sol?", listOf("51 Pegasi b", "Kepler-452b", "TRAPPIST-1e", "HD 209458 b"), "Ciencia", "Descubierto en 1995 por Michel Mayor y Didier Queloz, 51 Pegasi b orbita la estrella 51 Pegasi, una enana amarilla similar al Sol. Esta detección revolucionó la astronomía al probar la existencia de planetas fuera del sistema solar.")
        ),
        BilingualQuestion(
            id = 30223, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("De quoi le boson de Higgs est-il responsable ?", listOf("Donner la masse aux particules", "Force électromagnétique", "Force nucléaire forte", "Gravité"), "Science", "Le boson de Higgs interagit avec certaines particules élémentaires via le champ de Higgs, et cette interaction leur confère une masse. Sans ce mécanisme, les particules comme les électrons ou les quarks n'auraient pas de masse."),
            en = LocalizedContent("What is the Higgs boson responsible for?", listOf("Giving mass to particles", "Electromagnetic force", "Strong nuclear force", "Gravity"), "Science", "The Higgs boson interacts with certain elementary particles via the Higgs field, and this interaction gives them mass. Without this mechanism, particles like electrons or quarks would have no mass."),
            zh = LocalizedContent("希格斯玻色子负责什么？", listOf("赋予粒子质量", "电磁力", "强核力", "引力"), "科学", "希格斯玻色子通过希格斯场与某些基本粒子相互作用，这种相互作用赋予它们质量。如果没有这种机制，电子或夸克等粒子将没有质量。"),
            es = LocalizedContent("¿De qué es responsable el bosón de Higgs?", listOf("Dar masa a las partículas", "Fuerza electromagnética", "Fuerza nuclear fuerte", "Gravedad"), "Ciencia", "El bosón de Higgs interactúa con ciertas partículas elementales a través del campo de Higgs, y esta interacción les confiere masa. Sin este mecanismo, partículas como los electrones o los quarks no tendrían masa.")
        ),
        BilingualQuestion(
            id = 30224, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nom de la protéine qui transporte l'oxygène dans les globules rouges ?", listOf("Hémoglobine", "Myoglobine", "Albumine", "Globuline"), "Science", "L'hémoglobine est une protéine complexe contenant du fer, située dans les globules rouges, qui fixe l'oxygène dans les poumons pour le distribuer aux tissus du corps."),
            en = LocalizedContent("What is the name of the protein that carries oxygen in red blood cells?", listOf("Hemoglobin", "Myoglobin", "Albumin", "Globulin"), "Science", "Hemoglobin is a complex protein containing iron, located in red blood cells, that binds oxygen in the lungs and distributes it to the body's tissues."),
            zh = LocalizedContent("在红细胞中携带氧气的蛋白质叫什么？", listOf("血红蛋白", "肌红蛋白", "白蛋白", "球蛋白"), "科学", "血红蛋白是一种含铁的复杂蛋白质，位于红细胞中，在肺部结合氧气并将其输送到身体组织。"),
            es = LocalizedContent("¿Cuál es el nombre de la proteína que transporta oxígeno en los glóbulos rojos?", listOf("Hemoglobina", "Mioglobina", "Albúmina", "Globulina"), "Ciencia", "La hemoglobina es una proteína compleja que contiene hierro, situada en los glóbulos rojos, que fija el oxígeno en los pulmones para distribuirlo a los tejidos del cuerpo.")
        ),
        BilingualQuestion(
            id = 30225, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien d'acides aminés sont essentiels à la synthèse des protéines humaines ?", listOf("20", "9", "15", "25"), "Science", "Les protéines humaines sont synthétisées à partir de 20 acides aminés différents, dont 9 sont dits essentiels car le corps ne peut pas les produire lui-même."),
            en = LocalizedContent("How many amino acids are essential for human protein synthesis?", listOf("20", "9", "15", "25"), "Science", "Human proteins are synthesized from 20 different amino acids, of which 9 are called essential because the body cannot produce them on its own."),
            zh = LocalizedContent("人类蛋白质合成需要多少种必需氨基酸？", listOf("20", "9", "15", "25"), "科学", "人类蛋白质由20种不同的氨基酸合成，其中9种被称为必需氨基酸，因为人体无法自行合成。"),
            es = LocalizedContent("¿Cuántos aminoácidos son esenciales para la síntesis de proteínas humanas?", listOf("20", "9", "15", "25"), "Ciencia", "Las proteínas humanas se sintetizan a partir de 20 aminoácidos diferentes, de los cuales 9 se denominan esenciales porque el cuerpo no puede producirlos por sí mismo.")
        ),
        BilingualQuestion(
            id = 30226, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le roi des dieux grecs ?", listOf("Zeus", "Hadès", "Poséidon", "Apollon"), "Mythologie", "Dans la mythologie grecque, Zeus est le dieu du ciel et de la foudre, souverain de l'Olympe après avoir renversé son père Cronos."),
            en = LocalizedContent("Who is the king of the Greek gods?", listOf("Zeus", "Hades", "Poseidon", "Apollo"), "Mythology", "In Greek mythology, Zeus is the god of the sky and thunder, ruler of Olympus after overthrowing his father Cronus."),
            zh = LocalizedContent("谁是希腊众神之王？", listOf("宙斯", "哈迪斯", "波塞冬", "阿波罗"), "神话", "在希腊神话中，宙斯是天空和雷电之神，在推翻父亲克洛诺斯后成为奥林匹斯山的统治者。"),
            es = LocalizedContent("¿Quién es el rey de los dioses griegos?", listOf("Zeus", "Hades", "Poseidón", "Apolo"), "Mitología", "En la mitología griega, Zeus es el dios del cielo y el trueno, soberano del Olimpo después de derrocar a su padre Cronos.")
        ),
        BilingualQuestion(
            id = 30227, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle équivalent d'Odin dans la mythologie nordique ?", listOf("Roi des dieux", "Dieu de la guerre", "Dieu du tonnerre", "Dieu de la mer"), "Mythologie", "Odin est le dieu principal et le souverain des Ases dans la mythologie nordique, comparable à Zeus dans la mythologie grecque."),
            en = LocalizedContent("What is the equivalent role of Odin in Norse mythology?", listOf("King of the gods", "God of war", "God of thunder", "God of the sea"), "Mythology", "Odin is the chief god and ruler of the Aesir in Norse mythology, comparable to Zeus in Greek mythology."),
            zh = LocalizedContent("奥丁在北欧神话中的对应角色是什么？", listOf("众神之王", "战争之神", "雷神", "海神"), "神话", "奥丁是北欧神话中阿萨神族的主神和统治者，相当于希腊神话中的宙斯。"),
            es = LocalizedContent("¿Cuál es el papel equivalente de Odín en la mitología nórdica?", listOf("Rey de los dioses", "Dios de la guerra", "Dios del trueno", "Dios del mar"), "Mitología", "Odín es el dios principal y soberano de los Aesir en la mitología nórdica, comparable a Zeus en la mitología griega.")
        ),
        BilingualQuestion(
            id = 30228, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le dieu égyptien du soleil ?", listOf("Ra", "Osiris", "Thot", "Anubis"), "Mythologie", "Ra est le dieu solaire principal de la mythologie égyptienne antique, souvent représenté avec une tête de faucon surmontée d'un disque solaire."),
            en = LocalizedContent("Who is the Egyptian god of the sun?", listOf("Ra", "Osiris", "Thoth", "Anubis"), "Mythology", "Ra is the primary sun god of ancient Egyptian mythology, often depicted with a falcon head surmounted by a solar disk."),
            zh = LocalizedContent("埃及的太阳神是谁？", listOf("拉", "奥西里斯", "托特", "阿努比斯"), "神话", "拉是古埃及神话中的主太阳神，常被描绘为隼头并头顶太阳圆盘。"),
            es = LocalizedContent("¿Quién es el dios egipcio del sol?", listOf("Ra", "Osiris", "Thot", "Anubis"), "Mitología", "Ra es el dios solar principal de la mitología egipcia antigua, a menudo representado con cabeza de halcón coronada por un disco solar.")
        ),
        BilingualQuestion(
            id = 30229, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est l'arme de Thor dans la mythologie nordique ?", listOf("Mjölnir", "Gungnir", "Skadhka", "Gleipnir"), "Mythologie", "Mjölnir est le marteau forgé par les nains Brokk et Sindri, capable de provoquer la foudre et de revenir dans la main de Thor après avoir été lancé."),
            en = LocalizedContent("What is Thor's weapon in Norse mythology?", listOf("Mjölnir", "Gungnir", "Skadhka", "Gleipnir"), "Mythology", "Mjölnir is the hammer forged by the dwarves Brokk and Sindri, capable of causing lightning and returning to Thor's hand after being thrown."),
            zh = LocalizedContent("托尔在北欧神话中的武器是什么？", listOf("妙尔尼尔", "冈格尼尔", "斯卡德卡", "格莱普尼尔"), "神话", "妙尔尼尔是由矮人布洛克和辛德里锻造的锤子，能够引发闪电，并在投掷后返回托尔手中。"),
            es = LocalizedContent("¿Cuál es el arma de Thor en la mitología nórdica?", listOf("Mjölnir", "Gungnir", "Skadhka", "Gleipnir"), "Mitología", "Mjölnir es el martillo forjado por los enanos Brokk y Sindri, capaz de provocar rayos y regresar a la mano de Thor después de ser lanzado.")
        ),
        BilingualQuestion(
            id = 30230, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans la mythologie hindoue, qui est le dieu de la destruction ?", listOf("Shiva", "Brahma", "Vishnu", "Indra"), "Mythologie", "Shiva est l'une des divinités principales de l'hindouisme, formant la Trimurti avec Brahma (créateur) et Vishnu (protecteur). Son rôle de destructeur permet la renaissance et le renouvellement de l'univers."),
            en = LocalizedContent("In Hindu mythology, who is the god of destruction?", listOf("Shiva", "Brahma", "Vishnu", "Indra"), "Mythology", "Shiva is one of the principal deities of Hinduism, forming the Trimurti with Brahma (creator) and Vishnu (preserver). His role as destroyer enables rebirth and renewal of the universe."),
            zh = LocalizedContent("在印度神话中，谁是毁灭之神？", listOf("湿婆", "梵天", "毗湿奴", "因陀罗"), "神话", "湿婆是印度教的主要神祇之一，与梵天（创造者）和毗湿奴（保护者）组成三相神。他的毁灭者角色使宇宙得以重生和更新。"),
            es = LocalizedContent("En la mitología hindú, ¿quién es el dios de la destrucción?", listOf("Shiva", "Brahma", "Vishnu", "Indra"), "Mitología", "Shiva es una de las principales deidades del hinduismo, formando la Trimurti con Brahma (creador) y Vishnu (preservador). Su papel de destructor permite el renacimiento y la renovación del universo.")
        ),
        BilingualQuestion(
            id = 30231, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom des enfers égyptiens ?", listOf("Duat", "Aaru", "Tuat", "Sekhet"), "Mythologie", "Dans la mythologie égyptienne, le Duat est le royaume des morts, un monde souterrain traversé par le dieu solaire Rê chaque nuit et où l'âme du défunt est jugée par Osiris."),
            en = LocalizedContent("What is the name of the Egyptian underworld?", listOf("Duat", "Aaru", "Tuat", "Sekhet"), "Mythology", "In Egyptian mythology, the Duat is the realm of the dead, an underworld traversed by the sun god Ra each night and where the soul of the deceased is judged by Osiris."),
            zh = LocalizedContent("埃及冥界的名称是什么？", listOf("杜阿特", "阿鲁", "图阿特", "塞赫特"), "神话", "在埃及神话中，杜阿特是死者之域，一个太阳神拉每晚穿行的地下世界，死者的灵魂在此接受奥西里斯的审判。"),
            es = LocalizedContent("¿Cuál es el nombre del inframundo egipcio?", listOf("Duat", "Aaru", "Tuat", "Sekhet"), "Mitología", "En la mitología egipcia, el Duat es el reino de los muertos, un inframundo que el dios solar Ra atraviesa cada noche y donde el alma del difunto es juzgada por Osiris.")
        ),
        BilingualQuestion(
            id = 30232, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé le monde selon la mythologie aztèque ?", listOf("Quetzalcoatl", "Tezcatlipoca", "Huitzilopochtli", "Ometeotl"), "Mythologie", "Dans la mythologie aztèque, Quetzalcoatl, le serpent à plumes, est l'un des dieux créateurs qui participa à la création du monde actuel, notamment en façonnant l'humanité à partir d'os."),
            en = LocalizedContent("Who created the world according to Aztec mythology?", listOf("Quetzalcoatl", "Tezcatlipoca", "Huitzilopochtli", "Ometeotl"), "Mythology", "In Aztec mythology, Quetzalcoatl, the feathered serpent, is one of the creator gods who participated in the creation of the current world, notably by shaping humanity from bones."),
            zh = LocalizedContent("根据阿兹特克神话，谁创造了世界？", listOf("羽蛇神", "特斯卡特利波卡", "惠齐洛波奇特利", "奥梅特奥特尔"), "神话", "在阿兹特克神话中，羽蛇神是参与创造当前世界的创世神之一，尤其以用骨头塑造人类而闻名。"),
            es = LocalizedContent("¿Quién creó el mundo según la mitología azteca?", listOf("Quetzalcóatl", "Tezcatlipoca", "Huitzilopochtli", "Ometeotl"), "Mitología", "En la mitología azteca, Quetzalcóatl, la serpiente emplumada, es uno de los dioses creadores que participó en la creación del mundo actual, especialmente moldeando la humanidad a partir de huesos.")
        ),
        BilingualQuestion(
            id = 30233, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de l'épouse de Poséidon dans la mythologie grecque ?", listOf("Amphitrite", "Héra", "Thétis", "Néréide"), "Mythologie", "Amphitrite est une Néréide, déesse de la mer, et l'épouse légitime de Poséidon dans la mythologie grecque."),
            en = LocalizedContent("What is the name of Poseidon's wife in Greek mythology?", listOf("Amphitrite", "Hera", "Thetis", "Nereid"), "Mythology", "Amphitrite is a Nereid, goddess of the sea, and the lawful wife of Poseidon in Greek mythology."),
            zh = LocalizedContent("在希腊神话中，波塞冬的妻子叫什么？", listOf("安菲特里忒", "赫拉", "忒提斯", "涅瑞伊得"), "神话", "安菲特里忒是一位涅瑞伊得（海仙女），海神，是希腊神话中波塞冬的合法妻子。"),
            es = LocalizedContent("¿Cuál es el nombre de la esposa de Poseidón en la mitología griega?", listOf("Anfitrite", "Hera", "Tetis", "Nereida"), "Mitología", "Anfitrite es una Nereida, diosa del mar, y la esposa legítima de Poseidón en la mitología griega.")
        ),
        BilingualQuestion(
            id = 30234, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans la mythologie celtique, qui est le dieu du soleil et de la poésie ?", listOf("Lugh", "Dagda", "Nuada", "Morrigan"), "Mythologie", "Lugh est une divinité majeure du panthéon celtique, souvent associée à la lumière, aux arts et aux compétences multiples, dont la poésie."),
            en = LocalizedContent("In Celtic mythology, who is the god of the sun and poetry?", listOf("Lugh", "Dagda", "Nuada", "Morrigan"), "Mythology", "Lugh is a major deity of the Celtic pantheon, often associated with light, arts, and multiple skills, including poetry."),
            zh = LocalizedContent("在凯尔特神话中，谁是太阳与诗歌之神？", listOf("卢格", "达格达", "努阿达", "莫瑞甘"), "神话", "卢格是凯尔特神话中的重要神祇，常与光明、艺术和多种技能（包括诗歌）相关联。"),
            es = LocalizedContent("En la mitología celta, ¿quién es el dios del sol y la poesía?", listOf("Lugh", "Dagda", "Nuada", "Morrigan"), "Mitología", "Lugh es una deidad importante del panteón celta, a menudo asociada con la luz, las artes y múltiples habilidades, incluida la poesía.")
        ),
        BilingualQuestion(
            id = 30235, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la déesse du soleil japonaise ?", listOf("Amaterasu", "Susanoo", "Izanami", "Tsukuyomi"), "Mythologie", "Amaterasu est la déesse du soleil dans le shintoïsme, religion traditionnelle du Japon. Elle est considérée comme l'ancêtre de la famille impériale japonaise."),
            en = LocalizedContent("What is the name of the Japanese sun goddess?", listOf("Amaterasu", "Susanoo", "Izanami", "Tsukuyomi"), "Mythology", "Amaterasu is the sun goddess in Shinto, the traditional religion of Japan. She is considered the ancestor of the Japanese imperial family."),
            zh = LocalizedContent("日本太阳女神的名字是什么？", listOf("天照大神", "须佐之男命", "伊邪那美", "月读命"), "神话", "天照大神是日本传统宗教神道教中的太阳女神，被视为日本皇室祖先。"),
            es = LocalizedContent("¿Cuál es el nombre de la diosa del sol japonesa?", listOf("Amaterasu", "Susanoo", "Izanami", "Tsukuyomi"), "Mitología", "Amaterasu es la diosa del sol en el sintoísmo, la religión tradicional de Japón. Se la considera la antepasada de la familia imperial japonesa.")
        ),
        BilingualQuestion(
            id = 30236, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans la mythologie africaine, qu'est-ce qu'Amma ?", listOf("Divinité créatrice dans la tradition Dogon", "Dieu des tricheurs", "Déesse de la guerre", "Esprit de l'eau"), "Mythologie", "Amma est le dieu créateur dans la cosmogonie du peuple Dogon, au Mali, qui aurait façonné l'univers et les humains."),
            en = LocalizedContent("In African mythology, what is Amma?", listOf("Creator deity in the Dogon tradition", "God of tricksters", "Goddess of war", "Water spirit"), "Mythology", "Amma is the creator god in the cosmology of the Dogon people of Mali, who is said to have shaped the universe and humans."),
            zh = LocalizedContent("在非洲神话中，阿玛是什么？", listOf("多贡传统中的创世神", "恶作剧之神", "战争女神", "水灵"), "神话", "阿玛是马里多贡人宇宙观中的创世神，据说塑造了宇宙和人类。"),
            es = LocalizedContent("En la mitología africana, ¿qué es Amma?", listOf("Deidad creadora en la tradición dogón", "Dios de los tramposos", "Diosa de la guerra", "Espíritu del agua"), "Mitología", "Amma es el dios creador en la cosmogonía del pueblo dogón de Malí, que habría dado forma al universo y a los humanos.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 30237, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle de l'Empereur de Jade chinois ?", listOf("Souverain du ciel et de la terre", "Dieu de la guerre", "Dieu de la richesse", "Gardien des âmes"), "Mythologie", "Dans la mythologie chinoise, l'Empereur de Jade est la divinité suprême qui gouverne le ciel, la terre et tous les dieux, comparable à un empereur céleste."),
            en = LocalizedContent("What is the role of the Chinese Jade Emperor?", listOf("Sovereign of heaven and earth", "God of war", "God of wealth", "Guardian of souls"), "Mythology", "In Chinese mythology, the Jade Emperor is the supreme deity who governs heaven, earth, and all gods, comparable to a celestial emperor."),
            zh = LocalizedContent("中国玉皇大帝的角色是什么？", listOf("天地的主宰", "战神", "财神", "灵魂的守护者"), "神话", "在中国神话中，玉皇大帝是至高无上的神，统治天、地和所有神灵，类似于天上的皇帝。"),
            es = LocalizedContent("¿Cuál es el papel del Emperador de Jade chino?", listOf("Soberano del cielo y la tierra", "Dios de la guerra", "Dios de la riqueza", "Guardián de las almas"), "Mitología", "En la mitología china, el Emperador de Jade es la deidad suprema que gobierna el cielo, la tierra y todos los dioses, comparable a un emperador celestial.")
        ),
        BilingualQuestion(
            id = 30238, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans la mythologie mésopotamienne, qui est le roi des dieux ?", listOf("Marduk", "Enlil", "Enki", "Anu"), "Mythologie", "Marduk est le dieu principal de la mythologie mésopotamienne, notamment à Babylone, où il devient roi des dieux après avoir vaincu le chaos primordial représenté par Tiamat."),
            en = LocalizedContent("In Mesopotamian mythology, who is the king of the gods?", listOf("Marduk", "Enlil", "Enki", "Anu"), "Mythology", "Marduk is the chief god of Mesopotamian mythology, especially in Babylon, where he becomes king of the gods after defeating the primordial chaos represented by Tiamat."),
            zh = LocalizedContent("在美索不达米亚神话中，谁是众神之王？", listOf("马尔杜克", "恩利尔", "恩基", "安努"), "神话", "马尔杜克是美索不达米亚神话中的主神，尤其在巴比伦，他在击败代表原始混沌的提亚马特后成为众神之王。"),
            es = LocalizedContent("En la mitología mesopotámica, ¿quién es el rey de los dioses?", listOf("Marduk", "Enlil", "Enki", "Anu"), "Mitología", "Marduk es el dios principal de la mitología mesopotámica, especialmente en Babilonia, donde se convierte en rey de los dioses tras derrotar al caos primordial representado por Tiamat.")
        ),
        BilingualQuestion(
            id = 30239, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du héros grec qui a tué le Minotaure ?", listOf("Thésée", "Héraclès", "Jason", "Persée"), "Mythologie", "Thésée a tué le Minotaure dans le labyrinthe de Crète, aidé par le fil d'Ariane pour en ressortir."),
            en = LocalizedContent("What is the name of the Greek hero who killed the Minotaur?", listOf("Theseus", "Heracles", "Jason", "Perseus"), "Mythology", "Theseus killed the Minotaur in the Labyrinth of Crete, aided by Ariadne's thread to find his way out."),
            zh = LocalizedContent("杀死米诺陶洛斯的希腊英雄叫什么名字？", listOf("忒修斯", "赫拉克勒斯", "伊阿宋", "珀尔修斯"), "神话", "忒修斯在克里特岛的迷宫中杀死了米诺陶洛斯，借助阿里阿德涅的线团得以走出迷宫。"),
            es = LocalizedContent("¿Cuál es el nombre del héroe griego que mató al Minotauro?", listOf("Teseo", "Heracles", "Jasón", "Perseo"), "Mitología", "Teseo mató al Minotauro en el laberinto de Creta, ayudado por el hilo de Ariadna para salir.")
        ),
        BilingualQuestion(
            id = 30240, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans la mythologie hindoue, de quoi parle le Ramayana ?", listOf("La quête de Rama", "La danse de Shiva", "La naissance de Krishna", "La guerre des dieux"), "Mythologie", "Le Ramayana relate l'histoire du prince Rama, avatar de Vishnou, qui part à la recherche de son épouse Sita, enlevée par le démon Ravana."),
            en = LocalizedContent("In Hindu mythology, what is the Ramayana about?", listOf("The quest of Rama", "The dance of Shiva", "The birth of Krishna", "The war of the gods"), "Mythology", "The Ramayana recounts the story of Prince Rama, an avatar of Vishnu, who sets out to rescue his wife Sita, abducted by the demon Ravana."),
            zh = LocalizedContent("在印度神话中，《罗摩衍那》讲述了什么？", listOf("罗摩的征程", "湿婆之舞", "克里希纳的诞生", "众神之战"), "神话", "《罗摩衍那》讲述了毗湿奴的化身罗摩王子寻找被恶魔罗波那绑架的妻子悉达的故事。"),
            es = LocalizedContent("En la mitología hindú, ¿de qué trata el Ramayana?", listOf("La búsqueda de Rama", "La danza de Shiva", "El nacimiento de Krishna", "La guerra de los dioses"), "Mitología", "El Ramayana narra la historia del príncipe Rama, avatar de Vishnú, que parte en busca de su esposa Sita, secuestrada por el demonio Ravana.")
        ),
        BilingualQuestion(
            id = 30241, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que Yggdrasil dans la mythologie nordique ?", listOf("L'arbre du monde", "Le pont vers les dieux", "Le serpent du chaos", "Le palais des dieux"), "Mythologie", "Yggdrasil est l'arbre cosmique qui relie les neuf mondes de la mythologie nordique, ses racines et branches soutenant l'univers."),
            en = LocalizedContent("What is Yggdrasil in Norse mythology?", listOf("The world tree", "The bridge to the gods", "The serpent of chaos", "The palace of the gods"), "Mythology", "Yggdrasil is the cosmic tree that connects the nine worlds of Norse mythology, its roots and branches supporting the universe."),
            zh = LocalizedContent("在挪威神话中，尤克特拉希尔是什么？", listOf("世界之树", "通往众神的桥梁", "混沌之蛇", "众神的宫殿"), "神话", "尤克特拉希尔是连接挪威神话中九个世界的宇宙树，其根和枝支撑着宇宙。"),
            es = LocalizedContent("¿Qué es Yggdrasil en la mitología nórdica?", listOf("El árbol del mundo", "El puente hacia los dioses", "La serpiente del caos", "El palacio de los dioses"), "Mitología", "Yggdrasil es el árbol cósmico que conecta los nueve mundos de la mitología nórdica, sus raíces y ramas sostienen el universo.")
        ),
        BilingualQuestion(
            id = 30242, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans la mythologie égyptienne, que arrive-t-il à une âme après la mort ?", listOf("Pesée du cœur dans le Duat", "Réincarnation", "Ascension au ciel", "Sommeil éternel"), "Mythologie", "Dans la mythologie égyptienne, l'âme du défunt est jugée dans le Duat lors de la pesée du cœur contre la plume de Maât, déterminant son accès à l'au-delà."),
            en = LocalizedContent("In Egyptian mythology, what happens to a soul after death?", listOf("Weighing of the heart in the Duat", "Reincarnation", "Ascension to heaven", "Eternal sleep"), "Mythology", "In Egyptian mythology, the soul of the deceased is judged in the Duat during the weighing of the heart against the feather of Maat, determining access to the afterlife."),
            zh = LocalizedContent("在埃及神话中，灵魂死后会发生什么？", listOf("在杜阿特称量心脏", "转世", "升天", "永恒沉睡"), "神话", "在埃及神话中，死者的灵魂在杜阿特接受审判，心脏与玛亚特羽毛称量，决定其能否进入来世。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué le sucede a un alma después de la muerte?", listOf("Pesaje del corazón en el Duat", "Reencarnación", "Ascensión al cielo", "Sueño eterno"), "Mitología", "En la mitología egipcia, el alma del difunto es juzgada en el Duat durante el pesaje del corazón contra la pluma de Maat, determinando su acceso al más allá.")
        ),
        BilingualQuestion(
            id = 30243, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le dieu tricheur dans la mythologie nordique ?", listOf("Loki", "Odin", "Thor", "Heimdall"), "Mythologie", "Loki est une divinité ambiguë de la mythologie nordique, souvent représentée comme un farceur et un manipulateur, capable de changer de forme pour tromper les autres dieux."),
            en = LocalizedContent("Who is the trickster god in Norse mythology?", listOf("Loki", "Odin", "Thor", "Heimdall"), "Mythology", "Loki is an ambiguous deity in Norse mythology, often depicted as a trickster and manipulator, capable of shape-shifting to deceive other gods."),
            zh = LocalizedContent("在挪威神话中，谁是恶作剧之神？", listOf("洛基", "奥丁", "索尔", "海姆达尔"), "神话", "洛基是挪威神话中一位模棱两可的神，常被描绘为恶作剧者和操纵者，能够变形欺骗其他神。"),
            es = LocalizedContent("¿Quién es el dios tramposo en la mitología nórdica?", listOf("Loki", "Odín", "Thor", "Heimdall"), "Mitología", "Loki es una deidad ambigua en la mitología nórdica, a menudo representada como un embaucador y manipulador, capaz de cambiar de forma para engañar a otros dioses.")
        ),
        BilingualQuestion(
            id = 30244, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans la mythologie aztèque, qu'est-ce que le Cinquième Soleil ?", listOf("L'âge du monde actuel", "Cataclysme futur", "Création passée", "Monde souterrain"), "Mythologie", "Selon la mythologie aztèque, le monde a connu quatre soleils (âges) précédents, chacun détruit par une catastrophe. Le Cinquième Soleil désigne l'ère actuelle, celle des humains, créée par le sacrifice des dieux à Teotihuacan."),
            en = LocalizedContent("In Aztec mythology, what is the Fifth Sun?", listOf("The current age of the world", "Future cataclysm", "Past creation", "Underworld"), "Mythology", "According to Aztec mythology, the world has experienced four previous suns (ages), each destroyed by a catastrophe. The Fifth Sun refers to the current era, that of humans, created by the sacrifice of the gods at Teotihuacan."),
            zh = LocalizedContent("在阿兹特克神话中，第五太阳是什么？", listOf("当前的世界时代", "未来的大灾难", "过去的创造", "地下世界"), "神话", "根据阿兹特克神话，世界经历了四个之前的太阳（时代），每个都被灾难摧毁。第五太阳指的是当前人类时代，由众神在特奥蒂瓦坎的牺牲创造。"),
            es = LocalizedContent("En la mitología azteca, ¿qué es el Quinto Sol?", listOf("La era actual del mundo", "Cataclismo futuro", "Creación pasada", "Inframundo"), "Mitología", "Según la mitología azteca, el mundo ha experimentado cuatro soles (edades) anteriores, cada uno destruido por una catástrofe. El Quinto Sol se refiere a la era actual, la de los humanos, creada por el sacrificio de los dioses en Teotihuacán.")
        ),
        BilingualQuestion(
            id = 30245, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom des enfers chinois ?", listOf("Diyu", "Yomi", "Hadès", "Monde souterrain"), "Mythologie", "Diyu désigne l'enfer bouddhiste et taoïste chinois, un monde souterrain où les âmes sont jugées et purifiées avant leur réincarnation."),
            en = LocalizedContent("What is the name of the Chinese underworld?", listOf("Diyu", "Yomi", "Hades", "Underworld"), "Mythology", "Diyu refers to the Buddhist and Taoist Chinese hell, an underworld where souls are judged and purified before reincarnation."),
            zh = LocalizedContent("中国地狱的名称是什么？", listOf("地獄", "黄泉", "哈迪斯", "地下世界"), "神话", "地獄指的是佛教和道教中的中国地狱，一个灵魂在转世前接受审判和净化的地下世界。"),
            es = LocalizedContent("¿Cuál es el nombre del inframundo chino?", listOf("Diyu", "Yomi", "Hades", "Inframundo"), "Mitología", "Diyu se refiere al infierno budista y taoísta chino, un inframundo donde las almas son juzgadas y purificadas antes de la reencarnación.")
        ),
        BilingualQuestion(
            id = 30246, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Dans la mythologie hindoue, que sont les Vedas ?", listOf("Textes sacrés anciens", "Demi-dieux", "Êtres célestes", "Incantations"), "Mythologie", "Les Vedas sont les plus anciens textes sacrés de l'hindouisme, comprenant des hymnes, des rituels et des enseignements philosophiques."),
            en = LocalizedContent("In Hindu mythology, what are the Vedas?", listOf("Ancient sacred texts", "Demi-gods", "Celestial beings", "Incantations"), "Mythology", "The Vedas are the oldest sacred texts of Hinduism, comprising hymns, rituals, and philosophical teachings."),
            zh = LocalizedContent("在印度神话中，吠陀是什么？", listOf("古老的圣典", "半神", "天神", "咒语"), "神话", "吠陀是印度教最古老的圣典，包含赞美诗、仪式和哲学教义。"),
            es = LocalizedContent("En la mitología hindú, ¿qué son los Vedas?", listOf("Textos sagrados antiguos", "Semidioses", "Seres celestiales", "Encantamientos"), "Mitología", "Los Vedas son los textos sagrados más antiguos del hinduismo, que incluyen himnos, rituales y enseñanzas filosóficas.")
        ),
        BilingualQuestion(
            id = 30247, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la Chimère dans la mythologie grecque ?", listOf("Un monstre hybride avec lion, chèvre et serpent", "Une créature marine", "Un cheval ailé", "Un géant de feu"), "Mythologie", "La Chimère était un monstre cracheur de feu, décrit comme ayant une tête de lion, un corps de chèvre et une queue de serpent, vaincue par le héros Bellérophon monté sur Pégase."),
            en = LocalizedContent("What is the Chimera in Greek mythology?", listOf("A hybrid monster with lion, goat and serpent", "A sea creature", "A winged horse", "A fire giant"), "Mythology", "The Chimera was a fire-breathing monster, described as having a lion's head, a goat's body, and a serpent's tail, defeated by the hero Bellerophon riding Pegasus."),
            zh = LocalizedContent("希腊神话中的喀迈拉是什么？", listOf("狮头、羊身、蛇尾的混合怪物", "海洋生物", "飞马", "火巨人"), "神话", "喀迈拉是一种喷火怪物，被描述为狮头、羊身、蛇尾，被骑着珀伽索斯的英雄柏勒洛丰击败。"),
            es = LocalizedContent("¿Qué es la Quimera en la mitología griega?", listOf("Un monstruo híbrido con león, cabra y serpiente", "Una criatura marina", "Un caballo alado", "Un gigante de fuego"), "Mitología", "La Quimera era un monstruo que escupía fuego, descrito con cabeza de león, cuerpo de cabra y cola de serpiente, vencida por el héroe Belerofonte montado en Pegaso.")
        ),
        BilingualQuestion(
            id = 30248, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Dans la mythologie mésopotamienne, qui est le héros du déluge ?", listOf("Atrahasis", "Gilgamesh", "Enkidu", "Shamash"), "Mythologie", "Atrahasis est le héros du déluge dans la mythologie mésopotamienne, apparaissant dans l'épopée éponyme sumérienne. Ce récit, antérieur à l'épopée de Gilgamesh, raconte comment le dieu Enki avertit Atrahasis du déluge envoyé par les dieux."),
            en = LocalizedContent("In Mesopotamian mythology, who is the hero of the flood?", listOf("Atrahasis", "Gilgamesh", "Enkidu", "Shamash"), "Mythology", "Atrahasis is the flood hero in Mesopotamian mythology, appearing in the eponymous Sumerian epic. This story, predating the Epic of Gilgamesh, tells how the god Enki warned Atrahasis of the flood sent by the gods."),
            zh = LocalizedContent("在美索不达米亚神话中，大洪水英雄是谁？", listOf("阿特拉哈西斯", "吉尔伽美什", "恩奇都", "沙马什"), "神话", "阿特拉哈西斯是美索不达米亚神话中的大洪水英雄，出现在同名的苏美尔史诗中。这个故事早于《吉尔伽美什史诗》，讲述了恩基神警告阿特拉哈西斯众神将降下大洪水。"),
            es = LocalizedContent("En la mitología mesopotámica, ¿quién es el héroe del diluvio?", listOf("Atrahasis", "Gilgamesh", "Enkidu", "Shamash"), "Mitología", "Atrahasis es el héroe del diluvio en la mitología mesopotámica, que aparece en la epopeya sumeria homónima. Este relato, anterior a la Epopeya de Gilgamesh, cuenta cómo el dios Enki advirtió a Atrahasis del diluvio enviado por los dioses.")
        ),
        BilingualQuestion(
            id = 30249, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que l'Ouroboros dans la mythologie ?", listOf("Un serpent se mangeant la queue", "Un œuf cosmique", "Un arbre du monde", "Une forge divine"), "Mythologie", "L'Ouroboros est un symbole ancien représentant un serpent ou un dragon qui se mord la queue, illustrant le cycle éternel de la vie, de la mort et de la renaissance."),
            en = LocalizedContent("What is the Ouroboros in mythology?", listOf("A serpent eating its own tail", "A cosmic egg", "A world tree", "A divine forge"), "Mythology", "The Ouroboros is an ancient symbol depicting a serpent or dragon biting its own tail, illustrating the eternal cycle of life, death, and rebirth."),
            zh = LocalizedContent("神话中的衔尾蛇是什么？", listOf("一条咬住自己尾巴的蛇", "宇宙蛋", "世界树", "神锻炉"), "神话", "衔尾蛇是一个古老符号，描绘了一条蛇或龙咬住自己的尾巴，象征着生命、死亡和重生的永恒循环。"),
            es = LocalizedContent("¿Qué es el Ouroboros en la mitología?", listOf("Una serpiente que se muerde la cola", "Un huevo cósmico", "Un árbol del mundo", "Una fragua divina"), "Mitología", "El Ouroboros es un símbolo antiguo que representa una serpiente o dragón mordiéndose la cola, ilustrando el ciclo eterno de la vida, la muerte y el renacimiento.")
        ),
        BilingualQuestion(
            id = 30250, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Dans la mythologie hindoue, comment s'appelle la danse cosmique de Shiva ?", listOf("Tandava", "Rasa", "Lila", "Puja"), "Mythologie", "Le Tandava est la danse cosmique de Shiva, symbolisant à la fois la création et la destruction de l'univers."),
            en = LocalizedContent("In Hindu mythology, what is the name of Shiva's cosmic dance?", listOf("Tandava", "Rasa", "Lila", "Puja"), "Mythology", "Tandava is Shiva's cosmic dance, symbolizing both the creation and destruction of the universe."),
            zh = LocalizedContent("在印度神话中，湿婆的宇宙之舞叫什么？", listOf("坦达瓦", "拉斯", "利拉", "普迦"), "神话", "坦达瓦是湿婆的宇宙之舞，象征着宇宙的创造与毁灭。"),
            es = LocalizedContent("En la mitología hindú, ¿cómo se llama la danza cósmica de Shiva?", listOf("Tandava", "Rasa", "Lila", "Puja"), "Mitología", "Tandava es la danza cósmica de Shiva, que simboliza tanto la creación como la destrucción del universo.")
        ),
        BilingualQuestion(
            id = 30251, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Deuxième Guerre mondiale s'est-elle terminée ?", listOf("1945", "1943", "1947", "1940"), "Histoire", "La Seconde Guerre mondiale a pris fin en 1945 avec la capitulation de l'Allemagne nazie en mai et celle du Japon en septembre."),
            en = LocalizedContent("In what year did World War II end?", listOf("1945", "1943", "1947", "1940"), "History", "World War II ended in 1945 with the surrender of Nazi Germany in May and Japan in September."),
            zh = LocalizedContent("第二次世界大战在哪一年结束？", listOf("1945", "1943", "1947", "1940"), "历史", "第二次世界大战于1945年结束，纳粹德国在5月投降，日本在9月投降。"),
            es = LocalizedContent("¿En qué año terminó la Segunda Guerra Mundial?", listOf("1945", "1943", "1947", "1940"), "Historia", "La Segunda Guerra Mundial terminó en 1945 con la rendición de la Alemania nazi en mayo y la de Japón en septiembre.")
        ),
        BilingualQuestion(
            id = 30252, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été le premier Président des États-Unis ?", listOf("George Washington", "Thomas Jefferson", "John Adams", "Benjamin Franklin"), "Histoire", "George Washington a été le premier président des États-Unis, élu en 1789 après avoir dirigé l'armée continentale pendant la guerre d'indépendance."),
            en = LocalizedContent("Who was the first President of the United States?", listOf("George Washington", "Thomas Jefferson", "John Adams", "Benjamin Franklin"), "History", "George Washington was the first president of the United States, elected in 1789 after leading the Continental Army during the Revolutionary War."),
            zh = LocalizedContent("谁是美国第一任总统？", listOf("乔治·华盛顿", "托马斯·杰斐逊", "约翰·亚当斯", "本杰明·富兰克林"), "历史", "乔治·华盛顿是美国第一任总统，于1789年当选，此前他在独立战争期间领导大陆军。"),
            es = LocalizedContent("¿Quién fue el primer presidente de los Estados Unidos?", listOf("George Washington", "Thomas Jefferson", "John Adams", "Benjamin Franklin"), "Historia", "George Washington fue el primer presidente de los Estados Unidos, elegido en 1789 después de liderar el Ejército Continental durante la Guerra de Independencia.")
        ),
        BilingualQuestion(
            id = 30254, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire a construit la Grande Muraille de Chine ?", listOf("Dynastie Ming", "Dynastie Tang", "Dynastie Zhou", "Dynastie Han"), "Histoire", "Bien que des fortifications existaient depuis le IIIe siècle av. J.-C., la majeure partie de la Grande Muraille visible aujourd'hui a été construite sous la dynastie Ming (1368-1644) pour se protéger des invasions mongoles."),
            en = LocalizedContent("Which empire built the Great Wall of China?", listOf("Ming Dynasty", "Tang Dynasty", "Zhou Dynasty", "Han Dynasty"), "History", "Although fortifications existed since the 3rd century BC, most of the Great Wall visible today was built under the Ming Dynasty (1368-1644) to protect against Mongol invasions."),
            zh = LocalizedContent("哪个朝代修建了中国的长城？", listOf("明朝", "唐朝", "周朝", "汉朝"), "历史", "虽然自公元前3世纪起就有防御工事，但今天可见的大部分长城是在明朝（1368-1644）修建的，用于防御蒙古入侵。"),
            es = LocalizedContent("¿Qué imperio construyó la Gran Muralla China?", listOf("Dinastía Ming", "Dinastía Tang", "Dinastía Zhou", "Dinastía Han"), "Historia", "Aunque existían fortificaciones desde el siglo III a.C., la mayor parte de la Gran Muralla visible hoy fue construida bajo la dinastía Ming (1368-1644) para protegerse de las invasiones mongolas.")
        ),
        BilingualQuestion(
            id = 30255, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Titanic a-t-il coulé ?", listOf("1912", "1915", "1910", "1920"), "Histoire", "Le Titanic a coulé le 15 avril 1912 lors de son voyage inaugural, après avoir heurté un iceberg dans l'Atlantique Nord."),
            en = LocalizedContent("In what year did the Titanic sink?", listOf("1912", "1915", "1910", "1920"), "History", "The Titanic sank on April 15, 1912 during its maiden voyage after hitting an iceberg in the North Atlantic."),
            zh = LocalizedContent("泰坦尼克号在哪一年沉没？", listOf("1912", "1915", "1910", "1920"), "历史", "泰坦尼克号于1912年4月15日在首航中撞上北大西洋的冰山后沉没。"),
            es = LocalizedContent("¿En qué año se hundió el Titanic?", listOf("1912", "1915", "1910", "1920"), "Historia", "El Titanic se hundió el 15 de abril de 1912 durante su viaje inaugural tras chocar contra un iceberg en el Atlántico Norte.")
        ),
        BilingualQuestion(
            id = 30256, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été le premier Président de la France ?", listOf("Napoléon Bonaparte", "Louis-Napoléon Bonaparte", "Charles de Gaulle", "Georges Clemenceau"), "Histoire", "Napoléon Bonaparte a été le premier président de la France, élu en 1848 sous la Deuxième République, avant de devenir empereur."),
            en = LocalizedContent("Who was the first President of France?", listOf("Napoleon Bonaparte", "Louis-Napoleon Bonaparte", "Charles de Gaulle", "Georges Clemenceau"), "History", "Napoleon Bonaparte was the first president of France, elected in 1848 under the Second Republic, before becoming emperor."),
            zh = LocalizedContent("谁是法国第一任总统？", listOf("拿破仑·波拿巴", "路易-拿破仑·波拿巴", "夏尔·戴高乐", "乔治·克列孟梭"), "历史", "拿破仑·波拿巴是法国第一任总统，于1848年在第二共和国时期当选，后来成为皇帝。"),
            es = LocalizedContent("¿Quién fue el primer presidente de Francia?", listOf("Napoleón Bonaparte", "Luis Napoleón Bonaparte", "Charles de Gaulle", "Georges Clemenceau"), "Historia", "Napoleón Bonaparte fue el primer presidente de Francia, elegido en 1848 bajo la Segunda República, antes de convertirse en emperador.")
        ),
        BilingualQuestion(
            id = 30258, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était l'empereur romain connu pour avoir construit le Colosseum ?", listOf("Vespasien", "Auguste", "Néron", "Trajan"), "Histoire", "Vespasien a ordonné la construction du Colisée, achevé sous son fils Titus, pour offrir des spectacles au peuple romain après les guerres civiles."),
            en = LocalizedContent("Who was the Roman emperor known for building the Colosseum?", listOf("Vespasian", "Augustus", "Nero", "Trajan"), "History", "Vespasian ordered the construction of the Colosseum, completed under his son Titus, to provide spectacles for the Roman people after the civil wars."),
            zh = LocalizedContent("哪位罗马皇帝以建造罗马斗兽场而闻名？", listOf("韦斯帕芗", "奥古斯都", "尼禄", "图拉真"), "历史", "韦斯帕芗下令建造罗马斗兽场，由其子提图斯完成，旨在内战后为罗马人民提供娱乐。"),
            es = LocalizedContent("¿Quién fue el emperador romano conocido por construir el Coliseo?", listOf("Vespasiano", "Augusto", "Nerón", "Trajano"), "Historia", "Vespasiano ordenó la construcción del Coliseo, completado bajo su hijo Tito, para ofrecer espectáculos al pueblo romano después de las guerras civiles.")
        ),
        BilingualQuestion(
            id = 30259, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'était la Route de la Soie ?", listOf("Voie commerciale reliant l'Est et l'Ouest", "Route militaire", "Itinéraire de pèlerinage religieux", "Voie maritime"), "Histoire", "La Route de la Soie était un réseau de routes commerciales terrestres et maritimes qui reliait la Chine à la Méditerranée, facilitant les échanges de marchandises comme la soie, les épices et les idées entre l'Est et l'Ouest."),
            en = LocalizedContent("What was the Silk Road?", listOf("Trade route connecting East and West", "Military route", "Religious pilgrimage itinerary", "Maritime route"), "History", "The Silk Road was a network of land and sea trade routes linking China to the Mediterranean, facilitating the exchange of goods like silk, spices, and ideas between East and West."),
            zh = LocalizedContent("丝绸之路是什么？", listOf("连接东西方的贸易路线", "军事路线", "宗教朝圣路线", "海上路线"), "历史", "丝绸之路是一个连接中国与地中海的陆上和海上贸易路线网络，促进了丝绸、香料等商品以及东西方思想的交流。"),
            es = LocalizedContent("¿Qué fue la Ruta de la Seda?", listOf("Ruta comercial que conectaba Oriente y Occidente", "Ruta militar", "Itinerario de peregrinación religiosa", "Ruta marítima"), "Historia", "La Ruta de la Seda fue una red de rutas comerciales terrestres y marítimas que conectaban China con el Mediterráneo, facilitando el intercambio de mercancías como seda, especias e ideas entre Oriente y Occidente.")
        ),
        BilingualQuestion(
            id = 30260, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel Sultan ottoman a conquis Constantinople en 1453 ?", listOf("Mehmed II", "Soliman I", "Mourad II", "Orkhan"), "Histoire", "Mehmed II, dit le Conquérant, mit fin à l'Empire byzantin en prenant Constantinople après un siège de 53 jours, utilisant des canons géants et une flotte."),
            en = LocalizedContent("Which Ottoman Sultan conquered Constantinople in 1453?", listOf("Mehmed II", "Suleiman I", "Murad II", "Orhan"), "History", "Mehmed II, known as the Conqueror, ended the Byzantine Empire by capturing Constantinople after a 53-day siege, using giant cannons and a fleet."),
            zh = LocalizedContent("哪位奥斯曼苏丹在1453年征服了君士坦丁堡？", listOf("穆罕默德二世", "苏莱曼一世", "穆拉德二世", "奥尔汗"), "历史", "穆罕默德二世，被称为征服者，经过53天的围攻，利用巨型大炮和舰队攻占了君士坦丁堡，结束了拜占庭帝国。"),
            es = LocalizedContent("¿Qué sultán otomano conquistó Constantinopla en 1453?", listOf("Mehmed II", "Solimán I", "Murad II", "Orján"), "Historia", "Mehmed II, conocido como el Conquistador, puso fin al Imperio Bizantino al tomar Constantinopla tras un asedio de 53 días, utilizando cañones gigantes y una flota.")
        ),
        BilingualQuestion(
            id = 30261, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a dirigé l'Empire mongol à son apogée ?", listOf("Gengis Khan", "Koubilaï Khan", "Tamerlan", "Möngke Khan"), "Histoire", "Gengis Khan a unifié les tribus mongoles et fondé l'Empire mongol au début du XIIIe siècle, le menant à son extension maximale à sa mort en 1227."),
            en = LocalizedContent("Who led the Mongol Empire at its peak?", listOf("Genghis Khan", "Kublai Khan", "Tamerlane", "Möngke Khan"), "History", "Genghis Khan united the Mongol tribes and founded the Mongol Empire in the early 13th century, leading it to its greatest extent at his death in 1227."),
            zh = LocalizedContent("谁在蒙古帝国鼎盛时期领导了它？", listOf("成吉思汗", "忽必烈", "帖木儿", "蒙哥汗"), "历史", "成吉思汗统一了蒙古部落，并在13世纪初建立了蒙古帝国，在他1227年去世时将其扩展到最大范围。"),
            es = LocalizedContent("¿Quién lideró el Imperio Mongol en su apogeo?", listOf("Gengis Kan", "Kublai Kan", "Tamerlán", "Möngke Kan"), "Historia", "Gengis Kan unificó las tribus mongolas y fundó el Imperio Mongol a principios del siglo XIII, llevándolo a su máxima extensión a su muerte en 1227.")
        ),
        BilingualQuestion(
            id = 30262, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Colomb a-t-il atteint les Amériques ?", listOf("1492", "1500", "1485", "1510"), "Histoire", "Christophe Colomb, naviguant sous pavillon espagnol, atteint les Amériques le 12 octobre 1492, croyant avoir trouvé une route vers l'Asie."),
            en = LocalizedContent("In what year did Columbus reach the Americas?", listOf("1492", "1500", "1485", "1510"), "History", "Christopher Columbus, sailing under the Spanish flag, reached the Americas on October 12, 1492, believing he had found a route to Asia."),
            zh = LocalizedContent("哥伦布在哪一年到达美洲？", listOf("1492", "1500", "1485", "1510"), "历史", "克里斯托弗·哥伦布在西班牙旗帜下航行，于1492年10月12日到达美洲，认为他找到了通往亚洲的路线。"),
            es = LocalizedContent("¿En qué año llegó Colón a las Américas?", listOf("1492", "1500", "1485", "1510"), "Historia", "Cristóbal Colón, navegando bajo bandera española, llegó a las Américas el 12 de octubre de 1492, creyendo haber encontrado una ruta hacia Asia.")
        ),
        BilingualQuestion(
            id = 30263, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a été l'architecte de la Terreur pendant la Révolution française ?", listOf("Robespierre", "Danton", "Marat", "Carnot"), "Histoire", "Maximilien de Robespierre, figure majeure des Jacobins, a dirigé le Comité de salut public et instauré la Terreur pour réprimer les opposants à la Révolution."),
            en = LocalizedContent("Who was the architect of the Terror during the French Revolution?", listOf("Robespierre", "Danton", "Marat", "Carnot"), "History", "Maximilien de Robespierre, a leading figure of the Jacobins, headed the Committee of Public Safety and instituted the Reign of Terror to suppress opponents of the Revolution."),
            zh = LocalizedContent("谁是法国大革命期间恐怖统治的设计者？", listOf("罗伯斯庇尔", "丹东", "马拉", "卡诺"), "历史", "马克西米连·罗伯斯庇尔，雅各宾派的主要人物，领导了公共安全委员会并实行恐怖统治以镇压革命反对者。"),
            es = LocalizedContent("¿Quién fue el arquitecto del Terror durante la Revolución Francesa?", listOf("Robespierre", "Danton", "Marat", "Carnot"), "Historia", "Maximilien de Robespierre, figura principal de los jacobinos, presidió el Comité de Salvación Pública e instauró el Reinado del Terror para reprimir a los opositores de la Revolución.")
        ),
        BilingualQuestion(
            id = 30264, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Sur quel continent l'Empire du Mali a-t-il prospéré ?", listOf("Afrique", "Asie", "Amérique du Sud", "Europe"), "Histoire", "L'Empire du Mali était un puissant royaume médiéval situé en Afrique de l'Ouest, connu pour sa richesse en or et son influence culturelle."),
            en = LocalizedContent("On which continent did the Mali Empire thrive?", listOf("Africa", "Asia", "South America", "Europe"), "History", "The Mali Empire was a powerful medieval kingdom located in West Africa, known for its wealth in gold and cultural influence."),
            zh = LocalizedContent("马里帝国在哪个大陆繁荣？", listOf("非洲", "亚洲", "南美洲", "欧洲"), "历史", "马里帝国是一个位于西非的强大中世纪王国，以其黄金财富和文化影响力而闻名。"),
            es = LocalizedContent("¿En qué continente prosperó el Imperio de Malí?", listOf("África", "Asia", "América del Sur", "Europa"), "Historia", "El Imperio de Malí fue un poderoso reino medieval ubicado en África Occidental, conocido por su riqueza en oro e influencia cultural.")
        ),
        BilingualQuestion(
            id = 30265, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle était la cause principale de la chute de l'Empire romain ?", listOf("Invasions barbares et conflits internes", "Épidémies", "Effondrement économique seul", "Catastrophe naturelle"), "Histoire", "Les invasions barbares, combinées aux guerres civiles et à l'instabilité politique, ont affaibli l'empire jusqu'à sa chute en 476."),
            en = LocalizedContent("What was the main cause of the fall of the Roman Empire?", listOf("Barbarian invasions and internal conflicts", "Epidemics", "Economic collapse alone", "Natural disaster"), "History", "Barbarian invasions, combined with civil wars and political instability, weakened the empire until its fall in 476."),
            zh = LocalizedContent("罗马帝国衰落的主要原因是什么？", listOf("蛮族入侵和内部冲突", "流行病", "仅经济崩溃", "自然灾害"), "历史", "蛮族入侵加上内战和政治不稳定削弱了帝国，直到476年灭亡。"),
            es = LocalizedContent("¿Cuál fue la causa principal de la caída del Imperio Romano?", listOf("Invasiones bárbaras y conflictos internos", "Epidemias", "Colapso económico solo", "Desastre natural"), "Historia", "Las invasiones bárbaras, combinadas con guerras civiles e inestabilidad política, debilitaron el imperio hasta su caída en 476.")
        ),
        BilingualQuestion(
            id = 30266, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel royaume africain était connu pour contrôler le commerce de l'or et du sel ?", listOf("Empire du Ghana", "Songhaï", "Éthiopie", "Congo"), "Histoire", "L'Empire du Ghana, situé dans l'actuelle Afrique de l'Ouest, a prospéré entre le VIIIe et le XIe siècle en contrôlant les routes commerciales transsahariennes de l'or et du sel."),
            en = LocalizedContent("Which African kingdom was known for controlling the gold and salt trade?", listOf("Ghana Empire", "Songhai", "Ethiopia", "Congo"), "History", "The Ghana Empire, located in present-day West Africa, flourished between the 8th and 11th centuries by controlling trans-Saharan trade routes for gold and salt."),
            zh = LocalizedContent("哪个非洲王国以控制黄金和盐贸易而闻名？", listOf("加纳帝国", "桑海", "埃塞俄比亚", "刚果"), "历史", "加纳帝国位于今天的西非，在8至11世纪通过控制跨撒哈拉的黄金和盐贸易路线而繁荣。"),
            es = LocalizedContent("¿Qué reino africano era conocido por controlar el comercio de oro y sal?", listOf("Imperio de Ghana", "Songhay", "Etiopía", "Congo"), "Historia", "El Imperio de Ghana, ubicado en la actual África Occidental, floreció entre los siglos VIII y XI controlando las rutas comerciales transaharianas de oro y sal.")
        ),
        BilingualQuestion(
            id = 30267, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de Sécession américaine a-t-elle commencé ?", listOf("1861", "1860", "1863", "1865"), "Histoire", "La guerre de Sécession a débuté le 12 avril 1861 avec l'attaque confédérée sur Fort Sumter en Caroline du Sud, marquant le premier affrontement armé entre les États du Nord et du Sud."),
            en = LocalizedContent("In what year did the American Civil War begin?", listOf("1861", "1860", "1863", "1865"), "History", "The American Civil War began on April 12, 1861, with the Confederate attack on Fort Sumter in South Carolina, marking the first armed conflict between Northern and Southern states."),
            zh = LocalizedContent("美国内战在哪一年开始？", listOf("1861", "1860", "1863", "1865"), "历史", "美国内战于1861年4月12日以南方邦联对南卡罗来纳州萨姆特堡的进攻开始，标志着南北州之间的第一次武装冲突。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra Civil estadounidense?", listOf("1861", "1860", "1863", "1865"), "Historia", "La Guerra Civil estadounidense comenzó el 12 de abril de 1861 con el ataque confederado a Fort Sumter en Carolina del Sur, marcando el primer conflicto armado entre los estados del Norte y del Sur.")
        ),
        BilingualQuestion(
            id = 30268, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a été le premier Empereur du Japon ?", listOf("Jimmu", "Suiko", "Shotoku", "Kangaku"), "Histoire", "Jimmu est considéré comme le fondateur légendaire du Japon et le premier empereur, selon la tradition impériale nippone. Son règne mythique aurait débuté en 660 avant J.-C."),
            en = LocalizedContent("Who was the first Emperor of Japan?", listOf("Jimmu", "Suiko", "Shotoku", "Kangaku"), "History", "Jimmu is considered the legendary founder of Japan and the first emperor, according to Japanese imperial tradition. His mythical reign is said to have begun in 660 BC."),
            zh = LocalizedContent("谁是日本的第一位天皇？", listOf("神武", "推古", "圣德", "桓武"), "历史", "根据日本皇室传统，神武被认为是日本的传奇创始人和第一位天皇。他的神话统治据说始于公元前660年。"),
            es = LocalizedContent("¿Quién fue el primer Emperador de Japón?", listOf("Jimmu", "Suiko", "Shotoku", "Kangaku"), "Historia", "Jimmu es considerado el fundador legendario de Japón y el primer emperador, según la tradición imperial japonesa. Su reinado mítico habría comenzado en el 660 a.C.")
        ),
        BilingualQuestion(
            id = 30269, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle était la motivation principale de l'exploration européenne aux 15e-16e siècles ?", listOf("Épices, or et routes commerciales", "Découverte scientifique", "Conversion religieuse", "Conquête territoriale"), "Histoire", "Les épices asiatiques, l'or africain et le contrôle des routes commerciales vers l'Orient motivaient les puissances européennes, contournant les intermédiaires ottomans et vénitiens."),
            en = LocalizedContent("What was the main motivation for European exploration in the 15th-16th centuries?", listOf("Spices, gold and trade routes", "Scientific discovery", "Religious conversion", "Territorial conquest"), "History", "Asian spices, African gold and control of trade routes to the Orient motivated European powers, bypassing Ottoman and Venetian intermediaries."),
            zh = LocalizedContent("15-16世纪欧洲探险的主要动机是什么？", listOf("香料、黄金和贸易路线", "科学发现", "宗教皈依", "领土征服"), "历史", "亚洲的香料、非洲的黄金以及控制通往东方的贸易路线激励了欧洲列强，绕过了奥斯曼和威尼斯的中介。"),
            es = LocalizedContent("¿Cuál fue la motivación principal de la exploración europea en los siglos XV-XVI?", listOf("Especias, oro y rutas comerciales", "Descubrimiento científico", "Conversión religiosa", "Conquista territorial"), "Historia", "Las especias asiáticas, el oro africano y el control de las rutas comerciales hacia Oriente motivaron a las potencias europeas, evitando a los intermediarios otomanos y venecianos.")
        ),
        BilingualQuestion(
            id = 30270, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire sud-américain a été conquis par Pizarro ?", listOf("Inca", "Aztèque", "Maya", "Muisca"), "Histoire", "Francisco Pizarro a conquis l'Empire inca dans les années 1530, capturant son empereur Atahualpa. Cette conquête a marqué la chute du plus grand empire précolombien d'Amérique du Sud."),
            en = LocalizedContent("Which South American empire was conquered by Pizarro?", listOf("Inca", "Aztec", "Maya", "Muisca"), "History", "Francisco Pizarro conquered the Inca Empire in the 1530s, capturing its emperor Atahualpa. This conquest marked the fall of the largest pre-Columbian empire in South America."),
            zh = LocalizedContent("皮萨罗征服了哪个南美帝国？", listOf("印加", "阿兹特克", "玛雅", "穆伊斯卡"), "历史", "弗朗西斯科·皮萨罗在1530年代征服了印加帝国，俘虏了其皇帝阿塔瓦尔帕。这次征服标志着南美洲最大的前哥伦布帝国的覆灭。"),
            es = LocalizedContent("¿Qué imperio sudamericano fue conquistado por Pizarro?", listOf("Inca", "Azteca", "Maya", "Muisca"), "Historia", "Francisco Pizarro conquistó el Imperio Inca en la década de 1530, capturando a su emperador Atahualpa. Esta conquista marcó la caída del mayor imperio precolombino de Sudamérica.")
        ),
        BilingualQuestion(
            id = 30271, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année la Révolution russe s'est-elle produite ?", listOf("1917", "1915", "1920", "1905"), "Histoire", "La Révolution russe a eu lieu en 1917, marquée par deux soulèvements : la révolution de Février qui a renversé le tsar, puis la révolution d'Octobre menée par les bolcheviks."),
            en = LocalizedContent("In which year did the Russian Revolution occur?", listOf("1917", "1915", "1920", "1905"), "History", "The Russian Revolution took place in 1917, marked by two uprisings: the February Revolution which overthrew the tsar, and the October Revolution led by the Bolsheviks."),
            zh = LocalizedContent("俄国革命发生在哪一年？", listOf("1917", "1915", "1920", "1905"), "历史", "俄国革命发生在1917年，以两次起义为标志：二月革命推翻了沙皇，十月革命由布尔什维克领导。"),
            es = LocalizedContent("¿En qué año ocurrió la Revolución Rusa?", listOf("1917", "1915", "1920", "1905"), "Historia", "La Revolución Rusa tuvo lugar en 1917, marcada por dos levantamientos: la Revolución de Febrero que derrocó al zar, y la Revolución de Octubre liderada por los bolcheviques.")
        ),
        BilingualQuestion(
            id = 30272, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a été l'architecte de la Restauration Meiji au Japon ?", listOf("Empereur Meiji", "Tokugawa Ieyasu", "Oda Nobunaga", "Toyotomi Hideyoshi"), "Histoire", "L'empereur Meiji a dirigé la modernisation rapide du Japon après 1868, mettant fin au shogunat et centralisant le pouvoir impérial pour transformer le pays en puissance industrielle et militaire."),
            en = LocalizedContent("Who was the architect of the Meiji Restoration in Japan?", listOf("Emperor Meiji", "Tokugawa Ieyasu", "Oda Nobunaga", "Toyotomi Hideyoshi"), "History", "Emperor Meiji led Japan's rapid modernization after 1868, ending the shogunate and centralizing imperial power to transform the country into an industrial and military power."),
            zh = LocalizedContent("谁是日本明治维新的设计者？", listOf("明治天皇", "德川家康", "织田信长", "丰臣秀吉"), "历史", "明治天皇在1868年后领导了日本的快速现代化，结束了幕府统治，集中了皇权，将日本转变为工业和军事强国。"),
            es = LocalizedContent("¿Quién fue el arquitecto de la Restauración Meiji en Japón?", listOf("Emperador Meiji", "Tokugawa Ieyasu", "Oda Nobunaga", "Toyotomi Hideyoshi"), "Historia", "El emperador Meiji lideró la rápida modernización de Japón después de 1868, poniendo fin al shogunato y centralizando el poder imperial para transformar el país en una potencia industrial y militar.")
        ),
        BilingualQuestion(
            id = 30273, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle était la signification du Traité de Westphalie (1648) ?", listOf("Établissement du système d'État-nation moderne", "Fin des Croisades", "Abolition du féodalisme", "Création de l'UE"), "Histoire", "Le Traité de Westphalie a mis fin à la guerre de Trente Ans en reconnaissant la souveraineté des États sur leur territoire, posant ainsi les bases du système d'État-nation moderne."),
            en = LocalizedContent("What was the significance of the Treaty of Westphalia (1648)?", listOf("Establishment of the modern nation-state system", "End of the Crusades", "Abolition of feudalism", "Creation of the EU"), "History", "The Treaty of Westphalia ended the Thirty Years' War by recognizing the sovereignty of states over their territory, thus laying the foundations for the modern nation-state system."),
            zh = LocalizedContent("威斯特伐利亚和约（1648年）的意义是什么？", listOf("建立现代民族国家体系", "结束十字军东征", "废除封建制度", "创建欧盟"), "历史", "威斯特伐利亚和约结束了三十年战争，承认了国家对其领土的主权，从而为现代民族国家体系奠定了基础。"),
            es = LocalizedContent("¿Cuál fue la importancia del Tratado de Westfalia (1648)?", listOf("Establecimiento del sistema moderno de estados-nación", "Fin de las Cruzadas", "Abolición del feudalismo", "Creación de la UE"), "Historia", "El Tratado de Westfalia puso fin a la Guerra de los Treinta Años al reconocer la soberanía de los estados sobre su territorio, sentando así las bases del sistema moderno de estados-nación.")
        ),
        BilingualQuestion(
            id = 30274, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a fondé l'Empire Safavide et établi l'islam chiite comme religion d'État ?", listOf("Ismail I", "Abbas I", "Tahmasp I", "Cyrus le Grand"), "Histoire", "Ismail Ier, chef de l'ordre soufi des Safavides, conquit la Perse au début du XVIe siècle et proclama le chiisme duodécimain religion d'État en 1501."),
            en = LocalizedContent("Who founded the Safavid Empire and established Shia Islam as the state religion?", listOf("Ismail I", "Abbas I", "Tahmasp I", "Cyrus the Great"), "History", "Ismail I, leader of the Safavid Sufi order, conquered Persia in the early 16th century and proclaimed Twelver Shia as the state religion in 1501."),
            zh = LocalizedContent("谁建立了萨法维帝国并确立什叶派伊斯兰教为国教？", listOf("伊斯玛仪一世", "阿巴斯一世", "塔赫马斯普一世", "居鲁士大帝"), "历史", "伊斯玛仪一世，萨法维苏菲教团的领袖，在16世纪初征服了波斯，并于1501年宣布十二伊玛目派什叶派为国教。"),
            es = LocalizedContent("¿Quién fundó el Imperio Safávida y estableció el islam chiíta como religión estatal?", listOf("Ismail I", "Abbas I", "Tahmasp I", "Ciro el Grande"), "Historia", "Ismail I, líder de la orden sufí safávida, conquistó Persia a principios del siglo XVI y proclamó el chiismo duodecimano como religión estatal en 1501.")
        ),
        BilingualQuestion(
            id = 30275, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'était la Partition de l'Inde en 1947 principalement ?", listOf("Division en Inde et Pakistan", "Indépendance de la Grande-Bretagne", "Création du Bangladesh", "Résolution de conflits religieux"), "Histoire", "La Partition de l'Inde en 1947 a divisé le Raj britannique en deux États indépendants, l'Inde à majorité hindoue et le Pakistan à majorité musulmane, suite aux tensions religieuses et à la fin de la colonisation britannique."),
            en = LocalizedContent("What was the Partition of India in 1947 primarily?", listOf("Division into India and Pakistan", "Independence from Britain", "Creation of Bangladesh", "Resolution of religious conflicts"), "History", "The Partition of India in 1947 divided British India into two independent states, Hindu-majority India and Muslim-majority Pakistan, following religious tensions and the end of British colonization."),
            zh = LocalizedContent("1947年的印巴分治主要是什么？", listOf("分为印度和巴基斯坦", "脱离英国独立", "创建孟加拉国", "解决宗教冲突"), "历史", "1947年的印巴分治将英属印度分为两个独立国家：印度教为主的印度和穆斯林为主的巴基斯坦，源于宗教紧张局势和英国殖民统治的结束。"),
            es = LocalizedContent("¿Qué fue principalmente la Partición de la India en 1947?", listOf("División en India y Pakistán", "Independencia de Gran Bretaña", "Creación de Bangladés", "Resolución de conflictos religiosos"), "Historia", "La Partición de la India en 1947 dividió el Raj británico en dos estados independientes, la India de mayoría hindú y Pakistán de mayoría musulmana, tras tensiones religiosas y el fin de la colonización británica.")
        ),
        BilingualQuestion(
            id = 30276, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe est connu pour avoir dit 'Je pense, donc je suis' ?", listOf("René Descartes", "Immanuel Kant", "Friedrich Nietzsche", "Jean-Paul Sartre"), "Philosophie", "René Descartes énonce cette formule dans son Discours de la méthode (1637) comme première certitude après avoir douté de tout, fondant ainsi la philosophie moderne sur le sujet pensant."),
            en = LocalizedContent("Which philosopher is known for saying 'I think, therefore I am'?", listOf("René Descartes", "Immanuel Kant", "Friedrich Nietzsche", "Jean-Paul Sartre"), "Philosophy", "René Descartes stated this formula in his Discourse on the Method (1637) as the first certainty after doubting everything, thus founding modern philosophy on the thinking subject."),
            zh = LocalizedContent("哪位哲学家以'我思故我在'闻名？", listOf("勒内·笛卡尔", "伊曼努尔·康德", "弗里德里希·尼采", "让-保罗·萨特"), "哲学", "勒内·笛卡尔在其《方法论》（1637年）中提出这一公式，作为怀疑一切后的第一个确定性，从而将现代哲学建立在思考的主体之上。"),
            es = LocalizedContent("¿Qué filósofo es conocido por decir 'Pienso, luego existo'?", listOf("René Descartes", "Immanuel Kant", "Friedrich Nietzsche", "Jean-Paul Sartre"), "Filosofía", "René Descartes enunció esta fórmula en su Discurso del método (1637) como primera certeza tras dudar de todo, fundando así la filosofía moderna en el sujeto pensante.")
        ),
        BilingualQuestion(
            id = 30277, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quoi consiste fondamentalement le stoïcisme ?", listOf("Vertu et acceptation du destin", "Plaisir et bonheur", "Connaissance et raison", "Devoir et obligation"), "Philosophie", "Le stoïcisme enseigne que le bonheur réside dans la vertu, seule chose sous notre contrôle, et dans l'acceptation sereine des événements extérieurs, dictés par le destin ou la nature."),
            en = LocalizedContent("What does Stoicism fundamentally consist of?", listOf("Virtue and acceptance of fate", "Pleasure and happiness", "Knowledge and reason", "Duty and obligation"), "Philosophy", "Stoicism teaches that happiness lies in virtue, the only thing under our control, and in the serene acceptance of external events, dictated by fate or nature."),
            zh = LocalizedContent("斯多葛主义的基本内涵是什么？", listOf("美德和接受命运", "快乐和幸福", "知识和理性", "责任和义务"), "哲学", "斯多葛主义教导说，幸福在于美德——唯一受我们控制的事物——以及平静地接受由命运或自然决定的外部事件。"),
            es = LocalizedContent("¿En qué consiste fundamentalmente el estoicismo?", listOf("Virtud y aceptación del destino", "Placer y felicidad", "Conocimiento y razón", "Deber y obligación"), "Filosofía", "El estoicismo enseña que la felicidad reside en la virtud, lo único bajo nuestro control, y en la aceptación serena de los eventos externos, dictados por el destino o la naturaleza.")
        ),
        BilingualQuestion(
            id = 30278, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Cent ans de solitude' ?", listOf("Gabriel García Márquez", "Jorge Luis Borges", "Pablo Neruda", "Octavio Paz"), "Philosophie", "Gabriel García Márquez, écrivain colombien, a publié ce roman majeur du réalisme magique en 1967, qui lui a valu le prix Nobel de littérature en 1982."),
            en = LocalizedContent("Who wrote 'One Hundred Years of Solitude'?", listOf("Gabriel García Márquez", "Jorge Luis Borges", "Pablo Neruda", "Octavio Paz"), "Philosophy", "Gabriel García Márquez, Colombian writer, published this major novel of magical realism in 1967, which earned him the Nobel Prize in Literature in 1982."),
            zh = LocalizedContent("谁写了《百年孤独》？", listOf("加夫列尔·加西亚·马尔克斯", "豪尔赫·路易斯·博尔赫斯", "巴勃罗·聂鲁达", "奥克塔维奥·帕斯"), "哲学", "哥伦比亚作家加夫列尔·加西亚·马尔克斯于1967年出版了这部魔幻现实主义的重要小说，并因此于1982年获得诺贝尔文学奖。"),
            es = LocalizedContent("¿Quién escribió 'Cien años de soledad'?", listOf("Gabriel García Márquez", "Jorge Luis Borges", "Pablo Neruda", "Octavio Paz"), "Filosofía", "Gabriel García Márquez, escritor colombiano, publicó esta novela mayor del realismo mágico en 1967, que le valió el Premio Nobel de Literatura en 1982.")
        ),
        BilingualQuestion(
            id = 30279, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel mouvement philosophique a souligné le doute et le questionnement ?", listOf("Scepticisme", "Dogmatisme", "Relativisme", "Empirisme"), "Philosophie", "Le scepticisme, courant philosophique antique, place le doute méthodique et le questionnement permanent au cœur de sa démarche pour atteindre la sagesse."),
            en = LocalizedContent("Which philosophical movement emphasized doubt and questioning?", listOf("Skepticism", "Dogmatism", "Relativism", "Empiricism"), "Philosophy", "Skepticism, an ancient philosophical current, places methodical doubt and constant questioning at the heart of its approach to achieving wisdom."),
            zh = LocalizedContent("哪个哲学流派强调怀疑和质疑？", listOf("怀疑主义", "教条主义", "相对主义", "经验主义"), "哲学", "怀疑主义作为古代哲学流派，将方法论的怀疑和持续质疑置于其追求智慧的核心。"),
            es = LocalizedContent("¿Qué movimiento filosófico enfatizó la duda y el cuestionamiento?", listOf("Escepticismo", "Dogmatismo", "Relativismo", "Empirismo"), "Filosofía", "El escepticismo, corriente filosófica antigua, sitúa la duda metódica y el cuestionamiento constante en el centro de su enfoque para alcanzar la sabiduría.")
        ),
        BilingualQuestion(
            id = 30280, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est connu comme le père de la philosophie occidentale ?", listOf("Socrate", "Platon", "Aristote", "Pythagore"), "Philosophie", "Socrate est considéré comme le père de la philosophie occidentale car il a introduit la méthode dialectique et a influencé des penseurs majeurs comme Platon et Aristote."),
            en = LocalizedContent("Who is known as the father of Western philosophy?", listOf("Socrates", "Plato", "Aristotle", "Pythagoras"), "Philosophy", "Socrates is considered the father of Western philosophy because he introduced the dialectical method and influenced major thinkers like Plato and Aristotle."),
            zh = LocalizedContent("谁被称为西方哲学之父？", listOf("苏格拉底", "柏拉图", "亚里士多德", "毕达哥拉斯"), "哲学", "苏格拉底被认为是西方哲学之父，因为他引入了辩证方法，并影响了柏拉图、亚里士多德等主要思想家。"),
            es = LocalizedContent("¿Quién es conocido como el padre de la filosofía occidental?", listOf("Sócrates", "Platón", "Aristóteles", "Pitágoras"), "Filosofía", "Sócrates es considerado el padre de la filosofía occidental porque introdujo el método dialéctico e influyó en pensadores importantes como Platón y Aristóteles.")
        ),
        BilingualQuestion(
            id = 30281, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'existentialisme souligne ?", listOf("Liberté individuelle et choix", "Volonté divine", "Raison et logique", "Devoir social"), "Philosophie", "L'existentialisme, courant philosophique du XXe siècle, affirme que l'existence précède l'essence, plaçant la liberté individuelle et le choix au cœur de la condition humaine."),
            en = LocalizedContent("What does existentialism emphasize?", listOf("Individual freedom and choice", "Divine will", "Reason and logic", "Social duty"), "Philosophy", "Existentialism, a 20th-century philosophical movement, asserts that existence precedes essence, placing individual freedom and choice at the heart of the human condition."),
            zh = LocalizedContent("存在主义强调什么？", listOf("个人自由和选择", "神圣意志", "理性和逻辑", "社会责任"), "哲学", "存在主义是20世纪的哲学流派，主张存在先于本质，将个人自由和选择置于人类状况的核心。"),
            es = LocalizedContent("¿Qué enfatiza el existencialismo?", listOf("Libertad individual y elección", "Voluntad divina", "Razón y lógica", "Deber social"), "Filosofía", "El existencialismo, un movimiento filosófico del siglo XX, afirma que la existencia precede a la esencia, colocando la libertad individual y la elección en el centro de la condición humana.")
        ),
        BilingualQuestion(
            id = 30283, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est l'idée centrale de la Théorie des Formes de Platon ?", listOf("Des universaux abstraits idéaux existent au-delà du monde physique", "La réalité est seulement physique", "Toute connaissance est relative", "La vérité est subjective"), "Philosophie", "Platon distingue le monde sensible, imparfait et changeant, d'un monde intelligible parfait et immuable, où résident les Formes (ou Idées), comme le Beau ou le Juste, qui sont les modèles des choses physiques."),
            en = LocalizedContent("What is the central idea of Plato's Theory of Forms?", listOf("Ideal abstract universals exist beyond the physical world", "Reality is only physical", "All knowledge is relative", "Truth is subjective"), "Philosophy", "Plato distinguishes the sensible world, imperfect and changing, from an intelligible world that is perfect and unchanging, where Forms (or Ideas) reside, such as Beauty or Justice, which are the models of physical things."),
            zh = LocalizedContent("柏拉图理念论的核心思想是什么？", listOf("理想的抽象共相存在于物理世界之外", "现实只是物理的", "所有知识都是相对的", "真理是主观的"), "哲学", "柏拉图区分了不完美且变化的感官世界与完美且不变的理念世界，其中居住着形式（或理念），如美或正义，它们是物理事物的模型。"),
            es = LocalizedContent("¿Cuál es la idea central de la Teoría de las Formas de Platón?", listOf("Existen universales abstractos ideales más allá del mundo físico", "La realidad es solo física", "Todo conocimiento es relativo", "La verdad es subjetiva"), "Filosofía", "Platón distingue el mundo sensible, imperfecto y cambiante, de un mundo inteligible perfecto e inmutable, donde residen las Formas (o Ideas), como la Belleza o la Justicia, que son los modelos de las cosas físicas.")
        ),
        BilingualQuestion(
            id = 30284, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit '1984' et 'La Ferme des animaux' ?", listOf("George Orwell", "Aldous Huxley", "Margaret Atwood", "Ray Bradbury"), "Philosophie", "George Orwell, de son vrai nom Eric Arthur Blair, est l'auteur de ces deux romans dystopiques et satiriques majeurs du XXe siècle."),
            en = LocalizedContent("Who wrote '1984' and 'Animal Farm'?", listOf("George Orwell", "Aldous Huxley", "Margaret Atwood", "Ray Bradbury"), "Philosophy", "George Orwell, real name Eric Arthur Blair, is the author of these two major dystopian and satirical novels of the 20th century."),
            zh = LocalizedContent("谁写了《1984》和《动物农场》？", listOf("乔治·奥威尔", "奥尔德斯·赫胥黎", "玛格丽特·阿特伍德", "雷·布拉德伯里"), "哲学", "乔治·奥威尔，原名埃里克·阿瑟·布莱尔，是这两部20世纪重要反乌托邦和讽刺小说的作者。"),
            es = LocalizedContent("¿Quién escribió '1984' y 'Rebelión en la granja'?", listOf("George Orwell", "Aldous Huxley", "Margaret Atwood", "Ray Bradbury"), "Filosofía", "George Orwell, nombre real Eric Arthur Blair, es el autor de estas dos importantes novelas distópicas y satíricas del siglo XX.")
        ),
        BilingualQuestion(
            id = 30285, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est la principale préoccupation de l'éthique ?", listOf("Comment vivre une bonne vie", "La nature de la réalité", "Comment la connaissance est acquise", "L'origine de l'univers"), "Philosophie", "L'éthique se concentre sur les principes guidant les actions humaines, et sa question fondamentale est de déterminer ce qui constitue une existence épanouissante et moralement juste."),
            en = LocalizedContent("What is the main concern of ethics?", listOf("How to live a good life", "The nature of reality", "How knowledge is acquired", "The origin of the universe"), "Philosophy", "Ethics focuses on the principles guiding human actions, and its fundamental question is to determine what constitutes a fulfilling and morally right existence."),
            zh = LocalizedContent("伦理学的主要关注点是什么？", listOf("如何过上好生活", "现实的本质", "知识如何获得", "宇宙的起源"), "哲学", "伦理学关注指导人类行为的原则，其基本问题是确定什么构成充实且道德上正确的生活。"),
            es = LocalizedContent("¿Cuál es la principal preocupación de la ética?", listOf("Cómo vivir una buena vida", "La naturaleza de la realidad", "Cómo se adquiere el conocimiento", "El origen del universo"), "Filosofía", "La ética se centra en los principios que guían las acciones humanas, y su pregunta fundamental es determinar qué constituye una existencia plena y moralmente correcta.")
        ),
        BilingualQuestion(
            id = 30286, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur japonais a écrit 'Norwegian Wood' et 'Kafka sur le rivage' ?", listOf("Haruki Murakami", "Yukio Mishima", "Yasunari Kawabata", "Kenzaburo Oe"), "Philosophie", "Haruki Murakami est un écrivain japonais contemporain mondialement reconnu, dont les romans 'Norwegian Wood' (1987) et 'Kafka sur le rivage' (2002) figurent parmi ses œuvres les plus célèbres."),
            en = LocalizedContent("Which Japanese author wrote 'Norwegian Wood' and 'Kafka on the Shore'?", listOf("Haruki Murakami", "Yukio Mishima", "Yasunari Kawabata", "Kenzaburo Oe"), "Philosophy", "Haruki Murakami is a world-renowned contemporary Japanese writer, whose novels 'Norwegian Wood' (1987) and 'Kafka on the Shore' (2002) are among his most famous works."),
            zh = LocalizedContent("哪位日本作家写了《挪威的森林》和《海边的卡夫卡》？", listOf("村上春树", "三岛由纪夫", "川端康成", "大江健三郎"), "哲学", "村上春树是世界知名的日本当代作家，其小说《挪威的森林》（1987年）和《海边的卡夫卡》（2002年）是他最著名的作品之一。"),
            es = LocalizedContent("¿Qué autor japonés escribió 'Tokio blues' (Norwegian Wood) y 'Kafka en la orilla'?", listOf("Haruki Murakami", "Yukio Mishima", "Yasunari Kawabata", "Kenzaburo Oe"), "Filosofía", "Haruki Murakami es un escritor japonés contemporáneo de renombre mundial, cuyas novelas 'Tokio blues' (1987) y 'Kafka en la orilla' (2002) se encuentran entre sus obras más famosas.")
        ),
        BilingualQuestion(
            id = 30287, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Comment le pragmatisme juge-t-il la vérité ?", listOf("Par les conséquences pratiques et l'utilité", "Par la cohérence logique", "Par la correspondance à la réalité", "Par les principes universels"), "Philosophie", "Pour le pragmatisme, une idée est vraie si elle fonctionne dans la pratique et produit des résultats utiles, contrairement aux théories qui la définissent par la correspondance avec la réalité."),
            en = LocalizedContent("How does pragmatism judge truth?", listOf("By practical consequences and usefulness", "By logical coherence", "By correspondence to reality", "By universal principles"), "Philosophy", "For pragmatism, an idea is true if it works in practice and produces useful results, unlike theories that define truth by correspondence with reality."),
            zh = LocalizedContent("实用主义如何判断真理？", listOf("通过实际后果和有用性", "通过逻辑一致性", "通过与现实的对应", "通过普遍原则"), "哲学", "对于实用主义来说，一个观念如果在实践中有效并产生有用结果，它就是真的，这与通过与现实对应来定义真理的理论不同。"),
            es = LocalizedContent("¿Cómo juzga el pragmatismo la verdad?", listOf("Por las consecuencias prácticas y la utilidad", "Por la coherencia lógica", "Por la correspondencia con la realidad", "Por principios universales"), "Filosofía", "Para el pragmatismo, una idea es verdadera si funciona en la práctica y produce resultados útiles, a diferencia de las teorías que la definen por la correspondencia con la realidad.")
        ),
        BilingualQuestion(
            id = 30288, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Le Deuxième Sexe', un texte fondateur du féminisme ?", listOf("Simone de Beauvoir", "Betty Friedan", "Gloria Steinem", "Germaine Greer"), "Philosophie", "Simone de Beauvoir a publié 'Le Deuxième Sexe' en 1949, une analyse existentialiste de la condition féminine qui a posé les bases du féminisme moderne."),
            en = LocalizedContent("Who wrote 'The Second Sex', a foundational text of feminism?", listOf("Simone de Beauvoir", "Betty Friedan", "Gloria Steinem", "Germaine Greer"), "Philosophy", "Simone de Beauvoir published 'The Second Sex' in 1949, an existentialist analysis of the female condition that laid the foundations of modern feminism."),
            zh = LocalizedContent("谁写了《第二性》，一部女权主义的奠基性文本？", listOf("西蒙娜·德·波伏娃", "贝蒂·弗里丹", "格洛丽亚·斯泰纳姆", "杰梅茵·格里尔"), "哲学", "西蒙娜·德·波伏娃于1949年出版了《第二性》，这是一部对女性状况的存在主义分析，奠定了现代女权主义的基础。"),
            es = LocalizedContent("¿Quién escribió 'El segundo sexo', un texto fundacional del feminismo?", listOf("Simone de Beauvoir", "Betty Friedan", "Gloria Steinem", "Germaine Greer"), "Filosofía", "Simone de Beauvoir publicó 'El segundo sexo' en 1949, un análisis existencialista de la condición femenina que sentó las bases del feminismo moderno.")
        ),
        BilingualQuestion(
            id = 30289, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel concept philosophique est attribué à Arthur Schopenhauer ?", listOf("Le monde comme volonté et représentation", "L'impératif catégorique", "La volonté de puissance", "L'être et le néant"), "Philosophie", "Schopenhauer expose sa philosophie dans son œuvre majeure *Le monde comme volonté et représentation*, où il affirme que la volonté est la force fondamentale de la réalité."),
            en = LocalizedContent("Which philosophical concept is attributed to Arthur Schopenhauer?", listOf("The world as will and representation", "The categorical imperative", "The will to power", "Being and nothingness"), "Philosophy", "Schopenhauer expounds his philosophy in his major work *The World as Will and Representation*, where he asserts that will is the fundamental force of reality."),
            zh = LocalizedContent("哪个哲学概念归功于亚瑟·叔本华？", listOf("作为意志和表象的世界", "绝对命令", "权力意志", "存在与虚无"), "哲学", "叔本华在其主要著作《作为意志和表象的世界》中阐述了他的哲学，断言意志是现实的基本力量。"),
            es = LocalizedContent("¿Qué concepto filosófico se atribuye a Arthur Schopenhauer?", listOf("El mundo como voluntad y representación", "El imperativo categórico", "La voluntad de poder", "El ser y la nada"), "Filosofía", "Schopenhauer expone su filosofía en su obra principal *El mundo como voluntad y representación*, donde afirma que la voluntad es la fuerza fundamental de la realidad.")
        ),
        BilingualQuestion(
            id = 30290, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a développé le concept du 'Bon Sauvage' ?", listOf("Jean-Jacques Rousseau", "Thomas Hobbes", "John Locke", "David Hume"), "Philosophie", "Rousseau a développé ce concept dans son Discours sur l'origine et les fondements de l'inégalité parmi les hommes, où il idéalise l'état de nature de l'homme avant la civilisation."),
            en = LocalizedContent("Who developed the concept of the 'Noble Savage'?", listOf("Jean-Jacques Rousseau", "Thomas Hobbes", "John Locke", "David Hume"), "Philosophy", "Rousseau developed this concept in his Discourse on the Origin and Basis of Inequality Among Men, where he idealizes the natural state of man before civilization."),
            zh = LocalizedContent("谁提出了‘高贵的野蛮人’这一概念？", listOf("让-雅克·卢梭", "托马斯·霍布斯", "约翰·洛克", "大卫·休谟"), "哲学", "卢梭在其《论人类不平等的起源和基础》中提出了这一概念，他理想化了文明之前人类的自然状态。"),
            es = LocalizedContent("¿Quién desarrolló el concepto del 'Buen Salvaje'?", listOf("Jean-Jacques Rousseau", "Thomas Hobbes", "John Locke", "David Hume"), "Filosofía", "Rousseau desarrolló este concepto en su Discurso sobre el origen y los fundamentos de la desigualdad entre los hombres, donde idealiza el estado natural del hombre antes de la civilización.")
        ),
        BilingualQuestion(
            id = 30291, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le thème principal du 'Crime et Châtiment' de Fyodor Dostoyevski ?", listOf("Moralité, culpabilité et rédemption", "Révolution sociale", "Amour et trahison", "Folie et santé"), "Philosophie", "Le roman suit Raskolnikov, un étudiant qui assassine une usurière et lutte ensuite avec sa conscience. Dostoyevski explore les conséquences psychologiques du crime et la quête de rédemption morale."),
            en = LocalizedContent("What is the main theme of 'Crime and Punishment' by Fyodor Dostoevsky?", listOf("Morality, guilt and redemption", "Social revolution", "Love and betrayal", "Madness and health"), "Philosophy", "The novel follows Raskolnikov, a student who murders a pawnbroker and then struggles with his conscience. Dostoevsky explores the psychological consequences of crime and the quest for moral redemption."),
            zh = LocalizedContent("陀思妥耶夫斯基的《罪与罚》主要主题是什么？", listOf("道德、罪责与救赎", "社会革命", "爱与背叛", "疯狂与健康"), "哲学", "小说讲述了大学生拉斯柯尔尼科夫谋杀一名当铺老板后与良心斗争的故事。陀思妥耶夫斯基探讨了犯罪的心理后果以及对道德救赎的追求。"),
            es = LocalizedContent("¿Cuál es el tema principal de 'Crimen y castigo' de Fiódor Dostoyevski?", listOf("Moralidad, culpa y redención", "Revolución social", "Amor y traición", "Locura y salud"), "Filosofía", "La novela sigue a Raskólnikov, un estudiante que asesina a una usurera y luego lucha con su conciencia. Dostoyevski explora las consecuencias psicológicas del crimen y la búsqueda de redención moral.")
        ),
        BilingualQuestion(
            id = 30292, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe chinois a souligné l'harmonie avec la nature (Taoïsme) ?", listOf("Laozi", "Confucius", "Sun Tzu", "Mencius"), "Philosophie", "Laozi est le fondateur légendaire du taoïsme et auteur présumé du Tao Te King, texte central qui prône l'harmonie avec le Tao, principe naturel et universel."),
            en = LocalizedContent("Which Chinese philosopher emphasized harmony with nature (Taoism)?", listOf("Laozi", "Confucius", "Sun Tzu", "Mencius"), "Philosophy", "Laozi is the legendary founder of Taoism and the presumed author of the Tao Te Ching, a central text that advocates harmony with the Tao, a natural and universal principle."),
            zh = LocalizedContent("哪位中国哲学家强调与自然和谐相处（道家）？", listOf("老子", "孔子", "孙子", "孟子"), "哲学", "老子是道家的传奇创始人，也是《道德经》的假定作者，这部核心经典倡导与道（自然和宇宙的原则）和谐相处。"),
            es = LocalizedContent("¿Qué filósofo chino enfatizó la armonía con la naturaleza (Taoísmo)?", listOf("Laozi", "Confucio", "Sun Tzu", "Mencius"), "Filosofía", "Laozi es el legendario fundador del taoísmo y el presunto autor del Tao Te King, texto central que aboga por la armonía con el Tao, principio natural y universal.")
        ),
        BilingualQuestion(
            id = 30293, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est l'essence du confucianisme ?", listOf("Harmonie sociale et vertu morale", "Spiritualité et méditation", "Logique et raison", "Liberté individuelle"), "Philosophie", "Le confucianisme, fondé par Confucius, met l'accent sur la cultivation des vertus comme la bienveillance et la piété filiale pour maintenir l'ordre social."),
            en = LocalizedContent("What is the essence of Confucianism?", listOf("Social harmony and moral virtue", "Spirituality and meditation", "Logic and reason", "Individual freedom"), "Philosophy", "Confucianism, founded by Confucius, emphasizes the cultivation of virtues such as benevolence and filial piety to maintain social order."),
            zh = LocalizedContent("儒家的精髓是什么？", listOf("社会和谐与道德美德", "灵性与冥想", "逻辑与理性", "个人自由"), "哲学", "儒家由孔子创立，强调培养仁爱和孝道等美德以维持社会秩序。"),
            es = LocalizedContent("¿Cuál es la esencia del confucianismo?", listOf("Armonía social y virtud moral", "Espiritualidad y meditación", "Lógica y razón", "Libertad individual"), "Filosofía", "El confucianismo, fundado por Confucio, enfatiza el cultivo de virtudes como la benevolencia y la piedad filial para mantener el orden social.")
        ),
        BilingualQuestion(
            id = 30294, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe et activiste africain a écrit 'Peaux noires, masques blancs' ?", listOf("Frantz Fanon", "Kwame Anthony Appiah", "Achille Mbembe", "Sylvia Wynter"), "Philosophie", "Frantz Fanon, psychiatre et penseur martiniquais, a publié cet essai fondateur en 1952 sur la psychologie du colonialisme et la déshumanisation des Noirs."),
            en = LocalizedContent("Which African philosopher and activist wrote 'Black Skin, White Masks'?", listOf("Frantz Fanon", "Kwame Anthony Appiah", "Achille Mbembe", "Sylvia Wynter"), "Philosophy", "Frantz Fanon, a Martinican psychiatrist and thinker, published this foundational essay in 1952 on the psychology of colonialism and the dehumanization of Black people."),
            zh = LocalizedContent("哪位非洲哲学家和活动家写了《黑皮肤，白面具》？", listOf("弗朗茨·法农", "夸梅·安东尼·阿皮亚", "阿希尔·姆贝姆贝", "西尔维亚·温特"), "哲学", "弗朗茨·法农，马提尼克精神病学家和思想家，于1952年发表了这篇关于殖民主义心理学和黑人非人化的开创性文章。"),
            es = LocalizedContent("¿Qué filósofo y activista africano escribió 'Piel negra, máscaras blancas'?", listOf("Frantz Fanon", "Kwame Anthony Appiah", "Achille Mbembe", "Sylvia Wynter"), "Filosofía", "Frantz Fanon, psiquiatra y pensador martiniqués, publicó este ensayo fundacional en 1952 sobre la psicología del colonialismo y la deshumanización de los negros.")
        ),
        BilingualQuestion(
            id = 30295, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le thème central du réalisme magique de Gabriel García Márquez ?", listOf("Fusion de la fantaisie avec la réalité quotidienne", "Surréalisme et rêves", "Réalisme pur", "Absurdisme"), "Philosophie", "Dans ses œuvres comme Cent ans de solitude, García Márquez mêle événements surnaturels et détails banals pour refléter la vision du monde latino-américaine, où le merveilleux fait partie du quotidien."),
            en = LocalizedContent("What is the central theme of Gabriel García Márquez's magical realism?", listOf("Fusion of fantasy with everyday reality", "Surrealism and dreams", "Pure realism", "Absurdism"), "Philosophy", "In works like One Hundred Years of Solitude, García Márquez blends supernatural events with mundane details to reflect the Latin American worldview, where the marvelous is part of daily life."),
            zh = LocalizedContent("加夫列尔·加西亚·马尔克斯魔幻现实主义的中心主题是什么？", listOf("幻想与日常现实的融合", "超现实主义和梦境", "纯粹的现实主义", "荒诞主义"), "哲学", "在《百年孤独》等作品中，加西亚·马尔克斯将超自然事件与平凡细节融合，以反映拉丁美洲的世界观，其中神奇是日常生活的一部分。"),
            es = LocalizedContent("¿Cuál es el tema central del realismo mágico de Gabriel García Márquez?", listOf("Fusión de la fantasía con la realidad cotidiana", "Surrealismo y sueños", "Realismo puro", "Absurdismo"), "Filosofía", "En obras como Cien años de soledad, García Márquez mezcla eventos sobrenaturales con detalles mundanos para reflejar la cosmovisión latinoamericana, donde lo maravilloso es parte de la vida diaria.")
        ),
        BilingualQuestion(
            id = 30296, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel auteur latino-américain a écrit 'Fictions' avec des labyrinthes et espaces infinis ?", listOf("Jorge Luis Borges", "Pablo Neruda", "Octavio Paz", "Julio Cortázar"), "Philosophie", "Jorge Luis Borges, écrivain argentin, a publié Fictions en 1944, un recueil de nouvelles explorant des thèmes comme les labyrinthes et les espaces infinis."),
            en = LocalizedContent("Which Latin American author wrote 'Ficciones' with labyrinths and infinite spaces?", listOf("Jorge Luis Borges", "Pablo Neruda", "Octavio Paz", "Julio Cortázar"), "Philosophy", "Jorge Luis Borges, Argentine writer, published Ficciones in 1944, a collection of short stories exploring themes such as labyrinths and infinite spaces."),
            zh = LocalizedContent("哪位拉丁美洲作家写了包含迷宫和无限空间的《虚构集》？", listOf("豪尔赫·路易斯·博尔赫斯", "巴勃罗·聂鲁达", "奥克塔维奥·帕斯", "胡利奥·科塔萨尔"), "哲学", "阿根廷作家豪尔赫·路易斯·博尔赫斯于1944年出版了《虚构集》，这是一部探索迷宫和无限空间等主题的短篇小说集。"),
            es = LocalizedContent("¿Qué autor latinoamericano escribió 'Ficciones' con laberintos y espacios infinitos?", listOf("Jorge Luis Borges", "Pablo Neruda", "Octavio Paz", "Julio Cortázar"), "Filosofía", "Jorge Luis Borges, escritor argentino, publicó Ficciones en 1944, una colección de cuentos que exploran temas como los laberintos y los espacios infinitos.")
        ),
        BilingualQuestion(
            id = 30297, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel mouvement philosophique Michel Foucault a-t-il pionnier ?", listOf("Post-structuralisme", "Existentialisme", "Phénoménologie", "Pragmatisme"), "Philosophie", "Michel Foucault est considéré comme une figure majeure du post-structuralisme, un courant critique des structures fixes de la pensée, qu'il a développé à travers ses analyses du pouvoir, du savoir et des institutions."),
            en = LocalizedContent("Which philosophical movement did Michel Foucault pioneer?", listOf("Post-structuralism", "Existentialism", "Phenomenology", "Pragmatism"), "Philosophy", "Michel Foucault is considered a major figure of post-structuralism, a critical current of fixed structures of thought, which he developed through his analyses of power, knowledge, and institutions."),
            zh = LocalizedContent("米歇尔·福柯开创了哪个哲学运动？", listOf("后结构主义", "存在主义", "现象学", "实用主义"), "哲学", "米歇尔·福柯被认为是后结构主义的主要人物，这是一种对固定思维结构的批判潮流，他通过对权力、知识和制度的分析发展了这一思想。"),
            es = LocalizedContent("¿Qué movimiento filosófico fue pionero Michel Foucault?", listOf("Post-estructuralismo", "Existencialismo", "Fenomenología", "Pragmatismo"), "Filosofía", "Michel Foucault es considerado una figura importante del post-estructuralismo, una corriente crítica de las estructuras fijas del pensamiento, que desarrolló a través de sus análisis del poder, el saber y las instituciones.")
        ),
        BilingualQuestion(
            id = 30298, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a écrit l'épopée africaine 'Soundjata', un texte fondateur de la littérature ouest-africaine ?", listOf("Auteur inconnu (tradition orale)", "Ahmadou Kourouma", "Chinua Achebe", "Wole Soyinka"), "Philosophie", "Soundjata est une épopée transmise oralement par les griots mandingues depuis le XIIIe siècle, sans auteur unique identifié."),
            en = LocalizedContent("Who wrote the African epic 'Sundiata', a foundational text of West African literature?", listOf("Unknown author (oral tradition)", "Ahmadou Kourouma", "Chinua Achebe", "Wole Soyinka"), "Philosophy", "Sundiata is an epic transmitted orally by Mandinka griots since the 13th century, with no single identified author."),
            zh = LocalizedContent("谁写了非洲史诗《松迪亚塔》，这部西非文学的基础文本？", listOf("作者不详（口头传统）", "阿马杜·库鲁马", "钦努阿·阿契贝", "沃莱·索因卡"), "哲学", "《松迪亚塔》是一部自13世纪以来由曼丁哥族格里奥口头传承的史诗，没有确定的单一作者。"),
            es = LocalizedContent("¿Quién escribió la epopeya africana 'Sundiata', un texto fundacional de la literatura de África Occidental?", listOf("Autor desconocido (tradición oral)", "Ahmadou Kourouma", "Chinua Achebe", "Wole Soyinka"), "Filosofía", "Sundiata es una epopeya transmitida oralmente por los griots mandingas desde el siglo XIII, sin un autor único identificado.")
        ),
        BilingualQuestion(
            id = 30299, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le concept central du 'rhizome' de Gilles Deleuze ?", listOf("Systèmes non hiérarchiques et interconnectés", "Structures arborescentes", "Progression linéaire", "Logique circulaire"), "Philosophie", "Deleuze et Guattari opposent le rhizome, modèle de réseau sans centre ni hiérarchie, à la pensée arborescente et hiérarchique traditionnelle."),
            en = LocalizedContent("What is the central concept of Gilles Deleuze's 'rhizome'?", listOf("Non-hierarchical and interconnected systems", "Arborescent structures", "Linear progression", "Circular logic"), "Philosophy", "Deleuze and Guattari oppose the rhizome, a network model without center or hierarchy, to traditional arborescent and hierarchical thought."),
            zh = LocalizedContent("吉尔·德勒兹的‘块茎’概念核心是什么？", listOf("非等级制和相互连接的系统", "树状结构", "线性进展", "循环逻辑"), "哲学", "德勒兹和加塔利将块茎（一种无中心、无等级的网络模型）与传统树状和等级制思维相对立。"),
            es = LocalizedContent("¿Cuál es el concepto central del 'rizoma' de Gilles Deleuze?", listOf("Sistemas no jerárquicos e interconectados", "Estructuras arborescentes", "Progresión lineal", "Lógica circular"), "Filosofía", "Deleuze y Guattari oponen el rizoma, un modelo de red sin centro ni jerarquía, al pensamiento arborescente y jerárquico tradicional.")
        ),
        BilingualQuestion(
            id = 30300, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel auteur d'Asie du Sud-Est a remporté le Prix Nobel de littérature et a écrit sur l'identité et le colonialisme ?", listOf("Aung San Suu Kyi", "Pramoedya Ananta Toer", "José Saramago", "Orhan Pamuk"), "Philosophie", "Pramoedya Ananta Toer, auteur indonésien, a été emprisonné pour ses écrits critiques envers le colonialisme néerlandais et le régime de Suharto, et son œuvre phare, le Quatuor de Buru, explore l'identité indonésienne sous l'oppression coloniale."),
            en = LocalizedContent("Which Southeast Asian author won the Nobel Prize in Literature and wrote about identity and colonialism?", listOf("Aung San Suu Kyi", "Pramoedya Ananta Toer", "José Saramago", "Orhan Pamuk"), "Philosophy", "Pramoedya Ananta Toer, an Indonesian author, was imprisoned for his writings critical of Dutch colonialism and the Suharto regime, and his magnum opus, the Buru Quartet, explores Indonesian identity under colonial oppression."),
            zh = LocalizedContent("哪位东南亚作家获得了诺贝尔文学奖，并撰写了关于身份认同和殖民主义的作品？", listOf("昂山素季", "普拉姆迪亚·阿南达·杜尔", "若泽·萨拉马戈", "奥尔罕·帕慕克"), "哲学", "普拉姆迪亚·阿南达·杜尔，印度尼西亚作家，因批评荷兰殖民主义和苏哈托政权而被监禁，其代表作《布鲁四部曲》探讨了殖民压迫下的印度尼西亚身份认同。"),
            es = LocalizedContent("¿Qué autor del Sudeste Asiático ganó el Premio Nobel de Literatura y escribió sobre la identidad y el colonialismo?", listOf("Aung San Suu Kyi", "Pramoedya Ananta Toer", "José Saramago", "Orhan Pamuk"), "Filosofía", "Pramoedya Ananta Toer, autor indonesio, fue encarcelado por sus escritos críticos con el colonialismo neerlandés y el régimen de Suharto, y su obra cumbre, el Cuarteto de Buru, explora la identidad indonesia bajo la opresión colonial.")
        ),
        BilingualQuestion(
            id = 50001, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel footballeur a remporté le Ballon d'Or 2023?", listOf("Erling Haaland", "Vinicius Junior", "Lionel Messi", "Kylian Mbappé"), "Sport", "Le Ballon d'Or 2023 a été remporté par Lionel Messi, et non Vinicius Junior. Le Brésilien a terminé à la sixième place du classement."),
            en = LocalizedContent("Which footballer won the 2023 Ballon d'Or?", listOf("Erling Haaland", "Vinicius Junior", "Lionel Messi", "Kylian Mbappé"), "Sports", "The 2023 Ballon d'Or was won by Lionel Messi, not Vinicius Junior. The Brazilian finished sixth in the rankings."),
            zh = LocalizedContent("哪位足球运动员赢得了2023年金球奖？", listOf("埃尔林·哈兰德", "维尼修斯·儒尼奥尔", "利昂内尔·梅西", "基利安·姆巴佩"), "体育", "2023年金球奖由利昂内尔·梅西获得，而非维尼修斯·儒尼奥尔。这位巴西球员最终排名第六。"),
            es = LocalizedContent("¿Qué futbolista ganó el Balón de Oro 2023?", listOf("Erling Haaland", "Vinicius Junior", "Lionel Messi", "Kylian Mbappé"), "Deportes", "El Balón de Oro 2023 fue ganado por Lionel Messi, no por Vinicius Junior. El brasileño terminó en sexto lugar en la clasificación.")
        ),
        BilingualQuestion(
            id = 50002, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel année le film Titanic est-il sorti?", listOf("1996", "1997", "1998", "1999"), "Cinéma", "Le film Titanic, réalisé par James Cameron, est sorti en 1997 et est devenu un immense succès mondial, remportant 11 Oscars."),
            en = LocalizedContent("In which year was the film Titanic released?", listOf("1996", "1997", "1998", "1999"), "Cinema", "The film Titanic, directed by James Cameron, was released in 1997 and became a huge global success, winning 11 Oscars."),
            zh = LocalizedContent("电影《泰坦尼克号》在哪一年上映？", listOf("1996", "1997", "1998", "1999"), "电影", "由詹姆斯·卡梅隆执导的电影《泰坦尼克号》于1997年上映，取得了巨大的全球成功，并获得了11项奥斯卡奖。"),
            es = LocalizedContent("¿En qué año se estrenó la película Titanic?", listOf("1996", "1997", "1998", "1999"), "Cine", "La película Titanic, dirigida por James Cameron, se estrenó en 1997 y se convirtió en un gran éxito mundial, ganando 11 premios Oscar.")
        ),
        BilingualQuestion(
            id = 50003, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel rappeur français a créé l'album 'Doré'?", listOf("Booba", "Gims", "Damso", "Sadek"), "Musique", "Damso, rappeur belgo-congolais, a sorti l'album 'Doré' en 2018. Cet opus a été certifié disque de diamant en France."),
            en = LocalizedContent("Which French rapper created the album 'Doré'?", listOf("Booba", "Gims", "Damso", "Sadek"), "Music", "Damso, a Belgian-Congolese rapper, released the album 'Doré' in 2018. This album was certified diamond in France."),
            zh = LocalizedContent("哪位法国说唱歌手创作了专辑《Doré》？", listOf("布巴", "吉姆斯", "达姆索", "萨德克"), "音乐", "达姆索，比利时-刚果说唱歌手，于2018年发行了专辑《Doré》。这张专辑在法国获得了钻石唱片认证。"),
            es = LocalizedContent("¿Qué rapero francés creó el álbum 'Doré'?", listOf("Booba", "Gims", "Damso", "Sadek"), "Música", "Damso, rapero belgo-congoleño, lanzó el álbum 'Doré' en 2018. Este álbum fue certificado disco de diamante en Francia.")
        ),
        BilingualQuestion(
            id = 50004, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Bastille a-t-elle été prise?", listOf("1788", "1789", "1790", "1791"), "Histoire", "La prise de la Bastille, le 14 juillet 1789, est un événement majeur de la Révolution française, symbolisant la chute de l'absolutisme royal."),
            en = LocalizedContent("In which year was the Bastille taken?", listOf("1788", "1789", "1790", "1791"), "History", "The storming of the Bastille on July 14, 1789, is a major event of the French Revolution, symbolizing the fall of royal absolutism."),
            zh = LocalizedContent("巴士底狱在哪一年被攻占？", listOf("1788", "1789", "1790", "1791"), "历史", "1789年7月14日攻占巴士底狱是法国大革命的重要事件，象征着君主专制的垮台。"),
            es = LocalizedContent("¿En qué año fue tomada la Bastilla?", listOf("1788", "1789", "1790", "1791"), "Historia", "La toma de la Bastilla el 14 de julio de 1789 es un evento importante de la Revolución Francesa, que simboliza la caída del absolutismo real.")
        ),
        BilingualQuestion(
            id = 50005, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand organe du corps humain?", listOf("Le cœur", "Le cerveau", "La peau", "Le foie"), "Science", "La peau est considérée comme le plus grand organe car elle recouvre l'ensemble du corps et pèse environ 4 à 5 kg chez un adulte."),
            en = LocalizedContent("What is the largest organ of the human body?", listOf("The heart", "The brain", "The skin", "The liver"), "Science", "The skin is considered the largest organ as it covers the entire body and weighs about 4 to 5 kg in an adult."),
            zh = LocalizedContent("人体最大的器官是什么？", listOf("心脏", "大脑", "皮肤", "肝脏"), "科学", "皮肤被认为是最大的器官，因为它覆盖全身，成年人的皮肤重约4到5公斤。"),
            es = LocalizedContent("¿Cuál es el órgano más grande del cuerpo humano?", listOf("El corazón", "El cerebro", "La piel", "El hígado"), "Ciencia", "La piel se considera el órgano más grande porque cubre todo el cuerpo y pesa aproximadamente de 4 a 5 kg en un adulto.")
        ),
        BilingualQuestion(
            id = 50006, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Thaïlande?", listOf("Phuket", "Bangkok", "Chiang Mai", "Pattaya"), "Géographie", "Bangkok est la capitale et la ville la plus peuplée de Thaïlande, située dans le centre du pays sur le delta du fleuve Chao Phraya."),
            en = LocalizedContent("What is the capital of Thailand?", listOf("Phuket", "Bangkok", "Chiang Mai", "Pattaya"), "Geography", "Bangkok is the capital and most populous city of Thailand, located in the central part of the country on the Chao Phraya River delta."),
            zh = LocalizedContent("泰国的首都是哪里？", listOf("普吉岛", "曼谷", "清迈", "芭堤雅"), "地理", "曼谷是泰国的首都和人口最多的城市，位于该国中部湄南河三角洲。"),
            es = LocalizedContent("¿Cuál es la capital de Tailandia?", listOf("Phuket", "Bangkok", "Chiang Mai", "Pattaya"), "Geografía", "Bangkok es la capital y la ciudad más poblada de Tailandia, ubicada en la parte central del país en el delta del río Chao Phraya.")
        ),
        BilingualQuestion(
            id = 50007, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de cordes a une guitare classique?", listOf("5", "6", "7", "8"), "Culture", "La guitare classique, comme la plupart des guitares acoustiques et électriques standard, possède six cordes accordées généralement en mi, la, ré, sol, si, mi."),
            en = LocalizedContent("How many strings does a classical guitar have?", listOf("5", "6", "7", "8"), "Culture", "The classical guitar, like most standard acoustic and electric guitars, has six strings usually tuned to E, A, D, G, B, E."),
            zh = LocalizedContent("古典吉他有多少根弦？", listOf("5", "6", "7", "8"), "文化", "古典吉他与大多数标准原声吉他和电吉他一样，有六根弦，通常调音为E、A、D、G、B、E。"),
            es = LocalizedContent("¿Cuántas cuerdas tiene una guitarra clásica?", listOf("5", "6", "7", "8"), "Cultura", "La guitarra clásica, como la mayoría de las guitarras acústicas y eléctricas estándar, tiene seis cuerdas generalmente afinadas en mi, la, re, sol, si, mi.")
        ),
        BilingualQuestion(
            id = 50008, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Novak Djokovic a-t-il remporté son premier Grand Slam?", listOf("2008", "2009", "2010", "2011"), "Sport", "Novak Djokovic a remporté son premier titre du Grand Chelem à l'Open d'Australie en 2008, en battant Jo-Wilfried Tsonga en finale."),
            en = LocalizedContent("In which year did Novak Djokovic win his first Grand Slam?", listOf("2008", "2009", "2010", "2011"), "Sports", "Novak Djokovic won his first Grand Slam title at the Australian Open in 2008, defeating Jo-Wilfried Tsonga in the final."),
            zh = LocalizedContent("诺瓦克·德约科维奇在哪一年赢得了他的第一个大满贯？", listOf("2008", "2009", "2010", "2011"), "体育", "诺瓦克·德约科维奇在2008年澳大利亚网球公开赛上赢得了他的第一个大满贯冠军，决赛中击败了若-威尔弗里德·特松加。"),
            es = LocalizedContent("¿En qué año ganó Novak Djokovic su primer Grand Slam?", listOf("2008", "2009", "2010", "2011"), "Deportes", "Novak Djokovic ganó su primer título de Grand Slam en el Abierto de Australia en 2008, derrotando a Jo-Wilfried Tsonga en la final.")
        ),
        BilingualQuestion(
            id = 50009, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue le rôle principal dans 'Oppenheimer' (2023)?", listOf("Cillian Murphy", "Robert Downey Jr.", "Tom Hardy", "Oscar Isaac"), "Cinéma", "Cillian Murphy incarne J. Robert Oppenheimer dans le film biographique de Christopher Nolan, sorti en 2023."),
            en = LocalizedContent("Which actor plays the lead role in 'Oppenheimer' (2023)?", listOf("Cillian Murphy", "Robert Downey Jr.", "Tom Hardy", "Oscar Isaac"), "Cinema", "Cillian Murphy portrays J. Robert Oppenheimer in Christopher Nolan's biographical film, released in 2023."),
            zh = LocalizedContent("哪位演员在《奥本海默》（2023）中扮演主角？", listOf("基里安·墨菲", "小罗伯特·唐尼", "汤姆·哈迪", "奥斯卡·伊萨克"), "电影", "基里安·墨菲在克里斯托弗·诺兰于2023年上映的传记电影中饰演J·罗伯特·奥本海默。"),
            es = LocalizedContent("¿Qué actor interpreta el papel principal en 'Oppenheimer' (2023)?", listOf("Cillian Murphy", "Robert Downey Jr.", "Tom Hardy", "Oscar Isaac"), "Cine", "Cillian Murphy interpreta a J. Robert Oppenheimer en la película biográfica de Christopher Nolan, estrenada en 2023.")
        ),
        BilingualQuestion(
            id = 50010, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a enregistré 'Bohemian Rhapsody'?", listOf("The Beatles", "Queen", "David Bowie", "Pink Floyd"), "Musique", "Queen a sorti Bohemian Rhapsody en 1975 sur l'album A Night at the Opera, et la chanson est devenue l'un des plus grands succès du groupe."),
            en = LocalizedContent("Which band recorded 'Bohemian Rhapsody'?", listOf("The Beatles", "Queen", "David Bowie", "Pink Floyd"), "Music", "Queen released Bohemian Rhapsody in 1975 on the album A Night at the Opera, and the song became one of the band's greatest hits."),
            zh = LocalizedContent("哪个乐队录制了《波西米亚狂想曲》？", listOf("披头士", "皇后乐队", "大卫·鲍伊", "平克·弗洛伊德"), "音乐", "皇后乐队于1975年在专辑《A Night at the Opera》中发行了《波西米亚狂想曲》，这首歌成为乐队最成功的作品之一。"),
            es = LocalizedContent("¿Qué grupo grabó 'Bohemian Rhapsody'?", listOf("The Beatles", "Queen", "David Bowie", "Pink Floyd"), "Musica", "Queen lanzó Bohemian Rhapsody en 1975 en el álbum A Night at the Opera, y la canción se convirtió en uno de los mayores éxitos del grupo.")
        ),
        BilingualQuestion(
            id = 50011, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le premier président des États-Unis?", listOf("Thomas Jefferson", "George Washington", "Abraham Lincoln", "Benjamin Franklin"), "Histoire", "George Washington fut le commandant en chef de l'armée continentale pendant la guerre d'indépendance et présida la Convention constitutionnelle, ce qui le plaça naturellement comme premier président en 1789."),
            en = LocalizedContent("Who was the first president of the United States?", listOf("Thomas Jefferson", "George Washington", "Abraham Lincoln", "Benjamin Franklin"), "History", "George Washington was the commander-in-chief of the Continental Army during the Revolutionary War and presided over the Constitutional Convention, which naturally led to his becoming the first president in 1789."),
            zh = LocalizedContent("谁是美国第一任总统？", listOf("托马斯·杰斐逊", "乔治·华盛顿", "亚伯拉罕·林肯", "本杰明·富兰克林"), "历史", "乔治·华盛顿在独立战争期间担任大陆军总司令，并主持了制宪会议，这使他自然成为1789年的第一任总统。"),
            es = LocalizedContent("¿Quién fue el primer presidente de los Estados Unidos?", listOf("Thomas Jefferson", "George Washington", "Abraham Lincoln", "Benjamin Franklin"), "Historia", "George Washington fue el comandante en jefe del Ejército Continental durante la Guerra de Independencia y presidió la Convención Constitucional, lo que lo llevó naturalmente a ser el primer presidente en 1789.")
        ),
        BilingualQuestion(
            id = 50012, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le gaz le plus abondant dans l'atmosphère terrestre?", listOf("Oxygène", "Azote", "Dioxyde de carbone", "Hydrogène"), "Science", "L'azote représente environ 78 % de l'atmosphère terrestre, suivi de l'oxygène (21 %). Il est principalement produit par l'activité volcanique et les processus biologiques."),
            en = LocalizedContent("What is the most abundant gas in Earth's atmosphere?", listOf("Oxygen", "Nitrogen", "Carbon dioxide", "Hydrogen"), "Science", "Nitrogen makes up about 78% of Earth's atmosphere, followed by oxygen (21%). It is primarily produced by volcanic activity and biological processes."),
            zh = LocalizedContent("地球大气中最丰富的气体是什么？", listOf("氧气", "氮气", "二氧化碳", "氢气"), "科学", "氮气约占地球大气的78%，其次是氧气（21%）。它主要由火山活动和生物过程产生。"),
            es = LocalizedContent("¿Cuál es el gas más abundante en la atmósfera terrestre?", listOf("Oxígeno", "Nitrógeno", "Dióxido de carbono", "Hidrógeno"), "Ciencia", "El nitrógeno constituye aproximadamente el 78% de la atmósfera terrestre, seguido del oxígeno (21%). Se produce principalmente por actividad volcánica y procesos biológicos.")
        ),
        BilingualQuestion(
            id = 50013, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet du monde?", listOf("K2", "Mont Blanc", "Everest", "Kilimandaro"), "Géographie", "L'Everest culmine à 8 848 mètres d'altitude dans l'Himalaya, à la frontière entre le Népal et le Tibet. Il a été nommé d'après le géomètre britannique George Everest."),
            en = LocalizedContent("What is the highest mountain in the world?", listOf("K2", "Mont Blanc", "Everest", "Kilimanjaro"), "Geography", "Mount Everest rises to 8,848 meters in the Himalayas, on the border between Nepal and Tibet. It was named after the British surveyor George Everest."),
            zh = LocalizedContent("世界上最高的山峰是什么？", listOf("K2", "勃朗峰", "珠穆朗玛峰", "乞力马扎罗山"), "地理", "珠穆朗玛峰海拔8848米，位于喜马拉雅山脉，尼泊尔和西藏交界处。它以英国测量师乔治·额菲尔士命名。"),
            es = LocalizedContent("¿Cuál es la montaña más alta del mundo?", listOf("K2", "Mont Blanc", "Everest", "Kilimanjaro"), "Geografia", "El Everest se eleva a 8,848 metros en el Himalaya, en la frontera entre Nepal y el Tíbet. Fue nombrado en honor al topógrafo británico George Everest.")
        ),
        BilingualQuestion(
            id = 50014, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de la Thaïlande?", listOf("Pad Thaï", "Curry", "Tom Yum", "Satay"), "Culture", "Le Pad Thaï est considéré comme le plat national thaïlandais car il incarne l'équilibre des saveurs sucrées, acides, salées et épicées de la cuisine du pays."),
            en = LocalizedContent("What is the national dish of Thailand?", listOf("Pad Thai", "Curry", "Tom Yum", "Satay"), "Culture", "Pad Thai is considered the national dish of Thailand because it embodies the balance of sweet, sour, salty, and spicy flavors in the country's cuisine."),
            zh = LocalizedContent("泰国的国菜是什么？", listOf("泰式炒河粉", "咖喱", "冬阴功", "沙爹"), "文化", "泰式炒河粉被认为是泰国的国菜，因为它体现了该国菜肴中甜、酸、咸、辣风味的平衡。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Tailandia?", listOf("Pad Thai", "Curry", "Tom Yum", "Satay"), "Cultura", "El Pad Thai es considerado el plato nacional tailandés porque encarna el equilibrio de sabores dulces, ácidos, salados y picantes de la cocina del país.")
        ),
        BilingualQuestion(
            id = 50015, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs composent une équipe de basketball sur le terrain?", listOf("4", "5", "6", "7"), "Sport", "Au basketball, chaque équipe aligne cinq joueurs sur le terrain simultanément, conformément aux règles officielles de la FIBA et de la NBA."),
            en = LocalizedContent("How many players make up a basketball team on the court?", listOf("4", "5", "6", "7"), "Sports", "In basketball, each team fields five players on the court simultaneously, according to the official rules of FIBA and the NBA."),
            zh = LocalizedContent("一支篮球队在场上由多少名球员组成？", listOf("4", "5", "6", "7"), "体育", "在篮球比赛中，根据国际篮联和NBA的官方规则，每队同时有五名球员在场上。"),
            es = LocalizedContent("¿Cuántos jugadores componen un equipo de baloncesto en la cancha?", listOf("4", "5", "6", "7"), "Deportes", "En baloncesto, cada equipo alinea cinco jugadores en la cancha simultáneamente, según las reglas oficiales de la FIBA y la NBA.")
        ),
        BilingualQuestion(
            id = 50016, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a dirigé 'The Dark Knight' (2008)?", listOf("Zack Snyder", "Christopher Nolan", "Joss Whedon", "David Fincher"), "Cinéma", "Christopher Nolan a réalisé 'The Dark Knight' en 2008, deuxième volet de sa trilogie Batman, acclamé pour son scénario et la performance de Heath Ledger en Joker."),
            en = LocalizedContent("Which director directed 'The Dark Knight' (2008)?", listOf("Zack Snyder", "Christopher Nolan", "Joss Whedon", "David Fincher"), "Cinema", "Christopher Nolan directed 'The Dark Knight' in 2008, the second installment of his Batman trilogy, acclaimed for its screenplay and Heath Ledger's performance as the Joker."),
            zh = LocalizedContent("哪位导演执导了《黑暗骑士》（2008年）？", listOf("扎克·施奈德", "克里斯托弗·诺兰", "乔斯·韦登", "大卫·芬奇"), "电影", "克里斯托弗·诺兰于2008年执导了《黑暗骑士》，这是他蝙蝠侠三部曲的第二部，因其剧本和希斯·莱杰饰演的小丑而备受赞誉。"),
            es = LocalizedContent("¿Qué director dirigió 'The Dark Knight' (2008)?", listOf("Zack Snyder", "Christopher Nolan", "Joss Whedon", "David Fincher"), "Cine", "Christopher Nolan dirigió 'The Dark Knight' en 2008, la segunda entrega de su trilogía de Batman, aclamada por su guion y la actuación de Heath Ledger como el Joker.")
        ),
        BilingualQuestion(
            id = 50017, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel rappeur a sorti l'album '808s & Heartbreak'?", listOf("Jay-Z", "Eminem", "Kanye West", "Nicki Minaj"), "Musique", "Kanye West a sorti l'album '808s & Heartbreak' en 2008, marquant un tournant dans sa carrière avec un style plus électronique et introspectif."),
            en = LocalizedContent("Which rapper released the album '808s & Heartbreak'?", listOf("Jay-Z", "Eminem", "Kanye West", "Nicki Minaj"), "Music", "Kanye West released the album '808s & Heartbreak' in 2008, marking a turning point in his career with a more electronic and introspective style."),
            zh = LocalizedContent("哪位说唱歌手发行了专辑《808s & Heartbreak》？", listOf("Jay-Z", "埃米纳姆", "坎耶·韦斯特", "妮琪·米娜"), "音乐", "坎耶·韦斯特于2008年发行了专辑《808s & Heartbreak》，标志着他职业生涯的转折点，风格更加电子化和内省。"),
            es = LocalizedContent("¿Qué rapero lanzó el álbum '808s & Heartbreak'?", listOf("Jay-Z", "Eminem", "Kanye West", "Nicki Minaj"), "Musica", "Kanye West lanzó el álbum '808s & Heartbreak' en 2008, marcando un punto de inflexión en su carrera con un estilo más electrónico e introspectivo.")
        ),
        BilingualQuestion(
            id = 50018, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'URSS s'est-elle effondrée?", listOf("1989", "1990", "1991", "1992"), "Histoire", "L'URSS s'est officiellement dissoute le 26 décembre 1991, après la démission de Mikhaïl Gorbatchev et la déclaration d'indépendance de plusieurs républiques."),
            en = LocalizedContent("In which year did the USSR collapse?", listOf("1989", "1990", "1991", "1992"), "History", "The USSR officially dissolved on December 26, 1991, following the resignation of Mikhail Gorbachev and the declaration of independence by several republics."),
            zh = LocalizedContent("苏联在哪一年解体？", listOf("1989", "1990", "1991", "1992"), "历史", "苏联于1991年12月26日正式解体，此前米哈伊尔·戈尔巴乔夫辞职，多个共和国宣布独立。"),
            es = LocalizedContent("¿En qué año colapsó la URSS?", listOf("1989", "1990", "1991", "1992"), "Historia", "La URSS se disolvió oficialmente el 26 de diciembre de 1991, tras la dimisión de Mijaíl Gorbachov y la declaración de independencia de varias repúblicas.")
        ),
        BilingualQuestion(
            id = 50019, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel physicien a développé la théorie de la relativité?", listOf("Isaac Newton", "Albert Einstein", "Stephen Hawking", "Niels Bohr"), "Science", "Albert Einstein a publié la théorie de la relativité restreinte en 1905 et la relativité générale en 1915, révolutionnant la compréhension de l'espace, du temps et de la gravitation."),
            en = LocalizedContent("Which physicist developed the theory of relativity?", listOf("Isaac Newton", "Albert Einstein", "Stephen Hawking", "Niels Bohr"), "Science", "Albert Einstein published the special theory of relativity in 1905 and the general theory of relativity in 1915, revolutionizing the understanding of space, time, and gravitation."),
            zh = LocalizedContent("哪位物理学家发展了相对论？", listOf("艾萨克·牛顿", "阿尔伯特·爱因斯坦", "斯蒂芬·霍金", "尼尔斯·玻尔"), "科学", "阿尔伯特·爱因斯坦于1905年发表了狭义相对论，1915年发表了广义相对论，彻底改变了对空间、时间和引力的理解。"),
            es = LocalizedContent("¿Qué físico desarrolló la teoría de la relatividad?", listOf("Isaac Newton", "Albert Einstein", "Stephen Hawking", "Niels Bohr"), "Ciencia", "Albert Einstein publicó la teoría de la relatividad especial en 1905 y la teoría de la relatividad general en 1915, revolucionando la comprensión del espacio, el tiempo y la gravitación.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50020, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve est le plus long d'Europe?", listOf("Danube", "Rhin", "Volga", "Loire"), "Géographie", "La Volga, longue de 3 530 km, traverse la Russie pour se jeter dans la mer Caspienne, ce qui en fait le plus long fleuve d'Europe."),
            en = LocalizedContent("Which river is the longest in Europe?", listOf("Danube", "Rhine", "Volga", "Loire"), "Geography", "The Volga, 3,530 km long, flows through Russia into the Caspian Sea, making it the longest river in Europe."),
            zh = LocalizedContent("欧洲最长的河流是哪条？", listOf("多瑙河", "莱茵河", "伏尔加河", "卢瓦尔河"), "地理", "伏尔加河全长3530公里，流经俄罗斯注入里海，是欧洲最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo de Europa?", listOf("Danubio", "Rin", "Volga", "Loira"), "Geografia", "El Volga, con 3.530 km de longitud, atraviesa Rusia y desemboca en el mar Caspio, siendo el río más largo de Europa.")
        ),
        BilingualQuestion(
            id = 50021, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le Louvre a-t-il ouvert ses portes au public?", listOf("1789", "1793", "1801", "1802"), "Culture", "Le musée du Louvre a ouvert ses portes au public le 10 août 1793, pendant la Révolution française, afin de rendre accessibles les collections royales."),
            en = LocalizedContent("In which year did the Louvre open its doors to the public?", listOf("1789", "1793", "1801", "1802"), "Culture", "The Louvre Museum opened to the public on August 10, 1793, during the French Revolution, to make the royal collections accessible."),
            zh = LocalizedContent("卢浮宫在哪一年向公众开放？", listOf("1789", "1793", "1801", "1802"), "文化", "卢浮宫于1793年8月10日法国大革命期间向公众开放，以便让皇家收藏得以公开展示。"),
            es = LocalizedContent("¿En qué año abrió el Louvre sus puertas al público?", listOf("1789", "1793", "1801", "1802"), "Cultura", "El Museo del Louvre abrió al público el 10 de agosto de 1793, durante la Revolución Francesa, para hacer accesibles las colecciones reales.")
        ),
        BilingualQuestion(
            id = 50022, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel tenniseur a remporté le plus de titres du Grand Slam?", listOf("Roger Federer", "Novak Djokovic", "Rafael Nadal", "Pete Sampras"), "Sport", "Novak Djokovic détient le record absolu du nombre de titres du Grand Chelem chez les hommes, avec 24 victoires, devant Rafael Nadal et Roger Federer."),
            en = LocalizedContent("Which tennis player has won the most Grand Slam titles?", listOf("Roger Federer", "Novak Djokovic", "Rafael Nadal", "Pete Sampras"), "Sports", "Novak Djokovic holds the absolute record for most Grand Slam titles in men's tennis, with 24 victories, ahead of Rafael Nadal and Roger Federer."),
            zh = LocalizedContent("哪位网球运动员赢得了最多的大满贯冠军？", listOf("罗杰·费德勒", "诺瓦克·德约科维奇", "拉斐尔·纳达尔", "皮特·桑普拉斯"), "体育", "诺瓦克·德约科维奇以24个大满贯冠军保持着男子网球史上最多大满贯冠军的纪录，领先于拉斐尔·纳达尔和罗杰·费德勒。"),
            es = LocalizedContent("¿Qué tenista ha ganado más títulos de Grand Slam?", listOf("Roger Federer", "Novak Djokovic", "Rafael Nadal", "Pete Sampras"), "Deportes", "Novak Djokovic posee el récord absoluto de títulos de Grand Slam en tenis masculino, con 24 victorias, por delante de Rafael Nadal y Roger Federer.")
        ),
        BilingualQuestion(
            id = 50023, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel année le film 'Avatar' est-il sorti?", listOf("2007", "2008", "2009", "2010"), "Cinéma", "Le film Avatar, réalisé par James Cameron, est sorti en 2009 et a révolutionné l'industrie cinématographique avec ses effets visuels en 3D."),
            en = LocalizedContent("In which year was the film 'Avatar' released?", listOf("2007", "2008", "2009", "2010"), "Cinema", "The film Avatar, directed by James Cameron, was released in 2009 and revolutionized the film industry with its 3D visual effects."),
            zh = LocalizedContent("电影《阿凡达》在哪一年上映？", listOf("2007", "2008", "2009", "2010"), "电影", "由詹姆斯·卡梅隆执导的电影《阿凡达》于2009年上映，以其3D视觉效果革新了电影产业。"),
            es = LocalizedContent("¿En qué año se estrenó la película 'Avatar'?", listOf("2007", "2008", "2009", "2010"), "Cine", "La película Avatar, dirigida por James Cameron, se estrenó en 2009 y revolucionó la industria cinematográfica con sus efectos visuales en 3D.")
        ),
        BilingualQuestion(
            id = 50024, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chanteur afrobeat nigérian est décédé en 2021?", listOf("Burna Boy", "Fela Kuti", "Afrobeats", "Wizkid"), "Musique", "Fela Kuti, pionnier de l'afrobeat et figure majeure de la musique nigériane, est décédé en 1997, et non en 2021."),
            en = LocalizedContent("Which Nigerian afrobeat singer died in 2021?", listOf("Burna Boy", "Fela Kuti", "Afrobeats", "Wizkid"), "Music", "Fela Kuti, pioneer of afrobeat and major figure in Nigerian music, died in 1997, not 2021."),
            zh = LocalizedContent("哪位尼日利亚非洲节拍歌手在2021年去世？", listOf("伯纳男孩", "费拉·库蒂", "非洲节拍", "维兹基德"), "音乐", "费拉·库蒂，非洲节拍先驱和尼日利亚音乐的重要人物，于1997年去世，而非2021年。"),
            es = LocalizedContent("¿Qué cantante nigeriano de afrobeat falleció en 2021?", listOf("Burna Boy", "Fela Kuti", "Afrobeats", "Wizkid"), "Musica", "Fela Kuti, pionero del afrobeat y figura importante de la música nigeriana, falleció en 1997, no en 2021.")
        ),
        BilingualQuestion(
            id = 50025, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire a construit la Grande Muraille de Chine?", listOf("Empire Ming", "Dynastie Han", "Dynastie Qin", "Dynastie Tang"), "Histoire", "La construction de la Grande Muraille a débuté sous le règne de Qin Shi Huang, premier empereur de la dynastie Qin, pour protéger l'empire des invasions nomades venues du nord."),
            en = LocalizedContent("Which empire built the Great Wall of China?", listOf("Ming Empire", "Han Dynasty", "Qin Dynasty", "Tang Dynasty"), "History", "The construction of the Great Wall began under the reign of Qin Shi Huang, the first emperor of the Qin Dynasty, to protect the empire from nomadic invasions from the north."),
            zh = LocalizedContent("哪个帝国修建了中国的万里长城？", listOf("明朝", "汉朝", "秦朝", "唐朝"), "历史", "长城的修建始于秦始皇（秦朝第一位皇帝）统治时期，旨在保护帝国免受北方游牧民族的入侵。"),
            es = LocalizedContent("¿Qué imperio construyó la Gran Muralla China?", listOf("Imperio Ming", "Dinastía Han", "Dinastía Qin", "Dinastía Tang"), "Historia", "La construcción de la Gran Muralla comenzó bajo el reinado de Qin Shi Huang, primer emperador de la dinastía Qin, para proteger el imperio de las invasiones nómadas del norte.")
        ),
        BilingualQuestion(
            id = 50026, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus petit élément du tableau périodique?", listOf("Hélium", "Hydrogène", "Lithium", "Carbone"), "Science", "L'hydrogène possède le numéro atomique 1, ce qui signifie qu'il a un seul proton et un seul électron, ce qui en fait l'élément le plus léger et le plus petit du tableau périodique."),
            en = LocalizedContent("What is the smallest element in the periodic table?", listOf("Helium", "Hydrogen", "Lithium", "Carbon"), "Science", "Hydrogen has atomic number 1, meaning it has one proton and one electron, making it the lightest and smallest element in the periodic table."),
            zh = LocalizedContent("元素周期表中最小的元素是什么？", listOf("氦", "氢", "锂", "碳"), "科学", "氢的原子序数为1，意味着它有一个质子和一个电子，使其成为元素周期表中最轻、最小的元素。"),
            es = LocalizedContent("¿Cuál es el elemento más pequeño de la tabla periódica?", listOf("Helio", "Hidrógeno", "Litio", "Carbono"), "Ciencia", "El hidrógeno tiene número atómico 1, lo que significa que tiene un protón y un electrón, lo que lo convierte en el elemento más ligero y pequeño de la tabla periódica.")
        ),
        BilingualQuestion(
            id = 50027, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a le plus grand nombre d'habitants?", listOf("Inde", "Chine", "Indonésie", "Pakistan"), "Géographie", "L'Inde a dépassé la Chine en 2023 pour devenir le pays le plus peuplé du monde, avec environ 1,4 milliard d'habitants."),
            en = LocalizedContent("Which country has the largest population?", listOf("India", "China", "Indonesia", "Pakistan"), "Geography", "India surpassed China in 2023 to become the world's most populous country, with about 1.4 billion inhabitants."),
            zh = LocalizedContent("哪个国家人口最多？", listOf("印度", "中国", "印度尼西亚", "巴基斯坦"), "地理", "印度在2023年超过中国，成为世界上人口最多的国家，约有14亿居民。"),
            es = LocalizedContent("¿Qué país tiene la mayor población?", listOf("India", "China", "Indonesia", "Pakistán"), "Geografia", "La India superó a China en 2023 para convertirse en el país más poblado del mundo, con aproximadamente 1.400 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 50028, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre français a coupé une partie de son oreille?", listOf("Picasso", "Monet", "Van Gogh", "Cézanne"), "Culture", "Van Gogh, bien que néerlandais, a vécu et travaillé en France. Il s'est coupé une partie de l'oreille gauche en 1888 après une dispute avec Gauguin."),
            en = LocalizedContent("Which French painter cut off part of his ear?", listOf("Picasso", "Monet", "Van Gogh", "Cézanne"), "Culture", "Van Gogh, although Dutch, lived and worked in France. He cut off part of his left ear in 1888 after a quarrel with Gauguin."),
            zh = LocalizedContent("哪位法国画家割掉了自己的一部分耳朵？", listOf("毕加索", "莫奈", "梵高", "塞尚"), "文化", "梵高虽然是荷兰人，但曾在法国生活和工作。1888年，他与高更争吵后割掉了自己左耳的一部分。"),
            es = LocalizedContent("¿Qué pintor francés se cortó parte de la oreja?", listOf("Picasso", "Monet", "Van Gogh", "Cézanne"), "Cultura", "Van Gogh, aunque holandés, vivió y trabajó en Francia. Se cortó parte de la oreja izquierda en 1888 tras una discusión con Gauguin.")
        ),
        BilingualQuestion(
            id = 50029, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année la Coupe du Monde de football s'est-elle déroulée en France?", listOf("1996", "1997", "1998", "1999"), "Sport", "La Coupe du Monde de football 1998 en France a vu l'équipe de France remporter son premier titre mondial en battant le Brésil en finale au Stade de France."),
            en = LocalizedContent("In which year did the FIFA World Cup take place in France?", listOf("1996", "1997", "1998", "1999"), "Sports", "The 1998 FIFA World Cup in France saw the French team win its first world title by defeating Brazil in the final at the Stade de France."),
            zh = LocalizedContent("国际足联世界杯在哪一年在法国举行？", listOf("1996", "1997", "1998", "1999"), "体育", "1998年法国世界杯上，法国队在法兰西体育场决赛中击败巴西队，赢得了首个世界冠军。"),
            es = LocalizedContent("¿En qué año se celebró la Copa Mundial de la FIFA en Francia?", listOf("1996", "1997", "1998", "1999"), "Deportes", "La Copa Mundial de la FIFA de 1998 en Francia vio al equipo francés ganar su primer título mundial al vencer a Brasil en la final en el Stade de France.")
        ),
        BilingualQuestion(
            id = 50030, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film Marvel a sorti 'Avengers: Endgame'?", listOf("Marvel Studios", "Warner Bros", "20th Century Fox", "Sony Pictures"), "Cinéma", "Marvel Studios est la société de production cinématographique responsable de la franchise Avengers, y compris Endgame, sorti en 2019."),
            en = LocalizedContent("Which Marvel film released 'Avengers: Endgame'?", listOf("Marvel Studios", "Warner Bros", "20th Century Fox", "Sony Pictures"), "Cinema", "Marvel Studios is the film production company responsible for the Avengers franchise, including Endgame, released in 2019."),
            zh = LocalizedContent("哪家漫威电影公司发行了《复仇者联盟4：终局之战》？", listOf("漫威影业", "华纳兄弟", "20世纪福克斯", "索尼影业"), "电影", "漫威影业是负责复仇者联盟系列电影的制作公司，包括2019年上映的《终局之战》。"),
            es = LocalizedContent("¿Qué película de Marvel estrenó 'Avengers: Endgame'?", listOf("Marvel Studios", "Warner Bros", "20th Century Fox", "Sony Pictures"), "Cine", "Marvel Studios es la productora cinematográfica responsable de la franquicia de los Vengadores, incluido Endgame, estrenado en 2019.")
        ),
        BilingualQuestion(
            id = 50031, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe coréen a créé l'album 'Dynamite'?", listOf("EXO", "BTS", "Blackpink", "Twice"), "Musique", "BTS a sorti l'album \"Dynamite\" en 2020, un single qui est devenu un succès mondial et a marqué leur première chanson entièrement en anglais."),
            en = LocalizedContent("Which Korean group created the album 'Dynamite'?", listOf("EXO", "BTS", "Blackpink", "Twice"), "Music", "BTS released the album 'Dynamite' in 2020, a single that became a global hit and marked their first fully English song."),
            zh = LocalizedContent("哪个韩国组合创作了专辑《Dynamite》？", listOf("EXO", "防弹少年团", "BLACKPINK", "TWICE"), "音乐", "防弹少年团于2020年发行了专辑《Dynamite》，这首单曲成为全球热门歌曲，也是他们第一首全英文歌曲。"),
            es = LocalizedContent("¿Qué grupo coreano creó el álbum 'Dynamite'?", listOf("EXO", "BTS", "Blackpink", "Twice"), "Música", "BTS lanzó el álbum 'Dynamite' en 2020, un sencillo que se convirtió en un éxito mundial y marcó su primera canción completamente en inglés.")
        ),
        BilingualQuestion(
            id = 50032, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empereur romain a établi le calendrier Julien?", listOf("Auguste", "César", "Néron", "Caligula"), "Histoire", "Jules César a réformé le calendrier romain en 46 av. J.-C., créant le calendrier julien basé sur l'année solaire de 365 jours avec une année bissextile tous les quatre ans."),
            en = LocalizedContent("Which Roman emperor established the Julian calendar?", listOf("Augustus", "Caesar", "Nero", "Caligula"), "History", "Julius Caesar reformed the Roman calendar in 46 BC, creating the Julian calendar based on a solar year of 365 days with a leap year every four years."),
            zh = LocalizedContent("哪位罗马皇帝制定了儒略历？", listOf("奥古斯都", "凯撒", "尼禄", "卡利古拉"), "历史", "尤利乌斯·凯撒于公元前46年改革了罗马历法，创建了基于365天太阳年、每四年闰年的儒略历。"),
            es = LocalizedContent("¿Qué emperador romano estableció el calendario juliano?", listOf("Augusto", "César", "Nerón", "Calígula"), "Historia", "Julio César reformó el calendario romano en el 46 a.C., creando el calendario juliano basado en un año solar de 365 días con un año bisiesto cada cuatro años.")
        ),
        BilingualQuestion(
            id = 50033, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de chromosomes les humains possèdent-ils?", listOf("23", "46", "48", "52"), "Science", "L'être humain possède 46 chromosomes, organisés en 23 paires, dont une paire de chromosomes sexuels. Ce nombre est constant dans toutes les cellules du corps, sauf les gamètes qui en ont 23."),
            en = LocalizedContent("How many chromosomes do humans have?", listOf("23", "46", "48", "52"), "Science", "Humans have 46 chromosomes, organized into 23 pairs, including one pair of sex chromosomes. This number is constant in all body cells except gametes, which have 23."),
            zh = LocalizedContent("人类有多少条染色体？", listOf("23", "46", "48", "52"), "科学", "人类有46条染色体，组成23对，包括一对性染色体。这个数量在所有体细胞中恒定，但配子只有23条。"),
            es = LocalizedContent("¿Cuántos cromosomas tienen los humanos?", listOf("23", "46", "48", "52"), "Ciencia", "Los humanos tienen 46 cromosomas, organizados en 23 pares, incluido un par de cromosomas sexuales. Este número es constante en todas las células del cuerpo, excepto los gametos que tienen 23.")
        ),
        BilingualQuestion(
            id = 50034, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le désert le plus grand du monde?", listOf("Sahara", "Gobi", "Kalahari", "Antarctique"), "Géographie", "L'Antarctique est considéré comme le plus grand désert du monde car il reçoit très peu de précipitations, moins de 50 mm par an, ce qui correspond à la définition d'un désert."),
            en = LocalizedContent("What is the largest desert in the world?", listOf("Sahara", "Gobi", "Kalahari", "Antarctic"), "Geography", "Antarctica is considered the largest desert in the world because it receives very little precipitation, less than 50 mm per year, which fits the definition of a desert."),
            zh = LocalizedContent("世界上最大的沙漠是什么？", listOf("撒哈拉沙漠", "戈壁沙漠", "卡拉哈里沙漠", "南极洲"), "地理", "南极洲被认为是世界上最大的沙漠，因为其年降水量极少，低于50毫米，符合沙漠的定义。"),
            es = LocalizedContent("¿Cuál es el desierto más grande del mundo?", listOf("Sáhara", "Gobi", "Kalahari", "Antártida"), "Geografía", "La Antártida es considerada el desierto más grande del mundo porque recibe muy poca precipitación, menos de 50 mm al año, lo que cumple con la definición de desierto.")
        ),
        BilingualQuestion(
            id = 50035, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel festival français est célèbre pour les films?", listOf("Oktoberfest", "Cannes", "Montreux", "Berlin"), "Culture", "Le Festival de Cannes, créé en 1946, est l'un des événements cinématographiques les plus prestigieux au monde, récompensant chaque année les meilleurs films par la Palme d'or."),
            en = LocalizedContent("Which French festival is famous for films?", listOf("Oktoberfest", "Cannes", "Montreux", "Berlin"), "Culture", "The Cannes Film Festival, founded in 1946, is one of the most prestigious film events in the world, awarding the Palme d'Or each year to the best films."),
            zh = LocalizedContent("哪个法国电影节以电影闻名？", listOf("慕尼黑啤酒节", "戛纳电影节", "蒙特勒爵士音乐节", "柏林电影节"), "文化", "戛纳电影节成立于1946年，是世界上最负盛名的电影活动之一，每年颁发金棕榈奖给最佳影片。"),
            es = LocalizedContent("¿Qué festival francés es famoso por las películas?", listOf("Oktoberfest", "Cannes", "Montreux", "Berlín"), "Cultura", "El Festival de Cine de Cannes, fundado en 1946, es uno de los eventos cinematográficos más prestigiosos del mundo, otorgando cada año la Palma de Oro a las mejores películas.")
        ),
        BilingualQuestion(
            id = 50036, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel champion de F1 a remporté 7 titres mondiaux?", listOf("Alain Prost", "Michael Schumacher", "Lewis Hamilton", "Ayrton Senna"), "Sport", "Lewis Hamilton a égalé le record de Michael Schumacher en remportant son septième titre de champion du monde de Formule 1 en 2020."),
            en = LocalizedContent("Which F1 champion has won 7 world titles?", listOf("Alain Prost", "Michael Schumacher", "Lewis Hamilton", "Ayrton Senna"), "Sports", "Lewis Hamilton equaled Michael Schumacher's record by winning his seventh Formula One World Championship title in 2020."),
            zh = LocalizedContent("哪位F1冠军赢得了7个世界冠军？", listOf("阿兰·普罗斯特", "迈克尔·舒马赫", "刘易斯·汉密尔顿", "艾尔顿·塞纳"), "体育", "刘易斯·汉密尔顿在2020年赢得了他的第七个一级方程式世界冠军，追平了迈克尔·舒马赫的纪录。"),
            es = LocalizedContent("¿Qué campeón de F1 ha ganado 7 títulos mundiales?", listOf("Alain Prost", "Michael Schumacher", "Lewis Hamilton", "Ayrton Senna"), "Deportes", "Lewis Hamilton igualó el récord de Michael Schumacher al ganar su séptimo título de Campeón del Mundo de Fórmula 1 en 2020.")
        ),
        BilingualQuestion(
            id = 50037, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé la franchise 'Star Wars'?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Martin Scorsese"), "Cinéma", "George Lucas a écrit et réalisé le premier film Star Wars en 1977, lançant ainsi la franchise emblématique."),
            en = LocalizedContent("Which director created the 'Star Wars' franchise?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Martin Scorsese"), "Cinema", "George Lucas wrote and directed the first Star Wars film in 1977, launching the iconic franchise."),
            zh = LocalizedContent("哪位导演创造了《星球大战》系列？", listOf("史蒂文·斯皮尔伯格", "乔治·卢卡斯", "詹姆斯·卡梅隆", "马丁·斯科塞斯"), "电影", "乔治·卢卡斯于1977年编剧并执导了第一部《星球大战》电影，开启了这一标志性系列。"),
            es = LocalizedContent("¿Qué director creó la franquicia 'Star Wars'?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Martin Scorsese"), "Cine", "George Lucas escribió y dirigió la primera película de Star Wars en 1977, lanzando la icónica franquicia.")
        ),
        BilingualQuestion(
            id = 50038, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste reggae est connu pour 'One Love'?", listOf("Peter Tosh", "Bob Marley", "Jimmy Cliff", "Burning Spear"), "Musique", "Bob Marley a popularisé le reggae dans le monde entier avec des titres comme 'One Love', hymne à l'unité et à la paix."),
            en = LocalizedContent("Which reggae artist is known for 'One Love'?", listOf("Peter Tosh", "Bob Marley", "Jimmy Cliff", "Burning Spear"), "Music", "Bob Marley popularized reggae worldwide with songs like 'One Love', an anthem for unity and peace."),
            zh = LocalizedContent("哪位雷鬼艺术家以《One Love》闻名？", listOf("彼得·托什", "鲍勃·马利", "吉米·克里夫", "伯宁·斯皮尔"), "音乐", "鲍勃·马利以《One Love》等歌曲将雷鬼音乐推广到全球，这首歌成为团结与和平的颂歌。"),
            es = LocalizedContent("¿Qué artista de reggae es conocido por 'One Love'?", listOf("Peter Tosh", "Bob Marley", "Jimmy Cliff", "Burning Spear"), "Música", "Bob Marley popularizó el reggae en todo el mundo con canciones como 'One Love', un himno a la unidad y la paz.")
        ),
        BilingualQuestion(
            id = 50039, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Déclaration d'Indépendance américaine a-t-elle été signée?", listOf("1774", "1775", "1776", "1777"), "Histoire", "La Déclaration d'Indépendance a été adoptée par le Congrès continental le 4 juillet 1776, proclamant la séparation des treize colonies de la Grande-Bretagne."),
            en = LocalizedContent("In which year was the American Declaration of Independence signed?", listOf("1774", "1775", "1776", "1777"), "History", "The Declaration of Independence was adopted by the Continental Congress on July 4, 1776, proclaiming the separation of the thirteen colonies from Great Britain."),
            zh = LocalizedContent("美国《独立宣言》签署于哪一年？", listOf("1774年", "1775年", "1776年", "1777年"), "历史", "《独立宣言》于1776年7月4日由大陆会议通过，宣布十三个殖民地脱离大不列颠独立。"),
            es = LocalizedContent("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?", listOf("1774", "1775", "1776", "1777"), "Historia", "La Declaración de Independencia fue adoptada por el Congreso Continental el 4 de julio de 1776, proclamando la separación de las trece colonias de Gran Bretaña.")
        ),
    )
}
