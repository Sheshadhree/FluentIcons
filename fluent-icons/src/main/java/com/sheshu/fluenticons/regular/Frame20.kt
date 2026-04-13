package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Frame20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Frame20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.5f)
            curveTo(5f, 2.224f, 4.776f, 2f, 4.5f, 2f)
            reflectiveCurveTo(4f, 2.224f, 4f, 2.5f)
            verticalLineTo(4f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 4f, 2f, 4.224f, 2f, 4.5f)
            reflectiveCurveTo(2.224f, 5f, 2.5f, 5f)
            horizontalLineTo(4f)
            verticalLineToRelative(10f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 15f, 2f, 15.224f, 2f, 15.5f)
            reflectiveCurveTo(2.224f, 16f, 2.5f, 16f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 17.776f, 4.224f, 18f, 4.5f, 18f)
            reflectiveCurveTo(5f, 17.776f, 5f, 17.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 15f, 17.5f, 15f)
            horizontalLineTo(16f)
            verticalLineTo(5f)
            horizontalLineToRelative(1.5f)
            curveTo(17.776f, 5f, 18f, 4.776f, 18f, 4.5f)
            reflectiveCurveTo(17.776f, 4f, 17.5f, 4f)
            horizontalLineTo(16f)
            verticalLineTo(2.5f)
            curveTo(16f, 2.224f, 15.776f, 2f, 15.5f, 2f)
            reflectiveCurveTo(15f, 2.224f, 15f, 2.5f)
            verticalLineTo(4f)
            horizontalLineTo(5f)
            verticalLineTo(2.5f)
            close()
            moveTo(15f, 5f)
            verticalLineToRelative(10f)
            horizontalLineTo(5f)
            verticalLineTo(5f)
            horizontalLineToRelative(10f)
            close()
        }
    }.build()
}
