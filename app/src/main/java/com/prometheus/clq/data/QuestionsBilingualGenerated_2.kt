package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 2 : 500 questions bilingues */
object QuestionsBilingualGenerated_2 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 2275, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de joueurs peut-on faire entrer dans un match de football (remplaçants max en match) ?", listOf("5", "3", "6", "4"), "Sport", ""),
            en = LocalizedContent("How many players can be brought into a football match (maximum substitutes in a match)?", listOf("5", "3", "6", "4"), "Sports", ""),
            zh = LocalizedContent("一场足球比赛中最多可以换多少名球员（比赛中最大替补人数）？", listOf("5", "3", "6", "4"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores se pueden hacer entrar en un partido de fútbol (máximo de suplentes en un partido)?", listOf("5", "3", "6", "4"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2276, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel nageur a détenu le record du monde du 100m nage libre le plus longtemps ?", listOf("Jim Montgomery", "Alexander Popov", "Pieter van den Hoogenband", "César Cielo"), "Sport", ""),
            en = LocalizedContent("Which swimmer held the world record in the 100m freestyle for the longest time?", listOf("Jim Montgomery", "Alexander Popov", "Pieter van den Hoogenband", "César Cielo"), "Sports", ""),
            zh = LocalizedContent("哪位游泳运动员保持100米自由泳世界纪录的时间最长？", listOf("吉姆·蒙哥马利", "亚历山大·波波夫", "彼得·范登霍根班德", "塞萨尔·西埃洛"), "体育", ""),
            es = LocalizedContent("¿Qué nadador mantuvo el récord mundial de 100 m libres durante más tiempo?", listOf("Jim Montgomery", "Alexander Popov", "Pieter van den Hoogenband", "César Cielo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2277, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Formule 1 a-t-elle été créée ?", listOf("1950", "1945", "1955", "1960"), "Sport", ""),
            en = LocalizedContent("In which year was Formula 1 created?", listOf("1950", "1945", "1955", "1960"), "Sports", ""),
            zh = LocalizedContent("一级方程式赛车是哪一年创立的？", listOf("1950", "1945", "1955", "1960"), "体育", ""),
            es = LocalizedContent("¿En qué año se creó la Fórmula 1?", listOf("1950", "1945", "1955", "1960"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2278, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de Grand Prix compte une saison de Formule 1 typiquement ?", listOf("20-24", "16-18", "12-15", "10-12"), "Sport", ""),
            en = LocalizedContent("How many Grands Prix does a typical Formula 1 season have?", listOf("20-24", "16-18", "12-15", "10-12"), "Sports", ""),
            zh = LocalizedContent("一个典型的一级方程式赛季有多少场大奖赛？", listOf("20-24", "16-18", "12-15", "10-12"), "体育", ""),
            es = LocalizedContent("¿Cuántos Grandes Premios tiene una temporada típica de Fórmula 1?", listOf("20-24", "16-18", "12-15", "10-12"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2279, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur de tennis a remporté le plus de victoires en simple sur le circuit ATP ?", listOf("Novak Djokovic", "Roger Federer", "Jimmy Connors", "Ivan Lendl"), "Sport", ""),
            en = LocalizedContent("Which tennis player has won the most singles matches on the ATP Tour?", listOf("Novak Djokovic", "Roger Federer", "Jimmy Connors", "Ivan Lendl"), "Sports", ""),
            zh = LocalizedContent("哪位网球运动员在ATP巡回赛中赢得了最多的单打比赛？", listOf("诺瓦克·德约科维奇", "罗杰·费德勒", "吉米·康纳斯", "伊万·伦德尔"), "体育", ""),
            es = LocalizedContent("¿Qué tenista ha ganado más partidos individuales en el circuito ATP?", listOf("Novak Djokovic", "Roger Federer", "Jimmy Connors", "Ivan Lendl"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2280, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Michael Jordan a-t-il remporté son premier titre NBA ?", listOf("1991", "1988", "1993", "1987"), "Sport", ""),
            en = LocalizedContent("In which year did Michael Jordan win his first NBA title?", listOf("1991", "1988", "1993", "1987"), "Sports", ""),
            zh = LocalizedContent("迈克尔·乔丹在哪一年赢得了他的第一个NBA总冠军？", listOf("1991", "1988", "1993", "1987"), "体育", ""),
            es = LocalizedContent("¿En qué año ganó Michael Jordan su primer título de la NBA?", listOf("1991", "1988", "1993", "1987"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 2281, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Christopher Nolan met en scène un architecte de rêves ?", listOf("Inception", "Memento", "The Dark Knight", "Interstellar"), "Cinéma", ""),
            en = LocalizedContent("Which Christopher Nolan film features an architect of dreams?", listOf("Inception", "Memento", "The Dark Knight", "Interstellar"), "Cinema", ""),
            zh = LocalizedContent("克里斯托弗·诺兰的哪部电影讲述了一位梦境建筑师的故事？", listOf("盗梦空间", "记忆碎片", "黑暗骑士", "星际穿越"), "电影", ""),
            es = LocalizedContent("¿Qué película de Christopher Nolan presenta a un arquitecto de sueños?", listOf("Inception", "Memento", "The Dark Knight", "Interstellar"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2282, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé 'Amadeus' (1984) ?", listOf("Miloš Forman", "Stanley Kubrick", "John Schlesinger", "Oliver Stone"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Amadeus' (1984)?", listOf("Miloš Forman", "Stanley Kubrick", "John Schlesinger", "Oliver Stone"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《莫扎特传》（1984年）？", listOf("米洛斯·福尔曼", "斯坦利·库布里克", "约翰·施莱辛格", "奥利弗·斯通"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Amadeus' (1984)?", listOf("Miloš Forman", "Stanley Kubrick", "John Schlesinger", "Oliver Stone"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2283, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film Disney de 2013 met en scène deux princesses sœurs ?", listOf("La Reine des neiges", "Raiponce", "Rebelle", "Encanto"), "Cinéma", ""),
            en = LocalizedContent("Which 2013 Disney film features two princess sisters?", listOf("Frozen", "Tangled", "Brave", "Encanto"), "Cinema", ""),
            zh = LocalizedContent("2013年哪部迪士尼电影讲述了两位公主姐妹的故事？", listOf("冰雪奇缘", "魔发奇缘", "勇敢传说", "魔法满屋"), "电影", ""),
            es = LocalizedContent("¿Qué película de Disney de 2013 presenta a dos hermanas princesas?", listOf("Frozen", "Tangled", "Brave", "Encanto"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2284, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel film Tom Hanks joue-t-il un homme bloqué dans un aéroport ?", listOf("Le Terminal", "Cast Away", "Philadelphia", "Forrest Gump"), "Cinéma", ""),
            en = LocalizedContent("In which film does Tom Hanks play a man stranded in an airport?", listOf("The Terminal", "Cast Away", "Philadelphia", "Forrest Gump"), "Cinema", ""),
            zh = LocalizedContent("汤姆·汉克斯在哪部电影中饰演一个被困在机场的男人？", listOf("幸福终点站", "荒岛余生", "费城故事", "阿甘正传"), "电影", ""),
            es = LocalizedContent("¿En qué película Tom Hanks interpreta a un hombre varado en un aeropuerto?", listOf("The Terminal", "Cast Away", "Philadelphia", "Forrest Gump"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2285, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue Hannibal Lecter dans 'Le Silence des agneaux' ?", listOf("Anthony Hopkins", "Gary Oldman", "Tim Roth", "Ralph Fiennes"), "Cinéma", ""),
            en = LocalizedContent("Which actor plays Hannibal Lecter in 'The Silence of the Lambs'?", listOf("Anthony Hopkins", "Gary Oldman", "Tim Roth", "Ralph Fiennes"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在《沉默的羔羊》中饰演汉尼拔·莱克特？", listOf("安东尼·霍普金斯", "加里·奥德曼", "蒂姆·罗斯", "拉尔夫·费因斯"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpreta a Hannibal Lecter en 'El silencio de los corderos'?", listOf("Anthony Hopkins", "Gary Oldman", "Tim Roth", "Ralph Fiennes"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2286, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de 1999 a lancé le genre des documenteurs de found footage ?", listOf("The Blair Witch Project", "Paranormal Activity", "Cloverfield", "REC"), "Cinéma", ""),
            en = LocalizedContent("Which 1999 film launched the found footage genre?", listOf("The Blair Witch Project", "Paranormal Activity", "Cloverfield", "REC"), "Cinema", ""),
            zh = LocalizedContent("哪部1999年的电影开创了伪纪录片类型？", listOf("女巫布莱尔", "灵动：鬼影实录", "科洛弗档案", "死亡录像"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1999 lanzó el género de metraje encontrado?", listOf("The Blair Witch Project", "Paranormal Activity", "Cloverfield", "REC"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2287, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé la trilogie 'Le Parrain' ?", listOf("Francis Ford Coppola", "Martin Scorsese", "Sidney Lumet", "Brian De Palma"), "Cinéma", ""),
            en = LocalizedContent("Who directed the 'Godfather' trilogy?", listOf("Francis Ford Coppola", "Martin Scorsese", "Sidney Lumet", "Brian De Palma"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《教父》三部曲？", listOf("弗朗西斯·福特·科波拉", "马丁·斯科塞斯", "西德尼·吕美特", "布莱恩·德·帕尔玛"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió la trilogía de 'El Padrino'?", listOf("Francis Ford Coppola", "Martin Scorsese", "Sidney Lumet", "Brian De Palma"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2288, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Ridley Scott se déroule en Inde coloniale ?", listOf("Thelma et Louise", "Blade Runner", "Alien", "Gladiator"), "Cinéma", ""),
            en = LocalizedContent("Which Ridley Scott film is set in colonial India?", listOf("Thelma and Louise", "Blade Runner", "Alien", "Gladiator"), "Cinema", ""),
            zh = LocalizedContent("雷德利·斯科特的哪部电影以殖民时期的印度为背景？", listOf("末路狂花", "银翼杀手", "异形", "角斗士"), "电影", ""),
            es = LocalizedContent("¿Qué película de Ridley Scott se desarrolla en la India colonial?", listOf("Thelma y Louise", "Blade Runner", "Alien", "Gladiator"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2289, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel film Russell Crowe joue-t-il un gladiateur romain ?", listOf("Gladiator", "Ben-Hur", "Troie", "Alexandre"), "Cinéma", ""),
            en = LocalizedContent("In which film does Russell Crowe play a Roman gladiator?", listOf("Gladiator", "Ben-Hur", "Troy", "Alexander"), "Cinema", ""),
            zh = LocalizedContent("罗素·克劳在哪部电影中饰演罗马角斗士？", listOf("角斗士", "宾虚", "特洛伊", "亚历山大大帝"), "电影", ""),
            es = LocalizedContent("¿En qué película Russell Crowe interpreta a un gladiador romano?", listOf("Gladiator", "Ben-Hur", "Troya", "Alejandro"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2290, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur est connu pour 'Vertigo', 'Psycho' et 'Les Oiseaux' ?", listOf("Alfred Hitchcock", "Billy Wilder", "John Ford", "Howard Hawks"), "Cinéma", ""),
            en = LocalizedContent("Which director is known for 'Vertigo', 'Psycho', and 'The Birds'?", listOf("Alfred Hitchcock", "Billy Wilder", "John Ford", "Howard Hawks"), "Cinema", ""),
            zh = LocalizedContent("哪位导演以《迷魂记》、《惊魂记》和《群鸟》闻名？", listOf("阿尔弗雷德·希区柯克", "比利·怀尔德", "约翰·福特", "霍华德·霍克斯"), "电影", ""),
            es = LocalizedContent("¿Qué director es conocido por 'Vértigo', 'Psicosis' y 'Los pájaros'?", listOf("Alfred Hitchcock", "Billy Wilder", "John Ford", "Howard Hawks"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2291, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1977 a révolutionné les effets spéciaux au cinéma ?", listOf("Star Wars", "Rencontres du 3e type", "Superman", "Alien"), "Cinéma", ""),
            en = LocalizedContent("Which 1977 film revolutionized special effects in cinema?", listOf("Star Wars", "Close Encounters of the Third Kind", "Superman", "Alien"), "Cinema", ""),
            zh = LocalizedContent("哪部1977年的电影彻底改变了电影特效？", listOf("星球大战", "第三类接触", "超人", "异形"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1977 revolucionó los efectos especiales en el cine?", listOf("Star Wars", "Encuentros en la tercera fase", "Superman", "Alien"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2292, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Schindler's List' (1993) ?", listOf("Steven Spielberg", "Roman Polanski", "Oliver Stone", "Michael Mann"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Schindler's List' (1993)?", listOf("Steven Spielberg", "Roman Polanski", "Oliver Stone", "Michael Mann"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《辛德勒的名单》（1993）？", listOf("史蒂文·斯皮尔伯格", "罗曼·波兰斯基", "奥利弗·斯通", "迈克尔·曼"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'La lista de Schindler' (1993)?", listOf("Steven Spielberg", "Roman Polanski", "Oliver Stone", "Michael Mann"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2293, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a joué le rôle de James Bond le plus de fois ?", listOf("Roger Moore", "Sean Connery", "Daniel Craig", "Pierce Brosnan"), "Cinéma", ""),
            en = LocalizedContent("Which actor played James Bond the most times?", listOf("Roger Moore", "Sean Connery", "Daniel Craig", "Pierce Brosnan"), "Cinema", ""),
            zh = LocalizedContent("哪位演员饰演詹姆斯·邦德的次数最多？", listOf("罗杰·摩尔", "肖恩·康纳利", "丹尼尔·克雷格", "皮尔斯·布鲁斯南"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó a James Bond la mayor cantidad de veces?", listOf("Roger Moore", "Sean Connery", "Daniel Craig", "Pierce Brosnan"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2294, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel film Meryl Streep joue-t-elle Margaret Thatcher ?", listOf("The Iron Lady", "Mamma Mia!", "The Devil Wears Prada", "August: Osage County"), "Cinéma", ""),
            en = LocalizedContent("In which film does Meryl Streep play Margaret Thatcher?", listOf("The Iron Lady", "Mamma Mia!", "The Devil Wears Prada", "August: Osage County"), "Cinema", ""),
            zh = LocalizedContent("梅丽尔·斯特里普在哪部电影中饰演玛格丽特·撒切尔？", listOf("铁娘子", "妈妈咪呀！", "穿普拉达的女王", "八月：奥色治郡"), "电影", ""),
            es = LocalizedContent("¿En qué película Meryl Streep interpreta a Margaret Thatcher?", listOf("La dama de hierro", "Mamma Mia!", "El diablo viste de Prada", "Agosto: Condado de Osage"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2295, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'animation japonais a remporté l'Oscar du meilleur film d'animation en 2003 ?", listOf("Le Voyage de Chihiro", "Mon Voisin Totoro", "Princess Mononoke", "Nausicaä"), "Cinéma", ""),
            en = LocalizedContent("Which Japanese animated film won the Oscar for Best Animated Feature in 2003?", listOf("Spirited Away", "My Neighbor Totoro", "Princess Mononoke", "Nausicaä"), "Cinema", ""),
            zh = LocalizedContent("哪部日本动画电影在2003年获得了奥斯卡最佳动画长片奖？", listOf("千与千寻", "龙猫", "幽灵公主", "风之谷"), "电影", ""),
            es = LocalizedContent("¿Qué película de animación japonesa ganó el Oscar a la mejor película de animación en 2003?", listOf("El viaje de Chihiro", "Mi vecino Totoro", "La princesa Mononoke", "Nausicaä"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2296, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le personnage principal dans 'The Dark Knight' (2008) ?", listOf("Christian Bale", "Michael Keaton", "Ben Affleck", "Val Kilmer"), "Cinéma", ""),
            en = LocalizedContent("Who plays the main character in 'The Dark Knight' (2008)?", listOf("Christian Bale", "Michael Keaton", "Ben Affleck", "Val Kilmer"), "Cinema", ""),
            zh = LocalizedContent("谁在《黑暗骑士》（2008）中扮演主角？", listOf("克里斯蒂安·贝尔", "迈克尔·基顿", "本·阿弗莱克", "瓦尔·基尔默"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta al personaje principal en 'The Dark Knight' (2008)?", listOf("Christian Bale", "Michael Keaton", "Ben Affleck", "Val Kilmer"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2297, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de science-fiction de 1968 est réalisé par Stanley Kubrick ?", listOf("2001: L'Odyssée de l'espace", "Blade Runner", "Star Wars", "Alien"), "Cinéma", ""),
            en = LocalizedContent("Which 1968 science fiction film was directed by Stanley Kubrick?", listOf("2001: A Space Odyssey", "Blade Runner", "Star Wars", "Alien"), "Cinema", ""),
            zh = LocalizedContent("哪部1968年的科幻电影由斯坦利·库布里克执导？", listOf("2001太空漫游", "银翼杀手", "星球大战", "异形"), "电影", ""),
            es = LocalizedContent("¿Qué película de ciencia ficción de 1968 fue dirigida por Stanley Kubrick?", listOf("2001: Una odisea del espacio", "Blade Runner", "Star Wars", "Alien"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2298, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle actrice française a remporté le César et l'Oscar de la meilleure actrice pour 'La Vie en rose' ?", listOf("Marion Cotillard", "Isabelle Huppert", "Sophie Marceau", "Juliette Binoche"), "Cinéma", ""),
            en = LocalizedContent("Which French actress won both the César and Oscar for Best Actress for 'La Vie en Rose'?", listOf("Marion Cotillard", "Isabelle Huppert", "Sophie Marceau", "Juliette Binoche"), "Cinema", ""),
            zh = LocalizedContent("哪位法国女演员凭借《玫瑰人生》获得了凯撒奖和奥斯卡最佳女主角奖？", listOf("玛丽昂·歌迪亚", "伊莎贝尔·于佩尔", "苏菲·玛索", "朱丽叶·比诺什"), "电影", ""),
            es = LocalizedContent("¿Qué actriz francesa ganó el César y el Oscar a la mejor actriz por 'La vida en rosa'?", listOf("Marion Cotillard", "Isabelle Huppert", "Sophie Marceau", "Juliette Binoche"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2299, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a pour réplique célèbre 'You talking to me?' ?", listOf("Taxi Driver", "Raging Bull", "Mean Streets", "Goodfellas"), "Cinéma", ""),
            en = LocalizedContent("Which film features the famous line 'You talking to me?'?", listOf("Taxi Driver", "Raging Bull", "Mean Streets", "Goodfellas"), "Cinema", ""),
            zh = LocalizedContent("哪部电影有著名台词“你在跟我说话吗？”？", listOf("出租车司机", "愤怒的公牛", "穷街陋巷", "好家伙"), "电影", ""),
            es = LocalizedContent("¿Qué película tiene la famosa frase '¿Me estás hablando a mí?'?", listOf("Taxi Driver", "Toro salvaje", "Malas calles", "Buenos muchachos"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2300, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Parasite' (2019, Palme d'Or) ?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Parasite' (2019, Palme d'Or)?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《寄生虫》（2019年，金棕榈奖）？", listOf("奉俊昊", "朴赞郁", "李沧东", "洪常秀"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Parásitos' (2019, Palma de Oro)?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cine", "")
        ),
        BilingualQuestion(
            id = 2301, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'ingrédient principal du houmous ?", listOf("Pois chiches", "Haricots blancs", "Lentilles", "Fèves"), "Gastronomie", ""),
            en = LocalizedContent("What is the main ingredient of hummus?", listOf("Chickpeas", "White beans", "Lentils", "Fava beans"), "Gastronomy", ""),
            zh = LocalizedContent("鹰嘴豆泥的主要成分是什么？", listOf("鹰嘴豆", "白豆", "扁豆", "蚕豆"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente principal del hummus?", listOf("Garbanzos", "Judías blancas", "Lentejas", "Habas"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2302, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle région italienne est originaire la pizza Napolitaine ?", listOf("Campanie (Naples)", "Sicile", "Lazio (Rome)", "Lombardie"), "Gastronomie", ""),
            en = LocalizedContent("In which Italian region does Neapolitan pizza originate?", listOf("Campania (Naples)", "Sicily", "Lazio (Rome)", "Lombardy"), "Gastronomy", ""),
            zh = LocalizedContent("那不勒斯披萨起源于意大利哪个地区？", listOf("坎帕尼亚（那不勒斯）", "西西里", "拉齐奥（罗马）", "伦巴第"), "美食", ""),
            es = LocalizedContent("¿En qué región italiana se origina la pizza napolitana?", listOf("Campania (Nápoles)", "Sicilia", "Lacio (Roma)", "Lombardía"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2303, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fromage à pâte persillée le plus célèbre de France ?", listOf("Roquefort", "Bleu d'Auvergne", "Fourme d'Ambert", "Bleu de Bresse"), "Gastronomie", ""),
            en = LocalizedContent("What is the most famous blue cheese in France?", listOf("Roquefort", "Bleu d'Auvergne", "Fourme d'Ambert", "Bleu de Bresse"), "Gastronomy", ""),
            zh = LocalizedContent("法国最著名的蓝纹奶酪是什么？", listOf("罗克福尔", "奥弗涅蓝纹", "昂贝尔蓝纹", "布雷斯蓝纹"), "美食", ""),
            es = LocalizedContent("¿Cuál es el queso azul más famoso de Francia?", listOf("Roquefort", "Bleu d'Auvergne", "Fourme d'Ambert", "Bleu de Bresse"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2304, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le miso ?", listOf("Pâte de soja fermentée japonaise", "Sauce de poisson vietnamienne", "Épice indienne", "Condiment coréen"), "Gastronomie", ""),
            en = LocalizedContent("What is miso?", listOf("Japanese fermented soybean paste", "Vietnamese fish sauce", "Indian spice", "Korean condiment"), "Gastronomy", ""),
            zh = LocalizedContent("味噌是什么？", listOf("日本发酵大豆酱", "越南鱼露", "印度香料", "韩国调味品"), "美食", ""),
            es = LocalizedContent("¿Qué es el miso?", listOf("Pasta de soja fermentada japonesa", "Salsa de pescado vietnamita", "Especia india", "Condimento coreano"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2305, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays est le plus grand producteur de vin au monde ?", listOf("Italie", "France", "Espagne", "États-Unis"), "Gastronomie", ""),
            en = LocalizedContent("Which country is the largest wine producer in the world?", listOf("Italy", "France", "Spain", "United States"), "Gastronomy", ""),
            zh = LocalizedContent("哪个国家是世界上最大的葡萄酒生产国？", listOf("意大利", "法国", "西班牙", "美国"), "美食", ""),
            es = LocalizedContent("¿Qué país es el mayor productor de vino del mundo?", listOf("Italia", "Francia", "España", "Estados Unidos"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2306, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la spécialité alsacienne à base de choucroute et de viandes ?", listOf("Choucroute garnie", "Baeckeoffe", "Flammekueche", "Coq au Riesling"), "Gastronomie", ""),
            en = LocalizedContent("What is the Alsatian specialty made with sauerkraut and meats?", listOf("Choucroute garnie", "Baeckeoffe", "Flammekueche", "Coq au Riesling"), "Gastronomy", ""),
            zh = LocalizedContent("哪种阿尔萨斯特色菜以酸菜和肉类为原料？", listOf("酸菜配肉", "贝科夫", "火焰薄饼", "雷司令炖鸡"), "美食", ""),
            es = LocalizedContent("¿Cuál es la especialidad alsaciana a base de chucrut y carnes?", listOf("Choucroute garnie", "Baeckeoffe", "Flammekueche", "Coq au Riesling"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2307, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le dessert traditionnel viennois fait de fines couches de pâte avec des pommes ?", listOf("Strudel", "Sachertorte", "Apfelkuchen", "Palatschinken"), "Gastronomie", ""),
            en = LocalizedContent("What is the traditional Viennese dessert made of thin layers of dough with apples?", listOf("Strudel", "Sachertorte", "Apfelkuchen", "Palatschinken"), "Gastronomy", ""),
            zh = LocalizedContent("哪种维也纳传统甜点由薄层面团和苹果制成？", listOf("苹果卷", "萨赫蛋糕", "苹果蛋糕", "薄煎饼"), "美食", ""),
            es = LocalizedContent("¿Cuál es el postre tradicional vienés hecho de finas capas de masa con manzanas?", listOf("Strudel", "Sachertorte", "Apfelkuchen", "Palatschinken"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2308, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays est originaire le sashimi ?", listOf("Japon", "Corée", "Chine", "Vietnam"), "Gastronomie", ""),
            en = LocalizedContent("In which country did sashimi originate?", listOf("Japan", "Korea", "China", "Vietnam"), "Gastronomy", ""),
            zh = LocalizedContent("刺身起源于哪个国家？", listOf("日本", "韩国", "中国", "越南"), "美食", ""),
            es = LocalizedContent("¿En qué país se originó el sashimi?", listOf("Japón", "Corea", "China", "Vietnam"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2309, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fromage est indispensable dans une vraie Carbonara romaine ?", listOf("Pecorino Romano", "Parmesan", "Ricotta", "Grana Padano"), "Gastronomie", ""),
            en = LocalizedContent("Which cheese is essential in a true Roman Carbonara?", listOf("Pecorino Romano", "Parmesan", "Ricotta", "Grana Padano"), "Gastronomy", ""),
            zh = LocalizedContent("哪种奶酪是正宗罗马风味卡博纳拉面的必备？", listOf("罗马佩科里诺", "帕尔马干酪", "里科塔", "格拉纳帕达诺"), "美食", ""),
            es = LocalizedContent("¿Qué queso es indispensable en una auténtica Carbonara romana?", listOf("Pecorino Romano", "Parmesano", "Ricotta", "Grana Padano"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2310, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la sauce worcestershire ?", listOf("Sauce fermentée anglaise à base d'anchois", "Sauce piquante américaine", "Sauce asiatique à la prune", "Condiment moutardé"), "Gastronomie", ""),
            en = LocalizedContent("What is Worcestershire sauce?", listOf("English fermented sauce based on anchovies", "American spicy sauce", "Asian plum sauce", "Mustard condiment"), "Gastronomy", ""),
            zh = LocalizedContent("伍斯特酱是什么？", listOf("以鳀鱼为基础的英国发酵酱", "美国辣酱", "亚洲梅子酱", "芥末调味品"), "美食", ""),
            es = LocalizedContent("¿Qué es la salsa Worcestershire?", listOf("Salsa fermentada inglesa a base de anchoas", "Salsa picante americana", "Salsa asiática de ciruela", "Condimento de mostaza"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2311, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de l'Espagne souvent servi froid ?", listOf("Gazpacho", "Paella", "Cocido", "Tortilla española"), "Gastronomie", ""),
            en = LocalizedContent("What is the national dish of Spain often served cold?", listOf("Gazpacho", "Paella", "Cocido", "Tortilla española"), "Gastronomy", ""),
            zh = LocalizedContent("哪种西班牙国菜通常冷食？", listOf("西班牙冷汤", "海鲜饭", "炖菜", "西班牙土豆饼"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato nacional de España que a menudo se sirve frío?", listOf("Gazpacho", "Paella", "Cocido", "Tortilla española"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2312, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle épice donne sa couleur jaune au curry ?", listOf("Curcuma", "Safran", "Cumin", "Paprika"), "Gastronomie", ""),
            en = LocalizedContent("Which spice gives curry its yellow color?", listOf("Turmeric", "Saffron", "Cumin", "Paprika"), "Gastronomy", ""),
            zh = LocalizedContent("哪种香料赋予咖喱黄色？", listOf("姜黄", "藏红花", "孜然", "红椒粉"), "美食", ""),
            es = LocalizedContent("¿Qué especia da su color amarillo al curry?", listOf("Cúrcuma", "Azafrán", "Comino", "Pimentón"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2313, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de la Belgique ?", listOf("Moules-frites", "Waterzooi", "Stoofvlees", "Carbonnade flamande"), "Gastronomie", ""),
            en = LocalizedContent("What is the national dish of Belgium?", listOf("Moules-frites", "Waterzooi", "Stoofvlees", "Carbonnade flamande"), "Gastronomy", ""),
            zh = LocalizedContent("比利时的国菜是什么？", listOf("贻贝薯条", "水煮鱼", "炖牛肉", "佛兰德炖菜"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato nacional de Bélgica?", listOf("Moules-frites", "Waterzooi", "Stoofvlees", "Carbonnade flamande"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2314, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle ville française est originaire la bouillabaisse ?", listOf("Marseille", "Nice", "Toulon", "Montpellier"), "Gastronomie", ""),
            en = LocalizedContent("In which French city did bouillabaisse originate?", listOf("Marseille", "Nice", "Toulon", "Montpellier"), "Gastronomy", ""),
            zh = LocalizedContent("马赛鱼汤起源于法国哪个城市？", listOf("马赛", "尼斯", "土伦", "蒙彼利埃"), "美食", ""),
            es = LocalizedContent("¿En qué ciudad francesa se originó la bouillabaisse?", listOf("Marsella", "Niza", "Tolón", "Montpellier"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2315, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le prosciutto di Parma ?", listOf("Jambon cru de Parme (Italie)", "Fromage de Parme", "Saucisse italienne", "Pâtes de Parme"), "Gastronomie", ""),
            en = LocalizedContent("What is prosciutto di Parma?", listOf("Parma ham (Italy)", "Parmesan cheese", "Italian sausage", "Parma pasta"), "Gastronomy", ""),
            zh = LocalizedContent("什么是帕尔马火腿？", listOf("意大利帕尔马生火腿", "帕尔马奶酪", "意大利香肠", "帕尔马面食"), "美食", ""),
            es = LocalizedContent("¿Qué es el prosciutto di Parma?", listOf("Jamón crudo de Parma (Italia)", "Queso de Parma", "Salchicha italiana", "Pasta de Parma"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2316, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fruit tropical est aussi appelé 'beurre de la forêt' ?", listOf("Avocat", "Mangue", "Papaye", "Coco"), "Gastronomie", ""),
            en = LocalizedContent("Which tropical fruit is also called 'butter of the forest'?", listOf("Avocado", "Mango", "Papaya", "Coconut"), "Gastronomy", ""),
            zh = LocalizedContent("哪种热带水果也被称为“森林黄油”？", listOf("牛油果", "芒果", "木瓜", "椰子"), "美食", ""),
            es = LocalizedContent("¿Qué fruta tropical también se llama 'mantequilla del bosque'?", listOf("Aguacate", "Mango", "Papaya", "Coco"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2317, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la tempura japonaise ?", listOf("Friture légère de légumes ou fruits de mer", "Gril japonais", "Soupe de nouilles", "Cuisine à la vapeur"), "Gastronomie", ""),
            en = LocalizedContent("What is Japanese tempura?", listOf("Lightly battered and fried vegetables or seafood", "Japanese grill", "Noodle soup", "Steamed cuisine"), "Gastronomy", ""),
            zh = LocalizedContent("什么是日本天妇罗？", listOf("轻裹面糊油炸的蔬菜或海鲜", "日式烧烤", "汤面", "蒸菜"), "美食", ""),
            es = LocalizedContent("¿Qué es la tempura japonesa?", listOf("Fritura ligera de verduras o mariscos", "Parrilla japonesa", "Sopa de fideos", "Cocina al vapor"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2318, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le vin blanc alsacien le plus aromatique ?", listOf("Gewurztraminer", "Riesling", "Pinot Gris", "Muscat"), "Gastronomie", ""),
            en = LocalizedContent("Which is the most aromatic Alsatian white wine?", listOf("Gewurztraminer", "Riesling", "Pinot Gris", "Muscat"), "Gastronomy", ""),
            zh = LocalizedContent("哪种阿尔萨斯白葡萄酒最芳香？", listOf("琼瑶浆", "雷司令", "灰皮诺", "麝香"), "美食", ""),
            es = LocalizedContent("¿Cuál es el vino blanco alsaciano más aromático?", listOf("Gewurztraminer", "Riesling", "Pinot Gris", "Moscatel"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2319, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la principale différence entre gelato et glace ?", listOf("Moins de matière grasse et plus dense dans le gelato", "Le gelato est plus sucré", "La glace est italienne", "Le gelato contient des œufs, pas la glace"), "Gastronomie", ""),
            en = LocalizedContent("What is the main difference between gelato and ice cream?", listOf("Less fat and denser in gelato", "Gelato is sweeter", "Ice cream is Italian", "Gelato contains eggs, ice cream does not"), "Gastronomy", ""),
            zh = LocalizedContent("意式冰淇淋和普通冰淇淋的主要区别是什么？", listOf("意式冰淇淋脂肪更少、更稠密", "意式冰淇淋更甜", "普通冰淇淋是意大利的", "意式冰淇淋含鸡蛋，普通冰淇淋不含"), "美食", ""),
            es = LocalizedContent("¿Cuál es la principal diferencia entre el gelato y el helado?", listOf("Menos grasa y más denso en el gelato", "El gelato es más dulce", "El helado es italiano", "El gelato contiene huevos, el helado no"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2320, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays est originaire le kebab Döner ?", listOf("Turquie", "Grèce", "Liban", "Syrie"), "Gastronomie", ""),
            en = LocalizedContent("In which country did Döner kebab originate?", listOf("Turkey", "Greece", "Lebanon", "Syria"), "Gastronomy", ""),
            zh = LocalizedContent("土耳其烤肉起源于哪个国家？", listOf("土耳其", "希腊", "黎巴嫩", "叙利亚"), "美食", ""),
            es = LocalizedContent("¿En qué país se originó el kebab Döner?", listOf("Turquía", "Grecia", "Líbano", "Siria"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2321, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le tofu ?", listOf("Caillé de lait de soja", "Protéine végétale de blé", "Légume fermenté", "Algue compressée"), "Gastronomie", ""),
            en = LocalizedContent("What is tofu?", listOf("Soybean curd", "Wheat gluten", "Fermented vegetable", "Pressed seaweed"), "Gastronomy", ""),
            zh = LocalizedContent("什么是豆腐？", listOf("大豆凝乳", "面筋", "发酵蔬菜", "压制海藻"), "美食", ""),
            es = LocalizedContent("¿Qué es el tofu?", listOf("Cuajada de leche de soja", "Proteína vegetal de trigo", "Vegetal fermentado", "Alga prensada"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2322, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat traditionnel suisse à base de fromage fondu avec du pain ?", listOf("Fondue au fromage", "Raclette", "Rösti", "Älplermagronen"), "Gastronomie", ""),
            en = LocalizedContent("What is the traditional Swiss dish made of melted cheese with bread?", listOf("Cheese fondue", "Raclette", "Rösti", "Älplermagronen"), "Gastronomy", ""),
            zh = LocalizedContent("传统的瑞士奶酪火锅配面包是什么？", listOf("奶酪火锅", "拉克莱特", "土豆饼", "阿尔卑斯通心粉"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato tradicional suizo a base de queso fundido con pan?", listOf("Fondue de queso", "Raclette", "Rösti", "Älplermagronen"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2323, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quelle région française est produit le Comté ?", listOf("Franche-Comté", "Bourgogne", "Savoie", "Alsace"), "Gastronomie", ""),
            en = LocalizedContent("In which French region is Comté cheese produced?", listOf("Franche-Comté", "Burgundy", "Savoie", "Alsace"), "Gastronomy", ""),
            zh = LocalizedContent("孔泰奶酪产自法国哪个地区？", listOf("弗朗什-孔泰", "勃艮第", "萨瓦", "阿尔萨斯"), "美食", ""),
            es = LocalizedContent("¿En qué región francesa se produce el queso Comté?", listOf("Franco Condado", "Borgoña", "Saboya", "Alsacia"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2324, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le dessert français fait de pâte à choux et crème chiboust ?", listOf("Saint-Honoré", "Paris-Brest", "Éclair", "Religieuse"), "Gastronomie", ""),
            en = LocalizedContent("What is the French dessert made of choux pastry and chiboust cream?", listOf("Saint-Honoré", "Paris-Brest", "Éclair", "Religieuse"), "Gastronomy", ""),
            zh = LocalizedContent("哪种法式甜点由泡芙面团和希布斯特奶油制成？", listOf("圣奥诺雷", "巴黎-布雷斯特", "闪电泡芙", "修女泡芙"), "美食", ""),
            es = LocalizedContent("¿Cuál es el postre francés hecho de masa choux y crema chiboust?", listOf("Saint-Honoré", "Paris-Brest", "Éclair", "Religieuse"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2325, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'umami ?", listOf("Cinquième saveur de base (goût savoureux)", "Épice japonaise", "Type de champignon asiatique", "Fermentation du riz"), "Gastronomie", ""),
            en = LocalizedContent("What is umami?", listOf("Fifth basic taste (savory taste)", "Japanese spice", "Type of Asian mushroom", "Rice fermentation"), "Gastronomy", ""),
            zh = LocalizedContent("什么是鲜味？", listOf("第五种基本味道（鲜味）", "日本香料", "一种亚洲蘑菇", "大米发酵"), "美食", ""),
            es = LocalizedContent("¿Qué es el umami?", listOf("Quinto sabor básico (sabor sabroso)", "Especia japonesa", "Tipo de hongo asiático", "Fermentación del arroz"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2326, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle plante aromatique est essentielle dans le pesto génois ?", listOf("Basilic", "Origan", "Persil", "Thym"), "Gastronomie", ""),
            en = LocalizedContent("Which aromatic plant is essential in Genoese pesto?", listOf("Basil", "Oregano", "Parsley", "Thyme"), "Gastronomy", ""),
            zh = LocalizedContent("哪种香草在热那亚青酱中必不可少？", listOf("罗勒", "牛至", "欧芹", "百里香"), "美食", ""),
            es = LocalizedContent("¿Qué planta aromática es esencial en el pesto genovés?", listOf("Albahaca", "Orégano", "Perejil", "Tomillo"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2327, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays est originaire le ceviche ?", listOf("Pérou", "Mexique", "Brésil", "Équateur"), "Gastronomie", ""),
            en = LocalizedContent("In which country did ceviche originate?", listOf("Peru", "Mexico", "Brazil", "Ecuador"), "Gastronomy", ""),
            zh = LocalizedContent("酸橘汁腌鱼起源于哪个国家？", listOf("秘鲁", "墨西哥", "巴西", "厄瓜多尔"), "美食", ""),
            es = LocalizedContent("¿En qué país se originó el ceviche?", listOf("Perú", "México", "Brasil", "Ecuador"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2328, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fromage à pâte molle normand le plus célèbre ?", listOf("Camembert de Normandie", "Livarot", "Pont-l'Évêque", "Neufchâtel"), "Gastronomie", ""),
            en = LocalizedContent("What is the most famous soft cheese from Normandy?", listOf("Camembert de Normandie", "Livarot", "Pont-l'Évêque", "Neufchâtel"), "Gastronomy", ""),
            zh = LocalizedContent("诺曼底最著名的软质奶酪是什么？", listOf("诺曼底卡门贝尔奶酪", "利瓦罗奶酪", "蓬莱韦克奶酪", "纳沙泰尔奶酪"), "美食", ""),
            es = LocalizedContent("¿Cuál es el queso blando normando más famoso?", listOf("Camembert de Normandía", "Livarot", "Pont-l'Évêque", "Neufchâtel"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2329, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la fermentation lactique ?", listOf("Transformation des sucres en acide lactique par bactéries", "Fermentation du raisin en vin", "Production de levure", "Pasteurisation du lait"), "Gastronomie", ""),
            en = LocalizedContent("What is lactic fermentation?", listOf("Conversion of sugars into lactic acid by bacteria", "Fermentation of grapes into wine", "Production of yeast", "Pasteurization of milk"), "Gastronomy", ""),
            zh = LocalizedContent("什么是乳酸发酵？", listOf("细菌将糖转化为乳酸", "葡萄发酵成葡萄酒", "酵母生产", "牛奶巴氏杀菌"), "美食", ""),
            es = LocalizedContent("¿Qué es la fermentación láctica?", listOf("Transformación de azúcares en ácido láctico por bacterias", "Fermentación de la uva en vino", "Producción de levadura", "Pasteurización de la leche"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 2330, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'ingrédient secret du Coca-Cola selon les théories ?", listOf("Mélange secret d'épices (Merchandise 7X)", "Feuilles de coca", "Noix de kola pure", "Caramel au beurre salé"), "Gastronomie", ""),
            en = LocalizedContent("What is the secret ingredient of Coca-Cola according to theories?", listOf("Secret blend of spices (Merchandise 7X)", "Coca leaves", "Pure kola nut", "Salted butter caramel"), "Gastronomy", ""),
            zh = LocalizedContent("根据理论，可口可乐的秘密成分是什么？", listOf("秘密香料混合物（Merchandise 7X）", "古柯叶", "纯可乐果", "咸黄油焦糖"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente secreto de Coca-Cola según las teorías?", listOf("Mezcla secreta de especias (Merchandise 7X)", "Hojas de coca", "Nuez de cola pura", "Caramelo de mantequilla salada"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3000, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la constante de Planck ?", listOf("Quantum d'action liant énergie et fréquence", "Vitesse de la lumière", "Masse de l'électron", "Charge élémentaire"), "Science", ""),
            en = LocalizedContent("What is Planck's constant?", listOf("Quantum of action linking energy and frequency", "Speed of light", "Mass of electron", "Elementary charge"), "Science", ""),
            zh = LocalizedContent("什么是普朗克常数？", listOf("联系能量和频率的作用量子", "光速", "电子质量", "基本电荷"), "科学", ""),
            es = LocalizedContent("¿Qué es la constante de Planck?", listOf("Cuanto de acción que relaciona energía y frecuencia", "Velocidad de la luz", "Masa del electrón", "Carga elemental"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3001, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la vitesse du son dans l'air à 20°C ?", listOf("343 m/s", "300 m/s", "1500 m/s", "1000 m/s"), "Science", ""),
            en = LocalizedContent("What is the speed of sound in air at 20°C?", listOf("343 m/s", "300 m/s", "1500 m/s", "1000 m/s"), "Science", ""),
            zh = LocalizedContent("20°C时声音在空气中的速度是多少？", listOf("343米/秒", "300米/秒", "1500米/秒", "1000米/秒"), "科学", ""),
            es = LocalizedContent("¿Cuál es la velocidad del sonido en el aire a 20°C?", listOf("343 m/s", "300 m/s", "1500 m/s", "1000 m/s"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3002, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'effet Doppler ?", listOf("Variation de fréquence due au mouvement relatif source/observateur", "Interférence d'ondes", "Réfraction de la lumière", "Diffraction"), "Science", ""),
            en = LocalizedContent("What is the Doppler effect?", listOf("Frequency variation due to relative motion of source/observer", "Wave interference", "Refraction of light", "Diffraction"), "Science", ""),
            zh = LocalizedContent("什么是多普勒效应？", listOf("由于源/观察者相对运动引起的频率变化", "波的干涉", "光的折射", "衍射"), "科学", ""),
            es = LocalizedContent("¿Qué es el efecto Doppler?", listOf("Variación de frecuencia debido al movimiento relativo fuente/observador", "Interferencia de ondas", "Refracción de la luz", "Difracción"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3003, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la loi d'Ohm ?", listOf("U = R × I", "P = U × I", "E = mc²", "F = ma"), "Science", ""),
            en = LocalizedContent("What is Ohm's law?", listOf("U = R × I", "P = U × I", "E = mc²", "F = ma"), "Science", ""),
            zh = LocalizedContent("什么是欧姆定律？", listOf("U = R × I", "P = U × I", "E = mc²", "F = ma"), "科学", ""),
            es = LocalizedContent("¿Qué es la ley de Ohm?", listOf("U = R × I", "P = U × I", "E = mc²", "F = ma"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3004, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un condensateur ?", listOf("Composant stockant de l'énergie électrique", "Résistance variable", "Source de courant", "Transformateur"), "Science", ""),
            en = LocalizedContent("What is a capacitor?", listOf("Component storing electrical energy", "Variable resistor", "Current source", "Transformer"), "Science", ""),
            zh = LocalizedContent("什么是电容器？", listOf("储存电能的元件", "可变电阻", "电流源", "变压器"), "科学", ""),
            es = LocalizedContent("¿Qué es un condensador?", listOf("Componente que almacena energía eléctrica", "Resistencia variable", "Fuente de corriente", "Transformador"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3005, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'induction électromagnétique ?", listOf("Production d'une tension par variation du flux magnétique", "Transmission d'électricité sans fil", "Stockage d'énergie magnétique", "Effet Hall"), "Science", ""),
            en = LocalizedContent("What is electromagnetic induction?", listOf("Production of voltage by variation of magnetic flux", "Wireless transmission of electricity", "Storage of magnetic energy", "Hall effect"), "Science", ""),
            zh = LocalizedContent("什么是电磁感应？", listOf("通过磁通量变化产生电压", "无线电力传输", "磁能存储", "霍尔效应"), "科学", ""),
            es = LocalizedContent("¿Qué es la inducción electromagnética?", listOf("Producción de tensión por variación del flujo magnético", "Transmisión inalámbrica de electricidad", "Almacenamiento de energía magnética", "Efecto Hall"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3006, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la fréquence du courant électrique en Europe ?", listOf("50 Hz", "60 Hz", "100 Hz", "25 Hz"), "Science", ""),
            en = LocalizedContent("What is the frequency of electric current in Europe?", listOf("50 Hz", "60 Hz", "100 Hz", "25 Hz"), "Science", ""),
            zh = LocalizedContent("欧洲电流的频率是多少？", listOf("50赫兹", "60赫兹", "100赫兹", "25赫兹"), "科学", ""),
            es = LocalizedContent("¿Cuál es la frecuencia de la corriente eléctrica en Europa?", listOf("50 Hz", "60 Hz", "100 Hz", "25 Hz"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3007, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'énergie potentielle gravitationnelle ?", listOf("E = mgh", "E = ½mv²", "E = mc²", "E = hf"), "Science", ""),
            en = LocalizedContent("What is gravitational potential energy?", listOf("E = mgh", "E = ½mv²", "E = mc²", "E = hf"), "Science", ""),
            zh = LocalizedContent("什么是重力势能？", listOf("E = mgh", "E = ½mv²", "E = mc²", "E = hf"), "科学", ""),
            es = LocalizedContent("¿Qué es la energía potencial gravitatoria?", listOf("E = mgh", "E = ½mv²", "E = mc²", "E = hf"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3008, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un laser ?", listOf("Amplification de lumière par émission stimulée de rayonnement", "Lumière blanche concentrée", "Faisceau d'électrons", "Onde radio focalisée"), "Science", ""),
            en = LocalizedContent("What is a laser?", listOf("Light amplification by stimulated emission of radiation", "Concentrated white light", "Electron beam", "Focused radio wave"), "Science", ""),
            zh = LocalizedContent("什么是激光？", listOf("通过受激辐射的光放大", "集中的白光", "电子束", "聚焦的无线电波"), "科学", ""),
            es = LocalizedContent("¿Qué es un láser?", listOf("Amplificación de luz por emisión estimulada de radiación", "Luz blanca concentrada", "Haz de electrones", "Onda de radio enfocada"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3009, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la chaleur spécifique ?", listOf("Énergie pour augmenter d'1°C la température d'1 kg", "Température de fusion", "Chaleur de vaporisation", "Énergie de sublimation"), "Science", ""),
            en = LocalizedContent("What is specific heat?", listOf("Energy to raise temperature of 1 kg by 1°C", "Melting temperature", "Heat of vaporization", "Energy of sublimation"), "Science", ""),
            zh = LocalizedContent("什么是比热容？", listOf("使1千克物质温度升高1°C所需的能量", "熔化温度", "汽化热", "升华能"), "科学", ""),
            es = LocalizedContent("¿Qué es el calor específico?", listOf("Energía para aumentar 1°C la temperatura de 1 kg", "Temperatura de fusión", "Calor de vaporización", "Energía de sublimación"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le rayonnement gamma ?", listOf("Rayonnement électromagnétique de très haute énergie", "Flux d'électrons", "Flux de neutrons", "Flux d'hélium-4"), "Science", ""),
            en = LocalizedContent("What is gamma radiation?", listOf("Very high energy electromagnetic radiation", "Electron flux", "Neutron flux", "Helium-4 flux"), "Science", ""),
            zh = LocalizedContent("什么是伽马辐射？", listOf("极高能量的电磁辐射", "电子流", "中子流", "氦-4流"), "科学", ""),
            es = LocalizedContent("¿Qué es la radiación gamma?", listOf("Radiación electromagnética de muy alta energía", "Flujo de electrones", "Flujo de neutrones", "Flujo de helio-4"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3011, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle particule est antimatière de l'électron ?", listOf("Positron", "Antiproton", "Antineutron", "Neutrino"), "Science", ""),
            en = LocalizedContent("Which particle is the antimatter of the electron?", listOf("Positron", "Antiproton", "Antineutron", "Neutrino"), "Science", ""),
            zh = LocalizedContent("哪种粒子是电子的反物质？", listOf("正电子", "反质子", "反中子", "中微子"), "科学", ""),
            es = LocalizedContent("¿Qué partícula es la antimateria del electrón?", listOf("Positrón", "Antiprotón", "Antineutrón", "Neutrino"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'effet photoélectrique ?", listOf("Émission d'électrons par un métal sous lumière", "Fluorescence d'un matériau", "Réflexion de photons", "Absorption de rayonnement"), "Science", ""),
            en = LocalizedContent("What is the photoelectric effect?", listOf("Emission of electrons from a metal under light", "Fluorescence of a material", "Reflection of photons", "Absorption of radiation"), "Science", ""),
            zh = LocalizedContent("什么是光电效应？", listOf("金属在光照下发射电子", "材料的荧光", "光子的反射", "辐射的吸收"), "科学", ""),
            es = LocalizedContent("¿Qué es el efecto fotoeléctrico?", listOf("Emisión de electrones por un metal bajo luz", "Fluorescencia de un material", "Reflexión de fotones", "Absorción de radiación"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3013, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule de la puissance électrique ?", listOf("P = U × I", "P = U / I", "P = I / U", "P = U + I"), "Science", ""),
            en = LocalizedContent("What is the formula for electrical power?", listOf("P = U × I", "P = U / I", "P = I / U", "P = U + I"), "Science", ""),
            zh = LocalizedContent("电功率的公式是什么？", listOf("P = U × I", "P = U / I", "P = I / U", "P = U + I"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula de la potencia eléctrica?", listOf("P = U × I", "P = U / I", "P = I / U", "P = U + I"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3014, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un supraconducteur ?", listOf("Matériau avec résistance électrique nulle à basse température", "Matériau transparent à la lumière", "Semi-conducteur amélioré", "Isolant parfait"), "Science", ""),
            en = LocalizedContent("What is a superconductor?", listOf("Material with zero electrical resistance at low temperature", "Material transparent to light", "Improved semiconductor", "Perfect insulator"), "Science", ""),
            zh = LocalizedContent("什么是超导体？", listOf("低温下电阻为零的材料", "透光的材料", "改进的半导体", "完美绝缘体"), "科学", ""),
            es = LocalizedContent("¿Qué es un superconductor?", listOf("Material con resistencia eléctrica nula a baja temperatura", "Material transparente a la luz", "Semiconductor mejorado", "Aislante perfecto"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3015, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le numéro atomique de l'or ?", listOf("79", "72", "82", "74"), "Science", ""),
            en = LocalizedContent("What is the atomic number of gold?", listOf("79", "72", "82", "74"), "Science", ""),
            zh = LocalizedContent("金的原子序数是多少？", listOf("79", "72", "82", "74"), "科学", ""),
            es = LocalizedContent("¿Cuál es el número atómico del oro?", listOf("79", "72", "82", "74"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3016, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la polymérisation ?", listOf("Association de monomères en longues chaînes", "Décomposition d'un polymère", "Réaction acide-base", "Distillation fractionnée"), "Science", ""),
            en = LocalizedContent("What is polymerization?", listOf("Association of monomers into long chains", "Decomposition of a polymer", "Acid-base reaction", "Fractional distillation"), "Science", ""),
            zh = LocalizedContent("什么是聚合反应？", listOf("单体结合成长链", "聚合物的分解", "酸碱反应", "分馏"), "科学", ""),
            es = LocalizedContent("¿Qué es la polimerización?", listOf("Asociación de monómeros en cadenas largas", "Descomposición de un polímero", "Reacción ácido-base", "Destilación fraccionada"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3017, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'élément le plus électronégatif du tableau périodique ?", listOf("Fluor", "Oxygène", "Chlore", "Azote"), "Science", ""),
            en = LocalizedContent("What is the most electronegative element in the periodic table?", listOf("Fluorine", "Oxygen", "Chlorine", "Nitrogen"), "Science", ""),
            zh = LocalizedContent("元素周期表中电负性最强的元素是什么？", listOf("氟", "氧", "氯", "氮"), "科学", ""),
            es = LocalizedContent("¿Cuál es el elemento más electronegativo de la tabla periódica?", listOf("Flúor", "Oxígeno", "Cloro", "Nitrógeno"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3018, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la loi de conservation de la masse ?", listOf("La masse totale des réactifs égale celle des produits", "L'énergie se conserve", "La pression est constante", "Le volume est constant"), "Science", ""),
            en = LocalizedContent("What is the law of conservation of mass?", listOf("The total mass of reactants equals that of products", "Energy is conserved", "Pressure is constant", "Volume is constant"), "Science", ""),
            zh = LocalizedContent("什么是质量守恒定律？", listOf("反应物的总质量等于产物的总质量", "能量守恒", "压力恒定", "体积恒定"), "科学", ""),
            es = LocalizedContent("¿Qué es la ley de conservación de la masa?", listOf("La masa total de los reactivos es igual a la de los productos", "La energía se conserva", "La presión es constante", "El volumen es constante"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3019, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la formule de l'acide sulfurique ?", listOf("H₂SO₄", "H₂SO₃", "HCl", "HNO₃"), "Science", ""),
            en = LocalizedContent("What is the formula for sulfuric acid?", listOf("H₂SO₄", "H₂SO₃", "HCl", "HNO₃"), "Science", ""),
            zh = LocalizedContent("硫酸的化学式是什么？", listOf("H₂SO₄", "H₂SO₃", "HCl", "HNO₃"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula del ácido sulfúrico?", listOf("H₂SO₄", "H₂SO₃", "HCl", "HNO₃"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3020, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un isomère ?", listOf("Molécule même formule brute mais structure différente", "Molécule identique", "Polymère", "Isotope d'un élément"), "Science", ""),
            en = LocalizedContent("What is an isomer?", listOf("Molecule with same molecular formula but different structure", "Identical molecule", "Polymer", "Isotope of an element"), "Science", ""),
            zh = LocalizedContent("什么是同分异构体？", listOf("分子式相同但结构不同的分子", "相同的分子", "聚合物", "元素的同位素"), "科学", ""),
            es = LocalizedContent("¿Qué es un isómero?", listOf("Molécula con la misma fórmula molecular pero estructura diferente", "Molécula idéntica", "Polímero", "Isótopo de un elemento"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3021, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gaz provoque l'effet de serre en plus grande quantité ?", listOf("Vapeur d'eau", "CO₂", "Méthane", "Ozone"), "Science", ""),
            en = LocalizedContent("Which gas causes the greenhouse effect in the largest quantity?", listOf("Water vapor", "CO₂", "Methane", "Ozone"), "Science", ""),
            zh = LocalizedContent("哪种气体导致温室效应的量最大？", listOf("水蒸气", "二氧化碳", "甲烷", "臭氧"), "科学", ""),
            es = LocalizedContent("¿Qué gas provoca el efecto invernadero en mayor cantidad?", listOf("Vapor de agua", "CO₂", "Metano", "Ozono"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la neutralisation ?", listOf("Réaction entre acide et base donnant sel et eau", "Combustion d'un corps", "Oxydation d'un métal", "Dissolution d'un sel"), "Science", ""),
            en = LocalizedContent("What is neutralization?", listOf("Reaction between acid and base producing salt and water", "Combustion of a body", "Oxidation of a metal", "Dissolution of a salt"), "Science", ""),
            zh = LocalizedContent("什么是中和反应？", listOf("酸和碱反应生成盐和水", "燃烧", "金属的氧化", "盐的溶解"), "科学", ""),
            es = LocalizedContent("¿Qué es la neutralización?", listOf("Reacción entre ácido y base que produce sal y agua", "Combustión de un cuerpo", "Oxidación de un metal", "Disolución de una sal"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3023, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique du potassium ?", listOf("K", "Po", "Pt", "Ps"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for potassium?", listOf("K", "Po", "Pt", "Ps"), "Science", ""),
            zh = LocalizedContent("钾的化学符号是什么？", listOf("K", "Po", "Pt", "Ps"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo químico del potasio?", listOf("K", "Po", "Pt", "Ps"), "Ciencia", "")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 3024, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la radioactivité alpha ?", listOf("Émission d'un noyau d'hélium-4", "Émission d'un électron", "Émission de photons gamma", "Capture d'un proton"), "Science", ""),
            en = LocalizedContent("What is alpha radioactivity?", listOf("Emission of a helium-4 nucleus", "Emission of an electron", "Emission of gamma photons", "Capture of a proton"), "Science", ""),
            zh = LocalizedContent("什么是α放射性？", listOf("发射氦-4原子核", "发射电子", "发射伽马光子", "捕获质子"), "科学", ""),
            es = LocalizedContent("¿Qué es la radiactividad alfa?", listOf("Emisión de un núcleo de helio-4", "Emisión de un electrón", "Emisión de fotones gamma", "Captura de un protón"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3025, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la photosynthèse ?", listOf("Transformation CO₂ + H₂O en glucose par la lumière", "Respiration cellulaire", "Dégradation de glucides", "Production d'ATP"), "Science", ""),
            en = LocalizedContent("What is photosynthesis?", listOf("Conversion of CO₂ + H₂O into glucose using light", "Cellular respiration", "Degradation of carbohydrates", "Production of ATP"), "Science", ""),
            zh = LocalizedContent("什么是光合作用？", listOf("利用光将二氧化碳和水转化为葡萄糖", "细胞呼吸", "碳水化合物的分解", "产生ATP"), "科学", ""),
            es = LocalizedContent("¿Qué es la fotosíntesis?", listOf("Transformación de CO₂ + H₂O en glucosa mediante la luz", "Respiración celular", "Degradación de carbohidratos", "Producción de ATP"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3026, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel organite est le siège de la synthèse protéique ?", listOf("Le ribosome", "Le noyau", "La mitochondrie", "Le lysosome"), "Science", ""),
            en = LocalizedContent("Which organelle is the site of protein synthesis?", listOf("Ribosome", "Nucleus", "Mitochondrion", "Lysosome"), "Science", ""),
            zh = LocalizedContent("哪个细胞器是蛋白质合成的场所？", listOf("核糖体", "细胞核", "线粒体", "溶酶体"), "科学", ""),
            es = LocalizedContent("¿Qué orgánulo es el sitio de la síntesis de proteínas?", listOf("El ribosoma", "El núcleo", "La mitocondria", "El lisosoma"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3027, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un anticorps ?", listOf("Protéine du système immunitaire reconnaissant un antigène", "Cellule tueuse", "Hormone anti-inflammatoire", "Enzyme de digestion"), "Science", ""),
            en = LocalizedContent("What is an antibody?", listOf("Protein of the immune system that recognizes an antigen", "Killer cell", "Anti-inflammatory hormone", "Digestive enzyme"), "Science", ""),
            zh = LocalizedContent("什么是抗体？", listOf("识别抗原的免疫系统蛋白质", "杀伤细胞", "抗炎激素", "消化酶"), "科学", ""),
            es = LocalizedContent("¿Qué es un anticuerpo?", listOf("Proteína del sistema inmunitario que reconoce un antígeno", "Célula asesina", "Hormona antiinflamatoria", "Enzima digestiva"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3028, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la fonction du pancréas exocrine ?", listOf("Produire des enzymes digestives", "Réguler la glycémie", "Filtrer le sang", "Produire la bile"), "Science", ""),
            en = LocalizedContent("What is the function of the exocrine pancreas?", listOf("Produce digestive enzymes", "Regulate blood sugar", "Filter blood", "Produce bile"), "Science", ""),
            zh = LocalizedContent("外分泌胰腺的功能是什么？", listOf("产生消化酶", "调节血糖", "过滤血液", "产生胆汁"), "科学", ""),
            es = LocalizedContent("¿Cuál es la función del páncreas exocrino?", listOf("Producir enzimas digestivas", "Regular la glucosa en sangre", "Filtrar la sangre", "Producir bilis"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3029, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'évolution par sélection naturelle ?", listOf("Les individus mieux adaptés survivent et se reproduisent plus", "Mutation aléatoire uniquement", "Adaptation dirigée par l'environnement", "Héritage des caractères acquis"), "Science", ""),
            en = LocalizedContent("What is evolution by natural selection?", listOf("Better adapted individuals survive and reproduce more", "Random mutation only", "Directed adaptation by the environment", "Inheritance of acquired characteristics"), "Science", ""),
            zh = LocalizedContent("什么是自然选择进化？", listOf("适应更好的个体生存并繁殖更多", "仅随机突变", "环境引导的适应", "获得性遗传"), "科学", ""),
            es = LocalizedContent("¿Qué es la evolución por selección natural?", listOf("Los individuos mejor adaptados sobreviven y se reproducen más", "Solo mutación aleatoria", "Adaptación dirigida por el ambiente", "Herencia de caracteres adquiridos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3030, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle de l'ARN messager ?", listOf("Transporter l'info génétique du noyau aux ribosomes", "Stocker l'information génétique", "Réguler la division cellulaire", "Transporter les protéines"), "Science", ""),
            en = LocalizedContent("What is the role of messenger RNA?", listOf("Carry genetic information from the nucleus to ribosomes", "Store genetic information", "Regulate cell division", "Transport proteins"), "Science", ""),
            zh = LocalizedContent("信使RNA的作用是什么？", listOf("将遗传信息从细胞核运送到核糖体", "储存遗传信息", "调节细胞分裂", "运输蛋白质"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel del ARN mensajero?", listOf("Transportar la información genética del núcleo a los ribosomas", "Almacenar la información genética", "Regular la división celular", "Transportar proteínas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de chromosomes possède une cellule somatique humaine ?", listOf("46", "23", "48", "44"), "Science", ""),
            en = LocalizedContent("How many chromosomes does a human somatic cell have?", listOf("46", "23", "48", "44"), "Science", ""),
            zh = LocalizedContent("人类体细胞有多少条染色体？", listOf("46", "23", "48", "44"), "科学", ""),
            es = LocalizedContent("¿Cuántos cromosomas tiene una célula somática humana?", listOf("46", "23", "48", "44"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3032, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la symbiose ?", listOf("Relation mutuellement bénéfique entre deux espèces", "Relation où une espèce parasite l'autre", "Compétition entre espèces", "Prédation"), "Science", ""),
            en = LocalizedContent("What is symbiosis?", listOf("Mutually beneficial relationship between two species", "Relationship where one species parasitizes another", "Competition between species", "Predation"), "Science", ""),
            zh = LocalizedContent("什么是共生？", listOf("两个物种之间互惠互利的关系", "一个物种寄生另一个物种的关系", "物种间的竞争", "捕食"), "科学", ""),
            es = LocalizedContent("¿Qué es la simbiosis?", listOf("Relación mutuamente beneficiosa entre dos especies", "Relación donde una especie parasita a otra", "Competencia entre especies", "Depredación"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3033, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle du foie dans la digestion ?", listOf("Produire la bile pour émulsifier les graisses", "Produire des enzymes pancréatiques", "Absorber les nutriments", "Contrôler le péristaltisme"), "Science", ""),
            en = LocalizedContent("What is the role of the liver in digestion?", listOf("Produce bile to emulsify fats", "Produce pancreatic enzymes", "Absorb nutrients", "Control peristalsis"), "Science", ""),
            zh = LocalizedContent("肝脏在消化中的作用是什么？", listOf("产生胆汁以乳化脂肪", "产生胰酶", "吸收营养", "控制蠕动"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel del hígado en la digestión?", listOf("Producir bilis para emulsionar las grasas", "Producir enzimas pancreáticas", "Absorber nutrientes", "Controlar el peristaltismo"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3034, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la méiose produit chez l'homme ?", listOf("Des spermatozoïdes avec 23 chromosomes", "Des cellules à 46 chromosomes", "Des cellules identiques à la mère", "Des globules blancs"), "Science", ""),
            en = LocalizedContent("What does meiosis produce in humans?", listOf("Sperm cells with 23 chromosomes", "Cells with 46 chromosomes", "Cells identical to the mother", "White blood cells"), "Science", ""),
            zh = LocalizedContent("人类减数分裂产生什么？", listOf("含有23条染色体的精子", "含有46条染色体的细胞", "与母细胞相同的细胞", "白细胞"), "科学", ""),
            es = LocalizedContent("¿Qué produce la meiosis en los humanos?", listOf("Espermatozoides con 23 cromosomas", "Células con 46 cromosomas", "Células idénticas a la madre", "Glóbulos blancos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3036, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand cratère d'impact connu sur Terre ?", listOf("Vredefort en Afrique du Sud", "Chicxulub au Mexique", "Sudbury au Canada", "Popigai en Russie"), "Science", ""),
            en = LocalizedContent("What is the largest known impact crater on Earth?", listOf("Vredefort in South Africa", "Chicxulub in Mexico", "Sudbury in Canada", "Popigai in Russia"), "Science", ""),
            zh = LocalizedContent("地球上已知最大的撞击坑是什么？", listOf("南非弗里德堡", "墨西哥希克苏鲁伯", "加拿大萨德伯里", "俄罗斯波皮盖"), "科学", ""),
            es = LocalizedContent("¿Cuál es el cráter de impacto más grande conocido en la Tierra?", listOf("Vredefort en Sudáfrica", "Chicxulub en México", "Sudbury en Canadá", "Popigai en Rusia"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3038, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la galaxie la plus proche de la Voie Lactée ?", listOf("Andromède (M31)", "Triangulum", "Magellan", "Whirlpool"), "Science", ""),
            en = LocalizedContent("What is the name of the closest galaxy to the Milky Way?", listOf("Andromeda (M31)", "Triangulum", "Magellan", "Whirlpool"), "Science", ""),
            zh = LocalizedContent("离银河系最近的星系叫什么？", listOf("仙女座星系（M31）", "三角座星系", "麦哲伦星系", "涡状星系"), "科学", ""),
            es = LocalizedContent("¿Cuál es el nombre de la galaxia más cercana a la Vía Láctea?", listOf("Andrómeda (M31)", "Triángulo", "Magallanes", "Remolino"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3039, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le Big Bang ?", listOf("Expansion initiale de l'univers il y a ~13,8 milliards d'années", "Explosion d'une supernova", "Collision de deux galaxies", "Formation du Système Solaire"), "Science", ""),
            en = LocalizedContent("What is the Big Bang?", listOf("Initial expansion of the universe about 13.8 billion years ago", "Explosion of a supernova", "Collision of two galaxies", "Formation of the Solar System"), "Science", ""),
            zh = LocalizedContent("什么是大爆炸？", listOf("约138亿年前宇宙的初始膨胀", "超新星爆炸", "两个星系碰撞", "太阳系形成"), "科学", ""),
            es = LocalizedContent("¿Qué es el Big Bang?", listOf("Expansión inicial del universo hace unos 13.800 millones de años", "Explosión de una supernova", "Colisión de dos galaxias", "Formación del Sistema Solar"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 3041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé l'Empire mongol ?", listOf("Gengis Khan", "Kubilai Khan", "Tamerlan", "Attila"), "Histoire", ""),
            en = LocalizedContent("Who founded the Mongol Empire?", listOf("Genghis Khan", "Kublai Khan", "Tamerlane", "Attila"), "History", ""),
            zh = LocalizedContent("谁建立了蒙古帝国？", listOf("成吉思汗", "忽必烈", "帖木儿", "阿提拉"), "历史", ""),
            es = LocalizedContent("¿Quién fundó el Imperio mongol?", listOf("Gengis Kan", "Kublai Kan", "Tamerlán", "Atila"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3042, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle civilisation a construit Machu Picchu ?", listOf("Les Incas", "Les Aztèques", "Les Mayas", "Les Olmèques"), "Histoire", ""),
            en = LocalizedContent("Which civilization built Machu Picchu?", listOf("The Incas", "The Aztecs", "The Mayas", "The Olmecs"), "History", ""),
            zh = LocalizedContent("哪个文明建造了马丘比丘？", listOf("印加文明", "阿兹特克文明", "玛雅文明", "奥尔梅克文明"), "历史", ""),
            es = LocalizedContent("¿Qué civilización construyó Machu Picchu?", listOf("Los incas", "Los aztecas", "Los mayas", "Los olmecas"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3043, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Christophe Colomb est-il arrivé en Amérique ?", listOf("1492", "1498", "1488", "1500"), "Histoire", ""),
            en = LocalizedContent("In what year did Christopher Columbus arrive in America?", listOf("1492", "1498", "1488", "1500"), "History", ""),
            zh = LocalizedContent("克里斯托弗·哥伦布在哪一年到达美洲？", listOf("1492年", "1498年", "1488年", "1500年"), "历史", ""),
            es = LocalizedContent("¿En qué año llegó Cristóbal Colón a América?", listOf("1492", "1498", "1488", "1500"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3044, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le premier tsar de Russie ?", listOf("Ivan le Terrible", "Pierre le Grand", "Catherine II", "Alexandre Ier"), "Histoire", ""),
            en = LocalizedContent("Who was the first Tsar of Russia?", listOf("Ivan the Terrible", "Peter the Great", "Catherine II", "Alexander I"), "History", ""),
            zh = LocalizedContent("谁是俄罗斯第一位沙皇？", listOf("伊凡雷帝", "彼得大帝", "叶卡捷琳娜二世", "亚历山大一世"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer zar de Rusia?", listOf("Iván el Terrible", "Pedro el Grande", "Catalina II", "Alejandro I"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3045, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle guerre opposa l'Angleterre à la France pendant 116 ans ?", listOf("Guerre de Cent Ans", "Guerre des Roses", "Guerre de Trente Ans", "Croisades"), "Histoire", ""),
            en = LocalizedContent("Which war pitted England against France for 116 years?", listOf("Hundred Years' War", "War of the Roses", "Thirty Years' War", "Crusades"), "History", ""),
            zh = LocalizedContent("哪场战争使英格兰和法国对抗了116年？", listOf("百年战争", "玫瑰战争", "三十年战争", "十字军东征"), "历史", ""),
            es = LocalizedContent("¿Qué guerra enfrentó a Inglaterra y Francia durante 116 años?", listOf("Guerra de los Cien Años", "Guerra de las Rosas", "Guerra de los Treinta Años", "Cruzadas"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3046, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pharaon a fait construire le temple d'Abou Simbel ?", listOf("Ramsès II", "Toutânkhamon", "Akhenaton", "Thoutmosis III"), "Histoire", ""),
            en = LocalizedContent("Which pharaoh built the temple of Abu Simbel?", listOf("Ramesses II", "Tutankhamun", "Akhenaten", "Thutmose III"), "History", ""),
            zh = LocalizedContent("哪位法老建造了阿布辛贝神庙？", listOf("拉美西斯二世", "图坦卡蒙", "阿肯那顿", "图特摩斯三世"), "历史", ""),
            es = LocalizedContent("¿Qué faraón construyó el templo de Abu Simbel?", listOf("Ramsés II", "Tutankamón", "Akenatón", "Tutmosis III"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3047, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est l'origine du nom 'Europe' ?", listOf("Princesse phénicienne de la mythologie grecque", "Mot latin pour 'soleil couchant'", "Terme grec pour 'large'", "Nom d'un roi romain"), "Histoire", ""),
            en = LocalizedContent("What is the origin of the name 'Europe'?", listOf("Phoenician princess in Greek mythology", "Latin word for 'setting sun'", "Greek term for 'wide'", "Name of a Roman king"), "History", ""),
            zh = LocalizedContent("“欧洲”这个名字的起源是什么？", listOf("希腊神话中的腓尼基公主", "拉丁语中“落日”的意思", "希腊语中“宽阔”的意思", "一位罗马国王的名字"), "历史", ""),
            es = LocalizedContent("¿Cuál es el origen del nombre 'Europa'?", listOf("Princesa fenicia de la mitología griega", "Palabra latina para 'sol poniente'", "Término griego para 'ancho'", "Nombre de un rey romano"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3049, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année fut construite la Grande Muraille de Chine (début) ?", listOf("7e siècle av. J.-C.", "3e siècle av. J.-C.", "1er siècle ap. J.-C.", "5e siècle av. J.-C."), "Histoire", ""),
            en = LocalizedContent("In which year was the Great Wall of China (beginning) built?", listOf("7th century BC", "3rd century BC", "1st century AD", "5th century BC"), "History", ""),
            zh = LocalizedContent("中国的万里长城始建于哪一年？", listOf("公元前7世纪", "公元前3世纪", "公元1世纪", "公元前5世纪"), "历史", ""),
            es = LocalizedContent("¿En qué año se construyó la Gran Muralla China (inicio)?", listOf("Siglo VII a.C.", "Siglo III a.C.", "Siglo I d.C.", "Siglo V a.C."), "Historia", "")
        ),
        BilingualQuestion(
            id = 3050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le premier Consul de France avant de devenir Empereur ?", listOf("Napoléon Bonaparte", "Robespierre", "Danton", "Louis XVI"), "Histoire", ""),
            en = LocalizedContent("Who was the first Consul of France before becoming Emperor?", listOf("Napoleon Bonaparte", "Robespierre", "Danton", "Louis XVI"), "History", ""),
            zh = LocalizedContent("谁在成为皇帝之前是法国的第一执政官？", listOf("拿破仑·波拿巴", "罗伯斯庇尔", "丹东", "路易十六"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer Cónsul de Francia antes de convertirse en Emperador?", listOf("Napoleón Bonaparte", "Robespierre", "Danton", "Luis XVI"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3051, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle bataille a marqué la fin de l'Empire carolingien ?", listOf("Bataille de Fontenoy (841)", "Bataille de Poitiers (732)", "Bataille d'Hastings (1066)", "Bataille de Bouvines (1214)"), "Histoire", ""),
            en = LocalizedContent("Which battle marked the end of the Carolingian Empire?", listOf("Battle of Fontenoy (841)", "Battle of Poitiers (732)", "Battle of Hastings (1066)", "Battle of Bouvines (1214)"), "History", ""),
            zh = LocalizedContent("哪场战役标志着加洛林帝国的终结？", listOf("丰特努瓦战役（841年）", "普瓦捷战役（732年）", "黑斯廷斯战役（1066年）", "布汶战役（1214年）"), "历史", ""),
            es = LocalizedContent("¿Qué batalla marcó el fin del Imperio Carolingio?", listOf("Batalla de Fontenoy (841)", "Batalla de Poitiers (732)", "Batalla de Hastings (1066)", "Batalla de Bouvines (1214)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3052, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peuple a envahi Rome en 410 ap. J.-C. ?", listOf("Les Wisigoths d'Alaric", "Les Huns d'Attila", "Les Vandales", "Les Ostrogoths"), "Histoire", ""),
            en = LocalizedContent("Which people invaded Rome in 410 AD?", listOf("The Visigoths under Alaric", "The Huns under Attila", "The Vandals", "The Ostrogoths"), "History", ""),
            zh = LocalizedContent("哪个民族在公元410年入侵了罗马？", listOf("阿拉里克率领的西哥特人", "阿提拉率领的匈人", "汪达尔人", "东哥特人"), "历史", ""),
            es = LocalizedContent("¿Qué pueblo invadió Roma en el 410 d.C.?", listOf("Los visigodos de Alarico", "Los hunos de Atila", "Los vándalos", "Los ostrogodos"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3053, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a découvert la pénicilline ?", listOf("Alexander Fleming", "Louis Pasteur", "Robert Koch", "Paul Ehrlich"), "Histoire", ""),
            en = LocalizedContent("Who discovered penicillin?", listOf("Alexander Fleming", "Louis Pasteur", "Robert Koch", "Paul Ehrlich"), "History", ""),
            zh = LocalizedContent("谁发现了青霉素？", listOf("亚历山大·弗莱明", "路易·巴斯德", "罗伯特·科赫", "保罗·埃尔利希"), "历史", ""),
            es = LocalizedContent("¿Quién descubrió la penicilina?", listOf("Alexander Fleming", "Louis Pasteur", "Robert Koch", "Paul Ehrlich"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3054, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle révolution a eu lieu en Russie en 1917 ?", listOf("La Révolution bolchevique", "La Révolution démocratique", "La Révolution libérale", "La Révolution industrielle"), "Histoire", ""),
            en = LocalizedContent("Which revolution took place in Russia in 1917?", listOf("The Bolshevik Revolution", "The Democratic Revolution", "The Liberal Revolution", "The Industrial Revolution"), "History", ""),
            zh = LocalizedContent("1917年俄罗斯发生了什么革命？", listOf("布尔什维克革命", "民主革命", "自由革命", "工业革命"), "历史", ""),
            es = LocalizedContent("¿Qué revolución tuvo lugar en Rusia en 1917?", listOf("La Revolución Bolchevique", "La Revolución Democrática", "La Revolución Liberal", "La Revolución Industrial"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3056, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était le premier Secrétaire général de l'ONU ?", listOf("Trygve Lie", "Dag Hammarskjöld", "U Thant", "Kurt Waldheim"), "Histoire", ""),
            en = LocalizedContent("Who was the first Secretary-General of the UN?", listOf("Trygve Lie", "Dag Hammarskjöld", "U Thant", "Kurt Waldheim"), "History", ""),
            zh = LocalizedContent("谁是联合国第一任秘书长？", listOf("特里格夫·赖伊", "达格·哈马舍尔德", "吴丹", "库尔特·瓦尔德海姆"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer Secretario General de la ONU?", listOf("Trygve Lie", "Dag Hammarskjöld", "U Thant", "Kurt Waldheim"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3057, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire a succédé à l'Empire romain d'Occident ?", listOf("L'Empire byzantin (romain d'Orient)", "L'Empire franc", "L'Empire germanique", "Le Califat arabe"), "Histoire", ""),
            en = LocalizedContent("Which empire succeeded the Western Roman Empire?", listOf("The Byzantine (Eastern Roman) Empire", "The Frankish Empire", "The Germanic Empire", "The Arab Caliphate"), "History", ""),
            zh = LocalizedContent("哪个帝国继承了西罗马帝国？", listOf("拜占庭帝国（东罗马帝国）", "法兰克帝国", "日耳曼帝国", "阿拉伯哈里发国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio sucedió al Imperio Romano de Occidente?", listOf("El Imperio Bizantino (Romano de Oriente)", "El Imperio Franco", "El Imperio Germánico", "El Califato Árabe"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3058, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a débuté la Révolution française ?", listOf("1789", "1793", "1799", "1787"), "Histoire", ""),
            en = LocalizedContent("In which year did the French Revolution begin?", listOf("1789", "1793", "1799", "1787"), "History", ""),
            zh = LocalizedContent("法国大革命始于哪一年？", listOf("1789年", "1793年", "1799年", "1787年"), "历史", ""),
            es = LocalizedContent("¿En qué año comenzó la Revolución Francesa?", listOf("1789", "1793", "1799", "1787"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3059, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le chef des armées confédérées pendant la guerre de Sécession ?", listOf("Robert E. Lee", "Ulysses S. Grant", "Stonewall Jackson", "Jefferson Davis"), "Histoire", ""),
            en = LocalizedContent("Who was the commander of the Confederate armies during the American Civil War?", listOf("Robert E. Lee", "Ulysses S. Grant", "Stonewall Jackson", "Jefferson Davis"), "History", ""),
            zh = LocalizedContent("美国内战期间，谁担任南方邦联军队的指挥官？", listOf("罗伯特·E·李", "尤利西斯·S·格兰特", "石墙杰克逊", "杰斐逊·戴维斯"), "历史", ""),
            es = LocalizedContent("¿Quién fue el comandante de los ejércitos confederados durante la Guerra de Secesión?", listOf("Robert E. Lee", "Ulysses S. Grant", "Stonewall Jackson", "Jefferson Davis"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3061, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a rédigé la Déclaration d'Indépendance américaine ?", listOf("Thomas Jefferson", "Benjamin Franklin", "George Washington", "John Adams"), "Histoire", ""),
            en = LocalizedContent("Who drafted the American Declaration of Independence?", listOf("Thomas Jefferson", "Benjamin Franklin", "George Washington", "John Adams"), "History", ""),
            zh = LocalizedContent("谁起草了美国《独立宣言》？", listOf("托马斯·杰斐逊", "本杰明·富兰克林", "乔治·华盛顿", "约翰·亚当斯"), "历史", ""),
            es = LocalizedContent("¿Quién redactó la Declaración de Independencia de los Estados Unidos?", listOf("Thomas Jefferson", "Benjamin Franklin", "George Washington", "John Adams"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3062, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année fut signé le traité de Westphalie ?", listOf("1648", "1618", "1700", "1683"), "Histoire", ""),
            en = LocalizedContent("In which year was the Treaty of Westphalia signed?", listOf("1648", "1618", "1700", "1683"), "History", ""),
            zh = LocalizedContent("《威斯特伐利亚和约》签署于哪一年？", listOf("1648", "1618", "1700", "1683"), "历史", ""),
            es = LocalizedContent("¿En qué año se firmó el Tratado de Westfalia?", listOf("1648", "1618", "1700", "1683"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3063, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel conquistador a conquis l'Empire aztèque ?", listOf("Hernán Cortés", "Francisco Pizarro", "Vasco de Gama", "Amerigo Vespucci"), "Histoire", ""),
            en = LocalizedContent("Which conquistador conquered the Aztec Empire?", listOf("Hernán Cortés", "Francisco Pizarro", "Vasco da Gama", "Amerigo Vespucci"), "History", ""),
            zh = LocalizedContent("哪位征服者征服了阿兹特克帝国？", listOf("埃尔南·科尔特斯", "弗朗西斯科·皮萨罗", "瓦斯科·达·伽马", "亚美利哥·韦斯普奇"), "历史", ""),
            es = LocalizedContent("¿Qué conquistador conquistó el Imperio azteca?", listOf("Hernán Cortés", "Francisco Pizarro", "Vasco de Gama", "Américo Vespucio"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3064, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la plus ancienne civilisation connue ?", listOf("Sumer (Mésopotamie)", "Égypte ancienne", "Indus", "Chine ancienne"), "Histoire", ""),
            en = LocalizedContent("What is the oldest known civilization?", listOf("Sumer (Mesopotamia)", "Ancient Egypt", "Indus Valley", "Ancient China"), "History", ""),
            zh = LocalizedContent("已知最古老的文明是哪个？", listOf("苏美尔（美索不达米亚）", "古埃及", "印度河流域", "古代中国"), "历史", ""),
            es = LocalizedContent("¿Cuál es la civilización más antigua conocida?", listOf("Sumer (Mesopotamia)", "Antiguo Egipto", "Indo", "Antigua China"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3065, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était roi de France lors de la prise de la Bastille ?", listOf("Louis XVI", "Louis XV", "Louis XIV", "Charles X"), "Histoire", ""),
            en = LocalizedContent("Who was the King of France at the time of the storming of the Bastille?", listOf("Louis XVI", "Louis XV", "Louis XIV", "Charles X"), "History", ""),
            zh = LocalizedContent("攻占巴士底狱时，法国的国王是谁？", listOf("路易十六", "路易十五", "路易十四", "查理十世"), "历史", ""),
            es = LocalizedContent("¿Quién era el rey de Francia en el momento de la toma de la Bastilla?", listOf("Luis XVI", "Luis XV", "Luis XIV", "Carlos X"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3066, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'Algérie a-t-elle obtenu son indépendance ?", listOf("1962", "1958", "1954", "1970"), "Histoire", ""),
            en = LocalizedContent("In which year did Algeria gain its independence?", listOf("1962", "1958", "1954", "1970"), "History", ""),
            zh = LocalizedContent("阿尔及利亚在哪一年获得独立？", listOf("1962", "1958", "1954", "1970"), "历史", ""),
            es = LocalizedContent("¿En qué año Argelia obtuvo su independencia?", listOf("1962", "1958", "1954", "1970"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3067, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a unifié l'Allemagne en 1871 ?", listOf("Otto von Bismarck", "Wilhelm II", "Friedrich le Grand", "Metternich"), "Histoire", ""),
            en = LocalizedContent("Who unified Germany in 1871?", listOf("Otto von Bismarck", "Wilhelm II", "Frederick the Great", "Metternich"), "History", ""),
            zh = LocalizedContent("谁在1871年统一了德国？", listOf("奥托·冯·俾斯麦", "威廉二世", "腓特烈大帝", "梅特涅"), "历史", ""),
            es = LocalizedContent("¿Quién unificó Alemania en 1871?", listOf("Otto von Bismarck", "Guillermo II", "Federico el Grande", "Metternich"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3068, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi anglais a signé la Magna Carta ?", listOf("Jean sans Terre", "Richard Cœur de Lion", "Henri II", "Édouard Ier"), "Histoire", ""),
            en = LocalizedContent("Which English king signed the Magna Carta?", listOf("John Lackland", "Richard the Lionheart", "Henry II", "Edward I"), "History", ""),
            zh = LocalizedContent("哪位英格兰国王签署了《大宪章》？", listOf("约翰王（无地王）", "狮心王理查", "亨利二世", "爱德华一世"), "历史", ""),
            es = LocalizedContent("¿Qué rey inglés firmó la Carta Magna?", listOf("Juan sin Tierra", "Ricardo Corazón de León", "Enrique II", "Eduardo I"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3069, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle bataille de 1453 a marqué la fin de l'Empire byzantin ?", listOf("Chute de Constantinople", "Bataille de Kosovo", "Bataille de Varna", "Siège de Thessalonique"), "Histoire", ""),
            en = LocalizedContent("Which battle in 1453 marked the end of the Byzantine Empire?", listOf("Fall of Constantinople", "Battle of Kosovo", "Battle of Varna", "Siege of Thessalonica"), "History", ""),
            zh = LocalizedContent("1453年的哪场战役标志着拜占庭帝国的终结？", listOf("君士坦丁堡的陷落", "科索沃战役", "瓦尔纳战役", "塞萨洛尼基围城战"), "历史", ""),
            es = LocalizedContent("¿Qué batalla de 1453 marcó el fin del Imperio bizantino?", listOf("Caída de Constantinopla", "Batalla de Kosovo", "Batalla de Varna", "Sitio de Tesalónica"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3070, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le fondateur de l'islam ?", listOf("Mahomet (Muhammad)", "Ali ibn Abi Talib", "Abu Bakr", "Omar ibn al-Khattab"), "Histoire", ""),
            en = LocalizedContent("Who is the founder of Islam?", listOf("Muhammad", "Ali ibn Abi Talib", "Abu Bakr", "Umar ibn al-Khattab"), "History", ""),
            zh = LocalizedContent("伊斯兰教的创始人是谁？", listOf("穆罕默德", "阿里·本·阿比·塔利卜", "阿布·伯克尔", "欧麦尔·本·哈塔卜"), "历史", ""),
            es = LocalizedContent("¿Quién es el fundador del islam?", listOf("Mahoma", "Ali ibn Abi Talib", "Abu Bakr", "Úmar ibn al-Jattab"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3071, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année débuta la Seconde Guerre mondiale ?", listOf("1939", "1938", "1940", "1941"), "Histoire", ""),
            en = LocalizedContent("In which year did World War II begin?", listOf("1939", "1938", "1940", "1941"), "History", ""),
            zh = LocalizedContent("第二次世界大战在哪一年开始？", listOf("1939", "1938", "1940", "1941"), "历史", ""),
            es = LocalizedContent("¿En qué año comenzó la Segunda Guerra Mundial?", listOf("1939", "1938", "1940", "1941"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3072, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a lancé le programme spatial Spoutnik ?", listOf("Union soviétique", "États-Unis", "France", "Royaume-Uni"), "Histoire", ""),
            en = LocalizedContent("Which country launched the Sputnik space program?", listOf("Soviet Union", "United States", "France", "United Kingdom"), "History", ""),
            zh = LocalizedContent("哪个国家发射了斯普特尼克太空计划？", listOf("苏联", "美国", "法国", "英国"), "历史", ""),
            es = LocalizedContent("¿Qué país lanzó el programa espacial Sputnik?", listOf("Unión Soviética", "Estados Unidos", "Francia", "Reino Unido"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3074, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Napoléon fut-il exilé à Sainte-Hélène ?", listOf("1815", "1814", "1821", "1812"), "Histoire", ""),
            en = LocalizedContent("In which year was Napoleon exiled to Saint Helena?", listOf("1815", "1814", "1821", "1812"), "History", ""),
            zh = LocalizedContent("拿破仑在哪一年被流放到圣赫勒拿岛？", listOf("1815", "1814", "1821", "1812"), "历史", ""),
            es = LocalizedContent("¿En qué año fue exiliado Napoleón a Santa Elena?", listOf("1815", "1814", "1821", "1812"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3076, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Empire ottoman ?", listOf("Constantinople/Istanbul", "Ankara", "Bagdad", "Le Caire"), "Histoire", ""),
            en = LocalizedContent("What was the capital of the Ottoman Empire?", listOf("Constantinople/Istanbul", "Ankara", "Baghdad", "Cairo"), "History", ""),
            zh = LocalizedContent("奥斯曼帝国的首都是哪里？", listOf("君士坦丁堡/伊斯坦布尔", "安卡拉", "巴格达", "开罗"), "历史", ""),
            es = LocalizedContent("¿Cuál era la capital del Imperio Otomano?", listOf("Constantinopla/Estambul", "Ankara", "Bagdad", "El Cairo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3077, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année eut lieu la bataille de Waterloo ?", listOf("1815", "1813", "1812", "1814"), "Histoire", ""),
            en = LocalizedContent("In which year did the Battle of Waterloo take place?", listOf("1815", "1813", "1812", "1814"), "History", ""),
            zh = LocalizedContent("滑铁卢战役发生在哪一年？", listOf("1815", "1813", "1812", "1814"), "历史", ""),
            es = LocalizedContent("¿En qué año tuvo lugar la batalla de Waterloo?", listOf("1815", "1813", "1812", "1814"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3078, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a dirigé la Chine communiste à partir de 1949 ?", listOf("Mao Zedong", "Deng Xiaoping", "Chiang Kai-shek", "Zhou Enlai"), "Histoire", ""),
            en = LocalizedContent("Who led Communist China from 1949?", listOf("Mao Zedong", "Deng Xiaoping", "Chiang Kai-shek", "Zhou Enlai"), "History", ""),
            zh = LocalizedContent("从1949年起谁领导了共产主义中国？", listOf("毛泽东", "邓小平", "蒋介石", "周恩来"), "历史", ""),
            es = LocalizedContent("¿Quién dirigió la China comunista a partir de 1949?", listOf("Mao Zedong", "Deng Xiaoping", "Chiang Kai-shek", "Zhou Enlai"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3079, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la date de la Déclaration des droits de l'homme et du citoyen ?", listOf("26 août 1789", "14 juillet 1789", "4 août 1789", "20 juin 1789"), "Histoire", ""),
            en = LocalizedContent("What is the date of the Declaration of the Rights of Man and of the Citizen?", listOf("26 August 1789", "14 July 1789", "4 August 1789", "20 June 1789"), "History", ""),
            zh = LocalizedContent("《人权宣言》的日期是什么？", listOf("1789年8月26日", "1789年7月14日", "1789年8月4日", "1789年6月20日"), "历史", ""),
            es = LocalizedContent("¿Cuál es la fecha de la Declaración de los Derechos del Hombre y del Ciudadano?", listOf("26 de agosto de 1789", "14 de julio de 1789", "4 de agosto de 1789", "20 de junio de 1789"), "Historia", "")
        ),
        BilingualQuestion(
            id = 3082, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit pays du monde par superficie ?", listOf("Vatican", "Monaco", "San Marin", "Liechtenstein"), "Géographie", ""),
            en = LocalizedContent("What is the smallest country in the world by area?", listOf("Vatican City", "Monaco", "San Marino", "Liechtenstein"), "Geography", ""),
            zh = LocalizedContent("世界上面积最小的国家是哪个？", listOf("梵蒂冈", "摩纳哥", "圣马力诺", "列支敦士登"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más pequeño del mundo por superficie?", listOf("Ciudad del Vaticano", "Mónaco", "San Marino", "Liechtenstein"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3083, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le désert chaud le plus grand du monde ?", listOf("Sahara", "Arabie", "Gobi", "Kalahari"), "Géographie", ""),
            en = LocalizedContent("What is the largest hot desert in the world?", listOf("Sahara", "Arabian", "Gobi", "Kalahari"), "Geography", ""),
            zh = LocalizedContent("世界上最大的热带沙漠是哪个？", listOf("撒哈拉沙漠", "阿拉伯沙漠", "戈壁沙漠", "卡拉哈里沙漠"), "地理", ""),
            es = LocalizedContent("¿Cuál es el desierto cálido más grande del mundo?", listOf("Sáhara", "Arábigo", "Gobi", "Kalahari"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3084, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle mer se trouve entre l'Italie et la Grèce ?", listOf("Mer Adriatique/Ionienne", "Mer Tyrrhénienne", "Mer Égée", "Mer Méditerranée"), "Géographie", ""),
            en = LocalizedContent("Which sea lies between Italy and Greece?", listOf("Adriatic/Ionian Sea", "Tyrrhenian Sea", "Aegean Sea", "Mediterranean Sea"), "Geography", ""),
            zh = LocalizedContent("哪个海位于意大利和希腊之间？", listOf("亚得里亚海/爱奥尼亚海", "第勒尼安海", "爱琴海", "地中海"), "地理", ""),
            es = LocalizedContent("¿Qué mar se encuentra entre Italia y Grecia?", listOf("Mar Adriático/Jónico", "Mar Tirreno", "Mar Egeo", "Mar Mediterráneo"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3085, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus haut sommet d'Afrique ?", listOf("Kilimandjaro (5 895 m)", "Mont Kenya", "Ras Dashen", "Mont Cameroun"), "Géographie", ""),
            en = LocalizedContent("What is the highest peak in Africa?", listOf("Kilimanjaro (5,895 m)", "Mount Kenya", "Ras Dashen", "Mount Cameroon"), "Geography", ""),
            zh = LocalizedContent("非洲最高的山峰是什么？", listOf("乞力马扎罗山（5895米）", "肯尼亚山", "拉斯达什山", "喀麦隆山"), "地理", ""),
            es = LocalizedContent("¿Cuál es el pico más alto de África?", listOf("Kilimanjaro (5 895 m)", "Monte Kenia", "Ras Dashen", "Monte Camerún"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3086, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays possède le plus grand nombre d'îles au monde ?", listOf("Suède", "Norvège", "Finlande", "Indonésie"), "Géographie", ""),
            en = LocalizedContent("Which country has the largest number of islands in the world?", listOf("Sweden", "Norway", "Finland", "Indonesia"), "Geography", ""),
            zh = LocalizedContent("哪个国家拥有世界上最多的岛屿？", listOf("瑞典", "挪威", "芬兰", "印度尼西亚"), "地理", ""),
            es = LocalizedContent("¿Qué país tiene el mayor número de islas del mundo?", listOf("Suecia", "Noruega", "Finlandia", "Indonesia"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3089, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Par combien de pays la France métropolitaine est-elle frontalière ?", listOf("8", "6", "7", "9"), "Géographie", ""),
            en = LocalizedContent("How many countries does metropolitan France border?", listOf("8", "6", "7", "9"), "Geography", ""),
            zh = LocalizedContent("法国本土与多少个国家接壤？", listOf("8", "6", "7", "9"), "地理", ""),
            es = LocalizedContent("¿Con cuántos países limita la Francia metropolitana?", listOf("8", "6", "7", "9"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3091, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel détroit sépare l'Afrique de l'Europe ?", listOf("Détroit de Gibraltar", "Détroit de Bosphore", "Détroit de Magellan", "Détroit de Malacca"), "Géographie", ""),
            en = LocalizedContent("Which strait separates Africa from Europe?", listOf("Strait of Gibraltar", "Bosphorus Strait", "Strait of Magellan", "Strait of Malacca"), "Geography", ""),
            zh = LocalizedContent("哪个海峡分隔了非洲和欧洲？", listOf("直布罗陀海峡", "博斯普鲁斯海峡", "麦哲伦海峡", "马六甲海峡"), "地理", ""),
            es = LocalizedContent("¿Qué estrecho separa África de Europa?", listOf("Estrecho de Gibraltar", "Estrecho del Bósforo", "Estrecho de Magallanes", "Estrecho de Malaca"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3092, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert froid du monde ?", listOf("Antarctique", "Arctique", "Gobi", "Patagonie"), "Géographie", ""),
            en = LocalizedContent("What is the largest cold desert in the world?", listOf("Antarctica", "Arctic", "Gobi", "Patagonia"), "Geography", ""),
            zh = LocalizedContent("世界上最大的冷沙漠是什么？", listOf("南极洲", "北极", "戈壁沙漠", "巴塔哥尼亚"), "地理", ""),
            es = LocalizedContent("¿Cuál es el desierto frío más grande del mundo?", listOf("Antártida", "Ártico", "Gobi", "Patagonia"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3093, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville est surnommée 'La Ville des Lumières' ?", listOf("Paris", "New York", "Las Vegas", "Amsterdam"), "Géographie", ""),
            en = LocalizedContent("Which city is nicknamed 'The City of Light'?", listOf("Paris", "New York", "Las Vegas", "Amsterdam"), "Geography", ""),
            zh = LocalizedContent("哪个城市被称为“光之城”？", listOf("巴黎", "纽约", "拉斯维加斯", "阿姆斯特丹"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es apodada 'La Ciudad de la Luz'?", listOf("París", "Nueva York", "Las Vegas", "Ámsterdam"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3094, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fleuve traverse l'Égypte ?", listOf("Le Nil", "Le Congo", "Le Niger", "L'Euphrate"), "Géographie", ""),
            en = LocalizedContent("Which river flows through Egypt?", listOf("The Nile", "The Congo", "The Niger", "The Euphrates"), "Geography", ""),
            zh = LocalizedContent("哪条河流经埃及？", listOf("尼罗河", "刚果河", "尼日尔河", "幼发拉底河"), "地理", ""),
            es = LocalizedContent("¿Qué río atraviesa Egipto?", listOf("El Nilo", "El Congo", "El Níger", "El Éufrates"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3095, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la superficie de la Russie en km² ?", listOf("17,1 millions", "9,6 millions", "14,3 millions", "24 millions"), "Géographie", ""),
            en = LocalizedContent("What is the area of Russia in km²?", listOf("17.1 million", "9.6 million", "14.3 million", "24 million"), "Geography", ""),
            zh = LocalizedContent("俄罗斯的面积是多少平方公里？", listOf("1710万", "960万", "1430万", "2400万"), "地理", ""),
            es = LocalizedContent("¿Cuál es la superficie de Rusia en km²?", listOf("17,1 millones", "9,6 millones", "14,3 millones", "24 millones"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3096, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus longue côte maritime ?", listOf("Canada", "Russie", "Indonésie", "Norvège"), "Géographie", ""),
            en = LocalizedContent("Which country has the longest coastline?", listOf("Canada", "Russia", "Indonesia", "Norway"), "Geography", ""),
            zh = LocalizedContent("哪个国家拥有最长的海岸线？", listOf("加拿大", "俄罗斯", "印度尼西亚", "挪威"), "地理", ""),
            es = LocalizedContent("¿Qué país tiene la costa más larga?", listOf("Canadá", "Rusia", "Indonesia", "Noruega"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 3097, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale du Maroc ?", listOf("Rabat", "Casablanca", "Marrakech", "Fès"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Morocco?", listOf("Rabat", "Casablanca", "Marrakech", "Fes"), "Geography", ""),
            zh = LocalizedContent("摩洛哥的首都是哪里？", listOf("拉巴特", "卡萨布兰卡", "马拉喀什", "非斯"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Marruecos?", listOf("Rabat", "Casablanca", "Marrakech", "Fez"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3098, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays d'Amérique du Sud ?", listOf("Brésil", "Argentine", "Colombie", "Pérou"), "Géographie", ""),
            en = LocalizedContent("What is the largest country in South America?", listOf("Brazil", "Argentina", "Colombia", "Peru"), "Geography", ""),
            zh = LocalizedContent("南美洲最大的国家是哪个？", listOf("巴西", "阿根廷", "哥伦比亚", "秘鲁"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más grande de América del Sur?", listOf("Brasil", "Argentina", "Colombia", "Perú"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3099, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel archipel appartient à l'Espagne et se trouve au large de l'Afrique ?", listOf("Canaries", "Açores", "Madère", "Baléares"), "Géographie", ""),
            en = LocalizedContent("Which archipelago belongs to Spain and is located off the coast of Africa?", listOf("Canary Islands", "Azores", "Madeira", "Balearic Islands"), "Geography", ""),
            zh = LocalizedContent("哪个群岛属于西班牙，位于非洲沿海？", listOf("加那利群岛", "亚速尔群岛", "马德拉群岛", "巴利阿里群岛"), "地理", ""),
            es = LocalizedContent("¿Qué archipiélago pertenece a España y se encuentra frente a la costa de África?", listOf("Canarias", "Azores", "Madeira", "Baleares"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3100, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la chaîne de montagnes qui sépare l'Europe de l'Asie en Russie ?", listOf("Oural", "Caucase", "Alpes", "Carpates"), "Géographie", ""),
            en = LocalizedContent("What is the name of the mountain range that separates Europe from Asia in Russia?", listOf("Ural", "Caucasus", "Alps", "Carpathians"), "Geography", ""),
            zh = LocalizedContent("在俄罗斯，哪座山脉分隔了欧洲和亚洲？", listOf("乌拉尔山脉", "高加索山脉", "阿尔卑斯山脉", "喀尔巴阡山脉"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre de la cordillera que separa Europa de Asia en Rusia?", listOf("Urales", "Cáucaso", "Alpes", "Cárpatos"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3104, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la langue officielle du Brésil ?", listOf("Portugais", "Espagnol", "Français", "Anglais"), "Géographie", ""),
            en = LocalizedContent("What is the official language of Brazil?", listOf("Portuguese", "Spanish", "French", "English"), "Geography", ""),
            zh = LocalizedContent("巴西的官方语言是什么？", listOf("葡萄牙语", "西班牙语", "法语", "英语"), "地理", ""),
            es = LocalizedContent("¿Cuál es el idioma oficial de Brasil?", listOf("Portugués", "Español", "Francés", "Inglés"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3105, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel océan est le plus grand ?", listOf("Océan Pacifique", "Océan Atlantique", "Océan Indien", "Océan Arctique"), "Géographie", ""),
            en = LocalizedContent("Which ocean is the largest?", listOf("Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"), "Geography", ""),
            zh = LocalizedContent("哪个海洋最大？", listOf("太平洋", "大西洋", "印度洋", "北冰洋"), "地理", ""),
            es = LocalizedContent("¿Qué océano es el más grande?", listOf("Océano Pacífico", "Océano Atlántico", "Océano Índico", "Océano Ártico"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3107, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le point le plus bas sur Terre ?", listOf("Mer Morte (-430 m)", "Lac Assal (-155 m)", "Lac Baïkal (-1637 m)", "Vallée de la Mort (-86 m)"), "Géographie", ""),
            en = LocalizedContent("What is the lowest point on Earth?", listOf("Dead Sea (-430 m)", "Lake Assal (-155 m)", "Lake Baikal (-1637 m)", "Death Valley (-86 m)"), "Geography", ""),
            zh = LocalizedContent("地球上的最低点是什么？", listOf("死海（-430米）", "阿萨勒湖（-155米）", "贝加尔湖（-1637米）", "死亡谷（-86米）"), "地理", ""),
            es = LocalizedContent("¿Cuál es el punto más bajo de la Tierra?", listOf("Mar Muerto (-430 m)", "Lago Assal (-155 m)", "Lago Baikal (-1637 m)", "Valle de la Muerte (-86 m)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3108, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays d'Afrique a le plus d'habitants ?", listOf("Nigéria", "Éthiopie", "Égypte", "RD Congo"), "Géographie", ""),
            en = LocalizedContent("Which African country has the largest population?", listOf("Nigeria", "Ethiopia", "Egypt", "DR Congo"), "Geography", ""),
            zh = LocalizedContent("非洲哪个国家人口最多？", listOf("尼日利亚", "埃塞俄比亚", "埃及", "刚果民主共和国"), "地理", ""),
            es = LocalizedContent("¿Qué país de África tiene la mayor población?", listOf("Nigeria", "Etiopía", "Egipto", "RD Congo"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3109, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel d'Europe ?", listOf("Archipel britannique", "Archipel scandinave", "Açores", "Îles grecques"), "Géographie", ""),
            en = LocalizedContent("What is the largest archipelago in Europe?", listOf("British Isles", "Scandinavian archipelago", "Azores", "Greek islands"), "Geography", ""),
            zh = LocalizedContent("欧洲最大的群岛是什么？", listOf("不列颠群岛", "斯堪的纳维亚群岛", "亚速尔群岛", "希腊群岛"), "地理", ""),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de Europa?", listOf("Archipiélago británico", "Archipiélago escandinavo", "Azores", "Islas griegas"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3110, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve l'Amazonie en majorité ?", listOf("Brésil", "Pérou", "Colombie", "Venezuela"), "Géographie", ""),
            en = LocalizedContent("In which country is the Amazon mostly located?", listOf("Brazil", "Peru", "Colombia", "Venezuela"), "Geography", ""),
            zh = LocalizedContent("亚马逊雨林主要位于哪个国家？", listOf("巴西", "秘鲁", "哥伦比亚", "委内瑞拉"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la mayor parte del Amazonas?", listOf("Brasil", "Perú", "Colombia", "Venezuela"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3111, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la mer entre la Grèce et la Turquie ?", listOf("Mer Égée", "Mer Ionienne", "Mer Noire", "Mer de Marmara"), "Géographie", ""),
            en = LocalizedContent("What is the name of the sea between Greece and Turkey?", listOf("Aegean Sea", "Ionian Sea", "Black Sea", "Sea of Marmara"), "Geography", ""),
            zh = LocalizedContent("希腊和土耳其之间的海叫什么名字？", listOf("爱琴海", "爱奥尼亚海", "黑海", "马尔马拉海"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del mar entre Grecia y Turquía?", listOf("Mar Egeo", "Mar Jónico", "Mar Negro", "Mar de Mármara"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3112, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la plus grande ville d'Europe par population ?", listOf("Istanbul", "Moscou", "Londres", "Paris"), "Géographie", ""),
            en = LocalizedContent("What is the largest city in Europe by population?", listOf("Istanbul", "Moscow", "London", "Paris"), "Geography", ""),
            zh = LocalizedContent("欧洲人口最多的城市是哪个？", listOf("伊斯坦布尔", "莫斯科", "伦敦", "巴黎"), "地理", ""),
            es = LocalizedContent("¿Cuál es la ciudad más grande de Europa por población?", listOf("Estambul", "Moscú", "Londres", "París"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3113, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le détroit le plus fréquenté du monde ?", listOf("Détroit de Malacca", "Détroit de Gibraltar", "Détroit de Bosphore", "Détroit de Douvres"), "Géographie", ""),
            en = LocalizedContent("What is the busiest strait in the world?", listOf("Strait of Malacca", "Strait of Gibraltar", "Bosphorus Strait", "Strait of Dover"), "Geography", ""),
            zh = LocalizedContent("世界上最繁忙的海峡是哪个？", listOf("马六甲海峡", "直布罗陀海峡", "博斯普鲁斯海峡", "多佛尔海峡"), "地理", ""),
            es = LocalizedContent("¿Cuál es el estrecho más transitado del mundo?", listOf("Estrecho de Malaca", "Estrecho de Gibraltar", "Estrecho del Bósforo", "Estrecho de Dover"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3114, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale du Sénégal ?", listOf("Dakar", "Abidjan", "Lomé", "Cotonou"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Senegal?", listOf("Dakar", "Abidjan", "Lomé", "Cotonou"), "Geography", ""),
            zh = LocalizedContent("塞内加尔的首都是哪里？", listOf("达喀尔", "阿比让", "洛美", "科托努"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Senegal?", listOf("Dakar", "Abiyán", "Lomé", "Cotonú"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3115, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus profond lac du monde ?", listOf("Lac Baïkal", "Lac Tanganyika", "Lac Supérieur", "Lac Huron"), "Géographie", ""),
            en = LocalizedContent("What is the deepest lake in the world?", listOf("Lake Baikal", "Lake Tanganyika", "Lake Superior", "Lake Huron"), "Geography", ""),
            zh = LocalizedContent("世界上最深的湖泊是哪个？", listOf("贝加尔湖", "坦噶尼喀湖", "苏必利尔湖", "休伦湖"), "地理", ""),
            es = LocalizedContent("¿Cuál es el lago más profundo del mundo?", listOf("Lago Baikal", "Lago Tanganica", "Lago Superior", "Lago Hurón"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3116, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle montagne est surnommée 'K2' ?", listOf("Godwin-Austen (2e sommet mondial)", "Kangchenjunga", "Lhotse", "Makalu"), "Géographie", ""),
            en = LocalizedContent("Which mountain is nicknamed 'K2'?", listOf("Godwin-Austen (2nd highest peak)", "Kangchenjunga", "Lhotse", "Makalu"), "Geography", ""),
            zh = LocalizedContent("哪座山被称为'K2'？", listOf("戈德温-奥斯汀峰（世界第二高峰）", "干城章嘉峰", "洛子峰", "马卡鲁峰"), "地理", ""),
            es = LocalizedContent("¿Qué montaña es apodada 'K2'?", listOf("Godwin-Austen (2.º pico más alto)", "Kangchenjunga", "Lhotse", "Makalu"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3117, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est surnommé 'le pays du soleil levant' ?", listOf("Japon", "Corée du Sud", "Chine", "Thaïlande"), "Géographie", ""),
            en = LocalizedContent("Which country is called 'the land of the rising sun'?", listOf("Japan", "South Korea", "China", "Thailand"), "Geography", ""),
            zh = LocalizedContent("哪个国家被称为'日出之国'？", listOf("日本", "韩国", "中国", "泰国"), "地理", ""),
            es = LocalizedContent("¿Qué país es llamado 'el país del sol naciente'?", listOf("Japón", "Corea del Sur", "China", "Tailandia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3118, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve se jette dans le golfe de Guinée ?", listOf("Le Niger", "Le Congo", "Le Zambèze", "Le Volta"), "Géographie", ""),
            en = LocalizedContent("Which river flows into the Gulf of Guinea?", listOf("Niger", "Congo", "Zambezi", "Volta"), "Geography", ""),
            zh = LocalizedContent("哪条河流入几内亚湾？", listOf("尼日尔河", "刚果河", "赞比西河", "沃尔特河"), "地理", ""),
            es = LocalizedContent("¿Qué río desemboca en el golfo de Guinea?", listOf("Níger", "Congo", "Zambeze", "Volta"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3119, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le seul pays d'Amérique du Sud à parler français officiellement ?", listOf("La Guyane française (département)", "Surinam", "Guyana", "Paraguay"), "Géographie", ""),
            en = LocalizedContent("What is the only country in South America where French is an official language?", listOf("French Guiana (department)", "Suriname", "Guyana", "Paraguay"), "Geography", ""),
            zh = LocalizedContent("南美洲唯一以法语为官方语言的国家是哪个？", listOf("法属圭亚那（海外省）", "苏里南", "圭亚那", "巴拉圭"), "地理", ""),
            es = LocalizedContent("¿Cuál es el único país de América del Sur que tiene el francés como idioma oficial?", listOf("Guayana Francesa (departamento)", "Surinam", "Guyana", "Paraguay"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 3121, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'Don Quichotte' ?", listOf("Miguel de Cervantes", "Lope de Vega", "Francisco de Quevedo", "Calderón de la Barca"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Don Quixote'?", listOf("Miguel de Cervantes", "Lope de Vega", "Francisco de Quevedo", "Calderón de la Barca"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《堂吉诃德》？", listOf("米格尔·德·塞万提斯", "洛佩·德·维加", "弗朗西斯科·德·克维多", "卡尔德隆·德·拉·巴尔卡"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Don Quijote'?", listOf("Miguel de Cervantes", "Lope de Vega", "Francisco de Quevedo", "Calderón de la Barca"), "Cultura", "")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 3122, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand musée du monde ?", listOf("Le Louvre (Paris)", "Le British Museum", "Le Metropolitan Museum", "L'Ermitage"), "Culture", ""),
            en = LocalizedContent("What is the largest museum in the world?", listOf("The Louvre (Paris)", "The British Museum", "The Metropolitan Museum", "The Hermitage"), "Culture", ""),
            zh = LocalizedContent("世界上最大的博物馆是哪个？", listOf("卢浮宫（巴黎）", "大英博物馆", "大都会艺术博物馆", "冬宫博物馆"), "文化", ""),
            es = LocalizedContent("¿Cuál es el museo más grande del mundo?", listOf("El Louvre (París)", "El Museo Británico", "El Museo Metropolitano", "El Hermitage"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3123, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé 'La Cinquième Symphonie' ?", listOf("Ludwig van Beethoven", "Wolfgang Mozart", "Johann Bach", "Franz Schubert"), "Culture", ""),
            en = LocalizedContent("Who composed the 'Fifth Symphony'?", listOf("Ludwig van Beethoven", "Wolfgang Mozart", "Johann Bach", "Franz Schubert"), "Culture", ""),
            zh = LocalizedContent("谁创作了《第五交响曲》？", listOf("路德维希·范·贝多芬", "沃尔夫冈·莫扎特", "约翰·巴赫", "弗朗茨·舒伯特"), "文化", ""),
            es = LocalizedContent("¿Quién compuso la 'Quinta Sinfonía'?", listOf("Ludwig van Beethoven", "Wolfgang Mozart", "Johann Bach", "Franz Schubert"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3124, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel poète a écrit 'L'Odyssée' ?", listOf("Homère", "Virgile", "Hésiode", "Pindare"), "Culture", ""),
            en = LocalizedContent("Which poet wrote 'The Odyssey'?", listOf("Homer", "Virgil", "Hesiod", "Pindar"), "Culture", ""),
            zh = LocalizedContent("哪位诗人创作了《奥德赛》？", listOf("荷马", "维吉尔", "赫西俄德", "品达"), "文化", ""),
            es = LocalizedContent("¿Qué poeta escribió 'La Odisea'?", listOf("Homero", "Virgilio", "Hesíodo", "Píndaro"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3125, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel courant artistique est associé à Salvador Dalí ?", listOf("Surréalisme", "Cubisme", "Expressionnisme", "Dadaïsme"), "Culture", ""),
            en = LocalizedContent("Which artistic movement is associated with Salvador Dalí?", listOf("Surrealism", "Cubism", "Expressionism", "Dadaism"), "Culture", ""),
            zh = LocalizedContent("萨尔瓦多·达利与哪个艺术流派相关？", listOf("超现实主义", "立体主义", "表现主义", "达达主义"), "文化", ""),
            es = LocalizedContent("¿Qué movimiento artístico está asociado con Salvador Dalí?", listOf("Surrealismo", "Cubismo", "Expresionismo", "Dadá"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3127, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle œuvre est considérée le chef-d'œuvre de Beethoven ?", listOf("La 9e Symphonie", "La 5e Symphonie", "La Lettre à Élise", "La Sonate au Clair de lune"), "Culture", ""),
            en = LocalizedContent("Which work is considered Beethoven's masterpiece?", listOf("9th Symphony", "5th Symphony", "Für Elise", "Moonlight Sonata"), "Culture", ""),
            zh = LocalizedContent("哪部作品被认为是贝多芬的杰作？", listOf("第九交响曲", "第五交响曲", "致爱丽丝", "月光奏鸣曲"), "文化", ""),
            es = LocalizedContent("¿Qué obra se considera la obra maestra de Beethoven?", listOf("9ª Sinfonía", "5ª Sinfonía", "Para Elisa", "Sonata Claro de Luna"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3128, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a sculpté 'La Pietà' de la basilique Saint-Pierre ?", listOf("Michel-Ange", "Donatello", "Raphaël", "Léonard de Vinci"), "Culture", ""),
            en = LocalizedContent("Who sculpted 'La Pietà' in St. Peter's Basilica?", listOf("Michelangelo", "Donatello", "Raphael", "Leonardo da Vinci"), "Culture", ""),
            zh = LocalizedContent("谁雕刻了圣彼得大教堂的《圣母怜子像》？", listOf("米开朗基罗", "多纳泰罗", "拉斐尔", "列奥纳多·达·芬奇"), "文化", ""),
            es = LocalizedContent("¿Quién esculpió 'La Piedad' de la basílica de San Pedro?", listOf("Miguel Ángel", "Donatello", "Rafael", "Leonardo da Vinci"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3129, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de l'opéra de Bizet sur une ouvrière espagnole ?", listOf("Carmen", "Tosca", "La Traviata", "Rigoletto"), "Culture", ""),
            en = LocalizedContent("What is the name of Bizet's opera about a Spanish factory worker?", listOf("Carmen", "Tosca", "La Traviata", "Rigoletto"), "Culture", ""),
            zh = LocalizedContent("比才创作的关于西班牙女工的歌剧叫什么？", listOf("卡门", "托斯卡", "茶花女", "弄臣"), "文化", ""),
            es = LocalizedContent("¿Cuál es el nombre de la ópera de Bizet sobre una obrera española?", listOf("Carmen", "Tosca", "La Traviata", "Rigoletto"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3130, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de 'À la recherche du temps perdu' ?", listOf("Marcel Proust", "Gustave Flaubert", "André Gide", "Émile Zola"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'In Search of Lost Time'?", listOf("Marcel Proust", "Gustave Flaubert", "André Gide", "Émile Zola"), "Culture", ""),
            zh = LocalizedContent("《追忆似水年华》的作者是谁？", listOf("马塞尔·普鲁斯特", "古斯塔夫·福楼拜", "安德烈·纪德", "埃米尔·左拉"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'En busca del tiempo perdido'?", listOf("Marcel Proust", "Gustave Flaubert", "André Gide", "Émile Zola"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3131, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style artistique est caractérisé par des points de couleur ?", listOf("Pointillisme", "Impressionnisme", "Cubisme", "Fauvisme"), "Culture", ""),
            en = LocalizedContent("Which artistic style is characterized by dots of color?", listOf("Pointillism", "Impressionism", "Cubism", "Fauvism"), "Culture", ""),
            zh = LocalizedContent("哪种艺术风格以彩色点状为特征？", listOf("点彩派", "印象派", "立体主义", "野兽派"), "文化", ""),
            es = LocalizedContent("¿Qué estilo artístico se caracteriza por puntos de color?", listOf("Puntillismo", "Impresionismo", "Cubismo", "Fovismo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3133, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre espagnol a cofondé le cubisme ?", listOf("Pablo Picasso", "Salvador Dalí", "Joan Miró", "Francisco Goya"), "Culture", ""),
            en = LocalizedContent("Which Spanish painter co-founded Cubism?", listOf("Pablo Picasso", "Salvador Dalí", "Joan Miró", "Francisco Goya"), "Culture", ""),
            zh = LocalizedContent("哪位西班牙画家共同创立了立体主义？", listOf("巴勃罗·毕加索", "萨尔瓦多·达利", "胡安·米罗", "弗朗西斯科·戈雅"), "文化", ""),
            es = LocalizedContent("¿Qué pintor español cofundó el cubismo?", listOf("Pablo Picasso", "Salvador Dalí", "Joan Miró", "Francisco Goya"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3134, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long roman jamais écrit ?", listOf("À la recherche du temps perdu (Proust)", "Guerre et Paix (Tolstoï)", "Les Misérables (Hugo)", "Don Quichotte (Cervantes)"), "Culture", ""),
            en = LocalizedContent("What is the longest novel ever written?", listOf("In Search of Lost Time (Proust)", "War and Peace (Tolstoy)", "Les Misérables (Hugo)", "Don Quixote (Cervantes)"), "Culture", ""),
            zh = LocalizedContent("有史以来最长的小说是什么？", listOf("《追忆似水年华》（普鲁斯特）", "《战争与和平》（托尔斯泰）", "《悲惨世界》（雨果）", "《堂吉诃德》（塞万提斯）"), "文化", ""),
            es = LocalizedContent("¿Cuál es la novela más larga jamás escrita?", listOf("En busca del tiempo perdido (Proust)", "Guerra y paz (Tolstói)", "Los miserables (Hugo)", "Don Quijote (Cervantes)"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3135, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé 'Les Quatre Saisons' ?", listOf("Antonio Vivaldi", "Johann Bach", "Georg Handel", "Arcangelo Corelli"), "Culture", ""),
            en = LocalizedContent("Who composed 'The Four Seasons'?", listOf("Antonio Vivaldi", "Johann Bach", "Georg Handel", "Arcangelo Corelli"), "Culture", ""),
            zh = LocalizedContent("谁创作了《四季》？", listOf("安东尼奥·维瓦尔第", "约翰·巴赫", "乔治·亨德尔", "阿尔坎杰罗·科雷利"), "文化", ""),
            es = LocalizedContent("¿Quién compuso 'Las cuatro estaciones'?", listOf("Antonio Vivaldi", "Johann Bach", "Georg Händel", "Arcangelo Corelli"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3136, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel écrivain français a reçu le Nobel de littérature en 1957 ?", listOf("Albert Camus", "Jean-Paul Sartre", "André Gide", "François Mauriac"), "Culture", ""),
            en = LocalizedContent("Which French writer received the Nobel Prize in Literature in 1957?", listOf("Albert Camus", "Jean-Paul Sartre", "André Gide", "François Mauriac"), "Culture", ""),
            zh = LocalizedContent("哪位法国作家在1957年获得了诺贝尔文学奖？", listOf("阿尔贝·加缪", "让-保罗·萨特", "安德烈·纪德", "弗朗索瓦·莫里亚克"), "文化", ""),
            es = LocalizedContent("¿Qué escritor francés recibió el Premio Nobel de Literatura en 1957?", listOf("Albert Camus", "Jean-Paul Sartre", "André Gide", "François Mauriac"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3137, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le vrai nom de Voltaire ?", listOf("François-Marie Arouet", "François Voltaire", "Jean-Marie Voltaire", "Louis-François Arouet"), "Culture", ""),
            en = LocalizedContent("What is Voltaire's real name?", listOf("François-Marie Arouet", "François Voltaire", "Jean-Marie Voltaire", "Louis-François Arouet"), "Culture", ""),
            zh = LocalizedContent("伏尔泰的真名是什么？", listOf("弗朗索瓦-玛丽·阿鲁埃", "弗朗索瓦·伏尔泰", "让-玛丽·伏尔泰", "路易-弗朗索瓦·阿鲁埃"), "文化", ""),
            es = LocalizedContent("¿Cuál es el verdadero nombre de Voltaire?", listOf("François-Marie Arouet", "François Voltaire", "Jean-Marie Voltaire", "Louis-François Arouet"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3138, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mouvement littéraire Émile Zola représente-t-il ?", listOf("Le naturalisme", "Le romantisme", "Le réalisme", "Le symbolisme"), "Culture", ""),
            en = LocalizedContent("Which literary movement does Émile Zola represent?", listOf("Naturalism", "Romanticism", "Realism", "Symbolism"), "Culture", ""),
            zh = LocalizedContent("埃米尔·左拉代表哪个文学流派？", listOf("自然主义", "浪漫主义", "现实主义", "象征主义"), "文化", ""),
            es = LocalizedContent("¿Qué movimiento literario representa Émile Zola?", listOf("Naturalismo", "Romanticismo", "Realismo", "Simbolismo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3139, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a peint la chapelle Sixtine ?", listOf("Michel-Ange", "Raphaël", "Léonard de Vinci", "Titien"), "Culture", ""),
            en = LocalizedContent("Who painted the Sistine Chapel?", listOf("Michelangelo", "Raphael", "Leonardo da Vinci", "Titian"), "Culture", ""),
            zh = LocalizedContent("谁绘制了西斯廷教堂？", listOf("米开朗基罗", "拉斐尔", "列奥纳多·达·芬奇", "提香"), "文化", ""),
            es = LocalizedContent("¿Quién pintó la Capilla Sixtina?", listOf("Miguel Ángel", "Rafael", "Leonardo da Vinci", "Tiziano"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3140, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roman de Flaubert relate la vie d'une femme adulère en province ?", listOf("Madame Bovary", "L'Éducation sentimentale", "Salammbô", "Un cœur simple"), "Culture", ""),
            en = LocalizedContent("Which novel by Flaubert tells the story of an adulterous woman in the provinces?", listOf("Madame Bovary", "Sentimental Education", "Salammbô", "A Simple Heart"), "Culture", ""),
            zh = LocalizedContent("福楼拜的哪部小说讲述了一个外省通奸女人的故事？", listOf("《包法利夫人》", "《情感教育》", "《萨朗波》", "《一颗简单的心》"), "文化", ""),
            es = LocalizedContent("¿Qué novela de Flaubert relata la vida de una mujer adúltera en provincias?", listOf("Madame Bovary", "La educación sentimental", "Salambó", "Un corazón sencillo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3141, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel instrument Frédéric Chopin jouait-il principalement ?", listOf("Piano", "Violon", "Violoncelle", "Flûte"), "Culture", ""),
            en = LocalizedContent("What instrument did Frédéric Chopin primarily play?", listOf("Piano", "Violin", "Cello", "Flute"), "Culture", ""),
            zh = LocalizedContent("弗雷德里克·肖邦主要演奏什么乐器？", listOf("钢琴", "小提琴", "大提琴", "长笛"), "文化", ""),
            es = LocalizedContent("¿Qué instrumento tocaba principalmente Frédéric Chopin?", listOf("Piano", "Violín", "Violonchelo", "Flauta"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3142, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la danse traditionnelle espagnole ?", listOf("Flamenco", "Tango", "Fandango", "Sévillane"), "Culture", ""),
            en = LocalizedContent("What is the name of the traditional Spanish dance?", listOf("Flamenco", "Tango", "Fandango", "Sevillana"), "Culture", ""),
            zh = LocalizedContent("传统的西班牙舞蹈叫什么？", listOf("弗拉门戈", "探戈", "凡丹戈", "塞维利亚舞"), "文化", ""),
            es = LocalizedContent("¿Cuál es el nombre del baile tradicional español?", listOf("Flamenco", "Tango", "Fandango", "Sevillana"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3144, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste baroque a peint 'La Ronde de nuit' ?", listOf("Rembrandt van Rijn", "Johannes Vermeer", "Jan Steen", "Frans Hals"), "Culture", ""),
            en = LocalizedContent("Which Baroque artist painted 'The Night Watch'?", listOf("Rembrandt van Rijn", "Johannes Vermeer", "Jan Steen", "Frans Hals"), "Culture", ""),
            zh = LocalizedContent("哪位巴洛克艺术家绘制了《夜巡》？", listOf("伦勃朗·范·莱因", "约翰内斯·维米尔", "扬·斯滕", "弗兰斯·哈尔斯"), "文化", ""),
            es = LocalizedContent("¿Qué artista barroco pintó 'La ronda de noche'?", listOf("Rembrandt van Rijn", "Johannes Vermeer", "Jan Steen", "Frans Hals"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3145, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du ballet de Tchaïkovski avec la Belle au bois dormant ?", listOf("La Belle au bois dormant", "Le Lac des cygnes", "Casse-Noisette", "Don Quichotte"), "Culture", ""),
            en = LocalizedContent("What is the name of Tchaikovsky's ballet with the Sleeping Beauty?", listOf("The Sleeping Beauty", "Swan Lake", "The Nutcracker", "Don Quixote"), "Culture", ""),
            zh = LocalizedContent("柴可夫斯基的芭蕾舞剧《睡美人》叫什么名字？", listOf("睡美人", "天鹅湖", "胡桃夹子", "堂吉诃德"), "文化", ""),
            es = LocalizedContent("¿Cuál es el nombre del ballet de Tchaikovsky con La Bella Durmiente?", listOf("La Bella Durmiente", "El lago de los cisnes", "El cascanueces", "Don Quijote"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3146, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur de 'L'Étranger' ?", listOf("Albert Camus", "Jean-Paul Sartre", "André Malraux", "Simone de Beauvoir"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'The Stranger'?", listOf("Albert Camus", "Jean-Paul Sartre", "André Malraux", "Simone de Beauvoir"), "Culture", ""),
            zh = LocalizedContent("《局外人》的作者是谁？", listOf("阿尔贝·加缪", "让-保罗·萨特", "安德烈·马尔罗", "西蒙娜·德·波伏娃"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'El extranjero'?", listOf("Albert Camus", "Jean-Paul Sartre", "André Malraux", "Simone de Beauvoir"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3147, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style architectural caractérise la cathédrale Notre-Dame de Paris ?", listOf("Gothique", "Roman", "Baroque", "Classique"), "Culture", ""),
            en = LocalizedContent("What architectural style characterizes Notre-Dame de Paris cathedral?", listOf("Gothic", "Romanesque", "Baroque", "Classical"), "Culture", ""),
            zh = LocalizedContent("巴黎圣母院大教堂以什么建筑风格为特色？", listOf("哥特式", "罗马式", "巴洛克式", "古典式"), "文化", ""),
            es = LocalizedContent("¿Qué estilo arquitectónico caracteriza a la catedral de Notre-Dame de París?", listOf("Gótico", "Románico", "Barroco", "Clásico"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3148, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre est connu pour ses nénuphars ?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas", "Camille Pissarro"), "Culture", ""),
            en = LocalizedContent("Which painter is known for his water lilies?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas", "Camille Pissarro"), "Culture", ""),
            zh = LocalizedContent("哪位画家以他的睡莲画作闻名？", listOf("克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "埃德加·德加", "卡米耶·毕沙罗"), "文化", ""),
            es = LocalizedContent("¿Qué pintor es conocido por sus nenúfares?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Edgar Degas", "Camille Pissarro"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3149, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur anglais a écrit '1984' ?", listOf("George Orwell", "Aldous Huxley", "H.G. Wells", "Arthur Koestler"), "Culture", ""),
            en = LocalizedContent("Which English author wrote '1984'?", listOf("George Orwell", "Aldous Huxley", "H.G. Wells", "Arthur Koestler"), "Culture", ""),
            zh = LocalizedContent("哪位英国作家写了《1984》？", listOf("乔治·奥威尔", "奥尔德斯·赫胥黎", "H.G.威尔斯", "阿瑟·库斯勒"), "文化", ""),
            es = LocalizedContent("¿Qué autor inglés escribió '1984'?", listOf("George Orwell", "Aldous Huxley", "H.G. Wells", "Arthur Koestler"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 3150, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'intelligence artificielle ?", listOf("Simulation de l'intelligence humaine par des machines", "Un robot physique", "Un superordinateur", "Un programme antivirus"), "Tech", ""),
            en = LocalizedContent("What is artificial intelligence?", listOf("Simulation of human intelligence by machines", "A physical robot", "A supercomputer", "An antivirus program"), "Technology", ""),
            zh = LocalizedContent("什么是人工智能？", listOf("机器对人类智能的模拟", "一个物理机器人", "一台超级计算机", "一个杀毒程序"), "科技", ""),
            es = LocalizedContent("¿Qué es la inteligencia artificial?", listOf("Simulación de la inteligencia humana por máquinas", "Un robot físico", "Una supercomputadora", "Un programa antivirus"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3151, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation le plus utilisé en 2024 ?", listOf("Python", "JavaScript", "Java", "C++"), "Tech", ""),
            en = LocalizedContent("What is the most used programming language in 2024?", listOf("Python", "JavaScript", "Java", "C++"), "Technology", ""),
            zh = LocalizedContent("2024年最常用的编程语言是什么？", listOf("Python", "JavaScript", "Java", "C++"), "科技", ""),
            es = LocalizedContent("¿Cuál es el lenguaje de programación más utilizado en 2024?", listOf("Python", "JavaScript", "Java", "C++"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3152, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la blockchain ?", listOf("Registre distribué immuable de transactions", "Réseau de serveurs", "Type de cryptage", "Base de données centralisée"), "Tech", ""),
            en = LocalizedContent("What is blockchain?", listOf("Immutable distributed ledger of transactions", "Network of servers", "Type of encryption", "Centralized database"), "Technology", ""),
            zh = LocalizedContent("什么是区块链？", listOf("不可篡改的分布式交易账本", "服务器网络", "一种加密方式", "集中式数据库"), "科技", ""),
            es = LocalizedContent("¿Qué es blockchain?", listOf("Registro distribuido inmutable de transacciones", "Red de servidores", "Tipo de cifrado", "Base de datos centralizada"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3153, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel protocole sécurise les communications web ?", listOf("HTTPS (TLS/SSL)", "HTTP", "FTP", "SMTP"), "Tech", ""),
            en = LocalizedContent("Which protocol secures web communications?", listOf("HTTPS (TLS/SSL)", "HTTP", "FTP", "SMTP"), "Technology", ""),
            zh = LocalizedContent("哪个协议保护网络通信安全？", listOf("HTTPS (TLS/SSL)", "HTTP", "FTP", "SMTP"), "科技", ""),
            es = LocalizedContent("¿Qué protocolo asegura las comunicaciones web?", listOf("HTTPS (TLS/SSL)", "HTTP", "FTP", "SMTP"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3154, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un algorithme ?", listOf("Suite d'instructions pour résoudre un problème", "Programme complet", "Langage de programmation", "Unité de calcul"), "Tech", ""),
            en = LocalizedContent("What is an algorithm?", listOf("Sequence of instructions to solve a problem", "Complete program", "Programming language", "Computing unit"), "Technology", ""),
            zh = LocalizedContent("什么是算法？", listOf("解决问题的一系列指令", "完整的程序", "编程语言", "计算单元"), "科技", ""),
            es = LocalizedContent("¿Qué es un algoritmo?", listOf("Secuencia de instrucciones para resolver un problema", "Programa completo", "Lenguaje de programación", "Unidad de cálculo"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3155, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'IoT ?", listOf("Internet des Objets (appareils connectés)", "Protocole internet", "Type de réseau", "Intelligence artificielle"), "Tech", ""),
            en = LocalizedContent("What is IoT?", listOf("Internet of Things (connected devices)", "Internet protocol", "Type of network", "Artificial intelligence"), "Technology", ""),
            zh = LocalizedContent("什么是物联网？", listOf("物联网（连接设备）", "互联网协议", "网络类型", "人工智能"), "科技", ""),
            es = LocalizedContent("¿Qué es el IoT?", listOf("Internet de las Cosas (dispositivos conectados)", "Protocolo de Internet", "Tipo de red", "Inteligencia artificial"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3156, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle entreprise a développé Android ?", listOf("Google", "Apple", "Microsoft", "Samsung"), "Tech", ""),
            en = LocalizedContent("Which company developed Android?", listOf("Google", "Apple", "Microsoft", "Samsung"), "Technology", ""),
            zh = LocalizedContent("哪家公司开发了安卓？", listOf("谷歌", "苹果", "微软", "三星"), "科技", ""),
            es = LocalizedContent("¿Qué empresa desarrolló Android?", listOf("Google", "Apple", "Microsoft", "Samsung"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3158, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle d'un pare-feu ?", listOf("Filtrer le trafic réseau pour la sécurité", "Accélérer internet", "Stocker des données", "Compresser des fichiers"), "Tech", ""),
            en = LocalizedContent("What is the role of a firewall?", listOf("Filter network traffic for security", "Speed up internet", "Store data", "Compress files"), "Technology", ""),
            zh = LocalizedContent("防火墙的作用是什么？", listOf("过滤网络流量以确保安全", "加速互联网", "存储数据", "压缩文件"), "科技", ""),
            es = LocalizedContent("¿Cuál es el papel de un cortafuegos?", listOf("Filtrar el tráfico de red por seguridad", "Acelerar internet", "Almacenar datos", "Comprimir archivos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3160, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le processeur phare d'Intel en 2024 ?", listOf("Core Ultra (Meteor Lake)", "Core i9", "Xeon", "Pentium"), "Tech", ""),
            en = LocalizedContent("What is Intel's flagship processor in 2024?", listOf("Core Ultra (Meteor Lake)", "Core i9", "Xeon", "Pentium"), "Technology", ""),
            zh = LocalizedContent("2024年英特尔旗舰处理器是什么？", listOf("Core Ultra（Meteor Lake）", "Core i9", "Xeon", "Pentium"), "科技", ""),
            es = LocalizedContent("¿Cuál es el procesador insignia de Intel en 2024?", listOf("Core Ultra (Meteor Lake)", "Core i9", "Xeon", "Pentium"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3162, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le protocole de transfert de fichiers ?", listOf("FTP", "HTTP", "SMTP", "SSH"), "Tech", ""),
            en = LocalizedContent("What is the file transfer protocol?", listOf("FTP", "HTTP", "SMTP", "SSH"), "Technology", ""),
            zh = LocalizedContent("文件传输协议是什么？", listOf("FTP", "HTTP", "SMTP", "SSH"), "科技", ""),
            es = LocalizedContent("¿Cuál es el protocolo de transferencia de archivos?", listOf("FTP", "HTTP", "SMTP", "SSH"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3163, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une API ?", listOf("Interface de programmation d'application", "Antivirus personnalisé", "Algorithme de protection", "Type de base de données"), "Tech", ""),
            en = LocalizedContent("What is an API?", listOf("Application Programming Interface", "Custom antivirus", "Protection algorithm", "Type of database"), "Technology", ""),
            zh = LocalizedContent("什么是API？", listOf("应用程序编程接口", "自定义杀毒软件", "保护算法", "数据库类型"), "科技", ""),
            es = LocalizedContent("¿Qué es una API?", listOf("Interfaz de Programación de Aplicaciones", "Antivirus personalizado", "Algoritmo de protección", "Tipo de base de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3164, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel système d'exploitation kernel est utilisé par Android ?", listOf("Linux", "Unix", "Windows NT", "BSD"), "Tech", ""),
            en = LocalizedContent("Which operating system kernel is used by Android?", listOf("Linux", "Unix", "Windows NT", "BSD"), "Technology", ""),
            zh = LocalizedContent("安卓使用哪个操作系统内核？", listOf("Linux", "Unix", "Windows NT", "BSD"), "科技", ""),
            es = LocalizedContent("¿Qué núcleo de sistema operativo utiliza Android?", listOf("Linux", "Unix", "Windows NT", "BSD"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3165, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le CSS ?", listOf("Feuille de style pour le web", "Langage de programmation", "Base de données", "Protocole réseau"), "Tech", ""),
            en = LocalizedContent("What is CSS?", listOf("Style sheet for the web", "Programming language", "Database", "Network protocol"), "Technology", ""),
            zh = LocalizedContent("什么是CSS？", listOf("网页样式表", "编程语言", "数据库", "网络协议"), "科技", ""),
            es = LocalizedContent("¿Qué es CSS?", listOf("Hoja de estilo para la web", "Lenguaje de programación", "Base de datos", "Protocolo de red"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3166, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a inventé le World Wide Web ?", listOf("Tim Berners-Lee", "Vint Cerf", "Bill Gates", "Steve Jobs"), "Tech", ""),
            en = LocalizedContent("Who invented the World Wide Web?", listOf("Tim Berners-Lee", "Vint Cerf", "Bill Gates", "Steve Jobs"), "Technology", ""),
            zh = LocalizedContent("谁发明了万维网？", listOf("蒂姆·伯纳斯-李", "文特·瑟夫", "比尔·盖茨", "史蒂夫·乔布斯"), "科技", ""),
            es = LocalizedContent("¿Quién inventó la World Wide Web?", listOf("Tim Berners-Lee", "Vint Cerf", "Bill Gates", "Steve Jobs"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3167, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une base de données relationnelle ?", listOf("Base organisée en tables reliées entre elles", "Base de données en réseau", "Fichier texte structuré", "Registre distribué"), "Tech", ""),
            en = LocalizedContent("What is a relational database?", listOf("Database organized into related tables", "Network database", "Structured text file", "Distributed ledger"), "Technology", ""),
            zh = LocalizedContent("什么是关系型数据库？", listOf("以相互关联的表组织的数据库", "网络数据库", "结构化文本文件", "分布式账本"), "科技", ""),
            es = LocalizedContent("¿Qué es una base de datos relacional?", listOf("Base de datos organizada en tablas relacionadas", "Base de datos en red", "Archivo de texto estructurado", "Registro distribuido"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3168, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle du GPU ?", listOf("Traitement graphique et calcul parallèle", "Gestion de la mémoire", "Contrôle des entrées-sorties", "Gestion du réseau"), "Tech", ""),
            en = LocalizedContent("What is the role of the GPU?", listOf("Graphics processing and parallel computing", "Memory management", "Input-output control", "Network management"), "Technology", ""),
            zh = LocalizedContent("GPU的作用是什么？", listOf("图形处理和并行计算", "内存管理", "输入输出控制", "网络管理"), "科技", ""),
            es = LocalizedContent("¿Cuál es el rol de la GPU?", listOf("Procesamiento gráfico y cálculo paralelo", "Gestión de memoria", "Control de entrada-salida", "Gestión de red"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3169, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le Bluetooth ?", listOf("Protocole de communication sans fil courte portée", "Type de WiFi", "Protocole internet", "Réseau cellulaire"), "Tech", ""),
            en = LocalizedContent("What is Bluetooth?", listOf("Short-range wireless communication protocol", "Type of WiFi", "Internet protocol", "Cellular network"), "Technology", ""),
            zh = LocalizedContent("什么是蓝牙？", listOf("短距离无线通信协议", "一种WiFi", "互联网协议", "蜂窝网络"), "科技", ""),
            es = LocalizedContent("¿Qué es Bluetooth?", listOf("Protocolo de comunicación inalámbrica de corto alcance", "Tipo de WiFi", "Protocolo de internet", "Red celular"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3170, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la cybersécurité ?", listOf("Protection des systèmes informatiques contre les attaques", "Développement de logiciels", "Gestion de données", "Administration réseau"), "Tech", ""),
            en = LocalizedContent("What is cybersecurity?", listOf("Protection of computer systems against attacks", "Software development", "Data management", "Network administration"), "Technology", ""),
            zh = LocalizedContent("什么是网络安全？", listOf("保护计算机系统免受攻击", "软件开发", "数据管理", "网络管理"), "科技", ""),
            es = LocalizedContent("¿Qué es la ciberseguridad?", listOf("Protección de sistemas informáticos contra ataques", "Desarrollo de software", "Gestión de datos", "Administración de redes"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3172, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le langage de requête des bases de données relationnelles ?", listOf("SQL", "Python", "Java", "C#"), "Tech", ""),
            en = LocalizedContent("What is the query language for relational databases?", listOf("SQL", "Python", "Java", "C#"), "Technology", ""),
            zh = LocalizedContent("关系数据库的查询语言是什么？", listOf("SQL", "Python", "Java", "C#"), "科技", ""),
            es = LocalizedContent("¿Cuál es el lenguaje de consulta de las bases de datos relacionales?", listOf("SQL", "Python", "Java", "C#"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3173, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le deep learning ?", listOf("Apprentissage par réseaux de neurones profonds", "Apprentissage supervisé simple", "Programmation par règles", "Optimisation d'algorithmes"), "Tech", ""),
            en = LocalizedContent("What is deep learning?", listOf("Learning with deep neural networks", "Simple supervised learning", "Rule-based programming", "Algorithm optimization"), "Technology", ""),
            zh = LocalizedContent("什么是深度学习？", listOf("通过深度神经网络学习", "简单监督学习", "基于规则的编程", "算法优化"), "科技", ""),
            es = LocalizedContent("¿Qué es el deep learning?", listOf("Aprendizaje con redes neuronales profundas", "Aprendizaje supervisado simple", "Programación basada en reglas", "Optimización de algoritmos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3174, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle entreprise a créé l'iPhone ?", listOf("Apple", "Samsung", "Google", "Sony"), "Tech", ""),
            en = LocalizedContent("Which company created the iPhone?", listOf("Apple", "Samsung", "Google", "Sony"), "Technology", ""),
            zh = LocalizedContent("哪家公司创造了iPhone？", listOf("苹果", "三星", "谷歌", "索尼"), "科技", ""),
            es = LocalizedContent("¿Qué empresa creó el iPhone?", listOf("Apple", "Samsung", "Google", "Sony"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3175, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la latence réseau ?", listOf("Délai de transmission des données", "Vitesse de téléchargement", "Bande passante disponible", "Sécurité du réseau"), "Tech", ""),
            en = LocalizedContent("What is network latency?", listOf("Data transmission delay", "Download speed", "Available bandwidth", "Network security"), "Technology", ""),
            zh = LocalizedContent("什么是网络延迟？", listOf("数据传输延迟", "下载速度", "可用带宽", "网络安全"), "科技", ""),
            es = LocalizedContent("¿Qué es la latencia de red?", listOf("Retardo en la transmisión de datos", "Velocidad de descarga", "Ancho de banda disponible", "Seguridad de red"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3176, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le format de données le plus utilisé pour les APIs web ?", listOf("JSON", "XML", "CSV", "YAML"), "Tech", ""),
            en = LocalizedContent("What is the most used data format for web APIs?", listOf("JSON", "XML", "CSV", "YAML"), "Technology", ""),
            zh = LocalizedContent("Web API最常用的数据格式是什么？", listOf("JSON", "XML", "CSV", "YAML"), "科技", ""),
            es = LocalizedContent("¿Cuál es el formato de datos más utilizado para las APIs web?", listOf("JSON", "XML", "CSV", "YAML"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3177, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que Kubernetes ?", listOf("Orchestrateur de conteneurs", "Système d'exploitation", "Langage de programmation", "Base de données"), "Tech", ""),
            en = LocalizedContent("What is Kubernetes?", listOf("Container orchestrator", "Operating system", "Programming language", "Database"), "Technology", ""),
            zh = LocalizedContent("什么是Kubernetes？", listOf("容器编排工具", "操作系统", "编程语言", "数据库"), "科技", ""),
            es = LocalizedContent("¿Qué es Kubernetes?", listOf("Orquestador de contenedores", "Sistema operativo", "Lenguaje de programación", "Base de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3178, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le phishing ?", listOf("Hameçonnage pour voler des informations", "Virus informatique", "Type de pare-feu", "Protocole de cryptage"), "Tech", ""),
            en = LocalizedContent("What is phishing?", listOf("Deception to steal information", "Computer virus", "Type of firewall", "Encryption protocol"), "Technology", ""),
            zh = LocalizedContent("什么是网络钓鱼？", listOf("欺骗以窃取信息", "计算机病毒", "一种防火墙", "加密协议"), "科技", ""),
            es = LocalizedContent("¿Qué es el phishing?", listOf("Suplantación para robar información", "Virus informático", "Tipo de cortafuegos", "Protocolo de cifrado"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3179, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'avantage du 5G sur la 4G ?", listOf("Débit plus élevé et latence plus faible", "Meilleure couverture rurale", "Moins de consommation d'énergie", "Sécurité améliorée uniquement"), "Tech", ""),
            en = LocalizedContent("What is the advantage of 5G over 4G?", listOf("Higher speed and lower latency", "Better rural coverage", "Less energy consumption", "Improved security only"), "Technology", ""),
            zh = LocalizedContent("5G相比4G的优势是什么？", listOf("更高的速度和更低的延迟", "更好的农村覆盖", "更少的能耗", "仅安全性提升"), "科技", ""),
            es = LocalizedContent("¿Cuál es la ventaja del 5G sobre el 4G?", listOf("Mayor velocidad y menor latencia", "Mejor cobertura rural", "Menor consumo de energía", "Solo seguridad mejorada"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 3180, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de fois le Brésil a-t-il remporté la Coupe du monde de football ?", listOf("5 fois", "4 fois", "6 fois", "3 fois"), "Sport", ""),
            en = LocalizedContent("How many times has Brazil won the FIFA World Cup?", listOf("5 times", "4 times", "6 times", "3 times"), "Sports", ""),
            zh = LocalizedContent("巴西赢得过多少次世界杯足球赛？", listOf("5次", "4次", "6次", "3次"), "体育", ""),
            es = LocalizedContent("¿Cuántas veces ha ganado Brasil la Copa Mundial de la FIFA?", listOf("5 veces", "4 veces", "6 veces", "3 veces"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3181, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui détient le record du 100m masculin aux JO ?", listOf("Usain Bolt (9,81s à Rio)", "Marcell Jacobs", "Asafa Powell", "Tyson Gay"), "Sport", ""),
            en = LocalizedContent("Who holds the Olympic record for the men's 100m?", listOf("Usain Bolt (9.81s in Rio)", "Marcell Jacobs", "Asafa Powell", "Tyson Gay"), "Sports", ""),
            zh = LocalizedContent("谁保持着奥运会男子100米纪录？", listOf("尤塞恩·博尔特（里约9.81秒）", "马塞尔·雅各布斯", "阿萨法·鲍威尔", "泰森·盖伊"), "体育", ""),
            es = LocalizedContent("¿Quién tiene el récord olímpico de los 100m masculinos?", listOf("Usain Bolt (9.81s en Río)", "Marcell Jacobs", "Asafa Powell", "Tyson Gay"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3182, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'smash' ?", listOf("Tennis, volleyball et badminton", "Seulement le tennis", "Seulement le volleyball", "Baseball"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'smash' performed?", listOf("Tennis, volleyball and badminton", "Only tennis", "Only volleyball", "Baseball"), "Sports", ""),
            zh = LocalizedContent("在哪些运动中有'扣杀'？", listOf("网球、排球和羽毛球", "仅网球", "仅排球", "棒球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se realiza el 'smash'?", listOf("Tenis, voleibol y bádminton", "Solo tenis", "Solo voleibol", "Béisbol"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3183, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le tennisman avec le plus de titres du Grand Chelem en tennis masculin ?", listOf("Novak Djokovic (24)", "Rafael Nadal (22)", "Roger Federer (20)", "Pete Sampras (14)"), "Sport", ""),
            en = LocalizedContent("Who is the male tennis player with the most Grand Slam titles?", listOf("Novak Djokovic (24)", "Rafael Nadal (22)", "Roger Federer (20)", "Pete Sampras (14)"), "Sports", ""),
            zh = LocalizedContent("哪位男子网球运动员拥有最多大满贯冠军？", listOf("诺瓦克·德约科维奇（24个）", "拉斐尔·纳达尔（22个）", "罗杰·费德勒（20个）", "皮特·桑普拉斯（14个）"), "体育", ""),
            es = LocalizedContent("¿Quién es el tenista masculino con más títulos de Grand Slam?", listOf("Novak Djokovic (24)", "Rafael Nadal (22)", "Roger Federer (20)", "Pete Sampras (14)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3184, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle ville se sont tenus les JO d'été 2021 ?", listOf("Tokyo (Japon)", "Paris", "Seoul", "Pékin"), "Sport", ""),
            en = LocalizedContent("In which city were the 2021 Summer Olympics held?", listOf("Tokyo (Japan)", "Paris", "Seoul", "Beijing"), "Sports", ""),
            zh = LocalizedContent("2021年夏季奥运会在哪个城市举办？", listOf("东京（日本）", "巴黎", "首尔", "北京"), "体育", ""),
            es = LocalizedContent("¿En qué ciudad se celebraron los Juegos Olímpicos de Verano de 2021?", listOf("Tokio (Japón)", "París", "Seúl", "Pekín"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3185, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a inventé le baseball ?", listOf("États-Unis", "Cuba", "Canada", "Japon"), "Sport", ""),
            en = LocalizedContent("Which country invented baseball?", listOf("United States", "Cuba", "Canada", "Japan"), "Sports", ""),
            zh = LocalizedContent("哪个国家发明了棒球？", listOf("美国", "古巴", "加拿大", "日本"), "体育", ""),
            es = LocalizedContent("¿Qué país inventó el béisbol?", listOf("Estados Unidos", "Cuba", "Canadá", "Japón"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3186, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs compose une équipe de basketball sur le terrain ?", listOf("5", "6", "7", "4"), "Sport", ""),
            en = LocalizedContent("How many players make up a basketball team on the court?", listOf("5", "6", "7", "4"), "Sports", ""),
            zh = LocalizedContent("一支篮球队在场上由多少名球员组成？", listOf("5", "6", "7", "4"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores componen un equipo de baloncesto en la cancha?", listOf("5", "6", "7", "4"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3187, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le record du monde du marathon masculin ?", listOf("2h00\\u203535\\u2033 (Kelvin Kiptum, 2023)", "2h01\\u203539\\u2033 (Kipchoge)", "1h59\\u203540\\u2033 (Kipchoge, non officiel)", "2h02\\u203557\\u2033"), "Sport", ""),
            en = LocalizedContent("What is the men's marathon world record?", listOf("2h00'35\" (Kelvin Kiptum, 2023)", "2h01'39\" (Kipchoge)", "1h59'40\" (Kipchoge, unofficial)", "2h02'57\""), "Sports", ""),
            zh = LocalizedContent("男子马拉松世界纪录是多少？", listOf("2小时00分35秒（凯尔文·基普图姆，2023年）", "2小时01分39秒（基普乔格）", "1小时59分40秒（基普乔格，非官方）", "2小时02分57秒"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord mundial de maratón masculino?", listOf("2h00'35\" (Kelvin Kiptum, 2023)", "2h01'39\" (Kipchoge)", "1h59'40\" (Kipchoge, no oficial)", "2h02'57\""), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3188, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays est né le rugby ?", listOf("Angleterre", "Écosse", "Nouvelle-Zélande", "Irlande"), "Sport", ""),
            en = LocalizedContent("In which country was rugby born?", listOf("England", "Scotland", "New Zealand", "Ireland"), "Sports", ""),
            zh = LocalizedContent("橄榄球起源于哪个国家？", listOf("英格兰", "苏格兰", "新西兰", "爱尔兰"), "体育", ""),
            es = LocalizedContent("¿En qué país nació el rugby?", listOf("Inglaterra", "Escocia", "Nueva Zelanda", "Irlanda"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3189, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sets gagne-t-on un match de tennis en Grand Chelem masculin ?", listOf("3 sets gagnants (sur 5)", "2 sets gagnants (sur 3)", "4 sets gagnants", "3 sets gagnants (sur 4)"), "Sport", ""),
            en = LocalizedContent("How many sets do you win in a men's Grand Slam tennis match?", listOf("3 winning sets (out of 5)", "2 winning sets (out of 3)", "4 winning sets", "3 winning sets (out of 4)"), "Sports", ""),
            zh = LocalizedContent("在男子大满贯网球比赛中，需要赢多少盘？", listOf("赢3盘（共5盘）", "赢2盘（共3盘）", "赢4盘", "赢3盘（共4盘）"), "体育", ""),
            es = LocalizedContent("¿Cuántos sets se ganan en un partido de tenis de Grand Slam masculino?", listOf("3 sets ganadores (de 5)", "2 sets ganadores (de 3)", "4 sets ganadores", "3 sets ganadores (de 4)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3190, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus remporté la Coupe du monde de rugby ?", listOf("Nouvelle-Zélande (4 fois)", "Afrique du Sud (4 fois)", "Australie (2 fois)", "Angleterre (1 fois)"), "Sport", ""),
            en = LocalizedContent("Which country has won the Rugby World Cup the most times?", listOf("New Zealand (4 times)", "South Africa (4 times)", "Australia (2 times)", "England (1 time)"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得橄榄球世界杯次数最多？", listOf("新西兰（4次）", "南非（4次）", "澳大利亚（2次）", "英格兰（1次）"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más veces la Copa del Mundo de Rugby?", listOf("Nueva Zelanda (4 veces)", "Sudáfrica (4 veces)", "Australia (2 veces)", "Inglaterra (1 vez)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3191, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le meilleur buteur de l'histoire de la Ligue des Champions ?", listOf("Cristiano Ronaldo", "Lionel Messi", "Robert Lewandowski", "Raúl"), "Sport", ""),
            en = LocalizedContent("Who is the all-time top scorer in the UEFA Champions League?", listOf("Cristiano Ronaldo", "Lionel Messi", "Robert Lewandowski", "Raúl"), "Sports", ""),
            zh = LocalizedContent("谁是欧冠历史最佳射手？", listOf("克里斯蒂亚诺·罗纳尔多", "莱昂内尔·梅西", "罗伯特·莱万多夫斯基", "劳尔"), "体育", ""),
            es = LocalizedContent("¿Quién es el máximo goleador histórico de la Liga de Campeones?", listOf("Cristiano Ronaldo", "Lionel Messi", "Robert Lewandowski", "Raúl"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3192, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport les athlètes participent-ils au 'combiné alpin' ?", listOf("Ski alpin", "Biathlon", "Ski nordique", "Ski acrobatique"), "Sport", ""),
            en = LocalizedContent("In which sport do athletes compete in the 'alpine combined'?", listOf("Alpine skiing", "Biathlon", "Nordic skiing", "Freestyle skiing"), "Sports", ""),
            zh = LocalizedContent("运动员在哪个项目中参加“高山全能”？", listOf("高山滑雪", "冬季两项", "北欧滑雪", "自由式滑雪"), "体育", ""),
            es = LocalizedContent("¿En qué deporte los atletas compiten en el 'combinado alpino'?", listOf("Esquí alpino", "Biatlón", "Esquí nórdico", "Esquí acrobático"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3193, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de Grand Prix composent une saison de Formule 1 typique ?", listOf("Entre 20 et 24 courses", "16 courses", "30 courses", "12 courses"), "Sport", ""),
            en = LocalizedContent("How many Grands Prix make up a typical Formula One season?", listOf("Between 20 and 24 races", "16 races", "30 races", "12 races"), "Sports", ""),
            zh = LocalizedContent("一个典型的一级方程式赛季由多少场大奖赛组成？", listOf("20到24场比赛", "16场比赛", "30场比赛", "12场比赛"), "体育", ""),
            es = LocalizedContent("¿Cuántos Grandes Premios componen una temporada típica de Fórmula 1?", listOf("Entre 20 y 24 carreras", "16 carreras", "30 carreras", "12 carreras"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3194, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel judoka français a remporté le plus de médailles olympiques ?", listOf("Teddy Riner (3 or)", "David Douillet (2 or)", "Lucie Décosse", "Clarisse Agbegnenou"), "Sport", ""),
            en = LocalizedContent("Which French judoka has won the most Olympic medals?", listOf("Teddy Riner (3 gold)", "David Douillet (2 gold)", "Lucie Décosse", "Clarisse Agbegnenou"), "Sports", ""),
            zh = LocalizedContent("哪位法国柔道运动员获得奥运奖牌最多？", listOf("泰迪·里内（3金）", "大卫·杜耶（2金）", "露西·德科斯", "克拉丽丝·阿格贝涅努"), "体育", ""),
            es = LocalizedContent("¿Qué judoka francés ha ganado más medallas olímpicas?", listOf("Teddy Riner (3 oros)", "David Douillet (2 oros)", "Lucie Décosse", "Clarisse Agbegnenou"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3195, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport utilise-t-on un 'birdie' et un 'eagle' ?", listOf("Golf", "Badminton", "Tennis", "Squash"), "Sport", ""),
            en = LocalizedContent("In which sport are 'birdie' and 'eagle' used?", listOf("Golf", "Badminton", "Tennis", "Squash"), "Sports", ""),
            zh = LocalizedContent("在哪个运动中使用“小鸟球”和“老鹰球”？", listOf("高尔夫", "羽毛球", "网球", "壁球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se usan 'birdie' y 'eagle'?", listOf("Golf", "Bádminton", "Tenis", "Squash"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3196, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel nageur américain détient le record de médailles olympiques ?", listOf("Michael Phelps (23 or)", "Mark Spitz", "Ryan Lochte", "Ian Thorpe"), "Sport", ""),
            en = LocalizedContent("Which American swimmer holds the record for most Olympic medals?", listOf("Michael Phelps (23 gold)", "Mark Spitz", "Ryan Lochte", "Ian Thorpe"), "Sports", ""),
            zh = LocalizedContent("哪位美国游泳运动员保持奥运奖牌最多纪录？", listOf("迈克尔·菲尔普斯（23金）", "马克·斯皮茨", "瑞安·洛赫特", "伊恩·索普"), "体育", ""),
            es = LocalizedContent("¿Qué nadador estadounidense tiene el récord de más medallas olímpicas?", listOf("Michael Phelps (23 oros)", "Mark Spitz", "Ryan Lochte", "Ian Thorpe"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3197, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se situe Roland-Garros ?", listOf("France", "Espagne", "Italie", "Royaume-Uni"), "Sport", ""),
            en = LocalizedContent("In which country is Roland Garros located?", listOf("France", "Spain", "Italy", "United Kingdom"), "Sports", ""),
            zh = LocalizedContent("罗兰·加洛斯球场位于哪个国家？", listOf("法国", "西班牙", "意大利", "英国"), "体育", ""),
            es = LocalizedContent("¿En qué país se encuentra Roland Garros?", listOf("Francia", "España", "Italia", "Reino Unido"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3198, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle équipe a remporté la première Coupe du monde de football (1930) ?", listOf("Uruguay", "Argentine", "Brésil", "Italie"), "Sport", ""),
            en = LocalizedContent("Which team won the first FIFA World Cup (1930)?", listOf("Uruguay", "Argentina", "Brazil", "Italy"), "Sports", ""),
            zh = LocalizedContent("哪支球队赢得了第一届国际足联世界杯（1930年）？", listOf("乌拉圭", "阿根廷", "巴西", "意大利"), "体育", ""),
            es = LocalizedContent("¿Qué equipo ganó la primera Copa Mundial de la FIFA (1930)?", listOf("Uruguay", "Argentina", "Brasil", "Italia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3200, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le 'Golden Boy' du basketball américain dans les années 1990 ?", listOf("Michael Jordan", "LeBron James", "Shaquille O'Neal", "Kobe Bryant"), "Sport", ""),
            en = LocalizedContent("Who is the 'Golden Boy' of American basketball in the 1990s?", listOf("Michael Jordan", "LeBron James", "Shaquille O'Neal", "Kobe Bryant"), "Sports", ""),
            zh = LocalizedContent("谁是20世纪90年代美国篮球的'金童'？", listOf("迈克尔·乔丹", "勒布朗·詹姆斯", "沙奎尔·奥尼尔", "科比·布莱恩特"), "体育", ""),
            es = LocalizedContent("¿Quién es el 'Golden Boy' del baloncesto estadounidense en los años 1990?", listOf("Michael Jordan", "LeBron James", "Shaquille O'Neal", "Kobe Bryant"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3201, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport est pratiqué au Vélodrome ?", listOf("Cyclisme sur piste", "Cyclisme sur route", "BMX", "VTT"), "Sport", ""),
            en = LocalizedContent("Which sport is practiced at the Vélodrome?", listOf("Track cycling", "Road cycling", "BMX", "Mountain biking"), "Sports", ""),
            zh = LocalizedContent("在维洛德罗姆体育场进行的是哪项运动？", listOf("场地自行车", "公路自行车", "小轮车", "山地自行车"), "体育", ""),
            es = LocalizedContent("¿Qué deporte se practica en el Vélodrome?", listOf("Ciclismo en pista", "Ciclismo en ruta", "BMX", "Mountain bike"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3202, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays les JO d'été de 2024 se sont-ils tenus ?", listOf("France (Paris)", "Royaume-Uni", "Allemagne", "Espagne"), "Sport", ""),
            en = LocalizedContent("In which country were the 2024 Summer Olympics held?", listOf("France (Paris)", "United Kingdom", "Germany", "Spain"), "Sports", ""),
            zh = LocalizedContent("2024年夏季奥运会在哪个国家举行？", listOf("法国（巴黎）", "英国", "德国", "西班牙"), "体育", ""),
            es = LocalizedContent("¿En qué país se celebraron los Juegos Olímpicos de Verano de 2024?", listOf("Francia (París)", "Reino Unido", "Alemania", "España"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3203, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la distance d'un marathon ?", listOf("42,195 km", "40 km", "44 km", "38 km"), "Sport", ""),
            en = LocalizedContent("What is the distance of a marathon?", listOf("42.195 km", "40 km", "44 km", "38 km"), "Sports", ""),
            zh = LocalizedContent("马拉松的距离是多少？", listOf("42.195公里", "40公里", "44公里", "38公里"), "体育", ""),
            es = LocalizedContent("¿Cuál es la distancia de un maratón?", listOf("42,195 km", "40 km", "44 km", "38 km"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3204, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le meilleur buteur de l'histoire des Coupes du monde de football ?", listOf("Miroslav Klose (16 buts)", "Ronaldo (15 buts)", "Gerd Müller (14 buts)", "Pelé (12 buts)"), "Sport", ""),
            en = LocalizedContent("Who is the all-time top scorer in FIFA World Cup history?", listOf("Miroslav Klose (16 goals)", "Ronaldo (15 goals)", "Gerd Müller (14 goals)", "Pelé (12 goals)"), "Sports", ""),
            zh = LocalizedContent("谁是世界杯历史上最佳射手？", listOf("米罗斯拉夫·克洛泽（16球）", "罗纳尔多（15球）", "盖德·穆勒（14球）", "贝利（12球）"), "体育", ""),
            es = LocalizedContent("¿Quién es el máximo goleador de la historia de las Copas del Mundo de fútbol?", listOf("Miroslav Klose (16 goles)", "Ronaldo (15 goles)", "Gerd Müller (14 goles)", "Pelé (12 goles)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3205, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'crampon' ?", listOf("Rugby et football américain", "Seulement le rugby", "Seulement le football", "Hockey sur herbe"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'cleat' used?", listOf("Rugby and American football", "Only rugby", "Only football", "Field hockey"), "Sports", ""),
            zh = LocalizedContent("哪项运动中使用'防滑钉鞋'？", listOf("橄榄球和美式足球", "仅橄榄球", "仅足球", "曲棍球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se utiliza el 'taco'?", listOf("Rugby y fútbol americano", "Solo rugby", "Solo fútbol", "Hockey sobre hierba"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3206, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle distance parcourt-on lors d'un triathlon olympique ?", listOf("1,5 km nage + 40 km vélo + 10 km course", "3,8 km + 180 km + 42 km", "750 m + 20 km + 5 km", "2 km + 60 km + 20 km"), "Sport", ""),
            en = LocalizedContent("What distance is covered in an Olympic triathlon?", listOf("1.5 km swim + 40 km bike + 10 km run", "3.8 km + 180 km + 42 km", "750 m + 20 km + 5 km", "2 km + 60 km + 20 km"), "Sports", ""),
            zh = LocalizedContent("奥运铁人三项的赛程距离是多少？", listOf("游泳1.5公里 + 自行车40公里 + 跑步10公里", "3.8公里 + 180公里 + 42公里", "750米 + 20公里 + 5公里", "2公里 + 60公里 + 20公里"), "体育", ""),
            es = LocalizedContent("¿Qué distancia se recorre en un triatlón olímpico?", listOf("1,5 km natación + 40 km bicicleta + 10 km carrera", "3,8 km + 180 km + 42 km", "750 m + 20 km + 5 km", "2 km + 60 km + 20 km"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3207, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le sport national du Canada ?", listOf("Hockey sur glace et lacrosse", "Hockey sur glace seulement", "Curling", "Football canadien"), "Sport", ""),
            en = LocalizedContent("What is the national sport of Canada?", listOf("Ice hockey and lacrosse", "Ice hockey only", "Curling", "Canadian football"), "Sports", ""),
            zh = LocalizedContent("加拿大的国家运动是什么？", listOf("冰球和长曲棍球", "仅冰球", "冰壶", "加拿大式足球"), "体育", ""),
            es = LocalizedContent("¿Cuál es el deporte nacional de Canadá?", listOf("Hockey sobre hielo y lacrosse", "Solo hockey sobre hielo", "Curling", "Fútbol canadiense"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3208, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de joueurs y a-t-il dans une équipe de polo ?", listOf("4", "3", "6", "5"), "Sport", ""),
            en = LocalizedContent("How many players are there in a polo team?", listOf("4", "3", "6", "5"), "Sports", ""),
            zh = LocalizedContent("马球队有多少名队员？", listOf("4", "3", "6", "5"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores hay en un equipo de polo?", listOf("4", "3", "6", "5"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 3209, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le plus grand champion olympique de l'histoire (en nombre de médailles) ?", listOf("Michael Phelps (28 médailles)", "Larisa Latynina (18)", "Paavo Nurmi (12)", "Mark Spitz (11)"), "Sport", ""),
            en = LocalizedContent("Who is the greatest Olympic champion of all time (by number of medals)?", listOf("Michael Phelps (28 medals)", "Larisa Latynina (18)", "Paavo Nurmi (12)", "Mark Spitz (11)"), "Sports", ""),
            zh = LocalizedContent("谁是历史上最伟大的奥运冠军（按奖牌数计）？", listOf("迈克尔·菲尔普斯（28枚奖牌）", "拉里莎·拉蒂尼娜（18枚）", "帕沃·努尔米（12枚）", "马克·施皮茨（11枚）"), "体育", ""),
            es = LocalizedContent("¿Quién es el mayor campeón olímpico de la historia (por número de medallas)?", listOf("Michael Phelps (28 medallas)", "Larisa Latynina (18)", "Paavo Nurmi (12)", "Mark Spitz (11)"), "Deportes", "")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 3210, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté le plus d'Oscars de l'histoire ?", listOf("Ben-Hur, Titanic et Le Seigneur des Anneaux - Le Retour du roi (11 chacun)", "Titanic (14)", "Autant en emporte le vent", "La La Land"), "Cinéma", ""),
            en = LocalizedContent("Which film has won the most Oscars in history?", listOf("Ben-Hur, Titanic and The Lord of the Rings: The Return of the King (11 each)", "Titanic (14)", "Gone with the Wind", "La La Land"), "Cinema", ""),
            zh = LocalizedContent("历史上哪部电影获得奥斯卡奖最多？", listOf("《宾虚》、《泰坦尼克号》和《指环王：王者归来》（各11项）", "《泰坦尼克号》（14项）", "《乱世佳人》", "《爱乐之城》"), "电影", ""),
            es = LocalizedContent("¿Qué película ha ganado más Óscars en la historia?", listOf("Ben-Hur, Titanic y El Señor de los Anillos: El Retorno del Rey (11 cada una)", "Titanic (14)", "Lo que el viento se llevó", "La La Land"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3211, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé 'Schindler's List' ?", listOf("Steven Spielberg", "Francis Ford Coppola", "Martin Scorsese", "Stanley Kubrick"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Schindler's List'?", listOf("Steven Spielberg", "Francis Ford Coppola", "Martin Scorsese", "Stanley Kubrick"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《辛德勒的名单》？", listOf("史蒂文·斯皮尔伯格", "弗朗西斯·福特·科波拉", "马丁·斯科塞斯", "斯坦利·库布里克"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'La lista de Schindler'?", listOf("Steven Spielberg", "Francis Ford Coppola", "Martin Scorsese", "Stanley Kubrick"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3212, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film est basé sur un parc à thème avec des dinosaures ressuscités ?", listOf("Jurassic Park", "The Lost World", "Dino World", "Prehistoric Park"), "Cinéma", ""),
            en = LocalizedContent("Which film is based on a theme park with resurrected dinosaurs?", listOf("Jurassic Park", "The Lost World", "Dino World", "Prehistoric Park"), "Cinema", ""),
            zh = LocalizedContent("哪部电影基于一个拥有复活恐龙的主题公园？", listOf("《侏罗纪公园》", "《失落的世界》", "《恐龙世界》", "《史前公园》"), "电影", ""),
            es = LocalizedContent("¿Qué película se basa en un parque temático con dinosaurios resucitados?", listOf("Jurassic Park", "The Lost World", "Dino World", "Prehistoric Park"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3213, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué Iron Man dans le MCU ?", listOf("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"), "Cinéma", ""),
            en = LocalizedContent("Which actor played Iron Man in the MCU?", listOf("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在漫威电影宇宙中饰演钢铁侠？", listOf("小罗伯特·唐尼", "克里斯·埃文斯", "克里斯·海姆斯沃斯", "马克·鲁弗洛"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó a Iron Man en el UCM?", listOf("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3214, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Christopher Nolan explore les rêves dans des rêves ?", listOf("Inception", "Interstellar", "The Dark Knight", "Memento"), "Cinéma", ""),
            en = LocalizedContent("Which Christopher Nolan film explores dreams within dreams?", listOf("Inception", "Interstellar", "The Dark Knight", "Memento"), "Cinema", ""),
            zh = LocalizedContent("克里斯托弗·诺兰的哪部电影探索了梦中梦？", listOf("《盗梦空间》", "《星际穿越》", "《黑暗骑士》", "《记忆碎片》"), "电影", ""),
            es = LocalizedContent("¿Qué película de Christopher Nolan explora sueños dentro de sueños?", listOf("Inception", "Interstellar", "The Dark Knight", "Memento"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3216, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel studio a créé le personnage de Mickey Mouse ?", listOf("Walt Disney", "Warner Bros.", "Pixar", "DreamWorks"), "Cinéma", ""),
            en = LocalizedContent("Which studio created the character Mickey Mouse?", listOf("Walt Disney", "Warner Bros.", "Pixar", "DreamWorks"), "Cinema", ""),
            zh = LocalizedContent("哪个工作室创造了米老鼠这个角色？", listOf("华特迪士尼", "华纳兄弟", "皮克斯", "梦工厂"), "电影", ""),
            es = LocalizedContent("¿Qué estudio creó el personaje de Mickey Mouse?", listOf("Walt Disney", "Warner Bros.", "Pixar", "DreamWorks"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3217, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de science-fiction met en scène une IA nommée HAL 9000 ?", listOf("2001 : L'Odyssée de l'espace", "Blade Runner", "Ex Machina", "I, Robot"), "Cinéma", ""),
            en = LocalizedContent("Which science fiction film features an AI named HAL 9000?", listOf("2001: A Space Odyssey", "Blade Runner", "Ex Machina", "I, Robot"), "Cinema", ""),
            zh = LocalizedContent("哪部科幻电影中出现了一个名为HAL 9000的人工智能？", listOf("《2001太空漫游》", "《银翼杀手》", "《机械姬》", "《我，机器人》"), "电影", ""),
            es = LocalizedContent("¿Qué película de ciencia ficción presenta una IA llamada HAL 9000?", listOf("2001: Una odisea del espacio", "Blade Runner", "Ex Machina", "Yo, robot"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3218, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle de Forrest Gump ?", listOf("Tom Hanks", "Tom Cruise", "Kevin Costner", "Richard Gere"), "Cinéma", ""),
            en = LocalizedContent("Who plays the role of Forrest Gump?", listOf("Tom Hanks", "Tom Cruise", "Kevin Costner", "Richard Gere"), "Cinema", ""),
            zh = LocalizedContent("谁饰演了阿甘正传中的角色？", listOf("汤姆·汉克斯", "汤姆·克鲁斯", "凯文·科斯特纳", "理查·基尔"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta el papel de Forrest Gump?", listOf("Tom Hanks", "Tom Cruise", "Kevin Costner", "Richard Gere"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3219, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le premier film entièrement animé de Disney sorti en 1937 ?", listOf("Blanche-Neige et les Sept Nains", "Pinocchio", "Fantasia", "Bambi"), "Cinéma", ""),
            en = LocalizedContent("What is Disney's first fully animated film released in 1937?", listOf("Snow White and the Seven Dwarfs", "Pinocchio", "Fantasia", "Bambi"), "Cinema", ""),
            zh = LocalizedContent("迪士尼1937年上映的第一部全动画电影是什么？", listOf("《白雪公主和七个小矮人》", "《木偶奇遇记》", "《幻想曲》", "《小鹿斑比》"), "电影", ""),
            es = LocalizedContent("¿Cuál es la primera película completamente animada de Disney estrenada en 1937?", listOf("Blancanieves y los siete enanitos", "Pinocho", "Fantasía", "Bambi"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3220, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le réalisateur de la trilogie 'Le Seigneur des Anneaux' ?", listOf("Peter Jackson", "James Cameron", "Ridley Scott", "George Lucas"), "Cinéma", ""),
            en = LocalizedContent("Who is the director of the 'Lord of the Rings' trilogy?", listOf("Peter Jackson", "James Cameron", "Ridley Scott", "George Lucas"), "Cinema", ""),
            zh = LocalizedContent("《指环王》三部曲的导演是谁？", listOf("彼得·杰克逊", "詹姆斯·卡梅隆", "雷德利·斯科特", "乔治·卢卡斯"), "电影", ""),
            es = LocalizedContent("¿Quién es el director de la trilogía 'El Señor de los Anillos'?", listOf("Peter Jackson", "James Cameron", "Ridley Scott", "George Lucas"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3221, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1994 relate la vie d'un garçon de l'Alabama ?", listOf("Forrest Gump", "The Shawshank Redemption", "Pulp Fiction", "The Lion King"), "Cinéma", ""),
            en = LocalizedContent("Which 1994 film tells the story of a boy from Alabama?", listOf("Forrest Gump", "The Shawshank Redemption", "Pulp Fiction", "The Lion King"), "Cinema", ""),
            zh = LocalizedContent("哪部1994年的电影讲述了一个来自阿拉巴马州的男孩的故事？", listOf("阿甘正传", "肖申克的救赎", "低俗小说", "狮子王"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1994 narra la vida de un chico de Alabama?", listOf("Forrest Gump", "The Shawshank Redemption", "Pulp Fiction", "The Lion King"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3222, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur français a joué dans 'Astérix & Obélix' ?", listOf("Gérard Depardieu", "Jean-Paul Belmondo", "Louis de Funès", "Michel Serrault"), "Cinéma", ""),
            en = LocalizedContent("Which French actor starred in 'Astérix & Obélix'?", listOf("Gérard Depardieu", "Jean-Paul Belmondo", "Louis de Funès", "Michel Serrault"), "Cinema", ""),
            zh = LocalizedContent("哪位法国演员出演了《高卢英雄传》？", listOf("热拉尔·德帕迪约", "让-保罗·贝尔蒙多", "路易·德·菲奈斯", "米歇尔·塞罗"), "电影", ""),
            es = LocalizedContent("¿Qué actor francés actuó en 'Astérix & Obélix'?", listOf("Gérard Depardieu", "Jean-Paul Belmondo", "Louis de Funès", "Michel Serrault"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3223, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé la bande originale de 'Star Wars' ?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Howard Shore"), "Cinéma", ""),
            en = LocalizedContent("Who composed the original soundtrack for 'Star Wars'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Howard Shore"), "Cinema", ""),
            zh = LocalizedContent("谁为《星球大战》创作了原声配乐？", listOf("约翰·威廉姆斯", "汉斯·季默", "埃尼奥·莫里康内", "霍华德·肖"), "电影", ""),
            es = LocalizedContent("¿Quién compuso la banda sonora original de 'Star Wars'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Howard Shore"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3224, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Tim Burton met en scène un jeune homme aux mains en ciseaux ?", listOf("Edward aux mains d'argent", "Beetlejuice", "Batman Returns", "Sleepy Hollow"), "Cinéma", ""),
            en = LocalizedContent("Which Tim Burton film features a young man with scissors for hands?", listOf("Edward Scissorhands", "Beetlejuice", "Batman Returns", "Sleepy Hollow"), "Cinema", ""),
            zh = LocalizedContent("蒂姆·伯顿的哪部电影讲述了一个剪刀手年轻人的故事？", listOf("剪刀手爱德华", "阴间大法师", "蝙蝠侠归来", "断头谷"), "电影", ""),
            es = LocalizedContent("¿Qué película de Tim Burton presenta a un joven con tijeras en lugar de manos?", listOf("Edward Scissorhands", "Beetlejuice", "Batman Returns", "Sleepy Hollow"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3225, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel acteur a joué James Bond le plus longtemps ?", listOf("Roger Moore (7 films)", "Sean Connery (6 films)", "Daniel Craig (5 films)", "Pierce Brosnan (4 films)"), "Cinéma", ""),
            en = LocalizedContent("Which actor played James Bond the longest?", listOf("Roger Moore (7 films)", "Sean Connery (6 films)", "Daniel Craig (5 films)", "Pierce Brosnan (4 films)"), "Cinema", ""),
            zh = LocalizedContent("哪位演员扮演詹姆斯·邦德的时间最长？", listOf("罗杰·摩尔（7部）", "肖恩·康纳利（6部）", "丹尼尔·克雷格（5部）", "皮尔斯·布鲁斯南（4部）"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó a James Bond durante más tiempo?", listOf("Roger Moore (7 películas)", "Sean Connery (6 películas)", "Daniel Craig (5 películas)", "Pierce Brosnan (4 películas)"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3226, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Luc Besson met en scène une jeune fille défendue par un tueur à gages ?", listOf("Léon", "Le Grand Bleu", "Nikita", "Lucy"), "Cinéma", ""),
            en = LocalizedContent("Which Luc Besson film features a young girl defended by a hitman?", listOf("Léon", "The Big Blue", "Nikita", "Lucy"), "Cinema", ""),
            zh = LocalizedContent("吕克·贝松的哪部电影讲述了一个小女孩被杀手保护的故事？", listOf("这个杀手不太冷", "碧海蓝天", "尼基塔", "超体"), "电影", ""),
            es = LocalizedContent("¿Qué película de Luc Besson presenta a una niña defendida por un sicario?", listOf("Léon", "El gran azul", "Nikita", "Lucy"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3227, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le Joker dans 'The Dark Knight' (2008) ?", listOf("Heath Ledger", "Joaquin Phoenix", "Jack Nicholson", "Jared Leto"), "Cinéma", ""),
            en = LocalizedContent("Who plays the Joker in 'The Dark Knight' (2008)?", listOf("Heath Ledger", "Joaquin Phoenix", "Jack Nicholson", "Jared Leto"), "Cinema", ""),
            zh = LocalizedContent("谁在2008年的《黑暗骑士》中扮演小丑？", listOf("希斯·莱杰", "华金·菲尼克斯", "杰克·尼科尔森", "杰瑞德·莱托"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta al Joker en 'The Dark Knight' (2008)?", listOf("Heath Ledger", "Joaquin Phoenix", "Jack Nicholson", "Jared Leto"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3228, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le film le plus rentable de tous les temps (2024) ?", listOf("Avatar (2009, 2,9 milliards $)", "Avengers: Endgame", "Titanic", "Star Wars VII"), "Cinéma", ""),
            en = LocalizedContent("What is the highest-grossing film of all time (2024)?", listOf("Avatar (2009, $2.9 billion)", "Avengers: Endgame", "Titanic", "Star Wars VII"), "Cinema", ""),
            zh = LocalizedContent("截至2024年，有史以来票房最高的电影是哪一部？", listOf("阿凡达（2009年，29亿美元）", "复仇者联盟4：终局之战", "泰坦尼克号", "星球大战7"), "电影", ""),
            es = LocalizedContent("¿Cuál es la película más taquillera de todos los tiempos (2024)?", listOf("Avatar (2009, $2.9 mil millones)", "Avengers: Endgame", "Titanic", "Star Wars VII"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3229, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur américain est connu pour ses rôles dans 'The Matrix' ?", listOf("Keanu Reeves", "Will Smith", "Tom Cruise", "Brad Pitt"), "Cinéma", ""),
            en = LocalizedContent("Which American actor is known for his roles in 'The Matrix'?", listOf("Keanu Reeves", "Will Smith", "Tom Cruise", "Brad Pitt"), "Cinema", ""),
            zh = LocalizedContent("哪位美国演员因在《黑客帝国》中的角色而闻名？", listOf("基努·里维斯", "威尔·史密斯", "汤姆·克鲁斯", "布拉德·皮特"), "电影", ""),
            es = LocalizedContent("¿Qué actor estadounidense es conocido por sus papeles en 'The Matrix'?", listOf("Keanu Reeves", "Will Smith", "Tom Cruise", "Brad Pitt"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3230, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Amélie Poulain' ?", listOf("Jean-Pierre Jeunet", "Luc Besson", "Claude Lelouch", "Costa-Gavras"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Amélie'?", listOf("Jean-Pierre Jeunet", "Luc Besson", "Claude Lelouch", "Costa-Gavras"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《天使爱美丽》？", listOf("让-皮埃尔·热内", "吕克·贝松", "克劳德·勒鲁什", "科斯塔-加夫拉斯"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Amélie'?", listOf("Jean-Pierre Jeunet", "Luc Besson", "Claude Lelouch", "Costa-Gavras"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3231, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Ridley Scott se déroule dans un futur dystopique avec des androïdes ?", listOf("Blade Runner", "Alien", "Gladiator", "The Martian"), "Cinéma", ""),
            en = LocalizedContent("Which Ridley Scott film is set in a dystopian future with androids?", listOf("Blade Runner", "Alien", "Gladiator", "The Martian"), "Cinema", ""),
            zh = LocalizedContent("雷德利·斯科特的哪部电影设定在反乌托邦的未来，其中有机器人？", listOf("银翼杀手", "异形", "角斗士", "火星救援"), "电影", ""),
            es = LocalizedContent("¿Qué película de Ridley Scott transcurre en un futuro distópico con androides?", listOf("Blade Runner", "Alien", "Gladiator", "The Martian"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3232, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur français est connu pour la série 'Le Gendarme de Saint-Tropez' ?", listOf("Louis de Funès", "Fernandel", "Bourvil", "Jean Gabin"), "Cinéma", ""),
            en = LocalizedContent("Which French actor is known for the series 'Le Gendarme de Saint-Tropez'?", listOf("Louis de Funès", "Fernandel", "Bourvil", "Jean Gabin"), "Cinema", ""),
            zh = LocalizedContent("哪位法国演员因系列电影《圣特罗佩的警察》而闻名？", listOf("路易·德·菲奈斯", "费尔南德尔", "布尔维尔", "让·加宾"), "电影", ""),
            es = LocalizedContent("¿Qué actor francés es conocido por la serie 'El gendarme de Saint-Tropez'?", listOf("Louis de Funès", "Fernandel", "Bourvil", "Jean Gabin"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3233, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel film entend-on la réplique 'I'll be back' ?", listOf("Terminator", "Predator", "RoboCop", "Total Recall"), "Cinéma", ""),
            en = LocalizedContent("In which film do we hear the line 'I'll be back'?", listOf("Terminator", "Predator", "RoboCop", "Total Recall"), "Cinema", ""),
            zh = LocalizedContent("在哪部电影中我们听到台词“我会回来的”？", listOf("终结者", "铁血战士", "机械战警", "全面回忆"), "电影", ""),
            es = LocalizedContent("¿En qué película se escucha la frase 'I'll be back'?", listOf("Terminator", "Predator", "RoboCop", "Total Recall"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3234, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le réalisateur de 'La La Land' ?", listOf("Damien Chazelle", "Ryan Gosling", "Guillermo del Toro", "Barry Jenkins"), "Cinéma", ""),
            en = LocalizedContent("Who is the director of 'La La Land'?", listOf("Damien Chazelle", "Ryan Gosling", "Guillermo del Toro", "Barry Jenkins"), "Cinema", ""),
            zh = LocalizedContent("《爱乐之城》的导演是谁？", listOf("达米恩·查泽雷", "瑞恩·高斯林", "吉尔莫·德尔·托罗", "巴里·詹金斯"), "电影", ""),
            es = LocalizedContent("¿Quién es el director de 'La La Land'?", listOf("Damien Chazelle", "Ryan Gosling", "Guillermo del Toro", "Barry Jenkins"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3235, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1975 de Spielberg a rendu les gens effrayés de nager en mer ?", listOf("Les Dents de la mer (Jaws)", "L'Empire contre-attaque", "Rencontres du 3e type", "1941"), "Cinéma", ""),
            en = LocalizedContent("Which 1975 Spielberg film made people afraid to swim in the sea?", listOf("Jaws", "The Empire Strikes Back", "Close Encounters of the Third Kind", "1941"), "Cinema", ""),
            zh = LocalizedContent("斯皮尔伯格1975年的哪部电影让人们害怕在海里游泳？", listOf("大白鲨", "星球大战：帝国反击战", "第三类接触", "1941"), "电影", ""),
            es = LocalizedContent("¿Qué película de Spielberg de 1975 hizo que la gente tuviera miedo de nadar en el mar?", listOf("Tiburón", "El Imperio contraataca", "Encuentros en la tercera fase", "1941"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3236, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue Hermione Granger dans Harry Potter ?", listOf("Emma Watson", "Emma Roberts", "Emma Thompson", "Emma Stone"), "Cinéma", ""),
            en = LocalizedContent("Who plays Hermione Granger in Harry Potter?", listOf("Emma Watson", "Emma Roberts", "Emma Thompson", "Emma Stone"), "Cinema", ""),
            zh = LocalizedContent("谁在《哈利·波特》中饰演赫敏·格兰杰？", listOf("艾玛·沃特森", "艾玛·罗伯茨", "艾玛·汤普森", "艾玛·斯通"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta a Hermione Granger en Harry Potter?", listOf("Emma Watson", "Emma Roberts", "Emma Thompson", "Emma Stone"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3237, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film d'animation Pixar explore le monde des émotions ?", listOf("Vice-Versa (Inside Out)", "Soul", "Coco", "Toy Story"), "Cinéma", ""),
            en = LocalizedContent("Which Pixar animated film explores the world of emotions?", listOf("Inside Out", "Soul", "Coco", "Toy Story"), "Cinema", ""),
            zh = LocalizedContent("哪部皮克斯动画电影探索了情感世界？", listOf("头脑特工队", "心灵奇旅", "寻梦环游记", "玩具总动员"), "电影", ""),
            es = LocalizedContent("¿Qué película animada de Pixar explora el mundo de las emociones?", listOf("Intensamente", "Soul", "Coco", "Toy Story"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3238, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé la saga 'Indiana Jones' ?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Ron Howard"), "Cinéma", ""),
            en = LocalizedContent("Who directed the 'Indiana Jones' saga?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Ron Howard"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《夺宝奇兵》系列？", listOf("史蒂文·斯皮尔伯格", "乔治·卢卡斯", "詹姆斯·卡梅隆", "朗·霍华德"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió la saga de 'Indiana Jones'?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Ron Howard"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3239, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué Hannibal Lecter dans 'Le Silence des agneaux' ?", listOf("Anthony Hopkins", "Gary Oldman", "Christopher Walken", "Kevin Spacey"), "Cinéma", ""),
            en = LocalizedContent("Which actor played Hannibal Lecter in 'The Silence of the Lambs'?", listOf("Anthony Hopkins", "Gary Oldman", "Christopher Walken", "Kevin Spacey"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在《沉默的羔羊》中饰演汉尼拔·莱克特？", listOf("安东尼·霍普金斯", "加里·奥德曼", "克里斯托弗·沃肯", "凯文·史派西"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó a Hannibal Lecter en 'El silencio de los corderos'?", listOf("Anthony Hopkins", "Gary Oldman", "Christopher Walken", "Kevin Spacey"), "Cine", "")
        ),
        BilingualQuestion(
            id = 3240, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la spécialité culinaire de Marseille ?", listOf("Bouillabaisse", "Ratatouille", "Daube", "Aïoli"), "Gastronomie", ""),
            en = LocalizedContent("What is the culinary specialty of Marseille?", listOf("Bouillabaisse", "Ratatouille", "Daube", "Aïoli"), "Gastronomy", ""),
            zh = LocalizedContent("马赛的特色美食是什么？", listOf("马赛鱼汤", "普罗旺斯炖菜", "红酒炖牛肉", "蒜泥蛋黄酱"), "美食", ""),
            es = LocalizedContent("¿Cuál es la especialidad culinaria de Marsella?", listOf("Bouillabaisse", "Ratatouille", "Daube", "Aïoli"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3241, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fromage français est recouvert d'une croûte de cendres ?", listOf("Morbier", "Comté", "Reblochon", "Munster"), "Gastronomie", ""),
            en = LocalizedContent("Which French cheese is covered with an ash crust?", listOf("Morbier", "Comté", "Reblochon", "Munster"), "Gastronomy", ""),
            zh = LocalizedContent("哪种法国奶酪覆盖着一层灰烬外皮？", listOf("莫尔比耶", "孔泰", "雷布洛雄", "芒斯特"), "美食", ""),
            es = LocalizedContent("¿Qué queso francés está cubierto con una corteza de ceniza?", listOf("Morbier", "Comté", "Reblochon", "Munster"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3243, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est l'origine du sushi ?", listOf("Japon", "Chine", "Corée", "Thaïlande"), "Gastronomie", ""),
            en = LocalizedContent("Which country is the origin of sushi?", listOf("Japan", "China", "Korea", "Thailand"), "Gastronomy", ""),
            zh = LocalizedContent("寿司起源于哪个国家？", listOf("日本", "中国", "韩国", "泰国"), "美食", ""),
            es = LocalizedContent("¿Cuál es el país de origen del sushi?", listOf("Japón", "China", "Corea", "Tailandia"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3244, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le foie gras ?", listOf("Foie hypertrophié de canard ou d'oie", "Plat de viande de porc", "Pâté de poisson", "Charcuterie alsacienne"), "Gastronomie", ""),
            en = LocalizedContent("What is foie gras?", listOf("Hypertrophied liver of duck or goose", "Pork dish", "Fish pâté", "Alsatian charcuterie"), "Gastronomy", ""),
            zh = LocalizedContent("什么是鹅肝？", listOf("鸭或鹅的肥大肝脏", "猪肉菜肴", "鱼酱", "阿尔萨斯熟食"), "美食", ""),
            es = LocalizedContent("¿Qué es el foie gras?", listOf("Hígado hipertrofiado de pato o ganso", "Plato de cerdo", "Paté de pescado", "Charcutería alsaciana"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3245, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fromage le plus consommé en France ?", listOf("L'emmental", "Le camembert", "Le brie", "Le gruyère"), "Gastronomie", ""),
            en = LocalizedContent("What is the most consumed cheese in France?", listOf("Emmental", "Camembert", "Brie", "Gruyère"), "Gastronomy", ""),
            zh = LocalizedContent("法国消费最多的奶酪是什么？", listOf("埃曼塔", "卡门贝尔", "布里", "格鲁耶尔"), "美食", ""),
            es = LocalizedContent("¿Cuál es el queso más consumido en Francia?", listOf("Emmental", "Camembert", "Brie", "Gruyère"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3246, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la base d'une sauce béarnaise ?", listOf("Jaune d'œuf, beurre clarifié, estragon", "Crème fraîche et moutarde", "Tomates et basilic", "Vin blanc et échalotes"), "Gastronomie", ""),
            en = LocalizedContent("What is the base of a béarnaise sauce?", listOf("Egg yolk, clarified butter, tarragon", "Crème fraîche and mustard", "Tomatoes and basil", "White wine and shallots"), "Gastronomy", ""),
            zh = LocalizedContent("贝亚恩酱的基础是什么？", listOf("蛋黄、澄清黄油、龙蒿", "鲜奶油和芥末", "番茄和罗勒", "白葡萄酒和青葱"), "美食", ""),
            es = LocalizedContent("¿Cuál es la base de una salsa bearnesa?", listOf("Yema de huevo, mantequilla clarificada, estragón", "Crème fraîche y mostaza", "Tomates y albahaca", "Vino blanco y chalotas"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3247, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le carpaccio ?", listOf("Fines tranches de viande ou poisson crus", "Pâtes à la carbonara", "Pizza napolitaine", "Risotto milanais"), "Gastronomie", ""),
            en = LocalizedContent("What is carpaccio?", listOf("Thin slices of raw meat or fish", "Carbonara pasta", "Neapolitan pizza", "Milanese risotto"), "Gastronomy", ""),
            zh = LocalizedContent("什么是生牛肉片？", listOf("生肉或生鱼的薄片", "卡邦尼意面", "那不勒斯披萨", "米兰烩饭"), "美食", ""),
            es = LocalizedContent("¿Qué es el carpaccio?", listOf("Finas lonchas de carne o pescado crudos", "Pasta a la carbonara", "Pizza napolitana", "Risotto milanés"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3248, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a inventé les pâtes ?", listOf("Débat : Chine et Italie revendiquent", "L'Italie exclusivement", "La Chine exclusivement", "L'Arabie"), "Gastronomie", ""),
            en = LocalizedContent("Which country invented pasta?", listOf("Debate: China and Italy claim it", "Italy exclusively", "China exclusively", "Arabia"), "Gastronomy", ""),
            zh = LocalizedContent("哪个国家发明了意大利面？", listOf("争议：中国和意大利都声称", "仅意大利", "仅中国", "阿拉伯"), "美食", ""),
            es = LocalizedContent("¿Qué país inventó la pasta?", listOf("Debate: China e Italia lo reclaman", "Italia exclusivamente", "China exclusivamente", "Arabia"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3249, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la différence entre beurre demi-sel et beurre doux ?", listOf("Teneur en sel (0,5-3% vs <0,1%)", "Matière grasse différente", "Origine animale différente", "Processus de fabrication"), "Gastronomie", ""),
            en = LocalizedContent("What is the difference between demi-salt butter and sweet butter?", listOf("Salt content (0.5-3% vs <0.1%)", "Different fat content", "Different animal origin", "Manufacturing process"), "Gastronomy", ""),
            zh = LocalizedContent("半盐黄油和淡味黄油有什么区别？", listOf("盐含量（0.5-3% 对比 <0.1%）", "脂肪含量不同", "动物来源不同", "制作工艺不同"), "美食", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre la mantequilla semisalada y la mantequilla dulce?", listOf("Contenido de sal (0.5-3% vs <0.1%)", "Diferente contenido graso", "Diferente origen animal", "Proceso de fabricación"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3250, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle herbe aromatique donne son goût caractéristique au pesto ?", listOf("Basilic", "Persil", "Coriandre", "Romarin"), "Gastronomie", ""),
            en = LocalizedContent("Which aromatic herb gives pesto its characteristic flavor?", listOf("Basil", "Parsley", "Coriander", "Rosemary"), "Gastronomy", ""),
            zh = LocalizedContent("哪种香草赋予香蒜酱其特有的风味？", listOf("罗勒", "欧芹", "香菜", "迷迭香"), "美食", ""),
            es = LocalizedContent("¿Qué hierba aromática le da su sabor característico al pesto?", listOf("Albahaca", "Perejil", "Cilantro", "Romero"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3251, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de l'Espagne ?", listOf("Il n'y en a pas un seul officiel (paella souvent citée)", "La paella uniquement", "La tortilla", "Le gaspacho"), "Gastronomie", ""),
            en = LocalizedContent("What is the national dish of Spain?", listOf("There is no single official one (paella is often cited)", "Paella only", "Tortilla", "Gazpacho"), "Gastronomy", ""),
            zh = LocalizedContent("西班牙的国菜是什么？", listOf("没有单一的官方国菜（常提到海鲜饭）", "仅海鲜饭", "西班牙土豆饼", "西班牙冷汤"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato nacional de España?", listOf("No hay uno solo oficial (la paella se cita a menudo)", "Solo la paella", "La tortilla", "El gazpacho"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3255, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat traditionnel alsacien de choucroute ?", listOf("Choucroute garnie (chou fermenté + charcuterie)", "Flammekueche", "Baeckeoffe", "Kougelhopf"), "Gastronomie", ""),
            en = LocalizedContent("What is the traditional Alsatian sauerkraut dish?", listOf("Choucroute garnie (fermented cabbage + charcuterie)", "Flammekueche", "Baeckeoffe", "Kougelhopf"), "Gastronomy", ""),
            zh = LocalizedContent("阿尔萨斯传统的酸菜菜肴是什么？", listOf("酸菜配肉（发酵卷心菜+熟食）", "火焰薄饼", "阿尔萨斯炖菜", "库格尔霍夫蛋糕"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato tradicional alsaciano de chucrut?", listOf("Choucroute garnie (col fermentada + embutidos)", "Flammekueche", "Baeckeoffe", "Kougelhopf"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3256, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la levure utilisée dans la bière ?", listOf("Saccharomyces cerevisiae", "Lactobacillus", "Aspergillus niger", "Penicillium"), "Gastronomie", ""),
            en = LocalizedContent("What yeast is used in beer?", listOf("Saccharomyces cerevisiae", "Lactobacillus", "Aspergillus niger", "Penicillium"), "Gastronomy", ""),
            zh = LocalizedContent("啤酒中使用的是什么酵母？", listOf("酿酒酵母", "乳酸菌", "黑曲霉", "青霉菌"), "美食", ""),
            es = LocalizedContent("¿Qué levadura se utiliza en la cerveza?", listOf("Saccharomyces cerevisiae", "Lactobacillus", "Aspergillus niger", "Penicillium"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3257, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le quinoa ?", listOf("Pseudo-céréale d'Amérique du Sud", "Légumineuse africaine", "Céréale asiatique", "Racine tubéreuse"), "Gastronomie", ""),
            en = LocalizedContent("What is quinoa?", listOf("Pseudo-cereal from South America", "African legume", "Asian cereal", "Tuberous root"), "Gastronomy", ""),
            zh = LocalizedContent("藜麦是什么？", listOf("南美洲的假谷物", "非洲豆类", "亚洲谷物", "块根"), "美食", ""),
            es = LocalizedContent("¿Qué es la quinoa?", listOf("Pseudocereal de Sudamérica", "Legumbre africana", "Cereal asiático", "Raíz tuberosa"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3258, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le principal ingrédient du guacamole ?", listOf("Avocat", "Poivron vert", "Jalapeño", "Tomatillo"), "Gastronomie", ""),
            en = LocalizedContent("What is the main ingredient of guacamole?", listOf("Avocado", "Green bell pepper", "Jalapeño", "Tomatillo"), "Gastronomy", ""),
            zh = LocalizedContent("鳄梨酱的主要成分是什么？", listOf("牛油果", "青椒", "墨西哥辣椒", "酸浆果"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente principal del guacamole?", listOf("Aguacate", "Pimiento verde", "Jalapeño", "Tomatillo"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3259, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle sauce accompagne traditionnellement les fish and chips anglais ?", listOf("Vinaigre de malt", "Ketchup", "Mayonnaise", "Tartare"), "Gastronomie", ""),
            en = LocalizedContent("What sauce traditionally accompanies English fish and chips?", listOf("Malt vinegar", "Ketchup", "Mayonnaise", "Tartar sauce"), "Gastronomy", ""),
            zh = LocalizedContent("英国炸鱼薯条传统上搭配什么酱？", listOf("麦芽醋", "番茄酱", "蛋黄酱", "塔塔酱"), "美食", ""),
            es = LocalizedContent("¿Qué salsa acompaña tradicionalmente al fish and chips inglés?", listOf("Vinagre de malta", "Ketchup", "Mayonesa", "Salsa tártara"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3260, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la crème brûlée ?", listOf("Crème à la vanille avec croûte de sucre caramélisé", "Crème pâtissière glacée", "Flambée à l'alcool", "Mousse au chocolat"), "Gastronomie", ""),
            en = LocalizedContent("What is crème brûlée?", listOf("Vanilla custard with caramelized sugar crust", "Chilled pastry cream", "Flambeed with alcohol", "Chocolate mousse"), "Gastronomy", ""),
            zh = LocalizedContent("焦糖布丁是什么？", listOf("香草蛋奶冻配焦糖脆壳", "冷冻糕点奶油", "酒精火焰", "巧克力慕斯"), "美食", ""),
            es = LocalizedContent("¿Qué es la crème brûlée?", listOf("Natilla de vainilla con costra de azúcar caramelizado", "Crema pastelera fría", "Flameado con alcohol", "Mousse de chocolate"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3261, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays produit le plus de chocolat au monde ?", listOf("Côte d'Ivoire (fèves)", "Belgique (transformation)", "Suisse (transformation)", "Ghana"), "Gastronomie", ""),
            en = LocalizedContent("Which country produces the most chocolate in the world?", listOf("Ivory Coast (beans)", "Belgium (processing)", "Switzerland (processing)", "Ghana"), "Gastronomy", ""),
            zh = LocalizedContent("哪个国家生产世界上最多的巧克力？", listOf("科特迪瓦（可可豆）", "比利时（加工）", "瑞士（加工）", "加纳"), "美食", ""),
            es = LocalizedContent("¿Qué país produce más chocolate en el mundo?", listOf("Costa de Marfil (granos)", "Bélgica (transformación)", "Suiza (transformación)", "Ghana"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3262, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le tempeh ?", listOf("Galette fermentée de soja originaire d'Indonésie", "Fromage de soja japonais", "Sauce fermentée vietnamienne", "Pâte de pois chiches"), "Gastronomie", ""),
            en = LocalizedContent("What is tempeh?", listOf("Fermented soybean cake from Indonesia", "Japanese soybean cheese", "Vietnamese fermented sauce", "Chickpea paste"), "Gastronomy", ""),
            zh = LocalizedContent("天贝是什么？", listOf("印度尼西亚发酵大豆饼", "日本大豆奶酪", "越南发酵酱", "鹰嘴豆泥"), "美食", ""),
            es = LocalizedContent("¿Qué es el tempeh?", listOf("Pastel de soja fermentado de Indonesia", "Queso de soja japonés", "Salsa fermentada vietnamita", "Pasta de garbanzos"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3263, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'arôme caractéristique de la truffe noire ?", listOf("Terreux, musqué et boisé", "Sucré et fruité", "Épicé et piquant", "Citronné et frais"), "Gastronomie", ""),
            en = LocalizedContent("What is the characteristic aroma of black truffle?", listOf("Earthy, musky and woody", "Sweet and fruity", "Spicy and pungent", "Citrusy and fresh"), "Gastronomy", ""),
            zh = LocalizedContent("黑松露的典型香气是什么？", listOf("泥土、麝香和木质香", "甜味和果味", "辛辣和刺激", "柑橘和清新"), "美食", ""),
            es = LocalizedContent("¿Cuál es el aroma característico de la trufa negra?", listOf("Terroso, almizclado y amaderado", "Dulce y afrutado", "Picante y pungente", "Cítrico y fresco"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3264, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la boisson fermentée traditionnelle japonaise ?", listOf("Le saké (à base de riz)", "Le soju", "Le baijiu", "Le vin de prune"), "Gastronomie", ""),
            en = LocalizedContent("What is the traditional Japanese fermented beverage?", listOf("Sake (made from rice)", "Soju", "Baijiu", "Plum wine"), "Gastronomy", ""),
            zh = LocalizedContent("日本传统的发酵饮料是什么？", listOf("清酒（米酿）", "烧酒", "白酒", "梅酒"), "美食", ""),
            es = LocalizedContent("¿Cuál es la bebida fermentada tradicional japonesa?", listOf("El sake (a base de arroz)", "El soju", "El baijiu", "El vino de ciruela"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 3265, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe britannique est connu pour 'Bohemian Rhapsody' ?", listOf("Queen", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Musique", ""),
            en = LocalizedContent("Which British band is known for 'Bohemian Rhapsody'?", listOf("Queen", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Music", ""),
            zh = LocalizedContent("哪支英国乐队以《波西米亚狂想曲》闻名？", listOf("皇后乐队", "披头士乐队", "齐柏林飞艇乐队", "平克·弗洛伊德乐队"), "音乐", ""),
            es = LocalizedContent("¿Qué banda británica es conocida por 'Bohemian Rhapsody'?", listOf("Queen", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3266, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est surnommé le 'King of Pop' ?", listOf("Michael Jackson", "Elvis Presley", "Prince", "David Bowie"), "Musique", ""),
            en = LocalizedContent("Who is nicknamed the 'King of Pop'?", listOf("Michael Jackson", "Elvis Presley", "Prince", "David Bowie"), "Music", ""),
            zh = LocalizedContent("谁被称为“流行音乐之王”？", listOf("迈克尔·杰克逊", "埃尔维斯·普雷斯利", "王子", "大卫·鲍伊"), "音乐", ""),
            es = LocalizedContent("¿Quién es apodado el 'Rey del Pop'?", listOf("Michael Jackson", "Elvis Presley", "Prince", "David Bowie"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3267, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays est né le tango ?", listOf("Argentine (et Uruguay)", "Espagne", "Cuba", "Brésil"), "Musique", ""),
            en = LocalizedContent("In which country was tango born?", listOf("Argentina (and Uruguay)", "Spain", "Cuba", "Brazil"), "Music", ""),
            zh = LocalizedContent("探戈诞生于哪个国家？", listOf("阿根廷（和乌拉圭）", "西班牙", "古巴", "巴西"), "音乐", ""),
            es = LocalizedContent("¿En qué país nació el tango?", listOf("Argentina (y Uruguay)", "España", "Cuba", "Brasil"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3268, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument à vent utilise un bocal et une anche double ?", listOf("Le basson", "Le hautbois", "La clarinette", "Le saxophone"), "Musique", ""),
            en = LocalizedContent("Which wind instrument uses a bocal and a double reed?", listOf("Bassoon", "Oboe", "Clarinet", "Saxophone"), "Music", ""),
            zh = LocalizedContent("哪种管乐器使用S形管和双簧片？", listOf("巴松管", "双簧管", "单簧管", "萨克斯管"), "音乐", ""),
            es = LocalizedContent("¿Qué instrumento de viento utiliza un tudel y una caña doble?", listOf("El fagot", "El oboe", "El clarinete", "El saxofón"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3269, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé 'La Flûte enchantée' ?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Joseph Haydn"), "Musique", ""),
            en = LocalizedContent("Who composed 'The Magic Flute'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Joseph Haydn"), "Music", ""),
            zh = LocalizedContent("谁创作了《魔笛》？", listOf("沃尔夫冈·阿马德乌斯·莫扎特", "路德维希·范·贝多芬", "弗朗茨·舒伯特", "约瑟夫·海顿"), "音乐", ""),
            es = LocalizedContent("¿Quién compuso 'La flauta mágica'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert", "Joseph Haydn"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3270, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe français est connu pour 'Get Lucky' ?", listOf("Daft Punk", "Air", "Justice", "Phoenix"), "Musique", ""),
            en = LocalizedContent("Which French band is known for 'Get Lucky'?", listOf("Daft Punk", "Air", "Justice", "Phoenix"), "Music", ""),
            zh = LocalizedContent("哪支法国乐队以《Get Lucky》闻名？", listOf("蠢朋克乐队", "空气乐队", "正义乐队", "凤凰乐队"), "音乐", ""),
            es = LocalizedContent("¿Qué banda francesa es conocida por 'Get Lucky'?", listOf("Daft Punk", "Air", "Justice", "Phoenix"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3271, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de cordes a un violon ?", listOf("4", "3", "6", "5"), "Musique", ""),
            en = LocalizedContent("How many strings does a violin have?", listOf("4", "3", "6", "5"), "Music", ""),
            zh = LocalizedContent("小提琴有多少根弦？", listOf("4", "3", "6", "5"), "音乐", ""),
            es = LocalizedContent("¿Cuántas cuerdas tiene un violín?", listOf("4", "3", "6", "5"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3272, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur est connu pour 'Je t'aime... moi non plus' ?", listOf("Serge Gainsbourg", "Jacques Brel", "Georges Brassens", "Charles Aznavour"), "Musique", ""),
            en = LocalizedContent("Which singer is known for 'Je t'aime... moi non plus'?", listOf("Serge Gainsbourg", "Jacques Brel", "Georges Brassens", "Charles Aznavour"), "Music", ""),
            zh = LocalizedContent("哪位歌手以《Je t'aime... moi non plus》闻名？", listOf("塞尔日·甘斯布", "雅克·布雷尔", "乔治·布拉桑", "夏尔·阿兹纳武尔"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante es conocido por 'Je t'aime... moi non plus'?", listOf("Serge Gainsbourg", "Jacques Brel", "Georges Brassens", "Charles Aznavour"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3273, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle chanteuse américaine est connue comme la 'Reine de la pop' ?", listOf("Madonna", "Whitney Houston", "Mariah Carey", "Celine Dion"), "Musique", ""),
            en = LocalizedContent("Which American singer is known as the 'Queen of Pop'?", listOf("Madonna", "Whitney Houston", "Mariah Carey", "Celine Dion"), "Music", ""),
            zh = LocalizedContent("哪位美国歌手被称为“流行女王”？", listOf("麦当娜", "惠特妮·休斯顿", "玛丽亚·凯莉", "席琳·迪翁"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante estadounidense es conocida como la 'Reina del Pop'?", listOf("Madonna", "Whitney Houston", "Mariah Carey", "Celine Dion"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3274, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le tempo d'un morceau 'andante' ?", listOf("Allure modérée de marche", "Très lent", "Très rapide", "Rapide et vif"), "Musique", ""),
            en = LocalizedContent("What is the tempo of an 'andante' piece?", listOf("Moderate walking pace", "Very slow", "Very fast", "Fast and lively"), "Music", ""),
            zh = LocalizedContent("行板（andante）乐曲的速度是怎样的？", listOf("适中的步行速度", "非常慢", "非常快", "快速活泼"), "音乐", ""),
            es = LocalizedContent("¿Cuál es el tempo de una pieza 'andante'?", listOf("Ritmo moderado de marcha", "Muy lento", "Muy rápido", "Rápido y vivo"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3275, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'inventeur du saxophone ?", listOf("Adolphe Sax", "Louis Armstrong", "Coleman Hawkins", "Charlie Parker"), "Musique", ""),
            en = LocalizedContent("Who invented the saxophone?", listOf("Adolphe Sax", "Louis Armstrong", "Coleman Hawkins", "Charlie Parker"), "Music", ""),
            zh = LocalizedContent("谁发明了萨克斯管？", listOf("阿道夫·萨克斯", "路易斯·阿姆斯特朗", "科尔曼·霍金斯", "查理·帕克"), "音乐", ""),
            es = LocalizedContent("¿Quién inventó el saxofón?", listOf("Adolphe Sax", "Louis Armstrong", "Coleman Hawkins", "Charlie Parker"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3276, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe est à l'origine du genre musical 'grunge' ?", listOf("Nirvana, Pearl Jam, Soundgarden", "Seulement Nirvana", "Metallica", "Red Hot Chili Peppers"), "Musique", ""),
            en = LocalizedContent("Which band originated the grunge music genre?", listOf("Nirvana, Pearl Jam, Soundgarden", "Only Nirvana", "Metallica", "Red Hot Chili Peppers"), "Music", ""),
            zh = LocalizedContent("哪个乐队开创了垃圾摇滚音乐风格？", listOf("涅槃、珍珠果酱乐队、声音花园", "只有涅槃", "金属乐队", "红辣椒乐队"), "音乐", ""),
            es = LocalizedContent("¿Qué banda originó el género musical grunge?", listOf("Nirvana, Pearl Jam, Soundgarden", "Solo Nirvana", "Metallica", "Red Hot Chili Peppers"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3277, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de touches a un piano standard ?", listOf("88", "76", "100", "72"), "Musique", ""),
            en = LocalizedContent("How many keys does a standard piano have?", listOf("88", "76", "100", "72"), "Music", ""),
            zh = LocalizedContent("标准钢琴有多少个琴键？", listOf("88", "76", "100", "72"), "音乐", ""),
            es = LocalizedContent("¿Cuántas teclas tiene un piano estándar?", listOf("88", "76", "100", "72"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3278, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur est connu pour ses concerts debout sur scène avec un balai ?", listOf("Freddie Mercury", "Mick Jagger", "David Bowie", "Robert Plant"), "Musique", ""),
            en = LocalizedContent("Which singer is known for performing on stage with a broom?", listOf("Freddie Mercury", "Mick Jagger", "David Bowie", "Robert Plant"), "Music", ""),
            zh = LocalizedContent("哪位歌手以在舞台上拿着扫帚表演而闻名？", listOf("弗雷迪·默丘里", "米克·贾格尔", "大卫·鲍伊", "罗伯特·普兰特"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante es conocido por actuar en el escenario con una escoba?", listOf("Freddie Mercury", "Mick Jagger", "David Bowie", "Robert Plant"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3279, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la voix la plus grave chez l'homme ?", listOf("Basse", "Baryton", "Ténor", "Basse-taille"), "Musique", ""),
            en = LocalizedContent("What is the name of the lowest male voice?", listOf("Bass", "Baritone", "Tenor", "Bass-baritone"), "Music", ""),
            zh = LocalizedContent("男性最低的嗓音叫什么？", listOf("男低音", "男中音", "男高音", "低男中音"), "音乐", ""),
            es = LocalizedContent("¿Cuál es el nombre de la voz masculina más grave?", listOf("Bajo", "Barítono", "Tenor", "Bajo-barítono"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3280, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste a sorti l'album 'Thriller' en 1982 ?", listOf("Michael Jackson", "Prince", "Madonna", "Whitney Houston"), "Musique", ""),
            en = LocalizedContent("Which artist released the album 'Thriller' in 1982?", listOf("Michael Jackson", "Prince", "Madonna", "Whitney Houston"), "Music", ""),
            zh = LocalizedContent("哪位艺术家在1982年发行了专辑《Thriller》？", listOf("迈克尔·杰克逊", "王子", "麦当娜", "惠特尼·休斯顿"), "音乐", ""),
            es = LocalizedContent("¿Qué artista lanzó el álbum 'Thriller' en 1982?", listOf("Michael Jackson", "Prince", "Madonna", "Whitney Houston"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3281, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument traditionnel irlandais ressemble à une harpe portable ?", listOf("Le bodhran... non, la harpe celtique", "Le bodhrán", "Le uilleann pipes", "Le tin whistle"), "Musique", ""),
            en = LocalizedContent("Which traditional Irish instrument resembles a portable harp?", listOf("The bodhrán... no, the Celtic harp", "The bodhrán", "The uilleann pipes", "The tin whistle"), "Music", ""),
            zh = LocalizedContent("哪种传统爱尔兰乐器类似于便携式竖琴？", listOf("博德兰鼓...不，凯尔特竖琴", "博德兰鼓", "尤利安管", "锡笛"), "音乐", ""),
            es = LocalizedContent("¿Qué instrumento tradicional irlandés se asemeja a un arpa portátil?", listOf("El bodhrán... no, el arpa celta", "El bodhrán", "Las gaitas uilleann", "El tin whistle"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3282, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur allemand romantique est connu pour 'La Chevauchée des Walkyries' ?", listOf("Richard Wagner", "Johannes Brahms", "Robert Schumann", "Franz Liszt"), "Musique", ""),
            en = LocalizedContent("Which German Romantic composer is known for 'Ride of the Valkyries'?", listOf("Richard Wagner", "Johannes Brahms", "Robert Schumann", "Franz Liszt"), "Music", ""),
            zh = LocalizedContent("哪位德国浪漫主义作曲家以《女武神的骑行》闻名？", listOf("理查德·瓦格纳", "约翰内斯·勃拉姆斯", "罗伯特·舒曼", "弗朗茨·李斯特"), "音乐", ""),
            es = LocalizedContent("¿Qué compositor romántico alemán es conocido por 'La cabalgata de las valquirias'?", listOf("Richard Wagner", "Johannes Brahms", "Robert Schumann", "Franz Liszt"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3283, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle chanteuse française est connue pour 'Non, je ne regrette rien' ?", listOf("Édith Piaf", "Juliette Gréco", "Barbara", "Dalida"), "Musique", ""),
            en = LocalizedContent("Which French singer is known for 'Non, je ne regrette rien'?", listOf("Édith Piaf", "Juliette Gréco", "Barbara", "Dalida"), "Music", ""),
            zh = LocalizedContent("哪位法国歌手以《Non, je ne regrette rien》闻名？", listOf("伊迪丝·琵雅芙", "朱丽叶·格雷科", "芭芭拉", "达丽达"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante francesa es conocida por 'Non, je ne regrette rien'?", listOf("Édith Piaf", "Juliette Gréco", "Barbara", "Dalida"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3284, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand festival de musique du monde ?", listOf("Summerfest (Milwaukee) ou Coachella", "Coachella", "Glastonbury", "Download"), "Musique", ""),
            en = LocalizedContent("What is the largest music festival in the world?", listOf("Summerfest (Milwaukee) or Coachella", "Coachella", "Glastonbury", "Download"), "Music", ""),
            zh = LocalizedContent("世界上最大的音乐节是什么？", listOf("夏日音乐节（密尔沃基）或科切拉", "科切拉", "格拉斯顿伯里", "下载音乐节"), "音乐", ""),
            es = LocalizedContent("¿Cuál es el festival de música más grande del mundo?", listOf("Summerfest (Milwaukee) o Coachella", "Coachella", "Glastonbury", "Download"), "Musica", "")
        ),
        BilingualQuestion(
            id = 3286, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que pi (π) approximativement ?", listOf("3,14159...", "2,71828...", "1,61803...", "3,74166..."), "Mathématiques", ""),
            en = LocalizedContent("What is pi (π) approximately?", listOf("3.14159...", "2.71828...", "1.61803...", "3.74166..."), "Mathematics", ""),
            zh = LocalizedContent("圆周率π大约是多少？", listOf("3.14159...", "2.71828...", "1.61803...", "3.74166..."), "数学", ""),
            es = LocalizedContent("¿Qué es pi (π) aproximadamente?", listOf("3,14159...", "2,71828...", "1,61803...", "3,74166..."), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3287, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une fonction bijective ?", listOf("Injection et surjection : chaque élément a exactement un antécédent", "Une fonction croissante", "Une fonction paire", "Une fonction continue"), "Mathématiques", ""),
            en = LocalizedContent("What is a bijective function?", listOf("Injection and surjection: each element has exactly one preimage", "An increasing function", "An even function", "A continuous function"), "Mathematics", ""),
            zh = LocalizedContent("什么是双射函数？", listOf("单射且满射：每个元素恰好有一个原像", "递增函数", "偶函数", "连续函数"), "数学", ""),
            es = LocalizedContent("¿Qué es una función biyectiva?", listOf("Inyección y sobreyección: cada elemento tiene exactamente una preimagen", "Una función creciente", "Una función par", "Una función continua"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3288, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la dérivée d'une fonction ?", listOf("Le taux de variation instantané", "L'aire sous la courbe", "La valeur moyenne", "L'intégrale"), "Mathématiques", ""),
            en = LocalizedContent("What is the derivative of a function?", listOf("The instantaneous rate of change", "The area under the curve", "The average value", "The integral"), "Mathematics", ""),
            zh = LocalizedContent("函数的导数是什么？", listOf("瞬时变化率", "曲线下的面积", "平均值", "积分"), "数学", ""),
            es = LocalizedContent("¿Qué es la derivada de una función?", listOf("La tasa de cambio instantánea", "El área bajo la curva", "El valor promedio", "La integral"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3289, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du nombre d'or ?", listOf("φ (phi) ≈ 1,618", "π (pi) ≈ 3,14", "e ≈ 2,718", "√2 ≈ 1,414"), "Mathématiques", ""),
            en = LocalizedContent("What is the name of the golden ratio?", listOf("φ (phi) ≈ 1.618", "π (pi) ≈ 3.14", "e ≈ 2.718", "√2 ≈ 1.414"), "Mathematics", ""),
            zh = LocalizedContent("黄金比例的名称是什么？", listOf("φ（phi）≈ 1.618", "π（圆周率）≈ 3.14", "e ≈ 2.718", "√2 ≈ 1.414"), "数学", ""),
            es = LocalizedContent("¿Cuál es el nombre del número áureo?", listOf("φ (phi) ≈ 1,618", "π (pi) ≈ 3,14", "e ≈ 2,718", "√2 ≈ 1,414"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3290, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une suite géométrique ?", listOf("Suite où chaque terme = terme précédent × raison constante", "Suite de termes croissants", "Suite où chaque terme = terme précédent + raison", "Suite de nombres premiers"), "Mathématiques", ""),
            en = LocalizedContent("What is a geometric sequence?", listOf("Sequence where each term = previous term × constant ratio", "Sequence of increasing terms", "Sequence where each term = previous term + common difference", "Sequence of prime numbers"), "Mathematics", ""),
            zh = LocalizedContent("什么是等比数列？", listOf("每一项等于前一项乘以常数比的数列", "递增数列", "每一项等于前一项加上公差的数列", "质数数列"), "数学", ""),
            es = LocalizedContent("¿Qué es una sucesión geométrica?", listOf("Sucesión donde cada término = término anterior × razón constante", "Sucesión de términos crecientes", "Sucesión donde cada término = término anterior + diferencia común", "Sucesión de números primos"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3291, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le théorème de Fermat démontré en 1995 ?", listOf("xⁿ + yⁿ = zⁿ n'a pas de solution entière pour n > 2", "Tout nombre premier est impair", "Il y a une infinité de nombres premiers", "Tout entier est somme de 4 carrés"), "Mathématiques", ""),
            en = LocalizedContent("What is Fermat's theorem proved in 1995?", listOf("xⁿ + yⁿ = zⁿ has no integer solution for n > 2", "Every prime number is odd", "There are infinitely many prime numbers", "Every integer is the sum of 4 squares"), "Mathematics", ""),
            zh = LocalizedContent("1995年证明的费马定理是什么？", listOf("xⁿ + yⁿ = zⁿ 在 n > 2 时没有整数解", "每个质数都是奇数", "有无穷多个质数", "每个整数都是四个平方数之和"), "数学", ""),
            es = LocalizedContent("¿Cuál es el teorema de Fermat demostrado en 1995?", listOf("xⁿ + yⁿ = zⁿ no tiene solución entera para n > 2", "Todo número primo es impar", "Hay infinitos números primos", "Todo entero es suma de 4 cuadrados"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3292, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la probabilité conditionnelle P(A|B) ?", listOf("Probabilité de A sachant que B s'est réalisé", "Probabilité de A et B ensemble", "Probabilité de A ou B", "Probabilité de non A"), "Mathématiques", ""),
            en = LocalizedContent("What is conditional probability P(A|B)?", listOf("Probability of A given that B has occurred", "Probability of A and B together", "Probability of A or B", "Probability of not A"), "Mathematics", ""),
            zh = LocalizedContent("什么是条件概率 P(A|B)？", listOf("在B发生的条件下A的概率", "A和B同时发生的概率", "A或B发生的概率", "非A的概率"), "数学", ""),
            es = LocalizedContent("¿Qué es la probabilidad condicional P(A|B)?", listOf("Probabilidad de A dado que B ha ocurrido", "Probabilidad de A y B juntos", "Probabilidad de A o B", "Probabilidad de no A"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3293, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de côtés a un dodécagone ?", listOf("12", "10", "11", "8"), "Mathématiques", ""),
            en = LocalizedContent("How many sides does a dodecagon have?", listOf("12", "10", "11", "8"), "Mathematics", ""),
            zh = LocalizedContent("十二边形有多少条边？", listOf("12", "10", "11", "8"), "数学", ""),
            es = LocalizedContent("¿Cuántos lados tiene un dodecágono?", listOf("12", "10", "11", "8"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3294, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le logarithme naturel ln(e) ?", listOf("1", "0", "e", "10"), "Mathématiques", ""),
            en = LocalizedContent("What is the natural logarithm ln(e)?", listOf("1", "0", "e", "10"), "Mathematics", ""),
            zh = LocalizedContent("自然对数 ln(e) 等于多少？", listOf("1", "0", "e", "10"), "数学", ""),
            es = LocalizedContent("¿Cuánto es el logaritmo natural ln(e)?", listOf("1", "0", "e", "10"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3295, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une matrice diagonale ?", listOf("Matrice avec valeurs non nulles seulement sur la diagonale", "Matrice identité", "Matrice avec toutes les valeurs égales", "Matrice rectangulaire"), "Mathématiques", ""),
            en = LocalizedContent("What is a diagonal matrix?", listOf("Matrix with non-zero values only on the diagonal", "Identity matrix", "Matrix with all equal values", "Rectangular matrix"), "Mathematics", ""),
            zh = LocalizedContent("什么是对角矩阵？", listOf("只有对角线上有非零值的矩阵", "单位矩阵", "所有值都相等的矩阵", "矩形矩阵"), "数学", ""),
            es = LocalizedContent("¿Qué es una matriz diagonal?", listOf("Matriz con valores no nulos solo en la diagonal", "Matriz identidad", "Matriz con todos los valores iguales", "Matriz rectangular"), "Matemáticas", "")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 3296, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le résultat de 0! (zéro factorielle) ?", listOf("1", "0", "Indéfini", "∞"), "Mathématiques", ""),
            en = LocalizedContent("What is the result of 0! (zero factorial)?", listOf("1", "0", "Undefined", "∞"), "Mathematics", ""),
            zh = LocalizedContent("0!（零的阶乘）的结果是什么？", listOf("1", "0", "未定义", "∞"), "数学", ""),
            es = LocalizedContent("¿Cuál es el resultado de 0! (cero factorial)?", listOf("1", "0", "Indefinido", "∞"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3297, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la congruence modulaire ?", listOf("Égalité du reste dans une division euclidienne", "Similarité de triangles", "Égalité de vecteurs", "Proportionnalité"), "Mathématiques", ""),
            en = LocalizedContent("What is modular congruence?", listOf("Equality of remainder in Euclidean division", "Similarity of triangles", "Equality of vectors", "Proportionality"), "Mathematics", ""),
            zh = LocalizedContent("什么是模同余？", listOf("欧几里得除法中余数相等", "三角形相似", "向量相等", "比例性"), "数学", ""),
            es = LocalizedContent("¿Qué es la congruencia modular?", listOf("Igualdad del resto en una división euclidiana", "Semejanza de triángulos", "Igualdad de vectores", "Proporcionalidad"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3298, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un nombre irrationnel ?", listOf("Nombre ne pouvant s'écrire comme fraction p/q", "Nombre négatif", "Nombre très grand", "Nombre complexe"), "Mathématiques", ""),
            en = LocalizedContent("What is an irrational number?", listOf("Number that cannot be written as a fraction p/q", "Negative number", "Very large number", "Complex number"), "Mathematics", ""),
            zh = LocalizedContent("什么是无理数？", listOf("不能表示为分数 p/q 的数", "负数", "非常大的数", "复数"), "数学", ""),
            es = LocalizedContent("¿Qué es un número irracional?", listOf("Número que no puede escribirse como fracción p/q", "Número negativo", "Número muy grande", "Número complejo"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3299, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la somme des angles d'un triangle ?", listOf("180°", "360°", "270°", "90°"), "Mathématiques", ""),
            en = LocalizedContent("What is the sum of the angles of a triangle?", listOf("180°", "360°", "270°", "90°"), "Mathematics", ""),
            zh = LocalizedContent("三角形内角之和是多少？", listOf("180°", "360°", "270°", "90°"), "数学", ""),
            es = LocalizedContent("¿Cuál es la suma de los ángulos de un triángulo?", listOf("180°", "360°", "270°", "90°"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3300, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la limite d'une suite ?", listOf("La valeur vers laquelle tend la suite à l'infini", "La valeur maximale de la suite", "La valeur minimale de la suite", "La valeur initiale"), "Mathématiques", ""),
            en = LocalizedContent("What is the limit of a sequence?", listOf("The value the sequence approaches at infinity", "The maximum value of the sequence", "The minimum value of the sequence", "The initial value"), "Mathematics", ""),
            zh = LocalizedContent("什么是数列的极限？", listOf("数列在无穷远处趋近的值", "数列的最大值", "数列的最小值", "初始值"), "数学", ""),
            es = LocalizedContent("¿Qué es el límite de una sucesión?", listOf("El valor al que tiende la sucesión en el infinito", "El valor máximo de la sucesión", "El valor mínimo de la sucesión", "El valor inicial"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3301, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mathématicien a formulé les équations du mouvement d'une sphère dans un champ de gravité ?", listOf("Newton", "Leibniz", "Euler", "Lagrange"), "Mathématiques", ""),
            en = LocalizedContent("Which mathematician formulated the equations of motion of a sphere in a gravitational field?", listOf("Newton", "Leibniz", "Euler", "Lagrange"), "Mathematics", ""),
            zh = LocalizedContent("哪位数学家提出了球体在引力场中的运动方程？", listOf("牛顿", "莱布尼茨", "欧拉", "拉格朗日"), "数学", ""),
            es = LocalizedContent("¿Qué matemático formuló las ecuaciones del movimiento de una esfera en un campo gravitatorio?", listOf("Newton", "Leibniz", "Euler", "Lagrange"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3302, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la théorie des graphes ?", listOf("Étude des relations entre objets représentés par nœuds et arêtes", "Étude des fonctions graphiques", "Représentation statistique de données", "Géométrie non euclidienne"), "Mathématiques", ""),
            en = LocalizedContent("What is graph theory?", listOf("Study of relationships between objects represented by nodes and edges", "Study of graphical functions", "Statistical representation of data", "Non-Euclidean geometry"), "Mathematics", ""),
            zh = LocalizedContent("什么是图论？", listOf("研究由节点和边表示的对象之间的关系", "研究图形函数", "数据的统计表示", "非欧几何"), "数学", ""),
            es = LocalizedContent("¿Qué es la teoría de grafos?", listOf("Estudio de las relaciones entre objetos representados por nodos y aristas", "Estudio de funciones gráficas", "Representación estadística de datos", "Geometría no euclidiana"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3303, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un nombre parfait ?", listOf("Nombre égal à la somme de ses diviseurs propres (ex: 6 = 1+2+3)", "Nombre premier", "Nombre carré", "Nombre de Fibonacci"), "Mathématiques", ""),
            en = LocalizedContent("What is a perfect number?", listOf("Number equal to the sum of its proper divisors (e.g., 6 = 1+2+3)", "Prime number", "Square number", "Fibonacci number"), "Mathematics", ""),
            zh = LocalizedContent("什么是完全数？", listOf("等于其真因子之和的数（例如 6 = 1+2+3）", "质数", "平方数", "斐波那契数"), "数学", ""),
            es = LocalizedContent("¿Qué es un número perfecto?", listOf("Número igual a la suma de sus divisores propios (ej: 6 = 1+2+3)", "Número primo", "Número cuadrado", "Número de Fibonacci"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3304, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle fonction mathematique est egale a sa propre derivee ?", listOf("e^x", "x·e^(x-1)", "ln(x)", "1/x"), "Mathématiques", ""),
            en = LocalizedContent("Which mathematical function is equal to its own derivative?", listOf("e^x", "x·e^(x-1)", "ln(x)", "1/x"), "Mathematics", ""),
            zh = LocalizedContent("哪个数学函数等于其自身的导数？", listOf("e^x", "x·e^(x-1)", "ln(x)", "1/x"), "数学", ""),
            es = LocalizedContent("¿Qué función matemática es igual a su propia derivada?", listOf("e^x", "x·e^(x-1)", "ln(x)", "1/x"), "Matemáticas", "")
        ),
        BilingualQuestion(
            id = 3305, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la séparation des pouvoirs ?", listOf("Division entre législatif, exécutif et judiciaire", "Partage du pouvoir entre partis", "Décentralisation régionale", "Fédéralisme"), "Politique", ""),
            en = LocalizedContent("What is the separation of powers?", listOf("Division among legislative, executive, and judicial", "Sharing of power among parties", "Regional decentralization", "Federalism"), "Politics", ""),
            zh = LocalizedContent("什么是权力分立？", listOf("立法、行政和司法之间的划分", "政党之间的权力分享", "区域分权", "联邦制"), "政治", ""),
            es = LocalizedContent("¿Qué es la separación de poderes?", listOf("División entre legislativo, ejecutivo y judicial", "Reparto del poder entre partidos", "Descentralización regional", "Federalismo"), "Política", "")
        ),
        BilingualQuestion(
            id = 3306, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel traité a fondé l'Union européenne ?", listOf("Traité de Maastricht (1992)", "Traité de Rome (1957)", "Traité de Lisbonne (2007)", "Traité d'Amsterdam (1997)"), "Politique", ""),
            en = LocalizedContent("Which treaty founded the European Union?", listOf("Maastricht Treaty (1992)", "Treaty of Rome (1957)", "Treaty of Lisbon (2007)", "Treaty of Amsterdam (1997)"), "Politics", ""),
            zh = LocalizedContent("哪个条约建立了欧盟？", listOf("《马斯特里赫特条约》（1992年）", "《罗马条约》（1957年）", "《里斯本条约》（2007年）", "《阿姆斯特丹条约》（1997年）"), "政治", ""),
            es = LocalizedContent("¿Qué tratado fundó la Unión Europea?", listOf("Tratado de Maastricht (1992)", "Tratado de Roma (1957)", "Tratado de Lisboa (2007)", "Tratado de Ámsterdam (1997)"), "Política", "")
        ),
        BilingualQuestion(
            id = 3307, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le droit de veto au Conseil de sécurité de l'ONU ?", listOf("Droit des 5 membres permanents de bloquer une résolution", "Droit de voter contre", "Droit d'absence lors d'un vote", "Droit d'appel des décisions"), "Politique", ""),
            en = LocalizedContent("What is the veto power in the UN Security Council?", listOf("Right of the 5 permanent members to block a resolution", "Right to vote against", "Right to be absent during a vote", "Right to appeal decisions"), "Politics", ""),
            zh = LocalizedContent("联合国安理会的否决权是什么？", listOf("五个常任理事国阻止决议的权利", "投票反对的权利", "投票时缺席的权利", "对决定提出上诉的权利"), "政治", ""),
            es = LocalizedContent("¿Qué es el derecho de veto en el Consejo de Seguridad de la ONU?", listOf("Derecho de los 5 miembros permanentes a bloquear una resolución", "Derecho a votar en contra", "Derecho a ausentarse durante una votación", "Derecho a apelar decisiones"), "Política", "")
        ),
        BilingualQuestion(
            id = 3308, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de membres permanents compte le Conseil de sécurité de l'ONU ?", listOf("5 (USA, Russie, Chine, UK, France)", "7", "10", "15"), "Politique", ""),
            en = LocalizedContent("How many permanent members does the UN Security Council have?", listOf("5 (USA, Russia, China, UK, France)", "7", "10", "15"), "Politics", ""),
            zh = LocalizedContent("联合国安理会有多少个常任理事国？", listOf("5个（美国、俄罗斯、中国、英国、法国）", "7个", "10个", "15个"), "政治", ""),
            es = LocalizedContent("¿Cuántos miembros permanentes tiene el Consejo de Seguridad de la ONU?", listOf("5 (EE.UU., Rusia, China, Reino Unido, Francia)", "7", "10", "15"), "Política", "")
        ),
        BilingualQuestion(
            id = 3309, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un régime présidentiel ?", listOf("Le président dirige l'exécutif indépendamment du parlement", "Le parlement contrôle le gouvernement", "Le roi nomme le président", "L'exécutif et le législatif sont confondus"), "Politique", ""),
            en = LocalizedContent("What is a presidential system?", listOf("The president leads the executive independently of parliament", "Parliament controls the government", "The king appoints the president", "The executive and legislative are merged"), "Politics", ""),
            zh = LocalizedContent("什么是总统制？", listOf("总统独立于议会领导行政", "议会控制政府", "国王任命总统", "行政和立法合并"), "政治", ""),
            es = LocalizedContent("¿Qué es un régimen presidencial?", listOf("El presidente dirige el ejecutivo independientemente del parlamento", "El parlamento controla el gobierno", "El rey nombra al presidente", "El ejecutivo y el legislativo están fusionados"), "Política", "")
        ),
        BilingualQuestion(
            id = 3310, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de la démocratie directe ?", listOf("Les citoyens votent directement les lois", "Les citoyens élisent des représentants", "Un chef d'État élu dirige", "Le peuple délègue le pouvoir"), "Politique", ""),
            en = LocalizedContent("What is the principle of direct democracy?", listOf("Citizens vote directly on laws", "Citizens elect representatives", "An elected head of state leads", "The people delegate power"), "Politics", ""),
            zh = LocalizedContent("直接民主的原则是什么？", listOf("公民直接投票决定法律", "公民选举代表", "民选国家元首领导", "人民委托权力"), "政治", ""),
            es = LocalizedContent("¿Cuál es el principio de la democracia directa?", listOf("Los ciudadanos votan directamente las leyes", "Los ciudadanos eligen representantes", "Un jefe de Estado electo dirige", "El pueblo delega el poder"), "Política", "")
        ),
        BilingualQuestion(
            id = 3311, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un État de droit ?", listOf("État où tous sont soumis à la loi, y compris les gouvernants", "État avec de nombreuses lois", "État avec un parlement fort", "État fédéral"), "Politique", ""),
            en = LocalizedContent("What is a state of law?", listOf("A state where everyone is subject to the law, including the rulers", "A state with many laws", "A state with a strong parliament", "A federal state"), "Politics", ""),
            zh = LocalizedContent("什么是法治国家？", listOf("所有人都受法律约束，包括统治者", "法律众多的国家", "议会强大的国家", "联邦制国家"), "政治", ""),
            es = LocalizedContent("¿Qué es un Estado de derecho?", listOf("Estado donde todos están sujetos a la ley, incluidos los gobernantes", "Estado con muchas leyes", "Estado con un parlamento fuerte", "Estado federal"), "Política", "")
        ),
        BilingualQuestion(
            id = 3312, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la différence entre referendum et plébiscite ?", listOf("Le référendum est voté pour ou contre une loi, le plébiscite pour ou contre un homme", "Ce sont des synonymes", "Le plébiscite concerne les lois", "Le referendum est consultatif"), "Politique", ""),
            en = LocalizedContent("What is the difference between a referendum and a plebiscite?", listOf("A referendum is voted for or against a law, a plebiscite for or against a person", "They are synonyms", "A plebiscite concerns laws", "A referendum is advisory"), "Politics", ""),
            zh = LocalizedContent("公投和全民表决有什么区别？", listOf("公投是对法律投赞成或反对票，全民表决是对个人投赞成或反对票", "它们是同义词", "全民表决涉及法律", "公投是咨询性的"), "政治", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre referéndum y plebiscito?", listOf("El referéndum se vota a favor o en contra de una ley, el plebiscito a favor o en contra de una persona", "Son sinónimos", "El plebiscito se refiere a leyes", "El referéndum es consultivo"), "Política", "")
        ),
        BilingualQuestion(
            id = 3313, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mandat présidentiel en France ?", listOf("5 ans renouvelable une fois", "7 ans", "4 ans renouvelable", "6 ans non renouvelable"), "Politique", ""),
            en = LocalizedContent("What is the presidential term in France?", listOf("5 years renewable once", "7 years", "4 years renewable", "6 years non-renewable"), "Politics", ""),
            zh = LocalizedContent("法国总统的任期是多久？", listOf("5年，可连任一次", "7年", "4年，可连任", "6年，不可连任"), "政治", ""),
            es = LocalizedContent("¿Cuál es el mandato presidencial en Francia?", listOf("5 años renovable una vez", "7 años", "4 años renovable", "6 años no renovable"), "Política", "")
        ),
        BilingualQuestion(
            id = 3314, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'habeas corpus ?", listOf("Droit de ne pas être détenu sans motif légal", "Droit à un avocat", "Droit au silence", "Présomption d'innocence"), "Politique", ""),
            en = LocalizedContent("What is habeas corpus?", listOf("Right not to be detained without legal cause", "Right to a lawyer", "Right to remain silent", "Presumption of innocence"), "Politics", ""),
            zh = LocalizedContent("什么是人身保护令？", listOf("未经合法理由不得被拘留的权利", "获得律师的权利", "保持沉默的权利", "无罪推定"), "政治", ""),
            es = LocalizedContent("¿Qué es el hábeas corpus?", listOf("Derecho a no ser detenido sin motivo legal", "Derecho a un abogado", "Derecho a guardar silencio", "Presunción de inocencia"), "Política", "")
        ),
        BilingualQuestion(
            id = 3315, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'inflation ?", listOf("Hausse générale des prix et baisse du pouvoir d'achat", "Croissance économique", "Hausse des taux d'intérêt", "Dévaluation monétaire"), "Économie", ""),
            en = LocalizedContent("What is inflation?", listOf("General rise in prices and decrease in purchasing power", "Economic growth", "Rise in interest rates", "Currency devaluation"), "Economics", ""),
            zh = LocalizedContent("什么是通货膨胀？", listOf("物价普遍上涨，购买力下降", "经济增长", "利率上升", "货币贬值"), "经济", ""),
            es = LocalizedContent("¿Qué es la inflación?", listOf("Aumento general de precios y disminución del poder adquisitivo", "Crecimiento económico", "Aumento de las tasas de interés", "Devaluación monetaria"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3316, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le PIB ?", listOf("Produit Intérieur Brut: valeur totale des biens produits dans un pays", "Produit Industriel Brut", "Profit International Bancaire", "Prélèvement Interne Brut"), "Économie", ""),
            en = LocalizedContent("What is GDP?", listOf("Gross Domestic Product: total value of goods produced in a country", "Gross Industrial Product", "International Banking Profit", "Gross Internal Levy"), "Economics", ""),
            zh = LocalizedContent("什么是GDP？", listOf("国内生产总值：一个国家生产的商品总价值", "工业总产值", "国际银行利润", "国内总征收"), "经济", ""),
            es = LocalizedContent("¿Qué es el PIB?", listOf("Producto Interno Bruto: valor total de los bienes producidos en un país", "Producto Industrial Bruto", "Beneficio Internacional Bancario", "Recaudación Interna Bruta"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3317, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la loi de l'offre et de la demande ?", listOf("Prix d'équilibre là où l'offre égale la demande", "Les prix augmentent toujours", "La demande crée l'offre", "L'État fixe les prix"), "Économie", ""),
            en = LocalizedContent("What is the law of supply and demand?", listOf("Equilibrium price where supply equals demand", "Prices always increase", "Demand creates supply", "The state sets prices"), "Economics", ""),
            zh = LocalizedContent("什么是供求规律？", listOf("供给等于需求时的均衡价格", "价格总是上涨", "需求创造供给", "国家定价"), "经济", ""),
            es = LocalizedContent("¿Qué es la ley de la oferta y la demanda?", listOf("Precio de equilibrio donde la oferta iguala la demanda", "Los precios siempre aumentan", "La demanda crea la oferta", "El Estado fija los precios"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3318, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle institution mondiale gère les taux de change ?", listOf("FMI (Fonds Monétaire International)", "Banque Mondiale", "OMC", "BRI"), "Économie", ""),
            en = LocalizedContent("Which global institution manages exchange rates?", listOf("IMF (International Monetary Fund)", "World Bank", "WTO", "BIS"), "Economics", ""),
            zh = LocalizedContent("哪个全球机构管理汇率？", listOf("国际货币基金组织（IMF）", "世界银行", "世界贸易组织", "国际清算银行"), "经济", ""),
            es = LocalizedContent("¿Qué institución mundial gestiona los tipos de cambio?", listOf("FMI (Fondo Monetario Internacional)", "Banco Mundial", "OMC", "BRI"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3319, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la déflation ?", listOf("Baisse générale et durable des prix", "Contraire de l'inflation modérée", "Réduction des dépenses publiques", "Dévaluation monétaire"), "Économie", ""),
            en = LocalizedContent("What is deflation?", listOf("General and sustained decrease in prices", "Opposite of moderate inflation", "Reduction in public spending", "Currency devaluation"), "Economics", ""),
            zh = LocalizedContent("什么是通货紧缩？", listOf("价格普遍持续下降", "温和通货膨胀的反面", "减少公共支出", "货币贬值"), "经济", ""),
            es = LocalizedContent("¿Qué es la deflación?", listOf("Disminución general y sostenida de los precios", "Contrario de la inflación moderada", "Reducción del gasto público", "Devaluación monetaria"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3320, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel économiste a théorisé le capitalisme dans 'La Richesse des Nations' ?", listOf("Adam Smith", "Karl Marx", "John Maynard Keynes", "Milton Friedman"), "Économie", ""),
            en = LocalizedContent("Which economist theorized capitalism in 'The Wealth of Nations'?", listOf("Adam Smith", "Karl Marx", "John Maynard Keynes", "Milton Friedman"), "Economics", ""),
            zh = LocalizedContent("哪位经济学家在《国富论》中阐述了资本主义理论？", listOf("亚当·斯密", "卡尔·马克思", "约翰·梅纳德·凯恩斯", "米尔顿·弗里德曼"), "经济", ""),
            es = LocalizedContent("¿Qué economista teorizó el capitalismo en 'La Riqueza de las Naciones'?", listOf("Adam Smith", "Karl Marx", "John Maynard Keynes", "Milton Friedman"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3321, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le chômage frictionnel ?", listOf("Chômage temporaire lors d'une transition entre emplois", "Chômage dû à la conjoncture", "Chômage de longue durée", "Chômage saisonnier"), "Économie", ""),
            en = LocalizedContent("What is frictional unemployment?", listOf("Temporary unemployment during a transition between jobs", "Unemployment due to economic conditions", "Long-term unemployment", "Seasonal unemployment"), "Economics", ""),
            zh = LocalizedContent("什么是摩擦性失业？", listOf("工作转换期间的暂时性失业", "因经济形势导致的失业", "长期失业", "季节性失业"), "经济", ""),
            es = LocalizedContent("¿Qué es el desempleo friccional?", listOf("Desempleo temporal durante una transición entre empleos", "Desempleo debido a la coyuntura", "Desempleo de larga duración", "Desempleo estacional"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3322, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la mission principale de la BCE ?", listOf("Maintenir la stabilité des prix dans la zone euro", "Financer les déficits publics", "Contrôler les banques commerciales", "Gérer le commerce international"), "Économie", ""),
            en = LocalizedContent("What is the main mission of the ECB?", listOf("Maintain price stability in the eurozone", "Finance public deficits", "Control commercial banks", "Manage international trade"), "Economics", ""),
            zh = LocalizedContent("欧洲央行（ECB）的主要使命是什么？", listOf("维持欧元区的价格稳定", "为公共赤字融资", "控制商业银行", "管理国际贸易"), "经济", ""),
            es = LocalizedContent("¿Cuál es la misión principal del BCE?", listOf("Mantener la estabilidad de precios en la zona euro", "Financiar los déficits públicos", "Controlar los bancos comerciales", "Gestionar el comercio internacional"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3323, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le capitalisme ?", listOf("Système économique basé sur la propriété privée et le marché libre", "Système de planification centrale", "Système coopératif", "Économie mixte"), "Économie", ""),
            en = LocalizedContent("What is capitalism?", listOf("Economic system based on private property and free market", "Central planning system", "Cooperative system", "Mixed economy"), "Economics", ""),
            zh = LocalizedContent("什么是资本主义？", listOf("基于私有制和自由市场的经济制度", "中央计划经济", "合作经济", "混合经济"), "经济", ""),
            es = LocalizedContent("¿Qué es el capitalismo?", listOf("Sistema económico basado en la propiedad privada y el mercado libre", "Sistema de planificación central", "Sistema cooperativo", "Economía mixta"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3324, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle des banques centrales ?", listOf("Émettre la monnaie et réguler la politique monétaire", "Prêter aux particuliers", "Assurer les dépôts", "Financer les entreprises"), "Économie", ""),
            en = LocalizedContent("What is the role of central banks?", listOf("Issue currency and regulate monetary policy", "Lend to individuals", "Insure deposits", "Finance businesses"), "Economics", ""),
            zh = LocalizedContent("中央银行的作用是什么？", listOf("发行货币并调节货币政策", "向个人贷款", "存款保险", "为企业融资"), "经济", ""),
            es = LocalizedContent("¿Cuál es el papel de los bancos centrales?", listOf("Emitir moneda y regular la política monetaria", "Prestar a particulares", "Asegurar los depósitos", "Financiar empresas"), "Economía", "")
        ),
        BilingualQuestion(
            id = 3325, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la biodiversité ?", listOf("Variété des formes de vie sur Terre", "Nombre d'espèces d'arbres", "Diversité climatique", "Richesse des sols"), "Nature", ""),
            en = LocalizedContent("What is biodiversity?", listOf("Variety of life forms on Earth", "Number of tree species", "Climatic diversity", "Soil richness"), "Nature", ""),
            zh = LocalizedContent("什么是生物多样性？", listOf("地球上生命形式的多样性", "树木物种数量", "气候多样性", "土壤肥沃度"), "自然", ""),
            es = LocalizedContent("¿Qué es la biodiversidad?", listOf("Variedad de formas de vida en la Tierra", "Número de especies de árboles", "Diversidad climática", "Riqueza del suelo"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3326, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la principale cause du changement climatique actuel ?", listOf("Émissions de gaz à effet de serre d'origine humaine", "Variations solaires", "Activité volcanique", "Déforestation uniquement"), "Nature", ""),
            en = LocalizedContent("What is the main cause of current climate change?", listOf("Human-caused greenhouse gas emissions", "Solar variations", "Volcanic activity", "Deforestation only"), "Nature", ""),
            zh = LocalizedContent("当前气候变化的主要原因是什么？", listOf("人为温室气体排放", "太阳变化", "火山活动", "仅森林砍伐"), "自然", ""),
            es = LocalizedContent("¿Cuál es la principal causa del cambio climático actual?", listOf("Emisiones de gases de efecto invernadero de origen humano", "Variaciones solares", "Actividad volcánica", "Deforestación únicamente"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3327, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un écosystème ?", listOf("Ensemble d'êtres vivants et leur milieu en interaction", "Un type de forêt", "Une chaîne alimentaire", "Un biome climatique"), "Nature", ""),
            en = LocalizedContent("What is an ecosystem?", listOf("A community of living organisms and their environment interacting", "A type of forest", "A food chain", "A climatic biome"), "Nature", ""),
            zh = LocalizedContent("什么是生态系统？", listOf("生物群落及其环境相互作用的整体", "一种森林类型", "一条食物链", "一个气候生物群系"), "自然", ""),
            es = LocalizedContent("¿Qué es un ecosistema?", listOf("Conjunto de seres vivos y su medio en interacción", "Un tipo de bosque", "Una cadena alimentaria", "Un bioma climático"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3328, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand récif corallien du monde ?", listOf("La Grande Barrière de Corail (Australie)", "Le récif mésoaméricain", "Les récifs des Maldives", "Le récif Andros"), "Nature", ""),
            en = LocalizedContent("What is the largest coral reef in the world?", listOf("The Great Barrier Reef (Australia)", "The Mesoamerican Reef", "The Maldives reefs", "The Andros Reef"), "Nature", ""),
            zh = LocalizedContent("世界上最大的珊瑚礁是什么？", listOf("大堡礁（澳大利亚）", "中美洲礁", "马尔代夫礁", "安德罗斯礁"), "自然", ""),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande del mundo?", listOf("La Gran Barrera de Coral (Australia)", "El arrecife mesoamericano", "Los arrecifes de Maldivas", "El arrecife Andros"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3329, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'effet de serre naturel ?", listOf("Rétention de chaleur par les gaz atmosphériques permettant la vie", "Pollution industrielle", "Destruction de l'ozone", "Réchauffement climatique"), "Nature", ""),
            en = LocalizedContent("What is the natural greenhouse effect?", listOf("Heat retention by atmospheric gases enabling life", "Industrial pollution", "Ozone destruction", "Global warming"), "Nature", ""),
            zh = LocalizedContent("什么是自然温室效应？", listOf("大气气体保留热量从而维持生命", "工业污染", "臭氧破坏", "全球变暖"), "自然", ""),
            es = LocalizedContent("¿Qué es el efecto invernadero natural?", listOf("Retención de calor por los gases atmosféricos que permite la vida", "Contaminación industrial", "Destrucción del ozono", "Calentamiento global"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3330, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la durée de vie d'une bouteille en plastique dans la nature ?", listOf("400 à 1000 ans", "100 ans", "50 ans", "10 ans"), "Nature", ""),
            en = LocalizedContent("What is the lifespan of a plastic bottle in nature?", listOf("400 to 1000 years", "100 years", "50 years", "10 years"), "Nature", ""),
            zh = LocalizedContent("塑料瓶在自然界的寿命是多少？", listOf("400到1000年", "100年", "50年", "10年"), "自然", ""),
            es = LocalizedContent("¿Cuál es la vida útil de una botella de plástico en la naturaleza?", listOf("400 a 1000 años", "100 años", "50 años", "10 años"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3331, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la déforestation tropicale affecte principalement ?", listOf("La biodiversité, le cycle de l'eau et le climat", "Seulement le climat", "Seulement la biodiversité", "Uniquement les sols"), "Nature", ""),
            en = LocalizedContent("What does tropical deforestation mainly affect?", listOf("Biodiversity, the water cycle, and climate", "Only climate", "Only biodiversity", "Only soils"), "Nature", ""),
            zh = LocalizedContent("热带森林砍伐主要影响什么？", listOf("生物多样性、水循环和气候", "仅气候", "仅生物多样性", "仅土壤"), "自然", ""),
            es = LocalizedContent("¿Qué afecta principalmente la deforestación tropical?", listOf("La biodiversidad, el ciclo del agua y el clima", "Solo el clima", "Solo la biodiversidad", "Únicamente los suelos"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3332, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle de la couche d'ozone ?", listOf("Protéger de rayons UV nocifs du Soleil", "Retenir la chaleur", "Produire l'oxygène", "Filtrer les particules"), "Nature", ""),
            en = LocalizedContent("What is the role of the ozone layer?", listOf("Protect from harmful UV rays from the Sun", "Retain heat", "Produce oxygen", "Filter particles"), "Nature", ""),
            zh = LocalizedContent("臭氧层的作用是什么？", listOf("保护免受太阳有害紫外线的伤害", "保留热量", "产生氧气", "过滤颗粒物"), "自然", ""),
            es = LocalizedContent("¿Cuál es el papel de la capa de ozono?", listOf("Proteger de los rayos UV nocivos del Sol", "Retener el calor", "Producir oxígeno", "Filtrar partículas"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3333, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'acidification des océans ?", listOf("Diminution du pH des océans due à l'absorption de CO₂", "Pollution par les déchets industriels", "Hausse de la salinité", "Augmentation de la température"), "Nature", ""),
            en = LocalizedContent("What is ocean acidification?", listOf("Decrease in ocean pH due to CO₂ absorption", "Pollution from industrial waste", "Increase in salinity", "Rise in temperature"), "Nature", ""),
            zh = LocalizedContent("什么是海洋酸化？", listOf("由于吸收二氧化碳导致海洋pH值下降", "工业废物污染", "盐度上升", "温度升高"), "自然", ""),
            es = LocalizedContent("¿Qué es la acidificación de los océanos?", listOf("Disminución del pH de los océanos debido a la absorción de CO₂", "Contaminación por desechos industriales", "Aumento de la salinidad", "Aumento de la temperatura"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3334, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principal gaz à effet de serre émis par l'élevage ?", listOf("Méthane (CH₄)", "CO₂", "N₂O", "HFC"), "Nature", ""),
            en = LocalizedContent("What is the main greenhouse gas emitted by livestock?", listOf("Methane (CH₄)", "CO₂", "N₂O", "HFC"), "Nature", ""),
            zh = LocalizedContent("畜牧业排放的主要温室气体是什么？", listOf("甲烷（CH₄）", "二氧化碳", "一氧化二氮", "氢氟碳化物"), "自然", ""),
            es = LocalizedContent("¿Cuál es el principal gas de efecto invernadero emitido por la ganadería?", listOf("Metano (CH₄)", "CO₂", "N₂O", "HFC"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3335, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une espèce endémique ?", listOf("Espèce qui vit exclusivement dans une région donnée", "Espèce en danger d'extinction", "Espèce envahissante", "Espèce domestiquée"), "Nature", ""),
            en = LocalizedContent("What is an endemic species?", listOf("Species that lives exclusively in a given region", "Endangered species", "Invasive species", "Domesticated species"), "Nature", ""),
            zh = LocalizedContent("什么是特有物种？", listOf("仅生活在特定区域的物种", "濒危物种", "入侵物种", "驯化物种"), "自然", ""),
            es = LocalizedContent("¿Qué es una especie endémica?", listOf("Especie que vive exclusivamente en una región determinada", "Especie en peligro de extinción", "Especie invasora", "Especie domesticada"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3336, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pourcentage de la surface terrestre est recouvert d'eau ?", listOf("71%", "50%", "60%", "80%"), "Nature", ""),
            en = LocalizedContent("What percentage of the Earth's surface is covered by water?", listOf("71%", "50%", "60%", "80%"), "Nature", ""),
            zh = LocalizedContent("地球表面被水覆盖的百分比是多少？", listOf("71%", "50%", "60%", "80%"), "自然", ""),
            es = LocalizedContent("¿Qué porcentaje de la superficie terrestre está cubierto de agua?", listOf("71%", "50%", "60%", "80%"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3337, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le cycle de l'eau ?", listOf("Évaporation, condensation, précipitation en circuit continu", "Purification naturelle", "Transport souterrain", "Filtration terrestre"), "Nature", ""),
            en = LocalizedContent("What is the water cycle?", listOf("Evaporation, condensation, precipitation in a continuous circuit", "Natural purification", "Underground transport", "Ground filtration"), "Nature", ""),
            zh = LocalizedContent("什么是水循环？", listOf("蒸发、凝结、降水连续循环", "自然净化", "地下输送", "地面过滤"), "自然", ""),
            es = LocalizedContent("¿Qué es el ciclo del agua?", listOf("Evaporación, condensación, precipitación en circuito continuo", "Purificación natural", "Transporte subterráneo", "Filtración terrestre"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3338, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle forêt est la plus grande forêt tropicale du monde ?", listOf("L'Amazonie", "Le bassin du Congo", "L'Asie du Sud-Est", "La forêt atlantique"), "Nature", ""),
            en = LocalizedContent("Which forest is the largest tropical rainforest in the world?", listOf("Amazon", "Congo Basin", "Southeast Asia", "Atlantic Forest"), "Nature", ""),
            zh = LocalizedContent("哪个森林是世界上最大的热带雨林？", listOf("亚马逊", "刚果盆地", "东南亚", "大西洋森林"), "自然", ""),
            es = LocalizedContent("¿Qué bosque es la selva tropical más grande del mundo?", listOf("Amazonía", "Cuenca del Congo", "Sudeste Asiático", "Bosque Atlántico"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 3339, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la permaculture ?", listOf("Système agricole durable imitant les écosystèmes naturels", "Agriculture intensive", "Jardinage en intérieur", "Culture hors-sol"), "Nature", ""),
            en = LocalizedContent("What is permaculture?", listOf("Sustainable agricultural system imitating natural ecosystems", "Intensive agriculture", "Indoor gardening", "Soilless cultivation"), "Nature", ""),
            zh = LocalizedContent("什么是永续农业？", listOf("模仿自然生态系统的可持续农业系统", "集约农业", "室内园艺", "无土栽培"), "自然", ""),
            es = LocalizedContent("¿Qué es la permacultura?", listOf("Sistema agrícola sostenible que imita ecosistemas naturales", "Agricultura intensiva", "Jardinería interior", "Cultivo sin suelo"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 4000, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la formule chimique de l'eau de Javel ?", listOf("NaClO", "NaCl", "HCl", "NaOH"), "Science", ""),
            en = LocalizedContent("What is the chemical formula of bleach?", listOf("NaClO", "NaCl", "HCl", "NaOH"), "Science", ""),
            zh = LocalizedContent("漂白剂的化学式是什么？", listOf("NaClO", "NaCl", "HCl", "NaOH"), "科学", ""),
            es = LocalizedContent("¿Cuál es la fórmula química de la lejía?", listOf("NaClO", "NaCl", "HCl", "NaOH"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4001, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la spectrométrie de masse ?", listOf("Technique d'analyse mesurant masse/charge des ions", "Mesure de spectre lumineux", "Analyse par rayons X", "Chromatographie avancée"), "Science", ""),
            en = LocalizedContent("What is mass spectrometry?", listOf("Analytical technique measuring mass/charge of ions", "Measurement of light spectrum", "X-ray analysis", "Advanced chromatography"), "Science", ""),
            zh = LocalizedContent("什么是质谱法？", listOf("测量离子质荷比的分析技术", "光谱测量", "X射线分析", "高级色谱法"), "科学", ""),
            es = LocalizedContent("¿Qué es la espectrometría de masas?", listOf("Técnica analítica que mide masa/carga de iones", "Medición del espectro luminoso", "Análisis por rayos X", "Cromatografía avanzada"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4002, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un catalyseur ?", listOf("Substance accélérant une réaction sans être consommée", "Réactif en excès", "Produit de réaction", "Inhibiteur"), "Science", ""),
            en = LocalizedContent("What is a catalyst?", listOf("Substance that accelerates a reaction without being consumed", "Excess reagent", "Reaction product", "Inhibitor"), "Science", ""),
            zh = LocalizedContent("什么是催化剂？", listOf("加速反应而不被消耗的物质", "过量反应物", "反应产物", "抑制剂"), "科学", ""),
            es = LocalizedContent("¿Qué es un catalizador?", listOf("Sustancia que acelera una reacción sin consumirse", "Reactivo en exceso", "Producto de reacción", "Inhibidor"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4003, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la charge d'un proton ?", listOf("+1,6×10⁻¹⁹ C", "-1,6×10⁻¹⁹ C", "0 C", "+9,1×10⁻³¹ C"), "Science", ""),
            en = LocalizedContent("What is the charge of a proton?", listOf("+1.6×10⁻¹⁹ C", "-1.6×10⁻¹⁹ C", "0 C", "+9.1×10⁻³¹ C"), "Science", ""),
            zh = LocalizedContent("质子的电荷是多少？", listOf("+1.6×10⁻¹⁹ C", "-1.6×10⁻¹⁹ C", "0 C", "+9.1×10⁻³¹ C"), "科学", ""),
            es = LocalizedContent("¿Cuál es la carga de un protón?", listOf("+1,6×10⁻¹⁹ C", "-1,6×10⁻¹⁹ C", "0 C", "+9,1×10⁻³¹ C"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4004, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'énergie sombre ?", listOf("Énergie mystérieuse responsable de l'expansion accélérée de l'univers", "Énergie des trous noirs", "Énergie nucléaire", "Énergie géothermique"), "Science", ""),
            en = LocalizedContent("What is dark energy?", listOf("Mysterious energy responsible for the accelerated expansion of the universe", "Energy of black holes", "Nuclear energy", "Geothermal energy"), "Science", ""),
            zh = LocalizedContent("什么是暗能量？", listOf("导致宇宙加速膨胀的神秘能量", "黑洞能量", "核能", "地热能"), "科学", ""),
            es = LocalizedContent("¿Qué es la energía oscura?", listOf("Energía misteriosa responsable de la expansión acelerada del universo", "Energía de los agujeros negros", "Energía nuclear", "Energía geotérmica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4005, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le principal gaz de l'atmosphère terrestre ?", listOf("Azote (78%)", "Oxygène (21%)", "CO₂", "Argon"), "Science", ""),
            en = LocalizedContent("What is the main gas in Earth's atmosphere?", listOf("Nitrogen (78%)", "Oxygen (21%)", "CO₂", "Argon"), "Science", ""),
            zh = LocalizedContent("地球大气中的主要气体是什么？", listOf("氮气（78%）", "氧气（21%）", "二氧化碳", "氩气"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principal gas de la atmósfera terrestre?", listOf("Nitrógeno (78%)", "Oxígeno (21%)", "CO₂", "Argón"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4006, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la tectonique des plaques ?", listOf("Mouvement des plaques lithosphériques", "Formation des montagnes uniquement", "Dérive des continents uniquement", "Activité sismique"), "Science", ""),
            en = LocalizedContent("What is plate tectonics?", listOf("Movement of lithospheric plates", "Only mountain formation", "Only continental drift", "Seismic activity"), "Science", ""),
            zh = LocalizedContent("什么是板块构造？", listOf("岩石圈板块的运动", "仅山脉形成", "仅大陆漂移", "地震活动"), "科学", ""),
            es = LocalizedContent("¿Qué es la tectónica de placas?", listOf("Movimiento de las placas litosféricas", "Solo formación de montañas", "Solo deriva continental", "Actividad sísmica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4007, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la différence entre météore et météorite ?", listOf("Météore brûle dans l'atmosphère, météorite atteint le sol", "Ce sont des synonymes", "La météorite est plus grande", "La météore est extraterrestre"), "Science", ""),
            en = LocalizedContent("What is the difference between a meteor and a meteorite?", listOf("A meteor burns in the atmosphere, a meteorite reaches the ground", "They are synonyms", "A meteorite is larger", "A meteor is extraterrestrial"), "Science", ""),
            zh = LocalizedContent("流星和陨石有什么区别？", listOf("流星在大气层中燃烧，陨石到达地面", "它们是同义词", "陨石更大", "流星是外星来的"), "科学", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre un meteoro y un meteorito?", listOf("El meteoro arde en la atmósfera, el meteorito llega al suelo", "Son sinónimos", "El meteorito es más grande", "El meteoro es extraterrestre"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4008, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la fusion nucléaire en étoile ?", listOf("Fusion d'atomes légers produisant énergie + atomes plus lourds", "Fission de l'uranium", "Réaction chimique à haute température", "Explosion de plasma"), "Science", ""),
            en = LocalizedContent("What is nuclear fusion in stars?", listOf("Fusion of light atoms producing energy and heavier atoms", "Fission of uranium", "Chemical reaction at high temperature", "Plasma explosion"), "Science", ""),
            zh = LocalizedContent("恒星中的核聚变是什么？", listOf("轻原子聚变产生能量和更重的原子", "铀的裂变", "高温下的化学反应", "等离子体爆炸"), "科学", ""),
            es = LocalizedContent("¿Qué es la fusión nuclear en las estrellas?", listOf("Fusión de átomos ligeros produciendo energía y átomos más pesados", "Fisión del uranio", "Reacción química a alta temperatura", "Explosión de plasma"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4009, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la résonance magnétique nucléaire (IRM) ?", listOf("Technique d'imagerie utilisant champs magnétiques et radio", "Technique par rayons X", "Technique par ultrasons", "Technique par rayons gamma"), "Science", ""),
            en = LocalizedContent("What is magnetic resonance imaging (MRI)?", listOf("Imaging technique using magnetic fields and radio waves", "X-ray technique", "Ultrasound technique", "Gamma ray technique"), "Science", ""),
            zh = LocalizedContent("什么是磁共振成像（MRI）？", listOf("利用磁场和无线电波的成像技术", "X射线技术", "超声波技术", "伽马射线技术"), "科学", ""),
            es = LocalizedContent("¿Qué es la resonancia magnética nuclear (RMN)?", listOf("Técnica de imagen que utiliza campos magnéticos y ondas de radio", "Técnica de rayos X", "Técnica de ultrasonidos", "Técnica de rayos gamma"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la valence de l'oxygène ?", listOf("2", "1", "3", "4"), "Science", ""),
            en = LocalizedContent("What is the valence of oxygen?", listOf("2", "1", "3", "4"), "Science", ""),
            zh = LocalizedContent("氧的化合价是多少？", listOf("2", "1", "3", "4"), "科学", ""),
            es = LocalizedContent("¿Cuál es la valencia del oxígeno?", listOf("2", "1", "3", "4"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4011, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un acide de Lewis ?", listOf("Accepteur de doublet électronique", "Donneur de proton H⁺", "Substance au pH < 7", "Base forte"), "Science", ""),
            en = LocalizedContent("What is a Lewis acid?", listOf("Acceptor of electron pair", "Donor of H⁺ proton", "Substance with pH < 7", "Strong base"), "Science", ""),
            zh = LocalizedContent("什么是路易斯酸？", listOf("电子对接受体", "H⁺质子给予体", "pH < 7 的物质", "强碱"), "科学", ""),
            es = LocalizedContent("¿Qué es un ácido de Lewis?", listOf("Aceptor de par electrónico", "Donador de protón H⁺", "Sustancia con pH < 7", "Base fuerte"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la constante d'Avogadro ?", listOf("6,022×10²³ mol⁻¹", "6,022×10²³ kg", "1,38×10⁻²³ J/K", "8,314 J/mol·K"), "Science", ""),
            en = LocalizedContent("What is Avogadro's constant?", listOf("6.022×10²³ mol⁻¹", "6.022×10²³ kg", "1.38×10⁻²³ J/K", "8.314 J/mol·K"), "Science", ""),
            zh = LocalizedContent("阿伏伽德罗常数是多少？", listOf("6.022×10²³ mol⁻¹", "6.022×10²³ kg", "1.38×10⁻²³ J/K", "8.314 J/mol·K"), "科学", ""),
            es = LocalizedContent("¿Cuál es la constante de Avogadro?", listOf("6,022×10²³ mol⁻¹", "6,022×10²³ kg", "1,38×10⁻²³ J/K", "8,314 J/mol·K"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4013, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'élément chimique le plus lourd naturellement présent ?", listOf("Uranium (92)", "Plutonium (94)", "Thorium (90)", "Radon (86)"), "Science", ""),
            en = LocalizedContent("What is the heaviest naturally occurring chemical element?", listOf("Uranium (92)", "Plutonium (94)", "Thorium (90)", "Radon (86)"), "Science", ""),
            zh = LocalizedContent("自然存在的最重化学元素是什么？", listOf("铀（92）", "钚（94）", "钍（90）", "氡（86）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el elemento químico más pesado que se encuentra de forma natural?", listOf("Uranio (92)", "Plutonio (94)", "Torio (90)", "Radón (86)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4014, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la loi de Mendel sur l'hérédité ?", listOf("Les caractères héréditaires se transmettent par des facteurs séparés", "Les enfants ressemblent à leurs parents", "L'environnement modifie les gènes", "Les caractères acquis se transmettent"), "Science", ""),
            en = LocalizedContent("What is Mendel's law of heredity?", listOf("Hereditary traits are transmitted by separate factors", "Children resemble their parents", "Environment modifies genes", "Acquired traits are transmitted"), "Science", ""),
            zh = LocalizedContent("什么是孟德尔遗传定律？", listOf("遗传性状由分离因子传递", "孩子像父母", "环境改变基因", "获得性性状可遗传"), "科学", ""),
            es = LocalizedContent("¿Qué es la ley de Mendel sobre la herencia?", listOf("Los caracteres hereditarios se transmiten por factores separados", "Los hijos se parecen a sus padres", "El ambiente modifica los genes", "Los caracteres adquiridos se transmiten"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4015, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la structure du benzène ?", listOf("Anneau hexagonal de 6 carbones avec électrons délocalisés", "Chaîne linéaire de 6 carbones", "Molécule tridimensionnelle cubique", "Anneau de 5 carbones"), "Science", ""),
            en = LocalizedContent("What is the structure of benzene?", listOf("Hexagonal ring of 6 carbons with delocalized electrons", "Linear chain of 6 carbons", "Cubic three-dimensional molecule", "Ring of 5 carbons"), "Science", ""),
            zh = LocalizedContent("苯的结构是什么？", listOf("6个碳的六元环，电子离域", "6个碳的直链", "立方体三维分子", "5个碳的环"), "科学", ""),
            es = LocalizedContent("¿Cuál es la estructura del benceno?", listOf("Anillo hexagonal de 6 carbonos con electrones deslocalizados", "Cadena lineal de 6 carbonos", "Molécula tridimensional cúbica", "Anillo de 5 carbonos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4016, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une cellule souche ?", listOf("Cellule non différenciée pouvant devenir différents types cellulaires", "Cellule cancéreuse", "Cellule germinale uniquement", "Globule blanc"), "Science", ""),
            en = LocalizedContent("What is a stem cell?", listOf("Undifferentiated cell that can become different cell types", "Cancer cell", "Germ cell only", "White blood cell"), "Science", ""),
            zh = LocalizedContent("什么是干细胞？", listOf("未分化细胞，可以变成不同的细胞类型", "癌细胞", "仅生殖细胞", "白细胞"), "科学", ""),
            es = LocalizedContent("¿Qué es una célula madre?", listOf("Célula no diferenciada que puede convertirse en diferentes tipos celulares", "Célula cancerosa", "Célula germinal únicamente", "Glóbulo blanco"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4017, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel phénomène cause les aurores boréales ?", listOf("Interaction du vent solaire avec le champ magnétique terrestre", "Réfraction de la lumière solaire", "Explosion de méthane atmosphérique", "Reflet de la neige sur les nuages"), "Science", ""),
            en = LocalizedContent("What phenomenon causes the Northern Lights?", listOf("Interaction of solar wind with Earth's magnetic field", "Refraction of sunlight", "Explosion of atmospheric methane", "Reflection of snow on clouds"), "Science", ""),
            zh = LocalizedContent("什么现象导致北极光？", listOf("太阳风与地球磁场的相互作用", "太阳光的折射", "大气甲烷爆炸", "雪在云上的反射"), "科学", ""),
            es = LocalizedContent("¿Qué fenómeno causa las auroras boreales?", listOf("Interacción del viento solar con el campo magnético terrestre", "Refracción de la luz solar", "Explosión de metano atmosférico", "Reflejo de la nieve en las nubes"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4018, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la fermentation anaérobie ?", listOf("Dégradation du glucose sans oxygène", "Respiration cellulaire", "Photosynthèse", "Digestion aérobie"), "Science", ""),
            en = LocalizedContent("What is anaerobic fermentation?", listOf("Degradation of glucose without oxygen", "Cellular respiration", "Photosynthesis", "Aerobic digestion"), "Science", ""),
            zh = LocalizedContent("什么是无氧发酵？", listOf("无氧条件下葡萄糖的分解", "细胞呼吸", "光合作用", "有氧消化"), "科学", ""),
            es = LocalizedContent("¿Qué es la fermentación anaeróbica?", listOf("Degradación de glucosa sin oxígeno", "Respiración celular", "Fotosíntesis", "Digestión aeróbica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4019, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la vitesse de rotation de la Terre sur elle-même ?", listOf("~1670 km/h à l'équateur", "~1000 km/h", "~3000 km/h", "~500 km/h"), "Science", ""),
            en = LocalizedContent("What is the rotation speed of the Earth on its axis?", listOf("~1670 km/h at the equator", "~1000 km/h", "~3000 km/h", "~500 km/h"), "Science", ""),
            zh = LocalizedContent("地球自转的速度是多少？", listOf("赤道约1670公里/小时", "约1000公里/小时", "约3000公里/小时", "约500公里/小时"), "科学", ""),
            es = LocalizedContent("¿Cuál es la velocidad de rotación de la Tierra sobre su eje?", listOf("~1670 km/h en el ecuador", "~1000 km/h", "~3000 km/h", "~500 km/h"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4020, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un prisme optique fait à la lumière blanche ?", listOf("Il la décompose en spectre (arc-en-ciel)", "Il la concentre", "Il la polarise", "Il la réfléchit"), "Science", ""),
            en = LocalizedContent("What does an optical prism do to white light?", listOf("It decomposes it into a spectrum (rainbow)", "It concentrates it", "It polarizes it", "It reflects it"), "Science", ""),
            zh = LocalizedContent("光学棱镜对白光有什么作用？", listOf("将其分解成光谱（彩虹）", "将其集中", "将其偏振", "将其反射"), "科学", ""),
            es = LocalizedContent("¿Qué hace un prisma óptico a la luz blanca?", listOf("La descompone en un espectro (arcoíris)", "La concentra", "La polariza", "La refleja"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4021, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de superposition en géologie ?", listOf("Les couches géologiques les plus récentes se trouvent au-dessus", "Les roches les plus dures se trouvent en bas", "Les fossiles sont uniquement en surface", "La Terre est en expansion"), "Science", ""),
            en = LocalizedContent("What is the principle of superposition in geology?", listOf("The youngest geological layers are found on top", "The hardest rocks are found at the bottom", "Fossils are only on the surface", "The Earth is expanding"), "Science", ""),
            zh = LocalizedContent("地质学中的叠加原理是什么？", listOf("最年轻的地质层位于顶部", "最硬的岩石位于底部", "化石只存在于表面", "地球在膨胀"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principio de superposición en geología?", listOf("Las capas geológicas más recientes se encuentran arriba", "Las rocas más duras se encuentran abajo", "Los fósiles están solo en la superficie", "La Tierra está en expansión"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un gène dominant ?", listOf("Gène dont le phénotype s'exprime même avec un seul allèle", "Gène toujours exprimé", "Gène situé sur le chromosome X", "Gène muté"), "Science", ""),
            en = LocalizedContent("What is a dominant gene?", listOf("Gene whose phenotype is expressed even with a single allele", "Gene always expressed", "Gene located on the X chromosome", "Mutated gene"), "Science", ""),
            zh = LocalizedContent("什么是显性基因？", listOf("即使只有一个等位基因也能表达其表型的基因", "总是表达的基因", "位于X染色体上的基因", "突变基因"), "科学", ""),
            es = LocalizedContent("¿Qué es un gen dominante?", listOf("Gen cuyo fenotipo se expresa incluso con un solo alelo", "Gen siempre expresado", "Gen situado en el cromosoma X", "Gen mutado"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4023, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la pression atmosphérique standard ?", listOf("101 325 Pa (1 atm)", "100 000 Pa", "110 000 Pa", "1000 Pa"), "Science", ""),
            en = LocalizedContent("What is standard atmospheric pressure?", listOf("101,325 Pa (1 atm)", "100,000 Pa", "110,000 Pa", "1,000 Pa"), "Science", ""),
            zh = LocalizedContent("标准大气压是多少？", listOf("101325帕斯卡（1个大气压）", "100000帕斯卡", "110000帕斯卡", "1000帕斯卡"), "科学", ""),
            es = LocalizedContent("¿Cuál es la presión atmosférica estándar?", listOf("101 325 Pa (1 atm)", "100 000 Pa", "110 000 Pa", "1 000 Pa"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4024, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a développé la théorie de l'évolution ?", listOf("Charles Darwin", "Gregor Mendel", "Louis Pasteur", "Jean-Baptiste Lamarck"), "Science", ""),
            en = LocalizedContent("Which scientist developed the theory of evolution?", listOf("Charles Darwin", "Gregor Mendel", "Louis Pasteur", "Jean-Baptiste Lamarck"), "Science", ""),
            zh = LocalizedContent("哪位科学家提出了进化论？", listOf("查尔斯·达尔文", "格雷戈尔·孟德尔", "路易·巴斯德", "让-巴蒂斯特·拉马克"), "科学", ""),
            es = LocalizedContent("¿Qué científico desarrolló la teoría de la evolución?", listOf("Charles Darwin", "Gregor Mendel", "Louis Pasteur", "Jean-Baptiste Lamarck"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 4025, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel edifice construit en 1961 a divise une capitale europeenne pendant la Guerre froide ?", listOf("Le Mur de Berlin", "Le Rideau de fer", "La ligne Maginot", "Le Grand Mur"), "Histoire", ""),
            en = LocalizedContent("Which structure built in 1961 divided a European capital during the Cold War?", listOf("The Berlin Wall", "The Iron Curtain", "The Maginot Line", "The Great Wall"), "History", ""),
            zh = LocalizedContent("1961年建造的哪个建筑在冷战期间分割了一个欧洲首都？", listOf("柏林墙", "铁幕", "马奇诺防线", "长城"), "历史", ""),
            es = LocalizedContent("¿Qué estructura construida en 1961 dividió una capital europea durante la Guerra Fría?", listOf("El Muro de Berlín", "El Telón de Acero", "La Línea Maginot", "La Gran Muralla"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4026, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel événement de 1986 a libéré une grande quantité de radiations en URSS ?", listOf("La catastrophe de Tchernobyl", "L'accident de Three Mile Island", "La catastrophe de Fukushima", "L'explosion de Bhopal"), "Histoire", ""),
            en = LocalizedContent("Which 1986 event released a large amount of radiation in the USSR?", listOf("Chernobyl disaster", "Three Mile Island accident", "Fukushima disaster", "Bhopal explosion"), "History", ""),
            zh = LocalizedContent("1986年哪个事件在苏联释放了大量辐射？", listOf("切尔诺贝利灾难", "三哩岛事故", "福岛灾难", "博帕尔爆炸"), "历史", ""),
            es = LocalizedContent("¿Qué evento de 1986 liberó una gran cantidad de radiación en la URSS?", listOf("Desastre de Chernóbil", "Accidente de Three Mile Island", "Desastre de Fukushima", "Explosión de Bhopal"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4027, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a assassiné Martin Luther King Jr. en 1968 ?", listOf("James Earl Ray", "Lee Harvey Oswald", "Sirhan Sirhan", "John Hinckley"), "Histoire", ""),
            en = LocalizedContent("Who assassinated Martin Luther King Jr. in 1968?", listOf("James Earl Ray", "Lee Harvey Oswald", "Sirhan Sirhan", "John Hinckley"), "History", ""),
            zh = LocalizedContent("1968年谁刺杀了马丁·路德·金？", listOf("詹姆斯·厄尔·雷", "李·哈维·奥斯瓦尔德", "西尔汉·西尔汉", "约翰·欣克利"), "历史", ""),
            es = LocalizedContent("¿Quién asesinó a Martin Luther King Jr. en 1968?", listOf("James Earl Ray", "Lee Harvey Oswald", "Sirhan Sirhan", "John Hinckley"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4028, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel événement a débuté le 11 septembre 2001 ?", listOf("Attentats terroristes aux États-Unis", "Guerre en Irak", "Crise financière", "Début de la guerre en Afghanistan"), "Histoire", ""),
            en = LocalizedContent("Which event began on September 11, 2001?", listOf("Terrorist attacks in the United States", "Iraq War", "Financial crisis", "Start of the war in Afghanistan"), "History", ""),
            zh = LocalizedContent("2001年9月11日发生了什么事件？", listOf("美国恐怖袭击", "伊拉克战争", "金融危机", "阿富汗战争开始"), "历史", ""),
            es = LocalizedContent("¿Qué evento comenzó el 11 de septiembre de 2001?", listOf("Ataques terroristas en Estados Unidos", "Guerra de Irak", "Crisis financiera", "Inicio de la guerra en Afganistán"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4029, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a été le premier à accorder le droit de vote aux femmes ?", listOf("Nouvelle-Zélande (1893)", "Australie (1902)", "Finlande (1906)", "Norvège (1913)"), "Histoire", ""),
            en = LocalizedContent("Which country was the first to grant women the right to vote?", listOf("New Zealand (1893)", "Australia (1902)", "Finland (1906)", "Norway (1913)"), "History", ""),
            zh = LocalizedContent("哪个国家第一个赋予女性投票权？", listOf("新西兰（1893年）", "澳大利亚（1902年）", "芬兰（1906年）", "挪威（1913年）"), "历史", ""),
            es = LocalizedContent("¿Qué país fue el primero en otorgar el derecho al voto a las mujeres?", listOf("Nueva Zelanda (1893)", "Australia (1902)", "Finlandia (1906)", "Noruega (1913)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4030, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel leader soviétique a dirigé l'URSS pendant la Seconde Guerre mondiale ?", listOf("Joseph Staline", "Nikita Khrouchtchev", "Lénine", "Brejnev"), "Histoire", ""),
            en = LocalizedContent("Which Soviet leader led the USSR during World War II?", listOf("Joseph Stalin", "Nikita Khrushchev", "Lenin", "Brezhnev"), "History", ""),
            zh = LocalizedContent("哪位苏联领导人在二战期间领导苏联？", listOf("约瑟夫·斯大林", "尼基塔·赫鲁晓夫", "列宁", "勃列日涅夫"), "历史", ""),
            es = LocalizedContent("¿Qué líder soviético dirigió la URSS durante la Segunda Guerra Mundial?", listOf("Joseph Stalin", "Nikita Jrushchov", "Lenin", "Brèzhnev"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est l'année de la chute du Mur de Berlin ?", listOf("1989", "1991", "1987", "1985"), "Histoire", ""),
            en = LocalizedContent("What year did the Berlin Wall fall?", listOf("1989", "1991", "1987", "1985"), "History", ""),
            zh = LocalizedContent("柏林墙在哪一年倒塌？", listOf("1989年", "1991年", "1987年", "1985年"), "历史", ""),
            es = LocalizedContent("¿En qué año cayó el Muro de Berlín?", listOf("1989", "1991", "1987", "1985"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4032, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel accord de paix a mis fin à la guerre du Vietnam pour les États-Unis ?", listOf("Accords de Paris (1973)", "Accords de Genève (1954)", "Traité de Saigon", "Accords de Hanoï"), "Histoire", ""),
            en = LocalizedContent("Which peace agreement ended the Vietnam War for the United States?", listOf("Paris Peace Accords (1973)", "Geneva Accords (1954)", "Treaty of Saigon", "Hanoi Accords"), "History", ""),
            zh = LocalizedContent("哪项和平协议结束了美国参与的越南战争？", listOf("巴黎和平协定（1973年）", "日内瓦协定（1954年）", "西贡条约", "河内协定"), "历史", ""),
            es = LocalizedContent("¿Qué acuerdo de paz puso fin a la guerra de Vietnam para Estados Unidos?", listOf("Acuerdos de Paz de París (1973)", "Acuerdos de Ginebra (1954)", "Tratado de Saigón", "Acuerdos de Hanói"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4033, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du plan américain pour reconstruire l'Europe après 1945 ?", listOf("Plan Marshall", "Plan Truman", "Plan Eisenhower", "Plan Kennan"), "Histoire", ""),
            en = LocalizedContent("What is the name of the American plan to rebuild Europe after 1945?", listOf("Marshall Plan", "Truman Plan", "Eisenhower Plan", "Kennan Plan"), "History", ""),
            zh = LocalizedContent("1945年后美国重建欧洲的计划叫什么？", listOf("马歇尔计划", "杜鲁门计划", "艾森豪威尔计划", "凯南计划"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre del plan estadounidense para reconstruir Europa después de 1945?", listOf("Plan Marshall", "Plan Truman", "Plan Eisenhower", "Plan Kennan"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4034, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le président des États-Unis lors de la crise des missiles de Cuba ?", listOf("John F. Kennedy", "Dwight Eisenhower", "Lyndon Johnson", "Richard Nixon"), "Histoire", ""),
            en = LocalizedContent("Who was the President of the United States during the Cuban Missile Crisis?", listOf("John F. Kennedy", "Dwight Eisenhower", "Lyndon Johnson", "Richard Nixon"), "History", ""),
            zh = LocalizedContent("古巴导弹危机期间美国总统是谁？", listOf("约翰·F·肯尼迪", "德怀特·艾森豪威尔", "林登·约翰逊", "理查德·尼克松"), "历史", ""),
            es = LocalizedContent("¿Quién era el presidente de Estados Unidos durante la crisis de los misiles en Cuba?", listOf("John F. Kennedy", "Dwight Eisenhower", "Lyndon Johnson", "Richard Nixon"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4035, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se déroula le génocide de 1994 ?", listOf("Rwanda", "Burundi", "Congo", "Soudan"), "Histoire", ""),
            en = LocalizedContent("In which country did the 1994 genocide take place?", listOf("Rwanda", "Burundi", "Congo", "Sudan"), "History", ""),
            zh = LocalizedContent("1994年的种族灭绝发生在哪个国家？", listOf("卢旺达", "布隆迪", "刚果", "苏丹"), "历史", ""),
            es = LocalizedContent("¿En qué país ocurrió el genocidio de 1994?", listOf("Ruanda", "Burundi", "Congo", "Sudán"), "Historia", "")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 4036, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel accord sur le climat fut signé en 2015 ?", listOf("Accord de Paris", "Protocole de Kyoto", "Accord de Copenhague", "Traité de Montréal"), "Histoire", ""),
            en = LocalizedContent("Which climate agreement was signed in 2015?", listOf("Paris Agreement", "Kyoto Protocol", "Copenhagen Accord", "Montreal Protocol"), "History", ""),
            zh = LocalizedContent("2015年签署了哪项气候协议？", listOf("《巴黎协定》", "《京都议定书》", "《哥本哈根协议》", "《蒙特利尔议定书》"), "历史", ""),
            es = LocalizedContent("¿Qué acuerdo climático se firmó en 2015?", listOf("Acuerdo de París", "Protocolo de Kioto", "Acuerdo de Copenhague", "Protocolo de Montreal"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4038, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le nom de l'organisation de résistance française pendant la Seconde Guerre mondiale ?", listOf("La Résistance / Forces françaises libres", "La Milice", "Les FFI", "Le GPRF"), "Histoire", ""),
            en = LocalizedContent("What was the name of the French resistance organization during World War II?", listOf("La Résistance / Free French Forces", "La Milice", "The FFI", "The GPRF"), "History", ""),
            zh = LocalizedContent("二战期间法国抵抗组织的名称是什么？", listOf("抵抗运动/自由法国力量", "民兵", "法国内地军", "法兰西共和国临时政府"), "历史", ""),
            es = LocalizedContent("¿Cuál era el nombre de la organización de resistencia francesa durante la Segunda Guerra Mundial?", listOf("La Resistencia / Fuerzas Francesas Libres", "La Milicia", "Los FFI", "El GPRF"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4039, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le premier être humain à avoir marché sur la Lune ?", listOf("Neil Armstrong (1969)", "Buzz Aldrin (1969)", "Youri Gagarine", "Alan Shepard"), "Histoire", ""),
            en = LocalizedContent("Who was the first human to walk on the Moon?", listOf("Neil Armstrong (1969)", "Buzz Aldrin (1969)", "Yuri Gagarin", "Alan Shepard"), "History", ""),
            zh = LocalizedContent("第一个在月球上行走的人是谁？", listOf("尼尔·阿姆斯特朗（1969年）", "巴兹·奥尔德林（1969年）", "尤里·加加林", "艾伦·谢泼德"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer ser humano en caminar sobre la Luna?", listOf("Neil Armstrong (1969)", "Buzz Aldrin (1969)", "Yuri Gagarin", "Alan Shepard"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4040, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle guerre a opposé Irak et Iran entre 1980 et 1988 ?", listOf("Guerre Iran-Irak", "Guerre du Golfe", "Guerre des Six Jours", "Guerre civile irakienne"), "Histoire", ""),
            en = LocalizedContent("Which war opposed Iraq and Iran between 1980 and 1988?", listOf("Iran-Iraq War", "Gulf War", "Six-Day War", "Iraqi Civil War"), "History", ""),
            zh = LocalizedContent("1980年至1988年间伊拉克和伊朗之间的战争是什么？", listOf("两伊战争", "海湾战争", "六日战争", "伊拉克内战"), "历史", ""),
            es = LocalizedContent("¿Qué guerra enfrentó a Irak e Irán entre 1980 y 1988?", listOf("Guerra Irán-Irak", "Guerra del Golfo", "Guerra de los Seis Días", "Guerra civil iraquí"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année a eu lieu la réunification allemande ?", listOf("1990", "1989", "1991", "1988"), "Histoire", ""),
            en = LocalizedContent("In which year did German reunification take place?", listOf("1990", "1989", "1991", "1988"), "History", ""),
            zh = LocalizedContent("德国统一发生在哪一年？", listOf("1990年", "1989年", "1991年", "1988年"), "历史", ""),
            es = LocalizedContent("¿En qué año tuvo lugar la reunificación alemana?", listOf("1990", "1989", "1991", "1988"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4042, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé le mouvement de non-violence en Inde ?", listOf("Mahatma Gandhi", "Jawaharlal Nehru", "Subhas Chandra Bose", "Bal Gangadhar Tilak"), "Histoire", ""),
            en = LocalizedContent("Who founded the non-violence movement in India?", listOf("Mahatma Gandhi", "Jawaharlal Nehru", "Subhas Chandra Bose", "Bal Gangadhar Tilak"), "History", ""),
            zh = LocalizedContent("谁在印度创立了非暴力运动？", listOf("圣雄甘地", "贾瓦哈拉尔·尼赫鲁", "苏巴斯·钱德拉·鲍斯", "巴尔·甘加达尔·提拉克"), "历史", ""),
            es = LocalizedContent("¿Quién fundó el movimiento de no violencia en la India?", listOf("Mahatma Gandhi", "Jawaharlal Nehru", "Subhas Chandra Bose", "Bal Gangadhar Tilak"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4043, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel événement a déclenché la Seconde Guerre mondiale ?", listOf("L'invasion de la Pologne par Hitler le 1er septembre 1939", "L'annexion de l'Autriche", "L'attaque de Pearl Harbor", "La crise de Munich"), "Histoire", ""),
            en = LocalizedContent("Which event triggered World War II?", listOf("Hitler's invasion of Poland on September 1, 1939", "Annexation of Austria", "Attack on Pearl Harbor", "Munich Crisis"), "History", ""),
            zh = LocalizedContent("哪个事件引发了第二次世界大战？", listOf("1939年9月1日希特勒入侵波兰", "吞并奥地利", "珍珠港袭击", "慕尼黑危机"), "历史", ""),
            es = LocalizedContent("¿Qué evento desencadenó la Segunda Guerra Mundial?", listOf("La invasión de Polonia por Hitler el 1 de septiembre de 1939", "La anexión de Austria", "El ataque a Pearl Harbor", "La crisis de Múnich"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4044, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de personnes ont péri lors de l'Holocauste ?", listOf("Environ 6 millions de Juifs (11 millions au total)", "1 million", "3 millions", "20 millions"), "Histoire", ""),
            en = LocalizedContent("How many people perished during the Holocaust?", listOf("About 6 million Jews (11 million total)", "1 million", "3 million", "20 million"), "History", ""),
            zh = LocalizedContent("大屠杀中有多少人丧生？", listOf("约600万犹太人（总计1100万）", "100万", "300万", "2000万"), "历史", ""),
            es = LocalizedContent("¿Cuántas personas perecieron durante el Holocausto?", listOf("Alrededor de 6 millones de judíos (11 millones en total)", "1 millón", "3 millones", "20 millones"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4045, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le Premier ministre britannique pendant la Seconde Guerre mondiale ?", listOf("Winston Churchill", "Neville Chamberlain", "Clement Attlee", "Anthony Eden"), "Histoire", ""),
            en = LocalizedContent("Who was the British Prime Minister during World War II?", listOf("Winston Churchill", "Neville Chamberlain", "Clement Attlee", "Anthony Eden"), "History", ""),
            zh = LocalizedContent("二战期间的英国首相是谁？", listOf("温斯顿·丘吉尔", "内维尔·张伯伦", "克莱门特·艾德礼", "安东尼·艾登"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer ministro británico durante la Segunda Guerra Mundial?", listOf("Winston Churchill", "Neville Chamberlain", "Clement Attlee", "Anthony Eden"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4046, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la bombe atomique fut-elle larguée sur Hiroshima ?", listOf("1945", "1944", "1946", "1943"), "Histoire", ""),
            en = LocalizedContent("In which year was the atomic bomb dropped on Hiroshima?", listOf("1945", "1944", "1946", "1943"), "History", ""),
            zh = LocalizedContent("原子弹在广岛投下是哪一年？", listOf("1945年", "1944年", "1946年", "1943年"), "历史", ""),
            es = LocalizedContent("¿En qué año se lanzó la bomba atómica sobre Hiroshima?", listOf("1945", "1944", "1946", "1943"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4047, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire colonial possédait l'Algérie avant 1962 ?", listOf("La France", "L'Italie", "L'Espagne", "Le Royaume-Uni"), "Histoire", ""),
            en = LocalizedContent("Which colonial empire controlled Algeria before 1962?", listOf("France", "Italy", "Spain", "United Kingdom"), "History", ""),
            zh = LocalizedContent("1962年之前，阿尔及利亚属于哪个殖民帝国？", listOf("法国", "意大利", "西班牙", "英国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio colonial poseía Argelia antes de 1962?", listOf("Francia", "Italia", "España", "Reino Unido"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4048, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la doctrine de coexistence pacifique prônée par Khrouchtchev ?", listOf("Déstalinisation et coexistence pacifique", "Doctrine Brejnev", "Doctrine Truman", "Détente Nixon"), "Histoire", ""),
            en = LocalizedContent("What is the name of the doctrine of peaceful coexistence advocated by Khrushchev?", listOf("De-Stalinization and peaceful coexistence", "Brezhnev Doctrine", "Truman Doctrine", "Nixon Détente"), "History", ""),
            zh = LocalizedContent("赫鲁晓夫倡导的和平共处原则叫什么？", listOf("去斯大林化与和平共处", "勃列日涅夫主义", "杜鲁门主义", "尼克松缓和"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre de la doctrina de coexistencia pacífica defendida por Jrushchov?", listOf("Desestalinización y coexistencia pacífica", "Doctrina Brézhnev", "Doctrina Truman", "Distensión Nixon"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4049, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui était Premier ministre d'Israël lors de la guerre des Six Jours en 1967 ?", listOf("Levi Eshkol", "David Ben Gourion", "Golda Meir", "Moshé Dayan"), "Histoire", ""),
            en = LocalizedContent("Who was the Prime Minister of Israel during the Six-Day War in 1967?", listOf("Levi Eshkol", "David Ben-Gurion", "Golda Meir", "Moshe Dayan"), "History", ""),
            zh = LocalizedContent("1967年六日战争期间，以色列总理是谁？", listOf("列维·埃什科尔", "大卫·本-古里安", "果尔达·梅厄", "摩西·达扬"), "历史", ""),
            es = LocalizedContent("¿Quién era el primer ministro de Israel durante la Guerra de los Seis Días en 1967?", listOf("Levi Eshkol", "David Ben-Gurión", "Golda Meir", "Moshé Dayán"), "Historia", "")
        ),
        BilingualQuestion(
            id = 4050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la plus haute montagne d'Europe (en excluant le Caucase) ?", listOf("Le Mont Blanc (4 808 m)", "Le Monte Rosa", "Le Cervin", "L'Eiger"), "Géographie", ""),
            en = LocalizedContent("What is the highest mountain in Europe (excluding the Caucasus)?", listOf("Mont Blanc (4,808 m)", "Monte Rosa", "Matterhorn", "Eiger"), "Geography", ""),
            zh = LocalizedContent("欧洲最高的山是什么（不包括高加索山脉）？", listOf("勃朗峰（4808米）", "罗莎峰", "马特洪峰", "艾格峰"), "地理", ""),
            es = LocalizedContent("¿Cuál es la montaña más alta de Europa (excluyendo el Cáucaso)?", listOf("Mont Blanc (4.808 m)", "Monte Rosa", "Matterhorn", "Eiger"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 4051, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle ville est divisée entre deux continents ?", listOf("Istanbul (Europe et Asie)", "Suez (Afrique et Asie)", "Panama City", "Moscou"), "Géographie", ""),
            en = LocalizedContent("Which city is divided between two continents?", listOf("Istanbul (Europe and Asia)", "Suez (Africa and Asia)", "Panama City", "Moscow"), "Geography", ""),
            zh = LocalizedContent("哪个城市横跨两个大洲？", listOf("伊斯坦布尔（欧洲和亚洲）", "苏伊士（非洲和亚洲）", "巴拿马城", "莫斯科"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad está dividida entre dos continentes?", listOf("Estambul (Europa y Asia)", "Suez (África y Asia)", "Ciudad de Panamá", "Moscú"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 4052, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a la plus grande économie d'Afrique ?", listOf("Nigéria", "Afrique du Sud", "Égypte", "Kenya"), "Géographie", ""),
            en = LocalizedContent("Which country has the largest economy in Africa?", listOf("Nigeria", "South Africa", "Egypt", "Kenya"), "Geography", ""),
            zh = LocalizedContent("非洲哪个国家的经济体量最大？", listOf("尼日利亚", "南非", "埃及", "肯尼亚"), "地理", ""),
            es = LocalizedContent("¿Qué país tiene la economía más grande de África?", listOf("Nigeria", "Sudáfrica", "Egipto", "Kenia"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 4053, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du détroit entre l'Asie et l'Amérique du Nord ?", listOf("Détroit de Béring", "Détroit de Davis", "Détroit d'Hudson", "Détroit de Magallan"), "Géographie", ""),
            en = LocalizedContent("What is the name of the strait between Asia and North America?", listOf("Bering Strait", "Davis Strait", "Hudson Strait", "Strait of Magellan"), "Geography", ""),
            zh = LocalizedContent("亚洲和北美洲之间的海峡叫什么？", listOf("白令海峡", "戴维斯海峡", "哈德逊海峡", "麦哲伦海峡"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del estrecho entre Asia y América del Norte?", listOf("Estrecho de Bering", "Estrecho de Davis", "Estrecho de Hudson", "Estrecho de Magallanes"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 4055, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est formé de deux îles principales : l'île du Nord et l'île du Sud ?", listOf("Nouvelle-Zélande", "Taïwan", "Irlande", "Fidji"), "Géographie", ""),
            en = LocalizedContent("Which country is made up of two main islands: the North Island and the South Island?", listOf("New Zealand", "Taiwan", "Ireland", "Fiji"), "Geography", ""),
            zh = LocalizedContent("哪个国家由两个主要岛屿组成：北岛和南岛？", listOf("新西兰", "台湾", "爱尔兰", "斐济"), "地理", ""),
            es = LocalizedContent("¿Qué país está formado por dos islas principales: la Isla del Norte y la Isla del Sur?", listOf("Nueva Zelanda", "Taiwán", "Irlanda", "Fiyi"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 4056, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle chaîne de montagnes sépare la France de l'Espagne ?", listOf("Les Pyrénées", "Les Alpes", "Le Massif Central", "Les Vosges"), "Géographie", ""),
            en = LocalizedContent("Which mountain range separates France from Spain?", listOf("Pyrenees", "Alps", "Massif Central", "Vosges"), "Geography", ""),
            zh = LocalizedContent("哪座山脉分隔了法国和西班牙？", listOf("比利牛斯山脉", "阿尔卑斯山脉", "中央高原", "孚日山脉"), "地理", ""),
            es = LocalizedContent("¿Qué cadena montañosa separa Francia de España?", listOf("Pirineos", "Alpes", "Macizo Central", "Vosgos"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 4057, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du plus grand lagon du monde ?", listOf("Lagon de Nouvelle-Calédonie (UNESCO)", "Lagon de Maldives", "Lagon d'Atoll", "Lagune de Venise"), "Géographie", ""),
            en = LocalizedContent("What is the name of the largest lagoon in the world?", listOf("New Caledonia Lagoon (UNESCO)", "Maldives Lagoon", "Atoll Lagoon", "Venice Lagoon"), "Geography", ""),
            zh = LocalizedContent("世界上最大的泻湖叫什么？", listOf("新喀里多尼亚泻湖（联合国教科文组织）", "马尔代夫泻湖", "环礁泻湖", "威尼斯泻湖"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre de la laguna más grande del mundo?", listOf("Laguna de Nueva Caledonia (UNESCO)", "Laguna de Maldivas", "Laguna de Atolón", "Laguna de Venecia"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 4058, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel continent se trouve Madagascar ?", listOf("Afrique (île au large)", "Océanie", "Asie", "Amérique du Sud"), "Géographie", ""),
            en = LocalizedContent("On which continent is Madagascar located?", listOf("Africa (offshore island)", "Oceania", "Asia", "South America"), "Geography", ""),
            zh = LocalizedContent("马达加斯加位于哪个洲？", listOf("非洲（离岸岛屿）", "大洋洲", "亚洲", "南美洲"), "地理", ""),
            es = LocalizedContent("¿En qué continente se encuentra Madagascar?", listOf("África (isla frente a la costa)", "Oceanía", "Asia", "América del Sur"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4060, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus long fleuve d'Asie ?", listOf("Le Yangtsé (6 300 km)", "Le Gange", "L'Indus", "Le Mékong"), "Géographie", ""),
            en = LocalizedContent("What is the longest river in Asia?", listOf("Yangtze (6,300 km)", "Ganges", "Indus", "Mekong"), "Geography", ""),
            zh = LocalizedContent("亚洲最长的河流是什么？", listOf("长江（6300公里）", "恒河", "印度河", "湄公河"), "地理", ""),
            es = LocalizedContent("¿Cuál es el río más largo de Asia?", listOf("Yangtsé (6 300 km)", "Ganges", "Indo", "Mekong"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4061, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve la ville de Pétra ?", listOf("Jordanie", "Israël", "Syrie", "Arabie Saoudite"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Petra located?", listOf("Jordan", "Israel", "Syria", "Saudi Arabia"), "Geography", ""),
            zh = LocalizedContent("佩特拉古城位于哪个国家？", listOf("约旦", "以色列", "叙利亚", "沙特阿拉伯"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Petra?", listOf("Jordania", "Israel", "Siria", "Arabia Saudita"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4062, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du canal qui relie la mer Rouge à la Méditerranée ?", listOf("Canal de Suez", "Canal de Panama", "Canal de Kiel", "Canal du Midi"), "Géographie", ""),
            en = LocalizedContent("What is the name of the canal that connects the Red Sea to the Mediterranean?", listOf("Suez Canal", "Panama Canal", "Kiel Canal", "Canal du Midi"), "Geography", ""),
            zh = LocalizedContent("连接红海和地中海的运河叫什么？", listOf("苏伊士运河", "巴拿马运河", "基尔运河", "米迪运河"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del canal que conecta el Mar Rojo con el Mediterráneo?", listOf("Canal de Suez", "Canal de Panamá", "Canal de Kiel", "Canal del Midi"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4063, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Thaïlande ?", listOf("Bangkok", "Hanoï", "Kuala Lumpur", "Manille"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Thailand?", listOf("Bangkok", "Hanoi", "Kuala Lumpur", "Manila"), "Geography", ""),
            zh = LocalizedContent("泰国的首都是哪里？", listOf("曼谷", "河内", "吉隆坡", "马尼拉"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Tailandia?", listOf("Bangkok", "Hanói", "Kuala Lumpur", "Manila"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4064, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays possède Hawaï comme État ?", listOf("États-Unis d'Amérique", "France", "Royaume-Uni", "Australie"), "Géographie", ""),
            en = LocalizedContent("Which country has Hawaii as a state?", listOf("United States of America", "France", "United Kingdom", "Australia"), "Geography", ""),
            zh = LocalizedContent("哪个国家拥有夏威夷州？", listOf("美利坚合众国", "法国", "英国", "澳大利亚"), "地理", ""),
            es = LocalizedContent("¿Qué país tiene Hawái como estado?", listOf("Estados Unidos de América", "Francia", "Reino Unido", "Australia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4065, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle ville est la plus haute capitale du monde ?", listOf("La Paz (Bolivie) 3 640 m", "Quito (Équateur)", "Bogotá (Colombie)", "Lhassa (Tibet)"), "Géographie", ""),
            en = LocalizedContent("Which city is the highest capital in the world?", listOf("La Paz (Bolivia) 3,640 m", "Quito (Ecuador)", "Bogotá (Colombia)", "Lhasa (Tibet)"), "Geography", ""),
            zh = LocalizedContent("世界上最高的首都是哪个城市？", listOf("拉巴斯（玻利维亚）3640米", "基多（厄瓜多尔）", "波哥大（哥伦比亚）", "拉萨（西藏）"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es la capital más alta del mundo?", listOf("La Paz (Bolivia) 3 640 m", "Quito (Ecuador)", "Bogotá (Colombia)", "Lhasa (Tíbet)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4066, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du golf qui borde l'Arabie Saoudite à l'est ?", listOf("Golfe Persique", "Golfe d'Aden", "Golfe d'Oman", "Mer Rouge"), "Géographie", ""),
            en = LocalizedContent("What is the name of the gulf that borders Saudi Arabia to the east?", listOf("Persian Gulf", "Gulf of Aden", "Gulf of Oman", "Red Sea"), "Geography", ""),
            zh = LocalizedContent("沙特阿拉伯东部濒临哪个海湾？", listOf("波斯湾", "亚丁湾", "阿曼湾", "红海"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del golfo que limita con Arabia Saudita al este?", listOf("Golfo Pérsico", "Golfo de Adén", "Golfo de Omán", "Mar Rojo"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4067, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays d'Asie du Sud-Est est une péninsule et archipel ?", listOf("Malaisie", "Thaïlande", "Vietnam", "Cambodge"), "Géographie", ""),
            en = LocalizedContent("Which Southeast Asian country is both a peninsula and an archipelago?", listOf("Malaysia", "Thailand", "Vietnam", "Cambodia"), "Geography", ""),
            zh = LocalizedContent("哪个东南亚国家既是半岛又是群岛？", listOf("马来西亚", "泰国", "越南", "柬埔寨"), "地理", ""),
            es = LocalizedContent("¿Qué país del sudeste asiático es una península y un archipiélago?", listOf("Malasia", "Tailandia", "Vietnam", "Camboya"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4068, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Vietnam ?", listOf("Hanoï", "Hô-Chi-Minh-Ville", "Da Nang", "Hué"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Vietnam?", listOf("Hanoi", "Ho Chi Minh City", "Da Nang", "Hue"), "Geography", ""),
            zh = LocalizedContent("越南的首都是哪里？", listOf("河内", "胡志明市", "岘港", "顺化"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Vietnam?", listOf("Hanói", "Ciudad Ho Chi Minh", "Da Nang", "Huế"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4069, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Europe ?", listOf("La Volga (3 692 km)", "Le Danube", "Le Rhin", "Le Don"), "Géographie", ""),
            en = LocalizedContent("What is the longest river in Europe?", listOf("The Volga (3,692 km)", "The Danube", "The Rhine", "The Don"), "Geography", ""),
            zh = LocalizedContent("欧洲最长的河流是什么？", listOf("伏尔加河（3692公里）", "多瑙河", "莱茵河", "顿河"), "地理", ""),
            es = LocalizedContent("¿Cuál es el río más largo de Europa?", listOf("El Volga (3.692 km)", "El Danubio", "El Rin", "El Don"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4070, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans quel pays se trouve le Sahara occidental ?", listOf("Maroc administre la majorité / Sahara Occidental contesté", "Algérie", "Mauritanie", "Mali"), "Géographie", ""),
            en = LocalizedContent("In which country is Western Sahara located?", listOf("Morocco administers most / Disputed Western Sahara", "Algeria", "Mauritania", "Mali"), "Geography", ""),
            zh = LocalizedContent("西撒哈拉位于哪个国家？", listOf("摩洛哥控制大部分 / 有争议的西撒哈拉", "阿尔及利亚", "毛里塔尼亚", "马里"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el Sáhara Occidental?", listOf("Marruecos administra la mayor parte / Sáhara Occidental en disputa", "Argelia", "Mauritania", "Malí"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4071, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Colombie ?", listOf("Bogotá", "Medellín", "Cali", "Barranquilla"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Colombia?", listOf("Bogotá", "Medellín", "Cali", "Barranquilla"), "Geography", ""),
            zh = LocalizedContent("哥伦比亚的首都是什么？", listOf("波哥大", "麦德林", "卡利", "巴兰基亚"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Colombia?", listOf("Bogotá", "Medellín", "Cali", "Barranquilla"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4072, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel détroit relie la Manche à la mer du Nord ?", listOf("Détroit du Pas-de-Calais", "Détroit de Douvres", "Ces deux noms désignent le même détroit", "Détroit d'Iroise"), "Géographie", ""),
            en = LocalizedContent("Which strait connects the English Channel to the North Sea?", listOf("Strait of Dover", "Strait of Calais", "Both names refer to the same strait", "Strait of Iroise"), "Geography", ""),
            zh = LocalizedContent("哪个海峡连接英吉利海峡和北海？", listOf("多佛尔海峡", "加来海峡", "这两个名称指的是同一个海峡", "伊鲁瓦兹海峡"), "地理", ""),
            es = LocalizedContent("¿Qué estrecho conecta el Canal de la Mancha con el Mar del Norte?", listOf("Estrecho de Dover", "Estrecho de Calais", "Ambos nombres se refieren al mismo estrecho", "Estrecho de Iroise"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4073, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand État des États-Unis par superficie ?", listOf("Alaska", "Texas", "Californie", "Montana"), "Géographie", ""),
            en = LocalizedContent("What is the largest state in the United States by area?", listOf("Alaska", "Texas", "California", "Montana"), "Geography", ""),
            zh = LocalizedContent("美国面积最大的州是哪个？", listOf("阿拉斯加", "得克萨斯", "加利福尼亚", "蒙大拿"), "地理", ""),
            es = LocalizedContent("¿Cuál es el estado más grande de Estados Unidos por superficie?", listOf("Alaska", "Texas", "California", "Montana"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4074, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle mer bordait l'Empire romain au nord de l'Afrique ?", listOf("Mer Méditerranée", "Mer Rouge", "Océan Atlantique", "Mer Noire"), "Géographie", ""),
            en = LocalizedContent("Which sea bordered the Roman Empire to the north of Africa?", listOf("Mediterranean Sea", "Red Sea", "Atlantic Ocean", "Black Sea"), "Geography", ""),
            zh = LocalizedContent("哪个海在非洲北部与罗马帝国接壤？", listOf("地中海", "红海", "大西洋", "黑海"), "地理", ""),
            es = LocalizedContent("¿Qué mar bordeaba el Imperio Romano al norte de África?", listOf("Mar Mediterráneo", "Mar Rojo", "Océano Atlántico", "Mar Negro"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 4075, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le plus grand basketteur de l'histoire de la NBA selon le palmarès ?", listOf("LeBron James ou Michael Jordan (débat)", "Kareem Abdul-Jabbar", "Kobe Bryant", "Magic Johnson"), "Sport", ""),
            en = LocalizedContent("Who is the greatest basketball player in NBA history according to accolades?", listOf("LeBron James or Michael Jordan (debate)", "Kareem Abdul-Jabbar", "Kobe Bryant", "Magic Johnson"), "Sports", ""),
            zh = LocalizedContent("根据荣誉，谁是NBA历史上最伟大的篮球运动员？", listOf("勒布朗·詹姆斯或迈克尔·乔丹（有争议）", "卡里姆·阿卜杜尔-贾巴尔", "科比·布莱恩特", "魔术师约翰逊"), "体育", ""),
            es = LocalizedContent("¿Quién es el mejor jugador de baloncesto de la historia de la NBA según los logros?", listOf("LeBron James o Michael Jordan (debate)", "Kareem Abdul-Jabbar", "Kobe Bryant", "Magic Johnson"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4076, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la discipline dans laquelle Simone Biles excelle ?", listOf("Gymnastique artistique", "Natation synchronisée", "Athlétisme", "Patinage artistique"), "Sport", ""),
            en = LocalizedContent("In which discipline does Simone Biles excel?", listOf("Artistic gymnastics", "Synchronized swimming", "Athletics", "Figure skating"), "Sports", ""),
            zh = LocalizedContent("西蒙·拜尔斯在哪个项目上表现出色？", listOf("竞技体操", "花样游泳", "田径", "花样滑冰"), "体育", ""),
            es = LocalizedContent("¿En qué disciplina destaca Simone Biles?", listOf("Gimnasia artística", "Natación sincronizada", "Atletismo", "Patinaje artístico"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4077, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de tours compte le Tour de France ?", listOf("21 étapes (pas de tours)", "3 semaines soit 21 étapes", "23 étapes", "18 étapes"), "Sport", ""),
            en = LocalizedContent("How many stages does the Tour de France have?", listOf("21 stages (not laps)", "3 weeks, i.e., 21 stages", "23 stages", "18 stages"), "Sports", ""),
            zh = LocalizedContent("环法自行车赛有多少个赛段？", listOf("21个赛段（不是圈数）", "3周，即21个赛段", "23个赛段", "18个赛段"), "体育", ""),
            es = LocalizedContent("¿Cuántas etapas tiene el Tour de Francia?", listOf("21 etapas (no vueltas)", "3 semanas, es decir, 21 etapas", "23 etapas", "18 etapas"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4078, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport se pratique sur un tatami ?", listOf("Judo, karaté, aïkido, jiu-jitsu", "Seulement le judo", "Seulement le karaté", "Lutte gréco-romaine"), "Sport", ""),
            en = LocalizedContent("Which sport is practiced on a tatami?", listOf("Judo, karate, aikido, jiu-jitsu", "Only judo", "Only karate", "Greco-Roman wrestling"), "Sports", ""),
            zh = LocalizedContent("哪种运动在榻榻米上进行？", listOf("柔道、空手道、合气道、柔术", "只有柔道", "只有空手道", "古典式摔跤"), "体育", ""),
            es = LocalizedContent("¿Qué deporte se practica sobre un tatami?", listOf("Judo, kárate, aikido, jiu-jitsu", "Solo judo", "Solo kárate", "Lucha grecorromana"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4079, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le poids moyen d'un ballon de football officiel ?", listOf("410-450 grammes", "300-350 grammes", "500-550 grammes", "200-250 grammes"), "Sport", ""),
            en = LocalizedContent("What is the average weight of an official football (soccer ball)?", listOf("410-450 grams", "300-350 grams", "500-550 grams", "200-250 grams"), "Sports", ""),
            zh = LocalizedContent("官方足球的平均重量是多少？", listOf("410-450克", "300-350克", "500-550克", "200-250克"), "体育", ""),
            es = LocalizedContent("¿Cuál es el peso medio de un balón de fútbol oficial?", listOf("410-450 gramos", "300-350 gramos", "500-550 gramos", "200-250 gramos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4080, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans quel sport les athlètes participent-ils au 'pentathlon moderne' ?", listOf("Escrime, natation, équitation, tir, course", "Saut, course, lancer, haltère, lutte", "5 disciplines d'athlétisme", "Triathlon étendu"), "Sport", ""),
            en = LocalizedContent("In which sport do athletes compete in the 'modern pentathlon'?", listOf("Fencing, swimming, equestrian, shooting, running", "Jumping, running, throwing, weightlifting, wrestling", "5 athletics disciplines", "Extended triathlon"), "Sports", ""),
            zh = LocalizedContent("运动员在哪个项目中参加'现代五项'？", listOf("击剑、游泳、马术、射击、跑步", "跳跃、跑步、投掷、举重、摔跤", "5个田径项目", "扩展铁人三项"), "体育", ""),
            es = LocalizedContent("¿En qué deporte los atletas compiten en el 'pentatlón moderno'?", listOf("Esgrima, natación, equitación, tiro, carrera", "Salto, carrera, lanzamiento, halterofilia, lucha", "5 disciplinas de atletismo", "Triatlón extendido"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4081, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a remporté le plus de médailles d'or aux JO d'été (cumulé) ?", listOf("États-Unis", "Union soviétique", "Chine", "Russie"), "Sport", ""),
            en = LocalizedContent("Which country has won the most gold medals in the Summer Olympics (cumulative)?", listOf("United States", "Soviet Union", "China", "Russia"), "Sports", ""),
            zh = LocalizedContent("哪个国家在夏季奥运会上获得的金牌最多（累计）？", listOf("美国", "苏联", "中国", "俄罗斯"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más medallas de oro en los Juegos Olímpicos de verano (acumulado)?", listOf("Estados Unidos", "Unión Soviética", "China", "Rusia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4082, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le rugby à XV est-il entré aux JO ?", listOf("Pas encore (seul rugby à 7 depuis 2016)", "1924 et 2016 pour le rugby à 7", "1900 pour le rugby à 15", "2020"), "Sport", ""),
            en = LocalizedContent("In which year did rugby union enter the Olympics?", listOf("Not yet (only rugby sevens since 2016)", "1924 and 2016 for rugby sevens", "1900 for rugby union", "2020"), "Sports", ""),
            zh = LocalizedContent("橄榄球（15人制）在哪一年进入奥运会？", listOf("尚未（自2016年起只有七人制橄榄球）", "1924年和2016年（七人制）", "1900年（15人制）", "2020年"), "体育", ""),
            es = LocalizedContent("¿En qué año entró el rugby a 15 en los Juegos Olímpicos?", listOf("Todavía no (solo rugby a 7 desde 2016)", "1924 y 2016 para rugby a 7", "1900 para rugby a 15", "2020"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4083, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la hauteur d'un filet de tennis ?", listOf("91,4 cm au centre", "1 m", "80 cm", "1,10 m"), "Sport", ""),
            en = LocalizedContent("What is the height of a tennis net?", listOf("91.4 cm at the center", "1 m", "80 cm", "1.10 m"), "Sports", ""),
            zh = LocalizedContent("网球网的高度是多少？", listOf("中心91.4厘米", "1米", "80厘米", "1.10米"), "体育", ""),
            es = LocalizedContent("¿Cuál es la altura de una red de tenis?", listOf("91,4 cm en el centro", "1 m", "80 cm", "1,10 m"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4084, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le plus jeune joueur à avoir remporté Wimbledon en messieurs ?", listOf("Boris Becker (17 ans en 1985)", "Björn Borg", "Rafael Nadal", "Pete Sampras"), "Sport", ""),
            en = LocalizedContent("Who is the youngest player to have won Wimbledon in men's singles?", listOf("Boris Becker (17 years old in 1985)", "Björn Borg", "Rafael Nadal", "Pete Sampras"), "Sports", ""),
            zh = LocalizedContent("谁是赢得温布尔登男单冠军的最年轻球员？", listOf("鲍里斯·贝克尔（1985年17岁）", "比约恩·博格", "拉斐尔·纳达尔", "皮特·桑普拉斯"), "体育", ""),
            es = LocalizedContent("¿Quién es el jugador más joven en haber ganado Wimbledon en individuales masculinos?", listOf("Boris Becker (17 años en 1985)", "Björn Borg", "Rafael Nadal", "Pete Sampras"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4085, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs une équipe de volley-ball a-t-elle sur le terrain ?", listOf("6", "7", "5", "8"), "Sport", ""),
            en = LocalizedContent("How many players does a volleyball team have on the court?", listOf("6", "7", "5", "8"), "Sports", ""),
            zh = LocalizedContent("一支排球队在场上有多少名球员？", listOf("6", "7", "5", "8"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores tiene un equipo de voleibol en la cancha?", listOf("6", "7", "5", "8"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4086, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du saut en hauteur masculin ?", listOf("2,45 m (Javier Sotomayor, 1993)", "2,40 m", "2,50 m", "2,38 m"), "Sport", ""),
            en = LocalizedContent("What is the men's high jump world record?", listOf("2.45 m (Javier Sotomayor, 1993)", "2.40 m", "2.50 m", "2.38 m"), "Sports", ""),
            zh = LocalizedContent("男子跳高世界纪录是多少？", listOf("2.45米（哈维尔·索托马约尔，1993年）", "2.40米", "2.50米", "2.38米"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord mundial de salto de altura masculino?", listOf("2,45 m (Javier Sotomayor, 1993)", "2,40 m", "2,50 m", "2,38 m"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4087, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le circuit de Spa-Francorchamps en F1 ?", listOf("Belgique", "France", "Luxembourg", "Pays-Bas"), "Sport", ""),
            en = LocalizedContent("In which country is the Spa-Francorchamps circuit in F1 located?", listOf("Belgium", "France", "Luxembourg", "Netherlands"), "Sports", ""),
            zh = LocalizedContent("F1中的斯帕-弗朗科尔尚赛道位于哪个国家？", listOf("比利时", "法国", "卢森堡", "荷兰"), "体育", ""),
            es = LocalizedContent("¿En qué país se encuentra el circuito de Spa-Francorchamps en F1?", listOf("Bélgica", "Francia", "Luxemburgo", "Países Bajos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4088, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de points vaut un essai au rugby à XV ?", listOf("5 points", "4 points", "3 points", "6 points"), "Sport", ""),
            en = LocalizedContent("How many points is a try worth in rugby union?", listOf("5 points", "4 points", "3 points", "6 points"), "Sports", ""),
            zh = LocalizedContent("橄榄球（15人制）中一次达阵得多少分？", listOf("5分", "4分", "3分", "6分"), "体育", ""),
            es = LocalizedContent("¿Cuántos puntos vale un ensayo en rugby a 15?", listOf("5 puntos", "4 puntos", "3 puntos", "6 puntos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4089, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du tournoi de tennis sur gazon le plus prestigieux ?", listOf("Wimbledon", "Roland-Garros", "US Open", "Australian Open"), "Sport", ""),
            en = LocalizedContent("What is the name of the most prestigious grass court tennis tournament?", listOf("Wimbledon", "Roland Garros", "US Open", "Australian Open"), "Sports", ""),
            zh = LocalizedContent("最负盛名的草地网球锦标赛是什么？", listOf("温布尔登", "罗兰·加洛斯", "美国公开赛", "澳大利亚公开赛"), "体育", ""),
            es = LocalizedContent("¿Cuál es el nombre del torneo de tenis sobre hierba más prestigioso?", listOf("Wimbledon", "Roland Garros", "US Open", "Abierto de Australia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4090, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel athlète a remporté 4 médailles d'or aux JO de Berlin 1936 ?", listOf("Jesse Owens", "Carl Lewis", "Jim Thorpe", "Paavo Nurmi"), "Sport", ""),
            en = LocalizedContent("Which athlete won 4 gold medals at the 1936 Berlin Olympics?", listOf("Jesse Owens", "Carl Lewis", "Jim Thorpe", "Paavo Nurmi"), "Sports", ""),
            zh = LocalizedContent("哪位运动员在1936年柏林奥运会上获得了4枚金牌？", listOf("杰西·欧文斯", "卡尔·刘易斯", "吉姆·索普", "帕沃·努尔米"), "体育", ""),
            es = LocalizedContent("¿Qué atleta ganó 4 medallas de oro en los Juegos Olímpicos de Berlín 1936?", listOf("Jesse Owens", "Carl Lewis", "Jim Thorpe", "Paavo Nurmi"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4091, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps dure un match de hockey sur glace (temps réglementaire) ?", listOf("3 × 20 minutes", "3 × 15 minutes", "2 × 30 minutes", "4 × 12 minutes"), "Sport", ""),
            en = LocalizedContent("How long does an ice hockey match last (regulation time)?", listOf("3 × 20 minutes", "3 × 15 minutes", "2 × 30 minutes", "4 × 12 minutes"), "Sports", ""),
            zh = LocalizedContent("冰球比赛（常规时间）持续多长时间？", listOf("3 × 20分钟", "3 × 15分钟", "2 × 30分钟", "4 × 12分钟"), "体育", ""),
            es = LocalizedContent("¿Cuánto dura un partido de hockey sobre hielo (tiempo reglamentario)?", listOf("3 × 20 minutos", "3 × 15 minutos", "2 × 30 minutos", "4 × 12 minutos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4093, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a inventé le basketball ?", listOf("James Naismith (1891)", "Thomas Edison", "Dr. Luther Gulick", "Amos Alonzo Stagg"), "Sport", ""),
            en = LocalizedContent("Who invented basketball?", listOf("James Naismith (1891)", "Thomas Edison", "Dr. Luther Gulick", "Amos Alonzo Stagg"), "Sports", ""),
            zh = LocalizedContent("谁发明了篮球？", listOf("詹姆斯·奈史密斯（1891年）", "托马斯·爱迪生", "卢瑟·古利克博士", "阿莫斯·阿隆佐·斯塔格"), "体育", ""),
            es = LocalizedContent("¿Quién inventó el baloncesto?", listOf("James Naismith (1891)", "Thomas Edison", "Dr. Luther Gulick", "Amos Alonzo Stagg"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4094, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la hauteur réglementaire du panier de basketball ?", listOf("3,05 m (10 pieds)", "3 m", "3,20 m", "2,90 m"), "Sport", ""),
            en = LocalizedContent("What is the regulation height of a basketball hoop?", listOf("3.05 m (10 feet)", "3 m", "3.20 m", "2.90 m"), "Sports", ""),
            zh = LocalizedContent("篮球篮筐的标准高度是多少？", listOf("3.05米（10英尺）", "3米", "3.20米", "2.90米"), "体育", ""),
            es = LocalizedContent("¿Cuál es la altura reglamentaria del aro de baloncesto?", listOf("3,05 m (10 pies)", "3 m", "3,20 m", "2,90 m"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 4095, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1972 de Coppola est considéré comme un chef-d'œuvre de la mafia ?", listOf("Le Parrain", "Scarface", "Goodfellas", "Casino"), "Cinéma", ""),
            en = LocalizedContent("Which 1972 film by Coppola is considered a masterpiece of the mafia genre?", listOf("The Godfather", "Scarface", "Goodfellas", "Casino"), "Cinema", ""),
            zh = LocalizedContent("科波拉1972年的哪部电影被认为是黑帮题材的杰作？", listOf("教父", "疤面煞星", "好家伙", "赌城风云"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1972 de Coppola es considerada una obra maestra de la mafia?", listOf("El Padrino", "Scarface", "Goodfellas", "Casino"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4096, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé '2001 : L'Odyssée de l'espace' ?", listOf("Stanley Kubrick", "Steven Spielberg", "Ridley Scott", "George Lucas"), "Cinéma", ""),
            en = LocalizedContent("Who directed '2001: A Space Odyssey'?", listOf("Stanley Kubrick", "Steven Spielberg", "Ridley Scott", "George Lucas"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《2001太空漫游》？", listOf("斯坦利·库布里克", "史蒂文·斯皮尔伯格", "雷德利·斯科特", "乔治·卢卡斯"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió '2001: Una odisea del espacio'?", listOf("Stanley Kubrick", "Steven Spielberg", "Ridley Scott", "George Lucas"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4097, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue le rôle de Neo dans Matrix ?", listOf("Keanu Reeves", "Hugo Weaving", "Laurence Fishburne", "Carrie-Anne Moss"), "Cinéma", ""),
            en = LocalizedContent("Which actor plays the role of Neo in The Matrix?", listOf("Keanu Reeves", "Hugo Weaving", "Laurence Fishburne", "Carrie-Anne Moss"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在《黑客帝国》中饰演尼奥？", listOf("基努·里维斯", "雨果·维文", "劳伦斯·菲什伯恩", "凯瑞-安·莫斯"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpreta el papel de Neo en Matrix?", listOf("Keanu Reeves", "Hugo Weaving", "Laurence Fishburne", "Carrie-Anne Moss"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4098, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel film Dustin Hoffman joue-t-il un homme déguisé en femme ?", listOf("Tootsie", "Kramer vs. Kramer", "Rain Man", "The Graduate"), "Cinéma", ""),
            en = LocalizedContent("In which film does Dustin Hoffman play a man disguised as a woman?", listOf("Tootsie", "Kramer vs. Kramer", "Rain Man", "The Graduate"), "Cinema", ""),
            zh = LocalizedContent("达斯汀·霍夫曼在哪部电影中扮演一个男扮女装的角色？", listOf("窈窕淑男", "克莱默夫妇", "雨人", "毕业生"), "电影", ""),
            es = LocalizedContent("¿En qué película Dustin Hoffman interpreta a un hombre disfrazado de mujer?", listOf("Tootsie", "Kramer vs. Kramer", "Rain Man", "El graduado"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4099, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du réalisateur de 'E.T. l'extra-terrestre' ?", listOf("Steven Spielberg", "James Cameron", "Ron Howard", "Robert Zemeckis"), "Cinéma", ""),
            en = LocalizedContent("What is the name of the director of 'E.T. the Extra-Terrestrial'?", listOf("Steven Spielberg", "James Cameron", "Ron Howard", "Robert Zemeckis"), "Cinema", ""),
            zh = LocalizedContent("《E.T.外星人》的导演是谁？", listOf("史蒂文·斯皮尔伯格", "詹姆斯·卡梅隆", "朗·霍华德", "罗伯特·泽米吉斯"), "电影", ""),
            es = LocalizedContent("¿Cuál es el nombre del director de 'E.T., el extraterrestre'?", listOf("Steven Spielberg", "James Cameron", "Ron Howard", "Robert Zemeckis"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4100, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle principal dans 'Forrest Gump' et 'Philadelphia' ?", listOf("Tom Hanks", "Tom Cruise", "Mel Gibson", "Kevin Costner"), "Cinéma", ""),
            en = LocalizedContent("Who plays the lead role in 'Forrest Gump' and 'Philadelphia'?", listOf("Tom Hanks", "Tom Cruise", "Mel Gibson", "Kevin Costner"), "Cinema", ""),
            zh = LocalizedContent("谁在《阿甘正传》和《费城故事》中扮演主角？", listOf("汤姆·汉克斯", "汤姆·克鲁斯", "梅尔·吉布森", "凯文·科斯特纳"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta el papel principal en 'Forrest Gump' y 'Philadelphia'?", listOf("Tom Hanks", "Tom Cruise", "Mel Gibson", "Kevin Costner"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4101, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1999 introduit le concept de 'bullet time' ?", listOf("Matrix", "Mission Impossible", "Fight Club", "The Matrix Reloaded"), "Cinéma", ""),
            en = LocalizedContent("Which 1999 film introduced the concept of 'bullet time'?", listOf("The Matrix", "Mission Impossible", "Fight Club", "The Matrix Reloaded"), "Cinema", ""),
            zh = LocalizedContent("哪部1999年的电影引入了“子弹时间”的概念？", listOf("黑客帝国", "碟中谍", "搏击俱乐部", "黑客帝国2：重装上阵"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1999 introdujo el concepto de 'bullet time'?", listOf("Matrix", "Misión Imposible", "El club de la lucha", "Matrix Reloaded"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4102, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur français a joué Cyrano de Bergerac en 1990 ?", listOf("Gérard Depardieu", "Jean-Paul Belmondo", "Alain Delon", "Michel Piccoli"), "Cinéma", ""),
            en = LocalizedContent("Which French actor played Cyrano de Bergerac in 1990?", listOf("Gérard Depardieu", "Jean-Paul Belmondo", "Alain Delon", "Michel Piccoli"), "Cinema", ""),
            zh = LocalizedContent("哪位法国演员在1990年饰演了西哈诺·德·贝热拉克？", listOf("热拉尔·德帕迪约", "让-保罗·贝尔蒙多", "阿兰·德龙", "米歇尔·皮科利"), "电影", ""),
            es = LocalizedContent("¿Qué actor francés interpretó a Cyrano de Bergerac en 1990?", listOf("Gérard Depardieu", "Jean-Paul Belmondo", "Alain Delon", "Michel Piccoli"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4103, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de David Fincher relate l'histoire de deux frères en prison ?", listOf("Seven", "Fight Club", "Zodiac", "Gone Girl"), "Cinéma", ""),
            en = LocalizedContent("Which David Fincher film tells the story of two brothers in prison?", listOf("Seven", "Fight Club", "Zodiac", "Gone Girl"), "Cinema", ""),
            zh = LocalizedContent("大卫·芬奇的哪部电影讲述了两个兄弟在监狱中的故事？", listOf("七宗罪", "搏击俱乐部", "十二宫", "消失的爱人"), "电影", ""),
            es = LocalizedContent("¿Qué película de David Fincher cuenta la historia de dos hermanos en prisión?", listOf("Seven", "El club de la lucha", "Zodiac", "Perdida"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4104, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui réalise 'Interstellar' (2014) ?", listOf("Christopher Nolan", "Steven Spielberg", "James Cameron", "Denis Villeneuve"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Interstellar' (2014)?", listOf("Christopher Nolan", "Steven Spielberg", "James Cameron", "Denis Villeneuve"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《星际穿越》（2014）？", listOf("克里斯托弗·诺兰", "史蒂文·斯皮尔伯格", "詹姆斯·卡梅隆", "丹尼斯·维伦纽瓦"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Interstellar' (2014)?", listOf("Christopher Nolan", "Steven Spielberg", "James Cameron", "Denis Villeneuve"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4105, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle capitale europeenne le personnage de Gil voyage-t-il dans le temps dans le film de Woody Allen ?", listOf("Paris", "New York", "Rome", "Londres"), "Cinéma", ""),
            en = LocalizedContent("In which European capital does the character Gil time-travel in Woody Allen's film?", listOf("Paris", "New York", "Rome", "London"), "Cinema", ""),
            zh = LocalizedContent("在伍迪·艾伦的电影中，角色吉尔在哪个欧洲首都进行时间旅行？", listOf("巴黎", "纽约", "罗马", "伦敦"), "电影", ""),
            es = LocalizedContent("¿En qué capital europea viaja en el tiempo el personaje Gil en la película de Woody Allen?", listOf("París", "Nueva York", "Roma", "Londres"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4106, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1993 montre des dinosaures dans un parc ?", listOf("Jurassic Park", "The Lost World", "Dinosaur", "Land Before Time"), "Cinéma", ""),
            en = LocalizedContent("Which 1993 film shows dinosaurs in a park?", listOf("Jurassic Park", "The Lost World", "Dinosaur", "The Land Before Time"), "Cinema", ""),
            zh = LocalizedContent("哪部1993年的电影展示了公园里的恐龙？", listOf("侏罗纪公园", "失落的世界", "恐龙", "小脚板走天涯"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1993 muestra dinosaurios en un parque?", listOf("Parque Jurásico", "El mundo perdido", "Dinosaurio", "La tierra antes del tiempo"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4107, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué Tony Stark / Iron Man dans le MCU ?", listOf("Robert Downey Jr.", "Chris Pratt", "Chris Evans", "Mark Ruffalo"), "Cinéma", ""),
            en = LocalizedContent("Which actor played Tony Stark / Iron Man in the MCU?", listOf("Robert Downey Jr.", "Chris Pratt", "Chris Evans", "Mark Ruffalo"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在漫威电影宇宙中饰演托尼·斯塔克/钢铁侠？", listOf("小罗伯特·唐尼", "克里斯·帕拉特", "克里斯·埃文斯", "马克·鲁弗洛"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó a Tony Stark / Iron Man en el UCM?", listOf("Robert Downey Jr.", "Chris Pratt", "Chris Evans", "Mark Ruffalo"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4108, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Le Labyrinthe de Pan' ?", listOf("Guillermo del Toro", "Alfonso Cuarón", "Pedro Almodóvar", "Alejandro González Iñárritu"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Pan's Labyrinth'?", listOf("Guillermo del Toro", "Alfonso Cuarón", "Pedro Almodóvar", "Alejandro González Iñárritu"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《潘神的迷宫》？", listOf("吉尔莫·德尔·托罗", "阿方索·卡隆", "佩德罗·阿莫多瓦", "亚利桑德罗·冈萨雷斯·伊纳里图"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'El laberinto del fauno'?", listOf("Guillermo del Toro", "Alfonso Cuarón", "Pedro Almodóvar", "Alejandro González Iñárritu"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4109, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel film voit-on la réplique 'I'm the king of the world!' ?", listOf("Titanic", "Avatar", "The Greatest Showman", "Cast Away"), "Cinéma", ""),
            en = LocalizedContent("In which film do we see the line 'I'm the king of the world!'?", listOf("Titanic", "Avatar", "The Greatest Showman", "Cast Away"), "Cinema", ""),
            zh = LocalizedContent("在哪部电影中我们看到台词“我是世界之王！”？", listOf("泰坦尼克号", "阿凡达", "马戏之王", "荒岛余生"), "电影", ""),
            es = LocalizedContent("¿En qué película vemos la frase '¡Soy el rey del mundo!'?", listOf("Titanic", "Avatar", "El gran showman", "Náufrago"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4110, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Spielberg traite du débarquement de Normandie ?", listOf("Il faut sauver le soldat Ryan", "Schindler's List", "Empire du Soleil", "Amistad"), "Cinéma", ""),
            en = LocalizedContent("Which Spielberg film deals with the Normandy landings?", listOf("Saving Private Ryan", "Schindler's List", "Empire of the Sun", "Amistad"), "Cinema", ""),
            zh = LocalizedContent("斯皮尔伯格哪部电影讲述了诺曼底登陆？", listOf("拯救大兵瑞恩", "辛德勒的名单", "太阳帝国", "勇者无惧"), "电影", ""),
            es = LocalizedContent("¿Qué película de Spielberg trata sobre el desembarco de Normandía?", listOf("Salvar al soldado Ryan", "La lista de Schindler", "El imperio del sol", "Amistad"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4111, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a joué le colonel Kurtz dans 'Apocalypse Now' ?", listOf("Marlon Brando", "Robert Duvall", "Martin Sheen", "Dennis Hopper"), "Cinéma", ""),
            en = LocalizedContent("Which actor played Colonel Kurtz in 'Apocalypse Now'?", listOf("Marlon Brando", "Robert Duvall", "Martin Sheen", "Dennis Hopper"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在《现代启示录》中饰演库尔兹上校？", listOf("马龙·白兰度", "罗伯特·杜瓦尔", "马丁·辛", "丹尼斯·霍珀"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó al coronel Kurtz en 'Apocalypse Now'?", listOf("Marlon Brando", "Robert Duvall", "Martin Sheen", "Dennis Hopper"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4112, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la nationalité du réalisateur Ingmar Bergman ?", listOf("Suédoise", "Danoise", "Norvégienne", "Finlandaise"), "Cinéma", ""),
            en = LocalizedContent("What is the nationality of director Ingmar Bergman?", listOf("Swedish", "Danish", "Norwegian", "Finnish"), "Cinema", ""),
            zh = LocalizedContent("导演英格玛·伯格曼是哪国人？", listOf("瑞典", "丹麦", "挪威", "芬兰"), "电影", ""),
            es = LocalizedContent("¿Cuál es la nacionalidad del director Ingmar Bergman?", listOf("Sueca", "Danesa", "Noruega", "Finlandesa"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Spielberg parle d'un homme enfermé dans un aéroport ?", listOf("Le Terminal", "Catch Me If You Can", "Amistad", "Empire du Soleil"), "Cinéma", ""),
            en = LocalizedContent("Which Spielberg film is about a man trapped in an airport?", listOf("The Terminal", "Catch Me If You Can", "Amistad", "Empire of the Sun"), "Cinema", ""),
            zh = LocalizedContent("斯皮尔伯格哪部电影讲述了一个被困在机场的男人？", listOf("幸福终点站", "猫鼠游戏", "勇者无惧", "太阳帝国"), "电影", ""),
            es = LocalizedContent("¿Qué película de Spielberg trata sobre un hombre atrapado en un aeropuerto?", listOf("La terminal", "Atrápame si puedes", "Amistad", "El imperio del sol"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4114, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel film Hugh Jackman joue-t-il Wolverine pour la première fois ?", listOf("X-Men (2000)", "X-Men Origins: Wolverine (2009)", "Logan (2017)", "The Wolverine (2013)"), "Cinéma", ""),
            en = LocalizedContent("In which film did Hugh Jackman first play Wolverine?", listOf("X-Men (2000)", "X-Men Origins: Wolverine (2009)", "Logan (2017)", "The Wolverine (2013)"), "Cinema", ""),
            zh = LocalizedContent("休·杰克曼在哪部电影中首次饰演金刚狼？", listOf("X战警（2000）", "金刚狼（2009）", "金刚狼3：殊死一战（2017）", "金刚狼2（2013）"), "电影", ""),
            es = LocalizedContent("¿En qué película Hugh Jackman interpretó a Wolverine por primera vez?", listOf("X-Men (2000)", "X-Men Origins: Wolverine (2009)", "Logan (2017)", "The Wolverine (2013)"), "Cine", "")
        ),
        BilingualQuestion(
            id = 4115, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe est connu pour 'Stairway to Heaven' ?", listOf("Led Zeppelin", "Deep Purple", "Black Sabbath", "Pink Floyd"), "Musique", ""),
            en = LocalizedContent("Which band is known for 'Stairway to Heaven'?", listOf("Led Zeppelin", "Deep Purple", "Black Sabbath", "Pink Floyd"), "Music", ""),
            zh = LocalizedContent("哪支乐队以《天堂的阶梯》闻名？", listOf("齐柏林飞艇", "深紫", "黑色安息日", "平克·弗洛伊德"), "音乐", ""),
            es = LocalizedContent("¿Qué banda es conocida por 'Stairway to Heaven'?", listOf("Led Zeppelin", "Deep Purple", "Black Sabbath", "Pink Floyd"), "Música", "")
        ),
        BilingualQuestion(
            id = 4116, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle chanteuse est connue pour 'Rolling in the Deep' ?", listOf("Adele", "Beyoncé", "Amy Winehouse", "Lana Del Rey"), "Musique", ""),
            en = LocalizedContent("Which singer is known for 'Rolling in the Deep'?", listOf("Adele", "Beyoncé", "Amy Winehouse", "Lana Del Rey"), "Music", ""),
            zh = LocalizedContent("哪位歌手以《Rolling in the Deep》闻名？", listOf("阿黛尔", "碧昂丝", "艾米·怀恩豪斯", "拉娜·德雷"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante es conocida por 'Rolling in the Deep'?", listOf("Adele", "Beyoncé", "Amy Winehouse", "Lana Del Rey"), "Música", "")
        ),
        BilingualQuestion(
            id = 4117, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de 'La Traviata' (opéra) ?", listOf("Giuseppe Verdi", "Giacomo Puccini", "Gaetano Donizetti", "Gioachino Rossini"), "Musique", ""),
            en = LocalizedContent("Who is the composer of 'La Traviata' (opera)?", listOf("Giuseppe Verdi", "Giacomo Puccini", "Gaetano Donizetti", "Gioachino Rossini"), "Music", ""),
            zh = LocalizedContent("歌剧《茶花女》的作者是谁？", listOf("朱塞佩·威尔第", "贾科莫·普契尼", "葛塔诺·多尼采蒂", "焦阿基诺·罗西尼"), "音乐", ""),
            es = LocalizedContent("¿Quién es el autor de 'La Traviata' (ópera)?", listOf("Giuseppe Verdi", "Giacomo Puccini", "Gaetano Donizetti", "Gioachino Rossini"), "Música", "")
        ),
        BilingualQuestion(
            id = 4118, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe britannique est associé à 'Smells Like Teen Spirit' ?", listOf("Nirvana", "Pearl Jam", "Soundgarden", "Alice in Chains"), "Musique", ""),
            en = LocalizedContent("Which British band is associated with 'Smells Like Teen Spirit'?", listOf("Nirvana", "Pearl Jam", "Soundgarden", "Alice in Chains"), "Music", ""),
            zh = LocalizedContent("哪支英国乐队与《Smells Like Teen Spirit》有关？", listOf("涅槃", "珍珠果酱乐队", "声音花园", "爱丽丝囚徒"), "音乐", ""),
            es = LocalizedContent("¿Qué banda británica está asociada con 'Smells Like Teen Spirit'?", listOf("Nirvana", "Pearl Jam", "Soundgarden", "Alice in Chains"), "Música", "")
        ),
        BilingualQuestion(
            id = 4119, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle ville est né le jazz ?", listOf("La Nouvelle-Orléans", "New York", "Chicago", "Memphis"), "Musique", ""),
            en = LocalizedContent("In which city was jazz born?", listOf("New Orleans", "New York", "Chicago", "Memphis"), "Music", ""),
            zh = LocalizedContent("爵士乐诞生于哪座城市？", listOf("新奥尔良", "纽约", "芝加哥", "孟菲斯"), "音乐", ""),
            es = LocalizedContent("¿En qué ciudad nació el jazz?", listOf("Nueva Orleans", "Nueva York", "Chicago", "Memphis"), "Música", "")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 4120, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le compositeur de 'Le Beau Danube bleu' ?", listOf("Johann Strauss II", "Franz Schubert", "Johannes Brahms", "Gustav Mahler"), "Musique", ""),
            en = LocalizedContent("Who composed 'The Blue Danube'?", listOf("Johann Strauss II", "Franz Schubert", "Johannes Brahms", "Gustav Mahler"), "Music", ""),
            zh = LocalizedContent("谁创作了《蓝色多瑙河》？", listOf("小约翰·施特劳斯", "弗朗茨·舒伯特", "约翰内斯·勃拉姆斯", "古斯塔夫·马勒"), "音乐", ""),
            es = LocalizedContent("¿Quién compuso 'El Danubio azul'?", listOf("Johann Strauss II", "Franz Schubert", "Johannes Brahms", "Gustav Mahler"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4121, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la guitare basse à 4 cordes la plus célèbre ?", listOf("Fender Precision Bass", "Gibson Les Paul Bass", "Rickenbacker 4003", "Music Man StingRay"), "Musique", ""),
            en = LocalizedContent("What is the name of the most famous 4-string bass guitar?", listOf("Fender Precision Bass", "Gibson Les Paul Bass", "Rickenbacker 4003", "Music Man StingRay"), "Music", ""),
            zh = LocalizedContent("最著名的四弦贝斯吉他叫什么？", listOf("Fender Precision Bass", "Gibson Les Paul Bass", "Rickenbacker 4003", "Music Man StingRay"), "音乐", ""),
            es = LocalizedContent("¿Cuál es el nombre del bajo de 4 cuerdas más famoso?", listOf("Fender Precision Bass", "Gibson Les Paul Bass", "Rickenbacker 4003", "Music Man StingRay"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel chanteur est connu pour ses sauts et sa voix puissante dans 'Jump' ?", listOf("David Lee Roth (Van Halen)", "Mick Jagger", "Roger Daltrey", "Robert Plant"), "Musique", ""),
            en = LocalizedContent("Which singer is known for his jumps and powerful voice in 'Jump'?", listOf("David Lee Roth (Van Halen)", "Mick Jagger", "Roger Daltrey", "Robert Plant"), "Music", ""),
            zh = LocalizedContent("哪位歌手因在《Jump》中的跳跃和强劲嗓音而闻名？", listOf("大卫·李·罗斯（范·海伦）", "米克·贾格尔", "罗杰·达尔特雷", "罗伯特·普兰特"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante es conocido por sus saltos y su poderosa voz en 'Jump'?", listOf("David Lee Roth (Van Halen)", "Mick Jagger", "Roger Daltrey", "Robert Plant"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4123, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle chanteuse française a chanté 'La Marseillaise' à la télévision américaine lors du Super Bowl ?", listOf("Celine Dion", "Stromae", "Christine and the Queens", "Vanessa Paradis"), "Musique", ""),
            en = LocalizedContent("Which French singer performed 'La Marseillaise' on American television during the Super Bowl?", listOf("Celine Dion", "Stromae", "Christine and the Queens", "Vanessa Paradis"), "Music", ""),
            zh = LocalizedContent("哪位法国歌手在超级碗期间在美国电视上演唱了《马赛曲》？", listOf("席琳·迪翁", "斯特罗迈", "克里斯汀和皇后乐队", "凡妮莎·帕拉迪丝"), "音乐", ""),
            es = LocalizedContent("¿Qué cantante francesa interpretó 'La Marsellesa' en la televisión estadounidense durante el Super Bowl?", listOf("Celine Dion", "Stromae", "Christine and the Queens", "Vanessa Paradis"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4124, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé la célèbre 'Toccata et Fugue en ré mineur' ?", listOf("Johann Sebastian Bach", "Georg Friedrich Handel", "Antonio Vivaldi", "Claudio Monteverdi"), "Musique", ""),
            en = LocalizedContent("Who composed the famous 'Toccata and Fugue in D minor'?", listOf("Johann Sebastian Bach", "George Frideric Handel", "Antonio Vivaldi", "Claudio Monteverdi"), "Music", ""),
            zh = LocalizedContent("谁创作了著名的《d小调托卡塔与赋格》？", listOf("约翰·塞巴斯蒂安·巴赫", "乔治·弗里德里希·亨德尔", "安东尼奥·维瓦尔第", "克劳迪奥·蒙特威尔第"), "音乐", ""),
            es = LocalizedContent("¿Quién compuso la famosa 'Tocata y fuga en re menor'?", listOf("Johann Sebastian Bach", "Georg Friedrich Händel", "Antonio Vivaldi", "Claudio Monteverdi"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4125, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe est à l'origine de l'album 'Dark Side of the Moon' ?", listOf("Pink Floyd", "Genesis", "Yes", "Emerson Lake & Palmer"), "Musique", ""),
            en = LocalizedContent("Which band created the album 'Dark Side of the Moon'?", listOf("Pink Floyd", "Genesis", "Yes", "Emerson, Lake & Palmer"), "Music", ""),
            zh = LocalizedContent("哪个乐队创作了专辑《月之暗面》？", listOf("平克·弗洛伊德", "创世纪", "Yes", "艾默生、雷克与帕尔默"), "音乐", ""),
            es = LocalizedContent("¿Qué banda creó el álbum 'Dark Side of the Moon'?", listOf("Pink Floyd", "Genesis", "Yes", "Emerson, Lake & Palmer"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4126, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle artiste a vendu le plus d'albums de tous les temps ?", listOf("Michael Jackson (~350M)", "Beatles (~600M)", "Elvis Presley (~500M)", "Madonna (~300M)"), "Musique", ""),
            en = LocalizedContent("Which artist has sold the most albums of all time?", listOf("Michael Jackson (~350M)", "Beatles (~600M)", "Elvis Presley (~500M)", "Madonna (~300M)"), "Music", ""),
            zh = LocalizedContent("哪位艺术家是有史以来专辑销量最高的？", listOf("迈克尔·杰克逊（约3.5亿）", "披头士（约6亿）", "埃尔维斯·普雷斯利（约5亿）", "麦当娜（约3亿）"), "音乐", ""),
            es = LocalizedContent("¿Qué artista ha vendido más álbumes de todos los tiempos?", listOf("Michael Jackson (~350M)", "Beatles (~600M)", "Elvis Presley (~500M)", "Madonna (~300M)"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4127, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur russe a écrit le ballet 'Le Lac des cygnes' ?", listOf("Piotr Ilitch Tchaïkovski", "Igor Stravinski", "Sergei Prokofiev", "Dimitri Chostakovitch"), "Musique", ""),
            en = LocalizedContent("Which Russian composer wrote the ballet 'Swan Lake'?", listOf("Pyotr Ilyich Tchaikovsky", "Igor Stravinsky", "Sergei Prokofiev", "Dmitri Shostakovich"), "Music", ""),
            zh = LocalizedContent("哪位俄罗斯作曲家创作了芭蕾舞剧《天鹅湖》？", listOf("彼得·伊里奇·柴可夫斯基", "伊戈尔·斯特拉文斯基", "谢尔盖·普罗科菲耶夫", "德米特里·肖斯塔科维奇"), "音乐", ""),
            es = LocalizedContent("¿Qué compositor ruso escribió el ballet 'El lago de los cisnes'?", listOf("Piotr Ilich Chaikovski", "Igor Stravinski", "Serguéi Prokófiev", "Dmitri Shostakóvich"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe est connu pour 'Hotel California' ?", listOf("Eagles", "Fleetwood Mac", "The Doors", "Crosby, Stills, Nash & Young"), "Musique", ""),
            en = LocalizedContent("Which band is known for 'Hotel California'?", listOf("Eagles", "Fleetwood Mac", "The Doors", "Crosby, Stills, Nash & Young"), "Music", ""),
            zh = LocalizedContent("哪个乐队以《加州旅馆》闻名？", listOf("老鹰乐队", "弗利特伍德·麦克", "大门乐队", "克罗斯比、斯蒂尔斯、纳什与杨"), "音乐", ""),
            es = LocalizedContent("¿Qué banda es conocida por 'Hotel California'?", listOf("Eagles", "Fleetwood Mac", "The Doors", "Crosby, Stills, Nash & Young"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé 'La Symphonie inachevée' ?", listOf("Franz Schubert", "Ludwig van Beethoven", "Johannes Brahms", "Anton Bruckner"), "Musique", ""),
            en = LocalizedContent("Who composed the 'Unfinished Symphony'?", listOf("Franz Schubert", "Ludwig van Beethoven", "Johannes Brahms", "Anton Bruckner"), "Music", ""),
            zh = LocalizedContent("谁创作了《未完成交响曲》？", listOf("弗朗茨·舒伯特", "路德维希·范·贝多芬", "约翰内斯·勃拉姆斯", "安东·布鲁克纳"), "音乐", ""),
            es = LocalizedContent("¿Quién compuso la 'Sinfonía Inacabada'?", listOf("Franz Schubert", "Ludwig van Beethoven", "Johannes Brahms", "Anton Bruckner"), "Musica", "")
        ),
        BilingualQuestion(
            id = 4130, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Madame Bovary' ?", listOf("Gustave Flaubert", "Émile Zola", "Honoré de Balzac", "Stendhal"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Madame Bovary'?", listOf("Gustave Flaubert", "Émile Zola", "Honoré de Balzac", "Stendhal"), "Culture", ""),
            zh = LocalizedContent("谁写了《包法利夫人》？", listOf("古斯塔夫·福楼拜", "埃米尔·左拉", "奥诺雷·德·巴尔扎克", "司汤达"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Madame Bovary'?", listOf("Gustave Flaubert", "Émile Zola", "Honoré de Balzac", "Stendhal"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4131, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a créé le personnage de Sherlock Holmes ?", listOf("Arthur Conan Doyle", "Agatha Christie", "Edgar Allan Poe", "G.K. Chesterton"), "Culture", ""),
            en = LocalizedContent("Which author created the character of Sherlock Holmes?", listOf("Arthur Conan Doyle", "Agatha Christie", "Edgar Allan Poe", "G.K. Chesterton"), "Culture", ""),
            zh = LocalizedContent("哪位作者创造了夏洛克·福尔摩斯这个角色？", listOf("阿瑟·柯南·道尔", "阿加莎·克里斯蒂", "埃德加·爱伦·坡", "G.K.切斯特顿"), "文化", ""),
            es = LocalizedContent("¿Qué autor creó el personaje de Sherlock Holmes?", listOf("Arthur Conan Doyle", "Agatha Christie", "Edgar Allan Poe", "G.K. Chesterton"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4132, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur de '1984' et 'La Ferme des animaux' ?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "H.G. Wells"), "Culture", ""),
            en = LocalizedContent("Who is the author of '1984' and 'Animal Farm'?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "H.G. Wells"), "Culture", ""),
            zh = LocalizedContent("谁写了《1984》和《动物农场》？", listOf("乔治·奥威尔", "奥尔德斯·赫胥黎", "雷·布拉德伯里", "H.G.威尔斯"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de '1984' y 'Rebelión en la granja'?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "H.G. Wells"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4133, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quelle œuvre trouve-t-on le personnage d'Hamlet ?", listOf("William Shakespeare", "Christopher Marlowe", "Ben Jonson", "Thomas Kyd"), "Culture", ""),
            en = LocalizedContent("In which work do we find the character of Hamlet?", listOf("William Shakespeare", "Christopher Marlowe", "Ben Jonson", "Thomas Kyd"), "Culture", ""),
            zh = LocalizedContent("在哪部作品中能找到哈姆雷特这个角色？", listOf("威廉·莎士比亚", "克里斯托弗·马洛", "本·琼森", "托马斯·基德"), "文化", ""),
            es = LocalizedContent("¿En qué obra encontramos al personaje de Hamlet?", listOf("William Shakespeare", "Christopher Marlowe", "Ben Jonson", "Thomas Kyd"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4134, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'L'Iliade' et 'L'Odyssée' ?", listOf("Homère", "Virgile", "Hésiode", "Sophocle"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Iliad' and 'The Odyssey'?", listOf("Homer", "Virgil", "Hesiod", "Sophocles"), "Culture", ""),
            zh = LocalizedContent("谁写了《伊利亚特》和《奥德赛》？", listOf("荷马", "维吉尔", "赫西俄德", "索福克勒斯"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'La Ilíada' y 'La Odisea'?", listOf("Homero", "Virgilio", "Hesíodo", "Sófocles"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4136, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur irlandais a écrit 'Ulysse' ?", listOf("James Joyce", "Samuel Beckett", "Oscar Wilde", "William Butler Yeats"), "Culture", ""),
            en = LocalizedContent("Which Irish author wrote 'Ulysses'?", listOf("James Joyce", "Samuel Beckett", "Oscar Wilde", "William Butler Yeats"), "Culture", ""),
            zh = LocalizedContent("哪位爱尔兰作家写了《尤利西斯》？", listOf("詹姆斯·乔伊斯", "塞缪尔·贝克特", "奥斯卡·王尔德", "威廉·巴特勒·叶芝"), "文化", ""),
            es = LocalizedContent("¿Qué autor irlandés escribió 'Ulises'?", listOf("James Joyce", "Samuel Beckett", "Oscar Wilde", "William Butler Yeats"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4137, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur de 'L'Alchimiste' ?", listOf("Paulo Coelho", "Jorge Amado", "Gabriel García Márquez", "Mario Vargas Llosa"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'The Alchemist'?", listOf("Paulo Coelho", "Jorge Amado", "Gabriel García Márquez", "Mario Vargas Llosa"), "Culture", ""),
            zh = LocalizedContent("谁写了《牧羊少年奇幻之旅》？", listOf("保罗·科埃略", "若热·亚马多", "加夫列尔·加西亚·马尔克斯", "马里奥·巴尔加斯·略萨"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'El Alquimista'?", listOf("Paulo Coelho", "Jorge Amado", "Gabriel García Márquez", "Mario Vargas Llosa"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4138, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur américain a écrit 'Le Vieil homme et la mer' ?", listOf("Ernest Hemingway", "John Steinbeck", "F. Scott Fitzgerald", "William Faulkner"), "Culture", ""),
            en = LocalizedContent("Which American author wrote 'The Old Man and the Sea'?", listOf("Ernest Hemingway", "John Steinbeck", "F. Scott Fitzgerald", "William Faulkner"), "Culture", ""),
            zh = LocalizedContent("哪位美国作家写了《老人与海》？", listOf("欧内斯特·海明威", "约翰·斯坦贝克", "F.斯科特·菲茨杰拉德", "威廉·福克纳"), "文化", ""),
            es = LocalizedContent("¿Qué autor estadounidense escribió 'El viejo y el mar'?", listOf("Ernest Hemingway", "John Steinbeck", "F. Scott Fitzgerald", "William Faulkner"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4139, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Les Fleurs du mal' ?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Les Fleurs du mal'?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé"), "Culture", ""),
            zh = LocalizedContent("谁写了《恶之花》？", listOf("夏尔·波德莱尔", "阿蒂尔·兰波", "保罗·魏尔伦", "斯特凡·马拉美"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Las flores del mal'?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 4140, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a écrit 'Le Seigneur des Anneaux' ?", listOf("J.R.R. Tolkien", "C.S. Lewis", "George R.R. Martin", "Terry Pratchett"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'The Lord of the Rings'?", listOf("J.R.R. Tolkien", "C.S. Lewis", "George R.R. Martin", "Terry Pratchett"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《魔戒》？", listOf("J.R.R.托尔金", "C.S.刘易斯", "乔治·R·R·马丁", "特里·普拉切特"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'El Señor de los Anillos'?", listOf("J.R.R. Tolkien", "C.S. Lewis", "George R.R. Martin", "Terry Pratchett"), "Cultura", "")
        ),
    )
}
