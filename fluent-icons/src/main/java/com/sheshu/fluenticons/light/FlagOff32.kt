package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.FlagOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.FlagOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(5f, 5.707f)
            verticalLineTo(28.5f)
            curveTo(5f, 28.776f, 5.224f, 29f, 5.5f, 29f)
            reflectiveCurveTo(6f, 28.776f, 6f, 28.5f)
            verticalLineTo(21f)
            horizontalLineToRelative(14.293f)
            lineToRelative(8.853f, 8.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-27f, -27f)
            close()
            moveTo(19.294f, 20f)
            horizontalLineTo(6f)
            verticalLineTo(6.707f)
            lineTo(19.293f, 20f)
            close()
            moveToRelative(9.207f, 1f)
            horizontalLineToRelative(-5.732f)
            lineToRelative(-1f, -1f)
            horizontalLineToRelative(5.72f)
            lineToRelative(-5.885f, -7.696f)
            curveToRelative(-0.137f, -0.18f, -0.137f, -0.428f, 0f, -0.608f)
            lineTo(27.488f, 4f)
            horizontalLineTo(6.5f)
            curveTo(6.302f, 4f, 6.13f, 4.115f, 6.05f, 4.282f)
            lineToRelative(-0.72f, -0.72f)
            curveTo(5.604f, 3.219f, 6.027f, 3f, 6.5f, 3f)
            horizontalLineToRelative(22f)
            curveToRelative(0.19f, 0f, 0.364f, 0.108f, 0.448f, 0.279f)
            curveToRelative(0.084f, 0.17f, 0.065f, 0.374f, -0.05f, 0.525f)
            lineTo(22.628f, 12f)
            lineToRelative(6.268f, 8.196f)
            curveToRelative(0.116f, 0.151f, 0.136f, 0.355f, 0.051f, 0.525f)
            curveTo(28.864f, 20.892f, 28.69f, 21f, 28.5f, 21f)
            close()
        }
    }.build()
}
