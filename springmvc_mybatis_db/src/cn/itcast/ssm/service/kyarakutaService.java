package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.original.KyarakutaTable;


public interface kyarakutaService {
	
	@Autowired
    private KyarakutaTableMapper kyarakutaMapper;
    @Autowired
    private CustomKyarakutaMapper customkyarakutaMapper;
	
	
	

	public int inserkyarakuta(KyarakutaTable kyarakuta) throws Exception;

	public List<KyarakutaTable> findkyarakutaList(KyarakutaTable kyarakuta);

	public int updatekyarakuta(KyarakutaTable kyarakuta);

	public KyarakutaTable findkyarakutaByID(String kyarakutaId);
	
	   

	public int deleteItems(String[] kyarakutaIds);

}
