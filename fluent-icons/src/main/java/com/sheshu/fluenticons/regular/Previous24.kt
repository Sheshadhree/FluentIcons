package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Previous24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Previous24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 4.753f)
            curveToRelative(0f, -1.408f, -1.578f, -2.24f, -2.74f, -1.444f)
            lineTo(7.763f, 10.503f)
            curveToRelative(-1.01f, 0.692f, -1.015f, 2.18f, -0.01f, 2.88f)
            lineToRelative(10.499f, 7.302f)
            curveTo(19.41f, 21.492f, 21f, 20.66f, 21f, 19.248f)
            verticalLineTo(4.753f)
            close()
            moveToRelative(-1.891f, -0.206f)
            curveToRelative(0.165f, -0.114f, 0.39f, 0.005f, 0.39f, 0.206f)
            verticalLineToRelative(14.495f)
            curveToRelative(0f, 0.202f, -0.226f, 0.32f, -0.392f, 0.205f)
            lineTo(8.61f, 12.152f)
            curveToRelative(-0.144f, -0.1f, -0.143f, -0.313f, 0.001f, -0.412f)
            lineTo(19.11f, 4.547f)
            close()
            moveTo(3f, 3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            reflectiveCurveTo(4.5f, 3.336f, 4.5f, 3.75f)
            verticalLineToRelative(16.5f)
            curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
            reflectiveCurveTo(3f, 20.664f, 3f, 20.25f)
            verticalLineTo(3.75f)
            close()
        }
    }.build()
}
