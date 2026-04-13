package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EmojiSurprise24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiSurprise24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2.004f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
            reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.805f, -8.5f, 8.5f)
            curveToRelative(0f, 4.694f, 3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            close()
            moveToRelative(0f, 9.495f)
            curveToRelative(1.243f, 0f, 2.25f, 1.008f, 2.25f, 2.25f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            reflectiveCurveToRelative(-2.25f, -1.007f, -2.25f, -2.25f)
            curveTo(9.75f, 14.007f, 10.757f, 13f, 12f, 13f)
            close()
            moveTo(9f, 8.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(9.69f, 11.249f, 9f, 11.249f)
            reflectiveCurveToRelative(-1.249f, -0.56f, -1.249f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.249f, 1.25f, -1.249f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.249f, -1.25f, 1.249f)
            reflectiveCurveToRelative(-1.249f, -0.56f, -1.249f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.249f, 1.25f, -1.249f)
            close()
        }
    }.build()
}
