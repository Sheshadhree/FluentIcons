package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Prohibited32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Prohibited32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.837f, 23.749f)
            curveTo(5.067f, 21.659f, 4f, 18.954f, 4f, 16f)
            curveTo(4f, 9.373f, 9.373f, 4f, 16f, 4f)
            curveToRelative(2.954f, 0f, 5.658f, 1.067f, 7.749f, 2.837f)
            lineTo(6.837f, 23.749f)
            close()
            moveToRelative(1.414f, 1.414f)
            lineTo(25.163f, 8.251f)
            curveTo(26.933f, 10.341f, 28f, 13.046f, 28f, 16f)
            curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
            curveToRelative(-2.954f, 0f, -5.658f, -1.067f, -7.749f, -2.837f)
            close()
            moveTo(2f, 16f)
            curveToRelative(0f, 7.732f, 6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            reflectiveCurveTo(2f, 8.268f, 2f, 16f)
            close()
        }
    }.build()
}
