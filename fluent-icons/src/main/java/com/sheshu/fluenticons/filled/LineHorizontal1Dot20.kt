package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal1Dot20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal1Dot20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 11f)
            curveTo(4.328f, 11f, 5f, 10.328f, 5f, 9.5f)
            reflectiveCurveTo(4.328f, 8f, 3.5f, 8f)
            reflectiveCurveTo(2f, 8.672f, 2f, 9.5f)
            reflectiveCurveTo(2.672f, 11f, 3.5f, 11f)
            close()
            moveTo(8f, 11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(8.828f, 8f, 8f, 8f)
            reflectiveCurveTo(6.5f, 8.672f, 6.5f, 9.5f)
            reflectiveCurveTo(7.172f, 11f, 8f, 11f)
            close()
            moveToRelative(4.5f, 0f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(13.328f, 8f, 12.5f, 8f)
            reflectiveCurveTo(11f, 8.672f, 11f, 9.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveToRelative(6f, -1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(16.172f, 8f, 17f, 8f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
