//
//  UMCOpenSDK.h
//  UMC
//
//  Created by LL on 16/6/13.
//  Copyright © 2016年 LL. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface UMCOpenSDK : NSObject

/**
 初始化参数
 @param clientID 申请能力平台成功后，分配给网站的appid
 @param clientSecret 申请能力平台成功后，分配给网站的appSecret
 @param redirect 申请能力平台时填写的地址
 */
+ (void)customInit:(NSString *)clientID clientSecret:(NSString *)clientSecret redirectURL:(NSString *)redirect;
/**
 是否选择移动提供短信验证码代替取号失败返回
 */
+ (void)setCustomSMS:(BOOL)enable;

/**
 用户可以自定义登录标题
 */
+ (void)setLoginTitle:(NSString *)loginTitle;

/**
 用户可以自定义Logo
 */
+ (void)setLogo:(UIImage *)image;

/**
 是否使用历史中间件，默认不使用
 */
+ (void)setHistoryEnable:(BOOL)enable;




@end
