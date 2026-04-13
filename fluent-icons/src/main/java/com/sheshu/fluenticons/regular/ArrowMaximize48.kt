package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowMaximize48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowMaximize48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(38.75f, 8f)
            curveTo(39.44f, 8f, 40f, 8.56f, 40f, 9.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(12.268f)
            lineTo(12.268f, 37.5f)
            horizontalLineTo(24.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(25.44f, 40f, 24.75f, 40f)
            horizontalLineTo(9.25f)
            curveTo(8.56f, 40f, 8f, 39.44f, 8f, 38.75f)
            verticalLineToRelative(-15.5f)
            curveTo(8f, 22.56f, 8.56f, 22f, 9.25f, 22f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(12.482f)
            lineTo(35.732f, 10.5f)
            horizontalLineTo(23.25f)
            curveTo(22.56f, 10.5f, 22f, 9.94f, 22f, 9.25f)
            reflectiveCurveTo(22.56f, 8f, 23.25f, 8f)
            horizontalLineToRelative(15.5f)
            close()
        }
    }.build()
}
