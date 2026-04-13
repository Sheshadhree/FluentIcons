package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceDnd24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceDnd24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(18.627f, 0f, 12f, 0f)
            reflectiveCurveTo(0f, 5.373f, 0f, 12f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            close()
            moveTo(7.5f, 10.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(6.672f, 13.5f, 6f, 12.828f, 6f, 12f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            close()
        }
    }.build()
}
