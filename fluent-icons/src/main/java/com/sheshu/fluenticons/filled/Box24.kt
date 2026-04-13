package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Box24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Box24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.409f, 2.513f)
            curveToRelative(-0.904f, -0.366f, -1.914f, -0.366f, -2.818f, 0f)
            lineToRelative(-2.19f, 0.888f)
            lineToRelative(9.592f, 3.73f)
            lineToRelative(3.374f, -1.303f)
            curveToRelative(-0.136f, -0.113f, -0.29f, -0.206f, -0.46f, -0.275f)
            lineToRelative(-7.498f, -3.04f)
            close()
            moveTo(22f, 7.191f)
            lineToRelative(-9.25f, 3.574f)
            verticalLineToRelative(10.923f)
            curveToRelative(0.224f, -0.045f, 0.444f, -0.112f, 0.659f, -0.199f)
            lineToRelative(7.498f, -3.04f)
            curveTo(21.567f, 18.181f, 22f, 17.54f, 22f, 16.827f)
            verticalLineTo(7.192f)
            close()
            moveTo(11.25f, 21.688f)
            verticalLineTo(10.765f)
            lineTo(2f, 7.191f)
            verticalLineToRelative(9.637f)
            curveToRelative(0f, 0.712f, 0.432f, 1.354f, 1.092f, 1.621f)
            lineToRelative(7.5f, 3.04f)
            curveToRelative(0.214f, 0.087f, 0.434f, 0.153f, 0.658f, 0.2f)
            close()
            moveTo(2.633f, 5.828f)
            lineTo(12f, 9.447f)
            lineToRelative(3.917f, -1.513f)
            lineToRelative(-9.543f, -3.712f)
            lineToRelative(-3.281f, 1.331f)
            curveToRelative(-0.17f, 0.069f, -0.324f, 0.162f, -0.46f, 0.275f)
            close()
        }
    }.build()
}
