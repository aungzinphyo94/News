package com.azp.news.models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News{

	@SerializedName("status")
	@Expose
	private String status;

	@SerializedName("totalResults")
	@Expose
	private int totalResults;

	@SerializedName("articles")
	@Expose
	private List<Articles> articles;

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public void setArticles(List<Articles> articles){
		this.articles = articles;
	}

	public List<Articles> getArticles(){
		return articles;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

}