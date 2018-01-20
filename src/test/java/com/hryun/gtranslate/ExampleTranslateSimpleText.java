/**
 * @author Vinícius Egidio (vegidio@gmail.com)
 * @since Apr 28th 2014
 * v1.0
 */

package com.hryun.gtranslate;

public class ExampleTranslateSimpleText
{
    /*
     * Translating several phrases...
     */
    public static void main(String[] args)
    {
        Translate translate;
        String text;

        // Putting all parameters in the execute() method
        translate = new Translate();
        text = translate.execute("I love cookies", Language.ENGLISH, Language.PORTUGUESE);

        System.out.println("Original text..: " + translate.getSourceText());
        System.out.println("Translated text: " + text);

        // Setting the parameters through setters and calling execute() without parameters
        translate.setSourceLang(Language.ENGLISH);
        translate.setDestLang(Language.PORTUGUESE);
        translate.setSourceText("Angelina Jolie is an Oscar-winning actress who has become popular by taking on the title role in the \"Lara Croft\" series of blockbuster movies. Off-screen, Jolie has become prominently involved in international charity projects, especially those involving refugees. She often appears on many \"most beautiful women\" lists, and she has a personal life that is avidly covered by the tabloid press. In her earliest years, Angelina began absorbing the acting craft from her parents - her father is the Oscar-winning actor Jon Voight and her mother is Marcheline Bertrand, who had studied with Lee Strasberg. At age 11, Angelina began studying at the Lee Strasberg Theatre Institute, where she was seen in several stage productions. She undertook some film studies at New York University and later joined the renowned Met Theatre Group in Los Angeles. At age 16, she took up a career in modeling and appeared in some music videos. Her good looks may derive from her ancestry, which is German and Slovak on her father's side, and French-Canadian, Dutch, German, Czech, and remote Huron, on her mother's side. In the mid-1990s, Jolie appeared in various small films where she got good notices, including Hackers (1995) and Rebeldes (1996). Her critical acclaim increased when she played strong roles in the made-for-TV movies Prova de Fogo (1997), and in George Wallace (1997) which won her a Golden Globe Award and an Emmy nomination. Jolie's acclaim increased even further when she played the lead role in the HBO production Gia - Fama E Destruição (1998). This was the true life story of supermodel Gia Carangi, a sensitive wild child who was both brazen and needy and who had a difficult time handling professional success and the deaths of people who were close to her. Carangi became involved with drugs and because of her needle-using habits she became, at the tender age of 26, one of the first celebrities to die of AIDS. Jolie's performance in Gia - Fama E Destruição (1998) again garnered a Golden Globe Award and another Emmy nomination, and she additionally earned a SAG Award. Angelina got a major break in 1999 when she won a leading role in the successful feature O Colecionador de Ossos (1999), starring alongside Denzel Washington. In that same year, Jolie gave a tour de force performance in Garota, Interrompida (1999) playing opposite Winona Ryder. The movie was a true story of women who spent time in a psychiatric hospital. Jolie's role was reminiscent of Jack Nicholson's character in Um Estranho no Ninho (1975), the role which won Nicholson his first Oscar. Unlike \"Cuckoo\", \"Girl\" was a small film that received mixed reviews and barely made money at the box office. But when it came time to give out awards, Jolie won the triple crown -- \"Girl\" propelled her to win the Golden Globe Award, the SAG Award and the Academy Award for best leading actress in a supporting role. With her new-found prominence, Jolie began to get in-depth attention from the press. Numerous aspects of her controversial personal life became news. At her wedding to her Hackers (1995) co-star Jonny Lee Miller, she had displayed her husband's name on the back of her shirt painted in her own blood. Jolie and Miller divorced, and in 2000, she married her Alto Controle (1999) co-star Billy Bob Thornton. Jolie had become the fifth wife of a man twenty years her senior. During her marriage to Thornton, the spouses each wore a vial of the other's blood around their necks. That marriage came apart in 2002 and ended in divorce. In addition, Jolie was estranged from her famous father, Jon Voight. In 2000, Jolie was asked to star in Lara Croft: Tomb Raider (2001). At first, she expressed disinterest, but then decided that the required training for the athletic role was intriguing. The Croft character was drawn from a popular video game. Lara Croft was a female cross between Indiana Jones and James Bond. When the film was released, critics were unimpressed with the final product, but critical acclaim wasn't the point of the movie. The public paid $275 million for theater tickets to see a buffed up Jolie portray the adventuresome Lara Croft. Jolie's father Jon Voight appeared in \"Croft\", and during filming there was a brief rapprochement between father and daughter. One of the Croft movie's filming locations was Cambodia. While there, Jolie witnessed the natural beauty, culture and poverty of that country. She considered this an eye opening experience, and so began the humanitarian chapter of her life. Jolie began visiting refugee camps around the world and came to be formally appointed as a Goodwill Ambassador for the United Nations High Commissioner for Refugees (UNHCR). Some of her experiences were written and published in her popular book \"Notes from My Travels\" whose profits go to UNHCR. Jolie has stated that she now plans to spend most of her time in humanitarian efforts, to be financed by her actress salary. She devotes one third of her income to savings, one third to living expenses and one third to charity. In 2002, Angelina adopted a Cambodian refugee boy named Maddox, and in 2005, adopted an Ethiopian refugee girl named Zahara. Jolie's dramatic feature film Amor Sem Fronteiras (2003) parallels some of her real life humanitarian experiences although, despite the inclusion of a romance between two westerners, many of the movie's images were too depressingly realistic -- the film was not popular among critics or at the box office. In 2004, Jolie began filming Sr. & Sra. Smith (2005) with co-star Brad Pitt. The film became a major box office success. There were rumors that Pitt and Jolie had an affair while filming \"Smith\". Jolie insisted that because her mother had been hurt by adultery, she herself could never participate in an affair with a married man, therefore there had been no affair with Pitt at that time. Nonetheless, Pitt separated from his wife Jennifer Aniston in January 2005 and, in the months that followed, he was frequently seen in public with Jolie, apparently as a couple. Pitt's divorce was finalized later in 2005. Jolie and Pitt announced in early 2006 that they would have a child together, and Jolie gave birth to daughter Shiloh that May. They also adopted a three-year-old Vietnamese boy named Pax. The couple continues to pursue movie and humanitarian projects.");
        text = translate.execute();

        System.out.println("Original text..: " + translate.getSourceText());
        System.out.println("Translated text: " + text);
    }
}