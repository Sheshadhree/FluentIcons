package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReOrderDotsVertical16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderDotsVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 5f)
            curveTo(6.328f, 5f, 7f, 4.328f, 7f, 3.5f)
            reflectiveCurveTo(6.328f, 2f, 5.5f, 2f)
            reflectiveCurveTo(4f, 2.672f, 4f, 3.5f)
            reflectiveCurveTo(4.672f, 5f, 5.5f, 5f)
            close()
            moveToRelative(0f, 4.5f)
            curveTo(6.328f, 9.5f, 7f, 8.828f, 7f, 8f)
            reflectiveCurveTo(6.328f, 6.5f, 5.5f, 6.5f)
            reflectiveCurveTo(4f, 7.172f, 4f, 8f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveToRelative(1.5f, 3f)
            curveTo(7f, 13.328f, 6.328f, 14f, 5.5f, 14f)
            reflectiveCurveTo(4f, 13.328f, 4f, 12.5f)
            reflectiveCurveTo(4.672f, 11f, 5.5f, 11f)
            reflectiveCurveTo(7f, 11.672f, 7f, 12.5f)
            close()
            moveTo(10.5f, 5f)
            curveTo(11.328f, 5f, 12f, 4.328f, 12f, 3.5f)
            reflectiveCurveTo(11.328f, 2f, 10.5f, 2f)
            reflectiveCurveTo(9f, 2.672f, 9f, 3.5f)
            reflectiveCurveTo(9.672f, 5f, 10.5f, 5f)
            close()
            moveTo(12f, 8f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(9f, 8.828f, 9f, 8f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveTo(12f, 7.172f, 12f, 8f)
            close()
            moveToRelative(-1.5f, 6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(11.328f, 11f, 10.5f, 11f)
            reflectiveCurveTo(9f, 11.672f, 9f, 12.5f)
            reflectiveCurveTo(9.672f, 14f, 10.5f, 14f)
            close()
        }
    }.build()
}
