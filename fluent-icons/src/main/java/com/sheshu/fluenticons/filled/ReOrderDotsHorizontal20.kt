package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReOrderDotsHorizontal20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderDotsHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 6.5f)
            curveTo(14f, 7.328f, 14.672f, 8f, 15.5f, 8f)
            reflectiveCurveTo(17f, 7.328f, 17f, 6.5f)
            reflectiveCurveTo(16.328f, 5f, 15.5f, 5f)
            reflectiveCurveTo(14f, 5.672f, 14f, 6.5f)
            close()
            moveToRelative(-5f, 0f)
            curveTo(9f, 7.328f, 9.672f, 8f, 10.5f, 8f)
            reflectiveCurveTo(12f, 7.328f, 12f, 6.5f)
            reflectiveCurveTo(11.328f, 5f, 10.5f, 5f)
            reflectiveCurveTo(9f, 5.672f, 9f, 6.5f)
            close()
            moveTo(5.5f, 8f)
            curveTo(4.672f, 8f, 4f, 7.328f, 4f, 6.5f)
            reflectiveCurveTo(4.672f, 5f, 5.5f, 5f)
            reflectiveCurveTo(7f, 5.672f, 7f, 6.5f)
            reflectiveCurveTo(6.328f, 8f, 5.5f, 8f)
            close()
            moveToRelative(8.5f, 5.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            close()
            moveTo(10.5f, 15f)
            curveTo(9.672f, 15f, 9f, 14.328f, 9f, 13.5f)
            reflectiveCurveTo(9.672f, 12f, 10.5f, 12f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(4f, 13.5f)
            curveTo(4f, 14.328f, 4.672f, 15f, 5.5f, 15f)
            reflectiveCurveTo(7f, 14.328f, 7f, 13.5f)
            reflectiveCurveTo(6.328f, 12f, 5.5f, 12f)
            reflectiveCurveTo(4f, 12.672f, 4f, 13.5f)
            close()
        }
    }.build()
}
