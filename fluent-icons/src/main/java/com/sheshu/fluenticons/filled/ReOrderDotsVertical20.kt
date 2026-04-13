package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReOrderDotsVertical20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderDotsVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 6f)
            curveTo(7.328f, 6f, 8f, 5.328f, 8f, 4.5f)
            reflectiveCurveTo(7.328f, 3f, 6.5f, 3f)
            reflectiveCurveTo(5f, 3.672f, 5f, 4.5f)
            reflectiveCurveTo(5.672f, 6f, 6.5f, 6f)
            close()
            moveToRelative(0f, 5f)
            curveTo(7.328f, 11f, 8f, 10.328f, 8f, 9.5f)
            reflectiveCurveTo(7.328f, 8f, 6.5f, 8f)
            reflectiveCurveTo(5f, 8.672f, 5f, 9.5f)
            reflectiveCurveTo(5.672f, 11f, 6.5f, 11f)
            close()
            moveTo(8f, 14.5f)
            curveTo(8f, 15.328f, 7.328f, 16f, 6.5f, 16f)
            reflectiveCurveTo(5f, 15.328f, 5f, 14.5f)
            reflectiveCurveTo(5.672f, 13f, 6.5f, 13f)
            reflectiveCurveTo(8f, 13.672f, 8f, 14.5f)
            close()
            moveTo(13.5f, 6f)
            curveTo(14.328f, 6f, 15f, 5.328f, 15f, 4.5f)
            reflectiveCurveTo(14.328f, 3f, 13.5f, 3f)
            reflectiveCurveTo(12f, 3.672f, 12f, 4.5f)
            reflectiveCurveTo(12.672f, 6f, 13.5f, 6f)
            close()
            moveTo(15f, 9.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(12f, 10.328f, 12f, 9.5f)
            reflectiveCurveTo(12.672f, 8f, 13.5f, 8f)
            reflectiveCurveTo(15f, 8.672f, 15f, 9.5f)
            close()
            moveTo(13.5f, 16f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(14.328f, 13f, 13.5f, 13f)
            reflectiveCurveTo(12f, 13.672f, 12f, 14.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
