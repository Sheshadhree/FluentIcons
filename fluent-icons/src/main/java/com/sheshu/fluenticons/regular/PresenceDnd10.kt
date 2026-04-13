package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceDnd10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceDnd10",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.998f, 0f)
            curveTo(2.238f, 0f, 0f, 2.237f, 0f, 4.998f)
            curveToRelative(0f, 2.76f, 2.237f, 4.997f, 4.998f, 4.997f)
            curveToRelative(2.76f, 0f, 4.997f, -2.237f, 4.997f, -4.997f)
            reflectiveCurveTo(7.758f, 0f, 4.998f, 0f)
            close()
            moveTo(1f, 4.998f)
            curveTo(1f, 2.79f, 2.79f, 1f, 4.998f, 1f)
            reflectiveCurveToRelative(3.997f, 1.79f, 3.997f, 3.998f)
            reflectiveCurveToRelative(-1.79f, 3.997f, -3.997f, 3.997f)
            curveTo(2.79f, 8.995f, 1f, 7.205f, 1f, 4.998f)
            close()
            moveTo(3f, 5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveTo(6.776f, 4.5f, 7f, 4.724f, 7f, 5f)
            reflectiveCurveTo(6.776f, 5.5f, 6.5f, 5.5f)
            horizontalLineToRelative(-3f)
            curveTo(3.224f, 5.5f, 3f, 5.276f, 3f, 5f)
            close()
        }
    }.build()
}
