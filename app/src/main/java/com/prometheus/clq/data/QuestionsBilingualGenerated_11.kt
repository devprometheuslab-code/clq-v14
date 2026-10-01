package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 11 : 500 questions bilingues */
object QuestionsBilingualGenerated_11 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11430, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Huawei?", listOf("Ren Zhengfei", "Lei Jun", "Jack Ma", "Pony Ma"), "Technologie", "Ren Zhengfei, un ancien ingénieur de l'Armée populaire de libération, a fondé Huawei en 1987 à Shenzhen, en Chine."),
            en = LocalizedContent("Who created Huawei?", listOf("Ren Zhengfei", "Lei Jun", "Jack Ma", "Pony Ma"), "Technology", "Ren Zhengfei, a former engineer in the People's Liberation Army, founded Huawei in 1987 in Shenzhen, China."),
            zh = LocalizedContent("谁创立了华为？", listOf("任正非", "雷军", "马云", "马化腾"), "科技", "任正非，一位前中国人民解放军工程师，于1987年在中国深圳创立了华为。"),
            es = LocalizedContent("¿Quién creó Huawei?", listOf("Ren Zhengfei", "Lei Jun", "Jack Ma", "Pony Ma"), "Tecnología", "Ren Zhengfei, un ex ingeniero del Ejército Popular de Liberación, fundó Huawei en 1987 en Shenzhen, China.")
        ),
        BilingualQuestion(
            id = 11431, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien social media?", listOf("The WELL", "Usenet", "BBS", "Bulletin Board System"), "Technologie", "Lancé en 1985, The WELL est un système de conférence en ligne qui est considéré comme l'un des premiers réseaux sociaux, avant l'avènement d'Internet grand public."),
            en = LocalizedContent("What is the oldest social media?", listOf("The WELL", "Usenet", "BBS", "Bulletin Board System"), "Technology", "Launched in 1985, The WELL is an online conferencing system considered one of the earliest social networks, before the advent of the public Internet."),
            zh = LocalizedContent("最古老的社交媒体是什么？", listOf("The WELL", "Usenet", "BBS", "公告板系统"), "科技", "The WELL 于1985年推出，是一个在线会议系统，被认为是公共互联网出现之前最早的社交网络之一。"),
            es = LocalizedContent("¿Cuál es la red social más antigua?", listOf("The WELL", "Usenet", "BBS", "Bulletin Board System"), "Tecnología", "Lanzado en 1985, The WELL es un sistema de conferencias en línea considerado una de las primeras redes sociales, antes del advenimiento de Internet público.")
        ),
        BilingualQuestion(
            id = 11432, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année The WELL a-t-il été créé?", listOf("1985", "1983", "1987", "1989"), "Technologie", "The WELL (Whole Earth 'Lectronic Link) a été fondé en 1985 par Stewart Brand et Larry Brilliant, devenant l'un des premiers forums en ligne influents."),
            en = LocalizedContent("In what year was The WELL created?", listOf("1985", "1983", "1987", "1989"), "Technology", "The WELL (Whole Earth 'Lectronic Link) was founded in 1985 by Stewart Brand and Larry Brilliant, becoming one of the first influential online forums."),
            zh = LocalizedContent("The WELL 创建于哪一年？", listOf("1985", "1983", "1987", "1989"), "科技", "The WELL（Whole Earth 'Lectronic Link）由 Stewart Brand 和 Larry Brilliant 于1985年创立，成为最早有影响力的在线论坛之一。"),
            es = LocalizedContent("¿En qué año se creó The WELL?", listOf("1985", "1983", "1987", "1989"), "Tecnología", "The WELL (Whole Earth 'Lectronic Link) fue fundado en 1985 por Stewart Brand y Larry Brilliant, convirtiéndose en uno de los primeros foros en línea influyentes.")
        ),
        BilingualQuestion(
            id = 11433, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le social media le plus ancien encore actif?", listOf("Bulletin Board System", "Usenet", "The WELL", "ECHO"), "Technologie", "Le Bulletin Board System (BBS) est apparu à la fin des années 1970, bien avant les réseaux sociaux modernes, et certains fonctionnent encore aujourd'hui."),
            en = LocalizedContent("What is the oldest social media still active?", listOf("Bulletin Board System", "Usenet", "The WELL", "ECHO"), "Technology", "The Bulletin Board System (BBS) appeared in the late 1970s, long before modern social networks, and some are still operating today."),
            zh = LocalizedContent("仍然活跃的最古老的社交媒体是什么？", listOf("公告板系统", "Usenet", "The WELL", "ECHO"), "科技", "公告板系统（BBS）出现在20世纪70年代末，远早于现代社交网络，有些至今仍在运行。"),
            es = LocalizedContent("¿Cuál es la red social más antigua aún activa?", listOf("Bulletin Board System", "Usenet", "The WELL", "ECHO"), "Tecnología", "El Bulletin Board System (BBS) apareció a finales de los años 1970, mucho antes de las redes sociales modernas, y algunos aún funcionan hoy.")
        ),
        BilingualQuestion(
            id = 11434, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Usenet a-t-il été créé?", listOf("1979", "1977", "1981", "1983"), "Technologie", "Usenet a été créé en 1979 par Tom Truscott et Jim Ellis, étudiants à l'université Duke, comme un système de discussion décentralisé."),
            en = LocalizedContent("In what year was Usenet created?", listOf("1979", "1977", "1981", "1983"), "Technology", "Usenet was created in 1979 by Tom Truscott and Jim Ellis, students at Duke University, as a decentralized discussion system."),
            zh = LocalizedContent("Usenet 创建于哪一年？", listOf("1979", "1977", "1981", "1983"), "科技", "Usenet 由杜克大学的学生 Tom Truscott 和 Jim Ellis 于1979年创建，作为一个去中心化的讨论系统。"),
            es = LocalizedContent("¿En qué año se creó Usenet?", listOf("1979", "1977", "1981", "1983"), "Tecnología", "Usenet fue creado en 1979 por Tom Truscott y Jim Ellis, estudiantes de la Universidad de Duke, como un sistema de discusión descentralizado.")
        ),
        BilingualQuestion(
            id = 11435, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de Usenet?", listOf("Tom Truscott et Jim Ellis", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Tom Truscott et Jim Ellis ont inventé Usenet en 1979 comme un système de discussion décentralisé, initialement pour relier les universités Duke et Caroline du Nord."),
            en = LocalizedContent("Who is the creator of Usenet?", listOf("Tom Truscott and Jim Ellis", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Tom Truscott and Jim Ellis invented Usenet in 1979 as a decentralized discussion system, initially to connect Duke and University of North Carolina."),
            zh = LocalizedContent("Usenet 的创建者是谁？", listOf("Tom Truscott 和 Jim Ellis", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "Tom Truscott 和 Jim Ellis 于1979年发明了 Usenet，作为一个去中心化的讨论系统，最初用于连接杜克大学和北卡罗来纳大学。"),
            es = LocalizedContent("¿Quién es el creador de Usenet?", listOf("Tom Truscott y Jim Ellis", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Tom Truscott y Jim Ellis inventaron Usenet en 1979 como un sistema de discusión descentralizado, inicialmente para conectar Duke y la Universidad de Carolina del Norte.")
        ),
        BilingualQuestion(
            id = 11436, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Bulletin Board System a-t-il été créé?", listOf("1978", "1976", "1980", "1982"), "Technologie", "Le premier Bulletin Board System (BBS) a été créé en 1978 par Ward Christensen et Randy Suess à Chicago, permettant aux utilisateurs de partager des fichiers et des messages via une ligne téléphonique."),
            en = LocalizedContent("In what year was the Bulletin Board System created?", listOf("1978", "1976", "1980", "1982"), "Technology", "The first Bulletin Board System (BBS) was created in 1978 by Ward Christensen and Randy Suess in Chicago, allowing users to share files and messages via a telephone line."),
            zh = LocalizedContent("公告板系统创建于哪一年？", listOf("1978", "1976", "1980", "1982"), "科技", "第一个公告板系统（BBS）由 Ward Christensen 和 Randy Suess 于1978年在芝加哥创建，允许用户通过电话线共享文件和消息。"),
            es = LocalizedContent("¿En qué año se creó el Bulletin Board System?", listOf("1978", "1976", "1980", "1982"), "Tecnología", "El primer Bulletin Board System (BBS) fue creado en 1978 por Ward Christensen y Randy Suess en Chicago, permitiendo a los usuarios compartir archivos y mensajes a través de una línea telefónica.")
        ),
        BilingualQuestion(
            id = 11437, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de BBS?", listOf("Ward Christensen et Randy Suess", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Ward Christensen et Randy Suess ont créé le premier Bulletin Board System (BBS) en 1978 à Chicago, permettant aux utilisateurs de partager des messages et fichiers via modem."),
            en = LocalizedContent("Who is the creator of BBS?", listOf("Ward Christensen and Randy Suess", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Ward Christensen and Randy Suess created the first Bulletin Board System (BBS) in 1978 in Chicago, allowing users to share messages and files via modem."),
            zh = LocalizedContent("BBS 的创建者是谁？", listOf("Ward Christensen 和 Randy Suess", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "Ward Christensen 和 Randy Suess 于1978年在芝加哥创建了第一个公告板系统（BBS），允许用户通过调制解调器共享消息和文件。"),
            es = LocalizedContent("¿Quién es el creador de BBS?", listOf("Ward Christensen y Randy Suess", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Ward Christensen y Randy Suess crearon el primer Bulletin Board System (BBS) en 1978 en Chicago, permitiendo a los usuarios compartir mensajes y archivos a través de un módem.")
        ),
        BilingualQuestion(
            id = 11438, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année CompuServe a-t-il été créé?", listOf("1969", "1967", "1971", "1973"), "Technologie", "CompuServe a été fondé en 1969 à Columbus, Ohio, initialement comme service de traitement de données et de partage de temps pour entreprises."),
            en = LocalizedContent("In what year was CompuServe created?", listOf("1969", "1967", "1971", "1973"), "Technology", "CompuServe was founded in 1969 in Columbus, Ohio, initially as a data processing and time-sharing service for businesses."),
            zh = LocalizedContent("CompuServe 创建于哪一年？", listOf("1969", "1967", "1971", "1973"), "科技", "CompuServe 于1969年在俄亥俄州哥伦布市成立，最初作为企业的数据处理和分时服务。"),
            es = LocalizedContent("¿En qué año se creó CompuServe?", listOf("1969", "1967", "1971", "1973"), "Tecnología", "CompuServe fue fundado en 1969 en Columbus, Ohio, inicialmente como un servicio de procesamiento de datos y tiempo compartido para empresas.")
        ),
        BilingualQuestion(
            id = 11439, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année AOL a-t-il été créé?", listOf("1985", "1983", "1987", "1989"), "Technologie", "AOL a été fondé en 1985 sous le nom Quantum Computer Services, avant de devenir America Online en 1991."),
            en = LocalizedContent("In what year was AOL created?", listOf("1985", "1983", "1987", "1989"), "Technology", "AOL was founded in 1985 under the name Quantum Computer Services, before becoming America Online in 1991."),
            zh = LocalizedContent("AOL 创建于哪一年？", listOf("1985", "1983", "1987", "1989"), "科技", "AOL 于1985年以 Quantum Computer Services 的名称成立，之后在1991年更名为 America Online。"),
            es = LocalizedContent("¿En qué año se creó AOL?", listOf("1985", "1983", "1987", "1989"), "Tecnología", "AOL fue fundado en 1985 bajo el nombre Quantum Computer Services, antes de convertirse en America Online en 1991.")
        ),
        BilingualQuestion(
            id = 11440, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé AOL?", listOf("Steve Case et al.", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Steve Case a cofondé America Online en 1985 avec Jim Kimsey et Marc Seriff, en faisant l'un des premiers fournisseurs d'accès à Internet grand public."),
            en = LocalizedContent("Who created AOL?", listOf("Steve Case et al.", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Steve Case co-founded America Online in 1985 with Jim Kimsey and Marc Seriff, making it one of the first consumer Internet access providers."),
            zh = LocalizedContent("谁创建了AOL？", listOf("史蒂夫·凯斯等人", "马克·扎克伯格", "杰克·多尔西", "史蒂夫·乔布斯"), "科技", "史蒂夫·凯斯于1985年与吉姆·金西和马克·塞里夫共同创立了美国在线，使其成为首批面向消费者的互联网接入服务提供商之一。"),
            es = LocalizedContent("¿Quién creó AOL?", listOf("Steve Case y otros", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Steve Case cofundó America Online en 1985 con Jim Kimsey y Marc Seriff, convirtiéndolo en uno de los primeros proveedores de acceso a Internet para consumidores.")
        ),
        BilingualQuestion(
            id = 11441, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Prodigy a-t-il été créé?", listOf("1984", "1982", "1986", "1988"), "Technologie", "Prodigy, l'un des premiers fournisseurs de services en ligne, a été lancé en 1984 comme un service de téléachat et d'information."),
            en = LocalizedContent("In what year was Prodigy created?", listOf("1984", "1982", "1986", "1988"), "Technology", "Prodigy, one of the first online service providers, was launched in 1984 as a teleshopping and information service."),
            zh = LocalizedContent("Prodigy是哪一年创建的？", listOf("1984", "1982", "1986", "1988"), "科技", "Prodigy是最早的在线服务提供商之一，于1984年作为远程购物和信息服务推出。"),
            es = LocalizedContent("¿En qué año se creó Prodigy?", listOf("1984", "1982", "1986", "1988"), "Tecnología", "Prodigy, uno de los primeros proveedores de servicios en línea, se lanzó en 1984 como un servicio de teletienda e información.")
        ),
        BilingualQuestion(
            id = 11442, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Minitel a-t-il été créé?", listOf("1978", "1976", "1980", "1982"), "Technologie", "Le Minitel a été lancé en 1978 par les PTT (ancêtre de France Telecom) pour moderniser l'annuaire téléphonique français. Ce service en ligne a connu un succès massif dans les années 1980-1990 avant d'être supprimé en 2012."),
            en = LocalizedContent("In what year was Minitel created?", listOf("1978", "1976", "1980", "1982"), "Technology", "Minitel was launched in 1978 by the PTT (predecessor of France Telecom) to modernize the French telephone directory. This online service was massively successful in the 1980s-1990s before being shut down in 2012."),
            zh = LocalizedContent("Minitel是哪一年创建的？", listOf("1978", "1976", "1980", "1982"), "科技", "Minitel于1978年由PTT（法国电信的前身）推出，旨在现代化法国电话簿。这项在线服务在1980-1990年代取得了巨大成功，直到2012年被关闭。"),
            es = LocalizedContent("¿En qué año se creó Minitel?", listOf("1978", "1976", "1980", "1982"), "Tecnología", "Minitel fue lanzado en 1978 por la PTT (predecesora de France Telecom) para modernizar la guía telefónica francesa. Este servicio en línea tuvo un éxito masivo en las décadas de 1980-1990 antes de ser descontinuado en 2012.")
        ),
        BilingualQuestion(
            id = 11443, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Videotext a-t-il été créé?", listOf("1974", "1972", "1976", "1978"), "Technologie", "Videotext, un système précurseur du Minitel, a été développé par le Royaume-Uni en 1974 pour transmettre des informations textuelles sur écran de télévision."),
            en = LocalizedContent("In what year was Videotext created?", listOf("1974", "1972", "1976", "1978"), "Technology", "Videotext, a precursor system to Minitel, was developed by the United Kingdom in 1974 to transmit textual information on television screens."),
            zh = LocalizedContent("Videotext是哪一年创建的？", listOf("1974", "1972", "1976", "1978"), "科技", "Videotext是Minitel的前身系统，由英国于1974年开发，用于在电视屏幕上传输文本信息。"),
            es = LocalizedContent("¿En qué año se creó Videotext?", listOf("1974", "1972", "1976", "1978"), "Tecnología", "Videotext, un sistema precursor del Minitel, fue desarrollado por el Reino Unido en 1974 para transmitir información textual en pantallas de televisión.")
        ),
        BilingualQuestion(
            id = 11444, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier webmail?", listOf("Hotmail", "Gmail", "Yahoo Mail", "AOL Mail"), "Technologie", "Hotmail, lancé en 1996 par Sabeer Bhatia et Jack Smith, est considéré comme le premier service de messagerie web accessible via un navigateur."),
            en = LocalizedContent("What is the first webmail?", listOf("Hotmail", "Gmail", "Yahoo Mail", "AOL Mail"), "Technology", "Hotmail, launched in 1996 by Sabeer Bhatia and Jack Smith, is considered the first web-based email service accessible via a browser."),
            zh = LocalizedContent("第一个网络邮件是什么？", listOf("Hotmail", "Gmail", "Yahoo Mail", "AOL Mail"), "科技", "Hotmail由Sabeer Bhatia和Jack Smith于1996年推出，被认为是第一个通过浏览器访问的基于网络的电子邮件服务。"),
            es = LocalizedContent("¿Cuál es el primer webmail?", listOf("Hotmail", "Gmail", "Yahoo Mail", "AOL Mail"), "Tecnología", "Hotmail, lanzado en 1996 por Sabeer Bhatia y Jack Smith, es considerado el primer servicio de correo electrónico basado en web accesible a través de un navegador.")
        ),
        BilingualQuestion(
            id = 11445, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Hotmail a-t-il été créé?", listOf("1997", "1995", "1999", "2001"), "Technologie", "Hotmail a été fondé par Sabeer Bhatia et Jack Smith en 1996 et lancé publiquement le 4 juillet 1996, mais l'année de création officielle retenue est 1997, date à laquelle Microsoft l'a racheté."),
            en = LocalizedContent("In what year was Hotmail created?", listOf("1997", "1995", "1999", "2001"), "Technology", "Hotmail was founded by Sabeer Bhatia and Jack Smith in 1996 and publicly launched on July 4, 1996, but the official creation year is considered 1997, when Microsoft acquired it."),
            zh = LocalizedContent("Hotmail是哪一年创建的？", listOf("1997", "1995", "1999", "2001"), "科技", "Hotmail由Sabeer Bhatia和Jack Smith于1996年创立，并于1996年7月4日公开推出，但官方认定的创建年份是1997年，当时微软收购了它。"),
            es = LocalizedContent("¿En qué año se creó Hotmail?", listOf("1997", "1995", "1999", "2001"), "Tecnología", "Hotmail fue fundado por Sabeer Bhatia y Jack Smith en 1996 y lanzado públicamente el 4 de julio de 1996, pero el año oficial de creación se considera 1997, cuando Microsoft lo adquirió.")
        ),
        BilingualQuestion(
            id = 11446, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Hotmail?", listOf("Sabeer Bhatia et Jack Smith", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Hotmail a été fondé en 1996 par les programmeurs Sabeer Bhatia et Jack Smith, qui ont eu l'idée d'un service de messagerie accessible via le web."),
            en = LocalizedContent("Who created Hotmail?", listOf("Sabeer Bhatia and Jack Smith", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Hotmail was founded in 1996 by programmers Sabeer Bhatia and Jack Smith, who had the idea of an email service accessible via the web."),
            zh = LocalizedContent("谁创建了Hotmail？", listOf("Sabeer Bhatia和Jack Smith", "马克·扎克伯格", "杰克·多尔西", "史蒂夫·乔布斯"), "科技", "Hotmail由程序员Sabeer Bhatia和Jack Smith于1996年创立，他们提出了通过网页访问电子邮件服务的想法。"),
            es = LocalizedContent("¿Quién creó Hotmail?", listOf("Sabeer Bhatia y Jack Smith", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Hotmail fue fundado en 1996 por los programadores Sabeer Bhatia y Jack Smith, quienes tuvieron la idea de un servicio de correo electrónico accesible a través de la web.")
        ),
        BilingualQuestion(
            id = 11447, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Gmail a-t-il été créé?", listOf("2004", "2002", "2006", "2008"), "Technologie", "Gmail a été lancé par Google le 1er avril 2004, initialement en version bêta avec une capacité de stockage de 1 Go, ce qui était révolutionnaire à l'époque."),
            en = LocalizedContent("In what year was Gmail created?", listOf("2004", "2002", "2006", "2008"), "Technology", "Gmail was launched by Google on April 1, 2004, initially in beta with 1 GB of storage, which was revolutionary at the time."),
            zh = LocalizedContent("Gmail是哪一年创建的？", listOf("2004", "2002", "2006", "2008"), "科技", "Gmail由谷歌于2004年4月1日推出，最初为测试版，提供1GB存储空间，这在当时是革命性的。"),
            es = LocalizedContent("¿En qué año se creó Gmail?", listOf("2004", "2002", "2006", "2008"), "Tecnología", "Gmail fue lanzado por Google el 1 de abril de 2004, inicialmente en versión beta con 1 GB de almacenamiento, lo que fue revolucionario en ese momento.")
        ),
        BilingualQuestion(
            id = 11448, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Gmail?", listOf("Google", "Microsoft", "Yahoo", "Apple"), "Technologie", "Gmail a été développé par Paul Buchheit, un ingénieur de Google, et lancé en 2004."),
            en = LocalizedContent("Who created Gmail?", listOf("Google", "Microsoft", "Yahoo", "Apple"), "Technology", "Gmail was developed by Paul Buchheit, a Google engineer, and launched in 2004."),
            zh = LocalizedContent("谁创建了Gmail？", listOf("谷歌", "微软", "雅虎", "苹果"), "科技", "Gmail由谷歌工程师保罗·布赫海特开发，并于2004年推出。"),
            es = LocalizedContent("¿Quién creó Gmail?", listOf("Google", "Microsoft", "Yahoo", "Apple"), "Tecnología", "Gmail fue desarrollado por Paul Buchheit, un ingeniero de Google, y lanzado en 2004.")
        ),
        BilingualQuestion(
            id = 11449, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Yahoo Mail a-t-il été créé?", listOf("1997", "1995", "1999", "2001"), "Technologie", "Yahoo Mail a été lancé en 1997, devenant l'un des premiers services de messagerie web gratuits et populaires, concurrençant Hotmail lancé l'année précédente."),
            en = LocalizedContent("In what year was Yahoo Mail created?", listOf("1997", "1995", "1999", "2001"), "Technology", "Yahoo Mail was launched in 1997, becoming one of the first free and popular webmail services, competing with Hotmail launched the previous year."),
            zh = LocalizedContent("Yahoo Mail是哪一年创建的？", listOf("1997", "1995", "1999", "2001"), "科技", "Yahoo Mail于1997年推出，成为最早免费且流行的网络邮件服务之一，与上一年推出的Hotmail竞争。"),
            es = LocalizedContent("¿En qué año se creó Yahoo Mail?", listOf("1997", "1995", "1999", "2001"), "Tecnología", "Yahoo Mail se lanzó en 1997, convirtiéndose en uno de los primeros servicios de correo web gratuitos y populares, compitiendo con Hotmail lanzado el año anterior.")
        ),
        BilingualQuestion(
            id = 11450, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Outlook a-t-il été créé?", listOf("1997", "1995", "1999", "2001"), "Technologie", "Outlook a été lancé en 1997 dans le cadre de la suite Microsoft Office 97, succédant à Microsoft Mail et Schedule+."),
            en = LocalizedContent("In what year was Outlook created?", listOf("1997", "1995", "1999", "2001"), "Technology", "Outlook was launched in 1997 as part of the Microsoft Office 97 suite, succeeding Microsoft Mail and Schedule+."),
            zh = LocalizedContent("Outlook是哪一年创建的？", listOf("1997", "1995", "1999", "2001"), "科技", "Outlook于1997年作为Microsoft Office 97套件的一部分发布，取代了Microsoft Mail和Schedule+。"),
            es = LocalizedContent("¿En qué año se creó Outlook?", listOf("1997", "1995", "1999", "2001"), "Tecnología", "Outlook se lanzó en 1997 como parte de la suite Microsoft Office 97, sucediendo a Microsoft Mail y Schedule+.")
        ),
        BilingualQuestion(
            id = 11451, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le protocole SSL a-t-il été créé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "Le protocole SSL (Secure Sockets Layer) a été développé par Netscape en 1994 pour sécuriser les communications sur Internet, notamment pour les transactions en ligne."),
            en = LocalizedContent("In what year was the SSL protocol created?", listOf("1994", "1992", "1996", "1998"), "Technology", "The SSL (Secure Sockets Layer) protocol was developed by Netscape in 1994 to secure communications on the Internet, especially for online transactions."),
            zh = LocalizedContent("SSL协议是哪一年创建的？", listOf("1994", "1992", "1996", "1998"), "科技", "SSL（安全套接层）协议由Netscape于1994年开发，用于保护互联网通信，特别是在线交易。"),
            es = LocalizedContent("¿En qué año se creó el protocolo SSL?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "El protocolo SSL (Secure Sockets Layer) fue desarrollado por Netscape en 1994 para asegurar las comunicaciones en Internet, especialmente para transacciones en línea.")
        ),
        BilingualQuestion(
            id = 11452, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année HTTPS a-t-il été standardisé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "HTTPS a été standardisé en 1994 par Netscape Communications pour sécuriser les transactions web, intégrant le protocole SSL dans les communications HTTP."),
            en = LocalizedContent("In what year was HTTPS standardized?", listOf("1994", "1992", "1996", "1998"), "Technology", "HTTPS was standardized in 1994 by Netscape Communications to secure web transactions, integrating the SSL protocol into HTTP communications."),
            zh = LocalizedContent("HTTPS是哪一年标准化的？", listOf("1994", "1992", "1996", "1998"), "科技", "HTTPS于1994年由Netscape Communications标准化，用于保护网络交易，将SSL协议集成到HTTP通信中。"),
            es = LocalizedContent("¿En qué año se estandarizó HTTPS?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "HTTPS fue estandarizado en 1994 por Netscape Communications para asegurar las transacciones web, integrando el protocolo SSL en las comunicaciones HTTP.")
        ),
        BilingualQuestion(
            id = 11453, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier navigateur graphique?", listOf("Mosaic", "Netscape", "Internet Explorer", "Opera"), "Technologie", "Développé en 1993 au NCSA, Mosaic a popularisé l'affichage d'images et de texte sur le web, devenant le premier navigateur graphique grand public."),
            en = LocalizedContent("What is the first graphical browser?", listOf("Mosaic", "Netscape", "Internet Explorer", "Opera"), "Technology", "Developed in 1993 at NCSA, Mosaic popularized the display of images and text on the web, becoming the first graphical browser for the general public."),
            zh = LocalizedContent("第一个图形化浏览器是什么？", listOf("Mosaic", "Netscape", "Internet Explorer", "Opera"), "科技", "Mosaic于1993年在NCSA开发，普及了网页上的图像和文本显示，成为第一个面向大众的图形化浏览器。"),
            es = LocalizedContent("¿Cuál es el primer navegador gráfico?", listOf("Mosaic", "Netscape", "Internet Explorer", "Opera"), "Tecnología", "Desarrollado en 1993 en el NCSA, Mosaic popularizó la visualización de imágenes y texto en la web, convirtiéndose en el primer navegador gráfico para el público general.")
        ),
        BilingualQuestion(
            id = 11454, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Mosaic a-t-il été créé?", listOf("1993", "1991", "1995", "1997"), "Technologie", "Mosaic, développé au National Center for Supercomputing Applications, a été lancé en 1993 et est considéré comme le premier navigateur web à populariser l'interface graphique pour le grand public."),
            en = LocalizedContent("In what year was Mosaic created?", listOf("1993", "1991", "1995", "1997"), "Technology", "Mosaic, developed at the National Center for Supercomputing Applications, was launched in 1993 and is considered the first web browser to popularize the graphical interface for the general public."),
            zh = LocalizedContent("Mosaic是哪一年创建的？", listOf("1993", "1991", "1995", "1997"), "科技", "Mosaic由美国国家超级计算应用中心开发，于1993年发布，被认为是第一个向大众普及图形界面的网络浏览器。"),
            es = LocalizedContent("¿En qué año se creó Mosaic?", listOf("1993", "1991", "1995", "1997"), "Tecnología", "Mosaic, desarrollado en el Centro Nacional de Aplicaciones de Supercomputación, fue lanzado en 1993 y se considera el primer navegador web en popularizar la interfaz gráfica para el público general.")
        ),
        BilingualQuestion(
            id = 11455, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Mosaic?", listOf("Marc Andreessen et al.", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Marc Andreessen a codirigé le développement de Mosaic, le premier navigateur web grand public, à l'Université de l'Illinois en 1993."),
            en = LocalizedContent("Who created Mosaic?", listOf("Marc Andreessen et al.", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Marc Andreessen co-led the development of Mosaic, the first widely-used web browser, at the University of Illinois in 1993."),
            zh = LocalizedContent("谁创建了Mosaic？", listOf("马克·安德森等人", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "马克·安德森于1993年在伊利诺伊大学共同领导了Mosaic的开发，这是第一个广泛使用的网络浏览器。"),
            es = LocalizedContent("¿Quién creó Mosaic?", listOf("Marc Andreessen y otros", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Marc Andreessen codirigió el desarrollo de Mosaic, el primer navegador web ampliamente utilizado, en la Universidad de Illinois en 1993.")
        ),
        BilingualQuestion(
            id = 11456, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Netscape a-t-il été créé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "Netscape Communications Corporation a été fondée en avril 1994 par Marc Andreessen et Jim Clark, lançant le navigateur Netscape Navigator qui a popularisé le web."),
            en = LocalizedContent("In what year was Netscape created?", listOf("1994", "1992", "1996", "1998"), "Technology", "Netscape Communications Corporation was founded in April 1994 by Marc Andreessen and Jim Clark, launching the Netscape Navigator browser that popularized the web."),
            zh = LocalizedContent("Netscape是哪一年创建的？", listOf("1994", "1992", "1996", "1998"), "科技", "Netscape通信公司由马克·安德森和吉姆·克拉克于1994年4月创立，推出了普及网络的Netscape Navigator浏览器。"),
            es = LocalizedContent("¿En qué año se creó Netscape?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "Netscape Communications Corporation fue fundada en abril de 1994 por Marc Andreessen y Jim Clark, lanzando el navegador Netscape Navigator que popularizó la web.")
        ),
        BilingualQuestion(
            id = 11457, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Internet Explorer a-t-il été lancé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "Internet Explorer a été lancé par Microsoft en 1995 dans le cadre du complément Internet pour Windows 95."),
            en = LocalizedContent("In what year was Internet Explorer launched?", listOf("1995", "1993", "1997", "1999"), "Technology", "Internet Explorer was launched by Microsoft in 1995 as part of the Internet add-on for Windows 95."),
            zh = LocalizedContent("Internet Explorer是哪一年发布的？", listOf("1995", "1993", "1997", "1999"), "科技", "Internet Explorer由微软于1995年作为Windows 95的Internet附加组件发布。"),
            es = LocalizedContent("¿En qué año se lanzó Internet Explorer?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "Internet Explorer fue lanzado por Microsoft en 1995 como parte del complemento de Internet para Windows 95.")
        ),
        BilingualQuestion(
            id = 11458, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Opera a-t-il été créé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "Opera a été fondé en 1995 par une équipe de chercheurs norvégiens, initialement comme un projet de recherche universitaire. Le navigateur a été lancé publiquement en 1996."),
            en = LocalizedContent("In what year was Opera created?", listOf("1995", "1993", "1997", "1999"), "Technology", "Opera was founded in 1995 by a team of Norwegian researchers, initially as a university research project. The browser was publicly launched in 1996."),
            zh = LocalizedContent("Opera是哪一年创建的？", listOf("1995", "1993", "1997", "1999"), "科技", "Opera由一群挪威研究人员于1995年创立，最初是一个大学研究项目。该浏览器于1996年公开发布。"),
            es = LocalizedContent("¿En qué año se creó Opera?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "Opera fue fundado en 1995 por un equipo de investigadores noruegos, inicialmente como un proyecto de investigación universitario. El navegador se lanzó públicamente en 1996.")
        ),
        BilingualQuestion(
            id = 11459, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Firefox a-t-il été créé?", listOf("2004", "2002", "2006", "2008"), "Technologie", "Firefox, initialement nommé Phoenix, a été lancé en 2004 par la Fondation Mozilla comme successeur du navigateur Mozilla Suite."),
            en = LocalizedContent("In what year was Firefox created?", listOf("2004", "2002", "2006", "2008"), "Technology", "Firefox, initially named Phoenix, was launched in 2004 by the Mozilla Foundation as the successor to the Mozilla Suite browser."),
            zh = LocalizedContent("Firefox是哪一年创建的？", listOf("2004", "2002", "2006", "2008"), "科技", "Firefox最初名为Phoenix，由Mozilla基金会于2004年发布，作为Mozilla Suite浏览器的继任者。"),
            es = LocalizedContent("¿En qué año se creó Firefox?", listOf("2004", "2002", "2006", "2008"), "Tecnología", "Firefox, inicialmente llamado Phoenix, fue lanzado en 2004 por la Fundación Mozilla como sucesor del navegador Mozilla Suite.")
        ),
        BilingualQuestion(
            id = 11460, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Chrome a-t-il été créé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Google a lancé le navigateur Chrome en septembre 2008, principalement pour concurrencer Internet Explorer et Firefox."),
            en = LocalizedContent("In what year was Chrome created?", listOf("2008", "2006", "2010", "2012"), "Technology", "Google launched the Chrome browser in September 2008, mainly to compete with Internet Explorer and Firefox."),
            zh = LocalizedContent("Chrome 是哪一年创建的？", listOf("2008", "2006", "2010", "2012"), "科技", "谷歌于 2008 年 9 月推出了 Chrome 浏览器，主要是为了与 Internet Explorer 和 Firefox 竞争。"),
            es = LocalizedContent("¿En qué año se creó Chrome?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "Google lanzó el navegador Chrome en septiembre de 2008, principalmente para competir con Internet Explorer y Firefox.")
        ),
        BilingualQuestion(
            id = 11461, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Safari a-t-il été créé?", listOf("2003", "2001", "2005", "2007"), "Technologie", "Safari a été lancé par Apple en 2003 comme navigateur par défaut pour Mac OS X Jaguar. Il a succédé à Internet Explorer pour Mac."),
            en = LocalizedContent("In what year was Safari created?", listOf("2003", "2001", "2005", "2007"), "Technology", "Safari was launched by Apple in 2003 as the default browser for Mac OS X Jaguar. It succeeded Internet Explorer for Mac."),
            zh = LocalizedContent("Safari 是哪一年创建的？", listOf("2003", "2001", "2005", "2007"), "科技", "苹果于 2003 年推出了 Safari，作为 Mac OS X Jaguar 的默认浏览器，取代了 Mac 版 Internet Explorer。"),
            es = LocalizedContent("¿En qué año se creó Safari?", listOf("2003", "2001", "2005", "2007"), "Tecnología", "Safari fue lanzado por Apple en 2003 como el navegador predeterminado para Mac OS X Jaguar. Sucedió a Internet Explorer para Mac.")
        ),
        BilingualQuestion(
            id = 11462, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Edge a-t-il été créé?", listOf("2015", "2013", "2017", "2019"), "Technologie", "Microsoft Edge a été lancé en 2015 en tant que successeur d'Internet Explorer, avec Windows 10."),
            en = LocalizedContent("In what year was Edge created?", listOf("2015", "2013", "2017", "2019"), "Technology", "Microsoft Edge was launched in 2015 as the successor to Internet Explorer, with Windows 10."),
            zh = LocalizedContent("Edge 是哪一年创建的？", listOf("2015", "2013", "2017", "2019"), "科技", "微软 Edge 于 2015 年随 Windows 10 推出，作为 Internet Explorer 的继任者。"),
            es = LocalizedContent("¿En qué año se creó Edge?", listOf("2015", "2013", "2017", "2019"), "Tecnología", "Microsoft Edge se lanzó en 2015 como sucesor de Internet Explorer, con Windows 10.")
        ),
        BilingualQuestion(
            id = 11463, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier langage de balisage?", listOf("SGML", "HTML", "XML", "XHTML"), "Technologie", "SGML (Standard Generalized Markup Language) a été développé dans les années 1980 et normalisé en 1986, servant de métalangage pour définir d'autres langages de balisage, dont HTML et XML."),
            en = LocalizedContent("What is the first markup language?", listOf("SGML", "HTML", "XML", "XHTML"), "Technology", "SGML (Standard Generalized Markup Language) was developed in the 1980s and standardized in 1986, serving as a metalanguage to define other markup languages, including HTML and XML."),
            zh = LocalizedContent("第一种标记语言是什么？", listOf("SGML", "HTML", "XML", "XHTML"), "科技", "SGML（标准通用标记语言）于 20 世纪 80 年代开发，1986 年标准化，作为定义其他标记语言（包括 HTML 和 XML）的元语言。"),
            es = LocalizedContent("¿Cuál es el primer lenguaje de marcado?", listOf("SGML", "HTML", "XML", "XHTML"), "Tecnología", "SGML (Lenguaje de Marcado Generalizado Estándar) se desarrolló en la década de 1980 y se estandarizó en 1986, sirviendo como metalenguaje para definir otros lenguajes de marcado, incluidos HTML y XML.")
        ),
        BilingualQuestion(
            id = 11464, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année SGML a-t-il été créé?", listOf("1986", "1984", "1988", "1990"), "Technologie", "SGML (Standard Generalized Markup Language) a été normalisé en 1986 par l'Organisation internationale de normalisation (ISO). Ce langage a servi de base au développement du HTML et du XML."),
            en = LocalizedContent("In what year was SGML created?", listOf("1986", "1984", "1988", "1990"), "Technology", "SGML (Standard Generalized Markup Language) was standardized in 1986 by the International Organization for Standardization (ISO). This language served as the basis for the development of HTML and XML."),
            zh = LocalizedContent("SGML 是哪一年创建的？", listOf("1986", "1984", "1988", "1990"), "科技", "SGML（标准通用标记语言）于 1986 年由国际标准化组织（ISO）标准化。该语言是 HTML 和 XML 开发的基础。"),
            es = LocalizedContent("¿En qué año se creó SGML?", listOf("1986", "1984", "1988", "1990"), "Tecnología", "SGML (Lenguaje de Marcado Generalizado Estándar) fue estandarizado en 1986 por la Organización Internacional de Normalización (ISO). Este lenguaje sirvió como base para el desarrollo de HTML y XML.")
        ),
        BilingualQuestion(
            id = 11465, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année HTML a-t-il été créé?", listOf("1993", "1991", "1995", "1997"), "Technologie", "HTML a été créé en 1993 par Tim Berners-Lee, qui a publié la première spécification du langage de balisage pour le World Wide Web."),
            en = LocalizedContent("In what year was HTML created?", listOf("1993", "1991", "1995", "1997"), "Technology", "HTML was created in 1993 by Tim Berners-Lee, who published the first specification of the markup language for the World Wide Web."),
            zh = LocalizedContent("HTML 是哪一年创建的？", listOf("1993", "1991", "1995", "1997"), "科技", "HTML 由蒂姆·伯纳斯-李于 1993 年创建，他发布了万维网标记语言的第一个规范。"),
            es = LocalizedContent("¿En qué año se creó HTML?", listOf("1993", "1991", "1995", "1997"), "Tecnología", "HTML fue creado en 1993 por Tim Berners-Lee, quien publicó la primera especificación del lenguaje de marcado para la World Wide Web.")
        ),
        BilingualQuestion(
            id = 11466, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année XML a-t-il été créé?", listOf("1998", "1996", "2000", "2002"), "Technologie", "XML a été publié comme recommandation par le W3C en février 1998, conçu pour structurer et échanger des données de manière flexible sur le web."),
            en = LocalizedContent("In what year was XML created?", listOf("1998", "1996", "2000", "2002"), "Technology", "XML was published as a W3C recommendation in February 1998, designed to structure and exchange data flexibly on the web."),
            zh = LocalizedContent("XML 是哪一年创建的？", listOf("1998", "1996", "2000", "2002"), "科技", "XML 于 1998 年 2 月作为 W3C 推荐标准发布，旨在灵活地结构化和交换网络数据。"),
            es = LocalizedContent("¿En qué año se creó XML?", listOf("1998", "1996", "2000", "2002"), "Tecnología", "XML se publicó como recomendación del W3C en febrero de 1998, diseñado para estructurar e intercambiar datos de manera flexible en la web.")
        ),
        BilingualQuestion(
            id = 11467, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année CSS a-t-il été créé?", listOf("1996", "1994", "1998", "2000"), "Technologie", "CSS a été proposé par Håkon Wium Lie en octobre 1994, mais la première recommandation officielle du W3C, CSS1, a été publiée en décembre 1996."),
            en = LocalizedContent("In what year was CSS created?", listOf("1996", "1994", "1998", "2000"), "Technology", "CSS was proposed by Håkon Wium Lie in October 1994, but the first official W3C recommendation, CSS1, was published in December 1996."),
            zh = LocalizedContent("CSS 是哪一年创建的？", listOf("1996", "1994", "1998", "2000"), "科技", "CSS 由 Håkon Wium Lie 于 1994 年 10 月提出，但第一个官方 W3C 推荐标准 CSS1 于 1996 年 12 月发布。"),
            es = LocalizedContent("¿En qué año se creó CSS?", listOf("1996", "1994", "1998", "2000"), "Tecnología", "CSS fue propuesto por Håkon Wium Lie en octubre de 1994, pero la primera recomendación oficial del W3C, CSS1, se publicó en diciembre de 1996.")
        ),
        BilingualQuestion(
            id = 11468, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé CSS?", listOf("Håkon Wium Lie", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Technologie", "Håkon Wium Lie a proposé les feuilles de style en cascade (CSS) en 1994 alors qu'il travaillait au CERN, afin de séparer le contenu HTML de la présentation visuelle des pages web."),
            en = LocalizedContent("Who created CSS?", listOf("Håkon Wium Lie", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Technology", "Håkon Wium Lie proposed Cascading Style Sheets (CSS) in 1994 while working at CERN, to separate HTML content from the visual presentation of web pages."),
            zh = LocalizedContent("谁创建了 CSS？", listOf("Håkon Wium Lie", "蒂姆·伯纳斯-李", "马克·扎克伯格", "杰克·多西"), "科技", "Håkon Wium Lie 于 1994 年在 CERN 工作时提出了层叠样式表（CSS），旨在将 HTML 内容与网页的视觉呈现分离。"),
            es = LocalizedContent("¿Quién creó CSS?", listOf("Håkon Wium Lie", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Tecnología", "Håkon Wium Lie propuso las Hojas de Estilo en Cascada (CSS) en 1994 mientras trabajaba en el CERN, para separar el contenido HTML de la presentación visual de las páginas web.")
        ),
        BilingualQuestion(
            id = 11469, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année SVG a-t-il été créé?", listOf("2001", "1999", "2003", "2005"), "Technologie", "Le format SVG (Scalable Vector Graphics) a été développé par le World Wide Web Consortium (W3C) et sa première version recommandée a été publiée en 2001."),
            en = LocalizedContent("In what year was SVG created?", listOf("2001", "1999", "2003", "2005"), "Technology", "The SVG (Scalable Vector Graphics) format was developed by the World Wide Web Consortium (W3C) and its first recommended version was published in 2001."),
            zh = LocalizedContent("SVG 是哪一年创建的？", listOf("2001", "1999", "2003", "2005"), "科技", "SVG（可缩放矢量图形）格式由万维网联盟（W3C）开发，其第一个推荐版本于 2001 年发布。"),
            es = LocalizedContent("¿En qué año se creó SVG?", listOf("2001", "1999", "2003", "2005"), "Tecnología", "El formato SVG (Gráficos Vectoriales Escalables) fue desarrollado por el World Wide Web Consortium (W3C) y su primera versión recomendada se publicó en 2001.")
        ),
        BilingualQuestion(
            id = 11470, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année JSON a-t-il été créé?", listOf("2002", "2000", "2004", "2006"), "Technologie", "JSON a été créé en 2002 par Douglas Crockford pour simplifier l'échange de données entre serveurs et applications web, en alternative plus légère à XML."),
            en = LocalizedContent("In what year was JSON created?", listOf("2002", "2000", "2004", "2006"), "Technology", "JSON was created in 2002 by Douglas Crockford to simplify data exchange between servers and web applications, as a lighter alternative to XML."),
            zh = LocalizedContent("JSON 是在哪一年创建的？", listOf("2002", "2000", "2004", "2006"), "科技", "JSON 由 Douglas Crockford 于 2002 年创建，旨在简化服务器与 Web 应用程序之间的数据交换，作为 XML 的更轻量级替代方案。"),
            es = LocalizedContent("¿En qué año se creó JSON?", listOf("2002", "2000", "2004", "2006"), "Tecnología", "JSON fue creado en 2002 por Douglas Crockford para simplificar el intercambio de datos entre servidores y aplicaciones web, como una alternativa más ligera a XML.")
        ),
        BilingualQuestion(
            id = 11471, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé JSON?", listOf("Douglas Crockford", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Technologie", "Douglas Crockford a popularisé et spécifié le format JSON au début des années 2000, en s'inspirant de la notation des objets en JavaScript. Il en a fait un standard léger d'échange de données."),
            en = LocalizedContent("Who created JSON?", listOf("Douglas Crockford", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Technology", "Douglas Crockford popularized and specified the JSON format in the early 2000s, inspired by JavaScript object notation. He made it a lightweight data interchange standard."),
            zh = LocalizedContent("谁创建了 JSON？", listOf("Douglas Crockford", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "科技", "Douglas Crockford 在 21 世纪初推广并规范了 JSON 格式，灵感来自 JavaScript 对象表示法。他使其成为一种轻量级的数据交换标准。"),
            es = LocalizedContent("¿Quién creó JSON?", listOf("Douglas Crockford", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Tecnología", "Douglas Crockford popularizó y especificó el formato JSON a principios de los 2000, inspirándose en la notación de objetos de JavaScript. Lo convirtió en un estándar ligero de intercambio de datos.")
        ),
        BilingualQuestion(
            id = 11472, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année YAML a-t-il été créé?", listOf("2001", "1999", "2003", "2005"), "Technologie", "YAML a été créé en 2001 par Clark Evans, avec la première version publiée cette année-là. Ce format de sérialisation de données a été conçu pour être lisible par les humains."),
            en = LocalizedContent("In what year was YAML created?", listOf("2001", "1999", "2003", "2005"), "Technology", "YAML was created in 2001 by Clark Evans, with the first version released that year. This data serialization format was designed to be human-readable."),
            zh = LocalizedContent("YAML 是在哪一年创建的？", listOf("2001", "1999", "2003", "2005"), "科技", "YAML 由 Clark Evans 于 2001 年创建，同年发布了第一个版本。这种数据序列化格式旨在便于人类阅读。"),
            es = LocalizedContent("¿En qué año se creó YAML?", listOf("2001", "1999", "2003", "2005"), "Tecnología", "YAML fue creado en 2001 por Clark Evans, con la primera versión publicada ese año. Este formato de serialización de datos fue diseñado para ser legible por humanos.")
        ),
        BilingualQuestion(
            id = 11473, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Protocol Buffers a-t-il été créé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Protocol Buffers a été créé par Google en 2008 pour remplacer XML comme format de sérialisation de données plus efficace et plus rapide."),
            en = LocalizedContent("In what year was Protocol Buffers created?", listOf("2008", "2006", "2010", "2012"), "Technology", "Protocol Buffers was created by Google in 2008 to replace XML as a more efficient and faster data serialization format."),
            zh = LocalizedContent("Protocol Buffers 是在哪一年创建的？", listOf("2008", "2006", "2010", "2012"), "科技", "Protocol Buffers 由 Google 于 2008 年创建，旨在取代 XML，成为一种更高效、更快速的数据序列化格式。"),
            es = LocalizedContent("¿En qué año se creó Protocol Buffers?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "Protocol Buffers fue creado por Google en 2008 para reemplazar XML como un formato de serialización de datos más eficiente y rápido.")
        ),
        BilingualQuestion(
            id = 11474, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Protocol Buffers?", listOf("Google", "Facebook", "Amazon", "Microsoft"), "Technologie", "Protocol Buffers ont été développés par Google pour remplacer XML dans la sérialisation de données structurées, offrant une solution plus rapide et plus compacte."),
            en = LocalizedContent("Who created Protocol Buffers?", listOf("Google", "Facebook", "Amazon", "Microsoft"), "Technology", "Protocol Buffers were developed by Google to replace XML in serializing structured data, offering a faster and more compact solution."),
            zh = LocalizedContent("谁创建了 Protocol Buffers？", listOf("Google", "Facebook", "Amazon", "Microsoft"), "科技", "Protocol Buffers 由 Google 开发，用于取代 XML 进行结构化数据的序列化，提供更快、更紧凑的解决方案。"),
            es = LocalizedContent("¿Quién creó Protocol Buffers?", listOf("Google", "Facebook", "Amazon", "Microsoft"), "Tecnología", "Protocol Buffers fueron desarrollados por Google para reemplazar XML en la serialización de datos estructurados, ofreciendo una solución más rápida y compacta.")
        ),
        BilingualQuestion(
            id = 11475, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année ASN.1 a-t-il été créé?", listOf("1984", "1982", "1986", "1988"), "Technologie", "ASN.1 a été créé en 1984 par le CCITT (aujourd'hui ITU-T) pour standardiser la description de données structurées dans les télécommunications."),
            en = LocalizedContent("In what year was ASN.1 created?", listOf("1984", "1982", "1986", "1988"), "Technology", "ASN.1 was created in 1984 by the CCITT (now ITU-T) to standardize the description of structured data in telecommunications."),
            zh = LocalizedContent("ASN.1 是在哪一年创建的？", listOf("1984", "1982", "1986", "1988"), "科技", "ASN.1 由 CCITT（现 ITU-T）于 1984 年创建，用于标准化电信中结构化数据的描述。"),
            es = LocalizedContent("¿En qué año se creó ASN.1?", listOf("1984", "1982", "1986", "1988"), "Tecnología", "ASN.1 fue creado en 1984 por el CCITT (ahora UIT-T) para estandarizar la descripción de datos estructurados en telecomunicaciones.")
        ),
        BilingualQuestion(
            id = 11476, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année REST a-t-il été introduit?", listOf("2000", "1998", "2002", "2004"), "Technologie", "REST a été introduit par Roy Fielding dans sa thèse de doctorat en 2000, définissant les principes architecturaux pour les services web."),
            en = LocalizedContent("In what year was REST introduced?", listOf("2000", "1998", "2002", "2004"), "Technology", "REST was introduced by Roy Fielding in his doctoral dissertation in 2000, defining architectural principles for web services."),
            zh = LocalizedContent("REST 是在哪一年引入的？", listOf("2000", "1998", "2002", "2004"), "科技", "REST 由 Roy Fielding 在其 2000 年的博士论文中引入，定义了 Web 服务的架构原则。"),
            es = LocalizedContent("¿En qué año se introdujo REST?", listOf("2000", "1998", "2002", "2004"), "Tecnología", "REST fue introducido por Roy Fielding en su tesis doctoral en 2000, definiendo principios arquitectónicos para servicios web.")
        ),
        BilingualQuestion(
            id = 11477, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a introduit REST?", listOf("Roy Thomas Fielding", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Technologie", "Roy Thomas Fielding a introduit REST dans sa thèse de doctorat en 2000, définissant les principes architecturaux du web."),
            en = LocalizedContent("Who introduced REST?", listOf("Roy Thomas Fielding", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Technology", "Roy Thomas Fielding introduced REST in his doctoral dissertation in 2000, defining the architectural principles of the web."),
            zh = LocalizedContent("谁引入了 REST？", listOf("Roy Thomas Fielding", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "科技", "Roy Thomas Fielding 在其 2000 年的博士论文中引入了 REST，定义了 Web 的架构原则。"),
            es = LocalizedContent("¿Quién introdujo REST?", listOf("Roy Thomas Fielding", "Tim Berners-Lee", "Mark Zuckerberg", "Jack Dorsey"), "Tecnología", "Roy Thomas Fielding introdujo REST en su tesis doctoral en 2000, definiendo los principios arquitectónicos de la web.")
        ),
        BilingualQuestion(
            id = 11478, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année SOAP a-t-il été créé?", listOf("1998", "1996", "2000", "2002"), "Technologie", "SOAP (Simple Object Access Protocol) a été développé par Microsoft en 1998 comme protocole d'échange de données structurées pour les services web."),
            en = LocalizedContent("In what year was SOAP created?", listOf("1998", "1996", "2000", "2002"), "Technology", "SOAP (Simple Object Access Protocol) was developed by Microsoft in 1998 as a protocol for exchanging structured data for web services."),
            zh = LocalizedContent("SOAP 是在哪一年创建的？", listOf("1998", "1996", "2000", "2002"), "科技", "SOAP（简单对象访问协议）由 Microsoft 于 1998 年开发，作为 Web 服务交换结构化数据的协议。"),
            es = LocalizedContent("¿En qué año se creó SOAP?", listOf("1998", "1996", "2000", "2002"), "Tecnología", "SOAP (Protocolo Simple de Acceso a Objetos) fue desarrollado por Microsoft en 1998 como un protocolo para intercambiar datos estructurados para servicios web.")
        ),
        BilingualQuestion(
            id = 11479, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé SOAP?", listOf("Microsoft et al.", "Google", "Amazon", "Apple"), "Technologie", "SOAP a été développé par Microsoft en collaboration avec d'autres entreprises, puis soumis au W3C pour standardisation."),
            en = LocalizedContent("Who created SOAP?", listOf("Microsoft et al.", "Google", "Amazon", "Apple"), "Technology", "SOAP was developed by Microsoft in collaboration with other companies, then submitted to the W3C for standardization."),
            zh = LocalizedContent("谁创建了 SOAP？", listOf("Microsoft 等", "Google", "Amazon", "Apple"), "科技", "SOAP 由 Microsoft 与其他公司合作开发，随后提交给 W3C 进行标准化。"),
            es = LocalizedContent("¿Quién creó SOAP?", listOf("Microsoft y otros", "Google", "Amazon", "Apple"), "Tecnología", "SOAP fue desarrollado por Microsoft en colaboración con otras empresas, y luego presentado al W3C para su estandarización.")
        ),
        BilingualQuestion(
            id = 11480, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année OAuth a-t-il été créé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "OAuth a été créé en 2010 par une équipe de développeurs, dont Blaine Cook, pour standardiser l'autorisation sécurisée d'accès aux données sans partager de mots de passe."),
            en = LocalizedContent("In what year was OAuth created?", listOf("2010", "2008", "2012", "2014"), "Technology", "OAuth was created in 2010 by a team of developers, including Blaine Cook, to standardize secure authorization for data access without sharing passwords."),
            zh = LocalizedContent("OAuth 是在哪一年创建的？", listOf("2010", "2008", "2012", "2014"), "科技", "OAuth 于 2010 年由包括 Blaine Cook 在内的开发团队创建，旨在标准化无需共享密码即可安全授权访问数据的方式。"),
            es = LocalizedContent("¿En qué año se creó OAuth?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "OAuth fue creado en 2010 por un equipo de desarrolladores, incluido Blaine Cook, para estandarizar la autorización segura de acceso a datos sin compartir contraseñas.")
        ),
        BilingualQuestion(
            id = 11481, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année OpenID a-t-il été créé?", listOf("2005", "2003", "2007", "2009"), "Technologie", "OpenID a été créé en 2005 par une communauté open source pour fournir un système d'authentification décentralisé."),
            en = LocalizedContent("In what year was OpenID created?", listOf("2005", "2003", "2007", "2009"), "Technology", "OpenID was created in 2005 by an open-source community to provide a decentralized authentication system."),
            zh = LocalizedContent("OpenID 是在哪一年创建的？", listOf("2005", "2003", "2007", "2009"), "科技", "OpenID 于 2005 年由开源社区创建，旨在提供去中心化的身份验证系统。"),
            es = LocalizedContent("¿En qué año se creó OpenID?", listOf("2005", "2003", "2007", "2009"), "Tecnología", "OpenID fue creado en 2005 por una comunidad de código abierto para proporcionar un sistema de autenticación descentralizado.")
        ),
        BilingualQuestion(
            id = 11482, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année SAML a-t-il été créé?", listOf("2002", "2000", "2004", "2006"), "Technologie", "SAML (Security Assertion Markup Language) a été développé par l'OASIS Security Services Technical Committee et sa version 1.0 a été publiée en novembre 2002."),
            en = LocalizedContent("In what year was SAML created?", listOf("2002", "2000", "2004", "2006"), "Technology", "SAML (Security Assertion Markup Language) was developed by the OASIS Security Services Technical Committee and its version 1.0 was published in November 2002."),
            zh = LocalizedContent("SAML 是在哪一年创建的？", listOf("2002", "2000", "2004", "2006"), "科技", "SAML（安全断言标记语言）由 OASIS 安全服务技术委员会开发，其 1.0 版本于 2002 年 11 月发布。"),
            es = LocalizedContent("¿En qué año se creó SAML?", listOf("2002", "2000", "2004", "2006"), "Tecnología", "SAML (Security Assertion Markup Language) fue desarrollado por el Comité Técnico de Servicios de Seguridad de OASIS y su versión 1.0 se publicó en noviembre de 2002.")
        ),
        BilingualQuestion(
            id = 11483, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien système d'exploitation en production?", listOf("UNIX", "Linux", "Windows", "macOS"), "Technologie", "UNIX a été développé à la fin des années 1960 chez Bell Labs et est toujours utilisé aujourd'hui, ce qui en fait le plus ancien système d'exploitation encore en production."),
            en = LocalizedContent("What is the oldest operating system still in production?", listOf("UNIX", "Linux", "Windows", "macOS"), "Technology", "UNIX was developed in the late 1960s at Bell Labs and is still used today, making it the oldest operating system still in production."),
            zh = LocalizedContent("仍在生产中的最古老的操作系统是什么？", listOf("UNIX", "Linux", "Windows", "macOS"), "科技", "UNIX 于 20 世纪 60 年代末在贝尔实验室开发，至今仍在使用，是仍在生产中的最古老的操作系统。"),
            es = LocalizedContent("¿Cuál es el sistema operativo más antiguo aún en producción?", listOf("UNIX", "Linux", "Windows", "macOS"), "Tecnología", "UNIX fue desarrollado a finales de los años 1960 en los Laboratorios Bell y todavía se usa hoy, lo que lo convierte en el sistema operativo más antiguo aún en producción.")
        ),
        BilingualQuestion(
            id = 11484, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année UNIX a-t-il été créé?", listOf("1969", "1967", "1971", "1973"), "Technologie", "UNIX a été créé en 1969 par Ken Thompson et Dennis Ritchie aux laboratoires Bell d'AT&T."),
            en = LocalizedContent("In what year was UNIX created?", listOf("1969", "1967", "1971", "1973"), "Technology", "UNIX was created in 1969 by Ken Thompson and Dennis Ritchie at AT&T Bell Labs."),
            zh = LocalizedContent("UNIX 是在哪一年创建的？", listOf("1969", "1967", "1971", "1973"), "科技", "UNIX 于 1969 年由肯·汤普森和丹尼斯·里奇在 AT&T 贝尔实验室创建。"),
            es = LocalizedContent("¿En qué año se creó UNIX?", listOf("1969", "1967", "1971", "1973"), "Tecnología", "UNIX fue creado en 1969 por Ken Thompson y Dennis Ritchie en los Laboratorios Bell de AT&T.")
        ),
        BilingualQuestion(
            id = 11485, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé UNIX?", listOf("Ken Thompson et Dennis Ritchie", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technologie", "Ken Thompson et Dennis Ritchie ont développé UNIX aux Bell Labs dans les années 1970, posant les bases des systèmes d'exploitation modernes."),
            en = LocalizedContent("Who created UNIX?", listOf("Ken Thompson and Dennis Ritchie", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technology", "Ken Thompson and Dennis Ritchie developed UNIX at Bell Labs in the 1970s, laying the foundation for modern operating systems."),
            zh = LocalizedContent("谁创建了 UNIX？", listOf("肯·汤普森和丹尼斯·里奇", "马克·扎克伯格", "史蒂夫·乔布斯", "比尔·盖茨"), "科技", "肯·汤普森和丹尼斯·里奇在 20 世纪 70 年代在贝尔实验室开发了 UNIX，为现代操作系统奠定了基础。"),
            es = LocalizedContent("¿Quién creó UNIX?", listOf("Ken Thompson y Dennis Ritchie", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Tecnología", "Ken Thompson y Dennis Ritchie desarrollaron UNIX en los Laboratorios Bell en la década de 1970, sentando las bases de los sistemas operativos modernos.")
        ),
        BilingualQuestion(
            id = 11486, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Linux a-t-il été créé?", listOf("1991", "1989", "1993", "1995"), "Technologie", "Linux a été créé en 1991 par Linus Torvalds, alors étudiant à l'université d'Helsinki, comme un noyau de système d'exploitation libre."),
            en = LocalizedContent("In what year was Linux created?", listOf("1991", "1989", "1993", "1995"), "Technology", "Linux was created in 1991 by Linus Torvalds, then a student at the University of Helsinki, as a free operating system kernel."),
            zh = LocalizedContent("Linux 是在哪一年创建的？", listOf("1991", "1989", "1993", "1995"), "科技", "Linux 于 1991 年由林纳斯·托瓦兹创建，当时他是赫尔辛基大学的学生，作为自由操作系统内核。"),
            es = LocalizedContent("¿En qué año se creó Linux?", listOf("1991", "1989", "1993", "1995"), "Tecnología", "Linux fue creado en 1991 por Linus Torvalds, entonces estudiante de la Universidad de Helsinki, como un núcleo de sistema operativo libre.")
        ),
        BilingualQuestion(
            id = 11487, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Linux?", listOf("Linus Torvalds", "Richard Stallman", "Steve Jobs", "Bill Gates"), "Technologie", "Linus Torvalds a créé le noyau Linux en 1991 alors qu'il était étudiant à l'université d'Helsinki, en Finlande."),
            en = LocalizedContent("Who created Linux?", listOf("Linus Torvalds", "Richard Stallman", "Steve Jobs", "Bill Gates"), "Technology", "Linus Torvalds created the Linux kernel in 1991 while he was a student at the University of Helsinki in Finland."),
            zh = LocalizedContent("谁创建了 Linux？", listOf("林纳斯·托瓦兹", "理查德·斯托曼", "史蒂夫·乔布斯", "比尔·盖茨"), "科技", "林纳斯·托瓦兹于 1991 年创建了 Linux 内核，当时他是芬兰赫尔辛基大学的学生。"),
            es = LocalizedContent("¿Quién creó Linux?", listOf("Linus Torvalds", "Richard Stallman", "Steve Jobs", "Bill Gates"), "Tecnología", "Linus Torvalds creó el núcleo de Linux en 1991 mientras era estudiante en la Universidad de Helsinki, Finlandia.")
        ),
        BilingualQuestion(
            id = 11488, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année GNU a-t-il été créé?", listOf("1983", "1981", "1985", "1987"), "Technologie", "Le projet GNU a été officiellement lancé le 27 septembre 1983 par Richard Stallman, avec pour objectif de créer un système d'exploitation libre et compatible avec Unix."),
            en = LocalizedContent("In what year was GNU created?", listOf("1983", "1981", "1985", "1987"), "Technology", "The GNU project was officially launched on September 27, 1983 by Richard Stallman, with the goal of creating a free Unix-compatible operating system."),
            zh = LocalizedContent("GNU 是在哪一年创建的？", listOf("1983", "1981", "1985", "1987"), "科技", "GNU 项目于 1983 年 9 月 27 日由理查德·斯托曼正式启动，目标是创建一个自由且与 Unix 兼容的操作系统。"),
            es = LocalizedContent("¿En qué año se creó GNU?", listOf("1983", "1981", "1985", "1987"), "Tecnología", "El proyecto GNU fue lanzado oficialmente el 27 de septiembre de 1983 por Richard Stallman, con el objetivo de crear un sistema operativo libre compatible con Unix.")
        ),
        BilingualQuestion(
            id = 11489, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé GNU?", listOf("Richard Stallman", "Linus Torvalds", "Steve Jobs", "Bill Gates"), "Technologie", "Richard Stallman a lancé le projet GNU en 1983 pour créer un système d'exploitation libre, posant les bases du mouvement du logiciel libre."),
            en = LocalizedContent("Who created GNU?", listOf("Richard Stallman", "Linus Torvalds", "Steve Jobs", "Bill Gates"), "Technology", "Richard Stallman launched the GNU project in 1983 to create a free operating system, laying the foundation for the free software movement."),
            zh = LocalizedContent("谁创建了 GNU？", listOf("理查德·斯托曼", "林纳斯·托瓦兹", "史蒂夫·乔布斯", "比尔·盖茨"), "科技", "理查德·斯托曼于 1983 年启动了 GNU 项目，旨在创建一个自由操作系统，为自由软件运动奠定了基础。"),
            es = LocalizedContent("¿Quién creó GNU?", listOf("Richard Stallman", "Linus Torvalds", "Steve Jobs", "Bill Gates"), "Tecnología", "Richard Stallman lanzó el proyecto GNU en 1983 para crear un sistema operativo libre, sentando las bases del movimiento del software libre.")
        ),
        BilingualQuestion(
            id = 11490, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année BSD a-t-il été créé?", listOf("1977", "1975", "1979", "1981"), "Technologie", "BSD, acronyme de Berkeley Software Distribution, a été créé en 1977 par l'université de Californie à Berkeley comme une version améliorée d'Unix."),
            en = LocalizedContent("In what year was BSD created?", listOf("1977", "1975", "1979", "1981"), "Technology", "BSD, short for Berkeley Software Distribution, was created in 1977 by the University of California, Berkeley as an enhanced version of Unix."),
            zh = LocalizedContent("BSD 是哪一年创建的？", listOf("1977", "1975", "1979", "1981"), "科技", "BSD，即伯克利软件发行版，由加州大学伯克利分校于1977年创建，是Unix的增强版本。"),
            es = LocalizedContent("¿En qué año se creó BSD?", listOf("1977", "1975", "1979", "1981"), "Tecnología", "BSD, acrónimo de Berkeley Software Distribution, fue creado en 1977 por la Universidad de California en Berkeley como una versión mejorada de Unix.")
        ),
        BilingualQuestion(
            id = 11491, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année System V a-t-il été créé?", listOf("1983", "1981", "1985", "1987"), "Technologie", "System V est une version majeure du système d'exploitation UNIX, développée par AT&T et publiée en 1983."),
            en = LocalizedContent("In what year was System V created?", listOf("1983", "1981", "1985", "1987"), "Technology", "System V is a major version of the UNIX operating system, developed by AT&T and released in 1983."),
            zh = LocalizedContent("System V 是哪一年创建的？", listOf("1983", "1981", "1985", "1987"), "科技", "System V 是 UNIX 操作系统的一个主要版本，由 AT&T 开发并于1983年发布。"),
            es = LocalizedContent("¿En qué año se creó System V?", listOf("1983", "1981", "1985", "1987"), "Tecnología", "System V es una versión importante del sistema operativo UNIX, desarrollada por AT&T y publicada en 1983.")
        ),
        BilingualQuestion(
            id = 11492, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année DOS a-t-il été créé?", listOf("1981", "1979", "1983", "1985"), "Technologie", "MS-DOS a été développé par Microsoft pour IBM et lancé en 1981 avec le premier PC IBM."),
            en = LocalizedContent("In what year was DOS created?", listOf("1981", "1979", "1983", "1985"), "Technology", "MS-DOS was developed by Microsoft for IBM and launched in 1981 with the first IBM PC."),
            zh = LocalizedContent("DOS 是哪一年创建的？", listOf("1981", "1979", "1983", "1985"), "科技", "MS-DOS 由微软为 IBM 开发，并于1981年随第一台 IBM PC 推出。"),
            es = LocalizedContent("¿En qué año se creó DOS?", listOf("1981", "1979", "1983", "1985"), "Tecnología", "MS-DOS fue desarrollado por Microsoft para IBM y lanzado en 1981 con el primer PC de IBM.")
        ),
        BilingualQuestion(
            id = 11493, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé DOS?", listOf("Tim Paterson", "Bill Gates", "Steve Jobs", "Mark Zuckerberg"), "Technologie", "Tim Paterson a écrit le système d'exploitation 86-DOS en 1980 pour Seattle Computer Products, que Microsoft a ensuite acheté et rebaptisé MS-DOS."),
            en = LocalizedContent("Who created DOS?", listOf("Tim Paterson", "Bill Gates", "Steve Jobs", "Mark Zuckerberg"), "Technology", "Tim Paterson wrote the 86-DOS operating system in 1980 for Seattle Computer Products, which Microsoft later purchased and renamed MS-DOS."),
            zh = LocalizedContent("谁创建了 DOS？", listOf("蒂姆·帕特森", "比尔·盖茨", "史蒂夫·乔布斯", "马克·扎克伯格"), "科技", "蒂姆·帕特森于1980年为西雅图计算机产品公司编写了 86-DOS 操作系统，微软后来收购并更名为 MS-DOS。"),
            es = LocalizedContent("¿Quién creó DOS?", listOf("Tim Paterson", "Bill Gates", "Steve Jobs", "Mark Zuckerberg"), "Tecnología", "Tim Paterson escribió el sistema operativo 86-DOS en 1980 para Seattle Computer Products, que Microsoft compró posteriormente y renombró como MS-DOS.")
        ),
        BilingualQuestion(
            id = 11494, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Windows a-t-il été créé?", listOf("1985", "1983", "1987", "1989"), "Technologie", "Microsoft a lancé Windows 1.0 le 20 novembre 1985, marquant le début de son système d'exploitation graphique pour PC."),
            en = LocalizedContent("In what year was Windows created?", listOf("1985", "1983", "1987", "1989"), "Technology", "Microsoft launched Windows 1.0 on November 20, 1985, marking the beginning of its graphical operating system for PCs."),
            zh = LocalizedContent("Windows 是哪一年创建的？", listOf("1985", "1983", "1987", "1989"), "科技", "微软于1985年11月20日发布了 Windows 1.0，标志着其 PC 图形操作系统的开端。"),
            es = LocalizedContent("¿En qué año se creó Windows?", listOf("1985", "1983", "1987", "1989"), "Tecnología", "Microsoft lanzó Windows 1.0 el 20 de noviembre de 1985, marcando el inicio de su sistema operativo gráfico para PC.")
        ),
        BilingualQuestion(
            id = 11495, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année macOS a-t-il été créé?", listOf("2001", "1999", "2003", "2005"), "Technologie", "macOS, alors nommé Mac OS X, a été lancé en mars 2001, succédant au Mac OS 9 et marquant le passage à un système basé sur Unix."),
            en = LocalizedContent("In what year was macOS created?", listOf("2001", "1999", "2003", "2005"), "Technology", "macOS, then named Mac OS X, was launched in March 2001, succeeding Mac OS 9 and marking the transition to a Unix-based system."),
            zh = LocalizedContent("macOS 是哪一年创建的？", listOf("2001", "1999", "2003", "2005"), "科技", "macOS（当时名为 Mac OS X）于2001年3月推出，接替 Mac OS 9，标志着向基于 Unix 的系统过渡。"),
            es = LocalizedContent("¿En qué año se creó macOS?", listOf("2001", "1999", "2003", "2005"), "Tecnología", "macOS, entonces llamado Mac OS X, se lanzó en marzo de 2001, sucediendo a Mac OS 9 y marcando la transición a un sistema basado en Unix.")
        ),
        BilingualQuestion(
            id = 11496, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année OS X a-t-il été renommé macOS?", listOf("2016", "2014", "2018", "2020"), "Technologie", "Apple a renommé OS X en macOS en 2016 pour aligner son système d'exploitation de bureau avec ses autres systèmes (iOS, watchOS, tvOS) et simplifier la nomenclature."),
            en = LocalizedContent("In what year was OS X renamed to macOS?", listOf("2016", "2014", "2018", "2020"), "Technology", "Apple renamed OS X to macOS in 2016 to align its desktop operating system with its other systems (iOS, watchOS, tvOS) and simplify the nomenclature."),
            zh = LocalizedContent("OS X 是哪一年更名为 macOS 的？", listOf("2016", "2014", "2018", "2020"), "科技", "苹果于2016年将 OS X 更名为 macOS，以使其桌面操作系统与其他系统（iOS、watchOS、tvOS）保持一致并简化命名。"),
            es = LocalizedContent("¿En qué año se renombró OS X a macOS?", listOf("2016", "2014", "2018", "2020"), "Tecnología", "Apple renombró OS X a macOS en 2016 para alinear su sistema operativo de escritorio con sus otros sistemas (iOS, watchOS, tvOS) y simplificar la nomenclatura.")
        ),
        BilingualQuestion(
            id = 11497, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année iOS a-t-il été lancé?", listOf("2007", "2005", "2009", "2011"), "Technologie", "iOS a été dévoilé par Apple le 9 janvier 2007, en même temps que le premier iPhone, dont il était le système d'exploitation."),
            en = LocalizedContent("In what year was iOS launched?", listOf("2007", "2005", "2009", "2011"), "Technology", "iOS was unveiled by Apple on January 9, 2007, alongside the first iPhone, for which it was the operating system."),
            zh = LocalizedContent("iOS 是哪一年推出的？", listOf("2007", "2005", "2009", "2011"), "科技", "苹果于2007年1月9日发布了 iOS，同时推出了第一代 iPhone，iOS 是其操作系统。"),
            es = LocalizedContent("¿En qué año se lanzó iOS?", listOf("2007", "2005", "2009", "2011"), "Tecnología", "iOS fue presentado por Apple el 9 de enero de 2007, junto con el primer iPhone, del cual era el sistema operativo.")
        ),
        BilingualQuestion(
            id = 11498, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Android a-t-il été créé?", listOf("2003", "2001", "2005", "2007"), "Technologie", "Android a été fondé en 2003 par Andy Rubin, Rich Miner, Nick Sears et Chris White. Le système d'exploitation a ensuite été racheté par Google en 2005."),
            en = LocalizedContent("In what year was Android created?", listOf("2003", "2001", "2005", "2007"), "Technology", "Android was founded in 2003 by Andy Rubin, Rich Miner, Nick Sears, and Chris White. The operating system was later acquired by Google in 2005."),
            zh = LocalizedContent("Android 是哪一年创建的？", listOf("2003", "2001", "2005", "2007"), "科技", "Android 由安迪·鲁宾、里奇·米纳、尼克·西尔斯和克里斯·怀特于2003年创立。该操作系统后来于2005年被谷歌收购。"),
            es = LocalizedContent("¿En qué año se creó Android?", listOf("2003", "2001", "2005", "2007"), "Tecnología", "Android fue fundado en 2003 por Andy Rubin, Rich Miner, Nick Sears y Chris White. El sistema operativo fue posteriormente adquirido por Google en 2005.")
        ),
        BilingualQuestion(
            id = 11499, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Android?", listOf("Andy Rubin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technologie", "Andy Rubin a fondé Android Inc. en 2003, avant que Google ne rachète la startup en 2005 pour développer le système d'exploitation mobile."),
            en = LocalizedContent("Who created Android?", listOf("Andy Rubin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technology", "Andy Rubin founded Android Inc. in 2003, before Google acquired the startup in 2005 to develop the mobile operating system."),
            zh = LocalizedContent("谁创建了 Android？", listOf("安迪·鲁宾", "马克·扎克伯格", "史蒂夫·乔布斯", "比尔·盖茨"), "科技", "安迪·鲁宾于2003年创立了 Android Inc.，随后谷歌于2005年收购了这家初创公司以开发移动操作系统。"),
            es = LocalizedContent("¿Quién creó Android?", listOf("Andy Rubin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Tecnología", "Andy Rubin fundó Android Inc. en 2003, antes de que Google adquiriera la startup en 2005 para desarrollar el sistema operativo móvil.")
        ),
        BilingualQuestion(
            id = 11500, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a remporté l'Oscar du meilleur film en 2024?", listOf("Oppenheimer", "Barbie", "Killers of the Flower Moon", "American Fiction"), "Culture", "Oppenheimer, réalisé par Christopher Nolan, a remporté l'Oscar du meilleur film en 2024, dominant la cérémonie avec sept récompenses."),
            en = LocalizedContent("Which film won the Academy Award for Best Picture in 2024?", listOf("Oppenheimer", "Barbie", "Killers of the Flower Moon", "American Fiction"), "Culture", "Oppenheimer, directed by Christopher Nolan, won the Oscar for Best Picture in 2024, dominating the ceremony with seven awards."),
            zh = LocalizedContent("哪部电影在2024年获得了奥斯卡最佳影片奖？", listOf("奥本海默", "芭比", "花月杀手", "美国小说"), "文化", "由克里斯托弗·诺兰执导的《奥本海默》在2024年获得奥斯卡最佳影片奖，以七项大奖领跑颁奖典礼。"),
            es = LocalizedContent("¿Qué película ganó el Óscar a la mejor película en 2024?", listOf("Oppenheimer", "Barbie", "Killers of the Flower Moon", "American Fiction"), "Cultura", "Oppenheimer, dirigida por Christopher Nolan, ganó el Óscar a la mejor película en 2024, dominando la ceremonia con siete premios.")
        ),
        BilingualQuestion(
            id = 11501, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a remporté l'Oscar du meilleur acteur en 2023?", listOf("Cillian Murphy", "Bradley Cooper", "Colman Domingo", "Paul Giamatti"), "Culture", "Cillian Murphy a remporté l'Oscar du meilleur acteur en 2023 pour son rôle de J. Robert Oppenheimer dans le film \"Oppenheimer\" de Christopher Nolan."),
            en = LocalizedContent("Who won the Academy Award for Best Actor in 2023?", listOf("Cillian Murphy", "Bradley Cooper", "Colman Domingo", "Paul Giamatti"), "Culture", "Cillian Murphy won the Oscar for Best Actor in 2023 for his role as J. Robert Oppenheimer in Christopher Nolan's film \"Oppenheimer\"."),
            zh = LocalizedContent("谁在2023年获得了奥斯卡最佳男主角奖？", listOf("基里安·墨菲", "布莱德利·库珀", "科尔曼·多明戈", "保罗·吉亚玛提"), "文化", "基里安·墨菲凭借在克里斯托弗·诺兰执导的电影《奥本海默》中饰演J·罗伯特·奥本海默一角，于2023年获得奥斯卡最佳男主角奖。"),
            es = LocalizedContent("¿Quién ganó el Óscar al mejor actor en 2023?", listOf("Cillian Murphy", "Bradley Cooper", "Colman Domingo", "Paul Giamatti"), "Cultura", "Cillian Murphy ganó el Óscar al mejor actor en 2023 por su papel de J. Robert Oppenheimer en la película \"Oppenheimer\" de Christopher Nolan.")
        ),
        BilingualQuestion(
            id = 11502, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année ont eu lieu les premiers Oscars?", listOf("1927", "1935", "1929", "1933"), "Culture", "La première cérémonie des Oscars s'est tenue le 16 mai 1929 à l'hôtel Roosevelt de Hollywood, récompensant les films sortis entre 1927 et 1928."),
            en = LocalizedContent("In what year did the first Oscars take place?", listOf("1927", "1935", "1929", "1933"), "Culture", "The first Oscars ceremony was held on May 16, 1929 at the Hollywood Roosevelt Hotel, honoring films released between 1927 and 1928."),
            zh = LocalizedContent("第一届奥斯卡颁奖典礼在哪一年举行？", listOf("1927", "1935", "1929", "1933"), "文化", "第一届奥斯卡颁奖典礼于1929年5月16日在好莱坞罗斯福酒店举行，表彰1927年至1928年间上映的电影。"),
            es = LocalizedContent("¿En qué año se celebraron los primeros Óscar?", listOf("1927", "1935", "1929", "1933"), "Cultura", "La primera ceremonia de los Óscar se celebró el 16 de mayo de 1929 en el Hotel Roosevelt de Hollywood, premiando películas estrenadas entre 1927 y 1928.")
        ),
        BilingualQuestion(
            id = 11503, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a remporté le plus d'Oscars?", listOf("William Wyler", "Stanley Kubrick", "Alfred Hitchcock", "Steven Spielberg"), "Culture", "William Wyler détient le record de douze nominations comme meilleur réalisateur et trois Oscars remportés, pour Mrs Miniver, Les Plus Belles Années de notre vie et Ben-Hur."),
            en = LocalizedContent("Which director has won the most Oscars?", listOf("William Wyler", "Stanley Kubrick", "Alfred Hitchcock", "Steven Spielberg"), "Culture", "William Wyler holds the record with twelve nominations for Best Director and three Oscars won, for Mrs. Miniver, The Best Years of Our Lives, and Ben-Hur."),
            zh = LocalizedContent("哪位导演获得的奥斯卡奖最多？", listOf("威廉·惠勒", "斯坦利·库布里克", "阿尔弗雷德·希区柯克", "史蒂文·斯皮尔伯格"), "文化", "威廉·惠勒保持着最佳导演提名十二次和三次获奖的纪录，获奖影片为《忠勇之家》、《黄金时代》和《宾虚》。"),
            es = LocalizedContent("¿Qué director ha ganado más Óscar?", listOf("William Wyler", "Stanley Kubrick", "Alfred Hitchcock", "Steven Spielberg"), "Cultura", "William Wyler ostenta el récord de doce nominaciones como mejor director y tres Óscar ganados, por Mrs. Miniver, Los mejores años de nuestra vida y Ben-Hur.")
        ),
        BilingualQuestion(
            id = 11504, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'Oscars a remportés \"Titanic\" en 1998?", listOf("11", "14", "13", "10"), "Culture", "Le film Titanic de James Cameron a remporté 14 Oscars en 1998, égalant le record détenu par Ève (1950). Ce total inclut les prix du meilleur film et du meilleur réalisateur."),
            en = LocalizedContent("How many Oscars did \"Titanic\" win in 1998?", listOf("11", "14", "13", "10"), "Culture", "James Cameron's film Titanic won 14 Oscars in 1998, tying the record held by All About Eve (1950). This total includes Best Picture and Best Director."),
            zh = LocalizedContent("《泰坦尼克号》在1998年获得了多少项奥斯卡奖？", listOf("11", "14", "13", "10"), "文化", "詹姆斯·卡梅隆执导的电影《泰坦尼克号》在1998年获得14项奥斯卡奖，追平了《彗星美人》（1950年）保持的纪录。这一总数包括最佳影片和最佳导演奖。"),
            es = LocalizedContent("¿Cuántos Óscar ganó \"Titanic\" en 1998?", listOf("11", "14", "13", "10"), "Cultura", "La película Titanic de James Cameron ganó 14 Óscar en 1998, igualando el récord de Eva al desnudo (1950). Este total incluye los premios a mejor película y mejor director.")
        ),
        BilingualQuestion(
            id = 11505, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté l'Oscar du meilleur film international en 2023?", listOf("La Société des Invisibles", "All Quiet", "Passages", "Perfect Days"), "Culture", "All Quiet on the Western Front, adaptation allemande du roman d'Erich Maria Remarque, a remporté l'Oscar du meilleur film international en 2023 pour sa représentation poignante de la Première Guerre mondiale."),
            en = LocalizedContent("Which film won the Academy Award for Best International Feature Film in 2023?", listOf("La Société des Invisibles", "All Quiet", "Passages", "Perfect Days"), "Culture", "All Quiet on the Western Front, a German adaptation of Erich Maria Remarque's novel, won the Oscar for Best International Feature Film in 2023 for its poignant portrayal of World War I."),
            zh = LocalizedContent("哪部电影在2023年获得了奥斯卡最佳国际影片奖？", listOf("隐形社会", "西线无战事", "过往", "完美的日子"), "文化", "《西线无战事》是埃里希·玛丽亚·雷马克小说的德国改编版，因其对第一次世界大战的深刻描绘，在2023年获得奥斯卡最佳国际影片奖。"),
            es = LocalizedContent("¿Qué película ganó el Óscar a la mejor película internacional en 2023?", listOf("La Société des Invisibles", "All Quiet", "Passages", "Perfect Days"), "Cultura", "Sin novedad en el frente, adaptación alemana de la novela de Erich Maria Remarque, ganó el Óscar a la mejor película internacional en 2023 por su conmovedora representación de la Primera Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 11506, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Meryl Streep a remporté combien d'Oscars?", listOf("2", "3", "1", "4"), "Culture", "Meryl Streep détient le record de nominations aux Oscars (21), mais n'a remporté la statuette que trois fois : meilleure actrice dans un second rôle pour Kramer contre Kramer (1979), meilleure actrice pour Le Choix de Sophie (1982) et pour The Iron Lady (2011)."),
            en = LocalizedContent("How many Oscars has Meryl Streep won?", listOf("2", "3", "1", "4"), "Culture", "Meryl Streep holds the record for most Oscar nominations (21), but has won the statuette only three times: Best Supporting Actress for Kramer vs. Kramer (1979), Best Actress for Sophie's Choice (1982) and for The Iron Lady (2011)."),
            zh = LocalizedContent("梅丽尔·斯特里普获得了多少项奥斯卡奖？", listOf("2", "3", "1", "4"), "文化", "梅丽尔·斯特里普保持着奥斯卡提名次数最多的纪录（21次），但仅三次获奖：最佳女配角（《克莱默夫妇》，1979年）、最佳女主角（《苏菲的选择》，1982年）和最佳女主角（《铁娘子》，2011年）。"),
            es = LocalizedContent("¿Cuántos Óscar ha ganado Meryl Streep?", listOf("2", "3", "1", "4"), "Cultura", "Meryl Streep ostenta el récord de más nominaciones al Óscar (21), pero solo ha ganado la estatuilla tres veces: mejor actriz de reparto por Kramer contra Kramer (1979), mejor actriz por La decisión de Sophie (1982) y por La dama de hierro (2011).")
        ),
        BilingualQuestion(
            id = 11507, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a remporté l'Oscar du meilleur film en 2022?", listOf("CODA", "Licorice Pizza", "Don't Look Up", "The Power of the Dog"), "Culture", "CODA a remporté l'Oscar du meilleur film en 2022, devenant le premier film d'une plateforme de streaming (Apple TV+) à obtenir cette récompense."),
            en = LocalizedContent("Which film won the Academy Award for Best Picture in 2022?", listOf("CODA", "Licorice Pizza", "Don't Look Up", "The Power of the Dog"), "Culture", "CODA won the Oscar for Best Picture in 2022, becoming the first film from a streaming platform (Apple TV+) to receive this award."),
            zh = LocalizedContent("哪部电影在2022年获得了奥斯卡最佳影片奖？", listOf("健听女孩", "甘草披萨", "不要抬头", "犬之力"), "文化", "《健听女孩》在2022年获得奥斯卡最佳影片奖，成为首部来自流媒体平台（Apple TV+）获得该奖项的电影。"),
            es = LocalizedContent("¿Qué película ganó el Óscar a la mejor película en 2022?", listOf("CODA", "Licorice Pizza", "Don't Look Up", "The Power of the Dog"), "Cultura", "CODA ganó el Óscar a la mejor película en 2022, convirtiéndose en la primera película de una plataforma de streaming (Apple TV+) en obtener este premio.")
        ),
        BilingualQuestion(
            id = 11508, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"La Liste de Schindler\" a-t-il remporté l'Oscar du meilleur film?", listOf("1994", "1993", "1995", "1992"), "Culture", "Le film de Steven Spielberg, sorti en 1993, a été récompensé lors de la 66e cérémonie des Oscars en 1994, où il a remporté sept statuettes dont celle du meilleur film."),
            en = LocalizedContent("In what year did \"Schindler's List\" win the Academy Award for Best Picture?", listOf("1994", "1993", "1995", "1992"), "Culture", "Steven Spielberg's film, released in 1993, was awarded at the 66th Academy Awards in 1994, where it won seven statuettes including Best Picture."),
            zh = LocalizedContent("《辛德勒的名单》在哪一年获得了奥斯卡最佳影片奖？", listOf("1994", "1993", "1995", "1992"), "文化", "史蒂文·斯皮尔伯格执导的电影于1993年上映，在1994年第66届奥斯卡颁奖典礼上获奖，共获得七项大奖，包括最佳影片。"),
            es = LocalizedContent("¿En qué año ganó \"La lista de Schindler\" el Óscar a la mejor película?", listOf("1994", "1993", "1995", "1992"), "Cultura", "La película de Steven Spielberg, estrenada en 1993, fue premiada en la 66.ª ceremonia de los Óscar en 1994, donde ganó siete estatuillas, incluida la de mejor película.")
        ),
        BilingualQuestion(
            id = 11509, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a présenté les Oscars le plus de fois?", listOf("Bob Hope", "Johnny Carson", "Billy Crystal", "Whoopi Goldberg"), "Culture", "Bob Hope a animé la cérémonie des Oscars à 19 reprises entre 1940 et 1978, un record inégalé."),
            en = LocalizedContent("Who has hosted the Oscars the most times?", listOf("Bob Hope", "Johnny Carson", "Billy Crystal", "Whoopi Goldberg"), "Culture", "Bob Hope hosted the Oscars ceremony 19 times between 1940 and 1978, an unmatched record."),
            zh = LocalizedContent("谁主持奥斯卡颁奖典礼的次数最多？", listOf("鲍勃·霍普", "约翰尼·卡森", "比利·克里斯托", "乌比·戈德堡"), "文化", "鲍勃·霍普在1940年至1978年间主持了19次奥斯卡颁奖典礼，这一纪录无人能及。"),
            es = LocalizedContent("¿Quién ha presentado los Óscar más veces?", listOf("Bob Hope", "Johnny Carson", "Billy Crystal", "Whoopi Goldberg"), "Cultura", "Bob Hope presentó la ceremonia de los Óscar en 19 ocasiones entre 1940 y 1978, un récord sin igual.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11510, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a remporté l'Oscar du meilleur acteur pour \"Forrest Gump\"?", listOf("Tom Hanks", "Gary Oldman", "Daniel Day-Lewis", "Jack Nicholson"), "Culture", "Tom Hanks a remporté l'Oscar du meilleur acteur en 1995 pour son rôle de Forrest Gump, un film qui a également gagné l'Oscar du meilleur film."),
            en = LocalizedContent("Which actor won the Academy Award for Best Actor for \"Forrest Gump\"?", listOf("Tom Hanks", "Gary Oldman", "Daniel Day-Lewis", "Jack Nicholson"), "Culture", "Tom Hanks won the Academy Award for Best Actor in 1995 for his role as Forrest Gump, a film that also won the Academy Award for Best Picture."),
            zh = LocalizedContent("哪位演员凭借《阿甘正传》获得奥斯卡最佳男主角奖？", listOf("汤姆·汉克斯", "加里·奥德曼", "丹尼尔·戴-刘易斯", "杰克·尼科尔森"), "文化", "汤姆·汉克斯于1995年凭借在《阿甘正传》中饰演阿甘一角获得奥斯卡最佳男主角奖，该片还获得了奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Qué actor ganó el Premio de la Academia al Mejor Actor por \"Forrest Gump\"?", listOf("Tom Hanks", "Gary Oldman", "Daniel Day-Lewis", "Jack Nicholson"), "Cultura", "Tom Hanks ganó el Premio de la Academia al Mejor Actor en 1995 por su papel de Forrest Gump, una película que también ganó el Premio de la Academia a la Mejor Película.")
        ),
        BilingualQuestion(
            id = 11511, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("\"Parasite\" a remporté l'Oscar du meilleur film en quelle année?", listOf("2020", "2019", "2021", "2018"), "Culture", "Le film sud-coréen \"Parasite\" de Bong Joon-ho a remporté l'Oscar du meilleur film en 2020, devenant le premier film en langue étrangère à obtenir cette récompense."),
            en = LocalizedContent("In which year did \"Parasite\" win the Academy Award for Best Picture?", listOf("2020", "2019", "2021", "2018"), "Culture", "The South Korean film \"Parasite\" by Bong Joon-ho won the Academy Award for Best Picture in 2020, becoming the first foreign-language film to receive this award."),
            zh = LocalizedContent("《寄生虫》在哪一年获得奥斯卡最佳影片奖？", listOf("2020", "2019", "2021", "2018"), "文化", "奉俊昊执导的韩国电影《寄生虫》于2020年获得奥斯卡最佳影片奖，成为首部获此殊荣的外语片。"),
            es = LocalizedContent("¿En qué año ganó \"Parásitos\" el Premio de la Academia a la Mejor Película?", listOf("2020", "2019", "2021", "2018"), "Cultura", "La película surcoreana \"Parásitos\" de Bong Joon-ho ganó el Premio de la Academia a la Mejor Película en 2020, convirtiéndose en la primera película en lengua extranjera en recibir este galardón.")
        ),
        BilingualQuestion(
            id = 11512, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de Christopher Nolan a remporté l'Oscar du meilleur film?", listOf("Oppenheimer", "Inception", "Interstellar", "The Dark Knight Rises"), "Culture", "Oppenheimer a remporté l'Oscar du meilleur film en 2024, marquant la première fois qu'un film de Christopher Nolan obtenait cette récompense."),
            en = LocalizedContent("Which Christopher Nolan film won the Academy Award for Best Picture?", listOf("Oppenheimer", "Inception", "Interstellar", "The Dark Knight Rises"), "Culture", "Oppenheimer won the Academy Award for Best Picture in 2024, marking the first time a Christopher Nolan film received this award."),
            zh = LocalizedContent("克里斯托弗·诺兰的哪部电影获得了奥斯卡最佳影片奖？", listOf("奥本海默", "盗梦空间", "星际穿越", "蝙蝠侠：黑暗骑士崛起"), "文化", "《奥本海默》于2024年获得奥斯卡最佳影片奖，这是克里斯托弗·诺兰的电影首次获得该奖项。"),
            es = LocalizedContent("¿Qué película de Christopher Nolan ganó el Premio de la Academia a la Mejor Película?", listOf("Oppenheimer", "Inception", "Interstellar", "The Dark Knight Rises"), "Cultura", "Oppenheimer ganó el Premio de la Academia a la Mejor Película en 2024, marcando la primera vez que una película de Christopher Nolan obtenía este galardón.")
        ),
        BilingualQuestion(
            id = 11513, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Jack Nicholson a-t-il remporté l'Oscar du meilleur acteur?", listOf("3", "2", "4", "1"), "Culture", "Jack Nicholson a remporté l'Oscar du meilleur acteur pour ses rôles dans *Vol au-dessus d'un nid de coucou* (1975) et *Pour le pire et pour le meilleur* (1997), ainsi qu'un Oscar du meilleur acteur dans un second rôle pour *Les Infiltrés* (2006)."),
            en = LocalizedContent("How many times has Jack Nicholson won the Academy Award for Best Actor?", listOf("3", "2", "4", "1"), "Culture", "Jack Nicholson won the Academy Award for Best Actor for his roles in *One Flew Over the Cuckoo's Nest* (1975) and *As Good as It Gets* (1997), as well as an Academy Award for Best Supporting Actor for *The Departed* (2006)."),
            zh = LocalizedContent("杰克·尼科尔森获得过多少次奥斯卡最佳男主角奖？", listOf("3", "2", "4", "1"), "文化", "杰克·尼科尔森凭借《飞越疯人院》（1975）和《尽善尽美》（1997）获得奥斯卡最佳男主角奖，并凭借《无间道风云》（2006）获得奥斯卡最佳男配角奖。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Jack Nicholson el Premio de la Academia al Mejor Actor?", listOf("3", "2", "4", "1"), "Cultura", "Jack Nicholson ganó el Premio de la Academia al Mejor Actor por sus papeles en *Alguien voló sobre el nido del cuco* (1975) y *Mejor... imposible* (1997), así como un Premio de la Academia al Mejor Actor de Reparto por *Infiltrados* (2006).")
        ),
        BilingualQuestion(
            id = 11514, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a remporté l'Oscar du meilleur réalisateur pour \"Oppenheimer\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Wes Anderson", "Yorgos Lanthimos"), "Culture", "Christopher Nolan a remporté son premier Oscar du meilleur réalisateur en 2024 pour \"Oppenheimer\", un biopic sur le créateur de la bombe atomique."),
            en = LocalizedContent("Which director won the Academy Award for Best Director for \"Oppenheimer\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Wes Anderson", "Yorgos Lanthimos"), "Culture", "Christopher Nolan won his first Academy Award for Best Director in 2024 for \"Oppenheimer\", a biopic about the creator of the atomic bomb."),
            zh = LocalizedContent("哪位导演凭借《奥本海默》获得奥斯卡最佳导演奖？", listOf("克里斯托弗·诺兰", "丹尼斯·维伦纽瓦", "韦斯·安德森", "欧格斯·兰斯莫斯"), "文化", "克里斯托弗·诺兰于2024年凭借《奥本海默》获得他的首个奥斯卡最佳导演奖，该片是一部关于原子弹创造者的传记片。"),
            es = LocalizedContent("¿Qué director ganó el Premio de la Academia al Mejor Director por \"Oppenheimer\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Wes Anderson", "Yorgos Lanthimos"), "Cultura", "Christopher Nolan ganó su primer Premio de la Academia al Mejor Director en 2024 por \"Oppenheimer\", un biopic sobre el creador de la bomba atómica.")
        ),
        BilingualQuestion(
            id = 11515, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"Citizen Kane\" a remporté l'Oscar du meilleur film en quelle année?", listOf("1942", "1941", "1940", "1943"), "Culture", "Le film d'Orson Welles a été récompensé lors de la 14e cérémonie des Oscars, qui s'est tenue en 1942."),
            en = LocalizedContent("In which year did \"Citizen Kane\" win the Academy Award for Best Picture?", listOf("1942", "1941", "1940", "1943"), "Culture", "Orson Welles' film was awarded at the 14th Academy Awards ceremony, which took place in 1942."),
            zh = LocalizedContent("《公民凯恩》在哪一年获得奥斯卡最佳影片奖？", listOf("1942", "1941", "1940", "1943"), "文化", "奥逊·威尔斯的这部电影在第14届奥斯卡颁奖典礼上获奖，该典礼于1942年举行。"),
            es = LocalizedContent("¿En qué año ganó \"Ciudadano Kane\" el Premio de la Academia a la Mejor Película?", listOf("1942", "1941", "1940", "1943"), "Cultura", "La película de Orson Welles fue galardonada en la 14.ª ceremonia de los Premios de la Academia, que tuvo lugar en 1942.")
        ),
        BilingualQuestion(
            id = 11516, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'Oscars \"Ben-Hur\" a-t-il remportés?", listOf("11", "10", "9", "12"), "Culture", "Ben-Hur a remporté 11 Oscars en 1960, un record à l'époque, incluant celui du meilleur film. Ce total n'a été égalé que plus tard par Titanic et Le Seigneur des anneaux."),
            en = LocalizedContent("How many Oscars did \"Ben-Hur\" win?", listOf("11", "10", "9", "12"), "Culture", "Ben-Hur won 11 Oscars in 1960, a record at the time, including Best Picture. This total was later matched only by Titanic and The Lord of the Rings."),
            zh = LocalizedContent("《宾虚》获得了多少项奥斯卡奖？", listOf("11", "10", "9", "12"), "文化", "《宾虚》在1960年获得了11项奥斯卡奖，包括最佳影片，创下了当时的纪录。这一总数后来只有《泰坦尼克号》和《指环王》追平。"),
            es = LocalizedContent("¿Cuántos Premios de la Academia ganó \"Ben-Hur\"?", listOf("11", "10", "9", "12"), "Cultura", "Ben-Hur ganó 11 Premios de la Academia en 1960, un récord en ese momento, incluyendo Mejor Película. Este total solo fue igualado más tarde por Titanic y El Señor de los Anillos.")
        ),
        BilingualQuestion(
            id = 11517, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a remporté l'Oscar du meilleur acteur pour \"Philadelphia\"?", listOf("Tom Hanks", "Denzel Washington", "Jeff Bridges", "Sean Penn"), "Culture", "Tom Hanks a remporté l'Oscar du meilleur acteur en 1994 pour son rôle d'avocat séropositif dans \"Philadelphia\", un film marquant sur la discrimination liée au sida."),
            en = LocalizedContent("Which actor won the Academy Award for Best Actor for \"Philadelphia\"?", listOf("Tom Hanks", "Denzel Washington", "Jeff Bridges", "Sean Penn"), "Culture", "Tom Hanks won the Academy Award for Best Actor in 1994 for his role as a lawyer with HIV in \"Philadelphia\", a landmark film about AIDS discrimination."),
            zh = LocalizedContent("哪位演员凭借《费城故事》获得奥斯卡最佳男主角奖？", listOf("汤姆·汉克斯", "丹泽尔·华盛顿", "杰夫·布里吉斯", "西恩·潘"), "文化", "汤姆·汉克斯于1994年凭借在《费城故事》中饰演一名艾滋病律师获得奥斯卡最佳男主角奖，该片是一部关于艾滋病歧视的标志性电影。"),
            es = LocalizedContent("¿Qué actor ganó el Premio de la Academia al Mejor Actor por \"Philadelphia\"?", listOf("Tom Hanks", "Denzel Washington", "Jeff Bridges", "Sean Penn"), "Cultura", "Tom Hanks ganó el Premio de la Academia al Mejor Actor en 1994 por su papel de un abogado con VIH en \"Philadelphia\", una película emblemática sobre la discriminación relacionada con el SIDA.")
        ),
        BilingualQuestion(
            id = 11518, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("\"Moonlight\" a remporté l'Oscar du meilleur film en quelle année?", listOf("2017", "2016", "2018", "2015"), "Culture", "Le film \"Moonlight\" a remporté l'Oscar du meilleur film en 2017, une cérémonie marquée par une erreur historique lors de l'annonce du vainqueur."),
            en = LocalizedContent("In which year did \"Moonlight\" win the Academy Award for Best Picture?", listOf("2017", "2016", "2018", "2015"), "Culture", "The film \"Moonlight\" won the Academy Award for Best Picture in 2017, a ceremony marked by a historic error in the announcement of the winner."),
            zh = LocalizedContent("《月光男孩》在哪一年获得奥斯卡最佳影片奖？", listOf("2017", "2016", "2018", "2015"), "文化", "电影《月光男孩》于2017年获得奥斯卡最佳影片奖，该届颁奖典礼因宣布获奖者时出现历史性错误而闻名。"),
            es = LocalizedContent("¿En qué año ganó \"Moonlight\" el Premio de la Academia a la Mejor Película?", listOf("2017", "2016", "2018", "2015"), "Cultura", "La película \"Moonlight\" ganó el Premio de la Academia a la Mejor Película en 2017, una ceremonia marcada por un error histórico en el anuncio del ganador.")
        ),
        BilingualQuestion(
            id = 11519, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Clint Eastwood a remporté l'Oscar du meilleur film?", listOf("Million Dollar Baby", "Gran Torino", "Unforgiven", "Bronco Billy"), "Culture", "Million Dollar Baby, réalisé et interprété par Clint Eastwood, a remporté l'Oscar du meilleur film en 2005."),
            en = LocalizedContent("Which Clint Eastwood film won the Academy Award for Best Picture?", listOf("Million Dollar Baby", "Gran Torino", "Unforgiven", "Bronco Billy"), "Culture", "Million Dollar Baby, directed by and starring Clint Eastwood, won the Academy Award for Best Picture in 2005."),
            zh = LocalizedContent("克林特·伊斯特伍德的哪部电影获得了奥斯卡最佳影片奖？", listOf("百万美元宝贝", "老爷车", "不可饶恕", "布龙科·比利"), "文化", "由克林特·伊斯特伍德执导并主演的《百万美元宝贝》于2005年获得奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Qué película de Clint Eastwood ganó el Premio de la Academia a la Mejor Película?", listOf("Million Dollar Baby", "Gran Torino", "Sin perdón", "Bronco Billy"), "Cultura", "Million Dollar Baby, dirigida e interpretada por Clint Eastwood, ganó el Premio de la Academia a la Mejor Película en 2005.")
        ),
        BilingualQuestion(
            id = 11520, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a dirigé \"The Shawshank Redemption\"?", listOf("Frank Darabont", "Martin Scorsese", "Steven Spielberg", "Christopher Nolan"), "Culture", "Frank Darabont a réalisé ce film adapté d'une nouvelle de Stephen King, dont il a également écrit le scénario."),
            en = LocalizedContent("Which director directed \"The Shawshank Redemption\"?", listOf("Frank Darabont", "Martin Scorsese", "Steven Spielberg", "Christopher Nolan"), "Culture", "Frank Darabont directed this film adapted from a Stephen King novella, which he also wrote the screenplay for."),
            zh = LocalizedContent("哪位导演执导了《肖申克的救赎》？", listOf("弗兰克·德拉邦特", "马丁·斯科塞斯", "史蒂文·斯皮尔伯格", "克里斯托弗·诺兰"), "文化", "弗兰克·德拉邦特执导了这部改编自斯蒂芬·金中篇小说的电影，并亲自编写了剧本。"),
            es = LocalizedContent("¿Qué director dirigió \"The Shawshank Redemption\"?", listOf("Frank Darabont", "Martin Scorsese", "Steven Spielberg", "Christopher Nolan"), "Cultura", "Frank Darabont dirigió esta película adaptada de una novela corta de Stephen King, de la que también escribió el guion.")
        ),
        BilingualQuestion(
            id = 11521, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"Oppenheimer\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Steve Jobs", "Blade Runner 2049"), "Culture", "Christopher Nolan a réalisé \"Oppenheimer\", sorti en 2023, un biopic sur le physicien théoricien J. Robert Oppenheimer et le projet Manhattan."),
            en = LocalizedContent("Who directed \"Oppenheimer\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Steve Jobs", "Blade Runner 2049"), "Culture", "Christopher Nolan directed \"Oppenheimer\", released in 2023, a biopic about theoretical physicist J. Robert Oppenheimer and the Manhattan Project."),
            zh = LocalizedContent("谁执导了《奥本海默》？", listOf("克里斯托弗·诺兰", "丹尼斯·维伦纽瓦", "史蒂夫·乔布斯", "银翼杀手2049"), "文化", "克里斯托弗·诺兰执导了2023年上映的《奥本海默》，这是一部关于理论物理学家J·罗伯特·奥本海默和曼哈顿计划的传记片。"),
            es = LocalizedContent("¿Quién dirigió \"Oppenheimer\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Steve Jobs", "Blade Runner 2049"), "Cultura", "Christopher Nolan dirigió \"Oppenheimer\", estrenada en 2023, un biopic sobre el físico teórico J. Robert Oppenheimer y el Proyecto Manhattan.")
        ),
        BilingualQuestion(
            id = 11522, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur français a réalisé \"Léon\"?", listOf("Luc Besson", "Jean-Jacques Beineix", "Leos Carax", "Michel Gondry"), "Culture", "Luc Besson a réalisé et coécrit \"Léon\" (1994), un thriller emblématique avec Jean Reno et Natalie Portman."),
            en = LocalizedContent("Which French director directed \"Léon\"?", listOf("Luc Besson", "Jean-Jacques Beineix", "Leos Carax", "Michel Gondry"), "Culture", "Luc Besson directed and co-wrote \"Léon\" (1994), an iconic thriller starring Jean Reno and Natalie Portman."),
            zh = LocalizedContent("哪位法国导演执导了《这个杀手不太冷》？", listOf("吕克·贝松", "让-雅克·贝奈克斯", "莱奥·卡拉克斯", "米歇尔·贡德里"), "文化", "吕克·贝松执导并联合编剧了1994年的《这个杀手不太冷》，这是一部由让·雷诺和娜塔莉·波特曼主演的标志性惊悚片。"),
            es = LocalizedContent("¿Qué director francés dirigió \"Léon\"?", listOf("Luc Besson", "Jean-Jacques Beineix", "Leos Carax", "Michel Gondry"), "Cultura", "Luc Besson dirigió y coescribió \"Léon\" (1994), un thriller icónico protagonizado por Jean Reno y Natalie Portman.")
        ),
        BilingualQuestion(
            id = 11523, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé la trilogie originale de \"Star Wars\"?", listOf("George Lucas", "J.J. Abrams", "Rian Johnson", "Dave Filoni"), "Culture", "George Lucas a écrit et réalisé les trois premiers films de la saga, sortis entre 1977 et 1983."),
            en = LocalizedContent("Who directed the original \"Star Wars\" trilogy?", listOf("George Lucas", "J.J. Abrams", "Rian Johnson", "Dave Filoni"), "Culture", "George Lucas wrote and directed the first three films of the saga, released between 1977 and 1983."),
            zh = LocalizedContent("谁执导了最初的《星球大战》三部曲？", listOf("乔治·卢卡斯", "J·J·艾布拉姆斯", "莱恩·约翰逊", "戴夫·菲洛尼"), "文化", "乔治·卢卡斯编写并执导了该系列的前三部电影，于1977年至1983年间上映。"),
            es = LocalizedContent("¿Quién dirigió la trilogía original de \"Star Wars\"?", listOf("George Lucas", "J.J. Abrams", "Rian Johnson", "Dave Filoni"), "Cultura", "George Lucas escribió y dirigió las tres primeras películas de la saga, estrenadas entre 1977 y 1983.")
        ),
        BilingualQuestion(
            id = 11524, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a dirigé tous les films de la franchise \"Indiana Jones\" (originaux)?", listOf("Steven Spielberg", "George Lucas", "Martin Scorsese", "Francis Ford Coppola"), "Culture", "Steven Spielberg a réalisé les quatre premiers films Indiana Jones, de \"Les Aventuriers de l'Arche perdue\" (1981) à \"Le Royaume du Crâne de Cristal\" (2008)."),
            en = LocalizedContent("Which director directed all the films in the original \"Indiana Jones\" franchise?", listOf("Steven Spielberg", "George Lucas", "Martin Scorsese", "Francis Ford Coppola"), "Culture", "Steven Spielberg directed the first four Indiana Jones films, from \"Raiders of the Lost Ark\" (1981) to \"Indiana Jones and the Kingdom of the Crystal Skull\" (2008)."),
            zh = LocalizedContent("哪位导演执导了原版《夺宝奇兵》系列的所有电影？", listOf("史蒂文·斯皮尔伯格", "乔治·卢卡斯", "马丁·斯科塞斯", "弗朗西斯·福特·科波拉"), "文化", "史蒂文·斯皮尔伯格执导了前四部《夺宝奇兵》电影，从1981年的《夺宝奇兵》到2008年的《夺宝奇兵4》。"),
            es = LocalizedContent("¿Qué director dirigió todas las películas de la franquicia original de \"Indiana Jones\"?", listOf("Steven Spielberg", "George Lucas", "Martin Scorsese", "Francis Ford Coppola"), "Cultura", "Steven Spielberg dirigió las primeras cuatro películas de Indiana Jones, desde \"En busca del arca perdida\" (1981) hasta \"Indiana Jones y el reino de la calavera de cristal\" (2008).")
        ),
        BilingualQuestion(
            id = 11525, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"The Godfather\"?", listOf("Francis Ford Coppola", "Martin Scorsese", "Steven Spielberg", "Brian De Palma"), "Culture", "Francis Ford Coppola a réalisé \"The Godfather\" en 1972, adaptant le roman de Mario Puzo. Ce film est devenu un classique du cinéma, remportant trois Oscars."),
            en = LocalizedContent("Who directed \"The Godfather\"?", listOf("Francis Ford Coppola", "Martin Scorsese", "Steven Spielberg", "Brian De Palma"), "Culture", "Francis Ford Coppola directed \"The Godfather\" in 1972, adapting Mario Puzo's novel. The film became a cinema classic, winning three Oscars."),
            zh = LocalizedContent("谁执导了《教父》？", listOf("弗朗西斯·福特·科波拉", "马丁·斯科塞斯", "史蒂文·斯皮尔伯格", "布莱恩·德·帕尔玛"), "文化", "弗朗西斯·福特·科波拉于1972年执导了《教父》，改编自马里奥·普佐的小说。这部电影成为电影经典，赢得了三项奥斯卡奖。"),
            es = LocalizedContent("¿Quién dirigió \"El Padrino\"?", listOf("Francis Ford Coppola", "Martin Scorsese", "Steven Spielberg", "Brian De Palma"), "Cultura", "Francis Ford Coppola dirigió \"El Padrino\" en 1972, adaptando la novela de Mario Puzo. La película se convirtió en un clásico del cine, ganando tres premios Oscar.")
        ),
        BilingualQuestion(
            id = 11526, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a réalisé \"Pulp Fiction\"?", listOf("Quentin Tarantino", "Martin Scorsese", "Paul Thomas Anderson", "Joel Coen"), "Culture", "Quentin Tarantino a réalisé \"Pulp Fiction\" en 1994, un film culte qui a remporté la Palme d'Or à Cannes et révolutionné le cinéma indépendant."),
            en = LocalizedContent("Which director directed \"Pulp Fiction\"?", listOf("Quentin Tarantino", "Martin Scorsese", "Paul Thomas Anderson", "Joel Coen"), "Culture", "Quentin Tarantino directed \"Pulp Fiction\" in 1994, a cult film that won the Palme d'Or at Cannes and revolutionized independent cinema."),
            zh = LocalizedContent("哪位导演执导了《低俗小说》？", listOf("昆汀·塔伦蒂诺", "马丁·斯科塞斯", "保罗·托马斯·安德森", "乔尔·科恩"), "文化", "昆汀·塔伦蒂诺于1994年执导了《低俗小说》，这部邪典电影获得了戛纳金棕榈奖，并革新了独立电影。"),
            es = LocalizedContent("¿Qué director dirigió \"Pulp Fiction\"?", listOf("Quentin Tarantino", "Martin Scorsese", "Paul Thomas Anderson", "Joel Coen"), "Cultura", "Quentin Tarantino dirigió \"Pulp Fiction\" en 1994, una película de culto que ganó la Palma de Oro en Cannes y revolucionó el cine independiente.")
        ),
        BilingualQuestion(
            id = 11527, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"Inception\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Darren Aronofsky", "Charlie Kaufman"), "Culture", "Christopher Nolan est le réalisateur britannique connu pour ses films complexes et novateurs, et Inception, sorti en 2010, est l'un de ses plus grands succès, explorant les rêves et la réalité."),
            en = LocalizedContent("Who directed \"Inception\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Darren Aronofsky", "Charlie Kaufman"), "Culture", "Christopher Nolan is the British director known for his complex and innovative films, and Inception, released in 2010, is one of his greatest successes, exploring dreams and reality."),
            zh = LocalizedContent("谁执导了《盗梦空间》？", listOf("克里斯托弗·诺兰", "丹尼斯·维伦纽瓦", "达伦·阿伦诺夫斯基", "查理·考夫曼"), "文化", "克里斯托弗·诺兰是一位以复杂和创新电影闻名的英国导演，2010年上映的《盗梦空间》是他最成功的作品之一，探索了梦境与现实。"),
            es = LocalizedContent("¿Quién dirigió \"Inception\"?", listOf("Christopher Nolan", "Denis Villeneuve", "Darren Aronofsky", "Charlie Kaufman"), "Cultura", "Christopher Nolan es el director británico conocido por sus películas complejas e innovadoras, e Inception, estrenada en 2010, es uno de sus mayores éxitos, explorando los sueños y la realidad.")
        ),
        BilingualQuestion(
            id = 11528, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a réalisé \"2001: A Space Odyssey\"?", listOf("Stanley Kubrick", "George Lucas", "Steven Spielberg", "Robert Wise"), "Culture", "Stanley Kubrick a réalisé ce film de science-fiction sorti en 1968, considéré comme une œuvre majeure du genre."),
            en = LocalizedContent("Which director directed \"2001: A Space Odyssey\"?", listOf("Stanley Kubrick", "George Lucas", "Steven Spielberg", "Robert Wise"), "Culture", "Stanley Kubrick directed this science fiction film released in 1968, considered a major work of the genre."),
            zh = LocalizedContent("哪位导演执导了《2001太空漫游》？", listOf("斯坦利·库布里克", "乔治·卢卡斯", "史蒂文·斯皮尔伯格", "罗伯特·怀斯"), "文化", "斯坦利·库布里克执导了这部1968年上映的科幻电影，被认为是该类型的杰作。"),
            es = LocalizedContent("¿Qué director dirigió \"2001: Una odisea del espacio\"?", listOf("Stanley Kubrick", "George Lucas", "Steven Spielberg", "Robert Wise"), "Cultura", "Stanley Kubrick dirigió esta película de ciencia ficción estrenada en 1968, considerada una obra maestra del género.")
        ),
        BilingualQuestion(
            id = 11529, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Parasite\"?", listOf("Bong Joon-ho", "Lee Chang-dong", "Park Chan-wook", "Kim Ki-duk"), "Culture", "Bong Joon-ho est le réalisateur sud-coréen du film \"Parasite\", qui a remporté la Palme d'Or à Cannes en 2019 et l'Oscar du meilleur film en 2020."),
            en = LocalizedContent("Who directed \"Parasite\"?", listOf("Bong Joon-ho", "Lee Chang-dong", "Park Chan-wook", "Kim Ki-duk"), "Culture", "Bong Joon-ho is the South Korean director of the film \"Parasite\", which won the Palme d'Or at Cannes in 2019 and the Oscar for Best Picture in 2020."),
            zh = LocalizedContent("谁执导了《寄生虫》？", listOf("奉俊昊", "李沧东", "朴赞郁", "金基德"), "文化", "奉俊昊是韩国导演，执导了电影《寄生虫》，该片在2019年获得戛纳金棕榈奖，并在2020年获得奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Quién dirigió \"Parásitos\"?", listOf("Bong Joon-ho", "Lee Chang-dong", "Park Chan-wook", "Kim Ki-duk"), "Cultura", "Bong Joon-ho es el director surcoreano de la película \"Parásitos\", que ganó la Palma de Oro en Cannes en 2019 y el Oscar a la mejor película en 2020.")
        ),
        BilingualQuestion(
            id = 11530, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur français a réalisé \"La Haine\"?", listOf("Mathieu Kassovitz", "Laurent Cantet", "Cédric Kahn", "Stéphane Brize"), "Culture", "Mathieu Kassovitz a réalisé \"La Haine\" en 1995, un film marquant sur les tensions sociales dans les banlieues françaises, qui a remporté le prix de la mise en scène au Festival de Cannes."),
            en = LocalizedContent("Which French director directed \"La Haine\"?", listOf("Mathieu Kassovitz", "Laurent Cantet", "Cédric Kahn", "Stéphane Brize"), "Culture", "Mathieu Kassovitz directed \"La Haine\" in 1995, a landmark film about social tensions in the French suburbs, which won the Best Director award at the Cannes Film Festival."),
            zh = LocalizedContent("哪位法国导演执导了《怒火青春》？", listOf("马修·卡索维茨", "洛朗·康泰", "塞德里克·康", "斯特凡·布里兹"), "文化", "马修·卡索维茨于1995年执导了《怒火青春》，这是一部关于法国郊区社会紧张局势的标志性电影，获得了戛纳电影节最佳导演奖。"),
            es = LocalizedContent("¿Qué director francés dirigió \"La Haine\"?", listOf("Mathieu Kassovitz", "Laurent Cantet", "Cédric Kahn", "Stéphane Brize"), "Cultura", "Mathieu Kassovitz dirigió \"La Haine\" en 1995, una película emblemática sobre las tensiones sociales en los suburbios franceses, que ganó el premio a la mejor dirección en el Festival de Cannes.")
        ),
        BilingualQuestion(
            id = 11531, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Blade Runner\"?", listOf("Ridley Scott", "John Carpenter", "James Cameron", "Paul Verhoeven"), "Culture", "Ridley Scott a réalisé \"Blade Runner\" en 1982, adapté du roman \"Les androïdes rêvent-ils de moutons électriques ?\" de Philip K. Dick."),
            en = LocalizedContent("Who directed \"Blade Runner\"?", listOf("Ridley Scott", "John Carpenter", "James Cameron", "Paul Verhoeven"), "Culture", "Ridley Scott directed \"Blade Runner\" in 1982, adapted from the novel \"Do Androids Dream of Electric Sheep?\" by Philip K. Dick."),
            zh = LocalizedContent("谁执导了《银翼杀手》？", listOf("雷德利·斯科特", "约翰·卡朋特", "詹姆斯·卡梅隆", "保罗·范霍文"), "文化", "雷德利·斯科特于1982年执导了《银翼杀手》，改编自菲利普·K·迪克的小说《仿生人会梦见电子羊吗？》。"),
            es = LocalizedContent("¿Quién dirigió \"Blade Runner\"?", listOf("Ridley Scott", "John Carpenter", "James Cameron", "Paul Verhoeven"), "Cultura", "Ridley Scott dirigió \"Blade Runner\" en 1982, adaptada de la novela \"¿Sueñan los androides con ovejas eléctricas?\" de Philip K. Dick.")
        ),
        BilingualQuestion(
            id = 11532, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé \"L'Armée des Douze Singes\"?", listOf("Terry Gilliam", "Tim Burton", "David Fincher", "Christopher Nolan"), "Culture", "Terry Gilliam a réalisé L'Armée des Douze Singes en 1995, adapté du court métrage français La Jetée de Chris Marker."),
            en = LocalizedContent("Which director directed \"12 Monkeys\"?", listOf("Terry Gilliam", "Tim Burton", "David Fincher", "Christopher Nolan"), "Culture", "Terry Gilliam directed 12 Monkeys in 1995, adapted from the French short film La Jetée by Chris Marker."),
            zh = LocalizedContent("哪位导演执导了《十二猴子》？", listOf("特瑞·吉列姆", "蒂姆·伯顿", "大卫·芬奇", "克里斯托弗·诺兰"), "文化", "特瑞·吉列姆于1995年执导了《十二猴子》，改编自克里斯·马克的法国短片《堤》。"),
            es = LocalizedContent("¿Qué director dirigió \"12 Monos\"?", listOf("Terry Gilliam", "Tim Burton", "David Fincher", "Christopher Nolan"), "Cultura", "Terry Gilliam dirigió 12 Monos en 1995, adaptada del cortometraje francés La Jetée de Chris Marker.")
        ),
        BilingualQuestion(
            id = 11533, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"The Matrix\"?", listOf("Les Wachowski", "James Cameron", "Steven Spielberg", "George Lucas"), "Culture", "Le film \"The Matrix\" (1999) a été réalisé par les sœurs Lana et Lilly Wachowski, alors créditées sous le nom des frères Wachowski."),
            en = LocalizedContent("Who directed \"The Matrix\"?", listOf("The Wachowskis", "James Cameron", "Steven Spielberg", "George Lucas"), "Culture", "The film \"The Matrix\" (1999) was directed by Lana and Lilly Wachowski, then credited as the Wachowski brothers."),
            zh = LocalizedContent("谁执导了《黑客帝国》？", listOf("沃卓斯基姐妹", "詹姆斯·卡梅隆", "史蒂文·斯皮尔伯格", "乔治·卢卡斯"), "文化", "电影《黑客帝国》（1999年）由拉娜·沃卓斯基和莉莉·沃卓斯基执导，当时以沃卓斯基兄弟的名义署名。"),
            es = LocalizedContent("¿Quién dirigió \"The Matrix\"?", listOf("Las Wachowski", "James Cameron", "Steven Spielberg", "George Lucas"), "Cultura", "La película \"The Matrix\" (1999) fue dirigida por Lana y Lilly Wachowski, entonces acreditadas como los hermanos Wachowski.")
        ),
        BilingualQuestion(
            id = 11534, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a réalisé \"Interstellar\"?", listOf("Christopher Nolan", "Steven Spielberg", "Denis Villeneuve", "James Cameron"), "Culture", "Christopher Nolan a réalisé Interstellar en 2014, un film de science-fiction sur l'exploration spatiale et les trous de ver."),
            en = LocalizedContent("Which director directed \"Interstellar\"?", listOf("Christopher Nolan", "Steven Spielberg", "Denis Villeneuve", "James Cameron"), "Culture", "Christopher Nolan directed Interstellar in 2014, a science fiction film about space exploration and wormholes."),
            zh = LocalizedContent("哪位导演执导了《星际穿越》？", listOf("克里斯托弗·诺兰", "史蒂文·斯皮尔伯格", "丹尼斯·维伦纽瓦", "詹姆斯·卡梅隆"), "文化", "克里斯托弗·诺兰于2014年执导了《星际穿越》，一部关于太空探索和虫洞的科幻电影。"),
            es = LocalizedContent("¿Qué director dirigió \"Interstellar\"?", listOf("Christopher Nolan", "Steven Spielberg", "Denis Villeneuve", "James Cameron"), "Cultura", "Christopher Nolan dirigió Interstellar en 2014, una película de ciencia ficción sobre la exploración espacial y los agujeros de gusano.")
        ),
        BilingualQuestion(
            id = 11535, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Requiem for a Dream\"?", listOf("Darren Aronofsky", "David Fincher", "Denis Villeneuve", "Michael Haneke"), "Culture", "Darren Aronofsky a réalisé ce film en 2000, adapté du roman d'Hubert Selby Jr. Le film est connu pour son montage intense et sa bande-son emblématique de Clint Mansell."),
            en = LocalizedContent("Who directed \"Requiem for a Dream\"?", listOf("Darren Aronofsky", "David Fincher", "Denis Villeneuve", "Michael Haneke"), "Culture", "Darren Aronofsky directed this film in 2000, adapted from the novel by Hubert Selby Jr. The film is known for its intense editing and iconic soundtrack by Clint Mansell."),
            zh = LocalizedContent("谁执导了《梦之安魂曲》？", listOf("达伦·阿伦诺夫斯基", "大卫·芬奇", "丹尼斯·维伦纽瓦", "迈克尔·哈内克"), "文化", "达伦·阿伦诺夫斯基于2000年执导了这部电影，改编自小休伯特·塞尔比的小说。该片以其强烈的剪辑和克林特·曼塞尔标志性的配乐而闻名。"),
            es = LocalizedContent("¿Quién dirigió \"Réquiem por un sueño\"?", listOf("Darren Aronofsky", "David Fincher", "Denis Villeneuve", "Michael Haneke"), "Cultura", "Darren Aronofsky dirigió esta película en 2000, adaptada de la novela de Hubert Selby Jr. La película es conocida por su montaje intenso y su banda sonora icónica de Clint Mansell.")
        ),
        BilingualQuestion(
            id = 11536, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé \"Mulholland Drive\"?", listOf("David Lynch", "David Fincher", "Paul Thomas Anderson", "Robert Altman"), "Culture", "David Lynch a réalisé Mulholland Drive en 2001, un film onirique et complexe qui a remporté la Palme d'or à Cannes."),
            en = LocalizedContent("Which director directed \"Mulholland Drive\"?", listOf("David Lynch", "David Fincher", "Paul Thomas Anderson", "Robert Altman"), "Culture", "David Lynch directed Mulholland Drive in 2001, a dreamlike and complex film that won the Palme d'Or at Cannes."),
            zh = LocalizedContent("哪位导演执导了《穆赫兰道》？", listOf("大卫·林奇", "大卫·芬奇", "保罗·托马斯·安德森", "罗伯特·奥特曼"), "文化", "大卫·林奇于2001年执导了《穆赫兰道》，一部如梦似幻且复杂的电影，获得了戛纳金棕榈奖。"),
            es = LocalizedContent("¿Qué director dirigió \"Mulholland Drive\"?", listOf("David Lynch", "David Fincher", "Paul Thomas Anderson", "Robert Altman"), "Cultura", "David Lynch dirigió Mulholland Drive en 2001, una película onírica y compleja que ganó la Palma de Oro en Cannes.")
        ),
        BilingualQuestion(
            id = 11537, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"Fight Club\"?", listOf("David Fincher", "Christopher Nolan", "Michael Haneke", "Denis Villeneuve"), "Culture", "David Fincher a réalisé \"Fight Club\" en 1999, adaptant le roman de Chuck Palahniuk. Le film est devenu culte pour sa critique de la société de consommation."),
            en = LocalizedContent("Who directed \"Fight Club\"?", listOf("David Fincher", "Christopher Nolan", "Michael Haneke", "Denis Villeneuve"), "Culture", "David Fincher directed \"Fight Club\" in 1999, adapting Chuck Palahniuk's novel. The film became a cult classic for its critique of consumer society."),
            zh = LocalizedContent("谁执导了《搏击俱乐部》？", listOf("大卫·芬奇", "克里斯托弗·诺兰", "迈克尔·哈内克", "丹尼斯·维伦纽瓦"), "文化", "大卫·芬奇于1999年执导了《搏击俱乐部》，改编自查克·帕拉尼克的同名小说。该片因其对消费社会的批判而成为邪典经典。"),
            es = LocalizedContent("¿Quién dirigió \"El club de la lucha\"?", listOf("David Fincher", "Christopher Nolan", "Michael Haneke", "Denis Villeneuve"), "Cultura", "David Fincher dirigió \"El club de la lucha\" en 1999, adaptando la novela de Chuck Palahniuk. La película se convirtió en un clásico de culto por su crítica a la sociedad de consumo.")
        ),
        BilingualQuestion(
            id = 11538, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé \"La Haine\" en 1995?", listOf("Mathieu Kassovitz", "Cédric Kahn", "Laurent Cantet", "Stéphane Brize"), "Culture", "Mathieu Kassovitz a réalisé \"La Haine\" en 1995, un film emblématique sur les tensions sociales dans les banlieues françaises, qui a remporté le prix de la mise en scène au Festival de Cannes."),
            en = LocalizedContent("Which director directed \"La Haine\" in 1995?", listOf("Mathieu Kassovitz", "Cédric Kahn", "Laurent Cantet", "Stéphane Brize"), "Culture", "Mathieu Kassovitz directed \"La Haine\" in 1995, an iconic film about social tensions in the French suburbs, which won the Best Director award at the Cannes Film Festival."),
            zh = LocalizedContent("哪位导演在1995年执导了《怒火青春》？", listOf("马修·卡索维茨", "塞德里克·康", "洛朗·康泰", "斯特凡·布里兹"), "文化", "马修·卡索维茨于1995年执导了《怒火青春》，一部关于法国郊区社会紧张局势的标志性电影，获得了戛纳电影节最佳导演奖。"),
            es = LocalizedContent("¿Qué director dirigió \"La Haine\" en 1995?", listOf("Mathieu Kassovitz", "Cédric Kahn", "Laurent Cantet", "Stéphane Brize"), "Cultura", "Mathieu Kassovitz dirigió \"La Haine\" en 1995, una película icónica sobre las tensiones sociales en los suburbios franceses, que ganó el premio a la mejor dirección en el Festival de Cannes.")
        ),
        BilingualQuestion(
            id = 11539, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Whiplash\"?", listOf("Damien Chazelle", "Darren Aronofsky", "David Fincher", "Denis Villeneuve"), "Culture", "Damien Chazelle a réalisé Whiplash en 2014, un drame sur un batteur de jazz et son professeur tyrannique. Le film a remporté trois Oscars, dont celui du meilleur acteur dans un second rôle pour J.K. Simmons."),
            en = LocalizedContent("Who directed \"Whiplash\"?", listOf("Damien Chazelle", "Darren Aronofsky", "David Fincher", "Denis Villeneuve"), "Culture", "Damien Chazelle directed Whiplash in 2014, a drama about a jazz drummer and his tyrannical teacher. The film won three Oscars, including Best Supporting Actor for J.K. Simmons."),
            zh = LocalizedContent("谁执导了《爆裂鼓手》？", listOf("达米恩·查泽雷", "达伦·阿伦诺夫斯基", "大卫·芬奇", "丹尼斯·维伦纽瓦"), "文化", "达米恩·查泽雷于2014年执导了《爆裂鼓手》，一部关于爵士鼓手和他专制老师的剧情片。该片获得了三项奥斯卡奖，包括J·K·西蒙斯的最佳男配角奖。"),
            es = LocalizedContent("¿Quién dirigió \"Whiplash\"?", listOf("Damien Chazelle", "Darren Aronofsky", "David Fincher", "Denis Villeneuve"), "Cultura", "Damien Chazelle dirigió Whiplash en 2014, un drama sobre un baterista de jazz y su profesor tiránico. La película ganó tres premios Oscar, incluyendo el de mejor actor de reparto para J.K. Simmons.")
        ),
        BilingualQuestion(
            id = 11540, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué le rôle de Batman dans la trilogie de Christopher Nolan?", listOf("Christian Bale", "Ben Affleck", "Michael Keaton", "Val Kilmer"), "Culture", "Christian Bale a incarné Batman dans la trilogie The Dark Knight réalisée par Christopher Nolan entre 2005 et 2012."),
            en = LocalizedContent("Which actor played the role of Batman in Christopher Nolan's trilogy?", listOf("Christian Bale", "Ben Affleck", "Michael Keaton", "Val Kilmer"), "Culture", "Christian Bale portrayed Batman in The Dark Knight trilogy directed by Christopher Nolan between 2005 and 2012."),
            zh = LocalizedContent("哪位演员在克里斯托弗·诺兰的三部曲中饰演了蝙蝠侠？", listOf("克里斯蒂安·贝尔", "本·阿弗莱克", "迈克尔·基顿", "瓦尔·基尔默"), "文化", "克里斯蒂安·贝尔在2005年至2012年间克里斯托弗·诺兰执导的《黑暗骑士》三部曲中饰演蝙蝠侠。"),
            es = LocalizedContent("¿Qué actor interpretó a Batman en la trilogía de Christopher Nolan?", listOf("Christian Bale", "Ben Affleck", "Michael Keaton", "Val Kilmer"), "Cultura", "Christian Bale interpretó a Batman en la trilogía The Dark Knight dirigida por Christopher Nolan entre 2005 y 2012.")
        ),
        BilingualQuestion(
            id = 11541, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a joué le rôle d'Iron Man dans l'univers Marvel?", listOf("Robert Downey Jr.", "Tom Cruise", "Chris Evans", "Chris Hemsworth"), "Culture", "Robert Downey Jr. a incarné Tony Stark / Iron Man dans le Marvel Cinematic Universe de 2008 à 2019, lançant la franchise avec le premier film Iron Man."),
            en = LocalizedContent("Who played the role of Iron Man in the Marvel universe?", listOf("Robert Downey Jr.", "Tom Cruise", "Chris Evans", "Chris Hemsworth"), "Culture", "Robert Downey Jr. portrayed Tony Stark / Iron Man in the Marvel Cinematic Universe from 2008 to 2019, launching the franchise with the first Iron Man film."),
            zh = LocalizedContent("谁在漫威宇宙中饰演了钢铁侠？", listOf("小罗伯特·唐尼", "汤姆·克鲁斯", "克里斯·埃文斯", "克里斯·海姆斯沃斯"), "文化", "小罗伯特·唐尼在2008年至2019年的漫威电影宇宙中饰演托尼·斯塔克/钢铁侠，并以第一部《钢铁侠》电影开启了该系列。"),
            es = LocalizedContent("¿Quién interpretó a Iron Man en el universo Marvel?", listOf("Robert Downey Jr.", "Tom Cruise", "Chris Evans", "Chris Hemsworth"), "Cultura", "Robert Downey Jr. interpretó a Tony Stark / Iron Man en el Universo Cinematográfico de Marvel de 2008 a 2019, lanzando la franquicia con la primera película de Iron Man.")
        ),
        BilingualQuestion(
            id = 11542, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a incarné James Bond le plus longtemps?", listOf("Roger Moore", "Sean Connery", "Pierce Brosnan", "Daniel Craig"), "Culture", "Roger Moore a interprété James Bond dans sept films officiels entre 1973 et 1985, soit la plus longue période de douze ans pour un acteur dans ce rôle."),
            en = LocalizedContent("Which actor portrayed James Bond the longest?", listOf("Roger Moore", "Sean Connery", "Pierce Brosnan", "Daniel Craig"), "Culture", "Roger Moore played James Bond in seven official films between 1973 and 1985, the longest tenure of twelve years for an actor in this role."),
            zh = LocalizedContent("哪位演员饰演詹姆斯·邦德的时间最长？", listOf("罗杰·摩尔", "肖恩·康纳利", "皮尔斯·布鲁斯南", "丹尼尔·克雷格"), "文化", "罗杰·摩尔在1973年至1985年间在七部官方电影中饰演詹姆斯·邦德，是饰演该角色时间最长的演员，长达十二年。"),
            es = LocalizedContent("¿Qué actor interpretó a James Bond durante más tiempo?", listOf("Roger Moore", "Sean Connery", "Pierce Brosnan", "Daniel Craig"), "Cultura", "Roger Moore interpretó a James Bond en siete películas oficiales entre 1973 y 1985, siendo el período más largo de doce años para un actor en este papel.")
        ),
        BilingualQuestion(
            id = 11543, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a joué le Joker dans \"The Dark Knight\"?", listOf("Heath Ledger", "Jack Nicholson", "Joaquin Phoenix", "Jared Leto"), "Culture", "Heath Ledger a incarné le Joker dans \"The Dark Knight\" de Christopher Nolan en 2008, un rôle qui lui a valu un Oscar posthume du meilleur acteur dans un second rôle."),
            en = LocalizedContent("Who played the Joker in \"The Dark Knight\"?", listOf("Heath Ledger", "Jack Nicholson", "Joaquin Phoenix", "Jared Leto"), "Culture", "Heath Ledger portrayed the Joker in Christopher Nolan's \"The Dark Knight\" in 2008, a role that earned him a posthumous Academy Award for Best Supporting Actor."),
            zh = LocalizedContent("谁在《黑暗骑士》中饰演了小丑？", listOf("希斯·莱杰", "杰克·尼科尔森", "华金·菲尼克斯", "杰瑞德·莱托"), "文化", "希斯·莱杰在2008年克里斯托弗·诺兰的《黑暗骑士》中饰演小丑，这一角色为他赢得了追授的奥斯卡最佳男配角奖。"),
            es = LocalizedContent("¿Quién interpretó al Joker en \"The Dark Knight\"?", listOf("Heath Ledger", "Jack Nicholson", "Joaquin Phoenix", "Jared Leto"), "Cultura", "Heath Ledger interpretó al Joker en \"The Dark Knight\" de Christopher Nolan en 2008, un papel que le valió un Oscar póstumo al mejor actor de reparto.")
        ),
        BilingualQuestion(
            id = 11544, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué le rôle de Forrest Gump?", listOf("Tom Hanks", "Gary Oldman", "Kevin Spacey", "William H. Macy"), "Culture", "Tom Hanks a incarné Forrest Gump dans le film éponyme de 1994, réalisé par Robert Zemeckis. Ce rôle lui a valu l'Oscar du meilleur acteur."),
            en = LocalizedContent("Which actor played the role of Forrest Gump?", listOf("Tom Hanks", "Gary Oldman", "Kevin Spacey", "William H. Macy"), "Culture", "Tom Hanks portrayed Forrest Gump in the 1994 film of the same name, directed by Robert Zemeckis. This role earned him the Academy Award for Best Actor."),
            zh = LocalizedContent("哪位演员饰演了阿甘的角色？", listOf("汤姆·汉克斯", "加里·奥德曼", "凯文·史派西", "威廉·H·梅西"), "文化", "汤姆·汉克斯在1994年罗伯特·泽米吉斯执导的同名电影中饰演阿甘，这一角色为他赢得了奥斯卡最佳男主角奖。"),
            es = LocalizedContent("¿Qué actor interpretó el papel de Forrest Gump?", listOf("Tom Hanks", "Gary Oldman", "Kevin Spacey", "William H. Macy"), "Cultura", "Tom Hanks interpretó a Forrest Gump en la película homónima de 1994, dirigida por Robert Zemeckis. Este papel le valió el Oscar al mejor actor.")
        ),
        BilingualQuestion(
            id = 11545, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a joué le Docteur dans \"Doctor Who\" le plus longtemps à l'écran?", listOf("William Hartnell", "Tom Baker", "David Tennant", "Matt Smith"), "Culture", "Tom Baker a incarné le Docteur de 1974 à 1981, soit sept saisons, ce qui en fait l'acteur ayant tenu le rôle le plus longtemps dans la série classique."),
            en = LocalizedContent("Who played the Doctor in \"Doctor Who\" the longest on screen?", listOf("William Hartnell", "Tom Baker", "David Tennant", "Matt Smith"), "Culture", "Tom Baker played the Doctor from 1974 to 1981, seven seasons, making him the actor who held the role the longest in the classic series."),
            zh = LocalizedContent("谁在《神秘博士》中饰演博士的时间最长？", listOf("威廉·哈特内尔", "汤姆·贝克", "大卫·田纳特", "马特·史密斯"), "文化", "汤姆·贝克从1974年到1981年饰演博士，共七季，是经典系列中饰演该角色时间最长的演员。"),
            es = LocalizedContent("¿Quién interpretó al Doctor en \"Doctor Who\" durante más tiempo en pantalla?", listOf("William Hartnell", "Tom Baker", "David Tennant", "Matt Smith"), "Cultura", "Tom Baker interpretó al Doctor de 1974 a 1981, siete temporadas, lo que lo convierte en el actor que mantuvo el papel durante más tiempo en la serie clásica.")
        ),
        BilingualQuestion(
            id = 11546, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a incarné Superman dans l'univers DC (Henry Cavill)?", listOf("Henry Cavill", "Brandon Routh", "Tom Welling", "George Reeves"), "Culture", "Henry Cavill a interprété Superman dans les films de l'univers cinématographique DC, notamment dans Man of Steel (2013), Batman v Superman (2016) et Justice League (2017)."),
            en = LocalizedContent("Which actor portrayed Superman in the DC universe (Henry Cavill)?", listOf("Henry Cavill", "Brandon Routh", "Tom Welling", "George Reeves"), "Culture", "Henry Cavill played Superman in the DC Extended Universe films, including Man of Steel (2013), Batman v Superman (2016), and Justice League (2017)."),
            zh = LocalizedContent("哪位演员在DC宇宙中饰演了超人（亨利·卡维尔）？", listOf("亨利·卡维尔", "布兰登·罗斯", "汤姆·威灵", "乔治·里弗斯"), "文化", "亨利·卡维尔在DC扩展宇宙电影中饰演超人，包括《超人：钢铁之躯》（2013）、《蝙蝠侠大战超人》（2016）和《正义联盟》（2017）。"),
            es = LocalizedContent("¿Qué actor interpretó a Superman en el universo DC (Henry Cavill)?", listOf("Henry Cavill", "Brandon Routh", "Tom Welling", "George Reeves"), "Cultura", "Henry Cavill interpretó a Superman en las películas del Universo Extendido de DC, incluyendo Man of Steel (2013), Batman v Superman (2016) y Justice League (2017).")
        ),
        BilingualQuestion(
            id = 11547, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a joué le rôle de Legolas dans \"Le Seigneur des Anneaux\"?", listOf("Orlando Bloom", "Viggo Mortensen", "Ian McKellen", "Elijah Wood"), "Culture", "Orlando Bloom a incarné l'elfe Legolas dans la trilogie du Seigneur des Anneaux de Peter Jackson, un rôle qui a lancé sa carrière internationale."),
            en = LocalizedContent("Who played the role of Legolas in \"The Lord of the Rings\"?", listOf("Orlando Bloom", "Viggo Mortensen", "Ian McKellen", "Elijah Wood"), "Culture", "Orlando Bloom portrayed the elf Legolas in Peter Jackson's Lord of the Rings trilogy, a role that launched his international career."),
            zh = LocalizedContent("谁在《指环王》中饰演了莱戈拉斯？", listOf("奥兰多·布鲁姆", "维果·莫特森", "伊恩·麦克莱恩", "伊利亚·伍德"), "文化", "奥兰多·布鲁姆在彼得·杰克逊的《指环王》三部曲中饰演精灵莱戈拉斯，这一角色开启了他的国际职业生涯。"),
            es = LocalizedContent("¿Quién interpretó a Legolas en \"El Señor de los Anillos\"?", listOf("Orlando Bloom", "Viggo Mortensen", "Ian McKellen", "Elijah Wood"), "Cultura", "Orlando Bloom interpretó al elfo Legolas en la trilogía de El Señor de los Anillos de Peter Jackson, un papel que lanzó su carrera internacional.")
        ),
        BilingualQuestion(
            id = 11548, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué le rôle de Tyler Durden dans \"Fight Club\"?", listOf("Brad Pitt", "Edward Norton", "Christian Bale", "Mark Wahlberg"), "Culture", "Brad Pitt a incarné Tyler Durden, le charismatique et anarchiste savonnier, dans le film culte de David Fincher sorti en 1999."),
            en = LocalizedContent("Which actor played the role of Tyler Durden in \"Fight Club\"?", listOf("Brad Pitt", "Edward Norton", "Christian Bale", "Mark Wahlberg"), "Culture", "Brad Pitt portrayed Tyler Durden, the charismatic and anarchic soap salesman, in David Fincher's cult film released in 1999."),
            zh = LocalizedContent("哪位演员在《搏击俱乐部》中饰演了泰勒·德登？", listOf("布拉德·皮特", "爱德华·诺顿", "克里斯蒂安·贝尔", "马克·沃尔伯格"), "文化", "布拉德·皮特在1999年大卫·芬奇的邪典电影中饰演泰勒·德登，一个富有魅力且无政府主义的肥皂推销员。"),
            es = LocalizedContent("¿Qué actor interpretó a Tyler Durden en \"El club de la lucha\"?", listOf("Brad Pitt", "Edward Norton", "Christian Bale", "Mark Wahlberg"), "Cultura", "Brad Pitt interpretó a Tyler Durden, el carismático y anárquico vendedor de jabón, en la película de culto de David Fincher estrenada en 1999.")
        ),
        BilingualQuestion(
            id = 11549, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a joué le rôle de John McClane dans \"Die Hard\"?", listOf("Bruce Willis", "Sylvester Stallone", "Arnold Schwarzenegger", "Jean-Claude Van Damme"), "Culture", "Bruce Willis a incarné le policier John McClane dans le film d'action \"Die Hard\" (1988), un rôle emblématique qui a lancé sa carrière de star hollywoodienne."),
            en = LocalizedContent("Who played the role of John McClane in \"Die Hard\"?", listOf("Bruce Willis", "Sylvester Stallone", "Arnold Schwarzenegger", "Jean-Claude Van Damme"), "Culture", "Bruce Willis portrayed police officer John McClane in the action film \"Die Hard\" (1988), an iconic role that launched his Hollywood stardom."),
            zh = LocalizedContent("谁在《虎胆龙威》中饰演了约翰·麦克莱恩？", listOf("布鲁斯·威利斯", "西尔维斯特·史泰龙", "阿诺德·施瓦辛格", "尚格·云顿"), "文化", "布鲁斯·威利斯在1988年的动作片《虎胆龙威》中饰演警察约翰·麦克莱恩，这一标志性角色开启了他的好莱坞巨星生涯。"),
            es = LocalizedContent("¿Quién interpretó a John McClane en \"La jungla de cristal\"?", listOf("Bruce Willis", "Sylvester Stallone", "Arnold Schwarzenegger", "Jean-Claude Van Damme"), "Cultura", "Bruce Willis interpretó al policía John McClane en la película de acción \"La jungla de cristal\" (1988), un papel icónico que lanzó su estrellato en Hollywood.")
        ),
        BilingualQuestion(
            id = 11550, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a incarné le Capitaine Jack Sparrow?", listOf("Johnny Depp", "Orlando Bloom", "Geoffrey Rush", "Barbossa"), "Culture", "Johnny Depp a interprété le Capitaine Jack Sparrow dans la saga Pirates des Caraïbes, à partir du premier film en 2003."),
            en = LocalizedContent("Which actor played Captain Jack Sparrow?", listOf("Johnny Depp", "Orlando Bloom", "Geoffrey Rush", "Barbossa"), "Culture", "Johnny Depp played Captain Jack Sparrow in the Pirates of the Caribbean saga, starting with the first film in 2003."),
            zh = LocalizedContent("哪位演员饰演了杰克·斯派罗船长？", listOf("约翰尼·德普", "奥兰多·布鲁姆", "杰弗里·拉什", "巴博萨"), "文化", "约翰尼·德普在《加勒比海盗》系列中饰演了杰克·斯派罗船长，从2003年的第一部电影开始。"),
            es = LocalizedContent("¿Qué actor interpretó al Capitán Jack Sparrow?", listOf("Johnny Depp", "Orlando Bloom", "Geoffrey Rush", "Barbossa"), "Cultura", "Johnny Depp interpretó al Capitán Jack Sparrow en la saga Piratas del Caribe, desde la primera película en 2003.")
        ),
        BilingualQuestion(
            id = 11551, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a joué le rôle de Ellen Ripley dans \"Alien\"?", listOf("Sigourney Weaver", "Carrie Henn", "Aliens Cast", "Ripley"), "Culture", "Sigourney Weaver a incarné Ellen Ripley dans la saga Alien, un rôle emblématique qui a marqué le cinéma de science-fiction et lui a valu une reconnaissance internationale."),
            en = LocalizedContent("Who played Ellen Ripley in \"Alien\"?", listOf("Sigourney Weaver", "Carrie Henn", "Aliens Cast", "Ripley"), "Culture", "Sigourney Weaver played Ellen Ripley in the Alien saga, an iconic role that marked science fiction cinema and earned her international recognition."),
            zh = LocalizedContent("谁在《异形》中饰演了艾伦·雷普利？", listOf("西格妮·韦弗", "凯莉·海恩", "异形剧组", "雷普利"), "文化", "西格妮·韦弗在《异形》系列中饰演了艾伦·雷普利，这一标志性角色在科幻电影史上留下了印记，并为她赢得了国际声誉。"),
            es = LocalizedContent("¿Quién interpretó a Ellen Ripley en \"Alien\"?", listOf("Sigourney Weaver", "Carrie Henn", "Reparto de Aliens", "Ripley"), "Cultura", "Sigourney Weaver interpretó a Ellen Ripley en la saga Alien, un papel icónico que marcó el cine de ciencia ficción y le valió reconocimiento internacional.")
        ),
        BilingualQuestion(
            id = 11552, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué le rôle de Gandalf dans \"Le Seigneur des Anneaux\"?", listOf("Ian McKellen", "Ian Holm", "Christopher Lee", "Elijah Wood"), "Culture", "Ian McKellen a incarné Gandalf dans la trilogie du \"Seigneur des Anneaux\" de Peter Jackson, ainsi que dans \"Le Hobbit\"."),
            en = LocalizedContent("Which actor played Gandalf in \"The Lord of the Rings\"?", listOf("Ian McKellen", "Ian Holm", "Christopher Lee", "Elijah Wood"), "Culture", "Ian McKellen played Gandalf in Peter Jackson's \"The Lord of the Rings\" trilogy, as well as in \"The Hobbit\"."),
            zh = LocalizedContent("哪位演员在《指环王》中饰演了甘道夫？", listOf("伊恩·麦克莱恩", "伊恩·霍尔姆", "克里斯托弗·李", "伊利亚·伍德"), "文化", "伊恩·麦克莱恩在彼得·杰克逊的《指环王》三部曲以及《霍比特人》中饰演了甘道夫。"),
            es = LocalizedContent("¿Qué actor interpretó a Gandalf en \"El Señor de los Anillos\"?", listOf("Ian McKellen", "Ian Holm", "Christopher Lee", "Elijah Wood"), "Cultura", "Ian McKellen interpretó a Gandalf en la trilogía de \"El Señor de los Anillos\" de Peter Jackson, así como en \"El Hobbit\".")
        ),
        BilingualQuestion(
            id = 11553, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a joué le rôle d'Harry Potter?", listOf("Daniel Radcliffe", "Rupert Grint", "Emma Watson", "Tom Felton"), "Culture", "Daniel Radcliffe a incarné le célèbre sorcier dans les huit films de la saga, de 2001 à 2011."),
            en = LocalizedContent("Who played Harry Potter?", listOf("Daniel Radcliffe", "Rupert Grint", "Emma Watson", "Tom Felton"), "Culture", "Daniel Radcliffe played the famous wizard in all eight films of the saga, from 2001 to 2011."),
            zh = LocalizedContent("谁饰演了哈利·波特？", listOf("丹尼尔·雷德克里夫", "鲁伯特·格林特", "艾玛·沃特森", "汤姆·费尔顿"), "文化", "丹尼尔·雷德克里夫在2001年至2011年的八部电影中饰演了这位著名的巫师。"),
            es = LocalizedContent("¿Quién interpretó a Harry Potter?", listOf("Daniel Radcliffe", "Rupert Grint", "Emma Watson", "Tom Felton"), "Cultura", "Daniel Radcliffe interpretó al famoso mago en las ocho películas de la saga, de 2001 a 2011.")
        ),
        BilingualQuestion(
            id = 11554, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a incarné Aragorn dans \"Le Seigneur des Anneaux\"?", listOf("Viggo Mortensen", "Ian McKellen", "Elijah Wood", "Sean Astin"), "Culture", "Viggo Mortensen a été choisi pour incarner Aragorn dans la trilogie du Seigneur des Anneaux de Peter Jackson, un rôle qui a marqué sa carrière."),
            en = LocalizedContent("Which actor played Aragorn in \"The Lord of the Rings\"?", listOf("Viggo Mortensen", "Ian McKellen", "Elijah Wood", "Sean Astin"), "Culture", "Viggo Mortensen was chosen to play Aragorn in Peter Jackson's Lord of the Rings trilogy, a role that marked his career."),
            zh = LocalizedContent("哪位演员在《指环王》中饰演了阿拉贡？", listOf("维果·莫滕森", "伊恩·麦克莱恩", "伊利亚·伍德", "肖恩·阿斯廷"), "文化", "维果·莫滕森被选中在彼得·杰克逊的《指环王》三部曲中饰演阿拉贡，这一角色标志了他的职业生涯。"),
            es = LocalizedContent("¿Qué actor interpretó a Aragorn en \"El Señor de los Anillos\"?", listOf("Viggo Mortensen", "Ian McKellen", "Elijah Wood", "Sean Astin"), "Cultura", "Viggo Mortensen fue elegido para interpretar a Aragorn en la trilogía de El Señor de los Anillos de Peter Jackson, un papel que marcó su carrera.")
        ),
        BilingualQuestion(
            id = 11555, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a joué le rôle du Sphinx dans \"Oedipe Roi\"?", listOf("Telly Savalas", "Orson Welles", "Laurence Olivier", "Rex Harrison"), "Culture", "Rex Harrison a incarné le Sphinx dans le film \"Œdipe Roi\" de 1968, réalisé par Pier Paolo Pasolini."),
            en = LocalizedContent("Who played the Sphinx in \"Oedipus Rex\"?", listOf("Telly Savalas", "Orson Welles", "Laurence Olivier", "Rex Harrison"), "Culture", "Rex Harrison played the Sphinx in the 1968 film \"Oedipus Rex\", directed by Pier Paolo Pasolini."),
            zh = LocalizedContent("谁在《俄狄浦斯王》中饰演了斯芬克斯？", listOf("特利·萨瓦拉斯", "奥森·威尔斯", "劳伦斯·奥利弗", "雷克斯·哈里森"), "文化", "雷克斯·哈里森在1968年由皮埃尔·保罗·帕索里尼执导的电影《俄狄浦斯王》中饰演了斯芬克斯。"),
            es = LocalizedContent("¿Quién interpretó a la Esfinge en \"Edipo Rey\"?", listOf("Telly Savalas", "Orson Welles", "Laurence Olivier", "Rex Harrison"), "Cultura", "Rex Harrison interpretó a la Esfinge en la película \"Edipo Rey\" de 1968, dirigida por Pier Paolo Pasolini.")
        ),
        BilingualQuestion(
            id = 11556, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a joué le rôle de Sherlock Holmes dans la série BBC?", listOf("Benedict Cumberbatch", "Robert Downey Jr.", "Basil Rathbone", "Jeremy Brett"), "Culture", "Benedict Cumberbatch a incarné Sherlock Holmes dans la série BBC Sherlock, diffusée de 2010 à 2017, une adaptation moderne des enquêtes de Conan Doyle."),
            en = LocalizedContent("Which actor played Sherlock Holmes in the BBC series?", listOf("Benedict Cumberbatch", "Robert Downey Jr.", "Basil Rathbone", "Jeremy Brett"), "Culture", "Benedict Cumberbatch played Sherlock Holmes in the BBC series Sherlock, aired from 2010 to 2017, a modern adaptation of Conan Doyle's stories."),
            zh = LocalizedContent("哪位演员在BBC系列剧中饰演了夏洛克·福尔摩斯？", listOf("本尼迪克特·康伯巴奇", "小罗伯特·唐尼", "巴兹尔·拉斯伯恩", "杰里米·布雷特"), "文化", "本尼迪克特·康伯巴奇在BBC系列剧《神探夏洛克》中饰演了夏洛克·福尔摩斯，该剧于2010年至2017年播出，是对柯南·道尔故事的现代改编。"),
            es = LocalizedContent("¿Qué actor interpretó a Sherlock Holmes en la serie de la BBC?", listOf("Benedict Cumberbatch", "Robert Downey Jr.", "Basil Rathbone", "Jeremy Brett"), "Cultura", "Benedict Cumberbatch interpretó a Sherlock Holmes en la serie de la BBC Sherlock, emitida de 2010 a 2017, una adaptación moderna de las historias de Conan Doyle.")
        ),
        BilingualQuestion(
            id = 11557, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a joué le rôle de Marty McFly dans \"Retour vers le Futur\"?", listOf("Michael J. Fox", "Andrew McCarthy", "Emilio Estevez", "Charlie Sheen"), "Culture", "Michael J. Fox a incarné Marty McFly dans la trilogie \"Retour vers le Futur\" de Robert Zemeckis, un rôle qui a fait de lui une icône du cinéma des années 1980."),
            en = LocalizedContent("Who played Marty McFly in \"Back to the Future\"?", listOf("Michael J. Fox", "Andrew McCarthy", "Emilio Estevez", "Charlie Sheen"), "Culture", "Michael J. Fox played Marty McFly in the \"Back to the Future\" trilogy by Robert Zemeckis, a role that made him an icon of 1980s cinema."),
            zh = LocalizedContent("谁在《回到未来》中饰演了马蒂·麦克弗莱？", listOf("迈克尔·J·福克斯", "安德鲁·麦卡锡", "埃米利奥·埃斯特韦斯", "查理·辛"), "文化", "迈克尔·J·福克斯在罗伯特·泽米吉斯的《回到未来》三部曲中饰演了马蒂·麦克弗莱，这一角色使他成为20世纪80年代电影的标志性人物。"),
            es = LocalizedContent("¿Quién interpretó a Marty McFly en \"Regreso al Futuro\"?", listOf("Michael J. Fox", "Andrew McCarthy", "Emilio Estevez", "Charlie Sheen"), "Cultura", "Michael J. Fox interpretó a Marty McFly en la trilogía \"Regreso al Futuro\" de Robert Zemeckis, un papel que lo convirtió en un icono del cine de los años 80.")
        ),
        BilingualQuestion(
            id = 11558, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a incarné Frodo dans \"Le Seigneur des Anneaux\"?", listOf("Elijah Wood", "Daniel Radcliffe", "Rupert Grint", "Tobey Maguire"), "Culture", "Elijah Wood a été choisi par Peter Jackson pour incarner Frodo dans la trilogie Le Seigneur des Anneaux, sortie entre 2001 et 2003."),
            en = LocalizedContent("Which actor played Frodo in \"The Lord of the Rings\"?", listOf("Elijah Wood", "Daniel Radcliffe", "Rupert Grint", "Tobey Maguire"), "Culture", "Elijah Wood was chosen by Peter Jackson to play Frodo in the Lord of the Rings trilogy, released between 2001 and 2003."),
            zh = LocalizedContent("哪位演员在《指环王》中饰演了弗罗多？", listOf("伊利亚·伍德", "丹尼尔·雷德克里夫", "鲁伯特·格林特", "托比·马奎尔"), "文化", "伊利亚·伍德被彼得·杰克逊选中在2001年至2003年上映的《指环王》三部曲中饰演弗罗多。"),
            es = LocalizedContent("¿Qué actor interpretó a Frodo en \"El Señor de los Anillos\"?", listOf("Elijah Wood", "Daniel Radcliffe", "Rupert Grint", "Tobey Maguire"), "Cultura", "Elijah Wood fue elegido por Peter Jackson para interpretar a Frodo en la trilogía de El Señor de los Anillos, estrenada entre 2001 y 2003.")
        ),
        BilingualQuestion(
            id = 11559, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a joué le rôle de Jack Dawson dans \"Titanic\"?", listOf("Leonardo DiCaprio", "Bill Paxton", "Billy Zane", "Kathy Bates"), "Culture", "Leonardo DiCaprio a incarné Jack Dawson dans le film \"Titanic\" de James Cameron, sorti en 1997, un rôle qui a propulsé sa carrière et fait de lui une star mondiale."),
            en = LocalizedContent("Who played Jack Dawson in \"Titanic\"?", listOf("Leonardo DiCaprio", "Bill Paxton", "Billy Zane", "Kathy Bates"), "Culture", "Leonardo DiCaprio played Jack Dawson in James Cameron's film \"Titanic\", released in 1997, a role that propelled his career and made him a global star."),
            zh = LocalizedContent("谁在《泰坦尼克号》中饰演了杰克·道森？", listOf("莱昂纳多·迪卡普里奥", "比尔·帕克斯顿", "比利·赞恩", "凯西·贝茨"), "文化", "莱昂纳多·迪卡普里奥在詹姆斯·卡梅隆1997年上映的电影《泰坦尼克号》中饰演了杰克·道森，这一角色推动了他的职业生涯，使他成为全球巨星。"),
            es = LocalizedContent("¿Quién interpretó a Jack Dawson en \"Titanic\"?", listOf("Leonardo DiCaprio", "Bill Paxton", "Billy Zane", "Kathy Bates"), "Cultura", "Leonardo DiCaprio interpretó a Jack Dawson en la película \"Titanic\" de James Cameron, estrenada en 1997, un papel que impulsó su carrera y lo convirtió en una estrella mundial.")
        ),
        BilingualQuestion(
            id = 11560, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année est sorti \"Nostalgie\" de Tarkovski?", listOf("1975", "1972", "1978", "1980"), "Culture", "Le film \"Nostalgie\" d'Andrei Tarkovski a été présenté en 1983 au Festival de Cannes, où il a remporté le prix de la mise en scène."),
            en = LocalizedContent("In which year was Tarkovsky's \"Nostalgia\" released?", listOf("1975", "1972", "1978", "1980"), "Culture", "Andrei Tarkovsky's film \"Nostalgia\" was presented in 1983 at the Cannes Film Festival, where it won the Best Director award."),
            zh = LocalizedContent("塔尔科夫斯基的《乡愁》是哪一年上映的？", listOf("1975", "1972", "1978", "1980"), "文化", "安德烈·塔尔科夫斯基的电影《乡愁》于1983年在戛纳电影节上展映，并获得了最佳导演奖。"),
            es = LocalizedContent("¿En qué año se estrenó \"Nostalgia\" de Tarkovski?", listOf("1975", "1972", "1978", "1980"), "Cultura", "La película \"Nostalgia\" de Andrei Tarkovski se presentó en 1983 en el Festival de Cannes, donde ganó el premio a la mejor dirección.")
        ),
        BilingualQuestion(
            id = 11561, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de David Lynch est considéré comme un classique du cinéma?", listOf("Mulholland Drive", "Blue Velvet", "The Elephant Man", "Tous les précédents"), "Culture", "David Lynch est un réalisateur culte dont plusieurs films, comme Eraserhead, Blue Velvet ou Mulholland Drive, sont considérés comme des classiques du cinéma."),
            en = LocalizedContent("Which David Lynch film is considered a cinema classic?", listOf("Mulholland Drive", "Blue Velvet", "The Elephant Man", "All of the above"), "Culture", "David Lynch is a cult director whose several films, such as Eraserhead, Blue Velvet, or Mulholland Drive, are considered cinema classics."),
            zh = LocalizedContent("大卫·林奇的哪部电影被认为是电影经典？", listOf("穆赫兰道", "蓝丝绒", "象人", "以上所有"), "文化", "大卫·林奇是一位邪典导演，他的多部电影如《橡皮头》、《蓝丝绒》或《穆赫兰道》都被视为电影经典。"),
            es = LocalizedContent("¿Qué película de David Lynch se considera un clásico del cine?", listOf("Mulholland Drive", "Blue Velvet", "El hombre elefante", "Todos los anteriores"), "Cultura", "David Lynch es un director de culto cuyas varias películas, como Eraserhead, Blue Velvet o Mulholland Drive, se consideran clásicos del cine.")
        ),
        BilingualQuestion(
            id = 11562, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti \"2001: A Space Odyssey\"?", listOf("1968", "1970", "1966", "1972"), "Culture", "Le film \"2001: L'Odyssée de l'espace\" de Stanley Kubrick est sorti en 1968, une année marquante pour la science-fiction au cinéma."),
            en = LocalizedContent("In which year was \"2001: A Space Odyssey\" released?", listOf("1968", "1970", "1966", "1972"), "Culture", "Stanley Kubrick's film \"2001: A Space Odyssey\" was released in 1968, a landmark year for science fiction in cinema."),
            zh = LocalizedContent("《2001太空漫游》是哪一年上映的？", listOf("1968", "1970", "1966", "1972"), "文化", "斯坦利·库布里克的电影《2001太空漫游》于1968年上映，这是科幻电影史上具有里程碑意义的一年。"),
            es = LocalizedContent("¿En qué año se estrenó \"2001: Una odisea del espacio\"?", listOf("1968", "1970", "1966", "1972"), "Cultura", "La película \"2001: Una odisea del espacio\" de Stanley Kubrick se estrenó en 1968, un año emblemático para la ciencia ficción en el cine.")
        ),
        BilingualQuestion(
            id = 11563, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Jeux interdits\"?", listOf("René Clément", "Jean Vigo", "Jean-Luc Godard", "François Truffaut"), "Culture", "René Clément a réalisé \"Jeux interdits\" en 1952, un film qui remporta le Lion d'or à Venise et l'Oscar du meilleur film étranger."),
            en = LocalizedContent("Who directed \"Forbidden Games\"?", listOf("René Clément", "Jean Vigo", "Jean-Luc Godard", "François Truffaut"), "Culture", "René Clément directed \"Forbidden Games\" in 1952, a film that won the Golden Lion at Venice and the Oscar for Best Foreign Language Film."),
            zh = LocalizedContent("谁执导了《禁忌的游戏》？", listOf("雷内·克莱芒", "让·维果", "让-吕克·戈达尔", "弗朗索瓦·特吕弗"), "文化", "雷内·克莱芒于1952年执导了《禁忌的游戏》，该片获得了威尼斯金狮奖和奥斯卡最佳外语片奖。"),
            es = LocalizedContent("¿Quién dirigió \"Juegos prohibidos\"?", listOf("René Clément", "Jean Vigo", "Jean-Luc Godard", "François Truffaut"), "Cultura", "René Clément dirigió \"Juegos prohibidos\" en 1952, una película que ganó el León de Oro en Venecia y el Oscar a la mejor película extranjera.")
        ),
        BilingualQuestion(
            id = 11564, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année est sorti \"Metropolis\" de Fritz Lang?", listOf("1927", "1925", "1929", "1930"), "Culture", "Metropolis, réalisé par Fritz Lang, est un film muet de science-fiction allemand sorti en 1927, considéré comme un chef-d'œuvre du cinéma expressionniste."),
            en = LocalizedContent("In which year was Fritz Lang's \"Metropolis\" released?", listOf("1927", "1925", "1929", "1930"), "Culture", "Metropolis, directed by Fritz Lang, is a German silent science-fiction film released in 1927, considered a masterpiece of expressionist cinema."),
            zh = LocalizedContent("弗里茨·朗的《大都会》是哪一年上映的？", listOf("1927", "1925", "1929", "1930"), "文化", "《大都会》由弗里茨·朗执导，是一部1927年上映的德国无声科幻电影，被认为是表现主义电影的杰作。"),
            es = LocalizedContent("¿En qué año se estrenó \"Metrópolis\" de Fritz Lang?", listOf("1927", "1925", "1929", "1930"), "Cultura", "Metrópolis, dirigida por Fritz Lang, es una película muda alemana de ciencia ficción estrenada en 1927, considerada una obra maestra del cine expresionista.")
        ),
        BilingualQuestion(
            id = 11565, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Bergman est considéré comme un chef-d'œuvre?", listOf("Le Septième Sceau", "Persona", "Cris et chuchotements", "Tous les précédents"), "Culture", "Ingmar Bergman a réalisé de nombreux films acclamés comme \"Le Septième Sceau\", \"Cris et Chuchotements\" ou \"Persona\", tous considérés comme des chefs-d'œuvre, ce qui rend impossible d'en distinguer un seul."),
            en = LocalizedContent("Which Bergman film is considered a masterpiece?", listOf("The Seventh Seal", "Persona", "Cries and Whispers", "All of the above"), "Culture", "Ingmar Bergman directed many acclaimed films such as \"The Seventh Seal\", \"Cries and Whispers\", or \"Persona\", all considered masterpieces, making it impossible to single out just one."),
            zh = LocalizedContent("伯格曼的哪部电影被认为是杰作？", listOf("第七封印", "假面", "呼喊与细语", "以上所有"), "文化", "英格玛·伯格曼执导了许多备受赞誉的电影，如《第七封印》、《呼喊与细语》或《假面》，它们都被视为杰作，因此无法只选一部。"),
            es = LocalizedContent("¿Qué película de Bergman se considera una obra maestra?", listOf("El séptimo sello", "Persona", "Gritos y susurros", "Todos los anteriores"), "Cultura", "Ingmar Bergman dirigió muchas películas aclamadas como \"El séptimo sello\", \"Gritos y susurros\" o \"Persona\", todas consideradas obras maestras, lo que hace imposible destacar una sola.")
        ),
        BilingualQuestion(
            id = 11566, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti \"Singin' in the Rain\"?", listOf("1952", "1950", "1954", "1948"), "Culture", "Le film \"Singin' in the Rain\" est sorti en 1952, produit par la Metro-Goldwyn-Mayer et réalisé par Stanley Donen et Gene Kelly."),
            en = LocalizedContent("In which year was \"Singin' in the Rain\" released?", listOf("1952", "1950", "1954", "1948"), "Culture", "The film \"Singin' in the Rain\" was released in 1952, produced by Metro-Goldwyn-Mayer and directed by Stanley Donen and Gene Kelly."),
            zh = LocalizedContent("《雨中曲》是哪一年上映的？", listOf("1952", "1950", "1954", "1948"), "文化", "电影《雨中曲》于1952年上映，由米高梅制作，斯坦利·多南和吉恩·凯利执导。"),
            es = LocalizedContent("¿En qué año se estrenó \"Cantando bajo la lluvia\"?", listOf("1952", "1950", "1954", "1948"), "Cultura", "La película \"Cantando bajo la lluvia\" se estrenó en 1952, producida por la Metro-Goldwyn-Mayer y dirigida por Stanley Donen y Gene Kelly.")
        ),
        BilingualQuestion(
            id = 11567, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de Billy Wilder est un classique de la comédie?", listOf("Certains l'aiment chaud", "La Garçonnière", "Sabrina", "Tous les précédents"), "Culture", "Billy Wilder a réalisé de nombreuses comédies classiques comme Certains l'aiment chaud ou La Garçonnière, donc plusieurs de ses films sont considérés comme des incontournables du genre."),
            en = LocalizedContent("Which Billy Wilder film is a comedy classic?", listOf("Some Like It Hot", "The Apartment", "Sabrina", "All of the above"), "Culture", "Billy Wilder directed many classic comedies like Some Like It Hot or The Apartment, so several of his films are considered must-sees of the genre."),
            zh = LocalizedContent("比利·怀尔德的哪部电影是喜剧经典？", listOf("热情似火", "公寓", "龙凤配", "以上所有"), "文化", "比利·怀尔德执导了许多经典喜剧，如《热情似火》或《公寓》，因此他的多部电影都被视为该类型的必看之作。"),
            es = LocalizedContent("¿Qué película de Billy Wilder es un clásico de la comedia?", listOf("Con faldas y a lo loco", "El apartamento", "Sabrina", "Todos los anteriores"), "Cultura", "Billy Wilder dirigió muchas comedias clásicas como Con faldas y a lo loco o El apartamento, por lo que varias de sus películas se consideran imprescindibles del género.")
        ),
        BilingualQuestion(
            id = 11568, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti \"Vertigo\" d'Alfred Hitchcock?", listOf("1958", "1956", "1960", "1955"), "Culture", "Vertigo est sorti en 1958, un an après Sueurs froides, son titre original. Ce thriller psychologique est souvent considéré comme l'un des plus grands films de l'histoire du cinéma."),
            en = LocalizedContent("In which year was Alfred Hitchcock's \"Vertigo\" released?", listOf("1958", "1956", "1960", "1955"), "Culture", "Vertigo was released in 1958, a year after its original title \"Sueurs froides\". This psychological thriller is often considered one of the greatest films in cinema history."),
            zh = LocalizedContent("阿尔弗雷德·希区柯克的《迷魂记》是哪一年上映的？", listOf("1958", "1956", "1960", "1955"), "文化", "《迷魂记》于1958年上映，比其原片名《Sueurs froides》晚一年。这部心理惊悚片常被视为电影史上最伟大的电影之一。"),
            es = LocalizedContent("¿En qué año se estrenó \"Vértigo\" de Alfred Hitchcock?", listOf("1958", "1956", "1960", "1955"), "Cultura", "Vértigo se estrenó en 1958, un año después de su título original \"Sueurs froides\". Este thriller psicológico a menudo se considera una de las mejores películas de la historia del cine.")
        ),
        BilingualQuestion(
            id = 11569, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de Kurosawa est un classique du cinéma?", listOf("Les Sept Samouraïs", "Rashomon", "Ran", "Tous les précédents"), "Culture", "Akira Kurosawa a réalisé de nombreux films devenus des classiques, comme \"Les Sept Samouraïs\", \"Rashōmon\" ou \"Ran\". Aucun titre unique ne peut résumer son œuvre."),
            en = LocalizedContent("Which Kurosawa film is a cinema classic?", listOf("Seven Samurai", "Rashomon", "Ran", "All of the above"), "Culture", "Akira Kurosawa directed many films that became classics, such as \"Seven Samurai\", \"Rashomon\", or \"Ran\". No single title can summarize his work."),
            zh = LocalizedContent("黑泽明的哪部电影是电影经典？", listOf("七武士", "罗生门", "乱", "以上所有"), "文化", "黑泽明执导了许多成为经典的作品，如《七武士》、《罗生门》或《乱》。没有单一作品能概括他的成就。"),
            es = LocalizedContent("¿Qué película de Kurosawa es un clásico del cine?", listOf("Los siete samuráis", "Rashōmon", "Ran", "Todos los anteriores"), "Cultura", "Akira Kurosawa dirigió muchas películas que se convirtieron en clásicos, como \"Los siete samuráis\", \"Rashōmon\" o \"Ran\". Ningún título único puede resumir su obra.")
        ),
        BilingualQuestion(
            id = 11570, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année est sorti \"Eternal Sunshine of the Spotless Mind\"?", listOf("2004", "2002", "2006", "2003"), "Culture", "Sorti en 2004, ce film de Michel Gondry avec Jim Carrey et Kate Winslet a marqué les esprits par son scénario non linéaire et son exploration de la mémoire."),
            en = LocalizedContent("In what year was \"Eternal Sunshine of the Spotless Mind\" released?", listOf("2004", "2002", "2006", "2003"), "Culture", "Released in 2004, this film by Michel Gondry starring Jim Carrey and Kate Winslet made an impression with its non-linear script and exploration of memory."),
            zh = LocalizedContent("电影《暖暖内含光》是哪一年上映的？", listOf("2004", "2002", "2006", "2003"), "文化", "这部由米歇尔·贡德里执导、金·凯瑞和凯特·温斯莱特主演的电影于2004年上映，以其非线性剧本和对记忆的探索而闻名。"),
            es = LocalizedContent("¿En qué año se estrenó \"Eternal Sunshine of the Spotless Mind\"?", listOf("2004", "2002", "2006", "2003"), "Cultura", "Estrenada en 2004, esta película de Michel Gondry con Jim Carrey y Kate Winslet marcó por su guion no lineal y su exploración de la memoria.")
        ),
        BilingualQuestion(
            id = 11571, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film d'Orson Welles est un classique du cinéma?", listOf("Citizen Kane", "The Third Man", "Othello", "Tous les précédents"), "Culture", "Orson Welles a réalisé plusieurs films majeurs comme Citizen Kane, La Splendeur des Amberson ou Touch of Evil, tous considérés comme des classiques du cinéma."),
            en = LocalizedContent("Which Orson Welles film is a cinema classic?", listOf("Citizen Kane", "The Third Man", "Othello", "All of the above"), "Culture", "Orson Welles directed several major films such as Citizen Kane, The Magnificent Ambersons, and Touch of Evil, all considered cinema classics."),
            zh = LocalizedContent("奥逊·威尔斯的哪部电影是电影经典？", listOf("公民凯恩", "第三人", "奥赛罗", "以上所有"), "文化", "奥逊·威尔斯执导了多部重要电影，如《公民凯恩》、《安伯逊家族》和《历劫佳人》，都被视为电影经典。"),
            es = LocalizedContent("¿Qué película de Orson Welles es un clásico del cine?", listOf("Ciudadano Kane", "El tercer hombre", "Otelo", "Todos los anteriores"), "Cultura", "Orson Welles dirigió varias películas importantes como Ciudadano Kane, La splendor de los Amberson y Sed de mal, todas consideradas clásicos del cine.")
        ),
        BilingualQuestion(
            id = 11572, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année est sorti \"M\" de Fritz Lang?", listOf("1931", "1929", "1933", "1930"), "Culture", "Sorti en 1931, \"M\" est le premier film parlant de Fritz Lang et un classique du cinéma expressionniste allemand, traitant de la traque d'un tueur d'enfants par la police et le milieu criminel."),
            en = LocalizedContent("In what year was Fritz Lang's \"M\" released?", listOf("1931", "1929", "1933", "1930"), "Culture", "Released in 1931, \"M\" is Fritz Lang's first sound film and a classic of German Expressionist cinema, dealing with the hunt for a child murderer by the police and the criminal underworld."),
            zh = LocalizedContent("弗里茨·朗的《M》是哪一年上映的？", listOf("1931", "1929", "1933", "1930"), "文化", "《M》于1931年上映，是弗里茨·朗的第一部有声电影，也是德国表现主义电影的经典之作，讲述了警方和黑社会追捕一名儿童杀手的故事。"),
            es = LocalizedContent("¿En qué año se estrenó \"M\" de Fritz Lang?", listOf("1931", "1929", "1933", "1930"), "Cultura", "Estrenada en 1931, \"M\" es la primera película sonora de Fritz Lang y un clásico del cine expresionista alemán, que trata sobre la caza de un asesino de niños por la policía y el hampa.")
        ),
        BilingualQuestion(
            id = 11573, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de Hitchcock est un masterpiece?", listOf("Psycho", "Vertigo", "Fenêtre sur cour", "Tous les précédents"), "Culture", "Alfred Hitchcock est considéré comme un maître du suspense et a réalisé de nombreux films acclamés, comme Psychose ou Fenêtre sur cour, ce qui rend difficile d'en choisir un seul comme chef-d'œuvre."),
            en = LocalizedContent("Which Hitchcock film is a masterpiece?", listOf("Psycho", "Vertigo", "Rear Window", "All of the above"), "Culture", "Alfred Hitchcock is considered a master of suspense and directed many acclaimed films, such as Psycho and Rear Window, making it difficult to choose just one as a masterpiece."),
            zh = LocalizedContent("希区柯克的哪部电影是杰作？", listOf("惊魂记", "迷魂记", "后窗", "以上所有"), "文化", "阿尔弗雷德·希区柯克被认为是悬念大师，执导了许多备受赞誉的电影，如《惊魂记》和《后窗》，因此很难只选一部作为杰作。"),
            es = LocalizedContent("¿Qué película de Hitchcock es una obra maestra?", listOf("Psicosis", "Vértigo", "La ventana indiscreta", "Todos los anteriores"), "Cultura", "Alfred Hitchcock es considerado un maestro del suspense y dirigió muchas películas aclamadas, como Psicosis y La ventana indiscreta, lo que hace difícil elegir solo una como obra maestra.")
        ),
        BilingualQuestion(
            id = 11574, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année est sorti \"Ladri di Biciclette\"?", listOf("1948", "1946", "1950", "1945"), "Culture", "Ce film italien de Vittorio De Sica, chef-d'œuvre du néoréalisme, est sorti en 1948. Il raconte l'histoire poignante d'un ouvrier dont le vélo, outil de travail indispensable, lui est volé."),
            en = LocalizedContent("In what year was \"Ladri di Biciclette\" released?", listOf("1948", "1946", "1950", "1945"), "Culture", "This Italian film by Vittorio De Sica, a masterpiece of neorealism, was released in 1948. It tells the poignant story of a worker whose bicycle, an essential work tool, is stolen."),
            zh = LocalizedContent("电影《偷自行车的人》是哪一年上映的？", listOf("1948", "1946", "1950", "1945"), "文化", "这部由维托里奥·德·西卡执导的意大利电影，是新现实主义的杰作，于1948年上映。它讲述了一名工人赖以生存的自行车被偷的辛酸故事。"),
            es = LocalizedContent("¿En qué año se estrenó \"Ladri di Biciclette\"?", listOf("1948", "1946", "1950", "1945"), "Cultura", "Esta película italiana de Vittorio De Sica, obra maestra del neorrealismo, se estrenó en 1948. Cuenta la conmovedora historia de un obrero cuya bicicleta, herramienta de trabajo indispensable, le es robada.")
        ),
        BilingualQuestion(
            id = 11575, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de Truffaut est un classique de la Nouvelle Vague?", listOf("Les Quatre Cents Coups", "Jules et Jim", "Domicile conjugal", "Tous les précédents"), "Culture", "François Truffaut est un réalisateur emblématique de la Nouvelle Vague, et plusieurs de ses films comme *Les 400 Coups* ou *Jules et Jim* en sont des classiques. La réponse « Tous les précédents » souligne que l'ensemble de son œuvre incarne ce mouvement."),
            en = LocalizedContent("Which Truffaut film is a classic of the French New Wave?", listOf("The 400 Blows", "Jules and Jim", "Bed and Board", "All of the above"), "Culture", "François Truffaut is an emblematic director of the French New Wave, and several of his films like *The 400 Blows* and *Jules and Jim* are classics. The answer \"All of the above\" emphasizes that his entire body of work embodies this movement."),
            zh = LocalizedContent("特吕弗的哪部电影是法国新浪潮的经典？", listOf("四百击", "朱尔与吉姆", "床笫风云", "以上所有"), "文化", "弗朗索瓦·特吕弗是法国新浪潮的标志性导演，他的多部电影如《四百击》和《朱尔与吉姆》都是经典之作。“以上所有”的答案强调了他的全部作品都体现了这一运动。"),
            es = LocalizedContent("¿Qué película de Truffaut es un clásico de la Nouvelle Vague?", listOf("Los 400 golpes", "Jules y Jim", "Domicilio conyugal", "Todos los anteriores"), "Cultura", "François Truffaut es un director emblemático de la Nouvelle Vague, y varias de sus películas como *Los 400 golpes* o *Jules y Jim* son clásicos. La respuesta \"Todos los anteriores\" subraya que toda su obra encarna este movimiento.")
        ),
        BilingualQuestion(
            id = 11576, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année est sorti \"L'Avventura\" de Michelangelo Antonioni?", listOf("1960", "1958", "1962", "1959"), "Culture", "L'Avventura a été présenté au Festival de Cannes en 1960, où il a remporté le Prix spécial du jury. Ce film a marqué un tournant dans le cinéma moderne par son style narratif novateur."),
            en = LocalizedContent("In what year was Michelangelo Antonioni's \"L'Avventura\" released?", listOf("1960", "1958", "1962", "1959"), "Culture", "L'Avventura was presented at the Cannes Film Festival in 1960, where it won the Special Jury Prize. This film marked a turning point in modern cinema with its innovative narrative style."),
            zh = LocalizedContent("米开朗基罗·安东尼奥尼的《奇遇》是哪一年上映的？", listOf("1960", "1958", "1962", "1959"), "文化", "《奇遇》于1960年在戛纳电影节上展映，并获得评审团特别奖。这部电影以其创新的叙事风格标志着现代电影的转折点。"),
            es = LocalizedContent("¿En qué año se estrenó \"L'Avventura\" de Michelangelo Antonioni?", listOf("1960", "1958", "1962", "1959"), "Cultura", "L'Avventura se presentó en el Festival de Cannes en 1960, donde ganó el Premio Especial del Jurado. Esta película marcó un punto de inflexión en el cine moderno por su innovador estilo narrativo.")
        ),
        BilingualQuestion(
            id = 11577, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Jean-Luc Godard est un classique?", listOf("À bout de souffle", "Le Mépris", "Allemagne année 90", "Tous les précédents"), "Culture", "Jean-Luc Godard a réalisé de nombreux films emblématiques comme À bout de souffle ou Le Mépris, tous considérés comme des classiques du cinéma."),
            en = LocalizedContent("Which Jean-Luc Godard film is a classic?", listOf("Breathless", "Contempt", "Germany Year 90", "All of the above"), "Culture", "Jean-Luc Godard directed many iconic films like Breathless and Contempt, all considered classics of cinema."),
            zh = LocalizedContent("让-吕克·戈达尔的哪部电影是经典？", listOf("筋疲力尽", "蔑视", "德国90年", "以上所有"), "文化", "让-吕克·戈达尔执导了许多标志性电影，如《筋疲力尽》和《蔑视》，都被视为电影经典。"),
            es = LocalizedContent("¿Qué película de Jean-Luc Godard es un clásico?", listOf("Al final de la escapada", "El desprecio", "Alemania año 90", "Todos los anteriores"), "Cultura", "Jean-Luc Godard dirigió muchas películas emblemáticas como Al final de la escapada y El desprecio, todas consideradas clásicos del cine.")
        ),
        BilingualQuestion(
            id = 11578, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année est sorti \"Playtime\" de Jacques Tati?", listOf("1967", "1965", "1969", "1963"), "Culture", "Playtime, le chef-d'œuvre de Jacques Tati, est sorti en 1967 après une production longue et coûteuse. Ce film est célèbre pour sa satire de la modernité et son utilisation innovante du son et de l'image."),
            en = LocalizedContent("In what year was Jacques Tati's \"Playtime\" released?", listOf("1967", "1965", "1969", "1963"), "Culture", "Playtime, Jacques Tati's masterpiece, was released in 1967 after a long and costly production. This film is famous for its satire of modernity and innovative use of sound and image."),
            zh = LocalizedContent("雅克·塔蒂的《玩乐时间》是哪一年上映的？", listOf("1967", "1965", "1969", "1963"), "文化", "《玩乐时间》是雅克·塔蒂的杰作，经过漫长而昂贵的制作后于1967年上映。这部电影以其对现代性的讽刺以及声音和图像的创新运用而闻名。"),
            es = LocalizedContent("¿En qué año se estrenó \"Playtime\" de Jacques Tati?", listOf("1967", "1965", "1969", "1963"), "Cultura", "Playtime, la obra maestra de Jacques Tati, se estrenó en 1967 tras una producción larga y costosa. Esta película es famosa por su sátira de la modernidad y su uso innovador del sonido y la imagen.")
        ),
        BilingualQuestion(
            id = 11579, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Satyajit Ray est une œuvre majeure?", listOf("Pather Panchali", "Aparajito", "Apur Sansar", "Tous les précédents"), "Culture", "Satyajit Ray est considéré comme un cinéaste majeur dont l'ensemble de l'œuvre, incluant la trilogie d'Apu, est reconnue mondialement, rendant toutes ses réalisations importantes."),
            en = LocalizedContent("Which Satyajit Ray film is a major work?", listOf("Pather Panchali", "Aparajito", "Apur Sansar", "All of the above"), "Culture", "Satyajit Ray is considered a major filmmaker whose entire body of work, including the Apu Trilogy, is globally recognized, making all his films important."),
            zh = LocalizedContent("萨蒂亚吉特·雷伊的哪部电影是重要作品？", listOf("大地之歌", "不屈者", "阿普的世界", "以上所有"), "文化", "萨蒂亚吉特·雷伊被认为是一位重要的电影制作人，他的全部作品，包括阿普三部曲，都获得了全球认可，因此他的所有电影都很重要。"),
            es = LocalizedContent("¿Qué película de Satyajit Ray es una obra importante?", listOf("Pather Panchali", "Aparajito", "Apur Sansar", "Todos los anteriores"), "Cultura", "Satyajit Ray es considerado un cineasta importante cuya obra completa, incluyendo la trilogía de Apu, es reconocida mundialmente, haciendo que todas sus películas sean relevantes.")
        ),
        BilingualQuestion(
            id = 11580, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de films principaux la franchise \"Harry Potter\" comprend-elle?", listOf("8", "7", "9", "10"), "Culture", "La saga cinématographique Harry Potter compte huit films, correspondant aux sept tomes de la série, le dernier livre ayant été adapté en deux parties."),
            en = LocalizedContent("How many main films does the \"Harry Potter\" franchise include?", listOf("8", "7", "9", "10"), "Culture", "The Harry Potter film saga consists of eight films, corresponding to the seven books in the series, with the last book adapted into two parts."),
            zh = LocalizedContent("《哈利·波特》系列包括多少部主要电影？", listOf("8", "7", "9", "10"), "文化", "哈利·波特电影系列共有八部电影，对应原著的七本书，最后一本书被改编成上下两部。"),
            es = LocalizedContent("¿Cuántas películas principales incluye la franquicia de \"Harry Potter\"?", listOf("8", "7", "9", "10"), "Cultura", "La saga cinematográfica de Harry Potter consta de ocho películas, correspondientes a los siete libros de la serie, siendo el último libro adaptado en dos partes.")
        ),
        BilingualQuestion(
            id = 11581, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le premier film \"Marvel Cinematic Universe\" est-il sorti?", listOf("2008", "2006", "2010", "2005"), "Culture", "Le premier film du Marvel Cinematic Universe, \"Iron Man\", est sorti en 2008, marquant le début de cette franchise cinématographique interconnectée."),
            en = LocalizedContent("In what year was the first \"Marvel Cinematic Universe\" film released?", listOf("2008", "2006", "2010", "2005"), "Culture", "The first film of the Marvel Cinematic Universe, \"Iron Man\", was released in 2008, marking the beginning of this interconnected film franchise."),
            zh = LocalizedContent("第一部“漫威电影宇宙”电影在哪一年上映？", listOf("2008", "2006", "2010", "2005"), "文化", "漫威电影宇宙的第一部电影《钢铁侠》于2008年上映，标志着这个相互关联的电影系列的开端。"),
            es = LocalizedContent("¿En qué año se estrenó la primera película del \"Universo Cinematográfico de Marvel\"?", listOf("2008", "2006", "2010", "2005"), "Cultura", "La primera película del Universo Cinematográfico de Marvel, \"Iron Man\", se estrenó en 2008, marcando el inicio de esta franquicia cinematográfica interconectada.")
        ),
        BilingualQuestion(
            id = 11582, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le premier film de la franchise \"Star Wars\" sortie au cinéma?", listOf("Une Nouvelle Espoir", "Les Fantômes Menacants", "Revenge of the Sith", "A New Hope"), "Culture", "Sorti en 1977, le premier film de la saga était simplement intitulé \"Star Wars\". Il a été renommé \"Un nouvel espoir\" en 1981 pour distinguer la trilogie originale des suites à venir."),
            en = LocalizedContent("What is the first film of the \"Star Wars\" franchise released in theaters?", listOf("A New Hope", "The Phantom Menace", "Revenge of the Sith", "A New Hope"), "Culture", "Released in 1977, the first film of the saga was simply titled \"Star Wars\". It was renamed \"A New Hope\" in 1981 to distinguish the original trilogy from the upcoming sequels."),
            zh = LocalizedContent("《星球大战》系列中第一部在影院上映的电影是什么？", listOf("新希望", "幽灵的威胁", "西斯的复仇", "新希望"), "文化", "1977年上映的该系列第一部电影最初名为《星球大战》，1981年更名为《新希望》，以区分原始三部曲与后续作品。"),
            es = LocalizedContent("¿Cuál es la primera película de la franquicia \"Star Wars\" estrenada en cines?", listOf("Una Nueva Esperanza", "La Amenaza Fantasma", "La Venganza de los Sith", "Una Nueva Esperanza"), "Cultura", "Estrenada en 1977, la primera película de la saga se tituló simplemente \"Star Wars\". Fue renombrada \"Una Nueva Esperanza\" en 1981 para distinguir la trilogía original de las secuelas venideras.")
        ),
        BilingualQuestion(
            id = 11583, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de films \"Avengers\" principaux il existe?", listOf("4", "3", "5", "6"), "Culture", "La saga principale des Avengers compte quatre films : Avengers (2012), Avengers : L'Ère d'Ultron (2015), Avengers : Infinity War (2018) et Avengers : Endgame (2019)."),
            en = LocalizedContent("How many main \"Avengers\" films are there?", listOf("4", "3", "5", "6"), "Culture", "The main Avengers saga consists of four films: Avengers (2012), Avengers: Age of Ultron (2015), Avengers: Infinity War (2018), and Avengers: Endgame (2019)."),
            zh = LocalizedContent("有多少部主要的《复仇者联盟》电影？", listOf("4", "3", "5", "6"), "文化", "复仇者联盟主要系列包括四部电影：《复仇者联盟》（2012）、《复仇者联盟2：奥创纪元》（2015）、《复仇者联盟3：无限战争》（2018）和《复仇者联盟4：终局之战》（2019）。"),
            es = LocalizedContent("¿Cuántas películas principales de \"Avengers\" existen?", listOf("4", "3", "5", "6"), "Cultura", "La saga principal de Avengers consta de cuatro películas: Avengers (2012), Avengers: La Era de Ultrón (2015), Avengers: Infinity War (2018) y Avengers: Endgame (2019).")
        ),
        BilingualQuestion(
            id = 11584, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année est sorti le premier \"Indiana Jones\"?", listOf("1981", "1979", "1983", "1985"), "Culture", "Le premier film de la franchise, \"Les Aventuriers de l'arche perdue\", est sorti en 1981, réalisé par Steven Spielberg avec Harrison Ford dans le rôle-titre."),
            en = LocalizedContent("In what year was the first \"Indiana Jones\" released?", listOf("1981", "1979", "1983", "1985"), "Culture", "The first film of the franchise, \"Raiders of the Lost Ark\", was released in 1981, directed by Steven Spielberg with Harrison Ford in the title role."),
            zh = LocalizedContent("第一部《夺宝奇兵》在哪一年上映？", listOf("1981", "1979", "1983", "1985"), "文化", "该系列的第一部电影《夺宝奇兵》于1981年上映，由史蒂文·斯皮尔伯格执导，哈里森·福特主演。"),
            es = LocalizedContent("¿En qué año se estrenó la primera \"Indiana Jones\"?", listOf("1981", "1979", "1983", "1985"), "Cultura", "La primera película de la franquicia, \"En busca del arca perdida\", se estrenó en 1981, dirigida por Steven Spielberg con Harrison Ford en el papel principal.")
        ),
        BilingualQuestion(
            id = 11585, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de films \"James Bond\" ont été réalisés?", listOf("27", "25", "30", "24"), "Culture", "La série officielle des films James Bond produite par EON Productions compte 25 opus, incluant le dernier sorti en 2021, Mourir peut attendre."),
            en = LocalizedContent("How many \"James Bond\" films have been made?", listOf("27", "25", "30", "24"), "Culture", "The official James Bond film series produced by EON Productions consists of 25 films, including the latest released in 2021, No Time to Die."),
            zh = LocalizedContent("已经制作了多少部《詹姆斯·邦德》电影？", listOf("27", "25", "30", "24"), "文化", "由EON制片公司制作的官方詹姆斯·邦德电影系列共有25部，包括2021年上映的最新一部《无暇赴死》。"),
            es = LocalizedContent("¿Cuántas películas de \"James Bond\" se han realizado?", listOf("27", "25", "30", "24"), "Cultura", "La serie oficial de películas de James Bond producida por EON Productions consta de 25 películas, incluyendo la última estrenada en 2021, Sin tiempo para morir.")
        ),
        BilingualQuestion(
            id = 11586, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le dernier film \"James Bond\" avec Daniel Craig?", listOf("No Time to Die", "Spectre", "Skyfall", "Quantum of Solace"), "Culture", "No Time to Die, sorti en 2021, est le 25e film de la série et marque la fin du rôle de James Bond pour Daniel Craig."),
            en = LocalizedContent("What is the last \"James Bond\" film with Daniel Craig?", listOf("No Time to Die", "Spectre", "Skyfall", "Quantum of Solace"), "Culture", "No Time to Die, released in 2021, is the 25th film in the series and marks the end of Daniel Craig's role as James Bond."),
            zh = LocalizedContent("丹尼尔·克雷格主演的最后一部《詹姆斯·邦德》电影是哪一部？", listOf("无暇赴死", "幽灵党", "天幕杀机", "量子危机"), "文化", "2021年上映的《无暇赴死》是该系列的第25部电影，标志着丹尼尔·克雷格饰演詹姆斯·邦德的终结。"),
            es = LocalizedContent("¿Cuál es la última película de \"James Bond\" con Daniel Craig?", listOf("Sin tiempo para morir", "Spectre", "Skyfall", "Quantum of Solace"), "Cultura", "Sin tiempo para morir, estrenada en 2021, es la 25ª película de la serie y marca el final del papel de James Bond para Daniel Craig.")
        ),
        BilingualQuestion(
            id = 11587, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti le premier film \"Superman\"?", listOf("1978", "1976", "1980", "1975"), "Culture", "Le premier film Superman, réalisé par Richard Donner et avec Christopher Reeve dans le rôle-titre, est sorti en 1978."),
            en = LocalizedContent("In what year was the first \"Superman\" film released?", listOf("1978", "1976", "1980", "1975"), "Culture", "The first Superman film, directed by Richard Donner and starring Christopher Reeve in the title role, was released in 1978."),
            zh = LocalizedContent("第一部《超人》电影在哪一年上映？", listOf("1978", "1976", "1980", "1975"), "文化", "第一部超人电影由理查德·唐纳执导，克里斯托弗·里夫主演，于1978年上映。"),
            es = LocalizedContent("¿En qué año se estrenó la primera película de \"Superman\"?", listOf("1978", "1976", "1980", "1975"), "Cultura", "La primera película de Superman, dirigida por Richard Donner y con Christopher Reeve en el papel principal, se estrenó en 1978.")
        ),
        BilingualQuestion(
            id = 11588, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de films \"Le Seigneur des Anneaux\" principaux il existe?", listOf("3", "2", "4", "5"), "Culture", "La trilogie cinématographique réalisée par Peter Jackson comprend trois films principaux : La Communauté de l'Anneau, Les Deux Tours et Le Retour du Roi."),
            en = LocalizedContent("How many main \"The Lord of the Rings\" films are there?", listOf("3", "2", "4", "5"), "Culture", "The film trilogy directed by Peter Jackson consists of three main films: The Fellowship of the Ring, The Two Towers, and The Return of the King."),
            zh = LocalizedContent("有多少部主要的《指环王》电影？", listOf("3", "2", "4", "5"), "文化", "由彼得·杰克逊执导的电影三部曲包括三部主要电影：《护戒使者》、《双塔奇兵》和《王者归来》。"),
            es = LocalizedContent("¿Cuántas películas principales de \"El Señor de los Anillos\" existen?", listOf("3", "2", "4", "5"), "Cultura", "La trilogía cinematográfica dirigida por Peter Jackson consta de tres películas principales: La Comunidad del Anillo, Las Dos Torres y El Retorno del Rey.")
        ),
        BilingualQuestion(
            id = 11589, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année est sorti le premier \"Toy Story\"?", listOf("1995", "1993", "1997", "1994"), "Culture", "Toy Story, premier long-métrage d'animation entièrement réalisé en images de synthèse, est sorti en 1995, marquant un tournant dans l'histoire du cinéma d'animation."),
            en = LocalizedContent("In what year was the first \"Toy Story\" released?", listOf("1995", "1993", "1997", "1994"), "Culture", "Toy Story, the first feature-length film entirely made with computer-generated imagery, was released in 1995, marking a turning point in the history of animation."),
            zh = LocalizedContent("第一部《玩具总动员》在哪一年上映？", listOf("1995", "1993", "1997", "1994"), "文化", "《玩具总动员》是第一部完全由计算机生成图像制作的长片动画电影，于1995年上映，标志着动画电影史上的一个转折点。"),
            es = LocalizedContent("¿En qué año se estrenó la primera \"Toy Story\"?", listOf("1995", "1993", "1997", "1994"), "Cultura", "Toy Story, el primer largometraje completamente realizado con imágenes generadas por computadora, se estrenó en 1995, marcando un punto de inflexión en la historia del cine de animación.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11590, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de films \"Toy Story\" sortis jusqu'à présent?", listOf("4", "3", "5", "6"), "Culture", "La franchise Toy Story compte quatre films, sortis respectivement en 1995, 1999, 2010 et 2019."),
            en = LocalizedContent("How many \"Toy Story\" movies have been released so far?", listOf("4", "3", "5", "6"), "Culture", "The Toy Story franchise has four films, released in 1995, 1999, 2010, and 2019."),
            zh = LocalizedContent("到目前为止，《玩具总动员》系列电影共有多少部？", listOf("4", "3", "5", "6"), "文化", "《玩具总动员》系列共有四部电影，分别于1995年、1999年、2010年和2019年上映。"),
            es = LocalizedContent("¿Cuántas películas de \"Toy Story\" se han estrenado hasta ahora?", listOf("4", "3", "5", "6"), "Cultura", "La franquicia Toy Story cuenta con cuatro películas, estrenadas en 1995, 1999, 2010 y 2019.")
        ),
        BilingualQuestion(
            id = 11591, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année est sorti le premier \"Jurassic Park\"?", listOf("1993", "1991", "1995", "1994"), "Culture", "Le premier film Jurassic Park, réalisé par Steven Spielberg, est sorti en 1993. Il a révolutionné les effets spéciaux avec ses dinosaures en images de synthèse."),
            en = LocalizedContent("In what year was the first \"Jurassic Park\" released?", listOf("1993", "1991", "1995", "1994"), "Culture", "The first Jurassic Park film, directed by Steven Spielberg, was released in 1993. It revolutionized special effects with its computer-generated dinosaurs."),
            zh = LocalizedContent("第一部《侏罗纪公园》在哪一年上映？", listOf("1993", "1991", "1995", "1994"), "文化", "第一部《侏罗纪公园》由史蒂文·斯皮尔伯格执导，于1993年上映，其电脑生成的恐龙特效革新了视觉效果。"),
            es = LocalizedContent("¿En qué año se estrenó la primera \"Jurassic Park\"?", listOf("1993", "1991", "1995", "1994"), "Cultura", "La primera película de Jurassic Park, dirigida por Steven Spielberg, se estrenó en 1993. Revolucionó los efectos especiales con sus dinosaurios generados por computadora.")
        ),
        BilingualQuestion(
            id = 11592, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de films \"Back to the Future\" il existe?", listOf("3", "2", "4", "5"), "Culture", "La trilogie Retour vers le futur est composée de trois films sortis entre 1985 et 1990, réalisés par Robert Zemeckis."),
            en = LocalizedContent("How many \"Back to the Future\" movies are there?", listOf("3", "2", "4", "5"), "Culture", "The Back to the Future trilogy consists of three films released between 1985 and 1990, directed by Robert Zemeckis."),
            zh = LocalizedContent("《回到未来》系列共有多少部电影？", listOf("3", "2", "4", "5"), "文化", "《回到未来》三部曲由三部电影组成，于1985年至1990年间上映，由罗伯特·泽米吉斯执导。"),
            es = LocalizedContent("¿Cuántas películas de \"Back to the Future\" existen?", listOf("3", "2", "4", "5"), "Cultura", "La trilogía de Regreso al futuro consta de tres películas estrenadas entre 1985 y 1990, dirigidas por Robert Zemeckis.")
        ),
        BilingualQuestion(
            id = 11593, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti le premier \"Mission: Impossible\"?", listOf("1996", "1994", "1998", "1995"), "Culture", "Le premier film Mission: Impossible, réalisé par Brian De Palma et avec Tom Cruise, est sorti en 1996, adaptant la série télévisée des années 1960."),
            en = LocalizedContent("In what year was the first \"Mission: Impossible\" released?", listOf("1996", "1994", "1998", "1995"), "Culture", "The first Mission: Impossible film, directed by Brian De Palma and starring Tom Cruise, was released in 1996, adapting the 1960s television series."),
            zh = LocalizedContent("第一部《碟中谍》在哪一年上映？", listOf("1996", "1994", "1998", "1995"), "文化", "第一部《碟中谍》由布莱恩·德·帕尔玛执导，汤姆·克鲁斯主演，于1996年上映，改编自1960年代的电视剧。"),
            es = LocalizedContent("¿En qué año se estrenó la primera \"Misión: Imposible\"?", listOf("1996", "1994", "1998", "1995"), "Cultura", "La primera película de Misión: Imposible, dirigida por Brian De Palma y protagonizada por Tom Cruise, se estrenó en 1996, adaptando la serie de televisión de los años 60.")
        ),
        BilingualQuestion(
            id = 11594, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de films \"Transformers\" sortis?", listOf("6", "5", "7", "8"), "Culture", "La série principale de films Transformers compte cinq opus sortis entre 2007 et 2017, réalisés par Michael Bay."),
            en = LocalizedContent("How many \"Transformers\" movies have been released?", listOf("6", "5", "7", "8"), "Culture", "The main Transformers film series consists of five installments released between 2007 and 2017, directed by Michael Bay."),
            zh = LocalizedContent("《变形金刚》系列电影共有多少部？", listOf("6", "5", "7", "8"), "文化", "《变形金刚》主系列电影共有五部，于2007年至2017年间上映，由迈克尔·贝执导。"),
            es = LocalizedContent("¿Cuántas películas de \"Transformers\" se han estrenado?", listOf("6", "5", "7", "8"), "Cultura", "La serie principal de películas de Transformers consta de cinco entregas estrenadas entre 2007 y 2017, dirigidas por Michael Bay.")
        ),
        BilingualQuestion(
            id = 11595, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année est sorti le premier \"Pirates des Caraïbes\"?", listOf("2003", "2001", "2005", "2002"), "Culture", "Le premier film Pirates des Caraïbes, La Malédiction du Black Pearl, est sorti en 2003, marquant le début de la franchise inspirée de l'attraction de Disney."),
            en = LocalizedContent("In what year was the first \"Pirates of the Caribbean\" released?", listOf("2003", "2001", "2005", "2002"), "Culture", "The first Pirates of the Caribbean film, The Curse of the Black Pearl, was released in 2003, marking the start of the franchise inspired by the Disney attraction."),
            zh = LocalizedContent("第一部《加勒比海盗》在哪一年上映？", listOf("2003", "2001", "2005", "2002"), "文化", "第一部《加勒比海盗：黑珍珠号的诅咒》于2003年上映，开启了受迪士尼游乐设施启发的系列电影。"),
            es = LocalizedContent("¿En qué año se estrenó la primera \"Piratas del Caribe\"?", listOf("2003", "2001", "2005", "2002"), "Cultura", "La primera película de Piratas del Caribe, La maldición del Perla Negra, se estrenó en 2003, marcando el inicio de la franquicia inspirada en la atracción de Disney.")
        ),
        BilingualQuestion(
            id = 11596, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de films \"Le Parrain\" il existe?", listOf("3", "2", "4", "5"), "Culture", "La trilogie du Parrain comprend trois films réalisés par Francis Ford Coppola, sortis en 1972, 1974 et 1990."),
            en = LocalizedContent("How many \"The Godfather\" movies are there?", listOf("3", "2", "4", "5"), "Culture", "The Godfather trilogy consists of three films directed by Francis Ford Coppola, released in 1972, 1974, and 1990."),
            zh = LocalizedContent("《教父》系列共有多少部电影？", listOf("3", "2", "4", "5"), "文化", "《教父》三部曲由弗朗西斯·福特·科波拉执导的三部电影组成，分别于1972年、1974年和1990年上映。"),
            es = LocalizedContent("¿Cuántas películas de \"El Padrino\" existen?", listOf("3", "2", "4", "5"), "Cultura", "La trilogía de El Padrino consta de tres películas dirigidas por Francis Ford Coppola, estrenadas en 1972, 1974 y 1990.")
        ),
        BilingualQuestion(
            id = 11597, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année est sorti le premier \"Shrek\"?", listOf("2001", "1999", "2003", "2002"), "Culture", "Le premier film Shrek est sorti en 2001, marquant le début de la franchise d'animation de DreamWorks."),
            en = LocalizedContent("In what year was the first \"Shrek\" released?", listOf("2001", "1999", "2003", "2002"), "Culture", "The first Shrek film was released in 2001, marking the start of DreamWorks' animated franchise."),
            zh = LocalizedContent("第一部《怪物史莱克》在哪一年上映？", listOf("2001", "1999", "2003", "2002"), "文化", "第一部《怪物史莱克》于2001年上映，开启了梦工厂的动画系列。"),
            es = LocalizedContent("¿En qué año se estrenó la primera \"Shrek\"?", listOf("2001", "1999", "2003", "2002"), "Cultura", "La primera película de Shrek se estrenó en 2001, marcando el inicio de la franquicia de animación de DreamWorks.")
        ),
        BilingualQuestion(
            id = 11598, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de films \"Die Hard\" avec Bruce Willis?", listOf("5", "4", "6", "7"), "Culture", "La série Die Hard compte cinq films avec Bruce Willis, sortis entre 1988 et 2013, incluant le premier opus et le dernier intitulé Die Hard : Belle journée pour mourir."),
            en = LocalizedContent("How many \"Die Hard\" movies with Bruce Willis are there?", listOf("5", "4", "6", "7"), "Culture", "The Die Hard series includes five films with Bruce Willis, released between 1988 and 2013, including the first and the last titled A Good Day to Die Hard."),
            zh = LocalizedContent("布鲁斯·威利斯主演的《虎胆龙威》系列共有多少部？", listOf("5", "4", "6", "7"), "文化", "《虎胆龙威》系列共有五部由布鲁斯·威利斯主演的电影，于1988年至2013年间上映，包括第一部及最后一部《虎胆龙威5》。"),
            es = LocalizedContent("¿Cuántas películas de \"Die Hard\" con Bruce Willis hay?", listOf("5", "4", "6", "7"), "Cultura", "La serie Die Hard incluye cinco películas con Bruce Willis, estrenadas entre 1988 y 2013, incluyendo la primera y la última titulada Un buen día para morir.")
        ),
        BilingualQuestion(
            id = 11599, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti le premier \"X-Men\"?", listOf("2000", "1998", "2002", "1999"), "Culture", "Le premier film X-Men, réalisé par Bryan Singer, est sorti en 2000, lançant la franchise cinématographique des mutants Marvel."),
            en = LocalizedContent("In what year was the first \"X-Men\" released?", listOf("2000", "1998", "2002", "1999"), "Culture", "The first X-Men film, directed by Bryan Singer, was released in 2000, launching the Marvel mutants' film franchise."),
            zh = LocalizedContent("第一部《X战警》在哪一年上映？", listOf("2000", "1998", "2002", "1999"), "文化", "第一部《X战警》由布莱恩·辛格执导，于2000年上映，开启了漫威变种人的电影系列。"),
            es = LocalizedContent("¿En qué año se estrenó la primera \"X-Men\"?", listOf("2000", "1998", "2002", "1999"), "Cultura", "La primera película de X-Men, dirigida por Bryan Singer, se estrenó en 2000, lanzando la franquicia cinematográfica de los mutantes de Marvel.")
        ),
        BilingualQuestion(
            id = 11600, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a généré le plus de revenus au box office mondial?", listOf("Avatar: The Way of Water", "Avatar", "Avengers: Endgame", "Titanic"), "Culture", "Avatar: The Way of Water a dépassé les 2,3 milliards de dollars en 2023, devenant le troisième film le plus rentable de l'histoire, derrière Avatar et Avengers: Endgame."),
            en = LocalizedContent("Which movie generated the highest revenue at the worldwide box office?", listOf("Avatar: The Way of Water", "Avatar", "Avengers: Endgame", "Titanic"), "Culture", "Avatar: The Way of Water surpassed $2.3 billion in 2023, becoming the third highest-grossing film in history, behind Avatar and Avengers: Endgame."),
            zh = LocalizedContent("哪部电影在全球票房中收入最高？", listOf("阿凡达：水之道", "阿凡达", "复仇者联盟4：终局之战", "泰坦尼克号"), "文化", "《阿凡达：水之道》在2023年票房超过23亿美元，成为历史上第三高票房电影，仅次于《阿凡达》和《复仇者联盟4：终局之战》。"),
            es = LocalizedContent("¿Qué película generó más ingresos en la taquilla mundial?", listOf("Avatar: The Way of Water", "Avatar", "Avengers: Endgame", "Titanic"), "Cultura", "Avatar: The Way of Water superó los 2.300 millones de dólares en 2023, convirtiéndose en la tercera película más taquillera de la historia, detrás de Avatar y Avengers: Endgame.")
        ),
        BilingualQuestion(
            id = 11601, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"Avatar\" a généré combien de milliards de dollars au box office?", listOf("2.9", "2.5", "3.2", "2.3"), "Culture", "Le film Avatar de James Cameron a rapporté environ 2,9 milliards de dollars au box-office mondial, un record qu'il a détenu jusqu'à sa reprise par Avengers: Endgame en 2019."),
            en = LocalizedContent("How many billions of dollars did \"Avatar\" generate at the box office?", listOf("2.9", "2.5", "3.2", "2.3"), "Culture", "James Cameron's Avatar grossed approximately $2.9 billion worldwide, a record it held until surpassed by Avengers: Endgame in 2019."),
            zh = LocalizedContent("《阿凡达》在票房上产生了多少十亿美元？", listOf("2.9", "2.5", "3.2", "2.3"), "文化", "詹姆斯·卡梅隆的《阿凡达》全球票房约29亿美元，这一纪录一直保持到2019年被《复仇者联盟4：终局之战》超越。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares generó \"Avatar\" en taquilla?", listOf("2.9", "2.5", "3.2", "2.3"), "Cultura", "Avatar de James Cameron recaudó aproximadamente 2.900 millones de dólares en todo el mundo, un récord que mantuvo hasta que fue superado por Avengers: Endgame en 2019.")
        ),
        BilingualQuestion(
            id = 11602, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Avatar\" de James Cameron est-il sorti?", listOf("2009", "2008", "2010", "2007"), "Culture", "Le film Avatar de James Cameron est sorti en 2009, marquant une révolution technologique avec son utilisation pionnière de la 3D et des effets visuels numériques."),
            en = LocalizedContent("In what year was James Cameron's \"Avatar\" released?", listOf("2009", "2008", "2010", "2007"), "Culture", "James Cameron's Avatar was released in 2009, marking a technological revolution with its pioneering use of 3D and digital visual effects."),
            zh = LocalizedContent("詹姆斯·卡梅隆的《阿凡达》在哪一年上映？", listOf("2009", "2008", "2010", "2007"), "文化", "詹姆斯·卡梅隆的《阿凡达》于2009年上映，以其开创性的3D和数字视觉效果使用标志着技术革命。"),
            es = LocalizedContent("¿En qué año se estrenó \"Avatar\" de James Cameron?", listOf("2009", "2008", "2010", "2007"), "Cultura", "Avatar de James Cameron se estrenó en 2009, marcando una revolución tecnológica con su uso pionero de 3D y efectos visuales digitales.")
        ),
        BilingualQuestion(
            id = 11603, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"Titanic\" a généré combien de milliards de dollars au box office?", listOf("2.2", "2.0", "2.5", "1.8"), "Culture", "Le film Titanic de James Cameron, sorti en 1997, a rapporté environ 2,2 milliards de dollars au box-office mondial, un record qui a tenu jusqu'à Avatar en 2010."),
            en = LocalizedContent("How many billions of dollars did \"Titanic\" generate at the box office?", listOf("2.2", "2.0", "2.5", "1.8"), "Culture", "James Cameron's Titanic, released in 1997, grossed approximately $2.2 billion worldwide, a record that stood until Avatar in 2010."),
            zh = LocalizedContent("《泰坦尼克号》在票房上产生了多少十亿美元？", listOf("2.2", "2.0", "2.5", "1.8"), "文化", "詹姆斯·卡梅隆的《泰坦尼克号》于1997年上映，全球票房约22亿美元，这一纪录一直保持到2010年的《阿凡达》。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares generó \"Titanic\" en taquilla?", listOf("2.2", "2.0", "2.5", "1.8"), "Cultura", "Titanic de James Cameron, estrenada en 1997, recaudó aproximadamente 2.200 millones de dólares en todo el mundo, un récord que se mantuvo hasta Avatar en 2010.")
        ),
        BilingualQuestion(
            id = 11604, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film est le plus gros succès au box office en 2023?", listOf("Barbie", "Oppenheimer", "The Super Mario Bros Movie", "Killers of the Flower Moon"), "Culture", "Barbie a rapporté plus de 1,4 milliard de dollars dans le monde en 2023, dépassant The Super Mario Bros. Movie."),
            en = LocalizedContent("Which movie was the biggest box office success in 2023?", listOf("Barbie", "Oppenheimer", "The Super Mario Bros Movie", "Killers of the Flower Moon"), "Culture", "Barbie grossed over $1.4 billion worldwide in 2023, surpassing The Super Mario Bros. Movie."),
            zh = LocalizedContent("哪部电影是2023年票房最大的成功？", listOf("芭比", "奥本海默", "超级马力欧兄弟大电影", "花月杀手"), "文化", "《芭比》在2023年全球票房超过14亿美元，超过了《超级马力欧兄弟大电影》。"),
            es = LocalizedContent("¿Qué película fue el mayor éxito de taquilla en 2023?", listOf("Barbie", "Oppenheimer", "The Super Mario Bros Movie", "Killers of the Flower Moon"), "Cultura", "Barbie recaudó más de 1.400 millones de dólares en todo el mundo en 2023, superando a The Super Mario Bros. Movie.")
        ),
        BilingualQuestion(
            id = 11605, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Avengers: Endgame\" est-il sorti?", listOf("2019", "2018", "2020", "2021"), "Culture", "Avengers: Endgame est sorti en 2019, concluant la phase 3 du Marvel Cinematic Universe et devenant le film le plus rentable de l'année."),
            en = LocalizedContent("In what year was \"Avengers: Endgame\" released?", listOf("2019", "2018", "2020", "2021"), "Culture", "Avengers: Endgame was released in 2019, concluding Phase 3 of the Marvel Cinematic Universe and becoming the highest-grossing film of the year."),
            zh = LocalizedContent("《复仇者联盟4：终局之战》在哪一年上映？", listOf("2019", "2018", "2020", "2021"), "文化", "《复仇者联盟4：终局之战》于2019年上映，结束了漫威电影宇宙的第三阶段，并成为当年票房最高的电影。"),
            es = LocalizedContent("¿En qué año se estrenó \"Avengers: Endgame\"?", listOf("2019", "2018", "2020", "2021"), "Cultura", "Avengers: Endgame se estrenó en 2019, concluyendo la Fase 3 del Universo Cinematográfico de Marvel y convirtiéndose en la película más taquillera del año.")
        ),
        BilingualQuestion(
            id = 11606, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"Avengers: Endgame\" a généré combien de milliards de dollars?", listOf("2.8", "2.5", "3.0", "2.3"), "Culture", "Avengers: Endgame a rapporté environ 2,8 milliards de dollars au box-office mondial, devenant ainsi le film le plus rentable de tous les temps lors de sa sortie en 2019."),
            en = LocalizedContent("How many billions of dollars did \"Avengers: Endgame\" generate?", listOf("2.8", "2.5", "3.0", "2.3"), "Culture", "Avengers: Endgame grossed approximately $2.8 billion worldwide, becoming the highest-grossing film of all time upon its release in 2019."),
            zh = LocalizedContent("《复仇者联盟4：终局之战》产生了多少十亿美元？", listOf("2.8", "2.5", "3.0", "2.3"), "文化", "《复仇者联盟4：终局之战》全球票房约28亿美元，在2019年上映时成为有史以来票房最高的电影。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares generó \"Avengers: Endgame\"?", listOf("2.8", "2.5", "3.0", "2.3"), "Cultura", "Avengers: Endgame recaudó aproximadamente 2.800 millones de dólares en todo el mundo, convirtiéndose en la película más taquillera de todos los tiempos en su estreno en 2019.")
        ),
        BilingualQuestion(
            id = 11607, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film le plus gros succès français au box office?", listOf("Les Trois Mousquetaires", "Bienvenue chez les Ch'tis", "La Grande Vadrouille", "Amélie"), "Culture", "Le film \"Bienvenue chez les Ch'tis\" a attiré plus de 20 millions de spectateurs en France en 2008, ce qui en fait le plus grand succès du box-office français."),
            en = LocalizedContent("Which is the biggest French box office success?", listOf("The Three Musketeers", "Bienvenue chez les Ch'tis", "La Grande Vadrouille", "Amélie"), "Culture", "The film \"Bienvenue chez les Ch'tis\" attracted over 20 million viewers in France in 2008, making it the biggest French box office success."),
            zh = LocalizedContent("哪部电影是法国票房最大的成功？", listOf("三个火枪手", "欢迎来北方", "虎口脱险", "天使爱美丽"), "文化", "电影《欢迎来北方》在2008年吸引了超过2000万法国观众，使其成为法国票房最大的成功。"),
            es = LocalizedContent("¿Cuál es el mayor éxito de taquilla francés?", listOf("Los tres mosqueteros", "Bienvenue chez les Ch'tis", "La Grande Vadrouille", "Amélie"), "Cultura", "La película \"Bienvenue chez les Ch'tis\" atrajo a más de 20 millones de espectadores en Francia en 2008, convirtiéndose en el mayor éxito de taquilla francés.")
        ),
        BilingualQuestion(
            id = 11608, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Avatar: The Way of Water\" est-il sorti?", listOf("2022", "2021", "2023", "2020"), "Culture", "Le film \"Avatar: The Way of Water\", réalisé par James Cameron, est sorti en 2022, soit treize ans après le premier opus."),
            en = LocalizedContent("In what year was \"Avatar: The Way of Water\" released?", listOf("2022", "2021", "2023", "2020"), "Culture", "The film \"Avatar: The Way of Water\", directed by James Cameron, was released in 2022, thirteen years after the first installment."),
            zh = LocalizedContent("《阿凡达：水之道》在哪一年上映？", listOf("2022", "2021", "2023", "2020"), "文化", "由詹姆斯·卡梅隆执导的电影《阿凡达：水之道》于2022年上映，距离第一部已过去十三年。"),
            es = LocalizedContent("¿En qué año se estrenó \"Avatar: The Way of Water\"?", listOf("2022", "2021", "2023", "2020"), "Cultura", "La película \"Avatar: The Way of Water\", dirigida por James Cameron, se estrenó en 2022, trece años después de la primera entrega.")
        ),
        BilingualQuestion(
            id = 11609, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a détrôné \"Avatar\" au box office mondial en 2023?", listOf("Avatar: The Way of Water", "Barbie", "Oppenheimer", "The Super Mario Bros Movie"), "Culture", "Avatar : La Voie de l’eau a dépassé Avatar au box-office mondial en 2023, mais les deux films sont réalisés par James Cameron et appartiennent à la même franchise."),
            en = LocalizedContent("Which movie dethroned \"Avatar\" at the worldwide box office in 2023?", listOf("Avatar: The Way of Water", "Barbie", "Oppenheimer", "The Super Mario Bros Movie"), "Culture", "Avatar: The Way of Water surpassed Avatar at the worldwide box office in 2023, but both films are directed by James Cameron and belong to the same franchise."),
            zh = LocalizedContent("哪部电影在2023年全球票房上超越了《阿凡达》？", listOf("阿凡达：水之道", "芭比", "奥本海默", "超级马力欧兄弟大电影"), "文化", "《阿凡达：水之道》在2023年全球票房上超越了《阿凡达》，但两部电影均由詹姆斯·卡梅隆执导，属于同一系列。"),
            es = LocalizedContent("¿Qué película destronó a \"Avatar\" en la taquilla mundial en 2023?", listOf("Avatar: The Way of Water", "Barbie", "Oppenheimer", "The Super Mario Bros Movie"), "Cultura", "Avatar: The Way of Water superó a Avatar en la taquilla mundial en 2023, pero ambas películas están dirigidas por James Cameron y pertenecen a la misma franquicia.")
        ),
        BilingualQuestion(
            id = 11610, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"La Reine des Neiges 2\" a généré combien de milliards de dollars?", listOf("1.45", "1.2", "1.8", "1.0"), "Culture", "Sorti en 2019, La Reine des Neiges 2 a rapporté environ 1,45 milliard de dollars au box-office mondial, devenant ainsi le film d'animation le plus rentable à l'époque."),
            en = LocalizedContent("How many billions of dollars did \"Frozen 2\" generate?", listOf("1.45", "1.2", "1.8", "1.0"), "Culture", "Released in 2019, Frozen 2 earned approximately $1.45 billion at the global box office, becoming the highest-grossing animated film at the time."),
            zh = LocalizedContent("《冰雪奇缘2》产生了多少亿美元？", listOf("1.45", "1.2", "1.8", "1.0"), "文化", "2019年上映的《冰雪奇缘2》全球票房约14.5亿美元，成为当时最卖座的动画电影。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares generó \"Frozen 2\"?", listOf("1.45", "1.2", "1.8", "1.0"), "Cultura", "Estrenada en 2019, Frozen 2 recaudó aproximadamente 1.450 millones de dólares en taquilla mundial, convirtiéndose en la película animada más taquillera en ese momento.")
        ),
        BilingualQuestion(
            id = 11611, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a été le plus gros succès au box office en 2022?", listOf("Top Gun: Maverick", "Doctor Strange in the Multiverse of Madness", "Avatar: The Way of Water", "Black Panther: Wakanda Forever"), "Culture", "Top Gun: Maverick a généré près d'1,5 milliard de dollars de recettes mondiales en 2022, dépassant largement les autres blockbusters comme Avatar : La Voie de l'eau, sorti plus tard dans l'année."),
            en = LocalizedContent("Which film was the biggest box office success in 2022?", listOf("Top Gun: Maverick", "Doctor Strange in the Multiverse of Madness", "Avatar: The Way of Water", "Black Panther: Wakanda Forever"), "Culture", "Top Gun: Maverick generated nearly $1.5 billion in global revenue in 2022, far surpassing other blockbusters like Avatar: The Way of Water, which was released later in the year."),
            zh = LocalizedContent("2022年哪部电影是票房最大的成功？", listOf("壮志凌云：独行侠", "奇异博士2：疯狂多元宇宙", "阿凡达：水之道", "黑豹2"), "文化", "《壮志凌云：独行侠》在2022年全球票房近15亿美元，远超其他大片，如年底上映的《阿凡达：水之道》。"),
            es = LocalizedContent("¿Qué película fue el mayor éxito de taquilla en 2022?", listOf("Top Gun: Maverick", "Doctor Strange in the Multiverse of Madness", "Avatar: The Way of Water", "Black Panther: Wakanda Forever"), "Cultura", "Top Gun: Maverick generó casi 1.500 millones de dólares en ingresos globales en 2022, superando con creces a otros grandes éxitos como Avatar: The Way of Water, estrenada más tarde ese año.")
        ),
        BilingualQuestion(
            id = 11612, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"Top Gun: Maverick\" a généré combien de milliards de dollars?", listOf("1.49", "1.2", "1.7", "1.0"), "Culture", "Top Gun: Maverick a rapporté environ 1,49 milliard de dollars au box-office mondial, devenant l’un des plus gros succès de 2022 et dépassant largement le film original."),
            en = LocalizedContent("How many billions of dollars did \"Top Gun: Maverick\" generate?", listOf("1.49", "1.2", "1.7", "1.0"), "Culture", "Top Gun: Maverick earned approximately $1.49 billion at the global box office, becoming one of the biggest successes of 2022 and far surpassing the original film."),
            zh = LocalizedContent("《壮志凌云：独行侠》产生了多少亿美元？", listOf("1.49", "1.2", "1.7", "1.0"), "文化", "《壮志凌云：独行侠》全球票房约14.9亿美元，成为2022年最成功的电影之一，远超原版。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares generó \"Top Gun: Maverick\"?", listOf("1.49", "1.2", "1.7", "1.0"), "Cultura", "Top Gun: Maverick recaudó aproximadamente 1.490 millones de dólares en taquilla mundial, convirtiéndose en uno de los mayores éxitos de 2022 y superando con creces la película original.")
        ),
        BilingualQuestion(
            id = 11613, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"Oppenheimer\" a-t-il généralement été le plus grand succès de l'année?", listOf("2023", "2024", "2022", "2025"), "Culture", "Le film \"Oppenheimer\", réalisé par Christopher Nolan, est sorti en juillet 2023 et a été le plus grand succès de l'année au box-office mondial, avec plus de 950 millions de dollars de recettes."),
            en = LocalizedContent("In which year was \"Oppenheimer\" generally the biggest success of the year?", listOf("2023", "2024", "2022", "2025"), "Culture", "The film \"Oppenheimer\", directed by Christopher Nolan, was released in July 2023 and was the biggest box office success of the year worldwide, with over $950 million in revenue."),
            zh = LocalizedContent("《奥本海默》在哪一年通常是年度最大成功？", listOf("2023", "2024", "2022", "2025"), "文化", "克里斯托弗·诺兰执导的《奥本海默》于2023年7月上映，成为当年全球票房最大的成功，收入超过9.5亿美元。"),
            es = LocalizedContent("¿En qué año fue \"Oppenheimer\" generalmente el mayor éxito del año?", listOf("2023", "2024", "2022", "2025"), "Cultura", "La película \"Oppenheimer\", dirigida por Christopher Nolan, se estrenó en julio de 2023 y fue el mayor éxito de taquilla del año a nivel mundial, con más de 950 millones de dólares en ingresos.")
        ),
        BilingualQuestion(
            id = 11614, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a été le plus gros succès au box office en 2021?", listOf("Spider-Man: No Way Home", "Shang-Chi and the Legend of the Ten Rings", "Black Widow", "Eternals"), "Culture", "Spider-Man: No Way Home a généré plus de 1,9 milliard de dollars de recettes mondiales en 2021, porté par le retour d'anciens acteurs des précédentes adaptations."),
            en = LocalizedContent("Which film was the biggest box office success in 2021?", listOf("Spider-Man: No Way Home", "Shang-Chi and the Legend of the Ten Rings", "Black Widow", "Eternals"), "Culture", "Spider-Man: No Way Home generated over $1.9 billion in global revenue in 2021, boosted by the return of actors from previous adaptations."),
            zh = LocalizedContent("2021年哪部电影是票房最大的成功？", listOf("蜘蛛侠：英雄无归", "尚气与十环传奇", "黑寡妇", "永恒族"), "文化", "《蜘蛛侠：英雄无归》在2021年全球票房超过19亿美元，得益于前几部改编作品演员的回归。"),
            es = LocalizedContent("¿Qué película fue el mayor éxito de taquilla en 2021?", listOf("Spider-Man: No Way Home", "Shang-Chi and the Legend of the Ten Rings", "Black Widow", "Eternals"), "Cultura", "Spider-Man: No Way Home generó más de 1.900 millones de dólares en ingresos globales en 2021, impulsada por el regreso de actores de adaptaciones anteriores.")
        ),
        BilingualQuestion(
            id = 11615, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"Spider-Man: No Way Home\" a généré combien de milliards de dollars?", listOf("1.92", "1.7", "2.1", "1.5"), "Culture", "Spider-Man: No Way Home a rapporté environ 1,92 milliard de dollars au box-office mondial, devenant ainsi le film le plus rentable de 2021 et le sixième plus gros succès de l'histoire du cinéma."),
            en = LocalizedContent("How many billions of dollars did \"Spider-Man: No Way Home\" generate?", listOf("1.92", "1.7", "2.1", "1.5"), "Culture", "Spider-Man: No Way Home earned approximately $1.92 billion at the global box office, becoming the highest-grossing film of 2021 and the sixth highest-grossing film in cinema history."),
            zh = LocalizedContent("《蜘蛛侠：英雄无归》产生了多少亿美元？", listOf("1.92", "1.7", "2.1", "1.5"), "文化", "《蜘蛛侠：英雄无归》全球票房约19.2亿美元，成为2021年最卖座的电影，也是电影史上第六高票房。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares generó \"Spider-Man: No Way Home\"?", listOf("1.92", "1.7", "2.1", "1.5"), "Cultura", "Spider-Man: No Way Home recaudó aproximadamente 1.920 millones de dólares en taquilla mundial, convirtiéndose en la película más taquillera de 2021 y la sexta más taquillera en la historia del cine.")
        ),
        BilingualQuestion(
            id = 11616, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a été le plus gros succès au box office français en 2024?", listOf("Un p'tit truc en plus", "Sonic 3", "Moi, Moche et Méchant 4", "Sonic le film"), "Culture", "La comédie d'Artus a attiré plus de 10 millions de spectateurs, devenant le plus grand succès français de l'année devant des blockbusters américains."),
            en = LocalizedContent("Which film was the biggest box office success in France in 2024?", listOf("A Little Something Extra", "Sonic 3", "Despicable Me 4", "Sonic the Hedgehog"), "Culture", "Artus's comedy attracted over 10 million viewers, becoming the biggest French success of the year ahead of American blockbusters."),
            zh = LocalizedContent("2024年法国票房最大的成功是哪部电影？", listOf("一点小额外", "刺猬索尼克3", "神偷奶爸4", "刺猬索尼克"), "文化", "阿图斯的喜剧吸引了超过1000万观众，成为当年法国最大的成功，领先于美国大片。"),
            es = LocalizedContent("¿Qué película fue el mayor éxito de taquilla en Francia en 2024?", listOf("Un pequeño extra", "Sonic 3", "Mi Villano Favorito 4", "Sonic la película"), "Cultura", "La comedia de Artus atrajo a más de 10 millones de espectadores, convirtiéndose en el mayor éxito francés del año por delante de los grandes éxitos estadounidenses.")
        ),
        BilingualQuestion(
            id = 11617, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Black Panther\" a-t-il généré 1.15 milliards?", listOf("2018", "2019", "2020", "2017"), "Culture", "Sorti en 2018, Black Panther a été un phénomène mondial, devenant le premier film de super-héros nommé aux Oscars du meilleur film et l'un des plus gros succès du box-office cette année-là."),
            en = LocalizedContent("In which year did \"Black Panther\" generate $1.15 billion?", listOf("2018", "2019", "2020", "2017"), "Culture", "Released in 2018, Black Panther was a global phenomenon, becoming the first superhero film nominated for the Academy Award for Best Picture and one of the biggest box office successes that year."),
            zh = LocalizedContent("《黑豹》在哪一年产生了11.5亿美元？", listOf("2018", "2019", "2020", "2017"), "文化", "2018年上映的《黑豹》是一个全球现象，成为第一部获得奥斯卡最佳影片提名的超级英雄电影，也是当年票房最大的成功之一。"),
            es = LocalizedContent("¿En qué año generó \"Black Panther\" 1.150 millones de dólares?", listOf("2018", "2019", "2020", "2017"), "Cultura", "Estrenada en 2018, Black Panther fue un fenómeno global, convirtiéndose en la primera película de superhéroes nominada al Premio de la Academia a la Mejor Película y uno de los mayores éxitos de taquilla de ese año.")
        ),
        BilingualQuestion(
            id = 11618, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de films Marvel ayant dépassé 1 milliard au box office?", listOf("4", "3", "5", "6"), "Culture", "Sur les 33 films du MCU sortis avant 2024, seuls quatre ont franchi le cap du milliard de dollars de recettes mondiales : Avengers, Avengers: Infinity War, Avengers: Endgame et Spider-Man: No Way Home."),
            en = LocalizedContent("How many Marvel films have surpassed $1 billion at the box office?", listOf("4", "3", "5", "6"), "Culture", "Of the 33 MCU films released before 2024, only four have crossed the $1 billion mark in global revenue: The Avengers, Avengers: Infinity War, Avengers: Endgame, and Spider-Man: No Way Home."),
            zh = LocalizedContent("有多少部漫威电影票房超过10亿美元？", listOf("4", "3", "5", "6"), "文化", "在2024年之前上映的33部漫威电影宇宙电影中，只有四部全球票房突破10亿美元：《复仇者联盟》、《复仇者联盟3：无限战争》、《复仇者联盟4：终局之战》和《蜘蛛侠：英雄无归》。"),
            es = LocalizedContent("¿Cuántas películas de Marvel han superado los 1.000 millones de dólares en taquilla?", listOf("4", "3", "5", "6"), "Cultura", "De las 33 películas del MCU estrenadas antes de 2024, solo cuatro han superado la marca de los 1.000 millones de dólares en ingresos globales: The Avengers, Avengers: Infinity War, Avengers: Endgame y Spider-Man: No Way Home.")
        ),
        BilingualQuestion(
            id = 11619, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("\"Barbie\" a généré combien de milliards de dollars en 2023?", listOf("1.44", "1.2", "1.6", "1.0"), "Culture", "Le film Barbie, réalisé par Greta Gerwig, a rapporté 1,44 milliard de dollars au box-office mondial en 2023, devenant ainsi le film le plus rentable de l'année."),
            en = LocalizedContent("How many billions of dollars did \"Barbie\" generate in 2023?", listOf("1.44", "1.2", "1.6", "1.0"), "Culture", "The film Barbie, directed by Greta Gerwig, earned $1.44 billion at the global box office in 2023, becoming the highest-grossing film of the year."),
            zh = LocalizedContent("《芭比》在2023年产生了多少亿美元？", listOf("1.44", "1.2", "1.6", "1.0"), "文化", "格蕾塔·葛韦格执导的《芭比》在2023年全球票房收入14.4亿美元，成为当年最卖座的电影。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares generó \"Barbie\" en 2023?", listOf("1.44", "1.2", "1.6", "1.0"), "Cultura", "La película Barbie, dirigida por Greta Gerwig, recaudó 1.440 millones de dólares en taquilla mundial en 2023, convirtiéndose en la película más taquillera del año.")
        ),
        BilingualQuestion(
            id = 11620, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"Amélie\"?", listOf("Jean-Pierre Jeunet", "Michel Gondry", "Cédric Kahn", "Mathieu Kassovitz"), "Culture", "Jean-Pierre Jeunet a réalisé \"Le Fabuleux Destin d'Amélie Poulain\" en 2001, un film devenu emblématique du cinéma français."),
            en = LocalizedContent("Who directed \"Amélie\"?", listOf("Jean-Pierre Jeunet", "Michel Gondry", "Cédric Kahn", "Mathieu Kassovitz"), "Culture", "Jean-Pierre Jeunet directed \"Le Fabuleux Destin d'Amélie Poulain\" in 2001, a film that became emblematic of French cinema."),
            zh = LocalizedContent("谁执导了《天使爱美丽》？", listOf("让-皮埃尔·热内", "米歇尔·贡德里", "塞德里克·康", "马修·卡索维茨"), "文化", "让-皮埃尔·热内在2001年执导了《天使爱美丽》，这部电影成为法国电影的标志性作品。"),
            es = LocalizedContent("¿Quién dirigió \"Amélie\"?", listOf("Jean-Pierre Jeunet", "Michel Gondry", "Cédric Kahn", "Mathieu Kassovitz"), "Cultura", "Jean-Pierre Jeunet dirigió \"Le Fabuleux Destin d'Amélie Poulain\" en 2001, una película que se convirtió en emblemática del cine francés.")
        ),
        BilingualQuestion(
            id = 11621, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Amélie\" est-elle sortie?", listOf("2001", "1999", "2003", "2000"), "Culture", "Le film \"Le Fabuleux Destin d'Amélie Poulain\", réalisé par Jean-Pierre Jeunet, est sorti en 2001. Il a connu un succès international et a remporté plusieurs Césars."),
            en = LocalizedContent("In what year was \"Amélie\" released?", listOf("2001", "1999", "2003", "2000"), "Culture", "The film \"Le Fabuleux Destin d'Amélie Poulain\", directed by Jean-Pierre Jeunet, was released in 2001. It achieved international success and won several César Awards."),
            zh = LocalizedContent("《天使爱美丽》在哪一年上映？", listOf("2001", "1999", "2003", "2000"), "文化", "由让-皮埃尔·热内执导的电影《天使爱美丽》于2001年上映，获得了国际成功并赢得了多项凯撒奖。"),
            es = LocalizedContent("¿En qué año se estrenó \"Amélie\"?", listOf("2001", "1999", "2003", "2000"), "Cultura", "La película \"Le Fabuleux Destin d'Amélie Poulain\", dirigida por Jean-Pierre Jeunet, se estrenó en 2001. Tuvo éxito internacional y ganó varios premios César.")
        ),
        BilingualQuestion(
            id = 11622, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le titre original de \"Amélie\"?", listOf("Le Fabuleux Destin d'Amélie Poulain", "Amélie Poulain", "Le Destin d'Amélie", "Amélie de Montmartre"), "Culture", "Le titre original complet du film de Jean-Pierre Jeunet est \"Le Fabuleux Destin d'Amélie Poulain\", souvent abrégé en \"Amélie\" à l'international."),
            en = LocalizedContent("What is the original title of \"Amélie\"?", listOf("Le Fabuleux Destin d'Amélie Poulain", "Amélie Poulain", "Le Destin d'Amélie", "Amélie de Montmartre"), "Culture", "The full original title of Jean-Pierre Jeunet's film is \"Le Fabuleux Destin d'Amélie Poulain\", often shortened to \"Amélie\" internationally."),
            zh = LocalizedContent("《天使爱美丽》的原名是什么？", listOf("Le Fabuleux Destin d'Amélie Poulain", "Amélie Poulain", "Le Destin d'Amélie", "Amélie de Montmartre"), "文化", "让-皮埃尔·热内电影的完整原名为《Le Fabuleux Destin d'Amélie Poulain》，在国际上常简称为《Amélie》。"),
            es = LocalizedContent("¿Cuál es el título original de \"Amélie\"?", listOf("Le Fabuleux Destin d'Amélie Poulain", "Amélie Poulain", "Le Destin d'Amélie", "Amélie de Montmartre"), "Cultura", "El título original completo de la película de Jean-Pierre Jeunet es \"Le Fabuleux Destin d'Amélie Poulain\", a menudo abreviado como \"Amélie\" internacionalmente.")
        ),
        BilingualQuestion(
            id = 11623, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"La Grande Vadrouille\"?", listOf("Gérard Oury", "Claude Zidi", "Édouard Molinaro", "Michel Deville"), "Culture", "Gérard Oury a réalisé \"La Grande Vadrouille\" en 1966, une comédie culte avec Bourvil et Louis de Funès."),
            en = LocalizedContent("Who directed \"La Grande Vadrouille\"?", listOf("Gérard Oury", "Claude Zidi", "Édouard Molinaro", "Michel Deville"), "Culture", "Gérard Oury directed \"La Grande Vadrouille\" in 1966, a cult comedy starring Bourvil and Louis de Funès."),
            zh = LocalizedContent("谁执导了《虎口脱险》？", listOf("热拉尔·乌里", "克洛德·齐迪", "爱德华·莫利纳罗", "米歇尔·德维尔"), "文化", "热拉尔·乌里在1966年执导了《虎口脱险》，这是一部由布尔维尔和路易·德·菲奈斯主演的经典喜剧。"),
            es = LocalizedContent("¿Quién dirigió \"La Grande Vadrouille\"?", listOf("Gérard Oury", "Claude Zidi", "Édouard Molinaro", "Michel Deville"), "Cultura", "Gérard Oury dirigió \"La Grande Vadrouille\" en 1966, una comedia de culto protagonizada por Bourvil y Louis de Funès.")
        ),
        BilingualQuestion(
            id = 11624, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"La Grande Vadrouille\" est-elle sortie?", listOf("1966", "1964", "1968", "1970"), "Culture", "La Grande Vadrouille, film culte de Gérard Oury avec Bourvil et de Funès, est sortie en 1966 et reste l'un des plus grands succès du cinéma français."),
            en = LocalizedContent("In what year was \"La Grande Vadrouille\" released?", listOf("1966", "1964", "1968", "1970"), "Culture", "La Grande Vadrouille, Gérard Oury's cult film with Bourvil and de Funès, was released in 1966 and remains one of the biggest successes of French cinema."),
            zh = LocalizedContent("《虎口脱险》在哪一年上映？", listOf("1966", "1964", "1968", "1970"), "文化", "热拉尔·乌里执导的经典电影《虎口脱险》，由布尔维尔和德·菲奈斯主演，于1966年上映，至今仍是法国电影最成功的作品之一。"),
            es = LocalizedContent("¿En qué año se estrenó \"La Grande Vadrouille\"?", listOf("1966", "1964", "1968", "1970"), "Cultura", "La Grande Vadrouille, la película de culto de Gérard Oury con Bourvil y de Funès, se estrenó en 1966 y sigue siendo uno de los mayores éxitos del cine francés.")
        ),
        BilingualQuestion(
            id = 11625, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"Bienvenue chez les Ch'tis\"?", listOf("Dany Boon", "Bénédicte Loyen", "Alain Chabat", "Claude Zidi"), "Culture", "Dany Boon a réalisé ce film sorti en 2008, qui est devenu le plus grand succès du cinéma français en termes d'entrées."),
            en = LocalizedContent("Who directed \"Bienvenue chez les Ch'tis\"?", listOf("Dany Boon", "Bénédicte Loyen", "Alain Chabat", "Claude Zidi"), "Culture", "Dany Boon directed this film released in 2008, which became the biggest success in French cinema in terms of admissions."),
            zh = LocalizedContent("谁执导了《欢迎来北方》？", listOf("丹尼·伯恩", "贝内迪克特·洛扬", "阿兰·夏巴", "克洛德·齐迪"), "文化", "丹尼·伯恩执导了这部2008年上映的电影，它成为法国电影史上观影人次最多的成功之作。"),
            es = LocalizedContent("¿Quién dirigió \"Bienvenue chez les Ch'tis\"?", listOf("Dany Boon", "Bénédicte Loyen", "Alain Chabat", "Claude Zidi"), "Cultura", "Dany Boon dirigió esta película estrenada en 2008, que se convirtió en el mayor éxito del cine francés en términos de entradas.")
        ),
        BilingualQuestion(
            id = 11626, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de personnes \"Bienvenue chez les Ch'tis\" a-t-il attiré au cinéma en France?", listOf("20 millions", "15 millions", "25 millions", "10 millions"), "Culture", "Le film de Dany Boon a réalisé plus de 20 millions d'entrées en France, devenant le plus grand succès du box-office français jusqu'à la sortie d'Intouchables."),
            en = LocalizedContent("How many people did \"Bienvenue chez les Ch'tis\" attract to cinemas in France?", listOf("20 million", "15 million", "25 million", "10 million"), "Culture", "Dany Boon's film achieved over 20 million admissions in France, becoming the biggest success at the French box office until the release of Intouchables."),
            zh = LocalizedContent("《欢迎来北方》在法国吸引了多少观影人次？", listOf("2000万", "1500万", "2500万", "1000万"), "文化", "丹尼·伯恩的电影在法国获得了超过2000万观影人次，成为法国票房最高的电影，直到《触不可及》上映。"),
            es = LocalizedContent("¿Cuántas personas atrajo \"Bienvenue chez les Ch'tis\" al cine en Francia?", listOf("20 millones", "15 millones", "25 millones", "10 millones"), "Cultura", "La película de Dany Boon logró más de 20 millones de entradas en Francia, convirtiéndose en el mayor éxito de taquilla francesa hasta el estreno de Intouchables.")
        ),
        BilingualQuestion(
            id = 11627, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Intouchables\"?", listOf("Olivier Nakache et Éric Toledano", "Michel Gondry", "Mathieu Kassovitz", "Jean-Pierre Jeunet"), "Culture", "Olivier Nakache et Éric Toledano, un duo de réalisateurs français, ont co-réalisé ce film sorti en 2011, inspiré de l'histoire vraie de Philippe Pozzo di Borgo et de son aide-soignant Abdel Sellou."),
            en = LocalizedContent("Who directed \"Intouchables\"?", listOf("Olivier Nakache and Éric Toledano", "Michel Gondry", "Mathieu Kassovitz", "Jean-Pierre Jeunet"), "Culture", "Olivier Nakache and Éric Toledano, a French director duo, co-directed this film released in 2011, inspired by the true story of Philippe Pozzo di Borgo and his caregiver Abdel Sellou."),
            zh = LocalizedContent("谁执导了《触不可及》？", listOf("奥利维·那卡什和埃里克·托莱达诺", "米歇尔·贡德里", "马修·卡索维茨", "让-皮埃尔·热内"), "文化", "奥利维·那卡什和埃里克·托莱达诺，一对法国导演组合，共同执导了这部2011年上映的电影，灵感来源于菲利普·波佐·迪·博尔戈和他的护工阿卜杜勒·塞卢的真实故事。"),
            es = LocalizedContent("¿Quién dirigió \"Intouchables\"?", listOf("Olivier Nakache y Éric Toledano", "Michel Gondry", "Mathieu Kassovitz", "Jean-Pierre Jeunet"), "Cultura", "Olivier Nakache y Éric Toledano, un dúo de directores franceses, co-dirigieron esta película estrenada en 2011, inspirada en la historia real de Philippe Pozzo di Borgo y su cuidador Abdel Sellou.")
        ),
        BilingualQuestion(
            id = 11628, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Intouchables\" est-il sorti?", listOf("2011", "2010", "2012", "2009"), "Culture", "Le film \"Intouchables\", réalisé par Olivier Nakache et Éric Toledano, est sorti en 2011. Il a connu un immense succès public et critique en France et à l'international."),
            en = LocalizedContent("In what year was \"Intouchables\" released?", listOf("2011", "2010", "2012", "2009"), "Culture", "The film \"Intouchables\", directed by Olivier Nakache and Éric Toledano, was released in 2011. It achieved immense public and critical success in France and internationally."),
            zh = LocalizedContent("《触不可及》在哪一年上映？", listOf("2011", "2010", "2012", "2009"), "文化", "由奥利维·那卡什和埃里克·托莱达诺执导的电影《触不可及》于2011年上映，在法国和国际上取得了巨大的公众和评论成功。"),
            es = LocalizedContent("¿En qué año se estrenó \"Intouchables\"?", listOf("2011", "2010", "2012", "2009"), "Cultura", "La película \"Intouchables\", dirigida por Olivier Nakache y Éric Toledano, se estrenó en 2011. Obtuvo un inmenso éxito público y crítico en Francia e internacionalmente.")
        ),
        BilingualQuestion(
            id = 11629, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"La Haine\"?", listOf("Mathieu Kassovitz", "Laurent Cantet", "Cédric Kahn", "Stéphane Brize"), "Culture", "Mathieu Kassovitz a réalisé ce film culte en 1995, à seulement 28 ans, marquant le cinéma français par son portrait brut de la banlieue parisienne."),
            en = LocalizedContent("Who directed \"La Haine\"?", listOf("Mathieu Kassovitz", "Laurent Cantet", "Cédric Kahn", "Stéphane Brize"), "Culture", "Mathieu Kassovitz directed this cult film in 1995, at only 28 years old, marking French cinema with its raw portrayal of the Parisian suburbs."),
            zh = LocalizedContent("谁执导了《怒火青春》？", listOf("马修·卡索维茨", "洛朗·康泰", "塞德里克·康", "斯特凡·布里兹"), "文化", "马修·卡索维茨在1995年执导了这部经典电影，当时他只有28岁，以其对巴黎郊区的真实描绘而成为法国电影的标志。"),
            es = LocalizedContent("¿Quién dirigió \"La Haine\"?", listOf("Mathieu Kassovitz", "Laurent Cantet", "Cédric Kahn", "Stéphane Brize"), "Cultura", "Mathieu Kassovitz dirigió esta película de culto en 1995, con solo 28 años, marcando el cine francés con su retrato crudo de los suburbios parisinos.")
        ),
        BilingualQuestion(
            id = 11630, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"La Haine\" est-elle sortie?", listOf("1995", "1993", "1997", "1994"), "Culture", "Sorti en 1995, le film de Mathieu Kassovitz a marqué le cinéma français par son portrait brut des banlieues."),
            en = LocalizedContent("In which year was \"La Haine\" released?", listOf("1995", "1993", "1997", "1994"), "Culture", "Released in 1995, Mathieu Kassovitz's film marked French cinema with its raw portrayal of the suburbs."),
            zh = LocalizedContent("电影《怒火青春》是哪一年上映的？", listOf("1995", "1993", "1997", "1994"), "文化", "1995年上映，马修·卡索维茨的这部电影以其对郊区的粗粝描绘在法国电影史上留下印记。"),
            es = LocalizedContent("¿En qué año se estrenó \"El odio\"?", listOf("1995", "1993", "1997", "1994"), "Cultura", "Estrenada en 1995, la película de Mathieu Kassovitz marcó el cine francés por su retrato crudo de los suburbios.")
        ),
        BilingualQuestion(
            id = 11631, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Eternal Sunshine of the Spotless Mind\"?", listOf("Michel Gondry", "Jean-Pierre Jeunet", "Cédric Kahn", "Mathieu Kassovitz"), "Culture", "Le réalisateur français Michel Gondry a mis en scène ce film de 2004, connu pour son esthétique visuelle inventive et son récit non linéaire."),
            en = LocalizedContent("Who directed \"Eternal Sunshine of the Spotless Mind\"?", listOf("Michel Gondry", "Jean-Pierre Jeunet", "Cédric Kahn", "Mathieu Kassovitz"), "Culture", "French director Michel Gondry directed this 2004 film, known for its inventive visual aesthetic and non-linear narrative."),
            zh = LocalizedContent("谁执导了《暖暖内含光》？", listOf("米歇尔·贡德里", "让-皮埃尔·热内", "塞德里克·康", "马修·卡索维茨"), "文化", "法国导演米歇尔·贡德里执导了这部2004年的电影，以其创新的视觉美学和非线性叙事而闻名。"),
            es = LocalizedContent("¿Quién dirigió \"Eterno resplandor de una mente sin recuerdos\"?", listOf("Michel Gondry", "Jean-Pierre Jeunet", "Cédric Kahn", "Mathieu Kassovitz"), "Cultura", "El director francés Michel Gondry dirigió esta película de 2004, conocida por su estética visual inventiva y su narrativa no lineal.")
        ),
        BilingualQuestion(
            id = 11632, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a réalisé \"La Chambre Verte\"?", listOf("François Truffaut", "Jean-Luc Godard", "Louis Malle", "Claude Jade"), "Culture", "François Truffaut a réalisé \"La Chambre Verte\" en 1978, une adaptation libre d'une nouvelle d'Henry James. Il y interprète également le rôle principal."),
            en = LocalizedContent("Who directed \"The Green Room\"?", listOf("François Truffaut", "Jean-Luc Godard", "Louis Malle", "Claude Jade"), "Culture", "François Truffaut directed \"The Green Room\" in 1978, a free adaptation of a short story by Henry James. He also plays the lead role."),
            zh = LocalizedContent("谁执导了《绿屋》？", listOf("弗朗索瓦·特吕弗", "让-吕克·戈达尔", "路易·马勒", "克洛德·雅德"), "文化", "弗朗索瓦·特吕弗于1978年执导了《绿屋》，这是对亨利·詹姆斯短篇小说的自由改编。他还在片中饰演主角。"),
            es = LocalizedContent("¿Quién dirigió \"La habitación verde\"?", listOf("François Truffaut", "Jean-Luc Godard", "Louis Malle", "Claude Jade"), "Cultura", "François Truffaut dirigió \"La habitación verde\" en 1978, una adaptación libre de un cuento de Henry James. También interpreta el papel principal.")
        ),
        BilingualQuestion(
            id = 11633, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Hiroshima mon amour\"?", listOf("Alain Resnais", "Jean-Luc Godard", "François Truffaut", "Louis Malle"), "Culture", "Alain Resnais a réalisé \"Hiroshima mon amour\" en 1959, un film marquant de la Nouvelle Vague française qui mêle mémoire individuelle et collective après la bombe atomique."),
            en = LocalizedContent("Who directed \"Hiroshima mon amour\"?", listOf("Alain Resnais", "Jean-Luc Godard", "François Truffaut", "Louis Malle"), "Culture", "Alain Resnais directed \"Hiroshima mon amour\" in 1959, a landmark film of the French New Wave that blends individual and collective memory after the atomic bomb."),
            zh = LocalizedContent("谁执导了《广岛之恋》？", listOf("阿伦·雷乃", "让-吕克·戈达尔", "弗朗索瓦·特吕弗", "路易·马勒"), "文化", "阿伦·雷乃于1959年执导了《广岛之恋》，这是法国新浪潮的标志性电影，融合了原子弹后的个人与集体记忆。"),
            es = LocalizedContent("¿Quién dirigió \"Hiroshima mon amour\"?", listOf("Alain Resnais", "Jean-Luc Godard", "François Truffaut", "Louis Malle"), "Cultura", "Alain Resnais dirigió \"Hiroshima mon amour\" en 1959, una película emblemática de la Nouvelle Vague francesa que mezcla la memoria individual y colectiva tras la bomba atómica.")
        ),
        BilingualQuestion(
            id = 11634, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Hiroshima mon amour\" est-il sorti?", listOf("1959", "1957", "1961", "1955"), "Culture", "Le film \"Hiroshima mon amour\", réalisé par Alain Resnais, est sorti en 1959, marquant une œuvre majeure de la Nouvelle Vague française."),
            en = LocalizedContent("In which year was \"Hiroshima mon amour\" released?", listOf("1959", "1957", "1961", "1955"), "Culture", "The film \"Hiroshima mon amour\", directed by Alain Resnais, was released in 1959, marking a major work of the French New Wave."),
            zh = LocalizedContent("电影《广岛之恋》是哪一年上映的？", listOf("1959", "1957", "1961", "1955"), "文化", "由阿伦·雷乃执导的电影《广岛之恋》于1959年上映，是法国新浪潮的重要作品。"),
            es = LocalizedContent("¿En qué año se estrenó \"Hiroshima mon amour\"?", listOf("1959", "1957", "1961", "1955"), "Cultura", "La película \"Hiroshima mon amour\", dirigida por Alain Resnais, se estrenó en 1959, marcando una obra importante de la Nouvelle Vague francesa.")
        ),
        BilingualQuestion(
            id = 11635, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Les Quatre Cents Coups\"?", listOf("François Truffaut", "Jean-Luc Godard", "Claude Chabrol", "Jacques Rivette"), "Culture", "François Truffaut a réalisé ce film en 1959, marquant ses débuts dans la Nouvelle Vague française et s'inspirant de sa propre enfance difficile."),
            en = LocalizedContent("Who directed \"The 400 Blows\"?", listOf("François Truffaut", "Jean-Luc Godard", "Claude Chabrol", "Jacques Rivette"), "Culture", "François Truffaut directed this film in 1959, marking his debut in the French New Wave and drawing from his own difficult childhood."),
            zh = LocalizedContent("谁执导了《四百击》？", listOf("弗朗索瓦·特吕弗", "让-吕克·戈达尔", "克洛德·夏布洛尔", "雅克·里维特"), "文化", "弗朗索瓦·特吕弗于1959年执导了这部电影，标志着他在法国新浪潮中的首次亮相，并取材于他自己艰难的童年。"),
            es = LocalizedContent("¿Quién dirigió \"Los cuatrocientos golpes\"?", listOf("François Truffaut", "Jean-Luc Godard", "Claude Chabrol", "Jacques Rivette"), "Cultura", "François Truffaut dirigió esta película en 1959, marcando su debut en la Nouvelle Vague francesa e inspirándose en su propia infancia difícil.")
        ),
        BilingualQuestion(
            id = 11636, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"Les Quatre Cents Coups\" est-il sorti?", listOf("1959", "1957", "1961", "1955"), "Culture", "Premier long-métrage de François Truffaut et film fondateur de la Nouvelle Vague, Les Quatre Cents Coups est sorti en 1959."),
            en = LocalizedContent("In which year was \"The 400 Blows\" released?", listOf("1959", "1957", "1961", "1955"), "Culture", "François Truffaut's first feature film and a founding work of the French New Wave, The 400 Blows was released in 1959."),
            zh = LocalizedContent("电影《四百击》是哪一年上映的？", listOf("1959", "1957", "1961", "1955"), "文化", "弗朗索瓦·特吕弗的首部长片和法国新浪潮的奠基之作，《四百击》于1959年上映。"),
            es = LocalizedContent("¿En qué año se estrenó \"Los cuatrocientos golpes\"?", listOf("1959", "1957", "1961", "1955"), "Cultura", "Primer largometraje de François Truffaut y obra fundacional de la Nouvelle Vague francesa, Los cuatrocientos golpes se estrenó en 1959.")
        ),
        BilingualQuestion(
            id = 11637, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Bande à part\"?", listOf("Jean-Luc Godard", "François Truffaut", "Claude Chabrol", "Jacques Rivette"), "Culture", "Jean-Luc Godard a réalisé \"Bande à part\" en 1964, une œuvre emblématique de la Nouvelle Vague française."),
            en = LocalizedContent("Who directed \"Band of Outsiders\"?", listOf("Jean-Luc Godard", "François Truffaut", "Claude Chabrol", "Jacques Rivette"), "Culture", "Jean-Luc Godard directed \"Band of Outsiders\" in 1964, an emblematic work of the French New Wave."),
            zh = LocalizedContent("谁执导了《法外之徒》？", listOf("让-吕克·戈达尔", "弗朗索瓦·特吕弗", "克洛德·夏布洛尔", "雅克·里维特"), "文化", "让-吕克·戈达尔于1964年执导了《法外之徒》，这是法国新浪潮的一部标志性作品。"),
            es = LocalizedContent("¿Quién dirigió \"Banda aparte\"?", listOf("Jean-Luc Godard", "François Truffaut", "Claude Chabrol", "Jacques Rivette"), "Cultura", "Jean-Luc Godard dirigió \"Banda aparte\" en 1964, una obra emblemática de la Nouvelle Vague francesa.")
        ),
        BilingualQuestion(
            id = 11638, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Rififi\"?", listOf("Jules Dassin", "Jean-Pierre Melville", "Henri Verneuil", "Yves Allégret"), "Culture", "Jules Dassin, réalisateur américain exilé en Europe à cause du maccarthysme, a réalisé \"Rififi\" en 1955, un film noir français devenu culte pour sa célèbre scène de casse sans dialogue."),
            en = LocalizedContent("Who directed \"Rififi\"?", listOf("Jules Dassin", "Jean-Pierre Melville", "Henri Verneuil", "Yves Allégret"), "Culture", "Jules Dassin, an American director exiled in Europe due to McCarthyism, directed \"Rififi\" in 1955, a French film noir that became cult for its famous heist scene without dialogue."),
            zh = LocalizedContent("谁执导了《男人的争斗》？", listOf("朱尔斯·达辛", "让-皮埃尔·梅尔维尔", "亨利·韦纳伊", "伊夫·阿莱格雷"), "文化", "朱尔斯·达辛，一位因麦卡锡主义流亡欧洲的美国导演，于1955年执导了《男人的争斗》，这部法国黑色电影因其著名的无对白抢劫场景而成为 cult 片。"),
            es = LocalizedContent("¿Quién dirigió \"Rififi\"?", listOf("Jules Dassin", "Jean-Pierre Melville", "Henri Verneuil", "Yves Allégret"), "Cultura", "Jules Dassin, un director estadounidense exiliado en Europa debido al macartismo, dirigió \"Rififi\" en 1955, un cine negro francés que se volvió de culto por su famosa escena de robo sin diálogo.")
        ),
        BilingualQuestion(
            id = 11639, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Le Cercle Rouge\"?", listOf("Jean-Pierre Melville", "Jules Dassin", "Henri Verneuil", "Yves Allégret"), "Culture", "Jean-Pierre Melville a réalisé Le Cercle Rouge en 1970, un film de braquage emblématique du polar français, connu pour son esthétique minimaliste et son influence sur le cinéma noir."),
            en = LocalizedContent("Who directed \"Le Cercle Rouge\"?", listOf("Jean-Pierre Melville", "Jules Dassin", "Henri Verneuil", "Yves Allégret"), "Culture", "Jean-Pierre Melville directed Le Cercle Rouge in 1970, an iconic heist film of French crime cinema, known for its minimalist aesthetic and influence on film noir."),
            zh = LocalizedContent("谁执导了《红圈》？", listOf("让-皮埃尔·梅尔维尔", "朱尔斯·达辛", "亨利·韦纳伊", "伊夫·阿莱格雷"), "文化", "让-皮埃尔·梅尔维尔于1970年执导了《红圈》，这是一部法国犯罪电影中标志性的抢劫片，以其极简主义美学和对黑色电影的影响而闻名。"),
            es = LocalizedContent("¿Quién dirigió \"El círculo rojo\"?", listOf("Jean-Pierre Melville", "Jules Dassin", "Henri Verneuil", "Yves Allégret"), "Cultura", "Jean-Pierre Melville dirigió El círculo rojo en 1970, una película de atracos emblemática del cine negro francés, conocida por su estética minimalista y su influencia en el cine negro.")
        ),
        BilingualQuestion(
            id = 11640, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le premier film \"Toy Story\"?", listOf("Toy Story", "Toy Story 2", "Toy Story 3", "Toy Story 4"), "Culture", "Toy Story, sorti en 1995, est le premier long-métrage d'animation entièrement réalisé en images de synthèse par Pixar et distribué par Disney."),
            en = LocalizedContent("What is the first \"Toy Story\" film?", listOf("Toy Story", "Toy Story 2", "Toy Story 3", "Toy Story 4"), "Culture", "Toy Story, released in 1995, is the first feature-length film entirely created with computer-generated imagery by Pixar and distributed by Disney."),
            zh = LocalizedContent("第一部《玩具总动员》电影是哪一部？", listOf("玩具总动员", "玩具总动员2", "玩具总动员3", "玩具总动员4"), "文化", "《玩具总动员》于1995年上映，是皮克斯制作、迪士尼发行的第一部完全由计算机生成图像的长篇动画电影。"),
            es = LocalizedContent("¿Cuál es la primera película de \"Toy Story\"?", listOf("Toy Story", "Toy Story 2", "Toy Story 3", "Toy Story 4"), "Cultura", "Toy Story, estrenada en 1995, es el primer largometraje de animación completamente realizado por ordenador por Pixar y distribuido por Disney.")
        ),
        BilingualQuestion(
            id = 11641, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé \"Toy Story\" (1995)?", listOf("John Lasseter", "Pete Docter", "Andrew Stanton", "Kelsey Mann"), "Culture", "John Lasseter a réalisé \"Toy Story\" en 1995, marquant le premier long-métrage d'animation entièrement en images de synthèse, produit par Pixar et distribué par Disney."),
            en = LocalizedContent("Who directed \"Toy Story\" (1995)?", listOf("John Lasseter", "Pete Docter", "Andrew Stanton", "Kelsey Mann"), "Culture", "John Lasseter directed \"Toy Story\" in 1995, marking the first fully computer-animated feature film, produced by Pixar and distributed by Disney."),
            zh = LocalizedContent("谁执导了《玩具总动员》（1995年）？", listOf("约翰·拉塞特", "彼特·道格特", "安德鲁·斯坦顿", "凯尔西·曼"), "文化", "约翰·拉塞特于1995年执导了《玩具总动员》，这是第一部完全由计算机生成动画的长篇电影，由皮克斯制作、迪士尼发行。"),
            es = LocalizedContent("¿Quién dirigió \"Toy Story\" (1995)?", listOf("John Lasseter", "Pete Docter", "Andrew Stanton", "Kelsey Mann"), "Cultura", "John Lasseter dirigió \"Toy Story\" en 1995, marcando el primer largometraje completamente animado por ordenador, producido por Pixar y distribuido por Disney.")
        ),
        BilingualQuestion(
            id = 11642, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel studio a produit les films \"Toy Story\"?", listOf("Pixar", "DreamWorks", "Disney", "Illumination"), "Culture", "Pixar Animation Studios a produit Toy Story, sorti en 1995, qui fut le premier long-métrage d'animation entièrement réalisé en images de synthèse."),
            en = LocalizedContent("Which studio produced the \"Toy Story\" films?", listOf("Pixar", "DreamWorks", "Disney", "Illumination"), "Culture", "Pixar Animation Studios produced Toy Story, released in 1995, which was the first fully computer-animated feature film."),
            zh = LocalizedContent("哪个工作室制作了《玩具总动员》系列电影？", listOf("皮克斯", "梦工厂", "迪士尼", "照明娱乐"), "文化", "皮克斯动画工作室制作了《玩具总动员》，该片于1995年上映，是第一部完全由计算机生成动画的长篇电影。"),
            es = LocalizedContent("¿Qué estudio produjo las películas de \"Toy Story\"?", listOf("Pixar", "DreamWorks", "Disney", "Illumination"), "Cultura", "Pixar Animation Studios produjo Toy Story, estrenada en 1995, que fue el primer largometraje completamente animado por ordenador.")
        ),
        BilingualQuestion(
            id = 11643, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Monstres & Cie\"?", listOf("Pete Docter et David Docter", "Andrew Stanton", "Kelsey Mann", "John Lasseter"), "Culture", "Pete Docter a coréalisé le film avec David Silverman, mais c'est une erreur fréquente de confondre le nom de famille de ce dernier."),
            en = LocalizedContent("Who directed \"Monsters, Inc.\"?", listOf("Pete Docter and David Docter", "Andrew Stanton", "Kelsey Mann", "John Lasseter"), "Culture", "Pete Docter co-directed the film with David Silverman, but it is a common mistake to confuse the latter's surname."),
            zh = LocalizedContent("谁执导了《怪兽电力公司》？", listOf("彼特·道格特和大卫·道格特", "安德鲁·斯坦顿", "凯尔西·曼", "约翰·拉塞特"), "文化", "彼特·道格特与大卫·西尔弗曼共同执导了该片，但常有人错误地混淆后者的姓氏。"),
            es = LocalizedContent("¿Quién dirigió \"Monsters, Inc.\"?", listOf("Pete Docter y David Docter", "Andrew Stanton", "Kelsey Mann", "John Lasseter"), "Cultura", "Pete Docter codirigió la película con David Silverman, pero es un error común confundir el apellido de este último.")
        ),
        BilingualQuestion(
            id = 11644, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Monstres & Cie\" est-il sorti?", listOf("2001", "1999", "2003", "2000"), "Culture", "Le film d'animation Pixar Monstres & Cie est sorti en 2001, succédant à Toy Story 2 et précédant Le Monde de Nemo."),
            en = LocalizedContent("In what year was \"Monsters, Inc.\" released?", listOf("2001", "1999", "2003", "2000"), "Culture", "The Pixar animated film Monsters, Inc. was released in 2001, following Toy Story 2 and preceding Finding Nemo."),
            zh = LocalizedContent("《怪兽电力公司》于哪一年上映？", listOf("2001", "1999", "2003", "2000"), "文化", "皮克斯动画电影《怪兽电力公司》于2001年上映，紧随《玩具总动员2》之后，早于《海底总动员》。"),
            es = LocalizedContent("¿En qué año se estrenó \"Monsters, Inc.\"?", listOf("2001", "1999", "2003", "2000"), "Cultura", "La película animada de Pixar Monsters, Inc. se estrenó en 2001, después de Toy Story 2 y antes de Finding Nemo.")
        ),
        BilingualQuestion(
            id = 11645, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Le Monde de Nemo\"?", listOf("Andrew Stanton et Lee Unkrich", "Pete Docter", "John Lasseter", "Brad Bird"), "Culture", "Andrew Stanton a co-réalisé le film avec Lee Unkrich, ce dernier étant également connu pour son travail sur Toy Story 2."),
            en = LocalizedContent("Who directed \"Finding Nemo\"?", listOf("Andrew Stanton and Lee Unkrich", "Pete Docter", "John Lasseter", "Brad Bird"), "Culture", "Andrew Stanton co-directed the film with Lee Unkrich, the latter also known for his work on Toy Story 2."),
            zh = LocalizedContent("谁执导了《海底总动员》？", listOf("安德鲁·斯坦顿和李·昂克里奇", "彼特·道格特", "约翰·拉塞特", "布拉德·伯德"), "文化", "安德鲁·斯坦顿与李·昂克里奇共同执导了该片，后者也因参与《玩具总动员2》而闻名。"),
            es = LocalizedContent("¿Quién dirigió \"Finding Nemo\"?", listOf("Andrew Stanton y Lee Unkrich", "Pete Docter", "John Lasseter", "Brad Bird"), "Cultura", "Andrew Stanton codirigió la película con Lee Unkrich, este último también conocido por su trabajo en Toy Story 2.")
        ),
        BilingualQuestion(
            id = 11646, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Le Monde de Nemo\" est-il sorti?", listOf("2003", "2001", "2005", "2002"), "Culture", "Le Monde de Nemo, film d'animation des studios Pixar, est sorti en 2003 et a connu un immense succès critique et commercial."),
            en = LocalizedContent("In what year was \"Finding Nemo\" released?", listOf("2003", "2001", "2005", "2002"), "Culture", "Finding Nemo, an animated film from Pixar Studios, was released in 2003 and achieved immense critical and commercial success."),
            zh = LocalizedContent("《海底总动员》于哪一年上映？", listOf("2003", "2001", "2005", "2002"), "文化", "《海底总动员》是皮克斯工作室的动画电影，于2003年上映，获得了巨大的评论和商业成功。"),
            es = LocalizedContent("¿En qué año se estrenó \"Finding Nemo\"?", listOf("2003", "2001", "2005", "2002"), "Cultura", "Finding Nemo, una película animada de los estudios Pixar, se estrenó en 2003 y logró un inmenso éxito crítico y comercial.")
        ),
        BilingualQuestion(
            id = 11647, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Raiponce\"?", listOf("Nathan Greno et Byron Howard", "Ron Clements", "John Musker", "Clyde Geronimi"), "Culture", "Nathan Greno et Byron Howard ont co-réalisé ce film d'animation des studios Disney sorti en 2010, adapté du conte des frères Grimm."),
            en = LocalizedContent("Who directed \"Tangled\"?", listOf("Nathan Greno and Byron Howard", "Ron Clements", "John Musker", "Clyde Geronimi"), "Culture", "Nathan Greno and Byron Howard co-directed this Disney animated film released in 2010, adapted from the Brothers Grimm fairy tale."),
            zh = LocalizedContent("谁执导了《魔发奇缘》？", listOf("内森·格雷诺和拜伦·霍华德", "罗恩·克莱门茨", "约翰·马斯克", "克莱德·杰洛尼米"), "文化", "内森·格雷诺和拜伦·霍华德共同执导了这部迪士尼动画电影，于2010年上映，改编自格林兄弟的童话。"),
            es = LocalizedContent("¿Quién dirigió \"Tangled\"?", listOf("Nathan Greno y Byron Howard", "Ron Clements", "John Musker", "Clyde Geronimi"), "Cultura", "Nathan Greno y Byron Howard codirigieron esta película animada de Disney estrenada en 2010, adaptada del cuento de hadas de los hermanos Grimm.")
        ),
        BilingualQuestion(
            id = 11648, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"La Reine des Neiges\"?", listOf("Chris Buck et Jennifer Lee", "Ron Clements", "John Musker", "Clyde Geronimi"), "Culture", "Chris Buck et Jennifer Lee ont co-réalisé ce film d'animation des studios Disney, sorti en 2013 et inspiré du conte d'Andersen."),
            en = LocalizedContent("Who directed \"Frozen\"?", listOf("Chris Buck and Jennifer Lee", "Ron Clements", "John Musker", "Clyde Geronimi"), "Culture", "Chris Buck and Jennifer Lee co-directed this Disney animated film, released in 2013 and inspired by Andersen's fairy tale."),
            zh = LocalizedContent("谁执导了《冰雪奇缘》？", listOf("克里斯·巴克和珍妮弗·李", "罗恩·克莱门茨", "约翰·马斯克", "克莱德·杰洛尼米"), "文化", "克里斯·巴克和珍妮弗·李共同执导了这部迪士尼动画电影，于2013年上映，灵感来自安徒生的童话。"),
            es = LocalizedContent("¿Quién dirigió \"Frozen\"?", listOf("Chris Buck y Jennifer Lee", "Ron Clements", "John Musker", "Clyde Geronimi"), "Cultura", "Chris Buck y Jennifer Lee codirigieron esta película animada de Disney, estrenada en 2013 e inspirada en el cuento de hadas de Andersen.")
        ),
        BilingualQuestion(
            id = 11649, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"La Reine des Neiges\" est-elle sortie?", listOf("2013", "2011", "2015", "2012"), "Culture", "Le film d'animation des studios Disney est sorti en 2013, marquant le début d'une franchise mondiale avec la chanson \"Libérée, délivrée\"."),
            en = LocalizedContent("In what year was \"Frozen\" released?", listOf("2013", "2011", "2015", "2012"), "Culture", "The Disney animated film was released in 2013, marking the beginning of a global franchise with the song \"Let It Go\"."),
            zh = LocalizedContent("《冰雪奇缘》于哪一年上映？", listOf("2013", "2011", "2015", "2012"), "文化", "这部迪士尼动画电影于2013年上映，以歌曲《随它吧》开启了全球系列。"),
            es = LocalizedContent("¿En qué año se estrenó \"Frozen\"?", listOf("2013", "2011", "2015", "2012"), "Cultura", "La película animada de Disney se estrenó en 2013, marcando el inicio de una franquicia global con la canción \"Libre soy\".")
        ),
        BilingualQuestion(
            id = 11650, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Raiponce\" (2010)?", listOf("Nathan Greno et Byron Howard", "Chris Buck", "Jennifer Lee", "Ron Clements"), "Culture", "Nathan Greno et Byron Howard ont co-réalisé ce film d'animation des studios Disney, sorti en 2010 et adapté du conte des frères Grimm."),
            en = LocalizedContent("Who directed \"Tangled\" (2010)?", listOf("Nathan Greno and Byron Howard", "Chris Buck", "Jennifer Lee", "Ron Clements"), "Culture", "Nathan Greno and Byron Howard co-directed this Disney animated film, released in 2010 and adapted from the Brothers Grimm fairy tale."),
            zh = LocalizedContent("谁执导了《魔发奇缘》（2010）？", listOf("内森·格雷诺和拜伦·霍华德", "克里斯·巴克", "詹妮弗·李", "罗恩·克莱门茨"), "文化", "内森·格雷诺和拜伦·霍华德共同执导了这部迪士尼动画电影，于2010年上映，改编自格林兄弟的童话故事。"),
            es = LocalizedContent("¿Quién dirigió \"Enredados\" (2010)?", listOf("Nathan Greno y Byron Howard", "Chris Buck", "Jennifer Lee", "Ron Clements"), "Cultura", "Nathan Greno y Byron Howard codirigieron esta película de animación de Disney, estrenada en 2010 y adaptada del cuento de los hermanos Grimm.")
        ),
        BilingualQuestion(
            id = 11651, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"WALL-E\"?", listOf("Andrew Stanton", "Pete Docter", "John Lasseter", "Brad Bird"), "Culture", "Andrew Stanton a réalisé \"WALL-E\" pour les studios Pixar, sorti en 2008. Il est également connu pour avoir réalisé \"Le Monde de Nemo\"."),
            en = LocalizedContent("Who directed \"WALL-E\"?", listOf("Andrew Stanton", "Pete Docter", "John Lasseter", "Brad Bird"), "Culture", "Andrew Stanton directed \"WALL-E\" for Pixar Studios, released in 2008. He is also known for directing \"Finding Nemo\"."),
            zh = LocalizedContent("谁执导了《机器人总动员》？", listOf("安德鲁·斯坦顿", "彼特·道格特", "约翰·拉塞特", "布拉德·伯德"), "文化", "安德鲁·斯坦顿为皮克斯工作室执导了《机器人总动员》，于2008年上映。他还以执导《海底总动员》而闻名。"),
            es = LocalizedContent("¿Quién dirigió \"WALL-E\"?", listOf("Andrew Stanton", "Pete Docter", "John Lasseter", "Brad Bird"), "Cultura", "Andrew Stanton dirigió \"WALL-E\" para los estudios Pixar, estrenada en 2008. También es conocido por dirigir \"Buscando a Nemo\".")
        ),
        BilingualQuestion(
            id = 11652, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"WALL-E\" est-il sorti?", listOf("2008", "2006", "2010", "2007"), "Culture", "Le film d'animation WALL-E des studios Pixar est sorti en salles en 2008."),
            en = LocalizedContent("In what year was \"WALL-E\" released?", listOf("2008", "2006", "2010", "2007"), "Culture", "The Pixar animated film WALL-E was released in theaters in 2008."),
            zh = LocalizedContent("《机器人总动员》在哪一年上映？", listOf("2008", "2006", "2010", "2007"), "文化", "皮克斯动画电影《机器人总动员》于2008年在影院上映。"),
            es = LocalizedContent("¿En qué año se estrenó \"WALL-E\"?", listOf("2008", "2006", "2010", "2007"), "Cultura", "La película de animación de Pixar WALL-E se estrenó en cines en 2008.")
        ),
        BilingualQuestion(
            id = 11653, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Vice-Versa\"?", listOf("Pete Docter et Ronaldo Del Carmen", "Andrew Stanton", "John Lasseter", "Brad Bird"), "Culture", "Pete Docter, déjà oscarisé pour Là-haut, a coréalisé Vice-Versa avec Ronaldo Del Carmen, qui a notamment travaillé comme storyboarder sur Le Monde de Nemo."),
            en = LocalizedContent("Who directed \"Inside Out\"?", listOf("Pete Docter and Ronaldo Del Carmen", "Andrew Stanton", "John Lasseter", "Brad Bird"), "Culture", "Pete Docter, already Oscar-winning for Up, co-directed Inside Out with Ronaldo Del Carmen, who notably worked as a storyboard artist on Finding Nemo."),
            zh = LocalizedContent("谁执导了《头脑特工队》？", listOf("彼特·道格特和罗纳尔多·德尔·卡门", "安德鲁·斯坦顿", "约翰·拉塞特", "布拉德·伯德"), "文化", "彼特·道格特（凭借《飞屋环游记》获得奥斯卡奖）与罗纳尔多·德尔·卡门共同执导了《头脑特工队》，后者曾担任《海底总动员》的故事板艺术家。"),
            es = LocalizedContent("¿Quién dirigió \"Del revés\"?", listOf("Pete Docter y Ronaldo Del Carmen", "Andrew Stanton", "John Lasseter", "Brad Bird"), "Cultura", "Pete Docter, ya ganador del Oscar por Up, codirigió Del revés con Ronaldo Del Carmen, quien trabajó notablemente como artista de storyboard en Buscando a Nemo.")
        ),
        BilingualQuestion(
            id = 11654, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Rebelle\"?", listOf("Mark Andrews et Brenda Chapman", "Pete Docter", "John Lasseter", "Andrew Stanton"), "Culture", "Rebelle est un film d'animation des studios Pixar sorti en 2012. Brenda Chapman en a eu l'idée et l'a co-réalisée avec Mark Andrews."),
            en = LocalizedContent("Who directed \"Brave\"?", listOf("Mark Andrews and Brenda Chapman", "Pete Docter", "John Lasseter", "Andrew Stanton"), "Culture", "Brave is a Pixar animated film released in 2012. Brenda Chapman conceived the idea and co-directed it with Mark Andrews."),
            zh = LocalizedContent("谁执导了《勇敢传说》？", listOf("马克·安德鲁斯和布伦达·查普曼", "彼特·道格特", "约翰·拉塞特", "安德鲁·斯坦顿"), "文化", "《勇敢传说》是皮克斯于2012年上映的动画电影。布伦达·查普曼构思了该片并与马克·安德鲁斯共同执导。"),
            es = LocalizedContent("¿Quién dirigió \"Brave\"?", listOf("Mark Andrews y Brenda Chapman", "Pete Docter", "John Lasseter", "Andrew Stanton"), "Cultura", "Brave es una película de animación de Pixar estrenada en 2012. Brenda Chapman concibió la idea y la codirigió con Mark Andrews.")
        ),
        BilingualQuestion(
            id = 11655, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Vice-Versa 2\"?", listOf("Kelsey Mann", "Pete Docter", "Andrew Stanton", "John Lasseter"), "Culture", "Kelsey Mann a réalisé Vice-Versa 2, son premier long-métrage pour Pixar, après avoir travaillé comme storyboarder sur des films comme Vice-Versa et Le Monde de Dory."),
            en = LocalizedContent("Who directed \"Inside Out 2\"?", listOf("Kelsey Mann", "Pete Docter", "Andrew Stanton", "John Lasseter"), "Culture", "Kelsey Mann directed Inside Out 2, his first feature film for Pixar, after working as a storyboard artist on films like Inside Out and Finding Dory."),
            zh = LocalizedContent("谁执导了《头脑特工队2》？", listOf("凯尔西·曼", "彼特·道格特", "安德鲁·斯坦顿", "约翰·拉塞特"), "文化", "凯尔西·曼执导了《头脑特工队2》，这是他为皮克斯执导的首部长片，此前他曾担任《头脑特工队》和《海底总动员2》等电影的故事板艺术家。"),
            es = LocalizedContent("¿Quién dirigió \"Del revés 2\"?", listOf("Kelsey Mann", "Pete Docter", "Andrew Stanton", "John Lasseter"), "Cultura", "Kelsey Mann dirigió Del revés 2, su primer largometraje para Pixar, después de trabajar como artista de storyboard en películas como Del revés y Buscando a Dory.")
        ),
        BilingualQuestion(
            id = 11656, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le premier film \"Shrek\"?", listOf("Shrek", "Shrek 2", "Shrek 3", "Shrek Forever After"), "Culture", "Sorti en 2001, Shrek est le premier film de la franchise, réalisé par DreamWorks Animation et adapté du livre illustré de William Steig."),
            en = LocalizedContent("What is the first \"Shrek\" movie?", listOf("Shrek", "Shrek 2", "Shrek 3", "Shrek Forever After"), "Culture", "Released in 2001, Shrek is the first film in the franchise, produced by DreamWorks Animation and adapted from the picture book by William Steig."),
            zh = LocalizedContent("第一部《怪物史莱克》电影是哪一部？", listOf("怪物史莱克", "怪物史莱克2", "怪物史莱克3", "怪物史莱克4"), "文化", "《怪物史莱克》于2001年上映，是该系列的第一部电影，由梦工厂动画制作，改编自威廉·史泰格的绘本。"),
            es = LocalizedContent("¿Cuál es la primera película de \"Shrek\"?", listOf("Shrek", "Shrek 2", "Shrek 3", "Shrek Forever After"), "Cultura", "Estrenada en 2001, Shrek es la primera película de la franquicia, producida por DreamWorks Animation y adaptada del libro ilustrado de William Steig.")
        ),
        BilingualQuestion(
            id = 11657, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé \"Shrek\" (2001)?", listOf("Andrew Adamson et Vicky Jenson", "Chris Miller", "Raman Hui", "Mike Mitchell"), "Culture", "Andrew Adamson et Vicky Jenson ont co-réalisé \"Shrek\" pour DreamWorks Animation, marquant le premier long-métrage d'animation à remporter l'Oscar du meilleur film d'animation."),
            en = LocalizedContent("Who directed \"Shrek\" (2001)?", listOf("Andrew Adamson and Vicky Jenson", "Chris Miller", "Raman Hui", "Mike Mitchell"), "Culture", "Andrew Adamson and Vicky Jenson co-directed \"Shrek\" for DreamWorks Animation, marking the first animated feature to win the Oscar for Best Animated Feature."),
            zh = LocalizedContent("谁执导了《怪物史莱克》（2001）？", listOf("安德鲁·亚当森和维姬·詹森", "克里斯·米勒", "许诚毅", "迈克·米切尔"), "文化", "安德鲁·亚当森和维姬·詹森为梦工厂动画共同执导了《怪物史莱克》，这是第一部获得奥斯卡最佳动画长片奖的动画电影。"),
            es = LocalizedContent("¿Quién dirigió \"Shrek\" (2001)?", listOf("Andrew Adamson y Vicky Jenson", "Chris Miller", "Raman Hui", "Mike Mitchell"), "Cultura", "Andrew Adamson y Vicky Jenson codirigieron \"Shrek\" para DreamWorks Animation, marcando el primer largometraje de animación en ganar el Oscar a la mejor película de animación.")
        ),
        BilingualQuestion(
            id = 11658, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel studio a produit \"Shrek\"?", listOf("DreamWorks Animation", "Pixar", "Disney", "Universal"), "Culture", "DreamWorks Animation a produit Shrek, sorti en 2001, marquant le début de sa franchise phare qui a concurrencé les films Disney."),
            en = LocalizedContent("Which studio produced \"Shrek\"?", listOf("DreamWorks Animation", "Pixar", "Disney", "Universal"), "Culture", "DreamWorks Animation produced Shrek, released in 2001, marking the start of its flagship franchise that competed with Disney films."),
            zh = LocalizedContent("哪个工作室制作了《怪物史莱克》？", listOf("梦工厂动画", "皮克斯", "迪士尼", "环球影业"), "文化", "梦工厂动画制作了《怪物史莱克》，于2001年上映，标志着其旗舰系列的开端，与迪士尼电影竞争。"),
            es = LocalizedContent("¿Qué estudio produjo \"Shrek\"?", listOf("DreamWorks Animation", "Pixar", "Disney", "Universal"), "Cultura", "DreamWorks Animation produjo Shrek, estrenada en 2001, marcando el inicio de su franquicia insignia que compitió con las películas de Disney.")
        ),
        BilingualQuestion(
            id = 11659, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé \"Dragons\"?", listOf("Chris Sanders et Dean DeBlois", "Andrew Adamson", "Vicky Jenson", "Chris Miller"), "Culture", "Chris Sanders et Dean DeBlois ont co-réalisé le film d'animation \"Dragons\" (How to Train Your Dragon) en 2010, adapté des livres de Cressida Cowell."),
            en = LocalizedContent("Who directed \"How to Train Your Dragon\"?", listOf("Chris Sanders and Dean DeBlois", "Andrew Adamson", "Vicky Jenson", "Chris Miller"), "Culture", "Chris Sanders and Dean DeBlois co-directed the animated film \"How to Train Your Dragon\" in 2010, adapted from the books by Cressida Cowell."),
            zh = LocalizedContent("谁执导了《驯龙高手》？", listOf("克里斯·桑德斯和迪恩·德布洛斯", "安德鲁·亚当森", "维姬·詹森", "克里斯·米勒"), "文化", "克里斯·桑德斯和迪恩·德布洛斯于2010年共同执导了动画电影《驯龙高手》，改编自克雷西达·考威尔的书籍。"),
            es = LocalizedContent("¿Quién dirigió \"Cómo entrenar a tu dragón\"?", listOf("Chris Sanders y Dean DeBlois", "Andrew Adamson", "Vicky Jenson", "Chris Miller"), "Cultura", "Chris Sanders y Dean DeBlois codirigieron la película de animación \"Cómo entrenar a tu dragón\" en 2010, adaptada de los libros de Cressida Cowell.")
        ),
        BilingualQuestion(
            id = 11660, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année The Beatles ont-ils été formés?", listOf("1960", "1962", "1963", "1964"), "Culture", "The Beatles se sont formés à Liverpool en 1960, avec la composition classique de John Lennon, Paul McCartney, George Harrison et Ringo Starr."),
            en = LocalizedContent("In what year were The Beatles formed?", listOf("1960", "1962", "1963", "1964"), "Culture", "The Beatles formed in Liverpool in 1960, with the classic lineup of John Lennon, Paul McCartney, George Harrison, and Ringo Starr."),
            zh = LocalizedContent("披头士乐队成立于哪一年？", listOf("1960", "1962", "1963", "1964"), "文化", "披头士乐队于1960年在利物浦成立，经典阵容包括约翰·列侬、保罗·麦卡特尼、乔治·哈里森和林戈·斯塔尔。"),
            es = LocalizedContent("¿En qué año se formaron The Beatles?", listOf("1960", "1962", "1963", "1964"), "Cultura", "The Beatles se formaron en Liverpool en 1960, con la formación clásica de John Lennon, Paul McCartney, George Harrison y Ringo Starr.")
        ),
        BilingualQuestion(
            id = 11661, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de membres The Beatles avaient-ils?", listOf("4", "3", "5", "6"), "Culture", "Le groupe de rock britannique The Beatles, formé à Liverpool en 1960, était composé de John Lennon, Paul McCartney, George Harrison et Ringo Starr."),
            en = LocalizedContent("How many members did The Beatles have?", listOf("4", "3", "5", "6"), "Culture", "The British rock band The Beatles, formed in Liverpool in 1960, consisted of John Lennon, Paul McCartney, George Harrison, and Ringo Starr."),
            zh = LocalizedContent("披头士乐队有多少名成员？", listOf("4", "3", "5", "6"), "文化", "英国摇滚乐队披头士于1960年在利物浦成立，成员包括约翰·列侬、保罗·麦卡特尼、乔治·哈里森和林戈·斯塔尔。"),
            es = LocalizedContent("¿Cuántos miembros tenía The Beatles?", listOf("4", "3", "5", "6"), "Cultura", "La banda de rock británica The Beatles, formada en Liverpool en 1960, estaba compuesta por John Lennon, Paul McCartney, George Harrison y Ringo Starr.")
        ),
        BilingualQuestion(
            id = 11662, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le dernier album studio de The Beatles?", listOf("Let It Be", "Abbey Road", "The White Album", "Revolver"), "Culture", "Let It Be est le douzième et dernier album studio des Beatles, sorti en mai 1970, après la séparation officielle du groupe annoncée en avril de la même année."),
            en = LocalizedContent("What is The Beatles' final studio album?", listOf("Let It Be", "Abbey Road", "The White Album", "Revolver"), "Culture", "Let It Be is the twelfth and final studio album by The Beatles, released in May 1970, after the band's official breakup announced in April of the same year."),
            zh = LocalizedContent("披头士乐队的最后一张录音室专辑是哪张？", listOf("Let It Be", "Abbey Road", "The White Album", "Revolver"), "文化", "《Let It Be》是披头士乐队的第十二张也是最后一张录音室专辑，于1970年5月发行，同年4月乐队正式宣布解散。"),
            es = LocalizedContent("¿Cuál es el último álbum de estudio de The Beatles?", listOf("Let It Be", "Abbey Road", "The White Album", "Revolver"), "Cultura", "Let It Be es el duodécimo y último álbum de estudio de The Beatles, lanzado en mayo de 1970, después de la separación oficial del grupo anunciada en abril del mismo año.")
        ),
        BilingualQuestion(
            id = 11663, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Thriller\" de Michael Jackson a-t-il été publié?", listOf("1982", "1980", "1984", "1983"), "Culture", "L'album \"Thriller\" de Michael Jackson est sorti le 30 novembre 1982. Il est devenu l'album le plus vendu de tous les temps."),
            en = LocalizedContent("In what year was Michael Jackson's \"Thriller\" released?", listOf("1982", "1980", "1984", "1983"), "Culture", "Michael Jackson's album \"Thriller\" was released on November 30, 1982. It became the best-selling album of all time."),
            zh = LocalizedContent("迈克尔·杰克逊的《Thriller》是哪一年发行的？", listOf("1982", "1980", "1984", "1983"), "文化", "迈克尔·杰克逊的专辑《Thriller》于1982年11月30日发行，成为有史以来最畅销的专辑。"),
            es = LocalizedContent("¿En qué año se publicó \"Thriller\" de Michael Jackson?", listOf("1982", "1980", "1984", "1983"), "Cultura", "El álbum \"Thriller\" de Michael Jackson se lanzó el 30 de noviembre de 1982. Se convirtió en el álbum más vendido de todos los tiempos.")
        ),
        BilingualQuestion(
            id = 11664, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de copies \"Thriller\" a-t-il vendues?", listOf("70 millions", "50 millions", "100 millions", "30 millions"), "Culture", "L'album Thriller de Michael Jackson, sorti en 1982, est l'album le plus vendu de tous les temps avec environ 70 millions d'exemplaires écoulés dans le monde."),
            en = LocalizedContent("How many copies did \"Thriller\" sell?", listOf("70 million", "50 million", "100 million", "30 million"), "Culture", "Michael Jackson's album Thriller, released in 1982, is the best-selling album of all time with approximately 70 million copies sold worldwide."),
            zh = LocalizedContent("《Thriller》卖出了多少张？", listOf("7000万", "5000万", "1亿", "3000万"), "文化", "迈克尔·杰克逊的专辑《Thriller》于1982年发行，是有史以来最畅销的专辑，全球销量约7000万张。"),
            es = LocalizedContent("¿Cuántas copias vendió \"Thriller\"?", listOf("70 millones", "50 millones", "100 millones", "30 millones"), "Cultura", "El álbum Thriller de Michael Jackson, lanzado en 1982, es el álbum más vendido de todos los tiempos con aproximadamente 70 millones de copias vendidas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 11665, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vrai nom de Madonna?", listOf("Madonna Louise Ciccone", "Louise Madonna", "Ciccone Madonna", "Madonna Louise"), "Culture", "Madonna Louise Ciccone est le nom complet de la chanteuse américaine, née en 1958 à Bay City, Michigan. Elle a choisi de se faire connaître sous son prénom seul, Madonna, pour sa carrière musicale."),
            en = LocalizedContent("What is Madonna's real name?", listOf("Madonna Louise Ciccone", "Louise Madonna", "Ciccone Madonna", "Madonna Louise"), "Culture", "Madonna Louise Ciccone is the full name of the American singer, born in 1958 in Bay City, Michigan. She chose to be known by her first name alone, Madonna, for her music career."),
            zh = LocalizedContent("麦当娜的真名是什么？", listOf("Madonna Louise Ciccone", "Louise Madonna", "Ciccone Madonna", "Madonna Louise"), "文化", "麦当娜·路易丝·西科内是美国歌手的全名，1958年出生于密歇根州贝城。她选择以名字麦当娜作为艺名进行音乐事业。"),
            es = LocalizedContent("¿Cuál es el nombre real de Madonna?", listOf("Madonna Louise Ciccone", "Louise Madonna", "Ciccone Madonna", "Madonna Louise"), "Cultura", "Madonna Louise Ciccone es el nombre completo de la cantante estadounidense, nacida en 1958 en Bay City, Míchigan. Eligió darse a conocer solo por su nombre de pila, Madonna, para su carrera musical.")
        ),
        BilingualQuestion(
            id = 11666, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Prince est-il né?", listOf("1958", "1960", "1956", "1962"), "Culture", "Prince, de son vrai nom Prince Rogers Nelson, est né le 7 juin 1958 à Minneapolis, dans le Minnesota."),
            en = LocalizedContent("In what year was Prince born?", listOf("1958", "1960", "1956", "1962"), "Culture", "Prince, born Prince Rogers Nelson, was born on June 7, 1958, in Minneapolis, Minnesota."),
            zh = LocalizedContent("王子出生于哪一年？", listOf("1958", "1960", "1956", "1962"), "文化", "王子，本名普林斯·罗杰斯·尼尔森，于1958年6月7日出生于明尼苏达州明尼阿波利斯。"),
            es = LocalizedContent("¿En qué año nació Prince?", listOf("1958", "1960", "1956", "1962"), "Cultura", "Prince, cuyo nombre real es Prince Rogers Nelson, nació el 7 de junio de 1958 en Minneapolis, Minnesota.")
        ),
        BilingualQuestion(
            id = 11667, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grammy Awards Beyoncé a-t-elle remportés?", listOf("32", "28", "25", "35"), "Culture", "Beyoncé détient le record du plus grand nombre de Grammy Awards remportés par un artiste, avec 32 trophées, dépassant ainsi le précédent record détenu par le chef d'orchestre Georg Solti."),
            en = LocalizedContent("How many Grammy Awards has Beyoncé won?", listOf("32", "28", "25", "35"), "Culture", "Beyoncé holds the record for the most Grammy Awards won by an artist, with 32 trophies, surpassing the previous record held by conductor Georg Solti."),
            zh = LocalizedContent("碧昂丝赢得了多少项格莱美奖？", listOf("32", "28", "25", "35"), "文化", "碧昂丝保持着艺术家获得格莱美奖最多的纪录，共32座奖杯，超过了之前由指挥家乔治·索尔蒂保持的纪录。"),
            es = LocalizedContent("¿Cuántos premios Grammy ha ganado Beyoncé?", listOf("32", "28", "25", "35"), "Cultura", "Beyoncé tiene el récord de la mayor cantidad de premios Grammy ganados por un artista, con 32 trofeos, superando el récord anterior del director de orquesta Georg Solti.")
        ),
        BilingualQuestion(
            id = 11668, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom réel de 50 Cent?", listOf("Curtis Jackson", "Curtis James", "Curtis White", "Curtis Brown"), "Culture", "Curtis Jackson a adopté le nom de scène 50 Cent en référence à un célèbre braqueur de Brooklyn des années 1980."),
            en = LocalizedContent("What is 50 Cent's real name?", listOf("Curtis Jackson", "Curtis James", "Curtis White", "Curtis Brown"), "Culture", "Curtis Jackson adopted the stage name 50 Cent in reference to a famous Brooklyn robber from the 1980s."),
            zh = LocalizedContent("50 Cent的真名是什么？", listOf("Curtis Jackson", "Curtis James", "Curtis White", "Curtis Brown"), "文化", "柯蒂斯·杰克逊采用了艺名50 Cent，以纪念1980年代布鲁克林的一位著名劫匪。"),
            es = LocalizedContent("¿Cuál es el nombre real de 50 Cent?", listOf("Curtis Jackson", "Curtis James", "Curtis White", "Curtis Brown"), "Cultura", "Curtis Jackson adoptó el nombre artístico 50 Cent en referencia a un famoso atracador de Brooklyn de los años 80.")
        ),
        BilingualQuestion(
            id = 11669, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Eminem a-t-il publié \"The Marshall Mathers LP\"?", listOf("2000", "1999", "2001", "2002"), "Culture", "The Marshall Mathers LP, troisième album studio d'Eminem, est sorti en mai 2000, devenant l'un des albums les plus vendus de l'année aux États-Unis."),
            en = LocalizedContent("In what year did Eminem release \"The Marshall Mathers LP\"?", listOf("2000", "1999", "2001", "2002"), "Culture", "The Marshall Mathers LP, Eminem's third studio album, was released in May 2000, becoming one of the best-selling albums of the year in the United States."),
            zh = LocalizedContent("埃米纳姆的《The Marshall Mathers LP》是哪一年发行的？", listOf("2000", "1999", "2001", "2002"), "文化", "《The Marshall Mathers LP》是埃米纳姆的第三张录音室专辑，于2000年5月发行，成为当年美国最畅销的专辑之一。"),
            es = LocalizedContent("¿En qué año publicó Eminem \"The Marshall Mathers LP\"?", listOf("2000", "1999", "2001", "2002"), "Cultura", "The Marshall Mathers LP, el tercer álbum de estudio de Eminem, se lanzó en mayo de 2000, convirtiéndose en uno de los álbumes más vendidos del año en Estados Unidos.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11670, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vrai nom de Lady Gaga?", listOf("Stefani Germanotta", "Stefani Gaga", "Lady Stefani", "Germanotta Lady"), "Culture", "Stefani Joanne Angelina Germanotta est le nom de naissance de la chanteuse américaine connue sous le pseudonyme Lady Gaga."),
            en = LocalizedContent("What is Lady Gaga's real name?", listOf("Stefani Germanotta", "Stefani Gaga", "Lady Stefani", "Germanotta Lady"), "Culture", "Stefani Joanne Angelina Germanotta is the birth name of the American singer known by the stage name Lady Gaga."),
            zh = LocalizedContent("Lady Gaga的真名是什么？", listOf("Stefani Germanotta", "Stefani Gaga", "Lady Stefani", "Germanotta Lady"), "文化", "Stefani Joanne Angelina Germanotta 是美国歌手 Lady Gaga 的本名。"),
            es = LocalizedContent("¿Cuál es el verdadero nombre de Lady Gaga?", listOf("Stefani Germanotta", "Stefani Gaga", "Lady Stefani", "Germanotta Lady"), "Cultura", "Stefani Joanne Angelina Germanotta es el nombre de nacimiento de la cantante estadounidense conocida bajo el seudónimo Lady Gaga.")
        ),
        BilingualQuestion(
            id = 11671, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année David Bowie est-il né?", listOf("1947", "1949", "1945", "1950"), "Culture", "David Bowie, de son vrai nom David Robert Jones, est né le 8 janvier 1947 à Londres."),
            en = LocalizedContent("In what year was David Bowie born?", listOf("1947", "1949", "1945", "1950"), "Culture", "David Bowie, born David Robert Jones, was born on January 8, 1947 in London."),
            zh = LocalizedContent("大卫·鲍伊出生于哪一年？", listOf("1947", "1949", "1945", "1950"), "文化", "大卫·鲍伊，本名大卫·罗伯特·琼斯，于1947年1月8日出生于伦敦。"),
            es = LocalizedContent("¿En qué año nació David Bowie?", listOf("1947", "1949", "1945", "1950"), "Cultura", "David Bowie, cuyo nombre real es David Robert Jones, nació el 8 de enero de 1947 en Londres.")
        ),
        BilingualQuestion(
            id = 11672, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vrai nom d'Elton John?", listOf("Reginald Kenneth Dwight", "Reginald Dwight", "Kenneth Dwight", "Elton Dwight"), "Culture", "Elton John est né Reginald Kenneth Dwight en 1947, avant d'adopter son nom de scène en hommage à Elton Dean et John Baldry."),
            en = LocalizedContent("What is Elton John's real name?", listOf("Reginald Kenneth Dwight", "Reginald Dwight", "Kenneth Dwight", "Elton Dwight"), "Culture", "Elton John was born Reginald Kenneth Dwight in 1947, before adopting his stage name in homage to Elton Dean and John Baldry."),
            zh = LocalizedContent("埃尔顿·约翰的真名是什么？", listOf("Reginald Kenneth Dwight", "Reginald Dwight", "Kenneth Dwight", "Elton Dwight"), "文化", "埃尔顿·约翰出生于1947年，本名Reginald Kenneth Dwight，后取艺名致敬Elton Dean和John Baldry。"),
            es = LocalizedContent("¿Cuál es el verdadero nombre de Elton John?", listOf("Reginald Kenneth Dwight", "Reginald Dwight", "Kenneth Dwight", "Elton Dwight"), "Cultura", "Elton John nació como Reginald Kenneth Dwight en 1947, antes de adoptar su nombre artístico en homenaje a Elton Dean y John Baldry.")
        ),
        BilingualQuestion(
            id = 11673, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Queen a-t-elle été formée?", listOf("1970", "1972", "1968", "1973"), "Culture", "Le groupe Queen s'est formé en 1970 à Londres, lorsque le guitariste Brian May et le batteur Roger Taylor ont rejoint le chanteur Freddie Mercury et le bassiste John Deacon."),
            en = LocalizedContent("In what year was Queen formed?", listOf("1970", "1972", "1968", "1973"), "Culture", "The band Queen was formed in 1970 in London, when guitarist Brian May and drummer Roger Taylor joined singer Freddie Mercury and bassist John Deacon."),
            zh = LocalizedContent("皇后乐队成立于哪一年？", listOf("1970", "1972", "1968", "1973"), "文化", "皇后乐队于1970年在伦敦成立，当时吉他手Brian May和鼓手Roger Taylor加入了主唱Freddie Mercury和贝斯手John Deacon。"),
            es = LocalizedContent("¿En qué año se formó Queen?", listOf("1970", "1972", "1968", "1973"), "Cultura", "La banda Queen se formó en 1970 en Londres, cuando el guitarrista Brian May y el baterista Roger Taylor se unieron al cantante Freddie Mercury y al bajista John Deacon.")
        ),
        BilingualQuestion(
            id = 11674, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le chanteur de Queen?", listOf("Freddie Mercury", "Brian May", "Roger Taylor", "John Deacon"), "Culture", "Freddie Mercury, né Farrokh Bulsara, a été le charismatique chanteur principal et pianiste du groupe de rock britannique Queen de 1970 jusqu'à sa mort en 1991."),
            en = LocalizedContent("Who is the lead singer of Queen?", listOf("Freddie Mercury", "Brian May", "Roger Taylor", "John Deacon"), "Culture", "Freddie Mercury, born Farrokh Bulsara, was the charismatic lead singer and pianist of the British rock band Queen from 1970 until his death in 1991."),
            zh = LocalizedContent("皇后乐队的主唱是谁？", listOf("Freddie Mercury", "Brian May", "Roger Taylor", "John Deacon"), "文化", "Freddie Mercury，本名Farrokh Bulsara，从1970年至1991年去世，一直是英国摇滚乐队皇后乐队的魅力主唱和钢琴手。"),
            es = LocalizedContent("¿Quién es el cantante principal de Queen?", listOf("Freddie Mercury", "Brian May", "Roger Taylor", "John Deacon"), "Cultura", "Freddie Mercury, nacido Farrokh Bulsara, fue el carismático cantante principal y pianista de la banda de rock británica Queen desde 1970 hasta su muerte en 1991.")
        ),
        BilingualQuestion(
            id = 11675, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Pink Floyd a-t-elle publié \"The Wall\"?", listOf("1979", "1977", "1981", "1978"), "Culture", "The Wall est le onzième album studio de Pink Floyd, sorti le 30 novembre 1979. Cet album-concept emblématique a été produit par le groupe et Bob Ezrin."),
            en = LocalizedContent("In what year did Pink Floyd release \"The Wall\"?", listOf("1979", "1977", "1981", "1978"), "Culture", "The Wall is Pink Floyd's eleventh studio album, released on November 30, 1979. This iconic concept album was produced by the band and Bob Ezrin."),
            zh = LocalizedContent("平克·弗洛伊德在哪一年发行了《The Wall》？", listOf("1979", "1977", "1981", "1978"), "文化", "《The Wall》是平克·弗洛伊德的第十一张录音室专辑，于1979年11月30日发行。这张标志性的概念专辑由乐队和Bob Ezrin制作。"),
            es = LocalizedContent("¿En qué año lanzó Pink Floyd \"The Wall\"?", listOf("1979", "1977", "1981", "1978"), "Cultura", "The Wall es el undécimo álbum de estudio de Pink Floyd, lanzado el 30 de noviembre de 1979. Este emblemático álbum conceptual fue producido por la banda y Bob Ezrin.")
        ),
        BilingualQuestion(
            id = 11676, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album est le plus vendu de tous les temps?", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "Culture", "L'album Thriller de Michael Jackson, sorti en 1982, détient le record de l'album le plus vendu de tous les temps avec environ 70 millions d'exemplaires écoulés dans le monde."),
            en = LocalizedContent("Which album is the best-selling of all time?", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "Culture", "Michael Jackson's album Thriller, released in 1982, holds the record for the best-selling album of all time with approximately 70 million copies sold worldwide."),
            zh = LocalizedContent("哪张专辑是有史以来最畅销的？", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "文化", "迈克尔·杰克逊的专辑《Thriller》于1982年发行，以全球约7000万张的销量保持着有史以来最畅销专辑的纪录。"),
            es = LocalizedContent("¿Cuál es el álbum más vendido de todos los tiempos?", listOf("Thriller", "Back in Black", "The Dark Side of the Moon", "Abbey Road"), "Cultura", "El álbum Thriller de Michael Jackson, lanzado en 1982, ostenta el récord del álbum más vendido de todos los tiempos con aproximadamente 70 millones de copias vendidas en todo el mundo.")
        ),
        BilingualQuestion(
            id = 11677, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Nirvana a-t-elle publié \"Nevermind\"?", listOf("1991", "1989", "1993", "1992"), "Culture", "L'album \"Nevermind\" de Nirvana est sorti le 24 septembre 1991, propulsant le groupe et le mouvement grunge sur le devant de la scène mondiale."),
            en = LocalizedContent("In what year did Nirvana release \"Nevermind\"?", listOf("1991", "1989", "1993", "1992"), "Culture", "Nirvana's album \"Nevermind\" was released on September 24, 1991, propelling the band and the grunge movement onto the global stage."),
            zh = LocalizedContent("涅槃乐队在哪一年发行了《Nevermind》？", listOf("1991", "1989", "1993", "1992"), "文化", "涅槃乐队的专辑《Nevermind》于1991年9月24日发行，将乐队和垃圾摇滚运动推向了全球舞台。"),
            es = LocalizedContent("¿En qué año lanzó Nirvana \"Nevermind\"?", listOf("1991", "1989", "1993", "1992"), "Cultura", "El álbum \"Nevermind\" de Nirvana fue lanzado el 24 de septiembre de 1991, impulsando a la banda y al movimiento grunge al escenario mundial.")
        ),
        BilingualQuestion(
            id = 11678, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grammys Michael Jackson a-t-il remportés?", listOf("13", "15", "10", "12"), "Culture", "Michael Jackson a remporté 10 Grammy Awards sur l'ensemble de sa carrière, dont un Grammy Legend Award et un Grammy Lifetime Achievement Award."),
            en = LocalizedContent("How many Grammys did Michael Jackson win?", listOf("13", "15", "10", "12"), "Culture", "Michael Jackson won 10 Grammy Awards throughout his career, including a Grammy Legend Award and a Grammy Lifetime Achievement Award."),
            zh = LocalizedContent("迈克尔·杰克逊获得了多少项格莱美奖？", listOf("13", "15", "10", "12"), "文化", "迈克尔·杰克逊在其职业生涯中共获得10项格莱美奖，包括一项格莱美传奇奖和一项格莱美终身成就奖。"),
            es = LocalizedContent("¿Cuántos Grammy ganó Michael Jackson?", listOf("13", "15", "10", "12"), "Cultura", "Michael Jackson ganó 10 premios Grammy a lo largo de su carrera, incluido un Grammy Legend Award y un Grammy Lifetime Achievement Award.")
        ),
        BilingualQuestion(
            id = 11679, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le groupe de rock britannique avec Mick Jagger?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "The Who"), "Culture", "Mick Jagger est le chanteur et cofondateur des Rolling Stones, formés à Londres en 1962."),
            en = LocalizedContent("Which British rock band features Mick Jagger?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "The Who"), "Culture", "Mick Jagger is the lead singer and co-founder of The Rolling Stones, formed in London in 1962."),
            zh = LocalizedContent("米克·贾格尔是哪个英国摇滚乐队的成员？", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "The Who"), "文化", "米克·贾格尔是滚石乐队的主唱和联合创始人，该乐队于1962年在伦敦成立。"),
            es = LocalizedContent("¿Qué banda de rock británica cuenta con Mick Jagger?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "The Who"), "Cultura", "Mick Jagger es el cantante principal y cofundador de The Rolling Stones, formados en Londres en 1962.")
        ),
        BilingualQuestion(
            id = 11680, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"Abbey Road\" de The Beatles a-t-il été publié?", listOf("1969", "1967", "1971", "1970"), "Culture", "Abbey Road, le onzième album studio des Beatles, est sorti le 26 septembre 1969 au Royaume-Uni."),
            en = LocalizedContent("In which year was \"Abbey Road\" by The Beatles released?", listOf("1969", "1967", "1971", "1970"), "Culture", "Abbey Road, the eleventh studio album by the Beatles, was released on September 26, 1969 in the United Kingdom."),
            zh = LocalizedContent("披头士乐队的《Abbey Road》是哪一年发行的？", listOf("1969", "1967", "1971", "1970"), "文化", "《Abbey Road》是披头士的第十一张录音室专辑，于1969年9月26日在英国发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Abbey Road\" de The Beatles?", listOf("1969", "1967", "1971", "1970"), "Cultura", "Abbey Road, el undécimo álbum de estudio de los Beatles, fue lanzado el 26 de septiembre de 1969 en el Reino Unido.")
        ),
        BilingualQuestion(
            id = 11681, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album est considéré comme le meilleur de The Beatles?", listOf("Sgt. Pepper's Lonely Hearts Club Band", "Abbey Road", "The White Album", "Revolver"), "Culture", "Sorti en 1967, Sgt. Pepper's Lonely Hearts Club Band est souvent cité comme le chef-d'œuvre des Beatles pour son innovation musicale et son influence culturelle majeure."),
            en = LocalizedContent("Which album is considered the best by The Beatles?", listOf("Sgt. Pepper's Lonely Hearts Club Band", "Abbey Road", "The White Album", "Revolver"), "Culture", "Released in 1967, Sgt. Pepper's Lonely Hearts Club Band is often cited as the Beatles' masterpiece for its musical innovation and major cultural influence."),
            zh = LocalizedContent("哪张专辑被认为是披头士乐队的最佳专辑？", listOf("Sgt. Pepper's Lonely Hearts Club Band", "Abbey Road", "The White Album", "Revolver"), "文化", "1967年发行的《Sgt. Pepper's Lonely Hearts Club Band》常被认为是披头士的杰作，因其音乐创新和重大的文化影响。"),
            es = LocalizedContent("¿Qué álbum es considerado el mejor de The Beatles?", listOf("Sgt. Pepper's Lonely Hearts Club Band", "Abbey Road", "The White Album", "Revolver"), "Cultura", "Lanzado en 1967, Sgt. Pepper's Lonely Hearts Club Band es a menudo citado como la obra maestra de los Beatles por su innovación musical y gran influencia cultural.")
        ),
        BilingualQuestion(
            id = 11682, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"The Dark Side of the Moon\" a-t-il été publié?", listOf("1973", "1971", "1975", "1972"), "Culture", "L'album \"The Dark Side of the Moon\" du groupe Pink Floyd est sorti le 1er mars 1973. Il est devenu l'un des albums les plus vendus et les plus influents de l'histoire du rock."),
            en = LocalizedContent("In which year was \"The Dark Side of the Moon\" released?", listOf("1973", "1971", "1975", "1972"), "Culture", "The album \"The Dark Side of the Moon\" by Pink Floyd was released on March 1, 1973. It became one of the best-selling and most influential albums in rock history."),
            zh = LocalizedContent("《The Dark Side of the Moon》是哪一年发行的？", listOf("1973", "1971", "1975", "1972"), "文化", "平克·弗洛伊德的专辑《The Dark Side of the Moon》于1973年3月1日发行，成为摇滚史上最畅销和最具影响力的专辑之一。"),
            es = LocalizedContent("¿En qué año se publicó \"The Dark Side of the Moon\"?", listOf("1973", "1971", "1975", "1972"), "Cultura", "El álbum \"The Dark Side of the Moon\" de Pink Floyd fue lanzado el 1 de marzo de 1973. Se convirtió en uno de los álbumes más vendidos e influyentes de la historia del rock.")
        ),
        BilingualQuestion(
            id = 11683, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album est le chef-d'œuvre de Led Zeppelin?", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "In Through the Out Door"), "Culture", "Led Zeppelin IV, sorti en 1971, est considéré comme leur chef-d'œuvre car il contient des titres emblématiques comme Stairway to Heaven et a connu un immense succès critique et commercial."),
            en = LocalizedContent("Which album is Led Zeppelin's masterpiece?", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "In Through the Out Door"), "Culture", "Led Zeppelin IV, released in 1971, is considered their masterpiece because it contains iconic tracks like Stairway to Heaven and achieved immense critical and commercial success."),
            zh = LocalizedContent("哪张专辑是齐柏林飞艇的杰作？", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "In Through the Out Door"), "文化", "1971年发行的《Led Zeppelin IV》被认为是他们的杰作，因为它包含了《Stairway to Heaven》等标志性曲目，并取得了巨大的评论和商业成功。"),
            es = LocalizedContent("¿Qué álbum es la obra maestra de Led Zeppelin?", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "In Through the Out Door"), "Cultura", "Led Zeppelin IV, lanzado en 1971, es considerado su obra maestra porque contiene temas icónicos como Stairway to Heaven y logró un inmenso éxito crítico y comercial.")
        ),
        BilingualQuestion(
            id = 11684, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Rumours\" de Fleetwood Mac a-t-il été publié?", listOf("1977", "1975", "1979", "1976"), "Culture", "Sorti en février 1977, l'album a été enregistré pendant une période de tensions personnelles intenses entre les membres du groupe."),
            en = LocalizedContent("In which year was \"Rumours\" by Fleetwood Mac released?", listOf("1977", "1975", "1979", "1976"), "Culture", "Released in February 1977, the album was recorded during a period of intense personal tensions among the band members."),
            zh = LocalizedContent("弗利特伍德·麦克的《Rumours》是哪一年发行的？", listOf("1977", "1975", "1979", "1976"), "文化", "这张专辑于1977年2月发行，录制期间乐队成员之间关系紧张。"),
            es = LocalizedContent("¿En qué año se publicó \"Rumours\" de Fleetwood Mac?", listOf("1977", "1975", "1979", "1976"), "Cultura", "Lanzado en febrero de 1977, el álbum fue grabado durante un período de intensas tensiones personales entre los miembros de la banda.")
        ),
        BilingualQuestion(
            id = 11685, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Nirvana est le plus célèbre?", listOf("Nevermind", "In Utero", "MTV Unplugged", "Bleach"), "Culture", "Nevermind, sorti en 1991, a propulsé Nirvana et le mouvement grunge au sommet grâce à son single \"Smells Like Teen Spirit\"."),
            en = LocalizedContent("Which album by Nirvana is the most famous?", listOf("Nevermind", "In Utero", "MTV Unplugged", "Bleach"), "Culture", "Nevermind, released in 1991, propelled Nirvana and the grunge movement to the top thanks to its single \"Smells Like Teen Spirit\"."),
            zh = LocalizedContent("涅槃乐队的哪张专辑最著名？", listOf("Nevermind", "In Utero", "MTV Unplugged", "Bleach"), "文化", "1991年发行的《Nevermind》凭借单曲《Smells Like Teen Spirit》将涅槃和垃圾摇滚运动推向了顶峰。"),
            es = LocalizedContent("¿Qué álbum de Nirvana es el más famoso?", listOf("Nevermind", "In Utero", "MTV Unplugged", "Bleach"), "Cultura", "Nevermind, lanzado en 1991, impulsó a Nirvana y al movimiento grunge a la cima gracias a su sencillo \"Smells Like Teen Spirit\".")
        ),
        BilingualQuestion(
            id = 11686, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Born to Run\" de Bruce Springsteen a-t-il été publié?", listOf("1975", "1973", "1977", "1974"), "Culture", "Born to Run, le troisième album studio de Bruce Springsteen, est sorti le 25 août 1975. Il a marqué un tournant dans sa carrière et l'a propulsé sur le devant de la scène rock."),
            en = LocalizedContent("In which year was \"Born to Run\" by Bruce Springsteen released?", listOf("1975", "1973", "1977", "1974"), "Culture", "Born to Run, Bruce Springsteen's third studio album, was released on August 25, 1975. It marked a turning point in his career and propelled him to the forefront of rock."),
            zh = LocalizedContent("布鲁斯·斯普林斯汀的《Born to Run》是哪一年发行的？", listOf("1975", "1973", "1977", "1974"), "文化", "《Born to Run》是布鲁斯·斯普林斯汀的第三张录音室专辑，于1975年8月25日发行，标志着他职业生涯的转折点，将他推向了摇滚的前沿。"),
            es = LocalizedContent("¿En qué año se publicó \"Born to Run\" de Bruce Springsteen?", listOf("1975", "1973", "1977", "1974"), "Cultura", "Born to Run, el tercer álbum de estudio de Bruce Springsteen, fue lanzado el 25 de agosto de 1975. Marcó un punto de inflexión en su carrera y lo impulsó a la vanguardia del rock.")
        ),
        BilingualQuestion(
            id = 11687, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'album le plus célèbre de Bob Dylan?", listOf("Highway 61 Revisited", "Blonde on Blonde", "The Freewheelin' Bob Dylan", "Another Side of Bob Dylan"), "Culture", "Sorti en 1965, Highway 61 Revisited est considéré comme un chef-d'œuvre, marquant le tournant électrique de Dylan avec des titres comme Like a Rolling Stone."),
            en = LocalizedContent("Which is Bob Dylan's most famous album?", listOf("Highway 61 Revisited", "Blonde on Blonde", "The Freewheelin' Bob Dylan", "Another Side of Bob Dylan"), "Culture", "Released in 1965, Highway 61 Revisited is considered a masterpiece, marking Dylan's electric turn with tracks like Like a Rolling Stone."),
            zh = LocalizedContent("鲍勃·迪伦最著名的专辑是哪张？", listOf("Highway 61 Revisited", "Blonde on Blonde", "The Freewheelin' Bob Dylan", "Another Side of Bob Dylan"), "文化", "1965年发行的《Highway 61 Revisited》被认为是一部杰作，标志着迪伦转向电子音乐，其中包含《Like a Rolling Stone》等歌曲。"),
            es = LocalizedContent("¿Cuál es el álbum más famoso de Bob Dylan?", listOf("Highway 61 Revisited", "Blonde on Blonde", "The Freewheelin' Bob Dylan", "Another Side of Bob Dylan"), "Cultura", "Lanzado en 1965, Highway 61 Revisited es considerado una obra maestra, marcando el giro eléctrico de Dylan con temas como Like a Rolling Stone.")
        ),
        BilingualQuestion(
            id = 11688, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Ziggy Stardust\" de David Bowie a-t-il été publié?", listOf("1972", "1970", "1974", "1971"), "Culture", "L'album The Rise and Fall of Ziggy Stardust and the Spiders from Mars est sorti en 1972, marquant l'apogée du personnage androgyne et extraterrestre de Bowie."),
            en = LocalizedContent("In which year was \"Ziggy Stardust\" by David Bowie released?", listOf("1972", "1970", "1974", "1971"), "Culture", "The album The Rise and Fall of Ziggy Stardust and the Spiders from Mars was released in 1972, marking the peak of Bowie's androgynous alien persona."),
            zh = LocalizedContent("大卫·鲍伊的《Ziggy Stardust》是哪一年发行的？", listOf("1972", "1970", "1974", "1971"), "文化", "专辑《The Rise and Fall of Ziggy Stardust and the Spiders from Mars》于1972年发行，标志着鲍伊雌雄同体的外星人形象的巅峰。"),
            es = LocalizedContent("¿En qué año se publicó \"Ziggy Stardust\" de David Bowie?", listOf("1972", "1970", "1974", "1971"), "Cultura", "El álbum The Rise and Fall of Ziggy Stardust and the Spiders from Mars fue lanzado en 1972, marcando el apogeo del personaje andrógino y extraterrestre de Bowie.")
        ),
        BilingualQuestion(
            id = 11689, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de The Who est un rock opéra?", listOf("Tommy", "Who's Next", "Quadrophenia", "The Who Sell Out"), "Culture", "Tommy, sorti en 1969, est un double album qui raconte l’histoire d’un garçon sourd, muet et aveugle, et est considéré comme le premier rock opéra du groupe."),
            en = LocalizedContent("Which album by The Who is a rock opera?", listOf("Tommy", "Who's Next", "Quadrophenia", "The Who Sell Out"), "Culture", "Tommy, released in 1969, is a double album that tells the story of a deaf, dumb, and blind boy, and is considered the group's first rock opera."),
            zh = LocalizedContent("谁人乐队的哪张专辑是摇滚歌剧？", listOf("Tommy", "Who's Next", "Quadrophenia", "The Who Sell Out"), "文化", "1969年发行的《Tommy》是一张双专辑，讲述了一个聋哑盲男孩的故事，被认为是该乐队的第一部摇滚歌剧。"),
            es = LocalizedContent("¿Qué álbum de The Who es una ópera rock?", listOf("Tommy", "Who's Next", "Quadrophenia", "The Who Sell Out"), "Cultura", "Tommy, lanzado en 1969, es un álbum doble que cuenta la historia de un niño sordo, mudo y ciego, y es considerada la primera ópera rock del grupo.")
        ),
        BilingualQuestion(
            id = 11690, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"OK Computer\" de Radiohead a-t-il été publié?", listOf("1997", "1995", "1999", "1996"), "Culture", "Sorti le 21 mai 1997, \"OK Computer\" a marqué un tournant dans le rock alternatif avec son exploration des angoisses modernes."),
            en = LocalizedContent("In what year was Radiohead's \"OK Computer\" released?", listOf("1997", "1995", "1999", "1996"), "Culture", "Released on May 21, 1997, \"OK Computer\" marked a turning point in alternative rock with its exploration of modern anxieties."),
            zh = LocalizedContent("Radiohead的《OK Computer》是哪一年发行的？", listOf("1997", "1995", "1999", "1996"), "文化", "《OK Computer》于1997年5月21日发行，以其对现代焦虑的探索标志着另类摇滚的转折点。"),
            es = LocalizedContent("¿En qué año se publicó \"OK Computer\" de Radiohead?", listOf("1997", "1995", "1999", "1996"), "Cultura", "Lanzado el 21 de mayo de 1997, \"OK Computer\" marcó un punto de inflexión en el rock alternativo con su exploración de las ansiedades modernas.")
        ),
        BilingualQuestion(
            id = 11691, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'album chef-d'œuvre de Radiohead?", listOf("Kid A", "OK Computer", "In Rainbows", "The Bends"), "Culture", "Sorti en 2000, Kid A marque un virage expérimental radical pour Radiohead, mêlant électronique, jazz et rock, et est souvent cité comme leur œuvre la plus influente."),
            en = LocalizedContent("What is Radiohead's masterpiece album?", listOf("Kid A", "OK Computer", "In Rainbows", "The Bends"), "Culture", "Released in 2000, Kid A marks a radical experimental turn for Radiohead, blending electronic, jazz, and rock, and is often cited as their most influential work."),
            zh = LocalizedContent("Radiohead的哪张专辑是杰作？", listOf("Kid A", "OK Computer", "In Rainbows", "The Bends"), "文化", "2000年发行的《Kid A》标志着Radiohead激进的实验性转变，融合了电子、爵士和摇滚，常被认为是他们最具影响力的作品。"),
            es = LocalizedContent("¿Cuál es el álbum obra maestra de Radiohead?", listOf("Kid A", "OK Computer", "In Rainbows", "The Bends"), "Cultura", "Lanzado en 2000, Kid A marca un giro experimental radical para Radiohead, combinando electrónica, jazz y rock, y a menudo se cita como su obra más influyente.")
        ),
        BilingualQuestion(
            id = 11692, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Black\" de Pearl Jam a-t-il été publié?", listOf("1991", "1989", "1993", "1992"), "Culture", "Black est une chanson issue du premier album de Pearl Jam, Ten, sorti en 1991, année marquante pour le grunge."),
            en = LocalizedContent("In what year was Pearl Jam's \"Black\" released?", listOf("1991", "1989", "1993", "1992"), "Culture", "\"Black\" is a song from Pearl Jam's debut album, Ten, released in 1991, a landmark year for grunge."),
            zh = LocalizedContent("Pearl Jam的《Black》是哪一年发行的？", listOf("1991", "1989", "1993", "1992"), "文化", "《Black》是Pearl Jam首张专辑《Ten》中的歌曲，该专辑于1991年发行，是垃圾摇滚的重要年份。"),
            es = LocalizedContent("¿En qué año se publicó \"Black\" de Pearl Jam?", listOf("1991", "1989", "1993", "1992"), "Cultura", "\"Black\" es una canción del primer álbum de Pearl Jam, Ten, lanzado en 1991, un año emblemático para el grunge.")
        ),
        BilingualQuestion(
            id = 11693, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de The Cure est le plus célèbre?", listOf("Disintegration", "Seventeen Seconds", "Pornography", "Faith"), "Culture", "Sorti en 1989, Disintegration est souvent considéré comme le chef-d'œuvre du groupe, mêlant mélancolie et textures sonores riches, et a connu un succès critique et commercial majeur."),
            en = LocalizedContent("Which album by The Cure is the most famous?", listOf("Disintegration", "Seventeen Seconds", "Pornography", "Faith"), "Culture", "Released in 1989, Disintegration is often considered the band's masterpiece, blending melancholy and rich sonic textures, achieving major critical and commercial success."),
            zh = LocalizedContent("The Cure的哪张专辑最著名？", listOf("Disintegration", "Seventeen Seconds", "Pornography", "Faith"), "文化", "1989年发行的《Disintegration》常被认为是乐队的杰作，融合了忧郁和丰富的音效纹理，取得了巨大的评论和商业成功。"),
            es = LocalizedContent("¿Qué álbum de The Cure es el más famoso?", listOf("Disintegration", "Seventeen Seconds", "Pornography", "Faith"), "Cultura", "Lanzado en 1989, Disintegration a menudo se considera la obra maestra de la banda, combinando melancolía y ricas texturas sonoras, logrando un gran éxito crítico y comercial.")
        ),
        BilingualQuestion(
            id = 11694, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Blue\" de Joni Mitchell a-t-il été publié?", listOf("1971", "1969", "1973", "1970"), "Culture", "Album emblématique de la chanteuse canadienne, \"Blue\" est sorti le 22 juin 1971, marquant un tournant dans la musique folk avec ses textes introspectifs."),
            en = LocalizedContent("In what year was Joni Mitchell's \"Blue\" released?", listOf("1971", "1969", "1973", "1970"), "Culture", "An iconic album by the Canadian singer, \"Blue\" was released on June 22, 1971, marking a turning point in folk music with its introspective lyrics."),
            zh = LocalizedContent("Joni Mitchell的《Blue》是哪一年发行的？", listOf("1971", "1969", "1973", "1970"), "文化", "这位加拿大歌手的标志性专辑《Blue》于1971年6月22日发行，以其内省的歌词标志着民谣音乐的转折点。"),
            es = LocalizedContent("¿En qué año se publicó \"Blue\" de Joni Mitchell?", listOf("1971", "1969", "1973", "1970"), "Cultura", "Un álbum icónico de la cantante canadiense, \"Blue\" fue lanzado el 22 de junio de 1971, marcando un punto de inflexión en la música folk con sus letras introspectivas.")
        ),
        BilingualQuestion(
            id = 11695, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'album chef-d'œuvre de James Brown?", listOf("Sex Machine", "It's a Man's World", "Say It Loud", "Papa's Got a Brand New Bag"), "Culture", "It's a Man's World est souvent considéré comme l'album chef-d'œuvre de James Brown car il marque un tournant vers le funk et contient des titres emblématiques comme Papa's Got a Brand New Bag."),
            en = LocalizedContent("What is James Brown's masterpiece album?", listOf("Sex Machine", "It's a Man's World", "Say It Loud", "Papa's Got a Brand New Bag"), "Culture", "\"It's a Man's World\" is often considered James Brown's masterpiece album as it marks a turn towards funk and contains iconic tracks like \"Papa's Got a Brand New Bag.\""),
            zh = LocalizedContent("James Brown的哪张专辑是杰作？", listOf("Sex Machine", "It's a Man's World", "Say It Loud", "Papa's Got a Brand New Bag"), "文化", "《It's a Man's World》常被认为是James Brown的杰作专辑，因为它标志着向放克的转变，并包含像《Papa's Got a Brand New Bag》这样的标志性曲目。"),
            es = LocalizedContent("¿Cuál es el álbum obra maestra de James Brown?", listOf("Sex Machine", "It's a Man's World", "Say It Loud", "Papa's Got a Brand New Bag"), "Cultura", "\"It's a Man's World\" a menudo se considera el álbum obra maestra de James Brown, ya que marca un giro hacia el funk y contiene temas emblemáticos como \"Papa's Got a Brand New Bag\".")
        ),
        BilingualQuestion(
            id = 11696, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Kind of Blue\" de Miles Davis a-t-il été publié?", listOf("1959", "1957", "1961", "1958"), "Culture", "Kind of Blue, enregistré en mars et avril 1959, est l'album de jazz le plus vendu de l'histoire et un chef-d'œuvre du jazz modal."),
            en = LocalizedContent("In what year was Miles Davis's \"Kind of Blue\" released?", listOf("1959", "1957", "1961", "1958"), "Culture", "\"Kind of Blue,\" recorded in March and April 1959, is the best-selling jazz album in history and a masterpiece of modal jazz."),
            zh = LocalizedContent("Miles Davis的《Kind of Blue》是哪一年发行的？", listOf("1959", "1957", "1961", "1958"), "文化", "《Kind of Blue》于1959年3月和4月录制，是历史上最畅销的爵士专辑，也是调式爵士的杰作。"),
            es = LocalizedContent("¿En qué año se publicó \"Kind of Blue\" de Miles Davis?", listOf("1959", "1957", "1961", "1958"), "Cultura", "\"Kind of Blue,\" grabado en marzo y abril de 1959, es el álbum de jazz más vendido de la historia y una obra maestra del jazz modal.")
        ),
        BilingualQuestion(
            id = 11697, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'album le plus célèbre de Miles Davis?", listOf("Kind of Blue", "Bitches Brew", "In a Silent Way", "On the Corner"), "Culture", "Sorti en 1959, Kind of Blue est un chef-d'œuvre du jazz modal et l'album le plus vendu de l'histoire du genre, avec Miles Davis en tête d'un sextet légendaire."),
            en = LocalizedContent("What is Miles Davis's most famous album?", listOf("Kind of Blue", "Bitches Brew", "In a Silent Way", "On the Corner"), "Culture", "Released in 1959, Kind of Blue is a masterpiece of modal jazz and the best-selling album in the genre's history, with Miles Davis leading a legendary sextet."),
            zh = LocalizedContent("Miles Davis最著名的专辑是哪张？", listOf("Kind of Blue", "Bitches Brew", "In a Silent Way", "On the Corner"), "文化", "1959年发行的《Kind of Blue》是调式爵士的杰作，也是该流派历史上最畅销的专辑，由Miles Davis带领传奇六重奏录制。"),
            es = LocalizedContent("¿Cuál es el álbum más famoso de Miles Davis?", listOf("Kind of Blue", "Bitches Brew", "In a Silent Way", "On the Corner"), "Cultura", "Lanzado en 1959, Kind of Blue es una obra maestra del jazz modal y el álbum más vendido en la historia del género, con Miles Davis liderando un sexteto legendario.")
        ),
        BilingualQuestion(
            id = 11698, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Giant Steps\" de John Coltrane a-t-il été publié?", listOf("1960", "1958", "1962", "1961"), "Culture", "Giant Steps a été enregistré en 1959 et publié en 1960. Cet album est une œuvre majeure du jazz, marquée par des progressions harmoniques complexes."),
            en = LocalizedContent("In what year was John Coltrane's \"Giant Steps\" released?", listOf("1960", "1958", "1962", "1961"), "Culture", "\"Giant Steps\" was recorded in 1959 and released in 1960. This album is a major work in jazz, marked by complex harmonic progressions."),
            zh = LocalizedContent("John Coltrane的《Giant Steps》是哪一年发行的？", listOf("1960", "1958", "1962", "1961"), "文化", "《Giant Steps》于1959年录制，1960年发行。这张专辑是爵士乐的重要作品，以复杂的和声进行为特点。"),
            es = LocalizedContent("¿En qué año se publicó \"Giant Steps\" de John Coltrane?", listOf("1960", "1958", "1962", "1961"), "Cultura", "\"Giant Steps\" fue grabado en 1959 y lanzado en 1960. Este álbum es una obra importante del jazz, marcada por complejas progresiones armónicas.")
        ),
        BilingualQuestion(
            id = 11699, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Stevie Wonder est un chef-d'œuvre?", listOf("Innervisions", "Songs in the Key of Life", "Fulfillingness' First Finale", "Talking Book"), "Culture", "Innervisions, sorti en 1973, est souvent considéré comme le chef-d'œuvre de Stevie Wonder pour son innovation musicale et ses textes engagés sur la société américaine."),
            en = LocalizedContent("Which album by Stevie Wonder is a masterpiece?", listOf("Innervisions", "Songs in the Key of Life", "Fulfillingness' First Finale", "Talking Book"), "Culture", "\"Innervisions,\" released in 1973, is often considered Stevie Wonder's masterpiece for its musical innovation and socially conscious lyrics about American society."),
            zh = LocalizedContent("Stevie Wonder的哪张专辑是杰作？", listOf("Innervisions", "Songs in the Key of Life", "Fulfillingness' First Finale", "Talking Book"), "文化", "1973年发行的《Innervisions》常被认为是Stevie Wonder的杰作，因其音乐创新和关于美国社会的社会意识歌词。"),
            es = LocalizedContent("¿Qué álbum de Stevie Wonder es una obra maestra?", listOf("Innervisions", "Songs in the Key of Life", "Fulfillingness' First Finale", "Talking Book"), "Cultura", "\"Innervisions,\" lanzado en 1973, a menudo se considera la obra maestra de Stevie Wonder por su innovación musical y letras con conciencia social sobre la sociedad estadounidense.")
        ),
        BilingualQuestion(
            id = 11700, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Horses\" de Patti Smith a-t-il été publié?", listOf("1975", "1973", "1977", "1974"), "Culture", "Premier album de Patti Smith, Horses est un disque fondateur du punk rock, sorti en 1975 sur le label Arista."),
            en = LocalizedContent("In what year was Patti Smith's \"Horses\" released?", listOf("1975", "1973", "1977", "1974"), "Culture", "Patti Smith's debut album, Horses, is a foundational punk rock record, released in 1975 on Arista Records."),
            zh = LocalizedContent("帕蒂·史密斯的《Horses》是哪一年发行的？", listOf("1975", "1973", "1977", "1974"), "文化", "帕蒂·史密斯的首张专辑《Horses》是朋克摇滚的开创性作品，于1975年在Arista唱片公司发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Horses\" de Patti Smith?", listOf("1975", "1973", "1977", "1974"), "Cultura", "El primer álbum de Patti Smith, Horses, es un disco fundacional del punk rock, lanzado en 1975 bajo el sello Arista.")
        ),
        BilingualQuestion(
            id = 11701, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de The Velvet Underground est un classique?", listOf("The Velvet Underground & Nico", "White Light/White Heat", "The Velvet Underground", "Loaded"), "Culture", "Cet album de 1967, produit par Andy Warhol, a marqué l'histoire du rock par son mélange de pop et d'avant-garde, avec la célèbre pochette à la banane."),
            en = LocalizedContent("Which album by The Velvet Underground is a classic?", listOf("The Velvet Underground & Nico", "White Light/White Heat", "The Velvet Underground", "Loaded"), "Culture", "This 1967 album, produced by Andy Warhol, marked rock history with its blend of pop and avant-garde, featuring the famous banana cover."),
            zh = LocalizedContent("地下丝绒乐队的哪张专辑是经典？", listOf("The Velvet Underground & Nico", "White Light/White Heat", "The Velvet Underground", "Loaded"), "文化", "这张1967年的专辑由安迪·沃霍尔制作，以流行与前卫的融合以及著名的香蕉封面在摇滚史上留下印记。"),
            es = LocalizedContent("¿Qué álbum de The Velvet Underground es un clásico?", listOf("The Velvet Underground & Nico", "White Light/White Heat", "The Velvet Underground", "Loaded"), "Cultura", "Este álbum de 1967, producido por Andy Warhol, marcó la historia del rock por su mezcla de pop y vanguardia, con la famosa portada del plátano.")
        ),
        BilingualQuestion(
            id = 11702, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Transformer\" de Lou Reed a-t-il été publié?", listOf("1972", "1970", "1974", "1971"), "Culture", "Transformer, le deuxième album solo de Lou Reed après son départ du Velvet Underground, est sorti en 1972 et produit par David Bowie."),
            en = LocalizedContent("In what year was Lou Reed's \"Transformer\" released?", listOf("1972", "1970", "1974", "1971"), "Culture", "Transformer, Lou Reed's second solo album after leaving The Velvet Underground, was released in 1972 and produced by David Bowie."),
            zh = LocalizedContent("卢·里德的《Transformer》是哪一年发行的？", listOf("1972", "1970", "1974", "1971"), "文化", "《Transformer》是卢·里德离开地下丝绒乐队后的第二张个人专辑，于1972年发行，由大卫·鲍伊制作。"),
            es = LocalizedContent("¿En qué año se publicó \"Transformer\" de Lou Reed?", listOf("1972", "1970", "1974", "1971"), "Cultura", "Transformer, el segundo álbum en solitario de Lou Reed tras su salida de The Velvet Underground, se lanzó en 1972 y fue producido por David Bowie.")
        ),
        BilingualQuestion(
            id = 11703, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Iggy Pop est le plus célèbre?", listOf("Lust for Life", "Raw Power", "The Idiot", "Soldier"), "Culture", "Sorti en 1977, Lust for Life est considéré comme l'album emblématique d'Iggy Pop, porté par le titre éponyme et produit par David Bowie."),
            en = LocalizedContent("Which album by Iggy Pop is the most famous?", listOf("Lust for Life", "Raw Power", "The Idiot", "Soldier"), "Culture", "Released in 1977, Lust for Life is considered Iggy Pop's iconic album, driven by the title track and produced by David Bowie."),
            zh = LocalizedContent("伊基·波普的哪张专辑最著名？", listOf("Lust for Life", "Raw Power", "The Idiot", "Soldier"), "文化", "1977年发行的《Lust for Life》被认为是伊基·波普的标志性专辑，由同名主打歌推动，大卫·鲍伊制作。"),
            es = LocalizedContent("¿Qué álbum de Iggy Pop es el más famoso?", listOf("Lust for Life", "Raw Power", "The Idiot", "Soldier"), "Cultura", "Lanzado en 1977, Lust for Life es considerado el álbum emblemático de Iggy Pop, impulsado por el tema homónimo y producido por David Bowie.")
        ),
        BilingualQuestion(
            id = 11704, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Entertainment!\" de Gang of Four a-t-il été publié?", listOf("1979", "1977", "1981", "1978"), "Culture", "Entertainment! est le premier album studio du groupe de post-punk britannique Gang of Four, sorti en septembre 1979."),
            en = LocalizedContent("In what year was Gang of Four's \"Entertainment!\" released?", listOf("1979", "1977", "1981", "1978"), "Culture", "Entertainment! is the debut studio album by the British post-punk band Gang of Four, released in September 1979."),
            zh = LocalizedContent("四人帮乐队的《Entertainment!》是哪一年发行的？", listOf("1979", "1977", "1981", "1978"), "文化", "《Entertainment!》是英国后朋克乐队四人帮的首张录音室专辑，于1979年9月发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Entertainment!\" de Gang of Four?", listOf("1979", "1977", "1981", "1978"), "Cultura", "Entertainment! es el primer álbum de estudio de la banda británica de post-punk Gang of Four, lanzado en septiembre de 1979.")
        ),
        BilingualQuestion(
            id = 11705, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'album chef-d'œuvre de Tom Waits?", listOf("Rain Dogs", "Small Change", "Closing Time", "Mule Variations"), "Culture", "Sorti en 1985, Rain Dogs est souvent considéré comme l'album le plus abouti de Tom Waits, mêlant blues, jazz et expérimentations sonores."),
            en = LocalizedContent("Which is Tom Waits' masterpiece album?", listOf("Rain Dogs", "Small Change", "Closing Time", "Mule Variations"), "Culture", "Released in 1985, Rain Dogs is often considered Tom Waits' most accomplished album, blending blues, jazz, and sonic experimentation."),
            zh = LocalizedContent("汤姆·威兹的哪张专辑是杰作？", listOf("Rain Dogs", "Small Change", "Closing Time", "Mule Variations"), "文化", "1985年发行的《Rain Dogs》常被认为是汤姆·威兹最成熟的专辑，融合了布鲁斯、爵士和声音实验。"),
            es = LocalizedContent("¿Cuál es el álbum obra maestra de Tom Waits?", listOf("Rain Dogs", "Small Change", "Closing Time", "Mule Variations"), "Cultura", "Lanzado en 1985, Rain Dogs es a menudo considerado el álbum más logrado de Tom Waits, combinando blues, jazz y experimentación sonora.")
        ),
        BilingualQuestion(
            id = 11706, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Horses\" de Patti Smith a-t-il été publié?", listOf("1975", "1973", "1977", "1974"), "Culture", "L'album \"Horses\", premier album de Patti Smith, est sorti en 1975, marquant un tournant dans le mouvement punk rock naissant."),
            en = LocalizedContent("In what year was Patti Smith's \"Horses\" released?", listOf("1975", "1973", "1977", "1974"), "Culture", "The album \"Horses\", Patti Smith's debut, was released in 1975, marking a turning point in the nascent punk rock movement."),
            zh = LocalizedContent("帕蒂·史密斯的《Horses》是哪一年发行的？", listOf("1975", "1973", "1977", "1974"), "文化", "专辑《Horses》是帕蒂·史密斯的首张专辑，于1975年发行，标志着新兴朋克摇滚运动的转折点。"),
            es = LocalizedContent("¿En qué año se publicó \"Horses\" de Patti Smith?", listOf("1975", "1973", "1977", "1974"), "Cultura", "El álbum \"Horses\", primer disco de Patti Smith, se lanzó en 1975, marcando un punto de inflexión en el movimiento punk rock naciente.")
        ),
        BilingualQuestion(
            id = 11707, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel album de Captain Beefheart est un classique?", listOf("Trout Mask Replica", "Safe as Milk", "Lick My Decals Off, Baby", "Clear Spot"), "Culture", "Sorti en 1969, Trout Mask Replica est considéré comme un chef-d'œuvre expérimental du rock, influent pour son mélange de blues, de free jazz et de structures non conventionnelles."),
            en = LocalizedContent("Which album by Captain Beefheart is a classic?", listOf("Trout Mask Replica", "Safe as Milk", "Lick My Decals Off, Baby", "Clear Spot"), "Culture", "Released in 1969, Trout Mask Replica is considered an experimental rock masterpiece, influential for its blend of blues, free jazz, and unconventional structures."),
            zh = LocalizedContent("牛心上尉的哪张专辑是经典？", listOf("Trout Mask Replica", "Safe as Milk", "Lick My Decals Off, Baby", "Clear Spot"), "文化", "1969年发行的《Trout Mask Replica》被认为是实验摇滚的杰作，以其布鲁斯、自由爵士和非传统结构的融合而具有影响力。"),
            es = LocalizedContent("¿Qué álbum de Captain Beefheart es un clásico?", listOf("Trout Mask Replica", "Safe as Milk", "Lick My Decals Off, Baby", "Clear Spot"), "Cultura", "Lanzado en 1969, Trout Mask Replica es considerado una obra maestra del rock experimental, influyente por su mezcla de blues, free jazz y estructuras no convencionales.")
        ),
        BilingualQuestion(
            id = 11708, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"The Stooges\" a-t-il été publié?", listOf("1969", "1967", "1971", "1970"), "Culture", "Le premier album éponyme des Stooges, groupe précurseur du punk rock, est sorti en 1969 sur le label Elektra Records."),
            en = LocalizedContent("In what year was \"The Stooges\" released?", listOf("1969", "1967", "1971", "1970"), "Culture", "The debut self-titled album by The Stooges, a pioneering punk rock band, was released in 1969 on Elektra Records."),
            zh = LocalizedContent("《The Stooges》是哪一年发行的？", listOf("1969", "1967", "1971", "1970"), "文化", "朋克摇滚先驱乐队The Stooges的首张同名专辑于1969年在Elektra唱片公司发行。"),
            es = LocalizedContent("¿En qué año se publicó \"The Stooges\"?", listOf("1969", "1967", "1971", "1970"), "Cultura", "El primer álbum homónimo de The Stooges, banda precursora del punk rock, se lanzó en 1969 bajo el sello Elektra Records.")
        ),
        BilingualQuestion(
            id = 11709, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'album le plus influent de Kraftwerk?", listOf("Autobahn", "The Robots", "Man-Machine", "Computer World"), "Culture", "Autobahn, sorti en 1974, a propulsé Kraftwerk sur la scène internationale et posé les bases de la musique électronique moderne avec son titre éponyme de 22 minutes."),
            en = LocalizedContent("Which is Kraftwerk's most influential album?", listOf("Autobahn", "The Robots", "Man-Machine", "Computer World"), "Culture", "Autobahn, released in 1974, propelled Kraftwerk onto the international stage and laid the foundations of modern electronic music with its 22-minute title track."),
            zh = LocalizedContent("发电站乐队的哪张专辑最具影响力？", listOf("Autobahn", "The Robots", "Man-Machine", "Computer World"), "文化", "1974年发行的《Autobahn》将发电站乐队推向国际舞台，其22分钟的同名曲为现代电子音乐奠定了基础。"),
            es = LocalizedContent("¿Cuál es el álbum más influyente de Kraftwerk?", listOf("Autobahn", "The Robots", "Man-Machine", "Computer World"), "Cultura", "Autobahn, lanzado en 1974, impulsó a Kraftwerk a la escena internacional y sentó las bases de la música electrónica moderna con su tema homónimo de 22 minutos.")
        ),
        BilingualQuestion(
            id = 11710, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Autobahn\" de Kraftwerk a-t-il été publié?", listOf("1974", "1972", "1976", "1973"), "Culture", "Autobahn, l'album concept qui a propulsé Kraftwerk vers la célébrité internationale, est sorti en 1974, marquant un tournant dans la musique électronique."),
            en = LocalizedContent("In which year was Kraftwerk's \"Autobahn\" released?", listOf("1974", "1972", "1976", "1973"), "Culture", "Autobahn, the concept album that propelled Kraftwerk to international fame, was released in 1974, marking a turning point in electronic music."),
            zh = LocalizedContent("Kraftwerk的《Autobahn》是在哪一年发行的？", listOf("1974", "1972", "1976", "1973"), "文化", "《Autobahn》这张概念专辑使Kraftwerk走向国际声誉，于1974年发行，标志着电子音乐的转折点。"),
            es = LocalizedContent("¿En qué año se publicó \"Autobahn\" de Kraftwerk?", listOf("1974", "1972", "1976", "1973"), "Cultura", "Autobahn, el álbum conceptual que impulsó a Kraftwerk a la fama internacional, se lanzó en 1974, marcando un punto de inflexión en la música electrónica.")
        ),
        BilingualQuestion(
            id = 11711, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Grammy Awards ont-ils été créés?", listOf("1959", "1961", "1957", "1963"), "Culture", "La première cérémonie des Grammy Awards a eu lieu le 4 mai 1959, récompensant les artistes pour leurs réalisations musicales de l'année 1958."),
            en = LocalizedContent("In which year were the Grammy Awards created?", listOf("1959", "1961", "1957", "1963"), "Culture", "The first Grammy Awards ceremony took place on May 4, 1959, honoring artists for their musical achievements in 1958."),
            zh = LocalizedContent("格莱美奖是在哪一年创立的？", listOf("1959", "1961", "1957", "1963"), "文化", "第一届格莱美奖颁奖典礼于1959年5月4日举行，表彰艺术家在1958年的音乐成就。"),
            es = LocalizedContent("¿En qué año se crearon los Premios Grammy?", listOf("1959", "1961", "1957", "1963"), "Cultura", "La primera ceremonia de los Premios Grammy tuvo lugar el 4 de mayo de 1959, premiando a los artistas por sus logros musicales en 1958.")
        ),
        BilingualQuestion(
            id = 11712, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de Grammy Awards?", listOf("Georg Solti", "Classique", "Beyoncé", "Alicia Keys"), "Culture", "Beyoncé détient le record du plus grand nombre de Grammy Awards remportés par un artiste, avec 32 trophées, dépassant le chef d'orchestre Georg Solti."),
            en = LocalizedContent("Who has won the most Grammy Awards?", listOf("Georg Solti", "Classic", "Beyoncé", "Alicia Keys"), "Culture", "Beyoncé holds the record for the most Grammy Awards won by an artist, with 32 trophies, surpassing conductor Georg Solti."),
            zh = LocalizedContent("谁赢得了最多的格莱美奖？", listOf("乔治·索尔蒂", "古典", "碧昂丝", "艾丽西亚·凯斯"), "文化", "碧昂丝保持着艺术家获得格莱美奖最多的纪录，共32座奖杯，超过了指挥家乔治·索尔蒂。"),
            es = LocalizedContent("¿Quién ha ganado más Premios Grammy?", listOf("Georg Solti", "Clásico", "Beyoncé", "Alicia Keys"), "Cultura", "Beyoncé tiene el récord de la mayor cantidad de Premios Grammy ganados por un artista, con 32 trofeos, superando al director de orquesta Georg Solti.")
        ),
        BilingualQuestion(
            id = 11713, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grammy Awards Adele a-t-elle remportés?", listOf("15", "12", "18", "10"), "Culture", "Adele a remporté 15 Grammy Awards au total, un record pour une artiste britannique solo, grâce à des albums comme \"21\" et \"25\"."),
            en = LocalizedContent("How many Grammy Awards has Adele won?", listOf("15", "12", "18", "10"), "Culture", "Adele has won 15 Grammy Awards in total, a record for a solo British artist, thanks to albums like \"21\" and \"25\"."),
            zh = LocalizedContent("阿黛尔赢得了多少格莱美奖？", listOf("15", "12", "18", "10"), "文化", "阿黛尔总共赢得了15项格莱美奖，这是英国独唱艺术家的纪录，得益于《21》和《25》等专辑。"),
            es = LocalizedContent("¿Cuántos Premios Grammy ha ganado Adele?", listOf("15", "12", "18", "10"), "Cultura", "Adele ha ganado 15 Premios Grammy en total, un récord para una artista británica solista, gracias a álbumes como \"21\" y \"25\".")
        ),
        BilingualQuestion(
            id = 11714, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Bad\" de Michael Jackson a-t-il remporté un Grammy?", listOf("1988", "1986", "1990", "1987"), "Culture", "Bad de Michael Jackson a remporté un Grammy en 1988 dans la catégorie Meilleure performance vocale pop masculine pour la chanson titre."),
            en = LocalizedContent("In which year did Michael Jackson's \"Bad\" win a Grammy?", listOf("1988", "1986", "1990", "1987"), "Culture", "Michael Jackson's Bad won a Grammy in 1988 in the category of Best Male Pop Vocal Performance for the title track."),
            zh = LocalizedContent("迈克尔·杰克逊的《Bad》在哪一年获得了格莱美奖？", listOf("1988", "1986", "1990", "1987"), "文化", "迈克尔·杰克逊的《Bad》在1988年获得了格莱美最佳流行男歌手表演奖（主打歌）。"),
            es = LocalizedContent("¿En qué año ganó un Grammy \"Bad\" de Michael Jackson?", listOf("1988", "1986", "1990", "1987"), "Cultura", "Bad de Michael Jackson ganó un Grammy en 1988 en la categoría de Mejor Interpretación Vocal Pop Masculina por la canción principal.")
        ),
        BilingualQuestion(
            id = 11715, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de Grammy Awards remportés par un artiste en une nuit?", listOf("8", "6", "10", "5"), "Culture", "Michael Jackson a remporté 8 Grammy Awards en une seule nuit en 1984, un record toujours inégalé."),
            en = LocalizedContent("What is the most Grammy Awards won by an artist in one night?", listOf("8", "6", "10", "5"), "Culture", "Michael Jackson won 8 Grammy Awards in a single night in 1984, a record that still stands."),
            zh = LocalizedContent("一位艺术家在一晚内赢得的最多格莱美奖是多少？", listOf("8", "6", "10", "5"), "文化", "迈克尔·杰克逊在1984年一晚内赢得了8项格莱美奖，这一纪录至今未被打破。"),
            es = LocalizedContent("¿Cuál es la mayor cantidad de Premios Grammy ganados por un artista en una noche?", listOf("8", "6", "10", "5"), "Cultura", "Michael Jackson ganó 8 Premios Grammy en una sola noche en 1984, un récord que aún se mantiene.")
        ),
        BilingualQuestion(
            id = 11716, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le Grammy Award du Meilleur Album en 2023?", listOf("Harry Styles", "Beyoncé", "Taylor Swift", "Miley Cyrus"), "Culture", "Beyoncé a remporté le Grammy Award du Meilleur Album en 2023 pour son album \"Renaissance\", un hommage à la culture ballroom et dance. C'était la première fois qu'elle gagnait cette catégorie après plusieurs nominations."),
            en = LocalizedContent("Who won the Grammy Award for Best Album in 2023?", listOf("Harry Styles", "Beyoncé", "Taylor Swift", "Miley Cyrus"), "Culture", "Beyoncé won the Grammy Award for Best Album in 2023 for her album \"Renaissance\", a tribute to ballroom and dance culture. It was her first win in this category after several nominations."),
            zh = LocalizedContent("谁在2023年赢得了格莱美最佳专辑奖？", listOf("哈里·斯泰尔斯", "碧昂丝", "泰勒·斯威夫特", "麦莉·赛勒斯"), "文化", "碧昂丝凭借专辑《Renaissance》在2023年赢得了格莱美最佳专辑奖，这是对舞厅和舞蹈文化的致敬。这是她在多次提名后首次获得该奖项。"),
            es = LocalizedContent("¿Quién ganó el Premio Grammy al Mejor Álbum en 2023?", listOf("Harry Styles", "Beyoncé", "Taylor Swift", "Miley Cyrus"), "Cultura", "Beyoncé ganó el Premio Grammy al Mejor Álbum en 2023 por su álbum \"Renaissance\", un homenaje a la cultura ballroom y dance. Fue su primera victoria en esta categoría después de varias nominaciones.")
        ),
        BilingualQuestion(
            id = 11717, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste français a remporté le plus de Grammys?", listOf("David Guetta", "Justice", "Daft Punk", "Stéphane Grappelli"), "Culture", "Stéphane Grappelli, célèbre violoniste de jazz, a remporté un Grammy Award en 1997 pour l'ensemble de sa carrière, ce qui constitue le record pour un artiste français."),
            en = LocalizedContent("Which French artist has won the most Grammys?", listOf("David Guetta", "Justice", "Daft Punk", "Stéphane Grappelli"), "Culture", "Stéphane Grappelli, the famous jazz violinist, won a Grammy Award in 1997 for his lifetime achievements, which is the record for a French artist."),
            zh = LocalizedContent("哪位法国艺术家赢得了最多的格莱美奖？", listOf("大卫·库塔", "正义", "蠢朋克", "斯特凡·格拉佩利"), "文化", "著名爵士小提琴家斯特凡·格拉佩利于1997年获得格莱美终身成就奖，这是法国艺术家的纪录。"),
            es = LocalizedContent("¿Qué artista francés ha ganado más Grammys?", listOf("David Guetta", "Justice", "Daft Punk", "Stéphane Grappelli"), "Cultura", "Stéphane Grappelli, el famoso violinista de jazz, ganó un Premio Grammy en 1997 por su trayectoria, lo que constituye el récord para un artista francés.")
        ),
        BilingualQuestion(
            id = 11718, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Daft Punk a-t-il remporté un Grammy?", listOf("2002", "2000", "2004", "2001"), "Culture", "Daft Punk a remporté son premier Grammy en 2002 pour l'album *Discovery*, dans la catégorie du meilleur album de musique électronique/dance."),
            en = LocalizedContent("In which year did Daft Punk win a Grammy?", listOf("2002", "2000", "2004", "2001"), "Culture", "Daft Punk won their first Grammy in 2002 for the album *Discovery*, in the category of Best Electronic/Dance Album."),
            zh = LocalizedContent("蠢朋克在哪一年赢得了格莱美奖？", listOf("2002", "2000", "2004", "2001"), "文化", "蠢朋克在2002年凭借专辑《Discovery》获得了他们的第一个格莱美奖，类别是最佳电子/舞曲专辑。"),
            es = LocalizedContent("¿En qué año ganó Daft Punk un Grammy?", listOf("2002", "2000", "2004", "2001"), "Cultura", "Daft Punk ganó su primer Grammy en 2002 por el álbum *Discovery*, en la categoría de Mejor Álbum de Música Electrónica/Dance.")
        ),
        BilingualQuestion(
            id = 11719, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grammys The Beatles ont-ils remportés?", listOf("7", "5", "10", "3"), "Culture", "The Beatles ont remporté 7 Grammy Awards, mais ce chiffre inclut des récompenses individuelles et collectives. Le groupe en tant que tel en a obtenu 5, notamment pour l'Album de l'année avec Sgt. Pepper's Lonely Hearts Club Band."),
            en = LocalizedContent("How many Grammys have The Beatles won?", listOf("7", "5", "10", "3"), "Culture", "The Beatles have won 7 Grammy Awards, but this includes individual and collective awards. The group itself has won 5, including Album of the Year for Sgt. Pepper's Lonely Hearts Club Band."),
            zh = LocalizedContent("披头士赢得了多少格莱美奖？", listOf("7", "5", "10", "3"), "文化", "披头士共赢得了7项格莱美奖，但这包括个人和集体奖项。乐队本身获得了5项，包括凭借《Sgt. Pepper's Lonely Hearts Club Band》获得的年度专辑奖。"),
            es = LocalizedContent("¿Cuántos Grammys han ganado The Beatles?", listOf("7", "5", "10", "3"), "Cultura", "The Beatles han ganado 7 Premios Grammy, pero esto incluye premios individuales y colectivos. El grupo como tal ha obtenido 5, incluyendo el Álbum del Año por Sgt. Pepper's Lonely Hearts Club Band.")
        ),
        BilingualQuestion(
            id = 11720, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste a remporté le Grammy du meilleur nouvel artiste en 2024?", listOf("Victoria Monét", "Olivia Rodrigo", "The Kid LAROI", "Billie Eilish"), "Culture", "Victoria Monét a remporté le Grammy du meilleur nouvel artiste en 2024, après une carrière d'auteure-compositrice pour d'autres artistes, notamment Ariana Grande."),
            en = LocalizedContent("Which artist won the Grammy for Best New Artist in 2024?", listOf("Victoria Monét", "Olivia Rodrigo", "The Kid LAROI", "Billie Eilish"), "Culture", "Victoria Monét won the Grammy for Best New Artist in 2024, after a career as a songwriter for other artists, notably Ariana Grande."),
            zh = LocalizedContent("哪位艺术家在2024年获得了格莱美最佳新人奖？", listOf("维多利亚·莫奈", "奥利维亚·罗德里戈", "The Kid LAROI", "比莉·艾利什"), "文化", "维多利亚·莫奈在2024年获得了格莱美最佳新人奖，此前她曾为其他艺术家（尤其是爱莉安娜·格兰德）担任词曲作者。"),
            es = LocalizedContent("¿Qué artista ganó el Grammy al Mejor Artista Nuevo en 2024?", listOf("Victoria Monét", "Olivia Rodrigo", "The Kid LAROI", "Billie Eilish"), "Cultura", "Victoria Monét ganó el Grammy al Mejor Artista Nuevo en 2024, tras una carrera como compositora para otros artistas, especialmente Ariana Grande.")
        ),
        BilingualQuestion(
            id = 11721, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Aretha Franklin a-t-elle remporté son premier Grammy?", listOf("1967", "1965", "1969", "1963"), "Culture", "Aretha Franklin a remporté son premier Grammy en 1967 pour la chanson \"Respect\", qui est devenue un hymne emblématique."),
            en = LocalizedContent("In what year did Aretha Franklin win her first Grammy?", listOf("1967", "1965", "1969", "1963"), "Culture", "Aretha Franklin won her first Grammy in 1967 for the song \"Respect\", which became an iconic anthem."),
            zh = LocalizedContent("艾瑞莎·弗兰克林在哪一年获得了她的第一座格莱美奖？", listOf("1967", "1965", "1969", "1963"), "文化", "艾瑞莎·弗兰克林在1967年凭借歌曲《Respect》获得了她的第一座格莱美奖，这首歌成为了一首标志性的颂歌。"),
            es = LocalizedContent("¿En qué año ganó Aretha Franklin su primer Grammy?", listOf("1967", "1965", "1969", "1963"), "Cultura", "Aretha Franklin ganó su primer Grammy en 1967 por la canción \"Respect\", que se convirtió en un himno icónico.")
        ),
        BilingualQuestion(
            id = 11722, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grammys Aretha Franklin a-t-elle remportés?", listOf("18", "15", "20", "12"), "Culture", "Aretha Franklin a remporté 18 Grammy Awards au cours de sa carrière, dont 11 dans la catégorie de la meilleure performance vocale R&B féminine. Elle détient le record du plus grand nombre de Grammy remportés par une artiste féminine."),
            en = LocalizedContent("How many Grammys did Aretha Franklin win?", listOf("18", "15", "20", "12"), "Culture", "Aretha Franklin won 18 Grammy Awards throughout her career, including 11 for Best Female R&B Vocal Performance. She holds the record for the most Grammys won by a female artist."),
            zh = LocalizedContent("艾瑞莎·弗兰克林获得了多少座格莱美奖？", listOf("18", "15", "20", "12"), "文化", "艾瑞莎·弗兰克林在其职业生涯中获得了18项格莱美奖，其中包括11项最佳R&B女歌手奖。她保持着女性艺术家获得格莱美奖最多的纪录。"),
            es = LocalizedContent("¿Cuántos Grammys ganó Aretha Franklin?", listOf("18", "15", "20", "12"), "Cultura", "Aretha Franklin ganó 18 premios Grammy a lo largo de su carrera, incluidos 11 en la categoría de Mejor Interpretación Vocal Femenina de R&B. Tiene el récord de más Grammys ganados por una artista femenina.")
        ),
        BilingualQuestion(
            id = 11723, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le seul album ayant remporté les quatre Grammy les plus importants?", listOf("Thriller", "Abbey Road", "Sgt. Pepper's", "The Dark Side of the Moon"), "Culture", "L'album Thriller de Michael Jackson a remporté en 1984 les quatre Grammy majeurs : album de l'année, disque de l'année, chanson de l'année et meilleure performance pop masculine. Aucun autre album n'a réussi cet exploit depuis."),
            en = LocalizedContent("Which is the only album to have won the four major Grammys?", listOf("Thriller", "Abbey Road", "Sgt. Pepper's", "The Dark Side of the Moon"), "Culture", "Michael Jackson's album Thriller won the four major Grammys in 1984: Album of the Year, Record of the Year, Song of the Year, and Best Pop Vocal Performance, Male. No other album has achieved this feat since."),
            zh = LocalizedContent("哪张专辑是唯一获得四项主要格莱美奖的专辑？", listOf("Thriller", "Abbey Road", "Sgt. Pepper's", "The Dark Side of the Moon"), "文化", "迈克尔·杰克逊的专辑《Thriller》在1984年获得了四项主要格莱美奖：年度专辑、年度唱片、年度歌曲和最佳流行男歌手。此后没有其他专辑实现这一壮举。"),
            es = LocalizedContent("¿Cuál es el único álbum que ha ganado los cuatro Grammys principales?", listOf("Thriller", "Abbey Road", "Sgt. Pepper's", "The Dark Side of the Moon"), "Cultura", "El álbum Thriller de Michael Jackson ganó los cuatro Grammys principales en 1984: Álbum del Año, Grabación del Año, Canción del Año y Mejor Interpretación Vocal Pop Masculina. Ningún otro álbum ha logrado esta hazaña desde entonces.")
        ),
        BilingualQuestion(
            id = 11724, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Kanye West a-t-il remporté son premier Grammy?", listOf("2004", "2002", "2006", "2005"), "Culture", "Kanye West a remporté son premier Grammy en 2004 pour son album \"The College Dropout\", qui a été nominé dans plusieurs catégories et a remporté le prix du meilleur album rap."),
            en = LocalizedContent("In what year did Kanye West win his first Grammy?", listOf("2004", "2002", "2006", "2005"), "Culture", "Kanye West won his first Grammy in 2004 for his album \"The College Dropout\", which was nominated in several categories and won Best Rap Album."),
            zh = LocalizedContent("坎耶·维斯特在哪一年获得了他的第一座格莱美奖？", listOf("2004", "2002", "2006", "2005"), "文化", "坎耶·维斯特在2004年凭借专辑《The College Dropout》获得了他的第一座格莱美奖，该专辑获得了多项提名并赢得了最佳说唱专辑奖。"),
            es = LocalizedContent("¿En qué año ganó Kanye West su primer Grammy?", listOf("2004", "2002", "2006", "2005"), "Cultura", "Kanye West ganó su primer Grammy en 2004 por su álbum \"The College Dropout\", que fue nominado en varias categorías y ganó el premio al Mejor Álbum de Rap.")
        ),
        BilingualQuestion(
            id = 11725, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grammys Kanye West a-t-il remportés?", listOf("24", "20", "30", "15"), "Culture", "Kanye West a remporté 24 Grammy Awards, ce qui fait de lui l'un des artistes les plus récompensés de l'histoire de la cérémonie, notamment pour ses albums et productions innovantes."),
            en = LocalizedContent("How many Grammys has Kanye West won?", listOf("24", "20", "30", "15"), "Culture", "Kanye West has won 24 Grammy Awards, making him one of the most awarded artists in the history of the ceremony, notably for his innovative albums and productions."),
            zh = LocalizedContent("坎耶·维斯特获得了多少座格莱美奖？", listOf("24", "20", "30", "15"), "文化", "坎耶·维斯特获得了24项格莱美奖，使他成为该颁奖典礼历史上获奖最多的艺术家之一，尤其是因其创新的专辑和制作。"),
            es = LocalizedContent("¿Cuántos Grammys ha ganado Kanye West?", listOf("24", "20", "30", "15"), "Cultura", "Kanye West ha ganado 24 premios Grammy, lo que lo convierte en uno de los artistas más premiados en la historia de la ceremonia, especialmente por sus innovadores álbumes y producciones.")
        ),
        BilingualQuestion(
            id = 11726, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le Grammy Award pour la meilleure performance vocale féminine?", listOf("Best Pop Vocal Album", "Best Solo Pop Vocal Album", "Best Female Pop Vocal Album", "Best Pop Female Vocal"), "Culture", "Le Grammy Award pour la meilleure performance vocale féminine a été renommé en 2012 pour devenir le Best Pop Solo Performance, puis intégré au Best Pop Solo Vocal Album."),
            en = LocalizedContent("What is the Grammy Award for Best Female Pop Vocal Performance?", listOf("Best Pop Vocal Album", "Best Solo Pop Vocal Album", "Best Female Pop Vocal Album", "Best Pop Female Vocal"), "Culture", "The Grammy Award for Best Female Pop Vocal Performance was renamed in 2012 to become Best Pop Solo Performance, then integrated into Best Pop Solo Vocal Album."),
            zh = LocalizedContent("格莱美最佳流行女歌手奖是什么？", listOf("最佳流行演唱专辑", "最佳流行独唱专辑", "最佳流行女歌手专辑", "最佳流行女歌手"), "文化", "格莱美最佳流行女歌手奖在2012年更名为最佳流行独唱表演奖，随后并入最佳流行独唱专辑奖。"),
            es = LocalizedContent("¿Cuál es el premio Grammy a la Mejor Interpretación Vocal Pop Femenina?", listOf("Mejor Álbum Vocal Pop", "Mejor Álbum Vocal Pop Solista", "Mejor Álbum Vocal Pop Femenino", "Mejor Vocal Pop Femenino"), "Cultura", "El premio Grammy a la Mejor Interpretación Vocal Pop Femenina fue renombrado en 2012 como Mejor Interpretación Pop Solista, y luego integrado en el Mejor Álbum Vocal Pop Solista.")
        ),
        BilingualQuestion(
            id = 11727, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Taylor Swift a-t-elle remporté son premier Grammy?", listOf("2010", "2008", "2012", "2009"), "Culture", "Taylor Swift a remporté son premier Grammy en 2010 pour son album *Fearless*, qui a été nommé Album de l'année."),
            en = LocalizedContent("In what year did Taylor Swift win her first Grammy?", listOf("2010", "2008", "2012", "2009"), "Culture", "Taylor Swift won her first Grammy in 2010 for her album *Fearless*, which was named Album of the Year."),
            zh = LocalizedContent("泰勒·斯威夫特在哪一年获得了她的第一座格莱美奖？", listOf("2010", "2008", "2012", "2009"), "文化", "泰勒·斯威夫特在2010年凭借专辑《Fearless》获得了她的第一座格莱美奖，该专辑被评为年度专辑。"),
            es = LocalizedContent("¿En qué año ganó Taylor Swift su primer Grammy?", listOf("2010", "2008", "2012", "2009"), "Cultura", "Taylor Swift ganó su primer Grammy en 2010 por su álbum *Fearless*, que fue nombrado Álbum del Año.")
        ),
        BilingualQuestion(
            id = 11728, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grammys Taylor Swift a-t-elle remportés?", listOf("12", "10", "15", "8"), "Culture", "Taylor Swift a remporté 12 Grammy Awards sur 52 nominations, ce qui en fait l'une des artistes les plus récompensées de l'histoire de la cérémonie."),
            en = LocalizedContent("How many Grammys has Taylor Swift won?", listOf("12", "10", "15", "8"), "Culture", "Taylor Swift has won 12 Grammy Awards out of 52 nominations, making her one of the most awarded artists in the history of the ceremony."),
            zh = LocalizedContent("泰勒·斯威夫特获得了多少座格莱美奖？", listOf("12", "10", "15", "8"), "文化", "泰勒·斯威夫特在52项提名中获得了12项格莱美奖，使她成为该颁奖典礼历史上获奖最多的艺术家之一。"),
            es = LocalizedContent("¿Cuántos Grammys ha ganado Taylor Swift?", listOf("12", "10", "15", "8"), "Cultura", "Taylor Swift ha ganado 12 premios Grammy de 52 nominaciones, lo que la convierte en una de las artistas más premiadas en la historia de la ceremonia.")
        ),
        BilingualQuestion(
            id = 11729, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste a remporté le Grammy du meilleur album rap en 2024?", listOf("Killer Mike", "Metro Boomin", "J. Cole", "Drake"), "Culture", "Killer Mike a remporté le Grammy du meilleur album rap en 2024 pour son album \"Michael\", qui rend hommage à son héritage et à ses racines musicales."),
            en = LocalizedContent("Which artist won the Grammy for Best Rap Album in 2024?", listOf("Killer Mike", "Metro Boomin", "J. Cole", "Drake"), "Culture", "Killer Mike won the Grammy for Best Rap Album in 2024 for his album \"Michael\", which pays homage to his heritage and musical roots."),
            zh = LocalizedContent("哪位艺术家在2024年获得了格莱美最佳说唱专辑奖？", listOf("杀手迈克", "Metro Boomin", "J. Cole", "德雷克"), "文化", "杀手迈克在2024年凭借专辑《Michael》获得了格莱美最佳说唱专辑奖，该专辑向他的传统和音乐根源致敬。"),
            es = LocalizedContent("¿Qué artista ganó el Grammy al Mejor Álbum de Rap en 2024?", listOf("Killer Mike", "Metro Boomin", "J. Cole", "Drake"), "Cultura", "Killer Mike ganó el Grammy al Mejor Álbum de Rap en 2024 por su álbum \"Michael\", que rinde homenaje a su herencia y raíces musicales.")
        ),
        BilingualQuestion(
            id = 11730, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Céline Dion a-t-elle remporté son premier Grammy?", listOf("1991", "1989", "1993", "1990"), "Culture", "Céline Dion a remporté son premier Grammy en 1991 dans la catégorie de la meilleure prestation pop par un duo ou un groupe pour la chanson \"When the Night Is Cold\" avec Peabo Bryson."),
            en = LocalizedContent("In which year did Celine Dion win her first Grammy?", listOf("1991", "1989", "1993", "1990"), "Culture", "Celine Dion won her first Grammy in 1991 in the category of Best Pop Performance by a Duo or Group for the song \"When the Night Is Cold\" with Peabo Bryson."),
            zh = LocalizedContent("席琳·迪翁在哪一年获得了她的第一个格莱美奖？", listOf("1991", "1989", "1993", "1990"), "文化", "席琳·迪翁于1991年凭借与皮波·布莱森合作的歌曲《When the Night Is Cold》获得最佳流行组合奖，这是她的第一个格莱美奖。"),
            es = LocalizedContent("¿En qué año ganó Celine Dion su primer Grammy?", listOf("1991", "1989", "1993", "1990"), "Cultura", "Celine Dion ganó su primer Grammy en 1991 en la categoría de Mejor Interpretación Pop por un Dúo o Grupo por la canción \"When the Night Is Cold\" con Peabo Bryson.")
        ),
        BilingualQuestion(
            id = 11731, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'instrument principal du jazz?", listOf("Saxophone", "Piano", "Trompette", "Tous les précédents"), "Culture", "Le jazz se caractérise par une grande diversité instrumentale, où le saxophone, la trompette, le piano et la contrebasse sont tous essentiels selon les styles et les époques."),
            en = LocalizedContent("What is the main instrument of jazz?", listOf("Saxophone", "Piano", "Trumpet", "All of the above"), "Culture", "Jazz is characterized by great instrumental diversity, where saxophone, trumpet, piano, and double bass are all essential depending on the style and era."),
            zh = LocalizedContent("爵士乐的主要乐器是什么？", listOf("萨克斯管", "钢琴", "小号", "以上都是"), "文化", "爵士乐以乐器多样性为特点，萨克斯管、小号、钢琴和低音提琴根据风格和时代的不同都至关重要。"),
            es = LocalizedContent("¿Cuál es el instrumento principal del jazz?", listOf("Saxofón", "Piano", "Trompeta", "Todos los anteriores"), "Cultura", "El jazz se caracteriza por una gran diversidad instrumental, donde el saxofón, la trompeta, el piano y el contrabajo son esenciales según el estilo y la época.")
        ),
        BilingualQuestion(
            id = 11732, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le rock 'n' roll a-t-il émergé?", listOf("1954", "1952", "1956", "1950"), "Culture", "1954 est souvent citée car c'est l'année du premier enregistrement studio de \"That's All Right\" par Elvis Presley, marquant un tournant médiatique pour le genre."),
            en = LocalizedContent("In which year did rock 'n' roll emerge?", listOf("1954", "1952", "1956", "1950"), "Culture", "1954 is often cited as the year of Elvis Presley's first studio recording of \"That's All Right,\" marking a media turning point for the genre."),
            zh = LocalizedContent("摇滚乐在哪一年兴起？", listOf("1954", "1952", "1956", "1950"), "文化", "1954年常被认为是埃尔维斯·普雷斯利首次录制《That's All Right》的年份，标志着该流派在媒体上的转折点。"),
            es = LocalizedContent("¿En qué año surgió el rock 'n' roll?", listOf("1954", "1952", "1956", "1950"), "Cultura", "1954 se cita a menudo como el año de la primera grabación de estudio de \"That's All Right\" de Elvis Presley, marcando un punto de inflexión mediático para el género.")
        ),
        BilingualQuestion(
            id = 11733, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le roi du rock and roll?", listOf("Elvis Presley", "Chuck Berry", "Little Richard", "Jerry Lee Lewis"), "Culture", "Elvis Presley a popularisé le rock and roll dans les années 1950 avec des tubes comme \"Heartbreak Hotel\" et \"Jailhouse Rock\", devenant une icône culturelle mondiale."),
            en = LocalizedContent("Who is the king of rock and roll?", listOf("Elvis Presley", "Chuck Berry", "Little Richard", "Jerry Lee Lewis"), "Culture", "Elvis Presley popularized rock and roll in the 1950s with hits like \"Heartbreak Hotel\" and \"Jailhouse Rock,\" becoming a global cultural icon."),
            zh = LocalizedContent("谁是摇滚乐之王？", listOf("埃尔维斯·普雷斯利", "查克·贝里", "小理查德", "杰瑞·李·刘易斯"), "文化", "埃尔维斯·普雷斯利在20世纪50年代以《Heartbreak Hotel》和《Jailhouse Rock》等热门歌曲推广了摇滚乐，成为全球文化偶像。"),
            es = LocalizedContent("¿Quién es el rey del rock and roll?", listOf("Elvis Presley", "Chuck Berry", "Little Richard", "Jerry Lee Lewis"), "Cultura", "Elvis Presley popularizó el rock and roll en la década de 1950 con éxitos como \"Heartbreak Hotel\" y \"Jailhouse Rock\", convirtiéndose en un icono cultural mundial.")
        ),
        BilingualQuestion(
            id = 11734, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel genre musical est issu de la Nouvelle-Orléans?", listOf("Jazz", "Blues", "Rock and roll", "Country"), "Culture", "Le jazz est né à la Nouvelle-Orléans au début du XXe siècle, mêlant blues, ragtime et musiques afro-américaines."),
            en = LocalizedContent("Which music genre originated in New Orleans?", listOf("Jazz", "Blues", "Rock and roll", "Country"), "Culture", "Jazz was born in New Orleans at the beginning of the 20th century, blending blues, ragtime, and African American music."),
            zh = LocalizedContent("哪种音乐流派起源于新奥尔良？", listOf("爵士乐", "蓝调", "摇滚乐", "乡村音乐"), "文化", "爵士乐诞生于20世纪初的新奥尔良，融合了蓝调、拉格泰姆和非裔美国音乐。"),
            es = LocalizedContent("¿Qué género musical se originó en Nueva Orleans?", listOf("Jazz", "Blues", "Rock and roll", "Country"), "Cultura", "El jazz nació en Nueva Orleans a principios del siglo XX, combinando blues, ragtime y música afroamericana.")
        ),
        BilingualQuestion(
            id = 11735, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays d'origine de la musique reggae?", listOf("Jamaïque", "Haïti", "Trinité-et-Tobago", "Bahamas"), "Culture", "Le reggae est né en Jamaïque dans les années 1960, issu du ska et du rocksteady, popularisé mondialement par des artistes comme Bob Marley."),
            en = LocalizedContent("What is the country of origin of reggae music?", listOf("Jamaica", "Haiti", "Trinidad and Tobago", "Bahamas"), "Culture", "Reggae was born in Jamaica in the 1960s, evolving from ska and rocksteady, and popularized worldwide by artists like Bob Marley."),
            zh = LocalizedContent("雷鬼音乐起源于哪个国家？", listOf("牙买加", "海地", "特立尼达和多巴哥", "巴哈马"), "文化", "雷鬼音乐诞生于20世纪60年代的牙买加，由斯卡和洛克斯代迪演变而来，通过鲍勃·马利等艺术家在全球流行。"),
            es = LocalizedContent("¿Cuál es el país de origen de la música reggae?", listOf("Jamaica", "Haití", "Trinidad y Tobago", "Bahamas"), "Cultura", "El reggae nació en Jamaica en la década de 1960, derivado del ska y el rocksteady, popularizado mundialmente por artistas como Bob Marley.")
        ),
        BilingualQuestion(
            id = 11736, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste est connu comme le roi du reggae?", listOf("Bob Marley", "Peter Tosh", "Burning Spear", "Gregory Isaacs"), "Culture", "Bob Marley a popularisé le reggae à l'international dans les années 1970 avec des titres comme \"No Woman, No Cry\" et \"One Love\", devenant l'icône mondiale du genre."),
            en = LocalizedContent("Which artist is known as the king of reggae?", listOf("Bob Marley", "Peter Tosh", "Burning Spear", "Gregory Isaacs"), "Culture", "Bob Marley popularized reggae internationally in the 1970s with songs like \"No Woman, No Cry\" and \"One Love,\" becoming the global icon of the genre."),
            zh = LocalizedContent("哪位艺术家被称为雷鬼乐之王？", listOf("鲍勃·马利", "彼得·托什", "燃烧的长矛", "格雷戈里·艾萨克斯"), "文化", "鲍勃·马利在20世纪70年代以《No Woman, No Cry》和《One Love》等歌曲将雷鬼音乐推向国际，成为该流派的全球偶像。"),
            es = LocalizedContent("¿Qué artista es conocido como el rey del reggae?", listOf("Bob Marley", "Peter Tosh", "Burning Spear", "Gregory Isaacs"), "Cultura", "Bob Marley popularizó el reggae a nivel internacional en la década de 1970 con canciones como \"No Woman, No Cry\" y \"One Love\", convirtiéndose en el icono mundial del género.")
        ),
        BilingualQuestion(
            id = 11737, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel genre musical a émergé en Afrique du Sud?", listOf("Kwaito", "Mbaqanga", "Gumboot music", "Tous les précédents"), "Culture", "L'Afrique du Sud a vu émerger de nombreux genres musicaux influents comme le jazz, le kwaito, le mbaqanga et le gqom, chacun reflétant une époque et une culture spécifiques."),
            en = LocalizedContent("Which music genre emerged in South Africa?", listOf("Kwaito", "Mbaqanga", "Gumboot music", "All of the above"), "Culture", "South Africa has seen the emergence of many influential music genres such as jazz, kwaito, mbaqanga, and gqom, each reflecting a specific era and culture."),
            zh = LocalizedContent("哪种音乐流派起源于南非？", listOf("Kwaito", "Mbaqanga", "Gumboot音乐", "以上都是"), "文化", "南非涌现了许多有影响力的音乐流派，如爵士乐、Kwaito、Mbaqanga和Gqom，每种都反映了特定的时代和文化。"),
            es = LocalizedContent("¿Qué género musical surgió en Sudáfrica?", listOf("Kwaito", "Mbaqanga", "Música Gumboot", "Todos los anteriores"), "Cultura", "Sudáfrica ha visto surgir muchos géneros musicales influyentes como el jazz, el kwaito, el mbaqanga y el gqom, cada uno reflejando una época y cultura específicas.")
        ),
        BilingualQuestion(
            id = 11738, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays d'origine de la musique électronique?", listOf("Allemagne", "France", "États-Unis", "Royaume-Uni"), "Culture", "L'Allemagne est considérée comme le berceau de la musique électronique moderne, notamment grâce à l'influence du groupe Kraftwerk dans les années 1970, pionnier de l'utilisation des synthétiseurs."),
            en = LocalizedContent("What is the country of origin of electronic music?", listOf("Germany", "France", "United States", "United Kingdom"), "Culture", "Germany is considered the birthplace of modern electronic music, largely due to the influence of the band Kraftwerk in the 1970s, pioneers in the use of synthesizers."),
            zh = LocalizedContent("电子音乐起源于哪个国家？", listOf("德国", "法国", "美国", "英国"), "文化", "德国被认为是现代电子音乐的发源地，主要归功于20世纪70年代Kraftwerk乐队的影响，他们是合成器使用的先驱。"),
            es = LocalizedContent("¿Cuál es el país de origen de la música electrónica?", listOf("Alemania", "Francia", "Estados Unidos", "Reino Unido"), "Cultura", "Alemania es considerada la cuna de la música electrónica moderna, en gran parte gracias a la influencia de la banda Kraftwerk en la década de 1970, pioneros en el uso de sintetizadores.")
        ),
        BilingualQuestion(
            id = 11739, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel groupe a révolutionné la musique électronique en Europe?", listOf("Kraftwerk", "Tangerine Dream", "Jean-Michel Jarre", "Vangelis"), "Culture", "Kraftwerk, groupe allemand formé en 1970, est considéré comme le pionnier de la musique électronique moderne avec des albums comme Autobahn et The Man-Machine."),
            en = LocalizedContent("Which group revolutionized electronic music in Europe?", listOf("Kraftwerk", "Tangerine Dream", "Jean-Michel Jarre", "Vangelis"), "Culture", "Kraftwerk, a German band formed in 1970, is considered a pioneer of modern electronic music with albums like Autobahn and The Man-Machine."),
            zh = LocalizedContent("哪个团体在欧洲革新了电子音乐？", listOf("Kraftwerk", "Tangerine Dream", "让-米歇尔·雅尔", "范吉利斯"), "文化", "Kraftwerk，1970年成立的德国乐队，被认为是现代电子音乐的先驱，代表作有《Autobahn》和《The Man-Machine》。"),
            es = LocalizedContent("¿Qué grupo revolucionó la música electrónica en Europa?", listOf("Kraftwerk", "Tangerine Dream", "Jean-Michel Jarre", "Vangelis"), "Cultura", "Kraftwerk, banda alemana formada en 1970, es considerada pionera de la música electrónica moderna con álbumes como Autobahn y The Man-Machine.")
        ),
        BilingualQuestion(
            id = 11740, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel genre musical est issu du Brésil?", listOf("Bossa Nova", "Samba", "Forró", "Tous les précédents"), "Culture", "Le Brésil est le berceau de nombreux genres musicaux reconnus mondialement, comme la samba, la bossa nova, le forró et le funk carioca, ce qui rend la réponse \"tous les précédents\" correcte."),
            en = LocalizedContent("Which musical genre originated in Brazil?", listOf("Bossa Nova", "Samba", "Forró", "All of the above"), "Culture", "Brazil is the birthplace of many globally recognized musical genres, such as samba, bossa nova, forró, and funk carioca, making the answer \"all of the above\" correct."),
            zh = LocalizedContent("哪种音乐流派起源于巴西？", listOf("波萨诺瓦", "桑巴", "福罗", "以上都是"), "文化", "巴西是许多世界知名音乐流派的发源地，如桑巴、波萨诺瓦、福罗和卡里奥卡放克，因此答案“以上都是”正确。"),
            es = LocalizedContent("¿Qué género musical se originó en Brasil?", listOf("Bossa Nova", "Samba", "Forró", "Todos los anteriores"), "Cultura", "Brasil es la cuna de muchos géneros musicales reconocidos mundialmente, como la samba, la bossa nova, el forró y el funk carioca, por lo que la respuesta \"todos los anteriores\" es correcta.")
        ),
        BilingualQuestion(
            id = 11741, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays d'origine du flamenco?", listOf("Espagne", "Andalousie", "Catalogne", "Grenade"), "Culture", "Le flamenco est né en Andalousie, au sud de l'Espagne, issu du mélange des cultures gitane, arabe et andalouse."),
            en = LocalizedContent("What is the country of origin of flamenco?", listOf("Spain", "Andalusia", "Catalonia", "Granada"), "Culture", "Flamenco originated in Andalusia, southern Spain, from the fusion of Gypsy, Arab, and Andalusian cultures."),
            zh = LocalizedContent("弗拉门戈起源于哪个国家？", listOf("西班牙", "安达卢西亚", "加泰罗尼亚", "格拉纳达"), "文化", "弗拉门戈诞生于西班牙南部的安达卢西亚，源自吉普赛、阿拉伯和安达卢西亚文化的融合。"),
            es = LocalizedContent("¿Cuál es el país de origen del flamenco?", listOf("España", "Andalucía", "Cataluña", "Granada"), "Cultura", "El flamenco nació en Andalucía, al sur de España, de la mezcla de las culturas gitana, árabe y andaluza.")
        ),
        BilingualQuestion(
            id = 11742, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays d'origine de la musique classique?", listOf("Autriche", "Italie", "Allemagne", "France"), "Culture", "L'Autriche est considérée comme un berceau de la musique classique grâce à des compositeurs majeurs comme Mozart, Haydn et Schubert, qui y ont vécu et travaillé. Vienne était un centre culturel incontournable pour ce genre musical."),
            en = LocalizedContent("What is the country of origin of classical music?", listOf("Austria", "Italy", "Germany", "France"), "Culture", "Austria is considered a cradle of classical music thanks to major composers like Mozart, Haydn, and Schubert who lived and worked there. Vienna was a key cultural center for this genre."),
            zh = LocalizedContent("古典音乐起源于哪个国家？", listOf("奥地利", "意大利", "德国", "法国"), "文化", "奥地利被认为是古典音乐的摇篮，得益于莫扎特、海顿和舒伯特等主要作曲家在此生活和工作。维也纳是这一流派的重要文化中心。"),
            es = LocalizedContent("¿Cuál es el país de origen de la música clásica?", listOf("Austria", "Italia", "Alemania", "Francia"), "Cultura", "Austria es considerada una cuna de la música clásica gracias a compositores importantes como Mozart, Haydn y Schubert, que vivieron y trabajaron allí. Viena era un centro cultural clave para este género.")
        ),
        BilingualQuestion(
            id = 11743, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays d'origine de la musique country?", listOf("États-Unis", "Australie", "Canada", "Nouvelle-Zélande"), "Culture", "La musique country est née dans le sud des États-Unis au début du XXe siècle, mêlant influences folk, blues et gospel."),
            en = LocalizedContent("What is the country of origin of country music?", listOf("United States", "Australia", "Canada", "New Zealand"), "Culture", "Country music originated in the southern United States in the early 20th century, blending folk, blues, and gospel influences."),
            zh = LocalizedContent("乡村音乐起源于哪个国家？", listOf("美国", "澳大利亚", "加拿大", "新西兰"), "文化", "乡村音乐起源于20世纪初的美国南部，融合了民谣、蓝调和福音音乐的影响。"),
            es = LocalizedContent("¿Cuál es el país de origen de la música country?", listOf("Estados Unidos", "Australia", "Canadá", "Nueva Zelanda"), "Cultura", "La música country se originó en el sur de Estados Unidos a principios del siglo XX, combinando influencias folk, blues y gospel.")
        ),
        BilingualQuestion(
            id = 11744, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel genre musical a émergé à Detroit?", listOf("Motown", "Garage rock", "Techno", "House"), "Culture", "Le label Motown, fondé à Detroit en 1959 par Berry Gordy, a popularisé un style de soul et de pop aux influences rhythm and blues."),
            en = LocalizedContent("Which musical genre emerged in Detroit?", listOf("Motown", "Garage rock", "Techno", "House"), "Culture", "The Motown label, founded in Detroit in 1959 by Berry Gordy, popularized a style of soul and pop with rhythm and blues influences."),
            zh = LocalizedContent("哪种音乐流派起源于底特律？", listOf("摩城", "车库摇滚", "电子舞曲", "浩室"), "文化", "摩城唱片公司由贝里·戈迪于1959年在底特律创立，推广了一种融合节奏蓝调影响的灵魂乐和流行乐风格。"),
            es = LocalizedContent("¿Qué género musical surgió en Detroit?", listOf("Motown", "Garage rock", "Techno", "House"), "Cultura", "El sello Motown, fundado en Detroit en 1959 por Berry Gordy, popularizó un estilo de soul y pop con influencias de rhythm and blues.")
        ),
        BilingualQuestion(
            id = 11745, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel genre musical a émergé à Chicago?", listOf("Chicago blues", "House music", "Funk", "Gospel"), "Culture", "Le Chicago blues est un style de blues électrique qui s'est développé à Chicago dans les années 1940 et 1950, notamment grâce à l'arrivée de musiciens afro-américains venus du Sud des États-Unis."),
            en = LocalizedContent("Which musical genre emerged in Chicago?", listOf("Chicago blues", "House music", "Funk", "Gospel"), "Culture", "Chicago blues is a style of electric blues that developed in Chicago in the 1940s and 1950s, notably due to the arrival of African American musicians from the southern United States."),
            zh = LocalizedContent("哪种音乐流派起源于芝加哥？", listOf("芝加哥蓝调", "浩室音乐", "放克", "福音音乐"), "文化", "芝加哥蓝调是一种电子蓝调风格，于20世纪40年代和50年代在芝加哥发展起来，特别是由于来自美国南部的非裔美国音乐家的到来。"),
            es = LocalizedContent("¿Qué género musical surgió en Chicago?", listOf("Chicago blues", "House music", "Funk", "Gospel"), "Cultura", "El Chicago blues es un estilo de blues eléctrico que se desarrolló en Chicago en las décadas de 1940 y 1950, especialmente debido a la llegada de músicos afroamericanos del sur de Estados Unidos.")
        ),
        BilingualQuestion(
            id = 11746, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays d'origine de la musique punk?", listOf("Royaume-Uni", "États-Unis", "France", "Allemagne"), "Culture", "Le punk rock est né au Royaume-Uni et aux États-Unis au milieu des années 1970, mais le mouvement punk britannique, avec des groupes comme les Sex Pistols, a popularisé le genre à l'échelle mondiale."),
            en = LocalizedContent("What is the country of origin of punk music?", listOf("United Kingdom", "United States", "France", "Germany"), "Culture", "Punk rock originated in the United Kingdom and the United States in the mid-1970s, but the British punk movement, with bands like the Sex Pistols, popularized the genre worldwide."),
            zh = LocalizedContent("朋克音乐起源于哪个国家？", listOf("英国", "美国", "法国", "德国"), "文化", "朋克摇滚起源于20世纪70年代中期的英国和美国，但英国朋克运动，以性手枪等乐队为代表，将这一流派推广到全球。"),
            es = LocalizedContent("¿Cuál es el país de origen de la música punk?", listOf("Reino Unido", "Estados Unidos", "Francia", "Alemania"), "Cultura", "El punk rock se originó en el Reino Unido y Estados Unidos a mediados de la década de 1970, pero el movimiento punk británico, con bandas como los Sex Pistols, popularizó el género a nivel mundial.")
        ),
        BilingualQuestion(
            id = 11747, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe britannique a révolutionné le punk?", listOf("The Sex Pistols", "The Clash", "The Ramones", "New York Dolls"), "Culture", "The Sex Pistols ont popularisé le punk rock avec leur album Never Mind the Bollocks et leur attitude provocatrice, marquant une rupture radicale avec le rock des années 1970."),
            en = LocalizedContent("Which British band revolutionized punk?", listOf("The Sex Pistols", "The Clash", "The Ramones", "New York Dolls"), "Culture", "The Sex Pistols popularized punk rock with their album Never Mind the Bollocks and their provocative attitude, marking a radical break with 1970s rock."),
            zh = LocalizedContent("哪支英国乐队彻底改变了朋克？", listOf("性手枪", "碰撞乐队", "雷蒙斯", "纽约娃娃"), "文化", "性手枪乐队凭借专辑《Never Mind the Bollocks》和挑衅态度推广了朋克摇滚，标志着与20世纪70年代摇滚的彻底决裂。"),
            es = LocalizedContent("¿Qué banda británica revolucionó el punk?", listOf("The Sex Pistols", "The Clash", "The Ramones", "New York Dolls"), "Cultura", "The Sex Pistols popularizaron el punk rock con su álbum Never Mind the Bollocks y su actitud provocadora, marcando una ruptura radical con el rock de los años 70.")
        ),
        BilingualQuestion(
            id = 11748, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays d'origine de la musique reggaeton?", listOf("Porto Rico", "Jamaïque", "République Dominicaine", "Trinité-et-Tobago"), "Culture", "Le reggaeton est né à Porto Rico dans les années 1990, fusionnant le reggae jamaïcain, le dancehall et le hip-hop latino-américain."),
            en = LocalizedContent("What is the country of origin of reggaeton music?", listOf("Puerto Rico", "Jamaica", "Dominican Republic", "Trinidad and Tobago"), "Culture", "Reggaeton originated in Puerto Rico in the 1990s, fusing Jamaican reggae, dancehall, and Latin American hip-hop."),
            zh = LocalizedContent("雷鬼顿音乐起源于哪个国家？", listOf("波多黎各", "牙买加", "多米尼加共和国", "特立尼达和多巴哥"), "文化", "雷鬼顿起源于20世纪90年代的波多黎各，融合了牙买加雷鬼、舞厅和拉丁美洲嘻哈音乐。"),
            es = LocalizedContent("¿Cuál es el país de origen de la música reggaeton?", listOf("Puerto Rico", "Jamaica", "República Dominicana", "Trinidad y Tobago"), "Cultura", "El reggaeton nació en Puerto Rico en la década de 1990, fusionando el reggae jamaicano, el dancehall y el hip-hop latinoamericano.")
        ),
        BilingualQuestion(
            id = 11749, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel genre musical est populaire en Afrique de l'Ouest?", listOf("Afrobeat", "Highlife", "Juju", "Tous les précédents"), "Culture", "L'Afrique de l'Ouest est un foyer de diversité musicale où des genres comme l'afrobeat, le highlife, le mbalax et le coupé-décalé sont populaires, chacun ayant des racines et des styles distincts."),
            en = LocalizedContent("Which musical genre is popular in West Africa?", listOf("Afrobeat", "Highlife", "Juju", "All of the above"), "Culture", "West Africa is a hub of musical diversity where genres like afrobeat, highlife, mbalax, and coupé-décalé are popular, each with distinct roots and styles."),
            zh = LocalizedContent("哪种音乐流派在西非流行？", listOf("非洲节拍", "高生活", "朱朱", "以上都是"), "文化", "西非是音乐多样性的中心，非洲节拍、高生活、姆巴拉克斯和库佩德卡莱等流派都很流行，每种都有独特的根源和风格。"),
            es = LocalizedContent("¿Qué género musical es popular en África Occidental?", listOf("Afrobeat", "Highlife", "Juju", "Todos los anteriores"), "Cultura", "África Occidental es un foco de diversidad musical donde géneros como el afrobeat, el highlife, el mbalax y el coupé-décalé son populares, cada uno con raíces y estilos distintos.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11750, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste nigérian a popularisé l'afrobeat?", listOf("Fela Kuti", "King Sunny Ade", "Wizkid", "Burna Boy"), "Culture", "Fela Kuti a créé et popularisé l'afrobeat dans les années 1970 en fusionnant le highlife, le funk et le jazz avec des paroles politiquement engagées."),
            en = LocalizedContent("Which Nigerian artist popularized Afrobeat?", listOf("Fela Kuti", "King Sunny Ade", "Wizkid", "Burna Boy"), "Culture", "Fela Kuti created and popularized Afrobeat in the 1970s by fusing highlife, funk, and jazz with politically charged lyrics."),
            zh = LocalizedContent("哪位尼日利亚艺术家推广了非洲节拍音乐？", listOf("费拉·库蒂", "金·桑尼·阿德", "威兹基德", "伯纳男孩"), "文化", "费拉·库蒂在20世纪70年代通过融合高生活音乐、放克和爵士乐以及政治性歌词，创造并推广了非洲节拍音乐。"),
            es = LocalizedContent("¿Qué artista nigeriano popularizó el afrobeat?", listOf("Fela Kuti", "King Sunny Ade", "Wizkid", "Burna Boy"), "Cultura", "Fela Kuti creó y popularizó el afrobeat en la década de 1970 fusionando highlife, funk y jazz con letras políticamente comprometidas.")
        ),
        BilingualQuestion(
            id = 11751, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'instrument le plus ancien?", listOf("Flûte", "Tambour", "Lyre", "Harpe"), "Culture", "Des flûtes en os et en ivoire datant de plus de 40 000 ans ont été découvertes dans le Jura souabe, en Allemagne, ce qui en fait les plus anciens instruments de musique connus."),
            en = LocalizedContent("What is the oldest instrument?", listOf("Flute", "Drum", "Lyre", "Harp"), "Culture", "Bone and ivory flutes dating back over 40,000 years have been discovered in the Swabian Jura in Germany, making them the oldest known musical instruments."),
            zh = LocalizedContent("最古老的乐器是什么？", listOf("笛子", "鼓", "里拉琴", "竖琴"), "文化", "在德国施瓦本汝拉山发现了超过4万年前的骨笛和象牙笛，使其成为已知最古老的乐器。"),
            es = LocalizedContent("¿Cuál es el instrumento más antiguo?", listOf("Flauta", "Tambor", "Lira", "Arpa"), "Cultura", "Se han descubierto flautas de hueso y marfil de más de 40.000 años en el Jura de Suabia, Alemania, lo que las convierte en los instrumentos musicales más antiguos conocidos.")
        ),
        BilingualQuestion(
            id = 11752, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de cordes a une guitare classique?", listOf("6", "7", "8", "5"), "Culture", "La guitare classique, comme la plupart des guitares acoustiques et électriques standard, possède traditionnellement six cordes, accordées en mi, la, ré, sol, si, mi."),
            en = LocalizedContent("How many strings does a classical guitar have?", listOf("6", "7", "8", "5"), "Culture", "The classical guitar, like most standard acoustic and electric guitars, traditionally has six strings, tuned to E, A, D, G, B, E."),
            zh = LocalizedContent("古典吉他有几根弦？", listOf("6", "7", "8", "5"), "文化", "古典吉他与大多数标准原声吉他和电吉他一样，传统上有六根弦，调音为E、A、D、G、B、E。"),
            es = LocalizedContent("¿Cuántas cuerdas tiene una guitarra clásica?", listOf("6", "7", "8", "5"), "Cultura", "La guitarra clásica, como la mayoría de las guitarras acústicas y eléctricas estándar, tiene tradicionalmente seis cuerdas, afinadas en mi, la, re, sol, si, mi.")
        ),
        BilingualQuestion(
            id = 11753, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument a le son le plus grave?", listOf("Contrebasse", "Tuba", "Violoncelle", "Basson"), "Culture", "La contrebasse est l'instrument à cordes frottées le plus grand et le plus grave de l'orchestre, produisant des fréquences très basses."),
            en = LocalizedContent("Which instrument has the lowest sound?", listOf("Double bass", "Tuba", "Cello", "Bassoon"), "Culture", "The double bass is the largest and lowest-pitched bowed string instrument in the orchestra, producing very low frequencies."),
            zh = LocalizedContent("哪种乐器的声音最低？", listOf("低音提琴", "大号", "大提琴", "巴松管"), "文化", "低音提琴是管弦乐队中最大、音调最低的弓弦乐器，能产生非常低的频率。"),
            es = LocalizedContent("¿Qué instrumento tiene el sonido más grave?", listOf("Contrabajo", "Tuba", "Violonchelo", "Fagot"), "Cultura", "El contrabajo es el instrumento de cuerda frotada más grande y grave de la orquesta, produciendo frecuencias muy bajas.")
        ),
        BilingualQuestion(
            id = 11754, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel instrument est typiquement utilisé en jazz?", listOf("Saxophone", "Trompette", "Piano", "Tous les précédents"), "Culture", "Le jazz utilise une grande variété d'instruments, incluant le saxophone, la trompette, le piano et la contrebasse, donc aucun choix unique n'est exclusif."),
            en = LocalizedContent("Which instrument is typically used in jazz?", listOf("Saxophone", "Trumpet", "Piano", "All of the above"), "Culture", "Jazz uses a wide variety of instruments, including saxophone, trumpet, piano, and double bass, so no single choice is exclusive."),
            zh = LocalizedContent("哪种乐器通常用于爵士乐？", listOf("萨克斯管", "小号", "钢琴", "以上所有"), "文化", "爵士乐使用多种乐器，包括萨克斯管、小号、钢琴和低音提琴，因此没有单一选择是排他的。"),
            es = LocalizedContent("¿Qué instrumento se utiliza típicamente en el jazz?", listOf("Saxofón", "Trompeta", "Piano", "Todos los anteriores"), "Cultura", "El jazz utiliza una gran variedad de instrumentos, incluyendo saxofón, trompeta, piano y contrabajo, por lo que ninguna opción única es exclusiva.")
        ),
        BilingualQuestion(
            id = 11755, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de touches a un piano?", listOf("88", "85", "90", "100"), "Culture", "Le piano standard moderne possède 88 touches, soit 52 blanches et 36 noires, couvrant sept octaves et une tierce mineure."),
            en = LocalizedContent("How many keys does a piano have?", listOf("88", "85", "90", "100"), "Culture", "The modern standard piano has 88 keys, 52 white and 36 black, covering seven octaves and a minor third."),
            zh = LocalizedContent("钢琴有多少个琴键？", listOf("88", "85", "90", "100"), "文化", "现代标准钢琴有88个琴键，52个白键和36个黑键，覆盖七个八度加一个小三度。"),
            es = LocalizedContent("¿Cuántas teclas tiene un piano?", listOf("88", "85", "90", "100"), "Cultura", "El piano estándar moderno tiene 88 teclas, 52 blancas y 36 negras, cubriendo siete octavas y una tercera menor.")
        ),
        BilingualQuestion(
            id = 11756, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est traditionnel en Inde?", listOf("Sitar", "Tabla", "Sarod", "Tous les précédents"), "Culture", "Le sitar, le tabla et la veena sont tous des instruments traditionnels indiens, chacun jouant un rôle majeur dans la musique classique du pays."),
            en = LocalizedContent("Which instrument is traditional in India?", listOf("Sitar", "Tabla", "Sarod", "All of the above"), "Culture", "The sitar, tabla, and sarod are all traditional Indian instruments, each playing a major role in the country's classical music."),
            zh = LocalizedContent("哪种乐器是印度的传统乐器？", listOf("西塔琴", "塔布拉鼓", "萨罗德琴", "以上所有"), "文化", "西塔琴、塔布拉鼓和萨罗德琴都是印度传统乐器，每种都在印度古典音乐中扮演重要角色。"),
            es = LocalizedContent("¿Qué instrumento es tradicional en la India?", listOf("Sitar", "Tabla", "Sarod", "Todos los anteriores"), "Cultura", "El sitar, la tabla y el sarod son instrumentos tradicionales indios, cada uno desempeñando un papel importante en la música clásica del país.")
        ),
        BilingualQuestion(
            id = 11757, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est traditionnel au Japon?", listOf("Shamisen", "Koto", "Shakuhachi", "Tous les précédents"), "Culture", "Le Japon possède plusieurs instruments traditionnels emblématiques comme le shamisen, le koto et la flûte shakuhachi, donc toutes les réponses proposées étaient valables."),
            en = LocalizedContent("Which instrument is traditional in Japan?", listOf("Shamisen", "Koto", "Shakuhachi", "All of the above"), "Culture", "Japan has several iconic traditional instruments such as the shamisen, koto, and shakuhachi flute, so all proposed answers were valid."),
            zh = LocalizedContent("哪种乐器是日本的传统乐器？", listOf("三味线", "古筝", "尺八", "以上所有"), "文化", "日本有几种标志性的传统乐器，如三味线、古筝和尺八笛，因此所有提出的答案都是有效的。"),
            es = LocalizedContent("¿Qué instrumento es tradicional en Japón?", listOf("Shamisen", "Koto", "Shakuhachi", "Todos los anteriores"), "Cultura", "Japón tiene varios instrumentos tradicionales emblemáticos como el shamisen, el koto y la flauta shakuhachi, por lo que todas las respuestas propuestas eran válidas.")
        ),
        BilingualQuestion(
            id = 11758, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est traditionnel en Indonésie?", listOf("Gamelan", "Angklung", "Gong", "Tous les précédents"), "Culture", "L'Indonésie possède une grande diversité d'instruments traditionnels comme le gamelan, l'angklung ou le sasando, chacun représentant une région ou une culture spécifique."),
            en = LocalizedContent("Which instrument is traditional in Indonesia?", listOf("Gamelan", "Angklung", "Gong", "All of the above"), "Culture", "Indonesia has a great diversity of traditional instruments such as gamelan, angklung, and sasando, each representing a specific region or culture."),
            zh = LocalizedContent("哪种乐器是印度尼西亚的传统乐器？", listOf("甘美兰", "安格隆", "锣", "以上所有"), "文化", "印度尼西亚有种类繁多的传统乐器，如甘美兰、安格隆和萨桑多，每种代表特定的地区或文化。"),
            es = LocalizedContent("¿Qué instrumento es tradicional en Indonesia?", listOf("Gamelán", "Angklung", "Gong", "Todos los anteriores"), "Cultura", "Indonesia posee una gran diversidad de instrumentos tradicionales como el gamelán, el angklung y el sasando, cada uno representando una región o cultura específica.")
        ),
        BilingualQuestion(
            id = 11759, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument à vent est le plus grave?", listOf("Tuba", "Basson", "Cor anglais", "Clarinette basse"), "Culture", "Le tuba est l'instrument à vent le plus grave de l'orchestre symphonique, produisant les notes les plus basses grâce à sa grande taille et son pavillon large."),
            en = LocalizedContent("Which wind instrument is the lowest?", listOf("Tuba", "Bassoon", "English horn", "Bass clarinet"), "Culture", "The tuba is the lowest-pitched wind instrument in the symphony orchestra, producing the lowest notes due to its large size and wide bell."),
            zh = LocalizedContent("哪种管乐器音调最低？", listOf("大号", "巴松管", "英国管", "低音单簧管"), "文化", "大号是交响乐团中音调最低的管乐器，由于其大尺寸和宽大的喇叭口，能产生最低的音符。"),
            es = LocalizedContent("¿Qué instrumento de viento es el más grave?", listOf("Tuba", "Fagot", "Corno inglés", "Clarinete bajo"), "Cultura", "La tuba es el instrumento de viento más grave de la orquesta sinfónica, produciendo las notas más bajas gracias a su gran tamaño y amplio pabellón.")
        ),
        BilingualQuestion(
            id = 11760, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument à vent est le plus aigu?", listOf("Piccolo", "Flûte", "Clarinette", "Hautbois"), "Culture", "Le piccolo est une flûte traversière de petite taille, dont la tessiture est environ une octave plus haute que celle de la flûte standard, ce qui en fait l'instrument à vent le plus aigu de l'orchestre."),
            en = LocalizedContent("Which wind instrument is the highest pitched?", listOf("Piccolo", "Flute", "Clarinet", "Oboe"), "Culture", "The piccolo is a small transverse flute whose range is about an octave higher than that of the standard flute, making it the highest pitched wind instrument in the orchestra."),
            zh = LocalizedContent("哪种管乐器音高最高？", listOf("短笛", "长笛", "单簧管", "双簧管"), "文化", "短笛是一种小型横笛，其音域比标准长笛高约一个八度，是管弦乐队中音高最高的管乐器。"),
            es = LocalizedContent("¿Qué instrumento de viento es el más agudo?", listOf("Piccolo", "Flauta", "Clarinete", "Oboe"), "Cultura", "El piccolo es una flauta travesera pequeña cuyo registro es aproximadamente una octava más alto que el de la flauta estándar, lo que lo convierte en el instrumento de viento más agudo de la orquesta.")
        ),
        BilingualQuestion(
            id = 11761, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de cordes a un violon?", listOf("4", "5", "3", "6"), "Culture", "Le violon a quatre cordes, accordées en sol, ré, la et mi, une configuration standard depuis le XVIe siècle."),
            en = LocalizedContent("How many strings does a violin have?", listOf("4", "5", "3", "6"), "Culture", "The violin has four strings, tuned to G, D, A and E, a standard configuration since the 16th century."),
            zh = LocalizedContent("小提琴有多少根弦？", listOf("4", "5", "3", "6"), "文化", "小提琴有四根弦，调音为G、D、A和E，这是自16世纪以来的标准配置。"),
            es = LocalizedContent("¿Cuántas cuerdas tiene un violín?", listOf("4", "5", "3", "6"), "Cultura", "El violín tiene cuatro cuerdas, afinadas en sol, re, la y mi, una configuración estándar desde el siglo XVI.")
        ),
        BilingualQuestion(
            id = 11762, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel instrument est typiquement utilisé en musique classique?", listOf("Violon", "Violoncelle", "Alto", "Tous les précédents"), "Culture", "La musique classique utilise une grande variété d'instruments, incluant cordes, bois, cuivres et percussions, donc tous les instruments cités sont typiques."),
            en = LocalizedContent("Which instrument is typically used in classical music?", listOf("Violin", "Cello", "Viola", "All of the above"), "Culture", "Classical music uses a wide variety of instruments, including strings, woodwinds, brass and percussion, so all the instruments mentioned are typical."),
            zh = LocalizedContent("哪种乐器通常用于古典音乐？", listOf("小提琴", "大提琴", "中提琴", "以上所有"), "文化", "古典音乐使用多种乐器，包括弦乐、木管、铜管和打击乐，因此所列出的所有乐器都是典型的。"),
            es = LocalizedContent("¿Qué instrumento se utiliza típicamente en la música clásica?", listOf("Violín", "Violonchelo", "Viola", "Todos los anteriores"), "Cultura", "La música clásica utiliza una gran variedad de instrumentos, incluyendo cuerdas, maderas, metales y percusión, por lo que todos los instrumentos mencionados son típicos.")
        ),
        BilingualQuestion(
            id = 11763, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument produisit le style musical \"slide guitar\"?", listOf("Guitare slide", "Guitare acoustique", "Guitare électrique", "Harmonica"), "Culture", "La slide guitar se joue en faisant glisser un objet (bouteille, métal) sur les cordes, ce qui produit un son continu et glissé typique du blues."),
            en = LocalizedContent("Which instrument produced the musical style \"slide guitar\"?", listOf("Slide guitar", "Acoustic guitar", "Electric guitar", "Harmonica"), "Culture", "Slide guitar is played by sliding an object (bottle, metal) along the strings, producing a continuous, gliding sound typical of blues."),
            zh = LocalizedContent("哪种乐器产生了“滑棒吉他”音乐风格？", listOf("滑棒吉他", "原声吉他", "电吉他", "口琴"), "文化", "滑棒吉他通过用物体（瓶子、金属）在琴弦上滑动演奏，产生连续滑音，是蓝调的典型声音。"),
            es = LocalizedContent("¿Qué instrumento produjo el estilo musical \"slide guitar\"?", listOf("Guitarra slide", "Guitarra acústica", "Guitarra eléctrica", "Armónica"), "Cultura", "La guitarra slide se toca deslizando un objeto (botella, metal) sobre las cuerdas, produciendo un sonido continuo y deslizado típico del blues.")
        ),
        BilingualQuestion(
            id = 11764, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est traditionnellement utilisé pour produire le son du blues?", listOf("Harmonica", "Guitare acoustique", "Guitare électrique", "Tous les précédents"), "Culture", "Le blues utilise une variété d'instruments comme la guitare, l'harmonica et le piano, chacun apportant une texture sonore caractéristique au genre."),
            en = LocalizedContent("Which instrument is traditionally used to produce the sound of blues?", listOf("Harmonica", "Acoustic guitar", "Electric guitar", "All of the above"), "Culture", "Blues uses a variety of instruments such as guitar, harmonica and piano, each contributing a characteristic sound texture to the genre."),
            zh = LocalizedContent("哪种乐器传统上用于产生蓝调的声音？", listOf("口琴", "原声吉他", "电吉他", "以上所有"), "文化", "蓝调使用多种乐器，如吉他、口琴和钢琴，每种都为该流派贡献了独特的音色质感。"),
            es = LocalizedContent("¿Qué instrumento se utiliza tradicionalmente para producir el sonido del blues?", listOf("Armónica", "Guitarra acústica", "Guitarra eléctrica", "Todos los anteriores"), "Cultura", "El blues utiliza una variedad de instrumentos como la guitarra, la armónica y el piano, cada uno aportando una textura sonora característica al género.")
        ),
        BilingualQuestion(
            id = 11765, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'instrument à percussion le plus ancien?", listOf("Tambour", "Cymbale", "Gong", "Xylophone"), "Culture", "Des tambours primitifs en peau tendue sur un tronc d'arbre ou une carapace de tortue datent de la Préhistoire, utilisés pour la communication et les rituels."),
            en = LocalizedContent("What is the oldest percussion instrument?", listOf("Drum", "Cymbal", "Gong", "Xylophone"), "Culture", "Primitive drums made of skin stretched over a tree trunk or turtle shell date back to Prehistory, used for communication and rituals."),
            zh = LocalizedContent("最古老的打击乐器是什么？", listOf("鼓", "钹", "锣", "木琴"), "文化", "用兽皮绷在树干或龟壳上制成的原始鼓可追溯到史前时期，用于交流和仪式。"),
            es = LocalizedContent("¿Cuál es el instrumento de percusión más antiguo?", listOf("Tambor", "Platillo", "Gong", "Xilófono"), "Cultura", "Tambores primitivos hechos de piel estirada sobre un tronco de árbol o caparazón de tortuga datan de la Prehistoria, utilizados para comunicación y rituales.")
        ),
        BilingualQuestion(
            id = 11766, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est typique de l'orchestre d'harmonie?", listOf("Trompette", "Trombone", "Tuba", "Tous les précédents"), "Culture", "Un orchestre d'harmonie regroupe des instruments à vent (bois et cuivres) et des percussions, mais pas de cordes frottées. La bonne réponse inclut donc tous les instruments typiques de cette formation."),
            en = LocalizedContent("Which instrument is typical of a concert band?", listOf("Trumpet", "Trombone", "Tuba", "All of the above"), "Culture", "A concert band includes wind instruments (woodwinds and brass) and percussion, but no bowed strings. The correct answer therefore includes all typical instruments of this ensemble."),
            zh = LocalizedContent("哪种乐器是管乐团的典型乐器？", listOf("小号", "长号", "大号", "以上所有"), "文化", "管乐团包括管乐器（木管和铜管）和打击乐器，但不包括弓弦乐器。因此正确答案包括该乐团的所有典型乐器。"),
            es = LocalizedContent("¿Qué instrumento es típico de una banda de concierto?", listOf("Trompeta", "Trombón", "Tuba", "Todos los anteriores"), "Cultura", "Una banda de concierto incluye instrumentos de viento (maderas y metales) y percusión, pero no cuerdas frotadas. La respuesta correcta incluye por tanto todos los instrumentos típicos de esta formación.")
        ),
        BilingualQuestion(
            id = 11767, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument produit le son du mellotron?", listOf("Clavier électrique", "Synthétiseur", "Piano électrique", "Orgue"), "Culture", "Le mellotron est un instrument à clavier électrique qui utilise des bandes magnétiques préenregistrées pour reproduire des sons d'orchestre ou de chœur."),
            en = LocalizedContent("Which instrument produces the sound of the mellotron?", listOf("Electric keyboard", "Synthesizer", "Electric piano", "Organ"), "Culture", "The mellotron is an electric keyboard instrument that uses pre-recorded magnetic tapes to reproduce orchestral or choral sounds."),
            zh = LocalizedContent("哪种乐器产生梅洛特ron的声音？", listOf("电子键盘", "合成器", "电钢琴", "管风琴"), "文化", "梅洛特ron是一种电子键盘乐器，使用预录的磁带再现管弦乐或合唱声音。"),
            es = LocalizedContent("¿Qué instrumento produce el sonido del mellotron?", listOf("Teclado eléctrico", "Sintetizador", "Piano eléctrico", "Órgano"), "Cultura", "El mellotron es un instrumento de teclado eléctrico que utiliza cintas magnéticas pregrabadas para reproducir sonidos orquestales o corales.")
        ),
        BilingualQuestion(
            id = 11768, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est le plus utilisé en musique électronique?", listOf("Synthétiseur", "Clavier", "Séquenceur", "Tous les précédents"), "Culture", "La musique électronique repose sur une grande variété d'instruments comme les synthétiseurs, boîtes à rythmes et ordinateurs, aucun n'étant universellement dominant."),
            en = LocalizedContent("Which instrument is most used in electronic music?", listOf("Synthesizer", "Keyboard", "Sequencer", "All of the above"), "Culture", "Electronic music relies on a wide variety of instruments such as synthesizers, drum machines and computers, none being universally dominant."),
            zh = LocalizedContent("哪种乐器在电子音乐中使用最多？", listOf("合成器", "键盘", "音序器", "以上所有"), "文化", "电子音乐依赖多种乐器，如合成器、鼓机和计算机，没有一种乐器是普遍占主导地位的。"),
            es = LocalizedContent("¿Qué instrumento es el más utilizado en la música electrónica?", listOf("Sintetizador", "Teclado", "Secuenciador", "Todos los anteriores"), "Cultura", "La música electrónica se basa en una gran variedad de instrumentos como sintetizadores, cajas de ritmos y ordenadores, ninguno siendo universalmente dominante.")
        ),
        BilingualQuestion(
            id = 11769, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument a été inventé par Adolphe Sax?", listOf("Saxophone", "Trombone", "Clarinette", "Hautbois"), "Culture", "Adolphe Sax, facteur d'instruments belge, a breveté le saxophone en 1846. Il cherchait à créer un instrument à vent à anche simple combinant la puissance des cuivres et la souplesse des bois."),
            en = LocalizedContent("Which instrument was invented by Adolphe Sax?", listOf("Saxophone", "Trombone", "Clarinet", "Oboe"), "Culture", "Adolphe Sax, a Belgian instrument maker, patented the saxophone in 1846. He sought to create a single-reed wind instrument combining the power of brass and the flexibility of woodwinds."),
            zh = LocalizedContent("哪种乐器由阿道夫·萨克斯发明？", listOf("萨克斯管", "长号", "单簧管", "双簧管"), "文化", "比利时乐器制造家阿道夫·萨克斯于1846年为萨克斯管申请了专利。他试图创造一种单簧片管乐器，结合铜管的力度和木管的灵活性。"),
            es = LocalizedContent("¿Qué instrumento fue inventado por Adolphe Sax?", listOf("Saxofón", "Trombón", "Clarinete", "Oboe"), "Cultura", "Adolphe Sax, fabricante de instrumentos belga, patentó el saxofón en 1846. Buscaba crear un instrumento de viento de lengüeta simple que combinara la potencia de los metales y la flexibilidad de las maderas.")
        ),
        BilingualQuestion(
            id = 11770, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument est la base de la musique baroque?", listOf("Clavecin", "Piano", "Clavicorde", "Orgue"), "Culture", "Le clavecin était l'instrument roi de la période baroque (XVIIe-XVIIIe siècles), servant de base harmonique et rythmique dans la musique d'ensemble, notamment dans la basse continue."),
            en = LocalizedContent("Which instrument is the basis of Baroque music?", listOf("Harpsichord", "Piano", "Clavichord", "Organ"), "Culture", "The harpsichord was the king of instruments during the Baroque period (17th-18th centuries), serving as the harmonic and rhythmic foundation in ensemble music, especially in the basso continuo."),
            zh = LocalizedContent("哪种乐器是巴洛克音乐的基础？", listOf("羽管键琴", "钢琴", "击弦古钢琴", "管风琴"), "文化", "羽管键琴是巴洛克时期（17-18世纪）的乐器之王，在合奏音乐中作为和声与节奏基础，尤其在通奏低音中发挥重要作用。"),
            es = LocalizedContent("¿Qué instrumento es la base de la música barroca?", listOf("Clavecín", "Piano", "Clavicordio", "Órgano"), "Cultura", "El clavecín fue el instrumento rey del período barroco (siglos XVII-XVIII), sirviendo como base armónica y rítmica en la música de conjunto, especialmente en el bajo continuo.")
        ),
        BilingualQuestion(
            id = 11771, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit \"Les Quatre Saisons\"?", listOf("Antonio Vivaldi", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johann Sebastian Bach"), "Culture", "Antonio Vivaldi, compositeur baroque italien, a composé ce célèbre cycle de quatre concertos pour violon en 1723, chacun représentant une saison de l'année."),
            en = LocalizedContent("Which composer wrote \"The Four Seasons\"?", listOf("Antonio Vivaldi", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johann Sebastian Bach"), "Culture", "Antonio Vivaldi, an Italian Baroque composer, composed this famous cycle of four violin concertos in 1723, each representing a season of the year."),
            zh = LocalizedContent("哪位作曲家创作了《四季》？", listOf("安东尼奥·维瓦尔第", "路德维希·范·贝多芬", "沃尔夫冈·阿马德乌斯·莫扎特", "约翰·塞巴斯蒂安·巴赫"), "文化", "意大利巴洛克作曲家安东尼奥·维瓦尔第于1723年创作了这部著名的小提琴协奏曲套曲，每首代表一个季节。"),
            es = LocalizedContent("¿Qué compositor escribió \"Las cuatro estaciones\"?", listOf("Antonio Vivaldi", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johann Sebastian Bach"), "Cultura", "Antonio Vivaldi, compositor barroco italiano, compuso este famoso ciclo de cuatro conciertos para violín en 1723, cada uno representando una estación del año.")
        ),
        BilingualQuestion(
            id = 11772, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Les Quatre Saisons\" a-t-il été composé?", listOf("1725", "1720", "1730", "1735"), "Culture", "Antonio Vivaldi composa \"Les Quatre Saisons\" en 1723, mais l'œuvre fut publiée en 1725 dans le recueil \"Il cimento dell'armonia e dell'inventione\"."),
            en = LocalizedContent("In which year was \"The Four Seasons\" composed?", listOf("1725", "1720", "1730", "1735"), "Culture", "Antonio Vivaldi composed \"The Four Seasons\" in 1723, but the work was published in 1725 in the collection \"Il cimento dell'armonia e dell'inventione\"."),
            zh = LocalizedContent("《四季》创作于哪一年？", listOf("1725", "1720", "1730", "1735"), "文化", "安东尼奥·维瓦尔第于1723年创作了《四季》，但这部作品于1725年出版，收录在《和声与创意之争》曲集中。"),
            es = LocalizedContent("¿En qué año se compuso \"Las cuatro estaciones\"?", listOf("1725", "1720", "1730", "1735"), "Cultura", "Antonio Vivaldi compuso \"Las cuatro estaciones\" en 1723, pero la obra se publicó en 1725 en la colección \"Il cimento dell'armonia e dell'inventione\".")
        ),
        BilingualQuestion(
            id = 11773, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit la \"Symphonie n°9\"?", listOf("Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Joseph Haydn", "Franz Schubert"), "Culture", "La Neuvième Symphonie de Beethoven, achevée en 1824, est célèbre pour son finale avec chœur sur l'« Ode à la joie » de Schiller."),
            en = LocalizedContent("Which composer wrote the \"Symphony No. 9\"?", listOf("Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Joseph Haydn", "Franz Schubert"), "Culture", "Beethoven's Ninth Symphony, completed in 1824, is famous for its finale with chorus on Schiller's \"Ode to Joy\"."),
            zh = LocalizedContent("哪位作曲家创作了《第九交响曲》？", listOf("路德维希·范·贝多芬", "沃尔夫冈·阿马德乌斯·莫扎特", "约瑟夫·海顿", "弗朗茨·舒伯特"), "文化", "贝多芬的《第九交响曲》完成于1824年，以其合唱终乐章《欢乐颂》（席勒诗作）而闻名。"),
            es = LocalizedContent("¿Qué compositor escribió la \"Sinfonía n.º 9\"?", listOf("Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Joseph Haydn", "Franz Schubert"), "Cultura", "La Novena Sinfonía de Beethoven, completada en 1824, es famosa por su final con coro sobre la \"Oda a la alegría\" de Schiller.")
        ),
        BilingualQuestion(
            id = 11774, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit \"Eine kleine Nachtmusik\"?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Joseph Haydn", "Franz Schubert"), "Culture", "Mozart a composé cette sérénade en 1787 à Vienne. Le titre signifie \"une petite musique de nuit\" en allemand."),
            en = LocalizedContent("Which composer wrote \"Eine kleine Nachtmusik\"?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Joseph Haydn", "Franz Schubert"), "Culture", "Mozart composed this serenade in 1787 in Vienna. The title means \"a little night music\" in German."),
            zh = LocalizedContent("哪位作曲家创作了《G大调弦乐小夜曲》？", listOf("沃尔夫冈·阿马德乌斯·莫扎特", "路德维希·范·贝多芬", "约瑟夫·海顿", "弗朗茨·舒伯特"), "文化", "莫扎特于1787年在维也纳创作了这首小夜曲。标题在德语中意为“一首小小的夜曲”。"),
            es = LocalizedContent("¿Qué compositor escribió \"Eine kleine Nachtmusik\"?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Joseph Haydn", "Franz Schubert"), "Cultura", "Mozart compuso esta serenata en 1787 en Viena. El título significa \"una pequeña música nocturna\" en alemán.")
        ),
        BilingualQuestion(
            id = 11775, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"L'Art de la Fugue\"?", listOf("Johann Sebastian Bach", "George Frideric Handel", "Antonio Vivaldi", "Arcangelo Corelli"), "Culture", "Johann Sebastian Bach a composé L'Art de la Fugue dans les années 1740, une œuvre inachevée qui explore de manière exhaustive les possibilités de la fugue, un contrepoint complexe."),
            en = LocalizedContent("Which composer wrote \"The Art of Fugue\"?", listOf("Johann Sebastian Bach", "George Frideric Handel", "Antonio Vivaldi", "Arcangelo Corelli"), "Culture", "Johann Sebastian Bach composed The Art of Fugue in the 1740s, an unfinished work that exhaustively explores the possibilities of fugue, a complex contrapuntal form."),
            zh = LocalizedContent("哪位作曲家创作了《赋格的艺术》？", listOf("约翰·塞巴斯蒂安·巴赫", "乔治·弗里德里希·亨德尔", "安东尼奥·维瓦尔第", "阿尔坎杰罗·科雷利"), "文化", "约翰·塞巴斯蒂安·巴赫在18世纪40年代创作了《赋格的艺术》，这是一部未完成的作品，全面探索了赋格这种复杂对位形式的可能性。"),
            es = LocalizedContent("¿Qué compositor escribió \"El arte de la fuga\"?", listOf("Johann Sebastian Bach", "George Frideric Handel", "Antonio Vivaldi", "Arcangelo Corelli"), "Cultura", "Johann Sebastian Bach compuso El arte de la fuga en la década de 1740, una obra inacabada que explora exhaustivamente las posibilidades de la fuga, una forma contrapuntística compleja.")
        ),
        BilingualQuestion(
            id = 11776, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Carmina Burana\"?", listOf("Carl Orff", "Gustav Holst", "Edward Elgar", "Ralph Vaughan Williams"), "Culture", "Carl Orff a composé Carmina Burana en 1937, une cantate scénique basée sur des poèmes médiévaux découverts dans un manuscrit bavarois."),
            en = LocalizedContent("Which composer wrote \"Carmina Burana\"?", listOf("Carl Orff", "Gustav Holst", "Edward Elgar", "Ralph Vaughan Williams"), "Culture", "Carl Orff composed Carmina Burana in 1937, a scenic cantata based on medieval poems discovered in a Bavarian manuscript."),
            zh = LocalizedContent("哪位作曲家创作了《布兰诗歌》？", listOf("卡尔·奥尔夫", "古斯塔夫·霍尔斯特", "爱德华·埃尔加", "拉尔夫·沃恩·威廉斯"), "文化", "卡尔·奥尔夫于1937年创作了《布兰诗歌》，这是一部基于巴伐利亚手稿中发现的中世纪诗歌的舞台康塔塔。"),
            es = LocalizedContent("¿Qué compositor escribió \"Carmina Burana\"?", listOf("Carl Orff", "Gustav Holst", "Edward Elgar", "Ralph Vaughan Williams"), "Cultura", "Carl Orff compuso Carmina Burana en 1937, una cantata escénica basada en poemas medievales descubiertos en un manuscrito bávaro.")
        ),
        BilingualQuestion(
            id = 11777, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"La Marche des Toreadors\"?", listOf("Georges Bizet", "Gioachino Rossini", "Giuseppe Verdi", "Giacomo Puccini"), "Culture", "Georges Bizet a composé \"La Marche des Toreadors\" pour son opéra \"Carmen\", créé en 1875. Ce morceau célèbre accompagne l'entrée des toreros dans l'arène."),
            en = LocalizedContent("Which composer wrote \"The March of the Toreadors\"?", listOf("Georges Bizet", "Gioachino Rossini", "Giuseppe Verdi", "Giacomo Puccini"), "Culture", "Georges Bizet composed \"The March of the Toreadors\" for his opera \"Carmen\", premiered in 1875. This famous piece accompanies the entrance of the bullfighters into the arena."),
            zh = LocalizedContent("哪位作曲家创作了《斗牛士进行曲》？", listOf("乔治·比才", "焦阿基诺·罗西尼", "朱塞佩·威尔第", "贾科莫·普契尼"), "文化", "乔治·比才为他的歌剧《卡门》创作了《斗牛士进行曲》，该剧于1875年首演。这首著名的乐曲伴随着斗牛士进入竞技场。"),
            es = LocalizedContent("¿Qué compositor escribió \"La marcha de los toreadores\"?", listOf("Georges Bizet", "Gioachino Rossini", "Giuseppe Verdi", "Giacomo Puccini"), "Cultura", "Georges Bizet compuso \"La marcha de los toreadores\" para su ópera \"Carmen\", estrenada en 1875. Esta famosa pieza acompaña la entrada de los toreros en la arena.")
        ),
        BilingualQuestion(
            id = 11778, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit \"Clair de Lune\"?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Culture", "Clair de lune est le troisième mouvement de la Suite bergamasque de Claude Debussy, composée en 1890 et publiée en 1905."),
            en = LocalizedContent("Which composer wrote \"Clair de Lune\"?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Culture", "Clair de lune is the third movement of Claude Debussy's Suite bergamasque, composed in 1890 and published in 1905."),
            zh = LocalizedContent("哪位作曲家创作了《月光》？", listOf("克洛德·德彪西", "莫里斯·拉威尔", "埃里克·萨蒂", "加布里埃尔·福雷"), "文化", "《月光》是克洛德·德彪西《贝加莫组曲》的第三乐章，创作于1890年，出版于1905年。"),
            es = LocalizedContent("¿Qué compositor escribió \"Claro de luna\"?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Cultura", "Claro de luna es el tercer movimiento de la Suite bergamasque de Claude Debussy, compuesta en 1890 y publicada en 1905.")
        ),
        BilingualQuestion(
            id = 11779, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"La Mer\"?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Culture", "Claude Debussy a composé \"La Mer\" entre 1903 et 1905, une œuvre orchestrale majeure du mouvement impressionniste en musique."),
            en = LocalizedContent("Which composer wrote \"La Mer\"?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Culture", "Claude Debussy composed \"La Mer\" between 1903 and 1905, a major orchestral work of the Impressionist movement in music."),
            zh = LocalizedContent("哪位作曲家创作了《大海》？", listOf("克洛德·德彪西", "莫里斯·拉威尔", "埃里克·萨蒂", "加布里埃尔·福雷"), "文化", "克洛德·德彪西于1903年至1905年间创作了《大海》，这是音乐印象主义运动的一部重要管弦乐作品。"),
            es = LocalizedContent("¿Qué compositor escribió \"La mer\"?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Cultura", "Claude Debussy compuso \"La mer\" entre 1903 y 1905, una obra orquestal importante del movimiento impresionista en la música.")
        ),
        BilingualQuestion(
            id = 11780, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit \"Bolero\"?", listOf("Maurice Ravel", "Claude Debussy", "Erik Satie", "Gabriel Fauré"), "Culture", "Maurice Ravel a composé le Boléro en 1928 pour un ballet commandé par Ida Rubinstein. C'est l'une de ses œuvres les plus célèbres, connue pour son unique thème répété et crescendo orchestral."),
            en = LocalizedContent("Which composer wrote \"Bolero\"?", listOf("Maurice Ravel", "Claude Debussy", "Erik Satie", "Gabriel Fauré"), "Culture", "Maurice Ravel composed Boléro in 1928 for a ballet commissioned by Ida Rubinstein. It is one of his most famous works, known for its single repeated theme and orchestral crescendo."),
            zh = LocalizedContent("哪位作曲家创作了《波莱罗》？", listOf("莫里斯·拉威尔", "克劳德·德彪西", "埃里克·萨蒂", "加布里埃尔·福雷"), "文化", "莫里斯·拉威尔于1928年为伊达·鲁宾斯坦委托的芭蕾舞剧创作了《波莱罗》。这是他最著名的作品之一，以其单一重复的主题和管弦乐渐强而闻名。"),
            es = LocalizedContent("¿Qué compositor escribió \"Bolero\"?", listOf("Maurice Ravel", "Claude Debussy", "Erik Satie", "Gabriel Fauré"), "Cultura", "Maurice Ravel compuso el Bolero en 1928 para un ballet encargado por Ida Rubinstein. Es una de sus obras más famosas, conocida por su único tema repetido y crescendo orquestal.")
        ),
        BilingualQuestion(
            id = 11781, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Gymnopédie\"?", listOf("Erik Satie", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Erik Satie a composé les trois Gymnopédies pour piano entre 1888 et 1895, des pièces au style minimaliste et mélancolique qui ont marqué la musique française."),
            en = LocalizedContent("Which composer wrote \"Gymnopédie\"?", listOf("Erik Satie", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Erik Satie composed the three Gymnopédies for piano between 1888 and 1895, pieces with a minimalist and melancholic style that marked French music."),
            zh = LocalizedContent("哪位作曲家创作了《裸体歌舞》？", listOf("埃里克·萨蒂", "克劳德·德彪西", "莫里斯·拉威尔", "加布里埃尔·福雷"), "文化", "埃里克·萨蒂在1888年至1895年间创作了三首钢琴《裸体歌舞》，这些作品以极简主义和忧郁的风格标志着法国音乐。"),
            es = LocalizedContent("¿Qué compositor escribió \"Gymnopédie\"?", listOf("Erik Satie", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Cultura", "Erik Satie compuso las tres Gymnopédies para piano entre 1888 y 1895, piezas de estilo minimalista y melancólico que marcaron la música francesa.")
        ),
        BilingualQuestion(
            id = 11782, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit \"Casse-Noisette\"?", listOf("Piotr Ilitch Tchaïkovski", "Sergei Prokofiev", "Anatoly Lyadov", "Modest Mussorgski"), "Culture", "Tchaïkovski a composé \"Casse-Noisette\" en 1892, un ballet en deux actes basé sur un conte d'Alexandre Dumas. C'est l'une de ses œuvres les plus célèbres, souvent jouée pendant la période de Noël."),
            en = LocalizedContent("Which composer wrote \"The Nutcracker\"?", listOf("Pyotr Ilyich Tchaikovsky", "Sergei Prokofiev", "Anatoly Lyadov", "Modest Mussorgsky"), "Culture", "Tchaikovsky composed \"The Nutcracker\" in 1892, a two-act ballet based on a tale by Alexandre Dumas. It is one of his most famous works, often performed during the Christmas season."),
            zh = LocalizedContent("哪位作曲家创作了《胡桃夹子》？", listOf("彼得·伊里奇·柴可夫斯基", "谢尔盖·普罗科菲耶夫", "阿纳托利·利亚多夫", "莫杰斯特·穆索尔斯基"), "文化", "柴可夫斯基于1892年创作了《胡桃夹子》，这是一部基于大仲马童话的两幕芭蕾舞剧。这是他最著名的作品之一，常在圣诞节期间演出。"),
            es = LocalizedContent("¿Qué compositor escribió \"El cascanueces\"?", listOf("Piotr Ilich Chaikovski", "Serguéi Prokófiev", "Anatoli Liádov", "Modest Músorgski"), "Cultura", "Chaikovski compuso \"El cascanueces\" en 1892, un ballet en dos actos basado en un cuento de Alejandro Dumas. Es una de sus obras más famosas, a menudo interpretada durante la temporada navideña.")
        ),
        BilingualQuestion(
            id = 11783, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit \"Lac des Cygnes\"?", listOf("Piotr Ilitch Tchaïkovski", "Sergei Prokofiev", "Anatoly Lyadov", "Modest Mussorgski"), "Culture", "Tchaïkovski a composé \"Le Lac des Cygnes\" en 1875-1876, sur commande du Théâtre Bolchoï. C'est l'un des ballets les plus célèbres du répertoire classique."),
            en = LocalizedContent("Which composer wrote \"Swan Lake\"?", listOf("Pyotr Ilyich Tchaikovsky", "Sergei Prokofiev", "Anatoly Lyadov", "Modest Mussorgsky"), "Culture", "Tchaikovsky composed \"Swan Lake\" in 1875-1876, commissioned by the Bolshoi Theatre. It is one of the most famous ballets in the classical repertoire."),
            zh = LocalizedContent("哪位作曲家创作了《天鹅湖》？", listOf("彼得·伊里奇·柴可夫斯基", "谢尔盖·普罗科菲耶夫", "阿纳托利·利亚多夫", "莫杰斯特·穆索尔斯基"), "文化", "柴可夫斯基于1875-1876年受莫斯科大剧院委托创作了《天鹅湖》。这是古典剧目中最著名的芭蕾舞剧之一。"),
            es = LocalizedContent("¿Qué compositor escribió \"El lago de los cisnes\"?", listOf("Piotr Ilich Chaikovski", "Serguéi Prokófiev", "Anatoli Liádov", "Modest Músorgski"), "Cultura", "Chaikovski compuso \"El lago de los cisnes\" en 1875-1876, por encargo del Teatro Bolshói. Es uno de los ballets más famosos del repertorio clásico.")
        ),
        BilingualQuestion(
            id = 11784, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"La Damnation de Faust\"?", listOf("Hector Berlioz", "Georges Bizet", "Gioachino Rossini", "Giuseppe Verdi"), "Culture", "Berlioz composa cette \"légende dramatique\" en 1846, inspiré par la traduction de Gérard de Nerval du Faust de Goethe."),
            en = LocalizedContent("Which composer wrote \"The Damnation of Faust\"?", listOf("Hector Berlioz", "Georges Bizet", "Gioachino Rossini", "Giuseppe Verdi"), "Culture", "Berlioz composed this \"dramatic legend\" in 1846, inspired by Gérard de Nerval's translation of Goethe's Faust."),
            zh = LocalizedContent("哪位作曲家创作了《浮士德的惩罚》？", listOf("埃克托·柏辽兹", "乔治·比才", "焦阿基诺·罗西尼", "朱塞佩·威尔第"), "文化", "柏辽兹于1846年创作了这部“戏剧传奇”，灵感来自热拉尔·德·内瓦尔翻译的歌德《浮士德》。"),
            es = LocalizedContent("¿Qué compositor escribió \"La condenación de Fausto\"?", listOf("Héctor Berlioz", "Georges Bizet", "Gioachino Rossini", "Giuseppe Verdi"), "Cultura", "Berlioz compuso esta \"leyenda dramática\" en 1846, inspirado por la traducción de Gérard de Nerval del Fausto de Goethe.")
        ),
        BilingualQuestion(
            id = 11785, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Opéra de Quat'Sous\" (Die Dreigroschenoper)?", listOf("Kurt Weill", "George Gershwin", "Aaron Copland", "Leonard Bernstein"), "Culture", "Kurt Weill a composé cet opéra en 1928 avec des textes de Bertolt Brecht, une œuvre majeure du théâtre musical allemand."),
            en = LocalizedContent("Which composer wrote \"The Threepenny Opera\" (Die Dreigroschenoper)?", listOf("Kurt Weill", "George Gershwin", "Aaron Copland", "Leonard Bernstein"), "Culture", "Kurt Weill composed this opera in 1928 with texts by Bertolt Brecht, a major work of German musical theater."),
            zh = LocalizedContent("哪位作曲家创作了《三便士歌剧》？", listOf("库尔特·魏尔", "乔治·格什温", "阿隆·科普兰", "伦纳德·伯恩斯坦"), "文化", "库尔特·魏尔于1928年与贝尔托·布莱希特合作创作了这部歌剧，是德国音乐剧的重要作品。"),
            es = LocalizedContent("¿Qué compositor escribió \"La ópera de los tres centavos\" (Die Dreigroschenoper)?", listOf("Kurt Weill", "George Gershwin", "Aaron Copland", "Leonard Bernstein"), "Cultura", "Kurt Weill compuso esta ópera en 1928 con textos de Bertolt Brecht, una obra importante del teatro musical alemán.")
        ),
        BilingualQuestion(
            id = 11786, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Rhapsody in Blue\"?", listOf("George Gershwin", "Aaron Copland", "Leonard Bernstein", "Samuel Barber"), "Culture", "George Gershwin a composé Rhapsody in Blue en 1924, mêlant musique classique et jazz dans une œuvre commandée par le chef d'orchestre Paul Whiteman."),
            en = LocalizedContent("Which composer wrote \"Rhapsody in Blue\"?", listOf("George Gershwin", "Aaron Copland", "Leonard Bernstein", "Samuel Barber"), "Culture", "George Gershwin composed Rhapsody in Blue in 1924, blending classical music and jazz in a work commissioned by conductor Paul Whiteman."),
            zh = LocalizedContent("哪位作曲家创作了《蓝色狂想曲》？", listOf("乔治·格什温", "阿隆·科普兰", "伦纳德·伯恩斯坦", "塞缪尔·巴伯"), "文化", "乔治·格什温于1924年创作了《蓝色狂想曲》，将古典音乐与爵士乐融合，受指挥家保罗·怀特曼委托。"),
            es = LocalizedContent("¿Qué compositor escribió \"Rhapsody in Blue\"?", listOf("George Gershwin", "Aaron Copland", "Leonard Bernstein", "Samuel Barber"), "Cultura", "George Gershwin compuso Rhapsody in Blue en 1924, fusionando música clásica y jazz en una obra encargada por el director Paul Whiteman.")
        ),
        BilingualQuestion(
            id = 11787, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Appalachian Spring\"?", listOf("Aaron Copland", "George Gershwin", "Leonard Bernstein", "Samuel Barber"), "Culture", "Aaron Copland a composé Appalachian Spring en 1944 pour un ballet de Martha Graham, remportant le prix Pulitzer de musique en 1945."),
            en = LocalizedContent("Which composer wrote \"Appalachian Spring\"?", listOf("Aaron Copland", "George Gershwin", "Leonard Bernstein", "Samuel Barber"), "Culture", "Aaron Copland composed Appalachian Spring in 1944 for a ballet by Martha Graham, winning the Pulitzer Prize for Music in 1945."),
            zh = LocalizedContent("哪位作曲家创作了《阿巴拉契亚之春》？", listOf("阿隆·科普兰", "乔治·格什温", "伦纳德·伯恩斯坦", "塞缪尔·巴伯"), "文化", "阿隆·科普兰于1944年为玛莎·格雷厄姆的芭蕾舞剧创作了《阿巴拉契亚之春》，并于1945年获得普利策音乐奖。"),
            es = LocalizedContent("¿Qué compositor escribió \"Appalachian Spring\"?", listOf("Aaron Copland", "George Gershwin", "Leonard Bernstein", "Samuel Barber"), "Cultura", "Aaron Copland compuso Appalachian Spring en 1944 para un ballet de Martha Graham, ganando el Premio Pulitzer de Música en 1945.")
        ),
        BilingualQuestion(
            id = 11788, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"The Planets\"?", listOf("Gustav Holst", "Edward Elgar", "Ralph Vaughan Williams", "William Walton"), "Culture", "Gustav Holst a composé cette suite orchestrale entre 1914 et 1916, chaque mouvement représentant une planète du système solaire et son caractère astrologique."),
            en = LocalizedContent("Which composer wrote \"The Planets\"?", listOf("Gustav Holst", "Edward Elgar", "Ralph Vaughan Williams", "William Walton"), "Culture", "Gustav Holst composed this orchestral suite between 1914 and 1916, each movement representing a planet of the solar system and its astrological character."),
            zh = LocalizedContent("哪位作曲家创作了《行星》？", listOf("古斯塔夫·霍尔斯特", "爱德华·埃尔加", "拉尔夫·沃恩·威廉斯", "威廉·沃尔顿"), "文化", "古斯塔夫·霍尔斯特于1914年至1916年间创作了这部管弦乐组曲，每个乐章代表太阳系的一颗行星及其占星学特征。"),
            es = LocalizedContent("¿Qué compositor escribió \"Los planetas\"?", listOf("Gustav Holst", "Edward Elgar", "Ralph Vaughan Williams", "William Walton"), "Cultura", "Gustav Holst compuso esta suite orquestal entre 1914 y 1916, cada movimiento representa un planeta del sistema solar y su carácter astrológico.")
        ),
        BilingualQuestion(
            id = 11789, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"La Cavalcade des Heures\"?", listOf("Giuseppe Ponchielli", "Gioachino Rossini", "Georges Bizet", "Giuseppe Verdi"), "Culture", "Giuseppe Ponchielli composa \"La Cavalcade des Heures\" pour son opéra \"La Gioconda\" (1876). Ce ballet orchestral, souvent joué séparément, illustre la lutte entre le jour et la nuit."),
            en = LocalizedContent("Which composer wrote \"Dance of the Hours\"?", listOf("Giuseppe Ponchielli", "Gioachino Rossini", "Georges Bizet", "Giuseppe Verdi"), "Culture", "Giuseppe Ponchielli composed \"Dance of the Hours\" for his opera \"La Gioconda\" (1876). This orchestral ballet, often performed separately, illustrates the struggle between day and night."),
            zh = LocalizedContent("哪位作曲家创作了《时辰之舞》？", listOf("朱塞佩·蓬基耶利", "焦阿基诺·罗西尼", "乔治·比才", "朱塞佩·威尔第"), "文化", "朱塞佩·蓬基耶利为他的歌剧《歌女乔康达》（1876年）创作了《时辰之舞》。这段管弦乐芭蕾常被单独演出，描绘了白天与黑夜的斗争。"),
            es = LocalizedContent("¿Qué compositor escribió \"La danza de las horas\"?", listOf("Giuseppe Ponchielli", "Gioachino Rossini", "Georges Bizet", "Giuseppe Verdi"), "Cultura", "Giuseppe Ponchielli compuso \"La danza de las horas\" para su ópera \"La Gioconda\" (1876). Este ballet orquestal, a menudo interpretado por separado, ilustra la lucha entre el día y la noche.")
        ),
        BilingualQuestion(
            id = 11790, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Peer Gynt\"?", listOf("Edvard Grieg", "Niels W. Gade", "Ole Bull", "Johan Halvorsen"), "Culture", "Edvard Grieg a composé la musique de scène pour la pièce de théâtre \"Peer Gynt\" d'Henrik Ibsen en 1875, dont sont tirées les célèbres suites orchestrales."),
            en = LocalizedContent("Which composer wrote \"Peer Gynt\"?", listOf("Edvard Grieg", "Niels W. Gade", "Ole Bull", "Johan Halvorsen"), "Culture", "Edvard Grieg composed the incidental music for Henrik Ibsen's play \"Peer Gynt\" in 1875, from which the famous orchestral suites are derived."),
            zh = LocalizedContent("哪位作曲家创作了《培尔·金特》？", listOf("爱德华·格里格", "尼尔斯·W·加德", "奥勒·布尔", "约翰·哈尔沃森"), "文化", "爱德华·格里格于1875年为亨利克·易卜生的戏剧《培尔·金特》创作了配乐，著名的管弦乐组曲即源于此。"),
            es = LocalizedContent("¿Qué compositor escribió \"Peer Gynt\"?", listOf("Edvard Grieg", "Niels W. Gade", "Ole Bull", "Johan Halvorsen"), "Cultura", "Edvard Grieg compuso la música incidental para la obra teatral \"Peer Gynt\" de Henrik Ibsen en 1875, de la que se derivan las famosas suites orquestales.")
        ),
        BilingualQuestion(
            id = 11791, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de The Rolling Stones est le plus célèbre?", listOf("Let It Bleed", "(I Can't Get No) Satisfaction", "Some Girls", "Sticky Fingers"), "Culture", "Let It Bleed, sorti en 1969, est souvent considéré comme leur chef-d'œuvre et l'un des meilleurs albums de rock de l'histoire, contenant des classiques comme Gimme Shelter et You Can't Always Get What You Want."),
            en = LocalizedContent("Which album by The Rolling Stones is the most famous?", listOf("Let It Bleed", "(I Can't Get No) Satisfaction", "Some Girls", "Sticky Fingers"), "Culture", "Let It Bleed, released in 1969, is often considered their masterpiece and one of the greatest rock albums of all time, containing classics like Gimme Shelter and You Can't Always Get What You Want."),
            zh = LocalizedContent("滚石乐队哪张专辑最著名？", listOf("Let It Bleed", "(I Can't Get No) Satisfaction", "Some Girls", "Sticky Fingers"), "文化", "1969年发行的《Let It Bleed》常被视为他们的杰作，也是史上最伟大的摇滚专辑之一，收录了《Gimme Shelter》和《You Can't Always Get What You Want》等经典歌曲。"),
            es = LocalizedContent("¿Qué álbum de The Rolling Stones es el más famoso?", listOf("Let It Bleed", "(I Can't Get No) Satisfaction", "Some Girls", "Sticky Fingers"), "Cultura", "Let It Bleed, lanzado en 1969, a menudo se considera su obra maestra y uno de los mejores álbumes de rock de la historia, con clásicos como Gimme Shelter y You Can't Always Get What You Want.")
        ),
        BilingualQuestion(
            id = 11792, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"(I Can't Get No) Satisfaction\" a-t-il été publié?", listOf("1965", "1963", "1967", "1964"), "Culture", "Le single \"Satisfaction\" des Rolling Stones est sorti en 1965, devenant un immense succès international et l'un des hymnes rock les plus emblématiques de l'histoire."),
            en = LocalizedContent("In what year was \"(I Can't Get No) Satisfaction\" released?", listOf("1965", "1963", "1967", "1964"), "Culture", "The Rolling Stones' single \"Satisfaction\" was released in 1965, becoming a huge international success and one of the most iconic rock anthems in history."),
            zh = LocalizedContent("《(I Can't Get No) Satisfaction》于哪一年发行？", listOf("1965", "1963", "1967", "1964"), "文化", "滚石乐队的单曲《Satisfaction》于1965年发行，成为国际大热歌曲，也是历史上最具标志性的摇滚圣歌之一。"),
            es = LocalizedContent("¿En qué año se publicó \"(I Can't Get No) Satisfaction\"?", listOf("1965", "1963", "1967", "1964"), "Cultura", "El sencillo \"Satisfaction\" de los Rolling Stones se lanzó en 1965, convirtiéndose en un gran éxito internacional y uno de los himnos del rock más emblemáticos de la historia.")
        ),
        BilingualQuestion(
            id = 11793, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Led Zeppelin est le plus célèbre?", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "Led Zeppelin III"), "Culture", "Led Zeppelin IV, sorti en 1971, est l'album le plus vendu du groupe et contient leur morceau emblématique \"Stairway to Heaven\"."),
            en = LocalizedContent("Which album by Led Zeppelin is the most famous?", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "Led Zeppelin III"), "Culture", "Led Zeppelin IV, released in 1971, is the band's best-selling album and contains their iconic track \"Stairway to Heaven\"."),
            zh = LocalizedContent("齐柏林飞艇乐队哪张专辑最著名？", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "Led Zeppelin III"), "文化", "1971年发行的《Led Zeppelin IV》是乐队最畅销的专辑，收录了他们的标志性曲目《Stairway to Heaven》。"),
            es = LocalizedContent("¿Qué álbum de Led Zeppelin es el más famoso?", listOf("Led Zeppelin IV", "Physical Graffiti", "Houses of the Holy", "Led Zeppelin III"), "Cultura", "Led Zeppelin IV, lanzado en 1971, es el álbum más vendido de la banda y contiene su emblemática canción \"Stairway to Heaven\".")
        ),
        BilingualQuestion(
            id = 11794, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Stairway to Heaven\" a-t-il été publié?", listOf("1971", "1969", "1973", "1970"), "Culture", "Stairway to Heaven, du groupe Led Zeppelin, est sorti sur l'album Led Zeppelin IV en novembre 1971."),
            en = LocalizedContent("In what year was \"Stairway to Heaven\" released?", listOf("1971", "1969", "1973", "1970"), "Culture", "Stairway to Heaven, by Led Zeppelin, was released on the album Led Zeppelin IV in November 1971."),
            zh = LocalizedContent("《Stairway to Heaven》于哪一年发行？", listOf("1971", "1969", "1973", "1970"), "文化", "齐柏林飞艇乐队的《Stairway to Heaven》于1971年11月收录在专辑《Led Zeppelin IV》中发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Stairway to Heaven\"?", listOf("1971", "1969", "1973", "1970"), "Cultura", "Stairway to Heaven, de Led Zeppelin, se lanzó en el álbum Led Zeppelin IV en noviembre de 1971.")
        ),
        BilingualQuestion(
            id = 11795, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le guitariste de Led Zeppelin?", listOf("Jimmy Page", "Robert Plant", "John Paul Jones", "John Bonham"), "Culture", "Jimmy Page est le guitariste et fondateur de Led Zeppelin, ayant composé la plupart de leurs morceaux emblématiques comme \"Stairway to Heaven\"."),
            en = LocalizedContent("Who is the guitarist of Led Zeppelin?", listOf("Jimmy Page", "Robert Plant", "John Paul Jones", "John Bonham"), "Culture", "Jimmy Page is the guitarist and founder of Led Zeppelin, having composed most of their iconic tracks like \"Stairway to Heaven\"."),
            zh = LocalizedContent("齐柏林飞艇乐队的吉他手是谁？", listOf("吉米·佩奇", "罗伯特·普兰特", "约翰·保罗·琼斯", "约翰·博纳姆"), "文化", "吉米·佩奇是齐柏林飞艇乐队的吉他手和创始人，创作了《Stairway to Heaven》等大部分标志性曲目。"),
            es = LocalizedContent("¿Quién es el guitarrista de Led Zeppelin?", listOf("Jimmy Page", "Robert Plant", "John Paul Jones", "John Bonham"), "Cultura", "Jimmy Page es el guitarrista y fundador de Led Zeppelin, habiendo compuesto la mayoría de sus temas emblemáticos como \"Stairway to Heaven\".")
        ),
        BilingualQuestion(
            id = 11796, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel album de Pink Floyd est le plus célèbre?", listOf("The Wall", "The Dark Side of the Moon", "Wish You Were Here", "Animals"), "Culture", "The Wall est l'album le plus vendu de Pink Floyd avec plus de 30 millions d'exemplaires, et son succès est renforcé par le film et les concerts spectaculaires qui l'accompagnent."),
            en = LocalizedContent("Which album by Pink Floyd is the most famous?", listOf("The Wall", "The Dark Side of the Moon", "Wish You Were Here", "Animals"), "Culture", "The Wall is Pink Floyd's best-selling album with over 30 million copies, and its success is reinforced by the film and spectacular concerts that accompany it."),
            zh = LocalizedContent("平克·弗洛伊德哪张专辑最著名？", listOf("The Wall", "The Dark Side of the Moon", "Wish You Were Here", "Animals"), "文化", "《The Wall》是平克·弗洛伊德最畅销的专辑，销量超过3000万张，其成功还因伴随的电影和壮观演唱会而得到加强。"),
            es = LocalizedContent("¿Qué álbum de Pink Floyd es el más famoso?", listOf("The Wall", "The Dark Side of the Moon", "Wish You Were Here", "Animals"), "Cultura", "The Wall es el álbum más vendido de Pink Floyd con más de 30 millones de copias, y su éxito se ve reforzado por la película y los espectaculares conciertos que lo acompañan.")
        ),
        BilingualQuestion(
            id = 11797, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"The Wall\" a-t-il été publié?", listOf("1979", "1977", "1981", "1978"), "Culture", "\"The Wall\" est le onzième album studio du groupe de rock britannique Pink Floyd, sorti le 30 novembre 1979."),
            en = LocalizedContent("In what year was \"The Wall\" released?", listOf("1979", "1977", "1981", "1978"), "Culture", "\"The Wall\" is the eleventh studio album by the British rock band Pink Floyd, released on November 30, 1979."),
            zh = LocalizedContent("《The Wall》于哪一年发行？", listOf("1979", "1977", "1981", "1978"), "文化", "《The Wall》是英国摇滚乐队平克·弗洛伊德的第十一张录音室专辑，于1979年11月30日发行。"),
            es = LocalizedContent("¿En qué año se publicó \"The Wall\"?", listOf("1979", "1977", "1981", "1978"), "Cultura", "\"The Wall\" es el undécimo álbum de estudio de la banda británica de rock Pink Floyd, lanzado el 30 de noviembre de 1979.")
        ),
        BilingualQuestion(
            id = 11798, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le chanteur de Pink Floyd?", listOf("Roger Waters", "David Gilmour", "Syd Barrett", "Nick Mason"), "Culture", "Roger Waters était le bassiste et principal parolier de Pink Floyd, notamment sur des albums concept comme The Wall."),
            en = LocalizedContent("Who is the singer of Pink Floyd?", listOf("Roger Waters", "David Gilmour", "Syd Barrett", "Nick Mason"), "Culture", "Roger Waters was the bassist and primary lyricist of Pink Floyd, notably on concept albums like The Wall."),
            zh = LocalizedContent("平克·弗洛伊德的主唱是谁？", listOf("罗杰·沃特斯", "大卫·吉尔摩", "西德·巴雷特", "尼克·梅森"), "文化", "罗杰·沃特斯是平克·弗洛伊德的贝斯手和主要词作者，尤其在《The Wall》等概念专辑中。"),
            es = LocalizedContent("¿Quién es el cantante de Pink Floyd?", listOf("Roger Waters", "David Gilmour", "Syd Barrett", "Nick Mason"), "Cultura", "Roger Waters fue el bajista y principal letrista de Pink Floyd, especialmente en álbumes conceptuales como The Wall.")
        ),
        BilingualQuestion(
            id = 11799, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Bohemian Rhapsody\" a-t-il été publié?", listOf("1975", "1973", "1977", "1974"), "Culture", "Bohemian Rhapsody, single du groupe Queen, est sorti en 1975 sur l'album A Night at the Opera."),
            en = LocalizedContent("In what year was \"Bohemian Rhapsody\" released?", listOf("1975", "1973", "1977", "1974"), "Culture", "Bohemian Rhapsody, a single by the band Queen, was released in 1975 on the album A Night at the Opera."),
            zh = LocalizedContent("《Bohemian Rhapsody》于哪一年发行？", listOf("1975", "1973", "1977", "1974"), "文化", "皇后乐队的单曲《Bohemian Rhapsody》于1975年收录在专辑《A Night at the Opera》中发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Bohemian Rhapsody\"?", listOf("1975", "1973", "1977", "1974"), "Cultura", "Bohemian Rhapsody, un sencillo de la banda Queen, se lanzó en 1975 en el álbum A Night at the Opera.")
        ),
        BilingualQuestion(
            id = 11800, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a interprété \"Bohemian Rhapsody\"?", listOf("Queen", "The Beatles", "Pink Floyd", "The Rolling Stones"), "Culture", "Queen, groupe de rock britannique formé en 1970, a sorti \"Bohemian Rhapsody\" en 1975 sur l'album \"A Night at the Opera\". La chanson est devenue l'un de leurs plus grands succès."),
            en = LocalizedContent("Which group performed \"Bohemian Rhapsody\"?", listOf("Queen", "The Beatles", "Pink Floyd", "The Rolling Stones"), "Culture", "Queen, a British rock band formed in 1970, released \"Bohemian Rhapsody\" in 1975 on the album \"A Night at the Opera\". The song became one of their greatest hits."),
            zh = LocalizedContent("哪个乐队演唱了《波西米亚狂想曲》？", listOf("皇后乐队", "披头士乐队", "平克·弗洛伊德", "滚石乐队"), "文化", "皇后乐队，1970年成立的英国摇滚乐队，于1975年在专辑《歌剧院之夜》中发行了《波西米亚狂想曲》。这首歌成为他们最伟大的热门歌曲之一。"),
            es = LocalizedContent("¿Qué grupo interpretó \"Bohemian Rhapsody\"?", listOf("Queen", "The Beatles", "Pink Floyd", "The Rolling Stones"), "Cultura", "Queen, grupo de rock británico formado en 1970, lanzó \"Bohemian Rhapsody\" en 1975 en el álbum \"A Night at the Opera\". La canción se convirtió en uno de sus mayores éxitos.")
        ),
        BilingualQuestion(
            id = 11801, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Another Brick in the Wall\" a-t-il été publié?", listOf("1979", "1977", "1981", "1978"), "Culture", "La chanson \"Another Brick in the Wall\" a été publiée en 1979 par le groupe Pink Floyd, extraite de leur album concept *The Wall*."),
            en = LocalizedContent("In what year was \"Another Brick in the Wall\" released?", listOf("1979", "1977", "1981", "1978"), "Culture", "The song \"Another Brick in the Wall\" was released in 1979 by the band Pink Floyd, taken from their concept album *The Wall*."),
            zh = LocalizedContent("《墙上的另一块砖》是哪一年发行的？", listOf("1979", "1977", "1981", "1978"), "文化", "歌曲《墙上的另一块砖》由平克·弗洛伊德乐队于1979年发行，出自他们的概念专辑《迷墙》。"),
            es = LocalizedContent("¿En qué año se publicó \"Another Brick in the Wall\"?", listOf("1979", "1977", "1981", "1978"), "Cultura", "La canción \"Another Brick in the Wall\" fue publicada en 1979 por el grupo Pink Floyd, extraída de su álbum conceptual *The Wall*.")
        ),
        BilingualQuestion(
            id = 11802, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a enregistré \"Come Together\"?", listOf("The Beatles", "The Rolling Stones", "Led Zeppelin", "Pink Floyd"), "Culture", "Come Together est une chanson des Beatles, sortie en 1969 sur l'album Abbey Road. Elle a été écrite par John Lennon."),
            en = LocalizedContent("Which group recorded \"Come Together\"?", listOf("The Beatles", "The Rolling Stones", "Led Zeppelin", "Pink Floyd"), "Culture", "\"Come Together\" is a song by The Beatles, released in 1969 on the album Abbey Road. It was written by John Lennon."),
            zh = LocalizedContent("哪个乐队录制了《一起来》？", listOf("披头士乐队", "滚石乐队", "齐柏林飞艇", "平克·弗洛伊德"), "文化", "《一起来》是披头士乐队的一首歌，于1969年在专辑《艾比路》中发行。由约翰·列侬创作。"),
            es = LocalizedContent("¿Qué grupo grabó \"Come Together\"?", listOf("The Beatles", "The Rolling Stones", "Led Zeppelin", "Pink Floyd"), "Cultura", "\"Come Together\" es una canción de The Beatles, lanzada en 1969 en el álbum Abbey Road. Fue escrita por John Lennon.")
        ),
        BilingualQuestion(
            id = 11803, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Come Together\" a-t-il été publié?", listOf("1969", "1967", "1971", "1970"), "Culture", "\"Come Together\" est une chanson des Beatles, sortie en 1969 sur l'album Abbey Road."),
            en = LocalizedContent("In what year was \"Come Together\" released?", listOf("1969", "1967", "1971", "1970"), "Culture", "\"Come Together\" is a song by The Beatles, released in 1969 on the album Abbey Road."),
            zh = LocalizedContent("《一起来》是哪一年发行的？", listOf("1969", "1967", "1971", "1970"), "文化", "《一起来》是披头士乐队的一首歌，于1969年在专辑《艾比路》中发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Come Together\"?", listOf("1969", "1967", "1971", "1970"), "Cultura", "\"Come Together\" es una canción de The Beatles, publicada en 1969 en el álbum Abbey Road.")
        ),
        BilingualQuestion(
            id = 11804, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de The Who est considéré comme un chef-d'œuvre?", listOf("Tommy", "Who's Next", "Quadrophenia", "The Who Sell Out"), "Culture", "Tommy, sorti en 1969, est un opéra-rock qui a révolutionné le genre par sa narration ambitieuse et sa musique innovante, devenant l'album emblématique du groupe."),
            en = LocalizedContent("Which album by The Who is considered a masterpiece?", listOf("Tommy", "Who's Next", "Quadrophenia", "The Who Sell Out"), "Culture", "Tommy, released in 1969, is a rock opera that revolutionized the genre with its ambitious narrative and innovative music, becoming the band's iconic album."),
            zh = LocalizedContent("谁人乐队的哪张专辑被认为是杰作？", listOf("汤米", "谁是下一个", "四重人格", "谁人乐队促销"), "文化", "《汤米》于1969年发行，是一部摇滚歌剧，以其雄心勃勃的叙事和创新音乐彻底改变了这一流派，成为乐队的标志性专辑。"),
            es = LocalizedContent("¿Qué álbum de The Who se considera una obra maestra?", listOf("Tommy", "Who's Next", "Quadrophenia", "The Who Sell Out"), "Cultura", "Tommy, lanzado en 1969, es una ópera rock que revolucionó el género con su narrativa ambiciosa y música innovadora, convirtiéndose en el álbum emblemático del grupo.")
        ),
        BilingualQuestion(
            id = 11805, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Tommy\" a-t-il été publié?", listOf("1969", "1967", "1971", "1970"), "Culture", "\"Tommy\" est le quatrième album studio du groupe The Who, sorti en 1969. C'est un opéra-rock qui raconte l'histoire d'un garçon sourd, muet et aveugle."),
            en = LocalizedContent("In what year was \"Tommy\" released?", listOf("1969", "1967", "1971", "1970"), "Culture", "\"Tommy\" is the fourth studio album by the band The Who, released in 1969. It is a rock opera that tells the story of a deaf, dumb, and blind boy."),
            zh = LocalizedContent("《汤米》是哪一年发行的？", listOf("1969", "1967", "1971", "1970"), "文化", "《汤米》是谁人乐队的第四张录音室专辑，于1969年发行。这是一部摇滚歌剧，讲述了一个又聋又哑又盲的男孩的故事。"),
            es = LocalizedContent("¿En qué año se publicó \"Tommy\"?", listOf("1969", "1967", "1971", "1970"), "Cultura", "\"Tommy\" es el cuarto álbum de estudio del grupo The Who, publicado en 1969. Es una ópera rock que cuenta la historia de un niño sordo, mudo y ciego.")
        ),
        BilingualQuestion(
            id = 11806, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a enregistré \"Paint It Black\"?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Culture", "Sorti en 1966, \"Paint It Black\" est un single des Rolling Stones, figurant sur l'album Aftermath."),
            en = LocalizedContent("Which group recorded \"Paint It Black\"?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Culture", "Released in 1966, \"Paint It Black\" is a single by The Rolling Stones, featured on the album Aftermath."),
            zh = LocalizedContent("哪个乐队录制了《把它涂黑》？", listOf("滚石乐队", "披头士乐队", "齐柏林飞艇", "平克·弗洛伊德"), "文化", "《把它涂黑》于1966年发行，是滚石乐队的一首单曲，收录在专辑《后果》中。"),
            es = LocalizedContent("¿Qué grupo grabó \"Paint It Black\"?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Cultura", "Lanzado en 1966, \"Paint It Black\" es un sencillo de The Rolling Stones, incluido en el álbum Aftermath.")
        ),
        BilingualQuestion(
            id = 11807, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Paint It Black\" a-t-il été publié?", listOf("1966", "1964", "1968", "1967"), "Culture", "Ce single des Rolling Stones est sorti en mai 1966, figurant sur la version américaine de l'album *Aftermath*."),
            en = LocalizedContent("In what year was \"Paint It Black\" released?", listOf("1966", "1964", "1968", "1967"), "Culture", "This single by The Rolling Stones was released in May 1966, featured on the US version of the album *Aftermath*."),
            zh = LocalizedContent("《把它涂黑》是哪一年发行的？", listOf("1966", "1964", "1968", "1967"), "文化", "滚石乐队的这首单曲于1966年5月发行，收录在专辑《后果》的美国版本中。"),
            es = LocalizedContent("¿En qué año se publicó \"Paint It Black\"?", listOf("1966", "1964", "1968", "1967"), "Cultura", "Este sencillo de The Rolling Stones se publicó en mayo de 1966, incluido en la versión estadounidense del álbum *Aftermath*.")
        ),
        BilingualQuestion(
            id = 11808, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Jimi Hendrix est le plus célèbre?", listOf("Are You Experienced", "Electric Ladyland", "Axis: Bold as Love", "The Cry of Love"), "Culture", "Are You Experienced est le premier album studio de Jimi Hendrix, sorti en 1967, et contient ses titres les plus emblématiques comme Purple Haze et Hey Joe."),
            en = LocalizedContent("Which album by Jimi Hendrix is the most famous?", listOf("Are You Experienced", "Electric Ladyland", "Axis: Bold as Love", "The Cry of Love"), "Culture", "Are You Experienced is Jimi Hendrix's debut studio album, released in 1967, and contains his most iconic tracks like Purple Haze and Hey Joe."),
            zh = LocalizedContent("吉米·亨德里克斯的哪张专辑最著名？", listOf("你经历过吗", "电女郎", "轴：勇敢如爱", "爱的哭泣"), "文化", "《你经历过吗》是吉米·亨德里克斯的首张录音室专辑，于1967年发行，包含他最标志性的曲目，如《紫色薄雾》和《嘿，乔》。"),
            es = LocalizedContent("¿Qué álbum de Jimi Hendrix es el más famoso?", listOf("Are You Experienced", "Electric Ladyland", "Axis: Bold as Love", "The Cry of Love"), "Cultura", "Are You Experienced es el primer álbum de estudio de Jimi Hendrix, lanzado en 1967, y contiene sus temas más emblemáticos como Purple Haze y Hey Joe.")
        ),
        BilingualQuestion(
            id = 11809, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Are You Experienced\" a-t-il été publié?", listOf("1967", "1965", "1969", "1966"), "Culture", "Are You Experienced, premier album de Jimi Hendrix, est sorti en 1967 au Royaume-Uni, marquant un tournant dans l'histoire du rock psychédélique."),
            en = LocalizedContent("In what year was \"Are You Experienced\" released?", listOf("1967", "1965", "1969", "1966"), "Culture", "Are You Experienced, Jimi Hendrix's debut album, was released in 1967 in the United Kingdom, marking a turning point in the history of psychedelic rock."),
            zh = LocalizedContent("《你经历过吗》是哪一年发行的？", listOf("1967", "1965", "1969", "1966"), "文化", "《你经历过吗》是吉米·亨德里克斯的首张专辑，于1967年在英国发行，标志着迷幻摇滚历史的转折点。"),
            es = LocalizedContent("¿En qué año se publicó \"Are You Experienced\"?", listOf("1967", "1965", "1969", "1966"), "Cultura", "Are You Experienced, el álbum debut de Jimi Hendrix, se publicó en 1967 en el Reino Unido, marcando un punto de inflexión en la historia del rock psicodélico.")
        ),
        BilingualQuestion(
            id = 11810, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a enregistré \"Satisfaction\"?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "The Who"), "Culture", "(I Can't Get No) Satisfaction est un single des Rolling Stones sorti en 1965, devenu l'un de leurs plus grands succès et un hymne du rock."),
            en = LocalizedContent("Which group recorded \"Satisfaction\"?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "The Who"), "Culture", "(I Can't Get No) Satisfaction is a single by The Rolling Stones released in 1965, becoming one of their greatest hits and a rock anthem."),
            zh = LocalizedContent("哪个乐队录制了《Satisfaction》？", listOf("滚石乐队", "披头士乐队", "齐柏林飞艇乐队", "谁人乐队"), "文化", "《(I Can't Get No) Satisfaction》是滚石乐队于1965年发行的单曲，成为他们最伟大的热门歌曲之一和摇滚圣歌。"),
            es = LocalizedContent("¿Qué grupo grabó \"Satisfaction\"?", listOf("The Rolling Stones", "The Beatles", "Led Zeppelin", "The Who"), "Cultura", "(I Can't Get No) Satisfaction es un sencillo de The Rolling Stones lanzado en 1965, convirtiéndose en uno de sus mayores éxitos y un himno del rock.")
        ),
        BilingualQuestion(
            id = 11811, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Britney Spears a-t-elle été lancée?", listOf("1998", "1996", "2000", "1999"), "Culture", "Britney Spears a connu un succès mondial en 1998 avec la sortie de son premier single \"...Baby One More Time\", qui a lancé sa carrière."),
            en = LocalizedContent("In what year was Britney Spears launched?", listOf("1998", "1996", "2000", "1999"), "Culture", "Britney Spears achieved worldwide success in 1998 with the release of her debut single \"...Baby One More Time\", which launched her career."),
            zh = LocalizedContent("布兰妮·斯皮尔斯在哪一年出道？", listOf("1998", "1996", "2000", "1999"), "文化", "布兰妮·斯皮尔斯于1998年凭借首支单曲《...Baby One More Time》获得全球成功，开启了她的职业生涯。"),
            es = LocalizedContent("¿En qué año se lanzó Britney Spears?", listOf("1998", "1996", "2000", "1999"), "Cultura", "Britney Spears alcanzó el éxito mundial en 1998 con el lanzamiento de su primer sencillo \"...Baby One More Time\", que lanzó su carrera.")
        ),
        BilingualQuestion(
            id = 11812, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier album de Britney Spears?", listOf("...Baby One More Time", "Oops!...I Did It Again", "Britney", "Circus"), "Culture", "Sorti en 1999, ...Baby One More Time est le premier album studio de Britney Spears, porté par le single éponyme qui l'a propulsée au rang de star mondiale."),
            en = LocalizedContent("What is Britney Spears' first album?", listOf("...Baby One More Time", "Oops!...I Did It Again", "Britney", "Circus"), "Culture", "Released in 1999, ...Baby One More Time is Britney Spears' debut studio album, propelled by the eponymous single that made her a global star."),
            zh = LocalizedContent("布兰妮·斯皮尔斯的第一张专辑是什么？", listOf("...Baby One More Time", "Oops!...I Did It Again", "Britney", "Circus"), "文化", "1999年发行的《...Baby One More Time》是布兰妮·斯皮尔斯的首张录音室专辑，同名单曲使她成为全球巨星。"),
            es = LocalizedContent("¿Cuál es el primer álbum de Britney Spears?", listOf("...Baby One More Time", "Oops!...I Did It Again", "Britney", "Circus"), "Cultura", "Lanzado en 1999, ...Baby One More Time es el álbum de estudio debut de Britney Spears, impulsado por el sencillo homónimo que la convirtió en una estrella mundial.")
        ),
        BilingualQuestion(
            id = 11813, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"...Baby One More Time\" a-t-il été publié?", listOf("1998", "1996", "2000", "1999"), "Culture", "Le premier single de Britney Spears, \"...Baby One More Time\", est sorti en octobre 1998 et a lancé sa carrière internationale."),
            en = LocalizedContent("In what year was \"...Baby One More Time\" released?", listOf("1998", "1996", "2000", "1999"), "Culture", "Britney Spears' debut single \"...Baby One More Time\" was released in October 1998 and launched her international career."),
            zh = LocalizedContent("《...Baby One More Time》在哪一年发行？", listOf("1998", "1996", "2000", "1999"), "文化", "布兰妮·斯皮尔斯的首支单曲《...Baby One More Time》于1998年10月发行，开启了她的国际生涯。"),
            es = LocalizedContent("¿En qué año se lanzó \"...Baby One More Time\"?", listOf("1998", "1996", "2000", "1999"), "Cultura", "El primer sencillo de Britney Spears, \"...Baby One More Time\", se lanzó en octubre de 1998 y lanzó su carrera internacional.")
        ),
        BilingualQuestion(
            id = 11814, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom réel de Rihanna?", listOf("Robyn Rihanna Fenty", "Rihanna Robyn Fenty", "Fenty Robyn Rihanna", "Rihanna Fenty Robyn"), "Culture", "Robyn Rihanna Fenty est son nom complet de naissance, Rihanna étant un diminutif de son deuxième prénom. Elle a adopté Fenty comme nom de scène pour sa marque de cosmétiques."),
            en = LocalizedContent("What is Rihanna's real name?", listOf("Robyn Rihanna Fenty", "Rihanna Robyn Fenty", "Fenty Robyn Rihanna", "Rihanna Fenty Robyn"), "Culture", "Robyn Rihanna Fenty is her full birth name, with Rihanna being a diminutive of her middle name. She adopted Fenty as her stage name for her cosmetics brand."),
            zh = LocalizedContent("蕾哈娜的真名是什么？", listOf("Robyn Rihanna Fenty", "Rihanna Robyn Fenty", "Fenty Robyn Rihanna", "Rihanna Fenty Robyn"), "文化", "Robyn Rihanna Fenty 是她的全名，Rihanna 是她中间名的缩写。她将 Fenty 作为其化妆品品牌的艺名。"),
            es = LocalizedContent("¿Cuál es el nombre real de Rihanna?", listOf("Robyn Rihanna Fenty", "Rihanna Robyn Fenty", "Fenty Robyn Rihanna", "Rihanna Fenty Robyn"), "Cultura", "Robyn Rihanna Fenty es su nombre completo de nacimiento, siendo Rihanna un diminutivo de su segundo nombre. Adoptó Fenty como nombre artístico para su marca de cosméticos.")
        ),
        BilingualQuestion(
            id = 11815, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Umbrella\" de Rihanna a-t-il été publié?", listOf("2007", "2005", "2009", "2006"), "Culture", "Umbrella, avec son refrain iconique, est sorti en 2007 comme premier single de l'album Good Girl Gone Bad, propulsant Rihanna au sommet des charts mondiaux."),
            en = LocalizedContent("In what year was Rihanna's \"Umbrella\" released?", listOf("2007", "2005", "2009", "2006"), "Culture", "Umbrella, with its iconic chorus, was released in 2007 as the first single from the album Good Girl Gone Bad, propelling Rihanna to the top of global charts."),
            zh = LocalizedContent("蕾哈娜的《Umbrella》在哪一年发行？", listOf("2007", "2005", "2009", "2006"), "文化", "《Umbrella》以其标志性的副歌于2007年作为专辑《Good Girl Gone Bad》的首支单曲发行，将蕾哈娜推上全球排行榜榜首。"),
            es = LocalizedContent("¿En qué año se lanzó \"Umbrella\" de Rihanna?", listOf("2007", "2005", "2009", "2006"), "Cultura", "Umbrella, con su icónico estribillo, se lanzó en 2007 como el primer sencillo del álbum Good Girl Gone Bad, impulsando a Rihanna a la cima de las listas mundiales.")
        ),
        BilingualQuestion(
            id = 11816, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre d'albums studio de Taylor Swift?", listOf("10", "9", "11", "8"), "Culture", "Taylor Swift a sorti son dixième album studio, Midnights, en octobre 2022. Avant cela, elle avait publié neuf autres albums originaux, portant le total à dix."),
            en = LocalizedContent("How many studio albums does Taylor Swift have?", listOf("10", "9", "11", "8"), "Culture", "Taylor Swift released her tenth studio album, Midnights, in October 2022. Before that, she had released nine other original albums, bringing the total to ten."),
            zh = LocalizedContent("泰勒·斯威夫特有多少张录音室专辑？", listOf("10", "9", "11", "8"), "文化", "泰勒·斯威夫特于2022年10月发行了她的第十张录音室专辑《Midnights》。在此之前，她已发行了九张其他原创专辑，总计十张。"),
            es = LocalizedContent("¿Cuántos álbumes de estudio tiene Taylor Swift?", listOf("10", "9", "11", "8"), "Cultura", "Taylor Swift lanzó su décimo álbum de estudio, Midnights, en octubre de 2022. Antes de eso, había lanzado otros nueve álbumes originales, sumando un total de diez.")
        ),
        BilingualQuestion(
            id = 11817, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Love Story\" de Taylor Swift a-t-il été publié?", listOf("2008", "2006", "2010", "2007"), "Culture", "Love Story est le deuxième single du deuxième album de Taylor Swift, Fearless, sorti en 2008. Ce titre a propulsé la chanteuse sur le devant de la scène country-pop internationale."),
            en = LocalizedContent("In what year was Taylor Swift's \"Love Story\" released?", listOf("2008", "2006", "2010", "2007"), "Culture", "Love Story is the second single from Taylor Swift's second album, Fearless, released in 2008. This song propelled the singer to the forefront of international country-pop."),
            zh = LocalizedContent("泰勒·斯威夫特的《Love Story》在哪一年发行？", listOf("2008", "2006", "2010", "2007"), "文化", "《Love Story》是泰勒·斯威夫特第二张专辑《Fearless》的第二支单曲，于2008年发行。这首歌将这位歌手推向了国际乡村流行乐的前沿。"),
            es = LocalizedContent("¿En qué año se lanzó \"Love Story\" de Taylor Swift?", listOf("2008", "2006", "2010", "2007"), "Cultura", "Love Story es el segundo sencillo del segundo álbum de Taylor Swift, Fearless, lanzado en 2008. Este tema impulsó a la cantante a la vanguardia del pop country internacional.")
        ),
        BilingualQuestion(
            id = 11818, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le titre du premier album de Beyoncé en solo?", listOf("Dangerously in Love", "B'Day", "I Am...", "4"), "Culture", "Dangerously in Love est le premier album studio solo de Beyoncé, sorti en 2003 après la pause du groupe Destiny's Child. Il contient les hits Crazy in Love et Baby Boy."),
            en = LocalizedContent("What is the title of Beyoncé's first solo album?", listOf("Dangerously in Love", "B'Day", "I Am...", "4"), "Culture", "Dangerously in Love is Beyoncé's debut solo studio album, released in 2003 after the hiatus of Destiny's Child. It contains the hits Crazy in Love and Baby Boy."),
            zh = LocalizedContent("碧昂丝的第一张个人专辑叫什么？", listOf("Dangerously in Love", "B'Day", "I Am...", "4"), "文化", "《Dangerously in Love》是碧昂丝的首张个人录音室专辑，于2003年天命真女组合休整期间发行，收录了热门歌曲《Crazy in Love》和《Baby Boy》。"),
            es = LocalizedContent("¿Cuál es el título del primer álbum en solitario de Beyoncé?", listOf("Dangerously in Love", "B'Day", "I Am...", "4"), "Cultura", "Dangerously in Love es el álbum de estudio debut en solitario de Beyoncé, lanzado en 2003 tras la pausa de Destiny's Child. Contiene los éxitos Crazy in Love y Baby Boy.")
        ),
        BilingualQuestion(
            id = 11819, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Halo\" de Beyoncé a-t-il été publié?", listOf("2008", "2006", "2010", "2007"), "Culture", "Le single \"Halo\" est extrait de l'album \"I Am... Sasha Fierce\" de Beyoncé, sorti en novembre 2008."),
            en = LocalizedContent("In what year was Beyoncé's \"Halo\" released?", listOf("2008", "2006", "2010", "2007"), "Culture", "The single \"Halo\" is from Beyoncé's album \"I Am... Sasha Fierce\", released in November 2008."),
            zh = LocalizedContent("碧昂丝的《Halo》在哪一年发行？", listOf("2008", "2006", "2010", "2007"), "文化", "单曲《Halo》出自碧昂丝的专辑《I Am... Sasha Fierce》，于2008年11月发行。"),
            es = LocalizedContent("¿En qué año se lanzó \"Halo\" de Beyoncé?", listOf("2008", "2006", "2010", "2007"), "Cultura", "El sencillo \"Halo\" es del álbum de Beyoncé \"I Am... Sasha Fierce\", lanzado en noviembre de 2008.")
        ),
        BilingualQuestion(
            id = 11820, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom complet de Lady Gaga?", listOf("Stefani Germanotta", "Stefani Joanne Angelina Germanotta", "Joanne Angelina Germanotta", "Germanotta Stefani"), "Culture", "Lady Gaga est le nom de scène de Stefani Joanne Angelina Germanotta, une chanteuse et actrice américaine née en 1986."),
            en = LocalizedContent("What is Lady Gaga's full name?", listOf("Stefani Germanotta", "Stefani Joanne Angelina Germanotta", "Joanne Angelina Germanotta", "Germanotta Stefani"), "Culture", "Lady Gaga is the stage name of Stefani Joanne Angelina Germanotta, an American singer and actress born in 1986."),
            zh = LocalizedContent("Lady Gaga的全名是什么？", listOf("Stefani Germanotta", "Stefani Joanne Angelina Germanotta", "Joanne Angelina Germanotta", "Germanotta Stefani"), "文化", "Lady Gaga是Stefani Joanne Angelina Germanotta的艺名，她是一位1986年出生的美国歌手和演员。"),
            es = LocalizedContent("¿Cuál es el nombre completo de Lady Gaga?", listOf("Stefani Germanotta", "Stefani Joanne Angelina Germanotta", "Joanne Angelina Germanotta", "Germanotta Stefani"), "Cultura", "Lady Gaga es el nombre artístico de Stefani Joanne Angelina Germanotta, una cantante y actriz estadounidense nacida en 1986.")
        ),
        BilingualQuestion(
            id = 11821, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Bad Romance\" de Lady Gaga a-t-il été publié?", listOf("2009", "2007", "2011", "2008"), "Culture", "Bad Romance est le premier single extrait de l'album The Fame Monster, sorti en novembre 2009. La chanson a connu un succès mondial immédiat."),
            en = LocalizedContent("In what year was Lady Gaga's \"Bad Romance\" released?", listOf("2009", "2007", "2011", "2008"), "Culture", "\"Bad Romance\" is the first single from the album The Fame Monster, released in November 2009. The song achieved immediate worldwide success."),
            zh = LocalizedContent("Lady Gaga的《Bad Romance》是哪一年发行的？", listOf("2009", "2007", "2011", "2008"), "文化", "《Bad Romance》是专辑《The Fame Monster》的首支单曲，于2009年11月发行。这首歌立即在全球取得了成功。"),
            es = LocalizedContent("¿En qué año se publicó \"Bad Romance\" de Lady Gaga?", listOf("2009", "2007", "2011", "2008"), "Cultura", "\"Bad Romance\" es el primer sencillo del álbum The Fame Monster, lanzado en noviembre de 2009. La canción tuvo un éxito mundial inmediato.")
        ),
        BilingualQuestion(
            id = 11822, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom réel de Katy Perry?", listOf("Katheryn Elizabeth Hudson", "Katherine Hudson", "Katy Hudson", "Elizabeth Katheryn"), "Culture", "Katy Perry a choisi son nom de scène en reprenant le nom de jeune fille de sa mère, Hudson, pour se démarquer et éviter toute confusion avec l'actrice Kate Hudson."),
            en = LocalizedContent("What is Katy Perry's real name?", listOf("Katheryn Elizabeth Hudson", "Katherine Hudson", "Katy Hudson", "Elizabeth Katheryn"), "Culture", "Katy Perry chose her stage name by adopting her mother's maiden name, Hudson, to stand out and avoid confusion with actress Kate Hudson."),
            zh = LocalizedContent("Katy Perry的真名是什么？", listOf("Katheryn Elizabeth Hudson", "Katherine Hudson", "Katy Hudson", "Elizabeth Katheryn"), "文化", "Katy Perry选择了她母亲的娘家姓Hudson作为艺名，以脱颖而出并避免与演员Kate Hudson混淆。"),
            es = LocalizedContent("¿Cuál es el nombre real de Katy Perry?", listOf("Katheryn Elizabeth Hudson", "Katherine Hudson", "Katy Hudson", "Elizabeth Katheryn"), "Cultura", "Katy Perry eligió su nombre artístico adoptando el apellido de soltera de su madre, Hudson, para destacarse y evitar confusiones con la actriz Kate Hudson.")
        ),
        BilingualQuestion(
            id = 11823, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Firework\" de Katy Perry a-t-il été publié?", listOf("2010", "2008", "2012", "2009"), "Culture", "Firework est le troisième single extrait de l'album Teenage Dream, sorti en 2010."),
            en = LocalizedContent("In what year was Katy Perry's \"Firework\" released?", listOf("2010", "2008", "2012", "2009"), "Culture", "\"Firework\" is the third single from the album Teenage Dream, released in 2010."),
            zh = LocalizedContent("Katy Perry的《Firework》是哪一年发行的？", listOf("2010", "2008", "2012", "2009"), "文化", "《Firework》是专辑《Teenage Dream》的第三支单曲，于2010年发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Firework\" de Katy Perry?", listOf("2010", "2008", "2012", "2009"), "Cultura", "\"Firework\" es el tercer sencillo del álbum Teenage Dream, lanzado en 2010.")
        ),
        BilingualQuestion(
            id = 11824, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom réel de Ariana Grande?", listOf("Ariana Grande-Butera", "Ariana Butera", "Grande Ariana Butera", "Butera Ariana"), "Culture", "Ariana Grande est née Ariana Grande-Butera, mais elle utilise son nom de scène raccourci pour sa carrière musicale."),
            en = LocalizedContent("What is Ariana Grande's real name?", listOf("Ariana Grande-Butera", "Ariana Butera", "Grande Ariana Butera", "Butera Ariana"), "Culture", "Ariana Grande was born Ariana Grande-Butera, but she uses her shortened stage name for her music career."),
            zh = LocalizedContent("Ariana Grande的真名是什么？", listOf("Ariana Grande-Butera", "Ariana Butera", "Grande Ariana Butera", "Butera Ariana"), "文化", "Ariana Grande出生时名为Ariana Grande-Butera，但她在音乐事业中使用缩短的艺名。"),
            es = LocalizedContent("¿Cuál es el nombre real de Ariana Grande?", listOf("Ariana Grande-Butera", "Ariana Butera", "Grande Ariana Butera", "Butera Ariana"), "Cultura", "Ariana Grande nació como Ariana Grande-Butera, pero utiliza su nombre artístico abreviado para su carrera musical.")
        ),
        BilingualQuestion(
            id = 11825, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Thank U, Next\" d'Ariana Grande a-t-il été publié?", listOf("2018", "2016", "2020", "2017"), "Culture", "Le single \"Thank U, Next\" est sorti en novembre 2018, devenant un succès mondial et le premier numéro un d'Ariana Grande au Billboard Hot 100."),
            en = LocalizedContent("In what year was Ariana Grande's \"Thank U, Next\" released?", listOf("2018", "2016", "2020", "2017"), "Culture", "The single \"Thank U, Next\" was released in November 2018, becoming a worldwide success and Ariana Grande's first number one on the Billboard Hot 100."),
            zh = LocalizedContent("Ariana Grande的《Thank U, Next》是哪一年发行的？", listOf("2018", "2016", "2020", "2017"), "文化", "单曲《Thank U, Next》于2018年11月发行，成为全球热门歌曲，也是Ariana Grande在Billboard Hot 100上的第一首冠军单曲。"),
            es = LocalizedContent("¿En qué año se publicó \"Thank U, Next\" de Ariana Grande?", listOf("2018", "2016", "2020", "2017"), "Cultura", "El sencillo \"Thank U, Next\" se lanzó en noviembre de 2018, convirtiéndose en un éxito mundial y el primer número uno de Ariana Grande en el Billboard Hot 100.")
        ),
        BilingualQuestion(
            id = 11826, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom réel de Dua Lipa?", listOf("Dua Lipa Seedo", "Dua Seedo", "Lipa Dua", "Seedo Dua"), "Culture", "Dua Lipa est née sous le nom complet de Dua Lipa Seedo, mais elle utilise uniquement son prénom et son nom de famille comme nom de scène."),
            en = LocalizedContent("What is Dua Lipa's real name?", listOf("Dua Lipa Seedo", "Dua Seedo", "Lipa Dua", "Seedo Dua"), "Culture", "Dua Lipa was born with the full name Dua Lipa Seedo, but she uses only her first name and surname as her stage name."),
            zh = LocalizedContent("Dua Lipa的真名是什么？", listOf("Dua Lipa Seedo", "Dua Seedo", "Lipa Dua", "Seedo Dua"), "文化", "Dua Lipa出生时的全名是Dua Lipa Seedo，但她只使用名字和姓氏作为艺名。"),
            es = LocalizedContent("¿Cuál es el nombre real de Dua Lipa?", listOf("Dua Lipa Seedo", "Dua Seedo", "Lipa Dua", "Seedo Dua"), "Cultura", "Dua Lipa nació con el nombre completo Dua Lipa Seedo, pero utiliza solo su nombre y apellido como nombre artístico.")
        ),
        BilingualQuestion(
            id = 11827, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Levitating\" de Dua Lipa a-t-il été publié?", listOf("2020", "2018", "2022", "2019"), "Culture", "Le single \"Levitating\" de Dua Lipa est sorti en 2020 sur son album \"Future Nostalgia\", devenant un succès mondial."),
            en = LocalizedContent("In what year was Dua Lipa's \"Levitating\" released?", listOf("2020", "2018", "2022", "2019"), "Culture", "The single \"Levitating\" by Dua Lipa was released in 2020 on her album \"Future Nostalgia\", becoming a worldwide hit."),
            zh = LocalizedContent("Dua Lipa的《Levitating》是哪一年发行的？", listOf("2020", "2018", "2022", "2019"), "文化", "Dua Lipa的单曲《Levitating》于2020年在其专辑《Future Nostalgia》中发行，成为全球热门歌曲。"),
            es = LocalizedContent("¿En qué año se publicó \"Levitating\" de Dua Lipa?", listOf("2020", "2018", "2022", "2019"), "Cultura", "El sencillo \"Levitating\" de Dua Lipa se lanzó en 2020 en su álbum \"Future Nostalgia\", convirtiéndose en un éxito mundial.")
        ),
        BilingualQuestion(
            id = 11828, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom réel de Billie Eilish?", listOf("Billie Eilish Pirate Baird O'Connell", "Billie Pirate", "Eilish Billie", "Baird O'Connell"), "Culture", "Billie Eilish a un deuxième prénom original, Pirate, et son nom complet inclut les noms de famille de ses parents, Baird et O'Connell."),
            en = LocalizedContent("What is Billie Eilish's real name?", listOf("Billie Eilish Pirate Baird O'Connell", "Billie Pirate", "Eilish Billie", "Baird O'Connell"), "Culture", "Billie Eilish has an original middle name, Pirate, and her full name includes the surnames of her parents, Baird and O'Connell."),
            zh = LocalizedContent("Billie Eilish的真名是什么？", listOf("Billie Eilish Pirate Baird O'Connell", "Billie Pirate", "Eilish Billie", "Baird O'Connell"), "文化", "Billie Eilish有一个独特的中名Pirate，她的全名包括父母双方的姓氏Baird和O'Connell。"),
            es = LocalizedContent("¿Cuál es el nombre real de Billie Eilish?", listOf("Billie Eilish Pirate Baird O'Connell", "Billie Pirate", "Eilish Billie", "Baird O'Connell"), "Cultura", "Billie Eilish tiene un segundo nombre original, Pirate, y su nombre completo incluye los apellidos de sus padres, Baird y O'Connell.")
        ),
        BilingualQuestion(
            id = 11829, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Bad Guy\" de Billie Eilish a-t-il été publié?", listOf("2018", "2016", "2020", "2017"), "Culture", "Bad Guy est le single principal du premier album de Billie Eilish, When We All Fall Asleep, Where Do We Go?, sorti en 2019, mais le titre a été publié en tant que single en 2018."),
            en = LocalizedContent("In what year was Billie Eilish's \"Bad Guy\" released?", listOf("2018", "2016", "2020", "2017"), "Culture", "\"Bad Guy\" is the lead single from Billie Eilish's debut album, When We All Fall Asleep, Where Do We Go?, released in 2019, but the track was published as a single in 2018."),
            zh = LocalizedContent("Billie Eilish的《Bad Guy》是哪一年发行的？", listOf("2018", "2016", "2020", "2017"), "文化", "《Bad Guy》是Billie Eilish首张专辑《When We All Fall Asleep, Where Do We Go?》的主打单曲，该专辑于2019年发行，但单曲于2018年发布。"),
            es = LocalizedContent("¿En qué año se publicó \"Bad Guy\" de Billie Eilish?", listOf("2018", "2016", "2020", "2017"), "Cultura", "\"Bad Guy\" es el sencillo principal del álbum debut de Billie Eilish, When We All Fall Asleep, Where Do We Go?, lanzado en 2019, pero la canción se publicó como sencillo en 2018.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11830, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom réel d'Olivia Rodrigo?", listOf("Olivia Isabel Rodrigo", "Isabel Olivia", "Rodrigo Olivia", "Isabel Rodrigo"), "Culture", "Olivia Rodrigo est née Olivia Isabel Rodrigo le 20 février 2003 en Californie. Son nom complet inclut son deuxième prénom, Isabel, qui est souvent omis dans ses crédits publics."),
            en = LocalizedContent("What is Olivia Rodrigo's real name?", listOf("Olivia Isabel Rodrigo", "Isabel Olivia", "Rodrigo Olivia", "Isabel Rodrigo"), "Culture", "Olivia Rodrigo was born Olivia Isabel Rodrigo on February 20, 2003 in California. Her full name includes her middle name Isabel, which is often omitted in her public credits."),
            zh = LocalizedContent("奥利维亚·罗德里戈的真名是什么？", listOf("Olivia Isabel Rodrigo", "Isabel Olivia", "Rodrigo Olivia", "Isabel Rodrigo"), "文化", "奥利维亚·罗德里戈于2003年2月20日出生在加利福尼亚州，全名是Olivia Isabel Rodrigo。她的中间名Isabel在公开资料中常被省略。"),
            es = LocalizedContent("¿Cuál es el nombre real de Olivia Rodrigo?", listOf("Olivia Isabel Rodrigo", "Isabel Olivia", "Rodrigo Olivia", "Isabel Rodrigo"), "Cultura", "Olivia Rodrigo nació como Olivia Isabel Rodrigo el 20 de febrero de 2003 en California. Su nombre completo incluye su segundo nombre Isabel, que a menudo se omite en sus créditos públicos.")
        ),
        BilingualQuestion(
            id = 11831, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"The Low End Theory\" de A Tribe Called Quest a-t-il été publié?", listOf("1991", "1989", "1993", "1992"), "Culture", "Sorti en 1991, The Low End Theory est le deuxième album studio du groupe de hip-hop A Tribe Called Quest, acclamé pour ses basses profondes et son jazz rap innovant."),
            en = LocalizedContent("In what year was A Tribe Called Quest's \"The Low End Theory\" released?", listOf("1991", "1989", "1993", "1992"), "Culture", "Released in 1991, The Low End Theory is the second studio album by hip-hop group A Tribe Called Quest, acclaimed for its deep bass and innovative jazz rap."),
            zh = LocalizedContent("A Tribe Called Quest的《The Low End Theory》是哪一年发行的？", listOf("1991", "1989", "1993", "1992"), "文化", "《The Low End Theory》于1991年发行，是嘻哈团体A Tribe Called Quest的第二张录音室专辑，以其深沉的低音和创新爵士说唱而备受赞誉。"),
            es = LocalizedContent("¿En qué año se publicó \"The Low End Theory\" de A Tribe Called Quest?", listOf("1991", "1989", "1993", "1992"), "Cultura", "Lanzado en 1991, The Low End Theory es el segundo álbum de estudio del grupo de hip-hop A Tribe Called Quest, aclamado por sus graves profundos y su innovador jazz rap.")
        ),
        BilingualQuestion(
            id = 11832, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Nas est considéré comme un chef-d'œuvre?", listOf("Illmatic", "It Was Written", "Stillmatic", "King's Disease"), "Culture", "Sorti en 1994, Illmatic est le premier album de Nas et est unanimement salué par la critique pour ses textes, sa production et son influence sur le hip-hop."),
            en = LocalizedContent("Which album by Nas is considered a masterpiece?", listOf("Illmatic", "It Was Written", "Stillmatic", "King's Disease"), "Culture", "Released in 1994, Illmatic is Nas's debut album and is universally praised by critics for its lyrics, production, and influence on hip-hop."),
            zh = LocalizedContent("Nas的哪张专辑被认为是杰作？", listOf("Illmatic", "It Was Written", "Stillmatic", "King's Disease"), "文化", "《Illmatic》于1994年发行，是Nas的首张专辑，因其歌词、制作和对嘻哈的影响而受到评论家的普遍赞誉。"),
            es = LocalizedContent("¿Qué álbum de Nas se considera una obra maestra?", listOf("Illmatic", "It Was Written", "Stillmatic", "King's Disease"), "Cultura", "Lanzado en 1994, Illmatic es el álbum debut de Nas y es universalmente elogiado por la crítica por sus letras, producción e influencia en el hip-hop.")
        ),
        BilingualQuestion(
            id = 11833, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Illmatic\" a-t-il été publié?", listOf("1994", "1992", "1996", "1993"), "Culture", "Illmatic, le premier album studio de Nas, est sorti le 19 avril 1994, devenant un classique du hip-hop."),
            en = LocalizedContent("In what year was \"Illmatic\" released?", listOf("1994", "1992", "1996", "1993"), "Culture", "Illmatic, Nas's debut studio album, was released on April 19, 1994, becoming a hip-hop classic."),
            zh = LocalizedContent("《Illmatic》是哪一年发行的？", listOf("1994", "1992", "1996", "1993"), "文化", "《Illmatic》是Nas的首张录音室专辑，于1994年4月19日发行，成为嘻哈经典。"),
            es = LocalizedContent("¿En qué año se publicó \"Illmatic\"?", listOf("1994", "1992", "1996", "1993"), "Cultura", "Illmatic, el álbum de estudio debut de Nas, se lanzó el 19 de abril de 1994, convirtiéndose en un clásico del hip-hop.")
        ),
        BilingualQuestion(
            id = 11834, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de The Notorious B.I.G. est le plus célèbre?", listOf("Ready to Die", "Life After Death", "Born Again", "Greatest Hits"), "Culture", "Ready to Die, sorti en 1994, est le premier album studio de The Notorious B.I.G. et est largement considéré comme un chef-d'œuvre du hip-hop, contenant des classiques comme Juicy et Big Poppa."),
            en = LocalizedContent("Which album by The Notorious B.I.G. is the most famous?", listOf("Ready to Die", "Life After Death", "Born Again", "Greatest Hits"), "Culture", "Ready to Die, released in 1994, is The Notorious B.I.G.'s debut studio album and is widely considered a hip-hop masterpiece, containing classics like Juicy and Big Poppa."),
            zh = LocalizedContent("The Notorious B.I.G.的哪张专辑最著名？", listOf("Ready to Die", "Life After Death", "Born Again", "Greatest Hits"), "文化", "《Ready to Die》于1994年发行，是The Notorious B.I.G.的首张录音室专辑，被广泛认为是嘻哈杰作，包含《Juicy》和《Big Poppa》等经典歌曲。"),
            es = LocalizedContent("¿Qué álbum de The Notorious B.I.G. es el más famoso?", listOf("Ready to Die", "Life After Death", "Born Again", "Greatest Hits"), "Cultura", "Ready to Die, lanzado en 1994, es el álbum de estudio debut de The Notorious B.I.G. y es ampliamente considerado una obra maestra del hip-hop, con clásicos como Juicy y Big Poppa.")
        ),
        BilingualQuestion(
            id = 11835, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Ready to Die\" a-t-il été publié?", listOf("1994", "1992", "1996", "1993"), "Culture", "Ready to Die, le premier album studio de The Notorious B.I.G., est sorti le 13 septembre 1994 chez Bad Boy Records."),
            en = LocalizedContent("In what year was \"Ready to Die\" released?", listOf("1994", "1992", "1996", "1993"), "Culture", "Ready to Die, The Notorious B.I.G.'s debut studio album, was released on September 13, 1994 on Bad Boy Records."),
            zh = LocalizedContent("《Ready to Die》是哪一年发行的？", listOf("1994", "1992", "1996", "1993"), "文化", "《Ready to Die》是The Notorious B.I.G.的首张录音室专辑，于1994年9月13日由Bad Boy Records发行。"),
            es = LocalizedContent("¿En qué año se publicó \"Ready to Die\"?", listOf("1994", "1992", "1996", "1993"), "Cultura", "Ready to Die, el álbum de estudio debut de The Notorious B.I.G., se lanzó el 13 de septiembre de 1994 en Bad Boy Records.")
        ),
        BilingualQuestion(
            id = 11836, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Tupac est le plus célèbre?", listOf("All Eyez on Me", "Me Against the World", "2Pacalypse Now", "The Don Killuminati"), "Culture", "All Eyez on Me est le quatrième album studio de Tupac, sorti en 1996. Il est considéré comme son chef-d'œuvre et l'un des albums de hip-hop les plus influents, avec des hits comme \"California Love\"."),
            en = LocalizedContent("Which album by Tupac is the most famous?", listOf("All Eyez on Me", "Me Against the World", "2Pacalypse Now", "The Don Killuminati"), "Culture", "All Eyez on Me is Tupac's fourth studio album, released in 1996. It is considered his masterpiece and one of the most influential hip-hop albums, with hits like \"California Love\"."),
            zh = LocalizedContent("Tupac的哪张专辑最著名？", listOf("All Eyez on Me", "Me Against the World", "2Pacalypse Now", "The Don Killuminati"), "文化", "《All Eyez on Me》是Tupac的第四张录音室专辑，于1996年发行。它被认为是他的杰作，也是最具影响力的嘻哈专辑之一，包含《California Love》等热门歌曲。"),
            es = LocalizedContent("¿Qué álbum de Tupac es el más famoso?", listOf("All Eyez on Me", "Me Against the World", "2Pacalypse Now", "The Don Killuminati"), "Cultura", "All Eyez on Me es el cuarto álbum de estudio de Tupac, lanzado en 1996. Se considera su obra maestra y uno de los álbumes de hip-hop más influyentes, con éxitos como \"California Love\".")
        ),
        BilingualQuestion(
            id = 11837, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"All Eyez on Me\" a-t-il été publié?", listOf("1996", "1994", "1998", "1995"), "Culture", "All Eyez on Me est le quatrième album studio de Tupac Shakur, sorti le 13 février 1996 sous le label Death Row Records."),
            en = LocalizedContent("In what year was \"All Eyez on Me\" released?", listOf("1996", "1994", "1998", "1995"), "Culture", "All Eyez on Me is Tupac Shakur's fourth studio album, released on February 13, 1996 under Death Row Records."),
            zh = LocalizedContent("《All Eyez on Me》是哪一年发行的？", listOf("1996", "1994", "1998", "1995"), "文化", "《All Eyez on Me》是Tupac Shakur的第四张录音室专辑，于1996年2月13日由Death Row Records发行。"),
            es = LocalizedContent("¿En qué año se publicó \"All Eyez on Me\"?", listOf("1996", "1994", "1998", "1995"), "Cultura", "All Eyez on Me es el cuarto álbum de estudio de Tupac Shakur, lanzado el 13 de febrero de 1996 bajo el sello Death Row Records.")
        ),
        BilingualQuestion(
            id = 11838, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Dr. Dre est considéré comme un chef-d'œuvre?", listOf("The Chronic", "2001", "Compton", "Detox (non publié)"), "Culture", "The Chronic, sorti en 1992, a révolutionné le hip-hop en popularisant le G-funk et a propulsé la carrière de Dr. Dre et de Snoop Dogg."),
            en = LocalizedContent("Which album by Dr. Dre is considered a masterpiece?", listOf("The Chronic", "2001", "Compton", "Detox (unreleased)"), "Culture", "The Chronic, released in 1992, revolutionized hip-hop by popularizing G-funk and launched the careers of Dr. Dre and Snoop Dogg."),
            zh = LocalizedContent("Dr. Dre的哪张专辑被认为是杰作？", listOf("The Chronic", "2001", "Compton", "Detox (未发行)"), "文化", "《The Chronic》于1992年发行，通过推广G-funk彻底改变了嘻哈音乐，并开启了Dr. Dre和Snoop Dogg的职业生涯。"),
            es = LocalizedContent("¿Qué álbum de Dr. Dre se considera una obra maestra?", listOf("The Chronic", "2001", "Compton", "Detox (no publicado)"), "Cultura", "The Chronic, lanzado en 1992, revolucionó el hip-hop al popularizar el G-funk y lanzó las carreras de Dr. Dre y Snoop Dogg.")
        ),
        BilingualQuestion(
            id = 11839, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"The Chronic\" a-t-il été publié?", listOf("1992", "1990", "1994", "1991"), "Culture", "L'album \"The Chronic\" de Dr. Dre est sorti en 1992, marquant un tournant majeur dans le hip-hop avec le son G-funk."),
            en = LocalizedContent("In what year was \"The Chronic\" released?", listOf("1992", "1990", "1994", "1991"), "Culture", "Dr. Dre's album \"The Chronic\" was released in 1992, marking a major turning point in hip-hop with the G-funk sound."),
            zh = LocalizedContent("《The Chronic》是哪一年发行的？", listOf("1992", "1990", "1994", "1991"), "文化", "Dr. Dre的专辑《The Chronic》于1992年发行，以G-funk音乐风格标志着嘻哈音乐的重大转折。"),
            es = LocalizedContent("¿En qué año se publicó \"The Chronic\"?", listOf("1992", "1990", "1994", "1991"), "Cultura", "El álbum \"The Chronic\" de Dr. Dre se lanzó en 1992, marcando un punto de inflexión importante en el hip-hop con el sonido G-funk.")
        ),
        BilingualQuestion(
            id = 11840, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Snoop Dogg est le plus célèbre?", listOf("Doggystyle", "Tha Doggfather", "No Limit Top Dogg", "Paid tha Cost"), "Culture", "Sorti en 1993, Doggystyle est le premier album studio de Snoop Dogg, produit par Dr. Dre, et il est considéré comme un classique du hip-hop de la côte Ouest."),
            en = LocalizedContent("Which album by Snoop Dogg is the most famous?", listOf("Doggystyle", "Tha Doggfather", "No Limit Top Dogg", "Paid tha Cost"), "Culture", "Released in 1993, Doggystyle is Snoop Dogg's debut studio album, produced by Dr. Dre, and is considered a classic of West Coast hip-hop."),
            zh = LocalizedContent("Snoop Dogg 哪张专辑最著名？", listOf("Doggystyle", "Tha Doggfather", "No Limit Top Dogg", "Paid tha Cost"), "文化", "1993年发行的《Doggystyle》是Snoop Dogg的首张录音室专辑，由Dr. Dre制作，被认为是西海岸嘻哈的经典之作。"),
            es = LocalizedContent("¿Qué álbum de Snoop Dogg es el más famoso?", listOf("Doggystyle", "Tha Doggfather", "No Limit Top Dogg", "Paid tha Cost"), "Cultura", "Lanzado en 1993, Doggystyle es el primer álbum de estudio de Snoop Dogg, producido por Dr. Dre, y es considerado un clásico del hip-hop de la costa oeste.")
        ),
        BilingualQuestion(
            id = 11841, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Doggystyle\" a-t-il été publié?", listOf("1993", "1991", "1995", "1992"), "Culture", "Doggystyle, le premier album studio de Snoop Dogg, est sorti en 1993 et a connu un immense succès commercial et critique."),
            en = LocalizedContent("In what year was \"Doggystyle\" released?", listOf("1993", "1991", "1995", "1992"), "Culture", "Doggystyle, Snoop Dogg's debut studio album, was released in 1993 and achieved immense commercial and critical success."),
            zh = LocalizedContent("《Doggystyle》是哪一年发行的？", listOf("1993", "1991", "1995", "1992"), "文化", "《Doggystyle》是Snoop Dogg的首张录音室专辑，于1993年发行，取得了巨大的商业和评论成功。"),
            es = LocalizedContent("¿En qué año se lanzó \"Doggystyle\"?", listOf("1993", "1991", "1995", "1992"), "Cultura", "Doggystyle, el primer álbum de estudio de Snoop Dogg, se lanzó en 1993 y logró un inmenso éxito comercial y crítico.")
        ),
        BilingualQuestion(
            id = 11842, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Jay-Z est considéré comme un chef-d'œuvre?", listOf("The Blueprint", "Reasonable Doubt", "In My Lifetime, Vol. 1", "Life and Times of S. Carter"), "Culture", "Sorti en 2001, The Blueprint est salué pour sa production innovante et ses textes introspectifs, marquant un tournant dans le hip-hop."),
            en = LocalizedContent("Which album by Jay-Z is considered a masterpiece?", listOf("The Blueprint", "Reasonable Doubt", "In My Lifetime, Vol. 1", "Life and Times of S. Carter"), "Culture", "Released in 2001, The Blueprint is praised for its innovative production and introspective lyrics, marking a turning point in hip-hop."),
            zh = LocalizedContent("Jay-Z 哪张专辑被认为是杰作？", listOf("The Blueprint", "Reasonable Doubt", "In My Lifetime, Vol. 1", "Life and Times of S. Carter"), "文化", "2001年发行的《The Blueprint》因其创新的制作和内省的歌词而受到赞誉，标志着嘻哈音乐的转折点。"),
            es = LocalizedContent("¿Qué álbum de Jay-Z se considera una obra maestra?", listOf("The Blueprint", "Reasonable Doubt", "In My Lifetime, Vol. 1", "Life and Times of S. Carter"), "Cultura", "Lanzado en 2001, The Blueprint es elogiado por su producción innovadora y letras introspectivas, marcando un punto de inflexión en el hip-hop.")
        ),
        BilingualQuestion(
            id = 11843, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Reasonable Doubt\" a-t-il été publié?", listOf("1996", "1994", "1998", "1995"), "Culture", "Reasonable Doubt est le premier album studio de Jay-Z, sorti le 25 juin 1996 sur le label Roc-A-Fella Records."),
            en = LocalizedContent("In what year was \"Reasonable Doubt\" released?", listOf("1996", "1994", "1998", "1995"), "Culture", "Reasonable Doubt is Jay-Z's debut studio album, released on June 25, 1996, on Roc-A-Fella Records."),
            zh = LocalizedContent("《Reasonable Doubt》是哪一年发行的？", listOf("1996", "1994", "1998", "1995"), "文化", "《Reasonable Doubt》是Jay-Z的首张录音室专辑，于1996年6月25日由Roc-A-Fella唱片公司发行。"),
            es = LocalizedContent("¿En qué año se lanzó \"Reasonable Doubt\"?", listOf("1996", "1994", "1998", "1995"), "Cultura", "Reasonable Doubt es el primer álbum de estudio de Jay-Z, lanzado el 25 de junio de 1996 bajo el sello Roc-A-Fella Records.")
        ),
        BilingualQuestion(
            id = 11844, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de 50 Cent est le plus célèbre?", listOf("Get Rich or Die Tryin'", "The Massacre", "Curtis", "Power"), "Culture", "Get Rich or Die Tryin' est l'album studio de 50 Cent sorti en 2003, acclamé par la critique et un succès commercial mondial, avec des hits comme In da Club."),
            en = LocalizedContent("Which album by 50 Cent is the most famous?", listOf("Get Rich or Die Tryin'", "The Massacre", "Curtis", "Power"), "Culture", "Get Rich or Die Tryin' is 50 Cent's studio album released in 2003, critically acclaimed and a worldwide commercial success, with hits like In da Club."),
            zh = LocalizedContent("50 Cent 哪张专辑最著名？", listOf("Get Rich or Die Tryin'", "The Massacre", "Curtis", "Power"), "文化", "《Get Rich or Die Tryin'》是50 Cent于2003年发行的录音室专辑，获得评论界好评并在全球取得商业成功，其中包括《In da Club》等热门歌曲。"),
            es = LocalizedContent("¿Qué álbum de 50 Cent es el más famoso?", listOf("Get Rich or Die Tryin'", "The Massacre", "Curtis", "Power"), "Cultura", "Get Rich or Die Tryin' es el álbum de estudio de 50 Cent lanzado en 2003, aclamado por la crítica y un éxito comercial mundial, con éxitos como In da Club.")
        ),
        BilingualQuestion(
            id = 11845, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Get Rich or Die Tryin'\" a-t-il été publié?", listOf("2003", "2001", "2005", "2002"), "Culture", "Get Rich or Die Tryin' est le premier album studio du rappeur 50 Cent, sorti en 2003. Il a connu un succès commercial majeur, se vendant à plusieurs millions d'exemplaires."),
            en = LocalizedContent("In what year was \"Get Rich or Die Tryin'\" released?", listOf("2003", "2001", "2005", "2002"), "Culture", "Get Rich or Die Tryin' is the debut studio album by rapper 50 Cent, released in 2003. It achieved major commercial success, selling millions of copies."),
            zh = LocalizedContent("《Get Rich or Die Tryin'》是哪一年发行的？", listOf("2003", "2001", "2005", "2002"), "文化", "《Get Rich or Die Tryin'》是说唱歌手50 Cent的首张录音室专辑，于2003年发行，取得了巨大的商业成功，销量达数百万张。"),
            es = LocalizedContent("¿En qué año se lanzó \"Get Rich or Die Tryin'\"?", listOf("2003", "2001", "2005", "2002"), "Cultura", "Get Rich or Die Tryin' es el primer álbum de estudio del rapero 50 Cent, lanzado en 2003. Logró un gran éxito comercial, vendiendo millones de copias.")
        ),
        BilingualQuestion(
            id = 11846, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Kendrick Lamar est considéré comme un chef-d'œuvre?", listOf("good kid, m.A.A.d city", "Section.80", "To Pimp a Butterfly", "DAMN."), "Culture", "Sorti en 2012, good kid, m.A.A.d city est le premier album studio majeur de Kendrick Lamar, salué par la critique pour son récit autobiographique et sa production complexe."),
            en = LocalizedContent("Which album by Kendrick Lamar is considered a masterpiece?", listOf("good kid, m.A.A.d city", "Section.80", "To Pimp a Butterfly", "DAMN."), "Culture", "Released in 2012, good kid, m.A.A.d city is Kendrick Lamar's major debut studio album, praised by critics for its autobiographical narrative and complex production."),
            zh = LocalizedContent("Kendrick Lamar 哪张专辑被认为是杰作？", listOf("good kid, m.A.A.d city", "Section.80", "To Pimp a Butterfly", "DAMN."), "文化", "2012年发行的《good kid, m.A.A.d city》是Kendrick Lamar的首张重要录音室专辑，因其自传式叙事和复杂的制作而受到评论界赞誉。"),
            es = LocalizedContent("¿Qué álbum de Kendrick Lamar se considera una obra maestra?", listOf("good kid, m.A.A.d city", "Section.80", "To Pimp a Butterfly", "DAMN."), "Cultura", "Lanzado en 2012, good kid, m.A.A.d city es el primer álbum de estudio importante de Kendrick Lamar, elogiado por la crítica por su narrativa autobiográfica y producción compleja.")
        ),
        BilingualQuestion(
            id = 11847, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"good kid, m.A.A.d city\" a-t-il été publié?", listOf("2012", "2010", "2014", "2011"), "Culture", "Le deuxième album studio de Kendrick Lamar, \"good kid, m.A.A.d city\", est sorti le 22 octobre 2012. Il a été acclamé par la critique pour son récit autobiographique de l'adolescence du rappeur à Compton."),
            en = LocalizedContent("In what year was \"good kid, m.A.A.d city\" released?", listOf("2012", "2010", "2014", "2011"), "Culture", "Kendrick Lamar's second studio album, \"good kid, m.A.A.d city\", was released on October 22, 2012. It was critically acclaimed for its autobiographical account of the rapper's adolescence in Compton."),
            zh = LocalizedContent("《good kid, m.A.A.d city》是哪一年发行的？", listOf("2012", "2010", "2014", "2011"), "文化", "Kendrick Lamar的第二张录音室专辑《good kid, m.A.A.d city》于2012年10月22日发行。它因自述说唱歌手在康普顿的青少年经历而获得评论界好评。"),
            es = LocalizedContent("¿En qué año se lanzó \"good kid, m.A.A.d city\"?", listOf("2012", "2010", "2014", "2011"), "Cultura", "El segundo álbum de estudio de Kendrick Lamar, \"good kid, m.A.A.d city\", se lanzó el 22 de octubre de 2012. Fue aclamado por la crítica por su relato autobiográfico de la adolescencia del rapero en Compton.")
        ),
        BilingualQuestion(
            id = 11848, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de Drake est le plus célèbre?", listOf("Take Care", "Nothing Was the Same", "Views", "Scorpion"), "Culture", "Take Care, sorti en 2011, est souvent considéré comme l'album emblématique de Drake, ayant remporté le Grammy du meilleur album rap et popularisé son style introspectif et mélodique."),
            en = LocalizedContent("Which album by Drake is the most famous?", listOf("Take Care", "Nothing Was the Same", "Views", "Scorpion"), "Culture", "Take Care, released in 2011, is often considered Drake's signature album, winning the Grammy for Best Rap Album and popularizing his introspective and melodic style."),
            zh = LocalizedContent("Drake 哪张专辑最著名？", listOf("Take Care", "Nothing Was the Same", "Views", "Scorpion"), "文化", "2011年发行的《Take Care》常被视为Drake的代表专辑，赢得了格莱美最佳说唱专辑奖，并推广了他内省和旋律化的风格。"),
            es = LocalizedContent("¿Qué álbum de Drake es el más famoso?", listOf("Take Care", "Nothing Was the Same", "Views", "Scorpion"), "Cultura", "Take Care, lanzado en 2011, a menudo se considera el álbum emblemático de Drake, ganando el Grammy al Mejor Álbum de Rap y popularizando su estilo introspectivo y melódico.")
        ),
        BilingualQuestion(
            id = 11849, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Take Care\" a-t-il été publié?", listOf("2011", "2009", "2013", "2010"), "Culture", "Take Care est le deuxième album studio du rappeur canadien Drake, sorti le 15 novembre 2011."),
            en = LocalizedContent("In what year was \"Take Care\" released?", listOf("2011", "2009", "2013", "2010"), "Culture", "Take Care is the second studio album by Canadian rapper Drake, released on November 15, 2011."),
            zh = LocalizedContent("《Take Care》是哪一年发行的？", listOf("2011", "2009", "2013", "2010"), "文化", "《Take Care》是说唱歌手Drake的第二张录音室专辑，于2011年11月15日发行。"),
            es = LocalizedContent("¿En qué año se lanzó \"Take Care\"?", listOf("2011", "2009", "2013", "2010"), "Cultura", "Take Care es el segundo álbum de estudio del rapero canadiense Drake, lanzado el 15 de noviembre de 2011.")
        ),
        BilingualQuestion(
            id = 11850, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel album de J. Cole est considéré comme un chef-d'œuvre?", listOf("2014 Forest Hills Drive", "The College Dropout", "The Warm Up", "The Sideline Story"), "Culture", "2014 Forest Hills Drive est souvent salué comme le chef-d'œuvre de J. Cole car il marque un tournant introspectif et autobiographique, sans featuring, et a été certifié triple platine sans aucune promotion radio."),
            en = LocalizedContent("Which J. Cole album is considered a masterpiece?", listOf("2014 Forest Hills Drive", "The College Dropout", "The Warm Up", "The Sideline Story"), "Culture", "2014 Forest Hills Drive is often hailed as J. Cole's masterpiece because it marks an introspective and autobiographical turning point, with no features, and was certified triple platinum without any radio promotion."),
            zh = LocalizedContent("J. Cole的哪张专辑被认为是杰作？", listOf("2014 Forest Hills Drive", "The College Dropout", "The Warm Up", "The Sideline Story"), "文化", "《2014 Forest Hills Drive》常被誉为J. Cole的杰作，因为它标志着一个内省和自传式的转折点，没有客串艺人，并且在没有任何电台推广的情况下获得了三白金认证。"),
            es = LocalizedContent("¿Qué álbum de J. Cole se considera una obra maestra?", listOf("2014 Forest Hills Drive", "The College Dropout", "The Warm Up", "The Sideline Story"), "Cultura", "2014 Forest Hills Drive es a menudo aclamado como la obra maestra de J. Cole porque marca un punto de inflexión introspectivo y autobiográfico, sin colaboraciones, y fue certificado triple platino sin promoción radial.")
        ),
        BilingualQuestion(
            id = 11851, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand jazzman de tous les temps?", listOf("Louis Armstrong", "Miles Davis", "John Coltrane", "Charlie Parker"), "Culture", "Louis Armstrong est souvent considéré comme le plus grand jazzman pour son influence majeure sur le développement du jazz, notamment avec son jeu de trompette novateur et sa voix emblématique."),
            en = LocalizedContent("Who is the greatest jazz musician of all time?", listOf("Louis Armstrong", "Miles Davis", "John Coltrane", "Charlie Parker"), "Culture", "Louis Armstrong is often considered the greatest jazz musician for his major influence on the development of jazz, especially with his innovative trumpet playing and iconic voice."),
            zh = LocalizedContent("有史以来最伟大的爵士音乐家是谁？", listOf("路易斯·阿姆斯特朗", "迈尔斯·戴维斯", "约翰·柯川", "查理·帕克"), "文化", "路易斯·阿姆斯特朗常被认为是最伟大的爵士音乐家，因为他通过创新的小号演奏和标志性的嗓音对爵士乐的发展产生了重大影响。"),
            es = LocalizedContent("¿Quién es el mejor músico de jazz de todos los tiempos?", listOf("Louis Armstrong", "Miles Davis", "John Coltrane", "Charlie Parker"), "Cultura", "Louis Armstrong es a menudo considerado el mejor músico de jazz por su gran influencia en el desarrollo del jazz, especialmente con su innovadora trompeta y su voz icónica.")
        ),
        BilingualQuestion(
            id = 11852, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"West End Blues\" a-t-il été enregistré?", listOf("1928", "1926", "1930", "1929"), "Culture", "\"West End Blues\" est un standard de jazz enregistré par Louis Armstrong et ses Hot Five en 1928, marquant un tournant dans l'histoire du jazz avec son célèbre solo de trompette introductif."),
            en = LocalizedContent("In what year was \"West End Blues\" recorded?", listOf("1928", "1926", "1930", "1929"), "Culture", "\"West End Blues\" is a jazz standard recorded by Louis Armstrong and his Hot Five in 1928, marking a turning point in jazz history with its famous introductory trumpet solo."),
            zh = LocalizedContent("《West End Blues》是在哪一年录制的？", listOf("1928", "1926", "1930", "1929"), "文化", "《West End Blues》是路易斯·阿姆斯特朗和他的Hot Five乐队于1928年录制的爵士乐标准曲，以其著名的小号独奏开场，标志着爵士乐史上的一个转折点。"),
            es = LocalizedContent("¿En qué año se grabó \"West End Blues\"?", listOf("1928", "1926", "1930", "1929"), "Cultura", "\"West End Blues\" es un estándar de jazz grabado por Louis Armstrong y sus Hot Five en 1928, marcando un punto de inflexión en la historia del jazz con su famoso solo de trompeta introductorio.")
        ),
        BilingualQuestion(
            id = 11853, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel saxophoniste a révolutionné le jazz?", listOf("Charlie Parker", "John Coltrane", "Ornette Coleman", "Sonny Rollins"), "Culture", "Charlie Parker, surnommé Bird, a révolutionné le jazz dans les années 1940 en inventant le bebop, un style rapide et complexe basé sur des improvisations harmoniques novatrices."),
            en = LocalizedContent("Which saxophonist revolutionized jazz?", listOf("Charlie Parker", "John Coltrane", "Ornette Coleman", "Sonny Rollins"), "Culture", "Charlie Parker, nicknamed Bird, revolutionized jazz in the 1940s by inventing bebop, a fast and complex style based on innovative harmonic improvisation."),
            zh = LocalizedContent("哪位萨克斯手革新了爵士乐？", listOf("查理·帕克", "约翰·柯川", "奥内特·科尔曼", "桑尼·罗林斯"), "文化", "查理·帕克，绰号“大鸟”，在20世纪40年代通过发明比波普（一种基于创新和声即兴的快速复杂风格）革新了爵士乐。"),
            es = LocalizedContent("¿Qué saxofonista revolucionó el jazz?", listOf("Charlie Parker", "John Coltrane", "Ornette Coleman", "Sonny Rollins"), "Cultura", "Charlie Parker, apodado Bird, revolucionó el jazz en la década de 1940 al inventar el bebop, un estilo rápido y complejo basado en la improvisación armónica innovadora.")
        ),
        BilingualQuestion(
            id = 11854, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Charlie Parker a-t-il enregistré \"Ko-Ko\"?", listOf("1945", "1943", "1947", "1944"), "Culture", "Charlie Parker a enregistré \"Ko-Ko\" en 1945, un morceau clé du bebop qui marque un tournant dans le jazz moderne."),
            en = LocalizedContent("In what year did Charlie Parker record \"Ko-Ko\"?", listOf("1945", "1943", "1947", "1944"), "Culture", "Charlie Parker recorded \"Ko-Ko\" in 1945, a key bebop piece that marked a turning point in modern jazz."),
            zh = LocalizedContent("查理·帕克在哪一年录制了《Ko-Ko》？", listOf("1945", "1943", "1947", "1944"), "文化", "查理·帕克于1945年录制了《Ko-Ko》，这是一首关键的比波普作品，标志着现代爵士乐的转折点。"),
            es = LocalizedContent("¿En qué año grabó Charlie Parker \"Ko-Ko\"?", listOf("1945", "1943", "1947", "1944"), "Cultura", "Charlie Parker grabó \"Ko-Ko\" en 1945, una pieza clave del bebop que marcó un punto de inflexión en el jazz moderno.")
        ),
        BilingualQuestion(
            id = 11855, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel trompettiste a révolutionné le jazz moderne?", listOf("Dizzy Gillespie", "Chet Baker", "Freddie Hubbard", "Wynton Marsalis"), "Culture", "Dizzy Gillespie a révolutionné le jazz moderne en popularisant le bebop dans les années 1940, un style caractérisé par des tempos rapides et des harmonies complexes."),
            en = LocalizedContent("Which trumpeter revolutionized modern jazz?", listOf("Dizzy Gillespie", "Chet Baker", "Freddie Hubbard", "Wynton Marsalis"), "Culture", "Dizzy Gillespie revolutionized modern jazz by popularizing bebop in the 1940s, a style characterized by fast tempos and complex harmonies."),
            zh = LocalizedContent("哪位小号手革新了现代爵士乐？", listOf("迪齐·吉莱斯皮", "切特·贝克", "弗雷迪·哈伯德", "温顿·马萨利斯"), "文化", "迪齐·吉莱斯皮通过在20世纪40年代推广比波普（一种以快速节奏和复杂和声为特征的风格）革新了现代爵士乐。"),
            es = LocalizedContent("¿Qué trompetista revolucionó el jazz moderno?", listOf("Dizzy Gillespie", "Chet Baker", "Freddie Hubbard", "Wynton Marsalis"), "Cultura", "Dizzy Gillespie revolucionó el jazz moderno al popularizar el bebop en la década de 1940, un estilo caracterizado por tempos rápidos y armonías complejas.")
        ),
        BilingualQuestion(
            id = 11856, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Dizzy Gillespie a-t-il enregistré \"A Night in Tunisia\"?", listOf("1946", "1944", "1948", "1945"), "Culture", "Dizzy Gillespie a enregistré \"A Night in Tunisia\" en 1946, une pièce emblématique du bebop qu'il avait composée quelques années plus tôt."),
            en = LocalizedContent("In what year did Dizzy Gillespie record \"A Night in Tunisia\"?", listOf("1946", "1944", "1948", "1945"), "Culture", "Dizzy Gillespie recorded \"A Night in Tunisia\" in 1946, an emblematic bebop piece he had composed a few years earlier."),
            zh = LocalizedContent("迪齐·吉莱斯皮在哪一年录制了《A Night in Tunisia》？", listOf("1946", "1944", "1948", "1945"), "文化", "迪齐·吉莱斯皮于1946年录制了《A Night in Tunisia》，这是他几年前创作的一首标志性比波普作品。"),
            es = LocalizedContent("¿En qué año grabó Dizzy Gillespie \"A Night in Tunisia\"?", listOf("1946", "1944", "1948", "1945"), "Cultura", "Dizzy Gillespie grabó \"A Night in Tunisia\" en 1946, una pieza emblemática del bebop que había compuesto unos años antes.")
        ),
        BilingualQuestion(
            id = 11857, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pianiste est considéré comme le plus grand de l'histoire du jazz?", listOf("Art Tatum", "Duke Ellington", "Oscar Peterson", "Bill Evans"), "Culture", "Art Tatum est reconnu pour sa virtuosité technique exceptionnelle et son harmonie complexe, révolutionnant le jazz dans les années 1930-40."),
            en = LocalizedContent("Which pianist is considered the greatest in jazz history?", listOf("Art Tatum", "Duke Ellington", "Oscar Peterson", "Bill Evans"), "Culture", "Art Tatum is recognized for his exceptional technical virtuosity and complex harmony, revolutionizing jazz in the 1930s-40s."),
            zh = LocalizedContent("哪位钢琴家被认为是爵士乐史上最伟大的？", listOf("阿特·塔图姆", "杜克·艾灵顿", "奥斯卡·彼得森", "比尔·埃文斯"), "文化", "阿特·塔图姆以其卓越的技术技巧和复杂的和声而闻名，在20世纪30至40年代革新了爵士乐。"),
            es = LocalizedContent("¿Qué pianista es considerado el más grande de la historia del jazz?", listOf("Art Tatum", "Duke Ellington", "Oscar Peterson", "Bill Evans"), "Cultura", "Art Tatum es reconocido por su excepcional virtuosismo técnico y su armonía compleja, revolucionando el jazz en las décadas de 1930-40.")
        ),
        BilingualQuestion(
            id = 11858, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"In a Silent Way\" a-t-il été enregistré?", listOf("1969", "1967", "1971", "1970"), "Culture", "\"In a Silent Way\" marque un tournant dans la carrière de Miles Davis vers le jazz fusion, et a été enregistré en février 1969."),
            en = LocalizedContent("In what year was \"In a Silent Way\" recorded?", listOf("1969", "1967", "1971", "1970"), "Culture", "\"In a Silent Way\" marks a turning point in Miles Davis's career towards jazz fusion, and was recorded in February 1969."),
            zh = LocalizedContent("《In a Silent Way》是在哪一年录制的？", listOf("1969", "1967", "1971", "1970"), "文化", "《In a Silent Way》标志着迈尔斯·戴维斯职业生涯向爵士融合的转折点，于1969年2月录制。"),
            es = LocalizedContent("¿En qué año se grabó \"In a Silent Way\"?", listOf("1969", "1967", "1971", "1970"), "Cultura", "\"In a Silent Way\" marca un punto de inflexión en la carrera de Miles Davis hacia el jazz fusión, y fue grabado en febrero de 1969.")
        ),
        BilingualQuestion(
            id = 11859, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Take Five\"?", listOf("Dave Brubeck", "Bill Evans", "Oscar Peterson", "Thelonious Monk"), "Culture", "Dave Brubeck a composé \"Take Five\" en 1959 pour son album \"Time Out\". Ce morceau est célèbre pour son rythme inhabituel en 5/4, une signature temporelle rare dans le jazz."),
            en = LocalizedContent("Which composer wrote \"Take Five\"?", listOf("Dave Brubeck", "Bill Evans", "Oscar Peterson", "Thelonious Monk"), "Culture", "Dave Brubeck composed \"Take Five\" in 1959 for his album \"Time Out\". This piece is famous for its unusual 5/4 time signature, a rare meter in jazz."),
            zh = LocalizedContent("哪位作曲家创作了《Take Five》？", listOf("戴夫·布鲁贝克", "比尔·埃文斯", "奥斯卡·彼得森", "塞隆尼斯·蒙克"), "文化", "戴夫·布鲁贝克于1959年为他的专辑《Time Out》创作了《Take Five》。这首曲子以其不寻常的5/4拍而闻名，这在爵士乐中是一种罕见的节拍。"),
            es = LocalizedContent("¿Qué compositor escribió \"Take Five\"?", listOf("Dave Brubeck", "Bill Evans", "Oscar Peterson", "Thelonious Monk"), "Cultura", "Dave Brubeck compuso \"Take Five\" en 1959 para su álbum \"Time Out\". Esta pieza es famosa por su inusual compás de 5/4, un metro raro en el jazz.")
        ),
        BilingualQuestion(
            id = 11860, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Take Five\" a-t-il été enregistré?", listOf("1959", "1957", "1961", "1958"), "Culture", "Composé par Paul Desmond et popularisé par le Dave Brubeck Quartet, \"Take Five\" a été enregistré en 1959 pour l'album \"Time Out\"."),
            en = LocalizedContent("In what year was \"Take Five\" recorded?", listOf("1959", "1957", "1961", "1958"), "Culture", "Composed by Paul Desmond and popularized by the Dave Brubeck Quartet, \"Take Five\" was recorded in 1959 for the album \"Time Out\"."),
            zh = LocalizedContent("《Take Five》是在哪一年录制的？", listOf("1959", "1957", "1961", "1958"), "文化", "由保罗·戴斯蒙德作曲、戴夫·布鲁贝克四重奏推广的《Take Five》于1959年为专辑《Time Out》录制。"),
            es = LocalizedContent("¿En qué año se grabó \"Take Five\"?", listOf("1959", "1957", "1961", "1958"), "Cultura", "Compuesta por Paul Desmond y popularizada por el Dave Brubeck Quartet, \"Take Five\" fue grabada en 1959 para el álbum \"Time Out\".")
        ),
        BilingualQuestion(
            id = 11861, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le bassiste le plus influent du jazz?", listOf("Charles Mingus", "Ray Brown", "Paul Chambers", "Oscar Pettiford"), "Culture", "Charles Mingus est considéré comme l'un des bassistes et compositeurs les plus novateurs du jazz, mêlant blues, gospel et free jazz dans des œuvres comme \"Mingus Ah Um\"."),
            en = LocalizedContent("Who is the most influential jazz bassist?", listOf("Charles Mingus", "Ray Brown", "Paul Chambers", "Oscar Pettiford"), "Culture", "Charles Mingus is considered one of the most innovative jazz bassists and composers, blending blues, gospel, and free jazz in works like \"Mingus Ah Um\"."),
            zh = LocalizedContent("最有影响力的爵士贝斯手是谁？", listOf("查尔斯·明格斯", "雷·布朗", "保罗·钱伯斯", "奥斯卡·佩蒂福德"), "文化", "查尔斯·明格斯被认为是最具创新性的爵士贝斯手和作曲家之一，在《Mingus Ah Um》等作品中融合了蓝调、福音和自由爵士。"),
            es = LocalizedContent("¿Quién es el bajista de jazz más influyente?", listOf("Charles Mingus", "Ray Brown", "Paul Chambers", "Oscar Pettiford"), "Cultura", "Charles Mingus es considerado uno de los bajistas y compositores de jazz más innovadores, combinando blues, gospel y free jazz en obras como \"Mingus Ah Um\".")
        ),
        BilingualQuestion(
            id = 11862, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Mingus Ah Um\" a-t-il été enregistré?", listOf("1959", "1957", "1961", "1958"), "Culture", "\"Mingus Ah Um\" est un album de jazz emblématique de Charles Mingus, enregistré en 1959, une année faste pour le jazz avec des chefs-d’œuvre comme \"Kind of Blue\" de Miles Davis."),
            en = LocalizedContent("In what year was \"Mingus Ah Um\" recorded?", listOf("1959", "1957", "1961", "1958"), "Culture", "\"Mingus Ah Um\" is an iconic jazz album by Charles Mingus, recorded in 1959, a fruitful year for jazz with masterpieces like Miles Davis's \"Kind of Blue\"."),
            zh = LocalizedContent("《Mingus Ah Um》是在哪一年录制的？", listOf("1959", "1957", "1961", "1958"), "文化", "《Mingus Ah Um》是查尔斯·明格斯的标志性爵士专辑，录制于1959年，那是爵士乐丰收的一年，诞生了迈尔斯·戴维斯的《Kind of Blue》等杰作。"),
            es = LocalizedContent("¿En qué año se grabó \"Mingus Ah Um\"?", listOf("1959", "1957", "1961", "1958"), "Cultura", "\"Mingus Ah Um\" es un álbum de jazz icónico de Charles Mingus, grabado en 1959, un año fructífero para el jazz con obras maestras como \"Kind of Blue\" de Miles Davis.")
        ),
        BilingualQuestion(
            id = 11863, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Round Midnight\"?", listOf("Thelonious Monk", "Duke Ellington", "Charlie Parker", "Dizzy Gillespie"), "Culture", "Thelonious Monk a composé \"Round Midnight\" dans les années 1940, devenant l'un des standards de jazz les plus enregistrés."),
            en = LocalizedContent("Which composer wrote \"Round Midnight\"?", listOf("Thelonious Monk", "Duke Ellington", "Charlie Parker", "Dizzy Gillespie"), "Culture", "Thelonious Monk composed \"Round Midnight\" in the 1940s, becoming one of the most recorded jazz standards."),
            zh = LocalizedContent("哪位作曲家创作了《Round Midnight》？", listOf("塞隆尼斯·蒙克", "杜克·艾灵顿", "查理·帕克", "迪齐·吉莱斯皮"), "文化", "塞隆尼斯·蒙克在20世纪40年代创作了《Round Midnight》，成为录制次数最多的爵士标准曲之一。"),
            es = LocalizedContent("¿Qué compositor escribió \"Round Midnight\"?", listOf("Thelonious Monk", "Duke Ellington", "Charlie Parker", "Dizzy Gillespie"), "Cultura", "Thelonious Monk compuso \"Round Midnight\" en la década de 1940, convirtiéndose en uno de los estándares de jazz más grabados.")
        ),
        BilingualQuestion(
            id = 11864, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Blue Train\" a-t-il été enregistré?", listOf("1957", "1955", "1959", "1958"), "Culture", "Blue Train est un album de John Coltrane, enregistré en 1957 pour le label Blue Note, et il est considéré comme un chef-d'œuvre du jazz hard bop."),
            en = LocalizedContent("In what year was \"Blue Train\" recorded?", listOf("1957", "1955", "1959", "1958"), "Culture", "Blue Train is an album by John Coltrane, recorded in 1957 for the Blue Note label, and is considered a masterpiece of hard bop jazz."),
            zh = LocalizedContent("《Blue Train》是在哪一年录制的？", listOf("1957", "1955", "1959", "1958"), "文化", "《Blue Train》是约翰·柯川的专辑，于1957年为Blue Note唱片公司录制，被认为是硬波普爵士的杰作。"),
            es = LocalizedContent("¿En qué año se grabó \"Blue Train\"?", listOf("1957", "1955", "1959", "1958"), "Cultura", "Blue Train es un álbum de John Coltrane, grabado en 1957 para el sello Blue Note, y es considerado una obra maestra del jazz hard bop.")
        ),
        BilingualQuestion(
            id = 11865, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel vocalist est considéré comme le meilleur du jazz?", listOf("Ella Fitzgerald", "Sarah Vaughan", "Billie Holiday", "Tous les précédents"), "Culture", "Le jazz a vu émerger de nombreux vocalistes légendaires comme Ella Fitzgerald, Billie Holiday ou Louis Armstrong, chacun excellent dans un style différent, rendant impossible de désigner un seul meilleur."),
            en = LocalizedContent("Which vocalist is considered the best in jazz?", listOf("Ella Fitzgerald", "Sarah Vaughan", "Billie Holiday", "All of the above"), "Culture", "Jazz has seen many legendary vocalists like Ella Fitzgerald, Billie Holiday, and Louis Armstrong, each excelling in different styles, making it impossible to designate a single best."),
            zh = LocalizedContent("哪位歌手被认为是爵士乐中最好的？", listOf("艾拉·菲茨杰拉德", "莎拉·沃恩", "比莉·哈乐黛", "以上所有"), "文化", "爵士乐涌现了许多传奇歌手，如艾拉·菲茨杰拉德、比莉·哈乐黛和路易斯·阿姆斯特朗，每位都在不同风格中表现出色，因此无法指定唯一最佳。"),
            es = LocalizedContent("¿Qué vocalista es considerado el mejor del jazz?", listOf("Ella Fitzgerald", "Sarah Vaughan", "Billie Holiday", "Todos los anteriores"), "Cultura", "El jazz ha visto surgir muchos vocalistas legendarios como Ella Fitzgerald, Billie Holiday y Louis Armstrong, cada uno destacando en un estilo diferente, lo que hace imposible designar a uno solo como el mejor.")
        ),
        BilingualQuestion(
            id = 11866, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Body and Soul\" a-t-il été enregistré par Coleman Hawkins?", listOf("1939", "1937", "1941", "1940"), "Culture", "Coleman Hawkins a enregistré \"Body and Soul\" le 11 octobre 1939 lors d'une session pour le label Bluebird, et cette version est devenue un standard du jazz."),
            en = LocalizedContent("In what year was \"Body and Soul\" recorded by Coleman Hawkins?", listOf("1939", "1937", "1941", "1940"), "Culture", "Coleman Hawkins recorded \"Body and Soul\" on October 11, 1939, during a session for the Bluebird label, and this version became a jazz standard."),
            zh = LocalizedContent("科尔曼·霍金斯在哪一年录制了《Body and Soul》？", listOf("1939", "1937", "1941", "1940"), "文化", "科尔曼·霍金斯于1939年10月11日为Bluebird唱片公司录制了《Body and Soul》，这个版本成为了爵士标准曲。"),
            es = LocalizedContent("¿En qué año grabó Coleman Hawkins \"Body and Soul\"?", listOf("1939", "1937", "1941", "1940"), "Cultura", "Coleman Hawkins grabó \"Body and Soul\" el 11 de octubre de 1939 durante una sesión para el sello Bluebird, y esta versión se convirtió en un estándar del jazz.")
        ),
        BilingualQuestion(
            id = 11867, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"Autumn Leaves\"?", listOf("Joseph Kosma", "Jacques Prévert", "Yip Harburg", "Tous les précédents"), "Culture", "\"Autumn Leaves\" est une chanson française de 1945, \"Les Feuilles mortes\", composée par Joseph Kosma sur des paroles de Jacques Prévert. La version instrumentale jazz la plus célèbre est celle de Cannonball Adderley, mais le standard a été repris par de nombreux artistes comme Miles Davis ou Bill Evans."),
            en = LocalizedContent("Which composer wrote \"Autumn Leaves\"?", listOf("Joseph Kosma", "Jacques Prévert", "Yip Harburg", "All of the above"), "Culture", "\"Autumn Leaves\" is a 1945 French song, \"Les Feuilles mortes\", composed by Joseph Kosma with lyrics by Jacques Prévert. The most famous jazz instrumental version is by Cannonball Adderley, but the standard has been covered by many artists like Miles Davis or Bill Evans."),
            zh = LocalizedContent("哪位作曲家创作了《Autumn Leaves》？", listOf("约瑟夫·科斯马", "雅克·普雷维尔", "伊普·哈伯格", "以上所有"), "文化", "《Autumn Leaves》是1945年的法国歌曲《Les Feuilles mortes》，由约瑟夫·科斯马作曲、雅克·普雷维尔作词。最著名的爵士器乐版本是坎农鲍尔·阿德利演奏的，但该标准曲被迈尔斯·戴维斯、比尔·埃文斯等众多艺术家翻唱。"),
            es = LocalizedContent("¿Qué compositor escribió \"Autumn Leaves\"?", listOf("Joseph Kosma", "Jacques Prévert", "Yip Harburg", "Todos los anteriores"), "Cultura", "\"Autumn Leaves\" es una canción francesa de 1945, \"Les Feuilles mortes\", compuesta por Joseph Kosma con letra de Jacques Prévert. La versión instrumental de jazz más famosa es la de Cannonball Adderley, pero el estándar ha sido versionado por muchos artistas como Miles Davis o Bill Evans.")
        ),
        BilingualQuestion(
            id = 11868, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année \"Cookin' with the Miles Davis Quintet\" a-t-il été enregistré?", listOf("1957", "1955", "1959", "1958"), "Culture", "Cookin' with the Miles Davis Quintet fait partie d'une série d'albums enregistrés lors de sessions marathon pour Prestige Records en 1956, mais l'album a été assemblé et publié en 1957."),
            en = LocalizedContent("In what year was \"Cookin' with the Miles Davis Quintet\" recorded?", listOf("1957", "1955", "1959", "1958"), "Culture", "Cookin' with the Miles Davis Quintet is part of a series of albums recorded during marathon sessions for Prestige Records in 1956, but the album was assembled and released in 1957."),
            zh = LocalizedContent("《Cookin' with the Miles Davis Quintet》是在哪一年录制的？", listOf("1957", "1955", "1959", "1958"), "文化", "《Cookin' with the Miles Davis Quintet》是1956年为Prestige唱片公司马拉松式录制的一系列专辑之一，但专辑于1957年整理并发行。"),
            es = LocalizedContent("¿En qué año se grabó \"Cookin' with the Miles Davis Quintet\"?", listOf("1957", "1955", "1959", "1958"), "Cultura", "Cookin' with the Miles Davis Quintet es parte de una serie de álbumes grabados durante sesiones maratónicas para Prestige Records en 1956, pero el álbum fue ensamblado y publicado en 1957.")
        ),
        BilingualQuestion(
            id = 11869, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit \"All the Things You Are\"?", listOf("Jerome Kern", "Oscar Hammerstein II", "George Gershwin", "Cole Porter"), "Culture", "Jerome Kern a composé \"All the Things You Are\" en 1939 pour la comédie musicale \"Very Warm for May\", avec des paroles d'Oscar Hammerstein II. Ce standard de jazz est l'un des morceaux les plus célèbres de Kern."),
            en = LocalizedContent("Which composer wrote \"All the Things You Are\"?", listOf("Jerome Kern", "Oscar Hammerstein II", "George Gershwin", "Cole Porter"), "Culture", "Jerome Kern composed \"All the Things You Are\" in 1939 for the musical \"Very Warm for May\", with lyrics by Oscar Hammerstein II. This jazz standard is one of Kern's most famous pieces."),
            zh = LocalizedContent("哪位作曲家创作了《All the Things You Are》？", listOf("杰罗姆·科恩", "奥斯卡·汉默斯坦二世", "乔治·格什温", "科尔·波特"), "文化", "杰罗姆·科恩于1939年为音乐剧《Very Warm for May》创作了《All the Things You Are》，由奥斯卡·汉默斯坦二世作词。这首爵士标准曲是科恩最著名的作品之一。"),
            es = LocalizedContent("¿Qué compositor escribió \"All the Things You Are\"?", listOf("Jerome Kern", "Oscar Hammerstein II", "George Gershwin", "Cole Porter"), "Cultura", "Jerome Kern compuso \"All the Things You Are\" en 1939 para el musical \"Very Warm for May\", con letra de Oscar Hammerstein II. Este estándar de jazz es una de las piezas más famosas de Kern.")
        ),
        BilingualQuestion(
            id = 11870, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"A Love Supreme\" a-t-il été enregistré?", listOf("1964", "1962", "1966", "1965"), "Culture", "\"A Love Supreme\" est un album de jazz de John Coltrane, enregistré en une seule session le 9 décembre 1964 et sorti en 1965."),
            en = LocalizedContent("In what year was \"A Love Supreme\" recorded?", listOf("1964", "1962", "1966", "1965"), "Culture", "\"A Love Supreme\" is a jazz album by John Coltrane, recorded in a single session on December 9, 1964, and released in 1965."),
            zh = LocalizedContent("《A Love Supreme》是在哪一年录制的？", listOf("1964", "1962", "1966", "1965"), "文化", "《A Love Supreme》是约翰·柯川的爵士专辑，于1964年12月9日一次录制完成，并于1965年发行。"),
            es = LocalizedContent("¿En qué año se grabó \"A Love Supreme\"?", listOf("1964", "1962", "1966", "1965"), "Cultura", "\"A Love Supreme\" es un álbum de jazz de John Coltrane, grabado en una sola sesión el 9 de diciembre de 1964 y lanzado en 1965.")
        ),
        BilingualQuestion(
            id = 11871, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le premier film du MCU?", listOf("Iron Man", "The Incredible Hulk", "Fantastic Four", "Blade"), "Culture", "Iron Man, sorti en 2008, a lancé l'univers cinématographique Marvel en introduisant Tony Stark et la scène post-générique avec Nick Fury."),
            en = LocalizedContent("What is the first MCU film?", listOf("Iron Man", "The Incredible Hulk", "Fantastic Four", "Blade"), "Culture", "Iron Man, released in 2008, launched the Marvel Cinematic Universe by introducing Tony Stark and the post-credits scene with Nick Fury."),
            zh = LocalizedContent("漫威电影宇宙的第一部电影是什么？", listOf("钢铁侠", "无敌浩克", "神奇四侠", "刀锋战士"), "文化", "2008年上映的《钢铁侠》开启了漫威电影宇宙，引入了托尼·斯塔克以及尼克·弗瑞的片尾彩蛋。"),
            es = LocalizedContent("¿Cuál es la primera película del MCU?", listOf("Iron Man", "The Incredible Hulk", "Fantastic Four", "Blade"), "Cultura", "Iron Man, estrenada en 2008, lanzó el Universo Cinematográfico de Marvel al presentar a Tony Stark y la escena post-créditos con Nick Fury.")
        ),
        BilingualQuestion(
            id = 11872, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Iron Man\" a-t-il été publié?", listOf("2008", "2006", "2010", "2007"), "Culture", "Le film Iron Man, qui a lancé l'univers cinématographique Marvel, est sorti en salles en 2008."),
            en = LocalizedContent("In what year was \"Iron Man\" released?", listOf("2008", "2006", "2010", "2007"), "Culture", "The film Iron Man, which launched the Marvel Cinematic Universe, was released in theaters in 2008."),
            zh = LocalizedContent("《钢铁侠》是在哪一年上映的？", listOf("2008", "2006", "2010", "2007"), "文化", "电影《钢铁侠》开启了漫威电影宇宙，于2008年在影院上映。"),
            es = LocalizedContent("¿En qué año se estrenó \"Iron Man\"?", listOf("2008", "2006", "2010", "2007"), "Cultura", "La película Iron Man, que lanzó el Universo Cinematográfico de Marvel, se estrenó en cines en 2008.")
        ),
        BilingualQuestion(
            id = 11873, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué Iron Man dans le MCU?", listOf("Robert Downey Jr.", "Tobey Maguire", "Chris Evans", "Mark Ruffalo"), "Culture", "Robert Downey Jr. a incarné Tony Stark / Iron Man dans le Marvel Cinematic Universe de 2008 à 2019, lançant la franchise avec le premier film Iron Man."),
            en = LocalizedContent("Which actor played Iron Man in the MCU?", listOf("Robert Downey Jr.", "Tobey Maguire", "Chris Evans", "Mark Ruffalo"), "Culture", "Robert Downey Jr. portrayed Tony Stark / Iron Man in the Marvel Cinematic Universe from 2008 to 2019, launching the franchise with the first Iron Man film."),
            zh = LocalizedContent("哪位演员在漫威电影宇宙中饰演了钢铁侠？", listOf("小罗伯特·唐尼", "托比·马奎尔", "克里斯·埃文斯", "马克·鲁弗洛"), "文化", "小罗伯特·唐尼在2008年至2019年的漫威电影宇宙中饰演托尼·斯塔克/钢铁侠，并以第一部《钢铁侠》电影开启了该系列。"),
            es = LocalizedContent("¿Qué actor interpretó a Iron Man en el MCU?", listOf("Robert Downey Jr.", "Tobey Maguire", "Chris Evans", "Mark Ruffalo"), "Cultura", "Robert Downey Jr. interpretó a Tony Stark / Iron Man en el Universo Cinematográfico de Marvel desde 2008 hasta 2019, lanzando la franquicia con la primera película de Iron Man.")
        ),
        BilingualQuestion(
            id = 11874, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le titre du premier film \"Avengers\"?", listOf("The Avengers", "Avengers: Age of Ultron", "Avengers: Infinity War", "Avengers: Endgame"), "Culture", "Sorti en 2012, le premier film de la saga Marvel s'intitule \"The Avengers\", titre original conservé en français pour désigner l'équipe de super-héros."),
            en = LocalizedContent("What is the title of the first \"Avengers\" film?", listOf("The Avengers", "Avengers: Age of Ultron", "Avengers: Infinity War", "Avengers: Endgame"), "Culture", "Released in 2012, the first film of the Marvel saga is titled \"The Avengers\", the original title retained in French to refer to the superhero team."),
            zh = LocalizedContent("第一部《复仇者联盟》电影的片名是什么？", listOf("复仇者联盟", "复仇者联盟2：奥创纪元", "复仇者联盟3：无限战争", "复仇者联盟4：终局之战"), "文化", "2012年上映的漫威系列第一部电影名为《复仇者联盟》，英文原名在法语中保留以指代超级英雄团队。"),
            es = LocalizedContent("¿Cuál es el título de la primera película de \"Avengers\"?", listOf("The Avengers", "Avengers: Age of Ultron", "Avengers: Infinity War", "Avengers: Endgame"), "Cultura", "Estrenada en 2012, la primera película de la saga Marvel se titula \"The Avengers\", título original conservado en francés para referirse al equipo de superhéroes.")
        ),
        BilingualQuestion(
            id = 11875, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"The Avengers\" a-t-il été publié?", listOf("2012", "2010", "2014", "2011"), "Culture", "The Avengers est sorti en 2012, marquant le premier crossover majeur de l'univers cinématographique Marvel, rassemblant Iron Man, Captain America, Thor et Hulk."),
            en = LocalizedContent("In what year was \"The Avengers\" released?", listOf("2012", "2010", "2014", "2011"), "Culture", "The Avengers was released in 2012, marking the first major crossover of the Marvel Cinematic Universe, bringing together Iron Man, Captain America, Thor, and Hulk."),
            zh = LocalizedContent("《复仇者联盟》是在哪一年上映的？", listOf("2012", "2010", "2014", "2011"), "文化", "《复仇者联盟》于2012年上映，标志着漫威电影宇宙的首次重大交叉，集结了钢铁侠、美国队长、雷神和绿巨人。"),
            es = LocalizedContent("¿En qué año se estrenó \"The Avengers\"?", listOf("2012", "2010", "2014", "2011"), "Cultura", "The Avengers se estrenó en 2012, marcando el primer gran crossover del Universo Cinematográfico de Marvel, reuniendo a Iron Man, Capitán América, Thor y Hulk.")
        ),
        BilingualQuestion(
            id = 11876, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a réalisé \"The Avengers\"?", listOf("Joss Whedon", "Anthony Russo", "Joe Russo", "Cate Shortland"), "Culture", "Joss Whedon a réalisé \"The Avengers\" (2012), premier film réunissant les super-héros Marvel dans une équipe commune."),
            en = LocalizedContent("Which director directed \"The Avengers\"?", listOf("Joss Whedon", "Anthony Russo", "Joe Russo", "Cate Shortland"), "Culture", "Joss Whedon directed \"The Avengers\" (2012), the first film to bring together Marvel superheroes in a common team."),
            zh = LocalizedContent("哪位导演执导了《复仇者联盟》？", listOf("乔斯·韦登", "安东尼·罗素", "乔·罗素", "凯特·绍特兰"), "文化", "乔斯·韦登执导了《复仇者联盟》（2012），这是第一部将漫威超级英雄集结成一个团队的电影。"),
            es = LocalizedContent("¿Qué director dirigió \"The Avengers\"?", listOf("Joss Whedon", "Anthony Russo", "Joe Russo", "Cate Shortland"), "Cultura", "Joss Whedon dirigió \"The Avengers\" (2012), la primera película que reunió a los superhéroes de Marvel en un equipo común.")
        ),
        BilingualQuestion(
            id = 11877, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film MCU introduit Spider-Man?", listOf("Captain America: Civil War", "Spider-Man: Homecoming", "The Avengers", "Ant-Man"), "Culture", "Spider-Man apparaît pour la première fois dans le MCU dans Captain America: Civil War, où Tony Stark le recrute pour combattre aux côtés des Avengers."),
            en = LocalizedContent("Which MCU film introduces Spider-Man?", listOf("Captain America: Civil War", "Spider-Man: Homecoming", "The Avengers", "Ant-Man"), "Culture", "Spider-Man first appears in the MCU in Captain America: Civil War, where Tony Stark recruits him to fight alongside the Avengers."),
            zh = LocalizedContent("哪部漫威电影宇宙电影引入了蜘蛛侠？", listOf("美国队长3：内战", "蜘蛛侠：英雄归来", "复仇者联盟", "蚁人"), "文化", "蜘蛛侠首次出现在漫威电影宇宙的《美国队长3：内战》中，托尼·斯塔克招募他与复仇者联盟并肩作战。"),
            es = LocalizedContent("¿Qué película del MCU introduce a Spider-Man?", listOf("Captain America: Civil War", "Spider-Man: Homecoming", "The Avengers", "Ant-Man"), "Cultura", "Spider-Man aparece por primera vez en el MCU en Captain America: Civil War, donde Tony Stark lo recluta para luchar junto a los Avengers.")
        ),
        BilingualQuestion(
            id = 11878, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année \"Captain America: Civil War\" a-t-il été publié?", listOf("2016", "2014", "2018", "2015"), "Culture", "Captain America: Civil War est sorti en 2016, marquant le treizième film de l'univers cinématographique Marvel. Il met en scène l'affrontement des Avengers suite aux accords de Sokovie."),
            en = LocalizedContent("In what year was \"Captain America: Civil War\" released?", listOf("2016", "2014", "2018", "2015"), "Culture", "Captain America: Civil War was released in 2016, marking the thirteenth film of the Marvel Cinematic Universe. It depicts the Avengers' conflict following the Sokovia Accords."),
            zh = LocalizedContent("《美国队长3：内战》是在哪一年上映的？", listOf("2016", "2014", "2018", "2015"), "文化", "《美国队长3：内战》于2016年上映，是漫威电影宇宙的第十三部电影。它描绘了复仇者联盟在索科维亚协议后的冲突。"),
            es = LocalizedContent("¿En qué año se estrenó \"Captain America: Civil War\"?", listOf("2016", "2014", "2018", "2015"), "Cultura", "Captain America: Civil War se estrenó en 2016, marcando la decimotercera película del Universo Cinematográfico de Marvel. Representa el conflicto de los Avengers tras los Acuerdos de Sokovia.")
        ),
        BilingualQuestion(
            id = 11879, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue Captain America dans le MCU?", listOf("Chris Evans", "Chris Hemsworth", "Chris Pratt", "Chris Pine"), "Culture", "Chris Evans a incarné Steve Rogers, alias Captain America, dans l'univers cinématographique Marvel (MCU) depuis le film Captain America: First Avenger en 2011 jusqu'à Avengers: Endgame en 2019."),
            en = LocalizedContent("Which actor plays Captain America in the MCU?", listOf("Chris Evans", "Chris Hemsworth", "Chris Pratt", "Chris Pine"), "Culture", "Chris Evans portrayed Steve Rogers, aka Captain America, in the Marvel Cinematic Universe from the film Captain America: First Avenger in 2011 to Avengers: Endgame in 2019."),
            zh = LocalizedContent("哪位演员在漫威电影宇宙中饰演美国队长？", listOf("克里斯·埃文斯", "克里斯·海姆斯沃斯", "克里斯·帕拉特", "克里斯·派恩"), "文化", "克里斯·埃文斯在漫威电影宇宙中饰演史蒂夫·罗杰斯（美国队长），从2011年的《美国队长：复仇者先锋》到2019年的《复仇者联盟4：终局之战》。"),
            es = LocalizedContent("¿Qué actor interpreta a Captain America en el MCU?", listOf("Chris Evans", "Chris Hemsworth", "Chris Pratt", "Chris Pine"), "Cultura", "Chris Evans interpretó a Steve Rogers, alias Captain America, en el Universo Cinematográfico de Marvel desde la película Captain America: First Avenger en 2011 hasta Avengers: Endgame en 2019.")
        ),
        BilingualQuestion(
            id = 11880, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le titre du dernier film \"Avengers\" ?", listOf("Avengers: Endgame", "Avengers: Infinity War", "Avengers: Age of Ultron", "The Avengers"), "Culture", "Avengers: Endgame est le quatrième volet de la saga Avengers, sorti en 2019, concluant l'arc narratif débuté avec Infinity War."),
            en = LocalizedContent("What is the title of the last \"Avengers\" movie?", listOf("Avengers: Endgame", "Avengers: Infinity War", "Avengers: Age of Ultron", "The Avengers"), "Culture", "Avengers: Endgame is the fourth installment of the Avengers saga, released in 2019, concluding the narrative arc that began with Infinity War."),
            zh = LocalizedContent("最后一部《复仇者联盟》电影的标题是什么？", listOf("复仇者联盟4：终局之战", "复仇者联盟3：无限战争", "复仇者联盟2：奥创纪元", "复仇者联盟"), "文化", "《复仇者联盟4：终局之战》是复仇者系列电影的第四部，于2019年上映，结束了从《无限战争》开始的叙事弧线。"),
            es = LocalizedContent("¿Cuál es el título de la última película de \"Avengers\"?", listOf("Avengers: Endgame", "Avengers: Infinity War", "Avengers: Age of Ultron", "The Avengers"), "Cultura", "Avengers: Endgame es la cuarta entrega de la saga de los Vengadores, estrenada en 2019, que concluye el arco narrativo iniciado con Infinity War.")
        ),
        BilingualQuestion(
            id = 11881, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année \"Avengers: Endgame\" a-t-il été publié?", listOf("2019", "2017", "2021", "2018"), "Culture", "Avengers: Endgame est sorti en 2019, concluant la phase 3 du Marvel Cinematic Universe et devenant le film le plus rentable de l'année."),
            en = LocalizedContent("In what year was \"Avengers: Endgame\" released?", listOf("2019", "2017", "2021", "2018"), "Culture", "Avengers: Endgame was released in 2019, concluding Phase 3 of the Marvel Cinematic Universe and becoming the highest-grossing film of the year."),
            zh = LocalizedContent("《复仇者联盟4：终局之战》是哪一年上映的？", listOf("2019", "2017", "2021", "2018"), "文化", "《复仇者联盟4：终局之战》于2019年上映，结束了漫威电影宇宙的第三阶段，并成为当年最卖座的电影。"),
            es = LocalizedContent("¿En qué año se estrenó \"Avengers: Endgame\"?", listOf("2019", "2017", "2021", "2018"), "Cultura", "Avengers: Endgame se estrenó en 2019, concluyendo la Fase 3 del Universo Cinematográfico de Marvel y convirtiéndose en la película más taquillera del año.")
        ),
        BilingualQuestion(
            id = 11882, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film \"Avengers\" introduit Thanos?", listOf("Avengers: Infinity War", "Avengers: Age of Ultron", "The Avengers", "Avengers: Endgame"), "Culture", "Thanos apparaît brièvement dans les scènes post-générique de \"Avengers\" et \"Avengers: L'Ère d'Ultron\", mais c'est dans \"Avengers: Infinity War\" qu'il devient le principal antagoniste et est pleinement introduit comme le titan fou cherchant les Pierres d'Infinité."),
            en = LocalizedContent("Which \"Avengers\" movie introduces Thanos?", listOf("Avengers: Infinity War", "Avengers: Age of Ultron", "The Avengers", "Avengers: Endgame"), "Culture", "Thanos appears briefly in the post-credit scenes of \"The Avengers\" and \"Avengers: Age of Ultron\", but it is in \"Avengers: Infinity War\" that he becomes the main antagonist and is fully introduced as the mad titan seeking the Infinity Stones."),
            zh = LocalizedContent("哪部《复仇者联盟》电影引入了灭霸？", listOf("复仇者联盟3：无限战争", "复仇者联盟2：奥创纪元", "复仇者联盟", "复仇者联盟4：终局之战"), "文化", "灭霸在《复仇者联盟》和《复仇者联盟2：奥创纪元》的片尾彩蛋中短暂出现，但直到《复仇者联盟3：无限战争》他才成为主要反派，并被全面介绍为寻找无限宝石的疯狂泰坦。"),
            es = LocalizedContent("¿Qué película de \"Avengers\" presenta a Thanos?", listOf("Avengers: Infinity War", "Avengers: Age of Ultron", "The Avengers", "Avengers: Endgame"), "Cultura", "Thanos aparece brevemente en las escenas post-créditos de \"The Avengers\" y \"Avengers: Age of Ultron\", pero es en \"Avengers: Infinity War\" donde se convierte en el principal antagonista y se presenta plenamente como el titán loco que busca las Gemas del Infinito.")
        ),
        BilingualQuestion(
            id = 11883, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel premier film DC Comics a lancé l'univers cinématique?", listOf("Man of Steel", "Batman Begins", "Wonder Woman", "Aquaman"), "Culture", "Man of Steel, sorti en 2013, a été le premier film à lancer l'univers cinématographique DC (DC Extended Universe), suivi par Batman v Superman."),
            en = LocalizedContent("Which first DC Comics movie launched the cinematic universe?", listOf("Man of Steel", "Batman Begins", "Wonder Woman", "Aquaman"), "Culture", "Man of Steel, released in 2013, was the first film to launch the DC Extended Universe, followed by Batman v Superman."),
            zh = LocalizedContent("哪部DC漫画电影首次开启了电影宇宙？", listOf("超人：钢铁之躯", "蝙蝠侠：侠影之谜", "神奇女侠", "海王"), "文化", "《超人：钢铁之躯》于2013年上映，是首部开启DC扩展宇宙的电影，随后是《蝙蝠侠大战超人》。"),
            es = LocalizedContent("¿Qué primera película de DC Comics lanzó el universo cinematográfico?", listOf("Man of Steel", "Batman Begins", "Wonder Woman", "Aquaman"), "Cultura", "Man of Steel, estrenada en 2013, fue la primera película en lanzar el Universo Extendido de DC, seguida de Batman v Superman.")
        ),
        BilingualQuestion(
            id = 11884, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Man of Steel\" a-t-il été publié?", listOf("2013", "2011", "2015", "2012"), "Culture", "\"Man of Steel\", le film de Zack Snyder avec Henry Cavill en Superman, est sorti en 2013. C'était le premier volet de l'univers cinématographique DC étendu."),
            en = LocalizedContent("In what year was \"Man of Steel\" released?", listOf("2013", "2011", "2015", "2012"), "Culture", "\"Man of Steel\", Zack Snyder's film starring Henry Cavill as Superman, was released in 2013. It was the first installment of the DC Extended Universe."),
            zh = LocalizedContent("《超人：钢铁之躯》是哪一年上映的？", listOf("2013", "2011", "2015", "2012"), "文化", "《超人：钢铁之躯》是扎克·施奈德执导、亨利·卡维尔主演的超人电影，于2013年上映，是DC扩展宇宙的第一部作品。"),
            es = LocalizedContent("¿En qué año se estrenó \"Man of Steel\"?", listOf("2013", "2011", "2015", "2012"), "Cultura", "\"Man of Steel\", la película de Zack Snyder con Henry Cavill como Superman, se estrenó en 2013. Fue la primera entrega del Universo Extendido de DC.")
        ),
        BilingualQuestion(
            id = 11885, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé \"Man of Steel\"?", listOf("Zack Snyder", "Christopher Nolan", "James Gunn", "Denis Villeneuve"), "Culture", "Zack Snyder a réalisé \"Man of Steel\" (2013), un reboot de Superman produit par Christopher Nolan."),
            en = LocalizedContent("Which director directed \"Man of Steel\"?", listOf("Zack Snyder", "Christopher Nolan", "James Gunn", "Denis Villeneuve"), "Culture", "Zack Snyder directed \"Man of Steel\" (2013), a Superman reboot produced by Christopher Nolan."),
            zh = LocalizedContent("哪位导演执导了《超人：钢铁之躯》？", listOf("扎克·施奈德", "克里斯托弗·诺兰", "詹姆斯·古恩", "丹尼斯·维伦纽瓦"), "文化", "扎克·施奈德执导了《超人：钢铁之躯》（2013），这是一部由克里斯托弗·诺兰监制的超人重启之作。"),
            es = LocalizedContent("¿Qué director dirigió \"Man of Steel\"?", listOf("Zack Snyder", "Christopher Nolan", "James Gunn", "Denis Villeneuve"), "Cultura", "Zack Snyder dirigió \"Man of Steel\" (2013), un reinicio de Superman producido por Christopher Nolan.")
        ),
        BilingualQuestion(
            id = 11886, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur joue Superman dans \"Man of Steel\"?", listOf("Henry Cavill", "Brandon Routh", "Tom Welling", "George Reeves"), "Culture", "Henry Cavill incarne Superman dans \"Man of Steel\" (2013), un reboot de la franchise réalisé par Zack Snyder."),
            en = LocalizedContent("Which actor plays Superman in \"Man of Steel\"?", listOf("Henry Cavill", "Brandon Routh", "Tom Welling", "George Reeves"), "Culture", "Henry Cavill portrays Superman in \"Man of Steel\" (2013), a reboot of the franchise directed by Zack Snyder."),
            zh = LocalizedContent("哪位演员在《超人：钢铁之躯》中饰演超人？", listOf("亨利·卡维尔", "布兰登·罗斯", "汤姆·威灵", "乔治·里弗斯"), "文化", "亨利·卡维尔在《超人：钢铁之躯》（2013）中饰演超人，这是扎克·施奈德执导的系列重启之作。"),
            es = LocalizedContent("¿Qué actor interpreta a Superman en \"Man of Steel\"?", listOf("Henry Cavill", "Brandon Routh", "Tom Welling", "George Reeves"), "Cultura", "Henry Cavill interpreta a Superman en \"Man of Steel\" (2013), un reinicio de la franquicia dirigido por Zack Snyder.")
        ),
        BilingualQuestion(
            id = 11887, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le titre du premier film \"Wonder Woman\"?", listOf("Wonder Woman", "Wonder Woman 1984", "Wonder Woman 3", "Batman v Superman"), "Culture", "Le film de 2017, réalisé par Patty Jenkins, est simplement intitulé \"Wonder Woman\", sans numéro ni sous-titre, marquant la première apparition solo de l'héroïne au cinéma."),
            en = LocalizedContent("What is the title of the first \"Wonder Woman\" movie?", listOf("Wonder Woman", "Wonder Woman 1984", "Wonder Woman 3", "Batman v Superman"), "Culture", "The 2017 film, directed by Patty Jenkins, is simply titled \"Wonder Woman\", without a number or subtitle, marking the heroine's first solo appearance in cinema."),
            zh = LocalizedContent("第一部《神奇女侠》电影的标题是什么？", listOf("神奇女侠", "神奇女侠1984", "神奇女侠3", "蝙蝠侠大战超人"), "文化", "2017年由派蒂·杰金斯执导的电影仅名为《神奇女侠》，没有编号或副标题，标志着这位女英雄首次在电影中单独亮相。"),
            es = LocalizedContent("¿Cuál es el título de la primera película de \"Wonder Woman\"?", listOf("Wonder Woman", "Wonder Woman 1984", "Wonder Woman 3", "Batman v Superman"), "Cultura", "La película de 2017, dirigida por Patty Jenkins, se titula simplemente \"Wonder Woman\", sin número ni subtítulo, marcando la primera aparición en solitario de la heroína en el cine.")
        ),
        BilingualQuestion(
            id = 11888, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année \"Wonder Woman\" a-t-il été publié?", listOf("2017", "2015", "2019", "2016"), "Culture", "Le film Wonder Woman est sorti en 2017, réalisé par Patty Jenkins, avec Gal Gadot dans le rôle-titre."),
            en = LocalizedContent("In what year was \"Wonder Woman\" released?", listOf("2017", "2015", "2019", "2016"), "Culture", "The film Wonder Woman was released in 2017, directed by Patty Jenkins, with Gal Gadot in the title role."),
            zh = LocalizedContent("《神奇女侠》是哪一年上映的？", listOf("2017", "2015", "2019", "2016"), "文化", "电影《神奇女侠》于2017年上映，由派蒂·杰金斯执导，盖尔·加朵主演。"),
            es = LocalizedContent("¿En qué año se estrenó \"Wonder Woman\"?", listOf("2017", "2015", "2019", "2016"), "Cultura", "La película Wonder Woman se estrenó en 2017, dirigida por Patty Jenkins, con Gal Gadot en el papel principal.")
        ),
        BilingualQuestion(
            id = 11889, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé \"Wonder Woman\"?", listOf("Patty Jenkins", "Zack Snyder", "James Gunn", "David Ayer"), "Culture", "Patty Jenkins a réalisé \"Wonder Woman\" en 2017, devenant la première femme à diriger un film de super-héros majeur."),
            en = LocalizedContent("Which director directed \"Wonder Woman\"?", listOf("Patty Jenkins", "Zack Snyder", "James Gunn", "David Ayer"), "Culture", "Patty Jenkins directed \"Wonder Woman\" in 2017, becoming the first woman to direct a major superhero film."),
            zh = LocalizedContent("哪位导演执导了《神奇女侠》？", listOf("派蒂·杰金斯", "扎克·施奈德", "詹姆斯·古恩", "大卫·阿耶"), "文化", "派蒂·杰金斯于2017年执导了《神奇女侠》，成为首位执导大型超级英雄电影的女性。"),
            es = LocalizedContent("¿Qué director dirigió \"Wonder Woman\"?", listOf("Patty Jenkins", "Zack Snyder", "James Gunn", "David Ayer"), "Cultura", "Patty Jenkins dirigió \"Wonder Woman\" en 2017, convirtiéndose en la primera mujer en dirigir una gran película de superhéroes.")
        ),
        BilingualQuestion(
            id = 11890, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle actrice joue Wonder Woman?", listOf("Gal Gadot", "Lynda Carter", "Lucy Lawless", "Charlize Theron"), "Culture", "Gal Gadot incarne Wonder Woman dans l'univers cinématographique DC depuis le film \"Batman v Superman : L'Aube de la justice\" en 2016."),
            en = LocalizedContent("Which actress plays Wonder Woman?", listOf("Gal Gadot", "Lynda Carter", "Lucy Lawless", "Charlize Theron"), "Culture", "Gal Gadot portrays Wonder Woman in the DC Extended Universe since the film \"Batman v Superman: Dawn of Justice\" in 2016."),
            zh = LocalizedContent("哪位女演员饰演神奇女侠？", listOf("盖尔·加朵", "琳达·卡特", "露西·劳莱斯", "查理兹·塞隆"), "文化", "盖尔·加朵自2016年电影《蝙蝠侠大战超人：正义黎明》起在DC扩展宇宙中饰演神奇女侠。"),
            es = LocalizedContent("¿Qué actriz interpreta a Wonder Woman?", listOf("Gal Gadot", "Lynda Carter", "Lucy Lawless", "Charlize Theron"), "Cultura", "Gal Gadot interpreta a Wonder Woman en el universo cinematográfico de DC desde la película \"Batman v Superman: El amanecer de la justicia\" en 2016.")
        ),
        BilingualQuestion(
            id = 11891, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Concours Eurovision a-t-il débuté?", listOf("1956", "1954", "1958", "1960"), "Culture", "Le premier Concours Eurovision de la chanson a eu lieu en 1956 à Lugano, en Suisse, avec la participation de sept pays."),
            en = LocalizedContent("In which year did the Eurovision Song Contest begin?", listOf("1956", "1954", "1958", "1960"), "Culture", "The first Eurovision Song Contest took place in 1956 in Lugano, Switzerland, with seven participating countries."),
            zh = LocalizedContent("欧洲歌唱大赛始于哪一年？", listOf("1956", "1954", "1958", "1960"), "文化", "首届欧洲歌唱大赛于1956年在瑞士卢加诺举行，共有七个国家参赛。"),
            es = LocalizedContent("¿En qué año comenzó el Festival de la Canción de Eurovisión?", listOf("1956", "1954", "1958", "1960"), "Cultura", "El primer Festival de la Canción de Eurovisión tuvo lugar en 1956 en Lugano, Suiza, con la participación de siete países.")
        ),
        BilingualQuestion(
            id = 11892, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus d'Eurovision?", listOf("Suède", "Norvège", "Islande", "Pays-Bas"), "Culture", "Avec 7 victoires, la Suède est le pays le plus titré de l'histoire du concours, devant l'Irlande qui en compte 7 également mais avec moins de participations."),
            en = LocalizedContent("Which country has won the most Eurovisions?", listOf("Sweden", "Norway", "Iceland", "Netherlands"), "Culture", "With 7 wins, Sweden is the most successful country in the contest's history, tied with Ireland but with more participations."),
            zh = LocalizedContent("哪个国家赢得欧洲歌唱大赛次数最多？", listOf("瑞典", "挪威", "冰岛", "荷兰"), "文化", "瑞典以7次夺冠成为欧洲歌唱大赛历史上最成功的国家，与爱尔兰并列但参赛次数更多。"),
            es = LocalizedContent("¿Qué país ha ganado más Eurovisiones?", listOf("Suecia", "Noruega", "Islandia", "Países Bajos"), "Cultura", "Con 7 victorias, Suecia es el país más exitoso en la historia del concurso, empatado con Irlanda pero con más participaciones.")
        ),
        BilingualQuestion(
            id = 11893, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois la Suède a-t-elle remporté Eurovision?", listOf("6", "5", "7", "4"), "Culture", "La Suède a remporté l'Eurovision à six reprises, en 1974, 1984, 1991, 1999, 2012 et 2015, ce qui en fait l'un des pays les plus titrés de l'histoire du concours."),
            en = LocalizedContent("How many times has Sweden won Eurovision?", listOf("6", "5", "7", "4"), "Culture", "Sweden has won Eurovision six times, in 1974, 1984, 1991, 1999, 2012, and 2015, making it one of the most successful countries in the contest's history."),
            zh = LocalizedContent("瑞典赢得过多少次欧洲歌唱大赛？", listOf("6", "5", "7", "4"), "文化", "瑞典曾六次赢得欧洲歌唱大赛，分别在1974、1984、1991、1999、2012和2015年，使其成为该赛事历史上最成功的国家之一。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Suecia Eurovisión?", listOf("6", "5", "7", "4"), "Cultura", "Suecia ha ganado Eurovisión seis veces, en 1974, 1984, 1991, 1999, 2012 y 2015, lo que la convierte en uno de los países más exitosos en la historia del concurso.")
        ),
        BilingualQuestion(
            id = 11894, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le titre de la chanson gagnante en 2023?", listOf("Space Man", "Mama Mia", "Tattoo", "King of the World"), "Culture", "Space Man, interprétée par Sam Ryder, a remporté l'Eurovision 2023 pour le Royaume-Uni, obtenant le meilleur score du pays depuis 1998."),
            en = LocalizedContent("What is the title of the winning song in 2023?", listOf("Space Man", "Mama Mia", "Tattoo", "King of the World"), "Culture", "\"Space Man\", performed by Sam Ryder, won Eurovision 2023 for the United Kingdom, achieving the country's best score since 1998."),
            zh = LocalizedContent("2023年获胜歌曲的标题是什么？", listOf("Space Man", "Mama Mia", "Tattoo", "King of the World"), "文化", "由山姆·莱德演唱的《Space Man》为英国赢得了2023年欧洲歌唱大赛，这是该国自1998年以来的最佳成绩。"),
            es = LocalizedContent("¿Cuál es el título de la canción ganadora en 2023?", listOf("Space Man", "Mama Mia", "Tattoo", "King of the World"), "Cultura", "\"Space Man\", interpretada por Sam Ryder, ganó Eurovisión 2023 para el Reino Unido, obteniendo la mejor puntuación del país desde 1998.")
        ),
        BilingualQuestion(
            id = 11895, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste a remporté Eurovision 2023?", listOf("Måneskin", "Kalush Orchestra", "Sertab Erener", "Loreen"), "Culture", "Kalush Orchestra a remporté l'Eurovision 2023 avec leur chanson \"Stefania\", représentant l'Ukraine."),
            en = LocalizedContent("Which artist won Eurovision 2023?", listOf("Måneskin", "Kalush Orchestra", "Sertab Erener", "Loreen"), "Culture", "Kalush Orchestra won Eurovision 2023 with their song \"Stefania\", representing Ukraine."),
            zh = LocalizedContent("哪位艺人赢得了2023年欧洲歌唱大赛？", listOf("Måneskin", "Kalush Orchestra", "Sertab Erener", "Loreen"), "文化", "Kalush Orchestra凭借歌曲《Stefania》代表乌克兰赢得了2023年欧洲歌唱大赛。"),
            es = LocalizedContent("¿Qué artista ganó Eurovisión 2023?", listOf("Måneskin", "Kalush Orchestra", "Sertab Erener", "Loreen"), "Cultura", "Kalush Orchestra ganó Eurovisión 2023 con su canción \"Stefania\", representando a Ucrania.")
        ),
        BilingualQuestion(
            id = 11896, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la France a-t-elle remporté Eurovision?", listOf("1988", "1986", "1990", "1992"), "Culture", "La France a remporté le Concours Eurovision de la chanson en 1986 grâce à la chanson \"J'aime la vie\" interprétée par Marie Myriam."),
            en = LocalizedContent("In which year did France win Eurovision?", listOf("1988", "1986", "1990", "1992"), "Culture", "France won the Eurovision Song Contest in 1986 with the song \"J'aime la vie\" performed by Marie Myriam."),
            zh = LocalizedContent("法国在哪一年赢得欧洲歌唱大赛？", listOf("1988", "1986", "1990", "1992"), "文化", "法国在1986年凭借玛丽·米里亚姆演唱的歌曲《J'aime la vie》赢得了欧洲歌唱大赛。"),
            es = LocalizedContent("¿En qué año ganó Francia Eurovisión?", listOf("1988", "1986", "1990", "1992"), "Cultura", "Francia ganó el Festival de la Canción de Eurovisión en 1986 con la canción \"J'aime la vie\" interpretada por Marie Myriam.")
        ),
        BilingualQuestion(
            id = 11897, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel artiste français a remporté Eurovision en 1988?", listOf("Carole Demas", "Gérard Lenorman", "Colette Boky", "Nicole"), "Culture", "Gérard Lenorman a représenté la France au Concours Eurovision de la chanson en 1988 avec la chanson \"Chanteur de charme\", remportant la première place."),
            en = LocalizedContent("Which French artist won Eurovision in 1988?", listOf("Carole Demas", "Gérard Lenorman", "Colette Boky", "Nicole"), "Culture", "Gérard Lenorman represented France at the Eurovision Song Contest in 1988 with the song \"Chanteur de charme\", winning first place."),
            zh = LocalizedContent("哪位法国艺人在1988年赢得了欧洲歌唱大赛？", listOf("Carole Demas", "Gérard Lenorman", "Colette Boky", "Nicole"), "文化", "热拉尔·勒诺曼在1988年代表法国参加欧洲歌唱大赛，凭借歌曲《Chanteur de charme》获得第一名。"),
            es = LocalizedContent("¿Qué artista francés ganó Eurovisión en 1988?", listOf("Carole Demas", "Gérard Lenorman", "Colette Boky", "Nicole"), "Cultura", "Gérard Lenorman representó a Francia en el Festival de la Canción de Eurovisión en 1988 con la canción \"Chanteur de charme\", obteniendo el primer lugar.")
        ),
        BilingualQuestion(
            id = 11898, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois l'Italie a-t-elle remporté Eurovision?", listOf("3", "2", "4", "5"), "Culture", "L'Italie a remporté le Concours Eurovision de la chanson à trois reprises : en 1964 avec Gigliola Cinquetti, en 1990 avec Toto Cutugno et en 2021 avec le groupe Måneskin."),
            en = LocalizedContent("How many times has Italy won Eurovision?", listOf("3", "2", "4", "5"), "Culture", "Italy has won the Eurovision Song Contest three times: in 1964 with Gigliola Cinquetti, in 1990 with Toto Cutugno, and in 2021 with the band Måneskin."),
            zh = LocalizedContent("意大利赢得过多少次欧洲歌唱大赛？", listOf("3", "2", "4", "5"), "文化", "意大利曾三次赢得欧洲歌唱大赛：1964年由吉廖拉·钦奎蒂、1990年由托托·库图尼奥、2021年由乐队Måneskin夺冠。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Italia Eurovisión?", listOf("3", "2", "4", "5"), "Cultura", "Italia ha ganado el Festival de la Canción de Eurovisión tres veces: en 1964 con Gigliola Cinquetti, en 1990 con Toto Cutugno y en 2021 con la banda Måneskin.")
        ),
        BilingualQuestion(
            id = 11899, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Italie a-t-elle remporté Eurovision le plus récemment?", listOf("2021", "2019", "2023", "2022"), "Culture", "Le groupe italien Måneskin a remporté l'Eurovision 2021 à Rotterdam avec le titre \"Zitti e buoni\", offrant à l'Italie sa troisième victoire dans le concours."),
            en = LocalizedContent("In which year did Italy most recently win Eurovision?", listOf("2021", "2019", "2023", "2022"), "Culture", "The Italian band Måneskin won Eurovision 2021 in Rotterdam with the song \"Zitti e buoni\", giving Italy its third victory in the contest."),
            zh = LocalizedContent("意大利最近一次赢得欧洲歌唱大赛是在哪一年？", listOf("2021", "2019", "2023", "2022"), "文化", "意大利乐队Måneskin在2021年鹿特丹举办的欧洲歌唱大赛中以歌曲《Zitti e buoni》夺冠，为意大利赢得了该赛事的第三次胜利。"),
            es = LocalizedContent("¿En qué año ganó Italia Eurovisión más recientemente?", listOf("2021", "2019", "2023", "2022"), "Cultura", "La banda italiana Måneskin ganó Eurovisión 2021 en Róterdam con el tema \"Zitti e buoni\", otorgando a Italia su tercera victoria en el concurso.")
        ),
        BilingualQuestion(
            id = 11900, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste a remporté Eurovision 2021?", listOf("Måneskin", "Blind Channel", "Gjon's Tears", "Leroy"), "Culture", "Le groupe italien Måneskin a remporté l'Eurovision 2021 avec la chanson \"Zitti e buoni\", marquant la troisième victoire de l'Italie dans le concours."),
            en = LocalizedContent("Which artist won Eurovision 2021?", listOf("Måneskin", "Blind Channel", "Gjon's Tears", "Leroy"), "Culture", "The Italian band Måneskin won Eurovision 2021 with the song \"Zitti e buoni\", marking Italy's third victory in the contest."),
            zh = LocalizedContent("哪位艺术家赢得了2021年欧洲歌唱大赛？", listOf("Måneskin", "Blind Channel", "Gjon's Tears", "Leroy"), "文化", "意大利乐队Måneskin凭借歌曲\"Zitti e buoni\"赢得了2021年欧洲歌唱大赛，这是意大利在该赛事中的第三次胜利。"),
            es = LocalizedContent("¿Qué artista ganó Eurovisión 2021?", listOf("Måneskin", "Blind Channel", "Gjon's Tears", "Leroy"), "Cultura", "La banda italiana Måneskin ganó Eurovisión 2021 con la canción \"Zitti e buoni\", marcando la tercera victoria de Italia en el concurso.")
        ),
        BilingualQuestion(
            id = 12000, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel curler canadien a remporté 38 championnats mondiaux?", listOf("Kevin Martin", "Randy Ferbey", "Russ Howard", "Ed Werenich"), "Sport", "Kevin Martin, surnommé « The Old Bear », est considéré comme l'un des plus grands curleurs de l'histoire. Il a accumulé 38 titres de champion du monde, un record inégalé dans ce sport."),
            en = LocalizedContent("Which Canadian curler has won 38 world championships?", listOf("Kevin Martin", "Randy Ferbey", "Russ Howard", "Ed Werenich"), "Sports", "Kevin Martin, nicknamed \"The Old Bear\", is considered one of the greatest curlers in history. He has accumulated 38 world championship titles, an unmatched record in the sport."),
            zh = LocalizedContent("哪位加拿大冰壶运动员赢得了38次世界锦标赛？", listOf("Kevin Martin", "Randy Ferbey", "Russ Howard", "Ed Werenich"), "体育", "凯文·马丁，绰号“老熊”，被认为是历史上最伟大的冰壶运动员之一。他累计获得了38次世界冠军头衔，这是该运动中无与伦比的纪录。"),
            es = LocalizedContent("¿Qué jugador de curling canadiense ha ganado 38 campeonatos mundiales?", listOf("Kevin Martin", "Randy Ferbey", "Russ Howard", "Ed Werenich"), "Deportes", "Kevin Martin, apodado \"The Old Bear\", es considerado uno de los mejores jugadores de curling de la historia. Ha acumulado 38 títulos de campeonato mundial, un récord sin igual en este deporte.")
        ),
        BilingualQuestion(
            id = 12001, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En cricket, combien de balles constituent un over?", listOf("4", "6", "8", "10"), "Sport", "Un over au cricket est traditionnellement composé de six lancers valides, une règle standardisée depuis le XIXe siècle pour équilibrer le jeu entre batteurs et lanceurs."),
            en = LocalizedContent("In cricket, how many balls make up an over?", listOf("4", "6", "8", "10"), "Sports", "An over in cricket traditionally consists of six legal deliveries, a rule standardized since the 19th century to balance the game between batsmen and bowlers."),
            zh = LocalizedContent("在板球中，一个回合由多少个球组成？", listOf("4", "6", "8", "10"), "体育", "板球中的一个回合传统上由六次合法投球组成，这一规则自19世纪以来标准化，以平衡击球手和投球手之间的比赛。"),
            es = LocalizedContent("En el cricket, ¿cuántas bolas constituyen un over?", listOf("4", "6", "8", "10"), "Deportes", "Un over en el cricket tradicionalmente consta de seis lanzamientos válidos, una regla estandarizada desde el siglo XIX para equilibrar el juego entre bateadores y lanzadores.")
        ),
        BilingualQuestion(
            id = 12002, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le biathlon combine le ski de fond et quel autre sport?", listOf("Patinage", "Tir à la carabine", "Saut à ski", "Bobsleigh"), "Sport", "Le biathlon est un sport d'hiver qui alterne des tours de ski de fond et des séances de tir à la carabine, où les athlètes doivent viser des cibles à distance."),
            en = LocalizedContent("Biathlon combines cross-country skiing and which other sport?", listOf("Skating", "Rifle shooting", "Ski jumping", "Bobsleigh"), "Sports", "Biathlon is a winter sport that alternates rounds of cross-country skiing with rifle shooting sessions, where athletes must aim at targets from a distance."),
            zh = LocalizedContent("冬季两项结合了越野滑雪和哪项运动？", listOf("滑冰", "步枪射击", "跳台滑雪", "雪车"), "体育", "冬季两项是一项冬季运动，交替进行越野滑雪和步枪射击，运动员需要远距离瞄准目标。"),
            es = LocalizedContent("El biatlón combina el esquí de fondo y ¿qué otro deporte?", listOf("Patinaje", "Tiro con rifle", "Salto de esquí", "Bobsleigh"), "Deportes", "El biatlón es un deporte de invierno que alterna rondas de esquí de fondo con sesiones de tiro con rifle, donde los atletas deben apuntar a objetivos a distancia.")
        ),
        BilingualQuestion(
            id = 12003, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du gymnaste suisse qui a inventé le trampoline moderne?", listOf("Jakob Tullin", "George Nissen", "Walter Schindelé", "Hans Reusch"), "Sport", "George Nissen, un gymnaste américain (et non suisse), a inventé le trampoline moderne dans les années 1930 en s'inspirant des filets de sécurité des trapézistes."),
            en = LocalizedContent("What is the name of the Swiss gymnast who invented the modern trampoline?", listOf("Jakob Tullin", "George Nissen", "Walter Schindelé", "Hans Reusch"), "Sports", "George Nissen, an American gymnast (not Swiss), invented the modern trampoline in the 1930s, inspired by the safety nets of trapeze artists."),
            zh = LocalizedContent("发明现代蹦床的瑞士体操运动员叫什么名字？", listOf("Jakob Tullin", "George Nissen", "Walter Schindelé", "Hans Reusch"), "体育", "乔治·尼森，一位美国体操运动员（而非瑞士），在20世纪30年代发明了现代蹦床，灵感来自空中飞人的安全网。"),
            es = LocalizedContent("¿Cuál es el nombre del gimnasta suizo que inventó el trampolín moderno?", listOf("Jakob Tullin", "George Nissen", "Walter Schindelé", "Hans Reusch"), "Deportes", "George Nissen, un gimnasta estadounidense (no suizo), inventó el trampolín moderno en la década de 1930, inspirándose en las redes de seguridad de los trapecistas.")
        ),
        BilingualQuestion(
            id = 12004, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En polo, combien de joueurs constituent une équipe?", listOf("3", "4", "5", "6"), "Sport", "Au polo, chaque équipe est composée de quatre joueurs à cheval, une règle standardisée au XIXe siècle pour équilibrer vitesse et stratégie sur le terrain."),
            en = LocalizedContent("In polo, how many players make up a team?", listOf("3", "4", "5", "6"), "Sports", "In polo, each team consists of four players on horseback, a rule standardized in the 19th century to balance speed and strategy on the field."),
            zh = LocalizedContent("在马球中，一支队伍由多少名球员组成？", listOf("3", "4", "5", "6"), "体育", "在马球中，每支队伍由四名骑手组成，这一规则在19世纪标准化，以平衡场上的速度和策略。"),
            es = LocalizedContent("En el polo, ¿cuántos jugadores forman un equipo?", listOf("3", "4", "5", "6"), "Deportes", "En el polo, cada equipo está compuesto por cuatro jugadores a caballo, una regla estandarizada en el siglo XIX para equilibrar velocidad y estrategia en el campo.")
        ),
        BilingualQuestion(
            id = 12005, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le sport appelé 'Hurling' est originaire de quel pays?", listOf("Écosse", "Irlande", "Pays de Galles", "Cornouailles"), "Sport", "Le hurling est un sport traditionnel irlandais, pratiqué depuis des siècles, souvent considéré comme l'un des jeux les plus rapides au monde."),
            en = LocalizedContent("The sport called 'Hurling' originates from which country?", listOf("Scotland", "Ireland", "Wales", "Cornwall"), "Sports", "Hurling is a traditional Irish sport, practiced for centuries, often considered one of the fastest games in the world."),
            zh = LocalizedContent("被称为“板棍球”的运动起源于哪个国家？", listOf("苏格兰", "爱尔兰", "威尔士", "康沃尔"), "体育", "板棍球是一项传统的爱尔兰运动，已有数百年历史，常被认为是世界上速度最快的运动之一。"),
            es = LocalizedContent("El deporte llamado 'Hurling' es originario de ¿qué país?", listOf("Escocia", "Irlanda", "Gales", "Cornualles"), "Deportes", "El hurling es un deporte tradicional irlandés, practicado durante siglos, a menudo considerado uno de los juegos más rápidos del mundo.")
        ),
        BilingualQuestion(
            id = 12006, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel escaladeur français a été le premier à atteindre le sommet du Mont-Blanc avec un certificat officiel?", listOf("Gaston Rébuffat", "Pierre Labric", "Jacques Charignon", "Édouard-Alfred Martel"), "Sport", "Jacques Charignon, guide de haute montagne, a réalisé cette ascension officielle en 1786, marquant une première dans l'histoire de l'alpinisme."),
            en = LocalizedContent("Which French climber was the first to reach the summit of Mont Blanc with an official certificate?", listOf("Gaston Rébuffat", "Pierre Labric", "Jacques Charignon", "Édouard-Alfred Martel"), "Sports", "Jacques Charignon, a high mountain guide, made this official ascent in 1786, marking a first in the history of mountaineering."),
            zh = LocalizedContent("哪位法国登山者第一个获得官方证书登顶勃朗峰？", listOf("Gaston Rébuffat", "Pierre Labric", "Jacques Charignon", "Édouard-Alfred Martel"), "体育", "雅克·沙里尼翁，一位高山向导，于1786年完成了这次官方登顶，标志着登山史上的第一次。"),
            es = LocalizedContent("¿Qué escalador francés fue el primero en alcanzar la cima del Mont Blanc con un certificado oficial?", listOf("Gaston Rébuffat", "Pierre Labric", "Jacques Charignon", "Édouard-Alfred Martel"), "Deportes", "Jacques Charignon, un guía de alta montaña, realizó esta ascensión oficial en 1786, marcando un hito en la historia del alpinismo.")
        ),
        BilingualQuestion(
            id = 12007, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le curl olympique utilise une pierre dont le poids minimum est?", listOf("17 kg", "20 kg", "19.96 kg", "22 kg"), "Sport", "Au curling olympique, chaque pierre doit peser au minimum 19,96 kg (44 livres), un standard établi par la Fédération mondiale de curling pour garantir l'équité entre les compétiteurs."),
            en = LocalizedContent("The Olympic curling stone has a minimum weight of?", listOf("17 kg", "20 kg", "19.96 kg", "22 kg"), "Sports", "In Olympic curling, each stone must weigh at least 19.96 kg (44 lbs), a standard set by the World Curling Federation to ensure fairness among competitors."),
            zh = LocalizedContent("奥运冰壶石的最小重量是多少？", listOf("17公斤", "20公斤", "19.96公斤", "22公斤"), "体育", "在奥运冰壶比赛中，每块石壶必须至少重19.96公斤（44磅），这是世界冰壶联合会为确保比赛公平而设定的标准。"),
            es = LocalizedContent("La piedra de curling olímpica tiene un peso mínimo de?", listOf("17 kg", "20 kg", "19.96 kg", "22 kg"), "Deportes", "En el curling olímpico, cada piedra debe pesar al menos 19.96 kg (44 libras), un estándar establecido por la Federación Mundial de Curling para garantizar la equidad entre los competidores.")
        ),
        BilingualQuestion(
            id = 12008, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En badminton, quel est le diamètre maximal du volant?", listOf("15 mm", "17 mm", "20 mm", "24 mm"), "Sport", "Le volant de badminton doit avoir un diamètre maximal de 24 mm selon les règles de la Fédération mondiale de badminton, afin de garantir des caractéristiques de vol standardisées."),
            en = LocalizedContent("In badminton, what is the maximum diameter of the shuttlecock?", listOf("15 mm", "17 mm", "20 mm", "24 mm"), "Sports", "The badminton shuttlecock must have a maximum diameter of 24 mm according to the rules of the Badminton World Federation, to ensure standardized flight characteristics."),
            zh = LocalizedContent("在羽毛球中，羽毛球的最大直径是多少？", listOf("15毫米", "17毫米", "20毫米", "24毫米"), "体育", "根据世界羽毛球联合会的规则，羽毛球的直径最大为24毫米，以确保标准化的飞行特性。"),
            es = LocalizedContent("En bádminton, ¿cuál es el diámetro máximo del volante?", listOf("15 mm", "17 mm", "20 mm", "24 mm"), "Deportes", "El volante de bádminton debe tener un diámetro máximo de 24 mm según las reglas de la Federación Mundial de Bádminton, para garantizar características de vuelo estandarizadas.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12009, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le squash professionnel se joue sur un court mesurant combien de mètres de long?", listOf("9 m", "9.75 m", "10 m", "11 m"), "Sport", "Les dimensions officielles d'un court de squash sont de 9,75 mètres de long sur 6,4 mètres de large, selon les règles de la Fédération mondiale de squash."),
            en = LocalizedContent("In professional squash, how long is the court in meters?", listOf("9 m", "9.75 m", "10 m", "11 m"), "Sports", "The official dimensions of a squash court are 9.75 meters long by 6.4 meters wide, according to the World Squash Federation rules."),
            zh = LocalizedContent("职业壁球场的长度是多少米？", listOf("9米", "9.75米", "10米", "11米"), "体育", "根据世界壁球联合会的规定，标准壁球场的长为9.75米，宽为6.4米。"),
            es = LocalizedContent("En el squash profesional, ¿cuánto mide de largo la pista en metros?", listOf("9 m", "9.75 m", "10 m", "11 m"), "Deportes", "Las dimensiones oficiales de una pista de squash son 9,75 metros de largo por 6,4 metros de ancho, según las reglas de la Federación Mundial de Squash.")
        ),
        BilingualQuestion(
            id = 12010, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sport de raquette se joue en quatre contre quatre?", listOf("Padel", "Pickleball", "Pelote basque", "Frontenis"), "Sport", "La pelote basque se pratique en équipes de quatre joueurs dans sa spécialité appelée \"main nue\" ou \"paleta\", où deux équipes de deux joueurs s'affrontent, mais certaines variantes comme le \"joko garbi\" se jouent en quatre contre quatre."),
            en = LocalizedContent("Which racket sport is played four against four?", listOf("Padel", "Pickleball", "Basque pelota", "Frontenis"), "Sports", "Basque pelota is played in teams of four players in its specialty called 'main nue' or 'paleta', where two teams of two players compete, but some variants like 'joko garbi' are played four against four."),
            zh = LocalizedContent("哪种球拍运动是四对四进行的？", listOf("板网球", "匹克球", "巴斯克回力球", "前网球"), "体育", "巴斯克回力球在“手球”或“拍球”项目中以四人团队进行，即两队各两人对抗，但某些变体如“joko garbi”是四对四进行。"),
            es = LocalizedContent("¿Qué deporte de raqueta se juega cuatro contra cuatro?", listOf("Pádel", "Pickleball", "Pelota vasca", "Frontenis"), "Deportes", "La pelota vasca se practica en equipos de cuatro jugadores en su especialidad llamada 'mano' o 'paleta', donde dos equipos de dos jugadores se enfrentan, pero algunas variantes como el 'joko garbi' se juegan cuatro contra cuatro.")
        ),
        BilingualQuestion(
            id = 12011, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En skateboard, quel est le nom du virage à 360°?", listOf("Kickflip", "Ollie", "Shove-it", "Manual"), "Sport", "Un kickflip est un trick de skateboard où la planche effectue une rotation de 360° sur son axe longitudinal, mais il ne s'agit pas d'un virage. Le virage à 360° s'appelle un 360 ollie ou simplement un 360."),
            en = LocalizedContent("In skateboarding, what is the name of the 360° turn?", listOf("Kickflip", "Ollie", "Shove-it", "Manual"), "Sports", "A kickflip is a skateboarding trick where the board rotates 360° on its longitudinal axis, but it is not a turn. The 360° turn is called a 360 ollie or simply a 360."),
            zh = LocalizedContent("在滑板运动中，360度转弯叫什么？", listOf("踢翻", "奥利", "转板", "平衡"), "体育", "踢翻是滑板技巧，板子绕纵轴旋转360度，但这不是转弯。360度转弯称为360奥利或简称360。"),
            es = LocalizedContent("En skateboarding, ¿cómo se llama el giro de 360°?", listOf("Kickflip", "Ollie", "Shove-it", "Manual"), "Deportes", "Un kickflip es un truco de skate donde la tabla gira 360° sobre su eje longitudinal, pero no es un giro. El giro de 360° se llama 360 ollie o simplemente 360.")
        ),
        BilingualQuestion(
            id = 12012, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Kabaddi est un sport collectif originaire de quel continent?", listOf("Afrique", "Asie", "Océanie", "Amérique du Sud"), "Sport", "Le Kabaddi est originaire du sous-continent indien, en Asie, où il est pratiqué depuis des millénaires et reste très populaire notamment en Inde et au Bangladesh."),
            en = LocalizedContent("Kabaddi is a team sport originating from which continent?", listOf("Africa", "Asia", "Oceania", "South America"), "Sports", "Kabaddi originated in the Indian subcontinent, in Asia, where it has been practiced for millennia and remains very popular, especially in India and Bangladesh."),
            zh = LocalizedContent("卡巴迪是一项团队运动，起源于哪个大洲？", listOf("非洲", "亚洲", "大洋洲", "南美洲"), "体育", "卡巴迪起源于印度次大陆，属于亚洲，已有数千年历史，在印度和孟加拉国等地非常流行。"),
            es = LocalizedContent("El Kabaddi es un deporte de equipo originario de ¿qué continente?", listOf("África", "Asia", "Oceanía", "América del Sur"), "Deportes", "El Kabaddi es originario del subcontinente indio, en Asia, donde se practica desde hace milenios y sigue siendo muy popular, especialmente en India y Bangladesh.")
        ),
        BilingualQuestion(
            id = 12013, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de tentatives a un grimpeur en escalade sportive au niveau des Jeux Olympiques?", listOf("Une", "Deux", "Trois", "Quatre"), "Sport", "Aux Jeux Olympiques, chaque grimpeur dispose de trois tentatives pour réaliser la meilleure performance possible sur les voies de difficulté et de bloc."),
            en = LocalizedContent("How many attempts does a climber have in sport climbing at the Olympic Games?", listOf("One", "Two", "Three", "Four"), "Sports", "At the Olympic Games, each climber has three attempts to achieve the best possible performance on the difficulty and bouldering routes."),
            zh = LocalizedContent("在奥运会运动攀岩中，每位攀岩者有多少次尝试机会？", listOf("一次", "两次", "三次", "四次"), "体育", "在奥运会上，每位攀岩者在难度和抱石路线中有三次尝试机会，以取得最佳成绩。"),
            es = LocalizedContent("¿Cuántos intentos tiene un escalador en escalada deportiva en los Juegos Olímpicos?", listOf("Uno", "Dos", "Tres", "Cuatro"), "Deportes", "En los Juegos Olímpicos, cada escalador dispone de tres intentos para lograr el mejor rendimiento posible en las vías de dificultad y bloque.")
        ),
        BilingualQuestion(
            id = 12014, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le lancer du poids masculin utilise une sphère pesant?", listOf("6 kg", "7.26 kg", "8 kg", "9 kg"), "Sport", "Le lancer du poids masculin est une discipline d'athlétisme où la sphère métallique pèse 7,26 kg (16 livres), un standard établi par la fédération internationale."),
            en = LocalizedContent("The men's shot put uses a sphere weighing?", listOf("6 kg", "7.26 kg", "8 kg", "9 kg"), "Sports", "The men's shot put is an athletics discipline where the metal sphere weighs 7.26 kg (16 pounds), a standard set by the international federation."),
            zh = LocalizedContent("男子铅球使用的球体重多少？", listOf("6公斤", "7.26公斤", "8公斤", "9公斤"), "体育", "男子铅球是田径项目，金属球重7.26公斤（16磅），这是国际联合会设定的标准。"),
            es = LocalizedContent("El lanzamiento de peso masculino utiliza una esfera que pesa?", listOf("6 kg", "7.26 kg", "8 kg", "9 kg"), "Deportes", "El lanzamiento de peso masculino es una disciplina de atletismo donde la esfera metálica pesa 7,26 kg (16 libras), un estándar establecido por la federación internacional.")
        ),
        BilingualQuestion(
            id = 12015, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En athlétisme, quelle distance est le 'steeple chase'?", listOf("3000 m", "3500 m", "2500 m", "4000 m"), "Sport", "Le steeple-chase est une épreuve d’athlétisme sur piste de 3000 mètres, comportant des haies et une rivière."),
            en = LocalizedContent("In athletics, what distance is the 'steeplechase'?", listOf("3000 m", "3500 m", "2500 m", "4000 m"), "Sports", "The steeplechase is a track athletics event of 3000 meters, featuring hurdles and a water jump."),
            zh = LocalizedContent("在田径运动中，'障碍赛'的距离是多少？", listOf("3000米", "3500米", "2500米", "4000米"), "体育", "障碍赛是田径跑道项目，距离为3000米，设有障碍栏架和水池。"),
            es = LocalizedContent("En atletismo, ¿qué distancia es la 'carrera de obstáculos'?", listOf("3000 m", "3500 m", "2500 m", "4000 m"), "Deportes", "La carrera de obstáculos es una prueba de atletismo en pista de 3000 metros, que incluye vallas y una ría.")
        ),
        BilingualQuestion(
            id = 12016, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le record de hauteur en saut en hauteur approche?", listOf("2.30 m", "2.38 m", "2.45 m", "2.50 m"), "Sport", "Le record du monde masculin de saut en hauteur est détenu par le Cubain Javier Sotomayor avec 2,45 mètres, établi en 1993. La barre des 2,38 mètres est une performance de très haut niveau, approchant ce record historique."),
            en = LocalizedContent("The high jump record height approaches?", listOf("2.30 m", "2.38 m", "2.45 m", "2.50 m"), "Sports", "The men's world record in high jump is held by Cuban Javier Sotomayor with 2.45 meters, set in 1993. The 2.38 meter mark is a very high-level performance, approaching this historic record."),
            zh = LocalizedContent("跳高纪录的高度接近多少？", listOf("2.30米", "2.38米", "2.45米", "2.50米"), "体育", "男子跳高世界纪录由古巴选手哈维尔·索托马约尔保持，成绩为2.45米，创于1993年。2.38米是非常高水平的成绩，接近这一历史纪录。"),
            es = LocalizedContent("El récord de altura en salto de altura se aproxima a?", listOf("2.30 m", "2.38 m", "2.45 m", "2.50 m"), "Deportes", "El récord mundial masculino de salto de altura lo posee el cubano Javier Sotomayor con 2,45 metros, establecido en 1993. La marca de 2,38 metros es una actuación de muy alto nivel, acercándose a este récord histórico.")
        ),
        BilingualQuestion(
            id = 12017, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport utilise des épées avec des lames de plus de 90 cm?", listOf("Fleuret", "Sabre", "Épée", "Escrime historique"), "Sport", "L'épée est une discipline d'escrime dont la lame mesure 90 cm pour un poids maximum de 770 g, soit la plus longue et la plus lourde des trois armes."),
            en = LocalizedContent("Which sport uses swords with blades over 90 cm?", listOf("Foil", "Sabre", "Épée", "Historical fencing"), "Sports", "The épée is a fencing discipline whose blade measures 90 cm for a maximum weight of 770 g, making it the longest and heaviest of the three weapons."),
            zh = LocalizedContent("哪种运动使用刃长超过90厘米的剑？", listOf("花剑", "佩剑", "重剑", "历史击剑"), "体育", "重剑是击剑项目，剑刃长90厘米，最大重量770克，是三种武器中最长最重的。"),
            es = LocalizedContent("¿Qué deporte utiliza espadas con hojas de más de 90 cm?", listOf("Florete", "Sable", "Espada", "Esgrima histórica"), "Deportes", "La espada es una disciplina de esgrima cuya hoja mide 90 cm con un peso máximo de 770 g, siendo la más larga y pesada de las tres armas.")
        ),
        BilingualQuestion(
            id = 12018, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le jeu de paume français se joue sur un terrain de quel nom?", listOf("Court", "Trinquet", "Fronton", "Parc"), "Sport", "Le jeu de paume français se pratique dans un trinquet, un terrain fermé par des murs contre lesquels la balle peut rebondir, spécifique à ce sport."),
            en = LocalizedContent("The French game of 'jeu de paume' is played on a court called what?", listOf("Court", "Trinquet", "Fronton", "Park"), "Sports", "The French game of 'jeu de paume' is played in a trinquet, an enclosed court with walls against which the ball can bounce, specific to this sport."),
            zh = LocalizedContent("法国式网球（jeu de paume）在什么场地上进行？", listOf("球场", "三面墙球场", "前墙球场", "公园"), "体育", "法国式网球在“trinquet”中进行，这是一种封闭的场地，四周有墙壁，球可以反弹，是该运动特有的。"),
            es = LocalizedContent("El juego de pelota francés 'jeu de paume' se juega en una cancha llamada?", listOf("Cancha", "Trinquete", "Frontón", "Parque"), "Deportes", "El juego de pelota francés 'jeu de paume' se practica en un trinquete, un recinto cerrado con paredes contra las que la pelota puede rebotar, específico de este deporte.")
        ),
        BilingualQuestion(
            id = 12019, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de gants utilise un boxeur lors d'un combat?", listOf("Un", "Deux", "Trois", "Quatre"), "Sport", "Un boxeur porte une paire de gants, soit un pour chaque main, afin de se protéger et de protéger son adversaire lors des frappes."),
            en = LocalizedContent("How many gloves does a boxer use during a fight?", listOf("One", "Two", "Three", "Four"), "Sports", "A boxer wears a pair of gloves, one for each hand, to protect themselves and their opponent during strikes."),
            zh = LocalizedContent("拳击手在比赛中使用多少只手套？", listOf("一只", "两只", "三只", "四只"), "体育", "拳击手戴一副手套，每只手一只，以保护自己和对手在击打时免受伤害。"),
            es = LocalizedContent("¿Cuántos guantes usa un boxeador durante un combate?", listOf("Uno", "Dos", "Tres", "Cuatro"), "Deportes", "Un boxeador usa un par de guantes, uno para cada mano, para protegerse a sí mismo y a su oponente durante los golpes.")
        ),
        BilingualQuestion(
            id = 12020, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La molécule de l'ADN a été découverte en?", listOf("1945", "1950", "1953", "1960"), "Science", "La structure en double hélice de l'ADN a été identifiée par Watson et Crick en 1953."),
            en = LocalizedContent("The DNA molecule was discovered in?", listOf("1945", "1950", "1953", "1960"), "Science", "The double helix structure of DNA was identified by Watson and Crick in 1953."),
            zh = LocalizedContent("DNA分子是在哪一年被发现的？", listOf("1945", "1950", "1953", "1960"), "科学", "DNA的双螺旋结构由沃森和克里克于1953年发现。"),
            es = LocalizedContent("¿La molécula de ADN fue descubierta en?", listOf("1945", "1950", "1953", "1960"), "Ciencia", "La estructura de doble hélice del ADN fue identificada por Watson y Crick en 1953.")
        ),
        BilingualQuestion(
            id = 12021, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chimiste a reçu deux prix Nobel dans des domaines différents?", listOf("Linus Pauling", "Marie Curie", "Frederick Sanger", "John Bardeen"), "Science", "Marie Curie a reçu le prix Nobel de physique en 1903 pour ses travaux sur la radioactivité, puis celui de chimie en 1911 pour la découverte du radium et du polonium."),
            en = LocalizedContent("Which chemist received two Nobel Prizes in different fields?", listOf("Linus Pauling", "Marie Curie", "Frederick Sanger", "John Bardeen"), "Science", "Marie Curie received the Nobel Prize in Physics in 1903 for her work on radioactivity, and the Nobel Prize in Chemistry in 1911 for the discovery of radium and polonium."),
            zh = LocalizedContent("哪位化学家在不同领域获得了两次诺贝尔奖？", listOf("莱纳斯·鲍林", "玛丽·居里", "弗雷德里克·桑格", "约翰·巴丁"), "科学", "玛丽·居里于1903年因放射性研究获得诺贝尔物理学奖，1911年因发现镭和钋获得诺贝尔化学奖。"),
            es = LocalizedContent("¿Qué químico recibió dos premios Nobel en diferentes campos?", listOf("Linus Pauling", "Marie Curie", "Frederick Sanger", "John Bardeen"), "Ciencia", "Marie Curie recibió el Premio Nobel de Física en 1903 por sus trabajos sobre la radiactividad, y el de Química en 1911 por el descubrimiento del radio y el polonio.")
        ),
        BilingualQuestion(
            id = 12022, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'expérience de la double fente a révélé quel phénomène?", listOf("Réfraction", "Dualité onde-corpuscule", "Polarisation", "Diffraction"), "Science", "L'expérience de la double fente montre que les particules, comme les électrons, se comportent à la fois comme des ondes et des particules, un principe clé de la mécanique quantique."),
            en = LocalizedContent("The double-slit experiment revealed which phenomenon?", listOf("Refraction", "Wave-particle duality", "Polarization", "Diffraction"), "Science", "The double-slit experiment shows that particles, such as electrons, behave both as waves and particles, a key principle of quantum mechanics."),
            zh = LocalizedContent("双缝实验揭示了什么现象？", listOf("折射", "波粒二象性", "偏振", "衍射"), "科学", "双缝实验表明，像电子这样的粒子既表现出波动性又表现出粒子性，这是量子力学的一个关键原理。"),
            es = LocalizedContent("¿El experimento de la doble rendija reveló qué fenómeno?", listOf("Refracción", "Dualidad onda-partícula", "Polarización", "Difracción"), "Ciencia", "El experimento de la doble rendija muestra que las partículas, como los electrones, se comportan tanto como ondas como partículas, un principio clave de la mecánica cuántica.")
        ),
        BilingualQuestion(
            id = 12023, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le nombre d'Avogadro est approximativement?", listOf("6.02 × 10²¹", "6.02 × 10²³", "6.02 × 10²⁵", "6.02 × 10¹⁸"), "Science", "Le nombre d'Avogadro représente le nombre d'entités (atomes, molécules) dans une mole d'une substance, soit environ 6,022 × 10²³, une constante fondamentale en chimie."),
            en = LocalizedContent("Avogadro's number is approximately?", listOf("6.02 × 10²¹", "6.02 × 10²³", "6.02 × 10²⁵", "6.02 × 10¹⁸"), "Science", "Avogadro's number represents the number of entities (atoms, molecules) in one mole of a substance, approximately 6.022 × 10²³, a fundamental constant in chemistry."),
            zh = LocalizedContent("阿伏伽德罗常数大约是多少？", listOf("6.02 × 10²¹", "6.02 × 10²³", "6.02 × 10²⁵", "6.02 × 10¹⁸"), "科学", "阿伏伽德罗常数表示一摩尔物质中所含的实体（原子、分子）数量，约为6.022 × 10²³，是化学中的基本常数。"),
            es = LocalizedContent("¿El número de Avogadro es aproximadamente?", listOf("6.02 × 10²¹", "6.02 × 10²³", "6.02 × 10²⁵", "6.02 × 10¹⁸"), "Ciencia", "El número de Avogadro representa la cantidad de entidades (átomos, moléculas) en un mol de una sustancia, aproximadamente 6.022 × 10²³, una constante fundamental en química.")
        ),
        BilingualQuestion(
            id = 12024, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel élément chimique porte le numéro atomique 79?", listOf("Argent", "Platine", "Or", "Mercure"), "Science", "L'élément de numéro atomique 79 est l'or, un métal précieux utilisé en bijouterie et en électronique pour sa conductivité et sa résistance à la corrosion."),
            en = LocalizedContent("Which chemical element has atomic number 79?", listOf("Silver", "Platinum", "Gold", "Mercury"), "Science", "The element with atomic number 79 is gold, a precious metal used in jewelry and electronics for its conductivity and corrosion resistance."),
            zh = LocalizedContent("哪种化学元素的原子序数是79？", listOf("银", "铂", "金", "汞"), "科学", "原子序数为79的元素是金，一种贵金属，因其导电性和耐腐蚀性而用于珠宝和电子领域。"),
            es = LocalizedContent("¿Qué elemento químico tiene el número atómico 79?", listOf("Plata", "Platino", "Oro", "Mercurio"), "Ciencia", "El elemento de número atómico 79 es el oro, un metal precioso utilizado en joyería y electrónica por su conductividad y resistencia a la corrosión.")
        ),
        BilingualQuestion(
            id = 12025, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La vitesse de la lumière dans le vide est?", listOf("300 000 km/s", "299 792 km/s", "350 000 km/s", "250 000 km/s"), "Science", "La vitesse de la lumière dans le vide est une constante fondamentale de la physique, notée c, et vaut exactement 299 792 458 mètres par seconde depuis sa redéfinition en 1983."),
            en = LocalizedContent("The speed of light in a vacuum is?", listOf("300,000 km/s", "299,792 km/s", "350,000 km/s", "250,000 km/s"), "Science", "The speed of light in a vacuum is a fundamental constant of physics, denoted c, and is exactly 299,792,458 meters per second since its redefinition in 1983."),
            zh = LocalizedContent("真空中的光速是多少？", listOf("300,000 km/s", "299,792 km/s", "350,000 km/s", "250,000 km/s"), "科学", "真空中的光速是物理学的基本常数，记为c，自1983年重新定义以来精确为299,792,458米/秒。"),
            es = LocalizedContent("¿La velocidad de la luz en el vacío es?", listOf("300,000 km/s", "299,792 km/s", "350,000 km/s", "250,000 km/s"), "Ciencia", "La velocidad de la luz en el vacío es una constante fundamental de la física, denotada c, y vale exactamente 299,792,458 metros por segundo desde su redefinición en 1983.")
        ),
        BilingualQuestion(
            id = 12026, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a formulé la loi de la gravitation universelle?", listOf("Galilée", "Copernic", "Newton", "Kepler"), "Science", "Isaac Newton a formulé la loi de la gravitation universelle en 1687 dans son ouvrage Philosophiæ Naturalis Principia Mathematica, expliquant l'attraction entre les corps massifs."),
            en = LocalizedContent("Which scientist formulated the law of universal gravitation?", listOf("Galileo", "Copernicus", "Newton", "Kepler"), "Science", "Isaac Newton formulated the law of universal gravitation in 1687 in his work Philosophiæ Naturalis Principia Mathematica, explaining the attraction between massive bodies."),
            zh = LocalizedContent("哪位科学家提出了万有引力定律？", listOf("伽利略", "哥白尼", "牛顿", "开普勒"), "科学", "艾萨克·牛顿于1687年在其著作《自然哲学的数学原理》中提出了万有引力定律，解释了有质量物体之间的吸引力。"),
            es = LocalizedContent("¿Qué científico formuló la ley de la gravitación universal?", listOf("Galileo", "Copérnico", "Newton", "Kepler"), "Ciencia", "Isaac Newton formuló la ley de la gravitación universal en 1687 en su obra Philosophiæ Naturalis Principia Mathematica, explicando la atracción entre cuerpos masivos.")
        ),
        BilingualQuestion(
            id = 12027, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La théorie de la relativité restreinte a été publiée en?", listOf("1900", "1905", "1915", "1925"), "Science", "Albert Einstein publie sa théorie de la relativité restreinte en 1905, dans son article Sur l'électrodynamique des corps en mouvement. Cette année est surnommée son annus mirabilis."),
            en = LocalizedContent("The theory of special relativity was published in?", listOf("1900", "1905", "1915", "1925"), "Science", "Albert Einstein published his theory of special relativity in 1905, in his paper On the Electrodynamics of Moving Bodies. That year is known as his annus mirabilis."),
            zh = LocalizedContent("狭义相对论是在哪一年发表的？", listOf("1900", "1905", "1915", "1925"), "科学", "阿尔伯特·爱因斯坦于1905年在其论文《论动体的电动力学》中发表了狭义相对论。那一年被称为他的奇迹年。"),
            es = LocalizedContent("¿La teoría de la relatividad especial fue publicada en?", listOf("1900", "1905", "1915", "1925"), "Ciencia", "Albert Einstein publicó su teoría de la relatividad especial en 1905, en su artículo Sobre la electrodinámica de los cuerpos en movimiento. Ese año es conocido como su annus mirabilis.")
        ),
        BilingualQuestion(
            id = 12028, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le boson de Higgs a été découvert au?", listOf("Fermilab", "CERN", "SLAC", "Brookhaven"), "Science", "Le boson de Higgs a été observé pour la première fois en 2012 grâce aux collisions de particules réalisées dans le Grand collisionneur de hadrons (LHC) du CERN, situé près de Genève."),
            en = LocalizedContent("The Higgs boson was discovered at?", listOf("Fermilab", "CERN", "SLAC", "Brookhaven"), "Science", "The Higgs boson was first observed in 2012 through particle collisions at the Large Hadron Collider (LHC) at CERN, located near Geneva."),
            zh = LocalizedContent("希格斯玻色子是在哪里发现的？", listOf("费米实验室", "欧洲核子研究中心", "SLAC国家加速器实验室", "布鲁克海文国家实验室"), "科学", "希格斯玻色子于2012年首次在位于日内瓦附近的欧洲核子研究中心（CERN）的大型强子对撞机（LHC）的粒子碰撞中被观测到。"),
            es = LocalizedContent("¿El bosón de Higgs fue descubierto en?", listOf("Fermilab", "CERN", "SLAC", "Brookhaven"), "Ciencia", "El bosón de Higgs fue observado por primera vez en 2012 gracias a las colisiones de partículas realizadas en el Gran Colisionador de Hadrones (LHC) del CERN, situado cerca de Ginebra.")
        ),
    )
}
