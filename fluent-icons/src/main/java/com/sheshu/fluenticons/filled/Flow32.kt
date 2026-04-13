package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flow32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flow32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.09f, 10.5f)
            horizontalLineTo(19f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-0.09f)
            curveTo(12.44f, 26.06f, 10.195f, 28f, 7.5f, 28f)
            curveTo(4.462f, 28f, 2f, 25.538f, 2f, 22.5f)
            reflectiveCurveTo(4.462f, 17f, 7.5f, 17f)
            curveToRelative(2.696f, 0f, 4.94f, 1.94f, 5.41f, 4.5f)
            horizontalLineTo(13f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(0.09f)
            curveTo(19.56f, 5.94f, 21.805f, 4f, 24.5f, 4f)
            curveTo(27.538f, 4f, 30f, 6.462f, 30f, 9.5f)
            reflectiveCurveTo(27.538f, 15f, 24.5f, 15f)
            curveToRelative(-2.696f, 0f, -4.94f, -1.94f, -5.41f, -4.5f)
            close()
        }
    }.build()
}
