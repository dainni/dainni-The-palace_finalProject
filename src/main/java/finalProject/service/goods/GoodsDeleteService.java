package finalProject.service.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import finalProject.domain.GoodsDTO;
import finalProject.mapper.GoodsMapper;

@Service
public class GoodsDeleteService {
    @Autowired
    GoodsMapper goodsMapper;
    
	public void gdDelPro(String goodsNo, Model model) {
		// TODO Auto-generated method stub
		
		GoodsDTO gdto = goodsMapper.gdList(goodsNo).get(0);
		
		goodsMapper.gdDel(goodsNo);
		
		
	}

}
