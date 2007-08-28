/* Copyright (c) 2006 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.gdata.data.youtube;

import com.google.gdata.util.common.xml.XmlWriter;

/**
 * YouTube namespace definition.
 *
 * 
 */
public class YouTubeNamespace {

  /** Namespace URI */
  public static final String URI = "http://gdata.youtube.com/schemas/2007";

  /** Standard namespace prefix. */
  public static final String PREFIX = "yt";

  /** Namespace object. */
  public static final XmlWriter.Namespace NS =
      new XmlWriter.Namespace(PREFIX, URI);

  /**
   * Kind linked to {@link VideoEntry}.
   */
  public static final String KIND_VIDEO = URI + "#video";

  /**
   * Kind linked to {@link CommentEntry}.
   */
  public static final String KIND_COMMENT = URI + "#comment";
  
  /**
   * Kind linked to {@link PlaylistLinkEntry}.
   */
  public static final String KIND_PLAYLIST_LINK = URI + "#playlistLink";

  /**
   * Kind linked to {@link SubscriptionEntry}.
   */
  public static final String KIND_SUBSCRIPTION = URI + "#subscription";

  /**
   * Kind linked to {@link FriendEntry}.
   */
  public static final String KIND_FRIEND = URI + "#friend";

  /**
   * Kind linked to {@link UserProfileEntry}.
   */
  public static final String KIND_USER_PROFILE = URI + "#userProfile";

  /**
   * Kind linked to {@link PlaylistEntry}.
   */
  public static final String KIND_PLAYLIST = URI + "#playlist";

  /**
   * Scheme used for atom:categories and media:categories.
   */
  public static final String CATEGORY_SCHEME = URI + "/categories.cat";

  /**
   * Scheme used for keywords in atom:categories.
   */
  public static final String KEYWORD_SCHEME = URI + "/keywords.cat";

  /**
   * Scheme used for atom:categories, which is mapped to playlist tags.
   */
  public static final String TAG_SCHEME = URI + "/tags.cat";

  /**
   * Scheme used for atom:categories which correspond to contact lists.
   */
  public static final String CONTACT_LIST_SCHEME = URI + "/contact.cat";

  /**
   * Scheme used for atom:categories which describes the type of subscription
   * defined in the entry.
   */
  public static final String SUBSCRIPTIONTYPE_SCHEME = URI
      + "/subscriptiontypes.cat";

  /**
   * Link Rel value for the feed of a playlist (containing playlist entries)
   */
  public static final String PLAYLIST_REL = URI + "#playlist";
  /**
   * Link Rel value for user upload links.
   */
  public static final String UPLOADS_REL = URI + "#user.uploads";

  /**
   * Link Rel value for user subscriptions links.
   */
  public static final String SUBSCRIPTIONS_REL = URI + "#user.subscriptions";

  /**
   * Link Rel value for user playlists links.
   */
  public static final String PLAYLISTS_REL = URI + "#user.playlists";

  /**
   * Link Rel value for user favorites links.
   */
  public static final String FAVORITES_REL = URI + "#user.favorites";

  /**
   * Link Rel value for user contacts links.
   */
  public static final String CONTACTS_REL = URI + "#user.contacts";

  /**
   * Link Rel value for video responses links.
   */
  public static final String RESPONSES_REL = URI + "#video.responses";

  /**
   * Link Rel value for video comments links.
   */
  public static final String COMMENTS_REL = URI + "#comments";

  /**
   * Link Rel value for related videos links.
   */
  public static final String RELATED_REL = URI + "#video.related";

  /**
   * Link Rel value for parent comment link on the comments feed.
   */
  public static final String IN_REPLY_TO = URI + "#in-reply-to";

  /**
   * Link Rel value for video queries (eg. /feeds/videos/-/Tag1/Tag2?vq=dog)
   */
  public static final String VIDEO_QUERY_REL = URI + "#video.query";

}
