package com.example.newsapp


import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment() {

    // Companion Object = Static function
    companion object{
        fun newInstance(news: News): NewsFragment{
            val newsFragment = NewsFragment()
            newsFragment.apply {
                this.arguments=Bundle().apply {
                    this.putSerializable("arg1", news)
                }
            }
            return newsFragment
        }
    }

    private var news:News? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            news = it.getSerializable("arg1") as News
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.picture_imageView).setImageResource(news?.picture!!)
        view.findViewById<TextView>(R.id.title_text).text = news?.title
        view.findViewById<TextView>(R.id.body_text).text = news?.body
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }


}
