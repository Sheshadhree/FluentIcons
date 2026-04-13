package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Directions20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Directions20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.877f, 2.879f)
            curveToRelative(1.171f, -1.172f, 3.07f, -1.172f, 4.242f, 0f)
            lineToRelative(4.998f, 4.998f)
            curveToRelative(1.172f, 1.171f, 1.172f, 3.07f, 0f, 4.242f)
            lineToRelative(-4.998f, 4.998f)
            curveToRelative(-1.171f, 1.172f, -3.07f, 1.172f, -4.242f, 0f)
            lineTo(2.879f, 12.12f)
            curveToRelative(-1.172f, -1.171f, -1.172f, -3.07f, 0f, -4.242f)
            lineTo(7.877f, 2.88f)
            close()
            moveToRelative(3.477f, 3.267f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(11.293f, 7.5f)
            horizontalLineTo(10f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(3f)
            curveTo(8f, 12.776f, 8.224f, 13f, 8.5f, 13f)
            reflectiveCurveTo(9f, 12.776f, 9f, 12.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.293f)
            lineToRelative(-0.647f, 0.646f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-1.5f, -1.5f)
            close()
        }
    }.build()
}
