package com.example.randomquotegenerator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val quotes =  listOf(
        "The best way to get started is to quit talking and begin doing.",
        "Don’t let yesterday take up too much of today.",
        "It’s not whether you get knocked down, it’s whether you get up.",
        "If you are working on something exciting, it will keep you motivated.",
        "Success doesn’t just find you. You have to go out and get it.",
        "The harder you work for something, the greater you’ll feel when you achieve it.",
        "Push yourself, because no one else is going to do it for you.",
        "Dream bigger. Do bigger.",
        "Don’t watch the clock; do what it does. Keep going.",
        "Great things never come from comfort zones.",
        "Wake up with determination. Go to bed with satisfaction.",
        "Do something today that your future self will thank you for.",
        "Little things make big days.",
        "It’s going to be hard, but hard does not mean impossible.",
        "Don’t wait for opportunity. Create it.",
        "Sometimes we’re tested not to show our weaknesses, but to discover our strengths.",
        "The key to success is to focus on goals, not obstacles.",
        "Success is what comes after you stop making excuses.",
        "The harder the battle, the sweeter the victory.",
        "Believe in yourself and all that you are.",
        "Work hard in silence. Let success make the noise.",
        "Stay positive. Work hard. Make it happen.",
        "Don’t stop until you’re proud.",
        "Doubt kills more dreams than failure ever will.",
        "Your only limit is your mind.",
        "Prove them wrong.",
        "You are capable of amazing things.",
        "Push through the pain. You’ll be proud you did.",
        "Difficult roads often lead to beautiful destinations.",
        "Don't be afraid to fail. Be afraid not to try.",
        "Success doesn’t come from what you do occasionally. It comes from what you do consistently.",
        "Do it with passion or not at all.",
        "Make today count.",
        "Discipline is the bridge between goals and accomplishment.",
        "Start where you are. Use what you have. Do what you can.",
        "You don’t have to be great to start, but you have to start to be great.",
        "Everything you’ve ever wanted is on the other side of fear.",
        "It always seems impossible until it’s done.",
        "Act as if what you do makes a difference. It does.",
        "Quality means doing it right when no one is looking.",
        "Perseverance is failing 19 times and succeeding the 20th.",
        "Success usually comes to those who are too busy to be looking for it.",
        "Opportunities don't happen. You create them.",
        "Don’t limit your challenges. Challenge your limits.",
        "Hard work beats talent when talent doesn’t work hard.",
        "The secret of getting ahead is getting started.",
        "Be stronger than your excuses.",
        "You miss 100% of the shots you don’t take.",
        "A winner is a dreamer who never gives up.",
        "The only place where success comes before work is in the dictionary.",
        "Motivation is what gets you started. Habit is what keeps you going.",
        "The best way to predict the future is to create it.",
        "Your passion is waiting for your courage to catch up.",
        "Great minds discuss ideas. Average minds discuss events. Small minds discuss people.",
        "Success is not in what you have, but who you are.",
        "The way to get started is to quit talking and begin doing.",
        "Good things come to people who wait, but better things come to those who go out and get them.",
        "Don’t raise your voice, improve your argument.",
        "A goal without a plan is just a wish.",
        "Do not wait to strike till the iron is hot; but make it hot by striking.",
        "To live a creative life, we must lose our fear of being wrong.",
        "Failure will never overtake me if my determination to succeed is strong enough.",
        "Success is walking from failure to failure with no loss of enthusiasm.",
        "Try not to become a man of success, but rather try to become a man of value.",
        "Only put off until tomorrow what you are willing to die having left undone.",
        "If you genuinely want something, don’t wait for it – teach yourself to be impatient.",
        "There are no traffic jams along the extra mile.",
        "The function of leadership is to produce more leaders, not more followers.",
        "Success is liking yourself, liking what you do, and liking how you do it.",
        "As we look ahead into the next century, leaders will be those who empower others.",
        "Do what you can with all you have, wherever you are.",
        "The future belongs to the competent. Get good, get better, be the best!",
        "If you are not willing to risk the usual, you will have to settle for the ordinary.",
        "Learn as if you will live forever, live like you will die tomorrow.",
        "Don’t be pushed around by the fears in your mind. Be led by the dreams in your heart.",
        "Success is not how high you have climbed, but how you make a positive difference to the world.",
        "Happiness is not something ready made. It comes from your own actions.",
        "Be so good they can’t ignore you.",
        "The only way to do great work is to love what you do.",
        "Either you run the day, or the day runs you.",
        "What you get by achieving your goals is not as important as what you become by achieving your goals.",
        "I never dreamed about success. I worked for it.",
        "Do not be embarrassed by your failures, learn from them and start again.",
        "It does not matter how slowly you go as long as you do not stop.",
        "You are never too old to set another goal or to dream a new dream.",
        "If you want to achieve greatness stop asking for permission.",
        "Great things are done by a series of small things brought together.",
        "Don’t wait. The time will never be just right.",
        "To win big, you sometimes have to take big risks.",
        "Don’t downgrade your dream just to fit your reality, upgrade your conviction to match your destiny.",
        "You don’t find the happy life. You make it.",
        "You didn’t come this far to only come this far.",
        "Success is not final, failure is not fatal: It is the courage to continue that counts.",
        "Keep going. Everything you need will come to you at the perfect time.",
        "Make your life a masterpiece; imagine no limitations on what you can be, have or do.",
        "Work until your idols become your rivals.",
        "Doubt is a killer. You just have to know who you are and what you stand for.",
        "Discomfort is the price of admission to a meaningful life."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Set insets for edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // UI Elements
        val quoteTextView = findViewById<TextView>(R.id.quoteTextView)
        val generateButton = findViewById<Button>(R.id.generateQuoteButton)

        // Button click listener
        generateButton.setOnClickListener {
            val randomQuote = quotes[Random.nextInt(quotes.size)]
            quoteTextView.text = randomQuote
        }
    }
}
