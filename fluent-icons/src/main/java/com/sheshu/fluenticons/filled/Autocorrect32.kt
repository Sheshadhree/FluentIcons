package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Autocorrect32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Autocorrect32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.165f, 7.903f)
            curveToRelative(0.395f, -0.6f, 1.276f, -0.6f, 1.67f, 0f)
            lineTo(20.187f, 13f)
            horizontalLineTo(19.5f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
            curveToRelative(0f, -1.206f, -0.328f, -2.335f, -0.9f, -3.302f)
            lineToRelative(-0.04f, -0.075f)
            lineToRelative(-0.371f, -0.623f)
            horizontalLineToRelative(4.061f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(29.44f, 13f, 28.75f, 13f)
            horizontalLineToRelative(-5.572f)
            lineToRelative(-4.253f, -6.47f)
            curveToRelative(-1.383f, -2.103f, -4.467f, -2.103f, -5.85f, 0f)
            lineTo(2.206f, 23.065f)
            curveToRelative(-0.379f, 0.577f, -0.218f, 1.352f, 0.358f, 1.731f)
            curveToRelative(0.577f, 0.38f, 1.352f, 0.22f, 1.732f, -0.358f)
            lineToRelative(10.87f, -16.535f)
            close()
            moveTo(15.5f, 19.5f)
            curveToRelative(0f, -2.21f, 1.791f, -4f, 4f, -4f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            curveToRelative(-2.209f, 0f, -4f, -1.79f, -4f, -4f)
            close()
        }
    }.build()
}
