package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface ImageService {
	public void addImage(ImageDTO img);
	public List<ImageDTO> imageList(Proxy pxy);
	public List<ImageDTO> searchImages(Proxy pxy);
	public ImageDTO searchImage(ImageDTO img);
	public int imageCount(ImageDTO img);
	
	public void modifyImage(Proxy pxy);
	public void removeImage(Proxy pxy);

}
