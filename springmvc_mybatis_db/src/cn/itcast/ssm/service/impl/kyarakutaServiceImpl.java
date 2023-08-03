package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.custom.CustomkyarakutaMapper;
import cn.itcast.ssm.mapper.original.KyarakutaTableMapper;
import cn.itcast.ssm.po.original.KyarakutaTable;
import cn.itcast.ssm.service.kyarakutaService;


public class kyarakutaServiceImpl implements kyarakutaService {

    @Autowired
    private KyarakutaTableMapper kyarakutaMapper;
    
    @Autowired
    private CustomkyarakutaMapper customkyarakutaMapper;
   
    
    @Override
    public int inserkyarakuta(KyarakutaTable kyarakuta) throws Exception {
    	int ret = kyarakutaMapper.insert(kyarakuta);
        return ret;
    }

	@Override
	public List<KyarakutaTable> findkyarakutaList(KyarakutaTable kyarakuta) {
		return customkyarakutaMapper.findkyarakutaList(kyarakuta);
	}

	@Override
	public int updatekyarakuta(KyarakutaTable kyarakuta) {
        return 0;
		
	}

	@Override
	public KyarakutaTable findkyarakutaByID(String kyarakutaId) {
        return null;
	}

	@Override
	public int deleteItems(String[] kyarakutaIds) {
		
		
		return 0;
	}

}
