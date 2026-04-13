package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(4f, 4.707f)
            verticalLineTo(17.5f)
            curveTo(4f, 17.776f, 4.224f, 18f, 4.5f, 18f)
            reflectiveCurveTo(5f, 17.776f, 5f, 17.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(7.293f)
            lineToRelative(4.853f, 4.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(16.5f, 13f)
            horizontalLineToRelative(-1.379f)
            lineToRelative(-10f, -10f)
            horizontalLineTo(16.5f)
            curveToRelative(0.4f, 0f, 0.637f, 0.445f, 0.416f, 0.777f)
            lineTo(14.101f, 8f)
            lineToRelative(2.815f, 4.223f)
            curveTo(17.137f, 12.555f, 16.899f, 13f, 16.5f, 13f)
            close()
        }
    }.build()
}
