package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReOrderDotsHorizontal16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderDotsHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 5.5f)
            curveTo(11f, 6.328f, 11.672f, 7f, 12.5f, 7f)
            reflectiveCurveTo(14f, 6.328f, 14f, 5.5f)
            reflectiveCurveTo(13.328f, 4f, 12.5f, 4f)
            reflectiveCurveTo(11f, 4.672f, 11f, 5.5f)
            close()
            moveToRelative(-4.5f, 0f)
            curveTo(6.5f, 6.328f, 7.172f, 7f, 8f, 7f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(8.828f, 4f, 8f, 4f)
            reflectiveCurveTo(6.5f, 4.672f, 6.5f, 5.5f)
            close()
            moveTo(3.5f, 7f)
            curveTo(2.672f, 7f, 2f, 6.328f, 2f, 5.5f)
            reflectiveCurveTo(2.672f, 4f, 3.5f, 4f)
            reflectiveCurveTo(5f, 4.672f, 5f, 5.5f)
            reflectiveCurveTo(4.328f, 7f, 3.5f, 7f)
            close()
            moveToRelative(7.5f, 3.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(13.328f, 9f, 12.5f, 9f)
            reflectiveCurveTo(11f, 9.672f, 11f, 10.5f)
            close()
            moveTo(8f, 12f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(7.172f, 9f, 8f, 9f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(8.828f, 12f, 8f, 12f)
            close()
            moveToRelative(-6f, -1.5f)
            curveTo(2f, 11.328f, 2.672f, 12f, 3.5f, 12f)
            reflectiveCurveTo(5f, 11.328f, 5f, 10.5f)
            reflectiveCurveTo(4.328f, 9f, 3.5f, 9f)
            reflectiveCurveTo(2f, 9.672f, 2f, 10.5f)
            close()
        }
    }.build()
}
