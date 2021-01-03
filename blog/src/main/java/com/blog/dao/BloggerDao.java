package com.blog.dao;
//用户对应的数据库接口，定义了用户的查询、增加、修改、删除
import com.blog.entity.Blogger;

public abstract interface BloggerDao
{
  public abstract Blogger find();
  
  public abstract Blogger getByUserName(String paramString);
  
  public abstract Integer update(Blogger paramBlogger);
}



/* Location:           D:\classes\

 * Qualified Name:     com.blog.dao.BloggerDao

 * JD-Core Version:    0.7.0.1

 */