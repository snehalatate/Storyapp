package com.example.storyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    var storyTitles = arrayOf<String>()
    var storyContents = arrayOf<String>()
    var storyImages = arrayOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        val toggle =
            ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        toggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navigationView.setNavigationItemSelectedListener(this)
//        val storyTitles = resources.getStringArray(R.array.storyTitles)
//        val storyContents = resources.getStringArray(R.array.storyContents)
//        val storyImages = resources.getStringArray(R.array.storyImages)
          val storyTitles= arrayOf( " The story of an hour","The blur","Astronaut Annie","THe Night Knights","Pillowland","Night Night, Jungle")



        val storyContents = arrayOf( " The Story of an Hour is Kate Chopin’s short story about the thoughts of a woman after she is told that her husband has died in an accident. The story first appeared in Vogue in 1894 and is today one of Chopin’s most popular works.",
        "The lorem ipsum is a placeholder text used in publishing and graphic design. This filler text is a short paragraph that contains all the letters of the alphabet.Suspendisse potenti. Donec vitae purus eget metus placerat ullamcorper at eu ex. Praesent turpis nulla, fermentum ut tempor a, fermentum quis metus. Maecenas viverra finibus maximus. Integer non est mi. Quisque sagittis dui turpis, id congue diam pretium at. Nam dapibus lorem eget venenatis molestie. Morbi a arcu in orci porta ornare. Nullam in magna ut ipsum tincidunt pretium vel a arcu. Duis euismod eget nibh vel aliquam.\n" +
                "\n" +
                "Proin gravida neque vel odio tempus feugiat ut sit amet leo. Quisque vitae dolor at odio efficitur ultrices nec ac mauris. Phasellus eu felis varius, convallis metus nec, porta augue. Integer eros turpis, scelerisque at nisi a, luctus sollicitudin nunc. Nullam at enim non lacus condimentum varius. In aliquam dictum volutpat. Quisque augue odio, iaculis in felis non, aliquet congue eros. Aliquam sit amet dui a velit feugiat aliquet eu ut ante.\n" +
                "\n" +
                "Donec iaculis lectus id ornare vulputate. Nunc iaculis diam vel felis ullamcorper, id auctor lorem dignissim. Praesent fringilla risus vitae gravida hendrerit. Mauris lorem felis, congue ut semper sed, congue sit amet ligula. Cras pharetra tortor ac sem ornare, eget rhoncus nisl pretium. Ut eu velit tincidunt mi pharetra accumsan. Ut pretium mauris et volutpat fermentum. Phasellus blandit nisi mi, non ultrices magna ultricies in. Phasellus dapibus blandit tincidunt. Praesent ut cursus augue, ac condimentum urna. Nunc fringilla, dui sit amet lacinia lobortis, odio mauris porttitor ex, at ultrices quam ex sed nulla. Morbi sed lorem eleifend, auctor turpis hendrerit, molestie lacus. Nam in tristique lorem, vitae dapibus purus. Nunc ut accumsan sem. Ut tempus nec lectus imperdiet lobortis. Nullam porta lacinia orci, sed mollis justo scelerisque ut.",
                 "The Story of an Hour is Kate Chopin’s short story about the thoughts of a woman after she is told that her husband has died in an accident. The story first appeared in Vogue in 1894 and is today one of Chopin’s most popular works.\",\n" +
                         "        \"The lorem ipsum is a placeholder text used in publishing and graphic design. This filler text is a short paragraph that contains all the letters of the alphabet.Suspendisse potenti. Donec vitae purus eget metus placerat ullamcorper at eu ex. Praesent turpis nulla, fermentum ut tempor a, fermentum quis metus. Maecenas viverra finibus maximus. Integer non est mi. Quisque sagittis dui turpis, id congue diam pretium at. Nam dapibus lorem eget venenatis molestie. Morbi a arcu in orci porta ornare. Nullam in magna ut ipsum tincidunt pretium vel a arcu. Duis euismod eget nibh vel aliquam.\\n\" +\n" +
                         "                \"\\n\" +\n" +
                         "                \"Proin gravida neque vel odio tempus feugiat ut sit amet leo. Quisque vitae dolor at odio efficitur ultrices nec ac mauris. Phasellus eu felis varius, convallis metus nec, porta augue. Integer eros turpis, scelerisque at nisi a, luctus sollicitudin nunc. Nullam at enim non lacus condimentum varius. In aliquam dictum volutpat. Quisque augue odio, iaculis in felis non, aliquet congue eros. Aliquam sit amet dui a velit feugiat aliquet eu ut ante.\\n\" +\n" +
                         "                \"\\n\" +\n" +
                         "                \"Donec iaculis lectus id ornare vulputate. Nunc iaculis diam vel felis ullamcorper, id auctor lorem dignissim. Praesent fringilla risus vitae gravida hendrerit. Mauris lorem felis, congue ut semper sed, congue sit amet ligula. Cras pharetra tortor ac sem ornare, eget rhoncus nisl pretium. Ut eu velit tincidunt mi pharetra accumsan. Ut pretium mauris et volutpat fermentum. Phasellus blandit nisi mi, non ultrices magna ultricies in. Phasellus dapibus blandit tincidunt. Praesent ut cursus augue, ac condimentum urna. Nunc fringilla, dui sit amet lacinia lobortis, odio mauris porttitor ex, at ultrices quam ex sed nulla. Morbi sed lorem eleifend, auctor turpis hendrerit, molestie lacus. Nam in tristique lorem, vitae dapibus purus. Nunc ut accumsan sem. Ut tempus nec lectus imperdiet lobortis. Nullam porta lacinia orci, sed mollis justo scelerisque ut.","Nighttime can be scary. Every bump, thump, or scratch could be a monster lurking under the bed or in a closet. But if that’s the case, then why haven’t we ever seen a monster? You might think that’s because monsters don’t exist. But maybe monsters do exist . . . but so do something else: The Night Knights. And when night falls, they take their place, protecting us all from the terrors lurking in the dark.   With a lyrical text reminiscent of the bestseller Dream Animals, The Night Knights introduces reluctant sleepers to the many fantastical warriors who will protect them while they slumber, from the Guardians of Gates to the Midnight Flock.","         Night falls on the jungle,\n" +
                    "\n" +
                    "            And eyes shine, blinking, bright;\n" +
                    "\n" +
                    "            Let’s tip-toe in to see them all,\n" +
                    "\n" +
                    "            To tell each one, “Night night!”\n" +
                    "\n" +
                    "The remarkable bestselling Night Night series is moving into the jungle! Night Night, Jungle pairs the fun, rhyming text from bestselling author Amy Parker with the award-winning artwork of Virginia Allyn to help your kids wish their world “Night night!” From sleepy sloths to tired toucans, your little wild one will love the colorful art of cute animals settling in for bedtime. The jungle theme features fun and exciting illustrations of wild animals, inviting your children to say “Night night!” to each animal and to the loving God who made them.\n" +
                    "\n" +
                    "Night Night, Jungle is the perfect bedtime book for anyone who already loves Amy Parker’s award-winning Night Night, Farm and Night Night, Train.","Blur are an English rock band. Formed in London in 1988, the group consists of singer Damon Albarn, guitarist Graham Coxon, bassist Alex James and drummer Dave Rowntree. Blur's debut album Leisure incorporated the sounds of Madchester and shoegazing"
                  )
        val storyImages = arrayOf("https://picsum.photos/id/1060/536/354?blur=2", "https://i.picsum.photos/id/631/536/354.jpg?hmac=CaZIDxBkUFEWdDwr4oylYAIdm0mCmdTKbnYYMy0I6nc","https://picsum.photos/id/1003/367/267","https://picsum.photos/id/1010/367/267","https://picsum.photos/id/1025/367/267","https://picsum.photos/id/1015/367/267")

        val adapter=ItemAdapter(storyTitles,storyContents,storyImages)
        storylist.layoutManager= LinearLayoutManager(this)
        storylist.adapter=adapter
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        drawerLayout.closeDrawer(GravityCompat.START)
        if(item.itemId==R.id.random){
            val randPosition = Random.nextInt(0..storyTitles.size)
            val intent = Intent(applicationContext,Details::class.java)
            intent.putExtra("storyTitle",storyTitles[randPosition])
            intent.putExtra("storyContent",storyContents[randPosition])
            intent.putExtra("storyImage",storyImages[randPosition])
            startActivity(intent)
        }
        return true

    }
}