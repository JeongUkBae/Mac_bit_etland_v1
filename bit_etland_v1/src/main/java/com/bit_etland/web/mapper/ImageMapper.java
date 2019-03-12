package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface ImageMapper {
	public void insertImage(ImageDTO img);
	public List<ImageDTO> selectAllimageList(Proxy pxy);
	public List<ImageDTO> SelectImages(Proxy pxy);
	public ImageDTO selectImage(ImageDTO img);
	public String lastImageSeq();
	public int countImages(ImageDTO img);
	
	public void updateImage(Proxy pxy);
	public void deleteImage(Proxy pxy);
}
