package main;

import java.util.UUID;

/**
 * 1.UUID 简介 UUID含义是通用唯一识别码 (Universally Unique * Identifier)，这是一个软件建构的标准，
 * 也是被开源软件基金会 (Open Software Foundation, * OSF)的组织应用在分布式计算环境 (Distributed Computing Environment, DCE) 领域的一部分。
 * UUID 的目的，是让分布式系统中的所有元素，都能有唯一的辨识资讯，而不需要透过中央控制端来做辨识资讯的指定。
 * 如此一来，每个人都可以建立不与其它人冲突的 UUID。
 * 在这样的情况下，就不需考虑数据库建立时的名称重复问题。目前最广泛应用的 UUID，即是微软的 Microsoft's Globally Unique Identifiers (GUIDs)，
 * 而其他重要的应用，则有 Linux ext2/ext3 档案系统、LUKS 加密分割区、GNOME、KDE、Mac OS X 等等
 *
 * 2.UUID 组成
 * UUID保证对在同一时空中的所有机器都是唯一的。
 * 通常平台会提供生成的API。按照开放软件基金会(OSF)制定的标准计算，用到了以太网卡地址、纳秒级时间、芯片ID码和许多可能的数字 
 * UUID由以下几部分的组合：
 * （1）当前日期和时间，UUID的第一个部分与时间有关，如果你在生成一个UUID之后，过几秒又生成一个UUID，则第一个部分不同，其余相同。
 * （2）时钟序列。 
 * （3）全局唯一的IEEE机器识别号，如果有网卡，从网卡MAC地址获得，没有网卡以其他方式获得。
 * UUID的唯一缺陷在于生成的结果串会比较长。
 * 关于UUID这个标准使用最普遍的是微软的GUID(Globals Unique Identifiers)。
 * 在ColdFusion中可以用CreateUUID()函数很简单地生成UUID， 其格式为：xxxxxxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx(8-4-4-16)，
 * 其中每个 x 是 0-9 或 a-f范围内的一个十六进制的数字。
 * 而标准的UUID格式为：xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx (8-4-4-4-12);
 */
public class UUIDGenerator {
	public static String getUUID_0() {
		String str = UUID.randomUUID().toString();
		return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23)
				+ str.substring(24);
	}

	public static String getUUID_1() {
		String str = UUID.randomUUID().toString();
		return str;
	}

	public static void main(String[] args) {
		// 去掉"-"
		System.out.println(getUUID_0());
		// 运行结果，例如，97389c86a33e401eacc1c1019a732e37, 32位

		// 默认的，包含"-"
		System.out.println(getUUID_1());
		// 运行结果，例如，83fb82be-8dcc-4a6b-bd0a-9ebbf79228cb, 36位
	}
}
