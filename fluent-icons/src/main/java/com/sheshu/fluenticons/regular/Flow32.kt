package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flow32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flow32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.5f, 6f)
            curveTo(26.433f, 6f, 28f, 7.567f, 28f, 9.5f)
            reflectiveCurveTo(26.433f, 13f, 24.5f, 13f)
            reflectiveCurveTo(21f, 11.433f, 21f, 9.5f)
            reflectiveCurveTo(22.567f, 6f, 24.5f, 6f)
            close()
            moveToRelative(-5.41f, 4.5f)
            curveToRelative(0.47f, 2.56f, 2.714f, 4.5f, 5.41f, 4.5f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(27.538f, 4f, 24.5f, 4f)
            curveToRelative(-2.696f, 0f, -4.94f, 1.94f, -5.41f, 4.5f)
            horizontalLineTo(19f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-0.09f)
            curveTo(12.44f, 18.94f, 10.195f, 17f, 7.5f, 17f)
            curveTo(4.462f, 17f, 2f, 19.462f, 2f, 22.5f)
            reflectiveCurveTo(4.462f, 28f, 7.5f, 28f)
            curveToRelative(2.696f, 0f, 4.94f, -1.94f, 5.41f, -4.5f)
            horizontalLineTo(13f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(0.09f)
            close()
            moveTo(11f, 22.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(4f, 24.433f, 4f, 22.5f)
            reflectiveCurveTo(5.567f, 19f, 7.5f, 19f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
        }
    }.build()
}
