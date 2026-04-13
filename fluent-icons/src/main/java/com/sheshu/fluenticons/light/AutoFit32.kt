package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.AutoFit32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.AutoFit32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineToRelative(19f)
            curveTo(25.776f, 4f, 26f, 4.224f, 26f, 4.5f)
            reflectiveCurveTo(25.776f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-19f)
            curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
            close()
            moveToRelative(0f, 23f)
            curveTo(6f, 27.224f, 6.224f, 27f, 6.5f, 27f)
            horizontalLineToRelative(19f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(25.776f, 28f, 25.5f, 28f)
            horizontalLineToRelative(-19f)
            curveTo(6.224f, 28f, 6f, 27.776f, 6f, 27.5f)
            close()
            moveTo(16.854f, 7.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(16f, 8.707f)
            verticalLineToRelative(14.586f)
            lineToRelative(-3.646f, -3.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(4.5f, -4.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(17f, 23.293f)
            verticalLineTo(8.707f)
            lineToRelative(3.146f, 3.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-4f, -4f)
            close()
        }
    }.build()
}
