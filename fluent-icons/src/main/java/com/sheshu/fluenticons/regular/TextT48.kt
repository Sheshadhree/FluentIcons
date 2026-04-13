package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextT48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextT48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 9.25f)
            curveTo(10f, 8.56f, 10.56f, 8f, 11.25f, 8f)
            horizontalLineToRelative(25.5f)
            curveTo(37.44f, 8f, 38f, 8.56f, 38f, 9.25f)
            verticalLineTo(14f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(35.5f, 14.69f, 35.5f, 14f)
            verticalLineToRelative(-3.5f)
            horizontalLineTo(25.25f)
            verticalLineToRelative(27f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(29.44f, 40f, 28.75f, 40f)
            horizontalLineToRelative(-9.5f)
            curveTo(18.56f, 40f, 18f, 39.44f, 18f, 38.75f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(-27f)
            horizontalLineTo(12.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(10f, 14.69f, 10f, 14f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}
