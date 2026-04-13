package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceDnd12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceDnd12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 0f)
            curveTo(2.686f, 0f, 0f, 2.686f, 0f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
            moveTo(1.5f, 6f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(1.5f, 8.485f, 1.5f, 6f)
            close()
            moveTo(3f, 6f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(4.5f)
            curveTo(8.664f, 5.25f, 9f, 5.586f, 9f, 6f)
            reflectiveCurveTo(8.664f, 6.75f, 8.25f, 6.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(3.336f, 6.75f, 3f, 6.414f, 3f, 6f)
            close()
        }
    }.build()
}
