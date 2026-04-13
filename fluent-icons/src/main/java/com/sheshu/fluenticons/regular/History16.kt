package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.History16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.History16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            curveToRelative(2.76f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            curveToRelative(-2.609f, 0f, -4.75f, -1.997f, -4.98f, -4.545f)
            curveTo(2.994f, 8.18f, 2.752f, 7.977f, 2.476f, 8.002f)
            curveTo(2.202f, 8.027f, 1.999f, 8.27f, 2.023f, 8.545f)
            curveTo(2.3f, 11.604f, 4.87f, 14f, 8f, 14f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            curveTo(6.207f, 2f, 4.6f, 2.786f, 3.5f, 4.031f)
            verticalLineTo(2.5f)
            curveTo(3.5f, 2.224f, 3.275f, 2f, 3f, 2f)
            reflectiveCurveTo(2.5f, 2.224f, 2.5f, 2.5f)
            verticalLineToRelative(3f)
            curveTo(2.5f, 5.776f, 2.723f, 6f, 3f, 6f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(6.275f, 5f, 6f, 5f)
            horizontalLineTo(4f)
            curveToRelative(0.912f, -1.215f, 2.365f, -2f, 4f, -2f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(8f, 5.224f, 7.774f, 5f, 7.5f, 5f)
            curveTo(7.222f, 5f, 7f, 5.224f, 7f, 5.5f)
            verticalLineToRelative(3f)
            curveTo(7f, 8.776f, 7.222f, 9f, 7.5f, 9f)
            horizontalLineToRelative(2f)
            curveTo(9.774f, 9f, 10f, 8.776f, 10f, 8.5f)
            reflectiveCurveTo(9.774f, 8f, 9.5f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}
