package com.blog.dao;
//博客类别对应的数据库接口，定义了博客类别的查询、增加、修改、删除
import com.blog.entity.BlogType;
import java.util.List;
import java.util.Map;

public abstract interface BlogTypeDao
{
  public abstract List<BlogType> countList();
  
  public abstract BlogType findById(Integer paramInteger);
  
  public abstract List<BlogType> list(Map<String, Object> paramMap);
  
  public abstract Long getTotal(Map<String, Object> paramMap);
  
  public abstract Integer add(BlogType paramBlogType);
  
  public abstract Integer update(BlogType paramBlogType);
  
  public abstract Integer delete(Integer paramInteger);
}



/* Location:           D:\classes\

 * Qualified Name:     com.blog.dao.BlogTypeDao

 * JD-Core Version:    0.7.0.1

 */