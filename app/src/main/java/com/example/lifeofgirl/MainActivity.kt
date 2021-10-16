package com.example.lifeofgirl

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	private lateinit var adapter: PostAdapter
	var list: ArrayList<RecyclerData> = java.util.ArrayList()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		var actionBar: ActionBar? = supportActionBar
		actionBar?.hide()		//hide actionbar

		list = createList();
		adapter = PostAdapter(this,list)
		val mLayoutManager = LinearLayoutManager(this)
		posts.layoutManager = mLayoutManager
		posts.itemAnimator = DefaultItemAnimator()
		posts.setHasFixedSize(true)
		posts.adapter = adapter
	}

	private fun createList(): ArrayList<RecyclerData> {
		var list1: ArrayList<RecyclerData> = java.util.ArrayList()
		val obj = RecyclerData("Lorem ipsum",1,"Lorem ipsum",1,1,"Lorem ipsum")
		list1.add(obj)
		return list1;
	}
}