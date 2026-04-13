package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Delete48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Delete48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 10.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            close()
            moveTo(17.5f, 11f)
            verticalLineToRelative(-0.5f)
            curveTo(17.5f, 6.91f, 20.41f, 4f, 24f, 4f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(11.25f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-2.917f)
            lineToRelative(-2f, 23.856f)
            curveTo(36.518f, 41.112f, 33.377f, 44f, 29.608f, 44f)
            horizontalLineTo(18.392f)
            curveToRelative(-3.769f, 0f, -6.91f, -2.888f, -7.224f, -6.644f)
            lineToRelative(-2f, -23.856f)
            horizontalLineTo(6.25f)
            curveTo(5.56f, 13.5f, 5f, 12.94f, 5f, 12.25f)
            reflectiveCurveTo(5.56f, 11f, 6.25f, 11f)
            horizontalLineTo(17.5f)
            close()
            moveToRelative(4f, 9.25f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveTo(19f, 19.56f, 19f, 20.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-14.5f)
            close()
            moveTo(27.75f, 19f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(29f, 35.44f, 29f, 34.75f)
            verticalLineToRelative(-14.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            close()
        }
    }.build()
}
