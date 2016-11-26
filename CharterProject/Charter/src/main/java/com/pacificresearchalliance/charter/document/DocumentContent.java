package com.pacificresearchalliance.charter.document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DocumentContent {

    /**
     * An array of sample (document) items.
     */
    public static List<DocumentItem> ITEMS = new ArrayList<DocumentItem>();

    /**
     * A map of sample (document) items, by ID.
     */
    public static Map<String, DocumentItem> ITEM_MAP = new HashMap<String, DocumentItem>();

    static {
        addItem(new DocumentItem("1", "Guarantee of Rights and Freedoms"));
        addItem(new DocumentItem("2", "Fundamental Freedoms"));
        addItem(new DocumentItem("3", "Democratic Rights"));
        addItem(new DocumentItem("4", "Mobility Rights"));
        addItem(new DocumentItem("5", "Legal Rights"));
        addItem(new DocumentItem("6", "Equality Rights"));
        addItem(new DocumentItem("7", "Official Languages of Canada"));
        addItem(new DocumentItem("8", "Minority Language Rights"));
        addItem(new DocumentItem("9", "Enforcement"));
        addItem(new DocumentItem("10", "General"));
        addItem(new DocumentItem("11", "Application of Charter"));
       // addItem(new DocumentItem("12", "Citation"));

    }

    private static void addItem(DocumentItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A document item representing a piece of content.
     */
    public static class DocumentItem {
        public String id;
        public String content;

        public DocumentItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
