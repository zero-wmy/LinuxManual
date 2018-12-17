package com.zero.linuxstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ReadMenuActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.readmenu);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.listview);// 设置视图列表
		String cmds[] = new String[] { 
				"1.1.1 Shell 简介",
				"1.1.2 Shell 控制台使用方法",
				"1.1.1 Shell 简介",
				"1.1.2 Shell 控制台使用方法",
				"1.2 常用命令使用",
				"1.2.1 登录和退出 Linux系统",
				"1.2.2 文件和目录操作命令",
				"1.2.3 用户及用户组管理命令",
				"1.2.4 进程及任务管理命令",
				"1.2.5 磁盘及文件系统管理命令",
				"1.2.6 软件安装命令", 
				"2.1 cat 命令介绍",
				"2.2 vi 命令介绍",
				"2.2.1 vi 的进入与退出",
				"2.2.2 vi 中显示行号",
				"2.2.3 光标移动操作",
				"2.2.4 文本插入操作",
				"2.2.5 文本修改操作",
				"2.2.6 文本搜索与替换操作",
				"2.3 head 及 tail 命令介绍",
				"3.1 网络配置命令",
				"3.1.1 ifconfig",
				"3.1.2 route",
				"3.2 网络操作命令",
				"3.2.1 netstat",
				"3.2.2 nslookup",
				"3.2.3 host",
				"3.2.4 finger",
				"3.2.5 Ping 命令",
				"3.3.1 /etc/sysconfig/network 网络设置",
				"3.3.2 /etc/hosts IP 地址和主机名的映射",
				"3.3.3 /etc/services",
				"3.3.4 /etc/host.conf 配置名字解析器",
				"3.3.5 /etc/nsswitch.conf 配置名字解析器",
				"3.3.6 /etc/resolv.conf 配置 DNS 客户",
				"3.3.7 /etc/xinetd.conf",
				"3.3.8 /etc/modules.conf 文件",
				"3.3.9 /etc/sysconfig/network-scripts/ifcfg-ethN 文件",
				"3.4 常用网络操作方法",
				"3.4.1 ftp 远程文件传输",
				"3.4.2 telnet",
				"3.4.3 r-系列命令",
				"4.1 Linux下软件包的安装及卸载",
				"4.1.1 RPM 安装操作",
				"4.1.2 RPM 查询操作",
				"4.1.3 RPM 卸载操作",
				"4.1.4 RPM 升级操作",
				"4.1.5 RPM 验证操作",
				"4.1.6 RPM 的其他附加命令",
				"4.2 Linux操作系统的时钟系统",
				"4.2.1 时钟系统介绍",
				"4.2.2 硬件时钟系统与系统时间的同步",
				"4.3 系统信息及运行状态监控",
				"4.3.1 df 命令",
				"4.3.2 du 命令",
				"4.3.3 top 命令",
				"4.3.4 iostat 命令",
				"4.4 打包/压缩工具 tar",
				"4.5 文件及文件内容的查找",
				"4.5.1 文件查找命令find",
				"4.5.2 文件内容查找命令 grep",
				"4.6 Linux的系统服务及其配置",
				"4.6.1 服务简介",
				"4.6.2 启动和停止服务",
				"4.6.3 服务的添加 删除 自动运行及状态"
		};
		ListAdapter adapter = new MyAdapter(this, cmds);
        ListView listView = (ListView) findViewById(R.id.listview);
		listView.setAdapter(adapter);
        
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> l, View v, int position, long id) {
				String s = (String)l.getItemAtPosition(position);
				Toast.makeText(ReadMenuActivity.this, s, Toast.LENGTH_SHORT).show();
				showText("part5/"+position+".txt");
			}
		});
	}
	/***显示文本**/
	public void showText(String name){
		//往下一个界面传值，可省略
		startActivity( new Intent(this,ShowText.class).putExtra("key",name) );
	}

}
