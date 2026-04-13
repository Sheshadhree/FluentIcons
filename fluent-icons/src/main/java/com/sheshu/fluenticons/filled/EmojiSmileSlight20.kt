package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EmojiSmileSlight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiSmileSlight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveTo(8.5f, 8.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(4f, -1f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(-4.026f, 5.553f)
            curveTo(8.89f, 13.26f, 9.435f, 13.375f, 10f, 13.375f)
            curveToRelative(0.565f, 0f, 1.11f, -0.114f, 1.526f, -0.322f)
            curveToRelative(0.247f, -0.124f, 0.548f, -0.024f, 0.671f, 0.223f)
            curveToRelative(0.124f, 0.247f, 0.024f, 0.548f, -0.223f, 0.671f)
            curveToRelative(-0.584f, 0.292f, -1.289f, 0.428f, -1.974f, 0.428f)
            reflectiveCurveToRelative(-1.39f, -0.136f, -1.974f, -0.428f)
            curveToRelative(-0.247f, -0.123f, -0.347f, -0.424f, -0.223f, -0.67f)
            curveToRelative(0.123f, -0.248f, 0.424f, -0.348f, 0.67f, -0.224f)
            close()
        }
    }.build()
}
