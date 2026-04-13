package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.AutoFitWidth32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.AutoFitWidth32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 6f)
            curveTo(4.776f, 6f, 5f, 6.224f, 5f, 6.5f)
            verticalLineToRelative(19f)
            curveTo(5f, 25.776f, 4.776f, 26f, 4.5f, 26f)
            reflectiveCurveTo(4f, 25.776f, 4f, 25.5f)
            verticalLineToRelative(-19f)
            curveTo(4f, 6.224f, 4.224f, 6f, 4.5f, 6f)
            close()
            moveToRelative(23f, 0f)
            curveTo(27.776f, 6f, 28f, 6.224f, 28f, 6.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(27f, 25.776f, 27f, 25.5f)
            verticalLineToRelative(-19f)
            curveTo(27f, 6.224f, 27.224f, 6f, 27.5f, 6f)
            close()
            moveToRelative(-7.854f, 4.646f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.707f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineTo(23.293f, 16f)
            horizontalLineTo(8.707f)
            lineToRelative(3.146f, 3.146f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0f)
            lineToRelative(-4f, -4f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(4f, -4f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.707f)
            lineTo(8.707f, 15f)
            horizontalLineToRelative(14.586f)
            lineToRelative(-3.646f, -3.646f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
