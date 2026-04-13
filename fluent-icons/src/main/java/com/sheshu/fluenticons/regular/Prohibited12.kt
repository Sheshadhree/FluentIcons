package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Prohibited12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Prohibited12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(3.239f, 1f, 1f, 3.239f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
            moveTo(2f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            curveToRelative(0.924f, 0f, 1.775f, 0.313f, 2.453f, 0.84f)
            lineTo(2.84f, 8.453f)
            curveTo(2.314f, 7.775f, 2f, 6.924f, 2f, 6f)
            close()
            moveToRelative(1.547f, 3.16f)
            lineTo(9.16f, 3.547f)
            curveTo(9.686f, 4.224f, 10f, 5.076f, 10f, 6f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            curveToRelative(-0.924f, 0f, -1.776f, -0.314f, -2.453f, -0.84f)
            close()
        }
    }.build()
}
